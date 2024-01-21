import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!mb;")
	public static Class4_Sub4_Sub5_Sub3_Sub1 aClass4_Sub4_Sub5_Sub3_Sub1_3;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public static int anInt1471;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_13;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
	public static boolean aBoolean87;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!vf;")
	public static Class78 aClass78_6 = new Class78();

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_620 = Static134.method2017("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt1472 = -1;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!v;")
	private static Class76 aClass76_621 = Static134.method2017("Too many connections from your address)3");

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!v;")
	public static Class76 aClass76_622 = Static134.method2017(" <col=ffff00>");

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_623 = aClass76_621;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_624 = Static134.method2017("b12_full");

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!v;")
	public static Class76 aClass76_625 = Static134.method2017("rot:");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBILclient!dc;ZBI)V")
	public static void method981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class17_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = (long) ((arg5 << 16) + arg0);
		@Pc(13) Class4_Sub4_Sub16 local13 = (Class4_Sub4_Sub16) Static111.aClass28_10.method770(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class4_Sub4_Sub16) Static118.aClass28_13.method770(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class4_Sub4_Sub16) Static35.aClass28_2.method770(local7);
		if (local13 == null) {
			if (!arg3) {
				local13 = (Class4_Sub4_Sub16) Static94.aClass28_8.method770(local7);
				if (local13 != null) {
					return;
				}
			}
			local13 = new Class4_Sub4_Sub16();
			local13.aClass17_Sub1_19 = arg2;
			local13.aByte8 = arg4;
			local13.anInt2557 = arg1;
			if (arg3) {
				Static111.aClass28_10.method774(local7, local13);
				Static59.anInt1537++;
			} else {
				Static31.aClass83_1.method2021(local13);
				Static35.aClass28_2.method774(local7, local13);
				Static15.anInt255++;
			}
		} else if (arg3) {
			local13.method1944();
			Static111.aClass28_10.method774(local7, local13);
			Static15.anInt255--;
			Static59.anInt1537++;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method982() {
		aClass17_Sub1_13 = null;
		aClass76_622 = null;
		anIntArray187 = null;
		aClass76_623 = null;
		aClass76_625 = null;
		aClass76_620 = null;
		aClass78_6 = null;
		aClass76_621 = null;
		aClass4_Sub4_Sub5_Sub3_Sub1_3 = null;
		aClass76_624 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)Lclient!v;")
	public static Class76 method983(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) byte[] local46 = new byte[local28];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local28--;
				local46[local28] = Static29.aByteArray10[(int) (local50 - arg0 * 37L)];
			}
			@Pc(77) Class76 local77 = new Class76();
			local77.aByteArray71 = local46;
			local77.anInt2668 = local46.length;
			return local77;
		}
	}
}
