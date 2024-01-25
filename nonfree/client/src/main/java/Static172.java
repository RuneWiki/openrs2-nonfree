import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fga", name = "Z", descriptor = "Lclient!ifa;")
	public static Class175 aClass175_2 = new Class175();

	@OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
	public static int anInt2988 = 0;

	@OriginalMember(owner = "client!fga", name = "Q", descriptor = "[I")
	public static int[] anIntArray223 = new int[13];

	@OriginalMember(owner = "client!fga", name = "cb", descriptor = "[I")
	public static final int[] anIntArray224 = new int[8];

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
	public static boolean method2596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IB)Lclient!fh;")
	public static Class118 method2597(@OriginalArg(0) int arg0) {
		@Pc(8) Class118[] local8 = Static192.method2750();
		for (@Pc(12) int local12 = 0; local12 < local8.length; local12++) {
			@Pc(18) Class118 local18 = local8[local12];
			if (arg0 == local18.anInt2992) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
	public static void method2600(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(20, (long) arg0);
		local9.method6245();
	}
}
