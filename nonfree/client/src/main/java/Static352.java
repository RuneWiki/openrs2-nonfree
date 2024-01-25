import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
	public static boolean aBoolean585 = true;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
	public static final int[] anIntArray637 = new int[4096];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)I")
	public static int method5979(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!rg;ZI)V")
	public static void method5980(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (Static257.aClass129_5 == null) {
			return;
		}
		try {
			Static257.aClass129_5.method3365(0L);
			Static257.aClass129_5.method3367(arg1, 24, arg0.aByteArray90);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method5982() {
		Static338.aClass103_164 = new Class103();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!ij;)I")
	public static int method5987(@OriginalArg(1) Class93 arg0) {
		@Pc(13) int local13 = 0;
		if (arg0.method2414(Static176.anInt3500)) {
			local13++;
		}
		if (arg0.method2414(Static46.anInt863)) {
			local13++;
		}
		return local13;
	}
}
