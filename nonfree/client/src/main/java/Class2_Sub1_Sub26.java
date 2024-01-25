import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "Z")
	private boolean aBoolean515 = true;

	@OriginalMember(owner = "client!qp", name = "R", descriptor = "Z")
	private boolean aBoolean516 = true;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(34) int[] local34 = this.method6037(this.aBoolean515 ? Static36.anInt893 - arg0 : arg0, 0);
			if (this.aBoolean516) {
				for (@Pc(47) int local47 = 0; local47 < Static131.anInt2581; local47++) {
					local11[local47] = local34[Static287.anInt5227 - local47];
				}
			} else {
				Static459.method3353(local34, 0, local11, 0, Static131.anInt2581);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(31) int[][] local31 = this.method6031(0, this.aBoolean515 ? Static36.anInt893 - arg0 : arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(60) int local60;
			if (this.aBoolean516) {
				for (local60 = 0; local60 < Static131.anInt2581; local60++) {
					local47[local60] = local35[Static287.anInt5227 - local60];
					local51[local60] = local39[Static287.anInt5227 - local60];
					local55[local60] = local43[Static287.anInt5227 - local60];
				}
			} else {
				for (local60 = 0; local60 < Static131.anInt2581; local60++) {
					local47[local60] = local35[local60];
					local51[local60] = local39[local60];
					local55[local60] = local43[local60];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean516 = arg1.method3737() == 1;
		} else if (arg0 == 1) {
			this.aBoolean515 = arg1.method3737() == 1;
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}
}
