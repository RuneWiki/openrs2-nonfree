import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "Lclient!od;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "Lclient!ph;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[8];

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	public static void method271() {
		Static301.aClass87_51.method2485();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBLclient!wo;)Lclient!fa;")
	public static Class63 method272(@OriginalArg(0) int arg0, @OriginalArg(3) Class216 arg1) {
		@Pc(9) byte[] local9 = arg1.method5648(arg0, 0);
		return local9 == null ? null : new Class63(local9);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBIIIIII)V")
	public static void method273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static268.anInt5477 <= arg5 && arg4 <= Static342.anInt3000 && Static197.anInt4211 <= arg1 && arg2 <= Static326.anInt2469) {
			Static339.method5468(arg2, arg0, arg1, arg5, arg3, arg6, arg4);
		} else {
			Static305.method5125(arg3, arg4, arg2, arg1, arg6, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
	public static void method274(@OriginalArg(0) boolean arg0) {
		Static17.aBoolean55 = arg0;
		Static267.aBoolean522 = !Static40.method953();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)I")
	public static int method275(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
