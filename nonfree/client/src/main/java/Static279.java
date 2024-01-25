import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "Lclient!kd;")
	public static Class190 aClass190_2;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "Z")
	public static boolean aBoolean393 = true;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_60 = new Class61(66, -1);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BII)I")
	public static int method4429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static385.anInt6801 == -1) {
			return 1;
		}
		if (arg1 != Static403.anInt6994) {
			Static543.method7532(Static275.aClass198_12.method4407(Static56.anInt953), arg1);
			if (Static403.anInt6994 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static379.aCanvas13.getSize();
			Static433.method6141(Static275.aClass198_12.method4407(Static56.anInt953), true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
			@Pc(48) Class266 local48 = Static329.method4945(Static436.aClass31_97, Static385.anInt6801);
			@Pc(51) long local51 = Static184.method3422();
			Static185.aClass66_14.F();
			Static488.aClass134_6.GA(0, Static436.anInt7494, 0);
			Static185.aClass66_14.method6823(Static488.aClass134_6);
			Static185.aClass66_14.m(local32.width / 2, local32.height / 2, 512, 512);
			Static185.aClass66_14.ha(1.0F);
			Static185.aClass66_14.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(92) Class9 local92 = Static185.aClass66_14.method6779(local48, 2048, 64, 64, 768);
			@Pc(94) int local94 = 0;
			label41: for (@Pc(96) int local96 = 0; local96 < 500; local96++) {
				Static185.aClass66_14.D(0);
				Static185.aClass66_14.method6795();
				for (@Pc(105) int local105 = 15; local105 >= 0; local105--) {
					for (@Pc(109) int local109 = 0; local109 <= local105; local109++) {
						Static186.aClass134_4.GA((int) ((float) Static514.anInt8839 * (-((float) local105 / 2.0F) + (float) local109)), 0, (local105 + 1) * Static514.anInt8839);
						local92.method4023(Static186.aClass134_4, null, 0);
						local94++;
						if ((long) arg0 <= Static184.method3422() - local51) {
							break label41;
						}
					}
				}
			}
			Static185.aClass66_14.method6790();
			@Pc(185) long local185 = (long) (local94 * 1000) / (Static184.method3422() - local51);
			Static185.aClass66_14.D(0);
			Static185.aClass66_14.method6795();
			return (int) local185;
		} catch (@Pc(194) Throwable local194) {
			local194.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)Lclient!gba;")
	public static Class115 method4432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class115 local15 = Static92.method2118(arg0);
		if (arg1 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass115Array1 == null || local15.aClass115Array1.length <= arg1) {
			return null;
		} else {
			return local15.aClass115Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Lclient!fba;")
	public static Class100 method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static309.aClass100ArrayArrayArray2[0][arg1][arg2] != null && Static309.aClass100ArrayArrayArray2[0][arg1][arg2].aClass100_1 != null;
			if (local28 && arg0 >= Static562.anInt9418 - 1) {
				return null;
			}
			Static568.method7794(arg0, arg1, arg2);
		}
		return Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method4434(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static209.method7917(-1, -1, arg0, arg1);
	}
}
