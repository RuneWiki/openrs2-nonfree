import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	public static void method754() {
		@Pc(5) Class87 local5 = Static307.aClass87_54;
		synchronized (Static307.aClass87_54) {
			Static307.aClass87_54.method2473(5);
		}
		local5 = Static306.aClass87_53;
		synchronized (Static306.aClass87_53) {
			Static306.aClass87_53.method2473(5);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public static void method755() {
		if (Static64.anInt1792 == 5) {
			Static64.anInt1792 = 6;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IB[JI)V")
	public static void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg0; local47++) {
			if (arg2[local47] < local21 + (long) (local47 & 0x1)) {
				@Pc(64) long local64 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local64;
				@Pc(78) int local78 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local78;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg0] = arg1[local17];
		arg1[local17] = local35;
		method756(local17 - 1, arg1, arg2, arg3);
		method756(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method757(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static271.anInt5534;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(26) Class193 local26 = Static280.method4882(arg0[local18]);
			if (local26.anInt5817 != -1) {
				@Pc(39) Class5 local39 = (Class5) Static276.aClass87_49.method2482((long) local26.anInt5817);
				if (local39 == null) {
					@Pc(47) Class99 local47 = Static366.method2655(Static193.aClass216_64, local26.anInt5817, 0);
					if (local47 != null) {
						local39 = Static208.aClass32_11.method2149(local47);
						Static276.aClass87_49.method2481(local39, (long) local26.anInt5817);
					}
				}
				if (local39 != null) {
					Static197.aClass5Array16[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}
}
