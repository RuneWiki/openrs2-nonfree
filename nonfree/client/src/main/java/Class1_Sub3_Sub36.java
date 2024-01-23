import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
	private int anInt5070 = 0;

	@OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
	private int anInt5072 = 1;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
	private int anInt5068 = 0;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5070 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt5068 = arg0.method2690();
		} else if (arg1 == 3) {
			this.anInt5072 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(25) int local25 = Static132.anIntArray265[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static227.anInt4511; local33++) {
				@Pc(40) int local40 = Static209.anIntArray377[local33];
				@Pc(46) int local46 = local40 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt5070 == 0) {
					local70 = this.anInt5072 * (local40 - local25);
				} else {
					@Pc(60) int local60 = local46 * local46 + local31 * local31 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt5072 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt5068 == 0) {
					local70 = Static112.anIntArray231[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5068 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local11[local33] = local70;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		Static19.method365();
	}
}
