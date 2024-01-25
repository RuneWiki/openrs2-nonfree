import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class308 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	private int anInt8771;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/String;")
	public String aString103;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public int anInt8774;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public int anInt8777;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "Lclient!b;")
	public Class27 aClass27_4;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
	private int anInt8781;

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "Lclient!ee;")
	private Class83 aClass83_36;

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
	public int anInt8791;

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
	private int anInt8794;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
	public int anInt8797;

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	public int anInt8802;

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
	public int anInt8803;

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "[I")
	public int[] anIntArray748;

	@OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
	private int anInt8806;

	@OriginalMember(owner = "client!rs", name = "W", descriptor = "I")
	public int anInt8807;

	@OriginalMember(owner = "client!rs", name = "Y", descriptor = "[I")
	public int[] anIntArray749;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	public int anInt8780 = -1;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public int anInt8782 = -1;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Z")
	public boolean aBoolean683 = false;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
	private int anInt8787 = -1;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
	private int anInt8778 = -1;

	@OriginalMember(owner = "client!rs", name = "H", descriptor = "Z")
	public boolean aBoolean686 = true;

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray24 = new String[5];

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
	public int anInt8785 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
	private int anInt8799 = -1;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
	private int anInt8788 = -1;

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
	public int anInt8783 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
	public int anInt8792 = -1;

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
	public int anInt8796 = -1;

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "I")
	public int anInt8804 = -1;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
	private int anInt8784 = -1;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	public int anInt8776 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
	public int anInt8801 = -1;

	@OriginalMember(owner = "client!rs", name = "U", descriptor = "I")
	public int anInt8805 = 0;

	@OriginalMember(owner = "client!rs", name = "X", descriptor = "I")
	public int anInt8808 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
	public int anInt8800 = -1;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method7685(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass83_36 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub49 local24 = (Class3_Sub49) this.aClass83_36.method2368((long) arg0);
			return local24 == null ? arg1 : local24.aString100;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method7686(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8801 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt8792 = arg0.method8593();
		} else if (arg1 == 3) {
			this.aString103 = arg0.method8613();
		} else if (arg1 == 4) {
			this.anInt8802 = arg0.method8607();
		} else if (arg1 == 5) {
			this.anInt8800 = arg0.method8607();
		} else if (arg1 == 6) {
			this.anInt8805 = arg0.method8632();
		} else {
			@Pc(216) int local216;
			if (arg1 == 7) {
				local216 = arg0.method8632();
				if ((local216 & 0x2) == 2) {
					this.aBoolean683 = true;
				}
				if ((local216 & 0x1) == 0) {
					this.aBoolean685 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean684 = arg0.method8632() == 1;
			} else if (arg1 == 9) {
				this.anInt8788 = arg0.method8593();
				if (this.anInt8788 == 65535) {
					this.anInt8788 = -1;
				}
				this.anInt8799 = arg0.method8593();
				if (this.anInt8799 == 65535) {
					this.anInt8799 = -1;
				}
				this.anInt8794 = arg0.method8618();
				this.anInt8806 = arg0.method8618();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray24[arg1 - 10] = arg0.method8613();
			} else {
				@Pc(223) int local223;
				@Pc(250) int local250;
				if (arg1 == 15) {
					local216 = arg0.method8632();
					this.anIntArray748 = new int[local216 * 2];
					for (local223 = 0; local223 < local216 * 2; local223++) {
						this.anIntArray748[local223] = arg0.method8589();
					}
					this.anInt8791 = arg0.method8618();
					@Pc(399) int local399 = arg0.method8632();
					this.anIntArray749 = new int[local399];
					for (local250 = 0; local250 < this.anIntArray749.length; local250++) {
						this.anIntArray749[local250] = arg0.method8618();
					}
					this.aByteArray94 = new byte[local216];
					for (@Pc(428) int local428 = 0; local428 < local216; local428++) {
						this.aByteArray94[local428] = arg0.method8621();
					}
				} else if (arg1 == 16) {
					this.aBoolean686 = false;
				} else if (arg1 == 17) {
					this.aString104 = arg0.method8613();
				} else if (arg1 == 18) {
					this.anInt8784 = arg0.method8593();
				} else if (arg1 == 19) {
					this.anInt8782 = arg0.method8593();
				} else if (arg1 == 20) {
					this.anInt8787 = arg0.method8593();
					if (this.anInt8787 == 65535) {
						this.anInt8787 = -1;
					}
					this.anInt8778 = arg0.method8593();
					if (this.anInt8778 == 65535) {
						this.anInt8778 = -1;
					}
					this.anInt8781 = arg0.method8618();
					this.anInt8771 = arg0.method8618();
				} else if (arg1 == 21) {
					this.anInt8803 = arg0.method8618();
				} else if (arg1 == 22) {
					this.anInt8807 = arg0.method8618();
				} else if (arg1 == 23) {
					this.anInt8796 = arg0.method8632();
					this.anInt8780 = arg0.method8632();
					this.anInt8804 = arg0.method8632();
				} else if (arg1 == 24) {
					this.anInt8797 = arg0.method8589();
					this.anInt8774 = arg0.method8589();
				} else if (arg1 == 249) {
					local216 = arg0.method8632();
					if (this.aClass83_36 == null) {
						local223 = Static282.method4521(local216);
						this.aClass83_36 = new Class83(local223);
					}
					for (local223 = 0; local223 < local216; local223++) {
						@Pc(246) boolean local246 = arg0.method8632() == 1;
						local250 = arg0.method8607();
						@Pc(259) Class3 local259;
						if (local246) {
							local259 = new Class3_Sub49(arg0.method8613());
						} else {
							local259 = new Class3_Sub33(arg0.method8618());
						}
						this.aClass83_36.method2377((long) local250, local259);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public void method7687() {
		if (this.anIntArray748 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray748.length; local16 += 2) {
			if (this.anIntArray748[local16] < this.anInt8785) {
				this.anInt8785 = this.anIntArray748[local16];
			} else if (this.anInt8808 < this.anIntArray748[local16]) {
				this.anInt8808 = this.anIntArray748[local16];
			}
			if (this.anIntArray748[local16 + 1] < this.anInt8783) {
				this.anInt8783 = this.anIntArray748[local16 + 1];
			} else if (this.anIntArray748[local16 + 1] > this.anInt8776) {
				this.anInt8776 = this.anIntArray748[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public int method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass83_36 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub33 local16 = (Class3_Sub33) this.aClass83_36.method2368((long) arg1);
			return local16 == null ? arg0 : local16.anInt4831;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!ii;)Z")
	public boolean method7689(@OriginalArg(1) Interface16 arg0) {
		@Pc(22) int local22;
		if (this.anInt8799 == -1) {
			if (this.anInt8788 == -1) {
				return true;
			}
			local22 = arg0.method1629(this.anInt8788);
		} else {
			local22 = arg0.method1630(this.anInt8799);
		}
		if (local22 < this.anInt8794 || this.anInt8806 < local22) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt8778 == -1) {
			if (this.anInt8787 == -1) {
				return true;
			}
			local62 = arg0.method1629(this.anInt8787);
		} else {
			local62 = arg0.method1630(this.anInt8778);
		}
		return local62 >= this.anInt8781 && local62 <= this.anInt8771;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!jp;)V")
	public void method7690(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8632();
			if (local9 == 0) {
				return;
			}
			this.method7686(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZILclient!ha;)Lclient!vr;")
	public Class33 method7691(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt8792 : this.anInt8801;
		@Pc(18) int local18 = arg1.anInt9671 << 29 | local11;
		@Pc(27) Class33 local27 = (Class33) this.aClass27_4.aClass165_2.method4389((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass27_4.aClass15_8.method526(local11)) {
			@Pc(47) Class97 local47 = Static682.method2754(this.aClass27_4.aClass15_8, local11, 0);
			if (local47 != null) {
				local27 = arg1.method8465(local47, true);
				this.aClass27_4.aClass165_2.method4392(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!ha;B)Lclient!vr;")
	public Class33 method7692(@OriginalArg(0) Class13 arg0) {
		@Pc(20) Class33 local20 = (Class33) this.aClass27_4.aClass165_2.method4389((long) (this.anInt8784 | 0x20000 | arg0.anInt9671 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass27_4.aClass15_8.method526(this.anInt8784);
		@Pc(42) Class97 local42 = Static682.method2754(this.aClass27_4.aClass15_8, this.anInt8784, 0);
		if (local42 != null) {
			local20 = arg0.method8465(local42, true);
			this.aClass27_4.aClass165_2.method4392(local20, (long) (this.anInt8784 | 0x20000 | arg0.anInt9671 << 29));
		}
		return local20;
	}
}
