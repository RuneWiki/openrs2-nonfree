import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public abstract class Class16 {

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
	private int anInt8273 = 0;

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
	private int anInt8279 = 4;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
	private int anInt8277 = 4;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
	private int anInt8278 = 4;

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "[S")
	private final short[] aShortArray100 = new short[512];

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
	protected int anInt8276 = 4;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IIIII)V")
	protected Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8278 = arg2;
		this.anInt8279 = arg4;
		this.anInt8276 = arg1;
		this.anInt8273 = arg0;
		this.anInt8277 = arg3;
		this.method7185();
		this.method7184();
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
	protected abstract void method7181();

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BIII)V")
	protected final void method7182() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local11[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local14[local62] = (local62 << 12) / 16;
		}
		this.method7186();
		for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
					for (@Pc(97) int local97 = 0; local97 < this.anInt8276; local97++) {
						@Pc(106) int local106 = this.aShortArray99[local97] << 12;
						@Pc(114) int local114 = local11[local89] * local106 >> 12;
						@Pc(122) int local122 = local106 * local14[local85] >> 12;
						@Pc(129) int local129 = local106 * this.anInt8279 >> 12;
						@Pc(137) int local137 = local106 * local8[local93] >> 12;
						@Pc(144) int local144 = local106 * this.anInt8277 >> 12;
						@Pc(151) int local151 = this.anInt8278 * local106 >> 12;
						@Pc(156) int local156 = local114 * this.anInt8277;
						@Pc(161) int local161 = local137 * this.anInt8278;
						@Pc(166) int local166 = local122 * this.anInt8279;
						@Pc(170) int local170 = local161 >> 12;
						@Pc(174) int local174 = local170 + 1;
						@Pc(178) int local178 = local156 >> 12;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local166 >> 12;
						@Pc(198) int local198 = local194 + 1;
						if (local186 >= local144) {
							local186 = 0;
						} else {
							local186 &= 0xFF;
						}
						local114 = local156 & 0xFFF;
						local194 &= 0xFF;
						if (local151 <= local174) {
							local174 = 0;
						} else {
							local174 &= 0xFF;
						}
						local137 = local161 & 0xFFF;
						if (local198 < local129) {
							local198 &= 0xFF;
						} else {
							local198 = 0;
						}
						local122 = local166 & 0xFFF;
						@Pc(259) int local259 = local137 - 4096;
						@Pc(263) int local263 = Class4_Sub15_Sub1.anIntArray138[local114];
						@Pc(268) short local268 = this.aShortArray100[local198];
						@Pc(273) short local273 = this.aShortArray100[local194];
						@Pc(277) int local277 = local122 - 4096;
						@Pc(281) int local281 = Class4_Sub15_Sub1.anIntArray138[local137];
						@Pc(285) int local285 = local114 - 4096;
						@Pc(289) int local289 = Class4_Sub15_Sub1.anIntArray138[local122];
						@Pc(296) short local296 = this.aShortArray100[local190 + local268];
						@Pc(304) short local304 = this.aShortArray100[local186 + local268];
						@Pc(312) short local312 = this.aShortArray100[local190 + local273];
						@Pc(319) short local319 = this.aShortArray100[local273 + local186];
						@Pc(331) int local331 = Static522.method7034(this.aShortArray100[local312 + local182], local122, local137, local114);
						@Pc(343) int local343 = Static522.method7034(this.aShortArray100[local312 + local174], local122, local259, local114);
						@Pc(355) int local355 = local331 + ((local343 - local331) * local281 >> 12);
						@Pc(367) int local367 = Static522.method7034(this.aShortArray100[local319 + local182], local122, local137, local285);
						@Pc(380) int local380 = Static522.method7034(this.aShortArray100[local174 + local319], local122, local259, local285);
						@Pc(391) int local391 = (local281 * (local380 - local367) >> 12) + local367;
						@Pc(403) int local403 = Static522.method7034(this.aShortArray100[local182 + local296], local277, local137, local114);
						@Pc(414) int local414 = ((local391 - local355) * local263 >> 12) + local355;
						@Pc(426) int local426 = Static522.method7034(this.aShortArray100[local296 + local174], local277, local259, local114);
						@Pc(437) int local437 = ((local426 - local403) * local281 >> 12) + local403;
						@Pc(449) int local449 = Static522.method7034(this.aShortArray100[local304 + local182], local277, local137, local285);
						@Pc(462) int local462 = Static522.method7034(this.aShortArray100[local174 + local304], local277, local259, local285);
						@Pc(474) int local474 = local449 + ((local462 - local449) * local281 >> 12);
						@Pc(484) int local484 = local437 + (local263 * (local474 - local437) >> 12);
						this.method7183(local97, local414 + (local289 * (local484 - local414) >> 12));
					}
					this.method7181();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)V")
	protected abstract void method7183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V")
	private void method7184() {
		@Pc(12) Random local12 = new Random((long) this.anInt8273);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray100[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static149.method2598(local12, local39);
			@Pc(49) short local49 = this.aShortArray100[local44];
			this.aShortArray100[local44] = this.aShortArray100[local39];
			this.aShortArray100[local39] = this.aShortArray100[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	private void method7185() {
		this.aShortArray99 = new short[this.anInt8276];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8276; local12++) {
			this.aShortArray99[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)V")
	protected abstract void method7186();
}
