import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
	private int anInt6046;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	private int anInt6048;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
	private int anInt6049;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
	private int anInt6050;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt6054;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	private int anInt6056;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	private int anInt6057;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
	private int anInt6058;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
	private int anInt6064;

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
	private int anInt6066;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	private int anInt6068;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	public int anInt6069;

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
	public int anInt6070;

	@OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
	private int anInt6071;

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
	private int anInt6062 = 0;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!nn", name = "P", descriptor = "Lclient!qv;")
	public final Class6_Sub7 aClass6_Sub7_7;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "Lclient!mm;")
	public final Class192 aClass192_2;

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "J")
	private final long aLong155;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Lclient!cr;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "Lclient!gu;")
	public final Class107 aClass107_4;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!qa;Lclient!mm;Lclient!qv;J)V")
	public Class6_Sub6(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class6_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass6_Sub7_7 = arg2;
		this.aClass192_2 = arg1;
		this.aLong155 = arg3;
		this.aClass44_1 = this.aClass192_2.method4747();
		if (!arg0.method6066() && this.aClass44_1.anInt1484 != -1) {
			this.aClass44_1 = Static328.method5246(this.aClass44_1.anInt1484);
		}
		this.aClass107_4 = new Class107();
		this.anInt6062 = (int) ((double) this.anInt6062 + Math.random() * 64.0D);
		this.method5162();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIJLclient!qa;Z)V")
	public void method5161(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(45) int local45;
		if (this.aBoolean450) {
			arg3 = false;
		} else if (this.aClass44_1.anInt1489 > Static485.anInt8595) {
			arg3 = false;
		} else if (Static507.anIntArray337[Static485.anInt8595] < Static213.anInt3839) {
			arg3 = false;
		} else if (this.aBoolean449) {
			arg3 = false;
		} else if (this.aClass44_1.anInt1516 != -1) {
			local45 = (int) (arg1 - this.aLong155);
			if (this.aClass44_1.aBoolean114 || local45 <= this.aClass44_1.anInt1516) {
				local45 %= this.aClass44_1.anInt1516;
			} else {
				arg3 = false;
			}
			if (!this.aClass44_1.aBoolean110 && local45 < this.aClass44_1.anInt1505) {
				arg3 = false;
			}
			if (this.aClass44_1.aBoolean110 && local45 >= this.aClass44_1.anInt1505) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6062 += (int) (((double) (this.aClass44_1.anInt1529 - this.aClass44_1.anInt1518) * Math.random() + (double) this.aClass44_1.anInt1518) * (double) arg0);
			if (this.anInt6062 > 63) {
				local45 = this.anInt6062 >> 6;
				this.anInt6062 &= 0x3F;
				for (@Pc(140) int local140 = 0; local140 < local45; local140++) {
					@Pc(203) int local203;
					@Pc(209) int local209;
					@Pc(215) int local215;
					@Pc(160) int local160;
					@Pc(168) int local168;
					@Pc(172) int local172;
					@Pc(183) int local183;
					@Pc(191) int local191;
					@Pc(195) int local195;
					if (this.aClass44_1.aShort26 <= 0 && this.aClass44_1.aShort28 <= 0) {
						local203 = this.anInt6057;
						local209 = this.anInt6061;
						local215 = this.anInt6068;
					} else {
						local160 = (int) ((double) this.anInt6050 * Math.random()) + this.anInt6063;
						@Pc(164) int local164 = local160 & 0x3FFF;
						local168 = Class125.anIntArray381[local164];
						local172 = Class125.anIntArray382[local164];
						local183 = this.anInt6065 + (int) (Math.random() * (double) this.anInt6066);
						@Pc(187) int local187 = local183 & 0x1FFF;
						local191 = Class125.anIntArray381[local187];
						local195 = Class125.anIntArray382[local187];
						local203 = local172 * local191 >> 15;
						local209 = (local195 << 0) * -1;
						local215 = local168 * local191 >> 15;
					}
					local160 = (int) (Math.random() * 65535.0D);
					local168 = (int) (Math.random() * 65535.0D);
					if (local160 + local168 > 65535) {
						local168 = 65535 - local168;
						local160 = 65535 - local160;
					}
					local172 = 65535 - local160 - local168;
					local183 = (int) ((long) this.anInt6071 * (long) local160 + (long) this.anInt6056 * (long) local168 + (long) local172 * (long) this.anInt6060 >> 16);
					local191 = (int) ((long) local172 * (long) this.anInt6046 + (long) local160 * (long) this.anInt6048 + (long) this.anInt6064 * (long) local168 >> 16);
					local195 = (int) ((long) this.anInt6054 * (long) local172 + (long) local168 * (long) this.anInt6058 + (long) this.anInt6049 * (long) local160 >> 16);
					@Pc(348) int local348 = (int) ((double) (this.aClass44_1.lb - this.aClass44_1.anInt1515) * Math.random()) + this.aClass44_1.anInt1515;
					@Pc(365) int local365 = (int) ((double) (this.aClass44_1.anInt1498 - this.aClass44_1.anInt1530) * Math.random()) + this.aClass44_1.anInt1530;
					@Pc(381) int local381 = this.aClass44_1.anInt1483 + (int) (Math.random() * (double) (this.aClass44_1.anInt1485 - this.aClass44_1.anInt1483));
					@Pc(443) int local443;
					if (this.aClass44_1.aBoolean109) {
						@Pc(447) double local447 = Math.random();
						local443 = (int) (local447 * (double) this.aClass44_1.anInt1522 + (double) this.aClass44_1.anInt1496) << 16 | (int) (local447 * (double) this.aClass44_1.anInt1513 + (double) this.aClass44_1.anInt1511) << 8 | (int) ((double) this.aClass44_1.anInt1517 + local447 * (double) this.aClass44_1.anInt1531) | (int) ((double) this.aClass44_1.anInt1514 * Math.random() + (double) this.aClass44_1.anInt1512) << 24;
					} else {
						local443 = (int) ((double) this.aClass44_1.anInt1496 + (double) this.aClass44_1.anInt1522 * Math.random()) << 16 | (int) ((double) this.aClass44_1.anInt1513 * Math.random() + (double) this.aClass44_1.anInt1511) << 8 | (int) ((double) this.aClass44_1.anInt1531 * Math.random() + (double) this.aClass44_1.anInt1517) | (int) (Math.random() * (double) this.aClass44_1.anInt1514 + (double) this.aClass44_1.anInt1512) << 24;
					}
					@Pc(509) int local509 = this.aClass44_1.anInt1528;
					if (!arg2.method6066() && !this.aClass44_1.aBoolean108) {
						local509 = -1;
					}
					if (Static64.anInt1240 == Static443.anInt8057) {
						new Class6_Sub1_Sub2_Sub1(this, local183, local191, local195, local203, local209, local215, local348, local365, local443, local381, local509, this.aClass44_1.aBoolean106, this.aClass44_1.aBoolean112);
					} else {
						@Pc(529) Class6_Sub1_Sub2_Sub1 local529 = Static150.aClass6_Sub1_Sub2_Sub1Array1[Static64.anInt1240];
						Static64.anInt1240 = Static64.anInt1240 + 1 & 0x3FF;
						local529.method6816(this, local183, local191, local195, local203, local209, local215, local348, local365, local443, local381, local509, this.aClass44_1.aBoolean106, this.aClass44_1.aBoolean112);
					}
				}
			}
		}
		this.anInt6070 = 0;
		for (@Pc(599) Class6_Sub1_Sub2_Sub1 local599 = (Class6_Sub1_Sub2_Sub1) this.aClass107_4.method2832(); local599 != null; local599 = (Class6_Sub1_Sub2_Sub1) this.aClass107_4.method2835()) {
			local599.method6815(arg1, arg0);
			this.anInt6070++;
		}
		Static160.anInt2910 += this.anInt6070;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	public void method5162() {
		this.anInt6064 = this.aClass192_2.anInt5534;
		this.anInt6060 = this.aClass192_2.anInt5537;
		this.anInt6056 = this.aClass192_2.anInt5545;
		this.anInt6046 = this.aClass192_2.anInt5535;
		this.anInt6071 = this.aClass192_2.anInt5538;
		this.anInt6058 = this.aClass192_2.anInt5533;
		this.anInt6049 = this.aClass192_2.anInt5542;
		this.anInt6054 = this.aClass192_2.anInt5531;
		this.anInt6048 = this.aClass192_2.anInt5544;
		if (this.anInt6056 == this.anInt6071 && this.anInt6060 == this.anInt6056 && this.anInt6064 == this.anInt6048 && this.anInt6046 == this.anInt6064 && this.anInt6049 == this.anInt6058 && this.anInt6058 == this.anInt6054) {
			this.aBoolean449 = true;
			return;
		}
		this.aBoolean449 = false;
		@Pc(124) int local124 = (this.anInt6060 + this.anInt6056 + this.anInt6071) / 3;
		@Pc(137) int local137 = (this.anInt6048 + this.anInt6064 + this.anInt6046) / 3;
		@Pc(148) int local148 = (this.anInt6058 + this.anInt6049 + this.anInt6054) / 3;
		if (this.anInt6053 == local124 && local137 == this.anInt6069 && this.anInt6047 == local148) {
			return;
		}
		this.anInt6053 = local124;
		this.anInt6069 = local137;
		this.anInt6047 = local148;
		@Pc(188) int local188 = this.anInt6056 - this.anInt6071;
		@Pc(194) int local194 = this.anInt6064 - this.anInt6048;
		@Pc(201) int local201 = this.anInt6058 - this.anInt6049;
		@Pc(208) int local208 = this.anInt6060 - this.anInt6071;
		@Pc(214) int local214 = this.anInt6046 - this.anInt6048;
		@Pc(221) int local221 = this.anInt6054 - this.anInt6049;
		this.anInt6057 = local194 * local221 - local214 * local201;
		this.anInt6068 = local214 * local188 - local208 * local194;
		this.anInt6061 = local201 * local208 - local221 * local188;
		while (this.anInt6057 > 32767 || this.anInt6061 > 32767 || this.anInt6068 > 32767 || this.anInt6057 < -32767 || this.anInt6061 < -32767 || this.anInt6068 < -32767) {
			this.anInt6068 >>= 0x1;
			this.anInt6061 >>= 0x1;
			this.anInt6057 >>= 0x1;
		}
		@Pc(319) int local319 = (int) Math.sqrt((double) (this.anInt6068 * this.anInt6068 + this.anInt6057 * this.anInt6057 + this.anInt6061 * this.anInt6061));
		if (local319 <= 0) {
			local319 = 1;
		}
		this.anInt6068 = this.anInt6068 * 32767 / local319;
		this.anInt6057 = this.anInt6057 * 32767 / local319;
		this.anInt6061 = this.anInt6061 * 32767 / local319;
		if (this.aClass44_1.aShort26 <= 0 && this.aClass44_1.aShort28 <= 0) {
			return;
		}
		@Pc(372) int local372 = (int) (Math.atan2((double) this.anInt6068, (double) this.anInt6057) * 2607.5945876176133D);
		@Pc(393) int local393 = (int) (Math.atan2((double) this.anInt6061, Math.sqrt((double) (this.anInt6057 * this.anInt6057 + this.anInt6068 * this.anInt6068))) * 2607.5945876176133D);
		this.anInt6050 = this.aClass44_1.aShort26 - this.aClass44_1.aShort25;
		this.anInt6066 = this.aClass44_1.aShort28 - this.aClass44_1.aShort27;
		this.anInt6063 = local372 + this.aClass44_1.aShort25 - (this.anInt6050 >> 1);
		this.anInt6065 = local393 + this.aClass44_1.aShort27 - (this.anInt6066 >> 1);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!qa;JI)V")
	public void method5164(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(7) Class6_Sub1_Sub2_Sub1 local7 = (Class6_Sub1_Sub2_Sub1) this.aClass107_4.method2832(); local7 != null; local7 = (Class6_Sub1_Sub2_Sub1) this.aClass107_4.method2835()) {
			local7.method6819(arg0, arg1);
		}
	}
}
