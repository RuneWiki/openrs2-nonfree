import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt41 = -40161;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	private int anInt42 = 647;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	private int anInt43;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private int anInt44;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	private int anInt45;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(III)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(19) int local19 = 97 / arg1;
			this.anInt43 = 0;
			this.anInt44 = 0;
			this.anInt45 = arg0;
			this.anInt46 = arg2;
			this.anIntArrayArray1 = new int[this.anInt45][this.anInt46];
			this.method24();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("8808, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method24() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt45; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt46; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt45 - 1 || local7 == this.anInt46 - 1) {
						this.anIntArrayArray1[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray1[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("75367, " + 5 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIZ)V")
	public void method25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg3 - this.anInt43;
			@Pc(13) int local13 = arg1 - this.anInt44;
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method28(local8, local13, 128);
					this.method28(local8 - 1, local13, 8);
				}
				if (arg2 == 1) {
					this.method28(local8, local13, 2);
					this.method28(local8, local13 + 1, 32);
				}
				if (arg2 == 2) {
					this.method28(local8, local13, 8);
					this.method28(local8 + 1, local13, 128);
				}
				if (arg2 == 3) {
					this.method28(local8, local13, 32);
					this.method28(local8, local13 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method28(local8, local13, 1);
					this.method28(local8 - 1, local13 + 1, 16);
				}
				if (arg2 == 1) {
					this.method28(local8, local13, 4);
					this.method28(local8 + 1, local13 + 1, 64);
				}
				if (arg2 == 2) {
					this.method28(local8, local13, 16);
					this.method28(local8 + 1, local13 - 1, 1);
				}
				if (arg2 == 3) {
					this.method28(local8, local13, 64);
					this.method28(local8 - 1, local13 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method28(local8, local13, 130);
					this.method28(local8 - 1, local13, 8);
					this.method28(local8, local13 + 1, 32);
				}
				if (arg2 == 1) {
					this.method28(local8, local13, 10);
					this.method28(local8, local13 + 1, 32);
					this.method28(local8 + 1, local13, 128);
				}
				if (arg2 == 2) {
					this.method28(local8, local13, 40);
					this.method28(local8 + 1, local13, 128);
					this.method28(local8, local13 - 1, 2);
				}
				if (arg2 == 3) {
					this.method28(local8, local13, 160);
					this.method28(local8, local13 - 1, 2);
					this.method28(local8 - 1, local13, 8);
				}
			}
			if (arg5) {
				if (arg0 == 0) {
					if (arg2 == 0) {
						this.method28(local8, local13, 65536);
						this.method28(local8 - 1, local13, 4096);
					}
					if (arg2 == 1) {
						this.method28(local8, local13, 1024);
						this.method28(local8, local13 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method28(local8, local13, 4096);
						this.method28(local8 + 1, local13, 65536);
					}
					if (arg2 == 3) {
						this.method28(local8, local13, 16384);
						this.method28(local8, local13 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg2 == 0) {
						this.method28(local8, local13, 512);
						this.method28(local8 - 1, local13 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method28(local8, local13, 2048);
						this.method28(local8 + 1, local13 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method28(local8, local13, 8192);
						this.method28(local8 + 1, local13 - 1, 512);
					}
					if (arg2 == 3) {
						this.method28(local8, local13, 32768);
						this.method28(local8 - 1, local13 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg2 == 0) {
						this.method28(local8, local13, 66560);
						this.method28(local8 - 1, local13, 4096);
						this.method28(local8, local13 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method28(local8, local13, 5120);
						this.method28(local8, local13 + 1, 16384);
						this.method28(local8 + 1, local13, 65536);
					}
					if (arg2 == 2) {
						this.method28(local8, local13, 20480);
						this.method28(local8 + 1, local13, 65536);
						this.method28(local8, local13 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method28(local8, local13, 81920);
						this.method28(local8, local13 - 1, 1024);
						this.method28(local8 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("30519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZIIII)V")
	public void method26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt43;
			@Pc(19) int local19 = arg4 - this.anInt44;
			@Pc(27) int local27;
			if (arg5 == 1 || arg5 == 3) {
				local27 = arg3;
				arg3 = arg1;
				arg1 = local27;
			}
			for (local27 = local14; local27 < local14 + arg3; local27++) {
				if (local27 >= 0 && local27 < this.anInt45) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg1; local43++) {
						if (local43 >= 0 && local43 < this.anInt46) {
							this.method28(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("10286, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -532 + ", " + arg4 + ", " + arg5 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public void method27(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt43;
			@Pc(9) int local9 = arg0 - this.anInt44;
			this.anIntArrayArray1[local4][local9] |= 0x200000;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("59036, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
	private void method28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIZII)V")
	public void method29(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt43;
			@Pc(12) int local12 = arg3 - this.anInt44;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method31(local7, local12, 128);
					this.method31(local7 - 1, local12, 8);
				}
				if (arg1 == 1) {
					this.method31(local7, local12, 2);
					this.method31(local7, local12 + 1, 32);
				}
				if (arg1 == 2) {
					this.method31(local7, local12, 8);
					this.method31(local7 + 1, local12, 128);
				}
				if (arg1 == 3) {
					this.method31(local7, local12, 32);
					this.method31(local7, local12 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method31(local7, local12, 1);
					this.method31(local7 - 1, local12 + 1, 16);
				}
				if (arg1 == 1) {
					this.method31(local7, local12, 4);
					this.method31(local7 + 1, local12 + 1, 64);
				}
				if (arg1 == 2) {
					this.method31(local7, local12, 16);
					this.method31(local7 + 1, local12 - 1, 1);
				}
				if (arg1 == 3) {
					this.method31(local7, local12, 64);
					this.method31(local7 - 1, local12 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method31(local7, local12, 130);
					this.method31(local7 - 1, local12, 8);
					this.method31(local7, local12 + 1, 32);
				}
				if (arg1 == 1) {
					this.method31(local7, local12, 10);
					this.method31(local7, local12 + 1, 32);
					this.method31(local7 + 1, local12, 128);
				}
				if (arg1 == 2) {
					this.method31(local7, local12, 40);
					this.method31(local7 + 1, local12, 128);
					this.method31(local7, local12 - 1, 2);
				}
				if (arg1 == 3) {
					this.method31(local7, local12, 160);
					this.method31(local7, local12 - 1, 2);
					this.method31(local7 - 1, local12, 8);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method31(local7, local12, 65536);
						this.method31(local7 - 1, local12, 4096);
					}
					if (arg1 == 1) {
						this.method31(local7, local12, 1024);
						this.method31(local7, local12 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method31(local7, local12, 4096);
						this.method31(local7 + 1, local12, 65536);
					}
					if (arg1 == 3) {
						this.method31(local7, local12, 16384);
						this.method31(local7, local12 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method31(local7, local12, 512);
						this.method31(local7 - 1, local12 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method31(local7, local12, 2048);
						this.method31(local7 + 1, local12 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method31(local7, local12, 8192);
						this.method31(local7 + 1, local12 - 1, 512);
					}
					if (arg1 == 3) {
						this.method31(local7, local12, 32768);
						this.method31(local7 - 1, local12 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method31(local7, local12, 66560);
						this.method31(local7 - 1, local12, 4096);
						this.method31(local7, local12 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method31(local7, local12, 5120);
						this.method31(local7, local12 + 1, 16384);
						this.method31(local7 + 1, local12, 65536);
					}
					if (arg1 == 2) {
						this.method31(local7, local12, 20480);
						this.method31(local7 + 1, local12, 65536);
						this.method31(local7, local12 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method31(local7, local12, 81920);
						this.method31(local7, local12 - 1, 1024);
						this.method31(local7 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("78863, " + 918 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZIIIZ)V")
	public void method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt43;
			@Pc(29) int local29 = arg0 - this.anInt44;
			@Pc(37) int local37;
			if (arg4 == 1 || arg4 == 3) {
				local37 = arg3;
				arg3 = arg1;
				arg1 = local37;
			}
			for (local37 = local14; local37 < local14 + arg3; local37++) {
				if (local37 >= 0 && local37 < this.anInt45) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg1; local53++) {
						if (local53 >= 0 && local53 < this.anInt46) {
							this.method31(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("74594, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBII)V")
	private void method31(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray1[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("78451, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
	public void method32(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt43;
			@Pc(12) int local12 = arg1 - this.anInt44;
			this.anIntArrayArray1[local4][local12] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("75346, " + 99 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg4 && arg0 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt43;
			@Pc(27) int local27 = arg0 - this.anInt44;
			@Pc(32) int local32 = arg4 - this.anInt43;
			@Pc(37) int local37 = arg3 - this.anInt44;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("46423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 7 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg0 && arg1 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt43;
			@Pc(24) int local24 = arg1 - this.anInt44;
			@Pc(29) int local29 = arg0 - this.anInt43;
			@Pc(34) int local34 = arg4 - this.anInt44;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
					return true;
				}
				if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
					return true;
				}
				if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
					return true;
				}
				if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("9028, " + arg0 + ", " + arg1 + ", " + -14 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg5 + arg2 - 1;
			@Pc(11) int local11 = arg3 + arg4 - 1;
			@Pc(15) int local15 = 43 / arg1;
			if (arg6 >= arg5 && arg6 <= local5 && arg7 >= arg3 && arg7 <= local11) {
				return true;
			} else if (arg6 == arg5 - 1 && arg7 >= arg3 && arg7 <= local11 && (this.anIntArrayArray1[arg6 - this.anInt43][arg7 - this.anInt44] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg7 >= arg3 && arg7 <= local11 && (this.anIntArrayArray1[arg6 - this.anInt43][arg7 - this.anInt44] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg7 == arg3 - 1 && arg6 >= arg5 && arg6 <= local5 && (this.anIntArrayArray1[arg6 - this.anInt43][arg7 - this.anInt44] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg7 == local11 + 1 && arg6 >= arg5 && arg6 <= local5 && (this.anIntArrayArray1[arg6 - this.anInt43][arg7 - this.anInt44] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("24980, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
