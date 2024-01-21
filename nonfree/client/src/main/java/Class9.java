import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "B")
	private byte aByte24 = 45;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt377 = 9;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(III)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt378 = 0;
			this.anInt379 = 0;
			this.anInt380 = arg0;
			this.anInt381 = arg1;
			this.anIntArrayArray10 = new int[this.anInt380][this.anInt381];
			this.method249();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("78421, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method249() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt380; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt381; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt380 - 1 || local7 == this.anInt381 - 1) {
						this.anIntArrayArray10[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray10[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("46709, " + 930 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIZZ)V")
	public void method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(14) int local14 = arg1 - this.anInt378;
			@Pc(19) int local19 = arg0 - this.anInt379;
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method253(local14, local19, 128);
					this.method253(local14 - 1, local19, 8);
				}
				if (arg3 == 1) {
					this.method253(local14, local19, 2);
					this.method253(local14, local19 + 1, 32);
				}
				if (arg3 == 2) {
					this.method253(local14, local19, 8);
					this.method253(local14 + 1, local19, 128);
				}
				if (arg3 == 3) {
					this.method253(local14, local19, 32);
					this.method253(local14, local19 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method253(local14, local19, 1);
					this.method253(local14 - 1, local19 + 1, 16);
				}
				if (arg3 == 1) {
					this.method253(local14, local19, 4);
					this.method253(local14 + 1, local19 + 1, 64);
				}
				if (arg3 == 2) {
					this.method253(local14, local19, 16);
					this.method253(local14 + 1, local19 - 1, 1);
				}
				if (arg3 == 3) {
					this.method253(local14, local19, 64);
					this.method253(local14 - 1, local19 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method253(local14, local19, 130);
					this.method253(local14 - 1, local19, 8);
					this.method253(local14, local19 + 1, 32);
				}
				if (arg3 == 1) {
					this.method253(local14, local19, 10);
					this.method253(local14, local19 + 1, 32);
					this.method253(local14 + 1, local19, 128);
				}
				if (arg3 == 2) {
					this.method253(local14, local19, 40);
					this.method253(local14 + 1, local19, 128);
					this.method253(local14, local19 - 1, 2);
				}
				if (arg3 == 3) {
					this.method253(local14, local19, 160);
					this.method253(local14, local19 - 1, 2);
					this.method253(local14 - 1, local19, 8);
				}
			}
			if (arg4) {
				if (arg2 == 0) {
					if (arg3 == 0) {
						this.method253(local14, local19, 65536);
						this.method253(local14 - 1, local19, 4096);
					}
					if (arg3 == 1) {
						this.method253(local14, local19, 1024);
						this.method253(local14, local19 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method253(local14, local19, 4096);
						this.method253(local14 + 1, local19, 65536);
					}
					if (arg3 == 3) {
						this.method253(local14, local19, 16384);
						this.method253(local14, local19 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg3 == 0) {
						this.method253(local14, local19, 512);
						this.method253(local14 - 1, local19 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method253(local14, local19, 2048);
						this.method253(local14 + 1, local19 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method253(local14, local19, 8192);
						this.method253(local14 + 1, local19 - 1, 512);
					}
					if (arg3 == 3) {
						this.method253(local14, local19, 32768);
						this.method253(local14 - 1, local19 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg3 == 0) {
						this.method253(local14, local19, 66560);
						this.method253(local14 - 1, local19, 4096);
						this.method253(local14, local19 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method253(local14, local19, 5120);
						this.method253(local14, local19 + 1, 16384);
						this.method253(local14 + 1, local19, 65536);
					}
					if (arg3 == 2) {
						this.method253(local14, local19, 20480);
						this.method253(local14 + 1, local19, 65536);
						this.method253(local14, local19 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method253(local14, local19, 81920);
						this.method253(local14, local19 - 1, 1024);
						this.method253(local14 - 1, local19, 4096);
						return;
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("62194, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIZIIZ)V")
	public void method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = 256;
			if (arg3) {
				local8 = 131328;
			}
			@Pc(19) int local19 = arg1 - this.anInt378;
			@Pc(24) int local24 = arg2 - this.anInt379;
			@Pc(32) int local32;
			if (arg5 == 1 || arg5 == 3) {
				local32 = arg0;
				arg0 = arg4;
				arg4 = local32;
			}
			for (local32 = local19; local32 < local19 + arg0; local32++) {
				if (local32 >= 0 && local32 < this.anInt380) {
					for (@Pc(48) int local48 = local24; local48 < local24 + arg4; local48++) {
						if (local48 >= 0 && local48 < this.anInt381) {
							this.method253(local32, local48, local8);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("13989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	public void method252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt378;
			@Pc(9) int local9 = arg0 - this.anInt379;
			this.anIntArrayArray10[local4][local9] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("21612, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	private void method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray10[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIZI)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt378;
			@Pc(19) int local19 = arg2 - this.anInt379;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method256(local4, 128, local19);
					this.method256(local4 - 1, 8, local19);
				}
				if (arg4 == 1) {
					this.method256(local4, 2, local19);
					this.method256(local4, 32, local19 + 1);
				}
				if (arg4 == 2) {
					this.method256(local4, 8, local19);
					this.method256(local4 + 1, 128, local19);
				}
				if (arg4 == 3) {
					this.method256(local4, 32, local19);
					this.method256(local4, 2, local19 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method256(local4, 1, local19);
					this.method256(local4 - 1, 16, local19 + 1);
				}
				if (arg4 == 1) {
					this.method256(local4, 4, local19);
					this.method256(local4 + 1, 64, local19 + 1);
				}
				if (arg4 == 2) {
					this.method256(local4, 16, local19);
					this.method256(local4 + 1, 1, local19 - 1);
				}
				if (arg4 == 3) {
					this.method256(local4, 64, local19);
					this.method256(local4 - 1, 4, local19 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method256(local4, 130, local19);
					this.method256(local4 - 1, 8, local19);
					this.method256(local4, 32, local19 + 1);
				}
				if (arg4 == 1) {
					this.method256(local4, 10, local19);
					this.method256(local4, 32, local19 + 1);
					this.method256(local4 + 1, 128, local19);
				}
				if (arg4 == 2) {
					this.method256(local4, 40, local19);
					this.method256(local4 + 1, 128, local19);
					this.method256(local4, 2, local19 - 1);
				}
				if (arg4 == 3) {
					this.method256(local4, 160, local19);
					this.method256(local4, 2, local19 - 1);
					this.method256(local4 - 1, 8, local19);
				}
			}
			if (arg3) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method256(local4, 65536, local19);
						this.method256(local4 - 1, 4096, local19);
					}
					if (arg4 == 1) {
						this.method256(local4, 1024, local19);
						this.method256(local4, 16384, local19 + 1);
					}
					if (arg4 == 2) {
						this.method256(local4, 4096, local19);
						this.method256(local4 + 1, 65536, local19);
					}
					if (arg4 == 3) {
						this.method256(local4, 16384, local19);
						this.method256(local4, 1024, local19 - 1);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method256(local4, 512, local19);
						this.method256(local4 - 1, 8192, local19 + 1);
					}
					if (arg4 == 1) {
						this.method256(local4, 2048, local19);
						this.method256(local4 + 1, 32768, local19 + 1);
					}
					if (arg4 == 2) {
						this.method256(local4, 8192, local19);
						this.method256(local4 + 1, 512, local19 - 1);
					}
					if (arg4 == 3) {
						this.method256(local4, 32768, local19);
						this.method256(local4 - 1, 2048, local19 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method256(local4, 66560, local19);
						this.method256(local4 - 1, 4096, local19);
						this.method256(local4, 16384, local19 + 1);
					}
					if (arg4 == 1) {
						this.method256(local4, 5120, local19);
						this.method256(local4, 16384, local19 + 1);
						this.method256(local4 + 1, 65536, local19);
					}
					if (arg4 == 2) {
						this.method256(local4, 20480, local19);
						this.method256(local4 + 1, 65536, local19);
						this.method256(local4, 1024, local19 - 1);
					}
					if (arg4 == 3) {
						this.method256(local4, 81920, local19);
						this.method256(local4, 1024, local19 - 1);
						this.method256(local4 - 1, 4096, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("49286, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIBIII)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (this.aByte24 == 45) {
				if (arg1) {
					local3 = 131328;
				}
				@Pc(19) int local19 = arg2 - this.anInt378;
				@Pc(24) int local24 = arg3 - this.anInt379;
				@Pc(32) int local32;
				if (arg0 == 1 || arg0 == 3) {
					local32 = arg4;
					arg4 = arg5;
					arg5 = local32;
				}
				for (local32 = local19; local32 < local19 + arg4; local32++) {
					if (local32 >= 0 && local32 < this.anInt380) {
						for (@Pc(48) int local48 = local24; local48 < local24 + arg5; local48++) {
							if (local48 >= 0 && local48 < this.anInt381) {
								this.method256(local32, local3, local48);
							}
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("59995, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 45 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZII)V")
	private void method256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray10[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("60239, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
	public void method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt378;
			@Pc(13) int local13 = arg0 - this.anInt379;
			this.anIntArrayArray10[local4][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("12798, " + arg0 + ", " + arg1 + ", " + -5686 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg4 && arg2 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt378;
			@Pc(17) int local17 = arg2 - this.anInt379;
			@Pc(22) int local22 = arg4 - this.anInt378;
			@Pc(36) int local36 = arg0 - this.anInt379;
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray10[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray10[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray10[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray10[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray10[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray10[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray10[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local22 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray10[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray10[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray10[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray10[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("40410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBIIII)Z")
	public boolean method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg1 && arg0 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt378;
			@Pc(17) int local17 = arg0 - this.anInt379;
			@Pc(22) int local22 = arg1 - this.anInt378;
			@Pc(34) int local34 = arg3 - this.anInt379;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray10[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray10[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray10[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray10[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local22 && local17 == local34 + 1 && (this.anIntArrayArray10[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local34 - 1 && (this.anIntArrayArray10[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local34 && (this.anIntArrayArray10[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("64781, " + arg0 + ", " + arg1 + ", " + -89 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg1 - 1;
			@Pc(11) int local11 = arg2 + arg4 - 1;
			if (arg0 >= arg3 && arg0 <= local5 && arg6 >= arg2 && arg6 <= local11) {
				return true;
			} else if (arg0 == arg3 - 1 && arg6 >= arg2 && arg6 <= local11 && (this.anIntArrayArray10[arg0 - this.anInt378][arg6 - this.anInt379] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg0 == local5 + 1 && arg6 >= arg2 && arg6 <= local11 && (this.anIntArrayArray10[arg0 - this.anInt378][arg6 - this.anInt379] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg2 - 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray10[arg0 - this.anInt378][arg6 - this.anInt379] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local11 + 1 && arg0 >= arg3 && arg0 <= local5 && (this.anIntArrayArray10[arg0 - this.anInt378][arg6 - this.anInt379] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("44187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}
}
