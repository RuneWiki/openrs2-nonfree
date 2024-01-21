import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	public int anInt69;

	@OriginalMember(owner = "client!ab", name = "ib", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "[I")
	public int[] anIntArray9;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
	private int anInt74 = 128;

	@OriginalMember(owner = "client!ab", name = "nb", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ab", name = "kb", descriptor = "I")
	public int anInt75 = -1;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "I")
	private int anInt82 = 0;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
	public int anInt71 = -1;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
	private int anInt68 = 128;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt86 = 1;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ab", name = "ob", descriptor = "Lclient!he;")
	public Class26 aClass26_58 = Static108.aClass26_1571;

	@OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
	private int anInt76 = -1;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt83 = 0;

	@OriginalMember(owner = "client!ab", name = "gb", descriptor = "I")
	private int anInt73 = 0;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	public int anInt84 = 0;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
	private int anInt80 = 128;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private int anInt85 = 0;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "I")
	public int anInt93 = 2;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt88 = 0;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt87 = -1;

	@OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
	public int anInt77 = -1;

	@OriginalMember(owner = "client!ab", name = "Wb", descriptor = "I")
	public int anInt98 = -1;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "[Lclient!he;")
	public final Class26[] aClass26Array1 = new Class26[5];

	@OriginalMember(owner = "client!ab", name = "Tb", descriptor = "I")
	public int anInt96 = 1;

	@OriginalMember(owner = "client!ab", name = "Ub", descriptor = "I")
	private int anInt97 = -1;

	@OriginalMember(owner = "client!ab", name = "dc", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "I")
	public int anInt95 = 0;

	@OriginalMember(owner = "client!ab", name = "Zb", descriptor = "I")
	public int anInt101 = 16;

	@OriginalMember(owner = "client!ab", name = "fc", descriptor = "I")
	public int anInt106 = -1;

	@OriginalMember(owner = "client!ab", name = "gc", descriptor = "I")
	private int anInt107 = 0;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ab", name = "hc", descriptor = "I")
	public int anInt108 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)Lclient!hd;")
	public Class3_Sub1_Sub5 method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) long local17;
		if (this.anIntArray7 == null) {
			local17 = (this.anInt69 << 10) + arg2;
		} else {
			local17 = (arg4 << 3) + (this.anInt69 << 10) + arg2;
		}
		@Pc(34) Class3_Sub1_Sub5 local34 = (Class3_Sub1_Sub5) Static130.aClass66_28.method1970(local17);
		if (local34 == null) {
			@Pc(46) Class3_Sub1_Sub5_Sub2 local46 = this.method59(arg4, arg2);
			if (local46 == null) {
				return null;
			}
			if (this.aBoolean9) {
				local46.aShort1 = (short) (this.anInt82 * 5 + 768);
				local34 = local46;
				local46.aShort2 = (short) (this.anInt83 + 64);
				local46.method691();
			} else {
				local34 = local46.method688(this.anInt83 + 64, this.anInt82 * 5 + 768, -50, -10, -50);
			}
			Static130.aClass66_28.method1969(local17, local34);
		}
		if (this.aBoolean9) {
			local34 = ((Class3_Sub1_Sub5_Sub2) local34).method677();
		}
		if (this.aBoolean5) {
			if (local34 instanceof Class3_Sub1_Sub5_Sub7) {
				local34 = ((Class3_Sub1_Sub5_Sub7) local34).method1471(arg1, arg3, arg5, arg0, true);
			} else if (local34 instanceof Class3_Sub1_Sub5_Sub2) {
				local34 = ((Class3_Sub1_Sub5_Sub2) local34).method681(arg1, arg3, arg5, arg0);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lclient!ab;")
	public Class3_Sub1_Sub1 method48() {
		@Pc(1) int local1 = -1;
		if (this.anInt97 != -1) {
			local1 = Static93.method1693(this.anInt97);
		} else if (this.anInt76 != -1) {
			local1 = Static52.anIntArray159[this.anInt76];
		}
		return local1 < 0 || this.anIntArray9.length <= local1 || this.anIntArray9[local1] == -1 ? null : Static4.method68(this.anIntArray9[local1]);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIZI)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray7 == null) {
			local19 = arg2 + (this.anInt69 << 10);
		} else {
			local19 = (this.anInt69 << 10) + (arg1 << 3) + arg2;
		}
		@Pc(35) Class3_Sub1_Sub5_Sub7 local35 = (Class3_Sub1_Sub5_Sub7) Static41.aClass66_13.method1970(local19);
		if (local35 == null) {
			@Pc(43) Class3_Sub1_Sub5_Sub2 local43 = this.method59(arg1, arg2);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method688(this.anInt83 + 64, this.anInt82 * 5 + 768, -50, -10, -50);
			Static41.aClass66_13.method1969(local19, local35);
		}
		if (this.aBoolean5) {
			local35 = local35.method1471(arg5, arg0, arg3, arg4, true);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!m;II)V")
	private void method50(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(30) int local30;
		@Pc(55) int local55;
		if (arg1 == 1) {
			local30 = arg0.method981();
			if (local30 > 0) {
				if (this.anIntArray8 == null || Static70.aBoolean81) {
					this.anIntArray8 = new int[local30];
					this.anIntArray7 = new int[local30];
					for (local55 = 0; local55 < local30; local55++) {
						this.anIntArray8[local55] = arg0.method974();
						this.anIntArray7[local55] = arg0.method981();
					}
				} else {
					arg0.anInt1562 += local30 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass26_58 = arg0.method977();
		} else if (arg1 == 5) {
			local30 = arg0.method981();
			if (local30 > 0) {
				if (this.anIntArray8 != null && !Static70.aBoolean81) {
					arg0.anInt1562 += local30 * 2;
					return;
				}
				this.anIntArray8 = new int[local30];
				this.anIntArray7 = null;
				for (local55 = 0; local55 < local30; local55++) {
					this.anIntArray8[local55] = arg0.method974();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt86 = arg0.method981();
			return;
		} else if (arg1 == 15) {
			this.anInt96 = arg0.method981();
			return;
		} else if (arg1 == 17) {
			this.anInt93 = 0;
			this.aBoolean6 = false;
		} else if (arg1 == 18) {
			this.aBoolean6 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt87 = arg0.method981();
			return;
		} else if (arg1 == 21) {
			this.aBoolean5 = true;
			return;
		} else if (arg1 == 22) {
			this.aBoolean9 = true;
			return;
		} else {
			if (arg1 == 23) {
				this.aBoolean8 = true;
			} else if (arg1 == 24) {
				this.anInt75 = arg0.method974();
				if (this.anInt75 == 65535) {
					this.anInt75 = -1;
					return;
				}
			} else if (arg1 == 27) {
				this.anInt93 = 1;
				return;
			} else if (arg1 == 28) {
				this.anInt101 = arg0.method981();
				return;
			} else if (arg1 == 29) {
				this.anInt83 = arg0.method994();
				return;
			} else {
				if (arg1 == 39) {
					this.anInt82 = arg0.method994() * 5;
				} else if (arg1 >= 30 && arg1 < 35) {
					this.aClass26Array1[arg1 - 30] = arg0.method977();
					if (this.aClass26Array1[arg1 - 30].method832(Static49.aClass26_787)) {
						this.aClass26Array1[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					local30 = arg0.method981();
					this.aShortArray1 = new short[local30];
					this.aShortArray2 = new short[local30];
					for (local55 = 0; local55 < local30; local55++) {
						this.aShortArray2[local55] = (short) arg0.method974();
						this.aShortArray1[local55] = (short) arg0.method974();
					}
					return;
				} else if (arg1 == 60) {
					this.anInt77 = arg0.method974();
					return;
				} else if (arg1 == 62) {
					this.aBoolean4 = true;
					return;
				} else if (arg1 == 64) {
					this.aBoolean7 = false;
					return;
				} else if (arg1 == 65) {
					this.anInt80 = arg0.method974();
					return;
				} else if (arg1 == 66) {
					this.anInt74 = arg0.method974();
					return;
				} else if (arg1 == 67) {
					this.anInt68 = arg0.method974();
					return;
				} else if (arg1 == 68) {
					this.anInt71 = arg0.method974();
					return;
				} else if (arg1 == 69) {
					this.anInt108 = arg0.method981();
					return;
				} else if (arg1 == 70) {
					this.anInt85 = arg0.method1003();
					return;
				} else if (arg1 == 71) {
					this.anInt107 = arg0.method1003();
					return;
				} else if (arg1 == 72) {
					this.anInt73 = arg0.method1003();
					return;
				} else if (arg1 == 73) {
					this.aBoolean10 = true;
					return;
				} else if (arg1 == 74) {
					this.aBoolean11 = true;
					return;
				} else {
					if (arg1 == 75) {
						this.anInt98 = arg0.method981();
					} else if (arg1 == 77) {
						this.anInt97 = arg0.method974();
						if (this.anInt97 == 65535) {
							this.anInt97 = -1;
						}
						this.anInt76 = arg0.method974();
						if (this.anInt76 == 65535) {
							this.anInt76 = -1;
						}
						local30 = arg0.method981();
						this.anIntArray9 = new int[local30 + 1];
						for (local55 = 0; local55 <= local30; local55++) {
							this.anIntArray9[local55] = arg0.method974();
							if (this.anIntArray9[local55] == 65535) {
								this.anIntArray9[local55] = -1;
							}
						}
						return;
					} else if (arg1 == 78) {
						this.anInt106 = arg0.method974();
						this.anInt95 = arg0.method981();
						return;
					} else if (arg1 == 79) {
						this.anInt88 = arg0.method974();
						this.anInt84 = arg0.method974();
						this.anInt95 = arg0.method981();
						local30 = arg0.method981();
						this.anIntArray10 = new int[local30];
						for (local55 = 0; local55 < local30; local55++) {
							this.anIntArray10[local55] = arg0.method974();
						}
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
	public boolean method52(@OriginalArg(0) int arg0) {
		if (this.anIntArray7 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.anIntArray7.length; local56++) {
				if (this.anIntArray7[local56] == arg0) {
					return Static20.aClass16_27.method559(this.anIntArray8[local56] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray8 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray8.length; local27++) {
				local25 &= Static20.aClass16_27.method559(this.anIntArray8[local27] & 0xFFFF, 0);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	public boolean method53() {
		if (this.anIntArray8 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray8.length; local19++) {
			local17 &= Static20.aClass16_27.method559(this.anIntArray8[local19] & 0xFFFF, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)Z")
	public boolean method54() {
		if (this.anIntArray9 == null) {
			return this.anInt106 != -1 || this.anIntArray10 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray9.length; local22++) {
			if (this.anIntArray9[local22] != -1) {
				@Pc(44) Class3_Sub1_Sub1 local44 = Static4.method68(this.anIntArray9[local22]);
				if (local44.anInt106 != -1 || local44.anIntArray10 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public void method55() {
		if (this.anInt87 == -1) {
			this.anInt87 = 0;
			if (this.anIntArray8 != null && (this.anIntArray7 == null || this.anIntArray7[0] == 10)) {
				this.anInt87 = 1;
			}
			for (@Pc(37) int local37 = 0; local37 < 5; local37++) {
				if (this.aClass26Array1[local37] != null) {
					this.anInt87 = 1;
				}
			}
		}
		if (this.anInt98 == -1) {
			this.anInt98 = this.anInt93 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!m;)V")
	public void method56(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method981();
			if (local5 == 0) {
				return;
			}
			this.method50(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!uc;IBIIIIII)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method57(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray7 == null) {
			local21 = (this.anInt69 << 10) + arg7;
		} else {
			local21 = arg7 + (this.anInt69 << 10) + (arg6 << 3);
		}
		@Pc(38) Class3_Sub1_Sub5_Sub7 local38 = (Class3_Sub1_Sub5_Sub7) Static41.aClass66_13.method1970(local21);
		if (local38 == null) {
			@Pc(46) Class3_Sub1_Sub5_Sub2 local46 = this.method59(arg6, arg7);
			if (local46 == null) {
				return null;
			}
			local38 = local46.method688(this.anInt83 + 64, 768 - -(this.anInt82 * 5), -50, -10, -50);
			Static41.aClass66_13.method1969(local21, local38);
		}
		if (arg0 == null && !this.aBoolean5) {
			return local38;
		}
		if (arg0 == null) {
			local38 = local38.method1481(true);
		} else {
			local38 = arg0.method2121(arg2, arg7, local38);
		}
		if (this.aBoolean5) {
			local38.method1471(arg4, arg3, arg5, arg1, false);
		}
		return local38;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BII)Lclient!fe;")
	private Class3_Sub1_Sub5_Sub2 method59(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3_Sub1_Sub5_Sub2 local11 = null;
		@Pc(22) int local22;
		@Pc(65) int local65;
		@Pc(126) boolean local126;
		@Pc(138) int local138;
		if (this.anIntArray7 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray8 == null) {
				return null;
			}
			local126 = this.aBoolean4 ^ arg1 > 3;
			local22 = this.anIntArray8.length;
			for (local65 = 0; local65 < local22; local65++) {
				local138 = this.anIntArray8[local65];
				if (local126) {
					local138 += 65536;
				}
				local11 = (Class3_Sub1_Sub5_Sub2) Static16.aClass66_6.method1970((long) local138);
				if (local11 == null) {
					local11 = Static34.method676(Static20.aClass16_27, local138 & 0xFFFF);
					if (local11 == null) {
						return null;
					}
					if (local126) {
						local11.method674();
					}
					Static16.aClass66_6.method1969((long) local138, local11);
				}
				if (local22 > 1) {
					Static12.aClass3_Sub1_Sub5_Sub2Array1[local65] = local11;
				}
			}
			if (local22 > 1) {
				local11 = new Class3_Sub1_Sub5_Sub2(Static12.aClass3_Sub1_Sub5_Sub2Array1, local22);
			}
		} else {
			@Pc(20) int local20 = -1;
			for (local22 = 0; local22 < this.anIntArray7.length; local22++) {
				if (arg0 == this.anIntArray7[local22]) {
					local20 = local22;
					break;
				}
			}
			if (local20 == -1) {
				return null;
			}
			@Pc(60) boolean local60 = arg1 > 3 ^ this.aBoolean4;
			local65 = this.anIntArray8[local20];
			if (local60) {
				local65 += 65536;
			}
			local11 = (Class3_Sub1_Sub5_Sub2) Static16.aClass66_6.method1970((long) local65);
			if (local11 == null) {
				local11 = Static34.method676(Static20.aClass16_27, local65 & 0xFFFF);
				if (local11 == null) {
					return null;
				}
				if (local60) {
					local11.method674();
				}
				Static16.aClass66_6.method1969((long) local65, local11);
			}
		}
		if (this.anInt80 == 128 && this.anInt74 == 128 && this.anInt68 == 128) {
			local126 = false;
		} else {
			local126 = true;
		}
		@Pc(232) boolean local232;
		if (this.anInt85 == 0 && this.anInt107 == 0 && this.anInt73 == 0) {
			local232 = false;
		} else {
			local232 = true;
		}
		@Pc(260) Class3_Sub1_Sub5_Sub2 local260 = new Class3_Sub1_Sub5_Sub2(local11, arg1 == 0 && !local126 && !local232, this.aShortArray2 == null, true);
		@Pc(264) int local264 = arg1 & 0x3;
		if (local264 == 1) {
			local260.method685();
		} else if (local264 == 2) {
			local260.method678();
		} else if (local264 == 3) {
			local260.method682();
		}
		if (this.aShortArray2 != null) {
			for (local138 = 0; local138 < this.aShortArray2.length; local138++) {
				local260.method693(this.aShortArray2[local138], this.aShortArray1[local138]);
			}
		}
		if (local126) {
			local260.method683(this.anInt80, this.anInt74, this.anInt68);
		}
		if (local232) {
			local260.method687(this.anInt85, this.anInt107, this.anInt73);
		}
		return local260;
	}
}
