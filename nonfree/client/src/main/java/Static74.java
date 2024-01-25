import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!kha;IB)Lclient!ng;")
	public static Class3_Sub1_Sub16 method1851(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class3_Sub15 local12 = new Class3_Sub15(arg1.method5023(arg2, arg0));
		@Pc(47) Class3_Sub1_Sub16 local47 = new Class3_Sub1_Sub16(arg0, local12.method8413(), local12.method8413(), local12.method8402(), local12.method8402(), local12.method8401() == 1, local12.method8401(), local12.method8401());
		@Pc(51) int local51 = local12.method8401();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass276_45.method6906(new Class3_Sub3(local12.method8401(), local12.method8414(), local12.method8414(), local12.method8414(), local12.method8414(), local12.method8414(), local12.method8414(), local12.method8414(), local12.method8414()));
		}
		local47.method5928();
		return local47;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method1852() {
		Static411.anImage1 = null;
		Static553.aFont2 = null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZLclient!kha;Ljava/lang/String;)Lclient!dca;")
	public static Class57 method1856(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class181 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method5033(arg2);
		if (local10 == -1) {
			return new Class57(0);
		}
		@Pc(23) int[] local23 = arg1.method5030(local10);
		@Pc(34) Class57 local34 = new Class57(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt2284) {
				@Pc(54) Class3_Sub15 local54 = new Class3_Sub15(arg1.method5023(local10, local23[local38++]));
				@Pc(58) int local58 = local54.method8402();
				@Pc(62) int local62 = local54.method8414();
				@Pc(66) int local66 = local54.method8401();
				if (!arg0 && local66 == 1) {
					local34.anInt2284--;
				} else {
					local34.anIntArray92[local36] = local58;
					local34.anIntArray93[local36] = local62;
					local36++;
				}
			}
			return local34;
		}
	}
}
