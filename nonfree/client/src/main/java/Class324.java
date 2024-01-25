import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class324 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public int anInt9209;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
	public int anInt9215;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	public int anInt9226;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
	public int anInt9227;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method7773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg1 == arg3 && arg6 == arg4) {
				return true;
			}
		} else if (arg3 >= arg1 && arg0 + arg1 - 1 >= arg3 && arg6 >= arg6 && arg0 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(57) int local57 = arg1 - this.anInt9209;
		@Pc(62) int local62 = arg4 - this.anInt9227;
		@Pc(67) int local67 = arg6 - this.anInt9227;
		@Pc(72) int local72 = arg3 - this.anInt9209;
		if (arg0 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local57 == local72 + 1 && local67 == local62 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local72 == local57 && local62 == local67 - 1 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 - 1 == local57 && local67 == local62 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 == local72 && local67 - 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local57 == local72 - 1 && local67 == local62 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 == local72 && local62 == local67 + 1 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local57 == local72 + 1 && local67 == local62 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local57 == local72 && local67 + 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local72 == local57 && local62 == local67 + 1 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local72 && local67 - 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local57 && local62 == local67 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local57 && local67 == local62 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(415) int local415 = local57 + arg0 - 1;
			@Pc(422) int local422 = local62 + arg0 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local72 + 1 == local57 && local67 >= local62 && local67 <= local422 && (this.anIntArrayArray51[local57][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local57 && local415 >= local72 && local62 == local67 - arg0 && (this.anIntArrayArray51[local72][local422] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 - arg0 == local57 && local62 <= local67 && local422 >= local67 && (this.anIntArrayArray51[local415][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 >= local57 && local415 >= local72 && local67 - arg0 == local62 && (this.anIntArrayArray51[local72][local422] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local57 == local72 - arg0 && local62 <= local67 && local67 <= local422 && (this.anIntArrayArray51[local415][local67] & 0x8) == 0) {
						return true;
					}
					if (local72 >= local57 && local72 <= local415 && local67 + 1 == local62 && (this.anIntArrayArray51[local72][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local72 + 1 == local57 && local67 >= local62 && local67 <= local422 && (this.anIntArrayArray51[local57][local67] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local57 && local415 >= local72 && local62 == local67 + 1 && (this.anIntArrayArray51[local72][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local57 <= local72 && local72 <= local415 && local67 + 1 == local62 && (this.anIntArrayArray51[local72][local62] & 0x20) == 0) {
					return true;
				}
				if (local72 >= local57 && local415 >= local72 && local67 - arg0 == local62 && (this.anIntArrayArray51[local72][local422] & 0x2) == 0) {
					return true;
				}
				if (local57 == local72 - arg0 && local67 >= local62 && local67 <= local422 && (this.anIntArrayArray51[local415][local67] & 0x8) == 0) {
					return true;
				}
				if (local57 == local72 + 1 && local67 >= local62 && local422 >= local67 && (this.anIntArrayArray51[local57][local67] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIBIZI)V")
	public void method7774(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg5 - this.anInt9227;
		@Pc(17) int local17 = arg0 - this.anInt9209;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method7788(local12, 128, local17);
				this.method7788(local12, 8, local17 - 1);
			}
			if (arg3 == 1) {
				this.method7788(local12, 2, local17);
				this.method7788(local12 + 1, 32, local17);
			}
			if (arg3 == 2) {
				this.method7788(local12, 8, local17);
				this.method7788(local12, 128, local17 + 1);
			}
			if (arg3 == 3) {
				this.method7788(local12, 32, local17);
				this.method7788(local12 - 1, 2, local17);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method7788(local12, 1, local17);
				this.method7788(local12 + 1, 16, local17 - 1);
			}
			if (arg3 == 1) {
				this.method7788(local12, 4, local17);
				this.method7788(local12 + 1, 64, local17 + 1);
			}
			if (arg3 == 2) {
				this.method7788(local12, 16, local17);
				this.method7788(local12 - 1, 1, local17 + 1);
			}
			if (arg3 == 3) {
				this.method7788(local12, 64, local17);
				this.method7788(local12 - 1, 4, local17 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method7788(local12, 130, local17);
				this.method7788(local12, 8, local17 - 1);
				this.method7788(local12 + 1, 32, local17);
			}
			if (arg3 == 1) {
				this.method7788(local12, 10, local17);
				this.method7788(local12 + 1, 32, local17);
				this.method7788(local12, 128, local17 + 1);
			}
			if (arg3 == 2) {
				this.method7788(local12, 40, local17);
				this.method7788(local12, 128, local17 + 1);
				this.method7788(local12 - 1, 2, local17);
			}
			if (arg3 == 3) {
				this.method7788(local12, 160, local17);
				this.method7788(local12 - 1, 2, local17);
				this.method7788(local12, 8, local17 - 1);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method7788(local12, 65536, local17);
					this.method7788(local12, 4096, local17 - 1);
				}
				if (arg3 == 1) {
					this.method7788(local12, 1024, local17);
					this.method7788(local12 + 1, 16384, local17);
				}
				if (arg3 == 2) {
					this.method7788(local12, 4096, local17);
					this.method7788(local12, 65536, local17 + 1);
				}
				if (arg3 == 3) {
					this.method7788(local12, 16384, local17);
					this.method7788(local12 - 1, 1024, local17);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method7788(local12, 512, local17);
					this.method7788(local12 + 1, 8192, local17 - 1);
				}
				if (arg3 == 1) {
					this.method7788(local12, 2048, local17);
					this.method7788(local12 + 1, 32768, local17 + 1);
				}
				if (arg3 == 2) {
					this.method7788(local12, 8192, local17);
					this.method7788(local12 - 1, 512, local17 + 1);
				}
				if (arg3 == 3) {
					this.method7788(local12, 32768, local17);
					this.method7788(local12 - 1, 2048, local17 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method7788(local12, 66560, local17);
					this.method7788(local12, 4096, local17 - 1);
					this.method7788(local12 + 1, 16384, local17);
				}
				if (arg3 == 1) {
					this.method7788(local12, 5120, local17);
					this.method7788(local12 + 1, 16384, local17);
					this.method7788(local12, 65536, local17 + 1);
				}
				if (arg3 == 2) {
					this.method7788(local12, 20480, local17);
					this.method7788(local12, 65536, local17 + 1);
					this.method7788(local12 - 1, 1024, local17);
				}
				if (arg3 == 3) {
					this.method7788(local12, 81920, local17);
					this.method7788(local12 - 1, 1024, local17);
					this.method7788(local12, 4096, local17 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method7788(local12, 536870912, local17);
				this.method7788(local12, 33554432, local17 - 1);
			}
			if (arg3 == 1) {
				this.method7788(local12, 8388608, local17);
				this.method7788(local12 + 1, 134217728, local17);
			}
			if (arg3 == 2) {
				this.method7788(local12, 33554432, local17);
				this.method7788(local12, 536870912, local17 + 1);
			}
			if (arg3 == 3) {
				this.method7788(local12, 134217728, local17);
				this.method7788(local12 - 1, 8388608, local17);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method7788(local12, 4194304, local17);
				this.method7788(local12 + 1, 67108864, local17 - 1);
			}
			if (arg3 == 1) {
				this.method7788(local12, 16777216, local17);
				this.method7788(local12 + 1, 268435456, local17 + 1);
			}
			if (arg3 == 2) {
				this.method7788(local12, 67108864, local17);
				this.method7788(local12 - 1, 4194304, local17 + 1);
			}
			if (arg3 == 3) {
				this.method7788(local12, 268435456, local17);
				this.method7788(local12 - 1, 16777216, local17 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method7788(local12, 545259520, local17);
			this.method7788(local12, 33554432, local17 - 1);
			this.method7788(local12 + 1, 134217728, local17);
		}
		if (arg3 == 1) {
			this.method7788(local12, 41943040, local17);
			this.method7788(local12 + 1, 134217728, local17);
			this.method7788(local12, 536870912, local17 + 1);
		}
		if (arg3 == 2) {
			this.method7788(local12, 167772160, local17);
			this.method7788(local12, 536870912, local17 + 1);
			this.method7788(local12 - 1, 8388608, local17);
		}
		if (arg3 == 3) {
			this.method7788(local12, 671088640, local17);
			this.method7788(local12 - 1, 8388608, local17);
			this.method7788(local12, 33554432, local17 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7775() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9215; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt9226; local13++) {
				if (local7 == 0 || local13 == 0 || this.anInt9215 - 5 <= local7 || this.anInt9226 - 5 <= local13) {
					this.anIntArrayArray51[local7][local13] = -1;
				} else {
					this.anIntArrayArray51[local7][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg6 == arg5 && arg1 == arg0) {
				return true;
			}
		} else if (arg6 >= arg5 && arg5 + arg3 - 1 >= arg6 && arg0 >= arg0 && arg3 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(52) int local52 = arg5 - this.anInt9209;
		@Pc(57) int local57 = arg6 - this.anInt9209;
		@Pc(62) int local62 = arg1 - this.anInt9227;
		@Pc(72) int local72 = arg0 - this.anInt9227;
		if (arg3 == 1) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local52 == local57 - 1 && local62 == local72) {
						return true;
					}
					if (local57 == local52 && local62 == local72 + 1 && (this.anIntArrayArray51[local52][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local57 && local62 == local72 - 1 && (this.anIntArrayArray51[local52][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local52 && local72 + 1 == local62) {
						return true;
					}
					if (local52 == local57 - 1 && local62 == local72 && (this.anIntArrayArray51[local52][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 + 1 == local52 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local52 == local57 + 1 && local72 == local62) {
						return true;
					}
					if (local52 == local57 && local72 + 1 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local57 && local62 == local72 - 1 && (this.anIntArrayArray51[local52][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 == local52 && local72 - 1 == local62) {
						return true;
					}
					if (local52 == local57 - 1 && local62 == local72 && (this.anIntArrayArray51[local52][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local62 == local72 && (this.anIntArrayArray51[local52][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local52 == local57 - 1 && local62 == local72) {
						return true;
					}
					if (local57 == local52 && local72 + 1 == local62) {
						return true;
					}
					if (local57 + 1 == local52 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local52 == local57 && local72 - 1 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local52 == local57 - 1 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local57 && local72 + 1 == local62) {
						return true;
					}
					if (local52 == local57 + 1 && local62 == local72) {
						return true;
					}
					if (local52 == local57 && local72 - 1 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local52 == local57 - 1 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local57 && local72 + 1 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 + 1 == local52 && local72 == local62) {
						return true;
					}
					if (local57 == local52 && local62 == local72 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 - 1 == local52 && local62 == local72) {
						return true;
					}
					if (local57 == local52 && local62 == local72 + 1 && (this.anIntArrayArray51[local52][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local52 == local57 && local62 == local72 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local52 == local57 && local72 + 1 == local62 && (this.anIntArrayArray51[local52][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local52 && local62 == local72 - 1 && (this.anIntArrayArray51[local52][local62] & 0x2) == 0) {
					return true;
				}
				if (local52 == local57 - 1 && local62 == local72 && (this.anIntArrayArray51[local52][local62] & 0x8) == 0) {
					return true;
				}
				if (local57 + 1 == local52 && local72 == local62 && (this.anIntArrayArray51[local52][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(744) int local744 = arg3 + local52 - 1;
			@Pc(751) int local751 = local62 + arg3 - 1;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local52 == local57 - arg3 && local72 >= local62 && local72 <= local751) {
						return true;
					}
					if (local57 >= local52 && local57 <= local744 && local72 + 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 <= local57 && local57 <= local744 && local62 == local72 - arg3 && (this.anIntArrayArray51[local57][local751] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local52 <= local57 && local744 >= local57 && local62 == local72 + 1) {
						return true;
					}
					if (local57 - arg3 == local52 && local72 >= local62 && local72 <= local751 && (this.anIntArrayArray51[local744][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local72 >= local62 && local751 >= local72 && (this.anIntArrayArray51[local52][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local57 + 1 == local52 && local62 <= local72 && local72 <= local751) {
						return true;
					}
					if (local57 >= local52 && local57 <= local744 && local72 + 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 <= local57 && local57 <= local744 && local62 == local72 - arg3 && (this.anIntArrayArray51[local57][local751] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local52 <= local57 && local57 <= local744 && local72 - arg3 == local62) {
						return true;
					}
					if (local52 == local57 - arg3 && local62 <= local72 && local751 >= local72 && (this.anIntArrayArray51[local744][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local72 >= local62 && local751 >= local72 && (this.anIntArrayArray51[local52][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local57 - arg3 == local52 && local72 >= local62 && local72 <= local751) {
						return true;
					}
					if (local52 <= local57 && local57 <= local744 && local72 + 1 == local62) {
						return true;
					}
					if (local57 + 1 == local52 && local72 >= local62 && local72 <= local751 && (this.anIntArrayArray51[local52][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 >= local52 && local744 >= local57 && local72 - arg3 == local62 && (this.anIntArrayArray51[local57][local751] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local52 == local57 - arg3 && local72 >= local62 && local751 >= local72 && (this.anIntArrayArray51[local744][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 >= local52 && local57 <= local744 && local72 + 1 == local62) {
						return true;
					}
					if (local57 + 1 == local52 && local62 <= local72 && local751 >= local72) {
						return true;
					}
					if (local52 <= local57 && local57 <= local744 && local72 - arg3 == local62 && (this.anIntArrayArray51[local57][local751] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local52 == local57 - arg3 && local62 <= local72 && local751 >= local72 && (this.anIntArrayArray51[local744][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 >= local52 && local57 <= local744 && local62 == local72 + 1 && (this.anIntArrayArray51[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local62 <= local72 && local72 <= local751) {
						return true;
					}
					if (local52 <= local57 && local744 >= local57 && local72 - arg3 == local62) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local57 - arg3 == local52 && local72 >= local62 && local72 <= local751) {
						return true;
					}
					if (local57 >= local52 && local57 <= local744 && local72 + 1 == local62 && (this.anIntArrayArray51[local57][local62] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local57 + 1 && local62 <= local72 && local72 <= local751 && (this.anIntArrayArray51[local52][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 >= local52 && local744 >= local57 && local72 - arg3 == local62) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local57 >= local52 && local744 >= local57 && local62 == local72 + 1 && (this.anIntArrayArray51[local57][local62] & 0x2C0120) == 0) {
					return true;
				}
				if (local57 >= local52 && local57 <= local744 && local72 - arg3 == local62 && (this.anIntArrayArray51[local57][local751] & 0x2C0102) == 0) {
					return true;
				}
				if (local52 == local57 - arg3 && local72 >= local62 && local72 <= local751 && (this.anIntArrayArray51[local744][local72] & 0x2C0108) == 0) {
					return true;
				}
				if (local57 + 1 == local52 && local62 <= local72 && local72 <= local751 && (this.anIntArrayArray51[local52][local72] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIZII)V")
	public void method7778(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt9227;
		@Pc(23) int local23 = arg2 - this.anInt9209;
		if (arg0) {
			local7 |= 0x40000000;
		}
		for (@Pc(31) int local31 = local23; local31 < arg4 + local23; local31++) {
			if (local31 >= 0 && this.anInt9215 > local31) {
				for (@Pc(44) int local44 = local18; local44 < local18 + arg1; local44++) {
					if (local44 >= 0 && this.anInt9226 > local44) {
						this.method7786(local31, local7, local44);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIBIII)Z")
	public boolean method7779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg3;
		@Pc(13) int local13 = arg8 + arg2;
		@Pc(17) int local17 = arg1 + arg6;
		@Pc(21) int local21 = arg7 + arg0;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local17 == arg3 && (arg4 & 0x2) == 0) {
			local41 = arg8 <= arg0 ? arg0 : arg8;
			local52 = local13 >= local21 ? local21 : local13;
			while (local41 < local52) {
				if ((this.anIntArrayArray51[local17 - this.anInt9209 - 1][local41 - this.anInt9227] & 0x8) == 0) {
					return true;
				}
				local41++;
			}
		} else if (arg6 == local9 && (arg4 & 0x8) == 0) {
			local41 = arg0 >= arg8 ? arg0 : arg8;
			local52 = local13 < local21 ? local13 : local21;
			while (local41 < local52) {
				if ((this.anIntArrayArray51[arg6 - this.anInt9209][local41 - this.anInt9227] & 0x80) == 0) {
					return true;
				}
				local41++;
			}
		} else if (arg8 == local21 && (arg4 & 0x1) == 0) {
			local41 = arg6 < arg3 ? arg3 : arg6;
			local52 = local9 >= local17 ? local17 : local9;
			while (local52 > local41) {
				if ((this.anIntArrayArray51[local41 - this.anInt9209][local21 - this.anInt9227 - 1] & 0x2) == 0) {
					return true;
				}
				local41++;
			}
		} else if (local13 == arg0 && (arg4 & 0x4) == 0) {
			local41 = arg3 <= arg6 ? arg6 : arg3;
			local52 = local17 <= local9 ? local17 : local9;
			while (local41 < local52) {
				if ((this.anIntArrayArray51[local41 - this.anInt9209][arg0 - this.anInt9227] & 0x20) == 0) {
					return true;
				}
				local41++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9209;
		@Pc(9) int local9 = arg1 - this.anInt9227;
		this.anIntArrayArray51[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZIZII)V")
	public void method7781(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt9209;
		@Pc(13) int local13 = arg2 - this.anInt9227;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method7786(local8, 128, local13);
				this.method7786(local8 - 1, 8, local13);
			}
			if (arg4 == 1) {
				this.method7786(local8, 2, local13);
				this.method7786(local8, 32, local13 + 1);
			}
			if (arg4 == 2) {
				this.method7786(local8, 8, local13);
				this.method7786(local8 + 1, 128, local13);
			}
			if (arg4 == 3) {
				this.method7786(local8, 32, local13);
				this.method7786(local8, 2, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method7786(local8, 1, local13);
				this.method7786(local8 - 1, 16, local13 + 1);
			}
			if (arg4 == 1) {
				this.method7786(local8, 4, local13);
				this.method7786(local8 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method7786(local8, 16, local13);
				this.method7786(local8 + 1, 1, local13 - 1);
			}
			if (arg4 == 3) {
				this.method7786(local8, 64, local13);
				this.method7786(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method7786(local8, 130, local13);
				this.method7786(local8 - 1, 8, local13);
				this.method7786(local8, 32, local13 + 1);
			}
			if (arg4 == 1) {
				this.method7786(local8, 10, local13);
				this.method7786(local8, 32, local13 + 1);
				this.method7786(local8 + 1, 128, local13);
			}
			if (arg4 == 2) {
				this.method7786(local8, 40, local13);
				this.method7786(local8 + 1, 128, local13);
				this.method7786(local8, 2, local13 - 1);
			}
			if (arg4 == 3) {
				this.method7786(local8, 160, local13);
				this.method7786(local8, 2, local13 - 1);
				this.method7786(local8 - 1, 8, local13);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method7786(local8, 65536, local13);
					this.method7786(local8 - 1, 4096, local13);
				}
				if (arg4 == 1) {
					this.method7786(local8, 1024, local13);
					this.method7786(local8, 16384, local13 + 1);
				}
				if (arg4 == 2) {
					this.method7786(local8, 4096, local13);
					this.method7786(local8 + 1, 65536, local13);
				}
				if (arg4 == 3) {
					this.method7786(local8, 16384, local13);
					this.method7786(local8, 1024, local13 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method7786(local8, 512, local13);
					this.method7786(local8 - 1, 8192, local13 + 1);
				}
				if (arg4 == 1) {
					this.method7786(local8, 2048, local13);
					this.method7786(local8 + 1, 32768, local13 + 1);
				}
				if (arg4 == 2) {
					this.method7786(local8, 8192, local13);
					this.method7786(local8 + 1, 512, local13 - 1);
				}
				if (arg4 == 3) {
					this.method7786(local8, 32768, local13);
					this.method7786(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method7786(local8, 66560, local13);
					this.method7786(local8 - 1, 4096, local13);
					this.method7786(local8, 16384, local13 + 1);
				}
				if (arg4 == 1) {
					this.method7786(local8, 5120, local13);
					this.method7786(local8, 16384, local13 + 1);
					this.method7786(local8 + 1, 65536, local13);
				}
				if (arg4 == 2) {
					this.method7786(local8, 20480, local13);
					this.method7786(local8 + 1, 65536, local13);
					this.method7786(local8, 1024, local13 - 1);
				}
				if (arg4 == 3) {
					this.method7786(local8, 81920, local13);
					this.method7786(local8, 1024, local13 - 1);
					this.method7786(local8 - 1, 4096, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method7786(local8, 536870912, local13);
				this.method7786(local8 - 1, 33554432, local13);
			}
			if (arg4 == 1) {
				this.method7786(local8, 8388608, local13);
				this.method7786(local8, 134217728, local13 + 1);
			}
			if (arg4 == 2) {
				this.method7786(local8, 33554432, local13);
				this.method7786(local8 + 1, 536870912, local13);
			}
			if (arg4 == 3) {
				this.method7786(local8, 134217728, local13);
				this.method7786(local8, 8388608, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method7786(local8, 4194304, local13);
				this.method7786(local8 - 1, 67108864, local13 + 1);
			}
			if (arg4 == 1) {
				this.method7786(local8, 16777216, local13);
				this.method7786(local8 + 1, 268435456, local13 + 1);
			}
			if (arg4 == 2) {
				this.method7786(local8, 67108864, local13);
				this.method7786(local8 + 1, 4194304, local13 - 1);
			}
			if (arg4 == 3) {
				this.method7786(local8, 268435456, local13);
				this.method7786(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method7786(local8, 545259520, local13);
			this.method7786(local8 - 1, 33554432, local13);
			this.method7786(local8, 134217728, local13 + 1);
		}
		if (arg4 == 1) {
			this.method7786(local8, 41943040, local13);
			this.method7786(local8, 134217728, local13 + 1);
			this.method7786(local8 + 1, 536870912, local13);
		}
		if (arg4 == 2) {
			this.method7786(local8, 167772160, local13);
			this.method7786(local8 + 1, 536870912, local13);
			this.method7786(local8, 8388608, local13 - 1);
		}
		if (arg4 == 3) {
			this.method7786(local8, 671088640, local13);
			this.method7786(local8, 8388608, local13 - 1);
			this.method7786(local8 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V")
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9209;
		@Pc(17) int local17 = arg0 - this.anInt9227;
		this.anIntArrayArray51[local4][local17] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static219.method3187(arg3, arg0, arg4, arg2, arg3, arg7, arg5, arg1) ? true : this.method7779(arg4, arg5, arg3, arg1, arg6, arg3, arg7, arg2, arg0);
		}
		@Pc(41) int local41 = arg7 + arg5 - 1;
		@Pc(47) int local47 = arg2 + arg4 - 1;
		if (arg1 >= arg7 && local41 >= arg1 && arg4 <= arg0 && local47 >= arg0) {
			return true;
		} else if (arg1 == arg7 - 1 && arg0 >= arg4 && local47 >= arg0 && (this.anIntArrayArray51[arg1 - this.anInt9209][arg0 - this.anInt9227] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg1 == local41 + 1 && arg0 >= arg4 && local47 >= arg0 && (this.anIntArrayArray51[arg1 - this.anInt9209][arg0 - this.anInt9227] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg4 - 1 && arg1 >= arg7 && arg1 <= local41 && (this.anIntArrayArray51[arg1 - this.anInt9209][arg0 - this.anInt9227] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local47 + 1 && arg7 <= arg1 && local41 >= arg1 && (this.anIntArrayArray51[arg1 - this.anInt9209][arg0 - this.anInt9227] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(III)V")
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt9227;
		@Pc(9) int local9 = arg1 - this.anInt9209;
		this.anIntArrayArray51[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V")
	private void method7786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray51[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(III)V")
	public void method7787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt9209;
		@Pc(13) int local13 = arg0 - this.anInt9227;
		this.anIntArrayArray51[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBII)V")
	private void method7788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray51[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIZIIZ)V")
	public void method7789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(25) int local25;
		if (arg5 == 1 || arg5 == 3) {
			local25 = arg2;
			arg2 = arg3;
			arg3 = local25;
		}
		if (arg6) {
			local7 |= 0x40000000;
		}
		@Pc(45) int local45 = arg1 - this.anInt9227;
		@Pc(50) int local50 = arg0 - this.anInt9209;
		for (local25 = local50; local25 < local50 + arg2; local25++) {
			if (local25 >= 0 && local25 < this.anInt9215) {
				for (@Pc(69) int local69 = local45; local69 < local45 + arg3; local69++) {
					if (local69 >= 0 && this.anInt9226 > local69) {
						this.method7788(local69, local7, local25);
					}
				}
			}
		}
	}
}
