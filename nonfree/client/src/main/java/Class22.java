import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OTPPFNKL")
public final class Class22 {

	@OriginalMember(owner = "client!OTPPFNKL", name = "f", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "I")
	private int anInt486 = 560;

	@OriginalMember(owner = "client!OTPPFNKL", name = "b", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!OTPPFNKL", name = "c", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!OTPPFNKL", name = "d", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!OTPPFNKL", name = "e", descriptor = "I")
	private int anInt487 = 628;

	@OriginalMember(owner = "client!OTPPFNKL", name = "g", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!OTPPFNKL", name = "h", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!OTPPFNKL", name = "i", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!OTPPFNKL", name = "j", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!OTPPFNKL", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!OTPPFNKL", name = "<init>", descriptor = "(IZI)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt489 = 0;
			this.anInt490 = 0;
			this.anInt491 = arg0;
			this.anInt492 = arg2;
			this.anIntArrayArray15 = new int[this.anInt491][this.anInt492];
			this.method283();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("49708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "()V")
	public void method283() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt491; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt492; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt491 - 1 || local7 == this.anInt492 - 1) {
					this.anIntArrayArray15[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray15[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(ZIIIII)V")
	public void method284(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) int local6 = arg3 - this.anInt489;
			@Pc(22) int local22 = arg2 - this.anInt490;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method287(local6, local22, 128);
					this.method287(local6 - 1, local22, 8);
				}
				if (arg4 == 1) {
					this.method287(local6, local22, 2);
					this.method287(local6, local22 + 1, 32);
				}
				if (arg4 == 2) {
					this.method287(local6, local22, 8);
					this.method287(local6 + 1, local22, 128);
				}
				if (arg4 == 3) {
					this.method287(local6, local22, 32);
					this.method287(local6, local22 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method287(local6, local22, 1);
					this.method287(local6 - 1, local22 + 1, 16);
				}
				if (arg4 == 1) {
					this.method287(local6, local22, 4);
					this.method287(local6 + 1, local22 + 1, 64);
				}
				if (arg4 == 2) {
					this.method287(local6, local22, 16);
					this.method287(local6 + 1, local22 - 1, 1);
				}
				if (arg4 == 3) {
					this.method287(local6, local22, 64);
					this.method287(local6 - 1, local22 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method287(local6, local22, 130);
					this.method287(local6 - 1, local22, 8);
					this.method287(local6, local22 + 1, 32);
				}
				if (arg4 == 1) {
					this.method287(local6, local22, 10);
					this.method287(local6, local22 + 1, 32);
					this.method287(local6 + 1, local22, 128);
				}
				if (arg4 == 2) {
					this.method287(local6, local22, 40);
					this.method287(local6 + 1, local22, 128);
					this.method287(local6, local22 - 1, 2);
				}
				if (arg4 == 3) {
					this.method287(local6, local22, 160);
					this.method287(local6, local22 - 1, 2);
					this.method287(local6 - 1, local22, 8);
				}
			}
			if (arg0) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method287(local6, local22, 65536);
						this.method287(local6 - 1, local22, 4096);
					}
					if (arg4 == 1) {
						this.method287(local6, local22, 1024);
						this.method287(local6, local22 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method287(local6, local22, 4096);
						this.method287(local6 + 1, local22, 65536);
					}
					if (arg4 == 3) {
						this.method287(local6, local22, 16384);
						this.method287(local6, local22 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method287(local6, local22, 512);
						this.method287(local6 - 1, local22 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method287(local6, local22, 2048);
						this.method287(local6 + 1, local22 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method287(local6, local22, 8192);
						this.method287(local6 + 1, local22 - 1, 512);
					}
					if (arg4 == 3) {
						this.method287(local6, local22, 32768);
						this.method287(local6 - 1, local22 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method287(local6, local22, 66560);
						this.method287(local6 - 1, local22, 4096);
						this.method287(local6, local22 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method287(local6, local22, 5120);
						this.method287(local6, local22 + 1, 16384);
						this.method287(local6 + 1, local22, 65536);
					}
					if (arg4 == 2) {
						this.method287(local6, local22, 20480);
						this.method287(local6 + 1, local22, 65536);
						this.method287(local6, local22 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method287(local6, local22, 81920);
						this.method287(local6, local22 - 1, 1024);
						this.method287(local6 - 1, local22, 4096);
						return;
					}
				}
			}
		} catch (@Pc(474) RuntimeException local474) {
			signlink.reporterror("95026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -395 + ", " + arg3 + ", " + arg4 + ", " + local474.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(ZIIBIII)V")
	public void method285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt489;
			@Pc(19) int local19 = arg2 - this.anInt490;
			@Pc(27) int local27;
			if (arg5 == 1 || arg5 == 3) {
				local27 = arg3;
				arg3 = arg1;
				arg1 = local27;
			}
			for (local27 = local14; local27 < local14 + arg3; local27++) {
				if (local27 >= 0 && local27 < this.anInt491) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg1; local43++) {
						if (local43 >= 0 && local43 < this.anInt492) {
							this.method287(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("16679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 108 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(III)V")
	public void method286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt489;
			@Pc(9) int local9 = arg0 - this.anInt490;
			this.anIntArrayArray15[local4][local9] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("12223, " + arg0 + ", " + 325 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "b", descriptor = "(III)V")
	private void method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIZIII)V")
	public void method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt489;
			@Pc(14) int local14 = arg1 - this.anInt490;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method290(local14, local4, 128);
					this.method290(local14, local4 - 1, 8);
				}
				if (arg3 == 1) {
					this.method290(local14, local4, 2);
					this.method290(local14 + 1, local4, 32);
				}
				if (arg3 == 2) {
					this.method290(local14, local4, 8);
					this.method290(local14, local4 + 1, 128);
				}
				if (arg3 == 3) {
					this.method290(local14, local4, 32);
					this.method290(local14 - 1, local4, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method290(local14, local4, 1);
					this.method290(local14 + 1, local4 - 1, 16);
				}
				if (arg3 == 1) {
					this.method290(local14, local4, 4);
					this.method290(local14 + 1, local4 + 1, 64);
				}
				if (arg3 == 2) {
					this.method290(local14, local4, 16);
					this.method290(local14 - 1, local4 + 1, 1);
				}
				if (arg3 == 3) {
					this.method290(local14, local4, 64);
					this.method290(local14 - 1, local4 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method290(local14, local4, 130);
					this.method290(local14, local4 - 1, 8);
					this.method290(local14 + 1, local4, 32);
				}
				if (arg3 == 1) {
					this.method290(local14, local4, 10);
					this.method290(local14 + 1, local4, 32);
					this.method290(local14, local4 + 1, 128);
				}
				if (arg3 == 2) {
					this.method290(local14, local4, 40);
					this.method290(local14, local4 + 1, 128);
					this.method290(local14 - 1, local4, 2);
				}
				if (arg3 == 3) {
					this.method290(local14, local4, 160);
					this.method290(local14 - 1, local4, 2);
					this.method290(local14, local4 - 1, 8);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method290(local14, local4, 65536);
						this.method290(local14, local4 - 1, 4096);
					}
					if (arg3 == 1) {
						this.method290(local14, local4, 1024);
						this.method290(local14 + 1, local4, 16384);
					}
					if (arg3 == 2) {
						this.method290(local14, local4, 4096);
						this.method290(local14, local4 + 1, 65536);
					}
					if (arg3 == 3) {
						this.method290(local14, local4, 16384);
						this.method290(local14 - 1, local4, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method290(local14, local4, 512);
						this.method290(local14 + 1, local4 - 1, 8192);
					}
					if (arg3 == 1) {
						this.method290(local14, local4, 2048);
						this.method290(local14 + 1, local4 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method290(local14, local4, 8192);
						this.method290(local14 - 1, local4 + 1, 512);
					}
					if (arg3 == 3) {
						this.method290(local14, local4, 32768);
						this.method290(local14 - 1, local4 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method290(local14, local4, 66560);
						this.method290(local14, local4 - 1, 4096);
						this.method290(local14 + 1, local4, 16384);
					}
					if (arg3 == 1) {
						this.method290(local14, local4, 5120);
						this.method290(local14 + 1, local4, 16384);
						this.method290(local14, local4 + 1, 65536);
					}
					if (arg3 == 2) {
						this.method290(local14, local4, 20480);
						this.method290(local14, local4 + 1, 65536);
						this.method290(local14 - 1, local4, 1024);
					}
					if (arg3 == 3) {
						this.method290(local14, local4, 81920);
						this.method290(local14 - 1, local4, 1024);
						this.method290(local14, local4 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("90607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIIIIZI)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt489;
			@Pc(22) int local22 = arg5 - this.anInt490;
			@Pc(30) int local30;
			if (arg3 == 1 || arg3 == 3) {
				local30 = arg0;
				arg0 = arg2;
				arg2 = local30;
			}
			for (local30 = local14; local30 < local14 + arg0; local30++) {
				if (local30 >= 0 && local30 < this.anInt491) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg2; local46++) {
						if (local46 >= 0 && local46 < this.anInt492) {
							this.method290(local46, local30, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("53277, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -365 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIII)V")
	private void method290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray15[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("73016, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "c", descriptor = "(III)V")
	public void method291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt489;
			@Pc(9) int local9 = arg1 - this.anInt490;
			this.anIntArrayArray15[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("86450, " + arg0 + ", " + -978 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg2 && arg3 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt489;
			@Pc(17) int local17 = arg3 - this.anInt490;
			@Pc(22) int local22 = arg2 - this.anInt489;
			@Pc(36) int local36 = arg1 - this.anInt490;
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("15050, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIIIIIZ)Z")
	public boolean method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 == arg0 && arg5 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt489;
			@Pc(17) int local17 = arg5 - this.anInt490;
			@Pc(22) int local22 = arg0 - this.anInt489;
			@Pc(32) int local32 = arg2 - this.anInt490;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local22 && local17 == local32 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local32 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local32 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("99108, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTPPFNKL", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(14) int local14 = arg3 + arg4 - 1;
			@Pc(20) int local20 = arg5 + arg0 - 1;
			if (arg2 >= arg3 && arg2 <= local14 && arg1 >= arg5 && arg1 <= local20) {
				return true;
			} else if (arg2 == arg3 - 1 && arg1 >= arg5 && arg1 <= local20 && (this.anIntArrayArray15[arg2 - this.anInt489][arg1 - this.anInt490] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg2 == local14 + 1 && arg1 >= arg5 && arg1 <= local20 && (this.anIntArrayArray15[arg2 - this.anInt489][arg1 - this.anInt490] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg5 - 1 && arg2 >= arg3 && arg2 <= local14 && (this.anIntArrayArray15[arg2 - this.anInt489][arg1 - this.anInt490] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local20 + 1 && arg2 >= arg3 && arg2 <= local14 && (this.anIntArrayArray15[arg2 - this.anInt489][arg1 - this.anInt490] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("32760, " + arg0 + ", " + 360 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}
