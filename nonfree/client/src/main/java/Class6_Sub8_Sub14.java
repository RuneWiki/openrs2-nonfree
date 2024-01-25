import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class6_Sub8_Sub14 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
	private boolean aBoolean401 = true;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "Z")
	private boolean aBoolean402 = true;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean402 = arg1.method3030() == 1;
		} else if (arg0 == 1) {
			this.aBoolean401 = arg1.method3030() == 1;
		} else if (arg0 == 2) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(40) int[] local40 = this.method8930(this.aBoolean401 ? Static165.anInt3453 - arg0 : arg0, 0);
			if (this.aBoolean402) {
				for (@Pc(55) int local55 = 0; local55 < Static83.anInt1268; local55++) {
					local11[local55] = local40[Static333.anInt5727 - local55];
				}
			} else {
				Static695.method5649(local40, 0, local11, 0, Static83.anInt1268);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(41) int[][] local41 = this.method8928(0, this.aBoolean401 ? Static165.anInt3453 - arg0 : arg0);
			@Pc(45) int[] local45 = local41[0];
			@Pc(49) int[] local49 = local41[1];
			@Pc(53) int[] local53 = local41[2];
			@Pc(57) int[] local57 = local11[0];
			@Pc(61) int[] local61 = local11[1];
			@Pc(65) int[] local65 = local11[2];
			@Pc(70) int local70;
			if (this.aBoolean402) {
				for (local70 = 0; local70 < Static83.anInt1268; local70++) {
					local57[local70] = local45[Static333.anInt5727 - local70];
					local61[local70] = local49[Static333.anInt5727 - local70];
					local65[local70] = local53[Static333.anInt5727 - local70];
				}
			} else {
				for (local70 = 0; local70 < Static83.anInt1268; local70++) {
					local57[local70] = local45[local70];
					local61[local70] = local49[local70];
					local65[local70] = local53[local70];
				}
			}
		}
		return local11;
	}
}
