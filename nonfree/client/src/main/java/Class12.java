import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class12 {

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	private final int anInt968 = 0;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	private final int anInt972 = 0;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	private final int anInt963;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	private final int anInt976;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt963 = arg1;
		this.anInt976 = arg0;
		this.anIntArrayArray7 = new int[this.anInt976][this.anInt963];
		this.method819();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
	public void method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt968;
		@Pc(17) int local17 = arg0 - this.anInt972;
		this.anIntArrayArray7[local17][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIZIII)Z")
	public boolean method814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == arg1 && arg2 == arg0) {
			return true;
		}
		@Pc(16) int local16 = arg3 - this.anInt972;
		@Pc(26) int local26 = arg2 - this.anInt968;
		@Pc(31) int local31 = arg0 - this.anInt968;
		@Pc(36) int local36 = arg1 - this.anInt972;
		if (arg5 == 0) {
			if (arg4 == 0) {
				if (local16 == local36 - 1 && local26 == local31) {
					return true;
				}
				if (local16 == local36 && local26 == local31 + 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 == local16 && local31 - 1 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local16 == local36 && local31 + 1 == local26) {
					return true;
				}
				if (local36 - 1 == local16 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local36 + 1 == local16 && local26 == local31 && (this.anIntArrayArray7[local16][local26] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local16 == local36 + 1 && local26 == local31) {
					return true;
				}
				if (local16 == local36 && local26 == local31 + 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local16 == local36 && local31 - 1 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local16 == local36 && local31 - 1 == local26) {
					return true;
				}
				if (local36 - 1 == local16 && local26 == local31 && (this.anIntArrayArray7[local16][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local16 == local36 + 1 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				if (local36 - 1 == local16 && local31 == local26) {
					return true;
				}
				if (local36 == local16 && local31 + 1 == local26) {
					return true;
				}
				if (local36 + 1 == local16 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local16 == local36 && local26 == local31 - 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local16 == local36 - 1 && local26 == local31 && (this.anIntArrayArray7[local16][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local36 == local16 && local26 == local31 + 1) {
					return true;
				}
				if (local16 == local36 + 1 && local26 == local31) {
					return true;
				}
				if (local36 == local16 && local26 == local31 - 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local36 - 1 == local16 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0108) == 0) {
					return true;
				}
				if (local36 == local16 && local26 == local31 + 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 + 1 == local16 && local31 == local26) {
					return true;
				}
				if (local16 == local36 && local31 - 1 == local26) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local16 == local36 - 1 && local31 == local26) {
					return true;
				}
				if (local36 == local16 && local26 == local31 + 1 && (this.anIntArrayArray7[local16][local26] & 0x12C0120) == 0) {
					return true;
				}
				if (local36 + 1 == local16 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x12C0180) == 0) {
					return true;
				}
				if (local36 == local16 && local26 == local31 - 1) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local16 == local36 && local26 == local31 + 1 && (this.anIntArrayArray7[local16][local26] & 0x20) == 0) {
				return true;
			}
			if (local16 == local36 && local31 - 1 == local26 && (this.anIntArrayArray7[local16][local26] & 0x2) == 0) {
				return true;
			}
			if (local16 == local36 - 1 && local31 == local26 && (this.anIntArrayArray7[local16][local26] & 0x8) == 0) {
				return true;
			}
			if (local36 + 1 == local16 && local26 == local31 && (this.anIntArrayArray7[local16][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public void method815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt972;
		@Pc(25) int local25 = arg1 - this.anInt968;
		this.anIntArrayArray7[local4][local25] |= 0x40000;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	private void method816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	public void method817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt972;
		@Pc(13) int local13 = arg0 - this.anInt968;
		this.anIntArrayArray7[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBIZIII)V")
	public void method818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = arg5 - this.anInt968;
		@Pc(26) int local26 = 256;
		@Pc(31) int local31 = arg0 - this.anInt972;
		@Pc(41) int local41;
		if (arg1 == 1 || arg1 == 3) {
			local41 = arg3;
			arg3 = arg4;
			arg4 = local41;
		}
		if (arg2) {
			local26 = 131328;
		}
		for (local41 = local31; local41 < arg3 + local31; local41++) {
			if (local41 >= 0 && local41 < this.anInt976) {
				for (@Pc(63) int local63 = local20; local63 < local20 + arg4; local63++) {
					if (local63 >= 0 && this.anInt963 > local63) {
						this.method825(local63, local41, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public void method819() {
		for (@Pc(20) int local20 = 0; local20 < this.anInt976; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt963; local24++) {
				if (local20 == 0 || local24 == 0 || this.anInt976 - 5 <= local20 || this.anInt963 - 5 <= local24) {
					this.anIntArrayArray7[local20][local24] = 16777215;
				} else {
					this.anIntArrayArray7[local20][local24] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == arg5 && arg0 == arg3) {
			return true;
		}
		@Pc(26) int local26 = arg5 - this.anInt972;
		@Pc(31) int local31 = arg2 - this.anInt972;
		@Pc(36) int local36 = arg0 - this.anInt968;
		@Pc(41) int local41 = arg3 - this.anInt968;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}
			if (arg1 == 0) {
				if (local26 == local31 + 1 && local41 == local36 && (this.anIntArrayArray7[local26][local36] & 0x80) == 0) {
					return true;
				}
				if (local26 == local31 && local36 == local41 - 1 && (this.anIntArrayArray7[local26][local36] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local31 - 1 == local26 && local36 == local41 && (this.anIntArrayArray7[local26][local36] & 0x8) == 0) {
					return true;
				}
				if (local31 == local26 && local41 - 1 == local36 && (this.anIntArrayArray7[local26][local36] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local31 - 1 == local26 && local36 == local41 && (this.anIntArrayArray7[local26][local36] & 0x8) == 0) {
					return true;
				}
				if (local31 == local26 && local36 == local41 + 1 && (this.anIntArrayArray7[local26][local36] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local26 == local31 + 1 && local36 == local41 && (this.anIntArrayArray7[local26][local36] & 0x80) == 0) {
					return true;
				}
				if (local31 == local26 && local36 == local41 + 1 && (this.anIntArrayArray7[local26][local36] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local31 == local26 && local41 + 1 == local36 && (this.anIntArrayArray7[local26][local36] & 0x20) == 0) {
				return true;
			}
			if (local31 == local26 && local36 == local41 - 1 && (this.anIntArrayArray7[local26][local36] & 0x2) == 0) {
				return true;
			}
			if (local26 == local31 - 1 && local41 == local36 && (this.anIntArrayArray7[local26][local36] & 0x8) == 0) {
				return true;
			}
			if (local26 == local31 + 1 && local41 == local36 && (this.anIntArrayArray7[local26][local36] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIIII)V")
	public void method821(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt968;
		@Pc(13) int local13 = arg2 - this.anInt972;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method825(local4, local13, 128);
				this.method825(local4, local13 - 1, 8);
			}
			if (arg1 == 1) {
				this.method825(local4, local13, 2);
				this.method825(local4 + 1, local13, 32);
			}
			if (arg1 == 2) {
				this.method825(local4, local13, 8);
				this.method825(local4, local13 + 1, 128);
			}
			if (arg1 == 3) {
				this.method825(local4, local13, 32);
				this.method825(local4 - 1, local13, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method825(local4, local13, 1);
				this.method825(local4 + 1, local13 - 1, 16);
			}
			if (arg1 == 1) {
				this.method825(local4, local13, 4);
				this.method825(local4 + 1, local13 - -1, 64);
			}
			if (arg1 == 2) {
				this.method825(local4, local13, 16);
				this.method825(local4 - 1, local13 + 1, 1);
			}
			if (arg1 == 3) {
				this.method825(local4, local13, 64);
				this.method825(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method825(local4, local13, 130);
				this.method825(local4, local13 - 1, 8);
				this.method825(local4 + 1, local13, 32);
			}
			if (arg1 == 1) {
				this.method825(local4, local13, 10);
				this.method825(local4 + 1, local13, 32);
				this.method825(local4, local13 + 1, 128);
			}
			if (arg1 == 2) {
				this.method825(local4, local13, 40);
				this.method825(local4, local13 + 1, 128);
				this.method825(local4 - 1, local13, 2);
			}
			if (arg1 == 3) {
				this.method825(local4, local13, 160);
				this.method825(local4 - 1, local13, 2);
				this.method825(local4, local13 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method825(local4, local13, 65536);
				this.method825(local4, local13 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method825(local4, local13, 1024);
				this.method825(local4 + 1, local13, 16384);
			}
			if (arg1 == 2) {
				this.method825(local4, local13, 4096);
				this.method825(local4, local13 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method825(local4, local13, 16384);
				this.method825(local4 - 1, local13, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method825(local4, local13, 512);
				this.method825(local4 + 1, local13 + -1, 8192);
			}
			if (arg1 == 1) {
				this.method825(local4, local13, 2048);
				this.method825(local4 + 1, local13 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method825(local4, local13, 8192);
				this.method825(local4 - 1, local13 + 1, 512);
			}
			if (arg1 == 3) {
				this.method825(local4, local13, 32768);
				this.method825(local4 - 1, local13 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method825(local4, local13, 66560);
			this.method825(local4, local13 - 1, 4096);
			this.method825(local4 + 1, local13, 16384);
		}
		if (arg1 == 1) {
			this.method825(local4, local13, 5120);
			this.method825(local4 + 1, local13, 16384);
			this.method825(local4, local13 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method825(local4, local13, 20480);
			this.method825(local4, local13 + 1, 65536);
			this.method825(local4 - 1, local13, 1024);
		}
		if (arg1 == 3) {
			this.method825(local4, local13, 81920);
			this.method825(local4 - 1, local13, 1024);
			this.method825(local4, local13 - 1, 4096);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg6 + arg2 - 1;
		@Pc(16) int local16 = arg5 + arg4 - 1;
		if (arg2 <= arg0 && local5 >= arg0 && arg1 >= arg5 && local16 >= arg1) {
			return true;
		} else if (arg2 - 1 == arg0 && arg5 <= arg1 && arg1 <= local16 && (this.anIntArrayArray7[arg0 - this.anInt972][arg1 - this.anInt968] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg0 == local5 + 1 && arg1 >= arg5 && local16 >= arg1 && (this.anIntArrayArray7[arg0 - this.anInt972][arg1 - this.anInt968] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg5 - 1 && arg2 <= arg0 && arg0 <= local5 && (this.anIntArrayArray7[arg0 - this.anInt972][arg1 - this.anInt968] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local16 + 1 && arg0 >= arg2 && local5 >= arg0 && (this.anIntArrayArray7[arg0 - this.anInt972][arg1 - this.anInt968] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIII)V")
	public void method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg4 - this.anInt968;
		@Pc(13) int local13 = arg3 - this.anInt972;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method816(local8, 128, local13);
				this.method816(local8, 8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method816(local8, 2, local13);
				this.method816(local8 + 1, 32, local13);
			}
			if (arg0 == 2) {
				this.method816(local8, 8, local13);
				this.method816(local8, 128, local13 + 1);
			}
			if (arg0 == 3) {
				this.method816(local8, 32, local13);
				this.method816(local8 - 1, 2, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method816(local8, 1, local13);
				this.method816(local8 + 1, 16, local13 - 1);
			}
			if (arg0 == 1) {
				this.method816(local8, 4, local13);
				this.method816(local8 + 1, 64, local13 + 1);
			}
			if (arg0 == 2) {
				this.method816(local8, 16, local13);
				this.method816(local8 - 1, 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method816(local8, 64, local13);
				this.method816(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method816(local8, 130, local13);
				this.method816(local8, 8, local13 - 1);
				this.method816(local8 + 1, 32, local13);
			}
			if (arg0 == 1) {
				this.method816(local8, 10, local13);
				this.method816(local8 + 1, 32, local13);
				this.method816(local8, 128, local13 + 1);
			}
			if (arg0 == 2) {
				this.method816(local8, 40, local13);
				this.method816(local8, 128, local13 + 1);
				this.method816(local8 - 1, 2, local13);
			}
			if (arg0 == 3) {
				this.method816(local8, 160, local13);
				this.method816(local8 - 1, 2, local13);
				this.method816(local8, 8, local13 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method816(local8, 65536, local13);
				this.method816(local8, 4096, local13 - 1);
			}
			if (arg0 == 1) {
				this.method816(local8, 1024, local13);
				this.method816(local8 + 1, 16384, local13);
			}
			if (arg0 == 2) {
				this.method816(local8, 4096, local13);
				this.method816(local8, 65536, local13 + 1);
			}
			if (arg0 == 3) {
				this.method816(local8, 16384, local13);
				this.method816(local8 - 1, 1024, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method816(local8, 512, local13);
				this.method816(local8 + 1, 8192, local13 - 1);
			}
			if (arg0 == 1) {
				this.method816(local8, 2048, local13);
				this.method816(local8 + 1, 32768, local13 + 1);
			}
			if (arg0 == 2) {
				this.method816(local8, 8192, local13);
				this.method816(local8 - 1, 512, local13 + 1);
			}
			if (arg0 == 3) {
				this.method816(local8, 32768, local13);
				this.method816(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method816(local8, 66560, local13);
			this.method816(local8, 4096, local13 - 1);
			this.method816(local8 + 1, 16384, local13);
		}
		if (arg0 == 1) {
			this.method816(local8, 5120, local13);
			this.method816(local8 + 1, 16384, local13);
			this.method816(local8, 65536, local13 + 1);
		}
		if (arg0 == 2) {
			this.method816(local8, 20480, local13);
			this.method816(local8, 65536, local13 + 1);
			this.method816(local8 - 1, 1024, local13);
		}
		if (arg0 == 3) {
			this.method816(local8, 81920, local13);
			this.method816(local8 - 1, 1024, local13);
			this.method816(local8, 4096, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIII)V")
	public void method824(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 - this.anInt972;
		@Pc(11) int local11 = arg0 - this.anInt968;
		@Pc(17) int local17 = 256;
		if (arg1) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local6; local25 < arg3 + local6; local25++) {
			if (local25 >= 0 && this.anInt976 > local25) {
				for (@Pc(38) int local38 = local11; local38 < arg2 + local11; local38++) {
					if (local38 >= 0 && local38 < this.anInt963) {
						this.method816(local38, local17, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)V")
	private void method825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg1][arg0] &= ~arg2;
	}
}
