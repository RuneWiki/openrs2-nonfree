import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	private int anInt5280;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt5282;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public int anInt5283;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public int anInt5285;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	private int anInt5287;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	private int anInt5289;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	private int anInt5290;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	private int anInt5291;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	private int anInt5292;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	private int anInt5293;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
	private int anInt5295;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
	private int anInt5297;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	private int anInt5298;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public int anInt5299;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	private int anInt5300;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	private int anInt5303;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
	private int anInt5305;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
	private int anInt5306;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	private int anInt5307;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
	private int anInt5310;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
	private int anInt5296 = 0;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "J")
	private final long aLong173;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!ds;")
	public final Class57 aClass57_2;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!ha;")
	public final Class36_Sub3 aClass36_Sub3_6;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "Lclient!al;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!td;")
	public final Class191 aClass191_6;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!pe;Lclient!ds;Lclient!ha;J)V")
	public Class36_Sub7(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class36_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aLong173 = arg3;
		this.aClass57_2 = arg1;
		this.aClass36_Sub3_6 = arg2;
		this.aClass12_1 = Static82.method1757(this.aClass57_2.anInt1634);
		if (!arg0.method5437() && this.aClass12_1.anInt224 != -1) {
			this.aClass12_1 = Static82.method1757(this.aClass12_1.anInt224);
		}
		this.aClass191_6 = new Class191();
		this.anInt5296 = (int) ((double) this.anInt5296 + Math.random() * 64.0D);
		this.method4490();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZJLclient!pe;)V")
	public void method4482(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class89 arg3) {
		@Pc(49) int local49;
		if (this.aBoolean395) {
			arg1 = false;
		} else if (this.aClass12_1.anInt215 > Static151.anInt3238) {
			arg1 = false;
		} else if (Static176.anIntArray493[Static151.anInt3238] < Static269.anInt5314) {
			arg1 = false;
		} else if (this.aBoolean394) {
			arg1 = false;
		} else if (this.aClass12_1.anInt246 != -1) {
			local49 = (int) (arg2 - this.aLong173);
			if (this.aClass12_1.aBoolean6 || local49 <= this.aClass12_1.anInt246) {
				local49 %= this.aClass12_1.anInt246;
			} else {
				arg1 = false;
			}
			if (!this.aClass12_1.aBoolean8 && local49 < this.aClass12_1.anInt221) {
				arg1 = false;
			}
			if (this.aClass12_1.aBoolean8 && local49 >= this.aClass12_1.anInt221) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5296 += (int) ((double) arg0 * ((double) this.aClass12_1.anInt223 + Math.random() * (double) (this.aClass12_1.anInt230 - this.aClass12_1.anInt223)));
			if (this.anInt5296 > 63) {
				local49 = this.anInt5296 >> 6;
				this.anInt5296 &= 0x3F;
				for (@Pc(147) int local147 = 0; local147 < local49; local147++) {
					@Pc(211) int local211;
					@Pc(215) int local215;
					@Pc(221) int local221;
					@Pc(171) int local171;
					@Pc(179) int local179;
					@Pc(183) int local183;
					@Pc(193) int local193;
					@Pc(201) int local201;
					@Pc(205) int local205;
					if (this.aClass12_1.aShort4 <= 0 && this.aClass12_1.aShort3 <= 0) {
						local215 = this.anInt5295;
						local221 = this.anInt5293;
						local211 = this.anInt5300;
					} else {
						local171 = this.anInt5307 + (int) ((double) this.anInt5306 * Math.random());
						@Pc(175) int local175 = local171 & 0x3FFF;
						local179 = Class147.anIntArray604[local175];
						local183 = Class147.anIntArray603[local175];
						local193 = this.anInt5289 + (int) ((double) this.anInt5290 * Math.random());
						@Pc(197) int local197 = local193 & 0x1FFF;
						local201 = Class147.anIntArray604[local197];
						local205 = Class147.anIntArray603[local197];
						local211 = local183 * local201 >> 15;
						local215 = local205 * -1;
						local221 = local179 * local201 >> 15;
					}
					local171 = (int) (Math.random() * 65535.0D);
					local179 = (int) (Math.random() * 65535.0D);
					if (local179 + local171 > 65535) {
						local179 = 65535 - local179;
						local171 = 65535 - local171;
					}
					local183 = 65535 - local179 - local171;
					local193 = this.anInt5287 * local171 + local179 * this.anInt5305 + local183 * this.anInt5297 >> 16;
					local201 = this.anInt5292 * local183 + this.anInt5280 * local171 + local179 * this.anInt5310 >> 16;
					local205 = local183 * this.anInt5291 + this.anInt5303 * local171 + this.anInt5298 * local179 >> 16;
					@Pc(333) int local333 = (int) (Math.random() * (double) (this.aClass12_1.anInt217 - this.aClass12_1.anInt207)) + this.aClass12_1.anInt207;
					@Pc(350) int local350 = (int) ((double) (this.aClass12_1.anInt244 - this.aClass12_1.anInt225) * Math.random()) + this.aClass12_1.anInt225;
					@Pc(366) int local366 = (int) ((double) (this.aClass12_1.anInt245 - this.aClass12_1.anInt243) * Math.random()) + this.aClass12_1.anInt243;
					@Pc(430) int local430;
					if (this.aClass12_1.aBoolean9) {
						@Pc(372) double local372 = Math.random();
						local430 = (int) ((double) this.aClass12_1.anInt197 * local372 + (double) this.aClass12_1.anInt206) << 24 | (int) ((double) this.aClass12_1.anInt234 + local372 * (double) this.aClass12_1.anInt199) << 8 | (int) ((double) this.aClass12_1.anInt236 + local372 * (double) this.aClass12_1.anInt203) << 16 | (int) ((double) this.aClass12_1.anInt198 + local372 * (double) this.aClass12_1.anInt222);
					} else {
						local430 = (int) ((double) this.aClass12_1.anInt206 + Math.random() * (double) this.aClass12_1.anInt197) << 24 | (int) (Math.random() * (double) this.aClass12_1.anInt222 + (double) this.aClass12_1.anInt198) | (int) ((double) this.aClass12_1.anInt199 * Math.random() + (double) this.aClass12_1.anInt234) << 8 | (int) ((double) this.aClass12_1.anInt203 * Math.random() + (double) this.aClass12_1.anInt236) << 16;
					}
					@Pc(494) int local494 = this.aClass12_1.anInt250;
					if (!arg3.method5437() && !this.aClass12_1.aBoolean7) {
						local494 = -1;
					}
					if (Static120.anInt2720 == Static337.anInt6358) {
						new Class36_Sub2_Sub1_Sub1(this, local193, local201, local205, local211, local215, local221, local333, local350, local430, local366, local494, this.aClass12_1.aBoolean4);
					} else {
						@Pc(514) Class36_Sub2_Sub1_Sub1 local514 = Static203.aClass36_Sub2_Sub1_Sub1Array2[Static337.anInt6358];
						Static337.anInt6358 = Static337.anInt6358 + 1 & 0x3FF;
						local514.method5329(this, local193, local201, local205, local211, local215, local221, local333, local350, local430, local366, local494, this.aClass12_1.aBoolean4);
					}
				}
			}
		}
		this.anInt5299 = 0;
		for (@Pc(579) Class36_Sub2_Sub1_Sub1 local579 = (Class36_Sub2_Sub1_Sub1) this.aClass191_6.method4862(); local579 != null; local579 = (Class36_Sub2_Sub1_Sub1) this.aClass191_6.method4869()) {
			local579.method5327(arg2, arg0);
			this.anInt5299++;
		}
		Static52.anInt1391 += this.anInt5299;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JB)V")
	public void method4486(@OriginalArg(0) long arg0) {
		for (@Pc(17) Class36_Sub2_Sub1_Sub1 local17 = (Class36_Sub2_Sub1_Sub1) this.aClass191_6.method4862(); local17 != null; local17 = (Class36_Sub2_Sub1_Sub1) this.aClass191_6.method4869()) {
			local17.method5330(arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public void method4490() {
		this.anInt5305 = this.aClass57_2.anInt1624;
		this.anInt5292 = this.aClass57_2.anInt1626;
		this.anInt5303 = this.aClass57_2.anInt1631;
		this.anInt5297 = this.aClass57_2.anInt1633;
		this.anInt5291 = this.aClass57_2.anInt1628;
		this.anInt5298 = this.aClass57_2.anInt1629;
		this.anInt5287 = this.aClass57_2.anInt1639;
		this.anInt5280 = this.aClass57_2.anInt1623;
		this.anInt5310 = this.aClass57_2.anInt1627;
		if (this.anInt5287 == this.anInt5305 && this.anInt5305 == this.anInt5297 && this.anInt5310 == this.anInt5280 && this.anInt5310 == this.anInt5292 && this.anInt5303 == this.anInt5298 && this.anInt5291 == this.anInt5298) {
			this.aBoolean394 = true;
			return;
		}
		this.aBoolean394 = false;
		@Pc(106) int local106 = (this.anInt5297 + this.anInt5287 + this.anInt5305) / 3;
		@Pc(117) int local117 = (this.anInt5292 + this.anInt5310 + this.anInt5280) / 3;
		@Pc(129) int local129 = (this.anInt5291 + this.anInt5303 + this.anInt5298) / 3;
		if (local106 == this.anInt5282 && this.anInt5285 == local117 && local129 == this.anInt5283) {
			return;
		}
		this.anInt5285 = local117;
		this.anInt5282 = local106;
		this.anInt5283 = local129;
		@Pc(166) int local166 = this.anInt5305 - this.anInt5287;
		@Pc(172) int local172 = this.anInt5310 - this.anInt5280;
		@Pc(179) int local179 = this.anInt5298 - this.anInt5303;
		@Pc(186) int local186 = this.anInt5297 - this.anInt5287;
		@Pc(192) int local192 = this.anInt5292 - this.anInt5280;
		@Pc(199) int local199 = this.anInt5291 - this.anInt5303;
		this.anInt5295 = local186 * local179 - local199 * local166;
		this.anInt5300 = local172 * local199 - local179 * local192;
		this.anInt5293 = local192 * local166 - local186 * local172;
		while (this.anInt5300 > 32767 || this.anInt5295 > 32767 || this.anInt5293 > 32767 || this.anInt5300 < -32767 || this.anInt5295 < -32767 || this.anInt5293 < -32767) {
			this.anInt5295 >>= 0x1;
			this.anInt5293 >>= 0x1;
			this.anInt5300 >>= 0x1;
		}
		@Pc(299) int local299 = (int) Math.sqrt((double) (this.anInt5295 * this.anInt5295 + this.anInt5300 * this.anInt5300 + this.anInt5293 * this.anInt5293));
		if (local299 <= 0) {
			local299 = 1;
		}
		this.anInt5293 = this.anInt5293 * 32767 / local299;
		this.anInt5295 = this.anInt5295 * 32767 / local299;
		this.anInt5300 = this.anInt5300 * 32767 / local299;
		if (this.aClass12_1.aShort4 <= 0 && this.aClass12_1.aShort3 <= 0) {
			return;
		}
		@Pc(352) int local352 = (int) (Math.atan2((double) this.anInt5293, (double) this.anInt5300) * 2607.5945876176133D);
		@Pc(373) int local373 = (int) (Math.atan2((double) this.anInt5295, Math.sqrt((double) (this.anInt5293 * this.anInt5293 + this.anInt5300 * this.anInt5300))) * 2607.5945876176133D);
		this.anInt5306 = this.aClass12_1.aShort4 - this.aClass12_1.aShort5;
		this.anInt5290 = this.aClass12_1.aShort3 - this.aClass12_1.aShort6;
		this.anInt5307 = local352 + this.aClass12_1.aShort5 - (this.anInt5306 >> 1);
		this.anInt5289 = this.aClass12_1.aShort6 + local373 - (this.anInt5290 >> 1);
	}
}
