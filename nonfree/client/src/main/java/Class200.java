import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class200 {

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public int anInt5846;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
	public int anInt5851;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg6 == arg4 && arg5 == arg0) {
				return true;
			}
		} else if (arg4 >= arg6 && arg6 + arg3 - 1 >= arg4 && arg5 >= arg5 && arg3 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(53) int local53 = arg4 - this.anInt5838;
		@Pc(58) int local58 = arg0 - this.anInt5851;
		@Pc(71) int local71 = arg6 - this.anInt5838;
		@Pc(76) int local76 = arg5 - this.anInt5851;
		if (arg3 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local53 + 1 == local71 && local76 == local58 && (this.anIntArrayArray23[local71][local58] & 0x80) == 0) {
						return true;
					}
					if (local71 == local53 && local76 - 1 == local58 && (this.anIntArrayArray23[local71][local58] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local71 == local53 - 1 && local76 == local58 && (this.anIntArrayArray23[local71][local58] & 0x8) == 0) {
						return true;
					}
					if (local71 == local53 && local76 - 1 == local58 && (this.anIntArrayArray23[local71][local58] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local53 - 1 == local71 && local76 == local58 && (this.anIntArrayArray23[local71][local58] & 0x8) == 0) {
						return true;
					}
					if (local53 == local71 && local76 + 1 == local58 && (this.anIntArrayArray23[local71][local58] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local53 + 1 == local71 && local58 == local76 && (this.anIntArrayArray23[local71][local58] & 0x80) == 0) {
						return true;
					}
					if (local71 == local53 && local76 + 1 == local58 && (this.anIntArrayArray23[local71][local58] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local71 == local53 && local76 + 1 == local58 && (this.anIntArrayArray23[local71][local58] & 0x20) == 0) {
					return true;
				}
				if (local71 == local53 && local58 == local76 - 1 && (this.anIntArrayArray23[local71][local58] & 0x2) == 0) {
					return true;
				}
				if (local71 == local53 - 1 && local58 == local76 && (this.anIntArrayArray23[local71][local58] & 0x8) == 0) {
					return true;
				}
				if (local53 + 1 == local71 && local76 == local58 && (this.anIntArrayArray23[local71][local58] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(423) int local423 = local71 + arg3 - 1;
			@Pc(429) int local429 = local58 + arg3 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local53 + 1 == local71 && local76 >= local58 && local76 <= local429 && (this.anIntArrayArray23[local71][local76] & 0x80) == 0) {
						return true;
					}
					if (local71 <= local53 && local423 >= local53 && local76 - arg3 == local58 && (this.anIntArrayArray23[local53][local429] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local53 - arg3 == local71 && local58 <= local76 && local429 >= local76 && (this.anIntArrayArray23[local423][local76] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local53 && local423 >= local53 && local58 == local76 - arg3 && (this.anIntArrayArray23[local53][local429] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local53 - arg3 == local71 && local58 <= local76 && local429 >= local76 && (this.anIntArrayArray23[local423][local76] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local53 && local423 >= local53 && local76 + 1 == local58 && (this.anIntArrayArray23[local53][local58] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local53 + 1 == local71 && local76 >= local58 && local429 >= local76 && (this.anIntArrayArray23[local71][local76] & 0x80) == 0) {
						return true;
					}
					if (local71 <= local53 && local53 <= local423 && local76 + 1 == local58 && (this.anIntArrayArray23[local53][local58] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local53 >= local71 && local423 >= local53 && local76 + 1 == local58 && (this.anIntArrayArray23[local53][local58] & 0x20) == 0) {
					return true;
				}
				if (local53 >= local71 && local423 >= local53 && local76 - arg3 == local58 && (this.anIntArrayArray23[local53][local429] & 0x2) == 0) {
					return true;
				}
				if (local71 == local53 - arg3 && local76 >= local58 && local76 <= local429 && (this.anIntArrayArray23[local423][local76] & 0x8) == 0) {
					return true;
				}
				if (local71 == local53 + 1 && local76 >= local58 && local76 <= local429 && (this.anIntArrayArray23[local71][local76] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg3;
		@Pc(14) int local14 = arg2 + arg0;
		@Pc(19) int local19 = arg8 + arg5;
		@Pc(29) int local29 = arg4 + arg6;
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (local19 == arg3 && (arg7 & 0x2) == 0) {
			local46 = arg2 <= arg6 ? arg6 : arg2;
			local53 = local29 <= local14 ? local29 : local14;
			while (local53 > local46) {
				if ((this.anIntArrayArray23[local19 - this.anInt5838 - 1][local46 - this.anInt5851] & 0x8) == 0) {
					return true;
				}
				local46++;
			}
		} else if (arg8 == local9 && (arg7 & 0x8) == 0) {
			local46 = arg2 > arg6 ? arg2 : arg6;
			local53 = local29 > local14 ? local14 : local29;
			while (local46 < local53) {
				if ((this.anIntArrayArray23[arg8 - this.anInt5838][local46 - this.anInt5851] & 0x80) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local29 == arg2 && (arg7 & 0x1) == 0) {
			local46 = arg8 >= arg3 ? arg8 : arg3;
			local53 = local19 > local9 ? local9 : local19;
			while (local53 > local46) {
				if ((this.anIntArrayArray23[local46 - this.anInt5838][local29 - this.anInt5851 - 1] & 0x2) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local14 == arg6 && (arg7 & 0x4) == 0) {
			local46 = arg3 > arg8 ? arg3 : arg8;
			local53 = local19 <= local9 ? local19 : local9;
			while (local46 < local53) {
				if ((this.anIntArrayArray23[local46 - this.anInt5838][arg6 - this.anInt5851] & 0x20) == 0) {
					return true;
				}
				local46++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIIIIZI)V")
	public void method5285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt5838;
		@Pc(13) int local13 = arg1 - this.anInt5851;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method5298(local13, local4, 128);
				this.method5298(local13, local4 - 1, 8);
			}
			if (arg2 == 1) {
				this.method5298(local13, local4, 2);
				this.method5298(local13 + 1, local4, 32);
			}
			if (arg2 == 2) {
				this.method5298(local13, local4, 8);
				this.method5298(local13, local4 + 1, 128);
			}
			if (arg2 == 3) {
				this.method5298(local13, local4, 32);
				this.method5298(local13 - 1, local4, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method5298(local13, local4, 1);
				this.method5298(local13 + 1, local4 + -1, 16);
			}
			if (arg2 == 1) {
				this.method5298(local13, local4, 4);
				this.method5298(local13 + 1, local4 + 1, 64);
			}
			if (arg2 == 2) {
				this.method5298(local13, local4, 16);
				this.method5298(local13 - 1, local4 + 1, 1);
			}
			if (arg2 == 3) {
				this.method5298(local13, local4, 64);
				this.method5298(local13 - 1, local4 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method5298(local13, local4, 130);
				this.method5298(local13, local4 - 1, 8);
				this.method5298(local13 + 1, local4, 32);
			}
			if (arg2 == 1) {
				this.method5298(local13, local4, 10);
				this.method5298(local13 + 1, local4, 32);
				this.method5298(local13, local4 + 1, 128);
			}
			if (arg2 == 2) {
				this.method5298(local13, local4, 40);
				this.method5298(local13, local4 + 1, 128);
				this.method5298(local13 - 1, local4, 2);
			}
			if (arg2 == 3) {
				this.method5298(local13, local4, 160);
				this.method5298(local13 - 1, local4, 2);
				this.method5298(local13, local4 - 1, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method5298(local13, local4, 65536);
					this.method5298(local13, local4 - 1, 4096);
				}
				if (arg2 == 1) {
					this.method5298(local13, local4, 1024);
					this.method5298(local13 + 1, local4, 16384);
				}
				if (arg2 == 2) {
					this.method5298(local13, local4, 4096);
					this.method5298(local13, local4 + 1, 65536);
				}
				if (arg2 == 3) {
					this.method5298(local13, local4, 16384);
					this.method5298(local13 - 1, local4, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method5298(local13, local4, 512);
					this.method5298(local13 + 1, local4 - 1, 8192);
				}
				if (arg2 == 1) {
					this.method5298(local13, local4, 2048);
					this.method5298(local13 + 1, local4 - -1, 32768);
				}
				if (arg2 == 2) {
					this.method5298(local13, local4, 8192);
					this.method5298(local13 - 1, local4 + 1, 512);
				}
				if (arg2 == 3) {
					this.method5298(local13, local4, 32768);
					this.method5298(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method5298(local13, local4, 66560);
					this.method5298(local13, local4 - 1, 4096);
					this.method5298(local13 + 1, local4, 16384);
				}
				if (arg2 == 1) {
					this.method5298(local13, local4, 5120);
					this.method5298(local13 + 1, local4, 16384);
					this.method5298(local13, local4 + 1, 65536);
				}
				if (arg2 == 2) {
					this.method5298(local13, local4, 20480);
					this.method5298(local13, local4 + 1, 65536);
					this.method5298(local13 - 1, local4, 1024);
				}
				if (arg2 == 3) {
					this.method5298(local13, local4, 81920);
					this.method5298(local13 - 1, local4, 1024);
					this.method5298(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method5298(local13, local4, 536870912);
				this.method5298(local13, local4 - 1, 33554432);
			}
			if (arg2 == 1) {
				this.method5298(local13, local4, 8388608);
				this.method5298(local13 + 1, local4, 134217728);
			}
			if (arg2 == 2) {
				this.method5298(local13, local4, 33554432);
				this.method5298(local13, local4 + 1, 536870912);
			}
			if (arg2 == 3) {
				this.method5298(local13, local4, 134217728);
				this.method5298(local13 - 1, local4, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method5298(local13, local4, 4194304);
				this.method5298(local13 + 1, local4 + -1, 67108864);
			}
			if (arg2 == 1) {
				this.method5298(local13, local4, 16777216);
				this.method5298(local13 + 1, local4 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method5298(local13, local4, 67108864);
				this.method5298(local13 - 1, local4 - -1, 4194304);
			}
			if (arg2 == 3) {
				this.method5298(local13, local4, 268435456);
				this.method5298(local13 - 1, local4 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method5298(local13, local4, 545259520);
			this.method5298(local13, local4 - 1, 33554432);
			this.method5298(local13 + 1, local4, 134217728);
		}
		if (arg2 == 1) {
			this.method5298(local13, local4, 41943040);
			this.method5298(local13 + 1, local4, 134217728);
			this.method5298(local13, local4 + 1, 536870912);
		}
		if (arg2 == 2) {
			this.method5298(local13, local4, 167772160);
			this.method5298(local13, local4 + 1, 536870912);
			this.method5298(local13 - 1, local4, 8388608);
		}
		if (arg2 == 3) {
			this.method5298(local13, local4, 671088640);
			this.method5298(local13 - 1, local4, 8388608);
			this.method5298(local13, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	public void method5286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5838;
		@Pc(13) int local13 = arg1 - this.anInt5851;
		this.anIntArrayArray23[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBI)V")
	public void method5287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt5838;
		@Pc(21) int local21 = arg0 - this.anInt5851;
		this.anIntArrayArray23[local12][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIIZIZI)V")
	public void method5288(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt5851;
		@Pc(9) int local9 = arg2 - this.anInt5838;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method5291(local9, 128, local4);
				this.method5291(local9 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method5291(local9, 2, local4);
				this.method5291(local9, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5291(local9, 8, local4);
				this.method5291(local9 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method5291(local9, 32, local4);
				this.method5291(local9, 2, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method5291(local9, 1, local4);
				this.method5291(local9 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5291(local9, 4, local4);
				this.method5291(local9 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5291(local9, 16, local4);
				this.method5291(local9 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5291(local9, 64, local4);
				this.method5291(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method5291(local9, 130, local4);
				this.method5291(local9 - 1, 8, local4);
				this.method5291(local9, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5291(local9, 10, local4);
				this.method5291(local9, 32, local4 + 1);
				this.method5291(local9 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method5291(local9, 40, local4);
				this.method5291(local9 + 1, 128, local4);
				this.method5291(local9, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5291(local9, 160, local4);
				this.method5291(local9, 2, local4 - 1);
				this.method5291(local9 - 1, 8, local4);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method5291(local9, 65536, local4);
					this.method5291(local9 - 1, 4096, local4);
				}
				if (arg1 == 1) {
					this.method5291(local9, 1024, local4);
					this.method5291(local9, 16384, local4 + 1);
				}
				if (arg1 == 2) {
					this.method5291(local9, 4096, local4);
					this.method5291(local9 + 1, 65536, local4);
				}
				if (arg1 == 3) {
					this.method5291(local9, 16384, local4);
					this.method5291(local9, 1024, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method5291(local9, 512, local4);
					this.method5291(local9 - 1, 8192, local4 + 1);
				}
				if (arg1 == 1) {
					this.method5291(local9, 2048, local4);
					this.method5291(local9 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method5291(local9, 8192, local4);
					this.method5291(local9 + 1, 512, local4 - 1);
				}
				if (arg1 == 3) {
					this.method5291(local9, 32768, local4);
					this.method5291(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method5291(local9, 66560, local4);
					this.method5291(local9 - 1, 4096, local4);
					this.method5291(local9, 16384, local4 + 1);
				}
				if (arg1 == 1) {
					this.method5291(local9, 5120, local4);
					this.method5291(local9, 16384, local4 + 1);
					this.method5291(local9 + 1, 65536, local4);
				}
				if (arg1 == 2) {
					this.method5291(local9, 20480, local4);
					this.method5291(local9 + 1, 65536, local4);
					this.method5291(local9, 1024, local4 - 1);
				}
				if (arg1 == 3) {
					this.method5291(local9, 81920, local4);
					this.method5291(local9, 1024, local4 - 1);
					this.method5291(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method5291(local9, 536870912, local4);
				this.method5291(local9 - 1, 33554432, local4);
			}
			if (arg1 == 1) {
				this.method5291(local9, 8388608, local4);
				this.method5291(local9, 134217728, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5291(local9, 33554432, local4);
				this.method5291(local9 + 1, 536870912, local4);
			}
			if (arg1 == 3) {
				this.method5291(local9, 134217728, local4);
				this.method5291(local9, 8388608, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method5291(local9, 4194304, local4);
				this.method5291(local9 - 1, 67108864, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5291(local9, 16777216, local4);
				this.method5291(local9 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5291(local9, 67108864, local4);
				this.method5291(local9 + 1, 4194304, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5291(local9, 268435456, local4);
				this.method5291(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5291(local9, 545259520, local4);
			this.method5291(local9 - 1, 33554432, local4);
			this.method5291(local9, 134217728, local4 + 1);
		}
		if (arg1 == 1) {
			this.method5291(local9, 41943040, local4);
			this.method5291(local9, 134217728, local4 + 1);
			this.method5291(local9 + 1, 536870912, local4);
		}
		if (arg1 == 2) {
			this.method5291(local9, 167772160, local4);
			this.method5291(local9 + 1, 536870912, local4);
			this.method5291(local9, 8388608, local4 - 1);
		}
		if (arg1 == 3) {
			this.method5291(local9, 671088640, local4);
			this.method5291(local9, 8388608, local4 - 1);
			this.method5291(local9 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	public void method5289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5851;
		@Pc(17) int local17 = arg0 - this.anInt5838;
		this.anIntArrayArray23[local17][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V")
	private void method5291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray23[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIZIIZI)V")
	public void method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		if (arg6 == 1 || arg6 == 3) {
			@Pc(31) int local31 = arg4;
			arg4 = arg1;
			arg1 = local31;
		}
		@Pc(40) int local40 = arg3 - this.anInt5851;
		@Pc(45) int local45 = arg0 - this.anInt5838;
		for (@Pc(55) int local55 = local45; local55 < local45 + arg4; local55++) {
			if (local55 >= 0 && this.anInt5841 > local55) {
				for (@Pc(72) int local72 = local40; local72 < arg1 + local40; local72++) {
					if (local72 >= 0 && this.anInt5846 > local72) {
						this.method5291(local55, local7, local72);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)V")
	public void method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5851;
		@Pc(9) int local9 = arg0 - this.anInt5838;
		this.anIntArrayArray23[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZIZIIII)V")
	public void method5295(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 256;
		if (arg2) {
			local15 = 131328;
		}
		@Pc(26) int local26 = arg5 - this.anInt5838;
		if (arg0) {
			local15 |= 0x40000000;
		}
		@Pc(37) int local37 = arg1 - this.anInt5851;
		for (@Pc(39) int local39 = local26; local39 < arg3 + local26; local39++) {
			if (local39 >= 0 && local39 < this.anInt5841) {
				for (@Pc(53) int local53 = local37; local53 < arg4 + local37; local53++) {
					if (local53 >= 0 && local53 < this.anInt5846) {
						this.method5298(local53, local39, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIZIIII)Z")
	public boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static476.method7598(arg6, arg4, arg7, arg2, arg3, arg0, arg1, arg0) ? true : this.method5284(arg0, arg0, arg7, arg1, arg3, arg2, arg4, arg5, arg6);
		}
		@Pc(46) int local46 = arg6 + arg2 - 1;
		@Pc(53) int local53 = arg4 + arg3 - 1;
		if (arg1 >= arg6 && local46 >= arg1 && arg4 <= arg7 && local53 >= arg7) {
			return true;
		} else if (arg6 - 1 == arg1 && arg7 >= arg4 && local53 >= arg7 && (this.anIntArrayArray23[arg1 - this.anInt5838][arg7 - this.anInt5851] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg1 && arg7 >= arg4 && arg7 <= local53 && (this.anIntArrayArray23[arg1 - this.anInt5838][arg7 - this.anInt5851] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg7 && arg6 <= arg1 && local46 >= arg1 && (this.anIntArrayArray23[arg1 - this.anInt5838][arg7 - this.anInt5851] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local53 + 1 == arg7 && arg1 >= arg6 && arg1 <= local46 && (this.anIntArrayArray23[arg1 - this.anInt5838][arg7 - this.anInt5851] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIII)V")
	private void method5298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray23[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public void method5299() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5841; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt5846; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt5841 - 5 <= local15 || this.anInt5846 - 5 <= local19) {
					this.anIntArrayArray23[local15][local19] = -1;
				} else {
					this.anIntArrayArray23[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg5 && arg2 == arg6) {
				return true;
			}
		} else if (arg5 <= arg4 && arg4 <= arg0 + arg5 - 1 && arg2 >= arg2 && arg0 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(56) int local56 = arg4 - this.anInt5838;
		@Pc(61) int local61 = arg5 - this.anInt5838;
		@Pc(66) int local66 = arg2 - this.anInt5851;
		@Pc(71) int local71 = arg6 - this.anInt5851;
		if (arg0 == 1) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local56 - 1 == local61 && local66 == local71) {
						return true;
					}
					if (local61 == local56 && local71 == local66 + 1 && (this.anIntArrayArray23[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 && local71 == local66 - 1 && (this.anIntArrayArray23[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 == local56 && local66 + 1 == local71) {
						return true;
					}
					if (local61 == local56 - 1 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 == local56 + 1 && local71 == local66) {
						return true;
					}
					if (local56 == local61 && local66 + 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 && local66 - 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 == local56 && local66 - 1 == local71) {
						return true;
					}
					if (local56 - 1 == local61 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local61 == local56 - 1 && local66 == local71) {
						return true;
					}
					if (local56 == local61 && local66 + 1 == local71) {
						return true;
					}
					if (local61 == local56 + 1 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local56 && local66 - 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 == local56 - 1 && local66 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local61 && local66 + 1 == local71) {
						return true;
					}
					if (local61 == local56 + 1 && local71 == local66) {
						return true;
					}
					if (local61 == local56 && local71 == local66 - 1 && (this.anIntArrayArray23[local61][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local56 - 1 == local61 && local66 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local61 && local66 + 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local71 == local66) {
						return true;
					}
					if (local61 == local56 && local71 == local66 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local56 - 1 == local61 && local71 == local66) {
						return true;
					}
					if (local61 == local56 && local71 == local66 + 1 && (this.anIntArrayArray23[local61][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local56 && local66 - 1 == local71) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local61 == local56 && local66 + 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x20) == 0) {
					return true;
				}
				if (local56 == local61 && local66 - 1 == local71 && (this.anIntArrayArray23[local61][local71] & 0x2) == 0) {
					return true;
				}
				if (local61 == local56 - 1 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x8) == 0) {
					return true;
				}
				if (local56 + 1 == local61 && local71 == local66 && (this.anIntArrayArray23[local61][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(83) int local83 = local61 + arg0 - 1;
			@Pc(89) int local89 = local71 + arg0 - 1;
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local61 == local56 - arg0 && local66 >= local71 && local89 >= local66) {
						return true;
					}
					if (local61 <= local56 && local83 >= local56 && local66 + 1 == local71 && (this.anIntArrayArray23[local56][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 >= local61 && local83 >= local56 && local66 - arg0 == local71 && (this.anIntArrayArray23[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local56 >= local61 && local56 <= local83 && local71 == local66 + 1) {
						return true;
					}
					if (local56 - arg0 == local61 && local71 <= local66 && local89 >= local66 && (this.anIntArrayArray23[local83][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local66 >= local71 && local66 <= local89 && (this.anIntArrayArray23[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 == local56 + 1 && local66 >= local71 && local66 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local83 && local71 == local66 + 1 && (this.anIntArrayArray23[local56][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 <= local56 && local56 <= local83 && local66 - arg0 == local71 && (this.anIntArrayArray23[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local56 >= local61 && local83 >= local56 && local71 == local66 - arg0) {
						return true;
					}
					if (local56 - arg0 == local61 && local71 <= local66 && local89 >= local66 && (this.anIntArrayArray23[local83][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local66 >= local71 && local66 <= local89 && (this.anIntArrayArray23[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local61 == local56 - arg0 && local66 >= local71 && local66 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local83 && local66 + 1 == local71) {
						return true;
					}
					if (local61 == local56 + 1 && local71 <= local66 && local89 >= local66 && (this.anIntArrayArray23[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 >= local61 && local56 <= local83 && local66 - arg0 == local71 && (this.anIntArrayArray23[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local56 - arg0 == local61 && local71 <= local66 && local66 <= local89 && (this.anIntArrayArray23[local83][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 >= local61 && local83 >= local56 && local71 == local66 + 1) {
						return true;
					}
					if (local56 + 1 == local61 && local71 <= local66 && local89 >= local66) {
						return true;
					}
					if (local61 <= local56 && local83 >= local56 && local66 - arg0 == local71 && (this.anIntArrayArray23[local56][local89] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 == local56 - arg0 && local66 >= local71 && local66 <= local89 && (this.anIntArrayArray23[local83][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local56 && local56 <= local83 && local66 + 1 == local71 && (this.anIntArrayArray23[local56][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 + 1 == local61 && local71 <= local66 && local66 <= local89) {
						return true;
					}
					if (local61 <= local56 && local56 <= local83 && local66 - arg0 == local71) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local56 - arg0 == local61 && local66 >= local71 && local66 <= local89) {
						return true;
					}
					if (local56 >= local61 && local56 <= local83 && local71 == local66 + 1 && (this.anIntArrayArray23[local56][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local56 + 1 && local66 >= local71 && local66 <= local89 && (this.anIntArrayArray23[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 >= local61 && local83 >= local56 && local71 == local66 - arg0) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local56 >= local61 && local83 >= local56 && local71 == local66 + 1 && (this.anIntArrayArray23[local56][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 <= local56 && local56 <= local83 && local71 == local66 - arg0 && (this.anIntArrayArray23[local56][local89] & 0x2C0102) == 0) {
					return true;
				}
				if (local61 == local56 - arg0 && local71 <= local66 && local89 >= local66 && (this.anIntArrayArray23[local83][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local56 + 1 == local61 && local66 >= local71 && local89 >= local66 && (this.anIntArrayArray23[local61][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
