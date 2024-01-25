import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class2_Sub4_Sub28 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
	private int anInt6376 = 2048;

	@OriginalMember(owner = "client!mw", name = "K", descriptor = "I")
	private int anInt6380 = 3072;

	@OriginalMember(owner = "client!mw", name = "L", descriptor = "I")
	private int anInt6381 = 1024;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(29) int[][] local29 = this.method8898(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static395.anInt6816; local55++) {
				local45[local55] = this.anInt6381 + (this.anInt6376 * local33[local55] >> 12);
				local49[local55] = (local37[local55] * this.anInt6376 >> 12) + this.anInt6381;
				local53[local55] = (local41[local55] * this.anInt6376 >> 12) + this.anInt6381;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(26) int[] local26 = this.method8892(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static395.anInt6816; local28++) {
				local11[local28] = (this.anInt6376 * local26[local28] >> 12) + this.anInt6381;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.anInt6376 = this.anInt6380 - this.anInt6381;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6381 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt6380 = arg0.method2825();
		} else if (arg1 == 2) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}
}
