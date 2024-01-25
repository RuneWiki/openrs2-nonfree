import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
	public static int anInt9539;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "Lclient!k;")
	public static final Class187 aClass187_14 = new Class187("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "Z")
	public static boolean aBoolean805 = false;

	@OriginalMember(owner = "client!tw", name = "m", descriptor = "[[F")
	public static final float[][] aFloatArrayArray16 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method8022(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static273.method4247(local6.width, local6.height);
		if (Static1.anInt9943 == 1) {
			Static374.aClass65_12.method6928(arg0, Static193.anInt3732, Static206.anInt3873);
		} else {
			Static374.aClass65_12.method6928(arg0, Static154.anInt3151, Static513.anInt8561);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	public static void method8023() {
		Static414.anInt7336 = Static299.aClass247_11.anInt6974 + Static299.aClass247_11.anInt6966 + 2;
		Static352.aStringArray61 = new String[500];
		Static123.anInt2501 = Static247.aClass247_16.anInt6974 + Static247.aClass247_16.anInt6966 + 2;
		for (@Pc(25) int local25 = 0; local25 < Static352.aStringArray61.length; local25++) {
			Static352.aStringArray61[local25] = "";
		}
		Static574.method7927(Static64.aClass52_1.method907(Static544.anInt8937));
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[Lclient!dg;")
	public static Class81[] method8024() {
		return new Class81[] { Static663.aClass81_18, Static564.aClass81_15, Static549.aClass81_16 };
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	public static void method8025(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub3_Sub17 local15 = Static358.method5408(7, (long) arg0);
		local15.method7288();
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8027(@OriginalArg(0) Class65 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static66.aBoolean570) {
			local7 = Static106.method2037();
			local9 = Static660.method8815();
		}
		@Pc(21) int local21 = Static477.anInt8042 + local7;
		@Pc(25) int local25 = local9 + Static542.anInt6468;
		@Pc(27) int local27 = Static633.anInt10304;
		@Pc(36) int local36 = Static54.anInt805 - 3;
		Static193.method3201(Static633.anInt10304, arg0, local7 + Static477.anInt8042, Static64.aClass52_24.method907(Static544.anInt8937), Static542.anInt6468 + local9, Static54.anInt805);
		@Pc(61) int local61 = Static359.aClass11_1.method6141() + local7;
		@Pc(67) int local67 = local9 + Static359.aClass11_1.method6144();
		@Pc(71) int local71;
		@Pc(76) Class5_Sub3_Sub20 local76;
		@Pc(92) int local92;
		@Pc(266) int local266;
		@Pc(155) Class5_Sub3_Sub15 local155;
		@Pc(254) Class5_Sub3_Sub20 local254;
		if (Static364.aBoolean585) {
			local71 = 0;
			for (local155 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local155 != null; local155 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
				local92 = local25 + local71 * 16 + 33;
				if (local7 + Static477.anInt8042 < local61 && Static633.anInt10304 + Static477.anInt8042 + local7 > local61 && local67 > local92 - 13 && local92 + 4 > local67 && (local155.anInt8017 > 1 || ((Class5_Sub3_Sub20) local155.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66).aBoolean870)) {
					arg0.aa(Static477.anInt8042 + local7, local92 - 12, Static633.anInt10304, 16, Static385.anInt6838 | 255 - Static598.anInt9819 << 24, 1);
				}
				local71++;
			}
			if (Static345.aClass5_Sub3_Sub15_1 != null) {
				local71 = 0;
				Static193.method3201(Static260.anInt4826, arg0, Static556.anInt9088, Static345.aClass5_Sub3_Sub15_1.aString76, Static220.anInt4457, Static469.anInt7914);
				for (local254 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8322(); local254 != null; local254 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8328()) {
					local266 = Static220.anInt4457 + local71 * 16 + 20 + 13;
					local71++;
					if (local61 > Static556.anInt9088 && Static260.anInt4826 + Static556.anInt9088 > local61 && local67 > local266 - 13 && local266 + 4 > local67 && local254.aBoolean870) {
						arg0.aa(Static556.anInt9088, local266 - 12, Static260.anInt4826, 16, Static385.anInt6838 | 255 - Static598.anInt9819 << 24, 1);
					}
				}
				Static27.method338(Static260.anInt4826, Static556.anInt9088, arg0, Static220.anInt4457, Static469.anInt7914);
			}
		} else {
			local71 = 0;
			for (local76 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local76 != null; local76 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				local92 = (Static483.anInt8099 - local71 - 1) * 16 + local25 + 13 + 20;
				if (local61 > local7 + Static477.anInt8042 && Static477.anInt8042 + local7 + Static633.anInt10304 > local61 && local92 - 13 < local67 && local67 < local92 + 4 && local76.aBoolean870) {
					arg0.aa(Static477.anInt8042 + local7, local92 + -12, Static633.anInt10304, 16, Static385.anInt6838 | 255 - Static598.anInt9819 << 24, 1);
				}
				local71++;
			}
		}
		Static27.method338(Static633.anInt10304, local7 + Static477.anInt8042, arg0, local9 + Static542.anInt6468, Static54.anInt805);
		if (Static364.aBoolean585) {
			local71 = 0;
			for (local155 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local155 != null; local155 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
				local92 = local71 * 16 + local9 + Static542.anInt6468 + 20 + 13;
				local71++;
				if (local155.anInt8017 == 1) {
					Static642.method8658(Static477.anInt8042 + local7, Static54.anInt805, (Class5_Sub3_Sub20) local155.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66, local61, Static633.anInt10304, Static507.anInt8519 | 0xFF000000, local92, Static542.anInt6468 + local9, Static311.anInt5917 | 0xFF000000, local67, arg0);
				} else {
					Static368.method5562(arg0, Static633.anInt10304, Static311.anInt5917 | 0xFF000000, Static507.anInt8519 | 0xFF000000, local92, Static542.anInt6468 + local9, local155, Static54.anInt805, local67, local61, local7 + Static477.anInt8042);
				}
			}
			if (Static345.aClass5_Sub3_Sub15_1 != null) {
				local71 = 0;
				for (local254 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8322(); local254 != null; local254 = (Class5_Sub3_Sub20) Static345.aClass5_Sub3_Sub15_1.aClass358_7.method8328()) {
					local266 = Static220.anInt4457 + local71 * 16 + 20 + 13;
					local71++;
					Static642.method8658(Static556.anInt9088, Static469.anInt7914, local254, local61, Static260.anInt4826, Static507.anInt8519 | 0xFF000000, local266, Static220.anInt4457, Static311.anInt5917 | 0xFF000000, local67, arg0);
				}
				Static551.method7649(Static220.anInt4457, Static260.anInt4826, Static469.anInt7914, Static556.anInt9088);
			}
		} else {
			local71 = 0;
			for (local76 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local76 != null; local76 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				local92 = local25 + (Static483.anInt8099 - 1 + -local71) * 16 + 20 + 13;
				local71++;
				Static642.method8658(local21, local36, local76, local61, local27, Static507.anInt8519 | 0xFF000000, local92, local25, Static311.anInt5917 | 0xFF000000, local67, arg0);
			}
		}
		Static551.method7649(Static542.anInt6468 + local9, Static633.anInt10304, Static54.anInt805, local7 + Static477.anInt8042);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([Lclient!lq;II)V")
	public static void method8030(@OriginalArg(0) Class28_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class28_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10777;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10777 > local27 + (local29 & 0x1)) {
				@Pc(44) Class28_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method8030(arg0, arg1, local10 - 1);
		method8030(arg0, local10 + 1, arg2);
	}
}
