import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class65 {

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	public int anInt2134;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIZIZI)V")
	public void method2116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt2120;
		@Pc(13) int local13 = arg5 - this.anInt2134;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method2123(128, local4, local13);
				this.method2123(8, local4 - 1, local13);
			}
			if (arg0 == 1) {
				this.method2123(2, local4, local13);
				this.method2123(32, local4, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2123(8, local4, local13);
				this.method2123(128, local4 + 1, local13);
			}
			if (arg0 == 3) {
				this.method2123(32, local4, local13);
				this.method2123(2, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method2123(1, local4, local13);
				this.method2123(16, local4 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method2123(4, local4, local13);
				this.method2123(64, local4 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2123(16, local4, local13);
				this.method2123(1, local4 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method2123(64, local4, local13);
				this.method2123(4, local4 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method2123(130, local4, local13);
				this.method2123(8, local4 - 1, local13);
				this.method2123(32, local4, local13 + 1);
			}
			if (arg0 == 1) {
				this.method2123(10, local4, local13);
				this.method2123(32, local4, local13 + 1);
				this.method2123(128, local4 + 1, local13);
			}
			if (arg0 == 2) {
				this.method2123(40, local4, local13);
				this.method2123(128, local4 + 1, local13);
				this.method2123(2, local4, local13 - 1);
			}
			if (arg0 == 3) {
				this.method2123(160, local4, local13);
				this.method2123(2, local4, local13 - 1);
				this.method2123(8, local4 - 1, local13);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method2123(65536, local4, local13);
					this.method2123(4096, local4 - 1, local13);
				}
				if (arg0 == 1) {
					this.method2123(1024, local4, local13);
					this.method2123(16384, local4, local13 + 1);
				}
				if (arg0 == 2) {
					this.method2123(4096, local4, local13);
					this.method2123(65536, local4 + 1, local13);
				}
				if (arg0 == 3) {
					this.method2123(16384, local4, local13);
					this.method2123(1024, local4, local13 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method2123(512, local4, local13);
					this.method2123(8192, local4 - 1, local13 + 1);
				}
				if (arg0 == 1) {
					this.method2123(2048, local4, local13);
					this.method2123(32768, local4 + 1, local13 - -1);
				}
				if (arg0 == 2) {
					this.method2123(8192, local4, local13);
					this.method2123(512, local4 + 1, local13 + -1);
				}
				if (arg0 == 3) {
					this.method2123(32768, local4, local13);
					this.method2123(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method2123(66560, local4, local13);
					this.method2123(4096, local4 - 1, local13);
					this.method2123(16384, local4, local13 + 1);
				}
				if (arg0 == 1) {
					this.method2123(5120, local4, local13);
					this.method2123(16384, local4, local13 + 1);
					this.method2123(65536, local4 + 1, local13);
				}
				if (arg0 == 2) {
					this.method2123(20480, local4, local13);
					this.method2123(65536, local4 + 1, local13);
					this.method2123(1024, local4, local13 - 1);
				}
				if (arg0 == 3) {
					this.method2123(81920, local4, local13);
					this.method2123(1024, local4, local13 - 1);
					this.method2123(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method2123(536870912, local4, local13);
				this.method2123(33554432, local4 - 1, local13);
			}
			if (arg0 == 1) {
				this.method2123(8388608, local4, local13);
				this.method2123(134217728, local4, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2123(33554432, local4, local13);
				this.method2123(536870912, local4 + 1, local13);
			}
			if (arg0 == 3) {
				this.method2123(134217728, local4, local13);
				this.method2123(8388608, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method2123(4194304, local4, local13);
				this.method2123(67108864, local4 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method2123(16777216, local4, local13);
				this.method2123(268435456, local4 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2123(67108864, local4, local13);
				this.method2123(4194304, local4 + 1, local13 - 1);
			}
			if (arg0 == 3) {
				this.method2123(268435456, local4, local13);
				this.method2123(16777216, local4 - 1, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2123(545259520, local4, local13);
			this.method2123(33554432, local4 - 1, local13);
			this.method2123(134217728, local4, local13 + 1);
		}
		if (arg0 == 1) {
			this.method2123(41943040, local4, local13);
			this.method2123(134217728, local4, local13 + 1);
			this.method2123(536870912, local4 + 1, local13);
		}
		if (arg0 == 2) {
			this.method2123(167772160, local4, local13);
			this.method2123(536870912, local4 + 1, local13);
			this.method2123(8388608, local4, local13 - 1);
		}
		if (arg0 == 3) {
			this.method2123(671088640, local4, local13);
			this.method2123(8388608, local4, local13 - 1);
			this.method2123(33554432, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIZI)V")
	public void method2118(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg1 - this.anInt2120;
		@Pc(36) int local36;
		if (arg6 == 1 || arg6 == 3) {
			local36 = arg3;
			arg3 = arg2;
			arg2 = local36;
		}
		@Pc(45) int local45 = arg4 - this.anInt2134;
		for (local36 = local24; local36 < arg3 + local24; local36++) {
			if (local36 >= 0 && local36 < this.anInt2117) {
				for (@Pc(73) int local73 = local45; local73 < local45 + arg2; local73++) {
					if (local73 >= 0 && local73 < this.anInt2131) {
						this.method2119(local7, local73, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBII)V")
	private void method2119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
	public void method2121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2120;
		@Pc(9) int local9 = arg0 - this.anInt2134;
		this.anIntArrayArray29[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
	public void method2122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2134;
		@Pc(13) int local13 = arg0 - this.anInt2120;
		this.anIntArrayArray29[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIBI)V")
	private void method2123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg4 + arg5;
		@Pc(18) int local18 = arg7 + arg8;
		@Pc(22) int local22 = arg2 + arg6;
		@Pc(26) int local26 = arg1 + arg3;
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (arg4 == local22 && (arg0 & 0x2) == 0) {
			local40 = arg7 > arg3 ? arg7 : arg3;
			local47 = local18 >= local26 ? local26 : local18;
			while (local47 > local40) {
				if ((this.anIntArrayArray29[local22 - this.anInt2120 - 1][local40 - this.anInt2134] & 0x8) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local14 == arg6 && (arg0 & 0x8) == 0) {
			local40 = arg3 < arg7 ? arg7 : arg3;
			local47 = local18 < local26 ? local18 : local26;
			while (local47 > local40) {
				if ((this.anIntArrayArray29[arg6 - this.anInt2120][local40 - this.anInt2134] & 0x80) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local26 == arg7 && (arg0 & 0x1) == 0) {
			local40 = arg4 <= arg6 ? arg6 : arg4;
			local47 = local22 > local14 ? local14 : local22;
			while (local47 > local40) {
				if ((this.anIntArrayArray29[local40 - this.anInt2120][local26 - this.anInt2134 - 1] & 0x2) == 0) {
					return true;
				}
				local40++;
			}
		} else if (arg3 == local18 && (arg0 & 0x4) == 0) {
			local40 = arg6 >= arg4 ? arg6 : arg4;
			local47 = local14 >= local22 ? local22 : local14;
			while (local40 < local47) {
				if ((this.anIntArrayArray29[local40 - this.anInt2120][arg3 - this.anInt2134] & 0x20) == 0) {
					return true;
				}
				local40++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static71.method5022(arg2, arg2, arg4, arg5, arg0, arg7, arg1, arg6) ? true : this.method2124(arg3, arg1, arg7, arg5, arg0, arg2, arg6, arg4, arg2);
		}
		@Pc(38) int local38 = arg7 + arg6 - 1;
		@Pc(44) int local44 = arg1 + arg5 - 1;
		if (arg6 <= arg0 && local38 >= arg0 && arg4 >= arg5 && local44 >= arg4) {
			return true;
		} else if (arg0 == arg6 - 1 && arg4 >= arg5 && arg4 <= local44 && (this.anIntArrayArray29[arg0 - this.anInt2120][arg4 - this.anInt2134] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg0 && arg4 >= arg5 && arg4 <= local44 && (this.anIntArrayArray29[arg0 - this.anInt2120][arg4 - this.anInt2134] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg4 && arg0 >= arg6 && local38 >= arg0 && (this.anIntArrayArray29[arg0 - this.anInt2120][arg4 - this.anInt2134] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg4 && arg6 <= arg0 && local38 >= arg0 && (this.anIntArrayArray29[arg0 - this.anInt2120][arg4 - this.anInt2134] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIZZ)V")
	public void method2127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt2120;
		@Pc(13) int local13 = arg1 - this.anInt2134;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2119(128, local13, local8);
				this.method2119(8, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method2119(2, local13, local8);
				this.method2119(32, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method2119(8, local13, local8);
				this.method2119(128, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method2119(32, local13, local8);
				this.method2119(2, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2119(1, local13, local8);
				this.method2119(16, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method2119(4, local13, local8);
				this.method2119(64, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2119(16, local13, local8);
				this.method2119(1, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method2119(64, local13, local8);
				this.method2119(4, local13 - 1, local8 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method2119(130, local13, local8);
				this.method2119(8, local13, local8 - 1);
				this.method2119(32, local13 + 1, local8);
			}
			if (arg2 == 1) {
				this.method2119(10, local13, local8);
				this.method2119(32, local13 + 1, local8);
				this.method2119(128, local13, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2119(40, local13, local8);
				this.method2119(128, local13, local8 + 1);
				this.method2119(2, local13 - 1, local8);
			}
			if (arg2 == 3) {
				this.method2119(160, local13, local8);
				this.method2119(2, local13 - 1, local8);
				this.method2119(8, local13, local8 - 1);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method2119(65536, local13, local8);
					this.method2119(4096, local13, local8 - 1);
				}
				if (arg2 == 1) {
					this.method2119(1024, local13, local8);
					this.method2119(16384, local13 + 1, local8);
				}
				if (arg2 == 2) {
					this.method2119(4096, local13, local8);
					this.method2119(65536, local13, local8 + 1);
				}
				if (arg2 == 3) {
					this.method2119(16384, local13, local8);
					this.method2119(1024, local13 - 1, local8);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method2119(512, local13, local8);
					this.method2119(8192, local13 + 1, local8 - 1);
				}
				if (arg2 == 1) {
					this.method2119(2048, local13, local8);
					this.method2119(32768, local13 + 1, local8 + 1);
				}
				if (arg2 == 2) {
					this.method2119(8192, local13, local8);
					this.method2119(512, local13 - 1, local8 + 1);
				}
				if (arg2 == 3) {
					this.method2119(32768, local13, local8);
					this.method2119(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method2119(66560, local13, local8);
					this.method2119(4096, local13, local8 - 1);
					this.method2119(16384, local13 + 1, local8);
				}
				if (arg2 == 1) {
					this.method2119(5120, local13, local8);
					this.method2119(16384, local13 + 1, local8);
					this.method2119(65536, local13, local8 + 1);
				}
				if (arg2 == 2) {
					this.method2119(20480, local13, local8);
					this.method2119(65536, local13, local8 + 1);
					this.method2119(1024, local13 - 1, local8);
				}
				if (arg2 == 3) {
					this.method2119(81920, local13, local8);
					this.method2119(1024, local13 - 1, local8);
					this.method2119(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method2119(536870912, local13, local8);
				this.method2119(33554432, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method2119(8388608, local13, local8);
				this.method2119(134217728, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method2119(33554432, local13, local8);
				this.method2119(536870912, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method2119(134217728, local13, local8);
				this.method2119(8388608, local13 - 1, local8);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method2119(4194304, local13, local8);
				this.method2119(67108864, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method2119(16777216, local13, local8);
				this.method2119(268435456, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method2119(67108864, local13, local8);
				this.method2119(4194304, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method2119(268435456, local13, local8);
				this.method2119(16777216, local13 - 1, local8 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2119(545259520, local13, local8);
			this.method2119(33554432, local13, local8 - 1);
			this.method2119(134217728, local13 + 1, local8);
		}
		if (arg2 == 1) {
			this.method2119(41943040, local13, local8);
			this.method2119(134217728, local13 + 1, local8);
			this.method2119(536870912, local13, local8 + 1);
		}
		if (arg2 == 2) {
			this.method2119(167772160, local13, local8);
			this.method2119(536870912, local13, local8 + 1);
			this.method2119(8388608, local13 - 1, local8);
		}
		if (arg2 == 3) {
			this.method2119(671088640, local13, local8);
			this.method2119(8388608, local13 - 1, local8);
			this.method2119(33554432, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method2128(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt2120;
		@Pc(23) int local23 = arg1 - this.anInt2134;
		if (arg5) {
			local7 |= 0x40000000;
		}
		for (@Pc(31) int local31 = local18; local31 < local18 + arg2; local31++) {
			if (local31 >= 0 && local31 < this.anInt2117) {
				for (@Pc(48) int local48 = local23; local48 < arg4 + local23; local48++) {
					if (local48 >= 0 && this.anInt2131 > local48) {
						this.method2123(local7, local31, local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(III)V")
	public void method2129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2120;
		@Pc(13) int local13 = arg1 - this.anInt2134;
		this.anIntArrayArray29[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg5 == arg4 && arg1 == arg6) {
				return true;
			}
		} else if (arg5 <= arg4 && arg4 <= arg2 + arg5 - 1 && arg6 <= arg6 && arg2 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(63) int local63 = arg6 - this.anInt2134;
		@Pc(68) int local68 = arg4 - this.anInt2120;
		@Pc(73) int local73 = arg5 - this.anInt2120;
		@Pc(86) int local86 = arg1 - this.anInt2134;
		if (arg2 == 1) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					if (local73 == local68 - 1 && local63 == local86) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 && local86 == local63 - 1 && (this.anIntArrayArray29[local73][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local73 == local68 && local86 == local63 + 1) {
						return true;
					}
					if (local73 == local68 - 1 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 + 1 == local73 && local86 == local63) {
						return true;
					}
					if (local68 == local73 && local86 == local63 + 1 && (this.anIntArrayArray29[local73][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 && local63 - 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 == local68 && local86 == local63 - 1) {
						return true;
					}
					if (local68 - 1 == local73 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local86 == local63 && (this.anIntArrayArray29[local73][local86] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					if (local68 - 1 == local73 && local63 == local86) {
						return true;
					}
					if (local68 == local73 && local86 == local63 + 1) {
						return true;
					}
					if (local68 + 1 == local73 && local86 == local63 && (this.anIntArrayArray29[local73][local86] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local73 == local68 - 1 && local86 == local63 && (this.anIntArrayArray29[local73][local86] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local86) {
						return true;
					}
					if (local68 + 1 == local73 && local86 == local63) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 - 1 == local73 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local86 == local63 + 1 && (this.anIntArrayArray29[local73][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local86 == local63) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local86) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 == local68 - 1 && local63 == local86) {
						return true;
					}
					if (local73 == local68 && local63 + 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local73 && local86 == local63 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local68 == local73 && local63 + 1 == local86 && (this.anIntArrayArray29[local73][local86] & 0x20) == 0) {
					return true;
				}
				if (local68 == local73 && local86 == local63 - 1 && (this.anIntArrayArray29[local73][local86] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local73 && local86 == local63 && (this.anIntArrayArray29[local73][local86] & 0x8) == 0) {
					return true;
				}
				if (local73 == local68 + 1 && local63 == local86 && (this.anIntArrayArray29[local73][local86] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(814) int local814 = arg2 + local73 - 1;
			@Pc(820) int local820 = local86 + arg2 - 1;
			if (arg0 == 0) {
				if (arg3 == 0) {
					if (local68 - arg2 == local73 && local86 <= local63 && local820 >= local63) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local63 + 1 == local86 && (this.anIntArrayArray29[local68][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local63 - arg2 == local86 && (this.anIntArrayArray29[local68][local820] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 >= local73 && local68 <= local814 && local63 + 1 == local86) {
						return true;
					}
					if (local73 == local68 - arg2 && local63 >= local86 && local63 <= local820 && (this.anIntArrayArray29[local814][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local63 >= local86 && local820 >= local63 && (this.anIntArrayArray29[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local73 == local68 + 1 && local63 >= local86 && local820 >= local63) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local63 + 1 == local86 && (this.anIntArrayArray29[local68][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 >= local73 && local68 <= local814 && local86 == local63 - arg2 && (this.anIntArrayArray29[local68][local820] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local68 >= local73 && local68 <= local814 && local63 - arg2 == local86) {
						return true;
					}
					if (local68 - arg2 == local73 && local86 <= local63 && local63 <= local820 && (this.anIntArrayArray29[local814][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local86 <= local63 && local820 >= local63 && (this.anIntArrayArray29[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					if (local68 - arg2 == local73 && local63 >= local86 && local820 >= local63) {
						return true;
					}
					if (local73 <= local68 && local68 <= local814 && local86 == local63 + 1) {
						return true;
					}
					if (local73 == local68 + 1 && local86 <= local63 && local820 >= local63 && (this.anIntArrayArray29[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 >= local73 && local68 <= local814 && local63 - arg2 == local86 && (this.anIntArrayArray29[local68][local820] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 - arg2 == local73 && local86 <= local63 && local63 <= local820 && (this.anIntArrayArray29[local814][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local73 && local68 <= local814 && local86 == local63 + 1) {
						return true;
					}
					if (local73 == local68 + 1 && local63 >= local86 && local820 >= local63) {
						return true;
					}
					if (local68 >= local73 && local68 <= local814 && local63 - arg2 == local86 && (this.anIntArrayArray29[local68][local820] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 - arg2 == local73 && local63 >= local86 && local820 >= local63 && (this.anIntArrayArray29[local814][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local86 == local63 + 1 && (this.anIntArrayArray29[local68][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local63 >= local86 && local63 <= local820) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local86 == local63 - arg2) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local68 - arg2 == local73 && local86 <= local63 && local63 <= local820) {
						return true;
					}
					if (local73 <= local68 && local68 <= local814 && local63 + 1 == local86 && (this.anIntArrayArray29[local68][local86] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local63 >= local86 && local820 >= local63 && (this.anIntArrayArray29[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 >= local73 && local814 >= local68 && local63 - arg2 == local86) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local68 >= local73 && local814 >= local68 && local86 == local63 + 1 && (this.anIntArrayArray29[local68][local86] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 >= local73 && local68 <= local814 && local86 == local63 - arg2 && (this.anIntArrayArray29[local68][local820] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 - arg2 == local73 && local63 >= local86 && local63 <= local820 && (this.anIntArrayArray29[local814][local63] & 0x2C0108) == 0) {
					return true;
				}
				if (local68 + 1 == local73 && local63 >= local86 && local820 >= local63 && (this.anIntArrayArray29[local73][local63] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg4 == arg0 && arg5 == arg6) {
				return true;
			}
		} else if (arg4 <= arg0 && arg0 <= arg1 + arg4 - 1 && arg6 >= arg6 && arg6 + arg1 - 1 >= arg6) {
			return true;
		}
		@Pc(50) int local50 = arg6 - this.anInt2134;
		@Pc(55) int local55 = arg5 - this.anInt2134;
		@Pc(60) int local60 = arg4 - this.anInt2120;
		@Pc(65) int local65 = arg0 - this.anInt2120;
		if (arg1 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local65 + 1 == local60 && local55 == local50 && (this.anIntArrayArray29[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local65 == local60 && local55 == local50 - 1 && (this.anIntArrayArray29[local60][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local60 == local65 - 1 && local55 == local50 && (this.anIntArrayArray29[local60][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local50 - 1 == local55 && (this.anIntArrayArray29[local60][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local65 - 1 == local60 && local55 == local50 && (this.anIntArrayArray29[local60][local55] & 0x8) == 0) {
						return true;
					}
					if (local65 == local60 && local50 + 1 == local55 && (this.anIntArrayArray29[local60][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 + 1 == local60 && local55 == local50 && (this.anIntArrayArray29[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local50 + 1 == local55 && (this.anIntArrayArray29[local60][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local60 == local65 && local50 + 1 == local55 && (this.anIntArrayArray29[local60][local55] & 0x20) == 0) {
					return true;
				}
				if (local65 == local60 && local55 == local50 - 1 && (this.anIntArrayArray29[local60][local55] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local60 && local50 == local55 && (this.anIntArrayArray29[local60][local55] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local60 && local55 == local50 && (this.anIntArrayArray29[local60][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(424) int local424 = arg1 + local60 - 1;
			@Pc(430) int local430 = arg1 + local55 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local60 == local65 + 1 && local50 >= local55 && local50 <= local430 && (this.anIntArrayArray29[local60][local50] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local60 && local424 >= local65 && local50 - arg1 == local55 && (this.anIntArrayArray29[local65][local430] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local60 == local65 - arg1 && local50 >= local55 && local430 >= local50 && (this.anIntArrayArray29[local424][local50] & 0x8) == 0) {
						return true;
					}
					if (local60 <= local65 && local65 <= local424 && local50 - arg1 == local55 && (this.anIntArrayArray29[local65][local430] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local60 == local65 - arg1 && local50 >= local55 && local430 >= local50 && (this.anIntArrayArray29[local424][local50] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local424 && local50 + 1 == local55 && (this.anIntArrayArray29[local65][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 + 1 == local60 && local55 <= local50 && local50 <= local430 && (this.anIntArrayArray29[local60][local50] & 0x80) == 0) {
						return true;
					}
					if (local60 <= local65 && local65 <= local424 && local55 == local50 + 1 && (this.anIntArrayArray29[local65][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 >= local60 && local65 <= local424 && local50 + 1 == local55 && (this.anIntArrayArray29[local65][local55] & 0x20) == 0) {
					return true;
				}
				if (local60 <= local65 && local424 >= local65 && local55 == local50 - arg1 && (this.anIntArrayArray29[local65][local430] & 0x2) == 0) {
					return true;
				}
				if (local65 - arg1 == local60 && local50 >= local55 && local430 >= local50 && (this.anIntArrayArray29[local424][local50] & 0x8) == 0) {
					return true;
				}
				if (local60 == local65 + 1 && local55 <= local50 && local50 <= local430 && (this.anIntArrayArray29[local60][local50] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)V")
	public void method2133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2120;
		@Pc(13) int local13 = arg1 - this.anInt2134;
		this.anIntArrayArray29[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public void method2134() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2117; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2131; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt2117 - 5 <= local7 || local11 >= this.anInt2131 - 5) {
					this.anIntArrayArray29[local7][local11] = -1;
				} else {
					this.anIntArrayArray29[local7][local11] = 2097152;
				}
			}
		}
	}
}
