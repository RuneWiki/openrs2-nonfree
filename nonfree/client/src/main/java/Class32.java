import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public abstract class Class32 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	private int anInt8449 = 0;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
	private final short[] aShortArray114 = new short[512];

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	protected int anInt8458 = 4;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
	private int anInt8454 = 4;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
	private int anInt8457 = 4;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	private int anInt8452 = 4;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIII)V")
	protected Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8458 = arg1;
		this.anInt8454 = arg4;
		this.anInt8449 = arg0;
		this.anInt8457 = arg3;
		this.anInt8452 = arg2;
		this.method6959();
		this.method6957();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)V")
	protected abstract void method6955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	protected abstract void method6956();

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	private void method6957() {
		@Pc(12) Random local12 = new Random((long) this.anInt8449);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray114[local14] = (short) local14;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42 = 255 - local35;
			@Pc(47) int local47 = Static114.method2345(local12, local42);
			@Pc(52) short local52 = this.aShortArray114[local47];
			this.aShortArray114[local47] = this.aShortArray114[local42];
			this.aShortArray114[local42] = this.aShortArray114[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZI)V")
	protected final void method6958() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local18[local56] = (local56 << 12) / 16;
		}
		this.method6956();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt8458; local91++) {
						@Pc(100) int local100 = this.aShortArray113[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt8457 >> 12;
						@Pc(114) int local114 = local100 * this.anInt8454 >> 12;
						@Pc(122) int local122 = local15[local83] * local100 >> 12;
						@Pc(129) int local129 = this.anInt8452 * local100 >> 12;
						@Pc(137) int local137 = local100 * local18[local79] >> 12;
						@Pc(145) int local145 = local100 * local12[local87] >> 12;
						@Pc(150) int local150 = local137 * this.anInt8454;
						@Pc(155) int local155 = local122 * this.anInt8457;
						@Pc(160) int local160 = local145 * this.anInt8452;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local155 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local150 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local155 & 0xFFF;
						@Pc(200) int local200 = local188 & 0xFF;
						if (local180 >= local107) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						local145 = local160 & 0xFFF;
						local137 = local150 & 0xFFF;
						if (local129 <= local168) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						if (local192 < local114) {
							local192 &= 0xFF;
						} else {
							local192 = 0;
						}
						@Pc(257) int local257 = Class224.anIntArray451[local196];
						@Pc(262) short local262 = this.aShortArray114[local200];
						@Pc(266) int local266 = Class224.anIntArray451[local145];
						@Pc(271) short local271 = this.aShortArray114[local192];
						@Pc(275) int local275 = local137 - 4096;
						@Pc(279) int local279 = Class224.anIntArray451[local137];
						@Pc(283) int local283 = local196 - 4096;
						@Pc(287) int local287 = local145 - 4096;
						@Pc(294) short local294 = this.aShortArray114[local271 + local184];
						@Pc(301) short local301 = this.aShortArray114[local180 + local271];
						@Pc(308) short local308 = this.aShortArray114[local262 + local184];
						@Pc(316) short local316 = this.aShortArray114[local180 + local262];
						@Pc(328) int local328 = Static115.method2383(local137, this.aShortArray114[local308 + local176], local145, local196);
						@Pc(341) int local341 = Static115.method2383(local137, this.aShortArray114[local168 + local308], local287, local196);
						@Pc(353) int local353 = local328 + (local266 * (local341 - local328) >> 12);
						@Pc(365) int local365 = Static115.method2383(local137, this.aShortArray114[local316 + local176], local145, local283);
						@Pc(378) int local378 = Static115.method2383(local137, this.aShortArray114[local168 + local316], local287, local283);
						@Pc(388) int local388 = ((local378 - local365) * local266 >> 12) + local365;
						@Pc(398) int local398 = (local257 * (local388 - local353) >> 12) + local353;
						@Pc(411) int local411 = Static115.method2383(local275, this.aShortArray114[local176 + local294], local145, local196);
						@Pc(424) int local424 = Static115.method2383(local275, this.aShortArray114[local168 + local294], local287, local196);
						@Pc(435) int local435 = local411 + (local266 * (local424 - local411) >> 12);
						@Pc(447) int local447 = Static115.method2383(local275, this.aShortArray114[local301 + local176], local145, local283);
						@Pc(459) int local459 = Static115.method2383(local275, this.aShortArray114[local301 + local168], local287, local283);
						@Pc(470) int local470 = (local266 * (local459 - local447) >> 12) + local447;
						@Pc(481) int local481 = ((local470 - local435) * local257 >> 12) + local435;
						this.method6955(local91, local398 + ((local481 - local398) * local279 >> 12));
					}
					this.method6960();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	private void method6959() {
		this.aShortArray113 = new short[this.anInt8458];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8458; local12++) {
			this.aShortArray113[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	protected abstract void method6960();
}
