import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class8_Sub1_Sub4 extends Class8_Sub1 {

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cd", name = "yb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cd", name = "Bb", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!cd", name = "Jb", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!cd", name = "ec", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
	public int anInt414 = -1;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	private int anInt419 = 128;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
	private int anInt418 = 0;

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
	private int anInt433 = -1;

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
	public int anInt424 = 2;

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
	public int anInt429 = -1;

	@OriginalMember(owner = "client!cd", name = "Ib", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "Z")
	public boolean aBoolean22 = true;

	@OriginalMember(owner = "client!cd", name = "Db", descriptor = "I")
	private int anInt436 = -1;

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
	public int anInt422 = -1;

	@OriginalMember(owner = "client!cd", name = "Fb", descriptor = "I")
	public int anInt438 = -1;

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
	public int anInt432 = 0;

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
	private int anInt430 = 0;

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
	public int anInt416 = 0;

	@OriginalMember(owner = "client!cd", name = "Ab", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!cd", name = "Hb", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!cd", name = "Lb", descriptor = "I")
	public int anInt442 = -1;

	@OriginalMember(owner = "client!cd", name = "Rb", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
	public int anInt415 = 0;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
	public int anInt420 = 0;

	@OriginalMember(owner = "client!cd", name = "Mb", descriptor = "I")
	public int anInt443 = 1;

	@OriginalMember(owner = "client!cd", name = "Ub", descriptor = "[Lclient!ic;")
	public final Class34[] aClass34Array7 = new Class34[5];

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
	private int anInt425 = 0;

	@OriginalMember(owner = "client!cd", name = "Sb", descriptor = "I")
	private int anInt447 = 128;

	@OriginalMember(owner = "client!cd", name = "Vb", descriptor = "I")
	private int anInt449 = 128;

	@OriginalMember(owner = "client!cd", name = "Ob", descriptor = "I")
	private int anInt445 = -1;

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cd", name = "Tb", descriptor = "I")
	public int anInt448 = 16;

	@OriginalMember(owner = "client!cd", name = "cc", descriptor = "I")
	public int anInt455 = 1;

	@OriginalMember(owner = "client!cd", name = "zb", descriptor = "I")
	private int anInt435 = 0;

	@OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Lclient!ic;")
	public Class34 aClass34_249 = Static83.aClass34_930;

	@OriginalMember(owner = "client!cd", name = "bc", descriptor = "I")
	public int anInt454 = -1;

	@OriginalMember(owner = "client!cd", name = "ac", descriptor = "I")
	private int anInt453 = 0;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public void method257() {
		if (this.anInt414 == -1) {
			this.anInt414 = 0;
			if (this.anIntArray57 != null && (this.anIntArray55 == null || this.anIntArray55[0] == 10)) {
				this.anInt414 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass34Array7[local27] != null) {
					this.anInt414 = 1;
				}
			}
		}
		if (this.anInt454 == -1) {
			this.anInt454 = this.anInt424 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Lclient!df;")
	private Class8_Sub1_Sub1_Sub3 method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class8_Sub1_Sub1_Sub3 local12 = null;
		@Pc(28) boolean local28;
		@Pc(44) int local44;
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray55 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray57 == null) {
				return null;
			}
			local28 = this.aBoolean23;
			if (arg1 == 2 && arg0 > 3) {
				local28 = !local28;
			}
			local44 = this.anIntArray57.length;
			for (local46 = 0; local46 < local44; local46++) {
				local52 = this.anIntArray57[local46];
				if (local28) {
					local52 += 65536;
				}
				local12 = (Class8_Sub1_Sub1_Sub3) Static88.aClass48_44.method1100((long) local52);
				if (local12 == null) {
					local12 = Static26.method472(Static120.aClass14_29, local52 & 0xFFFF);
					if (local12 == null) {
						return null;
					}
					if (local28) {
						local12.method477();
					}
					Static88.aClass48_44.method1097(local12, (long) local52);
				}
				if (local44 > 1) {
					Static102.aClass8_Sub1_Sub1_Sub3Array62[local46] = local12;
				}
			}
			if (local44 > 1) {
				local12 = new Class8_Sub1_Sub1_Sub3(Static102.aClass8_Sub1_Sub1_Sub3Array62, local44);
			}
		} else {
			@Pc(113) int local113 = -1;
			for (local44 = 0; local44 < this.anIntArray55.length; local44++) {
				if (arg1 == this.anIntArray55[local44]) {
					local113 = local44;
					break;
				}
			}
			if (local113 == -1) {
				return null;
			}
			@Pc(152) boolean local152 = this.aBoolean23 ^ arg0 > 3;
			local46 = this.anIntArray57[local113];
			if (local152) {
				local46 += 65536;
			}
			local12 = (Class8_Sub1_Sub1_Sub3) Static88.aClass48_44.method1100((long) local46);
			if (local12 == null) {
				local12 = Static26.method472(Static120.aClass14_29, local46 & 0xFFFF);
				if (local12 == null) {
					return null;
				}
				if (local152) {
					local12.method477();
				}
				Static88.aClass48_44.method1097(local12, (long) local46);
			}
		}
		if (this.anInt447 == 128 && this.anInt449 == 128 && this.anInt419 == 128) {
			local28 = false;
		} else {
			local28 = true;
		}
		@Pc(227) boolean local227;
		if (this.anInt418 == 0 && this.anInt430 == 0 && this.anInt435 == 0) {
			local227 = false;
		} else {
			local227 = true;
		}
		@Pc(261) Class8_Sub1_Sub1_Sub3 local261 = new Class8_Sub1_Sub1_Sub3(local12, arg0 == 0 && !local28 && !local227, this.aShortArray4 == null, this.aShortArray6 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local261.method470();
			local261.method476(45, 0, -45);
		}
		@Pc(281) int local281 = arg0 & 0x3;
		if (local281 == 1) {
			local261.method492();
		} else if (local281 == 2) {
			local261.method483();
		} else if (local281 == 3) {
			local261.method491();
		}
		if (this.aShortArray4 != null) {
			for (local52 = 0; local52 < this.aShortArray4.length; local52++) {
				local261.method490(this.aShortArray4[local52], this.aShortArray3[local52]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local52 = 0; local52 < this.aShortArray6.length; local52++) {
				local261.method485(this.aShortArray6[local52], this.aShortArray5[local52]);
			}
		}
		if (local28) {
			local261.method484(this.anInt447, this.anInt449, this.anInt419);
		}
		if (local227) {
			local261.method476(this.anInt418, this.anInt430, this.anInt435);
		}
		return local261;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[[IIIIZ)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) long local10;
		if (this.anIntArray55 == null) {
			local10 = arg0 + (this.anInt440 << 10);
		} else {
			local10 = (this.anInt440 << 10) + ((arg1 << 3) + arg0);
		}
		@Pc(35) Class8_Sub1_Sub1_Sub6 local35 = (Class8_Sub1_Sub1_Sub6) Static93.aClass48_41.method1100(local10);
		if (local35 == null) {
			@Pc(48) Class8_Sub1_Sub1_Sub3 local48 = this.method258(arg0, arg1);
			if (local48 == null) {
				return null;
			}
			local35 = local48.method479(this.anInt453 + 64, this.anInt425 * 5 + 768, -50, -10, -50);
			Static93.aClass48_41.method1097(local35, local10);
		}
		if (this.anInt445 >= 0) {
			local35 = local35.method1289(arg2, arg5, arg4, arg3, true, this.anInt445);
		}
		return local35;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIII[[III)Lclient!ka;")
	public Class8_Sub1_Sub1 method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(28) long local28;
		if (this.anIntArray55 == null) {
			local28 = arg1 + (this.anInt440 << 10);
		} else {
			local28 = (this.anInt440 << 10) - (-(arg4 << 3) - arg1);
		}
		@Pc(44) Class8_Sub1_Sub1 local44 = (Class8_Sub1_Sub1) Static109.aClass48_50.method1100(local28);
		if (local44 == null) {
			@Pc(52) Class8_Sub1_Sub1_Sub3 local52 = this.method258(arg1, arg4);
			if (local52 == null) {
				return null;
			}
			if (this.aBoolean26) {
				local52.aShort2 = (short) (this.anInt425 * 5 + 768);
				local44 = local52;
				local52.aShort1 = (short) (this.anInt453 + 64);
				local52.method478();
			} else {
				local44 = local52.method479(this.anInt453 + 64, this.anInt425 * 5 + 768, -50, -10, -50);
			}
			Static109.aClass48_50.method1097(local44, local28);
		}
		if (this.aBoolean26) {
			local44 = ((Class8_Sub1_Sub1_Sub3) local44).method482();
		}
		if (this.anInt445 >= 0) {
			if (local44 instanceof Class8_Sub1_Sub1_Sub6) {
				local44 = ((Class8_Sub1_Sub1_Sub6) local44).method1289(arg3, arg2, arg0, arg5, true, this.anInt445);
			} else if (local44 instanceof Class8_Sub1_Sub1_Sub3) {
				local44 = ((Class8_Sub1_Sub1_Sub3) local44).method475(arg3, arg2, arg0, arg5, this.anInt445);
			}
		}
		return local44;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!dc;II[[II)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7) {
		@Pc(25) long local25;
		if (this.anIntArray55 == null) {
			local25 = (this.anInt440 << 10) + arg7;
		} else {
			local25 = (arg5 << 3) + (this.anInt440 << 10) + arg7;
		}
		@Pc(42) Class8_Sub1_Sub1_Sub6 local42 = (Class8_Sub1_Sub1_Sub6) Static93.aClass48_41.method1100(local25);
		if (local42 == null) {
			@Pc(50) Class8_Sub1_Sub1_Sub3 local50 = this.method258(arg7, arg5);
			if (local50 == null) {
				return null;
			}
			local42 = local50.method479(this.anInt453 + 64, this.anInt425 * 5 + 768, -50, -10, -50);
			Static93.aClass48_41.method1097(local42, local25);
		}
		if (arg4 == null && this.anInt445 == -1) {
			return local42;
		}
		if (arg4 == null) {
			local42 = local42.method1274(true);
		} else {
			local42 = arg4.method418(local42, arg0, arg7);
		}
		if (this.anInt445 >= 0) {
			local42 = local42.method1289(arg6, arg3, arg2, arg1, false, this.anInt445);
		}
		return local42;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Lclient!cd;")
	public Class8_Sub1_Sub4 method263() {
		@Pc(11) int local11 = -1;
		if (this.anInt433 != -1) {
			local11 = Static23.method423(this.anInt433);
		} else if (this.anInt436 != -1) {
			local11 = Static78.anIntArray238[this.anInt436];
		}
		return local11 < 0 || this.anIntArray56.length <= local11 || this.anIntArray56[local11] == -1 ? null : Static50.method752(this.anIntArray56[local11]);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public boolean method264(@OriginalArg(0) int arg0) {
		if (this.anIntArray55 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray55.length; local14++) {
				if (arg0 == this.anIntArray55[local14]) {
					return Static120.aClass14_29.method1145(this.anIntArray57[local14] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray57 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < this.anIntArray57.length; local55++) {
				local53 &= Static120.aClass14_29.method1145(this.anIntArray57[local55] & 0xFFFF, 0);
			}
			return local53;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method266(@OriginalArg(0) Class8_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1872();
			if (local14 == 0) {
				return;
			}
			this.method269(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!wd;)V")
	private void method269(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub20 arg1) {
		@Pc(35) int local35;
		@Pc(51) int local51;
		if (arg0 == 1) {
			local35 = arg1.method1872();
			if (local35 > 0) {
				if (this.anIntArray57 == null || Static105.aBoolean91) {
					this.anIntArray55 = new int[local35];
					this.anIntArray57 = new int[local35];
					for (local51 = 0; local51 < local35; local51++) {
						this.anIntArray57[local51] = arg1.method1839();
						this.anIntArray55[local51] = arg1.method1872();
					}
				} else {
					arg1.anInt2853 += local35 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass34_249 = arg1.method1892();
		} else if (arg0 == 5) {
			local35 = arg1.method1872();
			if (local35 > 0) {
				if (this.anIntArray57 != null && !Static105.aBoolean91) {
					arg1.anInt2853 += local35 * 2;
					return;
				}
				this.anIntArray57 = new int[local35];
				this.anIntArray55 = null;
				for (local51 = 0; local51 < local35; local51++) {
					this.anIntArray57[local51] = arg1.method1839();
				}
				return;
			}
		} else if (arg0 == 14) {
			this.anInt443 = arg1.method1872();
			return;
		} else if (arg0 == 15) {
			this.anInt455 = arg1.method1872();
		} else if (arg0 == 17) {
			this.aBoolean22 = false;
			this.anInt424 = 0;
			return;
		} else if (arg0 == 18) {
			this.aBoolean22 = false;
			return;
		} else if (arg0 == 19) {
			this.anInt414 = arg1.method1872();
			return;
		} else if (arg0 == 21) {
			this.anInt445 = 0;
			return;
		} else if (arg0 == 22) {
			this.aBoolean26 = true;
			return;
		} else if (arg0 == 23) {
			this.aBoolean21 = true;
			return;
		} else {
			if (arg0 == 24) {
				this.anInt438 = arg1.method1839();
				if (this.anInt438 == 65535) {
					this.anInt438 = -1;
					return;
				}
			} else if (arg0 == 27) {
				this.anInt424 = 1;
				return;
			} else if (arg0 == 28) {
				this.anInt448 = arg1.method1872();
				return;
			} else if (arg0 == 29) {
				this.anInt453 = arg1.method1847();
			} else if (arg0 == 39) {
				this.anInt425 = arg1.method1847() * 5;
				return;
			} else {
				if (arg0 >= 30 && arg0 < 35) {
					this.aClass34Array7[arg0 - 30] = arg1.method1892();
					if (this.aClass34Array7[arg0 - 30].method806(Static97.aClass34_1059)) {
						this.aClass34Array7[arg0 - 30] = null;
						return;
					}
				} else if (arg0 == 40) {
					local35 = arg1.method1872();
					this.aShortArray3 = new short[local35];
					this.aShortArray4 = new short[local35];
					for (local51 = 0; local51 < local35; local51++) {
						this.aShortArray4[local51] = (short) arg1.method1839();
						this.aShortArray3[local51] = (short) arg1.method1839();
					}
				} else if (arg0 == 41) {
					local35 = arg1.method1872();
					this.aShortArray5 = new short[local35];
					this.aShortArray6 = new short[local35];
					for (local51 = 0; local51 < local35; local51++) {
						this.aShortArray6[local51] = (short) arg1.method1839();
						this.aShortArray5[local51] = (short) arg1.method1839();
					}
					return;
				} else if (arg0 == 60) {
					this.anInt422 = arg1.method1839();
					return;
				} else if (arg0 == 62) {
					this.aBoolean23 = true;
					return;
				} else if (arg0 == 64) {
					this.aBoolean25 = false;
					return;
				} else if (arg0 == 65) {
					this.anInt447 = arg1.method1839();
					return;
				} else if (arg0 == 66) {
					this.anInt449 = arg1.method1839();
					return;
				} else if (arg0 == 67) {
					this.anInt419 = arg1.method1839();
					return;
				} else if (arg0 == 68) {
					this.anInt442 = arg1.method1839();
					return;
				} else if (arg0 == 69) {
					this.anInt420 = arg1.method1872();
					return;
				} else if (arg0 == 70) {
					this.anInt418 = arg1.method1856();
					return;
				} else if (arg0 == 71) {
					this.anInt430 = arg1.method1856();
					return;
				} else if (arg0 == 72) {
					this.anInt435 = arg1.method1856();
					return;
				} else if (arg0 == 73) {
					this.aBoolean20 = true;
					return;
				} else if (arg0 == 74) {
					this.aBoolean24 = true;
					return;
				} else if (arg0 == 75) {
					this.anInt454 = arg1.method1872();
					return;
				} else if (arg0 == 77) {
					this.anInt433 = arg1.method1839();
					if (this.anInt433 == 65535) {
						this.anInt433 = -1;
					}
					this.anInt436 = arg1.method1839();
					if (this.anInt436 == 65535) {
						this.anInt436 = -1;
					}
					local35 = arg1.method1872();
					this.anIntArray56 = new int[local35 + 1];
					for (local51 = 0; local51 <= local35; local51++) {
						this.anIntArray56[local51] = arg1.method1839();
						if (this.anIntArray56[local51] == 65535) {
							this.anIntArray56[local51] = -1;
						}
					}
					return;
				} else if (arg0 == 78) {
					this.anInt429 = arg1.method1839();
					this.anInt416 = arg1.method1872();
					return;
				} else {
					if (arg0 == 79) {
						this.anInt432 = arg1.method1839();
						this.anInt415 = arg1.method1839();
						this.anInt416 = arg1.method1872();
						local35 = arg1.method1872();
						this.anIntArray58 = new int[local35];
						for (local51 = 0; local51 < local35; local51++) {
							this.anIntArray58[local51] = arg1.method1839();
						}
					} else if (arg0 == 81) {
						this.anInt445 = arg1.method1872() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
	public boolean method270() {
		if (this.anIntArray56 == null) {
			return this.anInt429 != -1 || this.anIntArray58 != null;
		}
		for (@Pc(29) int local29 = 0; local29 < this.anIntArray56.length; local29++) {
			if (this.anIntArray56[local29] != -1) {
				@Pc(44) Class8_Sub1_Sub4 local44 = Static50.method752(this.anIntArray56[local29]);
				if (local44.anInt429 != -1 || local44.anIntArray58 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)Z")
	public boolean method271() {
		if (this.anIntArray57 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray57.length; local14++) {
			local12 &= Static120.aClass14_29.method1145(this.anIntArray57[local14] & 0xFFFF, 0);
		}
		return local12;
	}
}
