import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class30 {

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	private int anInt614;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt614 = arg0;
		this.anInt609 = 0;
		this.anInt603 = 0;
		this.anInt599 = arg1;
		this.anIntArrayArray6 = new int[this.anInt614][this.anInt599];
		this.method579();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)V")
	private void method564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt609;
		@Pc(21) int local21 = arg1 - this.anInt603;
		this.anIntArrayArray6[local21][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZIIIII)V")
	public void method567(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt609;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg5 - this.anInt603;
		if (arg0) {
			local12 = 131328;
		}
		if (arg1) {
			local12 |= 0x40000000;
		}
		for (@Pc(32) int local32 = local17; local32 < local17 + arg3; local32++) {
			if (local32 >= 0 && this.anInt614 > local32) {
				for (@Pc(54) int local54 = local6; local54 < local6 + arg2; local54++) {
					if (local54 >= 0 && this.anInt599 > local54) {
						this.method581(local12, local54, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIZIIZ)V")
	public void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) int local6 = arg1 - this.anInt609;
		@Pc(23) int local23;
		if (arg0 == 1 || arg0 == 3) {
			local23 = arg5;
			arg5 = arg2;
			arg2 = local23;
		}
		@Pc(32) int local32 = arg4 - this.anInt603;
		@Pc(34) int local34 = 256;
		if (arg3) {
			local34 = 131328;
		}
		if (arg6) {
			local34 |= 0x40000000;
		}
		for (local23 = local32; local23 < local32 + arg5; local23++) {
			if (local23 >= 0 && this.anInt614 > local23) {
				for (@Pc(70) int local70 = local6; local70 < arg2 + local6; local70++) {
					if (local70 >= 0 && this.anInt599 > local70) {
						this.method564(local23, local70, local34);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIIZII)V")
	public void method569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt603;
		@Pc(13) int local13 = arg5 - this.anInt609;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method564(local4, local13, 128);
				this.method564(local4 - 1, local13, 8);
			}
			if (arg0 == 1) {
				this.method564(local4, local13, 2);
				this.method564(local4, local13 + 1, 32);
			}
			if (arg0 == 2) {
				this.method564(local4, local13, 8);
				this.method564(local4 + 1, local13, 128);
			}
			if (arg0 == 3) {
				this.method564(local4, local13, 32);
				this.method564(local4, local13 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method564(local4, local13, 1);
				this.method564(local4 - 1, local13 + 1, 16);
			}
			if (arg0 == 1) {
				this.method564(local4, local13, 4);
				this.method564(local4 + 1, local13 + 1, 64);
			}
			if (arg0 == 2) {
				this.method564(local4, local13, 16);
				this.method564(local4 + 1, local13 + -1, 1);
			}
			if (arg0 == 3) {
				this.method564(local4, local13, 64);
				this.method564(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method564(local4, local13, 130);
				this.method564(local4 - 1, local13, 8);
				this.method564(local4, local13 + 1, 32);
			}
			if (arg0 == 1) {
				this.method564(local4, local13, 10);
				this.method564(local4, local13 + 1, 32);
				this.method564(local4 + 1, local13, 128);
			}
			if (arg0 == 2) {
				this.method564(local4, local13, 40);
				this.method564(local4 + 1, local13, 128);
				this.method564(local4, local13 - 1, 2);
			}
			if (arg0 == 3) {
				this.method564(local4, local13, 160);
				this.method564(local4, local13 - 1, 2);
				this.method564(local4 - 1, local13, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method564(local4, local13, 65536);
					this.method564(local4 - 1, local13, 4096);
				}
				if (arg0 == 1) {
					this.method564(local4, local13, 1024);
					this.method564(local4, local13 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method564(local4, local13, 4096);
					this.method564(local4 + 1, local13, 65536);
				}
				if (arg0 == 3) {
					this.method564(local4, local13, 16384);
					this.method564(local4, local13 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method564(local4, local13, 512);
					this.method564(local4 - 1, local13 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method564(local4, local13, 2048);
					this.method564(local4 + 1, local13 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method564(local4, local13, 8192);
					this.method564(local4 + 1, local13 + -1, 512);
				}
				if (arg0 == 3) {
					this.method564(local4, local13, 32768);
					this.method564(local4 - 1, local13 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method564(local4, local13, 66560);
					this.method564(local4 - 1, local13, 4096);
					this.method564(local4, local13 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method564(local4, local13, 5120);
					this.method564(local4, local13 + 1, 16384);
					this.method564(local4 + 1, local13, 65536);
				}
				if (arg0 == 2) {
					this.method564(local4, local13, 20480);
					this.method564(local4 + 1, local13, 65536);
					this.method564(local4, local13 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method564(local4, local13, 81920);
					this.method564(local4, local13 - 1, 1024);
					this.method564(local4 - 1, local13, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method564(local4, local13, 536870912);
				this.method564(local4 - 1, local13, 33554432);
			}
			if (arg0 == 1) {
				this.method564(local4, local13, 8388608);
				this.method564(local4, local13 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method564(local4, local13, 33554432);
				this.method564(local4 + 1, local13, 536870912);
			}
			if (arg0 == 3) {
				this.method564(local4, local13, 134217728);
				this.method564(local4, local13 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method564(local4, local13, 4194304);
				this.method564(local4 - 1, local13 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method564(local4, local13, 16777216);
				this.method564(local4 + 1, local13 - -1, 268435456);
			}
			if (arg0 == 2) {
				this.method564(local4, local13, 67108864);
				this.method564(local4 + 1, local13 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method564(local4, local13, 268435456);
				this.method564(local4 - 1, local13 - 1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method564(local4, local13, 545259520);
			this.method564(local4 - 1, local13, 33554432);
			this.method564(local4, local13 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method564(local4, local13, 41943040);
			this.method564(local4, local13 + 1, 134217728);
			this.method564(local4 + 1, local13, 536870912);
		}
		if (arg0 == 2) {
			this.method564(local4, local13, 167772160);
			this.method564(local4 + 1, local13, 536870912);
			this.method564(local4, local13 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method564(local4, local13, 671088640);
			this.method564(local4, local13 - 1, 8388608);
			this.method564(local4 - 1, local13, 33554432);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 <= 1) {
			@Pc(39) int local39 = arg3 + arg5 - 1;
			@Pc(45) int local45 = arg4 + arg6 - 1;
			if (arg7 >= arg4 && local45 >= arg7 && arg3 <= arg0 && arg0 <= local39) {
				return true;
			} else if (arg4 - 1 == arg7 && arg3 <= arg0 && arg0 <= local39 && (this.anIntArrayArray6[arg7 - this.anInt603][arg0 - this.anInt609] & 0x8) == 0 && (arg1 & 0x8) == 0) {
				return true;
			} else if (arg7 == local45 + 1 && arg0 >= arg3 && arg0 <= local39 && (this.anIntArrayArray6[arg7 - this.anInt603][arg0 - this.anInt609] & 0x80) == 0 && (arg1 & 0x2) == 0) {
				return true;
			} else if (arg3 - 1 == arg0 && arg4 <= arg7 && arg7 <= local45 && (this.anIntArrayArray6[arg7 - this.anInt603][arg0 - this.anInt609] & 0x2) == 0 && (arg1 & 0x4) == 0) {
				return true;
			} else {
				return arg0 == local39 + 1 && arg7 >= arg4 && arg7 <= local45 && (this.anIntArrayArray6[arg7 - this.anInt603][arg0 - this.anInt609] & 0x20) == 0 && (arg1 & 0x1) == 0;
			}
		} else if (Static296.method4477(arg0, arg4, arg5, arg2, arg3, arg6, arg7, arg2)) {
			return true;
		} else {
			return this.method578(arg5, arg2, arg7, arg6, arg2, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZZIII)V")
	public void method573(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 - this.anInt609;
		@Pc(19) int local19 = arg3 - this.anInt603;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method581(128, local14, local19);
				this.method581(8, local14, local19 - 1);
			}
			if (arg5 == 1) {
				this.method581(2, local14, local19);
				this.method581(32, local14 + 1, local19);
			}
			if (arg5 == 2) {
				this.method581(8, local14, local19);
				this.method581(128, local14, local19 + 1);
			}
			if (arg5 == 3) {
				this.method581(32, local14, local19);
				this.method581(2, local14 - 1, local19);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method581(1, local14, local19);
				this.method581(16, local14 + 1, local19 + -1);
			}
			if (arg5 == 1) {
				this.method581(4, local14, local19);
				this.method581(64, local14 + 1, local19 - -1);
			}
			if (arg5 == 2) {
				this.method581(16, local14, local19);
				this.method581(1, local14 - 1, local19 + 1);
			}
			if (arg5 == 3) {
				this.method581(64, local14, local19);
				this.method581(4, local14 - 1, local19 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method581(130, local14, local19);
				this.method581(8, local14, local19 - 1);
				this.method581(32, local14 + 1, local19);
			}
			if (arg5 == 1) {
				this.method581(10, local14, local19);
				this.method581(32, local14 + 1, local19);
				this.method581(128, local14, local19 + 1);
			}
			if (arg5 == 2) {
				this.method581(40, local14, local19);
				this.method581(128, local14, local19 + 1);
				this.method581(2, local14 - 1, local19);
			}
			if (arg5 == 3) {
				this.method581(160, local14, local19);
				this.method581(2, local14 - 1, local19);
				this.method581(8, local14, local19 - 1);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method581(65536, local14, local19);
					this.method581(4096, local14, local19 - 1);
				}
				if (arg5 == 1) {
					this.method581(1024, local14, local19);
					this.method581(16384, local14 + 1, local19);
				}
				if (arg5 == 2) {
					this.method581(4096, local14, local19);
					this.method581(65536, local14, local19 + 1);
				}
				if (arg5 == 3) {
					this.method581(16384, local14, local19);
					this.method581(1024, local14 - 1, local19);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method581(512, local14, local19);
					this.method581(8192, local14 + 1, local19 + -1);
				}
				if (arg5 == 1) {
					this.method581(2048, local14, local19);
					this.method581(32768, local14 + 1, local19 - -1);
				}
				if (arg5 == 2) {
					this.method581(8192, local14, local19);
					this.method581(512, local14 - 1, local19 - -1);
				}
				if (arg5 == 3) {
					this.method581(32768, local14, local19);
					this.method581(2048, local14 - 1, local19 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method581(66560, local14, local19);
					this.method581(4096, local14, local19 - 1);
					this.method581(16384, local14 + 1, local19);
				}
				if (arg5 == 1) {
					this.method581(5120, local14, local19);
					this.method581(16384, local14 + 1, local19);
					this.method581(65536, local14, local19 + 1);
				}
				if (arg5 == 2) {
					this.method581(20480, local14, local19);
					this.method581(65536, local14, local19 + 1);
					this.method581(1024, local14 - 1, local19);
				}
				if (arg5 == 3) {
					this.method581(81920, local14, local19);
					this.method581(1024, local14 - 1, local19);
					this.method581(4096, local14, local19 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method581(536870912, local14, local19);
				this.method581(33554432, local14, local19 - 1);
			}
			if (arg5 == 1) {
				this.method581(8388608, local14, local19);
				this.method581(134217728, local14 + 1, local19);
			}
			if (arg5 == 2) {
				this.method581(33554432, local14, local19);
				this.method581(536870912, local14, local19 + 1);
			}
			if (arg5 == 3) {
				this.method581(134217728, local14, local19);
				this.method581(8388608, local14 - 1, local19);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method581(4194304, local14, local19);
				this.method581(67108864, local14 + 1, local19 + -1);
			}
			if (arg5 == 1) {
				this.method581(16777216, local14, local19);
				this.method581(268435456, local14 + 1, local19 - -1);
			}
			if (arg5 == 2) {
				this.method581(67108864, local14, local19);
				this.method581(4194304, local14 - 1, local19 + 1);
			}
			if (arg5 == 3) {
				this.method581(268435456, local14, local19);
				this.method581(16777216, local14 - 1, local19 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method581(545259520, local14, local19);
			this.method581(33554432, local14, local19 - 1);
			this.method581(134217728, local14 + 1, local19);
		}
		if (arg5 == 1) {
			this.method581(41943040, local14, local19);
			this.method581(134217728, local14 + 1, local19);
			this.method581(536870912, local14, local19 + 1);
		}
		if (arg5 == 2) {
			this.method581(167772160, local14, local19);
			this.method581(536870912, local14, local19 + 1);
			this.method581(8388608, local14 - 1, local19);
		}
		if (arg5 == 3) {
			this.method581(671088640, local14, local19);
			this.method581(8388608, local14 - 1, local19);
			this.method581(33554432, local14, local19 - 1);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg3 && arg0 == arg2) {
				return true;
			}
		} else if (arg3 <= arg4 && arg4 <= arg3 + arg5 - 1 && arg0 >= arg0 && arg0 <= arg5 + arg0 - 1) {
			return true;
		}
		@Pc(62) int local62 = arg0 - this.anInt609;
		@Pc(67) int local67 = arg4 - this.anInt603;
		@Pc(72) int local72 = arg2 - this.anInt609;
		@Pc(77) int local77 = arg3 - this.anInt603;
		if (arg5 == 1) {
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local77 == local67 - 1 && local72 == local62) {
						return true;
					}
					if (local67 == local77 && local72 == local62 + 1 && (this.anIntArrayArray6[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 && local72 == local62 - 1 && (this.anIntArrayArray6[local77][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 == local77 && local72 == local62 + 1) {
						return true;
					}
					if (local77 == local67 - 1 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local67 + 1 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local67 + 1 && local72 == local62) {
						return true;
					}
					if (local67 == local77 && local72 == local62 + 1 && (this.anIntArrayArray6[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 == local77 && local62 - 1 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 == local77 && local62 - 1 == local72) {
						return true;
					}
					if (local77 == local67 - 1 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local77 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local77 == local67 - 1 && local62 == local72) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1) {
						return true;
					}
					if (local77 == local67 + 1 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 - 1 && (this.anIntArrayArray6[local77][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local67 - 1 == local77 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 + 1) {
						return true;
					}
					if (local67 + 1 == local77 && local62 == local72) {
						return true;
					}
					if (local67 == local77 && local62 - 1 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local67 - 1 == local77 && local62 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 == local67 && local62 + 1 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local77 && local62 == local72) {
						return true;
					}
					if (local67 == local77 && local72 == local62 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local67 - 1 == local77 && local62 == local72) {
						return true;
					}
					if (local67 == local77 && local72 == local62 + 1 && (this.anIntArrayArray6[local77][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local67 + 1 && local72 == local62 && (this.anIntArrayArray6[local77][local72] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 == local67 && local72 == local62 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local77 == local67 && local62 + 1 == local72 && (this.anIntArrayArray6[local77][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 == local77 && local62 - 1 == local72 && (this.anIntArrayArray6[local77][local72] & 0x2) == 0) {
					return true;
				}
				if (local67 - 1 == local77 && local72 == local62 && (this.anIntArrayArray6[local77][local72] & 0x8) == 0) {
					return true;
				}
				if (local77 == local67 + 1 && local72 == local62 && (this.anIntArrayArray6[local77][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = local77 + arg5 - 1;
			@Pc(95) int local95 = arg5 + local72 - 1;
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local67 - arg5 == local77 && local72 <= local62 && local95 >= local62) {
						return true;
					}
					if (local67 >= local77 && local67 <= local89 && local62 + 1 == local72 && (this.anIntArrayArray6[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local89 && local62 - arg5 == local72 && (this.anIntArrayArray6[local67][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local77 <= local67 && local67 <= local89 && local62 + 1 == local72) {
						return true;
					}
					if (local67 - arg5 == local77 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray6[local89][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local77 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray6[local77][local62] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local67 + 1 && local72 <= local62 && local95 >= local62) {
						return true;
					}
					if (local67 >= local77 && local67 <= local89 && local72 == local62 + 1 && (this.anIntArrayArray6[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 >= local77 && local67 <= local89 && local72 == local62 - arg5 && (this.anIntArrayArray6[local67][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 <= local67 && local89 >= local67 && local72 == local62 - arg5) {
						return true;
					}
					if (local77 == local67 - arg5 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray6[local89][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local67 + 1 == local77 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray6[local77][local62] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local67 - arg5 == local77 && local62 >= local72 && local95 >= local62) {
						return true;
					}
					if (local67 >= local77 && local89 >= local67 && local62 + 1 == local72) {
						return true;
					}
					if (local77 == local67 + 1 && local62 >= local72 && local95 >= local62 && (this.anIntArrayArray6[local77][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local77 <= local67 && local89 >= local67 && local72 == local62 - arg5 && (this.anIntArrayArray6[local67][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local77 == local67 - arg5 && local62 >= local72 && local62 <= local95 && (this.anIntArrayArray6[local89][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 <= local67 && local67 <= local89 && local62 + 1 == local72) {
						return true;
					}
					if (local77 == local67 + 1 && local72 <= local62 && local62 <= local95) {
						return true;
					}
					if (local77 <= local67 && local89 >= local67 && local72 == local62 - arg5 && (this.anIntArrayArray6[local67][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local77 == local67 - arg5 && local72 <= local62 && local95 >= local62 && (this.anIntArrayArray6[local89][local62] & 0x2C0108) == 0) {
						return true;
					}
					if (local77 <= local67 && local67 <= local89 && local62 + 1 == local72 && (this.anIntArrayArray6[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local77 == local67 + 1 && local62 >= local72 && local95 >= local62) {
						return true;
					}
					if (local67 >= local77 && local89 >= local67 && local72 == local62 - arg5) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local77 == local67 - arg5 && local62 >= local72 && local62 <= local95) {
						return true;
					}
					if (local67 >= local77 && local67 <= local89 && local62 + 1 == local72 && (this.anIntArrayArray6[local67][local72] & 0x2C0120) == 0) {
						return true;
					}
					if (local67 + 1 == local77 && local72 <= local62 && local62 <= local95 && (this.anIntArrayArray6[local77][local62] & 0x2C0180) == 0) {
						return true;
					}
					if (local67 >= local77 && local89 >= local67 && local72 == local62 - arg5) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local67 >= local77 && local89 >= local67 && local62 + 1 == local72 && (this.anIntArrayArray6[local67][local72] & 0x2C0120) == 0) {
					return true;
				}
				if (local77 <= local67 && local89 >= local67 && local62 - arg5 == local72 && (this.anIntArrayArray6[local67][local95] & 0x2C0102) == 0) {
					return true;
				}
				if (local67 - arg5 == local77 && local62 >= local72 && local62 <= local95 && (this.anIntArrayArray6[local89][local62] & 0x2C0108) == 0) {
					return true;
				}
				if (local67 + 1 == local77 && local62 >= local72 && local62 <= local95 && (this.anIntArrayArray6[local77][local62] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)Z")
	public boolean method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 == arg3 && arg1 == arg0) {
			return true;
		}
		@Pc(23) int local23 = arg0 - this.anInt609;
		@Pc(28) int local28 = arg2 - this.anInt603;
		if (local28 < 0 || this.anInt614 <= local28 || local23 < 0 || this.anInt599 <= local23) {
			return false;
		}
		@Pc(54) int local54 = arg3 - this.anInt603;
		@Pc(59) int local59 = arg1 - this.anInt609;
		if (local54 < 0 || local54 >= this.anInt614 || local59 < 0 || this.anInt599 <= local59) {
			return false;
		}
		@Pc(99) int local99;
		if (local23 > local59) {
			local99 = local23 - local59;
		} else {
			local99 = local59 - local23;
		}
		@Pc(118) int local118;
		if (local28 <= local54) {
			local118 = local54 - local28;
		} else {
			local118 = local28 - local54;
		}
		@Pc(140) int local140;
		@Pc(134) int local134;
		if (local118 > local99) {
			local134 = 32768;
			local140 = local99 * 65536 / local118;
			while (local28 != local54) {
				if (local28 > local54) {
					if ((this.anIntArrayArray6[local54][local59] & 0x2C0108) != 0) {
						return false;
					}
					local54++;
				} else if (local54 > local28) {
					if ((this.anIntArrayArray6[local54][local59] & 0x2C0180) != 0) {
						return false;
					}
					local54--;
				}
				local134 += local140;
				if (local134 >= 65536) {
					local134 -= 65536;
					if (local23 > local59) {
						if ((this.anIntArrayArray6[local54][local59] & 0x2C0102) != 0) {
							return false;
						}
						local59++;
					} else if (local59 > local23) {
						if ((this.anIntArrayArray6[local54][local59] & 0x2C0120) != 0) {
							return false;
						}
						local59--;
					}
				}
			}
		} else {
			local140 = local118 * 65536 / local99;
			local134 = 32768;
			while (local23 != local59) {
				if (local23 > local59) {
					if ((this.anIntArrayArray6[local54][local59] & 0x2C0102) != 0) {
						return false;
					}
					local59++;
				} else if (local23 < local59) {
					if ((this.anIntArrayArray6[local54][local59] & 0x2C0120) != 0) {
						return false;
					}
					local59--;
				}
				local134 += local140;
				if (local134 >= 65536) {
					local134 -= 65536;
					if (local28 > local54) {
						if ((this.anIntArrayArray6[local54][local59] & 0x2C0108) != 0) {
							return false;
						}
						local54++;
					} else if (local54 > local28) {
						if ((this.anIntArrayArray6[local54][local59] & 0x2C0180) != 0) {
							return false;
						}
						local54--;
					}
				}
			}
		}
		return (this.anIntArrayArray6[local28][local23] & 0x240100) == 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg1 == arg0 && arg2 == arg3) {
				return true;
			}
		} else if (arg1 <= arg0 && arg0 <= arg1 + arg6 - 1 && arg2 <= arg2 && arg6 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(62) int local62 = arg3 - this.anInt609;
		@Pc(67) int local67 = arg1 - this.anInt603;
		@Pc(72) int local72 = arg0 - this.anInt603;
		@Pc(77) int local77 = arg2 - this.anInt609;
		if (arg6 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local72 + 1 == local67 && local77 == local62 && (this.anIntArrayArray6[local67][local62] & 0x80) == 0) {
						return true;
					}
					if (local72 == local67 && local77 - 1 == local62 && (this.anIntArrayArray6[local67][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local72 - 1 == local67 && local62 == local77 && (this.anIntArrayArray6[local67][local62] & 0x8) == 0) {
						return true;
					}
					if (local67 == local72 && local62 == local77 - 1 && (this.anIntArrayArray6[local67][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local72 - 1 == local67 && local77 == local62 && (this.anIntArrayArray6[local67][local62] & 0x8) == 0) {
						return true;
					}
					if (local72 == local67 && local62 == local77 + 1 && (this.anIntArrayArray6[local67][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local72 + 1 == local67 && local77 == local62 && (this.anIntArrayArray6[local67][local62] & 0x80) == 0) {
						return true;
					}
					if (local67 == local72 && local62 == local77 + 1 && (this.anIntArrayArray6[local67][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local72 == local67 && local62 == local77 + 1 && (this.anIntArrayArray6[local67][local62] & 0x20) == 0) {
					return true;
				}
				if (local67 == local72 && local77 - 1 == local62 && (this.anIntArrayArray6[local67][local62] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local67 && local77 == local62 && (this.anIntArrayArray6[local67][local62] & 0x8) == 0) {
					return true;
				}
				if (local67 == local72 + 1 && local62 == local77 && (this.anIntArrayArray6[local67][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = local67 + arg6 - 1;
			@Pc(95) int local95 = local62 + arg6 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local67 == local72 + 1 && local77 >= local62 && local77 <= local95 && (this.anIntArrayArray6[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local67 && local89 >= local72 && local62 == local77 - arg6 && (this.anIntArrayArray6[local72][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local67 == local72 - arg6 && local77 >= local62 && local77 <= local95 && (this.anIntArrayArray6[local89][local77] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local72 && local89 >= local72 && local62 == local77 - arg6 && (this.anIntArrayArray6[local72][local95] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local67 == local72 - arg6 && local62 <= local77 && local77 <= local95 && (this.anIntArrayArray6[local89][local77] & 0x8) == 0) {
						return true;
					}
					if (local72 >= local67 && local72 <= local89 && local62 == local77 + 1 && (this.anIntArrayArray6[local72][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local67 == local72 + 1 && local77 >= local62 && local95 >= local77 && (this.anIntArrayArray6[local67][local77] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local67 && local89 >= local72 && local77 + 1 == local62 && (this.anIntArrayArray6[local72][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local67 <= local72 && local72 <= local89 && local77 + 1 == local62 && (this.anIntArrayArray6[local72][local62] & 0x20) == 0) {
					return true;
				}
				if (local67 <= local72 && local72 <= local89 && local77 - arg6 == local62 && (this.anIntArrayArray6[local72][local95] & 0x2) == 0) {
					return true;
				}
				if (local72 - arg6 == local67 && local77 >= local62 && local77 <= local95 && (this.anIntArrayArray6[local89][local77] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local67 && local77 >= local62 && local95 >= local77 && (this.anIntArrayArray6[local67][local77] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg2;
		@Pc(13) int local13 = arg6 + arg3;
		@Pc(17) int local17 = arg1 + arg5;
		@Pc(22) int local22 = arg8 + arg0;
		@Pc(51) int local51;
		@Pc(62) int local62;
		if (local13 == arg2 && (arg7 & 0x2) == 0) {
			local51 = arg5 <= arg8 ? arg8 : arg5;
			local62 = local22 <= local17 ? local22 : local17;
			while (local62 > local51) {
				if ((this.anIntArrayArray6[local13 - this.anInt603 - 1][local51 - this.anInt609] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg6 && (arg7 & 0x8) == 0) {
			local51 = arg5 > arg8 ? arg5 : arg8;
			local62 = local17 >= local22 ? local22 : local17;
			while (local62 > local51) {
				if ((this.anIntArrayArray6[arg6 - this.anInt603][local51 - this.anInt609] & 0x80) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local22 == arg5 && (arg7 & 0x1) == 0) {
			local51 = arg2 > arg6 ? arg2 : arg6;
			local62 = local13 <= local9 ? local13 : local9;
			while (local62 > local51) {
				if ((this.anIntArrayArray6[local51 - this.anInt603][local22 - this.anInt609 - 1] & 0x2) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local17 == arg8 && (arg7 & 0x4) == 0) {
			local62 = local13 > local9 ? local9 : local13;
			for (local51 = arg2 <= arg6 ? arg6 : arg2; local51 < local62; local51++) {
				if ((this.anIntArrayArray6[local51 - this.anInt603][arg8 - this.anInt609] & 0x20) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public void method579() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt614; local11++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt599; local21++) {
				if (local11 == 0 || local21 == 0 || this.anInt614 - 5 <= local11 || local21 >= this.anInt599 - 5) {
					this.anIntArrayArray6[local11][local21] = 16777215;
				} else {
					this.anIntArrayArray6[local11][local21] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V")
	public void method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt603;
		@Pc(19) int local19 = arg1 - this.anInt609;
		this.anIntArrayArray6[local8][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	private void method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray6[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	public void method582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt609;
		@Pc(13) int local13 = arg0 - this.anInt603;
		this.anIntArrayArray6[local13][local8] &= 0xFFFBFFFF;
	}
}
