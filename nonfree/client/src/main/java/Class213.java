import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class213 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public int anInt6235;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public void method4835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6230;
		@Pc(13) int local13 = arg0 - this.anInt6235;
		this.anIntArrayArray48[local4][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	public void method4836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt6235;
		@Pc(21) int local21 = arg0 - this.anInt6230;
		this.anIntArrayArray48[local21][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIIIZI)V")
	public void method4837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(21) int local21 = 256;
		if (arg2) {
			local21 = 131328;
		}
		@Pc(37) int local37;
		if (arg1 == 1 || arg1 == 3) {
			local37 = arg3;
			arg3 = arg6;
			arg6 = local37;
		}
		if (arg5) {
			local21 |= 0x40000000;
		}
		@Pc(52) int local52 = arg4 - this.anInt6230;
		@Pc(57) int local57 = arg0 - this.anInt6235;
		for (local37 = local52; local37 < arg3 + local52; local37++) {
			if (local37 >= 0 && local37 < this.anInt6231) {
				for (@Pc(76) int local76 = local57; local76 < local57 + arg6; local76++) {
					if (local76 >= 0 && this.anInt6225 > local76) {
						this.method4839(local21, local37, local76);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZ)V")
	private void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray48[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	private void method4839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray48[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static455.method4305(arg1, arg5, arg1, arg4, arg0, arg7, arg6, arg2) ? true : this.method4844(arg2, arg1, arg4, arg6, arg3, arg5, arg7, arg0, arg1);
		}
		@Pc(50) int local50 = arg0 + arg2 - 1;
		@Pc(57) int local57 = arg5 + arg4 - 1;
		if (arg2 <= arg6 && local50 >= arg6 && arg5 <= arg7 && arg7 <= local57) {
			return true;
		} else if (arg6 == arg2 - 1 && arg5 <= arg7 && arg7 <= local57 && (this.anIntArrayArray48[arg6 - this.anInt6230][arg7 - this.anInt6235] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (arg6 == local50 + 1 && arg5 <= arg7 && arg7 <= local57 && (this.anIntArrayArray48[arg6 - this.anInt6230][arg7 - this.anInt6235] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg7 && arg2 <= arg6 && arg6 <= local50 && (this.anIntArrayArray48[arg6 - this.anInt6230][arg7 - this.anInt6235] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local57 + 1 && arg6 >= arg2 && local50 >= arg6 && (this.anIntArrayArray48[arg6 - this.anInt6230][arg7 - this.anInt6235] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIZII)V")
	public void method4841(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg5 - this.anInt6235;
		@Pc(29) int local29 = arg4 - this.anInt6230;
		for (@Pc(31) int local31 = local29; local31 < local29 + arg0; local31++) {
			if (local31 >= 0 && this.anInt6231 > local31) {
				for (@Pc(50) int local50 = local24; local50 < local24 + arg2; local50++) {
					if (local50 >= 0 && this.anInt6225 > local50) {
						this.method4838(local7, local50, local31);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZII)Z")
	public boolean method4842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg4 == arg5 && arg0 == arg2) {
				return true;
			}
		} else if (arg4 <= arg5 && arg4 + arg3 - 1 >= arg5 && arg2 <= arg2 && arg3 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(63) int local63 = arg4 - this.anInt6230;
		@Pc(68) int local68 = arg0 - this.anInt6235;
		@Pc(73) int local73 = arg2 - this.anInt6235;
		@Pc(78) int local78 = arg5 - this.anInt6230;
		if (arg3 == 1) {
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local63 == local78 - 1 && local73 == local68) {
						return true;
					}
					if (local63 == local78 && local68 == local73 + 1 && (this.anIntArrayArray48[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local63 && local73 - 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local78 == local63 && local68 == local73 + 1) {
						return true;
					}
					if (local78 - 1 == local63 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local68 == local73 && (this.anIntArrayArray48[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local78 + 1 == local63 && local68 == local73) {
						return true;
					}
					if (local63 == local78 && local73 + 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local78 && local68 == local73 - 1 && (this.anIntArrayArray48[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local78 == local63 && local73 - 1 == local68) {
						return true;
					}
					if (local63 == local78 - 1 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local68 == local73 && (this.anIntArrayArray48[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local63 == local78 - 1 && local73 == local68) {
						return true;
					}
					if (local78 == local63 && local73 + 1 == local68) {
						return true;
					}
					if (local78 + 1 == local63 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local63 && local73 - 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local63 == local78 - 1 && local68 == local73 && (this.anIntArrayArray48[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 && local68 == local73 + 1) {
						return true;
					}
					if (local78 + 1 == local63 && local68 == local73) {
						return true;
					}
					if (local78 == local63 && local68 == local73 - 1 && (this.anIntArrayArray48[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local63 == local78 - 1 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local63 && local73 + 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local73 == local68) {
						return true;
					}
					if (local78 == local63 && local73 - 1 == local68) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local78 - 1 == local63 && local68 == local73) {
						return true;
					}
					if (local78 == local63 && local73 + 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local63 && local68 == local73 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local78 == local63 && local73 + 1 == local68 && (this.anIntArrayArray48[local63][local68] & 0x20) == 0) {
					return true;
				}
				if (local78 == local63 && local68 == local73 - 1 && (this.anIntArrayArray48[local63][local68] & 0x2) == 0) {
					return true;
				}
				if (local78 - 1 == local63 && local68 == local73 && (this.anIntArrayArray48[local63][local68] & 0x8) == 0) {
					return true;
				}
				if (local78 + 1 == local63 && local73 == local68 && (this.anIntArrayArray48[local63][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(799) int local799 = local63 + arg3 - 1;
			@Pc(805) int local805 = arg3 + local68 - 1;
			if (arg6 == 0) {
				if (arg1 == 0) {
					if (local78 - arg3 == local63 && local73 >= local68 && local805 >= local73) {
						return true;
					}
					if (local78 >= local63 && local78 <= local799 && local73 + 1 == local68 && (this.anIntArrayArray48[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 <= local78 && local799 >= local78 && local68 == local73 - arg3 && (this.anIntArrayArray48[local78][local805] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local63 <= local78 && local799 >= local78 && local68 == local73 + 1) {
						return true;
					}
					if (local63 == local78 - arg3 && local73 >= local68 && local805 >= local73 && (this.anIntArrayArray48[local799][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local68 <= local73 && local73 <= local805 && (this.anIntArrayArray48[local63][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local63 == local78 + 1 && local73 >= local68 && local73 <= local805) {
						return true;
					}
					if (local63 <= local78 && local78 <= local799 && local73 + 1 == local68 && (this.anIntArrayArray48[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local799 && local73 - arg3 == local68 && (this.anIntArrayArray48[local78][local805] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local63 <= local78 && local78 <= local799 && local68 == local73 - arg3) {
						return true;
					}
					if (local78 - arg3 == local63 && local68 <= local73 && local805 >= local73 && (this.anIntArrayArray48[local799][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local73 >= local68 && local73 <= local805 && (this.anIntArrayArray48[local63][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg1 == 0) {
					if (local78 - arg3 == local63 && local68 <= local73 && local73 <= local805) {
						return true;
					}
					if (local78 >= local63 && local799 >= local78 && local68 == local73 + 1) {
						return true;
					}
					if (local78 + 1 == local63 && local73 >= local68 && local73 <= local805 && (this.anIntArrayArray48[local63][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 <= local78 && local799 >= local78 && local68 == local73 - arg3 && (this.anIntArrayArray48[local78][local805] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local78 - arg3 == local63 && local68 <= local73 && local73 <= local805 && (this.anIntArrayArray48[local799][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 <= local78 && local799 >= local78 && local68 == local73 + 1) {
						return true;
					}
					if (local63 == local78 + 1 && local68 <= local73 && local805 >= local73) {
						return true;
					}
					if (local63 <= local78 && local78 <= local799 && local68 == local73 - arg3 && (this.anIntArrayArray48[local78][local805] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local78 - arg3 == local63 && local68 <= local73 && local805 >= local73 && (this.anIntArrayArray48[local799][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local799 && local68 == local73 + 1 && (this.anIntArrayArray48[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local73 >= local68 && local805 >= local73) {
						return true;
					}
					if (local63 <= local78 && local799 >= local78 && local68 == local73 - arg3) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local78 - arg3 == local63 && local68 <= local73 && local805 >= local73) {
						return true;
					}
					if (local63 <= local78 && local78 <= local799 && local68 == local73 + 1 && (this.anIntArrayArray48[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local73 >= local68 && local73 <= local805 && (this.anIntArrayArray48[local63][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 <= local78 && local799 >= local78 && local73 - arg3 == local68) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local78 >= local63 && local78 <= local799 && local68 == local73 + 1 && (this.anIntArrayArray48[local78][local68] & 0x2C0120) == 0) {
					return true;
				}
				if (local63 <= local78 && local78 <= local799 && local68 == local73 - arg3 && (this.anIntArrayArray48[local78][local805] & 0x2C0102) == 0) {
					return true;
				}
				if (local78 - arg3 == local63 && local73 >= local68 && local805 >= local73 && (this.anIntArrayArray48[local799][local73] & 0x2C0108) == 0) {
					return true;
				}
				if (local78 + 1 == local63 && local73 >= local68 && local73 <= local805 && (this.anIntArrayArray48[local63][local73] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg3;
		@Pc(14) int local14 = arg6 + arg8;
		@Pc(22) int local22 = arg0 + arg7;
		@Pc(26) int local26 = arg2 + arg5;
		@Pc(47) int local47;
		@Pc(54) int local54;
		if (arg3 == local22 && (arg4 & 0x2) == 0) {
			local47 = arg5 < arg6 ? arg6 : arg5;
			local54 = local26 > local14 ? local14 : local26;
			while (local47 < local54) {
				if ((this.anIntArrayArray48[local22 - this.anInt6230 - 1][local47 - this.anInt6235] & 0x8) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local9 == arg0 && (arg4 & 0x8) == 0) {
			local47 = arg5 >= arg6 ? arg5 : arg6;
			local54 = local14 < local26 ? local14 : local26;
			while (local47 < local54) {
				if ((this.anIntArrayArray48[arg0 - this.anInt6230][local47 - this.anInt6235] & 0x80) == 0) {
					return true;
				}
				local47++;
			}
		} else if (arg6 == local26 && (arg4 & 0x1) == 0) {
			local47 = arg3 <= arg0 ? arg0 : arg3;
			local54 = local22 <= local9 ? local22 : local9;
			while (local47 < local54) {
				if ((this.anIntArrayArray48[local47 - this.anInt6230][local26 - this.anInt6235 - 1] & 0x2) == 0) {
					return true;
				}
				local47++;
			}
		} else if (local14 == arg5 && (arg4 & 0x4) == 0) {
			local47 = arg0 < arg3 ? arg3 : arg0;
			local54 = local22 > local9 ? local9 : local22;
			while (local47 < local54) {
				if ((this.anIntArrayArray48[local47 - this.anInt6230][arg5 - this.anInt6235] & 0x20) == 0) {
					return true;
				}
				local47++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZIIIZI)V")
	public void method4845(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt6230;
		@Pc(9) int local9 = arg0 - this.anInt6235;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method4838(128, local9, local4);
				this.method4838(8, local9, local4 - 1);
			}
			if (arg3 == 1) {
				this.method4838(2, local9, local4);
				this.method4838(32, local9 + 1, local4);
			}
			if (arg3 == 2) {
				this.method4838(8, local9, local4);
				this.method4838(128, local9, local4 + 1);
			}
			if (arg3 == 3) {
				this.method4838(32, local9, local4);
				this.method4838(2, local9 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method4838(1, local9, local4);
				this.method4838(16, local9 + 1, local4 - 1);
			}
			if (arg3 == 1) {
				this.method4838(4, local9, local4);
				this.method4838(64, local9 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method4838(16, local9, local4);
				this.method4838(1, local9 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method4838(64, local9, local4);
				this.method4838(4, local9 - 1, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method4838(130, local9, local4);
				this.method4838(8, local9, local4 - 1);
				this.method4838(32, local9 + 1, local4);
			}
			if (arg3 == 1) {
				this.method4838(10, local9, local4);
				this.method4838(32, local9 + 1, local4);
				this.method4838(128, local9, local4 + 1);
			}
			if (arg3 == 2) {
				this.method4838(40, local9, local4);
				this.method4838(128, local9, local4 + 1);
				this.method4838(2, local9 - 1, local4);
			}
			if (arg3 == 3) {
				this.method4838(160, local9, local4);
				this.method4838(2, local9 - 1, local4);
				this.method4838(8, local9, local4 - 1);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					this.method4838(65536, local9, local4);
					this.method4838(4096, local9, local4 - 1);
				}
				if (arg3 == 1) {
					this.method4838(1024, local9, local4);
					this.method4838(16384, local9 + 1, local4);
				}
				if (arg3 == 2) {
					this.method4838(4096, local9, local4);
					this.method4838(65536, local9, local4 + 1);
				}
				if (arg3 == 3) {
					this.method4838(16384, local9, local4);
					this.method4838(1024, local9 - 1, local4);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg3 == 0) {
					this.method4838(512, local9, local4);
					this.method4838(8192, local9 + 1, local4 + -1);
				}
				if (arg3 == 1) {
					this.method4838(2048, local9, local4);
					this.method4838(32768, local9 + 1, local4 + 1);
				}
				if (arg3 == 2) {
					this.method4838(8192, local9, local4);
					this.method4838(512, local9 - 1, local4 + 1);
				}
				if (arg3 == 3) {
					this.method4838(32768, local9, local4);
					this.method4838(2048, local9 - 1, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					this.method4838(66560, local9, local4);
					this.method4838(4096, local9, local4 - 1);
					this.method4838(16384, local9 + 1, local4);
				}
				if (arg3 == 1) {
					this.method4838(5120, local9, local4);
					this.method4838(16384, local9 + 1, local4);
					this.method4838(65536, local9, local4 + 1);
				}
				if (arg3 == 2) {
					this.method4838(20480, local9, local4);
					this.method4838(65536, local9, local4 + 1);
					this.method4838(1024, local9 - 1, local4);
				}
				if (arg3 == 3) {
					this.method4838(81920, local9, local4);
					this.method4838(1024, local9 - 1, local4);
					this.method4838(4096, local9, local4 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method4838(536870912, local9, local4);
				this.method4838(33554432, local9, local4 - 1);
			}
			if (arg3 == 1) {
				this.method4838(8388608, local9, local4);
				this.method4838(134217728, local9 + 1, local4);
			}
			if (arg3 == 2) {
				this.method4838(33554432, local9, local4);
				this.method4838(536870912, local9, local4 + 1);
			}
			if (arg3 == 3) {
				this.method4838(134217728, local9, local4);
				this.method4838(8388608, local9 - 1, local4);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method4838(4194304, local9, local4);
				this.method4838(67108864, local9 + 1, local4 + -1);
			}
			if (arg3 == 1) {
				this.method4838(16777216, local9, local4);
				this.method4838(268435456, local9 + 1, local4 + 1);
			}
			if (arg3 == 2) {
				this.method4838(67108864, local9, local4);
				this.method4838(4194304, local9 - 1, local4 + 1);
			}
			if (arg3 == 3) {
				this.method4838(268435456, local9, local4);
				this.method4838(16777216, local9 - 1, local4 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method4838(545259520, local9, local4);
			this.method4838(33554432, local9, local4 - 1);
			this.method4838(134217728, local9 + 1, local4);
		}
		if (arg3 == 1) {
			this.method4838(41943040, local9, local4);
			this.method4838(134217728, local9 + 1, local4);
			this.method4838(536870912, local9, local4 + 1);
		}
		if (arg3 == 2) {
			this.method4838(167772160, local9, local4);
			this.method4838(536870912, local9, local4 + 1);
			this.method4838(8388608, local9 - 1, local4);
		}
		if (arg3 == 3) {
			this.method4838(671088640, local9, local4);
			this.method4838(8388608, local9 - 1, local4);
			this.method4838(33554432, local9, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V")
	public void method4847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6230;
		@Pc(17) int local17 = arg1 - this.anInt6235;
		this.anIntArrayArray48[local8][local17] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZZ)V")
	public void method4848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt6230;
		@Pc(13) int local13 = arg2 - this.anInt6235;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4839(128, local8, local13);
				this.method4839(8, local8 - 1, local13);
			}
			if (arg0 == 1) {
				this.method4839(2, local8, local13);
				this.method4839(32, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4839(8, local8, local13);
				this.method4839(128, local8 + 1, local13);
			}
			if (arg0 == 3) {
				this.method4839(32, local8, local13);
				this.method4839(2, local8, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4839(1, local8, local13);
				this.method4839(16, local8 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method4839(4, local8, local13);
				this.method4839(64, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4839(16, local8, local13);
				this.method4839(1, local8 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method4839(64, local8, local13);
				this.method4839(4, local8 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method4839(130, local8, local13);
				this.method4839(8, local8 - 1, local13);
				this.method4839(32, local8, local13 + 1);
			}
			if (arg0 == 1) {
				this.method4839(10, local8, local13);
				this.method4839(32, local8, local13 + 1);
				this.method4839(128, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method4839(40, local8, local13);
				this.method4839(128, local8 + 1, local13);
				this.method4839(2, local8, local13 - 1);
			}
			if (arg0 == 3) {
				this.method4839(160, local8, local13);
				this.method4839(2, local8, local13 - 1);
				this.method4839(8, local8 - 1, local13);
			}
		}
		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method4839(65536, local8, local13);
					this.method4839(4096, local8 - 1, local13);
				}
				if (arg0 == 1) {
					this.method4839(1024, local8, local13);
					this.method4839(16384, local8, local13 + 1);
				}
				if (arg0 == 2) {
					this.method4839(4096, local8, local13);
					this.method4839(65536, local8 + 1, local13);
				}
				if (arg0 == 3) {
					this.method4839(16384, local8, local13);
					this.method4839(1024, local8, local13 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method4839(512, local8, local13);
					this.method4839(8192, local8 - 1, local13 + 1);
				}
				if (arg0 == 1) {
					this.method4839(2048, local8, local13);
					this.method4839(32768, local8 + 1, local13 + 1);
				}
				if (arg0 == 2) {
					this.method4839(8192, local8, local13);
					this.method4839(512, local8 + 1, local13 + -1);
				}
				if (arg0 == 3) {
					this.method4839(32768, local8, local13);
					this.method4839(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method4839(66560, local8, local13);
					this.method4839(4096, local8 - 1, local13);
					this.method4839(16384, local8, local13 + 1);
				}
				if (arg0 == 1) {
					this.method4839(5120, local8, local13);
					this.method4839(16384, local8, local13 + 1);
					this.method4839(65536, local8 + 1, local13);
				}
				if (arg0 == 2) {
					this.method4839(20480, local8, local13);
					this.method4839(65536, local8 + 1, local13);
					this.method4839(1024, local8, local13 - 1);
				}
				if (arg0 == 3) {
					this.method4839(81920, local8, local13);
					this.method4839(1024, local8, local13 - 1);
					this.method4839(4096, local8 - 1, local13);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method4839(536870912, local8, local13);
				this.method4839(33554432, local8 - 1, local13);
			}
			if (arg0 == 1) {
				this.method4839(8388608, local8, local13);
				this.method4839(134217728, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4839(33554432, local8, local13);
				this.method4839(536870912, local8 + 1, local13);
			}
			if (arg0 == 3) {
				this.method4839(134217728, local8, local13);
				this.method4839(8388608, local8, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method4839(4194304, local8, local13);
				this.method4839(67108864, local8 - 1, local13 + 1);
			}
			if (arg0 == 1) {
				this.method4839(16777216, local8, local13);
				this.method4839(268435456, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4839(67108864, local8, local13);
				this.method4839(4194304, local8 + 1, local13 + -1);
			}
			if (arg0 == 3) {
				this.method4839(268435456, local8, local13);
				this.method4839(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4839(545259520, local8, local13);
			this.method4839(33554432, local8 - 1, local13);
			this.method4839(134217728, local8, local13 + 1);
		}
		if (arg0 == 1) {
			this.method4839(41943040, local8, local13);
			this.method4839(134217728, local8, local13 + 1);
			this.method4839(536870912, local8 + 1, local13);
		}
		if (arg0 == 2) {
			this.method4839(167772160, local8, local13);
			this.method4839(536870912, local8 + 1, local13);
			this.method4839(8388608, local8, local13 - 1);
		}
		if (arg0 == 3) {
			this.method4839(671088640, local8, local13);
			this.method4839(8388608, local8, local13 - 1);
			this.method4839(33554432, local8 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg1 == arg3 && arg4 == arg5) {
				return true;
			}
		} else if (arg1 <= arg3 && arg3 <= arg6 + arg1 - 1 && arg5 <= arg5 && arg5 + arg6 - 1 >= arg5) {
			return true;
		}
		@Pc(55) int local55 = arg5 - this.anInt6235;
		@Pc(60) int local60 = arg3 - this.anInt6230;
		@Pc(65) int local65 = arg1 - this.anInt6230;
		@Pc(70) int local70 = arg4 - this.anInt6235;
		if (arg6 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local60 + 1 == local65 && local70 == local55 && (this.anIntArrayArray48[local65][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 == local60 && local70 == local55 - 1 && (this.anIntArrayArray48[local65][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local60 - 1 == local65 && local55 == local70 && (this.anIntArrayArray48[local65][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 == local60 && local55 - 1 == local70 && (this.anIntArrayArray48[local65][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local65 == local60 - 1 && local55 == local70 && (this.anIntArrayArray48[local65][local70] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local55 + 1 == local70 && (this.anIntArrayArray48[local65][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local60 + 1 == local65 && local55 == local70 && (this.anIntArrayArray48[local65][local70] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local55 + 1 == local70 && (this.anIntArrayArray48[local65][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 == local60 && local55 + 1 == local70 && (this.anIntArrayArray48[local65][local70] & 0x20) == 0) {
					return true;
				}
				if (local65 == local60 && local55 - 1 == local70 && (this.anIntArrayArray48[local65][local70] & 0x2) == 0) {
					return true;
				}
				if (local65 == local60 - 1 && local55 == local70 && (this.anIntArrayArray48[local65][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 == local60 + 1 && local70 == local55 && (this.anIntArrayArray48[local65][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(414) int local414 = arg6 + local65 - 1;
			@Pc(420) int local420 = arg6 + local70 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local65 == local60 + 1 && local55 >= local70 && local420 >= local55 && (this.anIntArrayArray48[local65][local55] & 0x80) == 0) {
						return true;
					}
					if (local65 <= local60 && local414 >= local60 && local55 - arg6 == local70 && (this.anIntArrayArray48[local60][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local65 == local60 - arg6 && local70 <= local55 && local55 <= local420 && (this.anIntArrayArray48[local414][local55] & 0x8) == 0) {
						return true;
					}
					if (local65 <= local60 && local414 >= local60 && local55 - arg6 == local70 && (this.anIntArrayArray48[local60][local420] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local65 == local60 - arg6 && local70 <= local55 && local55 <= local420 && (this.anIntArrayArray48[local414][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 >= local65 && local414 >= local60 && local55 + 1 == local70 && (this.anIntArrayArray48[local60][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local65 == local60 + 1 && local70 <= local55 && local420 >= local55 && (this.anIntArrayArray48[local65][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local65 && local414 >= local60 && local70 == local55 + 1 && (this.anIntArrayArray48[local60][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 <= local60 && local414 >= local60 && local55 + 1 == local70 && (this.anIntArrayArray48[local60][local70] & 0x20) == 0) {
					return true;
				}
				if (local60 >= local65 && local60 <= local414 && local55 - arg6 == local70 && (this.anIntArrayArray48[local60][local420] & 0x2) == 0) {
					return true;
				}
				if (local65 == local60 - arg6 && local70 <= local55 && local55 <= local420 && (this.anIntArrayArray48[local414][local55] & 0x8) == 0) {
					return true;
				}
				if (local65 == local60 + 1 && local70 <= local55 && local55 <= local420 && (this.anIntArrayArray48[local65][local55] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
	public void method4850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6235;
		@Pc(13) int local13 = arg1 - this.anInt6230;
		this.anIntArrayArray48[local13][local8] |= 0x200000;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
	public void method4851() {
		for (@Pc(22) int local22 = 0; local22 < this.anInt6231; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt6225; local26++) {
				if (local22 == 0 || local26 == 0 || this.anInt6231 - 5 <= local22 || this.anInt6225 - 5 <= local26) {
					this.anIntArrayArray48[local22][local26] = -1;
				} else {
					this.anIntArrayArray48[local22][local26] = 2097152;
				}
			}
		}
	}
}
