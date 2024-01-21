import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class81 {

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private final int anInt3108 = 0;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private final int anInt3112 = 0;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	private final int anInt3094;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	private final int anInt3104;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3094 = arg1;
		this.anInt3104 = arg0;
		this.anIntArrayArray29 = new int[this.anInt3104][this.anInt3094];
		this.method2012();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIII)V")
	public void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt3108;
		@Pc(13) int local13 = arg4 - this.anInt3112;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2007(local8, 128, local13);
				this.method2007(local8 - 1, 8, local13);
			}
			if (arg1 == 1) {
				this.method2007(local8, 2, local13);
				this.method2007(local8, 32, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2007(local8, 8, local13);
				this.method2007(local8 + 1, 128, local13);
			}
			if (arg1 == 3) {
				this.method2007(local8, 32, local13);
				this.method2007(local8, 2, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2007(local8, 1, local13);
				this.method2007(local8 - 1, 16, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2007(local8, 4, local13);
				this.method2007(local8 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2007(local8, 16, local13);
				this.method2007(local8 + 1, 1, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2007(local8, 64, local13);
				this.method2007(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method2007(local8, 130, local13);
				this.method2007(local8 - 1, 8, local13);
				this.method2007(local8, 32, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2007(local8, 10, local13);
				this.method2007(local8, 32, local13 + 1);
				this.method2007(local8 + 1, 128, local13);
			}
			if (arg1 == 2) {
				this.method2007(local8, 40, local13);
				this.method2007(local8 + 1, 128, local13);
				this.method2007(local8, 2, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2007(local8, 160, local13);
				this.method2007(local8, 2, local13 - 1);
				this.method2007(local8 - 1, 8, local13);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2007(local8, 65536, local13);
				this.method2007(local8 - 1, 4096, local13);
			}
			if (arg1 == 1) {
				this.method2007(local8, 1024, local13);
				this.method2007(local8, 16384, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2007(local8, 4096, local13);
				this.method2007(local8 + 1, 65536, local13);
			}
			if (arg1 == 3) {
				this.method2007(local8, 16384, local13);
				this.method2007(local8, 1024, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2007(local8, 512, local13);
				this.method2007(local8 - 1, 8192, local13 + 1);
			}
			if (arg1 == 1) {
				this.method2007(local8, 2048, local13);
				this.method2007(local8 + 1, 32768, local13 + 1);
			}
			if (arg1 == 2) {
				this.method2007(local8, 8192, local13);
				this.method2007(local8 + 1, 512, local13 - 1);
			}
			if (arg1 == 3) {
				this.method2007(local8, 32768, local13);
				this.method2007(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2007(local8, 66560, local13);
			this.method2007(local8 - 1, 4096, local13);
			this.method2007(local8, 16384, local13 + 1);
		}
		if (arg1 == 1) {
			this.method2007(local8, 5120, local13);
			this.method2007(local8, 16384, local13 + 1);
			this.method2007(local8 + 1, 65536, local13);
		}
		if (arg1 == 2) {
			this.method2007(local8, 20480, local13);
			this.method2007(local8 + 1, 65536, local13);
			this.method2007(local8, 1024, local13 - 1);
		}
		if (arg1 == 3) {
			this.method2007(local8, 81920, local13);
			this.method2007(local8, 1024, local13 - 1);
			this.method2007(local8 - 1, 4096, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZIIIII)Z")
	public boolean method2000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == arg4 && arg3 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg3 - this.anInt3112;
		@Pc(25) int local25 = arg4 - this.anInt3108;
		@Pc(30) int local30 = arg2 - this.anInt3108;
		@Pc(35) int local35 = arg5 - this.anInt3112;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray29[local25][local20] & 0x80) == 0) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local20 && (this.anIntArrayArray29[local25][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray29[local25][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local30 && local35 - 1 == local20 && (this.anIntArrayArray29[local25][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local25 == local30 - 1 && local20 == local35 && (this.anIntArrayArray29[local25][local20] & 0x8) == 0) {
					return true;
				}
				if (local25 == local30 && local35 + 1 == local20 && (this.anIntArrayArray29[local25][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray29[local25][local20] & 0x80) == 0) {
					return true;
				}
				if (local30 == local25 && local35 + 1 == local20 && (this.anIntArrayArray29[local25][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local30 == local25 && local20 == local35 + 1 && (this.anIntArrayArray29[local25][local20] & 0x20) == 0) {
				return true;
			}
			if (local25 == local30 && local20 == local35 - 1 && (this.anIntArrayArray29[local25][local20] & 0x2) == 0) {
				return true;
			}
			if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray29[local25][local20] & 0x8) == 0) {
				return true;
			}
			if (local30 + 1 == local25 && local35 == local20 && (this.anIntArrayArray29[local25][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZII)V")
	public void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt3108;
		@Pc(11) int local11 = arg0 - this.anInt3112;
		@Pc(21) int local21;
		if (arg1 == 1 || arg1 == 3) {
			local21 = arg3;
			arg3 = arg2;
			arg2 = local21;
		}
		@Pc(27) int local27 = 256;
		if (arg4) {
			local27 = 131328;
		}
		for (local21 = local6; local21 < arg3 + local6; local21++) {
			if (local21 >= 0 && local21 < this.anInt3104) {
				for (@Pc(49) int local49 = local11; local49 < local11 + arg2; local49++) {
					if (local49 >= 0 && local49 < this.anInt3094) {
						this.method2010(local49, local21, local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)V")
	public void method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3108;
		@Pc(13) int local13 = arg0 - this.anInt3112;
		this.anIntArrayArray29[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
	public void method2003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt3112;
		@Pc(19) int local19 = arg1 - this.anInt3108;
		this.anIntArrayArray29[local19][local14] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIIII)V")
	public void method2004(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg3 - this.anInt3112;
		@Pc(8) int local8 = 256;
		@Pc(13) int local13 = arg1 - this.anInt3108;
		if (arg0) {
			local8 = 131328;
		}
		@Pc(33) int local33;
		if (arg5 == 1 || arg5 == 3) {
			local33 = arg4;
			arg4 = arg2;
			arg2 = local33;
		}
		for (local33 = local13; local33 < arg4 + local13; local33++) {
			if (local33 >= 0 && local33 < this.anInt3104) {
				for (@Pc(54) int local54 = local6; local54 < local6 + arg2; local54++) {
					if (local54 >= 0 && local54 < this.anInt3094) {
						this.method2007(local33, local8, local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZ)V")
	public void method2005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg3 - this.anInt3108;
		@Pc(13) int local13 = arg2 - this.anInt3112;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2010(local13, local4, 128);
				this.method2010(local13, local4 - 1, 8);
			}
			if (arg1 == 1) {
				this.method2010(local13, local4, 2);
				this.method2010(local13 + 1, local4, 32);
			}
			if (arg1 == 2) {
				this.method2010(local13, local4, 8);
				this.method2010(local13, local4 + 1, 128);
			}
			if (arg1 == 3) {
				this.method2010(local13, local4, 32);
				this.method2010(local13 - 1, local4, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2010(local13, local4, 1);
				this.method2010(local13 + 1, local4 + -1, 16);
			}
			if (arg1 == 1) {
				this.method2010(local13, local4, 4);
				this.method2010(local13 + 1, local4 - -1, 64);
			}
			if (arg1 == 2) {
				this.method2010(local13, local4, 16);
				this.method2010(local13 - 1, local4 + 1, 1);
			}
			if (arg1 == 3) {
				this.method2010(local13, local4, 64);
				this.method2010(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method2010(local13, local4, 130);
				this.method2010(local13, local4 - 1, 8);
				this.method2010(local13 + 1, local4, 32);
			}
			if (arg1 == 1) {
				this.method2010(local13, local4, 10);
				this.method2010(local13 + 1, local4, 32);
				this.method2010(local13, local4 + 1, 128);
			}
			if (arg1 == 2) {
				this.method2010(local13, local4, 40);
				this.method2010(local13, local4 + 1, 128);
				this.method2010(local13 - 1, local4, 2);
			}
			if (arg1 == 3) {
				this.method2010(local13, local4, 160);
				this.method2010(local13 - 1, local4, 2);
				this.method2010(local13, local4 - 1, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method2010(local13, local4, 65536);
				this.method2010(local13, local4 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method2010(local13, local4, 1024);
				this.method2010(local13 + 1, local4, 16384);
			}
			if (arg1 == 2) {
				this.method2010(local13, local4, 4096);
				this.method2010(local13, local4 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method2010(local13, local4, 16384);
				this.method2010(local13 - 1, local4, 1024);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method2010(local13, local4, 512);
				this.method2010(local13 + 1, local4 - 1, 8192);
			}
			if (arg1 == 1) {
				this.method2010(local13, local4, 2048);
				this.method2010(local13 + 1, local4 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method2010(local13, local4, 8192);
				this.method2010(local13 - 1, local4 + 1, 512);
			}
			if (arg1 == 3) {
				this.method2010(local13, local4, 32768);
				this.method2010(local13 - 1, local4 - 1, 2048);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2010(local13, local4, 66560);
			this.method2010(local13, local4 - 1, 4096);
			this.method2010(local13 + 1, local4, 16384);
		}
		if (arg1 == 1) {
			this.method2010(local13, local4, 5120);
			this.method2010(local13 + 1, local4, 16384);
			this.method2010(local13, local4 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method2010(local13, local4, 20480);
			this.method2010(local13, local4 + 1, 65536);
			this.method2010(local13 - 1, local4, 1024);
		}
		if (arg1 == 3) {
			this.method2010(local13, local4, 81920);
			this.method2010(local13 - 1, local4, 1024);
			this.method2010(local13, local4 - 1, 4096);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIZI)Z")
	public boolean method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3 + arg4 - 1;
		@Pc(16) int local16 = arg5 + arg0 - 1;
		if (arg1 >= arg5 && local16 >= arg1 && arg6 >= arg3 && local9 >= arg6) {
			return true;
		} else if (arg5 - 1 == arg1 && arg6 >= arg3 && arg6 <= local9 && (this.anIntArrayArray29[arg1 - this.anInt3108][arg6 - this.anInt3112] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local16 + 1 == arg1 && arg3 <= arg6 && arg6 <= local9 && (this.anIntArrayArray29[arg1 - this.anInt3108][arg6 - this.anInt3112] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg6 && arg5 <= arg1 && local16 >= arg1 && (this.anIntArrayArray29[arg1 - this.anInt3108][arg6 - this.anInt3112] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local9 + 1 == arg6 && arg5 <= arg1 && arg1 <= local16 && (this.anIntArrayArray29[arg1 - this.anInt3108][arg6 - this.anInt3112] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIII)V")
	private void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg0][arg2] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method2009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg2 == arg0) {
			return true;
		}
		@Pc(25) int local25 = arg2 - this.anInt3112;
		@Pc(30) int local30 = arg5 - this.anInt3108;
		@Pc(35) int local35 = arg0 - this.anInt3112;
		@Pc(40) int local40 = arg3 - this.anInt3108;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (local40 - 1 == local30 && local35 == local25) {
					return true;
				}
				if (local30 == local40 && local35 == local25 + 1 && (this.anIntArrayArray29[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local40 && local25 - 1 == local35 && (this.anIntArrayArray29[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local40 == local30 && local25 + 1 == local35) {
					return true;
				}
				if (local40 - 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local40 + 1 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local30 == local40 + 1 && local25 == local35) {
					return true;
				}
				if (local30 == local40 && local35 == local25 + 1 && (this.anIntArrayArray29[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local40 && local35 == local25 - 1 && (this.anIntArrayArray29[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local40 == local30 && local35 == local25 - 1) {
					return true;
				}
				if (local40 - 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local40 + 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				if (local30 == local40 - 1 && local25 == local35) {
					return true;
				}
				if (local40 == local30 && local35 == local25 + 1) {
					return true;
				}
				if (local30 == local40 + 1 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local40 == local30 && local35 == local25 - 1 && (this.anIntArrayArray29[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local40 - 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local40 && local35 == local25 + 1) {
					return true;
				}
				if (local30 == local40 + 1 && local35 == local25) {
					return true;
				}
				if (local30 == local40 && local35 == local25 - 1 && (this.anIntArrayArray29[local30][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local40 - 1 == local30 && local25 == local35 && (this.anIntArrayArray29[local30][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local40 == local30 && local25 + 1 == local35 && (this.anIntArrayArray29[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local40 + 1 == local30 && local25 == local35) {
					return true;
				}
				if (local40 == local30 && local35 == local25 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local30 == local40 - 1 && local25 == local35) {
					return true;
				}
				if (local30 == local40 && local25 + 1 == local35 && (this.anIntArrayArray29[local30][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local40 + 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local40 == local30 && local25 - 1 == local35) {
					return true;
				}
			}
		}
		if (arg4 == 9) {
			if (local30 == local40 && local35 == local25 + 1 && (this.anIntArrayArray29[local30][local35] & 0x20) == 0) {
				return true;
			}
			if (local40 == local30 && local25 - 1 == local35 && (this.anIntArrayArray29[local30][local35] & 0x2) == 0) {
				return true;
			}
			if (local40 - 1 == local30 && local35 == local25 && (this.anIntArrayArray29[local30][local35] & 0x8) == 0) {
				return true;
			}
			if (local30 == local40 + 1 && local25 == local35 && (this.anIntArrayArray29[local30][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIII)V")
	private void method2010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray29[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method2012() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3104; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3094; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt3104 - 1 == local3 || this.anInt3094 - 1 == local7) {
					this.anIntArrayArray29[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray29[local3][local7] = 16777216;
				}
			}
		}
	}
}
