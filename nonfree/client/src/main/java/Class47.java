import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XRENONSA")
public final class Class47 {

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!XRENONSA", name = "b", descriptor = "I")
	private int anInt665 = -766;

	@OriginalMember(owner = "client!XRENONSA", name = "c", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!XRENONSA", name = "d", descriptor = "I")
	private int anInt666 = 3;

	@OriginalMember(owner = "client!XRENONSA", name = "e", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!XRENONSA", name = "f", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!XRENONSA", name = "g", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!XRENONSA", name = "h", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!XRENONSA", name = "i", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!XRENONSA", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!XRENONSA", name = "<init>", descriptor = "(III)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt667 = 0;
			this.anInt668 = 0;
			this.anInt669 = arg2;
			this.anInt670 = arg0;
			this.anIntArrayArray16 = new int[this.anInt669][this.anInt670];
			this.method480();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("76844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "()V")
	public void method480() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt669; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt670; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt669 - 1 || local7 == this.anInt670 - 1) {
					this.anIntArrayArray16[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray16[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIZIII)V")
	public void method481(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt667;
			@Pc(13) int local13 = arg4 - this.anInt668;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method484(local4, local13, 128);
					this.method484(local4 - 1, local13, 8);
				}
				if (arg0 == 1) {
					this.method484(local4, local13, 2);
					this.method484(local4, local13 + 1, 32);
				}
				if (arg0 == 2) {
					this.method484(local4, local13, 8);
					this.method484(local4 + 1, local13, 128);
				}
				if (arg0 == 3) {
					this.method484(local4, local13, 32);
					this.method484(local4, local13 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method484(local4, local13, 1);
					this.method484(local4 - 1, local13 + 1, 16);
				}
				if (arg0 == 1) {
					this.method484(local4, local13, 4);
					this.method484(local4 + 1, local13 + 1, 64);
				}
				if (arg0 == 2) {
					this.method484(local4, local13, 16);
					this.method484(local4 + 1, local13 - 1, 1);
				}
				if (arg0 == 3) {
					this.method484(local4, local13, 64);
					this.method484(local4 - 1, local13 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method484(local4, local13, 130);
					this.method484(local4 - 1, local13, 8);
					this.method484(local4, local13 + 1, 32);
				}
				if (arg0 == 1) {
					this.method484(local4, local13, 10);
					this.method484(local4, local13 + 1, 32);
					this.method484(local4 + 1, local13, 128);
				}
				if (arg0 == 2) {
					this.method484(local4, local13, 40);
					this.method484(local4 + 1, local13, 128);
					this.method484(local4, local13 - 1, 2);
				}
				if (arg0 == 3) {
					this.method484(local4, local13, 160);
					this.method484(local4, local13 - 1, 2);
					this.method484(local4 - 1, local13, 8);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method484(local4, local13, 65536);
						this.method484(local4 - 1, local13, 4096);
					}
					if (arg0 == 1) {
						this.method484(local4, local13, 1024);
						this.method484(local4, local13 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method484(local4, local13, 4096);
						this.method484(local4 + 1, local13, 65536);
					}
					if (arg0 == 3) {
						this.method484(local4, local13, 16384);
						this.method484(local4, local13 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method484(local4, local13, 512);
						this.method484(local4 - 1, local13 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method484(local4, local13, 2048);
						this.method484(local4 + 1, local13 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method484(local4, local13, 8192);
						this.method484(local4 + 1, local13 - 1, 512);
					}
					if (arg0 == 3) {
						this.method484(local4, local13, 32768);
						this.method484(local4 - 1, local13 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method484(local4, local13, 66560);
						this.method484(local4 - 1, local13, 4096);
						this.method484(local4, local13 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method484(local4, local13, 5120);
						this.method484(local4, local13 + 1, 16384);
						this.method484(local4 + 1, local13, 65536);
					}
					if (arg0 == 2) {
						this.method484(local4, local13, 20480);
						this.method484(local4 + 1, local13, 65536);
						this.method484(local4, local13 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method484(local4, local13, 81920);
						this.method484(local4, local13 - 1, 1024);
						this.method484(local4 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("50376, " + arg0 + ", " + 37679 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIIIZIB)V")
	public void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(9) int local9 = 256;
			if (arg4) {
				local9 = 131328;
			}
			@Pc(20) int local20 = arg5 - this.anInt667;
			@Pc(25) int local25 = arg0 - this.anInt668;
			@Pc(33) int local33;
			if (arg1 == 1 || arg1 == 3) {
				local33 = arg3;
				arg3 = arg2;
				arg2 = local33;
			}
			for (local33 = local20; local33 < local20 + arg3; local33++) {
				if (local33 >= 0 && local33 < this.anInt669) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg2; local49++) {
						if (local49 >= 0 && local49 < this.anInt670) {
							this.method484(local33, local49, local9);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("46082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 52 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(III)V")
	public void method483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt667;
			@Pc(9) int local9 = arg0 - this.anInt668;
			this.anIntArrayArray16[local4][local9] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("54577, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "b", descriptor = "(III)V")
	private void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray16[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIIIIZ)V")
	public void method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(14) int local14 = arg1 - this.anInt667;
			@Pc(19) int local19 = arg2 - this.anInt668;
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method487(local14, 128, local19);
					this.method487(local14 - 1, 8, local19);
				}
				if (arg0 == 1) {
					this.method487(local14, 2, local19);
					this.method487(local14, 32, local19 + 1);
				}
				if (arg0 == 2) {
					this.method487(local14, 8, local19);
					this.method487(local14 + 1, 128, local19);
				}
				if (arg0 == 3) {
					this.method487(local14, 32, local19);
					this.method487(local14, 2, local19 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method487(local14, 1, local19);
					this.method487(local14 - 1, 16, local19 + 1);
				}
				if (arg0 == 1) {
					this.method487(local14, 4, local19);
					this.method487(local14 + 1, 64, local19 + 1);
				}
				if (arg0 == 2) {
					this.method487(local14, 16, local19);
					this.method487(local14 + 1, 1, local19 - 1);
				}
				if (arg0 == 3) {
					this.method487(local14, 64, local19);
					this.method487(local14 - 1, 4, local19 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method487(local14, 130, local19);
					this.method487(local14 - 1, 8, local19);
					this.method487(local14, 32, local19 + 1);
				}
				if (arg0 == 1) {
					this.method487(local14, 10, local19);
					this.method487(local14, 32, local19 + 1);
					this.method487(local14 + 1, 128, local19);
				}
				if (arg0 == 2) {
					this.method487(local14, 40, local19);
					this.method487(local14 + 1, 128, local19);
					this.method487(local14, 2, local19 - 1);
				}
				if (arg0 == 3) {
					this.method487(local14, 160, local19);
					this.method487(local14, 2, local19 - 1);
					this.method487(local14 - 1, 8, local19);
				}
			}
			if (arg4) {
				if (arg3 == 0) {
					if (arg0 == 0) {
						this.method487(local14, 65536, local19);
						this.method487(local14 - 1, 4096, local19);
					}
					if (arg0 == 1) {
						this.method487(local14, 1024, local19);
						this.method487(local14, 16384, local19 + 1);
					}
					if (arg0 == 2) {
						this.method487(local14, 4096, local19);
						this.method487(local14 + 1, 65536, local19);
					}
					if (arg0 == 3) {
						this.method487(local14, 16384, local19);
						this.method487(local14, 1024, local19 - 1);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg0 == 0) {
						this.method487(local14, 512, local19);
						this.method487(local14 - 1, 8192, local19 + 1);
					}
					if (arg0 == 1) {
						this.method487(local14, 2048, local19);
						this.method487(local14 + 1, 32768, local19 + 1);
					}
					if (arg0 == 2) {
						this.method487(local14, 8192, local19);
						this.method487(local14 + 1, 512, local19 - 1);
					}
					if (arg0 == 3) {
						this.method487(local14, 32768, local19);
						this.method487(local14 - 1, 2048, local19 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg0 == 0) {
						this.method487(local14, 66560, local19);
						this.method487(local14 - 1, 4096, local19);
						this.method487(local14, 16384, local19 + 1);
					}
					if (arg0 == 1) {
						this.method487(local14, 5120, local19);
						this.method487(local14, 16384, local19 + 1);
						this.method487(local14 + 1, 65536, local19);
					}
					if (arg0 == 2) {
						this.method487(local14, 20480, local19);
						this.method487(local14 + 1, 65536, local19);
						this.method487(local14, 1024, local19 - 1);
					}
					if (arg0 == 3) {
						this.method487(local14, 81920, local19);
						this.method487(local14, 1024, local19 - 1);
						this.method487(local14 - 1, 4096, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("26181, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIIIIZI)V")
	public void method486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt667;
			if (arg0 != 2) {
				this.aBoolean169 = !this.aBoolean169;
			}
			@Pc(30) int local30 = arg1 - this.anInt668;
			@Pc(38) int local38;
			if (arg3 == 1 || arg3 == 3) {
				local38 = arg6;
				arg6 = arg4;
				arg4 = local38;
			}
			for (local38 = local14; local38 < local14 + arg6; local38++) {
				if (local38 >= 0 && local38 < this.anInt669) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg4; local54++) {
						if (local54 >= 0 && local54 < this.anInt670) {
							this.method487(local38, local3, local54);
						}
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89340, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIBI)V")
	private void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray16[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("9094, " + arg0 + ", " + arg1 + ", " + 17 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IBI)V")
	public void method488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) int local8 = arg0 - this.anInt667;
			@Pc(13) int local13 = arg1 - this.anInt668;
			this.anIntArrayArray16[local8][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("62509, " + arg0 + ", " + -122 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg0 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt667;
			@Pc(27) int local27 = arg4 - this.anInt668;
			@Pc(32) int local32 = arg0 - this.anInt667;
			@Pc(37) int local37 = arg1 - this.anInt668;
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray16[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray16[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray16[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray16[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray16[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray16[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray16[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray16[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray16[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray16[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray16[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("56038, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg1 && arg0 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt667;
			@Pc(17) int local17 = arg0 - this.anInt668;
			@Pc(22) int local22 = arg1 - this.anInt667;
			@Pc(33) int local33 = arg5 - this.anInt668;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray16[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray16[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray16[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray16[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray16[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray16[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray16[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("24337, " + -37 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRENONSA", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 - 1;
			@Pc(11) int local11 = arg5 + arg4 - 1;
			if (arg1 >= arg2 && arg1 <= local5 && arg6 >= arg5 && arg6 <= local11) {
				return true;
			} else if (arg1 == arg2 - 1 && arg6 >= arg5 && arg6 <= local11 && (this.anIntArrayArray16[arg1 - this.anInt667][arg6 - this.anInt668] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg6 >= arg5 && arg6 <= local11 && (this.anIntArrayArray16[arg1 - this.anInt667][arg6 - this.anInt668] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg5 - 1 && arg1 >= arg2 && arg1 <= local5 && (this.anIntArrayArray16[arg1 - this.anInt667][arg6 - this.anInt668] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local11 + 1 && arg1 >= arg2 && arg1 <= local5 && (this.anIntArrayArray16[arg1 - this.anInt667][arg6 - this.anInt668] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("27401, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
