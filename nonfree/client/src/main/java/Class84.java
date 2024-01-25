import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class84 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public int anInt2638;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIIZI)V")
	public void method2342(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt2635;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(37) int local37 = arg5 - this.anInt2638;
		for (@Pc(39) int local39 = local18; local39 < local18 + arg0; local39++) {
			if (local39 >= 0 && this.anInt2631 > local39) {
				for (@Pc(53) int local53 = local37; local53 < arg2 + local37; local53++) {
					if (local53 >= 0 && this.anInt2646 > local53) {
						this.method2349(local7, local53, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII)V")
	public void method2343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2638;
		@Pc(13) int local13 = arg0 - this.anInt2635;
		this.anIntArrayArray37[local13][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public void method2344() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2631; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt2646; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt2631 - 5 <= local15 || local19 >= this.anInt2646 - 5) {
					this.anIntArrayArray37[local15][local19] = -1;
				} else {
					this.anIntArrayArray37[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg6 && arg2 == arg1) {
				return true;
			}
		} else if (arg6 >= arg3 && arg6 <= arg3 + arg0 - 1 && arg1 <= arg1 && arg1 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(65) int local65 = arg2 - this.anInt2638;
		@Pc(70) int local70 = arg3 - this.anInt2635;
		@Pc(75) int local75 = arg6 - this.anInt2635;
		@Pc(80) int local80 = arg1 - this.anInt2638;
		if (arg0 == 1) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					if (local70 == local75 - 1 && local65 == local80) {
						return true;
					}
					if (local70 == local75 && local65 == local80 + 1 && (this.anIntArrayArray37[local70][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local75 && local80 - 1 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local75 == local70 && local65 == local80 + 1) {
						return true;
					}
					if (local75 - 1 == local70 && local80 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local80 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local75 + 1 && local80 == local65) {
						return true;
					}
					if (local75 == local70 && local65 == local80 + 1 && (this.anIntArrayArray37[local70][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local75 && local65 == local80 - 1 && (this.anIntArrayArray37[local70][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 == local75 && local80 - 1 == local65) {
						return true;
					}
					if (local70 == local75 - 1 && local80 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local80 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					if (local70 == local75 - 1 && local80 == local65) {
						return true;
					}
					if (local70 == local75 && local65 == local80 + 1) {
						return true;
					}
					if (local75 + 1 == local70 && local65 == local80 && (this.anIntArrayArray37[local70][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local75 && local65 == local80 - 1 && (this.anIntArrayArray37[local70][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 == local75 - 1 && local80 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local75 && local65 == local80 + 1) {
						return true;
					}
					if (local70 == local75 + 1 && local80 == local65) {
						return true;
					}
					if (local75 == local70 && local65 == local80 - 1 && (this.anIntArrayArray37[local70][local65] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local75 - 1 == local70 && local65 == local80 && (this.anIntArrayArray37[local70][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local75 && local80 + 1 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local80 == local65) {
						return true;
					}
					if (local70 == local75 && local80 - 1 == local65) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 == local75 - 1 && local80 == local65) {
						return true;
					}
					if (local70 == local75 && local80 + 1 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local65 == local80 && (this.anIntArrayArray37[local70][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local75 && local80 - 1 == local65) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local70 == local75 && local65 == local80 + 1 && (this.anIntArrayArray37[local70][local65] & 0x20) == 0) {
					return true;
				}
				if (local75 == local70 && local80 - 1 == local65 && (this.anIntArrayArray37[local70][local65] & 0x2) == 0) {
					return true;
				}
				if (local75 - 1 == local70 && local65 == local80 && (this.anIntArrayArray37[local70][local65] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local70 && local65 == local80 && (this.anIntArrayArray37[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = local70 + arg0 - 1;
			@Pc(96) int local96 = arg0 + local65 - 1;
			if (arg4 == 0) {
				if (arg5 == 0) {
					if (local75 - arg0 == local70 && local80 >= local65 && local96 >= local80) {
						return true;
					}
					if (local75 >= local70 && local75 <= local90 && local80 + 1 == local65 && (this.anIntArrayArray37[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local70 && local90 >= local75 && local80 - arg0 == local65 && (this.anIntArrayArray37[local75][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local75 >= local70 && local90 >= local75 && local65 == local80 + 1) {
						return true;
					}
					if (local70 == local75 - arg0 && local65 <= local80 && local80 <= local96 && (this.anIntArrayArray37[local90][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local70 && local80 >= local65 && local80 <= local96 && (this.anIntArrayArray37[local70][local80] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local75 + 1 == local70 && local65 <= local80 && local80 <= local96) {
						return true;
					}
					if (local75 >= local70 && local90 >= local75 && local65 == local80 + 1 && (this.anIntArrayArray37[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local70 && local90 >= local75 && local80 - arg0 == local65 && (this.anIntArrayArray37[local75][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local75 >= local70 && local75 <= local90 && local65 == local80 - arg0) {
						return true;
					}
					if (local75 - arg0 == local70 && local65 <= local80 && local96 >= local80 && (this.anIntArrayArray37[local90][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local65 <= local80 && local96 >= local80 && (this.anIntArrayArray37[local70][local80] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					if (local75 - arg0 == local70 && local80 >= local65 && local96 >= local80) {
						return true;
					}
					if (local70 <= local75 && local90 >= local75 && local65 == local80 + 1) {
						return true;
					}
					if (local70 == local75 + 1 && local65 <= local80 && local96 >= local80 && (this.anIntArrayArray37[local70][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 <= local75 && local90 >= local75 && local80 - arg0 == local65 && (this.anIntArrayArray37[local75][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local75 - arg0 == local70 && local80 >= local65 && local80 <= local96 && (this.anIntArrayArray37[local90][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local70 && local75 <= local90 && local65 == local80 + 1) {
						return true;
					}
					if (local70 == local75 + 1 && local65 <= local80 && local80 <= local96) {
						return true;
					}
					if (local75 >= local70 && local90 >= local75 && local80 - arg0 == local65 && (this.anIntArrayArray37[local75][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local75 - arg0 && local65 <= local80 && local96 >= local80 && (this.anIntArrayArray37[local90][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local70 && local75 <= local90 && local80 + 1 == local65 && (this.anIntArrayArray37[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local80 >= local65 && local96 >= local80) {
						return true;
					}
					if (local70 <= local75 && local90 >= local75 && local80 - arg0 == local65) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local75 - arg0 == local70 && local65 <= local80 && local80 <= local96) {
						return true;
					}
					if (local75 >= local70 && local75 <= local90 && local80 + 1 == local65 && (this.anIntArrayArray37[local75][local65] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local75 + 1 && local80 >= local65 && local96 >= local80 && (this.anIntArrayArray37[local70][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 <= local75 && local75 <= local90 && local80 - arg0 == local65) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local70 <= local75 && local75 <= local90 && local65 == local80 + 1 && (this.anIntArrayArray37[local75][local65] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 >= local70 && local75 <= local90 && local80 - arg0 == local65 && (this.anIntArrayArray37[local75][local96] & 0x2C0102) == 0) {
					return true;
				}
				if (local75 - arg0 == local70 && local65 <= local80 && local80 <= local96 && (this.anIntArrayArray37[local90][local80] & 0x2C0108) == 0) {
					return true;
				}
				if (local70 == local75 + 1 && local80 >= local65 && local80 <= local96 && (this.anIntArrayArray37[local70][local80] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static34.method7578(arg4, arg1, arg7, arg3, arg5, arg1, arg2, arg0) ? true : this.method2357(arg1, arg3, arg1, arg2, arg0, arg7, arg6, arg4, arg5);
		}
		@Pc(47) int local47 = arg3 + arg5 - 1;
		@Pc(53) int local53 = arg7 + arg2 - 1;
		if (arg0 >= arg5 && local47 >= arg0 && arg4 >= arg2 && local53 >= arg4) {
			return true;
		} else if (arg5 - 1 == arg0 && arg4 >= arg2 && local53 >= arg4 && (this.anIntArrayArray37[arg0 - this.anInt2635][arg4 - this.anInt2638] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local47 + 1 == arg0 && arg4 >= arg2 && local53 >= arg4 && (this.anIntArrayArray37[arg0 - this.anInt2635][arg4 - this.anInt2638] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg2 - 1 == arg4 && arg5 <= arg0 && local47 >= arg0 && (this.anIntArrayArray37[arg0 - this.anInt2635][arg4 - this.anInt2638] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local53 + 1 && arg0 >= arg5 && arg0 <= local47 && (this.anIntArrayArray37[arg0 - this.anInt2635][arg4 - this.anInt2638] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg6 && arg0 == arg5) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg6 + arg1 - 1 && arg5 >= arg5 && arg1 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(59) int local59 = arg6 - this.anInt2635;
		@Pc(64) int local64 = arg5 - this.anInt2638;
		@Pc(69) int local69 = arg0 - this.anInt2638;
		@Pc(80) int local80 = arg3 - this.anInt2635;
		if (arg1 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local59 == local80 + 1 && local64 == local69 && (this.anIntArrayArray37[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local80 == local59 && local64 - 1 == local69 && (this.anIntArrayArray37[local59][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local59 == local80 - 1 && local69 == local64 && (this.anIntArrayArray37[local59][local69] & 0x8) == 0) {
						return true;
					}
					if (local80 == local59 && local64 - 1 == local69 && (this.anIntArrayArray37[local59][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local59 == local80 - 1 && local64 == local69 && (this.anIntArrayArray37[local59][local69] & 0x8) == 0) {
						return true;
					}
					if (local59 == local80 && local69 == local64 + 1 && (this.anIntArrayArray37[local59][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local59 == local80 + 1 && local69 == local64 && (this.anIntArrayArray37[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local80 == local59 && local69 == local64 + 1 && (this.anIntArrayArray37[local59][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local59 == local80 && local64 + 1 == local69 && (this.anIntArrayArray37[local59][local69] & 0x20) == 0) {
					return true;
				}
				if (local80 == local59 && local64 - 1 == local69 && (this.anIntArrayArray37[local59][local69] & 0x2) == 0) {
					return true;
				}
				if (local80 - 1 == local59 && local64 == local69 && (this.anIntArrayArray37[local59][local69] & 0x8) == 0) {
					return true;
				}
				if (local80 + 1 == local59 && local64 == local69 && (this.anIntArrayArray37[local59][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(92) int local92 = local59 + arg1 - 1;
			@Pc(98) int local98 = arg1 + local69 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local80 + 1 == local59 && local69 <= local64 && local64 <= local98 && (this.anIntArrayArray37[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local80 >= local59 && local92 >= local80 && local64 - arg1 == local69 && (this.anIntArrayArray37[local80][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local80 - arg1 == local59 && local64 >= local69 && local98 >= local64 && (this.anIntArrayArray37[local92][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local80 && local80 <= local92 && local69 == local64 - arg1 && (this.anIntArrayArray37[local80][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local59 == local80 - arg1 && local64 >= local69 && local64 <= local98 && (this.anIntArrayArray37[local92][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local80 && local80 <= local92 && local64 + 1 == local69 && (this.anIntArrayArray37[local80][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local59 == local80 + 1 && local64 >= local69 && local64 <= local98 && (this.anIntArrayArray37[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local80 >= local59 && local92 >= local80 && local64 + 1 == local69 && (this.anIntArrayArray37[local80][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local80 >= local59 && local92 >= local80 && local64 + 1 == local69 && (this.anIntArrayArray37[local80][local69] & 0x20) == 0) {
					return true;
				}
				if (local59 <= local80 && local92 >= local80 && local64 - arg1 == local69 && (this.anIntArrayArray37[local80][local98] & 0x2) == 0) {
					return true;
				}
				if (local80 - arg1 == local59 && local69 <= local64 && local64 <= local98 && (this.anIntArrayArray37[local92][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 == local80 + 1 && local69 <= local64 && local64 <= local98 && (this.anIntArrayArray37[local59][local64] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIB)V")
	private void method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray37[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZIIZI)V")
	public void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt2638;
		@Pc(23) int local23 = arg4 - this.anInt2635;
		@Pc(33) int local33;
		if (arg6 == 1 || arg6 == 3) {
			local33 = arg0;
			arg0 = arg2;
			arg2 = local33;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (local33 = local23; local33 < arg0 + local23; local33++) {
			if (local33 >= 0 && local33 < this.anInt2631) {
				for (@Pc(66) int local66 = local18; local66 < arg2 + local18; local66++) {
					if (local66 >= 0 && local66 < this.anInt2646) {
						this.method2353(local33, local66, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZIIIII)V")
	public void method2351(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - this.anInt2635;
		@Pc(19) int local19 = arg3 - this.anInt2638;
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2349(128, local19, local10);
				this.method2349(8, local19, local10 - 1);
			}
			if (arg5 == 1) {
				this.method2349(2, local19, local10);
				this.method2349(32, local19 + 1, local10);
			}
			if (arg5 == 2) {
				this.method2349(8, local19, local10);
				this.method2349(128, local19, local10 + 1);
			}
			if (arg5 == 3) {
				this.method2349(32, local19, local10);
				this.method2349(2, local19 - 1, local10);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2349(1, local19, local10);
				this.method2349(16, local19 + 1, local10 + -1);
			}
			if (arg5 == 1) {
				this.method2349(4, local19, local10);
				this.method2349(64, local19 + 1, local10 - -1);
			}
			if (arg5 == 2) {
				this.method2349(16, local19, local10);
				this.method2349(1, local19 - 1, local10 - -1);
			}
			if (arg5 == 3) {
				this.method2349(64, local19, local10);
				this.method2349(4, local19 - 1, local10 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg5 == 0) {
				this.method2349(130, local19, local10);
				this.method2349(8, local19, local10 - 1);
				this.method2349(32, local19 + 1, local10);
			}
			if (arg5 == 1) {
				this.method2349(10, local19, local10);
				this.method2349(32, local19 + 1, local10);
				this.method2349(128, local19, local10 + 1);
			}
			if (arg5 == 2) {
				this.method2349(40, local19, local10);
				this.method2349(128, local19, local10 + 1);
				this.method2349(2, local19 - 1, local10);
			}
			if (arg5 == 3) {
				this.method2349(160, local19, local10);
				this.method2349(2, local19 - 1, local10);
				this.method2349(8, local19, local10 - 1);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg5 == 0) {
					this.method2349(65536, local19, local10);
					this.method2349(4096, local19, local10 - 1);
				}
				if (arg5 == 1) {
					this.method2349(1024, local19, local10);
					this.method2349(16384, local19 + 1, local10);
				}
				if (arg5 == 2) {
					this.method2349(4096, local19, local10);
					this.method2349(65536, local19, local10 + 1);
				}
				if (arg5 == 3) {
					this.method2349(16384, local19, local10);
					this.method2349(1024, local19 - 1, local10);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg5 == 0) {
					this.method2349(512, local19, local10);
					this.method2349(8192, local19 + 1, local10 - 1);
				}
				if (arg5 == 1) {
					this.method2349(2048, local19, local10);
					this.method2349(32768, local19 + 1, local10 + 1);
				}
				if (arg5 == 2) {
					this.method2349(8192, local19, local10);
					this.method2349(512, local19 - 1, local10 - -1);
				}
				if (arg5 == 3) {
					this.method2349(32768, local19, local10);
					this.method2349(2048, local19 - 1, local10 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg5 == 0) {
					this.method2349(66560, local19, local10);
					this.method2349(4096, local19, local10 - 1);
					this.method2349(16384, local19 + 1, local10);
				}
				if (arg5 == 1) {
					this.method2349(5120, local19, local10);
					this.method2349(16384, local19 + 1, local10);
					this.method2349(65536, local19, local10 + 1);
				}
				if (arg5 == 2) {
					this.method2349(20480, local19, local10);
					this.method2349(65536, local19, local10 + 1);
					this.method2349(1024, local19 - 1, local10);
				}
				if (arg5 == 3) {
					this.method2349(81920, local19, local10);
					this.method2349(1024, local19 - 1, local10);
					this.method2349(4096, local19, local10 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg5 == 0) {
				this.method2349(536870912, local19, local10);
				this.method2349(33554432, local19, local10 - 1);
			}
			if (arg5 == 1) {
				this.method2349(8388608, local19, local10);
				this.method2349(134217728, local19 + 1, local10);
			}
			if (arg5 == 2) {
				this.method2349(33554432, local19, local10);
				this.method2349(536870912, local19, local10 + 1);
			}
			if (arg5 == 3) {
				this.method2349(134217728, local19, local10);
				this.method2349(8388608, local19 - 1, local10);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg5 == 0) {
				this.method2349(4194304, local19, local10);
				this.method2349(67108864, local19 + 1, local10 + -1);
			}
			if (arg5 == 1) {
				this.method2349(16777216, local19, local10);
				this.method2349(268435456, local19 + 1, local10 + 1);
			}
			if (arg5 == 2) {
				this.method2349(67108864, local19, local10);
				this.method2349(4194304, local19 - 1, local10 + 1);
			}
			if (arg5 == 3) {
				this.method2349(268435456, local19, local10);
				this.method2349(16777216, local19 - 1, local10 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2349(545259520, local19, local10);
			this.method2349(33554432, local19, local10 - 1);
			this.method2349(134217728, local19 + 1, local10);
		}
		if (arg5 == 1) {
			this.method2349(41943040, local19, local10);
			this.method2349(134217728, local19 + 1, local10);
			this.method2349(536870912, local19, local10 + 1);
		}
		if (arg5 == 2) {
			this.method2349(167772160, local19, local10);
			this.method2349(536870912, local19, local10 + 1);
			this.method2349(8388608, local19 - 1, local10);
		}
		if (arg5 == 3) {
			this.method2349(671088640, local19, local10);
			this.method2349(8388608, local19 - 1, local10);
			this.method2349(33554432, local19, local10 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZZIZII)V")
	public void method2352(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2635;
		@Pc(13) int local13 = arg5 - this.anInt2638;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2353(local8, local13, 128);
				this.method2353(local8 - 1, local13, 8);
			}
			if (arg2 == 1) {
				this.method2353(local8, local13, 2);
				this.method2353(local8, local13 + 1, 32);
			}
			if (arg2 == 2) {
				this.method2353(local8, local13, 8);
				this.method2353(local8 + 1, local13, 128);
			}
			if (arg2 == 3) {
				this.method2353(local8, local13, 32);
				this.method2353(local8, local13 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2353(local8, local13, 1);
				this.method2353(local8 - 1, local13 + 1, 16);
			}
			if (arg2 == 1) {
				this.method2353(local8, local13, 4);
				this.method2353(local8 + 1, local13 + 1, 64);
			}
			if (arg2 == 2) {
				this.method2353(local8, local13, 16);
				this.method2353(local8 + 1, local13 - 1, 1);
			}
			if (arg2 == 3) {
				this.method2353(local8, local13, 64);
				this.method2353(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method2353(local8, local13, 130);
				this.method2353(local8 - 1, local13, 8);
				this.method2353(local8, local13 + 1, 32);
			}
			if (arg2 == 1) {
				this.method2353(local8, local13, 10);
				this.method2353(local8, local13 + 1, 32);
				this.method2353(local8 + 1, local13, 128);
			}
			if (arg2 == 2) {
				this.method2353(local8, local13, 40);
				this.method2353(local8 + 1, local13, 128);
				this.method2353(local8, local13 - 1, 2);
			}
			if (arg2 == 3) {
				this.method2353(local8, local13, 160);
				this.method2353(local8, local13 - 1, 2);
				this.method2353(local8 - 1, local13, 8);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method2353(local8, local13, 65536);
					this.method2353(local8 - 1, local13, 4096);
				}
				if (arg2 == 1) {
					this.method2353(local8, local13, 1024);
					this.method2353(local8, local13 + 1, 16384);
				}
				if (arg2 == 2) {
					this.method2353(local8, local13, 4096);
					this.method2353(local8 + 1, local13, 65536);
				}
				if (arg2 == 3) {
					this.method2353(local8, local13, 16384);
					this.method2353(local8, local13 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method2353(local8, local13, 512);
					this.method2353(local8 - 1, local13 - -1, 8192);
				}
				if (arg2 == 1) {
					this.method2353(local8, local13, 2048);
					this.method2353(local8 + 1, local13 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method2353(local8, local13, 8192);
					this.method2353(local8 + 1, local13 + -1, 512);
				}
				if (arg2 == 3) {
					this.method2353(local8, local13, 32768);
					this.method2353(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method2353(local8, local13, 66560);
					this.method2353(local8 - 1, local13, 4096);
					this.method2353(local8, local13 + 1, 16384);
				}
				if (arg2 == 1) {
					this.method2353(local8, local13, 5120);
					this.method2353(local8, local13 + 1, 16384);
					this.method2353(local8 + 1, local13, 65536);
				}
				if (arg2 == 2) {
					this.method2353(local8, local13, 20480);
					this.method2353(local8 + 1, local13, 65536);
					this.method2353(local8, local13 - 1, 1024);
				}
				if (arg2 == 3) {
					this.method2353(local8, local13, 81920);
					this.method2353(local8, local13 - 1, 1024);
					this.method2353(local8 - 1, local13, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method2353(local8, local13, 536870912);
				this.method2353(local8 - 1, local13, 33554432);
			}
			if (arg2 == 1) {
				this.method2353(local8, local13, 8388608);
				this.method2353(local8, local13 + 1, 134217728);
			}
			if (arg2 == 2) {
				this.method2353(local8, local13, 33554432);
				this.method2353(local8 + 1, local13, 536870912);
			}
			if (arg2 == 3) {
				this.method2353(local8, local13, 134217728);
				this.method2353(local8, local13 - 1, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method2353(local8, local13, 4194304);
				this.method2353(local8 - 1, local13 + 1, 67108864);
			}
			if (arg2 == 1) {
				this.method2353(local8, local13, 16777216);
				this.method2353(local8 + 1, local13 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method2353(local8, local13, 67108864);
				this.method2353(local8 + 1, local13 - 1, 4194304);
			}
			if (arg2 == 3) {
				this.method2353(local8, local13, 268435456);
				this.method2353(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method2353(local8, local13, 545259520);
			this.method2353(local8 - 1, local13, 33554432);
			this.method2353(local8, local13 + 1, 134217728);
		}
		if (arg2 == 1) {
			this.method2353(local8, local13, 41943040);
			this.method2353(local8, local13 + 1, 134217728);
			this.method2353(local8 + 1, local13, 536870912);
		}
		if (arg2 == 2) {
			this.method2353(local8, local13, 167772160);
			this.method2353(local8 + 1, local13, 536870912);
			this.method2353(local8, local13 - 1, 8388608);
		}
		if (arg2 == 3) {
			this.method2353(local8, local13, 671088640);
			this.method2353(local8, local13 - 1, 8388608);
			this.method2353(local8 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
	private void method2353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray37[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	public void method2354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2638;
		@Pc(13) int local13 = arg0 - this.anInt2635;
		this.anIntArrayArray37[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)V")
	public void method2355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2638;
		@Pc(13) int local13 = arg1 - this.anInt2635;
		this.anIntArrayArray37[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg4;
		@Pc(13) int local13 = arg2 + arg7;
		@Pc(17) int local17 = arg1 + arg8;
		@Pc(27) int local27 = arg5 + arg3;
		@Pc(65) int local65;
		@Pc(76) int local76;
		if (arg4 == local17 && (arg6 & 0x2) == 0) {
			local65 = arg3 >= arg7 ? arg3 : arg7;
			local76 = local13 >= local27 ? local27 : local13;
			while (local76 > local65) {
				if ((this.anIntArrayArray37[local17 - this.anInt2635 - 1][local65 - this.anInt2638] & 0x8) == 0) {
					return true;
				}
				local65++;
			}
		} else if (arg8 == local9 && (arg6 & 0x8) == 0) {
			local65 = arg7 <= arg3 ? arg3 : arg7;
			local76 = local13 < local27 ? local13 : local27;
			while (local76 > local65) {
				if ((this.anIntArrayArray37[arg8 - this.anInt2635][local65 - this.anInt2638] & 0x80) == 0) {
					return true;
				}
				local65++;
			}
		} else if (arg7 == local27 && (arg6 & 0x1) == 0) {
			local65 = arg8 < arg4 ? arg4 : arg8;
			local76 = local9 < local17 ? local9 : local17;
			while (local76 > local65) {
				if ((this.anIntArrayArray37[local65 - this.anInt2635][local27 - this.anInt2638 - 1] & 0x2) == 0) {
					return true;
				}
				local65++;
			}
		} else if (local13 == arg3 && (arg6 & 0x4) == 0) {
			local65 = arg4 <= arg8 ? arg8 : arg4;
			local76 = local9 < local17 ? local9 : local17;
			while (local76 > local65) {
				if ((this.anIntArrayArray37[local65 - this.anInt2635][arg3 - this.anInt2638] & 0x20) == 0) {
					return true;
				}
				local65++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
	public void method2358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2635;
		@Pc(9) int local9 = arg1 - this.anInt2638;
		this.anIntArrayArray37[local4][local9] |= 0x40000;
	}
}
