import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class65 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!pt;")
	private Class230 aClass230_15;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	private int anInt1893;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	private int anInt1894;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public int anInt1896;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	public int anInt1907;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Lclient!bl;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "I")
	public int anInt1909;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "I")
	public int anInt1912;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "I")
	private int anInt1914;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	public int anInt1916;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	public int anInt1891 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "I")
	private int anInt1905 = -1;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "I")
	public int anInt1899 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	public int anInt1903 = -1;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public int anInt1900 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	private int anInt1902 = -1;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "I")
	private int anInt1911 = -1;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	private int anInt1901 = -1;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	public int anInt1915 = -1;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	private int anInt1892 = -1;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "I")
	public int anInt1920 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "Z")
	public boolean aBoolean158 = true;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "I")
	public int anInt1917 = -1;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "I")
	public int anInt1910 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "I")
	public int anInt1922 = -1;

	static {
		new Class45("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLclient!waa;)Z")
	public boolean method1818(@OriginalArg(1) Interface19 arg0) {
		@Pc(15) int local15;
		if (this.anInt1902 == -1) {
			if (this.anInt1892 == -1) {
				return true;
			}
			local15 = arg0.method523(this.anInt1892);
		} else {
			local15 = arg0.method522(this.anInt1902);
		}
		if (local15 < this.anInt1908 || this.anInt1894 < local15) {
			return false;
		}
		@Pc(59) int local59;
		if (this.anInt1901 == -1) {
			if (this.anInt1905 == -1) {
				return true;
			}
			local59 = arg0.method523(this.anInt1905);
		} else {
			local59 = arg0.method522(this.anInt1901);
		}
		return local59 >= this.anInt1893 && this.anInt1914 >= local59;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1820(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass230_15 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub36 local24 = (Class1_Sub36) this.aClass230_15.method6144((long) arg0);
			return local24 == null ? arg1 : local24.aString138;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	public void method1821() {
		if (this.anIntArray125 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray125.length; local16 += 2) {
			if (this.anInt1891 > this.anIntArray125[local16]) {
				this.anInt1891 = this.anIntArray125[local16];
			} else if (this.anInt1899 < this.anIntArray125[local16]) {
				this.anInt1899 = this.anIntArray125[local16];
			}
			if (this.anIntArray125[local16 + 1] < this.anInt1910) {
				this.anInt1910 = this.anIntArray125[local16 + 1];
			} else if (this.anInt1900 < this.anIntArray125[local16 + 1]) {
				this.anInt1900 = this.anIntArray125[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!qa;I)Lclient!ha;")
	public Class104 method1822(@OriginalArg(0) Class4 arg0) {
		@Pc(20) Class104 local20 = (Class104) this.aClass32_1.aClass277_11.method7014((long) (arg0.anInt8106 << 29 | this.anInt1911 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass32_1.aClass69_12.method1896(this.anInt1911);
		@Pc(45) Class70 local45 = Static547.method1922(this.aClass32_1.aClass69_12, this.anInt1911, 0);
		if (local45 != null) {
			local20 = arg0.method7149(local45);
			this.aClass32_1.aClass277_11.method7016(local20, (long) (arg0.anInt8106 << 29 | 0x20000 | this.anInt1911));
		}
		return local20;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!qa;ZI)Lclient!ha;")
	public Class104 method1823(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1922 : this.anInt1903;
		@Pc(18) int local18 = arg0.anInt8106 << 29 | local11;
		@Pc(27) Class104 local27 = (Class104) this.aClass32_1.aClass277_11.method7014((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass32_1.aClass69_12.method1896(local11)) {
			@Pc(49) Class70 local49 = Static547.method1922(this.aClass32_1.aClass69_12, local11, 0);
			if (local49 != null) {
				local27 = arg0.method7149(local49);
				this.aClass32_1.aClass277_11.method7016(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)I")
	public int method1824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass230_15 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub14 local24 = (Class1_Sub14) this.aClass230_15.method6144((long) arg1);
			return local24 == null ? arg0 : local24.anInt2795;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!os;)V")
	private void method1825(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt1903 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt1922 = arg1.method4494();
		} else if (arg0 == 3) {
			this.aString37 = arg1.method4491();
		} else if (arg0 == 4) {
			this.anInt1909 = arg1.method4486();
		} else if (arg0 == 5) {
			this.anInt1917 = arg1.method4486();
		} else if (arg0 == 6) {
			this.anInt1920 = arg1.method4487();
		} else {
			@Pc(233) int local233;
			if (arg0 == 7) {
				local233 = arg1.method4487();
				if ((local233 & 0x1) == 0) {
					this.aBoolean157 = false;
				}
				if ((local233 & 0x2) == 2) {
					this.aBoolean155 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean158 = arg1.method4487() == 1;
			} else if (arg0 == 9) {
				this.anInt1892 = arg1.method4494();
				if (this.anInt1892 == 65535) {
					this.anInt1892 = -1;
				}
				this.anInt1902 = arg1.method4494();
				if (this.anInt1902 == 65535) {
					this.anInt1902 = -1;
				}
				this.anInt1908 = arg1.method4481();
				this.anInt1894 = arg1.method4481();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray9[arg0 - 10] = arg1.method4491();
			} else {
				@Pc(242) int local242;
				if (arg0 == 15) {
					local233 = arg1.method4487();
					this.anIntArray125 = new int[local233 * 2];
					for (local242 = 0; local242 < local233 * 2; local242++) {
						this.anIntArray125[local242] = arg1.method4447();
					}
					this.anInt1895 = arg1.method4481();
					this.anInt1907 = arg1.method4481();
				} else if (arg0 == 16) {
					this.aBoolean156 = false;
				} else if (arg0 == 17) {
					this.aString36 = arg1.method4491();
				} else if (arg0 == 18) {
					this.anInt1911 = arg1.method4494();
				} else if (arg0 == 19) {
					this.anInt1915 = arg1.method4494();
				} else if (arg0 == 20) {
					this.anInt1905 = arg1.method4494();
					if (this.anInt1905 == 65535) {
						this.anInt1905 = -1;
					}
					this.anInt1901 = arg1.method4494();
					if (this.anInt1901 == 65535) {
						this.anInt1901 = -1;
					}
					this.anInt1893 = arg1.method4481();
					this.anInt1914 = arg1.method4481();
				} else if (arg0 == 21) {
					this.anInt1896 = arg1.method4481();
				} else if (arg0 == 22) {
					this.anInt1912 = arg1.method4481();
				} else if (arg0 == 249) {
					local233 = arg1.method4487();
					if (this.aClass230_15 == null) {
						local242 = Static184.method3549(local233);
						this.aClass230_15 = new Class230(local242);
					}
					for (local242 = 0; local242 < local233; local242++) {
						@Pc(261) boolean local261 = arg1.method4487() == 1;
						@Pc(265) int local265 = arg1.method4486();
						@Pc(274) Class1 local274;
						if (local261) {
							local274 = new Class1_Sub36(arg1.method4491());
						} else {
							local274 = new Class1_Sub14(arg1.method4481());
						}
						this.aClass230_15.method6139((long) local265, local274);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!os;)V")
	public void method1826(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4487();
			if (local17 == 0) {
				return;
			}
			this.method1825(local17, arg0);
		}
	}
}
