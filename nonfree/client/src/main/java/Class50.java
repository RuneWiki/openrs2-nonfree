import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZSRJFSKK")
public final class Class50 {

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "b", descriptor = "I")
	private int anInt773 = 36728;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "c", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "d", descriptor = "I")
	private int anInt774 = 581;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "e", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "f", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "g", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "h", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "i", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ZSRJFSKK", name = "<init>", descriptor = "(III)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt775 = 0;
			this.anInt776 = 0;
			this.anInt777 = arg2;
			this.anInt778 = arg1;
			this.anIntArrayArray18 = new int[this.anInt777][this.anInt778];
			this.method529();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("56439, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "()V")
	public void method529() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt777; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt778; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt777 - 1 || local7 == this.anInt778 - 1) {
					this.anIntArrayArray18[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray18[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIIII)V")
	public void method530(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt775;
			@Pc(9) int local9 = arg2 - this.anInt776;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method533(local4, local9, 128);
					this.method533(local4 - 1, local9, 8);
				}
				if (arg3 == 1) {
					this.method533(local4, local9, 2);
					this.method533(local4, local9 + 1, 32);
				}
				if (arg3 == 2) {
					this.method533(local4, local9, 8);
					this.method533(local4 + 1, local9, 128);
				}
				if (arg3 == 3) {
					this.method533(local4, local9, 32);
					this.method533(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method533(local4, local9, 1);
					this.method533(local4 - 1, local9 + 1, 16);
				}
				if (arg3 == 1) {
					this.method533(local4, local9, 4);
					this.method533(local4 + 1, local9 + 1, 64);
				}
				if (arg3 == 2) {
					this.method533(local4, local9, 16);
					this.method533(local4 + 1, local9 - 1, 1);
				}
				if (arg3 == 3) {
					this.method533(local4, local9, 64);
					this.method533(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method533(local4, local9, 130);
					this.method533(local4 - 1, local9, 8);
					this.method533(local4, local9 + 1, 32);
				}
				if (arg3 == 1) {
					this.method533(local4, local9, 10);
					this.method533(local4, local9 + 1, 32);
					this.method533(local4 + 1, local9, 128);
				}
				if (arg3 == 2) {
					this.method533(local4, local9, 40);
					this.method533(local4 + 1, local9, 128);
					this.method533(local4, local9 - 1, 2);
				}
				if (arg3 == 3) {
					this.method533(local4, local9, 160);
					this.method533(local4, local9 - 1, 2);
					this.method533(local4 - 1, local9, 8);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method533(local4, local9, 65536);
						this.method533(local4 - 1, local9, 4096);
					}
					if (arg3 == 1) {
						this.method533(local4, local9, 1024);
						this.method533(local4, local9 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method533(local4, local9, 4096);
						this.method533(local4 + 1, local9, 65536);
					}
					if (arg3 == 3) {
						this.method533(local4, local9, 16384);
						this.method533(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method533(local4, local9, 512);
						this.method533(local4 - 1, local9 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method533(local4, local9, 2048);
						this.method533(local4 + 1, local9 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method533(local4, local9, 8192);
						this.method533(local4 + 1, local9 - 1, 512);
					}
					if (arg3 == 3) {
						this.method533(local4, local9, 32768);
						this.method533(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method533(local4, local9, 66560);
						this.method533(local4 - 1, local9, 4096);
						this.method533(local4, local9 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method533(local4, local9, 5120);
						this.method533(local4, local9 + 1, 16384);
						this.method533(local4 + 1, local9, 65536);
					}
					if (arg3 == 2) {
						this.method533(local4, local9, 20480);
						this.method533(local4 + 1, local9, 65536);
						this.method533(local4, local9 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method533(local4, local9, 81920);
						this.method533(local4, local9 - 1, 1024);
						this.method533(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("85804, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIBZII)V")
	public void method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3 == 9) {
				@Pc(8) boolean local8 = false;
				if (arg4) {
					local3 = 131328;
				}
				@Pc(22) int local22 = arg1 - this.anInt775;
				@Pc(27) int local27 = arg2 - this.anInt776;
				@Pc(35) int local35;
				if (arg5 == 1 || arg5 == 3) {
					local35 = arg6;
					arg6 = arg0;
					arg0 = local35;
				}
				for (local35 = local22; local35 < local22 + arg6; local35++) {
					if (local35 >= 0 && local35 < this.anInt777) {
						for (@Pc(51) int local51 = local27; local51 < local27 + arg0; local51++) {
							if (local51 >= 0 && local51 < this.anInt778) {
								this.method533(local35, local51, local3);
							}
						}
					}
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("98586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IBI)V")
	public void method532(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(12) int local12 = arg0 - this.anInt775;
			@Pc(17) int local17 = arg2 - this.anInt776;
			this.anIntArrayArray18[local12][local17] |= 0x200000;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("36205, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(III)V")
	private void method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIZII)V")
	public void method534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt775;
			@Pc(18) int local18 = arg0 - this.anInt776;
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method536(128, (byte) 3, local4, local18);
					this.method536(8, (byte) 3, local4 - 1, local18);
				}
				if (arg1 == 1) {
					this.method536(2, (byte) 3, local4, local18);
					this.method536(32, (byte) 3, local4, local18 + 1);
				}
				if (arg1 == 2) {
					this.method536(8, (byte) 3, local4, local18);
					this.method536(128, (byte) 3, local4 + 1, local18);
				}
				if (arg1 == 3) {
					this.method536(32, (byte) 3, local4, local18);
					this.method536(2, (byte) 3, local4, local18 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method536(1, (byte) 3, local4, local18);
					this.method536(16, (byte) 3, local4 - 1, local18 + 1);
				}
				if (arg1 == 1) {
					this.method536(4, (byte) 3, local4, local18);
					this.method536(64, (byte) 3, local4 + 1, local18 + 1);
				}
				if (arg1 == 2) {
					this.method536(16, (byte) 3, local4, local18);
					this.method536(1, (byte) 3, local4 + 1, local18 - 1);
				}
				if (arg1 == 3) {
					this.method536(64, (byte) 3, local4, local18);
					this.method536(4, (byte) 3, local4 - 1, local18 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method536(130, (byte) 3, local4, local18);
					this.method536(8, (byte) 3, local4 - 1, local18);
					this.method536(32, (byte) 3, local4, local18 + 1);
				}
				if (arg1 == 1) {
					this.method536(10, (byte) 3, local4, local18);
					this.method536(32, (byte) 3, local4, local18 + 1);
					this.method536(128, (byte) 3, local4 + 1, local18);
				}
				if (arg1 == 2) {
					this.method536(40, (byte) 3, local4, local18);
					this.method536(128, (byte) 3, local4 + 1, local18);
					this.method536(2, (byte) 3, local4, local18 - 1);
				}
				if (arg1 == 3) {
					this.method536(160, (byte) 3, local4, local18);
					this.method536(2, (byte) 3, local4, local18 - 1);
					this.method536(8, (byte) 3, local4 - 1, local18);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg1 == 0) {
						this.method536(65536, (byte) 3, local4, local18);
						this.method536(4096, (byte) 3, local4 - 1, local18);
					}
					if (arg1 == 1) {
						this.method536(1024, (byte) 3, local4, local18);
						this.method536(16384, (byte) 3, local4, local18 + 1);
					}
					if (arg1 == 2) {
						this.method536(4096, (byte) 3, local4, local18);
						this.method536(65536, (byte) 3, local4 + 1, local18);
					}
					if (arg1 == 3) {
						this.method536(16384, (byte) 3, local4, local18);
						this.method536(1024, (byte) 3, local4, local18 - 1);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg1 == 0) {
						this.method536(512, (byte) 3, local4, local18);
						this.method536(8192, (byte) 3, local4 - 1, local18 + 1);
					}
					if (arg1 == 1) {
						this.method536(2048, (byte) 3, local4, local18);
						this.method536(32768, (byte) 3, local4 + 1, local18 + 1);
					}
					if (arg1 == 2) {
						this.method536(8192, (byte) 3, local4, local18);
						this.method536(512, (byte) 3, local4 + 1, local18 - 1);
					}
					if (arg1 == 3) {
						this.method536(32768, (byte) 3, local4, local18);
						this.method536(2048, (byte) 3, local4 - 1, local18 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg1 == 0) {
						this.method536(66560, (byte) 3, local4, local18);
						this.method536(4096, (byte) 3, local4 - 1, local18);
						this.method536(16384, (byte) 3, local4, local18 + 1);
					}
					if (arg1 == 1) {
						this.method536(5120, (byte) 3, local4, local18);
						this.method536(16384, (byte) 3, local4, local18 + 1);
						this.method536(65536, (byte) 3, local4 + 1, local18);
					}
					if (arg1 == 2) {
						this.method536(20480, (byte) 3, local4, local18);
						this.method536(65536, (byte) 3, local4 + 1, local18);
						this.method536(1024, (byte) 3, local4, local18 - 1);
					}
					if (arg1 == 3) {
						this.method536(81920, (byte) 3, local4, local18);
						this.method536(1024, (byte) 3, local4, local18 - 1);
						this.method536(4096, (byte) 3, local4 - 1, local18);
						return;
					}
				}
			}
		} catch (@Pc(526) RuntimeException local526) {
			signlink.reporterror("69933, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local526.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IZIIIII)V")
	public void method535(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) int local6 = 256;
			if (arg1) {
				local6 = 131328;
			}
			@Pc(17) int local17 = arg0 - this.anInt775;
			@Pc(22) int local22 = arg3 - this.anInt776;
			@Pc(30) int local30;
			if (arg5 == 1 || arg5 == 3) {
				local30 = arg4;
				arg4 = arg2;
				arg2 = local30;
			}
			for (local30 = local17; local30 < local17 + arg4; local30++) {
				if (local30 >= 0 && local30 < this.anInt777) {
					for (@Pc(46) int local46 = local22; local46 < local22 + arg2; local46++) {
						if (local46 >= 0 && local46 < this.anInt778) {
							this.method536(local6, (byte) 3, local30, local46);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("61406, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 432 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IBII)V")
	private void method536(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray18[arg2][arg3] &= 16777215 - arg0;
			@Pc(16) boolean local16 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("4833, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "b", descriptor = "(III)V")
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt775;
			@Pc(9) int local9 = arg0 - this.anInt776;
			this.anIntArrayArray18[local4][local9] &= 0xDFFFFF;
			if (arg1 != 0) {
				this.aBoolean198 = !this.aBoolean198;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("96618, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIZIII)Z")
	public boolean method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg4 && arg3 == arg0) {
				return true;
			}
			@Pc(18) int local18 = arg5 - this.anInt775;
			@Pc(23) int local23 = arg3 - this.anInt776;
			@Pc(28) int local28 = arg4 - this.anInt775;
			@Pc(33) int local33 = arg0 - this.anInt776;
			if (arg2 == 0) {
				if (arg1 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280108) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local18 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x1280120) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x1280180) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local18][local23] & 0x20) == 0) {
					return true;
				}
				if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local18][local23] & 0x2) == 0) {
					return true;
				}
				if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x8) == 0) {
					return true;
				}
				if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local18][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("28856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg5 && arg2 == arg1) {
				return true;
			}
			@Pc(23) int local23 = arg4 - this.anInt775;
			@Pc(28) int local28 = arg2 - this.anInt776;
			@Pc(33) int local33 = arg5 - this.anInt775;
			@Pc(38) int local38 = arg1 - this.anInt776;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x80) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x8) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x8) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x80) == 0) {
						return true;
					}
					if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local23 == local33 && local28 == local38 + 1 && (this.anIntArrayArray18[local23][local28] & 0x20) == 0) {
					return true;
				}
				if (local23 == local33 && local28 == local38 - 1 && (this.anIntArrayArray18[local23][local28] & 0x2) == 0) {
					return true;
				}
				if (local23 == local33 - 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x8) == 0) {
					return true;
				}
				if (local23 == local33 + 1 && local28 == local38 && (this.anIntArrayArray18[local23][local28] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("88530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -37555 + ", " + arg4 + ", " + arg5 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSRJFSKK", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg4 + arg5 - 1;
			@Pc(16) int local16 = arg3 + arg2 - 1;
			if (arg1 >= arg4 && arg1 <= local10 && arg0 >= arg3 && arg0 <= local16) {
				return true;
			} else if (arg1 == arg4 - 1 && arg0 >= arg3 && arg0 <= local16 && (this.anIntArrayArray18[arg1 - this.anInt775][arg0 - this.anInt776] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg1 == local10 + 1 && arg0 >= arg3 && arg0 <= local16 && (this.anIntArrayArray18[arg1 - this.anInt775][arg0 - this.anInt776] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg0 == arg3 - 1 && arg1 >= arg4 && arg1 <= local10 && (this.anIntArrayArray18[arg1 - this.anInt775][arg0 - this.anInt776] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local16 + 1 && arg1 >= arg4 && arg1 <= local10 && (this.anIntArrayArray18[arg1 - this.anInt775][arg0 - this.anInt776] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("25759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -803 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
