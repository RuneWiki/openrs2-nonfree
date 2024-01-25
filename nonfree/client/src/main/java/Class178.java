import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class178 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public int anInt4991;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public int anInt4993;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIZIIZ)V")
	public void method4470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt4995;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg1 - this.anInt4991;
		for (@Pc(37) int local37 = local29; local37 < arg4 + local29; local37++) {
			if (local37 >= 0 && this.anInt4980 > local37) {
				for (@Pc(50) int local50 = local18; local50 < arg3 + local18; local50++) {
					if (local50 >= 0 && local50 < this.anInt4993) {
						this.method4481(local37, local50, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
	public void method4472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt4991;
		@Pc(9) int local9 = arg1 - this.anInt4995;
		this.anIntArrayArray34[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public void method4473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4995;
		@Pc(9) int local9 = arg0 - this.anInt4991;
		this.anIntArrayArray34[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZIII)Z")
	public boolean method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg4 == arg6 && arg2 == arg1) {
				return true;
			}
		} else if (arg6 <= arg4 && arg6 + arg5 - 1 >= arg4 && arg2 >= arg2 && arg5 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(56) int local56 = arg6 - this.anInt4991;
		@Pc(61) int local61 = arg1 - this.anInt4995;
		@Pc(66) int local66 = arg4 - this.anInt4991;
		@Pc(71) int local71 = arg2 - this.anInt4995;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					if (local66 - 1 == local56 && local71 == local61) {
						return true;
					}
					if (local56 == local66 && local71 + 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 && local71 - 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local66 == local56 && local71 + 1 == local61) {
						return true;
					}
					if (local56 == local66 - 1 && local71 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local66 + 1 == local56 && local61 == local71) {
						return true;
					}
					if (local66 == local56 && local71 + 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local56 && local71 - 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local66 == local56 && local61 == local71 - 1) {
						return true;
					}
					if (local56 == local66 - 1 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					if (local66 - 1 == local56 && local61 == local71) {
						return true;
					}
					if (local66 == local56 && local71 + 1 == local61) {
						return true;
					}
					if (local66 + 1 == local56 && local71 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 == local66 && local61 == local71 - 1 && (this.anIntArrayArray34[local56][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local66 - 1 == local56 && local71 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local56 && local71 + 1 == local61) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local71) {
						return true;
					}
					if (local66 == local56 && local71 - 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local56 == local66 - 1 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 && local71 + 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local71) {
						return true;
					}
					if (local66 == local56 && local71 - 1 == local61) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local66 - 1 == local56 && local61 == local71) {
						return true;
					}
					if (local66 == local56 && local61 == local71 + 1 && (this.anIntArrayArray34[local56][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local56 && local61 == local71 - 1) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local56 == local66 && local71 + 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x20) == 0) {
					return true;
				}
				if (local56 == local66 && local71 - 1 == local61 && (this.anIntArrayArray34[local56][local61] & 0x2) == 0) {
					return true;
				}
				if (local66 - 1 == local56 && local71 == local61 && (this.anIntArrayArray34[local56][local61] & 0x8) == 0) {
					return true;
				}
				if (local66 + 1 == local56 && local61 == local71 && (this.anIntArrayArray34[local56][local61] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(785) int local785 = arg5 + local56 - 1;
			@Pc(791) int local791 = arg5 + local61 - 1;
			if (arg3 == 0) {
				if (arg0 == 0) {
					if (local66 - arg5 == local56 && local61 <= local71 && local71 <= local791) {
						return true;
					}
					if (local56 <= local66 && local66 <= local785 && local61 == local71 + 1 && (this.anIntArrayArray34[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local61 == local71 - arg5 && (this.anIntArrayArray34[local66][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local56 <= local66 && local785 >= local66 && local71 + 1 == local61) {
						return true;
					}
					if (local56 == local66 - arg5 && local71 >= local61 && local791 >= local71 && (this.anIntArrayArray34[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local61 <= local71 && local791 >= local71 && (this.anIntArrayArray34[local56][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local56 == local66 + 1 && local71 >= local61 && local791 >= local71) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local71 + 1 == local61 && (this.anIntArrayArray34[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 <= local66 && local66 <= local785 && local61 == local71 - arg5 && (this.anIntArrayArray34[local66][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local66 >= local56 && local66 <= local785 && local71 - arg5 == local61) {
						return true;
					}
					if (local66 - arg5 == local56 && local61 <= local71 && local791 >= local71 && (this.anIntArrayArray34[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local61 <= local71 && local71 <= local791 && (this.anIntArrayArray34[local56][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					if (local66 - arg5 == local56 && local71 >= local61 && local791 >= local71) {
						return true;
					}
					if (local56 <= local66 && local785 >= local66 && local61 == local71 + 1) {
						return true;
					}
					if (local56 == local66 + 1 && local71 >= local61 && local71 <= local791 && (this.anIntArrayArray34[local56][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local61 == local71 - arg5 && (this.anIntArrayArray34[local66][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local66 - arg5 == local56 && local61 <= local71 && local791 >= local71 && (this.anIntArrayArray34[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 >= local56 && local66 <= local785 && local61 == local71 + 1) {
						return true;
					}
					if (local66 + 1 == local56 && local71 >= local61 && local71 <= local791) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local61 == local71 - arg5 && (this.anIntArrayArray34[local66][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local56 == local66 - arg5 && local61 <= local71 && local71 <= local791 && (this.anIntArrayArray34[local785][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 <= local66 && local66 <= local785 && local71 + 1 == local61 && (this.anIntArrayArray34[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local61 <= local71 && local71 <= local791) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local71 - arg5 == local61) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local66 - arg5 == local56 && local71 >= local61 && local791 >= local71) {
						return true;
					}
					if (local66 >= local56 && local785 >= local66 && local61 == local71 + 1 && (this.anIntArrayArray34[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local71 >= local61 && local71 <= local791 && (this.anIntArrayArray34[local56][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local56 && local66 <= local785 && local71 - arg5 == local61) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local56 <= local66 && local785 >= local66 && local61 == local71 + 1 && (this.anIntArrayArray34[local66][local61] & 0x2C0120) == 0) {
					return true;
				}
				if (local56 <= local66 && local785 >= local66 && local61 == local71 - arg5 && (this.anIntArrayArray34[local66][local791] & 0x2C0102) == 0) {
					return true;
				}
				if (local56 == local66 - arg5 && local71 >= local61 && local71 <= local791 && (this.anIntArrayArray34[local785][local71] & 0x2C0108) == 0) {
					return true;
				}
				if (local66 + 1 == local56 && local61 <= local71 && local791 >= local71 && (this.anIntArrayArray34[local56][local71] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIBIII)Z")
	public boolean method4475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg0 == arg3 && arg4 == arg1) {
				return true;
			}
		} else if (arg0 <= arg3 && arg3 <= arg5 + arg0 - 1 && arg1 <= arg1 && arg5 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(65) int local65 = arg3 - this.anInt4991;
		@Pc(70) int local70 = arg0 - this.anInt4991;
		@Pc(75) int local75 = arg1 - this.anInt4995;
		@Pc(80) int local80 = arg4 - this.anInt4995;
		if (arg5 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local65 + 1 == local70 && local80 == local75 && (this.anIntArrayArray34[local70][local80] & 0x80) == 0) {
						return true;
					}
					if (local70 == local65 && local75 - 1 == local80 && (this.anIntArrayArray34[local70][local80] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local70 == local65 - 1 && local75 == local80 && (this.anIntArrayArray34[local70][local80] & 0x8) == 0) {
						return true;
					}
					if (local70 == local65 && local80 == local75 - 1 && (this.anIntArrayArray34[local70][local80] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local70 == local65 - 1 && local75 == local80 && (this.anIntArrayArray34[local70][local80] & 0x8) == 0) {
						return true;
					}
					if (local65 == local70 && local75 + 1 == local80 && (this.anIntArrayArray34[local70][local80] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local70 == local65 + 1 && local80 == local75 && (this.anIntArrayArray34[local70][local80] & 0x80) == 0) {
						return true;
					}
					if (local65 == local70 && local80 == local75 + 1 && (this.anIntArrayArray34[local70][local80] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local70 == local65 && local75 + 1 == local80 && (this.anIntArrayArray34[local70][local80] & 0x20) == 0) {
					return true;
				}
				if (local65 == local70 && local75 - 1 == local80 && (this.anIntArrayArray34[local70][local80] & 0x2) == 0) {
					return true;
				}
				if (local70 == local65 - 1 && local80 == local75 && (this.anIntArrayArray34[local70][local80] & 0x8) == 0) {
					return true;
				}
				if (local70 == local65 + 1 && local80 == local75 && (this.anIntArrayArray34[local70][local80] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(438) int local438 = arg5 + local70 - 1;
			@Pc(444) int local444 = arg5 + local80 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg2 = arg2 + 2 & 0x3;
				}
				if (arg2 == 0) {
					if (local70 == local65 + 1 && local75 >= local80 && local75 <= local444 && (this.anIntArrayArray34[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local438 && local75 - arg5 == local80 && (this.anIntArrayArray34[local65][local444] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local70 == local65 - arg5 && local80 <= local75 && local75 <= local444 && (this.anIntArrayArray34[local438][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local65 && local438 >= local65 && local75 - arg5 == local80 && (this.anIntArrayArray34[local65][local444] & 0x2) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local65 - arg5 == local70 && local80 <= local75 && local75 <= local444 && (this.anIntArrayArray34[local438][local75] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local438 && local80 == local75 + 1 && (this.anIntArrayArray34[local65][local80] & 0x20) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local70 == local65 + 1 && local75 >= local80 && local444 >= local75 && (this.anIntArrayArray34[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local65 && local438 >= local65 && local80 == local75 + 1 && (this.anIntArrayArray34[local65][local80] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local65 >= local70 && local65 <= local438 && local75 + 1 == local80 && (this.anIntArrayArray34[local65][local80] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local65 && local65 <= local438 && local75 - arg5 == local80 && (this.anIntArrayArray34[local65][local444] & 0x2) == 0) {
					return true;
				}
				if (local70 == local65 - arg5 && local80 <= local75 && local444 >= local75 && (this.anIntArrayArray34[local438][local75] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local70 && local75 >= local80 && local75 <= local444 && (this.anIntArrayArray34[local70][local75] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIB)V")
	private void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray34[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = arg6 + arg1;
		@Pc(15) int local15 = arg4 + arg8;
		@Pc(19) int local19 = arg7 + arg0;
		@Pc(24) int local24 = arg3 + arg5;
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (local19 == arg6 && (arg2 & 0x2) == 0) {
			local46 = arg4 <= arg3 ? arg3 : arg4;
			local53 = local24 > local15 ? local15 : local24;
			while (local46 < local53) {
				if ((this.anIntArrayArray34[local19 - this.anInt4991 - 1][local46 - this.anInt4995] & 0x8) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local10 == arg7 && (arg2 & 0x8) == 0) {
			local46 = arg3 >= arg4 ? arg3 : arg4;
			local53 = local15 >= local24 ? local24 : local15;
			while (local53 > local46) {
				if ((this.anIntArrayArray34[arg7 - this.anInt4991][local46 - this.anInt4995] & 0x80) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local24 == arg4 && (arg2 & 0x1) == 0) {
			local46 = arg6 <= arg7 ? arg7 : arg6;
			local53 = local19 <= local10 ? local19 : local10;
			while (local53 > local46) {
				if ((this.anIntArrayArray34[local46 - this.anInt4991][local24 - this.anInt4995 - 1] & 0x2) == 0) {
					return true;
				}
				local46++;
			}
		} else if (local15 == arg3 && (arg2 & 0x4) == 0) {
			local46 = arg7 < arg6 ? arg6 : arg7;
			local53 = local10 >= local19 ? local19 : local10;
			while (local53 > local46) {
				if ((this.anIntArrayArray34[local46 - this.anInt4991][arg3 - this.anInt4995] & 0x20) == 0) {
					return true;
				}
				local46++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static207.method3777(arg7, arg5, arg0, arg1, arg3, arg6, arg2, arg2) ? true : this.method4477(arg6, arg2, arg4, arg1, arg3, arg7, arg0, arg5, arg2);
		}
		@Pc(39) int local39 = arg5 + arg6 - 1;
		@Pc(45) int local45 = arg7 + arg1 - 1;
		if (arg0 >= arg5 && arg0 <= local39 && arg1 <= arg3 && arg3 <= local45) {
			return true;
		} else if (arg5 - 1 == arg0 && arg1 <= arg3 && arg3 <= local45 && (this.anIntArrayArray34[arg0 - this.anInt4991][arg3 - this.anInt4995] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg0 && arg1 <= arg3 && arg3 <= local45 && (this.anIntArrayArray34[arg0 - this.anInt4991][arg3 - this.anInt4995] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg1 - 1 && arg0 >= arg5 && local39 >= arg0 && (this.anIntArrayArray34[arg0 - this.anInt4991][arg3 - this.anInt4995] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg3 && arg5 <= arg0 && arg0 <= local39 && (this.anIntArrayArray34[arg0 - this.anInt4991][arg3 - this.anInt4995] & 0x20) == 0 && (arg4 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBIIIIIZ)V")
	public void method4479(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg2 - this.anInt4991;
		@Pc(36) int local36;
		if (arg1 == 1 || arg1 == 3) {
			local36 = arg4;
			arg4 = arg3;
			arg3 = local36;
		}
		@Pc(45) int local45 = arg5 - this.anInt4995;
		for (local36 = local24; local36 < local24 + arg4; local36++) {
			if (local36 >= 0 && local36 < this.anInt4980) {
				for (@Pc(69) int local69 = local45; local69 < arg3 + local45; local69++) {
					if (local69 >= 0 && local69 < this.anInt4993) {
						this.method4476(local7, local69, local36);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIIIIZ)V")
	public void method4480(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt4995;
		@Pc(13) int local13 = arg3 - this.anInt4991;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4476(128, local8, local13);
				this.method4476(8, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method4476(2, local8, local13);
				this.method4476(32, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method4476(8, local8, local13);
				this.method4476(128, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method4476(32, local8, local13);
				this.method4476(2, local8 - 1, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4476(1, local8, local13);
				this.method4476(16, local8 + 1, local13 + -1);
			}
			if (arg0 == 1) {
				this.method4476(4, local8, local13);
				this.method4476(64, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4476(16, local8, local13);
				this.method4476(1, local8 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method4476(64, local8, local13);
				this.method4476(4, local8 - 1, local13 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method4476(130, local8, local13);
				this.method4476(8, local8, local13 - 1);
				this.method4476(32, local8 + 1, local13);
			}
			if (arg0 == 1) {
				this.method4476(10, local8, local13);
				this.method4476(32, local8 + 1, local13);
				this.method4476(128, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method4476(40, local8, local13);
				this.method4476(128, local8, local13 + 1);
				this.method4476(2, local8 - 1, local13);
			}
			if (arg0 == 3) {
				this.method4476(160, local8, local13);
				this.method4476(2, local8 - 1, local13);
				this.method4476(8, local8, local13 - 1);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method4476(65536, local8, local13);
					this.method4476(4096, local8, local13 - 1);
				}
				if (arg0 == 1) {
					this.method4476(1024, local8, local13);
					this.method4476(16384, local8 + 1, local13);
				}
				if (arg0 == 2) {
					this.method4476(4096, local8, local13);
					this.method4476(65536, local8, local13 + 1);
				}
				if (arg0 == 3) {
					this.method4476(16384, local8, local13);
					this.method4476(1024, local8 - 1, local13);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method4476(512, local8, local13);
					this.method4476(8192, local8 + 1, local13 + -1);
				}
				if (arg0 == 1) {
					this.method4476(2048, local8, local13);
					this.method4476(32768, local8 + 1, local13 - -1);
				}
				if (arg0 == 2) {
					this.method4476(8192, local8, local13);
					this.method4476(512, local8 - 1, local13 - -1);
				}
				if (arg0 == 3) {
					this.method4476(32768, local8, local13);
					this.method4476(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method4476(66560, local8, local13);
					this.method4476(4096, local8, local13 - 1);
					this.method4476(16384, local8 + 1, local13);
				}
				if (arg0 == 1) {
					this.method4476(5120, local8, local13);
					this.method4476(16384, local8 + 1, local13);
					this.method4476(65536, local8, local13 + 1);
				}
				if (arg0 == 2) {
					this.method4476(20480, local8, local13);
					this.method4476(65536, local8, local13 + 1);
					this.method4476(1024, local8 - 1, local13);
				}
				if (arg0 == 3) {
					this.method4476(81920, local8, local13);
					this.method4476(1024, local8 - 1, local13);
					this.method4476(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4476(536870912, local8, local13);
				this.method4476(33554432, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method4476(8388608, local8, local13);
				this.method4476(134217728, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method4476(33554432, local8, local13);
				this.method4476(536870912, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method4476(134217728, local8, local13);
				this.method4476(8388608, local8 - 1, local13);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4476(4194304, local8, local13);
				this.method4476(67108864, local8 + 1, local13 - 1);
			}
			if (arg0 == 1) {
				this.method4476(16777216, local8, local13);
				this.method4476(268435456, local8 + 1, local13 - -1);
			}
			if (arg0 == 2) {
				this.method4476(67108864, local8, local13);
				this.method4476(4194304, local8 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method4476(268435456, local8, local13);
				this.method4476(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4476(545259520, local8, local13);
			this.method4476(33554432, local8, local13 - 1);
			this.method4476(134217728, local8 + 1, local13);
		}
		if (arg0 == 1) {
			this.method4476(41943040, local8, local13);
			this.method4476(134217728, local8 + 1, local13);
			this.method4476(536870912, local8, local13 + 1);
		}
		if (arg0 == 2) {
			this.method4476(167772160, local8, local13);
			this.method4476(536870912, local8, local13 + 1);
			this.method4476(8388608, local8 - 1, local13);
		}
		if (arg0 == 3) {
			this.method4476(671088640, local8, local13);
			this.method4476(8388608, local8 - 1, local13);
			this.method4476(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	private void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray34[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method4482() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4980; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt4993; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt4980 - 5 || local7 >= this.anInt4993 - 5) {
					this.anIntArrayArray34[local3][local7] = -1;
				} else {
					this.anIntArrayArray34[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V")
	public void method4483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt4995;
		@Pc(13) int local13 = arg0 - this.anInt4991;
		this.anIntArrayArray34[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZZI)V")
	public void method4485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt4991;
		@Pc(9) int local9 = arg1 - this.anInt4995;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4481(local4, local9, 128);
				this.method4481(local4 - 1, local9, 8);
			}
			if (arg0 == 1) {
				this.method4481(local4, local9, 2);
				this.method4481(local4, local9 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4481(local4, local9, 8);
				this.method4481(local4 + 1, local9, 128);
			}
			if (arg0 == 3) {
				this.method4481(local4, local9, 32);
				this.method4481(local4, local9 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4481(local4, local9, 1);
				this.method4481(local4 - 1, local9 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4481(local4, local9, 4);
				this.method4481(local4 + 1, local9 + 1, 64);
			}
			if (arg0 == 2) {
				this.method4481(local4, local9, 16);
				this.method4481(local4 + 1, local9 - 1, 1);
			}
			if (arg0 == 3) {
				this.method4481(local4, local9, 64);
				this.method4481(local4 - 1, local9 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method4481(local4, local9, 130);
				this.method4481(local4 - 1, local9, 8);
				this.method4481(local4, local9 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4481(local4, local9, 10);
				this.method4481(local4, local9 + 1, 32);
				this.method4481(local4 + 1, local9, 128);
			}
			if (arg0 == 2) {
				this.method4481(local4, local9, 40);
				this.method4481(local4 + 1, local9, 128);
				this.method4481(local4, local9 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4481(local4, local9, 160);
				this.method4481(local4, local9 - 1, 2);
				this.method4481(local4 - 1, local9, 8);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method4481(local4, local9, 65536);
					this.method4481(local4 - 1, local9, 4096);
				}
				if (arg0 == 1) {
					this.method4481(local4, local9, 1024);
					this.method4481(local4, local9 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4481(local4, local9, 4096);
					this.method4481(local4 + 1, local9, 65536);
				}
				if (arg0 == 3) {
					this.method4481(local4, local9, 16384);
					this.method4481(local4, local9 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method4481(local4, local9, 512);
					this.method4481(local4 - 1, local9 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method4481(local4, local9, 2048);
					this.method4481(local4 + 1, local9 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4481(local4, local9, 8192);
					this.method4481(local4 + 1, local9 + -1, 512);
				}
				if (arg0 == 3) {
					this.method4481(local4, local9, 32768);
					this.method4481(local4 - 1, local9 - 1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method4481(local4, local9, 66560);
					this.method4481(local4 - 1, local9, 4096);
					this.method4481(local4, local9 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4481(local4, local9, 5120);
					this.method4481(local4, local9 + 1, 16384);
					this.method4481(local4 + 1, local9, 65536);
				}
				if (arg0 == 2) {
					this.method4481(local4, local9, 20480);
					this.method4481(local4 + 1, local9, 65536);
					this.method4481(local4, local9 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4481(local4, local9, 81920);
					this.method4481(local4, local9 - 1, 1024);
					this.method4481(local4 - 1, local9, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method4481(local4, local9, 536870912);
				this.method4481(local4 - 1, local9, 33554432);
			}
			if (arg0 == 1) {
				this.method4481(local4, local9, 8388608);
				this.method4481(local4, local9 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4481(local4, local9, 33554432);
				this.method4481(local4 + 1, local9, 536870912);
			}
			if (arg0 == 3) {
				this.method4481(local4, local9, 134217728);
				this.method4481(local4, local9 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method4481(local4, local9, 4194304);
				this.method4481(local4 - 1, local9 - -1, 67108864);
			}
			if (arg0 == 1) {
				this.method4481(local4, local9, 16777216);
				this.method4481(local4 + 1, local9 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method4481(local4, local9, 67108864);
				this.method4481(local4 + 1, local9 - 1, 4194304);
			}
			if (arg0 == 3) {
				this.method4481(local4, local9, 268435456);
				this.method4481(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4481(local4, local9, 545259520);
			this.method4481(local4 - 1, local9, 33554432);
			this.method4481(local4, local9 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4481(local4, local9, 41943040);
			this.method4481(local4, local9 + 1, 134217728);
			this.method4481(local4 + 1, local9, 536870912);
		}
		if (arg0 == 2) {
			this.method4481(local4, local9, 167772160);
			this.method4481(local4 + 1, local9, 536870912);
			this.method4481(local4, local9 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4481(local4, local9, 671088640);
			this.method4481(local4, local9 - 1, 8388608);
			this.method4481(local4 - 1, local9, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
	public void method4486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt4991;
		@Pc(19) int local19 = arg0 - this.anInt4995;
		this.anIntArrayArray34[local10][local19] &= 0xFFFBFFFF;
	}
}
