import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 aClass3_Sub1_Sub4_Sub2_Sub1_4;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!he;")
	private static Class26 aClass26_1605 = Static6.method100("Login");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_1601 = aClass26_1605;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1602 = Static6.method100("VOLL");

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!he;")
	private static Class26 aClass26_1603 = Static6.method100("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1604 = aClass26_1603;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
	public static int method2008(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Lclient!uc;")
	public static Class3_Sub1_Sub17 method2009(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static22.aClass66_9.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static38.aClass16_58.method566(12, arg0);
		local10 = new Class3_Sub1_Sub17();
		if (local20 != null) {
			local10.method2125(new Class3_Sub11(local20));
		}
		local10.method2122();
		Static22.aClass66_9.method1969((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IJ)Lclient!he;")
	public static Class26 method2010(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(56) byte[] local56 = new byte[local31];
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local31--;
				local56[local31] = Static108.aByteArray38[(int) (local60 - arg0 * 37L)];
			}
			@Pc(87) Class26 local87 = new Class26();
			local87.aByteArray7 = local56;
			local87.anInt1345 = local56.length;
			return local87;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method2011() {
		Static102.aClass66_23.method1971();
		Static4.aClass66_1.method1971();
		Static20.aClass66_8.method1971();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
	public static int method2012(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method2013() {
		aClass26_1603 = null;
		aClass26_1605 = null;
		aClass26_1604 = null;
		aClass26_1601 = null;
		aClass3_Sub1_Sub4_Sub2_Sub1_4 = null;
		aClass26_1602 = null;
	}
}
