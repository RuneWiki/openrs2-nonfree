import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EMCOJCFH")
public final class Class11 {

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!EMCOJCFH", name = "b", descriptor = "I")
	private int anInt215 = -870;

	@OriginalMember(owner = "client!EMCOJCFH", name = "c", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!EMCOJCFH", name = "d", descriptor = "I")
	private int anInt216 = -454;

	@OriginalMember(owner = "client!EMCOJCFH", name = "e", descriptor = "I")
	private int anInt217 = 348;

	@OriginalMember(owner = "client!EMCOJCFH", name = "f", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!EMCOJCFH", name = "g", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!EMCOJCFH", name = "h", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!EMCOJCFH", name = "i", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!EMCOJCFH", name = "j", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!EMCOJCFH", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!EMCOJCFH", name = "<init>", descriptor = "(III)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt218 = 0;
			@Pc(28) int local28 = 41 / arg0;
			this.anInt219 = 0;
			this.anInt220 = arg1;
			this.anInt221 = arg2;
			this.anIntArrayArray8 = new int[this.anInt220][this.anInt221];
			this.method117();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("84974, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "()V")
	public void method117() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt220; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt221; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt220 - 1 || local7 == this.anInt221 - 1) {
					this.anIntArrayArray8[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray8[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IIIZII)V")
	public void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg2 - this.anInt218;
			@Pc(13) int local13 = arg1 - this.anInt219;
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method121(local8, local13, 128);
					this.method121(local8 - 1, local13, 8);
				}
				if (arg4 == 1) {
					this.method121(local8, local13, 2);
					this.method121(local8, local13 + 1, 32);
				}
				if (arg4 == 2) {
					this.method121(local8, local13, 8);
					this.method121(local8 + 1, local13, 128);
				}
				if (arg4 == 3) {
					this.method121(local8, local13, 32);
					this.method121(local8, local13 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method121(local8, local13, 1);
					this.method121(local8 - 1, local13 + 1, 16);
				}
				if (arg4 == 1) {
					this.method121(local8, local13, 4);
					this.method121(local8 + 1, local13 + 1, 64);
				}
				if (arg4 == 2) {
					this.method121(local8, local13, 16);
					this.method121(local8 + 1, local13 - 1, 1);
				}
				if (arg4 == 3) {
					this.method121(local8, local13, 64);
					this.method121(local8 - 1, local13 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method121(local8, local13, 130);
					this.method121(local8 - 1, local13, 8);
					this.method121(local8, local13 + 1, 32);
				}
				if (arg4 == 1) {
					this.method121(local8, local13, 10);
					this.method121(local8, local13 + 1, 32);
					this.method121(local8 + 1, local13, 128);
				}
				if (arg4 == 2) {
					this.method121(local8, local13, 40);
					this.method121(local8 + 1, local13, 128);
					this.method121(local8, local13 - 1, 2);
				}
				if (arg4 == 3) {
					this.method121(local8, local13, 160);
					this.method121(local8, local13 - 1, 2);
					this.method121(local8 - 1, local13, 8);
				}
			}
			if (arg3) {
				if (arg0 == 0) {
					if (arg4 == 0) {
						this.method121(local8, local13, 65536);
						this.method121(local8 - 1, local13, 4096);
					}
					if (arg4 == 1) {
						this.method121(local8, local13, 1024);
						this.method121(local8, local13 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method121(local8, local13, 4096);
						this.method121(local8 + 1, local13, 65536);
					}
					if (arg4 == 3) {
						this.method121(local8, local13, 16384);
						this.method121(local8, local13 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg4 == 0) {
						this.method121(local8, local13, 512);
						this.method121(local8 - 1, local13 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method121(local8, local13, 2048);
						this.method121(local8 + 1, local13 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method121(local8, local13, 8192);
						this.method121(local8 + 1, local13 - 1, 512);
					}
					if (arg4 == 3) {
						this.method121(local8, local13, 32768);
						this.method121(local8 - 1, local13 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg4 == 0) {
						this.method121(local8, local13, 66560);
						this.method121(local8 - 1, local13, 4096);
						this.method121(local8, local13 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method121(local8, local13, 5120);
						this.method121(local8, local13 + 1, 16384);
						this.method121(local8 + 1, local13, 65536);
					}
					if (arg4 == 2) {
						this.method121(local8, local13, 20480);
						this.method121(local8 + 1, local13, 65536);
						this.method121(local8, local13 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method121(local8, local13, 81920);
						this.method121(local8, local13 - 1, 1024);
						this.method121(local8 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("16511, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(ZIIIZII)V")
	public void method119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(8) int local8 = 256;
			if (arg3) {
				local8 = 131328;
			}
			@Pc(19) int local19 = arg5 - this.anInt218;
			@Pc(24) int local24 = arg2 - this.anInt219;
			@Pc(32) int local32;
			if (arg4 == 1 || arg4 == 3) {
				local32 = arg1;
				arg1 = arg0;
				arg0 = local32;
			}
			for (local32 = local19; local32 < local19 + arg1; local32++) {
				if (local32 >= 0 && local32 < this.anInt220) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg0; local48++) {
						if (local48 >= 0 && local48 < this.anInt221) {
							this.method121(local32, local48, local8);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("12526, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(BII)V")
	public void method120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(15) int local15 = arg1 - this.anInt218;
			@Pc(20) int local20 = arg0 - this.anInt219;
			this.anIntArrayArray8[local15][local20] |= 0x200000;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("82655, " + -105 + ", " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(III)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray8[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IIZIZI)V")
	public void method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt218;
			@Pc(12) int local12 = arg3 - this.anInt219;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method124(local7, local12, 128);
					this.method124(local7 - 1, local12, 8);
				}
				if (arg1 == 1) {
					this.method124(local7, local12, 2);
					this.method124(local7, local12 + 1, 32);
				}
				if (arg1 == 2) {
					this.method124(local7, local12, 8);
					this.method124(local7 + 1, local12, 128);
				}
				if (arg1 == 3) {
					this.method124(local7, local12, 32);
					this.method124(local7, local12 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method124(local7, local12, 1);
					this.method124(local7 - 1, local12 + 1, 16);
				}
				if (arg1 == 1) {
					this.method124(local7, local12, 4);
					this.method124(local7 + 1, local12 + 1, 64);
				}
				if (arg1 == 2) {
					this.method124(local7, local12, 16);
					this.method124(local7 + 1, local12 - 1, 1);
				}
				if (arg1 == 3) {
					this.method124(local7, local12, 64);
					this.method124(local7 - 1, local12 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method124(local7, local12, 130);
					this.method124(local7 - 1, local12, 8);
					this.method124(local7, local12 + 1, 32);
				}
				if (arg1 == 1) {
					this.method124(local7, local12, 10);
					this.method124(local7, local12 + 1, 32);
					this.method124(local7 + 1, local12, 128);
				}
				if (arg1 == 2) {
					this.method124(local7, local12, 40);
					this.method124(local7 + 1, local12, 128);
					this.method124(local7, local12 - 1, 2);
				}
				if (arg1 == 3) {
					this.method124(local7, local12, 160);
					this.method124(local7, local12 - 1, 2);
					this.method124(local7 - 1, local12, 8);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method124(local7, local12, 65536);
						this.method124(local7 - 1, local12, 4096);
					}
					if (arg1 == 1) {
						this.method124(local7, local12, 1024);
						this.method124(local7, local12 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method124(local7, local12, 4096);
						this.method124(local7 + 1, local12, 65536);
					}
					if (arg1 == 3) {
						this.method124(local7, local12, 16384);
						this.method124(local7, local12 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method124(local7, local12, 512);
						this.method124(local7 - 1, local12 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method124(local7, local12, 2048);
						this.method124(local7 + 1, local12 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method124(local7, local12, 8192);
						this.method124(local7 + 1, local12 - 1, 512);
					}
					if (arg1 == 3) {
						this.method124(local7, local12, 32768);
						this.method124(local7 - 1, local12 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method124(local7, local12, 66560);
						this.method124(local7 - 1, local12, 4096);
						this.method124(local7, local12 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method124(local7, local12, 5120);
						this.method124(local7, local12 + 1, 16384);
						this.method124(local7 + 1, local12, 65536);
					}
					if (arg1 == 2) {
						this.method124(local7, local12, 20480);
						this.method124(local7 + 1, local12, 65536);
						this.method124(local7, local12 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method124(local7, local12, 81920);
						this.method124(local7, local12 - 1, 1024);
						this.method124(local7 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("40243, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IIIZIII)V")
	public void method123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt218;
			@Pc(19) int local19 = arg5 - this.anInt219;
			@Pc(34) int local34;
			if (arg1 == 1 || arg1 == 3) {
				local34 = arg4;
				arg4 = arg3;
				arg3 = local34;
			}
			for (local34 = local14; local34 < local14 + arg4; local34++) {
				if (local34 >= 0 && local34 < this.anInt220) {
					for (@Pc(50) int local50 = local19; local50 < local19 + arg3; local50++) {
						if (local50 >= 0 && local50 < this.anInt221) {
							this.method124(local34, local50, local3);
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("78061, " + arg0 + ", " + -677 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IZII)V")
	private void method124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray8[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("38602, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IZI)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) int local14 = arg0 - this.anInt218;
			@Pc(19) int local19 = arg1 - this.anInt219;
			this.anIntArrayArray8[local14][local19] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("82358, " + arg0 + ", " + true + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 == arg3 && arg1 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt218;
			@Pc(17) int local17 = arg1 - this.anInt219;
			@Pc(22) int local22 = arg3 - this.anInt218;
			@Pc(27) int local27 = arg0 - this.anInt219;
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray8[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray8[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray8[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray8[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray8[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray8[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray8[local12][local17] & 0x1280120) == 0) {
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
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray8[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray8[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray8[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray8[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("92422, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 38743 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 == arg0 && arg2 == arg6) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt218;
			@Pc(17) int local17 = arg2 - this.anInt219;
			@Pc(22) int local22 = arg0 - this.anInt218;
			@Pc(26) boolean local26 = false;
			@Pc(31) int local31 = arg6 - this.anInt219;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local31 - 1 && (this.anIntArrayArray8[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local31 - 1 && (this.anIntArrayArray8[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local31 + 1 && (this.anIntArrayArray8[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local31 + 1 && (this.anIntArrayArray8[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local31 + 1 && (this.anIntArrayArray8[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local31 - 1 && (this.anIntArrayArray8[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local31 && (this.anIntArrayArray8[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("66863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMCOJCFH", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg4 - 1;
			@Pc(11) int local11 = arg0 + arg2 - 1;
			if (arg3 >= arg6 && arg3 <= local5 && arg5 >= arg0 && arg5 <= local11) {
				return true;
			} else if (arg3 == arg6 - 1 && arg5 >= arg0 && arg5 <= local11 && (this.anIntArrayArray8[arg3 - this.anInt218][arg5 - this.anInt219] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg3 == local5 + 1 && arg5 >= arg0 && arg5 <= local11 && (this.anIntArrayArray8[arg3 - this.anInt218][arg5 - this.anInt219] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg0 - 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray8[arg3 - this.anInt218][arg5 - this.anInt219] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local11 + 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray8[arg3 - this.anInt218][arg5 - this.anInt219] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("81285, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
