import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CAMRNFMB")
public final class Class5 {

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "B")
	private byte aByte7 = 51;

	@OriginalMember(owner = "client!CAMRNFMB", name = "c", descriptor = "I")
	private int anInt76 = -245;

	@OriginalMember(owner = "client!CAMRNFMB", name = "d", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!CAMRNFMB", name = "e", descriptor = "I")
	private int anInt77 = 16288;

	@OriginalMember(owner = "client!CAMRNFMB", name = "f", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!CAMRNFMB", name = "g", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!CAMRNFMB", name = "h", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!CAMRNFMB", name = "i", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!CAMRNFMB", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!CAMRNFMB", name = "<init>", descriptor = "(IBI)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt78 = 0;
			if (arg1 != this.aByte7) {
				this.aBoolean36 = !this.aBoolean36;
			}
			this.anInt79 = 0;
			this.anInt80 = arg0;
			this.anInt81 = arg2;
			this.anIntArrayArray4 = new int[this.anInt80][this.anInt81];
			this.method40();
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("32928, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "()V")
	public void method40() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt80; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt81; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt80 - 1 || local7 == this.anInt81 - 1) {
					this.anIntArrayArray4[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray4[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIZI)V")
	public void method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt78;
			@Pc(9) int local9 = arg1 - this.anInt79;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method44(local4, local9, 128);
					this.method44(local4 - 1, local9, 8);
				}
				if (arg4 == 1) {
					this.method44(local4, local9, 2);
					this.method44(local4, local9 + 1, 32);
				}
				if (arg4 == 2) {
					this.method44(local4, local9, 8);
					this.method44(local4 + 1, local9, 128);
				}
				if (arg4 == 3) {
					this.method44(local4, local9, 32);
					this.method44(local4, local9 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method44(local4, local9, 1);
					this.method44(local4 - 1, local9 + 1, 16);
				}
				if (arg4 == 1) {
					this.method44(local4, local9, 4);
					this.method44(local4 + 1, local9 + 1, 64);
				}
				if (arg4 == 2) {
					this.method44(local4, local9, 16);
					this.method44(local4 + 1, local9 - 1, 1);
				}
				if (arg4 == 3) {
					this.method44(local4, local9, 64);
					this.method44(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method44(local4, local9, 130);
					this.method44(local4 - 1, local9, 8);
					this.method44(local4, local9 + 1, 32);
				}
				if (arg4 == 1) {
					this.method44(local4, local9, 10);
					this.method44(local4, local9 + 1, 32);
					this.method44(local4 + 1, local9, 128);
				}
				if (arg4 == 2) {
					this.method44(local4, local9, 40);
					this.method44(local4 + 1, local9, 128);
					this.method44(local4, local9 - 1, 2);
				}
				if (arg4 == 3) {
					this.method44(local4, local9, 160);
					this.method44(local4, local9 - 1, 2);
					this.method44(local4 - 1, local9, 8);
				}
			}
			if (arg3) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method44(local4, local9, 65536);
						this.method44(local4 - 1, local9, 4096);
					}
					if (arg4 == 1) {
						this.method44(local4, local9, 1024);
						this.method44(local4, local9 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method44(local4, local9, 4096);
						this.method44(local4 + 1, local9, 65536);
					}
					if (arg4 == 3) {
						this.method44(local4, local9, 16384);
						this.method44(local4, local9 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method44(local4, local9, 512);
						this.method44(local4 - 1, local9 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method44(local4, local9, 2048);
						this.method44(local4 + 1, local9 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method44(local4, local9, 8192);
						this.method44(local4 + 1, local9 - 1, 512);
					}
					if (arg4 == 3) {
						this.method44(local4, local9, 32768);
						this.method44(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method44(local4, local9, 66560);
						this.method44(local4 - 1, local9, 4096);
						this.method44(local4, local9 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method44(local4, local9, 5120);
						this.method44(local4, local9 + 1, 16384);
						this.method44(local4 + 1, local9, 65536);
					}
					if (arg4 == 2) {
						this.method44(local4, local9, 20480);
						this.method44(local4 + 1, local9, 65536);
						this.method44(local4, local9 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method44(local4, local9, 81920);
						this.method44(local4, local9 - 1, 1024);
						this.method44(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("30540, " + -245 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IZIIIII)V")
	public void method42(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(13) int local13 = 256;
			if (arg1) {
				local13 = 131328;
			}
			@Pc(24) int local24 = arg3 - this.anInt78;
			@Pc(29) int local29 = arg2 - this.anInt79;
			@Pc(37) int local37;
			if (arg5 == 1 || arg5 == 3) {
				local37 = arg4;
				arg4 = arg0;
				arg0 = local37;
			}
			for (local37 = local24; local37 < local24 + arg4; local37++) {
				if (local37 >= 0 && local37 < this.anInt80) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg0; local53++) {
						if (local53 >= 0 && local53 < this.anInt81) {
							this.method44(local37, local53, local13);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("12252, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(III)V")
	public void method43(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt78;
			@Pc(18) int local18 = arg0 - this.anInt79;
			this.anIntArrayArray4[local4][local18] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("1329, " + 104 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "(III)V")
	private void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray4[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IZIIII)V")
	public void method45(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt78;
			if (arg2 < 0) {
				@Pc(12) int local12 = arg3 - this.anInt79;
				if (arg4 == 0) {
					if (arg5 == 0) {
						this.method47(128, local4, local12);
						this.method47(8, local4 - 1, local12);
					}
					if (arg5 == 1) {
						this.method47(2, local4, local12);
						this.method47(32, local4, local12 + 1);
					}
					if (arg5 == 2) {
						this.method47(8, local4, local12);
						this.method47(128, local4 + 1, local12);
					}
					if (arg5 == 3) {
						this.method47(32, local4, local12);
						this.method47(2, local4, local12 - 1);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg5 == 0) {
						this.method47(1, local4, local12);
						this.method47(16, local4 - 1, local12 + 1);
					}
					if (arg5 == 1) {
						this.method47(4, local4, local12);
						this.method47(64, local4 + 1, local12 + 1);
					}
					if (arg5 == 2) {
						this.method47(16, local4, local12);
						this.method47(1, local4 + 1, local12 - 1);
					}
					if (arg5 == 3) {
						this.method47(64, local4, local12);
						this.method47(4, local4 - 1, local12 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg5 == 0) {
						this.method47(130, local4, local12);
						this.method47(8, local4 - 1, local12);
						this.method47(32, local4, local12 + 1);
					}
					if (arg5 == 1) {
						this.method47(10, local4, local12);
						this.method47(32, local4, local12 + 1);
						this.method47(128, local4 + 1, local12);
					}
					if (arg5 == 2) {
						this.method47(40, local4, local12);
						this.method47(128, local4 + 1, local12);
						this.method47(2, local4, local12 - 1);
					}
					if (arg5 == 3) {
						this.method47(160, local4, local12);
						this.method47(2, local4, local12 - 1);
						this.method47(8, local4 - 1, local12);
					}
				}
				if (arg1) {
					if (arg4 == 0) {
						if (arg5 == 0) {
							this.method47(65536, local4, local12);
							this.method47(4096, local4 - 1, local12);
						}
						if (arg5 == 1) {
							this.method47(1024, local4, local12);
							this.method47(16384, local4, local12 + 1);
						}
						if (arg5 == 2) {
							this.method47(4096, local4, local12);
							this.method47(65536, local4 + 1, local12);
						}
						if (arg5 == 3) {
							this.method47(16384, local4, local12);
							this.method47(1024, local4, local12 - 1);
						}
					}
					if (arg4 == 1 || arg4 == 3) {
						if (arg5 == 0) {
							this.method47(512, local4, local12);
							this.method47(8192, local4 - 1, local12 + 1);
						}
						if (arg5 == 1) {
							this.method47(2048, local4, local12);
							this.method47(32768, local4 + 1, local12 + 1);
						}
						if (arg5 == 2) {
							this.method47(8192, local4, local12);
							this.method47(512, local4 + 1, local12 - 1);
						}
						if (arg5 == 3) {
							this.method47(32768, local4, local12);
							this.method47(2048, local4 - 1, local12 - 1);
						}
					}
					if (arg4 == 2) {
						if (arg5 == 0) {
							this.method47(66560, local4, local12);
							this.method47(4096, local4 - 1, local12);
							this.method47(16384, local4, local12 + 1);
						}
						if (arg5 == 1) {
							this.method47(5120, local4, local12);
							this.method47(16384, local4, local12 + 1);
							this.method47(65536, local4 + 1, local12);
						}
						if (arg5 == 2) {
							this.method47(20480, local4, local12);
							this.method47(65536, local4 + 1, local12);
							this.method47(1024, local4, local12 - 1);
						}
						if (arg5 == 3) {
							this.method47(81920, local4, local12);
							this.method47(1024, local4, local12 - 1);
							this.method47(4096, local4 - 1, local12);
							return;
						}
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("55053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "b", descriptor = "(IZIIIII)V")
	public void method46(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt78;
			if (this.anInt77 == 16288) {
				@Pc(24) int local24 = arg5 - this.anInt79;
				@Pc(32) int local32;
				if (arg2 == 1 || arg2 == 3) {
					local32 = arg3;
					arg3 = arg0;
					arg0 = local32;
				}
				for (local32 = local14; local32 < local14 + arg3; local32++) {
					if (local32 >= 0 && local32 < this.anInt80) {
						for (@Pc(48) int local48 = local24; local48 < local24 + arg0; local48++) {
							if (local48 >= 0 && local48 < this.anInt81) {
								this.method47(local3, local32, local48);
							}
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("15173, " + arg0 + ", " + arg1 + ", " + 16288 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIII)V")
	private void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray4[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64559, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -20900 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "c", descriptor = "(III)V")
	public void method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt78;
			@Pc(9) int local9 = arg2 - this.anInt79;
			this.anIntArrayArray4[local4][local9] &= 0xDFFFFF;
			@Pc(23) int local23 = 70 / arg1;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("38587, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIBII)Z")
	public boolean method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg2 == arg0 && arg1 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt78;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg1 - this.anInt79;
			@Pc(33) int local33 = arg0 - this.anInt78;
			@Pc(38) int local38 = arg3 - this.anInt79;
			if (arg6 == 0) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray4[local12][local28] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray4[local12][local28] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray4[local12][local28] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray4[local12][local28] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg5 == 0) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray4[local12][local28] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray4[local12][local28] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray4[local12][local28] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local33 - 1 && local28 == local38) {
						return true;
					}
					if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray4[local12][local28] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local33 && local28 == local38 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local12 == local33 && local28 == local38 + 1 && (this.anIntArrayArray4[local12][local28] & 0x20) == 0) {
					return true;
				}
				if (local12 == local33 && local28 == local38 - 1 && (this.anIntArrayArray4[local12][local28] & 0x2) == 0) {
					return true;
				}
				if (local12 == local33 - 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x8) == 0) {
					return true;
				}
				if (local12 == local33 + 1 && local28 == local38 && (this.anIntArrayArray4[local12][local28] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("1344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 == arg2 && arg5 == arg3) {
				return true;
			}
			@Pc(14) int local14 = arg6 - this.anInt78;
			@Pc(19) int local19 = arg5 - this.anInt79;
			while (arg0 >= 0) {
				for (@Pc(23) int local23 = 1; local23 > 0; local23++) {
				}
			}
			@Pc(35) int local35 = arg2 - this.anInt78;
			@Pc(40) int local40 = arg3 - this.anInt79;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local14 == local35 + 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local35 && local19 == local40 - 1 && (this.anIntArrayArray4[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local14 == local35 - 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local35 && local19 == local40 - 1 && (this.anIntArrayArray4[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local14 == local35 - 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local35 && local19 == local40 + 1 && (this.anIntArrayArray4[local14][local19] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local14 == local35 + 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local35 && local19 == local40 + 1 && (this.anIntArrayArray4[local14][local19] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local14 == local35 && local19 == local40 + 1 && (this.anIntArrayArray4[local14][local19] & 0x20) == 0) {
					return true;
				}
				if (local14 == local35 && local19 == local40 - 1 && (this.anIntArrayArray4[local14][local19] & 0x2) == 0) {
					return true;
				}
				if (local14 == local35 - 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x8) == 0) {
					return true;
				}
				if (local14 == local35 + 1 && local19 == local40 && (this.anIntArrayArray4[local14][local19] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("44012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CAMRNFMB", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method51(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg4 + arg2 - 1;
			@Pc(11) int local11 = arg0 + arg1 - 1;
			if (arg6 >= arg4 && arg6 <= local5 && arg3 >= arg0 && arg3 <= local11) {
				return true;
			} else if (arg6 == arg4 - 1 && arg3 >= arg0 && arg3 <= local11 && (this.anIntArrayArray4[arg6 - this.anInt78][arg3 - this.anInt79] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg3 >= arg0 && arg3 <= local11 && (this.anIntArrayArray4[arg6 - this.anInt78][arg3 - this.anInt79] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg0 - 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray4[arg6 - this.anInt78][arg3 - this.anInt79] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local11 + 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray4[arg6 - this.anInt78][arg3 - this.anInt79] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("70445, " + arg0 + ", " + -15341 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
