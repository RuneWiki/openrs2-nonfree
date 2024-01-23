import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public abstract class Class23 {

	@OriginalMember(owner = "client!io", name = "l", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	private int anInt3078 = 4;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	protected int anInt3079 = 4;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "[S")
	private short[] aShortArray43 = new short[512];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	private int anInt3077 = 4;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "I")
	private int anInt3089 = 0;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "I")
	private int anInt3087 = 4;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIIII)V")
	protected Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3079 = arg1;
		this.anInt3087 = arg2;
		this.anInt3089 = arg0;
		this.anInt3077 = arg4;
		this.anInt3078 = arg3;
		this.method2493();
		this.method2491();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	private void method2491() {
		@Pc(12) Random local12 = new Random((long) this.anInt3089);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray43[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(43) int local43 = 255 - local14;
			@Pc(48) int local48 = Static59.method1118(local43, local12);
			@Pc(53) short local53 = this.aShortArray43[local48];
			this.aShortArray43[local48] = this.aShortArray43[local43];
			this.aShortArray43[local43] = this.aShortArray43[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	protected abstract void method2492();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	private void method2493() {
		this.aShortArray44 = new short[this.anInt3079];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3079; local12++) {
			this.aShortArray44[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	protected abstract void method2496();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
	protected abstract void method2499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V")
	protected final void method2500() {
		@Pc(17) int[] local17 = new int[64];
		@Pc(20) int[] local20 = new int[64];
		@Pc(22) int local22;
		for (local22 = 0; local22 < 64; local22++) {
			local17[local22] = (local22 << 12) / 64;
		}
		for (local22 = 0; local22 < 64; local22++) {
			local20[local22] = (local22 << 12) / 64;
		}
		@Pc(63) int[] local63 = new int[64];
		for (local22 = 0; local22 < 64; local22++) {
			local63[local22] = (local22 << 12) / 64;
		}
		this.method2492();
		for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					for (@Pc(107) int local107 = 0; local107 < this.anInt3079; local107++) {
						local22 = this.aShortArray44[local107] << 12;
						@Pc(126) int local126 = local22 * local63[local88] >> 12;
						@Pc(133) int local133 = local22 * this.anInt3078 >> 12;
						@Pc(141) int local141 = local22 * local20[local93] >> 12;
						@Pc(146) int local146 = local141 * this.anInt3078;
						@Pc(150) int local150 = local146 >> 12;
						@Pc(157) int local157 = this.anInt3077 * local22 >> 12;
						@Pc(161) int local161 = local150 + 1;
						@Pc(168) int local168 = this.anInt3087 * local22 >> 12;
						@Pc(172) int local172 = local150 & 0xFF;
						@Pc(180) int local180 = local22 * local17[local102] >> 12;
						if (local161 < local133) {
							local161 &= 0xFF;
						} else {
							local161 = 0;
						}
						local180 *= this.anInt3087;
						local141 = local146 & 0xFFF;
						@Pc(208) int local208 = Class17.anIntArray82[local141];
						@Pc(212) int local212 = local180 >> 12;
						local180 &= 0xFFF;
						@Pc(220) int local220 = local212 + 1;
						@Pc(224) int local224 = local141 - 4096;
						@Pc(228) int local228 = Class17.anIntArray82[local180];
						@Pc(232) int local232 = local180 - 4096;
						if (local220 < local168) {
							local220 &= 0xFF;
						} else {
							local220 = 0;
						}
						local212 &= 0xFF;
						local126 *= this.anInt3077;
						@Pc(260) int local260 = local126 >> 12;
						@Pc(264) int local264 = local260 + 1;
						@Pc(268) int local268 = local260 & 0xFF;
						@Pc(273) short local273 = this.aShortArray43[local268];
						@Pc(280) short local280 = this.aShortArray43[local273 + local161];
						local126 &= 0xFFF;
						@Pc(291) short local291 = this.aShortArray43[local273 + local172];
						@Pc(295) int local295 = Class17.anIntArray82[local126];
						@Pc(299) int local299 = local126 - 4096;
						if (local264 < local157) {
							local264 &= 0xFF;
						} else {
							local264 = 0;
						}
						@Pc(319) short local319 = this.aShortArray43[local264];
						@Pc(326) short local326 = this.aShortArray43[local319 + local172];
						@Pc(333) short local333 = this.aShortArray43[local319 + local161];
						@Pc(345) int local345 = Static100.method1656(local126, this.aShortArray43[local291 + local212], local141, local180);
						@Pc(357) int local357 = Static100.method1656(local126, this.aShortArray43[local291 + local220], local141, local232);
						@Pc(368) int local368 = local345 + ((local357 - local345) * local228 >> 12);
						@Pc(380) int local380 = Static100.method1656(local126, this.aShortArray43[local280 + local212], local224, local180);
						@Pc(392) int local392 = Static100.method1656(local126, this.aShortArray43[local280 + local220], local224, local232);
						@Pc(403) int local403 = local380 + (local228 * (local392 - local380) >> 12);
						@Pc(414) int local414 = ((local403 - local368) * local208 >> 12) + local368;
						@Pc(426) int local426 = Static100.method1656(local299, this.aShortArray43[local326 + local212], local141, local180);
						@Pc(438) int local438 = Static100.method1656(local299, this.aShortArray43[local220 + local326], local141, local232);
						@Pc(449) int local449 = (local228 * (local438 - local426) >> 12) + local426;
						@Pc(461) int local461 = Static100.method1656(local299, this.aShortArray43[local212 + local333], local224, local180);
						@Pc(473) int local473 = Static100.method1656(local299, this.aShortArray43[local333 + local220], local224, local232);
						@Pc(483) int local483 = (local228 * (local473 - local461) >> 12) + local461;
						@Pc(494) int local494 = local449 + (local208 * (local483 - local449) >> 12);
						this.method2499(local107, local414 + (local295 * (local494 - local414) >> 12));
					}
					this.method2496();
				}
			}
		}
	}
}
