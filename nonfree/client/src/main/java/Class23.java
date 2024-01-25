import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class23 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!lp;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!ba;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_2;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "[Z")
	private boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "Lclient!t;")
	private Class110 aClass110_3;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!ao;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	private int anInt539 = -1;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	private int anInt535 = -32768;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private int anInt537 = -1;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
	public final int anInt551;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public final int anInt548;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public final int anInt536;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
	private final boolean aBoolean55;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIIIZI)V")
	public Class23(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt551 = arg3;
		this.anInt548 = arg1.anInt5823;
		this.aBoolean56 = arg8;
		this.aByte9 = (byte) arg4;
		this.anInt543 = arg6;
		this.anInt544 = arg7;
		this.anInt536 = arg2;
		this.aByte10 = (byte) arg5;
		this.aBoolean55 = arg0.method4242() && arg1.aBoolean526 && !this.aBoolean56;
		if (arg9 != -1) {
			this.aBoolean54 = true;
		}
		this.method579(arg9);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZLclient!ya;IIBZ)Lclient!t;")
	public Class110 method578(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class202 local11 = Static267.aClass262_2.method5560(this.anInt548);
		if (local11.anIntArray407 != null) {
			local11 = local11.method4584(Static257.aClass114_1);
		}
		if (local11 == null) {
			this.method588(arg2);
			this.anInt539 = -1;
			this.anInt537 = this.anInt538;
			return null;
		}
		if (!this.aBoolean54 && local11.anInt5823 != this.anInt539) {
			this.aClass110_3 = null;
			this.method579(-1);
		}
		this.method585(arg0, arg3);
		@Pc(72) boolean local72 = arg1 & this.aBoolean55 & Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) != 0;
		@Pc(110) boolean local110 = local72 & (this.anInt539 != local11.anInt5823 || (this.anInt538 != this.anInt537 || this.aClass138_1 != null && (this.aClass138_1.aBoolean404 || Static127.aBoolean244) && this.anInt538 != this.anInt552) && Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) >= 2);
		if (arg5 && !local110) {
			this.anInt537 = this.anInt538;
			this.anInt539 = local11.anInt5823;
			return null;
		}
		if (local110) {
			Static110.method2015(this.aClass4_Sub1_Sub4_2, this.aByte10, this.anInt543, this.anInt544, this.aBooleanArray4);
		}
		@Pc(142) Class65 local142 = Static417.aClass65Array4[this.aByte10];
		@Pc(160) Class65 local160;
		if (this.aBoolean56) {
			local160 = Static67.aClass65Array1[0];
		} else {
			local160 = this.aByte10 < 3 ? Static417.aClass65Array4[this.aByte10 + 1] : null;
		}
		@Pc(168) Class110 local168 = null;
		if (this.aClass138_1 != null) {
			if (local110) {
				arg4 |= 0x40000;
			}
			local168 = local11.method4594(this.anInt536 == 11 ? 10 : this.anInt536, local142.a(this.anInt543, this.anInt544), this.anInt533, this.anInt538, arg2, this.aClass138_1, this.anInt552, this.anInt543, this.anInt536 == 11 ? this.anInt551 + 4 : this.anInt551, this.anInt544, arg4, local160, local142);
			if (local168 == null) {
				this.aClass4_Sub1_Sub4_2 = null;
				this.aBooleanArray4 = null;
				this.anInt535 = 0;
			} else {
				if (local110) {
					if (this.aBooleanArray4 == null) {
						this.aBooleanArray4 = new boolean[4];
					}
					this.aClass4_Sub1_Sub4_2 = local168.fa(this.aClass4_Sub1_Sub4_2);
					Static52.method844(this.aClass4_Sub1_Sub4_2, this.aByte10, arg3, arg0, this.aBooleanArray4);
				}
				this.anInt535 = local168.MA();
			}
			this.aClass110_3 = null;
		} else if (this.aClass110_3 != null && arg4 == (this.aClass110_3.P() & arg4) && this.anInt539 == local11.anInt5823) {
			local168 = this.aClass110_3;
		} else {
			if (this.aClass110_3 != null) {
				arg4 |= this.aClass110_3.P();
			}
			@Pc(334) Class149 local334 = local11.method4589(arg2, this.anInt543, arg4, local142.a(this.anInt543, this.anInt544), local110, this.anInt536 == 11 ? this.anInt551 + 4 : this.anInt551, local160, this.anInt544, this.anInt536 == 11 ? 10 : this.anInt536, local142);
			if (local334 == null) {
				this.anInt535 = 0;
				this.aBooleanArray4 = null;
				this.aClass110_3 = null;
				this.aClass4_Sub1_Sub4_2 = null;
			} else {
				local168 = local334.aClass110_5;
				this.aClass110_3 = local334.aClass110_5;
				if (local110) {
					this.aBooleanArray4 = null;
					this.aClass4_Sub1_Sub4_2 = local334.aClass4_Sub1_Sub4_4;
					Static52.method844(this.aClass4_Sub1_Sub4_2, this.aByte10, arg3, arg0, null);
				}
				this.anInt535 = local168.MA();
			}
		}
		this.anInt539 = local11.anInt5823;
		this.anInt543 = arg3;
		this.anInt537 = this.anInt538;
		this.anInt544 = arg0;
		return local168;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	private void method579(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class202 local19 = Static267.aClass262_2.method5560(this.anInt548);
			@Pc(21) Class202 local21 = local19;
			if (local19.anIntArray407 != null) {
				local19 = local19.method4584(Static257.aClass114_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray405 != null) {
				if (this.aClass138_1 != null && local19.method4583(this.aClass138_1.anInt4411)) {
					return;
				}
				local7 = local19.method4588();
				if (this.anInt539 != local19.anInt5823) {
					local9 = local19.aBoolean535;
				}
			} else if (local19.anInt5840 == -1) {
				if (local21 != null && local21.anIntArray405 != null) {
					if (this.aClass138_1 != null && local21.method4583(this.aClass138_1.anInt4411)) {
						return;
					}
					local7 = local21.method4588();
					if (this.anInt539 != local21.anInt5823) {
						local9 = local21.aBoolean535;
					}
				} else if (local21 != null && local21.anInt5840 != -1 && local21.anInt5823 != this.anInt539) {
					local7 = local21.anInt5840;
					local9 = local21.aBoolean535;
				}
			} else if (local19.anInt5823 != this.anInt539) {
				local7 = local19.anInt5840;
				local9 = local19.aBoolean535;
			}
		}
		if (local7 == -1) {
			this.aClass138_1 = null;
			return;
		}
		this.aClass110_3 = null;
		if (this.aClass138_1 == null || this.aClass138_1.anInt4411 != local7) {
			this.aClass138_1 = Static182.aClass55_1.method1397(local7);
		} else if (this.aClass138_1.anInt4406 == 0) {
			return;
		}
		if (this.aClass138_1.anIntArray295 == null) {
			this.aClass138_1 = null;
			return;
		}
		if (local9) {
			this.anInt538 = (int) ((double) this.aClass138_1.anIntArray295.length * Math.random());
			this.anInt533 = (int) (Math.random() * (double) this.aClass138_1.anIntArray296[this.anInt538]) + 1;
		} else {
			this.anInt533 = 1;
			this.anInt538 = 0;
		}
		this.anInt552 = this.anInt538 + 1;
		if (this.anInt552 < 0 || this.aClass138_1.anIntArray295.length <= this.anInt552) {
			this.anInt552 = -1;
		}
		this.anInt549 = Static24.anInt5323 - this.anInt533;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	public int method580() {
		return this.anInt535;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ya;)V")
	public void method582(@OriginalArg(1) Class19 arg0) {
		this.method578(this.anInt544, true, arg0, this.anInt543, 262144, true);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	public boolean method584() {
		return this.aBoolean55;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	private void method585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass138_1 == null) {
				if (this.aBoolean54) {
					return;
				}
				this.method579(-1);
				if (this.aClass138_1 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static24.anInt5323 - this.anInt549;
			if (local33 > 100 && this.aClass138_1.anInt4405 > 0) {
				@Pc(49) int local49 = this.aClass138_1.anIntArray295.length - this.aClass138_1.anInt4405;
				while (local49 > this.anInt538 && local33 > this.aClass138_1.anIntArray296[this.anInt538]) {
					local33 -= this.aClass138_1.anIntArray296[this.anInt538];
					this.anInt538++;
				}
				if (this.anInt538 >= local49) {
					@Pc(92) int local92 = 0;
					for (@Pc(94) int local94 = local49; local94 < this.aClass138_1.anIntArray295.length; local94++) {
						local92 += this.aClass138_1.anIntArray296[local94];
					}
					local33 %= local92;
				}
				this.anInt552 = this.anInt538 + 1;
				if (this.aClass138_1.anIntArray295.length <= this.anInt552) {
					this.anInt552 -= this.aClass138_1.anInt4405;
					if (this.anInt552 < 0 || this.aClass138_1.anIntArray295.length <= this.anInt552) {
						this.anInt552 = -1;
					}
				}
			}
			while (local33 > this.aClass138_1.anIntArray296[this.anInt538]) {
				Static15.method156(arg1, this.anInt538, this.aByte9, arg0, this.aClass138_1, false);
				local33 -= this.aClass138_1.anIntArray296[this.anInt538];
				this.anInt538++;
				if (this.anInt538 >= this.aClass138_1.anIntArray295.length) {
					this.anInt538 -= this.aClass138_1.anInt4405;
					if (this.anInt538 < 0 || this.anInt538 >= this.aClass138_1.anIntArray295.length) {
						this.aClass138_1 = null;
						continue label80;
					}
				}
				this.anInt552 = this.anInt538 + 1;
				if (this.aClass138_1.anIntArray295.length <= this.anInt552) {
					this.anInt552 -= this.aClass138_1.anInt4405;
					if (this.anInt552 < 0 || this.aClass138_1.anIntArray295.length <= this.anInt552) {
						this.anInt552 = -1;
					}
				}
			}
			this.anInt533 = local33;
			this.anInt549 = Static24.anInt5323 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIILclient!t;ILclient!ya;II)V")
	public void method586(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class29[] local6 = arg2.method4881();
		@Pc(16) Class179[] local16 = arg2.method4885();
		if ((this.aClass3_Sub2_1 == null || this.aClass3_Sub2_1.aBoolean24) && (local6 != null || local16 != null)) {
			@Pc(33) Class202 local33 = Static267.aClass262_2.method5560(this.anInt548);
			if (local33.anIntArray407 != null) {
				local33 = local33.method4584(Static257.aClass114_1);
			}
			if (local33 != null) {
				this.aClass3_Sub2_1 = new Class3_Sub2(Static24.anInt5323);
			}
		}
		if (this.aClass3_Sub2_1 == null) {
			return;
		}
		if (arg0) {
			this.aClass3_Sub2_1.method169(arg4, (long) Static24.anInt5323, local6, local16);
		} else {
			this.aClass3_Sub2_1.method168((long) Static24.anInt5323);
		}
		this.aClass3_Sub2_1.method174(this.aByte9, arg6, arg3, arg1, arg5);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public void method587(@OriginalArg(0) int arg0) {
		this.aBoolean54 = true;
		this.method579(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub2_1 != null) {
			this.aClass3_Sub2_1.method166();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!ya;)V")
	public void method588(@OriginalArg(1) Class19 arg0) {
		if (this.aClass4_Sub1_Sub4_2 != null) {
			Static110.method2015(this.aClass4_Sub1_Sub4_2, this.aByte10, this.anInt543, this.anInt544, this.aBooleanArray4);
			this.aClass4_Sub1_Sub4_2 = null;
			this.aBooleanArray4 = null;
		}
	}
}
