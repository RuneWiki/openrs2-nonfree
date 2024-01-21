import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class49 {

	@OriginalMember(owner = "client!me", name = "v", descriptor = "I")
	private final int anInt1952 = 0;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	private final int anInt1957;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	private final int anInt1954;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	private final int anInt1943;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1957 = arg1;
		this.anInt1954 = arg0;
		this.anIntArrayArray24 = new int[this.anInt1954][this.anInt1957];
		this.anInt1943 = 0;
		this.method1169();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method1169() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1954; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1957; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt1954 - 1 == local11 || this.anInt1957 - 1 == local15) {
					this.anIntArrayArray24[local11][local15] = 16777215;
				} else {
					this.anIntArrayArray24[local11][local15] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZI)V")
	private void method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray24[arg2][arg1] &= 16777215 - arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBIIZI)V")
	public void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt1943;
		@Pc(28) int local28;
		if (arg5 == 1 || arg5 == 3) {
			local28 = arg3;
			arg3 = arg0;
			arg0 = local28;
		}
		@Pc(37) int local37 = arg1 - this.anInt1952;
		for (local28 = local18; local28 < arg3 + local18; local28++) {
			if (local28 >= 0 && this.anInt1954 > local28) {
				for (@Pc(60) int local60 = local37; local60 < arg0 + local37; local60++) {
					if (local60 >= 0 && local60 < this.anInt1957) {
						this.method1170(local7, local60, local28);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	private void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray24[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZBIIIII)V")
	public void method1173(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt1952;
		@Pc(18) int local18;
		if (arg1 == 1 || arg1 == 3) {
			local18 = arg3;
			arg3 = arg2;
			arg2 = local18;
		}
		@Pc(24) int local24 = 256;
		if (arg0) {
			local24 = 131328;
		}
		@Pc(35) int local35 = arg5 - this.anInt1943;
		for (local18 = local35; local18 < local35 + arg3; local18++) {
			if (local18 >= 0 && local18 < this.anInt1954) {
				for (@Pc(56) int local56 = local6; local56 < local6 + arg2; local56++) {
					if (local56 >= 0 && this.anInt1957 > local56) {
						this.method1172(local24, local18, local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == arg1 && arg4 == arg3) {
			return true;
		}
		@Pc(16) int local16 = arg3 - this.anInt1952;
		@Pc(21) int local21 = arg4 - this.anInt1952;
		@Pc(26) int local26 = arg1 - this.anInt1943;
		@Pc(42) int local42 = arg2 - this.anInt1943;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local26 == local42 + 1 && local21 == local16 && (this.anIntArrayArray24[local26][local21] & 0x80) == 0) {
					return true;
				}
				if (local42 == local26 && local16 - 1 == local21 && (this.anIntArrayArray24[local26][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local26 == local42 - 1 && local16 == local21 && (this.anIntArrayArray24[local26][local21] & 0x8) == 0) {
					return true;
				}
				if (local26 == local42 && local16 - 1 == local21 && (this.anIntArrayArray24[local26][local21] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local26 == local42 - 1 && local21 == local16 && (this.anIntArrayArray24[local26][local21] & 0x8) == 0) {
					return true;
				}
				if (local42 == local26 && local16 + 1 == local21 && (this.anIntArrayArray24[local26][local21] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local42 + 1 == local26 && local16 == local21 && (this.anIntArrayArray24[local26][local21] & 0x80) == 0) {
					return true;
				}
				if (local42 == local26 && local16 + 1 == local21 && (this.anIntArrayArray24[local26][local21] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 8) {
			if (local26 == local42 && local16 + 1 == local21 && (this.anIntArrayArray24[local26][local21] & 0x20) == 0) {
				return true;
			}
			if (local42 == local26 && local21 == local16 - 1 && (this.anIntArrayArray24[local26][local21] & 0x2) == 0) {
				return true;
			}
			if (local26 == local42 - 1 && local21 == local16 && (this.anIntArrayArray24[local26][local21] & 0x8) == 0) {
				return true;
			}
			if (local26 == local42 + 1 && local21 == local16 && (this.anIntArrayArray24[local26][local21] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public void method1175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1943;
		@Pc(13) int local13 = arg1 - this.anInt1952;
		this.anIntArrayArray24[local4][local13] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg1 - 1;
		@Pc(15) int local15 = arg5 + arg3 - 1;
		if (arg1 <= arg2 && arg2 <= local9 && arg6 >= arg3 && local15 >= arg6) {
			return true;
		} else if (arg2 == arg1 - 1 && arg3 <= arg6 && arg6 <= local15 && (this.anIntArrayArray24[arg2 - this.anInt1943][arg6 - this.anInt1952] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (arg2 == local9 + 1 && arg3 <= arg6 && arg6 <= local15 && (this.anIntArrayArray24[arg2 - this.anInt1943][arg6 - this.anInt1952] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg6 && arg2 >= arg1 && arg2 <= local9 && (this.anIntArrayArray24[arg2 - this.anInt1943][arg6 - this.anInt1952] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local15 + 1 == arg6 && arg2 >= arg1 && arg2 <= local9 && (this.anIntArrayArray24[arg2 - this.anInt1943][arg6 - this.anInt1952] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZII)V")
	public void method1177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 - this.anInt1952;
		@Pc(15) int local15 = arg1 - this.anInt1943;
		this.anIntArrayArray24[local15][local10] |= 0x200000;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BIIIIZ)V")
	public void method1179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg1 - this.anInt1943;
		@Pc(13) int local13 = arg2 - this.anInt1952;
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1172(128, local8, local13);
				this.method1172(8, local8 - 1, local13);
			}
			if (arg3 == 1) {
				this.method1172(2, local8, local13);
				this.method1172(32, local8, local13 + 1);
			}
			if (arg3 == 2) {
				this.method1172(8, local8, local13);
				this.method1172(128, local8 + 1, local13);
			}
			if (arg3 == 3) {
				this.method1172(32, local8, local13);
				this.method1172(2, local8, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1172(1, local8, local13);
				this.method1172(16, local8 - 1, local13 - -1);
			}
			if (arg3 == 1) {
				this.method1172(4, local8, local13);
				this.method1172(64, local8 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method1172(16, local8, local13);
				this.method1172(1, local8 + 1, local13 - 1);
			}
			if (arg3 == 3) {
				this.method1172(64, local8, local13);
				this.method1172(4, local8 - 1, local13 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg3 == 0) {
				this.method1172(130, local8, local13);
				this.method1172(8, local8 - 1, local13);
				this.method1172(32, local8, local13 + 1);
			}
			if (arg3 == 1) {
				this.method1172(10, local8, local13);
				this.method1172(32, local8, local13 + 1);
				this.method1172(128, local8 + 1, local13);
			}
			if (arg3 == 2) {
				this.method1172(40, local8, local13);
				this.method1172(128, local8 + 1, local13);
				this.method1172(2, local8, local13 - 1);
			}
			if (arg3 == 3) {
				this.method1172(160, local8, local13);
				this.method1172(2, local8, local13 - 1);
				this.method1172(8, local8 - 1, local13);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 == 0) {
				this.method1172(65536, local8, local13);
				this.method1172(4096, local8 - 1, local13);
			}
			if (arg3 == 1) {
				this.method1172(1024, local8, local13);
				this.method1172(16384, local8, local13 + 1);
			}
			if (arg3 == 2) {
				this.method1172(4096, local8, local13);
				this.method1172(65536, local8 + 1, local13);
			}
			if (arg3 == 3) {
				this.method1172(16384, local8, local13);
				this.method1172(1024, local8, local13 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				this.method1172(512, local8, local13);
				this.method1172(8192, local8 - 1, local13 + 1);
			}
			if (arg3 == 1) {
				this.method1172(2048, local8, local13);
				this.method1172(32768, local8 + 1, local13 + 1);
			}
			if (arg3 == 2) {
				this.method1172(8192, local8, local13);
				this.method1172(512, local8 + 1, local13 + -1);
			}
			if (arg3 == 3) {
				this.method1172(32768, local8, local13);
				this.method1172(2048, local8 - 1, local13 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1172(66560, local8, local13);
			this.method1172(4096, local8 - 1, local13);
			this.method1172(16384, local8, local13 + 1);
		}
		if (arg3 == 1) {
			this.method1172(5120, local8, local13);
			this.method1172(16384, local8, local13 + 1);
			this.method1172(65536, local8 + 1, local13);
		}
		if (arg3 == 2) {
			this.method1172(20480, local8, local13);
			this.method1172(65536, local8 + 1, local13);
			this.method1172(1024, local8, local13 - 1);
		}
		if (arg3 == 3) {
			this.method1172(81920, local8, local13);
			this.method1172(1024, local8, local13 - 1);
			this.method1172(4096, local8 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg1 && arg3 == arg4) {
			return true;
		}
		@Pc(20) int local20 = arg3 - this.anInt1952;
		@Pc(25) int local25 = arg5 - this.anInt1943;
		@Pc(30) int local30 = arg1 - this.anInt1943;
		@Pc(35) int local35 = arg4 - this.anInt1952;
		if (arg0 == 0) {
			if (arg2 == 0) {
				if (local25 == local30 - 1 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local35 == local20 + 1 && (this.anIntArrayArray24[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local25 == local30 && local35 == local20 + 1) {
					return true;
				}
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local25 == local30 + 1 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 == local25 && local35 == local20 - 1 && (this.anIntArrayArray24[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local30 == local25 && local35 == local20 - 1) {
					return true;
				}
				if (local30 - 1 == local25 && local20 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				if (local25 == local30 - 1 && local35 == local20) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35) {
					return true;
				}
				if (local30 + 1 == local25 && local20 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1 && (this.anIntArrayArray24[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local30 && local35 == local20 + 1) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (local30 - 1 == local25 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280108) == 0) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local25 == local30 + 1 && local35 == local20) {
					return true;
				}
				if (local25 == local30 && local35 == local20 - 1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (local25 == local30 - 1 && local20 == local35) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local35 && (this.anIntArrayArray24[local25][local35] & 0x1280120) == 0) {
					return true;
				}
				if (local30 + 1 == local25 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x1280180) == 0) {
					return true;
				}
				if (local25 == local30 && local20 - 1 == local35) {
					return true;
				}
			}
		}
		if (arg0 == 9) {
			if (local25 == local30 && local35 == local20 + 1 && (this.anIntArrayArray24[local25][local35] & 0x20) == 0) {
				return true;
			}
			if (local30 == local25 && local35 == local20 - 1 && (this.anIntArrayArray24[local25][local35] & 0x2) == 0) {
				return true;
			}
			if (local30 - 1 == local25 && local20 == local35 && (this.anIntArrayArray24[local25][local35] & 0x8) == 0) {
				return true;
			}
			if (local25 == local30 + 1 && local35 == local20 && (this.anIntArrayArray24[local25][local35] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIIII)V")
	public void method1182(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg1 - this.anInt1943;
		@Pc(21) int local21 = arg4 - this.anInt1952;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1170(128, local21, local16);
				this.method1170(8, local21, local16 - 1);
			}
			if (arg3 == 1) {
				this.method1170(2, local21, local16);
				this.method1170(32, local21 + 1, local16);
			}
			if (arg3 == 2) {
				this.method1170(8, local21, local16);
				this.method1170(128, local21, local16 + 1);
			}
			if (arg3 == 3) {
				this.method1170(32, local21, local16);
				this.method1170(2, local21 - 1, local16);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1170(1, local21, local16);
				this.method1170(16, local21 + 1, local16 - 1);
			}
			if (arg3 == 1) {
				this.method1170(4, local21, local16);
				this.method1170(64, local21 + 1, local16 - -1);
			}
			if (arg3 == 2) {
				this.method1170(16, local21, local16);
				this.method1170(1, local21 - 1, local16 + 1);
			}
			if (arg3 == 3) {
				this.method1170(64, local21, local16);
				this.method1170(4, local21 - 1, local16 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method1170(130, local21, local16);
				this.method1170(8, local21, local16 - 1);
				this.method1170(32, local21 + 1, local16);
			}
			if (arg3 == 1) {
				this.method1170(10, local21, local16);
				this.method1170(32, local21 + 1, local16);
				this.method1170(128, local21, local16 + 1);
			}
			if (arg3 == 2) {
				this.method1170(40, local21, local16);
				this.method1170(128, local21, local16 + 1);
				this.method1170(2, local21 - 1, local16);
			}
			if (arg3 == 3) {
				this.method1170(160, local21, local16);
				this.method1170(2, local21 - 1, local16);
				this.method1170(8, local21, local16 - 1);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1170(65536, local21, local16);
				this.method1170(4096, local21, local16 - 1);
			}
			if (arg3 == 1) {
				this.method1170(1024, local21, local16);
				this.method1170(16384, local21 + 1, local16);
			}
			if (arg3 == 2) {
				this.method1170(4096, local21, local16);
				this.method1170(65536, local21, local16 + 1);
			}
			if (arg3 == 3) {
				this.method1170(16384, local21, local16);
				this.method1170(1024, local21 - 1, local16);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1170(512, local21, local16);
				this.method1170(8192, local21 + 1, local16 + -1);
			}
			if (arg3 == 1) {
				this.method1170(2048, local21, local16);
				this.method1170(32768, local21 + 1, local16 + 1);
			}
			if (arg3 == 2) {
				this.method1170(8192, local21, local16);
				this.method1170(512, local21 - 1, local16 + 1);
			}
			if (arg3 == 3) {
				this.method1170(32768, local21, local16);
				this.method1170(2048, local21 - 1, local16 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1170(66560, local21, local16);
			this.method1170(4096, local21, local16 - 1);
			this.method1170(16384, local21 + 1, local16);
		}
		if (arg3 == 1) {
			this.method1170(5120, local21, local16);
			this.method1170(16384, local21 + 1, local16);
			this.method1170(65536, local21, local16 + 1);
		}
		if (arg3 == 2) {
			this.method1170(20480, local21, local16);
			this.method1170(65536, local21, local16 + 1);
			this.method1170(1024, local21 - 1, local16);
		}
		if (arg3 == 3) {
			this.method1170(81920, local21, local16);
			this.method1170(1024, local21 - 1, local16);
			this.method1170(4096, local21, local16 - 1);
			return;
		}
	}
}
