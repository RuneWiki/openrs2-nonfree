import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "[Lclient!nj;")
	private Interface19[] anInterface19Array1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class17_Sub2(@OriginalArg(0) Class20_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean115) {
			this.aBoolean154 = arg0.anInt1540 < 3;
			@Pc(28) int local28 = this.aBoolean154 ? 48 : 127;
			@Pc(32) int[][] local32 = new int[6][4096];
			@Pc(36) int[][] local36 = new int[6][4096];
			@Pc(40) int[][] local40 = new int[6][4096];
			@Pc(42) int local42 = 0;
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				for (@Pc(48) int local48 = 0; local48 < 64; local48++) {
					@Pc(59) float local59 = (float) local44 * 2.0F / 64.0F - 1.0F;
					@Pc(68) float local68 = (float) local48 * 2.0F / 64.0F - 1.0F;
					@Pc(83) float local83 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local68 * local68 + 1.0F)));
					@Pc(87) float local87 = local59 * local83;
					@Pc(91) float local91 = local68 * local83;
					for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
						@Pc(109) float local109;
						if (local93 == 0) {
							local109 = -local91;
						} else if (local93 == 1) {
							local109 = local91;
						} else if (local93 == 2) {
							local109 = local87;
						} else if (local93 == 3) {
							local109 = -local87;
						} else if (local93 == 4) {
							local109 = local83;
						} else {
							local109 = -local83;
						}
						@Pc(150) int local150;
						@Pc(149) int local149;
						@Pc(147) int local147;
						if (local109 > 0.0F) {
							local150 = (int) ((double) local28 * Math.pow((double) local109, 96.0D));
							local149 = (int) ((double) local28 * Math.pow((double) local109, 36.0D));
							local147 = (int) (Math.pow((double) local109, 12.0D) * (double) local28);
						} else {
							local147 = 0;
							local149 = 0;
							local150 = 0;
						}
						local36[local93][local42] = local150 << 24;
						local40[local93][local42] = local149 << 24;
						local32[local93][local42] = local147 << 24;
					}
					local42++;
				}
			}
			this.anInterface19Array1 = new Interface19[3];
			this.anInterface19Array1[0] = super.aClass20_Sub2_22.method1534(local36, false, 64);
			this.anInterface19Array1[1] = super.aClass20_Sub2_22.method1534(local40, false, 64);
			this.anInterface19Array1[2] = super.aClass20_Sub2_22.method1534(local32, false, 64);
		}
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		if (this.anInterface19Array1 == null || !arg0) {
			super.aClass20_Sub2_22.method1519(0, Static360.aClass177_5);
			return;
		}
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1505(Static228.aClass31_2);
		@Pc(29) Class30_Sub2 local29 = super.aClass20_Sub2_22.method1454();
		local29.method4654(1024);
		super.aClass20_Sub2_22.method1487(Static155.aClass332_2);
		if (this.aBoolean154) {
			super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static361.aClass315_2);
			super.aClass20_Sub2_22.method1558(true, 0, Static118.aClass177_1, false);
			super.aClass20_Sub2_22.method1519(0, Static360.aClass177_5);
		} else {
			super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static492.aClass315_4);
			super.aClass20_Sub2_22.method1483(0, Static154.aClass177_4);
			super.aClass20_Sub2_22.method1531(2);
			super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static361.aClass315_2);
			super.aClass20_Sub2_22.method1483(0, Static154.aClass177_4);
			super.aClass20_Sub2_22.method1558(true, 1, Static154.aClass177_4, false);
			super.aClass20_Sub2_22.method1519(0, Static360.aClass177_5);
			super.aClass20_Sub2_22.method1484(super.aClass20_Sub2_22.anInterface7_3);
		}
		super.aClass20_Sub2_22.method1531(0);
		this.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super.aClass20_Sub2_22.method1484(arg1);
		super.aClass20_Sub2_22.method1557(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		if (this.aBoolean155) {
			super.aClass20_Sub2_22.method1531(1);
			super.aClass20_Sub2_22.method1484(null);
			super.aClass20_Sub2_22.method1505(Static398.aClass31_3);
			super.aClass20_Sub2_22.method1513();
			if (this.aBoolean154) {
				super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
				super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
				super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
			} else {
				super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
				super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
				super.aClass20_Sub2_22.method1531(2);
				super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
				super.aClass20_Sub2_22.method1483(0, Static118.aClass177_1);
				super.aClass20_Sub2_22.method1483(1, Static154.aClass177_4);
				super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
				super.aClass20_Sub2_22.method1484(null);
			}
			super.aClass20_Sub2_22.method1531(0);
			this.aBoolean155 = false;
		} else {
			super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
		}
		super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static425.aClass315_3);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean155) {
			super.aClass20_Sub2_22.method1531(1);
			super.aClass20_Sub2_22.method1484(this.anInterface19Array1[arg0 - 1]);
			super.aClass20_Sub2_22.method1531(0);
		}
	}
}
