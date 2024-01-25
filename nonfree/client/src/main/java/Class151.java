import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class151 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public int anInt4563;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public int anInt4571;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public int anInt4572;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray128;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIZIII)V")
	public void method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(37) int local37;
		if (arg5 == 1 || arg5 == 3) {
			local37 = arg6;
			arg6 = arg0;
			arg0 = local37;
		}
		@Pc(46) int local46 = arg3 - this.anInt4563;
		@Pc(51) int local51 = arg1 - this.anInt4572;
		for (local37 = local46; local37 < arg6 + local46; local37++) {
			if (local37 >= 0 && this.anInt4571 > local37) {
				for (@Pc(67) int local67 = local51; local67 < local51 + arg0; local67++) {
					if (local67 >= 0 && this.anInt4566 > local67) {
						this.method4096(local67, local37, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	public void method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt4572;
		@Pc(18) int local18 = arg0 - this.anInt4563;
		this.anIntArrayArray128[local18][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	private void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray128[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIZZI)V")
	public void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt4572;
		@Pc(9) int local9 = arg2 - this.anInt4563;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4094(128, local9, local4);
				this.method4094(8, local9 - 1, local4);
			}
			if (arg0 == 1) {
				this.method4094(2, local9, local4);
				this.method4094(32, local9, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4094(8, local9, local4);
				this.method4094(128, local9 + 1, local4);
			}
			if (arg0 == 3) {
				this.method4094(32, local9, local4);
				this.method4094(2, local9, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4094(1, local9, local4);
				this.method4094(16, local9 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4094(4, local9, local4);
				this.method4094(64, local9 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4094(16, local9, local4);
				this.method4094(1, local9 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method4094(64, local9, local4);
				this.method4094(4, local9 - 1, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method4094(130, local9, local4);
				this.method4094(8, local9 - 1, local4);
				this.method4094(32, local9, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4094(10, local9, local4);
				this.method4094(32, local9, local4 + 1);
				this.method4094(128, local9 + 1, local4);
			}
			if (arg0 == 2) {
				this.method4094(40, local9, local4);
				this.method4094(128, local9 + 1, local4);
				this.method4094(2, local9, local4 - 1);
			}
			if (arg0 == 3) {
				this.method4094(160, local9, local4);
				this.method4094(2, local9, local4 - 1);
				this.method4094(8, local9 - 1, local4);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method4094(65536, local9, local4);
					this.method4094(4096, local9 - 1, local4);
				}
				if (arg0 == 1) {
					this.method4094(1024, local9, local4);
					this.method4094(16384, local9, local4 + 1);
				}
				if (arg0 == 2) {
					this.method4094(4096, local9, local4);
					this.method4094(65536, local9 + 1, local4);
				}
				if (arg0 == 3) {
					this.method4094(16384, local9, local4);
					this.method4094(1024, local9, local4 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method4094(512, local9, local4);
					this.method4094(8192, local9 - 1, local4 + 1);
				}
				if (arg0 == 1) {
					this.method4094(2048, local9, local4);
					this.method4094(32768, local9 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method4094(8192, local9, local4);
					this.method4094(512, local9 + 1, local4 + -1);
				}
				if (arg0 == 3) {
					this.method4094(32768, local9, local4);
					this.method4094(2048, local9 - 1, local4 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method4094(66560, local9, local4);
					this.method4094(4096, local9 - 1, local4);
					this.method4094(16384, local9, local4 + 1);
				}
				if (arg0 == 1) {
					this.method4094(5120, local9, local4);
					this.method4094(16384, local9, local4 + 1);
					this.method4094(65536, local9 + 1, local4);
				}
				if (arg0 == 2) {
					this.method4094(20480, local9, local4);
					this.method4094(65536, local9 + 1, local4);
					this.method4094(1024, local9, local4 - 1);
				}
				if (arg0 == 3) {
					this.method4094(81920, local9, local4);
					this.method4094(1024, local9, local4 - 1);
					this.method4094(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4094(536870912, local9, local4);
				this.method4094(33554432, local9 - 1, local4);
			}
			if (arg0 == 1) {
				this.method4094(8388608, local9, local4);
				this.method4094(134217728, local9, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4094(33554432, local9, local4);
				this.method4094(536870912, local9 + 1, local4);
			}
			if (arg0 == 3) {
				this.method4094(134217728, local9, local4);
				this.method4094(8388608, local9, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4094(4194304, local9, local4);
				this.method4094(67108864, local9 - 1, local4 + 1);
			}
			if (arg0 == 1) {
				this.method4094(16777216, local9, local4);
				this.method4094(268435456, local9 + 1, local4 + 1);
			}
			if (arg0 == 2) {
				this.method4094(67108864, local9, local4);
				this.method4094(4194304, local9 + 1, local4 + -1);
			}
			if (arg0 == 3) {
				this.method4094(268435456, local9, local4);
				this.method4094(16777216, local9 - 1, local4 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4094(545259520, local9, local4);
			this.method4094(33554432, local9 - 1, local4);
			this.method4094(134217728, local9, local4 + 1);
		}
		if (arg0 == 1) {
			this.method4094(41943040, local9, local4);
			this.method4094(134217728, local9, local4 + 1);
			this.method4094(536870912, local9 + 1, local4);
		}
		if (arg0 == 2) {
			this.method4094(167772160, local9, local4);
			this.method4094(536870912, local9 + 1, local4);
			this.method4094(8388608, local9, local4 - 1);
		}
		if (arg0 == 3) {
			this.method4094(671088640, local9, local4);
			this.method4094(8388608, local9, local4 - 1);
			this.method4094(33554432, local9 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IIII)V")
	private void method4096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray128[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4563;
		@Pc(13) int local13 = arg1 - this.anInt4572;
		this.anIntArrayArray128[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg3 + arg7;
		@Pc(18) int local18 = arg6 + arg5;
		@Pc(23) int local23 = arg4 + arg2;
		@Pc(27) int local27 = arg8 + arg0;
		@Pc(73) int local73;
		@Pc(80) int local80;
		if (arg7 == local23 && (arg1 & 0x2) == 0) {
			local73 = arg5 <= arg8 ? arg8 : arg5;
			local80 = local18 >= local27 ? local27 : local18;
			while (local73 < local80) {
				if ((this.anIntArrayArray128[local23 - this.anInt4563 - 1][local73 - this.anInt4572] & 0x8) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local14 == arg4 && (arg1 & 0x8) == 0) {
			local73 = arg8 >= arg5 ? arg8 : arg5;
			local80 = local27 > local18 ? local18 : local27;
			while (local80 > local73) {
				if ((this.anIntArrayArray128[arg4 - this.anInt4563][local73 - this.anInt4572] & 0x80) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local27 == arg5 && (arg1 & 0x1) == 0) {
			local73 = arg7 <= arg4 ? arg4 : arg7;
			local80 = local23 > local14 ? local14 : local23;
			while (local73 < local80) {
				if ((this.anIntArrayArray128[local73 - this.anInt4563][local27 - this.anInt4572 - 1] & 0x2) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local18 == arg8 && (arg1 & 0x4) == 0) {
			local73 = arg4 >= arg7 ? arg4 : arg7;
			local80 = local23 > local14 ? local14 : local23;
			while (local73 < local80) {
				if ((this.anIntArrayArray128[local73 - this.anInt4563][arg8 - this.anInt4572] & 0x20) == 0) {
					return true;
				}
				local73++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg3 && arg1 == arg0) {
				return true;
			}
		} else if (arg3 >= arg5 && arg3 <= arg5 + arg4 - 1 && arg0 >= arg0 && arg4 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(55) int local55 = arg0 - this.anInt4572;
		@Pc(60) int local60 = arg5 - this.anInt4563;
		@Pc(70) int local70 = arg1 - this.anInt4572;
		@Pc(75) int local75 = arg3 - this.anInt4563;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local75 + 1 == local60 && local55 == local70 && (this.anIntArrayArray128[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local75 == local60 && local55 - 1 == local70 && (this.anIntArrayArray128[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 - 1 == local60 && local55 == local70 && (this.anIntArrayArray128[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local60 == local75 && local70 == local55 - 1 && (this.anIntArrayArray128[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local75 - 1 == local60 && local70 == local55 && (this.anIntArrayArray128[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local60 == local75 && local70 == local55 + 1 && (this.anIntArrayArray128[local60][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 == local75 + 1 && local70 == local55 && (this.anIntArrayArray128[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local75 == local60 && local70 == local55 + 1 && (this.anIntArrayArray128[local60][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local60 == local75 && local55 + 1 == local70 && (this.anIntArrayArray128[local60][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 == local60 && local55 - 1 == local70 && (this.anIntArrayArray128[local60][local70] & 0x2) == 0) {
					return true;
				}
				if (local60 == local75 - 1 && local70 == local55 && (this.anIntArrayArray128[local60][local70] & 0x8) == 0) {
					return true;
				}
				if (local60 == local75 + 1 && local70 == local55 && (this.anIntArrayArray128[local60][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local60 + arg4 - 1;
			@Pc(93) int local93 = local70 + arg4 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local60 == local75 + 1 && local70 <= local55 && local55 <= local93 && (this.anIntArrayArray128[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local55 - arg4 == local70 && (this.anIntArrayArray128[local75][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 - arg4 == local60 && local55 >= local70 && local93 >= local55 && (this.anIntArrayArray128[local86][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 <= local75 && local86 >= local75 && local55 - arg4 == local70 && (this.anIntArrayArray128[local75][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local60 == local75 - arg4 && local55 >= local70 && local93 >= local55 && (this.anIntArrayArray128[local86][local55] & 0x8) == 0) {
						return true;
					}
					if (local75 >= local60 && local86 >= local75 && local55 + 1 == local70 && (this.anIntArrayArray128[local75][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 == local75 + 1 && local55 >= local70 && local93 >= local55 && (this.anIntArrayArray128[local60][local55] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local70 == local55 + 1 && (this.anIntArrayArray128[local75][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local75 >= local60 && local86 >= local75 && local55 + 1 == local70 && (this.anIntArrayArray128[local75][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 >= local60 && local75 <= local86 && local70 == local55 - arg4 && (this.anIntArrayArray128[local75][local93] & 0x2) == 0) {
					return true;
				}
				if (local60 == local75 - arg4 && local70 <= local55 && local93 >= local55 && (this.anIntArrayArray128[local86][local55] & 0x8) == 0) {
					return true;
				}
				if (local60 == local75 + 1 && local70 <= local55 && local55 <= local93 && (this.anIntArrayArray128[local60][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public void method4101() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt4571; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt4566; local13++) {
				if (local9 == 0 || local13 == 0 || local9 >= this.anInt4571 - 5 || local13 >= this.anInt4566 - 5) {
					this.anIntArrayArray128[local9][local13] = -1;
				} else {
					this.anIntArrayArray128[local9][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V")
	public void method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4572;
		@Pc(13) int local13 = arg1 - this.anInt4563;
		this.anIntArrayArray128[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static263.method4787(arg2, arg6, arg4, arg1, arg3, arg4, arg5, arg7) ? true : this.method4098(arg3, arg0, arg2, arg4, arg1, arg6, arg4, arg5, arg7);
		}
		@Pc(40) int local40 = arg1 + arg2 - 1;
		@Pc(47) int local47 = arg7 + arg3 - 1;
		if (arg5 >= arg1 && arg5 <= local40 && arg7 <= arg6 && arg6 <= local47) {
			return true;
		} else if (arg1 - 1 == arg5 && arg6 >= arg7 && arg6 <= local47 && (this.anIntArrayArray128[arg5 - this.anInt4563][arg6 - this.anInt4572] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg5 && arg6 >= arg7 && arg6 <= local47 && (this.anIntArrayArray128[arg5 - this.anInt4563][arg6 - this.anInt4572] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg6 && arg5 >= arg1 && local40 >= arg5 && (this.anIntArrayArray128[arg5 - this.anInt4563][arg6 - this.anInt4572] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg6 && arg1 <= arg5 && arg5 <= local40 && (this.anIntArrayArray128[arg5 - this.anInt4563][arg6 - this.anInt4572] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V")
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4563;
		@Pc(25) int local25 = arg0 - this.anInt4572;
		this.anIntArrayArray128[local4][local25] |= 0x40000;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg0 && arg2 == arg1) {
				return true;
			}
		} else if (arg0 <= arg4 && arg4 <= arg0 + arg3 - 1 && arg2 >= arg2 && arg2 <= arg3 + arg2 - 1) {
			return true;
		}
		@Pc(49) int local49 = arg1 - this.anInt4572;
		@Pc(54) int local54 = arg4 - this.anInt4563;
		@Pc(59) int local59 = arg0 - this.anInt4563;
		@Pc(64) int local64 = arg2 - this.anInt4572;
		if (arg3 == 1) {
			if (arg5 == 0) {
				if (arg6 == 0) {
					if (local59 == local54 - 1 && local49 == local64) {
						return true;
					}
					if (local54 == local59 && local49 == local64 + 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local54 && local49 == local64 - 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local59 == local54 && local64 + 1 == local49) {
						return true;
					}
					if (local54 - 1 == local59 && local49 == local64 && (this.anIntArrayArray128[local59][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 + 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 + 1 == local59 && local49 == local64) {
						return true;
					}
					if (local54 == local59 && local49 == local64 + 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 == local59 && local49 == local64 - 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 == local54 && local64 - 1 == local49) {
						return true;
					}
					if (local59 == local54 - 1 && local49 == local64 && (this.anIntArrayArray128[local59][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local54 + 1 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg6 == 0) {
					if (local59 == local54 - 1 && local49 == local64) {
						return true;
					}
					if (local59 == local54 && local64 + 1 == local49) {
						return true;
					}
					if (local54 + 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local54 == local59 && local49 == local64 - 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local54 - 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local54 && local49 == local64 + 1) {
						return true;
					}
					if (local54 + 1 == local59 && local64 == local49) {
						return true;
					}
					if (local54 == local59 && local64 - 1 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 - 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local54 && local64 + 1 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 + 1 == local59 && local64 == local49) {
						return true;
					}
					if (local59 == local54 && local49 == local64 - 1) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 == local54 - 1 && local49 == local64) {
						return true;
					}
					if (local59 == local54 && local49 == local64 + 1 && (this.anIntArrayArray128[local59][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local54 + 1 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local54 && local49 == local64 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local59 == local54 && local49 == local64 + 1 && (this.anIntArrayArray128[local59][local49] & 0x20) == 0) {
					return true;
				}
				if (local59 == local54 && local64 - 1 == local49 && (this.anIntArrayArray128[local59][local49] & 0x2) == 0) {
					return true;
				}
				if (local54 - 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x8) == 0) {
					return true;
				}
				if (local54 + 1 == local59 && local64 == local49 && (this.anIntArrayArray128[local59][local49] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(79) int local79 = local59 + arg3 - 1;
			@Pc(85) int local85 = local49 + arg3 - 1;
			if (arg5 == 0) {
				if (arg6 == 0) {
					if (local59 == local54 - arg3 && local49 <= local64 && local64 <= local85) {
						return true;
					}
					if (local54 >= local59 && local54 <= local79 && local64 + 1 == local49 && (this.anIntArrayArray128[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 <= local54 && local79 >= local54 && local64 - arg3 == local49 && (this.anIntArrayArray128[local54][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local54 >= local59 && local54 <= local79 && local64 + 1 == local49) {
						return true;
					}
					if (local59 == local54 - arg3 && local49 <= local64 && local64 <= local85 && (this.anIntArrayArray128[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local54 + 1 && local64 >= local49 && local85 >= local64 && (this.anIntArrayArray128[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local54 + 1 == local59 && local64 >= local49 && local85 >= local64) {
						return true;
					}
					if (local59 <= local54 && local54 <= local79 && local49 == local64 + 1 && (this.anIntArrayArray128[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 <= local54 && local54 <= local79 && local49 == local64 - arg3 && (this.anIntArrayArray128[local54][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 <= local54 && local54 <= local79 && local49 == local64 - arg3) {
						return true;
					}
					if (local54 - arg3 == local59 && local49 <= local64 && local64 <= local85 && (this.anIntArrayArray128[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 + 1 == local59 && local49 <= local64 && local64 <= local85 && (this.anIntArrayArray128[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg6 == 0) {
					if (local54 - arg3 == local59 && local49 <= local64 && local64 <= local85) {
						return true;
					}
					if (local54 >= local59 && local79 >= local54 && local49 == local64 + 1) {
						return true;
					}
					if (local54 + 1 == local59 && local49 <= local64 && local64 <= local85 && (this.anIntArrayArray128[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local54 && local54 <= local79 && local64 - arg3 == local49 && (this.anIntArrayArray128[local54][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local59 == local54 - arg3 && local64 >= local49 && local64 <= local85 && (this.anIntArrayArray128[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 <= local54 && local79 >= local54 && local49 == local64 + 1) {
						return true;
					}
					if (local59 == local54 + 1 && local64 >= local49 && local85 >= local64) {
						return true;
					}
					if (local54 >= local59 && local79 >= local54 && local64 - arg3 == local49 && (this.anIntArrayArray128[local54][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local59 == local54 - arg3 && local64 >= local49 && local85 >= local64 && (this.anIntArrayArray128[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local54 >= local59 && local79 >= local54 && local64 + 1 == local49 && (this.anIntArrayArray128[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local54 + 1 == local59 && local64 >= local49 && local64 <= local85) {
						return true;
					}
					if (local54 >= local59 && local79 >= local54 && local49 == local64 - arg3) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 == local54 - arg3 && local49 <= local64 && local85 >= local64) {
						return true;
					}
					if (local59 <= local54 && local54 <= local79 && local49 == local64 + 1 && (this.anIntArrayArray128[local54][local49] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local54 + 1 && local64 >= local49 && local85 >= local64 && (this.anIntArrayArray128[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local54 && local79 >= local54 && local64 - arg3 == local49) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local59 <= local54 && local54 <= local79 && local49 == local64 + 1 && (this.anIntArrayArray128[local54][local49] & 0x2C0120) == 0) {
					return true;
				}
				if (local54 >= local59 && local54 <= local79 && local49 == local64 - arg3 && (this.anIntArrayArray128[local54][local85] & 0x2C0102) == 0) {
					return true;
				}
				if (local54 - arg3 == local59 && local49 <= local64 && local85 >= local64 && (this.anIntArrayArray128[local79][local64] & 0x2C0108) == 0) {
					return true;
				}
				if (local54 + 1 == local59 && local64 >= local49 && local64 <= local85 && (this.anIntArrayArray128[local59][local64] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIIIZ)V")
	public void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt4572;
		@Pc(9) int local9 = arg1 - this.anInt4563;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method4096(local4, local9, 128);
				this.method4096(local4, local9 - 1, 8);
			}
			if (arg3 == 1) {
				this.method4096(local4, local9, 2);
				this.method4096(local4 + 1, local9, 32);
			}
			if (arg3 == 2) {
				this.method4096(local4, local9, 8);
				this.method4096(local4, local9 + 1, 128);
			}
			if (arg3 == 3) {
				this.method4096(local4, local9, 32);
				this.method4096(local4 - 1, local9, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method4096(local4, local9, 1);
				this.method4096(local4 + 1, local9 + -1, 16);
			}
			if (arg3 == 1) {
				this.method4096(local4, local9, 4);
				this.method4096(local4 + 1, local9 - -1, 64);
			}
			if (arg3 == 2) {
				this.method4096(local4, local9, 16);
				this.method4096(local4 - 1, local9 + 1, 1);
			}
			if (arg3 == 3) {
				this.method4096(local4, local9, 64);
				this.method4096(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method4096(local4, local9, 130);
				this.method4096(local4, local9 - 1, 8);
				this.method4096(local4 + 1, local9, 32);
			}
			if (arg3 == 1) {
				this.method4096(local4, local9, 10);
				this.method4096(local4 + 1, local9, 32);
				this.method4096(local4, local9 + 1, 128);
			}
			if (arg3 == 2) {
				this.method4096(local4, local9, 40);
				this.method4096(local4, local9 + 1, 128);
				this.method4096(local4 - 1, local9, 2);
			}
			if (arg3 == 3) {
				this.method4096(local4, local9, 160);
				this.method4096(local4 - 1, local9, 2);
				this.method4096(local4, local9 - 1, 8);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method4096(local4, local9, 65536);
					this.method4096(local4, local9 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method4096(local4, local9, 1024);
					this.method4096(local4 + 1, local9, 16384);
				}
				if (arg3 == 2) {
					this.method4096(local4, local9, 4096);
					this.method4096(local4, local9 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method4096(local4, local9, 16384);
					this.method4096(local4 - 1, local9, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method4096(local4, local9, 512);
					this.method4096(local4 + 1, local9 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method4096(local4, local9, 2048);
					this.method4096(local4 + 1, local9 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method4096(local4, local9, 8192);
					this.method4096(local4 - 1, local9 + 1, 512);
				}
				if (arg3 == 3) {
					this.method4096(local4, local9, 32768);
					this.method4096(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method4096(local4, local9, 66560);
					this.method4096(local4, local9 - 1, 4096);
					this.method4096(local4 + 1, local9, 16384);
				}
				if (arg3 == 1) {
					this.method4096(local4, local9, 5120);
					this.method4096(local4 + 1, local9, 16384);
					this.method4096(local4, local9 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method4096(local4, local9, 20480);
					this.method4096(local4, local9 + 1, 65536);
					this.method4096(local4 - 1, local9, 1024);
				}
				if (arg3 == 3) {
					this.method4096(local4, local9, 81920);
					this.method4096(local4 - 1, local9, 1024);
					this.method4096(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method4096(local4, local9, 536870912);
				this.method4096(local4, local9 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method4096(local4, local9, 8388608);
				this.method4096(local4 + 1, local9, 134217728);
			}
			if (arg3 == 2) {
				this.method4096(local4, local9, 33554432);
				this.method4096(local4, local9 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method4096(local4, local9, 134217728);
				this.method4096(local4 - 1, local9, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method4096(local4, local9, 4194304);
				this.method4096(local4 + 1, local9 + -1, 67108864);
			}
			if (arg3 == 1) {
				this.method4096(local4, local9, 16777216);
				this.method4096(local4 + 1, local9 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method4096(local4, local9, 67108864);
				this.method4096(local4 - 1, local9 + 1, 4194304);
			}
			if (arg3 == 3) {
				this.method4096(local4, local9, 268435456);
				this.method4096(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method4096(local4, local9, 545259520);
			this.method4096(local4, local9 - 1, 33554432);
			this.method4096(local4 + 1, local9, 134217728);
		}
		if (arg3 == 1) {
			this.method4096(local4, local9, 41943040);
			this.method4096(local4 + 1, local9, 134217728);
			this.method4096(local4, local9 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method4096(local4, local9, 167772160);
			this.method4096(local4, local9 + 1, 536870912);
			this.method4096(local4 - 1, local9, 8388608);
		}
		if (arg3 == 3) {
			this.method4096(local4, local9, 671088640);
			this.method4096(local4 - 1, local9, 8388608);
			this.method4096(local4, local9 - 1, 33554432);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIIZII)V")
	public void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt4572;
		@Pc(23) int local23 = arg2 - this.anInt4563;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local23; local39 < arg5 + local23; local39++) {
			if (local39 >= 0 && local39 < this.anInt4571) {
				for (@Pc(56) int local56 = local18; local56 < arg3 + local18; local56++) {
					if (local56 >= 0 && this.anInt4566 > local56) {
						this.method4094(local7, local39, local56);
					}
				}
			}
		}
	}
}
