import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class5_Sub2_Sub28 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
	private int anInt8242 = 4;

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
	private int anInt8239 = 4;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(20) int local20 = Static195.anInt3759 / this.anInt8239;
			@Pc(25) int local25 = Static195.anInt3756 / this.anInt8242;
			@Pc(36) int[] local36;
			@Pc(42) int local42;
			if (local25 <= 0) {
				local36 = this.method8945(0, 0);
			} else {
				local42 = arg0 % local25;
				local36 = this.method8945(local42 * Static195.anInt3756 / local25, 0);
			}
			for (local42 = 0; local42 < Static195.anInt3759; local42++) {
				if (local20 <= 0) {
					local11[local42] = local36[0];
				} else {
					@Pc(70) int local70 = local42 % local20;
					local11[local42] = local36[local70 * Static195.anInt3759 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8239 = arg0.method7816();
		} else if (arg1 == 1) {
			this.anInt8242 = arg0.method7816();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(20) int local20 = Static195.anInt3759 / this.anInt8239;
			@Pc(25) int local25 = Static195.anInt3756 / this.anInt8242;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method8952(0, local34 * Static195.anInt3756 / local25);
			} else {
				local44 = this.method8952(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static195.anInt3759; local78++) {
				@Pc(95) int local95;
				if (local20 > 0) {
					@Pc(89) int local89 = local78 % local20;
					local95 = Static195.anInt3759 * local89 / local20;
				} else {
					local95 = 0;
				}
				local68[local78] = local56[local95];
				local72[local78] = local60[local95];
				local76[local78] = local64[local95];
			}
		}
		return local11;
	}
}
