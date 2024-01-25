import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public abstract class Class96 {

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	private int anInt2791 = 4;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	private int anInt2794 = 4;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	protected int anInt2789 = 4;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	private int anInt2797 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	private int anInt2788 = 4;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[S")
	private final short[] aShortArray40 = new short[512];

	static {
		new Class15("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIII)V")
	protected Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2794 = arg4;
		this.anInt2791 = arg3;
		this.anInt2789 = arg1;
		this.anInt2788 = arg2;
		this.anInt2797 = arg0;
		this.method2162();
		this.method2160();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	protected abstract void method2157();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	protected abstract void method2159();

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	private void method2160() {
		@Pc(12) Random local12 = new Random((long) this.anInt2797);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray40[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(40) int local40 = Static425.method5717(local12, local35);
			@Pc(45) short local45 = this.aShortArray40[local40];
			this.aShortArray40[local40] = this.aShortArray40[local35];
			this.aShortArray40[local35] = this.aShortArray40[local35 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)V")
	protected abstract void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	private void method2162() {
		this.aShortArray41 = new short[this.anInt2789];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2789; local18++) {
			this.aShortArray41[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
	protected final void method2166() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local40[local58] = (local58 << 12) / 16;
		}
		this.method2159();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt2789; local89++) {
						@Pc(98) int local98 = this.aShortArray41[local89] << 12;
						@Pc(105) int local105 = local98 * this.anInt2794 >> 12;
						@Pc(112) int local112 = local98 * this.anInt2791 >> 12;
						@Pc(120) int local120 = local98 * local40[local77] >> 12;
						@Pc(128) int local128 = local98 * local17[local81] >> 12;
						@Pc(135) int local135 = this.anInt2788 * local98 >> 12;
						@Pc(143) int local143 = local98 * local14[local85] >> 12;
						@Pc(148) int local148 = local120 * this.anInt2794;
						@Pc(153) int local153 = local128 * this.anInt2791;
						@Pc(158) int local158 = local143 * this.anInt2788;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local153 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local148 >> 12;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local182 + 1;
						@Pc(194) int local194 = local158 & 0xFFF;
						if (local112 <= local178) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						local120 = local148 & 0xFFF;
						if (local166 >= local135) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						if (local190 < local105) {
							local190 &= 0xFF;
						} else {
							local190 = 0;
						}
						local128 = local153 & 0xFFF;
						local182 &= 0xFF;
						@Pc(255) int local255 = local128 - 4096;
						@Pc(260) short local260 = this.aShortArray40[local190];
						@Pc(264) int local264 = local194 - 4096;
						@Pc(269) short local269 = this.aShortArray40[local182];
						@Pc(273) int local273 = local120 - 4096;
						@Pc(277) int local277 = Class4_Sub39.anIntArray494[local128];
						@Pc(281) int local281 = Class4_Sub39.anIntArray494[local194];
						@Pc(285) int local285 = Class4_Sub39.anIntArray494[local120];
						@Pc(292) short local292 = this.aShortArray40[local178 + local269];
						@Pc(299) short local299 = this.aShortArray40[local269 + local186];
						@Pc(306) short local306 = this.aShortArray40[local260 + local178];
						@Pc(313) short local313 = this.aShortArray40[local260 + local186];
						@Pc(325) int local325 = Static245.method3236(local128, this.aShortArray40[local170 + local299], local194, local120);
						@Pc(337) int local337 = Static245.method3236(local128, this.aShortArray40[local166 + local299], local264, local120);
						@Pc(348) int local348 = ((local337 - local325) * local281 >> 12) + local325;
						@Pc(361) int local361 = Static245.method3236(local255, this.aShortArray40[local170 + local292], local194, local120);
						@Pc(376) int local376 = Static245.method3236(local255, this.aShortArray40[local166 + local292], local264, local120);
						@Pc(387) int local387 = (local281 * (local376 - local361) >> 12) + local361;
						@Pc(401) int local401 = Static245.method3236(local128, this.aShortArray40[local313 + local170], local194, local273);
						@Pc(412) int local412 = (local277 * (local387 - local348) >> 12) + local348;
						@Pc(424) int local424 = Static245.method3236(local128, this.aShortArray40[local313 + local166], local264, local273);
						@Pc(434) int local434 = ((local424 - local401) * local281 >> 12) + local401;
						@Pc(446) int local446 = Static245.method3236(local255, this.aShortArray40[local306 + local170], local194, local273);
						@Pc(458) int local458 = Static245.method3236(local255, this.aShortArray40[local166 + local306], local264, local273);
						@Pc(470) int local470 = local446 + (local281 * (local458 - local446) >> 12);
						@Pc(481) int local481 = local434 + (local277 * (local470 - local434) >> 12);
						this.method2161(local412 + (local285 * (local481 - local412) >> 12), local89);
					}
					this.method2157();
				}
			}
		}
	}
}
