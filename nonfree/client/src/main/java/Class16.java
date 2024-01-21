import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQSCEHQI")
public final class Class16 {

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!GQSCEHQI", name = "b", descriptor = "I")
	private int anInt234 = 6;

	@OriginalMember(owner = "client!GQSCEHQI", name = "c", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!GQSCEHQI", name = "d", descriptor = "I")
	private int anInt235 = -207;

	@OriginalMember(owner = "client!GQSCEHQI", name = "e", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!GQSCEHQI", name = "f", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!GQSCEHQI", name = "g", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!GQSCEHQI", name = "h", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!GQSCEHQI", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!GQSCEHQI", name = "<init>", descriptor = "(III)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt236 = 0;
			this.anInt237 = 0;
			this.anInt238 = arg1;
			this.anInt239 = arg0;
			this.anIntArrayArray3 = new int[this.anInt238][this.anInt239];
			this.method106();
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("73003, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "()V")
	public void method106() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt238; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt239; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt238 - 1 || local7 == this.anInt239 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IBIIZI)V")
	public void method107(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 == 6) {
				@Pc(4) boolean local4 = false;
				@Pc(11) int local11 = arg3 - this.anInt236;
				@Pc(16) int local16 = arg0 - this.anInt237;
				if (arg5 == 0) {
					if (arg2 == 0) {
						this.method110(local11, local16, 128);
						this.method110(local11 - 1, local16, 8);
					}
					if (arg2 == 1) {
						this.method110(local11, local16, 2);
						this.method110(local11, local16 + 1, 32);
					}
					if (arg2 == 2) {
						this.method110(local11, local16, 8);
						this.method110(local11 + 1, local16, 128);
					}
					if (arg2 == 3) {
						this.method110(local11, local16, 32);
						this.method110(local11, local16 - 1, 2);
					}
				}
				if (arg5 == 1 || arg5 == 3) {
					if (arg2 == 0) {
						this.method110(local11, local16, 1);
						this.method110(local11 - 1, local16 + 1, 16);
					}
					if (arg2 == 1) {
						this.method110(local11, local16, 4);
						this.method110(local11 + 1, local16 + 1, 64);
					}
					if (arg2 == 2) {
						this.method110(local11, local16, 16);
						this.method110(local11 + 1, local16 - 1, 1);
					}
					if (arg2 == 3) {
						this.method110(local11, local16, 64);
						this.method110(local11 - 1, local16 - 1, 4);
					}
				}
				if (arg5 == 2) {
					if (arg2 == 0) {
						this.method110(local11, local16, 130);
						this.method110(local11 - 1, local16, 8);
						this.method110(local11, local16 + 1, 32);
					}
					if (arg2 == 1) {
						this.method110(local11, local16, 10);
						this.method110(local11, local16 + 1, 32);
						this.method110(local11 + 1, local16, 128);
					}
					if (arg2 == 2) {
						this.method110(local11, local16, 40);
						this.method110(local11 + 1, local16, 128);
						this.method110(local11, local16 - 1, 2);
					}
					if (arg2 == 3) {
						this.method110(local11, local16, 160);
						this.method110(local11, local16 - 1, 2);
						this.method110(local11 - 1, local16, 8);
					}
				}
				if (arg4) {
					if (arg5 == 0) {
						if (arg2 == 0) {
							this.method110(local11, local16, 65536);
							this.method110(local11 - 1, local16, 4096);
						}
						if (arg2 == 1) {
							this.method110(local11, local16, 1024);
							this.method110(local11, local16 + 1, 16384);
						}
						if (arg2 == 2) {
							this.method110(local11, local16, 4096);
							this.method110(local11 + 1, local16, 65536);
						}
						if (arg2 == 3) {
							this.method110(local11, local16, 16384);
							this.method110(local11, local16 - 1, 1024);
						}
					}
					if (arg5 == 1 || arg5 == 3) {
						if (arg2 == 0) {
							this.method110(local11, local16, 512);
							this.method110(local11 - 1, local16 + 1, 8192);
						}
						if (arg2 == 1) {
							this.method110(local11, local16, 2048);
							this.method110(local11 + 1, local16 + 1, 32768);
						}
						if (arg2 == 2) {
							this.method110(local11, local16, 8192);
							this.method110(local11 + 1, local16 - 1, 512);
						}
						if (arg2 == 3) {
							this.method110(local11, local16, 32768);
							this.method110(local11 - 1, local16 - 1, 2048);
						}
					}
					if (arg5 == 2) {
						if (arg2 == 0) {
							this.method110(local11, local16, 66560);
							this.method110(local11 - 1, local16, 4096);
							this.method110(local11, local16 + 1, 16384);
						}
						if (arg2 == 1) {
							this.method110(local11, local16, 5120);
							this.method110(local11, local16 + 1, 16384);
							this.method110(local11 + 1, local16, 65536);
						}
						if (arg2 == 2) {
							this.method110(local11, local16, 20480);
							this.method110(local11 + 1, local16, 65536);
							this.method110(local11, local16 - 1, 1024);
						}
						if (arg2 == 3) {
							this.method110(local11, local16, 81920);
							this.method110(local11, local16 - 1, 1024);
							this.method110(local11 - 1, local16, 4096);
							return;
						}
					}
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("74130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIBIIIZ)V")
	public void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(18) int local18 = arg1 - this.anInt236;
			@Pc(23) int local23 = arg2 - this.anInt237;
			@Pc(31) int local31;
			if (arg4 == 1 || arg4 == 3) {
				local31 = arg0;
				arg0 = arg3;
				arg3 = local31;
			}
			for (local31 = local18; local31 < local18 + arg0; local31++) {
				if (local31 >= 0 && local31 < this.anInt238) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg3; local47++) {
						if (local47 >= 0 && local47 < this.anInt239) {
							this.method110(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("70183, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(III)V")
	public void method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg0 - this.anInt236;
			@Pc(13) int local13 = arg1 - this.anInt237;
			this.anIntArrayArray3[local8][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("32702, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "b", descriptor = "(III)V")
	private void method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIIZII)V")
	public void method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt236;
			if (this.anInt234 == 6) {
				@Pc(14) int local14 = arg1 - this.anInt237;
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method113(local14, 128, local4);
						this.method113(local14, 8, local4 - 1);
					}
					if (arg3 == 1) {
						this.method113(local14, 2, local4);
						this.method113(local14 + 1, 32, local4);
					}
					if (arg3 == 2) {
						this.method113(local14, 8, local4);
						this.method113(local14, 128, local4 + 1);
					}
					if (arg3 == 3) {
						this.method113(local14, 32, local4);
						this.method113(local14 - 1, 2, local4);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method113(local14, 1, local4);
						this.method113(local14 + 1, 16, local4 - 1);
					}
					if (arg3 == 1) {
						this.method113(local14, 4, local4);
						this.method113(local14 + 1, 64, local4 + 1);
					}
					if (arg3 == 2) {
						this.method113(local14, 16, local4);
						this.method113(local14 - 1, 1, local4 + 1);
					}
					if (arg3 == 3) {
						this.method113(local14, 64, local4);
						this.method113(local14 - 1, 4, local4 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method113(local14, 130, local4);
						this.method113(local14, 8, local4 - 1);
						this.method113(local14 + 1, 32, local4);
					}
					if (arg3 == 1) {
						this.method113(local14, 10, local4);
						this.method113(local14 + 1, 32, local4);
						this.method113(local14, 128, local4 + 1);
					}
					if (arg3 == 2) {
						this.method113(local14, 40, local4);
						this.method113(local14, 128, local4 + 1);
						this.method113(local14 - 1, 2, local4);
					}
					if (arg3 == 3) {
						this.method113(local14, 160, local4);
						this.method113(local14 - 1, 2, local4);
						this.method113(local14, 8, local4 - 1);
					}
				}
				if (arg2) {
					if (arg4 == 0) {
						if (arg3 == 0) {
							this.method113(local14, 65536, local4);
							this.method113(local14, 4096, local4 - 1);
						}
						if (arg3 == 1) {
							this.method113(local14, 1024, local4);
							this.method113(local14 + 1, 16384, local4);
						}
						if (arg3 == 2) {
							this.method113(local14, 4096, local4);
							this.method113(local14, 65536, local4 + 1);
						}
						if (arg3 == 3) {
							this.method113(local14, 16384, local4);
							this.method113(local14 - 1, 1024, local4);
						}
					}
					if (arg4 == 1 || arg4 == 3) {
						if (arg3 == 0) {
							this.method113(local14, 512, local4);
							this.method113(local14 + 1, 8192, local4 - 1);
						}
						if (arg3 == 1) {
							this.method113(local14, 2048, local4);
							this.method113(local14 + 1, 32768, local4 + 1);
						}
						if (arg3 == 2) {
							this.method113(local14, 8192, local4);
							this.method113(local14 - 1, 512, local4 + 1);
						}
						if (arg3 == 3) {
							this.method113(local14, 32768, local4);
							this.method113(local14 - 1, 2048, local4 - 1);
						}
					}
					if (arg4 == 2) {
						if (arg3 == 0) {
							this.method113(local14, 66560, local4);
							this.method113(local14, 4096, local4 - 1);
							this.method113(local14 + 1, 16384, local4);
						}
						if (arg3 == 1) {
							this.method113(local14, 5120, local4);
							this.method113(local14 + 1, 16384, local4);
							this.method113(local14, 65536, local4 + 1);
						}
						if (arg3 == 2) {
							this.method113(local14, 20480, local4);
							this.method113(local14, 65536, local4 + 1);
							this.method113(local14 - 1, 1024, local4);
						}
						if (arg3 == 3) {
							this.method113(local14, 81920, local4);
							this.method113(local14 - 1, 1024, local4);
							this.method113(local14, 4096, local4 - 1);
							return;
						}
					}
				}
			}
		} catch (@Pc(522) RuntimeException local522) {
			signlink.reporterror("14622, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIIIZIZ)V")
	public void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt236;
			@Pc(22) int local22 = arg0 - this.anInt237;
			@Pc(30) int local30;
			if (arg2 == 1 || arg2 == 3) {
				local30 = arg5;
				arg5 = arg1;
				arg1 = local30;
			}
			for (local30 = local14; local30 < local14 + arg5; local30++) {
				if (local30 >= 0 && local30 < this.anInt238) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg1; local46++) {
						if (local46 >= 0 && local46 < this.anInt239) {
							this.method113(local46, local3, local30);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("59260, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIII)V")
	private void method113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray3[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("35984, " + 46401 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "c", descriptor = "(III)V")
	public void method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0 - this.anInt236;
			@Pc(18) int local18 = arg1 - this.anInt237;
			this.anIntArrayArray3[local13][local18] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("57014, " + -390 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg0 && arg5 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt236;
			@Pc(27) int local27 = arg5 - this.anInt237;
			@Pc(32) int local32 = arg0 - this.anInt236;
			@Pc(37) int local37 = arg1 - this.anInt237;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local12][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local12][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray3[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray3[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray3[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("31441, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 40655 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg5 && arg0 == arg4) {
				return true;
			}
			@Pc(20) int local20 = arg3 - this.anInt236;
			@Pc(25) int local25 = arg0 - this.anInt237;
			@Pc(30) int local30 = arg5 - this.anInt236;
			@Pc(35) int local35 = arg4 - this.anInt237;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x80) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray3[local20][local25] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x8) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray3[local20][local25] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x8) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray3[local20][local25] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x80) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray3[local20][local25] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray3[local20][local25] & 0x20) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray3[local20][local25] & 0x2) == 0) {
					return true;
				}
				if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x8) == 0) {
					return true;
				}
				if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray3[local20][local25] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("7203, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -633 + ", " + arg5 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQSCEHQI", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg4 + arg5 - 1;
			@Pc(11) int local11 = arg3 + arg1 - 1;
			if (arg6 >= arg4 && arg6 <= local5 && arg0 >= arg3 && arg0 <= local11) {
				return true;
			} else if (arg6 == arg4 - 1 && arg0 >= arg3 && arg0 <= local11 && (this.anIntArrayArray3[arg6 - this.anInt236][arg0 - this.anInt237] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg6 == local5 + 1 && arg0 >= arg3 && arg0 <= local11 && (this.anIntArrayArray3[arg6 - this.anInt236][arg0 - this.anInt237] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg3 - 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray3[arg6 - this.anInt236][arg0 - this.anInt237] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local11 + 1 && arg6 >= arg4 && arg6 <= local5 && (this.anIntArrayArray3[arg6 - this.anInt236][arg0 - this.anInt237] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("65406, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
