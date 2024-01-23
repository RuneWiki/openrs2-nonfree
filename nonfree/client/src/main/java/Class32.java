import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public abstract class Class32 {

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	protected int anInt1965 = 4;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	private int anInt1955 = 4;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	private int anInt1966 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	private int anInt1963 = 4;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	private int anInt1970 = 4;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "[S")
	private short[] aShortArray37 = new short[512];

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIII)V")
	protected Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1965 = arg1;
		this.anInt1963 = arg4;
		this.anInt1966 = arg0;
		this.anInt1970 = arg3;
		this.anInt1955 = arg2;
		this.method1670();
		this.method1665();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)V")
	protected final void method1659() {
		@Pc(16) int[] local16 = new int[64];
		@Pc(19) int[] local19 = new int[64];
		@Pc(21) int local21;
		for (local21 = 0; local21 < 64; local21++) {
			local16[local21] = (local21 << 12) / 64;
		}
		for (local21 = 0; local21 < 64; local21++) {
			local19[local21] = (local21 << 12) / 64;
		}
		@Pc(58) int[] local58 = new int[64];
		for (local21 = 0; local21 < 64; local21++) {
			local58[local21] = (local21 << 12) / 64;
		}
		this.method1660();
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					for (@Pc(96) int local96 = 0; local96 < this.anInt1965; local96++) {
						local21 = this.aShortArray36[local96] << 12;
						@Pc(118) int local118 = local21 * this.anInt1963 >> 12;
						@Pc(126) int local126 = local58[local81] * local21 >> 12;
						@Pc(133) int local133 = this.anInt1970 * local21 >> 12;
						@Pc(141) int local141 = local16[local91] * local21 >> 12;
						@Pc(149) int local149 = local21 * local19[local86] >> 12;
						@Pc(154) int local154 = local126 * this.anInt1963;
						@Pc(159) int local159 = local149 * this.anInt1970;
						@Pc(163) int local163 = local159 >> 12;
						@Pc(167) int local167 = local163 + 1;
						@Pc(171) int local171 = local154 >> 12;
						@Pc(178) int local178 = local21 * this.anInt1955 >> 12;
						@Pc(182) int local182 = local171 + 1;
						@Pc(186) int local186 = local154 & 0xFFF;
						@Pc(190) int local190 = local171 & 0xFF;
						@Pc(195) int local195 = local141 * this.anInt1955;
						if (local167 < local133) {
							local167 &= 0xFF;
						} else {
							local167 = 0;
						}
						@Pc(210) int local210 = Class2_Sub1_Sub30.anIntArray392[local186];
						@Pc(214) int local214 = local195 >> 12;
						@Pc(219) short local219 = this.aShortArray37[local190];
						local141 = local195 & 0xFFF;
						local163 &= 0xFF;
						if (local182 >= local118) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						@Pc(249) short local249 = this.aShortArray37[local219 + local167];
						@Pc(253) int local253 = local186 - 4096;
						@Pc(257) int local257 = local214 + 1;
						@Pc(261) int local261 = Class2_Sub1_Sub30.anIntArray392[local141];
						@Pc(269) short local269 = this.aShortArray37[local163 + local219];
						if (local178 > local257) {
							local257 &= 0xFF;
						} else {
							local257 = 0;
						}
						local149 = local159 & 0xFFF;
						@Pc(289) short local289 = this.aShortArray37[local182];
						@Pc(296) short local296 = this.aShortArray37[local289 + local163];
						@Pc(303) short local303 = this.aShortArray37[local167 + local289];
						@Pc(307) int local307 = local141 - 4096;
						@Pc(311) int local311 = local149 - 4096;
						@Pc(315) int local315 = Class2_Sub1_Sub30.anIntArray392[local149];
						local214 &= 0xFF;
						@Pc(331) int local331 = Static213.method3625(local141, local149, this.aShortArray37[local269 + local214], local186);
						@Pc(343) int local343 = Static213.method3625(local307, local149, this.aShortArray37[local257 + local269], local186);
						@Pc(353) int local353 = local331 + ((local343 - local331) * local261 >> 12);
						@Pc(365) int local365 = Static213.method3625(local141, local311, this.aShortArray37[local214 + local249], local186);
						@Pc(377) int local377 = Static213.method3625(local307, local311, this.aShortArray37[local249 + local257], local186);
						@Pc(387) int local387 = ((local377 - local365) * local261 >> 12) + local365;
						@Pc(398) int local398 = ((local387 - local353) * local315 >> 12) + local353;
						@Pc(411) int local411 = Static213.method3625(local141, local149, this.aShortArray37[local214 + local296], local253);
						@Pc(423) int local423 = Static213.method3625(local307, local149, this.aShortArray37[local257 + local296], local253);
						@Pc(434) int local434 = local411 + (local261 * (local423 - local411) >> 12);
						@Pc(446) int local446 = Static213.method3625(local141, local311, this.aShortArray37[local303 + local214], local253);
						@Pc(458) int local458 = Static213.method3625(local307, local311, this.aShortArray37[local303 + local257], local253);
						@Pc(468) int local468 = local446 + (local261 * (local458 - local446) >> 12);
						@Pc(478) int local478 = local434 + (local315 * (local468 - local434) >> 12);
						this.method1669(local96, local398 + (local210 * (local478 - local398) >> 12));
					}
					this.method1666();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	protected abstract void method1660();

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	private void method1665() {
		@Pc(12) Random local12 = new Random((long) this.anInt1966);
		@Pc(18) int local18;
		for (local18 = 0; local18 < 255; local18++) {
			this.aShortArray37[local18] = (short) local18;
		}
		for (local18 = 0; local18 < 255; local18++) {
			@Pc(39) int local39 = 255 - local18;
			@Pc(44) int local44 = Static21.method459(local39, local12);
			@Pc(49) short local49 = this.aShortArray37[local44];
			this.aShortArray37[local44] = this.aShortArray37[local39];
			this.aShortArray37[local39] = this.aShortArray37[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	protected abstract void method1666();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	protected abstract void method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	private void method1670() {
		this.aShortArray36 = new short[this.anInt1965];
		for (@Pc(12) int local12 = 0; local12 < this.anInt1965; local12++) {
			this.aShortArray36[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}
}
