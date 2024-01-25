import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
	public int anInt1010;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	private int anInt1009 = 0;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!k;")
	public Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "Lclient!k;")
	private Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "Lclient!ow;")
	public final Class248 aClass248_1;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "Lclient!wca;")
	public final Class41_Sub9 aClass41_Sub9_1;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "J")
	private final long aLong37;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Lclient!ld;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Lclient!kf;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!r;Lclient!ow;Lclient!wca;J)V")
	public Class41_Sub1(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class41_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aClass248_1 = arg1;
		this.aClass41_Sub9_1 = arg2;
		this.aLong37 = arg3;
		this.aClass186_1 = this.aClass248_1.method5769();
		if (!arg0.method7380() && this.aClass186_1.anInt5024 != -1) {
			this.aClass186_1 = Static469.method3733(this.aClass186_1.anInt5024);
		}
		this.aClass178_1 = new Class178();
		this.anInt1009 = (int) ((double) this.anInt1009 + Math.random() * 64.0D);
		this.method840();
		this.aClass170_2.anInt4663 = this.aClass170_1.anInt4663;
		this.aClass170_2.anInt4648 = this.aClass170_1.anInt4648;
		this.aClass170_2.anInt4647 = this.aClass170_1.anInt4647;
		this.aClass170_2.anInt4646 = this.aClass170_1.anInt4646;
		this.aClass170_2.anInt4649 = this.aClass170_1.anInt4649;
		this.aClass170_2.anInt4661 = this.aClass170_1.anInt4661;
		this.aClass170_2.anInt4651 = this.aClass170_1.anInt4651;
		this.aClass170_2.anInt4652 = this.aClass170_1.anInt4652;
		this.aClass170_2.anInt4655 = this.aClass170_1.anInt4655;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method840() {
		this.aClass170_1.anInt4646 = this.aClass248_1.anInt6909;
		this.aClass170_1.anInt4661 = this.aClass248_1.anInt6895;
		this.aClass170_1.anInt4649 = this.aClass248_1.anInt6892;
		this.aClass170_1.anInt4648 = this.aClass248_1.anInt6903;
		this.aClass170_1.anInt4663 = this.aClass248_1.anInt6906;
		this.aClass170_1.anInt4655 = this.aClass248_1.anInt6902;
		this.aClass170_1.anInt4651 = this.aClass248_1.anInt6898;
		this.aClass170_1.anInt4652 = this.aClass248_1.anInt6910;
		this.aClass170_1.anInt4647 = this.aClass248_1.anInt6911;
		if (this.aClass170_1.anInt4648 == this.aClass170_1.anInt4663 && this.aClass170_1.anInt4663 == this.aClass170_1.anInt4649 && this.aClass170_1.anInt4655 == this.aClass170_1.anInt4661 && this.aClass170_1.anInt4646 == this.aClass170_1.anInt4655 && this.aClass170_1.anInt4651 == this.aClass170_1.anInt4652 && this.aClass170_1.anInt4652 == this.aClass170_1.anInt4647) {
			this.aBoolean85 = true;
		} else if (this.aBoolean85) {
			this.aBoolean85 = false;
			this.aClass170_2.anInt4648 = this.aClass170_1.anInt4648;
			this.aClass170_2.anInt4651 = this.aClass170_1.anInt4651;
			this.aClass170_2.anInt4647 = this.aClass170_1.anInt4647;
			this.aClass170_2.anInt4652 = this.aClass170_1.anInt4652;
			this.aClass170_2.anInt4649 = this.aClass170_1.anInt4649;
			this.aClass170_2.anInt4655 = this.aClass170_1.anInt4655;
			this.aClass170_2.anInt4661 = this.aClass170_1.anInt4661;
			this.aClass170_2.anInt4646 = this.aClass170_1.anInt4646;
			this.aClass170_2.anInt4663 = this.aClass170_1.anInt4663;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(JZIILclient!r;)V")
	public void method841(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class45 arg3) {
		@Pc(34) int local34;
		if (this.aBoolean84) {
			arg1 = false;
		} else if (Static411.anInt7039 < this.aClass186_1.anInt4996) {
			arg1 = false;
		} else if (Static218.anInt3901 > Static354.anIntArray338[Static411.anInt7039]) {
			arg1 = false;
		} else if (this.aBoolean85) {
			arg1 = false;
		} else if (this.aClass186_1.anInt5026 != -1) {
			local34 = (int) (arg0 - this.aLong37);
			if (this.aClass186_1.aBoolean373 || this.aClass186_1.anInt5026 >= local34) {
				local34 %= this.aClass186_1.anInt5026;
			} else {
				arg1 = false;
			}
			if (!this.aClass186_1.aBoolean371 && local34 < this.aClass186_1.anInt5033) {
				arg1 = false;
			}
			if (this.aClass186_1.aBoolean371 && this.aClass186_1.anInt5033 <= local34) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static262.anInt4615++;
			local34 = (this.aClass170_1.anInt4663 + this.aClass170_1.anInt4648 + this.aClass170_1.anInt4649) / 3;
			@Pc(131) int local131 = (this.aClass170_1.anInt4646 + this.aClass170_1.anInt4661 + this.aClass170_1.anInt4655) / 3;
			@Pc(146) int local146 = (this.aClass170_1.anInt4652 + this.aClass170_1.anInt4651 + this.aClass170_1.anInt4647) / 3;
			@Pc(182) int local182;
			@Pc(191) int local191;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(218) int local218;
			@Pc(227) int local227;
			@Pc(331) int local331;
			@Pc(381) int local381;
			@Pc(403) int local403;
			if (local34 != this.aClass170_1.anInt4650 || local131 != this.aClass170_1.anInt4658 || this.aClass170_1.anInt4660 != local146) {
				this.aClass170_1.anInt4658 = local131;
				this.aClass170_1.anInt4660 = local146;
				this.aClass170_1.anInt4650 = local34;
				local182 = this.aClass170_1.anInt4663 - this.aClass170_1.anInt4648;
				local191 = this.aClass170_1.anInt4655 - this.aClass170_1.anInt4661;
				local200 = this.aClass170_1.anInt4652 - this.aClass170_1.anInt4651;
				local209 = this.aClass170_1.anInt4649 - this.aClass170_1.anInt4648;
				local218 = this.aClass170_1.anInt4646 - this.aClass170_1.anInt4661;
				local227 = this.aClass170_1.anInt4647 - this.aClass170_1.anInt4651;
				this.anInt1017 = local218 * local182 - local209 * local191;
				this.anInt1013 = local209 * local200 - local227 * local182;
				this.anInt1012 = local191 * local227 - local218 * local200;
				while (true) {
					if (this.anInt1012 <= 32767 && this.anInt1013 <= 32767 && this.anInt1017 <= 32767 && this.anInt1012 >= -32767 && this.anInt1013 >= -32767 && this.anInt1017 >= -32767) {
						local331 = (int) Math.sqrt((double) (this.anInt1017 * this.anInt1017 + this.anInt1012 * this.anInt1012 + this.anInt1013 * this.anInt1013));
						if (local331 <= 0) {
							local331 = 1;
						}
						this.anInt1013 = this.anInt1013 * 32767 / local331;
						this.anInt1012 = this.anInt1012 * 32767 / local331;
						this.anInt1017 = this.anInt1017 * 32767 / local331;
						if (this.aClass186_1.aShort78 > 0 || this.aClass186_1.aShort79 > 0) {
							local381 = (int) (Math.atan2((double) this.anInt1017, (double) this.anInt1012) * 2607.5945876176133D);
							local403 = (int) (Math.atan2((double) this.anInt1013, Math.sqrt((double) (this.anInt1012 * this.anInt1012 + this.anInt1017 * this.anInt1017))) * 2607.5945876176133D);
							this.anInt1018 = this.aClass186_1.aShort78 - this.aClass186_1.aShort80;
							this.anInt1014 = this.aClass186_1.aShort79 - this.aClass186_1.aShort81;
							this.anInt1015 = local381 + this.aClass186_1.aShort80 - (this.anInt1018 >> 1);
							this.anInt1016 = local403 + this.aClass186_1.aShort81 - (this.anInt1014 >> 1);
						}
						break;
					}
					this.anInt1012 >>= 0x1;
					this.anInt1013 >>= 0x1;
					this.anInt1017 >>= 0x1;
				}
			}
			this.anInt1009 += (int) ((double) arg2 * ((double) this.aClass186_1.anInt5041 + (double) (this.aClass186_1.anInt5016 - this.aClass186_1.anInt5041) * Math.random()));
			if (this.anInt1009 > 63) {
				local182 = this.anInt1009 >> 6;
				this.anInt1009 &= 0x3F;
				for (local218 = 0; local218 < local182; local218++) {
					@Pc(558) int local558;
					@Pc(562) int local562;
					if (this.aClass186_1.aShort78 <= 0 && this.aClass186_1.aShort79 <= 0) {
						local209 = this.anInt1017;
						local191 = this.anInt1012;
						local200 = this.anInt1013;
					} else {
						local227 = (int) (Math.random() * (double) this.anInt1018) + this.anInt1015;
						local227 &= 0x3FFF;
						local331 = Class356.anIntArray597[local227];
						local381 = Class356.anIntArray598[local227];
						local403 = (int) ((double) this.anInt1014 * Math.random()) + this.anInt1016;
						local403 &= 0x1FFF;
						local558 = Class356.anIntArray597[local403];
						local562 = Class356.anIntArray598[local403];
						local191 = local381 * local558 >> 13;
						local200 = (local562 << 1) * -1;
						local209 = local331 * local558 >> 13;
					}
					@Pc(585) float local585 = (float) Math.random();
					@Pc(588) float local588 = (float) Math.random();
					if (local585 + local588 > 1.0F) {
						local585 = 1.0F - local585;
						local588 = 1.0F - local588;
					}
					@Pc(609) float local609 = 1.0F - local588 - local585;
					local403 = (int) ((float) this.aClass170_1.anInt4648 * local585 + (float) this.aClass170_1.anInt4663 * local588 + (float) this.aClass170_1.anInt4649 * local609);
					local558 = (int) (local609 * (float) this.aClass170_1.anInt4646 + (float) this.aClass170_1.anInt4661 * local585 + (float) this.aClass170_1.anInt4655 * local588);
					local562 = (int) (local588 * (float) this.aClass170_1.anInt4652 + local585 * (float) this.aClass170_1.anInt4651 + local609 * (float) this.aClass170_1.anInt4647);
					@Pc(697) int local697 = (int) (local588 * (float) this.aClass170_2.anInt4663 + (float) this.aClass170_2.anInt4648 * local585 + (float) this.aClass170_2.anInt4649 * local609);
					@Pc(719) int local719 = (int) ((float) this.aClass170_2.anInt4646 * local609 + (float) this.aClass170_2.anInt4655 * local588 + (float) this.aClass170_2.anInt4661 * local585);
					@Pc(741) int local741 = (int) ((float) this.aClass170_2.anInt4647 * local609 + (float) this.aClass170_2.anInt4652 * local588 + local585 * (float) this.aClass170_2.anInt4651);
					@Pc(745) int local745 = local403 - local697;
					@Pc(750) int local750 = local558 - local719;
					@Pc(755) int local755 = local562 - local741;
					@Pc(764) int local764 = (int) ((double) local745 * Math.random() + (double) local697);
					@Pc(773) int local773 = (int) (Math.random() * (double) local750 + (double) local719);
					@Pc(782) int local782 = (int) ((double) local741 + (double) local755 * Math.random());
					@Pc(799) int local799 = (int) (Math.random() * (double) (this.aClass186_1.anInt5009 - this.aClass186_1.anInt5015)) + this.aClass186_1.anInt5015;
					@Pc(816) int local816 = this.aClass186_1.anInt5028 + (int) ((double) (this.aClass186_1.anInt5038 - this.aClass186_1.anInt5028) * Math.random());
					@Pc(833) int local833 = (int) (Math.random() * (double) (this.aClass186_1.anInt5010 - this.aClass186_1.anInt5002)) + this.aClass186_1.anInt5002;
					@Pc(897) int local897;
					if (this.aClass186_1.aBoolean370) {
						@Pc(839) double local839 = Math.random();
						local897 = (int) ((double) this.aClass186_1.anInt4999 + local839 * (double) this.aClass186_1.anInt5017) << 8 | (int) ((double) this.aClass186_1.anInt5022 * local839 + (double) this.aClass186_1.anInt5012) << 16 | (int) ((double) this.aClass186_1.anInt4993 * local839 + (double) this.aClass186_1.anInt5027) | (int) ((double) this.aClass186_1.anInt5005 * Math.random() + (double) this.aClass186_1.anInt4992) << 24;
					} else {
						local897 = (int) ((double) this.aClass186_1.anInt4992 + Math.random() * (double) this.aClass186_1.anInt5005) << 24 | (int) ((double) this.aClass186_1.anInt5027 + Math.random() * (double) this.aClass186_1.anInt4993) | (int) ((double) this.aClass186_1.anInt4999 + Math.random() * (double) this.aClass186_1.anInt5017) << 8 | (int) ((double) this.aClass186_1.anInt5012 + (double) this.aClass186_1.anInt5022 * Math.random()) << 16;
					}
					@Pc(961) int local961 = this.aClass186_1.anInt5007;
					if (!arg3.method7380() && !this.aClass186_1.aBoolean368) {
						local961 = -1;
					}
					if (Static89.anInt1888 == Static162.anInt987) {
						new Class41_Sub3_Sub1_Sub1(this, local764, local773, local782, local191, local200, local209, local799, local816, local897, local833, local961, this.aClass186_1.aBoolean374, this.aClass186_1.aBoolean369);
					} else {
						@Pc(981) Class41_Sub3_Sub1_Sub1 local981 = Static492.aClass41_Sub3_Sub1_Sub1Array1[Static89.anInt1888];
						Static89.anInt1888 = Static89.anInt1888 + 1 & 0x3FF;
						local981.method5676(this, local764, local773, local782, local191, local200, local209, local799, local816, local897, local833, local961, this.aClass186_1.aBoolean374, this.aClass186_1.aBoolean369);
					}
				}
			}
		}
		if (!this.aClass170_1.method4042(this.aClass170_2)) {
			@Pc(1049) Class170 local1049 = this.aClass170_2;
			this.aClass170_2 = this.aClass170_1;
			this.aClass170_1 = local1049;
			this.aClass170_1.anInt4651 = this.aClass248_1.anInt6898;
			this.aClass170_1.anInt4646 = this.aClass248_1.anInt6909;
			this.aClass170_1.anInt4661 = this.aClass248_1.anInt6895;
			this.aClass170_1.anInt4648 = this.aClass248_1.anInt6903;
			this.aClass170_1.anInt4663 = this.aClass248_1.anInt6906;
			this.aClass170_1.anInt4649 = this.aClass248_1.anInt6892;
			this.aClass170_1.anInt4647 = this.aClass248_1.anInt6911;
			this.aClass170_1.anInt4652 = this.aClass248_1.anInt6910;
			this.aClass170_1.anInt4655 = this.aClass248_1.anInt6902;
		}
		this.anInt1010 = 0;
		for (@Pc(1119) Class41_Sub3_Sub1_Sub1 local1119 = (Class41_Sub3_Sub1_Sub1) this.aClass178_1.method4168(); local1119 != null; local1119 = (Class41_Sub3_Sub1_Sub1) this.aClass178_1.method4165()) {
			local1119.method5673(arg0, arg2);
			this.anInt1010++;
		}
		Static440.anInt7351 += this.anInt1010;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!r;J)V")
	public void method843(@OriginalArg(1) Class45 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(11) Class41_Sub3_Sub1_Sub1 local11 = (Class41_Sub3_Sub1_Sub1) this.aClass178_1.method4168(); local11 != null; local11 = (Class41_Sub3_Sub1_Sub1) this.aClass178_1.method4165()) {
			local11.method5674(arg0, arg1);
		}
	}
}
