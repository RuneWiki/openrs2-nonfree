import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)Z")
	public static boolean method5547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static18.method242(arg1, arg0) || Static247.method4091(arg1, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!raa;III)V")
	public static void method5548(@OriginalArg(0) Class295 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static9.anInt207 = arg1;
		Static302.anInt5273 = arg2;
		Static188.aClass295_17 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIJ)V")
	public static void method5549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(18) int local18 = (int) arg2 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static552.method8051(arg0, 0, true, 0, local25, local18, arg1, 0);
			return;
		}
		@Pc(62) Class181 local62 = Static61.aClass246_7.method5497(local32);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (local25 == 0 || local25 == 2) {
			local75 = local62.anInt4756;
			local72 = local62.anInt4781;
		} else {
			local72 = local62.anInt4756;
			local75 = local62.anInt4781;
		}
		@Pc(86) int local86 = local62.anInt4747;
		if (local25 != 0) {
			local86 = (local86 << local25 & 0xF) + (local86 >> 4 - local25);
		}
		Static552.method8051(arg0, local75, true, local72, 0, 0, arg1, local86);
	}
}
