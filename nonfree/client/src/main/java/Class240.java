import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class240 {

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public int anInt6474;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg3 == arg0 && arg5 == arg4) {
				return true;
			}
		} else if (arg3 >= arg0 && arg3 <= arg6 + arg0 - 1 && arg4 <= arg4 && arg4 <= arg6 + arg4 - 1) {
			return true;
		}
		@Pc(63) int local63 = arg4 - this.anInt6475;
		@Pc(68) int local68 = arg3 - this.anInt6474;
		@Pc(73) int local73 = arg0 - this.anInt6474;
		@Pc(78) int local78 = arg5 - this.anInt6475;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local68 - 1 == local73 && local63 == local78) {
						return true;
					}
					if (local73 == local68 && local78 == local63 + 1 && (this.anIntArrayArray34[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 == local68 && local63 + 1 == local78) {
						return true;
					}
					if (local73 == local68 - 1 && local63 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local63 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 + 1 == local73 && local63 == local78) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 && local63 - 1 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 == local68 && local78 == local63 - 1) {
						return true;
					}
					if (local73 == local68 - 1 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local68 - 1 == local73 && local78 == local63) {
						return true;
					}
					if (local73 == local68 && local78 == local63 + 1) {
						return true;
					}
					if (local73 == local68 + 1 && local63 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local68 && local78 == local63 - 1 && (this.anIntArrayArray34[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local68 - 1 == local73 && local63 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local78) {
						return true;
					}
					if (local73 == local68 + 1 && local63 == local78) {
						return true;
					}
					if (local68 == local73 && local78 == local63 - 1 && (this.anIntArrayArray34[local73][local78] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 - 1 == local73 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local63 == local78) {
						return true;
					}
					if (local73 == local68 && local78 == local63 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local68 - 1 == local73 && local63 == local78) {
						return true;
					}
					if (local68 == local73 && local78 == local63 + 1 && (this.anIntArrayArray34[local73][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local73 && local78 == local63 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local68 == local73 && local78 == local63 + 1 && (this.anIntArrayArray34[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local63 - 1 == local78 && (this.anIntArrayArray34[local73][local78] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local73 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local73 && local78 == local63 && (this.anIntArrayArray34[local73][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = arg6 + local73 - 1;
			@Pc(93) int local93 = arg6 + local78 - 1;
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local68 - arg6 == local73 && local63 >= local78 && local93 >= local63) {
						return true;
					}
					if (local68 >= local73 && local68 <= local87 && local63 + 1 == local78 && (this.anIntArrayArray34[local68][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 <= local68 && local68 <= local87 && local78 == local63 - arg6 && (this.anIntArrayArray34[local68][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 <= local68 && local87 >= local68 && local78 == local63 + 1) {
						return true;
					}
					if (local68 - arg6 == local73 && local63 >= local78 && local63 <= local93 && (this.anIntArrayArray34[local87][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 == local68 + 1 && local78 <= local63 && local93 >= local63) {
						return true;
					}
					if (local73 <= local68 && local68 <= local87 && local63 + 1 == local78 && (this.anIntArrayArray34[local68][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 >= local73 && local87 >= local68 && local63 - arg6 == local78 && (this.anIntArrayArray34[local68][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 <= local68 && local87 >= local68 && local63 - arg6 == local78) {
						return true;
					}
					if (local68 - arg6 == local73 && local78 <= local63 && local93 >= local63 && (this.anIntArrayArray34[local87][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local78 <= local63 && local63 <= local93 && (this.anIntArrayArray34[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local68 - arg6 == local73 && local78 <= local63 && local63 <= local93) {
						return true;
					}
					if (local73 <= local68 && local87 >= local68 && local63 + 1 == local78) {
						return true;
					}
					if (local73 == local68 + 1 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 <= local68 && local87 >= local68 && local78 == local63 - arg6 && (this.anIntArrayArray34[local68][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local68 - arg6 == local73 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local87][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local73 && local87 >= local68 && local78 == local63 + 1) {
						return true;
					}
					if (local68 + 1 == local73 && local63 >= local78 && local93 >= local63) {
						return true;
					}
					if (local73 <= local68 && local87 >= local68 && local63 - arg6 == local78 && (this.anIntArrayArray34[local68][local93] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 - arg6 == local73 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local87][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local73 && local87 >= local68 && local63 + 1 == local78 && (this.anIntArrayArray34[local68][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local73 && local78 <= local63 && local63 <= local93) {
						return true;
					}
					if (local73 <= local68 && local68 <= local87 && local78 == local63 - arg6) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 == local68 - arg6 && local63 >= local78 && local63 <= local93) {
						return true;
					}
					if (local68 >= local73 && local87 >= local68 && local78 == local63 + 1 && (this.anIntArrayArray34[local68][local78] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 + 1 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local73][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 <= local68 && local87 >= local68 && local78 == local63 - arg6) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local68 >= local73 && local68 <= local87 && local63 + 1 == local78 && (this.anIntArrayArray34[local68][local78] & 0x2C0120) == 0) {
					return true;
				}
				if (local73 <= local68 && local68 <= local87 && local78 == local63 - arg6 && (this.anIntArrayArray34[local68][local93] & 0x2C0102) == 0) {
					return true;
				}
				if (local73 == local68 - arg6 && local63 >= local78 && local93 >= local63 && (this.anIntArrayArray34[local87][local63] & 0x2C0108) == 0) {
					return true;
				}
				if (local68 + 1 == local73 && local78 <= local63 && local63 <= local93 && (this.anIntArrayArray34[local73][local63] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIZIZ)V")
	public void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt6475;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg0 - this.anInt6474;
		for (@Pc(31) int local31 = local29; local31 < arg2 + local29; local31++) {
			if (local31 >= 0 && local31 < this.anInt6471) {
				for (@Pc(50) int local50 = local18; local50 < arg4 + local18; local50++) {
					if (local50 >= 0 && this.anInt6486 > local50) {
						this.method5258(local7, local50, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18 = arg2 + arg7;
		@Pc(22) int local22 = arg6 + arg3;
		@Pc(26) int local26 = arg0 + arg4;
		@Pc(30) int local30 = arg8 + arg1;
		@Pc(61) int local61;
		@Pc(72) int local72;
		if (local26 == arg2 && (arg5 & 0x2) == 0) {
			local61 = arg8 >= arg3 ? arg8 : arg3;
			local72 = local22 < local30 ? local22 : local30;
			while (local61 < local72) {
				if ((this.anIntArrayArray34[local26 - this.anInt6474 - 1][local61 - this.anInt6475] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local18 == arg0 && (arg5 & 0x8) == 0) {
			local61 = arg3 <= arg8 ? arg8 : arg3;
			local72 = local30 > local22 ? local22 : local30;
			while (local72 > local61) {
				if ((this.anIntArrayArray34[arg0 - this.anInt6474][local61 - this.anInt6475] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg3 == local30 && (arg5 & 0x1) == 0) {
			local61 = arg2 <= arg0 ? arg0 : arg2;
			local72 = local18 >= local26 ? local26 : local18;
			while (local61 < local72) {
				if ((this.anIntArrayArray34[local61 - this.anInt6474][local30 - this.anInt6475 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg8 == local22 && (arg5 & 0x4) == 0) {
			local61 = arg2 <= arg0 ? arg0 : arg2;
			local72 = local26 <= local18 ? local26 : local18;
			while (local61 < local72) {
				if ((this.anIntArrayArray34[local61 - this.anInt6474][arg8 - this.anInt6475] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
	public void method5252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6475;
		@Pc(13) int local13 = arg0 - this.anInt6474;
		this.anIntArrayArray34[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIIZII)V")
	public void method5253(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg5 - this.anInt6475;
		@Pc(13) int local13 = arg3 - this.anInt6474;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5258(128, local8, local13);
				this.method5258(8, local8, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5258(2, local8, local13);
				this.method5258(32, local8 + 1, local13);
			}
			if (arg1 == 2) {
				this.method5258(8, local8, local13);
				this.method5258(128, local8, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5258(32, local8, local13);
				this.method5258(2, local8 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5258(1, local8, local13);
				this.method5258(16, local8 + 1, local13 + -1);
			}
			if (arg1 == 1) {
				this.method5258(4, local8, local13);
				this.method5258(64, local8 + 1, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5258(16, local8, local13);
				this.method5258(1, local8 - 1, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5258(64, local8, local13);
				this.method5258(4, local8 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method5258(130, local8, local13);
				this.method5258(8, local8, local13 - 1);
				this.method5258(32, local8 + 1, local13);
			}
			if (arg1 == 1) {
				this.method5258(10, local8, local13);
				this.method5258(32, local8 + 1, local13);
				this.method5258(128, local8, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5258(40, local8, local13);
				this.method5258(128, local8, local13 + 1);
				this.method5258(2, local8 - 1, local13);
			}
			if (arg1 == 3) {
				this.method5258(160, local8, local13);
				this.method5258(2, local8 - 1, local13);
				this.method5258(8, local8, local13 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method5258(65536, local8, local13);
					this.method5258(4096, local8, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5258(1024, local8, local13);
					this.method5258(16384, local8 + 1, local13);
				}
				if (arg1 == 2) {
					this.method5258(4096, local8, local13);
					this.method5258(65536, local8, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5258(16384, local8, local13);
					this.method5258(1024, local8 - 1, local13);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method5258(512, local8, local13);
					this.method5258(8192, local8 + 1, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5258(2048, local8, local13);
					this.method5258(32768, local8 + 1, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5258(8192, local8, local13);
					this.method5258(512, local8 - 1, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5258(32768, local8, local13);
					this.method5258(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method5258(66560, local8, local13);
					this.method5258(4096, local8, local13 - 1);
					this.method5258(16384, local8 + 1, local13);
				}
				if (arg1 == 1) {
					this.method5258(5120, local8, local13);
					this.method5258(16384, local8 + 1, local13);
					this.method5258(65536, local8, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5258(20480, local8, local13);
					this.method5258(65536, local8, local13 + 1);
					this.method5258(1024, local8 - 1, local13);
				}
				if (arg1 == 3) {
					this.method5258(81920, local8, local13);
					this.method5258(1024, local8 - 1, local13);
					this.method5258(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5258(536870912, local8, local13);
				this.method5258(33554432, local8, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5258(8388608, local8, local13);
				this.method5258(134217728, local8 + 1, local13);
			}
			if (arg1 == 2) {
				this.method5258(33554432, local8, local13);
				this.method5258(536870912, local8, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5258(134217728, local8, local13);
				this.method5258(8388608, local8 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5258(4194304, local8, local13);
				this.method5258(67108864, local8 + 1, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5258(16777216, local8, local13);
				this.method5258(268435456, local8 + 1, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5258(67108864, local8, local13);
				this.method5258(4194304, local8 - 1, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5258(268435456, local8, local13);
				this.method5258(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5258(545259520, local8, local13);
			this.method5258(33554432, local8, local13 - 1);
			this.method5258(134217728, local8 + 1, local13);
		}
		if (arg1 == 1) {
			this.method5258(41943040, local8, local13);
			this.method5258(134217728, local8 + 1, local13);
			this.method5258(536870912, local8, local13 + 1);
		}
		if (arg1 == 2) {
			this.method5258(167772160, local8, local13);
			this.method5258(536870912, local8, local13 + 1);
			this.method5258(8388608, local8 - 1, local13);
		}
		if (arg1 == 3) {
			this.method5258(671088640, local8, local13);
			this.method5258(8388608, local8 - 1, local13);
			this.method5258(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZIZII)V")
	public void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg0 - this.anInt6474;
		@Pc(17) int local17 = arg1 - this.anInt6475;
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method5257(128, local17, local12);
				this.method5257(8, local17, local12 - 1);
			}
			if (arg5 == 1) {
				this.method5257(2, local17, local12);
				this.method5257(32, local17 + 1, local12);
			}
			if (arg5 == 2) {
				this.method5257(8, local17, local12);
				this.method5257(128, local17, local12 + 1);
			}
			if (arg5 == 3) {
				this.method5257(32, local17, local12);
				this.method5257(2, local17 - 1, local12);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method5257(1, local17, local12);
				this.method5257(16, local17 + 1, local12 - 1);
			}
			if (arg5 == 1) {
				this.method5257(4, local17, local12);
				this.method5257(64, local17 + 1, local12 - -1);
			}
			if (arg5 == 2) {
				this.method5257(16, local17, local12);
				this.method5257(1, local17 - 1, local12 + 1);
			}
			if (arg5 == 3) {
				this.method5257(64, local17, local12);
				this.method5257(4, local17 - 1, local12 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg5 == 0) {
				this.method5257(130, local17, local12);
				this.method5257(8, local17, local12 - 1);
				this.method5257(32, local17 + 1, local12);
			}
			if (arg5 == 1) {
				this.method5257(10, local17, local12);
				this.method5257(32, local17 + 1, local12);
				this.method5257(128, local17, local12 + 1);
			}
			if (arg5 == 2) {
				this.method5257(40, local17, local12);
				this.method5257(128, local17, local12 + 1);
				this.method5257(2, local17 - 1, local12);
			}
			if (arg5 == 3) {
				this.method5257(160, local17, local12);
				this.method5257(2, local17 - 1, local12);
				this.method5257(8, local17, local12 - 1);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg5 == 0) {
					this.method5257(65536, local17, local12);
					this.method5257(4096, local17, local12 - 1);
				}
				if (arg5 == 1) {
					this.method5257(1024, local17, local12);
					this.method5257(16384, local17 + 1, local12);
				}
				if (arg5 == 2) {
					this.method5257(4096, local17, local12);
					this.method5257(65536, local17, local12 + 1);
				}
				if (arg5 == 3) {
					this.method5257(16384, local17, local12);
					this.method5257(1024, local17 - 1, local12);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg5 == 0) {
					this.method5257(512, local17, local12);
					this.method5257(8192, local17 + 1, local12 + -1);
				}
				if (arg5 == 1) {
					this.method5257(2048, local17, local12);
					this.method5257(32768, local17 + 1, local12 + 1);
				}
				if (arg5 == 2) {
					this.method5257(8192, local17, local12);
					this.method5257(512, local17 - 1, local12 + 1);
				}
				if (arg5 == 3) {
					this.method5257(32768, local17, local12);
					this.method5257(2048, local17 - 1, local12 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					this.method5257(66560, local17, local12);
					this.method5257(4096, local17, local12 - 1);
					this.method5257(16384, local17 + 1, local12);
				}
				if (arg5 == 1) {
					this.method5257(5120, local17, local12);
					this.method5257(16384, local17 + 1, local12);
					this.method5257(65536, local17, local12 + 1);
				}
				if (arg5 == 2) {
					this.method5257(20480, local17, local12);
					this.method5257(65536, local17, local12 + 1);
					this.method5257(1024, local17 - 1, local12);
				}
				if (arg5 == 3) {
					this.method5257(81920, local17, local12);
					this.method5257(1024, local17 - 1, local12);
					this.method5257(4096, local17, local12 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg5 == 0) {
				this.method5257(536870912, local17, local12);
				this.method5257(33554432, local17, local12 - 1);
			}
			if (arg5 == 1) {
				this.method5257(8388608, local17, local12);
				this.method5257(134217728, local17 + 1, local12);
			}
			if (arg5 == 2) {
				this.method5257(33554432, local17, local12);
				this.method5257(536870912, local17, local12 + 1);
			}
			if (arg5 == 3) {
				this.method5257(134217728, local17, local12);
				this.method5257(8388608, local17 - 1, local12);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg5 == 0) {
				this.method5257(4194304, local17, local12);
				this.method5257(67108864, local17 + 1, local12 + -1);
			}
			if (arg5 == 1) {
				this.method5257(16777216, local17, local12);
				this.method5257(268435456, local17 + 1, local12 + 1);
			}
			if (arg5 == 2) {
				this.method5257(67108864, local17, local12);
				this.method5257(4194304, local17 - 1, local12 - -1);
			}
			if (arg5 == 3) {
				this.method5257(268435456, local17, local12);
				this.method5257(16777216, local17 - 1, local12 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5257(545259520, local17, local12);
			this.method5257(33554432, local17, local12 - 1);
			this.method5257(134217728, local17 + 1, local12);
		}
		if (arg5 == 1) {
			this.method5257(41943040, local17, local12);
			this.method5257(134217728, local17 + 1, local12);
			this.method5257(536870912, local17, local12 + 1);
		}
		if (arg5 == 2) {
			this.method5257(167772160, local17, local12);
			this.method5257(536870912, local17, local12 + 1);
			this.method5257(8388608, local17 - 1, local12);
		}
		if (arg5 == 3) {
			this.method5257(671088640, local17, local12);
			this.method5257(8388608, local17 - 1, local12);
			this.method5257(33554432, local17, local12 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIZIIIZI)V")
	public void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt6474;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg0 - this.anInt6475;
		@Pc(37) int local37;
		if (arg3 == 1 || arg3 == 3) {
			local37 = arg4;
			arg4 = arg6;
			arg6 = local37;
		}
		for (local37 = local18; local37 < arg4 + local18; local37++) {
			if (local37 >= 0 && this.anInt6471 > local37) {
				for (@Pc(57) int local57 = local29; local57 < arg6 + local29; local57++) {
					if (local57 >= 0 && this.anInt6486 > local57) {
						this.method5257(local7, local57, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIBI)V")
	private void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)V")
	private void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
	public void method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6475;
		@Pc(25) int local25 = arg1 - this.anInt6474;
		this.anIntArrayArray34[local25][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public void method5260() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6471; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt6486; local13++) {
				if (local7 == 0 || local13 == 0 || local7 >= this.anInt6471 - 5 || local13 >= this.anInt6486 - 5) {
					this.anIntArrayArray34[local7][local13] = -1;
				} else {
					this.anIntArrayArray34[local7][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(III)V")
	public void method5261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6475;
		@Pc(13) int local13 = arg1 - this.anInt6474;
		this.anIntArrayArray34[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg3 && arg5 == arg1) {
				return true;
			}
		} else if (arg3 >= arg6 && arg6 + arg0 - 1 >= arg3 && arg5 >= arg5 && arg5 <= arg0 + arg5 - 1) {
			return true;
		}
		@Pc(54) int local54 = arg6 - this.anInt6474;
		@Pc(59) int local59 = arg1 - this.anInt6475;
		@Pc(64) int local64 = arg3 - this.anInt6474;
		@Pc(69) int local69 = arg5 - this.anInt6475;
		if (arg0 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local64 + 1 == local54 && local59 == local69 && (this.anIntArrayArray34[local54][local59] & 0x80) == 0) {
						return true;
					}
					if (local54 == local64 && local59 == local69 - 1 && (this.anIntArrayArray34[local54][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local64 - 1 == local54 && local59 == local69 && (this.anIntArrayArray34[local54][local59] & 0x8) == 0) {
						return true;
					}
					if (local54 == local64 && local59 == local69 - 1 && (this.anIntArrayArray34[local54][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local64 - 1 == local54 && local59 == local69 && (this.anIntArrayArray34[local54][local59] & 0x8) == 0) {
						return true;
					}
					if (local64 == local54 && local69 + 1 == local59 && (this.anIntArrayArray34[local54][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local64 + 1 == local54 && local59 == local69 && (this.anIntArrayArray34[local54][local59] & 0x80) == 0) {
						return true;
					}
					if (local54 == local64 && local59 == local69 + 1 && (this.anIntArrayArray34[local54][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local54 == local64 && local59 == local69 + 1 && (this.anIntArrayArray34[local54][local59] & 0x20) == 0) {
					return true;
				}
				if (local54 == local64 && local59 == local69 - 1 && (this.anIntArrayArray34[local54][local59] & 0x2) == 0) {
					return true;
				}
				if (local54 == local64 - 1 && local69 == local59 && (this.anIntArrayArray34[local54][local59] & 0x8) == 0) {
					return true;
				}
				if (local64 + 1 == local54 && local69 == local59 && (this.anIntArrayArray34[local54][local59] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg0 + local54 - 1;
			@Pc(91) int local91 = local59 + arg0 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local64 + 1 == local54 && local69 >= local59 && local91 >= local69 && (this.anIntArrayArray34[local54][local69] & 0x80) == 0) {
						return true;
					}
					if (local54 <= local64 && local64 <= local84 && local69 - arg0 == local59 && (this.anIntArrayArray34[local64][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local64 - arg0 == local54 && local59 <= local69 && local91 >= local69 && (this.anIntArrayArray34[local84][local69] & 0x8) == 0) {
						return true;
					}
					if (local54 <= local64 && local84 >= local64 && local69 - arg0 == local59 && (this.anIntArrayArray34[local64][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local64 - arg0 == local54 && local69 >= local59 && local69 <= local91 && (this.anIntArrayArray34[local84][local69] & 0x8) == 0) {
						return true;
					}
					if (local64 >= local54 && local64 <= local84 && local69 + 1 == local59 && (this.anIntArrayArray34[local64][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local54 == local64 + 1 && local59 <= local69 && local91 >= local69 && (this.anIntArrayArray34[local54][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local54 && local84 >= local64 && local59 == local69 + 1 && (this.anIntArrayArray34[local64][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local54 <= local64 && local64 <= local84 && local59 == local69 + 1 && (this.anIntArrayArray34[local64][local59] & 0x20) == 0) {
					return true;
				}
				if (local54 <= local64 && local64 <= local84 && local69 - arg0 == local59 && (this.anIntArrayArray34[local64][local91] & 0x2) == 0) {
					return true;
				}
				if (local64 - arg0 == local54 && local59 <= local69 && local69 <= local91 && (this.anIntArrayArray34[local84][local69] & 0x8) == 0) {
					return true;
				}
				if (local54 == local64 + 1 && local69 >= local59 && local91 >= local69 && (this.anIntArrayArray34[local54][local69] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIZIII)Z")
	public boolean method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static371.method5426(arg5, arg6, arg7, arg6, arg4, arg3, arg1, arg2) ? true : this.method5251(arg7, arg3, arg5, arg1, arg4, arg0, arg6, arg6, arg2);
		}
		@Pc(47) int local47 = arg7 + arg4 - 1;
		@Pc(54) int local54 = arg2 + arg3 - 1;
		if (arg7 <= arg5 && arg5 <= local47 && arg2 <= arg1 && arg1 <= local54) {
			return true;
		} else if (arg5 == arg7 - 1 && arg1 >= arg2 && arg1 <= local54 && (this.anIntArrayArray34[arg5 - this.anInt6474][arg1 - this.anInt6475] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local47 + 1 == arg5 && arg2 <= arg1 && local54 >= arg1 && (this.anIntArrayArray34[arg5 - this.anInt6474][arg1 - this.anInt6475] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg1 && arg5 >= arg7 && arg5 <= local47 && (this.anIntArrayArray34[arg5 - this.anInt6474][arg1 - this.anInt6475] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local54 + 1 == arg1 && arg5 >= arg7 && local47 >= arg5 && (this.anIntArrayArray34[arg5 - this.anInt6474][arg1 - this.anInt6475] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)V")
	public void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6475;
		@Pc(9) int local9 = arg1 - this.anInt6474;
		this.anIntArrayArray34[local9][local4] |= 0x40000;
	}
}
