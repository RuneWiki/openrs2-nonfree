import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AOKWRKNA")
public final class Class1 {

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!AOKWRKNA", name = "c", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "client!AOKWRKNA", name = "d", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AOKWRKNA", name = "e", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AOKWRKNA", name = "f", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!AOKWRKNA", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!AOKWRKNA", name = "<init>", descriptor = "(III)V")
	public Class1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) int local11 = 24 / arg0;
			this.anInt1 = 0;
			this.anInt2 = 0;
			this.anInt3 = arg1;
			this.anInt4 = arg2;
			this.anIntArrayArray1 = new int[this.anInt3][this.anInt4];
			this.method1();
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("15337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "()V")
	public void method1() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt4; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt3 - 1 || local7 == this.anInt4 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(BIIZII)V")
	public void method2(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt1;
			@Pc(9) int local9 = arg0 - this.anInt2;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method5(local4, local9, 128);
					this.method5(local4 - 1, local9, 8);
				}
				if (arg3 == 1) {
					this.method5(local4, local9, 2);
					this.method5(local4, local9 + 1, 32);
				}
				if (arg3 == 2) {
					this.method5(local4, local9, 8);
					this.method5(local4 + 1, local9, 128);
				}
				if (arg3 == 3) {
					this.method5(local4, local9, 32);
					this.method5(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method5(local4, local9, 1);
					this.method5(local4 - 1, local9 + 1, 16);
				}
				if (arg3 == 1) {
					this.method5(local4, local9, 4);
					this.method5(local4 + 1, local9 + 1, 64);
				}
				if (arg3 == 2) {
					this.method5(local4, local9, 16);
					this.method5(local4 + 1, local9 - 1, 1);
				}
				if (arg3 == 3) {
					this.method5(local4, local9, 64);
					this.method5(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method5(local4, local9, 130);
					this.method5(local4 - 1, local9, 8);
					this.method5(local4, local9 + 1, 32);
				}
				if (arg3 == 1) {
					this.method5(local4, local9, 10);
					this.method5(local4, local9 + 1, 32);
					this.method5(local4 + 1, local9, 128);
				}
				if (arg3 == 2) {
					this.method5(local4, local9, 40);
					this.method5(local4 + 1, local9, 128);
					this.method5(local4, local9 - 1, 2);
				}
				if (arg3 == 3) {
					this.method5(local4, local9, 160);
					this.method5(local4, local9 - 1, 2);
					this.method5(local4 - 1, local9, 8);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method5(local4, local9, 65536);
						this.method5(local4 - 1, local9, 4096);
					}
					if (arg3 == 1) {
						this.method5(local4, local9, 1024);
						this.method5(local4, local9 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method5(local4, local9, 4096);
						this.method5(local4 + 1, local9, 65536);
					}
					if (arg3 == 3) {
						this.method5(local4, local9, 16384);
						this.method5(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method5(local4, local9, 512);
						this.method5(local4 - 1, local9 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method5(local4, local9, 2048);
						this.method5(local4 + 1, local9 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method5(local4, local9, 8192);
						this.method5(local4 + 1, local9 - 1, 512);
					}
					if (arg3 == 3) {
						this.method5(local4, local9, 32768);
						this.method5(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method5(local4, local9, 66560);
						this.method5(local4 - 1, local9, 4096);
						this.method5(local4, local9 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method5(local4, local9, 5120);
						this.method5(local4, local9 + 1, 16384);
						this.method5(local4 + 1, local9, 65536);
					}
					if (arg3 == 2) {
						this.method5(local4, local9, 20480);
						this.method5(local4 + 1, local9, 65536);
						this.method5(local4, local9 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method5(local4, local9, 81920);
						this.method5(local4, local9 - 1, 1024);
						this.method5(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("91594, " + 61 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIIIZII)V")
	public void method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt1;
			@Pc(19) int local19 = arg1 - this.anInt2;
			@Pc(27) int local27;
			if (arg2 == 1 || arg2 == 3) {
				local27 = arg0;
				arg0 = arg5;
				arg5 = local27;
			}
			for (local27 = local14; local27 < local14 + arg0; local27++) {
				if (local27 >= 0 && local27 < this.anInt3) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg5; local43++) {
						if (local43 >= 0 && local43 < this.anInt4) {
							this.method5(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("31563, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(III)V")
	public void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt1;
			if (arg1 >= 0) {
				for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
				}
			}
			@Pc(18) int local18 = arg0 - this.anInt2;
			this.anIntArrayArray1[local4][local18] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("48869, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "(III)V")
	private void method5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IZIIII)V")
	public void method6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt1;
			@Pc(12) int local12 = arg4 - this.anInt2;
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method8(local12, local4, 798, 128);
					this.method8(local12, local4 - 1, 798, 8);
				}
				if (arg2 == 1) {
					this.method8(local12, local4, 798, 2);
					this.method8(local12 + 1, local4, 798, 32);
				}
				if (arg2 == 2) {
					this.method8(local12, local4, 798, 8);
					this.method8(local12, local4 + 1, 798, 128);
				}
				if (arg2 == 3) {
					this.method8(local12, local4, 798, 32);
					this.method8(local12 - 1, local4, 798, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method8(local12, local4, 798, 1);
					this.method8(local12 + 1, local4 - 1, 798, 16);
				}
				if (arg2 == 1) {
					this.method8(local12, local4, 798, 4);
					this.method8(local12 + 1, local4 + 1, 798, 64);
				}
				if (arg2 == 2) {
					this.method8(local12, local4, 798, 16);
					this.method8(local12 - 1, local4 + 1, 798, 1);
				}
				if (arg2 == 3) {
					this.method8(local12, local4, 798, 64);
					this.method8(local12 - 1, local4 - 1, 798, 4);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method8(local12, local4, 798, 130);
					this.method8(local12, local4 - 1, 798, 8);
					this.method8(local12 + 1, local4, 798, 32);
				}
				if (arg2 == 1) {
					this.method8(local12, local4, 798, 10);
					this.method8(local12 + 1, local4, 798, 32);
					this.method8(local12, local4 + 1, 798, 128);
				}
				if (arg2 == 2) {
					this.method8(local12, local4, 798, 40);
					this.method8(local12, local4 + 1, 798, 128);
					this.method8(local12 - 1, local4, 798, 2);
				}
				if (arg2 == 3) {
					this.method8(local12, local4, 798, 160);
					this.method8(local12 - 1, local4, 798, 2);
					this.method8(local12, local4 - 1, 798, 8);
				}
			}
			if (arg1) {
				if (arg0 == 0) {
					if (arg2 == 0) {
						this.method8(local12, local4, 798, 65536);
						this.method8(local12, local4 - 1, 798, 4096);
					}
					if (arg2 == 1) {
						this.method8(local12, local4, 798, 1024);
						this.method8(local12 + 1, local4, 798, 16384);
					}
					if (arg2 == 2) {
						this.method8(local12, local4, 798, 4096);
						this.method8(local12, local4 + 1, 798, 65536);
					}
					if (arg2 == 3) {
						this.method8(local12, local4, 798, 16384);
						this.method8(local12 - 1, local4, 798, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg2 == 0) {
						this.method8(local12, local4, 798, 512);
						this.method8(local12 + 1, local4 - 1, 798, 8192);
					}
					if (arg2 == 1) {
						this.method8(local12, local4, 798, 2048);
						this.method8(local12 + 1, local4 + 1, 798, 32768);
					}
					if (arg2 == 2) {
						this.method8(local12, local4, 798, 8192);
						this.method8(local12 - 1, local4 + 1, 798, 512);
					}
					if (arg2 == 3) {
						this.method8(local12, local4, 798, 32768);
						this.method8(local12 - 1, local4 - 1, 798, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg2 == 0) {
						this.method8(local12, local4, 798, 66560);
						this.method8(local12, local4 - 1, 798, 4096);
						this.method8(local12 + 1, local4, 798, 16384);
					}
					if (arg2 == 1) {
						this.method8(local12, local4, 798, 5120);
						this.method8(local12 + 1, local4, 798, 16384);
						this.method8(local12, local4 + 1, 798, 65536);
					}
					if (arg2 == 2) {
						this.method8(local12, local4, 798, 20480);
						this.method8(local12, local4 + 1, 798, 65536);
						this.method8(local12 - 1, local4, 798, 1024);
					}
					if (arg2 == 3) {
						this.method8(local12, local4, 798, 81920);
						this.method8(local12 - 1, local4, 798, 1024);
						this.method8(local12, local4 - 1, 798, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("85305, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(ZIIIIII)V")
	public void method7(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt1;
			@Pc(19) int local19 = arg3 - this.anInt2;
			@Pc(36) int local36;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg5;
				arg5 = arg1;
				arg1 = local36;
			}
			for (local36 = local14; local36 < local14 + arg5; local36++) {
				if (local36 >= 0 && local36 < this.anInt3) {
					for (@Pc(52) int local52 = local19; local52 < local19 + arg1; local52++) {
						if (local52 >= 0 && local52 < this.anInt4) {
							this.method8(local52, local36, 798, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("35783, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -614 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIII)V")
	private void method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray1[arg1][arg0] &= 16777215 - arg3;
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("32565, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(BII)V")
	public void method9(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt1;
			@Pc(9) int local9 = arg1 - this.anInt2;
			this.anIntArrayArray1[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("26304, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 == arg5 && arg0 == arg1) {
				return true;
			}
			@Pc(22) int local22 = arg4 - this.anInt1;
			@Pc(27) int local27 = arg0 - this.anInt2;
			@Pc(32) int local32 = arg5 - this.anInt1;
			@Pc(37) int local37 = arg1 - this.anInt2;
			if (arg3 == 0) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 == arg0 && arg1 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt1;
			@Pc(27) int local27 = arg1 - this.anInt2;
			@Pc(32) int local32 = arg0 - this.anInt1;
			@Pc(37) int local37 = arg4 - this.anInt2;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x8) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x80) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray1[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray1[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray1[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("46915, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 6 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AOKWRKNA", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(7) int local7 = arg6 + arg0 - 1;
			@Pc(13) int local13 = arg1 + arg4 - 1;
			@Pc(18) boolean local18 = false;
			if (arg7 >= arg6 && arg7 <= local7 && arg5 >= arg1 && arg5 <= local13) {
				return true;
			} else if (arg7 == arg6 - 1 && arg5 >= arg1 && arg5 <= local13 && (this.anIntArrayArray1[arg7 - this.anInt1][arg5 - this.anInt2] & 0x8) == 0 && (arg3 & 0x8) == 0) {
				return true;
			} else if (arg7 == local7 + 1 && arg5 >= arg1 && arg5 <= local13 && (this.anIntArrayArray1[arg7 - this.anInt1][arg5 - this.anInt2] & 0x80) == 0 && (arg3 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg1 - 1 && arg7 >= arg6 && arg7 <= local7 && (this.anIntArrayArray1[arg7 - this.anInt1][arg5 - this.anInt2] & 0x2) == 0 && (arg3 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local13 + 1 && arg7 >= arg6 && arg7 <= local7 && (this.anIntArrayArray1[arg7 - this.anInt1][arg5 - this.anInt2] & 0x20) == 0 && (arg3 & 0x1) == 0;
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("12029, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}
}
