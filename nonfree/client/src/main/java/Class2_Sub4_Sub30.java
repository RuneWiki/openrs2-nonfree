import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub4_Sub30 extends Class2_Sub4 {

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
	private int anInt5214 = 4;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	private int anInt5216 = 4;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5214 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt5216 = arg0.method5350();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(20) int local20 = Static76.anInt1458 / this.anInt5214;
			@Pc(25) int local25 = Static193.anInt3629 / this.anInt5216;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method5591(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method5591(Static193.anInt3629 * local42 / local25, 0);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static76.anInt1458; local78++) {
				@Pc(87) int local87;
				if (local20 <= 0) {
					local87 = 0;
				} else {
					@Pc(93) int local93 = local78 % local20;
					local87 = Static76.anInt1458 * local93 / local20;
				}
				local68[local78] = local56[local87];
				local72[local78] = local60[local87];
				local76[local78] = local64[local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(25) int local25 = Static76.anInt1458 / this.anInt5214;
			@Pc(30) int local30 = Static193.anInt3629 / this.anInt5216;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method5600(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method5600(Static193.anInt3629 * local44 / local30, 0);
			}
			for (local44 = 0; local44 < Static76.anInt1458; local44++) {
				if (local25 <= 0) {
					local11[local44] = local38[0];
				} else {
					@Pc(75) int local75 = local44 % local25;
					local11[local44] = local38[local75 * Static76.anInt1458 / local25];
				}
			}
		}
		return local11;
	}
}
