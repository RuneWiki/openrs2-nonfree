import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[Lclient!ps;")
	public static Class163[] aClass163Array2;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	public static int anInt1488;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt1490;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_30 = new Class37(16);

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLclient!nj;)Lclient!fa;")
	public static Class1_Sub5 method1248(@OriginalArg(1) Class1_Sub21 arg0) {
		arg0.method5720();
		@Pc(13) int local13 = arg0.method5720();
		@Pc(17) Class1_Sub5 local17 = Static22.method396(local13);
		local17.anInt6691 = arg0.method5720();
		@Pc(26) int local26 = arg0.method5720();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method5720();
			local17.method5814(arg0, local39);
		}
		local17.method5801();
		return local17;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	public static void method1250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub2_1 != null) {
			local7.aClass10_Sub2_1 = null;
		}
		if (local7.aClass10_Sub2_2 != null) {
			local7.aClass10_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	public static void method1252(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static67.anInt1464 = arg0;
	}
}
