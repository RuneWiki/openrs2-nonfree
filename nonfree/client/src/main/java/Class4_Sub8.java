import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private int anInt6984;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	public int anInt6985;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	private int anInt6987;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	private int anInt6988;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	private int anInt6989;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	private int anInt6990;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
	private int anInt6992;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
	public int anInt6993;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	private int anInt6995;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	private int anInt6996;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	private int anInt6997;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
	public int anInt6998;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
	public int anInt6999;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
	private int anInt7000;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
	private int anInt7001;

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
	private int anInt7003;

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
	private int anInt7005;

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
	private int anInt7007;

	@OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
	private int anInt7008;

	@OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
	private int anInt7012;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
	private int anInt6991 = 0;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "Z")
	public boolean aBoolean489 = false;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "J")
	private final long aLong211;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "Lclient!uj;")
	public final Class244 aClass244_2;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!mq;")
	public final Class4_Sub7 aClass4_Sub7_6;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "Lclient!gf;")
	public Class86 aClass86_1;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "Lclient!ks;")
	public final Class141 aClass141_9;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ya;Lclient!uj;Lclient!mq;J)V")
	public Class4_Sub8(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class4_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aLong211 = arg3;
		this.aClass244_2 = arg1;
		this.aClass4_Sub7_6 = arg2;
		this.aClass86_1 = this.aClass244_2.method5473();
		if (!arg0.method4556() && this.aClass86_1.anInt2554 != -1) {
			this.aClass86_1 = Static188.method2960(this.aClass86_1.anInt2554);
		}
		this.aClass141_9 = new Class141();
		this.anInt6991 = (int) ((double) this.anInt6991 + Math.random() * 64.0D);
		this.method5738();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
	public void method5738() {
		this.anInt6989 = this.aClass244_2.anInt6582;
		this.anInt7008 = this.aClass244_2.anInt6580;
		this.anInt6990 = this.aClass244_2.anInt6585;
		this.anInt6987 = this.aClass244_2.anInt6571;
		this.anInt7000 = this.aClass244_2.anInt6570;
		this.anInt7007 = this.aClass244_2.anInt6576;
		this.anInt6988 = this.aClass244_2.anInt6568;
		this.anInt7005 = this.aClass244_2.anInt6584;
		this.anInt6984 = this.aClass244_2.anInt6574;
		if (this.anInt7000 == this.anInt6987 && this.anInt7000 == this.anInt7005 && this.anInt6988 == this.anInt6989 && this.anInt6990 == this.anInt6989 && this.anInt7008 == this.anInt7007 && this.anInt7008 == this.anInt6984) {
			this.aBoolean488 = true;
			return;
		}
		this.aBoolean488 = false;
		@Pc(101) int local101 = (this.anInt7000 + this.anInt6987 + this.anInt7005) / 3;
		@Pc(112) int local112 = (this.anInt6990 + this.anInt6988 + this.anInt6989) / 3;
		@Pc(134) int local134 = (this.anInt7008 + this.anInt7007 + this.anInt6984) / 3;
		if (this.anInt6999 == local101 && local112 == this.anInt6998 && local134 == this.anInt6993) {
			return;
		}
		this.anInt6999 = local101;
		this.anInt6998 = local112;
		this.anInt6993 = local134;
		@Pc(170) int local170 = this.anInt7000 - this.anInt6987;
		@Pc(177) int local177 = this.anInt6989 - this.anInt6988;
		@Pc(184) int local184 = this.anInt7008 - this.anInt7007;
		@Pc(191) int local191 = this.anInt7005 - this.anInt6987;
		@Pc(197) int local197 = this.anInt6990 - this.anInt6988;
		@Pc(204) int local204 = this.anInt6984 - this.anInt7007;
		this.anInt7012 = local170 * local197 - local177 * local191;
		this.anInt6997 = local177 * local204 - local197 * local184;
		for (this.anInt7001 = local184 * local191 - local170 * local204; this.anInt6997 > 32767 || this.anInt7001 > 32767 || this.anInt7012 > 32767 || this.anInt6997 < -32767 || this.anInt7001 < -32767 || this.anInt7012 < -32767; this.anInt7001 >>= 0x1) {
			this.anInt6997 >>= 0x1;
			this.anInt7012 >>= 0x1;
		}
		@Pc(308) int local308 = (int) Math.sqrt((double) (this.anInt7012 * this.anInt7012 + this.anInt7001 * this.anInt7001 + this.anInt6997 * this.anInt6997));
		if (local308 <= 0) {
			local308 = 1;
		}
		this.anInt7001 = this.anInt7001 * 32767 / local308;
		this.anInt6997 = this.anInt6997 * 32767 / local308;
		this.anInt7012 = this.anInt7012 * 32767 / local308;
		if (this.aClass86_1.aShort43 <= 0 && this.aClass86_1.aShort42 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt7012, (double) this.anInt6997) * 2607.5945876176133D);
		@Pc(376) int local376 = (int) (Math.atan2((double) this.anInt7001, Math.sqrt((double) (this.anInt7012 * this.anInt7012 + this.anInt6997 * this.anInt6997))) * 2607.5945876176133D);
		this.anInt7003 = this.aClass86_1.aShort43 - this.aClass86_1.aShort44;
		this.anInt6996 = this.aClass86_1.aShort42 - this.aClass86_1.aShort45;
		this.anInt6995 = this.aClass86_1.aShort44 + local355 - (this.anInt7003 >> 1);
		this.anInt6992 = local376 + this.aClass86_1.aShort45 - (this.anInt6996 >> 1);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JB)V")
	public void method5743(@OriginalArg(0) long arg0) {
		for (@Pc(9) Class4_Sub2_Sub1_Sub1 local9 = (Class4_Sub2_Sub1_Sub1) this.aClass141_9.method3357(); local9 != null; local9 = (Class4_Sub2_Sub1_Sub1) this.aClass141_9.method3360()) {
			local9.method5714(arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(JIZLclient!ya;I)V")
	public void method5745(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class39 arg3) {
		@Pc(46) int local46;
		if (this.aBoolean489) {
			arg2 = false;
		} else if (this.aClass86_1.anInt2557 > Static68.anInt1555) {
			arg2 = false;
		} else if (Static64.anIntArray101[Static68.anInt1555] < Static206.anInt3915) {
			arg2 = false;
		} else if (this.aBoolean488) {
			arg2 = false;
		} else if (this.aClass86_1.anInt2515 != -1) {
			local46 = (int) (arg0 - this.aLong211);
			if (this.aClass86_1.aBoolean156 || this.aClass86_1.anInt2515 >= local46) {
				local46 %= this.aClass86_1.anInt2515;
			} else {
				arg2 = false;
			}
			if (!this.aClass86_1.aBoolean153 && local46 < this.aClass86_1.anInt2514) {
				arg2 = false;
			}
			if (this.aClass86_1.aBoolean153 && this.aClass86_1.anInt2514 <= local46) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt6991 += (int) (((double) this.aClass86_1.anInt2549 + Math.random() * (double) (this.aClass86_1.lb - this.aClass86_1.anInt2549)) * (double) arg1);
			if (this.anInt6991 > 63) {
				local46 = this.anInt6991 >> 6;
				this.anInt6991 &= 0x3F;
				for (@Pc(152) int local152 = 0; local152 < local46; local152++) {
					@Pc(217) int local217;
					@Pc(223) int local223;
					@Pc(229) int local229;
					@Pc(175) int local175;
					@Pc(183) int local183;
					@Pc(187) int local187;
					@Pc(197) int local197;
					@Pc(205) int local205;
					@Pc(209) int local209;
					if (this.aClass86_1.aShort43 <= 0 && this.aClass86_1.aShort42 <= 0) {
						local223 = this.anInt7001;
						local229 = this.anInt7012;
						local217 = this.anInt6997;
					} else {
						local175 = this.anInt6995 + (int) (Math.random() * (double) this.anInt7003);
						@Pc(179) int local179 = local175 & 0x3FFF;
						local183 = Class183.anIntArray433[local179];
						local187 = Class183.anIntArray434[local179];
						local197 = (int) ((double) this.anInt6996 * Math.random()) + this.anInt6992;
						@Pc(201) int local201 = local197 & 0x1FFF;
						local205 = Class183.anIntArray433[local201];
						local209 = Class183.anIntArray434[local201];
						local217 = local205 * local187 >> 15;
						local223 = (local209 << 0) * -1;
						local229 = local183 * local205 >> 15;
					}
					local175 = (int) (Math.random() * 65535.0D);
					local183 = (int) (Math.random() * 65535.0D);
					if (local175 + local183 > 65535) {
						local175 = 65535 - local175;
						local183 = 65535 - local183;
					}
					local187 = 65535 - local183 - local175;
					local197 = this.anInt6987 * local175 + this.anInt7000 * local183 + local187 * this.anInt7005 >> 16;
					local205 = this.anInt6988 * local175 + local183 * this.anInt6989 + local187 * this.anInt6990 >> 16;
					local209 = this.anInt7007 * local175 + local183 * this.anInt7008 + this.anInt6984 * local187 >> 16;
					@Pc(345) int local345 = this.aClass86_1.anInt2529 + (int) (Math.random() * (double) (this.aClass86_1.anInt2518 - this.aClass86_1.anInt2529));
					@Pc(363) int local363 = this.aClass86_1.anInt2516 + (int) (Math.random() * (double) (this.aClass86_1.anInt2553 - this.aClass86_1.anInt2516));
					@Pc(380) int local380 = (int) ((double) (this.aClass86_1.anInt2535 - this.aClass86_1.anInt2512) * Math.random()) + this.aClass86_1.anInt2512;
					@Pc(444) int local444;
					if (this.aClass86_1.aBoolean152) {
						@Pc(386) double local386 = Math.random();
						local444 = (int) ((double) this.aClass86_1.anInt2519 * Math.random() + (double) this.aClass86_1.anInt2538) << 24 | (int) ((double) this.aClass86_1.anInt2527 + (double) this.aClass86_1.anInt2509 * local386) | (int) ((double) this.aClass86_1.anInt2550 * local386 + (double) this.aClass86_1.anInt2507) << 16 | (int) ((double) this.aClass86_1.anInt2524 * local386 + (double) this.aClass86_1.anInt2548) << 8;
					} else {
						local444 = (int) (Math.random() * (double) this.aClass86_1.anInt2519 + (double) this.aClass86_1.anInt2538) << 24 | (int) ((double) this.aClass86_1.anInt2509 * Math.random() + (double) this.aClass86_1.anInt2527) | (int) ((double) this.aClass86_1.anInt2507 + (double) this.aClass86_1.anInt2550 * Math.random()) << 16 | (int) ((double) this.aClass86_1.anInt2548 + Math.random() * (double) this.aClass86_1.anInt2524) << 8;
					}
					@Pc(508) int local508 = this.aClass86_1.anInt2552;
					if (!arg3.method4556() && !this.aClass86_1.aBoolean154) {
						local508 = -1;
					}
					if (Static399.anInt7267 == Static16.anInt471) {
						new Class4_Sub2_Sub1_Sub1(this, local197, local205, local209, local217, local223, local229, local345, local363, local444, local380, local508, this.aClass86_1.aBoolean155, this.aClass86_1.aBoolean151);
					} else {
						@Pc(548) Class4_Sub2_Sub1_Sub1 local548 = Static432.aClass4_Sub2_Sub1_Sub1Array2[Static399.anInt7267];
						Static399.anInt7267 = Static399.anInt7267 + 1 & 0x3FF;
						local548.method5715(this, local197, local205, local209, local217, local223, local229, local345, local363, local444, local380, local508, this.aClass86_1.aBoolean155, this.aClass86_1.aBoolean151);
					}
				}
			}
		}
		this.anInt6985 = 0;
		for (@Pc(591) Class4_Sub2_Sub1_Sub1 local591 = (Class4_Sub2_Sub1_Sub1) this.aClass141_9.method3357(); local591 != null; local591 = (Class4_Sub2_Sub1_Sub1) this.aClass141_9.method3360()) {
			local591.method5713(arg0, arg1);
			this.anInt6985++;
		}
		Static397.anInt6373 += this.anInt6985;
	}
}
