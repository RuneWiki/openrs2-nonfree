import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HUQCCBIO")
public final class Class13 {

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!HUQCCBIO", name = "b", descriptor = "I")
	private int anInt315 = 5;

	@OriginalMember(owner = "client!HUQCCBIO", name = "c", descriptor = "I")
	private int anInt316 = 910;

	@OriginalMember(owner = "client!HUQCCBIO", name = "d", descriptor = "I")
	private int anInt317 = 2;

	@OriginalMember(owner = "client!HUQCCBIO", name = "e", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!HUQCCBIO", name = "f", descriptor = "I")
	private int anInt318 = 8;

	@OriginalMember(owner = "client!HUQCCBIO", name = "g", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!HUQCCBIO", name = "h", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!HUQCCBIO", name = "i", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!HUQCCBIO", name = "j", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!HUQCCBIO", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!HUQCCBIO", name = "<init>", descriptor = "(IZI)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg1) {
				this.aBoolean70 = !this.aBoolean70;
			}
			this.anInt319 = 0;
			this.anInt320 = 0;
			this.anInt321 = arg0;
			this.anInt322 = arg2;
			this.anIntArrayArray9 = new int[this.anInt321][this.anInt322];
			this.method205();
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("67136, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(B)V")
	public void method205() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt321; local3++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt322; local7++) {
					if (local3 == 0 || local7 == 0 || local3 == this.anInt321 - 1 || local7 == this.anInt322 - 1) {
						this.anIntArrayArray9[local3][local7] = 16777215;
					} else {
						this.anIntArrayArray9[local3][local7] = 0;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("96161, " + 71 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIIZII)V")
	public void method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt319;
			@Pc(19) int local19 = arg0 - this.anInt320;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method209(local4, local19, 128);
					this.method209(local4 - 1, local19, 8);
				}
				if (arg3 == 1) {
					this.method209(local4, local19, 2);
					this.method209(local4, local19 + 1, 32);
				}
				if (arg3 == 2) {
					this.method209(local4, local19, 8);
					this.method209(local4 + 1, local19, 128);
				}
				if (arg3 == 3) {
					this.method209(local4, local19, 32);
					this.method209(local4, local19 - 1, 2);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method209(local4, local19, 1);
					this.method209(local4 - 1, local19 + 1, 16);
				}
				if (arg3 == 1) {
					this.method209(local4, local19, 4);
					this.method209(local4 + 1, local19 + 1, 64);
				}
				if (arg3 == 2) {
					this.method209(local4, local19, 16);
					this.method209(local4 + 1, local19 - 1, 1);
				}
				if (arg3 == 3) {
					this.method209(local4, local19, 64);
					this.method209(local4 - 1, local19 - 1, 4);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method209(local4, local19, 130);
					this.method209(local4 - 1, local19, 8);
					this.method209(local4, local19 + 1, 32);
				}
				if (arg3 == 1) {
					this.method209(local4, local19, 10);
					this.method209(local4, local19 + 1, 32);
					this.method209(local4 + 1, local19, 128);
				}
				if (arg3 == 2) {
					this.method209(local4, local19, 40);
					this.method209(local4 + 1, local19, 128);
					this.method209(local4, local19 - 1, 2);
				}
				if (arg3 == 3) {
					this.method209(local4, local19, 160);
					this.method209(local4, local19 - 1, 2);
					this.method209(local4 - 1, local19, 8);
				}
			}
			if (arg2) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method209(local4, local19, 65536);
						this.method209(local4 - 1, local19, 4096);
					}
					if (arg3 == 1) {
						this.method209(local4, local19, 1024);
						this.method209(local4, local19 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method209(local4, local19, 4096);
						this.method209(local4 + 1, local19, 65536);
					}
					if (arg3 == 3) {
						this.method209(local4, local19, 16384);
						this.method209(local4, local19 - 1, 1024);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method209(local4, local19, 512);
						this.method209(local4 - 1, local19 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method209(local4, local19, 2048);
						this.method209(local4 + 1, local19 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method209(local4, local19, 8192);
						this.method209(local4 + 1, local19 - 1, 512);
					}
					if (arg3 == 3) {
						this.method209(local4, local19, 32768);
						this.method209(local4 - 1, local19 - 1, 2048);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method209(local4, local19, 66560);
						this.method209(local4 - 1, local19, 4096);
						this.method209(local4, local19 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method209(local4, local19, 5120);
						this.method209(local4, local19 + 1, 16384);
						this.method209(local4 + 1, local19, 65536);
					}
					if (arg3 == 2) {
						this.method209(local4, local19, 20480);
						this.method209(local4 + 1, local19, 65536);
						this.method209(local4, local19 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method209(local4, local19, 81920);
						this.method209(local4, local19 - 1, 1024);
						this.method209(local4 - 1, local19, 4096);
						return;
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("26026, " + arg0 + ", " + arg1 + ", " + 4215 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(ZIIIZII)V")
	public void method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg3) {
				local3 = 131328;
			}
			@Pc(23) int local23 = arg5 - this.anInt319;
			@Pc(28) int local28 = arg0 - this.anInt320;
			@Pc(36) int local36;
			if (arg4 == 1 || arg4 == 3) {
				local36 = arg1;
				arg1 = arg2;
				arg2 = local36;
			}
			for (local36 = local23; local36 < local23 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt321) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg2; local52++) {
						if (local52 >= 0 && local52 < this.anInt322) {
							this.method209(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("99428, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IBI)V")
	public void method208(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(14) int local14 = arg0 - this.anInt319;
			@Pc(19) int local19 = arg2 - this.anInt320;
			this.anIntArrayArray9[local14][local19] |= 0x200000;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(III)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray9[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IZIIII)V")
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(14) int local14 = arg0 - this.anInt319;
			@Pc(19) int local19 = arg2 - this.anInt320;
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method212(128, local19, 910, local14);
					this.method212(8, local19, 910, local14 - 1);
				}
				if (arg3 == 1) {
					this.method212(2, local19, 910, local14);
					this.method212(32, local19 + 1, 910, local14);
				}
				if (arg3 == 2) {
					this.method212(8, local19, 910, local14);
					this.method212(128, local19, 910, local14 + 1);
				}
				if (arg3 == 3) {
					this.method212(32, local19, 910, local14);
					this.method212(2, local19 - 1, 910, local14);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method212(1, local19, 910, local14);
					this.method212(16, local19 + 1, 910, local14 - 1);
				}
				if (arg3 == 1) {
					this.method212(4, local19, 910, local14);
					this.method212(64, local19 + 1, 910, local14 + 1);
				}
				if (arg3 == 2) {
					this.method212(16, local19, 910, local14);
					this.method212(1, local19 - 1, 910, local14 + 1);
				}
				if (arg3 == 3) {
					this.method212(64, local19, 910, local14);
					this.method212(4, local19 - 1, 910, local14 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method212(130, local19, 910, local14);
					this.method212(8, local19, 910, local14 - 1);
					this.method212(32, local19 + 1, 910, local14);
				}
				if (arg3 == 1) {
					this.method212(10, local19, 910, local14);
					this.method212(32, local19 + 1, 910, local14);
					this.method212(128, local19, 910, local14 + 1);
				}
				if (arg3 == 2) {
					this.method212(40, local19, 910, local14);
					this.method212(128, local19, 910, local14 + 1);
					this.method212(2, local19 - 1, 910, local14);
				}
				if (arg3 == 3) {
					this.method212(160, local19, 910, local14);
					this.method212(2, local19 - 1, 910, local14);
					this.method212(8, local19, 910, local14 - 1);
				}
			}
			if (arg1) {
				if (arg4 == 0) {
					if (arg3 == 0) {
						this.method212(65536, local19, 910, local14);
						this.method212(4096, local19, 910, local14 - 1);
					}
					if (arg3 == 1) {
						this.method212(1024, local19, 910, local14);
						this.method212(16384, local19 + 1, 910, local14);
					}
					if (arg3 == 2) {
						this.method212(4096, local19, 910, local14);
						this.method212(65536, local19, 910, local14 + 1);
					}
					if (arg3 == 3) {
						this.method212(16384, local19, 910, local14);
						this.method212(1024, local19 - 1, 910, local14);
					}
				}
				if (arg4 == 1 || arg4 == 3) {
					if (arg3 == 0) {
						this.method212(512, local19, 910, local14);
						this.method212(8192, local19 + 1, 910, local14 - 1);
					}
					if (arg3 == 1) {
						this.method212(2048, local19, 910, local14);
						this.method212(32768, local19 + 1, 910, local14 + 1);
					}
					if (arg3 == 2) {
						this.method212(8192, local19, 910, local14);
						this.method212(512, local19 - 1, 910, local14 + 1);
					}
					if (arg3 == 3) {
						this.method212(32768, local19, 910, local14);
						this.method212(2048, local19 - 1, 910, local14 - 1);
					}
				}
				if (arg4 == 2) {
					if (arg3 == 0) {
						this.method212(66560, local19, 910, local14);
						this.method212(4096, local19, 910, local14 - 1);
						this.method212(16384, local19 + 1, 910, local14);
					}
					if (arg3 == 1) {
						this.method212(5120, local19, 910, local14);
						this.method212(16384, local19 + 1, 910, local14);
						this.method212(65536, local19, 910, local14 + 1);
					}
					if (arg3 == 2) {
						this.method212(20480, local19, 910, local14);
						this.method212(65536, local19, 910, local14 + 1);
						this.method212(1024, local19 - 1, 910, local14);
					}
					if (arg3 == 3) {
						this.method212(81920, local19, 910, local14);
						this.method212(1024, local19 - 1, 910, local14);
						this.method212(4096, local19, 910, local14 - 1);
						return;
					}
				}
			}
		} catch (@Pc(527) RuntimeException local527) {
			signlink.reporterror("36300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -30817 + ", " + local527.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIIIIIZ)V")
	public void method211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg5) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt319;
			@Pc(19) int local19 = arg3 - this.anInt320;
			@Pc(27) int local27;
			if (arg4 == 1 || arg4 == 3) {
				local27 = arg2;
				arg2 = arg1;
				arg1 = local27;
			}
			@Pc(43) int local43;
			for (local27 = local14; local27 < local14 + arg2; local27++) {
				if (local27 >= 0 && local27 < this.anInt321) {
					for (local43 = local19; local43 < local19 + arg1; local43++) {
						if (local43 >= 0 && local43 < this.anInt322) {
							this.method212(local3, local43, 910, local27);
						}
					}
				}
			}
			if (this.anInt315 != 5) {
				for (local43 = 1; local43 > 0; local43++) {
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("95869, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIII)V")
	private void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anIntArrayArray9[arg3][arg1] &= 16777215 - arg0;
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("66865, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IZI)V")
	public void method213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt319;
			@Pc(9) int local9 = arg1 - this.anInt320;
			this.anIntArrayArray9[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("17137, " + arg0 + ", " + true + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIIIIIB)Z")
	public boolean method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			if (arg2 == arg3 && arg4 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt319;
			if (arg6 != 7) {
				this.anInt318 = -494;
			}
			@Pc(23) int local23 = arg4 - this.anInt320;
			@Pc(28) int local28 = arg3 - this.anInt319;
			@Pc(33) int local33 = arg5 - this.anInt320;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray9[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray9[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray9[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray9[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray9[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray9[local12][local23] & 0x280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280108) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray9[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local28 - 1 && local23 == local33) {
						return true;
					}
					if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray9[local12][local23] & 0x280120) == 0) {
						return true;
					}
					if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x280180) == 0) {
						return true;
					}
					if (local12 == local28 && local23 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local28 && local23 == local33 + 1 && (this.anIntArrayArray9[local12][local23] & 0x20) == 0) {
					return true;
				}
				if (local12 == local28 && local23 == local33 - 1 && (this.anIntArrayArray9[local12][local23] & 0x2) == 0) {
					return true;
				}
				if (local12 == local28 - 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x8) == 0) {
					return true;
				}
				if (local12 == local28 + 1 && local23 == local33 && (this.anIntArrayArray9[local12][local23] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("6774, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIIZIII)Z")
	public boolean method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 == arg4 && arg2 == arg5) {
				return true;
			}
			@Pc(12) int local12 = arg6 - this.anInt319;
			@Pc(17) int local17 = arg2 - this.anInt320;
			@Pc(22) int local22 = arg4 - this.anInt319;
			if (arg3) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			@Pc(36) int local36 = arg5 - this.anInt320;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray9[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray9[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray9[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray9[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local22 && local17 == local36 + 1 && (this.anIntArrayArray9[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local36 - 1 && (this.anIntArrayArray9[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local36 && (this.anIntArrayArray9[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("97284, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUQCCBIO", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (arg6 < 1 || arg6 > 1) {
				throw new NullPointerException();
			}
			@Pc(15) int local15 = arg5 + arg0 - 1;
			@Pc(21) int local21 = arg4 + arg7 - 1;
			if (arg1 >= arg5 && arg1 <= local15 && arg3 >= arg4 && arg3 <= local21) {
				return true;
			} else if (arg1 == arg5 - 1 && arg3 >= arg4 && arg3 <= local21 && (this.anIntArrayArray9[arg1 - this.anInt319][arg3 - this.anInt320] & 0x8) == 0 && (arg2 & 0x8) == 0) {
				return true;
			} else if (arg1 == local15 + 1 && arg3 >= arg4 && arg3 <= local21 && (this.anIntArrayArray9[arg1 - this.anInt319][arg3 - this.anInt320] & 0x80) == 0 && (arg2 & 0x2) == 0) {
				return true;
			} else if (arg3 == arg4 - 1 && arg1 >= arg5 && arg1 <= local15 && (this.anIntArrayArray9[arg1 - this.anInt319][arg3 - this.anInt320] & 0x2) == 0 && (arg2 & 0x4) == 0) {
				return true;
			} else {
				return arg3 == local21 + 1 && arg1 >= arg5 && arg1 <= local15 && (this.anIntArrayArray9[arg1 - this.anInt319][arg3 - this.anInt320] & 0x20) == 0 && (arg2 & 0x1) == 0;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("19699, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}
}
