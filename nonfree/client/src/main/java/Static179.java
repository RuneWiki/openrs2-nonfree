import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	public static int anInt9618 = 0;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
	public static int anInt9624 = -1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIILclient!lp;)V")
	public static void method7837(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class216 arg3) {
		for (@Pc(14) Class3_Sub30 local14 = (Class3_Sub30) Static488.aClass302_50.method6603(); local14 != null; local14 = (Class3_Sub30) Static488.aClass302_50.method6605()) {
			if (local14.anInt4804 == arg1 && local14.anInt4789 == arg2 << 9 && local14.anInt4790 == arg0 << 9 && arg3.anInt5946 == local14.aClass216_1.anInt5946) {
				if (local14.aClass3_Sub12_Sub4_4 != null) {
					Static156.aClass3_Sub12_Sub1_1.method1766(local14.aClass3_Sub12_Sub4_4);
					local14.aClass3_Sub12_Sub4_4 = null;
				}
				if (local14.aClass3_Sub12_Sub4_3 != null) {
					Static156.aClass3_Sub12_Sub1_1.method1766(local14.aClass3_Sub12_Sub4_3);
					local14.aClass3_Sub12_Sub4_3 = null;
				}
				local14.method9034();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)V")
	public static void method7839(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class3_Sub30 local10 = (Class3_Sub30) Static488.aClass302_50.method6603(); local10 != null; local10 = (Class3_Sub30) Static488.aClass302_50.method6605()) {
			if (local10.aClass3_Sub12_Sub4_4 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(local10.aClass3_Sub12_Sub4_4);
				local10.aClass3_Sub12_Sub4_4 = null;
			}
			if (local10.aClass3_Sub12_Sub4_3 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(local10.aClass3_Sub12_Sub4_3);
				local10.aClass3_Sub12_Sub4_3 = null;
			}
			local10.method9034();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(56) Class3_Sub30 local56 = (Class3_Sub30) Static533.aClass302_48.method6603(); local56 != null; local56 = (Class3_Sub30) Static533.aClass302_48.method6605()) {
			if (local56.aClass3_Sub12_Sub4_4 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(local56.aClass3_Sub12_Sub4_4);
				local56.aClass3_Sub12_Sub4_4 = null;
			}
			local56.method9034();
		}
		for (@Pc(85) Class3_Sub30 local85 = (Class3_Sub30) Static588.aClass333_42.method7490(); local85 != null; local85 = (Class3_Sub30) Static588.aClass333_42.method7487()) {
			if (local85.aClass3_Sub12_Sub4_4 != null) {
				Static156.aClass3_Sub12_Sub1_1.method1766(local85.aClass3_Sub12_Sub4_4);
				local85.aClass3_Sub12_Sub4_4 = null;
			}
			local85.method9034();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBI)V")
	public static void method7843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(95) Class368 local95 = Static254.aClass368ArrayArrayArray2[arg1][arg2][arg3];
			if (local95 != null) {
				if (arg0 == 1) {
					local95.aShort112 = 0;
				} else if (arg0 == 2) {
					local95.aShort111 = 0;
				}
			}
			Static70.method1231();
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static667.anInt10815; local22++) {
			@Pc(28) Class272 local28 = Static621.aClass272Array40[local22];
			if (local28.aByte113 == arg0 && local28.aShort63 == arg2 && arg3 == local28.aShort61 || arg2 == local28.aShort62 && local28.aShort61 == arg3) {
				if (Static667.anInt10815 != local22) {
					Static681.method4033(Static621.aClass272Array40, local22 + 1, Static621.aClass272Array40, local22, Static621.aClass272Array40.length - local22 - 1);
				}
				Static667.anInt10815--;
				return;
			}
		}
	}
}
