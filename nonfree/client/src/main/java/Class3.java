import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ASFXKKJM")
public final class Class3 {

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "I")
	private int anInt7 = 523;

	@OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "I")
	private int anInt8 = 3;

	@OriginalMember(owner = "client!ASFXKKJM", name = "c", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ASFXKKJM", name = "d", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ASFXKKJM", name = "e", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ASFXKKJM", name = "f", descriptor = "B")
	private byte aByte1 = 7;

	@OriginalMember(owner = "client!ASFXKKJM", name = "g", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ASFXKKJM", name = "h", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!ASFXKKJM", name = "i", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!ASFXKKJM", name = "j", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!ASFXKKJM", name = "k", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!ASFXKKJM", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ASFXKKJM", name = "<init>", descriptor = "(III)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt9 = 0;
			this.anInt10 = 0;
			this.anInt11 = arg1;
			this.anInt12 = arg2;
			this.anIntArrayArray1 = new int[this.anInt11][this.anInt12];
			this.method5();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("90919, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "()V")
	public void method5() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt11; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt12; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt11 - 1 || local7 == this.anInt12 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZIII)V")
	public void method6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 == this.anInt8) {
				@Pc(9) int local9 = arg4 - this.anInt9;
				@Pc(14) int local14 = arg1 - this.anInt10;
				if (arg3 == 0) {
					if (arg5 == 0) {
						this.method9(local9, local14, 128);
						this.method9(local9 - 1, local14, 8);
					}
					if (arg5 == 1) {
						this.method9(local9, local14, 2);
						this.method9(local9, local14 + 1, 32);
					}
					if (arg5 == 2) {
						this.method9(local9, local14, 8);
						this.method9(local9 + 1, local14, 128);
					}
					if (arg5 == 3) {
						this.method9(local9, local14, 32);
						this.method9(local9, local14 - 1, 2);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg5 == 0) {
						this.method9(local9, local14, 1);
						this.method9(local9 - 1, local14 + 1, 16);
					}
					if (arg5 == 1) {
						this.method9(local9, local14, 4);
						this.method9(local9 + 1, local14 + 1, 64);
					}
					if (arg5 == 2) {
						this.method9(local9, local14, 16);
						this.method9(local9 + 1, local14 - 1, 1);
					}
					if (arg5 == 3) {
						this.method9(local9, local14, 64);
						this.method9(local9 - 1, local14 - 1, 4);
					}
				}
				if (arg3 == 2) {
					if (arg5 == 0) {
						this.method9(local9, local14, 130);
						this.method9(local9 - 1, local14, 8);
						this.method9(local9, local14 + 1, 32);
					}
					if (arg5 == 1) {
						this.method9(local9, local14, 10);
						this.method9(local9, local14 + 1, 32);
						this.method9(local9 + 1, local14, 128);
					}
					if (arg5 == 2) {
						this.method9(local9, local14, 40);
						this.method9(local9 + 1, local14, 128);
						this.method9(local9, local14 - 1, 2);
					}
					if (arg5 == 3) {
						this.method9(local9, local14, 160);
						this.method9(local9, local14 - 1, 2);
						this.method9(local9 - 1, local14, 8);
					}
				}
				if (arg2) {
					if (arg3 == 0) {
						if (arg5 == 0) {
							this.method9(local9, local14, 65536);
							this.method9(local9 - 1, local14, 4096);
						}
						if (arg5 == 1) {
							this.method9(local9, local14, 1024);
							this.method9(local9, local14 + 1, 16384);
						}
						if (arg5 == 2) {
							this.method9(local9, local14, 4096);
							this.method9(local9 + 1, local14, 65536);
						}
						if (arg5 == 3) {
							this.method9(local9, local14, 16384);
							this.method9(local9, local14 - 1, 1024);
						}
					}
					if (arg3 == 1 || arg3 == 3) {
						if (arg5 == 0) {
							this.method9(local9, local14, 512);
							this.method9(local9 - 1, local14 + 1, 8192);
						}
						if (arg5 == 1) {
							this.method9(local9, local14, 2048);
							this.method9(local9 + 1, local14 + 1, 32768);
						}
						if (arg5 == 2) {
							this.method9(local9, local14, 8192);
							this.method9(local9 + 1, local14 - 1, 512);
						}
						if (arg5 == 3) {
							this.method9(local9, local14, 32768);
							this.method9(local9 - 1, local14 - 1, 2048);
						}
					}
					if (arg3 == 2) {
						if (arg5 == 0) {
							this.method9(local9, local14, 66560);
							this.method9(local9 - 1, local14, 4096);
							this.method9(local9, local14 + 1, 16384);
						}
						if (arg5 == 1) {
							this.method9(local9, local14, 5120);
							this.method9(local9, local14 + 1, 16384);
							this.method9(local9 + 1, local14, 65536);
						}
						if (arg5 == 2) {
							this.method9(local9, local14, 20480);
							this.method9(local9 + 1, local14, 65536);
							this.method9(local9, local14 - 1, 1024);
						}
						if (arg5 == 3) {
							this.method9(local9, local14, 81920);
							this.method9(local9, local14 - 1, 1024);
							this.method9(local9 - 1, local14, 4096);
							return;
						}
					}
				}
			}
		} catch (@Pc(466) RuntimeException local466) {
			signlink.reporterror("69082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local466.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIBZII)V")
	public void method7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt9;
			@Pc(19) int local19 = arg0 - this.anInt10;
			@Pc(27) int local27;
			if (arg1 == 1 || arg1 == 3) {
				local27 = arg5;
				arg5 = arg4;
				arg4 = local27;
			}
			for (local27 = local14; local27 < local14 + arg5; local27++) {
				if (local27 >= 0 && local27 < this.anInt11) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg4; local43++) {
						if (local43 >= 0 && local43 < this.anInt12) {
							this.method9(local27, local43, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("31140, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZ)V")
	public void method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt9;
			@Pc(9) int local9 = arg1 - this.anInt10;
			this.anIntArrayArray1[local4][local9] |= 0x200000;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("59292, " + arg0 + ", " + arg1 + ", " + true + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(III)V")
	private void method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZIZI)V")
	public void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt9;
			@Pc(18) int local18 = arg0 - this.anInt10;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method12(local4, local18, this.aBoolean2, 128);
					this.method12(local4 - 1, local18, this.aBoolean2, 8);
				}
				if (arg4 == 1) {
					this.method12(local4, local18, this.aBoolean2, 2);
					this.method12(local4, local18 + 1, this.aBoolean2, 32);
				}
				if (arg4 == 2) {
					this.method12(local4, local18, this.aBoolean2, 8);
					this.method12(local4 + 1, local18, this.aBoolean2, 128);
				}
				if (arg4 == 3) {
					this.method12(local4, local18, this.aBoolean2, 32);
					this.method12(local4, local18 - 1, this.aBoolean2, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method12(local4, local18, this.aBoolean2, 1);
					this.method12(local4 - 1, local18 + 1, this.aBoolean2, 16);
				}
				if (arg4 == 1) {
					this.method12(local4, local18, this.aBoolean2, 4);
					this.method12(local4 + 1, local18 + 1, this.aBoolean2, 64);
				}
				if (arg4 == 2) {
					this.method12(local4, local18, this.aBoolean2, 16);
					this.method12(local4 + 1, local18 - 1, this.aBoolean2, 1);
				}
				if (arg4 == 3) {
					this.method12(local4, local18, this.aBoolean2, 64);
					this.method12(local4 - 1, local18 - 1, this.aBoolean2, 4);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method12(local4, local18, this.aBoolean2, 130);
					this.method12(local4 - 1, local18, this.aBoolean2, 8);
					this.method12(local4, local18 + 1, this.aBoolean2, 32);
				}
				if (arg4 == 1) {
					this.method12(local4, local18, this.aBoolean2, 10);
					this.method12(local4, local18 + 1, this.aBoolean2, 32);
					this.method12(local4 + 1, local18, this.aBoolean2, 128);
				}
				if (arg4 == 2) {
					this.method12(local4, local18, this.aBoolean2, 40);
					this.method12(local4 + 1, local18, this.aBoolean2, 128);
					this.method12(local4, local18 - 1, this.aBoolean2, 2);
				}
				if (arg4 == 3) {
					this.method12(local4, local18, this.aBoolean2, 160);
					this.method12(local4, local18 - 1, this.aBoolean2, 2);
					this.method12(local4 - 1, local18, this.aBoolean2, 8);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method12(local4, local18, this.aBoolean2, 65536);
						this.method12(local4 - 1, local18, this.aBoolean2, 4096);
					}
					if (arg4 == 1) {
						this.method12(local4, local18, this.aBoolean2, 1024);
						this.method12(local4, local18 + 1, this.aBoolean2, 16384);
					}
					if (arg4 == 2) {
						this.method12(local4, local18, this.aBoolean2, 4096);
						this.method12(local4 + 1, local18, this.aBoolean2, 65536);
					}
					if (arg4 == 3) {
						this.method12(local4, local18, this.aBoolean2, 16384);
						this.method12(local4, local18 - 1, this.aBoolean2, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method12(local4, local18, this.aBoolean2, 512);
						this.method12(local4 - 1, local18 + 1, this.aBoolean2, 8192);
					}
					if (arg4 == 1) {
						this.method12(local4, local18, this.aBoolean2, 2048);
						this.method12(local4 + 1, local18 + 1, this.aBoolean2, 32768);
					}
					if (arg4 == 2) {
						this.method12(local4, local18, this.aBoolean2, 8192);
						this.method12(local4 + 1, local18 - 1, this.aBoolean2, 512);
					}
					if (arg4 == 3) {
						this.method12(local4, local18, this.aBoolean2, 32768);
						this.method12(local4 - 1, local18 - 1, this.aBoolean2, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method12(local4, local18, this.aBoolean2, 66560);
						this.method12(local4 - 1, local18, this.aBoolean2, 4096);
						this.method12(local4, local18 + 1, this.aBoolean2, 16384);
					}
					if (arg4 == 1) {
						this.method12(local4, local18, this.aBoolean2, 5120);
						this.method12(local4, local18 + 1, this.aBoolean2, 16384);
						this.method12(local4 + 1, local18, this.aBoolean2, 65536);
					}
					if (arg4 == 2) {
						this.method12(local4, local18, this.aBoolean2, 20480);
						this.method12(local4 + 1, local18, this.aBoolean2, 65536);
						this.method12(local4, local18 - 1, this.aBoolean2, 1024);
					}
					if (arg4 == 3) {
						this.method12(local4, local18, this.aBoolean2, 81920);
						this.method12(local4, local18 - 1, this.aBoolean2, 1024);
						this.method12(local4 - 1, local18, this.aBoolean2, 4096);
						return;
					}
				}
			}
		} catch (@Pc(582) RuntimeException local582) {
			signlink.reporterror("64717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local582.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIBZI)V")
	public void method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt9;
			@Pc(25) int local25 = arg3 - this.anInt10;
			@Pc(33) int local33;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0;
				arg0 = arg5;
				arg5 = local33;
			}
			for (local33 = local14; local33 < local14 + arg0; local33++) {
				if (local33 >= 0 && local33 < this.anInt11) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg5; local49++) {
						if (local49 >= 0 && local49 < this.anInt12) {
							this.method12(local33, local49, this.aBoolean2, local3);
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("70979, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + arg5 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIZI)V")
	private void method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray1[arg0][arg1] &= 16777215 - arg3;
			if (arg2) {
				;
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("473, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "(III)V")
	public void method13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(15) int local15 = arg1 - this.anInt9;
			@Pc(20) int local20 = arg0 - this.anInt10;
			this.anIntArrayArray1[local15][local20] &= 0xDFFFFF;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("24758, " + arg0 + ", " + arg1 + ", " + -44679 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 == arg6 && arg2 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt9;
			@Pc(17) int local17 = arg2 - this.anInt10;
			@Pc(21) int local21 = 61 / arg5;
			@Pc(26) int local26 = arg6 - this.anInt9;
			@Pc(31) int local31 = arg0 - this.anInt10;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local12 == local26 - 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local26 && local17 == local31 + 1) {
						return true;
					}
					if (local12 == local26 - 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local26 + 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local26 && local17 == local31 - 1) {
						return true;
					}
					if (local12 == local26 - 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local12 == local26 - 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local26 - 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local26 - 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local26 - 1 && local17 == local31) {
						return true;
					}
					if (local12 == local26 && local17 == local31 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local26 + 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local26 && local17 == local31 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local12 == local26 && local17 == local31 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local26 && local17 == local31 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local26 - 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local26 + 1 && local17 == local31 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(564) RuntimeException local564) {
			signlink.reporterror("91607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local564.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg3 && arg0 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt9;
			@Pc(24) int local24 = arg0 - this.anInt10;
			@Pc(29) int local29 = arg3 - this.anInt9;
			@Pc(34) int local34 = arg1 - this.anInt10;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray1[local12][local24] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x8) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray1[local12][local24] & 0x80) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray1[local12][local24] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
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
			signlink.reporterror("82624, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 36084 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASFXKKJM", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg6 + arg3 - 1;
			@Pc(17) int local17 = arg4 + arg1 - 1;
			if (arg5 >= arg6 && arg5 <= local11 && arg0 >= arg4 && arg0 <= local17) {
				return true;
			} else if (arg5 == arg6 - 1 && arg0 >= arg4 && arg0 <= local17 && (this.anIntArrayArray1[arg5 - this.anInt9][arg0 - this.anInt10] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg5 == local11 + 1 && arg0 >= arg4 && arg0 <= local17 && (this.anIntArrayArray1[arg5 - this.anInt9][arg0 - this.anInt10] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg4 - 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt9][arg0 - this.anInt10] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local17 + 1 && arg5 >= arg6 && arg5 <= local11 && (this.anIntArrayArray1[arg5 - this.anInt9][arg0 - this.anInt10] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("72890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 119 + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
