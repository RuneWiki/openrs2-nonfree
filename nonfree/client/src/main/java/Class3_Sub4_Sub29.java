import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class3_Sub4_Sub29 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
	private int anInt6356 = 32768;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(28) int[] local28 = this.method5960(1, arg0);
			@Pc(34) int[] local34 = this.method5960(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static106.anInt2356; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt6356 * local34[local36] >> 12;
				@Pc(63) int local63 = local55 * Static21.anIntArray46[local46] >> 12;
				@Pc(71) int local71 = local55 * Static441.anIntArray571[local46] >> 12;
				@Pc(80) int local80 = Static396.anInt6840 & local36 + (local63 >> 12);
				@Pc(88) int local88 = Static311.anInt5681 & (local71 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method5960(0, local88);
				local16[local36] = local94[local80];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6356 = arg1.method6004() << 4;
		} else if (arg0 == 1) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		Static251.method3833();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(23) int[] local23 = this.method5960(1, arg0);
			@Pc(29) int[] local29 = this.method5960(2, arg0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static106.anInt2356; local43++) {
				@Pc(55) int local55 = local23[local43] * 255 >> 12 & 0xFF;
				@Pc(64) int local64 = this.anInt6356 * local29[local43] >> 12;
				@Pc(72) int local72 = local64 * Static21.anIntArray46[local55] >> 12;
				@Pc(80) int local80 = Static441.anIntArray571[local55] * local64 >> 12;
				@Pc(89) int local89 = Static396.anInt6840 & local43 + (local72 >> 12);
				@Pc(98) int local98 = arg0 + (local80 >> 12) & Static311.anInt5681;
				@Pc(104) int[][] local104 = this.method5962(0, local98);
				local33[local43] = local104[0][local89];
				local37[local43] = local104[1][local89];
				local41[local43] = local104[2][local89];
			}
		}
		return local11;
	}
}
