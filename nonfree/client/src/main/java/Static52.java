import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "[I")
	public static final int[] anIntArray79 = new int[1000];

	@OriginalMember(owner = "client!caa", name = "p", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_26 = new Class239(25, 10);

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	public static void method953() {
		if (!Static365.method5858()) {
			return;
		}
		if (Static277.aStringArray27 == null) {
			Static226.method3567();
		}
		Static259.aBoolean185 = true;
		Static18.anInt431 = 0;
		try {
			Static167.aClipboard1 = Static456.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public static void method955() {
		if (Static221.aBoolean311) {
			return;
		}
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean196) {
			Static265.aFloat182 = (int) Static265.aFloat182 - 17 & 0xFFFFFFF0;
		} else {
			Static291.aFloat102 += (-12.0F - Static291.aFloat102) / 2.0F;
		}
		Static221.aBoolean311 = true;
		Static253.aBoolean338 = true;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)V")
	public static void method956(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub13_Sub15 local13 = Static370.method5893(arg0, 1);
		local13.method6974();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIB)I")
	public static int method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static304.anIntArray477[arg0 & 0x3] : Static268.anIntArray443[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!jda;IIB)V")
	public static void method961(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static355.aClass142ArrayArray1[arg1][arg2] = arg0;
	}
}
