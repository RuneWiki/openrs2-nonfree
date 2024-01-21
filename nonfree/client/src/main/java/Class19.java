import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt686 = 7;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt690;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIZ)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt687 = 0;
			this.anInt688 = 0;
			this.anInt689 = arg0;
			this.anInt690 = arg1;
			this.anIntArrayArray17 = new int[this.anInt689][this.anInt690];
			this.method414();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("65854, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method414() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt689; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt690; local14++) {
					if (local10 == 0 || local14 == 0 || local10 == this.anInt689 - 1 || local14 == this.anInt690 - 1) {
						this.anIntArrayArray17[local10][local14] = 16777215;
					} else {
						this.anIntArrayArray17[local10][local14] = 0;
					}
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("60098, " + 6 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIZI)V")
	public void method415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt687;
			@Pc(18) int local18 = arg0 - this.anInt688;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method418(local4, local18, 128);
					this.method418(local4 - 1, local18, 8);
				}
				if (arg4 == 1) {
					this.method418(local4, local18, 2);
					this.method418(local4, local18 + 1, 32);
				}
				if (arg4 == 2) {
					this.method418(local4, local18, 8);
					this.method418(local4 + 1, local18, 128);
				}
				if (arg4 == 3) {
					this.method418(local4, local18, 32);
					this.method418(local4, local18 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method418(local4, local18, 1);
					this.method418(local4 - 1, local18 + 1, 16);
				}
				if (arg4 == 1) {
					this.method418(local4, local18, 4);
					this.method418(local4 + 1, local18 + 1, 64);
				}
				if (arg4 == 2) {
					this.method418(local4, local18, 16);
					this.method418(local4 + 1, local18 - 1, 1);
				}
				if (arg4 == 3) {
					this.method418(local4, local18, 64);
					this.method418(local4 - 1, local18 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method418(local4, local18, 130);
					this.method418(local4 - 1, local18, 8);
					this.method418(local4, local18 + 1, 32);
				}
				if (arg4 == 1) {
					this.method418(local4, local18, 10);
					this.method418(local4, local18 + 1, 32);
					this.method418(local4 + 1, local18, 128);
				}
				if (arg4 == 2) {
					this.method418(local4, local18, 40);
					this.method418(local4 + 1, local18, 128);
					this.method418(local4, local18 - 1, 2);
				}
				if (arg4 == 3) {
					this.method418(local4, local18, 160);
					this.method418(local4, local18 - 1, 2);
					this.method418(local4 - 1, local18, 8);
				}
			}
			if (arg3) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method418(local4, local18, 65536);
						this.method418(local4 - 1, local18, 4096);
					}
					if (arg4 == 1) {
						this.method418(local4, local18, 1024);
						this.method418(local4, local18 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method418(local4, local18, 4096);
						this.method418(local4 + 1, local18, 65536);
					}
					if (arg4 == 3) {
						this.method418(local4, local18, 16384);
						this.method418(local4, local18 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method418(local4, local18, 512);
						this.method418(local4 - 1, local18 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method418(local4, local18, 2048);
						this.method418(local4 + 1, local18 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method418(local4, local18, 8192);
						this.method418(local4 + 1, local18 - 1, 512);
					}
					if (arg4 == 3) {
						this.method418(local4, local18, 32768);
						this.method418(local4 - 1, local18 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method418(local4, local18, 66560);
						this.method418(local4 - 1, local18, 4096);
						this.method418(local4, local18 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method418(local4, local18, 5120);
						this.method418(local4, local18 + 1, 16384);
						this.method418(local4 + 1, local18, 65536);
					}
					if (arg4 == 2) {
						this.method418(local4, local18, 20480);
						this.method418(local4 + 1, local18, 65536);
						this.method418(local4, local18 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method418(local4, local18, 81920);
						this.method418(local4, local18 - 1, 1024);
						this.method418(local4 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("20987, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZII)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt687;
			@Pc(19) int local19 = arg2 - this.anInt688;
			@Pc(27) int local27;
			if (arg0 == 1 || arg0 == 3) {
				local27 = arg5;
				arg5 = arg3;
				arg3 = local27;
			}
			for (local27 = local14; local27 < local14 + arg5; local27++) {
				if (local27 >= 0 && local27 < this.anInt689) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg3; local43++) {
						if (local43 >= 0 && local43 < this.anInt690) {
							this.method418(local27, local43, local3);
						}
					}
				}
			}
			if (arg6 != 0) {
				this.aBoolean166 = !this.aBoolean166;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("99146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V")
	public void method417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt687;
			@Pc(9) int local9 = arg0 - this.anInt688;
			this.anIntArrayArray17[local4][local9] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("63493, " + false + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
	public void method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = arg0 - this.anInt687;
			@Pc(13) int local13 = arg1 - this.anInt688;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method421(local13, local8, 128);
					this.method421(local13, local8 - 1, 8);
				}
				if (arg4 == 1) {
					this.method421(local13, local8, 2);
					this.method421(local13 + 1, local8, 32);
				}
				if (arg4 == 2) {
					this.method421(local13, local8, 8);
					this.method421(local13, local8 + 1, 128);
				}
				if (arg4 == 3) {
					this.method421(local13, local8, 32);
					this.method421(local13 - 1, local8, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method421(local13, local8, 1);
					this.method421(local13 + 1, local8 - 1, 16);
				}
				if (arg4 == 1) {
					this.method421(local13, local8, 4);
					this.method421(local13 + 1, local8 + 1, 64);
				}
				if (arg4 == 2) {
					this.method421(local13, local8, 16);
					this.method421(local13 - 1, local8 + 1, 1);
				}
				if (arg4 == 3) {
					this.method421(local13, local8, 64);
					this.method421(local13 - 1, local8 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method421(local13, local8, 130);
					this.method421(local13, local8 - 1, 8);
					this.method421(local13 + 1, local8, 32);
				}
				if (arg4 == 1) {
					this.method421(local13, local8, 10);
					this.method421(local13 + 1, local8, 32);
					this.method421(local13, local8 + 1, 128);
				}
				if (arg4 == 2) {
					this.method421(local13, local8, 40);
					this.method421(local13, local8 + 1, 128);
					this.method421(local13 - 1, local8, 2);
				}
				if (arg4 == 3) {
					this.method421(local13, local8, 160);
					this.method421(local13 - 1, local8, 2);
					this.method421(local13, local8 - 1, 8);
				}
			}
			if (arg3) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method421(local13, local8, 65536);
						this.method421(local13, local8 - 1, 4096);
					}
					if (arg4 == 1) {
						this.method421(local13, local8, 1024);
						this.method421(local13 + 1, local8, 16384);
					}
					if (arg4 == 2) {
						this.method421(local13, local8, 4096);
						this.method421(local13, local8 + 1, 65536);
					}
					if (arg4 == 3) {
						this.method421(local13, local8, 16384);
						this.method421(local13 - 1, local8, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method421(local13, local8, 512);
						this.method421(local13 + 1, local8 - 1, 8192);
					}
					if (arg4 == 1) {
						this.method421(local13, local8, 2048);
						this.method421(local13 + 1, local8 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method421(local13, local8, 8192);
						this.method421(local13 - 1, local8 + 1, 512);
					}
					if (arg4 == 3) {
						this.method421(local13, local8, 32768);
						this.method421(local13 - 1, local8 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method421(local13, local8, 66560);
						this.method421(local13, local8 - 1, 4096);
						this.method421(local13 + 1, local8, 16384);
					}
					if (arg4 == 1) {
						this.method421(local13, local8, 5120);
						this.method421(local13 + 1, local8, 16384);
						this.method421(local13, local8 + 1, 65536);
					}
					if (arg4 == 2) {
						this.method421(local13, local8, 20480);
						this.method421(local13, local8 + 1, 65536);
						this.method421(local13 - 1, local8, 1024);
					}
					if (arg4 == 3) {
						this.method421(local13, local8, 81920);
						this.method421(local13 - 1, local8, 1024);
						this.method421(local13, local8 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("42318, " + 29274 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIZ)V")
	public void method420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt687;
			@Pc(19) int local19 = arg0 - this.anInt688;
			@Pc(37) int local37;
			if (arg4 == 1 || arg4 == 3) {
				local37 = arg1;
				arg1 = arg3;
				arg3 = local37;
			}
			for (local37 = local14; local37 < local14 + arg1; local37++) {
				if (local37 >= 0 && local37 < this.anInt689) {
					for (@Pc(53) int local53 = local19; local53 < local19 + arg3; local53++) {
						if (local53 >= 0 && local53 < this.anInt690) {
							this.method421(local53, local37, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("7092, " + 18910 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBI)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray17[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("42254, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt687;
			@Pc(9) int local9 = arg1 - this.anInt688;
			this.anIntArrayArray17[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("70804, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1 == arg0 && arg5 == arg4) {
				return true;
			}
			@Pc(22) int local22 = arg1 - this.anInt687;
			@Pc(27) int local27 = arg5 - this.anInt688;
			@Pc(32) int local32 = arg0 - this.anInt687;
			@Pc(37) int local37 = arg4 - this.anInt688;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("24021, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 == arg0 && arg5 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt687;
			@Pc(17) int local17 = arg5 - this.anInt688;
			@Pc(22) int local22 = arg0 - this.anInt687;
			@Pc(36) int local36 = arg2 - this.anInt688;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("78125, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 326 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(9) int local9 = arg7 + arg6 - 1;
			@Pc(15) int local15 = arg0 + arg2 - 1;
			if (arg4 >= arg7 && arg4 <= local9 && arg3 >= arg0 && arg3 <= local15) {
				return true;
			} else if (arg4 == arg7 - 1 && arg3 >= arg0 && arg3 <= local15 && (this.anIntArrayArray17[arg4 - this.anInt687][arg3 - this.anInt688] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg4 == local9 + 1 && arg3 >= arg0 && arg3 <= local15 && (this.anIntArrayArray17[arg4 - this.anInt687][arg3 - this.anInt688] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg0 - 1 && arg4 >= arg7 && arg4 <= local9 && (this.anIntArrayArray17[arg4 - this.anInt687][arg3 - this.anInt688] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local15 + 1 && arg4 >= arg7 && arg4 <= local9 && (this.anIntArrayArray17[arg4 - this.anInt687][arg3 - this.anInt688] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("2843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
