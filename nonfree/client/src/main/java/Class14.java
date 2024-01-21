import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EXLGBZBR")
public final class Class14 {

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "I")
	private int anInt251 = 8754;

	@OriginalMember(owner = "client!EXLGBZBR", name = "b", descriptor = "B")
	private byte aByte9 = 8;

	@OriginalMember(owner = "client!EXLGBZBR", name = "c", descriptor = "I")
	private int anInt252 = -586;

	@OriginalMember(owner = "client!EXLGBZBR", name = "d", descriptor = "I")
	private int anInt253 = 1;

	@OriginalMember(owner = "client!EXLGBZBR", name = "e", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!EXLGBZBR", name = "f", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!EXLGBZBR", name = "g", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!EXLGBZBR", name = "h", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!EXLGBZBR", name = "i", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!EXLGBZBR", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!EXLGBZBR", name = "<init>", descriptor = "(III)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt254 = 0;
			this.anInt255 = 0;
			this.anInt256 = arg2;
			this.anInt257 = arg1;
			this.anIntArrayArray5 = new int[this.anInt256][this.anInt257];
			this.method152();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("99501, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "()V")
	public void method152() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt256; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt257; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt256 - 1 || local7 == this.anInt257 - 1) {
					this.anIntArrayArray5[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray5[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(ZIIZII)V")
	public void method153(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt254;
			@Pc(9) int local9 = arg1 - this.anInt255;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method156(local4, local9, 128);
					this.method156(local4 - 1, local9, 8);
				}
				if (arg2 == 1) {
					this.method156(local4, local9, 2);
					this.method156(local4, local9 + 1, 32);
				}
				if (arg2 == 2) {
					this.method156(local4, local9, 8);
					this.method156(local4 + 1, local9, 128);
				}
				if (arg2 == 3) {
					this.method156(local4, local9, 32);
					this.method156(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method156(local4, local9, 1);
					this.method156(local4 - 1, local9 + 1, 16);
				}
				if (arg2 == 1) {
					this.method156(local4, local9, 4);
					this.method156(local4 + 1, local9 + 1, 64);
				}
				if (arg2 == 2) {
					this.method156(local4, local9, 16);
					this.method156(local4 + 1, local9 - 1, 1);
				}
				if (arg2 == 3) {
					this.method156(local4, local9, 64);
					this.method156(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method156(local4, local9, 130);
					this.method156(local4 - 1, local9, 8);
					this.method156(local4, local9 + 1, 32);
				}
				if (arg2 == 1) {
					this.method156(local4, local9, 10);
					this.method156(local4, local9 + 1, 32);
					this.method156(local4 + 1, local9, 128);
				}
				if (arg2 == 2) {
					this.method156(local4, local9, 40);
					this.method156(local4 + 1, local9, 128);
					this.method156(local4, local9 - 1, 2);
				}
				if (arg2 == 3) {
					this.method156(local4, local9, 160);
					this.method156(local4, local9 - 1, 2);
					this.method156(local4 - 1, local9, 8);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method156(local4, local9, 65536);
						this.method156(local4 - 1, local9, 4096);
					}
					if (arg2 == 1) {
						this.method156(local4, local9, 1024);
						this.method156(local4, local9 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method156(local4, local9, 4096);
						this.method156(local4 + 1, local9, 65536);
					}
					if (arg2 == 3) {
						this.method156(local4, local9, 16384);
						this.method156(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method156(local4, local9, 512);
						this.method156(local4 - 1, local9 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method156(local4, local9, 2048);
						this.method156(local4 + 1, local9 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method156(local4, local9, 8192);
						this.method156(local4 + 1, local9 - 1, 512);
					}
					if (arg2 == 3) {
						this.method156(local4, local9, 32768);
						this.method156(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method156(local4, local9, 66560);
						this.method156(local4 - 1, local9, 4096);
						this.method156(local4, local9 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method156(local4, local9, 5120);
						this.method156(local4, local9 + 1, 16384);
						this.method156(local4 + 1, local9, 65536);
					}
					if (arg2 == 2) {
						this.method156(local4, local9, 20480);
						this.method156(local4 + 1, local9, 65536);
						this.method156(local4, local9 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method156(local4, local9, 81920);
						this.method156(local4, local9 - 1, 1024);
						this.method156(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("52905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIIIIBZ)V")
	public void method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt254;
			@Pc(30) int local30 = arg1 - this.anInt255;
			@Pc(38) int local38;
			if (arg2 == 1 || arg2 == 3) {
				local38 = arg4;
				arg4 = arg0;
				arg0 = local38;
			}
			for (local38 = local14; local38 < local14 + arg4; local38++) {
				if (local38 >= 0 && local38 < this.anInt256) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg0; local54++) {
						if (local54 >= 0 && local54 < this.anInt257) {
							this.method156(local38, local54, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("87636, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 7 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIB)V")
	public void method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(14) int local14 = arg0 - this.anInt254;
			@Pc(19) int local19 = arg1 - this.anInt255;
			this.anIntArrayArray5[local14][local19] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("18648, " + arg0 + ", " + arg1 + ", " + -28 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(III)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray5[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIZIII)V")
	public void method157(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = arg2 - this.anInt254;
			@Pc(13) int local13 = arg0 - this.anInt255;
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method159(local13, 128, local8);
					this.method159(local13, 8, local8 - 1);
				}
				if (arg4 == 1) {
					this.method159(local13, 2, local8);
					this.method159(local13 + 1, 32, local8);
				}
				if (arg4 == 2) {
					this.method159(local13, 8, local8);
					this.method159(local13, 128, local8 + 1);
				}
				if (arg4 == 3) {
					this.method159(local13, 32, local8);
					this.method159(local13 - 1, 2, local8);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method159(local13, 1, local8);
					this.method159(local13 + 1, 16, local8 - 1);
				}
				if (arg4 == 1) {
					this.method159(local13, 4, local8);
					this.method159(local13 + 1, 64, local8 + 1);
				}
				if (arg4 == 2) {
					this.method159(local13, 16, local8);
					this.method159(local13 - 1, 1, local8 + 1);
				}
				if (arg4 == 3) {
					this.method159(local13, 64, local8);
					this.method159(local13 - 1, 4, local8 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method159(local13, 130, local8);
					this.method159(local13, 8, local8 - 1);
					this.method159(local13 + 1, 32, local8);
				}
				if (arg4 == 1) {
					this.method159(local13, 10, local8);
					this.method159(local13 + 1, 32, local8);
					this.method159(local13, 128, local8 + 1);
				}
				if (arg4 == 2) {
					this.method159(local13, 40, local8);
					this.method159(local13, 128, local8 + 1);
					this.method159(local13 - 1, 2, local8);
				}
				if (arg4 == 3) {
					this.method159(local13, 160, local8);
					this.method159(local13 - 1, 2, local8);
					this.method159(local13, 8, local8 - 1);
				}
			}
			if (arg1) {
				if (arg3 == 0) {
					if (arg4 == 0) {
						this.method159(local13, 65536, local8);
						this.method159(local13, 4096, local8 - 1);
					}
					if (arg4 == 1) {
						this.method159(local13, 1024, local8);
						this.method159(local13 + 1, 16384, local8);
					}
					if (arg4 == 2) {
						this.method159(local13, 4096, local8);
						this.method159(local13, 65536, local8 + 1);
					}
					if (arg4 == 3) {
						this.method159(local13, 16384, local8);
						this.method159(local13 - 1, 1024, local8);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg4 == 0) {
						this.method159(local13, 512, local8);
						this.method159(local13 + 1, 8192, local8 - 1);
					}
					if (arg4 == 1) {
						this.method159(local13, 2048, local8);
						this.method159(local13 + 1, 32768, local8 + 1);
					}
					if (arg4 == 2) {
						this.method159(local13, 8192, local8);
						this.method159(local13 - 1, 512, local8 + 1);
					}
					if (arg4 == 3) {
						this.method159(local13, 32768, local8);
						this.method159(local13 - 1, 2048, local8 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg4 == 0) {
						this.method159(local13, 66560, local8);
						this.method159(local13, 4096, local8 - 1);
						this.method159(local13 + 1, 16384, local8);
					}
					if (arg4 == 1) {
						this.method159(local13, 5120, local8);
						this.method159(local13 + 1, 16384, local8);
						this.method159(local13, 65536, local8 + 1);
					}
					if (arg4 == 2) {
						this.method159(local13, 20480, local8);
						this.method159(local13, 65536, local8 + 1);
						this.method159(local13 - 1, 1024, local8);
					}
					if (arg4 == 3) {
						this.method159(local13, 81920, local8);
						this.method159(local13 - 1, 1024, local8);
						this.method159(local13, 4096, local8 - 1);
						return;
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("94528, " + arg0 + ", " + 5104 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(ZIIIIII)V")
	public void method158(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(8) int local8 = 256;
			if (arg0) {
				local8 = 131328;
			}
			@Pc(19) int local19 = arg3 - this.anInt254;
			@Pc(24) int local24 = arg5 - this.anInt255;
			@Pc(32) int local32;
			if (arg4 == 1 || arg4 == 3) {
				local32 = arg1;
				arg1 = arg2;
				arg2 = local32;
			}
			for (local32 = local19; local32 < local19 + arg1; local32++) {
				if (local32 >= 0 && local32 < this.anInt256) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg2; local48++) {
						if (local48 >= 0 && local48 < this.anInt257) {
							this.method159(local48, local8, local32);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("83216, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIBI)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray5[arg2][arg0] &= 16777215 - arg1;
			if (this.aByte9 != 8) {
				for (@Pc(17) int local17 = 1; local17 > 0; local17++) {
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("57137, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IBI)V")
	public void method160(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt254;
			@Pc(9) int local9 = arg0 - this.anInt255;
			this.anIntArrayArray5[local4][local9] &= 0xDFFFFF;
			@Pc(24) boolean local24 = false;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("82000, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg3 && arg0 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt254;
			@Pc(17) int local17 = arg0 - this.anInt255;
			@Pc(27) int local27 = arg3 - this.anInt254;
			@Pc(32) int local32 = arg1 - this.anInt255;
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (local12 == local27 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray5[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray5[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local27 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local27 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray5[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray5[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local27 && local17 == local32 - 1) {
						return true;
					}
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					if (local12 == local27 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray5[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray5[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray5[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local27 - 1 && local17 == local32) {
						return true;
					}
					if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray5[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local27 && local17 == local32 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local12 == local27 && local17 == local32 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local27 && local17 == local32 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local27 - 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local27 + 1 && local17 == local32 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(565) RuntimeException local565) {
			signlink.reporterror("37073, " + 835 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local565.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg4 && arg3 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt254;
			@Pc(17) int local17 = arg3 - this.anInt255;
			@Pc(30) int local30 = arg4 - this.anInt254;
			@Pc(35) int local35 = arg0 - this.anInt255;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local30 && local17 == local35 + 1 && (this.anIntArrayArray5[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local30 && local17 == local35 - 1 && (this.anIntArrayArray5[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local30 - 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local30 + 1 && local17 == local35 && (this.anIntArrayArray5[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("42362, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -239 + ", " + arg5 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EXLGBZBR", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(9) int local9 = arg2 + arg5 - 1;
			@Pc(15) int local15 = arg7 + arg0 - 1;
			if (arg4 >= arg2 && arg4 <= local9 && arg6 >= arg7 && arg6 <= local15) {
				return true;
			} else if (arg4 == arg2 - 1 && arg6 >= arg7 && arg6 <= local15 && (this.anIntArrayArray5[arg4 - this.anInt254][arg6 - this.anInt255] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg4 == local9 + 1 && arg6 >= arg7 && arg6 <= local15 && (this.anIntArrayArray5[arg4 - this.anInt254][arg6 - this.anInt255] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg7 - 1 && arg4 >= arg2 && arg4 <= local9 && (this.anIntArrayArray5[arg4 - this.anInt254][arg6 - this.anInt255] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local15 + 1 && arg4 >= arg2 && arg4 <= local9 && (this.anIntArrayArray5[arg4 - this.anInt254][arg6 - this.anInt255] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("59613, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
