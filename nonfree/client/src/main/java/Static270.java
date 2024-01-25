import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public static int anInt5435;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_50 = new Class198(64);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIZZ)V")
	public static void method4574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static103.anInt2156 = arg0;
		Static116.anInt2499 = arg1;
		Static14.anInt494 = arg2;
		Static177.aClass45ArrayArrayArray1 = new Class45[4][Static103.anInt2156][Static116.anInt2499];
		Static355.aClass22Array3 = new Class22[4];
		if (arg3) {
			Static321.aClass45ArrayArrayArray3 = new Class45[1][Static103.anInt2156][Static116.anInt2499];
			Static245.anIntArrayArray46 = new int[Static103.anInt2156][Static116.anInt2499];
			Static182.aClass22Array2 = new Class22[1];
		} else {
			Static321.aClass45ArrayArrayArray3 = null;
			Static245.anIntArrayArray46 = null;
			Static182.aClass22Array2 = null;
		}
		if (arg4) {
			Static145.anIntArrayArrayArray4 = new int[4][arg0][arg1];
			Static13.aClass3_Sub13_Sub1Array3 = new Class3_Sub13_Sub1[255];
			Static33.aBooleanArray4 = new boolean[255];
			Static321.anInt6217 = 0;
		} else {
			Static145.anIntArrayArrayArray4 = null;
			Static13.aClass3_Sub13_Sub1Array3 = null;
			Static33.aBooleanArray4 = null;
			Static321.anInt6217 = 0;
		}
		Static197.method3454(false);
		Static32.aClass158Array1 = new Class158[500];
		Static243.anInt4826 = 0;
		Static188.aClass158Array2 = new Class158[500];
		Static161.anInt3147 = 0;
		Static285.anIntArrayArrayArray11 = new int[4][Static103.anInt2156 + 1][Static116.anInt2499 + 1];
		Static287.aClass5_Sub4Array3 = new Class5_Sub4[5000];
		Static45.anInt928 = 0;
		Static192.aBooleanArrayArray9 = new boolean[Static14.anInt494 + Static14.anInt494 + 1][Static14.anInt494 + Static14.anInt494 + 1];
		Static108.aBooleanArrayArray15 = new boolean[Static14.anInt494 + Static14.anInt494 + 2][Static14.anInt494 + Static14.anInt494 + 2];
		Static71.aClass103_3 = null;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
	public static void method4575(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 5);
		local8.method2502();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method4576(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static11.aClass15_1);
		arg0.addMouseMotionListener(Static11.aClass15_1);
		arg0.addFocusListener(Static11.aClass15_1);
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Lclient!hb;")
	public static Class79 method4577() {
		try {
			return (Class79) Class.forName("Class79_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public static void method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass5_Sub1_1 != null) {
			local7.aClass5_Sub1_1 = null;
		}
		if (local7.aClass5_Sub1_2 != null) {
			local7.aClass5_Sub1_2 = null;
		}
	}
}
