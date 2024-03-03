import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class192 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[5];

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!gn;")
	private Class31 aClass31_7;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[Z")
	private boolean[] aBooleanArray49;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Lclient!nb;")
	private Class157 aClass157_2;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	private int anInt5411;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	private int anInt5419;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	private int anInt5429;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "Lclient!oh;")
	public Class12_Sub5 aClass12_Sub5_5;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_6;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	private int anInt5416 = -1;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	private int anInt5412 = -1;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	private int anInt5409 = -32768;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public final int anInt5421;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
	private int anInt5426;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public final int anInt5417;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	private int anInt5410;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public final int anInt5420;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIIIZI)V", line = 660)
	public Class192(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5421 = arg2;
		this.anInt5426 = arg7;
		this.aBoolean387 = arg8;
		this.aByte58 = (byte) arg5;
		this.aByte59 = (byte) arg4;
		this.anInt5417 = arg3;
		this.anInt5410 = arg6;
		this.anInt5420 = arg1.anInt1349;
		this.aBoolean386 = arg0.method2880() && arg1.aBoolean110 && !this.aBoolean387;
		if (arg9 != -1) {
			this.aBoolean385 = true;
		}
		this.method4933(arg9);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wm;I)V", line = 60)
	public void method4931(@OriginalArg(0) Class19 arg0) {
		this.method4942(true, true, arg0, 131072, this.anInt5426, this.anInt5410);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V", line = 90)
	private void method4933(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(22) Class41 local22 = Static334.aClass202_4.method5164(this.anInt5420);
			@Pc(24) Class41 local24 = local22;
			if (local22.anIntArray94 != null) {
				local22 = local22.method1535(Static199.aClass226_1);
			}
			if (local22 == null) {
				return;
			}
			if (local24 == local22) {
				local24 = null;
			}
			if (local22.anIntArray95 != null) {
				if (this.aClass157_2 != null && local22.method1533(this.aClass157_2.anInt4023)) {
					return;
				}
				local11 = local22.method1529();
				if (local22.anInt1349 != this.anInt5416) {
					local13 = local22.aBoolean119;
				}
			} else if (local22.anInt1325 == -1) {
				if (local24 != null && local24.anIntArray95 != null) {
					if (this.aClass157_2 != null && local24.method1533(this.aClass157_2.anInt4023)) {
						return;
					}
					local11 = local24.method1529();
					if (local24.anInt1349 != this.anInt5416) {
						local13 = local24.aBoolean119;
					}
				} else if (local24 != null && local24.anInt1325 != -1 && local24.anInt1349 != this.anInt5416) {
					local13 = local24.aBoolean119;
					local11 = local24.anInt1325;
				}
			} else if (local22.anInt1349 != this.anInt5416) {
				local11 = local22.anInt1325;
				local13 = local22.aBoolean119;
			}
		}
		if (local11 == -1) {
			this.aClass157_2 = null;
			return;
		}
		this.aClass31_7 = null;
		if (this.aClass157_2 == null || local11 != this.aClass157_2.anInt4023) {
			this.aClass157_2 = Static37.aClass85_1.method2373(local11);
		} else if (this.aClass157_2.anInt4017 == 0) {
			return;
		}
		if (this.aClass157_2.anIntArray262 == null) {
			this.aClass157_2 = null;
			return;
		}
		if (local13) {
			this.anInt5414 = (int) ((double) this.aClass157_2.anIntArray262.length * Math.random());
			this.anInt5419 = (int) ((double) this.aClass157_2.anIntArray261[this.anInt5414] * Math.random()) + 1;
		} else {
			this.anInt5414 = 0;
			this.anInt5419 = 1;
		}
		this.anInt5411 = this.anInt5414 + 1;
		if (this.anInt5411 < 0 || this.anInt5411 >= this.aClass157_2.anIntArray262.length) {
			this.anInt5411 = -1;
		}
		this.anInt5429 = Class83.anInt2345 - this.anInt5419;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)V", line = 212)
	private void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass157_2 == null) {
				if (this.aBoolean385) {
					return;
				}
				this.method4933(-1);
				if (this.aClass157_2 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Class83.anInt2345 - this.anInt5429;
			if (local31 > 100 && this.aClass157_2.anInt4027 > 0) {
				@Pc(53) int local53 = this.aClass157_2.anIntArray262.length - this.aClass157_2.anInt4027;
				while (this.anInt5414 < local53 && this.aClass157_2.anIntArray261[this.anInt5414] < local31) {
					local31 -= this.aClass157_2.anIntArray261[this.anInt5414];
					this.anInt5414++;
				}
				if (this.anInt5414 >= local53) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local53; local94 < this.aClass157_2.anIntArray262.length; local94++) {
						local92 += this.aClass157_2.anIntArray261[local94];
					}
					local31 %= local92;
				}
				this.anInt5411 = this.anInt5414 + 1;
				if (this.anInt5411 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5411 -= this.aClass157_2.anInt4027;
					if (this.anInt5411 < 0 || this.anInt5411 >= this.aClass157_2.anIntArray262.length) {
						this.anInt5411 = -1;
					}
				}
			}
			while (this.aClass157_2.anIntArray261[this.anInt5414] < local31) {
				Static1.method4(this.aClass157_2, false, this.aByte59, arg0, arg1, this.anInt5414);
				local31 -= this.aClass157_2.anIntArray261[this.anInt5414];
				this.anInt5414++;
				if (this.anInt5414 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5414 -= this.aClass157_2.anInt4027;
					if (this.anInt5414 < 0 || this.anInt5414 >= this.aClass157_2.anIntArray262.length) {
						this.aClass157_2 = null;
						continue label80;
					}
				}
				this.anInt5411 = this.anInt5414 + 1;
				if (this.anInt5411 >= this.aClass157_2.anIntArray262.length) {
					this.anInt5411 -= this.aClass157_2.anInt4027;
					if (this.anInt5411 < 0 || this.aClass157_2.anIntArray262.length <= this.anInt5411) {
						this.anInt5411 = -1;
					}
				}
			}
			this.anInt5419 = local31;
			this.anInt5429 = Class83.anInt2345 - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 311)
	public void method4935(@OriginalArg(1) int arg0) {
		this.aBoolean385 = true;
		this.method4933(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wm;ILclient!gn;IIZBI)V", line = 322)
	public void method4936(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class114[] local6 = arg2.method3809();
		@Pc(9) Class163[] local9 = arg2.method3841();
		if ((this.aClass12_Sub5_5 == null || this.aClass12_Sub5_5.aBoolean322) && (local6 != null || local9 != null)) {
			@Pc(26) Class41 local26 = Static334.aClass202_4.method5164(this.anInt5420);
			if (local26.anIntArray94 != null) {
				local26 = local26.method1535(Static199.aClass226_1);
			}
			if (local26 != null) {
				this.aClass12_Sub5_5 = new Class12_Sub5(Class83.anInt2345);
			}
		}
		if (this.aClass12_Sub5_5 == null) {
			return;
		}
		if (arg5) {
			this.aClass12_Sub5_5.method4358(arg0, (long) Class83.anInt2345, local6, local9);
		} else {
			this.aClass12_Sub5_5.method4356((long) Class83.anInt2345);
		}
		this.aClass12_Sub5_5.method4362(this.aByte59, arg3, arg6, arg1, arg4);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I", line = 368)
	public int method4937() {
		return this.anInt5409;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z", line = 402)
	public boolean method4939() {
		return this.aBoolean386;
	}

	@OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V", line = 485)
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_5 != null) {
			this.aClass12_Sub5_5.method4355();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!wm;)V", line = 500)
	public void method4941(@OriginalArg(1) Class19 arg0) {
		if (this.aClass2_Sub2_Sub4_6 != null) {
			Static145.method2782(this.aClass2_Sub2_Sub4_6, this.aByte58, this.anInt5410, this.anInt5426, this.aBooleanArray49);
			this.aClass2_Sub2_Sub4_6 = null;
			this.aBooleanArray49 = null;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZLclient!wm;IIIB)Lclient!gn;", line = 529)
	public Class31 method4942(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) Class41 local11 = Static334.aClass202_4.method5164(this.anInt5420);
		if (local11.anIntArray94 != null) {
			local11 = local11.method1535(Static199.aClass226_1);
		}
		if (local11 == null) {
			this.method4941(arg2);
			this.anInt5416 = -1;
			this.anInt5412 = this.anInt5414;
			return null;
		}
		if (!this.aBoolean385 && this.anInt5416 != local11.anInt1349) {
			this.aClass31_7 = null;
			this.method4933(-1);
		}
		this.method4934(arg5, arg4);
		@Pc(79) boolean local79 = arg0 & this.aBoolean386 & Static203.aClass177_Sub1_2.anInt4876 != 0;
		@Pc(117) boolean local117 = local79 & (local11.anInt1349 != this.anInt5416 || (this.anInt5412 != this.anInt5414 || this.aClass157_2 != null && (this.aClass157_2.aBoolean262 || Class213.aBoolean408) && this.anInt5411 != this.anInt5414) && Static203.aClass177_Sub1_2.anInt4876 >= 2);
		if (arg1 && !local117) {
			this.anInt5416 = local11.anInt1349;
			this.anInt5412 = this.anInt5414;
			return null;
		}
		if (local117) {
			Static145.method2782(this.aClass2_Sub2_Sub4_6, this.aByte58, this.anInt5410, this.anInt5426, this.aBooleanArray49);
		}
		@Pc(149) Class6 local149 = Static340.aClass6Array4[this.aByte58];
		@Pc(167) Class6 local167;
		if (this.aBoolean387) {
			local167 = Static307.aClass6Array3[0];
		} else {
			local167 = this.aByte58 < 3 ? Static340.aClass6Array4[this.aByte58 + 1] : null;
		}
		@Pc(175) Class31 local175 = null;
		if (this.aClass157_2 != null) {
			if (local117) {
				arg3 |= 0x20000;
			}
			local175 = local11.method1520(this.anInt5411, this.anInt5419, local149, this.anInt5421 == 11 ? 10 : this.anInt5421, this.aClass157_2, this.anInt5421 == 11 ? this.anInt5417 + 4 : this.anInt5417, arg2, this.anInt5414, local167, local149.method5729(this.anInt5410, this.anInt5426), this.anInt5410, this.anInt5426, arg3);
			if (local175 == null) {
				this.anInt5409 = 0;
				this.aBooleanArray49 = null;
				this.aClass2_Sub2_Sub4_6 = null;
			} else {
				if (local117) {
					if (this.aBooleanArray49 == null) {
						this.aBooleanArray49 = new boolean[4];
					}
					this.aClass2_Sub2_Sub4_6 = local175.method3840(this.aClass2_Sub2_Sub4_6);
					Static53.method1621(this.aClass2_Sub2_Sub4_6, this.aByte58, arg5, arg4, this.aBooleanArray49);
				}
				this.anInt5409 = local175.method3803();
			}
			this.aClass31_7 = null;
		} else if (this.aClass31_7 != null && arg3 == (arg3 & this.aClass31_7.method3828()) && this.anInt5416 == local11.anInt1349) {
			local175 = this.aClass31_7;
		} else {
			if (this.aClass31_7 != null) {
				arg3 |= this.aClass31_7.method3828();
			}
			@Pc(247) Class105 local247 = local11.method1521(local149.method5729(this.anInt5410, this.anInt5426), local149, this.anInt5421 == 11 ? this.anInt5417 + 4 : this.anInt5417, this.anInt5426, this.anInt5410, arg3, local117, arg2, local167, this.anInt5421 == 11 ? 10 : this.anInt5421);
			if (local247 == null) {
				this.aClass2_Sub2_Sub4_6 = null;
				this.anInt5409 = 0;
				this.aBooleanArray49 = null;
				this.aClass31_7 = null;
			} else {
				local175 = local247.aClass31_3;
				this.aClass31_7 = local247.aClass31_3;
				if (local117) {
					this.aBooleanArray49 = null;
					this.aClass2_Sub2_Sub4_6 = local247.aClass2_Sub2_Sub4_3;
					Static53.method1621(this.aClass2_Sub2_Sub4_6, this.aByte58, arg5, arg4, null);
				}
				this.anInt5409 = local175.method3803();
			}
		}
		this.anInt5416 = local11.anInt1349;
		this.anInt5426 = arg4;
		this.anInt5412 = this.anInt5414;
		this.anInt5410 = arg5;
		return local175;
	}
}
