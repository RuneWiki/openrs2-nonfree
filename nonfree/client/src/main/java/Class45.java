import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class45 {

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
	private int anInt1897;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!hg;")
	private Class130 aClass130_1;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!ka;")
	private Class166 aClass166_2;

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub7 aClass2_Sub6_Sub7_2;

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "Lclient!uj;")
	public Class3_Sub9 aClass3_Sub9_2;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	private int anInt1915;

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
	private int anInt1916;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
	private int anInt1901 = 0;

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	private int anInt1898 = 0;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
	private int anInt1896 = -1;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	private int anInt1899 = -1;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	private int anInt1907 = -1;

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
	public final int anInt1912;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	public final int anInt1904;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Lclient!ga;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	public final int anInt1895;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "Z")
	private final boolean aBoolean162;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!ha;Lclient!iv;IIIILclient!ga;ZI)V")
	public Class45(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt1912 = arg2;
		this.anInt1904 = arg1.anInt5398;
		this.aClass3_Sub1_3 = arg6;
		this.aByte22 = (byte) arg4;
		this.aByte21 = (byte) arg5;
		this.aBoolean163 = arg7;
		this.anInt1895 = arg3;
		this.aBoolean162 = arg0.method7285() && arg1.aBoolean398 && !this.aBoolean163;
		if (arg8 != -1) {
			this.aBoolean161 = true;
		}
		this.method1807(arg8);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
	public int method1804() {
		return this.anInt1901;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
	public int method1805(@OriginalArg(0) int arg0) {
		if (arg0 > -20) {
			this.finalize();
		}
		return this.anInt1898;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Z")
	public boolean method1806() {
		return this.aBoolean162;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)V")
	private void method1807(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0;
		@Pc(15) boolean local15 = false;
		if (arg0 == -1) {
			@Pc(26) Class161 local26 = Static27.aClass342_3.method8534(this.anInt1904);
			@Pc(28) Class161 local28 = local26;
			if (local26.anIntArray288 != null) {
				local26 = local26.method4606(Static286.aClass263_3);
			}
			if (local26 == null) {
				return;
			}
			if (local28 == local26) {
				local28 = null;
			}
			if (local26.anIntArray287 != null) {
				if (this.aClass130_1 != null && local26.method4607(this.aClass130_1.anInt4713)) {
					return;
				}
				local13 = local26.method4615();
				if (local26.anInt5398 != this.anInt1896) {
					local15 = local26.aBoolean405;
				}
			} else if (local26.anInt5358 == -1) {
				if (local28 != null && local28.anIntArray287 != null) {
					if (this.aClass130_1 != null && local28.method4607(this.aClass130_1.anInt4713)) {
						return;
					}
					local13 = local28.method4615();
					if (this.anInt1896 != local28.anInt5398) {
						local15 = local28.aBoolean405;
					}
				} else if (local28 != null && local28.anInt5358 != -1 && local28.anInt5398 != this.anInt1896) {
					local15 = local28.aBoolean405;
					local13 = local28.anInt5358;
				}
			} else if (local26.anInt5398 != this.anInt1896) {
				local13 = local26.anInt5358;
				local15 = local26.aBoolean405;
			}
		}
		if (local13 == -1) {
			this.aClass130_1 = null;
			return;
		}
		this.aClass166_2 = null;
		if (this.aClass130_1 == null || local13 != this.aClass130_1.anInt4713) {
			this.aClass130_1 = Static195.aClass193_1.method5573(local13);
		} else if (this.aClass130_1.anInt4705 == 0) {
			return;
		}
		if (this.aClass130_1.anIntArray237 == null) {
			this.aClass130_1 = null;
			return;
		}
		if (local15) {
			this.anInt1916 = (int) ((double) this.aClass130_1.anIntArray237.length * Math.random());
			this.anInt1897 = (int) ((double) this.aClass130_1.anIntArray242[this.anInt1916] * Math.random()) + 1;
		} else {
			this.anInt1916 = 0;
			this.anInt1897 = 1;
		}
		this.anInt1915 = this.anInt1916 + 1;
		if (this.anInt1915 < 0 || this.aClass130_1.anIntArray237.length <= this.anInt1915) {
			this.anInt1915 = -1;
		}
		this.anInt1908 = Static407.anInt7704 - this.anInt1897;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!ha;)V")
	public void method1808(@OriginalArg(1) Class20 arg0) {
		this.method1809(true, true, 262144, arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZIILclient!ha;)Lclient!ka;")
	public Class166 method1809(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class20 arg3) {
		@Pc(11) Class161 local11 = Static27.aClass342_3.method8534(this.anInt1904);
		if (local11.anIntArray288 != null) {
			local11 = local11.method4606(Static286.aClass263_3);
		}
		if (local11 == null) {
			this.method1815(arg3);
			this.anInt1907 = -1;
			this.anInt1899 = -1;
			this.anInt1896 = -1;
			return null;
		}
		if (!this.aBoolean161 && this.anInt1896 != local11.anInt5398) {
			this.aClass166_2 = null;
			this.method1807(-1);
		}
		this.method1813(this.aClass3_Sub1_3);
		if (arg1) {
			@Pc(76) boolean local76 = arg1 & this.aBoolean162 & Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() != 0;
			arg1 = local76 & (local11.anInt5398 != this.anInt1899 || this.aClass130_1 != null && Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() >= 2 && (this.anInt1907 != this.anInt1916 || (this.aClass130_1.aBoolean349 || Static225.aBoolean373) && this.anInt1916 != this.anInt1915));
		}
		if (arg0 && !arg1) {
			this.anInt1896 = local11.anInt5398;
			return null;
		}
		if (arg1) {
			Static427.method6848(this.aClass2_Sub6_Sub7_2, this.aByte21, this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310, this.aBooleanArray8);
			this.anInt1899 = -1;
			this.anInt1907 = -1;
		}
		@Pc(161) Class65 local161 = Static9.aClass65Array1[this.aByte21];
		@Pc(177) Class65 local177;
		if (this.aBoolean163) {
			local177 = Static40.aClass65Array2[0];
		} else {
			local177 = this.aByte21 >= 3 ? null : Static9.aClass65Array1[this.aByte21 + 1];
		}
		@Pc(185) Class166 local185 = null;
		if (this.aClass130_1 != null) {
			if (arg1) {
				arg2 |= 0x40000;
			}
			local185 = local11.method4609(this.anInt1915, this.anInt1897, this.anInt1912 == 11 ? 10 : this.anInt1912, local161.method7999(this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310), arg3, this.anInt1912 == 11 ? this.anInt1895 + 4 : this.anInt1895, arg2, local177, this.aClass3_Sub1_3.anInt10310, this.anInt1916, this.aClass3_Sub1_3.anInt10303, this.aClass130_1, local161);
			if (local185 == null) {
				this.anInt1898 = 0;
				this.aBooleanArray8 = null;
				this.anInt1901 = 0;
				this.aClass2_Sub6_Sub7_2 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray8 == null) {
						this.aBooleanArray8 = new boolean[4];
					}
					this.aClass2_Sub6_Sub7_2 = local185.ba(this.aClass2_Sub6_Sub7_2);
					Static378.method2839(this.aClass2_Sub6_Sub7_2, this.aByte21, this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310, this.aBooleanArray8);
					this.anInt1907 = this.anInt1916;
					this.anInt1899 = local11.anInt5398;
				}
				this.anInt1901 = local185.fa();
				this.anInt1898 = local185.ma();
			}
			this.aClass166_2 = null;
		} else if (this.aClass166_2 != null && arg2 == (arg2 & this.aClass166_2.ua()) && local11.anInt5398 == this.anInt1896) {
			local185 = this.aClass166_2;
		} else {
			if (this.aClass166_2 != null) {
				arg2 |= this.aClass166_2.ua();
			}
			@Pc(261) Class16 local261 = local11.method4602(arg3, local177, this.anInt1912 == 11 ? 10 : this.anInt1912, arg2, this.aClass3_Sub1_3.anInt10303, arg1, local161, local161.method7999(this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310), this.aClass3_Sub1_3.anInt10310, this.anInt1912 == 11 ? this.anInt1895 + 4 : this.anInt1895);
			if (local261 == null) {
				this.anInt1898 = 0;
				this.aBooleanArray8 = null;
				this.aClass2_Sub6_Sub7_2 = null;
				this.anInt1901 = 0;
				this.aClass166_2 = null;
			} else {
				local185 = local261.aClass166_1;
				this.aClass166_2 = local261.aClass166_1;
				if (arg1) {
					this.aBooleanArray8 = null;
					this.aClass2_Sub6_Sub7_2 = local261.aClass2_Sub6_Sub7_1;
					Static378.method2839(this.aClass2_Sub6_Sub7_2, this.aByte21, this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310, null);
					this.anInt1907 = -1;
					this.anInt1899 = local11.anInt5398;
				}
				this.anInt1901 = local185.fa();
				this.anInt1898 = local185.ma();
			}
		}
		this.anInt1896 = local11.anInt5398;
		return local185;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!bca;ILclient!ha;ILclient!ka;ZBI)V")
	public void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class166 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(12) Class227[] local12 = arg5.method6689();
		@Pc(15) Class87[] local15 = arg5.method6674();
		if ((this.aClass3_Sub9_2 == null || this.aClass3_Sub9_2.aBoolean701) && (local12 != null || local15 != null)) {
			@Pc(32) Class161 local32 = Static27.aClass342_3.method8534(this.anInt1904);
			if (local32.anIntArray288 != null) {
				local32 = local32.method4606(Static286.aClass263_3);
			}
			if (local32 != null) {
				this.aClass3_Sub9_2 = Static575.method8577(Static407.anInt7704, true);
			}
		}
		if (this.aClass3_Sub9_2 == null) {
			return;
		}
		arg5.method6690(arg1);
		if (arg6) {
			this.aClass3_Sub9_2.method8587(arg3, (long) Static407.anInt7704, local12, local15);
		} else {
			this.aClass3_Sub9_2.method8591((long) Static407.anInt7704);
		}
		this.aClass3_Sub9_2.method8584(this.aByte22, arg4, arg0, arg7, arg2);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
	public void method1812(@OriginalArg(1) int arg0) {
		this.aBoolean161 = true;
		this.method1807(arg0);
	}

	@OriginalMember(owner = "client!bv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub9_2 != null) {
			this.aClass3_Sub9_2.method8585();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ga;Z)V")
	private void method1813(@OriginalArg(0) Class3_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass130_1 == null) {
				if (this.aBoolean161) {
					return;
				}
				this.method1807(-1);
				if (this.aClass130_1 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static407.anInt7704 - this.anInt1908;
			if (local33 > 100 && this.aClass130_1.anInt4698 > 0) {
				@Pc(50) int local50 = this.aClass130_1.anIntArray237.length - this.aClass130_1.anInt4698;
				while (this.anInt1916 < local50 && local33 > this.aClass130_1.anIntArray242[this.anInt1916]) {
					local33 -= this.aClass130_1.anIntArray242[this.anInt1916];
					this.anInt1916++;
				}
				if (this.anInt1916 >= local50) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local50; local95 < this.aClass130_1.anIntArray237.length; local95++) {
						local93 += this.aClass130_1.anIntArray242[local95];
					}
					local33 %= local93;
				}
				this.anInt1915 = this.anInt1916 + 1;
				if (this.anInt1915 >= this.aClass130_1.anIntArray237.length) {
					this.anInt1915 -= this.aClass130_1.anInt4698;
					if (this.anInt1915 < 0 || this.aClass130_1.anIntArray237.length <= this.anInt1915) {
						this.anInt1915 = -1;
					}
				}
			}
			while (local33 > this.aClass130_1.anIntArray242[this.anInt1916]) {
				Static609.method8918(arg0, this.anInt1916, this.aClass130_1);
				local33 -= this.aClass130_1.anIntArray242[this.anInt1916];
				this.anInt1916++;
				if (this.aClass130_1.anIntArray237.length <= this.anInt1916) {
					this.anInt1916 -= this.aClass130_1.anInt4698;
					if (this.anInt1916 < 0 || this.aClass130_1.anIntArray237.length <= this.anInt1916) {
						this.aClass130_1 = null;
						continue label80;
					}
				}
				this.anInt1915 = this.anInt1916 + 1;
				if (this.aClass130_1.anIntArray237.length <= this.anInt1915) {
					this.anInt1915 -= this.aClass130_1.anInt4698;
					if (this.anInt1915 < 0 || this.anInt1915 >= this.aClass130_1.anIntArray237.length) {
						this.anInt1915 = -1;
					}
				}
			}
			this.anInt1897 = local33;
			this.anInt1908 = Static407.anInt7704 - local33;
			return;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ha;)V")
	public void method1815(@OriginalArg(1) Class20 arg0) {
		if (this.aClass2_Sub6_Sub7_2 != null) {
			Static427.method6848(this.aClass2_Sub6_Sub7_2, this.aByte21, this.aClass3_Sub1_3.anInt10303, this.aClass3_Sub1_3.anInt10310, this.aBooleanArray8);
			this.aClass2_Sub6_Sub7_2 = null;
			this.aBooleanArray8 = null;
		}
	}
}
