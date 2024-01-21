import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EKHWFCYP")
public final class Class10 {

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "I")
	private int anInt213 = -179;

	@OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "I")
	private int anInt214 = 757;

	@OriginalMember(owner = "client!EKHWFCYP", name = "c", descriptor = "I")
	private int anInt215 = -23585;

	@OriginalMember(owner = "client!EKHWFCYP", name = "d", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!EKHWFCYP", name = "e", descriptor = "I")
	private int anInt216 = -16571;

	@OriginalMember(owner = "client!EKHWFCYP", name = "f", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!EKHWFCYP", name = "g", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!EKHWFCYP", name = "h", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!EKHWFCYP", name = "i", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!EKHWFCYP", name = "j", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!EKHWFCYP", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!EKHWFCYP", name = "<init>", descriptor = "(III)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt217 = 0;
			this.anInt218 = 0;
			this.anInt219 = arg0;
			this.anInt220 = arg1;
			this.anIntArrayArray3 = new int[this.anInt219][this.anInt220];
			this.method103();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("76129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "()V")
	public void method103() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt219; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt220; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt219 - 1 || local7 == this.anInt220 - 1) {
					this.anIntArrayArray3[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray3[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIZIII)V")
	public void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt217;
			@Pc(12) int local12 = arg3 - this.anInt218;
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method107(local4, local12, 128);
					this.method107(local4 - 1, local12, 8);
				}
				if (arg4 == 1) {
					this.method107(local4, local12, 2);
					this.method107(local4, local12 + 1, 32);
				}
				if (arg4 == 2) {
					this.method107(local4, local12, 8);
					this.method107(local4 + 1, local12, 128);
				}
				if (arg4 == 3) {
					this.method107(local4, local12, 32);
					this.method107(local4, local12 - 1, 2);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method107(local4, local12, 1);
					this.method107(local4 - 1, local12 + 1, 16);
				}
				if (arg4 == 1) {
					this.method107(local4, local12, 4);
					this.method107(local4 + 1, local12 + 1, 64);
				}
				if (arg4 == 2) {
					this.method107(local4, local12, 16);
					this.method107(local4 + 1, local12 - 1, 1);
				}
				if (arg4 == 3) {
					this.method107(local4, local12, 64);
					this.method107(local4 - 1, local12 - 1, 4);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method107(local4, local12, 130);
					this.method107(local4 - 1, local12, 8);
					this.method107(local4, local12 + 1, 32);
				}
				if (arg4 == 1) {
					this.method107(local4, local12, 10);
					this.method107(local4, local12 + 1, 32);
					this.method107(local4 + 1, local12, 128);
				}
				if (arg4 == 2) {
					this.method107(local4, local12, 40);
					this.method107(local4 + 1, local12, 128);
					this.method107(local4, local12 - 1, 2);
				}
				if (arg4 == 3) {
					this.method107(local4, local12, 160);
					this.method107(local4, local12 - 1, 2);
					this.method107(local4 - 1, local12, 8);
				}
			}
			if (arg2) {
				if (arg1 == 0) {
					if (arg4 == 0) {
						this.method107(local4, local12, 65536);
						this.method107(local4 - 1, local12, 4096);
					}
					if (arg4 == 1) {
						this.method107(local4, local12, 1024);
						this.method107(local4, local12 + 1, 16384);
					}
					if (arg4 == 2) {
						this.method107(local4, local12, 4096);
						this.method107(local4 + 1, local12, 65536);
					}
					if (arg4 == 3) {
						this.method107(local4, local12, 16384);
						this.method107(local4, local12 - 1, 1024);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg4 == 0) {
						this.method107(local4, local12, 512);
						this.method107(local4 - 1, local12 + 1, 8192);
					}
					if (arg4 == 1) {
						this.method107(local4, local12, 2048);
						this.method107(local4 + 1, local12 + 1, 32768);
					}
					if (arg4 == 2) {
						this.method107(local4, local12, 8192);
						this.method107(local4 + 1, local12 - 1, 512);
					}
					if (arg4 == 3) {
						this.method107(local4, local12, 32768);
						this.method107(local4 - 1, local12 - 1, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg4 == 0) {
						this.method107(local4, local12, 66560);
						this.method107(local4 - 1, local12, 4096);
						this.method107(local4, local12 + 1, 16384);
					}
					if (arg4 == 1) {
						this.method107(local4, local12, 5120);
						this.method107(local4, local12 + 1, 16384);
						this.method107(local4 + 1, local12, 65536);
					}
					if (arg4 == 2) {
						this.method107(local4, local12, 20480);
						this.method107(local4 + 1, local12, 65536);
						this.method107(local4, local12 - 1, 1024);
					}
					if (arg4 == 3) {
						this.method107(local4, local12, 81920);
						this.method107(local4, local12 - 1, 1024);
						this.method107(local4 - 1, local12, 4096);
						return;
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("19856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 339 + ", " + arg4 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIZI)V")
	public void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(23) int local23 = arg0 - this.anInt217;
			@Pc(28) int local28 = arg3 - this.anInt218;
			@Pc(36) int local36;
			if (arg5 == 1 || arg5 == 3) {
				local36 = arg1;
				arg1 = arg2;
				arg2 = local36;
			}
			for (local36 = local23; local36 < local23 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt219) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg2; local52++) {
						if (local52 >= 0 && local52 < this.anInt220) {
							this.method107(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("38354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(III)V")
	public void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt217;
			@Pc(9) int local9 = arg0 - this.anInt218;
			this.anIntArrayArray3[local4][local9] |= 0x200000;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("77348, " + arg0 + ", " + arg1 + ", " + 32151 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "(III)V")
	private void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray3[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIBIIZ)V")
	public void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt217;
			@Pc(9) int local9 = arg3 - this.anInt218;
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method110(local9, 128, local4);
					this.method110(local9, 8, local4 - 1);
				}
				if (arg2 == 1) {
					this.method110(local9, 2, local4);
					this.method110(local9 + 1, 32, local4);
				}
				if (arg2 == 2) {
					this.method110(local9, 8, local4);
					this.method110(local9, 128, local4 + 1);
				}
				if (arg2 == 3) {
					this.method110(local9, 32, local4);
					this.method110(local9 - 1, 2, local4);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method110(local9, 1, local4);
					this.method110(local9 + 1, 16, local4 - 1);
				}
				if (arg2 == 1) {
					this.method110(local9, 4, local4);
					this.method110(local9 + 1, 64, local4 + 1);
				}
				if (arg2 == 2) {
					this.method110(local9, 16, local4);
					this.method110(local9 - 1, 1, local4 + 1);
				}
				if (arg2 == 3) {
					this.method110(local9, 64, local4);
					this.method110(local9 - 1, 4, local4 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method110(local9, 130, local4);
					this.method110(local9, 8, local4 - 1);
					this.method110(local9 + 1, 32, local4);
				}
				if (arg2 == 1) {
					this.method110(local9, 10, local4);
					this.method110(local9 + 1, 32, local4);
					this.method110(local9, 128, local4 + 1);
				}
				if (arg2 == 2) {
					this.method110(local9, 40, local4);
					this.method110(local9, 128, local4 + 1);
					this.method110(local9 - 1, 2, local4);
				}
				if (arg2 == 3) {
					this.method110(local9, 160, local4);
					this.method110(local9 - 1, 2, local4);
					this.method110(local9, 8, local4 - 1);
				}
			}
			if (arg4) {
				if (arg1 == 0) {
					if (arg2 == 0) {
						this.method110(local9, 65536, local4);
						this.method110(local9, 4096, local4 - 1);
					}
					if (arg2 == 1) {
						this.method110(local9, 1024, local4);
						this.method110(local9 + 1, 16384, local4);
					}
					if (arg2 == 2) {
						this.method110(local9, 4096, local4);
						this.method110(local9, 65536, local4 + 1);
					}
					if (arg2 == 3) {
						this.method110(local9, 16384, local4);
						this.method110(local9 - 1, 1024, local4);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg2 == 0) {
						this.method110(local9, 512, local4);
						this.method110(local9 + 1, 8192, local4 - 1);
					}
					if (arg2 == 1) {
						this.method110(local9, 2048, local4);
						this.method110(local9 + 1, 32768, local4 + 1);
					}
					if (arg2 == 2) {
						this.method110(local9, 8192, local4);
						this.method110(local9 - 1, 512, local4 + 1);
					}
					if (arg2 == 3) {
						this.method110(local9, 32768, local4);
						this.method110(local9 - 1, 2048, local4 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						this.method110(local9, 66560, local4);
						this.method110(local9, 4096, local4 - 1);
						this.method110(local9 + 1, 16384, local4);
					}
					if (arg2 == 1) {
						this.method110(local9, 5120, local4);
						this.method110(local9 + 1, 16384, local4);
						this.method110(local9, 65536, local4 + 1);
					}
					if (arg2 == 2) {
						this.method110(local9, 20480, local4);
						this.method110(local9, 65536, local4 + 1);
						this.method110(local9 - 1, 1024, local4);
					}
					if (arg2 == 3) {
						this.method110(local9, 81920, local4);
						this.method110(local9 - 1, 1024, local4);
						this.method110(local9, 4096, local4 - 1);
						return;
					}
				}
			}
		} catch (@Pc(523) RuntimeException local523) {
			signlink.reporterror("59859, " + arg0 + ", " + arg1 + ", " + 77 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIIZ)V")
	public void method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		try {
			@Pc(3) int local3 = 256;
			if (arg6) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg0 - this.anInt217;
			@Pc(19) int local19 = arg4 - this.anInt218;
			@Pc(23) boolean local23 = false;
			@Pc(31) int local31;
			if (arg2 == 1 || arg2 == 3) {
				local31 = arg3;
				arg3 = arg5;
				arg5 = local31;
			}
			for (local31 = local14; local31 < local14 + arg3; local31++) {
				if (local31 >= 0 && local31 < this.anInt219) {
					for (@Pc(47) int local47 = local19; local47 < local19 + arg5; local47++) {
						if (local47 >= 0 && local47 < this.anInt220) {
							this.method110(local47, local3, local31);
						}
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("94102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIII)V")
	private void method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anIntArrayArray3[arg2][arg0] &= 16777215 - arg1;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("68452, " + arg0 + ", " + arg1 + ", " + -233 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "c", descriptor = "(III)V")
	public void method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg1 - this.anInt217;
			@Pc(9) int local9 = arg0 - this.anInt218;
			this.anIntArrayArray3[local4][local9] &= 0xDFFFFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("82134, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIII)Z")
	public boolean method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg5 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt217;
			@Pc(17) int local17 = arg4 - this.anInt218;
			@Pc(22) int local22 = arg5 - this.anInt217;
			@Pc(33) int local33 = arg3 - this.anInt218;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray3[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local12 == local22 - 1 && local17 == local33) {
						return true;
					}
					if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray3[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local33 - 1) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local12 == local22 && local17 == local33 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local33 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local33 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(566) RuntimeException local566) {
			signlink.reporterror("93273, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local566.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "b", descriptor = "(IIIIIII)Z")
	public boolean method113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 == arg3 && arg5 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg4 - this.anInt217;
			@Pc(17) int local17 = arg5 - this.anInt218;
			@Pc(22) int local22 = arg3 - this.anInt217;
			@Pc(27) int local27 = arg0 - this.anInt218;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray3[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray3[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray3[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("75000, " + arg0 + ", " + 20484 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKHWFCYP", name = "a", descriptor = "(IIIIIIZI)Z")
	public boolean method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(11) int local11 = arg3 + arg4 - 1;
			@Pc(17) int local17 = arg5 + arg0 - 1;
			if (arg2 >= arg3 && arg2 <= local11 && arg1 >= arg5 && arg1 <= local17) {
				return true;
			} else if (arg2 == arg3 - 1 && arg1 >= arg5 && arg1 <= local17 && (this.anIntArrayArray3[arg2 - this.anInt217][arg1 - this.anInt218] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg2 == local11 + 1 && arg1 >= arg5 && arg1 <= local17 && (this.anIntArrayArray3[arg2 - this.anInt217][arg1 - this.anInt218] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg5 - 1 && arg2 >= arg3 && arg2 <= local11 && (this.anIntArrayArray3[arg2 - this.anInt217][arg1 - this.anInt218] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == local17 + 1 && arg2 >= arg3 && arg2 <= local11 && (this.anIntArrayArray3[arg2 - this.anInt217][arg1 - this.anInt218] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("47466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}
}
