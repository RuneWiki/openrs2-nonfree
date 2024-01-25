import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method6964(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static468.method6414(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static336.anInt6067; local34++) {
			@Pc(40) String local40 = Static101.aStringArray10[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static468.method6414(local40);
			if (local40 != null && local40.equals(local20)) {
				Static336.anInt6067--;
				for (@Pc(64) int local64 = local34; local64 < Static336.anInt6067; local64++) {
					Static101.aStringArray10[local64] = Static101.aStringArray10[local64 + 1];
					Static205.aStringArray17[local64] = Static205.aStringArray17[local64 + 1];
					Static554.aStringArray46[local64] = Static554.aStringArray46[local64 + 1];
					Static412.aStringArray34[local64] = Static412.aStringArray34[local64 + 1];
					Static82.aBooleanArray33[local64] = Static82.aBooleanArray33[local64 + 1];
				}
				Static356.anInt6330 = Static523.anInt9188;
				@Pc(125) Class3_Sub10 local125 = Static129.method2403(Static452.aClass353_2, Static166.aClass287_57);
				local125.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg0));
				local125.aClass3_Sub26_Sub1_1.method6772(arg0);
				Static193.method3398(local125);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[III[I)V")
	public static void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg2 + arg0) / 2;
		@Pc(18) int local18 = arg2;
		@Pc(22) int local22 = arg1[local16];
		arg1[local16] = arg1[arg0];
		arg1[arg0] = local22;
		@Pc(36) int local36 = arg3[local16];
		arg3[local16] = arg3[arg0];
		arg3[arg0] = local36;
		@Pc(55) int local55 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg2; local57 < arg0; local57++) {
			if ((local55 & local57) + local22 > arg1[local57]) {
				@Pc(76) int local76 = arg1[local57];
				arg1[local57] = arg1[local18];
				arg1[local18] = local76;
				@Pc(90) int local90 = arg3[local57];
				arg3[local57] = arg3[local18];
				arg3[local18++] = local90;
			}
		}
		arg1[arg0] = arg1[local18];
		arg1[local18] = local22;
		arg3[arg0] = arg3[local18];
		arg3[local18] = local36;
		method6965(local18 - 1, arg1, arg2, arg3);
		method6965(arg0, arg1, local18 + 1, arg3);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ie;I)Lclient!he;")
	public static Class110_Sub1 method6966(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class110_Sub1(arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6830(), arg0.method6814());
	}
}
