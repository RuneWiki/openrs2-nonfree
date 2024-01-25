import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class220 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt6290;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public int anInt6291;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt6298;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt6303;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public void method5072() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6291; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt6290; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt6291 - 5 || this.anInt6290 - 5 <= local11) {
					this.anIntArrayArray66[local7][local11] = -1;
				} else {
					this.anIntArrayArray66[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public void method5073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6298;
		@Pc(9) int local9 = arg1 - this.anInt6303;
		this.anIntArrayArray66[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIBZI)V")
	public void method5074(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = arg3 - this.anInt6298;
		@Pc(18) int local18 = arg5 - this.anInt6303;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5088(local18, 128, local13);
				this.method5088(local18, 8, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5088(local18, 2, local13);
				this.method5088(local18 + 1, 32, local13);
			}
			if (arg1 == 2) {
				this.method5088(local18, 8, local13);
				this.method5088(local18, 128, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5088(local18, 32, local13);
				this.method5088(local18 - 1, 2, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5088(local18, 1, local13);
				this.method5088(local18 + 1, 16, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5088(local18, 4, local13);
				this.method5088(local18 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5088(local18, 16, local13);
				this.method5088(local18 - 1, 1, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5088(local18, 64, local13);
				this.method5088(local18 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method5088(local18, 130, local13);
				this.method5088(local18, 8, local13 - 1);
				this.method5088(local18 + 1, 32, local13);
			}
			if (arg1 == 1) {
				this.method5088(local18, 10, local13);
				this.method5088(local18 + 1, 32, local13);
				this.method5088(local18, 128, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5088(local18, 40, local13);
				this.method5088(local18, 128, local13 + 1);
				this.method5088(local18 - 1, 2, local13);
			}
			if (arg1 == 3) {
				this.method5088(local18, 160, local13);
				this.method5088(local18 - 1, 2, local13);
				this.method5088(local18, 8, local13 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method5088(local18, 65536, local13);
					this.method5088(local18, 4096, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5088(local18, 1024, local13);
					this.method5088(local18 + 1, 16384, local13);
				}
				if (arg1 == 2) {
					this.method5088(local18, 4096, local13);
					this.method5088(local18, 65536, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5088(local18, 16384, local13);
					this.method5088(local18 - 1, 1024, local13);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method5088(local18, 512, local13);
					this.method5088(local18 + 1, 8192, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5088(local18, 2048, local13);
					this.method5088(local18 + 1, 32768, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5088(local18, 8192, local13);
					this.method5088(local18 - 1, 512, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5088(local18, 32768, local13);
					this.method5088(local18 - 1, 2048, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method5088(local18, 66560, local13);
					this.method5088(local18, 4096, local13 - 1);
					this.method5088(local18 + 1, 16384, local13);
				}
				if (arg1 == 1) {
					this.method5088(local18, 5120, local13);
					this.method5088(local18 + 1, 16384, local13);
					this.method5088(local18, 65536, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5088(local18, 20480, local13);
					this.method5088(local18, 65536, local13 + 1);
					this.method5088(local18 - 1, 1024, local13);
				}
				if (arg1 == 3) {
					this.method5088(local18, 81920, local13);
					this.method5088(local18 - 1, 1024, local13);
					this.method5088(local18, 4096, local13 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5088(local18, 536870912, local13);
				this.method5088(local18, 33554432, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5088(local18, 8388608, local13);
				this.method5088(local18 + 1, 134217728, local13);
			}
			if (arg1 == 2) {
				this.method5088(local18, 33554432, local13);
				this.method5088(local18, 536870912, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5088(local18, 134217728, local13);
				this.method5088(local18 - 1, 8388608, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5088(local18, 4194304, local13);
				this.method5088(local18 + 1, 67108864, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5088(local18, 16777216, local13);
				this.method5088(local18 + 1, 268435456, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5088(local18, 67108864, local13);
				this.method5088(local18 - 1, 4194304, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5088(local18, 268435456, local13);
				this.method5088(local18 - 1, 16777216, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5088(local18, 545259520, local13);
			this.method5088(local18, 33554432, local13 - 1);
			this.method5088(local18 + 1, 134217728, local13);
		}
		if (arg1 == 1) {
			this.method5088(local18, 41943040, local13);
			this.method5088(local18 + 1, 134217728, local13);
			this.method5088(local18, 536870912, local13 + 1);
		}
		if (arg1 == 2) {
			this.method5088(local18, 167772160, local13);
			this.method5088(local18, 536870912, local13 + 1);
			this.method5088(local18 - 1, 8388608, local13);
		}
		if (arg1 == 3) {
			this.method5088(local18, 671088640, local13);
			this.method5088(local18 - 1, 8388608, local13);
			this.method5088(local18, 33554432, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIIZBI)V")
	public void method5075(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt6303;
		@Pc(9) int local9 = arg0 - this.anInt6298;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method5086(local9, 128, local4);
				this.method5086(local9 - 1, 8, local4);
			}
			if (arg3 == 1) {
				this.method5086(local9, 2, local4);
				this.method5086(local9, 32, local4 + 1);
			}
			if (arg3 == 2) {
				this.method5086(local9, 8, local4);
				this.method5086(local9 + 1, 128, local4);
			}
			if (arg3 == 3) {
				this.method5086(local9, 32, local4);
				this.method5086(local9, 2, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method5086(local9, 1, local4);
				this.method5086(local9 - 1, 16, local4 + 1);
			}
			if (arg3 == 1) {
				this.method5086(local9, 4, local4);
				this.method5086(local9 + 1, 64, local4 + 1);
			}
			if (arg3 == 2) {
				this.method5086(local9, 16, local4);
				this.method5086(local9 + 1, 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method5086(local9, 64, local4);
				this.method5086(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method5086(local9, 130, local4);
				this.method5086(local9 - 1, 8, local4);
				this.method5086(local9, 32, local4 + 1);
			}
			if (arg3 == 1) {
				this.method5086(local9, 10, local4);
				this.method5086(local9, 32, local4 + 1);
				this.method5086(local9 + 1, 128, local4);
			}
			if (arg3 == 2) {
				this.method5086(local9, 40, local4);
				this.method5086(local9 + 1, 128, local4);
				this.method5086(local9, 2, local4 - 1);
			}
			if (arg3 == 3) {
				this.method5086(local9, 160, local4);
				this.method5086(local9, 2, local4 - 1);
				this.method5086(local9 - 1, 8, local4);
			}
		}
		if (arg4) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					this.method5086(local9, 65536, local4);
					this.method5086(local9 - 1, 4096, local4);
				}
				if (arg3 == 1) {
					this.method5086(local9, 1024, local4);
					this.method5086(local9, 16384, local4 + 1);
				}
				if (arg3 == 2) {
					this.method5086(local9, 4096, local4);
					this.method5086(local9 + 1, 65536, local4);
				}
				if (arg3 == 3) {
					this.method5086(local9, 16384, local4);
					this.method5086(local9, 1024, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg3 == 0) {
					this.method5086(local9, 512, local4);
					this.method5086(local9 - 1, 8192, local4 + 1);
				}
				if (arg3 == 1) {
					this.method5086(local9, 2048, local4);
					this.method5086(local9 + 1, 32768, local4 + 1);
				}
				if (arg3 == 2) {
					this.method5086(local9, 8192, local4);
					this.method5086(local9 + 1, 512, local4 - 1);
				}
				if (arg3 == 3) {
					this.method5086(local9, 32768, local4);
					this.method5086(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					this.method5086(local9, 66560, local4);
					this.method5086(local9 - 1, 4096, local4);
					this.method5086(local9, 16384, local4 + 1);
				}
				if (arg3 == 1) {
					this.method5086(local9, 5120, local4);
					this.method5086(local9, 16384, local4 + 1);
					this.method5086(local9 + 1, 65536, local4);
				}
				if (arg3 == 2) {
					this.method5086(local9, 20480, local4);
					this.method5086(local9 + 1, 65536, local4);
					this.method5086(local9, 1024, local4 - 1);
				}
				if (arg3 == 3) {
					this.method5086(local9, 81920, local4);
					this.method5086(local9, 1024, local4 - 1);
					this.method5086(local9 - 1, 4096, local4);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method5086(local9, 536870912, local4);
				this.method5086(local9 - 1, 33554432, local4);
			}
			if (arg3 == 1) {
				this.method5086(local9, 8388608, local4);
				this.method5086(local9, 134217728, local4 + 1);
			}
			if (arg3 == 2) {
				this.method5086(local9, 33554432, local4);
				this.method5086(local9 + 1, 536870912, local4);
			}
			if (arg3 == 3) {
				this.method5086(local9, 134217728, local4);
				this.method5086(local9, 8388608, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method5086(local9, 4194304, local4);
				this.method5086(local9 - 1, 67108864, local4 + 1);
			}
			if (arg3 == 1) {
				this.method5086(local9, 16777216, local4);
				this.method5086(local9 + 1, 268435456, local4 + 1);
			}
			if (arg3 == 2) {
				this.method5086(local9, 67108864, local4);
				this.method5086(local9 + 1, 4194304, local4 - 1);
			}
			if (arg3 == 3) {
				this.method5086(local9, 268435456, local4);
				this.method5086(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method5086(local9, 545259520, local4);
			this.method5086(local9 - 1, 33554432, local4);
			this.method5086(local9, 134217728, local4 + 1);
		}
		if (arg3 == 1) {
			this.method5086(local9, 41943040, local4);
			this.method5086(local9, 134217728, local4 + 1);
			this.method5086(local9 + 1, 536870912, local4);
		}
		if (arg3 == 2) {
			this.method5086(local9, 167772160, local4);
			this.method5086(local9 + 1, 536870912, local4);
			this.method5086(local9, 8388608, local4 - 1);
		}
		if (arg3 == 3) {
			this.method5086(local9, 671088640, local4);
			this.method5086(local9, 8388608, local4 - 1);
			this.method5086(local9 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
	public void method5076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6298;
		@Pc(9) int local9 = arg0 - this.anInt6303;
		this.anIntArrayArray66[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg6 + arg1;
		@Pc(13) int local13 = arg7 + arg2;
		@Pc(17) int local17 = arg8 + arg3;
		@Pc(26) int local26 = arg0 + arg4;
		@Pc(48) int local48;
		@Pc(59) int local59;
		if (local17 == arg1 && (arg5 & 0x2) == 0) {
			local48 = arg4 >= arg2 ? arg4 : arg2;
			local59 = local26 <= local13 ? local26 : local13;
			while (local48 < local59) {
				if ((this.anIntArrayArray66[local17 - this.anInt6298 - 1][local48 - this.anInt6303] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local9 == arg3 && (arg5 & 0x8) == 0) {
			local48 = arg4 >= arg2 ? arg4 : arg2;
			local59 = local26 <= local13 ? local26 : local13;
			while (local59 > local48) {
				if ((this.anIntArrayArray66[arg3 - this.anInt6298][local48 - this.anInt6303] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local26 == arg2 && (arg5 & 0x1) == 0) {
			local48 = arg3 < arg1 ? arg1 : arg3;
			local59 = local17 > local9 ? local9 : local17;
			while (local59 > local48) {
				if ((this.anIntArrayArray66[local48 - this.anInt6298][local26 - this.anInt6303 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg4 == local13 && (arg5 & 0x4) == 0) {
			local48 = arg1 <= arg3 ? arg3 : arg1;
			local59 = local9 < local17 ? local9 : local17;
			while (local59 > local48) {
				if ((this.anIntArrayArray66[local48 - this.anInt6298][arg4 - this.anInt6303] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)V")
	public void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6298;
		@Pc(13) int local13 = arg0 - this.anInt6303;
		this.anIntArrayArray66[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static391.method5552(arg2, arg5, arg4, arg7, arg0, arg1, arg4, arg6) ? true : this.method5078(arg5, arg1, arg2, arg6, arg7, arg3, arg4, arg4, arg0);
		}
		@Pc(46) int local46 = arg0 + arg6 - 1;
		@Pc(52) int local52 = arg5 + arg7 - 1;
		if (arg1 >= arg6 && local46 >= arg1 && arg2 >= arg7 && arg2 <= local52) {
			return true;
		} else if (arg1 == arg6 - 1 && arg2 >= arg7 && local52 >= arg2 && (this.anIntArrayArray66[arg1 - this.anInt6298][arg2 - this.anInt6303] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg1 && arg2 >= arg7 && local52 >= arg2 && (this.anIntArrayArray66[arg1 - this.anInt6298][arg2 - this.anInt6303] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg2 && arg1 >= arg6 && local46 >= arg1 && (this.anIntArrayArray66[arg1 - this.anInt6298][arg2 - this.anInt6303] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local52 + 1 && arg1 >= arg6 && arg1 <= local46 && (this.anIntArrayArray66[arg1 - this.anInt6298][arg2 - this.anInt6303] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg6 && arg0 == arg1) {
				return true;
			}
		} else if (arg4 >= arg6 && arg6 + arg5 - 1 >= arg4 && arg0 >= arg0 && arg0 <= arg0 + arg5 - 1) {
			return true;
		}
		@Pc(66) int local66 = arg6 - this.anInt6298;
		@Pc(71) int local71 = arg4 - this.anInt6298;
		@Pc(76) int local76 = arg1 - this.anInt6303;
		@Pc(81) int local81 = arg0 - this.anInt6303;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					if (local66 == local71 - 1 && local76 == local81) {
						return true;
					}
					if (local71 == local66 && local81 + 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 && local81 - 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local71 == local66 && local81 + 1 == local76) {
						return true;
					}
					if (local71 - 1 == local66 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local71 + 1 == local66 && local76 == local81) {
						return true;
					}
					if (local66 == local71 && local81 + 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 && local76 == local81 - 1 && (this.anIntArrayArray66[local66][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local71 == local66 && local76 == local81 - 1) {
						return true;
					}
					if (local71 - 1 == local66 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local81 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					if (local66 == local71 - 1 && local81 == local76) {
						return true;
					}
					if (local66 == local71 && local81 + 1 == local76) {
						return true;
					}
					if (local66 == local71 + 1 && local81 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local66 && local76 == local81 - 1 && (this.anIntArrayArray66[local66][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 == local71 - 1 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local66 && local76 == local81 + 1) {
						return true;
					}
					if (local66 == local71 + 1 && local81 == local76) {
						return true;
					}
					if (local71 == local66 && local81 - 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local71 - 1 == local66 && local81 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local66 && local76 == local81 + 1 && (this.anIntArrayArray66[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local76 == local81) {
						return true;
					}
					if (local71 == local66 && local81 - 1 == local76) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local71 - 1 == local66 && local81 == local76) {
						return true;
					}
					if (local71 == local66 && local81 + 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local66 && local76 == local81 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local66 == local71 && local81 + 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x20) == 0) {
					return true;
				}
				if (local66 == local71 && local81 - 1 == local76 && (this.anIntArrayArray66[local66][local76] & 0x2) == 0) {
					return true;
				}
				if (local66 == local71 - 1 && local76 == local81 && (this.anIntArrayArray66[local66][local76] & 0x8) == 0) {
					return true;
				}
				if (local66 == local71 + 1 && local81 == local76 && (this.anIntArrayArray66[local66][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(805) int local805 = arg5 + local66 - 1;
			@Pc(811) int local811 = arg5 + local76 - 1;
			if (arg3 == 0) {
				if (arg2 == 0) {
					if (local66 == local71 - arg5 && local76 <= local81 && local81 <= local811) {
						return true;
					}
					if (local66 <= local71 && local805 >= local71 && local76 == local81 + 1 && (this.anIntArrayArray66[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local805 && local81 - arg5 == local76 && (this.anIntArrayArray66[local71][local811] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local66 <= local71 && local71 <= local805 && local76 == local81 + 1) {
						return true;
					}
					if (local71 - arg5 == local66 && local76 <= local81 && local811 >= local81 && (this.anIntArrayArray66[local805][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 <= local81 && local81 <= local811 && (this.anIntArrayArray66[local66][local81] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local66 == local71 + 1 && local76 <= local81 && local811 >= local81) {
						return true;
					}
					if (local71 >= local66 && local71 <= local805 && local76 == local81 + 1 && (this.anIntArrayArray66[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local66 && local805 >= local71 && local76 == local81 - arg5 && (this.anIntArrayArray66[local71][local811] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local71 >= local66 && local71 <= local805 && local76 == local81 - arg5) {
						return true;
					}
					if (local66 == local71 - arg5 && local81 >= local76 && local81 <= local811 && (this.anIntArrayArray66[local805][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local81 >= local76 && local811 >= local81 && (this.anIntArrayArray66[local66][local81] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					if (local66 == local71 - arg5 && local81 >= local76 && local811 >= local81) {
						return true;
					}
					if (local71 >= local66 && local805 >= local71 && local81 + 1 == local76) {
						return true;
					}
					if (local71 + 1 == local66 && local81 >= local76 && local811 >= local81 && (this.anIntArrayArray66[local66][local81] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 <= local71 && local805 >= local71 && local81 - arg5 == local76 && (this.anIntArrayArray66[local71][local811] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local71 - arg5 == local66 && local76 <= local81 && local81 <= local811 && (this.anIntArrayArray66[local805][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local66 && local805 >= local71 && local81 + 1 == local76) {
						return true;
					}
					if (local71 + 1 == local66 && local81 >= local76 && local81 <= local811) {
						return true;
					}
					if (local66 <= local71 && local71 <= local805 && local81 - arg5 == local76 && (this.anIntArrayArray66[local71][local811] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local71 - arg5 == local66 && local76 <= local81 && local811 >= local81 && (this.anIntArrayArray66[local805][local81] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local805 && local76 == local81 + 1 && (this.anIntArrayArray66[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 <= local81 && local811 >= local81) {
						return true;
					}
					if (local66 <= local71 && local805 >= local71 && local81 - arg5 == local76) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local71 - arg5 == local66 && local76 <= local81 && local811 >= local81) {
						return true;
					}
					if (local71 >= local66 && local71 <= local805 && local76 == local81 + 1 && (this.anIntArrayArray66[local71][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local81 >= local76 && local811 >= local81 && (this.anIntArrayArray66[local66][local81] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local805 && local81 - arg5 == local76) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local71 >= local66 && local805 >= local71 && local81 + 1 == local76 && (this.anIntArrayArray66[local71][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 <= local71 && local805 >= local71 && local81 - arg5 == local76 && (this.anIntArrayArray66[local71][local811] & 0x2C0102) == 0) {
					return true;
				}
				if (local71 - arg5 == local66 && local81 >= local76 && local81 <= local811 && (this.anIntArrayArray66[local805][local81] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 + 1 == local66 && local81 >= local76 && local811 >= local81 && (this.anIntArrayArray66[local66][local81] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIBZII)V")
	public void method5084(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(28) int local28 = arg4 - this.anInt6303;
		@Pc(33) int local33 = arg2 - this.anInt6298;
		for (@Pc(35) int local35 = local33; local35 < local33 + arg1; local35++) {
			if (local35 >= 0 && this.anInt6291 > local35) {
				for (@Pc(48) int local48 = local28; local48 < arg5 + local28; local48++) {
					if (local48 >= 0 && this.anInt6290 > local48) {
						this.method5088(local48, local7, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZZIIIII)V")
	public void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt6298;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg0 - this.anInt6303;
		if (arg6 == 1 || arg6 == 3) {
			@Pc(37) int local37 = arg5;
			arg5 = arg3;
			arg3 = local37;
		}
		for (@Pc(51) int local51 = local18; local51 < arg5 + local18; local51++) {
			if (local51 >= 0 && this.anInt6291 > local51) {
				for (@Pc(65) int local65 = local29; local65 < local29 + arg3; local65++) {
					if (local65 >= 0 && local65 < this.anInt6290) {
						this.method5086(local51, local7, local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZ)V")
	private void method5086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray66[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)V")
	public void method5087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6298;
		@Pc(9) int local9 = arg1 - this.anInt6303;
		this.anIntArrayArray66[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	private void method5088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray66[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg6 && arg4 == arg1) {
				return true;
			}
		} else if (arg6 <= arg3 && arg6 + arg0 - 1 >= arg3 && arg1 >= arg1 && arg1 + arg0 - 1 >= arg1) {
			return true;
		}
		@Pc(57) int local57 = arg6 - this.anInt6298;
		@Pc(62) int local62 = arg4 - this.anInt6303;
		@Pc(72) int local72 = arg1 - this.anInt6303;
		@Pc(77) int local77 = arg3 - this.anInt6298;
		if (arg0 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local77 + 1 == local57 && local62 == local72 && (this.anIntArrayArray66[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local57 == local77 && local62 == local72 - 1 && (this.anIntArrayArray66[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local77 - 1 == local57 && local72 == local62 && (this.anIntArrayArray66[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 == local77 && local62 == local72 - 1 && (this.anIntArrayArray66[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local77 - 1 == local57 && local62 == local72 && (this.anIntArrayArray66[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 == local77 && local72 + 1 == local62 && (this.anIntArrayArray66[local57][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local77 + 1 == local57 && local72 == local62 && (this.anIntArrayArray66[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local57 == local77 && local72 + 1 == local62 && (this.anIntArrayArray66[local57][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 == local57 && local72 + 1 == local62 && (this.anIntArrayArray66[local57][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 == local77 && local72 - 1 == local62 && (this.anIntArrayArray66[local57][local62] & 0x2) == 0) {
					return true;
				}
				if (local77 - 1 == local57 && local72 == local62 && (this.anIntArrayArray66[local57][local62] & 0x8) == 0) {
					return true;
				}
				if (local57 == local77 + 1 && local72 == local62 && (this.anIntArrayArray66[local57][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(87) int local87 = local57 + arg0 - 1;
			@Pc(93) int local93 = arg0 + local62 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local57 == local77 + 1 && local62 <= local72 && local93 >= local72 && (this.anIntArrayArray66[local57][local72] & 0x80) == 0) {
						return true;
					}
					if (local77 >= local57 && local87 >= local77 && local72 - arg0 == local62 && (this.anIntArrayArray66[local77][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local57 == local77 - arg0 && local62 <= local72 && local93 >= local72 && (this.anIntArrayArray66[local87][local72] & 0x8) == 0) {
						return true;
					}
					if (local77 >= local57 && local77 <= local87 && local62 == local72 - arg0 && (this.anIntArrayArray66[local77][local93] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local77 - arg0 == local57 && local62 <= local72 && local72 <= local93 && (this.anIntArrayArray66[local87][local72] & 0x8) == 0) {
						return true;
					}
					if (local77 >= local57 && local77 <= local87 && local62 == local72 + 1 && (this.anIntArrayArray66[local77][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local77 + 1 == local57 && local62 <= local72 && local72 <= local93 && (this.anIntArrayArray66[local57][local72] & 0x80) == 0) {
						return true;
					}
					if (local57 <= local77 && local87 >= local77 && local72 + 1 == local62 && (this.anIntArrayArray66[local77][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local77 >= local57 && local77 <= local87 && local62 == local72 + 1 && (this.anIntArrayArray66[local77][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 <= local77 && local87 >= local77 && local62 == local72 - arg0 && (this.anIntArrayArray66[local77][local93] & 0x2) == 0) {
					return true;
				}
				if (local77 - arg0 == local57 && local72 >= local62 && local72 <= local93 && (this.anIntArrayArray66[local87][local72] & 0x8) == 0) {
					return true;
				}
				if (local57 == local77 + 1 && local62 <= local72 && local93 >= local72 && (this.anIntArrayArray66[local57][local72] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
