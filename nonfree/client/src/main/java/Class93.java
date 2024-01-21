import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class93 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	private final int anInt4254;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	private final int anInt4246;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	private final int anInt4265;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	private final int anInt4262;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4254 = arg1;
		this.anInt4246 = 0;
		this.anInt4265 = 0;
		this.anInt4262 = arg0;
		this.anIntArrayArray33 = new int[this.anInt4262][this.anInt4254];
		this.method3269();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg3 && arg2 == arg4) {
			return true;
		}
		@Pc(35) int local35 = arg1 - this.anInt4246;
		@Pc(40) int local40 = arg4 - this.anInt4265;
		@Pc(45) int local45 = arg2 - this.anInt4265;
		@Pc(50) int local50 = arg3 - this.anInt4246;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (local50 - 1 == local35 && local40 == local45) {
					return true;
				}
				if (local50 == local35 && local45 + 1 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local50 && local45 - 1 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local35 == local50 && local45 + 1 == local40) {
					return true;
				}
				if (local50 - 1 == local35 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local50 + 1 == local35 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local35 == local50 + 1 && local40 == local45) {
					return true;
				}
				if (local35 == local50 && local45 + 1 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local50 && local40 == local45 - 1 && (this.anIntArrayArray33[local35][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local50 == local35 && local40 == local45 - 1) {
					return true;
				}
				if (local35 == local50 - 1 && local45 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local50 + 1 == local35 && local45 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				if (local50 - 1 == local35 && local45 == local40) {
					return true;
				}
				if (local35 == local50 && local45 + 1 == local40) {
					return true;
				}
				if (local35 == local50 + 1 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local35 == local50 && local40 == local45 - 1 && (this.anIntArrayArray33[local35][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local35 == local50 - 1 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local50 == local35 && local40 == local45 + 1) {
					return true;
				}
				if (local50 + 1 == local35 && local45 == local40) {
					return true;
				}
				if (local50 == local35 && local40 == local45 - 1 && (this.anIntArrayArray33[local35][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local35 == local50 - 1 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local35 == local50 && local45 + 1 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local35 == local50 + 1 && local45 == local40) {
					return true;
				}
				if (local50 == local35 && local40 == local45 - 1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local50 - 1 == local35 && local40 == local45) {
					return true;
				}
				if (local50 == local35 && local45 + 1 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local50 + 1 == local35 && local45 == local40 && (this.anIntArrayArray33[local35][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local50 == local35 && local40 == local45 - 1) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local50 == local35 && local40 == local45 + 1 && (this.anIntArrayArray33[local35][local40] & 0x20) == 0) {
				return true;
			}
			if (local50 == local35 && local40 == local45 - 1 && (this.anIntArrayArray33[local35][local40] & 0x2) == 0) {
				return true;
			}
			if (local50 - 1 == local35 && local40 == local45 && (this.anIntArrayArray33[local35][local40] & 0x8) == 0) {
				return true;
			}
			if (local50 + 1 == local35 && local45 == local40 && (this.anIntArrayArray33[local35][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method3261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4265;
		@Pc(13) int local13 = arg0 - this.anInt4246;
		this.anIntArrayArray33[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIZIII)V")
	public void method3262(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 - this.anInt4265;
		@Pc(13) int local13 = arg4 - this.anInt4246;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3263(local8, 128, local13);
				this.method3263(local8, 8, local13 - 1);
			}
			if (arg3 == 1) {
				this.method3263(local8, 2, local13);
				this.method3263(local8 + 1, 32, local13);
			}
			if (arg3 == 2) {
				this.method3263(local8, 8, local13);
				this.method3263(local8, 128, local13 + 1);
			}
			if (arg3 == 3) {
				this.method3263(local8, 32, local13);
				this.method3263(local8 - 1, 2, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3263(local8, 1, local13);
				this.method3263(local8 + 1, 16, local13 - 1);
			}
			if (arg3 == 1) {
				this.method3263(local8, 4, local13);
				this.method3263(local8 + 1, 64, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3263(local8, 16, local13);
				this.method3263(local8 - 1, 1, local13 + 1);
			}
			if (arg3 == 3) {
				this.method3263(local8, 64, local13);
				this.method3263(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method3263(local8, 130, local13);
				this.method3263(local8, 8, local13 - 1);
				this.method3263(local8 + 1, 32, local13);
			}
			if (arg3 == 1) {
				this.method3263(local8, 10, local13);
				this.method3263(local8 + 1, 32, local13);
				this.method3263(local8, 128, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3263(local8, 40, local13);
				this.method3263(local8, 128, local13 + 1);
				this.method3263(local8 - 1, 2, local13);
			}
			if (arg3 == 3) {
				this.method3263(local8, 160, local13);
				this.method3263(local8 - 1, 2, local13);
				this.method3263(local8, 8, local13 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3263(local8, 65536, local13);
				this.method3263(local8, 4096, local13 - 1);
			}
			if (arg3 == 1) {
				this.method3263(local8, 1024, local13);
				this.method3263(local8 + 1, 16384, local13);
			}
			if (arg3 == 2) {
				this.method3263(local8, 4096, local13);
				this.method3263(local8, 65536, local13 + 1);
			}
			if (arg3 == 3) {
				this.method3263(local8, 16384, local13);
				this.method3263(local8 - 1, 1024, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3263(local8, 512, local13);
				this.method3263(local8 + 1, 8192, local13 - 1);
			}
			if (arg3 == 1) {
				this.method3263(local8, 2048, local13);
				this.method3263(local8 + 1, 32768, local13 + 1);
			}
			if (arg3 == 2) {
				this.method3263(local8, 8192, local13);
				this.method3263(local8 - 1, 512, local13 + 1);
			}
			if (arg3 == 3) {
				this.method3263(local8, 32768, local13);
				this.method3263(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method3263(local8, 66560, local13);
			this.method3263(local8, 4096, local13 - 1);
			this.method3263(local8 + 1, 16384, local13);
		}
		if (arg3 == 1) {
			this.method3263(local8, 5120, local13);
			this.method3263(local8 + 1, 16384, local13);
			this.method3263(local8, 65536, local13 + 1);
		}
		if (arg3 == 2) {
			this.method3263(local8, 20480, local13);
			this.method3263(local8, 65536, local13 + 1);
			this.method3263(local8 - 1, 1024, local13);
		}
		if (arg3 == 3) {
			this.method3263(local8, 81920, local13);
			this.method3263(local8 - 1, 1024, local13);
			this.method3263(local8, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)V")
	private void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray33[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method3264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg0 && arg2 == arg1) {
			return true;
		}
		@Pc(20) int local20 = arg2 - this.anInt4265;
		@Pc(25) int local25 = arg3 - this.anInt4246;
		@Pc(30) int local30 = arg1 - this.anInt4265;
		@Pc(35) int local35 = arg0 - this.anInt4246;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local25 + 1 == local35 && local30 == local20 && (this.anIntArrayArray33[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local25 == local35 && local30 - 1 == local20 && (this.anIntArrayArray33[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local25 - 1 == local35 && local30 == local20 && (this.anIntArrayArray33[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local35 == local25 && local30 - 1 == local20 && (this.anIntArrayArray33[local35][local20] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local25 - 1 == local35 && local20 == local30 && (this.anIntArrayArray33[local35][local20] & 0x8) == 0) {
					return true;
				}
				if (local35 == local25 && local20 == local30 + 1 && (this.anIntArrayArray33[local35][local20] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local25 + 1 == local35 && local20 == local30 && (this.anIntArrayArray33[local35][local20] & 0x80) == 0) {
					return true;
				}
				if (local25 == local35 && local20 == local30 + 1 && (this.anIntArrayArray33[local35][local20] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local25 == local35 && local30 + 1 == local20 && (this.anIntArrayArray33[local35][local20] & 0x20) == 0) {
				return true;
			}
			if (local35 == local25 && local30 - 1 == local20 && (this.anIntArrayArray33[local35][local20] & 0x2) == 0) {
				return true;
			}
			if (local35 == local25 - 1 && local20 == local30 && (this.anIntArrayArray33[local35][local20] & 0x8) == 0) {
				return true;
			}
			if (local25 + 1 == local35 && local30 == local20 && (this.anIntArrayArray33[local35][local20] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIBI)V")
	public void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt4246;
		@Pc(9) int local9 = arg3 - this.anInt4265;
		@Pc(24) int local24 = 256;
		if (arg2) {
			local24 = 131328;
		}
		for (@Pc(36) int local36 = local4; local36 < arg1 + local4; local36++) {
			if (local36 >= 0 && this.anInt4262 > local36) {
				for (@Pc(45) int local45 = local9; local45 < local9 + arg0; local45++) {
					if (local45 >= 0 && local45 < this.anInt4254) {
						this.method3263(local45, local24, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)V")
	private void method3267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray33[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIIBI)V")
	public void method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt4246;
		@Pc(21) int local21 = arg0 - this.anInt4265;
		@Pc(23) int local23 = 256;
		if (arg2) {
			local23 = 131328;
		}
		@Pc(39) int local39;
		if (arg3 == 1 || arg3 == 3) {
			local39 = arg1;
			arg1 = arg4;
			arg4 = local39;
		}
		for (local39 = local6; local39 < arg1 + local6; local39++) {
			if (local39 >= 0 && local39 < this.anInt4262) {
				for (@Pc(59) int local59 = local21; local59 < local21 + arg4; local59++) {
					if (local59 >= 0 && local59 < this.anInt4254) {
						this.method3267(local39, local59, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method3269() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt4262; local10++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt4254; local13++) {
				if (local10 == 0 || local13 == 0 || local10 >= this.anInt4262 - 5 || this.anInt4254 - 5 <= local13) {
					this.anIntArrayArray33[local10][local13] = 16777215;
				} else {
					this.anIntArrayArray33[local10][local13] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIIZ)V")
	public void method3272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg1 - this.anInt4265;
		@Pc(13) int local13 = arg0 - this.anInt4246;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3267(local13, local4, 128);
				this.method3267(local13 - 1, local4, 8);
			}
			if (arg3 == 1) {
				this.method3267(local13, local4, 2);
				this.method3267(local13, local4 + 1, 32);
			}
			if (arg3 == 2) {
				this.method3267(local13, local4, 8);
				this.method3267(local13 + 1, local4, 128);
			}
			if (arg3 == 3) {
				this.method3267(local13, local4, 32);
				this.method3267(local13, local4 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3267(local13, local4, 1);
				this.method3267(local13 - 1, local4 + 1, 16);
			}
			if (arg3 == 1) {
				this.method3267(local13, local4, 4);
				this.method3267(local13 + 1, local4 + 1, 64);
			}
			if (arg3 == 2) {
				this.method3267(local13, local4, 16);
				this.method3267(local13 + 1, local4 - 1, 1);
			}
			if (arg3 == 3) {
				this.method3267(local13, local4, 64);
				this.method3267(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method3267(local13, local4, 130);
				this.method3267(local13 - 1, local4, 8);
				this.method3267(local13, local4 + 1, 32);
			}
			if (arg3 == 1) {
				this.method3267(local13, local4, 10);
				this.method3267(local13, local4 + 1, 32);
				this.method3267(local13 + 1, local4, 128);
			}
			if (arg3 == 2) {
				this.method3267(local13, local4, 40);
				this.method3267(local13 + 1, local4, 128);
				this.method3267(local13, local4 - 1, 2);
			}
			if (arg3 == 3) {
				this.method3267(local13, local4, 160);
				this.method3267(local13, local4 - 1, 2);
				this.method3267(local13 - 1, local4, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method3267(local13, local4, 65536);
				this.method3267(local13 - 1, local4, 4096);
			}
			if (arg3 == 1) {
				this.method3267(local13, local4, 1024);
				this.method3267(local13, local4 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method3267(local13, local4, 4096);
				this.method3267(local13 + 1, local4, 65536);
			}
			if (arg3 == 3) {
				this.method3267(local13, local4, 16384);
				this.method3267(local13, local4 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method3267(local13, local4, 512);
				this.method3267(local13 - 1, local4 - -1, 8192);
			}
			if (arg3 == 1) {
				this.method3267(local13, local4, 2048);
				this.method3267(local13 + 1, local4 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method3267(local13, local4, 8192);
				this.method3267(local13 + 1, local4 + -1, 512);
			}
			if (arg3 == 3) {
				this.method3267(local13, local4, 32768);
				this.method3267(local13 - 1, local4 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method3267(local13, local4, 66560);
			this.method3267(local13 - 1, local4, 4096);
			this.method3267(local13, local4 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method3267(local13, local4, 5120);
			this.method3267(local13, local4 + 1, 16384);
			this.method3267(local13 + 1, local4, 65536);
		}
		if (arg3 == 2) {
			this.method3267(local13, local4, 20480);
			this.method3267(local13 + 1, local4, 65536);
			this.method3267(local13, local4 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method3267(local13, local4, 81920);
			this.method3267(local13, local4 - 1, 1024);
			this.method3267(local13 - 1, local4, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V")
	public void method3273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4246;
		@Pc(18) int local18 = arg0 - this.anInt4265;
		this.anIntArrayArray33[local4][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg5 + arg0 - 1;
		@Pc(24) int local24 = arg1 + arg6 - 1;
		if (arg6 <= arg2 && local24 >= arg2 && arg5 <= arg4 && arg4 <= local18) {
			return true;
		} else if (arg2 == arg6 - 1 && arg5 <= arg4 && local18 >= arg4 && (this.anIntArrayArray33[arg2 - this.anInt4246][arg4 - this.anInt4265] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local24 + 1 == arg2 && arg4 >= arg5 && arg4 <= local18 && (this.anIntArrayArray33[arg2 - this.anInt4246][arg4 - this.anInt4265] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg5 - 1 && arg2 >= arg6 && arg2 <= local24 && (this.anIntArrayArray33[arg2 - this.anInt4246][arg4 - this.anInt4265] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local18 + 1 == arg4 && arg6 <= arg2 && local24 >= arg2 && (this.anIntArrayArray33[arg2 - this.anInt4246][arg4 - this.anInt4265] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4265;
		@Pc(9) int local9 = arg0 - this.anInt4246;
		this.anIntArrayArray33[local9][local4] |= 0x200000;
	}
}
