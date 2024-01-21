import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BXNXROZD")
public final class Class3 {

	@OriginalMember(owner = "client!BXNXROZD", name = "b", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "I")
	private int anInt28 = 2;

	@OriginalMember(owner = "client!BXNXROZD", name = "c", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!BXNXROZD", name = "d", descriptor = "I")
	private int anInt30 = 5;

	@OriginalMember(owner = "client!BXNXROZD", name = "e", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!BXNXROZD", name = "f", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!BXNXROZD", name = "g", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!BXNXROZD", name = "h", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!BXNXROZD", name = "i", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!BXNXROZD", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!BXNXROZD", name = "<init>", descriptor = "(III)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt31 = 0;
			this.anInt32 = 0;
			this.anInt33 = arg1;
			@Pc(28) int local28 = 6 / arg2;
			this.anInt34 = arg0;
			this.anIntArrayArray1 = new int[this.anInt33][this.anInt34];
			this.method12();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("11419, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "()V")
	public void method12() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt33; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt34; local7++) {
				if (local3 == 0 || local7 == 0 || local3 == this.anInt33 - 1 || local7 == this.anInt34 - 1) {
					this.anIntArrayArray1[local3][local7] = 16777215;
				} else {
					this.anIntArrayArray1[local3][local7] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIIZII)V")
	public void method13(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt31;
			@Pc(9) int local9 = arg4 - this.anInt32;
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method16(local4, local9, 128);
					this.method16(local4 - 1, local9, 8);
				}
				if (arg1 == 1) {
					this.method16(local4, local9, 2);
					this.method16(local4, local9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method16(local4, local9, 8);
					this.method16(local4 + 1, local9, 128);
				}
				if (arg1 == 3) {
					this.method16(local4, local9, 32);
					this.method16(local4, local9 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method16(local4, local9, 1);
					this.method16(local4 - 1, local9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method16(local4, local9, 4);
					this.method16(local4 + 1, local9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method16(local4, local9, 16);
					this.method16(local4 + 1, local9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method16(local4, local9, 64);
					this.method16(local4 - 1, local9 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method16(local4, local9, 130);
					this.method16(local4 - 1, local9, 8);
					this.method16(local4, local9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method16(local4, local9, 10);
					this.method16(local4, local9 + 1, 32);
					this.method16(local4 + 1, local9, 128);
				}
				if (arg1 == 2) {
					this.method16(local4, local9, 40);
					this.method16(local4 + 1, local9, 128);
					this.method16(local4, local9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method16(local4, local9, 160);
					this.method16(local4, local9 - 1, 2);
					this.method16(local4 - 1, local9, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg1 == 0) {
						this.method16(local4, local9, 65536);
						this.method16(local4 - 1, local9, 4096);
					}
					if (arg1 == 1) {
						this.method16(local4, local9, 1024);
						this.method16(local4, local9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method16(local4, local9, 4096);
						this.method16(local4 + 1, local9, 65536);
					}
					if (arg1 == 3) {
						this.method16(local4, local9, 16384);
						this.method16(local4, local9 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg1 == 0) {
						this.method16(local4, local9, 512);
						this.method16(local4 - 1, local9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method16(local4, local9, 2048);
						this.method16(local4 + 1, local9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method16(local4, local9, 8192);
						this.method16(local4 + 1, local9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method16(local4, local9, 32768);
						this.method16(local4 - 1, local9 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg1 == 0) {
						this.method16(local4, local9, 66560);
						this.method16(local4 - 1, local9, 4096);
						this.method16(local4, local9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method16(local4, local9, 5120);
						this.method16(local4, local9 + 1, 16384);
						this.method16(local4 + 1, local9, 65536);
					}
					if (arg1 == 2) {
						this.method16(local4, local9, 20480);
						this.method16(local4 + 1, local9, 65536);
						this.method16(local4, local9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method16(local4, local9, 81920);
						this.method16(local4, local9 - 1, 1024);
						this.method16(local4 - 1, local9, 4096);
						return;
					}
				}
			}
		} catch (@Pc(467) RuntimeException local467) {
			signlink.reporterror("23775, " + -4390 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIIIZZI)V")
	public void method14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg4) {
				local3 = 131328;
			}
			@Pc(23) int local23 = arg3 - this.anInt31;
			@Pc(28) int local28 = arg2 - this.anInt32;
			@Pc(36) int local36;
			if (arg0 == 1 || arg0 == 3) {
				local36 = arg1;
				arg1 = arg5;
				arg5 = local36;
			}
			for (local36 = local23; local36 < local23 + arg1; local36++) {
				if (local36 >= 0 && local36 < this.anInt33) {
					for (@Pc(52) int local52 = local28; local52 < local28 + arg5; local52++) {
						if (local52 >= 0 && local52 < this.anInt34) {
							this.method16(local36, local52, local3);
						}
					}
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("55498, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(III)V")
	public void method15(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(4) int local4 = arg0 - this.anInt31;
			@Pc(16) int local16 = arg1 - this.anInt32;
			this.anIntArrayArray1[local4][local16] |= 0x200000;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("64683, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "b", descriptor = "(III)V")
	private void method16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray1[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIIIZI)V")
	public void method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = arg3 - this.anInt31;
			if (arg0 > 0) {
				@Pc(12) int local12 = arg2 - this.anInt32;
				if (arg1 == 0) {
					if (arg5 == 0) {
						this.method19(local4, 128, local12);
						this.method19(local4 - 1, 8, local12);
					}
					if (arg5 == 1) {
						this.method19(local4, 2, local12);
						this.method19(local4, 32, local12 + 1);
					}
					if (arg5 == 2) {
						this.method19(local4, 8, local12);
						this.method19(local4 + 1, 128, local12);
					}
					if (arg5 == 3) {
						this.method19(local4, 32, local12);
						this.method19(local4, 2, local12 - 1);
					}
				}
				if (arg1 == 1 || arg1 == 3) {
					if (arg5 == 0) {
						this.method19(local4, 1, local12);
						this.method19(local4 - 1, 16, local12 + 1);
					}
					if (arg5 == 1) {
						this.method19(local4, 4, local12);
						this.method19(local4 + 1, 64, local12 + 1);
					}
					if (arg5 == 2) {
						this.method19(local4, 16, local12);
						this.method19(local4 + 1, 1, local12 - 1);
					}
					if (arg5 == 3) {
						this.method19(local4, 64, local12);
						this.method19(local4 - 1, 4, local12 - 1);
					}
				}
				if (arg1 == 2) {
					if (arg5 == 0) {
						this.method19(local4, 130, local12);
						this.method19(local4 - 1, 8, local12);
						this.method19(local4, 32, local12 + 1);
					}
					if (arg5 == 1) {
						this.method19(local4, 10, local12);
						this.method19(local4, 32, local12 + 1);
						this.method19(local4 + 1, 128, local12);
					}
					if (arg5 == 2) {
						this.method19(local4, 40, local12);
						this.method19(local4 + 1, 128, local12);
						this.method19(local4, 2, local12 - 1);
					}
					if (arg5 == 3) {
						this.method19(local4, 160, local12);
						this.method19(local4, 2, local12 - 1);
						this.method19(local4 - 1, 8, local12);
					}
				}
				if (arg4) {
					if (arg1 == 0) {
						if (arg5 == 0) {
							this.method19(local4, 65536, local12);
							this.method19(local4 - 1, 4096, local12);
						}
						if (arg5 == 1) {
							this.method19(local4, 1024, local12);
							this.method19(local4, 16384, local12 + 1);
						}
						if (arg5 == 2) {
							this.method19(local4, 4096, local12);
							this.method19(local4 + 1, 65536, local12);
						}
						if (arg5 == 3) {
							this.method19(local4, 16384, local12);
							this.method19(local4, 1024, local12 - 1);
						}
					}
					if (arg1 == 1 || arg1 == 3) {
						if (arg5 == 0) {
							this.method19(local4, 512, local12);
							this.method19(local4 - 1, 8192, local12 + 1);
						}
						if (arg5 == 1) {
							this.method19(local4, 2048, local12);
							this.method19(local4 + 1, 32768, local12 + 1);
						}
						if (arg5 == 2) {
							this.method19(local4, 8192, local12);
							this.method19(local4 + 1, 512, local12 - 1);
						}
						if (arg5 == 3) {
							this.method19(local4, 32768, local12);
							this.method19(local4 - 1, 2048, local12 - 1);
						}
					}
					if (arg1 == 2) {
						if (arg5 == 0) {
							this.method19(local4, 66560, local12);
							this.method19(local4 - 1, 4096, local12);
							this.method19(local4, 16384, local12 + 1);
						}
						if (arg5 == 1) {
							this.method19(local4, 5120, local12);
							this.method19(local4, 16384, local12 + 1);
							this.method19(local4 + 1, 65536, local12);
						}
						if (arg5 == 2) {
							this.method19(local4, 20480, local12);
							this.method19(local4 + 1, 65536, local12);
							this.method19(local4, 1024, local12 - 1);
						}
						if (arg5 == 3) {
							this.method19(local4, 81920, local12);
							this.method19(local4, 1024, local12 - 1);
							this.method19(local4 - 1, 4096, local12);
							return;
						}
					}
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("70192, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IZIIZII)V")
	public void method18(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(3) int local3 = 256;
			if (arg1) {
				local3 = 131328;
			}
			@Pc(14) int local14 = arg2 - this.anInt31;
			@Pc(29) int local29 = arg4 - this.anInt32;
			@Pc(37) int local37;
			if (arg5 == 1 || arg5 == 3) {
				local37 = arg3;
				arg3 = arg0;
				arg0 = local37;
			}
			for (local37 = local14; local37 < local14 + arg3; local37++) {
				if (local37 >= 0 && local37 < this.anInt33) {
					for (@Pc(53) int local53 = local29; local53 < local29 + arg0; local53++) {
						if (local53 >= 0 && local53 < this.anInt34) {
							this.method19(local37, local3, local53);
						}
					}
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("44053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIII)V")
	private void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.anIntArrayArray1[arg0][arg2] &= 16777215 - arg1;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("77033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIB)V")
	public void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) int local8 = arg0 - this.anInt31;
			@Pc(13) int local13 = arg1 - this.anInt32;
			this.anIntArrayArray1[local8][local13] &= 0xDFFFFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("63455, " + arg0 + ", " + arg1 + ", " + -58 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIIIZII)Z")
	public boolean method21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 == arg1 && arg5 == arg0) {
				return true;
			}
			@Pc(12) int local12 = arg2 - this.anInt31;
			@Pc(17) int local17 = arg5 - this.anInt32;
			@Pc(31) int local31 = arg1 - this.anInt31;
			@Pc(36) int local36 = arg0 - this.anInt32;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local12 == local31 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local31 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local31 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local31 && local17 == local36 - 1) {
						return true;
					}
					if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local12 == local31 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1 && (this.anIntArrayArray1[local12][local17] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local12 == local31 - 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280108) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local12 == local31 - 1 && local17 == local36) {
						return true;
					}
					if (local12 == local31 && local17 == local36 + 1 && (this.anIntArrayArray1[local12][local17] & 0x1280120) == 0) {
						return true;
					}
					if (local12 == local31 + 1 && local17 == local36 && (this.anIntArrayArray1[local12][local17] & 0x1280180) == 0) {
						return true;
					}
					if (local12 == local31 && local17 == local36 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
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
		} catch (@Pc(569) RuntimeException local569) {
			signlink.reporterror("42993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "b", descriptor = "(IIIIZII)Z")
	public boolean method22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 == arg5 && arg4 == arg3) {
				return true;
			}
			@Pc(12) int local12 = arg0 - this.anInt31;
			@Pc(17) int local17 = arg4 - this.anInt32;
			@Pc(22) int local22 = arg5 - this.anInt31;
			@Pc(27) int local27 = arg3 - this.anInt32;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
						return true;
					}
					if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local12 == local22 && local17 == local27 + 1 && (this.anIntArrayArray1[local12][local17] & 0x20) == 0) {
					return true;
				}
				if (local12 == local22 && local17 == local27 - 1 && (this.anIntArrayArray1[local12][local17] & 0x2) == 0) {
					return true;
				}
				if (local12 == local22 - 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x8) == 0) {
					return true;
				}
				if (local12 == local22 + 1 && local17 == local27 && (this.anIntArrayArray1[local12][local17] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("96512, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BXNXROZD", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg2 + arg1 - 1;
			@Pc(16) int local16 = arg3 + arg0 - 1;
			if (arg5 >= arg2 && arg5 <= local10 && arg6 >= arg3 && arg6 <= local16) {
				return true;
			} else if (arg5 == arg2 - 1 && arg6 >= arg3 && arg6 <= local16 && (this.anIntArrayArray1[arg5 - this.anInt31][arg6 - this.anInt32] & 0x8) == 0 && (arg4 & 0x8) == 0) {
				return true;
			} else if (arg5 == local10 + 1 && arg6 >= arg3 && arg6 <= local16 && (this.anIntArrayArray1[arg5 - this.anInt31][arg6 - this.anInt32] & 0x80) == 0 && (arg4 & 0x2) == 0) {
				return true;
			} else if (arg6 == arg3 - 1 && arg5 >= arg2 && arg5 <= local10 && (this.anIntArrayArray1[arg5 - this.anInt31][arg6 - this.anInt32] & 0x2) == 0 && (arg4 & 0x4) == 0) {
				return true;
			} else {
				return arg6 == local16 + 1 && arg5 >= arg2 && arg5 <= local10 && (this.anIntArrayArray1[arg5 - this.anInt31][arg6 - this.anInt32] & 0x20) == 0 && (arg4 & 0x1) == 0;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("14386, " + arg0 + ", " + arg1 + ", " + -544 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}
}
