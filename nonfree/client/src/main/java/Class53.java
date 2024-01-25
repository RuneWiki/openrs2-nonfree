import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class53 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!e;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!jp;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	private int anInt1393;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	private int anInt1396;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!bv;")
	public Class21_Sub2 aClass21_Sub2_2;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!i;")
	private Class2_Sub5_Sub7 aClass2_Sub5_Sub7_1;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	private int anInt1404;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
	private int anInt1416;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	private int anInt1398 = -1;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	private int anInt1402 = -1;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	private int anInt1409 = -32768;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public final int anInt1391;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	public final int anInt1413;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public final int anInt1408;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
	private int anInt1411;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIIZI)V")
	public Class53(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte16 = (byte) arg4;
		this.aByte17 = (byte) arg5;
		this.aBoolean112 = arg8;
		this.anInt1391 = arg2;
		this.anInt1413 = arg1.anInt5325;
		this.anInt1408 = arg3;
		this.anInt1411 = arg7;
		this.anInt1407 = arg6;
		this.aBoolean113 = arg0.method5544() && arg1.aBoolean392 && !this.aBoolean112;
		if (arg9 != -1) {
			this.aBoolean111 = true;
		}
		this.method1098(arg9);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!za;I)V")
	public void method1087(@OriginalArg(0) Class163 arg0) {
		if (this.aClass2_Sub5_Sub7_1 != null) {
			Static357.method4497(this.aClass2_Sub5_Sub7_1, this.aByte17, this.anInt1407, this.anInt1411, this.aBooleanArray8);
			this.aClass2_Sub5_Sub7_1 = null;
			this.aBooleanArray8 = null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!za;IIIZLclient!e;I)V")
	public void method1088(@OriginalArg(1) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class155[] local6 = arg5.method5742();
		@Pc(9) Class199[] local9 = arg5.method5749();
		if ((this.aClass21_Sub2_2 == null || this.aClass21_Sub2_2.aBoolean68) && (local6 != null || local9 != null)) {
			@Pc(26) Class192 local26 = Static50.aClass190_1.method4218(this.anInt1413);
			if (local26.anIntArray434 != null) {
				local26 = local26.method4228(Static138.aClass268_1);
			}
			if (local26 != null) {
				this.aClass21_Sub2_2 = new Class21_Sub2(Static266.anInt4392);
			}
		}
		if (this.aClass21_Sub2_2 == null) {
			return;
		}
		if (arg4) {
			this.aClass21_Sub2_2.method641(arg0, (long) Static266.anInt4392, local6, local9);
		} else {
			this.aClass21_Sub2_2.method636((long) Static266.anInt4392);
		}
		this.aClass21_Sub2_2.method637(this.aByte16, arg3, arg2, arg1, arg6);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
	public boolean method1090() {
		return this.aBoolean113;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
	public void method1092(@OriginalArg(0) int arg0) {
		this.aBoolean111 = true;
		this.method1098(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIZLclient!za;IIZ)Lclient!e;")
	public Class59 method1093(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class163 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(16) Class192 local16 = Static50.aClass190_1.method4218(this.anInt1413);
		if (local16.anIntArray434 != null) {
			local16 = local16.method4228(Static138.aClass268_1);
		}
		if (local16 == null) {
			this.method1087(arg2);
			this.anInt1398 = -1;
			this.anInt1402 = this.anInt1404;
			return null;
		}
		if (!this.aBoolean111 && local16.anInt5325 != this.anInt1398) {
			this.aClass59_2 = null;
			this.method1098(-1);
		}
		this.method1097(arg4, arg0);
		@Pc(77) boolean local77 = arg5 & this.aBoolean113 & Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) != 0;
		@Pc(121) boolean local121 = local77 & (this.anInt1398 != local16.anInt5325 || (this.anInt1404 != this.anInt1402 || this.aClass128_1 != null && (this.aClass128_1.aBoolean202 || Static390.aBoolean492) && this.anInt1393 != this.anInt1404) && Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) >= 2);
		if (arg1 && !local121) {
			this.anInt1402 = this.anInt1404;
			this.anInt1398 = local16.anInt5325;
			return null;
		}
		if (local121) {
			Static357.method4497(this.aClass2_Sub5_Sub7_1, this.aByte17, this.anInt1407, this.anInt1411, this.aBooleanArray8);
		}
		@Pc(153) Class162 local153 = Static345.aClass162Array3[this.aByte17];
		@Pc(169) Class162 local169;
		if (this.aBoolean112) {
			local169 = Static314.aClass162Array2[0];
		} else {
			local169 = this.aByte17 < 3 ? Static345.aClass162Array3[this.aByte17 + 1] : null;
		}
		@Pc(177) Class59 local177 = null;
		if (this.aClass128_1 != null) {
			if (local121) {
				arg3 |= 0x40000;
			}
			local177 = local16.method4227(this.anInt1411, this.anInt1391 == 11 ? 10 : this.anInt1391, arg3, this.anInt1393, local153.ca(this.anInt1407, this.anInt1411), this.anInt1404, this.aClass128_1, this.anInt1407, this.anInt1396, local169, local153, arg2, this.anInt1391 == 11 ? this.anInt1408 + 4 : this.anInt1408);
			if (local177 == null) {
				this.aBooleanArray8 = null;
				this.anInt1409 = 0;
				this.aClass2_Sub5_Sub7_1 = null;
			} else {
				if (local121) {
					if (this.aBooleanArray8 == null) {
						this.aBooleanArray8 = new boolean[4];
					}
					this.aClass2_Sub5_Sub7_1 = local177.EA(this.aClass2_Sub5_Sub7_1);
					Static92.method1462(this.aClass2_Sub5_Sub7_1, this.aByte17, arg4, arg0, this.aBooleanArray8);
				}
				this.anInt1409 = local177.B();
			}
			this.aClass59_2 = null;
		} else if (this.aClass59_2 != null && (arg3 & this.aClass59_2.RA()) == arg3 && local16.anInt5325 == this.anInt1398) {
			local177 = this.aClass59_2;
		} else {
			if (this.aClass59_2 != null) {
				arg3 |= this.aClass59_2.RA();
			}
			@Pc(252) Class247 local252 = local16.method4234(this.anInt1391 == 11 ? 10 : this.anInt1391, arg3, this.anInt1407, local153.ca(this.anInt1407, this.anInt1411), local169, arg2, local153, this.anInt1411, this.anInt1391 == 11 ? this.anInt1408 + 4 : this.anInt1408, local121);
			if (local252 == null) {
				this.anInt1409 = 0;
				this.aBooleanArray8 = null;
				this.aClass2_Sub5_Sub7_1 = null;
				this.aClass59_2 = null;
			} else {
				local177 = local252.aClass59_6;
				this.aClass59_2 = local252.aClass59_6;
				if (local121) {
					this.aClass2_Sub5_Sub7_1 = local252.aClass2_Sub5_Sub7_5;
					this.aBooleanArray8 = null;
					Static92.method1462(this.aClass2_Sub5_Sub7_1, this.aByte17, arg4, arg0, null);
				}
				this.anInt1409 = local177.B();
			}
		}
		this.anInt1407 = arg4;
		this.anInt1398 = local16.anInt5325;
		this.anInt1411 = arg0;
		this.anInt1402 = this.anInt1404;
		return local177;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	public int method1094() {
		return this.anInt1409;
	}

	@OriginalMember(owner = "client!dj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub2_2 != null) {
			this.aClass21_Sub2_2.method635();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)V")
	private void method1097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass128_1 == null) {
				if (this.aBoolean111) {
					return;
				}
				this.method1098(-1);
				if (this.aClass128_1 == null) {
					return;
				}
			}
			@Pc(38) int local38 = Static266.anInt4392 - this.anInt1416;
			if (local38 > 100 && this.aClass128_1.anInt3335 > 0) {
				@Pc(55) int local55 = this.aClass128_1.anIntArray278.length - this.aClass128_1.anInt3335;
				while (local55 > this.anInt1404 && this.aClass128_1.anIntArray276[this.anInt1404] < local38) {
					local38 -= this.aClass128_1.anIntArray276[this.anInt1404];
					this.anInt1404++;
				}
				if (local55 <= this.anInt1404) {
					@Pc(98) int local98 = 0;
					for (@Pc(100) int local100 = local55; local100 < this.aClass128_1.anIntArray278.length; local100++) {
						local98 += this.aClass128_1.anIntArray276[local100];
					}
					local38 %= local98;
				}
				this.anInt1393 = this.anInt1404 + 1;
				if (this.aClass128_1.anIntArray278.length <= this.anInt1393) {
					this.anInt1393 -= this.aClass128_1.anInt3335;
					if (this.anInt1393 < 0 || this.anInt1393 >= this.aClass128_1.anIntArray278.length) {
						this.anInt1393 = -1;
					}
				}
			}
			while (this.aClass128_1.anIntArray276[this.anInt1404] < local38) {
				Static128.method1905(this.aClass128_1, arg1, false, this.aByte16, arg0, this.anInt1404);
				local38 -= this.aClass128_1.anIntArray276[this.anInt1404];
				this.anInt1404++;
				if (this.aClass128_1.anIntArray278.length <= this.anInt1404) {
					this.anInt1404 -= this.aClass128_1.anInt3335;
					if (this.anInt1404 < 0 || this.anInt1404 >= this.aClass128_1.anIntArray278.length) {
						this.aClass128_1 = null;
						continue label80;
					}
				}
				this.anInt1393 = this.anInt1404 + 1;
				if (this.anInt1393 >= this.aClass128_1.anIntArray278.length) {
					this.anInt1393 -= this.aClass128_1.anInt3335;
					if (this.anInt1393 < 0 || this.anInt1393 >= this.aClass128_1.anIntArray278.length) {
						this.anInt1393 = -1;
					}
				}
			}
			this.anInt1416 = Static266.anInt4392 - local38;
			this.anInt1396 = local38;
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	private void method1098(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class192 local18 = Static50.aClass190_1.method4218(this.anInt1413);
			@Pc(20) Class192 local20 = local18;
			if (local18.anIntArray434 != null) {
				local18 = local18.method4228(Static138.aClass268_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray437 != null) {
				if (this.aClass128_1 != null && local18.method4238(this.aClass128_1.anInt3333)) {
					return;
				}
				local7 = local18.method4242();
				if (local18.anInt5325 != this.anInt1398) {
					local9 = local18.aBoolean402;
				}
			} else if (local18.anInt5327 == -1) {
				if (local20 != null && local20.anIntArray437 != null) {
					if (this.aClass128_1 != null && local20.method4238(this.aClass128_1.anInt3333)) {
						return;
					}
					local7 = local20.method4242();
					if (local20.anInt5325 != this.anInt1398) {
						local9 = local20.aBoolean402;
					}
				} else if (local20 != null && local20.anInt5327 != -1 && this.anInt1398 != local20.anInt5325) {
					local9 = local20.aBoolean402;
					local7 = local20.anInt5327;
				}
			} else if (this.anInt1398 != local18.anInt5325) {
				local7 = local18.anInt5327;
				local9 = local18.aBoolean402;
			}
		}
		if (local7 == -1) {
			this.aClass128_1 = null;
			return;
		}
		this.aClass59_2 = null;
		if (this.aClass128_1 == null || local7 != this.aClass128_1.anInt3333) {
			this.aClass128_1 = Static334.aClass62_2.method1418(local7);
		} else if (this.aClass128_1.anInt3329 == 0) {
			return;
		}
		if (this.aClass128_1.anIntArray278 == null) {
			this.aClass128_1 = null;
			return;
		}
		if (local9) {
			this.anInt1404 = (int) ((double) this.aClass128_1.anIntArray278.length * Math.random());
			this.anInt1396 = (int) (Math.random() * (double) this.aClass128_1.anIntArray276[this.anInt1404]) + 1;
		} else {
			this.anInt1404 = 0;
			this.anInt1396 = 1;
		}
		this.anInt1393 = this.anInt1404 + 1;
		if (this.anInt1393 < 0 || this.aClass128_1.anIntArray278.length <= this.anInt1393) {
			this.anInt1393 = -1;
		}
		this.anInt1416 = Static266.anInt4392 - this.anInt1396;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!za;I)V")
	public void method1100(@OriginalArg(0) Class163 arg0) {
		this.method1093(this.anInt1411, true, arg0, 262144, this.anInt1407, true);
	}
}
