import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class77 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!rj;")
	private Class177 aClass177_2;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "Lclient!ri;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_2;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!fs", name = "I", descriptor = "Lclient!kr;")
	public Class7_Sub7 aClass7_Sub7_4;

	@OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
	private int anInt1796;

	@OriginalMember(owner = "client!fs", name = "N", descriptor = "Lclient!dc;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!fs", name = "P", descriptor = "I")
	private int anInt1799;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	private int anInt1772 = -32768;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
	private int anInt1784 = -1;

	@OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
	private int anInt1788 = -1;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	public final int anInt1785;

	@OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
	private int anInt1791;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public final int anInt1773;

	@OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
	public final int anInt1797;

	@OriginalMember(owner = "client!fs", name = "Q", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!fs", name = "H", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIIIZI)V")
	public Class77(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean130 = arg8;
		this.anInt1785 = arg2;
		this.anInt1798 = arg7;
		this.anInt1791 = arg6;
		this.aByte19 = (byte) arg4;
		this.anInt1773 = arg1.anInt1898;
		this.anInt1797 = arg3;
		this.aByte20 = (byte) arg5;
		this.aBoolean131 = arg0.method4227() && arg1.aBoolean142 && !this.aBoolean130;
		if (arg9 != -1) {
			this.aBoolean129 = true;
		}
		this.method1475(arg9);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!ii;)V")
	public void method1469(@OriginalArg(1) Class105 arg0) {
		this.method1479(true, this.anInt1791, 131072, arg0, this.anInt1798, true);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V")
	public void method1471(@OriginalArg(0) int arg0) {
		this.aBoolean129 = true;
		this.method1475(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	public int method1472() {
		return this.anInt1772;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!ii;)V")
	public void method1473(@OriginalArg(1) Class105 arg0) {
		if (this.aClass1_Sub2_Sub5_2 != null) {
			Static277.method4956(this.aClass1_Sub2_Sub5_2, this.aByte20, this.anInt1791, this.anInt1798, this.aBooleanArray9);
			this.aClass1_Sub2_Sub5_2 = null;
			this.aBooleanArray9 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZIILclient!dc;ILclient!ii;)V")
	public void method1474(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class105 arg6) {
		@Pc(13) Class100[] local13 = arg4.method4606();
		@Pc(16) Class123[] local16 = arg4.method4589();
		if ((this.aClass7_Sub7_4 == null || this.aClass7_Sub7_4.aBoolean255) && (local13 != null || local16 != null)) {
			@Pc(32) Class79 local32 = Static129.method2097(this.anInt1773);
			if (local32.anIntArray161 != null) {
				local32 = local32.method1567();
			}
			if (local32 != null) {
				this.aClass7_Sub7_4 = new Class7_Sub7(Static282.anInt3516);
			}
		}
		if (this.aClass7_Sub7_4 == null) {
			return;
		}
		if (arg1) {
			this.aClass7_Sub7_4.method2818(arg6, (long) Static282.anInt3516, local13, local16);
		} else {
			this.aClass7_Sub7_4.method2828((long) Static282.anInt3516);
		}
		this.aClass7_Sub7_4.method2826(this.aByte19, arg3, arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
	private void method1475(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class79 local17 = Static129.method2097(this.anInt1773);
			@Pc(19) Class79 local19 = local17;
			if (local17.anIntArray161 != null) {
				local17 = local17.method1567();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray155 != null) {
				if (this.aClass177_2 != null && local17.method1564(this.aClass177_2.anInt5423)) {
					return;
				}
				local7 = local17.method1557();
				if (this.anInt1788 != local17.anInt1898) {
					local9 = local17.aBoolean138;
				}
			} else if (local17.anInt1857 == -1) {
				if (local19 != null && local19.anIntArray155 != null) {
					if (this.aClass177_2 != null && local19.method1564(this.aClass177_2.anInt5423)) {
						return;
					}
					local7 = local19.method1557();
					if (local19.anInt1898 != this.anInt1788) {
						local9 = local19.aBoolean138;
					}
				} else if (local19 != null && local19.anInt1857 != -1 && this.anInt1788 != local19.anInt1898) {
					local7 = local19.anInt1857;
					local9 = local19.aBoolean138;
				}
			} else if (this.anInt1788 != local17.anInt1898) {
				local7 = local17.anInt1857;
				local9 = local17.aBoolean138;
			}
		}
		if (local7 == -1) {
			this.aClass177_2 = null;
			return;
		}
		this.aClass40_3 = null;
		if (this.aClass177_2 == null || this.aClass177_2.anInt5423 != local7) {
			this.aClass177_2 = Static354.method5863(local7);
		} else if (this.aClass177_2.anInt5420 == 0) {
			return;
		}
		if (this.aClass177_2.anIntArray529 == null) {
			this.aClass177_2 = null;
			return;
		}
		if (local9) {
			this.anInt1782 = (int) (Math.random() * (double) this.aClass177_2.anIntArray529.length);
			this.anInt1776 = (int) ((double) this.aClass177_2.anIntArray528[this.anInt1782] * Math.random()) + 1;
		} else {
			this.anInt1776 = 1;
			this.anInt1782 = 0;
		}
		this.anInt1799 = this.anInt1782 + 1;
		if (this.anInt1799 < 0 || this.anInt1799 >= this.aClass177_2.anIntArray529.length) {
			this.anInt1799 = -1;
		}
		this.anInt1796 = Static282.anInt3516 - this.anInt1776;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
	public boolean method1476() {
		return this.aBoolean131;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	private void method1478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass177_2 == null) {
				if (this.aBoolean129) {
					return;
				}
				this.method1475(-1);
				if (this.aClass177_2 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static282.anInt3516 - this.anInt1796;
			if (local32 > 100 && this.aClass177_2.anInt5408 > 0) {
				@Pc(52) int local52 = this.aClass177_2.anIntArray529.length - this.aClass177_2.anInt5408;
				while (local52 > this.anInt1782 && this.aClass177_2.anIntArray528[this.anInt1782] < local32) {
					local32 -= this.aClass177_2.anIntArray528[this.anInt1782];
					this.anInt1782++;
				}
				if (this.anInt1782 >= local52) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass177_2.anIntArray529.length; local97++) {
						local95 += this.aClass177_2.anIntArray528[local97];
					}
					local32 %= local95;
				}
				this.anInt1799 = this.anInt1782 + 1;
				if (this.anInt1799 >= this.aClass177_2.anIntArray529.length) {
					this.anInt1799 -= this.aClass177_2.anInt5408;
					if (this.anInt1799 < 0 || this.aClass177_2.anIntArray529.length <= this.anInt1799) {
						this.anInt1799 = -1;
					}
				}
			}
			while (this.aClass177_2.anIntArray528[this.anInt1782] < local32) {
				Static351.method3417(arg0, false, arg1, this.anInt1782, this.aClass177_2);
				local32 -= this.aClass177_2.anIntArray528[this.anInt1782];
				this.anInt1782++;
				if (this.anInt1782 >= this.aClass177_2.anIntArray529.length) {
					this.anInt1782 -= this.aClass177_2.anInt5408;
					if (this.anInt1782 < 0 || this.anInt1782 >= this.aClass177_2.anIntArray529.length) {
						this.aClass177_2 = null;
						continue label80;
					}
				}
				this.anInt1799 = this.anInt1782 + 1;
				if (this.aClass177_2.anIntArray529.length <= this.anInt1799) {
					this.anInt1799 -= this.aClass177_2.anInt5408;
					if (this.anInt1799 < 0 || this.aClass177_2.anIntArray529.length <= this.anInt1799) {
						this.anInt1799 = -1;
					}
				}
			}
			this.anInt1776 = local32;
			this.anInt1796 = Static282.anInt3516 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIILclient!ii;IZ)Lclient!dc;")
	public Class40 method1479(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class105 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class79 local10 = Static129.method2097(this.anInt1773);
		if (local10.anIntArray161 != null) {
			local10 = local10.method1567();
		}
		if (local10 == null) {
			this.method1473(arg3);
			this.anInt1784 = this.anInt1782;
			this.anInt1788 = -1;
			return null;
		}
		if (!this.aBoolean129 && this.anInt1788 != local10.anInt1898) {
			this.aClass40_3 = null;
			this.method1475(-1);
		}
		this.method1478(arg4, arg1);
		@Pc(68) boolean local68 = arg0 & Static256.anInt5260 != 0 & this.aBoolean131;
		@Pc(103) boolean local103 = local68 & (local10.anInt1898 != this.anInt1788 || (this.anInt1782 != this.anInt1784 || this.aClass177_2 != null && (this.aClass177_2.aBoolean449 || Static221.aBoolean374) && this.anInt1799 != this.anInt1782) && Static256.anInt5260 >= 2);
		if (arg5 && !local103) {
			this.anInt1788 = local10.anInt1898;
			this.anInt1784 = this.anInt1782;
			return null;
		}
		if (local103) {
			Static277.method4956(this.aClass1_Sub2_Sub5_2, this.aByte20, this.anInt1791, this.anInt1798, this.aBooleanArray9);
		}
		@Pc(135) Class12 local135 = Static263.aClass12Array2[this.aByte20];
		@Pc(153) Class12 local153;
		if (this.aBoolean130) {
			local153 = Static278.aClass12Array3[0];
		} else {
			local153 = this.aByte20 >= 3 ? null : Static263.aClass12Array2[this.aByte20 + 1];
		}
		@Pc(161) Class40 local161 = null;
		if (this.aClass177_2 != null) {
			if (local103) {
				arg2 |= 0x20000;
			}
			local161 = local10.method1559(this.anInt1785 == 11 ? 10 : this.anInt1785, this.anInt1799, this.anInt1785 == 11 ? this.anInt1797 + 4 : this.anInt1797, this.anInt1791, this.anInt1782, local153, this.anInt1776, this.anInt1798, local135.method2698(this.anInt1791, this.anInt1798), this.aClass177_2, local135, arg2, arg3);
			if (local161 == null) {
				this.anInt1772 = 0;
				this.aClass1_Sub2_Sub5_2 = null;
				this.aBooleanArray9 = null;
			} else {
				if (local103) {
					if (this.aBooleanArray9 == null) {
						this.aBooleanArray9 = new boolean[4];
					}
					this.aClass1_Sub2_Sub5_2 = local161.method4613(this.aClass1_Sub2_Sub5_2);
					Static293.method5138(this.aClass1_Sub2_Sub5_2, this.aByte20, arg1, arg4, this.aBooleanArray9);
				}
				this.anInt1772 = local161.method4572();
			}
			this.aClass40_3 = null;
		} else if (this.aClass40_3 != null && (arg2 & this.aClass40_3.method4602()) == arg2 && local10.anInt1898 == this.anInt1788) {
			local161 = this.aClass40_3;
		} else {
			if (this.aClass40_3 != null) {
				arg2 |= this.aClass40_3.method4602();
			}
			@Pc(339) Class32 local339 = local10.method1565(local153, this.anInt1798, local103, this.anInt1791, arg2, this.anInt1785 == 11 ? 10 : this.anInt1785, this.anInt1785 == 11 ? this.anInt1797 + 4 : this.anInt1797, local135, local135.method2698(this.anInt1791, this.anInt1798), arg3);
			if (local339 == null) {
				this.aClass1_Sub2_Sub5_2 = null;
				this.aBooleanArray9 = null;
				this.anInt1772 = 0;
				this.aClass40_3 = null;
			} else {
				local161 = local339.aClass40_1;
				this.aClass40_3 = local339.aClass40_1;
				if (local103) {
					this.aBooleanArray9 = null;
					this.aClass1_Sub2_Sub5_2 = local339.aClass1_Sub2_Sub5_1;
					Static293.method5138(this.aClass1_Sub2_Sub5_2, this.aByte20, arg1, arg4, null);
				}
				this.anInt1772 = local161.method4572();
			}
		}
		this.anInt1788 = local10.anInt1898;
		this.anInt1784 = this.anInt1782;
		this.anInt1798 = arg4;
		this.anInt1791 = arg1;
		return local161;
	}

	@OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub7_4 != null) {
			this.aClass7_Sub7_4.method2822();
		}
	}
}
