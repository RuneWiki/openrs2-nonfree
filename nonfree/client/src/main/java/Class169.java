import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class169 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	private int anInt4146;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	private int anInt4156;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Lclient!tp;")
	public Class102_Sub6 aClass102_Sub6_4;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!ba;")
	private Class22 aClass22_4;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!fq;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!w;")
	private Class6_Sub1_Sub12 aClass6_Sub1_Sub12_3;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	private int anInt4170;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt4150 = -1;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	private int anInt4147 = -1;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	private int anInt4162 = -32768;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	private int anInt4165 = -1;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	public final int anInt4161;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	public final int anInt4169;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	private int anInt4149;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public final int anInt4168;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIIIZI)V")
	public Class169(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt4161 = arg2;
		this.aBoolean267 = arg8;
		this.anInt4169 = arg3;
		this.anInt4149 = arg6;
		this.aByte54 = (byte) arg4;
		this.anInt4153 = arg7;
		this.aByte55 = (byte) arg5;
		this.anInt4168 = arg1.anInt8480;
		this.aBoolean266 = arg0.method7126() && arg1.aBoolean582 && !this.aBoolean267;
		if (arg9 != -1) {
			this.aBoolean265 = true;
		}
		this.method3585(arg9);
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass102_Sub6_4 != null) {
			this.aClass102_Sub6_4.method6838();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	private void method3576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass108_1 == null) {
				if (this.aBoolean265) {
					return;
				}
				this.method3585(-1);
				if (this.aClass108_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static358.anInt6263 - this.anInt4152;
			if (local30 > 100 && this.aClass108_1.anInt2603 > 0) {
				@Pc(52) int local52 = this.aClass108_1.anIntArray312.length - this.aClass108_1.anInt2603;
				while (local52 > this.anInt4170 && local30 > this.aClass108_1.anIntArray313[this.anInt4170]) {
					local30 -= this.aClass108_1.anIntArray313[this.anInt4170];
					this.anInt4170++;
				}
				if (local52 <= this.anInt4170) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass108_1.anIntArray312.length; local93++) {
						local91 += this.aClass108_1.anIntArray313[local93];
					}
					local30 %= local91;
				}
				this.anInt4146 = this.anInt4170 + 1;
				if (this.anInt4146 >= this.aClass108_1.anIntArray312.length) {
					this.anInt4146 -= this.aClass108_1.anInt2603;
					if (this.anInt4146 < 0 || this.anInt4146 >= this.aClass108_1.anIntArray312.length) {
						this.anInt4146 = -1;
					}
				}
			}
			while (local30 > this.aClass108_1.anIntArray313[this.anInt4170]) {
				Static294.method4111(this.anInt4170, arg1, false, arg0, this.aClass108_1, this.aByte54);
				local30 -= this.aClass108_1.anIntArray313[this.anInt4170];
				this.anInt4170++;
				if (this.anInt4170 >= this.aClass108_1.anIntArray312.length) {
					this.anInt4170 -= this.aClass108_1.anInt2603;
					if (this.anInt4170 < 0 || this.aClass108_1.anIntArray312.length <= this.anInt4170) {
						this.aClass108_1 = null;
						continue label80;
					}
				}
				this.anInt4146 = this.anInt4170 + 1;
				if (this.anInt4146 >= this.aClass108_1.anIntArray312.length) {
					this.anInt4146 -= this.aClass108_1.anInt2603;
					if (this.anInt4146 < 0 || this.anInt4146 >= this.aClass108_1.anIntArray312.length) {
						this.anInt4146 = -1;
					}
				}
			}
			this.anInt4156 = local30;
			this.anInt4152 = Static358.anInt6263 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!oa;)V")
	public void method3579(@OriginalArg(1) Class121 arg0) {
		if (this.aClass6_Sub1_Sub12_3 != null) {
			Static287.method7856(this.aClass6_Sub1_Sub12_3, this.aByte55, this.anInt4149, this.anInt4153, this.aBooleanArray26);
			this.aBooleanArray26 = null;
			this.aClass6_Sub1_Sub12_3 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public int method3580() {
		return this.anInt4162;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIILclient!oa;Z)Lclient!ba;")
	public Class22 method3581(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class121 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class313 local11 = Static260.aClass100_1.method2008(this.anInt4168);
		if (local11.anIntArray650 != null) {
			local11 = local11.method6967(Static505.aClass30_1);
		}
		if (local11 == null) {
			this.method3579(arg4);
			this.anInt4165 = -1;
			this.anInt4150 = -1;
			this.anInt4147 = -1;
			return null;
		}
		if (!this.aBoolean265 && this.anInt4150 != local11.anInt8480) {
			this.aClass22_4 = null;
			this.method3585(-1);
		}
		this.method3576(arg2, arg3);
		if (arg0) {
			@Pc(74) boolean local74 = arg0 & this.aBoolean266 & Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) != 0;
			arg0 = local74 & (this.anInt4165 != local11.anInt8480 || this.aClass108_1 != null && Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) >= 2 && (this.anInt4147 != this.anInt4170 || (this.aClass108_1.aBoolean175 || Static318.aBoolean368) && this.anInt4170 != this.anInt4146));
		}
		if (arg5 && !arg0) {
			this.anInt4150 = local11.anInt8480;
			return null;
		}
		if (arg0) {
			Static287.method7856(this.aClass6_Sub1_Sub12_3, this.aByte55, this.anInt4149, this.anInt4153, this.aBooleanArray26);
			this.anInt4165 = -1;
			this.anInt4147 = -1;
		}
		@Pc(156) Class60 local156 = Static285.aClass60Array8[this.aByte55];
		@Pc(163) Class60 local163;
		if (this.aBoolean267) {
			local163 = Static34.aClass60Array10[0];
		} else {
			local163 = this.aByte55 < 3 ? Static285.aClass60Array8[this.aByte55 + 1] : null;
		}
		@Pc(180) Class22 local180 = null;
		if (this.aClass108_1 != null) {
			if (arg0) {
				arg1 |= 0x40000;
			}
			local180 = local11.method6977(arg4, this.anInt4146, this.anInt4153, local163, local156.sa(this.anInt4149, this.anInt4153), local156, this.anInt4156, this.anInt4170, this.anInt4161 == 11 ? this.anInt4169 + 4 : this.anInt4169, arg1, this.anInt4161 == 11 ? 10 : this.anInt4161, this.anInt4149, this.aClass108_1);
			if (local180 == null) {
				this.aBooleanArray26 = null;
				this.aClass6_Sub1_Sub12_3 = null;
				this.anInt4162 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray26 == null) {
						this.aBooleanArray26 = new boolean[4];
					}
					this.aClass6_Sub1_Sub12_3 = local180.Z(this.aClass6_Sub1_Sub12_3);
					Static128.method1938(this.aClass6_Sub1_Sub12_3, this.aByte55, arg2, arg3, this.aBooleanArray26);
					this.anInt4165 = local11.anInt8480;
					this.anInt4147 = this.anInt4170;
				}
				this.anInt4162 = local180.DA();
			}
			this.aClass22_4 = null;
		} else if (this.aClass22_4 != null && arg1 == (arg1 & this.aClass22_4.h()) && this.anInt4150 == local11.anInt8480) {
			local180 = this.aClass22_4;
		} else {
			if (this.aClass22_4 != null) {
				arg1 |= this.aClass22_4.h();
			}
			@Pc(360) Class300 local360 = local11.method6963(local156, this.anInt4161 == 11 ? 10 : this.anInt4161, this.anInt4149, this.anInt4161 == 11 ? this.anInt4169 + 4 : this.anInt4169, arg4, this.anInt4153, arg0, local156.sa(this.anInt4149, this.anInt4153), local163, arg1);
			if (local360 == null) {
				this.aBooleanArray26 = null;
				this.aClass22_4 = null;
				this.anInt4162 = 0;
				this.aClass6_Sub1_Sub12_3 = null;
			} else {
				local180 = local360.aClass22_7;
				this.aClass22_4 = local360.aClass22_7;
				if (arg0) {
					this.aBooleanArray26 = null;
					this.aClass6_Sub1_Sub12_3 = local360.aClass6_Sub1_Sub12_6;
					Static128.method1938(this.aClass6_Sub1_Sub12_3, this.aByte55, arg2, arg3, null);
					this.anInt4147 = -1;
					this.anInt4165 = local11.anInt8480;
				}
				this.anInt4162 = local180.DA();
			}
		}
		this.anInt4153 = arg3;
		this.anInt4149 = arg2;
		this.anInt4150 = local11.anInt8480;
		return local180;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!oa;Lclient!q;IILclient!ba;IIBZ)V")
	public void method3582(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(6) Class163[] local6 = arg4.method4708();
		@Pc(9) Class250[] local9 = arg4.method4692();
		if ((this.aClass102_Sub6_4 == null || this.aClass102_Sub6_4.aBoolean567) && (local6 != null || local9 != null)) {
			@Pc(26) Class313 local26 = Static260.aClass100_1.method2008(this.anInt4168);
			if (local26.anIntArray650 != null) {
				local26 = local26.method6967(Static505.aClass30_1);
			}
			if (local26 != null) {
				this.aClass102_Sub6_4 = Static496.method6833(Static358.anInt6263, true);
			}
		}
		if (this.aClass102_Sub6_4 == null) {
			return;
		}
		arg4.method4701(arg1);
		if (arg7) {
			this.aClass102_Sub6_4.method6834(arg0, (long) Static358.anInt6263, local6, local9);
		} else {
			this.aClass102_Sub6_4.method6841((long) Static358.anInt6263);
		}
		this.aClass102_Sub6_4.method6844(this.aByte54, arg5, arg2, arg6, arg3);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!oa;)V")
	public void method3583(@OriginalArg(1) Class121 arg0) {
		this.method3581(true, 262144, this.anInt4149, this.anInt4153, arg0, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Z")
	public boolean method3584() {
		return this.aBoolean266;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	private void method3585(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class313 local19 = Static260.aClass100_1.method2008(this.anInt4168);
			@Pc(21) Class313 local21 = local19;
			if (local19.anIntArray650 != null) {
				local19 = local19.method6967(Static505.aClass30_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray651 != null) {
				if (this.aClass108_1 != null && local19.method6972(this.aClass108_1.anInt2600)) {
					return;
				}
				local7 = local19.method6973();
				if (local19.anInt8480 != this.anInt4150) {
					local9 = local19.aBoolean592;
				}
			} else if (local19.anInt8466 == -1) {
				if (local21 != null && local21.anIntArray651 != null) {
					if (this.aClass108_1 != null && local21.method6972(this.aClass108_1.anInt2600)) {
						return;
					}
					local7 = local21.method6973();
					if (local21.anInt8480 != this.anInt4150) {
						local9 = local21.aBoolean592;
					}
				} else if (local21 != null && local21.anInt8466 != -1 && this.anInt4150 != local21.anInt8480) {
					local9 = local21.aBoolean592;
					local7 = local21.anInt8466;
				}
			} else if (local19.anInt8480 != this.anInt4150) {
				local9 = local19.aBoolean592;
				local7 = local19.anInt8466;
			}
		}
		if (local7 == -1) {
			this.aClass108_1 = null;
			return;
		}
		this.aClass22_4 = null;
		if (this.aClass108_1 == null || local7 != this.aClass108_1.anInt2600) {
			this.aClass108_1 = Static31.aClass345_1.method7798(local7);
		} else if (this.aClass108_1.anInt2591 == 0) {
			return;
		}
		if (this.aClass108_1.anIntArray312 == null) {
			this.aClass108_1 = null;
			return;
		}
		if (local9) {
			this.anInt4170 = (int) (Math.random() * (double) this.aClass108_1.anIntArray312.length);
			this.anInt4156 = (int) (Math.random() * (double) this.aClass108_1.anIntArray313[this.anInt4170]) + 1;
		} else {
			this.anInt4170 = 0;
			this.anInt4156 = 1;
		}
		this.anInt4146 = this.anInt4170 + 1;
		if (this.anInt4146 < 0 || this.anInt4146 >= this.aClass108_1.anIntArray312.length) {
			this.anInt4146 = -1;
		}
		this.anInt4152 = Static358.anInt6263 - this.anInt4156;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	public void method3587(@OriginalArg(1) int arg0) {
		this.aBoolean265 = true;
		this.method3585(arg0);
	}
}
