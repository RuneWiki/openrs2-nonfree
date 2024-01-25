import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class189 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public int anInt5292;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public int anInt5293;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public int anInt5299;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public int anInt5301;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
	private void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray43[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIZZIIZ)V")
	public void method4588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29;
		if (arg4 == 1 || arg4 == 3) {
			local29 = arg2;
			arg2 = arg1;
			arg1 = local29;
		}
		@Pc(42) int local42 = arg0 - this.anInt5293;
		@Pc(47) int local47 = arg5 - this.anInt5301;
		for (local29 = local47; local29 < local47 + arg2; local29++) {
			if (local29 >= 0 && this.anInt5292 > local29) {
				for (@Pc(63) int local63 = local42; local63 < local42 + arg1; local63++) {
					if (local63 >= 0 && local63 < this.anInt5299) {
						this.method4587(local29, local63, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	private void method4589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray43[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static395.method5805(arg2, arg4, arg5, arg7, arg6, arg6, arg0, arg3) ? true : this.method4596(arg6, arg1, arg6, arg3, arg2, arg4, arg0, arg5, arg7);
		}
		@Pc(38) int local38 = arg2 + arg4 - 1;
		@Pc(44) int local44 = arg5 + arg3 - 1;
		if (arg4 <= arg0 && local38 >= arg0 && arg3 <= arg7 && arg7 <= local44) {
			return true;
		} else if (arg0 == arg4 - 1 && arg7 >= arg3 && arg7 <= local44 && (this.anIntArrayArray43[arg0 - this.anInt5301][arg7 - this.anInt5293] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg0 == local38 + 1 && arg7 >= arg3 && arg7 <= local44 && (this.anIntArrayArray43[arg0 - this.anInt5301][arg7 - this.anInt5293] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg7 && arg4 <= arg0 && arg0 <= local38 && (this.anIntArrayArray43[arg0 - this.anInt5301][arg7 - this.anInt5293] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg7 && arg4 <= arg0 && local38 >= arg0 && (this.anIntArrayArray43[arg0 - this.anInt5301][arg7 - this.anInt5293] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method4591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg4 == arg5 && arg0 == arg1) {
				return true;
			}
		} else if (arg5 >= arg4 && arg5 <= arg2 + arg4 - 1 && arg1 <= arg1 && arg1 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg1 - this.anInt5293;
		@Pc(64) int local64 = arg5 - this.anInt5301;
		@Pc(69) int local69 = arg0 - this.anInt5293;
		@Pc(74) int local74 = arg4 - this.anInt5301;
		if (arg2 == 1) {
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local64 - 1 == local74 && local59 == local69) {
						return true;
					}
					if (local74 == local64 && local69 == local59 + 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local74 && local69 == local59 - 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local74 == local64 && local59 + 1 == local69) {
						return true;
					}
					if (local74 == local64 - 1 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local74 && local59 == local69 && (this.anIntArrayArray43[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local74 == local64 + 1 && local59 == local69) {
						return true;
					}
					if (local64 == local74 && local69 == local59 + 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local64 && local69 == local59 - 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local74 == local64 && local69 == local59 - 1) {
						return true;
					}
					if (local64 - 1 == local74 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local64 + 1 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local64 - 1 == local74 && local59 == local69) {
						return true;
					}
					if (local74 == local64 && local69 == local59 + 1) {
						return true;
					}
					if (local74 == local64 + 1 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local64 && local69 == local59 - 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local74 == local64 - 1 && local59 == local69 && (this.anIntArrayArray43[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local64 && local59 + 1 == local69) {
						return true;
					}
					if (local64 + 1 == local74 && local59 == local69) {
						return true;
					}
					if (local74 == local64 && local59 - 1 == local69 && (this.anIntArrayArray43[local74][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 - 1 == local74 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local74 && local59 + 1 == local69 && (this.anIntArrayArray43[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local74 && local59 == local69) {
						return true;
					}
					if (local64 == local74 && local59 - 1 == local69) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 - 1 == local74 && local69 == local59) {
						return true;
					}
					if (local64 == local74 && local69 == local59 + 1 && (this.anIntArrayArray43[local74][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local64 + 1 && local69 == local59 && (this.anIntArrayArray43[local74][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local64 && local59 - 1 == local69) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local74 == local64 && local59 + 1 == local69 && (this.anIntArrayArray43[local74][local69] & 0x20) == 0) {
					return true;
				}
				if (local64 == local74 && local59 - 1 == local69 && (this.anIntArrayArray43[local74][local69] & 0x2) == 0) {
					return true;
				}
				if (local74 == local64 - 1 && local59 == local69 && (this.anIntArrayArray43[local74][local69] & 0x8) == 0) {
					return true;
				}
				if (local74 == local64 + 1 && local59 == local69 && (this.anIntArrayArray43[local74][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local74 + arg2 - 1;
			@Pc(92) int local92 = arg2 + local69 - 1;
			if (arg6 == 0) {
				if (arg3 == 0) {
					if (local74 == local64 - arg2 && local69 <= local59 && local92 >= local59) {
						return true;
					}
					if (local64 >= local74 && local86 >= local64 && local59 + 1 == local69 && (this.anIntArrayArray43[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local74 && local86 >= local64 && local69 == local59 - arg2 && (this.anIntArrayArray43[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 >= local74 && local64 <= local86 && local69 == local59 + 1) {
						return true;
					}
					if (local64 - arg2 == local74 && local59 >= local69 && local59 <= local92 && (this.anIntArrayArray43[local86][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local64 + 1 && local69 <= local59 && local59 <= local92 && (this.anIntArrayArray43[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local74 == local64 + 1 && local69 <= local59 && local59 <= local92) {
						return true;
					}
					if (local64 >= local74 && local86 >= local64 && local69 == local59 + 1 && (this.anIntArrayArray43[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 <= local64 && local86 >= local64 && local69 == local59 - arg2 && (this.anIntArrayArray43[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 >= local74 && local86 >= local64 && local69 == local59 - arg2) {
						return true;
					}
					if (local74 == local64 - arg2 && local69 <= local59 && local59 <= local92 && (this.anIntArrayArray43[local86][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local74 && local59 >= local69 && local59 <= local92 && (this.anIntArrayArray43[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg3 == 0) {
					if (local74 == local64 - arg2 && local69 <= local59 && local92 >= local59) {
						return true;
					}
					if (local74 <= local64 && local64 <= local86 && local69 == local59 + 1) {
						return true;
					}
					if (local74 == local64 + 1 && local69 <= local59 && local92 >= local59 && (this.anIntArrayArray43[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local59 - arg2 == local69 && (this.anIntArrayArray43[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 - arg2 == local74 && local59 >= local69 && local92 >= local59 && (this.anIntArrayArray43[local86][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local59 + 1 == local69) {
						return true;
					}
					if (local64 + 1 == local74 && local69 <= local59 && local59 <= local92) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local59 - arg2 == local69 && (this.anIntArrayArray43[local64][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 - arg2 == local74 && local59 >= local69 && local59 <= local92 && (this.anIntArrayArray43[local86][local59] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local69 == local59 + 1 && (this.anIntArrayArray43[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local64 + 1 && local59 >= local69 && local92 >= local59) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local59 - arg2 == local69) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 - arg2 == local74 && local69 <= local59 && local92 >= local59) {
						return true;
					}
					if (local64 >= local74 && local64 <= local86 && local69 == local59 + 1 && (this.anIntArrayArray43[local64][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local64 + 1 && local69 <= local59 && local59 <= local92 && (this.anIntArrayArray43[local74][local59] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local74 && local86 >= local64 && local59 - arg2 == local69) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local74 <= local64 && local86 >= local64 && local59 + 1 == local69 && (this.anIntArrayArray43[local64][local69] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 >= local74 && local86 >= local64 && local59 - arg2 == local69 && (this.anIntArrayArray43[local64][local92] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 == local64 - arg2 && local59 >= local69 && local92 >= local59 && (this.anIntArrayArray43[local86][local59] & 0x2C0108) == 0) {
					return true;
				}
				if (local74 == local64 + 1 && local59 >= local69 && local92 >= local59 && (this.anIntArrayArray43[local74][local59] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg4 == arg6 && arg0 == arg5) {
				return true;
			}
		} else if (arg6 <= arg4 && arg6 + arg2 - 1 >= arg4 && arg5 >= arg5 && arg5 <= arg2 + arg5 - 1) {
			return true;
		}
		@Pc(61) int local61 = arg5 - this.anInt5293;
		@Pc(66) int local66 = arg6 - this.anInt5301;
		@Pc(71) int local71 = arg0 - this.anInt5293;
		@Pc(76) int local76 = arg4 - this.anInt5301;
		if (arg2 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local66 == local76 + 1 && local61 == local71 && (this.anIntArrayArray43[local66][local71] & 0x80) == 0) {
						return true;
					}
					if (local76 == local66 && local61 - 1 == local71 && (this.anIntArrayArray43[local66][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local76 - 1 == local66 && local71 == local61 && (this.anIntArrayArray43[local66][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 == local66 && local61 - 1 == local71 && (this.anIntArrayArray43[local66][local71] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local76 - 1 == local66 && local71 == local61 && (this.anIntArrayArray43[local66][local71] & 0x8) == 0) {
						return true;
					}
					if (local76 == local66 && local61 + 1 == local71 && (this.anIntArrayArray43[local66][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 == local76 + 1 && local71 == local61 && (this.anIntArrayArray43[local66][local71] & 0x80) == 0) {
						return true;
					}
					if (local76 == local66 && local71 == local61 + 1 && (this.anIntArrayArray43[local66][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local66 == local76 && local61 + 1 == local71 && (this.anIntArrayArray43[local66][local71] & 0x20) == 0) {
					return true;
				}
				if (local66 == local76 && local61 - 1 == local71 && (this.anIntArrayArray43[local66][local71] & 0x2) == 0) {
					return true;
				}
				if (local76 - 1 == local66 && local71 == local61 && (this.anIntArrayArray43[local66][local71] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local66 && local61 == local71 && (this.anIntArrayArray43[local66][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(85) int local85 = arg2 + local66 - 1;
			@Pc(91) int local91 = arg2 + local71 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local66 == local76 + 1 && local71 <= local61 && local91 >= local61 && (this.anIntArrayArray43[local66][local61] & 0x80) == 0) {
						return true;
					}
					if (local66 <= local76 && local85 >= local76 && local61 - arg2 == local71 && (this.anIntArrayArray43[local76][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 == local76 - arg2 && local61 >= local71 && local61 <= local91 && (this.anIntArrayArray43[local85][local61] & 0x8) == 0) {
						return true;
					}
					if (local66 <= local76 && local76 <= local85 && local61 - arg2 == local71 && (this.anIntArrayArray43[local76][local91] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 == local76 - arg2 && local71 <= local61 && local61 <= local91 && (this.anIntArrayArray43[local85][local61] & 0x8) == 0) {
						return true;
					}
					if (local76 >= local66 && local76 <= local85 && local61 + 1 == local71 && (this.anIntArrayArray43[local76][local71] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local76 + 1 == local66 && local71 <= local61 && local61 <= local91 && (this.anIntArrayArray43[local66][local61] & 0x80) == 0) {
						return true;
					}
					if (local76 >= local66 && local85 >= local76 && local71 == local61 + 1 && (this.anIntArrayArray43[local76][local71] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local66 <= local76 && local85 >= local76 && local71 == local61 + 1 && (this.anIntArrayArray43[local76][local71] & 0x20) == 0) {
					return true;
				}
				if (local66 <= local76 && local85 >= local76 && local71 == local61 - arg2 && (this.anIntArrayArray43[local76][local91] & 0x2) == 0) {
					return true;
				}
				if (local66 == local76 - arg2 && local61 >= local71 && local91 >= local61 && (this.anIntArrayArray43[local85][local61] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local66 && local71 <= local61 && local61 <= local91 && (this.anIntArrayArray43[local66][local61] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public void method4593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt5293;
		@Pc(26) int local26 = arg0 - this.anInt5301;
		this.anIntArrayArray43[local26][local8] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	public void method4594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - this.anInt5293;
		@Pc(17) int local17 = arg0 - this.anInt5301;
		this.anIntArrayArray43[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
	public void method4595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - this.anInt5301;
		@Pc(18) int local18 = arg1 - this.anInt5293;
		this.anIntArrayArray43[local13][local18] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg6;
		@Pc(13) int local13 = arg2 + arg8;
		@Pc(23) int local23 = arg5 + arg4;
		@Pc(27) int local27 = arg3 + arg7;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (local23 == arg6 && (arg1 & 0x2) == 0) {
			local76 = arg3 >= arg8 ? arg3 : arg8;
			local83 = local27 > local13 ? local13 : local27;
			while (local83 > local76) {
				if ((this.anIntArrayArray43[local23 - this.anInt5301 - 1][local76 - this.anInt5293] & 0x8) == 0) {
					return true;
				}
				local76++;
			}
		} else if (local9 == arg5 && (arg1 & 0x8) == 0) {
			local76 = arg8 > arg3 ? arg8 : arg3;
			local83 = local13 >= local27 ? local27 : local13;
			while (local83 > local76) {
				if ((this.anIntArrayArray43[arg5 - this.anInt5301][local76 - this.anInt5293] & 0x80) == 0) {
					return true;
				}
				local76++;
			}
		} else if (arg8 == local27 && (arg1 & 0x1) == 0) {
			local76 = arg6 <= arg5 ? arg5 : arg6;
			local83 = local23 > local9 ? local9 : local23;
			while (local76 < local83) {
				if ((this.anIntArrayArray43[local76 - this.anInt5301][local27 - this.anInt5293 - 1] & 0x2) == 0) {
					return true;
				}
				local76++;
			}
		} else if (local13 == arg3 && (arg1 & 0x4) == 0) {
			local76 = arg6 > arg5 ? arg6 : arg5;
			local83 = local9 < local23 ? local9 : local23;
			while (local83 > local76) {
				if ((this.anIntArrayArray43[local76 - this.anInt5301][arg3 - this.anInt5293] & 0x20) == 0) {
					return true;
				}
				local76++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIZZI)V")
	public void method4598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt5301;
		@Pc(23) int local23 = arg2 - this.anInt5293;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local18; local39 < arg5 + local18; local39++) {
			if (local39 >= 0 && this.anInt5292 > local39) {
				for (@Pc(49) int local49 = local23; local49 < arg1 + local23; local49++) {
					if (local49 >= 0 && local49 < this.anInt5299) {
						this.method4589(local7, local39, local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIZIIII)V")
	public void method4599(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt5301;
		@Pc(13) int local13 = arg5 - this.anInt5293;
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method4587(local4, local13, 128);
				this.method4587(local4 - 1, local13, 8);
			}
			if (arg4 == 1) {
				this.method4587(local4, local13, 2);
				this.method4587(local4, local13 + 1, 32);
			}
			if (arg4 == 2) {
				this.method4587(local4, local13, 8);
				this.method4587(local4 + 1, local13, 128);
			}
			if (arg4 == 3) {
				this.method4587(local4, local13, 32);
				this.method4587(local4, local13 - 1, 2);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method4587(local4, local13, 1);
				this.method4587(local4 - 1, local13 - -1, 16);
			}
			if (arg4 == 1) {
				this.method4587(local4, local13, 4);
				this.method4587(local4 + 1, local13 - -1, 64);
			}
			if (arg4 == 2) {
				this.method4587(local4, local13, 16);
				this.method4587(local4 + 1, local13 + -1, 1);
			}
			if (arg4 == 3) {
				this.method4587(local4, local13, 64);
				this.method4587(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg1 == 2) {
			if (arg4 == 0) {
				this.method4587(local4, local13, 130);
				this.method4587(local4 - 1, local13, 8);
				this.method4587(local4, local13 + 1, 32);
			}
			if (arg4 == 1) {
				this.method4587(local4, local13, 10);
				this.method4587(local4, local13 + 1, 32);
				this.method4587(local4 + 1, local13, 128);
			}
			if (arg4 == 2) {
				this.method4587(local4, local13, 40);
				this.method4587(local4 + 1, local13, 128);
				this.method4587(local4, local13 - 1, 2);
			}
			if (arg4 == 3) {
				this.method4587(local4, local13, 160);
				this.method4587(local4, local13 - 1, 2);
				this.method4587(local4 - 1, local13, 8);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					this.method4587(local4, local13, 65536);
					this.method4587(local4 - 1, local13, 4096);
				}
				if (arg4 == 1) {
					this.method4587(local4, local13, 1024);
					this.method4587(local4, local13 + 1, 16384);
				}
				if (arg4 == 2) {
					this.method4587(local4, local13, 4096);
					this.method4587(local4 + 1, local13, 65536);
				}
				if (arg4 == 3) {
					this.method4587(local4, local13, 16384);
					this.method4587(local4, local13 - 1, 1024);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					this.method4587(local4, local13, 512);
					this.method4587(local4 - 1, local13 - -1, 8192);
				}
				if (arg4 == 1) {
					this.method4587(local4, local13, 2048);
					this.method4587(local4 + 1, local13 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method4587(local4, local13, 8192);
					this.method4587(local4 + 1, local13 + -1, 512);
				}
				if (arg4 == 3) {
					this.method4587(local4, local13, 32768);
					this.method4587(local4 - 1, local13 - 1, 2048);
				}
			}
			if (arg1 == 2) {
				if (arg4 == 0) {
					this.method4587(local4, local13, 66560);
					this.method4587(local4 - 1, local13, 4096);
					this.method4587(local4, local13 + 1, 16384);
				}
				if (arg4 == 1) {
					this.method4587(local4, local13, 5120);
					this.method4587(local4, local13 + 1, 16384);
					this.method4587(local4 + 1, local13, 65536);
				}
				if (arg4 == 2) {
					this.method4587(local4, local13, 20480);
					this.method4587(local4 + 1, local13, 65536);
					this.method4587(local4, local13 - 1, 1024);
				}
				if (arg4 == 3) {
					this.method4587(local4, local13, 81920);
					this.method4587(local4, local13 - 1, 1024);
					this.method4587(local4 - 1, local13, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg4 == 0) {
				this.method4587(local4, local13, 536870912);
				this.method4587(local4 - 1, local13, 33554432);
			}
			if (arg4 == 1) {
				this.method4587(local4, local13, 8388608);
				this.method4587(local4, local13 + 1, 134217728);
			}
			if (arg4 == 2) {
				this.method4587(local4, local13, 33554432);
				this.method4587(local4 + 1, local13, 536870912);
			}
			if (arg4 == 3) {
				this.method4587(local4, local13, 134217728);
				this.method4587(local4, local13 - 1, 8388608);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				this.method4587(local4, local13, 4194304);
				this.method4587(local4 - 1, local13 + 1, 67108864);
			}
			if (arg4 == 1) {
				this.method4587(local4, local13, 16777216);
				this.method4587(local4 + 1, local13 - -1, 268435456);
			}
			if (arg4 == 2) {
				this.method4587(local4, local13, 67108864);
				this.method4587(local4 + 1, local13 + -1, 4194304);
			}
			if (arg4 == 3) {
				this.method4587(local4, local13, 268435456);
				this.method4587(local4 - 1, local13 + -1, 16777216);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4587(local4, local13, 545259520);
			this.method4587(local4 - 1, local13, 33554432);
			this.method4587(local4, local13 + 1, 134217728);
		}
		if (arg4 == 1) {
			this.method4587(local4, local13, 41943040);
			this.method4587(local4, local13 + 1, 134217728);
			this.method4587(local4 + 1, local13, 536870912);
		}
		if (arg4 == 2) {
			this.method4587(local4, local13, 167772160);
			this.method4587(local4 + 1, local13, 536870912);
			this.method4587(local4, local13 - 1, 8388608);
		}
		if (arg4 == 3) {
			this.method4587(local4, local13, 671088640);
			this.method4587(local4, local13 - 1, 8388608);
			this.method4587(local4 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method4600() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5292; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt5299; local11++) {
				if (local7 == 0 || local11 == 0 || this.anInt5292 - 5 <= local7 || local11 >= this.anInt5299 - 5) {
					this.anIntArrayArray43[local7][local11] = -1;
				} else {
					this.anIntArrayArray43[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V")
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 - this.anInt5301;
		@Pc(22) int local22 = arg0 - this.anInt5293;
		this.anIntArrayArray43[local17][local22] |= 0x200000;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIZIII)V")
	public void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt5293;
		@Pc(9) int local9 = arg0 - this.anInt5301;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method4589(128, local9, local4);
				this.method4589(8, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method4589(2, local9, local4);
				this.method4589(32, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4589(8, local9, local4);
				this.method4589(128, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method4589(32, local9, local4);
				this.method4589(2, local9, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method4589(1, local9, local4);
				this.method4589(16, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4589(4, local9, local4);
				this.method4589(64, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4589(16, local9, local4);
				this.method4589(1, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method4589(64, local9, local4);
				this.method4589(4, local9 - 1, local4 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method4589(130, local9, local4);
				this.method4589(8, local9 - 1, local4);
				this.method4589(32, local9, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4589(10, local9, local4);
				this.method4589(32, local9, local4 + 1);
				this.method4589(128, local9 + 1, local4);
			}
			if (arg4 == 2) {
				this.method4589(40, local9, local4);
				this.method4589(128, local9 + 1, local4);
				this.method4589(2, local9, local4 - 1);
			}
			if (arg4 == 3) {
				this.method4589(160, local9, local4);
				this.method4589(2, local9, local4 - 1);
				this.method4589(8, local9 - 1, local4);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method4589(65536, local9, local4);
					this.method4589(4096, local9 - 1, local4);
				}
				if (arg4 == 1) {
					this.method4589(1024, local9, local4);
					this.method4589(16384, local9, local4 + 1);
				}
				if (arg4 == 2) {
					this.method4589(4096, local9, local4);
					this.method4589(65536, local9 + 1, local4);
				}
				if (arg4 == 3) {
					this.method4589(16384, local9, local4);
					this.method4589(1024, local9, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method4589(512, local9, local4);
					this.method4589(8192, local9 - 1, local4 - -1);
				}
				if (arg4 == 1) {
					this.method4589(2048, local9, local4);
					this.method4589(32768, local9 + 1, local4 - -1);
				}
				if (arg4 == 2) {
					this.method4589(8192, local9, local4);
					this.method4589(512, local9 + 1, local4 + -1);
				}
				if (arg4 == 3) {
					this.method4589(32768, local9, local4);
					this.method4589(2048, local9 - 1, local4 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method4589(66560, local9, local4);
					this.method4589(4096, local9 - 1, local4);
					this.method4589(16384, local9, local4 + 1);
				}
				if (arg4 == 1) {
					this.method4589(5120, local9, local4);
					this.method4589(16384, local9, local4 + 1);
					this.method4589(65536, local9 + 1, local4);
				}
				if (arg4 == 2) {
					this.method4589(20480, local9, local4);
					this.method4589(65536, local9 + 1, local4);
					this.method4589(1024, local9, local4 - 1);
				}
				if (arg4 == 3) {
					this.method4589(81920, local9, local4);
					this.method4589(1024, local9, local4 - 1);
					this.method4589(4096, local9 - 1, local4);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method4589(536870912, local9, local4);
				this.method4589(33554432, local9 - 1, local4);
			}
			if (arg4 == 1) {
				this.method4589(8388608, local9, local4);
				this.method4589(134217728, local9, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4589(33554432, local9, local4);
				this.method4589(536870912, local9 + 1, local4);
			}
			if (arg4 == 3) {
				this.method4589(134217728, local9, local4);
				this.method4589(8388608, local9, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method4589(4194304, local9, local4);
				this.method4589(67108864, local9 - 1, local4 + 1);
			}
			if (arg4 == 1) {
				this.method4589(16777216, local9, local4);
				this.method4589(268435456, local9 + 1, local4 + 1);
			}
			if (arg4 == 2) {
				this.method4589(67108864, local9, local4);
				this.method4589(4194304, local9 + 1, local4 + -1);
			}
			if (arg4 == 3) {
				this.method4589(268435456, local9, local4);
				this.method4589(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4589(545259520, local9, local4);
			this.method4589(33554432, local9 - 1, local4);
			this.method4589(134217728, local9, local4 + 1);
		}
		if (arg4 == 1) {
			this.method4589(41943040, local9, local4);
			this.method4589(134217728, local9, local4 + 1);
			this.method4589(536870912, local9 + 1, local4);
		}
		if (arg4 == 2) {
			this.method4589(167772160, local9, local4);
			this.method4589(536870912, local9 + 1, local4);
			this.method4589(8388608, local9, local4 - 1);
		}
		if (arg4 == 3) {
			this.method4589(671088640, local9, local4);
			this.method4589(8388608, local9, local4 - 1);
			this.method4589(33554432, local9 - 1, local4);
			return;
		}
	}
}
