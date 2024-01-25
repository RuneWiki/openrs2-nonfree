import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lka")
public final class Class226 {

	@OriginalMember(owner = "client!lka", name = "w", descriptor = "I")
	public int anInt5886;

	@OriginalMember(owner = "client!lka", name = "i", descriptor = "I")
	public int anInt5892;

	@OriginalMember(owner = "client!lka", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!lka", name = "p", descriptor = "I")
	public int anInt5904;

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(BZIZIII)V")
	public void method5269(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt5905;
		@Pc(26) int local26 = arg1 - this.anInt5886;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method5279(local26, local4, 128);
				this.method5279(local26, local4 - 1, 8);
			}
			if (arg3 == 1) {
				this.method5279(local26, local4, 2);
				this.method5279(local26 + 1, local4, 32);
			}
			if (arg3 == 2) {
				this.method5279(local26, local4, 8);
				this.method5279(local26, local4 + 1, 128);
			}
			if (arg3 == 3) {
				this.method5279(local26, local4, 32);
				this.method5279(local26 - 1, local4, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method5279(local26, local4, 1);
				this.method5279(local26 + 1, local4 + -1, 16);
			}
			if (arg3 == 1) {
				this.method5279(local26, local4, 4);
				this.method5279(local26 + 1, local4 + 1, 64);
			}
			if (arg3 == 2) {
				this.method5279(local26, local4, 16);
				this.method5279(local26 - 1, local4 + 1, 1);
			}
			if (arg3 == 3) {
				this.method5279(local26, local4, 64);
				this.method5279(local26 - 1, local4 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method5279(local26, local4, 130);
				this.method5279(local26, local4 - 1, 8);
				this.method5279(local26 + 1, local4, 32);
			}
			if (arg3 == 1) {
				this.method5279(local26, local4, 10);
				this.method5279(local26 + 1, local4, 32);
				this.method5279(local26, local4 + 1, 128);
			}
			if (arg3 == 2) {
				this.method5279(local26, local4, 40);
				this.method5279(local26, local4 + 1, 128);
				this.method5279(local26 - 1, local4, 2);
			}
			if (arg3 == 3) {
				this.method5279(local26, local4, 160);
				this.method5279(local26 - 1, local4, 2);
				this.method5279(local26, local4 - 1, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method5279(local26, local4, 65536);
					this.method5279(local26, local4 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method5279(local26, local4, 1024);
					this.method5279(local26 + 1, local4, 16384);
				}
				if (arg3 == 2) {
					this.method5279(local26, local4, 4096);
					this.method5279(local26, local4 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method5279(local26, local4, 16384);
					this.method5279(local26 - 1, local4, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method5279(local26, local4, 512);
					this.method5279(local26 + 1, local4 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method5279(local26, local4, 2048);
					this.method5279(local26 + 1, local4 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method5279(local26, local4, 8192);
					this.method5279(local26 - 1, local4 + 1, 512);
				}
				if (arg3 == 3) {
					this.method5279(local26, local4, 32768);
					this.method5279(local26 - 1, local4 - 1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method5279(local26, local4, 66560);
					this.method5279(local26, local4 - 1, 4096);
					this.method5279(local26 + 1, local4, 16384);
				}
				if (arg3 == 1) {
					this.method5279(local26, local4, 5120);
					this.method5279(local26 + 1, local4, 16384);
					this.method5279(local26, local4 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method5279(local26, local4, 20480);
					this.method5279(local26, local4 + 1, 65536);
					this.method5279(local26 - 1, local4, 1024);
				}
				if (arg3 == 3) {
					this.method5279(local26, local4, 81920);
					this.method5279(local26 - 1, local4, 1024);
					this.method5279(local26, local4 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method5279(local26, local4, 536870912);
				this.method5279(local26, local4 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method5279(local26, local4, 8388608);
				this.method5279(local26 + 1, local4, 134217728);
			}
			if (arg3 == 2) {
				this.method5279(local26, local4, 33554432);
				this.method5279(local26, local4 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method5279(local26, local4, 134217728);
				this.method5279(local26 - 1, local4, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method5279(local26, local4, 4194304);
				this.method5279(local26 + 1, local4 + -1, 67108864);
			}
			if (arg3 == 1) {
				this.method5279(local26, local4, 16777216);
				this.method5279(local26 + 1, local4 - -1, 268435456);
			}
			if (arg3 == 2) {
				this.method5279(local26, local4, 67108864);
				this.method5279(local26 - 1, local4 - -1, 4194304);
			}
			if (arg3 == 3) {
				this.method5279(local26, local4, 268435456);
				this.method5279(local26 - 1, local4 - 1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method5279(local26, local4, 545259520);
			this.method5279(local26, local4 - 1, 33554432);
			this.method5279(local26 + 1, local4, 134217728);
		}
		if (arg3 == 1) {
			this.method5279(local26, local4, 41943040);
			this.method5279(local26 + 1, local4, 134217728);
			this.method5279(local26, local4 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method5279(local26, local4, 167772160);
			this.method5279(local26, local4 + 1, 536870912);
			this.method5279(local26 - 1, local4, 8388608);
		}
		if (arg3 == 3) {
			this.method5279(local26, local4, 671088640);
			this.method5279(local26 - 1, local4, 8388608);
			this.method5279(local26, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ZIIIIZI)V")
	public void method5270(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt5905;
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt5886;
		for (@Pc(31) int local31 = local18; local31 < arg1 + local18; local31++) {
			if (local31 >= 0 && this.anInt5904 > local31) {
				for (@Pc(52) int local52 = local29; local52 < local29 + arg2; local52++) {
					if (local52 >= 0 && local52 < this.anInt5892) {
						this.method5275(local31, local7, local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = arg1 + arg8;
		@Pc(21) int local21 = arg4 + arg2;
		@Pc(26) int local26 = arg0 + arg7;
		@Pc(30) int local30 = arg5 + arg6;
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (arg1 == local26 && (arg3 & 0x2) == 0) {
			local96 = arg6 >= arg2 ? arg6 : arg2;
			local104 = local30 > local21 ? local21 : local30;
			while (local96 < local104) {
				if ((this.anIntArrayArray41[local26 - this.anInt5905 - 1][local96 - this.anInt5886] & 0x8) == 0) {
					return true;
				}
				local96++;
			}
		} else if (arg0 == local17 && (arg3 & 0x8) == 0) {
			local96 = arg2 > arg6 ? arg2 : arg6;
			local104 = local21 >= local30 ? local30 : local21;
			while (local96 < local104) {
				if ((this.anIntArrayArray41[arg0 - this.anInt5905][local96 - this.anInt5886] & 0x80) == 0) {
					return true;
				}
				local96++;
			}
		} else if (arg2 == local30 && (arg3 & 0x1) == 0) {
			local96 = arg0 < arg1 ? arg1 : arg0;
			local104 = local26 <= local17 ? local26 : local17;
			while (local104 > local96) {
				if ((this.anIntArrayArray41[local96 - this.anInt5905][local30 - this.anInt5886 - 1] & 0x2) == 0) {
					return true;
				}
				local96++;
			}
		} else if (arg6 == local21 && (arg3 & 0x4) == 0) {
			local96 = arg0 >= arg1 ? arg0 : arg1;
			local104 = local26 <= local17 ? local26 : local17;
			while (local104 > local96) {
				if ((this.anIntArrayArray41[local96 - this.anInt5905][arg6 - this.anInt5886] & 0x20) == 0) {
					return true;
				}
				local96++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg3 && arg4 == arg5) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg0 + arg6 - 1 && arg4 >= arg4 && arg0 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(59) int local59 = arg5 - this.anInt5886;
		@Pc(64) int local64 = arg4 - this.anInt5886;
		@Pc(77) int local77 = arg6 - this.anInt5905;
		@Pc(82) int local82 = arg3 - this.anInt5905;
		if (arg0 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local77 == local82 + 1 && local59 == local64 && (this.anIntArrayArray41[local77][local59] & 0x80) == 0) {
						return true;
					}
					if (local77 == local82 && local64 - 1 == local59 && (this.anIntArrayArray41[local77][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local77 == local82 - 1 && local59 == local64 && (this.anIntArrayArray41[local77][local59] & 0x8) == 0) {
						return true;
					}
					if (local82 == local77 && local64 - 1 == local59 && (this.anIntArrayArray41[local77][local59] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local77 == local82 - 1 && local64 == local59 && (this.anIntArrayArray41[local77][local59] & 0x8) == 0) {
						return true;
					}
					if (local77 == local82 && local64 + 1 == local59 && (this.anIntArrayArray41[local77][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local82 + 1 == local77 && local59 == local64 && (this.anIntArrayArray41[local77][local59] & 0x80) == 0) {
						return true;
					}
					if (local82 == local77 && local59 == local64 + 1 && (this.anIntArrayArray41[local77][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local77 == local82 && local59 == local64 + 1 && (this.anIntArrayArray41[local77][local59] & 0x20) == 0) {
					return true;
				}
				if (local82 == local77 && local64 - 1 == local59 && (this.anIntArrayArray41[local77][local59] & 0x2) == 0) {
					return true;
				}
				if (local82 - 1 == local77 && local64 == local59 && (this.anIntArrayArray41[local77][local59] & 0x8) == 0) {
					return true;
				}
				if (local82 + 1 == local77 && local59 == local64 && (this.anIntArrayArray41[local77][local59] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(91) int local91 = arg0 + local77 - 1;
			@Pc(97) int local97 = local59 + arg0 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local77 == local82 + 1 && local64 >= local59 && local97 >= local64 && (this.anIntArrayArray41[local77][local64] & 0x80) == 0) {
						return true;
					}
					if (local82 >= local77 && local82 <= local91 && local64 - arg0 == local59 && (this.anIntArrayArray41[local82][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local82 - arg0 == local77 && local64 >= local59 && local64 <= local97 && (this.anIntArrayArray41[local91][local64] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local82 && local91 >= local82 && local59 == local64 - arg0 && (this.anIntArrayArray41[local82][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local82 - arg0 == local77 && local59 <= local64 && local64 <= local97 && (this.anIntArrayArray41[local91][local64] & 0x8) == 0) {
						return true;
					}
					if (local77 <= local82 && local91 >= local82 && local59 == local64 + 1 && (this.anIntArrayArray41[local82][local59] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local77 == local82 + 1 && local59 <= local64 && local64 <= local97 && (this.anIntArrayArray41[local77][local64] & 0x80) == 0) {
						return true;
					}
					if (local77 <= local82 && local91 >= local82 && local64 + 1 == local59 && (this.anIntArrayArray41[local82][local59] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local77 <= local82 && local82 <= local91 && local64 + 1 == local59 && (this.anIntArrayArray41[local82][local59] & 0x20) == 0) {
					return true;
				}
				if (local77 <= local82 && local82 <= local91 && local59 == local64 - arg0 && (this.anIntArrayArray41[local82][local97] & 0x2) == 0) {
					return true;
				}
				if (local77 == local82 - arg0 && local59 <= local64 && local97 >= local64 && (this.anIntArrayArray41[local91][local64] & 0x8) == 0) {
					return true;
				}
				if (local77 == local82 + 1 && local59 <= local64 && local97 >= local64 && (this.anIntArrayArray41[local77][local64] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ZIIIIIIII)Z")
	public boolean method5273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static397.method5858(arg4, arg0, arg7, arg4, arg3, arg6, arg2, arg5) ? true : this.method5271(arg3, arg7, arg2, arg1, arg4, arg6, arg5, arg0, arg4);
		}
		@Pc(42) int local42 = arg3 + arg0 - 1;
		@Pc(48) int local48 = arg6 + arg5 - 1;
		if (arg3 <= arg7 && local42 >= arg7 && arg5 <= arg2 && local48 >= arg2) {
			return true;
		} else if (arg3 - 1 == arg7 && arg5 <= arg2 && arg2 <= local48 && (this.anIntArrayArray41[arg7 - this.anInt5905][arg2 - this.anInt5886] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg7 == local42 + 1 && arg2 >= arg5 && local48 >= arg2 && (this.anIntArrayArray41[arg7 - this.anInt5905][arg2 - this.anInt5886] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg5 - 1 && arg3 <= arg7 && local42 >= arg7 && (this.anIntArrayArray41[arg7 - this.anInt5905][arg2 - this.anInt5886] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local48 + 1 == arg2 && arg7 >= arg3 && local42 >= arg7 && (this.anIntArrayArray41[arg7 - this.anInt5905][arg2 - this.anInt5886] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIZIZZII)V")
	public void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(25) int local25;
		if (arg3 == 1 || arg3 == 3) {
			local25 = arg1;
			arg1 = arg6;
			arg6 = local25;
		}
		@Pc(34) int local34 = arg0 - this.anInt5886;
		@Pc(39) int local39 = arg5 - this.anInt5905;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (local25 = local39; local25 < local39 + arg1; local25++) {
			if (local25 >= 0 && this.anInt5904 > local25) {
				for (@Pc(65) int local65 = local34; local65 < local34 + arg6; local65++) {
					if (local65 >= 0 && this.anInt5892 > local65) {
						this.method5279(local65, local25, local7);
					}
				}
			}
		}
		if (false) {
			this.method5278(-99, -67);
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIII)V")
	private void method5275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray41[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg5 && arg6 == arg4) {
				return true;
			}
		} else if (arg3 >= arg5 && arg3 <= arg5 + arg1 - 1 && arg6 >= arg6 && arg6 <= arg6 + arg1 - 1) {
			return true;
		}
		@Pc(75) int local75 = arg5 - this.anInt5905;
		@Pc(80) int local80 = arg4 - this.anInt5886;
		@Pc(85) int local85 = arg3 - this.anInt5905;
		@Pc(90) int local90 = arg6 - this.anInt5886;
		if (arg1 == 1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local75 == local85 - 1 && local90 == local80) {
						return true;
					}
					if (local85 == local75 && local90 + 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local85 == local75 && local90 - 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local75 == local85 && local90 + 1 == local80) {
						return true;
					}
					if (local85 - 1 == local75 && local80 == local90 && (this.anIntArrayArray41[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local85 + 1 && local80 == local90 && (this.anIntArrayArray41[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local75 == local85 + 1 && local90 == local80) {
						return true;
					}
					if (local75 == local85 && local80 == local90 + 1 && (this.anIntArrayArray41[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local85 && local90 - 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local85 == local75 && local90 - 1 == local80) {
						return true;
					}
					if (local85 - 1 == local75 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local85 + 1 == local75 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local85 - 1 == local75 && local90 == local80) {
						return true;
					}
					if (local85 == local75 && local80 == local90 + 1) {
						return true;
					}
					if (local75 == local85 + 1 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local85 && local80 == local90 - 1 && (this.anIntArrayArray41[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local85 - 1 == local75 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local85 && local90 + 1 == local80) {
						return true;
					}
					if (local75 == local85 + 1 && local80 == local90) {
						return true;
					}
					if (local75 == local85 && local90 - 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local75 == local85 - 1 && local80 == local90 && (this.anIntArrayArray41[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local85 == local75 && local80 == local90 + 1 && (this.anIntArrayArray41[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local85 + 1 == local75 && local90 == local80) {
						return true;
					}
					if (local85 == local75 && local90 - 1 == local80) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local85 - 1 == local75 && local80 == local90) {
						return true;
					}
					if (local75 == local85 && local90 + 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local85 + 1 == local75 && local80 == local90 && (this.anIntArrayArray41[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local85 == local75 && local80 == local90 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local75 == local85 && local90 + 1 == local80 && (this.anIntArrayArray41[local75][local80] & 0x20) == 0) {
					return true;
				}
				if (local75 == local85 && local80 == local90 - 1 && (this.anIntArrayArray41[local75][local80] & 0x2) == 0) {
					return true;
				}
				if (local85 - 1 == local75 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x8) == 0) {
					return true;
				}
				if (local75 == local85 + 1 && local90 == local80 && (this.anIntArrayArray41[local75][local80] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(976) int local976 = arg1 + local75 - 1;
			@Pc(982) int local982 = local80 + arg1 - 1;
			if (arg2 == 0) {
				if (arg0 == 0) {
					if (local75 == local85 - arg1 && local90 >= local80 && local90 <= local982) {
						return true;
					}
					if (local75 <= local85 && local85 <= local976 && local80 == local90 + 1 && (this.anIntArrayArray41[local85][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local85 >= local75 && local976 >= local85 && local80 == local90 - arg1 && (this.anIntArrayArray41[local85][local982] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local75 <= local85 && local85 <= local976 && local80 == local90 + 1) {
						return true;
					}
					if (local85 - arg1 == local75 && local80 <= local90 && local982 >= local90 && (this.anIntArrayArray41[local976][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local85 + 1 == local75 && local90 >= local80 && local90 <= local982 && (this.anIntArrayArray41[local75][local90] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local85 + 1 == local75 && local90 >= local80 && local90 <= local982) {
						return true;
					}
					if (local85 >= local75 && local976 >= local85 && local90 + 1 == local80 && (this.anIntArrayArray41[local85][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 <= local85 && local976 >= local85 && local80 == local90 - arg1 && (this.anIntArrayArray41[local85][local982] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local85 >= local75 && local85 <= local976 && local80 == local90 - arg1) {
						return true;
					}
					if (local85 - arg1 == local75 && local80 <= local90 && local982 >= local90 && (this.anIntArrayArray41[local976][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local85 + 1 && local90 >= local80 && local982 >= local90 && (this.anIntArrayArray41[local75][local90] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					if (local75 == local85 - arg1 && local80 <= local90 && local90 <= local982) {
						return true;
					}
					if (local85 >= local75 && local85 <= local976 && local90 + 1 == local80) {
						return true;
					}
					if (local75 == local85 + 1 && local80 <= local90 && local982 >= local90 && (this.anIntArrayArray41[local75][local90] & 0x2C0180) == 0) {
						return true;
					}
					if (local85 >= local75 && local85 <= local976 && local90 - arg1 == local80 && (this.anIntArrayArray41[local85][local982] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local75 == local85 - arg1 && local80 <= local90 && local90 <= local982 && (this.anIntArrayArray41[local976][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local85 >= local75 && local85 <= local976 && local90 + 1 == local80) {
						return true;
					}
					if (local75 == local85 + 1 && local80 <= local90 && local982 >= local90) {
						return true;
					}
					if (local75 <= local85 && local976 >= local85 && local90 - arg1 == local80 && (this.anIntArrayArray41[local85][local982] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local85 - arg1 == local75 && local90 >= local80 && local982 >= local90 && (this.anIntArrayArray41[local976][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 <= local85 && local85 <= local976 && local80 == local90 + 1 && (this.anIntArrayArray41[local85][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local85 + 1 && local90 >= local80 && local90 <= local982) {
						return true;
					}
					if (local85 >= local75 && local85 <= local976 && local80 == local90 - arg1) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local85 - arg1 == local75 && local90 >= local80 && local90 <= local982) {
						return true;
					}
					if (local75 <= local85 && local976 >= local85 && local80 == local90 + 1 && (this.anIntArrayArray41[local85][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local85 + 1 == local75 && local80 <= local90 && local90 <= local982 && (this.anIntArrayArray41[local75][local90] & 0x2C0180) == 0) {
						return true;
					}
					if (local85 >= local75 && local85 <= local976 && local90 - arg1 == local80) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local75 <= local85 && local976 >= local85 && local90 + 1 == local80 && (this.anIntArrayArray41[local85][local80] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 <= local85 && local85 <= local976 && local80 == local90 - arg1 && (this.anIntArrayArray41[local85][local982] & 0x2C0102) == 0) {
					return true;
				}
				if (local85 - arg1 == local75 && local80 <= local90 && local982 >= local90 && (this.anIntArrayArray41[local976][local90] & 0x2C0108) == 0) {
					return true;
				}
				if (local85 + 1 == local75 && local90 >= local80 && local982 >= local90 && (this.anIntArrayArray41[local75][local90] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lka", name = "c", descriptor = "(III)V")
	public void method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5886;
		@Pc(13) int local13 = arg1 - this.anInt5905;
		this.anIntArrayArray41[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IZII)V")
	private void method5279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray41[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(B)V")
	public void method5280() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5904; local3++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5892; local24++) {
				if (local3 == 0 || local24 == 0 || this.anInt5904 - 5 <= local3 || this.anInt5892 - 5 <= local24) {
					this.anIntArrayArray41[local3][local24] = -1;
				} else {
					this.anIntArrayArray41[local3][local24] = 2097152;
				}
			}
		}
		Static368.anInt5889++;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(III)V")
	public void method5281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5886;
		@Pc(9) int local9 = arg1 - this.anInt5905;
		this.anIntArrayArray41[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "(III)V")
	public void method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt5886;
		@Pc(13) int local13 = arg0 - this.anInt5905;
		this.anIntArrayArray41[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!lka", name = "d", descriptor = "(III)V")
	public void method5283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5905;
		@Pc(13) int local13 = arg0 - this.anInt5886;
		this.anIntArrayArray41[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIZIBIZ)V")
	public void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt5886;
		@Pc(14) int local14 = arg1 - this.anInt5905;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5275(local14, 128, local4);
				this.method5275(local14 - 1, 8, local4);
			}
			if (arg0 == 1) {
				this.method5275(local14, 2, local4);
				this.method5275(local14, 32, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5275(local14, 8, local4);
				this.method5275(local14 + 1, 128, local4);
			}
			if (arg0 == 3) {
				this.method5275(local14, 32, local4);
				this.method5275(local14, 2, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5275(local14, 1, local4);
				this.method5275(local14 - 1, 16, local4 + 1);
			}
			if (arg0 == 1) {
				this.method5275(local14, 4, local4);
				this.method5275(local14 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5275(local14, 16, local4);
				this.method5275(local14 + 1, 1, local4 - 1);
			}
			if (arg0 == 3) {
				this.method5275(local14, 64, local4);
				this.method5275(local14 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method5275(local14, 130, local4);
				this.method5275(local14 - 1, 8, local4);
				this.method5275(local14, 32, local4 + 1);
			}
			if (arg0 == 1) {
				this.method5275(local14, 10, local4);
				this.method5275(local14, 32, local4 + 1);
				this.method5275(local14 + 1, 128, local4);
			}
			if (arg0 == 2) {
				this.method5275(local14, 40, local4);
				this.method5275(local14 + 1, 128, local4);
				this.method5275(local14, 2, local4 - 1);
			}
			if (arg0 == 3) {
				this.method5275(local14, 160, local4);
				this.method5275(local14, 2, local4 - 1);
				this.method5275(local14 - 1, 8, local4);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method5275(local14, 65536, local4);
					this.method5275(local14 - 1, 4096, local4);
				}
				if (arg0 == 1) {
					this.method5275(local14, 1024, local4);
					this.method5275(local14, 16384, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5275(local14, 4096, local4);
					this.method5275(local14 + 1, 65536, local4);
				}
				if (arg0 == 3) {
					this.method5275(local14, 16384, local4);
					this.method5275(local14, 1024, local4 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method5275(local14, 512, local4);
					this.method5275(local14 - 1, 8192, local4 + 1);
				}
				if (arg0 == 1) {
					this.method5275(local14, 2048, local4);
					this.method5275(local14 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5275(local14, 8192, local4);
					this.method5275(local14 + 1, 512, local4 - 1);
				}
				if (arg0 == 3) {
					this.method5275(local14, 32768, local4);
					this.method5275(local14 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method5275(local14, 66560, local4);
					this.method5275(local14 - 1, 4096, local4);
					this.method5275(local14, 16384, local4 + 1);
				}
				if (arg0 == 1) {
					this.method5275(local14, 5120, local4);
					this.method5275(local14, 16384, local4 + 1);
					this.method5275(local14 + 1, 65536, local4);
				}
				if (arg0 == 2) {
					this.method5275(local14, 20480, local4);
					this.method5275(local14 + 1, 65536, local4);
					this.method5275(local14, 1024, local4 - 1);
				}
				if (arg0 == 3) {
					this.method5275(local14, 81920, local4);
					this.method5275(local14, 1024, local4 - 1);
					this.method5275(local14 - 1, 4096, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5275(local14, 536870912, local4);
				this.method5275(local14 - 1, 33554432, local4);
			}
			if (arg0 == 1) {
				this.method5275(local14, 8388608, local4);
				this.method5275(local14, 134217728, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5275(local14, 33554432, local4);
				this.method5275(local14 + 1, 536870912, local4);
			}
			if (arg0 == 3) {
				this.method5275(local14, 134217728, local4);
				this.method5275(local14, 8388608, local4 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5275(local14, 4194304, local4);
				this.method5275(local14 - 1, 67108864, local4 + 1);
			}
			if (arg0 == 1) {
				this.method5275(local14, 16777216, local4);
				this.method5275(local14 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5275(local14, 67108864, local4);
				this.method5275(local14 + 1, 4194304, local4 - 1);
			}
			if (arg0 == 3) {
				this.method5275(local14, 268435456, local4);
				this.method5275(local14 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5275(local14, 545259520, local4);
			this.method5275(local14 - 1, 33554432, local4);
			this.method5275(local14, 134217728, local4 + 1);
		}
		if (arg0 == 1) {
			this.method5275(local14, 41943040, local4);
			this.method5275(local14, 134217728, local4 + 1);
			this.method5275(local14 + 1, 536870912, local4);
		}
		if (arg0 == 2) {
			this.method5275(local14, 167772160, local4);
			this.method5275(local14 + 1, 536870912, local4);
			this.method5275(local14, 8388608, local4 - 1);
		}
		if (arg0 == 3) {
			this.method5275(local14, 671088640, local4);
			this.method5275(local14, 8388608, local4 - 1);
			this.method5275(local14 - 1, 33554432, local4);
			return;
		}
	}
}
