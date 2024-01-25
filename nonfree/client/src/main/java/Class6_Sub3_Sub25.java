import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class6_Sub3_Sub25 extends Class6_Sub3 {

	@OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
	private int anInt6219 = 3072;

	@OriginalMember(owner = "client!oca", name = "Q", descriptor = "I")
	private int anInt6224 = 1024;

	@OriginalMember(owner = "client!oca", name = "O", descriptor = "I")
	private int anInt6222 = 2048;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static447.anInt8568; local55++) {
				local45[local55] = this.anInt6224 + (local33[local55] * this.anInt6222 >> 12);
				local49[local55] = (this.anInt6222 * local37[local55] >> 12) + this.anInt6224;
				local53[local55] = this.anInt6224 + (local41[local55] * this.anInt6222 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(21) int[] local21 = this.method7824(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static447.anInt8568; local23++) {
				local11[local23] = this.anInt6224 + (local21[local23] * this.anInt6222 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.anInt6222 = this.anInt6219 - this.anInt6224;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6224 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt6219 = arg1.method6006();
		} else if (arg0 == 2) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}
}
