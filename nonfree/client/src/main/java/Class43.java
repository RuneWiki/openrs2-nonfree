import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XBMRDXRN")
public final class Class43 {

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!XBMRDXRN", name = "b", descriptor = "I")
	private int anInt761 = 18376;

	@OriginalMember(owner = "client!XBMRDXRN", name = "c", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!XBMRDXRN", name = "d", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!XBMRDXRN", name = "e", descriptor = "B")
	private byte aByte33 = 3;

	@OriginalMember(owner = "client!XBMRDXRN", name = "f", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!XBMRDXRN", name = "g", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!XBMRDXRN", name = "h", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!XBMRDXRN", name = "i", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!XBMRDXRN", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!XBMRDXRN", name = "<init>", descriptor = "(III)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt762 = 0;
			this.anInt763 = 0;
			this.anInt764 = arg1;
			this.anInt765 = arg0;
			if (arg2 != 32443) {
				throw new NullPointerException();
			}
			this.anIntArrayArray19 = new int[this.anInt764][this.anInt765];
			this.method508();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("19602, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "()V")
	public void method508() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt764; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt765; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt764 - 1 || local7 == this.anInt765 - 1) {
					this.anIntArrayArray19[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray19[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IZIIII)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt762;
			if (arg5 == 0) {
				@Pc(12) int local12 = arg3 - this.anInt763;
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method512(local4, local12, 128);
						this.method512(local4 - 1, local12, 8);
					}
					if (arg4 == 1) {
						this.method512(local4, local12, 2);
						this.method512(local4, local12 + 1, 32);
					}
					if (arg4 == 2) {
						this.method512(local4, local12, 8);
						this.method512(local4 + 1, local12, 128);
					}
					if (arg4 == 3) {
						this.method512(local4, local12, 32);
						this.method512(local4, local12 - 1, 2);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method512(local4, local12, 1);
						this.method512(local4 - 1, local12 + 1, 16);
					}
					if (arg4 == 1) {
						this.method512(local4, local12, 4);
						this.method512(local4 + 1, local12 + 1, 64);
					}
					if (arg4 == 2) {
						this.method512(local4, local12, 16);
						this.method512(local4 + 1, local12 - 1, 1);
					}
					if (arg4 == 3) {
						this.method512(local4, local12, 64);
						this.method512(local4 - 1, local12 - 1, 4);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method512(local4, local12, 130);
						this.method512(local4 - 1, local12, 8);
						this.method512(local4, local12 + 1, 32);
					}
					if (arg4 == 1) {
						this.method512(local4, local12, 10);
						this.method512(local4, local12 + 1, 32);
						this.method512(local4 + 1, local12, 128);
					}
					if (arg4 == 2) {
						this.method512(local4, local12, 40);
						this.method512(local4 + 1, local12, 128);
						this.method512(local4, local12 - 1, 2);
					}
					if (arg4 == 3) {
						this.method512(local4, local12, 160);
						this.method512(local4, local12 - 1, 2);
						this.method512(local4 - 1, local12, 8);
					}
				}
				if (arg1) {
					if (arg2 == 0) {
						if (arg4 == 0) {
							this.method512(local4, local12, 65536);
							this.method512(local4 - 1, local12, 4096);
						}
						if (arg4 == 1) {
							this.method512(local4, local12, 1024);
							this.method512(local4, local12 + 1, 16384);
						}
						if (arg4 == 2) {
							this.method512(local4, local12, 4096);
							this.method512(local4 + 1, local12, 65536);
						}
						if (arg4 == 3) {
							this.method512(local4, local12, 16384);
							this.method512(local4, local12 - 1, 1024);
						}
					}
					if (arg2 == 1 || arg2 == 3) {
						if (arg4 == 0) {
							this.method512(local4, local12, 512);
							this.method512(local4 - 1, local12 + 1, 8192);
						}
						if (arg4 == 1) {
							this.method512(local4, local12, 2048);
							this.method512(local4 + 1, local12 + 1, 32768);
						}
						if (arg4 == 2) {
							this.method512(local4, local12, 8192);
							this.method512(local4 + 1, local12 - 1, 512);
						}
						if (arg4 == 3) {
							this.method512(local4, local12, 32768);
							this.method512(local4 - 1, local12 - 1, 2048);
						}
					}
					if (arg2 == 2) {
						if (arg4 == 0) {
							this.method512(local4, local12, 66560);
							this.method512(local4 - 1, local12, 4096);
							this.method512(local4, local12 + 1, 16384);
						}
						if (arg4 == 1) {
							this.method512(local4, local12, 5120);
							this.method512(local4, local12 + 1, 16384);
							this.method512(local4 + 1, local12, 65536);
						}
						if (arg4 == 2) {
							this.method512(local4, local12, 20480);
							this.method512(local4 + 1, local12, 65536);
							this.method512(local4, local12 - 1, 1024);
						}
						if (arg4 == 3) {
							this.method512(local4, local12, 81920);
							this.method512(local4, local12 - 1, 1024);
							this.method512(local4 - 1, local12, 4096);
							return;
						}
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("47752, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIBIZI)V")
	public void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3 == 83) {
				if (arg5) {
					local3 = 131328;
				}
				@Pc(18) int local18 = arg1 - this.anInt762;
				@Pc(23) int local23 = arg2 - this.anInt763;
				@Pc(31) int local31;
				if (arg0 == 1 || arg0 == 3) {
					local31 = arg4;
					arg4 = arg6;
					arg6 = local31;
				}
				for (local31 = local18; local31 < local18 + arg4; local31++) {
					if (local31 >= 0 && local31 < this.anInt764) {
						for (@Pc(47) int local47 = local23; local47 < local23 + arg6; local47++) {
							if (local47 >= 0 && local47 < this.anInt765) {
								this.method512(local31, local47, local3);
							}
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("1903, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(III)V")
	public void method511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg0 - this.anInt762;
			@Pc(12) int local12 = arg1 - this.anInt763;
			this.anIntArrayArray19[local7][local12] |= 0x200000;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27504, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "b", descriptor = "(III)V")
	private void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray19[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIIIZ)V")
	public void method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(6) int local6 = arg3 - this.anInt762;
			@Pc(22) int local22 = arg0 - this.anInt763;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method515(128, local6, local22);
					this.method515(8, local6 - 1, local22);
				}
				if (arg2 == 1) {
					this.method515(2, local6, local22);
					this.method515(32, local6, local22 + 1);
				}
				if (arg2 == 2) {
					this.method515(8, local6, local22);
					this.method515(128, local6 + 1, local22);
				}
				if (arg2 == 3) {
					this.method515(32, local6, local22);
					this.method515(2, local6, local22 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method515(1, local6, local22);
					this.method515(16, local6 - 1, local22 + 1);
				}
				if (arg2 == 1) {
					this.method515(4, local6, local22);
					this.method515(64, local6 + 1, local22 + 1);
				}
				if (arg2 == 2) {
					this.method515(16, local6, local22);
					this.method515(1, local6 + 1, local22 - 1);
				}
				if (arg2 == 3) {
					this.method515(64, local6, local22);
					this.method515(4, local6 - 1, local22 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method515(130, local6, local22);
					this.method515(8, local6 - 1, local22);
					this.method515(32, local6, local22 + 1);
				}
				if (arg2 == 1) {
					this.method515(10, local6, local22);
					this.method515(32, local6, local22 + 1);
					this.method515(128, local6 + 1, local22);
				}
				if (arg2 == 2) {
					this.method515(40, local6, local22);
					this.method515(128, local6 + 1, local22);
					this.method515(2, local6, local22 - 1);
				}
				if (arg2 == 3) {
					this.method515(160, local6, local22);
					this.method515(2, local6, local22 - 1);
					this.method515(8, local6 - 1, local22);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method515(65536, local6, local22);
						this.method515(4096, local6 - 1, local22);
					}
					if (arg2 == 1) {
						this.method515(1024, local6, local22);
						this.method515(16384, local6, local22 + 1);
					}
					if (arg2 == 2) {
						this.method515(4096, local6, local22);
						this.method515(65536, local6 + 1, local22);
					}
					if (arg2 == 3) {
						this.method515(16384, local6, local22);
						this.method515(1024, local6, local22 - 1);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method515(512, local6, local22);
						this.method515(8192, local6 - 1, local22 + 1);
					}
					if (arg2 == 1) {
						this.method515(2048, local6, local22);
						this.method515(32768, local6 + 1, local22 + 1);
					}
					if (arg2 == 2) {
						this.method515(8192, local6, local22);
						this.method515(512, local6 + 1, local22 - 1);
					}
					if (arg2 == 3) {
						this.method515(32768, local6, local22);
						this.method515(2048, local6 - 1, local22 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method515(66560, local6, local22);
						this.method515(4096, local6 - 1, local22);
						this.method515(16384, local6, local22 + 1);
					}
					if (arg2 == 1) {
						this.method515(5120, local6, local22);
						this.method515(16384, local6, local22 + 1);
						this.method515(65536, local6 + 1, local22);
					}
					if (arg2 == 2) {
						this.method515(20480, local6, local22);
						this.method515(65536, local6 + 1, local22);
						this.method515(1024, local6, local22 - 1);
					}
					if (arg2 == 3) {
						this.method515(81920, local6, local22);
						this.method515(1024, local6, local22 - 1);
						this.method515(4096, local6 - 1, local22);
						return;
					}
				}
			}
		} catch (@Pc(530) RuntimeException local530) {
			signlink.reporterror("79687, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -913 + ", " + arg4 + ", " + local530.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIZIZI)V")
	public void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt762;
			if (!arg5) {
				@Pc(22) int local22 = arg1 - this.anInt763;
				@Pc(30) int local30;
				if (arg2 == 1 || arg2 == 3) {
					local30 = arg6;
					arg6 = arg4;
					arg4 = local30;
				}
				for (local30 = local14; local30 < local14 + arg6; local30++) {
					if (local30 >= 0 && local30 < this.anInt764) {
						for (@Pc(46) int local46 = local22; local46 < local22 + arg4; local46++) {
							if (local46 >= 0 && local46 < this.anInt765) {
								this.method515(local3, local30, local46);
							}
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("3785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIII)V")
	private void method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray19[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("81149, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -55 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "c", descriptor = "(III)V")
	public void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt762;
			@Pc(9) int local9 = arg0 - this.anInt763;
			this.anIntArrayArray19[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("38983, " + arg0 + ", " + arg1 + ", " + 49740 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg4 && arg5 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt762;
			@Pc(17) int local17 = arg5 - this.anInt763;
			@Pc(28) int local28 = arg4 - this.anInt762;
			@Pc(33) int local33 = arg3 - this.anInt763;
			if (arg0 == 0) {
				if (arg2 == 0) {
					if (local12 == local28 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local28 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local28 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local28 && local17 == local33 - 1) {
						return true;
					}
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					if (local12 == local28 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray19[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local28 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray19[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local28 && local17 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local28 && local17 == local33 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local17 == local33 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local17 == local33 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("89355, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg5 && arg4 == arg1) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt762;
			@Pc(17) int local17 = arg4 - this.anInt763;
			@Pc(22) int local22 = arg5 - this.anInt762;
			@Pc(36) int local36 = arg1 - this.anInt763;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray19[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray19[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray19[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("91738, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBMRDXRN", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg0 - 1;
			@Pc(11) int local11 = arg3 + arg2 - 1;
			if (arg5 >= arg6 && arg5 <= local5 && arg4 >= arg3 && arg4 <= local11) {
				return true;
			} else if (arg5 == arg6 - 1 && arg4 >= arg3 && arg4 <= local11 && (this.anIntArrayArray19[arg5 - this.anInt762][arg4 - this.anInt763] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg5 == local5 + 1 && arg4 >= arg3 && arg4 <= local11 && (this.anIntArrayArray19[arg5 - this.anInt762][arg4 - this.anInt763] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg3 - 1 && arg5 >= arg6 && arg5 <= local5 && (this.anIntArrayArray19[arg5 - this.anInt762][arg4 - this.anInt763] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local11 + 1 && arg5 >= arg6 && arg5 <= local5 && (this.anIntArrayArray19[arg5 - this.anInt762][arg4 - this.anInt763] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("42686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}
}
