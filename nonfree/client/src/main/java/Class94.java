import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class94 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public int anInt2166;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "Lclient!vq;")
	public Class254 aClass254_4;

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
	public int anInt2186;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	private int anInt2187;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "Lclient!ke;")
	private Class137 aClass137_11;

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public int anInt2191;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	private int anInt2192;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Z")
	public boolean aBoolean162 = true;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt2165 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public int anInt2179 = -1;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	private int anInt2172 = -1;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
	private int anInt2185 = -1;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public int anInt2178 = -1;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
	public int anInt2188 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
	private int anInt2189 = -1;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	public int anInt2173 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	public int anInt2171 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
	public int anInt2183 = -1;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
	private int anInt2184 = -1;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	private int anInt2176 = -1;

	@OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
	public int anInt2190 = 0;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public int anInt2168 = -1;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray20 = new String[5];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1998(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass137_11 == null) {
			return arg1;
		} else {
			@Pc(22) Class6_Sub11 local22 = (Class6_Sub11) this.aClass137_11.method3175((long) arg0);
			return local22 == null ? arg1 : local22.aString14;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;II)V")
	private void method1999(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2183 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt2168 = arg0.method3108();
		} else if (arg1 == 3) {
			this.aString20 = arg0.method3093();
		} else if (arg1 == 4) {
			this.anInt2169 = arg0.method3078();
		} else if (arg1 == 5) {
			this.anInt2179 = arg0.method3078();
		} else if (arg1 == 6) {
			this.anInt2190 = arg0.method3111();
		} else {
			@Pc(206) int local206;
			if (arg1 == 7) {
				local206 = arg0.method3111();
				if ((local206 & 0x1) == 0) {
					this.aBoolean162 = false;
				}
				if ((local206 & 0x2) == 2) {
					this.aBoolean164 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean165 = arg0.method3111() == 1;
			} else if (arg1 == 9) {
				this.anInt2184 = arg0.method3108();
				if (this.anInt2184 == 65535) {
					this.anInt2184 = -1;
				}
				this.anInt2189 = arg0.method3108();
				if (this.anInt2189 == 65535) {
					this.anInt2189 = -1;
				}
				this.anInt2182 = arg0.method3109();
				this.anInt2167 = arg0.method3109();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray20[arg1 - 10] = arg0.method3093();
			} else {
				@Pc(215) int local215;
				if (arg1 == 15) {
					local206 = arg0.method3111();
					this.anIntArray230 = new int[local206 * 2];
					for (local215 = 0; local215 < local206 * 2; local215++) {
						this.anIntArray230[local215] = arg0.method3103();
					}
					this.anInt2166 = arg0.method3109();
					this.anInt2174 = arg0.method3109();
				} else if (arg1 == 16) {
					this.aBoolean163 = false;
				} else if (arg1 == 17) {
					this.aString19 = arg0.method3093();
				} else if (arg1 == 18) {
					this.anInt2172 = arg0.method3108();
				} else if (arg1 == 19) {
					this.anInt2178 = arg0.method3108();
				} else if (arg1 == 20) {
					this.anInt2185 = arg0.method3108();
					if (this.anInt2185 == 65535) {
						this.anInt2185 = -1;
					}
					this.anInt2176 = arg0.method3108();
					if (this.anInt2176 == 65535) {
						this.anInt2176 = -1;
					}
					this.anInt2192 = arg0.method3109();
					this.anInt2187 = arg0.method3109();
				} else if (arg1 == 21) {
					this.anInt2186 = arg0.method3109();
				} else if (arg1 == 22) {
					this.anInt2181 = arg0.method3109();
				} else if (arg1 == 249) {
					local206 = arg0.method3111();
					if (this.aClass137_11 == null) {
						local215 = Static420.method5696(local206);
						this.aClass137_11 = new Class137(local215);
					}
					for (local215 = 0; local215 < local206; local215++) {
						@Pc(234) boolean local234 = arg0.method3111() == 1;
						@Pc(240) int local240 = arg0.method3078();
						@Pc(249) Class6 local249;
						if (local234) {
							local249 = new Class6_Sub11(arg0.method3093());
						} else {
							local249 = new Class6_Sub44(arg0.method3109());
						}
						this.aClass137_11.method3179((long) local240, local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!dr;I)Z")
	public boolean method2000(@OriginalArg(0) Interface4 arg0) {
		@Pc(19) int local19;
		if (this.anInt2189 == -1) {
			if (this.anInt2184 == -1) {
				return true;
			}
			local19 = arg0.method2802(this.anInt2184);
		} else {
			local19 = arg0.method2803(this.anInt2189);
		}
		if (this.anInt2182 > local19 || this.anInt2167 < local19) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt2176 == -1) {
			if (this.anInt2185 == -1) {
				return true;
			}
			local67 = arg0.method2802(this.anInt2185);
		} else {
			local67 = arg0.method2803(this.anInt2176);
		}
		return local67 >= this.anInt2192 && local67 <= this.anInt2187;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!ig;")
	public Class12 method2001(@OriginalArg(0) Class28 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt2168 : this.anInt2183;
		@Pc(18) int local18 = local11 | arg0.anInt3899 << 29;
		@Pc(27) Class12 local27 = (Class12) this.aClass254_4.aClass220_55.method4990((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass254_4.aClass158_91.method3686(local11)) {
			@Pc(56) Class77 local56 = Static455.method1703(this.aClass254_4.aClass158_91, local11, 0);
			if (local56 != null) {
				local27 = arg0.method3540(local56);
				this.aClass254_4.aClass220_55.method4996(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method2003(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method1999(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!qq;)Lclient!ig;")
	public Class12 method2004(@OriginalArg(1) Class28 arg0) {
		@Pc(28) Class12 local28 = (Class12) this.aClass254_4.aClass220_55.method4990((long) (arg0.anInt3899 << 29 | 0x20000 | this.anInt2172));
		if (local28 != null) {
			return local28;
		}
		this.aClass254_4.aClass158_91.method3686(this.anInt2172);
		@Pc(48) Class77 local48 = Static455.method1703(this.aClass254_4.aClass158_91, this.anInt2172, 0);
		if (local48 != null) {
			local28 = arg0.method3540(local48);
			this.aClass254_4.aClass220_55.method4996(local28, (long) (this.anInt2172 | 0x20000 | arg0.anInt3899 << 29));
		}
		return local28;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZ)I")
	public int method2005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass137_11 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub44 local16 = (Class6_Sub44) this.aClass137_11.method3175((long) arg0);
			return local16 == null ? arg1 : local16.anInt7027;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method2006() {
		if (this.anIntArray230 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray230.length; local16 += 2) {
			if (this.anIntArray230[local16] < this.anInt2165) {
				this.anInt2165 = this.anIntArray230[local16];
			} else if (this.anInt2171 < this.anIntArray230[local16]) {
				this.anInt2171 = this.anIntArray230[local16];
			}
			if (this.anInt2173 > this.anIntArray230[local16 + 1]) {
				this.anInt2173 = this.anIntArray230[local16 + 1];
			} else if (this.anInt2188 < this.anIntArray230[local16 + 1]) {
				this.anInt2188 = this.anIntArray230[local16 + 1];
			}
		}
	}
}
