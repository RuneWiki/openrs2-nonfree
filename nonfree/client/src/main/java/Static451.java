import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public static int anInt7892;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Lclient!dn;")
	public static Class69 aClass69_86;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "[I")
	public static final int[] anIntArray730 = new int[25];

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_23 = new Class155("", 13);

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)V")
	public static void method6969(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(12, arg0);
		local8.method6700();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!dn;Ljava/lang/String;Z)Lclient!oh;")
	public static Class214 method6970(@OriginalArg(1) Class69 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) int local12 = arg0.method1909(arg1);
		if (local12 == -1) {
			return new Class214(0);
		}
		@Pc(26) int[] local26 = arg0.method1889(local12);
		@Pc(37) Class214 local37 = new Class214(local26.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local39 < local37.anInt6341) {
				@Pc(55) Class1_Sub17 local55 = new Class1_Sub17(arg0.method1888(local26[local41++], local12));
				@Pc(59) int local59 = local55.method4481();
				@Pc(63) int local63 = local55.method4494();
				@Pc(67) int local67 = local55.method4487();
				if (!arg2 && local67 == 1) {
					local37.anInt6341--;
				} else {
					local37.anIntArray619[local39] = local59;
					local37.anIntArray620[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
