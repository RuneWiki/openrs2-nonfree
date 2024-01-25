import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class111 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public int anInt3180;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg2 && arg6 == arg1) {
				return true;
			}
		} else if (arg2 <= arg3 && arg2 + arg0 - 1 >= arg3 && arg1 <= arg1 && arg1 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(47) int local47 = arg1 - this.anInt3177;
		@Pc(52) int local52 = arg6 - this.anInt3177;
		@Pc(57) int local57 = arg2 - this.anInt3180;
		@Pc(62) int local62 = arg3 - this.anInt3180;
		if (arg0 == 1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local62 - 1 == local57 && local52 == local47) {
						return true;
					}
					if (local57 == local62 && local52 == local47 + 1 && (this.anIntArrayArray20[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local57 && local52 == local47 - 1 && (this.anIntArrayArray20[local57][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 == local62 && local52 == local47 + 1) {
						return true;
					}
					if (local57 == local62 - 1 && local47 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 == local62 + 1 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local62 + 1 == local57 && local47 == local52) {
						return true;
					}
					if (local62 == local57 && local52 == local47 + 1 && (this.anIntArrayArray20[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 == local57 && local47 - 1 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 == local62 && local47 - 1 == local52) {
						return true;
					}
					if (local62 - 1 == local57 && local47 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local57 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local62 - 1 == local57 && local52 == local47) {
						return true;
					}
					if (local62 == local57 && local52 == local47 + 1) {
						return true;
					}
					if (local62 + 1 == local57 && local47 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 == local57 && local47 - 1 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local62 - 1 == local57 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local57 && local52 == local47 + 1) {
						return true;
					}
					if (local57 == local62 + 1 && local52 == local47) {
						return true;
					}
					if (local62 == local57 && local47 - 1 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local57 == local62 - 1 && local47 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 == local57 && local52 == local47 + 1 && (this.anIntArrayArray20[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 + 1 == local57 && local47 == local52) {
						return true;
					}
					if (local62 == local57 && local52 == local47 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 == local62 - 1 && local52 == local47) {
						return true;
					}
					if (local57 == local62 && local47 + 1 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local62 + 1 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x2C0180) == 0) {
						return true;
					}
					if (local57 == local62 && local47 - 1 == local52) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local62 == local57 && local52 == local47 + 1 && (this.anIntArrayArray20[local57][local52] & 0x20) == 0) {
					return true;
				}
				if (local57 == local62 && local47 - 1 == local52 && (this.anIntArrayArray20[local57][local52] & 0x2) == 0) {
					return true;
				}
				if (local57 == local62 - 1 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x8) == 0) {
					return true;
				}
				if (local62 + 1 == local57 && local52 == local47 && (this.anIntArrayArray20[local57][local52] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(77) int local77 = local57 + arg0 - 1;
			@Pc(83) int local83 = arg0 + local52 - 1;
			if (arg5 == 0) {
				if (arg4 == 0) {
					if (local57 == local62 - arg0 && local52 <= local47 && local47 <= local83) {
						return true;
					}
					if (local57 <= local62 && local77 >= local62 && local52 == local47 + 1 && (this.anIntArrayArray20[local62][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 >= local57 && local62 <= local77 && local47 - arg0 == local52 && (this.anIntArrayArray20[local62][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 <= local62 && local62 <= local77 && local47 + 1 == local52) {
						return true;
					}
					if (local62 - arg0 == local57 && local47 >= local52 && local47 <= local83 && (this.anIntArrayArray20[local77][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local57 && local47 >= local52 && local47 <= local83 && (this.anIntArrayArray20[local57][local47] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local57 == local62 + 1 && local47 >= local52 && local47 <= local83) {
						return true;
					}
					if (local62 >= local57 && local77 >= local62 && local52 == local47 + 1 && (this.anIntArrayArray20[local62][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local62 >= local57 && local77 >= local62 && local52 == local47 - arg0 && (this.anIntArrayArray20[local62][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local62 >= local57 && local77 >= local62 && local52 == local47 - arg0) {
						return true;
					}
					if (local62 - arg0 == local57 && local47 >= local52 && local83 >= local47 && (this.anIntArrayArray20[local77][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local62 + 1 == local57 && local47 >= local52 && local83 >= local47 && (this.anIntArrayArray20[local57][local47] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					if (local62 - arg0 == local57 && local47 >= local52 && local47 <= local83) {
						return true;
					}
					if (local57 <= local62 && local77 >= local62 && local47 + 1 == local52) {
						return true;
					}
					if (local62 + 1 == local57 && local47 >= local52 && local83 >= local47 && (this.anIntArrayArray20[local57][local47] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local57 && local62 <= local77 && local52 == local47 - arg0 && (this.anIntArrayArray20[local62][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 == local62 - arg0 && local52 <= local47 && local83 >= local47 && (this.anIntArrayArray20[local77][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 <= local62 && local77 >= local62 && local52 == local47 + 1) {
						return true;
					}
					if (local62 + 1 == local57 && local52 <= local47 && local83 >= local47) {
						return true;
					}
					if (local57 <= local62 && local77 >= local62 && local47 - arg0 == local52 && (this.anIntArrayArray20[local62][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local62 - arg0 == local57 && local47 >= local52 && local47 <= local83 && (this.anIntArrayArray20[local77][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local57 <= local62 && local62 <= local77 && local52 == local47 + 1 && (this.anIntArrayArray20[local62][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local62 + 1 && local52 <= local47 && local83 >= local47) {
						return true;
					}
					if (local57 <= local62 && local62 <= local77 && local47 - arg0 == local52) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local62 - arg0 == local57 && local47 >= local52 && local47 <= local83) {
						return true;
					}
					if (local62 >= local57 && local77 >= local62 && local47 + 1 == local52 && (this.anIntArrayArray20[local62][local52] & 0x2C0120) == 0) {
						return true;
					}
					if (local57 == local62 + 1 && local47 >= local52 && local47 <= local83 && (this.anIntArrayArray20[local57][local47] & 0x2C0180) == 0) {
						return true;
					}
					if (local62 >= local57 && local62 <= local77 && local47 - arg0 == local52) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local57 <= local62 && local62 <= local77 && local52 == local47 + 1 && (this.anIntArrayArray20[local62][local52] & 0x2C0120) == 0) {
					return true;
				}
				if (local57 <= local62 && local62 <= local77 && local52 == local47 - arg0 && (this.anIntArrayArray20[local62][local83] & 0x2C0102) == 0) {
					return true;
				}
				if (local57 == local62 - arg0 && local52 <= local47 && local83 >= local47 && (this.anIntArrayArray20[local77][local47] & 0x2C0108) == 0) {
					return true;
				}
				if (local62 + 1 == local57 && local52 <= local47 && local83 >= local47 && (this.anIntArrayArray20[local57][local47] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	public void method2850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3177;
		@Pc(13) int local13 = arg1 - this.anInt3180;
		this.anIntArrayArray20[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIZII)V")
	public void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt3177;
		@Pc(9) int local9 = arg2 - this.anInt3180;
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method2860(128, local9, local4);
				this.method2860(8, local9 - 1, local4);
			}
			if (arg5 == 1) {
				this.method2860(2, local9, local4);
				this.method2860(32, local9, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2860(8, local9, local4);
				this.method2860(128, local9 + 1, local4);
			}
			if (arg5 == 3) {
				this.method2860(32, local9, local4);
				this.method2860(2, local9, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method2860(1, local9, local4);
				this.method2860(16, local9 - 1, local4 + 1);
			}
			if (arg5 == 1) {
				this.method2860(4, local9, local4);
				this.method2860(64, local9 + 1, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2860(16, local9, local4);
				this.method2860(1, local9 + 1, local4 + -1);
			}
			if (arg5 == 3) {
				this.method2860(64, local9, local4);
				this.method2860(4, local9 - 1, local4 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg5 == 0) {
				this.method2860(130, local9, local4);
				this.method2860(8, local9 - 1, local4);
				this.method2860(32, local9, local4 + 1);
			}
			if (arg5 == 1) {
				this.method2860(10, local9, local4);
				this.method2860(32, local9, local4 + 1);
				this.method2860(128, local9 + 1, local4);
			}
			if (arg5 == 2) {
				this.method2860(40, local9, local4);
				this.method2860(128, local9 + 1, local4);
				this.method2860(2, local9, local4 - 1);
			}
			if (arg5 == 3) {
				this.method2860(160, local9, local4);
				this.method2860(2, local9, local4 - 1);
				this.method2860(8, local9 - 1, local4);
			}
		}
		if (arg4) {
			if (arg0 == 0) {
				if (arg5 == 0) {
					this.method2860(65536, local9, local4);
					this.method2860(4096, local9 - 1, local4);
				}
				if (arg5 == 1) {
					this.method2860(1024, local9, local4);
					this.method2860(16384, local9, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2860(4096, local9, local4);
					this.method2860(65536, local9 + 1, local4);
				}
				if (arg5 == 3) {
					this.method2860(16384, local9, local4);
					this.method2860(1024, local9, local4 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg5 == 0) {
					this.method2860(512, local9, local4);
					this.method2860(8192, local9 - 1, local4 + 1);
				}
				if (arg5 == 1) {
					this.method2860(2048, local9, local4);
					this.method2860(32768, local9 + 1, local4 + 1);
				}
				if (arg5 == 2) {
					this.method2860(8192, local9, local4);
					this.method2860(512, local9 + 1, local4 - 1);
				}
				if (arg5 == 3) {
					this.method2860(32768, local9, local4);
					this.method2860(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg0 == 2) {
				if (arg5 == 0) {
					this.method2860(66560, local9, local4);
					this.method2860(4096, local9 - 1, local4);
					this.method2860(16384, local9, local4 + 1);
				}
				if (arg5 == 1) {
					this.method2860(5120, local9, local4);
					this.method2860(16384, local9, local4 + 1);
					this.method2860(65536, local9 + 1, local4);
				}
				if (arg5 == 2) {
					this.method2860(20480, local9, local4);
					this.method2860(65536, local9 + 1, local4);
					this.method2860(1024, local9, local4 - 1);
				}
				if (arg5 == 3) {
					this.method2860(81920, local9, local4);
					this.method2860(1024, local9, local4 - 1);
					this.method2860(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg5 == 0) {
				this.method2860(536870912, local9, local4);
				this.method2860(33554432, local9 - 1, local4);
			}
			if (arg5 == 1) {
				this.method2860(8388608, local9, local4);
				this.method2860(134217728, local9, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2860(33554432, local9, local4);
				this.method2860(536870912, local9 + 1, local4);
			}
			if (arg5 == 3) {
				this.method2860(134217728, local9, local4);
				this.method2860(8388608, local9, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg5 == 0) {
				this.method2860(4194304, local9, local4);
				this.method2860(67108864, local9 - 1, local4 + 1);
			}
			if (arg5 == 1) {
				this.method2860(16777216, local9, local4);
				this.method2860(268435456, local9 + 1, local4 + 1);
			}
			if (arg5 == 2) {
				this.method2860(67108864, local9, local4);
				this.method2860(4194304, local9 + 1, local4 + -1);
			}
			if (arg5 == 3) {
				this.method2860(268435456, local9, local4);
				this.method2860(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2860(545259520, local9, local4);
			this.method2860(33554432, local9 - 1, local4);
			this.method2860(134217728, local9, local4 + 1);
		}
		if (arg5 == 1) {
			this.method2860(41943040, local9, local4);
			this.method2860(134217728, local9, local4 + 1);
			this.method2860(536870912, local9 + 1, local4);
		}
		if (arg5 == 2) {
			this.method2860(167772160, local9, local4);
			this.method2860(536870912, local9 + 1, local4);
			this.method2860(8388608, local9, local4 - 1);
		}
		if (arg5 == 3) {
			this.method2860(671088640, local9, local4);
			this.method2860(8388608, local9, local4 - 1);
			this.method2860(33554432, local9 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static415.method6524(arg7, arg2, arg6, arg2, arg0, arg3, arg5, arg4) ? true : this.method2859(arg2, arg4, arg7, arg3, arg2, arg0, arg5, arg1, arg6);
		}
		@Pc(46) int local46 = arg3 + arg6 - 1;
		@Pc(52) int local52 = arg7 + arg4 - 1;
		if (arg3 <= arg5 && arg5 <= local46 && arg0 >= arg4 && arg0 <= local52) {
			return true;
		} else if (arg3 - 1 == arg5 && arg0 >= arg4 && local52 >= arg0 && (this.anIntArrayArray20[arg5 - this.anInt3180][arg0 - this.anInt3177] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg5 == local46 + 1 && arg4 <= arg0 && arg0 <= local52 && (this.anIntArrayArray20[arg5 - this.anInt3180][arg0 - this.anInt3177] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg4 - 1 && arg3 <= arg5 && local46 >= arg5 && (this.anIntArrayArray20[arg5 - this.anInt3180][arg0 - this.anInt3177] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local52 + 1 && arg3 <= arg5 && arg5 <= local46 && (this.anIntArrayArray20[arg5 - this.anInt3180][arg0 - this.anInt3177] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)V")
	public void method2853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3177;
		@Pc(9) int local9 = arg1 - this.anInt3180;
		this.anIntArrayArray20[local9][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public void method2855() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3186; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt3168; local17++) {
				if (local13 == 0 || local17 == 0 || local13 >= this.anInt3186 - 5 || this.anInt3168 - 5 <= local17) {
					this.anIntArrayArray20[local13][local17] = -1;
				} else {
					this.anIntArrayArray20[local13][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg1 == arg4 && arg6 == arg2) {
				return true;
			}
		} else if (arg1 >= arg4 && arg1 <= arg4 + arg5 - 1 && arg2 <= arg2 && arg2 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(63) int local63 = arg2 - this.anInt3177;
		@Pc(68) int local68 = arg4 - this.anInt3180;
		@Pc(73) int local73 = arg1 - this.anInt3180;
		@Pc(78) int local78 = arg6 - this.anInt3177;
		if (arg5 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local68 == local73 + 1 && local78 == local63 && (this.anIntArrayArray20[local68][local78] & 0x80) == 0) {
						return true;
					}
					if (local73 == local68 && local78 == local63 - 1 && (this.anIntArrayArray20[local68][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 == local73 - 1 && local63 == local78 && (this.anIntArrayArray20[local68][local78] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local78 == local63 - 1 && (this.anIntArrayArray20[local68][local78] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 == local73 - 1 && local63 == local78 && (this.anIntArrayArray20[local68][local78] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local78 == local63 + 1 && (this.anIntArrayArray20[local68][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 + 1 == local68 && local63 == local78 && (this.anIntArrayArray20[local68][local78] & 0x80) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local78 && (this.anIntArrayArray20[local68][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local68 == local73 && local78 == local63 + 1 && (this.anIntArrayArray20[local68][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local78 == local63 - 1 && (this.anIntArrayArray20[local68][local78] & 0x2) == 0) {
					return true;
				}
				if (local68 == local73 - 1 && local78 == local63 && (this.anIntArrayArray20[local68][local78] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local63 == local78 && (this.anIntArrayArray20[local68][local78] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = arg5 + local68 - 1;
			@Pc(96) int local96 = local78 + arg5 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local73 + 1 == local68 && local63 >= local78 && local96 >= local63 && (this.anIntArrayArray20[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local89 && local78 == local63 - arg5 && (this.anIntArrayArray20[local73][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local68 == local73 - arg5 && local63 >= local78 && local96 >= local63 && (this.anIntArrayArray20[local89][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local89 && local78 == local63 - arg5 && (this.anIntArrayArray20[local73][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local68 == local73 - arg5 && local63 >= local78 && local96 >= local63 && (this.anIntArrayArray20[local89][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local89 && local78 == local63 + 1 && (this.anIntArrayArray20[local73][local78] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local73 + 1 == local68 && local63 >= local78 && local63 <= local96 && (this.anIntArrayArray20[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local89 >= local73 && local63 + 1 == local78 && (this.anIntArrayArray20[local73][local78] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local68 <= local73 && local89 >= local73 && local78 == local63 + 1 && (this.anIntArrayArray20[local73][local78] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local68 && local73 <= local89 && local78 == local63 - arg5 && (this.anIntArrayArray20[local73][local96] & 0x2) == 0) {
					return true;
				}
				if (local68 == local73 - arg5 && local63 >= local78 && local63 <= local96 && (this.anIntArrayArray20[local89][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local63 >= local78 && local96 >= local63 && (this.anIntArrayArray20[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZIZI)V")
	public void method2858(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt3177;
		@Pc(32) int local32;
		if (arg4 == 1 || arg4 == 3) {
			local32 = arg1;
			arg1 = arg2;
			arg2 = local32;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(47) int local47 = arg6 - this.anInt3180;
		for (local32 = local47; local32 < local47 + arg1; local32++) {
			if (local32 >= 0 && this.anInt3186 > local32) {
				for (@Pc(66) int local66 = local18; local66 < local18 + arg2; local66++) {
					if (local66 >= 0 && this.anInt3168 > local66) {
						this.method2865(local32, local7, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method2859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg6;
		@Pc(27) int local27 = arg4 + arg5;
		@Pc(32) int local32 = arg3 + arg8;
		@Pc(36) int local36 = arg2 + arg1;
		@Pc(61) int local61;
		@Pc(68) int local68;
		if (local32 == arg6 && (arg7 & 0x2) == 0) {
			local61 = arg5 <= arg1 ? arg1 : arg5;
			local68 = local36 > local27 ? local27 : local36;
			while (local68 > local61) {
				if ((this.anIntArrayArray20[local32 - this.anInt3180 - 1][local61 - this.anInt3177] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local9 == arg3 && (arg7 & 0x8) == 0) {
			local61 = arg1 >= arg5 ? arg1 : arg5;
			local68 = local27 < local36 ? local27 : local36;
			while (local61 < local68) {
				if ((this.anIntArrayArray20[arg3 - this.anInt3180][local61 - this.anInt3177] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local36 == arg5 && (arg7 & 0x1) == 0) {
			local61 = arg6 > arg3 ? arg6 : arg3;
			local68 = local32 <= local9 ? local32 : local9;
			while (local61 < local68) {
				if ((this.anIntArrayArray20[local61 - this.anInt3180][local36 - this.anInt3177 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local27 == arg1 && (arg7 & 0x4) == 0) {
			local61 = arg3 < arg6 ? arg6 : arg3;
			local68 = local9 >= local32 ? local32 : local9;
			while (local68 > local61) {
				if ((this.anIntArrayArray20[local61 - this.anInt3180][arg1 - this.anInt3177] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V")
	private void method2860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIIZ)V")
	public void method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt3180;
		@Pc(23) int local23 = arg4 - this.anInt3177;
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (@Pc(35) int local35 = local18; local35 < arg1 + local18; local35++) {
			if (local35 >= 0 && this.anInt3186 > local35) {
				for (@Pc(49) int local49 = local23; local49 < local23 + arg0; local49++) {
					if (local49 >= 0 && local49 < this.anInt3168) {
						this.method2860(local7, local35, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
	public void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt3177;
		@Pc(9) int local9 = arg1 - this.anInt3180;
		this.anIntArrayArray20[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIIIIZ)V")
	public void method2863(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(12) int local12 = arg3 - this.anInt3180;
		@Pc(17) int local17 = arg2 - this.anInt3177;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2865(local12, 128, local17);
				this.method2865(local12 - 1, 8, local17);
			}
			if (arg0 == 1) {
				this.method2865(local12, 2, local17);
				this.method2865(local12, 32, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2865(local12, 8, local17);
				this.method2865(local12 + 1, 128, local17);
			}
			if (arg0 == 3) {
				this.method2865(local12, 32, local17);
				this.method2865(local12, 2, local17 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2865(local12, 1, local17);
				this.method2865(local12 - 1, 16, local17 + 1);
			}
			if (arg0 == 1) {
				this.method2865(local12, 4, local17);
				this.method2865(local12 + 1, 64, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2865(local12, 16, local17);
				this.method2865(local12 + 1, 1, local17 - 1);
			}
			if (arg0 == 3) {
				this.method2865(local12, 64, local17);
				this.method2865(local12 - 1, 4, local17 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method2865(local12, 130, local17);
				this.method2865(local12 - 1, 8, local17);
				this.method2865(local12, 32, local17 + 1);
			}
			if (arg0 == 1) {
				this.method2865(local12, 10, local17);
				this.method2865(local12, 32, local17 + 1);
				this.method2865(local12 + 1, 128, local17);
			}
			if (arg0 == 2) {
				this.method2865(local12, 40, local17);
				this.method2865(local12 + 1, 128, local17);
				this.method2865(local12, 2, local17 - 1);
			}
			if (arg0 == 3) {
				this.method2865(local12, 160, local17);
				this.method2865(local12, 2, local17 - 1);
				this.method2865(local12 - 1, 8, local17);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method2865(local12, 65536, local17);
					this.method2865(local12 - 1, 4096, local17);
				}
				if (arg0 == 1) {
					this.method2865(local12, 1024, local17);
					this.method2865(local12, 16384, local17 + 1);
				}
				if (arg0 == 2) {
					this.method2865(local12, 4096, local17);
					this.method2865(local12 + 1, 65536, local17);
				}
				if (arg0 == 3) {
					this.method2865(local12, 16384, local17);
					this.method2865(local12, 1024, local17 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method2865(local12, 512, local17);
					this.method2865(local12 - 1, 8192, local17 + 1);
				}
				if (arg0 == 1) {
					this.method2865(local12, 2048, local17);
					this.method2865(local12 + 1, 32768, local17 + 1);
				}
				if (arg0 == 2) {
					this.method2865(local12, 8192, local17);
					this.method2865(local12 + 1, 512, local17 - 1);
				}
				if (arg0 == 3) {
					this.method2865(local12, 32768, local17);
					this.method2865(local12 - 1, 2048, local17 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method2865(local12, 66560, local17);
					this.method2865(local12 - 1, 4096, local17);
					this.method2865(local12, 16384, local17 + 1);
				}
				if (arg0 == 1) {
					this.method2865(local12, 5120, local17);
					this.method2865(local12, 16384, local17 + 1);
					this.method2865(local12 + 1, 65536, local17);
				}
				if (arg0 == 2) {
					this.method2865(local12, 20480, local17);
					this.method2865(local12 + 1, 65536, local17);
					this.method2865(local12, 1024, local17 - 1);
				}
				if (arg0 == 3) {
					this.method2865(local12, 81920, local17);
					this.method2865(local12, 1024, local17 - 1);
					this.method2865(local12 - 1, 4096, local17);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method2865(local12, 536870912, local17);
				this.method2865(local12 - 1, 33554432, local17);
			}
			if (arg0 == 1) {
				this.method2865(local12, 8388608, local17);
				this.method2865(local12, 134217728, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2865(local12, 33554432, local17);
				this.method2865(local12 + 1, 536870912, local17);
			}
			if (arg0 == 3) {
				this.method2865(local12, 134217728, local17);
				this.method2865(local12, 8388608, local17 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method2865(local12, 4194304, local17);
				this.method2865(local12 - 1, 67108864, local17 + 1);
			}
			if (arg0 == 1) {
				this.method2865(local12, 16777216, local17);
				this.method2865(local12 + 1, 268435456, local17 + 1);
			}
			if (arg0 == 2) {
				this.method2865(local12, 67108864, local17);
				this.method2865(local12 + 1, 4194304, local17 - 1);
			}
			if (arg0 == 3) {
				this.method2865(local12, 268435456, local17);
				this.method2865(local12 - 1, 16777216, local17 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2865(local12, 545259520, local17);
			this.method2865(local12 - 1, 33554432, local17);
			this.method2865(local12, 134217728, local17 + 1);
		}
		if (arg0 == 1) {
			this.method2865(local12, 41943040, local17);
			this.method2865(local12, 134217728, local17 + 1);
			this.method2865(local12 + 1, 536870912, local17);
		}
		if (arg0 == 2) {
			this.method2865(local12, 167772160, local17);
			this.method2865(local12 + 1, 536870912, local17);
			this.method2865(local12, 8388608, local17 - 1);
		}
		if (arg0 == 3) {
			this.method2865(local12, 671088640, local17);
			this.method2865(local12, 8388608, local17 - 1);
			this.method2865(local12 - 1, 33554432, local17);
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V")
	public void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt3180;
		@Pc(19) int local19 = arg0 - this.anInt3177;
		this.anIntArrayArray20[local14][local19] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IIII)V")
	private void method2865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray20[arg0][arg2] &= ~arg1;
	}
}
