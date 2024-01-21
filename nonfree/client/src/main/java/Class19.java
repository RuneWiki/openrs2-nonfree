import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt693 = 31154;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt694 = 5;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "B")
	private byte aByte31 = 2;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt696 = 0;
			this.anInt697 = 0;
			this.anInt698 = arg1;
			this.anInt699 = arg0;
			this.anIntArrayArray17 = new int[this.anInt698][this.anInt699];
			this.method412();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("12684, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method412() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt698; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt699; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt698 - 1 || local7 == this.anInt699 - 1) {
						this.anIntArrayArray17[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray17[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("14545, " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIZ)V")
	public void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(13) int local13 = arg3 - this.anInt696;
			@Pc(18) int local18 = arg2 - this.anInt697;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method416(local13, local18, 128);
					this.method416(local13 - 1, local18, 8);
				}
				if (arg1 == 1) {
					this.method416(local13, local18, 2);
					this.method416(local13, local18 + 1, 32);
				}
				if (arg1 == 2) {
					this.method416(local13, local18, 8);
					this.method416(local13 + 1, local18, 128);
				}
				if (arg1 == 3) {
					this.method416(local13, local18, 32);
					this.method416(local13, local18 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method416(local13, local18, 1);
					this.method416(local13 - 1, local18 + 1, 16);
				}
				if (arg1 == 1) {
					this.method416(local13, local18, 4);
					this.method416(local13 + 1, local18 + 1, 64);
				}
				if (arg1 == 2) {
					this.method416(local13, local18, 16);
					this.method416(local13 + 1, local18 - 1, 1);
				}
				if (arg1 == 3) {
					this.method416(local13, local18, 64);
					this.method416(local13 - 1, local18 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method416(local13, local18, 130);
					this.method416(local13 - 1, local18, 8);
					this.method416(local13, local18 + 1, 32);
				}
				if (arg1 == 1) {
					this.method416(local13, local18, 10);
					this.method416(local13, local18 + 1, 32);
					this.method416(local13 + 1, local18, 128);
				}
				if (arg1 == 2) {
					this.method416(local13, local18, 40);
					this.method416(local13 + 1, local18, 128);
					this.method416(local13, local18 - 1, 2);
				}
				if (arg1 == 3) {
					this.method416(local13, local18, 160);
					this.method416(local13, local18 - 1, 2);
					this.method416(local13 - 1, local18, 8);
				}
			}
			if (arg4) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method416(local13, local18, 65536);
						this.method416(local13 - 1, local18, 4096);
					}
					if (arg1 == 1) {
						this.method416(local13, local18, 1024);
						this.method416(local13, local18 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method416(local13, local18, 4096);
						this.method416(local13 + 1, local18, 65536);
					}
					if (arg1 == 3) {
						this.method416(local13, local18, 16384);
						this.method416(local13, local18 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method416(local13, local18, 512);
						this.method416(local13 - 1, local18 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method416(local13, local18, 2048);
						this.method416(local13 + 1, local18 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method416(local13, local18, 8192);
						this.method416(local13 + 1, local18 - 1, 512);
					}
					if (arg1 == 3) {
						this.method416(local13, local18, 32768);
						this.method416(local13 - 1, local18 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method416(local13, local18, 66560);
						this.method416(local13 - 1, local18, 4096);
						this.method416(local13, local18 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method416(local13, local18, 5120);
						this.method416(local13, local18 + 1, 16384);
						this.method416(local13 + 1, local18, 65536);
					}
					if (arg1 == 2) {
						this.method416(local13, local18, 20480);
						this.method416(local13 + 1, local18, 65536);
						this.method416(local13, local18 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method416(local13, local18, 81920);
						this.method416(local13, local18 - 1, 1024);
						this.method416(local13 - 1, local18, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("73445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZIZ)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt696;
			@Pc(19) int local19 = arg0 - this.anInt697;
			@Pc(30) int local30;
			if (arg1 == 1 || arg1 == 3) {
				local30 = arg2;
				arg2 = arg3;
				arg3 = local30;
			}
			for (local30 = local14; local30 < local14 + arg2; local30++) {
				if (local30 >= 0 && local30 < this.anInt698) {
					for (@Pc(46) int local46 = local19; local46 < local19 + arg3; local46++) {
						if (local46 >= 0 && local46 < this.anInt699) {
							this.method416(local30, local46, local3);
						}
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("9153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt696;
			@Pc(14) int local14 = arg1 - this.anInt697;
			this.anIntArrayArray17[local4][local14] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("82034, " + arg0 + ", " + arg1 + ", " + 668 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt696;
			@Pc(9) int local9 = arg0 - this.anInt697;
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method419(local4, 128, local9, (byte) 2);
					this.method419(local4 - 1, 8, local9, (byte) 2);
				}
				if (arg1 == 1) {
					this.method419(local4, 2, local9, (byte) 2);
					this.method419(local4, 32, local9 + 1, (byte) 2);
				}
				if (arg1 == 2) {
					this.method419(local4, 8, local9, (byte) 2);
					this.method419(local4 + 1, 128, local9, (byte) 2);
				}
				if (arg1 == 3) {
					this.method419(local4, 32, local9, (byte) 2);
					this.method419(local4, 2, local9 - 1, (byte) 2);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method419(local4, 1, local9, (byte) 2);
					this.method419(local4 - 1, 16, local9 + 1, (byte) 2);
				}
				if (arg1 == 1) {
					this.method419(local4, 4, local9, (byte) 2);
					this.method419(local4 + 1, 64, local9 + 1, (byte) 2);
				}
				if (arg1 == 2) {
					this.method419(local4, 16, local9, (byte) 2);
					this.method419(local4 + 1, 1, local9 - 1, (byte) 2);
				}
				if (arg1 == 3) {
					this.method419(local4, 64, local9, (byte) 2);
					this.method419(local4 - 1, 4, local9 - 1, (byte) 2);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method419(local4, 130, local9, (byte) 2);
					this.method419(local4 - 1, 8, local9, (byte) 2);
					this.method419(local4, 32, local9 + 1, (byte) 2);
				}
				if (arg1 == 1) {
					this.method419(local4, 10, local9, (byte) 2);
					this.method419(local4, 32, local9 + 1, (byte) 2);
					this.method419(local4 + 1, 128, local9, (byte) 2);
				}
				if (arg1 == 2) {
					this.method419(local4, 40, local9, (byte) 2);
					this.method419(local4 + 1, 128, local9, (byte) 2);
					this.method419(local4, 2, local9 - 1, (byte) 2);
				}
				if (arg1 == 3) {
					this.method419(local4, 160, local9, (byte) 2);
					this.method419(local4, 2, local9 - 1, (byte) 2);
					this.method419(local4 - 1, 8, local9, (byte) 2);
				}
			}
			if (arg4) {
				if (arg3 == 0) {
					if (arg1 == 0) {
						this.method419(local4, 65536, local9, (byte) 2);
						this.method419(local4 - 1, 4096, local9, (byte) 2);
					}
					if (arg1 == 1) {
						this.method419(local4, 1024, local9, (byte) 2);
						this.method419(local4, 16384, local9 + 1, (byte) 2);
					}
					if (arg1 == 2) {
						this.method419(local4, 4096, local9, (byte) 2);
						this.method419(local4 + 1, 65536, local9, (byte) 2);
					}
					if (arg1 == 3) {
						this.method419(local4, 16384, local9, (byte) 2);
						this.method419(local4, 1024, local9 - 1, (byte) 2);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg1 == 0) {
						this.method419(local4, 512, local9, (byte) 2);
						this.method419(local4 - 1, 8192, local9 + 1, (byte) 2);
					}
					if (arg1 == 1) {
						this.method419(local4, 2048, local9, (byte) 2);
						this.method419(local4 + 1, 32768, local9 + 1, (byte) 2);
					}
					if (arg1 == 2) {
						this.method419(local4, 8192, local9, (byte) 2);
						this.method419(local4 + 1, 512, local9 - 1, (byte) 2);
					}
					if (arg1 == 3) {
						this.method419(local4, 32768, local9, (byte) 2);
						this.method419(local4 - 1, 2048, local9 - 1, (byte) 2);
					}
				}
				if (arg3 == 2) {
					if (arg1 == 0) {
						this.method419(local4, 66560, local9, (byte) 2);
						this.method419(local4 - 1, 4096, local9, (byte) 2);
						this.method419(local4, 16384, local9 + 1, (byte) 2);
					}
					if (arg1 == 1) {
						this.method419(local4, 5120, local9, (byte) 2);
						this.method419(local4, 16384, local9 + 1, (byte) 2);
						this.method419(local4 + 1, 65536, local9, (byte) 2);
					}
					if (arg1 == 2) {
						this.method419(local4, 20480, local9, (byte) 2);
						this.method419(local4 + 1, 65536, local9, (byte) 2);
						this.method419(local4, 1024, local9 - 1, (byte) 2);
					}
					if (arg1 == 3) {
						this.method419(local4, 81920, local9, (byte) 2);
						this.method419(local4, 1024, local9 - 1, (byte) 2);
						this.method419(local4 - 1, 4096, local9, (byte) 2);
						return;
					}
				}
			}
		} catch (@Pc(524) RuntimeException local524) {
			signlink.reporterror("85954, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + arg3 + ", " + arg4 + ", " + local524.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZII)V")
	public void method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			@Pc(9) int local9;
			if (this.anInt694 != 5) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			if (arg3) {
				local3 = 131328;
			}
			@Pc(25) int local25 = arg0 - this.anInt696;
			@Pc(30) int local30 = arg2 - this.anInt697;
			if (arg4 == 1 || arg4 == 3) {
				local9 = arg1;
				arg1 = arg5;
				arg5 = local9;
			}
			for (local9 = local25; local9 < local25 + arg1; local9++) {
				if (local9 >= 0 && local9 < this.anInt698) {
					for (@Pc(54) int local54 = local30; local54 < local30 + arg5; local54++) {
						if (local54 >= 0 && local54 < this.anInt699) {
							this.method419(local9, local3, local54, (byte) 2);
						}
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("56135, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			if (this.aByte31 == 2) {
				@Pc(5) boolean local5 = false;
				this.anIntArrayArray17[arg0][arg2] &= 16777215 - arg1;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("80616, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(8) int local8 = arg1 - this.anInt696;
			@Pc(13) int local13 = arg0 - this.anInt697;
			this.anIntArrayArray17[local8][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("6998, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 == arg2 && arg4 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt696;
			@Pc(17) int local17 = arg4 - this.anInt697;
			@Pc(22) int local22 = arg2 - this.anInt696;
			@Pc(34) int local34 = arg5 - this.anInt697;
			if (arg0 == 0) {
				if (arg3 == 0) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray17[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray17[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray17[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray17[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray17[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray17[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray17[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 - 1 && local17 == local34) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray17[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("22133, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -61 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)Z")
	public boolean method422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg4 && arg1 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt696;
			@Pc(23) int local23 = arg1 - this.anInt697;
			@Pc(28) int local28 = arg4 - this.anInt696;
			@Pc(33) int local33 = arg5 - this.anInt697;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("69152, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(9) int local9 = arg7 + arg5 - 1;
			@Pc(15) int local15 = arg4 + arg0 - 1;
			if (arg6 >= arg7 && arg6 <= local9 && arg3 >= arg4 && arg3 <= local15) {
				return true;
			} else if (arg6 == arg7 - 1 && arg3 >= arg4 && arg3 <= local15 && (this.anIntArrayArray17[arg6 - this.anInt696][arg3 - this.anInt697] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg6 == local9 + 1 && arg3 >= arg4 && arg3 <= local15 && (this.anIntArrayArray17[arg6 - this.anInt696][arg3 - this.anInt697] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg4 - 1 && arg6 >= arg7 && arg6 <= local9 && (this.anIntArrayArray17[arg6 - this.anInt696][arg3 - this.anInt697] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local15 + 1 && arg6 >= arg7 && arg6 <= local9 && (this.anIntArrayArray17[arg6 - this.anInt696][arg3 - this.anInt697] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("65346, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}
}
