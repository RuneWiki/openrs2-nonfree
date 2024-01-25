import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class194 {

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public int anInt5584;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt5586;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public int anInt5595;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public int anInt5598;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIIZI)V")
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt5598;
		@Pc(9) int local9 = arg3 - this.anInt5584;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method4814(local4, local9, 128);
				this.method4814(local4 - 1, local9, 8);
			}
			if (arg1 == 1) {
				this.method4814(local4, local9, 2);
				this.method4814(local4, local9 + 1, 32);
			}
			if (arg1 == 2) {
				this.method4814(local4, local9, 8);
				this.method4814(local4 + 1, local9, 128);
			}
			if (arg1 == 3) {
				this.method4814(local4, local9, 32);
				this.method4814(local4, local9 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method4814(local4, local9, 1);
				this.method4814(local4 - 1, local9 + 1, 16);
			}
			if (arg1 == 1) {
				this.method4814(local4, local9, 4);
				this.method4814(local4 + 1, local9 + 1, 64);
			}
			if (arg1 == 2) {
				this.method4814(local4, local9, 16);
				this.method4814(local4 + 1, local9 - 1, 1);
			}
			if (arg1 == 3) {
				this.method4814(local4, local9, 64);
				this.method4814(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method4814(local4, local9, 130);
				this.method4814(local4 - 1, local9, 8);
				this.method4814(local4, local9 + 1, 32);
			}
			if (arg1 == 1) {
				this.method4814(local4, local9, 10);
				this.method4814(local4, local9 + 1, 32);
				this.method4814(local4 + 1, local9, 128);
			}
			if (arg1 == 2) {
				this.method4814(local4, local9, 40);
				this.method4814(local4 + 1, local9, 128);
				this.method4814(local4, local9 - 1, 2);
			}
			if (arg1 == 3) {
				this.method4814(local4, local9, 160);
				this.method4814(local4, local9 - 1, 2);
				this.method4814(local4 - 1, local9, 8);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method4814(local4, local9, 65536);
					this.method4814(local4 - 1, local9, 4096);
				}
				if (arg1 == 1) {
					this.method4814(local4, local9, 1024);
					this.method4814(local4, local9 + 1, 16384);
				}
				if (arg1 == 2) {
					this.method4814(local4, local9, 4096);
					this.method4814(local4 + 1, local9, 65536);
				}
				if (arg1 == 3) {
					this.method4814(local4, local9, 16384);
					this.method4814(local4, local9 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method4814(local4, local9, 512);
					this.method4814(local4 - 1, local9 + 1, 8192);
				}
				if (arg1 == 1) {
					this.method4814(local4, local9, 2048);
					this.method4814(local4 + 1, local9 + 1, 32768);
				}
				if (arg1 == 2) {
					this.method4814(local4, local9, 8192);
					this.method4814(local4 + 1, local9 + -1, 512);
				}
				if (arg1 == 3) {
					this.method4814(local4, local9, 32768);
					this.method4814(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method4814(local4, local9, 66560);
					this.method4814(local4 - 1, local9, 4096);
					this.method4814(local4, local9 + 1, 16384);
				}
				if (arg1 == 1) {
					this.method4814(local4, local9, 5120);
					this.method4814(local4, local9 + 1, 16384);
					this.method4814(local4 + 1, local9, 65536);
				}
				if (arg1 == 2) {
					this.method4814(local4, local9, 20480);
					this.method4814(local4 + 1, local9, 65536);
					this.method4814(local4, local9 - 1, 1024);
				}
				if (arg1 == 3) {
					this.method4814(local4, local9, 81920);
					this.method4814(local4, local9 - 1, 1024);
					this.method4814(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method4814(local4, local9, 536870912);
				this.method4814(local4 - 1, local9, 33554432);
			}
			if (arg1 == 1) {
				this.method4814(local4, local9, 8388608);
				this.method4814(local4, local9 + 1, 134217728);
			}
			if (arg1 == 2) {
				this.method4814(local4, local9, 33554432);
				this.method4814(local4 + 1, local9, 536870912);
			}
			if (arg1 == 3) {
				this.method4814(local4, local9, 134217728);
				this.method4814(local4, local9 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method4814(local4, local9, 4194304);
				this.method4814(local4 - 1, local9 - -1, 67108864);
			}
			if (arg1 == 1) {
				this.method4814(local4, local9, 16777216);
				this.method4814(local4 + 1, local9 + 1, 268435456);
			}
			if (arg1 == 2) {
				this.method4814(local4, local9, 67108864);
				this.method4814(local4 + 1, local9 + -1, 4194304);
			}
			if (arg1 == 3) {
				this.method4814(local4, local9, 268435456);
				this.method4814(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method4814(local4, local9, 545259520);
			this.method4814(local4 - 1, local9, 33554432);
			this.method4814(local4, local9 + 1, 134217728);
		}
		if (arg1 == 1) {
			this.method4814(local4, local9, 41943040);
			this.method4814(local4, local9 + 1, 134217728);
			this.method4814(local4 + 1, local9, 536870912);
		}
		if (arg1 == 2) {
			this.method4814(local4, local9, 167772160);
			this.method4814(local4 + 1, local9, 536870912);
			this.method4814(local4, local9 - 1, 8388608);
		}
		if (arg1 == 3) {
			this.method4814(local4, local9, 671088640);
			this.method4814(local4, local9 - 1, 8388608);
			this.method4814(local4 - 1, local9, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg0 + arg4;
		@Pc(18) int local18 = arg8 + arg7;
		@Pc(22) int local22 = arg2 + arg5;
		@Pc(26) int local26 = arg3 + arg6;
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (arg4 == local22 && (arg1 & 0x2) == 0) {
			local47 = arg7 <= arg6 ? arg6 : arg7;
			local54 = local26 <= local18 ? local26 : local18;
			while (local47 < local54) {
				if ((this.anIntArrayArray40[local22 - this.anInt5598 - 1][local47 - this.anInt5584] & 0x8) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local14 == arg2 && (arg1 & 0x8) == 0) {
			local47 = arg7 <= arg6 ? arg6 : arg7;
			local54 = local18 >= local26 ? local26 : local18;
			while (local47 < local54) {
				if ((this.anIntArrayArray40[arg2 - this.anInt5598][local47 - this.anInt5584] & 0x80) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg7 == local26 && (arg1 & 0x1) == 0) {
			local47 = arg2 >= arg4 ? arg2 : arg4;
			local54 = local22 > local14 ? local14 : local22;
			while (local54 > local47) {
				if ((this.anIntArrayArray40[local47 - this.anInt5598][local26 - this.anInt5584 - 1] & 0x2) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local18 == arg6 && (arg1 & 0x4) == 0) {
			local47 = arg4 <= arg2 ? arg2 : arg4;
			local54 = local22 <= local14 ? local22 : local14;
			while (local54 > local47) {
				if ((this.anIntArrayArray40[local47 - this.anInt5598][arg6 - this.anInt5584] & 0x20) == 0) {
					return true;
				}
				local47++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg6 == arg3 && arg0 == arg5) {
				return true;
			}
		} else if (arg3 <= arg6 && arg6 <= arg1 + arg3 - 1 && arg0 >= arg0 && arg1 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(55) int local55 = arg0 - this.anInt5584;
		@Pc(60) int local60 = arg6 - this.anInt5598;
		@Pc(73) int local73 = arg3 - this.anInt5598;
		@Pc(78) int local78 = arg5 - this.anInt5584;
		if (arg1 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local60 + 1 == local73 && local55 == local78 && (this.anIntArrayArray40[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local60 == local73 && local78 == local55 - 1 && (this.anIntArrayArray40[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local73 == local60 - 1 && local78 == local55 && (this.anIntArrayArray40[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local60 == local73 && local55 - 1 == local78 && (this.anIntArrayArray40[local73][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local73 == local60 - 1 && local78 == local55 && (this.anIntArrayArray40[local73][local78] & 0x8) == 0) {
						return true;
					}
					if (local73 == local60 && local78 == local55 + 1 && (this.anIntArrayArray40[local73][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local73 == local60 + 1 && local78 == local55 && (this.anIntArrayArray40[local73][local78] & 0x80) == 0) {
						return true;
					}
					if (local73 == local60 && local78 == local55 + 1 && (this.anIntArrayArray40[local73][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local60 == local73 && local55 + 1 == local78 && (this.anIntArrayArray40[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 == local60 && local55 - 1 == local78 && (this.anIntArrayArray40[local73][local78] & 0x2) == 0) {
					return true;
				}
				if (local60 - 1 == local73 && local78 == local55 && (this.anIntArrayArray40[local73][local78] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local73 && local78 == local55 && (this.anIntArrayArray40[local73][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(424) int local424 = arg1 + local73 - 1;
			@Pc(430) int local430 = arg1 + local78 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local73 == local60 + 1 && local55 >= local78 && local55 <= local430 && (this.anIntArrayArray40[local73][local55] & 0x80) == 0) {
						return true;
					}
					if (local73 <= local60 && local424 >= local60 && local78 == local55 - arg1 && (this.anIntArrayArray40[local60][local430] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local73 == local60 - arg1 && local78 <= local55 && local55 <= local430 && (this.anIntArrayArray40[local424][local55] & 0x8) == 0) {
						return true;
					}
					if (local73 <= local60 && local60 <= local424 && local55 - arg1 == local78 && (this.anIntArrayArray40[local60][local430] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local73 == local60 - arg1 && local55 >= local78 && local55 <= local430 && (this.anIntArrayArray40[local424][local55] & 0x8) == 0) {
						return true;
					}
					if (local73 <= local60 && local60 <= local424 && local78 == local55 + 1 && (this.anIntArrayArray40[local60][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local60 + 1 == local73 && local55 >= local78 && local55 <= local430 && (this.anIntArrayArray40[local73][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local73 && local424 >= local60 && local78 == local55 + 1 && (this.anIntArrayArray40[local60][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local73 <= local60 && local60 <= local424 && local55 + 1 == local78 && (this.anIntArrayArray40[local60][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 <= local60 && local424 >= local60 && local78 == local55 - arg1 && (this.anIntArrayArray40[local60][local430] & 0x2) == 0) {
					return true;
				}
				if (local73 == local60 - arg1 && local55 >= local78 && local430 >= local55 && (this.anIntArrayArray40[local424][local55] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local73 && local55 >= local78 && local430 >= local55 && (this.anIntArrayArray40[local73][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZIIZ)V")
	public void method4801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(12) int local12 = arg1 - this.anInt5584;
		@Pc(21) int local21 = arg3 - this.anInt5598;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4806(local12, local21, 128);
				this.method4806(local12, local21 - 1, 8);
			}
			if (arg0 == 1) {
				this.method4806(local12, local21, 2);
				this.method4806(local12 + 1, local21, 32);
			}
			if (arg0 == 2) {
				this.method4806(local12, local21, 8);
				this.method4806(local12, local21 + 1, 128);
			}
			if (arg0 == 3) {
				this.method4806(local12, local21, 32);
				this.method4806(local12 - 1, local21, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4806(local12, local21, 1);
				this.method4806(local12 + 1, local21 + -1, 16);
			}
			if (arg0 == 1) {
				this.method4806(local12, local21, 4);
				this.method4806(local12 + 1, local21 - -1, 64);
			}
			if (arg0 == 2) {
				this.method4806(local12, local21, 16);
				this.method4806(local12 - 1, local21 + 1, 1);
			}
			if (arg0 == 3) {
				this.method4806(local12, local21, 64);
				this.method4806(local12 - 1, local21 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method4806(local12, local21, 130);
				this.method4806(local12, local21 - 1, 8);
				this.method4806(local12 + 1, local21, 32);
			}
			if (arg0 == 1) {
				this.method4806(local12, local21, 10);
				this.method4806(local12 + 1, local21, 32);
				this.method4806(local12, local21 + 1, 128);
			}
			if (arg0 == 2) {
				this.method4806(local12, local21, 40);
				this.method4806(local12, local21 + 1, 128);
				this.method4806(local12 - 1, local21, 2);
			}
			if (arg0 == 3) {
				this.method4806(local12, local21, 160);
				this.method4806(local12 - 1, local21, 2);
				this.method4806(local12, local21 - 1, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method4806(local12, local21, 65536);
					this.method4806(local12, local21 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method4806(local12, local21, 1024);
					this.method4806(local12 + 1, local21, 16384);
				}
				if (arg0 == 2) {
					this.method4806(local12, local21, 4096);
					this.method4806(local12, local21 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method4806(local12, local21, 16384);
					this.method4806(local12 - 1, local21, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method4806(local12, local21, 512);
					this.method4806(local12 + 1, local21 - 1, 8192);
				}
				if (arg0 == 1) {
					this.method4806(local12, local21, 2048);
					this.method4806(local12 + 1, local21 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4806(local12, local21, 8192);
					this.method4806(local12 - 1, local21 - -1, 512);
				}
				if (arg0 == 3) {
					this.method4806(local12, local21, 32768);
					this.method4806(local12 - 1, local21 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method4806(local12, local21, 66560);
					this.method4806(local12, local21 - 1, 4096);
					this.method4806(local12 + 1, local21, 16384);
				}
				if (arg0 == 1) {
					this.method4806(local12, local21, 5120);
					this.method4806(local12 + 1, local21, 16384);
					this.method4806(local12, local21 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method4806(local12, local21, 20480);
					this.method4806(local12, local21 + 1, 65536);
					this.method4806(local12 - 1, local21, 1024);
				}
				if (arg0 == 3) {
					this.method4806(local12, local21, 81920);
					this.method4806(local12 - 1, local21, 1024);
					this.method4806(local12, local21 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4806(local12, local21, 536870912);
				this.method4806(local12, local21 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method4806(local12, local21, 8388608);
				this.method4806(local12 + 1, local21, 134217728);
			}
			if (arg0 == 2) {
				this.method4806(local12, local21, 33554432);
				this.method4806(local12, local21 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method4806(local12, local21, 134217728);
				this.method4806(local12 - 1, local21, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4806(local12, local21, 4194304);
				this.method4806(local12 + 1, local21 + -1, 67108864);
			}
			if (arg0 == 1) {
				this.method4806(local12, local21, 16777216);
				this.method4806(local12 + 1, local21 - -1, 268435456);
			}
			if (arg0 == 2) {
				this.method4806(local12, local21, 67108864);
				this.method4806(local12 - 1, local21 - -1, 4194304);
			}
			if (arg0 == 3) {
				this.method4806(local12, local21, 268435456);
				this.method4806(local12 - 1, local21 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4806(local12, local21, 545259520);
			this.method4806(local12, local21 - 1, 33554432);
			this.method4806(local12 + 1, local21, 134217728);
		}
		if (arg0 == 1) {
			this.method4806(local12, local21, 41943040);
			this.method4806(local12 + 1, local21, 134217728);
			this.method4806(local12, local21 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method4806(local12, local21, 167772160);
			this.method4806(local12, local21 + 1, 536870912);
			this.method4806(local12 - 1, local21, 8388608);
		}
		if (arg0 == 3) {
			this.method4806(local12, local21, 671088640);
			this.method4806(local12 - 1, local21, 8388608);
			this.method4806(local12, local21 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public void method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5584;
		@Pc(13) int local13 = arg1 - this.anInt5598;
		this.anIntArrayArray40[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V")
	public void method4803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5598;
		@Pc(13) int local13 = arg0 - this.anInt5584;
		this.anIntArrayArray40[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	private void method4806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray40[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg2 == arg0 && arg1 == arg5) {
				return true;
			}
		} else if (arg0 >= arg2 && arg0 <= arg3 + arg2 - 1 && arg1 <= arg1 && arg1 + arg3 - 1 >= arg1) {
			return true;
		}
		@Pc(59) int local59 = arg0 - this.anInt5598;
		@Pc(64) int local64 = arg5 - this.anInt5584;
		@Pc(69) int local69 = arg1 - this.anInt5584;
		@Pc(74) int local74 = arg2 - this.anInt5598;
		if (arg3 == 1) {
			if (arg4 == 0) {
				if (arg6 == 0) {
					if (local59 - 1 == local74 && local64 == local69) {
						return true;
					}
					if (local74 == local59 && local64 == local69 + 1 && (this.anIntArrayArray40[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 && local64 == local69 - 1 && (this.anIntArrayArray40[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local59 == local74 && local69 + 1 == local64) {
						return true;
					}
					if (local74 == local59 - 1 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local59 + 1 == local74 && local64 == local69) {
						return true;
					}
					if (local59 == local74 && local64 == local69 + 1 && (this.anIntArrayArray40[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local74 && local69 - 1 == local64 && (this.anIntArrayArray40[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 == local74 && local64 == local69 - 1) {
						return true;
					}
					if (local74 == local59 - 1 && local69 == local64 && (this.anIntArrayArray40[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg6 == 0) {
					if (local59 - 1 == local74 && local69 == local64) {
						return true;
					}
					if (local74 == local59 && local64 == local69 + 1) {
						return true;
					}
					if (local74 == local59 + 1 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local59 && local64 == local69 - 1 && (this.anIntArrayArray40[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local59 - 1 == local74 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local59 && local64 == local69 + 1) {
						return true;
					}
					if (local74 == local59 + 1 && local69 == local64) {
						return true;
					}
					if (local59 == local74 && local64 == local69 - 1 && (this.anIntArrayArray40[local74][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local74 == local59 - 1 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local74 && local69 + 1 == local64 && (this.anIntArrayArray40[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local64 == local69) {
						return true;
					}
					if (local59 == local74 && local64 == local69 - 1) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local74 == local59 - 1 && local64 == local69) {
						return true;
					}
					if (local59 == local74 && local69 + 1 == local64 && (this.anIntArrayArray40[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local59 && local69 - 1 == local64) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local59 == local74 && local64 == local69 + 1 && (this.anIntArrayArray40[local74][local64] & 0x20) == 0) {
					return true;
				}
				if (local74 == local59 && local69 - 1 == local64 && (this.anIntArrayArray40[local74][local64] & 0x2) == 0) {
					return true;
				}
				if (local74 == local59 - 1 && local69 == local64 && (this.anIntArrayArray40[local74][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local74 && local64 == local69 && (this.anIntArrayArray40[local74][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(804) int local804 = arg3 + local74 - 1;
			@Pc(810) int local810 = arg3 + local64 - 1;
			if (arg4 == 0) {
				if (arg6 == 0) {
					if (local74 == local59 - arg3 && local69 >= local64 && local810 >= local69) {
						return true;
					}
					if (local59 >= local74 && local59 <= local804 && local69 + 1 == local64 && (this.anIntArrayArray40[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 <= local59 && local804 >= local59 && local64 == local69 - arg3 && (this.anIntArrayArray40[local59][local810] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local59 >= local74 && local804 >= local59 && local64 == local69 + 1) {
						return true;
					}
					if (local74 == local59 - arg3 && local69 >= local64 && local69 <= local810 && (this.anIntArrayArray40[local804][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local64 <= local69 && local69 <= local810 && (this.anIntArrayArray40[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local74 == local59 + 1 && local69 >= local64 && local69 <= local810) {
						return true;
					}
					if (local59 >= local74 && local804 >= local59 && local69 + 1 == local64 && (this.anIntArrayArray40[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local74 && local59 <= local804 && local64 == local69 - arg3 && (this.anIntArrayArray40[local59][local810] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 >= local74 && local804 >= local59 && local64 == local69 - arg3) {
						return true;
					}
					if (local74 == local59 - arg3 && local69 >= local64 && local810 >= local69 && (this.anIntArrayArray40[local804][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 <= local69 && local69 <= local810 && (this.anIntArrayArray40[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg6 == 0) {
					if (local59 - arg3 == local74 && local69 >= local64 && local810 >= local69) {
						return true;
					}
					if (local74 <= local59 && local59 <= local804 && local64 == local69 + 1) {
						return true;
					}
					if (local59 + 1 == local74 && local64 <= local69 && local810 >= local69 && (this.anIntArrayArray40[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 <= local59 && local804 >= local59 && local69 - arg3 == local64 && (this.anIntArrayArray40[local59][local810] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local74 == local59 - arg3 && local69 >= local64 && local810 >= local69 && (this.anIntArrayArray40[local804][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 <= local59 && local804 >= local59 && local69 + 1 == local64) {
						return true;
					}
					if (local59 + 1 == local74 && local64 <= local69 && local810 >= local69) {
						return true;
					}
					if (local59 >= local74 && local59 <= local804 && local64 == local69 - arg3 && (this.anIntArrayArray40[local59][local810] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local59 - arg3 == local74 && local64 <= local69 && local810 >= local69 && (this.anIntArrayArray40[local804][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 <= local59 && local804 >= local59 && local64 == local69 + 1 && (this.anIntArrayArray40[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local74 && local64 <= local69 && local69 <= local810) {
						return true;
					}
					if (local59 >= local74 && local804 >= local59 && local64 == local69 - arg3) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local59 - arg3 == local74 && local69 >= local64 && local810 >= local69) {
						return true;
					}
					if (local59 >= local74 && local804 >= local59 && local69 + 1 == local64 && (this.anIntArrayArray40[local59][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local59 + 1 && local69 >= local64 && local69 <= local810 && (this.anIntArrayArray40[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local74 && local804 >= local59 && local64 == local69 - arg3) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local59 >= local74 && local59 <= local804 && local69 + 1 == local64 && (this.anIntArrayArray40[local59][local64] & 0x2C0120) == 0) {
					return true;
				}
				if (local59 >= local74 && local59 <= local804 && local69 - arg3 == local64 && (this.anIntArrayArray40[local59][local810] & 0x2C0102) == 0) {
					return true;
				}
				if (local59 - arg3 == local74 && local64 <= local69 && local69 <= local810 && (this.anIntArrayArray40[local804][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local74 == local59 + 1 && local64 <= local69 && local69 <= local810 && (this.anIntArrayArray40[local74][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static515.method7172(arg3, arg1, arg6, arg5, arg7, arg3, arg2, arg4) ? true : this.method4799(arg3, arg0, arg7, arg4, arg5, arg6, arg1, arg2, arg3);
		}
		@Pc(38) int local38 = arg6 + arg7 - 1;
		@Pc(44) int local44 = arg4 + arg1 - 1;
		if (arg5 >= arg7 && arg5 <= local38 && arg2 >= arg1 && arg2 <= local44) {
			return true;
		} else if (arg5 == arg7 - 1 && arg2 >= arg1 && arg2 <= local44 && (this.anIntArrayArray40[arg5 - this.anInt5598][arg2 - this.anInt5584] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg5 == local38 + 1 && arg2 >= arg1 && local44 >= arg2 && (this.anIntArrayArray40[arg5 - this.anInt5598][arg2 - this.anInt5584] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg2 && arg5 >= arg7 && arg5 <= local38 && (this.anIntArrayArray40[arg5 - this.anInt5598][arg2 - this.anInt5584] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local44 + 1 && arg5 >= arg7 && arg5 <= local38 && (this.anIntArrayArray40[arg5 - this.anInt5598][arg2 - this.anInt5584] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIZIIII)V")
	public void method4809(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt5584;
		@Pc(23) int local23 = arg2 - this.anInt5598;
		@Pc(33) int local33;
		if (arg1 == 1 || arg1 == 3) {
			local33 = arg6;
			arg6 = arg4;
			arg4 = local33;
		}
		if (arg0) {
			local7 |= 0x40000000;
		}
		for (local33 = local23; local33 < arg6 + local23; local33++) {
			if (local33 >= 0 && this.anInt5586 > local33) {
				for (@Pc(58) int local58 = local18; local58 < local18 + arg4; local58++) {
					if (local58 >= 0 && local58 < this.anInt5595) {
						this.method4806(local58, local33, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIIIZIZ)V")
	public void method4810(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) int local11 = 256;
		if (arg0) {
			local11 = 131328;
		}
		if (arg5) {
			local11 |= 0x40000000;
		}
		@Pc(28) int local28 = arg1 - this.anInt5598;
		@Pc(33) int local33 = arg3 - this.anInt5584;
		for (@Pc(35) int local35 = local28; local35 < local28 + arg2; local35++) {
			if (local35 >= 0 && local35 < this.anInt5586) {
				for (@Pc(45) int local45 = local33; local45 < local33 + arg4; local45++) {
					if (local45 >= 0 && this.anInt5595 > local45) {
						this.method4814(local35, local45, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
	public void method4811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5584;
		@Pc(21) int local21 = arg0 - this.anInt5598;
		this.anIntArrayArray40[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public void method4812() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5586; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt5595; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt5586 - 5 <= local3 || this.anInt5595 - 5 <= local7) {
					this.anIntArrayArray40[local3][local7] = -1;
				} else {
					this.anIntArrayArray40[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
	public void method4813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt5598;
		@Pc(19) int local19 = arg0 - this.anInt5584;
		this.anIntArrayArray40[local14][local19] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BIII)V")
	private void method4814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray40[arg0][arg1] |= arg2;
	}
}
