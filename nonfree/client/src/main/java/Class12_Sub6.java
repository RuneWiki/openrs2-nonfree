import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	private int anInt4451;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	private int anInt4453;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public int anInt4454;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public int anInt4455;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "I")
	private int anInt4458;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "I")
	private int anInt4459;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	private int anInt4460;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "I")
	public int anInt4461;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	private int anInt4462;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "I")
	private int anInt4463;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "I")
	private int anInt4464;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "I")
	private int anInt4465;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "I")
	private int anInt4467;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "I")
	private int anInt4469;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "I")
	private int anInt4471;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public int anInt4472;

	@OriginalMember(owner = "client!og", name = "L", descriptor = "I")
	private int anInt4473;

	@OriginalMember(owner = "client!og", name = "P", descriptor = "I")
	private int anInt4474;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	private int anInt4475;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "I")
	private int anInt4476 = 0;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "J")
	private final long aLong170;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "Lclient!vq;")
	public final Class241 aClass241_1;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "Lclient!g;")
	public final Class12_Sub4 aClass12_Sub4_5;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Lclient!vt;")
	public Class242 aClass242_1;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!bc;")
	public final Class22 aClass22_6;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!np;Lclient!vq;Lclient!g;J)V")
	public Class12_Sub6(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(2) Class12_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aLong170 = arg3;
		this.aClass241_1 = arg1;
		this.aClass12_Sub4_5 = arg2;
		this.aClass242_1 = Static188.method2993(this.aClass241_1.anInt6269);
		if (!arg0.method4893() && this.aClass242_1.anInt6304 != -1) {
			this.aClass242_1 = Static188.method2993(this.aClass242_1.anInt6304);
		}
		this.aClass22_6 = new Class22();
		this.anInt4476 = (int) ((double) this.anInt4476 + Math.random() * 64.0D);
		this.method4057();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BJ)V")
	public void method4056(@OriginalArg(1) long arg0) {
		for (@Pc(15) Class12_Sub1_Sub1_Sub1 local15 = (Class12_Sub1_Sub1_Sub1) this.aClass22_6.method291(); local15 != null; local15 = (Class12_Sub1_Sub1_Sub1) this.aClass22_6.method292()) {
			local15.method4668(arg0);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public void method4057() {
		this.anInt4453 = this.aClass241_1.anInt6263;
		this.anInt4463 = this.aClass241_1.anInt6264;
		this.anInt4451 = this.aClass241_1.anInt6255;
		this.anInt4467 = this.aClass241_1.anInt6266;
		this.anInt4474 = this.aClass241_1.anInt6260;
		this.anInt4462 = this.aClass241_1.anInt6268;
		this.anInt4458 = this.aClass241_1.anInt6261;
		this.anInt4473 = this.aClass241_1.anInt6257;
		this.anInt4464 = this.aClass241_1.anInt6262;
		if (this.anInt4463 == this.anInt4467 && this.anInt4463 == this.anInt4462 && this.anInt4453 == this.anInt4473 && this.anInt4464 == this.anInt4473 && this.anInt4474 == this.anInt4458 && this.anInt4474 == this.anInt4451) {
			this.aBoolean349 = true;
			return;
		}
		this.aBoolean349 = false;
		@Pc(120) int local120 = (this.anInt4462 + this.anInt4463 + this.anInt4467) / 3;
		@Pc(133) int local133 = (this.anInt4453 + this.anInt4473 + this.anInt4464) / 3;
		@Pc(144) int local144 = (this.anInt4474 + this.anInt4458 + this.anInt4451) / 3;
		if (this.anInt4472 == local120 && this.anInt4455 == local133 && local144 == this.anInt4461) {
			return;
		}
		this.anInt4461 = local144;
		this.anInt4455 = local133;
		this.anInt4472 = local120;
		@Pc(185) int local185 = this.anInt4463 - this.anInt4467;
		@Pc(191) int local191 = this.anInt4473 - this.anInt4453;
		@Pc(198) int local198 = this.anInt4474 - this.anInt4458;
		@Pc(205) int local205 = this.anInt4462 - this.anInt4467;
		@Pc(212) int local212 = this.anInt4464 - this.anInt4453;
		@Pc(219) int local219 = this.anInt4451 - this.anInt4458;
		this.anInt4460 = local219 * local191 - local212 * local198;
		this.anInt4471 = local212 * local185 - local191 * local205;
		this.anInt4475 = local205 * local198 - local219 * local185;
		while (this.anInt4460 > 32767 || this.anInt4475 > 32767 || this.anInt4471 > 32767 || this.anInt4460 < -32767 || this.anInt4475 < -32767 || this.anInt4471 < -32767) {
			this.anInt4475 >>= 0x1;
			this.anInt4471 >>= 0x1;
			this.anInt4460 >>= 0x1;
		}
		@Pc(319) int local319 = (int) Math.sqrt((double) (this.anInt4471 * this.anInt4471 + this.anInt4475 * this.anInt4475 + this.anInt4460 * this.anInt4460));
		if (local319 <= 0) {
			local319 = 1;
		}
		this.anInt4460 = this.anInt4460 * 32767 / local319;
		this.anInt4471 = this.anInt4471 * 32767 / local319;
		this.anInt4475 = this.anInt4475 * 32767 / local319;
		if (this.aClass242_1.aShort103 <= 0 && this.aClass242_1.aShort102 <= 0) {
			return;
		}
		@Pc(372) int local372 = (int) (Math.atan2((double) this.anInt4471, (double) this.anInt4460) * 2607.5945876176133D);
		@Pc(393) int local393 = (int) (Math.atan2((double) this.anInt4475, Math.sqrt((double) (this.anInt4460 * this.anInt4460 + this.anInt4471 * this.anInt4471))) * 2607.5945876176133D);
		this.anInt4470 = this.aClass242_1.aShort103 - this.aClass242_1.aShort100;
		this.anInt4469 = this.aClass242_1.aShort102 - this.aClass242_1.aShort101;
		this.anInt4465 = local372 + this.aClass242_1.aShort100 - (this.anInt4470 >> 1);
		this.anInt4459 = local393 + this.aClass242_1.aShort101 - (this.anInt4469 >> 1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZJLclient!np;I)V")
	public void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class155 arg3) {
		@Pc(49) int local49;
		if (this.aBoolean348) {
			arg1 = false;
		} else if (Static2.anInt65 < this.aClass242_1.anInt6309) {
			arg1 = false;
		} else if (Static255.anInt4594 > Static340.anIntArray618[Static2.anInt65]) {
			arg1 = false;
		} else if (this.aBoolean349) {
			arg1 = false;
		} else if (this.aClass242_1.anInt6349 != -1) {
			local49 = (int) (arg2 - this.aLong170);
			if (this.aClass242_1.aBoolean495 || this.aClass242_1.anInt6349 >= local49) {
				local49 %= this.aClass242_1.anInt6349;
			} else {
				arg1 = false;
			}
			if (!this.aClass242_1.aBoolean492 && this.aClass242_1.anInt6336 > local49) {
				arg1 = false;
			}
			if (this.aClass242_1.aBoolean492 && this.aClass242_1.anInt6336 <= local49) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt4476 += (int) ((double) arg0 * ((double) this.aClass242_1.anInt6315 + (double) (this.aClass242_1.anInt6342 - this.aClass242_1.anInt6315) * Math.random()));
			if (this.anInt4476 > 63) {
				local49 = this.anInt4476 >> 6;
				this.anInt4476 &= 0x3F;
				for (@Pc(142) int local142 = 0; local142 < local49; local142++) {
					@Pc(158) int local158;
					@Pc(155) int local155;
					@Pc(161) int local161;
					@Pc(173) int local173;
					@Pc(181) int local181;
					@Pc(185) int local185;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(213) int local213;
					if (this.aClass242_1.aShort103 <= 0 && this.aClass242_1.aShort102 <= 0) {
						local155 = this.anInt4475;
						local158 = this.anInt4460;
						local161 = this.anInt4471;
					} else {
						local173 = this.anInt4465 + (int) ((double) this.anInt4470 * Math.random());
						@Pc(177) int local177 = local173 & 0x3FFF;
						local181 = Class226.anIntArray614[local177];
						local185 = Class226.anIntArray613[local177];
						local195 = (int) ((double) this.anInt4469 * Math.random()) + this.anInt4459;
						@Pc(199) int local199 = local195 & 0x1FFF;
						local203 = Class226.anIntArray614[local199];
						local158 = local203 * local185 >> 15;
						local213 = Class226.anIntArray613[local199];
						local161 = local203 * local181 >> 15;
						local155 = local213 * -1;
					}
					local173 = (int) (Math.random() * 65535.0D);
					local181 = (int) (Math.random() * 65535.0D);
					if (local173 + local181 > 65535) {
						local181 = 65535 - local181;
						local173 = 65535 - local173;
					}
					local185 = 65535 - local173 - local181;
					local195 = this.anInt4467 * local173 + local181 * this.anInt4463 + local185 * this.anInt4462 >> 16;
					local203 = this.anInt4464 * local185 + local181 * this.anInt4473 + local173 * this.anInt4453 >> 16;
					local213 = local185 * this.anInt4451 + this.anInt4474 * local181 + local173 * this.anInt4458 >> 16;
					@Pc(327) int local327 = this.aClass242_1.anInt6302 + (int) (Math.random() * (double) (this.aClass242_1.anInt6344 - this.aClass242_1.anInt6302));
					@Pc(344) int local344 = (int) ((double) (this.aClass242_1.anInt6311 - this.aClass242_1.anInt6307) * Math.random()) + this.aClass242_1.anInt6307;
					@Pc(361) int local361 = this.aClass242_1.anInt6324 + (int) (Math.random() * (double) (this.aClass242_1.anInt6298 - this.aClass242_1.anInt6324));
					@Pc(425) int local425;
					if (this.aClass242_1.aBoolean496) {
						@Pc(367) double local367 = Math.random();
						local425 = (int) (local367 * (double) this.aClass242_1.anInt6303 + (double) this.aClass242_1.anInt6331) | (int) (local367 * (double) this.aClass242_1.anInt6339 + (double) this.aClass242_1.anInt6320) << 8 | (int) ((double) this.aClass242_1.anInt6326 + local367 * (double) this.aClass242_1.anInt6340) << 16 | (int) ((double) this.aClass242_1.anInt6335 * Math.random() + (double) this.aClass242_1.anInt6300) << 24;
					} else {
						local425 = (int) ((double) this.aClass242_1.anInt6300 + (double) this.aClass242_1.anInt6335 * Math.random()) << 24 | (int) ((double) this.aClass242_1.anInt6331 + (double) this.aClass242_1.anInt6303 * Math.random()) | (int) (Math.random() * (double) this.aClass242_1.anInt6339 + (double) this.aClass242_1.anInt6320) << 8 | (int) ((double) this.aClass242_1.anInt6326 + Math.random() * (double) this.aClass242_1.anInt6340) << 16;
					}
					@Pc(489) int local489 = this.aClass242_1.anInt6313;
					if (!arg3.method4893() && !this.aClass242_1.aBoolean494) {
						local489 = -1;
					}
					if (Static200.anInt3587 == Static163.anInt2727) {
						new Class12_Sub1_Sub1_Sub1(this, local195, local203, local213, local158, local155, local161, local327, local344, local425, local361, local489, this.aClass242_1.lb);
					} else {
						@Pc(526) Class12_Sub1_Sub1_Sub1 local526 = Static381.aClass12_Sub1_Sub1_Sub1Array2[Static200.anInt3587];
						Static200.anInt3587 = Static200.anInt3587 + 1 & 0x3FF;
						local526.method4669(this, local195, local203, local213, local158, local155, local161, local327, local344, local425, local361, local489, this.aClass242_1.lb);
					}
				}
			}
		}
		this.anInt4454 = 0;
		for (@Pc(572) Class12_Sub1_Sub1_Sub1 local572 = (Class12_Sub1_Sub1_Sub1) this.aClass22_6.method291(); local572 != null; local572 = (Class12_Sub1_Sub1_Sub1) this.aClass22_6.method292()) {
			local572.method4672(arg2, arg0);
			this.anInt4454++;
		}
		Static203.anInt3620 += this.anInt4454;
	}
}
