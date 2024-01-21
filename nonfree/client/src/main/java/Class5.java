import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EAREBDMK")
public final class Class5 {

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!EAREBDMK", name = "b", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!EAREBDMK", name = "c", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!EAREBDMK", name = "d", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!EAREBDMK", name = "e", descriptor = "I")
	private int anInt107 = 6;

	@OriginalMember(owner = "client!EAREBDMK", name = "f", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!EAREBDMK", name = "g", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!EAREBDMK", name = "h", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!EAREBDMK", name = "i", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!EAREBDMK", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!EAREBDMK", name = "<init>", descriptor = "(IBI)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt108 = 0;
			this.anInt109 = 0;
			this.anInt110 = arg0;
			this.anInt111 = arg2;
			this.anIntArrayArray5 = new int[this.anInt110][this.anInt111];
			this.method64();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("41850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "()V")
	public void method64() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt110; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt111; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt110 - 1 || local7 == this.anInt111 - 1) {
					this.anIntArrayArray5[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray5[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIIZI)V")
	public void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt108;
			@Pc(9) int local9 = arg1 - this.anInt109;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method68(local4, local9, 128);
					this.method68(local4 - 1, local9, 8);
				}
				if (arg0 == 1) {
					this.method68(local4, local9, 2);
					this.method68(local4, local9 + 1, 32);
				}
				if (arg0 == 2) {
					this.method68(local4, local9, 8);
					this.method68(local4 + 1, local9, 128);
				}
				if (arg0 == 3) {
					this.method68(local4, local9, 32);
					this.method68(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method68(local4, local9, 1);
					this.method68(local4 - 1, local9 + 1, 16);
				}
				if (arg0 == 1) {
					this.method68(local4, local9, 4);
					this.method68(local4 + 1, local9 + 1, 64);
				}
				if (arg0 == 2) {
					this.method68(local4, local9, 16);
					this.method68(local4 + 1, local9 - 1, 1);
				}
				if (arg0 == 3) {
					this.method68(local4, local9, 64);
					this.method68(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method68(local4, local9, 130);
					this.method68(local4 - 1, local9, 8);
					this.method68(local4, local9 + 1, 32);
				}
				if (arg0 == 1) {
					this.method68(local4, local9, 10);
					this.method68(local4, local9 + 1, 32);
					this.method68(local4 + 1, local9, 128);
				}
				if (arg0 == 2) {
					this.method68(local4, local9, 40);
					this.method68(local4 + 1, local9, 128);
					this.method68(local4, local9 - 1, 2);
				}
				if (arg0 == 3) {
					this.method68(local4, local9, 160);
					this.method68(local4, local9 - 1, 2);
					this.method68(local4 - 1, local9, 8);
				}
			}
			if (arg3) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method68(local4, local9, 65536);
						this.method68(local4 - 1, local9, 4096);
					}
					if (arg0 == 1) {
						this.method68(local4, local9, 1024);
						this.method68(local4, local9 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method68(local4, local9, 4096);
						this.method68(local4 + 1, local9, 65536);
					}
					if (arg0 == 3) {
						this.method68(local4, local9, 16384);
						this.method68(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method68(local4, local9, 512);
						this.method68(local4 - 1, local9 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method68(local4, local9, 2048);
						this.method68(local4 + 1, local9 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method68(local4, local9, 8192);
						this.method68(local4 + 1, local9 - 1, 512);
					}
					if (arg0 == 3) {
						this.method68(local4, local9, 32768);
						this.method68(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method68(local4, local9, 66560);
						this.method68(local4 - 1, local9, 4096);
						this.method68(local4, local9 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method68(local4, local9, 5120);
						this.method68(local4, local9 + 1, 16384);
						this.method68(local4 + 1, local9, 65536);
					}
					if (arg0 == 2) {
						this.method68(local4, local9, 20480);
						this.method68(local4 + 1, local9, 65536);
						this.method68(local4, local9 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method68(local4, local9, 81920);
						this.method68(local4, local9 - 1, 1024);
						this.method68(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("73663, " + arg0 + ", " + arg1 + ", " + 47214 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIIIIZ)V")
	public void method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(13) int local13 = 256;
			if (arg5) {
				local13 = 131328;
			}
			@Pc(24) int local24 = arg4 - this.anInt108;
			@Pc(29) int local29 = arg0 - this.anInt109;
			@Pc(37) int local37;
			if (arg2 == 1 || arg2 == 3) {
				local37 = arg1;
				arg1 = arg3;
				arg3 = local37;
			}
			for (local37 = local24; local37 < local24 + arg1; local37++) {
				if (local37 >= 0 && local37 < this.anInt110) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg3; local53++) {
						if (local53 >= 0 && local53 < this.anInt111) {
							this.method68(local37, local53, local13);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("45757, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 98 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(III)V")
	public void method67(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt108;
			@Pc(9) int local9 = arg1 - this.anInt109;
			this.anIntArrayArray5[local4][local9] |= 0x200000;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("64118, " + 119 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "b", descriptor = "(III)V")
	private void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray5[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(ZZIIII)V")
	public void method69(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt108;
			@Pc(12) int local12 = arg4 - this.anInt109;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method71(local4, 128, local12);
					this.method71(local4 - 1, 8, local12);
				}
				if (arg1 == 1) {
					this.method71(local4, 2, local12);
					this.method71(local4, 32, local12 + 1);
				}
				if (arg1 == 2) {
					this.method71(local4, 8, local12);
					this.method71(local4 + 1, 128, local12);
				}
				if (arg1 == 3) {
					this.method71(local4, 32, local12);
					this.method71(local4, 2, local12 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method71(local4, 1, local12);
					this.method71(local4 - 1, 16, local12 + 1);
				}
				if (arg1 == 1) {
					this.method71(local4, 4, local12);
					this.method71(local4 + 1, 64, local12 + 1);
				}
				if (arg1 == 2) {
					this.method71(local4, 16, local12);
					this.method71(local4 + 1, 1, local12 - 1);
				}
				if (arg1 == 3) {
					this.method71(local4, 64, local12);
					this.method71(local4 - 1, 4, local12 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method71(local4, 130, local12);
					this.method71(local4 - 1, 8, local12);
					this.method71(local4, 32, local12 + 1);
				}
				if (arg1 == 1) {
					this.method71(local4, 10, local12);
					this.method71(local4, 32, local12 + 1);
					this.method71(local4 + 1, 128, local12);
				}
				if (arg1 == 2) {
					this.method71(local4, 40, local12);
					this.method71(local4 + 1, 128, local12);
					this.method71(local4, 2, local12 - 1);
				}
				if (arg1 == 3) {
					this.method71(local4, 160, local12);
					this.method71(local4, 2, local12 - 1);
					this.method71(local4 - 1, 8, local12);
				}
			}
			if (arg0) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method71(local4, 65536, local12);
						this.method71(local4 - 1, 4096, local12);
					}
					if (arg1 == 1) {
						this.method71(local4, 1024, local12);
						this.method71(local4, 16384, local12 + 1);
					}
					if (arg1 == 2) {
						this.method71(local4, 4096, local12);
						this.method71(local4 + 1, 65536, local12);
					}
					if (arg1 == 3) {
						this.method71(local4, 16384, local12);
						this.method71(local4, 1024, local12 - 1);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method71(local4, 512, local12);
						this.method71(local4 - 1, 8192, local12 + 1);
					}
					if (arg1 == 1) {
						this.method71(local4, 2048, local12);
						this.method71(local4 + 1, 32768, local12 + 1);
					}
					if (arg1 == 2) {
						this.method71(local4, 8192, local12);
						this.method71(local4 + 1, 512, local12 - 1);
					}
					if (arg1 == 3) {
						this.method71(local4, 32768, local12);
						this.method71(local4 - 1, 2048, local12 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method71(local4, 66560, local12);
						this.method71(local4 - 1, 4096, local12);
						this.method71(local4, 16384, local12 + 1);
					}
					if (arg1 == 1) {
						this.method71(local4, 5120, local12);
						this.method71(local4, 16384, local12 + 1);
						this.method71(local4 + 1, 65536, local12);
					}
					if (arg1 == 2) {
						this.method71(local4, 20480, local12);
						this.method71(local4 + 1, 65536, local12);
						this.method71(local4, 1024, local12 - 1);
					}
					if (arg1 == 3) {
						this.method71(local4, 81920, local12);
						this.method71(local4, 1024, local12 - 1);
						this.method71(local4 - 1, 4096, local12);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("18229, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIZIII)V")
	public void method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(24) int local24 = arg1 - this.anInt108;
			@Pc(29) int local29 = arg5 - this.anInt109;
			@Pc(37) int local37;
			if (arg0 == 1 || arg0 == 3) {
				local37 = arg2;
				arg2 = arg4;
				arg4 = local37;
			}
			for (local37 = local24; local37 < local24 + arg2; local37++) {
				if (local37 >= 0 && local37 < this.anInt110) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg4; local53++) {
						if (local53 >= 0 && local53 < this.anInt111) {
							this.method71(local37, local3, local53);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIII)V")
	private void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray5[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("14892, " + arg0 + ", " + arg1 + ", " + 267 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(BII)V")
	public void method72(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10 = arg1 - this.anInt108;
			@Pc(15) int local15 = arg0 - this.anInt109;
			this.anIntArrayArray5[local10][local15] &= 0xDFFFFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("26389, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg5 && arg0 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt108;
			@Pc(23) int local23 = arg0 - this.anInt109;
			@Pc(28) int local28 = arg5 - this.anInt108;
			@Pc(33) int local33 = arg2 - this.anInt109;
			if (arg1 == 0) {
				if (arg4 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray5[local12][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray5[local12][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray5[local12][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray5[local12][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray5[local12][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray5[local12][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray5[local12][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray5[local12][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray5[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray5[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray5[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("8084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg1 && arg3 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt108;
			@Pc(17) int local17 = arg3 - this.anInt109;
			@Pc(22) int local22 = arg1 - this.anInt108;
			@Pc(33) int local33 = arg4 - this.anInt109;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("5482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EAREBDMK", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(15) int local15 = arg1 + arg2 - 1;
			@Pc(21) int local21 = arg5 + arg6 - 1;
			if (arg3 >= arg1 && arg3 <= local15 && arg4 >= arg5 && arg4 <= local21) {
				return true;
			} else if (arg3 == arg1 - 1 && arg4 >= arg5 && arg4 <= local21 && (this.anIntArrayArray5[arg3 - this.anInt108][arg4 - this.anInt109] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg3 == local15 + 1 && arg4 >= arg5 && arg4 <= local21 && (this.anIntArrayArray5[arg3 - this.anInt108][arg4 - this.anInt109] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg5 - 1 && arg3 >= arg1 && arg3 <= local15 && (this.anIntArrayArray5[arg3 - this.anInt108][arg4 - this.anInt109] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local21 + 1 && arg3 >= arg1 && arg3 <= local15 && (this.anIntArrayArray5[arg3 - this.anInt108][arg4 - this.anInt109] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("13851, " + arg0 + ", " + arg1 + ", " + -30038 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
