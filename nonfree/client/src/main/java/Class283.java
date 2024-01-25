import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class283 {

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "Lclient!dr;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "[Z")
	private boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "Lclient!da;")
	private Class66 aClass66_6;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	private int anInt7899;

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
	private int anInt7901;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "Lclient!ha;")
	private Class2_Sub3_Sub6 aClass2_Sub3_Sub6_5;

	@OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
	private int anInt7910;

	@OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
	private int anInt7915;

	@OriginalMember(owner = "client!rea", name = "K", descriptor = "Lclient!tq;")
	public Class6_Sub8 aClass6_Sub8_8;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
	private int anInt7897 = 0;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "Z")
	private boolean aBoolean622 = false;

	@OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
	private int anInt7906 = -1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	private int anInt7892 = -1;

	@OriginalMember(owner = "client!rea", name = "x", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
	private int anInt7904 = 0;

	@OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
	private int anInt7916 = -1;

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
	private int anInt7893;

	@OriginalMember(owner = "client!rea", name = "J", descriptor = "B")
	private final byte aByte106;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
	private int anInt7895;

	@OriginalMember(owner = "client!rea", name = "L", descriptor = "I")
	public final int anInt7918;

	@OriginalMember(owner = "client!rea", name = "y", descriptor = "I")
	public final int anInt7908;

	@OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
	public final int anInt7907;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "Z")
	private final boolean aBoolean621;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!r;Lclient!bda;IIIIIIZI)V")
	public Class283(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt7893 = arg7;
		this.aByte106 = (byte) arg5;
		this.aByte105 = (byte) arg4;
		this.aBoolean622 = arg8;
		this.anInt7895 = arg6;
		this.anInt7918 = arg3;
		this.anInt7908 = arg1.anInt773;
		this.anInt7907 = arg2;
		this.aBoolean621 = arg0.method6218() && arg1.aBoolean50 && !this.aBoolean622;
		if (arg9 != -1) {
			this.aBoolean623 = true;
		}
		this.method6481(arg9);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLclient!r;)V")
	public void method6479(@OriginalArg(1) Class100 arg0) {
		this.method6489(this.anInt7895, arg0, true, true, this.anInt7893, 262144);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V")
	private void method6481(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class32 local19 = Static541.aClass97_4.method1794(this.anInt7908);
			@Pc(21) Class32 local21 = local19;
			if (local19.anIntArray50 != null) {
				local19 = local19.method552(Static70.aClass78_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray48 != null) {
				if (this.aClass84_3 != null && local19.method549(this.aClass84_3.anInt2053)) {
					return;
				}
				local7 = local19.method560();
				if (local19.anInt773 != this.anInt7892) {
					local9 = local19.aBoolean47;
				}
			} else if (local19.anInt816 == -1) {
				if (local21 != null && local21.anIntArray48 != null) {
					if (this.aClass84_3 != null && local21.method549(this.aClass84_3.anInt2053)) {
						return;
					}
					local7 = local21.method560();
					if (local21.anInt773 != this.anInt7892) {
						local9 = local21.aBoolean47;
					}
				} else if (local21 != null && local21.anInt816 != -1 && this.anInt7892 != local21.anInt773) {
					local7 = local21.anInt816;
					local9 = local21.aBoolean47;
				}
			} else if (this.anInt7892 != local19.anInt773) {
				local9 = local19.aBoolean47;
				local7 = local19.anInt816;
			}
		}
		if (local7 == -1) {
			this.aClass84_3 = null;
			return;
		}
		this.aClass66_6 = null;
		if (this.aClass84_3 == null || local7 != this.aClass84_3.anInt2053) {
			this.aClass84_3 = Static116.aClass140_2.method3287(local7);
		} else if (this.aClass84_3.anInt2056 == 0) {
			return;
		}
		if (this.aClass84_3.anIntArray108 == null) {
			this.aClass84_3 = null;
			return;
		}
		if (local9) {
			this.anInt7899 = (int) ((double) this.aClass84_3.anIntArray108.length * Math.random());
			this.anInt7910 = (int) ((double) this.aClass84_3.anIntArray110[this.anInt7899] * Math.random()) + 1;
		} else {
			this.anInt7899 = 0;
			this.anInt7910 = 1;
		}
		this.anInt7915 = this.anInt7899 + 1;
		if (this.anInt7915 < 0 || this.aClass84_3.anIntArray108.length <= this.anInt7915) {
			this.anInt7915 = -1;
		}
		this.anInt7901 = Static412.anInt575 - this.anInt7910;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!r;)V")
	public void method6482(@OriginalArg(1) Class100 arg0) {
		if (this.aClass2_Sub3_Sub6_5 != null) {
			Static384.method7168(this.aClass2_Sub3_Sub6_5, this.aByte106, this.anInt7895, this.anInt7893, this.aBooleanArray31);
			this.aClass2_Sub3_Sub6_5 = null;
			this.aBooleanArray31 = null;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V")
	public void method6483(@OriginalArg(0) int arg0) {
		this.aBoolean623 = true;
		this.method6481(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
	private void method6484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass84_3 == null) {
				if (this.aBoolean623) {
					return;
				}
				this.method6481(-1);
				if (this.aClass84_3 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static412.anInt575 - this.anInt7901;
			if (local29 > 100 && this.aClass84_3.anInt2068 > 0) {
				@Pc(46) int local46 = this.aClass84_3.anIntArray108.length - this.aClass84_3.anInt2068;
				while (local46 > this.anInt7899 && local29 > this.aClass84_3.anIntArray110[this.anInt7899]) {
					local29 -= this.aClass84_3.anIntArray110[this.anInt7899];
					this.anInt7899++;
				}
				if (this.anInt7899 >= local46) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local46; local91 < this.aClass84_3.anIntArray108.length; local91++) {
						local89 += this.aClass84_3.anIntArray110[local91];
					}
					local29 %= local89;
				}
				this.anInt7915 = this.anInt7899 + 1;
				if (this.anInt7915 >= this.aClass84_3.anIntArray108.length) {
					this.anInt7915 -= this.aClass84_3.anInt2068;
					if (this.anInt7915 < 0 || this.anInt7915 >= this.aClass84_3.anIntArray108.length) {
						this.anInt7915 = -1;
					}
				}
			}
			while (this.aClass84_3.anIntArray110[this.anInt7899] < local29) {
				Static434.method4018(this.aByte105, this.aClass84_3, arg1, arg0, this.anInt7899, false);
				local29 -= this.aClass84_3.anIntArray110[this.anInt7899];
				this.anInt7899++;
				if (this.aClass84_3.anIntArray108.length <= this.anInt7899) {
					this.anInt7899 -= this.aClass84_3.anInt2068;
					if (this.anInt7899 < 0 || this.anInt7899 >= this.aClass84_3.anIntArray108.length) {
						this.aClass84_3 = null;
						continue label80;
					}
				}
				this.anInt7915 = this.anInt7899 + 1;
				if (this.anInt7915 >= this.aClass84_3.anIntArray108.length) {
					this.anInt7915 -= this.aClass84_3.anInt2068;
					if (this.anInt7915 < 0 || this.anInt7915 >= this.aClass84_3.anIntArray108.length) {
						this.anInt7915 = -1;
					}
				}
			}
			this.anInt7901 = Static412.anInt575 - local29;
			this.anInt7910 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!rea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_8 != null) {
			this.aClass6_Sub8_8.method7159();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)Z")
	public boolean method6485() {
		return this.aBoolean621;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)I")
	public int method6487(@OriginalArg(0) int arg0) {
		return arg0 == 28110 ? this.anInt7904 : -61;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!da;ILclient!r;IZIIILclient!q;)V")
	public void method6488(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class68 arg7) {
		@Pc(6) Class139[] local6 = arg0.method7550();
		@Pc(9) Class270[] local9 = arg0.method7561();
		if ((this.aClass6_Sub8_8 == null || this.aClass6_Sub8_8.aBoolean660) && (local6 != null || local9 != null)) {
			@Pc(26) Class32 local26 = Static541.aClass97_4.method1794(this.anInt7908);
			if (local26.anIntArray50 != null) {
				local26 = local26.method552(Static70.aClass78_1);
			}
			if (local26 != null) {
				this.aClass6_Sub8_8 = Static518.method7156(Static412.anInt575, true);
			}
		}
		if (this.aClass6_Sub8_8 == null) {
			return;
		}
		arg0.method7552(arg7);
		if (arg4) {
			this.aClass6_Sub8_8.method7149(arg2, (long) Static412.anInt575, local6, local9);
		} else {
			this.aClass6_Sub8_8.method7150((long) Static412.anInt575);
		}
		this.aClass6_Sub8_8.method7160(this.aByte105, arg1, arg5, arg6, arg3);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZILclient!r;ZZII)Lclient!da;")
	public Class66 method6489(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class32 local11 = Static541.aClass97_4.method1794(this.anInt7908);
		if (local11.anIntArray50 != null) {
			local11 = local11.method552(Static70.aClass78_1);
		}
		if (local11 == null) {
			this.method6482(arg1);
			this.anInt7916 = -1;
			this.anInt7906 = -1;
			this.anInt7892 = -1;
			return null;
		}
		if (!this.aBoolean623 && this.anInt7892 != local11.anInt773) {
			this.aClass66_6 = null;
			this.method6481(-1);
		}
		this.method6484(arg4, arg0);
		if (arg2) {
			@Pc(72) boolean local72 = arg2 & this.aBoolean621 & Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) != 0;
			arg2 = local72 & (this.anInt7916 != local11.anInt773 || this.aClass84_3 != null && Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) >= 2 && (this.anInt7899 != this.anInt7906 || (this.aClass84_3.aBoolean187 || Static564.aBoolean711) && this.anInt7915 != this.anInt7899));
		}
		if (arg3 && !arg2) {
			this.anInt7892 = local11.anInt773;
			return null;
		}
		if (arg2) {
			Static384.method7168(this.aClass2_Sub3_Sub6_5, this.aByte106, this.anInt7895, this.anInt7893, this.aBooleanArray31);
			this.anInt7916 = -1;
			this.anInt7906 = -1;
		}
		@Pc(147) Class67 local147 = Static421.aClass67Array7[this.aByte106];
		@Pc(154) Class67 local154;
		if (this.aBoolean622) {
			local154 = Static569.aClass67Array8[0];
		} else {
			local154 = this.aByte106 < 3 ? Static421.aClass67Array7[this.aByte106 + 1] : null;
		}
		@Pc(171) Class66 local171 = null;
		if (this.aClass84_3 != null) {
			if (arg2) {
				arg5 |= 0x40000;
			}
			local171 = local11.method551(this.anInt7895, this.anInt7907 == 11 ? this.anInt7918 + 4 : this.anInt7918, local147, this.anInt7910, local154, this.aClass84_3, this.anInt7915, arg1, local147.method6711(this.anInt7893, this.anInt7895), this.anInt7893, this.anInt7899, arg5, this.anInt7907 == 11 ? 10 : this.anInt7907);
			if (local171 == null) {
				this.anInt7904 = 0;
				this.aClass2_Sub3_Sub6_5 = null;
				this.anInt7897 = 0;
				this.aBooleanArray31 = null;
			} else {
				if (arg2) {
					if (this.aBooleanArray31 == null) {
						this.aBooleanArray31 = new boolean[4];
					}
					this.aClass2_Sub3_Sub6_5 = local171.S(this.aClass2_Sub3_Sub6_5);
					Static65.method1052(this.aClass2_Sub3_Sub6_5, this.aByte106, arg0, arg4, this.aBooleanArray31);
					this.anInt7906 = this.anInt7899;
					this.anInt7916 = local11.anInt773;
				}
				this.anInt7897 = local171.J();
				this.anInt7904 = local171.RA();
			}
			this.aClass66_6 = null;
		} else if (this.aClass66_6 != null && (this.aClass66_6.PA() & arg5) == arg5 && this.anInt7892 == local11.anInt773) {
			local171 = this.aClass66_6;
		} else {
			if (this.aClass66_6 != null) {
				arg5 |= this.aClass66_6.PA();
			}
			@Pc(358) Class191 local358 = local11.method559(arg5, arg1, local147.method6711(this.anInt7893, this.anInt7895), local147, this.anInt7895, local154, this.anInt7893, arg2, this.anInt7907 == 11 ? 10 : this.anInt7907, this.anInt7907 == 11 ? this.anInt7918 + 4 : this.anInt7918);
			if (local358 == null) {
				this.aClass66_6 = null;
				this.aClass2_Sub3_Sub6_5 = null;
				this.anInt7904 = 0;
				this.anInt7897 = 0;
				this.aBooleanArray31 = null;
			} else {
				local171 = local358.aClass66_3;
				this.aClass66_6 = local358.aClass66_3;
				if (arg2) {
					this.aBooleanArray31 = null;
					this.aClass2_Sub3_Sub6_5 = local358.aClass2_Sub3_Sub6_3;
					Static65.method1052(this.aClass2_Sub3_Sub6_5, this.aByte106, arg0, arg4, null);
					this.anInt7916 = local11.anInt773;
					this.anInt7906 = -1;
				}
				this.anInt7897 = local171.J();
				this.anInt7904 = local171.RA();
			}
		}
		this.anInt7892 = local11.anInt773;
		this.anInt7895 = arg0;
		this.anInt7893 = arg4;
		return local171;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)I")
	public int method6490() {
		return this.anInt7897;
	}
}
