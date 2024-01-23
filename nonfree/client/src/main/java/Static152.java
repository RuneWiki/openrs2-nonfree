import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!ob;")
	public static Class1_Sub1_Sub14 aClass1_Sub1_Sub14_1;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public static int anInt3164 = 0;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "[I")
	public static int[] anIntArray328 = new int[32];

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public static int anInt3168 = 255;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1052 = Static186.method3527("Connecting to update server");

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1051 = aClass50_1052;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1053 = Static186.method3527("Angreifen");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!wi;")
	public static Class1_Sub1_Sub18 method2546(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub18 local6 = (Class1_Sub1_Sub18) Static54.aClass4_2.method81((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static142.aClass86_50.method3325(0, arg0);
		} else {
			local23 = Static159.aClass86_79.method3325(0, arg0 & 0x7FFF);
		}
		local6 = new Class1_Sub1_Sub18();
		if (local23 != null) {
			local6.method3514(new Class1_Sub17(local23));
		}
		if (arg0 >= 32768) {
			local6.method3520();
		}
		Static54.aClass4_2.method83(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!pg;)Lclient!o;")
	public static Class80 method2547(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(14) Class80 local14 = new Class80();
		local14.anInt3082 = arg0.method2178();
		local14.aClass1_Sub1_Sub11_1 = Static219.method2418(local14.anInt3082);
		return local14;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
	public static void method2549(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray142.length; local21++) {
				local12.anIntArray142[local21] = -1;
				local12.anIntArray140[local21] = 0;
			}
		}
	}
}
