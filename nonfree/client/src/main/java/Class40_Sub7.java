import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class40_Sub7 extends Class40 {

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public int anInt5410;

	@OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
	private int anInt5411;

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
	private int anInt5412;

	@OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
	private int anInt5413;

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
	private int anInt5417;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	private int anInt5418;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	private int anInt5420;

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	private int anInt5422;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	private int anInt5424;

	@OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
	private int anInt5425;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	private int anInt5428;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	private int anInt5429;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	private int anInt5431;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
	private int anInt5432;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
	private int anInt5433;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	public int anInt5434;

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
	private int anInt5435;

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	private int anInt5415 = 0;

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "Lclient!oi;")
	public final Class40_Sub6 aClass40_Sub6_5;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "J")
	private final long aLong186;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "Lclient!fi;")
	public final Class78 aClass78_2;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "Lclient!eq;")
	public Class70 aClass70_1;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "Lclient!tn;")
	public final Class240 aClass240_4;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!za;Lclient!fi;Lclient!oi;J)V")
	public Class40_Sub7(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class40_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aClass40_Sub6_5 = arg2;
		this.aLong186 = arg3;
		this.aClass78_2 = arg1;
		this.aClass70_1 = this.aClass78_2.method1971();
		if (!arg0.method5859() && this.aClass70_1.anInt2022 != -1) {
			this.aClass70_1 = Static24.method326(this.aClass70_1.anInt2022);
		}
		this.aClass240_4 = new Class240();
		this.anInt5415 = (int) ((double) this.anInt5415 + Math.random() * 64.0D);
		this.method4324();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(JI)V")
	public void method4322(@OriginalArg(0) long arg0) {
		for (@Pc(16) Class40_Sub2_Sub1_Sub1 local16 = (Class40_Sub2_Sub1_Sub1) this.aClass240_4.method5227(); local16 != null; local16 = (Class40_Sub2_Sub1_Sub1) this.aClass240_4.method5230()) {
			local16.method1581(arg0);
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
	public void method4324() {
		this.anInt5418 = this.aClass78_2.anInt2265;
		this.anInt5414 = this.aClass78_2.anInt2268;
		this.anInt5413 = this.aClass78_2.anInt2277;
		this.anInt5424 = this.aClass78_2.anInt2269;
		this.anInt5435 = this.aClass78_2.anInt2276;
		this.anInt5433 = this.aClass78_2.anInt2266;
		this.anInt5432 = this.aClass78_2.anInt2279;
		this.anInt5429 = this.aClass78_2.anInt2274;
		this.anInt5422 = this.aClass78_2.anInt2272;
		if (this.anInt5418 == this.anInt5432 && this.anInt5413 == this.anInt5432 && this.anInt5429 == this.anInt5422 && this.anInt5433 == this.anInt5429 && this.anInt5424 == this.anInt5435 && this.anInt5414 == this.anInt5424) {
			this.aBoolean359 = true;
			return;
		}
		this.aBoolean359 = false;
		@Pc(110) int local110 = (this.anInt5413 + this.anInt5432 + this.anInt5418) / 3;
		@Pc(122) int local122 = (this.anInt5429 + this.anInt5422 + this.anInt5433) / 3;
		@Pc(133) int local133 = (this.anInt5414 + this.anInt5424 + this.anInt5435) / 3;
		if (this.anInt5410 == local110 && this.anInt5423 == local122 && this.anInt5434 == local133) {
			return;
		}
		this.anInt5423 = local122;
		this.anInt5410 = local110;
		this.anInt5434 = local133;
		@Pc(162) int local162 = this.anInt5432 - this.anInt5418;
		@Pc(169) int local169 = this.anInt5429 - this.anInt5422;
		@Pc(175) int local175 = this.anInt5424 - this.anInt5435;
		@Pc(182) int local182 = this.anInt5413 - this.anInt5418;
		@Pc(188) int local188 = this.anInt5433 - this.anInt5422;
		@Pc(194) int local194 = this.anInt5414 - this.anInt5435;
		this.anInt5411 = local188 * local162 - local182 * local169;
		this.anInt5412 = local182 * local175 - local194 * local162;
		this.anInt5428 = local169 * local194 - local188 * local175;
		while (this.anInt5428 > 32767 || this.anInt5412 > 32767 || this.anInt5411 > 32767 || this.anInt5428 < -32767 || this.anInt5412 < -32767 || this.anInt5411 < -32767) {
			this.anInt5428 >>= 0x1;
			this.anInt5411 >>= 0x1;
			this.anInt5412 >>= 0x1;
		}
		@Pc(293) int local293 = (int) Math.sqrt((double) (this.anInt5411 * this.anInt5411 + this.anInt5412 * this.anInt5412 + this.anInt5428 * this.anInt5428));
		if (local293 <= 0) {
			local293 = 1;
		}
		this.anInt5411 = this.anInt5411 * 32767 / local293;
		this.anInt5428 = this.anInt5428 * 32767 / local293;
		this.anInt5412 = this.anInt5412 * 32767 / local293;
		if (this.aClass70_1.aShort15 <= 0 && this.aClass70_1.aShort14 <= 0) {
			return;
		}
		@Pc(343) int local343 = (int) (Math.atan2((double) this.anInt5411, (double) this.anInt5428) * 2607.5945876176133D);
		@Pc(364) int local364 = (int) (Math.atan2((double) this.anInt5412, Math.sqrt((double) (this.anInt5411 * this.anInt5411 + this.anInt5428 * this.anInt5428))) * 2607.5945876176133D);
		this.anInt5425 = this.aClass70_1.aShort15 - this.aClass70_1.aShort12;
		this.anInt5417 = this.aClass70_1.aShort12 + local343 - (this.anInt5425 >> 1);
		this.anInt5431 = this.aClass70_1.aShort14 - this.aClass70_1.aShort13;
		this.anInt5420 = local364 + this.aClass70_1.aShort13 - (this.anInt5431 >> 1);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZILclient!za;J)V")
	public void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class50 arg2, @OriginalArg(4) long arg3) {
		@Pc(37) int local37;
		if (this.aBoolean358) {
			arg1 = false;
		} else if (Static68.anInt1468 < this.aClass70_1.anInt2019) {
			arg1 = false;
		} else if (Static250.anIntArray450[Static68.anInt1468] < Static151.anInt3117) {
			arg1 = false;
		} else if (this.aBoolean359) {
			arg1 = false;
		} else if (this.aClass70_1.anInt2050 != -1) {
			local37 = (int) (arg3 - this.aLong186);
			if (this.aClass70_1.aBoolean125 || local37 <= this.aClass70_1.anInt2050) {
				local37 %= this.aClass70_1.anInt2050;
			} else {
				arg1 = false;
			}
			if (!this.aClass70_1.aBoolean126 && this.aClass70_1.anInt2062 > local37) {
				arg1 = false;
			}
			if (this.aClass70_1.aBoolean126 && local37 >= this.aClass70_1.anInt2062) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5415 += (int) ((double) arg0 * ((double) this.aClass70_1.anInt2039 + Math.random() * (double) (this.aClass70_1.anInt2023 - this.aClass70_1.anInt2039)));
			if (this.anInt5415 > 63) {
				local37 = this.anInt5415 >> 6;
				this.anInt5415 &= 0x3F;
				for (@Pc(155) int local155 = 0; local155 < local37; local155++) {
					@Pc(228) int local228;
					@Pc(222) int local222;
					@Pc(234) int local234;
					@Pc(179) int local179;
					@Pc(187) int local187;
					@Pc(191) int local191;
					@Pc(202) int local202;
					@Pc(210) int local210;
					@Pc(214) int local214;
					if (this.aClass70_1.aShort15 <= 0 && this.aClass70_1.aShort14 <= 0) {
						local222 = this.anInt5412;
						local228 = this.anInt5428;
						local234 = this.anInt5411;
					} else {
						local179 = this.anInt5417 + (int) (Math.random() * (double) this.anInt5425);
						@Pc(183) int local183 = local179 & 0x3FFF;
						local187 = Class250.anIntArray675[local183];
						local191 = Class250.anIntArray674[local183];
						local202 = this.anInt5420 + (int) ((double) this.anInt5431 * Math.random());
						@Pc(206) int local206 = local202 & 0x1FFF;
						local210 = Class250.anIntArray675[local206];
						local214 = Class250.anIntArray674[local206];
						local222 = (local214 << 0) * -1;
						local228 = local191 * local210 >> 15;
						local234 = local187 * local210 >> 15;
					}
					local179 = (int) (Math.random() * 65535.0D);
					local187 = (int) (Math.random() * 65535.0D);
					if (local187 + local179 > 65535) {
						local187 = 65535 - local187;
						local179 = 65535 - local179;
					}
					local191 = 65535 - local179 - local187;
					local202 = (int) ((long) local187 * (long) this.anInt5432 + (long) this.anInt5418 * (long) local179 + (long) this.anInt5413 * (long) local191 >> 16);
					local210 = (int) ((long) this.anInt5422 * (long) local179 + (long) local187 * (long) this.anInt5429 + (long) this.anInt5433 * (long) local191 >> 16);
					local214 = (int) ((long) this.anInt5424 * (long) local187 + (long) local179 * (long) this.anInt5435 + (long) local191 * (long) this.anInt5414 >> 16);
					@Pc(369) int local369 = this.aClass70_1.anInt2033 + (int) (Math.random() * (double) (this.aClass70_1.anInt2044 - this.aClass70_1.anInt2033));
					@Pc(386) int local386 = (int) (Math.random() * (double) (this.aClass70_1.anInt2017 - this.aClass70_1.anInt2020)) + this.aClass70_1.anInt2020;
					@Pc(403) int local403 = this.aClass70_1.anInt2027 + (int) ((double) (this.aClass70_1.anInt2013 - this.aClass70_1.anInt2027) * Math.random());
					@Pc(467) int local467;
					if (this.aClass70_1.lb) {
						@Pc(409) double local409 = Math.random();
						local467 = (int) ((double) this.aClass70_1.anInt2055 + Math.random() * (double) this.aClass70_1.anInt2060) << 24 | (int) ((double) this.aClass70_1.anInt2034 * local409 + (double) this.aClass70_1.anInt2016) | (int) ((double) this.aClass70_1.anInt2048 * local409 + (double) this.aClass70_1.anInt2018) << 8 | (int) ((double) this.aClass70_1.anInt2043 + local409 * (double) this.aClass70_1.anInt2035) << 16;
					} else {
						local467 = (int) ((double) this.aClass70_1.anInt2055 + (double) this.aClass70_1.anInt2060 * Math.random()) << 24 | (int) ((double) this.aClass70_1.anInt2043 + (double) this.aClass70_1.anInt2035 * Math.random()) << 16 | (int) (Math.random() * (double) this.aClass70_1.anInt2048 + (double) this.aClass70_1.anInt2018) << 8 | (int) (Math.random() * (double) this.aClass70_1.anInt2034 + (double) this.aClass70_1.anInt2016);
					}
					@Pc(531) int local531 = this.aClass70_1.anInt2065;
					if (!arg2.method5859() && !this.aClass70_1.aBoolean128) {
						local531 = -1;
					}
					if (Static61.anInt1131 == Static128.anInt7165) {
						new Class40_Sub2_Sub1_Sub1(this, local202, local210, local214, local228, local222, local234, local369, local386, local467, local403, local531, this.aClass70_1.aBoolean129, this.aClass70_1.aBoolean130);
					} else {
						@Pc(551) Class40_Sub2_Sub1_Sub1 local551 = Static152.aClass40_Sub2_Sub1_Sub1Array1[Static128.anInt7165];
						Static128.anInt7165 = Static128.anInt7165 + 1 & 0x3FF;
						local551.method1578(this, local202, local210, local214, local228, local222, local234, local369, local386, local467, local403, local531, this.aClass70_1.aBoolean129, this.aClass70_1.aBoolean130);
					}
				}
			}
		}
		this.anInt5419 = 0;
		for (@Pc(618) Class40_Sub2_Sub1_Sub1 local618 = (Class40_Sub2_Sub1_Sub1) this.aClass240_4.method5227(); local618 != null; local618 = (Class40_Sub2_Sub1_Sub1) this.aClass240_4.method5230()) {
			local618.method1582(arg3, arg0);
			this.anInt5419++;
		}
		Static260.anInt4625 += this.anInt5419;
	}
}
