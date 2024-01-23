import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class27 {

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Lclient!sc;")
	private Class102 aClass102_6;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public int anInt801 = -1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Z")
	public boolean aBoolean38 = true;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
	public boolean aBoolean40 = true;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	public int anInt808 = -1;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Z")
	public boolean aBoolean41 = true;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt810 = 0;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public int anInt797 = -1;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public int anInt813 = -1;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "Z")
	public boolean aBoolean42 = true;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	private int anInt794 = 128;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	public int anInt803 = -1;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "I")
	public int anInt819 = -1;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
	public int anInt821 = -1;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "[Lclient!ia;")
	public Class51[] aClass51Array7 = new Class51[5];

	@OriginalMember(owner = "client!d", name = "y", descriptor = "I")
	public int anInt807 = -1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	private int anInt793 = 0;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public int anInt796 = -1;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	private int anInt804 = -1;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	private int anInt798 = 0;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "S")
	public short aShort2 = 0;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	private int anInt818 = -1;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "S")
	public short aShort3 = 0;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "B")
	public byte aByte2 = -96;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
	public int anInt822 = 1;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "Lclient!ia;")
	public Class51 aClass51_227 = Static141.aClass51_1066;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "I")
	private int anInt814 = 128;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "B")
	public byte aByte3 = -16;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "S")
	public short aShort4 = 0;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
	public int anInt827 = 32;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "I")
	public int anInt817 = -1;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "S")
	public short aShort1 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public int method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass102_6 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub15 local21 = (Class1_Sub15) this.aClass102_6.method3093((long) arg1);
			return local21 == null ? arg0 : local21.anInt2107;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Z")
	public boolean method593() {
		if (this.anIntArray51 == null) {
			return true;
		}
		@Pc(15) int local15 = -1;
		if (this.anInt804 != -1) {
			local15 = Static182.method3078(this.anInt804);
		} else if (this.anInt818 != -1) {
			local15 = Static86.anIntArray125[this.anInt818];
		}
		if (local15 < 0 || local15 >= this.anIntArray51.length - 1 || this.anIntArray51[local15] == -1) {
			@Pc(66) int local66 = this.anIntArray51[this.anIntArray51.length - 1];
			return local66 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)Lclient!d;")
	public Class27 method594() {
		@Pc(1) int local1 = -1;
		if (this.anInt804 != -1) {
			local1 = Static182.method3078(this.anInt804);
		} else if (this.anInt818 != -1) {
			local1 = Static86.anIntArray125[this.anInt818];
		}
		if (local1 < 0 || this.anIntArray51.length - 1 <= local1 || this.anIntArray51[local1] == -1) {
			@Pc(63) int local63 = this.anIntArray51[this.anIntArray51.length - 1];
			return local63 == -1 ? null : Static168.method2871(local63);
		} else {
			return Static168.method2871(this.anIntArray51[local1]);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	public void method596() {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!fc;Z)Lclient!ei;")
	public Class5_Sub2 method597(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		if (this.anIntArray51 != null) {
			@Pc(12) Class27 local12 = this.method594();
			return local12 == null ? null : local12.method597(arg0, arg1);
		} else if (this.anIntArray49 == null) {
			return null;
		} else {
			@Pc(40) Class5_Sub2 local40 = (Class5_Sub2) Static217.aClass53_29.method1501((long) this.anInt799);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray49.length; local46++) {
					if (!Static112.aClass70_27.method3535(0, this.anIntArray49[local46])) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(74) Class5_Sub6[] local74 = new Class5_Sub6[this.anIntArray49.length];
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray49.length; local76++) {
					local74[local76] = Static215.method3571(Static112.aClass70_27, this.anIntArray49[local76]);
				}
				@Pc(109) Class5_Sub6 local109;
				if (local74.length == 1) {
					local109 = local74[0];
				} else {
					local109 = new Class5_Sub6(local74, local74.length);
				}
				@Pc(120) int local120;
				if (this.aShortArray2 != null) {
					for (local120 = 0; local120 < this.aShortArray2.length; local120++) {
						if (this.aByteArray8 == null || local120 >= this.aByteArray8.length) {
							local109.method3566(this.aShortArray2[local120], this.aShortArray4[local120]);
						} else {
							local109.method3566(this.aShortArray2[local120], Static149.aShortArray21[this.aByteArray8[local120] & 0xFF]);
						}
					}
				}
				if (this.aShortArray5 != null) {
					for (local120 = 0; local120 < this.aShortArray5.length; local120++) {
						local109.method3564(this.aShortArray5[local120], this.aShortArray3[local120]);
					}
				}
				local40 = local109.method3582(64, 768, -50, -10, -50);
				Static217.aClass53_29.method1497(local40, (long) this.anInt799);
			}
			if (arg1 != null) {
				local40 = arg1.method934(local40, arg0);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!k;I)V")
	private void method598(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg1 == 1) {
			local20 = arg0.method3793();
			this.anIntArray50 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray50[local26] = arg0.method3805();
			}
		} else if (arg1 == 2) {
			this.aClass51_227 = arg0.method3781();
		} else if (arg1 == 12) {
			this.anInt822 = arg0.method3793();
		} else if (arg1 == 13) {
			this.anInt796 = arg0.method3805();
		} else if (arg1 == 14) {
			this.anInt815 = arg0.method3805();
		} else if (arg1 == 15) {
			this.anInt819 = arg0.method3805();
			return;
		} else if (arg1 == 16) {
			this.anInt801 = arg0.method3805();
			return;
		} else if (arg1 == 17) {
			this.anInt815 = arg0.method3805();
			this.anInt811 = arg0.method3805();
			this.anInt821 = arg0.method3805();
			this.anInt807 = arg0.method3805();
			return;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass51Array7[arg1 - 30] = arg0.method3781();
			if (this.aClass51Array7[arg1 - 30].method1401(Static225.aClass51_1613)) {
				this.aClass51Array7[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local20 = arg0.method3793();
			this.aShortArray2 = new short[local20];
			this.aShortArray4 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray2[local26] = (short) arg0.method3805();
				this.aShortArray4[local26] = (short) arg0.method3805();
			}
			return;
		} else if (arg1 == 41) {
			local20 = arg0.method3793();
			this.aShortArray3 = new short[local20];
			this.aShortArray5 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray5[local26] = (short) arg0.method3805();
				this.aShortArray3[local26] = (short) arg0.method3805();
			}
			return;
		} else if (arg1 == 42) {
			local20 = arg0.method3793();
			this.aByteArray8 = new byte[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aByteArray8[local26] = arg0.method3802();
			}
			return;
		} else if (arg1 == 60) {
			local20 = arg0.method3793();
			this.anIntArray49 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray49[local26] = arg0.method3805();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean38 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt808 = arg0.method3805();
			return;
		} else if (arg1 == 97) {
			this.anInt814 = arg0.method3805();
			return;
		} else if (arg1 == 98) {
			this.anInt794 = arg0.method3805();
			return;
		} else if (arg1 == 99) {
			this.aBoolean39 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt793 = arg0.method3802();
			return;
		} else if (arg1 == 101) {
			this.anInt798 = arg0.method3802() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt797 = arg0.method3805();
			return;
		} else if (arg1 == 103) {
			this.anInt827 = arg0.method3805();
			return;
		} else {
			@Pc(366) int local366;
			if (arg1 != 106 && arg1 != 118) {
				if (arg1 == 107) {
					this.aBoolean42 = false;
					return;
				}
				if (arg1 == 109) {
					this.aBoolean40 = false;
					return;
				}
				if (arg1 == 111) {
					this.aBoolean41 = false;
					return;
				}
				if (arg1 == 113) {
					this.aShort1 = (short) arg0.method3805();
					this.aShort4 = (short) arg0.method3805();
					return;
				}
				if (arg1 != 114) {
					if (arg1 == 115) {
						this.aShort3 = (short) (arg0.method3793() * 4);
						this.aShort2 = (short) (arg0.method3793() * 4);
						return;
					}
					if (arg1 == 119) {
						this.aByte1 = arg0.method3802();
						return;
					}
					if (arg1 == 120) {
						this.anInt817 = arg0.method3805();
						this.anInt813 = arg0.method3805();
						this.anInt803 = arg0.method3805();
						this.anInt810 = arg0.method3793();
						return;
					}
					if (arg1 == 121) {
						this.anIntArrayArray5 = new int[this.anIntArray50.length][];
						local20 = arg0.method3793();
						for (local26 = 0; local26 < local20; local26++) {
							local366 = arg0.method3793();
							@Pc(374) int[] local374 = this.anIntArrayArray5[local366] = new int[3];
							local374[0] = arg0.method3802();
							local374[1] = arg0.method3802();
							local374[2] = arg0.method3802();
						}
					} else if (arg1 == 249) {
						local20 = arg0.method3793();
						if (this.aClass102_6 == null) {
							local26 = Static148.method2539(local20);
							this.aClass102_6 = new Class102(local26);
						}
						for (local26 = 0; local26 < local20; local26++) {
							@Pc(310) boolean local310 = arg0.method3793() == 1;
							@Pc(314) int local314 = arg0.method3806();
							@Pc(323) Class1 local323;
							if (local310) {
								local323 = new Class1_Sub26(arg0.method3781());
							} else {
								local323 = new Class1_Sub15(arg0.method3784());
							}
							this.aClass102_6.method3083(local323, (long) local314);
						}
						return;
					}
					return;
				}
				this.aByte2 = arg0.method3802();
				this.aByte3 = arg0.method3802();
				return;
			}
			this.anInt804 = arg0.method3805();
			if (this.anInt804 == 65535) {
				this.anInt804 = -1;
			}
			this.anInt818 = arg0.method3805();
			local20 = -1;
			if (this.anInt818 == 65535) {
				this.anInt818 = -1;
			}
			if (arg1 == 118) {
				local20 = arg0.method3805();
				if (local20 == 65535) {
					local20 = -1;
				}
			}
			local26 = arg0.method3793();
			this.anIntArray51 = new int[local26 + 2];
			for (local366 = 0; local366 <= local26; local366++) {
				this.anIntArray51[local366] = arg0.method3805();
				if (this.anIntArray51[local366] == 65535) {
					this.anIntArray51[local366] = -1;
				}
			}
			this.anIntArray51[local26 + 1] = local20;
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZILclient!fc;Lclient!fc;)Lclient!ei;")
	public Class5_Sub2 method599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) Class40 arg3) {
		if (this.anIntArray51 != null) {
			@Pc(12) Class27 local12 = this.method594();
			return local12 == null ? null : local12.method599(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class5_Sub2 local32 = (Class5_Sub2) Static55.aClass53_10.method1501((long) this.anInt799);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray50.length; local38++) {
				if (!Static112.aClass70_27.method3535(0, this.anIntArray50[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class5_Sub6[] local66 = new Class5_Sub6[this.anIntArray50.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray50.length; local68++) {
				local66[local68] = Static215.method3571(Static112.aClass70_27, this.anIntArray50[local68]);
				if (this.anIntArrayArray5 != null && this.anIntArrayArray5[local68] != null && local66[local68] != null) {
					local66[local68].method3568(this.anIntArrayArray5[local68][0], this.anIntArrayArray5[local68][1], this.anIntArrayArray5[local68][2]);
				}
			}
			@Pc(130) Class5_Sub6 local130;
			if (local66.length == 1) {
				local130 = local66[0];
			} else {
				local130 = new Class5_Sub6(local66, local66.length);
			}
			@Pc(144) int local144;
			if (this.aShortArray2 != null) {
				for (local144 = 0; local144 < this.aShortArray2.length; local144++) {
					if (this.aByteArray8 == null || local144 >= this.aByteArray8.length) {
						local130.method3566(this.aShortArray2[local144], this.aShortArray4[local144]);
					} else {
						local130.method3566(this.aShortArray2[local144], Static149.aShortArray21[this.aByteArray8[local144] & 0xFF]);
					}
				}
			}
			if (this.aShortArray5 != null) {
				for (local144 = 0; local144 < this.aShortArray5.length; local144++) {
					local130.method3564(this.aShortArray5[local144], this.aShortArray3[local144]);
				}
			}
			local32 = local130.method3582(this.anInt793 + 64, this.anInt798 + 850, -30, -50, -30);
			Static55.aClass53_10.method1497(local32, (long) this.anInt799);
		}
		@Pc(255) Class5_Sub2 local255;
		if (arg2 != null && arg3 != null) {
			local255 = arg2.method935(arg0, arg1, arg3, local32);
		} else if (arg2 != null) {
			local255 = arg2.method940(arg1, local32);
		} else if (arg3 == null) {
			local255 = local32.method2931(true, true);
		} else {
			local255 = arg3.method940(arg0, local32);
		}
		if (this.anInt814 != 128 || this.anInt794 != 128) {
			local255.method2922(this.anInt814, this.anInt794, this.anInt814);
		}
		return local255;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!k;I)V")
	public void method600(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3793();
			if (local17 == 0) {
				return;
			}
			this.method598(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBLclient!ia;)Lclient!ia;")
	public Class51 method601(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		if (this.aClass102_6 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub26 local24 = (Class1_Sub26) this.aClass102_6.method3093((long) arg0);
			return local24 == null ? arg1 : local24.aClass51_1609;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Z")
	public boolean method603() {
		if (this.anIntArray51 == null) {
			return this.anInt817 != -1 || this.anInt813 != -1 || this.anInt803 != -1;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray51.length; local26++) {
			if (this.anIntArray51[local26] != -1) {
				@Pc(42) Class27 local42 = Static168.method2871(this.anIntArray51[local26]);
				if (local42.anInt817 != -1 || local42.anInt813 != -1 || local42.anInt803 != -1) {
					return true;
				}
			}
		}
		return false;
	}
}
