import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "[Lclient!lc;")
	public static final Class139[] aClass139Array2 = new Class139[14];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!rm;IIIII)V")
	public static void method4464(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt7289 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass7_Sub30Array3[local4] != null) {
				arg0.anInt7289++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt7289; local22++) {
			@Pc(31) long local31 = Static194.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class74 local41;
			while (local31 != 0L) {
				local41 = Static302.aClass74Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass7_Sub30_2 == arg0.aClass7_Sub30Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static194.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static302.aClass74Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass7_Sub30_2 == arg0.aClass7_Sub30Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt7289 - 1; local93++) {
				arg0.aClass7_Sub30Array3[local93] = arg0.aClass7_Sub30Array3[local93 + 1];
			}
			arg0.anInt7289--;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public static void method4465() {
		Static413.aClass178_124.anInt4835 = 1;
		Static292.method3875();
		Static173.aBoolean186 = true;
		Static257.aBoolean276 = true;
		Static189.method4309();
		for (@Pc(5617) int local5617 = 0; local5617 < Static325.aClass150Array1.length; local5617++) {
			Static325.aClass150Array1[local5617] = null;
		}
		Static402.aBoolean412 = false;
		Static312.method4087();
		Static3.anInt11 = (int) (Math.random() * 30.0D) - 20;
		Static436.anInt7299 = (int) (Math.random() * 110.0D) - 55;
		Static436.anInt7298 = (int) (Math.random() * 120.0D) - 60;
		Static243.anInt4160 = (int) (Math.random() * 80.0D) - 40;
		Static97.aFloat52 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static31.anInt520 = (int) (Math.random() * 100.0D) - 50;
		Static41.method570();
		for (@Pc(5686) int local5686 = 0; local5686 < 2048; local5686++) {
			Static410.aClass26_Sub2_Sub4_Sub2Array1[local5686] = null;
		}
		Static56.anInt943 = 0;
		for (@Pc(5700) int local5700 = 0; local5700 < 32768; local5700++) {
			Static171.aClass26_Sub2_Sub4_Sub1Array1[local5700] = null;
		}
		Static235.aClass85_25.method2008();
		Static203.aClass85_20.method2008();
		Static335.aClass169_7.method3594();
		Static345.aClass164_33.method3509();
		Static276.aClass85_30 = new Class85();
		Static224.aClass239_7.method5000();
		Static384.method5650();
		Static316.anInt5194 = 0;
		Static131.anInt2511 = 0;
		Static62.anInt1155 = 0;
		Static448.anInt7378 = 0;
		Static404.anInt7485 = 0;
		Static47.anInt746 = 0;
		Static63.anInt1215 = 0;
		Static453.anInt7459 = 0;
		Static150.anInt2821 = 0;
		Static263.anInt4464 = 0;
		for (@Pc(5755) int local5755 = 0; local5755 < Static101.anIntArray136.length; local5755++) {
			if (!Static196.aBooleanArray18[local5755]) {
				Static101.anIntArray136[local5755] = -1;
			}
		}
		if (Static183.anInt3293 != -1) {
			Static348.method5606(Static183.anInt3293);
		}
		for (@Pc(5781) Class7_Sub44 local5781 = (Class7_Sub44) Static23.aClass164_3.method3514(); local5781 != null; local5781 = (Class7_Sub44) Static23.aClass164_3.method3519()) {
			if (!local5781.method5801()) {
				local5781 = (Class7_Sub44) Static23.aClass164_3.method3514();
				if (local5781 == null) {
					break;
				}
			}
			Static255.method3394(true, local5781, false);
		}
		Static183.anInt3293 = -1;
		Static23.aClass164_3 = new Class164(8);
		Static64.method946();
		Static63.aClass95_2 = null;
		for (@Pc(5821) int local5821 = 0; local5821 < 8; local5821++) {
			Static191.aStringArray29[local5821] = null;
			Static157.aBooleanArray14[local5821] = false;
			Static233.anIntArray489[local5821] = -1;
		}
		Static92.method1631();
		Static250.aBoolean275 = true;
		for (@Pc(5847) int local5847 = 0; local5847 < 100; local5847++) {
			Static69.aBooleanArray2[local5847] = true;
		}
		for (@Pc(5861) int local5861 = 0; local5861 < 6; local5861++) {
			Static286.aClass242Array3[local5861] = new Class242();
		}
		for (@Pc(5877) int local5877 = 0; local5877 < 25; local5877++) {
			Static29.anIntArray46[local5877] = 0;
			Static326.anIntArray624[local5877] = 0;
			Static446.anIntArray621[local5877] = 0;
		}
		Static379.method4655();
		Static180.aShortArray63 = Static413.aShortArray114 = Static420.aShortArray115 = Static59.aShortArray20 = new short[256];
		Static213.aBoolean230 = true;
		Static261.aString49 = Static209.aClass55_82.method1205(Static5.anInt20);
		Static130.aClass153_Sub1_1.aBoolean355 = false;
		Static385.anInt6209 = 0;
		Static130.aClass153_Sub1_1.aBoolean356 = false;
		Static300.method4011();
		Static154.method2304();
		Static18.aLong17 = 0L;
		Static413.aClass178_124.anInt4835 = 2;
		Static4.aClass7_Sub29_3 = null;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public static void method4466() {
		if (Static119.aBoolean133) {
			return;
		}
		Static74.method1203(Static150.aClass223ArrayArrayArray3);
		if (Static142.aClass223ArrayArrayArray2 != null) {
			Static74.method1203(Static142.aClass223ArrayArrayArray2);
		}
		Static119.aBoolean133 = true;
	}
}
