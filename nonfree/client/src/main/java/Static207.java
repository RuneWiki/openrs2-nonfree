import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray25;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_110 = new Class93("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray59 = new String[100];

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public static int anInt6401 = 0;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method5563() {
		if (!Static6.method208()) {
			return;
		}
		if (Static158.aStringArray28 == null) {
			Static335.method5802();
		}
		Static25.anIntArray103 = new int[100];
		Static276.anIntArray413 = new int[100];
		Static96.aBoolean181 = true;
		Static105.anInt2372 = 0;
		Static175.aBooleanArray17 = new boolean[100];
		Static335.anIntArray501 = new int[100];
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static335.anIntArray501[local35] = (int) (Math.random() * (double) Static136.anInt2829);
			Static25.anIntArray103[local35] = (int) (Math.random() * 350.0D);
			Static276.anIntArray413[local35] = (int) (Math.random() * 102.0D);
			Static175.aBooleanArray17[local35] = Math.random() < 0.5D;
		}
		try {
			Static95.aClipboard2 = Static293.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!jk;")
	public static Class99 method5566(@OriginalArg(0) int arg0) {
		@Pc(10) Class99 local10 = (Class99) Static324.aClass119_198.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static229.aClass191_77.method5459(29, arg0);
		local10 = new Class99();
		if (local25 != null) {
			local10.method2970(arg0, new Class2_Sub10(local25));
		}
		Static324.aClass119_198.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!vl;I)Z")
	public static boolean method5572(@OriginalArg(0) Interface9 arg0) {
		@Pc(9) Class96 local9 = Static234.method4051(arg0.method5583());
		if (local9.anInt3159 == -1) {
			return true;
		} else {
			@Pc(21) Class182 local21 = Static77.method1775(local9.anInt3159);
			return local21.anInt5813 == -1 ? true : local21.method5128();
		}
	}
}
