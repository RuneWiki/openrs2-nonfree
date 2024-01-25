import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "Lclient!dn;")
	public static Class56 aClass56_93;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard4;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_243 = new Class175("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
	public static final int[] anIntArray568 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public static int anInt7455 = 0;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_244 = new Class175("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_245 = new Class175("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
	public static final int anInt7460 = 12;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "Lclient!hl;")
	public static final Class99 aClass99_4 = new Class99();

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "Lclient!aj;")
	public static Class3_Sub2_Sub1 aClass3_Sub2_Sub1_6 = new Class3_Sub2_Sub1(8192);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[S)[S")
	public static short[] method5844(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static464.method5794(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
	public static void method5845(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static87.method3006(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	public static void method5846() {
		if (Static284.anInt5211 == 0) {
			return;
		}
		try {
			if (++Static418.anInt7207 > 2000) {
				if (Static122.aClass27_1 != null) {
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
				}
				if (Static4.anInt817 >= 1) {
					Static407.anInt7061 = -5;
					Static284.anInt5211 = 0;
					return;
				}
				Static4.anInt817++;
				if (Static178.anInt3626 == Static14.anInt470) {
					Static178.anInt3626 = Static324.anInt423;
				} else {
					Static178.anInt3626 = Static14.anInt470;
				}
				Static284.anInt5211 = 1;
				Static418.anInt7207 = 0;
			}
			if (Static284.anInt5211 == 1) {
				Static358.aClass190_8 = Static295.aClass103_5.method2834(Static324.aString2, Static178.anInt3626);
				Static284.anInt5211 = 2;
			}
			@Pc(108) int local108;
			if (Static284.anInt5211 == 2) {
				if (Static358.aClass190_8.anInt5799 == 2) {
					throw new IOException();
				}
				if (Static358.aClass190_8.anInt5799 != 1) {
					return;
				}
				Static122.aClass27_1 = new Class27((Socket) Static358.aClass190_8.anObject7, Static295.aClass103_5);
				Static358.aClass190_8 = null;
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static212.method3428();
				local108 = Static122.aClass27_1.method890();
				Static212.method3428();
				if (local108 != 21) {
					Static407.anInt7061 = local108;
					Static284.anInt5211 = 0;
					Static122.aClass27_1.method893();
					Static122.aClass27_1 = null;
					return;
				}
				Static284.anInt5211 = 3;
			}
			if (Static284.anInt5211 == 3) {
				if (Static122.aClass27_1.method894() < 1) {
					return;
				}
				Static195.aStringArray87 = new String[Static122.aClass27_1.method890()];
				Static284.anInt5211 = 4;
			}
			if (Static284.anInt5211 == 4 && Static122.aClass27_1.method894() >= Static195.aStringArray87.length * 8) {
				Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
				Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, Static195.aStringArray87.length * 8, 0);
				for (local108 = 0; local108 < Static195.aStringArray87.length; local108++) {
					Static195.aStringArray87[local108] = Static319.method4638(Static110.aClass3_Sub2_Sub2_1.method6047());
				}
				Static407.anInt7061 = 21;
				Static284.anInt5211 = 0;
				Static122.aClass27_1.method893();
				Static122.aClass27_1 = null;
			}
		} catch (@Pc(202) IOException local202) {
			if (Static122.aClass27_1 != null) {
				Static122.aClass27_1.method893();
				Static122.aClass27_1 = null;
			}
			if (Static4.anInt817 >= 1) {
				Static284.anInt5211 = 0;
				Static407.anInt7061 = -4;
			} else {
				if (Static14.anInt470 == Static178.anInt3626) {
					Static178.anInt3626 = Static324.anInt423;
				} else {
					Static178.anInt3626 = Static14.anInt470;
				}
				Static418.anInt7207 = 0;
				Static4.anInt817++;
				Static284.anInt5211 = 1;
			}
		}
	}
}
