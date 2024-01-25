import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class300 {

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	private int anInt7828;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	private int anInt7831;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
	private int anInt7832;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "Lclient!wca;")
	public Class41_Sub9 aClass41_Sub9_5;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub13 aClass3_Sub7_Sub13_5;

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
	private int anInt7839;

	@OriginalMember(owner = "client!rv", name = "F", descriptor = "Lclient!lb;")
	private Class185 aClass185_3;

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "Lclient!da;")
	private Class60 aClass60_6;

	@OriginalMember(owner = "client!rv", name = "O", descriptor = "[Z")
	private boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
	private int anInt7827 = 0;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
	private int anInt7824 = 0;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
	private int anInt7830 = -1;

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
	private int anInt7844 = -1;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
	private int anInt7837 = -1;

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
	private int anInt7840;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	private int anInt7826;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
	public final int anInt7838;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	public final int anInt7833;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "B")
	private final byte aByte102;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public final int anInt7820;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "Z")
	private final boolean aBoolean616;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIIZI)V")
	public Class300(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt7840 = arg7;
		this.anInt7826 = arg6;
		this.anInt7838 = arg2;
		this.anInt7833 = arg1.anInt7369;
		this.aByte102 = (byte) arg4;
		this.aBoolean615 = arg8;
		this.anInt7820 = arg3;
		this.aByte103 = (byte) arg5;
		this.aBoolean616 = arg0.method7404() && arg1.aBoolean561 && !this.aBoolean615;
		if (arg9 != -1) {
			this.aBoolean614 = true;
		}
		this.method6509(arg9);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	private void method6509(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(24) Class280 local24 = Static478.aClass212_3.method4793(this.anInt7833);
			@Pc(26) Class280 local26 = local24;
			if (local24.anIntArray457 != null) {
				local24 = local24.method6181(Static491.aClass318_1);
			}
			if (local24 == null) {
				return;
			}
			if (local26 == local24) {
				local26 = null;
			}
			if (local24.anIntArray462 != null) {
				if (this.aClass185_3 != null && local24.method6169(this.aClass185_3.anInt4973)) {
					return;
				}
				local13 = local24.method6178();
				if (local24.anInt7369 != this.anInt7837) {
					local15 = local24.aBoolean560;
				}
			} else if (local24.anInt7348 == -1) {
				if (local26 != null && local26.anIntArray462 != null) {
					if (this.aClass185_3 != null && local26.method6169(this.aClass185_3.anInt4973)) {
						return;
					}
					local13 = local26.method6178();
					if (this.anInt7837 != local26.anInt7369) {
						local15 = local26.aBoolean560;
					}
				} else if (local26 != null && local26.anInt7348 != -1 && this.anInt7837 != local26.anInt7369) {
					local15 = local26.aBoolean560;
					local13 = local26.anInt7348;
				}
			} else if (local24.anInt7369 != this.anInt7837) {
				local13 = local24.anInt7348;
				local15 = local24.aBoolean560;
			}
		}
		if (local13 == -1) {
			this.aClass185_3 = null;
			return;
		}
		this.aClass60_6 = null;
		if (this.aClass185_3 == null || this.aClass185_3.anInt4973 != local13) {
			this.aClass185_3 = Static545.aClass240_2.method5680(local13);
		} else if (this.aClass185_3.anInt4978 == 0) {
			return;
		}
		if (this.aClass185_3.anIntArray280 == null) {
			this.aClass185_3 = null;
			return;
		}
		if (local15) {
			this.anInt7832 = (int) ((double) this.aClass185_3.anIntArray280.length * Math.random());
			this.anInt7839 = (int) (Math.random() * (double) this.aClass185_3.anIntArray282[this.anInt7832]) + 1;
		} else {
			this.anInt7839 = 1;
			this.anInt7832 = 0;
		}
		this.anInt7828 = this.anInt7832 + 1;
		if (this.anInt7828 < 0 || this.aClass185_3.anIntArray280.length <= this.anInt7828) {
			this.anInt7828 = -1;
		}
		this.anInt7831 = Static506.anInt8251 - this.anInt7839;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLclient!r;IZIII)Lclient!da;")
	public Class60 method6510(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class280 local11 = Static478.aClass212_3.method4793(this.anInt7833);
		if (local11.anIntArray457 != null) {
			local11 = local11.method6181(Static491.aClass318_1);
		}
		if (local11 == null) {
			this.method6514(arg1);
			this.anInt7837 = -1;
			this.anInt7844 = -1;
			this.anInt7830 = -1;
			return null;
		}
		if (!this.aBoolean614 && local11.anInt7369 != this.anInt7837) {
			this.aClass60_6 = null;
			this.method6509(-1);
		}
		this.method6512(arg2, arg5);
		if (arg0) {
			@Pc(75) boolean local75 = arg0 & this.aBoolean616 & Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) != 0;
			arg0 = local75 & (local11.anInt7369 != this.anInt7844 || this.aClass185_3 != null && Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) >= 2 && (this.anInt7832 != this.anInt7830 || (this.aClass185_3.aBoolean363 || Static391.aBoolean508) && this.anInt7828 != this.anInt7832));
		}
		if (arg3 && !arg0) {
			this.anInt7837 = local11.anInt7369;
			return null;
		}
		if (arg0) {
			Static546.method7274(this.aClass3_Sub7_Sub13_5, this.aByte103, this.anInt7826, this.anInt7840, this.aBooleanArray23);
			this.anInt7830 = -1;
			this.anInt7844 = -1;
		}
		@Pc(155) Class34 local155 = Static68.aClass34Array1[this.aByte103];
		@Pc(177) Class34 local177;
		if (this.aBoolean615) {
			local177 = Static108.aClass34Array6[0];
		} else {
			local177 = this.aByte103 >= 3 ? null : Static68.aClass34Array1[this.aByte103 + 1];
		}
		@Pc(185) Class60 local185 = null;
		if (this.aClass185_3 != null) {
			if (arg0) {
				arg4 |= 0x40000;
			}
			local185 = local11.method6179(local155, arg4, this.aClass185_3, local177, arg1, this.anInt7838 == 11 ? this.anInt7820 + 4 : this.anInt7820, local155.method6530(this.anInt7826, this.anInt7840), this.anInt7839, this.anInt7828, this.anInt7838 == 11 ? 10 : this.anInt7838, this.anInt7832, this.anInt7840, this.anInt7826);
			if (local185 == null) {
				this.aBooleanArray23 = null;
				this.aClass3_Sub7_Sub13_5 = null;
				this.anInt7827 = 0;
				this.anInt7824 = 0;
			} else {
				if (arg0) {
					if (this.aBooleanArray23 == null) {
						this.aBooleanArray23 = new boolean[4];
					}
					this.aClass3_Sub7_Sub13_5 = local185.S(this.aClass3_Sub7_Sub13_5);
					Static58.method1201(this.aClass3_Sub7_Sub13_5, this.aByte103, arg5, arg2, this.aBooleanArray23);
					this.anInt7844 = local11.anInt7369;
					this.anInt7830 = this.anInt7832;
				}
				this.anInt7827 = local185.J();
				this.anInt7824 = local185.RA();
			}
			this.aClass60_6 = null;
		} else if (this.aClass60_6 != null && (this.aClass60_6.PA() & arg4) == arg4 && local11.anInt7369 == this.anInt7837) {
			local185 = this.aClass60_6;
		} else {
			if (this.aClass60_6 != null) {
				arg4 |= this.aClass60_6.PA();
			}
			@Pc(376) Class131 local376 = local11.method6168(this.anInt7826, local155.method6530(this.anInt7826, this.anInt7840), arg1, this.anInt7840, local155, arg4, this.anInt7838 == 11 ? 10 : this.anInt7838, arg0, this.anInt7838 == 11 ? this.anInt7820 + 4 : this.anInt7820, local177);
			if (local376 == null) {
				this.aClass3_Sub7_Sub13_5 = null;
				this.aClass60_6 = null;
				this.anInt7827 = 0;
				this.anInt7824 = 0;
				this.aBooleanArray23 = null;
			} else {
				local185 = local376.aClass60_3;
				this.aClass60_6 = local376.aClass60_3;
				if (arg0) {
					this.aClass3_Sub7_Sub13_5 = local376.aClass3_Sub7_Sub13_3;
					this.aBooleanArray23 = null;
					Static58.method1201(this.aClass3_Sub7_Sub13_5, this.aByte103, arg5, arg2, null);
					this.anInt7830 = -1;
					this.anInt7844 = local11.anInt7369;
				}
				this.anInt7827 = local185.J();
				this.anInt7824 = local185.RA();
			}
		}
		this.anInt7837 = local11.anInt7369;
		this.anInt7840 = arg2;
		this.anInt7826 = arg5;
		return local185;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z")
	public boolean method6511() {
		return this.aBoolean616;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V")
	private void method6512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass185_3 == null) {
				if (this.aBoolean614) {
					return;
				}
				this.method6509(-1);
				if (this.aClass185_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static506.anInt8251 - this.anInt7831;
			if (local33 > 100 && this.aClass185_3.anInt4971 > 0) {
				@Pc(52) int local52 = this.aClass185_3.anIntArray280.length - this.aClass185_3.anInt4971;
				while (local52 > this.anInt7832 && this.aClass185_3.anIntArray282[this.anInt7832] < local33) {
					local33 -= this.aClass185_3.anIntArray282[this.anInt7832];
					this.anInt7832++;
				}
				if (this.anInt7832 >= local52) {
					@Pc(99) int local99 = 0;
					for (@Pc(101) int local101 = local52; local101 < this.aClass185_3.anIntArray280.length; local101++) {
						local99 += this.aClass185_3.anIntArray282[local101];
					}
					local33 %= local99;
				}
				this.anInt7828 = this.anInt7832 + 1;
				if (this.aClass185_3.anIntArray280.length <= this.anInt7828) {
					this.anInt7828 -= this.aClass185_3.anInt4971;
					if (this.anInt7828 < 0 || this.anInt7828 >= this.aClass185_3.anIntArray280.length) {
						this.anInt7828 = -1;
					}
				}
			}
			while (this.aClass185_3.anIntArray282[this.anInt7832] < local33) {
				Static462.method6421(false, arg1, this.aClass185_3, this.aByte102, arg0, this.anInt7832);
				local33 -= this.aClass185_3.anIntArray282[this.anInt7832];
				this.anInt7832++;
				if (this.aClass185_3.anIntArray280.length <= this.anInt7832) {
					this.anInt7832 -= this.aClass185_3.anInt4971;
					if (this.anInt7832 < 0 || this.aClass185_3.anIntArray280.length <= this.anInt7832) {
						this.aClass185_3 = null;
						continue label80;
					}
				}
				this.anInt7828 = this.anInt7832 + 1;
				if (this.anInt7828 >= this.aClass185_3.anIntArray280.length) {
					this.anInt7828 -= this.aClass185_3.anInt4971;
					if (this.anInt7828 < 0 || this.aClass185_3.anIntArray280.length <= this.anInt7828) {
						this.anInt7828 = -1;
					}
				}
			}
			this.anInt7839 = local33;
			this.anInt7831 = Static506.anInt8251 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub9_5 != null) {
			this.aClass41_Sub9_5.method7726();
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	public void method6513(@OriginalArg(0) int arg0) {
		this.aBoolean614 = true;
		this.method6509(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!r;)V")
	public void method6514(@OriginalArg(1) Class45 arg0) {
		if (this.aClass3_Sub7_Sub13_5 != null) {
			Static546.method7274(this.aClass3_Sub7_Sub13_5, this.aByte103, this.anInt7826, this.anInt7840, this.aBooleanArray23);
			this.aBooleanArray23 = null;
			this.aClass3_Sub7_Sub13_5 = null;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)I")
	public int method6515() {
		return this.anInt7827;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	public int method6517(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.anInt7824 : 94;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIIILclient!q;BLclient!da;ILclient!r;)V")
	public void method6518(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11 arg4, @OriginalArg(6) Class60 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class45 arg7) {
		@Pc(14) Class248[] local14 = arg5.method7238();
		@Pc(17) Class281[] local17 = arg5.method7244();
		if ((this.aClass41_Sub9_5 == null || this.aClass41_Sub9_5.aBoolean722) && (local14 != null || local17 != null)) {
			@Pc(34) Class280 local34 = Static478.aClass212_3.method4793(this.anInt7833);
			if (local34.anIntArray457 != null) {
				local34 = local34.method6181(Static491.aClass318_1);
			}
			if (local34 != null) {
				this.aClass41_Sub9_5 = Static575.method7722(Static506.anInt8251, true);
			}
		}
		if (this.aClass41_Sub9_5 == null) {
			return;
		}
		arg5.method7234(arg4);
		if (arg0) {
			this.aClass41_Sub9_5.method7732(arg7, (long) Static506.anInt8251, local14, local17);
		} else {
			this.aClass41_Sub9_5.method7734((long) Static506.anInt8251);
		}
		this.aClass41_Sub9_5.method7721(this.aByte102, arg1, arg3, arg2, arg6);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!r;I)V")
	public void method6519(@OriginalArg(0) Class45 arg0) {
		this.method6510(true, arg0, this.anInt7840, true, 262144, this.anInt7826);
	}
}
