import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public abstract class Class30 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	private int anInt9781 = 0;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	private int anInt9784 = 4;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	protected int anInt9787 = 4;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[S")
	private final short[] aShortArray131 = new short[512];

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	private int anInt9791 = 4;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	private int anInt9788 = 4;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIII)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9784 = arg2;
		this.anInt9781 = arg0;
		this.anInt9787 = arg1;
		this.anInt9791 = arg3;
		this.anInt9788 = arg4;
		this.method7994();
		this.method7995();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	protected abstract void method7987();

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	protected abstract void method7988();

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	protected final void method7989() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method7987();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt9787; local87++) {
						@Pc(96) int local96 = this.aShortArray130[local87] << 12;
						@Pc(104) int local104 = local11[local79] * local96 >> 12;
						@Pc(111) int local111 = local96 * this.anInt9788 >> 12;
						@Pc(118) int local118 = this.anInt9784 * local96 >> 12;
						@Pc(125) int local125 = local96 * this.anInt9791 >> 12;
						@Pc(133) int local133 = local14[local75] * local96 >> 12;
						@Pc(141) int local141 = local96 * local8[local83] >> 12;
						@Pc(146) int local146 = local141 * this.anInt9784;
						@Pc(151) int local151 = local104 * this.anInt9791;
						@Pc(156) int local156 = local133 * this.anInt9788;
						@Pc(160) int local160 = local146 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local151 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local156 >> 12;
						@Pc(184) int local184 = local168 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						if (local125 > local176) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local133 = local156 & 0xFFF;
						local180 &= 0xFF;
						if (local164 >= local118) {
							local164 = 0;
						} else {
							local164 &= 0xFF;
						}
						local141 = local146 & 0xFFF;
						if (local111 > local188) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						local104 = local151 & 0xFFF;
						@Pc(241) int local241 = Class4_Sub1_Sub26.anIntArray369[local133];
						@Pc(246) short local246 = this.aShortArray131[local188];
						@Pc(250) int local250 = Class4_Sub1_Sub26.anIntArray369[local104];
						@Pc(254) int local254 = local133 - 4096;
						@Pc(258) int local258 = Class4_Sub1_Sub26.anIntArray369[local141];
						@Pc(262) int local262 = local141 - 4096;
						@Pc(267) short local267 = this.aShortArray131[local180];
						@Pc(271) int local271 = local104 - 4096;
						@Pc(278) short local278 = this.aShortArray131[local184 + local246];
						@Pc(286) short local286 = this.aShortArray131[local176 + local267];
						@Pc(293) short local293 = this.aShortArray131[local246 + local176];
						@Pc(300) short local300 = this.aShortArray131[local267 + local184];
						@Pc(312) int local312 = Static75.method350(this.aShortArray131[local172 + local300], local104, local133, local141);
						@Pc(324) int local324 = Static75.method350(this.aShortArray131[local300 + local164], local104, local133, local262);
						@Pc(335) int local335 = local312 + (local258 * (local324 - local312) >> 12);
						@Pc(347) int local347 = Static75.method350(this.aShortArray131[local286 + local172], local271, local133, local141);
						@Pc(359) int local359 = Static75.method350(this.aShortArray131[local286 + local164], local271, local133, local262);
						@Pc(371) int local371 = local347 + (local258 * (local359 - local347) >> 12);
						@Pc(383) int local383 = Static75.method350(this.aShortArray131[local172 + local278], local104, local254, local141);
						@Pc(394) int local394 = ((local371 - local335) * local250 >> 12) + local335;
						@Pc(406) int local406 = Static75.method350(this.aShortArray131[local164 + local278], local104, local254, local262);
						@Pc(417) int local417 = (local258 * (local406 - local383) >> 12) + local383;
						@Pc(430) int local430 = Static75.method350(this.aShortArray131[local172 + local293], local271, local254, local141);
						@Pc(442) int local442 = Static75.method350(this.aShortArray131[local293 + local164], local271, local254, local262);
						@Pc(454) int local454 = local430 + ((local442 - local430) * local258 >> 12);
						@Pc(465) int local465 = local417 + ((local454 - local417) * local250 >> 12);
						this.method7990(local87, local394 + (local241 * (local465 - local394) >> 12));
					}
					this.method7988();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	protected abstract void method7990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	private void method7994() {
		this.aShortArray130 = new short[this.anInt9787];
		for (@Pc(17) int local17 = 0; local17 < this.anInt9787; local17++) {
			this.aShortArray130[local17] = (short) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	private void method7995() {
		@Pc(12) Random local12 = new Random((long) this.anInt9781);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray131[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static406.method6391(local12, local37);
			@Pc(47) short local47 = this.aShortArray131[local42];
			this.aShortArray131[local42] = this.aShortArray131[local37];
			this.aShortArray131[local37] = this.aShortArray131[local37 + 256] = local47;
		}
	}
}
