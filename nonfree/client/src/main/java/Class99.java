import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class99 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
	public int anInt2805;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)V")
	public void method2633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt2805;
		@Pc(19) int local19 = arg0 - this.anInt2817;
		this.anIntArrayArray42[local14][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZIIZIB)V")
	public void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt2817;
		@Pc(9) int local9 = arg3 - this.anInt2805;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method2650(local4, local9, 128);
				this.method2650(local4, local9 - 1, 8);
			}
			if (arg5 == 1) {
				this.method2650(local4, local9, 2);
				this.method2650(local4 + 1, local9, 32);
			}
			if (arg5 == 2) {
				this.method2650(local4, local9, 8);
				this.method2650(local4, local9 + 1, 128);
			}
			if (arg5 == 3) {
				this.method2650(local4, local9, 32);
				this.method2650(local4 - 1, local9, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method2650(local4, local9, 1);
				this.method2650(local4 + 1, local9 + -1, 16);
			}
			if (arg5 == 1) {
				this.method2650(local4, local9, 4);
				this.method2650(local4 + 1, local9 - -1, 64);
			}
			if (arg5 == 2) {
				this.method2650(local4, local9, 16);
				this.method2650(local4 - 1, local9 + 1, 1);
			}
			if (arg5 == 3) {
				this.method2650(local4, local9, 64);
				this.method2650(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method2650(local4, local9, 130);
				this.method2650(local4, local9 - 1, 8);
				this.method2650(local4 + 1, local9, 32);
			}
			if (arg5 == 1) {
				this.method2650(local4, local9, 10);
				this.method2650(local4 + 1, local9, 32);
				this.method2650(local4, local9 + 1, 128);
			}
			if (arg5 == 2) {
				this.method2650(local4, local9, 40);
				this.method2650(local4, local9 + 1, 128);
				this.method2650(local4 - 1, local9, 2);
			}
			if (arg5 == 3) {
				this.method2650(local4, local9, 160);
				this.method2650(local4 - 1, local9, 2);
				this.method2650(local4, local9 - 1, 8);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method2650(local4, local9, 65536);
					this.method2650(local4, local9 - 1, 4096);
				}
				if (arg5 == 1) {
					this.method2650(local4, local9, 1024);
					this.method2650(local4 + 1, local9, 16384);
				}
				if (arg5 == 2) {
					this.method2650(local4, local9, 4096);
					this.method2650(local4, local9 + 1, 65536);
				}
				if (arg5 == 3) {
					this.method2650(local4, local9, 16384);
					this.method2650(local4 - 1, local9, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method2650(local4, local9, 512);
					this.method2650(local4 + 1, local9 + -1, 8192);
				}
				if (arg5 == 1) {
					this.method2650(local4, local9, 2048);
					this.method2650(local4 + 1, local9 - -1, 32768);
				}
				if (arg5 == 2) {
					this.method2650(local4, local9, 8192);
					this.method2650(local4 - 1, local9 + 1, 512);
				}
				if (arg5 == 3) {
					this.method2650(local4, local9, 32768);
					this.method2650(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method2650(local4, local9, 66560);
					this.method2650(local4, local9 - 1, 4096);
					this.method2650(local4 + 1, local9, 16384);
				}
				if (arg5 == 1) {
					this.method2650(local4, local9, 5120);
					this.method2650(local4 + 1, local9, 16384);
					this.method2650(local4, local9 + 1, 65536);
				}
				if (arg5 == 2) {
					this.method2650(local4, local9, 20480);
					this.method2650(local4, local9 + 1, 65536);
					this.method2650(local4 - 1, local9, 1024);
				}
				if (arg5 == 3) {
					this.method2650(local4, local9, 81920);
					this.method2650(local4 - 1, local9, 1024);
					this.method2650(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method2650(local4, local9, 536870912);
				this.method2650(local4, local9 - 1, 33554432);
			}
			if (arg5 == 1) {
				this.method2650(local4, local9, 8388608);
				this.method2650(local4 + 1, local9, 134217728);
			}
			if (arg5 == 2) {
				this.method2650(local4, local9, 33554432);
				this.method2650(local4, local9 + 1, 536870912);
			}
			if (arg5 == 3) {
				this.method2650(local4, local9, 134217728);
				this.method2650(local4 - 1, local9, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method2650(local4, local9, 4194304);
				this.method2650(local4 + 1, local9 + -1, 67108864);
			}
			if (arg5 == 1) {
				this.method2650(local4, local9, 16777216);
				this.method2650(local4 + 1, local9 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method2650(local4, local9, 67108864);
				this.method2650(local4 - 1, local9 + 1, 4194304);
			}
			if (arg5 == 3) {
				this.method2650(local4, local9, 268435456);
				this.method2650(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2650(local4, local9, 545259520);
			this.method2650(local4, local9 - 1, 33554432);
			this.method2650(local4 + 1, local9, 134217728);
		}
		if (arg5 == 1) {
			this.method2650(local4, local9, 41943040);
			this.method2650(local4 + 1, local9, 134217728);
			this.method2650(local4, local9 + 1, 536870912);
		}
		if (arg5 == 2) {
			this.method2650(local4, local9, 167772160);
			this.method2650(local4, local9 + 1, 536870912);
			this.method2650(local4 - 1, local9, 8388608);
		}
		if (arg5 == 3) {
			this.method2650(local4, local9, 671088640);
			this.method2650(local4 - 1, local9, 8388608);
			this.method2650(local4, local9 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method2635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg3 == arg2 && arg5 == arg0) {
				return true;
			}
		} else if (arg3 <= arg2 && arg4 + arg3 - 1 >= arg2 && arg5 >= arg5 && arg5 <= arg4 + arg5 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg3 - this.anInt2805;
		@Pc(66) int local66 = arg5 - this.anInt2817;
		@Pc(71) int local71 = arg2 - this.anInt2805;
		@Pc(76) int local76 = arg0 - this.anInt2817;
		if (arg4 == 1) {
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local71 - 1 == local53 && local66 == local76) {
						return true;
					}
					if (local71 == local53 && local76 == local66 + 1 && (this.anIntArrayArray42[local53][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local71 && local66 - 1 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local71 == local53 && local66 + 1 == local76) {
						return true;
					}
					if (local71 - 1 == local53 && local66 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local53 && local76 == local66 && (this.anIntArrayArray42[local53][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local53 == local71 + 1 && local76 == local66) {
						return true;
					}
					if (local71 == local53 && local66 + 1 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local53 && local76 == local66 - 1 && (this.anIntArrayArray42[local53][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 == local53 && local66 - 1 == local76) {
						return true;
					}
					if (local71 - 1 == local53 && local76 == local66 && (this.anIntArrayArray42[local53][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local71 + 1 && local76 == local66 && (this.anIntArrayArray42[local53][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local71 - 1 == local53 && local76 == local66) {
						return true;
					}
					if (local53 == local71 && local66 + 1 == local76) {
						return true;
					}
					if (local53 == local71 + 1 && local66 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local53 && local66 - 1 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local53 == local71 - 1 && local66 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local71 && local76 == local66 + 1) {
						return true;
					}
					if (local71 + 1 == local53 && local66 == local76) {
						return true;
					}
					if (local53 == local71 && local66 - 1 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local53 == local71 - 1 && local66 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local71 && local76 == local66 + 1 && (this.anIntArrayArray42[local53][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local71 + 1 && local66 == local76) {
						return true;
					}
					if (local71 == local53 && local66 - 1 == local76) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local53 == local71 - 1 && local76 == local66) {
						return true;
					}
					if (local71 == local53 && local76 == local66 + 1 && (this.anIntArrayArray42[local53][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local53 && local66 == local76 && (this.anIntArrayArray42[local53][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local53 && local66 - 1 == local76) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local71 == local53 && local66 + 1 == local76 && (this.anIntArrayArray42[local53][local76] & 0x20) == 0) {
					return true;
				}
				if (local71 == local53 && local76 == local66 - 1 && (this.anIntArrayArray42[local53][local76] & 0x2) == 0) {
					return true;
				}
				if (local53 == local71 - 1 && local76 == local66 && (this.anIntArrayArray42[local53][local76] & 0x8) == 0) {
					return true;
				}
				if (local71 + 1 == local53 && local76 == local66 && (this.anIntArrayArray42[local53][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(782) int local782 = arg4 + local53 - 1;
			@Pc(788) int local788 = arg4 + local76 - 1;
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local53 == local71 - arg4 && local66 >= local76 && local788 >= local66) {
						return true;
					}
					if (local53 <= local71 && local782 >= local71 && local66 + 1 == local76 && (this.anIntArrayArray42[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 <= local71 && local71 <= local782 && local66 - arg4 == local76 && (this.anIntArrayArray42[local71][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local71 >= local53 && local782 >= local71 && local66 + 1 == local76) {
						return true;
					}
					if (local53 == local71 - arg4 && local66 >= local76 && local66 <= local788 && (this.anIntArrayArray42[local782][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local53 && local76 <= local66 && local66 <= local788 && (this.anIntArrayArray42[local53][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local71 + 1 == local53 && local66 >= local76 && local66 <= local788) {
						return true;
					}
					if (local53 <= local71 && local782 >= local71 && local66 + 1 == local76 && (this.anIntArrayArray42[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 <= local71 && local71 <= local782 && local76 == local66 - arg4 && (this.anIntArrayArray42[local71][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 >= local53 && local71 <= local782 && local76 == local66 - arg4) {
						return true;
					}
					if (local71 - arg4 == local53 && local66 >= local76 && local788 >= local66 && (this.anIntArrayArray42[local782][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local71 + 1 && local76 <= local66 && local66 <= local788 && (this.anIntArrayArray42[local53][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local53 == local71 - arg4 && local66 >= local76 && local788 >= local66) {
						return true;
					}
					if (local71 >= local53 && local71 <= local782 && local76 == local66 + 1) {
						return true;
					}
					if (local71 + 1 == local53 && local66 >= local76 && local788 >= local66 && (this.anIntArrayArray42[local53][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 <= local71 && local71 <= local782 && local76 == local66 - arg4 && (this.anIntArrayArray42[local71][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local71 - arg4 == local53 && local66 >= local76 && local66 <= local788 && (this.anIntArrayArray42[local782][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 <= local71 && local782 >= local71 && local66 + 1 == local76) {
						return true;
					}
					if (local53 == local71 + 1 && local76 <= local66 && local66 <= local788) {
						return true;
					}
					if (local71 >= local53 && local71 <= local782 && local66 - arg4 == local76 && (this.anIntArrayArray42[local71][local788] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local71 - arg4 == local53 && local76 <= local66 && local66 <= local788 && (this.anIntArrayArray42[local782][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local53 && local782 >= local71 && local76 == local66 + 1 && (this.anIntArrayArray42[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local71 + 1 && local66 >= local76 && local788 >= local66) {
						return true;
					}
					if (local71 >= local53 && local782 >= local71 && local76 == local66 - arg4) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local71 - arg4 == local53 && local66 >= local76 && local788 >= local66) {
						return true;
					}
					if (local71 >= local53 && local782 >= local71 && local76 == local66 + 1 && (this.anIntArrayArray42[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local71 + 1 && local66 >= local76 && local66 <= local788 && (this.anIntArrayArray42[local53][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 >= local53 && local782 >= local71 && local66 - arg4 == local76) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local53 <= local71 && local71 <= local782 && local76 == local66 + 1 && (this.anIntArrayArray42[local71][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local53 <= local71 && local782 >= local71 && local76 == local66 - arg4 && (this.anIntArrayArray42[local71][local788] & 0x2C0102) == 0) {
					return true;
				}
				if (local53 == local71 - arg4 && local76 <= local66 && local788 >= local66 && (this.anIntArrayArray42[local782][local66] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 + 1 == local53 && local66 >= local76 && local66 <= local788 && (this.anIntArrayArray42[local53][local66] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)V")
	public void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 - this.anInt2805;
		@Pc(18) int local18 = arg1 - this.anInt2817;
		this.anIntArrayArray42[local9][local18] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(13) int local13 = arg6 + arg4;
		@Pc(26) int local26 = arg0 + arg3;
		@Pc(30) int local30 = arg8 + arg7;
		@Pc(52) int local52;
		@Pc(63) int local63;
		if (local26 == arg2 && (arg5 & 0x2) == 0) {
			local52 = arg6 > arg8 ? arg6 : arg8;
			local63 = local30 <= local13 ? local30 : local13;
			while (local63 > local52) {
				if ((this.anIntArrayArray42[local26 - this.anInt2805 - 1][local52 - this.anInt2817] & 0x8) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg0 == local9 && (arg5 & 0x8) == 0) {
			local52 = arg8 < arg6 ? arg6 : arg8;
			local63 = local30 > local13 ? local13 : local30;
			while (local52 < local63) {
				if ((this.anIntArrayArray42[arg0 - this.anInt2805][local52 - this.anInt2817] & 0x80) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local30 == arg6 && (arg5 & 0x1) == 0) {
			local52 = arg0 < arg2 ? arg2 : arg0;
			local63 = local9 < local26 ? local9 : local26;
			while (local52 < local63) {
				if ((this.anIntArrayArray42[local52 - this.anInt2805][local30 - this.anInt2817 - 1] & 0x2) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local13 == arg8 && (arg5 & 0x4) == 0) {
			local52 = arg2 <= arg0 ? arg0 : arg2;
			local63 = local9 < local26 ? local9 : local26;
			while (local63 > local52) {
				if ((this.anIntArrayArray42[local52 - this.anInt2805][arg8 - this.anInt2817] & 0x20) == 0) {
					return true;
				}
				local52++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIZZ)V")
	public void method2642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg6) {
			local7 |= 0x40000000;
		}
		@Pc(31) int local31;
		if (arg0 == 1 || arg0 == 3) {
			local31 = arg4;
			arg4 = arg3;
			arg3 = local31;
		}
		@Pc(40) int local40 = arg1 - this.anInt2817;
		@Pc(45) int local45 = arg2 - this.anInt2805;
		for (local31 = local45; local31 < arg4 + local45; local31++) {
			if (local31 >= 0 && this.anInt2795 > local31) {
				for (@Pc(65) int local65 = local40; local65 < local40 + arg3; local65++) {
					if (local65 >= 0 && local65 < this.anInt2809) {
						this.method2650(local65, local31, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)V")
	private void method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray42[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZIIIZII)V")
	public void method2644(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg1 - this.anInt2805;
		@Pc(13) int local13 = arg2 - this.anInt2817;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2643(128, local8, local13);
				this.method2643(8, local8 - 1, local13);
			}
			if (arg5 == 1) {
				this.method2643(2, local8, local13);
				this.method2643(32, local8, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2643(8, local8, local13);
				this.method2643(128, local8 + 1, local13);
			}
			if (arg5 == 3) {
				this.method2643(32, local8, local13);
				this.method2643(2, local8, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2643(1, local8, local13);
				this.method2643(16, local8 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2643(4, local8, local13);
				this.method2643(64, local8 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2643(16, local8, local13);
				this.method2643(1, local8 + 1, local13 + -1);
			}
			if (arg5 == 3) {
				this.method2643(64, local8, local13);
				this.method2643(4, local8 - 1, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method2643(130, local8, local13);
				this.method2643(8, local8 - 1, local13);
				this.method2643(32, local8, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2643(10, local8, local13);
				this.method2643(32, local8, local13 + 1);
				this.method2643(128, local8 + 1, local13);
			}
			if (arg5 == 2) {
				this.method2643(40, local8, local13);
				this.method2643(128, local8 + 1, local13);
				this.method2643(2, local8, local13 - 1);
			}
			if (arg5 == 3) {
				this.method2643(160, local8, local13);
				this.method2643(2, local8, local13 - 1);
				this.method2643(8, local8 - 1, local13);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method2643(65536, local8, local13);
					this.method2643(4096, local8 - 1, local13);
				}
				if (arg5 == 1) {
					this.method2643(1024, local8, local13);
					this.method2643(16384, local8, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2643(4096, local8, local13);
					this.method2643(65536, local8 + 1, local13);
				}
				if (arg5 == 3) {
					this.method2643(16384, local8, local13);
					this.method2643(1024, local8, local13 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method2643(512, local8, local13);
					this.method2643(8192, local8 - 1, local13 - -1);
				}
				if (arg5 == 1) {
					this.method2643(2048, local8, local13);
					this.method2643(32768, local8 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2643(8192, local8, local13);
					this.method2643(512, local8 + 1, local13 - 1);
				}
				if (arg5 == 3) {
					this.method2643(32768, local8, local13);
					this.method2643(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method2643(66560, local8, local13);
					this.method2643(4096, local8 - 1, local13);
					this.method2643(16384, local8, local13 + 1);
				}
				if (arg5 == 1) {
					this.method2643(5120, local8, local13);
					this.method2643(16384, local8, local13 + 1);
					this.method2643(65536, local8 + 1, local13);
				}
				if (arg5 == 2) {
					this.method2643(20480, local8, local13);
					this.method2643(65536, local8 + 1, local13);
					this.method2643(1024, local8, local13 - 1);
				}
				if (arg5 == 3) {
					this.method2643(81920, local8, local13);
					this.method2643(1024, local8, local13 - 1);
					this.method2643(4096, local8 - 1, local13);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2643(536870912, local8, local13);
				this.method2643(33554432, local8 - 1, local13);
			}
			if (arg5 == 1) {
				this.method2643(8388608, local8, local13);
				this.method2643(134217728, local8, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2643(33554432, local8, local13);
				this.method2643(536870912, local8 + 1, local13);
			}
			if (arg5 == 3) {
				this.method2643(134217728, local8, local13);
				this.method2643(8388608, local8, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2643(4194304, local8, local13);
				this.method2643(67108864, local8 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method2643(16777216, local8, local13);
				this.method2643(268435456, local8 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2643(67108864, local8, local13);
				this.method2643(4194304, local8 + 1, local13 - 1);
			}
			if (arg5 == 3) {
				this.method2643(268435456, local8, local13);
				this.method2643(16777216, local8 - 1, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2643(545259520, local8, local13);
			this.method2643(33554432, local8 - 1, local13);
			this.method2643(134217728, local8, local13 + 1);
		}
		if (arg5 == 1) {
			this.method2643(41943040, local8, local13);
			this.method2643(134217728, local8, local13 + 1);
			this.method2643(536870912, local8 + 1, local13);
		}
		if (arg5 == 2) {
			this.method2643(167772160, local8, local13);
			this.method2643(536870912, local8 + 1, local13);
			this.method2643(8388608, local8, local13 - 1);
		}
		if (arg5 == 3) {
			this.method2643(671088640, local8, local13);
			this.method2643(8388608, local8, local13 - 1);
			this.method2643(33554432, local8 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(BII)V")
	public void method2645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt2805;
		@Pc(21) int local21 = arg1 - this.anInt2817;
		this.anIntArrayArray42[local16][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIZIIII)Z")
	public boolean method2647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static112.method2186(arg0, arg6, arg2, arg3, arg7, arg4, arg0, arg1) ? true : this.method2640(arg3, arg0, arg4, arg1, arg0, arg5, arg2, arg6, arg7);
		}
		@Pc(38) int local38 = arg1 + arg3 - 1;
		@Pc(45) int local45 = arg7 + arg6 - 1;
		if (arg3 <= arg4 && local38 >= arg4 && arg2 >= arg7 && local45 >= arg2) {
			return true;
		} else if (arg4 == arg3 - 1 && arg7 <= arg2 && arg2 <= local45 && (this.anIntArrayArray42[arg4 - this.anInt2805][arg2 - this.anInt2817] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg4 == local38 + 1 && arg7 <= arg2 && local45 >= arg2 && (this.anIntArrayArray42[arg4 - this.anInt2805][arg2 - this.anInt2817] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg7 - 1 && arg3 <= arg4 && local38 >= arg4 && (this.anIntArrayArray42[arg4 - this.anInt2805][arg2 - this.anInt2817] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg2 && arg4 >= arg3 && arg4 <= local38 && (this.anIntArrayArray42[arg4 - this.anInt2805][arg2 - this.anInt2817] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public void method2648() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2795; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2809; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt2795 - 5 <= local7 || local11 >= this.anInt2809 - 5) {
					this.anIntArrayArray42[local7][local11] = -1;
				} else {
					this.anIntArrayArray42[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg1 && arg6 == arg4) {
				return true;
			}
		} else if (arg1 >= arg3 && arg1 <= arg5 + arg3 - 1 && arg4 <= arg4 && arg4 + arg5 - 1 >= arg4) {
			return true;
		}
		@Pc(60) int local60 = arg6 - this.anInt2817;
		@Pc(65) int local65 = arg4 - this.anInt2817;
		@Pc(70) int local70 = arg3 - this.anInt2805;
		@Pc(75) int local75 = arg1 - this.anInt2805;
		if (arg5 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local75 + 1 == local70 && local65 == local60 && (this.anIntArrayArray42[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local75 == local70 && local65 - 1 == local60 && (this.anIntArrayArray42[local70][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 - 1 == local70 && local60 == local65 && (this.anIntArrayArray42[local70][local60] & 0x8) == 0) {
						return true;
					}
					if (local75 == local70 && local60 == local65 - 1 && (this.anIntArrayArray42[local70][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local70 == local75 - 1 && local60 == local65 && (this.anIntArrayArray42[local70][local60] & 0x8) == 0) {
						return true;
					}
					if (local75 == local70 && local65 + 1 == local60 && (this.anIntArrayArray42[local70][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local70 == local75 + 1 && local60 == local65 && (this.anIntArrayArray42[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 == local75 && local65 + 1 == local60 && (this.anIntArrayArray42[local70][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local75 == local70 && local60 == local65 + 1 && (this.anIntArrayArray42[local70][local60] & 0x20) == 0) {
					return true;
				}
				if (local70 == local75 && local60 == local65 - 1 && (this.anIntArrayArray42[local70][local60] & 0x2) == 0) {
					return true;
				}
				if (local70 == local75 - 1 && local60 == local65 && (this.anIntArrayArray42[local70][local60] & 0x8) == 0) {
					return true;
				}
				if (local70 == local75 + 1 && local60 == local65 && (this.anIntArrayArray42[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg5 + local70 - 1;
			@Pc(90) int local90 = local60 + arg5 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local75 + 1 == local70 && local65 >= local60 && local65 <= local90 && (this.anIntArrayArray42[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local75 && local84 >= local75 && local65 - arg5 == local60 && (this.anIntArrayArray42[local75][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 - arg5 == local70 && local60 <= local65 && local90 >= local65 && (this.anIntArrayArray42[local84][local65] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local75 && local75 <= local84 && local60 == local65 - arg5 && (this.anIntArrayArray42[local75][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local70 == local75 - arg5 && local60 <= local65 && local90 >= local65 && (this.anIntArrayArray42[local84][local65] & 0x8) == 0) {
						return true;
					}
					if (local75 >= local70 && local84 >= local75 && local65 + 1 == local60 && (this.anIntArrayArray42[local75][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local75 + 1 == local70 && local60 <= local65 && local65 <= local90 && (this.anIntArrayArray42[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local70 && local75 <= local84 && local60 == local65 + 1 && (this.anIntArrayArray42[local75][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local70 <= local75 && local75 <= local84 && local60 == local65 + 1 && (this.anIntArrayArray42[local75][local60] & 0x20) == 0) {
					return true;
				}
				if (local75 >= local70 && local84 >= local75 && local65 - arg5 == local60 && (this.anIntArrayArray42[local75][local90] & 0x2) == 0) {
					return true;
				}
				if (local70 == local75 - arg5 && local65 >= local60 && local65 <= local90 && (this.anIntArrayArray42[local84][local65] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local70 && local65 >= local60 && local65 <= local90 && (this.anIntArrayArray42[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIII)V")
	private void method2650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray42[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZIZIII)V")
	public void method2651(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt2805;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt2817;
		for (@Pc(31) int local31 = local18; local31 < arg0 + local18; local31++) {
			if (local31 >= 0 && local31 < this.anInt2795) {
				for (@Pc(41) int local41 = local29; local41 < local29 + arg2; local41++) {
					if (local41 >= 0 && this.anInt2809 > local41) {
						this.method2643(local7, local31, local41);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(III)V")
	public void method2652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2805;
		@Pc(9) int local9 = arg1 - this.anInt2817;
		this.anIntArrayArray42[local4][local9] |= 0x200000;
	}
}
