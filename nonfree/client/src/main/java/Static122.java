import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
	public static int anInt2187;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public static int anInt2188;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!o;")
	public static final Class169 aClass169_110 = new Class169("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public static int anInt2186 = 0;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_51 = new Class211(39, 6);

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public static int anInt2189 = -1;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public static void method1789() {
		if (!Static308.method4587()) {
			return;
		}
		if (Static231.aStringArray79 == null) {
			Static232.method618();
		}
		Static380.aBoolean567 = true;
		Static278.anInt4646 = 0;
		Static100.anIntArray749 = new int[100];
		Static265.aBooleanArray22 = new boolean[100];
		Static55.anIntArray146 = new int[100];
		Static197.anIntArray410 = new int[100];
		for (@Pc(36) int local36 = 0; local36 < 100; local36++) {
			Static197.anIntArray410[local36] = (int) ((double) Static136.anInt6304 * Math.random());
			Static55.anIntArray146[local36] = (int) (Math.random() * 350.0D);
			Static100.anIntArray749[local36] = (int) (Math.random() * 102.0D);
			Static265.aBooleanArray22[local36] = Math.random() < 0.5D;
		}
		try {
			Static148.aClipboard1 = Static305.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII)V")
	public static void method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg2, 10);
		local8.method3004();
		local8.anInt3686 = arg1;
		local8.anInt3679 = arg0;
		local8.anInt3676 = arg3;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIIII)V")
	public static void method1791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub6_Sub11 local16 = Static295.method4455(arg0, 8);
		local16.method3004();
		local16.anInt3679 = arg2;
		local16.anInt3676 = arg3;
		local16.anInt3686 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IJ)V")
	public static void method1792(@OriginalArg(1) long arg0) {
		Static209.aClass1_Sub33_Sub2_2.lb = 0;
		Static209.aClass1_Sub33_Sub2_2.method5165(Static159.aClass66_7.anInt1518);
		Static209.aClass1_Sub33_Sub2_2.method5127(arg0);
		Static288.anInt4949 = 0;
		Static300.anInt5112 = 1;
		Static19.anInt321 = 0;
		Static324.anInt2339 = -3;
	}
}
