import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class80 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	private int anInt9814 = 4;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	private int anInt9819 = 4;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
	private int anInt9820 = 4;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	protected int anInt9821 = 4;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	private int anInt9822 = 0;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "[S")
	private final short[] aShortArray148 = new short[512];

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIII)V")
	protected Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9819 = arg2;
		this.anInt9821 = arg1;
		this.anInt9820 = arg4;
		this.anInt9822 = arg0;
		this.anInt9814 = arg3;
		this.method8202();
		this.method8203();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	protected abstract void method8197();

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	protected abstract void method8199();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	protected final void method8200() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			local6[local11] = (local11 << 12) / 128;
		}
		@Pc(31) int[] local31 = new int[16];
		for (@Pc(33) int local33 = 0; local33 < 128; local33++) {
			local9[local33] = (local33 << 12) / 128;
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			local31[local48] = (local48 << 12) / 16;
		}
		this.method8199();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(74) int local74 = 0; local74 < 128; local74++) {
				for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
					for (@Pc(80) int local80 = 0; local80 < this.anInt9821; local80++) {
						@Pc(88) int local88 = this.aShortArray147[local80] << 12;
						@Pc(95) int local95 = local88 * this.anInt9819 >> 12;
						@Pc(103) int local103 = local6[local77] * local88 >> 12;
						@Pc(111) int local111 = local88 * local9[local74] >> 12;
						@Pc(119) int local119 = local88 * local31[local71] >> 12;
						@Pc(126) int local126 = local88 * this.anInt9820 >> 12;
						@Pc(133) int local133 = this.anInt9814 * local88 >> 12;
						@Pc(138) int local138 = local103 * this.anInt9819;
						@Pc(143) int local143 = local111 * this.anInt9814;
						@Pc(148) int local148 = local119 * this.anInt9820;
						@Pc(152) int local152 = local138 >> 12;
						@Pc(156) int local156 = local152 + 1;
						@Pc(160) int local160 = local152 & 0xFF;
						@Pc(164) int local164 = local143 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local148 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						if (local126 > local180) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						local111 = local143 & 0xFFF;
						if (local95 > local156) {
							local156 &= 0xFF;
						} else {
							local156 = 0;
						}
						local172 &= 0xFF;
						local119 = local148 & 0xFFF;
						if (local133 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						local103 = local138 & 0xFFF;
						@Pc(235) short local235 = this.aShortArray148[local180];
						@Pc(239) int local239 = local103 - 4096;
						@Pc(244) short local244 = this.aShortArray148[local172];
						@Pc(248) int local248 = Class115.anIntArray257[local111];
						@Pc(252) int local252 = local111 - 4096;
						@Pc(256) int local256 = Class115.anIntArray257[local103];
						@Pc(260) int local260 = Class115.anIntArray257[local119];
						@Pc(264) int local264 = local119 - 4096;
						@Pc(272) short local272 = this.aShortArray148[local176 + local235];
						@Pc(279) short local279 = this.aShortArray148[local244 + local176];
						@Pc(287) short local287 = this.aShortArray148[local168 + local244];
						@Pc(294) short local294 = this.aShortArray148[local168 + local235];
						@Pc(306) int local306 = Static435.method6493(this.aShortArray148[local160 + local279], local103, local119, local111);
						@Pc(318) int local318 = Static435.method6493(this.aShortArray148[local156 + local279], local239, local119, local111);
						@Pc(329) int local329 = ((local318 - local306) * local256 >> 12) + local306;
						@Pc(341) int local341 = Static435.method6493(this.aShortArray148[local287 + local160], local103, local119, local252);
						@Pc(354) int local354 = Static435.method6493(this.aShortArray148[local156 + local287], local239, local119, local252);
						@Pc(365) int local365 = ((local354 - local341) * local256 >> 12) + local341;
						@Pc(377) int local377 = Static435.method6493(this.aShortArray148[local160 + local272], local103, local264, local111);
						@Pc(389) int local389 = local329 + ((local365 - local329) * local248 >> 12);
						@Pc(401) int local401 = Static435.method6493(this.aShortArray148[local156 + local272], local239, local264, local111);
						@Pc(412) int local412 = local377 + ((local401 - local377) * local256 >> 12);
						@Pc(424) int local424 = Static435.method6493(this.aShortArray148[local160 + local294], local103, local264, local252);
						@Pc(437) int local437 = Static435.method6493(this.aShortArray148[local156 + local294], local239, local264, local252);
						@Pc(448) int local448 = local424 + (local256 * (local437 - local424) >> 12);
						@Pc(459) int local459 = (local248 * (local448 - local412) >> 12) + local412;
						this.method8201(local80, local389 + ((local459 - local389) * local260 >> 12));
					}
					this.method8197();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	protected abstract void method8201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V")
	private void method8202() {
		this.aShortArray147 = new short[this.anInt9821];
		for (@Pc(10) int local10 = 0; local10 < this.anInt9821; local10++) {
			this.aShortArray147[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
	private void method8203() {
		@Pc(10) Random local10 = new Random((long) this.anInt9822);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray148[local12] = (short) local12;
		}
		for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
			@Pc(39) int local39 = 255 - local27;
			@Pc(44) int local44 = Static610.method8343(local10, local39);
			@Pc(49) short local49 = this.aShortArray148[local44];
			this.aShortArray148[local44] = this.aShortArray148[local39];
			this.aShortArray148[local39] = this.aShortArray148[local39 + 256] = local49;
		}
	}
}
