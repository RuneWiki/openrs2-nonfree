import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OXMJPDWD")
public final class Class28 {

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "I")
	private int anInt442 = 8;

	@OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!OXMJPDWD", name = "c", descriptor = "I")
	private int anInt443 = -653;

	@OriginalMember(owner = "client!OXMJPDWD", name = "d", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!OXMJPDWD", name = "e", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!OXMJPDWD", name = "f", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!OXMJPDWD", name = "g", descriptor = "I")
	private int anInt444 = 2;

	@OriginalMember(owner = "client!OXMJPDWD", name = "h", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!OXMJPDWD", name = "i", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!OXMJPDWD", name = "j", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!OXMJPDWD", name = "k", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!OXMJPDWD", name = "l", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!OXMJPDWD", name = "m", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!OXMJPDWD", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!OXMJPDWD", name = "<init>", descriptor = "(III)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt445 = 0;
			this.anInt446 = 0;
			this.anInt447 = arg2;
			@Pc(43) int local43 = 4 / arg0;
			this.anInt448 = arg1;
			this.anIntArrayArray13 = new int[this.anInt447][this.anInt448];
			this.method295();
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("49619, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "()V")
	public void method295() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt447; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt448; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt447 - 1 || local7 == this.anInt448 - 1) {
					this.anIntArrayArray13[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray13[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIZII)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt445;
			@Pc(12) int local12 = arg1 - this.anInt446;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method299(local4, local12, 128);
					this.method299(local4 - 1, local12, 8);
				}
				if (arg3 == 1) {
					this.method299(local4, local12, 2);
					this.method299(local4, local12 + 1, 32);
				}
				if (arg3 == 2) {
					this.method299(local4, local12, 8);
					this.method299(local4 + 1, local12, 128);
				}
				if (arg3 == 3) {
					this.method299(local4, local12, 32);
					this.method299(local4, local12 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method299(local4, local12, 1);
					this.method299(local4 - 1, local12 + 1, 16);
				}
				if (arg3 == 1) {
					this.method299(local4, local12, 4);
					this.method299(local4 + 1, local12 + 1, 64);
				}
				if (arg3 == 2) {
					this.method299(local4, local12, 16);
					this.method299(local4 + 1, local12 - 1, 1);
				}
				if (arg3 == 3) {
					this.method299(local4, local12, 64);
					this.method299(local4 - 1, local12 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method299(local4, local12, 130);
					this.method299(local4 - 1, local12, 8);
					this.method299(local4, local12 + 1, 32);
				}
				if (arg3 == 1) {
					this.method299(local4, local12, 10);
					this.method299(local4, local12 + 1, 32);
					this.method299(local4 + 1, local12, 128);
				}
				if (arg3 == 2) {
					this.method299(local4, local12, 40);
					this.method299(local4 + 1, local12, 128);
					this.method299(local4, local12 - 1, 2);
				}
				if (arg3 == 3) {
					this.method299(local4, local12, 160);
					this.method299(local4, local12 - 1, 2);
					this.method299(local4 - 1, local12, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method299(local4, local12, 65536);
						this.method299(local4 - 1, local12, 4096);
					}
					if (arg3 == 1) {
						this.method299(local4, local12, 1024);
						this.method299(local4, local12 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method299(local4, local12, 4096);
						this.method299(local4 + 1, local12, 65536);
					}
					if (arg3 == 3) {
						this.method299(local4, local12, 16384);
						this.method299(local4, local12 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method299(local4, local12, 512);
						this.method299(local4 - 1, local12 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method299(local4, local12, 2048);
						this.method299(local4 + 1, local12 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method299(local4, local12, 8192);
						this.method299(local4 + 1, local12 - 1, 512);
					}
					if (arg3 == 3) {
						this.method299(local4, local12, 32768);
						this.method299(local4 - 1, local12 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method299(local4, local12, 66560);
						this.method299(local4 - 1, local12, 4096);
						this.method299(local4, local12 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method299(local4, local12, 5120);
						this.method299(local4, local12 + 1, 16384);
						this.method299(local4 + 1, local12, 65536);
					}
					if (arg3 == 2) {
						this.method299(local4, local12, 20480);
						this.method299(local4 + 1, local12, 65536);
						this.method299(local4, local12 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method299(local4, local12, 81920);
						this.method299(local4, local12 - 1, 1024);
						this.method299(local4 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("1451, " + arg0 + ", " + 741 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIIIZI)V")
	public void method297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt445;
			@Pc(25) int local25 = arg0 - this.anInt446;
			@Pc(33) int local33;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg2;
				arg2 = arg1;
				arg1 = local33;
			}
			for (local33 = local14; local33 < local14 + arg2; local33++) {
				if (local33 >= 0 && local33 < this.anInt447) {
					for (@Pc(49) int local49 = local25; local49 < local25 + arg1; local49++) {
						if (local49 >= 0 && local49 < this.anInt448) {
							this.method299(local33, local49, local3);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("14072, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(III)V")
	public void method298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg1 - this.anInt445;
			@Pc(14) int local14 = arg0 - this.anInt446;
			this.anIntArrayArray13[local9][local14] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("621, " + arg0 + ", " + arg1 + ", " + -56 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "(III)V")
	private void method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray13[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IZIIIZ)V")
	public void method300(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt445;
			@Pc(9) int local9 = arg2 - this.anInt446;
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method302(local9, local4, 128);
					this.method302(local9, local4 - 1, 8);
				}
				if (arg0 == 1) {
					this.method302(local9, local4, 2);
					this.method302(local9 + 1, local4, 32);
				}
				if (arg0 == 2) {
					this.method302(local9, local4, 8);
					this.method302(local9, local4 + 1, 128);
				}
				if (arg0 == 3) {
					this.method302(local9, local4, 32);
					this.method302(local9 - 1, local4, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method302(local9, local4, 1);
					this.method302(local9 + 1, local4 - 1, 16);
				}
				if (arg0 == 1) {
					this.method302(local9, local4, 4);
					this.method302(local9 + 1, local4 + 1, 64);
				}
				if (arg0 == 2) {
					this.method302(local9, local4, 16);
					this.method302(local9 - 1, local4 + 1, 1);
				}
				if (arg0 == 3) {
					this.method302(local9, local4, 64);
					this.method302(local9 - 1, local4 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method302(local9, local4, 130);
					this.method302(local9, local4 - 1, 8);
					this.method302(local9 + 1, local4, 32);
				}
				if (arg0 == 1) {
					this.method302(local9, local4, 10);
					this.method302(local9 + 1, local4, 32);
					this.method302(local9, local4 + 1, 128);
				}
				if (arg0 == 2) {
					this.method302(local9, local4, 40);
					this.method302(local9, local4 + 1, 128);
					this.method302(local9 - 1, local4, 2);
				}
				if (arg0 == 3) {
					this.method302(local9, local4, 160);
					this.method302(local9 - 1, local4, 2);
					this.method302(local9, local4 - 1, 8);
				}
			}
			if (arg1) {
				if (arg4 == 0) {
					if (arg0 == 0) {
						this.method302(local9, local4, 65536);
						this.method302(local9, local4 - 1, 4096);
					}
					if (arg0 == 1) {
						this.method302(local9, local4, 1024);
						this.method302(local9 + 1, local4, 16384);
					}
					if (arg0 == 2) {
						this.method302(local9, local4, 4096);
						this.method302(local9, local4 + 1, 65536);
					}
					if (arg0 == 3) {
						this.method302(local9, local4, 16384);
						this.method302(local9 - 1, local4, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg0 == 0) {
						this.method302(local9, local4, 512);
						this.method302(local9 + 1, local4 - 1, 8192);
					}
					if (arg0 == 1) {
						this.method302(local9, local4, 2048);
						this.method302(local9 + 1, local4 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method302(local9, local4, 8192);
						this.method302(local9 - 1, local4 + 1, 512);
					}
					if (arg0 == 3) {
						this.method302(local9, local4, 32768);
						this.method302(local9 - 1, local4 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg0 == 0) {
						this.method302(local9, local4, 66560);
						this.method302(local9, local4 - 1, 4096);
						this.method302(local9 + 1, local4, 16384);
					}
					if (arg0 == 1) {
						this.method302(local9, local4, 5120);
						this.method302(local9 + 1, local4, 16384);
						this.method302(local9, local4 + 1, 65536);
					}
					if (arg0 == 2) {
						this.method302(local9, local4, 20480);
						this.method302(local9, local4 + 1, 65536);
						this.method302(local9 - 1, local4, 1024);
					}
					if (arg0 == 3) {
						this.method302(local9, local4, 81920);
						this.method302(local9 - 1, local4, 1024);
						this.method302(local9, local4 - 1, 4096);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("2632, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIZIIIZ)V")
	public void method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg1 - this.anInt445;
			@Pc(19) int local19 = arg3 - this.anInt446;
			@Pc(30) int local30;
			if (arg0 == 1 || arg0 == 3) {
				local30 = arg4;
				arg4 = arg5;
				arg5 = local30;
			}
			for (local30 = local14; local30 < local14 + arg4; local30++) {
				if (local30 >= 0 && local30 < this.anInt447) {
					for (@Pc(46) int local46 = local19; local46 < local19 + arg5; local46++) {
						if (local46 >= 0 && local46 < this.anInt448) {
							this.method302(local46, local30, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(ZIII)V")
	private void method302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray13[arg1][arg0] &= 16777215 - arg2;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("58587, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(ZII)V")
	public void method303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt445;
			@Pc(9) int local9 = arg1 - this.anInt446;
			this.anIntArrayArray13[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("90723, " + true + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg3 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt445;
			@Pc(17) int local17 = arg4 - this.anInt446;
			@Pc(22) int local22 = arg3 - this.anInt445;
			@Pc(27) int local27 = arg1 - this.anInt446;
			if (arg5 == 0) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray13[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray13[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray13[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray13[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray13[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray13[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray13[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray13[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray13[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray13[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray13[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(571) RuntimeException local571) {
			signlink.reporterror("30172, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 45022 + ", " + arg5 + ", " + local571.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg2 && arg3 == arg1) {
				return true;
			}
			@Pc(14) int local14 = arg5 - this.anInt445;
			@Pc(19) int local19 = arg3 - this.anInt446;
			@Pc(24) int local24 = arg2 - this.anInt445;
			@Pc(40) int local40 = arg1 - this.anInt446;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray13[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray13[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray13[local14][local19] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray13[local14][local19] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray13[local14][local19] & 0x20) == 0) {
					return true;
				}
				if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray13[local14][local19] & 0x2) == 0) {
					return true;
				}
				if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x8) == 0) {
					return true;
				}
				if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray13[local14][local19] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("32709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -953 + ", " + arg5 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXMJPDWD", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg0 + arg3 - 1;
			@Pc(16) int local16 = arg2 + arg5 - 1;
			if (arg6 >= arg0 && arg6 <= local10 && arg4 >= arg2 && arg4 <= local16) {
				return true;
			} else if (arg6 == arg0 - 1 && arg4 >= arg2 && arg4 <= local16 && (this.anIntArrayArray13[arg6 - this.anInt445][arg4 - this.anInt446] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg6 == local10 + 1 && arg4 >= arg2 && arg4 <= local16 && (this.anIntArrayArray13[arg6 - this.anInt445][arg4 - this.anInt446] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg2 - 1 && arg6 >= arg0 && arg6 <= local10 && (this.anIntArrayArray13[arg6 - this.anInt445][arg4 - this.anInt446] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local16 + 1 && arg6 >= arg0 && arg6 <= local10 && (this.anIntArrayArray13[arg6 - this.anInt445][arg4 - this.anInt446] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("26248, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
