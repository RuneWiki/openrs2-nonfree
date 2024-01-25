import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
	public static boolean aBoolean681;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lclient!eh;")
	public static final Class4_Sub9[] aClass4_Sub9Array1 = new Class4_Sub9[2048];

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
	public static final int[] anIntArray715 = new int[8];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7938(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static488.method6774(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static286.anInt8741; local32++) {
			@Pc(38) String local38 = Static101.aStringArray5[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static488.method6774(local38);
			if (local38 != null && local38.equals(local27)) {
				Static286.anInt8741--;
				for (@Pc(62) int local62 = local32; local62 < Static286.anInt8741; local62++) {
					Static101.aStringArray5[local62] = Static101.aStringArray5[local62 + 1];
					Static383.aStringArray29[local62] = Static383.aStringArray29[local62 + 1];
					Static550.aStringArray38[local62] = Static550.aStringArray38[local62 + 1];
					Static229.aStringArray21[local62] = Static229.aStringArray21[local62 + 1];
					Static410.aBooleanArray29[local62] = Static410.aBooleanArray29[local62 + 1];
				}
				Static506.anInt8762 = Static191.anInt5895;
				@Pc(123) Class4_Sub41 local123 = Static128.method2707(Static300.aClass61_74, Class16_Sub3.lb);
				local123.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0));
				local123.aClass4_Sub9_Sub1_3.method6000(arg0);
				Static551.method7603(local123);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ej;I[I[III)Lclient!oh;")
	public static Class98_Sub2 method7940(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(29) int local29;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (!arg0.method6969(Static106.aClass141_3, Static349.aClass239_12)) {
			@Pc(72) int[] local72 = new int[arg4 * arg3];
			for (local29 = 0; local29 < arg3; local29++) {
				local40 = local29 * arg4 + arg1[local29];
				for (local42 = 0; local42 < arg2[local29]; local42++) {
					local72[local40++] = -16777216;
				}
			}
			return new Class98_Sub2(arg0, arg4, arg3, local72);
		}
		@Pc(27) byte[] local27 = new byte[arg4 * arg3];
		for (local29 = 0; local29 < arg3; local29++) {
			local40 = local29 * arg4 + arg1[local29];
			for (local42 = 0; local42 < arg2[local29]; local42++) {
				local27[local40++] = -1;
			}
		}
		return new Class98_Sub2(arg0, arg4, arg3, local27);
	}
}
