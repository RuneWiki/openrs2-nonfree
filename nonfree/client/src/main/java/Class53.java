import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public abstract class Class53 {

	@OriginalMember(owner = "client!gv", name = "h", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
	private int anInt9052 = 4;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
	protected int anInt9050 = 4;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "[S")
	private final short[] aShortArray141 = new short[512];

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
	private int anInt9056 = 0;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	private int anInt9053 = 4;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	private int anInt9058 = 4;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIII)V")
	protected Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9052 = arg4;
		this.anInt9050 = arg1;
		this.anInt9058 = arg3;
		this.anInt9056 = arg0;
		this.anInt9053 = arg2;
		this.method7337();
		this.method7332();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	private void method7332() {
		@Pc(12) Random local12 = new Random((long) this.anInt9056);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray141[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static542.method7398(local12, local45);
			@Pc(55) short local55 = this.aShortArray141[local50];
			this.aShortArray141[local50] = this.aShortArray141[local45];
			this.aShortArray141[local45] = this.aShortArray141[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	protected abstract void method7333();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBII)V")
	protected final void method7334() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local14[local58] = (local58 << 12) / 16;
		}
		this.method7335();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt9050; local93++) {
						@Pc(102) int local102 = this.aShortArray142[local93] << 12;
						@Pc(109) int local109 = this.anInt9053 * local102 >> 12;
						@Pc(116) int local116 = this.anInt9052 * local102 >> 12;
						@Pc(124) int local124 = local8[local89] * local102 >> 12;
						@Pc(132) int local132 = local11[local85] * local102 >> 12;
						@Pc(139) int local139 = local102 * this.anInt9058 >> 12;
						@Pc(147) int local147 = local14[local81] * local102 >> 12;
						@Pc(152) int local152 = local132 * this.anInt9058;
						@Pc(157) int local157 = local124 * this.anInt9053;
						@Pc(162) int local162 = local147 * this.anInt9052;
						@Pc(166) int local166 = local157 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local152 >> 12;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local174 + 1;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local162 >> 12;
						@Pc(194) int local194 = local190 + 1;
						@Pc(198) int local198 = local162 & 0xFFF;
						if (local194 >= local116) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						local124 = local157 & 0xFFF;
						if (local170 < local109) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						local132 = local152 & 0xFFF;
						local190 &= 0xFF;
						if (local139 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						@Pc(251) int local251 = local198 - 4096;
						@Pc(255) int local255 = local124 - 4096;
						@Pc(260) short local260 = this.aShortArray141[local194];
						@Pc(264) int local264 = Class151_Sub3_Sub1.anIntArray670[local132];
						@Pc(268) int local268 = Class151_Sub3_Sub1.anIntArray670[local198];
						@Pc(273) short local273 = this.aShortArray141[local190];
						@Pc(277) int local277 = local132 - 4096;
						@Pc(281) int local281 = Class151_Sub3_Sub1.anIntArray670[local124];
						@Pc(288) short local288 = this.aShortArray141[local273 + local182];
						@Pc(296) short local296 = this.aShortArray141[local186 + local273];
						@Pc(303) short local303 = this.aShortArray141[local186 + local260];
						@Pc(311) short local311 = this.aShortArray141[local182 + local260];
						@Pc(323) int local323 = Static448.method6332(local124, this.aShortArray141[local178 + local296], local132, local198);
						@Pc(336) int local336 = Static448.method6332(local255, this.aShortArray141[local170 + local296], local132, local198);
						@Pc(348) int local348 = local323 + ((local336 - local323) * local281 >> 12);
						@Pc(360) int local360 = Static448.method6332(local124, this.aShortArray141[local288 + local178], local277, local198);
						@Pc(373) int local373 = Static448.method6332(local255, this.aShortArray141[local170 + local288], local277, local198);
						@Pc(383) int local383 = (local281 * (local373 - local360) >> 12) + local360;
						@Pc(395) int local395 = local348 + ((local383 - local348) * local264 >> 12);
						@Pc(407) int local407 = Static448.method6332(local124, this.aShortArray141[local178 + local303], local132, local251);
						@Pc(420) int local420 = Static448.method6332(local255, this.aShortArray141[local170 + local303], local132, local251);
						@Pc(431) int local431 = local407 + (local281 * (local420 - local407) >> 12);
						@Pc(443) int local443 = Static448.method6332(local124, this.aShortArray141[local178 + local311], local277, local251);
						@Pc(455) int local455 = Static448.method6332(local255, this.aShortArray141[local311 + local170], local277, local251);
						@Pc(467) int local467 = local443 + ((local455 - local443) * local281 >> 12);
						@Pc(478) int local478 = ((local467 - local431) * local264 >> 12) + local431;
						this.method7336(((local478 - local395) * local268 >> 12) + local395, local93);
					}
					this.method7333();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	protected abstract void method7335();

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	protected abstract void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	private void method7337() {
		this.aShortArray142 = new short[this.anInt9050];
		for (@Pc(18) int local18 = 0; local18 < this.anInt9050; local18++) {
			this.aShortArray142[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}
}
