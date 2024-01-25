import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_10 = new Class189("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_11 = new Class189("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "[I")
	public static final int[] anIntArray51 = new int[13];

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
	public static int anInt475 = 0;

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_1 = new Class243();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method369(@OriginalArg(0) int arg0) {
		if (Static55.method1137(arg0)) {
			Static25.method589(-1, Static178.aClass156ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method370(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt1154 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub8Array2[local4] != null) {
				arg0.anInt1154++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt1154; local22++) {
			@Pc(31) long local31 = Static24.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class191 local41;
			while (local31 != 0L) {
				local41 = Static375.aClass191Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub8_2 == arg0.aClass3_Sub8Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static24.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static375.aClass191Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub8_2 == arg0.aClass3_Sub8Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt1154 - 1; local93++) {
				arg0.aClass3_Sub8Array2[local93] = arg0.aClass3_Sub8Array2[local93 + 1];
			}
			arg0.anInt1154--;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!li;BILjava/lang/String;)Lclient!cq;")
	public static Class43 method371(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method3400(arg2);
		}
		@Pc(41) Class43 local41;
		if (arg1 == 1) {
			try {
				Static456.method851(arg0.anApplet1, "openjs", new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local41 = new Class43();
				local41.anInt1521 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class43();
				local41.anInt1521 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class43();
				local41.anInt1521 = 1;
				return local41;
			} catch (@Pc(88) Exception local88) {
				local41 = new Class43();
				local41.anInt1521 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static456.method852("loggedout", arg0.anApplet1);
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class43();
				local41.anInt1521 = 1;
				return local41;
			} catch (@Pc(130) Exception local130) {
				local41 = new Class43();
				local41.anInt1521 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
