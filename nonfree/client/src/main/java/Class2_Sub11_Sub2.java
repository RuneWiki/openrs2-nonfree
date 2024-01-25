import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
	private int anInt2028 = 3072;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
	private int anInt2030 = 2048;

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
	private int anInt2034 = 1024;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2034 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt2028 = arg1.method8575();
		} else if (arg0 == 2) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(27) int[] local27 = this.method9540(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static301.anInt10214; local29++) {
				local17[local29] = (local27[local29] * this.anInt2030 >> 12) + this.anInt2034;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.anInt2030 = this.anInt2028 - this.anInt2034;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(24) int[][] local24 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(34) int[][] local34 = this.method9538(0, arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local24[0];
			@Pc(54) int[] local54 = local24[1];
			@Pc(58) int[] local58 = local24[2];
			for (@Pc(60) int local60 = 0; local60 < Static301.anInt10214; local60++) {
				local50[local60] = (this.anInt2030 * local38[local60] >> 12) + this.anInt2034;
				local54[local60] = (this.anInt2030 * local42[local60] >> 12) + this.anInt2034;
				local58[local60] = this.anInt2034 + (this.anInt2030 * local46[local60] >> 12);
			}
		}
		return local24;
	}
}
