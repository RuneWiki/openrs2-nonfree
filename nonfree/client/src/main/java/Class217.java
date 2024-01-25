import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class217 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public int anInt6163;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public int anInt6164;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private int anInt6171;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public int anInt6172;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private int anInt6177;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
	private int anInt6184;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!hl;")
	private Class96 aClass96_32;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public int anInt6189;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	private int anInt6192;

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "Lclient!iw;")
	public Class116 aClass116_4;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	private int anInt6165 = -1;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public int anInt6168 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Z")
	public boolean aBoolean458 = false;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	private int anInt6176 = -1;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public int anInt6183 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
	private int anInt6178 = -1;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
	public boolean aBoolean459 = true;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
	public int anInt6185 = -1;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	public int anInt6182 = -1;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Z")
	public boolean aBoolean460 = true;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	public int anInt6181 = -1;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
	public int anInt6191 = -1;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "Z")
	public boolean aBoolean461 = true;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public int anInt6173 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	private int anInt6190 = -1;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
	public int anInt6197 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
	private int anInt6196 = -1;

	@OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
	public int anInt6195 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method5084(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass96_32 == null) {
			return arg1;
		} else {
			@Pc(21) Class4_Sub12 local21 = (Class4_Sub12) this.aClass96_32.method2797((long) arg0);
			return local21 == null ? arg1 : local21.aString12;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!wn;B)V")
	public void method5085(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4614();
			if (local9 == 0) {
				return;
			}
			this.method5090(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method5086() {
		if (this.anIntArray499 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray499.length; local6 += 2) {
			if (this.anInt6168 > this.anIntArray499[local6]) {
				this.anInt6168 = this.anIntArray499[local6];
			} else if (this.anInt6183 < this.anIntArray499[local6]) {
				this.anInt6183 = this.anIntArray499[local6];
			}
			if (this.anInt6173 > this.anIntArray499[local6 + 1]) {
				this.anInt6173 = this.anIntArray499[local6 + 1];
			} else if (this.anInt6197 < this.anIntArray499[local6 + 1]) {
				this.anInt6197 = this.anIntArray499[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!jc;B)Z")
	public boolean method5087(@OriginalArg(0) Interface2 arg0) {
		@Pc(32) int local32;
		if (this.anInt6176 == -1) {
			if (this.anInt6178 == -1) {
				return true;
			}
			local32 = arg0.method5154(this.anInt6178);
		} else {
			local32 = arg0.method5153(this.anInt6176);
		}
		if (local32 < this.anInt6177 || local32 > this.anInt6192) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt6165 == -1) {
			if (this.anInt6190 == -1) {
				return true;
			}
			local62 = arg0.method5154(this.anInt6190);
		} else {
			local62 = arg0.method5153(this.anInt6165);
		}
		return this.anInt6171 <= local62 && local62 <= this.anInt6184;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
	public int method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass96_32 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub16 local16 = (Class4_Sub16) this.aClass96_32.method2797((long) arg1);
			return local16 == null ? arg0 : local16.anInt2197;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!wn;)V")
	private void method5090(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt6181 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt6185 = arg1.method4560();
		} else if (arg0 == 3) {
			this.aString53 = arg1.method4624();
		} else if (arg0 == 4) {
			this.anInt6188 = arg1.method4582();
		} else if (arg0 == 5) {
			this.anInt6191 = arg1.method4582();
			return;
		} else if (arg0 == 6) {
			this.anInt6195 = arg1.method4614();
			return;
		} else {
			@Pc(106) int local106;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean459 = arg1.method4614() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt6178 = arg1.method4560();
					if (this.anInt6178 == 65535) {
						this.anInt6178 = -1;
					}
					this.anInt6176 = arg1.method4560();
					if (this.anInt6176 == 65535) {
						this.anInt6176 = -1;
					}
					this.anInt6177 = arg1.method4595();
					this.anInt6192 = arg1.method4595();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray32[arg0 - 10] = arg1.method4624();
					return;
				}
				@Pc(114) int local114;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean461 = false;
						return;
					}
					if (arg0 == 17) {
						this.aString54 = arg1.method4624();
						return;
					}
					if (arg0 == 18) {
						this.anInt6196 = arg1.method4560();
						return;
					}
					if (arg0 != 19) {
						if (arg0 != 20) {
							if (arg0 != 21) {
								if (arg0 == 22) {
									this.anInt6164 = arg1.method4595();
								} else if (arg0 == 249) {
									local106 = arg1.method4614();
									if (this.aClass96_32 == null) {
										local114 = Static84.method6309(local106);
										this.aClass96_32 = new Class96(local114);
									}
									for (local114 = 0; local114 < local106; local114++) {
										@Pc(224) boolean local224 = arg1.method4614() == 1;
										@Pc(228) int local228 = arg1.method4582();
										@Pc(237) Class4 local237;
										if (local224) {
											local237 = new Class4_Sub12(arg1.method4624());
										} else {
											local237 = new Class4_Sub16(arg1.method4595());
										}
										this.aClass96_32.method2805((long) local228, local237);
									}
									return;
								}
								return;
							}
							this.anInt6167 = arg1.method4595();
							return;
						}
						this.anInt6190 = arg1.method4560();
						if (this.anInt6190 == 65535) {
							this.anInt6190 = -1;
						}
						this.anInt6165 = arg1.method4560();
						if (this.anInt6165 == 65535) {
							this.anInt6165 = -1;
						}
						this.anInt6171 = arg1.method4595();
						this.anInt6184 = arg1.method4595();
						return;
					}
					this.anInt6182 = arg1.method4560();
					return;
				}
				local106 = arg1.method4614();
				this.anIntArray499 = new int[local106 * 2];
				for (local114 = 0; local114 < local106 * 2; local114++) {
					this.anIntArray499[local114] = arg1.method4586();
				}
				this.anInt6163 = arg1.method4595();
				this.anInt6189 = arg1.method4595();
				return;
			}
			local106 = arg1.method4614();
			if ((local106 & 0x1) == 0) {
				this.aBoolean460 = false;
			}
			if ((local106 & 0x2) == 2) {
				this.aBoolean458 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;BZ)Lclient!aa;")
	public Class2 method5091(@OriginalArg(0) Class30 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) int local19 = arg1 ? this.anInt6185 : this.anInt6181;
		@Pc(26) int local26 = arg0.anInt2271 << 29 | local19;
		@Pc(35) Class2 local35 = (Class2) this.aClass116_4.aClass83_26.method2338((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass116_4.aClass38_35.method1037(local19)) {
			@Pc(55) Class98 local55 = Static472.method2850(this.aClass116_4.aClass38_35, local19, 0);
			if (local55 != null) {
				local35 = arg0.method2031(local55);
				this.aClass116_4.aClass83_26.method2337(local35, (long) local26);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;I)Lclient!aa;")
	public Class2 method5092(@OriginalArg(0) Class30 arg0) {
		@Pc(22) Class2 local22 = (Class2) this.aClass116_4.aClass83_26.method2338((long) (arg0.anInt2271 << 29 | 0x20000 | this.anInt6196));
		if (local22 != null) {
			return local22;
		}
		this.aClass116_4.aClass38_35.method1037(this.anInt6196);
		@Pc(42) Class98 local42 = Static472.method2850(this.aClass116_4.aClass38_35, this.anInt6196, 0);
		if (local42 != null) {
			local22 = arg0.method2031(local42);
			this.aClass116_4.aClass83_26.method2337(local22, (long) (this.anInt6196 | 0x20000 | arg0.anInt2271 << 29));
		}
		return local22;
	}
}
