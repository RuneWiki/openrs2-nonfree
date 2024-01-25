import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public abstract class Class12 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	private int anInt4636 = 0;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	protected int anInt4637 = 4;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private int anInt4645 = 4;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	private int anInt4642 = 4;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	private int anInt4647 = 4;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "[S")
	private final short[] aShortArray82 = new short[512];

	static {
		new Class117("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIII)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4647 = arg3;
		this.anInt4645 = arg4;
		this.anInt4637 = arg1;
		this.anInt4636 = arg0;
		this.anInt4642 = arg2;
		this.method4098();
		this.method4104();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	private void method4098() {
		this.aShortArray81 = new short[this.anInt4637];
		for (@Pc(17) int local17 = 0; local17 < this.anInt4637; local17++) {
			this.aShortArray81[local17] = (short) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	protected abstract void method4099();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
	protected abstract void method4102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	private void method4104() {
		@Pc(12) Random local12 = new Random((long) this.anInt4636);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray82[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(37) int local37 = 255 - local28;
			@Pc(42) int local42 = Static331.method5444(local37, local12);
			@Pc(47) short local47 = this.aShortArray82[local42];
			this.aShortArray82[local42] = this.aShortArray82[local37];
			this.aShortArray82[local37] = this.aShortArray82[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V")
	protected final void method4107() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local8[local17] = (local17 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local34[local52] = (local52 << 12) / 16;
		}
		this.method4099();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt4637; local83++) {
						@Pc(92) int local92 = this.aShortArray81[local83] << 12;
						@Pc(99) int local99 = local92 * this.anInt4647 >> 12;
						@Pc(106) int local106 = local92 * this.anInt4642 >> 12;
						@Pc(114) int local114 = local34[local71] * local92 >> 12;
						@Pc(121) int local121 = local92 * this.anInt4645 >> 12;
						@Pc(129) int local129 = local11[local75] * local92 >> 12;
						@Pc(137) int local137 = local92 * local8[local79] >> 12;
						@Pc(142) int local142 = local129 * this.anInt4647;
						@Pc(147) int local147 = local114 * this.anInt4645;
						@Pc(152) int local152 = local137 * this.anInt4642;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local142 >> 12;
						@Pc(168) int local168 = local156 & 0xFF;
						@Pc(172) int local172 = local164 + 1;
						@Pc(176) int local176 = local147 >> 12;
						@Pc(180) int local180 = local164 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						if (local106 > local160) {
							local160 &= 0xFF;
						} else {
							local160 = 0;
						}
						local114 = local147 & 0xFFF;
						local137 = local152 & 0xFFF;
						local176 &= 0xFF;
						if (local121 <= local184) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						local129 = local142 & 0xFFF;
						if (local172 < local99) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						@Pc(245) int local245 = Class11_Sub2_Sub29_Sub1.anIntArray384[local137];
						@Pc(250) short local250 = this.aShortArray82[local184];
						@Pc(254) int local254 = Class11_Sub2_Sub29_Sub1.anIntArray384[local114];
						@Pc(258) int local258 = local129 - 4096;
						@Pc(262) int local262 = local137 - 4096;
						@Pc(266) int local266 = local114 - 4096;
						@Pc(270) int local270 = Class11_Sub2_Sub29_Sub1.anIntArray384[local129];
						@Pc(275) short local275 = this.aShortArray82[local176];
						@Pc(282) short local282 = this.aShortArray82[local250 + local180];
						@Pc(289) short local289 = this.aShortArray82[local275 + local172];
						@Pc(296) short local296 = this.aShortArray82[local172 + local250];
						@Pc(303) short local303 = this.aShortArray82[local180 + local275];
						@Pc(315) int local315 = Static246.method4314(local114, this.aShortArray82[local168 + local303], local137, local129);
						@Pc(327) int local327 = Static246.method4314(local114, this.aShortArray82[local160 + local303], local262, local129);
						@Pc(338) int local338 = (local245 * (local327 - local315) >> 12) + local315;
						@Pc(350) int local350 = Static246.method4314(local114, this.aShortArray82[local289 + local168], local137, local258);
						@Pc(362) int local362 = Static246.method4314(local114, this.aShortArray82[local160 + local289], local262, local258);
						@Pc(373) int local373 = local350 + (local245 * (local362 - local350) >> 12);
						@Pc(385) int local385 = local338 + ((local373 - local338) * local270 >> 12);
						@Pc(397) int local397 = Static246.method4314(local266, this.aShortArray82[local282 + local168], local137, local129);
						@Pc(410) int local410 = Static246.method4314(local266, this.aShortArray82[local160 + local282], local262, local129);
						@Pc(421) int local421 = local397 + (local245 * (local410 - local397) >> 12);
						@Pc(433) int local433 = Static246.method4314(local266, this.aShortArray82[local168 + local296], local137, local258);
						@Pc(445) int local445 = Static246.method4314(local266, this.aShortArray82[local160 + local296], local262, local258);
						@Pc(457) int local457 = local433 + ((local445 - local433) * local245 >> 12);
						@Pc(468) int local468 = (local270 * (local457 - local421) >> 12) + local421;
						this.method4102(((local468 - local385) * local254 >> 12) + local385, local83);
					}
					this.method4109();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	protected abstract void method4109();
}
