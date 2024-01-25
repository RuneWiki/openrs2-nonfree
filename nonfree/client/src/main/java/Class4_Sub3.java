import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	private int anInt1383;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	private int anInt1384;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	private int anInt1385;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	private int anInt1386;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	private int anInt1388;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	private int anInt1389;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	private int anInt1377 = 0;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!rba;")
	public Class296 aClass296_1 = new Class296();

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!rba;")
	private Class296 aClass296_2 = new Class296();

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!em;")
	public final Class4_Sub4 aClass4_Sub4_4;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "J")
	private final long aLong36;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!ou;")
	public final Class261 aClass261_1;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Lclient!vfa;")
	public Class360 aClass360_1;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!fa;")
	public final Class99 aClass99_2;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!ha;Lclient!ou;Lclient!em;J)V")
	public Class4_Sub3(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class4_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass4_Sub4_4 = arg2;
		this.aLong36 = arg3;
		this.aClass261_1 = arg1;
		this.aClass360_1 = this.aClass261_1.method6339();
		if (!arg0.method7311() && this.aClass360_1.anInt9948 != -1) {
			this.aClass360_1 = Static258.method4239(this.aClass360_1.anInt9948);
		}
		this.aClass99_2 = new Class99();
		this.anInt1377 = (int) ((double) this.anInt1377 + Math.random() * 64.0D);
		this.method1117();
		this.aClass296_2.anInt8058 = this.aClass296_1.anInt8058;
		this.aClass296_2.anInt8055 = this.aClass296_1.anInt8055;
		this.aClass296_2.anInt8057 = this.aClass296_1.anInt8057;
		this.aClass296_2.anInt8063 = this.aClass296_1.anInt8063;
		this.aClass296_2.anInt8056 = this.aClass296_1.anInt8056;
		this.aClass296_2.anInt8059 = this.aClass296_1.anInt8059;
		this.aClass296_2.anInt8060 = this.aClass296_1.anInt8060;
		this.aClass296_2.anInt8061 = this.aClass296_1.anInt8061;
		this.aClass296_2.anInt8051 = this.aClass296_1.anInt8051;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public void method1116(@OriginalArg(0) Class133 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(9) Class4_Sub1_Sub1_Sub1 local9 = (Class4_Sub1_Sub1_Sub1) this.aClass99_2.method2045(); local9 != null; local9 = (Class4_Sub1_Sub1_Sub1) this.aClass99_2.method2047()) {
			local9.method63(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
	public void method1117() {
		this.aClass296_1.anInt8058 = this.aClass261_1.anInt7182;
		this.aClass296_1.anInt8056 = this.aClass261_1.anInt7173;
		this.aClass296_1.anInt8063 = this.aClass261_1.anInt7166;
		this.aClass296_1.anInt8059 = this.aClass261_1.anInt7174;
		this.aClass296_1.anInt8051 = this.aClass261_1.anInt7176;
		this.aClass296_1.anInt8055 = this.aClass261_1.anInt7168;
		this.aClass296_1.anInt8060 = this.aClass261_1.anInt7180;
		this.aClass296_1.anInt8061 = this.aClass261_1.anInt7169;
		this.aClass296_1.anInt8057 = this.aClass261_1.anInt7177;
		if (this.aClass296_1.anInt8051 == this.aClass296_1.anInt8060 && this.aClass296_1.anInt8060 == this.aClass296_1.anInt8057 && this.aClass296_1.anInt8061 == this.aClass296_1.anInt8056 && this.aClass296_1.anInt8056 == this.aClass296_1.anInt8055 && this.aClass296_1.anInt8063 == this.aClass296_1.anInt8058 && this.aClass296_1.anInt8063 == this.aClass296_1.anInt8059) {
			this.aBoolean78 = true;
		} else if (this.aBoolean78) {
			this.aClass296_2.anInt8055 = this.aClass296_1.anInt8055;
			this.aClass296_2.anInt8051 = this.aClass296_1.anInt8051;
			this.aClass296_2.anInt8063 = this.aClass296_1.anInt8063;
			this.aClass296_2.anInt8057 = this.aClass296_1.anInt8057;
			this.aClass296_2.anInt8060 = this.aClass296_1.anInt8060;
			this.aClass296_2.anInt8056 = this.aClass296_1.anInt8056;
			this.aClass296_2.anInt8061 = this.aClass296_1.anInt8061;
			this.aBoolean78 = false;
			this.aClass296_2.anInt8059 = this.aClass296_1.anInt8059;
			this.aClass296_2.anInt8058 = this.aClass296_1.anInt8058;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZLclient!ha;JI)V")
	public void method1118(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(45) int local45;
		if (this.aBoolean77) {
			arg0 = false;
		} else if (Static359.anInt6012 < this.aClass360_1.anInt9946) {
			arg0 = false;
		} else if (Static336.anIntArray313[Static359.anInt6012] < Static337.anInt5728) {
			arg0 = false;
		} else if (this.aBoolean78) {
			arg0 = false;
		} else if (this.aClass360_1.anInt9977 != -1) {
			local45 = (int) (arg2 - this.aLong36);
			if (this.aClass360_1.aBoolean717 || local45 <= this.aClass360_1.anInt9977) {
				local45 %= this.aClass360_1.anInt9977;
			} else {
				arg0 = false;
			}
			if (!this.aClass360_1.aBoolean709 && local45 < this.aClass360_1.anInt9990) {
				arg0 = false;
			}
			if (this.aClass360_1.aBoolean709 && local45 >= this.aClass360_1.anInt9990) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static10.anInt221++;
			local45 = (this.aClass296_1.anInt8057 + this.aClass296_1.anInt8051 + this.aClass296_1.anInt8060) / 3;
			@Pc(133) int local133 = (this.aClass296_1.anInt8055 + this.aClass296_1.anInt8061 + this.aClass296_1.anInt8056) / 3;
			@Pc(148) int local148 = (this.aClass296_1.anInt8059 + this.aClass296_1.anInt8058 + this.aClass296_1.anInt8063) / 3;
			@Pc(192) int local192;
			@Pc(201) int local201;
			@Pc(210) int local210;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(234) int local234;
			@Pc(336) int local336;
			@Pc(386) int local386;
			@Pc(407) int local407;
			if (this.aClass296_1.anInt8050 != local45 || this.aClass296_1.anInt8053 != local133 || local148 != this.aClass296_1.anInt8054) {
				this.aClass296_1.anInt8050 = local45;
				this.aClass296_1.anInt8054 = local148;
				this.aClass296_1.anInt8053 = local133;
				local192 = this.aClass296_1.anInt8060 - this.aClass296_1.anInt8051;
				local201 = this.aClass296_1.anInt8056 - this.aClass296_1.anInt8061;
				local210 = this.aClass296_1.anInt8063 - this.aClass296_1.anInt8058;
				local218 = this.aClass296_1.anInt8057 - this.aClass296_1.anInt8051;
				local226 = this.aClass296_1.anInt8055 - this.aClass296_1.anInt8061;
				local234 = this.aClass296_1.anInt8059 - this.aClass296_1.anInt8058;
				this.anInt1388 = local218 * local210 - local234 * local192;
				this.anInt1385 = local201 * local234 - local210 * local226;
				this.anInt1386 = local192 * local226 - local201 * local218;
				while (true) {
					if (this.anInt1385 <= 32767 && this.anInt1388 <= 32767 && this.anInt1386 <= 32767 && this.anInt1385 >= -32767 && this.anInt1388 >= -32767 && this.anInt1386 >= -32767) {
						local336 = (int) Math.sqrt((double) (this.anInt1386 * this.anInt1386 + this.anInt1388 * this.anInt1388 + this.anInt1385 * this.anInt1385));
						if (local336 <= 0) {
							local336 = 1;
						}
						this.anInt1386 = this.anInt1386 * 32767 / local336;
						this.anInt1385 = this.anInt1385 * 32767 / local336;
						this.anInt1388 = this.anInt1388 * 32767 / local336;
						if (this.aClass360_1.aShort117 > 0 || this.aClass360_1.aShort118 > 0) {
							local386 = (int) (Math.atan2((double) this.anInt1386, (double) this.anInt1385) * 2607.5945876176133D);
							local407 = (int) (Math.atan2((double) this.anInt1388, Math.sqrt((double) (this.anInt1386 * this.anInt1386 + this.anInt1385 * this.anInt1385))) * 2607.5945876176133D);
							this.anInt1383 = this.aClass360_1.aShort117 - this.aClass360_1.aShort116;
							this.anInt1387 = local386 + this.aClass360_1.aShort116 - (this.anInt1383 >> 1);
							this.anInt1384 = this.aClass360_1.aShort118 - this.aClass360_1.aShort119;
							this.anInt1389 = this.aClass360_1.aShort119 + local407 - (this.anInt1384 >> 1);
						}
						break;
					}
					this.anInt1386 >>= 0x1;
					this.anInt1385 >>= 0x1;
					this.anInt1388 >>= 0x1;
				}
			}
			this.anInt1377 += (int) ((double) arg3 * ((double) (this.aClass360_1.anInt9976 - this.aClass360_1.anInt9988) * Math.random() + (double) this.aClass360_1.anInt9988));
			if (this.anInt1377 > 63) {
				local192 = this.anInt1377 >> 6;
				this.anInt1377 &= 0x3F;
				for (local226 = 0; local226 < local192; local226++) {
					@Pc(551) int local551;
					@Pc(555) int local555;
					if (this.aClass360_1.aShort117 <= 0 && this.aClass360_1.aShort118 <= 0) {
						local201 = this.anInt1385;
						local210 = this.anInt1388;
						local218 = this.anInt1386;
					} else {
						local234 = (int) ((double) this.anInt1383 * Math.random()) + this.anInt1387;
						local234 &= 0x3FFF;
						local336 = Class377.anIntArray600[local234];
						local386 = Class377.anIntArray601[local234];
						local407 = (int) ((double) this.anInt1384 * Math.random()) + this.anInt1389;
						local407 &= 0x1FFF;
						local551 = Class377.anIntArray600[local407];
						local555 = Class377.anIntArray601[local407];
						local210 = (local555 << 1) * -1;
						local201 = local386 * local551 >> 13;
						local218 = local551 * local336 >> 13;
					}
					@Pc(589) float local589 = (float) Math.random();
					@Pc(592) float local592 = (float) Math.random();
					if (local592 + local589 > 1.0F) {
						local589 = 1.0F - local589;
						local592 = 1.0F - local592;
					}
					@Pc(614) float local614 = 1.0F - local589 - local592;
					local407 = (int) (local614 * (float) this.aClass296_1.anInt8057 + local592 * (float) this.aClass296_1.anInt8060 + (float) this.aClass296_1.anInt8051 * local589);
					local551 = (int) (local614 * (float) this.aClass296_1.anInt8055 + (float) this.aClass296_1.anInt8061 * local589 + (float) this.aClass296_1.anInt8056 * local592);
					local555 = (int) ((float) this.aClass296_1.anInt8058 * local589 + (float) this.aClass296_1.anInt8063 * local592 + local614 * (float) this.aClass296_1.anInt8059);
					@Pc(702) int local702 = (int) ((float) this.aClass296_2.anInt8057 * local614 + (float) this.aClass296_2.anInt8051 * local589 + local592 * (float) this.aClass296_2.anInt8060);
					@Pc(724) int local724 = (int) ((float) this.aClass296_2.anInt8061 * local589 + (float) this.aClass296_2.anInt8056 * local592 + local614 * (float) this.aClass296_2.anInt8055);
					@Pc(746) int local746 = (int) (local592 * (float) this.aClass296_2.anInt8063 + (float) this.aClass296_2.anInt8058 * local589 + local614 * (float) this.aClass296_2.anInt8059);
					@Pc(751) int local751 = local407 - local702;
					@Pc(756) int local756 = local551 - local724;
					@Pc(761) int local761 = local555 - local746;
					@Pc(770) int local770 = (int) (Math.random() * (double) local751 + (double) local702);
					@Pc(779) int local779 = (int) ((double) local724 + Math.random() * (double) local756);
					@Pc(788) int local788 = (int) (Math.random() * (double) local761 + (double) local746);
					@Pc(805) int local805 = (int) ((double) (this.aClass360_1.anInt9953 - this.aClass360_1.anInt9954) * Math.random()) + this.aClass360_1.anInt9954;
					@Pc(823) int local823 = this.aClass360_1.anInt9950 + (int) (Math.random() * (double) (this.aClass360_1.anInt9975 - this.aClass360_1.anInt9950));
					@Pc(840) int local840 = this.aClass360_1.anInt9980 + (int) ((double) (this.aClass360_1.anInt9956 - this.aClass360_1.anInt9980) * Math.random());
					@Pc(904) int local904;
					if (this.aClass360_1.aBoolean712) {
						@Pc(846) double local846 = Math.random();
						local904 = (int) ((double) this.aClass360_1.anInt9957 * local846 + (double) this.aClass360_1.anInt9944) | (int) ((double) this.aClass360_1.anInt9962 + (double) this.aClass360_1.anInt9978 * local846) << 16 | (int) ((double) this.aClass360_1.anInt9993 + (double) this.aClass360_1.anInt9991 * local846) << 8 | (int) (Math.random() * (double) this.aClass360_1.anInt9983 + (double) this.aClass360_1.anInt9958) << 24;
					} else {
						local904 = (int) ((double) this.aClass360_1.anInt9944 + Math.random() * (double) this.aClass360_1.anInt9957) | (int) ((double) this.aClass360_1.anInt9991 * Math.random() + (double) this.aClass360_1.anInt9993) << 8 | (int) ((double) this.aClass360_1.anInt9962 + (double) this.aClass360_1.anInt9978 * Math.random()) << 16 | (int) ((double) this.aClass360_1.anInt9958 + Math.random() * (double) this.aClass360_1.anInt9983) << 24;
					}
					@Pc(968) int local968 = this.aClass360_1.anInt9987;
					if (!arg1.method7311() && !this.aClass360_1.aBoolean710) {
						local968 = -1;
					}
					if (Static634.anInt10545 == Static130.anInt2325) {
						new Class4_Sub1_Sub1_Sub1(this, local770, local779, local788, local201, local210, local218, local805, local823, local904, local840, local968, this.aClass360_1.aBoolean714, this.aClass360_1.aBoolean716);
					} else {
						@Pc(984) Class4_Sub1_Sub1_Sub1 local984 = Static521.aClass4_Sub1_Sub1_Sub1Array2[Static634.anInt10545];
						Static634.anInt10545 = Static634.anInt10545 + 1 & 0x3FF;
						local984.method65(this, local770, local779, local788, local201, local210, local218, local805, local823, local904, local840, local968, this.aClass360_1.aBoolean714, this.aClass360_1.aBoolean716);
					}
				}
			}
		}
		if (!this.aClass296_1.method7015(this.aClass296_2)) {
			@Pc(1052) Class296 local1052 = this.aClass296_2;
			this.aClass296_2 = this.aClass296_1;
			this.aClass296_1 = local1052;
			this.aClass296_1.anInt8056 = this.aClass261_1.anInt7173;
			this.aClass296_1.anInt8061 = this.aClass261_1.anInt7169;
			this.aClass296_1.anInt8060 = this.aClass261_1.anInt7180;
			this.aClass296_1.anInt8054 = this.aClass296_2.anInt8054;
			this.aClass296_1.anInt8053 = this.aClass296_2.anInt8053;
			this.aClass296_1.anInt8058 = this.aClass261_1.anInt7182;
			this.aClass296_1.anInt8055 = this.aClass261_1.anInt7168;
			this.aClass296_1.anInt8059 = this.aClass261_1.anInt7174;
			this.aClass296_1.anInt8063 = this.aClass261_1.anInt7166;
			this.aClass296_1.anInt8050 = this.aClass296_2.anInt8050;
			this.aClass296_1.anInt8051 = this.aClass261_1.anInt7176;
			this.aClass296_1.anInt8057 = this.aClass261_1.anInt7177;
		}
		this.anInt1379 = 0;
		for (@Pc(1145) Class4_Sub1_Sub1_Sub1 local1145 = (Class4_Sub1_Sub1_Sub1) this.aClass99_2.method2045(); local1145 != null; local1145 = (Class4_Sub1_Sub1_Sub1) this.aClass99_2.method2047()) {
			local1145.method62(arg2, arg3);
			this.anInt1379++;
		}
		Static556.anInt9402 += this.anInt1379;
	}
}
