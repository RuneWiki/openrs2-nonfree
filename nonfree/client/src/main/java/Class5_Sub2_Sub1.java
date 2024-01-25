import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!af", name = "K", descriptor = "I")
	private int anInt212 = 32768;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt212 = arg0.method5968() << 4;
		} else if (arg1 == 1) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(28) int[] local28 = this.method9042(arg0, 1);
			@Pc(36) int[] local36 = this.method9042(arg0, 2);
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			for (@Pc(50) int local50 = 0; local50 < Static597.anInt10025; local50++) {
				@Pc(62) int local62 = local28[local50] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = this.anInt212 * local36[local50] >> 12;
				@Pc(79) int local79 = Static556.anIntArray515[local62] * local71 >> 12;
				@Pc(87) int local87 = Static214.anIntArray205[local62] * local71 >> 12;
				@Pc(95) int local95 = Static28.anInt365 & (local79 >> 12) + local50;
				@Pc(103) int local103 = Static273.anInt4903 & (local87 >> 12) + arg0;
				@Pc(109) int[][] local109 = this.method9033(0, local103);
				local40[local50] = local109[0][local95];
				local44[local50] = local109[1][local95];
				local48[local50] = local109[2][local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(27) int[] local27 = this.method9042(arg0, 1);
			@Pc(33) int[] local33 = this.method9042(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static597.anInt10025; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt212 * local33[local35] >> 12;
				@Pc(62) int local62 = Static556.anIntArray515[local45] * local54 >> 12;
				@Pc(70) int local70 = local54 * Static214.anIntArray205[local45] >> 12;
				@Pc(78) int local78 = Static28.anInt365 & local35 + (local62 >> 12);
				@Pc(86) int local86 = Static273.anInt4903 & (local70 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method9042(local86, 0);
				local11[local35] = local92[local78];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		Static528.method7829();
	}
}
