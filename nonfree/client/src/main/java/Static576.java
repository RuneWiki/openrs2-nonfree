import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!up", name = "r", descriptor = "I")
	public static int anInt9713;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!lw;")
	public static final Class223 aClass223_16 = new Class223(4);

	@OriginalMember(owner = "client!up", name = "s", descriptor = "Z")
	public static boolean aBoolean696 = false;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_16 = new Class216(7, 0, 1, 1);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZZ)I")
	public static int method8341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class5_Sub38 local13 = Static478.method7058(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray363.length) {
			return local13.anIntArray363[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZLclient!raa;)V")
	public static void method8348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class295 arg2) {
		if (Static285.aBoolean378) {
			@Pc(14) Class16 local14 = Static229.anInt4250 == -1 ? null : Static302.aClass291_1.method6836(Static229.anInt4250);
			if (Static75.method1286(arg2).method6706() && (Static427.anInt7391 & 0x20) != 0 && (local14 == null || arg2.method6982(local14.anInt256, Static229.anInt4250) != local14.anInt256)) {
				Static150.method2214(arg2.anInt8022, Static92.aString22 + " -> " + arg2.aString92, true, false, Static83.anInt6737, arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8025 << 0 | arg2.anInt8022), false, Static493.aString96, 10, 0L);
			}
		}
		@Pc(85) String local85;
		for (@Pc(78) int local78 = 9; local78 >= 5; local78--) {
			local85 = Static421.method6391(local78, arg2);
			if (local85 != null) {
				Static150.method2214(arg2.anInt8022, arg2.aString92, true, false, Static50.method842(local78, arg2), arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8025 << 0 | arg2.anInt8022), false, local85, 1001, (long) (local78 + 1));
			}
		}
		local85 = Static393.method8896(arg2);
		if (local85 != null) {
			Static150.method2214(arg2.anInt8022, arg2.aString92, true, false, arg2.anInt7991, arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8022 | arg2.anInt8025 << 0), false, local85, 8, 0L);
		}
		for (@Pc(171) int local171 = 4; local171 >= 0; local171--) {
			@Pc(178) String local178 = Static421.method6391(local171, arg2);
			if (local178 != null) {
				Static150.method2214(arg2.anInt8022, arg2.aString92, true, false, Static50.method842(local171, arg2), arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8025 << 0 | arg2.anInt8022), false, local178, 46, (long) (local171 + 1));
			}
		}
		if (!Static75.method1286(arg2).method6708()) {
			return;
		}
		if (arg2.aString89 == null) {
			Static150.method2214(arg2.anInt8022, "", true, false, -1, arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8025 << 0 | arg2.anInt8022), false, Static174.aClass120_9.method2690(Static266.anInt4796), 3, 0L);
		} else {
			Static150.method2214(arg2.anInt8022, "", true, false, -1, arg2.anInt8025, arg2.anInt8010, (long) (arg2.anInt8022 | arg2.anInt8025 << 0), false, arg2.aString89, 3, 0L);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!la;BLjava/lang/String;Z)Lclient!wq;")
	public static Class378 method8349(@OriginalArg(0) Class207 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) int local18 = arg0.method4686(arg1);
		if (local18 == -1) {
			return new Class378(0);
		}
		@Pc(31) int[] local31 = arg0.method4676(local18);
		@Pc(37) Class378 local37 = new Class378(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt10597) {
				@Pc(55) Class5_Sub22 local55 = new Class5_Sub22(arg0.method4681(local18, local31[local41++]));
				@Pc(59) int local59 = local55.method5913();
				@Pc(63) int local63 = local55.method5968();
				@Pc(67) int local67 = local55.method5966();
				if (!arg2 && local67 == 1) {
					local37.anInt10597--;
				} else {
					local37.anIntArray603[local39] = local59;
					local37.anIntArray602[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
