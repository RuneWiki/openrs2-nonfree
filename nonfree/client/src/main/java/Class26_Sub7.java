import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class26_Sub7 extends Class26 {

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public int anInt7069;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	private int anInt7072;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
	private int anInt7073;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	private int anInt7074;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	private int anInt7075;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	private int anInt7076;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	private int anInt7077;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
	private int anInt7078;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
	private int anInt7070 = 0;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!ad;")
	public Class5 aClass5_1 = new Class5();

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "Lclient!ad;")
	private Class5 aClass5_2 = new Class5();

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Z")
	private boolean aBoolean510 = false;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!hv;")
	public final Class26_Sub3 aClass26_Sub3_6;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!jt;")
	public final Class181 aClass181_2;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!ih;")
	public Class160 aClass160_1;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "Lclient!aea;")
	public final Class8 aClass8_6;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!oa;Lclient!jt;Lclient!hv;J)V")
	public Class26_Sub7(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class26_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass26_Sub3_6 = arg2;
		this.aClass181_2 = arg1;
		this.aLong206 = arg3;
		this.aClass160_1 = this.aClass181_2.method4269();
		if (!arg0.method6850() && this.aClass160_1.lb != -1) {
			this.aClass160_1 = Static580.method2376(this.aClass160_1.lb);
		}
		this.aClass8_6 = new Class8();
		this.anInt7070 = (int) ((double) this.anInt7070 + Math.random() * 64.0D);
		this.method5889();
		this.aClass5_2.anInt67 = this.aClass5_1.anInt67;
		this.aClass5_2.anInt66 = this.aClass5_1.anInt66;
		this.aClass5_2.anInt64 = this.aClass5_1.anInt64;
		this.aClass5_2.anInt57 = this.aClass5_1.anInt57;
		this.aClass5_2.anInt62 = this.aClass5_1.anInt62;
		this.aClass5_2.anInt56 = this.aClass5_1.anInt56;
		this.aClass5_2.anInt68 = this.aClass5_1.anInt68;
		this.aClass5_2.anInt60 = this.aClass5_1.anInt60;
		this.aClass5_2.anInt61 = this.aClass5_1.anInt61;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
	public void method5889() {
		this.aClass5_1.anInt56 = this.aClass181_2.anInt5032;
		this.aClass5_1.anInt68 = this.aClass181_2.anInt5022;
		this.aClass5_1.anInt66 = this.aClass181_2.anInt5029;
		this.aClass5_1.anInt62 = this.aClass181_2.anInt5024;
		this.aClass5_1.anInt67 = this.aClass181_2.anInt5027;
		this.aClass5_1.anInt61 = this.aClass181_2.anInt5021;
		this.aClass5_1.anInt57 = this.aClass181_2.anInt5025;
		this.aClass5_1.anInt64 = this.aClass181_2.anInt5017;
		this.aClass5_1.anInt60 = this.aClass181_2.anInt5019;
		if (this.aClass5_1.anInt62 == this.aClass5_1.anInt57 && this.aClass5_1.anInt67 == this.aClass5_1.anInt62 && this.aClass5_1.anInt64 == this.aClass5_1.anInt61 && this.aClass5_1.anInt64 == this.aClass5_1.anInt68 && this.aClass5_1.anInt60 == this.aClass5_1.anInt56 && this.aClass5_1.anInt56 == this.aClass5_1.anInt66) {
			this.aBoolean510 = true;
		} else if (this.aBoolean510) {
			this.aClass5_2.anInt67 = this.aClass5_1.anInt67;
			this.aClass5_2.anInt57 = this.aClass5_1.anInt57;
			this.aClass5_2.anInt62 = this.aClass5_1.anInt62;
			this.aClass5_2.anInt56 = this.aClass5_1.anInt56;
			this.aClass5_2.anInt68 = this.aClass5_1.anInt68;
			this.aClass5_2.anInt61 = this.aClass5_1.anInt61;
			this.aClass5_2.anInt60 = this.aClass5_1.anInt60;
			this.aBoolean510 = false;
			this.aClass5_2.anInt66 = this.aClass5_1.anInt66;
			this.aClass5_2.anInt64 = this.aClass5_1.anInt64;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!oa;JB)V")
	public void method5890(@OriginalArg(0) Class66 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(7) Class26_Sub1_Sub1_Sub1 local7 = (Class26_Sub1_Sub1_Sub1) this.aClass8_6.method110(); local7 != null; local7 = (Class26_Sub1_Sub1_Sub1) this.aClass8_6.method113()) {
			local7.method7589(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JIIZLclient!oa;)V")
	public void method5891(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class66 arg3) {
		@Pc(37) int local37;
		if (this.aBoolean509) {
			arg2 = false;
		} else if (Static400.anInt6962 < this.aClass160_1.anInt4533) {
			arg2 = false;
		} else if (Static496.anInt8593 > Static59.anIntArray143[Static400.anInt6962]) {
			arg2 = false;
		} else if (this.aBoolean510) {
			arg2 = false;
		} else if (this.aClass160_1.anInt4549 != -1) {
			local37 = (int) (arg0 - this.aLong206);
			if (this.aClass160_1.aBoolean337 || local37 <= this.aClass160_1.anInt4549) {
				local37 %= this.aClass160_1.anInt4549;
			} else {
				arg2 = false;
			}
			if (!this.aClass160_1.aBoolean338 && this.aClass160_1.anInt4498 > local37) {
				arg2 = false;
			}
			if (this.aClass160_1.aBoolean338 && local37 >= this.aClass160_1.anInt4498) {
				arg2 = false;
			}
		}
		if (arg2) {
			Static6.anInt96++;
			local37 = (this.aClass5_1.anInt57 + this.aClass5_1.anInt62 + this.aClass5_1.anInt67) / 3;
			@Pc(134) int local134 = (this.aClass5_1.anInt64 + this.aClass5_1.anInt61 + this.aClass5_1.anInt68) / 3;
			@Pc(149) int local149 = (this.aClass5_1.anInt56 + this.aClass5_1.anInt60 + this.aClass5_1.anInt66) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(225) int local225;
			@Pc(233) int local233;
			@Pc(334) int local334;
			@Pc(384) int local384;
			@Pc(405) int local405;
			if (this.aClass5_1.anInt58 != local37 || local134 != this.aClass5_1.anInt59 || this.aClass5_1.anInt63 != local149) {
				this.aClass5_1.anInt63 = local149;
				this.aClass5_1.anInt58 = local37;
				this.aClass5_1.anInt59 = local134;
				local189 = this.aClass5_1.anInt62 - this.aClass5_1.anInt57;
				local198 = this.aClass5_1.anInt64 - this.aClass5_1.anInt61;
				local207 = this.aClass5_1.anInt56 - this.aClass5_1.anInt60;
				local216 = this.aClass5_1.anInt67 - this.aClass5_1.anInt57;
				local225 = this.aClass5_1.anInt68 - this.aClass5_1.anInt61;
				local233 = this.aClass5_1.anInt66 - this.aClass5_1.anInt60;
				this.anInt7077 = local189 * local225 - local198 * local216;
				this.anInt7072 = local216 * local207 - local233 * local189;
				this.anInt7078 = local233 * local198 - local207 * local225;
				while (true) {
					if (this.anInt7078 <= 32767 && this.anInt7072 <= 32767 && this.anInt7077 <= 32767 && this.anInt7078 >= -32767 && this.anInt7072 >= -32767 && this.anInt7077 >= -32767) {
						local334 = (int) Math.sqrt((double) (this.anInt7078 * this.anInt7078 + this.anInt7072 * this.anInt7072 + this.anInt7077 * this.anInt7077));
						if (local334 <= 0) {
							local334 = 1;
						}
						this.anInt7077 = this.anInt7077 * 32767 / local334;
						this.anInt7072 = this.anInt7072 * 32767 / local334;
						this.anInt7078 = this.anInt7078 * 32767 / local334;
						if (this.aClass160_1.aShort71 > 0 || this.aClass160_1.aShort74 > 0) {
							local384 = (int) (Math.atan2((double) this.anInt7077, (double) this.anInt7078) * 2607.5945876176133D);
							local405 = (int) (Math.atan2((double) this.anInt7072, Math.sqrt((double) (this.anInt7077 * this.anInt7077 + this.anInt7078 * this.anInt7078))) * 2607.5945876176133D);
							this.anInt7074 = this.aClass160_1.aShort71 - this.aClass160_1.aShort73;
							this.anInt7075 = this.aClass160_1.aShort74 - this.aClass160_1.aShort72;
							this.anInt7073 = local384 + this.aClass160_1.aShort73 - (this.anInt7074 >> 1);
							this.anInt7076 = local405 + this.aClass160_1.aShort72 - (this.anInt7075 >> 1);
						}
						break;
					}
					this.anInt7077 >>= 0x1;
					this.anInt7078 >>= 0x1;
					this.anInt7072 >>= 0x1;
				}
			}
			this.anInt7070 += (int) ((Math.random() * (double) (this.aClass160_1.anInt4499 - this.aClass160_1.anInt4512) + (double) this.aClass160_1.anInt4512) * (double) arg1);
			if (this.anInt7070 > 63) {
				local189 = this.anInt7070 >> 6;
				this.anInt7070 &= 0x3F;
				for (local225 = 0; local225 < local189; local225++) {
					@Pc(558) int local558;
					@Pc(562) int local562;
					if (this.aClass160_1.aShort71 <= 0 && this.aClass160_1.aShort74 <= 0) {
						local216 = this.anInt7077;
						local207 = this.anInt7072;
						local198 = this.anInt7078;
					} else {
						local233 = (int) (Math.random() * (double) this.anInt7074) + this.anInt7073;
						local233 &= 0x3FFF;
						local334 = Class4_Sub11.anIntArray148[local233];
						local384 = Class4_Sub11.anIntArray147[local233];
						local405 = (int) ((double) this.anInt7075 * Math.random()) + this.anInt7076;
						local405 &= 0x1FFF;
						local558 = Class4_Sub11.anIntArray148[local405];
						local562 = Class4_Sub11.anIntArray147[local405];
						local207 = (local562 << 1) * -1;
						local198 = local558 * local384 >> 13;
						local216 = local334 * local558 >> 13;
					}
					@Pc(585) float local585 = (float) Math.random();
					@Pc(588) float local588 = (float) Math.random();
					if (local585 + local588 > 1.0F) {
						local585 = 1.0F - local585;
						local588 = 1.0F - local588;
					}
					@Pc(610) float local610 = 1.0F - local585 - local588;
					local405 = (int) (local610 * (float) this.aClass5_1.anInt67 + local585 * (float) this.aClass5_1.anInt57 + (float) this.aClass5_1.anInt62 * local588);
					local558 = (int) ((float) this.aClass5_1.anInt61 * local585 + local588 * (float) this.aClass5_1.anInt64 + local610 * (float) this.aClass5_1.anInt68);
					local562 = (int) ((float) this.aClass5_1.anInt60 * local585 + (float) this.aClass5_1.anInt56 * local588 + (float) this.aClass5_1.anInt66 * local610);
					@Pc(698) int local698 = (int) ((float) this.aClass5_2.anInt67 * local610 + (float) this.aClass5_2.anInt62 * local588 + (float) this.aClass5_2.anInt57 * local585);
					@Pc(720) int local720 = (int) ((float) this.aClass5_2.anInt61 * local585 + (float) this.aClass5_2.anInt64 * local588 + (float) this.aClass5_2.anInt68 * local610);
					@Pc(742) int local742 = (int) ((float) this.aClass5_2.anInt56 * local588 + local585 * (float) this.aClass5_2.anInt60 + local610 * (float) this.aClass5_2.anInt66);
					@Pc(747) int local747 = local405 - local698;
					@Pc(752) int local752 = local558 - local720;
					@Pc(757) int local757 = local562 - local742;
					@Pc(766) int local766 = (int) ((double) local698 + (double) local747 * Math.random());
					@Pc(775) int local775 = (int) ((double) local752 * Math.random() + (double) local720);
					@Pc(784) int local784 = (int) ((double) local742 + Math.random() * (double) local757);
					@Pc(802) int local802 = this.aClass160_1.anInt4506 + (int) ((double) (this.aClass160_1.anInt4540 - this.aClass160_1.anInt4506) * Math.random());
					@Pc(819) int local819 = this.aClass160_1.anInt4525 + (int) ((double) (this.aClass160_1.anInt4511 - this.aClass160_1.anInt4525) * Math.random());
					@Pc(836) int local836 = (int) ((double) (this.aClass160_1.anInt4520 - this.aClass160_1.anInt4508) * Math.random()) + this.aClass160_1.anInt4508;
					@Pc(900) int local900;
					if (this.aClass160_1.aBoolean342) {
						@Pc(842) double local842 = Math.random();
						local900 = (int) (Math.random() * (double) this.aClass160_1.anInt4497 + (double) this.aClass160_1.anInt4544) << 24 | (int) (local842 * (double) this.aClass160_1.anInt4515 + (double) this.aClass160_1.anInt4522) | (int) ((double) this.aClass160_1.anInt4501 + local842 * (double) this.aClass160_1.anInt4505) << 8 | (int) ((double) this.aClass160_1.anInt4517 * local842 + (double) this.aClass160_1.anInt4530) << 16;
					} else {
						local900 = (int) ((double) this.aClass160_1.anInt4544 + Math.random() * (double) this.aClass160_1.anInt4497) << 24 | (int) ((double) this.aClass160_1.anInt4515 * Math.random() + (double) this.aClass160_1.anInt4522) | (int) ((double) this.aClass160_1.anInt4501 + Math.random() * (double) this.aClass160_1.anInt4505) << 8 | (int) (Math.random() * (double) this.aClass160_1.anInt4517 + (double) this.aClass160_1.anInt4530) << 16;
					}
					@Pc(964) int local964 = this.aClass160_1.anInt4518;
					if (!arg3.method6850() && !this.aClass160_1.aBoolean335) {
						local964 = -1;
					}
					if (Static386.anInt6807 == Static37.anInt736) {
						new Class26_Sub1_Sub1_Sub1(this, local766, local775, local784, local198, local207, local216, local802, local819, local900, local836, local964, this.aClass160_1.aBoolean336, this.aClass160_1.aBoolean341);
					} else {
						@Pc(1004) Class26_Sub1_Sub1_Sub1 local1004 = Static533.aClass26_Sub1_Sub1_Sub1Array2[Static386.anInt6807];
						Static386.anInt6807 = Static386.anInt6807 + 1 & 0x3FF;
						local1004.method7591(this, local766, local775, local784, local198, local207, local216, local802, local819, local900, local836, local964, this.aClass160_1.aBoolean336, this.aClass160_1.aBoolean341);
					}
				}
			}
		}
		if (!this.aClass5_1.method79(this.aClass5_2)) {
			@Pc(1044) Class5 local1044 = this.aClass5_2;
			this.aClass5_2 = this.aClass5_1;
			this.aClass5_1 = local1044;
			this.aClass5_1.anInt62 = this.aClass181_2.anInt5024;
			this.aClass5_1.anInt67 = this.aClass181_2.anInt5027;
			this.aClass5_1.anInt61 = this.aClass181_2.anInt5021;
			this.aClass5_1.anInt66 = this.aClass181_2.anInt5029;
			this.aClass5_1.anInt68 = this.aClass181_2.anInt5022;
			this.aClass5_1.anInt64 = this.aClass181_2.anInt5017;
			this.aClass5_1.anInt57 = this.aClass181_2.anInt5025;
			this.aClass5_1.anInt56 = this.aClass181_2.anInt5032;
			this.aClass5_1.anInt60 = this.aClass181_2.anInt5019;
		}
		this.anInt7069 = 0;
		for (@Pc(1114) Class26_Sub1_Sub1_Sub1 local1114 = (Class26_Sub1_Sub1_Sub1) this.aClass8_6.method110(); local1114 != null; local1114 = (Class26_Sub1_Sub1_Sub1) this.aClass8_6.method113()) {
			local1114.method7590(arg0, arg1);
			this.anInt7069++;
		}
		Static259.anInt5063 += this.anInt7069;
	}
}
