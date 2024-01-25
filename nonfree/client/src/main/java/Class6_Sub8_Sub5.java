import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class6_Sub8_Sub5 extends Class6_Sub8 {

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	private int anInt3255 = 4;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
	private int anInt3252 = 4;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(28) int local28 = Static83.anInt1268 / this.anInt3255;
			@Pc(33) int local33 = Static226.anInt4404 / this.anInt3252;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method8930(Static226.anInt4404 * local42 / local33, 0);
			} else {
				local52 = this.method8930(0, 0);
			}
			for (local42 = 0; local42 < Static83.anInt1268; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(85) int local85 = local42 % local28;
					local19[local42] = local52[Static83.anInt1268 * local85 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3255 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt3252 = arg1.method3030();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(20) int local20 = Static83.anInt1268 / this.anInt3255;
			@Pc(25) int local25 = Static226.anInt4404 / this.anInt3252;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method8928(0, Static226.anInt4404 * local34 / local25);
			} else {
				local44 = this.method8928(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static83.anInt1268; local78++) {
				@Pc(89) int local89;
				if (local20 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local78 % local20;
					local89 = local95 * Static83.anInt1268 / local20;
				}
				local68[local78] = local56[local89];
				local72[local78] = local60[local89];
				local76[local78] = local64[local89];
			}
		}
		return local11;
	}
}
