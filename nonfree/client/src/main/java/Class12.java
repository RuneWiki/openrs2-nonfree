import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EOSBSGLH")
public final class Class12 {

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "I")
	private int anInt129 = 7;

	@OriginalMember(owner = "client!EOSBSGLH", name = "b", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!EOSBSGLH", name = "c", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!EOSBSGLH", name = "d", descriptor = "I")
	private int anInt130 = -877;

	@OriginalMember(owner = "client!EOSBSGLH", name = "e", descriptor = "B")
	private byte aByte13 = 6;

	@OriginalMember(owner = "client!EOSBSGLH", name = "f", descriptor = "I")
	private int anInt131 = 188;

	@OriginalMember(owner = "client!EOSBSGLH", name = "g", descriptor = "Z")
	private boolean aBoolean47 = true;

	@OriginalMember(owner = "client!EOSBSGLH", name = "h", descriptor = "I")
	private int anInt132 = 15536;

	@OriginalMember(owner = "client!EOSBSGLH", name = "i", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!EOSBSGLH", name = "j", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!EOSBSGLH", name = "k", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!EOSBSGLH", name = "l", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!EOSBSGLH", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!EOSBSGLH", name = "<init>", descriptor = "(IIB)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt133 = 0;
			if (arg2 != this.aByte13) {
				this.aBoolean45 = !this.aBoolean45;
			}
			this.anInt134 = 0;
			this.anInt135 = arg0;
			this.anInt136 = arg1;
			this.anIntArrayArray3 = new int[this.anInt135][this.anInt136];
			this.method66();
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("5271, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "()V")
	public void method66() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt135; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt136; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt135 - 1 || local7 == this.anInt136 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(ZIIIIZ)V")
	public void method67(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt133;
			@Pc(9) int local9 = arg3 - this.anInt134;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method70(local4, local9, 128);
					this.method70(local4 - 1, local9, 8);
				}
				if (arg2 == 1) {
					this.method70(local4, local9, 2);
					this.method70(local4, local9 + 1, 32);
				}
				if (arg2 == 2) {
					this.method70(local4, local9, 8);
					this.method70(local4 + 1, local9, 128);
				}
				if (arg2 == 3) {
					this.method70(local4, local9, 32);
					this.method70(local4, local9 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method70(local4, local9, 1);
					this.method70(local4 - 1, local9 + 1, 16);
				}
				if (arg2 == 1) {
					this.method70(local4, local9, 4);
					this.method70(local4 + 1, local9 + 1, 64);
				}
				if (arg2 == 2) {
					this.method70(local4, local9, 16);
					this.method70(local4 + 1, local9 - 1, 1);
				}
				if (arg2 == 3) {
					this.method70(local4, local9, 64);
					this.method70(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method70(local4, local9, 130);
					this.method70(local4 - 1, local9, 8);
					this.method70(local4, local9 + 1, 32);
				}
				if (arg2 == 1) {
					this.method70(local4, local9, 10);
					this.method70(local4, local9 + 1, 32);
					this.method70(local4 + 1, local9, 128);
				}
				if (arg2 == 2) {
					this.method70(local4, local9, 40);
					this.method70(local4 + 1, local9, 128);
					this.method70(local4, local9 - 1, 2);
				}
				if (arg2 == 3) {
					this.method70(local4, local9, 160);
					this.method70(local4, local9 - 1, 2);
					this.method70(local4 - 1, local9, 8);
				}
			}
			if (arg0) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method70(local4, local9, 65536);
						this.method70(local4 - 1, local9, 4096);
					}
					if (arg2 == 1) {
						this.method70(local4, local9, 1024);
						this.method70(local4, local9 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method70(local4, local9, 4096);
						this.method70(local4 + 1, local9, 65536);
					}
					if (arg2 == 3) {
						this.method70(local4, local9, 16384);
						this.method70(local4, local9 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method70(local4, local9, 512);
						this.method70(local4 - 1, local9 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method70(local4, local9, 2048);
						this.method70(local4 + 1, local9 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method70(local4, local9, 8192);
						this.method70(local4 + 1, local9 - 1, 512);
					}
					if (arg2 == 3) {
						this.method70(local4, local9, 32768);
						this.method70(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method70(local4, local9, 66560);
						this.method70(local4 - 1, local9, 4096);
						this.method70(local4, local9 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method70(local4, local9, 5120);
						this.method70(local4, local9 + 1, 16384);
						this.method70(local4 + 1, local9, 65536);
					}
					if (arg2 == 2) {
						this.method70(local4, local9, 20480);
						this.method70(local4 + 1, local9, 65536);
						this.method70(local4, local9 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method70(local4, local9, 81920);
						this.method70(local4, local9 - 1, 1024);
						this.method70(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("40345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIZI)V")
	public void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt133;
			@Pc(19) int local19 = arg1 - this.anInt134;
			@Pc(31) int local31;
			if (arg5 == 1 || arg5 == 3) {
				local31 = arg0;
				arg0 = arg2;
				arg2 = local31;
			}
			for (local31 = local14; local31 < local14 + arg0; local31++) {
				if (local31 >= 0 && local31 < this.anInt135) {
					for (@Pc(47) int local47 = local19; local47 < local19 + arg2; local47++) {
						if (local47 >= 0 && local47 < this.anInt136) {
							this.method70(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("74794, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -7465 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(III)V")
	public void method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt133;
			@Pc(9) int local9 = arg1 - this.anInt134;
			this.anIntArrayArray3[local4][local9] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("25106, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "b", descriptor = "(III)V")
	private void method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIZIII)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt133;
			@Pc(18) int local18 = arg0 - this.anInt134;
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method73(128, local4, local18);
					this.method73(8, local4 - 1, local18);
				}
				if (arg4 == 1) {
					this.method73(2, local4, local18);
					this.method73(32, local4, local18 + 1);
				}
				if (arg4 == 2) {
					this.method73(8, local4, local18);
					this.method73(128, local4 + 1, local18);
				}
				if (arg4 == 3) {
					this.method73(32, local4, local18);
					this.method73(2, local4, local18 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method73(1, local4, local18);
					this.method73(16, local4 - 1, local18 + 1);
				}
				if (arg4 == 1) {
					this.method73(4, local4, local18);
					this.method73(64, local4 + 1, local18 + 1);
				}
				if (arg4 == 2) {
					this.method73(16, local4, local18);
					this.method73(1, local4 + 1, local18 - 1);
				}
				if (arg4 == 3) {
					this.method73(64, local4, local18);
					this.method73(4, local4 - 1, local18 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method73(130, local4, local18);
					this.method73(8, local4 - 1, local18);
					this.method73(32, local4, local18 + 1);
				}
				if (arg4 == 1) {
					this.method73(10, local4, local18);
					this.method73(32, local4, local18 + 1);
					this.method73(128, local4 + 1, local18);
				}
				if (arg4 == 2) {
					this.method73(40, local4, local18);
					this.method73(128, local4 + 1, local18);
					this.method73(2, local4, local18 - 1);
				}
				if (arg4 == 3) {
					this.method73(160, local4, local18);
					this.method73(2, local4, local18 - 1);
					this.method73(8, local4 - 1, local18);
				}
			}
			if (arg2) {
				if (arg3 == 0) {
					if (arg4 == 0) {
						this.method73(65536, local4, local18);
						this.method73(4096, local4 - 1, local18);
					}
					if (arg4 == 1) {
						this.method73(1024, local4, local18);
						this.method73(16384, local4, local18 + 1);
					}
					if (arg4 == 2) {
						this.method73(4096, local4, local18);
						this.method73(65536, local4 + 1, local18);
					}
					if (arg4 == 3) {
						this.method73(16384, local4, local18);
						this.method73(1024, local4, local18 - 1);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg4 == 0) {
						this.method73(512, local4, local18);
						this.method73(8192, local4 - 1, local18 + 1);
					}
					if (arg4 == 1) {
						this.method73(2048, local4, local18);
						this.method73(32768, local4 + 1, local18 + 1);
					}
					if (arg4 == 2) {
						this.method73(8192, local4, local18);
						this.method73(512, local4 + 1, local18 - 1);
					}
					if (arg4 == 3) {
						this.method73(32768, local4, local18);
						this.method73(2048, local4 - 1, local18 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg4 == 0) {
						this.method73(66560, local4, local18);
						this.method73(4096, local4 - 1, local18);
						this.method73(16384, local4, local18 + 1);
					}
					if (arg4 == 1) {
						this.method73(5120, local4, local18);
						this.method73(16384, local4, local18 + 1);
						this.method73(65536, local4 + 1, local18);
					}
					if (arg4 == 2) {
						this.method73(20480, local4, local18);
						this.method73(65536, local4 + 1, local18);
						this.method73(1024, local4, local18 - 1);
					}
					if (arg4 == 3) {
						this.method73(81920, local4, local18);
						this.method73(1024, local4, local18 - 1);
						this.method73(4096, local4 - 1, local18);
						return;
					}
				}
			}
		} catch (@Pc(526) RuntimeException local526) {
			signlink.reporterror("93002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 331 + ", " + arg4 + ", " + local526.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIIZ)V")
	public void method72(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg3 - this.anInt133;
			@Pc(19) int local19 = arg2 - this.anInt134;
			@Pc(32) int local32;
			if (arg4 == 1 || arg4 == 3) {
				local32 = arg0;
				arg0 = arg1;
				arg1 = local32;
			}
			for (local32 = local14; local32 < local14 + arg0; local32++) {
				if (local32 >= 0 && local32 < this.anInt135) {
					for (@Pc(48) int local48 = local19; local48 < local19 + arg1; local48++) {
						if (local48 >= 0 && local48 < this.anInt136) {
							this.method73(local3, local32, local48);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("12849, " + arg0 + ", " + 188 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIBI)V")
	private void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray3[arg1][arg2] &= 16777215 - arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("10567, " + arg0 + ", " + arg1 + ", " + -119 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IBI)V")
	public void method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt133;
			@Pc(15) int local15 = arg1 - this.anInt134;
			this.anIntArrayArray3[local4][local15] &= 0xDFFFFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("53315, " + arg0 + ", " + 64 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(BIIIIII)Z")
	public boolean method75(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg2 == arg4 && arg3 == arg1) {
				return true;
			}
			@Pc(27) int local27 = arg2 - this.anInt133;
			@Pc(32) int local32 = arg3 - this.anInt134;
			@Pc(37) int local37 = arg4 - this.anInt133;
			@Pc(42) int local42 = arg1 - this.anInt134;
			if (arg5 == 0) {
				if (arg6 == 0) {
					if (local27 == local37 - 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1 && (this.anIntArrayArray3[local27][local32] & 0x1280120) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1 && (this.anIntArrayArray3[local27][local32] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local27 == local37 && local32 == local42 + 1) {
						return true;
					}
					if (local27 == local37 - 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280108) == 0) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local27 == local37 + 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1 && (this.anIntArrayArray3[local27][local32] & 0x1280120) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1 && (this.anIntArrayArray3[local27][local32] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local27 == local37 && local32 == local42 - 1) {
						return true;
					}
					if (local27 == local37 - 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280108) == 0) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg6 == 0) {
					if (local27 == local37 - 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280180) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1 && (this.anIntArrayArray3[local27][local32] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local27 == local37 - 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280108) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1 && (this.anIntArrayArray3[local27][local32] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local27 == local37 - 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280108) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1 && (this.anIntArrayArray3[local27][local32] & 0x1280120) == 0) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local27 == local37 - 1 && local32 == local42) {
						return true;
					}
					if (local27 == local37 && local32 == local42 + 1 && (this.anIntArrayArray3[local27][local32] & 0x1280120) == 0) {
						return true;
					}
					if (local27 == local37 + 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x1280180) == 0) {
						return true;
					}
					if (local27 == local37 && local32 == local42 - 1) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local27 == local37 && local32 == local42 + 1 && (this.anIntArrayArray3[local27][local32] & 0x20) == 0) {
					return true;
				}
				if (local27 == local37 && local32 == local42 - 1 && (this.anIntArrayArray3[local27][local32] & 0x2) == 0) {
					return true;
				}
				if (local27 == local37 - 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x8) == 0) {
					return true;
				}
				if (local27 == local37 + 1 && local32 == local42 && (this.anIntArrayArray3[local27][local32] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(575) RuntimeException local575) {
			signlink.reporterror("85466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local575.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method76(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 == arg1 && arg4 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg3 - this.anInt133;
			@Pc(17) int local17 = arg4 - this.anInt134;
			@Pc(22) int local22 = arg1 - this.anInt133;
			@Pc(38) int local38 = arg2 - this.anInt134;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local22 + 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local38 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local22 - 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local38 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local22 - 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local38 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local22 + 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local38 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local12 == local22 && local17 == local38 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local38 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local38 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("39804, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EOSBSGLH", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg6 + arg1 - 1;
			@Pc(11) int local11 = arg0 + arg5 - 1;
			if (arg2 != 0) {
				this.anInt130 = -201;
			}
			if (arg3 >= arg6 && arg3 <= local5 && arg7 >= arg0 && arg7 <= local11) {
				return true;
			} else if (arg3 == arg6 - 1 && arg7 >= arg0 && arg7 <= local11 && (this.anIntArrayArray3[arg3 - this.anInt133][arg7 - this.anInt134] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg3 == local5 + 1 && arg7 >= arg0 && arg7 <= local11 && (this.anIntArrayArray3[arg3 - this.anInt133][arg7 - this.anInt134] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg7 == arg0 - 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray3[arg3 - this.anInt133][arg7 - this.anInt134] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg7 == local11 + 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray3[arg3 - this.anInt133][arg7 - this.anInt134] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("86243, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
