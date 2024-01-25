import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class10 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
	public int anInt162;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
	public int anInt163;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BIII)V")
	private void method302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray2[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	public void method303() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt165; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt159; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt165 - 5 || local11 >= this.anInt159 - 5) {
					this.anIntArrayArray2[local7][local11] = -1;
				} else {
					this.anIntArrayArray2[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg7;
		@Pc(13) int local13 = arg5 + arg8;
		@Pc(17) int local17 = arg1 + arg2;
		@Pc(31) int local31 = arg3 + arg4;
		@Pc(67) int local67;
		@Pc(78) int local78;
		if (arg7 == local17 && (arg0 & 0x2) == 0) {
			local67 = arg3 >= arg8 ? arg3 : arg8;
			local78 = local13 < local31 ? local13 : local31;
			while (local78 > local67) {
				if ((this.anIntArrayArray2[local17 - this.anInt163 - 1][local67 - this.anInt162] & 0x8) == 0) {
					return true;
				}
				local67++;
			}
		} else if (arg1 == local9 && (arg0 & 0x8) == 0) {
			local67 = arg8 > arg3 ? arg8 : arg3;
			local78 = local31 > local13 ? local13 : local31;
			while (local78 > local67) {
				if ((this.anIntArrayArray2[arg1 - this.anInt163][local67 - this.anInt162] & 0x80) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local31 == arg8 && (arg0 & 0x1) == 0) {
			local67 = arg1 >= arg7 ? arg1 : arg7;
			local78 = local17 <= local9 ? local17 : local9;
			while (local67 < local78) {
				if ((this.anIntArrayArray2[local67 - this.anInt163][local31 - this.anInt162 - 1] & 0x2) == 0) {
					return true;
				}
				local67++;
			}
		} else if (local13 == arg3 && (arg0 & 0x4) == 0) {
			local67 = arg7 > arg1 ? arg7 : arg1;
			local78 = local17 > local9 ? local9 : local17;
			while (local67 < local78) {
				if ((this.anIntArrayArray2[local67 - this.anInt163][arg3 - this.anInt162] & 0x20) == 0) {
					return true;
				}
				local67++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt163;
		@Pc(13) int local13 = arg1 - this.anInt162;
		this.anIntArrayArray2[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZIZ)V")
	public void method306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt163;
		@Pc(9) int local9 = arg0 - this.anInt162;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method317(local4, local9, 128);
				this.method317(local4 - 1, local9, 8);
			}
			if (arg4 == 1) {
				this.method317(local4, local9, 2);
				this.method317(local4, local9 + 1, 32);
			}
			if (arg4 == 2) {
				this.method317(local4, local9, 8);
				this.method317(local4 + 1, local9, 128);
			}
			if (arg4 == 3) {
				this.method317(local4, local9, 32);
				this.method317(local4, local9 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method317(local4, local9, 1);
				this.method317(local4 - 1, local9 + 1, 16);
			}
			if (arg4 == 1) {
				this.method317(local4, local9, 4);
				this.method317(local4 + 1, local9 + 1, 64);
			}
			if (arg4 == 2) {
				this.method317(local4, local9, 16);
				this.method317(local4 + 1, local9 + -1, 1);
			}
			if (arg4 == 3) {
				this.method317(local4, local9, 64);
				this.method317(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method317(local4, local9, 130);
				this.method317(local4 - 1, local9, 8);
				this.method317(local4, local9 + 1, 32);
			}
			if (arg4 == 1) {
				this.method317(local4, local9, 10);
				this.method317(local4, local9 + 1, 32);
				this.method317(local4 + 1, local9, 128);
			}
			if (arg4 == 2) {
				this.method317(local4, local9, 40);
				this.method317(local4 + 1, local9, 128);
				this.method317(local4, local9 - 1, 2);
			}
			if (arg4 == 3) {
				this.method317(local4, local9, 160);
				this.method317(local4, local9 - 1, 2);
				this.method317(local4 - 1, local9, 8);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method317(local4, local9, 65536);
					this.method317(local4 - 1, local9, 4096);
				}
				if (arg4 == 1) {
					this.method317(local4, local9, 1024);
					this.method317(local4, local9 + 1, 16384);
				}
				if (arg4 == 2) {
					this.method317(local4, local9, 4096);
					this.method317(local4 + 1, local9, 65536);
				}
				if (arg4 == 3) {
					this.method317(local4, local9, 16384);
					this.method317(local4, local9 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method317(local4, local9, 512);
					this.method317(local4 - 1, local9 + 1, 8192);
				}
				if (arg4 == 1) {
					this.method317(local4, local9, 2048);
					this.method317(local4 + 1, local9 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method317(local4, local9, 8192);
					this.method317(local4 + 1, local9 - 1, 512);
				}
				if (arg4 == 3) {
					this.method317(local4, local9, 32768);
					this.method317(local4 - 1, local9 - 1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method317(local4, local9, 66560);
					this.method317(local4 - 1, local9, 4096);
					this.method317(local4, local9 + 1, 16384);
				}
				if (arg4 == 1) {
					this.method317(local4, local9, 5120);
					this.method317(local4, local9 + 1, 16384);
					this.method317(local4 + 1, local9, 65536);
				}
				if (arg4 == 2) {
					this.method317(local4, local9, 20480);
					this.method317(local4 + 1, local9, 65536);
					this.method317(local4, local9 - 1, 1024);
				}
				if (arg4 == 3) {
					this.method317(local4, local9, 81920);
					this.method317(local4, local9 - 1, 1024);
					this.method317(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method317(local4, local9, 536870912);
				this.method317(local4 - 1, local9, 33554432);
			}
			if (arg4 == 1) {
				this.method317(local4, local9, 8388608);
				this.method317(local4, local9 + 1, 134217728);
			}
			if (arg4 == 2) {
				this.method317(local4, local9, 33554432);
				this.method317(local4 + 1, local9, 536870912);
			}
			if (arg4 == 3) {
				this.method317(local4, local9, 134217728);
				this.method317(local4, local9 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method317(local4, local9, 4194304);
				this.method317(local4 - 1, local9 + 1, 67108864);
			}
			if (arg4 == 1) {
				this.method317(local4, local9, 16777216);
				this.method317(local4 + 1, local9 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method317(local4, local9, 67108864);
				this.method317(local4 + 1, local9 - 1, 4194304);
			}
			if (arg4 == 3) {
				this.method317(local4, local9, 268435456);
				this.method317(local4 - 1, local9 - 1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method317(local4, local9, 545259520);
			this.method317(local4 - 1, local9, 33554432);
			this.method317(local4, local9 + 1, 134217728);
		}
		if (arg4 == 1) {
			this.method317(local4, local9, 41943040);
			this.method317(local4, local9 + 1, 134217728);
			this.method317(local4 + 1, local9, 536870912);
		}
		if (arg4 == 2) {
			this.method317(local4, local9, 167772160);
			this.method317(local4 + 1, local9, 536870912);
			this.method317(local4, local9 - 1, 8388608);
		}
		if (arg4 == 3) {
			this.method317(local4, local9, 671088640);
			this.method317(local4, local9 - 1, 8388608);
			this.method317(local4 - 1, local9, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZIBIIIZ)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(15) int local15 = 256;
		if (arg6) {
			local15 = 131328;
		}
		@Pc(26) int local26 = arg2 - this.anInt162;
		@Pc(31) int local31 = arg0 - this.anInt163;
		@Pc(41) int local41;
		if (arg4 == 1 || arg4 == 3) {
			local41 = arg3;
			arg3 = arg5;
			arg5 = local41;
		}
		if (arg1) {
			local15 |= 0x40000000;
		}
		for (local41 = local31; local41 < local31 + arg3; local41++) {
			if (local41 >= 0 && this.anInt165 > local41) {
				for (@Pc(63) int local63 = local26; local63 < arg5 + local26; local63++) {
					if (local63 >= 0 && this.anInt159 > local63) {
						this.method317(local41, local63, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V")
	public void method308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt162;
		@Pc(21) int local21 = arg0 - this.anInt163;
		this.anIntArrayArray2[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(III)V")
	public void method309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt162;
		@Pc(18) int local18 = arg0 - this.anInt163;
		this.anIntArrayArray2[local18][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZIIZI)V")
	public void method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt162;
		@Pc(13) int local13 = arg0 - this.anInt163;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method302(local13, local4, 128);
				this.method302(local13 - 1, local4, 8);
			}
			if (arg1 == 1) {
				this.method302(local13, local4, 2);
				this.method302(local13, local4 + 1, 32);
			}
			if (arg1 == 2) {
				this.method302(local13, local4, 8);
				this.method302(local13 + 1, local4, 128);
			}
			if (arg1 == 3) {
				this.method302(local13, local4, 32);
				this.method302(local13, local4 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method302(local13, local4, 1);
				this.method302(local13 - 1, local4 + 1, 16);
			}
			if (arg1 == 1) {
				this.method302(local13, local4, 4);
				this.method302(local13 + 1, local4 + 1, 64);
			}
			if (arg1 == 2) {
				this.method302(local13, local4, 16);
				this.method302(local13 + 1, local4 + -1, 1);
			}
			if (arg1 == 3) {
				this.method302(local13, local4, 64);
				this.method302(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method302(local13, local4, 130);
				this.method302(local13 - 1, local4, 8);
				this.method302(local13, local4 + 1, 32);
			}
			if (arg1 == 1) {
				this.method302(local13, local4, 10);
				this.method302(local13, local4 + 1, 32);
				this.method302(local13 + 1, local4, 128);
			}
			if (arg1 == 2) {
				this.method302(local13, local4, 40);
				this.method302(local13 + 1, local4, 128);
				this.method302(local13, local4 - 1, 2);
			}
			if (arg1 == 3) {
				this.method302(local13, local4, 160);
				this.method302(local13, local4 - 1, 2);
				this.method302(local13 - 1, local4, 8);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method302(local13, local4, 65536);
					this.method302(local13 - 1, local4, 4096);
				}
				if (arg1 == 1) {
					this.method302(local13, local4, 1024);
					this.method302(local13, local4 + 1, 16384);
				}
				if (arg1 == 2) {
					this.method302(local13, local4, 4096);
					this.method302(local13 + 1, local4, 65536);
				}
				if (arg1 == 3) {
					this.method302(local13, local4, 16384);
					this.method302(local13, local4 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method302(local13, local4, 512);
					this.method302(local13 - 1, local4 + 1, 8192);
				}
				if (arg1 == 1) {
					this.method302(local13, local4, 2048);
					this.method302(local13 + 1, local4 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method302(local13, local4, 8192);
					this.method302(local13 + 1, local4 + -1, 512);
				}
				if (arg1 == 3) {
					this.method302(local13, local4, 32768);
					this.method302(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method302(local13, local4, 66560);
					this.method302(local13 - 1, local4, 4096);
					this.method302(local13, local4 + 1, 16384);
				}
				if (arg1 == 1) {
					this.method302(local13, local4, 5120);
					this.method302(local13, local4 + 1, 16384);
					this.method302(local13 + 1, local4, 65536);
				}
				if (arg1 == 2) {
					this.method302(local13, local4, 20480);
					this.method302(local13 + 1, local4, 65536);
					this.method302(local13, local4 - 1, 1024);
				}
				if (arg1 == 3) {
					this.method302(local13, local4, 81920);
					this.method302(local13, local4 - 1, 1024);
					this.method302(local13 - 1, local4, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method302(local13, local4, 536870912);
				this.method302(local13 - 1, local4, 33554432);
			}
			if (arg1 == 1) {
				this.method302(local13, local4, 8388608);
				this.method302(local13, local4 + 1, 134217728);
			}
			if (arg1 == 2) {
				this.method302(local13, local4, 33554432);
				this.method302(local13 + 1, local4, 536870912);
			}
			if (arg1 == 3) {
				this.method302(local13, local4, 134217728);
				this.method302(local13, local4 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method302(local13, local4, 4194304);
				this.method302(local13 - 1, local4 + 1, 67108864);
			}
			if (arg1 == 1) {
				this.method302(local13, local4, 16777216);
				this.method302(local13 + 1, local4 - -1, 268435456);
			}
			if (arg1 == 2) {
				this.method302(local13, local4, 67108864);
				this.method302(local13 + 1, local4 - 1, 4194304);
			}
			if (arg1 == 3) {
				this.method302(local13, local4, 268435456);
				this.method302(local13 - 1, local4 - 1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method302(local13, local4, 545259520);
			this.method302(local13 - 1, local4, 33554432);
			this.method302(local13, local4 + 1, 134217728);
		}
		if (arg1 == 1) {
			this.method302(local13, local4, 41943040);
			this.method302(local13, local4 + 1, 134217728);
			this.method302(local13 + 1, local4, 536870912);
		}
		if (arg1 == 2) {
			this.method302(local13, local4, 167772160);
			this.method302(local13 + 1, local4, 536870912);
			this.method302(local13, local4 - 1, 8388608);
		}
		if (arg1 == 3) {
			this.method302(local13, local4, 671088640);
			this.method302(local13, local4 - 1, 8388608);
			this.method302(local13 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg4 && arg1 == arg6) {
				return true;
			}
		} else if (arg3 >= arg4 && arg5 + arg4 - 1 >= arg3 && arg6 >= arg6 && arg6 <= arg6 + arg5 - 1) {
			return true;
		}
		@Pc(63) int local63 = arg4 - this.anInt163;
		@Pc(68) int local68 = arg3 - this.anInt163;
		@Pc(73) int local73 = arg1 - this.anInt162;
		@Pc(78) int local78 = arg6 - this.anInt162;
		if (arg5 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local63 == local68 + 1 && local73 == local78 && (this.anIntArrayArray2[local63][local73] & 0x80) == 0) {
						return true;
					}
					if (local63 == local68 && local73 == local78 - 1 && (this.anIntArrayArray2[local63][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 - 1 == local63 && local78 == local73 && (this.anIntArrayArray2[local63][local73] & 0x8) == 0) {
						return true;
					}
					if (local68 == local63 && local78 - 1 == local73 && (this.anIntArrayArray2[local63][local73] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local68 - 1 == local63 && local78 == local73 && (this.anIntArrayArray2[local63][local73] & 0x8) == 0) {
						return true;
					}
					if (local68 == local63 && local78 + 1 == local73 && (this.anIntArrayArray2[local63][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 + 1 == local63 && local78 == local73 && (this.anIntArrayArray2[local63][local73] & 0x80) == 0) {
						return true;
					}
					if (local63 == local68 && local73 == local78 + 1 && (this.anIntArrayArray2[local63][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local63 == local68 && local73 == local78 + 1 && (this.anIntArrayArray2[local63][local73] & 0x20) == 0) {
					return true;
				}
				if (local68 == local63 && local73 == local78 - 1 && (this.anIntArrayArray2[local63][local73] & 0x2) == 0) {
					return true;
				}
				if (local63 == local68 - 1 && local73 == local78 && (this.anIntArrayArray2[local63][local73] & 0x8) == 0) {
					return true;
				}
				if (local63 == local68 + 1 && local73 == local78 && (this.anIntArrayArray2[local63][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = arg5 + local63 - 1;
			@Pc(94) int local94 = local73 + arg5 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local68 + 1 == local63 && local78 >= local73 && local78 <= local94 && (this.anIntArrayArray2[local63][local78] & 0x80) == 0) {
						return true;
					}
					if (local63 <= local68 && local87 >= local68 && local73 == local78 - arg5 && (this.anIntArrayArray2[local68][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local63 == local68 - arg5 && local78 >= local73 && local78 <= local94 && (this.anIntArrayArray2[local87][local78] & 0x8) == 0) {
						return true;
					}
					if (local63 <= local68 && local87 >= local68 && local78 - arg5 == local73 && (this.anIntArrayArray2[local68][local94] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local63 == local68 - arg5 && local78 >= local73 && local78 <= local94 && (this.anIntArrayArray2[local87][local78] & 0x8) == 0) {
						return true;
					}
					if (local68 >= local63 && local87 >= local68 && local73 == local78 + 1 && (this.anIntArrayArray2[local68][local73] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local63 == local68 + 1 && local73 <= local78 && local78 <= local94 && (this.anIntArrayArray2[local63][local78] & 0x80) == 0) {
						return true;
					}
					if (local63 <= local68 && local87 >= local68 && local73 == local78 + 1 && (this.anIntArrayArray2[local68][local73] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local63 <= local68 && local87 >= local68 && local73 == local78 + 1 && (this.anIntArrayArray2[local68][local73] & 0x20) == 0) {
					return true;
				}
				if (local63 <= local68 && local87 >= local68 && local73 == local78 - arg5 && (this.anIntArrayArray2[local68][local94] & 0x2) == 0) {
					return true;
				}
				if (local63 == local68 - arg5 && local73 <= local78 && local78 <= local94 && (this.anIntArrayArray2[local87][local78] & 0x8) == 0) {
					return true;
				}
				if (local63 == local68 + 1 && local78 >= local73 && local78 <= local94 && (this.anIntArrayArray2[local63][local78] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static535.method7289(arg2, arg4, arg3, arg5, arg5, arg7, arg0, arg6) ? true : this.method304(arg1, arg7, arg4, arg6, arg3, arg5, arg5, arg2, arg0);
		}
		@Pc(40) int local40 = arg4 + arg7 - 1;
		@Pc(47) int local47 = arg6 + arg3 - 1;
		if (arg2 >= arg7 && arg2 <= local40 && arg6 <= arg0 && arg0 <= local47) {
			return true;
		} else if (arg2 == arg7 - 1 && arg6 <= arg0 && local47 >= arg0 && (this.anIntArrayArray2[arg2 - this.anInt163][arg0 - this.anInt162] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg2 == local40 + 1 && arg0 >= arg6 && arg0 <= local47 && (this.anIntArrayArray2[arg2 - this.anInt163][arg0 - this.anInt162] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg0 && arg7 <= arg2 && arg2 <= local40 && (this.anIntArrayArray2[arg2 - this.anInt163][arg0 - this.anInt162] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local47 + 1 && arg2 >= arg7 && local40 >= arg2 && (this.anIntArrayArray2[arg2 - this.anInt163][arg0 - this.anInt162] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIZZ)V")
	public void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = 256;
		if (arg5) {
			local10 = 131328;
		}
		@Pc(21) int local21 = arg0 - this.anInt163;
		@Pc(26) int local26 = arg1 - this.anInt162;
		if (arg4) {
			local10 |= 0x40000000;
		}
		for (@Pc(34) int local34 = local21; local34 < arg3 + local21; local34++) {
			if (local34 >= 0 && this.anInt165 > local34) {
				for (@Pc(48) int local48 = local26; local48 < arg2 + local26; local48++) {
					if (local48 >= 0 && local48 < this.anInt159) {
						this.method302(local34, local48, local10);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V")
	public void method314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt163;
		@Pc(19) int local19 = arg0 - this.anInt162;
		this.anIntArrayArray2[local8][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg0 == arg3 && arg1 == arg2) {
				return true;
			}
		} else if (arg0 <= arg3 && arg0 + arg4 - 1 >= arg3 && arg1 >= arg1 && arg1 <= arg4 + arg1 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg0 - this.anInt163;
		@Pc(66) int local66 = arg1 - this.anInt162;
		@Pc(71) int local71 = arg3 - this.anInt163;
		@Pc(76) int local76 = arg2 - this.anInt162;
		if (arg4 == 1) {
			if (arg6 == 0) {
				if (arg5 == 0) {
					if (local71 - 1 == local61 && local66 == local76) {
						return true;
					}
					if (local61 == local71 && local66 + 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local71 == local61 && local66 + 1 == local76) {
						return true;
					}
					if (local61 == local71 - 1 && local66 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local71 + 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 == local71 + 1 && local76 == local66) {
						return true;
					}
					if (local71 == local61 && local76 == local66 + 1 && (this.anIntArrayArray2[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local61 == local71 && local76 == local66 - 1) {
						return true;
					}
					if (local61 == local71 - 1 && local66 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local71 + 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg5 == 0) {
					if (local71 - 1 == local61 && local76 == local66) {
						return true;
					}
					if (local61 == local71 && local76 == local66 + 1) {
						return true;
					}
					if (local71 + 1 == local61 && local66 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 == local71 - 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local76 == local66 + 1) {
						return true;
					}
					if (local61 == local71 + 1 && local76 == local66) {
						return true;
					}
					if (local61 == local71 && local66 - 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 == local71 - 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local61 && local66 + 1 == local76 && (this.anIntArrayArray2[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local61 && local76 == local66) {
						return true;
					}
					if (local71 == local61 && local66 - 1 == local76) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local71 - 1 == local61 && local76 == local66) {
						return true;
					}
					if (local71 == local61 && local76 == local66 + 1 && (this.anIntArrayArray2[local61][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 + 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local61 && local76 == local66 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local71 == local61 && local76 == local66 + 1 && (this.anIntArrayArray2[local61][local76] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local76 == local66 - 1 && (this.anIntArrayArray2[local61][local76] & 0x2) == 0) {
					return true;
				}
				if (local61 == local71 - 1 && local66 == local76 && (this.anIntArrayArray2[local61][local76] & 0x8) == 0) {
					return true;
				}
				if (local61 == local71 + 1 && local76 == local66 && (this.anIntArrayArray2[local61][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(794) int local794 = local61 + arg4 - 1;
			@Pc(800) int local800 = local76 + arg4 - 1;
			if (arg6 == 0) {
				if (arg5 == 0) {
					if (local61 == local71 - arg4 && local66 >= local76 && local66 <= local800) {
						return true;
					}
					if (local71 >= local61 && local794 >= local71 && local76 == local66 + 1 && (this.anIntArrayArray2[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local61 && local71 <= local794 && local66 - arg4 == local76 && (this.anIntArrayArray2[local71][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 <= local71 && local794 >= local71 && local66 + 1 == local76) {
						return true;
					}
					if (local61 == local71 - arg4 && local76 <= local66 && local66 <= local800 && (this.anIntArrayArray2[local794][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local61 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local61 == local71 + 1 && local66 >= local76 && local66 <= local800) {
						return true;
					}
					if (local71 >= local61 && local71 <= local794 && local76 == local66 + 1 && (this.anIntArrayArray2[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local61 && local71 <= local794 && local66 - arg4 == local76 && (this.anIntArrayArray2[local71][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local71 >= local61 && local794 >= local71 && local66 - arg4 == local76) {
						return true;
					}
					if (local71 - arg4 == local61 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local794][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local61 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg5 == 0) {
					if (local61 == local71 - arg4 && local66 >= local76 && local800 >= local66) {
						return true;
					}
					if (local61 <= local71 && local794 >= local71 && local66 + 1 == local76) {
						return true;
					}
					if (local71 + 1 == local61 && local76 <= local66 && local66 <= local800 && (this.anIntArrayArray2[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 >= local61 && local71 <= local794 && local66 - arg4 == local76 && (this.anIntArrayArray2[local71][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local61 == local71 - arg4 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local794][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local61 && local794 >= local71 && local76 == local66 + 1) {
						return true;
					}
					if (local61 == local71 + 1 && local76 <= local66 && local66 <= local800) {
						return true;
					}
					if (local61 <= local71 && local794 >= local71 && local66 - arg4 == local76 && (this.anIntArrayArray2[local71][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local71 - arg4 == local61 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local794][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local61 && local71 <= local794 && local66 + 1 == local76 && (this.anIntArrayArray2[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 + 1 && local76 <= local66 && local800 >= local66) {
						return true;
					}
					if (local71 >= local61 && local794 >= local71 && local66 - arg4 == local76) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local71 - arg4 == local61 && local76 <= local66 && local66 <= local800) {
						return true;
					}
					if (local61 <= local71 && local71 <= local794 && local76 == local66 + 1 && (this.anIntArrayArray2[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local71 + 1 && local76 <= local66 && local800 >= local66 && (this.anIntArrayArray2[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 <= local71 && local71 <= local794 && local76 == local66 - arg4) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local61 <= local71 && local71 <= local794 && local66 + 1 == local76 && (this.anIntArrayArray2[local71][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local71 >= local61 && local71 <= local794 && local76 == local66 - arg4 && (this.anIntArrayArray2[local71][local800] & 0x2C0102) == 0) {
					return true;
				}
				if (local71 - arg4 == local61 && local66 >= local76 && local800 >= local66 && (this.anIntArrayArray2[local794][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 + 1 == local61 && local66 >= local76 && local66 <= local800 && (this.anIntArrayArray2[local61][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIZ)V")
	private void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray2[arg0][arg1] &= ~arg2;
	}
}
