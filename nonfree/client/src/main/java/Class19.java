import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt673 = 366;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt674 = 47044;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt675 = 0;
			this.anInt676 = 0;
			this.anInt677 = arg2;
			this.anInt678 = arg1;
			this.anIntArrayArray18 = new int[this.anInt677][this.anInt678];
			this.method420();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("31849, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method420() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt677; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt678; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt677 - 1 || local7 == this.anInt678 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("70706, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt675;
			@Pc(13) int local13 = arg1 - this.anInt676;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method424(local4, local13, 128);
					this.method424(local4 - 1, local13, 8);
				}
				if (arg0 == 1) {
					this.method424(local4, local13, 2);
					this.method424(local4, local13 + 1, 32);
				}
				if (arg0 == 2) {
					this.method424(local4, local13, 8);
					this.method424(local4 + 1, local13, 128);
				}
				if (arg0 == 3) {
					this.method424(local4, local13, 32);
					this.method424(local4, local13 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method424(local4, local13, 1);
					this.method424(local4 - 1, local13 + 1, 16);
				}
				if (arg0 == 1) {
					this.method424(local4, local13, 4);
					this.method424(local4 + 1, local13 + 1, 64);
				}
				if (arg0 == 2) {
					this.method424(local4, local13, 16);
					this.method424(local4 + 1, local13 - 1, 1);
				}
				if (arg0 == 3) {
					this.method424(local4, local13, 64);
					this.method424(local4 - 1, local13 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method424(local4, local13, 130);
					this.method424(local4 - 1, local13, 8);
					this.method424(local4, local13 + 1, 32);
				}
				if (arg0 == 1) {
					this.method424(local4, local13, 10);
					this.method424(local4, local13 + 1, 32);
					this.method424(local4 + 1, local13, 128);
				}
				if (arg0 == 2) {
					this.method424(local4, local13, 40);
					this.method424(local4 + 1, local13, 128);
					this.method424(local4, local13 - 1, 2);
				}
				if (arg0 == 3) {
					this.method424(local4, local13, 160);
					this.method424(local4, local13 - 1, 2);
					this.method424(local4 - 1, local13, 8);
				}
			}
			if (arg4) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method424(local4, local13, 65536);
						this.method424(local4 - 1, local13, 4096);
					}
					if (arg0 == 1) {
						this.method424(local4, local13, 1024);
						this.method424(local4, local13 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method424(local4, local13, 4096);
						this.method424(local4 + 1, local13, 65536);
					}
					if (arg0 == 3) {
						this.method424(local4, local13, 16384);
						this.method424(local4, local13 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method424(local4, local13, 512);
						this.method424(local4 - 1, local13 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method424(local4, local13, 2048);
						this.method424(local4 + 1, local13 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method424(local4, local13, 8192);
						this.method424(local4 + 1, local13 - 1, 512);
					}
					if (arg0 == 3) {
						this.method424(local4, local13, 32768);
						this.method424(local4 - 1, local13 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method424(local4, local13, 66560);
						this.method424(local4 - 1, local13, 4096);
						this.method424(local4, local13 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method424(local4, local13, 5120);
						this.method424(local4, local13 + 1, 16384);
						this.method424(local4 + 1, local13, 65536);
					}
					if (arg0 == 2) {
						this.method424(local4, local13, 20480);
						this.method424(local4 + 1, local13, 65536);
						this.method424(local4, local13 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method424(local4, local13, 81920);
						this.method424(local4, local13 - 1, 1024);
						this.method424(local4 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("36376, " + arg0 + ", " + arg1 + ", " + 4139 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt675;
			@Pc(19) int local19 = arg3 - this.anInt676;
			@Pc(27) int local27;
			if (arg4 == 1 || arg4 == 3) {
				local27 = arg0;
				arg0 = arg1;
				arg1 = local27;
			}
			for (local27 = local14; local27 < local14 + arg0; local27++) {
				if (local27 >= 0 && local27 < this.anInt677) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg1; local43++) {
						if (local43 >= 0 && local43 < this.anInt678) {
							this.method424(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("35952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) int local8 = arg0 - this.anInt675;
			@Pc(13) int local13 = arg1 - this.anInt676;
			this.anIntArrayArray18[local8][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("58975, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZB)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt675;
			@Pc(9) int local9 = arg1 - this.anInt676;
			@Pc(14) boolean local14 = false;
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method427(128, local4, local9);
					this.method427(8, local4 - 1, local9);
				}
				if (arg3 == 1) {
					this.method427(2, local4, local9);
					this.method427(32, local4, local9 + 1);
				}
				if (arg3 == 2) {
					this.method427(8, local4, local9);
					this.method427(128, local4 + 1, local9);
				}
				if (arg3 == 3) {
					this.method427(32, local4, local9);
					this.method427(2, local4, local9 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method427(1, local4, local9);
					this.method427(16, local4 - 1, local9 + 1);
				}
				if (arg3 == 1) {
					this.method427(4, local4, local9);
					this.method427(64, local4 + 1, local9 + 1);
				}
				if (arg3 == 2) {
					this.method427(16, local4, local9);
					this.method427(1, local4 + 1, local9 - 1);
				}
				if (arg3 == 3) {
					this.method427(64, local4, local9);
					this.method427(4, local4 - 1, local9 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method427(130, local4, local9);
					this.method427(8, local4 - 1, local9);
					this.method427(32, local4, local9 + 1);
				}
				if (arg3 == 1) {
					this.method427(10, local4, local9);
					this.method427(32, local4, local9 + 1);
					this.method427(128, local4 + 1, local9);
				}
				if (arg3 == 2) {
					this.method427(40, local4, local9);
					this.method427(128, local4 + 1, local9);
					this.method427(2, local4, local9 - 1);
				}
				if (arg3 == 3) {
					this.method427(160, local4, local9);
					this.method427(2, local4, local9 - 1);
					this.method427(8, local4 - 1, local9);
				}
			}
			if (arg4) {
				if (arg2 == 0) {
					if (arg3 == 0) {
						this.method427(65536, local4, local9);
						this.method427(4096, local4 - 1, local9);
					}
					if (arg3 == 1) {
						this.method427(1024, local4, local9);
						this.method427(16384, local4, local9 + 1);
					}
					if (arg3 == 2) {
						this.method427(4096, local4, local9);
						this.method427(65536, local4 + 1, local9);
					}
					if (arg3 == 3) {
						this.method427(16384, local4, local9);
						this.method427(1024, local4, local9 - 1);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg3 == 0) {
						this.method427(512, local4, local9);
						this.method427(8192, local4 - 1, local9 + 1);
					}
					if (arg3 == 1) {
						this.method427(2048, local4, local9);
						this.method427(32768, local4 + 1, local9 + 1);
					}
					if (arg3 == 2) {
						this.method427(8192, local4, local9);
						this.method427(512, local4 + 1, local9 - 1);
					}
					if (arg3 == 3) {
						this.method427(32768, local4, local9);
						this.method427(2048, local4 - 1, local9 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg3 == 0) {
						this.method427(66560, local4, local9);
						this.method427(4096, local4 - 1, local9);
						this.method427(16384, local4, local9 + 1);
					}
					if (arg3 == 1) {
						this.method427(5120, local4, local9);
						this.method427(16384, local4, local9 + 1);
						this.method427(65536, local4 + 1, local9);
					}
					if (arg3 == 2) {
						this.method427(20480, local4, local9);
						this.method427(65536, local4 + 1, local9);
						this.method427(1024, local4, local9 - 1);
					}
					if (arg3 == 3) {
						this.method427(81920, local4, local9);
						this.method427(1024, local4, local9 - 1);
						this.method427(4096, local4 - 1, local9);
						return;
					}
				}
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("10972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZI)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt675;
			@Pc(25) int local25 = arg2 - this.anInt676;
			@Pc(33) int local33;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg0;
				arg0 = arg1;
				arg1 = local33;
			}
			for (local33 = local14; local33 < local14 + arg0; local33++) {
				if (local33 >= 0 && local33 < this.anInt677) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg1; local49++) {
						if (local49 >= 0 && local49 < this.anInt678) {
							this.method427(local3, local33, local49);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("86605, " + arg0 + ", " + -34457 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray18[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("39142, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public void method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg1 - this.anInt675;
			@Pc(14) int local14 = arg0 - this.anInt676;
			this.anIntArrayArray18[local9][local14] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("20317, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg4 && arg1 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt675;
			@Pc(24) int local24 = arg1 - this.anInt676;
			@Pc(29) int local29 = arg4 - this.anInt675;
			@Pc(34) int local34 = arg0 - this.anInt676;
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray18[local12][local24] & 0x20) == 0) {
					return true;
				}
				if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray18[local12][local24] & 0x2) == 0) {
					return true;
				}
				if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x8) == 0) {
					return true;
				}
				if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray18[local12][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("61477, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg5 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt675;
			@Pc(17) int local17 = arg4 - this.anInt676;
			if (this.anInt674 != 47044) {
				throw new NullPointerException();
			}
			@Pc(30) int local30 = arg5 - this.anInt675;
			@Pc(35) int local35 = arg3 - this.anInt676;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("23794, " + 47044 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg4 - 1;
			@Pc(11) int local11 = arg6 + arg1 - 1;
			if (arg2 >= arg3 && arg2 <= local5 && arg0 >= arg6 && arg0 <= local11) {
				return true;
			} else if (arg2 == arg3 - 1 && arg0 >= arg6 && arg0 <= local11 && (this.anIntArrayArray18[arg2 - this.anInt675][arg0 - this.anInt676] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg2 == local5 + 1 && arg0 >= arg6 && arg0 <= local11 && (this.anIntArrayArray18[arg2 - this.anInt675][arg0 - this.anInt676] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg6 - 1 && arg2 >= arg3 && arg2 <= local5 && (this.anIntArrayArray18[arg2 - this.anInt675][arg0 - this.anInt676] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local11 + 1 && arg2 >= arg3 && arg2 <= local5 && (this.anIntArrayArray18[arg2 - this.anInt675][arg0 - this.anInt676] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("18899, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
