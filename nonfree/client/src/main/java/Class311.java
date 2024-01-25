import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class311 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	private int anInt9476;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!dba;")
	private Class64 aClass64_3;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!k;")
	private Class12_Sub4_Sub10 aClass12_Sub4_Sub10_5;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[Z")
	private boolean[] aBooleanArray48;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	private int anInt9482;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	private int anInt9485;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!r;")
	private Class26 aClass26_6;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!jw;")
	public Class7_Sub3 aClass7_Sub3_7;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	private int anInt9492;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	private int anInt9490 = -32768;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	private int anInt9480 = -1;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Z")
	private boolean aBoolean671 = false;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	private int anInt9481 = -1;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public final int anInt9474;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	private int anInt9475;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public final int anInt9484;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	private int anInt9498;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public final int anInt9488;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!qa;Lclient!ss;IIIIIIZI)V")
	public Class311(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte105 = (byte) arg5;
		this.aByte104 = (byte) arg4;
		this.aBoolean671 = arg8;
		this.anInt9474 = arg2;
		this.anInt9475 = arg7;
		this.anInt9484 = arg1.anInt8315;
		this.anInt9498 = arg6;
		this.anInt9488 = arg3;
		this.aBoolean672 = arg0.method5848() && arg1.aBoolean583 && !this.aBoolean671;
		if (arg9 != -1) {
			this.aBoolean670 = true;
		}
		this.method7854(arg9);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!r;Lclient!qa;IZIB)V")
	public void method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(12) Class142[] local12 = arg2.method8006();
		@Pc(15) Class265[] local15 = arg2.method7999();
		if ((this.aClass7_Sub3_7 == null || this.aClass7_Sub3_7.aBoolean392) && (local12 != null || local15 != null)) {
			@Pc(32) Class279 local32 = Static49.aClass155_2.method4063(this.anInt9484);
			if (local32.anIntArray620 != null) {
				local32 = local32.method6881(Static393.aClass31_1);
			}
			if (local32 != null) {
				this.aClass7_Sub3_7 = Static244.method4191(Static409.anInt7683);
			}
		}
		if (this.aClass7_Sub3_7 == null) {
			return;
		}
		if (arg5) {
			this.aClass7_Sub3_7.method4201(arg3, (long) Static409.anInt7683, local12, local15);
		} else {
			this.aClass7_Sub3_7.method4195((long) Static409.anInt7683);
		}
		this.aClass7_Sub3_7.method4193(this.aByte104, arg0, arg6, arg4, arg1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method7851(@OriginalArg(0) Class42 arg0) {
		if (this.aClass12_Sub4_Sub10_5 != null) {
			Static434.method6614(this.aClass12_Sub4_Sub10_5, this.aByte105, this.anInt9498, this.anInt9475, this.aBooleanArray48);
			this.aBooleanArray48 = null;
			this.aClass12_Sub4_Sub10_5 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	private void method7854(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class279 local19 = Static49.aClass155_2.method4063(this.anInt9484);
			@Pc(21) Class279 local21 = local19;
			if (local19.anIntArray620 != null) {
				local19 = local19.method6881(Static393.aClass31_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray622 != null) {
				if (this.aClass64_3 != null && local19.method6887(this.aClass64_3.anInt1971)) {
					return;
				}
				local7 = local19.method6882();
				if (this.anInt9480 != local19.anInt8315) {
					local9 = local19.aBoolean585;
				}
			} else if (local19.anInt8287 == -1) {
				if (local21 != null && local21.anIntArray622 != null) {
					if (this.aClass64_3 != null && local21.method6887(this.aClass64_3.anInt1971)) {
						return;
					}
					local7 = local21.method6882();
					if (this.anInt9480 != local21.anInt8315) {
						local9 = local21.aBoolean585;
					}
				} else if (local21 != null && local21.anInt8287 != -1 && local21.anInt8315 != this.anInt9480) {
					local9 = local21.aBoolean585;
					local7 = local21.anInt8287;
				}
			} else if (this.anInt9480 != local19.anInt8315) {
				local9 = local19.aBoolean585;
				local7 = local19.anInt8287;
			}
		}
		if (local7 == -1) {
			this.aClass64_3 = null;
			return;
		}
		this.aClass26_6 = null;
		if (this.aClass64_3 == null || local7 != this.aClass64_3.anInt1971) {
			this.aClass64_3 = Static47.aClass41_1.method911(local7);
		} else if (this.aClass64_3.anInt1972 == 0) {
			return;
		}
		if (this.aClass64_3.anIntArray185 == null) {
			this.aClass64_3 = null;
			return;
		}
		if (local9) {
			this.anInt9476 = (int) (Math.random() * (double) this.aClass64_3.anIntArray185.length);
			this.anInt9482 = (int) ((double) this.aClass64_3.anIntArray184[this.anInt9476] * Math.random()) + 1;
		} else {
			this.anInt9482 = 1;
			this.anInt9476 = 0;
		}
		this.anInt9492 = this.anInt9476 + 1;
		if (this.anInt9492 < 0 || this.anInt9492 >= this.aClass64_3.anIntArray185.length) {
			this.anInt9492 = -1;
		}
		this.anInt9485 = Static409.anInt7683 - this.anInt9482;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V")
	public void method7855(@OriginalArg(1) int arg0) {
		this.aBoolean670 = true;
		this.method7854(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)I")
	public int method7856() {
		return this.anInt9490;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
	private void method7858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass64_3 == null) {
				if (this.aBoolean670) {
					return;
				}
				this.method7854(-1);
				if (this.aClass64_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static409.anInt7683 - this.anInt9485;
			if (local31 > 100 && this.aClass64_3.anInt1962 > 0) {
				@Pc(50) int local50 = this.aClass64_3.anIntArray185.length - this.aClass64_3.anInt1962;
				while (local50 > this.anInt9476 && this.aClass64_3.anIntArray184[this.anInt9476] < local31) {
					local31 -= this.aClass64_3.anIntArray184[this.anInt9476];
					this.anInt9476++;
				}
				if (local50 <= this.anInt9476) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass64_3.anIntArray185.length; local91++) {
						local89 += this.aClass64_3.anIntArray184[local91];
					}
					local31 %= local89;
				}
				this.anInt9492 = this.anInt9476 + 1;
				if (this.anInt9492 >= this.aClass64_3.anIntArray185.length) {
					this.anInt9492 -= this.aClass64_3.anInt1962;
					if (this.anInt9492 < 0 || this.anInt9492 >= this.aClass64_3.anIntArray185.length) {
						this.anInt9492 = -1;
					}
				}
			}
			while (this.aClass64_3.anIntArray184[this.anInt9476] < local31) {
				Static349.method5479(arg0, this.aByte104, false, this.anInt9476, this.aClass64_3, arg1);
				local31 -= this.aClass64_3.anIntArray184[this.anInt9476];
				this.anInt9476++;
				if (this.anInt9476 >= this.aClass64_3.anIntArray185.length) {
					this.anInt9476 -= this.aClass64_3.anInt1962;
					if (this.anInt9476 < 0 || this.anInt9476 >= this.aClass64_3.anIntArray185.length) {
						this.aClass64_3 = null;
						continue label80;
					}
				}
				this.anInt9492 = this.anInt9476 + 1;
				if (this.aClass64_3.anIntArray185.length <= this.anInt9492) {
					this.anInt9492 -= this.aClass64_3.anInt1962;
					if (this.anInt9492 < 0 || this.anInt9492 >= this.aClass64_3.anIntArray185.length) {
						this.anInt9492 = -1;
					}
				}
			}
			this.anInt9485 = Static409.anInt7683 - local31;
			this.anInt9482 = local31;
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_7 != null) {
			this.aClass7_Sub3_7.method4196();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZLclient!qa;IIZ)Lclient!r;")
	public Class26 method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class279 local11 = Static49.aClass155_2.method4063(this.anInt9484);
		if (local11.anIntArray620 != null) {
			local11 = local11.method6881(Static393.aClass31_1);
		}
		if (local11 == null) {
			this.method7851(arg3);
			this.anInt9481 = this.anInt9476;
			this.anInt9480 = -1;
			return null;
		}
		if (!this.aBoolean670 && this.anInt9480 != local11.anInt8315) {
			this.aClass26_6 = null;
			this.method7854(-1);
		}
		this.method7858(arg4, arg0);
		@Pc(75) boolean local75 = arg2 & this.aBoolean672 & Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) != 0;
		@Pc(115) boolean local115 = local75 & (this.anInt9480 != local11.anInt8315 || (this.anInt9476 != this.anInt9481 || this.aClass64_3 != null && (this.aClass64_3.aBoolean140 || Static358.aBoolean490) && this.anInt9476 != this.anInt9492) && Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867) >= 2);
		if (arg5 && !local115) {
			this.anInt9480 = local11.anInt8315;
			this.anInt9481 = this.anInt9476;
			return null;
		}
		if (local115) {
			Static434.method6614(this.aClass12_Sub4_Sub10_5, this.aByte105, this.anInt9498, this.anInt9475, this.aBooleanArray48);
		}
		@Pc(151) Class215 local151 = Static51.aClass215Array6[this.aByte105];
		@Pc(167) Class215 local167;
		if (this.aBoolean671) {
			local167 = Static155.aClass215Array5[0];
		} else {
			local167 = this.aByte105 < 3 ? Static51.aClass215Array6[this.aByte105 + 1] : null;
		}
		@Pc(175) Class26 local175 = null;
		if (this.aClass64_3 != null) {
			if (local115) {
				arg1 |= 0x40000;
			}
			local175 = local11.method6878(this.anInt9482, this.anInt9498, local151, this.anInt9474 == 11 ? 10 : this.anInt9474, arg1, this.anInt9475, this.anInt9492, arg3, local151.aa(this.anInt9498, this.anInt9475), this.anInt9474 == 11 ? this.anInt9488 + 4 : this.anInt9488, this.anInt9476, this.aClass64_3, local167);
			if (local175 == null) {
				this.aClass12_Sub4_Sub10_5 = null;
				this.anInt9490 = 0;
				this.aBooleanArray48 = null;
			} else {
				if (local115) {
					if (this.aBooleanArray48 == null) {
						this.aBooleanArray48 = new boolean[4];
					}
					this.aClass12_Sub4_Sub10_5 = local175.EA(this.aClass12_Sub4_Sub10_5);
					Static116.method2386(this.aClass12_Sub4_Sub10_5, this.aByte105, arg0, arg4, this.aBooleanArray48);
				}
				this.anInt9490 = local175.TA();
			}
			this.aClass26_6 = null;
		} else if (this.aClass26_6 != null && arg1 == (this.aClass26_6.ba() & arg1) && local11.anInt8315 == this.anInt9480) {
			local175 = this.aClass26_6;
		} else {
			if (this.aClass26_6 != null) {
				arg1 |= this.aClass26_6.ba();
			}
			@Pc(343) Class118 local343 = local11.method6874(this.anInt9474 == 11 ? 10 : this.anInt9474, arg3, this.anInt9498, local151, this.anInt9474 == 11 ? this.anInt9488 + 4 : this.anInt9488, local115, this.anInt9475, local167, local151.aa(this.anInt9498, this.anInt9475), arg1);
			if (local343 == null) {
				this.anInt9490 = 0;
				this.aClass26_6 = null;
				this.aClass12_Sub4_Sub10_5 = null;
				this.aBooleanArray48 = null;
			} else {
				local175 = local343.aClass26_3;
				this.aClass26_6 = local343.aClass26_3;
				if (local115) {
					this.aBooleanArray48 = null;
					this.aClass12_Sub4_Sub10_5 = local343.aClass12_Sub4_Sub10_2;
					Static116.method2386(this.aClass12_Sub4_Sub10_5, this.aByte105, arg0, arg4, null);
				}
				this.anInt9490 = local175.TA();
			}
		}
		this.anInt9498 = arg0;
		this.anInt9480 = local11.anInt8315;
		this.anInt9481 = this.anInt9476;
		this.anInt9475 = arg4;
		return local175;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Z")
	public boolean method7860() {
		return this.aBoolean672;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!qa;)V")
	public void method7861(@OriginalArg(1) Class42 arg0) {
		this.method7859(this.anInt9498, 262144, true, arg0, this.anInt9475, true);
	}
}
