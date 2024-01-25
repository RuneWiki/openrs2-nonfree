import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class55_Sub6 extends Class55 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	private int anInt4292;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt4293;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	private int anInt4295;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	private int anInt4297;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public int anInt4299;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	private int anInt4303;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	private int anInt4306;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	private int anInt4307;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	private int anInt4308;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	private int anInt4309;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
	private int anInt4310;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
	private int anInt4311;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt4312;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	private int anInt4315;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
	private int anInt4316;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	private int anInt4317;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	public int anInt4318;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	private int anInt4319;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
	public int anInt4320;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	private int anInt4313 = 0;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "J")
	private final long aLong134;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "Lclient!om;")
	public final Class55_Sub7 aClass55_Sub7_5;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!qh;")
	public final Class161 aClass161_1;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!e;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!fk;")
	public final Class67 aClass67_5;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ae;Lclient!qh;Lclient!om;J)V")
	public Class55_Sub6(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class55_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aLong134 = arg3;
		this.aClass55_Sub7_5 = arg2;
		this.aClass161_1 = arg1;
		this.aClass47_1 = Static296.method5237(this.aClass161_1.anInt5025);
		if (!arg0.method4301() && this.aClass47_1.anInt1384 != -1) {
			this.aClass47_1 = Static296.method5237(this.aClass47_1.anInt1384);
		}
		this.aClass67_5 = new Class67();
		this.anInt4313 = (int) ((double) this.anInt4313 + Math.random() * 64.0D);
		this.method3942();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JI)V")
	public void method3939(@OriginalArg(0) long arg0) {
		for (@Pc(15) Class55_Sub8_Sub1_Sub1 local15 = (Class55_Sub8_Sub1_Sub1) this.aClass67_5.method2098(); local15 != null; local15 = (Class55_Sub8_Sub1_Sub1) this.aClass67_5.method2104()) {
			local15.method4610(arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public void method3942() {
		this.anInt4310 = this.aClass161_1.anInt5035;
		this.anInt4295 = this.aClass161_1.anInt5034;
		this.anInt4303 = this.aClass161_1.anInt5032;
		this.anInt4315 = this.aClass161_1.anInt5028;
		this.anInt4316 = this.aClass161_1.anInt5020;
		this.anInt4309 = this.aClass161_1.anInt5024;
		this.anInt4311 = this.aClass161_1.anInt5021;
		this.anInt4307 = this.aClass161_1.anInt5036;
		this.anInt4312 = this.aClass161_1.anInt5033;
		if (this.anInt4315 == this.anInt4311 && this.anInt4315 == this.anInt4310 && this.anInt4307 == this.anInt4316 && this.anInt4307 == this.anInt4295 && this.anInt4303 == this.anInt4309 && this.anInt4312 == this.anInt4303) {
			this.aBoolean383 = true;
			return;
		}
		this.aBoolean383 = false;
		@Pc(111) int local111 = (this.anInt4310 + this.anInt4315 + this.anInt4311) / 3;
		@Pc(122) int local122 = (this.anInt4307 + this.anInt4316 + this.anInt4295) / 3;
		@Pc(133) int local133 = (this.anInt4312 + this.anInt4303 + this.anInt4309) / 3;
		if (this.anInt4318 == local111 && local122 == this.anInt4299 && this.anInt4302 == local133) {
			return;
		}
		this.anInt4302 = local133;
		this.anInt4299 = local122;
		this.anInt4318 = local111;
		@Pc(166) int local166 = this.anInt4315 - this.anInt4311;
		@Pc(172) int local172 = this.anInt4307 - this.anInt4316;
		@Pc(179) int local179 = this.anInt4303 - this.anInt4309;
		@Pc(186) int local186 = this.anInt4310 - this.anInt4311;
		@Pc(193) int local193 = this.anInt4295 - this.anInt4316;
		@Pc(200) int local200 = this.anInt4312 - this.anInt4309;
		this.anInt4308 = local172 * local200 - local193 * local179;
		this.anInt4293 = local179 * local186 - local166 * local200;
		this.anInt4319 = local193 * local166 - local172 * local186;
		while (this.anInt4308 > 32767 || this.anInt4293 > 32767 || this.anInt4319 > 32767 || this.anInt4308 < -32767 || this.anInt4293 < -32767 || this.anInt4319 < -32767) {
			this.anInt4308 >>= 0x1;
			this.anInt4319 >>= 0x1;
			this.anInt4293 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt4319 * this.anInt4319 + this.anInt4293 * this.anInt4293 + this.anInt4308 * this.anInt4308));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt4319 = this.anInt4319 * 32767 / local305;
		this.anInt4308 = this.anInt4308 * 32767 / local305;
		this.anInt4293 = this.anInt4293 * 32767 / local305;
		if (this.aClass47_1.aShort26 <= 0 && this.aClass47_1.aShort25 <= 0) {
			return;
		}
		@Pc(358) int local358 = (int) (Math.atan2((double) this.anInt4319, (double) this.anInt4308) * 2607.5945876176133D);
		@Pc(379) int local379 = (int) (Math.atan2((double) this.anInt4293, Math.sqrt((double) (this.anInt4319 * this.anInt4319 + this.anInt4308 * this.anInt4308))) * 2607.5945876176133D);
		this.anInt4317 = this.aClass47_1.aShort26 - this.aClass47_1.aShort27;
		this.anInt4292 = local358 + this.aClass47_1.aShort27 - (this.anInt4317 >> 1);
		this.anInt4306 = this.aClass47_1.aShort25 - this.aClass47_1.aShort24;
		this.anInt4297 = local379 + this.aClass47_1.aShort24 - (this.anInt4306 >> 1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ae;BIZJ)V")
	public void method3944(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(29) int local29;
		if (this.aBoolean382) {
			arg2 = false;
		} else if (Static281.anInt5700 < this.aClass47_1.anInt1403) {
			arg2 = false;
		} else if (Static143.anIntArray245[Static281.anInt5700] < Static157.anInt3178) {
			arg2 = false;
		} else if (this.aBoolean383) {
			arg2 = false;
		} else if (this.aClass47_1.anInt1413 != -1) {
			local29 = (int) (arg3 - this.aLong134);
			if (this.aClass47_1.aBoolean134 || this.aClass47_1.anInt1413 >= local29) {
				local29 %= this.aClass47_1.anInt1413;
			} else {
				arg2 = false;
			}
			if (!this.aClass47_1.aBoolean135 && this.aClass47_1.anInt1415 > local29) {
				arg2 = false;
			}
			if (this.aClass47_1.aBoolean135 && local29 >= this.aClass47_1.anInt1415) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt4313 += (int) (((double) this.aClass47_1.anInt1392 + (double) (this.aClass47_1.anInt1422 - this.aClass47_1.anInt1392) * Math.random()) * (double) arg1);
			if (this.anInt4313 > 63) {
				local29 = this.anInt4313 >> 6;
				this.anInt4313 &= 0x3F;
				for (@Pc(148) int local148 = 0; local148 < local29; local148++) {
					@Pc(167) int local167;
					@Pc(170) int local170;
					@Pc(173) int local173;
					@Pc(185) int local185;
					@Pc(193) int local193;
					@Pc(197) int local197;
					@Pc(207) int local207;
					@Pc(215) int local215;
					@Pc(225) int local225;
					if (this.aClass47_1.aShort26 <= 0 && this.aClass47_1.aShort25 <= 0) {
						local167 = this.anInt4308;
						local170 = this.anInt4293;
						local173 = this.anInt4319;
					} else {
						local185 = (int) ((double) this.anInt4317 * Math.random()) + this.anInt4292;
						@Pc(189) int local189 = local185 & 0x3FFF;
						local193 = Class24.anIntArray35[local189];
						local197 = Class24.anIntArray36[local189];
						local207 = (int) (Math.random() * (double) this.anInt4306) + this.anInt4297;
						@Pc(211) int local211 = local207 & 0x1FFF;
						local215 = Class24.anIntArray35[local211];
						local167 = local215 * local197 >> 15;
						local225 = Class24.anIntArray36[local211];
						local170 = local225 * -1;
						local173 = local193 * local215 >> 15;
					}
					local185 = (int) (Math.random() * 65535.0D);
					local193 = (int) (Math.random() * 65535.0D);
					if (local185 + local193 > 65535) {
						local193 = 65535 - local193;
						local185 = 65535 - local185;
					}
					local197 = 65535 - local185 - local193;
					local207 = local185 * this.anInt4311 + local193 * this.anInt4315 + this.anInt4310 * local197 >> 16;
					local215 = local197 * this.anInt4295 + this.anInt4316 * local185 + this.anInt4307 * local193 >> 16;
					local225 = this.anInt4312 * local197 + this.anInt4309 * local185 + local193 * this.anInt4303 >> 16;
					@Pc(341) int local341 = (int) (Math.random() * (double) (this.aClass47_1.anInt1393 - this.aClass47_1.anInt1386)) + this.aClass47_1.anInt1386;
					@Pc(358) int local358 = this.aClass47_1.anInt1388 + (int) ((double) (this.aClass47_1.anInt1400 - this.aClass47_1.anInt1388) * Math.random());
					@Pc(374) int local374 = (int) ((double) (this.aClass47_1.anInt1420 - this.aClass47_1.anInt1425) * Math.random()) + this.aClass47_1.anInt1425;
					@Pc(438) int local438;
					if (this.aClass47_1.aBoolean133) {
						@Pc(380) double local380 = Math.random();
						local438 = (int) ((double) this.aClass47_1.anInt1376 + (double) this.aClass47_1.anInt1391 * local380) << 24 | (int) ((double) this.aClass47_1.anInt1404 + local380 * (double) this.aClass47_1.anInt1409) << 8 | (int) ((double) this.aClass47_1.anInt1408 + local380 * (double) this.aClass47_1.anInt1396) << 16 | (int) ((double) this.aClass47_1.anInt1379 * local380 + (double) this.aClass47_1.anInt1394);
					} else {
						local438 = (int) ((double) this.aClass47_1.anInt1409 * Math.random() + (double) this.aClass47_1.anInt1404) << 8 | (int) ((double) this.aClass47_1.anInt1408 + (double) this.aClass47_1.anInt1396 * Math.random()) << 16 | (int) ((double) this.aClass47_1.anInt1394 + Math.random() * (double) this.aClass47_1.anInt1379) | (int) ((double) this.aClass47_1.anInt1376 + (double) this.aClass47_1.anInt1391 * Math.random()) << 24;
					}
					@Pc(502) int local502 = this.aClass47_1.anInt1417;
					if (!arg0.method4301() && !this.aClass47_1.aBoolean130) {
						local502 = -1;
					}
					if (Static7.anInt156 == Static169.anInt3464) {
						new Class55_Sub8_Sub1_Sub1(this, local207, local215, local225, local167, local170, local173, local341, local358, local438, local374, local502, this.aClass47_1.aBoolean132);
					} else {
						@Pc(543) Class55_Sub8_Sub1_Sub1 local543 = Static124.aClass55_Sub8_Sub1_Sub1Array2[Static169.anInt3464];
						Static169.anInt3464 = Static169.anInt3464 + 1 & 0x3FF;
						local543.method4608(this, local207, local215, local225, local167, local170, local173, local341, local358, local438, local374, local502, this.aClass47_1.aBoolean132);
					}
				}
			}
		}
		this.anInt4320 = 0;
		for (@Pc(579) Class55_Sub8_Sub1_Sub1 local579 = (Class55_Sub8_Sub1_Sub1) this.aClass67_5.method2098(); local579 != null; local579 = (Class55_Sub8_Sub1_Sub1) this.aClass67_5.method2104()) {
			local579.method4611(arg3, arg1);
			this.anInt4320++;
		}
		Static136.anInt2825 += this.anInt4320;
	}
}
