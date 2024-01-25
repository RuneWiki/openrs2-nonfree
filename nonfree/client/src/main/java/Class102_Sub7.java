import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class102_Sub7 extends Class102 {

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	private int anInt8395;

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
	private int anInt8397;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
	public int anInt8398;

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	private int anInt8399;

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
	private int anInt8401;

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
	private int anInt8402;

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
	public int anInt8403;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private int anInt8404;

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
	private int anInt8405;

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
	public int anInt8406;

	@OriginalMember(owner = "client!uba", name = "z", descriptor = "I")
	private int anInt8407;

	@OriginalMember(owner = "client!uba", name = "C", descriptor = "I")
	private int anInt8408;

	@OriginalMember(owner = "client!uba", name = "G", descriptor = "I")
	private int anInt8410;

	@OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
	private int anInt8411;

	@OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
	private int anInt8412;

	@OriginalMember(owner = "client!uba", name = "K", descriptor = "I")
	private int anInt8413;

	@OriginalMember(owner = "client!uba", name = "M", descriptor = "I")
	private int anInt8415;

	@OriginalMember(owner = "client!uba", name = "O", descriptor = "I")
	public int anInt8417;

	@OriginalMember(owner = "client!uba", name = "Q", descriptor = "I")
	private int anInt8418;

	@OriginalMember(owner = "client!uba", name = "T", descriptor = "I")
	private int anInt8421;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Z")
	public boolean aBoolean574 = false;

	@OriginalMember(owner = "client!uba", name = "r", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
	private int anInt8400 = 0;

	@OriginalMember(owner = "client!uba", name = "D", descriptor = "Lclient!tp;")
	public final Class102_Sub6 aClass102_Sub6_7;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "Lclient!jq;")
	public final Class163 aClass163_2;

	@OriginalMember(owner = "client!uba", name = "I", descriptor = "J")
	private final long aLong216;

	@OriginalMember(owner = "client!uba", name = "F", descriptor = "Lclient!pca;")
	public Class242 aClass242_1;

	@OriginalMember(owner = "client!uba", name = "V", descriptor = "Lclient!pn;")
	public final Class249 aClass249_9;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!oa;Lclient!jq;Lclient!tp;J)V")
	public Class102_Sub7(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) Class102_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aClass102_Sub6_7 = arg2;
		this.aClass163_2 = arg1;
		this.aLong216 = arg3;
		this.aClass242_1 = this.aClass163_2.method3500();
		if (!arg0.method7103() && this.aClass242_1.anInt6536 != -1) {
			this.aClass242_1 = Static254.method3577(this.aClass242_1.anInt6536);
		}
		this.aClass249_9 = new Class249();
		this.anInt8400 = (int) ((double) this.anInt8400 + Math.random() * 64.0D);
		this.method6947();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!oa;J)V")
	public void method6942(@OriginalArg(1) Class121 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(16) Class102_Sub1_Sub1_Sub1 local16 = (Class102_Sub1_Sub1_Sub1) this.aClass249_9.method5817(); local16 != null; local16 = (Class102_Sub1_Sub1_Sub1) this.aClass249_9.method5815()) {
			local16.method2137(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZZJLclient!oa;I)V")
	public void method6944(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class121 arg2, @OriginalArg(4) int arg3) {
		@Pc(45) int local45;
		if (this.aBoolean574) {
			arg0 = false;
		} else if (this.aClass242_1.anInt6533 > Static353.anInt6214) {
			arg0 = false;
		} else if (Static272.anIntArray442[Static353.anInt6214] < Static130.anInt2246) {
			arg0 = false;
		} else if (this.aBoolean575) {
			arg0 = false;
		} else if (this.aClass242_1.anInt6526 != -1) {
			local45 = (int) (arg1 - this.aLong216);
			if (this.aClass242_1.aBoolean452 || this.aClass242_1.anInt6526 >= local45) {
				local45 %= this.aClass242_1.anInt6526;
			} else {
				arg0 = false;
			}
			if (!this.aClass242_1.aBoolean449 && local45 < this.aClass242_1.anInt6512) {
				arg0 = false;
			}
			if (this.aClass242_1.aBoolean449 && this.aClass242_1.anInt6512 <= local45) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt8400 += (int) ((double) arg3 * ((double) this.aClass242_1.anInt6503 + (double) (this.aClass242_1.anInt6524 - this.aClass242_1.anInt6503) * Math.random()));
			if (this.anInt8400 > 63) {
				local45 = this.anInt8400 >> 6;
				this.anInt8400 &= 0x3F;
				for (@Pc(139) int local139 = 0; local139 < local45; local139++) {
					@Pc(155) int local155;
					@Pc(161) int local161;
					@Pc(158) int local158;
					@Pc(173) int local173;
					@Pc(181) int local181;
					@Pc(185) int local185;
					@Pc(196) int local196;
					@Pc(204) int local204;
					@Pc(208) int local208;
					if (this.aClass242_1.aShort90 <= 0 && this.aClass242_1.aShort92 <= 0) {
						local155 = this.anInt8410;
						local158 = this.anInt8405;
						local161 = this.anInt8397;
					} else {
						local173 = (int) ((double) this.anInt8399 * Math.random()) + this.anInt8411;
						@Pc(177) int local177 = local173 & 0x3FFF;
						local181 = Class138.anIntArray392[local177];
						local185 = Class138.anIntArray393[local177];
						local196 = this.anInt8407 + (int) ((double) this.anInt8421 * Math.random());
						@Pc(200) int local200 = local196 & 0x1FFF;
						local204 = Class138.anIntArray392[local200];
						local208 = Class138.anIntArray393[local200];
						local161 = (local208 << 1) * -1;
						local155 = local204 * local185 >> 13;
						local158 = local204 * local181 >> 13;
					}
					local173 = (int) (Math.random() * 65535.0D);
					local181 = (int) (Math.random() * 65535.0D);
					if (local181 + local173 > 65535) {
						local173 = 65535 - local173;
						local181 = 65535 - local181;
					}
					local185 = 65535 - local173 - local181;
					local196 = (int) ((long) local185 * (long) this.anInt8412 + (long) this.anInt8418 * (long) local181 + (long) this.anInt8415 * (long) local173 >> 16);
					local204 = (int) ((long) local185 * (long) this.anInt8401 + (long) this.anInt8404 * (long) local181 + (long) local173 * (long) this.anInt8413 >> 16);
					local208 = (int) ((long) this.anInt8408 * (long) local185 + (long) this.anInt8395 * (long) local173 + (long) this.anInt8402 * (long) local181 >> 16);
					@Pc(351) int local351 = this.aClass242_1.anInt6502 + (int) (Math.random() * (double) (this.aClass242_1.anInt6538 - this.aClass242_1.anInt6502));
					@Pc(368) int local368 = this.aClass242_1.anInt6498 + (int) (Math.random() * (double) (this.aClass242_1.anInt6506 - this.aClass242_1.anInt6498));
					@Pc(385) int local385 = (int) (Math.random() * (double) (this.aClass242_1.anInt6532 - this.aClass242_1.anInt6542)) + this.aClass242_1.anInt6542;
					@Pc(447) int local447;
					if (this.aClass242_1.aBoolean453) {
						@Pc(451) double local451 = Math.random();
						local447 = (int) ((double) this.aClass242_1.anInt6515 + (double) this.aClass242_1.anInt6547 * local451) | (int) ((double) this.aClass242_1.anInt6517 + local451 * (double) this.aClass242_1.anInt6531) << 8 | (int) ((double) this.aClass242_1.anInt6527 + (double) this.aClass242_1.anInt6535 * local451) << 16 | (int) (Math.random() * (double) this.aClass242_1.anInt6541 + (double) this.aClass242_1.anInt6505) << 24;
					} else {
						local447 = (int) ((double) this.aClass242_1.anInt6505 + (double) this.aClass242_1.anInt6541 * Math.random()) << 24 | (int) ((double) this.aClass242_1.anInt6535 * Math.random() + (double) this.aClass242_1.anInt6527) << 16 | (int) ((double) this.aClass242_1.anInt6531 * Math.random() + (double) this.aClass242_1.anInt6517) << 8 | (int) ((double) this.aClass242_1.anInt6547 * Math.random() + (double) this.aClass242_1.anInt6515);
					}
					@Pc(513) int local513 = this.aClass242_1.anInt6511;
					if (!arg2.method7103() && !this.aClass242_1.aBoolean450) {
						local513 = -1;
					}
					if (Static199.anInt3446 == Static553.anInt9290) {
						new Class102_Sub1_Sub1_Sub1(this, local196, local204, local208, local155, local161, local158, local351, local368, local447, local385, local513, this.aClass242_1.aBoolean448, this.aClass242_1.aBoolean451);
					} else {
						@Pc(533) Class102_Sub1_Sub1_Sub1 local533 = Static326.aClass102_Sub1_Sub1_Sub1Array1[Static199.anInt3446];
						Static199.anInt3446 = Static199.anInt3446 + 1 & 0x3FF;
						local533.method2135(this, local196, local204, local208, local155, local161, local158, local351, local368, local447, local385, local513, this.aClass242_1.aBoolean448, this.aClass242_1.aBoolean451);
					}
				}
			}
		}
		this.anInt8417 = 0;
		for (@Pc(596) Class102_Sub1_Sub1_Sub1 local596 = (Class102_Sub1_Sub1_Sub1) this.aClass249_9.method5817(); local596 != null; local596 = (Class102_Sub1_Sub1_Sub1) this.aClass249_9.method5815()) {
			local596.method2136(arg1, arg3);
			this.anInt8417++;
		}
		Static537.anInt9109 += this.anInt8417;
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
	public void method6947() {
		this.anInt8408 = this.aClass163_2.anInt4048;
		this.anInt8418 = this.aClass163_2.anInt4039;
		this.anInt8412 = this.aClass163_2.anInt4043;
		this.anInt8401 = this.aClass163_2.anInt4042;
		this.anInt8404 = this.aClass163_2.anInt4052;
		this.anInt8415 = this.aClass163_2.anInt4051;
		this.anInt8402 = this.aClass163_2.anInt4041;
		this.anInt8395 = this.aClass163_2.anInt4047;
		this.anInt8413 = this.aClass163_2.anInt4038;
		if (this.anInt8418 == this.anInt8415 && this.anInt8412 == this.anInt8418 && this.anInt8404 == this.anInt8413 && this.anInt8401 == this.anInt8404 && this.anInt8402 == this.anInt8395 && this.anInt8408 == this.anInt8402) {
			this.aBoolean575 = true;
			return;
		}
		this.aBoolean575 = false;
		@Pc(115) int local115 = (this.anInt8412 + this.anInt8418 + this.anInt8415) / 3;
		@Pc(126) int local126 = (this.anInt8401 + this.anInt8413 + this.anInt8404) / 3;
		@Pc(137) int local137 = (this.anInt8395 + this.anInt8402 + this.anInt8408) / 3;
		if (local115 == this.anInt8398 && local126 == this.anInt8403 && local137 == this.anInt8406) {
			return;
		}
		this.anInt8398 = local115;
		this.anInt8403 = local126;
		this.anInt8406 = local137;
		@Pc(169) int local169 = this.anInt8418 - this.anInt8415;
		@Pc(176) int local176 = this.anInt8404 - this.anInt8413;
		@Pc(183) int local183 = this.anInt8402 - this.anInt8395;
		@Pc(190) int local190 = this.anInt8412 - this.anInt8415;
		@Pc(196) int local196 = this.anInt8401 - this.anInt8413;
		@Pc(203) int local203 = this.anInt8408 - this.anInt8395;
		this.anInt8405 = local169 * local196 - local190 * local176;
		this.anInt8397 = local190 * local183 - local203 * local169;
		for (this.anInt8410 = local176 * local203 - local196 * local183; this.anInt8410 > 32767 || this.anInt8397 > 32767 || this.anInt8405 > 32767 || this.anInt8410 < -32767 || this.anInt8397 < -32767 || this.anInt8405 < -32767; this.anInt8410 >>= 0x1) {
			this.anInt8405 >>= 0x1;
			this.anInt8397 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt8410 * this.anInt8410 + this.anInt8397 * this.anInt8397 + this.anInt8405 * this.anInt8405));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt8397 = this.anInt8397 * 32767 / local305;
		this.anInt8405 = this.anInt8405 * 32767 / local305;
		this.anInt8410 = this.anInt8410 * 32767 / local305;
		if (this.aClass242_1.aShort90 <= 0 && this.aClass242_1.aShort92 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt8405, (double) this.anInt8410) * 2607.5945876176133D);
		@Pc(377) int local377 = (int) (Math.atan2((double) this.anInt8397, Math.sqrt((double) (this.anInt8410 * this.anInt8410 + this.anInt8405 * this.anInt8405))) * 2607.5945876176133D);
		this.anInt8399 = this.aClass242_1.aShort90 - this.aClass242_1.aShort91;
		this.anInt8421 = this.aClass242_1.aShort92 - this.aClass242_1.aShort93;
		this.anInt8411 = this.aClass242_1.aShort91 + local355 - (this.anInt8399 >> 1);
		this.anInt8407 = this.aClass242_1.aShort93 + local377 - (this.anInt8421 >> 1);
	}
}
