import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class6_Sub4_Sub28 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
	private int anInt7428 = 2048;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
	private int anInt7431 = 3072;

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
	private int anInt7432 = 1024;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static408.anInt7209; local31++) {
				local11[local31] = (local29[local31] * this.anInt7428 >> 12) + this.anInt7432;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method7747(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static408.anInt7209; local55++) {
				local45[local55] = (local33[local55] * this.anInt7428 >> 12) + this.anInt7432;
				local49[local55] = this.anInt7432 + (local37[local55] * this.anInt7428 >> 12);
				local53[local55] = this.anInt7432 + (local41[local55] * this.anInt7428 >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt7432 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt7431 = arg1.method6003();
		} else if (arg0 == 2) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.anInt7428 = this.anInt7431 - this.anInt7432;
	}
}
