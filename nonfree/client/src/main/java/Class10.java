import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public abstract class Class10 {

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	protected int anInt9583 = 4;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	private int anInt9584 = 4;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "I")
	private int anInt9582 = 4;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	private int anInt9585 = 0;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private int anInt9589 = 4;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "[S")
	private final short[] aShortArray140 = new short[512];

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIII)V")
	protected Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9583 = arg1;
		this.anInt9589 = arg3;
		this.anInt9584 = arg4;
		this.anInt9582 = arg2;
		this.anInt9585 = arg0;
		this.method7698();
		this.method7697();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	protected abstract void method7692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	protected abstract void method7695();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	protected final void method7696() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			local14[local48] = (local48 << 12) / 16;
		}
		this.method7695();
		for (@Pc(67) int local67 = 0; local67 < 16; local67++) {
			for (@Pc(71) int local71 = 0; local71 < 128; local71++) {
				for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
					for (@Pc(79) int local79 = 0; local79 < this.anInt9583; local79++) {
						@Pc(88) int local88 = this.aShortArray139[local79] << 12;
						@Pc(95) int local95 = this.anInt9584 * local88 >> 12;
						@Pc(103) int local103 = local88 * local14[local67] >> 12;
						@Pc(110) int local110 = local88 * this.anInt9582 >> 12;
						@Pc(118) int local118 = local88 * local11[local71] >> 12;
						@Pc(125) int local125 = this.anInt9589 * local88 >> 12;
						@Pc(133) int local133 = local88 * local8[local75] >> 12;
						@Pc(138) int local138 = local118 * this.anInt9589;
						@Pc(143) int local143 = local133 * this.anInt9582;
						@Pc(148) int local148 = local103 * this.anInt9584;
						@Pc(152) int local152 = local143 >> 12;
						@Pc(156) int local156 = local152 + 1;
						@Pc(160) int local160 = local152 & 0xFF;
						@Pc(164) int local164 = local138 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local148 >> 12;
						@Pc(180) int local180 = local176 + 1;
						if (local95 <= local180) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						local133 = local143 & 0xFFF;
						if (local125 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						local118 = local138 & 0xFFF;
						local176 &= 0xFF;
						if (local156 >= local110) {
							local156 = 0;
						} else {
							local156 &= 0xFF;
						}
						local103 = local148 & 0xFFF;
						@Pc(246) short local246 = this.aShortArray140[local176];
						@Pc(250) int local250 = Class141.anIntArray243[local118];
						@Pc(255) short local255 = this.aShortArray140[local180];
						@Pc(259) int local259 = local103 - 4096;
						@Pc(263) int local263 = local133 - 4096;
						@Pc(267) int local267 = Class141.anIntArray243[local133];
						@Pc(271) int local271 = local118 - 4096;
						@Pc(275) int local275 = Class141.anIntArray243[local103];
						@Pc(282) short local282 = this.aShortArray140[local255 + local172];
						@Pc(289) short local289 = this.aShortArray140[local168 + local255];
						@Pc(296) short local296 = this.aShortArray140[local246 + local168];
						@Pc(303) short local303 = this.aShortArray140[local246 + local172];
						@Pc(316) int local316 = Static521.method6726(local103, local118, this.aShortArray140[local160 + local303], local133);
						@Pc(328) int local328 = Static521.method6726(local103, local118, this.aShortArray140[local156 + local303], local263);
						@Pc(340) int local340 = local316 + ((local328 - local316) * local267 >> 12);
						@Pc(352) int local352 = Static521.method6726(local103, local271, this.aShortArray140[local296 + local160], local133);
						@Pc(364) int local364 = Static521.method6726(local103, local271, this.aShortArray140[local296 + local156], local263);
						@Pc(376) int local376 = local352 + (local267 * (local364 - local352) >> 12);
						@Pc(388) int local388 = Static521.method6726(local259, local118, this.aShortArray140[local282 + local160], local133);
						@Pc(400) int local400 = local340 + (local250 * (local376 - local340) >> 12);
						@Pc(412) int local412 = Static521.method6726(local259, local118, this.aShortArray140[local156 + local282], local263);
						@Pc(423) int local423 = ((local412 - local388) * local267 >> 12) + local388;
						@Pc(435) int local435 = Static521.method6726(local259, local271, this.aShortArray140[local289 + local160], local133);
						@Pc(447) int local447 = Static521.method6726(local259, local271, this.aShortArray140[local289 + local156], local263);
						@Pc(457) int local457 = ((local447 - local435) * local267 >> 12) + local435;
						@Pc(469) int local469 = local423 + ((local457 - local423) * local250 >> 12);
						this.method7692(local79, local400 + (local275 * (local469 - local400) >> 12));
					}
					this.method7700();
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	private void method7697() {
		@Pc(12) Random local12 = new Random((long) this.anInt9585);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray140[local20] = (short) local20;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static328.method4754(local12, local41);
			@Pc(51) short local51 = this.aShortArray140[local46];
			this.aShortArray140[local46] = this.aShortArray140[local41];
			this.aShortArray140[local41] = this.aShortArray140[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	private void method7698() {
		this.aShortArray139 = new short[this.anInt9583];
		for (@Pc(10) int local10 = 0; local10 < this.anInt9583; local10++) {
			this.aShortArray139[local10] = (short) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	protected abstract void method7700();
}
