import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public abstract class Class17 {

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	protected int anInt10112 = 4;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	private int anInt10111 = 0;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	private int anInt10115 = 4;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
	private int anInt10110 = 4;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	private int anInt10117 = 4;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[S")
	private final short[] aShortArray140 = new short[512];

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIII)V")
	protected Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10110 = arg3;
		this.anInt10111 = arg0;
		this.anInt10112 = arg1;
		this.anInt10117 = arg4;
		this.anInt10115 = arg2;
		this.method8420();
		this.method8421();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	protected abstract void method8414();

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
	protected final void method8415() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local11[local38] = (local38 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local30[local54] = (local54 << 12) / 16;
		}
		this.method8414();
		for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
					for (@Pc(85) int local85 = 0; local85 < this.anInt10112; local85++) {
						@Pc(94) int local94 = this.aShortArray141[local85] << 12;
						@Pc(101) int local101 = local94 * this.anInt10117 >> 12;
						@Pc(108) int local108 = local94 * this.anInt10110 >> 12;
						@Pc(116) int local116 = local8[local81] * local94 >> 12;
						@Pc(123) int local123 = local94 * this.anInt10115 >> 12;
						@Pc(131) int local131 = local30[local73] * local94 >> 12;
						@Pc(139) int local139 = local11[local77] * local94 >> 12;
						@Pc(144) int local144 = local139 * this.anInt10110;
						@Pc(149) int local149 = local116 * this.anInt10115;
						@Pc(154) int local154 = local131 * this.anInt10117;
						@Pc(158) int local158 = local149 >> 12;
						@Pc(162) int local162 = local158 + 1;
						@Pc(166) int local166 = local158 & 0xFF;
						@Pc(170) int local170 = local144 >> 12;
						@Pc(174) int local174 = local170 + 1;
						@Pc(178) int local178 = local154 >> 12;
						@Pc(182) int local182 = local170 & 0xFF;
						@Pc(186) int local186 = local178 + 1;
						if (local101 <= local186) {
							local186 = 0;
						} else {
							local186 &= 0xFF;
						}
						local139 = local144 & 0xFFF;
						local131 = local154 & 0xFFF;
						if (local123 <= local162) {
							local162 = 0;
						} else {
							local162 &= 0xFF;
						}
						local178 &= 0xFF;
						local116 = local149 & 0xFFF;
						if (local174 < local108) {
							local174 &= 0xFF;
						} else {
							local174 = 0;
						}
						@Pc(248) short local248 = this.aShortArray140[local186];
						@Pc(252) int local252 = local116 - 4096;
						@Pc(256) int local256 = local131 - 4096;
						@Pc(260) int local260 = Class14_Sub27_Sub2.anIntArray430[local131];
						@Pc(264) int local264 = Class14_Sub27_Sub2.anIntArray430[local139];
						@Pc(268) int local268 = local139 - 4096;
						@Pc(272) int local272 = Class14_Sub27_Sub2.anIntArray430[local116];
						@Pc(277) short local277 = this.aShortArray140[local178];
						@Pc(285) short local285 = this.aShortArray140[local174 + local277];
						@Pc(292) short local292 = this.aShortArray140[local248 + local174];
						@Pc(299) short local299 = this.aShortArray140[local182 + local248];
						@Pc(307) short local307 = this.aShortArray140[local182 + local277];
						@Pc(319) int local319 = Static279.method4043(local131, local116, this.aShortArray140[local307 + local166], local139);
						@Pc(331) int local331 = Static279.method4043(local131, local252, this.aShortArray140[local307 + local162], local139);
						@Pc(343) int local343 = local319 + (local272 * (local331 - local319) >> 12);
						@Pc(355) int local355 = Static279.method4043(local131, local116, this.aShortArray140[local285 + local166], local268);
						@Pc(367) int local367 = Static279.method4043(local131, local252, this.aShortArray140[local285 + local162], local268);
						@Pc(378) int local378 = local355 + ((local367 - local355) * local272 >> 12);
						@Pc(389) int local389 = (local264 * (local378 - local343) >> 12) + local343;
						@Pc(401) int local401 = Static279.method4043(local256, local116, this.aShortArray140[local166 + local299], local139);
						@Pc(413) int local413 = Static279.method4043(local256, local252, this.aShortArray140[local299 + local162], local139);
						@Pc(423) int local423 = (local272 * (local413 - local401) >> 12) + local401;
						@Pc(436) int local436 = Static279.method4043(local256, local116, this.aShortArray140[local166 + local292], local268);
						@Pc(448) int local448 = Static279.method4043(local256, local252, this.aShortArray140[local292 + local162], local268);
						@Pc(459) int local459 = (local272 * (local448 - local436) >> 12) + local436;
						@Pc(470) int local470 = local423 + (local264 * (local459 - local423) >> 12);
						this.method8416(local85, ((local470 - local389) * local260 >> 12) + local389);
					}
					this.method8419();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZI)V")
	protected abstract void method8416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	protected abstract void method8419();

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	private void method8420() {
		this.aShortArray141 = new short[this.anInt10112];
		for (@Pc(20) int local20 = 0; local20 < this.anInt10112; local20++) {
			this.aShortArray141[local20] = (short) (int) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	private void method8421() {
		@Pc(12) Random local12 = new Random((long) this.anInt10111);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray140[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static251.method3688(local12, local37);
			@Pc(47) short local47 = this.aShortArray140[local42];
			this.aShortArray140[local42] = this.aShortArray140[local37];
			this.aShortArray140[local37] = this.aShortArray140[local37 + 256] = local47;
		}
	}
}
