import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!ic;")
	public static Class113 aClass113_7;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public static int anInt231 = 20;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I[BII)I")
	public static int method186(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = -1;
		for (@Pc(18) int local18 = arg0; local18 < arg2; local18++) {
			local16 = Class242.anIntArray404[(arg1[local18] ^ local16) & 0xFF] ^ local16 >>> 8;
		}
		return ~local16;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method187(@OriginalArg(1) Class1_Sub30 arg0) {
		if (Static159.aClass82ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface9 local8 = null;
		if (arg0.anInt4703 == 0) {
			local8 = (Interface9) Static336.method4293(arg0.anInt4704, arg0.anInt4697, arg0.anInt4691);
		}
		if (arg0.anInt4703 == 1) {
			local8 = (Interface9) Static246.method3212(arg0.anInt4704, arg0.anInt4697, arg0.anInt4691);
		}
		if (arg0.anInt4703 == 2) {
			local8 = (Interface9) Static422.method5254(arg0.anInt4704, arg0.anInt4697, arg0.anInt4691, mq.class);
		}
		if (arg0.anInt4703 == 3) {
			local8 = (Interface9) Static261.method3366(arg0.anInt4704, arg0.anInt4697, arg0.anInt4691);
		}
		if (local8 == null) {
			arg0.anInt4696 = 0;
			arg0.anInt4699 = -1;
			arg0.anInt4698 = 0;
		} else {
			arg0.anInt4699 = local8.method5124();
			arg0.anInt4698 = local8.method5125();
			arg0.anInt4696 = local8.method5122();
		}
	}
}
