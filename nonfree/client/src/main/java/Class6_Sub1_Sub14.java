import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "Z")
	private boolean aBoolean309 = true;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "Z")
	private boolean aBoolean310 = true;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(34) int[] local34 = this.method8165(0, this.aBoolean310 ? Static574.anInt9711 - arg0 : arg0);
			if (this.aBoolean309) {
				for (@Pc(39) int local39 = 0; local39 < Static289.anInt5549; local39++) {
					local17[local39] = local34[Static153.anInt3343 - local39];
				}
			} else {
				Static589.method5383(local34, 0, local17, 0, Static289.anInt5549);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean309 = arg1.method4966() == 1;
		} else if (arg0 == 1) {
			this.aBoolean310 = arg1.method4966() == 1;
		} else if (arg0 == 2) {
			super.aBoolean719 = arg1.method4966() == 1;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(34) int[][] local34 = this.method8162(this.aBoolean310 ? Static574.anInt9711 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean309) {
				for (local63 = 0; local63 < Static289.anInt5549; local63++) {
					local50[local63] = local38[Static153.anInt3343 - local63];
					local54[local63] = local42[Static153.anInt3343 - local63];
					local58[local63] = local46[Static153.anInt3343 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static289.anInt5549; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
