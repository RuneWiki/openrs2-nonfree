import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VLOWRGUJ")
public final class Class40 {

	@OriginalMember(owner = "client!VLOWRGUJ", name = "h", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "I")
	private int anInt708 = 95;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "b", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "c", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "d", descriptor = "I")
	private int anInt709 = -12929;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "e", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "f", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "g", descriptor = "I")
	private int anInt710 = -685;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "i", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "j", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "k", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "l", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!VLOWRGUJ", name = "<init>", descriptor = "(III)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt712 = 0;
			this.anInt713 = 0;
			this.anInt714 = arg2;
			this.anInt715 = arg0;
			this.anIntArrayArray19 = new int[this.anInt714][this.anInt715];
			this.method519();
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("27994, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "()V")
	public void method519() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt714; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt715; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt714 - 1 || local7 == this.anInt715 - 1) {
					this.anIntArrayArray19[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray19[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(BIIIIZ)V")
	public void method520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt712;
			@Pc(9) int local9 = arg3 - this.anInt713;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method523(local4, local9, 128);
					this.method523(local4 - 1, local9, 8);
				}
				if (arg2 == 1) {
					this.method523(local4, local9, 2);
					this.method523(local4, local9 + 1, 32);
				}
				if (arg2 == 2) {
					this.method523(local4, local9, 8);
					this.method523(local4 + 1, local9, 128);
				}
				if (arg2 == 3) {
					this.method523(local4, local9, 32);
					this.method523(local4, local9 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method523(local4, local9, 1);
					this.method523(local4 - 1, local9 + 1, 16);
				}
				if (arg2 == 1) {
					this.method523(local4, local9, 4);
					this.method523(local4 + 1, local9 + 1, 64);
				}
				if (arg2 == 2) {
					this.method523(local4, local9, 16);
					this.method523(local4 + 1, local9 - 1, 1);
				}
				if (arg2 == 3) {
					this.method523(local4, local9, 64);
					this.method523(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method523(local4, local9, 130);
					this.method523(local4 - 1, local9, 8);
					this.method523(local4, local9 + 1, 32);
				}
				if (arg2 == 1) {
					this.method523(local4, local9, 10);
					this.method523(local4, local9 + 1, 32);
					this.method523(local4 + 1, local9, 128);
				}
				if (arg2 == 2) {
					this.method523(local4, local9, 40);
					this.method523(local4 + 1, local9, 128);
					this.method523(local4, local9 - 1, 2);
				}
				if (arg2 == 3) {
					this.method523(local4, local9, 160);
					this.method523(local4, local9 - 1, 2);
					this.method523(local4 - 1, local9, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method523(local4, local9, 65536);
						this.method523(local4 - 1, local9, 4096);
					}
					if (arg2 == 1) {
						this.method523(local4, local9, 1024);
						this.method523(local4, local9 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method523(local4, local9, 4096);
						this.method523(local4 + 1, local9, 65536);
					}
					if (arg2 == 3) {
						this.method523(local4, local9, 16384);
						this.method523(local4, local9 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method523(local4, local9, 512);
						this.method523(local4 - 1, local9 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method523(local4, local9, 2048);
						this.method523(local4 + 1, local9 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method523(local4, local9, 8192);
						this.method523(local4 + 1, local9 - 1, 512);
					}
					if (arg2 == 3) {
						this.method523(local4, local9, 32768);
						this.method523(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method523(local4, local9, 66560);
						this.method523(local4 - 1, local9, 4096);
						this.method523(local4, local9 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method523(local4, local9, 5120);
						this.method523(local4, local9 + 1, 16384);
						this.method523(local4 + 1, local9, 65536);
					}
					if (arg2 == 2) {
						this.method523(local4, local9, 20480);
						this.method523(local4 + 1, local9, 65536);
						this.method523(local4, local9 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method523(local4, local9, 81920);
						this.method523(local4, local9 - 1, 1024);
						this.method523(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("95618, " + -125 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIIZ)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt712;
			@Pc(24) int local24 = arg1 - this.anInt713;
			@Pc(32) int local32;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg0;
				arg0 = arg2;
				arg2 = local32;
			}
			for (local32 = local14; local32 < local14 + arg0; local32++) {
				if (local32 >= 0 && local32 < this.anInt714) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg2; local48++) {
						if (local48 >= 0 && local48 < this.anInt715) {
							this.method523(local32, local48, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("80362, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(III)V")
	public void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt712;
			@Pc(9) int local9 = arg0 - this.anInt713;
			this.anIntArrayArray19[local4][local9] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("44606, " + arg0 + ", " + arg1 + ", " + -866 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "b", descriptor = "(III)V")
	private void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray19[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IZIIZI)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt712;
			@Pc(19) int local19 = arg2 - this.anInt713;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method526(local4, 128, local19);
					this.method526(local4 - 1, 8, local19);
				}
				if (arg3 == 1) {
					this.method526(local4, 2, local19);
					this.method526(local4, 32, local19 + 1);
				}
				if (arg3 == 2) {
					this.method526(local4, 8, local19);
					this.method526(local4 + 1, 128, local19);
				}
				if (arg3 == 3) {
					this.method526(local4, 32, local19);
					this.method526(local4, 2, local19 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method526(local4, 1, local19);
					this.method526(local4 - 1, 16, local19 + 1);
				}
				if (arg3 == 1) {
					this.method526(local4, 4, local19);
					this.method526(local4 + 1, 64, local19 + 1);
				}
				if (arg3 == 2) {
					this.method526(local4, 16, local19);
					this.method526(local4 + 1, 1, local19 - 1);
				}
				if (arg3 == 3) {
					this.method526(local4, 64, local19);
					this.method526(local4 - 1, 4, local19 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method526(local4, 130, local19);
					this.method526(local4 - 1, 8, local19);
					this.method526(local4, 32, local19 + 1);
				}
				if (arg3 == 1) {
					this.method526(local4, 10, local19);
					this.method526(local4, 32, local19 + 1);
					this.method526(local4 + 1, 128, local19);
				}
				if (arg3 == 2) {
					this.method526(local4, 40, local19);
					this.method526(local4 + 1, 128, local19);
					this.method526(local4, 2, local19 - 1);
				}
				if (arg3 == 3) {
					this.method526(local4, 160, local19);
					this.method526(local4, 2, local19 - 1);
					this.method526(local4 - 1, 8, local19);
				}
			}
			if (arg1) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method526(local4, 65536, local19);
						this.method526(local4 - 1, 4096, local19);
					}
					if (arg3 == 1) {
						this.method526(local4, 1024, local19);
						this.method526(local4, 16384, local19 + 1);
					}
					if (arg3 == 2) {
						this.method526(local4, 4096, local19);
						this.method526(local4 + 1, 65536, local19);
					}
					if (arg3 == 3) {
						this.method526(local4, 16384, local19);
						this.method526(local4, 1024, local19 - 1);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method526(local4, 512, local19);
						this.method526(local4 - 1, 8192, local19 + 1);
					}
					if (arg3 == 1) {
						this.method526(local4, 2048, local19);
						this.method526(local4 + 1, 32768, local19 + 1);
					}
					if (arg3 == 2) {
						this.method526(local4, 8192, local19);
						this.method526(local4 + 1, 512, local19 - 1);
					}
					if (arg3 == 3) {
						this.method526(local4, 32768, local19);
						this.method526(local4 - 1, 2048, local19 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method526(local4, 66560, local19);
						this.method526(local4 - 1, 4096, local19);
						this.method526(local4, 16384, local19 + 1);
					}
					if (arg3 == 1) {
						this.method526(local4, 5120, local19);
						this.method526(local4, 16384, local19 + 1);
						this.method526(local4 + 1, 65536, local19);
					}
					if (arg3 == 2) {
						this.method526(local4, 20480, local19);
						this.method526(local4 + 1, 65536, local19);
						this.method526(local4, 1024, local19 - 1);
					}
					if (arg3 == 3) {
						this.method526(local4, 81920, local19);
						this.method526(local4, 1024, local19 - 1);
						this.method526(local4 - 1, 4096, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("99829, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIZII)V")
	public void method525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt712;
			@Pc(25) int local25 = arg1 - this.anInt713;
			@Pc(33) int local33;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg5;
				arg5 = arg4;
				arg4 = local33;
			}
			for (local33 = local14; local33 < local14 + arg5; local33++) {
				if (local33 >= 0 && local33 < this.anInt714) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg4; local49++) {
						if (local49 >= 0 && local49 < this.anInt715) {
							this.method526(local33, local3, local49);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("33381, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIII)V")
	private void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray19[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("11602, " + arg0 + ", " + arg1 + ", " + 27126 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIZ)V")
	public void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg1 - this.anInt712;
			@Pc(14) int local14 = arg0 - this.anInt713;
			this.anIntArrayArray19[local9][local14] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("21884, " + arg0 + ", " + arg1 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg5 && arg0 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt712;
			@Pc(17) int local17 = arg0 - this.anInt713;
			@Pc(22) int local22 = arg5 - this.anInt712;
			@Pc(27) int local27 = arg2 - this.anInt713;
			if (arg3 == 0) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("92834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 5 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(ZIIIIII)Z")
	public boolean method529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg5 && arg4 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt712;
			@Pc(17) int local17 = arg4 - this.anInt713;
			@Pc(22) int local22 = arg5 - this.anInt712;
			@Pc(37) int local37 = arg2 - this.anInt713;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("55710, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLOWRGUJ", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg0 + arg4 - 1;
			@Pc(11) int local11 = arg3 + arg1 - 1;
			if (arg2 >= arg0 && arg2 <= local5 && arg5 >= arg3 && arg5 <= local11) {
				return true;
			} else if (arg2 == arg0 - 1 && arg5 >= arg3 && arg5 <= local11 && (this.anIntArrayArray19[arg2 - this.anInt712][arg5 - this.anInt713] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg2 == local5 + 1 && arg5 >= arg3 && arg5 <= local11 && (this.anIntArrayArray19[arg2 - this.anInt712][arg5 - this.anInt713] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg3 - 1 && arg2 >= arg0 && arg2 <= local5 && (this.anIntArrayArray19[arg2 - this.anInt712][arg5 - this.anInt713] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local11 + 1 && arg2 >= arg0 && arg2 <= local5 && (this.anIntArrayArray19[arg2 - this.anInt712][arg5 - this.anInt713] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("14296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + arg5 + ", " + arg6 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
