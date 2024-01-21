import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "Lclient!jg;")
	public static Class44 aClass44_11;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_557 = Static65.method1172("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_558 = Static65.method1172("::qa_op_test");

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	public static int anInt1655 = 1;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Lclient!kb;")
	public static Class46 aClass46_559 = Static65.method1172("rot:");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[Lclient!kb;II)Lclient!kb;")
	public static Class46 method1138(@OriginalArg(0) int arg0, @OriginalArg(1) Class46[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg2; local14++) {
			if (arg1[arg0 + local14] == null) {
				arg1[arg0 + local14] = Static167.aClass46_187;
			}
			local12 += arg1[local14 + arg0].anInt2034;
		}
		@Pc(50) byte[] local50 = new byte[local12];
		@Pc(52) int local52 = 0;
		@Pc(62) Class46 local62;
		for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
			local62 = arg1[arg0 + local54];
			Static184.method1309(local62.aByteArray17, 0, local50, local52, local62.anInt2034);
			local52 += local62.anInt2034;
		}
		local62 = new Class46();
		local62.aByteArray17 = local50;
		local62.anInt2034 = local12;
		return local62;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method1139() {
		aClass44_11 = null;
		aClass46_557 = null;
		aClass46_558 = null;
		aClass46_559 = null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ge;Lclient!me;II)V")
	public static void method1140(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class44_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class59 local9 = Static161.aClass59_13;
		synchronized (Static161.aClass59_13) {
			for (@Pc(16) Class3_Sub20 local16 = (Class3_Sub20) Static161.aClass59_13.method1731(); local16 != null; local16 = (Class3_Sub20) Static161.aClass59_13.method1734()) {
				if (local16.aLong143 == (long) arg2 && local16.aClass30_3 == arg0 && local16.anInt3200 == 0) {
					local7 = local16.aByteArray39;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(63) byte[] local63 = arg0.method1004(arg2);
			arg1.method1645(arg0, local63, arg2, true);
		} else {
			arg1.method1645(arg0, local7, arg2, true);
		}
	}
}
