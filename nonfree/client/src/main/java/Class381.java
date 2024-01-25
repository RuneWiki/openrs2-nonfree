import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class381 {

	@OriginalMember(owner = "client!vw", name = "B", descriptor = "[I")
	public static final int[] anIntArray644 = new int[32];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "Lclient!f;")
	public Class23_Sub5 aClass23_Sub5_7;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
	private int anInt10030;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "[Z")
	private boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "Lclient!ka;")
	private Class28 aClass28_7;

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
	private int anInt10039;

	@OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
	private int anInt10041;

	@OriginalMember(owner = "client!vw", name = "w", descriptor = "Lclient!c;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!vw", name = "A", descriptor = "Lclient!r;")
	private Class3_Sub6_Sub12 aClass3_Sub6_Sub12_6;

	@OriginalMember(owner = "client!vw", name = "C", descriptor = "Lclient!dja;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!vw", name = "H", descriptor = "I")
	private int anInt10046;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
	private int anInt10031 = 0;

	@OriginalMember(owner = "client!vw", name = "z", descriptor = "Z")
	private boolean aBoolean741 = false;

	@OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
	private int anInt10042 = 0;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
	private int anInt10034 = -1;

	@OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
	private int anInt10048 = -1;

	@OriginalMember(owner = "client!vw", name = "K", descriptor = "Z")
	private boolean aBoolean742 = false;

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
	private int anInt10040 = -1;

	@OriginalMember(owner = "client!vw", name = "y", descriptor = "Lclient!cn;")
	private final Class23_Sub2 aClass23_Sub2_22;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	public final int anInt10036;

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "B")
	private final byte aByte141;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "B")
	private final byte aByte140;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
	public final int anInt10037;

	@OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
	public final int anInt10049;

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "Z")
	private final boolean aBoolean740;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray644[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIILclient!cn;ZI)V")
	public Class381(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class23_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aClass23_Sub2_22 = arg6;
		this.anInt10036 = arg1.anInt4778;
		this.aByte141 = (byte) arg5;
		this.aByte140 = (byte) arg4;
		this.aBoolean741 = arg7;
		this.anInt10037 = arg2;
		this.anInt10049 = arg3;
		this.aBoolean740 = arg0.method8120() && arg1.aBoolean393 && !this.aBoolean741;
		if (arg8 != -1) {
			this.aBoolean742 = true;
		}
		this.method8542(arg8);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ha;Lclient!ka;Lclient!sk;ZIIIZ)V")
	public void method8531(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(12) Class261[] local12 = arg2.method6912();
		@Pc(15) Class298[] local15 = arg2.method6911();
		if ((this.aClass23_Sub5_7 == null || this.aClass23_Sub5_7.aBoolean225) && (local12 != null || local15 != null)) {
			@Pc(32) Class178 local32 = Static349.aClass374_2.method8357(this.anInt10036);
			if (local32.anIntArray313 != null) {
				local32 = local32.method4012(Static592.aClass47_2);
			}
			if (local32 != null) {
				this.aClass23_Sub5_7 = Static150.method2583(Static621.anInt9665, true);
			}
		}
		if (this.aClass23_Sub5_7 == null) {
			return;
		}
		arg2.method6888(arg3);
		if (arg4) {
			this.aClass23_Sub5_7.method2593(arg1, (long) Static621.anInt9665, local12, local15);
		} else {
			this.aClass23_Sub5_7.method2589((long) Static621.anInt9665);
		}
		this.aClass23_Sub5_7.method2591(this.aByte140, arg7, arg0, arg6, arg5);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BLclient!ha;)V")
	public void method8532(@OriginalArg(1) Class16 arg0) {
		if (this.aClass3_Sub6_Sub12_6 != null) {
			Static517.method7339(this.aClass3_Sub6_Sub12_6, this.aByte141, this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109, this.aBooleanArray28);
			this.aBooleanArray28 = null;
			this.aClass3_Sub6_Sub12_6 = null;
		}
	}

	@OriginalMember(owner = "client!vw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub5_7 != null) {
			this.aClass23_Sub5_7.method2579();
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!dja;)V")
	public void method8533(@OriginalArg(1) Class81 arg0) {
		this.aClass28_7 = null;
		this.aClass81_2 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method8534(@OriginalArg(0) Class16 arg0) {
		this.method8541(arg0, true, true, 262144);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!cn;)V")
	private void method8535(@OriginalArg(1) Class23_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass48_3 == null) {
				if (this.aBoolean742) {
					return;
				}
				this.method8542(-1);
				if (this.aClass48_3 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static621.anInt9665 - this.anInt10046;
			if (local34 > 100 && this.aClass48_3.anInt1548 > 0) {
				@Pc(53) int local53 = this.aClass48_3.anIntArray72.length - this.aClass48_3.anInt1548;
				while (local53 > this.anInt10041 && local34 > this.aClass48_3.anIntArray68[this.anInt10041]) {
					local34 -= this.aClass48_3.anIntArray68[this.anInt10041];
					this.anInt10041++;
				}
				if (local53 <= this.anInt10041) {
					@Pc(88) int local88 = 0;
					for (@Pc(90) int local90 = local53; local90 < this.aClass48_3.anIntArray72.length; local90++) {
						local88 += this.aClass48_3.anIntArray68[local90];
					}
					local34 %= local88;
				}
				this.anInt10030 = this.anInt10041 + 1;
				if (this.anInt10030 >= this.aClass48_3.anIntArray72.length) {
					this.anInt10030 -= this.aClass48_3.anInt1548;
					if (this.anInt10030 < 0 || this.aClass48_3.anIntArray72.length <= this.anInt10030) {
						this.anInt10030 = -1;
					}
				}
			}
			while (this.aClass48_3.anIntArray68[this.anInt10041] < local34) {
				Static4.method49(arg0, this.aClass48_3, this.anInt10041);
				local34 -= this.aClass48_3.anIntArray68[this.anInt10041];
				this.anInt10041++;
				if (this.aClass48_3.anIntArray72.length <= this.anInt10041) {
					this.anInt10041 -= this.aClass48_3.anInt1548;
					if (this.anInt10041 < 0 || this.aClass48_3.anIntArray72.length <= this.anInt10041) {
						this.aClass48_3 = null;
						continue label80;
					}
				}
				this.anInt10030 = this.anInt10041 + 1;
				if (this.anInt10030 >= this.aClass48_3.anIntArray72.length) {
					this.anInt10030 -= this.aClass48_3.anInt1548;
					if (this.anInt10030 < 0 || this.anInt10030 >= this.aClass48_3.anIntArray72.length) {
						this.anInt10030 = -1;
					}
				}
			}
			this.anInt10039 = local34;
			this.anInt10046 = Static621.anInt9665 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)I")
	public int method8536() {
		return this.anInt10042;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)I")
	public int method8537(@OriginalArg(0) int arg0) {
		return arg0 == 3162 ? this.anInt10031 : -29;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Z")
	public boolean method8539() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)V")
	public void method8540(@OriginalArg(1) int arg0) {
		this.aBoolean742 = true;
		this.method8542(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ha;ZIZI)Lclient!ka;")
	public Class28 method8541(@OriginalArg(0) Class16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class178 local18 = Static349.aClass374_2.method8357(this.anInt10036);
		if (local18.anIntArray313 != null) {
			local18 = local18.method4012(Static592.aClass47_2);
		}
		if (local18 == null) {
			this.method8532(arg0);
			this.anInt10040 = -1;
			this.anInt10034 = -1;
			this.anInt10048 = -1;
			return null;
		}
		if (!this.aBoolean742 && local18.anInt4778 != this.anInt10034) {
			this.aClass28_7 = null;
			this.method8542(-1);
		}
		this.method8535(this.aClass23_Sub2_22);
		if (arg1) {
			@Pc(83) boolean local83 = arg1 & this.aBoolean740 & Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() != 0;
			arg1 = local83 & (local18.anInt4778 != this.anInt10040 || this.aClass48_3 != null && Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() >= 2 && (this.anInt10041 != this.anInt10048 || (this.aClass48_3.aBoolean140 || Static296.aBoolean620) && this.anInt10041 != this.anInt10030));
		}
		if (arg2 && !arg1) {
			this.anInt10034 = local18.anInt4778;
			return null;
		}
		if (arg1) {
			Static517.method7339(this.aClass3_Sub6_Sub12_6, this.aByte141, this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109, this.aBooleanArray28);
			this.anInt10048 = -1;
			this.anInt10040 = -1;
		}
		@Pc(163) Class104 local163 = Static343.aClass104Array2[this.aByte141];
		@Pc(170) Class104 local170;
		if (this.aBoolean741) {
			local170 = Static239.aClass104Array1[0];
		} else {
			local170 = this.aByte141 >= 3 ? null : Static343.aClass104Array2[this.aByte141 + 1];
		}
		@Pc(189) Class28 local189 = null;
		if (this.aClass48_3 != null) {
			if (arg1) {
				arg3 |= 0x40000;
			}
			local189 = local18.method4010(this.aClass81_2, this.anInt10041, local170, local163.method8286(this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109), this.aClass48_3, local163, this.aClass23_Sub2_22.anInt10108, this.anInt10030, this.anInt10037 == 11 ? this.anInt10049 + 4 : this.anInt10049, this.anInt10039, this.anInt10037 == 11 ? 10 : this.anInt10037, arg3, this.aClass23_Sub2_22.anInt10109, arg0);
			if (local189 == null) {
				this.anInt10042 = 0;
				this.aBooleanArray28 = null;
				this.aClass3_Sub6_Sub12_6 = null;
				this.anInt10031 = 0;
			} else {
				if (arg1) {
					if (this.aBooleanArray28 == null) {
						this.aBooleanArray28 = new boolean[4];
					}
					this.aClass3_Sub6_Sub12_6 = local189.ba(this.aClass3_Sub6_Sub12_6);
					Static267.method4227(this.aClass3_Sub6_Sub12_6, this.aByte141, this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109, this.aBooleanArray28);
					this.anInt10048 = this.anInt10041;
					this.anInt10040 = local18.anInt4778;
				}
				this.anInt10042 = local189.fa();
				this.anInt10031 = local189.ma();
			}
			this.aClass28_7 = null;
		} else if (this.aClass28_7 != null && arg3 == (arg3 & this.aClass28_7.ua()) && local18.anInt4778 == this.anInt10034) {
			local189 = this.aClass28_7;
		} else {
			if (this.aClass28_7 != null) {
				arg3 |= this.aClass28_7.ua();
			}
			@Pc(397) Class50 local397 = local18.method4011(this.anInt10037 == 11 ? 10 : this.anInt10037, this.aClass23_Sub2_22.anInt10109, arg3, arg1, arg0, local163.method8286(this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109), this.anInt10037 == 11 ? this.anInt10049 + 4 : this.anInt10049, local170, local163, this.aClass81_2, this.aClass23_Sub2_22.anInt10108);
			if (local397 == null) {
				this.anInt10042 = 0;
				this.anInt10031 = 0;
				this.aBooleanArray28 = null;
				this.aClass28_7 = null;
				this.aClass3_Sub6_Sub12_6 = null;
			} else {
				local189 = local397.aClass28_2;
				this.aClass28_7 = local397.aClass28_2;
				if (arg1) {
					this.aBooleanArray28 = null;
					this.aClass3_Sub6_Sub12_6 = local397.aClass3_Sub6_Sub12_1;
					Static267.method4227(this.aClass3_Sub6_Sub12_6, this.aByte141, this.aClass23_Sub2_22.anInt10108, this.aClass23_Sub2_22.anInt10109, (boolean[]) null);
					this.anInt10048 = -1;
					this.anInt10040 = local18.anInt4778;
				}
				this.anInt10042 = local189.fa();
				this.anInt10031 = local189.ma();
			}
		}
		this.anInt10034 = local18.anInt4778;
		return local189;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
	private void method8542(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class178 local19 = Static349.aClass374_2.method8357(this.anInt10036);
			@Pc(21) Class178 local21 = local19;
			if (local19.anIntArray313 != null) {
				local19 = local19.method4012(Static592.aClass47_2);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray315 != null) {
				if (this.aClass48_3 != null && local19.method4026(this.aClass48_3.anInt1551)) {
					return;
				}
				local7 = local19.method4020();
				if (this.anInt10034 != local19.anInt4778) {
					local9 = local19.aBoolean387;
				}
			} else if (local19.lb == -1) {
				if (local21 != null && local21.anIntArray315 != null) {
					if (this.aClass48_3 != null && local21.method4026(this.aClass48_3.anInt1551)) {
						return;
					}
					local7 = local21.method4020();
					if (this.anInt10034 != local21.anInt4778) {
						local9 = local21.aBoolean387;
					}
				} else if (local21 != null && local21.lb != -1 && this.anInt10034 != local21.anInt4778) {
					local7 = local21.lb;
					local9 = local21.aBoolean387;
				}
			} else if (local19.anInt4778 != this.anInt10034) {
				local9 = local19.aBoolean387;
				local7 = local19.lb;
			}
		}
		if (local7 == -1) {
			this.aClass48_3 = null;
			return;
		}
		this.aClass28_7 = null;
		if (this.aClass48_3 == null || this.aClass48_3.anInt1551 != local7) {
			this.aClass48_3 = Static483.aClass373_2.method8323(local7);
		} else if (this.aClass48_3.anInt1546 == 0) {
			return;
		}
		if (this.aClass48_3.anIntArray72 == null) {
			this.aClass48_3 = null;
			return;
		}
		if (local9) {
			this.anInt10041 = (int) ((double) this.aClass48_3.anIntArray72.length * Math.random());
			this.anInt10039 = (int) ((double) this.aClass48_3.anIntArray68[this.anInt10041] * Math.random()) + 1;
		} else {
			this.anInt10039 = 1;
			this.anInt10041 = 0;
		}
		this.anInt10030 = this.anInt10041 + 1;
		if (this.anInt10030 < 0 || this.anInt10030 >= this.aClass48_3.anIntArray72.length) {
			this.anInt10030 = -1;
		}
		this.anInt10046 = Static621.anInt9665 - this.anInt10039;
	}
}
