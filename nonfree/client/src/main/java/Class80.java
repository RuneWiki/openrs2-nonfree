import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class80 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
	private int anInt2038;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
	public int anInt2045;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
	private int anInt2048;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	public int anInt2050;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "Lclient!sq;")
	private Class214 aClass214_12;

	@OriginalMember(owner = "client!fr", name = "M", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!fr", name = "P", descriptor = "I")
	public int anInt2058;

	@OriginalMember(owner = "client!fr", name = "V", descriptor = "I")
	private int anInt2063;

	@OriginalMember(owner = "client!fr", name = "W", descriptor = "Lclient!sn;")
	public Class211 aClass211_3;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	public int anInt2039 = -1;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public int anInt2036 = -1;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
	public int anInt2037 = -1;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	public int anInt2033 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
	public int anInt2055 = 0;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	private int anInt2043 = -1;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	public int anInt2046 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
	private int anInt2057 = -1;

	@OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
	private int anInt2056 = -1;

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	private int anInt2049 = -1;

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	private int anInt2035 = -1;

	@OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
	public int anInt2061 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
	public int anInt2042 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
	public int anInt2059 = -1;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method1841(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass214_12 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub32 local21 = (Class2_Sub32) this.aClass214_12.method5059((long) arg1);
			return local21 == null ? arg0 : local21.aString49;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method1842(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4240();
			if (local14 == 0) {
				return;
			}
			this.method1852(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZBLclient!km;)Lclient!aq;")
	public Class5 method1844(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(19) int local19 = arg0 ? this.anInt2059 : this.anInt2037;
		@Pc(26) int local26 = local19 | arg1.anInt5188 << 29;
		@Pc(35) Class5 local35 = (Class5) this.aClass211_3.aClass154_47.method3751((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass211_3.aClass71_77.method1560(local19)) {
			@Pc(55) Class224 local55 = Static404.method5304(this.aClass211_3.aClass71_77, local19, 0);
			if (local55 != null) {
				local35 = arg1.method4514(local55);
				this.aClass211_3.aClass154_47.method3745((long) local26, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLclient!fh;)Z")
	public boolean method1849(@OriginalArg(1) Interface2 arg0) {
		@Pc(15) int local15;
		if (this.anInt2049 == -1) {
			if (this.anInt2043 == -1) {
				return true;
			}
			local15 = arg0.method2733(this.anInt2043);
		} else {
			local15 = arg0.method2734(this.anInt2049);
		}
		if (local15 < this.anInt2047 || this.anInt2048 < local15) {
			return false;
		}
		@Pc(73) int local73;
		if (this.anInt2057 == -1) {
			if (this.anInt2056 == -1) {
				return true;
			}
			local73 = arg0.method2733(this.anInt2056);
		} else {
			local73 = arg0.method2734(this.anInt2057);
		}
		return this.anInt2038 <= local73 && this.anInt2063 >= local73;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	public void method1850() {
		if (this.anIntArray241 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray241.length; local16 += 2) {
			if (this.anInt2061 > this.anIntArray241[local16]) {
				this.anInt2061 = this.anIntArray241[local16];
			} else if (this.anIntArray241[local16] > this.anInt2033) {
				this.anInt2033 = this.anIntArray241[local16];
			}
			if (this.anInt2046 > this.anIntArray241[local16 + 1]) {
				this.anInt2046 = this.anIntArray241[local16 + 1];
			} else if (this.anIntArray241[local16 + 1] > this.anInt2042) {
				this.anInt2042 = this.anIntArray241[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)I")
	public int method1851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass214_12 == null) {
			return arg0;
		} else {
			@Pc(23) Class2_Sub44 local23 = (Class2_Sub44) this.aClass214_12.method5059((long) arg1);
			return local23 == null ? arg0 : local23.anInt6631;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!lk;I)V")
	private void method1852(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2037 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt2059 = arg0.method4245();
		} else if (arg1 == 3) {
			this.aString23 = arg0.method4201();
		} else if (arg1 == 4) {
			this.anInt2031 = arg0.method4235();
		} else if (arg1 == 5) {
			this.anInt2036 = arg0.method4235();
		} else if (arg1 == 6) {
			this.anInt2055 = arg0.method4240();
		} else {
			@Pc(49) int local49;
			if (arg1 == 7) {
				local49 = arg0.method4240();
				if ((local49 & 0x2) == 2) {
					this.aBoolean157 = true;
				}
				if ((local49 & 0x1) == 0) {
					this.aBoolean155 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean154 = arg0.method4240() == 1;
			} else if (arg1 == 9) {
				this.anInt2043 = arg0.method4245();
				if (this.anInt2043 == 65535) {
					this.anInt2043 = -1;
				}
				this.anInt2049 = arg0.method4245();
				if (this.anInt2049 == 65535) {
					this.anInt2049 = -1;
				}
				this.anInt2047 = arg0.method4239();
				this.anInt2048 = arg0.method4239();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray13[arg1 - 10] = arg0.method4201();
			} else {
				@Pc(244) int local244;
				if (arg1 == 15) {
					local49 = arg0.method4240();
					this.anIntArray241 = new int[local49 * 2];
					for (local244 = 0; local244 < local49 * 2; local244++) {
						this.anIntArray241[local244] = arg0.method4251();
					}
					this.anInt2058 = arg0.method4239();
					this.anInt2034 = arg0.method4239();
				} else if (arg1 == 16) {
					this.aBoolean156 = false;
				} else if (arg1 == 17) {
					this.aString24 = arg0.method4201();
				} else if (arg1 == 18) {
					this.anInt2035 = arg0.method4245();
				} else if (arg1 == 19) {
					this.anInt2039 = arg0.method4245();
				} else if (arg1 == 20) {
					this.anInt2056 = arg0.method4245();
					if (this.anInt2056 == 65535) {
						this.anInt2056 = -1;
					}
					this.anInt2057 = arg0.method4245();
					if (this.anInt2057 == 65535) {
						this.anInt2057 = -1;
					}
					this.anInt2038 = arg0.method4239();
					this.anInt2063 = arg0.method4239();
				} else if (arg1 == 21) {
					this.anInt2050 = arg0.method4239();
				} else if (arg1 == 22) {
					this.anInt2029 = arg0.method4239();
				} else if (arg1 == 249) {
					local49 = arg0.method4240();
					if (this.aClass214_12 == null) {
						local244 = Static353.method5359(local49);
						this.aClass214_12 = new Class214(local244);
					}
					for (local244 = 0; local244 < local49; local244++) {
						@Pc(263) boolean local263 = arg0.method4240() == 1;
						@Pc(267) int local267 = arg0.method4235();
						@Pc(276) Class2 local276;
						if (local263) {
							local276 = new Class2_Sub32(arg0.method4201());
						} else {
							local276 = new Class2_Sub44(arg0.method4239());
						}
						this.aClass214_12.method5065((long) local267, local276);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!km;)Lclient!aq;")
	public Class5 method1853(@OriginalArg(1) Class82 arg0) {
		@Pc(20) Class5 local20 = (Class5) this.aClass211_3.aClass154_47.method3751((long) (arg0.anInt5188 << 29 | 0x20000 | this.anInt2035));
		if (local20 != null) {
			return local20;
		}
		this.aClass211_3.aClass71_77.method1560(this.anInt2035);
		@Pc(46) Class224 local46 = Static404.method5304(this.aClass211_3.aClass71_77, this.anInt2035, 0);
		if (local46 != null) {
			local20 = arg0.method4514(local46);
			this.aClass211_3.aClass154_47.method3745((long) (arg0.anInt5188 << 29 | this.anInt2035 | 0x20000), local20);
		}
		return local20;
	}
}
