import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public abstract class Class74 {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
	private int anInt6213 = 4;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private int anInt6211 = 0;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
	protected int anInt6218 = 4;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	private int anInt6212 = 4;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[S")
	private final short[] aShortArray110 = new short[512];

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
	private int anInt6220 = 4;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIII)V")
	protected Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6211 = arg0;
		this.anInt6213 = arg4;
		this.anInt6218 = arg1;
		this.anInt6212 = arg3;
		this.anInt6220 = arg2;
		this.method5117();
		this.method5116();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	private void method5116() {
		@Pc(12) Random local12 = new Random((long) this.anInt6211);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray110[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(40) int local40 = Static438.method2068(local12, local35);
			@Pc(45) short local45 = this.aShortArray110[local40];
			this.aShortArray110[local40] = this.aShortArray110[local35];
			this.aShortArray110[local35] = this.aShortArray110[local35 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method5117() {
		this.aShortArray109 = new short[this.anInt6218];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6218; local12++) {
			this.aShortArray109[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIB)V")
	protected final void method5121() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local8[local22] = (local22 << 12) / 128;
		}
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local11[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local14[local62] = (local62 << 12) / 16;
		}
		this.method5122();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt6218; local93++) {
						@Pc(102) int local102 = this.aShortArray109[local93] << 12;
						@Pc(110) int local110 = local14[local81] * local102 >> 12;
						@Pc(117) int local117 = this.anInt6212 * local102 >> 12;
						@Pc(125) int local125 = local102 * local8[local89] >> 12;
						@Pc(132) int local132 = this.anInt6220 * local102 >> 12;
						@Pc(139) int local139 = this.anInt6213 * local102 >> 12;
						@Pc(147) int local147 = local11[local85] * local102 >> 12;
						@Pc(152) int local152 = local125 * this.anInt6220;
						@Pc(157) int local157 = local147 * this.anInt6212;
						@Pc(162) int local162 = local110 * this.anInt6213;
						@Pc(166) int local166 = local152 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local157 >> 12;
						@Pc(178) int local178 = local166 & 0xFF;
						@Pc(182) int local182 = local174 + 1;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local162 >> 12;
						@Pc(194) int local194 = local190 + 1;
						@Pc(198) int local198 = local190 & 0xFF;
						@Pc(202) int local202 = local157 & 0xFFF;
						if (local194 >= local139) {
							local194 = 0;
						} else {
							local194 &= 0xFF;
						}
						local110 = local162 & 0xFFF;
						if (local117 > local182) {
							local182 &= 0xFF;
						} else {
							local182 = 0;
						}
						if (local132 > local170) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						local125 = local152 & 0xFFF;
						@Pc(248) short local248 = this.aShortArray110[local194];
						@Pc(252) int local252 = Class3_Sub39.anIntArray359[local110];
						@Pc(257) short local257 = this.aShortArray110[local198];
						@Pc(261) int local261 = local110 - 4096;
						@Pc(265) int local265 = Class3_Sub39.anIntArray359[local125];
						@Pc(269) int local269 = local125 - 4096;
						@Pc(273) int local273 = Class3_Sub39.anIntArray359[local202];
						@Pc(277) int local277 = local202 - 4096;
						@Pc(284) short local284 = this.aShortArray110[local248 + local182];
						@Pc(292) short local292 = this.aShortArray110[local186 + local257];
						@Pc(300) short local300 = this.aShortArray110[local186 + local248];
						@Pc(308) short local308 = this.aShortArray110[local182 + local257];
						@Pc(320) int local320 = Static382.method5295(local202, this.aShortArray110[local292 + local178], local110, local125);
						@Pc(332) int local332 = Static382.method5295(local202, this.aShortArray110[local292 + local170], local110, local269);
						@Pc(342) int local342 = ((local332 - local320) * local265 >> 12) + local320;
						@Pc(355) int local355 = Static382.method5295(local277, this.aShortArray110[local178 + local308], local110, local125);
						@Pc(367) int local367 = Static382.method5295(local277, this.aShortArray110[local308 + local170], local110, local269);
						@Pc(378) int local378 = (local265 * (local367 - local355) >> 12) + local355;
						@Pc(390) int local390 = local342 + ((local378 - local342) * local273 >> 12);
						@Pc(402) int local402 = Static382.method5295(local202, this.aShortArray110[local300 + local178], local261, local125);
						@Pc(414) int local414 = Static382.method5295(local202, this.aShortArray110[local170 + local300], local261, local269);
						@Pc(425) int local425 = (local265 * (local414 - local402) >> 12) + local402;
						@Pc(437) int local437 = Static382.method5295(local277, this.aShortArray110[local284 + local178], local261, local125);
						@Pc(449) int local449 = Static382.method5295(local277, this.aShortArray110[local284 + local170], local261, local269);
						@Pc(459) int local459 = local437 + (local265 * (local449 - local437) >> 12);
						@Pc(470) int local470 = ((local459 - local425) * local273 >> 12) + local425;
						this.method5124(local93, (local252 * (local470 - local390) >> 12) + local390);
					}
					this.method5123();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	protected abstract void method5122();

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	protected abstract void method5123();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)V")
	protected abstract void method5124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
