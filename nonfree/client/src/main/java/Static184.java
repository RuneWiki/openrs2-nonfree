import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_11;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lclient!da;")
	public static Class33[] aClass33Array1 = new Class33[6];

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray14 = new byte[250][];

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public static int anInt4054 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2978(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static297.aStringArray47.length; local14++) {
			if (Static297.aStringArray47[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!th;I)V")
	public static void method2979(@OriginalArg(0) Class168 arg0) {
		Static171.aClass168_126 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2981() {
		Static209.aClass89_31.method2265();
		Static185.aClass89_26.method2265();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public static void method2982() {
		if (Static268.aFloat34 < Static268.aFloat35) {
			Static268.aFloat34 = (float) ((double) Static268.aFloat34 + (double) Static268.aFloat34 / 30.0D);
			if (Static268.aFloat35 < Static268.aFloat34) {
				Static268.aFloat34 = Static268.aFloat35;
			}
			Static278.method4757();
		} else if (Static268.aFloat34 > Static268.aFloat35) {
			Static268.aFloat34 = (float) ((double) Static268.aFloat34 - (double) Static268.aFloat34 / 30.0D);
			if (Static268.aFloat34 < Static268.aFloat35) {
				Static268.aFloat34 = Static268.aFloat35;
			}
			Static278.method4757();
		}
		if (Static207.anInt4464 != -1 && Static202.anInt4408 != -1) {
			@Pc(65) int local65 = Static207.anInt4464 - Static109.anInt2414;
			if (local65 < 2 || local65 > 2) {
				local65 >>= 0x4;
			}
			Static109.anInt2414 += local65;
			@Pc(86) int local86 = Static202.anInt4408 - Static299.anInt5944;
			if (local86 < 2 || local86 > 2) {
				local86 >>= 0x4;
			}
			Static299.anInt5944 -= -local86;
			if (local65 == 0 && local86 == 0) {
				Static202.anInt4408 = -1;
				Static207.anInt4464 = -1;
			}
			Static278.method4757();
		}
		if (Static11.anInt308 <= 0) {
			Static186.anInt4091 = -1;
			Static170.anInt3807 = -1;
		} else {
			Static48.anInt1149--;
			if (Static48.anInt1149 == 0) {
				Static11.anInt308--;
				Static48.anInt1149 = 100;
			}
		}
		if (!Static25.aBoolean38 || Static315.aClass26_62 == null) {
			return;
		}
		for (@Pc(159) Class1_Sub31 local159 = (Class1_Sub31) Static315.aClass26_62.method666(); local159 != null; local159 = (Class1_Sub31) Static315.aClass26_62.method672()) {
			@Pc(167) Class107 local167 = Static173.method2819(local159.aClass1_Sub3_Sub11_1.anInt3104);
			if (Static47.anInt1141 == 0 && local159.method4685(Static89.anInt5974, Static289.anInt5816)) {
				if (!local159.aClass1_Sub3_Sub11_1.aBoolean192) {
					local159.aClass1_Sub3_Sub11_1.aBoolean192 = true;
					Static87.method1507(local159.aClass1_Sub3_Sub11_1.anInt3104, 15, local167.anInt3787);
				}
				if (local159.aClass1_Sub3_Sub11_1.aBoolean192) {
					Static87.method1507(local159.aClass1_Sub3_Sub11_1.anInt3104, 17, local167.anInt3787);
				}
			} else if (local159.aClass1_Sub3_Sub11_1.aBoolean192) {
				local159.aClass1_Sub3_Sub11_1.aBoolean192 = false;
				Static87.method1507(local159.aClass1_Sub3_Sub11_1.anInt3104, 16, local167.anInt3787);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZII)V")
	public static void method2983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1002) {
			Static87.method1507(arg0, 10, arg1);
		} else if (arg2 == 1006) {
			Static87.method1507(arg0, 11, arg1);
		} else if (arg2 == 1007) {
			Static87.method1507(arg0, 12, arg1);
		} else if (arg2 == 1012) {
			Static87.method1507(arg0, 13, arg1);
		} else if (arg2 == 1011) {
			Static87.method1507(arg0, 14, arg1);
		}
	}
}
