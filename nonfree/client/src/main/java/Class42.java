import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class42 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	private int anInt4883 = 0;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt4885 = 4;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private int anInt4884 = 4;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	protected int anInt4890 = 4;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt4887 = 4;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "[S")
	private final short[] aShortArray76 = new short[512];

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIIII)V")
	protected Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4883 = arg0;
		this.anInt4887 = arg2;
		this.anInt4885 = arg4;
		this.anInt4890 = arg1;
		this.anInt4884 = arg3;
		this.method4149();
		this.method4152();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	protected abstract void method4147();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	private void method4149() {
		this.aShortArray75 = new short[this.anInt4890];
		for (@Pc(21) int local21 = 0; local21 < this.anInt4890; local21++) {
			this.aShortArray75[local21] = (short) Math.pow(2.0D, (double) local21);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIII)V")
	protected final void method4150() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local18[local52] = (local52 << 12) / 16;
		}
		this.method4147();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt4890; local83++) {
						@Pc(92) int local92 = this.aShortArray75[local83] << 12;
						@Pc(100) int local100 = local18[local71] * local92 >> 12;
						@Pc(107) int local107 = this.anInt4887 * local92 >> 12;
						@Pc(114) int local114 = this.anInt4885 * local92 >> 12;
						@Pc(122) int local122 = local15[local75] * local92 >> 12;
						@Pc(129) int local129 = local92 * this.anInt4884 >> 12;
						@Pc(137) int local137 = local12[local79] * local92 >> 12;
						@Pc(142) int local142 = local137 * this.anInt4887;
						@Pc(147) int local147 = local122 * this.anInt4884;
						@Pc(152) int local152 = local100 * this.anInt4885;
						@Pc(156) int local156 = local142 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local156 & 0xFF;
						@Pc(168) int local168 = local147 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local168 & 0xFF;
						@Pc(180) int local180 = local152 >> 12;
						@Pc(184) int local184 = local180 + 1;
						@Pc(188) int local188 = local180 & 0xFF;
						if (local114 <= local184) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						if (local160 < local107) {
							local160 &= 0xFF;
						} else {
							local160 = 0;
						}
						local137 = local142 & 0xFFF;
						if (local172 < local129) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						local122 = local147 & 0xFFF;
						local100 = local152 & 0xFFF;
						@Pc(245) int local245 = local137 - 4096;
						@Pc(250) short local250 = this.aShortArray76[local188];
						@Pc(254) int local254 = Class138.anIntArray442[local122];
						@Pc(258) int local258 = Class138.anIntArray442[local100];
						@Pc(262) int local262 = local100 - 4096;
						@Pc(267) short local267 = this.aShortArray76[local184];
						@Pc(271) int local271 = local122 - 4096;
						@Pc(275) int local275 = Class138.anIntArray442[local137];
						@Pc(283) short local283 = this.aShortArray76[local172 + local250];
						@Pc(290) short local290 = this.aShortArray76[local267 + local172];
						@Pc(297) short local297 = this.aShortArray76[local250 + local176];
						@Pc(305) short local305 = this.aShortArray76[local176 + local267];
						@Pc(317) int local317 = Static52.method1156(local137, this.aShortArray76[local297 + local164], local100, local122);
						@Pc(329) int local329 = Static52.method1156(local245, this.aShortArray76[local160 + local297], local100, local122);
						@Pc(340) int local340 = ((local329 - local317) * local275 >> 12) + local317;
						@Pc(352) int local352 = Static52.method1156(local137, this.aShortArray76[local283 + local164], local100, local271);
						@Pc(365) int local365 = Static52.method1156(local245, this.aShortArray76[local160 + local283], local100, local271);
						@Pc(376) int local376 = local352 + ((local365 - local352) * local275 >> 12);
						@Pc(387) int local387 = local340 + (local254 * (local376 - local340) >> 12);
						@Pc(399) int local399 = Static52.method1156(local137, this.aShortArray76[local164 + local305], local262, local122);
						@Pc(411) int local411 = Static52.method1156(local245, this.aShortArray76[local160 + local305], local262, local122);
						@Pc(422) int local422 = ((local411 - local399) * local275 >> 12) + local399;
						@Pc(434) int local434 = Static52.method1156(local137, this.aShortArray76[local290 + local164], local262, local271);
						@Pc(446) int local446 = Static52.method1156(local245, this.aShortArray76[local290 + local160], local262, local271);
						@Pc(457) int local457 = ((local446 - local434) * local275 >> 12) + local434;
						@Pc(468) int local468 = (local254 * (local457 - local422) >> 12) + local422;
						this.method4153(local83, local387 + (local258 * (local468 - local387) >> 12));
					}
					this.method4151();
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	protected abstract void method4151();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
	private void method4152() {
		@Pc(21) Random local21 = new Random((long) this.anInt4883);
		for (@Pc(23) int local23 = 0; local23 < 255; local23++) {
			this.aShortArray76[local23] = (short) local23;
		}
		for (@Pc(37) int local37 = 0; local37 < 255; local37++) {
			@Pc(43) int local43 = 255 - local37;
			@Pc(48) int local48 = Static127.method2396(local21, local43);
			@Pc(53) short local53 = this.aShortArray76[local48];
			this.aShortArray76[local48] = this.aShortArray76[local43];
			this.aShortArray76[local43] = this.aShortArray76[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	protected abstract void method4153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
