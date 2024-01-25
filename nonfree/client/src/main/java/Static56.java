import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt973;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method975(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!oi;I)V")
	public static void method976(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anIntArray399 == null && arg0.anIntArray398 == null) {
			return;
		}
		@Pc(24) boolean local24 = true;
		for (@Pc(26) int local26 = 0; local26 < arg0.anIntArray399.length; local26++) {
			@Pc(32) int local32 = -1;
			if (arg0.anIntArray399 != null) {
				local32 = arg0.anIntArray399[local26];
			}
			if (local32 != -1) {
				local24 = false;
				@Pc(89) int local89;
				@Pc(102) int local102;
				@Pc(70) int local70;
				if ((-1073741824 & local32) == -1073741824) {
					local70 = local32 & 0xFFFFFFF;
					@Pc(74) int local74 = local70 >> 14;
					@Pc(78) int local78 = local70 & 0x3FFF;
					local89 = arg0.anInt9805 - (local74 - Static315.anInt5380) * 512 - 256;
					local102 = arg0.anInt9803 - (local78 + -Static290.anInt5128) * 512 - 256;
				} else if ((local32 & 0x8000) == 0) {
					@Pc(155) Class5_Sub9 local155 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local32);
					if (local155 == null) {
						arg0.method5926(local26, -1);
						continue;
					}
					@Pc(170) Class4_Sub1_Sub1_Sub2_Sub2 local170 = local155.aClass4_Sub1_Sub1_Sub2_Sub2_1;
					local102 = arg0.anInt9803 - local170.anInt9803;
					local89 = arg0.anInt9805 - local170.anInt9805;
				} else {
					local70 = local32 & 0x7FFF;
					@Pc(121) Class4_Sub1_Sub1_Sub2_Sub1 local121 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local70];
					if (local121 == null) {
						arg0.method5926(local26, -1);
						continue;
					}
					local102 = arg0.anInt9803 - local121.anInt9803;
					local89 = arg0.anInt9805 - local121.anInt9805;
				}
				if (local89 != 0 || local102 != 0) {
					arg0.method5926(local26, (int) (Math.atan2((double) local89, (double) local102) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method5926(local26, -1)) {
				local24 = false;
			}
		}
		if (local24) {
			arg0.anIntArray399 = null;
			arg0.anIntArray398 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public static boolean method977() {
		return Static651.anInt10662 > 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!ega;)I")
	public static int method982(@OriginalArg(1) Class93 arg0) {
		if (arg0 == Static94.aClass93_2) {
			return 5890;
		} else if (arg0 == Static89.aClass93_1) {
			return 34167;
		} else if (arg0 == Static237.aClass93_3) {
			return 34168;
		} else if (Static520.aClass93_4 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
