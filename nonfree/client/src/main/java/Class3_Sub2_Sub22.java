import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Z")
	private boolean aBoolean460 = true;

	@OriginalMember(owner = "client!oi", name = "Q", descriptor = "Z")
	private boolean aBoolean461 = true;

	static {
		new Class189("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(35) int[] local35 = this.method5894(0, this.aBoolean460 ? Static350.anInt3654 - arg0 : arg0);
			if (this.aBoolean461) {
				for (@Pc(40) int local40 = 0; local40 < Static406.anInt6694; local40++) {
					local11[local40] = local35[Static5.anInt72 - local40];
				}
			} else {
				Static462.method4613(local35, 0, local11, 0, Static406.anInt6694);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean461 = arg0.method2582() == 1;
		} else if (arg1 == 1) {
			this.aBoolean460 = arg0.method2582() == 1;
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(34) int[][] local34 = this.method5899(0, this.aBoolean460 ? Static350.anInt3654 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean461) {
				for (local63 = 0; local63 < Static406.anInt6694; local63++) {
					local50[local63] = local38[Static5.anInt72 - local63];
					local54[local63] = local42[Static5.anInt72 - local63];
					local58[local63] = local46[Static5.anInt72 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static406.anInt6694; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
