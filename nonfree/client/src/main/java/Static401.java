import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!mca;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
	public static boolean method6295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static515.method7180(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static52.method1233(arg1, arg0) | Static249.method4397(arg0, arg1) ? true : (Static181.method1443(arg0, arg1) | Static418.method1821(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!fp;B)I")
	public static int method6296(@OriginalArg(0) Class11_Sub1_Sub1 arg0) {
		if (arg0.anInt7397 == 0) {
			return 0;
		}
		@Pc(70) int local70;
		@Pc(63) int local63;
		if (arg0.anInt7407 != -1) {
			@Pc(23) Class11_Sub1_Sub1 local23 = null;
			if (arg0.anInt7407 < 32768) {
				@Pc(37) Class6_Sub33 local37 = (Class6_Sub33) Static506.aClass305_36.method7447((long) arg0.anInt7407);
				if (local37 != null) {
					local23 = local37.aClass11_Sub1_Sub1_Sub1_2;
				}
			} else if (arg0.anInt7407 >= 32768) {
				local23 = Static239.aClass11_Sub1_Sub1_Sub2Array1[arg0.anInt7407 - 32768];
			}
			if (local23 != null) {
				local63 = arg0.anInt7347 - local23.anInt7347;
				local70 = arg0.anInt7351 - local23.anInt7351;
				if (local63 != 0 || local70 != 0) {
					arg0.method6213((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub1_Sub1_Sub2) {
			@Pc(99) Class11_Sub1_Sub1_Sub2 local99 = (Class11_Sub1_Sub1_Sub2) arg0;
			if (local99.anInt7455 != -1 && (local99.anInt7432 == 0 || local99.anInt7433 > 0)) {
				local99.method6213(local99.anInt7455);
				local99.anInt7455 = -1;
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub1) {
			@Pc(128) Class11_Sub1_Sub1_Sub1 local128 = (Class11_Sub1_Sub1_Sub1) arg0;
			if (local128.anInt509 != -1 && (local128.anInt7432 == 0 || local128.anInt7433 > 0)) {
				local63 = local128.anInt7347 - (local128.anInt509 - Static191.anInt4147 - Static191.anInt4147) * 256;
				local70 = local128.anInt7351 - (local128.anInt515 - Static247.anInt5049 - Static247.anInt5049) * 256;
				if (local63 != 0 || local70 != 0) {
					local128.method6213((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
				local128.anInt509 = -1;
			}
		}
		return arg0.method6219();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method6297() {
		Static298.method4854(Static128.aClass181_33);
		Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[Lclient!ep;I)V")
	public static void method6298(@OriginalArg(1) Class93[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class93 local21 = arg0[local15];
			if (local21 != null && arg1 == local21.anInt2820 && !Static69.method1450(local21)) {
				if (local21.anInt2823 == 0) {
					method6298(arg0, local21.anInt2790);
					if (local21.aClass93Array4 != null) {
						method6298(local21.aClass93Array4, local21.anInt2790);
					}
					@Pc(59) Class6_Sub48 local59 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local21.anInt2790);
					if (local59 != null) {
						Static466.method7186(local59.anInt9207);
					}
				}
				if (local21.anInt2823 == 6 && local21.anInt2786 != -1) {
					@Pc(79) Class16 local79 = Static114.aClass156_2.method4101(local21.anInt2786);
					if (local79 != null) {
						local21.anInt2737 += Static388.anInt7269;
						while (local79.anIntArray46[local21.anInt2772] < local21.anInt2737) {
							local21.anInt2737 -= local79.anIntArray46[local21.anInt2772];
							local21.anInt2772++;
							if (local79.anIntArray47.length <= local21.anInt2772) {
								local21.anInt2772 -= local79.anInt587;
								if (local21.anInt2772 < 0 || local79.anIntArray47.length <= local21.anInt2772) {
									local21.anInt2772 = 0;
								}
							}
							local21.anInt2795 = local21.anInt2772 + 1;
							if (local21.anInt2795 >= local79.anIntArray47.length) {
								local21.anInt2795 -= local79.anInt587;
								if (local21.anInt2795 < 0 || local79.anIntArray47.length <= local21.anInt2795) {
									local21.anInt2795 = -1;
								}
							}
							Static468.method7221(local21);
						}
					}
				}
			}
		}
	}
}
