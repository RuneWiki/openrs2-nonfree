import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	private int anInt1630 = 1;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
	private int anInt1631 = 1;

	static {
		new Class34("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(31) int local31 = this.anInt1631 + this.anInt1631 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt1630 + this.anInt1630 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(56) int local56 = arg0 - this.anInt1631; local56 <= this.anInt1631 + arg0; local56++) {
				@Pc(68) int[][] local68 = this.method5528(Static49.anInt1526 & local56, 0);
				@Pc(72) int[][] local72 = new int[3][Static153.anInt3378];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt1630; local94 <= this.anInt1630; local94++) {
					@Pc(100) int local100 = Static250.anInt5127 & local94;
					local76 += local86[local100];
					local78 += local90[local100];
					local74 += local82[local100];
				}
				@Pc(131) int[] local131 = local72[0];
				@Pc(135) int[] local135 = local72[1];
				@Pc(139) int[] local139 = local72[2];
				@Pc(141) int local141 = 0;
				while (local141 < Static153.anInt3378) {
					local131[local141] = local47 * local74 >> 16;
					local135[local141] = local47 * local76 >> 16;
					local139[local141] = local47 * local78 >> 16;
					@Pc(175) int local175 = Static250.anInt5127 & local141 - this.anInt1630;
					local74 -= local82[local175];
					local76 -= local86[local175];
					local141++;
					local78 -= local90[local175];
					@Pc(201) int local201 = Static250.anInt5127 & this.anInt1630 + local141;
					local76 += local86[local201];
					local74 += local82[local201];
					local78 += local90[local201];
				}
				local50[local56 + this.anInt1631 - arg0] = local72;
			}
			@Pc(243) int[] local243 = local11[0];
			@Pc(247) int[] local247 = local11[1];
			@Pc(251) int[] local251 = local11[2];
			for (local76 = 0; local76 < Static153.anInt3378; local76++) {
				local78 = 0;
				@Pc(259) int local259 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local31; local263++) {
					@Pc(269) int[][] local269 = local50[local263];
					local261 += local269[2][local76];
					local259 += local269[1][local76];
					local78 += local269[0][local76];
				}
				local243[local76] = local78 * local35 >> 16;
				local247[local76] = local35 * local259 >> 16;
				local251[local76] = local35 * local261 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1630 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt1631 = arg1.method4532();
		} else if (arg0 == 2) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(32) int local32 = this.anInt1631 + this.anInt1631 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt1630 + this.anInt1630 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt1631; local56 <= arg0 + this.anInt1631; local56++) {
				@Pc(66) int[] local66 = this.method5532(0, Static49.anInt1526 & local56);
				@Pc(69) int[] local69 = new int[Static153.anInt3378];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt1630; local75 <= this.anInt1630; local75++) {
					local71 += local66[Static250.anInt5127 & local75];
				}
				@Pc(92) int local92 = 0;
				while (local92 < Static153.anInt3378) {
					local69[local92] = local48 * local71 >> 16;
					local71 -= local66[Static250.anInt5127 & local92 - this.anInt1630];
					local92++;
					local71 += local66[Static250.anInt5127 & local92 + this.anInt1630];
				}
				local51[local56 + this.anInt1631 - arg0] = local69;
			}
			for (@Pc(149) int local149 = 0; local149 < Static153.anInt3378; local149++) {
				@Pc(153) int local153 = 0;
				for (local71 = 0; local71 < local32; local71++) {
					local153 += local51[local71][local149];
				}
				local11[local149] = local153 * local36 >> 16;
			}
		}
		return local11;
	}
}
