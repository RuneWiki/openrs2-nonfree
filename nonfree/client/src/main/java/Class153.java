import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class153 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public int anInt5216;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public int anInt5218;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[I")
	public int[] anIntArray272;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public int anInt5226;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	private int anInt5232;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	private int anInt5233;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "Lclient!eq;")
	private Class99 aClass99_39;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
	public int[] anIntArray273;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private int anInt5236;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "Lclient!on;")
	public Class248 aClass248_3;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	public int anInt5243;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public int anInt5219 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	private int anInt5221 = -1;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt5222 = -1;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
	public boolean aBoolean385 = true;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public int anInt5224 = -1;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	private int anInt5229 = -1;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	public int anInt5239 = -1;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "Z")
	public boolean aBoolean386 = true;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt5217 = -1;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public int anInt5223 = 0;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
	private int anInt5240 = -1;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	public int anInt5238 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	public int anInt5230 = -1;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
	public int anInt5244 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
	private int anInt5235 = -1;

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
	private int anInt5247 = -1;

	@OriginalMember(owner = "client!ii", name = "V", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	public int anInt5242 = -1;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
	public int anInt5248 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
	public int anInt5246 = -1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method4492() {
		if (this.anIntArray273 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray273.length; local16 += 2) {
			if (this.anInt5244 > this.anIntArray273[local16]) {
				this.anInt5244 = this.anIntArray273[local16];
			} else if (this.anIntArray273[local16] > this.anInt5238) {
				this.anInt5238 = this.anIntArray273[local16];
			}
			if (this.anIntArray273[local16 + 1] < this.anInt5248) {
				this.anInt5248 = this.anIntArray273[local16 + 1];
			} else if (this.anIntArray273[local16 + 1] > this.anInt5219) {
				this.anInt5219 = this.anIntArray273[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!dd;I)Z")
	public boolean method4493(@OriginalArg(0) Interface6 arg0) {
		@Pc(22) int local22;
		if (this.anInt5247 == -1) {
			if (this.anInt5235 == -1) {
				return true;
			}
			local22 = arg0.method6853(this.anInt5235);
		} else {
			local22 = arg0.method6852(this.anInt5247);
		}
		if (local22 < this.anInt5231 || this.anInt5236 < local22) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt5229 == -1) {
			if (this.anInt5221 == -1) {
				return true;
			}
			local67 = arg0.method6853(this.anInt5221);
		} else {
			local67 = arg0.method6852(this.anInt5229);
		}
		return this.anInt5233 <= local67 && this.anInt5232 >= local67;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLclient!ha;B)Lclient!mi;")
	public Class46 method4494(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5246 : this.anInt5224;
		@Pc(23) int local23 = local11 | arg1.anInt8557 << 29;
		@Pc(32) Class46 local32 = (Class46) this.aClass248_3.aClass169_44.method5002((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass248_3.aClass157_210.method4575(local11)) {
			@Pc(52) Class296 local52 = Static652.method7583(this.aClass248_3.aClass157_210, local11, 0);
			if (local52 != null) {
				local32 = arg1.method7294(local52, true);
				this.aClass248_3.aClass169_44.method5001(local32, (long) local23);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!ha;Z)Lclient!mi;")
	public Class46 method4495(@OriginalArg(0) Class20 arg0) {
		@Pc(28) Class46 local28 = (Class46) this.aClass248_3.aClass169_44.method5002((long) (this.anInt5240 | 0x20000 | arg0.anInt8557 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass248_3.aClass157_210.method4575(this.anInt5240);
		@Pc(48) Class296 local48 = Static652.method7583(this.aClass248_3.aClass157_210, this.anInt5240, 0);
		if (local48 != null) {
			local28 = arg0.method7294(local48, true);
			this.aClass248_3.aClass169_44.method5001(local28, (long) (arg0.anInt8557 << 29 | this.anInt5240 | 0x20000));
		}
		return local28;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method4496(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass99_39 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub12 local24 = (Class2_Sub12) this.aClass99_39.method3056((long) arg1);
			return local24 == null ? arg0 : local24.aString18;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method4497(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5224 = arg1.method8326();
		} else if (arg0 == 2) {
			this.anInt5246 = arg1.method8326();
		} else if (arg0 == 3) {
			this.aString51 = arg1.method8373();
		} else if (arg0 == 4) {
			this.anInt5226 = arg1.method8347();
		} else if (arg0 == 5) {
			this.anInt5217 = arg1.method8347();
		} else if (arg0 == 6) {
			this.anInt5223 = arg1.method8383();
		} else {
			@Pc(70) int local70;
			if (arg0 == 7) {
				local70 = arg1.method8383();
				if ((local70 & 0x1) == 0) {
					this.aBoolean385 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean384 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean386 = arg1.method8383() == 1;
			} else if (arg0 == 9) {
				this.anInt5235 = arg1.method8326();
				if (this.anInt5235 == 65535) {
					this.anInt5235 = -1;
				}
				this.anInt5247 = arg1.method8326();
				if (this.anInt5247 == 65535) {
					this.anInt5247 = -1;
				}
				this.anInt5231 = arg1.method8381();
				this.anInt5236 = arg1.method8381();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray18[arg0 - 10] = arg1.method8373();
			} else {
				@Pc(141) int local141;
				@Pc(171) int local171;
				if (arg0 == 15) {
					local70 = arg1.method8383();
					this.anIntArray273 = new int[local70 * 2];
					for (local141 = 0; local141 < local70 * 2; local141++) {
						this.anIntArray273[local141] = arg1.method8368();
					}
					this.anInt5228 = arg1.method8381();
					@Pc(165) int local165 = arg1.method8383();
					this.anIntArray272 = new int[local165];
					for (local171 = 0; local171 < this.anIntArray272.length; local171++) {
						this.anIntArray272[local171] = arg1.method8381();
					}
					this.aByteArray69 = new byte[local70];
					for (@Pc(196) int local196 = 0; local196 < local70; local196++) {
						this.aByteArray69[local196] = arg1.method8384();
					}
				} else if (arg0 == 16) {
					this.aBoolean387 = false;
				} else if (arg0 == 17) {
					this.aString50 = arg1.method8373();
				} else if (arg0 == 18) {
					this.anInt5240 = arg1.method8326();
				} else if (arg0 == 19) {
					this.anInt5239 = arg1.method8326();
				} else if (arg0 == 20) {
					this.anInt5221 = arg1.method8326();
					if (this.anInt5221 == 65535) {
						this.anInt5221 = -1;
					}
					this.anInt5229 = arg1.method8326();
					if (this.anInt5229 == 65535) {
						this.anInt5229 = -1;
					}
					this.anInt5233 = arg1.method8381();
					this.anInt5232 = arg1.method8381();
				} else if (arg0 == 21) {
					this.anInt5245 = arg1.method8381();
				} else if (arg0 == 22) {
					this.anInt5243 = arg1.method8381();
				} else if (arg0 == 23) {
					this.anInt5230 = arg1.method8383();
					this.anInt5222 = arg1.method8383();
					this.anInt5242 = arg1.method8383();
				} else if (arg0 == 24) {
					this.anInt5216 = arg1.method8368();
					this.anInt5218 = arg1.method8368();
				} else if (arg0 == 249) {
					local70 = arg1.method8383();
					if (this.aClass99_39 == null) {
						local141 = Static231.method4407(local70);
						this.aClass99_39 = new Class99(local141);
					}
					for (local141 = 0; local141 < local70; local141++) {
						@Pc(364) boolean local364 = arg1.method8383() == 1;
						local171 = arg1.method8347();
						@Pc(377) Class2 local377;
						if (local364) {
							local377 = new Class2_Sub12(arg1.method8373());
						} else {
							local377 = new Class2_Sub43(arg1.method8381());
						}
						this.aClass99_39.method3059((long) local171, local377);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)I")
	public int method4498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass99_39 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub43 local21 = (Class2_Sub43) this.aClass99_39.method3056((long) arg1);
			return local21 == null ? arg0 : local21.anInt9046;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cea;I)V")
	public void method4499(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8383();
			if (local15 == 0) {
				return;
			}
			this.method4497(local15, arg0);
		}
	}
}
