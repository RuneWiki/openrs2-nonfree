import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	private final int anInt144 = 0;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	private final int anInt161;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	private final int anInt143;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	private final int anInt142;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt161 = arg0;
		this.anInt143 = arg1;
		this.anInt142 = 0;
		this.anIntArrayArray4 = new int[this.anInt161][this.anInt143];
		this.method129();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIIIIIZ)V")
	public void method126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg3 - this.anInt144;
		@Pc(11) int local11 = arg4 - this.anInt142;
		@Pc(27) int local27;
		if (arg1 == 1 || arg1 == 3) {
			local27 = arg0;
			arg0 = arg2;
			arg2 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg5) {
			local33 = 131328;
		}
		for (local27 = local6; local27 < local6 + arg0; local27++) {
			if (local27 >= 0 && this.anInt161 > local27) {
				for (@Pc(55) int local55 = local11; local55 < arg2 + local11; local55++) {
					if (local55 >= 0 && local55 < this.anInt143) {
						this.method142(local33, local55, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
	public void method127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt144;
		@Pc(9) int local9 = arg1 - this.anInt142;
		this.anIntArrayArray4[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public void method129() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt161; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt143; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt161 - 5 <= local15 || this.anInt143 - 5 <= local19) {
					this.anIntArrayArray4[local15][local19] = 16777215;
				} else {
					this.anIntArrayArray4[local15][local19] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIZII)V")
	public void method130(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - this.anInt142;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg3 - this.anInt144;
		if (arg0) {
			local12 = 131328;
		}
		for (@Pc(25) int local25 = local17; local25 < arg2 + local17; local25++) {
			if (local25 >= 0 && this.anInt161 > local25) {
				for (@Pc(47) int local47 = local10; local47 < local10 + arg4; local47++) {
					if (local47 >= 0 && local47 < this.anInt143) {
						this.method132(local25, local12, local47);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBI)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray4[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIII)V")
	public void method134(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt144;
		@Pc(19) int local19 = arg3 - this.anInt142;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method142(128, local19, local4);
				this.method142(8, local19, local4 - 1);
			}
			if (arg2 == 1) {
				this.method142(2, local19, local4);
				this.method142(32, local19 + 1, local4);
			}
			if (arg2 == 2) {
				this.method142(8, local19, local4);
				this.method142(128, local19, local4 + 1);
			}
			if (arg2 == 3) {
				this.method142(32, local19, local4);
				this.method142(2, local19 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method142(1, local19, local4);
				this.method142(16, local19 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method142(4, local19, local4);
				this.method142(64, local19 + 1, local4 + 1);
			}
			if (arg2 == 2) {
				this.method142(16, local19, local4);
				this.method142(1, local19 - 1, local4 - -1);
			}
			if (arg2 == 3) {
				this.method142(64, local19, local4);
				this.method142(4, local19 - 1, local4 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method142(130, local19, local4);
				this.method142(8, local19, local4 - 1);
				this.method142(32, local19 + 1, local4);
			}
			if (arg2 == 1) {
				this.method142(10, local19, local4);
				this.method142(32, local19 + 1, local4);
				this.method142(128, local19, local4 + 1);
			}
			if (arg2 == 2) {
				this.method142(40, local19, local4);
				this.method142(128, local19, local4 + 1);
				this.method142(2, local19 - 1, local4);
			}
			if (arg2 == 3) {
				this.method142(160, local19, local4);
				this.method142(2, local19 - 1, local4);
				this.method142(8, local19, local4 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method142(65536, local19, local4);
				this.method142(4096, local19, local4 - 1);
			}
			if (arg2 == 1) {
				this.method142(1024, local19, local4);
				this.method142(16384, local19 + 1, local4);
			}
			if (arg2 == 2) {
				this.method142(4096, local19, local4);
				this.method142(65536, local19, local4 + 1);
			}
			if (arg2 == 3) {
				this.method142(16384, local19, local4);
				this.method142(1024, local19 - 1, local4);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method142(512, local19, local4);
				this.method142(8192, local19 + 1, local4 + -1);
			}
			if (arg2 == 1) {
				this.method142(2048, local19, local4);
				this.method142(32768, local19 + 1, local4 - -1);
			}
			if (arg2 == 2) {
				this.method142(8192, local19, local4);
				this.method142(512, local19 - 1, local4 - -1);
			}
			if (arg2 == 3) {
				this.method142(32768, local19, local4);
				this.method142(2048, local19 - 1, local4 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method142(66560, local19, local4);
			this.method142(4096, local19, local4 - 1);
			this.method142(16384, local19 + 1, local4);
		}
		if (arg2 == 1) {
			this.method142(5120, local19, local4);
			this.method142(16384, local19 + 1, local4);
			this.method142(65536, local19, local4 + 1);
		}
		if (arg2 == 2) {
			this.method142(20480, local19, local4);
			this.method142(65536, local19, local4 + 1);
			this.method142(1024, local19 - 1, local4);
		}
		if (arg2 == 3) {
			this.method142(81920, local19, local4);
			this.method142(1024, local19 - 1, local4);
			this.method142(4096, local19, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg5 && arg4 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt144;
		@Pc(25) int local25 = arg3 - this.anInt142;
		@Pc(30) int local30 = arg4 - this.anInt142;
		@Pc(35) int local35 = arg1 - this.anInt144;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}
			if (arg0 == 0) {
				if (local35 + 1 == local20 && local25 == local30 && (this.anIntArrayArray4[local20][local25] & 0x80) == 0) {
					return true;
				}
				if (local20 == local35 && local25 == local30 - 1 && (this.anIntArrayArray4[local20][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local20 == local35 - 1 && local30 == local25 && (this.anIntArrayArray4[local20][local25] & 0x8) == 0) {
					return true;
				}
				if (local20 == local35 && local30 - 1 == local25 && (this.anIntArrayArray4[local20][local25] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local35 - 1 == local20 && local30 == local25 && (this.anIntArrayArray4[local20][local25] & 0x8) == 0) {
					return true;
				}
				if (local35 == local20 && local30 + 1 == local25 && (this.anIntArrayArray4[local20][local25] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local35 + 1 == local20 && local30 == local25 && (this.anIntArrayArray4[local20][local25] & 0x80) == 0) {
					return true;
				}
				if (local20 == local35 && local30 + 1 == local25 && (this.anIntArrayArray4[local20][local25] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local20 == local35 && local30 + 1 == local25 && (this.anIntArrayArray4[local20][local25] & 0x20) == 0) {
				return true;
			}
			if (local35 == local20 && local30 - 1 == local25 && (this.anIntArrayArray4[local20][local25] & 0x2) == 0) {
				return true;
			}
			if (local35 - 1 == local20 && local25 == local30 && (this.anIntArrayArray4[local20][local25] & 0x8) == 0) {
				return true;
			}
			if (local20 == local35 + 1 && local25 == local30 && (this.anIntArrayArray4[local20][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	public void method136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt142;
		@Pc(9) int local9 = arg0 - this.anInt144;
		this.anIntArrayArray4[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BII)V")
	public void method137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt142;
		@Pc(17) int local17 = arg0 - this.anInt144;
		this.anIntArrayArray4[local17][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg3 - 1;
		@Pc(15) int local15 = arg0 + arg6 - 1;
		if (arg5 >= arg3 && arg5 <= local9 && arg1 >= arg6 && arg1 <= local15) {
			return true;
		} else if (arg5 == arg3 - 1 && arg1 >= arg6 && local15 >= arg1 && (this.anIntArrayArray4[arg5 - this.anInt144][arg1 - this.anInt142] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local9 + 1 == arg5 && arg1 >= arg6 && arg1 <= local15 && (this.anIntArrayArray4[arg5 - this.anInt144][arg1 - this.anInt142] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg6 - 1 && arg5 >= arg3 && arg5 <= local9 && (this.anIntArrayArray4[arg5 - this.anInt144][arg1 - this.anInt142] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local15 + 1 && arg5 >= arg3 && local9 >= arg5 && (this.anIntArrayArray4[arg5 - this.anInt144][arg1 - this.anInt142] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIZ)V")
	public void method140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg1 - this.anInt142;
		@Pc(13) int local13 = arg2 - this.anInt144;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method132(local13, 128, local8);
				this.method132(local13 - 1, 8, local8);
			}
			if (arg3 == 1) {
				this.method132(local13, 2, local8);
				this.method132(local13, 32, local8 + 1);
			}
			if (arg3 == 2) {
				this.method132(local13, 8, local8);
				this.method132(local13 + 1, 128, local8);
			}
			if (arg3 == 3) {
				this.method132(local13, 32, local8);
				this.method132(local13, 2, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method132(local13, 1, local8);
				this.method132(local13 - 1, 16, local8 + 1);
			}
			if (arg3 == 1) {
				this.method132(local13, 4, local8);
				this.method132(local13 + 1, 64, local8 + 1);
			}
			if (arg3 == 2) {
				this.method132(local13, 16, local8);
				this.method132(local13 + 1, 1, local8 - 1);
			}
			if (arg3 == 3) {
				this.method132(local13, 64, local8);
				this.method132(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method132(local13, 130, local8);
				this.method132(local13 - 1, 8, local8);
				this.method132(local13, 32, local8 + 1);
			}
			if (arg3 == 1) {
				this.method132(local13, 10, local8);
				this.method132(local13, 32, local8 + 1);
				this.method132(local13 + 1, 128, local8);
			}
			if (arg3 == 2) {
				this.method132(local13, 40, local8);
				this.method132(local13 + 1, 128, local8);
				this.method132(local13, 2, local8 - 1);
			}
			if (arg3 == 3) {
				this.method132(local13, 160, local8);
				this.method132(local13, 2, local8 - 1);
				this.method132(local13 - 1, 8, local8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method132(local13, 65536, local8);
				this.method132(local13 - 1, 4096, local8);
			}
			if (arg3 == 1) {
				this.method132(local13, 1024, local8);
				this.method132(local13, 16384, local8 + 1);
			}
			if (arg3 == 2) {
				this.method132(local13, 4096, local8);
				this.method132(local13 + 1, 65536, local8);
			}
			if (arg3 == 3) {
				this.method132(local13, 16384, local8);
				this.method132(local13, 1024, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method132(local13, 512, local8);
				this.method132(local13 - 1, 8192, local8 + 1);
			}
			if (arg3 == 1) {
				this.method132(local13, 2048, local8);
				this.method132(local13 + 1, 32768, local8 + 1);
			}
			if (arg3 == 2) {
				this.method132(local13, 8192, local8);
				this.method132(local13 + 1, 512, local8 - 1);
			}
			if (arg3 == 3) {
				this.method132(local13, 32768, local8);
				this.method132(local13 - 1, 2048, local8 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method132(local13, 66560, local8);
			this.method132(local13 - 1, 4096, local8);
			this.method132(local13, 16384, local8 + 1);
		}
		if (arg3 == 1) {
			this.method132(local13, 5120, local8);
			this.method132(local13, 16384, local8 + 1);
			this.method132(local13 + 1, 65536, local8);
		}
		if (arg3 == 2) {
			this.method132(local13, 20480, local8);
			this.method132(local13 + 1, 65536, local8);
			this.method132(local13, 1024, local8 - 1);
		}
		if (arg3 == 3) {
			this.method132(local13, 81920, local8);
			this.method132(local13, 1024, local8 - 1);
			this.method132(local13 - 1, 4096, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg0 && arg4 == arg5) {
			return true;
		}
		@Pc(25) int local25 = arg4 - this.anInt142;
		@Pc(30) int local30 = arg0 - this.anInt144;
		@Pc(35) int local35 = arg5 - this.anInt142;
		@Pc(40) int local40 = arg1 - this.anInt144;
		if (arg2 == 0) {
			if (arg3 == 0) {
				if (local40 == local30 - 1 && local35 == local25) {
					return true;
				}
				if (local30 == local40 && local35 + 1 == local25 && (this.anIntArrayArray4[local40][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local40 && local25 == local35 - 1 && (this.anIntArrayArray4[local40][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 == local40 && local25 == local35 + 1) {
					return true;
				}
				if (local30 - 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 + 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local40 == local30 + 1 && local35 == local25) {
					return true;
				}
				if (local40 == local30 && local25 == local35 + 1 && (this.anIntArrayArray4[local40][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local40 && local35 - 1 == local25 && (this.anIntArrayArray4[local40][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local30 == local40 && local25 == local35 - 1) {
					return true;
				}
				if (local30 - 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local40 == local30 + 1 && local35 == local25 && (this.anIntArrayArray4[local40][local25] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				if (local30 - 1 == local40 && local25 == local35) {
					return true;
				}
				if (local30 == local40 && local35 + 1 == local25) {
					return true;
				}
				if (local40 == local30 + 1 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local40 == local30 && local35 - 1 == local25 && (this.anIntArrayArray4[local40][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local30 - 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local40 == local30 && local35 + 1 == local25) {
					return true;
				}
				if (local40 == local30 + 1 && local35 == local25) {
					return true;
				}
				if (local40 == local30 && local25 == local35 - 1 && (this.anIntArrayArray4[local40][local25] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local30 - 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0108) == 0) {
					return true;
				}
				if (local40 == local30 && local25 == local35 + 1 && (this.anIntArrayArray4[local40][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local40 == local30 + 1 && local25 == local35) {
					return true;
				}
				if (local40 == local30 && local25 == local35 - 1) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local30 - 1 == local40 && local35 == local25) {
					return true;
				}
				if (local30 == local40 && local35 + 1 == local25 && (this.anIntArrayArray4[local40][local25] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 + 1 == local40 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local40 && local35 - 1 == local25) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local30 == local40 && local25 == local35 + 1 && (this.anIntArrayArray4[local40][local25] & 0x20) == 0) {
				return true;
			}
			if (local30 == local40 && local25 == local35 - 1 && (this.anIntArrayArray4[local40][local25] & 0x2) == 0) {
				return true;
			}
			if (local40 == local30 - 1 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x8) == 0) {
				return true;
			}
			if (local40 == local30 + 1 && local25 == local35 && (this.anIntArrayArray4[local40][local25] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
	private void method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray4[arg2][arg1] &= ~arg0;
	}
}
