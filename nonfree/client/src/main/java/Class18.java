import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public abstract class Class18 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	protected int anInt8262 = 4;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	private int anInt8265 = 4;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	private int anInt8268 = 0;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	private int anInt8270 = 4;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "[S")
	private final short[] aShortArray121 = new short[512];

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	private int anInt8271 = 4;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIII)V")
	protected Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8268 = arg0;
		this.anInt8265 = arg4;
		this.anInt8270 = arg2;
		this.anInt8271 = arg3;
		this.anInt8262 = arg1;
		this.method7245();
		this.method7241();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	private void method7241() {
		@Pc(10) Random local10 = new Random((long) this.anInt8268);
		for (@Pc(17) int local17 = 0; local17 < 255; local17++) {
			this.aShortArray121[local17] = (short) local17;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(38) int local38 = 255 - local32;
			@Pc(43) int local43 = Static371.method5392(local10, local38);
			@Pc(48) short local48 = this.aShortArray121[local43];
			this.aShortArray121[local43] = this.aShortArray121[local38];
			this.aShortArray121[local38] = this.aShortArray121[local38 + 256] = local48;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	protected abstract void method7242();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	protected abstract void method7244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	private void method7245() {
		this.aShortArray120 = new short[this.anInt8262];
		for (@Pc(10) int local10 = 0; local10 < this.anInt8262; local10++) {
			this.aShortArray120[local10] = (short) (int) Math.pow(2.0D, (double) local10);
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	protected abstract void method7246();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIII)V")
	protected final void method7247() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(39) int[] local39 = new int[16];
		for (@Pc(41) int local41 = 0; local41 < 128; local41++) {
			local17[local41] = (local41 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local39[local60] = (local60 << 12) / 16;
		}
		this.method7246();
		for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt8262; local91++) {
						@Pc(99) int local99 = this.aShortArray120[local91] << 12;
						@Pc(106) int local106 = local99 * this.anInt8265 >> 12;
						@Pc(114) int local114 = local14[local88] * local99 >> 12;
						@Pc(121) int local121 = local99 * this.anInt8270 >> 12;
						@Pc(129) int local129 = local39[local82] * local99 >> 12;
						@Pc(137) int local137 = local17[local85] * local99 >> 12;
						@Pc(144) int local144 = local99 * this.anInt8271 >> 12;
						@Pc(149) int local149 = local114 * this.anInt8270;
						@Pc(154) int local154 = local129 * this.anInt8265;
						@Pc(159) int local159 = local137 * this.anInt8271;
						@Pc(163) int local163 = local149 >> 12;
						@Pc(167) int local167 = local163 + 1;
						@Pc(171) int local171 = local159 >> 12;
						@Pc(175) int local175 = local163 & 0xFF;
						@Pc(179) int local179 = local171 + 1;
						@Pc(183) int local183 = local154 >> 12;
						@Pc(187) int local187 = local171 & 0xFF;
						@Pc(191) int local191 = local183 + 1;
						if (local121 <= local167) {
							local167 = 0;
						} else {
							local167 &= 0xFF;
						}
						if (local179 >= local144) {
							local179 = 0;
						} else {
							local179 &= 0xFF;
						}
						local114 = local149 & 0xFFF;
						local137 = local159 & 0xFFF;
						local129 = local154 & 0xFFF;
						local183 &= 0xFF;
						if (local106 > local191) {
							local191 &= 0xFF;
						} else {
							local191 = 0;
						}
						@Pc(245) int local245 = local114 - 4096;
						@Pc(250) short local250 = this.aShortArray121[local183];
						@Pc(254) int local254 = Class6_Sub1.anIntArray10[local129];
						@Pc(258) int local258 = local129 - 4096;
						@Pc(263) short local263 = this.aShortArray121[local191];
						@Pc(267) int local267 = local137 - 4096;
						@Pc(271) int local271 = Class6_Sub1.anIntArray10[local137];
						@Pc(275) int local275 = Class6_Sub1.anIntArray10[local114];
						@Pc(283) short local283 = this.aShortArray121[local187 + local263];
						@Pc(290) short local290 = this.aShortArray121[local250 + local187];
						@Pc(297) short local297 = this.aShortArray121[local263 + local179];
						@Pc(304) short local304 = this.aShortArray121[local250 + local179];
						@Pc(317) int local317 = Static405.method5735(local129, this.aShortArray121[local175 + local290], local137, local114);
						@Pc(329) int local329 = Static405.method5735(local129, this.aShortArray121[local167 + local290], local137, local245);
						@Pc(340) int local340 = (local275 * (local329 - local317) >> 12) + local317;
						@Pc(352) int local352 = Static405.method5735(local129, this.aShortArray121[local304 + local175], local267, local114);
						@Pc(365) int local365 = Static405.method5735(local129, this.aShortArray121[local167 + local304], local267, local245);
						@Pc(376) int local376 = local352 + ((local365 - local352) * local275 >> 12);
						@Pc(388) int local388 = Static405.method5735(local258, this.aShortArray121[local283 + local175], local137, local114);
						@Pc(399) int local399 = ((local376 - local340) * local271 >> 12) + local340;
						@Pc(411) int local411 = Static405.method5735(local258, this.aShortArray121[local283 + local167], local137, local245);
						@Pc(423) int local423 = local388 + ((local411 - local388) * local275 >> 12);
						@Pc(435) int local435 = Static405.method5735(local258, this.aShortArray121[local297 + local175], local267, local114);
						@Pc(448) int local448 = Static405.method5735(local258, this.aShortArray121[local167 + local297], local267, local245);
						@Pc(459) int local459 = (local275 * (local448 - local435) >> 12) + local435;
						@Pc(469) int local469 = local423 + (local271 * (local459 - local423) >> 12);
						this.method7244((local254 * (local469 - local399) >> 12) + local399, local91);
					}
					this.method7242();
				}
			}
		}
	}
}
