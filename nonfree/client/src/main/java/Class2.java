import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class2 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private int anInt32 = 90;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	private int anInt33 = -497;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt34 = 0;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt35 = 0;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt37;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt36 = arg2;
		this.anInt37 = arg0;
		this.anIntArrayArray1 = new int[this.anInt36][this.anInt37];
		this.method20();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method20() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt36; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt37; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt36 - 1 || local7 == this.anInt37 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZIIII)V")
	public void method21(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt34;
		@Pc(13) int local13 = arg3 - this.anInt35;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method24(local4, local13, 128);
				this.method24(local4 - 1, local13, 8);
			}
			if (arg4 == 1) {
				this.method24(local4, local13, 2);
				this.method24(local4, local13 + 1, 32);
			}
			if (arg4 == 2) {
				this.method24(local4, local13, 8);
				this.method24(local4 + 1, local13, 128);
			}
			if (arg4 == 3) {
				this.method24(local4, local13, 32);
				this.method24(local4, local13 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method24(local4, local13, 1);
				this.method24(local4 - 1, local13 + 1, 16);
			}
			if (arg4 == 1) {
				this.method24(local4, local13, 4);
				this.method24(local4 + 1, local13 + 1, 64);
			}
			if (arg4 == 2) {
				this.method24(local4, local13, 16);
				this.method24(local4 + 1, local13 - 1, 1);
			}
			if (arg4 == 3) {
				this.method24(local4, local13, 64);
				this.method24(local4 - 1, local13 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method24(local4, local13, 130);
				this.method24(local4 - 1, local13, 8);
				this.method24(local4, local13 + 1, 32);
			}
			if (arg4 == 1) {
				this.method24(local4, local13, 10);
				this.method24(local4, local13 + 1, 32);
				this.method24(local4 + 1, local13, 128);
			}
			if (arg4 == 2) {
				this.method24(local4, local13, 40);
				this.method24(local4 + 1, local13, 128);
				this.method24(local4, local13 - 1, 2);
			}
			if (arg4 == 3) {
				this.method24(local4, local13, 160);
				this.method24(local4, local13 - 1, 2);
				this.method24(local4 - 1, local13, 8);
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method24(local4, local13, 65536);
				this.method24(local4 - 1, local13, 4096);
			}
			if (arg4 == 1) {
				this.method24(local4, local13, 1024);
				this.method24(local4, local13 + 1, 16384);
			}
			if (arg4 == 2) {
				this.method24(local4, local13, 4096);
				this.method24(local4 + 1, local13, 65536);
			}
			if (arg4 == 3) {
				this.method24(local4, local13, 16384);
				this.method24(local4, local13 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method24(local4, local13, 512);
				this.method24(local4 - 1, local13 + 1, 8192);
			}
			if (arg4 == 1) {
				this.method24(local4, local13, 2048);
				this.method24(local4 + 1, local13 + 1, 32768);
			}
			if (arg4 == 2) {
				this.method24(local4, local13, 8192);
				this.method24(local4 + 1, local13 - 1, 512);
			}
			if (arg4 == 3) {
				this.method24(local4, local13, 32768);
				this.method24(local4 - 1, local13 - 1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method24(local4, local13, 66560);
			this.method24(local4 - 1, local13, 4096);
			this.method24(local4, local13 + 1, 16384);
		}
		if (arg4 == 1) {
			this.method24(local4, local13, 5120);
			this.method24(local4, local13 + 1, 16384);
			this.method24(local4 + 1, local13, 65536);
		}
		if (arg4 == 2) {
			this.method24(local4, local13, 20480);
			this.method24(local4 + 1, local13, 65536);
			this.method24(local4, local13 - 1, 1024);
		}
		if (arg4 == 3) {
			this.method24(local4, local13, 81920);
			this.method24(local4, local13 - 1, 1024);
			this.method24(local4 - 1, local13, 4096);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIZII)V")
	public void method22(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = 256;
		if (arg3) {
			local8 = 131328;
		}
		@Pc(19) int local19 = arg1 - this.anInt34;
		@Pc(24) int local24 = arg2 - this.anInt35;
		@Pc(32) int local32;
		if (arg4 == 1 || arg4 == 3) {
			local32 = arg0;
			arg0 = arg5;
			arg5 = local32;
		}
		for (local32 = local19; local32 < local19 + arg0; local32++) {
			if (local32 >= 0 && local32 < this.anInt36) {
				for (@Pc(48) int local48 = local24; local48 < local24 + arg5; local48++) {
					if (local48 >= 0 && local48 < this.anInt37) {
						this.method24(local32, local48, local8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	public void method23(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt34;
		@Pc(9) int local9 = arg0 - this.anInt35;
		this.anIntArrayArray1[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	private void method24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIIIII)V")
	public void method25(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.anInt34;
		@Pc(15) int local15 = arg4 - this.anInt35;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method27(this.aBoolean7, local15, local4, 128);
				this.method27(this.aBoolean7, local15, local4 - 1, 8);
			}
			if (arg1 == 1) {
				this.method27(this.aBoolean7, local15, local4, 2);
				this.method27(this.aBoolean7, local15 + 1, local4, 32);
			}
			if (arg1 == 2) {
				this.method27(this.aBoolean7, local15, local4, 8);
				this.method27(this.aBoolean7, local15, local4 + 1, 128);
			}
			if (arg1 == 3) {
				this.method27(this.aBoolean7, local15, local4, 32);
				this.method27(this.aBoolean7, local15 - 1, local4, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method27(this.aBoolean7, local15, local4, 1);
				this.method27(this.aBoolean7, local15 + 1, local4 - 1, 16);
			}
			if (arg1 == 1) {
				this.method27(this.aBoolean7, local15, local4, 4);
				this.method27(this.aBoolean7, local15 + 1, local4 + 1, 64);
			}
			if (arg1 == 2) {
				this.method27(this.aBoolean7, local15, local4, 16);
				this.method27(this.aBoolean7, local15 - 1, local4 + 1, 1);
			}
			if (arg1 == 3) {
				this.method27(this.aBoolean7, local15, local4, 64);
				this.method27(this.aBoolean7, local15 - 1, local4 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method27(this.aBoolean7, local15, local4, 130);
				this.method27(this.aBoolean7, local15, local4 - 1, 8);
				this.method27(this.aBoolean7, local15 + 1, local4, 32);
			}
			if (arg1 == 1) {
				this.method27(this.aBoolean7, local15, local4, 10);
				this.method27(this.aBoolean7, local15 + 1, local4, 32);
				this.method27(this.aBoolean7, local15, local4 + 1, 128);
			}
			if (arg1 == 2) {
				this.method27(this.aBoolean7, local15, local4, 40);
				this.method27(this.aBoolean7, local15, local4 + 1, 128);
				this.method27(this.aBoolean7, local15 - 1, local4, 2);
			}
			if (arg1 == 3) {
				this.method27(this.aBoolean7, local15, local4, 160);
				this.method27(this.aBoolean7, local15 - 1, local4, 2);
				this.method27(this.aBoolean7, local15, local4 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method27(this.aBoolean7, local15, local4, 65536);
				this.method27(this.aBoolean7, local15, local4 - 1, 4096);
			}
			if (arg1 == 1) {
				this.method27(this.aBoolean7, local15, local4, 1024);
				this.method27(this.aBoolean7, local15 + 1, local4, 16384);
			}
			if (arg1 == 2) {
				this.method27(this.aBoolean7, local15, local4, 4096);
				this.method27(this.aBoolean7, local15, local4 + 1, 65536);
			}
			if (arg1 == 3) {
				this.method27(this.aBoolean7, local15, local4, 16384);
				this.method27(this.aBoolean7, local15 - 1, local4, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method27(this.aBoolean7, local15, local4, 512);
				this.method27(this.aBoolean7, local15 + 1, local4 - 1, 8192);
			}
			if (arg1 == 1) {
				this.method27(this.aBoolean7, local15, local4, 2048);
				this.method27(this.aBoolean7, local15 + 1, local4 + 1, 32768);
			}
			if (arg1 == 2) {
				this.method27(this.aBoolean7, local15, local4, 8192);
				this.method27(this.aBoolean7, local15 - 1, local4 + 1, 512);
			}
			if (arg1 == 3) {
				this.method27(this.aBoolean7, local15, local4, 32768);
				this.method27(this.aBoolean7, local15 - 1, local4 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method27(this.aBoolean7, local15, local4, 66560);
			this.method27(this.aBoolean7, local15, local4 - 1, 4096);
			this.method27(this.aBoolean7, local15 + 1, local4, 16384);
		}
		if (arg1 == 1) {
			this.method27(this.aBoolean7, local15, local4, 5120);
			this.method27(this.aBoolean7, local15 + 1, local4, 16384);
			this.method27(this.aBoolean7, local15, local4 + 1, 65536);
		}
		if (arg1 == 2) {
			this.method27(this.aBoolean7, local15, local4, 20480);
			this.method27(this.aBoolean7, local15, local4 + 1, 65536);
			this.method27(this.aBoolean7, local15 - 1, local4, 1024);
		}
		if (arg1 == 3) {
			this.method27(this.aBoolean7, local15, local4, 81920);
			this.method27(this.aBoolean7, local15 - 1, local4, 1024);
			this.method27(this.aBoolean7, local15, local4 - 1, 4096);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZIIII)V")
	public void method26(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 256;
		if (arg1) {
			local3 = 131328;
		}
		@Pc(17) int local17 = arg0 - this.anInt34;
		@Pc(22) int local22 = arg5 - this.anInt35;
		@Pc(30) int local30;
		if (arg4 == 1 || arg4 == 3) {
			local30 = arg2;
			arg2 = arg3;
			arg3 = local30;
		}
		for (local30 = local17; local30 < local17 + arg2; local30++) {
			if (local30 >= 0 && local30 < this.anInt36) {
				for (@Pc(46) int local46 = local22; local46 < local22 + arg3; local46++) {
					if (local46 >= 0 && local46 < this.anInt37) {
						this.method27(this.aBoolean7, local46, local30, local3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIII)V")
	private void method27(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0) {
			this.anIntArrayArray1[arg2][arg1] &= 16777215 - arg3;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public void method28(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt34;
		@Pc(9) int local9 = arg1 - this.anInt35;
		if (!arg0) {
			for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
			}
		}
		this.anIntArrayArray1[local4][local9] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIIII)Z")
	public boolean method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == arg6 && arg3 == arg4) {
			return true;
		}
		@Pc(12) int local12 = arg0 - this.anInt34;
		@Pc(17) int local17 = arg3 - this.anInt35;
		if (arg2) {
			for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
			}
		}
		@Pc(31) int local31 = arg6 - this.anInt34;
		@Pc(36) int local36 = arg4 - this.anInt35;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (local12 == local31 - 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x280120) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local12 == local31 && local17 == local36 + 1) {
					return true;
				}
				if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280108) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local12 == local31 + 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x280120) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local12 == local31 && local17 == local36 - 1) {
					return true;
				}
				if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280108) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				if (local12 == local31 - 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280180) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280108) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280108) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x280120) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1) {
					return true;
				}
			} else if (arg1 == 3) {
				if (local12 == local31 - 1 && local17 == local36) {
					return true;
				}
				if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x280120) == 0) {
					return true;
				}
				if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x280180) == 0) {
					return true;
				}
				if (local12 == local31 && local17 == local36 - 1) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
				return true;
			}
			if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
				return true;
			}
			if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
				return true;
			}
			if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == arg3 && arg1 == arg0) {
			return true;
		}
		@Pc(21) int local21 = arg4 - this.anInt34;
		@Pc(26) int local26 = arg1 - this.anInt35;
		@Pc(31) int local31 = arg3 - this.anInt34;
		@Pc(36) int local36 = arg0 - this.anInt35;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}
			if (arg5 == 0) {
				if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x80) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray1[local21][local26] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x8) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray1[local21][local26] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x8) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray1[local21][local26] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x80) == 0) {
					return true;
				}
				if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray1[local21][local26] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 8) {
			if (local21 == local31 && local26 == local36 + 1 && (this.anIntArrayArray1[local21][local26] & 0x20) == 0) {
				return true;
			}
			if (local21 == local31 && local26 == local36 - 1 && (this.anIntArrayArray1[local21][local26] & 0x2) == 0) {
				return true;
			}
			if (local21 == local31 - 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x8) == 0) {
				return true;
			}
			if (local21 == local31 + 1 && local26 == local36 && (this.anIntArrayArray1[local21][local26] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 <= 0) {
			throw new NullPointerException();
		}
		@Pc(11) int local11 = arg5 + arg6 - 1;
		@Pc(17) int local17 = arg7 + arg0 - 1;
		if (arg4 >= arg5 && arg4 <= local11 && arg1 >= arg7 && arg1 <= local17) {
			return true;
		} else if (arg4 == arg5 - 1 && arg1 >= arg7 && arg1 <= local17 && (this.anIntArrayArray1[arg4 - this.anInt34][arg1 - this.anInt35] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg4 == local11 + 1 && arg1 >= arg7 && arg1 <= local17 && (this.anIntArrayArray1[arg4 - this.anInt34][arg1 - this.anInt35] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg7 - 1 && arg4 >= arg5 && arg4 <= local11 && (this.anIntArrayArray1[arg4 - this.anInt34][arg1 - this.anInt35] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local17 + 1 && arg4 >= arg5 && arg4 <= local11 && (this.anIntArrayArray1[arg4 - this.anInt34][arg1 - this.anInt35] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}
}
