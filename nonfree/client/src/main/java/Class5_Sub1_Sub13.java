import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	private int anInt5428 = 3072;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	private int anInt5429 = 1024;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
	private int anInt5433 = 2048;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(21) int[] local21 = this.method9210(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static648.anInt9588; local23++) {
				local11[local23] = (local21[local23] * this.anInt5433 >> 12) + this.anInt5429;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt5429 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt5428 = arg1.method8519();
		} else if (arg0 == 2) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.anInt5433 = this.anInt5428 - this.anInt5429;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
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
				local44[local54] = (local32[local54] * this.anInt5433 >> 12) + this.anInt5429;
				local48[local54] = this.anInt5429 + (this.anInt5433 * local36[local54] >> 12);
				local52[local54] = this.anInt5429 + (this.anInt5433 * local40[local54] >> 12);
			}
		}
		return local11;
	}
}
