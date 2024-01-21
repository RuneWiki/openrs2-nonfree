import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CGGBZSOS")
public final class Class3 {

	@OriginalMember(owner = "client!CGGBZSOS", name = "e", descriptor = "I")
	private int anInt44;

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "I")
	private int anInt43 = 3;

	@OriginalMember(owner = "client!CGGBZSOS", name = "b", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!CGGBZSOS", name = "c", descriptor = "Z")
	private boolean aBoolean19 = true;

	@OriginalMember(owner = "client!CGGBZSOS", name = "d", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!CGGBZSOS", name = "f", descriptor = "B")
	private byte aByte4 = -69;

	@OriginalMember(owner = "client!CGGBZSOS", name = "g", descriptor = "B")
	private byte aByte5 = 6;

	@OriginalMember(owner = "client!CGGBZSOS", name = "h", descriptor = "I")
	private int anInt45 = -66;

	@OriginalMember(owner = "client!CGGBZSOS", name = "i", descriptor = "I")
	private int anInt46;

	@OriginalMember(owner = "client!CGGBZSOS", name = "j", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!CGGBZSOS", name = "k", descriptor = "I")
	private int anInt48;

	@OriginalMember(owner = "client!CGGBZSOS", name = "l", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!CGGBZSOS", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!CGGBZSOS", name = "<init>", descriptor = "(IIB)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt46 = 0;
			this.anInt47 = 0;
			this.anInt48 = arg1;
			this.anInt49 = arg0;
			this.anIntArrayArray1 = new int[this.anInt48][this.anInt49];
			this.method25();
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("68633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "()V")
	public void method25() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt48; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt49; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt48 - 1 || local7 == this.anInt49 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(BIIZII)V")
	public void method26(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(14) int local14 = arg3 - this.anInt46;
			@Pc(19) int local19 = arg0 - this.anInt47;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method29(local14, local19, 128);
					this.method29(local14 - 1, local19, 8);
				}
				if (arg4 == 1) {
					this.method29(local14, local19, 2);
					this.method29(local14, local19 + 1, 32);
				}
				if (arg4 == 2) {
					this.method29(local14, local19, 8);
					this.method29(local14 + 1, local19, 128);
				}
				if (arg4 == 3) {
					this.method29(local14, local19, 32);
					this.method29(local14, local19 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method29(local14, local19, 1);
					this.method29(local14 - 1, local19 + 1, 16);
				}
				if (arg4 == 1) {
					this.method29(local14, local19, 4);
					this.method29(local14 + 1, local19 + 1, 64);
				}
				if (arg4 == 2) {
					this.method29(local14, local19, 16);
					this.method29(local14 + 1, local19 - 1, 1);
				}
				if (arg4 == 3) {
					this.method29(local14, local19, 64);
					this.method29(local14 - 1, local19 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method29(local14, local19, 130);
					this.method29(local14 - 1, local19, 8);
					this.method29(local14, local19 + 1, 32);
				}
				if (arg4 == 1) {
					this.method29(local14, local19, 10);
					this.method29(local14, local19 + 1, 32);
					this.method29(local14 + 1, local19, 128);
				}
				if (arg4 == 2) {
					this.method29(local14, local19, 40);
					this.method29(local14 + 1, local19, 128);
					this.method29(local14, local19 - 1, 2);
				}
				if (arg4 == 3) {
					this.method29(local14, local19, 160);
					this.method29(local14, local19 - 1, 2);
					this.method29(local14 - 1, local19, 8);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method29(local14, local19, 65536);
						this.method29(local14 - 1, local19, 4096);
					}
					if (arg4 == 1) {
						this.method29(local14, local19, 1024);
						this.method29(local14, local19 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method29(local14, local19, 4096);
						this.method29(local14 + 1, local19, 65536);
					}
					if (arg4 == 3) {
						this.method29(local14, local19, 16384);
						this.method29(local14, local19 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method29(local14, local19, 512);
						this.method29(local14 - 1, local19 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method29(local14, local19, 2048);
						this.method29(local14 + 1, local19 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method29(local14, local19, 8192);
						this.method29(local14 + 1, local19 - 1, 512);
					}
					if (arg4 == 3) {
						this.method29(local14, local19, 32768);
						this.method29(local14 - 1, local19 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method29(local14, local19, 66560);
						this.method29(local14 - 1, local19, 4096);
						this.method29(local14, local19 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method29(local14, local19, 5120);
						this.method29(local14, local19 + 1, 16384);
						this.method29(local14 + 1, local19, 65536);
					}
					if (arg4 == 2) {
						this.method29(local14, local19, 20480);
						this.method29(local14 + 1, local19, 65536);
						this.method29(local14, local19 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method29(local14, local19, 81920);
						this.method29(local14, local19 - 1, 1024);
						this.method29(local14 - 1, local19, 4096);
						return;
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("51030, " + 86 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(IIIZZII)V")
	public void method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt46;
			@Pc(19) int local19 = arg0 - this.anInt47;
			@Pc(27) int local27;
			if (arg1 == 1 || arg1 == 3) {
				local27 = arg4;
				arg4 = arg2;
				arg2 = local27;
			}
			for (local27 = local14; local27 < local14 + arg4; local27++) {
				if (local27 >= 0 && local27 < this.anInt48) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg2; local43++) {
						if (local43 >= 0 && local43 < this.anInt49) {
							this.method29(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("36998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(III)V")
	public void method28(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt46;
			@Pc(13) int local13 = arg1 - this.anInt47;
			this.anIntArrayArray1[local4][local13] |= 0x200000;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("42531, " + arg0 + ", " + 43364 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "b", descriptor = "(III)V")
	private void method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(IZZIII)V")
	public void method30(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(14) int local14 = arg4 - this.anInt46;
			@Pc(19) int local19 = arg0 - this.anInt47;
			if (arg2 == 0) {
				if (arg3 == 0) {
					this.method32(local14, 128, (byte) 2, local19);
					this.method32(local14 - 1, 8, (byte) 2, local19);
				}
				if (arg3 == 1) {
					this.method32(local14, 2, (byte) 2, local19);
					this.method32(local14, 32, (byte) 2, local19 + 1);
				}
				if (arg3 == 2) {
					this.method32(local14, 8, (byte) 2, local19);
					this.method32(local14 + 1, 128, (byte) 2, local19);
				}
				if (arg3 == 3) {
					this.method32(local14, 32, (byte) 2, local19);
					this.method32(local14, 2, (byte) 2, local19 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					this.method32(local14, 1, (byte) 2, local19);
					this.method32(local14 - 1, 16, (byte) 2, local19 + 1);
				}
				if (arg3 == 1) {
					this.method32(local14, 4, (byte) 2, local19);
					this.method32(local14 + 1, 64, (byte) 2, local19 + 1);
				}
				if (arg3 == 2) {
					this.method32(local14, 16, (byte) 2, local19);
					this.method32(local14 + 1, 1, (byte) 2, local19 - 1);
				}
				if (arg3 == 3) {
					this.method32(local14, 64, (byte) 2, local19);
					this.method32(local14 - 1, 4, (byte) 2, local19 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					this.method32(local14, 130, (byte) 2, local19);
					this.method32(local14 - 1, 8, (byte) 2, local19);
					this.method32(local14, 32, (byte) 2, local19 + 1);
				}
				if (arg3 == 1) {
					this.method32(local14, 10, (byte) 2, local19);
					this.method32(local14, 32, (byte) 2, local19 + 1);
					this.method32(local14 + 1, 128, (byte) 2, local19);
				}
				if (arg3 == 2) {
					this.method32(local14, 40, (byte) 2, local19);
					this.method32(local14 + 1, 128, (byte) 2, local19);
					this.method32(local14, 2, (byte) 2, local19 - 1);
				}
				if (arg3 == 3) {
					this.method32(local14, 160, (byte) 2, local19);
					this.method32(local14, 2, (byte) 2, local19 - 1);
					this.method32(local14 - 1, 8, (byte) 2, local19);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg3 == 0) {
						this.method32(local14, 65536, (byte) 2, local19);
						this.method32(local14 - 1, 4096, (byte) 2, local19);
					}
					if (arg3 == 1) {
						this.method32(local14, 1024, (byte) 2, local19);
						this.method32(local14, 16384, (byte) 2, local19 + 1);
					}
					if (arg3 == 2) {
						this.method32(local14, 4096, (byte) 2, local19);
						this.method32(local14 + 1, 65536, (byte) 2, local19);
					}
					if (arg3 == 3) {
						this.method32(local14, 16384, (byte) 2, local19);
						this.method32(local14, 1024, (byte) 2, local19 - 1);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg3 == 0) {
						this.method32(local14, 512, (byte) 2, local19);
						this.method32(local14 - 1, 8192, (byte) 2, local19 + 1);
					}
					if (arg3 == 1) {
						this.method32(local14, 2048, (byte) 2, local19);
						this.method32(local14 + 1, 32768, (byte) 2, local19 + 1);
					}
					if (arg3 == 2) {
						this.method32(local14, 8192, (byte) 2, local19);
						this.method32(local14 + 1, 512, (byte) 2, local19 - 1);
					}
					if (arg3 == 3) {
						this.method32(local14, 32768, (byte) 2, local19);
						this.method32(local14 - 1, 2048, (byte) 2, local19 - 1);
					}
				}
				if (arg2 == 2) {
					if (arg3 == 0) {
						this.method32(local14, 66560, (byte) 2, local19);
						this.method32(local14 - 1, 4096, (byte) 2, local19);
						this.method32(local14, 16384, (byte) 2, local19 + 1);
					}
					if (arg3 == 1) {
						this.method32(local14, 5120, (byte) 2, local19);
						this.method32(local14, 16384, (byte) 2, local19 + 1);
						this.method32(local14 + 1, 65536, (byte) 2, local19);
					}
					if (arg3 == 2) {
						this.method32(local14, 20480, (byte) 2, local19);
						this.method32(local14 + 1, 65536, (byte) 2, local19);
						this.method32(local14, 1024, (byte) 2, local19 - 1);
					}
					if (arg3 == 3) {
						this.method32(local14, 81920, (byte) 2, local19);
						this.method32(local14, 1024, (byte) 2, local19 - 1);
						this.method32(local14 - 1, 4096, (byte) 2, local19);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("83858, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(ZIIZIII)V")
	public void method31(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt46;
			@Pc(19) int local19 = arg4 - this.anInt47;
			@Pc(37) int local37;
			if (arg3 == 1 || arg3 == 3) {
				local37 = arg5;
				arg5 = arg1;
				arg1 = local37;
			}
			for (local37 = local14; local37 < local14 + arg5; local37++) {
				if (local37 >= 0 && local37 < this.anInt48) {
					for (@Pc(53) int local53 = local19; local53 < local19 + arg1; local53++) {
						if (local53 >= 0 && local53 < this.anInt49) {
							this.method32(local37, local3, (byte) 2, local53);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("34756, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(IIBI)V")
	private void method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray1[arg0][arg3] &= 16777215 - arg1;
			@Pc(16) boolean local16 = false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("92843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "c", descriptor = "(III)V")
	public void method33(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt46;
			@Pc(9) int local9 = arg0 - this.anInt47;
			this.anIntArrayArray1[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("48628, " + arg0 + ", " + -83 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg4 && arg0 == arg2) {
				return true;
			}
			@Pc(20) int local20 = arg1 - this.anInt46;
			@Pc(25) int local25 = arg0 - this.anInt47;
			@Pc(30) int local30 = arg4 - this.anInt46;
			@Pc(35) int local35 = arg2 - this.anInt47;
			if (arg3 == 0) {
				if (arg5 == 0) {
					if (local20 == local30 - 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray1[local20][local25] & 0x1280120) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray1[local20][local25] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local20 == local30 && local25 == local35 + 1) {
						return true;
					}
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280108) == 0) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local20 == local30 + 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray1[local20][local25] & 0x1280120) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray1[local20][local25] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local20 == local30 && local25 == local35 - 1) {
						return true;
					}
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280108) == 0) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg5 == 0) {
					if (local20 == local30 - 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280180) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray1[local20][local25] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280108) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray1[local20][local25] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280108) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray1[local20][local25] & 0x1280120) == 0) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local20 == local30 - 1 && local25 == local35) {
						return true;
					}
					if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray1[local20][local25] & 0x1280120) == 0) {
						return true;
					}
					if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x1280180) == 0) {
						return true;
					}
					if (local20 == local30 && local25 == local35 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local20 == local30 && local25 == local35 + 1 && (this.anIntArrayArray1[local20][local25] & 0x20) == 0) {
					return true;
				}
				if (local20 == local30 && local25 == local35 - 1 && (this.anIntArrayArray1[local20][local25] & 0x2) == 0) {
					return true;
				}
				if (local20 == local30 - 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x8) == 0) {
					return true;
				}
				if (local20 == local30 + 1 && local25 == local35 && (this.anIntArrayArray1[local20][local25] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(568) RuntimeException local568) {
			signlink.reporterror("53090, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -406 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local568.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg2 && arg1 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt46;
			@Pc(24) int local24 = arg1 - this.anInt47;
			@Pc(29) int local29 = arg2 - this.anInt46;
			@Pc(34) int local34 = arg5 - this.anInt47;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
					return true;
				}
				if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
					return true;
				}
				if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
					return true;
				}
				if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("7730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CGGBZSOS", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method36(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg3 - 1;
			@Pc(11) int local11 = arg6 + arg0 - 1;
			if (arg4 >= arg2 && arg4 <= local5 && arg5 >= arg6 && arg5 <= local11) {
				return true;
			} else if (arg4 == arg2 - 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray1[arg4 - this.anInt46][arg5 - this.anInt47] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg4 == local5 + 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray1[arg4 - this.anInt46][arg5 - this.anInt47] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg6 - 1 && arg4 >= arg2 && arg4 <= local5 && (this.anIntArrayArray1[arg4 - this.anInt46][arg5 - this.anInt47] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local11 + 1 && arg4 >= arg2 && arg4 <= local5 && (this.anIntArrayArray1[arg4 - this.anInt46][arg5 - this.anInt47] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("98663, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
