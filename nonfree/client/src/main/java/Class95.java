import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class95 {

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public int anInt3047;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	public int anInt3060;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg6;
		@Pc(14) int local14 = arg3 + arg7;
		@Pc(24) int local24 = arg8 + arg1;
		@Pc(28) int local28 = arg2 + arg4;
		@Pc(49) int local49;
		@Pc(60) int local60;
		if (arg6 == local24 && (arg5 & 0x2) == 0) {
			local49 = arg3 > arg2 ? arg3 : arg2;
			local60 = local14 < local28 ? local14 : local28;
			while (local60 > local49) {
				if ((this.anIntArrayArray22[local24 - this.anInt3047 - 1][local49 - this.anInt3057] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local9 == arg8 && (arg5 & 0x8) == 0) {
			local49 = arg3 > arg2 ? arg3 : arg2;
			local60 = local14 >= local28 ? local28 : local14;
			while (local49 < local60) {
				if ((this.anIntArrayArray22[arg8 - this.anInt3047][local49 - this.anInt3057] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local28 == arg3 && (arg5 & 0x1) == 0) {
			local49 = arg6 <= arg8 ? arg8 : arg6;
			local60 = local24 <= local9 ? local24 : local9;
			while (local49 < local60) {
				if ((this.anIntArrayArray22[local49 - this.anInt3047][local28 - this.anInt3057 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg2 == local14 && (arg5 & 0x4) == 0) {
			local49 = arg8 < arg6 ? arg6 : arg8;
			local60 = local9 < local24 ? local9 : local24;
			while (local60 > local49) {
				if ((this.anIntArrayArray22[local49 - this.anInt3047][arg2 - this.anInt3057] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBIZIZ)V")
	public void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt3047;
		@Pc(13) int local13 = arg4 - this.anInt3057;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2731(local4, 128, local13);
				this.method2731(local4 - 1, 8, local13);
			}
			if (arg1 == 1) {
				this.method2731(local4, 2, local13);
				this.method2731(local4, 32, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2731(local4, 8, local13);
				this.method2731(local4 + 1, 128, local13);
			}
			if (arg1 == 3) {
				this.method2731(local4, 32, local13);
				this.method2731(local4, 2, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2731(local4, 1, local13);
				this.method2731(local4 - 1, 16, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2731(local4, 4, local13);
				this.method2731(local4 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2731(local4, 16, local13);
				this.method2731(local4 + 1, 1, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2731(local4, 64, local13);
				this.method2731(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method2731(local4, 130, local13);
				this.method2731(local4 - 1, 8, local13);
				this.method2731(local4, 32, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2731(local4, 10, local13);
				this.method2731(local4, 32, local13 + 1);
				this.method2731(local4 + 1, 128, local13);
			}
			if (arg1 == 2) {
				this.method2731(local4, 40, local13);
				this.method2731(local4 + 1, 128, local13);
				this.method2731(local4, 2, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2731(local4, 160, local13);
				this.method2731(local4, 2, local13 - 1);
				this.method2731(local4 - 1, 8, local13);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method2731(local4, 65536, local13);
					this.method2731(local4 - 1, 4096, local13);
				}
				if (arg1 == 1) {
					this.method2731(local4, 1024, local13);
					this.method2731(local4, 16384, local13 + 1);
				}
				if (arg1 == 2) {
					this.method2731(local4, 4096, local13);
					this.method2731(local4 + 1, 65536, local13);
				}
				if (arg1 == 3) {
					this.method2731(local4, 16384, local13);
					this.method2731(local4, 1024, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method2731(local4, 512, local13);
					this.method2731(local4 - 1, 8192, local13 + 1);
				}
				if (arg1 == 1) {
					this.method2731(local4, 2048, local13);
					this.method2731(local4 + 1, 32768, local13 + 1);
				}
				if (arg1 == 2) {
					this.method2731(local4, 8192, local13);
					this.method2731(local4 + 1, 512, local13 - 1);
				}
				if (arg1 == 3) {
					this.method2731(local4, 32768, local13);
					this.method2731(local4 - 1, 2048, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method2731(local4, 66560, local13);
					this.method2731(local4 - 1, 4096, local13);
					this.method2731(local4, 16384, local13 + 1);
				}
				if (arg1 == 1) {
					this.method2731(local4, 5120, local13);
					this.method2731(local4, 16384, local13 + 1);
					this.method2731(local4 + 1, 65536, local13);
				}
				if (arg1 == 2) {
					this.method2731(local4, 20480, local13);
					this.method2731(local4 + 1, 65536, local13);
					this.method2731(local4, 1024, local13 - 1);
				}
				if (arg1 == 3) {
					this.method2731(local4, 81920, local13);
					this.method2731(local4, 1024, local13 - 1);
					this.method2731(local4 - 1, 4096, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2731(local4, 536870912, local13);
				this.method2731(local4 - 1, 33554432, local13);
			}
			if (arg1 == 1) {
				this.method2731(local4, 8388608, local13);
				this.method2731(local4, 134217728, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2731(local4, 33554432, local13);
				this.method2731(local4 + 1, 536870912, local13);
			}
			if (arg1 == 3) {
				this.method2731(local4, 134217728, local13);
				this.method2731(local4, 8388608, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2731(local4, 4194304, local13);
				this.method2731(local4 - 1, 67108864, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2731(local4, 16777216, local13);
				this.method2731(local4 + 1, 268435456, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2731(local4, 67108864, local13);
				this.method2731(local4 + 1, 4194304, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2731(local4, 268435456, local13);
				this.method2731(local4 - 1, 16777216, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2731(local4, 545259520, local13);
			this.method2731(local4 - 1, 33554432, local13);
			this.method2731(local4, 134217728, local13 + 1);
		}
		if (arg1 == 1) {
			this.method2731(local4, 41943040, local13);
			this.method2731(local4, 134217728, local13 + 1);
			this.method2731(local4 + 1, 536870912, local13);
		}
		if (arg1 == 2) {
			this.method2731(local4, 167772160, local13);
			this.method2731(local4 + 1, 536870912, local13);
			this.method2731(local4, 8388608, local13 - 1);
		}
		if (arg1 == 3) {
			this.method2731(local4, 671088640, local13);
			this.method2731(local4, 8388608, local13 - 1);
			this.method2731(local4 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
	public void method2730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3047;
		@Pc(13) int local13 = arg0 - this.anInt3057;
		this.anIntArrayArray22[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	private void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray22[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIII)V")
	private void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray22[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZIIIII)Z")
	public boolean method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static461.method6384(arg3, arg2, arg7, arg5, arg6, arg5, arg4, arg0) ? true : this.method2727(arg5, arg3, arg2, arg4, arg6, arg1, arg7, arg5, arg0);
		}
		@Pc(40) int local40 = arg3 + arg0 - 1;
		@Pc(51) int local51 = arg2 + arg6 - 1;
		if (arg7 >= arg0 && arg7 <= local40 && arg4 >= arg2 && arg4 <= local51) {
			return true;
		} else if (arg7 == arg0 - 1 && arg2 <= arg4 && arg4 <= local51 && (this.anIntArrayArray22[arg7 - this.anInt3047][arg4 - this.anInt3057] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg7 && arg4 >= arg2 && local51 >= arg4 && (this.anIntArrayArray22[arg7 - this.anInt3047][arg4 - this.anInt3057] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg2 - 1 && arg7 >= arg0 && arg7 <= local40 && (this.anIntArrayArray22[arg7 - this.anInt3047][arg4 - this.anInt3057] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local51 + 1 == arg4 && arg7 >= arg0 && arg7 <= local40 && (this.anIntArrayArray22[arg7 - this.anInt3047][arg4 - this.anInt3057] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg1 == arg6 && arg2 == arg4) {
				return true;
			}
		} else if (arg6 <= arg1 && arg1 <= arg6 + arg0 - 1 && arg4 <= arg4 && arg4 <= arg0 + arg4 - 1) {
			return true;
		}
		@Pc(50) int local50 = arg1 - this.anInt3047;
		@Pc(55) int local55 = arg4 - this.anInt3057;
		@Pc(74) int local74 = arg2 - this.anInt3057;
		@Pc(79) int local79 = arg6 - this.anInt3047;
		if (arg0 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local79 == local50 + 1 && local74 == local55 && (this.anIntArrayArray22[local79][local74] & 0x80) == 0) {
						return true;
					}
					if (local50 == local79 && local55 - 1 == local74 && (this.anIntArrayArray22[local79][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local50 - 1 == local79 && local74 == local55 && (this.anIntArrayArray22[local79][local74] & 0x8) == 0) {
						return true;
					}
					if (local50 == local79 && local55 - 1 == local74 && (this.anIntArrayArray22[local79][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local79 == local50 - 1 && local74 == local55 && (this.anIntArrayArray22[local79][local74] & 0x8) == 0) {
						return true;
					}
					if (local50 == local79 && local55 + 1 == local74 && (this.anIntArrayArray22[local79][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local79 == local50 + 1 && local74 == local55 && (this.anIntArrayArray22[local79][local74] & 0x80) == 0) {
						return true;
					}
					if (local50 == local79 && local74 == local55 + 1 && (this.anIntArrayArray22[local79][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local79 == local50 && local74 == local55 + 1 && (this.anIntArrayArray22[local79][local74] & 0x20) == 0) {
					return true;
				}
				if (local79 == local50 && local74 == local55 - 1 && (this.anIntArrayArray22[local79][local74] & 0x2) == 0) {
					return true;
				}
				if (local50 - 1 == local79 && local55 == local74 && (this.anIntArrayArray22[local79][local74] & 0x8) == 0) {
					return true;
				}
				if (local50 + 1 == local79 && local74 == local55 && (this.anIntArrayArray22[local79][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = arg0 + local79 - 1;
			@Pc(97) int local97 = local74 + arg0 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local79 == local50 + 1 && local74 <= local55 && local97 >= local55 && (this.anIntArrayArray22[local79][local55] & 0x80) == 0) {
						return true;
					}
					if (local50 >= local79 && local50 <= local90 && local55 - arg0 == local74 && (this.anIntArrayArray22[local50][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local79 == local50 - arg0 && local55 >= local74 && local97 >= local55 && (this.anIntArrayArray22[local90][local55] & 0x8) == 0) {
						return true;
					}
					if (local79 <= local50 && local90 >= local50 && local55 - arg0 == local74 && (this.anIntArrayArray22[local50][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local50 - arg0 == local79 && local55 >= local74 && local55 <= local97 && (this.anIntArrayArray22[local90][local55] & 0x8) == 0) {
						return true;
					}
					if (local50 >= local79 && local50 <= local90 && local74 == local55 + 1 && (this.anIntArrayArray22[local50][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local79 == local50 + 1 && local55 >= local74 && local55 <= local97 && (this.anIntArrayArray22[local79][local55] & 0x80) == 0) {
						return true;
					}
					if (local50 >= local79 && local50 <= local90 && local55 + 1 == local74 && (this.anIntArrayArray22[local50][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local50 >= local79 && local50 <= local90 && local55 + 1 == local74 && (this.anIntArrayArray22[local50][local74] & 0x20) == 0) {
					return true;
				}
				if (local50 >= local79 && local50 <= local90 && local55 - arg0 == local74 && (this.anIntArrayArray22[local50][local97] & 0x2) == 0) {
					return true;
				}
				if (local79 == local50 - arg0 && local55 >= local74 && local97 >= local55 && (this.anIntArrayArray22[local90][local55] & 0x8) == 0) {
					return true;
				}
				if (local50 + 1 == local79 && local55 >= local74 && local55 <= local97 && (this.anIntArrayArray22[local79][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZZIII)V")
	public void method2736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(27) int local27;
		if (arg1 == 1 || arg1 == 3) {
			local27 = arg4;
			arg4 = arg0;
			arg0 = local27;
		}
		@Pc(36) int local36 = arg5 - this.anInt3047;
		@Pc(41) int local41 = arg6 - this.anInt3057;
		for (local27 = local36; local27 < arg4 + local36; local27++) {
			if (local27 >= 0 && this.anInt3052 > local27) {
				for (@Pc(64) int local64 = local41; local64 < local41 + arg0; local64++) {
					if (local64 >= 0 && local64 < this.anInt3060) {
						this.method2732(local27, local7, local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg0 && arg3 == arg5) {
				return true;
			}
		} else if (arg0 >= arg6 && arg0 <= arg6 + arg2 - 1 && arg3 >= arg3 && arg3 <= arg2 + arg3 - 1) {
			return true;
		}
		@Pc(60) int local60 = arg3 - this.anInt3057;
		@Pc(65) int local65 = arg0 - this.anInt3047;
		@Pc(70) int local70 = arg5 - this.anInt3057;
		@Pc(75) int local75 = arg6 - this.anInt3047;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local65 - 1 == local75 && local60 == local70) {
						return true;
					}
					if (local75 == local65 && local60 + 1 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1 && (this.anIntArrayArray22[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local65 == local75 && local70 == local60 + 1) {
						return true;
					}
					if (local65 - 1 == local75 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local65 + 1 == local75 && local60 == local70) {
						return true;
					}
					if (local65 == local75 && local60 + 1 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1 && (this.anIntArrayArray22[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local65 == local75 && local60 - 1 == local70) {
						return true;
					}
					if (local65 - 1 == local75 && local70 == local60 && (this.anIntArrayArray22[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local70 == local60 && (this.anIntArrayArray22[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local75 == local65 - 1 && local70 == local60) {
						return true;
					}
					if (local75 == local65 && local70 == local60 + 1) {
						return true;
					}
					if (local65 + 1 == local75 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1 && (this.anIntArrayArray22[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local75 == local65 - 1 && local70 == local60 && (this.anIntArrayArray22[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local75 && local70 == local60 + 1) {
						return true;
					}
					if (local75 == local65 + 1 && local60 == local70) {
						return true;
					}
					if (local65 == local75 && local70 == local60 - 1 && (this.anIntArrayArray22[local75][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local65 - 1 == local75 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 && local60 + 1 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local70 == local60) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local65 - 1 == local75 && local70 == local60) {
						return true;
					}
					if (local65 == local75 && local60 + 1 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local65 && local60 - 1 == local70) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local75 == local65 && local70 == local60 + 1 && (this.anIntArrayArray22[local75][local70] & 0x20) == 0) {
					return true;
				}
				if (local65 == local75 && local70 == local60 - 1 && (this.anIntArrayArray22[local75][local70] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local75 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x8) == 0) {
					return true;
				}
				if (local75 == local65 + 1 && local60 == local70 && (this.anIntArrayArray22[local75][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(764) int local764 = local75 + arg2 - 1;
			@Pc(770) int local770 = arg2 + local70 - 1;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local75 == local65 - arg2 && local70 <= local60 && local60 <= local770) {
						return true;
					}
					if (local65 >= local75 && local764 >= local65 && local70 == local60 + 1 && (this.anIntArrayArray22[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 >= local75 && local764 >= local65 && local70 == local60 - arg2 && (this.anIntArrayArray22[local65][local770] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local75 <= local65 && local764 >= local65 && local70 == local60 + 1) {
						return true;
					}
					if (local75 == local65 - arg2 && local60 >= local70 && local770 >= local60 && (this.anIntArrayArray22[local764][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local70 <= local60 && local60 <= local770 && (this.anIntArrayArray22[local75][local60] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local75 == local65 + 1 && local70 <= local60 && local60 <= local770) {
						return true;
					}
					if (local75 <= local65 && local65 <= local764 && local60 + 1 == local70 && (this.anIntArrayArray22[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 >= local75 && local65 <= local764 && local70 == local60 - arg2 && (this.anIntArrayArray22[local65][local770] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local75 <= local65 && local764 >= local65 && local70 == local60 - arg2) {
						return true;
					}
					if (local65 - arg2 == local75 && local60 >= local70 && local60 <= local770 && (this.anIntArrayArray22[local764][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local60 >= local70 && local770 >= local60 && (this.anIntArrayArray22[local75][local60] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local65 - arg2 == local75 && local60 >= local70 && local770 >= local60) {
						return true;
					}
					if (local75 <= local65 && local65 <= local764 && local70 == local60 + 1) {
						return true;
					}
					if (local65 + 1 == local75 && local70 <= local60 && local770 >= local60 && (this.anIntArrayArray22[local75][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 >= local75 && local764 >= local65 && local70 == local60 - arg2 && (this.anIntArrayArray22[local65][local770] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local65 - arg2 == local75 && local70 <= local60 && local770 >= local60 && (this.anIntArrayArray22[local764][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 >= local75 && local764 >= local65 && local70 == local60 + 1) {
						return true;
					}
					if (local75 == local65 + 1 && local60 >= local70 && local60 <= local770) {
						return true;
					}
					if (local75 <= local65 && local764 >= local65 && local60 - arg2 == local70 && (this.anIntArrayArray22[local65][local770] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local75 == local65 - arg2 && local60 >= local70 && local60 <= local770 && (this.anIntArrayArray22[local764][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 <= local65 && local65 <= local764 && local70 == local60 + 1 && (this.anIntArrayArray22[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local65 + 1 && local70 <= local60 && local60 <= local770) {
						return true;
					}
					if (local75 <= local65 && local65 <= local764 && local60 - arg2 == local70) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local65 - arg2 == local75 && local70 <= local60 && local770 >= local60) {
						return true;
					}
					if (local75 <= local65 && local65 <= local764 && local70 == local60 + 1 && (this.anIntArrayArray22[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local75 && local70 <= local60 && local770 >= local60 && (this.anIntArrayArray22[local75][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 >= local75 && local65 <= local764 && local70 == local60 - arg2) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local65 >= local75 && local65 <= local764 && local60 + 1 == local70 && (this.anIntArrayArray22[local65][local70] & 0x2C0120) == 0) {
					return true;
				}
				if (local65 >= local75 && local764 >= local65 && local70 == local60 - arg2 && (this.anIntArrayArray22[local65][local770] & 0x2C0102) == 0) {
					return true;
				}
				if (local65 - arg2 == local75 && local70 <= local60 && local770 >= local60 && (this.anIntArrayArray22[local764][local60] & 0x2C0108) == 0) {
					return true;
				}
				if (local75 == local65 + 1 && local70 <= local60 && local770 >= local60 && (this.anIntArrayArray22[local75][local60] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
	public void method2738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg1 - this.anInt3057;
		@Pc(24) int local24 = arg0 - this.anInt3047;
		this.anIntArrayArray22[local24][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public void method2739() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3052; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt3060; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt3052 - 5 <= local11 || local15 >= this.anInt3060 - 5) {
					this.anIntArrayArray22[local11][local15] = -1;
				} else {
					this.anIntArrayArray22[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZZIIII)V")
	public void method2741(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - this.anInt3047;
		@Pc(18) int local18 = arg3 - this.anInt3057;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method2732(local9, 128, local18);
				this.method2732(local9 - 1, 8, local18);
			}
			if (arg4 == 1) {
				this.method2732(local9, 2, local18);
				this.method2732(local9, 32, local18 + 1);
			}
			if (arg4 == 2) {
				this.method2732(local9, 8, local18);
				this.method2732(local9 + 1, 128, local18);
			}
			if (arg4 == 3) {
				this.method2732(local9, 32, local18);
				this.method2732(local9, 2, local18 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method2732(local9, 1, local18);
				this.method2732(local9 - 1, 16, local18 + 1);
			}
			if (arg4 == 1) {
				this.method2732(local9, 4, local18);
				this.method2732(local9 + 1, 64, local18 + 1);
			}
			if (arg4 == 2) {
				this.method2732(local9, 16, local18);
				this.method2732(local9 + 1, 1, local18 - 1);
			}
			if (arg4 == 3) {
				this.method2732(local9, 64, local18);
				this.method2732(local9 - 1, 4, local18 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method2732(local9, 130, local18);
				this.method2732(local9 - 1, 8, local18);
				this.method2732(local9, 32, local18 + 1);
			}
			if (arg4 == 1) {
				this.method2732(local9, 10, local18);
				this.method2732(local9, 32, local18 + 1);
				this.method2732(local9 + 1, 128, local18);
			}
			if (arg4 == 2) {
				this.method2732(local9, 40, local18);
				this.method2732(local9 + 1, 128, local18);
				this.method2732(local9, 2, local18 - 1);
			}
			if (arg4 == 3) {
				this.method2732(local9, 160, local18);
				this.method2732(local9, 2, local18 - 1);
				this.method2732(local9 - 1, 8, local18);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method2732(local9, 65536, local18);
					this.method2732(local9 - 1, 4096, local18);
				}
				if (arg4 == 1) {
					this.method2732(local9, 1024, local18);
					this.method2732(local9, 16384, local18 + 1);
				}
				if (arg4 == 2) {
					this.method2732(local9, 4096, local18);
					this.method2732(local9 + 1, 65536, local18);
				}
				if (arg4 == 3) {
					this.method2732(local9, 16384, local18);
					this.method2732(local9, 1024, local18 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method2732(local9, 512, local18);
					this.method2732(local9 - 1, 8192, local18 + 1);
				}
				if (arg4 == 1) {
					this.method2732(local9, 2048, local18);
					this.method2732(local9 + 1, 32768, local18 + 1);
				}
				if (arg4 == 2) {
					this.method2732(local9, 8192, local18);
					this.method2732(local9 + 1, 512, local18 - 1);
				}
				if (arg4 == 3) {
					this.method2732(local9, 32768, local18);
					this.method2732(local9 - 1, 2048, local18 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method2732(local9, 66560, local18);
					this.method2732(local9 - 1, 4096, local18);
					this.method2732(local9, 16384, local18 + 1);
				}
				if (arg4 == 1) {
					this.method2732(local9, 5120, local18);
					this.method2732(local9, 16384, local18 + 1);
					this.method2732(local9 + 1, 65536, local18);
				}
				if (arg4 == 2) {
					this.method2732(local9, 20480, local18);
					this.method2732(local9 + 1, 65536, local18);
					this.method2732(local9, 1024, local18 - 1);
				}
				if (arg4 == 3) {
					this.method2732(local9, 81920, local18);
					this.method2732(local9, 1024, local18 - 1);
					this.method2732(local9 - 1, 4096, local18);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method2732(local9, 536870912, local18);
				this.method2732(local9 - 1, 33554432, local18);
			}
			if (arg4 == 1) {
				this.method2732(local9, 8388608, local18);
				this.method2732(local9, 134217728, local18 + 1);
			}
			if (arg4 == 2) {
				this.method2732(local9, 33554432, local18);
				this.method2732(local9 + 1, 536870912, local18);
			}
			if (arg4 == 3) {
				this.method2732(local9, 134217728, local18);
				this.method2732(local9, 8388608, local18 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method2732(local9, 4194304, local18);
				this.method2732(local9 - 1, 67108864, local18 + 1);
			}
			if (arg4 == 1) {
				this.method2732(local9, 16777216, local18);
				this.method2732(local9 + 1, 268435456, local18 + 1);
			}
			if (arg4 == 2) {
				this.method2732(local9, 67108864, local18);
				this.method2732(local9 + 1, 4194304, local18 - 1);
			}
			if (arg4 == 3) {
				this.method2732(local9, 268435456, local18);
				this.method2732(local9 - 1, 16777216, local18 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2732(local9, 545259520, local18);
			this.method2732(local9 - 1, 33554432, local18);
			this.method2732(local9, 134217728, local18 + 1);
		}
		if (arg4 == 1) {
			this.method2732(local9, 41943040, local18);
			this.method2732(local9, 134217728, local18 + 1);
			this.method2732(local9 + 1, 536870912, local18);
		}
		if (arg4 == 2) {
			this.method2732(local9, 167772160, local18);
			this.method2732(local9 + 1, 536870912, local18);
			this.method2732(local9, 8388608, local18 - 1);
		}
		if (arg4 == 3) {
			this.method2732(local9, 671088640, local18);
			this.method2732(local9, 8388608, local18 - 1);
			this.method2732(local9 - 1, 33554432, local18);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public void method2742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3047;
		@Pc(9) int local9 = arg1 - this.anInt3057;
		this.anIntArrayArray22[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	public void method2744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt3057;
		@Pc(9) int local9 = arg0 - this.anInt3047;
		this.anIntArrayArray22[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIZIII)V")
	public void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg4 - this.anInt3057;
		@Pc(35) int local35 = arg5 - this.anInt3047;
		for (@Pc(37) int local37 = local35; local37 < local35 + arg3; local37++) {
			if (local37 >= 0 && this.anInt3052 > local37) {
				for (@Pc(54) int local54 = local24; local54 < local24 + arg0; local54++) {
					if (local54 >= 0 && this.anInt3060 > local54) {
						this.method2731(local37, local7, local54);
					}
				}
			}
		}
	}
}
