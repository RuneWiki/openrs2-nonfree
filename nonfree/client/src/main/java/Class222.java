import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class222 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public int anInt5613;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public int anInt5619;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public int anInt5625;

	static {
		new Class169("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg5 && arg4 == arg3) {
				return true;
			}
		} else if (arg5 <= arg0 && arg5 + arg1 - 1 >= arg0 && arg4 >= arg4 && arg4 <= arg4 + arg1 - 1) {
			return true;
		}
		@Pc(60) int local60 = arg5 - this.anInt5619;
		@Pc(65) int local65 = arg0 - this.anInt5619;
		@Pc(70) int local70 = arg3 - this.anInt5625;
		@Pc(75) int local75 = arg4 - this.anInt5625;
		if (arg1 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local60 == local65 + 1 && local75 == local70 && (this.anIntArrayArray59[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local70 == local75 - 1 && (this.anIntArrayArray59[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local60 == local65 - 1 && local75 == local70 && (this.anIntArrayArray59[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local75 - 1 == local70 && (this.anIntArrayArray59[local60][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local65 - 1 == local60 && local75 == local70 && (this.anIntArrayArray59[local60][local70] & 0x8) == 0) {
						return true;
					}
					if (local60 == local65 && local70 == local75 + 1 && (this.anIntArrayArray59[local60][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 == local65 + 1 && local70 == local75 && (this.anIntArrayArray59[local60][local70] & 0x80) == 0) {
						return true;
					}
					if (local60 == local65 && local75 + 1 == local70 && (this.anIntArrayArray59[local60][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 == local60 && local70 == local75 + 1 && (this.anIntArrayArray59[local60][local70] & 0x20) == 0) {
					return true;
				}
				if (local60 == local65 && local75 - 1 == local70 && (this.anIntArrayArray59[local60][local70] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local60 && local75 == local70 && (this.anIntArrayArray59[local60][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local60 && local75 == local70 && (this.anIntArrayArray59[local60][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(92) int local92 = arg1 + local60 - 1;
			@Pc(98) int local98 = arg1 + local70 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local60 == local65 + 1 && local75 >= local70 && local75 <= local98 && (this.anIntArrayArray59[local60][local75] & 0x80) == 0) {
						return true;
					}
					if (local65 >= local60 && local92 >= local65 && local70 == local75 - arg1 && (this.anIntArrayArray59[local65][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local65 - arg1 == local60 && local70 <= local75 && local75 <= local98 && (this.anIntArrayArray59[local92][local75] & 0x8) == 0) {
						return true;
					}
					if (local60 <= local65 && local65 <= local92 && local70 == local75 - arg1 && (this.anIntArrayArray59[local65][local98] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local65 - arg1 == local60 && local70 <= local75 && local75 <= local98 && (this.anIntArrayArray59[local92][local75] & 0x8) == 0) {
						return true;
					}
					if (local65 >= local60 && local65 <= local92 && local75 + 1 == local70 && (this.anIntArrayArray59[local65][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 == local65 + 1 && local70 <= local75 && local75 <= local98 && (this.anIntArrayArray59[local60][local75] & 0x80) == 0) {
						return true;
					}
					if (local60 <= local65 && local92 >= local65 && local75 + 1 == local70 && (this.anIntArrayArray59[local65][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local65 >= local60 && local92 >= local65 && local70 == local75 + 1 && (this.anIntArrayArray59[local65][local70] & 0x20) == 0) {
					return true;
				}
				if (local60 <= local65 && local92 >= local65 && local70 == local75 - arg1 && (this.anIntArrayArray59[local65][local98] & 0x2) == 0) {
					return true;
				}
				if (local65 - arg1 == local60 && local75 >= local70 && local75 <= local98 && (this.anIntArrayArray59[local92][local75] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local60 && local75 >= local70 && local75 <= local98 && (this.anIntArrayArray59[local60][local75] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public void method4824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - this.anInt5619;
		@Pc(18) int local18 = arg0 - this.anInt5625;
		this.anIntArrayArray59[local13][local18] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIIIBZ)V")
	public void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(32) int local32 = arg0 - this.anInt5619;
		@Pc(37) int local37 = arg3 - this.anInt5625;
		if (arg6) {
			local7 |= 0x40000000;
		}
		@Pc(51) int local51;
		if (arg5 == 1 || arg5 == 3) {
			local51 = arg2;
			arg2 = arg4;
			arg4 = local51;
		}
		for (local51 = local32; local51 < arg2 + local32; local51++) {
			if (local51 >= 0 && local51 < this.anInt5620) {
				for (@Pc(74) int local74 = local37; local74 < local37 + arg4; local74++) {
					if (local74 >= 0 && local74 < this.anInt5613) {
						this.method4836(local51, local74, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
	public void method4826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5625;
		@Pc(13) int local13 = arg1 - this.anInt5619;
		this.anIntArrayArray59[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg5 == arg0 && arg4 == arg1) {
				return true;
			}
		} else if (arg0 >= arg5 && arg0 <= arg5 + arg6 - 1 && arg1 <= arg1 && arg1 <= arg1 + arg6 - 1) {
			return true;
		}
		@Pc(50) int local50 = arg4 - this.anInt5625;
		@Pc(61) int local61 = arg0 - this.anInt5619;
		@Pc(66) int local66 = arg5 - this.anInt5619;
		@Pc(71) int local71 = arg1 - this.anInt5625;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local66 == local61 - 1 && local71 == local50) {
						return true;
					}
					if (local66 == local61 && local50 == local71 + 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 && local50 == local71 - 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local61 && local50 == local71 + 1) {
						return true;
					}
					if (local61 - 1 == local66 && local71 == local50 && (this.anIntArrayArray59[local66][local50] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local66 && local50 == local71 && (this.anIntArrayArray59[local66][local50] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local61 + 1 && local50 == local71) {
						return true;
					}
					if (local66 == local61 && local50 == local71 + 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local66 && local50 == local71 - 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 == local61 && local50 == local71 - 1) {
						return true;
					}
					if (local66 == local61 - 1 && local50 == local71 && (this.anIntArrayArray59[local66][local50] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 + 1 == local66 && local71 == local50 && (this.anIntArrayArray59[local66][local50] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local61 - 1 == local66 && local50 == local71) {
						return true;
					}
					if (local66 == local61 && local50 == local71 + 1) {
						return true;
					}
					if (local61 + 1 == local66 && local71 == local50 && (this.anIntArrayArray59[local66][local50] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local61 && local50 == local71 - 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local61 - 1 == local66 && local71 == local50 && (this.anIntArrayArray59[local66][local50] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local66 && local71 + 1 == local50) {
						return true;
					}
					if (local66 == local61 + 1 && local50 == local71) {
						return true;
					}
					if (local61 == local66 && local50 == local71 - 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local61 - 1 && local50 == local71 && (this.anIntArrayArray59[local66][local50] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 && local50 == local71 + 1 && (this.anIntArrayArray59[local66][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 + 1 && local50 == local71) {
						return true;
					}
					if (local61 == local66 && local71 - 1 == local50) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 - 1 == local66 && local71 == local50) {
						return true;
					}
					if (local61 == local66 && local71 + 1 == local50 && (this.anIntArrayArray59[local66][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 + 1 && local50 == local71 && (this.anIntArrayArray59[local66][local50] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local61 && local50 == local71 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local66 == local61 && local71 + 1 == local50 && (this.anIntArrayArray59[local66][local50] & 0x20) == 0) {
					return true;
				}
				if (local61 == local66 && local50 == local71 - 1 && (this.anIntArrayArray59[local66][local50] & 0x2) == 0) {
					return true;
				}
				if (local66 == local61 - 1 && local71 == local50 && (this.anIntArrayArray59[local66][local50] & 0x8) == 0) {
					return true;
				}
				if (local61 + 1 == local66 && local50 == local71 && (this.anIntArrayArray59[local66][local50] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = arg6 + local66 - 1;
			@Pc(88) int local88 = arg6 + local50 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local61 - arg6 == local66 && local71 >= local50 && local71 <= local88) {
						return true;
					}
					if (local61 >= local66 && local61 <= local82 && local50 == local71 + 1 && (this.anIntArrayArray59[local61][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local71 - arg6 == local50 && (this.anIntArrayArray59[local61][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 <= local61 && local82 >= local61 && local50 == local71 + 1) {
						return true;
					}
					if (local61 - arg6 == local66 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local82][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 + 1 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local66][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local61 + 1 == local66 && local50 <= local71 && local71 <= local88) {
						return true;
					}
					if (local61 >= local66 && local61 <= local82 && local71 + 1 == local50 && (this.anIntArrayArray59[local61][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local50 == local71 - arg6 && (this.anIntArrayArray59[local61][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 >= local66 && local82 >= local61 && local50 == local71 - arg6) {
						return true;
					}
					if (local66 == local61 - arg6 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local82][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local61 + 1 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local66][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local66 == local61 - arg6 && local50 <= local71 && local71 <= local88) {
						return true;
					}
					if (local66 <= local61 && local82 >= local61 && local50 == local71 + 1) {
						return true;
					}
					if (local61 + 1 == local66 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local66][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 <= local61 && local61 <= local82 && local71 - arg6 == local50 && (this.anIntArrayArray59[local61][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local61 - arg6 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local82][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local50 == local71 + 1) {
						return true;
					}
					if (local61 + 1 == local66 && local71 >= local50 && local71 <= local88) {
						return true;
					}
					if (local66 <= local61 && local82 >= local61 && local71 - arg6 == local50 && (this.anIntArrayArray59[local61][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local61 - arg6 && local71 >= local50 && local88 >= local71 && (this.anIntArrayArray59[local82][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local71 + 1 == local50 && (this.anIntArrayArray59[local61][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local61 + 1 && local71 >= local50 && local88 >= local71) {
						return true;
					}
					if (local61 >= local66 && local61 <= local82 && local50 == local71 - arg6) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local61 - arg6 == local66 && local50 <= local71 && local88 >= local71) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local50 == local71 + 1 && (this.anIntArrayArray59[local61][local50] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 + 1 == local66 && local50 <= local71 && local71 <= local88 && (this.anIntArrayArray59[local66][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 >= local66 && local82 >= local61 && local50 == local71 - arg6) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local61 >= local66 && local82 >= local61 && local71 + 1 == local50 && (this.anIntArrayArray59[local61][local50] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 <= local61 && local82 >= local61 && local71 - arg6 == local50 && (this.anIntArrayArray59[local61][local88] & 0x2C0102) == 0) {
					return true;
				}
				if (local61 - arg6 == local66 && local71 >= local50 && local71 <= local88 && (this.anIntArrayArray59[local82][local71] & 0x2C0108) == 0) {
					return true;
				}
				if (local61 + 1 == local66 && local50 <= local71 && local88 >= local71 && (this.anIntArrayArray59[local66][local71] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIIIZII)V")
	public void method4829(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg4 - this.anInt5625;
		@Pc(9) int local9 = arg1 - this.anInt5619;
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method4839(local9, local4, 128);
				this.method4839(local9 - 1, local4, 8);
			}
			if (arg5 == 1) {
				this.method4839(local9, local4, 2);
				this.method4839(local9, local4 + 1, 32);
			}
			if (arg5 == 2) {
				this.method4839(local9, local4, 8);
				this.method4839(local9 + 1, local4, 128);
			}
			if (arg5 == 3) {
				this.method4839(local9, local4, 32);
				this.method4839(local9, local4 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method4839(local9, local4, 1);
				this.method4839(local9 - 1, local4 + 1, 16);
			}
			if (arg5 == 1) {
				this.method4839(local9, local4, 4);
				this.method4839(local9 + 1, local4 + 1, 64);
			}
			if (arg5 == 2) {
				this.method4839(local9, local4, 16);
				this.method4839(local9 + 1, local4 + -1, 1);
			}
			if (arg5 == 3) {
				this.method4839(local9, local4, 64);
				this.method4839(local9 - 1, local4 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				this.method4839(local9, local4, 130);
				this.method4839(local9 - 1, local4, 8);
				this.method4839(local9, local4 + 1, 32);
			}
			if (arg5 == 1) {
				this.method4839(local9, local4, 10);
				this.method4839(local9, local4 + 1, 32);
				this.method4839(local9 + 1, local4, 128);
			}
			if (arg5 == 2) {
				this.method4839(local9, local4, 40);
				this.method4839(local9 + 1, local4, 128);
				this.method4839(local9, local4 - 1, 2);
			}
			if (arg5 == 3) {
				this.method4839(local9, local4, 160);
				this.method4839(local9, local4 - 1, 2);
				this.method4839(local9 - 1, local4, 8);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg5 == 0) {
					this.method4839(local9, local4, 65536);
					this.method4839(local9 - 1, local4, 4096);
				}
				if (arg5 == 1) {
					this.method4839(local9, local4, 1024);
					this.method4839(local9, local4 + 1, 16384);
				}
				if (arg5 == 2) {
					this.method4839(local9, local4, 4096);
					this.method4839(local9 + 1, local4, 65536);
				}
				if (arg5 == 3) {
					this.method4839(local9, local4, 16384);
					this.method4839(local9, local4 - 1, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg5 == 0) {
					this.method4839(local9, local4, 512);
					this.method4839(local9 - 1, local4 - -1, 8192);
				}
				if (arg5 == 1) {
					this.method4839(local9, local4, 2048);
					this.method4839(local9 + 1, local4 + 1, 32768);
				}
				if (arg5 == 2) {
					this.method4839(local9, local4, 8192);
					this.method4839(local9 + 1, local4 - 1, 512);
				}
				if (arg5 == 3) {
					this.method4839(local9, local4, 32768);
					this.method4839(local9 - 1, local4 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					this.method4839(local9, local4, 66560);
					this.method4839(local9 - 1, local4, 4096);
					this.method4839(local9, local4 + 1, 16384);
				}
				if (arg5 == 1) {
					this.method4839(local9, local4, 5120);
					this.method4839(local9, local4 + 1, 16384);
					this.method4839(local9 + 1, local4, 65536);
				}
				if (arg5 == 2) {
					this.method4839(local9, local4, 20480);
					this.method4839(local9 + 1, local4, 65536);
					this.method4839(local9, local4 - 1, 1024);
				}
				if (arg5 == 3) {
					this.method4839(local9, local4, 81920);
					this.method4839(local9, local4 - 1, 1024);
					this.method4839(local9 - 1, local4, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg5 == 0) {
				this.method4839(local9, local4, 536870912);
				this.method4839(local9 - 1, local4, 33554432);
			}
			if (arg5 == 1) {
				this.method4839(local9, local4, 8388608);
				this.method4839(local9, local4 + 1, 134217728);
			}
			if (arg5 == 2) {
				this.method4839(local9, local4, 33554432);
				this.method4839(local9 + 1, local4, 536870912);
			}
			if (arg5 == 3) {
				this.method4839(local9, local4, 134217728);
				this.method4839(local9, local4 - 1, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg5 == 0) {
				this.method4839(local9, local4, 4194304);
				this.method4839(local9 - 1, local4 + 1, 67108864);
			}
			if (arg5 == 1) {
				this.method4839(local9, local4, 16777216);
				this.method4839(local9 + 1, local4 + 1, 268435456);
			}
			if (arg5 == 2) {
				this.method4839(local9, local4, 67108864);
				this.method4839(local9 + 1, local4 + -1, 4194304);
			}
			if (arg5 == 3) {
				this.method4839(local9, local4, 268435456);
				this.method4839(local9 - 1, local4 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method4839(local9, local4, 545259520);
			this.method4839(local9 - 1, local4, 33554432);
			this.method4839(local9, local4 + 1, 134217728);
		}
		if (arg5 == 1) {
			this.method4839(local9, local4, 41943040);
			this.method4839(local9, local4 + 1, 134217728);
			this.method4839(local9 + 1, local4, 536870912);
		}
		if (arg5 == 2) {
			this.method4839(local9, local4, 167772160);
			this.method4839(local9 + 1, local4, 536870912);
			this.method4839(local9, local4 - 1, 8388608);
		}
		if (arg5 == 3) {
			this.method4839(local9, local4, 671088640);
			this.method4839(local9, local4 - 1, 8388608);
			this.method4839(local9 - 1, local4, 33554432);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)V")
	public void method4830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5625;
		@Pc(13) int local13 = arg1 - this.anInt5619;
		this.anIntArrayArray59[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method4831() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5620; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt5613; local7++) {
				if (local3 == 0 || local7 == 0 || local3 >= this.anInt5620 - 5 || local7 >= this.anInt5613 - 5) {
					this.anIntArrayArray59[local3][local7] = -1;
				} else {
					this.anIntArrayArray59[local3][local7] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIZIIZ)V")
	public void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg0 - this.anInt5619;
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg3 - this.anInt5625;
		for (@Pc(31) int local31 = local18; local31 < arg4 + local18; local31++) {
			if (local31 >= 0 && local31 < this.anInt5620) {
				for (@Pc(57) int local57 = local29; local57 < arg2 + local29; local57++) {
					if (local57 >= 0 && local57 < this.anInt5613) {
						this.method4839(local31, local57, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIZZ)V")
	public void method4834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg1 - this.anInt5619;
		@Pc(13) int local13 = arg2 - this.anInt5625;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4836(local8, local13, 128);
				this.method4836(local8 - 1, local13, 8);
			}
			if (arg0 == 1) {
				this.method4836(local8, local13, 2);
				this.method4836(local8, local13 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4836(local8, local13, 8);
				this.method4836(local8 + 1, local13, 128);
			}
			if (arg0 == 3) {
				this.method4836(local8, local13, 32);
				this.method4836(local8, local13 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4836(local8, local13, 1);
				this.method4836(local8 - 1, local13 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4836(local8, local13, 4);
				this.method4836(local8 + 1, local13 + 1, 64);
			}
			if (arg0 == 2) {
				this.method4836(local8, local13, 16);
				this.method4836(local8 + 1, local13 + -1, 1);
			}
			if (arg0 == 3) {
				this.method4836(local8, local13, 64);
				this.method4836(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method4836(local8, local13, 130);
				this.method4836(local8 - 1, local13, 8);
				this.method4836(local8, local13 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4836(local8, local13, 10);
				this.method4836(local8, local13 + 1, 32);
				this.method4836(local8 + 1, local13, 128);
			}
			if (arg0 == 2) {
				this.method4836(local8, local13, 40);
				this.method4836(local8 + 1, local13, 128);
				this.method4836(local8, local13 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4836(local8, local13, 160);
				this.method4836(local8, local13 - 1, 2);
				this.method4836(local8 - 1, local13, 8);
			}
		}
		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method4836(local8, local13, 65536);
					this.method4836(local8 - 1, local13, 4096);
				}
				if (arg0 == 1) {
					this.method4836(local8, local13, 1024);
					this.method4836(local8, local13 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4836(local8, local13, 4096);
					this.method4836(local8 + 1, local13, 65536);
				}
				if (arg0 == 3) {
					this.method4836(local8, local13, 16384);
					this.method4836(local8, local13 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method4836(local8, local13, 512);
					this.method4836(local8 - 1, local13 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method4836(local8, local13, 2048);
					this.method4836(local8 + 1, local13 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4836(local8, local13, 8192);
					this.method4836(local8 + 1, local13 + -1, 512);
				}
				if (arg0 == 3) {
					this.method4836(local8, local13, 32768);
					this.method4836(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method4836(local8, local13, 66560);
					this.method4836(local8 - 1, local13, 4096);
					this.method4836(local8, local13 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4836(local8, local13, 5120);
					this.method4836(local8, local13 + 1, 16384);
					this.method4836(local8 + 1, local13, 65536);
				}
				if (arg0 == 2) {
					this.method4836(local8, local13, 20480);
					this.method4836(local8 + 1, local13, 65536);
					this.method4836(local8, local13 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4836(local8, local13, 81920);
					this.method4836(local8, local13 - 1, 1024);
					this.method4836(local8 - 1, local13, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method4836(local8, local13, 536870912);
				this.method4836(local8 - 1, local13, 33554432);
			}
			if (arg0 == 1) {
				this.method4836(local8, local13, 8388608);
				this.method4836(local8, local13 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4836(local8, local13, 33554432);
				this.method4836(local8 + 1, local13, 536870912);
			}
			if (arg0 == 3) {
				this.method4836(local8, local13, 134217728);
				this.method4836(local8, local13 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method4836(local8, local13, 4194304);
				this.method4836(local8 - 1, local13 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method4836(local8, local13, 16777216);
				this.method4836(local8 + 1, local13 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method4836(local8, local13, 67108864);
				this.method4836(local8 + 1, local13 + -1, 4194304);
			}
			if (arg0 == 3) {
				this.method4836(local8, local13, 268435456);
				this.method4836(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4836(local8, local13, 545259520);
			this.method4836(local8 - 1, local13, 33554432);
			this.method4836(local8, local13 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4836(local8, local13, 41943040);
			this.method4836(local8, local13 + 1, 134217728);
			this.method4836(local8 + 1, local13, 536870912);
		}
		if (arg0 == 2) {
			this.method4836(local8, local13, 167772160);
			this.method4836(local8 + 1, local13, 536870912);
			this.method4836(local8, local13 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4836(local8, local13, 671088640);
			this.method4836(local8, local13 - 1, 8388608);
			this.method4836(local8 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method4835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 > 1) {
			return Static318.method4692(arg2, arg7, arg3, arg7, arg4, arg6, arg5, arg0) ? true : this.method4837(arg0, arg7, arg4, arg7, arg6, arg5, arg1, arg2, arg3);
		}
		@Pc(40) int local40 = arg2 + arg3 - 1;
		@Pc(47) int local47 = arg5 + arg0 - 1;
		if (arg3 <= arg4 && arg4 <= local40 && arg5 <= arg6 && local47 >= arg6) {
			return true;
		} else if (arg3 - 1 == arg4 && arg5 <= arg6 && arg6 <= local47 && (this.anIntArrayArray59[arg4 - this.anInt5619][arg6 - this.anInt5625] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg4 && arg5 <= arg6 && local47 >= arg6 && (this.anIntArrayArray59[arg4 - this.anInt5619][arg6 - this.anInt5625] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg5 - 1 && arg4 >= arg3 && arg4 <= local40 && (this.anIntArrayArray59[arg4 - this.anInt5619][arg6 - this.anInt5625] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg6 && arg3 <= arg4 && arg4 <= local40 && (this.anIntArrayArray59[arg4 - this.anInt5619][arg6 - this.anInt5625] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	private void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray59[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIBIII)Z")
	public boolean method4837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg2 + arg1;
		@Pc(13) int local13 = arg4 + arg3;
		@Pc(31) int local31 = arg7 + arg8;
		@Pc(36) int local36 = arg5 + arg0;
		@Pc(58) int local58;
		@Pc(65) int local65;
		if (local31 == arg2 && (arg6 & 0x2) == 0) {
			local58 = arg5 < arg4 ? arg4 : arg5;
			local65 = local36 > local13 ? local13 : local36;
			while (local65 > local58) {
				if ((this.anIntArrayArray59[local31 - this.anInt5619 - 1][local58 - this.anInt5625] & 0x8) == 0) {
					return true;
				}
				local58++;
			}
		} else if (arg8 == local9 && (arg6 & 0x8) == 0) {
			local58 = arg4 <= arg5 ? arg5 : arg4;
			local65 = local13 < local36 ? local13 : local36;
			while (local58 < local65) {
				if ((this.anIntArrayArray59[arg8 - this.anInt5619][local58 - this.anInt5625] & 0x80) == 0) {
					return true;
				}
				local58++;
			}
		} else if (arg4 == local36 && (arg6 & 0x1) == 0) {
			local58 = arg2 > arg8 ? arg2 : arg8;
			local65 = local9 >= local31 ? local31 : local9;
			while (local65 > local58) {
				if ((this.anIntArrayArray59[local58 - this.anInt5619][local36 - this.anInt5625 - 1] & 0x2) == 0) {
					return true;
				}
				local58++;
			}
		} else if (arg5 == local13 && (arg6 & 0x4) == 0) {
			local58 = arg8 >= arg2 ? arg8 : arg2;
			local65 = local31 > local9 ? local9 : local31;
			while (local58 < local65) {
				if ((this.anIntArrayArray59[local58 - this.anInt5619][arg5 - this.anInt5625] & 0x20) == 0) {
					return true;
				}
				local58++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(III)V")
	public void method4838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 - this.anInt5625;
		@Pc(19) int local19 = arg0 - this.anInt5619;
		this.anIntArrayArray59[local19][local10] |= 0x40000;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
	private void method4839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray59[arg0][arg1] |= arg2;
	}
}
