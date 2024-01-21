import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KQTHKTBC")
public final class Class21 {

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!KQTHKTBC", name = "b", descriptor = "B")
	private byte aByte13 = 32;

	@OriginalMember(owner = "client!KQTHKTBC", name = "c", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!KQTHKTBC", name = "d", descriptor = "I")
	private int anInt329 = 7;

	@OriginalMember(owner = "client!KQTHKTBC", name = "e", descriptor = "I")
	private int anInt330 = 31743;

	@OriginalMember(owner = "client!KQTHKTBC", name = "f", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!KQTHKTBC", name = "g", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!KQTHKTBC", name = "h", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!KQTHKTBC", name = "i", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!KQTHKTBC", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!KQTHKTBC", name = "<init>", descriptor = "(IIZ)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt331 = 0;
			this.anInt332 = 0;
			this.anInt333 = arg1;
			this.anInt334 = arg0;
			this.anIntArrayArray7 = new int[this.anInt333][this.anInt334];
			this.method209();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("85023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "()V")
	public void method209() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt333; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt334; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt333 - 1 || local7 == this.anInt334 - 1) {
					this.anIntArrayArray7[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray7[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IBIZII)V")
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt331;
			@Pc(9) int local9 = arg3 - this.anInt332;
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method213(local4, local9, 128);
					this.method213(local4 - 1, local9, 8);
				}
				if (arg4 == 1) {
					this.method213(local4, local9, 2);
					this.method213(local4, local9 + 1, 32);
				}
				if (arg4 == 2) {
					this.method213(local4, local9, 8);
					this.method213(local4 + 1, local9, 128);
				}
				if (arg4 == 3) {
					this.method213(local4, local9, 32);
					this.method213(local4, local9 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method213(local4, local9, 1);
					this.method213(local4 - 1, local9 + 1, 16);
				}
				if (arg4 == 1) {
					this.method213(local4, local9, 4);
					this.method213(local4 + 1, local9 + 1, 64);
				}
				if (arg4 == 2) {
					this.method213(local4, local9, 16);
					this.method213(local4 + 1, local9 - 1, 1);
				}
				if (arg4 == 3) {
					this.method213(local4, local9, 64);
					this.method213(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method213(local4, local9, 130);
					this.method213(local4 - 1, local9, 8);
					this.method213(local4, local9 + 1, 32);
				}
				if (arg4 == 1) {
					this.method213(local4, local9, 10);
					this.method213(local4, local9 + 1, 32);
					this.method213(local4 + 1, local9, 128);
				}
				if (arg4 == 2) {
					this.method213(local4, local9, 40);
					this.method213(local4 + 1, local9, 128);
					this.method213(local4, local9 - 1, 2);
				}
				if (arg4 == 3) {
					this.method213(local4, local9, 160);
					this.method213(local4, local9 - 1, 2);
					this.method213(local4 - 1, local9, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg4 == 0) {
						this.method213(local4, local9, 65536);
						this.method213(local4 - 1, local9, 4096);
					}
					if (arg4 == 1) {
						this.method213(local4, local9, 1024);
						this.method213(local4, local9 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method213(local4, local9, 4096);
						this.method213(local4 + 1, local9, 65536);
					}
					if (arg4 == 3) {
						this.method213(local4, local9, 16384);
						this.method213(local4, local9 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg4 == 0) {
						this.method213(local4, local9, 512);
						this.method213(local4 - 1, local9 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method213(local4, local9, 2048);
						this.method213(local4 + 1, local9 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method213(local4, local9, 8192);
						this.method213(local4 + 1, local9 - 1, 512);
					}
					if (arg4 == 3) {
						this.method213(local4, local9, 32768);
						this.method213(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg4 == 0) {
						this.method213(local4, local9, 66560);
						this.method213(local4 - 1, local9, 4096);
						this.method213(local4, local9 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method213(local4, local9, 5120);
						this.method213(local4, local9 + 1, 16384);
						this.method213(local4 + 1, local9, 65536);
					}
					if (arg4 == 2) {
						this.method213(local4, local9, 20480);
						this.method213(local4 + 1, local9, 65536);
						this.method213(local4, local9 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method213(local4, local9, 81920);
						this.method213(local4, local9 - 1, 1024);
						this.method213(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("65499, " + arg0 + ", " + 78 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIZIII)V")
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(24) int local24 = arg4 - this.anInt331;
			@Pc(29) int local29 = arg0 - this.anInt332;
			@Pc(37) int local37;
			if (arg2 == 1 || arg2 == 3) {
				local37 = arg5;
				arg5 = arg1;
				arg1 = local37;
			}
			for (local37 = local24; local37 < local24 + arg5; local37++) {
				if (local37 >= 0 && local37 < this.anInt333) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg1; local53++) {
						if (local53 >= 0 && local53 < this.anInt334) {
							this.method213(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("79447, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -127 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(III)V")
	public void method212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt331;
			@Pc(14) int local14 = arg0 - this.anInt332;
			this.anIntArrayArray7[local4][local14] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("73413, " + -132 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "b", descriptor = "(III)V")
	private void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray7[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZIIII)V")
	public void method214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt331;
			@Pc(8) boolean local8 = false;
			@Pc(13) int local13 = arg3 - this.anInt332;
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method216(local4, 128, local13);
					this.method216(local4 - 1, 8, local13);
				}
				if (arg5 == 1) {
					this.method216(local4, 2, local13);
					this.method216(local4, 32, local13 + 1);
				}
				if (arg5 == 2) {
					this.method216(local4, 8, local13);
					this.method216(local4 + 1, 128, local13);
				}
				if (arg5 == 3) {
					this.method216(local4, 32, local13);
					this.method216(local4, 2, local13 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method216(local4, 1, local13);
					this.method216(local4 - 1, 16, local13 + 1);
				}
				if (arg5 == 1) {
					this.method216(local4, 4, local13);
					this.method216(local4 + 1, 64, local13 + 1);
				}
				if (arg5 == 2) {
					this.method216(local4, 16, local13);
					this.method216(local4 + 1, 1, local13 - 1);
				}
				if (arg5 == 3) {
					this.method216(local4, 64, local13);
					this.method216(local4 - 1, 4, local13 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method216(local4, 130, local13);
					this.method216(local4 - 1, 8, local13);
					this.method216(local4, 32, local13 + 1);
				}
				if (arg5 == 1) {
					this.method216(local4, 10, local13);
					this.method216(local4, 32, local13 + 1);
					this.method216(local4 + 1, 128, local13);
				}
				if (arg5 == 2) {
					this.method216(local4, 40, local13);
					this.method216(local4 + 1, 128, local13);
					this.method216(local4, 2, local13 - 1);
				}
				if (arg5 == 3) {
					this.method216(local4, 160, local13);
					this.method216(local4, 2, local13 - 1);
					this.method216(local4 - 1, 8, local13);
				}
			}
			if (arg1) {
				if (arg0 == 0) {
					if (arg5 == 0) {
						this.method216(local4, 65536, local13);
						this.method216(local4 - 1, 4096, local13);
					}
					if (arg5 == 1) {
						this.method216(local4, 1024, local13);
						this.method216(local4, 16384, local13 + 1);
					}
					if (arg5 == 2) {
						this.method216(local4, 4096, local13);
						this.method216(local4 + 1, 65536, local13);
					}
					if (arg5 == 3) {
						this.method216(local4, 16384, local13);
						this.method216(local4, 1024, local13 - 1);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg5 == 0) {
						this.method216(local4, 512, local13);
						this.method216(local4 - 1, 8192, local13 + 1);
					}
					if (arg5 == 1) {
						this.method216(local4, 2048, local13);
						this.method216(local4 + 1, 32768, local13 + 1);
					}
					if (arg5 == 2) {
						this.method216(local4, 8192, local13);
						this.method216(local4 + 1, 512, local13 - 1);
					}
					if (arg5 == 3) {
						this.method216(local4, 32768, local13);
						this.method216(local4 - 1, 2048, local13 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg5 == 0) {
						this.method216(local4, 66560, local13);
						this.method216(local4 - 1, 4096, local13);
						this.method216(local4, 16384, local13 + 1);
					}
					if (arg5 == 1) {
						this.method216(local4, 5120, local13);
						this.method216(local4, 16384, local13 + 1);
						this.method216(local4 + 1, 65536, local13);
					}
					if (arg5 == 2) {
						this.method216(local4, 20480, local13);
						this.method216(local4 + 1, 65536, local13);
						this.method216(local4, 1024, local13 - 1);
					}
					if (arg5 == 3) {
						this.method216(local4, 81920, local13);
						this.method216(local4, 1024, local13 - 1);
						this.method216(local4 - 1, 4096, local13);
						return;
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("88847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method215(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) int local6 = 256;
			if (arg0) {
				local6 = 131328;
			}
			@Pc(17) int local17 = arg4 - this.anInt331;
			@Pc(22) int local22 = arg3 - this.anInt332;
			@Pc(30) int local30;
			if (arg2 == 1 || arg2 == 3) {
				local30 = arg5;
				arg5 = arg1;
				arg1 = local30;
			}
			for (local30 = local17; local30 < local17 + arg5; local30++) {
				if (local30 >= 0 && local30 < this.anInt333) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg1; local46++) {
						if (local46 >= 0 && local46 < this.anInt334) {
							this.method216(local30, local6, local46);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("91652, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIB)V")
	private void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray7[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("78577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 108 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZI)V")
	public void method217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt331;
			@Pc(9) int local9 = arg0 - this.anInt332;
			this.anIntArrayArray7[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("69864, " + arg0 + ", " + true + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg1 && arg5 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt331;
			@Pc(17) int local17 = arg5 - this.anInt332;
			@Pc(22) int local22 = arg1 - this.anInt331;
			@Pc(27) int local27 = arg3 - this.anInt332;
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray7[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray7[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray7[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray7[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray7[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray7[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray7[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray7[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("83269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg0 && arg5 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt331;
			@Pc(17) int local17 = arg5 - this.anInt332;
			@Pc(28) int local28 = arg0 - this.anInt331;
			@Pc(33) int local33 = arg2 - this.anInt332;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("92008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KQTHKTBC", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg2 - 1;
			@Pc(11) int local11 = arg0 + arg3 - 1;
			if (arg1 >= arg6 && arg1 <= local5 && arg4 >= arg0 && arg4 <= local11) {
				return true;
			} else if (arg1 == arg6 - 1 && arg4 >= arg0 && arg4 <= local11 && (this.anIntArrayArray7[arg1 - this.anInt331][arg4 - this.anInt332] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg4 >= arg0 && arg4 <= local11 && (this.anIntArrayArray7[arg1 - this.anInt331][arg4 - this.anInt332] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg0 - 1 && arg1 >= arg6 && arg1 <= local5 && (this.anIntArrayArray7[arg1 - this.anInt331][arg4 - this.anInt332] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local11 + 1 && arg1 >= arg6 && arg1 <= local5 && (this.anIntArrayArray7[arg1 - this.anInt331][arg4 - this.anInt332] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("8016, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
