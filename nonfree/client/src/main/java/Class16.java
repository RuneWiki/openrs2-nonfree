import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class16 {

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
	public Class16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt569 = arg0;
		this.anInt562 = 0;
		this.anInt559 = 0;
		this.anInt570 = arg1;
		this.anIntArrayArray6 = new int[this.anInt569][this.anInt570];
		this.method431();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return this.method426(arg1, arg0, arg4, arg3, arg7, arg2, arg5, arg4) ? true : this.method436(arg4, arg0, arg2, arg6, arg7, arg1, arg4, arg3, arg5);
		}
		@Pc(39) int local39 = arg0 + arg7 - 1;
		@Pc(45) int local45 = arg3 + arg5 - 1;
		if (arg7 <= arg1 && arg1 <= local39 && arg2 >= arg5 && arg2 <= local45) {
			return true;
		} else if (arg7 - 1 == arg1 && arg2 >= arg5 && arg2 <= local45 && (this.anIntArrayArray6[arg1 - this.anInt562][arg2 - this.anInt559] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg1 == local39 + 1 && arg2 >= arg5 && local45 >= arg2 && (this.anIntArrayArray6[arg1 - this.anInt562][arg2 - this.anInt559] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg2 && arg7 <= arg1 && arg1 <= local39 && (this.anIntArrayArray6[arg1 - this.anInt562][arg2 - this.anInt559] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg2 && arg1 >= arg7 && local39 >= arg1 && (this.anIntArrayArray6[arg1 - this.anInt562][arg2 - this.anInt559] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt562;
		@Pc(21) int local21 = arg1 - this.anInt559;
		this.anIntArrayArray6[local4][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIIIII)Z")
	private boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg1 + arg4 && arg0 + arg7 > arg4) {
			return arg5 < arg3 + arg6 && arg2 + arg5 > arg6;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
	private void method428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBI)V")
	private void method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray6[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public void method431() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt569; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt570; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt569 - 5 || local11 >= this.anInt570 - 5) {
					this.anIntArrayArray6[local7][local11] = 16777215;
				} else {
					this.anIntArrayArray6[local7][local11] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
	public void method432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt559;
		@Pc(13) int local13 = arg1 - this.anInt562;
		this.anIntArrayArray6[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg3 && arg0 == arg6) {
				return true;
			}
		} else if (arg2 <= arg3 && arg3 <= arg2 + arg5 - 1 && arg0 >= arg0 && arg0 <= arg0 + arg5 - 1) {
			return true;
		}
		@Pc(58) int local58 = arg0 - this.anInt559;
		@Pc(63) int local63 = arg6 - this.anInt559;
		@Pc(68) int local68 = arg2 - this.anInt562;
		@Pc(73) int local73 = arg3 - this.anInt562;
		if (arg5 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local73 + 1 == local68 && local63 == local58 && (this.anIntArrayArray6[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 == local68 && local63 == local58 - 1 && (this.anIntArrayArray6[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray6[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local63 == local58 - 1 && (this.anIntArrayArray6[local68][local63] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local68 == local73 - 1 && local58 == local63 && (this.anIntArrayArray6[local68][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local58 + 1 == local63 && (this.anIntArrayArray6[local68][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray6[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local68 == local73 && local58 + 1 == local63 && (this.anIntArrayArray6[local68][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local73 == local68 && local58 + 1 == local63 && (this.anIntArrayArray6[local68][local63] & 0x20) == 0) {
					return true;
				}
				if (local68 == local73 && local63 == local58 - 1 && (this.anIntArrayArray6[local68][local63] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local63 == local58 && (this.anIntArrayArray6[local68][local63] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local58 == local63 && (this.anIntArrayArray6[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(84) int local84 = arg5 + local68 - 1;
			@Pc(90) int local90 = arg5 + local63 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local68 == local73 + 1 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray6[local68][local58] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local73 && local84 >= local73 && local58 - arg5 == local63 && (this.anIntArrayArray6[local73][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local68 == local73 - arg5 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray6[local84][local58] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local84 >= local73 && local63 == local58 - arg5 && (this.anIntArrayArray6[local73][local90] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local73 - arg5 == local68 && local58 >= local63 && local58 <= local90 && (this.anIntArrayArray6[local84][local58] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local84 >= local73 && local58 + 1 == local63 && (this.anIntArrayArray6[local73][local63] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local68 == local73 + 1 && local63 <= local58 && local90 >= local58 && (this.anIntArrayArray6[local68][local58] & 0x80) == 0) {
						return true;
					}
					if (local68 <= local73 && local73 <= local84 && local58 + 1 == local63 && (this.anIntArrayArray6[local73][local63] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local73 >= local68 && local73 <= local84 && local63 == local58 + 1 && (this.anIntArrayArray6[local73][local63] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local68 && local73 <= local84 && local58 - arg5 == local63 && (this.anIntArrayArray6[local73][local90] & 0x2) == 0) {
					return true;
				}
				if (local68 == local73 - arg5 && local63 <= local58 && local58 <= local90 && (this.anIntArrayArray6[local84][local58] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local58 >= local63 && local90 >= local58 && (this.anIntArrayArray6[local68][local58] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIBI)V")
	public void method434(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 - this.anInt559;
		@Pc(13) int local13 = arg2 - this.anInt562;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method430(128, local13, local4);
				this.method430(8, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method430(2, local13, local4);
				this.method430(32, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method430(8, local13, local4);
				this.method430(128, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method430(32, local13, local4);
				this.method430(2, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method430(1, local13, local4);
				this.method430(16, local13 - 1, local4 - -1);
			}
			if (arg3 == 1) {
				this.method430(4, local13, local4);
				this.method430(64, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method430(16, local13, local4);
				this.method430(1, local13 + 1, local4 + -1);
			}
			if (arg3 == 3) {
				this.method430(64, local13, local4);
				this.method430(4, local13 - 1, local4 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method430(130, local13, local4);
				this.method430(8, local13 - 1, local4);
				this.method430(32, local13, local4 + 1);
			}
			if (arg3 == 1) {
				this.method430(10, local13, local4);
				this.method430(32, local13, local4 + 1);
				this.method430(128, local13 + 1, local4);
			}
			if (arg3 == 2) {
				this.method430(40, local13, local4);
				this.method430(128, local13 + 1, local4);
				this.method430(2, local13, local4 - 1);
			}
			if (arg3 == 3) {
				this.method430(160, local13, local4);
				this.method430(2, local13, local4 - 1);
				this.method430(8, local13 - 1, local4);
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method430(65536, local13, local4);
				this.method430(4096, local13 - 1, local4);
			}
			if (arg3 == 1) {
				this.method430(1024, local13, local4);
				this.method430(16384, local13, local4 + 1);
			}
			if (arg3 == 2) {
				this.method430(4096, local13, local4);
				this.method430(65536, local13 + 1, local4);
			}
			if (arg3 == 3) {
				this.method430(16384, local13, local4);
				this.method430(1024, local13, local4 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method430(512, local13, local4);
				this.method430(8192, local13 - 1, local4 + 1);
			}
			if (arg3 == 1) {
				this.method430(2048, local13, local4);
				this.method430(32768, local13 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method430(8192, local13, local4);
				this.method430(512, local13 + 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method430(32768, local13, local4);
				this.method430(2048, local13 - 1, local4 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method430(66560, local13, local4);
			this.method430(4096, local13 - 1, local4);
			this.method430(16384, local13, local4 + 1);
		}
		if (arg3 == 1) {
			this.method430(5120, local13, local4);
			this.method430(16384, local13, local4 + 1);
			this.method430(65536, local13 + 1, local4);
		}
		if (arg3 == 2) {
			this.method430(20480, local13, local4);
			this.method430(65536, local13 + 1, local4);
			this.method430(1024, local13, local4 - 1);
		}
		if (arg3 == 3) {
			this.method430(81920, local13, local4);
			this.method430(1024, local13, local4 - 1);
			this.method430(4096, local13 - 1, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg1 == arg0 && arg6 == arg2) {
				return true;
			}
		} else if (arg0 <= arg1 && arg3 + arg0 - 1 >= arg1 && arg2 <= arg2 && arg2 + arg3 - 1 >= arg2) {
			return true;
		}
		@Pc(54) int local54 = arg1 - this.anInt562;
		@Pc(59) int local59 = arg6 - this.anInt559;
		@Pc(64) int local64 = arg0 - this.anInt562;
		@Pc(69) int local69 = arg2 - this.anInt559;
		if (arg3 == 1) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					if (local54 - 1 == local64 && local69 == local59) {
						return true;
					}
					if (local54 == local64 && local69 + 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local64 == local54 && local69 + 1 == local59) {
						return true;
					}
					if (local54 - 1 == local64 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local59 == local69 && (this.anIntArrayArray6[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local54 + 1 == local64 && local69 == local59) {
						return true;
					}
					if (local54 == local64 && local59 == local69 + 1 && (this.anIntArrayArray6[local64][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local54 == local64 && local59 == local69 - 1) {
						return true;
					}
					if (local54 - 1 == local64 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					if (local64 == local54 - 1 && local69 == local59) {
						return true;
					}
					if (local54 == local64 && local59 == local69 + 1) {
						return true;
					}
					if (local54 + 1 == local64 && local59 == local69 && (this.anIntArrayArray6[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local54 - 1 == local64 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 && local59 == local69 + 1) {
						return true;
					}
					if (local54 + 1 == local64 && local69 == local59) {
						return true;
					}
					if (local54 == local64 && local69 - 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local64 == local54 - 1 && local59 == local69 && (this.anIntArrayArray6[local64][local59] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 && local59 == local69 + 1 && (this.anIntArrayArray6[local64][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 == local59) {
						return true;
					}
					if (local64 == local54 && local69 - 1 == local59) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local64 == local54 - 1 && local69 == local59) {
						return true;
					}
					if (local54 == local64 && local69 + 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x12C0180) == 0) {
						return true;
					}
					if (local64 == local54 && local59 == local69 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local64 == local54 && local69 + 1 == local59 && (this.anIntArrayArray6[local64][local59] & 0x20) == 0) {
					return true;
				}
				if (local54 == local64 && local59 == local69 - 1 && (this.anIntArrayArray6[local64][local59] & 0x2) == 0) {
					return true;
				}
				if (local64 == local54 - 1 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x8) == 0) {
					return true;
				}
				if (local64 == local54 + 1 && local69 == local59 && (this.anIntArrayArray6[local64][local59] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = local64 + arg3 - 1;
			@Pc(95) int local95 = arg3 + local59 - 1;
			if (arg4 == 0) {
				if (arg5 == 0) {
					if (local54 - arg3 == local64 && local69 >= local59 && local95 >= local69) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local69 + 1 == local59 && (this.anIntArrayArray6[local54][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local69 - arg3 == local59 && (this.anIntArrayArray6[local54][local95] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local64 <= local54 && local89 >= local54 && local69 + 1 == local59) {
						return true;
					}
					if (local64 == local54 - arg3 && local59 <= local69 && local69 <= local95 && (this.anIntArrayArray6[local89][local69] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local64][local69] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69) {
						return true;
					}
					if (local54 >= local64 && local89 >= local54 && local69 + 1 == local59 && (this.anIntArrayArray6[local54][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local54 >= local64 && local89 >= local54 && local69 - arg3 == local59 && (this.anIntArrayArray6[local54][local95] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local64 <= local54 && local89 >= local54 && local59 == local69 - arg3) {
						return true;
					}
					if (local54 - arg3 == local64 && local69 >= local59 && local69 <= local95 && (this.anIntArrayArray6[local89][local69] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local64][local69] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					if (local54 - arg3 == local64 && local69 >= local59 && local69 <= local95) {
						return true;
					}
					if (local64 <= local54 && local54 <= local89 && local69 + 1 == local59) {
						return true;
					}
					if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local64][local69] & 0x12C0180) == 0) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local69 - arg3 == local59 && (this.anIntArrayArray6[local54][local95] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local54 - arg3 == local64 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local89][local69] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 <= local54 && local54 <= local89 && local69 + 1 == local59) {
						return true;
					}
					if (local54 + 1 == local64 && local59 <= local69 && local69 <= local95) {
						return true;
					}
					if (local54 >= local64 && local54 <= local89 && local69 - arg3 == local59 && (this.anIntArrayArray6[local54][local95] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local64 == local54 - arg3 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local89][local69] & 0x12C0108) == 0) {
						return true;
					}
					if (local64 <= local54 && local54 <= local89 && local69 + 1 == local59 && (this.anIntArrayArray6[local54][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local59 == local69 - arg3) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local64 == local54 - arg3 && local69 >= local59 && local95 >= local69) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local69 + 1 == local59 && (this.anIntArrayArray6[local54][local59] & 0x12C0120) == 0) {
						return true;
					}
					if (local64 == local54 + 1 && local69 >= local59 && local69 <= local95 && (this.anIntArrayArray6[local64][local69] & 0x12C0180) == 0) {
						return true;
					}
					if (local64 <= local54 && local89 >= local54 && local59 == local69 - arg3) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local54 >= local64 && local54 <= local89 && local59 == local69 + 1 && (this.anIntArrayArray6[local54][local59] & 0x12C0120) == 0) {
					return true;
				}
				if (local64 <= local54 && local89 >= local54 && local59 == local69 - arg3 && (this.anIntArrayArray6[local54][local95] & 0x12C0102) == 0) {
					return true;
				}
				if (local64 == local54 - arg3 && local59 <= local69 && local95 >= local69 && (this.anIntArrayArray6[local89][local69] & 0x12C0108) == 0) {
					return true;
				}
				if (local64 == local54 + 1 && local69 >= local59 && local95 >= local69 && (this.anIntArrayArray6[local64][local69] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIBIIIII)Z")
	private boolean method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg5;
		@Pc(13) int local13 = arg1 + arg4;
		@Pc(17) int local17 = arg7 + arg8;
		@Pc(29) int local29 = arg2 + arg6;
		@Pc(89) int local89;
		@Pc(175) int local175;
		if (arg4 <= arg5 && local13 > arg5) {
			if (local29 == arg8 && (arg3 & 0x4) == 0) {
				local89 = arg5;
				local175 = local13 < local9 ? local13 : local9;
				while (local175 > local89) {
					if ((this.anIntArrayArray6[local89 - this.anInt562][local29 - this.anInt559 - 1] & 0x2) == 0) {
						return true;
					}
					local89++;
				}
			} else if (arg2 == local17 && (arg3 & 0x1) == 0) {
				local175 = local13 < local9 ? local13 : local9;
				for (local89 = arg5; local89 < local175; local89++) {
					if ((this.anIntArrayArray6[local89 - this.anInt562][arg2 - this.anInt559] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg4 < local9 && local13 >= local9) {
			if (arg8 == local29 && (arg3 & 0x4) == 0) {
				for (local89 = arg4; local89 < local9; local89++) {
					if ((this.anIntArrayArray6[local89 - this.anInt562][local29 - this.anInt559 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (local17 == arg2 && (arg3 & 0x1) == 0) {
				for (local89 = arg4; local89 < local9; local89++) {
					if ((this.anIntArrayArray6[local89 - this.anInt562][arg2 - this.anInt559] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg8 <= arg2 && local17 > arg2) {
			if (arg4 == local9 && (arg3 & 0x8) == 0) {
				local89 = arg2;
				local175 = local17 >= local29 ? local29 : local17;
				while (local175 > local89) {
					if ((this.anIntArrayArray6[local9 - this.anInt562 - 1][local89 - this.anInt559] & 0x8) == 0) {
						return true;
					}
					local89++;
				}
			} else if (arg5 == local13 && (arg3 & 0x2) == 0) {
				local89 = arg2;
				local175 = local17 < local29 ? local17 : local29;
				while (local89 < local175) {
					if ((this.anIntArrayArray6[arg5 - this.anInt562][local89 - this.anInt559] & 0x80) == 0) {
						return true;
					}
					local89++;
				}
			}
		} else if (arg8 < local29 && local17 >= local29) {
			if (local9 == arg4 && (arg3 & 0x8) == 0) {
				for (local89 = arg8; local89 < local29; local89++) {
					if ((this.anIntArrayArray6[local9 - this.anInt562 - 1][local89 - this.anInt559] & 0x8) == 0) {
						return true;
					}
				}
			} else if (local13 == arg5 && (arg3 & 0x2) == 0) {
				for (local89 = arg8; local89 < local29; local89++) {
					if ((this.anIntArrayArray6[arg5 - this.anInt562][local89 - this.anInt559] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBIIZ)V")
	public void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) int local4 = arg3 - this.anInt562;
		@Pc(9) int local9 = arg2 - this.anInt559;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method428(local4, 128, local9);
				this.method428(local4 - 1, 8, local9);
			}
			if (arg0 == 1) {
				this.method428(local4, 2, local9);
				this.method428(local4, 32, local9 + 1);
			}
			if (arg0 == 2) {
				this.method428(local4, 8, local9);
				this.method428(local4 + 1, 128, local9);
			}
			if (arg0 == 3) {
				this.method428(local4, 32, local9);
				this.method428(local4, 2, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method428(local4, 1, local9);
				this.method428(local4 - 1, 16, local9 + 1);
			}
			if (arg0 == 1) {
				this.method428(local4, 4, local9);
				this.method428(local4 + 1, 64, local9 + 1);
			}
			if (arg0 == 2) {
				this.method428(local4, 16, local9);
				this.method428(local4 + 1, 1, local9 - 1);
			}
			if (arg0 == 3) {
				this.method428(local4, 64, local9);
				this.method428(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method428(local4, 130, local9);
				this.method428(local4 - 1, 8, local9);
				this.method428(local4, 32, local9 + 1);
			}
			if (arg0 == 1) {
				this.method428(local4, 10, local9);
				this.method428(local4, 32, local9 + 1);
				this.method428(local4 + 1, 128, local9);
			}
			if (arg0 == 2) {
				this.method428(local4, 40, local9);
				this.method428(local4 + 1, 128, local9);
				this.method428(local4, 2, local9 - 1);
			}
			if (arg0 == 3) {
				this.method428(local4, 160, local9);
				this.method428(local4, 2, local9 - 1);
				this.method428(local4 - 1, 8, local9);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method428(local4, 65536, local9);
				this.method428(local4 - 1, 4096, local9);
			}
			if (arg0 == 1) {
				this.method428(local4, 1024, local9);
				this.method428(local4, 16384, local9 + 1);
			}
			if (arg0 == 2) {
				this.method428(local4, 4096, local9);
				this.method428(local4 + 1, 65536, local9);
			}
			if (arg0 == 3) {
				this.method428(local4, 16384, local9);
				this.method428(local4, 1024, local9 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method428(local4, 512, local9);
				this.method428(local4 - 1, 8192, local9 + 1);
			}
			if (arg0 == 1) {
				this.method428(local4, 2048, local9);
				this.method428(local4 + 1, 32768, local9 + 1);
			}
			if (arg0 == 2) {
				this.method428(local4, 8192, local9);
				this.method428(local4 + 1, 512, local9 - 1);
			}
			if (arg0 == 3) {
				this.method428(local4, 32768, local9);
				this.method428(local4 - 1, 2048, local9 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method428(local4, 66560, local9);
			this.method428(local4 - 1, 4096, local9);
			this.method428(local4, 16384, local9 + 1);
		}
		if (arg0 == 1) {
			this.method428(local4, 5120, local9);
			this.method428(local4, 16384, local9 + 1);
			this.method428(local4 + 1, 65536, local9);
		}
		if (arg0 == 2) {
			this.method428(local4, 20480, local9);
			this.method428(local4 + 1, 65536, local9);
			this.method428(local4, 1024, local9 - 1);
		}
		if (arg0 == 3) {
			this.method428(local4, 81920, local9);
			this.method428(local4, 1024, local9 - 1);
			this.method428(local4 - 1, 4096, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(BII)V")
	public void method439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt559;
		@Pc(19) int local19 = arg0 - this.anInt562;
		this.anIntArrayArray6[local19][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIBIII)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 - this.anInt559;
		@Pc(11) int local11 = arg2 - this.anInt562;
		@Pc(25) int local25;
		if (arg4 == 1 || arg4 == 3) {
			local25 = arg0;
			arg0 = arg3;
			arg3 = local25;
		}
		@Pc(31) int local31 = 256;
		if (arg1) {
			local31 = 131328;
		}
		for (local25 = local11; local25 < local11 + arg0; local25++) {
			if (local25 >= 0 && local25 < this.anInt569) {
				for (@Pc(64) int local64 = local6; local64 < local6 + arg3; local64++) {
					if (local64 >= 0 && local64 < this.anInt570) {
						this.method428(local25, local31, local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIBII)V")
	public void method441(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - this.anInt562;
		@Pc(12) int local12 = 256;
		@Pc(17) int local17 = arg1 - this.anInt559;
		if (arg0) {
			local12 = 131328;
		}
		for (@Pc(29) int local29 = local10; local29 < arg2 + local10; local29++) {
			if (local29 >= 0 && local29 < this.anInt569) {
				for (@Pc(42) int local42 = local17; local42 < local17 + arg4; local42++) {
					if (local42 >= 0 && this.anInt570 > local42) {
						this.method430(local12, local29, local42);
					}
				}
			}
		}
	}
}
