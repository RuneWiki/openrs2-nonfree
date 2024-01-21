import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt676 = -49006;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt678 = 936;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt679 = 26912;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(BII)V")
	public Class19(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt680 = 0;
			this.anInt681 = 0;
			this.anInt682 = arg1;
			this.anInt683 = arg2;
			this.anIntArrayArray18 = new int[this.anInt682][this.anInt683];
			this.method417();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("81778, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method417() {
		try {
			@Pc(7) int local7;
			if (this.anInt676 != -49006) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			for (local7 = 0; local7 < this.anInt682; local7++) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt683; local18++) {
					if (local7 == 0 || local18 == 0 || local7 == this.anInt682 - 1 || local18 == this.anInt683 - 1) {
						this.anIntArrayArray18[local7][local18] = 16777215;
					} else {
						this.anIntArrayArray18[local7][local18] = 0;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("94262, " + -49006 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg3 - this.anInt680;
			@Pc(13) int local13 = arg0 - this.anInt681;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method421(local8, local13, 128);
					this.method421(local8 - 1, local13, 8);
				}
				if (arg2 == 1) {
					this.method421(local8, local13, 2);
					this.method421(local8, local13 + 1, 32);
				}
				if (arg2 == 2) {
					this.method421(local8, local13, 8);
					this.method421(local8 + 1, local13, 128);
				}
				if (arg2 == 3) {
					this.method421(local8, local13, 32);
					this.method421(local8, local13 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method421(local8, local13, 1);
					this.method421(local8 - 1, local13 + 1, 16);
				}
				if (arg2 == 1) {
					this.method421(local8, local13, 4);
					this.method421(local8 + 1, local13 + 1, 64);
				}
				if (arg2 == 2) {
					this.method421(local8, local13, 16);
					this.method421(local8 + 1, local13 - 1, 1);
				}
				if (arg2 == 3) {
					this.method421(local8, local13, 64);
					this.method421(local8 - 1, local13 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method421(local8, local13, 130);
					this.method421(local8 - 1, local13, 8);
					this.method421(local8, local13 + 1, 32);
				}
				if (arg2 == 1) {
					this.method421(local8, local13, 10);
					this.method421(local8, local13 + 1, 32);
					this.method421(local8 + 1, local13, 128);
				}
				if (arg2 == 2) {
					this.method421(local8, local13, 40);
					this.method421(local8 + 1, local13, 128);
					this.method421(local8, local13 - 1, 2);
				}
				if (arg2 == 3) {
					this.method421(local8, local13, 160);
					this.method421(local8, local13 - 1, 2);
					this.method421(local8 - 1, local13, 8);
				}
			}
			if (arg5) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method421(local8, local13, 65536);
						this.method421(local8 - 1, local13, 4096);
					}
					if (arg2 == 1) {
						this.method421(local8, local13, 1024);
						this.method421(local8, local13 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method421(local8, local13, 4096);
						this.method421(local8 + 1, local13, 65536);
					}
					if (arg2 == 3) {
						this.method421(local8, local13, 16384);
						this.method421(local8, local13 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method421(local8, local13, 512);
						this.method421(local8 - 1, local13 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method421(local8, local13, 2048);
						this.method421(local8 + 1, local13 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method421(local8, local13, 8192);
						this.method421(local8 + 1, local13 - 1, 512);
					}
					if (arg2 == 3) {
						this.method421(local8, local13, 32768);
						this.method421(local8 - 1, local13 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method421(local8, local13, 66560);
						this.method421(local8 - 1, local13, 4096);
						this.method421(local8, local13 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method421(local8, local13, 5120);
						this.method421(local8, local13 + 1, 16384);
						this.method421(local8 + 1, local13, 65536);
					}
					if (arg2 == 2) {
						this.method421(local8, local13, 20480);
						this.method421(local8 + 1, local13, 65536);
						this.method421(local8, local13 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method421(local8, local13, 81920);
						this.method421(local8, local13 - 1, 1024);
						this.method421(local8 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("43771, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZBI)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(11) int local11 = 256;
			if (arg4) {
				local11 = 131328;
			}
			@Pc(22) int local22 = arg3 - this.anInt680;
			@Pc(27) int local27 = arg0 - this.anInt681;
			@Pc(35) int local35;
			if (arg6 == 1 || arg6 == 3) {
				local35 = arg2;
				arg2 = arg1;
				arg1 = local35;
			}
			for (local35 = local22; local35 < local22 + arg2; local35++) {
				if (local35 >= 0 && local35 < this.anInt682) {
					for (@Pc(51) int local51 = local27; local51 < local27 + arg1; local51++) {
						if (local51 >= 0 && local51 < this.anInt683) {
							this.method421(local35, local51, local11);
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("75168, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt680;
			@Pc(12) int local12 = arg1 - this.anInt681;
			this.anIntArrayArray18[local7][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12236, " + arg0 + ", " + true + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIZ)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt680;
			if (arg0 != 0) {
				this.aBoolean179 = !this.aBoolean179;
			}
			@Pc(19) int local19 = arg1 - this.anInt681;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method424(128, local19, local4);
					this.method424(8, local19, local4 - 1);
				}
				if (arg3 == 1) {
					this.method424(2, local19, local4);
					this.method424(32, local19 + 1, local4);
				}
				if (arg3 == 2) {
					this.method424(8, local19, local4);
					this.method424(128, local19, local4 + 1);
				}
				if (arg3 == 3) {
					this.method424(32, local19, local4);
					this.method424(2, local19 - 1, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method424(1, local19, local4);
					this.method424(16, local19 + 1, local4 - 1);
				}
				if (arg3 == 1) {
					this.method424(4, local19, local4);
					this.method424(64, local19 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method424(16, local19, local4);
					this.method424(1, local19 - 1, local4 + 1);
				}
				if (arg3 == 3) {
					this.method424(64, local19, local4);
					this.method424(4, local19 - 1, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method424(130, local19, local4);
					this.method424(8, local19, local4 - 1);
					this.method424(32, local19 + 1, local4);
				}
				if (arg3 == 1) {
					this.method424(10, local19, local4);
					this.method424(32, local19 + 1, local4);
					this.method424(128, local19, local4 + 1);
				}
				if (arg3 == 2) {
					this.method424(40, local19, local4);
					this.method424(128, local19, local4 + 1);
					this.method424(2, local19 - 1, local4);
				}
				if (arg3 == 3) {
					this.method424(160, local19, local4);
					this.method424(2, local19 - 1, local4);
					this.method424(8, local19, local4 - 1);
				}
			}
			if (arg5) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method424(65536, local19, local4);
						this.method424(4096, local19, local4 - 1);
					}
					if (arg3 == 1) {
						this.method424(1024, local19, local4);
						this.method424(16384, local19 + 1, local4);
					}
					if (arg3 == 2) {
						this.method424(4096, local19, local4);
						this.method424(65536, local19, local4 + 1);
					}
					if (arg3 == 3) {
						this.method424(16384, local19, local4);
						this.method424(1024, local19 - 1, local4);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method424(512, local19, local4);
						this.method424(8192, local19 + 1, local4 - 1);
					}
					if (arg3 == 1) {
						this.method424(2048, local19, local4);
						this.method424(32768, local19 + 1, local4 + 1);
					}
					if (arg3 == 2) {
						this.method424(8192, local19, local4);
						this.method424(512, local19 - 1, local4 + 1);
					}
					if (arg3 == 3) {
						this.method424(32768, local19, local4);
						this.method424(2048, local19 - 1, local4 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method424(66560, local19, local4);
						this.method424(4096, local19, local4 - 1);
						this.method424(16384, local19 + 1, local4);
					}
					if (arg3 == 1) {
						this.method424(5120, local19, local4);
						this.method424(16384, local19 + 1, local4);
						this.method424(65536, local19, local4 + 1);
					}
					if (arg3 == 2) {
						this.method424(20480, local19, local4);
						this.method424(65536, local19, local4 + 1);
						this.method424(1024, local19 - 1, local4);
					}
					if (arg3 == 3) {
						this.method424(81920, local19, local4);
						this.method424(1024, local19 - 1, local4);
						this.method424(4096, local19, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("51092, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIZ)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(13) int local13 = 256;
			if (arg5) {
				local13 = 131328;
			}
			@Pc(24) int local24 = arg3 - this.anInt680;
			@Pc(29) int local29 = arg1 - this.anInt681;
			@Pc(37) int local37;
			if (arg4 == 1 || arg4 == 3) {
				local37 = arg2;
				arg2 = arg0;
				arg0 = local37;
			}
			for (local37 = local24; local37 < local24 + arg2; local37++) {
				if (local37 >= 0 && local37 < this.anInt682) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg0; local53++) {
						if (local53 >= 0 && local53 < this.anInt683) {
							this.method424(local13, local53, local37);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("29307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -705 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray18[arg2][arg1] &= 16777215 - arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("78030, " + arg0 + ", " + arg1 + ", " + 921 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt680;
			@Pc(15) int local15 = arg1 - this.anInt681;
			this.anIntArrayArray18[local4][local15] &= 0xDFFFFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("91426, " + arg0 + ", " + -21 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIII)Z")
	public boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg4 && arg0 == arg2) {
				return true;
			}
			@Pc(17) int local17 = arg3 - this.anInt680;
			@Pc(22) int local22 = arg0 - this.anInt681;
			@Pc(27) int local27 = arg4 - this.anInt680;
			@Pc(32) int local32 = arg2 - this.anInt681;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local17 == local27 - 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1 && (this.anIntArrayArray18[local17][local22] & 0x280120) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1 && (this.anIntArrayArray18[local17][local22] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local17 == local27 && local22 == local32 + 1) {
						return true;
					}
					if (local17 == local27 - 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280108) == 0) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local17 == local27 + 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1 && (this.anIntArrayArray18[local17][local22] & 0x280120) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1 && (this.anIntArrayArray18[local17][local22] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local17 == local27 && local22 == local32 - 1) {
						return true;
					}
					if (local17 == local27 - 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280108) == 0) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local17 == local27 - 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280180) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1 && (this.anIntArrayArray18[local17][local22] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local17 == local27 - 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280108) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1 && (this.anIntArrayArray18[local17][local22] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local17 == local27 - 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280108) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1 && (this.anIntArrayArray18[local17][local22] & 0x280120) == 0) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local17 == local27 - 1 && local22 == local32) {
						return true;
					}
					if (local17 == local27 && local22 == local32 + 1 && (this.anIntArrayArray18[local17][local22] & 0x280120) == 0) {
						return true;
					}
					if (local17 == local27 + 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x280180) == 0) {
						return true;
					}
					if (local17 == local27 && local22 == local32 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local17 == local27 && local22 == local32 + 1 && (this.anIntArrayArray18[local17][local22] & 0x20) == 0) {
					return true;
				}
				if (local17 == local27 && local22 == local32 - 1 && (this.anIntArrayArray18[local17][local22] & 0x2) == 0) {
					return true;
				}
				if (local17 == local27 - 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x8) == 0) {
					return true;
				}
				if (local17 == local27 + 1 && local22 == local32 && (this.anIntArrayArray18[local17][local22] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(565) RuntimeException local565) {
			signlink.reporterror("89476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local565.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == arg4 && arg1 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt680;
			@Pc(17) int local17 = arg1 - this.anInt681;
			@Pc(27) int local27 = arg4 - this.anInt680;
			@Pc(32) int local32 = arg3 - this.anInt681;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("17076, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -272 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg0 + arg3 - 1;
			@Pc(11) int local11 = arg2 + arg7 - 1;
			@Pc(15) int local15 = 17 / arg4;
			if (arg1 >= arg0 && arg1 <= local5 && arg5 >= arg2 && arg5 <= local11) {
				return true;
			} else if (arg1 == arg0 - 1 && arg5 >= arg2 && arg5 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt680][arg5 - this.anInt681] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg5 >= arg2 && arg5 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt680][arg5 - this.anInt681] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg2 - 1 && arg1 >= arg0 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt680][arg5 - this.anInt681] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local11 + 1 && arg1 >= arg0 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt680][arg5 - this.anInt681] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("59348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
