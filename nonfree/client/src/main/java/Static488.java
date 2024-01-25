import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
	public static int anInt8751;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	public static int anInt8754;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	public static int anInt8750 = 0;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Lclient!in;")
	public static final Class169 aClass169_212 = new Class169(5, 20);

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	public static int anInt8753 = 0;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray50 = new boolean[5];

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[II[II)V")
	public static void method7739(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg2; local55 < arg0; local55++) {
			if (arg3[local55] < local20 + (local55 & local53)) {
				@Pc(74) int local74 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local74;
				@Pc(88) int local88 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16++] = local88;
			}
		}
		arg3[arg0] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg0] = arg1[local16];
		arg1[local16] = local34;
		method7739(local16 - 1, arg1, arg2, arg3);
		method7739(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method7740() {
		@Pc(7) String local7 = "www";
		if (Static612.aClass37_10 == Static235.aClass37_5) {
			local7 = "www-wtrc";
		} else if (Static235.aClass37_5 == Static415.aClass37_3) {
			local7 = "www-wtqa";
		} else if (Static188.aClass37_8 == Static235.aClass37_5) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static188.aString98 != null) {
			local33 = "/p=" + Static188.aString98;
		}
		return "http://" + local7 + "." + Static551.aClass229_15.aString84 + ".com/l=" + Static204.anInt8130 + "/a=" + Static568.anInt9915 + local33 + "/";
	}
}
