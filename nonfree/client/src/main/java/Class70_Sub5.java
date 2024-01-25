import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class70_Sub5 extends Class70 {

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "[Lclient!uba;")
	private Interface15[] anInterface15Array1;

	static {
		new Class40("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class70_Sub5(@OriginalArg(0) Class62_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean394) {
			this.aBoolean366 = arg0.anInt5677 < 3;
			@Pc(28) int local28 = this.aBoolean366 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local68 * local83;
					@Pc(91) float local91 = local59 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(103) float local103;
						if (local93 == 0) {
							local103 = -local87;
						} else if (local93 == 1) {
							local103 = local87;
						} else if (local93 == 2) {
							local103 = local91;
						} else if (local93 == 3) {
							local103 = -local91;
						} else if (local93 == 4) {
							local103 = local83;
						} else {
							local103 = -local83;
						}
						@Pc(151) int local151;
						@Pc(150) int local150;
						@Pc(148) int local148;
						if (local103 > 0.0F) {
							local151 = (int) (Math.pow((double) local103, 96.0D) * (double) local28);
							local150 = (int) ((double) local28 * Math.pow((double) local103, 36.0D));
							local148 = (int) ((double) local28 * Math.pow((double) local103, 12.0D));
						} else {
							local148 = 0;
							local150 = 0;
							local151 = 0;
						}
						local36[local93][local42] = local151 << 24;
						local40[local93][local42] = local150 << 24;
						local32[local93][local42] = local148 << 24;
					}
					local42++;
				}
			}
			this.anInterface15Array1 = new Interface15[3];
			this.anInterface15Array1[0] = super.aClass62_Sub1_20.method4761(64, local36, false);
			this.anInterface15Array1[1] = super.aClass62_Sub1_20.method4761(64, local40, false);
			this.anInterface15Array1[2] = super.aClass62_Sub1_20.method4761(64, local32, false);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass62_Sub1_20.method4676(arg1);
		super.aClass62_Sub1_20.method4714(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		if (this.anInterface15Array1 == null || !arg0) {
			super.aClass62_Sub1_20.method4661(Static44.aClass63_2, 0);
			return;
		}
		super.aClass62_Sub1_20.method4785(1);
		super.aClass62_Sub1_20.method4694(Static526.aClass206_5);
		@Pc(33) Class78_Sub1 local33 = super.aClass62_Sub1_20.method4705();
		local33.KA(1024);
		super.aClass62_Sub1_20.method4741(Static203.aClass273_2);
		if (this.aBoolean366) {
			super.aClass62_Sub1_20.method4685(Static344.aClass98_4, Static148.aClass98_1);
			super.aClass62_Sub1_20.method4732(false, true, Static24.aClass63_4, 0);
			super.aClass62_Sub1_20.method4661(Static44.aClass63_2, 0);
		} else {
			super.aClass62_Sub1_20.method4685(Static148.aClass98_1, Static165.aClass98_2);
			super.aClass62_Sub1_20.method4715(Static233.aClass63_5, 0);
			super.aClass62_Sub1_20.method4785(2);
			super.aClass62_Sub1_20.method4685(Static344.aClass98_4, Static148.aClass98_1);
			super.aClass62_Sub1_20.method4715(Static233.aClass63_5, 0);
			super.aClass62_Sub1_20.method4732(false, true, Static233.aClass63_5, 1);
			super.aClass62_Sub1_20.method4661(Static44.aClass63_2, 0);
			super.aClass62_Sub1_20.method4676(super.aClass62_Sub1_20.anInterface12_3);
		}
		super.aClass62_Sub1_20.method4785(0);
		this.aBoolean365 = true;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static148.aClass98_1);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		if (this.aBoolean365) {
			super.aClass62_Sub1_20.method4785(1);
			super.aClass62_Sub1_20.method4676(null);
			super.aClass62_Sub1_20.method4694(Static77.aClass206_4);
			super.aClass62_Sub1_20.method4757();
			if (this.aBoolean366) {
				super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
				super.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
				super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
			} else {
				super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
				super.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
				super.aClass62_Sub1_20.method4785(2);
				super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
				super.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
				super.aClass62_Sub1_20.method4715(Static233.aClass63_5, 1);
				super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
				super.aClass62_Sub1_20.method4676(null);
			}
			super.aClass62_Sub1_20.method4785(0);
			this.aBoolean365 = false;
		} else {
			super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
		}
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean365) {
			super.aClass62_Sub1_20.method4785(1);
			super.aClass62_Sub1_20.method4676(this.anInterface15Array1[arg1 - 1]);
			super.aClass62_Sub1_20.method4785(0);
		}
	}
}
