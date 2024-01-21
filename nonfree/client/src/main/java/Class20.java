import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KFLNJHKB")
public final class Class20 {

	@OriginalMember(owner = "client!KFLNJHKB", name = "c", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!KFLNJHKB", name = "b", descriptor = "I")
	private int anInt375 = -874;

	@OriginalMember(owner = "client!KFLNJHKB", name = "d", descriptor = "I")
	private int anInt377 = -374;

	@OriginalMember(owner = "client!KFLNJHKB", name = "e", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!KFLNJHKB", name = "f", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!KFLNJHKB", name = "g", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!KFLNJHKB", name = "h", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!KFLNJHKB", name = "i", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!KFLNJHKB", name = "j", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!KFLNJHKB", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!KFLNJHKB", name = "<init>", descriptor = "(BII)V")
	public Class20(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt378 = 0;
			this.anInt379 = 0;
			this.anInt380 = arg1;
			this.anInt381 = arg2;
			this.anIntArrayArray7 = new int[this.anInt380][this.anInt381];
			this.method276();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("86848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "()V")
	public void method276() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt380; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt381; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt380 - 1 || local7 == this.anInt381 - 1) {
					this.anIntArrayArray7[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray7[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIZIII)V")
	public void method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = arg4 - this.anInt378;
			@Pc(13) int local13 = arg3 - this.anInt379;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method280(local8, local13, 128);
					this.method280(local8 - 1, local13, 8);
				}
				if (arg1 == 1) {
					this.method280(local8, local13, 2);
					this.method280(local8, local13 + 1, 32);
				}
				if (arg1 == 2) {
					this.method280(local8, local13, 8);
					this.method280(local8 + 1, local13, 128);
				}
				if (arg1 == 3) {
					this.method280(local8, local13, 32);
					this.method280(local8, local13 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method280(local8, local13, 1);
					this.method280(local8 - 1, local13 + 1, 16);
				}
				if (arg1 == 1) {
					this.method280(local8, local13, 4);
					this.method280(local8 + 1, local13 + 1, 64);
				}
				if (arg1 == 2) {
					this.method280(local8, local13, 16);
					this.method280(local8 + 1, local13 - 1, 1);
				}
				if (arg1 == 3) {
					this.method280(local8, local13, 64);
					this.method280(local8 - 1, local13 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method280(local8, local13, 130);
					this.method280(local8 - 1, local13, 8);
					this.method280(local8, local13 + 1, 32);
				}
				if (arg1 == 1) {
					this.method280(local8, local13, 10);
					this.method280(local8, local13 + 1, 32);
					this.method280(local8 + 1, local13, 128);
				}
				if (arg1 == 2) {
					this.method280(local8, local13, 40);
					this.method280(local8 + 1, local13, 128);
					this.method280(local8, local13 - 1, 2);
				}
				if (arg1 == 3) {
					this.method280(local8, local13, 160);
					this.method280(local8, local13 - 1, 2);
					this.method280(local8 - 1, local13, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method280(local8, local13, 65536);
						this.method280(local8 - 1, local13, 4096);
					}
					if (arg1 == 1) {
						this.method280(local8, local13, 1024);
						this.method280(local8, local13 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method280(local8, local13, 4096);
						this.method280(local8 + 1, local13, 65536);
					}
					if (arg1 == 3) {
						this.method280(local8, local13, 16384);
						this.method280(local8, local13 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method280(local8, local13, 512);
						this.method280(local8 - 1, local13 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method280(local8, local13, 2048);
						this.method280(local8 + 1, local13 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method280(local8, local13, 8192);
						this.method280(local8 + 1, local13 - 1, 512);
					}
					if (arg1 == 3) {
						this.method280(local8, local13, 32768);
						this.method280(local8 - 1, local13 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method280(local8, local13, 66560);
						this.method280(local8 - 1, local13, 4096);
						this.method280(local8, local13 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method280(local8, local13, 5120);
						this.method280(local8, local13 + 1, 16384);
						this.method280(local8 + 1, local13, 65536);
					}
					if (arg1 == 2) {
						this.method280(local8, local13, 20480);
						this.method280(local8 + 1, local13, 65536);
						this.method280(local8, local13 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method280(local8, local13, 81920);
						this.method280(local8, local13 - 1, 1024);
						this.method280(local8 - 1, local13, 4096);
						return;
					}
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("73154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(ZIIIIIB)V")
	public void method278(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt378;
			@Pc(19) int local19 = arg1 - this.anInt379;
			@Pc(27) int local27;
			if (arg4 == 1 || arg4 == 3) {
				local27 = arg3;
				arg3 = arg2;
				arg2 = local27;
			}
			for (local27 = local14; local27 < local14 + arg3; local27++) {
				if (local27 >= 0 && local27 < this.anInt380) {
					for (@Pc(43) int local43 = local19; local43 < local19 + arg2; local43++) {
						if (local43 >= 0 && local43 < this.anInt381) {
							this.method280(local27, local43, local3);
						}
					}
				}
			}
			@Pc(73) boolean local73 = false;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(III)V")
	public void method279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt378;
			@Pc(9) int local9 = arg1 - this.anInt379;
			this.anIntArrayArray7[local4][local9] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("39826, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "b", descriptor = "(III)V")
	private void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray7[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIIZII)V")
	public void method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg4 - this.anInt378;
			@Pc(12) int local12 = arg0 - this.anInt379;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method283(local4, local12, 128);
					this.method283(local4 - 1, local12, 8);
				}
				if (arg2 == 1) {
					this.method283(local4, local12, 2);
					this.method283(local4, local12 + 1, 32);
				}
				if (arg2 == 2) {
					this.method283(local4, local12, 8);
					this.method283(local4 + 1, local12, 128);
				}
				if (arg2 == 3) {
					this.method283(local4, local12, 32);
					this.method283(local4, local12 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method283(local4, local12, 1);
					this.method283(local4 - 1, local12 + 1, 16);
				}
				if (arg2 == 1) {
					this.method283(local4, local12, 4);
					this.method283(local4 + 1, local12 + 1, 64);
				}
				if (arg2 == 2) {
					this.method283(local4, local12, 16);
					this.method283(local4 + 1, local12 - 1, 1);
				}
				if (arg2 == 3) {
					this.method283(local4, local12, 64);
					this.method283(local4 - 1, local12 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method283(local4, local12, 130);
					this.method283(local4 - 1, local12, 8);
					this.method283(local4, local12 + 1, 32);
				}
				if (arg2 == 1) {
					this.method283(local4, local12, 10);
					this.method283(local4, local12 + 1, 32);
					this.method283(local4 + 1, local12, 128);
				}
				if (arg2 == 2) {
					this.method283(local4, local12, 40);
					this.method283(local4 + 1, local12, 128);
					this.method283(local4, local12 - 1, 2);
				}
				if (arg2 == 3) {
					this.method283(local4, local12, 160);
					this.method283(local4, local12 - 1, 2);
					this.method283(local4 - 1, local12, 8);
				}
			}
			if (arg3) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method283(local4, local12, 65536);
						this.method283(local4 - 1, local12, 4096);
					}
					if (arg2 == 1) {
						this.method283(local4, local12, 1024);
						this.method283(local4, local12 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method283(local4, local12, 4096);
						this.method283(local4 + 1, local12, 65536);
					}
					if (arg2 == 3) {
						this.method283(local4, local12, 16384);
						this.method283(local4, local12 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method283(local4, local12, 512);
						this.method283(local4 - 1, local12 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method283(local4, local12, 2048);
						this.method283(local4 + 1, local12 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method283(local4, local12, 8192);
						this.method283(local4 + 1, local12 - 1, 512);
					}
					if (arg2 == 3) {
						this.method283(local4, local12, 32768);
						this.method283(local4 - 1, local12 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method283(local4, local12, 66560);
						this.method283(local4 - 1, local12, 4096);
						this.method283(local4, local12 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method283(local4, local12, 5120);
						this.method283(local4, local12 + 1, 16384);
						this.method283(local4 + 1, local12, 65536);
					}
					if (arg2 == 2) {
						this.method283(local4, local12, 20480);
						this.method283(local4 + 1, local12, 65536);
						this.method283(local4, local12 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method283(local4, local12, 81920);
						this.method283(local4, local12 - 1, 1024);
						this.method283(local4 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("13922, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 210 + ", " + arg4 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIIIZBI)V")
	public void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt378;
			@Pc(19) int local19 = arg1 - this.anInt379;
			if (arg5 == 20) {
				@Pc(31) int local31;
				if (arg3 == 1 || arg3 == 3) {
					local31 = arg0;
					arg0 = arg6;
					arg6 = local31;
				}
				for (local31 = local14; local31 < local14 + arg0; local31++) {
					if (local31 >= 0 && local31 < this.anInt380) {
						for (@Pc(47) int local47 = local19; local47 < local19 + arg6; local47++) {
							if (local47 >= 0 && local47 < this.anInt381) {
								this.method283(local31, local47, local3);
							}
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("66296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIBI)V")
	private void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray7[arg0][arg1] &= 16777215 - arg2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("98441, " + arg0 + ", " + arg1 + ", " + -34 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IBI)V")
	public void method284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt378;
			@Pc(13) int local13 = arg1 - this.anInt379;
			this.anIntArrayArray7[local4][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("82623, " + arg0 + ", " + 58 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IZIIIII)Z")
	public boolean method285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg4 && arg3 == arg5) {
				return true;
			}
			@Pc(22) int local22 = arg0 - this.anInt378;
			@Pc(27) int local27 = arg3 - this.anInt379;
			@Pc(32) int local32 = arg4 - this.anInt378;
			@Pc(37) int local37 = arg5 - this.anInt379;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray7[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray7[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray7[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray7[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local22 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray7[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray7[local22][local27] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280108) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray7[local22][local27] & 0x1280120) == 0) {
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
					if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray7[local22][local27] & 0x1280120) == 0) {
						return true;
					}
					if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x1280180) == 0) {
						return true;
					}
					if (local22 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local22 == local32 && local27 == local37 + 1 && (this.anIntArrayArray7[local22][local27] & 0x20) == 0) {
					return true;
				}
				if (local22 == local32 && local27 == local37 - 1 && (this.anIntArrayArray7[local22][local27] & 0x2) == 0) {
					return true;
				}
				if (local22 == local32 - 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x8) == 0) {
					return true;
				}
				if (local22 == local32 + 1 && local27 == local37 && (this.anIntArrayArray7[local22][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("48689, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIZIIII)Z")
	public boolean method286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg0 && arg3 == arg4) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt378;
			@Pc(17) int local17 = arg3 - this.anInt379;
			@Pc(22) int local22 = arg0 - this.anInt378;
			@Pc(37) int local37 = arg4 - this.anInt379;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local12 == local22 && local17 == local37 + 1 && (this.anIntArrayArray7[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local37 - 1 && (this.anIntArrayArray7[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local37 && (this.anIntArrayArray7[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("54888, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFLNJHKB", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(15) int local15 = arg2 + arg3 - 1;
			@Pc(21) int local21 = arg6 + arg1 - 1;
			if (arg5 >= arg2 && arg5 <= local15 && arg4 >= arg6 && arg4 <= local21) {
				return true;
			} else if (arg5 == arg2 - 1 && arg4 >= arg6 && arg4 <= local21 && (this.anIntArrayArray7[arg5 - this.anInt378][arg4 - this.anInt379] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg5 == local15 + 1 && arg4 >= arg6 && arg4 <= local21 && (this.anIntArrayArray7[arg5 - this.anInt378][arg4 - this.anInt379] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg6 - 1 && arg5 >= arg2 && arg5 <= local15 && (this.anIntArrayArray7[arg5 - this.anInt378][arg4 - this.anInt379] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local21 + 1 && arg5 >= arg2 && arg5 <= local15 && (this.anIntArrayArray7[arg5 - this.anInt378][arg4 - this.anInt379] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("82310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -30 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
