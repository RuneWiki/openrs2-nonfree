import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class112 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public int anInt3133;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public int anInt3142;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public int anInt3143;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray90;

	static {
		new Class84("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
		new Class84("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIZII)V")
	public void method2680(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt3133;
		@Pc(19) int local19 = arg5 - this.anInt3142;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2688(local4, 128, local19);
				this.method2688(local4 - 1, 8, local19);
			}
			if (arg2 == 1) {
				this.method2688(local4, 2, local19);
				this.method2688(local4, 32, local19 + 1);
			}
			if (arg2 == 2) {
				this.method2688(local4, 8, local19);
				this.method2688(local4 + 1, 128, local19);
			}
			if (arg2 == 3) {
				this.method2688(local4, 32, local19);
				this.method2688(local4, 2, local19 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2688(local4, 1, local19);
				this.method2688(local4 - 1, 16, local19 + 1);
			}
			if (arg2 == 1) {
				this.method2688(local4, 4, local19);
				this.method2688(local4 + 1, 64, local19 + 1);
			}
			if (arg2 == 2) {
				this.method2688(local4, 16, local19);
				this.method2688(local4 + 1, 1, local19 - 1);
			}
			if (arg2 == 3) {
				this.method2688(local4, 64, local19);
				this.method2688(local4 - 1, 4, local19 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method2688(local4, 130, local19);
				this.method2688(local4 - 1, 8, local19);
				this.method2688(local4, 32, local19 + 1);
			}
			if (arg2 == 1) {
				this.method2688(local4, 10, local19);
				this.method2688(local4, 32, local19 + 1);
				this.method2688(local4 + 1, 128, local19);
			}
			if (arg2 == 2) {
				this.method2688(local4, 40, local19);
				this.method2688(local4 + 1, 128, local19);
				this.method2688(local4, 2, local19 - 1);
			}
			if (arg2 == 3) {
				this.method2688(local4, 160, local19);
				this.method2688(local4, 2, local19 - 1);
				this.method2688(local4 - 1, 8, local19);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method2688(local4, 65536, local19);
					this.method2688(local4 - 1, 4096, local19);
				}
				if (arg2 == 1) {
					this.method2688(local4, 1024, local19);
					this.method2688(local4, 16384, local19 + 1);
				}
				if (arg2 == 2) {
					this.method2688(local4, 4096, local19);
					this.method2688(local4 + 1, 65536, local19);
				}
				if (arg2 == 3) {
					this.method2688(local4, 16384, local19);
					this.method2688(local4, 1024, local19 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method2688(local4, 512, local19);
					this.method2688(local4 - 1, 8192, local19 + 1);
				}
				if (arg2 == 1) {
					this.method2688(local4, 2048, local19);
					this.method2688(local4 + 1, 32768, local19 + 1);
				}
				if (arg2 == 2) {
					this.method2688(local4, 8192, local19);
					this.method2688(local4 + 1, 512, local19 - 1);
				}
				if (arg2 == 3) {
					this.method2688(local4, 32768, local19);
					this.method2688(local4 - 1, 2048, local19 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method2688(local4, 66560, local19);
					this.method2688(local4 - 1, 4096, local19);
					this.method2688(local4, 16384, local19 + 1);
				}
				if (arg2 == 1) {
					this.method2688(local4, 5120, local19);
					this.method2688(local4, 16384, local19 + 1);
					this.method2688(local4 + 1, 65536, local19);
				}
				if (arg2 == 2) {
					this.method2688(local4, 20480, local19);
					this.method2688(local4 + 1, 65536, local19);
					this.method2688(local4, 1024, local19 - 1);
				}
				if (arg2 == 3) {
					this.method2688(local4, 81920, local19);
					this.method2688(local4, 1024, local19 - 1);
					this.method2688(local4 - 1, 4096, local19);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2688(local4, 536870912, local19);
				this.method2688(local4 - 1, 33554432, local19);
			}
			if (arg2 == 1) {
				this.method2688(local4, 8388608, local19);
				this.method2688(local4, 134217728, local19 + 1);
			}
			if (arg2 == 2) {
				this.method2688(local4, 33554432, local19);
				this.method2688(local4 + 1, 536870912, local19);
			}
			if (arg2 == 3) {
				this.method2688(local4, 134217728, local19);
				this.method2688(local4, 8388608, local19 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2688(local4, 4194304, local19);
				this.method2688(local4 - 1, 67108864, local19 + 1);
			}
			if (arg2 == 1) {
				this.method2688(local4, 16777216, local19);
				this.method2688(local4 + 1, 268435456, local19 + 1);
			}
			if (arg2 == 2) {
				this.method2688(local4, 67108864, local19);
				this.method2688(local4 + 1, 4194304, local19 - 1);
			}
			if (arg2 == 3) {
				this.method2688(local4, 268435456, local19);
				this.method2688(local4 - 1, 16777216, local19 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2688(local4, 545259520, local19);
			this.method2688(local4 - 1, 33554432, local19);
			this.method2688(local4, 134217728, local19 + 1);
		}
		if (arg2 == 1) {
			this.method2688(local4, 41943040, local19);
			this.method2688(local4, 134217728, local19 + 1);
			this.method2688(local4 + 1, 536870912, local19);
		}
		if (arg2 == 2) {
			this.method2688(local4, 167772160, local19);
			this.method2688(local4 + 1, 536870912, local19);
			this.method2688(local4, 8388608, local19 - 1);
		}
		if (arg2 == 3) {
			this.method2688(local4, 671088640, local19);
			this.method2688(local4, 8388608, local19 - 1);
			this.method2688(local4 - 1, 33554432, local19);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg6 == arg2 && arg4 == arg0) {
				return true;
			}
		} else if (arg2 <= arg6 && arg5 + arg2 - 1 >= arg6 && arg0 >= arg0 && arg0 <= arg0 + arg5 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg0 - this.anInt3142;
		@Pc(63) int local63 = arg4 - this.anInt3142;
		@Pc(68) int local68 = arg2 - this.anInt3133;
		@Pc(73) int local73 = arg6 - this.anInt3133;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local73 - 1 == local68 && local58 == local63) {
						return true;
					}
					if (local73 == local68 && local58 + 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 && local63 == local58 - 1 && (this.anIntArrayArray90[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 == local68 && local58 + 1 == local63) {
						return true;
					}
					if (local73 - 1 == local68 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 == local73 + 1 && local58 == local63) {
						return true;
					}
					if (local73 == local68 && local63 == local58 + 1 && (this.anIntArrayArray90[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 && local58 - 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local68 == local73 && local63 == local58 - 1) {
						return true;
					}
					if (local68 == local73 - 1 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local63 == local58 && (this.anIntArrayArray90[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local73 - 1 == local68 && local63 == local58) {
						return true;
					}
					if (local73 == local68 && local58 + 1 == local63) {
						return true;
					}
					if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local73 && local58 - 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local68 == local73 - 1 && local63 == local58 && (this.anIntArrayArray90[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local58 + 1 == local63) {
						return true;
					}
					if (local73 + 1 == local68 && local58 == local63) {
						return true;
					}
					if (local68 == local73 && local58 - 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray90[local68][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local58 + 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local63 == local58) {
						return true;
					}
					if (local73 == local68 && local58 - 1 == local63) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 - 1 == local68 && local58 == local63) {
						return true;
					}
					if (local68 == local73 && local58 + 1 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local68 && local63 == local58 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local73 == local68 && local63 == local58 + 1 && (this.anIntArrayArray90[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local73 && local63 == local58 - 1 && (this.anIntArrayArray90[local68][local63] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray90[local68][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray90[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg5 + local68 - 1;
			@Pc(90) int local90 = arg5 + local63 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local73 - arg5 == local68 && local58 >= local63 && local90 >= local58) {
						return true;
					}
					if (local73 >= local68 && local84 >= local73 && local63 == local58 + 1 && (this.anIntArrayArray90[local73][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local84 && local63 == local58 - arg5 && (this.anIntArrayArray90[local73][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local68 <= local73 && local73 <= local84 && local63 == local58 + 1) {
						return true;
					}
					if (local73 - arg5 == local68 && local63 <= local58 && local58 <= local90 && (this.anIntArrayArray90[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray90[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local68 == local73 + 1 && local58 >= local63 && local90 >= local58) {
						return true;
					}
					if (local73 >= local68 && local84 >= local73 && local63 == local58 + 1 && (this.anIntArrayArray90[local73][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local73 && local84 >= local73 && local58 - arg5 == local63 && (this.anIntArrayArray90[local73][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local68 <= local73 && local73 <= local84 && local63 == local58 - arg5) {
						return true;
					}
					if (local68 == local73 - arg5 && local63 <= local58 && local58 <= local90 && (this.anIntArrayArray90[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray90[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local73 - arg5 == local68 && local63 <= local58 && local58 <= local90) {
						return true;
					}
					if (local73 >= local68 && local73 <= local84 && local58 + 1 == local63) {
						return true;
					}
					if (local73 + 1 == local68 && local63 <= local58 && local90 >= local58 && (this.anIntArrayArray90[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local84 && local63 == local58 - arg5 && (this.anIntArrayArray90[local73][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 - arg5 == local68 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray90[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local84 && local63 == local58 + 1) {
						return true;
					}
					if (local68 == local73 + 1 && local63 <= local58 && local58 <= local90) {
						return true;
					}
					if (local68 <= local73 && local84 >= local73 && local58 - arg5 == local63 && (this.anIntArrayArray90[local73][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local73 - arg5 == local68 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray90[local84][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local84 && local58 + 1 == local63 && (this.anIntArrayArray90[local73][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local58 >= local63 && local58 <= local90) {
						return true;
					}
					if (local73 >= local68 && local84 >= local73 && local63 == local58 - arg5) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local73 - arg5 == local68 && local58 >= local63 && local90 >= local58) {
						return true;
					}
					if (local73 >= local68 && local73 <= local84 && local63 == local58 + 1 && (this.anIntArrayArray90[local73][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray90[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 >= local68 && local84 >= local73 && local63 == local58 - arg5) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local68 <= local73 && local84 >= local73 && local63 == local58 + 1 && (this.anIntArrayArray90[local73][local63] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 <= local73 && local84 >= local73 && local58 - arg5 == local63 && (this.anIntArrayArray90[local73][local90] & 0x2C0102) == 0) {
					return true;
				}
				if (local73 - arg5 == local68 && local58 >= local63 && local90 >= local58 && (this.anIntArrayArray90[local84][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local63 <= local58 && local90 >= local58 && (this.anIntArrayArray90[local68][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIZIII)V")
	public void method2684(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = 256;
		if (arg3) {
			local11 = 131328;
		}
		if (arg0) {
			local11 |= 0x40000000;
		}
		@Pc(28) int local28 = arg6 - this.anInt3142;
		@Pc(36) int local36;
		if (arg1 == 1 || arg1 == 3) {
			local36 = arg4;
			arg4 = arg2;
			arg2 = local36;
		}
		@Pc(45) int local45 = arg5 - this.anInt3133;
		for (local36 = local45; local36 < local45 + arg4; local36++) {
			if (local36 >= 0 && this.anInt3143 > local36) {
				for (@Pc(57) int local57 = local28; local57 < local28 + arg2; local57++) {
					if (local57 >= 0 && local57 < this.anInt3131) {
						this.method2688(local36, local11, local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	private void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray90[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public void method2686() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3143; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt3131; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt3143 - 5 || this.anInt3131 - 5 <= local11) {
					this.anIntArrayArray90[local7][local11] = -1;
				} else {
					this.anIntArrayArray90[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg3 && arg1 == arg4) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg0 + arg6 - 1 && arg4 <= arg4 && arg4 <= arg4 + arg0 - 1) {
			return true;
		}
		@Pc(64) int local64 = arg4 - this.anInt3142;
		@Pc(69) int local69 = arg1 - this.anInt3142;
		@Pc(74) int local74 = arg6 - this.anInt3133;
		@Pc(79) int local79 = arg3 - this.anInt3133;
		if (arg0 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local74 == local79 + 1 && local64 == local69 && (this.anIntArrayArray90[local74][local69] & 0x80) == 0) {
						return true;
					}
					if (local74 == local79 && local69 == local64 - 1 && (this.anIntArrayArray90[local74][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local74 == local79 - 1 && local64 == local69 && (this.anIntArrayArray90[local74][local69] & 0x8) == 0) {
						return true;
					}
					if (local79 == local74 && local64 - 1 == local69 && (this.anIntArrayArray90[local74][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local79 - 1 == local74 && local64 == local69 && (this.anIntArrayArray90[local74][local69] & 0x8) == 0) {
						return true;
					}
					if (local74 == local79 && local69 == local64 + 1 && (this.anIntArrayArray90[local74][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local79 + 1 == local74 && local69 == local64 && (this.anIntArrayArray90[local74][local69] & 0x80) == 0) {
						return true;
					}
					if (local74 == local79 && local69 == local64 + 1 && (this.anIntArrayArray90[local74][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local79 == local74 && local64 + 1 == local69 && (this.anIntArrayArray90[local74][local69] & 0x20) == 0) {
					return true;
				}
				if (local79 == local74 && local69 == local64 - 1 && (this.anIntArrayArray90[local74][local69] & 0x2) == 0) {
					return true;
				}
				if (local79 - 1 == local74 && local64 == local69 && (this.anIntArrayArray90[local74][local69] & 0x8) == 0) {
					return true;
				}
				if (local74 == local79 + 1 && local64 == local69 && (this.anIntArrayArray90[local74][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = arg0 + local74 - 1;
			@Pc(94) int local94 = arg0 + local69 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local79 + 1 == local74 && local64 >= local69 && local64 <= local94 && (this.anIntArrayArray90[local74][local64] & 0x80) == 0) {
						return true;
					}
					if (local74 <= local79 && local88 >= local79 && local64 - arg0 == local69 && (this.anIntArrayArray90[local79][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local79 - arg0 == local74 && local64 >= local69 && local64 <= local94 && (this.anIntArrayArray90[local88][local64] & 0x8) == 0) {
						return true;
					}
					if (local79 >= local74 && local88 >= local79 && local69 == local64 - arg0 && (this.anIntArrayArray90[local79][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local74 == local79 - arg0 && local64 >= local69 && local94 >= local64 && (this.anIntArrayArray90[local88][local64] & 0x8) == 0) {
						return true;
					}
					if (local74 <= local79 && local79 <= local88 && local64 + 1 == local69 && (this.anIntArrayArray90[local79][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local74 == local79 + 1 && local64 >= local69 && local94 >= local64 && (this.anIntArrayArray90[local74][local64] & 0x80) == 0) {
						return true;
					}
					if (local74 <= local79 && local79 <= local88 && local64 + 1 == local69 && (this.anIntArrayArray90[local79][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local74 <= local79 && local88 >= local79 && local64 + 1 == local69 && (this.anIntArrayArray90[local79][local69] & 0x20) == 0) {
					return true;
				}
				if (local74 <= local79 && local88 >= local79 && local69 == local64 - arg0 && (this.anIntArrayArray90[local79][local94] & 0x2) == 0) {
					return true;
				}
				if (local74 == local79 - arg0 && local64 >= local69 && local94 >= local64 && (this.anIntArrayArray90[local88][local64] & 0x8) == 0) {
					return true;
				}
				if (local79 + 1 == local74 && local64 >= local69 && local64 <= local94 && (this.anIntArrayArray90[local74][local64] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBI)V")
	private void method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray90[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
	public void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3133;
		@Pc(13) int local13 = arg1 - this.anInt3142;
		this.anIntArrayArray90[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIIIIIIII)Z")
	public boolean method2690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static44.method729(arg3, arg6, arg0, arg1, arg5, arg2, arg4, arg6) ? true : this.method2695(arg1, arg6, arg5, arg7, arg3, arg6, arg0, arg2, arg4);
		}
		@Pc(49) int local49 = arg2 + arg1 - 1;
		@Pc(55) int local55 = arg4 + arg0 - 1;
		if (arg2 <= arg3 && local49 >= arg3 && arg5 >= arg0 && arg5 <= local55) {
			return true;
		} else if (arg2 - 1 == arg3 && arg5 >= arg0 && arg5 <= local55 && (this.anIntArrayArray90[arg3 - this.anInt3133][arg5 - this.anInt3142] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (local49 + 1 == arg3 && arg5 >= arg0 && local55 >= arg5 && (this.anIntArrayArray90[arg3 - this.anInt3133][arg5 - this.anInt3142] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg0 - 1 && arg2 <= arg3 && local49 >= arg3 && (this.anIntArrayArray90[arg3 - this.anInt3133][arg5 - this.anInt3142] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local55 + 1 && arg3 >= arg2 && local49 >= arg3 && (this.anIntArrayArray90[arg3 - this.anInt3133][arg5 - this.anInt3142] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBIZZI)V")
	public void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = arg1 - this.anInt3142;
		@Pc(21) int local21 = arg2 - this.anInt3133;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method2685(local21, local16, 128);
				this.method2685(local21 - 1, local16, 8);
			}
			if (arg0 == 1) {
				this.method2685(local21, local16, 2);
				this.method2685(local21, local16 + 1, 32);
			}
			if (arg0 == 2) {
				this.method2685(local21, local16, 8);
				this.method2685(local21 + 1, local16, 128);
			}
			if (arg0 == 3) {
				this.method2685(local21, local16, 32);
				this.method2685(local21, local16 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method2685(local21, local16, 1);
				this.method2685(local21 - 1, local16 + 1, 16);
			}
			if (arg0 == 1) {
				this.method2685(local21, local16, 4);
				this.method2685(local21 + 1, local16 - -1, 64);
			}
			if (arg0 == 2) {
				this.method2685(local21, local16, 16);
				this.method2685(local21 + 1, local16 + -1, 1);
			}
			if (arg0 == 3) {
				this.method2685(local21, local16, 64);
				this.method2685(local21 - 1, local16 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method2685(local21, local16, 130);
				this.method2685(local21 - 1, local16, 8);
				this.method2685(local21, local16 + 1, 32);
			}
			if (arg0 == 1) {
				this.method2685(local21, local16, 10);
				this.method2685(local21, local16 + 1, 32);
				this.method2685(local21 + 1, local16, 128);
			}
			if (arg0 == 2) {
				this.method2685(local21, local16, 40);
				this.method2685(local21 + 1, local16, 128);
				this.method2685(local21, local16 - 1, 2);
			}
			if (arg0 == 3) {
				this.method2685(local21, local16, 160);
				this.method2685(local21, local16 - 1, 2);
				this.method2685(local21 - 1, local16, 8);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method2685(local21, local16, 65536);
					this.method2685(local21 - 1, local16, 4096);
				}
				if (arg0 == 1) {
					this.method2685(local21, local16, 1024);
					this.method2685(local21, local16 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method2685(local21, local16, 4096);
					this.method2685(local21 + 1, local16, 65536);
				}
				if (arg0 == 3) {
					this.method2685(local21, local16, 16384);
					this.method2685(local21, local16 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method2685(local21, local16, 512);
					this.method2685(local21 - 1, local16 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method2685(local21, local16, 2048);
					this.method2685(local21 + 1, local16 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method2685(local21, local16, 8192);
					this.method2685(local21 + 1, local16 - 1, 512);
				}
				if (arg0 == 3) {
					this.method2685(local21, local16, 32768);
					this.method2685(local21 - 1, local16 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method2685(local21, local16, 66560);
					this.method2685(local21 - 1, local16, 4096);
					this.method2685(local21, local16 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method2685(local21, local16, 5120);
					this.method2685(local21, local16 + 1, 16384);
					this.method2685(local21 + 1, local16, 65536);
				}
				if (arg0 == 2) {
					this.method2685(local21, local16, 20480);
					this.method2685(local21 + 1, local16, 65536);
					this.method2685(local21, local16 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method2685(local21, local16, 81920);
					this.method2685(local21, local16 - 1, 1024);
					this.method2685(local21 - 1, local16, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method2685(local21, local16, 536870912);
				this.method2685(local21 - 1, local16, 33554432);
			}
			if (arg0 == 1) {
				this.method2685(local21, local16, 8388608);
				this.method2685(local21, local16 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method2685(local21, local16, 33554432);
				this.method2685(local21 + 1, local16, 536870912);
			}
			if (arg0 == 3) {
				this.method2685(local21, local16, 134217728);
				this.method2685(local21, local16 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method2685(local21, local16, 4194304);
				this.method2685(local21 - 1, local16 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method2685(local21, local16, 16777216);
				this.method2685(local21 + 1, local16 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method2685(local21, local16, 67108864);
				this.method2685(local21 + 1, local16 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method2685(local21, local16, 268435456);
				this.method2685(local21 - 1, local16 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2685(local21, local16, 545259520);
			this.method2685(local21 - 1, local16, 33554432);
			this.method2685(local21, local16 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method2685(local21, local16, 41943040);
			this.method2685(local21, local16 + 1, 134217728);
			this.method2685(local21 + 1, local16, 536870912);
		}
		if (arg0 == 2) {
			this.method2685(local21, local16, 167772160);
			this.method2685(local21 + 1, local16, 536870912);
			this.method2685(local21, local16 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method2685(local21, local16, 671088640);
			this.method2685(local21, local16 - 1, 8388608);
			this.method2685(local21 - 1, local16, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZZZI)V")
	public void method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(23) int local23 = arg0 - this.anInt3133;
		@Pc(28) int local28 = arg1 - this.anInt3142;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(36) int local36 = local23; local36 < arg5 + local23; local36++) {
			if (local36 >= 0 && this.anInt3143 > local36) {
				for (@Pc(49) int local49 = local28; local49 < arg2 + local28; local49++) {
					if (local49 >= 0 && this.anInt3131 > local49) {
						this.method2685(local36, local49, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	public void method2694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3133;
		@Pc(13) int local13 = arg0 - this.anInt3142;
		this.anIntArrayArray90[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIB)Z")
	public boolean method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(16) int local16 = arg4 + arg5;
		@Pc(20) int local20 = arg1 + arg2;
		@Pc(24) int local24 = arg7 + arg0;
		@Pc(29) int local29 = arg6 + arg8;
		@Pc(71) int local71;
		@Pc(78) int local78;
		if (arg4 == local24 && (arg3 & 0x2) == 0) {
			local71 = arg6 >= arg2 ? arg6 : arg2;
			local78 = local20 >= local29 ? local29 : local20;
			while (local78 > local71) {
				if ((this.anIntArrayArray90[local24 - this.anInt3133 - 1][local71 - this.anInt3142] & 0x8) == 0) {
					return true;
				}
				local71++;
			}
		} else if (arg7 == local16 && (arg3 & 0x8) == 0) {
			local71 = arg6 >= arg2 ? arg6 : arg2;
			local78 = local29 <= local20 ? local29 : local20;
			while (local78 > local71) {
				if ((this.anIntArrayArray90[arg7 - this.anInt3133][local71 - this.anInt3142] & 0x80) == 0) {
					return true;
				}
				local71++;
			}
		} else if (arg2 == local29 && (arg3 & 0x1) == 0) {
			local71 = arg7 < arg4 ? arg4 : arg7;
			local78 = local24 <= local16 ? local24 : local16;
			while (local71 < local78) {
				if ((this.anIntArrayArray90[local71 - this.anInt3133][local29 - this.anInt3142 - 1] & 0x2) == 0) {
					return true;
				}
				local71++;
			}
		} else if (local20 == arg6 && (arg3 & 0x4) == 0) {
			local71 = arg7 >= arg4 ? arg7 : arg4;
			local78 = local24 > local16 ? local16 : local24;
			while (local71 < local78) {
				if ((this.anIntArrayArray90[local71 - this.anInt3133][arg6 - this.anInt3142] & 0x20) == 0) {
					return true;
				}
				local71++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
	public void method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt3133;
		@Pc(21) int local21 = arg1 - this.anInt3142;
		this.anIntArrayArray90[local16][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)V")
	public void method2697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3133;
		@Pc(13) int local13 = arg0 - this.anInt3142;
		this.anIntArrayArray90[local8][local13] &= 0xFFFBFFFF;
	}
}
