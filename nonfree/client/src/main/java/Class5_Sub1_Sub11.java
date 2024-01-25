import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class5_Sub1_Sub11 extends Class5_Sub1 {

	@OriginalMember(owner = "client!io", name = "D", descriptor = "I")
	private int anInt4498 = 0;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "I")
	private int anInt4505 = 4096;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(28) int[][] local28 = this.method9203(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static648.anInt9588; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local36[local54];
				@Pc(68) int local68 = local40[local54];
				if (local60 < this.anInt4498) {
					local44[local54] = this.anInt4498;
				} else if (local60 <= this.anInt4505) {
					local44[local54] = local60;
				} else {
					local44[local54] = this.anInt4505;
				}
				if (this.anInt4498 > local64) {
					local48[local54] = this.anInt4498;
				} else if (this.anInt4505 >= local64) {
					local48[local54] = local64;
				} else {
					local48[local54] = this.anInt4505;
				}
				if (this.anInt4498 > local68) {
					local52[local54] = this.anInt4498;
				} else if (local68 > this.anInt4505) {
					local52[local54] = this.anInt4505;
				} else {
					local52[local54] = local68;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(21) int[] local21 = this.method9210(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static648.anInt9588; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt4498) {
					local11[local23] = this.anInt4498;
				} else if (local29 > this.anInt4505) {
					local11[local23] = this.anInt4505;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt4498 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt4505 = arg1.method8519();
		} else if (arg0 == 2) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}
}
