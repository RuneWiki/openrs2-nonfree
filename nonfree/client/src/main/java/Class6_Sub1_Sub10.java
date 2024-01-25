import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
	private int anInt3397 = 1024;

	@OriginalMember(owner = "client!ev", name = "D", descriptor = "I")
	private int anInt3395 = 2048;

	@OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
	private int anInt3401 = 3072;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(27) int[] local27 = this.method8731(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static53.anInt1787; local29++) {
				local17[local29] = this.anInt3397 + (local27[local29] * this.anInt3395 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3397 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt3401 = arg1.method8220();
		} else if (arg0 == 2) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(21) int[][] local21 = this.method8725(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static53.anInt1787; local47++) {
				local37[local47] = this.anInt3397 + (local25[local47] * this.anInt3395 >> 12);
				local41[local47] = (this.anInt3395 * local29[local47] >> 12) + this.anInt3397;
				local45[local47] = (local33[local47] * this.anInt3395 >> 12) + this.anInt3397;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.anInt3395 = this.anInt3401 - this.anInt3397;
	}
}
