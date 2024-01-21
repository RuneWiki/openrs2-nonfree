import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt694 = -243;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt695 = 9;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt696 = 0;
			this.anInt697 = 0;
			this.anInt698 = arg1;
			this.anInt699 = arg2;
			this.anIntArrayArray18 = new int[this.anInt698][this.anInt699];
			this.method420();
			@Pc(41) int local41 = 54 / arg0;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("93433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method420() {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt698; local8++) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt699; local12++) {
					if (local8 == 0 || local12 == 0 || local8 == this.anInt698 - 1 || local12 == this.anInt699 - 1) {
						this.anIntArrayArray18[local8][local12] = 16777215;
					} else {
						this.anIntArrayArray18[local8][local12] = 0;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("72190, " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt696;
			@Pc(9) int local9 = arg3 - this.anInt697;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method424(local4, local9, 128);
					this.method424(local4 - 1, local9, 8);
				}
				if (arg4 == 1) {
					this.method424(local4, local9, 2);
					this.method424(local4, local9 + 1, 32);
				}
				if (arg4 == 2) {
					this.method424(local4, local9, 8);
					this.method424(local4 + 1, local9, 128);
				}
				if (arg4 == 3) {
					this.method424(local4, local9, 32);
					this.method424(local4, local9 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method424(local4, local9, 1);
					this.method424(local4 - 1, local9 + 1, 16);
				}
				if (arg4 == 1) {
					this.method424(local4, local9, 4);
					this.method424(local4 + 1, local9 + 1, 64);
				}
				if (arg4 == 2) {
					this.method424(local4, local9, 16);
					this.method424(local4 + 1, local9 - 1, 1);
				}
				if (arg4 == 3) {
					this.method424(local4, local9, 64);
					this.method424(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method424(local4, local9, 130);
					this.method424(local4 - 1, local9, 8);
					this.method424(local4, local9 + 1, 32);
				}
				if (arg4 == 1) {
					this.method424(local4, local9, 10);
					this.method424(local4, local9 + 1, 32);
					this.method424(local4 + 1, local9, 128);
				}
				if (arg4 == 2) {
					this.method424(local4, local9, 40);
					this.method424(local4 + 1, local9, 128);
					this.method424(local4, local9 - 1, 2);
				}
				if (arg4 == 3) {
					this.method424(local4, local9, 160);
					this.method424(local4, local9 - 1, 2);
					this.method424(local4 - 1, local9, 8);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method424(local4, local9, 65536);
						this.method424(local4 - 1, local9, 4096);
					}
					if (arg4 == 1) {
						this.method424(local4, local9, 1024);
						this.method424(local4, local9 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method424(local4, local9, 4096);
						this.method424(local4 + 1, local9, 65536);
					}
					if (arg4 == 3) {
						this.method424(local4, local9, 16384);
						this.method424(local4, local9 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method424(local4, local9, 512);
						this.method424(local4 - 1, local9 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method424(local4, local9, 2048);
						this.method424(local4 + 1, local9 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method424(local4, local9, 8192);
						this.method424(local4 + 1, local9 - 1, 512);
					}
					if (arg4 == 3) {
						this.method424(local4, local9, 32768);
						this.method424(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method424(local4, local9, 66560);
						this.method424(local4 - 1, local9, 4096);
						this.method424(local4, local9 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method424(local4, local9, 5120);
						this.method424(local4, local9 + 1, 16384);
						this.method424(local4 + 1, local9, 65536);
					}
					if (arg4 == 2) {
						this.method424(local4, local9, 20480);
						this.method424(local4 + 1, local9, 65536);
						this.method424(local4, local9 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method424(local4, local9, 81920);
						this.method424(local4, local9 - 1, 1024);
						this.method424(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("67809, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZZIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt696;
			@Pc(19) int local19 = arg0 - this.anInt697;
			@Pc(37) int local37;
			if (arg1 == 1 || arg1 == 3) {
				local37 = arg5;
				arg5 = arg3;
				arg3 = local37;
			}
			for (local37 = local14; local37 < local14 + arg5; local37++) {
				if (local37 >= 0 && local37 < this.anInt698) {
					for (@Pc(53) int local53 = local19; local53 < local19 + arg3; local53++) {
						if (local53 >= 0 && local53 < this.anInt699) {
							this.method424(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("52748, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt696;
			@Pc(9) int local9 = arg0 - this.anInt697;
			@Pc(14) boolean local14 = false;
			this.anIntArrayArray18[local4][local9] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("41061, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIBII)V")
	public void method425(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt696;
			@Pc(9) int local9 = arg2 - this.anInt697;
			@Pc(14) boolean local14 = false;
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method427(local9, 128, local4);
					this.method427(local9, 8, local4 - 1);
				}
				if (arg1 == 1) {
					this.method427(local9, 2, local4);
					this.method427(local9 + 1, 32, local4);
				}
				if (arg1 == 2) {
					this.method427(local9, 8, local4);
					this.method427(local9, 128, local4 + 1);
				}
				if (arg1 == 3) {
					this.method427(local9, 32, local4);
					this.method427(local9 - 1, 2, local4);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method427(local9, 1, local4);
					this.method427(local9 + 1, 16, local4 - 1);
				}
				if (arg1 == 1) {
					this.method427(local9, 4, local4);
					this.method427(local9 + 1, 64, local4 + 1);
				}
				if (arg1 == 2) {
					this.method427(local9, 16, local4);
					this.method427(local9 - 1, 1, local4 + 1);
				}
				if (arg1 == 3) {
					this.method427(local9, 64, local4);
					this.method427(local9 - 1, 4, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method427(local9, 130, local4);
					this.method427(local9, 8, local4 - 1);
					this.method427(local9 + 1, 32, local4);
				}
				if (arg1 == 1) {
					this.method427(local9, 10, local4);
					this.method427(local9 + 1, 32, local4);
					this.method427(local9, 128, local4 + 1);
				}
				if (arg1 == 2) {
					this.method427(local9, 40, local4);
					this.method427(local9, 128, local4 + 1);
					this.method427(local9 - 1, 2, local4);
				}
				if (arg1 == 3) {
					this.method427(local9, 160, local4);
					this.method427(local9 - 1, 2, local4);
					this.method427(local9, 8, local4 - 1);
				}
			}
			if (arg0) {
				if (arg5 == 0) {
					if (arg1 == 0) {
						this.method427(local9, 65536, local4);
						this.method427(local9, 4096, local4 - 1);
					}
					if (arg1 == 1) {
						this.method427(local9, 1024, local4);
						this.method427(local9 + 1, 16384, local4);
					}
					if (arg1 == 2) {
						this.method427(local9, 4096, local4);
						this.method427(local9, 65536, local4 + 1);
					}
					if (arg1 == 3) {
						this.method427(local9, 16384, local4);
						this.method427(local9 - 1, 1024, local4);
					}
				}
				if (arg5 == 1 || arg5 == 3) {
					if (arg1 == 0) {
						this.method427(local9, 512, local4);
						this.method427(local9 + 1, 8192, local4 - 1);
					}
					if (arg1 == 1) {
						this.method427(local9, 2048, local4);
						this.method427(local9 + 1, 32768, local4 + 1);
					}
					if (arg1 == 2) {
						this.method427(local9, 8192, local4);
						this.method427(local9 - 1, 512, local4 + 1);
					}
					if (arg1 == 3) {
						this.method427(local9, 32768, local4);
						this.method427(local9 - 1, 2048, local4 - 1);
					}
				}
				if (arg5 == 2) {
					if (arg1 == 0) {
						this.method427(local9, 66560, local4);
						this.method427(local9, 4096, local4 - 1);
						this.method427(local9 + 1, 16384, local4);
					}
					if (arg1 == 1) {
						this.method427(local9, 5120, local4);
						this.method427(local9 + 1, 16384, local4);
						this.method427(local9, 65536, local4 + 1);
					}
					if (arg1 == 2) {
						this.method427(local9, 20480, local4);
						this.method427(local9, 65536, local4 + 1);
						this.method427(local9 - 1, 1024, local4);
					}
					if (arg1 == 3) {
						this.method427(local9, 81920, local4);
						this.method427(local9 - 1, 1024, local4);
						this.method427(local9, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("50671, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIII)V")
	public void method426(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(18) int local18 = arg1 - this.anInt696;
			@Pc(23) int local23 = arg5 - this.anInt697;
			@Pc(31) int local31;
			if (arg3 == 1 || arg3 == 3) {
				local31 = arg2;
				arg2 = arg4;
				arg4 = local31;
			}
			for (local31 = local18; local31 < local18 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt698) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg4; local47++) {
						if (local47 >= 0 && local47 < this.anInt699) {
							this.method427(local47, local3, local31);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("52194, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 9 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray18[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("48353, " + arg0 + ", " + 17480 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt696;
			@Pc(9) int local9 = arg0 - this.anInt697;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("47074, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg1 == arg4 && arg3 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt696;
			if (arg5) {
				throw new NullPointerException();
			}
			@Pc(23) int local23 = arg3 - this.anInt697;
			@Pc(28) int local28 = arg4 - this.anInt696;
			@Pc(33) int local33 = arg2 - this.anInt697;
			if (arg6 == 0) {
				if (arg0 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg0 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("42568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg3 && arg1 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt696;
			@Pc(17) int local17 = arg1 - this.anInt697;
			@Pc(28) int local28 = arg3 - this.anInt696;
			@Pc(33) int local33 = arg2 - this.anInt697;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("55848, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIZ)Z")
	public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg0 - 1;
			@Pc(11) int local11 = arg5 + arg3 - 1;
			if (arg6 >= arg1 && arg6 <= local5 && arg2 >= arg5 && arg2 <= local11) {
				return true;
			} else if (arg6 == arg1 - 1 && arg2 >= arg5 && arg2 <= local11 && (this.anIntArrayArray18[arg6 - this.anInt696][arg2 - this.anInt697] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg2 >= arg5 && arg2 <= local11 && (this.anIntArrayArray18[arg6 - this.anInt696][arg2 - this.anInt697] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg2 == arg5 - 1 && arg6 >= arg1 && arg6 <= local5 && (this.anIntArrayArray18[arg6 - this.anInt696][arg2 - this.anInt697] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg2 == local11 + 1 && arg6 >= arg1 && arg6 <= local5 && (this.anIntArrayArray18[arg6 - this.anInt696][arg2 - this.anInt697] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("28549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
