import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class91 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	public int anInt2587;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	public int anInt2589;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
	public void method2165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2587;
		@Pc(13) int local13 = arg1 - this.anInt2571;
		this.anIntArrayArray30[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public void method2166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2571;
		@Pc(19) int local19 = arg0 - this.anInt2587;
		this.anIntArrayArray30[local4][local19] |= 0x200000;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg5 == arg2 && arg1 == arg6) {
				return true;
			}
		} else if (arg2 <= arg5 && arg2 + arg3 - 1 >= arg5 && arg6 >= arg6 && arg3 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(53) int local53 = arg2 - this.anInt2571;
		@Pc(58) int local58 = arg6 - this.anInt2587;
		@Pc(67) int local67 = arg5 - this.anInt2571;
		@Pc(72) int local72 = arg1 - this.anInt2587;
		if (arg3 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local67 + 1 == local53 && local72 == local58 && (this.anIntArrayArray30[local53][local72] & 0x80) == 0) {
						return true;
					}
					if (local53 == local67 && local72 == local58 - 1 && (this.anIntArrayArray30[local53][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local53 == local67 - 1 && local72 == local58 && (this.anIntArrayArray30[local53][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 == local53 && local72 == local58 - 1 && (this.anIntArrayArray30[local53][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local53 == local67 - 1 && local58 == local72 && (this.anIntArrayArray30[local53][local72] & 0x8) == 0) {
						return true;
					}
					if (local53 == local67 && local72 == local58 + 1 && (this.anIntArrayArray30[local53][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local67 + 1 == local53 && local72 == local58 && (this.anIntArrayArray30[local53][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 == local53 && local58 + 1 == local72 && (this.anIntArrayArray30[local53][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local67 == local53 && local72 == local58 + 1 && (this.anIntArrayArray30[local53][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 == local53 && local72 == local58 - 1 && (this.anIntArrayArray30[local53][local72] & 0x2) == 0) {
					return true;
				}
				if (local53 == local67 - 1 && local72 == local58 && (this.anIntArrayArray30[local53][local72] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local53 && local58 == local72 && (this.anIntArrayArray30[local53][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(81) int local81 = arg3 + local53 - 1;
			@Pc(87) int local87 = local72 + arg3 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local67 + 1 == local53 && local58 >= local72 && local87 >= local58 && (this.anIntArrayArray30[local53][local58] & 0x80) == 0) {
						return true;
					}
					if (local53 <= local67 && local67 <= local81 && local72 == local58 - arg3 && (this.anIntArrayArray30[local67][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local67 - arg3 == local53 && local72 <= local58 && local87 >= local58 && (this.anIntArrayArray30[local81][local58] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local67 && local81 >= local67 && local72 == local58 - arg3 && (this.anIntArrayArray30[local67][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local67 - arg3 == local53 && local72 <= local58 && local58 <= local87 && (this.anIntArrayArray30[local81][local58] & 0x8) == 0) {
						return true;
					}
					if (local53 <= local67 && local67 <= local81 && local72 == local58 + 1 && (this.anIntArrayArray30[local67][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local53 == local67 + 1 && local72 <= local58 && local58 <= local87 && (this.anIntArrayArray30[local53][local58] & 0x80) == 0) {
						return true;
					}
					if (local67 >= local53 && local81 >= local67 && local72 == local58 + 1 && (this.anIntArrayArray30[local67][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local53 <= local67 && local67 <= local81 && local72 == local58 + 1 && (this.anIntArrayArray30[local67][local72] & 0x20) == 0) {
					return true;
				}
				if (local67 >= local53 && local67 <= local81 && local72 == local58 - arg3 && (this.anIntArrayArray30[local67][local87] & 0x2) == 0) {
					return true;
				}
				if (local67 - arg3 == local53 && local58 >= local72 && local87 >= local58 && (this.anIntArrayArray30[local81][local58] & 0x8) == 0) {
					return true;
				}
				if (local67 + 1 == local53 && local58 >= local72 && local87 >= local58 && (this.anIntArrayArray30[local53][local58] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
	public void method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2587;
		@Pc(9) int local9 = arg1 - this.anInt2571;
		this.anIntArrayArray30[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg4 && arg3 == arg6) {
				return true;
			}
		} else if (arg4 >= arg2 && arg4 <= arg0 + arg2 - 1 && arg6 >= arg6 && arg6 <= arg6 + arg0 - 1) {
			return true;
		}
		@Pc(54) int local54 = arg6 - this.anInt2587;
		@Pc(59) int local59 = arg4 - this.anInt2571;
		@Pc(64) int local64 = arg2 - this.anInt2571;
		@Pc(69) int local69 = arg3 - this.anInt2587;
		if (arg0 == 1) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local64 == local59 - 1 && local54 == local69) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 == local64 && local69 == local54 - 1 && (this.anIntArrayArray30[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 == local59 && local69 == local54 + 1) {
						return true;
					}
					if (local59 - 1 == local64 && local69 == local54 && (this.anIntArrayArray30[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local64 == local59 + 1 && local54 == local69) {
						return true;
					}
					if (local59 == local64 && local69 == local54 + 1 && (this.anIntArrayArray30[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 && local54 - 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local59 && local69 == local54 - 1) {
						return true;
					}
					if (local64 == local59 - 1 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local69 == local54 && (this.anIntArrayArray30[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local59 - 1 == local64 && local69 == local54) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local69) {
						return true;
					}
					if (local64 == local59 + 1 && local69 == local54 && (this.anIntArrayArray30[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local59 && local54 - 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 == local59 - 1 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local69) {
						return true;
					}
					if (local64 == local59 + 1 && local69 == local54) {
						return true;
					}
					if (local64 == local59 && local69 == local54 - 1 && (this.anIntArrayArray30[local64][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local59 - 1 == local64 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 && local54 + 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local54 == local69) {
						return true;
					}
					if (local64 == local59 && local54 - 1 == local69) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 == local59 - 1 && local54 == local69) {
						return true;
					}
					if (local64 == local59 && local54 + 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local59 && local54 - 1 == local69) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local59 == local64 && local69 == local54 + 1 && (this.anIntArrayArray30[local64][local69] & 0x20) == 0) {
					return true;
				}
				if (local59 == local64 && local54 - 1 == local69 && (this.anIntArrayArray30[local64][local69] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local64 && local69 == local54 && (this.anIntArrayArray30[local64][local69] & 0x8) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local54 == local69 && (this.anIntArrayArray30[local64][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(763) int local763 = arg0 + local64 - 1;
			@Pc(769) int local769 = arg0 + local69 - 1;
			if (arg5 == 0) {
				if (arg1 == 0) {
					if (local64 == local59 - arg0 && local54 >= local69 && local769 >= local54) {
						return true;
					}
					if (local64 <= local59 && local59 <= local763 && local54 + 1 == local69 && (this.anIntArrayArray30[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local69 == local54 - arg0 && (this.anIntArrayArray30[local59][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 <= local59 && local59 <= local763 && local69 == local54 + 1) {
						return true;
					}
					if (local64 == local59 - arg0 && local54 >= local69 && local769 >= local54 && (this.anIntArrayArray30[local763][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 >= local69 && local54 <= local769 && (this.anIntArrayArray30[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local59 + 1 == local64 && local69 <= local54 && local54 <= local769) {
						return true;
					}
					if (local59 >= local64 && local763 >= local59 && local54 + 1 == local69 && (this.anIntArrayArray30[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local54 - arg0 == local69 && (this.anIntArrayArray30[local59][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local64 <= local59 && local763 >= local59 && local54 - arg0 == local69) {
						return true;
					}
					if (local59 - arg0 == local64 && local54 >= local69 && local769 >= local54 && (this.anIntArrayArray30[local763][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local69 <= local54 && local769 >= local54 && (this.anIntArrayArray30[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					if (local64 == local59 - arg0 && local54 >= local69 && local54 <= local769) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local69 == local54 + 1) {
						return true;
					}
					if (local64 == local59 + 1 && local69 <= local54 && local769 >= local54 && (this.anIntArrayArray30[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local64 && local763 >= local59 && local69 == local54 - arg0 && (this.anIntArrayArray30[local59][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local64 == local59 - arg0 && local69 <= local54 && local54 <= local769 && (this.anIntArrayArray30[local763][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 >= local64 && local763 >= local59 && local69 == local54 + 1) {
						return true;
					}
					if (local59 + 1 == local64 && local54 >= local69 && local769 >= local54) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local69 == local54 - arg0 && (this.anIntArrayArray30[local59][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local59 - arg0 == local64 && local54 >= local69 && local54 <= local769 && (this.anIntArrayArray30[local763][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local69 == local54 + 1 && (this.anIntArrayArray30[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local69 <= local54 && local769 >= local54) {
						return true;
					}
					if (local64 <= local59 && local763 >= local59 && local69 == local54 - arg0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local59 - arg0 == local64 && local69 <= local54 && local54 <= local769) {
						return true;
					}
					if (local64 <= local59 && local59 <= local763 && local69 == local54 + 1 && (this.anIntArrayArray30[local59][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 >= local69 && local54 <= local769 && (this.anIntArrayArray30[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 <= local59 && local59 <= local763 && local54 - arg0 == local69) {
						return true;
					}
				}
			}
			if (arg5 == 9) {
				if (local64 <= local59 && local763 >= local59 && local54 + 1 == local69 && (this.anIntArrayArray30[local59][local69] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 <= local59 && local59 <= local763 && local69 == local54 - arg0 && (this.anIntArrayArray30[local59][local769] & 0x2C0102) == 0) {
					return true;
				}
				if (local59 - arg0 == local64 && local54 >= local69 && local769 >= local54 && (this.anIntArrayArray30[local763][local54] & 0x2C0108) == 0) {
					return true;
				}
				if (local59 + 1 == local64 && local54 >= local69 && local54 <= local769 && (this.anIntArrayArray30[local64][local54] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	private void method2171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIZII)V")
	public void method2172(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2571;
		@Pc(13) int local13 = arg5 - this.anInt2587;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2176(128, local8, local13);
				this.method2176(8, local8 - 1, local13);
			}
			if (arg0 == 1) {
				this.method2176(2, local8, local13);
				this.method2176(32, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2176(8, local8, local13);
				this.method2176(128, local8 + 1, local13);
			}
			if (arg0 == 3) {
				this.method2176(32, local8, local13);
				this.method2176(2, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2176(1, local8, local13);
				this.method2176(16, local8 - 1, local13 - -1);
			}
			if (arg0 == 1) {
				this.method2176(4, local8, local13);
				this.method2176(64, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2176(16, local8, local13);
				this.method2176(1, local8 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method2176(64, local8, local13);
				this.method2176(4, local8 - 1, local13 + -1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method2176(130, local8, local13);
				this.method2176(8, local8 - 1, local13);
				this.method2176(32, local8, local13 + 1);
			}
			if (arg0 == 1) {
				this.method2176(10, local8, local13);
				this.method2176(32, local8, local13 + 1);
				this.method2176(128, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method2176(40, local8, local13);
				this.method2176(128, local8 + 1, local13);
				this.method2176(2, local8, local13 - 1);
			}
			if (arg0 == 3) {
				this.method2176(160, local8, local13);
				this.method2176(2, local8, local13 - 1);
				this.method2176(8, local8 - 1, local13);
			}
		}
		if (arg3) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method2176(65536, local8, local13);
					this.method2176(4096, local8 - 1, local13);
				}
				if (arg0 == 1) {
					this.method2176(1024, local8, local13);
					this.method2176(16384, local8, local13 + 1);
				}
				if (arg0 == 2) {
					this.method2176(4096, local8, local13);
					this.method2176(65536, local8 + 1, local13);
				}
				if (arg0 == 3) {
					this.method2176(16384, local8, local13);
					this.method2176(1024, local8, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method2176(512, local8, local13);
					this.method2176(8192, local8 - 1, local13 + 1);
				}
				if (arg0 == 1) {
					this.method2176(2048, local8, local13);
					this.method2176(32768, local8 + 1, local13 - -1);
				}
				if (arg0 == 2) {
					this.method2176(8192, local8, local13);
					this.method2176(512, local8 + 1, local13 + -1);
				}
				if (arg0 == 3) {
					this.method2176(32768, local8, local13);
					this.method2176(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method2176(66560, local8, local13);
					this.method2176(4096, local8 - 1, local13);
					this.method2176(16384, local8, local13 + 1);
				}
				if (arg0 == 1) {
					this.method2176(5120, local8, local13);
					this.method2176(16384, local8, local13 + 1);
					this.method2176(65536, local8 + 1, local13);
				}
				if (arg0 == 2) {
					this.method2176(20480, local8, local13);
					this.method2176(65536, local8 + 1, local13);
					this.method2176(1024, local8, local13 - 1);
				}
				if (arg0 == 3) {
					this.method2176(81920, local8, local13);
					this.method2176(1024, local8, local13 - 1);
					this.method2176(4096, local8 - 1, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2176(536870912, local8, local13);
				this.method2176(33554432, local8 - 1, local13);
			}
			if (arg0 == 1) {
				this.method2176(8388608, local8, local13);
				this.method2176(134217728, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2176(33554432, local8, local13);
				this.method2176(536870912, local8 + 1, local13);
			}
			if (arg0 == 3) {
				this.method2176(134217728, local8, local13);
				this.method2176(8388608, local8, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2176(4194304, local8, local13);
				this.method2176(67108864, local8 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method2176(16777216, local8, local13);
				this.method2176(268435456, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method2176(67108864, local8, local13);
				this.method2176(4194304, local8 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method2176(268435456, local8, local13);
				this.method2176(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2176(545259520, local8, local13);
			this.method2176(33554432, local8 - 1, local13);
			this.method2176(134217728, local8, local13 + 1);
		}
		if (arg0 == 1) {
			this.method2176(41943040, local8, local13);
			this.method2176(134217728, local8, local13 + 1);
			this.method2176(536870912, local8 + 1, local13);
		}
		if (arg0 == 2) {
			this.method2176(167772160, local8, local13);
			this.method2176(536870912, local8 + 1, local13);
			this.method2176(8388608, local8, local13 - 1);
		}
		if (arg0 == 3) {
			this.method2176(671088640, local8, local13);
			this.method2176(8388608, local8, local13 - 1);
			this.method2176(33554432, local8 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIB)V")
	public void method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt2571;
		@Pc(19) int local19 = arg0 - this.anInt2587;
		this.anIntArrayArray30[local14][local19] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZIIIZ)V")
	public void method2174(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt2571;
		@Pc(23) int local23 = arg2 - this.anInt2587;
		if (arg1) {
			local7 |= 0x40000000;
		}
		for (@Pc(40) int local40 = local18; local40 < local18 + arg0; local40++) {
			if (local40 >= 0 && local40 < this.anInt2574) {
				for (@Pc(54) int local54 = local23; local54 < arg4 + local23; local54++) {
					if (local54 >= 0 && this.anInt2589 > local54) {
						this.method2171(local54, local7, local40);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
	private void method2176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray30[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIZIIZI)V")
	public void method2177(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt2571;
		@Pc(9) int local9 = arg5 - this.anInt2587;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2171(local9, 128, local4);
				this.method2171(local9, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2171(local9, 2, local4);
				this.method2171(local9 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method2171(local9, 8, local4);
				this.method2171(local9, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2171(local9, 32, local4);
				this.method2171(local9 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2171(local9, 1, local4);
				this.method2171(local9 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2171(local9, 4, local4);
				this.method2171(local9 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2171(local9, 16, local4);
				this.method2171(local9 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2171(local9, 64, local4);
				this.method2171(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method2171(local9, 130, local4);
				this.method2171(local9, 8, local4 - 1);
				this.method2171(local9 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method2171(local9, 10, local4);
				this.method2171(local9 + 1, 32, local4);
				this.method2171(local9, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2171(local9, 40, local4);
				this.method2171(local9, 128, local4 + 1);
				this.method2171(local9 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method2171(local9, 160, local4);
				this.method2171(local9 - 1, 2, local4);
				this.method2171(local9, 8, local4 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method2171(local9, 65536, local4);
					this.method2171(local9, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method2171(local9, 1024, local4);
					this.method2171(local9 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method2171(local9, 4096, local4);
					this.method2171(local9, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method2171(local9, 16384, local4);
					this.method2171(local9 - 1, 1024, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method2171(local9, 512, local4);
					this.method2171(local9 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method2171(local9, 2048, local4);
					this.method2171(local9 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method2171(local9, 8192, local4);
					this.method2171(local9 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method2171(local9, 32768, local4);
					this.method2171(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method2171(local9, 66560, local4);
					this.method2171(local9, 4096, local4 - 1);
					this.method2171(local9 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method2171(local9, 5120, local4);
					this.method2171(local9 + 1, 16384, local4);
					this.method2171(local9, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method2171(local9, 20480, local4);
					this.method2171(local9, 65536, local4 + 1);
					this.method2171(local9 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method2171(local9, 81920, local4);
					this.method2171(local9 - 1, 1024, local4);
					this.method2171(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method2171(local9, 536870912, local4);
				this.method2171(local9, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2171(local9, 8388608, local4);
				this.method2171(local9 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method2171(local9, 33554432, local4);
				this.method2171(local9, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2171(local9, 134217728, local4);
				this.method2171(local9 - 1, 8388608, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method2171(local9, 4194304, local4);
				this.method2171(local9 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method2171(local9, 16777216, local4);
				this.method2171(local9 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method2171(local9, 67108864, local4);
				this.method2171(local9 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method2171(local9, 268435456, local4);
				this.method2171(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method2171(local9, 545259520, local4);
			this.method2171(local9, 33554432, local4 - 1);
			this.method2171(local9 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method2171(local9, 41943040, local4);
			this.method2171(local9 + 1, 134217728, local4);
			this.method2171(local9, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method2171(local9, 167772160, local4);
			this.method2171(local9, 536870912, local4 + 1);
			this.method2171(local9 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method2171(local9, 671088640, local4);
			this.method2171(local9 - 1, 8388608, local4);
			this.method2171(local9, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static205.method3534(arg7, arg5, arg7, arg3, arg6, arg0, arg4, arg2) ? true : this.method2181(arg5, arg6, arg4, arg0, arg7, arg7, arg3, arg1, arg2);
		}
		@Pc(39) int local39 = arg6 + arg0 - 1;
		@Pc(46) int local46 = arg3 + arg4 - 1;
		if (arg6 <= arg2 && arg2 <= local39 && arg3 <= arg5 && arg5 <= local46) {
			return true;
		} else if (arg2 == arg6 - 1 && arg5 >= arg3 && arg5 <= local46 && (this.anIntArrayArray30[arg2 - this.anInt2571][arg5 - this.anInt2587] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg2 && arg5 >= arg3 && local46 >= arg5 && (this.anIntArrayArray30[arg2 - this.anInt2571][arg5 - this.anInt2587] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg5 && arg6 <= arg2 && arg2 <= local39 && (this.anIntArrayArray30[arg2 - this.anInt2571][arg5 - this.anInt2587] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg5 && arg2 >= arg6 && local39 >= arg2 && (this.anIntArrayArray30[arg2 - this.anInt2571][arg5 - this.anInt2587] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public void method2180() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2574; local7++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt2589; local17++) {
				if (local7 == 0 || local17 == 0 || this.anInt2574 - 5 <= local7 || this.anInt2589 - 5 <= local17) {
					this.anIntArrayArray30[local7][local17] = -1;
				} else {
					this.anIntArrayArray30[local7][local17] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIBIII)Z")
	public boolean method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg8;
		@Pc(25) int local25 = arg4 + arg0;
		@Pc(30) int local30 = arg1 + arg3;
		@Pc(34) int local34 = arg2 + arg6;
		@Pc(51) int local51;
		@Pc(62) int local62;
		if (local30 == arg8 && (arg7 & 0x2) == 0) {
			local51 = arg6 < arg0 ? arg0 : arg6;
			local62 = local34 > local25 ? local25 : local34;
			while (local51 < local62) {
				if ((this.anIntArrayArray30[local30 - this.anInt2571 - 1][local51 - this.anInt2587] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg1 && (arg7 & 0x8) == 0) {
			local51 = arg6 >= arg0 ? arg6 : arg0;
			local62 = local34 <= local25 ? local34 : local25;
			while (local51 < local62) {
				if ((this.anIntArrayArray30[arg1 - this.anInt2571][local51 - this.anInt2587] & 0x80) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local34 == arg0 && (arg7 & 0x1) == 0) {
			local51 = arg8 > arg1 ? arg8 : arg1;
			local62 = local30 <= local9 ? local30 : local9;
			while (local62 > local51) {
				if ((this.anIntArrayArray30[local51 - this.anInt2571][local34 - this.anInt2587 - 1] & 0x2) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local25 == arg6 && (arg7 & 0x4) == 0) {
			local51 = arg1 < arg8 ? arg8 : arg1;
			local62 = local9 < local30 ? local9 : local30;
			while (local62 > local51) {
				if ((this.anIntArrayArray30[local51 - this.anInt2571][arg6 - this.anInt2587] & 0x20) == 0) {
					return true;
				}
				local51++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIZIIBII)V")
	public void method2182(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(29) int local29;
		if (arg4 == 1 || arg4 == 3) {
			local29 = arg3;
			arg3 = arg5;
			arg5 = local29;
		}
		@Pc(38) int local38 = arg1 - this.anInt2571;
		@Pc(43) int local43 = arg6 - this.anInt2587;
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (local29 = local38; local29 < arg3 + local38; local29++) {
			if (local29 >= 0 && local29 < this.anInt2574) {
				for (@Pc(61) int local61 = local43; local61 < local43 + arg5; local61++) {
					if (local61 >= 0 && this.anInt2589 > local61) {
						this.method2176(local7, local29, local61);
					}
				}
			}
		}
	}
}
