import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class90 {

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt4430;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt4425;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	private int anInt4442;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4434 = arg1;
		this.anInt4430 = 0;
		this.anInt4425 = arg0;
		this.anInt4442 = 0;
		this.anIntArrayArray41 = new int[this.anInt4425][this.anInt4434];
		this.method3523();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIB)Z")
	private boolean method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(12) int local12 = arg7 + arg8;
		@Pc(16) int local16 = arg1 + arg5;
		@Pc(20) int local20 = arg0 + arg6;
		@Pc(25) int local25 = arg2 + arg3;
		@Pc(78) int local78;
		@Pc(170) int local170;
		if (arg8 >= arg6 && local20 > arg8) {
			if (local25 == arg5 && (arg4 & 0x4) == 0) {
				local78 = arg8;
				local170 = local12 > local20 ? local20 : local12;
				while (local170 > local78) {
					if ((this.anIntArrayArray41[local78 - this.anInt4442][local25 - this.anInt4430 - 1] & 0x2) == 0) {
						return true;
					}
					local78++;
				}
			} else if (arg2 == local16 && (arg4 & 0x1) == 0) {
				local78 = arg8;
				local170 = local12 <= local20 ? local12 : local20;
				while (local78 < local170) {
					if ((this.anIntArrayArray41[local78 - this.anInt4442][arg2 - this.anInt4430] & 0x20) == 0) {
						return true;
					}
					local78++;
				}
			}
		} else if (local12 > arg6 && local20 >= local12) {
			if (arg5 == local25 && (arg4 & 0x4) == 0) {
				for (local78 = arg6; local78 < local12; local78++) {
					if ((this.anIntArrayArray41[local78 - this.anInt4442][local25 - this.anInt4430 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (local16 == arg2 && (arg4 & 0x1) == 0) {
				for (local78 = arg6; local78 < local12; local78++) {
					if ((this.anIntArrayArray41[local78 - this.anInt4442][arg2 - this.anInt4430] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg2 >= arg5 && arg2 < local16) {
			if (local12 == arg6 && (arg4 & 0x8) == 0) {
				local78 = arg2;
				local170 = local25 <= local16 ? local25 : local16;
				while (local78 < local170) {
					if ((this.anIntArrayArray41[local12 - this.anInt4442 - 1][local78 - this.anInt4430] & 0x8) == 0) {
						return true;
					}
					local78++;
				}
			} else if (arg8 == local20 && (arg4 & 0x2) == 0) {
				local170 = local16 < local25 ? local16 : local25;
				for (local78 = arg2; local78 < local170; local78++) {
					if ((this.anIntArrayArray41[arg8 - this.anInt4442][local78 - this.anInt4430] & 0x80) == 0) {
						return true;
					}
				}
			}
		} else if (local25 > arg5 && local16 >= local25) {
			if (arg6 == local12 && (arg4 & 0x8) == 0) {
				for (local78 = arg5; local78 < local25; local78++) {
					if ((this.anIntArrayArray41[local12 - this.anInt4442 - 1][local78 - this.anInt4430] & 0x8) == 0) {
						return true;
					}
				}
			} else if (local20 == arg8 && (arg4 & 0x2) == 0) {
				for (local78 = arg5; local78 < local25; local78++) {
					if ((this.anIntArrayArray41[arg8 - this.anInt4442][local78 - this.anInt4430] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZIII)V")
	public void method3509(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt4430;
		@Pc(9) int local9 = arg2 - this.anInt4442;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3521(local9, local4, 128);
				this.method3521(local9 - 1, local4, 8);
			}
			if (arg0 == 1) {
				this.method3521(local9, local4, 2);
				this.method3521(local9, local4 + 1, 32);
			}
			if (arg0 == 2) {
				this.method3521(local9, local4, 8);
				this.method3521(local9 + 1, local4, 128);
			}
			if (arg0 == 3) {
				this.method3521(local9, local4, 32);
				this.method3521(local9, local4 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3521(local9, local4, 1);
				this.method3521(local9 - 1, local4 - -1, 16);
			}
			if (arg0 == 1) {
				this.method3521(local9, local4, 4);
				this.method3521(local9 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method3521(local9, local4, 16);
				this.method3521(local9 + 1, local4 + -1, 1);
			}
			if (arg0 == 3) {
				this.method3521(local9, local4, 64);
				this.method3521(local9 - 1, local4 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method3521(local9, local4, 130);
				this.method3521(local9 - 1, local4, 8);
				this.method3521(local9, local4 + 1, 32);
			}
			if (arg0 == 1) {
				this.method3521(local9, local4, 10);
				this.method3521(local9, local4 + 1, 32);
				this.method3521(local9 + 1, local4, 128);
			}
			if (arg0 == 2) {
				this.method3521(local9, local4, 40);
				this.method3521(local9 + 1, local4, 128);
				this.method3521(local9, local4 - 1, 2);
			}
			if (arg0 == 3) {
				this.method3521(local9, local4, 160);
				this.method3521(local9, local4 - 1, 2);
				this.method3521(local9 - 1, local4, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method3521(local9, local4, 65536);
				this.method3521(local9 - 1, local4, 4096);
			}
			if (arg0 == 1) {
				this.method3521(local9, local4, 1024);
				this.method3521(local9, local4 + 1, 16384);
			}
			if (arg0 == 2) {
				this.method3521(local9, local4, 4096);
				this.method3521(local9 + 1, local4, 65536);
			}
			if (arg0 == 3) {
				this.method3521(local9, local4, 16384);
				this.method3521(local9, local4 - 1, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method3521(local9, local4, 512);
				this.method3521(local9 - 1, local4 + 1, 8192);
			}
			if (arg0 == 1) {
				this.method3521(local9, local4, 2048);
				this.method3521(local9 + 1, local4 + 1, 32768);
			}
			if (arg0 == 2) {
				this.method3521(local9, local4, 8192);
				this.method3521(local9 + 1, local4 + -1, 512);
			}
			if (arg0 == 3) {
				this.method3521(local9, local4, 32768);
				this.method3521(local9 - 1, local4 + -1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3521(local9, local4, 66560);
			this.method3521(local9 - 1, local4, 4096);
			this.method3521(local9, local4 + 1, 16384);
		}
		if (arg0 == 1) {
			this.method3521(local9, local4, 5120);
			this.method3521(local9, local4 + 1, 16384);
			this.method3521(local9 + 1, local4, 65536);
		}
		if (arg0 == 2) {
			this.method3521(local9, local4, 20480);
			this.method3521(local9 + 1, local4, 65536);
			this.method3521(local9, local4 - 1, 1024);
		}
		if (arg0 == 3) {
			this.method3521(local9, local4, 81920);
			this.method3521(local9, local4 - 1, 1024);
			this.method3521(local9 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBIIIIII)Z")
	private boolean method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg1 + arg4 && arg4 < arg2 + arg6) {
			return arg0 + arg3 > arg7 && arg3 < arg5 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZIIZII)V")
	public void method3511(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt4430;
		@Pc(11) int local11 = arg3 - this.anInt4442;
		@Pc(27) int local27;
		if (arg2 == 1 || arg2 == 3) {
			local27 = arg5;
			arg5 = arg0;
			arg0 = local27;
		}
		@Pc(33) int local33 = 256;
		if (arg1) {
			local33 = 131328;
		}
		for (local27 = local11; local27 < local11 + arg5; local27++) {
			if (local27 >= 0 && local27 < this.anInt4425) {
				for (@Pc(57) int local57 = local6; local57 < local6 + arg0; local57++) {
					if (local57 >= 0 && local57 < this.anInt4434) {
						this.method3521(local27, local57, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg0 && arg3 == arg1) {
				return true;
			}
		} else if (arg0 <= arg5 && arg5 <= arg6 + arg0 - 1 && arg1 >= arg1 && arg1 + arg6 - 1 >= arg1) {
			return true;
		}
		@Pc(53) int local53 = arg0 - this.anInt4442;
		@Pc(58) int local58 = arg1 - this.anInt4430;
		@Pc(63) int local63 = arg3 - this.anInt4430;
		@Pc(68) int local68 = arg5 - this.anInt4442;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local53 == local68 - 1 && local58 == local63) {
						return true;
					}
					if (local53 == local68 && local58 + 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local53 == local68 && local63 == local58 - 1 && (this.anIntArrayArray41[local53][local63] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 == local53 && local63 == local58 + 1) {
						return true;
					}
					if (local68 - 1 == local53 && local58 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0108) == 0) {
						return true;
					}
					if (local53 == local68 + 1 && local58 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local68 + 1 == local53 && local63 == local58) {
						return true;
					}
					if (local53 == local68 && local63 == local58 + 1 && (this.anIntArrayArray41[local53][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local53 == local68 && local58 - 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 == local53 && local63 == local58 - 1) {
						return true;
					}
					if (local68 - 1 == local53 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0108) == 0) {
						return true;
					}
					if (local53 == local68 + 1 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local53 == local68 - 1 && local63 == local58) {
						return true;
					}
					if (local53 == local68 && local58 + 1 == local63) {
						return true;
					}
					if (local53 == local68 + 1 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0180) == 0) {
						return true;
					}
					if (local68 == local53 && local58 - 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 - 1 == local53 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0108) == 0) {
						return true;
					}
					if (local68 == local53 && local58 + 1 == local63) {
						return true;
					}
					if (local68 + 1 == local53 && local58 == local63) {
						return true;
					}
					if (local68 == local53 && local58 - 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local53 == local68 - 1 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0108) == 0) {
						return true;
					}
					if (local53 == local68 && local63 == local58 + 1 && (this.anIntArrayArray41[local53][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local53 && local63 == local58) {
						return true;
					}
					if (local53 == local68 && local58 - 1 == local63) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local53 == local68 - 1 && local58 == local63) {
						return true;
					}
					if (local68 == local53 && local58 + 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local53 == local68 + 1 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x12C0180) == 0) {
						return true;
					}
					if (local53 == local68 && local58 - 1 == local63) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local68 == local53 && local58 + 1 == local63 && (this.anIntArrayArray41[local53][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local53 && local63 == local58 - 1 && (this.anIntArrayArray41[local53][local63] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local53 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x8) == 0) {
					return true;
				}
				if (local53 == local68 + 1 && local63 == local58 && (this.anIntArrayArray41[local53][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(79) int local79 = local53 + arg6 - 1;
			@Pc(85) int local85 = arg6 + local63 - 1;
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local53 == local68 - arg6 && local58 >= local63 && local58 <= local85) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local63 == local58 + 1 && (this.anIntArrayArray41[local68][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local63 == local58 - arg6 && (this.anIntArrayArray41[local68][local85] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 >= local53 && local79 >= local68 && local63 == local58 + 1) {
						return true;
					}
					if (local68 - arg6 == local53 && local63 <= local58 && local85 >= local58 && (this.anIntArrayArray41[local79][local58] & 0x12C0108) == 0) {
						return true;
					}
					if (local53 == local68 + 1 && local63 <= local58 && local58 <= local85 && (this.anIntArrayArray41[local53][local58] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local53 == local68 + 1 && local63 <= local58 && local58 <= local85) {
						return true;
					}
					if (local53 <= local68 && local68 <= local79 && local63 == local58 + 1 && (this.anIntArrayArray41[local68][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local58 - arg6 == local63 && (this.anIntArrayArray41[local68][local85] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 >= local53 && local68 <= local79 && local58 - arg6 == local63) {
						return true;
					}
					if (local68 - arg6 == local53 && local58 >= local63 && local85 >= local58 && (this.anIntArrayArray41[local79][local58] & 0x12C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local53 && local63 <= local58 && local58 <= local85 && (this.anIntArrayArray41[local53][local58] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local53 == local68 - arg6 && local63 <= local58 && local85 >= local58) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local63 == local58 + 1) {
						return true;
					}
					if (local53 == local68 + 1 && local58 >= local63 && local85 >= local58 && (this.anIntArrayArray41[local53][local58] & 0x12C0180) == 0) {
						return true;
					}
					if (local68 >= local53 && local79 >= local68 && local63 == local58 - arg6 && (this.anIntArrayArray41[local68][local85] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local53 == local68 - arg6 && local63 <= local58 && local85 >= local58 && (this.anIntArrayArray41[local79][local58] & 0x12C0108) == 0) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local58 + 1 == local63) {
						return true;
					}
					if (local53 == local68 + 1 && local63 <= local58 && local85 >= local58) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local63 == local58 - arg6 && (this.anIntArrayArray41[local68][local85] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local68 - arg6 == local53 && local63 <= local58 && local58 <= local85 && (this.anIntArrayArray41[local79][local58] & 0x12C0108) == 0) {
						return true;
					}
					if (local53 <= local68 && local79 >= local68 && local58 + 1 == local63 && (this.anIntArrayArray41[local68][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local53 && local58 >= local63 && local85 >= local58) {
						return true;
					}
					if (local53 <= local68 && local68 <= local79 && local58 - arg6 == local63) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local53 == local68 - arg6 && local58 >= local63 && local58 <= local85) {
						return true;
					}
					if (local53 <= local68 && local68 <= local79 && local58 + 1 == local63 && (this.anIntArrayArray41[local68][local63] & 0x12C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local53 && local58 >= local63 && local58 <= local85 && (this.anIntArrayArray41[local53][local58] & 0x12C0180) == 0) {
						return true;
					}
					if (local68 >= local53 && local68 <= local79 && local58 - arg6 == local63) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local53 <= local68 && local68 <= local79 && local58 + 1 == local63 && (this.anIntArrayArray41[local68][local63] & 0x12C0120) == 0) {
					return true;
				}
				if (local68 >= local53 && local79 >= local68 && local58 - arg6 == local63 && (this.anIntArrayArray41[local68][local85] & 0x12C0102) == 0) {
					return true;
				}
				if (local53 == local68 - arg6 && local58 >= local63 && local58 <= local85 && (this.anIntArrayArray41[local79][local58] & 0x12C0108) == 0) {
					return true;
				}
				if (local53 == local68 + 1 && local63 <= local58 && local85 >= local58 && (this.anIntArrayArray41[local53][local58] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)V")
	public void method3515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt4442;
		@Pc(13) int local13 = arg1 - this.anInt4430;
		this.anIntArrayArray41[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIZIII)V")
	public void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt4442;
		@Pc(13) int local13 = arg1 - this.anInt4430;
		@Pc(15) int local15 = 256;
		if (arg2) {
			local15 = 131328;
		}
		for (@Pc(23) int local23 = local4; local23 < arg4 + local4; local23++) {
			if (local23 >= 0 && local23 < this.anInt4425) {
				for (@Pc(47) int local47 = local13; local47 < local13 + arg3; local47++) {
					if (local47 >= 0 && this.anInt4434 > local47) {
						this.method3525(local23, local47, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
	public void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt4430;
		@Pc(17) int local17 = arg0 - this.anInt4442;
		this.anIntArrayArray41[local17][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	public void method3518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4442;
		@Pc(9) int local9 = arg0 - this.anInt4430;
		this.anIntArrayArray41[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg2 && arg3 == arg6) {
				return true;
			}
		} else if (arg0 <= arg2 && arg2 <= arg0 + arg1 - 1 && arg3 <= arg3 && arg3 + arg1 - 1 >= arg3) {
			return true;
		}
		@Pc(56) int local56 = arg3 - this.anInt4430;
		@Pc(61) int local61 = arg2 - this.anInt4442;
		@Pc(66) int local66 = arg6 - this.anInt4430;
		@Pc(71) int local71 = arg0 - this.anInt4442;
		if (arg1 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local61 + 1 == local71 && local66 == local56 && (this.anIntArrayArray41[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local71 == local61 && local56 - 1 == local66 && (this.anIntArrayArray41[local71][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local61 - 1 && local56 == local66 && (this.anIntArrayArray41[local71][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 == local71 && local66 == local56 - 1 && (this.anIntArrayArray41[local71][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local61 - 1 && local56 == local66 && (this.anIntArrayArray41[local71][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 == local71 && local56 + 1 == local66 && (this.anIntArrayArray41[local71][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local61 + 1 && local66 == local56 && (this.anIntArrayArray41[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local61 == local71 && local56 + 1 == local66 && (this.anIntArrayArray41[local71][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local71 == local61 && local56 + 1 == local66 && (this.anIntArrayArray41[local71][local66] & 0x20) == 0) {
					return true;
				}
				if (local71 == local61 && local56 - 1 == local66 && (this.anIntArrayArray41[local71][local66] & 0x2) == 0) {
					return true;
				}
				if (local61 - 1 == local71 && local66 == local56 && (this.anIntArrayArray41[local71][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local56 == local66 && (this.anIntArrayArray41[local71][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = local71 + arg1 - 1;
			@Pc(97) int local97 = arg1 + local66 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local71 == local61 + 1 && local66 <= local56 && local56 <= local97 && (this.anIntArrayArray41[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local71 && local91 >= local61 && local56 - arg1 == local66 && (this.anIntArrayArray41[local61][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local61 - arg1 && local56 >= local66 && local97 >= local56 && (this.anIntArrayArray41[local91][local56] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local61 && local61 <= local91 && local56 - arg1 == local66 && (this.anIntArrayArray41[local61][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 - arg1 == local71 && local56 >= local66 && local97 >= local56 && (this.anIntArrayArray41[local91][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 >= local71 && local91 >= local61 && local66 == local56 + 1 && (this.anIntArrayArray41[local61][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local61 + 1 && local56 >= local66 && local56 <= local97 && (this.anIntArrayArray41[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local61 >= local71 && local61 <= local91 && local56 + 1 == local66 && (this.anIntArrayArray41[local61][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local71 <= local61 && local61 <= local91 && local56 + 1 == local66 && (this.anIntArrayArray41[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local71 <= local61 && local61 <= local91 && local56 - arg1 == local66 && (this.anIntArrayArray41[local61][local97] & 0x2) == 0) {
					return true;
				}
				if (local61 - arg1 == local71 && local66 <= local56 && local56 <= local97 && (this.anIntArrayArray41[local91][local56] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local71 && local56 >= local66 && local56 <= local97 && (this.anIntArrayArray41[local71][local56] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)V")
	private void method3521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray41[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
	public void method3523() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4425; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt4434; local8++) {
				if (local5 == 0 || local8 == 0 || this.anInt4425 - 5 <= local5 || local8 >= this.anInt4434 - 5) {
					this.anIntArrayArray41[local5][local8] = 16777215;
				} else {
					this.anIntArrayArray41[local5][local8] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	private void method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray41[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 > 1) {
			return this.method3510(arg0, arg3, arg7, arg2, arg5, arg7, arg4, arg1) ? true : this.method3508(arg3, arg0, arg1, arg7, arg6, arg2, arg5, arg7, arg4);
		}
		@Pc(41) int local41 = arg5 + arg3 - 1;
		@Pc(47) int local47 = arg0 + arg2 - 1;
		if (arg4 >= arg5 && local41 >= arg4 && arg2 <= arg1 && local47 >= arg1) {
			return true;
		} else if (arg5 - 1 == arg4 && arg2 <= arg1 && local47 >= arg1 && (this.anIntArrayArray41[arg4 - this.anInt4442][arg1 - this.anInt4430] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local41 + 1 == arg4 && arg2 <= arg1 && local47 >= arg1 && (this.anIntArrayArray41[arg4 - this.anInt4442][arg1 - this.anInt4430] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg1 && arg5 <= arg4 && arg4 <= local41 && (this.anIntArrayArray41[arg4 - this.anInt4442][arg1 - this.anInt4430] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg1 && arg5 <= arg4 && local41 >= arg4 && (this.anIntArrayArray41[arg4 - this.anInt4442][arg1 - this.anInt4430] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIZBI)V")
	public void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt4442;
		@Pc(13) int local13 = arg0 - this.anInt4430;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method3525(local8, local13, 128);
				this.method3525(local8 - 1, local13, 8);
			}
			if (arg1 == 1) {
				this.method3525(local8, local13, 2);
				this.method3525(local8, local13 + 1, 32);
			}
			if (arg1 == 2) {
				this.method3525(local8, local13, 8);
				this.method3525(local8 + 1, local13, 128);
			}
			if (arg1 == 3) {
				this.method3525(local8, local13, 32);
				this.method3525(local8, local13 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method3525(local8, local13, 1);
				this.method3525(local8 - 1, local13 + 1, 16);
			}
			if (arg1 == 1) {
				this.method3525(local8, local13, 4);
				this.method3525(local8 + 1, local13 - -1, 64);
			}
			if (arg1 == 2) {
				this.method3525(local8, local13, 16);
				this.method3525(local8 + 1, local13 + -1, 1);
			}
			if (arg1 == 3) {
				this.method3525(local8, local13, 64);
				this.method3525(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method3525(local8, local13, 130);
				this.method3525(local8 - 1, local13, 8);
				this.method3525(local8, local13 + 1, 32);
			}
			if (arg1 == 1) {
				this.method3525(local8, local13, 10);
				this.method3525(local8, local13 + 1, 32);
				this.method3525(local8 + 1, local13, 128);
			}
			if (arg1 == 2) {
				this.method3525(local8, local13, 40);
				this.method3525(local8 + 1, local13, 128);
				this.method3525(local8, local13 - 1, 2);
			}
			if (arg1 == 3) {
				this.method3525(local8, local13, 160);
				this.method3525(local8, local13 - 1, 2);
				this.method3525(local8 - 1, local13, 8);
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method3525(local8, local13, 65536);
				this.method3525(local8 - 1, local13, 4096);
			}
			if (arg1 == 1) {
				this.method3525(local8, local13, 1024);
				this.method3525(local8, local13 + 1, 16384);
			}
			if (arg1 == 2) {
				this.method3525(local8, local13, 4096);
				this.method3525(local8 + 1, local13, 65536);
			}
			if (arg1 == 3) {
				this.method3525(local8, local13, 16384);
				this.method3525(local8, local13 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method3525(local8, local13, 512);
				this.method3525(local8 - 1, local13 + 1, 8192);
			}
			if (arg1 == 1) {
				this.method3525(local8, local13, 2048);
				this.method3525(local8 + 1, local13 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method3525(local8, local13, 8192);
				this.method3525(local8 + 1, local13 + -1, 512);
			}
			if (arg1 == 3) {
				this.method3525(local8, local13, 32768);
				this.method3525(local8 - 1, local13 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method3525(local8, local13, 66560);
			this.method3525(local8 - 1, local13, 4096);
			this.method3525(local8, local13 + 1, 16384);
		}
		if (arg1 == 1) {
			this.method3525(local8, local13, 5120);
			this.method3525(local8, local13 + 1, 16384);
			this.method3525(local8 + 1, local13, 65536);
		}
		if (arg1 == 2) {
			this.method3525(local8, local13, 20480);
			this.method3525(local8 + 1, local13, 65536);
			this.method3525(local8, local13 - 1, 1024);
		}
		if (arg1 == 3) {
			this.method3525(local8, local13, 81920);
			this.method3525(local8, local13 - 1, 1024);
			this.method3525(local8 - 1, local13, 4096);
		}
	}
}
