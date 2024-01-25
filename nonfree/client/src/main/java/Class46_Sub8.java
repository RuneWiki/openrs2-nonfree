import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class46_Sub8 extends Class46 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	private int anInt9359;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	private int anInt9361;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt9362;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private int anInt9363;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	private int anInt9365;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	public int anInt9366;

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	private int anInt9369;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	private int anInt9370;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	private int anInt9371;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	private int anInt9372;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	private int anInt9374;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "I")
	private int anInt9375;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public int anInt9378;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt9379;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "I")
	public int anInt9380;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	private int anInt9382;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt9383;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	private int anInt9384;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "I")
	private int anInt9385;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "I")
	public int anInt9386;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
	public boolean aBoolean700 = false;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	private int anInt9381 = 0;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!dl;")
	public final Class68 aClass68_2;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "J")
	private final long aLong247;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!ts;")
	public final Class46_Sub7 aClass46_Sub7_7;

	@OriginalMember(owner = "client!we", name = "R", descriptor = "Lclient!ol;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!mf;")
	public final Class184 aClass184_48;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!qa;Lclient!dl;Lclient!ts;J)V")
	public Class46_Sub8(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class46_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass68_2 = arg1;
		this.aLong247 = arg3;
		this.aClass46_Sub7_7 = arg2;
		this.aClass216_1 = this.aClass68_2.method1842();
		if (!arg0.method7195() && this.aClass216_1.anInt6377 != -1) {
			this.aClass216_1 = Static88.method1877(this.aClass216_1.anInt6377);
		}
		this.aClass184_48 = new Class184();
		this.anInt9381 = (int) ((double) this.anInt9381 + Math.random() * 64.0D);
		this.method8092();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JLclient!qa;Z)V")
	public void method8088(@OriginalArg(0) long arg0, @OriginalArg(1) Class4 arg1) {
		for (@Pc(7) Class46_Sub3_Sub1_Sub1 local7 = (Class46_Sub3_Sub1_Sub1) this.aClass184_48.method5138(); local7 != null; local7 = (Class46_Sub3_Sub1_Sub1) this.aClass184_48.method5145()) {
			local7.method4255(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(JZZLclient!qa;I)V")
	public void method8091(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3) {
		@Pc(38) int local38;
		if (this.aBoolean700) {
			arg1 = false;
		} else if (Static431.anInt7490 < this.aClass216_1.anInt6375) {
			arg1 = false;
		} else if (Static314.anIntArray470[Static431.anInt7490] < Static166.anInt3382) {
			arg1 = false;
		} else if (this.aBoolean701) {
			arg1 = false;
		} else if (this.aClass216_1.anInt6380 != -1) {
			local38 = (int) (arg0 - this.aLong247);
			if (this.aClass216_1.aBoolean471 || local38 <= this.aClass216_1.anInt6380) {
				local38 %= this.aClass216_1.anInt6380;
			} else {
				arg1 = false;
			}
			if (!this.aClass216_1.aBoolean478 && this.aClass216_1.anInt6391 > local38) {
				arg1 = false;
			}
			if (this.aClass216_1.aBoolean478 && local38 >= this.aClass216_1.anInt6391) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt9381 += (int) ((Math.random() * (double) (this.aClass216_1.anInt6374 - this.aClass216_1.anInt6409) + (double) this.aClass216_1.anInt6409) * (double) arg3);
			if (this.anInt9381 > 63) {
				local38 = this.anInt9381 >> 6;
				this.anInt9381 &= 0x3F;
				for (@Pc(141) int local141 = 0; local141 < local38; local141++) {
					@Pc(213) int local213;
					@Pc(207) int local207;
					@Pc(219) int local219;
					@Pc(165) int local165;
					@Pc(173) int local173;
					@Pc(177) int local177;
					@Pc(187) int local187;
					@Pc(195) int local195;
					@Pc(199) int local199;
					if (this.aClass216_1.aShort81 <= 0 && this.aClass216_1.aShort80 <= 0) {
						local219 = this.anInt9382;
						local207 = this.anInt9363;
						local213 = this.anInt9372;
					} else {
						local165 = this.anInt9369 + (int) (Math.random() * (double) this.anInt9365);
						@Pc(169) int local169 = local165 & 0x3FFF;
						local173 = Class200_Sub1.lb[local169];
						local177 = Class200_Sub1.anIntArray576[local169];
						local187 = (int) (Math.random() * (double) this.anInt9374) + this.anInt9385;
						@Pc(191) int local191 = local187 & 0x1FFF;
						local195 = Class200_Sub1.lb[local191];
						local199 = Class200_Sub1.anIntArray576[local191];
						local207 = (local199 << 0) * -1;
						local213 = local177 * local195 >> 15;
						local219 = local173 * local195 >> 15;
					}
					local165 = (int) (Math.random() * 65535.0D);
					local173 = (int) (Math.random() * 65535.0D);
					if (local173 + local165 > 65535) {
						local173 = 65535 - local173;
						local165 = 65535 - local165;
					}
					local177 = 65535 - local173 - local165;
					local187 = (int) ((long) local173 * (long) this.anInt9379 + (long) this.anInt9384 * (long) local165 + (long) local177 * (long) this.anInt9371 >> 16);
					local195 = (int) ((long) local165 * (long) this.anInt9359 + (long) local173 * (long) this.anInt9370 + (long) local177 * (long) this.anInt9383 >> 16);
					local199 = (int) ((long) this.anInt9375 * (long) local173 + (long) this.anInt9361 * (long) local165 + (long) this.anInt9362 * (long) local177 >> 16);
					@Pc(354) int local354 = this.aClass216_1.anInt6393 + (int) (Math.random() * (double) (this.aClass216_1.anInt6383 - this.aClass216_1.anInt6393));
					@Pc(371) int local371 = (int) (Math.random() * (double) (this.aClass216_1.anInt6411 - this.aClass216_1.anInt6399)) + this.aClass216_1.anInt6399;
					@Pc(387) int local387 = (int) (Math.random() * (double) (this.aClass216_1.anInt6376 - this.aClass216_1.anInt6394)) + this.aClass216_1.anInt6394;
					@Pc(449) int local449;
					if (this.aClass216_1.aBoolean475) {
						@Pc(453) double local453 = Math.random();
						local449 = (int) ((double) this.aClass216_1.anInt6390 * local453 + (double) this.aClass216_1.anInt6400) << 16 | (int) ((double) this.aClass216_1.anInt6365 + local453 * (double) this.aClass216_1.anInt6387) << 8 | (int) (local453 * (double) this.aClass216_1.anInt6370 + (double) this.aClass216_1.anInt6395) | (int) ((double) this.aClass216_1.anInt6414 + Math.random() * (double) this.aClass216_1.anInt6415) << 24;
					} else {
						local449 = (int) ((double) this.aClass216_1.anInt6395 + (double) this.aClass216_1.anInt6370 * Math.random()) | (int) ((double) this.aClass216_1.anInt6365 + Math.random() * (double) this.aClass216_1.anInt6387) << 8 | (int) ((double) this.aClass216_1.anInt6400 + (double) this.aClass216_1.anInt6390 * Math.random()) << 16 | (int) ((double) this.aClass216_1.anInt6414 + Math.random() * (double) this.aClass216_1.anInt6415) << 24;
					}
					@Pc(515) int local515 = this.aClass216_1.anInt6407;
					if (!arg2.method7195() && !this.aClass216_1.aBoolean477) {
						local515 = -1;
					}
					if (Static499.anInt8742 == Static218.anInt4312) {
						new Class46_Sub3_Sub1_Sub1(this, local187, local195, local199, local213, local207, local219, local354, local371, local449, local387, local515, this.aClass216_1.aBoolean472, this.aClass216_1.aBoolean474);
					} else {
						@Pc(559) Class46_Sub3_Sub1_Sub1 local559 = Static413.aClass46_Sub3_Sub1_Sub1Array1[Static499.anInt8742];
						Static499.anInt8742 = Static499.anInt8742 + 1 & 0x3FF;
						local559.method4254(this, local187, local195, local199, local213, local207, local219, local354, local371, local449, local387, local515, this.aClass216_1.aBoolean472, this.aClass216_1.aBoolean474);
					}
				}
			}
		}
		this.anInt9380 = 0;
		for (@Pc(602) Class46_Sub3_Sub1_Sub1 local602 = (Class46_Sub3_Sub1_Sub1) this.aClass184_48.method5138(); local602 != null; local602 = (Class46_Sub3_Sub1_Sub1) this.aClass184_48.method5145()) {
			local602.method4257(arg0, arg3);
			this.anInt9380++;
		}
		Static460.anInt7966 += this.anInt9380;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	public void method8092() {
		this.anInt9370 = this.aClass68_2.anInt1934;
		this.anInt9371 = this.aClass68_2.anInt1941;
		this.anInt9361 = this.aClass68_2.anInt1935;
		this.anInt9362 = this.aClass68_2.anInt1936;
		this.anInt9384 = this.aClass68_2.anInt1946;
		this.anInt9379 = this.aClass68_2.anInt1939;
		this.anInt9383 = this.aClass68_2.anInt1947;
		this.anInt9359 = this.aClass68_2.anInt1940;
		this.anInt9375 = this.aClass68_2.anInt1943;
		if (this.anInt9379 == this.anInt9384 && this.anInt9371 == this.anInt9379 && this.anInt9370 == this.anInt9359 && this.anInt9383 == this.anInt9370 && this.anInt9375 == this.anInt9361 && this.anInt9375 == this.anInt9362) {
			this.aBoolean701 = true;
			return;
		}
		this.aBoolean701 = false;
		@Pc(123) int local123 = (this.anInt9371 + this.anInt9379 + this.anInt9384) / 3;
		@Pc(135) int local135 = (this.anInt9359 + this.anInt9370 + this.anInt9383) / 3;
		@Pc(147) int local147 = (this.anInt9362 + this.anInt9361 + this.anInt9375) / 3;
		if (local123 == this.anInt9378 && this.anInt9386 == local135 && this.anInt9366 == local147) {
			return;
		}
		this.anInt9378 = local123;
		this.anInt9366 = local147;
		this.anInt9386 = local135;
		@Pc(180) int local180 = this.anInt9379 - this.anInt9384;
		@Pc(187) int local187 = this.anInt9370 - this.anInt9359;
		@Pc(193) int local193 = this.anInt9375 - this.anInt9361;
		@Pc(200) int local200 = this.anInt9371 - this.anInt9384;
		@Pc(206) int local206 = this.anInt9383 - this.anInt9359;
		@Pc(213) int local213 = this.anInt9362 - this.anInt9361;
		this.anInt9372 = local213 * local187 - local206 * local193;
		this.anInt9363 = local193 * local200 - local180 * local213;
		for (this.anInt9382 = local206 * local180 - local200 * local187; this.anInt9372 > 32767 || this.anInt9363 > 32767 || this.anInt9382 > 32767 || this.anInt9372 < -32767 || this.anInt9363 < -32767 || this.anInt9382 < -32767; this.anInt9382 >>= 0x1) {
			this.anInt9363 >>= 0x1;
			this.anInt9372 >>= 0x1;
		}
		@Pc(312) int local312 = (int) Math.sqrt((double) (this.anInt9363 * this.anInt9363 + this.anInt9372 * this.anInt9372 + this.anInt9382 * this.anInt9382));
		if (local312 <= 0) {
			local312 = 1;
		}
		this.anInt9372 = this.anInt9372 * 32767 / local312;
		this.anInt9382 = this.anInt9382 * 32767 / local312;
		this.anInt9363 = this.anInt9363 * 32767 / local312;
		if (this.aClass216_1.aShort81 <= 0 && this.aClass216_1.aShort80 <= 0) {
			return;
		}
		@Pc(362) int local362 = (int) (Math.atan2((double) this.anInt9382, (double) this.anInt9372) * 2607.5945876176133D);
		@Pc(383) int local383 = (int) (Math.atan2((double) this.anInt9363, Math.sqrt((double) (this.anInt9372 * this.anInt9372 + this.anInt9382 * this.anInt9382))) * 2607.5945876176133D);
		this.anInt9365 = this.aClass216_1.aShort81 - this.aClass216_1.aShort82;
		this.anInt9369 = this.aClass216_1.aShort82 + local362 - (this.anInt9365 >> 1);
		this.anInt9374 = this.aClass216_1.aShort80 - this.aClass216_1.aShort83;
		this.anInt9385 = local383 + this.aClass216_1.aShort83 - (this.anInt9374 >> 1);
	}
}
