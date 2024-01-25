import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class79 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!tt;")
	private Class280 aClass280_2;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Lclient!dea;")
	public Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "[Z")
	private boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!el", name = "I", descriptor = "Lclient!r;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	private int anInt2563 = -1;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "I")
	private int anInt2575 = -1;

	@OriginalMember(owner = "client!el", name = "J", descriptor = "I")
	private int anInt2580 = -32768;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!el", name = "H", descriptor = "I")
	public final int anInt2579;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private int anInt2558;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public final int anInt2557;

	@OriginalMember(owner = "client!el", name = "B", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	public final int anInt2570;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!el", name = "z", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIIZI)V")
	public Class79(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2565 = arg6;
		this.anInt2579 = arg2;
		this.anInt2558 = arg7;
		this.anInt2557 = arg3;
		this.aByte15 = (byte) arg5;
		this.anInt2570 = arg1.anInt8333;
		this.aBoolean181 = arg8;
		this.aByte14 = (byte) arg4;
		this.aBoolean182 = arg0.method7611() && arg1.aBoolean576 && !this.aBoolean181;
		if (arg9 != -1) {
			this.aBoolean180 = true;
		}
		this.method2417(arg9);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I")
	public int method2408() {
		return this.anInt2580;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)V")
	private void method2409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass280_2 == null) {
				if (this.aBoolean180) {
					return;
				}
				this.method2417(-1);
				if (this.aClass280_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static416.anInt7252 - this.anInt2559;
			if (local33 > 100 && this.aClass280_2.anInt8105 > 0) {
				@Pc(54) int local54 = this.aClass280_2.anIntArray629.length - this.aClass280_2.anInt8105;
				while (local54 > this.anInt2578 && local33 > this.aClass280_2.anIntArray630[this.anInt2578]) {
					local33 -= this.aClass280_2.anIntArray630[this.anInt2578];
					this.anInt2578++;
				}
				if (local54 <= this.anInt2578) {
					@Pc(101) int local101 = 0;
					for (@Pc(103) int local103 = local54; local103 < this.aClass280_2.anIntArray629.length; local103++) {
						local101 += this.aClass280_2.anIntArray630[local103];
					}
					local33 %= local101;
				}
				this.anInt2560 = this.anInt2578 + 1;
				if (this.aClass280_2.anIntArray629.length <= this.anInt2560) {
					this.anInt2560 -= this.aClass280_2.anInt8105;
					if (this.anInt2560 < 0 || this.anInt2560 >= this.aClass280_2.anIntArray629.length) {
						this.anInt2560 = -1;
					}
				}
			}
			while (local33 > this.aClass280_2.anIntArray630[this.anInt2578]) {
				Static351.method5589(arg0, this.aClass280_2, false, this.aByte14, arg1, this.anInt2578);
				local33 -= this.aClass280_2.anIntArray630[this.anInt2578];
				this.anInt2578++;
				if (this.anInt2578 >= this.aClass280_2.anIntArray629.length) {
					this.anInt2578 -= this.aClass280_2.anInt8105;
					if (this.anInt2578 < 0 || this.aClass280_2.anIntArray629.length <= this.anInt2578) {
						this.aClass280_2 = null;
						continue label80;
					}
				}
				this.anInt2560 = this.anInt2578 + 1;
				if (this.aClass280_2.anIntArray629.length <= this.anInt2560) {
					this.anInt2560 -= this.aClass280_2.anInt8105;
					if (this.anInt2560 < 0 || this.aClass280_2.anIntArray629.length <= this.anInt2560) {
						this.anInt2560 = -1;
					}
				}
			}
			this.anInt2573 = local33;
			this.anInt2559 = Static416.anInt7252 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BZIILclient!qa;IZ)Lclient!r;")
	public Class19 method2410(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class288 local11 = Static365.aClass194_6.method5084(this.anInt2570);
		if (local11.anIntArray650 != null) {
			local11 = local11.method7065(Static343.aClass286_1);
		}
		if (local11 == null) {
			this.method2416(arg3);
			this.anInt2563 = this.anInt2578;
			this.anInt2575 = -1;
			return null;
		}
		if (!this.aBoolean180 && this.anInt2575 != local11.anInt8333) {
			this.aClass19_1 = null;
			this.method2417(-1);
		}
		this.method2409(arg2, arg1);
		@Pc(75) boolean local75 = arg5 & this.aBoolean182 & Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) != 0;
		@Pc(117) boolean local117 = local75 & (this.anInt2575 != local11.anInt8333 || (this.anInt2563 != this.anInt2578 || this.aClass280_2 != null && (this.aClass280_2.aBoolean546 || Static306.aBoolean405) && this.anInt2560 != this.anInt2578) && Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) >= 2);
		if (arg0 && !local117) {
			this.anInt2575 = local11.anInt8333;
			this.anInt2563 = this.anInt2578;
			return null;
		}
		if (local117) {
			Static11.method241(this.aClass1_Sub1_Sub4_1, this.aByte15, this.anInt2565, this.anInt2558, this.aBooleanArray13);
		}
		@Pc(149) Class10 local149 = Static290.aClass10Array7[this.aByte15];
		@Pc(170) Class10 local170;
		if (this.aBoolean181) {
			local170 = Static53.aClass10Array3[0];
		} else {
			local170 = this.aByte15 < 3 ? Static290.aClass10Array7[this.aByte15 + 1] : null;
		}
		@Pc(178) Class19 local178 = null;
		if (this.aClass280_2 != null) {
			if (local117) {
				arg4 |= 0x40000;
			}
			local178 = local11.method7069(this.anInt2578, local170, this.anInt2558, local149.aa(this.anInt2565, this.anInt2558), this.anInt2565, local149, this.aClass280_2, this.anInt2560, this.anInt2573, this.anInt2579 == 11 ? 10 : this.anInt2579, arg3, this.anInt2579 == 11 ? this.anInt2557 + 4 : this.anInt2557, arg4);
			if (local178 == null) {
				this.aClass1_Sub1_Sub4_1 = null;
				this.anInt2580 = 0;
				this.aBooleanArray13 = null;
			} else {
				if (local117) {
					if (this.aBooleanArray13 == null) {
						this.aBooleanArray13 = new boolean[4];
					}
					this.aClass1_Sub1_Sub4_1 = local178.EA(this.aClass1_Sub1_Sub4_1);
					Static354.method5622(this.aClass1_Sub1_Sub4_1, this.aByte15, arg2, arg1, this.aBooleanArray13);
				}
				this.anInt2580 = local178.TA();
			}
			this.aClass19_1 = null;
		} else if (this.aClass19_1 != null && (arg4 & this.aClass19_1.ba()) == arg4 && local11.anInt8333 == this.anInt2575) {
			local178 = this.aClass19_1;
		} else {
			if (this.aClass19_1 != null) {
				arg4 |= this.aClass19_1.ba();
			}
			@Pc(348) Class139 local348 = local11.method7071(this.anInt2565, this.anInt2579 == 11 ? 10 : this.anInt2579, local117, arg4, this.anInt2558, local170, local149, this.anInt2579 == 11 ? this.anInt2557 + 4 : this.anInt2557, arg3, local149.aa(this.anInt2565, this.anInt2558));
			if (local348 == null) {
				this.aClass1_Sub1_Sub4_1 = null;
				this.aClass19_1 = null;
				this.aBooleanArray13 = null;
				this.anInt2580 = 0;
			} else {
				local178 = local348.aClass19_3;
				this.aClass19_1 = local348.aClass19_3;
				if (local117) {
					this.aBooleanArray13 = null;
					this.aClass1_Sub1_Sub4_1 = local348.aClass1_Sub1_Sub4_3;
					Static354.method5622(this.aClass1_Sub1_Sub4_1, this.aByte15, arg2, arg1, null);
				}
				this.anInt2580 = local178.TA();
			}
		}
		this.anInt2563 = this.anInt2578;
		this.anInt2565 = arg2;
		this.anInt2575 = local11.anInt8333;
		this.anInt2558 = arg1;
		return local178;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLclient!qa;IBLclient!r;II)V")
	public void method2411(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class178[] local6 = arg4.method7251();
		@Pc(9) Class129[] local9 = arg4.method7246();
		if ((this.aClass2_Sub3_3 == null || this.aClass2_Sub3_3.aBoolean161) && (local6 != null || local9 != null)) {
			@Pc(26) Class288 local26 = Static365.aClass194_6.method5084(this.anInt2570);
			if (local26.anIntArray650 != null) {
				local26 = local26.method7065(Static343.aClass286_1);
			}
			if (local26 != null) {
				this.aClass2_Sub3_3 = Static84.method2069(Static416.anInt7252);
			}
		}
		if (this.aClass2_Sub3_3 == null) {
			return;
		}
		if (arg1) {
			this.aClass2_Sub3_3.method2077(arg2, (long) Static416.anInt7252, local6, local9);
		} else {
			this.aClass2_Sub3_3.method2078((long) Static416.anInt7252);
		}
		this.aClass2_Sub3_3.method2071(this.aByte14, arg6, arg5, arg0, arg3);
	}

	@OriginalMember(owner = "client!el", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub3_3 != null) {
			this.aClass2_Sub3_3.method2079();
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
	public boolean method2413() {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	public void method2415(@OriginalArg(0) int arg0) {
		this.aBoolean180 = true;
		this.method2417(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method2416(@OriginalArg(0) Class9 arg0) {
		if (this.aClass1_Sub1_Sub4_1 != null) {
			Static11.method241(this.aClass1_Sub1_Sub4_1, this.aByte15, this.anInt2565, this.anInt2558, this.aBooleanArray13);
			this.aClass1_Sub1_Sub4_1 = null;
			this.aBooleanArray13 = null;
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
	private void method2417(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(17) Class288 local17 = Static365.aClass194_6.method5084(this.anInt2570);
			@Pc(19) Class288 local19 = local17;
			if (local17.anIntArray650 != null) {
				local17 = local17.method7065(Static343.aClass286_1);
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray653 != null) {
				if (this.aClass280_2 != null && local17.method7060(this.aClass280_2.anInt8107)) {
					return;
				}
				local5 = local17.method7054();
				if (local17.anInt8333 != this.anInt2575) {
					local7 = local17.aBoolean581;
				}
			} else if (local17.anInt8320 == -1) {
				if (local19 != null && local19.anIntArray653 != null) {
					if (this.aClass280_2 != null && local19.method7060(this.aClass280_2.anInt8107)) {
						return;
					}
					local5 = local19.method7054();
					if (local19.anInt8333 != this.anInt2575) {
						local7 = local19.aBoolean581;
					}
				} else if (local19 != null && local19.anInt8320 != -1 && this.anInt2575 != local19.anInt8333) {
					local5 = local19.anInt8320;
					local7 = local19.aBoolean581;
				}
			} else if (this.anInt2575 != local17.anInt8333) {
				local7 = local17.aBoolean581;
				local5 = local17.anInt8320;
			}
		}
		if (local5 == -1) {
			this.aClass280_2 = null;
			return;
		}
		this.aClass19_1 = null;
		if (this.aClass280_2 == null || local5 != this.aClass280_2.anInt8107) {
			this.aClass280_2 = Static6.aClass126_1.method3574(local5);
		} else if (this.aClass280_2.anInt8110 == 0) {
			return;
		}
		if (this.aClass280_2.anIntArray629 == null) {
			this.aClass280_2 = null;
			return;
		}
		if (local7) {
			this.anInt2578 = (int) (Math.random() * (double) this.aClass280_2.anIntArray629.length);
			this.anInt2573 = (int) ((double) this.aClass280_2.anIntArray630[this.anInt2578] * Math.random()) + 1;
		} else {
			this.anInt2578 = 0;
			this.anInt2573 = 1;
		}
		this.anInt2560 = this.anInt2578 + 1;
		if (this.anInt2560 < 0 || this.aClass280_2.anIntArray629.length <= this.anInt2560) {
			this.anInt2560 = -1;
		}
		this.anInt2559 = Static416.anInt7252 - this.anInt2573;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Lclient!qa;I)V")
	public void method2418(@OriginalArg(0) Class9 arg0) {
		this.method2410(true, this.anInt2558, this.anInt2565, arg0, 262144, true);
	}
}
