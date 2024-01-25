import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZI)V")
	public static void method3285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static327.aFloat31 > Static327.aFloat32) {
			Static327.aFloat32 = (float) ((double) Static327.aFloat32 + (double) Static327.aFloat32 / 30.0D);
			if (Static327.aFloat31 < Static327.aFloat32) {
				Static327.aFloat32 = Static327.aFloat31;
			}
			Static400.method5406();
			Static327.anInt1072 = (int) Static327.aFloat32 >> 1;
			Static327.aByteArrayArrayArray2 = Static179.method2871(Static327.anInt1072);
		} else if (Static327.aFloat31 < Static327.aFloat32) {
			Static327.aFloat32 = (float) ((double) Static327.aFloat32 - (double) Static327.aFloat32 / 30.0D);
			if (Static327.aFloat31 > Static327.aFloat32) {
				Static327.aFloat32 = Static327.aFloat31;
			}
			Static400.method5406();
			Static327.anInt1072 = (int) Static327.aFloat32 >> 1;
			Static327.aByteArrayArrayArray2 = Static179.method2871(Static327.anInt1072);
		}
		if (Static614.anInt9290 != -1 && Static531.anInt8269 != -1) {
			@Pc(97) int local97 = Static614.anInt9290 - Static550.anInt8467;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			@Pc(116) int local116 = Static531.anInt8269 - Static90.anInt4562;
			Static550.anInt8467 += local97;
			if (local116 < 2 || local116 > 2) {
				local116 /= 8;
			}
			if (local97 == 0 && local116 == 0) {
				Static531.anInt8269 = -1;
				Static614.anInt9290 = -1;
			}
			Static90.anInt4562 -= -local116;
			Static400.method5406();
		}
		if (Static412.anInt6360 <= 0) {
			Static270.anInt4162 = -1;
			Static496.anInt7889 = -1;
		} else {
			Static489.anInt10872--;
			if (Static489.anInt10872 == 0) {
				Static489.anInt10872 = 100;
				Static412.anInt6360--;
			}
		}
		if (!Static570.aBoolean582 || Static654.aClass342_80 == null) {
			return;
		}
		for (@Pc(197) Class3_Sub10 local197 = (Class3_Sub10) Static654.aClass342_80.method7644(); local197 != null; local197 = (Class3_Sub10) Static654.aClass342_80.method7650()) {
			@Pc(206) Class198 local206 = Static327.aClass111_2.method2739(local197.aClass3_Sub48_1.anInt8050);
			if (local197.method1238(arg0, arg1)) {
				if (local206.aStringArray21 != null) {
					if (local206.aStringArray21[4] != null) {
						Static283.method4000(0, local206.aStringArray21[4], true, (long) local197.aClass3_Sub48_1.anInt8050, -1, -1, false, local206.anInt5135, local206.aString63, 1003, (long) local197.aClass3_Sub48_1.anInt8050, false);
					}
					if (local206.aStringArray21[3] != null) {
						Static283.method4000(0, local206.aStringArray21[3], true, (long) local197.aClass3_Sub48_1.anInt8050, -1, -1, false, local206.anInt5135, local206.aString63, 1008, (long) local197.aClass3_Sub48_1.anInt8050, false);
					}
					if (local206.aStringArray21[2] != null) {
						Static283.method4000(0, local206.aStringArray21[2], true, (long) local197.aClass3_Sub48_1.anInt8050, -1, -1, false, local206.anInt5135, local206.aString63, 1012, (long) local197.aClass3_Sub48_1.anInt8050, false);
					}
					if (local206.aStringArray21[1] != null) {
						Static283.method4000(0, local206.aStringArray21[1], true, (long) local197.aClass3_Sub48_1.anInt8050, -1, -1, false, local206.anInt5135, local206.aString63, 1009, (long) local197.aClass3_Sub48_1.anInt8050, false);
					}
					if (local206.aStringArray21[0] != null) {
						Static283.method4000(0, local206.aStringArray21[0], true, (long) local197.aClass3_Sub48_1.anInt8050, -1, -1, false, local206.anInt5135, local206.aString63, 1001, (long) local197.aClass3_Sub48_1.anInt8050, false);
					}
				}
				if (!local197.aClass3_Sub48_1.aBoolean541) {
					local197.aClass3_Sub48_1.aBoolean541 = true;
					Static540.method7162(Static210.aClass78_5, local197.aClass3_Sub48_1.anInt8050, local206.anInt5135);
				}
				if (local197.aClass3_Sub48_1.aBoolean541) {
					Static540.method7162(Static657.aClass78_14, local197.aClass3_Sub48_1.anInt8050, local206.anInt5135);
				}
			} else if (local197.aClass3_Sub48_1.aBoolean541) {
				local197.aClass3_Sub48_1.aBoolean541 = false;
				Static540.method7162(Static165.aClass78_4, local197.aClass3_Sub48_1.anInt8050, local206.anInt5135);
			}
		}
	}
}
