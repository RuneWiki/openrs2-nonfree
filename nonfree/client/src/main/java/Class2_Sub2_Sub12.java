import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lclient!ob;")
	private Class70 aClass70_7;

	@OriginalMember(owner = "client!lf", name = "kb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!lf", name = "Bb", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public int anInt2662 = -1;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "S")
	public short aShort42 = 0;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	public int anInt2670 = 32;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	private int anInt2657 = 0;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	public int anInt2655 = -1;

	@OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
	private int anInt2671 = 128;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public int anInt2665 = -1;

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
	private int anInt2674 = 128;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	public int anInt2661 = -1;

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
	public int anInt2672 = -1;

	@OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
	public int anInt2676 = 1;

	@OriginalMember(owner = "client!lf", name = "gb", descriptor = "Lclient!i;")
	public Class41 aClass41_773 = Static3.aClass41_23;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	public int anInt2659 = -1;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
	private int anInt2678 = -1;

	@OriginalMember(owner = "client!lf", name = "wb", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "[Lclient!i;")
	public Class41[] aClass41Array36 = new Class41[5];

	@OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
	private int anInt2680 = 0;

	@OriginalMember(owner = "client!lf", name = "pb", descriptor = "S")
	public short aShort43 = 0;

	@OriginalMember(owner = "client!lf", name = "yb", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!lf", name = "tb", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	public int anInt2669 = -1;

	@OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
	public int anInt2681 = -1;

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
	private int anInt2683 = -1;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	public int anInt2677 = -1;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Z")
	public boolean method1892() {
		if (this.anIntArray294 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2678 != -1) {
			local10 = Static127.method2070(this.anInt2678);
		} else if (this.anInt2683 != -1) {
			local10 = Static99.anIntArray243[this.anInt2683];
		}
		if (local10 < 0 || local10 >= this.anIntArray294.length - 1 || this.anIntArray294[local10] == -1) {
			@Pc(63) int local63 = this.anIntArray294[this.anIntArray294.length - 1];
			return local63 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method1893(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method209();
			if (local5 == 0) {
				return;
			}
			this.method1897(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
	public int method1894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass70_7 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub23 local21 = (Class2_Sub23) this.aClass70_7.method2205((long) arg1);
			return local21 == null ? arg0 : local21.anInt3983;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZLclient!ea;)V")
	private void method1897(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local10 = arg1.method209();
			this.anIntArray295 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray295[local16] = arg1.method163();
			}
		} else if (arg0 == 2) {
			this.aClass41_773 = arg1.method160();
		} else if (arg0 == 12) {
			this.anInt2676 = arg1.method209();
		} else if (arg0 == 13) {
			this.anInt2661 = arg1.method163();
		} else if (arg0 == 14) {
			this.anInt2659 = arg1.method163();
		} else if (arg0 == 15) {
			this.anInt2655 = arg1.method163();
		} else if (arg0 == 16) {
			this.anInt2681 = arg1.method163();
		} else if (arg0 == 17) {
			this.anInt2659 = arg1.method163();
			this.anInt2672 = arg1.method163();
			this.anInt2677 = arg1.method163();
			this.anInt2669 = arg1.method163();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass41Array36[arg0 - 30] = arg1.method160();
			if (this.aClass41Array36[arg0 - 30].method1413(Static170.aClass41_1051)) {
				this.aClass41Array36[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method209();
			this.aShortArray78 = new short[local10];
			this.aShortArray79 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray79[local16] = (short) arg1.method163();
				this.aShortArray78[local16] = (short) arg1.method163();
			}
		} else if (arg0 == 41) {
			local10 = arg1.method209();
			this.aShortArray80 = new short[local10];
			this.aShortArray81 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray81[local16] = (short) arg1.method163();
				this.aShortArray80[local16] = (short) arg1.method163();
			}
		} else if (arg0 == 42) {
			local10 = arg1.method209();
			this.aByteArray40 = new byte[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aByteArray40[local16] = arg1.method186();
			}
		} else if (arg0 == 60) {
			local10 = arg1.method209();
			this.anIntArray296 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray296[local16] = arg1.method163();
			}
		} else if (arg0 == 93) {
			this.aBoolean143 = false;
		} else if (arg0 == 95) {
			this.anInt2665 = arg1.method163();
		} else if (arg0 == 97) {
			this.anInt2671 = arg1.method163();
		} else if (arg0 == 98) {
			this.anInt2674 = arg1.method163();
		} else if (arg0 == 99) {
			this.aBoolean145 = true;
		} else if (arg0 == 100) {
			this.anInt2680 = arg1.method186();
		} else if (arg0 == 101) {
			this.anInt2657 = arg1.method186() * 5;
		} else if (arg0 == 102) {
			this.anInt2662 = arg1.method163();
		} else if (arg0 == 103) {
			this.anInt2670 = arg1.method163();
		} else if (arg0 == 106 || arg0 == 118) {
			local10 = -1;
			this.anInt2678 = arg1.method163();
			if (this.anInt2678 == 65535) {
				this.anInt2678 = -1;
			}
			this.anInt2683 = arg1.method163();
			if (this.anInt2683 == 65535) {
				this.anInt2683 = -1;
			}
			if (arg0 == 118) {
				local10 = arg1.method163();
				if (local10 == 65535) {
					local10 = -1;
				}
			}
			local16 = arg1.method209();
			this.anIntArray294 = new int[local16 + 2];
			for (@Pc(456) int local456 = 0; local456 <= local16; local456++) {
				this.anIntArray294[local456] = arg1.method163();
				if (this.anIntArray294[local456] == 65535) {
					this.anIntArray294[local456] = -1;
				}
			}
			this.anIntArray294[local16 + 1] = local10;
		} else if (arg0 == 107) {
			this.aBoolean144 = false;
		} else if (arg0 == 109) {
			this.aBoolean142 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.method163();
				arg1.method163();
			} else if (arg0 == 114) {
				arg1.method186();
				arg1.method186();
			} else if (arg0 == 115) {
				this.aShort43 = (short) (arg1.method209() * 4);
				this.aShort42 = (short) (arg1.method209() * 4);
			} else if (arg0 == 119) {
				arg1.method186();
			} else if (arg0 == 249) {
				local10 = arg1.method209();
				if (this.aClass70_7 == null) {
					local16 = Static163.method2657(local10);
					this.aClass70_7 = new Class70(local16);
				}
				for (local16 = 0; local16 < local10; local16++) {
					@Pc(332) boolean local332 = arg1.method209() == 1;
					@Pc(336) int local336 = arg1.method166();
					@Pc(345) Class2 local345;
					if (local332) {
						local345 = new Class2_Sub26(arg1.method160());
					} else {
						local345 = new Class2_Sub23(arg1.method185());
					}
					this.aClass70_7.method2208((long) local336, local345);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public void method1898() {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!i;)Lclient!i;")
	public Class41 method1900(@OriginalArg(0) int arg0, @OriginalArg(2) Class41 arg1) {
		if (this.aClass70_7 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub26 local24 = (Class2_Sub26) this.aClass70_7.method2205((long) arg0);
			return local24 == null ? arg1 : local24.aClass41_1152;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Lclient!lf;")
	public Class2_Sub2_Sub12 method1902() {
		@Pc(5) int local5 = -1;
		if (this.anInt2678 != -1) {
			local5 = Static127.method2070(this.anInt2678);
		} else if (this.anInt2683 != -1) {
			local5 = Static99.anIntArray243[this.anInt2683];
		}
		if (local5 < 0 || this.anIntArray294.length - 1 <= local5 || this.anIntArray294[local5] == -1) {
			@Pc(60) int local60 = this.anIntArray294[this.anIntArray294.length - 1];
			return local60 == -1 ? null : Static132.method2097(local60);
		} else {
			return Static132.method2097(this.anIntArray294[local5]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!k;)Lclient!cg;")
	public Class12_Sub2 method1904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub9 arg1) {
		if (this.anIntArray294 != null) {
			@Pc(12) Class2_Sub2_Sub12 local12 = this.method1902();
			return local12 == null ? null : local12.method1904(arg0, arg1);
		} else if (this.anIntArray296 == null) {
			return null;
		} else {
			@Pc(37) Class12_Sub2 local37 = (Class12_Sub2) Static126.aClass16_7.method437((long) this.anInt2653);
			if (local37 == null) {
				@Pc(45) boolean local45 = false;
				for (@Pc(47) int local47 = 0; local47 < this.anIntArray296.length; local47++) {
					if (!Static152.aClass15_32.method409(this.anIntArray296[local47], 0)) {
						local45 = true;
					}
				}
				if (local45) {
					return null;
				}
				@Pc(79) Class12_Sub6[] local79 = new Class12_Sub6[this.anIntArray296.length];
				for (@Pc(81) int local81 = 0; local81 < this.anIntArray296.length; local81++) {
					local79[local81] = Static72.method1336(Static152.aClass15_32, this.anIntArray296[local81]);
				}
				@Pc(111) Class12_Sub6 local111;
				if (local79.length == 1) {
					local111 = local79[0];
				} else {
					local111 = new Class12_Sub6(local79, local79.length);
				}
				@Pc(125) int local125;
				if (this.aShortArray79 != null) {
					for (local125 = 0; local125 < this.aShortArray79.length; local125++) {
						if (this.aByteArray40 == null || this.aByteArray40.length <= local125) {
							local111.method1332(this.aShortArray79[local125], this.aShortArray78[local125]);
						} else {
							local111.method1332(this.aShortArray79[local125], Static6.aShortArray9[this.aByteArray40[local125] & 0xFF]);
						}
					}
				}
				if (this.aShortArray81 != null) {
					for (local125 = 0; local125 < this.aShortArray81.length; local125++) {
						local111.method1322(this.aShortArray81[local125], this.aShortArray80[local125]);
					}
				}
				local37 = local111.method1315(64, 768, -50, -10, -50);
				Static126.aClass16_7.method432((long) this.anInt2653, local37);
			}
			if (arg1 != null) {
				local37 = arg1.method1669(arg0, local37);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!k;IILclient!k;)Lclient!cg;")
	public Class12_Sub2 method1905(@OriginalArg(1) Class2_Sub2_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub9 arg3) {
		if (this.anIntArray294 != null) {
			@Pc(12) Class2_Sub2_Sub12 local12 = this.method1902();
			return local12 == null ? null : local12.method1905(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class12_Sub2 local32 = (Class12_Sub2) Static93.aClass16_5.method437((long) this.anInt2653);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray295.length; local38++) {
				if (!Static152.aClass15_32.method409(this.anIntArray295[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class12_Sub6[] local66 = new Class12_Sub6[this.anIntArray295.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray295.length; local68++) {
				local66[local68] = Static72.method1336(Static152.aClass15_32, this.anIntArray295[local68]);
			}
			@Pc(100) Class12_Sub6 local100;
			if (local66.length == 1) {
				local100 = local66[0];
			} else {
				local100 = new Class12_Sub6(local66, local66.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray79 != null) {
				for (local114 = 0; local114 < this.aShortArray79.length; local114++) {
					if (this.aByteArray40 == null || local114 >= this.aByteArray40.length) {
						local100.method1332(this.aShortArray79[local114], this.aShortArray78[local114]);
					} else {
						local100.method1332(this.aShortArray79[local114], Static6.aShortArray9[this.aByteArray40[local114] & 0xFF]);
					}
				}
			}
			if (this.aShortArray81 != null) {
				for (local114 = 0; local114 < this.aShortArray81.length; local114++) {
					local100.method1322(this.aShortArray81[local114], this.aShortArray80[local114]);
				}
			}
			local32 = local100.method1315(this.anInt2680 + 64, 850 - -this.anInt2657, -30, -50, -30);
			Static93.aClass16_5.method432((long) this.anInt2653, local32);
		}
		@Pc(227) Class12_Sub2 local227;
		if (arg3 != null && arg0 != null) {
			local227 = arg3.method1665(arg2, arg0, arg1, local32);
		} else if (arg3 != null) {
			local227 = arg3.method1661(arg2, local32);
		} else if (arg0 == null) {
			local227 = local32.method1853(true, true);
		} else {
			local227 = arg0.method1661(arg1, local32);
		}
		if (this.anInt2671 != 128 || this.anInt2674 != 128) {
			local227.method1852(this.anInt2671, this.anInt2674, this.anInt2671);
		}
		return local227;
	}
}
