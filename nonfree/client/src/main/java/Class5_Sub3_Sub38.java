import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class5_Sub3_Sub38 extends Class5_Sub3 {

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
	private int anInt10827 = 0;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
	private int anInt10830 = 2000;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
	private int anInt10828 = 4096;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	private int anInt10836 = 16;

	@OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
	private int anInt10837 = 0;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		Static355.method5212();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10827 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt10830 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt10836 = arg0.method7291();
		} else if (arg1 == 3) {
			this.anInt10837 = arg0.method7333();
		} else if (arg1 == 4) {
			this.anInt10828 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(28) int local28 = this.anInt10828 >> 1;
			@Pc(35) int[][] local35 = super.aClass234_41.method5230();
			@Pc(42) Random local42 = new Random((long) this.anInt10827);
			for (@Pc(44) int local44 = 0; local44 < this.anInt10830; local44++) {
				@Pc(69) int local69 = this.anInt10828 > 0 ? this.anInt10837 + Static131.method1936(local42, this.anInt10828) - local28 : this.anInt10837;
				@Pc(75) int local75 = local69 >> 4 & 0xFF;
				@Pc(82) int local82 = Static131.method1936(local42, Static7.anInt102);
				@Pc(87) int local87 = Static131.method1936(local42, Static122.anInt2020);
				@Pc(98) int local98 = (this.anInt10836 * Static153.anIntArray141[local75] >> 12) + local82;
				@Pc(109) int local109 = local87 + (this.anInt10836 * Static536.anIntArray488[local75] >> 12);
				@Pc(114) int local114 = local109 - local87;
				@Pc(119) int local119 = local98 - local82;
				if (local119 != 0 || local114 != 0) {
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local119 < 0) {
						local119 = -local119;
					}
					@Pc(151) boolean local151 = local119 < local114;
					@Pc(155) int local155;
					@Pc(157) int local157;
					if (local151) {
						local155 = local82;
						local157 = local98;
						local82 = local87;
						local98 = local109;
						local87 = local155;
						local109 = local157;
					}
					if (local82 > local98) {
						local155 = local82;
						local82 = local98;
						local157 = local87;
						local98 = local155;
						local87 = local109;
						local109 = local157;
					}
					local155 = local87;
					local157 = local98 - local82;
					@Pc(192) int local192 = local109 - local87;
					@Pc(197) int local197 = -local157 / 2;
					@Pc(201) int local201 = 2048 / local157;
					@Pc(210) int local210 = 1024 - (Static131.method1936(local42, 4096) >> 2);
					@Pc(222) int local222 = local109 <= local87 ? -1 : 1;
					if (local192 < 0) {
						local192 = -local192;
					}
					for (@Pc(232) int local232 = local82; local232 < local98; local232++) {
						@Pc(244) int local244 = local210 + local201 * (local232 - local82) + 1024;
						@Pc(248) int local248 = local232 & Static517.anInt8205;
						@Pc(252) int local252 = Static652.anInt10663 & local155;
						if (local151) {
							local35[local252][local248] = local244;
						} else {
							local35[local248][local252] = local244;
						}
						local197 += local192;
						if (local197 > 0) {
							local197 += -local157;
							local155 -= -local222;
						}
					}
				}
			}
		}
		return local11;
	}
}
