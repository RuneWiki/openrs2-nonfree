import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt129 = 1024;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private int anInt130 = 2048;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	private int anInt127 = 3072;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static147.anInt3075; local31++) {
				local11[local31] = this.anInt129 + (this.anInt130 * local29[local31] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[][] local29 = this.method7154(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static147.anInt3075; local55++) {
				local45[local55] = (local33[local55] * this.anInt130 >> 12) + this.anInt129;
				local49[local55] = (local37[local55] * this.anInt130 >> 12) + this.anInt129;
				local53[local55] = (local41[local55] * this.anInt130 >> 12) + this.anInt129;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.anInt130 = this.anInt127 - this.anInt129;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt129 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt127 = arg1.method4227();
		} else if (arg0 == 2) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}
}
