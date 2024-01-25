import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	public static void method6670() {
		if (Static342.anInt6342 <= 0) {
			Static466.aString103 = "";
			return;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static301.aStringArray32.length; local12++) {
			if (Static301.aStringArray32[local12].startsWith("--> ")) {
				@Pc(23) int local23 = ~Static342.anInt6342;
				local10++;
				if (local23 == ~local10) {
					Static466.aString103 = Static301.aStringArray32[local12].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
	public static void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub3_2 != null) {
			local7.aClass11_Sub3_2 = null;
		}
		if (local7.aClass11_Sub3_1 != null) {
			local7.aClass11_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!fp;IILclient!fp;IBIIII)V")
	public static void method6673(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(3) Class11_Sub1_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method6205();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class66 local21 = (Class66) Static208.aClass245_35.method6082((long) local7);
		if (local21 == null) {
			@Pc(28) Class1[] local28 = Static583.method50(Static132.aClass168_118, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static323.aClass9_8.method5412(local28[0]);
			Static208.aClass245_35.method6075(local21, (long) local7);
		}
		Static167.method3393(arg2 >> 1, arg0.aByte77, arg0.anInt7347, arg0.anInt7351, 0, arg0.method6212() * 256, arg4 >> 1);
		@Pc(74) int local74 = Static350.anIntArray431[0] + arg6 - 18;
		@Pc(82) int local82 = local74 + arg5 / 4 * 18;
		@Pc(93) int local93 = arg3 + Static350.anIntArray431[1] - 16 - 54;
		@Pc(101) int local101 = local93 + arg5 % 4 * 18;
		local21.method8066(local82, local101);
		if (arg0 == arg1) {
			Static323.aClass9_8.method5444(local101 - 1, -256, 18, local82 - 1, 18);
		}
		@Pc(123) Class5_Sub8 local123 = Static455.method7060();
		local123.anInt8715 = local101 + 16;
		local123.aClass11_Sub1_Sub1_1 = arg1;
		local123.anInt8717 = local82;
		local123.anInt8716 = local82 + 16;
		local123.anInt8720 = local101;
		Static436.aClass267_6.method6538(local123);
	}
}
