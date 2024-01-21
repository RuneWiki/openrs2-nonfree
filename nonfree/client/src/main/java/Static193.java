import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	public static int anInt4611;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	public static int anInt4612;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1312 = Static158.method3034("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1306 = aClass60_1312;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt4599 = 0;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1308 = Static158.method3034("purple:");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1309 = aClass60_1308;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
	public static final int[] anIntArray501 = new int[1000];

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1310 = aClass60_1308;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1311 = Static158.method3034("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIII)Z")
	public static boolean method3534(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg0);
		@Pc(17) int local17 = -1;
		@Pc(19) boolean local19 = true;
		label54: while (true) {
			@Pc(23) int local23 = local11.method232();
			if (local23 == 0) {
				return local19;
			}
			local17 += local23;
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(39) int local39;
				while (!local31) {
					local39 = local11.method237();
					if (local39 == 0) {
						continue label54;
					}
					local33 += local39 - 1;
					@Pc(67) int local67 = local33 >> 6 & 0x3F;
					@Pc(71) int local71 = local33 & 0x3F;
					@Pc(77) int local77 = local11.method218() >> 2;
					@Pc(81) int local81 = local67 + arg2;
					@Pc(85) int local85 = arg1 + local71;
					if (local81 > 0 && local85 > 0 && local81 < 103 && local85 < 103) {
						@Pc(103) Class2_Sub1_Sub9 local103 = Static158.method3037(local17);
						if (local77 != 22 || !Static8.aBoolean3 || local103.anInt1669 != 0 || local103.anInt1674 == 1 || local103.aBoolean68) {
							local31 = true;
							if (!local103.method1250()) {
								Static72.anInt2167++;
								local19 = false;
							}
						}
					}
				}
				local39 = local11.method237();
				if (local39 == 0) {
					break;
				}
				local11.method218();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([Lclient!ob;I)Lclient!ob;")
	public static Class60 method3536(@OriginalArg(0) Class60[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static20.method446(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!pe;Lclient!pe;III)Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 method3537(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return Static52.method1229(arg2, arg0, arg3) ? Static97.method2264(arg1.method521(arg3, arg2)) : null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)I")
	public static int method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
