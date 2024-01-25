import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class15_Sub8 extends Class15 {

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	private int anInt6209;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	public int anInt6210;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	private int anInt6211;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	private int anInt6212;

	@OriginalMember(owner = "client!va", name = "u", descriptor = "I")
	private int anInt6214;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	private int anInt6215;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	private int anInt6216;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	private int anInt6219;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "I")
	private int anInt6221;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	private int anInt6222;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private int anInt6223;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	public int anInt6226;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	private int anInt6227;

	@OriginalMember(owner = "client!va", name = "M", descriptor = "I")
	private int anInt6228;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	private int anInt6230;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "I")
	public int anInt6233;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt6235;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	private int anInt6218 = 0;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "J")
	private final long aLong197;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!pd;")
	public final Class154 aClass154_2;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!jl;")
	public final Class15_Sub5 aClass15_Sub5_7;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "Lclient!sq;")
	public Class193 aClass193_1;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!re;")
	public final Class175 aClass175_7;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!aa;Lclient!pd;Lclient!jl;J)V")
	public Class15_Sub8(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class154 arg1, @OriginalArg(2) Class15_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aLong197 = arg3;
		this.aClass154_2 = arg1;
		this.aClass15_Sub5_7 = arg2;
		this.aClass193_1 = Static251.method5685(this.aClass154_2.anInt4572);
		if (!arg0.method3270() && this.aClass193_1.anInt5589 != -1) {
			this.aClass193_1 = Static251.method5685(this.aClass193_1.anInt5589);
		}
		this.aClass175_7 = new Class175();
		this.anInt6218 = (int) ((double) this.anInt6218 + Math.random() * 64.0D);
		this.method5444();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public void method5444() {
		this.anInt6211 = this.aClass154_2.anInt4584;
		this.anInt6227 = this.aClass154_2.anInt4583;
		this.anInt6236 = this.aClass154_2.anInt4581;
		this.anInt6225 = this.aClass154_2.anInt4576;
		this.anInt6216 = this.aClass154_2.anInt4582;
		this.anInt6222 = this.aClass154_2.anInt4575;
		this.anInt6228 = this.aClass154_2.anInt4577;
		this.anInt6215 = this.aClass154_2.anInt4579;
		this.anInt6214 = this.aClass154_2.anInt4585;
		if (this.anInt6225 == this.anInt6216 && this.anInt6225 == this.anInt6236 && this.anInt6222 == this.anInt6228 && this.anInt6222 == this.anInt6215 && this.anInt6211 == this.anInt6227 && this.anInt6227 == this.anInt6214) {
			this.aBoolean549 = true;
			return;
		}
		this.aBoolean549 = false;
		@Pc(107) int local107 = (this.anInt6236 + this.anInt6216 + this.anInt6225) / 3;
		@Pc(127) int local127 = (this.anInt6222 + this.anInt6228 + this.anInt6215) / 3;
		@Pc(139) int local139 = (this.anInt6227 + this.anInt6211 + this.anInt6214) / 3;
		if (this.anInt6226 == local107 && this.anInt6235 == local127 && this.anInt6233 == local139) {
			return;
		}
		this.anInt6233 = local139;
		this.anInt6226 = local107;
		this.anInt6235 = local127;
		@Pc(170) int local170 = this.anInt6225 - this.anInt6216;
		@Pc(177) int local177 = this.anInt6222 - this.anInt6228;
		@Pc(183) int local183 = this.anInt6227 - this.anInt6211;
		@Pc(190) int local190 = this.anInt6236 - this.anInt6216;
		@Pc(197) int local197 = this.anInt6215 - this.anInt6228;
		@Pc(203) int local203 = this.anInt6214 - this.anInt6211;
		this.anInt6234 = local177 * local203 - local197 * local183;
		this.anInt6219 = local197 * local170 - local190 * local177;
		for (this.anInt6223 = local190 * local183 - local170 * local203; this.anInt6234 > 32767 || this.anInt6223 > 32767 || this.anInt6219 > 32767 || this.anInt6234 < -32767 || this.anInt6223 < -32767 || this.anInt6219 < -32767; this.anInt6223 >>= 0x1) {
			this.anInt6234 >>= 0x1;
			this.anInt6219 >>= 0x1;
		}
		@Pc(304) int local304 = (int) Math.sqrt((double) (this.anInt6234 * this.anInt6234 + this.anInt6223 * this.anInt6223 + this.anInt6219 * this.anInt6219));
		if (local304 <= 0) {
			local304 = 1;
		}
		this.anInt6234 = this.anInt6234 * 32767 / local304;
		this.anInt6223 = this.anInt6223 * 32767 / local304;
		this.anInt6219 = this.anInt6219 * 32767 / local304;
		if (this.aClass193_1.aShort83 <= 0 && this.aClass193_1.aShort84 <= 0) {
			return;
		}
		@Pc(354) int local354 = (int) (Math.atan2((double) this.anInt6219, (double) this.anInt6234) * 2607.5945876176133D);
		@Pc(375) int local375 = (int) (Math.atan2((double) this.anInt6223, Math.sqrt((double) (this.anInt6219 * this.anInt6219 + this.anInt6234 * this.anInt6234))) * 2607.5945876176133D);
		this.anInt6209 = this.aClass193_1.aShort83 - this.aClass193_1.aShort86;
		this.anInt6212 = this.aClass193_1.aShort84 - this.aClass193_1.aShort85;
		this.anInt6230 = this.aClass193_1.aShort86 + local354 - (this.anInt6209 >> 1);
		this.anInt6221 = local375 + this.aClass193_1.aShort85 - (this.anInt6212 >> 1);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!aa;JIIZ)V")
	public void method5445(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(42) int local42;
		if (this.aBoolean548) {
			arg3 = false;
		} else if (this.aClass193_1.anInt5587 > Static199.anInt4059) {
			arg3 = false;
		} else if (Static348.anIntArray439[Static199.anInt4059] < Static337.anInt6399) {
			arg3 = false;
		} else if (this.aBoolean549) {
			arg3 = false;
		} else if (this.aClass193_1.anInt5621 != -1) {
			local42 = (int) (arg1 - this.aLong197);
			if (this.aClass193_1.lb || this.aClass193_1.anInt5621 >= local42) {
				local42 %= this.aClass193_1.anInt5621;
			} else {
				arg3 = false;
			}
			if (!this.aClass193_1.aBoolean488 && this.aClass193_1.anInt5597 > local42) {
				arg3 = false;
			}
			if (this.aClass193_1.aBoolean488 && this.aClass193_1.anInt5597 <= local42) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6218 += (int) (((double) this.aClass193_1.anInt5599 + (double) (this.aClass193_1.anInt5619 - this.aClass193_1.anInt5599) * Math.random()) * (double) arg2);
			if (this.anInt6218 > 63) {
				local42 = this.anInt6218 >> 6;
				this.anInt6218 &= 0x3F;
				for (@Pc(157) int local157 = 0; local157 < local42; local157++) {
					@Pc(176) int local176;
					@Pc(173) int local173;
					@Pc(179) int local179;
					@Pc(192) int local192;
					@Pc(200) int local200;
					@Pc(204) int local204;
					@Pc(214) int local214;
					@Pc(222) int local222;
					@Pc(226) int local226;
					if (this.aClass193_1.aShort83 <= 0 && this.aClass193_1.aShort84 <= 0) {
						local173 = this.anInt6223;
						local176 = this.anInt6234;
						local179 = this.anInt6219;
					} else {
						local192 = this.anInt6230 + (int) ((double) this.anInt6209 * Math.random());
						@Pc(196) int local196 = local192 & 0x3FFF;
						local200 = Class1_Sub1_Sub16.anIntArray587[local196];
						local204 = Class1_Sub1_Sub16.anIntArray586[local196];
						local214 = (int) (Math.random() * (double) this.anInt6212) + this.anInt6221;
						@Pc(218) int local218 = local214 & 0x1FFF;
						local222 = Class1_Sub1_Sub16.anIntArray587[local218];
						local226 = Class1_Sub1_Sub16.anIntArray586[local218];
						local176 = local222 * local204 >> 15;
						local173 = local226 * -1;
						local179 = local222 * local200 >> 15;
					}
					local192 = (int) (Math.random() * 65535.0D);
					local200 = (int) (Math.random() * 65535.0D);
					if (local200 + local192 > 65535) {
						local192 = 65535 - local192;
						local200 = 65535 - local200;
					}
					local204 = 65535 - local192 - local200;
					local214 = this.anInt6236 * local204 + this.anInt6216 * local192 + local200 * this.anInt6225 >> 16;
					local222 = this.anInt6215 * local204 + local192 * this.anInt6228 + local200 * this.anInt6222 >> 16;
					local226 = local204 * this.anInt6214 + local192 * this.anInt6211 + this.anInt6227 * local200 >> 16;
					@Pc(343) int local343 = this.aClass193_1.anInt5607 + (int) ((double) (this.aClass193_1.anInt5604 - this.aClass193_1.anInt5607) * Math.random());
					@Pc(360) int local360 = this.aClass193_1.anInt5590 + (int) ((double) (this.aClass193_1.anInt5591 - this.aClass193_1.anInt5590) * Math.random());
					@Pc(377) int local377 = this.aClass193_1.anInt5603 + (int) (Math.random() * (double) (this.aClass193_1.anInt5622 - this.aClass193_1.anInt5603));
					@Pc(441) int local441;
					if (this.aClass193_1.aBoolean489) {
						@Pc(383) double local383 = Math.random();
						local441 = (int) (local383 * (double) this.aClass193_1.anInt5588 + (double) this.aClass193_1.anInt5578) << 24 | (int) ((double) this.aClass193_1.anInt5600 + local383 * (double) this.aClass193_1.anInt5602) << 16 | (int) ((double) this.aClass193_1.anInt5605 + (double) this.aClass193_1.anInt5623 * local383) << 8 | (int) (local383 * (double) this.aClass193_1.anInt5601 + (double) this.aClass193_1.anInt5593);
					} else {
						local441 = (int) ((double) this.aClass193_1.anInt5623 * Math.random() + (double) this.aClass193_1.anInt5605) << 8 | (int) ((double) this.aClass193_1.anInt5602 * Math.random() + (double) this.aClass193_1.anInt5600) << 16 | (int) (Math.random() * (double) this.aClass193_1.anInt5601 + (double) this.aClass193_1.anInt5593) | (int) (Math.random() * (double) this.aClass193_1.anInt5588 + (double) this.aClass193_1.anInt5578) << 24;
					}
					@Pc(505) int local505 = this.aClass193_1.anInt5596;
					if (!arg0.method3270() && !this.aClass193_1.aBoolean491) {
						local505 = -1;
					}
					if (Static290.anInt5616 == Static54.anInt3487) {
						new Class15_Sub4_Sub1_Sub1(this, local214, local222, local226, local176, local173, local179, local343, local360, local441, local377, local505, this.aClass193_1.aBoolean490);
					} else {
						@Pc(546) Class15_Sub4_Sub1_Sub1 local546 = Static331.aClass15_Sub4_Sub1_Sub1Array2[Static54.anInt3487];
						Static54.anInt3487 = Static54.anInt3487 + 1 & 0x3FF;
						local546.method3720(this, local214, local222, local226, local176, local173, local179, local343, local360, local441, local377, local505, this.aClass193_1.aBoolean490);
					}
				}
			}
		}
		this.anInt6210 = 0;
		for (@Pc(586) Class15_Sub4_Sub1_Sub1 local586 = (Class15_Sub4_Sub1_Sub1) this.aClass175_7.method4669(); local586 != null; local586 = (Class15_Sub4_Sub1_Sub1) this.aClass175_7.method4673()) {
			local586.method3723(arg1, arg2);
			this.anInt6210++;
		}
		Static291.anInt5656 += this.anInt6210;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)V")
	public void method5449(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class15_Sub4_Sub1_Sub1 local7 = (Class15_Sub4_Sub1_Sub1) this.aClass175_7.method4669(); local7 != null; local7 = (Class15_Sub4_Sub1_Sub1) this.aClass175_7.method4673()) {
			local7.method3722(arg0);
		}
	}
}
