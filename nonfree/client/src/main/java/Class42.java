import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class42 {

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	private int anInt2026 = 0;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	private int anInt2017;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	private int anInt2027;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2017 = arg1;
		this.anInt2027 = arg0;
		this.anIntArrayArray19 = new int[this.anInt2027][this.anInt2017];
		this.anInt2031 = 0;
		this.method1432();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg2 && arg3 == arg0) {
				return true;
			}
		} else if (arg6 <= arg2 && arg2 <= arg6 + arg4 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg4 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg2 - this.anInt2031;
		@Pc(63) int local63 = arg6 - this.anInt2031;
		@Pc(68) int local68 = arg3 - this.anInt2026;
		@Pc(73) int local73 = arg0 - this.anInt2026;
		if (arg4 == 1) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local63 == local58 - 1 && local73 == local68) {
						return true;
					}
					if (local63 == local58 && local73 == local68 + 1 && (this.anIntArrayArray19[local63][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local58 == local63 && local73 == local68 - 1 && (this.anIntArrayArray19[local63][local73] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 == local63 && local68 + 1 == local73) {
						return true;
					}
					if (local58 - 1 == local63 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0108) == 0) {
						return true;
					}
					if (local63 == local58 + 1 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 + 1 == local63 && local73 == local68) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local58 == local63 && local68 - 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 == local58 && local68 - 1 == local73) {
						return true;
					}
					if (local58 - 1 == local63 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0108) == 0) {
						return true;
					}
					if (local63 == local58 + 1 && local73 == local68 && (this.anIntArrayArray19[local63][local73] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local63 == local58 - 1 && local73 == local68) {
						return true;
					}
					if (local63 == local58 && local73 == local68 + 1) {
						return true;
					}
					if (local63 == local58 + 1 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0180) == 0) {
						return true;
					}
					if (local63 == local58 && local68 - 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 - 1 == local63 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0108) == 0) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73) {
						return true;
					}
					if (local63 == local58 + 1 && local73 == local68) {
						return true;
					}
					if (local58 == local63 && local68 - 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 - 1 == local63 && local73 == local68 && (this.anIntArrayArray19[local63][local73] & 0x12C0108) == 0) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local63 == local58 + 1 && local73 == local68) {
						return true;
					}
					if (local63 == local58 && local73 == local68 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 == local58 - 1 && local68 == local73) {
						return true;
					}
					if (local63 == local58 && local68 + 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local63 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x12C0180) == 0) {
						return true;
					}
					if (local58 == local63 && local73 == local68 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local63 == local58 && local73 == local68 + 1 && (this.anIntArrayArray19[local63][local73] & 0x20) == 0) {
					return true;
				}
				if (local63 == local58 && local68 - 1 == local73 && (this.anIntArrayArray19[local63][local73] & 0x2) == 0) {
					return true;
				}
				if (local63 == local58 - 1 && local73 == local68 && (this.anIntArrayArray19[local63][local73] & 0x8) == 0) {
					return true;
				}
				if (local63 == local58 + 1 && local68 == local73 && (this.anIntArrayArray19[local63][local73] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(764) int local764 = local63 + arg4 - 1;
			@Pc(770) int local770 = local73 + arg4 - 1;
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local58 - arg4 == local63 && local73 <= local68 && local770 >= local68) {
						return true;
					}
					if (local63 <= local58 && local58 <= local764 && local68 + 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local63 <= local58 && local764 >= local58 && local73 == local68 - arg4 && (this.anIntArrayArray19[local58][local770] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 >= local63 && local58 <= local764 && local73 == local68 + 1) {
						return true;
					}
					if (local63 == local58 - arg4 && local68 >= local73 && local68 <= local770 && (this.anIntArrayArray19[local764][local68] & 0x12C0108) == 0) {
						return true;
					}
					if (local63 == local58 + 1 && local68 >= local73 && local770 >= local68 && (this.anIntArrayArray19[local63][local68] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 + 1 == local63 && local68 >= local73 && local68 <= local770) {
						return true;
					}
					if (local58 >= local63 && local58 <= local764 && local73 == local68 + 1 && (this.anIntArrayArray19[local58][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local63 <= local58 && local764 >= local58 && local68 - arg4 == local73 && (this.anIntArrayArray19[local58][local770] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local63 <= local58 && local58 <= local764 && local68 - arg4 == local73) {
						return true;
					}
					if (local58 - arg4 == local63 && local68 >= local73 && local770 >= local68 && (this.anIntArrayArray19[local764][local68] & 0x12C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local63 && local73 <= local68 && local770 >= local68 && (this.anIntArrayArray19[local63][local68] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local58 - arg4 == local63 && local73 <= local68 && local770 >= local68) {
						return true;
					}
					if (local58 >= local63 && local764 >= local58 && local73 == local68 + 1) {
						return true;
					}
					if (local58 + 1 == local63 && local68 >= local73 && local770 >= local68 && (this.anIntArrayArray19[local63][local68] & 0x12C0180) == 0) {
						return true;
					}
					if (local58 >= local63 && local764 >= local58 && local73 == local68 - arg4 && (this.anIntArrayArray19[local58][local770] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 - arg4 == local63 && local73 <= local68 && local68 <= local770 && (this.anIntArrayArray19[local764][local68] & 0x12C0108) == 0) {
						return true;
					}
					if (local58 >= local63 && local764 >= local58 && local73 == local68 + 1) {
						return true;
					}
					if (local63 == local58 + 1 && local73 <= local68 && local68 <= local770) {
						return true;
					}
					if (local58 >= local63 && local58 <= local764 && local68 - arg4 == local73 && (this.anIntArrayArray19[local58][local770] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local58 - arg4 == local63 && local68 >= local73 && local68 <= local770 && (this.anIntArrayArray19[local764][local68] & 0x12C0108) == 0) {
						return true;
					}
					if (local58 >= local63 && local764 >= local58 && local73 == local68 + 1 && (this.anIntArrayArray19[local58][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local63 == local58 + 1 && local73 <= local68 && local68 <= local770) {
						return true;
					}
					if (local58 >= local63 && local58 <= local764 && local73 == local68 - arg4) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 - arg4 == local63 && local73 <= local68 && local68 <= local770) {
						return true;
					}
					if (local58 >= local63 && local58 <= local764 && local73 == local68 + 1 && (this.anIntArrayArray19[local58][local73] & 0x12C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local63 && local68 >= local73 && local68 <= local770 && (this.anIntArrayArray19[local63][local68] & 0x12C0180) == 0) {
						return true;
					}
					if (local58 >= local63 && local764 >= local58 && local73 == local68 - arg4) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local58 >= local63 && local764 >= local58 && local68 + 1 == local73 && (this.anIntArrayArray19[local58][local73] & 0x12C0120) == 0) {
					return true;
				}
				if (local58 >= local63 && local58 <= local764 && local68 - arg4 == local73 && (this.anIntArrayArray19[local58][local770] & 0x12C0102) == 0) {
					return true;
				}
				if (local58 - arg4 == local63 && local73 <= local68 && local770 >= local68 && (this.anIntArrayArray19[local764][local68] & 0x12C0108) == 0) {
					return true;
				}
				if (local58 + 1 == local63 && local73 <= local68 && local770 >= local68 && (this.anIntArrayArray19[local63][local68] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIBIIIII)Z")
	private boolean method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg1 + arg5;
		@Pc(19) int local19 = arg2 + arg0;
		@Pc(24) int local24 = arg7 + arg3;
		@Pc(29) int local29 = arg6 + arg4;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg7 <= arg2 && local24 > arg2) {
			if (arg6 == local14 && (arg8 & 0x4) == 0) {
				local75 = local19 <= local24 ? local19 : local24;
				for (local68 = arg2; local68 < local75; local68++) {
					if ((this.anIntArrayArray19[local68 - this.anInt2031][local14 - this.anInt2026 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (local29 == arg1 && (arg8 & 0x1) == 0) {
				local68 = arg2;
				local75 = local24 >= local19 ? local19 : local24;
				while (local68 < local75) {
					if ((this.anIntArrayArray19[local68 - this.anInt2031][arg1 - this.anInt2026] & 0x20) == 0) {
						return true;
					}
					local68++;
				}
			}
		} else if (arg7 < local19 && local19 <= local24) {
			if (local14 == arg6 && (arg8 & 0x4) == 0) {
				for (local68 = arg7; local68 < local19; local68++) {
					if ((this.anIntArrayArray19[local68 - this.anInt2031][local14 - this.anInt2026 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg1 == local29 && (arg8 & 0x1) == 0) {
				for (local68 = arg7; local68 < local19; local68++) {
					if ((this.anIntArrayArray19[local68 - this.anInt2031][arg1 - this.anInt2026] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg6 <= arg1 && local29 > arg1) {
			if (local19 == arg7 && (arg8 & 0x8) == 0) {
				local68 = arg1;
				local75 = local29 < local14 ? local29 : local14;
				while (local68 < local75) {
					if ((this.anIntArrayArray19[local19 - this.anInt2031 - 1][local68 - this.anInt2026] & 0x8) == 0) {
						return true;
					}
					local68++;
				}
			} else if (local24 == arg2 && (arg8 & 0x2) == 0) {
				local68 = arg1;
				local75 = local29 >= local14 ? local14 : local29;
				while (local68 < local75) {
					if ((this.anIntArrayArray19[arg2 - this.anInt2031][local68 - this.anInt2026] & 0x80) == 0) {
						return true;
					}
					local68++;
				}
			}
		} else if (local14 > arg6 && local14 <= local29) {
			if (arg7 == local19 && (arg8 & 0x8) == 0) {
				for (local68 = arg6; local68 < local14; local68++) {
					if ((this.anIntArrayArray19[local19 - this.anInt2031 - 1][local68 - this.anInt2026] & 0x8) == 0) {
						return true;
					}
				}
			} else if (local24 == arg2 && (arg8 & 0x2) == 0) {
				for (local68 = arg6; local68 < local14; local68++) {
					if ((this.anIntArrayArray19[arg2 - this.anInt2031][local68 - this.anInt2026] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIIII)V")
	public void method1431(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17;
		if (arg2 == 1 || arg2 == 3) {
			local17 = arg5;
			arg5 = arg4;
			arg4 = local17;
		}
		@Pc(26) int local26 = arg3 - this.anInt2026;
		@Pc(31) int local31 = arg0 - this.anInt2031;
		@Pc(33) int local33 = 256;
		if (arg1) {
			local33 = 131328;
		}
		for (local17 = local31; local17 < arg5 + local31; local17++) {
			if (local17 >= 0 && local17 < this.anInt2027) {
				for (@Pc(63) int local63 = local26; local63 < arg4 + local26; local63++) {
					if (local63 >= 0 && this.anInt2017 > local63) {
						this.method1440(local17, local63, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method1432() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2027; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2017; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt2027 - 5 || this.anInt2017 - 5 <= local15) {
					this.anIntArrayArray19[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray19[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZII)V")
	public void method1433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 - this.anInt2026;
		@Pc(12) int local12 = 256;
		if (arg2) {
			local12 = 131328;
		}
		@Pc(23) int local23 = arg3 - this.anInt2031;
		for (@Pc(25) int local25 = local23; local25 < local23 + arg0; local25++) {
			if (local25 >= 0 && local25 < this.anInt2027) {
				for (@Pc(38) int local38 = local6; local38 < arg1 + local6; local38++) {
					if (local38 >= 0 && local38 < this.anInt2017) {
						this.method1442(local25, local12, local38);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZZII)V")
	public void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt2026;
		@Pc(14) int local14 = arg4 - this.anInt2031;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1442(local14, 128, local4);
				this.method1442(local14 - 1, 8, local4);
			}
			if (arg3 == 1) {
				this.method1442(local14, 2, local4);
				this.method1442(local14, 32, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1442(local14, 8, local4);
				this.method1442(local14 + 1, 128, local4);
			}
			if (arg3 == 3) {
				this.method1442(local14, 32, local4);
				this.method1442(local14, 2, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1442(local14, 1, local4);
				this.method1442(local14 - 1, 16, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1442(local14, 4, local4);
				this.method1442(local14 + 1, 64, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1442(local14, 16, local4);
				this.method1442(local14 + 1, 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method1442(local14, 64, local4);
				this.method1442(local14 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method1442(local14, 130, local4);
				this.method1442(local14 - 1, 8, local4);
				this.method1442(local14, 32, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1442(local14, 10, local4);
				this.method1442(local14, 32, local4 + 1);
				this.method1442(local14 + 1, 128, local4);
			}
			if (arg3 == 2) {
				this.method1442(local14, 40, local4);
				this.method1442(local14 + 1, 128, local4);
				this.method1442(local14, 2, local4 - 1);
			}
			if (arg3 == 3) {
				this.method1442(local14, 160, local4);
				this.method1442(local14, 2, local4 - 1);
				this.method1442(local14 - 1, 8, local4);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1442(local14, 65536, local4);
				this.method1442(local14 - 1, 4096, local4);
			}
			if (arg3 == 1) {
				this.method1442(local14, 1024, local4);
				this.method1442(local14, 16384, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1442(local14, 4096, local4);
				this.method1442(local14 + 1, 65536, local4);
			}
			if (arg3 == 3) {
				this.method1442(local14, 16384, local4);
				this.method1442(local14, 1024, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1442(local14, 512, local4);
				this.method1442(local14 - 1, 8192, local4 + 1);
			}
			if (arg3 == 1) {
				this.method1442(local14, 2048, local4);
				this.method1442(local14 + 1, 32768, local4 + 1);
			}
			if (arg3 == 2) {
				this.method1442(local14, 8192, local4);
				this.method1442(local14 + 1, 512, local4 - 1);
			}
			if (arg3 == 3) {
				this.method1442(local14, 32768, local4);
				this.method1442(local14 - 1, 2048, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1442(local14, 66560, local4);
			this.method1442(local14 - 1, 4096, local4);
			this.method1442(local14, 16384, local4 + 1);
		}
		if (arg3 == 1) {
			this.method1442(local14, 5120, local4);
			this.method1442(local14, 16384, local4 + 1);
			this.method1442(local14 + 1, 65536, local4);
		}
		if (arg3 == 2) {
			this.method1442(local14, 20480, local4);
			this.method1442(local14 + 1, 65536, local4);
			this.method1442(local14, 1024, local4 - 1);
		}
		if (arg3 == 3) {
			this.method1442(local14, 81920, local4);
			this.method1442(local14, 1024, local4 - 1);
			this.method1442(local14 - 1, 4096, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public void method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2026;
		@Pc(13) int local13 = arg1 - this.anInt2031;
		this.anIntArrayArray19[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg1 == arg6 && arg5 == arg3) {
				return true;
			}
		} else if (arg1 <= arg6 && arg6 <= arg4 + arg1 - 1 && arg3 <= arg3 && arg3 <= arg3 + arg4 - 1) {
			return true;
		}
		@Pc(51) int local51 = arg1 - this.anInt2031;
		@Pc(56) int local56 = arg5 - this.anInt2026;
		@Pc(66) int local66 = arg6 - this.anInt2031;
		@Pc(71) int local71 = arg3 - this.anInt2026;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local66 + 1 == local51 && local56 == local71 && (this.anIntArrayArray19[local51][local56] & 0x80) == 0) {
						return true;
					}
					if (local51 == local66 && local56 == local71 - 1 && (this.anIntArrayArray19[local51][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local66 - 1 == local51 && local56 == local71 && (this.anIntArrayArray19[local51][local56] & 0x8) == 0) {
						return true;
					}
					if (local66 == local51 && local71 - 1 == local56 && (this.anIntArrayArray19[local51][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local51 == local66 - 1 && local71 == local56 && (this.anIntArrayArray19[local51][local56] & 0x8) == 0) {
						return true;
					}
					if (local66 == local51 && local56 == local71 + 1 && (this.anIntArrayArray19[local51][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local66 + 1 == local51 && local71 == local56 && (this.anIntArrayArray19[local51][local56] & 0x80) == 0) {
						return true;
					}
					if (local51 == local66 && local56 == local71 + 1 && (this.anIntArrayArray19[local51][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local66 == local51 && local56 == local71 + 1 && (this.anIntArrayArray19[local51][local56] & 0x20) == 0) {
					return true;
				}
				if (local66 == local51 && local71 - 1 == local56 && (this.anIntArrayArray19[local51][local56] & 0x2) == 0) {
					return true;
				}
				if (local51 == local66 - 1 && local56 == local71 && (this.anIntArrayArray19[local51][local56] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local51 && local56 == local71 && (this.anIntArrayArray19[local51][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(416) int local416 = arg4 + local51 - 1;
			@Pc(422) int local422 = local56 + arg4 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local66 + 1 == local51 && local56 <= local71 && local71 <= local422 && (this.anIntArrayArray19[local51][local71] & 0x80) == 0) {
						return true;
					}
					if (local51 <= local66 && local66 <= local416 && local56 == local71 - arg4 && (this.anIntArrayArray19[local66][local422] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local51 == local66 - arg4 && local71 >= local56 && local422 >= local71 && (this.anIntArrayArray19[local416][local71] & 0x8) == 0) {
						return true;
					}
					if (local51 <= local66 && local416 >= local66 && local71 - arg4 == local56 && (this.anIntArrayArray19[local66][local422] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local51 == local66 - arg4 && local56 <= local71 && local71 <= local422 && (this.anIntArrayArray19[local416][local71] & 0x8) == 0) {
						return true;
					}
					if (local51 <= local66 && local66 <= local416 && local56 == local71 + 1 && (this.anIntArrayArray19[local66][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local51 == local66 + 1 && local71 >= local56 && local422 >= local71 && (this.anIntArrayArray19[local51][local71] & 0x80) == 0) {
						return true;
					}
					if (local51 <= local66 && local66 <= local416 && local56 == local71 + 1 && (this.anIntArrayArray19[local66][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local66 >= local51 && local66 <= local416 && local71 + 1 == local56 && (this.anIntArrayArray19[local66][local56] & 0x20) == 0) {
					return true;
				}
				if (local66 >= local51 && local416 >= local66 && local71 - arg4 == local56 && (this.anIntArrayArray19[local66][local422] & 0x2) == 0) {
					return true;
				}
				if (local66 - arg4 == local51 && local71 >= local56 && local422 >= local71 && (this.anIntArrayArray19[local416][local71] & 0x8) == 0) {
					return true;
				}
				if (local51 == local66 + 1 && local71 >= local56 && local422 >= local71 && (this.anIntArrayArray19[local51][local71] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg0 + arg7 && arg7 < arg2 + arg6) {
			return arg5 + arg3 > arg4 && arg1 + arg4 > arg5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return this.method1438(arg2, arg0, arg0, arg4, arg3, arg1, arg5, arg6) ? true : this.method1430(arg0, arg3, arg5, arg2, arg4, arg0, arg1, arg6, arg7);
		}
		@Pc(39) int local39 = arg1 + arg4 - 1;
		@Pc(45) int local45 = arg6 + arg2 - 1;
		if (arg5 >= arg6 && arg5 <= local45 && arg1 <= arg3 && local39 >= arg3) {
			return true;
		} else if (arg5 == arg6 - 1 && arg3 >= arg1 && arg3 <= local39 && (this.anIntArrayArray19[arg5 - this.anInt2031][arg3 - this.anInt2026] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg5 == local45 + 1 && arg3 >= arg1 && arg3 <= local39 && (this.anIntArrayArray19[arg5 - this.anInt2031][arg3 - this.anInt2026] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg6 <= arg5 && local45 >= arg5 && (this.anIntArrayArray19[arg5 - this.anInt2031][arg3 - this.anInt2026] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return local39 + 1 == arg3 && arg6 <= arg5 && local45 >= arg5 && (this.anIntArrayArray19[arg5 - this.anInt2031][arg3 - this.anInt2026] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)V")
	private void method1440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
	public void method1441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2031;
		@Pc(13) int local13 = arg0 - this.anInt2026;
		this.anIntArrayArray19[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	private void method1442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2031;
		@Pc(17) int local17 = arg1 - this.anInt2026;
		this.anIntArrayArray19[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIIIII)V")
	public void method1444(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt2031;
		@Pc(9) int local9 = arg3 - this.anInt2026;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1440(local4, local9, 128);
				this.method1440(local4 - 1, local9, 8);
			}
			if (arg2 == 1) {
				this.method1440(local4, local9, 2);
				this.method1440(local4, local9 + 1, 32);
			}
			if (arg2 == 2) {
				this.method1440(local4, local9, 8);
				this.method1440(local4 + 1, local9, 128);
			}
			if (arg2 == 3) {
				this.method1440(local4, local9, 32);
				this.method1440(local4, local9 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1440(local4, local9, 1);
				this.method1440(local4 - 1, local9 + 1, 16);
			}
			if (arg2 == 1) {
				this.method1440(local4, local9, 4);
				this.method1440(local4 + 1, local9 + 1, 64);
			}
			if (arg2 == 2) {
				this.method1440(local4, local9, 16);
				this.method1440(local4 + 1, local9 + -1, 1);
			}
			if (arg2 == 3) {
				this.method1440(local4, local9, 64);
				this.method1440(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method1440(local4, local9, 130);
				this.method1440(local4 - 1, local9, 8);
				this.method1440(local4, local9 + 1, 32);
			}
			if (arg2 == 1) {
				this.method1440(local4, local9, 10);
				this.method1440(local4, local9 + 1, 32);
				this.method1440(local4 + 1, local9, 128);
			}
			if (arg2 == 2) {
				this.method1440(local4, local9, 40);
				this.method1440(local4 + 1, local9, 128);
				this.method1440(local4, local9 - 1, 2);
			}
			if (arg2 == 3) {
				this.method1440(local4, local9, 160);
				this.method1440(local4, local9 - 1, 2);
				this.method1440(local4 - 1, local9, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1440(local4, local9, 65536);
				this.method1440(local4 - 1, local9, 4096);
			}
			if (arg2 == 1) {
				this.method1440(local4, local9, 1024);
				this.method1440(local4, local9 + 1, 16384);
			}
			if (arg2 == 2) {
				this.method1440(local4, local9, 4096);
				this.method1440(local4 + 1, local9, 65536);
			}
			if (arg2 == 3) {
				this.method1440(local4, local9, 16384);
				this.method1440(local4, local9 - 1, 1024);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1440(local4, local9, 512);
				this.method1440(local4 - 1, local9 + 1, 8192);
			}
			if (arg2 == 1) {
				this.method1440(local4, local9, 2048);
				this.method1440(local4 + 1, local9 + 1, 32768);
			}
			if (arg2 == 2) {
				this.method1440(local4, local9, 8192);
				this.method1440(local4 + 1, local9 - 1, 512);
			}
			if (arg2 == 3) {
				this.method1440(local4, local9, 32768);
				this.method1440(local4 - 1, local9 - 1, 2048);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1440(local4, local9, 66560);
			this.method1440(local4 - 1, local9, 4096);
			this.method1440(local4, local9 + 1, 16384);
		}
		if (arg2 == 1) {
			this.method1440(local4, local9, 5120);
			this.method1440(local4, local9 + 1, 16384);
			this.method1440(local4 + 1, local9, 65536);
		}
		if (arg2 == 2) {
			this.method1440(local4, local9, 20480);
			this.method1440(local4 + 1, local9, 65536);
			this.method1440(local4, local9 - 1, 1024);
		}
		if (arg2 == 3) {
			this.method1440(local4, local9, 81920);
			this.method1440(local4, local9 - 1, 1024);
			this.method1440(local4 - 1, local9, 4096);
			return;
		}
	}
}
