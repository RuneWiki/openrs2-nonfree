import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class13 {

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "[Lclient!fi;")
	public static final Class65[] aClass65Array1 = new Class65[5];

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	public int anInt348;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass65Array1.length; local4++) {
			aClass65Array1[local4] = new Class65();
		}
		new Class188(64);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIZIII)V")
	public void method231(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt340;
		@Pc(23) int local23 = arg5 - this.anInt336;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (@Pc(36) int local36 = local18; local36 < arg2 + local18; local36++) {
			if (local36 >= 0 && this.anInt342 > local36) {
				for (@Pc(46) int local46 = local23; local46 < local23 + arg4; local46++) {
					if (local46 >= 0 && this.anInt348 > local46) {
						this.method233(local46, local36, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static90.method1438(arg4, arg0, arg7, arg3, arg0, arg5, arg1, arg2) ? true : this.method244(arg4, arg3, arg6, arg0, arg2, arg1, arg5, arg0, arg7);
		}
		@Pc(40) int local40 = arg4 + arg5 - 1;
		@Pc(46) int local46 = arg1 + arg7 - 1;
		if (arg5 <= arg3 && local40 >= arg3 && arg7 <= arg2 && local46 >= arg2) {
			return true;
		} else if (arg3 == arg5 - 1 && arg7 <= arg2 && local46 >= arg2 && (this.anIntArrayArray1[arg3 - this.anInt340][arg2 - this.anInt336] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg3 == local40 + 1 && arg2 >= arg7 && local46 >= arg2 && (this.anIntArrayArray1[arg3 - this.anInt340][arg2 - this.anInt336] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg7 - 1 && arg5 <= arg3 && arg3 <= local40 && (this.anIntArrayArray1[arg3 - this.anInt340][arg2 - this.anInt336] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg2 && arg5 <= arg3 && local40 >= arg3 && (this.anIntArrayArray1[arg3 - this.anInt340][arg2 - this.anInt336] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIII)V")
	private void method233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
	private void method234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray1[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIZIBI)V")
	public void method235(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 - this.anInt340;
		@Pc(13) int local13 = arg5 - this.anInt336;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method234(128, local13, local8);
				this.method234(8, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method234(2, local13, local8);
				this.method234(32, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method234(8, local13, local8);
				this.method234(128, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method234(32, local13, local8);
				this.method234(2, local13 - 1, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method234(1, local13, local8);
				this.method234(16, local13 + 1, local8 - 1);
			}
			if (arg2 == 1) {
				this.method234(4, local13, local8);
				this.method234(64, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method234(16, local13, local8);
				this.method234(1, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method234(64, local13, local8);
				this.method234(4, local13 - 1, local8 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method234(130, local13, local8);
				this.method234(8, local13, local8 - 1);
				this.method234(32, local13 + 1, local8);
			}
			if (arg2 == 1) {
				this.method234(10, local13, local8);
				this.method234(32, local13 + 1, local8);
				this.method234(128, local13, local8 + 1);
			}
			if (arg2 == 2) {
				this.method234(40, local13, local8);
				this.method234(128, local13, local8 + 1);
				this.method234(2, local13 - 1, local8);
			}
			if (arg2 == 3) {
				this.method234(160, local13, local8);
				this.method234(2, local13 - 1, local8);
				this.method234(8, local13, local8 - 1);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method234(65536, local13, local8);
					this.method234(4096, local13, local8 - 1);
				}
				if (arg2 == 1) {
					this.method234(1024, local13, local8);
					this.method234(16384, local13 + 1, local8);
				}
				if (arg2 == 2) {
					this.method234(4096, local13, local8);
					this.method234(65536, local13, local8 + 1);
				}
				if (arg2 == 3) {
					this.method234(16384, local13, local8);
					this.method234(1024, local13 - 1, local8);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method234(512, local13, local8);
					this.method234(8192, local13 + 1, local8 + -1);
				}
				if (arg2 == 1) {
					this.method234(2048, local13, local8);
					this.method234(32768, local13 + 1, local8 + 1);
				}
				if (arg2 == 2) {
					this.method234(8192, local13, local8);
					this.method234(512, local13 - 1, local8 - -1);
				}
				if (arg2 == 3) {
					this.method234(32768, local13, local8);
					this.method234(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method234(66560, local13, local8);
					this.method234(4096, local13, local8 - 1);
					this.method234(16384, local13 + 1, local8);
				}
				if (arg2 == 1) {
					this.method234(5120, local13, local8);
					this.method234(16384, local13 + 1, local8);
					this.method234(65536, local13, local8 + 1);
				}
				if (arg2 == 2) {
					this.method234(20480, local13, local8);
					this.method234(65536, local13, local8 + 1);
					this.method234(1024, local13 - 1, local8);
				}
				if (arg2 == 3) {
					this.method234(81920, local13, local8);
					this.method234(1024, local13 - 1, local8);
					this.method234(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method234(536870912, local13, local8);
				this.method234(33554432, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method234(8388608, local13, local8);
				this.method234(134217728, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method234(33554432, local13, local8);
				this.method234(536870912, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method234(134217728, local13, local8);
				this.method234(8388608, local13 - 1, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method234(4194304, local13, local8);
				this.method234(67108864, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method234(16777216, local13, local8);
				this.method234(268435456, local13 + 1, local8 - -1);
			}
			if (arg2 == 2) {
				this.method234(67108864, local13, local8);
				this.method234(4194304, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method234(268435456, local13, local8);
				this.method234(16777216, local13 - 1, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method234(545259520, local13, local8);
			this.method234(33554432, local13, local8 - 1);
			this.method234(134217728, local13 + 1, local8);
		}
		if (arg2 == 1) {
			this.method234(41943040, local13, local8);
			this.method234(134217728, local13 + 1, local8);
			this.method234(536870912, local13, local8 + 1);
		}
		if (arg2 == 2) {
			this.method234(167772160, local13, local8);
			this.method234(536870912, local13, local8 + 1);
			this.method234(8388608, local13 - 1, local8);
		}
		if (arg2 == 3) {
			this.method234(671088640, local13, local8);
			this.method234(8388608, local13 - 1, local8);
			this.method234(33554432, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg3 && arg5 == arg1) {
				return true;
			}
		} else if (arg3 <= arg0 && arg0 <= arg2 + arg3 - 1 && arg5 >= arg5 && arg5 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(51) int local51 = arg5 - this.anInt336;
		@Pc(56) int local56 = arg1 - this.anInt336;
		@Pc(61) int local61 = arg0 - this.anInt340;
		@Pc(66) int local66 = arg3 - this.anInt340;
		if (arg2 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local61 + 1 == local66 && local51 == local56 && (this.anIntArrayArray1[local66][local56] & 0x80) == 0) {
						return true;
					}
					if (local61 == local66 && local51 - 1 == local56 && (this.anIntArrayArray1[local66][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local66 == local61 - 1 && local51 == local56 && (this.anIntArrayArray1[local66][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 == local66 && local56 == local51 - 1 && (this.anIntArrayArray1[local66][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local61 - 1 == local66 && local56 == local51 && (this.anIntArrayArray1[local66][local56] & 0x8) == 0) {
						return true;
					}
					if (local66 == local61 && local56 == local51 + 1 && (this.anIntArrayArray1[local66][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local61 + 1 == local66 && local56 == local51 && (this.anIntArrayArray1[local66][local56] & 0x80) == 0) {
						return true;
					}
					if (local66 == local61 && local56 == local51 + 1 && (this.anIntArrayArray1[local66][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local66 == local61 && local56 == local51 + 1 && (this.anIntArrayArray1[local66][local56] & 0x20) == 0) {
					return true;
				}
				if (local61 == local66 && local56 == local51 - 1 && (this.anIntArrayArray1[local66][local56] & 0x2) == 0) {
					return true;
				}
				if (local66 == local61 - 1 && local51 == local56 && (this.anIntArrayArray1[local66][local56] & 0x8) == 0) {
					return true;
				}
				if (local66 == local61 + 1 && local56 == local51 && (this.anIntArrayArray1[local66][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(83) int local83 = local66 + arg2 - 1;
			@Pc(90) int local90 = local56 + arg2 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local61 + 1 == local66 && local51 >= local56 && local51 <= local90 && (this.anIntArrayArray1[local66][local51] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local61 && local83 >= local61 && local56 == local51 - arg2 && (this.anIntArrayArray1[local61][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local61 - arg2 == local66 && local56 <= local51 && local51 <= local90 && (this.anIntArrayArray1[local83][local51] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local66 && local61 <= local83 && local56 == local51 - arg2 && (this.anIntArrayArray1[local61][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local66 == local61 - arg2 && local51 >= local56 && local90 >= local51 && (this.anIntArrayArray1[local83][local51] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local66 && local83 >= local61 && local56 == local51 + 1 && (this.anIntArrayArray1[local61][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local66 == local61 + 1 && local51 >= local56 && local51 <= local90 && (this.anIntArrayArray1[local66][local51] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local61 && local61 <= local83 && local51 + 1 == local56 && (this.anIntArrayArray1[local61][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local61 >= local66 && local61 <= local83 && local56 == local51 + 1 && (this.anIntArrayArray1[local61][local56] & 0x20) == 0) {
					return true;
				}
				if (local61 >= local66 && local83 >= local61 && local56 == local51 - arg2 && (this.anIntArrayArray1[local61][local90] & 0x2) == 0) {
					return true;
				}
				if (local66 == local61 - arg2 && local51 >= local56 && local51 <= local90 && (this.anIntArrayArray1[local83][local51] & 0x8) == 0) {
					return true;
				}
				if (local66 == local61 + 1 && local56 <= local51 && local51 <= local90 && (this.anIntArrayArray1[local66][local51] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBIZIIZ)V")
	public void method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt340;
		@Pc(23) int local23 = arg5 - this.anInt336;
		@Pc(39) int local39;
		if (arg4 == 1 || arg4 == 3) {
			local39 = arg2;
			arg2 = arg0;
			arg0 = local39;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (local39 = local18; local39 < arg2 + local18; local39++) {
			if (local39 >= 0 && this.anInt342 > local39) {
				for (@Pc(68) int local68 = local23; local68 < arg0 + local23; local68++) {
					if (local68 >= 0 && local68 < this.anInt348) {
						this.method234(local7, local68, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt336;
		@Pc(19) int local19 = arg0 - this.anInt340;
		this.anIntArrayArray1[local19][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public void method241() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt342; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt348; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt342 - 5 <= local8 || local12 >= this.anInt348 - 5) {
					this.anIntArrayArray1[local8][local12] = -1;
				} else {
					this.anIntArrayArray1[local8][local12] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
	public void method242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt336;
		@Pc(13) int local13 = arg1 - this.anInt340;
		this.anIntArrayArray1[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg1 && arg2 == arg0) {
				return true;
			}
		} else if (arg1 <= arg6 && arg6 <= arg1 + arg4 - 1 && arg0 >= arg0 && arg0 + arg4 - 1 >= arg0) {
			return true;
		}
		@Pc(61) int local61 = arg1 - this.anInt340;
		@Pc(66) int local66 = arg6 - this.anInt340;
		@Pc(71) int local71 = arg0 - this.anInt336;
		@Pc(76) int local76 = arg2 - this.anInt336;
		if (arg4 == 1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					if (local66 - 1 == local61 && local71 == local76) {
						return true;
					}
					if (local66 == local61 && local71 + 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 && local71 - 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 == local66 && local71 + 1 == local76) {
						return true;
					}
					if (local66 - 1 == local61 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 == local66 + 1 && local71 == local76) {
						return true;
					}
					if (local61 == local66 && local71 + 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 && local76 == local71 - 1 && (this.anIntArrayArray1[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 == local66 && local76 == local71 - 1) {
						return true;
					}
					if (local66 - 1 == local61 && local71 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local71 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					if (local66 - 1 == local61 && local76 == local71) {
						return true;
					}
					if (local61 == local66 && local71 + 1 == local76) {
						return true;
					}
					if (local66 + 1 == local61 && local71 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local66 && local71 - 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 == local66 - 1 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 && local71 + 1 == local76) {
						return true;
					}
					if (local66 + 1 == local61 && local71 == local76) {
						return true;
					}
					if (local66 == local61 && local76 == local71 - 1 && (this.anIntArrayArray1[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 - 1 == local61 && local71 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local66 && local76 == local71 + 1 && (this.anIntArrayArray1[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 == local71) {
						return true;
					}
					if (local61 == local66 && local76 == local71 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 - 1 == local61 && local71 == local76) {
						return true;
					}
					if (local61 == local66 && local76 == local71 + 1 && (this.anIntArrayArray1[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local66 && local71 - 1 == local76) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local66 == local61 && local71 + 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x20) == 0) {
					return true;
				}
				if (local66 == local61 && local71 - 1 == local76 && (this.anIntArrayArray1[local61][local76] & 0x2) == 0) {
					return true;
				}
				if (local61 == local66 - 1 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x8) == 0) {
					return true;
				}
				if (local61 == local66 + 1 && local76 == local71 && (this.anIntArrayArray1[local61][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(759) int local759 = arg4 + local61 - 1;
			@Pc(765) int local765 = local76 + arg4 - 1;
			if (arg5 == 0) {
				if (arg3 == 0) {
					if (local66 - arg4 == local61 && local76 <= local71 && local765 >= local71) {
						return true;
					}
					if (local66 >= local61 && local66 <= local759 && local71 + 1 == local76 && (this.anIntArrayArray1[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local759 && local71 - arg4 == local76 && (this.anIntArrayArray1[local66][local765] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 >= local61 && local66 <= local759 && local76 == local71 + 1) {
						return true;
					}
					if (local66 - arg4 == local61 && local71 >= local76 && local71 <= local765 && (this.anIntArrayArray1[local759][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 <= local71 && local71 <= local765 && (this.anIntArrayArray1[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 == local66 + 1 && local76 <= local71 && local71 <= local765) {
						return true;
					}
					if (local66 >= local61 && local66 <= local759 && local76 == local71 + 1 && (this.anIntArrayArray1[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 <= local66 && local759 >= local66 && local76 == local71 - arg4 && (this.anIntArrayArray1[local66][local765] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 <= local66 && local66 <= local759 && local71 - arg4 == local76) {
						return true;
					}
					if (local66 - arg4 == local61 && local71 >= local76 && local765 >= local71 && (this.anIntArrayArray1[local759][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local66 + 1 && local76 <= local71 && local765 >= local71 && (this.anIntArrayArray1[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					if (local61 == local66 - arg4 && local76 <= local71 && local765 >= local71) {
						return true;
					}
					if (local66 >= local61 && local759 >= local66 && local76 == local71 + 1) {
						return true;
					}
					if (local61 == local66 + 1 && local71 >= local76 && local765 >= local71 && (this.anIntArrayArray1[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local61 && local66 <= local759 && local71 - arg4 == local76 && (this.anIntArrayArray1[local66][local765] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 == local66 - arg4 && local76 <= local71 && local71 <= local765 && (this.anIntArrayArray1[local759][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local66 && local759 >= local66 && local76 == local71 + 1) {
						return true;
					}
					if (local66 + 1 == local61 && local76 <= local71 && local71 <= local765) {
						return true;
					}
					if (local66 >= local61 && local759 >= local66 && local71 - arg4 == local76 && (this.anIntArrayArray1[local66][local765] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 - arg4 == local61 && local71 >= local76 && local765 >= local71 && (this.anIntArrayArray1[local759][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local66 && local66 <= local759 && local76 == local71 + 1 && (this.anIntArrayArray1[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local61 && local76 <= local71 && local765 >= local71) {
						return true;
					}
					if (local61 <= local66 && local759 >= local66 && local76 == local71 - arg4) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 == local66 - arg4 && local76 <= local71 && local71 <= local765) {
						return true;
					}
					if (local61 <= local66 && local759 >= local66 && local76 == local71 + 1 && (this.anIntArrayArray1[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local66 + 1 && local71 >= local76 && local765 >= local71 && (this.anIntArrayArray1[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local61 && local66 <= local759 && local76 == local71 - arg4) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local66 >= local61 && local759 >= local66 && local76 == local71 + 1 && (this.anIntArrayArray1[local66][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 <= local66 && local66 <= local759 && local76 == local71 - arg4 && (this.anIntArrayArray1[local66][local765] & 0x2C0102) == 0) {
					return true;
				}
				if (local66 - arg4 == local61 && local76 <= local71 && local765 >= local71 && (this.anIntArrayArray1[local759][local71] & 0x2C0108) == 0) {
					return true;
				}
				if (local61 == local66 + 1 && local71 >= local76 && local765 >= local71 && (this.anIntArrayArray1[local61][local71] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg1 + arg3;
		@Pc(19) int local19 = arg4 + arg7;
		@Pc(23) int local23 = arg0 + arg6;
		@Pc(27) int local27 = arg8 + arg5;
		@Pc(45) int local45;
		@Pc(52) int local52;
		if (local23 == arg1 && (arg2 & 0x2) == 0) {
			local45 = arg8 >= arg4 ? arg8 : arg4;
			local52 = local27 <= local19 ? local27 : local19;
			while (local45 < local52) {
				if ((this.anIntArrayArray1[local23 - this.anInt340 - 1][local45 - this.anInt336] & 0x8) == 0) {
					return true;
				}
				local45++;
			}
		} else if (arg6 == local15 && (arg2 & 0x8) == 0) {
			local45 = arg8 < arg4 ? arg4 : arg8;
			local52 = local19 < local27 ? local19 : local27;
			while (local45 < local52) {
				if ((this.anIntArrayArray1[arg6 - this.anInt340][local45 - this.anInt336] & 0x80) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local27 == arg4 && (arg2 & 0x1) == 0) {
			local45 = arg6 >= arg1 ? arg6 : arg1;
			local52 = local15 < local23 ? local15 : local23;
			while (local45 < local52) {
				if ((this.anIntArrayArray1[local45 - this.anInt340][local27 - this.anInt336 - 1] & 0x2) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local19 == arg8 && (arg2 & 0x4) == 0) {
			local45 = arg6 < arg1 ? arg1 : arg6;
			local52 = local23 > local15 ? local15 : local23;
			while (local52 > local45) {
				if ((this.anIntArrayArray1[local45 - this.anInt340][arg8 - this.anInt336] & 0x20) == 0) {
					return true;
				}
				local45++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIIIIZZ)V")
	public void method245(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt336;
		@Pc(21) int local21 = arg3 - this.anInt340;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method233(local4, local21, 128);
				this.method233(local4, local21 - 1, 8);
			}
			if (arg4 == 1) {
				this.method233(local4, local21, 2);
				this.method233(local4 + 1, local21, 32);
			}
			if (arg4 == 2) {
				this.method233(local4, local21, 8);
				this.method233(local4, local21 + 1, 128);
			}
			if (arg4 == 3) {
				this.method233(local4, local21, 32);
				this.method233(local4 - 1, local21, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method233(local4, local21, 1);
				this.method233(local4 + 1, local21 + -1, 16);
			}
			if (arg4 == 1) {
				this.method233(local4, local21, 4);
				this.method233(local4 + 1, local21 - -1, 64);
			}
			if (arg4 == 2) {
				this.method233(local4, local21, 16);
				this.method233(local4 - 1, local21 + 1, 1);
			}
			if (arg4 == 3) {
				this.method233(local4, local21, 64);
				this.method233(local4 - 1, local21 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method233(local4, local21, 130);
				this.method233(local4, local21 - 1, 8);
				this.method233(local4 + 1, local21, 32);
			}
			if (arg4 == 1) {
				this.method233(local4, local21, 10);
				this.method233(local4 + 1, local21, 32);
				this.method233(local4, local21 + 1, 128);
			}
			if (arg4 == 2) {
				this.method233(local4, local21, 40);
				this.method233(local4, local21 + 1, 128);
				this.method233(local4 - 1, local21, 2);
			}
			if (arg4 == 3) {
				this.method233(local4, local21, 160);
				this.method233(local4 - 1, local21, 2);
				this.method233(local4, local21 - 1, 8);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method233(local4, local21, 65536);
					this.method233(local4, local21 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method233(local4, local21, 1024);
					this.method233(local4 + 1, local21, 16384);
				}
				if (arg4 == 2) {
					this.method233(local4, local21, 4096);
					this.method233(local4, local21 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method233(local4, local21, 16384);
					this.method233(local4 - 1, local21, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method233(local4, local21, 512);
					this.method233(local4 + 1, local21 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method233(local4, local21, 2048);
					this.method233(local4 + 1, local21 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method233(local4, local21, 8192);
					this.method233(local4 - 1, local21 + 1, 512);
				}
				if (arg4 == 3) {
					this.method233(local4, local21, 32768);
					this.method233(local4 - 1, local21 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method233(local4, local21, 66560);
					this.method233(local4, local21 - 1, 4096);
					this.method233(local4 + 1, local21, 16384);
				}
				if (arg4 == 1) {
					this.method233(local4, local21, 5120);
					this.method233(local4 + 1, local21, 16384);
					this.method233(local4, local21 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method233(local4, local21, 20480);
					this.method233(local4, local21 + 1, 65536);
					this.method233(local4 - 1, local21, 1024);
				}
				if (arg4 == 3) {
					this.method233(local4, local21, 81920);
					this.method233(local4 - 1, local21, 1024);
					this.method233(local4, local21 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method233(local4, local21, 536870912);
				this.method233(local4, local21 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method233(local4, local21, 8388608);
				this.method233(local4 + 1, local21, 134217728);
			}
			if (arg4 == 2) {
				this.method233(local4, local21, 33554432);
				this.method233(local4, local21 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method233(local4, local21, 134217728);
				this.method233(local4 - 1, local21, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method233(local4, local21, 4194304);
				this.method233(local4 + 1, local21 + -1, 67108864);
			}
			if (arg4 == 1) {
				this.method233(local4, local21, 16777216);
				this.method233(local4 + 1, local21 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method233(local4, local21, 67108864);
				this.method233(local4 - 1, local21 + 1, 4194304);
			}
			if (arg4 == 3) {
				this.method233(local4, local21, 268435456);
				this.method233(local4 - 1, local21 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method233(local4, local21, 545259520);
			this.method233(local4, local21 - 1, 33554432);
			this.method233(local4 + 1, local21, 134217728);
		}
		if (arg4 == 1) {
			this.method233(local4, local21, 41943040);
			this.method233(local4 + 1, local21, 134217728);
			this.method233(local4, local21 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method233(local4, local21, 167772160);
			this.method233(local4, local21 + 1, 536870912);
			this.method233(local4 - 1, local21, 8388608);
		}
		if (arg4 == 3) {
			this.method233(local4, local21, 671088640);
			this.method233(local4 - 1, local21, 8388608);
			this.method233(local4, local21 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt340;
		@Pc(9) int local9 = arg1 - this.anInt336;
		this.anIntArrayArray1[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBI)V")
	public void method247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt336;
		@Pc(13) int local13 = arg1 - this.anInt340;
		this.anIntArrayArray1[local13][local8] |= 0x200000;
	}
}
