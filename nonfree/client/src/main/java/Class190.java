import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class190 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!mj;")
	private Class101 aClass101_6;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!pl;")
	public Class63_Sub5 aClass63_Sub5_6;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private int anInt5874;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private int anInt5877;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!bb;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "[Z")
	private boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!lg;")
	private Class5_Sub9_Sub14 aClass5_Sub9_Sub14_5;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	private int anInt5888;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "Z")
	private boolean aBoolean441 = false;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	private int anInt5890 = -32768;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	private int anInt5887 = -1;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	private int anInt5889 = -1;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "I")
	public final int anInt5883;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	public final int anInt5878;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	public final int anInt5881;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIIZI)V")
	public Class190(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aBoolean440 = arg8;
		this.anInt5883 = arg1.anInt4114;
		this.aByte64 = (byte) arg5;
		this.anInt5891 = arg6;
		this.anInt5872 = arg7;
		this.anInt5878 = arg3;
		this.anInt5881 = arg2;
		this.aByte65 = (byte) arg4;
		this.aBoolean439 = arg0.method4842() && arg1.aBoolean295 && !this.aBoolean440;
		if (arg9 != -1) {
			this.aBoolean441 = true;
		}
		this.method5224(arg9);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)V")
	private void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass17_3 == null) {
				if (this.aBoolean441) {
					return;
				}
				this.method5224(-1);
				if (this.aClass17_3 == null) {
					return;
				}
			}
			@Pc(38) int local38 = Static180.anInt3606 - this.anInt5877;
			if (local38 > 100 && this.aClass17_3.anInt520 > 0) {
				@Pc(58) int local58 = this.aClass17_3.anIntArray24.length - this.aClass17_3.anInt520;
				while (local58 > this.anInt5885 && local38 > this.aClass17_3.anIntArray26[this.anInt5885]) {
					local38 -= this.aClass17_3.anIntArray26[this.anInt5885];
					this.anInt5885++;
				}
				if (this.anInt5885 >= local58) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local58; local95 < this.aClass17_3.anIntArray24.length; local95++) {
						local93 += this.aClass17_3.anIntArray26[local95];
					}
					local38 %= local93;
				}
				this.anInt5888 = this.anInt5885 + 1;
				if (this.aClass17_3.anIntArray24.length <= this.anInt5888) {
					this.anInt5888 -= this.aClass17_3.anInt520;
					if (this.anInt5888 < 0 || this.aClass17_3.anIntArray24.length <= this.anInt5888) {
						this.anInt5888 = -1;
					}
				}
			}
			while (local38 > this.aClass17_3.anIntArray26[this.anInt5885]) {
				Static207.method3696(this.anInt5885, arg1, this.aClass17_3, arg0, false);
				local38 -= this.aClass17_3.anIntArray26[this.anInt5885];
				this.anInt5885++;
				if (this.anInt5885 >= this.aClass17_3.anIntArray24.length) {
					this.anInt5885 -= this.aClass17_3.anInt520;
					if (this.anInt5885 < 0 || this.anInt5885 >= this.aClass17_3.anIntArray24.length) {
						this.aClass17_3 = null;
						continue label80;
					}
				}
				this.anInt5888 = this.anInt5885 + 1;
				if (this.anInt5888 >= this.aClass17_3.anIntArray24.length) {
					this.anInt5888 -= this.aClass17_3.anInt520;
					if (this.anInt5888 < 0 || this.anInt5888 >= this.aClass17_3.anIntArray24.length) {
						this.anInt5888 = -1;
					}
				}
			}
			this.anInt5874 = local38;
			this.anInt5877 = Static180.anInt3606 - local38;
			return;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method5222(@OriginalArg(1) int arg0) {
		this.aBoolean441 = true;
		this.method5224(arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!en;)V")
	public void method5223(@OriginalArg(1) Class59 arg0) {
		if (this.aClass5_Sub9_Sub14_5 != null) {
			Static204.method3634(this.aClass5_Sub9_Sub14_5, this.aByte64, this.anInt5891, this.anInt5872, this.aBooleanArray28);
			this.aClass5_Sub9_Sub14_5 = null;
			this.aBooleanArray28 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)V")
	private void method5224(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class137 local17 = Static228.method3923(this.anInt5883);
			@Pc(19) Class137 local19 = local17;
			if (local17.anIntArray296 != null) {
				local17 = local17.method3720();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray294 != null) {
				if (this.aClass17_3 != null && local17.method3709(this.aClass17_3.anInt509)) {
					return;
				}
				local7 = local17.method3708();
				if (this.anInt5887 != local17.anInt4114) {
					local9 = local17.aBoolean293;
				}
			} else if (local17.anInt4144 == -1) {
				if (local19 != null && local19.anIntArray294 != null) {
					if (this.aClass17_3 != null && local19.method3709(this.aClass17_3.anInt509)) {
						return;
					}
					local7 = local19.method3708();
					if (this.anInt5887 != local19.anInt4114) {
						local9 = local19.aBoolean293;
					}
				} else if (local19 != null && local19.anInt4144 != -1 && local19.anInt4114 != this.anInt5887) {
					local7 = local19.anInt4144;
					local9 = local19.aBoolean293;
				}
			} else if (local17.anInt4114 != this.anInt5887) {
				local9 = local17.aBoolean293;
				local7 = local17.anInt4144;
			}
		}
		if (local7 == -1) {
			this.aClass17_3 = null;
			return;
		}
		this.aClass101_6 = null;
		if (this.aClass17_3 == null || this.aClass17_3.anInt509 != local7) {
			this.aClass17_3 = Static261.method4492(local7);
		} else if (this.aClass17_3.anInt505 == 0) {
			return;
		}
		if (this.aClass17_3.anIntArray24 == null) {
			this.aClass17_3 = null;
			return;
		}
		if (local9) {
			this.anInt5885 = (int) (Math.random() * (double) this.aClass17_3.anIntArray24.length);
			this.anInt5874 = (int) (Math.random() * (double) this.aClass17_3.anIntArray26[this.anInt5885]) + 1;
		} else {
			this.anInt5885 = 0;
			this.anInt5874 = 1;
		}
		this.anInt5888 = this.anInt5885 + 1;
		if (this.anInt5888 < 0 || this.anInt5888 >= this.aClass17_3.anIntArray24.length) {
			this.anInt5888 = -1;
		}
		this.anInt5877 = Static180.anInt3606 - this.anInt5874;
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass63_Sub5_6 != null) {
			this.aClass63_Sub5_6.method4124();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!en;I)V")
	public void method5227(@OriginalArg(0) Class59 arg0) {
		this.method5231(this.anInt5872, true, arg0, true, this.anInt5891, 131072);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZBLclient!en;ILclient!mj;)V")
	public void method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class101 arg6) {
		@Pc(19) Class140[] local19 = arg6.method5164();
		@Pc(22) Class151[] local22 = arg6.method5161();
		if ((this.aClass63_Sub5_6 == null || this.aClass63_Sub5_6.aBoolean343) && (local19 != null || local22 != null)) {
			@Pc(38) Class137 local38 = Static228.method3923(this.anInt5883);
			if (local38.anIntArray296 != null) {
				local38 = local38.method3720();
			}
			if (local38 != null) {
				this.aClass63_Sub5_6 = new Class63_Sub5(Static180.anInt3606);
			}
		}
		if (this.aClass63_Sub5_6 == null) {
			return;
		}
		if (arg3) {
			this.aClass63_Sub5_6.method4118(arg4, (long) Static180.anInt3606, local19, local22);
		} else {
			this.aClass63_Sub5_6.method4119((long) Static180.anInt3606);
		}
		this.aClass63_Sub5_6.method4116(this.aByte65, arg1, arg0, arg5, arg2);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z")
	public boolean method5229() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I")
	public int method5230() {
		return this.anInt5890;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLclient!en;ZIBI)Lclient!mj;")
	public Class101 method5231(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class137 local10 = Static228.method3923(this.anInt5883);
		if (local10.anIntArray296 != null) {
			local10 = local10.method3720();
		}
		if (local10 == null) {
			this.method5223(arg2);
			this.anInt5887 = -1;
			this.anInt5889 = this.anInt5885;
			return null;
		}
		if (!this.aBoolean441 && this.anInt5887 != local10.anInt4114) {
			this.aClass101_6 = null;
			this.method5224(-1);
		}
		this.method5221(arg0, arg4);
		@Pc(63) boolean local63 = arg1 & Static134.anInt2750 != 0 & this.aBoolean439;
		@Pc(113) boolean local113 = local63 & (this.anInt5887 != local10.anInt4114 || (this.anInt5885 != this.anInt5889 || this.aClass17_3 != null && (this.aClass17_3.aBoolean36 || Static353.aBoolean489) && this.anInt5885 != this.anInt5888) && Static134.anInt2750 >= 2);
		if (arg3 && !local113) {
			this.anInt5889 = this.anInt5885;
			this.anInt5887 = local10.anInt4114;
			return null;
		}
		if (local113) {
			Static204.method3634(this.aClass5_Sub9_Sub14_5, this.aByte64, this.anInt5891, this.anInt5872, this.aBooleanArray28);
		}
		@Pc(145) Class3 local145 = Static130.aClass3Array2[this.aByte64];
		@Pc(152) Class3 local152;
		if (this.aBoolean440) {
			local152 = Static262.aClass3Array3[0];
		} else {
			local152 = this.aByte64 >= 3 ? null : Static130.aClass3Array2[this.aByte64 + 1];
		}
		@Pc(169) Class101 local169 = null;
		if (this.aClass17_3 != null) {
			if (local113) {
				arg5 |= 0x20000;
			}
			local169 = local10.method3705(this.anInt5874, local145.method5639(this.anInt5891, this.anInt5872), arg5, arg2, this.anInt5872, this.anInt5888, this.anInt5891, this.aClass17_3, this.anInt5881 == 11 ? 10 : this.anInt5881, local145, local152, this.anInt5881 == 11 ? this.anInt5878 + 4 : this.anInt5878, this.anInt5885);
			if (local169 == null) {
				this.aClass5_Sub9_Sub14_5 = null;
				this.aBooleanArray28 = null;
				this.anInt5890 = 0;
			} else {
				if (local113) {
					if (this.aBooleanArray28 == null) {
						this.aBooleanArray28 = new boolean[4];
					}
					this.aClass5_Sub9_Sub14_5 = local169.method5182(this.aClass5_Sub9_Sub14_5);
					Static161.method2990(this.aClass5_Sub9_Sub14_5, this.aByte64, arg4, arg0, this.aBooleanArray28);
				}
				this.anInt5890 = local169.method5147();
			}
			this.aClass101_6 = null;
		} else if (this.aClass101_6 != null && (arg5 & this.aClass101_6.method5171()) == arg5 && local10.anInt4114 == this.anInt5887) {
			local169 = this.aClass101_6;
		} else {
			if (this.aClass101_6 != null) {
				arg5 |= this.aClass101_6.method5171();
			}
			@Pc(240) Class72 local240 = local10.method3706(local145.method5639(this.anInt5891, this.anInt5872), local152, this.anInt5881 == 11 ? this.anInt5878 + 4 : this.anInt5878, this.anInt5881 == 11 ? 10 : this.anInt5881, local113, this.anInt5891, arg5, arg2, local145, this.anInt5872);
			if (local240 == null) {
				this.aClass101_6 = null;
				this.anInt5890 = 0;
				this.aClass5_Sub9_Sub14_5 = null;
				this.aBooleanArray28 = null;
			} else {
				local169 = local240.aClass101_2;
				this.aClass101_6 = local240.aClass101_2;
				if (local113) {
					this.aBooleanArray28 = null;
					this.aClass5_Sub9_Sub14_5 = local240.aClass5_Sub9_Sub14_2;
					Static161.method2990(this.aClass5_Sub9_Sub14_5, this.aByte64, arg4, arg0, null);
				}
				this.anInt5890 = local169.method5147();
			}
		}
		this.anInt5889 = this.anInt5885;
		this.anInt5891 = arg4;
		this.anInt5887 = local10.anInt4114;
		this.anInt5872 = arg0;
		return local169;
	}
}
