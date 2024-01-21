import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt692 = -589;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt693 = -27210;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private int anInt694 = -39218;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(BII)V")
	public Class19(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt695 = 0;
			this.anInt696 = 0;
			@Pc(29) boolean local29 = false;
			this.anInt697 = arg2;
			this.anInt698 = arg1;
			this.anIntArrayArray17 = new int[this.anInt697][this.anInt698];
			this.method414();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("27485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method414() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt697; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt698; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt697 - 1 || local7 == this.anInt698 - 1) {
						this.anIntArrayArray17[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray17[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("38311, " + 27237 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIBZ)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(15) int local15 = arg2 - this.anInt695;
			@Pc(20) int local20 = arg3 - this.anInt696;
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method418(local15, local20, 128);
					this.method418(local15 - 1, local20, 8);
				}
				if (arg0 == 1) {
					this.method418(local15, local20, 2);
					this.method418(local15, local20 + 1, 32);
				}
				if (arg0 == 2) {
					this.method418(local15, local20, 8);
					this.method418(local15 + 1, local20, 128);
				}
				if (arg0 == 3) {
					this.method418(local15, local20, 32);
					this.method418(local15, local20 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method418(local15, local20, 1);
					this.method418(local15 - 1, local20 + 1, 16);
				}
				if (arg0 == 1) {
					this.method418(local15, local20, 4);
					this.method418(local15 + 1, local20 + 1, 64);
				}
				if (arg0 == 2) {
					this.method418(local15, local20, 16);
					this.method418(local15 + 1, local20 - 1, 1);
				}
				if (arg0 == 3) {
					this.method418(local15, local20, 64);
					this.method418(local15 - 1, local20 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method418(local15, local20, 130);
					this.method418(local15 - 1, local20, 8);
					this.method418(local15, local20 + 1, 32);
				}
				if (arg0 == 1) {
					this.method418(local15, local20, 10);
					this.method418(local15, local20 + 1, 32);
					this.method418(local15 + 1, local20, 128);
				}
				if (arg0 == 2) {
					this.method418(local15, local20, 40);
					this.method418(local15 + 1, local20, 128);
					this.method418(local15, local20 - 1, 2);
				}
				if (arg0 == 3) {
					this.method418(local15, local20, 160);
					this.method418(local15, local20 - 1, 2);
					this.method418(local15 - 1, local20, 8);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg0 == 0) {
						this.method418(local15, local20, 65536);
						this.method418(local15 - 1, local20, 4096);
					}
					if (arg0 == 1) {
						this.method418(local15, local20, 1024);
						this.method418(local15, local20 + 1, 16384);
					}
					if (arg0 == 2) {
						this.method418(local15, local20, 4096);
						this.method418(local15 + 1, local20, 65536);
					}
					if (arg0 == 3) {
						this.method418(local15, local20, 16384);
						this.method418(local15, local20 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg0 == 0) {
						this.method418(local15, local20, 512);
						this.method418(local15 - 1, local20 + 1, 8192);
					}
					if (arg0 == 1) {
						this.method418(local15, local20, 2048);
						this.method418(local15 + 1, local20 + 1, 32768);
					}
					if (arg0 == 2) {
						this.method418(local15, local20, 8192);
						this.method418(local15 + 1, local20 - 1, 512);
					}
					if (arg0 == 3) {
						this.method418(local15, local20, 32768);
						this.method418(local15 - 1, local20 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg0 == 0) {
						this.method418(local15, local20, 66560);
						this.method418(local15 - 1, local20, 4096);
						this.method418(local15, local20 + 1, 16384);
					}
					if (arg0 == 1) {
						this.method418(local15, local20, 5120);
						this.method418(local15, local20 + 1, 16384);
						this.method418(local15 + 1, local20, 65536);
					}
					if (arg0 == 2) {
						this.method418(local15, local20, 20480);
						this.method418(local15 + 1, local20, 65536);
						this.method418(local15, local20 - 1, 1024);
					}
					if (arg0 == 3) {
						this.method418(local15, local20, 81920);
						this.method418(local15, local20 - 1, 1024);
						this.method418(local15 - 1, local20, 4096);
						return;
					}
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("13940, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -54 + ", " + arg4 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIZ)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		try {
			if (arg1 == -27210) {
				@Pc(7) int local7 = 256;
				if (arg6) {
					local7 = 131328;
				}
				@Pc(18) int local18 = arg0 - this.anInt695;
				@Pc(23) int local23 = arg3 - this.anInt696;
				@Pc(31) int local31;
				if (arg5 == 1 || arg5 == 3) {
					local31 = arg4;
					arg4 = arg2;
					arg2 = local31;
				}
				for (local31 = local18; local31 < local18 + arg4; local31++) {
					if (local31 >= 0 && local31 < this.anInt697) {
						for (@Pc(47) int local47 = local23; local47 < local23 + arg2; local47++) {
							if (local47 >= 0 && local47 < this.anInt698) {
								this.method418(local31, local47, local7);
							}
						}
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("7414, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt695;
			@Pc(19) int local19 = arg1 - this.anInt696;
			this.anIntArrayArray17[local4][local19] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("98945, " + arg0 + ", " + arg1 + ", " + 193 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZB)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(4) int local4 = arg2 - this.anInt695;
			@Pc(12) int local12 = arg1 - this.anInt696;
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method421(this.anInt694, 128, local12, local4);
					this.method421(this.anInt694, 8, local12, local4 - 1);
				}
				if (arg0 == 1) {
					this.method421(this.anInt694, 2, local12, local4);
					this.method421(this.anInt694, 32, local12 + 1, local4);
				}
				if (arg0 == 2) {
					this.method421(this.anInt694, 8, local12, local4);
					this.method421(this.anInt694, 128, local12, local4 + 1);
				}
				if (arg0 == 3) {
					this.method421(this.anInt694, 32, local12, local4);
					this.method421(this.anInt694, 2, local12 - 1, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method421(this.anInt694, 1, local12, local4);
					this.method421(this.anInt694, 16, local12 + 1, local4 - 1);
				}
				if (arg0 == 1) {
					this.method421(this.anInt694, 4, local12, local4);
					this.method421(this.anInt694, 64, local12 + 1, local4 + 1);
				}
				if (arg0 == 2) {
					this.method421(this.anInt694, 16, local12, local4);
					this.method421(this.anInt694, 1, local12 - 1, local4 + 1);
				}
				if (arg0 == 3) {
					this.method421(this.anInt694, 64, local12, local4);
					this.method421(this.anInt694, 4, local12 - 1, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method421(this.anInt694, 130, local12, local4);
					this.method421(this.anInt694, 8, local12, local4 - 1);
					this.method421(this.anInt694, 32, local12 + 1, local4);
				}
				if (arg0 == 1) {
					this.method421(this.anInt694, 10, local12, local4);
					this.method421(this.anInt694, 32, local12 + 1, local4);
					this.method421(this.anInt694, 128, local12, local4 + 1);
				}
				if (arg0 == 2) {
					this.method421(this.anInt694, 40, local12, local4);
					this.method421(this.anInt694, 128, local12, local4 + 1);
					this.method421(this.anInt694, 2, local12 - 1, local4);
				}
				if (arg0 == 3) {
					this.method421(this.anInt694, 160, local12, local4);
					this.method421(this.anInt694, 2, local12 - 1, local4);
					this.method421(this.anInt694, 8, local12, local4 - 1);
				}
			}
			if (arg4) {
				if (arg3 == 0) {
					if (arg0 == 0) {
						this.method421(this.anInt694, 65536, local12, local4);
						this.method421(this.anInt694, 4096, local12, local4 - 1);
					}
					if (arg0 == 1) {
						this.method421(this.anInt694, 1024, local12, local4);
						this.method421(this.anInt694, 16384, local12 + 1, local4);
					}
					if (arg0 == 2) {
						this.method421(this.anInt694, 4096, local12, local4);
						this.method421(this.anInt694, 65536, local12, local4 + 1);
					}
					if (arg0 == 3) {
						this.method421(this.anInt694, 16384, local12, local4);
						this.method421(this.anInt694, 1024, local12 - 1, local4);
					}
				}
				if (arg3 == 1 || arg3 == 3) {
					if (arg0 == 0) {
						this.method421(this.anInt694, 512, local12, local4);
						this.method421(this.anInt694, 8192, local12 + 1, local4 - 1);
					}
					if (arg0 == 1) {
						this.method421(this.anInt694, 2048, local12, local4);
						this.method421(this.anInt694, 32768, local12 + 1, local4 + 1);
					}
					if (arg0 == 2) {
						this.method421(this.anInt694, 8192, local12, local4);
						this.method421(this.anInt694, 512, local12 - 1, local4 + 1);
					}
					if (arg0 == 3) {
						this.method421(this.anInt694, 32768, local12, local4);
						this.method421(this.anInt694, 2048, local12 - 1, local4 - 1);
					}
				}
				if (arg3 == 2) {
					if (arg0 == 0) {
						this.method421(this.anInt694, 66560, local12, local4);
						this.method421(this.anInt694, 4096, local12, local4 - 1);
						this.method421(this.anInt694, 16384, local12 + 1, local4);
					}
					if (arg0 == 1) {
						this.method421(this.anInt694, 5120, local12, local4);
						this.method421(this.anInt694, 16384, local12 + 1, local4);
						this.method421(this.anInt694, 65536, local12, local4 + 1);
					}
					if (arg0 == 2) {
						this.method421(this.anInt694, 20480, local12, local4);
						this.method421(this.anInt694, 65536, local12, local4 + 1);
						this.method421(this.anInt694, 1024, local12 - 1, local4);
					}
					if (arg0 == 3) {
						this.method421(this.anInt694, 81920, local12, local4);
						this.method421(this.anInt694, 1024, local12 - 1, local4);
						this.method421(this.anInt694, 4096, local12, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(576) RuntimeException local576) {
			signlink.reporterror("98435, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local576.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg4 - this.anInt695;
			@Pc(19) int local19 = arg5 - this.anInt696;
			@Pc(32) int local32;
			if (arg0 == 1 || arg0 == 3) {
				local32 = arg2;
				arg2 = arg3;
				arg3 = local32;
			}
			for (local32 = local14; local32 < local14 + arg2; local32++) {
				if (local32 >= 0 && local32 < this.anInt697) {
					for (@Pc(48) int local48 = local19; local48 < local19 + arg3; local48++) {
						if (local48 >= 0 && local48 < this.anInt698) {
							this.method421(this.anInt694, local3, local48, local32);
						}
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("86710, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != -39218) {
				this.anInt692 = -467;
			}
			this.anIntArrayArray17[arg3][arg2] &= 16777215 - arg1;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("10128, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V")
	public void method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg1 - this.anInt695;
			@Pc(18) int local18 = arg0 - this.anInt696;
			this.anIntArrayArray17[local13][local18] &= 0xDFFFFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("63322, " + false + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 == arg3 && arg4 == arg2) {
				return true;
			}
			@Pc(12) int local12 = arg1 - this.anInt695;
			@Pc(24) int local24 = arg4 - this.anInt696;
			@Pc(29) int local29 = arg3 - this.anInt695;
			@Pc(34) int local34 = arg2 - this.anInt696;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray17[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray17[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray17[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray17[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray17[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray17[local12][local24] & 0x280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray17[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local12 == local29 - 1 && local24 == local34) {
						return true;
					}
					if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray17[local12][local24] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local29 && local24 == local34 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local29 && local24 == local34 + 1 && (this.anIntArrayArray17[local12][local24] & 0x20) == 0) {
					return true;
				}
				if (local12 == local29 && local24 == local34 - 1 && (this.anIntArrayArray17[local12][local24] & 0x2) == 0) {
					return true;
				}
				if (local12 == local29 - 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x8) == 0) {
					return true;
				}
				if (local12 == local29 + 1 && local24 == local34 && (this.anIntArrayArray17[local12][local24] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(567) RuntimeException local567) {
			signlink.reporterror("71931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -924 + ", " + arg4 + ", " + arg5 + ", " + local567.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg1 && arg3 == arg2) {
				return true;
			}
			@Pc(14) int local14 = arg4 - this.anInt695;
			@Pc(19) int local19 = arg3 - this.anInt696;
			@Pc(24) int local24 = arg1 - this.anInt695;
			@Pc(40) int local40 = arg2 - this.anInt696;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray17[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray17[local14][local19] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x8) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray17[local14][local19] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x80) == 0) {
						return true;
					}
					if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray17[local14][local19] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local14 == local24 && local19 == local40 + 1 && (this.anIntArrayArray17[local14][local19] & 0x20) == 0) {
					return true;
				}
				if (local14 == local24 && local19 == local40 - 1 && (this.anIntArrayArray17[local14][local19] & 0x2) == 0) {
					return true;
				}
				if (local14 == local24 - 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x8) == 0) {
					return true;
				}
				if (local14 == local24 + 1 && local19 == local40 && (this.anIntArrayArray17[local14][local19] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("54656, " + -117 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg0 - 1;
			@Pc(11) int local11 = arg1 + arg4 - 1;
			if (arg3 >= arg6 && arg3 <= local5 && arg5 >= arg1 && arg5 <= local11) {
				return true;
			} else if (arg3 == arg6 - 1 && arg5 >= arg1 && arg5 <= local11 && (this.anIntArrayArray17[arg3 - this.anInt695][arg5 - this.anInt696] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg3 == local5 + 1 && arg5 >= arg1 && arg5 <= local11 && (this.anIntArrayArray17[arg3 - this.anInt695][arg5 - this.anInt696] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg5 == arg1 - 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray17[arg3 - this.anInt695][arg5 - this.anInt696] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg5 == local11 + 1 && arg3 >= arg6 && arg3 <= local5 && (this.anIntArrayArray17[arg3 - this.anInt695][arg5 - this.anInt696] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("8992, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -237 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}
}
