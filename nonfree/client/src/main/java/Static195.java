import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "[Lclient!fp;")
	public static final Class77[] aClass77Array1 = new Class77[29];

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
	public static final int[] anIntArray535 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method3488() {
		@Pc(9) Class103 local9 = Static200.aClass103_37;
		synchronized (Static200.aClass103_37) {
			Static200.aClass103_37.method2678();
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
	public static void method3490() {
		if (Static162.aClass123_4 == null) {
			return;
		}
		while (true) {
			while (Static179.anInt3651 < Static272.aClass187_Sub1Array2.length) {
				@Pc(26) Class187_Sub1 local26 = Static272.aClass187_Sub1Array2[Static179.anInt3651];
				if (local26 != null && local26.anInt5953 == -1) {
					if (Static62.aClass7_Sub39_1 == null) {
						Static62.aClass7_Sub39_1 = Static162.aClass123_4.method3245(local26.aString382);
					}
					@Pc(50) int local50 = Static62.aClass7_Sub39_1.anInt6210;
					if (local50 == -1) {
						return;
					}
					local26.anInt5953 = local50;
					Static62.aClass7_Sub39_1 = null;
					Static179.anInt3651++;
				} else {
					Static179.anInt3651++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([JIIZ[Ljava/lang/Object;)V")
	public static void method3491(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg2) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg2];
		arg0[arg2] = local21;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg2; local47++) {
			if (local21 + (long) (local47 & 0x1) > arg0[local47]) {
				@Pc(65) long local65 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local65;
				@Pc(79) Object local79 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local79;
			}
		}
		arg0[arg2] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method3491(arg0, arg1, local17 - 1, arg3);
		method3491(arg0, local17 + 1, arg2, arg3);
	}
}
