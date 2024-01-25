import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class78 {

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public int anInt2139;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	private int anInt2142;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	private int anInt2147;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	public int anInt2152;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "Lclient!ew;")
	private Class72 aClass72_12;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
	private int anInt2159;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
	public int anInt2160;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	public int anInt2162;

	@OriginalMember(owner = "client!fk", name = "N", descriptor = "Lclient!iv;")
	public Class120 aClass120_1;

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
	private int anInt2165;

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public int anInt2137 = -1;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public int anInt2133 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt2145 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt2146 = -1;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public int anInt2140 = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	private int anInt2132 = -1;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	private int anInt2134 = -1;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
	private int anInt2158 = -1;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public int anInt2148 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	public int anInt2164 = 0;

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
	public int anInt2166 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	private int anInt2156 = -1;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
	public int anInt2163 = -1;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	private int anInt2161 = -1;

	static {
		new Class134("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!wn;)Z")
	public boolean method1749(@OriginalArg(1) Interface12 arg0) {
		@Pc(20) int local20;
		if (this.anInt2156 == -1) {
			if (this.anInt2161 == -1) {
				return true;
			}
			local20 = arg0.method5650(this.anInt2161);
		} else {
			local20 = arg0.method5649(this.anInt2156);
		}
		if (local20 < this.anInt2147 || this.anInt2165 < local20) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt2158 == -1) {
			if (this.anInt2132 == -1) {
				return true;
			}
			local61 = arg0.method5650(this.anInt2132);
		} else {
			local61 = arg0.method5649(this.anInt2158);
		}
		return this.anInt2159 <= local61 && this.anInt2142 >= local61;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!za;ZI)Lclient!o;")
	public Class13 method1750(@OriginalArg(0) Class163 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt2140 : this.anInt2137;
		@Pc(18) int local18 = arg0.anInt7061 << 29 | local11;
		@Pc(29) Class13 local29 = (Class13) this.aClass120_1.aClass132_22.method2701((long) local18);
		if (local29 != null) {
			return local29;
		} else if (this.aClass120_1.aClass54_54.method1131(local11)) {
			@Pc(49) Class17 local49 = Static461.method262(this.aClass120_1.aClass54_54, local11, 0);
			if (local49 != null) {
				local29 = arg0.method5549(local49);
				this.aClass120_1.aClass132_22.method2711(local29, (long) local18);
			}
			return local29;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public void method1751() {
		if (this.anIntArray161 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray161.length; local19 += 2) {
			if (this.anInt2166 > this.anIntArray161[local19]) {
				this.anInt2166 = this.anIntArray161[local19];
			} else if (this.anIntArray161[local19] > this.anInt2133) {
				this.anInt2133 = this.anIntArray161[local19];
			}
			if (this.anInt2148 > this.anIntArray161[local19 + 1]) {
				this.anInt2148 = this.anIntArray161[local19 + 1];
			} else if (this.anIntArray161[local19 + 1] > this.anInt2145) {
				this.anInt2145 = this.anIntArray161[local19 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BILclient!sv;)V")
	private void method1752(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2137 = arg1.method3555();
		} else if (arg0 == 2) {
			this.anInt2140 = arg1.method3555();
		} else if (arg0 == 3) {
			this.aString66 = arg1.method3582();
		} else if (arg0 == 4) {
			this.anInt2167 = arg1.method3563();
		} else if (arg0 == 5) {
			this.anInt2146 = arg1.method3563();
		} else if (arg0 == 6) {
			this.anInt2164 = arg1.method3580();
		} else {
			@Pc(118) int local118;
			if (arg0 == 7) {
				local118 = arg1.method3580();
				if ((local118 & 0x1) == 0) {
					this.aBoolean145 = false;
				}
				if ((local118 & 0x2) == 2) {
					this.aBoolean143 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean142 = arg1.method3580() == 1;
			} else if (arg0 == 9) {
				this.anInt2161 = arg1.method3555();
				if (this.anInt2161 == 65535) {
					this.anInt2161 = -1;
				}
				this.anInt2156 = arg1.method3555();
				if (this.anInt2156 == 65535) {
					this.anInt2156 = -1;
				}
				this.anInt2147 = arg1.method3574();
				this.anInt2165 = arg1.method3574();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray9[arg0 - 10] = arg1.method3582();
			} else {
				@Pc(126) int local126;
				if (arg0 == 15) {
					local118 = arg1.method3580();
					this.anIntArray161 = new int[local118 * 2];
					for (local126 = 0; local126 < local118 * 2; local126++) {
						this.anIntArray161[local126] = arg1.method3558();
					}
					this.anInt2136 = arg1.method3574();
					this.anInt2160 = arg1.method3574();
				} else if (arg0 == 16) {
					this.aBoolean144 = false;
				} else if (arg0 == 17) {
					this.aString65 = arg1.method3582();
				} else if (arg0 == 18) {
					this.anInt2134 = arg1.method3555();
				} else if (arg0 == 19) {
					this.anInt2163 = arg1.method3555();
				} else if (arg0 == 20) {
					this.anInt2132 = arg1.method3555();
					if (this.anInt2132 == 65535) {
						this.anInt2132 = -1;
					}
					this.anInt2158 = arg1.method3555();
					if (this.anInt2158 == 65535) {
						this.anInt2158 = -1;
					}
					this.anInt2159 = arg1.method3574();
					this.anInt2142 = arg1.method3574();
				} else if (arg0 == 21) {
					this.anInt2152 = arg1.method3574();
				} else if (arg0 == 22) {
					this.anInt2139 = arg1.method3574();
				} else if (arg0 == 249) {
					local118 = arg1.method3580();
					if (this.aClass72_12 == null) {
						local126 = Static29.method453(local118);
						this.aClass72_12 = new Class72(local126);
					}
					for (local126 = 0; local126 < local118; local126++) {
						@Pc(232) boolean local232 = arg1.method3580() == 1;
						@Pc(238) int local238 = arg1.method3563();
						@Pc(249) Class2 local249;
						if (local232) {
							local249 = new Class2_Sub3(arg1.method3582());
						} else {
							local249 = new Class2_Sub20(arg1.method3574());
						}
						this.aClass72_12.method1653(local249, (long) local238);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!za;)Lclient!o;")
	public Class13 method1753(@OriginalArg(1) Class163 arg0) {
		@Pc(20) Class13 local20 = (Class13) this.aClass120_1.aClass132_22.method2701((long) (arg0.anInt7061 << 29 | 0x20000 | this.anInt2134));
		if (local20 != null) {
			return local20;
		}
		this.aClass120_1.aClass54_54.method1131(this.anInt2134);
		@Pc(45) Class17 local45 = Static461.method262(this.aClass120_1.aClass54_54, this.anInt2134, 0);
		if (local45 != null) {
			local20 = arg0.method5549(local45);
			this.aClass120_1.aClass132_22.method2711(local20, (long) (arg0.anInt7061 << 29 | 0x20000 | this.anInt2134));
		}
		return local20;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1755(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass72_12 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub3 local22 = (Class2_Sub3) this.aClass72_12.method1659((long) arg0);
			return local22 == null ? arg1 : local22.aString10;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!sv;)V")
	public void method1756(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3580();
			if (local5 == 0) {
				return;
			}
			this.method1752(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)I")
	public int method1758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass72_12 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub20 local24 = (Class2_Sub20) this.aClass72_12.method1659((long) arg0);
			return local24 == null ? arg1 : local24.anInt2212;
		}
	}
}
