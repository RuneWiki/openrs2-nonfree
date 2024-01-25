import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public abstract class Class61 {

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[S")
	private short[] aShortArray171;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private int anInt9411 = 4;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[S")
	private final short[] aShortArray170 = new short[512];

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	private int anInt9412 = 0;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	private int anInt9414 = 4;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	protected int anInt9413 = 4;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private int anInt9415 = 4;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII)V")
	protected Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9414 = arg2;
		this.anInt9412 = arg0;
		this.anInt9413 = arg1;
		this.anInt9411 = arg4;
		this.anInt9415 = arg3;
		this.method7935();
		this.method7941();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	private void method7935() {
		this.aShortArray171 = new short[this.anInt9413];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9413; local15++) {
			this.aShortArray171[local15] = (short) Math.pow(2.0D, (double) local15);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	protected abstract void method7936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	protected abstract void method7937();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	protected abstract void method7938();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
	protected final void method7939() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(18) int[] local18 = new int[128];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local6[local20] = (local20 << 12) / 128;
		}
		@Pc(36) int[] local36 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local18[local38] = (local38 << 12) / 128;
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			local36[local57] = (local57 << 12) / 16;
		}
		this.method7938();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(82) int local82 = 0; local82 < 128; local82++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(88) int local88 = 0; local88 < this.anInt9413; local88++) {
						@Pc(96) int local96 = this.aShortArray171[local88] << 12;
						@Pc(103) int local103 = local96 * this.anInt9411 >> 12;
						@Pc(111) int local111 = local96 * local18[local82] >> 12;
						@Pc(119) int local119 = local96 * local6[local85] >> 12;
						@Pc(126) int local126 = local96 * this.anInt9415 >> 12;
						@Pc(134) int local134 = local96 * local36[local79] >> 12;
						@Pc(141) int local141 = this.anInt9414 * local96 >> 12;
						@Pc(146) int local146 = local134 * this.anInt9411;
						@Pc(151) int local151 = local119 * this.anInt9414;
						@Pc(156) int local156 = local111 * this.anInt9415;
						@Pc(160) int local160 = local151 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local156 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local146 >> 12;
						@Pc(184) int local184 = local168 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						if (local188 < local103) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						local134 = local146 & 0xFFF;
						local180 &= 0xFF;
						if (local141 <= local164) {
							local164 = 0;
						} else {
							local164 &= 0xFF;
						}
						local111 = local156 & 0xFFF;
						local119 = local151 & 0xFFF;
						if (local176 < local126) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						@Pc(242) int local242 = local119 - 4096;
						@Pc(247) short local247 = this.aShortArray170[local188];
						@Pc(251) int local251 = Class253.anIntArray788[local119];
						@Pc(255) int local255 = local134 - 4096;
						@Pc(259) int local259 = Class253.anIntArray788[local134];
						@Pc(263) int local263 = local111 - 4096;
						@Pc(267) int local267 = Class253.anIntArray788[local111];
						@Pc(272) short local272 = this.aShortArray170[local180];
						@Pc(279) short local279 = this.aShortArray170[local247 + local184];
						@Pc(286) short local286 = this.aShortArray170[local272 + local176];
						@Pc(294) short local294 = this.aShortArray170[local184 + local272];
						@Pc(301) short local301 = this.aShortArray170[local247 + local176];
						@Pc(313) int local313 = Static393.method5916(local119, local134, this.aShortArray170[local294 + local172], local111);
						@Pc(325) int local325 = Static393.method5916(local242, local134, this.aShortArray170[local294 + local164], local111);
						@Pc(335) int local335 = local313 + (local251 * (local325 - local313) >> 12);
						@Pc(347) int local347 = Static393.method5916(local119, local134, this.aShortArray170[local286 + local172], local263);
						@Pc(359) int local359 = Static393.method5916(local242, local134, this.aShortArray170[local164 + local286], local263);
						@Pc(370) int local370 = ((local359 - local347) * local251 >> 12) + local347;
						@Pc(382) int local382 = Static393.method5916(local119, local255, this.aShortArray170[local279 + local172], local111);
						@Pc(393) int local393 = (local267 * (local370 - local335) >> 12) + local335;
						@Pc(405) int local405 = Static393.method5916(local242, local255, this.aShortArray170[local279 + local164], local111);
						@Pc(416) int local416 = ((local405 - local382) * local251 >> 12) + local382;
						@Pc(428) int local428 = Static393.method5916(local119, local255, this.aShortArray170[local301 + local172], local263);
						@Pc(440) int local440 = Static393.method5916(local242, local255, this.aShortArray170[local164 + local301], local263);
						@Pc(452) int local452 = local428 + ((local440 - local428) * local251 >> 12);
						@Pc(463) int local463 = ((local452 - local416) * local267 >> 12) + local416;
						this.method7936(local88, ((local463 - local393) * local259 >> 12) + local393);
					}
					this.method7937();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	private void method7941() {
		@Pc(14) Random local14 = new Random((long) this.anInt9412);
		for (@Pc(16) int local16 = 0; local16 < 255; local16++) {
			this.aShortArray170[local16] = (short) local16;
		}
		for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
			@Pc(37) int local37 = 255 - local31;
			@Pc(42) int local42 = Static499.method7152(local37, local14);
			@Pc(47) short local47 = this.aShortArray170[local42];
			this.aShortArray170[local42] = this.aShortArray170[local37];
			this.aShortArray170[local37] = this.aShortArray170[local37 + 256] = local47;
		}
	}
}
