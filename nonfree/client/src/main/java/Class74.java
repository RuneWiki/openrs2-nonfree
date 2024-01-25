import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public abstract class Class74 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	private int anInt10850 = 4;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	protected int anInt10847 = 4;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
	private int anInt10857 = 0;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "[S")
	private final short[] aShortArray143 = new short[512];

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	private int anInt10854 = 4;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	private int anInt10855 = 4;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIII)V")
	protected Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10847 = arg1;
		this.anInt10854 = arg3;
		this.anInt10855 = arg2;
		this.anInt10857 = arg0;
		this.anInt10850 = arg4;
		this.method9041();
		this.method9040();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	private void method9040() {
		@Pc(12) Random local12 = new Random((long) this.anInt10857);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray143[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(40) int local40 = Static42.method1597(local35, local12);
			@Pc(45) short local45 = this.aShortArray143[local40];
			this.aShortArray143[local40] = this.aShortArray143[local35];
			this.aShortArray143[local35] = this.aShortArray143[local35 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	private void method9041() {
		this.aShortArray142 = new short[this.anInt10847];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10847; local12++) {
			this.aShortArray142[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	protected abstract void method9042();

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
	protected final void method9043() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local30[local52] = (local52 << 12) / 16;
		}
		this.method9044();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt10847; local83++) {
						@Pc(92) int local92 = this.aShortArray142[local83] << 12;
						@Pc(100) int local100 = local92 * local30[local71] >> 12;
						@Pc(107) int local107 = this.anInt10850 * local92 >> 12;
						@Pc(114) int local114 = this.anInt10854 * local92 >> 12;
						@Pc(122) int local122 = local8[local79] * local92 >> 12;
						@Pc(129) int local129 = local92 * this.anInt10855 >> 12;
						@Pc(137) int local137 = local92 * local11[local75] >> 12;
						@Pc(142) int local142 = local122 * this.anInt10855;
						@Pc(147) int local147 = local137 * this.anInt10854;
						@Pc(152) int local152 = local100 * this.anInt10850;
						@Pc(156) int local156 = local142 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local156 & 0xFF;
						@Pc(168) int local168 = local147 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local168 & 0xFF;
						@Pc(180) int local180 = local152 >> 12;
						@Pc(184) int local184 = local180 + 1;
						@Pc(188) int local188 = local142 & 0xFFF;
						@Pc(192) int local192 = local147 & 0xFFF;
						if (local114 <= local172) {
							local172 = 0;
						} else {
							local172 &= 0xFF;
						}
						if (local160 >= local129) {
							local160 = 0;
						} else {
							local160 &= 0xFF;
						}
						local180 &= 0xFF;
						if (local107 > local184) {
							local184 &= 0xFF;
						} else {
							local184 = 0;
						}
						local100 = local152 & 0xFFF;
						@Pc(241) int local241 = local192 - 4096;
						@Pc(246) short local246 = this.aShortArray143[local184];
						@Pc(250) int local250 = local188 - 4096;
						@Pc(254) int local254 = Class289.anIntArray573[local100];
						@Pc(258) int local258 = Class289.anIntArray573[local188];
						@Pc(262) int local262 = Class289.anIntArray573[local192];
						@Pc(266) int local266 = local100 - 4096;
						@Pc(271) short local271 = this.aShortArray143[local180];
						@Pc(278) short local278 = this.aShortArray143[local271 + local172];
						@Pc(285) short local285 = this.aShortArray143[local246 + local176];
						@Pc(293) short local293 = this.aShortArray143[local172 + local246];
						@Pc(300) short local300 = this.aShortArray143[local271 + local176];
						@Pc(313) int local313 = Static64.method1967(this.aShortArray143[local164 + local300], local100, local192, local188);
						@Pc(325) int local325 = Static64.method1967(this.aShortArray143[local160 + local300], local100, local192, local250);
						@Pc(336) int local336 = local313 + ((local325 - local313) * local258 >> 12);
						@Pc(348) int local348 = Static64.method1967(this.aShortArray143[local278 + local164], local100, local241, local188);
						@Pc(360) int local360 = Static64.method1967(this.aShortArray143[local160 + local278], local100, local241, local250);
						@Pc(371) int local371 = local348 + ((local360 - local348) * local258 >> 12);
						@Pc(383) int local383 = Static64.method1967(this.aShortArray143[local285 + local164], local266, local192, local188);
						@Pc(394) int local394 = ((local371 - local336) * local262 >> 12) + local336;
						@Pc(406) int local406 = Static64.method1967(this.aShortArray143[local285 + local160], local266, local192, local250);
						@Pc(416) int local416 = local383 + (local258 * (local406 - local383) >> 12);
						@Pc(429) int local429 = Static64.method1967(this.aShortArray143[local164 + local293], local266, local241, local188);
						@Pc(442) int local442 = Static64.method1967(this.aShortArray143[local160 + local293], local266, local241, local250);
						@Pc(453) int local453 = ((local442 - local429) * local258 >> 12) + local429;
						@Pc(463) int local463 = ((local453 - local416) * local262 >> 12) + local416;
						this.method9047(local394 + ((local463 - local394) * local254 >> 12), local83);
					}
					this.method9042();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	protected abstract void method9044();

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V")
	protected abstract void method9047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
