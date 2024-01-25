import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class182 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt4541;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public int anInt4545;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt4546;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt4560;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method4159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt4560;
		@Pc(21) int local21 = arg0 - this.anInt4545;
		this.anIntArrayArray21[local21][local12] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIZIIII)V")
	public void method4160(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(25) int local25 = arg3 - this.anInt4560;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(36) int local36 = arg5 - this.anInt4545;
		for (@Pc(38) int local38 = local36; local38 < local36 + arg1; local38++) {
			if (local38 >= 0 && local38 < this.anInt4541) {
				for (@Pc(55) int local55 = local25; local55 < local25 + arg4; local55++) {
					if (local55 >= 0 && this.anInt4546 > local55) {
						this.method4164(local55, local7, local38);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)V")
	private void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray21[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method4162() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4541; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt4546; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt4541 - 5 <= local3 || this.anInt4546 - 5 <= local7) {
					this.anIntArrayArray21[local3][local7] = -1;
				} else {
					this.anIntArrayArray21[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIZIZ)V")
	public void method4163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt4560;
		@Pc(13) int local13 = arg4 - this.anInt4545;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method4161(local13, local4, 128);
				this.method4161(local13 - 1, local4, 8);
			}
			if (arg0 == 1) {
				this.method4161(local13, local4, 2);
				this.method4161(local13, local4 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4161(local13, local4, 8);
				this.method4161(local13 + 1, local4, 128);
			}
			if (arg0 == 3) {
				this.method4161(local13, local4, 32);
				this.method4161(local13, local4 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method4161(local13, local4, 1);
				this.method4161(local13 - 1, local4 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4161(local13, local4, 4);
				this.method4161(local13 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method4161(local13, local4, 16);
				this.method4161(local13 + 1, local4 - 1, 1);
			}
			if (arg0 == 3) {
				this.method4161(local13, local4, 64);
				this.method4161(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method4161(local13, local4, 130);
				this.method4161(local13 - 1, local4, 8);
				this.method4161(local13, local4 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4161(local13, local4, 10);
				this.method4161(local13, local4 + 1, 32);
				this.method4161(local13 + 1, local4, 128);
			}
			if (arg0 == 2) {
				this.method4161(local13, local4, 40);
				this.method4161(local13 + 1, local4, 128);
				this.method4161(local13, local4 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4161(local13, local4, 160);
				this.method4161(local13, local4 - 1, 2);
				this.method4161(local13 - 1, local4, 8);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method4161(local13, local4, 65536);
					this.method4161(local13 - 1, local4, 4096);
				}
				if (arg0 == 1) {
					this.method4161(local13, local4, 1024);
					this.method4161(local13, local4 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4161(local13, local4, 4096);
					this.method4161(local13 + 1, local4, 65536);
				}
				if (arg0 == 3) {
					this.method4161(local13, local4, 16384);
					this.method4161(local13, local4 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method4161(local13, local4, 512);
					this.method4161(local13 - 1, local4 - -1, 8192);
				}
				if (arg0 == 1) {
					this.method4161(local13, local4, 2048);
					this.method4161(local13 + 1, local4 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4161(local13, local4, 8192);
					this.method4161(local13 + 1, local4 - 1, 512);
				}
				if (arg0 == 3) {
					this.method4161(local13, local4, 32768);
					this.method4161(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method4161(local13, local4, 66560);
					this.method4161(local13 - 1, local4, 4096);
					this.method4161(local13, local4 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4161(local13, local4, 5120);
					this.method4161(local13, local4 + 1, 16384);
					this.method4161(local13 + 1, local4, 65536);
				}
				if (arg0 == 2) {
					this.method4161(local13, local4, 20480);
					this.method4161(local13 + 1, local4, 65536);
					this.method4161(local13, local4 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4161(local13, local4, 81920);
					this.method4161(local13, local4 - 1, 1024);
					this.method4161(local13 - 1, local4, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method4161(local13, local4, 536870912);
				this.method4161(local13 - 1, local4, 33554432);
			}
			if (arg0 == 1) {
				this.method4161(local13, local4, 8388608);
				this.method4161(local13, local4 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4161(local13, local4, 33554432);
				this.method4161(local13 + 1, local4, 536870912);
			}
			if (arg0 == 3) {
				this.method4161(local13, local4, 134217728);
				this.method4161(local13, local4 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method4161(local13, local4, 4194304);
				this.method4161(local13 - 1, local4 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method4161(local13, local4, 16777216);
				this.method4161(local13 + 1, local4 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method4161(local13, local4, 67108864);
				this.method4161(local13 + 1, local4 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method4161(local13, local4, 268435456);
				this.method4161(local13 - 1, local4 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4161(local13, local4, 545259520);
			this.method4161(local13 - 1, local4, 33554432);
			this.method4161(local13, local4 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4161(local13, local4, 41943040);
			this.method4161(local13, local4 + 1, 134217728);
			this.method4161(local13 + 1, local4, 536870912);
		}
		if (arg0 == 2) {
			this.method4161(local13, local4, 167772160);
			this.method4161(local13 + 1, local4, 536870912);
			this.method4161(local13, local4 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4161(local13, local4, 671088640);
			this.method4161(local13, local4 - 1, 8388608);
			this.method4161(local13 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIB)V")
	private void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray21[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V")
	public void method4165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4545;
		@Pc(9) int local9 = arg1 - this.anInt4560;
		this.anIntArrayArray21[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg5 && arg4 == arg6) {
				return true;
			}
		} else if (arg5 >= arg3 && arg5 <= arg0 + arg3 - 1 && arg4 >= arg4 && arg4 + arg0 - 1 >= arg4) {
			return true;
		}
		@Pc(49) int local49 = arg3 - this.anInt4545;
		@Pc(54) int local54 = arg4 - this.anInt4560;
		@Pc(59) int local59 = arg5 - this.anInt4545;
		@Pc(64) int local64 = arg6 - this.anInt4560;
		if (arg0 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local59 + 1 == local49 && local64 == local54 && (this.anIntArrayArray21[local49][local64] & 0x80) == 0) {
						return true;
					}
					if (local59 == local49 && local64 == local54 - 1 && (this.anIntArrayArray21[local49][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local49 == local59 - 1 && local54 == local64 && (this.anIntArrayArray21[local49][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 == local49 && local54 - 1 == local64 && (this.anIntArrayArray21[local49][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local49 == local59 - 1 && local54 == local64 && (this.anIntArrayArray21[local49][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 == local49 && local64 == local54 + 1 && (this.anIntArrayArray21[local49][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local59 + 1 == local49 && local54 == local64 && (this.anIntArrayArray21[local49][local64] & 0x80) == 0) {
						return true;
					}
					if (local49 == local59 && local64 == local54 + 1 && (this.anIntArrayArray21[local49][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local59 == local49 && local54 + 1 == local64 && (this.anIntArrayArray21[local49][local64] & 0x20) == 0) {
					return true;
				}
				if (local49 == local59 && local64 == local54 - 1 && (this.anIntArrayArray21[local49][local64] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local49 && local54 == local64 && (this.anIntArrayArray21[local49][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local49 && local54 == local64 && (this.anIntArrayArray21[local49][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(390) int local390 = arg0 + local49 - 1;
			@Pc(396) int local396 = local64 + arg0 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local59 + 1 == local49 && local54 >= local64 && local54 <= local396 && (this.anIntArrayArray21[local49][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local49 && local390 >= local59 && local54 - arg0 == local64 && (this.anIntArrayArray21[local59][local396] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local49 == local59 - arg0 && local54 >= local64 && local396 >= local54 && (this.anIntArrayArray21[local390][local54] & 0x8) == 0) {
						return true;
					}
					if (local49 <= local59 && local59 <= local390 && local64 == local54 - arg0 && (this.anIntArrayArray21[local59][local396] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local59 - arg0 == local49 && local64 <= local54 && local396 >= local54 && (this.anIntArrayArray21[local390][local54] & 0x8) == 0) {
						return true;
					}
					if (local49 <= local59 && local390 >= local59 && local54 + 1 == local64 && (this.anIntArrayArray21[local59][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local49 == local59 + 1 && local64 <= local54 && local396 >= local54 && (this.anIntArrayArray21[local49][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local49 && local59 <= local390 && local64 == local54 + 1 && (this.anIntArrayArray21[local59][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local49 <= local59 && local390 >= local59 && local54 + 1 == local64 && (this.anIntArrayArray21[local59][local64] & 0x20) == 0) {
					return true;
				}
				if (local59 >= local49 && local390 >= local59 && local54 - arg0 == local64 && (this.anIntArrayArray21[local59][local396] & 0x2) == 0) {
					return true;
				}
				if (local49 == local59 - arg0 && local64 <= local54 && local396 >= local54 && (this.anIntArrayArray21[local390][local54] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local49 && local64 <= local54 && local54 <= local396 && (this.anIntArrayArray21[local49][local54] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static409.method6259(arg2, arg5, arg4, arg3, arg2, arg1, arg0, arg6) ? true : this.method4173(arg2, arg1, arg5, arg3, arg6, arg0, arg7, arg2, arg4);
		}
		@Pc(42) int local42 = arg1 + arg0 - 1;
		@Pc(48) int local48 = arg3 + arg5 - 1;
		if (arg0 <= arg6 && arg6 <= local42 && arg4 >= arg3 && arg4 <= local48) {
			return true;
		} else if (arg0 - 1 == arg6 && arg3 <= arg4 && local48 >= arg4 && (this.anIntArrayArray21[arg6 - this.anInt4545][arg4 - this.anInt4560] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (local42 + 1 == arg6 && arg3 <= arg4 && local48 >= arg4 && (this.anIntArrayArray21[arg6 - this.anInt4545][arg4 - this.anInt4560] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg4 && arg0 <= arg6 && arg6 <= local42 && (this.anIntArrayArray21[arg6 - this.anInt4545][arg4 - this.anInt4560] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return local48 + 1 == arg4 && arg0 <= arg6 && arg6 <= local42 && (this.anIntArrayArray21[arg6 - this.anInt4545][arg4 - this.anInt4560] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)V")
	public void method4169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt4560;
		@Pc(18) int local18 = arg0 - this.anInt4545;
		this.anIntArrayArray21[local18][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
	public void method4170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4545;
		@Pc(9) int local9 = arg1 - this.anInt4560;
		this.anIntArrayArray21[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIZIII)V")
	public void method4171(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt4560;
		@Pc(9) int local9 = arg5 - this.anInt4545;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method4164(local4, 128, local9);
				this.method4164(local4, 8, local9 - 1);
			}
			if (arg4 == 1) {
				this.method4164(local4, 2, local9);
				this.method4164(local4 + 1, 32, local9);
			}
			if (arg4 == 2) {
				this.method4164(local4, 8, local9);
				this.method4164(local4, 128, local9 + 1);
			}
			if (arg4 == 3) {
				this.method4164(local4, 32, local9);
				this.method4164(local4 - 1, 2, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method4164(local4, 1, local9);
				this.method4164(local4 + 1, 16, local9 - 1);
			}
			if (arg4 == 1) {
				this.method4164(local4, 4, local9);
				this.method4164(local4 + 1, 64, local9 + 1);
			}
			if (arg4 == 2) {
				this.method4164(local4, 16, local9);
				this.method4164(local4 - 1, 1, local9 + 1);
			}
			if (arg4 == 3) {
				this.method4164(local4, 64, local9);
				this.method4164(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method4164(local4, 130, local9);
				this.method4164(local4, 8, local9 - 1);
				this.method4164(local4 + 1, 32, local9);
			}
			if (arg4 == 1) {
				this.method4164(local4, 10, local9);
				this.method4164(local4 + 1, 32, local9);
				this.method4164(local4, 128, local9 + 1);
			}
			if (arg4 == 2) {
				this.method4164(local4, 40, local9);
				this.method4164(local4, 128, local9 + 1);
				this.method4164(local4 - 1, 2, local9);
			}
			if (arg4 == 3) {
				this.method4164(local4, 160, local9);
				this.method4164(local4 - 1, 2, local9);
				this.method4164(local4, 8, local9 - 1);
			}
		}
		if (arg3) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method4164(local4, 65536, local9);
					this.method4164(local4, 4096, local9 - 1);
				}
				if (arg4 == 1) {
					this.method4164(local4, 1024, local9);
					this.method4164(local4 + 1, 16384, local9);
				}
				if (arg4 == 2) {
					this.method4164(local4, 4096, local9);
					this.method4164(local4, 65536, local9 + 1);
				}
				if (arg4 == 3) {
					this.method4164(local4, 16384, local9);
					this.method4164(local4 - 1, 1024, local9);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method4164(local4, 512, local9);
					this.method4164(local4 + 1, 8192, local9 - 1);
				}
				if (arg4 == 1) {
					this.method4164(local4, 2048, local9);
					this.method4164(local4 + 1, 32768, local9 + 1);
				}
				if (arg4 == 2) {
					this.method4164(local4, 8192, local9);
					this.method4164(local4 - 1, 512, local9 + 1);
				}
				if (arg4 == 3) {
					this.method4164(local4, 32768, local9);
					this.method4164(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method4164(local4, 66560, local9);
					this.method4164(local4, 4096, local9 - 1);
					this.method4164(local4 + 1, 16384, local9);
				}
				if (arg4 == 1) {
					this.method4164(local4, 5120, local9);
					this.method4164(local4 + 1, 16384, local9);
					this.method4164(local4, 65536, local9 + 1);
				}
				if (arg4 == 2) {
					this.method4164(local4, 20480, local9);
					this.method4164(local4, 65536, local9 + 1);
					this.method4164(local4 - 1, 1024, local9);
				}
				if (arg4 == 3) {
					this.method4164(local4, 81920, local9);
					this.method4164(local4 - 1, 1024, local9);
					this.method4164(local4, 4096, local9 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method4164(local4, 536870912, local9);
				this.method4164(local4, 33554432, local9 - 1);
			}
			if (arg4 == 1) {
				this.method4164(local4, 8388608, local9);
				this.method4164(local4 + 1, 134217728, local9);
			}
			if (arg4 == 2) {
				this.method4164(local4, 33554432, local9);
				this.method4164(local4, 536870912, local9 + 1);
			}
			if (arg4 == 3) {
				this.method4164(local4, 134217728, local9);
				this.method4164(local4 - 1, 8388608, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method4164(local4, 4194304, local9);
				this.method4164(local4 + 1, 67108864, local9 - 1);
			}
			if (arg4 == 1) {
				this.method4164(local4, 16777216, local9);
				this.method4164(local4 + 1, 268435456, local9 + 1);
			}
			if (arg4 == 2) {
				this.method4164(local4, 67108864, local9);
				this.method4164(local4 - 1, 4194304, local9 + 1);
			}
			if (arg4 == 3) {
				this.method4164(local4, 268435456, local9);
				this.method4164(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4164(local4, 545259520, local9);
			this.method4164(local4, 33554432, local9 - 1);
			this.method4164(local4 + 1, 134217728, local9);
		}
		if (arg4 == 1) {
			this.method4164(local4, 41943040, local9);
			this.method4164(local4 + 1, 134217728, local9);
			this.method4164(local4, 536870912, local9 + 1);
		}
		if (arg4 == 2) {
			this.method4164(local4, 167772160, local9);
			this.method4164(local4, 536870912, local9 + 1);
			this.method4164(local4 - 1, 8388608, local9);
		}
		if (arg4 == 3) {
			this.method4164(local4, 671088640, local9);
			this.method4164(local4 - 1, 8388608, local9);
			this.method4164(local4, 33554432, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZIZII)V")
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg1 - this.anInt4560;
		@Pc(34) int local34;
		if (arg2 == 1 || arg2 == 3) {
			local34 = arg6;
			arg6 = arg0;
			arg0 = local34;
		}
		@Pc(43) int local43 = arg4 - this.anInt4545;
		for (local34 = local43; local34 < arg6 + local43; local34++) {
			if (local34 >= 0 && this.anInt4541 > local34) {
				for (@Pc(69) int local69 = local24; local69 < arg0 + local24; local69++) {
					if (local69 >= 0 && local69 < this.anInt4546) {
						this.method4161(local34, local69, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = arg0 + arg4;
		@Pc(21) int local21 = arg7 + arg8;
		@Pc(25) int local25 = arg1 + arg5;
		@Pc(29) int local29 = arg2 + arg3;
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (arg4 == local25 && (arg6 & 0x2) == 0) {
			local46 = arg8 <= arg3 ? arg3 : arg8;
			local53 = local29 > local21 ? local21 : local29;
			while (local53 > local46) {
				if ((this.anIntArrayArray21[local25 - this.anInt4545 - 1][local46 - this.anInt4560] & 0x8) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local17 == arg5 && (arg6 & 0x8) == 0) {
			local46 = arg3 < arg8 ? arg8 : arg3;
			local53 = local29 > local21 ? local21 : local29;
			while (local53 > local46) {
				if ((this.anIntArrayArray21[arg5 - this.anInt4545][local46 - this.anInt4560] & 0x80) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local29 == arg8 && (arg6 & 0x1) == 0) {
			local46 = arg4 > arg5 ? arg4 : arg5;
			local53 = local25 > local17 ? local17 : local25;
			while (local46 < local53) {
				if ((this.anIntArrayArray21[local46 - this.anInt4545][local29 - this.anInt4560 - 1] & 0x2) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local21 == arg3 && (arg6 & 0x4) == 0) {
			local46 = arg4 <= arg5 ? arg5 : arg4;
			local53 = local25 <= local17 ? local25 : local17;
			while (local53 > local46) {
				if ((this.anIntArrayArray21[local46 - this.anInt4545][arg3 - this.anInt4560] & 0x20) == 0) {
					return true;
				}
				local46++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method4175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg4 && arg6 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg3 + arg5 - 1 >= arg4 && arg6 <= arg6 && arg6 <= arg6 + arg3 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg1 - this.anInt4560;
		@Pc(62) int local62 = arg4 - this.anInt4545;
		@Pc(67) int local67 = arg5 - this.anInt4545;
		@Pc(72) int local72 = arg6 - this.anInt4560;
		if (arg3 == 1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local62 - 1 == local67 && local72 == local57) {
						return true;
					}
					if (local67 == local62 && local72 + 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local67 && local72 - 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local67 == local62 && local57 == local72 + 1) {
						return true;
					}
					if (local62 - 1 == local67 && local57 == local72 && (this.anIntArrayArray21[local67][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local67 && local57 == local72 && (this.anIntArrayArray21[local67][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local62 + 1 == local67 && local57 == local72) {
						return true;
					}
					if (local62 == local67 && local72 + 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local67 && local72 - 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local67 == local62 && local72 - 1 == local57) {
						return true;
					}
					if (local67 == local62 - 1 && local57 == local72 && (this.anIntArrayArray21[local67][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local62 + 1 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local67 == local62 - 1 && local72 == local57) {
						return true;
					}
					if (local62 == local67 && local57 == local72 + 1) {
						return true;
					}
					if (local62 + 1 == local67 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 == local67 && local72 - 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local62 - 1 == local67 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local67 && local57 == local72 + 1) {
						return true;
					}
					if (local62 + 1 == local67 && local72 == local57) {
						return true;
					}
					if (local62 == local67 && local72 - 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local62 - 1 == local67 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local67 && local72 + 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local62 + 1 && local57 == local72) {
						return true;
					}
					if (local67 == local62 && local57 == local72 - 1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local62 - 1 == local67 && local72 == local57) {
						return true;
					}
					if (local67 == local62 && local72 + 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local62 + 1 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 == local67 && local72 - 1 == local57) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local62 == local67 && local72 + 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x20) == 0) {
					return true;
				}
				if (local67 == local62 && local72 - 1 == local57 && (this.anIntArrayArray21[local67][local57] & 0x2) == 0) {
					return true;
				}
				if (local62 - 1 == local67 && local57 == local72 && (this.anIntArrayArray21[local67][local57] & 0x8) == 0) {
					return true;
				}
				if (local62 + 1 == local67 && local72 == local57 && (this.anIntArrayArray21[local67][local57] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(81) int local81 = local67 + arg3 - 1;
			@Pc(87) int local87 = local57 + arg3 - 1;
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local67 == local62 - arg3 && local72 >= local57 && local72 <= local87) {
						return true;
					}
					if (local67 <= local62 && local62 <= local81 && local72 + 1 == local57 && (this.anIntArrayArray21[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local62 && local81 >= local62 && local72 - arg3 == local57 && (this.anIntArrayArray21[local62][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local62 >= local67 && local81 >= local62 && local57 == local72 + 1) {
						return true;
					}
					if (local67 == local62 - arg3 && local57 <= local72 && local72 <= local87 && (this.anIntArrayArray21[local81][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray21[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local67 == local62 + 1 && local57 <= local72 && local87 >= local72) {
						return true;
					}
					if (local62 >= local67 && local81 >= local62 && local72 + 1 == local57 && (this.anIntArrayArray21[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 <= local62 && local81 >= local62 && local57 == local72 - arg3 && (this.anIntArrayArray21[local62][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local67 <= local62 && local81 >= local62 && local57 == local72 - arg3) {
						return true;
					}
					if (local62 - arg3 == local67 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray21[local81][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray21[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local62 - arg3 == local67 && local72 >= local57 && local87 >= local72) {
						return true;
					}
					if (local62 >= local67 && local81 >= local62 && local57 == local72 + 1) {
						return true;
					}
					if (local67 == local62 + 1 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray21[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local67 && local81 >= local62 && local72 - arg3 == local57 && (this.anIntArrayArray21[local62][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local62 - arg3 == local67 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray21[local81][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 <= local62 && local81 >= local62 && local57 == local72 + 1) {
						return true;
					}
					if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72) {
						return true;
					}
					if (local62 >= local67 && local62 <= local81 && local57 == local72 - arg3 && (this.anIntArrayArray21[local62][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local62 - arg3 == local67 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray21[local81][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 <= local62 && local62 <= local81 && local72 + 1 == local57 && (this.anIntArrayArray21[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local67 && local72 >= local57 && local72 <= local87) {
						return true;
					}
					if (local62 >= local67 && local81 >= local62 && local72 - arg3 == local57) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local67 == local62 - arg3 && local72 >= local57 && local87 >= local72) {
						return true;
					}
					if (local62 >= local67 && local62 <= local81 && local72 + 1 == local57 && (this.anIntArrayArray21[local62][local57] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local67 && local57 <= local72 && local87 >= local72 && (this.anIntArrayArray21[local67][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local67 && local81 >= local62 && local57 == local72 - arg3) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local67 <= local62 && local81 >= local62 && local72 + 1 == local57 && (this.anIntArrayArray21[local62][local57] & 0x2C0120) == 0) {
					return true;
				}
				if (local67 <= local62 && local62 <= local81 && local57 == local72 - arg3 && (this.anIntArrayArray21[local62][local87] & 0x2C0102) == 0) {
					return true;
				}
				if (local62 - arg3 == local67 && local57 <= local72 && local72 <= local87 && (this.anIntArrayArray21[local81][local72] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 == local62 + 1 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray21[local67][local72] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
