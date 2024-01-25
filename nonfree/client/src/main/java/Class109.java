import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class109 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt2978;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public int anInt2985;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZBIII)V")
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt2989;
		@Pc(13) int local13 = arg5 - this.anInt2978;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2725(local13, 128, local8);
				this.method2725(local13 - 1, 8, local8);
			}
			if (arg0 == 1) {
				this.method2725(local13, 2, local8);
				this.method2725(local13, 32, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2725(local13, 8, local8);
				this.method2725(local13 + 1, 128, local8);
			}
			if (arg0 == 3) {
				this.method2725(local13, 32, local8);
				this.method2725(local13, 2, local8 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2725(local13, 1, local8);
				this.method2725(local13 - 1, 16, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2725(local13, 4, local8);
				this.method2725(local13 + 1, 64, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2725(local13, 16, local8);
				this.method2725(local13 + 1, 1, local8 - 1);
			}
			if (arg0 == 3) {
				this.method2725(local13, 64, local8);
				this.method2725(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method2725(local13, 130, local8);
				this.method2725(local13 - 1, 8, local8);
				this.method2725(local13, 32, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2725(local13, 10, local8);
				this.method2725(local13, 32, local8 + 1);
				this.method2725(local13 + 1, 128, local8);
			}
			if (arg0 == 2) {
				this.method2725(local13, 40, local8);
				this.method2725(local13 + 1, 128, local8);
				this.method2725(local13, 2, local8 - 1);
			}
			if (arg0 == 3) {
				this.method2725(local13, 160, local8);
				this.method2725(local13, 2, local8 - 1);
				this.method2725(local13 - 1, 8, local8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method2725(local13, 65536, local8);
					this.method2725(local13 - 1, 4096, local8);
				}
				if (arg0 == 1) {
					this.method2725(local13, 1024, local8);
					this.method2725(local13, 16384, local8 + 1);
				}
				if (arg0 == 2) {
					this.method2725(local13, 4096, local8);
					this.method2725(local13 + 1, 65536, local8);
				}
				if (arg0 == 3) {
					this.method2725(local13, 16384, local8);
					this.method2725(local13, 1024, local8 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method2725(local13, 512, local8);
					this.method2725(local13 - 1, 8192, local8 + 1);
				}
				if (arg0 == 1) {
					this.method2725(local13, 2048, local8);
					this.method2725(local13 + 1, 32768, local8 + 1);
				}
				if (arg0 == 2) {
					this.method2725(local13, 8192, local8);
					this.method2725(local13 + 1, 512, local8 - 1);
				}
				if (arg0 == 3) {
					this.method2725(local13, 32768, local8);
					this.method2725(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method2725(local13, 66560, local8);
					this.method2725(local13 - 1, 4096, local8);
					this.method2725(local13, 16384, local8 + 1);
				}
				if (arg0 == 1) {
					this.method2725(local13, 5120, local8);
					this.method2725(local13, 16384, local8 + 1);
					this.method2725(local13 + 1, 65536, local8);
				}
				if (arg0 == 2) {
					this.method2725(local13, 20480, local8);
					this.method2725(local13 + 1, 65536, local8);
					this.method2725(local13, 1024, local8 - 1);
				}
				if (arg0 == 3) {
					this.method2725(local13, 81920, local8);
					this.method2725(local13, 1024, local8 - 1);
					this.method2725(local13 - 1, 4096, local8);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2725(local13, 536870912, local8);
				this.method2725(local13 - 1, 33554432, local8);
			}
			if (arg0 == 1) {
				this.method2725(local13, 8388608, local8);
				this.method2725(local13, 134217728, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2725(local13, 33554432, local8);
				this.method2725(local13 + 1, 536870912, local8);
			}
			if (arg0 == 3) {
				this.method2725(local13, 134217728, local8);
				this.method2725(local13, 8388608, local8 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2725(local13, 4194304, local8);
				this.method2725(local13 - 1, 67108864, local8 + 1);
			}
			if (arg0 == 1) {
				this.method2725(local13, 16777216, local8);
				this.method2725(local13 + 1, 268435456, local8 + 1);
			}
			if (arg0 == 2) {
				this.method2725(local13, 67108864, local8);
				this.method2725(local13 + 1, 4194304, local8 - 1);
			}
			if (arg0 == 3) {
				this.method2725(local13, 268435456, local8);
				this.method2725(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2725(local13, 545259520, local8);
			this.method2725(local13 - 1, 33554432, local8);
			this.method2725(local13, 134217728, local8 + 1);
		}
		if (arg0 == 1) {
			this.method2725(local13, 41943040, local8);
			this.method2725(local13, 134217728, local8 + 1);
			this.method2725(local13 + 1, 536870912, local8);
		}
		if (arg0 == 2) {
			this.method2725(local13, 167772160, local8);
			this.method2725(local13 + 1, 536870912, local8);
			this.method2725(local13, 8388608, local8 - 1);
		}
		if (arg0 == 3) {
			this.method2725(local13, 671088640, local8);
			this.method2725(local13, 8388608, local8 - 1);
			this.method2725(local13 - 1, 33554432, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public void method2717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt2989;
		@Pc(17) int local17 = arg0 - this.anInt2978;
		this.anIntArrayArray9[local17][local12] |= 0x200000;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIBIIIIII)Z")
	public boolean method2718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg8 + arg6;
		@Pc(13) int local13 = arg1 + arg5;
		@Pc(17) int local17 = arg2 + arg4;
		@Pc(21) int local21 = arg3 + arg7;
		@Pc(73) int local73;
		@Pc(85) int local85;
		if (arg8 == local17 && (arg0 & 0x2) == 0) {
			local73 = arg1 > arg7 ? arg1 : arg7;
			local85 = local21 > local13 ? local13 : local21;
			while (local73 < local85) {
				if ((this.anIntArrayArray9[local17 - this.anInt2978 - 1][local73 - this.anInt2989] & 0x8) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local9 == arg4 && (arg0 & 0x8) == 0) {
			local73 = arg1 > arg7 ? arg1 : arg7;
			local85 = local21 > local13 ? local13 : local21;
			while (local73 < local85) {
				if ((this.anIntArrayArray9[arg4 - this.anInt2978][local73 - this.anInt2989] & 0x80) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local21 == arg1 && (arg0 & 0x1) == 0) {
			local73 = arg8 > arg4 ? arg8 : arg4;
			local85 = local9 >= local17 ? local17 : local9;
			while (local85 > local73) {
				if ((this.anIntArrayArray9[local73 - this.anInt2978][local21 - this.anInt2989 - 1] & 0x2) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local13 == arg7 && (arg0 & 0x4) == 0) {
			local73 = arg8 <= arg4 ? arg4 : arg8;
			local85 = local9 < local17 ? local9 : local17;
			while (local85 > local73) {
				if ((this.anIntArrayArray9[local73 - this.anInt2978][arg7 - this.anInt2989] & 0x20) == 0) {
					return true;
				}
				local73++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)V")
	public void method2719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2978;
		@Pc(9) int local9 = arg0 - this.anInt2989;
		this.anIntArrayArray9[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static374.method5105(arg0, arg6, arg1, arg4, arg7, arg2, arg5, arg7) ? true : this.method2718(arg3, arg2, arg0, arg6, arg4, arg7, arg7, arg5, arg1);
		}
		@Pc(41) int local41 = arg0 + arg4 - 1;
		@Pc(47) int local47 = arg6 + arg5 - 1;
		if (arg1 >= arg4 && local41 >= arg1 && arg5 <= arg2 && local47 >= arg2) {
			return true;
		} else if (arg4 - 1 == arg1 && arg5 <= arg2 && arg2 <= local47 && (this.anIntArrayArray9[arg1 - this.anInt2978][arg2 - this.anInt2989] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg1 == local41 + 1 && arg2 >= arg5 && local47 >= arg2 && (this.anIntArrayArray9[arg1 - this.anInt2978][arg2 - this.anInt2989] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg5 - 1 && arg4 <= arg1 && local41 >= arg1 && (this.anIntArrayArray9[arg1 - this.anInt2978][arg2 - this.anInt2989] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg2 && arg4 <= arg1 && local41 >= arg1 && (this.anIntArrayArray9[arg1 - this.anInt2978][arg2 - this.anInt2989] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg4 == arg3 && arg0 == arg6) {
				return true;
			}
		} else if (arg3 >= arg4 && arg4 + arg1 - 1 >= arg3 && arg0 <= arg0 && arg0 <= arg0 + arg1 - 1) {
			return true;
		}
		@Pc(73) int local73 = arg4 - this.anInt2978;
		@Pc(78) int local78 = arg6 - this.anInt2989;
		@Pc(83) int local83 = arg3 - this.anInt2978;
		@Pc(88) int local88 = arg0 - this.anInt2989;
		if (arg1 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local83 + 1 == local73 && local78 == local88 && (this.anIntArrayArray9[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local83 == local73 && local78 == local88 - 1 && (this.anIntArrayArray9[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local83 - 1 == local73 && local78 == local88 && (this.anIntArrayArray9[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local83 == local73 && local78 == local88 - 1 && (this.anIntArrayArray9[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local83 - 1 == local73 && local88 == local78 && (this.anIntArrayArray9[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local83 == local73 && local88 + 1 == local78 && (this.anIntArrayArray9[local73][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local73 == local83 + 1 && local88 == local78 && (this.anIntArrayArray9[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local83 == local73 && local88 + 1 == local78 && (this.anIntArrayArray9[local73][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local73 == local83 && local88 + 1 == local78 && (this.anIntArrayArray9[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 == local83 && local88 - 1 == local78 && (this.anIntArrayArray9[local73][local78] & 0x2) == 0) {
					return true;
				}
				if (local73 == local83 - 1 && local78 == local88 && (this.anIntArrayArray9[local73][local78] & 0x8) == 0) {
					return true;
				}
				if (local73 == local83 + 1 && local88 == local78 && (this.anIntArrayArray9[local73][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(514) int local514 = local73 + arg1 - 1;
			@Pc(520) int local520 = arg1 + local78 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local83 + 1 == local73 && local88 >= local78 && local88 <= local520 && (this.anIntArrayArray9[local73][local88] & 0x80) == 0) {
						return true;
					}
					if (local73 <= local83 && local514 >= local83 && local78 == local88 - arg1 && (this.anIntArrayArray9[local83][local520] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local83 - arg1 == local73 && local78 <= local88 && local88 <= local520 && (this.anIntArrayArray9[local514][local88] & 0x8) == 0) {
						return true;
					}
					if (local83 >= local73 && local514 >= local83 && local88 - arg1 == local78 && (this.anIntArrayArray9[local83][local520] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local73 == local83 - arg1 && local78 <= local88 && local520 >= local88 && (this.anIntArrayArray9[local514][local88] & 0x8) == 0) {
						return true;
					}
					if (local83 >= local73 && local514 >= local83 && local88 + 1 == local78 && (this.anIntArrayArray9[local83][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local73 == local83 + 1 && local78 <= local88 && local520 >= local88 && (this.anIntArrayArray9[local73][local88] & 0x80) == 0) {
						return true;
					}
					if (local73 <= local83 && local514 >= local83 && local78 == local88 + 1 && (this.anIntArrayArray9[local83][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local73 <= local83 && local514 >= local83 && local78 == local88 + 1 && (this.anIntArrayArray9[local83][local78] & 0x20) == 0) {
					return true;
				}
				if (local83 >= local73 && local83 <= local514 && local78 == local88 - arg1 && (this.anIntArrayArray9[local83][local520] & 0x2) == 0) {
					return true;
				}
				if (local73 == local83 - arg1 && local88 >= local78 && local520 >= local88 && (this.anIntArrayArray9[local514][local88] & 0x8) == 0) {
					return true;
				}
				if (local83 + 1 == local73 && local78 <= local88 && local88 <= local520 && (this.anIntArrayArray9[local73][local88] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZIZI)V")
	public void method2723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(26) int local26 = arg0 - this.anInt2989;
		@Pc(31) int local31 = arg1 - this.anInt2978;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local31; local39 < local31 + arg3; local39++) {
			if (local39 >= 0 && local39 < this.anInt2990) {
				for (@Pc(53) int local53 = local26; local53 < local26 + arg5; local53++) {
					if (local53 >= 0 && local53 < this.anInt2985) {
						this.method2733(local53, local7, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
	public void method2724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2978;
		@Pc(21) int local21 = arg1 - this.anInt2989;
		this.anIntArrayArray9[local8][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)V")
	private void method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray9[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZZ)V")
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt2978;
		@Pc(13) int local13 = arg1 - this.anInt2989;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method2733(local13, 128, local8);
				this.method2733(local13, 8, local8 - 1);
			}
			if (arg3 == 1) {
				this.method2733(local13, 2, local8);
				this.method2733(local13 + 1, 32, local8);
			}
			if (arg3 == 2) {
				this.method2733(local13, 8, local8);
				this.method2733(local13, 128, local8 + 1);
			}
			if (arg3 == 3) {
				this.method2733(local13, 32, local8);
				this.method2733(local13 - 1, 2, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method2733(local13, 1, local8);
				this.method2733(local13 + 1, 16, local8 - 1);
			}
			if (arg3 == 1) {
				this.method2733(local13, 4, local8);
				this.method2733(local13 + 1, 64, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2733(local13, 16, local8);
				this.method2733(local13 - 1, 1, local8 + 1);
			}
			if (arg3 == 3) {
				this.method2733(local13, 64, local8);
				this.method2733(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method2733(local13, 130, local8);
				this.method2733(local13, 8, local8 - 1);
				this.method2733(local13 + 1, 32, local8);
			}
			if (arg3 == 1) {
				this.method2733(local13, 10, local8);
				this.method2733(local13 + 1, 32, local8);
				this.method2733(local13, 128, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2733(local13, 40, local8);
				this.method2733(local13, 128, local8 + 1);
				this.method2733(local13 - 1, 2, local8);
			}
			if (arg3 == 3) {
				this.method2733(local13, 160, local8);
				this.method2733(local13 - 1, 2, local8);
				this.method2733(local13, 8, local8 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method2733(local13, 65536, local8);
					this.method2733(local13, 4096, local8 - 1);
				}
				if (arg3 == 1) {
					this.method2733(local13, 1024, local8);
					this.method2733(local13 + 1, 16384, local8);
				}
				if (arg3 == 2) {
					this.method2733(local13, 4096, local8);
					this.method2733(local13, 65536, local8 + 1);
				}
				if (arg3 == 3) {
					this.method2733(local13, 16384, local8);
					this.method2733(local13 - 1, 1024, local8);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method2733(local13, 512, local8);
					this.method2733(local13 + 1, 8192, local8 - 1);
				}
				if (arg3 == 1) {
					this.method2733(local13, 2048, local8);
					this.method2733(local13 + 1, 32768, local8 + 1);
				}
				if (arg3 == 2) {
					this.method2733(local13, 8192, local8);
					this.method2733(local13 - 1, 512, local8 + 1);
				}
				if (arg3 == 3) {
					this.method2733(local13, 32768, local8);
					this.method2733(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method2733(local13, 66560, local8);
					this.method2733(local13, 4096, local8 - 1);
					this.method2733(local13 + 1, 16384, local8);
				}
				if (arg3 == 1) {
					this.method2733(local13, 5120, local8);
					this.method2733(local13 + 1, 16384, local8);
					this.method2733(local13, 65536, local8 + 1);
				}
				if (arg3 == 2) {
					this.method2733(local13, 20480, local8);
					this.method2733(local13, 65536, local8 + 1);
					this.method2733(local13 - 1, 1024, local8);
				}
				if (arg3 == 3) {
					this.method2733(local13, 81920, local8);
					this.method2733(local13 - 1, 1024, local8);
					this.method2733(local13, 4096, local8 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method2733(local13, 536870912, local8);
				this.method2733(local13, 33554432, local8 - 1);
			}
			if (arg3 == 1) {
				this.method2733(local13, 8388608, local8);
				this.method2733(local13 + 1, 134217728, local8);
			}
			if (arg3 == 2) {
				this.method2733(local13, 33554432, local8);
				this.method2733(local13, 536870912, local8 + 1);
			}
			if (arg3 == 3) {
				this.method2733(local13, 134217728, local8);
				this.method2733(local13 - 1, 8388608, local8);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method2733(local13, 4194304, local8);
				this.method2733(local13 + 1, 67108864, local8 - 1);
			}
			if (arg3 == 1) {
				this.method2733(local13, 16777216, local8);
				this.method2733(local13 + 1, 268435456, local8 + 1);
			}
			if (arg3 == 2) {
				this.method2733(local13, 67108864, local8);
				this.method2733(local13 - 1, 4194304, local8 + 1);
			}
			if (arg3 == 3) {
				this.method2733(local13, 268435456, local8);
				this.method2733(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2733(local13, 545259520, local8);
			this.method2733(local13, 33554432, local8 - 1);
			this.method2733(local13 + 1, 134217728, local8);
		}
		if (arg3 == 1) {
			this.method2733(local13, 41943040, local8);
			this.method2733(local13 + 1, 134217728, local8);
			this.method2733(local13, 536870912, local8 + 1);
		}
		if (arg3 == 2) {
			this.method2733(local13, 167772160, local8);
			this.method2733(local13, 536870912, local8 + 1);
			this.method2733(local13 - 1, 8388608, local8);
		}
		if (arg3 == 3) {
			this.method2733(local13, 671088640, local8);
			this.method2733(local13 - 1, 8388608, local8);
			this.method2733(local13, 33554432, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg4 && arg5 == arg6) {
				return true;
			}
		} else if (arg0 <= arg4 && arg2 + arg0 - 1 >= arg4 && arg5 >= arg5 && arg5 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(65) int local65 = arg6 - this.anInt2989;
		@Pc(77) int local77 = arg0 - this.anInt2978;
		@Pc(82) int local82 = arg4 - this.anInt2978;
		@Pc(87) int local87 = arg5 - this.anInt2989;
		if (arg2 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local82 - 1 == local77 && local65 == local87) {
						return true;
					}
					if (local77 == local82 && local65 == local87 + 1 && (this.anIntArrayArray9[local77][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 && local65 == local87 - 1 && (this.anIntArrayArray9[local77][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local82 == local77 && local65 == local87 + 1) {
						return true;
					}
					if (local77 == local82 - 1 && local87 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local82 + 1 && local87 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local82 + 1 && local65 == local87) {
						return true;
					}
					if (local82 == local77 && local87 + 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 && local87 - 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 == local82 && local65 == local87 - 1) {
						return true;
					}
					if (local82 - 1 == local77 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local82 + 1 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local77 == local82 - 1 && local87 == local65) {
						return true;
					}
					if (local82 == local77 && local87 + 1 == local65) {
						return true;
					}
					if (local77 == local82 + 1 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local82 && local87 - 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local77 == local82 - 1 && local87 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 && local87 + 1 == local65) {
						return true;
					}
					if (local82 + 1 == local77 && local65 == local87) {
						return true;
					}
					if (local82 == local77 && local65 == local87 - 1 && (this.anIntArrayArray9[local77][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local82 - 1 == local77 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 == local77 && local87 + 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 + 1 && local87 == local65) {
						return true;
					}
					if (local77 == local82 && local65 == local87 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 == local82 - 1 && local87 == local65) {
						return true;
					}
					if (local82 == local77 && local87 + 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 + 1 == local77 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local77 && local87 - 1 == local65) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local77 == local82 && local87 + 1 == local65 && (this.anIntArrayArray9[local77][local65] & 0x20) == 0) {
					return true;
				}
				if (local77 == local82 && local65 == local87 - 1 && (this.anIntArrayArray9[local77][local65] & 0x2) == 0) {
					return true;
				}
				if (local77 == local82 - 1 && local65 == local87 && (this.anIntArrayArray9[local77][local65] & 0x8) == 0) {
					return true;
				}
				if (local77 == local82 + 1 && local87 == local65 && (this.anIntArrayArray9[local77][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(996) int local996 = arg2 + local77 - 1;
			@Pc(1002) int local1002 = arg2 + local65 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local77 == local82 - arg2 && local65 <= local87 && local1002 >= local87) {
						return true;
					}
					if (local77 <= local82 && local82 <= local996 && local65 == local87 + 1 && (this.anIntArrayArray9[local82][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 >= local77 && local996 >= local82 && local65 == local87 - arg2 && (this.anIntArrayArray9[local82][local1002] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local82 >= local77 && local996 >= local82 && local87 + 1 == local65) {
						return true;
					}
					if (local77 == local82 - arg2 && local87 >= local65 && local1002 >= local87 && (this.anIntArrayArray9[local996][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 + 1 == local77 && local65 <= local87 && local1002 >= local87 && (this.anIntArrayArray9[local77][local87] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local82 + 1 && local87 >= local65 && local87 <= local1002) {
						return true;
					}
					if (local82 >= local77 && local82 <= local996 && local65 == local87 + 1 && (this.anIntArrayArray9[local82][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 <= local82 && local996 >= local82 && local65 == local87 - arg2 && (this.anIntArrayArray9[local82][local1002] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 <= local82 && local996 >= local82 && local87 - arg2 == local65) {
						return true;
					}
					if (local82 - arg2 == local77 && local65 <= local87 && local1002 >= local87 && (this.anIntArrayArray9[local996][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 + 1 == local77 && local65 <= local87 && local87 <= local1002 && (this.anIntArrayArray9[local77][local87] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local77 == local82 - arg2 && local87 >= local65 && local87 <= local1002) {
						return true;
					}
					if (local82 >= local77 && local82 <= local996 && local65 == local87 + 1) {
						return true;
					}
					if (local82 + 1 == local77 && local87 >= local65 && local1002 >= local87 && (this.anIntArrayArray9[local77][local87] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 <= local82 && local996 >= local82 && local65 == local87 - arg2 && (this.anIntArrayArray9[local82][local1002] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local82 - arg2 == local77 && local65 <= local87 && local1002 >= local87 && (this.anIntArrayArray9[local996][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 >= local77 && local82 <= local996 && local87 + 1 == local65) {
						return true;
					}
					if (local82 + 1 == local77 && local65 <= local87 && local87 <= local1002) {
						return true;
					}
					if (local77 <= local82 && local82 <= local996 && local87 - arg2 == local65 && (this.anIntArrayArray9[local82][local1002] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local82 - arg2 && local65 <= local87 && local1002 >= local87 && (this.anIntArrayArray9[local996][local87] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 >= local77 && local996 >= local82 && local65 == local87 + 1 && (this.anIntArrayArray9[local82][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 + 1 && local65 <= local87 && local87 <= local1002) {
						return true;
					}
					if (local77 <= local82 && local996 >= local82 && local65 == local87 - arg2) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 == local82 - arg2 && local87 >= local65 && local87 <= local1002) {
						return true;
					}
					if (local77 <= local82 && local82 <= local996 && local65 == local87 + 1 && (this.anIntArrayArray9[local82][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local82 + 1 && local65 <= local87 && local87 <= local1002 && (this.anIntArrayArray9[local77][local87] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 >= local77 && local996 >= local82 && local87 - arg2 == local65) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local82 >= local77 && local996 >= local82 && local87 + 1 == local65 && (this.anIntArrayArray9[local82][local65] & 0x2C0120) == 0) {
					return true;
				}
				if (local77 <= local82 && local82 <= local996 && local65 == local87 - arg2 && (this.anIntArrayArray9[local82][local1002] & 0x2C0102) == 0) {
					return true;
				}
				if (local82 - arg2 == local77 && local65 <= local87 && local87 <= local1002 && (this.anIntArrayArray9[local996][local87] & 0x2C0108) == 0) {
					return true;
				}
				if (local82 + 1 == local77 && local65 <= local87 && local1002 >= local87 && (this.anIntArrayArray9[local77][local87] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void method2730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2989;
		@Pc(9) int local9 = arg1 - this.anInt2978;
		this.anIntArrayArray9[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public void method2731() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2990; local11++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt2985; local17++) {
				if (local11 == 0 || local17 == 0 || local11 >= this.anInt2990 - 5 || local17 >= this.anInt2985 - 5) {
					this.anIntArrayArray9[local11][local17] = -1;
				} else {
					this.anIntArrayArray9[local11][local17] = 2097152;
				}
			}
		}
		Static168.anInt2972++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZIIIZ)V")
	public void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(33) int local33;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg0;
			arg0 = arg2;
			arg2 = local33;
		}
		@Pc(42) int local42 = arg5 - this.anInt2989;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(53) int local53 = arg1 - this.anInt2978;
		for (local33 = local53; local33 < arg0 + local53; local33++) {
			if (local33 >= 0 && this.anInt2990 > local33) {
				for (@Pc(73) int local73 = local42; local73 < arg2 + local42; local73++) {
					if (local73 >= 0 && local73 < this.anInt2985) {
						this.method2725(local33, local7, local73);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	private void method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray9[arg2][arg0] |= arg1;
	}
}
