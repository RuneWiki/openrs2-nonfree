import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZGDLGUZR")
public final class Class50 {

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "b", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "c", descriptor = "I")
	private int anInt834 = -903;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "d", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "e", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "f", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "g", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "h", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ZGDLGUZR", name = "<init>", descriptor = "(III)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt835 = 0;
			this.anInt836 = 0;
			this.anInt837 = arg2;
			this.anInt838 = arg0;
			this.anIntArrayArray21 = new int[this.anInt837][this.anInt838];
			this.method564();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("51103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "()V")
	public void method564() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt837; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt838; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt837 - 1 || local7 == this.anInt838 - 1) {
					this.anIntArrayArray21[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray21[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(IZIIBI)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(15) int local15 = arg0 - this.anInt835;
			@Pc(20) int local20 = arg4 - this.anInt836;
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method568(local15, local20, 128);
					this.method568(local15 - 1, local20, 8);
				}
				if (arg2 == 1) {
					this.method568(local15, local20, 2);
					this.method568(local15, local20 + 1, 32);
				}
				if (arg2 == 2) {
					this.method568(local15, local20, 8);
					this.method568(local15 + 1, local20, 128);
				}
				if (arg2 == 3) {
					this.method568(local15, local20, 32);
					this.method568(local15, local20 - 1, 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method568(local15, local20, 1);
					this.method568(local15 - 1, local20 + 1, 16);
				}
				if (arg2 == 1) {
					this.method568(local15, local20, 4);
					this.method568(local15 + 1, local20 + 1, 64);
				}
				if (arg2 == 2) {
					this.method568(local15, local20, 16);
					this.method568(local15 + 1, local20 - 1, 1);
				}
				if (arg2 == 3) {
					this.method568(local15, local20, 64);
					this.method568(local15 - 1, local20 - 1, 4);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method568(local15, local20, 130);
					this.method568(local15 - 1, local20, 8);
					this.method568(local15, local20 + 1, 32);
				}
				if (arg2 == 1) {
					this.method568(local15, local20, 10);
					this.method568(local15, local20 + 1, 32);
					this.method568(local15 + 1, local20, 128);
				}
				if (arg2 == 2) {
					this.method568(local15, local20, 40);
					this.method568(local15 + 1, local20, 128);
					this.method568(local15, local20 - 1, 2);
				}
				if (arg2 == 3) {
					this.method568(local15, local20, 160);
					this.method568(local15, local20 - 1, 2);
					this.method568(local15 - 1, local20, 8);
				}
			}
			if (arg1) {
				if (arg3 == 0) {
					if (arg2 == 0) {
						this.method568(local15, local20, 65536);
						this.method568(local15 - 1, local20, 4096);
					}
					if (arg2 == 1) {
						this.method568(local15, local20, 1024);
						this.method568(local15, local20 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method568(local15, local20, 4096);
						this.method568(local15 + 1, local20, 65536);
					}
					if (arg2 == 3) {
						this.method568(local15, local20, 16384);
						this.method568(local15, local20 - 1, 1024);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg2 == 0) {
						this.method568(local15, local20, 512);
						this.method568(local15 - 1, local20 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method568(local15, local20, 2048);
						this.method568(local15 + 1, local20 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method568(local15, local20, 8192);
						this.method568(local15 + 1, local20 - 1, 512);
					}
					if (arg2 == 3) {
						this.method568(local15, local20, 32768);
						this.method568(local15 - 1, local20 - 1, 2048);
					}
				}
				if (arg3 == 2) {
					if (arg2 == 0) {
						this.method568(local15, local20, 66560);
						this.method568(local15 - 1, local20, 4096);
						this.method568(local15, local20 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method568(local15, local20, 5120);
						this.method568(local15, local20 + 1, 16384);
						this.method568(local15 + 1, local20, 65536);
					}
					if (arg2 == 2) {
						this.method568(local15, local20, 20480);
						this.method568(local15 + 1, local20, 65536);
						this.method568(local15, local20 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method568(local15, local20, 81920);
						this.method568(local15, local20 - 1, 1024);
						this.method568(local15 - 1, local20, 4096);
						return;
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("25149, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(ZIBIIII)V")
	public void method566(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18 = 256;
			if (arg0) {
				local18 = 131328;
			}
			@Pc(29) int local29 = arg6 - this.anInt835;
			@Pc(34) int local34 = arg5 - this.anInt836;
			@Pc(42) int local42;
			if (arg3 == 1 || arg3 == 3) {
				local42 = arg1;
				arg1 = arg4;
				arg4 = local42;
			}
			for (local42 = local29; local42 < local29 + arg1; local42++) {
				if (local42 >= 0 && local42 < this.anInt837) {
					for (@Pc(58) int local58 = local34; local58 < local34 + arg4; local58++) {
						if (local58 >= 0 && local58 < this.anInt838) {
							this.method568(local42, local58, local18);
						}
					}
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("16403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(III)V")
	public void method567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt835;
			@Pc(12) int local12 = arg1 - this.anInt836;
			this.anIntArrayArray21[local7][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9677, " + -135 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "b", descriptor = "(III)V")
	private void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray21[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(IIZBII)V")
	public void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(19) int local19 = arg4 - this.anInt835;
			@Pc(24) int local24 = arg0 - this.anInt836;
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method571(local19, local24, 128);
					this.method571(local19 - 1, local24, 8);
				}
				if (arg5 == 1) {
					this.method571(local19, local24, 2);
					this.method571(local19, local24 + 1, 32);
				}
				if (arg5 == 2) {
					this.method571(local19, local24, 8);
					this.method571(local19 + 1, local24, 128);
				}
				if (arg5 == 3) {
					this.method571(local19, local24, 32);
					this.method571(local19, local24 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method571(local19, local24, 1);
					this.method571(local19 - 1, local24 + 1, 16);
				}
				if (arg5 == 1) {
					this.method571(local19, local24, 4);
					this.method571(local19 + 1, local24 + 1, 64);
				}
				if (arg5 == 2) {
					this.method571(local19, local24, 16);
					this.method571(local19 + 1, local24 - 1, 1);
				}
				if (arg5 == 3) {
					this.method571(local19, local24, 64);
					this.method571(local19 - 1, local24 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method571(local19, local24, 130);
					this.method571(local19 - 1, local24, 8);
					this.method571(local19, local24 + 1, 32);
				}
				if (arg5 == 1) {
					this.method571(local19, local24, 10);
					this.method571(local19, local24 + 1, 32);
					this.method571(local19 + 1, local24, 128);
				}
				if (arg5 == 2) {
					this.method571(local19, local24, 40);
					this.method571(local19 + 1, local24, 128);
					this.method571(local19, local24 - 1, 2);
				}
				if (arg5 == 3) {
					this.method571(local19, local24, 160);
					this.method571(local19, local24 - 1, 2);
					this.method571(local19 - 1, local24, 8);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg5 == 0) {
						this.method571(local19, local24, 65536);
						this.method571(local19 - 1, local24, 4096);
					}
					if (arg5 == 1) {
						this.method571(local19, local24, 1024);
						this.method571(local19, local24 + 1, 16384);
					}
					if (arg5 == 2) {
						this.method571(local19, local24, 4096);
						this.method571(local19 + 1, local24, 65536);
					}
					if (arg5 == 3) {
						this.method571(local19, local24, 16384);
						this.method571(local19, local24 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg5 == 0) {
						this.method571(local19, local24, 512);
						this.method571(local19 - 1, local24 + 1, 8192);
					}
					if (arg5 == 1) {
						this.method571(local19, local24, 2048);
						this.method571(local19 + 1, local24 + 1, 32768);
					}
					if (arg5 == 2) {
						this.method571(local19, local24, 8192);
						this.method571(local19 + 1, local24 - 1, 512);
					}
					if (arg5 == 3) {
						this.method571(local19, local24, 32768);
						this.method571(local19 - 1, local24 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg5 == 0) {
						this.method571(local19, local24, 66560);
						this.method571(local19 - 1, local24, 4096);
						this.method571(local19, local24 + 1, 16384);
					}
					if (arg5 == 1) {
						this.method571(local19, local24, 5120);
						this.method571(local19, local24 + 1, 16384);
						this.method571(local19 + 1, local24, 65536);
					}
					if (arg5 == 2) {
						this.method571(local19, local24, 20480);
						this.method571(local19 + 1, local24, 65536);
						this.method571(local19, local24 - 1, 1024);
					}
					if (arg5 == 3) {
						this.method571(local19, local24, 81920);
						this.method571(local19, local24 - 1, 1024);
						this.method571(local19 - 1, local24, 4096);
						return;
					}
				}
			}
		} catch (@Pc(532) RuntimeException local532) {
			signlink.reporterror("15135, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local532.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(ZIIIIII)V")
	public void method570(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt835;
			@Pc(19) int local19 = arg5 - this.anInt836;
			@Pc(37) int local37;
			if (arg2 == 1 || arg2 == 3) {
				local37 = arg4;
				arg4 = arg1;
				arg1 = local37;
			}
			for (local37 = local14; local37 < local14 + arg4; local37++) {
				if (local37 >= 0 && local37 < this.anInt837) {
					for (@Pc(53) int local53 = local19; local53 < local19 + arg1; local53++) {
						if (local53 >= 0 && local53 < this.anInt838) {
							this.method571(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("536, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 886 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(IZII)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray21[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("81934, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "c", descriptor = "(III)V")
	public void method572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) int local14 = arg1 - this.anInt835;
			@Pc(19) int local19 = arg0 - this.anInt836;
			this.anIntArrayArray21[local14][local19] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("224, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg2 && arg5 == arg3) {
				return true;
			}
			@Pc(22) int local22 = arg4 - this.anInt835;
			@Pc(27) int local27 = arg5 - this.anInt836;
			@Pc(32) int local32 = arg2 - this.anInt835;
			@Pc(37) int local37 = arg3 - this.anInt836;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray21[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray21[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray21[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("72376, " + arg0 + ", " + -25144 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "b", descriptor = "(ZIIIIII)Z")
	public boolean method574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg0 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt835;
			@Pc(17) int local17 = arg4 - this.anInt836;
			@Pc(32) int local32 = arg0 - this.anInt835;
			@Pc(37) int local37 = arg1 - this.anInt836;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local32 && local17 == local37 + 1 && (this.anIntArrayArray21[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local17 == local37 - 1 && (this.anIntArrayArray21[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local17 == local37 && (this.anIntArrayArray21[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("52087, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGDLGUZR", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg5 + arg0 - 1;
			@Pc(16) int local16 = arg6 + arg2 - 1;
			if (arg3 >= arg5 && arg3 <= local10 && arg1 >= arg6 && arg1 <= local16) {
				return true;
			} else if (arg3 == arg5 - 1 && arg1 >= arg6 && arg1 <= local16 && (this.anIntArrayArray21[arg3 - this.anInt835][arg1 - this.anInt836] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg3 == local10 + 1 && arg1 >= arg6 && arg1 <= local16 && (this.anIntArrayArray21[arg3 - this.anInt835][arg1 - this.anInt836] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg6 - 1 && arg3 >= arg5 && arg3 <= local10 && (this.anIntArrayArray21[arg3 - this.anInt835][arg1 - this.anInt836] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local16 + 1 && arg3 >= arg5 && arg3 <= local10 && (this.anIntArrayArray21[arg3 - this.anInt835][arg1 - this.anInt836] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("53733, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
