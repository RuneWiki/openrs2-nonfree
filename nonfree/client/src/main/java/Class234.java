import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class234 {

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!mja", name = "n", descriptor = "I")
	public int anInt6497;

	@OriginalMember(owner = "client!mja", name = "r", descriptor = "I")
	public int anInt6501;

	@OriginalMember(owner = "client!mja", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg3 + arg6;
		@Pc(18) int local18 = arg8 + arg2;
		@Pc(23) int local23 = arg0 + arg4;
		@Pc(27) int local27 = arg1 + arg5;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (local23 == arg3 && (arg7 & 0x2) == 0) {
			local48 = arg8 > arg5 ? arg8 : arg5;
			local55 = local18 < local27 ? local18 : local27;
			while (local48 < local55) {
				if ((this.anIntArrayArray50[local23 - this.anInt6497 - 1][local48 - this.anInt6490] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg0 == local7 && (arg7 & 0x8) == 0) {
			local48 = arg8 <= arg5 ? arg5 : arg8;
			local55 = local27 <= local18 ? local27 : local18;
			while (local48 < local55) {
				if ((this.anIntArrayArray50[arg0 - this.anInt6497][local48 - this.anInt6490] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local27 == arg8 && (arg7 & 0x1) == 0) {
			local48 = arg0 < arg3 ? arg3 : arg0;
			local55 = local23 > local7 ? local7 : local23;
			while (local55 > local48) {
				if ((this.anIntArrayArray50[local48 - this.anInt6497][local27 - this.anInt6490 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local18 == arg5 && (arg7 & 0x4) == 0) {
			local48 = arg3 <= arg0 ? arg0 : arg3;
			local55 = local23 <= local7 ? local23 : local7;
			while (local48 < local55) {
				if ((this.anIntArrayArray50[local48 - this.anInt6497][arg5 - this.anInt6490] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIZZ)V")
	public void method5444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(5) int local5 = 256;
		if (arg4) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg0 - this.anInt6497;
		if (arg5) {
			local5 |= 0x40000000;
		}
		@Pc(27) int local27 = arg3 - this.anInt6490;
		for (@Pc(33) int local33 = local16; local33 < local16 + arg2; local33++) {
			if (local33 >= 0 && this.anInt6501 > local33) {
				for (@Pc(49) int local49 = local27; local49 < local27 + arg1; local49++) {
					if (local49 >= 0 && local49 < this.anInt6489) {
						this.method5448(local5, local33, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIII)V")
	private void method5445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray50[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg3 && arg2 == arg6) {
				return true;
			}
		} else if (arg5 <= arg3 && arg4 + arg5 - 1 >= arg3 && arg2 <= arg2 && arg4 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(51) int local51 = arg6 - this.anInt6490;
		@Pc(56) int local56 = arg5 - this.anInt6497;
		@Pc(61) int local61 = arg2 - this.anInt6490;
		@Pc(72) int local72 = arg3 - this.anInt6497;
		if (arg4 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local56 == local72 + 1 && local61 == local51 && (this.anIntArrayArray50[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local56 == local72 && local51 == local61 - 1 && (this.anIntArrayArray50[local56][local51] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local56 == local72 - 1 && local51 == local61 && (this.anIntArrayArray50[local56][local51] & 0x8) == 0) {
						return true;
					}
					if (local56 == local72 && local51 == local61 - 1 && (this.anIntArrayArray50[local56][local51] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local56 == local72 - 1 && local51 == local61 && (this.anIntArrayArray50[local56][local51] & 0x8) == 0) {
						return true;
					}
					if (local56 == local72 && local51 == local61 + 1 && (this.anIntArrayArray50[local56][local51] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local72 + 1 == local56 && local61 == local51 && (this.anIntArrayArray50[local56][local51] & 0x80) == 0) {
						return true;
					}
					if (local72 == local56 && local61 + 1 == local51 && (this.anIntArrayArray50[local56][local51] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local56 == local72 && local61 + 1 == local51 && (this.anIntArrayArray50[local56][local51] & 0x20) == 0) {
					return true;
				}
				if (local72 == local56 && local51 == local61 - 1 && (this.anIntArrayArray50[local56][local51] & 0x2) == 0) {
					return true;
				}
				if (local72 - 1 == local56 && local51 == local61 && (this.anIntArrayArray50[local56][local51] & 0x8) == 0) {
					return true;
				}
				if (local72 + 1 == local56 && local61 == local51 && (this.anIntArrayArray50[local56][local51] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(402) int local402 = arg4 + local56 - 1;
			@Pc(408) int local408 = local51 + arg4 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local72 + 1 == local56 && local51 <= local61 && local61 <= local408 && (this.anIntArrayArray50[local56][local61] & 0x80) == 0) {
						return true;
					}
					if (local72 >= local56 && local72 <= local402 && local61 - arg4 == local51 && (this.anIntArrayArray50[local72][local408] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local56 == local72 - arg4 && local51 <= local61 && local408 >= local61 && (this.anIntArrayArray50[local402][local61] & 0x8) == 0) {
						return true;
					}
					if (local56 <= local72 && local72 <= local402 && local61 - arg4 == local51 && (this.anIntArrayArray50[local72][local408] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local56 == local72 - arg4 && local61 >= local51 && local61 <= local408 && (this.anIntArrayArray50[local402][local61] & 0x8) == 0) {
						return true;
					}
					if (local56 <= local72 && local402 >= local72 && local51 == local61 + 1 && (this.anIntArrayArray50[local72][local51] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local72 + 1 == local56 && local61 >= local51 && local61 <= local408 && (this.anIntArrayArray50[local56][local61] & 0x80) == 0) {
						return true;
					}
					if (local56 <= local72 && local72 <= local402 && local61 + 1 == local51 && (this.anIntArrayArray50[local72][local51] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local56 <= local72 && local72 <= local402 && local61 + 1 == local51 && (this.anIntArrayArray50[local72][local51] & 0x20) == 0) {
					return true;
				}
				if (local72 >= local56 && local72 <= local402 && local51 == local61 - arg4 && (this.anIntArrayArray50[local72][local408] & 0x2) == 0) {
					return true;
				}
				if (local72 - arg4 == local56 && local61 >= local51 && local61 <= local408 && (this.anIntArrayArray50[local402][local61] & 0x8) == 0) {
					return true;
				}
				if (local56 == local72 + 1 && local61 >= local51 && local61 <= local408 && (this.anIntArrayArray50[local56][local61] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIB)V")
	private void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray50[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIIZIZ)V")
	public void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg1 - this.anInt6490;
		@Pc(13) int local13 = arg0 - this.anInt6497;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5445(128, local8, local13);
				this.method5445(8, local8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method5445(2, local8, local13);
				this.method5445(32, local8 + 1, local13);
			}
			if (arg4 == 2) {
				this.method5445(8, local8, local13);
				this.method5445(128, local8, local13 + 1);
			}
			if (arg4 == 3) {
				this.method5445(32, local8, local13);
				this.method5445(2, local8 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5445(1, local8, local13);
				this.method5445(16, local8 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method5445(4, local8, local13);
				this.method5445(64, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5445(16, local8, local13);
				this.method5445(1, local8 - 1, local13 - -1);
			}
			if (arg4 == 3) {
				this.method5445(64, local8, local13);
				this.method5445(4, local8 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method5445(130, local8, local13);
				this.method5445(8, local8, local13 - 1);
				this.method5445(32, local8 + 1, local13);
			}
			if (arg4 == 1) {
				this.method5445(10, local8, local13);
				this.method5445(32, local8 + 1, local13);
				this.method5445(128, local8, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5445(40, local8, local13);
				this.method5445(128, local8, local13 + 1);
				this.method5445(2, local8 - 1, local13);
			}
			if (arg4 == 3) {
				this.method5445(160, local8, local13);
				this.method5445(2, local8 - 1, local13);
				this.method5445(8, local8, local13 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method5445(65536, local8, local13);
					this.method5445(4096, local8, local13 - 1);
				}
				if (arg4 == 1) {
					this.method5445(1024, local8, local13);
					this.method5445(16384, local8 + 1, local13);
				}
				if (arg4 == 2) {
					this.method5445(4096, local8, local13);
					this.method5445(65536, local8, local13 + 1);
				}
				if (arg4 == 3) {
					this.method5445(16384, local8, local13);
					this.method5445(1024, local8 - 1, local13);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method5445(512, local8, local13);
					this.method5445(8192, local8 + 1, local13 + -1);
				}
				if (arg4 == 1) {
					this.method5445(2048, local8, local13);
					this.method5445(32768, local8 + 1, local13 + 1);
				}
				if (arg4 == 2) {
					this.method5445(8192, local8, local13);
					this.method5445(512, local8 - 1, local13 - -1);
				}
				if (arg4 == 3) {
					this.method5445(32768, local8, local13);
					this.method5445(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method5445(66560, local8, local13);
					this.method5445(4096, local8, local13 - 1);
					this.method5445(16384, local8 + 1, local13);
				}
				if (arg4 == 1) {
					this.method5445(5120, local8, local13);
					this.method5445(16384, local8 + 1, local13);
					this.method5445(65536, local8, local13 + 1);
				}
				if (arg4 == 2) {
					this.method5445(20480, local8, local13);
					this.method5445(65536, local8, local13 + 1);
					this.method5445(1024, local8 - 1, local13);
				}
				if (arg4 == 3) {
					this.method5445(81920, local8, local13);
					this.method5445(1024, local8 - 1, local13);
					this.method5445(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5445(536870912, local8, local13);
				this.method5445(33554432, local8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method5445(8388608, local8, local13);
				this.method5445(134217728, local8 + 1, local13);
			}
			if (arg4 == 2) {
				this.method5445(33554432, local8, local13);
				this.method5445(536870912, local8, local13 + 1);
			}
			if (arg4 == 3) {
				this.method5445(134217728, local8, local13);
				this.method5445(8388608, local8 - 1, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5445(4194304, local8, local13);
				this.method5445(67108864, local8 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method5445(16777216, local8, local13);
				this.method5445(268435456, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5445(67108864, local8, local13);
				this.method5445(4194304, local8 - 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method5445(268435456, local8, local13);
				this.method5445(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5445(545259520, local8, local13);
			this.method5445(33554432, local8, local13 - 1);
			this.method5445(134217728, local8 + 1, local13);
		}
		if (arg4 == 1) {
			this.method5445(41943040, local8, local13);
			this.method5445(134217728, local8 + 1, local13);
			this.method5445(536870912, local8, local13 + 1);
		}
		if (arg4 == 2) {
			this.method5445(167772160, local8, local13);
			this.method5445(536870912, local8, local13 + 1);
			this.method5445(8388608, local8 - 1, local13);
		}
		if (arg4 == 3) {
			this.method5445(671088640, local8, local13);
			this.method5445(8388608, local8 - 1, local13);
			this.method5445(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIZIIZI)V")
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt6497;
		@Pc(25) int local25 = arg5 - this.anInt6490;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method5448(128, local4, local25);
				this.method5448(8, local4 - 1, local25);
			}
			if (arg1 == 1) {
				this.method5448(2, local4, local25);
				this.method5448(32, local4, local25 + 1);
			}
			if (arg1 == 2) {
				this.method5448(8, local4, local25);
				this.method5448(128, local4 + 1, local25);
			}
			if (arg1 == 3) {
				this.method5448(32, local4, local25);
				this.method5448(2, local4, local25 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method5448(1, local4, local25);
				this.method5448(16, local4 - 1, local25 + 1);
			}
			if (arg1 == 1) {
				this.method5448(4, local4, local25);
				this.method5448(64, local4 + 1, local25 - -1);
			}
			if (arg1 == 2) {
				this.method5448(16, local4, local25);
				this.method5448(1, local4 + 1, local25 + -1);
			}
			if (arg1 == 3) {
				this.method5448(64, local4, local25);
				this.method5448(4, local4 - 1, local25 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.method5448(130, local4, local25);
				this.method5448(8, local4 - 1, local25);
				this.method5448(32, local4, local25 + 1);
			}
			if (arg1 == 1) {
				this.method5448(10, local4, local25);
				this.method5448(32, local4, local25 + 1);
				this.method5448(128, local4 + 1, local25);
			}
			if (arg1 == 2) {
				this.method5448(40, local4, local25);
				this.method5448(128, local4 + 1, local25);
				this.method5448(2, local4, local25 - 1);
			}
			if (arg1 == 3) {
				this.method5448(160, local4, local25);
				this.method5448(2, local4, local25 - 1);
				this.method5448(8, local4 - 1, local25);
			}
		}
		if (arg2) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					this.method5448(65536, local4, local25);
					this.method5448(4096, local4 - 1, local25);
				}
				if (arg1 == 1) {
					this.method5448(1024, local4, local25);
					this.method5448(16384, local4, local25 + 1);
				}
				if (arg1 == 2) {
					this.method5448(4096, local4, local25);
					this.method5448(65536, local4 + 1, local25);
				}
				if (arg1 == 3) {
					this.method5448(16384, local4, local25);
					this.method5448(1024, local4, local25 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					this.method5448(512, local4, local25);
					this.method5448(8192, local4 - 1, local25 + 1);
				}
				if (arg1 == 1) {
					this.method5448(2048, local4, local25);
					this.method5448(32768, local4 + 1, local25 + 1);
				}
				if (arg1 == 2) {
					this.method5448(8192, local4, local25);
					this.method5448(512, local4 + 1, local25 - 1);
				}
				if (arg1 == 3) {
					this.method5448(32768, local4, local25);
					this.method5448(2048, local4 - 1, local25 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					this.method5448(66560, local4, local25);
					this.method5448(4096, local4 - 1, local25);
					this.method5448(16384, local4, local25 + 1);
				}
				if (arg1 == 1) {
					this.method5448(5120, local4, local25);
					this.method5448(16384, local4, local25 + 1);
					this.method5448(65536, local4 + 1, local25);
				}
				if (arg1 == 2) {
					this.method5448(20480, local4, local25);
					this.method5448(65536, local4 + 1, local25);
					this.method5448(1024, local4, local25 - 1);
				}
				if (arg1 == 3) {
					this.method5448(81920, local4, local25);
					this.method5448(1024, local4, local25 - 1);
					this.method5448(4096, local4 - 1, local25);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.method5448(536870912, local4, local25);
				this.method5448(33554432, local4 - 1, local25);
			}
			if (arg1 == 1) {
				this.method5448(8388608, local4, local25);
				this.method5448(134217728, local4, local25 + 1);
			}
			if (arg1 == 2) {
				this.method5448(33554432, local4, local25);
				this.method5448(536870912, local4 + 1, local25);
			}
			if (arg1 == 3) {
				this.method5448(134217728, local4, local25);
				this.method5448(8388608, local4, local25 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.method5448(4194304, local4, local25);
				this.method5448(67108864, local4 - 1, local25 + 1);
			}
			if (arg1 == 1) {
				this.method5448(16777216, local4, local25);
				this.method5448(268435456, local4 + 1, local25 + 1);
			}
			if (arg1 == 2) {
				this.method5448(67108864, local4, local25);
				this.method5448(4194304, local4 + 1, local25 + -1);
			}
			if (arg1 == 3) {
				this.method5448(268435456, local4, local25);
				this.method5448(16777216, local4 - 1, local25 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5448(545259520, local4, local25);
			this.method5448(33554432, local4 - 1, local25);
			this.method5448(134217728, local4, local25 + 1);
		}
		if (arg1 == 1) {
			this.method5448(41943040, local4, local25);
			this.method5448(134217728, local4, local25 + 1);
			this.method5448(536870912, local4 + 1, local25);
		}
		if (arg1 == 2) {
			this.method5448(167772160, local4, local25);
			this.method5448(536870912, local4 + 1, local25);
			this.method5448(8388608, local4, local25 - 1);
		}
		if (arg1 == 3) {
			this.method5448(671088640, local4, local25);
			this.method5448(8388608, local4, local25 - 1);
			this.method5448(33554432, local4 - 1, local25);
			return;
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(III)V")
	public void method5452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - this.anInt6490;
		@Pc(18) int local18 = arg1 - this.anInt6497;
		this.anIntArrayArray50[local18][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V")
	public void method5453() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6501; local9++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt6489; local12++) {
				if (local9 == 0 || local12 == 0 || local9 >= this.anInt6501 - 5 || local12 >= this.anInt6489 - 5) {
					this.anIntArrayArray50[local9][local12] = -1;
				} else {
					this.anIntArrayArray50[local9][local12] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg5 && arg6 == arg4) {
				return true;
			}
		} else if (arg5 >= arg3 && arg0 + arg3 - 1 >= arg5 && arg6 >= arg6 && arg6 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(54) int local54 = arg4 - this.anInt6490;
		@Pc(59) int local59 = arg3 - this.anInt6497;
		@Pc(64) int local64 = arg6 - this.anInt6490;
		@Pc(69) int local69 = arg5 - this.anInt6497;
		if (arg0 == 1) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local69 - 1 == local59 && local54 == local64) {
						return true;
					}
					if (local59 == local69 && local54 == local64 + 1 && (this.anIntArrayArray50[local59][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local69 && local54 == local64 - 1 && (this.anIntArrayArray50[local59][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local59 == local69 && local54 == local64 + 1) {
						return true;
					}
					if (local59 == local69 - 1 && local54 == local64 && (this.anIntArrayArray50[local59][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local54 == local64 && (this.anIntArrayArray50[local59][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local69 + 1 == local59 && local64 == local54) {
						return true;
					}
					if (local59 == local69 && local64 + 1 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local69 && local64 - 1 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local69 == local59 && local54 == local64 - 1) {
						return true;
					}
					if (local69 - 1 == local59 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local69 + 1 && local54 == local64 && (this.anIntArrayArray50[local59][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local69 - 1 == local59 && local64 == local54) {
						return true;
					}
					if (local69 == local59 && local64 + 1 == local54) {
						return true;
					}
					if (local59 == local69 + 1 && local54 == local64 && (this.anIntArrayArray50[local59][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local69 && local54 == local64 - 1 && (this.anIntArrayArray50[local59][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local69 - 1 == local59 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local69 && local64 + 1 == local54) {
						return true;
					}
					if (local69 + 1 == local59 && local64 == local54) {
						return true;
					}
					if (local69 == local59 && local54 == local64 - 1 && (this.anIntArrayArray50[local59][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local69 - 1 == local59 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local69 && local64 + 1 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local54 == local64) {
						return true;
					}
					if (local69 == local59 && local64 - 1 == local54) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local69 - 1 == local59 && local64 == local54) {
						return true;
					}
					if (local59 == local69 && local54 == local64 + 1 && (this.anIntArrayArray50[local59][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local69 && local64 - 1 == local54) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local59 == local69 && local64 + 1 == local54 && (this.anIntArrayArray50[local59][local54] & 0x20) == 0) {
					return true;
				}
				if (local69 == local59 && local64 - 1 == local54 && (this.anIntArrayArray50[local59][local54] & 0x2) == 0) {
					return true;
				}
				if (local59 == local69 - 1 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local64 == local54 && (this.anIntArrayArray50[local59][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(786) int local786 = local59 + arg0 - 1;
			@Pc(793) int local793 = local54 + arg0 - 1;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local69 - arg0 == local59 && local64 >= local54 && local64 <= local793) {
						return true;
					}
					if (local59 <= local69 && local786 >= local69 && local54 == local64 + 1 && (this.anIntArrayArray50[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 >= local59 && local786 >= local69 && local64 - arg0 == local54 && (this.anIntArrayArray50[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local69 >= local59 && local69 <= local786 && local54 == local64 + 1) {
						return true;
					}
					if (local69 - arg0 == local59 && local64 >= local54 && local64 <= local793 && (this.anIntArrayArray50[local786][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local69 + 1 == local59 && local64 >= local54 && local793 >= local64) {
						return true;
					}
					if (local69 >= local59 && local69 <= local786 && local54 == local64 + 1 && (this.anIntArrayArray50[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local786 && local64 - arg0 == local54 && (this.anIntArrayArray50[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local69 >= local59 && local786 >= local69 && local64 - arg0 == local54) {
						return true;
					}
					if (local59 == local69 - arg0 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local786][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local54 <= local64 && local793 >= local64 && (this.anIntArrayArray50[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local69 - arg0 == local59 && local64 >= local54 && local793 >= local64) {
						return true;
					}
					if (local69 >= local59 && local786 >= local69 && local54 == local64 + 1) {
						return true;
					}
					if (local69 + 1 == local59 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local69 && local786 >= local69 && local54 == local64 - arg0 && (this.anIntArrayArray50[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local69 - arg0 == local59 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local786][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 <= local69 && local786 >= local69 && local64 + 1 == local54) {
						return true;
					}
					if (local59 == local69 + 1 && local64 >= local54 && local64 <= local793) {
						return true;
					}
					if (local59 <= local69 && local786 >= local69 && local64 - arg0 == local54 && (this.anIntArrayArray50[local69][local793] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local69 - arg0 == local59 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local786][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 >= local59 && local69 <= local786 && local64 + 1 == local54 && (this.anIntArrayArray50[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 + 1 == local59 && local54 <= local64 && local793 >= local64) {
						return true;
					}
					if (local69 >= local59 && local786 >= local69 && local54 == local64 - arg0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local59 == local69 - arg0 && local64 >= local54 && local793 >= local64) {
						return true;
					}
					if (local69 >= local59 && local69 <= local786 && local54 == local64 + 1 && (this.anIntArrayArray50[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local69 + 1 && local64 >= local54 && local793 >= local64 && (this.anIntArrayArray50[local59][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 <= local69 && local786 >= local69 && local64 - arg0 == local54) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local59 <= local69 && local69 <= local786 && local64 + 1 == local54 && (this.anIntArrayArray50[local69][local54] & 0x2C0120) == 0) {
					return true;
				}
				if (local69 >= local59 && local786 >= local69 && local64 - arg0 == local54 && (this.anIntArrayArray50[local69][local793] & 0x2C0102) == 0) {
					return true;
				}
				if (local69 - arg0 == local59 && local54 <= local64 && local64 <= local793 && (this.anIntArrayArray50[local786][local64] & 0x2C0108) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local64 >= local54 && local64 <= local793 && (this.anIntArrayArray50[local59][local64] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZZIIIII)V")
	public void method5456(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 256;
		if (arg0) {
			local5 = 131328;
		}
		@Pc(16) int local16 = arg6 - this.anInt6497;
		if (arg1) {
			local5 |= 0x40000000;
		}
		@Pc(27) int local27 = arg4 - this.anInt6490;
		if (arg3 == 1 || arg3 == 3) {
			@Pc(35) int local35 = arg2;
			arg2 = arg5;
			arg5 = local35;
		}
		for (@Pc(49) int local49 = local16; local49 < arg2 + local16; local49++) {
			if (local49 >= 0 && this.anInt6501 > local49) {
				for (@Pc(65) int local65 = local27; local65 < local27 + arg5; local65++) {
					if (local65 >= 0 && local65 < this.anInt6489) {
						this.method5445(local5, local65, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IBIIIIIII)Z")
	public boolean method5457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static329.method5103(arg3, arg3, arg1, arg2, arg5, arg6, arg0, arg7) ? true : this.method5442(arg6, arg1, arg3, arg7, arg5, arg0, arg3, arg4, arg2);
		}
		@Pc(39) int local39 = arg6 + arg5 - 1;
		@Pc(45) int local45 = arg1 + arg0 - 1;
		if (arg6 <= arg7 && local39 >= arg7 && arg0 <= arg2 && arg2 <= local45) {
			return true;
		} else if (arg6 - 1 == arg7 && arg2 >= arg0 && local45 >= arg2 && (this.anIntArrayArray50[arg7 - this.anInt6497][arg2 - this.anInt6490] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg7 && arg0 <= arg2 && arg2 <= local45 && (this.anIntArrayArray50[arg7 - this.anInt6497][arg2 - this.anInt6490] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg2 == arg0 - 1 && arg6 <= arg7 && arg7 <= local39 && (this.anIntArrayArray50[arg7 - this.anInt6497][arg2 - this.anInt6490] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg2 && arg6 <= arg7 && arg7 <= local39 && (this.anIntArrayArray50[arg7 - this.anInt6497][arg2 - this.anInt6490] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIZ)V")
	public void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6490;
		@Pc(9) int local9 = arg1 - this.anInt6497;
		this.anIntArrayArray50[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZI)V")
	public void method5459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6497;
		@Pc(18) int local18 = arg0 - this.anInt6490;
		this.anIntArrayArray50[local4][local18] |= 0x40000;
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(III)V")
	public void method5460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6490;
		@Pc(9) int local9 = arg0 - this.anInt6497;
		this.anIntArrayArray50[local9][local4] &= 0xFFFBFFFF;
	}
}
