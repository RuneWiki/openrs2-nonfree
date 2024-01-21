import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HQFIXEZL")
public final class Class18 {

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!HQFIXEZL", name = "b", descriptor = "I")
	private int anInt366 = 16042;

	@OriginalMember(owner = "client!HQFIXEZL", name = "c", descriptor = "I")
	private int anInt367 = 484;

	@OriginalMember(owner = "client!HQFIXEZL", name = "d", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!HQFIXEZL", name = "e", descriptor = "Z")
	private boolean aBoolean96 = true;

	@OriginalMember(owner = "client!HQFIXEZL", name = "f", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!HQFIXEZL", name = "g", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!HQFIXEZL", name = "h", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!HQFIXEZL", name = "i", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!HQFIXEZL", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!HQFIXEZL", name = "<init>", descriptor = "(IIZ)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			this.anInt368 = 0;
			this.anInt369 = 0;
			this.anInt370 = arg1;
			this.anInt371 = arg0;
			this.anIntArrayArray4 = new int[this.anInt370][this.anInt371];
			this.method256();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("44148, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "()V")
	public void method256() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt370; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt371; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt370 - 1 || local7 == this.anInt371 - 1) {
					this.anIntArrayArray4[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray4[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(IIZZII)V")
	public void method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt368;
			@Pc(9) int local9 = arg5 - this.anInt369;
			if (arg2) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method260(local4, local9, 128);
					this.method260(local4 - 1, local9, 8);
				}
				if (arg4 == 1) {
					this.method260(local4, local9, 2);
					this.method260(local4, local9 + 1, 32);
				}
				if (arg4 == 2) {
					this.method260(local4, local9, 8);
					this.method260(local4 + 1, local9, 128);
				}
				if (arg4 == 3) {
					this.method260(local4, local9, 32);
					this.method260(local4, local9 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method260(local4, local9, 1);
					this.method260(local4 - 1, local9 + 1, 16);
				}
				if (arg4 == 1) {
					this.method260(local4, local9, 4);
					this.method260(local4 + 1, local9 + 1, 64);
				}
				if (arg4 == 2) {
					this.method260(local4, local9, 16);
					this.method260(local4 + 1, local9 - 1, 1);
				}
				if (arg4 == 3) {
					this.method260(local4, local9, 64);
					this.method260(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method260(local4, local9, 130);
					this.method260(local4 - 1, local9, 8);
					this.method260(local4, local9 + 1, 32);
				}
				if (arg4 == 1) {
					this.method260(local4, local9, 10);
					this.method260(local4, local9 + 1, 32);
					this.method260(local4 + 1, local9, 128);
				}
				if (arg4 == 2) {
					this.method260(local4, local9, 40);
					this.method260(local4 + 1, local9, 128);
					this.method260(local4, local9 - 1, 2);
				}
				if (arg4 == 3) {
					this.method260(local4, local9, 160);
					this.method260(local4, local9 - 1, 2);
					this.method260(local4 - 1, local9, 8);
				}
			}
			if (arg3) {
				if (arg0 == 0) {
					if (arg4 == 0) {
						this.method260(local4, local9, 65536);
						this.method260(local4 - 1, local9, 4096);
					}
					if (arg4 == 1) {
						this.method260(local4, local9, 1024);
						this.method260(local4, local9 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method260(local4, local9, 4096);
						this.method260(local4 + 1, local9, 65536);
					}
					if (arg4 == 3) {
						this.method260(local4, local9, 16384);
						this.method260(local4, local9 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg4 == 0) {
						this.method260(local4, local9, 512);
						this.method260(local4 - 1, local9 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method260(local4, local9, 2048);
						this.method260(local4 + 1, local9 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method260(local4, local9, 8192);
						this.method260(local4 + 1, local9 - 1, 512);
					}
					if (arg4 == 3) {
						this.method260(local4, local9, 32768);
						this.method260(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg4 == 0) {
						this.method260(local4, local9, 66560);
						this.method260(local4 - 1, local9, 4096);
						this.method260(local4, local9 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method260(local4, local9, 5120);
						this.method260(local4, local9 + 1, 16384);
						this.method260(local4 + 1, local9, 65536);
					}
					if (arg4 == 2) {
						this.method260(local4, local9, 20480);
						this.method260(local4 + 1, local9, 65536);
						this.method260(local4, local9 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method260(local4, local9, 81920);
						this.method260(local4, local9 - 1, 1024);
						this.method260(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("41357, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(IIIIIIZ)V")
	public void method258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(25) int local25 = arg1 - this.anInt368;
			@Pc(30) int local30 = arg0 - this.anInt369;
			@Pc(38) int local38;
			if (arg3 == 1 || arg3 == 3) {
				local38 = arg2;
				arg2 = arg4;
				arg4 = local38;
			}
			for (local38 = local25; local38 < local25 + arg2; local38++) {
				if (local38 >= 0 && local38 < this.anInt370) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg4; local54++) {
						if (local54 >= 0 && local54 < this.anInt371) {
							this.method260(local38, local54, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("68063, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(III)V")
	public void method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(17) int local17 = arg0 - this.anInt368;
			@Pc(22) int local22 = arg1 - this.anInt369;
			this.anIntArrayArray4[local17][local22] |= 0x200000;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("30696, " + arg0 + ", " + arg1 + ", " + -190 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "b", descriptor = "(III)V")
	private void method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray4[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(ZBIIII)V")
	public void method261(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt368;
			@Pc(9) int local9 = arg4 - this.anInt369;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method263(local9, local4, 128);
					this.method263(local9, local4 - 1, 8);
				}
				if (arg2 == 1) {
					this.method263(local9, local4, 2);
					this.method263(local9 + 1, local4, 32);
				}
				if (arg2 == 2) {
					this.method263(local9, local4, 8);
					this.method263(local9, local4 + 1, 128);
				}
				if (arg2 == 3) {
					this.method263(local9, local4, 32);
					this.method263(local9 - 1, local4, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method263(local9, local4, 1);
					this.method263(local9 + 1, local4 - 1, 16);
				}
				if (arg2 == 1) {
					this.method263(local9, local4, 4);
					this.method263(local9 + 1, local4 + 1, 64);
				}
				if (arg2 == 2) {
					this.method263(local9, local4, 16);
					this.method263(local9 - 1, local4 + 1, 1);
				}
				if (arg2 == 3) {
					this.method263(local9, local4, 64);
					this.method263(local9 - 1, local4 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method263(local9, local4, 130);
					this.method263(local9, local4 - 1, 8);
					this.method263(local9 + 1, local4, 32);
				}
				if (arg2 == 1) {
					this.method263(local9, local4, 10);
					this.method263(local9 + 1, local4, 32);
					this.method263(local9, local4 + 1, 128);
				}
				if (arg2 == 2) {
					this.method263(local9, local4, 40);
					this.method263(local9, local4 + 1, 128);
					this.method263(local9 - 1, local4, 2);
				}
				if (arg2 == 3) {
					this.method263(local9, local4, 160);
					this.method263(local9 - 1, local4, 2);
					this.method263(local9, local4 - 1, 8);
				}
			}
			if (arg0) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method263(local9, local4, 65536);
						this.method263(local9, local4 - 1, 4096);
					}
					if (arg2 == 1) {
						this.method263(local9, local4, 1024);
						this.method263(local9 + 1, local4, 16384);
					}
					if (arg2 == 2) {
						this.method263(local9, local4, 4096);
						this.method263(local9, local4 + 1, 65536);
					}
					if (arg2 == 3) {
						this.method263(local9, local4, 16384);
						this.method263(local9 - 1, local4, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method263(local9, local4, 512);
						this.method263(local9 + 1, local4 - 1, 8192);
					}
					if (arg2 == 1) {
						this.method263(local9, local4, 2048);
						this.method263(local9 + 1, local4 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method263(local9, local4, 8192);
						this.method263(local9 - 1, local4 + 1, 512);
					}
					if (arg2 == 3) {
						this.method263(local9, local4, 32768);
						this.method263(local9 - 1, local4 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method263(local9, local4, 66560);
						this.method263(local9, local4 - 1, 4096);
						this.method263(local9 + 1, local4, 16384);
					}
					if (arg2 == 1) {
						this.method263(local9, local4, 5120);
						this.method263(local9 + 1, local4, 16384);
						this.method263(local9, local4 + 1, 65536);
					}
					if (arg2 == 2) {
						this.method263(local9, local4, 20480);
						this.method263(local9, local4 + 1, 65536);
						this.method263(local9 - 1, local4, 1024);
					}
					if (arg2 == 3) {
						this.method263(local9, local4, 81920);
						this.method263(local9 - 1, local4, 1024);
						this.method263(local9, local4 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("81814, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(BIZIIII)V")
	public void method262(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt368;
			@Pc(19) int local19 = arg4 - this.anInt369;
			@Pc(27) int local27;
			if (arg2 == 1 || arg2 == 3) {
				local27 = arg0;
				arg0 = arg5;
				arg5 = local27;
			}
			for (local27 = local14; local27 < local14 + arg0; local27++) {
				if (local27 >= 0 && local27 < this.anInt370) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg5; local43++) {
						if (local43 >= 0 && local43 < this.anInt371) {
							this.method263(local43, local27, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11392, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(IIII)V")
	private void method263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray4[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("228, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "c", descriptor = "(III)V")
	public void method264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt368;
			@Pc(9) int local9 = arg1 - this.anInt369;
			this.anIntArrayArray4[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28751, " + arg0 + ", " + -984 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg4 && arg5 == arg3) {
				return true;
			}
			@Pc(19) int local19 = arg1 - this.anInt368;
			@Pc(24) int local24 = arg5 - this.anInt369;
			@Pc(29) int local29 = arg4 - this.anInt368;
			@Pc(34) int local34 = arg3 - this.anInt369;
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x1280120) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280108) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x1280120) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280108) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280180) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280108) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280108) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x1280120) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local19 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x1280120) == 0) {
						return true;
					}
					if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x1280180) == 0) {
						return true;
					}
					if (local19 == local29 && local24 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local19 == local29 && local24 == local34 + 1 && (this.anIntArrayArray4[local19][local24] & 0x20) == 0) {
					return true;
				}
				if (local19 == local29 && local24 == local34 - 1 && (this.anIntArrayArray4[local19][local24] & 0x2) == 0) {
					return true;
				}
				if (local19 == local29 - 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x8) == 0) {
					return true;
				}
				if (local19 == local29 + 1 && local24 == local34 && (this.anIntArrayArray4[local19][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("31687, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -41150 + ", " + arg5 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg1 && arg3 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt368;
			@Pc(17) int local17 = arg3 - this.anInt369;
			@Pc(22) int local22 = arg1 - this.anInt368;
			@Pc(27) int local27 = arg5 - this.anInt369;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray4[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray4[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray4[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray4[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray4[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray4[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray4[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("29265, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQFIXEZL", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg6 + arg3 - 1;
			@Pc(17) int local17 = arg0 + arg1 - 1;
			if (arg5 >= arg6 && arg5 <= local11 && arg4 >= arg0 && arg4 <= local17) {
				return true;
			} else if (arg5 == arg6 - 1 && arg4 >= arg0 && arg4 <= local17 && (this.anIntArrayArray4[arg5 - this.anInt368][arg4 - this.anInt369] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg5 == local11 + 1 && arg4 >= arg0 && arg4 <= local17 && (this.anIntArrayArray4[arg5 - this.anInt368][arg4 - this.anInt369] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg0 - 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray4[arg5 - this.anInt368][arg4 - this.anInt369] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local17 + 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray4[arg5 - this.anInt368][arg4 - this.anInt369] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("1673, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
