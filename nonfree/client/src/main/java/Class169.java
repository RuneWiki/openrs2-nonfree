import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class169 {

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public int anInt4219;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	public int anInt4224;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public int anInt4228;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt4229;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg0 && arg3 == arg6) {
				return true;
			}
		} else if (arg1 <= arg0 && arg0 <= arg1 + arg5 - 1 && arg3 >= arg3 && arg3 + arg5 - 1 >= arg3) {
			return true;
		}
		@Pc(76) int local76 = arg1 - this.anInt4219;
		@Pc(81) int local81 = arg3 - this.anInt4229;
		@Pc(86) int local86 = arg0 - this.anInt4219;
		@Pc(91) int local91 = arg6 - this.anInt4229;
		if (arg5 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local76 == local86 + 1 && local81 == local91 && (this.anIntArrayArray34[local76][local91] & 0x80) == 0) {
						return true;
					}
					if (local76 == local86 && local81 - 1 == local91 && (this.anIntArrayArray34[local76][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local76 == local86 - 1 && local91 == local81 && (this.anIntArrayArray34[local76][local91] & 0x8) == 0) {
						return true;
					}
					if (local76 == local86 && local91 == local81 - 1 && (this.anIntArrayArray34[local76][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local76 == local86 - 1 && local91 == local81 && (this.anIntArrayArray34[local76][local91] & 0x8) == 0) {
						return true;
					}
					if (local86 == local76 && local91 == local81 + 1 && (this.anIntArrayArray34[local76][local91] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local76 == local86 + 1 && local91 == local81 && (this.anIntArrayArray34[local76][local91] & 0x80) == 0) {
						return true;
					}
					if (local86 == local76 && local81 + 1 == local91 && (this.anIntArrayArray34[local76][local91] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local76 == local86 && local91 == local81 + 1 && (this.anIntArrayArray34[local76][local91] & 0x20) == 0) {
					return true;
				}
				if (local76 == local86 && local91 == local81 - 1 && (this.anIntArrayArray34[local76][local91] & 0x2) == 0) {
					return true;
				}
				if (local76 == local86 - 1 && local91 == local81 && (this.anIntArrayArray34[local76][local91] & 0x8) == 0) {
					return true;
				}
				if (local76 == local86 + 1 && local91 == local81 && (this.anIntArrayArray34[local76][local91] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(108) int local108 = local76 + arg5 - 1;
			@Pc(115) int local115 = local91 + arg5 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local86 + 1 == local76 && local81 >= local91 && local115 >= local81 && (this.anIntArrayArray34[local76][local81] & 0x80) == 0) {
						return true;
					}
					if (local86 >= local76 && local86 <= local108 && local91 == local81 - arg5 && (this.anIntArrayArray34[local86][local115] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local76 == local86 - arg5 && local81 >= local91 && local81 <= local115 && (this.anIntArrayArray34[local108][local81] & 0x8) == 0) {
						return true;
					}
					if (local76 <= local86 && local108 >= local86 && local91 == local81 - arg5 && (this.anIntArrayArray34[local86][local115] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local76 == local86 - arg5 && local81 >= local91 && local115 >= local81 && (this.anIntArrayArray34[local108][local81] & 0x8) == 0) {
						return true;
					}
					if (local86 >= local76 && local108 >= local86 && local81 + 1 == local91 && (this.anIntArrayArray34[local86][local91] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local86 + 1 == local76 && local91 <= local81 && local115 >= local81 && (this.anIntArrayArray34[local76][local81] & 0x80) == 0) {
						return true;
					}
					if (local76 <= local86 && local108 >= local86 && local81 + 1 == local91 && (this.anIntArrayArray34[local86][local91] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local76 <= local86 && local108 >= local86 && local81 + 1 == local91 && (this.anIntArrayArray34[local86][local91] & 0x20) == 0) {
					return true;
				}
				if (local86 >= local76 && local86 <= local108 && local91 == local81 - arg5 && (this.anIntArrayArray34[local86][local115] & 0x2) == 0) {
					return true;
				}
				if (local76 == local86 - arg5 && local81 >= local91 && local81 <= local115 && (this.anIntArrayArray34[local108][local81] & 0x8) == 0) {
					return true;
				}
				if (local86 + 1 == local76 && local81 >= local91 && local81 <= local115 && (this.anIntArrayArray34[local76][local81] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V")
	public void method3864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4219;
		@Pc(31) int local31 = arg0 - this.anInt4229;
		this.anIntArrayArray34[local4][local31] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIII)V")
	private void method3865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18 = arg2 + arg7;
		@Pc(22) int local22 = arg3 + arg4;
		@Pc(26) int local26 = arg5 + arg0;
		@Pc(30) int local30 = arg8 + arg6;
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (arg2 == local26 && (arg1 & 0x2) == 0) {
			local60 = arg4 <= arg8 ? arg8 : arg4;
			local68 = local22 >= local30 ? local30 : local22;
			while (local68 > local60) {
				if ((this.anIntArrayArray34[local26 - this.anInt4219 - 1][local60 - this.anInt4229] & 0x8) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg5 == local18 && (arg1 & 0x8) == 0) {
			local60 = arg4 <= arg8 ? arg8 : arg4;
			local68 = local22 < local30 ? local22 : local30;
			while (local68 > local60) {
				if ((this.anIntArrayArray34[arg5 - this.anInt4219][local60 - this.anInt4229] & 0x80) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg4 == local30 && (arg1 & 0x1) == 0) {
			local60 = arg5 >= arg2 ? arg5 : arg2;
			local68 = local18 < local26 ? local18 : local26;
			while (local60 < local68) {
				if ((this.anIntArrayArray34[local60 - this.anInt4219][local30 - this.anInt4229 - 1] & 0x2) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg8 == local22 && (arg1 & 0x4) == 0) {
			local60 = arg5 < arg2 ? arg2 : arg5;
			local68 = local26 > local18 ? local18 : local26;
			while (local68 > local60) {
				if ((this.anIntArrayArray34[local60 - this.anInt4219][arg8 - this.anInt4229] & 0x20) == 0) {
					return true;
				}
				local60++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZZIIIZ)V")
	public void method3867(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt4219;
		@Pc(9) int local9 = arg3 - this.anInt4229;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3870(local4, 128, local9);
				this.method3870(local4 - 1, 8, local9);
			}
			if (arg4 == 1) {
				this.method3870(local4, 2, local9);
				this.method3870(local4, 32, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3870(local4, 8, local9);
				this.method3870(local4 + 1, 128, local9);
			}
			if (arg4 == 3) {
				this.method3870(local4, 32, local9);
				this.method3870(local4, 2, local9 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3870(local4, 1, local9);
				this.method3870(local4 - 1, 16, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3870(local4, 4, local9);
				this.method3870(local4 + 1, 64, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3870(local4, 16, local9);
				this.method3870(local4 + 1, 1, local9 - 1);
			}
			if (arg4 == 3) {
				this.method3870(local4, 64, local9);
				this.method3870(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method3870(local4, 130, local9);
				this.method3870(local4 - 1, 8, local9);
				this.method3870(local4, 32, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3870(local4, 10, local9);
				this.method3870(local4, 32, local9 + 1);
				this.method3870(local4 + 1, 128, local9);
			}
			if (arg4 == 2) {
				this.method3870(local4, 40, local9);
				this.method3870(local4 + 1, 128, local9);
				this.method3870(local4, 2, local9 - 1);
			}
			if (arg4 == 3) {
				this.method3870(local4, 160, local9);
				this.method3870(local4, 2, local9 - 1);
				this.method3870(local4 - 1, 8, local9);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method3870(local4, 65536, local9);
					this.method3870(local4 - 1, 4096, local9);
				}
				if (arg4 == 1) {
					this.method3870(local4, 1024, local9);
					this.method3870(local4, 16384, local9 + 1);
				}
				if (arg4 == 2) {
					this.method3870(local4, 4096, local9);
					this.method3870(local4 + 1, 65536, local9);
				}
				if (arg4 == 3) {
					this.method3870(local4, 16384, local9);
					this.method3870(local4, 1024, local9 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method3870(local4, 512, local9);
					this.method3870(local4 - 1, 8192, local9 + 1);
				}
				if (arg4 == 1) {
					this.method3870(local4, 2048, local9);
					this.method3870(local4 + 1, 32768, local9 + 1);
				}
				if (arg4 == 2) {
					this.method3870(local4, 8192, local9);
					this.method3870(local4 + 1, 512, local9 - 1);
				}
				if (arg4 == 3) {
					this.method3870(local4, 32768, local9);
					this.method3870(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method3870(local4, 66560, local9);
					this.method3870(local4 - 1, 4096, local9);
					this.method3870(local4, 16384, local9 + 1);
				}
				if (arg4 == 1) {
					this.method3870(local4, 5120, local9);
					this.method3870(local4, 16384, local9 + 1);
					this.method3870(local4 + 1, 65536, local9);
				}
				if (arg4 == 2) {
					this.method3870(local4, 20480, local9);
					this.method3870(local4 + 1, 65536, local9);
					this.method3870(local4, 1024, local9 - 1);
				}
				if (arg4 == 3) {
					this.method3870(local4, 81920, local9);
					this.method3870(local4, 1024, local9 - 1);
					this.method3870(local4 - 1, 4096, local9);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method3870(local4, 536870912, local9);
				this.method3870(local4 - 1, 33554432, local9);
			}
			if (arg4 == 1) {
				this.method3870(local4, 8388608, local9);
				this.method3870(local4, 134217728, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3870(local4, 33554432, local9);
				this.method3870(local4 + 1, 536870912, local9);
			}
			if (arg4 == 3) {
				this.method3870(local4, 134217728, local9);
				this.method3870(local4, 8388608, local9 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method3870(local4, 4194304, local9);
				this.method3870(local4 - 1, 67108864, local9 + 1);
			}
			if (arg4 == 1) {
				this.method3870(local4, 16777216, local9);
				this.method3870(local4 + 1, 268435456, local9 + 1);
			}
			if (arg4 == 2) {
				this.method3870(local4, 67108864, local9);
				this.method3870(local4 + 1, 4194304, local9 - 1);
			}
			if (arg4 == 3) {
				this.method3870(local4, 268435456, local9);
				this.method3870(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method3870(local4, 545259520, local9);
			this.method3870(local4 - 1, 33554432, local9);
			this.method3870(local4, 134217728, local9 + 1);
		}
		if (arg4 == 1) {
			this.method3870(local4, 41943040, local9);
			this.method3870(local4, 134217728, local9 + 1);
			this.method3870(local4 + 1, 536870912, local9);
		}
		if (arg4 == 2) {
			this.method3870(local4, 167772160, local9);
			this.method3870(local4 + 1, 536870912, local9);
			this.method3870(local4, 8388608, local9 - 1);
		}
		if (arg4 == 3) {
			this.method3870(local4, 671088640, local9);
			this.method3870(local4, 8388608, local9 - 1);
			this.method3870(local4 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method3868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static570.method7683(arg2, arg1, arg7, arg7, arg3, arg4, arg6, arg0) ? true : this.method3866(arg0, arg5, arg2, arg7, arg3, arg6, arg1, arg7, arg4);
		}
		@Pc(41) int local41 = arg6 + arg0 - 1;
		@Pc(47) int local47 = arg1 + arg4 - 1;
		if (arg6 <= arg2 && arg2 <= local41 && arg4 <= arg3 && local47 >= arg3) {
			return true;
		} else if (arg6 - 1 == arg2 && arg3 >= arg4 && local47 >= arg3 && (this.anIntArrayArray34[arg2 - this.anInt4219][arg3 - this.anInt4229] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg2 == local41 + 1 && arg4 <= arg3 && arg3 <= local47 && (this.anIntArrayArray34[arg2 - this.anInt4219][arg3 - this.anInt4229] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg4 - 1 && arg2 >= arg6 && local41 >= arg2 && (this.anIntArrayArray34[arg2 - this.anInt4219][arg3 - this.anInt4229] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg3 && arg2 >= arg6 && local41 >= arg2 && (this.anIntArrayArray34[arg2 - this.anInt4219][arg3 - this.anInt4229] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public void method3869() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt4228; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4224; local14++) {
				if (local8 == 0 || local14 == 0 || this.anInt4228 - 5 <= local8 || local14 >= this.anInt4224 - 5) {
					this.anIntArrayArray34[local8][local14] = -1;
				} else {
					this.anIntArrayArray34[local8][local14] = 2097152;
				}
			}
		}
		Static244.anInt4223++;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	private void method3870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIZIZI)V")
	public void method3871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt4219;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg3 - this.anInt4229;
		for (@Pc(31) int local31 = local18; local31 < local18 + arg5; local31++) {
			if (local31 >= 0 && this.anInt4228 > local31) {
				for (@Pc(48) int local48 = local29; local48 < local29 + arg1; local48++) {
					if (local48 >= 0 && this.anInt4224 > local48) {
						this.method3865(local7, local48, local31);
					}
				}
			}
		}
		if (-13 != -13) {
			this.anInt4228 = 2;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method3873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg0 == arg4 && arg6 == arg1) {
				return true;
			}
		} else if (arg0 >= arg4 && arg0 <= arg4 + arg5 - 1 && arg1 <= arg1 && arg1 + arg5 - 1 >= arg1) {
			return true;
		}
		@Pc(77) int local77 = arg1 - this.anInt4229;
		@Pc(82) int local82 = arg0 - this.anInt4219;
		@Pc(87) int local87 = arg4 - this.anInt4219;
		@Pc(92) int local92 = arg6 - this.anInt4229;
		if (arg5 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local82 - 1 == local87 && local92 == local77) {
						return true;
					}
					if (local87 == local82 && local92 == local77 + 1 && (this.anIntArrayArray34[local87][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local87 && local77 - 1 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local87 == local82 && local92 == local77 + 1) {
						return true;
					}
					if (local87 == local82 - 1 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 + 1 == local87 && local92 == local77 && (this.anIntArrayArray34[local87][local92] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 + 1 == local87 && local92 == local77) {
						return true;
					}
					if (local87 == local82 && local77 + 1 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 == local87 && local77 - 1 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local87 == local82 && local92 == local77 - 1) {
						return true;
					}
					if (local87 == local82 - 1 && local92 == local77 && (this.anIntArrayArray34[local87][local92] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 + 1 == local87 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local87 == local82 - 1 && local77 == local92) {
						return true;
					}
					if (local82 == local87 && local92 == local77 + 1) {
						return true;
					}
					if (local87 == local82 + 1 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local87 && local92 == local77 - 1 && (this.anIntArrayArray34[local87][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local87 == local82 - 1 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0108) == 0) {
						return true;
					}
					if (local87 == local82 && local92 == local77 + 1) {
						return true;
					}
					if (local82 + 1 == local87 && local77 == local92) {
						return true;
					}
					if (local87 == local82 && local92 == local77 - 1 && (this.anIntArrayArray34[local87][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 - 1 == local87 && local92 == local77 && (this.anIntArrayArray34[local87][local92] & 0x2C0108) == 0) {
						return true;
					}
					if (local87 == local82 && local77 + 1 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 + 1 == local87 && local77 == local92) {
						return true;
					}
					if (local82 == local87 && local77 - 1 == local92) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local82 - 1 == local87 && local77 == local92) {
						return true;
					}
					if (local82 == local87 && local77 + 1 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local87 == local82 + 1 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 == local87 && local77 - 1 == local92) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local87 == local82 && local92 == local77 + 1 && (this.anIntArrayArray34[local87][local92] & 0x20) == 0) {
					return true;
				}
				if (local87 == local82 && local92 == local77 - 1 && (this.anIntArrayArray34[local87][local92] & 0x2) == 0) {
					return true;
				}
				if (local87 == local82 - 1 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x8) == 0) {
					return true;
				}
				if (local82 + 1 == local87 && local77 == local92 && (this.anIntArrayArray34[local87][local92] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(975) int local975 = arg5 + local87 - 1;
			@Pc(981) int local981 = arg5 + local92 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local82 - arg5 == local87 && local77 >= local92 && local981 >= local77) {
						return true;
					}
					if (local87 <= local82 && local82 <= local975 && local77 + 1 == local92 && (this.anIntArrayArray34[local82][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 >= local87 && local82 <= local975 && local77 - arg5 == local92 && (this.anIntArrayArray34[local82][local981] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local87 <= local82 && local975 >= local82 && local92 == local77 + 1) {
						return true;
					}
					if (local87 == local82 - arg5 && local77 >= local92 && local77 <= local981 && (this.anIntArrayArray34[local975][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 + 1 == local87 && local92 <= local77 && local77 <= local981 && (this.anIntArrayArray34[local87][local77] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 + 1 == local87 && local77 >= local92 && local981 >= local77) {
						return true;
					}
					if (local87 <= local82 && local975 >= local82 && local92 == local77 + 1 && (this.anIntArrayArray34[local82][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local87 <= local82 && local975 >= local82 && local77 - arg5 == local92 && (this.anIntArrayArray34[local82][local981] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local87 <= local82 && local82 <= local975 && local77 - arg5 == local92) {
						return true;
					}
					if (local87 == local82 - arg5 && local92 <= local77 && local77 <= local981 && (this.anIntArrayArray34[local975][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local87 == local82 + 1 && local77 >= local92 && local981 >= local77 && (this.anIntArrayArray34[local87][local77] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local87 == local82 - arg5 && local92 <= local77 && local77 <= local981) {
						return true;
					}
					if (local82 >= local87 && local82 <= local975 && local77 + 1 == local92) {
						return true;
					}
					if (local87 == local82 + 1 && local92 <= local77 && local981 >= local77 && (this.anIntArrayArray34[local87][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 >= local87 && local975 >= local82 && local92 == local77 - arg5 && (this.anIntArrayArray34[local82][local981] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local82 - arg5 == local87 && local92 <= local77 && local77 <= local981 && (this.anIntArrayArray34[local975][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local87 <= local82 && local975 >= local82 && local92 == local77 + 1) {
						return true;
					}
					if (local82 + 1 == local87 && local92 <= local77 && local77 <= local981) {
						return true;
					}
					if (local82 >= local87 && local82 <= local975 && local92 == local77 - arg5 && (this.anIntArrayArray34[local82][local981] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local82 - arg5 == local87 && local92 <= local77 && local77 <= local981 && (this.anIntArrayArray34[local975][local77] & 0x2C0108) == 0) {
						return true;
					}
					if (local82 >= local87 && local975 >= local82 && local92 == local77 + 1 && (this.anIntArrayArray34[local82][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local87 == local82 + 1 && local92 <= local77 && local77 <= local981) {
						return true;
					}
					if (local87 <= local82 && local975 >= local82 && local92 == local77 - arg5) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local82 - arg5 == local87 && local92 <= local77 && local981 >= local77) {
						return true;
					}
					if (local82 >= local87 && local82 <= local975 && local77 + 1 == local92 && (this.anIntArrayArray34[local82][local92] & 0x2C0120) == 0) {
						return true;
					}
					if (local82 + 1 == local87 && local77 >= local92 && local77 <= local981 && (this.anIntArrayArray34[local87][local77] & 0x2C0180) == 0) {
						return true;
					}
					if (local82 >= local87 && local82 <= local975 && local77 - arg5 == local92) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local82 >= local87 && local82 <= local975 && local77 + 1 == local92 && (this.anIntArrayArray34[local82][local92] & 0x2C0120) == 0) {
					return true;
				}
				if (local82 >= local87 && local975 >= local82 && local92 == local77 - arg5 && (this.anIntArrayArray34[local82][local981] & 0x2C0102) == 0) {
					return true;
				}
				if (local82 - arg5 == local87 && local92 <= local77 && local981 >= local77 && (this.anIntArrayArray34[local975][local77] & 0x2C0108) == 0) {
					return true;
				}
				if (local87 == local82 + 1 && local92 <= local77 && local77 <= local981 && (this.anIntArrayArray34[local87][local77] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)V")
	public void method3874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4219;
		@Pc(9) int local9 = arg0 - this.anInt4229;
		this.anIntArrayArray34[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZZIIII)V")
	public void method3876(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt4229;
		@Pc(9) int local9 = arg5 - this.anInt4219;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3865(128, local4, local9);
				this.method3865(8, local4, local9 - 1);
			}
			if (arg0 == 1) {
				this.method3865(2, local4, local9);
				this.method3865(32, local4 + 1, local9);
			}
			if (arg0 == 2) {
				this.method3865(8, local4, local9);
				this.method3865(128, local4, local9 + 1);
			}
			if (arg0 == 3) {
				this.method3865(32, local4, local9);
				this.method3865(2, local4 - 1, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3865(1, local4, local9);
				this.method3865(16, local4 + 1, local9 + -1);
			}
			if (arg0 == 1) {
				this.method3865(4, local4, local9);
				this.method3865(64, local4 + 1, local9 + 1);
			}
			if (arg0 == 2) {
				this.method3865(16, local4, local9);
				this.method3865(1, local4 - 1, local9 + 1);
			}
			if (arg0 == 3) {
				this.method3865(64, local4, local9);
				this.method3865(4, local4 - 1, local9 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method3865(130, local4, local9);
				this.method3865(8, local4, local9 - 1);
				this.method3865(32, local4 + 1, local9);
			}
			if (arg0 == 1) {
				this.method3865(10, local4, local9);
				this.method3865(32, local4 + 1, local9);
				this.method3865(128, local4, local9 + 1);
			}
			if (arg0 == 2) {
				this.method3865(40, local4, local9);
				this.method3865(128, local4, local9 + 1);
				this.method3865(2, local4 - 1, local9);
			}
			if (arg0 == 3) {
				this.method3865(160, local4, local9);
				this.method3865(2, local4 - 1, local9);
				this.method3865(8, local4, local9 - 1);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method3865(65536, local4, local9);
					this.method3865(4096, local4, local9 - 1);
				}
				if (arg0 == 1) {
					this.method3865(1024, local4, local9);
					this.method3865(16384, local4 + 1, local9);
				}
				if (arg0 == 2) {
					this.method3865(4096, local4, local9);
					this.method3865(65536, local4, local9 + 1);
				}
				if (arg0 == 3) {
					this.method3865(16384, local4, local9);
					this.method3865(1024, local4 - 1, local9);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method3865(512, local4, local9);
					this.method3865(8192, local4 + 1, local9 + -1);
				}
				if (arg0 == 1) {
					this.method3865(2048, local4, local9);
					this.method3865(32768, local4 + 1, local9 - -1);
				}
				if (arg0 == 2) {
					this.method3865(8192, local4, local9);
					this.method3865(512, local4 - 1, local9 + 1);
				}
				if (arg0 == 3) {
					this.method3865(32768, local4, local9);
					this.method3865(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method3865(66560, local4, local9);
					this.method3865(4096, local4, local9 - 1);
					this.method3865(16384, local4 + 1, local9);
				}
				if (arg0 == 1) {
					this.method3865(5120, local4, local9);
					this.method3865(16384, local4 + 1, local9);
					this.method3865(65536, local4, local9 + 1);
				}
				if (arg0 == 2) {
					this.method3865(20480, local4, local9);
					this.method3865(65536, local4, local9 + 1);
					this.method3865(1024, local4 - 1, local9);
				}
				if (arg0 == 3) {
					this.method3865(81920, local4, local9);
					this.method3865(1024, local4 - 1, local9);
					this.method3865(4096, local4, local9 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3865(536870912, local4, local9);
				this.method3865(33554432, local4, local9 - 1);
			}
			if (arg0 == 1) {
				this.method3865(8388608, local4, local9);
				this.method3865(134217728, local4 + 1, local9);
			}
			if (arg0 == 2) {
				this.method3865(33554432, local4, local9);
				this.method3865(536870912, local4, local9 + 1);
			}
			if (arg0 == 3) {
				this.method3865(134217728, local4, local9);
				this.method3865(8388608, local4 - 1, local9);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3865(4194304, local4, local9);
				this.method3865(67108864, local4 + 1, local9 + -1);
			}
			if (arg0 == 1) {
				this.method3865(16777216, local4, local9);
				this.method3865(268435456, local4 + 1, local9 + 1);
			}
			if (arg0 == 2) {
				this.method3865(67108864, local4, local9);
				this.method3865(4194304, local4 - 1, local9 + 1);
			}
			if (arg0 == 3) {
				this.method3865(268435456, local4, local9);
				this.method3865(16777216, local4 - 1, local9 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3865(545259520, local4, local9);
			this.method3865(33554432, local4, local9 - 1);
			this.method3865(134217728, local4 + 1, local9);
		}
		if (arg0 == 1) {
			this.method3865(41943040, local4, local9);
			this.method3865(134217728, local4 + 1, local9);
			this.method3865(536870912, local4, local9 + 1);
		}
		if (arg0 == 2) {
			this.method3865(167772160, local4, local9);
			this.method3865(536870912, local4, local9 + 1);
			this.method3865(8388608, local4 - 1, local9);
		}
		if (arg0 == 3) {
			this.method3865(671088640, local4, local9);
			this.method3865(8388608, local4 - 1, local9);
			this.method3865(33554432, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIIIIIZ)V")
	public void method3878(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg6) {
			local7 |= 0x40000000;
		}
		@Pc(32) int local32 = arg5 - this.anInt4219;
		@Pc(37) int local37 = arg0 - this.anInt4229;
		@Pc(49) int local49;
		if (arg4 == 1 || arg4 == 3) {
			local49 = arg3;
			arg3 = arg2;
			arg2 = local49;
		}
		for (local49 = local32; local49 < local32 + arg3; local49++) {
			if (local49 >= 0 && this.anInt4228 > local49) {
				for (@Pc(73) int local73 = local37; local73 < arg2 + local37; local73++) {
					if (local73 >= 0 && local73 < this.anInt4224) {
						this.method3870(local49, local7, local73);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	public void method3879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 - this.anInt4219;
		@Pc(14) int local14 = arg0 - this.anInt4229;
		this.anIntArrayArray34[local9][local14] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	public void method3880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4229;
		@Pc(17) int local17 = arg1 - this.anInt4219;
		this.anIntArrayArray34[local17][local4] |= 0x40000;
	}
}
