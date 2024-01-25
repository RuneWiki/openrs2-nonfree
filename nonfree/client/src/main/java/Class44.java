import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class44 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Lclient!fq;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_1;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!ns;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!hn;")
	public Class41_Sub3 aClass41_Sub3_3;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	private int anInt1091;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "Lclient!pp;")
	private Class185 aClass185_1;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "[Z")
	private boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "I")
	private int anInt1097;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	private int anInt1075 = -32768;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	private int anInt1098 = -1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	private int anInt1082 = -1;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	public final int anInt1094;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public final int anInt1092;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "I")
	private int anInt1085;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "Z")
	private final boolean aBoolean96;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIIZI)V")
	public Class44(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt1095 = arg6;
		this.anInt1093 = arg2;
		this.aByte12 = (byte) arg4;
		this.aBoolean94 = arg8;
		this.anInt1094 = arg3;
		this.anInt1092 = arg1.anInt5911;
		this.anInt1085 = arg7;
		this.aByte11 = (byte) arg5;
		this.aBoolean96 = arg0.method5394() && arg1.aBoolean553 && !this.aBoolean94;
		if (arg9 != -1) {
			this.aBoolean95 = true;
		}
		this.method855(arg9);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	private void method855(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class236 local18 = Static54.aClass153_1.method3081(this.anInt1092);
			@Pc(20) Class236 local20 = local18;
			if (local18.anIntArray706 != null) {
				local18 = local18.method5074(Static230.aClass72_3);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray709 != null) {
				if (this.aClass185_1 != null && local18.method5081(this.aClass185_1.anInt4803)) {
					return;
				}
				local7 = local18.method5087();
				if (this.anInt1098 != local18.anInt5911) {
					local9 = local18.aBoolean550;
				}
			} else if (local18.anInt5902 == -1) {
				if (local20 != null && local20.anIntArray709 != null) {
					if (this.aClass185_1 != null && local20.method5081(this.aClass185_1.anInt4803)) {
						return;
					}
					local7 = local20.method5087();
					if (this.anInt1098 != local20.anInt5911) {
						local9 = local20.aBoolean550;
					}
				} else if (local20 != null && local20.anInt5902 != -1 && this.anInt1098 != local20.anInt5911) {
					local7 = local20.anInt5902;
					local9 = local20.aBoolean550;
				}
			} else if (local18.anInt5911 != this.anInt1098) {
				local9 = local18.aBoolean550;
				local7 = local18.anInt5902;
			}
		}
		if (local7 == -1) {
			this.aClass185_1 = null;
			return;
		}
		this.aClass22_1 = null;
		if (this.aClass185_1 == null || local7 != this.aClass185_1.anInt4803) {
			this.aClass185_1 = Static25.aClass67_1.method1227(local7);
		} else if (this.aClass185_1.anInt4802 == 0) {
			return;
		}
		if (this.aClass185_1.anIntArray579 == null) {
			this.aClass185_1 = null;
			return;
		}
		if (local9) {
			this.anInt1078 = (int) ((double) this.aClass185_1.anIntArray579.length * Math.random());
			this.anInt1091 = (int) ((double) this.aClass185_1.anIntArray582[this.anInt1078] * Math.random()) + 1;
		} else {
			this.anInt1078 = 0;
			this.anInt1091 = 1;
		}
		this.anInt1097 = this.anInt1078 + 1;
		if (this.anInt1097 < 0 || this.anInt1097 >= this.aClass185_1.anIntArray579.length) {
			this.anInt1097 = -1;
		}
		this.anInt1079 = Static366.anInt5883 - this.anInt1091;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!tq;)V")
	public void method856(@OriginalArg(1) Class164 arg0) {
		if (this.aClass1_Sub6_Sub5_1 != null) {
			Static331.method4786(this.aClass1_Sub6_Sub5_1, this.aByte11, this.anInt1095, this.anInt1085, this.aBooleanArray5);
			this.aBooleanArray5 = null;
			this.aClass1_Sub6_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!tq;Lclient!ns;IIIIZI)V")
	public void method857(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) Class197[] local6 = arg1.method1591();
		@Pc(9) Class12[] local9 = arg1.method1589();
		if ((this.aClass41_Sub3_3 == null || this.aClass41_Sub3_3.aBoolean226) && (local6 != null || local9 != null)) {
			@Pc(26) Class236 local26 = Static54.aClass153_1.method3081(this.anInt1092);
			if (local26.anIntArray706 != null) {
				local26 = local26.method5074(Static230.aClass72_3);
			}
			if (local26 != null) {
				this.aClass41_Sub3_3 = new Class41_Sub3(Static366.anInt5883);
			}
		}
		if (this.aClass41_Sub3_3 == null) {
			return;
		}
		if (arg6) {
			this.aClass41_Sub3_3.method2150(arg0, (long) Static366.anInt5883, local6, local9);
		} else {
			this.aClass41_Sub3_3.method2148((long) Static366.anInt5883);
		}
		this.aClass41_Sub3_3.method2147(this.aByte12, arg3, arg5, arg2, arg4);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)V")
	public void method858(@OriginalArg(1) int arg0) {
		this.aBoolean95 = true;
		this.method855(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	private void method860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass185_1 == null) {
				if (this.aBoolean95) {
					return;
				}
				this.method855(-1);
				if (this.aClass185_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static366.anInt5883 - this.anInt1079;
			if (local34 > 100 && this.aClass185_1.anInt4801 > 0) {
				@Pc(53) int local53 = this.aClass185_1.anIntArray579.length - this.aClass185_1.anInt4801;
				while (this.anInt1078 < local53 && this.aClass185_1.anIntArray582[this.anInt1078] < local34) {
					local34 -= this.aClass185_1.anIntArray582[this.anInt1078];
					this.anInt1078++;
				}
				if (local53 <= this.anInt1078) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass185_1.anIntArray579.length; local94++) {
						local92 += this.aClass185_1.anIntArray582[local94];
					}
					local34 %= local92;
				}
				this.anInt1097 = this.anInt1078 + 1;
				if (this.anInt1097 >= this.aClass185_1.anIntArray579.length) {
					this.anInt1097 -= this.aClass185_1.anInt4801;
					if (this.anInt1097 < 0 || this.anInt1097 >= this.aClass185_1.anIntArray579.length) {
						this.anInt1097 = -1;
					}
				}
			}
			while (local34 > this.aClass185_1.anIntArray582[this.anInt1078]) {
				Static4.method52(this.anInt1078, arg0, false, this.aByte12, this.aClass185_1, arg1);
				local34 -= this.aClass185_1.anIntArray582[this.anInt1078];
				this.anInt1078++;
				if (this.anInt1078 >= this.aClass185_1.anIntArray579.length) {
					this.anInt1078 -= this.aClass185_1.anInt4801;
					if (this.anInt1078 < 0 || this.anInt1078 >= this.aClass185_1.anIntArray579.length) {
						this.aClass185_1 = null;
						continue label80;
					}
				}
				this.anInt1097 = this.anInt1078 + 1;
				if (this.aClass185_1.anIntArray579.length <= this.anInt1097) {
					this.anInt1097 -= this.aClass185_1.anInt4801;
					if (this.anInt1097 < 0 || this.anInt1097 >= this.aClass185_1.anIntArray579.length) {
						this.anInt1097 = -1;
					}
				}
			}
			this.anInt1091 = local34;
			this.anInt1079 = Static366.anInt5883 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLclient!tq;)V")
	public void method861(@OriginalArg(1) Class164 arg0) {
		this.method862(true, this.anInt1085, arg0, true, this.anInt1095, 131072);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZILclient!tq;IZII)Lclient!ns;")
	public Class22 method862(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class164 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class236 local11 = Static54.aClass153_1.method3081(this.anInt1092);
		if (local11.anIntArray706 != null) {
			local11 = local11.method5074(Static230.aClass72_3);
		}
		if (local11 == null) {
			this.method856(arg2);
			this.anInt1098 = -1;
			this.anInt1082 = this.anInt1078;
			return null;
		}
		if (!this.aBoolean95 && this.anInt1098 != local11.anInt5911) {
			this.aClass22_1 = null;
			this.method855(-1);
		}
		this.method860(arg4, arg1);
		@Pc(70) boolean local70 = arg0 & this.aBoolean96 & Static188.aClass135_Sub1_1.anInt3384 != 0;
		@Pc(112) boolean local112 = local70 & (this.anInt1098 != local11.anInt5911 || (this.anInt1078 != this.anInt1082 || this.aClass185_1 != null && (this.aClass185_1.aBoolean467 || Static261.aBoolean446) && this.anInt1078 != this.anInt1097) && Static188.aClass135_Sub1_1.anInt3384 >= 2);
		if (arg3 && !local112) {
			this.anInt1098 = local11.anInt5911;
			this.anInt1082 = this.anInt1078;
			return null;
		}
		if (local112) {
			Static331.method4786(this.aClass1_Sub6_Sub5_1, this.aByte11, this.anInt1095, this.anInt1085, this.aBooleanArray5);
		}
		@Pc(150) Class42 local150 = Static229.aClass42Array3[this.aByte11];
		@Pc(157) Class42 local157;
		if (this.aBoolean94) {
			local157 = Static239.aClass42Array4[0];
		} else {
			local157 = this.aByte11 >= 3 ? null : Static229.aClass42Array3[this.aByte11 + 1];
		}
		@Pc(176) Class22 local176 = null;
		if (this.aClass185_1 != null) {
			if (local112) {
				arg5 |= 0x20000;
			}
			local176 = local11.method5082(this.anInt1091, this.anInt1085, this.anInt1095, local157, this.aClass185_1, arg5, this.anInt1093 == 11 ? 10 : this.anInt1093, local150.method3043(this.anInt1095, this.anInt1085), arg2, local150, this.anInt1097, this.anInt1093 == 11 ? this.anInt1094 + 4 : this.anInt1094, this.anInt1078);
			if (local176 == null) {
				this.aBooleanArray5 = null;
				this.aClass1_Sub6_Sub5_1 = null;
				this.anInt1075 = 0;
			} else {
				if (local112) {
					if (this.aBooleanArray5 == null) {
						this.aBooleanArray5 = new boolean[4];
					}
					this.aClass1_Sub6_Sub5_1 = local176.method1569(this.aClass1_Sub6_Sub5_1);
					Static148.method2206(this.aClass1_Sub6_Sub5_1, this.aByte11, arg4, arg1, this.aBooleanArray5);
				}
				this.anInt1075 = local176.method1561();
			}
			this.aClass22_1 = null;
		} else if (this.aClass22_1 != null && (arg5 & this.aClass22_1.method1563()) == arg5 && this.anInt1098 == local11.anInt5911) {
			local176 = this.aClass22_1;
		} else {
			if (this.aClass22_1 != null) {
				arg5 |= this.aClass22_1.method1563();
			}
			@Pc(346) Class201 local346 = local11.method5088(arg5, this.anInt1085, local150, this.anInt1095, arg2, this.anInt1093 == 11 ? 10 : this.anInt1093, local112, local157, this.anInt1093 == 11 ? this.anInt1094 + 4 : this.anInt1094, local150.method3043(this.anInt1095, this.anInt1085));
			if (local346 == null) {
				this.aClass22_1 = null;
				this.anInt1075 = 0;
				this.aClass1_Sub6_Sub5_1 = null;
				this.aBooleanArray5 = null;
			} else {
				local176 = local346.aClass22_4;
				this.aClass22_1 = local346.aClass22_4;
				if (local112) {
					this.aClass1_Sub6_Sub5_1 = local346.aClass1_Sub6_Sub5_4;
					this.aBooleanArray5 = null;
					Static148.method2206(this.aClass1_Sub6_Sub5_1, this.aByte11, arg4, arg1, null);
				}
				this.anInt1075 = local176.method1561();
			}
		}
		this.anInt1095 = arg4;
		this.anInt1082 = this.anInt1078;
		this.anInt1085 = arg1;
		this.anInt1098 = local11.anInt5911;
		return local176;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
	public boolean method863() {
		return this.aBoolean96;
	}

	@OriginalMember(owner = "client!co", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub3_3 != null) {
			this.aClass41_Sub3_3.method2140();
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
	public int method864() {
		return this.anInt1075;
	}
}
