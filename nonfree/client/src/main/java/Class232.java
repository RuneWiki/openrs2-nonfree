import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class232 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!nea", name = "r", descriptor = "I")
	public int anInt6654;

	@OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
	public int anInt6659;

	@OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
	public int anInt6663;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIZZIIBI)V")
	public void method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(26) int local26 = arg6 - this.anInt6640;
		@Pc(31) int local31 = arg1 - this.anInt6654;
		@Pc(41) int local41;
		if (arg5 == 1 || arg5 == 3) {
			local41 = arg4;
			arg4 = arg0;
			arg0 = local41;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (local41 = local26; local41 < arg4 + local26; local41++) {
			if (local41 >= 0 && local41 < this.anInt6663) {
				for (@Pc(63) int local63 = local31; local63 < arg0 + local31; local63++) {
					if (local63 >= 0 && local63 < this.anInt6659) {
						this.method5275(local63, local7, local41);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg6 && arg4 == arg0) {
				return true;
			}
		} else if (arg6 <= arg3 && arg6 + arg1 - 1 >= arg3 && arg0 >= arg0 && arg0 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(49) int local49 = arg6 - this.anInt6640;
		@Pc(54) int local54 = arg0 - this.anInt6654;
		@Pc(59) int local59 = arg3 - this.anInt6640;
		@Pc(72) int local72 = arg4 - this.anInt6654;
		if (arg1 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local49 == local59 + 1 && local72 == local54 && (this.anIntArrayArray31[local49][local72] & 0x80) == 0) {
						return true;
					}
					if (local49 == local59 && local54 - 1 == local72 && (this.anIntArrayArray31[local49][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local49 == local59 - 1 && local72 == local54 && (this.anIntArrayArray31[local49][local72] & 0x8) == 0) {
						return true;
					}
					if (local49 == local59 && local72 == local54 - 1 && (this.anIntArrayArray31[local49][local72] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local59 - 1 == local49 && local72 == local54 && (this.anIntArrayArray31[local49][local72] & 0x8) == 0) {
						return true;
					}
					if (local49 == local59 && local72 == local54 + 1 && (this.anIntArrayArray31[local49][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local59 + 1 == local49 && local54 == local72 && (this.anIntArrayArray31[local49][local72] & 0x80) == 0) {
						return true;
					}
					if (local49 == local59 && local54 + 1 == local72 && (this.anIntArrayArray31[local49][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local59 == local49 && local72 == local54 + 1 && (this.anIntArrayArray31[local49][local72] & 0x20) == 0) {
					return true;
				}
				if (local59 == local49 && local54 - 1 == local72 && (this.anIntArrayArray31[local49][local72] & 0x2) == 0) {
					return true;
				}
				if (local49 == local59 - 1 && local54 == local72 && (this.anIntArrayArray31[local49][local72] & 0x8) == 0) {
					return true;
				}
				if (local59 + 1 == local49 && local72 == local54 && (this.anIntArrayArray31[local49][local72] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(405) int local405 = arg1 + local49 - 1;
			@Pc(411) int local411 = arg1 + local72 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local49 == local59 + 1 && local72 <= local54 && local411 >= local54 && (this.anIntArrayArray31[local49][local54] & 0x80) == 0) {
						return true;
					}
					if (local49 <= local59 && local59 <= local405 && local54 - arg1 == local72 && (this.anIntArrayArray31[local59][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local59 - arg1 == local49 && local54 >= local72 && local54 <= local411 && (this.anIntArrayArray31[local405][local54] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local49 && local59 <= local405 && local72 == local54 - arg1 && (this.anIntArrayArray31[local59][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local49 == local59 - arg1 && local72 <= local54 && local411 >= local54 && (this.anIntArrayArray31[local405][local54] & 0x8) == 0) {
						return true;
					}
					if (local59 >= local49 && local59 <= local405 && local72 == local54 + 1 && (this.anIntArrayArray31[local59][local72] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local49 == local59 + 1 && local72 <= local54 && local411 >= local54 && (this.anIntArrayArray31[local49][local54] & 0x80) == 0) {
						return true;
					}
					if (local59 >= local49 && local405 >= local59 && local54 + 1 == local72 && (this.anIntArrayArray31[local59][local72] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local49 <= local59 && local405 >= local59 && local72 == local54 + 1 && (this.anIntArrayArray31[local59][local72] & 0x20) == 0) {
					return true;
				}
				if (local59 >= local49 && local59 <= local405 && local72 == local54 - arg1 && (this.anIntArrayArray31[local59][local411] & 0x2) == 0) {
					return true;
				}
				if (local59 - arg1 == local49 && local54 >= local72 && local54 <= local411 && (this.anIntArrayArray31[local405][local54] & 0x8) == 0) {
					return true;
				}
				if (local49 == local59 + 1 && local54 >= local72 && local54 <= local411 && (this.anIntArrayArray31[local49][local54] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	public void method5266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6654;
		@Pc(21) int local21 = arg0 - this.anInt6640;
		this.anIntArrayArray31[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == 1) {
			if (arg4 == arg5 && arg0 == arg6) {
				return true;
			}
		} else if (arg4 >= arg5 && arg5 + arg1 - 1 >= arg4 && arg6 <= arg6 && arg1 + arg6 - 1 >= arg6) {
			return true;
		}
		@Pc(58) int local58 = arg6 - this.anInt6654;
		@Pc(63) int local63 = arg5 - this.anInt6640;
		@Pc(68) int local68 = arg0 - this.anInt6654;
		@Pc(78) int local78 = arg4 - this.anInt6640;
		if (arg1 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local78 - 1 == local63 && local58 == local68) {
						return true;
					}
					if (local63 == local78 && local58 + 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local63 && local68 == local58 - 1 && (this.anIntArrayArray31[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local78 == local63 && local58 + 1 == local68) {
						return true;
					}
					if (local63 == local78 - 1 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local58 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local78 + 1 == local63 && local58 == local68) {
						return true;
					}
					if (local63 == local78 && local58 + 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local63 && local68 == local58 - 1 && (this.anIntArrayArray31[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local63 == local78 && local68 == local58 - 1) {
						return true;
					}
					if (local63 == local78 - 1 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local63 == local78 - 1 && local58 == local68) {
						return true;
					}
					if (local63 == local78 && local58 + 1 == local68) {
						return true;
					}
					if (local78 + 1 == local63 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local63 && local68 == local58 - 1 && (this.anIntArrayArray31[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local63 == local78 - 1 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 && local68 == local58 + 1) {
						return true;
					}
					if (local63 == local78 + 1 && local68 == local58) {
						return true;
					}
					if (local63 == local78 && local58 - 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local78 - 1 == local63 && local58 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 && local58 + 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local58 == local68) {
						return true;
					}
					if (local78 == local63 && local68 == local58 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local78 - 1 == local63 && local68 == local58) {
						return true;
					}
					if (local78 == local63 && local58 + 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local58 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 == local78 && local58 - 1 == local68) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local63 == local78 && local68 == local58 + 1 && (this.anIntArrayArray31[local63][local68] & 0x20) == 0) {
					return true;
				}
				if (local63 == local78 && local58 - 1 == local68 && (this.anIntArrayArray31[local63][local68] & 0x2) == 0) {
					return true;
				}
				if (local63 == local78 - 1 && local58 == local68 && (this.anIntArrayArray31[local63][local68] & 0x8) == 0) {
					return true;
				}
				if (local78 + 1 == local63 && local68 == local58 && (this.anIntArrayArray31[local63][local68] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(89) int local89 = arg1 + local63 - 1;
			@Pc(95) int local95 = arg1 + local68 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local63 == local78 - arg1 && local68 <= local58 && local58 <= local95) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local58 + 1 == local68 && (this.anIntArrayArray31[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local68 == local58 - arg1 && (this.anIntArrayArray31[local78][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local63 <= local78 && local78 <= local89 && local68 == local58 + 1) {
						return true;
					}
					if (local78 - arg1 == local63 && local68 <= local58 && local95 >= local58 && (this.anIntArrayArray31[local89][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local63 && local58 >= local68 && local58 <= local95 && (this.anIntArrayArray31[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local78 + 1 == local63 && local68 <= local58 && local58 <= local95) {
						return true;
					}
					if (local63 <= local78 && local89 >= local78 && local68 == local58 + 1 && (this.anIntArrayArray31[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local68 == local58 - arg1 && (this.anIntArrayArray31[local78][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local78 >= local63 && local89 >= local78 && local68 == local58 - arg1) {
						return true;
					}
					if (local78 - arg1 == local63 && local58 >= local68 && local95 >= local58 && (this.anIntArrayArray31[local89][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local68 <= local58 && local95 >= local58 && (this.anIntArrayArray31[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local78 - arg1 == local63 && local58 >= local68 && local95 >= local58) {
						return true;
					}
					if (local78 >= local63 && local89 >= local78 && local58 + 1 == local68) {
						return true;
					}
					if (local78 + 1 == local63 && local58 >= local68 && local58 <= local95 && (this.anIntArrayArray31[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local68 == local58 - arg1 && (this.anIntArrayArray31[local78][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local63 == local78 - arg1 && local68 <= local58 && local58 <= local95 && (this.anIntArrayArray31[local89][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local63 <= local78 && local89 >= local78 && local58 + 1 == local68) {
						return true;
					}
					if (local78 + 1 == local63 && local68 <= local58 && local58 <= local95) {
						return true;
					}
					if (local78 >= local63 && local89 >= local78 && local68 == local58 - arg1 && (this.anIntArrayArray31[local78][local95] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local63 == local78 - arg1 && local68 <= local58 && local95 >= local58 && (this.anIntArrayArray31[local89][local58] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 >= local63 && local89 >= local78 && local58 + 1 == local68 && (this.anIntArrayArray31[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local58 >= local68 && local95 >= local58) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local68 == local58 - arg1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local63 == local78 - arg1 && local58 >= local68 && local95 >= local58) {
						return true;
					}
					if (local78 >= local63 && local78 <= local89 && local58 + 1 == local68 && (this.anIntArrayArray31[local78][local68] & 0x2C0120) == 0) {
						return true;
					}
					if (local63 == local78 + 1 && local58 >= local68 && local58 <= local95 && (this.anIntArrayArray31[local63][local58] & 0x2C0180) == 0) {
						return true;
					}
					if (local63 <= local78 && local78 <= local89 && local58 - arg1 == local68) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local78 >= local63 && local89 >= local78 && local58 + 1 == local68 && (this.anIntArrayArray31[local78][local68] & 0x2C0120) == 0) {
					return true;
				}
				if (local63 <= local78 && local89 >= local78 && local58 - arg1 == local68 && (this.anIntArrayArray31[local78][local95] & 0x2C0102) == 0) {
					return true;
				}
				if (local78 - arg1 == local63 && local68 <= local58 && local95 >= local58 && (this.anIntArrayArray31[local89][local58] & 0x2C0108) == 0) {
					return true;
				}
				if (local78 + 1 == local63 && local68 <= local58 && local58 <= local95 && (this.anIntArrayArray31[local63][local58] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZZIIIII)V")
	public void method5268(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg4 - this.anInt6654;
		@Pc(29) int local29 = arg5 - this.anInt6640;
		for (@Pc(37) int local37 = local29; local37 < arg2 + local29; local37++) {
			if (local37 >= 0 && this.anInt6663 > local37) {
				for (@Pc(50) int local50 = local24; local50 < arg3 + local24; local50++) {
					if (local50 >= 0 && local50 < this.anInt6659) {
						this.method5274(local37, local7, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(III)V")
	public void method5269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6654;
		@Pc(13) int local13 = arg1 - this.anInt6640;
		this.anIntArrayArray31[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)V")
	public void method5270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6640;
		@Pc(13) int local13 = arg1 - this.anInt6654;
		this.anIntArrayArray31[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(III)V")
	public void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6654;
		@Pc(13) int local13 = arg1 - this.anInt6640;
		this.anIntArrayArray31[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZIZIZI)V")
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt6640;
		@Pc(13) int local13 = arg0 - this.anInt6654;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5275(local13, 128, local4);
				this.method5275(local13, 8, local4 - 1);
			}
			if (arg5 == 1) {
				this.method5275(local13, 2, local4);
				this.method5275(local13 + 1, 32, local4);
			}
			if (arg5 == 2) {
				this.method5275(local13, 8, local4);
				this.method5275(local13, 128, local4 + 1);
			}
			if (arg5 == 3) {
				this.method5275(local13, 32, local4);
				this.method5275(local13 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5275(local13, 1, local4);
				this.method5275(local13 + 1, 16, local4 - 1);
			}
			if (arg5 == 1) {
				this.method5275(local13, 4, local4);
				this.method5275(local13 + 1, 64, local4 + 1);
			}
			if (arg5 == 2) {
				this.method5275(local13, 16, local4);
				this.method5275(local13 - 1, 1, local4 + 1);
			}
			if (arg5 == 3) {
				this.method5275(local13, 64, local4);
				this.method5275(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method5275(local13, 130, local4);
				this.method5275(local13, 8, local4 - 1);
				this.method5275(local13 + 1, 32, local4);
			}
			if (arg5 == 1) {
				this.method5275(local13, 10, local4);
				this.method5275(local13 + 1, 32, local4);
				this.method5275(local13, 128, local4 + 1);
			}
			if (arg5 == 2) {
				this.method5275(local13, 40, local4);
				this.method5275(local13, 128, local4 + 1);
				this.method5275(local13 - 1, 2, local4);
			}
			if (arg5 == 3) {
				this.method5275(local13, 160, local4);
				this.method5275(local13 - 1, 2, local4);
				this.method5275(local13, 8, local4 - 1);
			}
		}
		if (arg4) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method5275(local13, 65536, local4);
					this.method5275(local13, 4096, local4 - 1);
				}
				if (arg5 == 1) {
					this.method5275(local13, 1024, local4);
					this.method5275(local13 + 1, 16384, local4);
				}
				if (arg5 == 2) {
					this.method5275(local13, 4096, local4);
					this.method5275(local13, 65536, local4 + 1);
				}
				if (arg5 == 3) {
					this.method5275(local13, 16384, local4);
					this.method5275(local13 - 1, 1024, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method5275(local13, 512, local4);
					this.method5275(local13 + 1, 8192, local4 - 1);
				}
				if (arg5 == 1) {
					this.method5275(local13, 2048, local4);
					this.method5275(local13 + 1, 32768, local4 + 1);
				}
				if (arg5 == 2) {
					this.method5275(local13, 8192, local4);
					this.method5275(local13 - 1, 512, local4 + 1);
				}
				if (arg5 == 3) {
					this.method5275(local13, 32768, local4);
					this.method5275(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method5275(local13, 66560, local4);
					this.method5275(local13, 4096, local4 - 1);
					this.method5275(local13 + 1, 16384, local4);
				}
				if (arg5 == 1) {
					this.method5275(local13, 5120, local4);
					this.method5275(local13 + 1, 16384, local4);
					this.method5275(local13, 65536, local4 + 1);
				}
				if (arg5 == 2) {
					this.method5275(local13, 20480, local4);
					this.method5275(local13, 65536, local4 + 1);
					this.method5275(local13 - 1, 1024, local4);
				}
				if (arg5 == 3) {
					this.method5275(local13, 81920, local4);
					this.method5275(local13 - 1, 1024, local4);
					this.method5275(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method5275(local13, 536870912, local4);
				this.method5275(local13, 33554432, local4 - 1);
			}
			if (arg5 == 1) {
				this.method5275(local13, 8388608, local4);
				this.method5275(local13 + 1, 134217728, local4);
			}
			if (arg5 == 2) {
				this.method5275(local13, 33554432, local4);
				this.method5275(local13, 536870912, local4 + 1);
			}
			if (arg5 == 3) {
				this.method5275(local13, 134217728, local4);
				this.method5275(local13 - 1, 8388608, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method5275(local13, 4194304, local4);
				this.method5275(local13 + 1, 67108864, local4 - 1);
			}
			if (arg5 == 1) {
				this.method5275(local13, 16777216, local4);
				this.method5275(local13 + 1, 268435456, local4 + 1);
			}
			if (arg5 == 2) {
				this.method5275(local13, 67108864, local4);
				this.method5275(local13 - 1, 4194304, local4 + 1);
			}
			if (arg5 == 3) {
				this.method5275(local13, 268435456, local4);
				this.method5275(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method5275(local13, 545259520, local4);
			this.method5275(local13, 33554432, local4 - 1);
			this.method5275(local13 + 1, 134217728, local4);
		}
		if (arg5 == 1) {
			this.method5275(local13, 41943040, local4);
			this.method5275(local13 + 1, 134217728, local4);
			this.method5275(local13, 536870912, local4 + 1);
		}
		if (arg5 == 2) {
			this.method5275(local13, 167772160, local4);
			this.method5275(local13, 536870912, local4 + 1);
			this.method5275(local13 - 1, 8388608, local4);
		}
		if (arg5 == 3) {
			this.method5275(local13, 671088640, local4);
			this.method5275(local13 - 1, 8388608, local4);
			this.method5275(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIZ)V")
	private void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray31[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIII)V")
	private void method5275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray31[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V")
	public void method5276() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt6663; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt6659; local19++) {
				if (local15 == 0 || local19 == 0 || this.anInt6663 - 5 <= local15 || local19 >= this.anInt6659 - 5) {
					this.anIntArrayArray31[local15][local19] = -1;
				} else {
					this.anIntArrayArray31[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIZIIII)Z")
	public boolean method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static407.method6148(arg7, arg1, arg4, arg7, arg0, arg3, arg2, arg6) ? true : this.method5279(arg6, arg1, arg5, arg0, arg2, arg7, arg7, arg4, arg3);
		}
		@Pc(47) int local47 = arg4 + arg3 - 1;
		@Pc(54) int local54 = arg6 + arg2 - 1;
		if (arg1 >= arg4 && local47 >= arg1 && arg6 <= arg0 && local54 >= arg0) {
			return true;
		} else if (arg4 - 1 == arg1 && arg0 >= arg6 && arg0 <= local54 && (this.anIntArrayArray31[arg1 - this.anInt6640][arg0 - this.anInt6654] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local47 + 1 == arg1 && arg0 >= arg6 && local54 >= arg0 && (this.anIntArrayArray31[arg1 - this.anInt6640][arg0 - this.anInt6654] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg0 == arg6 - 1 && arg4 <= arg1 && arg1 <= local47 && (this.anIntArrayArray31[arg1 - this.anInt6640][arg0 - this.anInt6654] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg0 == local54 + 1 && arg1 >= arg4 && local47 >= arg1 && (this.anIntArrayArray31[arg1 - this.anInt6640][arg0 - this.anInt6654] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZIIZIZ)V")
	public void method5278(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt6640;
		@Pc(13) int local13 = arg3 - this.anInt6654;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5274(local8, 128, local13);
				this.method5274(local8 - 1, 8, local13);
			}
			if (arg4 == 1) {
				this.method5274(local8, 2, local13);
				this.method5274(local8, 32, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5274(local8, 8, local13);
				this.method5274(local8 + 1, 128, local13);
			}
			if (arg4 == 3) {
				this.method5274(local8, 32, local13);
				this.method5274(local8, 2, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5274(local8, 1, local13);
				this.method5274(local8 - 1, 16, local13 + 1);
			}
			if (arg4 == 1) {
				this.method5274(local8, 4, local13);
				this.method5274(local8 + 1, 64, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5274(local8, 16, local13);
				this.method5274(local8 + 1, 1, local13 - 1);
			}
			if (arg4 == 3) {
				this.method5274(local8, 64, local13);
				this.method5274(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method5274(local8, 130, local13);
				this.method5274(local8 - 1, 8, local13);
				this.method5274(local8, 32, local13 + 1);
			}
			if (arg4 == 1) {
				this.method5274(local8, 10, local13);
				this.method5274(local8, 32, local13 + 1);
				this.method5274(local8 + 1, 128, local13);
			}
			if (arg4 == 2) {
				this.method5274(local8, 40, local13);
				this.method5274(local8 + 1, 128, local13);
				this.method5274(local8, 2, local13 - 1);
			}
			if (arg4 == 3) {
				this.method5274(local8, 160, local13);
				this.method5274(local8, 2, local13 - 1);
				this.method5274(local8 - 1, 8, local13);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method5274(local8, 65536, local13);
					this.method5274(local8 - 1, 4096, local13);
				}
				if (arg4 == 1) {
					this.method5274(local8, 1024, local13);
					this.method5274(local8, 16384, local13 + 1);
				}
				if (arg4 == 2) {
					this.method5274(local8, 4096, local13);
					this.method5274(local8 + 1, 65536, local13);
				}
				if (arg4 == 3) {
					this.method5274(local8, 16384, local13);
					this.method5274(local8, 1024, local13 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method5274(local8, 512, local13);
					this.method5274(local8 - 1, 8192, local13 + 1);
				}
				if (arg4 == 1) {
					this.method5274(local8, 2048, local13);
					this.method5274(local8 + 1, 32768, local13 + 1);
				}
				if (arg4 == 2) {
					this.method5274(local8, 8192, local13);
					this.method5274(local8 + 1, 512, local13 - 1);
				}
				if (arg4 == 3) {
					this.method5274(local8, 32768, local13);
					this.method5274(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method5274(local8, 66560, local13);
					this.method5274(local8 - 1, 4096, local13);
					this.method5274(local8, 16384, local13 + 1);
				}
				if (arg4 == 1) {
					this.method5274(local8, 5120, local13);
					this.method5274(local8, 16384, local13 + 1);
					this.method5274(local8 + 1, 65536, local13);
				}
				if (arg4 == 2) {
					this.method5274(local8, 20480, local13);
					this.method5274(local8 + 1, 65536, local13);
					this.method5274(local8, 1024, local13 - 1);
				}
				if (arg4 == 3) {
					this.method5274(local8, 81920, local13);
					this.method5274(local8, 1024, local13 - 1);
					this.method5274(local8 - 1, 4096, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5274(local8, 536870912, local13);
				this.method5274(local8 - 1, 33554432, local13);
			}
			if (arg4 == 1) {
				this.method5274(local8, 8388608, local13);
				this.method5274(local8, 134217728, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5274(local8, 33554432, local13);
				this.method5274(local8 + 1, 536870912, local13);
			}
			if (arg4 == 3) {
				this.method5274(local8, 134217728, local13);
				this.method5274(local8, 8388608, local13 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5274(local8, 4194304, local13);
				this.method5274(local8 - 1, 67108864, local13 + 1);
			}
			if (arg4 == 1) {
				this.method5274(local8, 16777216, local13);
				this.method5274(local8 + 1, 268435456, local13 + 1);
			}
			if (arg4 == 2) {
				this.method5274(local8, 67108864, local13);
				this.method5274(local8 + 1, 4194304, local13 - 1);
			}
			if (arg4 == 3) {
				this.method5274(local8, 268435456, local13);
				this.method5274(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5274(local8, 545259520, local13);
			this.method5274(local8 - 1, 33554432, local13);
			this.method5274(local8, 134217728, local13 + 1);
		}
		if (arg4 == 1) {
			this.method5274(local8, 41943040, local13);
			this.method5274(local8, 134217728, local13 + 1);
			this.method5274(local8 + 1, 536870912, local13);
		}
		if (arg4 == 2) {
			this.method5274(local8, 167772160, local13);
			this.method5274(local8 + 1, 536870912, local13);
			this.method5274(local8, 8388608, local13 - 1);
		}
		if (arg4 == 3) {
			this.method5274(local8, 671088640, local13);
			this.method5274(local8, 8388608, local13 - 1);
			this.method5274(local8 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 + arg1;
		@Pc(22) int local22 = arg3 + arg6;
		@Pc(26) int local26 = arg8 + arg7;
		@Pc(30) int local30 = arg0 + arg4;
		@Pc(63) int local63;
		@Pc(74) int local74;
		if (arg1 == local26 && (arg2 & 0x2) == 0) {
			local63 = arg0 >= arg3 ? arg0 : arg3;
			local74 = local22 >= local30 ? local30 : local22;
			while (local63 < local74) {
				if ((this.anIntArrayArray31[local26 - this.anInt6640 - 1][local63 - this.anInt6654] & 0x8) == 0) {
					return true;
				}
				local63++;
			}
		} else if (arg7 == local9 && (arg2 & 0x8) == 0) {
			local63 = arg0 < arg3 ? arg3 : arg0;
			local74 = local22 >= local30 ? local30 : local22;
			while (local63 < local74) {
				if ((this.anIntArrayArray31[arg7 - this.anInt6640][local63 - this.anInt6654] & 0x80) == 0) {
					return true;
				}
				local63++;
			}
		} else if (arg3 == local30 && (arg2 & 0x1) == 0) {
			local63 = arg1 > arg7 ? arg1 : arg7;
			local74 = local26 <= local9 ? local26 : local9;
			while (local74 > local63) {
				if ((this.anIntArrayArray31[local63 - this.anInt6640][local30 - this.anInt6654 - 1] & 0x2) == 0) {
					return true;
				}
				local63++;
			}
		} else if (local22 == arg0 && (arg2 & 0x4) == 0) {
			local63 = arg7 >= arg1 ? arg7 : arg1;
			local74 = local9 >= local26 ? local26 : local9;
			while (local63 < local74) {
				if ((this.anIntArrayArray31[local63 - this.anInt6640][arg0 - this.anInt6654] & 0x20) == 0) {
					return true;
				}
				local63++;
			}
		}
		return false;
	}
}
