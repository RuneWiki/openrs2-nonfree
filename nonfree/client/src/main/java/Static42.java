import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!ir;")
	public static Class100 aClass100_15;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!ir;")
	public static Class100 aClass100_16;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt891 = 0;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt892 = 0;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public static int anInt897 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method728() {
		@Pc(5) Class198 local5 = Static56.aClass198_15;
		synchronized (Static56.aClass198_15) {
			Static56.aClass198_15.method5236();
		}
		local5 = Static161.aClass198_25;
		synchronized (Static161.aClass198_25) {
			Static161.aClass198_25.method5236();
		}
		local5 = Static175.aClass198_28;
		synchronized (Static175.aClass198_28) {
			Static175.aClass198_28.method5236();
		}
		local5 = Static278.aClass198_51;
		synchronized (Static278.aClass198_51) {
			Static278.aClass198_51.method5236();
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public static void method729() {
		if (!Static175.method2872()) {
			return;
		}
		if (Static265.aStringArray34 == null) {
			Static123.method2157();
		}
		Static225.anIntArray435 = new int[100];
		Static322.anInt6236 = 0;
		Static118.anIntArray148 = new int[100];
		Static13.aBoolean25 = true;
		Static236.aBooleanArray23 = new boolean[100];
		Static9.anIntArray10 = new int[100];
		for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
			Static118.anIntArray148[local28] = (int) (Math.random() * (double) Static298.anInt5944);
			Static225.anIntArray435[local28] = (int) (Math.random() * 350.0D);
			Static9.anIntArray10[local28] = (int) (Math.random() * 102.0D);
			Static236.aBooleanArray23[local28] = Math.random() < 0.5D;
		}
		try {
			Static136.aClipboard1 = Static37.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(74) Exception local74) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	public static void method731() {
		Static290.aClass198_53.method5230();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!nn;ZBZ)V")
	public static void method732(@OriginalArg(0) Class3_Sub32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt4348;
		@Pc(12) int local12 = (int) arg0.aLong211;
		arg0.method5717();
		if (arg1) {
			Static167.method2704(local8);
		}
		Static225.method4600(local8);
		@Pc(27) Class181 local27 = Static20.method415(local12);
		if (local27 != null) {
			Static316.method5250(local27);
		}
		Static313.method5228();
		if (!arg2 && Static191.anInt3991 != -1) {
			Static82.method1278(Static191.anInt3991, 1);
		}
		@Pc(53) Class60 local53 = new Class60(Static188.aClass24_21);
		for (@Pc(58) Class3_Sub32 local58 = (Class3_Sub32) local53.method1271(); local58 != null; local58 = (Class3_Sub32) local53.method1274()) {
			if (!local58.method5718()) {
				local58 = (Class3_Sub32) local53.method1271();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt4349 == 3) {
				@Pc(80) int local80 = (int) local58.aLong211;
				if (local8 == local80 >>> 16) {
					method732(local58, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lclient!rb;")
	public static Class3_Sub7_Sub19 method733(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub19 local10 = (Class3_Sub7_Sub19) Static212.aClass188_4.method5061((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static30.aClass100_12.method2319(Static86.method3645(arg0), Static323.method5294(arg0));
		local10 = new Class3_Sub7_Sub19();
		if (local29 != null) {
			local10.method4443(new Class3_Sub4(local29));
		}
		Static212.aClass188_4.method5063(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	public static void method734() {
		Static346.aClass198_62.method5236();
	}
}
