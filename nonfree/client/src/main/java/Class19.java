import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt705 = 1;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt706 = 5100;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt707 = 8;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt708 = 475;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt709 = 7;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt710 = 591;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt711 = 616;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IZI)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt712 = 0;
			this.anInt713 = 0;
			this.anInt714 = arg2;
			this.anInt715 = arg0;
			this.anIntArrayArray17 = new int[this.anInt714][this.anInt715];
			this.method414(this.anInt707);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("45270, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method414(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt707 || arg0 > this.anInt707) {
				this.anInt706 = 379;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anInt714; local14++) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt715; local18++) {
					if (local14 == 0 || local18 == 0 || local14 == this.anInt714 - 1 || local18 == this.anInt715 - 1) {
						this.anIntArrayArray17[local14][local18] = 16777215;
					} else {
						this.anIntArrayArray17[local14][local18] = 0;
					}
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("43505, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIII)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt712;
			@Pc(9) int local9 = arg0 - this.anInt713;
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method418(local4, local9, 128);
					this.method418(local4 - 1, local9, 8);
				}
				if (arg4 == 1) {
					this.method418(local4, local9, 2);
					this.method418(local4, local9 + 1, 32);
				}
				if (arg4 == 2) {
					this.method418(local4, local9, 8);
					this.method418(local4 + 1, local9, 128);
				}
				if (arg4 == 3) {
					this.method418(local4, local9, 32);
					this.method418(local4, local9 - 1, 2);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method418(local4, local9, 1);
					this.method418(local4 - 1, local9 + 1, 16);
				}
				if (arg4 == 1) {
					this.method418(local4, local9, 4);
					this.method418(local4 + 1, local9 + 1, 64);
				}
				if (arg4 == 2) {
					this.method418(local4, local9, 16);
					this.method418(local4 + 1, local9 - 1, 1);
				}
				if (arg4 == 3) {
					this.method418(local4, local9, 64);
					this.method418(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method418(local4, local9, 130);
					this.method418(local4 - 1, local9, 8);
					this.method418(local4, local9 + 1, 32);
				}
				if (arg4 == 1) {
					this.method418(local4, local9, 10);
					this.method418(local4, local9 + 1, 32);
					this.method418(local4 + 1, local9, 128);
				}
				if (arg4 == 2) {
					this.method418(local4, local9, 40);
					this.method418(local4 + 1, local9, 128);
					this.method418(local4, local9 - 1, 2);
				}
				if (arg4 == 3) {
					this.method418(local4, local9, 160);
					this.method418(local4, local9 - 1, 2);
					this.method418(local4 - 1, local9, 8);
				}
			}
			if (arg1) {
				if (arg2 == 0) {
					if (arg4 == 0) {
						this.method418(local4, local9, 65536);
						this.method418(local4 - 1, local9, 4096);
					}
					if (arg4 == 1) {
						this.method418(local4, local9, 1024);
						this.method418(local4, local9 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method418(local4, local9, 4096);
						this.method418(local4 + 1, local9, 65536);
					}
					if (arg4 == 3) {
						this.method418(local4, local9, 16384);
						this.method418(local4, local9 - 1, 1024);
					}
				}
				if (arg2 == 1 || arg2 == 3) {
					if (arg4 == 0) {
						this.method418(local4, local9, 512);
						this.method418(local4 - 1, local9 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method418(local4, local9, 2048);
						this.method418(local4 + 1, local9 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method418(local4, local9, 8192);
						this.method418(local4 + 1, local9 - 1, 512);
					}
					if (arg4 == 3) {
						this.method418(local4, local9, 32768);
						this.method418(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg2 == 2) {
					if (arg4 == 0) {
						this.method418(local4, local9, 66560);
						this.method418(local4 - 1, local9, 4096);
						this.method418(local4, local9 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method418(local4, local9, 5120);
						this.method418(local4, local9 + 1, 16384);
						this.method418(local4 + 1, local9, 65536);
					}
					if (arg4 == 2) {
						this.method418(local4, local9, 20480);
						this.method418(local4 + 1, local9, 65536);
						this.method418(local4, local9 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method418(local4, local9, 81920);
						this.method418(local4, local9 - 1, 1024);
						this.method418(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("26276, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 709 + ", " + arg4 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZI)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(24) int local24 = arg5 - this.anInt712;
			@Pc(29) int local29 = arg1 - this.anInt713;
			@Pc(37) int local37;
			if (arg0 == 1 || arg0 == 3) {
				local37 = arg3;
				arg3 = arg2;
				arg2 = local37;
			}
			for (local37 = local24; local37 < local24 + arg3; local37++) {
				if (local37 >= 0 && local37 < this.anInt714) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg2; local53++) {
						if (local53 >= 0 && local53 < this.anInt715) {
							this.method418(local37, local53, local3);
						}
					}
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("40402, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = arg1 - this.anInt712;
			@Pc(14) int local14 = arg0 - this.anInt713;
			this.anIntArrayArray17[local9][local14] |= 0x200000;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("70390, " + arg0 + ", " + arg1 + ", " + 475 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIIZI)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt712;
			@Pc(9) int local9 = arg1 - this.anInt713;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method421(local9, this.anInt711, 128, local4);
					this.method421(local9, this.anInt711, 8, local4 - 1);
				}
				if (arg2 == 1) {
					this.method421(local9, this.anInt711, 2, local4);
					this.method421(local9 + 1, this.anInt711, 32, local4);
				}
				if (arg2 == 2) {
					this.method421(local9, this.anInt711, 8, local4);
					this.method421(local9, this.anInt711, 128, local4 + 1);
				}
				if (arg2 == 3) {
					this.method421(local9, this.anInt711, 32, local4);
					this.method421(local9 - 1, this.anInt711, 2, local4);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method421(local9, this.anInt711, 1, local4);
					this.method421(local9 + 1, this.anInt711, 16, local4 - 1);
				}
				if (arg2 == 1) {
					this.method421(local9, this.anInt711, 4, local4);
					this.method421(local9 + 1, this.anInt711, 64, local4 + 1);
				}
				if (arg2 == 2) {
					this.method421(local9, this.anInt711, 16, local4);
					this.method421(local9 - 1, this.anInt711, 1, local4 + 1);
				}
				if (arg2 == 3) {
					this.method421(local9, this.anInt711, 64, local4);
					this.method421(local9 - 1, this.anInt711, 4, local4 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method421(local9, this.anInt711, 130, local4);
					this.method421(local9, this.anInt711, 8, local4 - 1);
					this.method421(local9 + 1, this.anInt711, 32, local4);
				}
				if (arg2 == 1) {
					this.method421(local9, this.anInt711, 10, local4);
					this.method421(local9 + 1, this.anInt711, 32, local4);
					this.method421(local9, this.anInt711, 128, local4 + 1);
				}
				if (arg2 == 2) {
					this.method421(local9, this.anInt711, 40, local4);
					this.method421(local9, this.anInt711, 128, local4 + 1);
					this.method421(local9 - 1, this.anInt711, 2, local4);
				}
				if (arg2 == 3) {
					this.method421(local9, this.anInt711, 160, local4);
					this.method421(local9 - 1, this.anInt711, 2, local4);
					this.method421(local9, this.anInt711, 8, local4 - 1);
				}
			}
			if (arg3) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method421(local9, this.anInt711, 65536, local4);
						this.method421(local9, this.anInt711, 4096, local4 - 1);
					}
					if (arg2 == 1) {
						this.method421(local9, this.anInt711, 1024, local4);
						this.method421(local9 + 1, this.anInt711, 16384, local4);
					}
					if (arg2 == 2) {
						this.method421(local9, this.anInt711, 4096, local4);
						this.method421(local9, this.anInt711, 65536, local4 + 1);
					}
					if (arg2 == 3) {
						this.method421(local9, this.anInt711, 16384, local4);
						this.method421(local9 - 1, this.anInt711, 1024, local4);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method421(local9, this.anInt711, 512, local4);
						this.method421(local9 + 1, this.anInt711, 8192, local4 - 1);
					}
					if (arg2 == 1) {
						this.method421(local9, this.anInt711, 2048, local4);
						this.method421(local9 + 1, this.anInt711, 32768, local4 + 1);
					}
					if (arg2 == 2) {
						this.method421(local9, this.anInt711, 8192, local4);
						this.method421(local9 - 1, this.anInt711, 512, local4 + 1);
					}
					if (arg2 == 3) {
						this.method421(local9, this.anInt711, 32768, local4);
						this.method421(local9 - 1, this.anInt711, 2048, local4 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method421(local9, this.anInt711, 66560, local4);
						this.method421(local9, this.anInt711, 4096, local4 - 1);
						this.method421(local9 + 1, this.anInt711, 16384, local4);
					}
					if (arg2 == 1) {
						this.method421(local9, this.anInt711, 5120, local4);
						this.method421(local9 + 1, this.anInt711, 16384, local4);
						this.method421(local9, this.anInt711, 65536, local4 + 1);
					}
					if (arg2 == 2) {
						this.method421(local9, this.anInt711, 20480, local4);
						this.method421(local9, this.anInt711, 65536, local4 + 1);
						this.method421(local9 - 1, this.anInt711, 1024, local4);
					}
					if (arg2 == 3) {
						this.method421(local9, this.anInt711, 81920, local4);
						this.method421(local9 - 1, this.anInt711, 1024, local4);
						this.method421(local9, this.anInt711, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(584) RuntimeException local584) {
			signlink.reporterror("21549, " + arg0 + ", " + 119 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local584.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 256;
			if (arg1) {
				local7 = 131328;
			}
			@Pc(18) int local18 = arg2 - this.anInt712;
			@Pc(23) int local23 = arg4 - this.anInt713;
			@Pc(31) int local31;
			if (arg5 == 1 || arg5 == 3) {
				local31 = arg0;
				arg0 = arg6;
				arg6 = local31;
			}
			for (local31 = local18; local31 < local18 + arg0; local31++) {
				if (local31 >= 0 && local31 < this.anInt714) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg6; local47++) {
						if (local47 >= 0 && local47 < this.anInt715) {
							this.method421(local47, this.anInt711, local7, local31);
						}
					}
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("62671, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 10 / arg1;
			this.anIntArrayArray17[arg3][arg0] &= 16777215 - arg2;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("24301, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != -51) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			@Pc(14) int local14 = arg1 - this.anInt712;
			@Pc(19) int local19 = arg0 - this.anInt713;
			this.anIntArrayArray17[local14][local19] &= 0xDFFFFF;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("24906, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg1 && arg3 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt712;
			@Pc(23) int local23 = arg3 - this.anInt713;
			@Pc(28) int local28 = arg1 - this.anInt712;
			@Pc(33) int local33 = arg2 - this.anInt713;
			if (arg0 == 0) {
				if (arg4 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("67844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 == arg0 && arg3 == arg6) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt712;
			@Pc(17) int local17 = arg3 - this.anInt713;
			@Pc(22) int local22 = arg0 - this.anInt712;
			@Pc(27) int local27 = arg6 - this.anInt713;
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray17[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray17[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray17[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("56064, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg1 + arg2 - 1;
			@Pc(17) int local17 = arg3 + arg0 - 1;
			if (arg6 >= arg1 && arg6 <= local11 && arg4 >= arg3 && arg4 <= local17) {
				return true;
			} else if (arg6 == arg1 - 1 && arg4 >= arg3 && arg4 <= local17 && (this.anIntArrayArray17[arg6 - this.anInt712][arg4 - this.anInt713] & 0x8) == 0 && (arg5 & 0x8) == 0) {
				return true;
			} else if (arg6 == local11 + 1 && arg4 >= arg3 && arg4 <= local17 && (this.anIntArrayArray17[arg6 - this.anInt712][arg4 - this.anInt713] & 0x80) == 0 && (arg5 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg3 - 1 && arg6 >= arg1 && arg6 <= local11 && (this.anIntArrayArray17[arg6 - this.anInt712][arg4 - this.anInt713] & 0x2) == 0 && (arg5 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local17 + 1 && arg6 >= arg1 && arg6 <= local11 && (this.anIntArrayArray17[arg6 - this.anInt712][arg4 - this.anInt713] & 0x20) == 0 && (arg5 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("96105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
