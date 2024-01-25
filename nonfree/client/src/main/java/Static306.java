import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	public static int anInt5020 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method4187(@OriginalArg(0) int arg0) {
		Static324.anInt5879 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static347.anInt6411; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static191.anInt6006; local6++) {
				if (Static440.aClass217ArrayArrayArray3[arg0][local3][local6] == null) {
					Static440.aClass217ArrayArrayArray3[arg0][local3][local6] = new Class217(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4189(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)V")
	public static void method4190() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static276.aBooleanArray32[local1] = false;
		}
		Static644.anInt10296 = -1;
		Static23.anInt718 = -1;
		Static389.anInt6998 = Static395.anInt3530;
		Static66.anInt1398 = Static53.anInt1153;
		Static575.anInt9508 = Static105.anInt2114;
		Static515.anInt8629 = Static325.anInt5888;
		Static259.anInt5081 = 0;
		Static55.anInt1161 = Static512.anInt8589;
		Static144.anInt3307 = -1;
		Static160.anInt3633 = -1;
		Static314.anInt5696 = Static64.anInt1371;
		Static126.anInt2936 = 0;
		Static2.anInt31 = 5;
	}
}
