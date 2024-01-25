import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class306 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray85;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	public int anInt8969;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public int anInt8973;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	public int anInt8975;

	static {
		new Class67("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	public void method7354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8975;
		@Pc(9) int local9 = arg0 - this.anInt8969;
		this.anIntArrayArray85[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIIBII)Z")
	public boolean method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg0;
		@Pc(13) int local13 = arg8 + arg6;
		@Pc(18) int local18 = arg5 + arg2;
		@Pc(22) int local22 = arg7 + arg4;
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg0 == local18 && (arg3 & 0x2) == 0) {
			local39 = arg6 <= arg4 ? arg4 : arg6;
			local46 = local13 >= local22 ? local22 : local13;
			while (local39 < local46) {
				if ((this.anIntArrayArray85[local18 - this.anInt8975 - 1][local39 - this.anInt8969] & 0x8) == 0) {
					return true;
				}
				local39++;
			}
		} else if (arg5 == local9 && (arg3 & 0x8) == 0) {
			local39 = arg4 >= arg6 ? arg4 : arg6;
			local46 = local13 >= local22 ? local22 : local13;
			while (local46 > local39) {
				if ((this.anIntArrayArray85[arg5 - this.anInt8975][local39 - this.anInt8969] & 0x80) == 0) {
					return true;
				}
				local39++;
			}
		} else if (local22 == arg6 && (arg3 & 0x1) == 0) {
			local39 = arg5 < arg0 ? arg0 : arg5;
			local46 = local9 >= local18 ? local18 : local9;
			while (local46 > local39) {
				if ((this.anIntArrayArray85[local39 - this.anInt8975][local22 - this.anInt8969 - 1] & 0x2) == 0) {
					return true;
				}
				local39++;
			}
		} else if (local13 == arg4 && (arg3 & 0x4) == 0) {
			local39 = arg0 <= arg5 ? arg5 : arg0;
			local46 = local18 <= local9 ? local18 : local9;
			while (local46 > local39) {
				if ((this.anIntArrayArray85[local39 - this.anInt8975][arg4 - this.anInt8969] & 0x20) == 0) {
					return true;
				}
				local39++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIIII)Z")
	public boolean method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static467.method6978(arg4, arg7, arg1, arg0, arg3, arg5, arg2, arg7) ? true : this.method7355(arg5, arg7, arg2, arg6, arg3, arg4, arg1, arg0, arg7);
		}
		@Pc(48) int local48 = arg2 + arg4 - 1;
		@Pc(54) int local54 = arg0 + arg3 - 1;
		if (arg4 <= arg5 && arg5 <= local48 && arg3 <= arg1 && arg1 <= local54) {
			return true;
		} else if (arg5 == arg4 - 1 && arg1 >= arg3 && local54 >= arg1 && (this.anIntArrayArray85[arg5 - this.anInt8975][arg1 - this.anInt8969] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local48 + 1 == arg5 && arg1 >= arg3 && local54 >= arg1 && (this.anIntArrayArray85[arg5 - this.anInt8975][arg1 - this.anInt8969] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg3 - 1 && arg5 >= arg4 && local48 >= arg5 && (this.anIntArrayArray85[arg5 - this.anInt8975][arg1 - this.anInt8969] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local54 + 1 == arg1 && arg5 >= arg4 && arg5 <= local48 && (this.anIntArrayArray85[arg5 - this.anInt8975][arg1 - this.anInt8969] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BZIZIII)V")
	public void method7357(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt8975;
		@Pc(13) int local13 = arg3 - this.anInt8969;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method7361(128, local13, local4);
				this.method7361(8, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method7361(2, local13, local4);
				this.method7361(32, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method7361(8, local13, local4);
				this.method7361(128, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method7361(32, local13, local4);
				this.method7361(2, local13 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method7361(1, local13, local4);
				this.method7361(16, local13 + 1, local4 + -1);
			}
			if (arg4 == 1) {
				this.method7361(4, local13, local4);
				this.method7361(64, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7361(16, local13, local4);
				this.method7361(1, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method7361(64, local13, local4);
				this.method7361(4, local13 - 1, local4 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method7361(130, local13, local4);
				this.method7361(8, local13, local4 - 1);
				this.method7361(32, local13 + 1, local4);
			}
			if (arg4 == 1) {
				this.method7361(10, local13, local4);
				this.method7361(32, local13 + 1, local4);
				this.method7361(128, local13, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7361(40, local13, local4);
				this.method7361(128, local13, local4 + 1);
				this.method7361(2, local13 - 1, local4);
			}
			if (arg4 == 3) {
				this.method7361(160, local13, local4);
				this.method7361(2, local13 - 1, local4);
				this.method7361(8, local13, local4 - 1);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method7361(65536, local13, local4);
					this.method7361(4096, local13, local4 - 1);
				}
				if (arg4 == 1) {
					this.method7361(1024, local13, local4);
					this.method7361(16384, local13 + 1, local4);
				}
				if (arg4 == 2) {
					this.method7361(4096, local13, local4);
					this.method7361(65536, local13, local4 + 1);
				}
				if (arg4 == 3) {
					this.method7361(16384, local13, local4);
					this.method7361(1024, local13 - 1, local4);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method7361(512, local13, local4);
					this.method7361(8192, local13 + 1, local4 + -1);
				}
				if (arg4 == 1) {
					this.method7361(2048, local13, local4);
					this.method7361(32768, local13 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method7361(8192, local13, local4);
					this.method7361(512, local13 - 1, local4 - -1);
				}
				if (arg4 == 3) {
					this.method7361(32768, local13, local4);
					this.method7361(2048, local13 - 1, local4 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method7361(66560, local13, local4);
					this.method7361(4096, local13, local4 - 1);
					this.method7361(16384, local13 + 1, local4);
				}
				if (arg4 == 1) {
					this.method7361(5120, local13, local4);
					this.method7361(16384, local13 + 1, local4);
					this.method7361(65536, local13, local4 + 1);
				}
				if (arg4 == 2) {
					this.method7361(20480, local13, local4);
					this.method7361(65536, local13, local4 + 1);
					this.method7361(1024, local13 - 1, local4);
				}
				if (arg4 == 3) {
					this.method7361(81920, local13, local4);
					this.method7361(1024, local13 - 1, local4);
					this.method7361(4096, local13, local4 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method7361(536870912, local13, local4);
				this.method7361(33554432, local13, local4 - 1);
			}
			if (arg4 == 1) {
				this.method7361(8388608, local13, local4);
				this.method7361(134217728, local13 + 1, local4);
			}
			if (arg4 == 2) {
				this.method7361(33554432, local13, local4);
				this.method7361(536870912, local13, local4 + 1);
			}
			if (arg4 == 3) {
				this.method7361(134217728, local13, local4);
				this.method7361(8388608, local13 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method7361(4194304, local13, local4);
				this.method7361(67108864, local13 + 1, local4 - 1);
			}
			if (arg4 == 1) {
				this.method7361(16777216, local13, local4);
				this.method7361(268435456, local13 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method7361(67108864, local13, local4);
				this.method7361(4194304, local13 - 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method7361(268435456, local13, local4);
				this.method7361(16777216, local13 - 1, local4 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method7361(545259520, local13, local4);
			this.method7361(33554432, local13, local4 - 1);
			this.method7361(134217728, local13 + 1, local4);
		}
		if (arg4 == 1) {
			this.method7361(41943040, local13, local4);
			this.method7361(134217728, local13 + 1, local4);
			this.method7361(536870912, local13, local4 + 1);
		}
		if (arg4 == 2) {
			this.method7361(167772160, local13, local4);
			this.method7361(536870912, local13, local4 + 1);
			this.method7361(8388608, local13 - 1, local4);
		}
		if (arg4 == 3) {
			this.method7361(671088640, local13, local4);
			this.method7361(8388608, local13 - 1, local4);
			this.method7361(33554432, local13, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZIZB)V")
	public void method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt8975;
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg0 - this.anInt8969;
		for (@Pc(31) int local31 = local18; local31 < local18 + arg2; local31++) {
			if (local31 >= 0 && local31 < this.anInt8973) {
				for (@Pc(51) int local51 = local29; local51 < arg1 + local29; local51++) {
					if (local51 >= 0 && local51 < this.anInt8965) {
						this.method7361(local7, local51, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIZIIZ)V")
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(27) int local27;
		if (arg1 == 1 || arg1 == 3) {
			local27 = arg2;
			arg2 = arg0;
			arg0 = local27;
		}
		@Pc(36) int local36 = arg5 - this.anInt8975;
		@Pc(41) int local41 = arg4 - this.anInt8969;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (local27 = local36; local27 < local36 + arg2; local27++) {
			if (local27 >= 0 && this.anInt8973 > local27) {
				for (@Pc(59) int local59 = local41; local59 < arg0 + local41; local59++) {
					if (local59 >= 0 && this.anInt8965 > local59) {
						this.method7362(local59, local27, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZIBIIZ)V")
	public void method7360(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt8969;
		@Pc(9) int local9 = arg0 - this.anInt8975;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method7362(local4, local9, 128);
				this.method7362(local4, local9 - 1, 8);
			}
			if (arg3 == 1) {
				this.method7362(local4, local9, 2);
				this.method7362(local4 + 1, local9, 32);
			}
			if (arg3 == 2) {
				this.method7362(local4, local9, 8);
				this.method7362(local4, local9 + 1, 128);
			}
			if (arg3 == 3) {
				this.method7362(local4, local9, 32);
				this.method7362(local4 - 1, local9, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method7362(local4, local9, 1);
				this.method7362(local4 + 1, local9 + -1, 16);
			}
			if (arg3 == 1) {
				this.method7362(local4, local9, 4);
				this.method7362(local4 + 1, local9 - -1, 64);
			}
			if (arg3 == 2) {
				this.method7362(local4, local9, 16);
				this.method7362(local4 - 1, local9 + 1, 1);
			}
			if (arg3 == 3) {
				this.method7362(local4, local9, 64);
				this.method7362(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method7362(local4, local9, 130);
				this.method7362(local4, local9 - 1, 8);
				this.method7362(local4 + 1, local9, 32);
			}
			if (arg3 == 1) {
				this.method7362(local4, local9, 10);
				this.method7362(local4 + 1, local9, 32);
				this.method7362(local4, local9 + 1, 128);
			}
			if (arg3 == 2) {
				this.method7362(local4, local9, 40);
				this.method7362(local4, local9 + 1, 128);
				this.method7362(local4 - 1, local9, 2);
			}
			if (arg3 == 3) {
				this.method7362(local4, local9, 160);
				this.method7362(local4 - 1, local9, 2);
				this.method7362(local4, local9 - 1, 8);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method7362(local4, local9, 65536);
					this.method7362(local4, local9 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method7362(local4, local9, 1024);
					this.method7362(local4 + 1, local9, 16384);
				}
				if (arg3 == 2) {
					this.method7362(local4, local9, 4096);
					this.method7362(local4, local9 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method7362(local4, local9, 16384);
					this.method7362(local4 - 1, local9, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method7362(local4, local9, 512);
					this.method7362(local4 + 1, local9 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method7362(local4, local9, 2048);
					this.method7362(local4 + 1, local9 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method7362(local4, local9, 8192);
					this.method7362(local4 - 1, local9 + 1, 512);
				}
				if (arg3 == 3) {
					this.method7362(local4, local9, 32768);
					this.method7362(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method7362(local4, local9, 66560);
					this.method7362(local4, local9 - 1, 4096);
					this.method7362(local4 + 1, local9, 16384);
				}
				if (arg3 == 1) {
					this.method7362(local4, local9, 5120);
					this.method7362(local4 + 1, local9, 16384);
					this.method7362(local4, local9 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method7362(local4, local9, 20480);
					this.method7362(local4, local9 + 1, 65536);
					this.method7362(local4 - 1, local9, 1024);
				}
				if (arg3 == 3) {
					this.method7362(local4, local9, 81920);
					this.method7362(local4 - 1, local9, 1024);
					this.method7362(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method7362(local4, local9, 536870912);
				this.method7362(local4, local9 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method7362(local4, local9, 8388608);
				this.method7362(local4 + 1, local9, 134217728);
			}
			if (arg3 == 2) {
				this.method7362(local4, local9, 33554432);
				this.method7362(local4, local9 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method7362(local4, local9, 134217728);
				this.method7362(local4 - 1, local9, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method7362(local4, local9, 4194304);
				this.method7362(local4 + 1, local9 + -1, 67108864);
			}
			if (arg3 == 1) {
				this.method7362(local4, local9, 16777216);
				this.method7362(local4 + 1, local9 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method7362(local4, local9, 67108864);
				this.method7362(local4 - 1, local9 + 1, 4194304);
			}
			if (arg3 == 3) {
				this.method7362(local4, local9, 268435456);
				this.method7362(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method7362(local4, local9, 545259520);
			this.method7362(local4, local9 - 1, 33554432);
			this.method7362(local4 + 1, local9, 134217728);
		}
		if (arg3 == 1) {
			this.method7362(local4, local9, 41943040);
			this.method7362(local4 + 1, local9, 134217728);
			this.method7362(local4, local9 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method7362(local4, local9, 167772160);
			this.method7362(local4, local9 + 1, 536870912);
			this.method7362(local4 - 1, local9, 8388608);
		}
		if (arg3 == 3) {
			this.method7362(local4, local9, 671088640);
			this.method7362(local4 - 1, local9, 8388608);
			this.method7362(local4, local9 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIII)V")
	private void method7361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray85[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V")
	private void method7362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray85[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V")
	public void method7363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt8975;
		@Pc(21) int local21 = arg1 - this.anInt8969;
		this.anIntArrayArray85[local16][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	public void method7366() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8973; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt8965; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt8973 - 5 <= local3 || local7 >= this.anInt8965 - 5) {
					this.anIntArrayArray85[local3][local7] = -1;
				} else {
					this.anIntArrayArray85[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(III)V")
	public void method7367(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt8969;
		@Pc(13) int local13 = arg0 - this.anInt8975;
		this.anIntArrayArray85[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method7368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg2 == arg0 && arg5 == arg1) {
				return true;
			}
		} else if (arg2 <= arg0 && arg0 <= arg4 + arg2 - 1 && arg5 >= arg5 && arg5 + arg4 - 1 >= arg5) {
			return true;
		}
		@Pc(79) int local79 = arg2 - this.anInt8975;
		@Pc(84) int local84 = arg1 - this.anInt8969;
		@Pc(89) int local89 = arg0 - this.anInt8975;
		@Pc(94) int local94 = arg5 - this.anInt8969;
		if (arg4 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local79 == local89 + 1 && local94 == local84 && (this.anIntArrayArray85[local79][local84] & 0x80) == 0) {
						return true;
					}
					if (local79 == local89 && local94 - 1 == local84 && (this.anIntArrayArray85[local79][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local79 == local89 - 1 && local84 == local94 && (this.anIntArrayArray85[local79][local84] & 0x8) == 0) {
						return true;
					}
					if (local89 == local79 && local94 - 1 == local84 && (this.anIntArrayArray85[local79][local84] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local89 - 1 == local79 && local94 == local84 && (this.anIntArrayArray85[local79][local84] & 0x8) == 0) {
						return true;
					}
					if (local79 == local89 && local94 + 1 == local84 && (this.anIntArrayArray85[local79][local84] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local79 == local89 + 1 && local84 == local94 && (this.anIntArrayArray85[local79][local84] & 0x80) == 0) {
						return true;
					}
					if (local79 == local89 && local84 == local94 + 1 && (this.anIntArrayArray85[local79][local84] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local79 == local89 && local94 + 1 == local84 && (this.anIntArrayArray85[local79][local84] & 0x20) == 0) {
					return true;
				}
				if (local79 == local89 && local94 - 1 == local84 && (this.anIntArrayArray85[local79][local84] & 0x2) == 0) {
					return true;
				}
				if (local89 - 1 == local79 && local94 == local84 && (this.anIntArrayArray85[local79][local84] & 0x8) == 0) {
					return true;
				}
				if (local79 == local89 + 1 && local84 == local94 && (this.anIntArrayArray85[local79][local84] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(105) int local105 = arg4 + local79 - 1;
			@Pc(111) int local111 = arg4 + local84 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local89 + 1 == local79 && local94 >= local84 && local111 >= local94 && (this.anIntArrayArray85[local79][local94] & 0x80) == 0) {
						return true;
					}
					if (local89 >= local79 && local89 <= local105 && local94 - arg4 == local84 && (this.anIntArrayArray85[local89][local111] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local89 - arg4 == local79 && local84 <= local94 && local94 <= local111 && (this.anIntArrayArray85[local105][local94] & 0x8) == 0) {
						return true;
					}
					if (local79 <= local89 && local89 <= local105 && local94 - arg4 == local84 && (this.anIntArrayArray85[local89][local111] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local79 == local89 - arg4 && local94 >= local84 && local111 >= local94 && (this.anIntArrayArray85[local105][local94] & 0x8) == 0) {
						return true;
					}
					if (local79 <= local89 && local105 >= local89 && local84 == local94 + 1 && (this.anIntArrayArray85[local89][local84] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local89 + 1 == local79 && local84 <= local94 && local94 <= local111 && (this.anIntArrayArray85[local79][local94] & 0x80) == 0) {
						return true;
					}
					if (local89 >= local79 && local89 <= local105 && local84 == local94 + 1 && (this.anIntArrayArray85[local89][local84] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local89 >= local79 && local105 >= local89 && local94 + 1 == local84 && (this.anIntArrayArray85[local89][local84] & 0x20) == 0) {
					return true;
				}
				if (local79 <= local89 && local89 <= local105 && local84 == local94 - arg4 && (this.anIntArrayArray85[local89][local111] & 0x2) == 0) {
					return true;
				}
				if (local79 == local89 - arg4 && local84 <= local94 && local111 >= local94 && (this.anIntArrayArray85[local105][local94] & 0x8) == 0) {
					return true;
				}
				if (local89 + 1 == local79 && local84 <= local94 && local94 <= local111 && (this.anIntArrayArray85[local79][local94] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method7369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg2 && arg3 == arg4) {
				return true;
			}
		} else if (arg2 >= arg5 && arg2 <= arg5 + arg6 - 1 && arg3 <= arg3 && arg6 + arg3 - 1 >= arg3) {
			return true;
		}
		@Pc(61) int local61 = arg2 - this.anInt8975;
		@Pc(66) int local66 = arg3 - this.anInt8969;
		@Pc(71) int local71 = arg5 - this.anInt8975;
		@Pc(76) int local76 = arg4 - this.anInt8969;
		if (arg6 == 1) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local61 - 1 == local71 && local76 == local66) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local71 == local61 && local76 == local66 + 1) {
						return true;
					}
					if (local61 - 1 == local71 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local61 + 1 == local71 && local76 == local66) {
						return true;
					}
					if (local61 == local71 && local66 + 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local76 == local66 - 1 && (this.anIntArrayArray85[local71][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local61 == local71 && local66 - 1 == local76) {
						return true;
					}
					if (local71 == local61 - 1 && local66 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local61 - 1 == local71 && local66 == local76) {
						return true;
					}
					if (local61 == local71 && local66 + 1 == local76) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local71 == local61 - 1 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local76 == local66 + 1) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local76) {
						return true;
					}
					if (local61 == local71 && local76 == local66 - 1 && (this.anIntArrayArray85[local71][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local71 == local61 - 1 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local76 == local66 + 1 && (this.anIntArrayArray85[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 == local76) {
						return true;
					}
					if (local61 == local71 && local76 == local66 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 == local61 - 1 && local76 == local66) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local71 == local61 && local76 == local66 + 1 && (this.anIntArrayArray85[local71][local76] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local66 - 1 == local76 && (this.anIntArrayArray85[local71][local76] & 0x2) == 0) {
					return true;
				}
				if (local71 == local61 - 1 && local66 == local76 && (this.anIntArrayArray85[local71][local76] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local76 == local66 && (this.anIntArrayArray85[local71][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(88) int local88 = local71 + arg6 - 1;
			@Pc(95) int local95 = local76 + arg6 - 1;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local61 - arg6 == local71 && local66 >= local76 && local95 >= local66) {
						return true;
					}
					if (local61 >= local71 && local88 >= local61 && local66 + 1 == local76 && (this.anIntArrayArray85[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 <= local61 && local88 >= local61 && local76 == local66 - arg6 && (this.anIntArrayArray85[local61][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local61 >= local71 && local88 >= local61 && local76 == local66 + 1) {
						return true;
					}
					if (local61 - arg6 == local71 && local66 >= local76 && local95 >= local66 && (this.anIntArrayArray85[local88][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local76 && local95 >= local66 && (this.anIntArrayArray85[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local61 + 1 == local71 && local66 >= local76 && local95 >= local66) {
						return true;
					}
					if (local61 >= local71 && local61 <= local88 && local76 == local66 + 1 && (this.anIntArrayArray85[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local88 && local66 - arg6 == local76 && (this.anIntArrayArray85[local61][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 <= local61 && local61 <= local88 && local76 == local66 - arg6) {
						return true;
					}
					if (local71 == local61 - arg6 && local66 >= local76 && local66 <= local95 && (this.anIntArrayArray85[local88][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local76 && local66 <= local95 && (this.anIntArrayArray85[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local61 - arg6 == local71 && local66 >= local76 && local95 >= local66) {
						return true;
					}
					if (local71 <= local61 && local61 <= local88 && local66 + 1 == local76) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local76 && local66 <= local95 && (this.anIntArrayArray85[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 <= local61 && local88 >= local61 && local76 == local66 - arg6 && (this.anIntArrayArray85[local61][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local61 - arg6 == local71 && local66 >= local76 && local95 >= local66 && (this.anIntArrayArray85[local88][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 <= local61 && local88 >= local61 && local76 == local66 + 1) {
						return true;
					}
					if (local61 + 1 == local71 && local76 <= local66 && local66 <= local95) {
						return true;
					}
					if (local71 <= local61 && local61 <= local88 && local66 - arg6 == local76 && (this.anIntArrayArray85[local61][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local71 == local61 - arg6 && local66 >= local76 && local95 >= local66 && (this.anIntArrayArray85[local88][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local71 && local88 >= local61 && local76 == local66 + 1 && (this.anIntArrayArray85[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local61 + 1 && local66 >= local76 && local95 >= local66) {
						return true;
					}
					if (local61 >= local71 && local61 <= local88 && local76 == local66 - arg6) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 == local61 - arg6 && local76 <= local66 && local95 >= local66) {
						return true;
					}
					if (local61 >= local71 && local88 >= local61 && local66 + 1 == local76 && (this.anIntArrayArray85[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local71 && local66 >= local76 && local95 >= local66 && (this.anIntArrayArray85[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 <= local61 && local88 >= local61 && local66 - arg6 == local76) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local61 >= local71 && local88 >= local61 && local66 + 1 == local76 && (this.anIntArrayArray85[local61][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local71 <= local61 && local61 <= local88 && local66 - arg6 == local76 && (this.anIntArrayArray85[local61][local95] & 0x2C0102) == 0) {
					return true;
				}
				if (local71 == local61 - arg6 && local76 <= local66 && local95 >= local66 && (this.anIntArrayArray85[local88][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 == local61 + 1 && local76 <= local66 && local66 <= local95 && (this.anIntArrayArray85[local71][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(III)V")
	public void method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt8969;
		@Pc(17) int local17 = arg1 - this.anInt8975;
		this.anIntArrayArray85[local17][local4] &= 0xFFFBFFFF;
	}
}
