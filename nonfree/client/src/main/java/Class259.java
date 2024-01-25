import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class259 {

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
	public int anInt6650;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	public int anInt6655;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "Ljava/lang/String;")
	public String aString79;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
	private int anInt6656;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!dd;")
	public Class59 aClass59_3;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Ljava/lang/String;")
	public String aString80;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	public int anInt6659;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	public int anInt6662;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public int anInt6664;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public int anInt6665;

	@OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
	private int anInt6671;

	@OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
	public int anInt6673;

	@OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
	private int anInt6679;

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!oaa", name = "S", descriptor = "I")
	private int anInt6681;

	@OriginalMember(owner = "client!oaa", name = "Y", descriptor = "Lclient!dj;")
	private Class66 aClass66_30;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public int anInt6658 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Z")
	public boolean aBoolean513 = true;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
	public int anInt6657 = -1;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
	public int anInt6652 = -1;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	public int anInt6666 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
	public int anInt6660 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray31 = new String[5];

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "Z")
	public boolean aBoolean514 = true;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	private int anInt6651 = -1;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
	public int anInt6670 = -1;

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
	public int anInt6678 = -1;

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
	public int anInt6676 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "Z")
	public boolean aBoolean515 = false;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
	private int anInt6667 = -1;

	@OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
	public int anInt6668 = -1;

	@OriginalMember(owner = "client!oaa", name = "P", descriptor = "Z")
	public boolean aBoolean516 = true;

	@OriginalMember(owner = "client!oaa", name = "X", descriptor = "I")
	public int anInt6685 = 0;

	@OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
	private int anInt6675 = -1;

	@OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
	private int anInt6684 = -1;

	@OriginalMember(owner = "client!oaa", name = "T", descriptor = "I")
	public int anInt6682 = -1;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
	public int anInt6680 = -1;

	@OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
	private int anInt6672 = -1;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ha;ZB)Lclient!tf;")
	public Class17 method5862(@OriginalArg(0) Class33 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(16) int local16 = arg1 ? this.anInt6682 : this.anInt6678;
		@Pc(23) int local23 = arg0.anInt9458 << 29 | local16;
		@Pc(32) Class17 local32 = (Class17) this.aClass59_3.aClass352_13.method7653((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass59_3.aClass34_19.method1235(local16)) {
			@Pc(52) Class51 local52 = Static682.method1662(this.aClass59_3.aClass34_19, local16, 0);
			if (local52 != null) {
				local32 = arg0.method8147(local52, true);
				this.aClass59_3.aClass352_13.method7655((long) local23, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLclient!bh;)Z")
	public boolean method5863(@OriginalArg(1) Interface4 arg0) {
		@Pc(30) int local30;
		if (this.anInt6675 == -1) {
			if (this.anInt6684 == -1) {
				return true;
			}
			local30 = arg0.method6529(this.anInt6684);
		} else {
			local30 = arg0.method6530(this.anInt6675);
		}
		if (local30 < this.anInt6656 || this.anInt6681 < local30) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt6651 == -1) {
			if (this.anInt6667 == -1) {
				return true;
			}
			local68 = arg0.method6529(this.anInt6667);
		} else {
			local68 = arg0.method6530(this.anInt6651);
		}
		return local68 >= this.anInt6679 && local68 <= this.anInt6671;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!es;)V")
	public void method5865(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method5867(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ha;I)Lclient!tf;")
	public Class17 method5866(@OriginalArg(0) Class33 arg0) {
		@Pc(22) Class17 local22 = (Class17) this.aClass59_3.aClass352_13.method7653((long) (arg0.anInt9458 << 29 | 0x20000 | this.anInt6672));
		if (local22 != null) {
			return local22;
		}
		this.aClass59_3.aClass34_19.method1235(this.anInt6672);
		@Pc(42) Class51 local42 = Static682.method1662(this.aClass59_3.aClass34_19, this.anInt6672, 0);
		if (local42 != null) {
			local22 = arg0.method8147(local42, true);
			this.aClass59_3.aClass352_13.method7655((long) (this.anInt6672 | 0x20000 | arg0.anInt9458 << 29), local22);
		}
		return local22;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!es;II)V")
	private void method5867(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6678 = arg0.method8859();
		} else if (arg1 == 2) {
			this.anInt6682 = arg0.method8859();
		} else if (arg1 == 3) {
			this.aString80 = arg0.method8853();
		} else if (arg1 == 4) {
			this.anInt6662 = arg0.method8827();
		} else if (arg1 == 5) {
			this.anInt6657 = arg0.method8827();
		} else if (arg1 == 6) {
			this.anInt6685 = arg0.method8865();
		} else {
			@Pc(68) int local68;
			if (arg1 == 7) {
				local68 = arg0.method8865();
				if ((local68 & 0x2) == 2) {
					this.aBoolean515 = true;
				}
				if ((local68 & 0x1) == 0) {
					this.aBoolean514 = false;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean516 = arg0.method8865() == 1;
			} else if (arg1 == 9) {
				this.anInt6684 = arg0.method8859();
				if (this.anInt6684 == 65535) {
					this.anInt6684 = -1;
				}
				this.anInt6675 = arg0.method8859();
				if (this.anInt6675 == 65535) {
					this.anInt6675 = -1;
				}
				this.anInt6656 = arg0.method8850();
				this.anInt6681 = arg0.method8850();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(162) int local162;
				@Pc(196) int local196;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean513 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString79 = arg0.method8853();
						return;
					}
					if (arg1 == 18) {
						this.anInt6672 = arg0.method8859();
						return;
					}
					if (arg1 != 19) {
						if (arg1 != 20) {
							if (arg1 == 21) {
								this.anInt6664 = arg0.method8850();
								return;
							}
							if (arg1 != 22) {
								if (arg1 == 23) {
									this.anInt6668 = arg0.method8865();
									this.anInt6652 = arg0.method8865();
									this.anInt6680 = arg0.method8865();
								} else if (arg1 == 24) {
									this.anInt6665 = arg0.method8834();
									this.anInt6673 = arg0.method8834();
									return;
								} else if (arg1 == 249) {
									local68 = arg0.method8865();
									if (this.aClass66_30 == null) {
										local162 = Static162.method2593(local68);
										this.aClass66_30 = new Class66(local162);
									}
									for (local162 = 0; local162 < local68; local162++) {
										@Pc(334) boolean local334 = arg0.method8865() == 1;
										local196 = arg0.method8827();
										@Pc(347) Class4 local347;
										if (local334) {
											local347 = new Class4_Sub46(arg0.method8853());
										} else {
											local347 = new Class4_Sub24(arg0.method8850());
										}
										this.aClass66_30.method1985(local347, (long) local196);
									}
									return;
								}
								return;
							}
							this.anInt6655 = arg0.method8850();
							return;
						}
						this.anInt6667 = arg0.method8859();
						if (this.anInt6667 == 65535) {
							this.anInt6667 = -1;
						}
						this.anInt6651 = arg0.method8859();
						if (this.anInt6651 == 65535) {
							this.anInt6651 = -1;
						}
						this.anInt6679 = arg0.method8850();
						this.anInt6671 = arg0.method8850();
						return;
					}
					this.anInt6670 = arg0.method8859();
					return;
				}
				local68 = arg0.method8865();
				this.anIntArray462 = new int[local68 * 2];
				for (local162 = 0; local162 < local68 * 2; local162++) {
					this.anIntArray462[local162] = arg0.method8834();
				}
				this.anInt6650 = arg0.method8850();
				@Pc(190) int local190 = arg0.method8865();
				this.anIntArray461 = new int[local190];
				for (local196 = 0; local196 < this.anIntArray461.length; local196++) {
					this.anIntArray461[local196] = arg0.method8850();
				}
				this.aByteArray61 = new byte[local68];
				for (@Pc(217) int local217 = 0; local217 < local68; local217++) {
					this.aByteArray61[local217] = arg0.method8861();
				}
				return;
			} else {
				this.aStringArray31[arg1 - 10] = arg0.method8853();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIB)I")
	public int method5871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass66_30 == null) {
			return arg1;
		} else {
			@Pc(22) Class4_Sub24 local22 = (Class4_Sub24) this.aClass66_30.method1994((long) arg0);
			return local22 == null ? arg1 : local22.anInt4156;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method5872(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass66_30 == null) {
			return arg0;
		} else {
			@Pc(21) Class4_Sub46 local21 = (Class4_Sub46) this.aClass66_30.method1994((long) arg1);
			return local21 == null ? arg0 : local21.aString110;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	public void method5873() {
		if (this.anIntArray462 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray462.length; local6 += 2) {
			if (this.anInt6666 > this.anIntArray462[local6]) {
				this.anInt6666 = this.anIntArray462[local6];
			} else if (this.anIntArray462[local6] > this.anInt6658) {
				this.anInt6658 = this.anIntArray462[local6];
			}
			if (this.anInt6660 > this.anIntArray462[local6 + 1]) {
				this.anInt6660 = this.anIntArray462[local6 + 1];
			} else if (this.anInt6676 < this.anIntArray462[local6 + 1]) {
				this.anInt6676 = this.anIntArray462[local6 + 1];
			}
		}
	}
}
