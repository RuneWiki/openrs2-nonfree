import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class268 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public int anInt7518;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
	public int anInt7529;

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
	public int anInt7539;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V")
	public void method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt7518;
		@Pc(15) int local15 = arg1 - this.anInt7539;
		this.anIntArrayArray66[local15][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIZZI)V")
	public void method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = 256;
		if (arg4) {
			local15 = 131328;
		}
		@Pc(33) int local33;
		if (arg2 == 1 || arg2 == 3) {
			local33 = arg6;
			arg6 = arg3;
			arg3 = local33;
		}
		@Pc(42) int local42 = arg1 - this.anInt7539;
		@Pc(47) int local47 = arg0 - this.anInt7518;
		if (arg5) {
			local15 |= 0x40000000;
		}
		for (local33 = local42; local33 < arg6 + local42; local33++) {
			if (local33 >= 0 && local33 < this.anInt7529) {
				for (@Pc(68) int local68 = local47; local68 < local47 + arg3; local68++) {
					if (local68 >= 0 && local68 < this.anInt7533) {
						this.method5802(local68, local15, local33);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg2 == arg0 && arg4 == arg6) {
				return true;
			}
		} else if (arg2 <= arg0 && arg3 + arg2 - 1 >= arg0 && arg6 <= arg6 && arg6 + arg3 - 1 >= arg6) {
			return true;
		}
		@Pc(59) int local59 = arg2 - this.anInt7539;
		@Pc(69) int local69 = arg4 - this.anInt7518;
		@Pc(74) int local74 = arg6 - this.anInt7518;
		@Pc(79) int local79 = arg0 - this.anInt7539;
		if (arg3 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local59 == local79 + 1 && local74 == local69 && (this.anIntArrayArray66[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local59 == local79 && local74 - 1 == local69 && (this.anIntArrayArray66[local59][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local79 - 1 == local59 && local69 == local74 && (this.anIntArrayArray66[local59][local69] & 0x8) == 0) {
						return true;
					}
					if (local79 == local59 && local69 == local74 - 1 && (this.anIntArrayArray66[local59][local69] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local59 == local79 - 1 && local74 == local69 && (this.anIntArrayArray66[local59][local69] & 0x8) == 0) {
						return true;
					}
					if (local79 == local59 && local69 == local74 + 1 && (this.anIntArrayArray66[local59][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 == local79 + 1 && local69 == local74 && (this.anIntArrayArray66[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local59 == local79 && local74 + 1 == local69 && (this.anIntArrayArray66[local59][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local59 == local79 && local69 == local74 + 1 && (this.anIntArrayArray66[local59][local69] & 0x20) == 0) {
					return true;
				}
				if (local79 == local59 && local69 == local74 - 1 && (this.anIntArrayArray66[local59][local69] & 0x2) == 0) {
					return true;
				}
				if (local79 - 1 == local59 && local74 == local69 && (this.anIntArrayArray66[local59][local69] & 0x8) == 0) {
					return true;
				}
				if (local59 == local79 + 1 && local69 == local74 && (this.anIntArrayArray66[local59][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = arg3 + local59 - 1;
			@Pc(97) int local97 = local69 + arg3 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local79 + 1 == local59 && local74 >= local69 && local97 >= local74 && (this.anIntArrayArray66[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local79 >= local59 && local90 >= local79 && local69 == local74 - arg3 && (this.anIntArrayArray66[local79][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local79 - arg3 == local59 && local69 <= local74 && local74 <= local97 && (this.anIntArrayArray66[local90][local74] & 0x8) == 0) {
						return true;
					}
					if (local79 >= local59 && local90 >= local79 && local69 == local74 - arg3 && (this.anIntArrayArray66[local79][local97] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local79 - arg3 == local59 && local74 >= local69 && local74 <= local97 && (this.anIntArrayArray66[local90][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local79 && local79 <= local90 && local69 == local74 + 1 && (this.anIntArrayArray66[local79][local69] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local79 + 1 == local59 && local74 >= local69 && local97 >= local74 && (this.anIntArrayArray66[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local79 && local79 <= local90 && local74 + 1 == local69 && (this.anIntArrayArray66[local79][local69] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local59 <= local79 && local79 <= local90 && local74 + 1 == local69 && (this.anIntArrayArray66[local79][local69] & 0x20) == 0) {
					return true;
				}
				if (local59 <= local79 && local79 <= local90 && local69 == local74 - arg3 && (this.anIntArrayArray66[local79][local97] & 0x2) == 0) {
					return true;
				}
				if (local79 - arg3 == local59 && local74 >= local69 && local74 <= local97 && (this.anIntArrayArray66[local90][local74] & 0x8) == 0) {
					return true;
				}
				if (local79 + 1 == local59 && local74 >= local69 && local74 <= local97 && (this.anIntArrayArray66[local59][local74] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg6 && arg4 == arg1) {
				return true;
			}
		} else if (arg2 <= arg6 && arg5 + arg2 - 1 >= arg6 && arg1 >= arg1 && arg1 <= arg5 + arg1 - 1) {
			return true;
		}
		@Pc(64) int local64 = arg4 - this.anInt7518;
		@Pc(69) int local69 = arg1 - this.anInt7518;
		@Pc(74) int local74 = arg6 - this.anInt7539;
		@Pc(79) int local79 = arg2 - this.anInt7539;
		if (arg5 == 1) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					if (local79 == local74 - 1 && local69 == local64) {
						return true;
					}
					if (local79 == local74 && local64 == local69 + 1 && (this.anIntArrayArray66[local79][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local74 && local64 == local69 - 1 && (this.anIntArrayArray66[local79][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local79 == local74 && local69 + 1 == local64) {
						return true;
					}
					if (local79 == local74 - 1 && local69 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local79 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local74 + 1 == local79 && local69 == local64) {
						return true;
					}
					if (local74 == local79 && local69 + 1 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 == local79 && local69 - 1 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local79 == local74 && local64 == local69 - 1) {
						return true;
					}
					if (local74 - 1 == local79 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local79 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					if (local74 - 1 == local79 && local64 == local69) {
						return true;
					}
					if (local74 == local79 && local64 == local69 + 1) {
						return true;
					}
					if (local74 + 1 == local79 && local69 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local79 && local64 == local69 - 1 && (this.anIntArrayArray66[local79][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local79 == local74 - 1 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local79 && local64 == local69 + 1) {
						return true;
					}
					if (local74 + 1 == local79 && local64 == local69) {
						return true;
					}
					if (local74 == local79 && local69 - 1 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local74 - 1 == local79 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 == local79 && local64 == local69 + 1 && (this.anIntArrayArray66[local79][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local74 + 1 && local64 == local69) {
						return true;
					}
					if (local79 == local74 && local69 - 1 == local64) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local79 == local74 - 1 && local69 == local64) {
						return true;
					}
					if (local74 == local79 && local69 + 1 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 + 1 == local79 && local69 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2C0180) == 0) {
						return true;
					}
					if (local74 == local79 && local69 - 1 == local64) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local74 == local79 && local64 == local69 + 1 && (this.anIntArrayArray66[local79][local64] & 0x20) == 0) {
					return true;
				}
				if (local79 == local74 && local69 - 1 == local64 && (this.anIntArrayArray66[local79][local64] & 0x2) == 0) {
					return true;
				}
				if (local79 == local74 - 1 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x8) == 0) {
					return true;
				}
				if (local79 == local74 + 1 && local64 == local69 && (this.anIntArrayArray66[local79][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = local79 + arg5 - 1;
			@Pc(96) int local96 = local64 + arg5 - 1;
			if (arg0 == 0) {
				if (arg3 == 0) {
					if (local79 == local74 - arg5 && local69 >= local64 && local96 >= local69) {
						return true;
					}
					if (local74 >= local79 && local90 >= local74 && local69 + 1 == local64 && (this.anIntArrayArray66[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local74 >= local79 && local74 <= local90 && local64 == local69 - arg5 && (this.anIntArrayArray66[local74][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local79 <= local74 && local74 <= local90 && local69 + 1 == local64) {
						return true;
					}
					if (local74 - arg5 == local79 && local64 <= local69 && local96 >= local69 && (this.anIntArrayArray66[local90][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local79 && local69 >= local64 && local69 <= local96 && (this.anIntArrayArray66[local79][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local79 == local74 + 1 && local69 >= local64 && local69 <= local96) {
						return true;
					}
					if (local74 >= local79 && local74 <= local90 && local64 == local69 + 1 && (this.anIntArrayArray66[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 <= local74 && local74 <= local90 && local64 == local69 - arg5 && (this.anIntArrayArray66[local74][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local79 <= local74 && local90 >= local74 && local64 == local69 - arg5) {
						return true;
					}
					if (local74 - arg5 == local79 && local69 >= local64 && local96 >= local69 && (this.anIntArrayArray66[local90][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 + 1 == local79 && local69 >= local64 && local96 >= local69 && (this.anIntArrayArray66[local79][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					if (local79 == local74 - arg5 && local64 <= local69 && local69 <= local96) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local69 + 1 == local64) {
						return true;
					}
					if (local79 == local74 + 1 && local64 <= local69 && local69 <= local96 && (this.anIntArrayArray66[local79][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local64 == local69 - arg5 && (this.anIntArrayArray66[local74][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local74 - arg5 == local79 && local64 <= local69 && local69 <= local96 && (this.anIntArrayArray66[local90][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local69 + 1 == local64) {
						return true;
					}
					if (local79 == local74 + 1 && local69 >= local64 && local69 <= local96) {
						return true;
					}
					if (local74 >= local79 && local90 >= local74 && local69 - arg5 == local64 && (this.anIntArrayArray66[local74][local96] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local74 - arg5 == local79 && local69 >= local64 && local96 >= local69 && (this.anIntArrayArray66[local90][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local74 >= local79 && local74 <= local90 && local64 == local69 + 1 && (this.anIntArrayArray66[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local74 + 1 && local64 <= local69 && local96 >= local69) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local69 - arg5 == local64) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local74 - arg5 == local79 && local64 <= local69 && local96 >= local69) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local64 == local69 + 1 && (this.anIntArrayArray66[local74][local64] & 0x2C0120) == 0) {
						return true;
					}
					if (local79 == local74 + 1 && local64 <= local69 && local69 <= local96 && (this.anIntArrayArray66[local79][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local79 <= local74 && local90 >= local74 && local69 - arg5 == local64) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local74 >= local79 && local90 >= local74 && local64 == local69 + 1 && (this.anIntArrayArray66[local74][local64] & 0x2C0120) == 0) {
					return true;
				}
				if (local74 >= local79 && local74 <= local90 && local64 == local69 - arg5 && (this.anIntArrayArray66[local74][local96] & 0x2C0102) == 0) {
					return true;
				}
				if (local74 - arg5 == local79 && local64 <= local69 && local96 >= local69 && (this.anIntArrayArray66[local90][local69] & 0x2C0108) == 0) {
					return true;
				}
				if (local79 == local74 + 1 && local69 >= local64 && local69 <= local96 && (this.anIntArrayArray66[local79][local69] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII)V")
	private void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray66[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	public void method5803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg0 - this.anInt7518;
		@Pc(27) int local27 = arg1 - this.anInt7539;
		this.anIntArrayArray66[local27][local22] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZZIIIZ)V")
	public void method5805(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg3 - this.anInt7539;
		@Pc(9) int local9 = arg0 - this.anInt7518;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5802(local9, 128, local4);
				this.method5802(local9, 8, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5802(local9, 2, local4);
				this.method5802(local9 + 1, 32, local4);
			}
			if (arg4 == 2) {
				this.method5802(local9, 8, local4);
				this.method5802(local9, 128, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5802(local9, 32, local4);
				this.method5802(local9 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5802(local9, 1, local4);
				this.method5802(local9 + 1, 16, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5802(local9, 4, local4);
				this.method5802(local9 + 1, 64, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5802(local9, 16, local4);
				this.method5802(local9 - 1, 1, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5802(local9, 64, local4);
				this.method5802(local9 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method5802(local9, 130, local4);
				this.method5802(local9, 8, local4 - 1);
				this.method5802(local9 + 1, 32, local4);
			}
			if (arg4 == 1) {
				this.method5802(local9, 10, local4);
				this.method5802(local9 + 1, 32, local4);
				this.method5802(local9, 128, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5802(local9, 40, local4);
				this.method5802(local9, 128, local4 + 1);
				this.method5802(local9 - 1, 2, local4);
			}
			if (arg4 == 3) {
				this.method5802(local9, 160, local4);
				this.method5802(local9 - 1, 2, local4);
				this.method5802(local9, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method5802(local9, 65536, local4);
					this.method5802(local9, 4096, local4 - 1);
				}
				if (arg4 == 1) {
					this.method5802(local9, 1024, local4);
					this.method5802(local9 + 1, 16384, local4);
				}
				if (arg4 == 2) {
					this.method5802(local9, 4096, local4);
					this.method5802(local9, 65536, local4 + 1);
				}
				if (arg4 == 3) {
					this.method5802(local9, 16384, local4);
					this.method5802(local9 - 1, 1024, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method5802(local9, 512, local4);
					this.method5802(local9 + 1, 8192, local4 - 1);
				}
				if (arg4 == 1) {
					this.method5802(local9, 2048, local4);
					this.method5802(local9 + 1, 32768, local4 + 1);
				}
				if (arg4 == 2) {
					this.method5802(local9, 8192, local4);
					this.method5802(local9 - 1, 512, local4 + 1);
				}
				if (arg4 == 3) {
					this.method5802(local9, 32768, local4);
					this.method5802(local9 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method5802(local9, 66560, local4);
					this.method5802(local9, 4096, local4 - 1);
					this.method5802(local9 + 1, 16384, local4);
				}
				if (arg4 == 1) {
					this.method5802(local9, 5120, local4);
					this.method5802(local9 + 1, 16384, local4);
					this.method5802(local9, 65536, local4 + 1);
				}
				if (arg4 == 2) {
					this.method5802(local9, 20480, local4);
					this.method5802(local9, 65536, local4 + 1);
					this.method5802(local9 - 1, 1024, local4);
				}
				if (arg4 == 3) {
					this.method5802(local9, 81920, local4);
					this.method5802(local9 - 1, 1024, local4);
					this.method5802(local9, 4096, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5802(local9, 536870912, local4);
				this.method5802(local9, 33554432, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5802(local9, 8388608, local4);
				this.method5802(local9 + 1, 134217728, local4);
			}
			if (arg4 == 2) {
				this.method5802(local9, 33554432, local4);
				this.method5802(local9, 536870912, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5802(local9, 134217728, local4);
				this.method5802(local9 - 1, 8388608, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5802(local9, 4194304, local4);
				this.method5802(local9 + 1, 67108864, local4 - 1);
			}
			if (arg4 == 1) {
				this.method5802(local9, 16777216, local4);
				this.method5802(local9 + 1, 268435456, local4 + 1);
			}
			if (arg4 == 2) {
				this.method5802(local9, 67108864, local4);
				this.method5802(local9 - 1, 4194304, local4 + 1);
			}
			if (arg4 == 3) {
				this.method5802(local9, 268435456, local4);
				this.method5802(local9 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5802(local9, 545259520, local4);
			this.method5802(local9, 33554432, local4 - 1);
			this.method5802(local9 + 1, 134217728, local4);
		}
		if (arg4 == 1) {
			this.method5802(local9, 41943040, local4);
			this.method5802(local9 + 1, 134217728, local4);
			this.method5802(local9, 536870912, local4 + 1);
		}
		if (arg4 == 2) {
			this.method5802(local9, 167772160, local4);
			this.method5802(local9, 536870912, local4 + 1);
			this.method5802(local9 - 1, 8388608, local4);
		}
		if (arg4 == 3) {
			this.method5802(local9, 671088640, local4);
			this.method5802(local9 - 1, 8388608, local4);
			this.method5802(local9, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIZIIIIII)Z")
	public boolean method5806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg0 + arg1;
		@Pc(20) int local20 = arg5 + arg4;
		@Pc(24) int local24 = arg8 + arg2;
		@Pc(28) int local28 = arg6 + arg7;
		@Pc(57) int local57;
		@Pc(68) int local68;
		if (local24 == arg0 && (arg3 & 0x2) == 0) {
			local57 = arg6 >= arg4 ? arg6 : arg4;
			local68 = local28 > local20 ? local20 : local28;
			while (local57 < local68) {
				if ((this.anIntArrayArray66[local24 - this.anInt7539 - 1][local57 - this.anInt7518] & 0x8) == 0) {
					return true;
				}
				local57++;
			}
		} else if (arg8 == local10 && (arg3 & 0x8) == 0) {
			local57 = arg6 >= arg4 ? arg6 : arg4;
			local68 = local28 <= local20 ? local28 : local20;
			while (local68 > local57) {
				if ((this.anIntArrayArray66[arg8 - this.anInt7539][local57 - this.anInt7518] & 0x80) == 0) {
					return true;
				}
				local57++;
			}
		} else if (local28 == arg4 && (arg3 & 0x1) == 0) {
			local57 = arg8 < arg0 ? arg0 : arg8;
			local68 = local24 > local10 ? local10 : local24;
			while (local57 < local68) {
				if ((this.anIntArrayArray66[local57 - this.anInt7539][local28 - this.anInt7518 - 1] & 0x2) == 0) {
					return true;
				}
				local57++;
			}
		} else if (local20 == arg6 && (arg3 & 0x4) == 0) {
			local57 = arg0 > arg8 ? arg0 : arg8;
			local68 = local10 < local24 ? local10 : local24;
			while (local57 < local68) {
				if ((this.anIntArrayArray66[local57 - this.anInt7539][arg6 - this.anInt7518] & 0x20) == 0) {
					return true;
				}
				local57++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZZIII)V")
	public void method5808(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg4 - this.anInt7539;
		@Pc(29) int local29 = arg0 - this.anInt7518;
		for (@Pc(31) int local31 = local24; local31 < local24 + arg3; local31++) {
			if (local31 >= 0 && this.anInt7529 > local31) {
				for (@Pc(44) int local44 = local29; local44 < local29 + arg5; local44++) {
					if (local44 >= 0 && this.anInt7533 > local44) {
						this.method5811(local44, local7, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZIIZI)V")
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg1 - this.anInt7539;
		@Pc(17) int local17 = arg5 - this.anInt7518;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5811(local17, 128, local4);
				this.method5811(local17, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5811(local17, 2, local4);
				this.method5811(local17 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method5811(local17, 8, local4);
				this.method5811(local17, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5811(local17, 32, local4);
				this.method5811(local17 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5811(local17, 1, local4);
				this.method5811(local17 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5811(local17, 4, local4);
				this.method5811(local17 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5811(local17, 16, local4);
				this.method5811(local17 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5811(local17, 64, local4);
				this.method5811(local17 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method5811(local17, 130, local4);
				this.method5811(local17, 8, local4 - 1);
				this.method5811(local17 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method5811(local17, 10, local4);
				this.method5811(local17 + 1, 32, local4);
				this.method5811(local17, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5811(local17, 40, local4);
				this.method5811(local17, 128, local4 + 1);
				this.method5811(local17 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method5811(local17, 160, local4);
				this.method5811(local17 - 1, 2, local4);
				this.method5811(local17, 8, local4 - 1);
			}
		}
		if (arg2) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method5811(local17, 65536, local4);
					this.method5811(local17, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5811(local17, 1024, local4);
					this.method5811(local17 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method5811(local17, 4096, local4);
					this.method5811(local17, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5811(local17, 16384, local4);
					this.method5811(local17 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method5811(local17, 512, local4);
					this.method5811(local17 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5811(local17, 2048, local4);
					this.method5811(local17 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5811(local17, 8192, local4);
					this.method5811(local17 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5811(local17, 32768, local4);
					this.method5811(local17 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method5811(local17, 66560, local4);
					this.method5811(local17, 4096, local4 - 1);
					this.method5811(local17 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method5811(local17, 5120, local4);
					this.method5811(local17 + 1, 16384, local4);
					this.method5811(local17, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5811(local17, 20480, local4);
					this.method5811(local17, 65536, local4 + 1);
					this.method5811(local17 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method5811(local17, 81920, local4);
					this.method5811(local17 - 1, 1024, local4);
					this.method5811(local17, 4096, local4 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5811(local17, 536870912, local4);
				this.method5811(local17, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5811(local17, 8388608, local4);
				this.method5811(local17 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method5811(local17, 33554432, local4);
				this.method5811(local17, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5811(local17, 134217728, local4);
				this.method5811(local17 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5811(local17, 4194304, local4);
				this.method5811(local17 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5811(local17, 16777216, local4);
				this.method5811(local17 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5811(local17, 67108864, local4);
				this.method5811(local17 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5811(local17, 268435456, local4);
				this.method5811(local17 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5811(local17, 545259520, local4);
			this.method5811(local17, 33554432, local4 - 1);
			this.method5811(local17 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method5811(local17, 41943040, local4);
			this.method5811(local17 + 1, 134217728, local4);
			this.method5811(local17, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method5811(local17, 167772160, local4);
			this.method5811(local17, 536870912, local4 + 1);
			this.method5811(local17 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method5811(local17, 671088640, local4);
			this.method5811(local17 - 1, 8388608, local4);
			this.method5811(local17, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static303.method4186(arg6, arg5, arg1, arg0, arg4, arg2, arg1, arg3) ? true : this.method5806(arg3, arg1, arg0, arg7, arg6, arg1, arg4, arg5, arg2);
		}
		@Pc(41) int local41 = arg2 + arg0 - 1;
		@Pc(55) int local55 = arg4 + arg5 - 1;
		if (arg2 <= arg3 && arg3 <= local41 && arg4 <= arg6 && local55 >= arg6) {
			return true;
		} else if (arg3 == arg2 - 1 && arg4 <= arg6 && local55 >= arg6 && (this.anIntArrayArray66[arg3 - this.anInt7539][arg6 - this.anInt7518] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg3 == local41 + 1 && arg6 >= arg4 && local55 >= arg6 && (this.anIntArrayArray66[arg3 - this.anInt7539][arg6 - this.anInt7518] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg4 - 1 && arg3 >= arg2 && arg3 <= local41 && (this.anIntArrayArray66[arg3 - this.anInt7539][arg6 - this.anInt7518] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local55 + 1 && arg3 >= arg2 && arg3 <= local41 && (this.anIntArrayArray66[arg3 - this.anInt7539][arg6 - this.anInt7518] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZII)V")
	private void method5811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray66[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
	public void method5813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt7539;
		@Pc(13) int local13 = arg1 - this.anInt7518;
		this.anIntArrayArray66[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)V")
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 - this.anInt7518;
		@Pc(19) int local19 = arg0 - this.anInt7539;
		this.anIntArrayArray66[local19][local14] |= 0x40000;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method5815() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7529; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt7533; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt7529 - 5 || local11 >= this.anInt7533 - 5) {
					this.anIntArrayArray66[local7][local11] = -1;
				} else {
					this.anIntArrayArray66[local7][local11] = 2097152;
				}
			}
		}
	}
}
