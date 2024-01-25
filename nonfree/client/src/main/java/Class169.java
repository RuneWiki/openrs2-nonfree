import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class169 {

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
	public int anInt4631;

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray105;

	@OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
	public int anInt4642;

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
	public int anInt4643;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg5 == arg4 && arg6 == arg1) {
				return true;
			}
		} else if (arg4 <= arg5 && arg5 <= arg0 + arg4 - 1 && arg1 >= arg1 && arg1 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg4 - this.anInt4643;
		@Pc(68) int local68 = arg1 - this.anInt4631;
		@Pc(73) int local73 = arg5 - this.anInt4643;
		@Pc(78) int local78 = arg6 - this.anInt4631;
		if (arg0 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local73 - 1 == local58 && local78 == local68) {
						return true;
					}
					if (local73 == local58 && local78 == local68 + 1 && (this.anIntArrayArray105[local58][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local73 && local78 == local68 - 1 && (this.anIntArrayArray105[local58][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 == local73 && local78 == local68 + 1) {
						return true;
					}
					if (local58 == local73 - 1 && local68 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local58 && local78 == local68 && (this.anIntArrayArray105[local58][local78] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local73 + 1 == local58 && local78 == local68) {
						return true;
					}
					if (local73 == local58 && local68 + 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local58 && local68 - 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 == local58 && local78 == local68 - 1) {
						return true;
					}
					if (local73 - 1 == local58 && local68 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local73 + 1 && local68 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local58 == local73 - 1 && local68 == local78) {
						return true;
					}
					if (local73 == local58 && local68 + 1 == local78) {
						return true;
					}
					if (local73 + 1 == local58 && local78 == local68 && (this.anIntArrayArray105[local58][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local73 && local68 - 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local73 - 1 == local58 && local68 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local58 && local68 + 1 == local78) {
						return true;
					}
					if (local58 == local73 + 1 && local68 == local78) {
						return true;
					}
					if (local73 == local58 && local68 - 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local73 - 1 == local58 && local68 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local58 && local68 + 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local73 + 1 && local78 == local68) {
						return true;
					}
					if (local58 == local73 && local68 - 1 == local78) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 - 1 == local58 && local78 == local68) {
						return true;
					}
					if (local58 == local73 && local68 + 1 == local78 && (this.anIntArrayArray105[local58][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local73 + 1 && local78 == local68 && (this.anIntArrayArray105[local58][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local73 && local78 == local68 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local58 == local73 && local78 == local68 + 1 && (this.anIntArrayArray105[local58][local78] & 0x20) == 0) {
					return true;
				}
				if (local58 == local73 && local78 == local68 - 1 && (this.anIntArrayArray105[local58][local78] & 0x2) == 0) {
					return true;
				}
				if (local58 == local73 - 1 && local78 == local68 && (this.anIntArrayArray105[local58][local78] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local58 && local78 == local68 && (this.anIntArrayArray105[local58][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = arg0 + local58 - 1;
			@Pc(93) int local93 = local78 + arg0 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local58 == local73 - arg0 && local68 >= local78 && local93 >= local68) {
						return true;
					}
					if (local58 <= local73 && local73 <= local87 && local68 + 1 == local78 && (this.anIntArrayArray105[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 >= local58 && local73 <= local87 && local68 - arg0 == local78 && (this.anIntArrayArray105[local73][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local73 >= local58 && local73 <= local87 && local68 + 1 == local78) {
						return true;
					}
					if (local58 == local73 - arg0 && local78 <= local68 && local68 <= local93 && (this.anIntArrayArray105[local87][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local58 && local68 >= local78 && local93 >= local68 && (this.anIntArrayArray105[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local58 == local73 + 1 && local78 <= local68 && local93 >= local68) {
						return true;
					}
					if (local73 >= local58 && local73 <= local87 && local68 + 1 == local78 && (this.anIntArrayArray105[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 >= local58 && local73 <= local87 && local68 - arg0 == local78 && (this.anIntArrayArray105[local73][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 <= local73 && local87 >= local73 && local78 == local68 - arg0) {
						return true;
					}
					if (local58 == local73 - arg0 && local68 >= local78 && local93 >= local68 && (this.anIntArrayArray105[local87][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local73 + 1 && local78 <= local68 && local93 >= local68 && (this.anIntArrayArray105[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local73 - arg0 == local58 && local68 >= local78 && local68 <= local93) {
						return true;
					}
					if (local73 >= local58 && local87 >= local73 && local78 == local68 + 1) {
						return true;
					}
					if (local58 == local73 + 1 && local78 <= local68 && local68 <= local93 && (this.anIntArrayArray105[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 <= local73 && local73 <= local87 && local78 == local68 - arg0 && (this.anIntArrayArray105[local73][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 == local73 - arg0 && local68 >= local78 && local68 <= local93 && (this.anIntArrayArray105[local87][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 <= local73 && local73 <= local87 && local68 + 1 == local78) {
						return true;
					}
					if (local58 == local73 + 1 && local68 >= local78 && local93 >= local68) {
						return true;
					}
					if (local73 >= local58 && local87 >= local73 && local78 == local68 - arg0 && (this.anIntArrayArray105[local73][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local73 - arg0 == local58 && local68 >= local78 && local93 >= local68 && (this.anIntArrayArray105[local87][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 <= local73 && local87 >= local73 && local78 == local68 + 1 && (this.anIntArrayArray105[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local73 + 1 && local78 <= local68 && local93 >= local68) {
						return true;
					}
					if (local58 <= local73 && local73 <= local87 && local78 == local68 - arg0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 - arg0 == local58 && local68 >= local78 && local93 >= local68) {
						return true;
					}
					if (local73 >= local58 && local73 <= local87 && local68 + 1 == local78 && (this.anIntArrayArray105[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local58 && local68 >= local78 && local93 >= local68 && (this.anIntArrayArray105[local58][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 >= local58 && local73 <= local87 && local78 == local68 - arg0) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local73 >= local58 && local73 <= local87 && local68 + 1 == local78 && (this.anIntArrayArray105[local73][local78] & 0x2C0120) == 0) {
					return true;
				}
				if (local58 <= local73 && local73 <= local87 && local68 - arg0 == local78 && (this.anIntArrayArray105[local73][local93] & 0x2C0102) == 0) {
					return true;
				}
				if (local73 - arg0 == local58 && local78 <= local68 && local68 <= local93 && (this.anIntArrayArray105[local87][local68] & 0x2C0108) == 0) {
					return true;
				}
				if (local73 + 1 == local58 && local68 >= local78 && local68 <= local93 && (this.anIntArrayArray105[local58][local68] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V")
	public void method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt4631;
		@Pc(13) int local13 = arg1 - this.anInt4643;
		this.anIntArrayArray105[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIII)V")
	private void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray105[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBIZIIZ)V")
	public void method4027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(28) int local28 = arg4 - this.anInt4631;
		@Pc(33) int local33 = arg3 - this.anInt4643;
		for (@Pc(35) int local35 = local33; local35 < arg0 + local33; local35++) {
			if (local35 >= 0 && this.anInt4642 > local35) {
				for (@Pc(48) int local48 = local28; local48 < local28 + arg1; local48++) {
					if (local48 >= 0 && this.anInt4628 > local48) {
						this.method4026(local7, local35, local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZZBIIII)V")
	public void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(25) int local25;
		if (arg6 == 1 || arg6 == 3) {
			local25 = arg0;
			arg0 = arg5;
			arg5 = local25;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(40) int local40 = arg3 - this.anInt4643;
		@Pc(45) int local45 = arg4 - this.anInt4631;
		for (local25 = local40; local25 < local40 + arg0; local25++) {
			if (local25 >= 0 && local25 < this.anInt4642) {
				for (@Pc(63) int local63 = local45; local63 < local45 + arg5; local63++) {
					if (local63 >= 0 && local63 < this.anInt4628) {
						this.method4034(local25, local7, local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIB)V")
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt4631;
		@Pc(17) int local17 = arg0 - this.anInt4643;
		this.anIntArrayArray105[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIZZ)V")
	public void method4030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt4631;
		@Pc(13) int local13 = arg1 - this.anInt4643;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4026(128, local13, local8);
				this.method4026(8, local13 - 1, local8);
			}
			if (arg0 == 1) {
				this.method4026(2, local13, local8);
				this.method4026(32, local13, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4026(8, local13, local8);
				this.method4026(128, local13 + 1, local8);
			}
			if (arg0 == 3) {
				this.method4026(32, local13, local8);
				this.method4026(2, local13, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4026(1, local13, local8);
				this.method4026(16, local13 - 1, local8 - -1);
			}
			if (arg0 == 1) {
				this.method4026(4, local13, local8);
				this.method4026(64, local13 + 1, local8 - -1);
			}
			if (arg0 == 2) {
				this.method4026(16, local13, local8);
				this.method4026(1, local13 + 1, local8 - 1);
			}
			if (arg0 == 3) {
				this.method4026(64, local13, local8);
				this.method4026(4, local13 - 1, local8 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method4026(130, local13, local8);
				this.method4026(8, local13 - 1, local8);
				this.method4026(32, local13, local8 + 1);
			}
			if (arg0 == 1) {
				this.method4026(10, local13, local8);
				this.method4026(32, local13, local8 + 1);
				this.method4026(128, local13 + 1, local8);
			}
			if (arg0 == 2) {
				this.method4026(40, local13, local8);
				this.method4026(128, local13 + 1, local8);
				this.method4026(2, local13, local8 - 1);
			}
			if (arg0 == 3) {
				this.method4026(160, local13, local8);
				this.method4026(2, local13, local8 - 1);
				this.method4026(8, local13 - 1, local8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method4026(65536, local13, local8);
					this.method4026(4096, local13 - 1, local8);
				}
				if (arg0 == 1) {
					this.method4026(1024, local13, local8);
					this.method4026(16384, local13, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4026(4096, local13, local8);
					this.method4026(65536, local13 + 1, local8);
				}
				if (arg0 == 3) {
					this.method4026(16384, local13, local8);
					this.method4026(1024, local13, local8 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method4026(512, local13, local8);
					this.method4026(8192, local13 - 1, local8 + 1);
				}
				if (arg0 == 1) {
					this.method4026(2048, local13, local8);
					this.method4026(32768, local13 + 1, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4026(8192, local13, local8);
					this.method4026(512, local13 + 1, local8 - 1);
				}
				if (arg0 == 3) {
					this.method4026(32768, local13, local8);
					this.method4026(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method4026(66560, local13, local8);
					this.method4026(4096, local13 - 1, local8);
					this.method4026(16384, local13, local8 + 1);
				}
				if (arg0 == 1) {
					this.method4026(5120, local13, local8);
					this.method4026(16384, local13, local8 + 1);
					this.method4026(65536, local13 + 1, local8);
				}
				if (arg0 == 2) {
					this.method4026(20480, local13, local8);
					this.method4026(65536, local13 + 1, local8);
					this.method4026(1024, local13, local8 - 1);
				}
				if (arg0 == 3) {
					this.method4026(81920, local13, local8);
					this.method4026(1024, local13, local8 - 1);
					this.method4026(4096, local13 - 1, local8);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4026(536870912, local13, local8);
				this.method4026(33554432, local13 - 1, local8);
			}
			if (arg0 == 1) {
				this.method4026(8388608, local13, local8);
				this.method4026(134217728, local13, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4026(33554432, local13, local8);
				this.method4026(536870912, local13 + 1, local8);
			}
			if (arg0 == 3) {
				this.method4026(134217728, local13, local8);
				this.method4026(8388608, local13, local8 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4026(4194304, local13, local8);
				this.method4026(67108864, local13 - 1, local8 - -1);
			}
			if (arg0 == 1) {
				this.method4026(16777216, local13, local8);
				this.method4026(268435456, local13 + 1, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4026(67108864, local13, local8);
				this.method4026(4194304, local13 + 1, local8 + -1);
			}
			if (arg0 == 3) {
				this.method4026(268435456, local13, local8);
				this.method4026(16777216, local13 - 1, local8 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4026(545259520, local13, local8);
			this.method4026(33554432, local13 - 1, local8);
			this.method4026(134217728, local13, local8 + 1);
		}
		if (arg0 == 1) {
			this.method4026(41943040, local13, local8);
			this.method4026(134217728, local13, local8 + 1);
			this.method4026(536870912, local13 + 1, local8);
		}
		if (arg0 == 2) {
			this.method4026(167772160, local13, local8);
			this.method4026(536870912, local13 + 1, local8);
			this.method4026(8388608, local13, local8 - 1);
		}
		if (arg0 == 3) {
			this.method4026(671088640, local13, local8);
			this.method4026(8388608, local13, local8 - 1);
			this.method4026(33554432, local13 - 1, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZIZIII)V")
	public void method4031(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt4631;
		@Pc(13) int local13 = arg4 - this.anInt4643;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4034(local13, 128, local8);
				this.method4034(local13 - 1, 8, local8);
			}
			if (arg0 == 1) {
				this.method4034(local13, 2, local8);
				this.method4034(local13, 32, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4034(local13, 8, local8);
				this.method4034(local13 + 1, 128, local8);
			}
			if (arg0 == 3) {
				this.method4034(local13, 32, local8);
				this.method4034(local13, 2, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4034(local13, 1, local8);
				this.method4034(local13 - 1, 16, local8 + 1);
			}
			if (arg0 == 1) {
				this.method4034(local13, 4, local8);
				this.method4034(local13 + 1, 64, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4034(local13, 16, local8);
				this.method4034(local13 + 1, 1, local8 - 1);
			}
			if (arg0 == 3) {
				this.method4034(local13, 64, local8);
				this.method4034(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method4034(local13, 130, local8);
				this.method4034(local13 - 1, 8, local8);
				this.method4034(local13, 32, local8 + 1);
			}
			if (arg0 == 1) {
				this.method4034(local13, 10, local8);
				this.method4034(local13, 32, local8 + 1);
				this.method4034(local13 + 1, 128, local8);
			}
			if (arg0 == 2) {
				this.method4034(local13, 40, local8);
				this.method4034(local13 + 1, 128, local8);
				this.method4034(local13, 2, local8 - 1);
			}
			if (arg0 == 3) {
				this.method4034(local13, 160, local8);
				this.method4034(local13, 2, local8 - 1);
				this.method4034(local13 - 1, 8, local8);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method4034(local13, 65536, local8);
					this.method4034(local13 - 1, 4096, local8);
				}
				if (arg0 == 1) {
					this.method4034(local13, 1024, local8);
					this.method4034(local13, 16384, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4034(local13, 4096, local8);
					this.method4034(local13 + 1, 65536, local8);
				}
				if (arg0 == 3) {
					this.method4034(local13, 16384, local8);
					this.method4034(local13, 1024, local8 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method4034(local13, 512, local8);
					this.method4034(local13 - 1, 8192, local8 + 1);
				}
				if (arg0 == 1) {
					this.method4034(local13, 2048, local8);
					this.method4034(local13 + 1, 32768, local8 + 1);
				}
				if (arg0 == 2) {
					this.method4034(local13, 8192, local8);
					this.method4034(local13 + 1, 512, local8 - 1);
				}
				if (arg0 == 3) {
					this.method4034(local13, 32768, local8);
					this.method4034(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method4034(local13, 66560, local8);
					this.method4034(local13 - 1, 4096, local8);
					this.method4034(local13, 16384, local8 + 1);
				}
				if (arg0 == 1) {
					this.method4034(local13, 5120, local8);
					this.method4034(local13, 16384, local8 + 1);
					this.method4034(local13 + 1, 65536, local8);
				}
				if (arg0 == 2) {
					this.method4034(local13, 20480, local8);
					this.method4034(local13 + 1, 65536, local8);
					this.method4034(local13, 1024, local8 - 1);
				}
				if (arg0 == 3) {
					this.method4034(local13, 81920, local8);
					this.method4034(local13, 1024, local8 - 1);
					this.method4034(local13 - 1, 4096, local8);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4034(local13, 536870912, local8);
				this.method4034(local13 - 1, 33554432, local8);
			}
			if (arg0 == 1) {
				this.method4034(local13, 8388608, local8);
				this.method4034(local13, 134217728, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4034(local13, 33554432, local8);
				this.method4034(local13 + 1, 536870912, local8);
			}
			if (arg0 == 3) {
				this.method4034(local13, 134217728, local8);
				this.method4034(local13, 8388608, local8 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4034(local13, 4194304, local8);
				this.method4034(local13 - 1, 67108864, local8 + 1);
			}
			if (arg0 == 1) {
				this.method4034(local13, 16777216, local8);
				this.method4034(local13 + 1, 268435456, local8 + 1);
			}
			if (arg0 == 2) {
				this.method4034(local13, 67108864, local8);
				this.method4034(local13 + 1, 4194304, local8 - 1);
			}
			if (arg0 == 3) {
				this.method4034(local13, 268435456, local8);
				this.method4034(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4034(local13, 545259520, local8);
			this.method4034(local13 - 1, 33554432, local8);
			this.method4034(local13, 134217728, local8 + 1);
		}
		if (arg0 == 1) {
			this.method4034(local13, 41943040, local8);
			this.method4034(local13, 134217728, local8 + 1);
			this.method4034(local13 + 1, 536870912, local8);
		}
		if (arg0 == 2) {
			this.method4034(local13, 167772160, local8);
			this.method4034(local13 + 1, 536870912, local8);
			this.method4034(local13, 8388608, local8 - 1);
		}
		if (arg0 == 3) {
			this.method4034(local13, 671088640, local8);
			this.method4034(local13, 8388608, local8 - 1);
			this.method4034(local13 - 1, 33554432, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZI)V")
	public void method4032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4631;
		@Pc(14) int local14 = arg1 - this.anInt4643;
		this.anIntArrayArray105[local14][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg1;
		@Pc(13) int local13 = arg4 + arg7;
		@Pc(17) int local17 = arg6 + arg0;
		@Pc(30) int local30 = arg3 + arg5;
		@Pc(51) int local51;
		@Pc(62) int local62;
		if (arg1 == local17 && (arg2 & 0x2) == 0) {
			local51 = arg7 <= arg3 ? arg3 : arg7;
			local62 = local30 <= local13 ? local30 : local13;
			while (local51 < local62) {
				if ((this.anIntArrayArray105[local17 - this.anInt4643 - 1][local51 - this.anInt4631] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg0 && (arg2 & 0x8) == 0) {
			local51 = arg3 >= arg7 ? arg3 : arg7;
			local62 = local30 > local13 ? local13 : local30;
			while (local62 > local51) {
				if ((this.anIntArrayArray105[arg0 - this.anInt4643][local51 - this.anInt4631] & 0x80) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local30 == arg7 && (arg2 & 0x1) == 0) {
			local51 = arg1 > arg0 ? arg1 : arg0;
			local62 = local17 <= local9 ? local17 : local9;
			while (local51 < local62) {
				if ((this.anIntArrayArray105[local51 - this.anInt4643][local30 - this.anInt4631 - 1] & 0x2) == 0) {
					return true;
				}
				local51++;
			}
		} else if (arg3 == local13 && (arg2 & 0x4) == 0) {
			local51 = arg1 <= arg0 ? arg0 : arg1;
			local62 = local9 >= local17 ? local17 : local9;
			while (local62 > local51) {
				if ((this.anIntArrayArray105[local51 - this.anInt4643][arg3 - this.anInt4631] & 0x20) == 0) {
					return true;
				}
				local51++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(IIII)V")
	private void method4034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray105[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static551.method7301(arg1, arg4, arg3, arg0, arg7, arg6, arg4, arg2) ? true : this.method4033(arg3, arg2, arg5, arg7, arg4, arg1, arg0, arg6, arg4);
		}
		@Pc(41) int local41 = arg3 + arg0 - 1;
		@Pc(47) int local47 = arg1 + arg7 - 1;
		if (arg3 <= arg2 && local41 >= arg2 && arg6 >= arg7 && local47 >= arg6) {
			return true;
		} else if (arg3 - 1 == arg2 && arg6 >= arg7 && local47 >= arg6 && (this.anIntArrayArray105[arg2 - this.anInt4643][arg6 - this.anInt4631] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg2 == local41 + 1 && arg7 <= arg6 && local47 >= arg6 && (this.anIntArrayArray105[arg2 - this.anInt4643][arg6 - this.anInt4631] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg7 - 1 && arg2 >= arg3 && local41 >= arg2 && (this.anIntArrayArray105[arg2 - this.anInt4643][arg6 - this.anInt4631] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg6 && arg2 >= arg3 && arg2 <= local41 && (this.anIntArrayArray105[arg2 - this.anInt4643][arg6 - this.anInt4631] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)V")
	public void method4037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4643;
		@Pc(13) int local13 = arg1 - this.anInt4631;
		this.anIntArrayArray105[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public void method4038() {
		for (@Pc(19) int local19 = 0; local19 < this.anInt4642; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt4628; local23++) {
				if (local19 == 0 || local23 == 0 || local19 >= this.anInt4642 - 5 || local23 >= this.anInt4628 - 5) {
					this.anIntArrayArray105[local19][local23] = -1;
				} else {
					this.anIntArrayArray105[local19][local23] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg1 && arg6 == arg5) {
				return true;
			}
		} else if (arg3 <= arg1 && arg1 <= arg3 + arg4 - 1 && arg6 >= arg6 && arg4 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(53) int local53 = arg3 - this.anInt4643;
		@Pc(58) int local58 = arg1 - this.anInt4643;
		@Pc(63) int local63 = arg6 - this.anInt4631;
		@Pc(76) int local76 = arg5 - this.anInt4631;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local53 == local58 + 1 && local63 == local76 && (this.anIntArrayArray105[local53][local76] & 0x80) == 0) {
						return true;
					}
					if (local58 == local53 && local63 - 1 == local76 && (this.anIntArrayArray105[local53][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local58 - 1 == local53 && local76 == local63 && (this.anIntArrayArray105[local53][local76] & 0x8) == 0) {
						return true;
					}
					if (local53 == local58 && local76 == local63 - 1 && (this.anIntArrayArray105[local53][local76] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local53 == local58 - 1 && local76 == local63 && (this.anIntArrayArray105[local53][local76] & 0x8) == 0) {
						return true;
					}
					if (local53 == local58 && local63 + 1 == local76 && (this.anIntArrayArray105[local53][local76] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local58 + 1 == local53 && local76 == local63 && (this.anIntArrayArray105[local53][local76] & 0x80) == 0) {
						return true;
					}
					if (local53 == local58 && local63 + 1 == local76 && (this.anIntArrayArray105[local53][local76] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local53 == local58 && local76 == local63 + 1 && (this.anIntArrayArray105[local53][local76] & 0x20) == 0) {
					return true;
				}
				if (local58 == local53 && local76 == local63 - 1 && (this.anIntArrayArray105[local53][local76] & 0x2) == 0) {
					return true;
				}
				if (local58 - 1 == local53 && local76 == local63 && (this.anIntArrayArray105[local53][local76] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local63 == local76 && (this.anIntArrayArray105[local53][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(418) int local418 = local53 + arg4 - 1;
			@Pc(424) int local424 = arg4 + local76 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local53 == local58 + 1 && local76 <= local63 && local424 >= local63 && (this.anIntArrayArray105[local53][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local418 && local76 == local63 - arg4 && (this.anIntArrayArray105[local58][local424] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local53 == local58 - arg4 && local63 >= local76 && local63 <= local424 && (this.anIntArrayArray105[local418][local63] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local418 >= local58 && local63 - arg4 == local76 && (this.anIntArrayArray105[local58][local424] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local58 - arg4 == local53 && local76 <= local63 && local63 <= local424 && (this.anIntArrayArray105[local418][local63] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local418 && local76 == local63 + 1 && (this.anIntArrayArray105[local58][local76] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local53 == local58 + 1 && local63 >= local76 && local63 <= local424 && (this.anIntArrayArray105[local53][local63] & 0x80) == 0) {
						return true;
					}
					if (local58 >= local53 && local418 >= local58 && local63 + 1 == local76 && (this.anIntArrayArray105[local58][local76] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local58 >= local53 && local418 >= local58 && local63 + 1 == local76 && (this.anIntArrayArray105[local58][local76] & 0x20) == 0) {
					return true;
				}
				if (local53 <= local58 && local58 <= local418 && local63 - arg4 == local76 && (this.anIntArrayArray105[local58][local424] & 0x2) == 0) {
					return true;
				}
				if (local58 - arg4 == local53 && local63 >= local76 && local424 >= local63 && (this.anIntArrayArray105[local418][local63] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local63 >= local76 && local424 >= local63 && (this.anIntArrayArray105[local53][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
