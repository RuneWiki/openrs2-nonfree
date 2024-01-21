import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class76 {

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	private final int anInt2979;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "I")
	private final int anInt2989;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	private final int anInt2974;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	private final int anInt2977;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2979 = arg0;
		this.anInt2989 = 0;
		this.anInt2974 = arg1;
		this.anIntArrayArray30 = new int[this.anInt2979][this.anInt2974];
		this.anInt2977 = 0;
		this.method2223();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIB)Z")
	public boolean method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > 1) {
			return this.method2219(arg0, arg3, arg5, arg4, arg2, arg4, arg7, arg1) ? true : this.method2229(arg6, arg4, arg7, arg1, arg5, arg4, arg3, arg2, arg0);
		}
		@Pc(44) int local44 = arg3 + arg1 - 1;
		@Pc(50) int local50 = arg7 + arg0 - 1;
		if (arg1 <= arg2 && local44 >= arg2 && arg5 >= arg0 && arg5 <= local50) {
			return true;
		} else if (arg1 - 1 == arg2 && arg0 <= arg5 && arg5 <= local50 && (this.anIntArrayArray30[arg2 - this.anInt2977][arg5 - this.anInt2989] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg2 == local44 + 1 && arg0 <= arg5 && local50 >= arg5 && (this.anIntArrayArray30[arg2 - this.anInt2977][arg5 - this.anInt2989] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg5 && arg1 <= arg2 && local44 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt2977][arg5 - this.anInt2989] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local50 + 1 && arg1 <= arg2 && local44 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt2977][arg5 - this.anInt2989] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)V")
	public void method2217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt2977;
		@Pc(21) int local21 = arg0 - this.anInt2989;
		this.anIntArrayArray30[local16][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIIII)V")
	public void method2218(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 - this.anInt2989;
		@Pc(8) int local8 = 256;
		@Pc(13) int local13 = arg4 - this.anInt2977;
		if (arg0) {
			local8 = 131328;
		}
		for (@Pc(25) int local25 = local13; local25 < arg3 + local13; local25++) {
			if (local25 >= 0 && local25 < this.anInt2979) {
				for (@Pc(35) int local35 = local6; local35 < local6 + arg2; local35++) {
					if (local35 >= 0 && this.anInt2974 > local35) {
						this.method2221(local25, local8, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method2219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg1 + arg7 && arg3 + arg4 > arg7) {
			return arg0 + arg6 > arg2 && arg2 + arg5 > arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZZIIII)V")
	public void method2220(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg4 - this.anInt2989;
		@Pc(17) int local17 = arg1 - this.anInt2977;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method2227(local12, local17, 128);
				this.method2227(local12, local17 - 1, 8);
			}
			if (arg3 == 1) {
				this.method2227(local12, local17, 2);
				this.method2227(local12 + 1, local17, 32);
			}
			if (arg3 == 2) {
				this.method2227(local12, local17, 8);
				this.method2227(local12, local17 + 1, 128);
			}
			if (arg3 == 3) {
				this.method2227(local12, local17, 32);
				this.method2227(local12 - 1, local17, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method2227(local12, local17, 1);
				this.method2227(local12 + 1, local17 + -1, 16);
			}
			if (arg3 == 1) {
				this.method2227(local12, local17, 4);
				this.method2227(local12 + 1, local17 + 1, 64);
			}
			if (arg3 == 2) {
				this.method2227(local12, local17, 16);
				this.method2227(local12 - 1, local17 + 1, 1);
			}
			if (arg3 == 3) {
				this.method2227(local12, local17, 64);
				this.method2227(local12 - 1, local17 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method2227(local12, local17, 130);
				this.method2227(local12, local17 - 1, 8);
				this.method2227(local12 + 1, local17, 32);
			}
			if (arg3 == 1) {
				this.method2227(local12, local17, 10);
				this.method2227(local12 + 1, local17, 32);
				this.method2227(local12, local17 + 1, 128);
			}
			if (arg3 == 2) {
				this.method2227(local12, local17, 40);
				this.method2227(local12, local17 + 1, 128);
				this.method2227(local12 - 1, local17, 2);
			}
			if (arg3 == 3) {
				this.method2227(local12, local17, 160);
				this.method2227(local12 - 1, local17, 2);
				this.method2227(local12, local17 - 1, 8);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method2227(local12, local17, 65536);
				this.method2227(local12, local17 - 1, 4096);
			}
			if (arg3 == 1) {
				this.method2227(local12, local17, 1024);
				this.method2227(local12 + 1, local17, 16384);
			}
			if (arg3 == 2) {
				this.method2227(local12, local17, 4096);
				this.method2227(local12, local17 + 1, 65536);
			}
			if (arg3 == 3) {
				this.method2227(local12, local17, 16384);
				this.method2227(local12 - 1, local17, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method2227(local12, local17, 512);
				this.method2227(local12 + 1, local17 + -1, 8192);
			}
			if (arg3 == 1) {
				this.method2227(local12, local17, 2048);
				this.method2227(local12 + 1, local17 + 1, 32768);
			}
			if (arg3 == 2) {
				this.method2227(local12, local17, 8192);
				this.method2227(local12 - 1, local17 + 1, 512);
			}
			if (arg3 == 3) {
				this.method2227(local12, local17, 32768);
				this.method2227(local12 - 1, local17 - 1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2227(local12, local17, 66560);
			this.method2227(local12, local17 - 1, 4096);
			this.method2227(local12 + 1, local17, 16384);
		}
		if (arg3 == 1) {
			this.method2227(local12, local17, 5120);
			this.method2227(local12 + 1, local17, 16384);
			this.method2227(local12, local17 + 1, 65536);
		}
		if (arg3 == 2) {
			this.method2227(local12, local17, 20480);
			this.method2227(local12, local17 + 1, 65536);
			this.method2227(local12 - 1, local17, 1024);
		}
		if (arg3 == 3) {
			this.method2227(local12, local17, 81920);
			this.method2227(local12 - 1, local17, 1024);
			this.method2227(local12, local17 - 1, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZI)V")
	private void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	public void method2222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2989;
		@Pc(21) int local21 = arg0 - this.anInt2977;
		this.anIntArrayArray30[local21][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method2223() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2979; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt2974; local17++) {
				if (local13 == 0 || local17 == 0 || this.anInt2979 - 5 <= local13 || local17 >= this.anInt2974 - 5) {
					this.anIntArrayArray30[local13][local17] = 16777215;
				} else {
					this.anIntArrayArray30[local13][local17] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZIII)V")
	public void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - this.anInt2977;
		@Pc(15) int local15 = arg5 - this.anInt2989;
		@Pc(23) int local23 = 256;
		@Pc(33) int local33;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg1;
			arg1 = arg3;
			arg3 = local33;
		}
		if (arg2) {
			local23 = 131328;
		}
		for (local33 = local10; local33 < local10 + arg1; local33++) {
			if (local33 >= 0 && this.anInt2979 > local33) {
				for (@Pc(58) int local58 = local15; local58 < arg3 + local15; local58++) {
					if (local58 >= 0 && local58 < this.anInt2974) {
						this.method2227(local58, local33, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIII)V")
	private void method2227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIIII)Z")
	public boolean method2228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg0 == arg2 && arg1 == arg3) {
				return true;
			}
		} else if (arg0 >= arg2 && arg0 <= arg2 + arg6 - 1 && arg3 >= arg3 && arg3 <= arg3 + arg6 - 1) {
			return true;
		}
		@Pc(51) int local51 = arg0 - this.anInt2977;
		@Pc(56) int local56 = arg3 - this.anInt2989;
		@Pc(61) int local61 = arg2 - this.anInt2977;
		@Pc(66) int local66 = arg1 - this.anInt2989;
		if (arg6 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local61 == local51 + 1 && local66 == local56 && (this.anIntArrayArray30[local61][local66] & 0x80) == 0) {
						return true;
					}
					if (local51 == local61 && local66 == local56 - 1 && (this.anIntArrayArray30[local61][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local61 == local51 - 1 && local66 == local56 && (this.anIntArrayArray30[local61][local66] & 0x8) == 0) {
						return true;
					}
					if (local61 == local51 && local66 == local56 - 1 && (this.anIntArrayArray30[local61][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local51 - 1 == local61 && local56 == local66 && (this.anIntArrayArray30[local61][local66] & 0x8) == 0) {
						return true;
					}
					if (local51 == local61 && local56 + 1 == local66 && (this.anIntArrayArray30[local61][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local51 + 1 == local61 && local66 == local56 && (this.anIntArrayArray30[local61][local66] & 0x80) == 0) {
						return true;
					}
					if (local51 == local61 && local66 == local56 + 1 && (this.anIntArrayArray30[local61][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local51 == local61 && local66 == local56 + 1 && (this.anIntArrayArray30[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local51 == local61 && local56 - 1 == local66 && (this.anIntArrayArray30[local61][local66] & 0x2) == 0) {
					return true;
				}
				if (local61 == local51 - 1 && local66 == local56 && (this.anIntArrayArray30[local61][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 == local51 + 1 && local66 == local56 && (this.anIntArrayArray30[local61][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(421) int local421 = arg6 + local61 - 1;
			@Pc(428) int local428 = local66 + arg6 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local51 + 1 == local61 && local56 >= local66 && local56 <= local428 && (this.anIntArrayArray30[local61][local56] & 0x80) == 0) {
						return true;
					}
					if (local51 >= local61 && local51 <= local421 && local56 - arg6 == local66 && (this.anIntArrayArray30[local51][local428] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local51 - arg6 == local61 && local56 >= local66 && local428 >= local56 && (this.anIntArrayArray30[local421][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 <= local51 && local421 >= local51 && local56 - arg6 == local66 && (this.anIntArrayArray30[local51][local428] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local61 == local51 - arg6 && local66 <= local56 && local56 <= local428 && (this.anIntArrayArray30[local421][local56] & 0x8) == 0) {
						return true;
					}
					if (local61 <= local51 && local421 >= local51 && local56 + 1 == local66 && (this.anIntArrayArray30[local51][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local51 + 1 == local61 && local66 <= local56 && local56 <= local428 && (this.anIntArrayArray30[local61][local56] & 0x80) == 0) {
						return true;
					}
					if (local51 >= local61 && local51 <= local421 && local56 + 1 == local66 && (this.anIntArrayArray30[local51][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local61 <= local51 && local51 <= local421 && local56 + 1 == local66 && (this.anIntArrayArray30[local51][local66] & 0x20) == 0) {
					return true;
				}
				if (local61 <= local51 && local51 <= local421 && local66 == local56 - arg6 && (this.anIntArrayArray30[local51][local428] & 0x2) == 0) {
					return true;
				}
				if (local61 == local51 - arg6 && local56 >= local66 && local56 <= local428 && (this.anIntArrayArray30[local421][local56] & 0x8) == 0) {
					return true;
				}
				if (local51 + 1 == local61 && local66 <= local56 && local428 >= local56 && (this.anIntArrayArray30[local61][local56] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg1;
		@Pc(13) int local13 = arg7 + arg5;
		@Pc(17) int local17 = arg6 + arg3;
		@Pc(21) int local21 = arg2 + arg8;
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg3 <= arg7 && arg7 < local17) {
			if (arg8 == local9 && (arg0 & 0x4) == 0) {
				local36 = arg7;
				local43 = local17 < local13 ? local17 : local13;
				while (local43 > local36) {
					if ((this.anIntArrayArray30[local36 - this.anInt2977][local9 - this.anInt2989 - 1] & 0x2) == 0) {
						return true;
					}
					local36++;
				}
			} else if (local21 == arg4 && (arg0 & 0x1) == 0) {
				local36 = arg7;
				local43 = local13 <= local17 ? local13 : local17;
				while (local36 < local43) {
					if ((this.anIntArrayArray30[local36 - this.anInt2977][arg4 - this.anInt2989] & 0x20) == 0) {
						return true;
					}
					local36++;
				}
			}
		} else if (arg3 < local13 && local17 >= local13) {
			if (local9 == arg8 && (arg0 & 0x4) == 0) {
				for (local36 = arg3; local36 < local13; local36++) {
					if ((this.anIntArrayArray30[local36 - this.anInt2977][local9 - this.anInt2989 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (local21 == arg4 && (arg0 & 0x1) == 0) {
				for (local36 = arg3; local36 < local13; local36++) {
					if ((this.anIntArrayArray30[local36 - this.anInt2977][arg4 - this.anInt2989] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg4 >= arg8 && arg4 < local21) {
			if (arg3 == local13 && (arg0 & 0x8) == 0) {
				local36 = arg4;
				local43 = local9 > local21 ? local21 : local9;
				while (local43 > local36) {
					if ((this.anIntArrayArray30[local13 - this.anInt2977 - 1][local36 - this.anInt2989] & 0x8) == 0) {
						return true;
					}
					local36++;
				}
			} else if (arg7 == local17 && (arg0 & 0x2) == 0) {
				local36 = arg4;
				local43 = local9 <= local21 ? local9 : local21;
				while (local36 < local43) {
					if ((this.anIntArrayArray30[arg7 - this.anInt2977][local36 - this.anInt2989] & 0x80) == 0) {
						return true;
					}
					local36++;
				}
			}
		} else if (local9 > arg8 && local21 >= local9) {
			if (local13 == arg3 && (arg0 & 0x8) == 0) {
				for (local36 = arg8; local36 < local9; local36++) {
					if ((this.anIntArrayArray30[local13 - this.anInt2977 - 1][local36 - this.anInt2989] & 0x8) == 0) {
						return true;
					}
				}
			} else if (arg7 == local17 && (arg0 & 0x2) == 0) {
				for (local36 = arg8; local36 < local9; local36++) {
					if ((this.anIntArrayArray30[arg7 - this.anInt2977][local36 - this.anInt2989] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg2 && arg6 == arg3) {
				return true;
			}
		} else if (arg2 >= arg5 && arg2 <= arg4 + arg5 - 1 && arg6 >= arg6 && arg6 <= arg6 + arg4 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg3 - this.anInt2989;
		@Pc(66) int local66 = arg2 - this.anInt2977;
		@Pc(71) int local71 = arg6 - this.anInt2989;
		@Pc(76) int local76 = arg5 - this.anInt2977;
		if (arg4 == 1) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local76 == local66 - 1 && local71 == local61) {
						return true;
					}
					if (local66 == local76 && local71 + 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local76 == local66 && local71 - 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local76 == local66 && local71 + 1 == local61) {
						return true;
					}
					if (local76 == local66 - 1 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x12C0108) == 0) {
						return true;
					}
					if (local76 == local66 + 1 && local71 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 + 1 == local76 && local71 == local61) {
						return true;
					}
					if (local66 == local76 && local71 + 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local76 == local66 && local61 == local71 - 1 && (this.anIntArrayArray30[local76][local61] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local76 == local66 && local71 - 1 == local61) {
						return true;
					}
					if (local76 == local66 - 1 && local71 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0108) == 0) {
						return true;
					}
					if (local76 == local66 + 1 && local71 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local66 - 1 == local76 && local61 == local71) {
						return true;
					}
					if (local66 == local76 && local61 == local71 + 1) {
						return true;
					}
					if (local76 == local66 + 1 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x12C0180) == 0) {
						return true;
					}
					if (local76 == local66 && local71 - 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local76 == local66 - 1 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x12C0108) == 0) {
						return true;
					}
					if (local76 == local66 && local61 == local71 + 1) {
						return true;
					}
					if (local66 + 1 == local76 && local61 == local71) {
						return true;
					}
					if (local76 == local66 && local71 - 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 - 1 == local76 && local71 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0108) == 0) {
						return true;
					}
					if (local66 == local76 && local71 + 1 == local61 && (this.anIntArrayArray30[local76][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local76 && local61 == local71) {
						return true;
					}
					if (local76 == local66 && local61 == local71 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 - 1 == local76 && local61 == local71) {
						return true;
					}
					if (local66 == local76 && local61 == local71 + 1 && (this.anIntArrayArray30[local76][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local76 == local66 + 1 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x12C0180) == 0) {
						return true;
					}
					if (local66 == local76 && local71 - 1 == local61) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local76 == local66 && local61 == local71 + 1 && (this.anIntArrayArray30[local76][local61] & 0x20) == 0) {
					return true;
				}
				if (local76 == local66 && local61 == local71 - 1 && (this.anIntArrayArray30[local76][local61] & 0x2) == 0) {
					return true;
				}
				if (local76 == local66 - 1 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local76 && local61 == local71 && (this.anIntArrayArray30[local76][local61] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(809) int local809 = local76 + arg4 - 1;
			@Pc(816) int local816 = local61 + arg4 - 1;
			if (arg0 == 0) {
				if (arg1 == 0) {
					if (local66 - arg4 == local76 && local71 >= local61 && local71 <= local816) {
						return true;
					}
					if (local66 >= local76 && local809 >= local66 && local61 == local71 + 1 && (this.anIntArrayArray30[local66][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local66 >= local76 && local809 >= local66 && local71 - arg4 == local61 && (this.anIntArrayArray30[local66][local816] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 >= local76 && local809 >= local66 && local71 + 1 == local61) {
						return true;
					}
					if (local76 == local66 - arg4 && local71 >= local61 && local816 >= local71 && (this.anIntArrayArray30[local809][local71] & 0x12C0108) == 0) {
						return true;
					}
					if (local76 == local66 + 1 && local71 >= local61 && local816 >= local71 && (this.anIntArrayArray30[local76][local71] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local76 == local66 + 1 && local61 <= local71 && local71 <= local816) {
						return true;
					}
					if (local76 <= local66 && local809 >= local66 && local71 + 1 == local61 && (this.anIntArrayArray30[local66][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local66 >= local76 && local66 <= local809 && local71 - arg4 == local61 && (this.anIntArrayArray30[local66][local816] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local76 <= local66 && local66 <= local809 && local61 == local71 - arg4) {
						return true;
					}
					if (local66 - arg4 == local76 && local61 <= local71 && local71 <= local816 && (this.anIntArrayArray30[local809][local71] & 0x12C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local76 && local61 <= local71 && local816 >= local71 && (this.anIntArrayArray30[local76][local71] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					if (local66 - arg4 == local76 && local61 <= local71 && local71 <= local816) {
						return true;
					}
					if (local76 <= local66 && local66 <= local809 && local61 == local71 + 1) {
						return true;
					}
					if (local76 == local66 + 1 && local61 <= local71 && local71 <= local816 && (this.anIntArrayArray30[local76][local71] & 0x12C0180) == 0) {
						return true;
					}
					if (local76 <= local66 && local809 >= local66 && local71 - arg4 == local61 && (this.anIntArrayArray30[local66][local816] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 - arg4 == local76 && local71 >= local61 && local71 <= local816 && (this.anIntArrayArray30[local809][local71] & 0x12C0108) == 0) {
						return true;
					}
					if (local66 >= local76 && local809 >= local66 && local61 == local71 + 1) {
						return true;
					}
					if (local66 + 1 == local76 && local61 <= local71 && local71 <= local816) {
						return true;
					}
					if (local66 >= local76 && local809 >= local66 && local71 - arg4 == local61 && (this.anIntArrayArray30[local66][local816] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local76 == local66 - arg4 && local61 <= local71 && local816 >= local71 && (this.anIntArrayArray30[local809][local71] & 0x12C0108) == 0) {
						return true;
					}
					if (local66 >= local76 && local66 <= local809 && local71 + 1 == local61 && (this.anIntArrayArray30[local66][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local76 && local71 >= local61 && local816 >= local71) {
						return true;
					}
					if (local76 <= local66 && local66 <= local809 && local61 == local71 - arg4) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 - arg4 == local76 && local71 >= local61 && local71 <= local816) {
						return true;
					}
					if (local76 <= local66 && local809 >= local66 && local61 == local71 + 1 && (this.anIntArrayArray30[local66][local61] & 0x12C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local76 && local71 >= local61 && local816 >= local71 && (this.anIntArrayArray30[local76][local71] & 0x12C0180) == 0) {
						return true;
					}
					if (local66 >= local76 && local66 <= local809 && local61 == local71 - arg4) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local66 >= local76 && local66 <= local809 && local61 == local71 + 1 && (this.anIntArrayArray30[local66][local61] & 0x12C0120) == 0) {
					return true;
				}
				if (local66 >= local76 && local809 >= local66 && local61 == local71 - arg4 && (this.anIntArrayArray30[local66][local816] & 0x12C0102) == 0) {
					return true;
				}
				if (local66 - arg4 == local76 && local71 >= local61 && local816 >= local71 && (this.anIntArrayArray30[local809][local71] & 0x12C0108) == 0) {
					return true;
				}
				if (local76 == local66 + 1 && local71 >= local61 && local816 >= local71 && (this.anIntArrayArray30[local76][local71] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
	public void method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2989;
		@Pc(19) int local19 = arg0 - this.anInt2977;
		this.anIntArrayArray30[local19][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(ZIIIII)V")
	public void method2234(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt2977;
		@Pc(13) int local13 = arg1 - this.anInt2989;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2221(local8, 128, local13);
				this.method2221(local8 - 1, 8, local13);
			}
			if (arg2 == 1) {
				this.method2221(local8, 2, local13);
				this.method2221(local8, 32, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2221(local8, 8, local13);
				this.method2221(local8 + 1, 128, local13);
			}
			if (arg2 == 3) {
				this.method2221(local8, 32, local13);
				this.method2221(local8, 2, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2221(local8, 1, local13);
				this.method2221(local8 - 1, 16, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2221(local8, 4, local13);
				this.method2221(local8 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2221(local8, 16, local13);
				this.method2221(local8 + 1, 1, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2221(local8, 64, local13);
				this.method2221(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method2221(local8, 130, local13);
				this.method2221(local8 - 1, 8, local13);
				this.method2221(local8, 32, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2221(local8, 10, local13);
				this.method2221(local8, 32, local13 + 1);
				this.method2221(local8 + 1, 128, local13);
			}
			if (arg2 == 2) {
				this.method2221(local8, 40, local13);
				this.method2221(local8 + 1, 128, local13);
				this.method2221(local8, 2, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2221(local8, 160, local13);
				this.method2221(local8, 2, local13 - 1);
				this.method2221(local8 - 1, 8, local13);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method2221(local8, 65536, local13);
				this.method2221(local8 - 1, 4096, local13);
			}
			if (arg2 == 1) {
				this.method2221(local8, 1024, local13);
				this.method2221(local8, 16384, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2221(local8, 4096, local13);
				this.method2221(local8 + 1, 65536, local13);
			}
			if (arg2 == 3) {
				this.method2221(local8, 16384, local13);
				this.method2221(local8, 1024, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method2221(local8, 512, local13);
				this.method2221(local8 - 1, 8192, local13 + 1);
			}
			if (arg2 == 1) {
				this.method2221(local8, 2048, local13);
				this.method2221(local8 + 1, 32768, local13 + 1);
			}
			if (arg2 == 2) {
				this.method2221(local8, 8192, local13);
				this.method2221(local8 + 1, 512, local13 - 1);
			}
			if (arg2 == 3) {
				this.method2221(local8, 32768, local13);
				this.method2221(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2221(local8, 66560, local13);
			this.method2221(local8 - 1, 4096, local13);
			this.method2221(local8, 16384, local13 + 1);
		}
		if (arg2 == 1) {
			this.method2221(local8, 5120, local13);
			this.method2221(local8, 16384, local13 + 1);
			this.method2221(local8 + 1, 65536, local13);
		}
		if (arg2 == 2) {
			this.method2221(local8, 20480, local13);
			this.method2221(local8 + 1, 65536, local13);
			this.method2221(local8, 1024, local13 - 1);
		}
		if (arg2 == 3) {
			this.method2221(local8, 81920, local13);
			this.method2221(local8, 1024, local13 - 1);
			this.method2221(local8 - 1, 4096, local13);
			return;
		}
	}
}
