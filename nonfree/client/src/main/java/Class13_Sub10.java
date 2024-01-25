import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class13_Sub10 extends Class13 {

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
	public int anInt7090;

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
	private int anInt7091;

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
	private int anInt7092;

	@OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
	private int anInt7093;

	@OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
	private int anInt7094;

	@OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
	private int anInt7095;

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "I")
	private int anInt7096;

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
	private int anInt7097;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
	private int anInt7084 = 0;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
	public boolean aBoolean533 = false;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!qea;")
	public Class280 aClass280_1 = new Class280();

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "Lclient!qea;")
	private Class280 aClass280_2 = new Class280();

	@OriginalMember(owner = "client!pt", name = "z", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "Lclient!hr;")
	public final Class143 aClass143_2;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "J")
	private final long aLong207;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Lclient!pba;")
	public final Class13_Sub9 aClass13_Sub9_7;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!ou;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Lclient!jia;")
	public final Class171 aClass171_7;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ha;Lclient!hr;Lclient!pba;J)V")
	public Class13_Sub10(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class13_Sub9 arg2, @OriginalArg(3) long arg3) {
		this.aClass143_2 = arg1;
		this.aLong207 = arg3;
		this.aClass13_Sub9_7 = arg2;
		this.aClass259_1 = this.aClass143_2.method3021();
		if (!arg0.method6962() && this.aClass259_1.anInt6488 != -1) {
			this.aClass259_1 = Static485.method6788(this.aClass259_1.anInt6488);
		}
		this.aClass171_7 = new Class171();
		this.anInt7084 = (int) ((double) this.anInt7084 + Math.random() * 64.0D);
		this.method6043();
		this.aClass280_2.anInt7374 = this.aClass280_1.anInt7374;
		this.aClass280_2.anInt7378 = this.aClass280_1.anInt7378;
		this.aClass280_2.anInt7369 = this.aClass280_1.anInt7369;
		this.aClass280_2.anInt7376 = this.aClass280_1.anInt7376;
		this.aClass280_2.anInt7368 = this.aClass280_1.anInt7368;
		this.aClass280_2.anInt7375 = this.aClass280_1.anInt7375;
		this.aClass280_2.anInt7371 = this.aClass280_1.anInt7371;
		this.aClass280_2.anInt7373 = this.aClass280_1.anInt7373;
		this.aClass280_2.anInt7372 = this.aClass280_1.anInt7372;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZIJLclient!ha;)V")
	public void method6039(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class95 arg3) {
		@Pc(42) int local42;
		if (this.aBoolean533) {
			arg0 = false;
		} else if (this.aClass259_1.anInt6479 > Static504.anInt8146) {
			arg0 = false;
		} else if (Static79.anInt1412 > Static535.anIntArray592[Static504.anInt8146]) {
			arg0 = false;
		} else if (this.aBoolean534) {
			arg0 = false;
		} else if (this.aClass259_1.anInt6520 != -1) {
			local42 = (int) (arg2 - this.aLong207);
			if (this.aClass259_1.aBoolean464 || this.aClass259_1.anInt6520 >= local42) {
				local42 %= this.aClass259_1.anInt6520;
			} else {
				arg0 = false;
			}
			if (!this.aClass259_1.aBoolean469 && local42 < this.aClass259_1.anInt6506) {
				arg0 = false;
			}
			if (this.aClass259_1.aBoolean469 && this.aClass259_1.anInt6506 <= local42) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static133.anInt2249++;
			local42 = (this.aClass280_1.anInt7375 + this.aClass280_1.anInt7372 + this.aClass280_1.anInt7373) / 3;
			@Pc(133) int local133 = (this.aClass280_1.anInt7378 + this.aClass280_1.anInt7374 + this.aClass280_1.anInt7369) / 3;
			@Pc(148) int local148 = (this.aClass280_1.anInt7371 + this.aClass280_1.anInt7376 + this.aClass280_1.anInt7368) / 3;
			@Pc(188) int local188;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(214) int local214;
			@Pc(223) int local223;
			@Pc(232) int local232;
			@Pc(334) int local334;
			@Pc(387) int local387;
			@Pc(409) int local409;
			if (local42 != this.aClass280_1.anInt7365 || local133 != this.aClass280_1.anInt7366 || this.aClass280_1.anInt7367 != local148) {
				this.aClass280_1.anInt7366 = local133;
				this.aClass280_1.anInt7367 = local148;
				this.aClass280_1.anInt7365 = local42;
				local188 = this.aClass280_1.anInt7373 - this.aClass280_1.anInt7372;
				local197 = this.aClass280_1.anInt7378 - this.aClass280_1.anInt7374;
				local206 = this.aClass280_1.anInt7368 - this.aClass280_1.anInt7376;
				local214 = this.aClass280_1.anInt7375 - this.aClass280_1.anInt7372;
				local223 = this.aClass280_1.anInt7369 - this.aClass280_1.anInt7374;
				local232 = this.aClass280_1.anInt7371 - this.aClass280_1.anInt7376;
				this.anInt7096 = local223 * local188 - local197 * local214;
				this.anInt7095 = local232 * local197 - local206 * local223;
				this.anInt7093 = local214 * local206 - local188 * local232;
				while (true) {
					if (this.anInt7095 <= 32767 && this.anInt7093 <= 32767 && this.anInt7096 <= 32767 && this.anInt7095 >= -32767 && this.anInt7093 >= -32767 && this.anInt7096 >= -32767) {
						local334 = (int) Math.sqrt((double) (this.anInt7096 * this.anInt7096 + this.anInt7095 * this.anInt7095 + this.anInt7093 * this.anInt7093));
						if (local334 <= 0) {
							local334 = 1;
						}
						this.anInt7095 = this.anInt7095 * 32767 / local334;
						this.anInt7093 = this.anInt7093 * 32767 / local334;
						this.anInt7096 = this.anInt7096 * 32767 / local334;
						if (this.aClass259_1.aShort85 > 0 || this.aClass259_1.aShort86 > 0) {
							local387 = (int) (Math.atan2((double) this.anInt7096, (double) this.anInt7095) * 2607.5945876176133D);
							local409 = (int) (Math.atan2((double) this.anInt7093, Math.sqrt((double) (this.anInt7095 * this.anInt7095 + this.anInt7096 * this.anInt7096))) * 2607.5945876176133D);
							this.anInt7094 = this.aClass259_1.aShort85 - this.aClass259_1.aShort88;
							this.anInt7092 = local387 + this.aClass259_1.aShort88 - (this.anInt7094 >> 1);
							this.anInt7097 = this.aClass259_1.aShort86 - this.aClass259_1.aShort87;
							this.anInt7091 = local409 + this.aClass259_1.aShort87 - (this.anInt7097 >> 1);
						}
						break;
					}
					this.anInt7093 >>= 0x1;
					this.anInt7095 >>= 0x1;
					this.anInt7096 >>= 0x1;
				}
			}
			this.anInt7084 += (int) ((Math.random() * (double) (this.aClass259_1.anInt6526 - this.aClass259_1.anInt6515) + (double) this.aClass259_1.anInt6515) * (double) arg1);
			if (this.anInt7084 > 63) {
				local188 = this.anInt7084 >> 6;
				this.anInt7084 &= 0x3F;
				for (local223 = 0; local223 < local188; local223++) {
					@Pc(562) int local562;
					@Pc(566) int local566;
					if (this.aClass259_1.aShort85 <= 0 && this.aClass259_1.aShort86 <= 0) {
						local197 = this.anInt7095;
						local206 = this.anInt7093;
						local214 = this.anInt7096;
					} else {
						local232 = (int) (Math.random() * (double) this.anInt7094) + this.anInt7092;
						local232 &= 0x3FFF;
						local334 = Canvas_Sub1.anIntArray497[local232];
						local387 = Canvas_Sub1.anIntArray498[local232];
						local409 = (int) ((double) this.anInt7097 * Math.random()) + this.anInt7091;
						local409 &= 0x1FFF;
						local562 = Canvas_Sub1.anIntArray497[local409];
						local566 = Canvas_Sub1.anIntArray498[local409];
						local197 = local562 * local387 >> 13;
						local206 = (local566 << 1) * -1;
						local214 = local562 * local334 >> 13;
					}
					@Pc(589) float local589 = (float) Math.random();
					@Pc(592) float local592 = (float) Math.random();
					if (local589 + local592 > 1.0F) {
						local589 = 1.0F - local589;
						local592 = 1.0F - local592;
					}
					@Pc(613) float local613 = 1.0F - local589 - local592;
					local409 = (int) ((float) this.aClass280_1.anInt7375 * local613 + (float) this.aClass280_1.anInt7373 * local592 + (float) this.aClass280_1.anInt7372 * local589);
					local562 = (int) (local613 * (float) this.aClass280_1.anInt7369 + local592 * (float) this.aClass280_1.anInt7378 + (float) this.aClass280_1.anInt7374 * local589);
					local566 = (int) (local613 * (float) this.aClass280_1.anInt7371 + (float) this.aClass280_1.anInt7368 * local592 + (float) this.aClass280_1.anInt7376 * local589);
					@Pc(701) int local701 = (int) (local589 * (float) this.aClass280_2.anInt7372 + local592 * (float) this.aClass280_2.anInt7373 + (float) this.aClass280_2.anInt7375 * local613);
					@Pc(723) int local723 = (int) (local589 * (float) this.aClass280_2.anInt7374 + (float) this.aClass280_2.anInt7378 * local592 + (float) this.aClass280_2.anInt7369 * local613);
					@Pc(745) int local745 = (int) ((float) this.aClass280_2.anInt7368 * local592 + local589 * (float) this.aClass280_2.anInt7376 + local613 * (float) this.aClass280_2.anInt7371);
					@Pc(750) int local750 = local409 - local701;
					@Pc(754) int local754 = local562 - local723;
					@Pc(759) int local759 = local566 - local745;
					@Pc(768) int local768 = (int) ((double) local701 + (double) local750 * Math.random());
					@Pc(777) int local777 = (int) ((double) local754 * Math.random() + (double) local723);
					@Pc(786) int local786 = (int) ((double) local745 + (double) local759 * Math.random());
					@Pc(802) int local802 = (int) ((double) (this.aClass259_1.anInt6532 - this.aClass259_1.anInt6516) * Math.random()) + this.aClass259_1.anInt6516;
					@Pc(819) int local819 = (int) (Math.random() * (double) (this.aClass259_1.anInt6480 - this.aClass259_1.anInt6487)) + this.aClass259_1.anInt6487;
					@Pc(835) int local835 = (int) ((double) (this.aClass259_1.anInt6518 - this.aClass259_1.anInt6485) * Math.random()) + this.aClass259_1.anInt6485;
					@Pc(897) int local897;
					if (this.aClass259_1.aBoolean466) {
						@Pc(901) double local901 = Math.random();
						local897 = (int) ((double) this.aClass259_1.anInt6531 + (double) this.aClass259_1.anInt6492 * Math.random()) << 24 | (int) ((double) this.aClass259_1.anInt6529 * local901 + (double) this.aClass259_1.anInt6482) | (int) ((double) this.aClass259_1.anInt6510 + (double) this.aClass259_1.anInt6524 * local901) << 16 | (int) ((double) this.aClass259_1.anInt6497 + (double) this.aClass259_1.anInt6490 * local901) << 8;
					} else {
						local897 = (int) (Math.random() * (double) this.aClass259_1.anInt6524 + (double) this.aClass259_1.anInt6510) << 16 | (int) ((double) this.aClass259_1.anInt6490 * Math.random() + (double) this.aClass259_1.anInt6497) << 8 | (int) (Math.random() * (double) this.aClass259_1.anInt6529 + (double) this.aClass259_1.anInt6482) | (int) ((double) this.aClass259_1.anInt6531 + (double) this.aClass259_1.anInt6492 * Math.random()) << 24;
					}
					@Pc(963) int local963 = this.aClass259_1.anInt6507;
					if (!arg3.method6962() && !this.aClass259_1.aBoolean467) {
						local963 = -1;
					}
					if (Static48.anInt1036 == Static92.anInt1711) {
						new Class13_Sub3_Sub2_Sub1(this, local768, local777, local786, local197, local206, local214, local802, local819, local897, local835, local963, this.aClass259_1.aBoolean468, this.aClass259_1.aBoolean470);
					} else {
						@Pc(1003) Class13_Sub3_Sub2_Sub1 local1003 = Static429.aClass13_Sub3_Sub2_Sub1Array2[Static48.anInt1036];
						Static48.anInt1036 = Static48.anInt1036 + 1 & 0x3FF;
						local1003.method5095(this, local768, local777, local786, local197, local206, local214, local802, local819, local897, local835, local963, this.aClass259_1.aBoolean468, this.aClass259_1.aBoolean470);
					}
				}
			}
		}
		if (!this.aClass280_1.method6242(this.aClass280_2)) {
			@Pc(1047) Class280 local1047 = this.aClass280_2;
			this.aClass280_2 = this.aClass280_1;
			this.aClass280_1 = local1047;
			this.aClass280_1.anInt7378 = this.aClass143_2.anInt3606;
			this.aClass280_1.anInt7369 = this.aClass143_2.anInt3604;
			this.aClass280_1.anInt7374 = this.aClass143_2.anInt3596;
			this.aClass280_1.anInt7368 = this.aClass143_2.anInt3610;
			this.aClass280_1.anInt7365 = this.aClass280_2.anInt7365;
			this.aClass280_1.anInt7366 = this.aClass280_2.anInt7366;
			this.aClass280_1.anInt7372 = this.aClass143_2.anInt3602;
			this.aClass280_1.anInt7371 = this.aClass143_2.anInt3608;
			this.aClass280_1.anInt7367 = this.aClass280_2.anInt7367;
			this.aClass280_1.anInt7376 = this.aClass143_2.anInt3600;
			this.aClass280_1.anInt7375 = this.aClass143_2.anInt3601;
			this.aClass280_1.anInt7373 = this.aClass143_2.anInt3603;
		}
		this.anInt7090 = 0;
		for (@Pc(1139) Class13_Sub3_Sub2_Sub1 local1139 = (Class13_Sub3_Sub2_Sub1) this.aClass171_7.method3745(); local1139 != null; local1139 = (Class13_Sub3_Sub2_Sub1) this.aClass171_7.method3744()) {
			local1139.method5097(arg2, arg1);
			this.anInt7090++;
		}
		Static546.anInt8995 += this.anInt7090;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(JILclient!ha;)V")
	public void method6041(@OriginalArg(0) long arg0, @OriginalArg(2) Class95 arg1) {
		for (@Pc(7) Class13_Sub3_Sub2_Sub1 local7 = (Class13_Sub3_Sub2_Sub1) this.aClass171_7.method3745(); local7 != null; local7 = (Class13_Sub3_Sub2_Sub1) this.aClass171_7.method3744()) {
			local7.method5096(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public void method6043() {
		this.aClass280_1.anInt7368 = this.aClass143_2.anInt3610;
		this.aClass280_1.anInt7369 = this.aClass143_2.anInt3604;
		this.aClass280_1.anInt7376 = this.aClass143_2.anInt3600;
		this.aClass280_1.anInt7375 = this.aClass143_2.anInt3601;
		this.aClass280_1.anInt7372 = this.aClass143_2.anInt3602;
		this.aClass280_1.anInt7374 = this.aClass143_2.anInt3596;
		this.aClass280_1.anInt7378 = this.aClass143_2.anInt3606;
		this.aClass280_1.anInt7373 = this.aClass143_2.anInt3603;
		this.aClass280_1.anInt7371 = this.aClass143_2.anInt3608;
		if (this.aClass280_1.anInt7372 == this.aClass280_1.anInt7373 && this.aClass280_1.anInt7375 == this.aClass280_1.anInt7373 && this.aClass280_1.anInt7378 == this.aClass280_1.anInt7374 && this.aClass280_1.anInt7369 == this.aClass280_1.anInt7378 && this.aClass280_1.anInt7376 == this.aClass280_1.anInt7368 && this.aClass280_1.anInt7368 == this.aClass280_1.anInt7371) {
			this.aBoolean534 = true;
		} else if (this.aBoolean534) {
			this.aClass280_2.anInt7372 = this.aClass280_1.anInt7372;
			this.aClass280_2.anInt7376 = this.aClass280_1.anInt7376;
			this.aClass280_2.anInt7378 = this.aClass280_1.anInt7378;
			this.aClass280_2.anInt7368 = this.aClass280_1.anInt7368;
			this.aClass280_2.anInt7373 = this.aClass280_1.anInt7373;
			this.aClass280_2.anInt7371 = this.aClass280_1.anInt7371;
			this.aBoolean534 = false;
			this.aClass280_2.anInt7374 = this.aClass280_1.anInt7374;
			this.aClass280_2.anInt7369 = this.aClass280_1.anInt7369;
			this.aClass280_2.anInt7375 = this.aClass280_1.anInt7375;
		}
	}
}
