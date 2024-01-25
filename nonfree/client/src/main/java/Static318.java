import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static int anInt6962;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!bm;")
	public static Class26 aClass26_5;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
	public static int[] anIntArray510;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!an;")
	public static Class11 aClass11_42 = new Class11(8);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!mq;")
	public static Class156 aClass156_17 = null;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_230 = new Class189("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V")
	public static void method5480(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub12 local13 = Static393.method5080(arg0, 10);
		local13.method3244();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	public static int method5505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static348.anIntArray391[arg0 & 0x3] : Static393.anIntArray412[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!m;Lclient!li;Ljava/awt/Canvas;)Lclient!qa;")
	public static synchronized Class172 method5506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface5 arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) Canvas arg4) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			if (!Static206.aBooleanArray15[local7]) {
				local5 = local7;
				break;
			}
		}
		if (local5 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(45) Class172 local45;
		if (arg1 == 0) {
			local45 = Static21.method466(arg2, arg4, local5);
		} else if (arg1 == 1) {
			local45 = Static88.method1662(arg4, local5, arg2, arg0, arg3);
		} else if (arg1 == 2) {
			local45 = Static391.method5272(arg2, arg3, arg4, local5);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static206.aBooleanArray15[local5] = true;
		return local45;
	}
}
