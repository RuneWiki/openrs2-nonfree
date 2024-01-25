import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class253 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public int anInt7189;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public int anInt7190;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public int anInt7191;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public int anInt7192;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = arg1 - this.anInt7189;
		@Pc(25) int local25 = arg0 - this.anInt7191;
		this.anIntArrayArray55[local25][local20] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIZIBI)V")
	public void method5726(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt7191;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg5 - this.anInt7189;
		for (@Pc(35) int local35 = local18; local35 < local18 + arg1; local35++) {
			if (local35 >= 0 && local35 < this.anInt7190) {
				for (@Pc(45) int local45 = local29; local45 < local29 + arg4; local45++) {
					if (local45 >= 0 && this.anInt7192 > local45) {
						this.method5743(local35, local45, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIIIIIIII)Z")
	public boolean method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg3 + arg1;
		@Pc(14) int local14 = arg5 + arg7;
		@Pc(24) int local24 = arg0 + arg6;
		@Pc(28) int local28 = arg4 + arg2;
		@Pc(45) int local45;
		@Pc(56) int local56;
		if (arg3 == local24 && (arg8 & 0x2) == 0) {
			local45 = arg7 > arg2 ? arg7 : arg2;
			local56 = local14 >= local28 ? local28 : local14;
			while (local56 > local45) {
				if ((this.anIntArrayArray55[local24 - this.anInt7191 - 1][local45 - this.anInt7189] & 0x8) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local10 == arg0 && (arg8 & 0x8) == 0) {
			local45 = arg2 >= arg7 ? arg2 : arg7;
			local56 = local14 < local28 ? local14 : local28;
			while (local45 < local56) {
				if ((this.anIntArrayArray55[arg0 - this.anInt7191][local45 - this.anInt7189] & 0x80) == 0) {
					return true;
				}
				local45++;
			}
		} else if (arg7 == local28 && (arg8 & 0x1) == 0) {
			local45 = arg0 >= arg3 ? arg0 : arg3;
			local56 = local10 >= local24 ? local24 : local10;
			while (local56 > local45) {
				if ((this.anIntArrayArray55[local45 - this.anInt7191][local28 - this.anInt7189 - 1] & 0x2) == 0) {
					return true;
				}
				local45++;
			}
		} else if (local14 == arg2 && (arg8 & 0x4) == 0) {
			local45 = arg3 <= arg0 ? arg0 : arg3;
			local56 = local24 <= local10 ? local24 : local10;
			while (local56 > local45) {
				if ((this.anIntArrayArray55[local45 - this.anInt7191][arg2 - this.anInt7189] & 0x20) == 0) {
					return true;
				}
				local45++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public void method5728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7189;
		@Pc(13) int local13 = arg0 - this.anInt7191;
		this.anIntArrayArray55[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIIZII)V")
	public void method5733(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt7191;
		@Pc(13) int local13 = arg3 - this.anInt7189;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5743(local4, local13, 128);
				this.method5743(local4 - 1, local13, 8);
			}
			if (arg5 == 1) {
				this.method5743(local4, local13, 2);
				this.method5743(local4, local13 + 1, 32);
			}
			if (arg5 == 2) {
				this.method5743(local4, local13, 8);
				this.method5743(local4 + 1, local13, 128);
			}
			if (arg5 == 3) {
				this.method5743(local4, local13, 32);
				this.method5743(local4, local13 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5743(local4, local13, 1);
				this.method5743(local4 - 1, local13 - -1, 16);
			}
			if (arg5 == 1) {
				this.method5743(local4, local13, 4);
				this.method5743(local4 + 1, local13 + 1, 64);
			}
			if (arg5 == 2) {
				this.method5743(local4, local13, 16);
				this.method5743(local4 + 1, local13 - 1, 1);
			}
			if (arg5 == 3) {
				this.method5743(local4, local13, 64);
				this.method5743(local4 - 1, local13 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method5743(local4, local13, 130);
				this.method5743(local4 - 1, local13, 8);
				this.method5743(local4, local13 + 1, 32);
			}
			if (arg5 == 1) {
				this.method5743(local4, local13, 10);
				this.method5743(local4, local13 + 1, 32);
				this.method5743(local4 + 1, local13, 128);
			}
			if (arg5 == 2) {
				this.method5743(local4, local13, 40);
				this.method5743(local4 + 1, local13, 128);
				this.method5743(local4, local13 - 1, 2);
			}
			if (arg5 == 3) {
				this.method5743(local4, local13, 160);
				this.method5743(local4, local13 - 1, 2);
				this.method5743(local4 - 1, local13, 8);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method5743(local4, local13, 65536);
					this.method5743(local4 - 1, local13, 4096);
				}
				if (arg5 == 1) {
					this.method5743(local4, local13, 1024);
					this.method5743(local4, local13 + 1, 16384);
				}
				if (arg5 == 2) {
					this.method5743(local4, local13, 4096);
					this.method5743(local4 + 1, local13, 65536);
				}
				if (arg5 == 3) {
					this.method5743(local4, local13, 16384);
					this.method5743(local4, local13 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method5743(local4, local13, 512);
					this.method5743(local4 - 1, local13 + 1, 8192);
				}
				if (arg5 == 1) {
					this.method5743(local4, local13, 2048);
					this.method5743(local4 + 1, local13 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method5743(local4, local13, 8192);
					this.method5743(local4 + 1, local13 - 1, 512);
				}
				if (arg5 == 3) {
					this.method5743(local4, local13, 32768);
					this.method5743(local4 - 1, local13 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method5743(local4, local13, 66560);
					this.method5743(local4 - 1, local13, 4096);
					this.method5743(local4, local13 + 1, 16384);
				}
				if (arg5 == 1) {
					this.method5743(local4, local13, 5120);
					this.method5743(local4, local13 + 1, 16384);
					this.method5743(local4 + 1, local13, 65536);
				}
				if (arg5 == 2) {
					this.method5743(local4, local13, 20480);
					this.method5743(local4 + 1, local13, 65536);
					this.method5743(local4, local13 - 1, 1024);
				}
				if (arg5 == 3) {
					this.method5743(local4, local13, 81920);
					this.method5743(local4, local13 - 1, 1024);
					this.method5743(local4 - 1, local13, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5743(local4, local13, 536870912);
				this.method5743(local4 - 1, local13, 33554432);
			}
			if (arg5 == 1) {
				this.method5743(local4, local13, 8388608);
				this.method5743(local4, local13 + 1, 134217728);
			}
			if (arg5 == 2) {
				this.method5743(local4, local13, 33554432);
				this.method5743(local4 + 1, local13, 536870912);
			}
			if (arg5 == 3) {
				this.method5743(local4, local13, 134217728);
				this.method5743(local4, local13 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5743(local4, local13, 4194304);
				this.method5743(local4 - 1, local13 - -1, 67108864);
			}
			if (arg5 == 1) {
				this.method5743(local4, local13, 16777216);
				this.method5743(local4 + 1, local13 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method5743(local4, local13, 67108864);
				this.method5743(local4 + 1, local13 + -1, 4194304);
			}
			if (arg5 == 3) {
				this.method5743(local4, local13, 268435456);
				this.method5743(local4 - 1, local13 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5743(local4, local13, 545259520);
			this.method5743(local4 - 1, local13, 33554432);
			this.method5743(local4, local13 + 1, 134217728);
		}
		if (arg5 == 1) {
			this.method5743(local4, local13, 41943040);
			this.method5743(local4, local13 + 1, 134217728);
			this.method5743(local4 + 1, local13, 536870912);
		}
		if (arg5 == 2) {
			this.method5743(local4, local13, 167772160);
			this.method5743(local4 + 1, local13, 536870912);
			this.method5743(local4, local13 - 1, 8388608);
		}
		if (arg5 == 3) {
			this.method5743(local4, local13, 671088640);
			this.method5743(local4, local13 - 1, 8388608);
			this.method5743(local4 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static323.method2066(arg6, arg3, arg4, arg7, arg5, arg2, arg0, arg2) ? true : this.method5727(arg4, arg2, arg0, arg5, arg3, arg2, arg6, arg7, arg1);
		}
		@Pc(51) int local51 = arg6 + arg4 - 1;
		@Pc(57) int local57 = arg3 + arg0 - 1;
		if (arg4 <= arg5 && arg5 <= local51 && arg7 >= arg0 && local57 >= arg7) {
			return true;
		} else if (arg5 == arg4 - 1 && arg7 >= arg0 && arg7 <= local57 && (this.anIntArrayArray55[arg5 - this.anInt7191][arg7 - this.anInt7189] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg5 == local51 + 1 && arg7 >= arg0 && local57 >= arg7 && (this.anIntArrayArray55[arg5 - this.anInt7191][arg7 - this.anInt7189] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg7 && arg5 >= arg4 && local51 >= arg5 && (this.anIntArrayArray55[arg5 - this.anInt7191][arg7 - this.anInt7189] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local57 + 1 && arg5 >= arg4 && arg5 <= local51 && (this.anIntArrayArray55[arg5 - this.anInt7191][arg7 - this.anInt7189] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg0 && arg1 == arg3) {
				return true;
			}
		} else if (arg5 <= arg0 && arg0 <= arg5 + arg4 - 1 && arg1 <= arg1 && arg4 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(56) int local56 = arg3 - this.anInt7189;
		@Pc(61) int local61 = arg1 - this.anInt7189;
		@Pc(66) int local66 = arg0 - this.anInt7191;
		@Pc(71) int local71 = arg5 - this.anInt7191;
		if (arg4 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local71 == local66 + 1 && local61 == local56 && (this.anIntArrayArray55[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local66 == local71 && local56 == local61 - 1 && (this.anIntArrayArray55[local71][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local71 == local66 - 1 && local61 == local56 && (this.anIntArrayArray55[local71][local56] & 0x8) == 0) {
						return true;
					}
					if (local71 == local66 && local61 - 1 == local56 && (this.anIntArrayArray55[local71][local56] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local66 - 1 == local71 && local61 == local56 && (this.anIntArrayArray55[local71][local56] & 0x8) == 0) {
						return true;
					}
					if (local71 == local66 && local61 + 1 == local56 && (this.anIntArrayArray55[local71][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local66 + 1 == local71 && local61 == local56 && (this.anIntArrayArray55[local71][local56] & 0x80) == 0) {
						return true;
					}
					if (local71 == local66 && local61 + 1 == local56 && (this.anIntArrayArray55[local71][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local71 == local66 && local56 == local61 + 1 && (this.anIntArrayArray55[local71][local56] & 0x20) == 0) {
					return true;
				}
				if (local71 == local66 && local61 - 1 == local56 && (this.anIntArrayArray55[local71][local56] & 0x2) == 0) {
					return true;
				}
				if (local66 - 1 == local71 && local56 == local61 && (this.anIntArrayArray55[local71][local56] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local71 && local61 == local56 && (this.anIntArrayArray55[local71][local56] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = arg4 + local71 - 1;
			@Pc(92) int local92 = arg4 + local56 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local71 == local66 + 1 && local61 >= local56 && local61 <= local92 && (this.anIntArrayArray55[local71][local61] & 0x80) == 0) {
						return true;
					}
					if (local66 >= local71 && local66 <= local86 && local56 == local61 - arg4 && (this.anIntArrayArray55[local66][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 - arg4 == local71 && local61 >= local56 && local92 >= local61 && (this.anIntArrayArray55[local86][local61] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local66 && local86 >= local66 && local56 == local61 - arg4 && (this.anIntArrayArray55[local66][local92] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local71 == local66 - arg4 && local56 <= local61 && local61 <= local92 && (this.anIntArrayArray55[local86][local61] & 0x8) == 0) {
						return true;
					}
					if (local66 >= local71 && local86 >= local66 && local61 + 1 == local56 && (this.anIntArrayArray55[local66][local56] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local71 == local66 + 1 && local56 <= local61 && local61 <= local92 && (this.anIntArrayArray55[local71][local61] & 0x80) == 0) {
						return true;
					}
					if (local66 >= local71 && local86 >= local66 && local56 == local61 + 1 && (this.anIntArrayArray55[local66][local56] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local66 >= local71 && local86 >= local66 && local56 == local61 + 1 && (this.anIntArrayArray55[local66][local56] & 0x20) == 0) {
					return true;
				}
				if (local71 <= local66 && local86 >= local66 && local61 - arg4 == local56 && (this.anIntArrayArray55[local66][local92] & 0x2) == 0) {
					return true;
				}
				if (local71 == local66 - arg4 && local56 <= local61 && local92 >= local61 && (this.anIntArrayArray55[local86][local61] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local71 && local61 >= local56 && local61 <= local92 && (this.anIntArrayArray55[local71][local61] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIIIIZZ)V")
	public void method5736(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt7189;
		@Pc(23) int local23 = arg2 - this.anInt7191;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(48) int local48;
		if (arg5 == 1 || arg5 == 3) {
			local48 = arg4;
			arg4 = arg1;
			arg1 = local48;
		}
		for (local48 = local23; local48 < arg4 + local23; local48++) {
			if (local48 >= 0 && local48 < this.anInt7190) {
				for (@Pc(67) int local67 = local18; local67 < local18 + arg1; local67++) {
					if (local67 >= 0 && local67 < this.anInt7192) {
						this.method5741(local67, local7, local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V")
	public void method5737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7191;
		@Pc(17) int local17 = arg0 - this.anInt7189;
		this.anIntArrayArray55[local4][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method5738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg3 && arg2 == arg4) {
				return true;
			}
		} else if (arg3 <= arg1 && arg1 <= arg3 + arg5 - 1 && arg2 <= arg2 && arg2 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg4 - this.anInt7189;
		@Pc(63) int local63 = arg2 - this.anInt7189;
		@Pc(68) int local68 = arg3 - this.anInt7191;
		@Pc(73) int local73 = arg1 - this.anInt7191;
		if (arg5 == 1) {
			if (arg0 == 0) {
				if (arg6 == 0) {
					if (local73 - 1 == local68 && local58 == local63) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 && local58 == local63 - 1 && (this.anIntArrayArray55[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local73 == local68 && local58 == local63 + 1) {
						return true;
					}
					if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray55[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local68 == local73 + 1 && local63 == local58) {
						return true;
					}
					if (local68 == local73 && local58 == local63 + 1 && (this.anIntArrayArray55[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 == local68 && local58 == local63 - 1 && (this.anIntArrayArray55[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local73 == local68 && local58 == local63 - 1) {
						return true;
					}
					if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local63 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg6 == 0) {
					if (local73 - 1 == local68 && local58 == local63) {
						return true;
					}
					if (local73 == local68 && local63 + 1 == local58) {
						return true;
					}
					if (local73 + 1 == local68 && local58 == local63 && (this.anIntArrayArray55[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local68 == local73 - 1 && local58 == local63 && (this.anIntArrayArray55[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 == local68 && local63 + 1 == local58) {
						return true;
					}
					if (local73 + 1 == local68 && local58 == local63) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local68 == local73 - 1 && local63 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 == local63) {
						return true;
					}
					if (local68 == local73 && local63 - 1 == local58) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local68 == local73 - 1 && local58 == local63) {
						return true;
					}
					if (local73 == local68 && local63 + 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local58 == local63 && (this.anIntArrayArray55[local68][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local58) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local73 == local68 && local63 + 1 == local58 && (this.anIntArrayArray55[local68][local58] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local58 == local63 - 1 && (this.anIntArrayArray55[local68][local58] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local58 == local63 && (this.anIntArrayArray55[local68][local58] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local63 == local58 && (this.anIntArrayArray55[local68][local58] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(762) int local762 = arg5 + local68 - 1;
			@Pc(768) int local768 = arg5 + local58 - 1;
			if (arg0 == 0) {
				if (arg6 == 0) {
					if (local73 - arg5 == local68 && local63 >= local58 && local63 <= local768) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local58 == local63 + 1 && (this.anIntArrayArray55[local73][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local762 && local63 - arg5 == local58 && (this.anIntArrayArray55[local73][local768] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local73 >= local68 && local762 >= local73 && local58 == local63 + 1) {
						return true;
					}
					if (local73 - arg5 == local68 && local58 <= local63 && local768 >= local63 && (this.anIntArrayArray55[local762][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 + 1 == local68 && local63 >= local58 && local768 >= local63 && (this.anIntArrayArray55[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local68 == local73 + 1 && local58 <= local63 && local63 <= local768) {
						return true;
					}
					if (local68 <= local73 && local762 >= local73 && local63 + 1 == local58 && (this.anIntArrayArray55[local73][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local762 && local58 == local63 - arg5 && (this.anIntArrayArray55[local73][local768] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local73 >= local68 && local762 >= local73 && local58 == local63 - arg5) {
						return true;
					}
					if (local68 == local73 - arg5 && local63 >= local58 && local768 >= local63 && (this.anIntArrayArray55[local762][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 <= local63 && local63 <= local768 && (this.anIntArrayArray55[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg6 == 0) {
					if (local73 - arg5 == local68 && local58 <= local63 && local63 <= local768) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local63 + 1 == local58) {
						return true;
					}
					if (local73 + 1 == local68 && local63 >= local58 && local768 >= local63 && (this.anIntArrayArray55[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local63 - arg5 == local58 && (this.anIntArrayArray55[local73][local768] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local68 == local73 - arg5 && local63 >= local58 && local63 <= local768 && (this.anIntArrayArray55[local762][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local58 == local63 + 1) {
						return true;
					}
					if (local68 == local73 + 1 && local58 <= local63 && local768 >= local63) {
						return true;
					}
					if (local73 >= local68 && local73 <= local762 && local63 - arg5 == local58 && (this.anIntArrayArray55[local73][local768] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local73 - arg5 == local68 && local63 >= local58 && local63 <= local768 && (this.anIntArrayArray55[local762][local63] & 0x2C0108) == 0) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local58 == local63 + 1 && (this.anIntArrayArray55[local73][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 <= local63 && local63 <= local768) {
						return true;
					}
					if (local73 >= local68 && local73 <= local762 && local58 == local63 - arg5) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local68 == local73 - arg5 && local58 <= local63 && local63 <= local768) {
						return true;
					}
					if (local73 >= local68 && local762 >= local73 && local58 == local63 + 1 && (this.anIntArrayArray55[local73][local58] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local73 + 1 && local58 <= local63 && local63 <= local768 && (this.anIntArrayArray55[local68][local63] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local73 && local762 >= local73 && local63 - arg5 == local58) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local68 <= local73 && local762 >= local73 && local63 + 1 == local58 && (this.anIntArrayArray55[local73][local58] & 0x2C0120) == 0) {
					return true;
				}
				if (local68 <= local73 && local73 <= local762 && local63 - arg5 == local58 && (this.anIntArrayArray55[local73][local768] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 == local73 - arg5 && local63 >= local58 && local63 <= local768 && (this.anIntArrayArray55[local762][local63] & 0x2C0108) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local63 >= local58 && local63 <= local768 && (this.anIntArrayArray55[local68][local63] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIZI)V")
	public void method5739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt7191;
		@Pc(19) int local19 = arg1 - this.anInt7189;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5741(local19, 128, local4);
				this.method5741(local19, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5741(local19, 2, local4);
				this.method5741(local19 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method5741(local19, 8, local4);
				this.method5741(local19, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5741(local19, 32, local4);
				this.method5741(local19 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5741(local19, 1, local4);
				this.method5741(local19 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5741(local19, 4, local4);
				this.method5741(local19 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5741(local19, 16, local4);
				this.method5741(local19 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5741(local19, 64, local4);
				this.method5741(local19 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method5741(local19, 130, local4);
				this.method5741(local19, 8, local4 - 1);
				this.method5741(local19 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method5741(local19, 10, local4);
				this.method5741(local19 + 1, 32, local4);
				this.method5741(local19, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5741(local19, 40, local4);
				this.method5741(local19, 128, local4 + 1);
				this.method5741(local19 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method5741(local19, 160, local4);
				this.method5741(local19 - 1, 2, local4);
				this.method5741(local19, 8, local4 - 1);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method5741(local19, 65536, local4);
					this.method5741(local19, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5741(local19, 1024, local4);
					this.method5741(local19 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method5741(local19, 4096, local4);
					this.method5741(local19, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5741(local19, 16384, local4);
					this.method5741(local19 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method5741(local19, 512, local4);
					this.method5741(local19 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5741(local19, 2048, local4);
					this.method5741(local19 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5741(local19, 8192, local4);
					this.method5741(local19 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5741(local19, 32768, local4);
					this.method5741(local19 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method5741(local19, 66560, local4);
					this.method5741(local19, 4096, local4 - 1);
					this.method5741(local19 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method5741(local19, 5120, local4);
					this.method5741(local19 + 1, 16384, local4);
					this.method5741(local19, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5741(local19, 20480, local4);
					this.method5741(local19, 65536, local4 + 1);
					this.method5741(local19 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method5741(local19, 81920, local4);
					this.method5741(local19 - 1, 1024, local4);
					this.method5741(local19, 4096, local4 - 1);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5741(local19, 536870912, local4);
				this.method5741(local19, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5741(local19, 8388608, local4);
				this.method5741(local19 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method5741(local19, 33554432, local4);
				this.method5741(local19, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5741(local19, 134217728, local4);
				this.method5741(local19 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5741(local19, 4194304, local4);
				this.method5741(local19 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5741(local19, 16777216, local4);
				this.method5741(local19 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5741(local19, 67108864, local4);
				this.method5741(local19 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5741(local19, 268435456, local4);
				this.method5741(local19 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5741(local19, 545259520, local4);
			this.method5741(local19, 33554432, local4 - 1);
			this.method5741(local19 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method5741(local19, 41943040, local4);
			this.method5741(local19 + 1, 134217728, local4);
			this.method5741(local19, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method5741(local19, 167772160, local4);
			this.method5741(local19, 536870912, local4 + 1);
			this.method5741(local19 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method5741(local19, 671088640, local4);
			this.method5741(local19 - 1, 8388608, local4);
			this.method5741(local19, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)V")
	public void method5740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7189;
		@Pc(9) int local9 = arg0 - this.anInt7191;
		this.anIntArrayArray55[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)V")
	private void method5741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray55[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IBII)V")
	private void method5743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray55[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public void method5745() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7190; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt7192; local7++) {
				if (local3 == 0 || local7 == 0 || this.anInt7190 - 5 <= local3 || local7 >= this.anInt7192 - 5) {
					this.anIntArrayArray55[local3][local7] = -1;
				} else {
					this.anIntArrayArray55[local3][local7] = 2097152;
				}
			}
		}
	}
}
