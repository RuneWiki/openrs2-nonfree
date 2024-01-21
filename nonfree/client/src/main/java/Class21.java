import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt696 = 32;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private int anInt697 = -44203;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "B")
	private byte aByte30 = 6;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(III)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt698 = 0;
			this.anInt699 = 0;
			if (arg0 != 0) {
				this.aBoolean168 = !this.aBoolean168;
			}
			this.anInt700 = arg2;
			this.anInt701 = arg1;
			this.anIntArrayArray18 = new int[this.anInt700][this.anInt701];
			this.method443();
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("98819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method443() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt700; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt701; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt700 - 1 || local7 == this.anInt701 - 1) {
						this.anIntArrayArray18[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray18[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("22913, " + 3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIIIII)V")
	public void method444(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg5 - this.anInt698;
			if (arg3 == 0) {
				@Pc(12) int local12 = arg1 - this.anInt699;
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method447(local4, local12, 128);
						this.method447(local4 - 1, local12, 8);
					}
					if (arg2 == 1) {
						this.method447(local4, local12, 2);
						this.method447(local4, local12 + 1, 32);
					}
					if (arg2 == 2) {
						this.method447(local4, local12, 8);
						this.method447(local4 + 1, local12, 128);
					}
					if (arg2 == 3) {
						this.method447(local4, local12, 32);
						this.method447(local4, local12 - 1, 2);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method447(local4, local12, 1);
						this.method447(local4 - 1, local12 + 1, 16);
					}
					if (arg2 == 1) {
						this.method447(local4, local12, 4);
						this.method447(local4 + 1, local12 + 1, 64);
					}
					if (arg2 == 2) {
						this.method447(local4, local12, 16);
						this.method447(local4 + 1, local12 - 1, 1);
					}
					if (arg2 == 3) {
						this.method447(local4, local12, 64);
						this.method447(local4 - 1, local12 - 1, 4);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method447(local4, local12, 130);
						this.method447(local4 - 1, local12, 8);
						this.method447(local4, local12 + 1, 32);
					}
					if (arg2 == 1) {
						this.method447(local4, local12, 10);
						this.method447(local4, local12 + 1, 32);
						this.method447(local4 + 1, local12, 128);
					}
					if (arg2 == 2) {
						this.method447(local4, local12, 40);
						this.method447(local4 + 1, local12, 128);
						this.method447(local4, local12 - 1, 2);
					}
					if (arg2 == 3) {
						this.method447(local4, local12, 160);
						this.method447(local4, local12 - 1, 2);
						this.method447(local4 - 1, local12, 8);
					}
				}
				if (arg0) {
					if (arg4 == 0) {
						if (arg2 == 0) {
							this.method447(local4, local12, 65536);
							this.method447(local4 - 1, local12, 4096);
						}
						if (arg2 == 1) {
							this.method447(local4, local12, 1024);
							this.method447(local4, local12 + 1, 16384);
						}
						if (arg2 == 2) {
							this.method447(local4, local12, 4096);
							this.method447(local4 + 1, local12, 65536);
						}
						if (arg2 == 3) {
							this.method447(local4, local12, 16384);
							this.method447(local4, local12 - 1, 1024);
						}
					}
					if (arg4 == 1 || arg4 == 3) {
						if (arg2 == 0) {
							this.method447(local4, local12, 512);
							this.method447(local4 - 1, local12 + 1, 8192);
						}
						if (arg2 == 1) {
							this.method447(local4, local12, 2048);
							this.method447(local4 + 1, local12 + 1, 32768);
						}
						if (arg2 == 2) {
							this.method447(local4, local12, 8192);
							this.method447(local4 + 1, local12 - 1, 512);
						}
						if (arg2 == 3) {
							this.method447(local4, local12, 32768);
							this.method447(local4 - 1, local12 - 1, 2048);
						}
					}
					if (arg4 == 2) {
						if (arg2 == 0) {
							this.method447(local4, local12, 66560);
							this.method447(local4 - 1, local12, 4096);
							this.method447(local4, local12 + 1, 16384);
						}
						if (arg2 == 1) {
							this.method447(local4, local12, 5120);
							this.method447(local4, local12 + 1, 16384);
							this.method447(local4 + 1, local12, 65536);
						}
						if (arg2 == 2) {
							this.method447(local4, local12, 20480);
							this.method447(local4 + 1, local12, 65536);
							this.method447(local4, local12 - 1, 1024);
						}
						if (arg2 == 3) {
							this.method447(local4, local12, 81920);
							this.method447(local4, local12 - 1, 1024);
							this.method447(local4 - 1, local12, 4096);
							return;
						}
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("47501, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZII)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(18) int local18 = arg5 - this.anInt698;
			@Pc(23) int local23 = arg4 - this.anInt699;
			@Pc(31) int local31;
			if (arg1 == 1 || arg1 == 3) {
				local31 = arg2;
				arg2 = arg0;
				arg0 = local31;
			}
			for (local31 = local18; local31 < local18 + arg2; local31++) {
				if (local31 >= 0 && local31 < this.anInt700) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg0; local47++) {
						if (local47 >= 0 && local47 < this.anInt701) {
							this.method447(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("99175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -29036 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt698;
			@Pc(9) int local9 = arg0 - this.anInt699;
			this.anIntArrayArray18[local4][local9] |= 0x200000;
			if (this.anInt697 != -44203) {
				for (@Pc(25) int local25 = 1; local25 > 0; local25++) {
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("21671, " + arg0 + ", " + -44203 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V")
	private void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray18[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZII)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt698;
			@Pc(9) int local9 = arg4 - this.anInt699;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method450(local9, this.aByte30, 128, local4);
					this.method450(local9, this.aByte30, 8, local4 - 1);
				}
				if (arg1 == 1) {
					this.method450(local9, this.aByte30, 2, local4);
					this.method450(local9 + 1, this.aByte30, 32, local4);
				}
				if (arg1 == 2) {
					this.method450(local9, this.aByte30, 8, local4);
					this.method450(local9, this.aByte30, 128, local4 + 1);
				}
				if (arg1 == 3) {
					this.method450(local9, this.aByte30, 32, local4);
					this.method450(local9 - 1, this.aByte30, 2, local4);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method450(local9, this.aByte30, 1, local4);
					this.method450(local9 + 1, this.aByte30, 16, local4 - 1);
				}
				if (arg1 == 1) {
					this.method450(local9, this.aByte30, 4, local4);
					this.method450(local9 + 1, this.aByte30, 64, local4 + 1);
				}
				if (arg1 == 2) {
					this.method450(local9, this.aByte30, 16, local4);
					this.method450(local9 - 1, this.aByte30, 1, local4 + 1);
				}
				if (arg1 == 3) {
					this.method450(local9, this.aByte30, 64, local4);
					this.method450(local9 - 1, this.aByte30, 4, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method450(local9, this.aByte30, 130, local4);
					this.method450(local9, this.aByte30, 8, local4 - 1);
					this.method450(local9 + 1, this.aByte30, 32, local4);
				}
				if (arg1 == 1) {
					this.method450(local9, this.aByte30, 10, local4);
					this.method450(local9 + 1, this.aByte30, 32, local4);
					this.method450(local9, this.aByte30, 128, local4 + 1);
				}
				if (arg1 == 2) {
					this.method450(local9, this.aByte30, 40, local4);
					this.method450(local9, this.aByte30, 128, local4 + 1);
					this.method450(local9 - 1, this.aByte30, 2, local4);
				}
				if (arg1 == 3) {
					this.method450(local9, this.aByte30, 160, local4);
					this.method450(local9 - 1, this.aByte30, 2, local4);
					this.method450(local9, this.aByte30, 8, local4 - 1);
				}
			}
			if (arg3) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method450(local9, this.aByte30, 65536, local4);
						this.method450(local9, this.aByte30, 4096, local4 - 1);
					}
					if (arg1 == 1) {
						this.method450(local9, this.aByte30, 1024, local4);
						this.method450(local9 + 1, this.aByte30, 16384, local4);
					}
					if (arg1 == 2) {
						this.method450(local9, this.aByte30, 4096, local4);
						this.method450(local9, this.aByte30, 65536, local4 + 1);
					}
					if (arg1 == 3) {
						this.method450(local9, this.aByte30, 16384, local4);
						this.method450(local9 - 1, this.aByte30, 1024, local4);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method450(local9, this.aByte30, 512, local4);
						this.method450(local9 + 1, this.aByte30, 8192, local4 - 1);
					}
					if (arg1 == 1) {
						this.method450(local9, this.aByte30, 2048, local4);
						this.method450(local9 + 1, this.aByte30, 32768, local4 + 1);
					}
					if (arg1 == 2) {
						this.method450(local9, this.aByte30, 8192, local4);
						this.method450(local9 - 1, this.aByte30, 512, local4 + 1);
					}
					if (arg1 == 3) {
						this.method450(local9, this.aByte30, 32768, local4);
						this.method450(local9 - 1, this.aByte30, 2048, local4 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method450(local9, this.aByte30, 66560, local4);
						this.method450(local9, this.aByte30, 4096, local4 - 1);
						this.method450(local9 + 1, this.aByte30, 16384, local4);
					}
					if (arg1 == 1) {
						this.method450(local9, this.aByte30, 5120, local4);
						this.method450(local9 + 1, this.aByte30, 16384, local4);
						this.method450(local9, this.aByte30, 65536, local4 + 1);
					}
					if (arg1 == 2) {
						this.method450(local9, this.aByte30, 20480, local4);
						this.method450(local9, this.aByte30, 65536, local4 + 1);
						this.method450(local9 - 1, this.aByte30, 1024, local4);
					}
					if (arg1 == 3) {
						this.method450(local9, this.aByte30, 81920, local4);
						this.method450(local9 - 1, this.aByte30, 1024, local4);
						this.method450(local9, this.aByte30, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(576) RuntimeException local576) {
			signlink.reporterror("85779, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -463 + ", " + arg4 + ", " + local576.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBZIII)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg2) {
				local3 = 131328;
			}
			@Pc(18) int local18 = arg1 - this.anInt698;
			@Pc(23) int local23 = arg0 - this.anInt699;
			@Pc(31) int local31;
			if (arg5 == 1 || arg5 == 3) {
				local31 = arg4;
				arg4 = arg3;
				arg3 = local31;
			}
			for (local31 = local18; local31 < local18 + arg4; local31++) {
				if (local31 >= 0 && local31 < this.anInt700) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg3; local47++) {
						if (local47 >= 0 && local47 < this.anInt701) {
							this.method450(local47, this.aByte30, local3, local31);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("75975, " + arg0 + ", " + arg1 + ", " + 73 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII)V")
	private void method450(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			this.anIntArrayArray18[arg3][arg0] &= 16777215 - arg2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("9570, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - this.anInt698;
			@Pc(14) int local14 = arg1 - this.anInt699;
			this.anIntArrayArray18[local9][local14] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("13376, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIZI)Z")
	public boolean method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 == arg2 && arg1 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg6 - this.anInt698;
			@Pc(17) int local17 = arg1 - this.anInt699;
			@Pc(22) int local22 = arg2 - this.anInt698;
			@Pc(27) int local27 = arg3 - this.anInt699;
			if (!arg5) {
				for (@Pc(31) int local31 = 1; local31 > 0; local31++) {
				}
			}
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 - 1 && local17 == local27) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray18[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray18[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray18[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("88637, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBIIIII)Z")
	public boolean method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg0 && arg2 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt698;
			@Pc(23) int local23 = arg2 - this.anInt699;
			@Pc(28) int local28 = arg0 - this.anInt698;
			@Pc(33) int local33 = arg3 - this.anInt699;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray18[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray18[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray18[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("43334, " + arg0 + ", " + -96 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg5 - 1;
			@Pc(11) int local11 = arg3 + arg4 - 1;
			if (arg1 >= arg2 && arg1 <= local5 && arg6 >= arg3 && arg6 <= local11) {
				return true;
			} else if (arg1 == arg2 - 1 && arg6 >= arg3 && arg6 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt698][arg6 - this.anInt699] & 0x8) == 0 && (arg0 & 0x8) == 0) {
				return true;
			} else if (arg1 == local5 + 1 && arg6 >= arg3 && arg6 <= local11 && (this.anIntArrayArray18[arg1 - this.anInt698][arg6 - this.anInt699] & 0x80) == 0 && (arg0 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg3 - 1 && arg1 >= arg2 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt698][arg6 - this.anInt699] & 0x2) == 0 && (arg0 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local11 + 1 && arg1 >= arg2 && arg1 <= local5 && (this.anIntArrayArray18[arg1 - this.anInt698][arg6 - this.anInt699] & 0x20) == 0 && (arg0 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("56925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -245 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
