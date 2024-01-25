import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class244 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
	private int anInt6134;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	private int anInt6135;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "Lclient!ha;")
	private Class2_Sub2_Sub8 aClass2_Sub2_Sub8_5;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "Lclient!kv;")
	public Class12_Sub4 aClass12_Sub4_4;

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!hq;")
	private Class148 aClass148_2;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "Lclient!da;")
	private Class33 aClass33_6;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	private int anInt6155;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
	private int anInt6138 = 0;

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	private int anInt6143 = 0;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
	private int anInt6137 = -1;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
	private int anInt6146 = -1;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	private int anInt6149 = -1;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "Lclient!caa;")
	private final Class12_Sub2 aClass12_Sub2_3;

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	public final int anInt6153;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
	public final int anInt6144;

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
	public final int anInt6157;

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!r;Lclient!lt;IIIILclient!caa;ZI)V")
	public Class244(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aClass12_Sub2_3 = arg6;
		this.anInt6153 = arg1.anInt5259;
		this.aByte81 = (byte) arg5;
		this.aBoolean480 = arg7;
		this.anInt6144 = arg2;
		this.aByte82 = (byte) arg4;
		this.anInt6157 = arg3;
		this.aBoolean482 = arg0.method6853() && arg1.aBoolean406 && !this.aBoolean480;
		if (arg8 != -1) {
			this.aBoolean481 = true;
		}
		this.method5145(arg8);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLclient!r;)V")
	public void method5142(@OriginalArg(1) Class162 arg0) {
		this.method5152(true, arg0, true, 262144);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I")
	public int method5143(@OriginalArg(0) byte arg0) {
		return arg0 == 108 ? this.anInt6138 : 29;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	public int method5144() {
		return this.anInt6143;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	private void method5145(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class216 local18 = Static362.aClass290_2.method5799(this.anInt6153);
			@Pc(20) Class216 local20 = local18;
			if (local18.anIntArray362 != null) {
				local18 = local18.method4560(Static426.aClass160_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray363 != null) {
				if (this.aClass148_2 != null && local18.method4556(this.aClass148_2.anInt3056)) {
					return;
				}
				local7 = local18.method4561();
				if (this.anInt6137 != local18.anInt5259) {
					local9 = local18.aBoolean402;
				}
			} else if (local18.anInt5255 == -1) {
				if (local20 != null && local20.anIntArray363 != null) {
					if (this.aClass148_2 != null && local20.method4556(this.aClass148_2.anInt3056)) {
						return;
					}
					local7 = local20.method4561();
					if (local20.anInt5259 != this.anInt6137) {
						local9 = local20.aBoolean402;
					}
				} else if (local20 != null && local20.anInt5255 != -1 && this.anInt6137 != local20.anInt5259) {
					local7 = local20.anInt5255;
					local9 = local20.aBoolean402;
				}
			} else if (local18.anInt5259 != this.anInt6137) {
				local7 = local18.anInt5255;
				local9 = local18.aBoolean402;
			}
		}
		if (local7 == -1) {
			this.aClass148_2 = null;
			return;
		}
		this.aClass33_6 = null;
		if (this.aClass148_2 == null || local7 != this.aClass148_2.anInt3056) {
			this.aClass148_2 = Static117.aClass18_1.method296(local7);
		} else if (this.aClass148_2.anInt3043 == 0) {
			return;
		}
		if (this.aClass148_2.anIntArray254 == null) {
			this.aClass148_2 = null;
			return;
		}
		if (local9) {
			this.anInt6152 = (int) (Math.random() * (double) this.aClass148_2.anIntArray254.length);
			this.anInt6134 = (int) ((double) this.aClass148_2.anIntArray253[this.anInt6152] * Math.random()) + 1;
		} else {
			this.anInt6134 = 1;
			this.anInt6152 = 0;
		}
		this.anInt6155 = this.anInt6152 + 1;
		if (this.anInt6155 < 0 || this.anInt6155 >= this.aClass148_2.anIntArray254.length) {
			this.anInt6155 = -1;
		}
		this.anInt6135 = Static532.anInt8757 - this.anInt6134;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!caa;Z)V")
	private void method5146(@OriginalArg(0) Class12_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass148_2 == null) {
				if (this.aBoolean481) {
					return;
				}
				this.method5145(-1);
				if (this.aClass148_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static532.anInt8757 - this.anInt6135;
			if (local30 > 100 && this.aClass148_2.anInt3045 > 0) {
				@Pc(51) int local51 = this.aClass148_2.anIntArray254.length - this.aClass148_2.anInt3045;
				while (this.anInt6152 < local51 && this.aClass148_2.anIntArray253[this.anInt6152] < local30) {
					local30 -= this.aClass148_2.anIntArray253[this.anInt6152];
					this.anInt6152++;
				}
				if (local51 <= this.anInt6152) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local51; local96 < this.aClass148_2.anIntArray254.length; local96++) {
						local94 += this.aClass148_2.anIntArray253[local96];
					}
					local30 %= local94;
				}
				this.anInt6155 = this.anInt6152 + 1;
				if (this.anInt6155 >= this.aClass148_2.anIntArray254.length) {
					this.anInt6155 -= this.aClass148_2.anInt3045;
					if (this.anInt6155 < 0 || this.anInt6155 >= this.aClass148_2.anIntArray254.length) {
						this.anInt6155 = -1;
					}
				}
			}
			while (this.aClass148_2.anIntArray253[this.anInt6152] < local30) {
				Static543.method7102(arg0, this.anInt6152, this.aClass148_2);
				local30 -= this.aClass148_2.anIntArray253[this.anInt6152];
				this.anInt6152++;
				if (this.anInt6152 >= this.aClass148_2.anIntArray254.length) {
					this.anInt6152 -= this.aClass148_2.anInt3045;
					if (this.anInt6152 < 0 || this.anInt6152 >= this.aClass148_2.anIntArray254.length) {
						this.aClass148_2 = null;
						continue label80;
					}
				}
				this.anInt6155 = this.anInt6152 + 1;
				if (this.aClass148_2.anIntArray254.length <= this.anInt6155) {
					this.anInt6155 -= this.aClass148_2.anInt3045;
					if (this.anInt6155 < 0 || this.aClass148_2.anIntArray254.length <= this.anInt6155) {
						this.anInt6155 = -1;
					}
				}
			}
			this.anInt6135 = Static532.anInt8757 - local30;
			this.anInt6134 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
	public boolean method5147() {
		return this.aBoolean482;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIILclient!r;ILclient!q;ZLclient!da;)V")
	public void method5149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class162 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class33 arg7) {
		@Pc(6) Class293[] local6 = arg7.method7196();
		@Pc(9) Class163[] local9 = arg7.method7191();
		if ((this.aClass12_Sub4_4 == null || this.aClass12_Sub4_4.aBoolean380) && (local6 != null || local9 != null)) {
			@Pc(26) Class216 local26 = Static362.aClass290_2.method5799(this.anInt6153);
			if (local26.anIntArray362 != null) {
				local26 = local26.method4560(Static426.aClass160_1);
			}
			if (local26 != null) {
				this.aClass12_Sub4_4 = Static291.method4138(Static532.anInt8757, true);
			}
		}
		if (this.aClass12_Sub4_4 == null) {
			return;
		}
		arg7.method7202(arg5);
		if (arg6) {
			this.aClass12_Sub4_4.method4128(arg3, (long) Static532.anInt8757, local6, local9);
		} else {
			this.aClass12_Sub4_4.method4131((long) Static532.anInt8757);
		}
		this.aClass12_Sub4_4.method4127(this.aByte82, arg1, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!r;)V")
	public void method5151(@OriginalArg(1) Class162 arg0) {
		if (this.aClass2_Sub2_Sub8_5 != null) {
			Static83.method1257(this.aClass2_Sub2_Sub8_5, this.aByte81, this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375, this.aBooleanArray22);
			this.aBooleanArray22 = null;
			this.aClass2_Sub2_Sub8_5 = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZLclient!r;ZI)Lclient!da;")
	public Class33 method5152(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class216 local11 = Static362.aClass290_2.method5799(this.anInt6153);
		if (local11.anIntArray362 != null) {
			local11 = local11.method4560(Static426.aClass160_1);
		}
		if (local11 == null) {
			this.method5151(arg1);
			this.anInt6137 = -1;
			this.anInt6149 = -1;
			this.anInt6146 = -1;
			return null;
		}
		if (!this.aBoolean481 && local11.anInt5259 != this.anInt6137) {
			this.aClass33_6 = null;
			this.method5145(-1);
		}
		this.method5146(this.aClass12_Sub2_3);
		if (arg0) {
			@Pc(78) boolean local78 = arg0 & this.aBoolean482 & Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) != 0;
			arg0 = local78 & (local11.anInt5259 != this.anInt6146 || this.aClass148_2 != null && Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) >= 2 && (this.anInt6152 != this.anInt6149 || (this.aClass148_2.aBoolean223 || Static269.aBoolean328) && this.anInt6155 != this.anInt6152));
		}
		if (arg2 && !arg0) {
			this.anInt6137 = local11.anInt5259;
			return null;
		}
		if (arg0) {
			Static83.method1257(this.aClass2_Sub2_Sub8_5, this.aByte81, this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375, this.aBooleanArray22);
			this.anInt6149 = -1;
			this.anInt6146 = -1;
		}
		@Pc(150) Class151 local150 = Static114.aClass151Array1[this.aByte81];
		@Pc(173) Class151 local173;
		if (this.aBoolean480) {
			local173 = Static261.aClass151Array2[0];
		} else {
			local173 = this.aByte81 < 3 ? Static114.aClass151Array1[this.aByte81 + 1] : null;
		}
		@Pc(181) Class33 local181 = null;
		if (this.aClass148_2 != null) {
			if (arg0) {
				arg3 |= 0x40000;
			}
			local181 = local11.method4557(local150, local150.method7680(this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375), this.aClass148_2, local173, this.aClass12_Sub2_3.anInt9374, arg1, this.anInt6155, this.aClass12_Sub2_3.anInt9375, this.anInt6152, this.anInt6144 == 11 ? 10 : this.anInt6144, this.anInt6144 == 11 ? this.anInt6157 + 4 : this.anInt6157, this.anInt6134, arg3);
			if (local181 == null) {
				this.anInt6143 = 0;
				this.aClass2_Sub2_Sub8_5 = null;
				this.anInt6138 = 0;
				this.aBooleanArray22 = null;
			} else {
				if (arg0) {
					if (this.aBooleanArray22 == null) {
						this.aBooleanArray22 = new boolean[4];
					}
					this.aClass2_Sub2_Sub8_5 = local181.S(this.aClass2_Sub2_Sub8_5);
					Static267.method7375(this.aClass2_Sub2_Sub8_5, this.aByte81, this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375, this.aBooleanArray22);
					this.anInt6146 = local11.anInt5259;
					this.anInt6149 = this.anInt6152;
				}
				this.anInt6143 = local181.J();
				this.anInt6138 = local181.RA();
			}
			this.aClass33_6 = null;
		} else if (this.aClass33_6 != null && arg3 == (arg3 & this.aClass33_6.PA()) && this.anInt6137 == local11.anInt5259) {
			local181 = this.aClass33_6;
		} else {
			if (this.aClass33_6 != null) {
				arg3 |= this.aClass33_6.PA();
			}
			@Pc(259) Class74 local259 = local11.method4553(this.anInt6144 == 11 ? this.anInt6157 + 4 : this.anInt6157, local150, arg3, local173, local150.method7680(this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375), this.anInt6144 == 11 ? 10 : this.anInt6144, this.aClass12_Sub2_3.anInt9375, arg0, arg1, this.aClass12_Sub2_3.anInt9374);
			if (local259 == null) {
				this.aClass33_6 = null;
				this.anInt6143 = 0;
				this.aClass2_Sub2_Sub8_5 = null;
				this.anInt6138 = 0;
				this.aBooleanArray22 = null;
			} else {
				local181 = local259.aClass33_1;
				this.aClass33_6 = local259.aClass33_1;
				if (arg0) {
					this.aClass2_Sub2_Sub8_5 = local259.aClass2_Sub2_Sub8_1;
					this.aBooleanArray22 = null;
					Static267.method7375(this.aClass2_Sub2_Sub8_5, this.aByte81, this.aClass12_Sub2_3.anInt9374, this.aClass12_Sub2_3.anInt9375, null);
					this.anInt6149 = -1;
					this.anInt6146 = local11.anInt5259;
				}
				this.anInt6143 = local181.J();
				this.anInt6138 = local181.RA();
			}
		}
		this.anInt6137 = local11.anInt5259;
		return local181;
	}

	@OriginalMember(owner = "client!nq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_4 != null) {
			this.aClass12_Sub4_4.method4126();
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	public void method5153(@OriginalArg(0) int arg0) {
		this.aBoolean481 = true;
		this.method5145(arg0);
	}
}
