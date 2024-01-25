import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_37 = new Class242(43, 4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZLjava/lang/String;Lclient!oi;)Lclient!ku;")
	public static Class144 method1700(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class185 arg2) {
		@Pc(10) int local10 = arg2.method4005(arg1);
		if (local10 == -1) {
			return new Class144(0);
		}
		@Pc(23) int[] local23 = arg2.method3995(local10);
		@Pc(37) Class144 local37 = new Class144(local23.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt4097) {
				@Pc(55) Class1_Sub19 local55 = new Class1_Sub19(arg2.method4002(local10, local23[local41++]));
				@Pc(59) int local59 = local55.method2877();
				@Pc(63) int local63 = local55.method2896();
				@Pc(67) int local67 = local55.method2915();
				if (!arg0 && local67 == 1) {
					local37.anInt4097--;
				} else {
					local37.anIntArray289[local39] = local59;
					local37.anIntArray290[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1701() {
		@Pc(5) Class77 local5 = Static309.aClass77_37;
		synchronized (Static309.aClass77_37) {
			Static309.aClass77_37.method1395();
		}
		local5 = Static185.aClass77_25;
		synchronized (Static185.aClass77_25) {
			Static185.aClass77_25.method1395();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public static void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static178.method2589(Static102.aClass242_29);
		Static426.aClass1_Sub19_Sub2_2.method2889(arg1);
		Static426.aClass1_Sub19_Sub2_2.method2885(arg0);
	}
}
