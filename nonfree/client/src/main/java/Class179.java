import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class179 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public int anInt5187;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
	public int anInt5197;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
	public int anInt5199;

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
	public int anInt5208;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method4339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static299.method4661(arg5, arg7, arg1, arg3, arg0, arg4, arg3, arg6) ? true : this.method4345(arg6, arg5, arg1, arg3, arg0, arg4, arg7, arg3, arg2);
		}
		@Pc(44) int local44 = arg5 + arg4 - 1;
		@Pc(50) int local50 = arg7 + arg6 - 1;
		if (arg0 >= arg4 && arg0 <= local44 && arg1 >= arg6 && arg1 <= local50) {
			return true;
		} else if (arg4 - 1 == arg0 && arg1 >= arg6 && arg1 <= local50 && (this.anIntArrayArray44[arg0 - this.anInt5187][arg1 - this.anInt5199] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local44 + 1 == arg0 && arg1 >= arg6 && arg1 <= local50 && (this.anIntArrayArray44[arg0 - this.anInt5187][arg1 - this.anInt5199] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg1 && arg4 <= arg0 && local44 >= arg0 && (this.anIntArrayArray44[arg0 - this.anInt5187][arg1 - this.anInt5199] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local50 + 1 && arg0 >= arg4 && arg0 <= local44 && (this.anIntArrayArray44[arg0 - this.anInt5187][arg1 - this.anInt5199] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	private void method4340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray44[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIIIIZ)V")
	public void method4341(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(5) int local5 = 256;
		if (arg6) {
			local5 = 131328;
		}
		@Pc(21) int local21;
		if (arg1 == 1 || arg1 == 3) {
			local21 = arg3;
			arg3 = arg5;
			arg5 = local21;
		}
		@Pc(30) int local30 = arg4 - this.anInt5187;
		if (arg0) {
			local5 |= 0x40000000;
		}
		@Pc(41) int local41 = arg2 - this.anInt5199;
		for (local21 = local30; local21 < local30 + arg3; local21++) {
			if (local21 >= 0 && local21 < this.anInt5208) {
				for (@Pc(59) int local59 = local41; local59 < arg5 + local41; local59++) {
					if (local59 >= 0 && local59 < this.anInt5197) {
						this.method4347(local21, local59, local5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	public void method4342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5199;
		@Pc(13) int local13 = arg1 - this.anInt5187;
		this.anIntArrayArray44[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
	public void method4344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5187;
		@Pc(17) int local17 = arg1 - this.anInt5199;
		this.anIntArrayArray44[local4][local17] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIIIIIII)Z")
	public boolean method4345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg7 + arg4;
		@Pc(11) int local11 = arg2 + arg3;
		@Pc(15) int local15 = arg1 + arg5;
		@Pc(19) int local19 = arg6 + arg0;
		@Pc(39) int local39;
		@Pc(50) int local50;
		if (local15 == arg4 && (arg8 & 0x2) == 0) {
			local39 = arg2 <= arg0 ? arg0 : arg2;
			local50 = local11 >= local19 ? local19 : local11;
			while (local50 > local39) {
				if ((this.anIntArrayArray44[local15 - this.anInt5187 - 1][local39 - this.anInt5199] & 0x8) == 0) {
					return true;
				}
				local39++;
			}
		} else if (local7 == arg5 && (arg8 & 0x8) == 0) {
			local39 = arg0 < arg2 ? arg2 : arg0;
			local50 = local19 > local11 ? local11 : local19;
			while (local50 > local39) {
				if ((this.anIntArrayArray44[arg5 - this.anInt5187][local39 - this.anInt5199] & 0x80) == 0) {
					return true;
				}
				local39++;
			}
		} else if (local19 == arg2 && (arg8 & 0x1) == 0) {
			local39 = arg5 < arg4 ? arg4 : arg5;
			local50 = local7 < local15 ? local7 : local15;
			while (local50 > local39) {
				if ((this.anIntArrayArray44[local39 - this.anInt5187][local19 - this.anInt5199 - 1] & 0x2) == 0) {
					return true;
				}
				local39++;
			}
		} else if (arg0 == local11 && (arg8 & 0x4) == 0) {
			local39 = arg5 >= arg4 ? arg5 : arg4;
			local50 = local7 >= local15 ? local15 : local7;
			while (local50 > local39) {
				if ((this.anIntArrayArray44[local39 - this.anInt5187][arg0 - this.anInt5199] & 0x20) == 0) {
					return true;
				}
				local39++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method4346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg5 && arg1 == arg6) {
				return true;
			}
		} else if (arg5 >= arg3 && arg3 + arg0 - 1 >= arg5 && arg1 >= arg1 && arg1 + arg0 - 1 >= arg1) {
			return true;
		}
		@Pc(50) int local50 = arg6 - this.anInt5199;
		@Pc(55) int local55 = arg1 - this.anInt5199;
		@Pc(60) int local60 = arg5 - this.anInt5187;
		@Pc(70) int local70 = arg3 - this.anInt5187;
		if (arg0 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local60 + 1 == local70 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x80) == 0) {
						return true;
					}
					if (local60 == local70 && local50 == local55 - 1 && (this.anIntArrayArray44[local70][local50] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local60 - 1 == local70 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x8) == 0) {
						return true;
					}
					if (local60 == local70 && local50 == local55 - 1 && (this.anIntArrayArray44[local70][local50] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local60 - 1 == local70 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x8) == 0) {
						return true;
					}
					if (local60 == local70 && local50 == local55 + 1 && (this.anIntArrayArray44[local70][local50] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local70 == local60 + 1 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x80) == 0) {
						return true;
					}
					if (local70 == local60 && local55 + 1 == local50 && (this.anIntArrayArray44[local70][local50] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local60 == local70 && local55 + 1 == local50 && (this.anIntArrayArray44[local70][local50] & 0x20) == 0) {
					return true;
				}
				if (local60 == local70 && local50 == local55 - 1 && (this.anIntArrayArray44[local70][local50] & 0x2) == 0) {
					return true;
				}
				if (local60 - 1 == local70 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x8) == 0) {
					return true;
				}
				if (local70 == local60 + 1 && local55 == local50 && (this.anIntArrayArray44[local70][local50] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(406) int local406 = arg0 + local70 - 1;
			@Pc(412) int local412 = arg0 + local50 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local60 + 1 == local70 && local55 >= local50 && local412 >= local55 && (this.anIntArrayArray44[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local60 && local406 >= local60 && local50 == local55 - arg0 && (this.anIntArrayArray44[local60][local412] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local70 == local60 - arg0 && local55 >= local50 && local412 >= local55 && (this.anIntArrayArray44[local406][local55] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local60 && local406 >= local60 && local55 - arg0 == local50 && (this.anIntArrayArray44[local60][local412] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local70 == local60 - arg0 && local50 <= local55 && local55 <= local412 && (this.anIntArrayArray44[local406][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 >= local70 && local60 <= local406 && local55 + 1 == local50 && (this.anIntArrayArray44[local60][local50] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local60 + 1 == local70 && local55 >= local50 && local412 >= local55 && (this.anIntArrayArray44[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local60 && local60 <= local406 && local55 + 1 == local50 && (this.anIntArrayArray44[local60][local50] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local60 >= local70 && local60 <= local406 && local50 == local55 + 1 && (this.anIntArrayArray44[local60][local50] & 0x20) == 0) {
					return true;
				}
				if (local60 >= local70 && local60 <= local406 && local55 - arg0 == local50 && (this.anIntArrayArray44[local60][local412] & 0x2) == 0) {
					return true;
				}
				if (local60 - arg0 == local70 && local50 <= local55 && local55 <= local412 && (this.anIntArrayArray44[local406][local55] & 0x8) == 0) {
					return true;
				}
				if (local70 == local60 + 1 && local50 <= local55 && local55 <= local412 && (this.anIntArrayArray44[local70][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIII)V")
	private void method4347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray44[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZIIZII)V")
	public void method4348(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 256;
		if (arg3) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg2 - this.anInt5187;
		if (arg0) {
			local5 |= 0x40000000;
		}
		@Pc(27) int local27 = arg1 - this.anInt5199;
		for (@Pc(41) int local41 = local16; local41 < arg5 + local16; local41++) {
			if (local41 >= 0 && local41 < this.anInt5208) {
				for (@Pc(50) int local50 = local27; local50 < arg4 + local27; local50++) {
					if (local50 >= 0 && this.anInt5197 > local50) {
						this.method4340(local41, local5, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public void method4349() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt5208; local9++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt5197; local12++) {
				if (local9 == 0 || local12 == 0 || this.anInt5208 - 5 <= local9 || this.anInt5197 - 5 <= local12) {
					this.anIntArrayArray44[local9][local12] = -1;
				} else {
					this.anIntArrayArray44[local9][local12] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIZ)V")
	public void method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt5199;
		@Pc(19) int local19 = arg1 - this.anInt5187;
		this.anIntArrayArray44[local19][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)V")
	public void method4351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt5199;
		@Pc(17) int local17 = arg0 - this.anInt5187;
		this.anIntArrayArray44[local17][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIBIZII)V")
	public void method4352(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt5187;
		@Pc(9) int local9 = arg4 - this.anInt5199;
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method4347(local4, local9, 128);
				this.method4347(local4 - 1, local9, 8);
			}
			if (arg2 == 1) {
				this.method4347(local4, local9, 2);
				this.method4347(local4, local9 + 1, 32);
			}
			if (arg2 == 2) {
				this.method4347(local4, local9, 8);
				this.method4347(local4 + 1, local9, 128);
			}
			if (arg2 == 3) {
				this.method4347(local4, local9, 32);
				this.method4347(local4, local9 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method4347(local4, local9, 1);
				this.method4347(local4 - 1, local9 + 1, 16);
			}
			if (arg2 == 1) {
				this.method4347(local4, local9, 4);
				this.method4347(local4 + 1, local9 + 1, 64);
			}
			if (arg2 == 2) {
				this.method4347(local4, local9, 16);
				this.method4347(local4 + 1, local9 + -1, 1);
			}
			if (arg2 == 3) {
				this.method4347(local4, local9, 64);
				this.method4347(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg2 == 0) {
				this.method4347(local4, local9, 130);
				this.method4347(local4 - 1, local9, 8);
				this.method4347(local4, local9 + 1, 32);
			}
			if (arg2 == 1) {
				this.method4347(local4, local9, 10);
				this.method4347(local4, local9 + 1, 32);
				this.method4347(local4 + 1, local9, 128);
			}
			if (arg2 == 2) {
				this.method4347(local4, local9, 40);
				this.method4347(local4 + 1, local9, 128);
				this.method4347(local4, local9 - 1, 2);
			}
			if (arg2 == 3) {
				this.method4347(local4, local9, 160);
				this.method4347(local4, local9 - 1, 2);
				this.method4347(local4 - 1, local9, 8);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					this.method4347(local4, local9, 65536);
					this.method4347(local4 - 1, local9, 4096);
				}
				if (arg2 == 1) {
					this.method4347(local4, local9, 1024);
					this.method4347(local4, local9 + 1, 16384);
				}
				if (arg2 == 2) {
					this.method4347(local4, local9, 4096);
					this.method4347(local4 + 1, local9, 65536);
				}
				if (arg2 == 3) {
					this.method4347(local4, local9, 16384);
					this.method4347(local4, local9 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg2 == 0) {
					this.method4347(local4, local9, 512);
					this.method4347(local4 - 1, local9 - -1, 8192);
				}
				if (arg2 == 1) {
					this.method4347(local4, local9, 2048);
					this.method4347(local4 + 1, local9 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method4347(local4, local9, 8192);
					this.method4347(local4 + 1, local9 - 1, 512);
				}
				if (arg2 == 3) {
					this.method4347(local4, local9, 32768);
					this.method4347(local4 - 1, local9 - 1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					this.method4347(local4, local9, 66560);
					this.method4347(local4 - 1, local9, 4096);
					this.method4347(local4, local9 + 1, 16384);
				}
				if (arg2 == 1) {
					this.method4347(local4, local9, 5120);
					this.method4347(local4, local9 + 1, 16384);
					this.method4347(local4 + 1, local9, 65536);
				}
				if (arg2 == 2) {
					this.method4347(local4, local9, 20480);
					this.method4347(local4 + 1, local9, 65536);
					this.method4347(local4, local9 - 1, 1024);
				}
				if (arg2 == 3) {
					this.method4347(local4, local9, 81920);
					this.method4347(local4, local9 - 1, 1024);
					this.method4347(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method4347(local4, local9, 536870912);
				this.method4347(local4 - 1, local9, 33554432);
			}
			if (arg2 == 1) {
				this.method4347(local4, local9, 8388608);
				this.method4347(local4, local9 + 1, 134217728);
			}
			if (arg2 == 2) {
				this.method4347(local4, local9, 33554432);
				this.method4347(local4 + 1, local9, 536870912);
			}
			if (arg2 == 3) {
				this.method4347(local4, local9, 134217728);
				this.method4347(local4, local9 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method4347(local4, local9, 4194304);
				this.method4347(local4 - 1, local9 + 1, 67108864);
			}
			if (arg2 == 1) {
				this.method4347(local4, local9, 16777216);
				this.method4347(local4 + 1, local9 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method4347(local4, local9, 67108864);
				this.method4347(local4 + 1, local9 - 1, 4194304);
			}
			if (arg2 == 3) {
				this.method4347(local4, local9, 268435456);
				this.method4347(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method4347(local4, local9, 545259520);
			this.method4347(local4 - 1, local9, 33554432);
			this.method4347(local4, local9 + 1, 134217728);
		}
		if (arg2 == 1) {
			this.method4347(local4, local9, 41943040);
			this.method4347(local4, local9 + 1, 134217728);
			this.method4347(local4 + 1, local9, 536870912);
		}
		if (arg2 == 2) {
			this.method4347(local4, local9, 167772160);
			this.method4347(local4 + 1, local9, 536870912);
			this.method4347(local4, local9 - 1, 8388608);
		}
		if (arg2 == 3) {
			this.method4347(local4, local9, 671088640);
			this.method4347(local4, local9 - 1, 8388608);
			this.method4347(local4 - 1, local9, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg6 && arg1 == arg0) {
				return true;
			}
		} else if (arg6 <= arg5 && arg4 + arg6 - 1 >= arg5 && arg0 <= arg0 && arg4 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(57) int local57 = arg0 - this.anInt5199;
		@Pc(62) int local62 = arg5 - this.anInt5187;
		@Pc(67) int local67 = arg1 - this.anInt5199;
		@Pc(72) int local72 = arg6 - this.anInt5187;
		if (arg4 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local62 - 1 == local72 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local57 + 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 && local57 - 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local72 == local62 && local57 + 1 == local67) {
						return true;
					}
					if (local72 == local62 - 1 && local67 == local57 && (this.anIntArrayArray44[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local72 == local62 + 1 && local57 == local67) {
						return true;
					}
					if (local62 == local72 && local57 + 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local72 && local67 == local57 - 1 && (this.anIntArrayArray44[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local72 == local62 && local67 == local57 - 1) {
						return true;
					}
					if (local72 == local62 - 1 && local67 == local57 && (this.anIntArrayArray44[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local62 - 1 == local72 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local57 + 1 == local67) {
						return true;
					}
					if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 == local72 && local57 - 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local62 - 1 == local72 && local67 == local57 && (this.anIntArrayArray44[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local72 && local57 + 1 == local67) {
						return true;
					}
					if (local62 + 1 == local72 && local57 == local67) {
						return true;
					}
					if (local62 == local72 && local57 - 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local62 - 1 == local72 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 + 1 && (this.anIntArrayArray44[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local67 == local57) {
						return true;
					}
					if (local72 == local62 && local57 - 1 == local67) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local72 == local62 - 1 && local57 == local67) {
						return true;
					}
					if (local72 == local62 && local57 + 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local67 == local57 && (this.anIntArrayArray44[local72][local67] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 == local62 && local67 == local57 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local72 == local62 && local57 + 1 == local67 && (this.anIntArrayArray44[local72][local67] & 0x20) == 0) {
					return true;
				}
				if (local62 == local72 && local67 == local57 - 1 && (this.anIntArrayArray44[local72][local67] & 0x2) == 0) {
					return true;
				}
				if (local62 - 1 == local72 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x8) == 0) {
					return true;
				}
				if (local72 == local62 + 1 && local57 == local67 && (this.anIntArrayArray44[local72][local67] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(771) int local771 = arg4 + local72 - 1;
			@Pc(777) int local777 = arg4 + local67 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local72 == local62 - arg4 && local57 >= local67 && local777 >= local57) {
						return true;
					}
					if (local62 >= local72 && local62 <= local771 && local57 + 1 == local67 && (this.anIntArrayArray44[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 >= local72 && local771 >= local62 && local57 - arg4 == local67 && (this.anIntArrayArray44[local62][local777] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local62 >= local72 && local771 >= local62 && local67 == local57 + 1) {
						return true;
					}
					if (local72 == local62 - arg4 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local771][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local62 + 1 == local72 && local67 <= local57 && local777 >= local57) {
						return true;
					}
					if (local72 <= local62 && local771 >= local62 && local67 == local57 + 1 && (this.anIntArrayArray44[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 >= local72 && local771 >= local62 && local57 - arg4 == local67 && (this.anIntArrayArray44[local62][local777] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local62 >= local72 && local62 <= local771 && local57 - arg4 == local67) {
						return true;
					}
					if (local62 - arg4 == local72 && local67 <= local57 && local777 >= local57 && (this.anIntArrayArray44[local771][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local72 == local62 - arg4 && local57 >= local67 && local777 >= local57) {
						return true;
					}
					if (local62 >= local72 && local771 >= local62 && local57 + 1 == local67) {
						return true;
					}
					if (local72 == local62 + 1 && local67 <= local57 && local777 >= local57 && (this.anIntArrayArray44[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local62 && local771 >= local62 && local67 == local57 - arg4 && (this.anIntArrayArray44[local62][local777] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local72 == local62 - arg4 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local771][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local771 && local67 == local57 + 1) {
						return true;
					}
					if (local72 == local62 + 1 && local57 >= local67 && local777 >= local57) {
						return true;
					}
					if (local62 >= local72 && local62 <= local771 && local57 - arg4 == local67 && (this.anIntArrayArray44[local62][local777] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local72 == local62 - arg4 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local771][local57] & 0x2C0108) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local771 && local57 + 1 == local67 && (this.anIntArrayArray44[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local72 == local62 + 1 && local67 <= local57 && local777 >= local57) {
						return true;
					}
					if (local72 <= local62 && local62 <= local771 && local67 == local57 - arg4) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local72 == local62 - arg4 && local67 <= local57 && local777 >= local57) {
						return true;
					}
					if (local72 <= local62 && local62 <= local771 && local67 == local57 + 1 && (this.anIntArrayArray44[local62][local67] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local72 && local57 >= local67 && local57 <= local777 && (this.anIntArrayArray44[local72][local57] & 0x2C0180) == 0) {
						return true;
					}
					if (local72 <= local62 && local62 <= local771 && local57 - arg4 == local67) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local72 <= local62 && local771 >= local62 && local57 + 1 == local67 && (this.anIntArrayArray44[local62][local67] & 0x2C0120) == 0) {
					return true;
				}
				if (local62 >= local72 && local62 <= local771 && local67 == local57 - arg4 && (this.anIntArrayArray44[local62][local777] & 0x2C0102) == 0) {
					return true;
				}
				if (local62 - arg4 == local72 && local67 <= local57 && local57 <= local777 && (this.anIntArrayArray44[local771][local57] & 0x2C0108) == 0) {
					return true;
				}
				if (local62 + 1 == local72 && local57 >= local67 && local777 >= local57 && (this.anIntArrayArray44[local72][local57] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZIIIZ)V")
	public void method4354(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg0 - this.anInt5187;
		@Pc(13) int local13 = arg3 - this.anInt5199;
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4340(local4, 128, local13);
				this.method4340(local4 - 1, 8, local13);
			}
			if (arg2 == 1) {
				this.method4340(local4, 2, local13);
				this.method4340(local4, 32, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4340(local4, 8, local13);
				this.method4340(local4 + 1, 128, local13);
			}
			if (arg2 == 3) {
				this.method4340(local4, 32, local13);
				this.method4340(local4, 2, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4340(local4, 1, local13);
				this.method4340(local4 - 1, 16, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4340(local4, 4, local13);
				this.method4340(local4 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4340(local4, 16, local13);
				this.method4340(local4 + 1, 1, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4340(local4, 64, local13);
				this.method4340(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg2 == 0) {
				this.method4340(local4, 130, local13);
				this.method4340(local4 - 1, 8, local13);
				this.method4340(local4, 32, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4340(local4, 10, local13);
				this.method4340(local4, 32, local13 + 1);
				this.method4340(local4 + 1, 128, local13);
			}
			if (arg2 == 2) {
				this.method4340(local4, 40, local13);
				this.method4340(local4 + 1, 128, local13);
				this.method4340(local4, 2, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4340(local4, 160, local13);
				this.method4340(local4, 2, local13 - 1);
				this.method4340(local4 - 1, 8, local13);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					this.method4340(local4, 65536, local13);
					this.method4340(local4 - 1, 4096, local13);
				}
				if (arg2 == 1) {
					this.method4340(local4, 1024, local13);
					this.method4340(local4, 16384, local13 + 1);
				}
				if (arg2 == 2) {
					this.method4340(local4, 4096, local13);
					this.method4340(local4 + 1, 65536, local13);
				}
				if (arg2 == 3) {
					this.method4340(local4, 16384, local13);
					this.method4340(local4, 1024, local13 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					this.method4340(local4, 512, local13);
					this.method4340(local4 - 1, 8192, local13 + 1);
				}
				if (arg2 == 1) {
					this.method4340(local4, 2048, local13);
					this.method4340(local4 + 1, 32768, local13 + 1);
				}
				if (arg2 == 2) {
					this.method4340(local4, 8192, local13);
					this.method4340(local4 + 1, 512, local13 - 1);
				}
				if (arg2 == 3) {
					this.method4340(local4, 32768, local13);
					this.method4340(local4 - 1, 2048, local13 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					this.method4340(local4, 66560, local13);
					this.method4340(local4 - 1, 4096, local13);
					this.method4340(local4, 16384, local13 + 1);
				}
				if (arg2 == 1) {
					this.method4340(local4, 5120, local13);
					this.method4340(local4, 16384, local13 + 1);
					this.method4340(local4 + 1, 65536, local13);
				}
				if (arg2 == 2) {
					this.method4340(local4, 20480, local13);
					this.method4340(local4 + 1, 65536, local13);
					this.method4340(local4, 1024, local13 - 1);
				}
				if (arg2 == 3) {
					this.method4340(local4, 81920, local13);
					this.method4340(local4, 1024, local13 - 1);
					this.method4340(local4 - 1, 4096, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 == 0) {
				this.method4340(local4, 536870912, local13);
				this.method4340(local4 - 1, 33554432, local13);
			}
			if (arg2 == 1) {
				this.method4340(local4, 8388608, local13);
				this.method4340(local4, 134217728, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4340(local4, 33554432, local13);
				this.method4340(local4 + 1, 536870912, local13);
			}
			if (arg2 == 3) {
				this.method4340(local4, 134217728, local13);
				this.method4340(local4, 8388608, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				this.method4340(local4, 4194304, local13);
				this.method4340(local4 - 1, 67108864, local13 + 1);
			}
			if (arg2 == 1) {
				this.method4340(local4, 16777216, local13);
				this.method4340(local4 + 1, 268435456, local13 + 1);
			}
			if (arg2 == 2) {
				this.method4340(local4, 67108864, local13);
				this.method4340(local4 + 1, 4194304, local13 - 1);
			}
			if (arg2 == 3) {
				this.method4340(local4, 268435456, local13);
				this.method4340(local4 - 1, 16777216, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method4340(local4, 545259520, local13);
			this.method4340(local4 - 1, 33554432, local13);
			this.method4340(local4, 134217728, local13 + 1);
		}
		if (arg2 == 1) {
			this.method4340(local4, 41943040, local13);
			this.method4340(local4, 134217728, local13 + 1);
			this.method4340(local4 + 1, 536870912, local13);
		}
		if (arg2 == 2) {
			this.method4340(local4, 167772160, local13);
			this.method4340(local4 + 1, 536870912, local13);
			this.method4340(local4, 8388608, local13 - 1);
		}
		if (arg2 == 3) {
			this.method4340(local4, 671088640, local13);
			this.method4340(local4, 8388608, local13 - 1);
			this.method4340(local4 - 1, 33554432, local13);
			return;
		}
	}
}
