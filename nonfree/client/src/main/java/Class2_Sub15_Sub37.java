import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class2_Sub15_Sub37 extends Class2_Sub15 {

	@OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
	private int anInt11295 = 3072;

	@OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
	private int anInt11297 = 1024;

	@OriginalMember(owner = "client!wia", name = "K", descriptor = "I")
	private int anInt11300 = 2048;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.anInt11300 = this.anInt11295 - this.anInt11297;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt11297 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt11295 = arg1.method5211();
		} else if (arg0 == 2) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(28) int[][] local28 = this.method9727(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static329.anInt6017; local54++) {
				local44[local54] = this.anInt11297 + (local32[local54] * this.anInt11300 >> 12);
				local48[local54] = this.anInt11297 + (this.anInt11300 * local36[local54] >> 12);
				local52[local54] = this.anInt11297 + (local40[local54] * this.anInt11300 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(27) int[] local27 = this.method9725(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static329.anInt6017; local29++) {
				local11[local29] = this.anInt11297 + (this.anInt11300 * local27[local29] >> 12);
			}
		}
		return local11;
	}
}
