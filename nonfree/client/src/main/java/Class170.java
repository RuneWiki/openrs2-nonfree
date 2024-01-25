import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class170 {

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	private int anInt4271;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "[Z")
	private boolean[] aBooleanArray104;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	private int anInt4273;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	private int anInt4275;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!ok;")
	private Class177 aClass177_1;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "Lclient!f;")
	private Class75 aClass75_5;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	private int anInt4281;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "Lclient!g;")
	public Class12_Sub4 aClass12_Sub4_3;

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "Lclient!tm;")
	private Class3_Sub7_Sub6 aClass3_Sub7_Sub6_4;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	private int anInt4285 = -1;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
	private int anInt4284 = -1;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	private int anInt4278 = -32768;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public final int anInt4279;

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	private int anInt4280;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public final int anInt4272;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	private int anInt4274;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
	public final int anInt4283;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Z")
	private final boolean aBoolean333;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIIZI)V")
	public Class170(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt4279 = arg2;
		this.aByte55 = (byte) arg5;
		this.anInt4280 = arg7;
		this.aByte54 = (byte) arg4;
		this.anInt4272 = arg3;
		this.aBoolean332 = arg8;
		this.anInt4274 = arg6;
		this.anInt4283 = arg1.anInt1402;
		this.aBoolean333 = arg0.method4914() && arg1.aBoolean95 && !this.aBoolean332;
		if (arg9 != -1) {
			this.aBoolean334 = true;
		}
		this.method3980(arg9);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V")
	public void method3973(@OriginalArg(0) int arg0) {
		this.aBoolean334 = true;
		this.method3980(arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z")
	public boolean method3974() {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)V")
	private void method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass177_1 == null) {
				if (this.aBoolean334) {
					return;
				}
				this.method3980(-1);
				if (this.aClass177_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static76.anInt1617 - this.anInt4281;
			if (local30 > 100 && this.aClass177_1.anInt4497 > 0) {
				@Pc(52) int local52 = this.aClass177_1.anIntArray499.length - this.aClass177_1.anInt4497;
				while (this.anInt4275 < local52 && this.aClass177_1.anIntArray501[this.anInt4275] < local30) {
					local30 -= this.aClass177_1.anIntArray501[this.anInt4275];
					this.anInt4275++;
				}
				if (local52 <= this.anInt4275) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass177_1.anIntArray499.length; local97++) {
						local95 += this.aClass177_1.anIntArray501[local97];
					}
					local30 %= local95;
				}
				this.anInt4271 = this.anInt4275 + 1;
				if (this.aClass177_1.anIntArray499.length <= this.anInt4271) {
					this.anInt4271 -= this.aClass177_1.anInt4497;
					if (this.anInt4271 < 0 || this.aClass177_1.anIntArray499.length <= this.anInt4271) {
						this.anInt4271 = -1;
					}
				}
			}
			while (local30 > this.aClass177_1.anIntArray501[this.anInt4275]) {
				Static351.method2911(this.aByte54, arg1, this.anInt4275, this.aClass177_1, arg0, false);
				local30 -= this.aClass177_1.anIntArray501[this.anInt4275];
				this.anInt4275++;
				if (this.aClass177_1.anIntArray499.length <= this.anInt4275) {
					this.anInt4275 -= this.aClass177_1.anInt4497;
					if (this.anInt4275 < 0 || this.aClass177_1.anIntArray499.length <= this.anInt4275) {
						this.aClass177_1 = null;
						continue label80;
					}
				}
				this.anInt4271 = this.anInt4275 + 1;
				if (this.anInt4271 >= this.aClass177_1.anIntArray499.length) {
					this.anInt4271 -= this.aClass177_1.anInt4497;
					if (this.anInt4271 < 0 || this.aClass177_1.anIntArray499.length <= this.anInt4271) {
						this.anInt4271 = -1;
					}
				}
			}
			this.anInt4281 = Static76.anInt1617 - local30;
			this.anInt4273 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIILclient!np;IILclient!f;I)V")
	public void method3976(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class241[] local6 = arg5.method5480();
		@Pc(9) Class158[] local9 = arg5.method5488();
		if ((this.aClass12_Sub4_3 == null || this.aClass12_Sub4_3.aBoolean160) && (local6 != null || local9 != null)) {
			@Pc(26) Class60 local26 = Static97.aClass217_4.method5007(this.anInt4283);
			if (local26.anIntArray134 != null) {
				local26 = local26.method1191(Static331.aClass115_1);
			}
			if (local26 != null) {
				this.aClass12_Sub4_3 = new Class12_Sub4(Static76.anInt1617);
			}
		}
		if (this.aClass12_Sub4_3 == null) {
			return;
		}
		if (arg0) {
			this.aClass12_Sub4_3.method1803(arg3, (long) Static76.anInt1617, local6, local9);
		} else {
			this.aClass12_Sub4_3.method1805((long) Static76.anInt1617);
		}
		this.aClass12_Sub4_3.method1793(this.aByte54, arg4, arg1, arg6, arg2);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!np;I)V")
	public void method3977(@OriginalArg(0) Class155 arg0) {
		this.method3979(this.anInt4274, true, arg0, true, this.anInt4280, 131072);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLclient!np;)V")
	public void method3978(@OriginalArg(1) Class155 arg0) {
		if (this.aClass3_Sub7_Sub6_4 != null) {
			Static365.method5440(this.aClass3_Sub7_Sub6_4, this.aByte55, this.anInt4274, this.anInt4280, this.aBooleanArray104);
			this.aClass3_Sub7_Sub6_4 = null;
			this.aBooleanArray104 = null;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLclient!np;IZII)Lclient!f;")
	public Class75 method3979(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class60 local13 = Static97.aClass217_4.method5007(this.anInt4283);
		if (local13.anIntArray134 != null) {
			local13 = local13.method1191(Static331.aClass115_1);
		}
		if (local13 == null) {
			this.method3978(arg2);
			this.anInt4284 = -1;
			this.anInt4285 = this.anInt4275;
			return null;
		}
		if (!this.aBoolean334 && this.anInt4284 != local13.anInt1402) {
			this.aClass75_5 = null;
			this.method3980(-1);
		}
		this.method3975(arg4, arg0);
		@Pc(71) boolean local71 = arg3 & this.aBoolean333 & Static164.aClass154_Sub1_1.anInt6057 != 0;
		@Pc(107) boolean local107 = local71 & (this.anInt4284 != local13.anInt1402 || (this.anInt4275 != this.anInt4285 || this.aClass177_1 != null && (this.aClass177_1.aBoolean353 || Static120.aBoolean173) && this.anInt4271 != this.anInt4275) && Static164.aClass154_Sub1_1.anInt6057 >= 2);
		if (arg1 && !local107) {
			this.anInt4285 = this.anInt4275;
			this.anInt4284 = local13.anInt1402;
			return null;
		}
		if (local107) {
			Static365.method5440(this.aClass3_Sub7_Sub6_4, this.aByte55, this.anInt4274, this.anInt4280, this.aBooleanArray104);
		}
		@Pc(139) Class7 local139 = Static337.aClass7Array3[this.aByte55];
		@Pc(157) Class7 local157;
		if (this.aBoolean332) {
			local157 = Static89.aClass7Array4[0];
		} else {
			local157 = this.aByte55 >= 3 ? null : Static337.aClass7Array3[this.aByte55 + 1];
		}
		@Pc(165) Class75 local165 = null;
		if (this.aClass177_1 != null) {
			if (local107) {
				arg5 |= 0x20000;
			}
			local165 = local13.method1188(local157, this.anInt4274, this.anInt4275, this.aClass177_1, local139.method5638(this.anInt4274, this.anInt4280), this.anInt4279 == 11 ? 10 : this.anInt4279, this.anInt4273, this.anInt4271, this.anInt4280, this.anInt4279 == 11 ? this.anInt4272 + 4 : this.anInt4272, local139, arg2, arg5);
			if (local165 == null) {
				this.aBooleanArray104 = null;
				this.anInt4278 = 0;
				this.aClass3_Sub7_Sub6_4 = null;
			} else {
				if (local107) {
					if (this.aBooleanArray104 == null) {
						this.aBooleanArray104 = new boolean[4];
					}
					this.aClass3_Sub7_Sub6_4 = local165.method5470(this.aClass3_Sub7_Sub6_4);
					Static235.method3892(this.aClass3_Sub7_Sub6_4, this.aByte55, arg0, arg4, this.aBooleanArray104);
				}
				this.anInt4278 = local165.method5476();
			}
			this.aClass75_5 = null;
		} else if (this.aClass75_5 != null && (arg5 & this.aClass75_5.method5462()) == arg5 && local13.anInt1402 == this.anInt4284) {
			local165 = this.aClass75_5;
		} else {
			if (this.aClass75_5 != null) {
				arg5 |= this.aClass75_5.method5462();
			}
			@Pc(343) Class188 local343 = local13.method1203(this.anInt4280, arg5, local107, local139.method5638(this.anInt4274, this.anInt4280), this.anInt4279 == 11 ? this.anInt4272 + 4 : this.anInt4272, arg2, this.anInt4274, local157, local139, this.anInt4279 == 11 ? 10 : this.anInt4279);
			if (local343 == null) {
				this.aClass3_Sub7_Sub6_4 = null;
				this.aClass75_5 = null;
				this.anInt4278 = 0;
				this.aBooleanArray104 = null;
			} else {
				local165 = local343.aClass75_6;
				this.aClass75_5 = local343.aClass75_6;
				if (local107) {
					this.aClass3_Sub7_Sub6_4 = local343.aClass3_Sub7_Sub6_5;
					this.aBooleanArray104 = null;
					Static235.method3892(this.aClass3_Sub7_Sub6_4, this.aByte55, arg0, arg4, null);
				}
				this.anInt4278 = local165.method5476();
			}
		}
		this.anInt4280 = arg4;
		this.anInt4274 = arg0;
		this.anInt4285 = this.anInt4275;
		this.anInt4284 = local13.anInt1402;
		return local165;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
	private void method3980(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class60 local18 = Static97.aClass217_4.method5007(this.anInt4283);
			@Pc(20) Class60 local20 = local18;
			if (local18.anIntArray134 != null) {
				local18 = local18.method1191(Static331.aClass115_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray138 != null) {
				if (this.aClass177_1 != null && local18.method1190(this.aClass177_1.anInt4515)) {
					return;
				}
				local7 = local18.method1186();
				if (this.anInt4284 != local18.anInt1402) {
					local9 = local18.aBoolean86;
				}
			} else if (local18.anInt1396 == -1) {
				if (local20 != null && local20.anIntArray138 != null) {
					if (this.aClass177_1 != null && local20.method1190(this.aClass177_1.anInt4515)) {
						return;
					}
					local7 = local20.method1186();
					if (this.anInt4284 != local20.anInt1402) {
						local9 = local20.aBoolean86;
					}
				} else if (local20 != null && local20.anInt1396 != -1 && local20.anInt1402 != this.anInt4284) {
					local9 = local20.aBoolean86;
					local7 = local20.anInt1396;
				}
			} else if (local18.anInt1402 != this.anInt4284) {
				local7 = local18.anInt1396;
				local9 = local18.aBoolean86;
			}
		}
		if (local7 == -1) {
			this.aClass177_1 = null;
			return;
		}
		this.aClass75_5 = null;
		if (this.aClass177_1 == null || local7 != this.aClass177_1.anInt4515) {
			this.aClass177_1 = Static176.aClass43_2.method930(local7);
		} else if (this.aClass177_1.anInt4500 == 0) {
			return;
		}
		if (this.aClass177_1.anIntArray499 == null) {
			this.aClass177_1 = null;
			return;
		}
		if (local9) {
			this.anInt4275 = (int) (Math.random() * (double) this.aClass177_1.anIntArray499.length);
			this.anInt4273 = (int) (Math.random() * (double) this.aClass177_1.anIntArray501[this.anInt4275]) + 1;
		} else {
			this.anInt4275 = 0;
			this.anInt4273 = 1;
		}
		this.anInt4271 = this.anInt4275 + 1;
		if (this.anInt4271 < 0 || this.aClass177_1.anIntArray499.length <= this.anInt4271) {
			this.anInt4271 = -1;
		}
		this.anInt4281 = Static76.anInt1617 - this.anInt4273;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)I")
	public int method3981() {
		return this.anInt4278;
	}

	@OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_3 != null) {
			this.aClass12_Sub4_3.method1799();
		}
	}
}
