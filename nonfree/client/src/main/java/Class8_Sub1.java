import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
	public int anInt229;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	private int anInt234 = 0;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "J")
	private final long aLong5;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!jq;")
	public final Class112 aClass112_1;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "Lclient!nd;")
	public final Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!no;")
	public Class145 aClass145_1;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Lclient!fi;")
	public final Class65 aClass65_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!tj;Lclient!jq;Lclient!nd;J)V")
	public Class8_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class8_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aLong5 = arg3;
		this.aClass112_1 = arg1;
		this.aClass8_Sub5_1 = arg2;
		this.aClass145_1 = Static94.method1575(this.aClass112_1.anInt3038);
		if (!arg0.method4753() && this.aClass145_1.anInt4382 != -1) {
			this.aClass145_1 = Static94.method1575(this.aClass145_1.anInt4382);
		}
		this.aClass65_1 = new Class65();
		this.anInt234 = (int) ((double) this.anInt234 + Math.random() * 64.0D);
		this.method163();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)V")
	public void method161(@OriginalArg(0) long arg0) {
		for (@Pc(9) Class8_Sub4_Sub1_Sub1 local9 = (Class8_Sub4_Sub1_Sub1) this.aClass65_1.method1462(); local9 != null; local9 = (Class8_Sub4_Sub1_Sub1) this.aClass65_1.method1461()) {
			local9.method2087(arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public void method163() {
		this.anInt243 = this.aClass112_1.anInt3031;
		this.anInt220 = this.aClass112_1.anInt3036;
		this.anInt237 = this.aClass112_1.anInt3030;
		this.anInt239 = this.aClass112_1.anInt3026;
		this.anInt224 = this.aClass112_1.anInt3037;
		this.anInt223 = this.aClass112_1.anInt3027;
		this.anInt219 = this.aClass112_1.anInt3034;
		this.anInt230 = this.aClass112_1.anInt3035;
		this.anInt238 = this.aClass112_1.anInt3029;
		if (this.anInt237 == this.anInt219 && this.anInt237 == this.anInt239 && this.anInt243 == this.anInt238 && this.anInt230 == this.anInt243 && this.anInt223 == this.anInt224 && this.anInt223 == this.anInt220) {
			this.aBoolean20 = true;
			return;
		}
		this.aBoolean20 = false;
		@Pc(121) int local121 = (this.anInt219 + this.anInt237 + this.anInt239) / 3;
		@Pc(133) int local133 = (this.anInt238 + this.anInt243 + this.anInt230) / 3;
		@Pc(146) int local146 = (this.anInt224 + this.anInt223 + this.anInt220) / 3;
		if (local121 == this.anInt233 && local133 == this.anInt244 && this.anInt221 == local146) {
			return;
		}
		this.anInt221 = local146;
		this.anInt244 = local133;
		this.anInt233 = local121;
		@Pc(183) int local183 = this.anInt237 - this.anInt219;
		@Pc(189) int local189 = this.anInt243 - this.anInt238;
		@Pc(196) int local196 = this.anInt223 - this.anInt224;
		@Pc(202) int local202 = this.anInt239 - this.anInt219;
		@Pc(208) int local208 = this.anInt230 - this.anInt238;
		@Pc(214) int local214 = this.anInt220 - this.anInt224;
		this.anInt226 = local183 * local208 - local202 * local189;
		this.anInt242 = local189 * local214 - local208 * local196;
		for (this.anInt236 = local202 * local196 - local183 * local214; this.anInt242 > 32767 || this.anInt236 > 32767 || this.anInt226 > 32767 || this.anInt242 < -32767 || this.anInt236 < -32767 || this.anInt226 < -32767; this.anInt236 >>= 0x1) {
			this.anInt226 >>= 0x1;
			this.anInt242 >>= 0x1;
		}
		@Pc(311) int local311 = (int) Math.sqrt((double) (this.anInt226 * this.anInt226 + this.anInt242 * this.anInt242 + this.anInt236 * this.anInt236));
		if (local311 <= 0) {
			local311 = 1;
		}
		this.anInt236 = this.anInt236 * 32767 / local311;
		this.anInt226 = this.anInt226 * 32767 / local311;
		this.anInt242 = this.anInt242 * 32767 / local311;
		if (this.aClass145_1.aShort67 <= 0 && this.aClass145_1.aShort64 <= 0) {
			return;
		}
		@Pc(358) int local358 = (int) (Math.atan2((double) this.anInt226, (double) this.anInt242) * 2607.5945876176133D);
		@Pc(379) int local379 = (int) (Math.atan2((double) this.anInt236, Math.sqrt((double) (this.anInt226 * this.anInt226 + this.anInt242 * this.anInt242))) * 2607.5945876176133D);
		this.anInt235 = this.aClass145_1.aShort67 - this.aClass145_1.aShort66;
		this.anInt225 = this.aClass145_1.aShort64 - this.aClass145_1.aShort65;
		this.anInt232 = local358 + this.aClass145_1.aShort66 - (this.anInt235 >> 1);
		this.anInt218 = local379 + this.aClass145_1.aShort65 - (this.anInt225 >> 1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZJILclient!tj;I)V")
	public void method164(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3) {
		@Pc(38) int local38;
		if (this.aBoolean18) {
			arg0 = false;
		} else if (this.aClass145_1.lb > Static247.anInt4917) {
			arg0 = false;
		} else if (Static210.anIntArray348[Static247.anInt4917] < Static300.anInt5965) {
			arg0 = false;
		} else if (this.aBoolean20) {
			arg0 = false;
		} else if (this.aClass145_1.anInt4378 != -1) {
			local38 = (int) (arg1 - this.aLong5);
			if (this.aClass145_1.aBoolean249 || this.aClass145_1.anInt4378 >= local38) {
				local38 %= this.aClass145_1.anInt4378;
			} else {
				arg0 = false;
			}
			if (!this.aClass145_1.aBoolean245 && this.aClass145_1.anInt4365 > local38) {
				arg0 = false;
			}
			if (this.aClass145_1.aBoolean245 && local38 >= this.aClass145_1.anInt4365) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt234 += (int) ((Math.random() * (double) (this.aClass145_1.anInt4384 - this.aClass145_1.anInt4364) + (double) this.aClass145_1.anInt4364) * (double) arg2);
			if (this.anInt234 > 63) {
				local38 = this.anInt234 >> 6;
				this.anInt234 &= 0x3F;
				for (@Pc(143) int local143 = 0; local143 < local38; local143++) {
					@Pc(203) int local203;
					@Pc(217) int local217;
					@Pc(213) int local213;
					@Pc(166) int local166;
					@Pc(174) int local174;
					@Pc(178) int local178;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(207) int local207;
					if (this.aClass145_1.aShort67 <= 0 && this.aClass145_1.aShort64 <= 0) {
						local217 = this.anInt236;
						local203 = this.anInt242;
						local213 = this.anInt226;
					} else {
						local166 = (int) (Math.random() * (double) this.anInt235) + this.anInt232;
						@Pc(170) int local170 = local166 & 0x3FFF;
						local174 = Class19.anIntArray20[local170];
						local178 = Class19.anIntArray21[local170];
						local189 = this.anInt218 + (int) (Math.random() * (double) this.anInt225);
						@Pc(193) int local193 = local189 & 0x1FFF;
						local197 = Class19.anIntArray20[local193];
						local203 = local178 * local197 >> 15;
						local207 = Class19.anIntArray21[local193];
						local213 = local174 * local197 >> 15;
						local217 = local207 * -1;
					}
					local166 = (int) (Math.random() * 65535.0D);
					local174 = (int) (Math.random() * 65535.0D);
					if (local166 + local174 > 65535) {
						local174 = 65535 - local174;
						local166 = 65535 - local166;
					}
					local178 = 65535 - local174 - local166;
					local189 = local166 * this.anInt219 + this.anInt237 * local174 + this.anInt239 * local178 >> 16;
					local197 = local178 * this.anInt230 + local174 * this.anInt243 + this.anInt238 * local166 >> 16;
					local207 = this.anInt224 * local166 + this.anInt223 * local174 + local178 * this.anInt220 >> 16;
					@Pc(331) int local331 = this.aClass145_1.anInt4389 + (int) (Math.random() * (double) (this.aClass145_1.anInt4358 - this.aClass145_1.anInt4389));
					@Pc(348) int local348 = this.aClass145_1.anInt4372 + (int) ((double) (this.aClass145_1.anInt4400 - this.aClass145_1.anInt4372) * Math.random());
					@Pc(366) int local366 = this.aClass145_1.anInt4361 + (int) (Math.random() * (double) (this.aClass145_1.anInt4363 - this.aClass145_1.anInt4361));
					@Pc(428) int local428;
					if (this.aClass145_1.aBoolean247) {
						@Pc(432) double local432 = Math.random();
						local428 = (int) ((double) this.aClass145_1.anInt4371 + local432 * (double) this.aClass145_1.anInt4357) << 24 | (int) ((double) this.aClass145_1.anInt4379 + local432 * (double) this.aClass145_1.anInt4353) | (int) ((double) this.aClass145_1.anInt4388 + local432 * (double) this.aClass145_1.anInt4360) << 8 | (int) ((double) this.aClass145_1.anInt4351 + (double) this.aClass145_1.anInt4355 * local432) << 16;
					} else {
						local428 = (int) ((double) this.aClass145_1.anInt4379 + Math.random() * (double) this.aClass145_1.anInt4353) | (int) ((double) this.aClass145_1.anInt4351 + (double) this.aClass145_1.anInt4355 * Math.random()) << 16 | (int) ((double) this.aClass145_1.anInt4388 + Math.random() * (double) this.aClass145_1.anInt4360) << 8 | (int) ((double) this.aClass145_1.anInt4371 + (double) this.aClass145_1.anInt4357 * Math.random()) << 24;
					}
					@Pc(494) int local494 = this.aClass145_1.anInt4359;
					if (!arg3.method4753() && !this.aClass145_1.aBoolean250) {
						local494 = -1;
					}
					if (Static197.anInt4053 == Static329.anInt6343) {
						new Class8_Sub4_Sub1_Sub1(this, local189, local197, local207, local203, local217, local213, local331, local348, local428, local366, local494, this.aClass145_1.aBoolean246);
					} else {
						@Pc(514) Class8_Sub4_Sub1_Sub1 local514 = Static333.aClass8_Sub4_Sub1_Sub1Array2[Static329.anInt6343];
						Static329.anInt6343 = Static329.anInt6343 + 1 & 0x3FF;
						local514.method2089(this, local189, local197, local207, local203, local217, local213, local331, local348, local428, local366, local494, this.aClass145_1.aBoolean246);
					}
				}
			}
		}
		this.anInt229 = 0;
		for (@Pc(571) Class8_Sub4_Sub1_Sub1 local571 = (Class8_Sub4_Sub1_Sub1) this.aClass65_1.method1462(); local571 != null; local571 = (Class8_Sub4_Sub1_Sub1) this.aClass65_1.method1461()) {
			local571.method2086(arg1, arg2);
			this.anInt229++;
		}
		Static137.anInt2561 += this.anInt229;
	}
}
