import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!qg;")
	public static Class131 aClass131_24 = new Class131();

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int anInt5333 = 0;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[F")
	public static float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)I")
	public static int method4187(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(29) int local29 = (local19 >>> 2 & 0xB3333333) + (local19 & 0x33333333);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIII)V")
	public static void method4189(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static223.anInt1245 = arg1;
		Static102.anInt2239 = 0;
		Static88.anInt2052 = arg0;
		Static152.anInt3532 = 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public static void method4190() {
		Static263.aClass155_43.method4354();
		Static200.aClass155_32.method4354();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	public static void method4191() {
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				if (Static253.method4311(local17, local24, true, local11, Static132.aClass1_Sub14ArrayArrayArray2)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public static void method4192() {
		Static188.aClass1_Sub2_Sub14_4 = null;
		Static38.aClass1_Sub2_Sub14_1 = null;
		Static217.aClass1_Sub2_Sub14_6 = null;
		Static156.aClass1_Sub2_Sub14_3 = null;
		Static270.aClass1_Sub2_Sub14_10 = null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public static void method4193(@OriginalArg(1) int arg0) {
		Static206.anInt4587 = -1;
		Static206.anInt4587 = -1;
		if (arg0 == 37) {
			Static105.aFloat200 = 3.0F;
		} else if (arg0 == 50) {
			Static105.aFloat200 = 4.0F;
		} else if (arg0 == 75) {
			Static105.aFloat200 = 6.0F;
		} else if (arg0 == 100) {
			Static105.aFloat200 = 8.0F;
		} else if (arg0 == 200) {
			Static105.aFloat200 = 16.0F;
		}
	}
}
