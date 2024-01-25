import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
	public static final int[] anIntArray609 = new int[13];

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "[C")
	public static final char[] aCharArray14 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!lga;)V")
	public static void method8203(@OriginalArg(1) Class223 arg0) {
		Static607.anInt9575 = arg0.method5257("p11_full");
		Static254.anInt4888 = arg0.method5257("p12_full");
		Static360.anInt6091 = arg0.method5257("b12_full");
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III[BBI[BII)V")
	public static void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(22) int local22 = -(arg7 & 0x3);
		for (@Pc(25) int local25 = -arg1; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg2++;
				arg5[local33] += arg3[arg0++];
				@Pc(45) int local45 = arg2++;
				arg5[local45] += arg3[arg0++];
				@Pc(57) int local57 = arg2++;
				arg5[local57] += arg3[arg0++];
				@Pc(69) int local69 = arg2++;
				arg5[local69] += arg3[arg0++];
			}
			for (@Pc(89) int local89 = local22; local89 < 0; local89++) {
				local33 = arg2++;
				arg5[local33] += arg3[arg0++];
			}
			arg0 += arg6;
			arg2 += arg4;
		}
	}
}
