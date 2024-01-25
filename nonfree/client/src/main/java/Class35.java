import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public abstract class Class35 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private int anInt2749 = 4;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[S")
	private final short[] aShortArray72 = new short[512];

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	private int anInt2751 = 4;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private int anInt2753 = 0;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	protected int anInt2756 = 4;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	private int anInt2755 = 4;

	static {
		new Class169("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2751 = arg2;
		this.anInt2753 = arg0;
		this.anInt2756 = arg1;
		this.anInt2755 = arg4;
		this.anInt2749 = arg3;
		this.method2273();
		this.method2277();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	private void method2273() {
		this.aShortArray73 = new short[this.anInt2756];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2756; local12++) {
			this.aShortArray73[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	protected abstract void method2274();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
	protected final void method2275() {
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[128];
		@Pc(23) int[] local23 = new int[16];
		for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
			local17[local25] = (local25 << 12) / 128;
		}
		for (@Pc(45) int local45 = 0; local45 < 128; local45++) {
			local20[local45] = (local45 << 12) / 128;
		}
		for (@Pc(65) int local65 = 0; local65 < 16; local65++) {
			local23[local65] = (local65 << 12) / 16;
		}
		this.method2274();
		for (@Pc(88) int local88 = 0; local88 < 16; local88++) {
			for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 128; local96++) {
					for (@Pc(100) int local100 = 0; local100 < this.anInt2756; local100++) {
						@Pc(109) int local109 = this.aShortArray73[local100] << 12;
						@Pc(116) int local116 = this.anInt2751 * local109 >> 12;
						@Pc(123) int local123 = local109 * this.anInt2749 >> 12;
						@Pc(131) int local131 = local109 * local17[local96] >> 12;
						@Pc(139) int local139 = local20[local92] * local109 >> 12;
						@Pc(146) int local146 = this.anInt2755 * local109 >> 12;
						@Pc(154) int local154 = local23[local88] * local109 >> 12;
						@Pc(159) int local159 = local139 * this.anInt2749;
						@Pc(164) int local164 = local154 * this.anInt2755;
						@Pc(169) int local169 = local131 * this.anInt2751;
						@Pc(173) int local173 = local169 >> 12;
						@Pc(177) int local177 = local173 + 1;
						@Pc(181) int local181 = local159 >> 12;
						@Pc(185) int local185 = local173 & 0xFF;
						@Pc(189) int local189 = local181 + 1;
						@Pc(193) int local193 = local164 >> 12;
						@Pc(197) int local197 = local181 & 0xFF;
						@Pc(201) int local201 = local193 + 1;
						if (local201 >= local146) {
							local201 = 0;
						} else {
							local201 &= 0xFF;
						}
						local131 = local169 & 0xFFF;
						local139 = local159 & 0xFFF;
						local193 &= 0xFF;
						local154 = local164 & 0xFFF;
						if (local177 >= local116) {
							local177 = 0;
						} else {
							local177 &= 0xFF;
						}
						if (local189 < local123) {
							local189 &= 0xFF;
						} else {
							local189 = 0;
						}
						@Pc(262) int local262 = Class187.anIntArray592[local131];
						@Pc(267) short local267 = this.aShortArray72[local193];
						@Pc(271) int local271 = Class187.anIntArray592[local154];
						@Pc(275) int local275 = local154 - 4096;
						@Pc(280) short local280 = this.aShortArray72[local201];
						@Pc(284) int local284 = Class187.anIntArray592[local139];
						@Pc(288) int local288 = local131 - 4096;
						@Pc(292) int local292 = local139 - 4096;
						@Pc(299) short local299 = this.aShortArray72[local280 + local189];
						@Pc(306) short local306 = this.aShortArray72[local267 + local189];
						@Pc(313) short local313 = this.aShortArray72[local197 + local280];
						@Pc(320) short local320 = this.aShortArray72[local267 + local197];
						@Pc(332) int local332 = Static8.method83(local131, local139, this.aShortArray72[local320 + local185], local154);
						@Pc(346) int local346 = Static8.method83(local288, local139, this.aShortArray72[local320 + local177], local154);
						@Pc(357) int local357 = local332 + (local262 * (local346 - local332) >> 12);
						@Pc(371) int local371 = Static8.method83(local131, local292, this.aShortArray72[local306 + local185], local154);
						@Pc(384) int local384 = Static8.method83(local288, local292, this.aShortArray72[local177 + local306], local154);
						@Pc(395) int local395 = ((local384 - local371) * local262 >> 12) + local371;
						@Pc(407) int local407 = Static8.method83(local131, local139, this.aShortArray72[local185 + local313], local275);
						@Pc(418) int local418 = (local284 * (local395 - local357) >> 12) + local357;
						@Pc(430) int local430 = Static8.method83(local288, local139, this.aShortArray72[local313 + local177], local275);
						@Pc(441) int local441 = ((local430 - local407) * local262 >> 12) + local407;
						@Pc(453) int local453 = Static8.method83(local131, local292, this.aShortArray72[local299 + local185], local275);
						@Pc(465) int local465 = Static8.method83(local288, local292, this.aShortArray72[local177 + local299], local275);
						@Pc(476) int local476 = (local262 * (local465 - local453) >> 12) + local453;
						@Pc(487) int local487 = local441 + ((local476 - local441) * local284 >> 12);
						this.method2279(local100, local418 + (local271 * (local487 - local418) >> 12));
					}
					this.method2278();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
	private void method2277() {
		@Pc(12) Random local12 = new Random((long) this.anInt2753);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray72[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static351.method4927(local45, local12);
			@Pc(55) short local55 = this.aShortArray72[local50];
			this.aShortArray72[local50] = this.aShortArray72[local45];
			this.aShortArray72[local45] = this.aShortArray72[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
	protected abstract void method2278();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	protected abstract void method2279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
