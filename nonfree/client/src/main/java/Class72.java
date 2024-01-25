import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class72 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!qp;")
	private Class191 aClass191_1;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	private int anInt1788;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	private int anInt1790;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
	private int anInt1792;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "Lclient!c;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "Lclient!j;")
	private Class1_Sub2_Sub11 aClass1_Sub2_Sub11_2;

	@OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
	private int anInt1802;

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "[Z")
	private boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "Lclient!vc;")
	public Class39_Sub8 aClass39_Sub8_1;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
	private int anInt1789 = -1;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
	private int anInt1781 = -1;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
	private int anInt1796 = -32768;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	public final int anInt1795;

	@OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
	public final int anInt1806;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
	public final int anInt1791;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIIZI)V")
	public Class72(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt1795 = arg3;
		this.anInt1806 = arg1.anInt5478;
		this.aBoolean100 = arg8;
		this.anInt1791 = arg2;
		this.anInt1798 = arg7;
		this.anInt1801 = arg6;
		this.aByte23 = (byte) arg5;
		this.aByte22 = (byte) arg4;
		this.aBoolean101 = arg0.method4734() && arg1.aBoolean362 && !this.aBoolean100;
		if (arg9 != -1) {
			this.aBoolean99 = true;
		}
		this.method1511(arg9);
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass39_Sub8_1 != null) {
			this.aClass39_Sub8_1.method5617();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V")
	public void method1502(@OriginalArg(0) int arg0) {
		this.aBoolean99 = true;
		this.method1511(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)I")
	public int method1504() {
		return this.anInt1796;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!qa;Lclient!c;ZIII)V")
	public void method1505(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class252[] local12 = arg2.method4225();
		@Pc(15) Class122[] local15 = arg2.method4232();
		if ((this.aClass39_Sub8_1 == null || this.aClass39_Sub8_1.aBoolean470) && (local12 != null || local15 != null)) {
			@Pc(32) Class182 local32 = Static71.aClass105_6.method2336(this.anInt1806);
			if (local32.anIntArray425 != null) {
				local32 = local32.method4388(Static51.aClass79_1);
			}
			if (local32 != null) {
				this.aClass39_Sub8_1 = new Class39_Sub8(Static403.anInt6978);
			}
		}
		if (this.aClass39_Sub8_1 == null) {
			return;
		}
		if (arg3) {
			this.aClass39_Sub8_1.method5618(arg1, (long) Static403.anInt6978, local12, local15);
		} else {
			this.aClass39_Sub8_1.method5626((long) Static403.anInt6978);
		}
		this.aClass39_Sub8_1.method5624(this.aByte22, arg4, arg0, arg5, arg6);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIIILclient!qa;Z)Lclient!c;")
	public Class37 method1507(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class182 local11 = Static71.aClass105_6.method2336(this.anInt1806);
		if (local11.anIntArray425 != null) {
			local11 = local11.method4388(Static51.aClass79_1);
		}
		if (local11 == null) {
			this.method1509(arg4);
			this.anInt1789 = -1;
			this.anInt1781 = this.anInt1792;
			return null;
		}
		if (!this.aBoolean99 && local11.anInt5478 != this.anInt1789) {
			this.aClass37_2 = null;
			this.method1511(-1);
		}
		this.method1513(arg3, arg1);
		@Pc(75) boolean local75 = arg0 & this.aBoolean101 & Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) != 0;
		@Pc(119) boolean local119 = local75 & (this.anInt1789 != local11.anInt5478 || (this.anInt1792 != this.anInt1781 || this.aClass191_1 != null && (this.aClass191_1.aBoolean376 || Static294.aBoolean385) && this.anInt1792 != this.anInt1802) && Static389.aClass128_Sub1_1.method2977(Static285.anInt7839) >= 2);
		if (arg5 && !local119) {
			this.anInt1789 = local11.anInt5478;
			this.anInt1781 = this.anInt1792;
			return null;
		}
		if (local119) {
			Static349.method1152(this.aClass1_Sub2_Sub11_2, this.aByte23, this.anInt1801, this.anInt1798, this.aBooleanArray6);
		}
		@Pc(158) Class136 local158 = Static92.aClass136Array1[this.aByte23];
		@Pc(174) Class136 local174;
		if (this.aBoolean100) {
			local174 = Static328.aClass136Array3[0];
		} else {
			local174 = this.aByte23 < 3 ? Static92.aClass136Array1[this.aByte23 + 1] : null;
		}
		@Pc(182) Class37 local182 = null;
		if (this.aClass191_1 != null) {
			if (local119) {
				arg2 |= 0x40000;
			}
			local182 = local11.method4389(this.aClass191_1, local158.va(this.anInt1801, this.anInt1798), arg2, arg4, this.anInt1801, this.anInt1792, this.anInt1791 == 11 ? 10 : this.anInt1791, local158, this.anInt1788, local174, this.anInt1798, this.anInt1791 == 11 ? this.anInt1795 + 4 : this.anInt1795, this.anInt1802);
			if (local182 == null) {
				this.aClass1_Sub2_Sub11_2 = null;
				this.aBooleanArray6 = null;
				this.anInt1796 = 0;
			} else {
				if (local119) {
					if (this.aBooleanArray6 == null) {
						this.aBooleanArray6 = new boolean[4];
					}
					this.aClass1_Sub2_Sub11_2 = local182.ua(this.aClass1_Sub2_Sub11_2);
					Static225.method3380(this.aClass1_Sub2_Sub11_2, this.aByte23, arg1, arg3, this.aBooleanArray6);
				}
				this.anInt1796 = local182.b();
			}
			this.aClass37_2 = null;
		} else if (this.aClass37_2 != null && (this.aClass37_2.n() & arg2) == arg2 && this.anInt1789 == local11.anInt5478) {
			local182 = this.aClass37_2;
		} else {
			if (this.aClass37_2 != null) {
				arg2 |= this.aClass37_2.n();
			}
			@Pc(354) Class232 local354 = local11.method4378(this.anInt1801, local158, local158.va(this.anInt1801, this.anInt1798), this.anInt1791 == 11 ? 10 : this.anInt1791, arg4, this.anInt1791 == 11 ? this.anInt1795 + 4 : this.anInt1795, local119, this.anInt1798, local174, arg2);
			if (local354 == null) {
				this.aBooleanArray6 = null;
				this.aClass37_2 = null;
				this.aClass1_Sub2_Sub11_2 = null;
				this.anInt1796 = 0;
			} else {
				local182 = local354.aClass37_6;
				this.aClass37_2 = local354.aClass37_6;
				if (local119) {
					this.aClass1_Sub2_Sub11_2 = local354.aClass1_Sub2_Sub11_6;
					this.aBooleanArray6 = null;
					Static225.method3380(this.aClass1_Sub2_Sub11_2, this.aByte23, arg1, arg3, null);
				}
				this.anInt1796 = local182.b();
			}
		}
		this.anInt1781 = this.anInt1792;
		this.anInt1798 = arg3;
		this.anInt1789 = local11.anInt5478;
		this.anInt1801 = arg1;
		return local182;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!qa;)V")
	public void method1508(@OriginalArg(1) Class109 arg0) {
		this.method1507(true, this.anInt1801, 262144, this.anInt1798, arg0, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method1509(@OriginalArg(0) Class109 arg0) {
		if (this.aClass1_Sub2_Sub11_2 != null) {
			Static349.method1152(this.aClass1_Sub2_Sub11_2, this.aByte23, this.anInt1801, this.anInt1798, this.aBooleanArray6);
			this.aClass1_Sub2_Sub11_2 = null;
			this.aBooleanArray6 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V")
	private void method1511(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(25) Class182 local25 = Static71.aClass105_6.method2336(this.anInt1806);
			@Pc(27) Class182 local27 = local25;
			if (local25.anIntArray425 != null) {
				local25 = local25.method4388(Static51.aClass79_1);
			}
			if (local25 == null) {
				return;
			}
			if (local25 == local27) {
				local27 = null;
			}
			if (local25.anIntArray426 != null) {
				if (this.aClass191_1 != null && local25.method4393(this.aClass191_1.anInt5746)) {
					return;
				}
				local13 = local25.method4379();
				if (this.anInt1789 != local25.anInt5478) {
					local15 = local25.aBoolean353;
				}
			} else if (local25.anInt5450 == -1) {
				if (local27 != null && local27.anIntArray426 != null) {
					if (this.aClass191_1 != null && local27.method4393(this.aClass191_1.anInt5746)) {
						return;
					}
					local13 = local27.method4379();
					if (this.anInt1789 != local27.anInt5478) {
						local15 = local27.aBoolean353;
					}
				} else if (local27 != null && local27.anInt5450 != -1 && local27.anInt5478 != this.anInt1789) {
					local13 = local27.anInt5450;
					local15 = local27.aBoolean353;
				}
			} else if (local25.anInt5478 != this.anInt1789) {
				local13 = local25.anInt5450;
				local15 = local25.aBoolean353;
			}
		}
		if (local13 == -1) {
			this.aClass191_1 = null;
			return;
		}
		this.aClass37_2 = null;
		if (this.aClass191_1 == null || local13 != this.aClass191_1.anInt5746) {
			this.aClass191_1 = Static191.aClass28_1.method567(local13);
		} else if (this.aClass191_1.anInt5751 == 0) {
			return;
		}
		if (this.aClass191_1.anIntArray452 == null) {
			this.aClass191_1 = null;
			return;
		}
		if (local15) {
			this.anInt1792 = (int) ((double) this.aClass191_1.anIntArray452.length * Math.random());
			this.anInt1788 = (int) (Math.random() * (double) this.aClass191_1.anIntArray454[this.anInt1792]) + 1;
		} else {
			this.anInt1792 = 0;
			this.anInt1788 = 1;
		}
		this.anInt1802 = this.anInt1792 + 1;
		if (this.anInt1802 < 0 || this.aClass191_1.anIntArray452.length <= this.anInt1802) {
			this.anInt1802 = -1;
		}
		this.anInt1790 = Static403.anInt6978 - this.anInt1788;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	public boolean method1512() {
		return this.aBoolean101;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	private void method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass191_1 == null) {
				if (this.aBoolean99) {
					return;
				}
				this.method1511(-1);
				if (this.aClass191_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static403.anInt6978 - this.anInt1790;
			if (local30 > 100 && this.aClass191_1.anInt5747 > 0) {
				@Pc(47) int local47 = this.aClass191_1.anIntArray452.length - this.aClass191_1.anInt5747;
				while (this.anInt1792 < local47 && local30 > this.aClass191_1.anIntArray454[this.anInt1792]) {
					local30 -= this.aClass191_1.anIntArray454[this.anInt1792];
					this.anInt1792++;
				}
				if (this.anInt1792 >= local47) {
					@Pc(86) int local86 = 0;
					for (@Pc(88) int local88 = local47; local88 < this.aClass191_1.anIntArray452.length; local88++) {
						local86 += this.aClass191_1.anIntArray454[local88];
					}
					local30 %= local86;
				}
				this.anInt1802 = this.anInt1792 + 1;
				if (this.aClass191_1.anIntArray452.length <= this.anInt1802) {
					this.anInt1802 -= this.aClass191_1.anInt5747;
					if (this.anInt1802 < 0 || this.anInt1802 >= this.aClass191_1.anIntArray452.length) {
						this.anInt1802 = -1;
					}
				}
			}
			while (local30 > this.aClass191_1.anIntArray454[this.anInt1792]) {
				Static228.method3411(arg0, false, arg1, this.aClass191_1, this.anInt1792, this.aByte22);
				local30 -= this.aClass191_1.anIntArray454[this.anInt1792];
				this.anInt1792++;
				if (this.anInt1792 >= this.aClass191_1.anIntArray452.length) {
					this.anInt1792 -= this.aClass191_1.anInt5747;
					if (this.anInt1792 < 0 || this.aClass191_1.anIntArray452.length <= this.anInt1792) {
						this.aClass191_1 = null;
						continue label80;
					}
				}
				this.anInt1802 = this.anInt1792 + 1;
				if (this.anInt1802 >= this.aClass191_1.anIntArray452.length) {
					this.anInt1802 -= this.aClass191_1.anInt5747;
					if (this.anInt1802 < 0 || this.aClass191_1.anIntArray452.length <= this.anInt1802) {
						this.anInt1802 = -1;
					}
				}
			}
			this.anInt1790 = Static403.anInt6978 - local30;
			this.anInt1788 = local30;
			return;
		}
	}
}
