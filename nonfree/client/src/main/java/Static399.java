import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "[I")
	public static int[] anIntArray658;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	public static int anInt6746;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	public static int anInt6747;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "Lclient!os;")
	public static final Class182 aClass182_230 = new Class182("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt6748 = 0;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[I")
	public static final int[] anIntArray659 = new int[2];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZII)I")
	public static int method5281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static448.anIntArray681[arg0 & 0x3] : Static51.anIntArray75[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method5282() {
		Static14.aBoolean18 = false;
		Static83.aClipboard1 = null;
		Static448.method5473();
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public static void method5284() {
		if (Static268.anInt4867 == 0) {
			return;
		}
		try {
			if (++Static284.anInt4990 > 2000) {
				if (Static160.aClass253_3 != null) {
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
				}
				if (Static241.anInt4381 >= 1) {
					Static268.anInt4867 = 0;
					Static113.anInt2280 = -5;
					return;
				}
				Static410.aClass21_5.aBoolean34 = !Static410.aClass21_5.aBoolean34;
				Static284.anInt4990 = 0;
				Static241.anInt4381++;
				Static268.anInt4867 = 1;
			}
			if (Static268.anInt4867 == 1) {
				Static42.aClass270_1 = Static171.aClass159_1.method3518(Static410.aClass21_5.method330(), Static410.aClass21_5.aString5);
				Static268.anInt4867 = 2;
			}
			@Pc(117) int local117;
			if (Static268.anInt4867 == 2) {
				if (Static42.aClass270_1.anInt7548 == 2) {
					throw new IOException();
				}
				if (Static42.aClass270_1.anInt7548 != 1) {
					return;
				}
				Static160.aClass253_3 = new Class253((Socket) Static42.aClass270_1.anObject9, Static171.aClass159_1);
				Static42.aClass270_1 = null;
				Static160.aClass253_3.method5494(Static337.aClass10_Sub8_Sub2_2.anInt2989, Static337.aClass10_Sub8_Sub2_2.aByteArray44);
				Static67.method1250();
				local117 = Static160.aClass253_3.method5493();
				Static67.method1250();
				if (local117 != 21) {
					Static113.anInt2280 = local117;
					Static268.anInt4867 = 0;
					Static160.aClass253_3.method5484();
					Static160.aClass253_3 = null;
					return;
				}
				Static268.anInt4867 = 3;
			}
			if (Static268.anInt4867 == 3) {
				if (Static160.aClass253_3.method5486() < 1) {
					return;
				}
				Static190.aStringArray28 = new String[Static160.aClass253_3.method5493()];
				Static268.anInt4867 = 4;
			}
			if (Static268.anInt4867 == 4 && Static160.aClass253_3.method5486() >= Static190.aStringArray28.length * 8) {
				Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
				Static160.aClass253_3.method5487(0, Static190.aStringArray28.length * 8, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
				for (local117 = 0; local117 < Static190.aStringArray28.length; local117++) {
					Static190.aStringArray28[local117] = Static330.method1927(Static203.aClass10_Sub8_Sub2_1.method2521());
				}
				Static113.anInt2280 = 21;
				Static268.anInt4867 = 0;
				Static160.aClass253_3.method5484();
				Static160.aClass253_3 = null;
			}
		} catch (@Pc(213) IOException local213) {
			if (Static160.aClass253_3 != null) {
				Static160.aClass253_3.method5484();
				Static160.aClass253_3 = null;
			}
			if (Static241.anInt4381 >= 1) {
				Static268.anInt4867 = 0;
				Static113.anInt2280 = -4;
			} else {
				Static268.anInt4867 = 1;
				Static284.anInt4990 = 0;
				Static410.aClass21_5.aBoolean34 = !Static410.aClass21_5.aBoolean34;
				Static241.anInt4381++;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBZIZ)Lclient!ph;")
	public static Class187 method5285(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class84 local10 = null;
		if (Static53.aClass227_2 != null) {
			local10 = new Class84(arg1, Static53.aClass227_2, Static422.aClass227Array1[arg1], 1000000);
		}
		Static218.aClass131_Sub1Array2[arg1] = Static322.aClass138_1.method3221(arg1, local10, Static371.aClass84_4);
		if (arg2) {
			Static218.aClass131_Sub1Array2[arg1].method3129();
		}
		return new Class187(Static218.aClass131_Sub1Array2[arg1], arg0, 1);
	}
}
