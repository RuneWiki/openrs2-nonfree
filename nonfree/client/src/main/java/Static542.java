import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
	public static int anInt9093 = 0;

	@OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
	public static int anInt9094 = 0;

	@OriginalMember(owner = "client!uv", name = "L", descriptor = "Lclient!em;")
	public static final Class83 aClass83_197 = new Class83(36, 9);

	@OriginalMember(owner = "client!uv", name = "N", descriptor = "[I")
	public static int[] anIntArray572 = new int[1];

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ls;I)V")
	public static void method7383(@OriginalArg(0) Class11_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray451 == null && arg0.anIntArray453 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray451.length; local16++) {
			@Pc(25) int local25 = -1;
			if (arg0.anIntArray451 != null) {
				local25 = arg0.anIntArray451[local16];
			}
			if (local25 != -1) {
				local14 = false;
				@Pc(101) int local101;
				@Pc(94) int local94;
				@Pc(71) int local71;
				if ((local25 & 0xC0000000) == -1073741824) {
					local71 = local25 & 0xFFFFFFF;
					@Pc(149) int local149 = local71 >> 14;
					local101 = arg0.anInt8902 - (local149 - Static539.anInt9045) * 512 - 256;
					@Pc(164) int local164 = local71 & 0x3FFF;
					local94 = arg0.anInt8906 - (local164 - Static311.anInt5708) * 512 - 256;
				} else if ((local25 & 0x8000) == 0) {
					@Pc(110) Class1_Sub33 local110 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local25);
					if (local110 == null) {
						arg0.method6067(local16, -1);
						continue;
					}
					@Pc(125) Class11_Sub1_Sub1_Sub3_Sub2 local125 = local110.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					local94 = arg0.anInt8906 - local125.anInt8906;
					local101 = arg0.anInt8902 - local125.anInt8902;
				} else {
					local71 = local25 & 0x7FFF;
					@Pc(75) Class11_Sub1_Sub1_Sub3_Sub1 local75 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local71];
					if (local75 == null) {
						arg0.method6067(local16, -1);
						continue;
					}
					local94 = arg0.anInt8906 - local75.anInt8906;
					local101 = arg0.anInt8902 - local75.anInt8902;
				}
				if (local101 != 0 || local94 != 0) {
					arg0.method6067(local16, (int) (Math.atan2((double) local101, (double) local94) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method6067(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray453 = null;
			arg0.anIntArray451 = null;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!js;II)V")
	public static void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub4 local15 = (Class1_Sub4) Static592.aClass111_65.method2547(); local15 != null; local15 = (Class1_Sub4) Static592.aClass111_65.method2554()) {
			if (arg1 == local15.anInt232 && local15.anInt238 == arg3 << 9 && arg0 << 9 == local15.anInt225 && arg2.anInt4643 == local15.aClass178_1.anInt4643) {
				if (local15.aClass1_Sub6_Sub4_1 != null) {
					Static425.aClass1_Sub6_Sub3_2.method6532(local15.aClass1_Sub6_Sub4_1);
					local15.aClass1_Sub6_Sub4_1 = null;
				}
				if (local15.aClass1_Sub6_Sub4_2 != null) {
					Static425.aClass1_Sub6_Sub3_2.method6532(local15.aClass1_Sub6_Sub4_2);
					local15.aClass1_Sub6_Sub4_2 = null;
				}
				local15.method7908();
				return;
			}
		}
	}
}
