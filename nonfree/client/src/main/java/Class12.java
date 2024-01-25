import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public abstract class Class12 {

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "[I")
	public static final int[] anIntArray601 = new int[256];

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	private int anInt10669 = 0;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "[S")
	private final short[] aShortArray153 = new short[512];

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	protected int anInt10673 = 4;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
	private int anInt10671 = 4;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
	private int anInt10674 = 4;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
	private int anInt10668 = 4;

	static {
		for (@Pc(139) int local139 = 0; local139 < 256; local139++) {
			@Pc(142) int local142 = local139;
			for (@Pc(144) int local144 = 0; local144 < 8; local144++) {
				if ((local142 & 0x1) == 1) {
					local142 = local142 >>> 1 ^ 0xEDB88320;
				} else {
					local142 >>>= 0x1;
				}
			}
			anIntArray601[local139] = local142;
		}
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIII)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10668 = arg2;
		this.anInt10671 = arg4;
		this.anInt10673 = arg1;
		this.anInt10674 = arg3;
		this.anInt10669 = arg0;
		this.method8929();
		this.method8931();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	protected abstract void method8922();

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(B)V")
	protected abstract void method8923();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V")
	protected final void method8927() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(32) int[] local32 = new int[16];
		for (@Pc(34) int local34 = 0; local34 < 128; local34++) {
			local11[local34] = (local34 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local32[local54] = (local54 << 12) / 16;
		}
		this.method8922();
		if (8171 != 8171) {
			return;
		}
		for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
			for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
				for (@Pc(98) int local98 = 0; local98 < 128; local98++) {
					for (@Pc(102) int local102 = 0; local102 < this.anInt10673; local102++) {
						@Pc(113) int local113 = this.aShortArray154[local102] << 12;
						@Pc(120) int local120 = this.anInt10674 * local113 >> 12;
						@Pc(128) int local128 = local113 * local11[local94] >> 12;
						@Pc(135) int local135 = local113 * this.anInt10671 >> 12;
						@Pc(143) int local143 = local8[local98] * local113 >> 12;
						@Pc(150) int local150 = this.anInt10668 * local113 >> 12;
						@Pc(158) int local158 = local32[local90] * local113 >> 12;
						@Pc(163) int local163 = local128 * this.anInt10674;
						@Pc(168) int local168 = local143 * this.anInt10668;
						@Pc(173) int local173 = local158 * this.anInt10671;
						@Pc(177) int local177 = local168 >> 12;
						@Pc(181) int local181 = local177 + 1;
						@Pc(185) int local185 = local177 & 0xFF;
						@Pc(189) int local189 = local163 >> 12;
						@Pc(193) int local193 = local189 + 1;
						@Pc(197) int local197 = local189 & 0xFF;
						@Pc(201) int local201 = local173 >> 12;
						@Pc(205) int local205 = local201 + 1;
						@Pc(209) int local209 = local201 & 0xFF;
						@Pc(213) int local213 = local168 & 0xFFF;
						if (local205 < local135) {
							local205 &= 0xFF;
						} else {
							local205 = 0;
						}
						local158 = local173 & 0xFFF;
						if (local181 < local150) {
							local181 &= 0xFF;
						} else {
							local181 = 0;
						}
						if (local120 <= local193) {
							local193 = 0;
						} else {
							local193 &= 0xFF;
						}
						local128 = local163 & 0xFFF;
						@Pc(262) int local262 = Class3_Sub2_Sub7.anIntArray92[local128];
						@Pc(267) short local267 = this.aShortArray153[local209];
						@Pc(271) int local271 = Class3_Sub2_Sub7.anIntArray92[local213];
						@Pc(275) int local275 = local158 - 4096;
						@Pc(279) int local279 = local128 - 4096;
						@Pc(284) short local284 = this.aShortArray153[local205];
						@Pc(288) int local288 = Class3_Sub2_Sub7.anIntArray92[local158];
						@Pc(292) int local292 = local213 - 4096;
						@Pc(299) short local299 = this.aShortArray153[local193 + local284];
						@Pc(306) short local306 = this.aShortArray153[local197 + local267];
						@Pc(313) short local313 = this.aShortArray153[local284 + local197];
						@Pc(320) short local320 = this.aShortArray153[local193 + local267];
						@Pc(334) int local334 = Static442.method8472(local158, local128, this.aShortArray153[local306 + local185], local213);
						@Pc(347) int local347 = Static442.method8472(local158, local128, this.aShortArray153[local181 + local306], local292);
						@Pc(357) int local357 = ((local347 - local334) * local271 >> 12) + local334;
						@Pc(369) int local369 = Static442.method8472(local158, local279, this.aShortArray153[local320 + local185], local213);
						@Pc(381) int local381 = Static442.method8472(local158, local279, this.aShortArray153[local320 + local181], local292);
						@Pc(392) int local392 = local369 + (local271 * (local381 - local369) >> 12);
						@Pc(404) int local404 = Static442.method8472(local275, local128, this.aShortArray153[local185 + local313], local213);
						@Pc(415) int local415 = local357 + ((local392 - local357) * local262 >> 12);
						@Pc(427) int local427 = Static442.method8472(local275, local128, this.aShortArray153[local313 + local181], local292);
						@Pc(438) int local438 = (local271 * (local427 - local404) >> 12) + local404;
						@Pc(453) int local453 = Static442.method8472(local275, local279, this.aShortArray153[local185 + local299], local213);
						@Pc(468) int local468 = Static442.method8472(local275, local279, this.aShortArray153[local181 + local299], local292);
						@Pc(480) int local480 = local453 + ((local468 - local453) * local271 >> 12);
						@Pc(491) int local491 = (local262 * (local480 - local438) >> 12) + local438;
						this.method8928(local102, local415 + (local288 * (local491 - local415) >> 12));
					}
					this.method8923();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIB)V")
	protected abstract void method8928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	private void method8929() {
		this.aShortArray154 = new short[this.anInt10673];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10673; local12++) {
			this.aShortArray154[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
	private void method8931() {
		@Pc(12) Random local12 = new Random((long) this.anInt10669);
		for (@Pc(24) int local24 = 0; local24 < 255; local24++) {
			this.aShortArray153[local24] = (short) local24;
		}
		for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
			@Pc(51) int local51 = 255 - local42;
			@Pc(56) int local56 = Static63.method794(local51, local12);
			@Pc(61) short local61 = this.aShortArray153[local56];
			this.aShortArray153[local56] = this.aShortArray153[local51];
			this.aShortArray153[local51] = this.aShortArray153[local51 + 256] = local61;
		}
	}
}
