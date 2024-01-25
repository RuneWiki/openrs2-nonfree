import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class176 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	private int anInt5055;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!n;")
	public Class213 aClass213_4;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private int anInt5061;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public int anInt5062;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	private int anInt5065;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!hd;")
	private Class128 aClass128_24;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Ljava/lang/String;")
	public String aString38;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	private int anInt5073;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
	public int anInt5074;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	public int anInt5078;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
	public int anInt5083;

	@OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
	public int anInt5084;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public int anInt5059 = -1;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt5058 = -1;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public int anInt5060 = 0;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public int anInt5064 = -1;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public int anInt5070 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public int anInt5069 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public int anInt5071 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
	private int anInt5077 = -1;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
	public int anInt5079 = -1;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	private int anInt5068 = -1;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
	public int anInt5086 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	private int anInt5080 = -1;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Z")
	public boolean aBoolean355 = true;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Z")
	public boolean aBoolean356 = true;

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
	private int anInt5085 = -1;

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
	private int anInt5087 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method4377(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6069();
			if (local13 == 0) {
				return;
			}
			this.method4381(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ada;)Z")
	public boolean method4379(@OriginalArg(1) Interface2 arg0) {
		@Pc(27) int local27;
		if (this.anInt5068 == -1) {
			if (this.anInt5085 == -1) {
				return true;
			}
			local27 = arg0.method2865(this.anInt5085);
		} else {
			local27 = arg0.method2866(this.anInt5068);
		}
		if (this.anInt5073 > local27 || local27 > this.anInt5065) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt5077 == -1) {
			if (this.anInt5080 == -1) {
				return true;
			}
			local66 = arg0.method2865(this.anInt5080);
		} else {
			local66 = arg0.method2866(this.anInt5077);
		}
		return this.anInt5055 <= local66 && local66 <= this.anInt5061;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZILclient!oa;)Lclient!xa;")
	public Class58 method4380(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5079 : this.anInt5058;
		@Pc(25) int local25 = arg1.anInt8396 << 29 | local11;
		@Pc(34) Class58 local34 = (Class58) this.aClass213_4.aClass136_71.method3473((long) local25);
		if (local34 != null) {
			return local34;
		} else if (this.aClass213_4.aClass251_80.method5782(local11)) {
			@Pc(54) Class140 local54 = Static604.method3623(this.aClass213_4.aClass251_80, local11, 0);
			if (local54 != null) {
				local34 = arg1.method6889(local54, true);
				this.aClass213_4.aClass136_71.method3482((long) local25, local34);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!ji;)V")
	private void method4381(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt5058 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt5079 = arg1.method6003();
		} else if (arg0 == 3) {
			this.aString38 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt5074 = arg1.method6031();
		} else if (arg0 == 5) {
			this.anInt5059 = arg1.method6031();
		} else if (arg0 == 6) {
			this.anInt5060 = arg1.method6069();
		} else {
			@Pc(70) int local70;
			if (arg0 == 7) {
				local70 = arg1.method6069();
				if ((local70 & 0x2) == 2) {
					this.aBoolean358 = true;
				}
				if ((local70 & 0x1) == 0) {
					this.aBoolean356 = false;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean357 = arg1.method6069() == 1;
				return;
			} else if (arg0 == 9) {
				this.anInt5085 = arg1.method6003();
				if (this.anInt5085 == 65535) {
					this.anInt5085 = -1;
				}
				this.anInt5068 = arg1.method6003();
				if (this.anInt5068 == 65535) {
					this.anInt5068 = -1;
				}
				this.anInt5073 = arg1.method6036();
				this.anInt5065 = arg1.method6036();
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(220) int local220;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean355 = false;
						return;
					}
					if (arg0 == 17) {
						this.aString39 = arg1.method6044();
						return;
					}
					if (arg0 == 18) {
						this.anInt5087 = arg1.method6003();
						return;
					}
					if (arg0 == 19) {
						this.anInt5064 = arg1.method6003();
						return;
					}
					if (arg0 == 20) {
						this.anInt5080 = arg1.method6003();
						if (this.anInt5080 == 65535) {
							this.anInt5080 = -1;
						}
						this.anInt5077 = arg1.method6003();
						if (this.anInt5077 == 65535) {
							this.anInt5077 = -1;
						}
						this.anInt5055 = arg1.method6036();
						this.anInt5061 = arg1.method6036();
						return;
					}
					if (arg0 == 21) {
						this.anInt5072 = arg1.method6036();
					} else if (arg0 == 22) {
						this.anInt5083 = arg1.method6036();
						return;
					} else if (arg0 == 249) {
						local70 = arg1.method6069();
						if (this.aClass128_24 == null) {
							local220 = Static253.method4296(local70);
							this.aClass128_24 = new Class128(local220);
						}
						for (local220 = 0; local220 < local70; local220++) {
							@Pc(239) boolean local239 = arg1.method6069() == 1;
							@Pc(243) int local243 = arg1.method6031();
							@Pc(252) Class6 local252;
							if (local239) {
								local252 = new Class6_Sub25(arg1.method6044());
							} else {
								local252 = new Class6_Sub35(arg1.method6036());
							}
							this.aClass128_24.method3267(local252, (long) local243);
						}
						return;
					}
					return;
				}
				local70 = arg1.method6069();
				this.anIntArray385 = new int[local70 * 2];
				for (local220 = 0; local220 < local70 * 2; local220++) {
					this.anIntArray385[local220] = arg1.method6058();
				}
				this.anInt5078 = arg1.method6036();
				this.anInt5062 = arg1.method6036();
				return;
			} else {
				this.aStringArray14[arg0 - 10] = arg1.method6044();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I")
	public int method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass128_24 == null) {
			return arg1;
		} else {
			@Pc(24) Class6_Sub35 local24 = (Class6_Sub35) this.aClass128_24.method3263((long) arg0);
			return local24 == null ? arg1 : local24.anInt6119;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!oa;I)Lclient!xa;")
	public Class58 method4384(@OriginalArg(0) Class14 arg0) {
		@Pc(26) Class58 local26 = (Class58) this.aClass213_4.aClass136_71.method3473((long) (arg0.anInt8396 << 29 | this.anInt5087 | 0x20000));
		if (local26 != null) {
			return local26;
		}
		this.aClass213_4.aClass251_80.method5782(this.anInt5087);
		@Pc(46) Class140 local46 = Static604.method3623(this.aClass213_4.aClass251_80, this.anInt5087, 0);
		if (local46 != null) {
			local26 = arg0.method6889(local46, true);
			this.aClass213_4.aClass136_71.method3482((long) (this.anInt5087 | 0x20000 | arg0.anInt8396 << 29), local26);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method4385(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass128_24 == null) {
			return arg0;
		} else {
			@Pc(21) Class6_Sub25 local21 = (Class6_Sub25) this.aClass128_24.method3263((long) arg1);
			return local21 == null ? arg0 : local21.aString28;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public void method4386() {
		if (this.anIntArray385 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray385.length; local6 += 2) {
			if (this.anInt5069 > this.anIntArray385[local6]) {
				this.anInt5069 = this.anIntArray385[local6];
			} else if (this.anInt5070 < this.anIntArray385[local6]) {
				this.anInt5070 = this.anIntArray385[local6];
			}
			if (this.anInt5071 > this.anIntArray385[local6 + 1]) {
				this.anInt5071 = this.anIntArray385[local6 + 1];
			} else if (this.anIntArray385[local6 + 1] > this.anInt5086) {
				this.anInt5086 = this.anIntArray385[local6 + 1];
			}
		}
	}
}
