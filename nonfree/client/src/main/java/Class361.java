import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class361 {

	@OriginalMember(owner = "client!uja", name = "s", descriptor = "I")
	public int anInt9785;

	@OriginalMember(owner = "client!uja", name = "f", descriptor = "I")
	public int anInt9787;

	@OriginalMember(owner = "client!uja", name = "D", descriptor = "I")
	private int anInt9788;

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "I")
	private int anInt9789;

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "Ljava/lang/String;")
	public String aString116;

	@OriginalMember(owner = "client!uja", name = "B", descriptor = "[I")
	public int[] anIntArray643;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "I")
	private int anInt9795;

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "I")
	public int anInt9803;

	@OriginalMember(owner = "client!uja", name = "Q", descriptor = "[I")
	public int[] anIntArray644;

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
	public int anInt9807;

	@OriginalMember(owner = "client!uja", name = "U", descriptor = "I")
	public int anInt9808;

	@OriginalMember(owner = "client!uja", name = "V", descriptor = "Lclient!dfa;")
	private Class74 aClass74_70;

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "I")
	private int anInt9809;

	@OriginalMember(owner = "client!uja", name = "J", descriptor = "I")
	public int anInt9810;

	@OriginalMember(owner = "client!uja", name = "y", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!uja", name = "N", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!uja", name = "S", descriptor = "I")
	public int anInt9817;

	@OriginalMember(owner = "client!uja", name = "h", descriptor = "Lclient!jha;")
	public Class190 aClass190_6;

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "I")
	public int anInt9786 = -1;

	@OriginalMember(owner = "client!uja", name = "A", descriptor = "I")
	private int anInt9792 = -1;

	@OriginalMember(owner = "client!uja", name = "F", descriptor = "I")
	private int anInt9793 = -1;

	@OriginalMember(owner = "client!uja", name = "Y", descriptor = "I")
	private int anInt9790 = -1;

	@OriginalMember(owner = "client!uja", name = "Z", descriptor = "I")
	public int anInt9797 = -1;

	@OriginalMember(owner = "client!uja", name = "C", descriptor = "I")
	public int anInt9805 = -1;

	@OriginalMember(owner = "client!uja", name = "w", descriptor = "I")
	private int anInt9801 = -1;

	@OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
	public int anInt9812 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "I")
	public int anInt9791 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uja", name = "W", descriptor = "Z")
	public boolean aBoolean723 = true;

	@OriginalMember(owner = "client!uja", name = "n", descriptor = "I")
	public int anInt9804 = -1;

	@OriginalMember(owner = "client!uja", name = "R", descriptor = "I")
	public int anInt9813 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "Z")
	public boolean aBoolean722 = true;

	@OriginalMember(owner = "client!uja", name = "v", descriptor = "I")
	private int anInt9802 = -1;

	@OriginalMember(owner = "client!uja", name = "I", descriptor = "I")
	public int anInt9814 = 0;

	@OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
	public int anInt9815 = -1;

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!uja", name = "P", descriptor = "Z")
	public boolean aBoolean724 = true;

	@OriginalMember(owner = "client!uja", name = "M", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!uja", name = "x", descriptor = "I")
	public int anInt9806 = -1;

	@OriginalMember(owner = "client!uja", name = "K", descriptor = "I")
	public int anInt9822 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uja", name = "o", descriptor = "I")
	public int anInt9818 = -1;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ha;I)Lclient!tb;")
	public Class49 method8528(@OriginalArg(0) Class75 arg0) {
		@Pc(20) Class49 local20 = (Class49) this.aClass190_6.aClass359_40.method8517((long) (arg0.anInt7475 << 29 | this.anInt9802 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass190_6.aClass223_67.method5285(this.anInt9802);
		@Pc(41) Class64 local41 = Static691.method1249(this.aClass190_6.aClass223_67, this.anInt9802, 0);
		if (local41 != null) {
			local20 = arg0.method6714(local41, true);
			this.aClass190_6.aClass359_40.method8515((long) (this.anInt9802 | 0x20000 | arg0.anInt7475 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!jc;)V")
	public void method8529(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method8532(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIB)I")
	public int method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass74_70 == null) {
			return arg0;
		} else {
			@Pc(17) Class6_Sub6 local17 = (Class6_Sub6) this.aClass74_70.method1401((long) arg1);
			return local17 == null ? arg0 : local17.anInt482;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BZLclient!ha;)Lclient!tb;")
	public Class49 method8531(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(12) int local12 = arg0 ? this.anInt9786 : this.anInt9805;
		@Pc(19) int local19 = local12 | arg1.anInt7475 << 29;
		@Pc(28) Class49 local28 = (Class49) this.aClass190_6.aClass359_40.method8517((long) local19);
		if (local28 != null) {
			return local28;
		} else if (this.aClass190_6.aClass223_67.method5285(local12)) {
			@Pc(50) Class64 local50 = Static691.method1249(this.aClass190_6.aClass223_67, local12, 0);
			if (local50 != null) {
				local28 = arg1.method6714(local50, true);
				this.aClass190_6.aClass359_40.method8515((long) local19, local28);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!jc;IB)V")
	private void method8532(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9805 = arg0.method3018();
		} else if (arg1 == 2) {
			this.anInt9786 = arg0.method3018();
		} else if (arg1 == 3) {
			this.aString117 = arg0.method3046();
		} else if (arg1 == 4) {
			this.anInt9803 = arg0.method2987();
		} else if (arg1 == 5) {
			this.anInt9804 = arg0.method2987();
		} else if (arg1 == 6) {
			this.anInt9814 = arg0.method3030();
		} else {
			@Pc(66) int local66;
			if (arg1 == 7) {
				local66 = arg0.method3030();
				if ((local66 & 0x2) == 2) {
					this.aBoolean721 = true;
				}
				if ((local66 & 0x1) == 0) {
					this.aBoolean723 = false;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean722 = arg0.method3030() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt9790 = arg0.method3018();
				if (this.anInt9790 == 65535) {
					this.anInt9790 = -1;
				}
				this.anInt9801 = arg0.method3018();
				if (this.anInt9801 == 65535) {
					this.anInt9801 = -1;
				}
				this.anInt9788 = arg0.method3015();
				this.anInt9795 = arg0.method3015();
				return;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray40[arg1 - 10] = arg0.method3046();
			} else {
				@Pc(185) int local185;
				@Pc(217) int local217;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean724 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString116 = arg0.method3046();
						return;
					}
					if (arg1 != 18) {
						if (arg1 == 19) {
							this.anInt9818 = arg0.method3018();
							return;
						}
						if (arg1 != 20) {
							if (arg1 == 21) {
								this.anInt9817 = arg0.method3015();
								return;
							}
							if (arg1 != 22) {
								if (arg1 == 23) {
									this.anInt9797 = arg0.method3030();
									this.anInt9806 = arg0.method3030();
									this.anInt9815 = arg0.method3030();
									return;
								}
								if (arg1 == 24) {
									this.anInt9807 = arg0.method2989();
									this.anInt9785 = arg0.method2989();
								} else if (arg1 == 249) {
									local66 = arg0.method3030();
									if (this.aClass74_70 == null) {
										local185 = Static314.method4970(local66);
										this.aClass74_70 = new Class74(local185);
									}
									for (local185 = 0; local185 < local66; local185++) {
										@Pc(390) boolean local390 = arg0.method3030() == 1;
										local217 = arg0.method2987();
										@Pc(403) Class6 local403;
										if (local390) {
											local403 = new Class6_Sub43(arg0.method3046());
										} else {
											local403 = new Class6_Sub6(arg0.method3015());
										}
										this.aClass74_70.method1399(local403, (long) local217);
									}
									return;
								}
								return;
							}
							this.anInt9808 = arg0.method3015();
							return;
						}
						this.anInt9792 = arg0.method3018();
						if (this.anInt9792 == 65535) {
							this.anInt9792 = -1;
						}
						this.anInt9793 = arg0.method3018();
						if (this.anInt9793 == 65535) {
							this.anInt9793 = -1;
						}
						this.anInt9789 = arg0.method3015();
						this.anInt9809 = arg0.method3015();
						return;
					}
					this.anInt9802 = arg0.method3018();
					return;
				}
				local66 = arg0.method3030();
				this.anIntArray644 = new int[local66 * 2];
				for (local185 = 0; local185 < local66 * 2; local185++) {
					this.anIntArray644[local185] = arg0.method2989();
				}
				this.anInt9810 = arg0.method3015();
				@Pc(211) int local211 = arg0.method3030();
				this.anIntArray643 = new int[local211];
				for (local217 = 0; local217 < this.anIntArray643.length; local217++) {
					this.anIntArray643[local217] = arg0.method3015();
				}
				this.aByteArray105 = new byte[local66];
				for (@Pc(242) int local242 = 0; local242 < local66; local242++) {
					this.aByteArray105[local242] = arg0.method3027();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)V")
	public void method8533() {
		if (this.anIntArray644 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray644.length; local10 += 2) {
			if (this.anIntArray644[local10] < this.anInt9791) {
				this.anInt9791 = this.anIntArray644[local10];
			} else if (this.anIntArray644[local10] > this.anInt9812) {
				this.anInt9812 = this.anIntArray644[local10];
			}
			if (this.anIntArray644[local10 + 1] < this.anInt9822) {
				this.anInt9822 = this.anIntArray644[local10 + 1];
			} else if (this.anIntArray644[local10 + 1] > this.anInt9813) {
				this.anInt9813 = this.anIntArray644[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BLclient!cq;)Z")
	public boolean method8534(@OriginalArg(1) Interface10 arg0) {
		@Pc(36) int local36;
		if (this.anInt9801 == -1) {
			if (this.anInt9790 == -1) {
				return true;
			}
			local36 = arg0.method935(this.anInt9790);
		} else {
			local36 = arg0.method936(this.anInt9801);
		}
		if (this.anInt9788 > local36 || this.anInt9795 < local36) {
			return false;
		}
		@Pc(74) int local74;
		if (this.anInt9793 == -1) {
			if (this.anInt9792 == -1) {
				return true;
			}
			local74 = arg0.method935(this.anInt9792);
		} else {
			local74 = arg0.method936(this.anInt9793);
		}
		return local74 >= this.anInt9789 && local74 <= this.anInt9809;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method8536(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass74_70 == null) {
			return arg1;
		} else {
			@Pc(23) Class6_Sub43 local23 = (Class6_Sub43) this.aClass74_70.method1401((long) arg0);
			return local23 == null ? arg1 : local23.aString89;
		}
	}
}
