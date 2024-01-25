import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class240 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public int anInt6066;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public int anInt6070;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
	public int anInt6073;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	public int anInt6083;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg2 == arg6 && arg4 == arg3) {
				return true;
			}
		} else if (arg6 >= arg2 && arg6 <= arg2 + arg1 - 1 && arg4 >= arg4 && arg4 <= arg1 + arg4 - 1) {
			return true;
		}
		@Pc(44) int local44 = arg3 - this.anInt6073;
		@Pc(49) int local49 = arg6 - this.anInt6066;
		@Pc(70) int local70 = arg2 - this.anInt6066;
		@Pc(75) int local75 = arg4 - this.anInt6073;
		if (arg1 == 1) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local70 == local49 - 1 && local44 == local75) {
						return true;
					}
					if (local49 == local70 && local75 + 1 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local49 == local70 && local44 == local75 - 1 && (this.anIntArrayArray40[local70][local44] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 == local49 && local75 + 1 == local44) {
						return true;
					}
					if (local70 == local49 - 1 && local44 == local75 && (this.anIntArrayArray40[local70][local44] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local75 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local49 + 1 == local70 && local44 == local75) {
						return true;
					}
					if (local49 == local70 && local44 == local75 + 1 && (this.anIntArrayArray40[local70][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local49 && local75 - 1 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local49 == local70 && local75 - 1 == local44) {
						return true;
					}
					if (local49 - 1 == local70 && local44 == local75 && (this.anIntArrayArray40[local70][local44] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local75 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local70 == local49 - 1 && local75 == local44) {
						return true;
					}
					if (local70 == local49 && local75 + 1 == local44) {
						return true;
					}
					if (local70 == local49 + 1 && local44 == local75 && (this.anIntArrayArray40[local70][local44] & 0x2C0180) == 0) {
						return true;
					}
					if (local49 == local70 && local75 - 1 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local49 - 1 == local70 && local75 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local49 && local44 == local75 + 1) {
						return true;
					}
					if (local49 + 1 == local70 && local75 == local44) {
						return true;
					}
					if (local70 == local49 && local44 == local75 - 1 && (this.anIntArrayArray40[local70][local44] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local49 - 1 && local75 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0108) == 0) {
						return true;
					}
					if (local49 == local70 && local44 == local75 + 1 && (this.anIntArrayArray40[local70][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local75 == local44) {
						return true;
					}
					if (local49 == local70 && local44 == local75 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local49 - 1 == local70 && local44 == local75) {
						return true;
					}
					if (local49 == local70 && local44 == local75 + 1 && (this.anIntArrayArray40[local70][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local49 + 1 == local70 && local75 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2C0180) == 0) {
						return true;
					}
					if (local49 == local70 && local75 - 1 == local44) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local49 == local70 && local44 == local75 + 1 && (this.anIntArrayArray40[local70][local44] & 0x20) == 0) {
					return true;
				}
				if (local70 == local49 && local75 - 1 == local44 && (this.anIntArrayArray40[local70][local44] & 0x2) == 0) {
					return true;
				}
				if (local49 - 1 == local70 && local44 == local75 && (this.anIntArrayArray40[local70][local44] & 0x8) == 0) {
					return true;
				}
				if (local49 + 1 == local70 && local44 == local75 && (this.anIntArrayArray40[local70][local44] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(783) int local783 = arg1 + local70 - 1;
			@Pc(790) int local790 = local44 + arg1 - 1;
			if (arg0 == 0) {
				if (arg5 == 0) {
					if (local70 == local49 - arg1 && local75 >= local44 && local75 <= local790) {
						return true;
					}
					if (local49 >= local70 && local49 <= local783 && local44 == local75 + 1 && (this.anIntArrayArray40[local49][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local49 >= local70 && local783 >= local49 && local75 - arg1 == local44 && (this.anIntArrayArray40[local49][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 <= local49 && local783 >= local49 && local75 + 1 == local44) {
						return true;
					}
					if (local49 - arg1 == local70 && local75 >= local44 && local75 <= local790 && (this.anIntArrayArray40[local783][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local75 >= local44 && local75 <= local790 && (this.anIntArrayArray40[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local49 + 1 && local75 >= local44 && local75 <= local790) {
						return true;
					}
					if (local70 <= local49 && local783 >= local49 && local75 + 1 == local44 && (this.anIntArrayArray40[local49][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local49 >= local70 && local783 >= local49 && local44 == local75 - arg1 && (this.anIntArrayArray40[local49][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local49 >= local70 && local783 >= local49 && local75 - arg1 == local44) {
						return true;
					}
					if (local70 == local49 - arg1 && local44 <= local75 && local75 <= local790 && (this.anIntArrayArray40[local783][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local75 >= local44 && local75 <= local790 && (this.anIntArrayArray40[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					if (local70 == local49 - arg1 && local75 >= local44 && local790 >= local75) {
						return true;
					}
					if (local70 <= local49 && local783 >= local49 && local44 == local75 + 1) {
						return true;
					}
					if (local70 == local49 + 1 && local44 <= local75 && local75 <= local790 && (this.anIntArrayArray40[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local49 >= local70 && local49 <= local783 && local75 - arg1 == local44 && (this.anIntArrayArray40[local49][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 == local49 - arg1 && local44 <= local75 && local75 <= local790 && (this.anIntArrayArray40[local783][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local49 >= local70 && local783 >= local49 && local44 == local75 + 1) {
						return true;
					}
					if (local70 == local49 + 1 && local44 <= local75 && local790 >= local75) {
						return true;
					}
					if (local70 <= local49 && local49 <= local783 && local75 - arg1 == local44 && (this.anIntArrayArray40[local49][local790] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local49 - arg1 && local75 >= local44 && local790 >= local75 && (this.anIntArrayArray40[local783][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 <= local49 && local49 <= local783 && local44 == local75 + 1 && (this.anIntArrayArray40[local49][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local49 + 1 && local44 <= local75 && local75 <= local790) {
						return true;
					}
					if (local49 >= local70 && local49 <= local783 && local75 - arg1 == local44) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local49 - arg1 == local70 && local44 <= local75 && local75 <= local790) {
						return true;
					}
					if (local49 >= local70 && local783 >= local49 && local75 + 1 == local44 && (this.anIntArrayArray40[local49][local44] & 0x2C0120) == 0) {
						return true;
					}
					if (local49 + 1 == local70 && local75 >= local44 && local790 >= local75 && (this.anIntArrayArray40[local70][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 <= local49 && local783 >= local49 && local75 - arg1 == local44) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local49 >= local70 && local783 >= local49 && local44 == local75 + 1 && (this.anIntArrayArray40[local49][local44] & 0x2C0120) == 0) {
					return true;
				}
				if (local49 >= local70 && local49 <= local783 && local75 - arg1 == local44 && (this.anIntArrayArray40[local49][local790] & 0x2C0102) == 0) {
					return true;
				}
				if (local49 - arg1 == local70 && local75 >= local44 && local790 >= local75 && (this.anIntArrayArray40[local783][local75] & 0x2C0108) == 0) {
					return true;
				}
				if (local70 == local49 + 1 && local44 <= local75 && local75 <= local790 && (this.anIntArrayArray40[local70][local75] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZIZII)V")
	public void method5176(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 256;
		if (arg3) {
			local13 = 131328;
		}
		@Pc(24) int local24 = arg5 - this.anInt6073;
		@Pc(29) int local29 = arg2 - this.anInt6066;
		if (arg1) {
			local13 |= 0x40000000;
		}
		for (@Pc(37) int local37 = local29; local37 < local29 + arg0; local37++) {
			if (local37 >= 0 && this.anInt6070 > local37) {
				for (@Pc(50) int local50 = local24; local50 < arg4 + local24; local50++) {
					if (local50 >= 0 && local50 < this.anInt6083) {
						this.method5184(local50, local37, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 + arg5;
		@Pc(13) int local13 = arg0 + arg8;
		@Pc(29) int local29 = arg3 + arg6;
		@Pc(33) int local33 = arg1 + arg2;
		@Pc(58) int local58;
		@Pc(69) int local69;
		if (local29 == arg5 && (arg7 & 0x2) == 0) {
			local58 = arg0 > arg2 ? arg0 : arg2;
			local69 = local13 >= local33 ? local33 : local13;
			while (local69 > local58) {
				if ((this.anIntArrayArray40[local29 - this.anInt6066 - 1][local58 - this.anInt6073] & 0x8) == 0) {
					return true;
				}
				local58++;
			}
		} else if (local9 == arg6 && (arg7 & 0x8) == 0) {
			local58 = arg0 > arg2 ? arg0 : arg2;
			local69 = local33 > local13 ? local13 : local33;
			while (local69 > local58) {
				if ((this.anIntArrayArray40[arg6 - this.anInt6066][local58 - this.anInt6073] & 0x80) == 0) {
					return true;
				}
				local58++;
			}
		} else if (arg0 == local33 && (arg7 & 0x1) == 0) {
			local58 = arg5 > arg6 ? arg5 : arg6;
			local69 = local9 >= local29 ? local29 : local9;
			while (local58 < local69) {
				if ((this.anIntArrayArray40[local58 - this.anInt6066][local33 - this.anInt6073 - 1] & 0x2) == 0) {
					return true;
				}
				local58++;
			}
		} else if (arg2 == local13 && (arg7 & 0x4) == 0) {
			local58 = arg6 >= arg5 ? arg6 : arg5;
			local69 = local9 < local29 ? local9 : local29;
			while (local58 < local69) {
				if ((this.anIntArrayArray40[local58 - this.anInt6066][arg2 - this.anInt6073] & 0x20) == 0) {
					return true;
				}
				local58++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZIIIZZ)V")
	public void method5178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(13) int local13 = arg0 - this.anInt6066;
		@Pc(18) int local18 = arg3 - this.anInt6073;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5188(local18, 128, local13);
				this.method5188(local18, 8, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5188(local18, 2, local13);
				this.method5188(local18 + 1, 32, local13);
			}
			if (arg1 == 2) {
				this.method5188(local18, 8, local13);
				this.method5188(local18, 128, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5188(local18, 32, local13);
				this.method5188(local18 - 1, 2, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5188(local18, 1, local13);
				this.method5188(local18 + 1, 16, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5188(local18, 4, local13);
				this.method5188(local18 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5188(local18, 16, local13);
				this.method5188(local18 - 1, 1, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5188(local18, 64, local13);
				this.method5188(local18 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method5188(local18, 130, local13);
				this.method5188(local18, 8, local13 - 1);
				this.method5188(local18 + 1, 32, local13);
			}
			if (arg1 == 1) {
				this.method5188(local18, 10, local13);
				this.method5188(local18 + 1, 32, local13);
				this.method5188(local18, 128, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5188(local18, 40, local13);
				this.method5188(local18, 128, local13 + 1);
				this.method5188(local18 - 1, 2, local13);
			}
			if (arg1 == 3) {
				this.method5188(local18, 160, local13);
				this.method5188(local18 - 1, 2, local13);
				this.method5188(local18, 8, local13 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method5188(local18, 65536, local13);
					this.method5188(local18, 4096, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5188(local18, 1024, local13);
					this.method5188(local18 + 1, 16384, local13);
				}
				if (arg1 == 2) {
					this.method5188(local18, 4096, local13);
					this.method5188(local18, 65536, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5188(local18, 16384, local13);
					this.method5188(local18 - 1, 1024, local13);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method5188(local18, 512, local13);
					this.method5188(local18 + 1, 8192, local13 - 1);
				}
				if (arg1 == 1) {
					this.method5188(local18, 2048, local13);
					this.method5188(local18 + 1, 32768, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5188(local18, 8192, local13);
					this.method5188(local18 - 1, 512, local13 + 1);
				}
				if (arg1 == 3) {
					this.method5188(local18, 32768, local13);
					this.method5188(local18 - 1, 2048, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method5188(local18, 66560, local13);
					this.method5188(local18, 4096, local13 - 1);
					this.method5188(local18 + 1, 16384, local13);
				}
				if (arg1 == 1) {
					this.method5188(local18, 5120, local13);
					this.method5188(local18 + 1, 16384, local13);
					this.method5188(local18, 65536, local13 + 1);
				}
				if (arg1 == 2) {
					this.method5188(local18, 20480, local13);
					this.method5188(local18, 65536, local13 + 1);
					this.method5188(local18 - 1, 1024, local13);
				}
				if (arg1 == 3) {
					this.method5188(local18, 81920, local13);
					this.method5188(local18 - 1, 1024, local13);
					this.method5188(local18, 4096, local13 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method5188(local18, 536870912, local13);
				this.method5188(local18, 33554432, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5188(local18, 8388608, local13);
				this.method5188(local18 + 1, 134217728, local13);
			}
			if (arg1 == 2) {
				this.method5188(local18, 33554432, local13);
				this.method5188(local18, 536870912, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5188(local18, 134217728, local13);
				this.method5188(local18 - 1, 8388608, local13);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method5188(local18, 4194304, local13);
				this.method5188(local18 + 1, 67108864, local13 - 1);
			}
			if (arg1 == 1) {
				this.method5188(local18, 16777216, local13);
				this.method5188(local18 + 1, 268435456, local13 + 1);
			}
			if (arg1 == 2) {
				this.method5188(local18, 67108864, local13);
				this.method5188(local18 - 1, 4194304, local13 + 1);
			}
			if (arg1 == 3) {
				this.method5188(local18, 268435456, local13);
				this.method5188(local18 - 1, 16777216, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5188(local18, 545259520, local13);
			this.method5188(local18, 33554432, local13 - 1);
			this.method5188(local18 + 1, 134217728, local13);
		}
		if (arg1 == 1) {
			this.method5188(local18, 41943040, local13);
			this.method5188(local18 + 1, 134217728, local13);
			this.method5188(local18, 536870912, local13 + 1);
		}
		if (arg1 == 2) {
			this.method5188(local18, 167772160, local13);
			this.method5188(local18, 536870912, local13 + 1);
			this.method5188(local18 - 1, 8388608, local13);
		}
		if (arg1 == 3) {
			this.method5188(local18, 671088640, local13);
			this.method5188(local18 - 1, 8388608, local13);
			this.method5188(local18, 33554432, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)V")
	public void method5179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6066;
		@Pc(9) int local9 = arg0 - this.anInt6073;
		this.anIntArrayArray40[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIBZZI)V")
	public void method5180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg1 - this.anInt6073;
		@Pc(13) int local13 = arg2 - this.anInt6066;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method5184(local8, local13, 128);
				this.method5184(local8, local13 - 1, 8);
			}
			if (arg5 == 1) {
				this.method5184(local8, local13, 2);
				this.method5184(local8 + 1, local13, 32);
			}
			if (arg5 == 2) {
				this.method5184(local8, local13, 8);
				this.method5184(local8, local13 + 1, 128);
			}
			if (arg5 == 3) {
				this.method5184(local8, local13, 32);
				this.method5184(local8 - 1, local13, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method5184(local8, local13, 1);
				this.method5184(local8 + 1, local13 - 1, 16);
			}
			if (arg5 == 1) {
				this.method5184(local8, local13, 4);
				this.method5184(local8 + 1, local13 + 1, 64);
			}
			if (arg5 == 2) {
				this.method5184(local8, local13, 16);
				this.method5184(local8 - 1, local13 + 1, 1);
			}
			if (arg5 == 3) {
				this.method5184(local8, local13, 64);
				this.method5184(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method5184(local8, local13, 130);
				this.method5184(local8, local13 - 1, 8);
				this.method5184(local8 + 1, local13, 32);
			}
			if (arg5 == 1) {
				this.method5184(local8, local13, 10);
				this.method5184(local8 + 1, local13, 32);
				this.method5184(local8, local13 + 1, 128);
			}
			if (arg5 == 2) {
				this.method5184(local8, local13, 40);
				this.method5184(local8, local13 + 1, 128);
				this.method5184(local8 - 1, local13, 2);
			}
			if (arg5 == 3) {
				this.method5184(local8, local13, 160);
				this.method5184(local8 - 1, local13, 2);
				this.method5184(local8, local13 - 1, 8);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method5184(local8, local13, 65536);
					this.method5184(local8, local13 - 1, 4096);
				}
				if (arg5 == 1) {
					this.method5184(local8, local13, 1024);
					this.method5184(local8 + 1, local13, 16384);
				}
				if (arg5 == 2) {
					this.method5184(local8, local13, 4096);
					this.method5184(local8, local13 + 1, 65536);
				}
				if (arg5 == 3) {
					this.method5184(local8, local13, 16384);
					this.method5184(local8 - 1, local13, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method5184(local8, local13, 512);
					this.method5184(local8 + 1, local13 + -1, 8192);
				}
				if (arg5 == 1) {
					this.method5184(local8, local13, 2048);
					this.method5184(local8 + 1, local13 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method5184(local8, local13, 8192);
					this.method5184(local8 - 1, local13 + 1, 512);
				}
				if (arg5 == 3) {
					this.method5184(local8, local13, 32768);
					this.method5184(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method5184(local8, local13, 66560);
					this.method5184(local8, local13 - 1, 4096);
					this.method5184(local8 + 1, local13, 16384);
				}
				if (arg5 == 1) {
					this.method5184(local8, local13, 5120);
					this.method5184(local8 + 1, local13, 16384);
					this.method5184(local8, local13 + 1, 65536);
				}
				if (arg5 == 2) {
					this.method5184(local8, local13, 20480);
					this.method5184(local8, local13 + 1, 65536);
					this.method5184(local8 - 1, local13, 1024);
				}
				if (arg5 == 3) {
					this.method5184(local8, local13, 81920);
					this.method5184(local8 - 1, local13, 1024);
					this.method5184(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method5184(local8, local13, 536870912);
				this.method5184(local8, local13 - 1, 33554432);
			}
			if (arg5 == 1) {
				this.method5184(local8, local13, 8388608);
				this.method5184(local8 + 1, local13, 134217728);
			}
			if (arg5 == 2) {
				this.method5184(local8, local13, 33554432);
				this.method5184(local8, local13 + 1, 536870912);
			}
			if (arg5 == 3) {
				this.method5184(local8, local13, 134217728);
				this.method5184(local8 - 1, local13, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method5184(local8, local13, 4194304);
				this.method5184(local8 + 1, local13 + -1, 67108864);
			}
			if (arg5 == 1) {
				this.method5184(local8, local13, 16777216);
				this.method5184(local8 + 1, local13 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method5184(local8, local13, 67108864);
				this.method5184(local8 - 1, local13 + 1, 4194304);
			}
			if (arg5 == 3) {
				this.method5184(local8, local13, 268435456);
				this.method5184(local8 - 1, local13 - 1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5184(local8, local13, 545259520);
			this.method5184(local8, local13 - 1, 33554432);
			this.method5184(local8 + 1, local13, 134217728);
		}
		if (arg5 == 1) {
			this.method5184(local8, local13, 41943040);
			this.method5184(local8 + 1, local13, 134217728);
			this.method5184(local8, local13 + 1, 536870912);
		}
		if (arg5 == 2) {
			this.method5184(local8, local13, 167772160);
			this.method5184(local8, local13 + 1, 536870912);
			this.method5184(local8 - 1, local13, 8388608);
		}
		if (arg5 == 3) {
			this.method5184(local8, local13, 671088640);
			this.method5184(local8 - 1, local13, 8388608);
			this.method5184(local8, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	public void method5181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6066;
		@Pc(13) int local13 = arg1 - this.anInt6073;
		this.anIntArrayArray40[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIZ)V")
	private void method5184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray40[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method5185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static155.method2316(arg1, arg0, arg3, arg7, arg0, arg6, arg5, arg4) ? true : this.method5177(arg1, arg6, arg7, arg5, arg0, arg3, arg4, arg2, arg0);
		}
		@Pc(45) int local45 = arg4 + arg5 - 1;
		@Pc(51) int local51 = arg6 + arg7 - 1;
		if (arg4 <= arg3 && local45 >= arg3 && arg1 >= arg7 && local51 >= arg1) {
			return true;
		} else if (arg4 - 1 == arg3 && arg1 >= arg7 && arg1 <= local51 && (this.anIntArrayArray40[arg3 - this.anInt6066][arg1 - this.anInt6073] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg3 == local45 + 1 && arg7 <= arg1 && local51 >= arg1 && (this.anIntArrayArray40[arg3 - this.anInt6066][arg1 - this.anInt6073] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg7 - 1 && arg4 <= arg3 && local45 >= arg3 && (this.anIntArrayArray40[arg3 - this.anInt6066][arg1 - this.anInt6073] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg1 == local51 + 1 && arg4 <= arg3 && local45 >= arg3 && (this.anIntArrayArray40[arg3 - this.anInt6066][arg1 - this.anInt6073] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(III)V")
	public void method5186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt6066;
		@Pc(15) int local15 = arg0 - this.anInt6073;
		this.anIntArrayArray40[local10][local15] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V")
	public void method5187() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt6070; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt6083; local16++) {
				if (local12 == 0 || local16 == 0 || local12 >= this.anInt6070 - 5 || this.anInt6083 - 5 <= local16) {
					this.anIntArrayArray40[local12][local16] = -1;
				} else {
					this.anIntArrayArray40[local12][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
	private void method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray40[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg0 && arg4 == arg1) {
				return true;
			}
		} else if (arg0 >= arg2 && arg5 + arg2 - 1 >= arg0 && arg1 >= arg1 && arg1 <= arg5 + arg1 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg0 - this.anInt6066;
		@Pc(60) int local60 = arg2 - this.anInt6066;
		@Pc(71) int local71 = arg4 - this.anInt6073;
		@Pc(76) int local76 = arg1 - this.anInt6073;
		if (arg5 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local55 + 1 == local60 && local76 == local71 && (this.anIntArrayArray40[local60][local71] & 0x80) == 0) {
						return true;
					}
					if (local55 == local60 && local71 == local76 - 1 && (this.anIntArrayArray40[local60][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local60 == local55 - 1 && local76 == local71 && (this.anIntArrayArray40[local60][local71] & 0x8) == 0) {
						return true;
					}
					if (local55 == local60 && local76 - 1 == local71 && (this.anIntArrayArray40[local60][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local55 - 1 == local60 && local76 == local71 && (this.anIntArrayArray40[local60][local71] & 0x8) == 0) {
						return true;
					}
					if (local60 == local55 && local71 == local76 + 1 && (this.anIntArrayArray40[local60][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local55 + 1 == local60 && local71 == local76 && (this.anIntArrayArray40[local60][local71] & 0x80) == 0) {
						return true;
					}
					if (local60 == local55 && local76 + 1 == local71 && (this.anIntArrayArray40[local60][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local55 == local60 && local71 == local76 + 1 && (this.anIntArrayArray40[local60][local71] & 0x20) == 0) {
					return true;
				}
				if (local60 == local55 && local71 == local76 - 1 && (this.anIntArrayArray40[local60][local71] & 0x2) == 0) {
					return true;
				}
				if (local60 == local55 - 1 && local76 == local71 && (this.anIntArrayArray40[local60][local71] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local60 && local71 == local76 && (this.anIntArrayArray40[local60][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(425) int local425 = arg5 + local60 - 1;
			@Pc(431) int local431 = local71 + arg5 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local60 == local55 + 1 && local76 >= local71 && local431 >= local76 && (this.anIntArrayArray40[local60][local76] & 0x80) == 0) {
						return true;
					}
					if (local60 <= local55 && local425 >= local55 && local71 == local76 - arg5 && (this.anIntArrayArray40[local55][local431] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local60 == local55 - arg5 && local76 >= local71 && local431 >= local76 && (this.anIntArrayArray40[local425][local76] & 0x8) == 0) {
						return true;
					}
					if (local55 >= local60 && local55 <= local425 && local71 == local76 - arg5 && (this.anIntArrayArray40[local55][local431] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local55 - arg5 == local60 && local71 <= local76 && local431 >= local76 && (this.anIntArrayArray40[local425][local76] & 0x8) == 0) {
						return true;
					}
					if (local55 >= local60 && local55 <= local425 && local76 + 1 == local71 && (this.anIntArrayArray40[local55][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local55 + 1 == local60 && local76 >= local71 && local431 >= local76 && (this.anIntArrayArray40[local60][local76] & 0x80) == 0) {
						return true;
					}
					if (local55 >= local60 && local55 <= local425 && local71 == local76 + 1 && (this.anIntArrayArray40[local55][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local55 >= local60 && local425 >= local55 && local76 + 1 == local71 && (this.anIntArrayArray40[local55][local71] & 0x20) == 0) {
					return true;
				}
				if (local60 <= local55 && local425 >= local55 && local76 - arg5 == local71 && (this.anIntArrayArray40[local55][local431] & 0x2) == 0) {
					return true;
				}
				if (local55 - arg5 == local60 && local71 <= local76 && local76 <= local431 && (this.anIntArrayArray40[local425][local76] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local60 && local71 <= local76 && local76 <= local431 && (this.anIntArrayArray40[local60][local76] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)V")
	public void method5190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6066;
		@Pc(17) int local17 = arg0 - this.anInt6073;
		this.anIntArrayArray40[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIZIIIII)V")
	public void method5192(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt6066;
		@Pc(23) int local23 = arg6 - this.anInt6073;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(47) int local47;
		if (arg1 == 1 || arg1 == 3) {
			local47 = arg3;
			arg3 = arg5;
			arg5 = local47;
		}
		for (local47 = local18; local47 < arg3 + local18; local47++) {
			if (local47 >= 0 && this.anInt6070 > local47) {
				for (@Pc(66) int local66 = local23; local66 < arg5 + local23; local66++) {
					if (local66 >= 0 && local66 < this.anInt6083) {
						this.method5188(local66, local7, local47);
					}
				}
			}
		}
	}
}
