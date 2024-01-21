import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
	private int anInt3661 = 32768;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		Static53.method1249();
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(25) int[] local25 = this.method3569(arg0, 1);
			@Pc(31) int[] local31 = this.method3569(arg0, 2);
			@Pc(35) int[] local35 = local15[1];
			@Pc(39) int[] local39 = local15[0];
			@Pc(43) int[] local43 = local15[2];
			for (@Pc(45) int local45 = 0; local45 < Static106.anInt3045; local45++) {
				@Pc(56) int local56 = this.anInt3661 * local31[local45] >> 12;
				@Pc(66) int local66 = local25[local45] * 255 >> 12 & 0xFF;
				@Pc(74) int local74 = Static155.anIntArray438[local66] * local56 >> 12;
				@Pc(82) int local82 = local56 * Static122.anIntArray389[local66] >> 12;
				@Pc(90) int local90 = Static96.anInt3099 & (local82 >> 12) + local45;
				@Pc(98) int local98 = Static53.anInt1668 & (local74 >> 12) + arg0;
				@Pc(104) int[][] local104 = this.method3557(local98, 0);
				local39[local45] = local104[0][local90];
				local35[local45] = local104[1][local90];
				local43[local45] = local104[2][local90];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3661 = arg1.method234() << 4;
		} else if (arg0 == 1) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 1);
			@Pc(32) int[] local32 = this.method3569(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static106.anInt3045; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt3661 * local32[local34] >> 12;
				@Pc(61) int local61 = Static122.anIntArray389[local44] * local53 >> 12;
				@Pc(69) int local69 = Static155.anIntArray438[local44] * local53 >> 12;
				@Pc(77) int local77 = (local69 >> 12) + arg0 & Static53.anInt1668;
				@Pc(86) int local86 = local34 + (local61 >> 12) & Static96.anInt3099;
				@Pc(92) int[] local92 = this.method3569(local77, 0);
				local12[local34] = local92[local86];
			}
		}
		return local12;
	}
}
