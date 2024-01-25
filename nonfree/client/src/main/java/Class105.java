import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class105 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public int anInt2957;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public int anInt2961;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public int anInt2966;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public int anInt2972;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBZZII)V")
	public void method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 - this.anInt2972;
		@Pc(13) int local13 = arg4 - this.anInt2957;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method2732(128, local8, local13);
				this.method2732(8, local8, local13 - 1);
			}
			if (arg5 == 1) {
				this.method2732(2, local8, local13);
				this.method2732(32, local8 + 1, local13);
			}
			if (arg5 == 2) {
				this.method2732(8, local8, local13);
				this.method2732(128, local8, local13 + 1);
			}
			if (arg5 == 3) {
				this.method2732(32, local8, local13);
				this.method2732(2, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method2732(1, local8, local13);
				this.method2732(16, local8 + 1, local13 + -1);
			}
			if (arg5 == 1) {
				this.method2732(4, local8, local13);
				this.method2732(64, local8 + 1, local13 - -1);
			}
			if (arg5 == 2) {
				this.method2732(16, local8, local13);
				this.method2732(1, local8 - 1, local13 - -1);
			}
			if (arg5 == 3) {
				this.method2732(64, local8, local13);
				this.method2732(4, local8 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method2732(130, local8, local13);
				this.method2732(8, local8, local13 - 1);
				this.method2732(32, local8 + 1, local13);
			}
			if (arg5 == 1) {
				this.method2732(10, local8, local13);
				this.method2732(32, local8 + 1, local13);
				this.method2732(128, local8, local13 + 1);
			}
			if (arg5 == 2) {
				this.method2732(40, local8, local13);
				this.method2732(128, local8, local13 + 1);
				this.method2732(2, local8 - 1, local13);
			}
			if (arg5 == 3) {
				this.method2732(160, local8, local13);
				this.method2732(2, local8 - 1, local13);
				this.method2732(8, local8, local13 - 1);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method2732(65536, local8, local13);
					this.method2732(4096, local8, local13 - 1);
				}
				if (arg5 == 1) {
					this.method2732(1024, local8, local13);
					this.method2732(16384, local8 + 1, local13);
				}
				if (arg5 == 2) {
					this.method2732(4096, local8, local13);
					this.method2732(65536, local8, local13 + 1);
				}
				if (arg5 == 3) {
					this.method2732(16384, local8, local13);
					this.method2732(1024, local8 - 1, local13);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method2732(512, local8, local13);
					this.method2732(8192, local8 + 1, local13 + -1);
				}
				if (arg5 == 1) {
					this.method2732(2048, local8, local13);
					this.method2732(32768, local8 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2732(8192, local8, local13);
					this.method2732(512, local8 - 1, local13 + 1);
				}
				if (arg5 == 3) {
					this.method2732(32768, local8, local13);
					this.method2732(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method2732(66560, local8, local13);
					this.method2732(4096, local8, local13 - 1);
					this.method2732(16384, local8 + 1, local13);
				}
				if (arg5 == 1) {
					this.method2732(5120, local8, local13);
					this.method2732(16384, local8 + 1, local13);
					this.method2732(65536, local8, local13 + 1);
				}
				if (arg5 == 2) {
					this.method2732(20480, local8, local13);
					this.method2732(65536, local8, local13 + 1);
					this.method2732(1024, local8 - 1, local13);
				}
				if (arg5 == 3) {
					this.method2732(81920, local8, local13);
					this.method2732(1024, local8 - 1, local13);
					this.method2732(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method2732(536870912, local8, local13);
				this.method2732(33554432, local8, local13 - 1);
			}
			if (arg5 == 1) {
				this.method2732(8388608, local8, local13);
				this.method2732(134217728, local8 + 1, local13);
			}
			if (arg5 == 2) {
				this.method2732(33554432, local8, local13);
				this.method2732(536870912, local8, local13 + 1);
			}
			if (arg5 == 3) {
				this.method2732(134217728, local8, local13);
				this.method2732(8388608, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method2732(4194304, local8, local13);
				this.method2732(67108864, local8 + 1, local13 + -1);
			}
			if (arg5 == 1) {
				this.method2732(16777216, local8, local13);
				this.method2732(268435456, local8 + 1, local13 - -1);
			}
			if (arg5 == 2) {
				this.method2732(67108864, local8, local13);
				this.method2732(4194304, local8 - 1, local13 + 1);
			}
			if (arg5 == 3) {
				this.method2732(268435456, local8, local13);
				this.method2732(16777216, local8 - 1, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method2732(545259520, local8, local13);
			this.method2732(33554432, local8, local13 - 1);
			this.method2732(134217728, local8 + 1, local13);
		}
		if (arg5 == 1) {
			this.method2732(41943040, local8, local13);
			this.method2732(134217728, local8 + 1, local13);
			this.method2732(536870912, local8, local13 + 1);
		}
		if (arg5 == 2) {
			this.method2732(167772160, local8, local13);
			this.method2732(536870912, local8, local13 + 1);
			this.method2732(8388608, local8 - 1, local13);
		}
		if (arg5 == 3) {
			this.method2732(671088640, local8, local13);
			this.method2732(8388608, local8 - 1, local13);
			this.method2732(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZIII)Z")
	public boolean method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static352.method5824(arg2, arg4, arg5, arg4, arg0, arg7, arg3, arg1) ? true : this.method2727(arg4, arg6, arg4, arg0, arg5, arg1, arg3, arg7, arg2);
		}
		@Pc(40) int local40 = arg2 + arg5 - 1;
		@Pc(46) int local46 = arg7 + arg0 - 1;
		if (arg2 <= arg1 && local40 >= arg1 && arg3 >= arg0 && arg3 <= local46) {
			return true;
		} else if (arg1 == arg2 - 1 && arg3 >= arg0 && arg3 <= local46 && (this.anIntArrayArray19[arg1 - this.anInt2957][arg3 - this.anInt2972] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg1 == local40 + 1 && arg3 >= arg0 && local46 >= arg3 && (this.anIntArrayArray19[arg1 - this.anInt2957][arg3 - this.anInt2972] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg3 == arg0 - 1 && arg2 <= arg1 && local40 >= arg1 && (this.anIntArrayArray19[arg1 - this.anInt2957][arg3 - this.anInt2972] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return local46 + 1 == arg3 && arg1 >= arg2 && local40 >= arg1 && (this.anIntArrayArray19[arg1 - this.anInt2957][arg3 - this.anInt2972] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg1 && arg3 == arg4) {
				return true;
			}
		} else if (arg1 >= arg2 && arg1 <= arg5 + arg2 - 1 && arg3 <= arg3 && arg3 + arg5 - 1 >= arg3) {
			return true;
		}
		@Pc(60) int local60 = arg2 - this.anInt2957;
		@Pc(65) int local65 = arg3 - this.anInt2972;
		@Pc(70) int local70 = arg4 - this.anInt2972;
		@Pc(75) int local75 = arg1 - this.anInt2957;
		if (arg5 == 1) {
			if (arg0 == 0) {
				if (arg6 == 0) {
					if (local60 == local75 - 1 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 + 1 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local60 && local65 - 1 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 == local60 && local70 == local65 + 1) {
						return true;
					}
					if (local75 - 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local70 == local65 && (this.anIntArrayArray19[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local75 + 1 == local60 && local70 == local65) {
						return true;
					}
					if (local60 == local75 && local70 == local65 + 1 && (this.anIntArrayArray19[local60][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 && local70 == local65 - 1 && (this.anIntArrayArray19[local60][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local75 == local60 && local65 - 1 == local70) {
						return true;
					}
					if (local75 - 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg6 == 0) {
					if (local75 - 1 == local60 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 + 1 == local70) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local75 && local70 == local65 - 1 && (this.anIntArrayArray19[local60][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 - 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 && local70 == local65 + 1) {
						return true;
					}
					if (local75 + 1 == local60 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local70 == local65 - 1 && (this.anIntArrayArray19[local60][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local75 - 1 == local60 && local70 == local65 && (this.anIntArrayArray19[local60][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local60 && local70 == local65 + 1 && (this.anIntArrayArray19[local60][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 - 1 == local70) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local75 - 1 == local60 && local70 == local65) {
						return true;
					}
					if (local75 == local60 && local65 + 1 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local60 && local65 == local70 && (this.anIntArrayArray19[local60][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local60 && local65 - 1 == local70) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local75 == local60 && local70 == local65 + 1 && (this.anIntArrayArray19[local60][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 == local60 && local70 == local65 - 1 && (this.anIntArrayArray19[local60][local70] & 0x2) == 0) {
					return true;
				}
				if (local75 - 1 == local60 && local70 == local65 && (this.anIntArrayArray19[local60][local70] & 0x8) == 0) {
					return true;
				}
				if (local60 == local75 + 1 && local70 == local65 && (this.anIntArrayArray19[local60][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(86) int local86 = local60 + arg5 - 1;
			@Pc(92) int local92 = arg5 + local70 - 1;
			if (arg0 == 0) {
				if (arg6 == 0) {
					if (local75 - arg5 == local60 && local70 <= local65 && local92 >= local65) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local65 + 1 == local70 && (this.anIntArrayArray19[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local70 == local65 - arg5 && (this.anIntArrayArray19[local75][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local60 <= local75 && local86 >= local75 && local65 + 1 == local70) {
						return true;
					}
					if (local75 - arg5 == local60 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local86][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 >= local70 && local65 <= local92 && (this.anIntArrayArray19[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local60 == local75 + 1 && local70 <= local65 && local65 <= local92) {
						return true;
					}
					if (local75 >= local60 && local86 >= local75 && local65 + 1 == local70 && (this.anIntArrayArray19[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 <= local75 && local86 >= local75 && local65 - arg5 == local70 && (this.anIntArrayArray19[local75][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 <= local75 && local75 <= local86 && local65 - arg5 == local70) {
						return true;
					}
					if (local75 - arg5 == local60 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local86][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 2) {
				if (arg6 == 0) {
					if (local60 == local75 - arg5 && local70 <= local65 && local65 <= local92) {
						return true;
					}
					if (local60 <= local75 && local75 <= local86 && local65 + 1 == local70) {
						return true;
					}
					if (local75 + 1 == local60 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local70 == local65 - arg5 && (this.anIntArrayArray19[local75][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local75 - arg5 == local60 && local70 <= local65 && local65 <= local92 && (this.anIntArrayArray19[local86][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local75 && local86 >= local75 && local70 == local65 + 1) {
						return true;
					}
					if (local60 == local75 + 1 && local70 <= local65 && local92 >= local65) {
						return true;
					}
					if (local60 <= local75 && local75 <= local86 && local65 - arg5 == local70 && (this.anIntArrayArray19[local75][local92] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local75 - arg5 == local60 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local86][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local75 && local75 <= local86 && local70 == local65 + 1 && (this.anIntArrayArray19[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 >= local70 && local92 >= local65) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local65 - arg5 == local70) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local60 == local75 - arg5 && local70 <= local65 && local92 >= local65) {
						return true;
					}
					if (local75 >= local60 && local86 >= local75 && local65 + 1 == local70 && (this.anIntArrayArray19[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local75 + 1 && local65 >= local70 && local92 >= local65 && (this.anIntArrayArray19[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local60 && local75 <= local86 && local65 - arg5 == local70) {
						return true;
					}
				}
			}
			if (arg0 == 9) {
				if (local60 <= local75 && local75 <= local86 && local70 == local65 + 1 && (this.anIntArrayArray19[local75][local70] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 >= local60 && local75 <= local86 && local70 == local65 - arg5 && (this.anIntArrayArray19[local75][local92] & 0x2C0102) == 0) {
					return true;
				}
				if (local60 == local75 - arg5 && local70 <= local65 && local65 <= local92 && (this.anIntArrayArray19[local86][local65] & 0x2C0108) == 0) {
					return true;
				}
				if (local60 == local75 + 1 && local70 <= local65 && local92 >= local65 && (this.anIntArrayArray19[local60][local65] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIIIZI)V")
	public void method2725(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = 256;
		if (arg1) {
			local13 = 131328;
		}
		if (arg5) {
			local13 |= 0x40000000;
		}
		@Pc(30) int local30 = arg2 - this.anInt2957;
		@Pc(35) int local35 = arg3 - this.anInt2972;
		@Pc(45) int local45;
		if (arg4 == 1 || arg4 == 3) {
			local45 = arg6;
			arg6 = arg0;
			arg0 = local45;
		}
		for (local45 = local30; local45 < arg6 + local30; local45++) {
			if (local45 >= 0 && local45 < this.anInt2961) {
				for (@Pc(61) int local61 = local35; local61 < arg0 + local35; local61++) {
					if (local61 >= 0 && this.anInt2966 > local61) {
						this.method2732(local13, local61, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2972;
		@Pc(13) int local13 = arg1 - this.anInt2957;
		this.anIntArrayArray19[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg5;
		@Pc(22) int local22 = arg6 + arg2;
		@Pc(26) int local26 = arg4 + arg8;
		@Pc(30) int local30 = arg3 + arg7;
		@Pc(61) int local61;
		@Pc(72) int local72;
		if (arg5 == local26 && (arg1 & 0x2) == 0) {
			local61 = arg6 <= arg3 ? arg3 : arg6;
			local72 = local22 < local30 ? local22 : local30;
			while (local61 < local72) {
				if ((this.anIntArrayArray19[local26 - this.anInt2957 - 1][local61 - this.anInt2972] & 0x8) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg8 == local9 && (arg1 & 0x8) == 0) {
			local61 = arg3 >= arg6 ? arg3 : arg6;
			local72 = local30 > local22 ? local22 : local30;
			while (local61 < local72) {
				if ((this.anIntArrayArray19[arg8 - this.anInt2957][local61 - this.anInt2972] & 0x80) == 0) {
					return true;
				}
				local61++;
			}
		} else if (arg6 == local30 && (arg1 & 0x1) == 0) {
			local61 = arg8 >= arg5 ? arg8 : arg5;
			local72 = local26 <= local9 ? local26 : local9;
			while (local61 < local72) {
				if ((this.anIntArrayArray19[local61 - this.anInt2957][local30 - this.anInt2972 - 1] & 0x2) == 0) {
					return true;
				}
				local61++;
			}
		} else if (local22 == arg3 && (arg1 & 0x4) == 0) {
			local61 = arg8 >= arg5 ? arg8 : arg5;
			local72 = local9 >= local26 ? local26 : local9;
			while (local61 < local72) {
				if ((this.anIntArrayArray19[local61 - this.anInt2957][arg3 - this.anInt2972] & 0x20) == 0) {
					return true;
				}
				local61++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public void method2729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2957;
		@Pc(13) int local13 = arg0 - this.anInt2972;
		this.anIntArrayArray19[local8][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)V")
	public void method2730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2972;
		@Pc(13) int local13 = arg0 - this.anInt2957;
		this.anIntArrayArray19[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZZIIIZ)V")
	public void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt2957;
		@Pc(13) int local13 = arg0 - this.anInt2972;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method2736(local8, 128, local13);
				this.method2736(local8 - 1, 8, local13);
			}
			if (arg3 == 1) {
				this.method2736(local8, 2, local13);
				this.method2736(local8, 32, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2736(local8, 8, local13);
				this.method2736(local8 + 1, 128, local13);
			}
			if (arg3 == 3) {
				this.method2736(local8, 32, local13);
				this.method2736(local8, 2, local13 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method2736(local8, 1, local13);
				this.method2736(local8 - 1, 16, local13 + 1);
			}
			if (arg3 == 1) {
				this.method2736(local8, 4, local13);
				this.method2736(local8 + 1, 64, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2736(local8, 16, local13);
				this.method2736(local8 + 1, 1, local13 - 1);
			}
			if (arg3 == 3) {
				this.method2736(local8, 64, local13);
				this.method2736(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method2736(local8, 130, local13);
				this.method2736(local8 - 1, 8, local13);
				this.method2736(local8, 32, local13 + 1);
			}
			if (arg3 == 1) {
				this.method2736(local8, 10, local13);
				this.method2736(local8, 32, local13 + 1);
				this.method2736(local8 + 1, 128, local13);
			}
			if (arg3 == 2) {
				this.method2736(local8, 40, local13);
				this.method2736(local8 + 1, 128, local13);
				this.method2736(local8, 2, local13 - 1);
			}
			if (arg3 == 3) {
				this.method2736(local8, 160, local13);
				this.method2736(local8, 2, local13 - 1);
				this.method2736(local8 - 1, 8, local13);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					this.method2736(local8, 65536, local13);
					this.method2736(local8 - 1, 4096, local13);
				}
				if (arg3 == 1) {
					this.method2736(local8, 1024, local13);
					this.method2736(local8, 16384, local13 + 1);
				}
				if (arg3 == 2) {
					this.method2736(local8, 4096, local13);
					this.method2736(local8 + 1, 65536, local13);
				}
				if (arg3 == 3) {
					this.method2736(local8, 16384, local13);
					this.method2736(local8, 1024, local13 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg3 == 0) {
					this.method2736(local8, 512, local13);
					this.method2736(local8 - 1, 8192, local13 + 1);
				}
				if (arg3 == 1) {
					this.method2736(local8, 2048, local13);
					this.method2736(local8 + 1, 32768, local13 + 1);
				}
				if (arg3 == 2) {
					this.method2736(local8, 8192, local13);
					this.method2736(local8 + 1, 512, local13 - 1);
				}
				if (arg3 == 3) {
					this.method2736(local8, 32768, local13);
					this.method2736(local8 - 1, 2048, local13 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					this.method2736(local8, 66560, local13);
					this.method2736(local8 - 1, 4096, local13);
					this.method2736(local8, 16384, local13 + 1);
				}
				if (arg3 == 1) {
					this.method2736(local8, 5120, local13);
					this.method2736(local8, 16384, local13 + 1);
					this.method2736(local8 + 1, 65536, local13);
				}
				if (arg3 == 2) {
					this.method2736(local8, 20480, local13);
					this.method2736(local8 + 1, 65536, local13);
					this.method2736(local8, 1024, local13 - 1);
				}
				if (arg3 == 3) {
					this.method2736(local8, 81920, local13);
					this.method2736(local8, 1024, local13 - 1);
					this.method2736(local8 - 1, 4096, local13);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method2736(local8, 536870912, local13);
				this.method2736(local8 - 1, 33554432, local13);
			}
			if (arg3 == 1) {
				this.method2736(local8, 8388608, local13);
				this.method2736(local8, 134217728, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2736(local8, 33554432, local13);
				this.method2736(local8 + 1, 536870912, local13);
			}
			if (arg3 == 3) {
				this.method2736(local8, 134217728, local13);
				this.method2736(local8, 8388608, local13 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method2736(local8, 4194304, local13);
				this.method2736(local8 - 1, 67108864, local13 + 1);
			}
			if (arg3 == 1) {
				this.method2736(local8, 16777216, local13);
				this.method2736(local8 + 1, 268435456, local13 + 1);
			}
			if (arg3 == 2) {
				this.method2736(local8, 67108864, local13);
				this.method2736(local8 + 1, 4194304, local13 - 1);
			}
			if (arg3 == 3) {
				this.method2736(local8, 268435456, local13);
				this.method2736(local8 - 1, 16777216, local13 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2736(local8, 545259520, local13);
			this.method2736(local8 - 1, 33554432, local13);
			this.method2736(local8, 134217728, local13 + 1);
		}
		if (arg3 == 1) {
			this.method2736(local8, 41943040, local13);
			this.method2736(local8, 134217728, local13 + 1);
			this.method2736(local8 + 1, 536870912, local13);
		}
		if (arg3 == 2) {
			this.method2736(local8, 167772160, local13);
			this.method2736(local8 + 1, 536870912, local13);
			this.method2736(local8, 8388608, local13 - 1);
		}
		if (arg3 == 3) {
			this.method2736(local8, 671088640, local13);
			this.method2736(local8, 8388608, local13 - 1);
			this.method2736(local8 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)V")
	private void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg5 && arg0 == arg4) {
				return true;
			}
		} else if (arg2 >= arg5 && arg2 <= arg5 + arg6 - 1 && arg0 >= arg0 && arg6 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(43) int local43 = arg4 - this.anInt2972;
		@Pc(48) int local48 = arg0 - this.anInt2972;
		@Pc(53) int local53 = arg2 - this.anInt2957;
		@Pc(58) int local58 = arg5 - this.anInt2957;
		if (arg6 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local53 + 1 == local58 && local43 == local48 && (this.anIntArrayArray19[local58][local43] & 0x80) == 0) {
						return true;
					}
					if (local53 == local58 && local48 - 1 == local43 && (this.anIntArrayArray19[local58][local43] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local58 == local53 - 1 && local43 == local48 && (this.anIntArrayArray19[local58][local43] & 0x8) == 0) {
						return true;
					}
					if (local53 == local58 && local48 - 1 == local43 && (this.anIntArrayArray19[local58][local43] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local53 - 1 == local58 && local43 == local48 && (this.anIntArrayArray19[local58][local43] & 0x8) == 0) {
						return true;
					}
					if (local53 == local58 && local43 == local48 + 1 && (this.anIntArrayArray19[local58][local43] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local58 == local53 + 1 && local43 == local48 && (this.anIntArrayArray19[local58][local43] & 0x80) == 0) {
						return true;
					}
					if (local58 == local53 && local48 + 1 == local43 && (this.anIntArrayArray19[local58][local43] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local58 == local53 && local48 + 1 == local43 && (this.anIntArrayArray19[local58][local43] & 0x20) == 0) {
					return true;
				}
				if (local58 == local53 && local43 == local48 - 1 && (this.anIntArrayArray19[local58][local43] & 0x2) == 0) {
					return true;
				}
				if (local53 - 1 == local58 && local43 == local48 && (this.anIntArrayArray19[local58][local43] & 0x8) == 0) {
					return true;
				}
				if (local53 + 1 == local58 && local48 == local43 && (this.anIntArrayArray19[local58][local43] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(75) int local75 = arg6 + local58 - 1;
			@Pc(82) int local82 = local43 + arg6 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local58 == local53 + 1 && local48 >= local43 && local82 >= local48 && (this.anIntArrayArray19[local58][local48] & 0x80) == 0) {
						return true;
					}
					if (local58 <= local53 && local75 >= local53 && local43 == local48 - arg6 && (this.anIntArrayArray19[local53][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local53 - arg6 == local58 && local43 <= local48 && local48 <= local82 && (this.anIntArrayArray19[local75][local48] & 0x8) == 0) {
						return true;
					}
					if (local58 <= local53 && local75 >= local53 && local43 == local48 - arg6 && (this.anIntArrayArray19[local53][local82] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local58 == local53 - arg6 && local43 <= local48 && local82 >= local48 && (this.anIntArrayArray19[local75][local48] & 0x8) == 0) {
						return true;
					}
					if (local53 >= local58 && local75 >= local53 && local43 == local48 + 1 && (this.anIntArrayArray19[local53][local43] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local53 + 1 == local58 && local43 <= local48 && local82 >= local48 && (this.anIntArrayArray19[local58][local48] & 0x80) == 0) {
						return true;
					}
					if (local53 >= local58 && local75 >= local53 && local48 + 1 == local43 && (this.anIntArrayArray19[local53][local43] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local58 <= local53 && local75 >= local53 && local43 == local48 + 1 && (this.anIntArrayArray19[local53][local43] & 0x20) == 0) {
					return true;
				}
				if (local58 <= local53 && local53 <= local75 && local43 == local48 - arg6 && (this.anIntArrayArray19[local53][local82] & 0x2) == 0) {
					return true;
				}
				if (local58 == local53 - arg6 && local43 <= local48 && local48 <= local82 && (this.anIntArrayArray19[local75][local48] & 0x8) == 0) {
					return true;
				}
				if (local58 == local53 + 1 && local48 >= local43 && local82 >= local48 && (this.anIntArrayArray19[local58][local48] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZIIIZBI)V")
	public void method2735(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(22) int local22 = arg5 - this.anInt2957;
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(33) int local33 = arg3 - this.anInt2972;
		for (@Pc(35) int local35 = local22; local35 < arg2 + local22; local35++) {
			if (local35 >= 0 && this.anInt2961 > local35) {
				for (@Pc(45) int local45 = local33; local45 < local33 + arg1; local45++) {
					if (local45 >= 0 && this.anInt2966 > local45) {
						this.method2736(local35, local7, local45);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIBI)V")
	private void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray19[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public void method2737() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2961; local3++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt2966; local13++) {
				if (local3 == 0 || local13 == 0 || local3 >= this.anInt2961 - 5 || this.anInt2966 - 5 <= local13) {
					this.anIntArrayArray19[local3][local13] = -1;
				} else {
					this.anIntArrayArray19[local3][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
	public void method2738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2957;
		@Pc(13) int local13 = arg1 - this.anInt2972;
		this.anIntArrayArray19[local4][local13] |= 0x200000;
	}
}
