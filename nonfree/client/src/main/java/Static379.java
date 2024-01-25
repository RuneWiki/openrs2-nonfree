import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
	public static int anInt7010;

	@OriginalMember(owner = "client!oga", name = "w", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas13;

	@OriginalMember(owner = "client!oga", name = "t", descriptor = "Lclient!pca;")
	public static final Class263 aClass263_4 = new Class263("runescape", 0);

	@OriginalMember(owner = "client!oga", name = "z", descriptor = "Lclient!db;")
	public static final Class64 aClass64_338 = new Class64(86, 3);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IBI)Z")
	public static boolean method5833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILclient!cp;Lclient!rt;BIIIIIII)V")
	public static void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) Class297 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static355.anInt6193 = arg6;
		Static351.anInt6125 = arg1;
		Static86.anInt2259 = arg4;
		Static580.anInt2669 = arg5;
		Static129.anInt2976 = arg0;
		Static578.aClass268_4 = null;
		Static578.aClass58_14 = arg2;
		Static136.aClass268_1 = null;
		Static260.anInt5067 = arg7;
		Static414.anInt7163 = arg8;
		Static237.aClass268_3 = null;
		Static267.anInt5145 = arg9;
		Static159.anInt3539 = arg10;
		Static598.aClass297_13 = arg3;
		Static286.method7186();
		Static243.aBoolean363 = true;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
	public static void method5836() {
		Static451.anInt9796 = 0;
		Static435.anInt7462 = -1;
		Static319.anInt5739 = -1;
		Static200.anInt4239 = -1;
	}
}
