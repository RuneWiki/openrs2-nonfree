import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class150 {

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "[Z")
	private boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	private int anInt4233;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!pj;")
	public Class1_Sub7 aClass1_Sub7_5;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!id;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	private int anInt4234;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!as;")
	private Class14_Sub2_Sub2 aClass14_Sub2_Sub2_5;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	private int anInt4237;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Lclient!gn;")
	private Class79 aClass79_3;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
	private int anInt4246;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	private int anInt4222 = -32768;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	private int anInt4242 = -1;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Z")
	private boolean aBoolean277 = false;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
	private int anInt4241 = -1;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
	public final int anInt4244;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
	private int anInt4240;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public final int anInt4226;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public final int anInt4224;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	private int anInt4228;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Z")
	private final boolean aBoolean278;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIIIZI)V")
	public Class150(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt4244 = arg1.anInt1951;
		this.aBoolean279 = arg8;
		this.anInt4240 = arg7;
		this.aByte44 = (byte) arg4;
		this.aByte43 = (byte) arg5;
		this.anInt4226 = arg2;
		this.anInt4224 = arg3;
		this.anInt4228 = arg6;
		this.aBoolean278 = arg0.method5187() && arg1.aBoolean133 && !this.aBoolean279;
		if (arg9 != -1) {
			this.aBoolean277 = true;
		}
		this.method3817(arg9);
	}

	@OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub7_5 != null) {
			this.aClass1_Sub7_5.method4328();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZIIIZILclient!e;)Lclient!id;")
	public Class45 method3814(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class46 arg5) {
		@Pc(12) Class59 local12 = Static232.method2200(this.anInt4244);
		if (local12.anIntArray176 != null) {
			local12 = local12.method1977();
		}
		if (local12 == null) {
			this.method3825(arg5);
			this.anInt4241 = this.anInt4233;
			this.anInt4242 = -1;
			return null;
		}
		if (!this.aBoolean277 && this.anInt4242 != local12.anInt1951) {
			this.aClass45_6 = null;
			this.method3817(-1);
		}
		this.method3826(arg4, arg1);
		@Pc(65) boolean local65 = arg0 & Static109.anInt2428 != 0 & this.aBoolean278;
		@Pc(104) boolean local104 = local65 & (local12.anInt1951 != this.anInt4242 || (this.anInt4233 != this.anInt4241 || this.aClass79_3 != null && (this.aClass79_3.aBoolean167 || Static308.aBoolean300) && this.anInt4246 != this.anInt4233) && Static109.anInt2428 >= 2);
		if (arg3 && !local104) {
			this.anInt4241 = this.anInt4233;
			this.anInt4242 = local12.anInt1951;
			return null;
		}
		if (local104) {
			Static123.method5341(this.aClass14_Sub2_Sub2_5, this.aByte43, this.anInt4228, this.anInt4240, this.aBooleanArray20);
		}
		@Pc(136) Class114 local136 = Static158.aClass114Array2[this.aByte43];
		@Pc(152) Class114 local152;
		if (this.aBoolean279) {
			local152 = Static18.aClass114Array1[0];
		} else {
			local152 = this.aByte43 < 3 ? Static158.aClass114Array2[this.aByte43 + 1] : null;
		}
		@Pc(160) Class45 local160 = null;
		if (this.aClass79_3 != null) {
			if (local104) {
				arg2 |= 0x20000;
			}
			local160 = local12.method1973(this.anInt4226 == 11 ? 10 : this.anInt4226, this.anInt4240, this.anInt4233, local136.method3607(this.anInt4228, this.anInt4240), local136, this.anInt4228, local152, arg5, this.anInt4226 == 11 ? this.anInt4224 + 4 : this.anInt4224, arg2, this.anInt4237, this.aClass79_3, this.anInt4246);
			if (local160 == null) {
				this.aClass14_Sub2_Sub2_5 = null;
				this.aBooleanArray20 = null;
				this.anInt4222 = 0;
			} else {
				if (local104) {
					if (this.aBooleanArray20 == null) {
						this.aBooleanArray20 = new boolean[4];
					}
					this.aClass14_Sub2_Sub2_5 = local160.method1803(this.aClass14_Sub2_Sub2_5);
					Static271.method4609(this.aClass14_Sub2_Sub2_5, this.aByte43, arg4, arg1, this.aBooleanArray20);
				}
				this.anInt4222 = local160.method1781();
			}
			this.aClass45_6 = null;
		} else if (this.aClass45_6 != null && (arg2 & this.aClass45_6.method1809()) == arg2 && this.anInt4242 == local12.anInt1951) {
			local160 = this.aClass45_6;
		} else {
			if (this.aClass45_6 != null) {
				arg2 |= this.aClass45_6.method1809();
			}
			@Pc(337) Class155 local337 = local12.method1978(local136, local104, this.anInt4226 == 11 ? this.anInt4224 + 4 : this.anInt4224, arg5, local152, this.anInt4226 == 11 ? 10 : this.anInt4226, this.anInt4240, this.anInt4228, local136.method3607(this.anInt4228, this.anInt4240), arg2);
			if (local337 == null) {
				this.anInt4222 = 0;
				this.aClass45_6 = null;
				this.aClass14_Sub2_Sub2_5 = null;
				this.aBooleanArray20 = null;
			} else {
				local160 = local337.aClass45_7;
				this.aClass45_6 = local337.aClass45_7;
				if (local104) {
					this.aClass14_Sub2_Sub2_5 = local337.aClass14_Sub2_Sub2_6;
					this.aBooleanArray20 = null;
					Static271.method4609(this.aClass14_Sub2_Sub2_5, this.aByte43, arg4, arg1, null);
				}
				this.anInt4222 = local160.method1781();
			}
		}
		this.anInt4241 = this.anInt4233;
		this.anInt4228 = arg4;
		this.anInt4242 = local12.anInt1951;
		this.anInt4240 = arg1;
		return local160;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method3816(@OriginalArg(0) int arg0) {
		this.aBoolean277 = true;
		this.method3817(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IB)V")
	private void method3817(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(24) Class59 local24 = Static232.method2200(this.anInt4244);
			@Pc(26) Class59 local26 = local24;
			if (local24.anIntArray176 != null) {
				local24 = local24.method1977();
			}
			if (local24 == null) {
				return;
			}
			if (local26 == local24) {
				local26 = null;
			}
			if (local24.anIntArray174 != null) {
				if (this.aClass79_3 != null && local24.method1974(this.aClass79_3.anInt2347)) {
					return;
				}
				local13 = local24.method1971();
				if (this.anInt4242 != local24.anInt1951) {
					local15 = local24.aBoolean140;
				}
			} else if (local24.anInt1956 == -1) {
				if (local26 != null && local26.anIntArray174 != null) {
					if (this.aClass79_3 != null && local26.method1974(this.aClass79_3.anInt2347)) {
						return;
					}
					local13 = local26.method1971();
					if (this.anInt4242 != local26.anInt1951) {
						local15 = local26.aBoolean140;
					}
				} else if (local26 != null && local26.anInt1956 != -1 && local26.anInt1951 != this.anInt4242) {
					local15 = local26.aBoolean140;
					local13 = local26.anInt1956;
				}
			} else if (local24.anInt1951 != this.anInt4242) {
				local13 = local24.anInt1956;
				local15 = local24.aBoolean140;
			}
		}
		if (local13 == -1) {
			this.aClass79_3 = null;
			return;
		}
		this.aClass45_6 = null;
		if (this.aClass79_3 == null || local13 != this.aClass79_3.anInt2347) {
			this.aClass79_3 = Static233.method4080(local13);
		} else if (this.aClass79_3.anInt2361 == 0) {
			return;
		}
		if (this.aClass79_3.anIntArray217 == null) {
			this.aClass79_3 = null;
			return;
		}
		if (local15) {
			this.anInt4233 = (int) (Math.random() * (double) this.aClass79_3.anIntArray217.length);
			this.anInt4237 = (int) ((double) this.aClass79_3.anIntArray215[this.anInt4233] * Math.random()) + 1;
		} else {
			this.anInt4233 = 0;
			this.anInt4237 = 1;
		}
		this.anInt4246 = this.anInt4233 + 1;
		if (this.anInt4246 < 0 || this.anInt4246 >= this.aClass79_3.anIntArray217.length) {
			this.anInt4246 = -1;
		}
		this.anInt4234 = Static153.anInt3257 - this.anInt4237;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)Z")
	public boolean method3819() {
		return this.aBoolean278;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I")
	public int method3821() {
		return this.anInt4222;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLclient!e;IIIIILclient!id;)V")
	public void method3822(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class45 arg6) {
		@Pc(6) Class115[] local6 = arg6.method1787();
		@Pc(9) Class101[] local9 = arg6.method1776();
		if ((this.aClass1_Sub7_5 == null || this.aClass1_Sub7_5.aBoolean319) && (local6 != null || local9 != null)) {
			@Pc(25) Class59 local25 = Static232.method2200(this.anInt4244);
			if (local25.anIntArray176 != null) {
				local25 = local25.method1977();
			}
			if (local25 != null) {
				this.aClass1_Sub7_5 = new Class1_Sub7(Static153.anInt3257);
			}
		}
		if (this.aClass1_Sub7_5 == null) {
			return;
		}
		if (arg0) {
			this.aClass1_Sub7_5.method4319(arg1, (long) Static153.anInt3257, local6, local9);
		} else {
			this.aClass1_Sub7_5.method4325((long) Static153.anInt3257);
		}
		this.aClass1_Sub7_5.method4323(this.aByte44, arg2, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!e;B)V")
	public void method3825(@OriginalArg(0) Class46 arg0) {
		if (this.aClass14_Sub2_Sub2_5 != null) {
			Static123.method5341(this.aClass14_Sub2_Sub2_5, this.aByte43, this.anInt4228, this.anInt4240, this.aBooleanArray20);
			this.aBooleanArray20 = null;
			this.aClass14_Sub2_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	private void method3826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass79_3 == null) {
				if (this.aBoolean277) {
					return;
				}
				this.method3817(-1);
				if (this.aClass79_3 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static153.anInt3257 - this.anInt4234;
			if (local29 > 100 && this.aClass79_3.anInt2353 > 0) {
				@Pc(46) int local46 = this.aClass79_3.anIntArray217.length - this.aClass79_3.anInt2353;
				while (this.anInt4233 < local46 && local29 > this.aClass79_3.anIntArray215[this.anInt4233]) {
					local29 -= this.aClass79_3.anIntArray215[this.anInt4233];
					this.anInt4233++;
				}
				if (this.anInt4233 >= local46) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local46; local91 < this.aClass79_3.anIntArray217.length; local91++) {
						local89 += this.aClass79_3.anIntArray215[local91];
					}
					local29 %= local89;
				}
				this.anInt4246 = this.anInt4233 + 1;
				if (this.anInt4246 >= this.aClass79_3.anIntArray217.length) {
					this.anInt4246 -= this.aClass79_3.anInt2353;
					if (this.anInt4246 < 0 || this.anInt4246 >= this.aClass79_3.anIntArray217.length) {
						this.anInt4246 = -1;
					}
				}
			}
			while (this.aClass79_3.anIntArray215[this.anInt4233] < local29) {
				Static273.method4631(arg1, this.anInt4233, arg0, false, this.aClass79_3);
				local29 -= this.aClass79_3.anIntArray215[this.anInt4233];
				this.anInt4233++;
				if (this.anInt4233 >= this.aClass79_3.anIntArray217.length) {
					this.anInt4233 -= this.aClass79_3.anInt2353;
					if (this.anInt4233 < 0 || this.anInt4233 >= this.aClass79_3.anIntArray217.length) {
						this.aClass79_3 = null;
						continue label80;
					}
				}
				this.anInt4246 = this.anInt4233 + 1;
				if (this.aClass79_3.anIntArray217.length <= this.anInt4246) {
					this.anInt4246 -= this.aClass79_3.anInt2353;
					if (this.anInt4246 < 0 || this.anInt4246 >= this.aClass79_3.anIntArray217.length) {
						this.anInt4246 = -1;
					}
				}
			}
			this.anInt4237 = local29;
			this.anInt4234 = Static153.anInt3257 - local29;
			return;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!e;)V")
	public void method3827(@OriginalArg(1) Class46 arg0) {
		this.method3814(true, this.anInt4240, 131072, true, this.anInt4228, arg0);
	}
}
