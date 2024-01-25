import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	private int anInt1066 = 1024;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
	private int anInt1065 = 3072;

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
	private int anInt1058 = 2048;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1066 = arg0.method5968();
		} else if (arg1 == 1) {
			this.anInt1065 = arg0.method5968();
		} else if (arg1 == 2) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(29) int[] local29 = this.method9042(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static597.anInt10025; local31++) {
				local19[local31] = this.anInt1066 + (this.anInt1058 * local29[local31] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.anInt1058 = this.anInt1065 - this.anInt1066;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(21) int[][] local21 = this.method9033(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static597.anInt10025; local47++) {
				local37[local47] = this.anInt1066 + (local25[local47] * this.anInt1058 >> 12);
				local41[local47] = (local29[local47] * this.anInt1058 >> 12) + this.anInt1066;
				local45[local47] = this.anInt1066 + (local33[local47] * this.anInt1058 >> 12);
			}
		}
		return local11;
	}
}
