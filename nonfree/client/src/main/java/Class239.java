import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class239 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public int anInt6443;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
	public int anInt6445;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	public int anInt6454;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	public void method5547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6445;
		@Pc(13) int local13 = arg1 - this.anInt6436;
		this.anIntArrayArray54[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg1 == arg2 && arg0 == arg4) {
				return true;
			}
		} else if (arg2 <= arg1 && arg1 <= arg2 + arg6 - 1 && arg0 <= arg0 && arg0 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg1 - this.anInt6436;
		@Pc(60) int local60 = arg0 - this.anInt6445;
		@Pc(65) int local65 = arg4 - this.anInt6445;
		@Pc(70) int local70 = arg2 - this.anInt6436;
		if (arg6 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local70 == local55 + 1 && local65 == local60 && (this.anIntArrayArray54[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 == local55 && local60 - 1 == local65 && (this.anIntArrayArray54[local70][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local55 - 1 == local70 && local60 == local65 && (this.anIntArrayArray54[local70][local65] & 0x8) == 0) {
						return true;
					}
					if (local55 == local70 && local65 == local60 - 1 && (this.anIntArrayArray54[local70][local65] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local55 - 1 == local70 && local65 == local60 && (this.anIntArrayArray54[local70][local65] & 0x8) == 0) {
						return true;
					}
					if (local70 == local55 && local65 == local60 + 1 && (this.anIntArrayArray54[local70][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local55 + 1 == local70 && local60 == local65 && (this.anIntArrayArray54[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 == local55 && local60 + 1 == local65 && (this.anIntArrayArray54[local70][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local70 == local55 && local60 + 1 == local65 && (this.anIntArrayArray54[local70][local65] & 0x20) == 0) {
					return true;
				}
				if (local70 == local55 && local60 - 1 == local65 && (this.anIntArrayArray54[local70][local65] & 0x2) == 0) {
					return true;
				}
				if (local70 == local55 - 1 && local60 == local65 && (this.anIntArrayArray54[local70][local65] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local70 && local65 == local60 && (this.anIntArrayArray54[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(415) int local415 = arg6 + local70 - 1;
			@Pc(421) int local421 = arg6 + local65 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local70 == local55 + 1 && local65 <= local60 && local421 >= local60 && (this.anIntArrayArray54[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local55 && local415 >= local55 && local65 == local60 - arg6 && (this.anIntArrayArray54[local55][local421] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local55 - arg6 == local70 && local65 <= local60 && local421 >= local60 && (this.anIntArrayArray54[local415][local60] & 0x8) == 0) {
						return true;
					}
					if (local55 >= local70 && local55 <= local415 && local65 == local60 - arg6 && (this.anIntArrayArray54[local55][local421] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local55 - arg6 && local60 >= local65 && local60 <= local421 && (this.anIntArrayArray54[local415][local60] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local55 && local55 <= local415 && local60 + 1 == local65 && (this.anIntArrayArray54[local55][local65] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local55 + 1 == local70 && local60 >= local65 && local60 <= local421 && (this.anIntArrayArray54[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local55 && local415 >= local55 && local65 == local60 + 1 && (this.anIntArrayArray54[local55][local65] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local70 <= local55 && local415 >= local55 && local65 == local60 + 1 && (this.anIntArrayArray54[local55][local65] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local55 && local55 <= local415 && local60 - arg6 == local65 && (this.anIntArrayArray54[local55][local421] & 0x2) == 0) {
					return true;
				}
				if (local70 == local55 - arg6 && local60 >= local65 && local60 <= local421 && (this.anIntArrayArray54[local415][local60] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local70 && local60 >= local65 && local60 <= local421 && (this.anIntArrayArray54[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIIZ)V")
	public void method5549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(28) int local28 = arg1 - this.anInt6436;
		@Pc(33) int local33 = arg3 - this.anInt6445;
		for (@Pc(35) int local35 = local28; local35 < local28 + arg4; local35++) {
			if (local35 >= 0 && local35 < this.anInt6454) {
				for (@Pc(49) int local49 = local33; local49 < local33 + arg0; local49++) {
					if (local49 >= 0 && local49 < this.anInt6443) {
						this.method5565(local35, local49, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 > 1) {
			return Static159.method2669(arg7, arg7, arg3, arg6, arg2, arg0, arg4, arg1) ? true : this.method5556(arg7, arg7, arg1, arg6, arg3, arg5, arg0, arg4, arg2);
		}
		@Pc(38) int local38 = arg1 + arg0 - 1;
		@Pc(61) int local61 = arg6 + arg3 - 1;
		if (arg2 >= arg0 && arg2 <= local38 && arg4 >= arg6 && arg4 <= local61) {
			return true;
		} else if (arg2 == arg0 - 1 && arg4 >= arg6 && local61 >= arg4 && (this.anIntArrayArray54[arg2 - this.anInt6436][arg4 - this.anInt6445] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg2 && arg6 <= arg4 && arg4 <= local61 && (this.anIntArrayArray54[arg2 - this.anInt6436][arg4 - this.anInt6445] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg6 - 1 && arg0 <= arg2 && arg2 <= local38 && (this.anIntArrayArray54[arg2 - this.anInt6436][arg4 - this.anInt6445] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local61 + 1 == arg4 && arg2 >= arg0 && local38 >= arg2 && (this.anIntArrayArray54[arg2 - this.anInt6436][arg4 - this.anInt6445] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZIIIIII)V")
	public void method5552(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = 256;
		if (arg1) {
			local12 = 131328;
		}
		@Pc(23) int local23 = arg6 - this.anInt6436;
		@Pc(33) int local33;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg2;
			arg2 = arg3;
			arg3 = local33;
		}
		@Pc(42) int local42 = arg5 - this.anInt6445;
		if (arg0) {
			local12 |= 0x40000000;
		}
		for (local33 = local23; local33 < local23 + arg2; local33++) {
			if (local33 >= 0 && this.anInt6454 > local33) {
				for (@Pc(60) int local60 = local42; local60 < local42 + arg3; local60++) {
					if (local60 >= 0 && this.anInt6443 > local60) {
						this.method5554(local12, local33, local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIII)V")
	private void method5554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray54[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIZIZ)V")
	public void method5555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt6445;
		@Pc(13) int local13 = arg0 - this.anInt6436;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method5554(128, local13, local4);
				this.method5554(8, local13 - 1, local4);
			}
			if (arg2 == 1) {
				this.method5554(2, local13, local4);
				this.method5554(32, local13, local4 + 1);
			}
			if (arg2 == 2) {
				this.method5554(8, local13, local4);
				this.method5554(128, local13 + 1, local4);
			}
			if (arg2 == 3) {
				this.method5554(32, local13, local4);
				this.method5554(2, local13, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method5554(1, local13, local4);
				this.method5554(16, local13 - 1, local4 + 1);
			}
			if (arg2 == 1) {
				this.method5554(4, local13, local4);
				this.method5554(64, local13 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method5554(16, local13, local4);
				this.method5554(1, local13 + 1, local4 + -1);
			}
			if (arg2 == 3) {
				this.method5554(64, local13, local4);
				this.method5554(4, local13 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method5554(130, local13, local4);
				this.method5554(8, local13 - 1, local4);
				this.method5554(32, local13, local4 + 1);
			}
			if (arg2 == 1) {
				this.method5554(10, local13, local4);
				this.method5554(32, local13, local4 + 1);
				this.method5554(128, local13 + 1, local4);
			}
			if (arg2 == 2) {
				this.method5554(40, local13, local4);
				this.method5554(128, local13 + 1, local4);
				this.method5554(2, local13, local4 - 1);
			}
			if (arg2 == 3) {
				this.method5554(160, local13, local4);
				this.method5554(2, local13, local4 - 1);
				this.method5554(8, local13 - 1, local4);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method5554(65536, local13, local4);
					this.method5554(4096, local13 - 1, local4);
				}
				if (arg2 == 1) {
					this.method5554(1024, local13, local4);
					this.method5554(16384, local13, local4 + 1);
				}
				if (arg2 == 2) {
					this.method5554(4096, local13, local4);
					this.method5554(65536, local13 + 1, local4);
				}
				if (arg2 == 3) {
					this.method5554(16384, local13, local4);
					this.method5554(1024, local13, local4 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method5554(512, local13, local4);
					this.method5554(8192, local13 - 1, local4 + 1);
				}
				if (arg2 == 1) {
					this.method5554(2048, local13, local4);
					this.method5554(32768, local13 + 1, local4 - -1);
				}
				if (arg2 == 2) {
					this.method5554(8192, local13, local4);
					this.method5554(512, local13 + 1, local4 - 1);
				}
				if (arg2 == 3) {
					this.method5554(32768, local13, local4);
					this.method5554(2048, local13 - 1, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method5554(66560, local13, local4);
					this.method5554(4096, local13 - 1, local4);
					this.method5554(16384, local13, local4 + 1);
				}
				if (arg2 == 1) {
					this.method5554(5120, local13, local4);
					this.method5554(16384, local13, local4 + 1);
					this.method5554(65536, local13 + 1, local4);
				}
				if (arg2 == 2) {
					this.method5554(20480, local13, local4);
					this.method5554(65536, local13 + 1, local4);
					this.method5554(1024, local13, local4 - 1);
				}
				if (arg2 == 3) {
					this.method5554(81920, local13, local4);
					this.method5554(1024, local13, local4 - 1);
					this.method5554(4096, local13 - 1, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method5554(536870912, local13, local4);
				this.method5554(33554432, local13 - 1, local4);
			}
			if (arg2 == 1) {
				this.method5554(8388608, local13, local4);
				this.method5554(134217728, local13, local4 + 1);
			}
			if (arg2 == 2) {
				this.method5554(33554432, local13, local4);
				this.method5554(536870912, local13 + 1, local4);
			}
			if (arg2 == 3) {
				this.method5554(134217728, local13, local4);
				this.method5554(8388608, local13, local4 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method5554(4194304, local13, local4);
				this.method5554(67108864, local13 - 1, local4 + 1);
			}
			if (arg2 == 1) {
				this.method5554(16777216, local13, local4);
				this.method5554(268435456, local13 + 1, local4 - -1);
			}
			if (arg2 == 2) {
				this.method5554(67108864, local13, local4);
				this.method5554(4194304, local13 + 1, local4 + -1);
			}
			if (arg2 == 3) {
				this.method5554(268435456, local13, local4);
				this.method5554(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method5554(545259520, local13, local4);
			this.method5554(33554432, local13 - 1, local4);
			this.method5554(134217728, local13, local4 + 1);
		}
		if (arg2 == 1) {
			this.method5554(41943040, local13, local4);
			this.method5554(134217728, local13, local4 + 1);
			this.method5554(536870912, local13 + 1, local4);
		}
		if (arg2 == 2) {
			this.method5554(167772160, local13, local4);
			this.method5554(536870912, local13 + 1, local4);
			this.method5554(8388608, local13, local4 - 1);
		}
		if (arg2 == 3) {
			this.method5554(671088640, local13, local4);
			this.method5554(8388608, local13, local4 - 1);
			this.method5554(33554432, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg8;
		@Pc(13) int local13 = arg7 + arg1;
		@Pc(18) int local18 = arg6 + arg2;
		@Pc(22) int local22 = arg4 + arg3;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (local18 == arg8 && (arg5 & 0x2) == 0) {
			local40 = arg7 <= arg3 ? arg3 : arg7;
			local51 = local22 > local13 ? local13 : local22;
			while (local40 < local51) {
				if ((this.anIntArrayArray54[local18 - this.anInt6436 - 1][local40 - this.anInt6445] & 0x8) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local9 == arg6 && (arg5 & 0x8) == 0) {
			local40 = arg3 < arg7 ? arg7 : arg3;
			local51 = local13 >= local22 ? local22 : local13;
			while (local51 > local40) {
				if ((this.anIntArrayArray54[arg6 - this.anInt6436][local40 - this.anInt6445] & 0x80) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local22 == arg7 && (arg5 & 0x1) == 0) {
			local40 = arg8 > arg6 ? arg8 : arg6;
			local51 = local18 > local9 ? local9 : local18;
			while (local51 > local40) {
				if ((this.anIntArrayArray54[local40 - this.anInt6436][local22 - this.anInt6445 - 1] & 0x2) == 0) {
					return true;
				}
				local40++;
			}
		} else if (arg3 == local13 && (arg5 & 0x4) == 0) {
			local40 = arg8 <= arg6 ? arg6 : arg8;
			local51 = local18 > local9 ? local9 : local18;
			while (local40 < local51) {
				if ((this.anIntArrayArray54[local40 - this.anInt6436][arg3 - this.anInt6445] & 0x20) == 0) {
					return true;
				}
				local40++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
	public void method5558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt6445;
		@Pc(17) int local17 = arg1 - this.anInt6436;
		this.anIntArrayArray54[local17][local12] |= 0x200000;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V")
	public void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6445;
		@Pc(17) int local17 = arg0 - this.anInt6436;
		this.anIntArrayArray54[local17][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(IIB)V")
	public void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6436;
		@Pc(17) int local17 = arg0 - this.anInt6445;
		this.anIntArrayArray54[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
	public void method5561() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6454; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt6443; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt6454 - 5 || this.anInt6443 - 5 <= local7) {
					this.anIntArrayArray54[local3][local7] = -1;
				} else {
					this.anIntArrayArray54[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZZIIBI)V")
	public void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 - this.anInt6436;
		@Pc(19) int local19 = arg5 - this.anInt6445;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method5565(local14, local19, 128);
				this.method5565(local14 - 1, local19, 8);
			}
			if (arg0 == 1) {
				this.method5565(local14, local19, 2);
				this.method5565(local14, local19 + 1, 32);
			}
			if (arg0 == 2) {
				this.method5565(local14, local19, 8);
				this.method5565(local14 + 1, local19, 128);
			}
			if (arg0 == 3) {
				this.method5565(local14, local19, 32);
				this.method5565(local14, local19 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method5565(local14, local19, 1);
				this.method5565(local14 - 1, local19 + 1, 16);
			}
			if (arg0 == 1) {
				this.method5565(local14, local19, 4);
				this.method5565(local14 + 1, local19 + 1, 64);
			}
			if (arg0 == 2) {
				this.method5565(local14, local19, 16);
				this.method5565(local14 + 1, local19 + -1, 1);
			}
			if (arg0 == 3) {
				this.method5565(local14, local19, 64);
				this.method5565(local14 - 1, local19 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method5565(local14, local19, 130);
				this.method5565(local14 - 1, local19, 8);
				this.method5565(local14, local19 + 1, 32);
			}
			if (arg0 == 1) {
				this.method5565(local14, local19, 10);
				this.method5565(local14, local19 + 1, 32);
				this.method5565(local14 + 1, local19, 128);
			}
			if (arg0 == 2) {
				this.method5565(local14, local19, 40);
				this.method5565(local14 + 1, local19, 128);
				this.method5565(local14, local19 - 1, 2);
			}
			if (arg0 == 3) {
				this.method5565(local14, local19, 160);
				this.method5565(local14, local19 - 1, 2);
				this.method5565(local14 - 1, local19, 8);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method5565(local14, local19, 65536);
					this.method5565(local14 - 1, local19, 4096);
				}
				if (arg0 == 1) {
					this.method5565(local14, local19, 1024);
					this.method5565(local14, local19 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method5565(local14, local19, 4096);
					this.method5565(local14 + 1, local19, 65536);
				}
				if (arg0 == 3) {
					this.method5565(local14, local19, 16384);
					this.method5565(local14, local19 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method5565(local14, local19, 512);
					this.method5565(local14 - 1, local19 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method5565(local14, local19, 2048);
					this.method5565(local14 + 1, local19 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method5565(local14, local19, 8192);
					this.method5565(local14 + 1, local19 + -1, 512);
				}
				if (arg0 == 3) {
					this.method5565(local14, local19, 32768);
					this.method5565(local14 - 1, local19 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method5565(local14, local19, 66560);
					this.method5565(local14 - 1, local19, 4096);
					this.method5565(local14, local19 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method5565(local14, local19, 5120);
					this.method5565(local14, local19 + 1, 16384);
					this.method5565(local14 + 1, local19, 65536);
				}
				if (arg0 == 2) {
					this.method5565(local14, local19, 20480);
					this.method5565(local14 + 1, local19, 65536);
					this.method5565(local14, local19 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method5565(local14, local19, 81920);
					this.method5565(local14, local19 - 1, 1024);
					this.method5565(local14 - 1, local19, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method5565(local14, local19, 536870912);
				this.method5565(local14 - 1, local19, 33554432);
			}
			if (arg0 == 1) {
				this.method5565(local14, local19, 8388608);
				this.method5565(local14, local19 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method5565(local14, local19, 33554432);
				this.method5565(local14 + 1, local19, 536870912);
			}
			if (arg0 == 3) {
				this.method5565(local14, local19, 134217728);
				this.method5565(local14, local19 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method5565(local14, local19, 4194304);
				this.method5565(local14 - 1, local19 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method5565(local14, local19, 16777216);
				this.method5565(local14 + 1, local19 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method5565(local14, local19, 67108864);
				this.method5565(local14 + 1, local19 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method5565(local14, local19, 268435456);
				this.method5565(local14 - 1, local19 - 1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5565(local14, local19, 545259520);
			this.method5565(local14 - 1, local19, 33554432);
			this.method5565(local14, local19 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method5565(local14, local19, 41943040);
			this.method5565(local14, local19 + 1, 134217728);
			this.method5565(local14 + 1, local19, 536870912);
		}
		if (arg0 == 2) {
			this.method5565(local14, local19, 167772160);
			this.method5565(local14 + 1, local19, 536870912);
			this.method5565(local14, local19 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method5565(local14, local19, 671088640);
			this.method5565(local14, local19 - 1, 8388608);
			this.method5565(local14 - 1, local19, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg5 && arg0 == arg3) {
				return true;
			}
		} else if (arg5 >= arg6 && arg2 + arg6 - 1 >= arg5 && arg3 >= arg3 && arg3 + arg2 - 1 >= arg3) {
			return true;
		}
		@Pc(57) int local57 = arg5 - this.anInt6436;
		@Pc(62) int local62 = arg3 - this.anInt6445;
		@Pc(67) int local67 = arg0 - this.anInt6445;
		@Pc(72) int local72 = arg6 - this.anInt6436;
		if (arg2 == 1) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local57 - 1 == local72 && local67 == local62) {
						return true;
					}
					if (local72 == local57 && local67 == local62 + 1 && (this.anIntArrayArray54[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local57 && local67 == local62 - 1 && (this.anIntArrayArray54[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local57 == local72 && local67 == local62 + 1) {
						return true;
					}
					if (local57 - 1 == local72 && local62 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local57 + 1 && local62 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local57 + 1 == local72 && local67 == local62) {
						return true;
					}
					if (local72 == local57 && local62 + 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local72 && local62 - 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local57 == local72 && local67 == local62 - 1) {
						return true;
					}
					if (local57 - 1 == local72 && local67 == local62 && (this.anIntArrayArray54[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local72 && local67 == local62 && (this.anIntArrayArray54[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					if (local72 == local57 - 1 && local62 == local67) {
						return true;
					}
					if (local57 == local72 && local67 == local62 + 1) {
						return true;
					}
					if (local72 == local57 + 1 && local62 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local57 && local62 - 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local57 - 1 == local72 && local67 == local62 && (this.anIntArrayArray54[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local72 && local67 == local62 + 1) {
						return true;
					}
					if (local72 == local57 + 1 && local62 == local67) {
						return true;
					}
					if (local57 == local72 && local62 - 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local72 == local57 - 1 && local67 == local62 && (this.anIntArrayArray54[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local57 && local62 + 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local72 && local62 == local67) {
						return true;
					}
					if (local72 == local57 && local62 - 1 == local67) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local57 - 1 == local72 && local67 == local62) {
						return true;
					}
					if (local72 == local57 && local67 == local62 + 1 && (this.anIntArrayArray54[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local72 && local62 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local57 && local67 == local62 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local57 == local72 && local62 + 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local57 == local72 && local62 - 1 == local67 && (this.anIntArrayArray54[local72][local67] & 0x2) == 0) {
					return true;
				}
				if (local72 == local57 - 1 && local62 == local67 && (this.anIntArrayArray54[local72][local67] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local72 && local67 == local62 && (this.anIntArrayArray54[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = local72 + arg2 - 1;
			@Pc(90) int local90 = local67 + arg2 - 1;
			if (arg4 == 0) {
				if (arg1 == 0) {
					if (local72 == local57 - arg2 && local67 <= local62 && local62 <= local90) {
						return true;
					}
					if (local72 <= local57 && local57 <= local84 && local62 + 1 == local67 && (this.anIntArrayArray54[local57][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local57 && local57 <= local84 && local62 - arg2 == local67 && (this.anIntArrayArray54[local57][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local57 >= local72 && local57 <= local84 && local62 + 1 == local67) {
						return true;
					}
					if (local57 - arg2 == local72 && local67 <= local62 && local62 <= local90 && (this.anIntArrayArray54[local84][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local57 + 1 && local62 >= local67 && local90 >= local62 && (this.anIntArrayArray54[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local57 + 1 == local72 && local62 >= local67 && local90 >= local62) {
						return true;
					}
					if (local57 >= local72 && local57 <= local84 && local62 + 1 == local67 && (this.anIntArrayArray54[local57][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 <= local57 && local84 >= local57 && local62 - arg2 == local67 && (this.anIntArrayArray54[local57][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local57 >= local72 && local57 <= local84 && local62 - arg2 == local67) {
						return true;
					}
					if (local57 - arg2 == local72 && local67 <= local62 && local90 >= local62 && (this.anIntArrayArray54[local84][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local72 && local62 >= local67 && local90 >= local62 && (this.anIntArrayArray54[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					if (local72 == local57 - arg2 && local67 <= local62 && local62 <= local90) {
						return true;
					}
					if (local57 >= local72 && local84 >= local57 && local67 == local62 + 1) {
						return true;
					}
					if (local57 + 1 == local72 && local67 <= local62 && local90 >= local62 && (this.anIntArrayArray54[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local57 && local84 >= local57 && local67 == local62 - arg2 && (this.anIntArrayArray54[local57][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local72 == local57 - arg2 && local62 >= local67 && local90 >= local62 && (this.anIntArrayArray54[local84][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local57 && local84 >= local57 && local62 + 1 == local67) {
						return true;
					}
					if (local57 + 1 == local72 && local62 >= local67 && local90 >= local62) {
						return true;
					}
					if (local72 <= local57 && local57 <= local84 && local62 - arg2 == local67 && (this.anIntArrayArray54[local57][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local57 - arg2 == local72 && local62 >= local67 && local62 <= local90 && (this.anIntArrayArray54[local84][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 >= local72 && local57 <= local84 && local62 + 1 == local67 && (this.anIntArrayArray54[local57][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local57 + 1 && local67 <= local62 && local62 <= local90) {
						return true;
					}
					if (local72 <= local57 && local84 >= local57 && local62 - arg2 == local67) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local57 - arg2 == local72 && local67 <= local62 && local62 <= local90) {
						return true;
					}
					if (local57 >= local72 && local84 >= local57 && local62 + 1 == local67 && (this.anIntArrayArray54[local57][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local57 + 1 && local67 <= local62 && local62 <= local90 && (this.anIntArrayArray54[local72][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 >= local72 && local84 >= local57 && local67 == local62 - arg2) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local72 <= local57 && local57 <= local84 && local62 + 1 == local67 && (this.anIntArrayArray54[local57][local67] & 0x2C0120) == 0) {
					return true;
				}
				if (local72 <= local57 && local84 >= local57 && local67 == local62 - arg2 && (this.anIntArrayArray54[local57][local90] & 0x2C0102) == 0) {
					return true;
				}
				if (local72 == local57 - arg2 && local67 <= local62 && local90 >= local62 && (this.anIntArrayArray54[local84][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local57 + 1 == local72 && local67 <= local62 && local62 <= local90 && (this.anIntArrayArray54[local72][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIBI)V")
	private void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray54[arg0][arg1] |= arg2;
	}
}
