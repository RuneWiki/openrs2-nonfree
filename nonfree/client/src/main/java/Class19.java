import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt695 = 362;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "B")
	private byte aByte43 = 97;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "B")
	private byte aByte44 = 6;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "B")
	private byte aByte45 = 2;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt696 = 997;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt697 = 636;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt698 = -484;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt699 = 0;
			this.anInt700 = 0;
			this.anInt701 = arg0;
			this.anInt702 = arg2;
			this.anIntArrayArray18 = new int[this.anInt701][this.anInt702];
			this.method420();
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("38576, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method420() {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = 0; local3 < this.anInt701; local3++) {
				for (local7 = 0; local7 < this.anInt702; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt701 - 1 || local7 == this.anInt702 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
			if (this.aByte43 != 97) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("41020, " + 97 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIZ)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt699;
			@Pc(14) int local14 = arg4 - this.anInt700;
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method424(local4, local14, 128);
					this.method424(local4 - 1, local14, 8);
				}
				if (arg2 == 1) {
					this.method424(local4, local14, 2);
					this.method424(local4, local14 + 1, 32);
				}
				if (arg2 == 2) {
					this.method424(local4, local14, 8);
					this.method424(local4 + 1, local14, 128);
				}
				if (arg2 == 3) {
					this.method424(local4, local14, 32);
					this.method424(local4, local14 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method424(local4, local14, 1);
					this.method424(local4 - 1, local14 + 1, 16);
				}
				if (arg2 == 1) {
					this.method424(local4, local14, 4);
					this.method424(local4 + 1, local14 + 1, 64);
				}
				if (arg2 == 2) {
					this.method424(local4, local14, 16);
					this.method424(local4 + 1, local14 - 1, 1);
				}
				if (arg2 == 3) {
					this.method424(local4, local14, 64);
					this.method424(local4 - 1, local14 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method424(local4, local14, 130);
					this.method424(local4 - 1, local14, 8);
					this.method424(local4, local14 + 1, 32);
				}
				if (arg2 == 1) {
					this.method424(local4, local14, 10);
					this.method424(local4, local14 + 1, 32);
					this.method424(local4 + 1, local14, 128);
				}
				if (arg2 == 2) {
					this.method424(local4, local14, 40);
					this.method424(local4 + 1, local14, 128);
					this.method424(local4, local14 - 1, 2);
				}
				if (arg2 == 3) {
					this.method424(local4, local14, 160);
					this.method424(local4, local14 - 1, 2);
					this.method424(local4 - 1, local14, 8);
				}
			}
			if (arg1) {
				if (arg3 == 0) {
					if (arg2 == 0) {
						this.method424(local4, local14, 65536);
						this.method424(local4 - 1, local14, 4096);
					}
					if (arg2 == 1) {
						this.method424(local4, local14, 1024);
						this.method424(local4, local14 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method424(local4, local14, 4096);
						this.method424(local4 + 1, local14, 65536);
					}
					if (arg2 == 3) {
						this.method424(local4, local14, 16384);
						this.method424(local4, local14 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg2 == 0) {
						this.method424(local4, local14, 512);
						this.method424(local4 - 1, local14 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method424(local4, local14, 2048);
						this.method424(local4 + 1, local14 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method424(local4, local14, 8192);
						this.method424(local4 + 1, local14 - 1, 512);
					}
					if (arg2 == 3) {
						this.method424(local4, local14, 32768);
						this.method424(local4 - 1, local14 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg2 == 0) {
						this.method424(local4, local14, 66560);
						this.method424(local4 - 1, local14, 4096);
						this.method424(local4, local14 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method424(local4, local14, 5120);
						this.method424(local4, local14 + 1, 16384);
						this.method424(local4 + 1, local14, 65536);
					}
					if (arg2 == 2) {
						this.method424(local4, local14, 20480);
						this.method424(local4 + 1, local14, 65536);
						this.method424(local4, local14 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method424(local4, local14, 81920);
						this.method424(local4, local14 - 1, 1024);
						this.method424(local4 - 1, local14, 4096);
						return;
					}
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("88068, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZBIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg6 - this.anInt699;
			if (arg3 == this.aByte44) {
				@Pc(20) boolean local20 = false;
			} else {
				this.anInt698 = -360;
			}
			@Pc(30) int local30 = arg0 - this.anInt700;
			@Pc(38) int local38;
			if (arg5 == 1 || arg5 == 3) {
				local38 = arg1;
				arg1 = arg4;
				arg4 = local38;
			}
			for (local38 = local14; local38 < local14 + arg1; local38++) {
				if (local38 >= 0 && local38 < this.anInt701) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg4; local54++) {
						if (local54 >= 0 && local54 < this.anInt702) {
							this.method424(local38, local54, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("54240, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt699;
			@Pc(13) int local13 = arg0 - this.anInt700;
			this.anIntArrayArray18[local4][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("43541, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIZII)V")
	public void method425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(19) int local19 = arg0 - this.anInt699;
			@Pc(24) int local24 = arg1 - this.anInt700;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method427(128, local19, local24);
					this.method427(8, local19 - 1, local24);
				}
				if (arg3 == 1) {
					this.method427(2, local19, local24);
					this.method427(32, local19, local24 + 1);
				}
				if (arg3 == 2) {
					this.method427(8, local19, local24);
					this.method427(128, local19 + 1, local24);
				}
				if (arg3 == 3) {
					this.method427(32, local19, local24);
					this.method427(2, local19, local24 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method427(1, local19, local24);
					this.method427(16, local19 - 1, local24 + 1);
				}
				if (arg3 == 1) {
					this.method427(4, local19, local24);
					this.method427(64, local19 + 1, local24 + 1);
				}
				if (arg3 == 2) {
					this.method427(16, local19, local24);
					this.method427(1, local19 + 1, local24 - 1);
				}
				if (arg3 == 3) {
					this.method427(64, local19, local24);
					this.method427(4, local19 - 1, local24 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method427(130, local19, local24);
					this.method427(8, local19 - 1, local24);
					this.method427(32, local19, local24 + 1);
				}
				if (arg3 == 1) {
					this.method427(10, local19, local24);
					this.method427(32, local19, local24 + 1);
					this.method427(128, local19 + 1, local24);
				}
				if (arg3 == 2) {
					this.method427(40, local19, local24);
					this.method427(128, local19 + 1, local24);
					this.method427(2, local19, local24 - 1);
				}
				if (arg3 == 3) {
					this.method427(160, local19, local24);
					this.method427(2, local19, local24 - 1);
					this.method427(8, local19 - 1, local24);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method427(65536, local19, local24);
						this.method427(4096, local19 - 1, local24);
					}
					if (arg3 == 1) {
						this.method427(1024, local19, local24);
						this.method427(16384, local19, local24 + 1);
					}
					if (arg3 == 2) {
						this.method427(4096, local19, local24);
						this.method427(65536, local19 + 1, local24);
					}
					if (arg3 == 3) {
						this.method427(16384, local19, local24);
						this.method427(1024, local19, local24 - 1);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method427(512, local19, local24);
						this.method427(8192, local19 - 1, local24 + 1);
					}
					if (arg3 == 1) {
						this.method427(2048, local19, local24);
						this.method427(32768, local19 + 1, local24 + 1);
					}
					if (arg3 == 2) {
						this.method427(8192, local19, local24);
						this.method427(512, local19 + 1, local24 - 1);
					}
					if (arg3 == 3) {
						this.method427(32768, local19, local24);
						this.method427(2048, local19 - 1, local24 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method427(66560, local19, local24);
						this.method427(4096, local19 - 1, local24);
						this.method427(16384, local19, local24 + 1);
					}
					if (arg3 == 1) {
						this.method427(5120, local19, local24);
						this.method427(16384, local19, local24 + 1);
						this.method427(65536, local19 + 1, local24);
					}
					if (arg3 == 2) {
						this.method427(20480, local19, local24);
						this.method427(65536, local19 + 1, local24);
						this.method427(1024, local19, local24 - 1);
					}
					if (arg3 == 3) {
						this.method427(81920, local19, local24);
						this.method427(1024, local19, local24 - 1);
						this.method427(4096, local19 - 1, local24);
						return;
					}
				}
			}
		} catch (@Pc(532) RuntimeException local532) {
			signlink.reporterror("12622, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local532.toString());
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
			@Pc(14) int local14 = arg1 - this.anInt699;
			@Pc(19) int local19 = arg4 - this.anInt700;
			@Pc(27) int local27;
			if (arg5 == 1 || arg5 == 3) {
				local27 = arg3;
				arg3 = arg2;
				arg2 = local27;
			}
			for (local27 = local14; local27 < local14 + arg3; local27++) {
				if (local27 >= 0 && local27 < this.anInt701) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg2; local43++) {
						if (local43 >= 0 && local43 < this.anInt702) {
							this.method427(local3, local27, local43);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("72650, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 997 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray18[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("14231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt699;
			@Pc(9) int local9 = arg1 - this.anInt700;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("91952, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg5 && arg2 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt699;
			@Pc(26) int local26 = arg2 - this.anInt700;
			@Pc(31) int local31 = arg5 - this.anInt699;
			@Pc(36) int local36 = arg4 - this.anInt700;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local12 == local31 - 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray18[local12][local26] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray18[local12][local26] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local31 && local26 == local36 + 1) {
						return true;
					}
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local31 + 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray18[local12][local26] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray18[local12][local26] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local31 && local26 == local36 - 1) {
						return true;
					}
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local12 == local31 - 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray18[local12][local26] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray18[local12][local26] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray18[local12][local26] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local31 - 1 && local26 == local36) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray18[local12][local26] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray18[local12][local26] & 0x20) == 0) {
					return true;
				}
				if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray18[local12][local26] & 0x2) == 0) {
					return true;
				}
				if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x8) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray18[local12][local26] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("60249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg5 && arg2 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt699;
			@Pc(23) int local23 = arg2 - this.anInt700;
			@Pc(28) int local28 = arg5 - this.anInt699;
			@Pc(33) int local33 = arg3 - this.anInt700;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
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
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("47810, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg3 + arg6 - 1;
			@Pc(11) int local11 = arg4 + arg5 - 1;
			@Pc(15) boolean local15 = false;
			if (arg1 >= arg3 && arg1 <= local5 && arg7 >= arg4 && arg7 <= local11) {
				return true;
			} else if (arg1 == arg3 - 1 && arg7 >= arg4 && arg7 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt699][arg7 - this.anInt700] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg7 >= arg4 && arg7 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt699][arg7 - this.anInt700] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg7 == arg4 - 1 && arg1 >= arg3 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt699][arg7 - this.anInt700] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg7 == local11 + 1 && arg1 >= arg3 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt699][arg7 - this.anInt700] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("7793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
