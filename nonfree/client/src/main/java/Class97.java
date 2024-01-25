import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class97 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!qg;")
	private Class270 aClass270_2;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	private int anInt3269;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private int anInt3270;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!da;")
	private Class52 aClass52_3;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!iu;")
	public Class25_Sub7 aClass25_Sub7_2;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_3;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	private int anInt3283 = -1;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
	private int anInt3284 = -1;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
	private int anInt3288 = -1;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	private int anInt3290 = 0;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
	private int anInt3287 = 0;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public final int anInt3279;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
	public final int anInt3285;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!pn;")
	private final Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	public final int anInt3292;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!r;Lclient!lr;IIIILclient!pn;ZI)V")
	public Class97(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class25_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt3279 = arg3;
		this.aByte28 = (byte) arg4;
		this.anInt3285 = arg2;
		this.aByte29 = (byte) arg5;
		this.aBoolean234 = arg7;
		this.aClass25_Sub2_1 = arg6;
		this.anInt3292 = arg1.anInt5827;
		this.aBoolean232 = arg0.method8069() && arg1.aBoolean400 && !this.aBoolean234;
		if (arg8 != -1) {
			this.aBoolean233 = true;
		}
		this.method2658(arg8);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	private void method2658(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class194 local19 = Static536.aClass146_4.method3721(this.anInt3292);
			@Pc(21) Class194 local21 = local19;
			if (local19.anIntArray286 != null) {
				local19 = local19.method4696(Static206.aClass143_3);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray285 != null) {
				if (this.aClass270_2 != null && local19.method4698(this.aClass270_2.anInt7696)) {
					return;
				}
				local7 = local19.method4693();
				if (this.anInt3283 != local19.anInt5827) {
					local9 = local19.aBoolean406;
				}
			} else if (local19.anInt5818 == -1) {
				if (local21 != null && local21.anIntArray285 != null) {
					if (this.aClass270_2 != null && local21.method4698(this.aClass270_2.anInt7696)) {
						return;
					}
					local7 = local21.method4693();
					if (this.anInt3283 != local21.anInt5827) {
						local9 = local21.aBoolean406;
					}
				} else if (local21 != null && local21.anInt5818 != -1 && this.anInt3283 != local21.anInt5827) {
					local7 = local21.anInt5818;
					local9 = local21.aBoolean406;
				}
			} else if (this.anInt3283 != local19.anInt5827) {
				local7 = local19.anInt5818;
				local9 = local19.aBoolean406;
			}
		}
		if (local7 == -1) {
			this.aClass270_2 = null;
			return;
		}
		this.aClass52_3 = null;
		if (this.aClass270_2 == null || local7 != this.aClass270_2.anInt7696) {
			this.aClass270_2 = Static245.aClass155_1.method3820(local7);
		} else if (this.aClass270_2.anInt7686 == 0) {
			return;
		}
		if (this.aClass270_2.anIntArray443 == null) {
			this.aClass270_2 = null;
			return;
		}
		if (local9) {
			this.anInt3289 = (int) ((double) this.aClass270_2.anIntArray443.length * Math.random());
			this.anInt3269 = (int) (Math.random() * (double) this.aClass270_2.anIntArray445[this.anInt3289]) + 1;
		} else {
			this.anInt3269 = 1;
			this.anInt3289 = 0;
		}
		this.anInt3270 = this.anInt3289 + 1;
		if (this.anInt3270 < 0 || this.aClass270_2.anIntArray443.length <= this.anInt3270) {
			this.anInt3270 = -1;
		}
		this.anInt3275 = Static397.anInt6998 - this.anInt3269;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!da;IIIZLclient!r;IBLclient!q;)V")
	public void method2659(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class31 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class42 arg7) {
		@Pc(12) Class317[] local12 = arg0.method7613();
		@Pc(15) Class280[] local15 = arg0.method7636();
		if ((this.aClass25_Sub7_2 == null || this.aClass25_Sub7_2.aBoolean304) && (local12 != null || local15 != null)) {
			@Pc(32) Class194 local32 = Static536.aClass146_4.method3721(this.anInt3292);
			if (local32.anIntArray286 != null) {
				local32 = local32.method4696(Static206.aClass143_3);
			}
			if (local32 != null) {
				this.aClass25_Sub7_2 = Static236.method3776(Static397.anInt6998, true);
			}
		}
		if (this.aClass25_Sub7_2 == null) {
			return;
		}
		arg0.method7614(arg7);
		if (arg4) {
			this.aClass25_Sub7_2.method3784(arg5, (long) Static397.anInt6998, local12, local15);
		} else {
			this.aClass25_Sub7_2.method3788((long) Static397.anInt6998);
		}
		this.aClass25_Sub7_2.method3786(this.aByte28, arg1, arg6, arg2, arg3);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!r;ZZII)Lclient!da;")
	public Class52 method2660(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class194 local11 = Static536.aClass146_4.method3721(this.anInt3292);
		if (local11.anIntArray286 != null) {
			local11 = local11.method4696(Static206.aClass143_3);
		}
		if (local11 == null) {
			this.method2665(arg0);
			this.anInt3283 = -1;
			this.anInt3284 = -1;
			this.anInt3288 = -1;
			return null;
		}
		if (!this.aBoolean233 && local11.anInt5827 != this.anInt3283) {
			this.aClass52_3 = null;
			this.method2658(-1);
		}
		this.method2662(this.aClass25_Sub2_1);
		if (arg2) {
			@Pc(77) boolean local77 = arg2 & this.aBoolean232 & Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) != 0;
			arg2 = local77 & (local11.anInt5827 != this.anInt3284 || this.aClass270_2 != null && Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) >= 2 && (this.anInt3288 != this.anInt3289 || (this.aClass270_2.aBoolean535 || Static323.aBoolean412) && this.anInt3270 != this.anInt3289));
		}
		if (arg1 && !arg2) {
			this.anInt3283 = local11.anInt5827;
			return null;
		}
		if (arg2) {
			Static293.method4410(this.aClass3_Sub7_Sub3_3, this.aByte29, this.aClass25_Sub2_1.anInt8476, this.aClass25_Sub2_1.anInt8482, this.aBooleanArray10);
			this.anInt3284 = -1;
			this.anInt3288 = -1;
		}
		@Pc(157) Class127 local157 = Static256.aClass127Array3[this.aByte29];
		@Pc(173) Class127 local173;
		if (this.aBoolean234) {
			local173 = Static420.aClass127Array6[0];
		} else {
			local173 = this.aByte29 >= 3 ? null : Static256.aClass127Array3[this.aByte29 + 1];
		}
		@Pc(188) Class52 local188 = null;
		if (this.aClass270_2 != null) {
			if (arg2) {
				arg3 |= 0x40000;
			}
			local188 = local11.method4699(this.anInt3285 == 11 ? 10 : this.anInt3285, this.anInt3285 == 11 ? this.anInt3279 + 4 : this.anInt3279, arg3, local173, this.aClass270_2, this.aClass25_Sub2_1.anInt8482, local157, this.anInt3269, local157.method7860(this.aClass25_Sub2_1.anInt8482, this.aClass25_Sub2_1.anInt8476), this.anInt3270, this.anInt3289, this.aClass25_Sub2_1.anInt8476, arg0);
			if (local188 == null) {
				this.anInt3287 = 0;
				this.anInt3290 = 0;
				this.aBooleanArray10 = null;
				this.aClass3_Sub7_Sub3_3 = null;
			} else {
				if (arg2) {
					if (this.aBooleanArray10 == null) {
						this.aBooleanArray10 = new boolean[4];
					}
					this.aClass3_Sub7_Sub3_3 = local188.S(this.aClass3_Sub7_Sub3_3);
					Static242.method3819(this.aClass3_Sub7_Sub3_3, this.aByte29, this.aClass25_Sub2_1.anInt8476, this.aClass25_Sub2_1.anInt8482, this.aBooleanArray10);
					this.anInt3284 = local11.anInt5827;
					this.anInt3288 = this.anInt3289;
				}
				this.anInt3290 = local188.J();
				this.anInt3287 = local188.RA();
			}
			this.aClass52_3 = null;
		} else if (this.aClass52_3 != null && (arg3 & this.aClass52_3.PA()) == arg3 && local11.anInt5827 == this.anInt3283) {
			local188 = this.aClass52_3;
		} else {
			if (this.aClass52_3 != null) {
				arg3 |= this.aClass52_3.PA();
			}
			@Pc(269) Class277 local269 = local11.method4695(this.aClass25_Sub2_1.anInt8476, local157, arg0, arg3, local173, this.anInt3285 == 11 ? this.anInt3279 + 4 : this.anInt3279, arg2, local157.method7860(this.aClass25_Sub2_1.anInt8482, this.aClass25_Sub2_1.anInt8476), this.anInt3285 == 11 ? 10 : this.anInt3285, this.aClass25_Sub2_1.anInt8482);
			if (local269 == null) {
				this.aBooleanArray10 = null;
				this.anInt3290 = 0;
				this.aClass3_Sub7_Sub3_3 = null;
				this.anInt3287 = 0;
				this.aClass52_3 = null;
			} else {
				local188 = local269.aClass52_7;
				this.aClass52_3 = local269.aClass52_7;
				if (arg2) {
					this.aBooleanArray10 = null;
					this.aClass3_Sub7_Sub3_3 = local269.aClass3_Sub7_Sub3_6;
					Static242.method3819(this.aClass3_Sub7_Sub3_3, this.aByte29, this.aClass25_Sub2_1.anInt8476, this.aClass25_Sub2_1.anInt8482, null);
					this.anInt3284 = local11.anInt5827;
					this.anInt3288 = -1;
				}
				this.anInt3290 = local188.J();
				this.anInt3287 = local188.RA();
			}
		}
		this.anInt3283 = local11.anInt5827;
		return local188;
	}

	@OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass25_Sub7_2 != null) {
			this.aClass25_Sub7_2.method3778();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!r;)V")
	public void method2661(@OriginalArg(1) Class31 arg0) {
		this.method2660(arg0, true, true, 262144);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!pn;)V")
	private void method2662(@OriginalArg(1) Class25_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass270_2 == null) {
				if (this.aBoolean233) {
					return;
				}
				this.method2658(-1);
				if (this.aClass270_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static397.anInt6998 - this.anInt3275;
			if (local32 > 100 && this.aClass270_2.anInt7683 > 0) {
				@Pc(49) int local49 = this.aClass270_2.anIntArray443.length - this.aClass270_2.anInt7683;
				while (this.anInt3289 < local49 && this.aClass270_2.anIntArray445[this.anInt3289] < local32) {
					local32 -= this.aClass270_2.anIntArray445[this.anInt3289];
					this.anInt3289++;
				}
				if (this.anInt3289 >= local49) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local49; local94 < this.aClass270_2.anIntArray443.length; local94++) {
						local92 += this.aClass270_2.anIntArray445[local94];
					}
					local32 %= local92;
				}
				this.anInt3270 = this.anInt3289 + 1;
				if (this.anInt3270 >= this.aClass270_2.anIntArray443.length) {
					this.anInt3270 -= this.aClass270_2.anInt7683;
					if (this.anInt3270 < 0 || this.aClass270_2.anIntArray443.length <= this.anInt3270) {
						this.anInt3270 = -1;
					}
				}
			}
			while (this.aClass270_2.anIntArray445[this.anInt3289] < local32) {
				Static217.method3600(this.anInt3289, arg0, this.aClass270_2);
				local32 -= this.aClass270_2.anIntArray445[this.anInt3289];
				this.anInt3289++;
				if (this.anInt3289 >= this.aClass270_2.anIntArray443.length) {
					this.anInt3289 -= this.aClass270_2.anInt7683;
					if (this.anInt3289 < 0 || this.anInt3289 >= this.aClass270_2.anIntArray443.length) {
						this.aClass270_2 = null;
						continue label80;
					}
				}
				this.anInt3270 = this.anInt3289 + 1;
				if (this.anInt3270 >= this.aClass270_2.anIntArray443.length) {
					this.anInt3270 -= this.aClass270_2.anInt7683;
					if (this.anInt3270 < 0 || this.anInt3270 >= this.aClass270_2.anIntArray443.length) {
						this.anInt3270 = -1;
					}
				}
			}
			this.anInt3269 = local32;
			this.anInt3275 = Static397.anInt6998 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public int method2664(@OriginalArg(0) int arg0) {
		if (arg0 != 30556) {
			this.aClass25_Sub7_2 = null;
		}
		return this.anInt3287;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(BLclient!r;)V")
	public void method2665(@OriginalArg(1) Class31 arg0) {
		if (this.aClass3_Sub7_Sub3_3 != null) {
			Static293.method4410(this.aClass3_Sub7_Sub3_3, this.aByte29, this.aClass25_Sub2_1.anInt8476, this.aClass25_Sub2_1.anInt8482, this.aBooleanArray10);
			this.aClass3_Sub7_Sub3_3 = null;
			this.aBooleanArray10 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
	public int method2667() {
		return this.anInt3290;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Z")
	public boolean method2670() {
		return this.aBoolean232;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public void method2671(@OriginalArg(1) int arg0) {
		this.aBoolean233 = true;
		this.method2658(arg0);
	}
}
