import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class71 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public int anInt2240;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "I")
	public int anInt2247;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	public void method1931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2230;
		@Pc(13) int local13 = arg0 - this.anInt2240;
		this.anIntArrayArray24[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIIIIIIII)Z")
	public boolean method1932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg2;
		@Pc(26) int local26 = arg8 + arg6;
		@Pc(30) int local30 = arg3 + arg1;
		@Pc(35) int local35 = arg0 + arg5;
		@Pc(66) int local66;
		@Pc(73) int local73;
		if (arg2 == local30 && (arg7 & 0x2) == 0) {
			local66 = arg8 > arg0 ? arg8 : arg0;
			local73 = local35 > local26 ? local26 : local35;
			while (local73 > local66) {
				if ((this.anIntArrayArray24[local30 - this.anInt2230 - 1][local66 - this.anInt2240] & 0x8) == 0) {
					return true;
				}
				local66++;
			}
		} else if (arg1 == local9 && (arg7 & 0x8) == 0) {
			local66 = arg8 <= arg0 ? arg0 : arg8;
			local73 = local26 >= local35 ? local35 : local26;
			while (local73 > local66) {
				if ((this.anIntArrayArray24[arg1 - this.anInt2230][local66 - this.anInt2240] & 0x80) == 0) {
					return true;
				}
				local66++;
			}
		} else if (local35 == arg8 && (arg7 & 0x1) == 0) {
			local66 = arg2 > arg1 ? arg2 : arg1;
			local73 = local9 < local30 ? local9 : local30;
			while (local73 > local66) {
				if ((this.anIntArrayArray24[local66 - this.anInt2230][local35 - this.anInt2240 - 1] & 0x2) == 0) {
					return true;
				}
				local66++;
			}
		} else if (local26 == arg0 && (arg7 & 0x4) == 0) {
			local66 = arg1 >= arg2 ? arg1 : arg2;
			local73 = local9 >= local30 ? local30 : local9;
			while (local66 < local73) {
				if ((this.anIntArrayArray24[local66 - this.anInt2230][arg0 - this.anInt2240] & 0x20) == 0) {
					return true;
				}
				local66++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method1933(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt2240;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt2230;
		for (@Pc(31) int local31 = local29; local31 < arg3 + local29; local31++) {
			if (local31 >= 0 && local31 < this.anInt2247) {
				for (@Pc(55) int local55 = local18; local55 < arg4 + local18; local55++) {
					if (local55 >= 0 && this.anInt2229 > local55) {
						this.method1937(local55, local31, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBZIZII)V")
	public void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg0 == 1 || arg0 == 3) {
			@Pc(23) int local23 = arg3;
			arg3 = arg1;
			arg1 = local23;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(46) int local46 = arg6 - this.anInt2240;
		@Pc(51) int local51 = arg5 - this.anInt2230;
		for (@Pc(53) int local53 = local51; local53 < arg3 + local51; local53++) {
			if (local53 >= 0 && this.anInt2247 > local53) {
				for (@Pc(67) int local67 = local46; local67 < arg1 + local46; local67++) {
					if (local67 >= 0 && this.anInt2229 > local67) {
						this.method1942(local7, local53, local67);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg0 == arg5 && arg6 == arg1) {
				return true;
			}
		} else if (arg5 <= arg0 && arg0 <= arg4 + arg5 - 1 && arg6 <= arg6 && arg6 <= arg4 + arg6 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg5 - this.anInt2230;
		@Pc(60) int local60 = arg1 - this.anInt2240;
		@Pc(65) int local65 = arg0 - this.anInt2230;
		@Pc(70) int local70 = arg6 - this.anInt2240;
		if (arg4 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local65 + 1 == local55 && local70 == local60 && (this.anIntArrayArray24[local55][local60] & 0x80) == 0) {
						return true;
					}
					if (local65 == local55 && local70 - 1 == local60 && (this.anIntArrayArray24[local55][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local55 == local65 - 1 && local70 == local60 && (this.anIntArrayArray24[local55][local60] & 0x8) == 0) {
						return true;
					}
					if (local55 == local65 && local70 - 1 == local60 && (this.anIntArrayArray24[local55][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local65 - 1 == local55 && local70 == local60 && (this.anIntArrayArray24[local55][local60] & 0x8) == 0) {
						return true;
					}
					if (local65 == local55 && local60 == local70 + 1 && (this.anIntArrayArray24[local55][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 + 1 == local55 && local60 == local70 && (this.anIntArrayArray24[local55][local60] & 0x80) == 0) {
						return true;
					}
					if (local65 == local55 && local70 + 1 == local60 && (this.anIntArrayArray24[local55][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local55 == local65 && local60 == local70 + 1 && (this.anIntArrayArray24[local55][local60] & 0x20) == 0) {
					return true;
				}
				if (local55 == local65 && local60 == local70 - 1 && (this.anIntArrayArray24[local55][local60] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local55 && local70 == local60 && (this.anIntArrayArray24[local55][local60] & 0x8) == 0) {
					return true;
				}
				if (local55 == local65 + 1 && local70 == local60 && (this.anIntArrayArray24[local55][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(395) int local395 = arg4 + local55 - 1;
			@Pc(401) int local401 = arg4 + local60 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local55 == local65 + 1 && local60 <= local70 && local401 >= local70 && (this.anIntArrayArray24[local55][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local55 && local395 >= local65 && local60 == local70 - arg4 && (this.anIntArrayArray24[local65][local401] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local55 == local65 - arg4 && local60 <= local70 && local401 >= local70 && (this.anIntArrayArray24[local395][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local55 && local65 <= local395 && local70 - arg4 == local60 && (this.anIntArrayArray24[local65][local401] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local55 == local65 - arg4 && local70 >= local60 && local70 <= local401 && (this.anIntArrayArray24[local395][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local55 && local65 <= local395 && local70 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local65 + 1 == local55 && local70 >= local60 && local401 >= local70 && (this.anIntArrayArray24[local55][local70] & 0x80) == 0) {
						return true;
					}
					if (local55 <= local65 && local395 >= local65 && local70 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 >= local55 && local65 <= local395 && local70 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x20) == 0) {
					return true;
				}
				if (local65 >= local55 && local65 <= local395 && local70 - arg4 == local60 && (this.anIntArrayArray24[local65][local401] & 0x2) == 0) {
					return true;
				}
				if (local55 == local65 - arg4 && local70 >= local60 && local401 >= local70 && (this.anIntArrayArray24[local395][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local55 && local60 <= local70 && local401 >= local70 && (this.anIntArrayArray24[local55][local70] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
	public void method1936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2230;
		@Pc(17) int local17 = arg0 - this.anInt2240;
		this.anIntArrayArray24[local4][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
	private void method1937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray24[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZZIZI)V")
	public void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt2230;
		@Pc(13) int local13 = arg1 - this.anInt2240;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method1937(local13, local4, 128);
				this.method1937(local13, local4 - 1, 8);
			}
			if (arg0 == 1) {
				this.method1937(local13, local4, 2);
				this.method1937(local13 + 1, local4, 32);
			}
			if (arg0 == 2) {
				this.method1937(local13, local4, 8);
				this.method1937(local13, local4 + 1, 128);
			}
			if (arg0 == 3) {
				this.method1937(local13, local4, 32);
				this.method1937(local13 - 1, local4, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method1937(local13, local4, 1);
				this.method1937(local13 + 1, local4 + -1, 16);
			}
			if (arg0 == 1) {
				this.method1937(local13, local4, 4);
				this.method1937(local13 + 1, local4 + 1, 64);
			}
			if (arg0 == 2) {
				this.method1937(local13, local4, 16);
				this.method1937(local13 - 1, local4 + 1, 1);
			}
			if (arg0 == 3) {
				this.method1937(local13, local4, 64);
				this.method1937(local13 - 1, local4 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method1937(local13, local4, 130);
				this.method1937(local13, local4 - 1, 8);
				this.method1937(local13 + 1, local4, 32);
			}
			if (arg0 == 1) {
				this.method1937(local13, local4, 10);
				this.method1937(local13 + 1, local4, 32);
				this.method1937(local13, local4 + 1, 128);
			}
			if (arg0 == 2) {
				this.method1937(local13, local4, 40);
				this.method1937(local13, local4 + 1, 128);
				this.method1937(local13 - 1, local4, 2);
			}
			if (arg0 == 3) {
				this.method1937(local13, local4, 160);
				this.method1937(local13 - 1, local4, 2);
				this.method1937(local13, local4 - 1, 8);
			}
		}
		if (arg2) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method1937(local13, local4, 65536);
					this.method1937(local13, local4 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method1937(local13, local4, 1024);
					this.method1937(local13 + 1, local4, 16384);
				}
				if (arg0 == 2) {
					this.method1937(local13, local4, 4096);
					this.method1937(local13, local4 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method1937(local13, local4, 16384);
					this.method1937(local13 - 1, local4, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method1937(local13, local4, 512);
					this.method1937(local13 + 1, local4 + -1, 8192);
				}
				if (arg0 == 1) {
					this.method1937(local13, local4, 2048);
					this.method1937(local13 + 1, local4 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method1937(local13, local4, 8192);
					this.method1937(local13 - 1, local4 + 1, 512);
				}
				if (arg0 == 3) {
					this.method1937(local13, local4, 32768);
					this.method1937(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method1937(local13, local4, 66560);
					this.method1937(local13, local4 - 1, 4096);
					this.method1937(local13 + 1, local4, 16384);
				}
				if (arg0 == 1) {
					this.method1937(local13, local4, 5120);
					this.method1937(local13 + 1, local4, 16384);
					this.method1937(local13, local4 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method1937(local13, local4, 20480);
					this.method1937(local13, local4 + 1, 65536);
					this.method1937(local13 - 1, local4, 1024);
				}
				if (arg0 == 3) {
					this.method1937(local13, local4, 81920);
					this.method1937(local13 - 1, local4, 1024);
					this.method1937(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method1937(local13, local4, 536870912);
				this.method1937(local13, local4 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method1937(local13, local4, 8388608);
				this.method1937(local13 + 1, local4, 134217728);
			}
			if (arg0 == 2) {
				this.method1937(local13, local4, 33554432);
				this.method1937(local13, local4 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method1937(local13, local4, 134217728);
				this.method1937(local13 - 1, local4, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method1937(local13, local4, 4194304);
				this.method1937(local13 + 1, local4 - 1, 67108864);
			}
			if (arg0 == 1) {
				this.method1937(local13, local4, 16777216);
				this.method1937(local13 + 1, local4 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method1937(local13, local4, 67108864);
				this.method1937(local13 - 1, local4 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method1937(local13, local4, 268435456);
				this.method1937(local13 - 1, local4 - 1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1937(local13, local4, 545259520);
			this.method1937(local13, local4 - 1, 33554432);
			this.method1937(local13 + 1, local4, 134217728);
		}
		if (arg0 == 1) {
			this.method1937(local13, local4, 41943040);
			this.method1937(local13 + 1, local4, 134217728);
			this.method1937(local13, local4 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method1937(local13, local4, 167772160);
			this.method1937(local13, local4 + 1, 536870912);
			this.method1937(local13 - 1, local4, 8388608);
		}
		if (arg0 == 3) {
			this.method1937(local13, local4, 671088640);
			this.method1937(local13 - 1, local4, 8388608);
			this.method1937(local13, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZIZIZ)V")
	public void method1939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt2240;
		@Pc(9) int local9 = arg0 - this.anInt2230;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1942(128, local9, local4);
				this.method1942(8, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method1942(2, local9, local4);
				this.method1942(32, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1942(8, local9, local4);
				this.method1942(128, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method1942(32, local9, local4);
				this.method1942(2, local9, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1942(1, local9, local4);
				this.method1942(16, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1942(4, local9, local4);
				this.method1942(64, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1942(16, local9, local4);
				this.method1942(1, local9 + 1, local4 - 1);
			}
			if (arg4 == 3) {
				this.method1942(64, local9, local4);
				this.method1942(4, local9 - 1, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method1942(130, local9, local4);
				this.method1942(8, local9 - 1, local4);
				this.method1942(32, local9, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1942(10, local9, local4);
				this.method1942(32, local9, local4 + 1);
				this.method1942(128, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method1942(40, local9, local4);
				this.method1942(128, local9 + 1, local4);
				this.method1942(2, local9, local4 - 1);
			}
			if (arg4 == 3) {
				this.method1942(160, local9, local4);
				this.method1942(2, local9, local4 - 1);
				this.method1942(8, local9 - 1, local4);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method1942(65536, local9, local4);
					this.method1942(4096, local9 - 1, local4);
				}
				if (arg4 == 1) {
					this.method1942(1024, local9, local4);
					this.method1942(16384, local9, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1942(4096, local9, local4);
					this.method1942(65536, local9 + 1, local4);
				}
				if (arg4 == 3) {
					this.method1942(16384, local9, local4);
					this.method1942(1024, local9, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method1942(512, local9, local4);
					this.method1942(8192, local9 - 1, local4 + 1);
				}
				if (arg4 == 1) {
					this.method1942(2048, local9, local4);
					this.method1942(32768, local9 + 1, local4 + 1);
				}
				if (arg4 == 2) {
					this.method1942(8192, local9, local4);
					this.method1942(512, local9 + 1, local4 + -1);
				}
				if (arg4 == 3) {
					this.method1942(32768, local9, local4);
					this.method1942(2048, local9 - 1, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method1942(66560, local9, local4);
					this.method1942(4096, local9 - 1, local4);
					this.method1942(16384, local9, local4 + 1);
				}
				if (arg4 == 1) {
					this.method1942(5120, local9, local4);
					this.method1942(16384, local9, local4 + 1);
					this.method1942(65536, local9 + 1, local4);
				}
				if (arg4 == 2) {
					this.method1942(20480, local9, local4);
					this.method1942(65536, local9 + 1, local4);
					this.method1942(1024, local9, local4 - 1);
				}
				if (arg4 == 3) {
					this.method1942(81920, local9, local4);
					this.method1942(1024, local9, local4 - 1);
					this.method1942(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method1942(536870912, local9, local4);
				this.method1942(33554432, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method1942(8388608, local9, local4);
				this.method1942(134217728, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1942(33554432, local9, local4);
				this.method1942(536870912, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method1942(134217728, local9, local4);
				this.method1942(8388608, local9, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method1942(4194304, local9, local4);
				this.method1942(67108864, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method1942(16777216, local9, local4);
				this.method1942(268435456, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method1942(67108864, local9, local4);
				this.method1942(4194304, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method1942(268435456, local9, local4);
				this.method1942(16777216, local9 - 1, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1942(545259520, local9, local4);
			this.method1942(33554432, local9 - 1, local4);
			this.method1942(134217728, local9, local4 + 1);
		}
		if (arg4 == 1) {
			this.method1942(41943040, local9, local4);
			this.method1942(134217728, local9, local4 + 1);
			this.method1942(536870912, local9 + 1, local4);
		}
		if (arg4 == 2) {
			this.method1942(167772160, local9, local4);
			this.method1942(536870912, local9 + 1, local4);
			this.method1942(8388608, local9, local4 - 1);
		}
		if (arg4 == 3) {
			this.method1942(671088640, local9, local4);
			this.method1942(8388608, local9, local4 - 1);
			this.method1942(33554432, local9 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
	public void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2230;
		@Pc(13) int local13 = arg1 - this.anInt2240;
		this.anIntArrayArray24[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IIII)V")
	private void method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray24[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static77.method1749(arg3, arg6, arg2, arg4, arg7, arg5, arg0, arg2) ? true : this.method1932(arg5, arg3, arg6, arg7, arg2, arg4, arg2, arg1, arg0);
		}
		@Pc(43) int local43 = arg7 + arg3 - 1;
		@Pc(49) int local49 = arg5 + arg4 - 1;
		if (arg6 >= arg3 && local43 >= arg6 && arg5 <= arg0 && arg0 <= local49) {
			return true;
		} else if (arg3 - 1 == arg6 && arg0 >= arg5 && local49 >= arg0 && (this.anIntArrayArray24[arg6 - this.anInt2230][arg0 - this.anInt2240] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local43 + 1 == arg6 && arg5 <= arg0 && arg0 <= local49 && (this.anIntArrayArray24[arg6 - this.anInt2230][arg0 - this.anInt2240] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg5 - 1 && arg3 <= arg6 && arg6 <= local43 && (this.anIntArrayArray24[arg6 - this.anInt2230][arg0 - this.anInt2240] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local49 + 1 == arg0 && arg3 <= arg6 && local43 >= arg6 && (this.anIntArrayArray24[arg6 - this.anInt2230][arg0 - this.anInt2240] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public void method1945() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt2247; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2229; local16++) {
				if (local12 == 0 || local16 == 0 || this.anInt2247 - 5 <= local12 || local16 >= this.anInt2229 - 5) {
					this.anIntArrayArray24[local12][local16] = -1;
				} else {
					this.anIntArrayArray24[local12][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)V")
	public void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2230;
		@Pc(21) int local21 = arg1 - this.anInt2240;
		this.anIntArrayArray24[local4][local21] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method1947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg6 == arg0 && arg3 == arg2) {
				return true;
			}
		} else if (arg0 >= arg6 && arg6 + arg4 - 1 >= arg0 && arg3 >= arg3 && arg3 <= arg4 + arg3 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg3 - this.anInt2240;
		@Pc(58) int local58 = arg6 - this.anInt2230;
		@Pc(63) int local63 = arg2 - this.anInt2240;
		@Pc(68) int local68 = arg0 - this.anInt2230;
		if (arg4 == 1) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local68 - 1 == local58 && local53 == local63) {
						return true;
					}
					if (local68 == local58 && local53 + 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local68 && local53 - 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 == local68 && local63 == local53 + 1) {
						return true;
					}
					if (local68 - 1 == local58 && local63 == local53 && (this.anIntArrayArray24[local58][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local63 == local53 && (this.anIntArrayArray24[local58][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local68 + 1 == local58 && local53 == local63) {
						return true;
					}
					if (local68 == local58 && local53 + 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local68 && local53 - 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local68 == local58 && local53 - 1 == local63) {
						return true;
					}
					if (local58 == local68 - 1 && local53 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local63 == local53 && (this.anIntArrayArray24[local58][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local68 - 1 == local58 && local63 == local53) {
						return true;
					}
					if (local58 == local68 && local63 == local53 + 1) {
						return true;
					}
					if (local68 + 1 == local58 && local63 == local53 && (this.anIntArrayArray24[local58][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 == local58 && local53 - 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local58 == local68 - 1 && local63 == local53 && (this.anIntArrayArray24[local58][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local68 && local53 + 1 == local63) {
						return true;
					}
					if (local68 + 1 == local58 && local53 == local63) {
						return true;
					}
					if (local58 == local68 && local53 - 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local68 - 1 == local58 && local53 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local58 && local63 == local53 + 1 && (this.anIntArrayArray24[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local63 == local53) {
						return true;
					}
					if (local68 == local58 && local53 - 1 == local63) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 == local68 - 1 && local53 == local63) {
						return true;
					}
					if (local58 == local68 && local63 == local53 + 1 && (this.anIntArrayArray24[local58][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local53 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local68 && local53 - 1 == local63) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local68 == local58 && local53 + 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local58 && local53 - 1 == local63 && (this.anIntArrayArray24[local58][local63] & 0x2) == 0) {
					return true;
				}
				if (local68 - 1 == local58 && local53 == local63 && (this.anIntArrayArray24[local58][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 + 1 == local58 && local53 == local63 && (this.anIntArrayArray24[local58][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(793) int local793 = local58 + arg4 - 1;
			@Pc(800) int local800 = local63 + arg4 - 1;
			if (arg1 == 0) {
				if (arg5 == 0) {
					if (local58 == local68 - arg4 && local63 <= local53 && local800 >= local53) {
						return true;
					}
					if (local58 <= local68 && local793 >= local68 && local63 == local53 + 1 && (this.anIntArrayArray24[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local793 && local63 == local53 - arg4 && (this.anIntArrayArray24[local68][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local68 >= local58 && local68 <= local793 && local63 == local53 + 1) {
						return true;
					}
					if (local58 == local68 - arg4 && local63 <= local53 && local800 >= local53 && (this.anIntArrayArray24[local793][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local63 <= local53 && local800 >= local53 && (this.anIntArrayArray24[local58][local53] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local68 + 1 == local58 && local63 <= local53 && local53 <= local800) {
						return true;
					}
					if (local58 <= local68 && local793 >= local68 && local63 == local53 + 1 && (this.anIntArrayArray24[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 >= local58 && local68 <= local793 && local53 - arg4 == local63 && (this.anIntArrayArray24[local68][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local58 <= local68 && local793 >= local68 && local63 == local53 - arg4) {
						return true;
					}
					if (local58 == local68 - arg4 && local53 >= local63 && local800 >= local53 && (this.anIntArrayArray24[local793][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local53 >= local63 && local53 <= local800 && (this.anIntArrayArray24[local58][local53] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					if (local58 == local68 - arg4 && local53 >= local63 && local800 >= local53) {
						return true;
					}
					if (local58 <= local68 && local793 >= local68 && local53 + 1 == local63) {
						return true;
					}
					if (local68 + 1 == local58 && local63 <= local53 && local53 <= local800 && (this.anIntArrayArray24[local58][local53] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local793 && local63 == local53 - arg4 && (this.anIntArrayArray24[local68][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local68 - arg4 == local58 && local53 >= local63 && local53 <= local800 && (this.anIntArrayArray24[local793][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 >= local58 && local793 >= local68 && local63 == local53 + 1) {
						return true;
					}
					if (local68 + 1 == local58 && local63 <= local53 && local53 <= local800) {
						return true;
					}
					if (local58 <= local68 && local793 >= local68 && local63 == local53 - arg4 && (this.anIntArrayArray24[local68][local800] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local68 - arg4 == local58 && local53 >= local63 && local53 <= local800 && (this.anIntArrayArray24[local793][local53] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 <= local68 && local68 <= local793 && local63 == local53 + 1 && (this.anIntArrayArray24[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 + 1 == local58 && local63 <= local53 && local800 >= local53) {
						return true;
					}
					if (local58 <= local68 && local793 >= local68 && local53 - arg4 == local63) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local68 - arg4 == local58 && local63 <= local53 && local53 <= local800) {
						return true;
					}
					if (local68 >= local58 && local68 <= local793 && local53 + 1 == local63 && (this.anIntArrayArray24[local68][local63] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local68 + 1 && local63 <= local53 && local800 >= local53 && (this.anIntArrayArray24[local58][local53] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 >= local58 && local68 <= local793 && local53 - arg4 == local63) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local58 <= local68 && local793 >= local68 && local63 == local53 + 1 && (this.anIntArrayArray24[local68][local63] & 0x2C0120) == 0) {
					return true;
				}
				if (local58 <= local68 && local793 >= local68 && local63 == local53 - arg4 && (this.anIntArrayArray24[local68][local800] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 - arg4 == local58 && local63 <= local53 && local800 >= local53 && (this.anIntArrayArray24[local793][local53] & 0x2C0108) == 0) {
					return true;
				}
				if (local68 + 1 == local58 && local63 <= local53 && local53 <= local800 && (this.anIntArrayArray24[local58][local53] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
