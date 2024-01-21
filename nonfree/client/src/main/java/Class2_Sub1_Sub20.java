import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
	public int anInt3565;

	@OriginalMember(owner = "client!ra", name = "ub", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public int anInt3541 = -1;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "[Lclient!mb;")
	public final Class62[] aClass62Array108 = new Class62[5];

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	private int anInt3542 = 128;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "S")
	public short aShort11 = 0;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	public int anInt3544 = -1;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	private int anInt3549 = 0;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public int anInt3548 = -1;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	public int anInt3546 = -1;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	public int anInt3550 = -1;

	@OriginalMember(owner = "client!ra", name = "Y", descriptor = "Z")
	public boolean aBoolean153 = true;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "S")
	public short aShort12 = 0;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
	public int anInt3554 = 32;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public int anInt3560 = -1;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!mb;")
	public Class62 aClass62_1250 = Static115.aClass62_878;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	public int anInt3545 = -1;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
	public int anInt3543 = -1;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	private int anInt3557 = -1;

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
	private int anInt3563 = 0;

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
	public int anInt3564 = -1;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
	private int anInt3562 = 128;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
	public int anInt3558 = 1;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
	private int anInt3555 = -1;

	@OriginalMember(owner = "client!ra", name = "vb", descriptor = "Z")
	public boolean aBoolean154 = false;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z")
	public boolean method2444() {
		if (this.anIntArray304 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3555 != -1) {
			local10 = Static88.method1238(this.anInt3555);
		} else if (this.anInt3557 != -1) {
			local10 = Static71.anIntArray123[this.anInt3557];
		}
		return local10 >= 0 && local10 < this.anIntArray304.length && this.anIntArray304[local10] != -1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!wb;BILclient!wb;)Lclient!ug;")
	public Class7_Sub7 method2445(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub25 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub25 arg3) {
		if (this.anIntArray304 != null) {
			@Pc(12) Class2_Sub1_Sub20 local12 = this.method2451();
			return local12 == null ? null : local12.method2445(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class7_Sub7 local32 = (Class7_Sub7) Static162.aClass79_10.method2352((long) this.anInt3565);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray305.length; local38++) {
				if (!Static159.aClass71_32.method2143(0, this.anIntArray305[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class7_Sub3[] local70 = new Class7_Sub3[this.anIntArray305.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray305.length; local72++) {
				local70[local72] = Static70.method975(Static159.aClass71_32, this.anIntArray305[local72]);
			}
			@Pc(102) Class7_Sub3 local102;
			if (local70.length == 1) {
				local102 = local70[0];
			} else {
				local102 = new Class7_Sub3(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray125 != null) {
				for (local116 = 0; local116 < this.aShortArray125.length; local116++) {
					if (this.aByteArray37 == null || local116 >= this.aByteArray37.length) {
						local102.method974(this.aShortArray125[local116], this.aShortArray122[local116]);
					} else {
						local102.method974(this.aShortArray125[local116], Static131.aShortArray56[this.aByteArray37[local116] & 0xFF]);
					}
				}
			}
			if (this.aShortArray123 != null) {
				for (local116 = 0; local116 < this.aShortArray123.length; local116++) {
					local102.method963(this.aShortArray123[local116], this.aShortArray124[local116]);
				}
			}
			local32 = local102.method979(this.anInt3563 + 64, 850 - -this.anInt3549, -30, -50, -30);
			Static162.aClass79_10.method2349((long) this.anInt3565, local32);
		}
		@Pc(223) Class7_Sub7 local223;
		if (arg1 != null && arg3 != null) {
			local223 = arg1.method3050(arg2, local32, arg3, arg0);
		} else if (arg1 != null) {
			local223 = arg1.method3048(local32, arg2);
		} else if (arg3 == null) {
			local223 = local32.method3156(true);
		} else {
			local223 = arg3.method3048(local32, arg0);
		}
		if (this.anInt3562 != 128 || this.anInt3542 != 128) {
			local223.method3161(this.anInt3562, this.anInt3542, this.anInt3562);
		}
		return local223;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!wb;)Lclient!ug;")
	public Class7_Sub7 method2448(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub25 arg1) {
		if (this.anIntArray304 != null) {
			@Pc(12) Class2_Sub1_Sub20 local12 = this.method2451();
			return local12 == null ? null : local12.method2448(arg0, arg1);
		} else if (this.anIntArray306 == null) {
			return null;
		} else {
			@Pc(41) Class7_Sub7 local41 = (Class7_Sub7) Static84.aClass79_11.method2352((long) this.anInt3565);
			if (local41 == null) {
				@Pc(45) boolean local45 = false;
				for (@Pc(47) int local47 = 0; local47 < this.anIntArray306.length; local47++) {
					if (!Static159.aClass71_32.method2143(0, this.anIntArray306[local47])) {
						local45 = true;
					}
				}
				if (local45) {
					return null;
				}
				@Pc(79) Class7_Sub3[] local79 = new Class7_Sub3[this.anIntArray306.length];
				for (@Pc(81) int local81 = 0; local81 < this.anIntArray306.length; local81++) {
					local79[local81] = Static70.method975(Static159.aClass71_32, this.anIntArray306[local81]);
				}
				@Pc(109) Class7_Sub3 local109;
				if (local79.length == 1) {
					local109 = local79[0];
				} else {
					local109 = new Class7_Sub3(local79, local79.length);
				}
				@Pc(123) int local123;
				if (this.aShortArray125 != null) {
					for (local123 = 0; local123 < this.aShortArray125.length; local123++) {
						if (this.aByteArray37 == null || this.aByteArray37.length <= local123) {
							local109.method974(this.aShortArray125[local123], this.aShortArray122[local123]);
						} else {
							local109.method974(this.aShortArray125[local123], Static131.aShortArray56[this.aByteArray37[local123] & 0xFF]);
						}
					}
				}
				if (this.aShortArray123 != null) {
					for (local123 = 0; local123 < this.aShortArray123.length; local123++) {
						local109.method963(this.aShortArray123[local123], this.aShortArray124[local123]);
					}
				}
				local41 = local109.method979(64, 768, -50, -10, -50);
				Static84.aClass79_11.method2349((long) this.anInt3565, local41);
			}
			if (arg1 != null) {
				local41 = arg1.method3057(local41, arg0);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public void method2449() {
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)Lclient!ra;")
	public Class2_Sub1_Sub20 method2451() {
		@Pc(5) int local5 = -1;
		if (this.anInt3555 != -1) {
			local5 = Static88.method1238(this.anInt3555);
		} else if (this.anInt3557 != -1) {
			local5 = Static71.anIntArray123[this.anInt3557];
		}
		return local5 < 0 || this.anIntArray304.length <= local5 || this.anIntArray304[local5] == -1 ? null : Static170.method2500(this.anIntArray304[local5]);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method2452(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(112) int local112;
		@Pc(122) int local122;
		if (arg1 == 1) {
			local112 = arg0.method1534();
			this.anIntArray305 = new int[local112];
			for (local122 = 0; local122 < local112; local122++) {
				this.anIntArray305[local122] = arg0.method1557();
			}
		} else if (arg1 == 2) {
			this.aClass62_1250 = arg0.method1538();
		} else if (arg1 == 12) {
			this.anInt3558 = arg0.method1534();
		} else if (arg1 == 13) {
			this.anInt3544 = arg0.method1557();
		} else if (arg1 == 14) {
			this.anInt3545 = arg0.method1557();
		} else if (arg1 == 15) {
			this.anInt3560 = arg0.method1557();
		} else if (arg1 == 16) {
			this.anInt3546 = arg0.method1557();
		} else if (arg1 == 17) {
			this.anInt3545 = arg0.method1557();
			this.anInt3541 = arg0.method1557();
			this.anInt3543 = arg0.method1557();
			this.anInt3564 = arg0.method1557();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass62Array108[arg1 - 30] = arg0.method1538();
			if (this.aClass62Array108[arg1 - 30].method1858(Static105.aClass62_801)) {
				this.aClass62Array108[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local112 = arg0.method1534();
			this.aShortArray122 = new short[local112];
			this.aShortArray125 = new short[local112];
			for (local122 = 0; local122 < local112; local122++) {
				this.aShortArray125[local122] = (short) arg0.method1557();
				this.aShortArray122[local122] = (short) arg0.method1557();
			}
		} else if (arg1 == 41) {
			local112 = arg0.method1534();
			this.aShortArray124 = new short[local112];
			this.aShortArray123 = new short[local112];
			for (local122 = 0; local122 < local112; local122++) {
				this.aShortArray123[local122] = (short) arg0.method1557();
				this.aShortArray124[local122] = (short) arg0.method1557();
			}
		} else if (arg1 == 42) {
			local112 = arg0.method1534();
			this.aByteArray37 = new byte[local112];
			for (local122 = 0; local122 < local112; local122++) {
				this.aByteArray37[local122] = arg0.method1552();
			}
		} else if (arg1 == 60) {
			local112 = arg0.method1534();
			this.anIntArray306 = new int[local112];
			for (local122 = 0; local122 < local112; local122++) {
				this.anIntArray306[local122] = arg0.method1557();
			}
		} else if (arg1 == 93) {
			this.aBoolean151 = false;
		} else if (arg1 == 95) {
			this.anInt3548 = arg0.method1557();
		} else if (arg1 == 97) {
			this.anInt3562 = arg0.method1557();
		} else if (arg1 == 98) {
			this.anInt3542 = arg0.method1557();
		} else if (arg1 == 99) {
			this.aBoolean154 = true;
		} else if (arg1 == 100) {
			this.anInt3563 = arg0.method1552();
		} else if (arg1 == 101) {
			this.anInt3549 = arg0.method1552() * 5;
		} else if (arg1 == 102) {
			this.anInt3550 = arg0.method1557();
		} else if (arg1 == 103) {
			this.anInt3554 = arg0.method1557();
		} else if (arg1 == 106) {
			this.anInt3555 = arg0.method1557();
			if (this.anInt3555 == 65535) {
				this.anInt3555 = -1;
			}
			this.anInt3557 = arg0.method1557();
			if (this.anInt3557 == 65535) {
				this.anInt3557 = -1;
			}
			local112 = arg0.method1534();
			this.anIntArray304 = new int[local112 + 1];
			for (local122 = 0; local122 <= local112; local122++) {
				this.anIntArray304[local122] = arg0.method1557();
				if (this.anIntArray304[local122] == 65535) {
					this.anIntArray304[local122] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean153 = false;
		} else if (arg1 == 109) {
			this.aBoolean152 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method1557();
				arg0.method1557();
			} else if (arg1 == 114) {
				arg0.method1552();
				arg0.method1552();
			} else if (arg1 == 115) {
				this.aShort11 = (short) (arg0.method1534() * 4);
				this.aShort12 = (short) (arg0.method1534() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method2453(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1534();
			if (local9 == 0) {
				return;
			}
			this.method2452(arg0, local9);
		}
	}
}
