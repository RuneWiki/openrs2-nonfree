import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt692 = -32176;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt693 = 256;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt694 = 0;
			this.anInt695 = 0;
			this.anInt696 = arg2;
			this.anInt697 = arg1;
			this.anIntArrayArray17 = new int[this.anInt696][this.anInt697];
			this.method414();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("38327, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method414() {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt696; local6++) {
				for (@Pc(10) int local10 = 0; local10 < this.anInt697; local10++) {
					if (local6 == 0 || local10 == 0 || local6 == this.anInt696 - 1 || local10 == this.anInt697 - 1) {
						this.anIntArrayArray17[local6][local10] = 16777215;
					} else {
						this.anIntArrayArray17[local6][local10] = 0;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("47442, " + true + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) int local11 = arg0 - this.anInt694;
			@Pc(16) int local16 = arg1 - this.anInt695;
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method418(local11, local16, 128);
					this.method418(local11 - 1, local16, 8);
				}
				if (arg2 == 1) {
					this.method418(local11, local16, 2);
					this.method418(local11, local16 + 1, 32);
				}
				if (arg2 == 2) {
					this.method418(local11, local16, 8);
					this.method418(local11 + 1, local16, 128);
				}
				if (arg2 == 3) {
					this.method418(local11, local16, 32);
					this.method418(local11, local16 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method418(local11, local16, 1);
					this.method418(local11 - 1, local16 + 1, 16);
				}
				if (arg2 == 1) {
					this.method418(local11, local16, 4);
					this.method418(local11 + 1, local16 + 1, 64);
				}
				if (arg2 == 2) {
					this.method418(local11, local16, 16);
					this.method418(local11 + 1, local16 - 1, 1);
				}
				if (arg2 == 3) {
					this.method418(local11, local16, 64);
					this.method418(local11 - 1, local16 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method418(local11, local16, 130);
					this.method418(local11 - 1, local16, 8);
					this.method418(local11, local16 + 1, 32);
				}
				if (arg2 == 1) {
					this.method418(local11, local16, 10);
					this.method418(local11, local16 + 1, 32);
					this.method418(local11 + 1, local16, 128);
				}
				if (arg2 == 2) {
					this.method418(local11, local16, 40);
					this.method418(local11 + 1, local16, 128);
					this.method418(local11, local16 - 1, 2);
				}
				if (arg2 == 3) {
					this.method418(local11, local16, 160);
					this.method418(local11, local16 - 1, 2);
					this.method418(local11 - 1, local16, 8);
				}
			}
			if (arg3) {
				if (arg4 == 0) {
					if (arg2 == 0) {
						this.method418(local11, local16, 65536);
						this.method418(local11 - 1, local16, 4096);
					}
					if (arg2 == 1) {
						this.method418(local11, local16, 1024);
						this.method418(local11, local16 + 1, 16384);
					}
					if (arg2 == 2) {
						this.method418(local11, local16, 4096);
						this.method418(local11 + 1, local16, 65536);
					}
					if (arg2 == 3) {
						this.method418(local11, local16, 16384);
						this.method418(local11, local16 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg2 == 0) {
						this.method418(local11, local16, 512);
						this.method418(local11 - 1, local16 + 1, 8192);
					}
					if (arg2 == 1) {
						this.method418(local11, local16, 2048);
						this.method418(local11 + 1, local16 + 1, 32768);
					}
					if (arg2 == 2) {
						this.method418(local11, local16, 8192);
						this.method418(local11 + 1, local16 - 1, 512);
					}
					if (arg2 == 3) {
						this.method418(local11, local16, 32768);
						this.method418(local11 - 1, local16 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg2 == 0) {
						this.method418(local11, local16, 66560);
						this.method418(local11 - 1, local16, 4096);
						this.method418(local11, local16 + 1, 16384);
					}
					if (arg2 == 1) {
						this.method418(local11, local16, 5120);
						this.method418(local11, local16 + 1, 16384);
						this.method418(local11 + 1, local16, 65536);
					}
					if (arg2 == 2) {
						this.method418(local11, local16, 20480);
						this.method418(local11 + 1, local16, 65536);
						this.method418(local11, local16 - 1, 1024);
					}
					if (arg2 == 3) {
						this.method418(local11, local16, 81920);
						this.method418(local11, local16 - 1, 1024);
						this.method418(local11 - 1, local16, 4096);
						return;
					}
				}
			}
		} catch (@Pc(468) RuntimeException local468) {
			signlink.reporterror("48949, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIIIII)V")
	public void method416(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt694;
			@Pc(23) int local23 = arg1 - this.anInt695;
			@Pc(31) int local31;
			if (arg2 == 1 || arg2 == 3) {
				local31 = arg3;
				arg3 = arg4;
				arg4 = local31;
			}
			for (local31 = local14; local31 < local14 + arg3; local31++) {
				if (local31 >= 0 && local31 < this.anInt696) {
					for (@Pc(47) int local47 = local23; local47 < local23 + arg4; local47++) {
						if (local47 >= 0 && local47 < this.anInt697) {
							this.method418(local31, local47, local3);
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("28834, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt694;
			@Pc(23) int local23 = arg0 - this.anInt695;
			this.anIntArrayArray17[local4][local23] |= 0x200000;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("79416, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIIIZ)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt694;
			@Pc(9) int local9 = arg4 - this.anInt695;
			if (arg1 == 4) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method421(local9, 128, local4);
						this.method421(local9, 8, local4 - 1);
					}
					if (arg3 == 1) {
						this.method421(local9, 2, local4);
						this.method421(local9 + 1, 32, local4);
					}
					if (arg3 == 2) {
						this.method421(local9, 8, local4);
						this.method421(local9, 128, local4 + 1);
					}
					if (arg3 == 3) {
						this.method421(local9, 32, local4);
						this.method421(local9 - 1, 2, local4);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method421(local9, 1, local4);
						this.method421(local9 + 1, 16, local4 - 1);
					}
					if (arg3 == 1) {
						this.method421(local9, 4, local4);
						this.method421(local9 + 1, 64, local4 + 1);
					}
					if (arg3 == 2) {
						this.method421(local9, 16, local4);
						this.method421(local9 - 1, 1, local4 + 1);
					}
					if (arg3 == 3) {
						this.method421(local9, 64, local4);
						this.method421(local9 - 1, 4, local4 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method421(local9, 130, local4);
						this.method421(local9, 8, local4 - 1);
						this.method421(local9 + 1, 32, local4);
					}
					if (arg3 == 1) {
						this.method421(local9, 10, local4);
						this.method421(local9 + 1, 32, local4);
						this.method421(local9, 128, local4 + 1);
					}
					if (arg3 == 2) {
						this.method421(local9, 40, local4);
						this.method421(local9, 128, local4 + 1);
						this.method421(local9 - 1, 2, local4);
					}
					if (arg3 == 3) {
						this.method421(local9, 160, local4);
						this.method421(local9 - 1, 2, local4);
						this.method421(local9, 8, local4 - 1);
					}
				}
				if (arg5) {
					if (arg0 == 0) {
						if (arg3 == 0) {
							this.method421(local9, 65536, local4);
							this.method421(local9, 4096, local4 - 1);
						}
						if (arg3 == 1) {
							this.method421(local9, 1024, local4);
							this.method421(local9 + 1, 16384, local4);
						}
						if (arg3 == 2) {
							this.method421(local9, 4096, local4);
							this.method421(local9, 65536, local4 + 1);
						}
						if (arg3 == 3) {
							this.method421(local9, 16384, local4);
							this.method421(local9 - 1, 1024, local4);
						}
					}
					if (arg0 == 1 || arg0 == 3) {
						if (arg3 == 0) {
							this.method421(local9, 512, local4);
							this.method421(local9 + 1, 8192, local4 - 1);
						}
						if (arg3 == 1) {
							this.method421(local9, 2048, local4);
							this.method421(local9 + 1, 32768, local4 + 1);
						}
						if (arg3 == 2) {
							this.method421(local9, 8192, local4);
							this.method421(local9 - 1, 512, local4 + 1);
						}
						if (arg3 == 3) {
							this.method421(local9, 32768, local4);
							this.method421(local9 - 1, 2048, local4 - 1);
						}
					}
					if (arg0 == 2) {
						if (arg3 == 0) {
							this.method421(local9, 66560, local4);
							this.method421(local9, 4096, local4 - 1);
							this.method421(local9 + 1, 16384, local4);
						}
						if (arg3 == 1) {
							this.method421(local9, 5120, local4);
							this.method421(local9 + 1, 16384, local4);
							this.method421(local9, 65536, local4 + 1);
						}
						if (arg3 == 2) {
							this.method421(local9, 20480, local4);
							this.method421(local9, 65536, local4 + 1);
							this.method421(local9 - 1, 1024, local4);
						}
						if (arg3 == 3) {
							this.method421(local9, 81920, local4);
							this.method421(local9 - 1, 1024, local4);
							this.method421(local9, 4096, local4 - 1);
							return;
						}
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("78941, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIIBIII)V")
	public void method420(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg0) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg5 - this.anInt694;
			@Pc(19) int local19 = arg2 - this.anInt695;
			@Pc(38) int local38;
			if (arg4 == 1 || arg4 == 3) {
				local38 = arg1;
				arg1 = arg3;
				arg3 = local38;
			}
			for (local38 = local14; local38 < local14 + arg1; local38++) {
				if (local38 >= 0 && local38 < this.anInt696) {
					for (@Pc(54) int local54 = local19; local54 < local19 + arg3; local54++) {
						if (local54 >= 0 && local54 < this.anInt697) {
							this.method421(local54, local3, local38);
						}
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("56212, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 124 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray17[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("60943, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V")
	public void method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt694;
			@Pc(9) int local9 = arg0 - this.anInt695;
			this.anIntArrayArray17[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("96052, " + false + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 == arg1 && arg2 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg5 - this.anInt694;
			@Pc(27) int local27 = arg2 - this.anInt695;
			@Pc(32) int local32 = arg1 - this.anInt694;
			@Pc(37) int local37 = arg3 - this.anInt695;
			if (arg4 == 0) {
				if (arg0 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local12][local27] & 0x280102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local32 - 1 && local27 == local37) {
						return true;
					}
					if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local12][local27] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local32 && local27 == local37 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local12 == local32 && local27 == local37 + 1 && (this.anIntArrayArray17[local12][local27] & 0x20) == 0) {
					return true;
				}
				if (local12 == local32 && local27 == local37 - 1 && (this.anIntArrayArray17[local12][local27] & 0x2) == 0) {
					return true;
				}
				if (local12 == local32 - 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x8) == 0) {
					return true;
				}
				if (local12 == local32 + 1 && local27 == local37 && (this.anIntArrayArray17[local12][local27] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(570) RuntimeException local570) {
			signlink.reporterror("89767, " + 343 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local570.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ZIIIIII)Z")
	public boolean method424(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			} else if (arg5 == arg1 && arg2 == arg6) {
				return true;
			} else {
				@Pc(18) int local18 = arg5 - this.anInt694;
				@Pc(23) int local23 = arg2 - this.anInt695;
				@Pc(28) int local28 = arg1 - this.anInt694;
				@Pc(33) int local33 = arg6 - this.anInt695;
				if (arg3 == 6 || arg3 == 7) {
					if (arg3 == 7) {
						arg4 = arg4 + 2 & 0x3;
					}
					if (arg4 == 0) {
						if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x80) == 0) {
							return true;
						}
						if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local18][local23] & 0x2) == 0) {
							return true;
						}
					} else if (arg4 == 1) {
						if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x8) == 0) {
							return true;
						}
						if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local18][local23] & 0x2) == 0) {
							return true;
						}
					} else if (arg4 == 2) {
						if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x8) == 0) {
							return true;
						}
						if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local18][local23] & 0x20) == 0) {
							return true;
						}
					} else if (arg4 == 3) {
						if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x80) == 0) {
							return true;
						}
						if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local18][local23] & 0x20) == 0) {
							return true;
						}
					}
				}
				if (arg3 == 8) {
					if (local18 == local28 && local23 == local33 + 1 && (this.anIntArrayArray17[local18][local23] & 0x20) == 0) {
						return true;
					}
					if (local18 == local28 && local23 == local33 - 1 && (this.anIntArrayArray17[local18][local23] & 0x2) == 0) {
						return true;
					}
					if (local18 == local28 - 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x8) == 0) {
						return true;
					}
					if (local18 == local28 + 1 && local23 == local33 && (this.anIntArrayArray17[local18][local23] & 0x80) == 0) {
						return true;
					}
				}
				return false;
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("9009, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg3 + arg0 - 1;
			@Pc(16) int local16 = arg6 + arg5 - 1;
			if (arg1 >= arg3 && arg1 <= local10 && arg4 >= arg6 && arg4 <= local16) {
				return true;
			} else if (arg1 == arg3 - 1 && arg4 >= arg6 && arg4 <= local16 && (this.anIntArrayArray17[arg1 - this.anInt694][arg4 - this.anInt695] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg1 == local10 + 1 && arg4 >= arg6 && arg4 <= local16 && (this.anIntArrayArray17[arg1 - this.anInt694][arg4 - this.anInt695] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg4 == arg6 - 1 && arg1 >= arg3 && arg1 <= local10 && (this.anIntArrayArray17[arg1 - this.anInt694][arg4 - this.anInt695] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg4 == local16 + 1 && arg1 >= arg3 && arg1 <= local10 && (this.anIntArrayArray17[arg1 - this.anInt694][arg4 - this.anInt695] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("95587, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 530 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
