import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
	public static int anInt4014;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
	public static int anInt4021;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_44 = new Class306("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[BII)I")
	public static int method3512(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = Class313.anIntArray833[(local5 ^ arg1[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	public static void method3513() {
		if (!Static386.method5877()) {
			return;
		}
		if (Static200.aStringArray19 == null) {
			Static170.method2590();
		}
		Static170.aBoolean209 = true;
		Static241.anInt4829 = 0;
		try {
			Static129.aClipboard1 = Static230.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Z")
	public static boolean method3515(@OriginalArg(1) int arg0) {
		if (Static373.aBooleanArray10[arg0]) {
			return true;
		} else if (Static186.aClass171_71.method4340(arg0)) {
			@Pc(28) int local28 = Static186.aClass171_71.method4349(arg0);
			if (local28 == 0) {
				Static373.aBooleanArray10[arg0] = true;
				return true;
			}
			if (Static396.aClass156ArrayArray1[arg0] == null) {
				Static396.aClass156ArrayArray1[arg0] = new Class156[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static396.aClass156ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static186.aClass171_71.method4339(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class156 local73 = Static396.aClass156ArrayArray1[arg0][local47] = new Class156();
						local73.anInt4677 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method4053(new Class1_Sub6(local61));
					}
				}
			}
			Static373.aBooleanArray10[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
