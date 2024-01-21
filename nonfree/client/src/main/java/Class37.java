import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TJMGSZMW")
public final class Class37 {

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!TJMGSZMW", name = "b", descriptor = "I")
	private int anInt646 = -254;

	@OriginalMember(owner = "client!TJMGSZMW", name = "c", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!TJMGSZMW", name = "d", descriptor = "I")
	private int anInt647 = 7;

	@OriginalMember(owner = "client!TJMGSZMW", name = "e", descriptor = "I")
	private int anInt648 = 9;

	@OriginalMember(owner = "client!TJMGSZMW", name = "f", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!TJMGSZMW", name = "g", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!TJMGSZMW", name = "h", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!TJMGSZMW", name = "i", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!TJMGSZMW", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!TJMGSZMW", name = "<init>", descriptor = "(III)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt649 = 0;
			this.anInt650 = 0;
			this.anInt651 = arg0;
			this.anInt652 = arg1;
			this.anIntArrayArray15 = new int[this.anInt651][this.anInt652];
			this.method424();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("89202, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "()V")
	public void method424() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt651; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt652; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt651 - 1 || local7 == this.anInt652 - 1) {
					this.anIntArrayArray15[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray15[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IZIZII)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt649;
			@Pc(9) int local9 = arg3 - this.anInt650;
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method428(local4, local9, 128);
					this.method428(local4 - 1, local9, 8);
				}
				if (arg0 == 1) {
					this.method428(local4, local9, 2);
					this.method428(local4, local9 + 1, 32);
				}
				if (arg0 == 2) {
					this.method428(local4, local9, 8);
					this.method428(local4 + 1, local9, 128);
				}
				if (arg0 == 3) {
					this.method428(local4, local9, 32);
					this.method428(local4, local9 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method428(local4, local9, 1);
					this.method428(local4 - 1, local9 + 1, 16);
				}
				if (arg0 == 1) {
					this.method428(local4, local9, 4);
					this.method428(local4 + 1, local9 + 1, 64);
				}
				if (arg0 == 2) {
					this.method428(local4, local9, 16);
					this.method428(local4 + 1, local9 - 1, 1);
				}
				if (arg0 == 3) {
					this.method428(local4, local9, 64);
					this.method428(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method428(local4, local9, 130);
					this.method428(local4 - 1, local9, 8);
					this.method428(local4, local9 + 1, 32);
				}
				if (arg0 == 1) {
					this.method428(local4, local9, 10);
					this.method428(local4, local9 + 1, 32);
					this.method428(local4 + 1, local9, 128);
				}
				if (arg0 == 2) {
					this.method428(local4, local9, 40);
					this.method428(local4 + 1, local9, 128);
					this.method428(local4, local9 - 1, 2);
				}
				if (arg0 == 3) {
					this.method428(local4, local9, 160);
					this.method428(local4, local9 - 1, 2);
					this.method428(local4 - 1, local9, 8);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg0 == 0) {
						this.method428(local4, local9, 65536);
						this.method428(local4 - 1, local9, 4096);
					}
					if (arg0 == 1) {
						this.method428(local4, local9, 1024);
						this.method428(local4, local9 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method428(local4, local9, 4096);
						this.method428(local4 + 1, local9, 65536);
					}
					if (arg0 == 3) {
						this.method428(local4, local9, 16384);
						this.method428(local4, local9 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg0 == 0) {
						this.method428(local4, local9, 512);
						this.method428(local4 - 1, local9 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method428(local4, local9, 2048);
						this.method428(local4 + 1, local9 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method428(local4, local9, 8192);
						this.method428(local4 + 1, local9 - 1, 512);
					}
					if (arg0 == 3) {
						this.method428(local4, local9, 32768);
						this.method428(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg0 == 0) {
						this.method428(local4, local9, 66560);
						this.method428(local4 - 1, local9, 4096);
						this.method428(local4, local9 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method428(local4, local9, 5120);
						this.method428(local4, local9 + 1, 16384);
						this.method428(local4 + 1, local9, 65536);
					}
					if (arg0 == 2) {
						this.method428(local4, local9, 20480);
						this.method428(local4 + 1, local9, 65536);
						this.method428(local4, local9 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method428(local4, local9, 81920);
						this.method428(local4, local9 - 1, 1024);
						this.method428(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("37916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IIIZIII)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(9) int local9 = 256;
			if (arg3) {
				local9 = 131328;
			}
			@Pc(20) int local20 = arg0 - this.anInt649;
			@Pc(25) int local25 = arg1 - this.anInt650;
			@Pc(33) int local33;
			if (arg4 == 1 || arg4 == 3) {
				local33 = arg5;
				arg5 = arg2;
				arg2 = local33;
			}
			for (local33 = local20; local33 < local20 + arg5; local33++) {
				if (local33 >= 0 && local33 < this.anInt651) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg2; local49++) {
						if (local49 >= 0 && local49 < this.anInt652) {
							this.method428(local33, local49, local9);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("37435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 33793 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(III)V")
	public void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt649;
			@Pc(9) int local9 = arg1 - this.anInt650;
			if (arg2 < 0) {
				this.anIntArrayArray15[local4][local9] |= 0x200000;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("72097, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "b", descriptor = "(III)V")
	private void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray15[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IIZIII)V")
	public void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt649;
			@Pc(9) int local9 = arg4 - this.anInt650;
			if (arg0 != -29012) {
				this.aBoolean167 = !this.aBoolean167;
			}
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method431(128, local4, local9);
					this.method431(8, local4 - 1, local9);
				}
				if (arg5 == 1) {
					this.method431(2, local4, local9);
					this.method431(32, local4, local9 + 1);
				}
				if (arg5 == 2) {
					this.method431(8, local4, local9);
					this.method431(128, local4 + 1, local9);
				}
				if (arg5 == 3) {
					this.method431(32, local4, local9);
					this.method431(2, local4, local9 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method431(1, local4, local9);
					this.method431(16, local4 - 1, local9 + 1);
				}
				if (arg5 == 1) {
					this.method431(4, local4, local9);
					this.method431(64, local4 + 1, local9 + 1);
				}
				if (arg5 == 2) {
					this.method431(16, local4, local9);
					this.method431(1, local4 + 1, local9 - 1);
				}
				if (arg5 == 3) {
					this.method431(64, local4, local9);
					this.method431(4, local4 - 1, local9 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method431(130, local4, local9);
					this.method431(8, local4 - 1, local9);
					this.method431(32, local4, local9 + 1);
				}
				if (arg5 == 1) {
					this.method431(10, local4, local9);
					this.method431(32, local4, local9 + 1);
					this.method431(128, local4 + 1, local9);
				}
				if (arg5 == 2) {
					this.method431(40, local4, local9);
					this.method431(128, local4 + 1, local9);
					this.method431(2, local4, local9 - 1);
				}
				if (arg5 == 3) {
					this.method431(160, local4, local9);
					this.method431(2, local4, local9 - 1);
					this.method431(8, local4 - 1, local9);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg5 == 0) {
						this.method431(65536, local4, local9);
						this.method431(4096, local4 - 1, local9);
					}
					if (arg5 == 1) {
						this.method431(1024, local4, local9);
						this.method431(16384, local4, local9 + 1);
					}
					if (arg5 == 2) {
						this.method431(4096, local4, local9);
						this.method431(65536, local4 + 1, local9);
					}
					if (arg5 == 3) {
						this.method431(16384, local4, local9);
						this.method431(1024, local4, local9 - 1);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg5 == 0) {
						this.method431(512, local4, local9);
						this.method431(8192, local4 - 1, local9 + 1);
					}
					if (arg5 == 1) {
						this.method431(2048, local4, local9);
						this.method431(32768, local4 + 1, local9 + 1);
					}
					if (arg5 == 2) {
						this.method431(8192, local4, local9);
						this.method431(512, local4 + 1, local9 - 1);
					}
					if (arg5 == 3) {
						this.method431(32768, local4, local9);
						this.method431(2048, local4 - 1, local9 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg5 == 0) {
						this.method431(66560, local4, local9);
						this.method431(4096, local4 - 1, local9);
						this.method431(16384, local4, local9 + 1);
					}
					if (arg5 == 1) {
						this.method431(5120, local4, local9);
						this.method431(16384, local4, local9 + 1);
						this.method431(65536, local4 + 1, local9);
					}
					if (arg5 == 2) {
						this.method431(20480, local4, local9);
						this.method431(65536, local4 + 1, local9);
						this.method431(1024, local4, local9 - 1);
					}
					if (arg5 == 3) {
						this.method431(81920, local4, local9);
						this.method431(1024, local4, local9 - 1);
						this.method431(4096, local4 - 1, local9);
						return;
					}
				}
			}
		} catch (@Pc(528) RuntimeException local528) {
			signlink.reporterror("14209, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local528.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IZBIIII)V")
	public void method430(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			@Pc(8) boolean local8 = false;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(29) int local29 = arg0 - this.anInt649;
			@Pc(34) int local34 = arg3 - this.anInt650;
			@Pc(42) int local42;
			if (arg6 == 1 || arg6 == 3) {
				local42 = arg4;
				arg4 = arg5;
				arg5 = local42;
			}
			for (local42 = local29; local42 < local29 + arg4; local42++) {
				if (local42 >= 0 && local42 < this.anInt651) {
					for (@Pc(58) int local58 = local34; local58 < local34 + arg5; local58++) {
						if (local58 >= 0 && local58 < this.anInt652) {
							this.method431(local3, local42, local58);
						}
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("14918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IIII)V")
	private void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray15[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("93926, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(BII)V")
	public void method432(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(14) int local14 = arg1 - this.anInt649;
			@Pc(19) int local19 = arg2 - this.anInt650;
			this.anIntArrayArray15[local14][local19] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("13651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg2 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt649;
			@Pc(17) int local17 = arg4 - this.anInt650;
			@Pc(33) int local33 = arg2 - this.anInt649;
			@Pc(38) int local38 = arg3 - this.anInt650;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 && local17 == local38 + 1) {
						return true;
					}
					if (local12 == local33 - 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 + 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 && local17 == local38 - 1) {
						return true;
					}
					if (local12 == local33 - 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 - 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1 && (this.anIntArrayArray15[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 - 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 - 1 && local17 == local38) {
						return true;
					}
					if (local12 == local33 && local17 == local38 + 1 && (this.anIntArrayArray15[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local33 && local17 == local38 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local33 && local17 == local38 + 1 && (this.anIntArrayArray15[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local33 && local17 == local38 - 1 && (this.anIntArrayArray15[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local33 - 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local33 + 1 && local17 == local38 && (this.anIntArrayArray15[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("48195, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 == arg4 && arg2 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt649;
			@Pc(26) int local26 = arg2 - this.anInt650;
			@Pc(31) int local31 = arg4 - this.anInt649;
			@Pc(36) int local36 = arg5 - this.anInt650;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x80) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray15[local12][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x8) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray15[local12][local26] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x8) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray15[local12][local26] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x80) == 0) {
						return true;
					}
					if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray15[local12][local26] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local31 && local26 == local36 + 1 && (this.anIntArrayArray15[local12][local26] & 0x20) == 0) {
					return true;
				}
				if (local12 == local31 && local26 == local36 - 1 && (this.anIntArrayArray15[local12][local26] & 0x2) == 0) {
					return true;
				}
				if (local12 == local31 - 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x8) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local26 == local36 && (this.anIntArrayArray15[local12][local26] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("65340, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 4 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TJMGSZMW", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg4 + arg5 - 1;
			@Pc(11) int local11 = arg1 + arg2 - 1;
			if (arg6 >= arg4 && arg6 <= local5 && arg0 >= arg1 && arg0 <= local11) {
				return true;
			} else if (arg6 == arg4 - 1 && arg0 >= arg1 && arg0 <= local11 && (this.anIntArrayArray15[arg6 - this.anInt649][arg0 - this.anInt650] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg0 >= arg1 && arg0 <= local11 && (this.anIntArrayArray15[arg6 - this.anInt649][arg0 - this.anInt650] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg1 - 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray15[arg6 - this.anInt649][arg0 - this.anInt650] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local11 + 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray15[arg6 - this.anInt649][arg0 - this.anInt650] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("57336, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}
