import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	public static int anInt573;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_8 = new Class142(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_9 = new Class242(52, 3);

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_29 = new Class67(26, 8);

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "[I")
	public static final int[] anIntArray68 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method533(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static200.method2869(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)V")
	public static void method534() {
		Static461.aClass77_64.method1395();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!eq;)Lclient!vb;")
	public static Class259 method535(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1 arg1) {
		@Pc(15) Class259 local15;
		if (Static358.aClass259_3 == null) {
			local15 = new Class259();
		} else {
			local15 = Static358.aClass259_3;
			Static358.aClass259_3 = Static358.aClass259_3.aClass259_4;
			Static355.anInt5738--;
			local15.aClass259_4 = null;
		}
		local15.anInt6824 = arg0;
		local15.aClass11_Sub1_2 = arg1;
		return local15;
	}
}
