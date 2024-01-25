import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class252 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
	public int anInt6831;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
	public int anInt6837;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
	public int anInt6844;

	@OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
	public int anInt6850;

	@OriginalMember(owner = "client!oga", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)V")
	public void method6160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6837;
		@Pc(13) int local13 = arg0 - this.anInt6831;
		this.anIntArrayArray45[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)V")
	public void method6161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6831;
		@Pc(13) int local13 = arg1 - this.anInt6837;
		this.anIntArrayArray45[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method6162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg6 + arg1;
		@Pc(12) int local12 = arg5 + arg2;
		@Pc(23) int local23 = arg3 + arg0;
		@Pc(27) int local27 = arg4 + arg8;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (arg1 == local23 && (arg7 & 0x2) == 0) {
			local48 = arg4 >= arg5 ? arg4 : arg5;
			local55 = local12 >= local27 ? local27 : local12;
			while (local48 < local55) {
				if ((this.anIntArrayArray45[local23 - this.anInt6837 - 1][local48 - this.anInt6831] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg0 == local7 && (arg7 & 0x8) == 0) {
			local48 = arg4 >= arg5 ? arg4 : arg5;
			local55 = local12 >= local27 ? local27 : local12;
			while (local55 > local48) {
				if ((this.anIntArrayArray45[arg0 - this.anInt6837][local48 - this.anInt6831] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local27 == arg5 && (arg7 & 0x1) == 0) {
			local48 = arg0 >= arg1 ? arg0 : arg1;
			local55 = local7 < local23 ? local7 : local23;
			while (local48 < local55) {
				if ((this.anIntArrayArray45[local48 - this.anInt6837][local27 - this.anInt6831 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg4 == local12 && (arg7 & 0x4) == 0) {
			local48 = arg1 <= arg0 ? arg0 : arg1;
			local55 = local7 < local23 ? local7 : local23;
			while (local55 > local48) {
				if ((this.anIntArrayArray45[local48 - this.anInt6837][arg4 - this.anInt6831] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg3 && arg2 == arg1) {
				return true;
			}
		} else if (arg6 <= arg3 && arg6 + arg4 - 1 >= arg3 && arg1 <= arg1 && arg1 + arg4 - 1 >= arg1) {
			return true;
		}
		@Pc(58) int local58 = arg6 - this.anInt6837;
		@Pc(63) int local63 = arg3 - this.anInt6837;
		@Pc(68) int local68 = arg1 - this.anInt6831;
		@Pc(73) int local73 = arg2 - this.anInt6831;
		if (arg4 == 1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local63 - 1 == local58 && local73 == local68) {
						return true;
					}
					if (local58 == local63 && local68 + 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local58 && local73 == local68 - 1 && (this.anIntArrayArray45[local58][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 == local58 && local68 + 1 == local73) {
						return true;
					}
					if (local58 == local63 - 1 && local73 == local68 && (this.anIntArrayArray45[local58][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local63 + 1 && local68 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 + 1 == local58 && local68 == local73) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local63 && local73 == local68 - 1 && (this.anIntArrayArray45[local58][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 == local58 && local73 == local68 - 1) {
						return true;
					}
					if (local63 - 1 == local58 && local73 == local68 && (this.anIntArrayArray45[local58][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local58 && local73 == local68 && (this.anIntArrayArray45[local58][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local63 - 1 == local58 && local68 == local73) {
						return true;
					}
					if (local63 == local58 && local73 == local68 + 1) {
						return true;
					}
					if (local58 == local63 + 1 && local68 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local63 && local73 == local68 - 1 && (this.anIntArrayArray45[local58][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 - 1 == local58 && local73 == local68 && (this.anIntArrayArray45[local58][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local63 && local68 + 1 == local73) {
						return true;
					}
					if (local63 + 1 == local58 && local68 == local73) {
						return true;
					}
					if (local63 == local58 && local68 - 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 == local63 - 1 && local68 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local63 && local68 + 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local63 + 1 && local68 == local73) {
						return true;
					}
					if (local58 == local63 && local68 - 1 == local73) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 == local63 - 1 && local73 == local68) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local63 + 1 && local73 == local68 && (this.anIntArrayArray45[local58][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local63 && local68 - 1 == local73) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local58 == local63 && local68 + 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x20) == 0) {
					return true;
				}
				if (local58 == local63 && local68 - 1 == local73 && (this.anIntArrayArray45[local58][local73] & 0x2) == 0) {
					return true;
				}
				if (local58 == local63 - 1 && local68 == local73 && (this.anIntArrayArray45[local58][local73] & 0x8) == 0) {
					return true;
				}
				if (local58 == local63 + 1 && local68 == local73 && (this.anIntArrayArray45[local58][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(92) int local92 = arg4 + local58 - 1;
			@Pc(98) int local98 = arg4 + local73 - 1;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local58 == local63 - arg4 && local68 >= local73 && local98 >= local68) {
						return true;
					}
					if (local58 <= local63 && local63 <= local92 && local73 == local68 + 1 && (this.anIntArrayArray45[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 >= local58 && local63 <= local92 && local73 == local68 - arg4 && (this.anIntArrayArray45[local63][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 <= local63 && local92 >= local63 && local68 + 1 == local73) {
						return true;
					}
					if (local58 == local63 - arg4 && local73 <= local68 && local68 <= local98 && (this.anIntArrayArray45[local92][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local58 && local73 <= local68 && local98 >= local68 && (this.anIntArrayArray45[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 + 1 == local58 && local73 <= local68 && local98 >= local68) {
						return true;
					}
					if (local63 >= local58 && local92 >= local63 && local68 + 1 == local73 && (this.anIntArrayArray45[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 >= local58 && local63 <= local92 && local68 - arg4 == local73 && (this.anIntArrayArray45[local63][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 <= local63 && local92 >= local63 && local68 - arg4 == local73) {
						return true;
					}
					if (local58 == local63 - arg4 && local68 >= local73 && local98 >= local68 && (this.anIntArrayArray45[local92][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 + 1 == local58 && local68 >= local73 && local98 >= local68 && (this.anIntArrayArray45[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local63 - arg4 == local58 && local73 <= local68 && local98 >= local68) {
						return true;
					}
					if (local63 >= local58 && local92 >= local63 && local73 == local68 + 1) {
						return true;
					}
					if (local63 + 1 == local58 && local68 >= local73 && local68 <= local98 && (this.anIntArrayArray45[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 <= local63 && local92 >= local63 && local73 == local68 - arg4 && (this.anIntArrayArray45[local63][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local63 - arg4 == local58 && local68 >= local73 && local68 <= local98 && (this.anIntArrayArray45[local92][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 <= local63 && local92 >= local63 && local68 + 1 == local73) {
						return true;
					}
					if (local58 == local63 + 1 && local68 >= local73 && local68 <= local98) {
						return true;
					}
					if (local58 <= local63 && local63 <= local92 && local68 - arg4 == local73 && (this.anIntArrayArray45[local63][local98] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local63 - arg4 == local58 && local68 >= local73 && local68 <= local98 && (this.anIntArrayArray45[local92][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 >= local58 && local63 <= local92 && local68 + 1 == local73 && (this.anIntArrayArray45[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 + 1 == local58 && local68 >= local73 && local68 <= local98) {
						return true;
					}
					if (local58 <= local63 && local92 >= local63 && local68 - arg4 == local73) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 - arg4 == local58 && local68 >= local73 && local68 <= local98) {
						return true;
					}
					if (local58 <= local63 && local63 <= local92 && local73 == local68 + 1 && (this.anIntArrayArray45[local63][local73] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 + 1 == local58 && local68 >= local73 && local98 >= local68 && (this.anIntArrayArray45[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 >= local58 && local92 >= local63 && local68 - arg4 == local73) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local58 <= local63 && local92 >= local63 && local73 == local68 + 1 && (this.anIntArrayArray45[local63][local73] & 0x2C0120) == 0) {
					return true;
				}
				if (local58 <= local63 && local63 <= local92 && local68 - arg4 == local73 && (this.anIntArrayArray45[local63][local98] & 0x2C0102) == 0) {
					return true;
				}
				if (local58 == local63 - arg4 && local68 >= local73 && local98 >= local68 && (this.anIntArrayArray45[local92][local68] & 0x2C0108) == 0) {
					return true;
				}
				if (local58 == local63 + 1 && local68 >= local73 && local68 <= local98 && (this.anIntArrayArray45[local58][local68] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZIIZII)V")
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg0 - this.anInt6831;
		@Pc(18) int local18 = arg5 - this.anInt6837;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method6170(128, local18, local13);
				this.method6170(8, local18 - 1, local13);
			}
			if (arg4 == 1) {
				this.method6170(2, local18, local13);
				this.method6170(32, local18, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6170(8, local18, local13);
				this.method6170(128, local18 + 1, local13);
			}
			if (arg4 == 3) {
				this.method6170(32, local18, local13);
				this.method6170(2, local18, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method6170(1, local18, local13);
				this.method6170(16, local18 - 1, local13 + 1);
			}
			if (arg4 == 1) {
				this.method6170(4, local18, local13);
				this.method6170(64, local18 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6170(16, local18, local13);
				this.method6170(1, local18 + 1, local13 + -1);
			}
			if (arg4 == 3) {
				this.method6170(64, local18, local13);
				this.method6170(4, local18 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method6170(130, local18, local13);
				this.method6170(8, local18 - 1, local13);
				this.method6170(32, local18, local13 + 1);
			}
			if (arg4 == 1) {
				this.method6170(10, local18, local13);
				this.method6170(32, local18, local13 + 1);
				this.method6170(128, local18 + 1, local13);
			}
			if (arg4 == 2) {
				this.method6170(40, local18, local13);
				this.method6170(128, local18 + 1, local13);
				this.method6170(2, local18, local13 - 1);
			}
			if (arg4 == 3) {
				this.method6170(160, local18, local13);
				this.method6170(2, local18, local13 - 1);
				this.method6170(8, local18 - 1, local13);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method6170(65536, local18, local13);
					this.method6170(4096, local18 - 1, local13);
				}
				if (arg4 == 1) {
					this.method6170(1024, local18, local13);
					this.method6170(16384, local18, local13 + 1);
				}
				if (arg4 == 2) {
					this.method6170(4096, local18, local13);
					this.method6170(65536, local18 + 1, local13);
				}
				if (arg4 == 3) {
					this.method6170(16384, local18, local13);
					this.method6170(1024, local18, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method6170(512, local18, local13);
					this.method6170(8192, local18 - 1, local13 - -1);
				}
				if (arg4 == 1) {
					this.method6170(2048, local18, local13);
					this.method6170(32768, local18 + 1, local13 + 1);
				}
				if (arg4 == 2) {
					this.method6170(8192, local18, local13);
					this.method6170(512, local18 + 1, local13 + -1);
				}
				if (arg4 == 3) {
					this.method6170(32768, local18, local13);
					this.method6170(2048, local18 - 1, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method6170(66560, local18, local13);
					this.method6170(4096, local18 - 1, local13);
					this.method6170(16384, local18, local13 + 1);
				}
				if (arg4 == 1) {
					this.method6170(5120, local18, local13);
					this.method6170(16384, local18, local13 + 1);
					this.method6170(65536, local18 + 1, local13);
				}
				if (arg4 == 2) {
					this.method6170(20480, local18, local13);
					this.method6170(65536, local18 + 1, local13);
					this.method6170(1024, local18, local13 - 1);
				}
				if (arg4 == 3) {
					this.method6170(81920, local18, local13);
					this.method6170(1024, local18, local13 - 1);
					this.method6170(4096, local18 - 1, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method6170(536870912, local18, local13);
				this.method6170(33554432, local18 - 1, local13);
			}
			if (arg4 == 1) {
				this.method6170(8388608, local18, local13);
				this.method6170(134217728, local18, local13 + 1);
			}
			if (arg4 == 2) {
				this.method6170(33554432, local18, local13);
				this.method6170(536870912, local18 + 1, local13);
			}
			if (arg4 == 3) {
				this.method6170(134217728, local18, local13);
				this.method6170(8388608, local18, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method6170(4194304, local18, local13);
				this.method6170(67108864, local18 - 1, local13 - -1);
			}
			if (arg4 == 1) {
				this.method6170(16777216, local18, local13);
				this.method6170(268435456, local18 + 1, local13 - -1);
			}
			if (arg4 == 2) {
				this.method6170(67108864, local18, local13);
				this.method6170(4194304, local18 + 1, local13 + -1);
			}
			if (arg4 == 3) {
				this.method6170(268435456, local18, local13);
				this.method6170(16777216, local18 - 1, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method6170(545259520, local18, local13);
			this.method6170(33554432, local18 - 1, local13);
			this.method6170(134217728, local18, local13 + 1);
		}
		if (arg4 == 1) {
			this.method6170(41943040, local18, local13);
			this.method6170(134217728, local18, local13 + 1);
			this.method6170(536870912, local18 + 1, local13);
		}
		if (arg4 == 2) {
			this.method6170(167772160, local18, local13);
			this.method6170(536870912, local18 + 1, local13);
			this.method6170(8388608, local18, local13 - 1);
		}
		if (arg4 == 3) {
			this.method6170(671088640, local18, local13);
			this.method6170(8388608, local18, local13 - 1);
			this.method6170(33554432, local18 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIB)V")
	public void method6165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6831;
		@Pc(9) int local9 = arg0 - this.anInt6837;
		this.anIntArrayArray45[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZIIIIZI)V")
	public void method6166(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(24) int local24 = arg3 - this.anInt6837;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(35) int local35 = arg1 - this.anInt6831;
		for (@Pc(37) int local37 = local24; local37 < arg4 + local24; local37++) {
			if (local37 >= 0 && local37 < this.anInt6850) {
				for (@Pc(50) int local50 = local35; local50 < local35 + arg2; local50++) {
					if (local50 >= 0 && this.anInt6844 > local50) {
						this.method6170(local7, local37, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BIIIZIZI)V")
	public void method6167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg6 - this.anInt6837;
		@Pc(28) int local28;
		if (arg4 == 1 || arg4 == 3) {
			local28 = arg0;
			arg0 = arg1;
			arg1 = local28;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(49) int local49 = arg2 - this.anInt6831;
		for (local28 = local18; local28 < arg0 + local18; local28++) {
			if (local28 >= 0 && this.anInt6850 > local28) {
				for (@Pc(65) int local65 = local49; local65 < local49 + arg1; local65++) {
					if (local65 >= 0 && local65 < this.anInt6844) {
						this.method6174(local28, local65, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static510.method4484(arg1, arg6, arg4, arg2, arg5, arg7, arg7, arg0) ? true : this.method6162(arg4, arg5, arg7, arg1, arg6, arg0, arg7, arg3, arg2);
		}
		@Pc(48) int local48 = arg1 + arg4 - 1;
		@Pc(55) int local55 = arg6 + arg2 - 1;
		if (arg5 >= arg4 && local48 >= arg5 && arg6 <= arg0 && arg0 <= local55) {
			return true;
		} else if (arg5 == arg4 - 1 && arg6 <= arg0 && local55 >= arg0 && (this.anIntArrayArray45[arg5 - this.anInt6837][arg0 - this.anInt6831] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg5 == local48 + 1 && arg0 >= arg6 && local55 >= arg0 && (this.anIntArrayArray45[arg5 - this.anInt6837][arg0 - this.anInt6831] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg0 && arg4 <= arg5 && arg5 <= local48 && (this.anIntArrayArray45[arg5 - this.anInt6837][arg0 - this.anInt6831] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local55 + 1 && arg5 >= arg4 && arg5 <= local48 && (this.anIntArrayArray45[arg5 - this.anInt6837][arg0 - this.anInt6831] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public void method6169() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6850; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt6844; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt6850 - 5 <= local11 || local15 >= this.anInt6844 - 5) {
					this.anIntArrayArray45[local11][local15] = -1;
				} else {
					this.anIntArrayArray45[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIII)V")
	private void method6170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray45[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg1 && arg5 == arg4) {
				return true;
			}
		} else if (arg1 >= arg2 && arg2 + arg6 - 1 >= arg1 && arg5 <= arg5 && arg5 <= arg5 + arg6 - 1) {
			return true;
		}
		@Pc(41) int local41 = arg5 - this.anInt6831;
		@Pc(46) int local46 = arg1 - this.anInt6837;
		@Pc(59) int local59 = arg2 - this.anInt6837;
		@Pc(64) int local64 = arg4 - this.anInt6831;
		if (arg6 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local46 + 1 && local64 == local41 && (this.anIntArrayArray45[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local46 == local59 && local64 == local41 - 1 && (this.anIntArrayArray45[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 == local46 - 1 && local64 == local41 && (this.anIntArrayArray45[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local46 == local59 && local41 - 1 == local64 && (this.anIntArrayArray45[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local46 - 1 == local59 && local64 == local41 && (this.anIntArrayArray45[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 == local46 && local41 + 1 == local64 && (this.anIntArrayArray45[local59][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 == local46 + 1 && local41 == local64 && (this.anIntArrayArray45[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local46 == local59 && local64 == local41 + 1 && (this.anIntArrayArray45[local59][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local59 == local46 && local41 + 1 == local64 && (this.anIntArrayArray45[local59][local64] & 0x20) == 0) {
					return true;
				}
				if (local46 == local59 && local64 == local41 - 1 && (this.anIntArrayArray45[local59][local64] & 0x2) == 0) {
					return true;
				}
				if (local59 == local46 - 1 && local64 == local41 && (this.anIntArrayArray45[local59][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 == local46 + 1 && local64 == local41 && (this.anIntArrayArray45[local59][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(73) int local73 = arg6 + local59 - 1;
			@Pc(79) int local79 = arg6 + local64 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local46 + 1 == local59 && local64 <= local41 && local79 >= local41 && (this.anIntArrayArray45[local59][local41] & 0x80) == 0) {
						return true;
					}
					if (local46 >= local59 && local73 >= local46 && local41 - arg6 == local64 && (this.anIntArrayArray45[local46][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local46 - arg6 == local59 && local41 >= local64 && local41 <= local79 && (this.anIntArrayArray45[local73][local41] & 0x8) == 0) {
						return true;
					}
					if (local46 >= local59 && local46 <= local73 && local64 == local41 - arg6 && (this.anIntArrayArray45[local46][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local46 - arg6 && local64 <= local41 && local79 >= local41 && (this.anIntArrayArray45[local73][local41] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local46 && local73 >= local46 && local64 == local41 + 1 && (this.anIntArrayArray45[local46][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local46 + 1 == local59 && local41 >= local64 && local41 <= local79 && (this.anIntArrayArray45[local59][local41] & 0x80) == 0) {
						return true;
					}
					if (local46 >= local59 && local73 >= local46 && local64 == local41 + 1 && (this.anIntArrayArray45[local46][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local46 >= local59 && local46 <= local73 && local64 == local41 + 1 && (this.anIntArrayArray45[local46][local64] & 0x20) == 0) {
					return true;
				}
				if (local59 <= local46 && local46 <= local73 && local41 - arg6 == local64 && (this.anIntArrayArray45[local46][local79] & 0x2) == 0) {
					return true;
				}
				if (local46 - arg6 == local59 && local41 >= local64 && local79 >= local41 && (this.anIntArrayArray45[local73][local41] & 0x8) == 0) {
					return true;
				}
				if (local46 + 1 == local59 && local64 <= local41 && local41 <= local79 && (this.anIntArrayArray45[local59][local41] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(III)V")
	public void method6173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6837;
		@Pc(25) int local25 = arg0 - this.anInt6831;
		this.anIntArrayArray45[local8][local25] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(IIII)V")
	private void method6174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray45[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIBZIZ)V")
	public void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt6837;
		@Pc(9) int local9 = arg4 - this.anInt6831;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method6174(local4, local9, 128);
				this.method6174(local4 - 1, local9, 8);
			}
			if (arg0 == 1) {
				this.method6174(local4, local9, 2);
				this.method6174(local4, local9 + 1, 32);
			}
			if (arg0 == 2) {
				this.method6174(local4, local9, 8);
				this.method6174(local4 + 1, local9, 128);
			}
			if (arg0 == 3) {
				this.method6174(local4, local9, 32);
				this.method6174(local4, local9 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method6174(local4, local9, 1);
				this.method6174(local4 - 1, local9 + 1, 16);
			}
			if (arg0 == 1) {
				this.method6174(local4, local9, 4);
				this.method6174(local4 + 1, local9 + 1, 64);
			}
			if (arg0 == 2) {
				this.method6174(local4, local9, 16);
				this.method6174(local4 + 1, local9 + -1, 1);
			}
			if (arg0 == 3) {
				this.method6174(local4, local9, 64);
				this.method6174(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method6174(local4, local9, 130);
				this.method6174(local4 - 1, local9, 8);
				this.method6174(local4, local9 + 1, 32);
			}
			if (arg0 == 1) {
				this.method6174(local4, local9, 10);
				this.method6174(local4, local9 + 1, 32);
				this.method6174(local4 + 1, local9, 128);
			}
			if (arg0 == 2) {
				this.method6174(local4, local9, 40);
				this.method6174(local4 + 1, local9, 128);
				this.method6174(local4, local9 - 1, 2);
			}
			if (arg0 == 3) {
				this.method6174(local4, local9, 160);
				this.method6174(local4, local9 - 1, 2);
				this.method6174(local4 - 1, local9, 8);
			}
		}
		if (arg5) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method6174(local4, local9, 65536);
					this.method6174(local4 - 1, local9, 4096);
				}
				if (arg0 == 1) {
					this.method6174(local4, local9, 1024);
					this.method6174(local4, local9 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method6174(local4, local9, 4096);
					this.method6174(local4 + 1, local9, 65536);
				}
				if (arg0 == 3) {
					this.method6174(local4, local9, 16384);
					this.method6174(local4, local9 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method6174(local4, local9, 512);
					this.method6174(local4 - 1, local9 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method6174(local4, local9, 2048);
					this.method6174(local4 + 1, local9 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method6174(local4, local9, 8192);
					this.method6174(local4 + 1, local9 + -1, 512);
				}
				if (arg0 == 3) {
					this.method6174(local4, local9, 32768);
					this.method6174(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method6174(local4, local9, 66560);
					this.method6174(local4 - 1, local9, 4096);
					this.method6174(local4, local9 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method6174(local4, local9, 5120);
					this.method6174(local4, local9 + 1, 16384);
					this.method6174(local4 + 1, local9, 65536);
				}
				if (arg0 == 2) {
					this.method6174(local4, local9, 20480);
					this.method6174(local4 + 1, local9, 65536);
					this.method6174(local4, local9 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method6174(local4, local9, 81920);
					this.method6174(local4, local9 - 1, 1024);
					this.method6174(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method6174(local4, local9, 536870912);
				this.method6174(local4 - 1, local9, 33554432);
			}
			if (arg0 == 1) {
				this.method6174(local4, local9, 8388608);
				this.method6174(local4, local9 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method6174(local4, local9, 33554432);
				this.method6174(local4 + 1, local9, 536870912);
			}
			if (arg0 == 3) {
				this.method6174(local4, local9, 134217728);
				this.method6174(local4, local9 - 1, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method6174(local4, local9, 4194304);
				this.method6174(local4 - 1, local9 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method6174(local4, local9, 16777216);
				this.method6174(local4 + 1, local9 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method6174(local4, local9, 67108864);
				this.method6174(local4 + 1, local9 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method6174(local4, local9, 268435456);
				this.method6174(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method6174(local4, local9, 545259520);
			this.method6174(local4 - 1, local9, 33554432);
			this.method6174(local4, local9 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method6174(local4, local9, 41943040);
			this.method6174(local4, local9 + 1, 134217728);
			this.method6174(local4 + 1, local9, 536870912);
		}
		if (arg0 == 2) {
			this.method6174(local4, local9, 167772160);
			this.method6174(local4 + 1, local9, 536870912);
			this.method6174(local4, local9 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method6174(local4, local9, 671088640);
			this.method6174(local4, local9 - 1, 8388608);
			this.method6174(local4 - 1, local9, 33554432);
			return;
		}
	}
}
