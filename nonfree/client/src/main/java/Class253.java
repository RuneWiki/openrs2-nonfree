import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class253 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Lclient!hm;")
	public Class5_Sub2 aClass5_Sub2_7;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	private int anInt7533;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[Z")
	private boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "Lclient!ba;")
	private Class23 aClass23_7;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	private int anInt7542;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "Lclient!am;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "Lclient!w;")
	private Class6_Sub4_Sub2 aClass6_Sub4_Sub2_6;

	@OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
	private int anInt7552;

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
	private int anInt7553;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	private int anInt7531 = -1;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	private int anInt7543 = -1;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "Z")
	private boolean aBoolean555 = false;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
	private int anInt7546 = -32768;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
	private int anInt7555 = -1;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
	private int anInt7549;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public final int anInt7544;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	private int anInt7541;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
	public final int anInt7551;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!oa;Lclient!bfa;IIIIIIZI)V")
	public Class253(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt7549 = arg7;
		this.anInt7544 = arg3;
		this.aByte87 = (byte) arg5;
		this.anInt7541 = arg6;
		this.aByte86 = (byte) arg4;
		this.anInt7551 = arg1.anInt1060;
		this.anInt7539 = arg2;
		this.aBoolean553 = arg8;
		this.aBoolean554 = arg0.method5452() && arg1.aBoolean93 && !this.aBoolean553;
		if (arg9 != -1) {
			this.aBoolean555 = true;
		}
		this.method6294(arg9);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public boolean method6282() {
		return this.aBoolean554;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!oa;B)V")
	public void method6283(@OriginalArg(0) Class9 arg0) {
		if (this.aClass6_Sub4_Sub2_6 != null) {
			Static217.method3472(this.aClass6_Sub4_Sub2_6, this.aByte87, this.anInt7541, this.anInt7549, this.aBooleanArray26);
			this.aClass6_Sub4_Sub2_6 = null;
			this.aBooleanArray26 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILclient!q;ILclient!oa;ILclient!ba;Z)V")
	public void method6284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(7) Class23 arg6, @OriginalArg(8) boolean arg7) {
		@Pc(12) Class69[] local12 = arg6.method7080();
		@Pc(15) Class128[] local15 = arg6.method7071();
		if ((this.aClass5_Sub2_7 == null || this.aClass5_Sub2_7.aBoolean354) && (local12 != null || local15 != null)) {
			@Pc(32) Class31 local32 = Static480.aClass57_11.method1469(this.anInt7551);
			if (local32.anIntArray69 != null) {
				local32 = local32.method1029(Static435.aClass234_1);
			}
			if (local32 != null) {
				this.aClass5_Sub2_7 = Static202.method3777(Static508.anInt8998, true);
			}
		}
		if (this.aClass5_Sub2_7 == null) {
			return;
		}
		arg6.method7078(arg3);
		if (arg7) {
			this.aClass5_Sub2_7.method3784(arg5, (long) Static508.anInt8998, local12, local15);
		} else {
			this.aClass5_Sub2_7.method3786((long) Static508.anInt8998);
		}
		this.aClass5_Sub2_7.method3790(this.aByte86, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
	public int method6287() {
		return this.anInt7546;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V")
	public void method6289(@OriginalArg(1) int arg0) {
		this.aBoolean555 = true;
		this.method6294(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass5_Sub2_7 != null) {
			this.aClass5_Sub2_7.method3791();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!oa;)V")
	public void method6290(@OriginalArg(1) Class9 arg0) {
		this.method6291(this.anInt7549, true, arg0, 262144, this.anInt7541, true);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZLclient!oa;ZIIZ)Lclient!ba;")
	public Class23 method6291(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(18) Class31 local18 = Static480.aClass57_11.method1469(this.anInt7551);
		if (local18.anIntArray69 != null) {
			local18 = local18.method1029(Static435.aClass234_1);
		}
		if (local18 == null) {
			this.method6283(arg2);
			this.anInt7555 = -1;
			this.anInt7543 = -1;
			this.anInt7531 = -1;
			return null;
		}
		if (!this.aBoolean555 && local18.anInt1060 != this.anInt7543) {
			this.aClass23_7 = null;
			this.method6294(-1);
		}
		this.method6293(arg4, arg0);
		if (arg5) {
			@Pc(79) boolean local79 = arg5 & this.aBoolean554 & Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) != 0;
			arg5 = local79 & (this.anInt7531 != local18.anInt1060 || this.aClass16_3 != null && Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) >= 2 && (this.anInt7555 != this.anInt7533 || (this.aClass16_3.aBoolean40 || Static305.aBoolean438) && this.anInt7533 != this.anInt7552));
		}
		if (arg1 && !arg5) {
			this.anInt7543 = local18.anInt1060;
			return null;
		}
		if (arg5) {
			Static217.method3472(this.aClass6_Sub4_Sub2_6, this.aByte87, this.anInt7541, this.anInt7549, this.aBooleanArray26);
			this.anInt7555 = -1;
			this.anInt7531 = -1;
		}
		@Pc(153) Class62 local153 = Static47.aClass62Array1[this.aByte87];
		@Pc(160) Class62 local160;
		if (this.aBoolean553) {
			local160 = Static53.aClass62Array2[0];
		} else {
			local160 = this.aByte87 < 3 ? Static47.aClass62Array1[this.aByte87 + 1] : null;
		}
		@Pc(177) Class23 local177 = null;
		if (this.aClass16_3 != null) {
			if (arg5) {
				arg3 |= 0x40000;
			}
			local177 = local18.method1031(local160, this.anInt7541, local153, arg3, this.anInt7539 == 11 ? this.anInt7544 + 4 : this.anInt7544, local153.sa(this.anInt7541, this.anInt7549), this.anInt7552, this.anInt7549, this.aClass16_3, this.anInt7539 == 11 ? 10 : this.anInt7539, arg2, this.anInt7542, this.anInt7533);
			if (local177 == null) {
				this.anInt7546 = 0;
				this.aBooleanArray26 = null;
				this.aClass6_Sub4_Sub2_6 = null;
			} else {
				if (arg5) {
					if (this.aBooleanArray26 == null) {
						this.aBooleanArray26 = new boolean[4];
					}
					this.aClass6_Sub4_Sub2_6 = local177.Z(this.aClass6_Sub4_Sub2_6);
					Static279.method4617(this.aClass6_Sub4_Sub2_6, this.aByte87, arg4, arg0, this.aBooleanArray26);
					this.anInt7555 = this.anInt7533;
					this.anInt7531 = local18.anInt1060;
				}
				this.anInt7546 = local177.DA();
			}
			this.aClass23_7 = null;
		} else if (this.aClass23_7 != null && (arg3 & this.aClass23_7.h()) == arg3 && local18.anInt1060 == this.anInt7543) {
			local177 = this.aClass23_7;
		} else {
			if (this.aClass23_7 != null) {
				arg3 |= this.aClass23_7.h();
			}
			@Pc(253) Class20 local253 = local18.method1022(arg2, local153, this.anInt7549, local153.sa(this.anInt7541, this.anInt7549), this.anInt7539 == 11 ? this.anInt7544 + 4 : this.anInt7544, this.anInt7541, arg5, arg3, this.anInt7539 == 11 ? 10 : this.anInt7539, local160);
			if (local253 == null) {
				this.anInt7546 = 0;
				this.aClass6_Sub4_Sub2_6 = null;
				this.aBooleanArray26 = null;
				this.aClass23_7 = null;
			} else {
				local177 = local253.aClass23_1;
				this.aClass23_7 = local253.aClass23_1;
				if (arg5) {
					this.aClass6_Sub4_Sub2_6 = local253.aClass6_Sub4_Sub2_1;
					this.aBooleanArray26 = null;
					Static279.method4617(this.aClass6_Sub4_Sub2_6, this.aByte87, arg4, arg0, null);
					this.anInt7555 = -1;
					this.anInt7531 = local18.anInt1060;
				}
				this.anInt7546 = local177.DA();
			}
		}
		this.anInt7541 = arg4;
		this.anInt7543 = local18.anInt1060;
		this.anInt7549 = arg0;
		return local177;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
	private void method6293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass16_3 == null) {
				if (this.aBoolean555) {
					return;
				}
				this.method6294(-1);
				if (this.aClass16_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static508.anInt8998 - this.anInt7553;
			if (local33 > 100 && this.aClass16_3.anInt587 > 0) {
				@Pc(50) int local50 = this.aClass16_3.anIntArray47.length - this.aClass16_3.anInt587;
				while (this.anInt7533 < local50 && local33 > this.aClass16_3.anIntArray46[this.anInt7533]) {
					local33 -= this.aClass16_3.anIntArray46[this.anInt7533];
					this.anInt7533++;
				}
				if (this.anInt7533 >= local50) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass16_3.anIntArray47.length; local91++) {
						local89 += this.aClass16_3.anIntArray46[local91];
					}
					local33 %= local89;
				}
				this.anInt7552 = this.anInt7533 + 1;
				if (this.aClass16_3.anIntArray47.length <= this.anInt7552) {
					this.anInt7552 -= this.aClass16_3.anInt587;
					if (this.anInt7552 < 0 || this.anInt7552 >= this.aClass16_3.anIntArray47.length) {
						this.anInt7552 = -1;
					}
				}
			}
			while (this.aClass16_3.anIntArray46[this.anInt7533] < local33) {
				Static360.method5794(arg0, this.aClass16_3, arg1, this.aByte86, this.anInt7533, false);
				local33 -= this.aClass16_3.anIntArray46[this.anInt7533];
				this.anInt7533++;
				if (this.aClass16_3.anIntArray47.length <= this.anInt7533) {
					this.anInt7533 -= this.aClass16_3.anInt587;
					if (this.anInt7533 < 0 || this.anInt7533 >= this.aClass16_3.anIntArray47.length) {
						this.aClass16_3 = null;
						continue label80;
					}
				}
				this.anInt7552 = this.anInt7533 + 1;
				if (this.anInt7552 >= this.aClass16_3.anIntArray47.length) {
					this.anInt7552 -= this.aClass16_3.anInt587;
					if (this.anInt7552 < 0 || this.anInt7552 >= this.aClass16_3.anIntArray47.length) {
						this.anInt7552 = -1;
					}
				}
			}
			this.anInt7542 = local33;
			this.anInt7553 = Static508.anInt8998 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	private void method6294(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(25) Class31 local25 = Static480.aClass57_11.method1469(this.anInt7551);
			@Pc(27) Class31 local27 = local25;
			if (local25.anIntArray69 != null) {
				local25 = local25.method1029(Static435.aClass234_1);
			}
			if (local25 == null) {
				return;
			}
			if (local25 == local27) {
				local27 = null;
			}
			if (local25.anIntArray73 != null) {
				if (this.aClass16_3 != null && local25.method1035(this.aClass16_3.anInt588)) {
					return;
				}
				local7 = local25.method1028();
				if (local25.anInt1060 != this.anInt7543) {
					local15 = local25.aBoolean90;
				}
			} else if (local25.anInt1101 == -1) {
				if (local27 != null && local27.anIntArray73 != null) {
					if (this.aClass16_3 != null && local27.method1035(this.aClass16_3.anInt588)) {
						return;
					}
					local7 = local27.method1028();
					if (local27.anInt1060 != this.anInt7543) {
						local15 = local27.aBoolean90;
					}
				} else if (local27 != null && local27.anInt1101 != -1 && this.anInt7543 != local27.anInt1060) {
					local15 = local27.aBoolean90;
					local7 = local27.anInt1101;
				}
			} else if (this.anInt7543 != local25.anInt1060) {
				local7 = local25.anInt1101;
				local15 = local25.aBoolean90;
			}
		}
		if (local7 == -1) {
			this.aClass16_3 = null;
			return;
		}
		this.aClass23_7 = null;
		if (this.aClass16_3 == null || this.aClass16_3.anInt588 != local7) {
			this.aClass16_3 = Static114.aClass156_2.method4101(local7);
		} else if (this.aClass16_3.anInt581 == 0) {
			return;
		}
		if (this.aClass16_3.anIntArray47 == null) {
			this.aClass16_3 = null;
			return;
		}
		if (local15) {
			this.anInt7533 = (int) ((double) this.aClass16_3.anIntArray47.length * Math.random());
			this.anInt7542 = (int) ((double) this.aClass16_3.anIntArray46[this.anInt7533] * Math.random()) + 1;
		} else {
			this.anInt7533 = 0;
			this.anInt7542 = 1;
		}
		this.anInt7552 = this.anInt7533 + 1;
		if (this.anInt7552 < 0 || this.anInt7552 >= this.aClass16_3.anIntArray47.length) {
			this.anInt7552 = -1;
		}
		this.anInt7553 = Static508.anInt8998 - this.anInt7542;
	}
}
