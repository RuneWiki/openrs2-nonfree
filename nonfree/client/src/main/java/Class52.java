import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class52 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private final int anInt1649;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private final int anInt1666;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	private final int anInt1654;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	private final int anInt1660;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1649 = arg1;
		this.anInt1666 = 0;
		this.anInt1654 = 0;
		this.anInt1660 = arg0;
		this.anIntArrayArray22 = new int[this.anInt1660][this.anInt1649];
		this.method1199();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg3 && arg0 == arg5) {
			return true;
		}
		@Pc(20) int local20 = arg5 - this.anInt1654;
		@Pc(25) int local25 = arg1 - this.anInt1666;
		@Pc(30) int local30 = arg3 - this.anInt1666;
		@Pc(35) int local35 = arg0 - this.anInt1654;
		if (arg2 == 0) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray22[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1 && (this.anIntArrayArray22[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray22[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray22[local25][local35] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local30 + 1 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray22[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local35 && (this.anIntArrayArray22[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local30 == local25 && local20 - 1 == local35) {
					return true;
				}
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray22[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray22[local25][local35] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray22[local25][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1 && (this.anIntArrayArray22[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (local25 == local30 - 1 && local35 == local20 && (this.anIntArrayArray22[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local25 == local30 + 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1 && (this.anIntArrayArray22[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (local25 == local30 - 1 && local20 == local35 && (this.anIntArrayArray22[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 + 1 && (this.anIntArrayArray22[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray22[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local20 == local35 && (this.anIntArrayArray22[local25][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local35) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray22[local25][local35] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local35 == local20 - 1 && (this.anIntArrayArray22[local25][local35] & 0x2) == 0) {
				return true;
			}
			if (local25 == local30 - 1 && local20 == local35 && (this.anIntArrayArray22[local25][local35] & 0x8) == 0) {
				return true;
			}
			if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray22[local25][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZBII)V")
	public void method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg1 - this.anInt1666;
		@Pc(13) int local13 = arg0 - this.anInt1654;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1206(local13, local4, 128);
				this.method1206(local13, local4 - 1, 8);
			}
			if (arg4 == 1) {
				this.method1206(local13, local4, 2);
				this.method1206(local13 + 1, local4, 32);
			}
			if (arg4 == 2) {
				this.method1206(local13, local4, 8);
				this.method1206(local13, local4 + 1, 128);
			}
			if (arg4 == 3) {
				this.method1206(local13, local4, 32);
				this.method1206(local13 - 1, local4, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1206(local13, local4, 1);
				this.method1206(local13 + 1, local4 + -1, 16);
			}
			if (arg4 == 1) {
				this.method1206(local13, local4, 4);
				this.method1206(local13 + 1, local4 - -1, 64);
			}
			if (arg4 == 2) {
				this.method1206(local13, local4, 16);
				this.method1206(local13 - 1, local4 + 1, 1);
			}
			if (arg4 == 3) {
				this.method1206(local13, local4, 64);
				this.method1206(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method1206(local13, local4, 130);
				this.method1206(local13, local4 - 1, 8);
				this.method1206(local13 + 1, local4, 32);
			}
			if (arg4 == 1) {
				this.method1206(local13, local4, 10);
				this.method1206(local13 + 1, local4, 32);
				this.method1206(local13, local4 + 1, 128);
			}
			if (arg4 == 2) {
				this.method1206(local13, local4, 40);
				this.method1206(local13, local4 + 1, 128);
				this.method1206(local13 - 1, local4, 2);
			}
			if (arg4 == 3) {
				this.method1206(local13, local4, 160);
				this.method1206(local13 - 1, local4, 2);
				this.method1206(local13, local4 - 1, 8);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1206(local13, local4, 65536);
				this.method1206(local13, local4 - 1, 4096);
			}
			if (arg4 == 1) {
				this.method1206(local13, local4, 1024);
				this.method1206(local13 + 1, local4, 16384);
			}
			if (arg4 == 2) {
				this.method1206(local13, local4, 4096);
				this.method1206(local13, local4 + 1, 65536);
			}
			if (arg4 == 3) {
				this.method1206(local13, local4, 16384);
				this.method1206(local13 - 1, local4, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1206(local13, local4, 512);
				this.method1206(local13 + 1, local4 + -1, 8192);
			}
			if (arg4 == 1) {
				this.method1206(local13, local4, 2048);
				this.method1206(local13 + 1, local4 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method1206(local13, local4, 8192);
				this.method1206(local13 - 1, local4 + 1, 512);
			}
			if (arg4 == 3) {
				this.method1206(local13, local4, 32768);
				this.method1206(local13 - 1, local4 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1206(local13, local4, 66560);
			this.method1206(local13, local4 - 1, 4096);
			this.method1206(local13 + 1, local4, 16384);
		}
		if (arg4 == 1) {
			this.method1206(local13, local4, 5120);
			this.method1206(local13 + 1, local4, 16384);
			this.method1206(local13, local4 + 1, 65536);
		}
		if (arg4 == 2) {
			this.method1206(local13, local4, 20480);
			this.method1206(local13, local4 + 1, 65536);
			this.method1206(local13 - 1, local4, 1024);
		}
		if (arg4 == 3) {
			this.method1206(local13, local4, 81920);
			this.method1206(local13 - 1, local4, 1024);
			this.method1206(local13, local4 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZIIII)V")
	public void method1198(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 256;
		if (arg1) {
			local3 = 131328;
		}
		@Pc(19) int local19;
		if (arg2 == 1 || arg2 == 3) {
			local19 = arg4;
			arg4 = arg0;
			arg0 = local19;
		}
		@Pc(28) int local28 = arg3 - this.anInt1654;
		@Pc(44) int local44 = arg5 - this.anInt1666;
		for (local19 = local44; local19 < arg4 + local44; local19++) {
			if (local19 >= 0 && local19 < this.anInt1660) {
				for (@Pc(59) int local59 = local28; local59 < local28 + arg0; local59++) {
					if (local59 >= 0 && this.anInt1649 > local59) {
						this.method1203(local19, local3, local59);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public void method1199() {
		for (@Pc(19) int local19 = 0; local19 < this.anInt1660; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt1649; local23++) {
				if (local19 == 0 || local23 == 0 || local19 == this.anInt1660 - 1 || local23 == this.anInt1649 - 1) {
					this.anIntArrayArray22[local19][local23] = 16777215;
				} else {
					this.anIntArrayArray22[local19][local23] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)V")
	public void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1666;
		@Pc(22) int local22 = arg1 - this.anInt1654;
		this.anIntArrayArray22[local4][local22] |= 0x200000;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == arg5 && arg2 == arg1) {
			return true;
		}
		@Pc(16) int local16 = arg2 - this.anInt1654;
		@Pc(21) int local21 = arg1 - this.anInt1654;
		@Pc(26) int local26 = arg0 - this.anInt1666;
		@Pc(37) int local37 = arg5 - this.anInt1666;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local26 + 1 == local37 && local21 == local16 && (this.anIntArrayArray22[local37][local21] & 0x80) == 0) {
					return true;
				}
				if (local26 == local37 && local16 - 1 == local21 && (this.anIntArrayArray22[local37][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local37 == local26 - 1 && local21 == local16 && (this.anIntArrayArray22[local37][local21] & 0x8) == 0) {
					return true;
				}
				if (local37 == local26 && local21 == local16 - 1 && (this.anIntArrayArray22[local37][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local26 - 1 == local37 && local21 == local16 && (this.anIntArrayArray22[local37][local21] & 0x8) == 0) {
					return true;
				}
				if (local37 == local26 && local21 == local16 + 1 && (this.anIntArrayArray22[local37][local21] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local37 == local26 + 1 && local21 == local16 && (this.anIntArrayArray22[local37][local21] & 0x80) == 0) {
					return true;
				}
				if (local37 == local26 && local21 == local16 + 1 && (this.anIntArrayArray22[local37][local21] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local26 == local37 && local21 == local16 + 1 && (this.anIntArrayArray22[local37][local21] & 0x20) == 0) {
				return true;
			}
			if (local37 == local26 && local21 == local16 - 1 && (this.anIntArrayArray22[local37][local21] & 0x2) == 0) {
				return true;
			}
			if (local26 - 1 == local37 && local21 == local16 && (this.anIntArrayArray22[local37][local21] & 0x8) == 0) {
				return true;
			}
			if (local26 + 1 == local37 && local16 == local21 && (this.anIntArrayArray22[local37][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIZBII)V")
	public void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt1666;
		@Pc(13) int local13 = arg3 - this.anInt1654;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1203(local4, 128, local13);
				this.method1203(local4 - 1, 8, local13);
			}
			if (arg0 == 1) {
				this.method1203(local4, 2, local13);
				this.method1203(local4, 32, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1203(local4, 8, local13);
				this.method1203(local4 + 1, 128, local13);
			}
			if (arg0 == 3) {
				this.method1203(local4, 32, local13);
				this.method1203(local4, 2, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1203(local4, 1, local13);
				this.method1203(local4 - 1, 16, local13 + 1);
			}
			if (arg0 == 1) {
				this.method1203(local4, 4, local13);
				this.method1203(local4 + 1, 64, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1203(local4, 16, local13);
				this.method1203(local4 + 1, 1, local13 - 1);
			}
			if (arg0 == 3) {
				this.method1203(local4, 64, local13);
				this.method1203(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method1203(local4, 130, local13);
				this.method1203(local4 - 1, 8, local13);
				this.method1203(local4, 32, local13 + 1);
			}
			if (arg0 == 1) {
				this.method1203(local4, 10, local13);
				this.method1203(local4, 32, local13 + 1);
				this.method1203(local4 + 1, 128, local13);
			}
			if (arg0 == 2) {
				this.method1203(local4, 40, local13);
				this.method1203(local4 + 1, 128, local13);
				this.method1203(local4, 2, local13 - 1);
			}
			if (arg0 == 3) {
				this.method1203(local4, 160, local13);
				this.method1203(local4, 2, local13 - 1);
				this.method1203(local4 - 1, 8, local13);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method1203(local4, 65536, local13);
				this.method1203(local4 - 1, 4096, local13);
			}
			if (arg0 == 1) {
				this.method1203(local4, 1024, local13);
				this.method1203(local4, 16384, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1203(local4, 4096, local13);
				this.method1203(local4 + 1, 65536, local13);
			}
			if (arg0 == 3) {
				this.method1203(local4, 16384, local13);
				this.method1203(local4, 1024, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method1203(local4, 512, local13);
				this.method1203(local4 - 1, 8192, local13 + 1);
			}
			if (arg0 == 1) {
				this.method1203(local4, 2048, local13);
				this.method1203(local4 + 1, 32768, local13 + 1);
			}
			if (arg0 == 2) {
				this.method1203(local4, 8192, local13);
				this.method1203(local4 + 1, 512, local13 - 1);
			}
			if (arg0 == 3) {
				this.method1203(local4, 32768, local13);
				this.method1203(local4 - 1, 2048, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1203(local4, 66560, local13);
			this.method1203(local4 - 1, 4096, local13);
			this.method1203(local4, 16384, local13 + 1);
		}
		if (arg0 == 1) {
			this.method1203(local4, 5120, local13);
			this.method1203(local4, 16384, local13 + 1);
			this.method1203(local4 + 1, 65536, local13);
		}
		if (arg0 == 2) {
			this.method1203(local4, 20480, local13);
			this.method1203(local4 + 1, 65536, local13);
			this.method1203(local4, 1024, local13 - 1);
		}
		if (arg0 == 3) {
			this.method1203(local4, 81920, local13);
			this.method1203(local4, 1024, local13 - 1);
			this.method1203(local4 - 1, 4096, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)V")
	private void method1203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg0][arg2] &= 16777215 - arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZII)V")
	public void method1204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg5 - this.anInt1654;
		@Pc(23) int local23 = arg2 - this.anInt1666;
		@Pc(33) int local33;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg1;
			arg1 = arg0;
			arg0 = local33;
		}
		@Pc(39) int local39 = 256;
		if (arg3) {
			local39 = 131328;
		}
		for (local33 = local23; local33 < local23 + arg1; local33++) {
			if (local33 >= 0 && this.anInt1660 > local33) {
				for (@Pc(61) int local61 = local18; local61 < arg0 + local18; local61++) {
					if (local61 >= 0 && local61 < this.anInt1649) {
						this.method1206(local61, local33, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	private void method1206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray22[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public void method1207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1666;
		@Pc(9) int local9 = arg1 - this.anInt1654;
		this.anIntArrayArray22[local4][local9] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method1208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg1 + arg0 - 1;
		@Pc(21) int local21 = arg2 + arg5 - 1;
		if (arg3 >= arg1 && local5 >= arg3 && arg2 <= arg6 && local21 >= arg6) {
			return true;
		} else if (arg1 - 1 == arg3 && arg2 <= arg6 && local21 >= arg6 && (this.anIntArrayArray22[arg3 - this.anInt1666][arg6 - this.anInt1654] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local5 + 1 == arg3 && arg2 <= arg6 && local21 >= arg6 && (this.anIntArrayArray22[arg3 - this.anInt1666][arg6 - this.anInt1654] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg6 && arg3 >= arg1 && arg3 <= local5 && (this.anIntArrayArray22[arg3 - this.anInt1666][arg6 - this.anInt1654] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local21 + 1 && arg1 <= arg3 && arg3 <= local5 && (this.anIntArrayArray22[arg3 - this.anInt1666][arg6 - this.anInt1654] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}
}
