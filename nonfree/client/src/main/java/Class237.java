import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class237 {

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
	public int anInt6790;

	@OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
	public int anInt6797;

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
	public int anInt6799;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)V")
	public void method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6799;
		@Pc(17) int local17 = arg1 - this.anInt6790;
		this.anIntArrayArray33[local4][local17] |= 0x40000;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)V")
	private void method5900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray33[arg2][arg0] |= arg1;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZIZBIII)V")
	public void method5901(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(21) int local21;
		if (arg0 == 1 || arg0 == 3) {
			local21 = arg4;
			arg4 = arg6;
			arg6 = local21;
		}
		@Pc(30) int local30 = arg2 - this.anInt6790;
		@Pc(35) int local35 = arg5 - this.anInt6799;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (local21 = local35; local21 < arg4 + local35; local21++) {
			if (local21 >= 0 && local21 < this.anInt6796) {
				for (@Pc(72) int local72 = local30; local72 < local30 + arg6; local72++) {
					if (local72 >= 0 && local72 < this.anInt6797) {
						this.method5907(local72, local21, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg6 && arg0 == arg4) {
				return true;
			}
		} else if (arg3 >= arg6 && arg3 <= arg6 + arg5 - 1 && arg0 <= arg0 && arg0 + arg5 - 1 >= arg0) {
			return true;
		}
		@Pc(60) int local60 = arg0 - this.anInt6790;
		@Pc(65) int local65 = arg6 - this.anInt6799;
		@Pc(70) int local70 = arg4 - this.anInt6790;
		@Pc(75) int local75 = arg3 - this.anInt6799;
		if (arg5 == 1) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local65 == local75 - 1 && local70 == local60) {
						return true;
					}
					if (local75 == local65 && local60 + 1 == local70 && (this.anIntArrayArray33[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local75 && local70 == local60 - 1 && (this.anIntArrayArray33[local65][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 == local65 && local70 == local60 + 1) {
						return true;
					}
					if (local65 == local75 - 1 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local75 + 1 && local60 == local70 && (this.anIntArrayArray33[local65][local70] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local65 == local75 + 1 && local60 == local70) {
						return true;
					}
					if (local75 == local65 && local70 == local60 + 1 && (this.anIntArrayArray33[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local75 && local60 - 1 == local70 && (this.anIntArrayArray33[local65][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local65 == local75 && local70 == local60 - 1) {
						return true;
					}
					if (local75 - 1 == local65 && local60 == local70 && (this.anIntArrayArray33[local65][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local75 + 1 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local75 - 1 == local65 && local60 == local70) {
						return true;
					}
					if (local75 == local65 && local70 == local60 + 1) {
						return true;
					}
					if (local65 == local75 + 1 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1 && (this.anIntArrayArray33[local65][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 - 1 == local65 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 + 1) {
						return true;
					}
					if (local65 == local75 + 1 && local70 == local60) {
						return true;
					}
					if (local65 == local75 && local70 == local60 - 1 && (this.anIntArrayArray33[local65][local70] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local75 - 1 == local65 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local75 && local60 + 1 == local70 && (this.anIntArrayArray33[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local75 + 1 && local70 == local60) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local75 - 1 == local65 && local70 == local60) {
						return true;
					}
					if (local65 == local75 && local70 == local60 + 1 && (this.anIntArrayArray33[local65][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local65 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local60 - 1) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local65 == local75 && local60 + 1 == local70 && (this.anIntArrayArray33[local65][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 == local65 && local70 == local60 - 1 && (this.anIntArrayArray33[local65][local70] & 0x2) == 0) {
					return true;
				}
				if (local65 == local75 - 1 && local60 == local70 && (this.anIntArrayArray33[local65][local70] & 0x8) == 0) {
					return true;
				}
				if (local65 == local75 + 1 && local70 == local60 && (this.anIntArrayArray33[local65][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(781) int local781 = local65 + arg5 - 1;
			@Pc(787) int local787 = arg5 + local70 - 1;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local65 == local75 - arg5 && local70 <= local60 && local60 <= local787) {
						return true;
					}
					if (local65 <= local75 && local781 >= local75 && local70 == local60 + 1 && (this.anIntArrayArray33[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local60 - arg5 == local70 && (this.anIntArrayArray33[local75][local787] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 >= local65 && local75 <= local781 && local60 + 1 == local70) {
						return true;
					}
					if (local75 - arg5 == local65 && local70 <= local60 && local787 >= local60 && (this.anIntArrayArray33[local781][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local65 && local70 <= local60 && local787 >= local60 && (this.anIntArrayArray33[local65][local60] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local65 == local75 + 1 && local60 >= local70 && local787 >= local60) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local70 == local60 + 1 && (this.anIntArrayArray33[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local60 - arg5 == local70 && (this.anIntArrayArray33[local75][local787] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local75 >= local65 && local781 >= local75 && local60 - arg5 == local70) {
						return true;
					}
					if (local65 == local75 - arg5 && local70 <= local60 && local60 <= local787 && (this.anIntArrayArray33[local781][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local65 && local70 <= local60 && local60 <= local787 && (this.anIntArrayArray33[local65][local60] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local75 - arg5 == local65 && local60 >= local70 && local60 <= local787) {
						return true;
					}
					if (local75 >= local65 && local781 >= local75 && local60 + 1 == local70) {
						return true;
					}
					if (local75 + 1 == local65 && local70 <= local60 && local787 >= local60 && (this.anIntArrayArray33[local65][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local70 == local60 - arg5 && (this.anIntArrayArray33[local75][local787] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local65 == local75 - arg5 && local60 >= local70 && local60 <= local787 && (this.anIntArrayArray33[local781][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local70 == local60 + 1) {
						return true;
					}
					if (local65 == local75 + 1 && local70 <= local60 && local60 <= local787) {
						return true;
					}
					if (local65 <= local75 && local75 <= local781 && local60 - arg5 == local70 && (this.anIntArrayArray33[local75][local787] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local75 - arg5 == local65 && local60 >= local70 && local60 <= local787 && (this.anIntArrayArray33[local781][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 <= local75 && local781 >= local75 && local70 == local60 + 1 && (this.anIntArrayArray33[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local75 + 1 && local70 <= local60 && local787 >= local60) {
						return true;
					}
					if (local75 >= local65 && local75 <= local781 && local60 - arg5 == local70) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local75 - arg5 == local65 && local70 <= local60 && local787 >= local60) {
						return true;
					}
					if (local65 <= local75 && local781 >= local75 && local70 == local60 + 1 && (this.anIntArrayArray33[local75][local70] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local65 && local70 <= local60 && local60 <= local787 && (this.anIntArrayArray33[local65][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 <= local75 && local75 <= local781 && local70 == local60 - arg5) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local75 >= local65 && local75 <= local781 && local70 == local60 + 1 && (this.anIntArrayArray33[local75][local70] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 >= local65 && local75 <= local781 && local70 == local60 - arg5 && (this.anIntArrayArray33[local75][local787] & 0x2C0102) == 0) {
					return true;
				}
				if (local75 - arg5 == local65 && local70 <= local60 && local60 <= local787 && (this.anIntArrayArray33[local781][local60] & 0x2C0108) == 0) {
					return true;
				}
				if (local65 == local75 + 1 && local70 <= local60 && local787 >= local60 && (this.anIntArrayArray33[local65][local60] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method5903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static559.method7954(arg0, arg2, arg7, arg5, arg3, arg6, arg3, arg4) ? true : this.method5909(arg0, arg3, arg4, arg3, arg1, arg7, arg6, arg5, arg2);
		}
		@Pc(40) int local40 = arg6 + arg5 - 1;
		@Pc(46) int local46 = arg0 + arg7 - 1;
		if (arg5 <= arg2 && arg2 <= local40 && arg4 >= arg7 && arg4 <= local46) {
			return true;
		} else if (arg5 - 1 == arg2 && arg7 <= arg4 && local46 >= arg4 && (this.anIntArrayArray33[arg2 - this.anInt6799][arg4 - this.anInt6790] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg2 == local40 + 1 && arg4 >= arg7 && arg4 <= local46 && (this.anIntArrayArray33[arg2 - this.anInt6799][arg4 - this.anInt6790] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg4 && arg5 <= arg2 && local40 >= arg2 && (this.anIntArrayArray33[arg2 - this.anInt6799][arg4 - this.anInt6790] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local46 + 1 && arg2 >= arg5 && arg2 <= local40 && (this.anIntArrayArray33[arg2 - this.anInt6799][arg4 - this.anInt6790] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)V")
	public void method5904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6790;
		@Pc(25) int local25 = arg1 - this.anInt6799;
		this.anIntArrayArray33[local25][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)V")
	public void method5905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6799;
		@Pc(13) int local13 = arg0 - this.anInt6790;
		this.anIntArrayArray33[local4][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZIBIIZ)V")
	public void method5906(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt6799;
		@Pc(13) int local13 = arg2 - this.anInt6790;
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5900(local13, 128, local4);
				this.method5900(local13, 8, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5900(local13, 2, local4);
				this.method5900(local13 + 1, 32, local4);
			}
			if (arg0 == 2) {
				this.method5900(local13, 8, local4);
				this.method5900(local13, 128, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5900(local13, 32, local4);
				this.method5900(local13 - 1, 2, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5900(local13, 1, local4);
				this.method5900(local13 + 1, 16, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5900(local13, 4, local4);
				this.method5900(local13 + 1, 64, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5900(local13, 16, local4);
				this.method5900(local13 - 1, 1, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5900(local13, 64, local4);
				this.method5900(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg3 == 2) {
			if (arg0 == 0) {
				this.method5900(local13, 130, local4);
				this.method5900(local13, 8, local4 - 1);
				this.method5900(local13 + 1, 32, local4);
			}
			if (arg0 == 1) {
				this.method5900(local13, 10, local4);
				this.method5900(local13 + 1, 32, local4);
				this.method5900(local13, 128, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5900(local13, 40, local4);
				this.method5900(local13, 128, local4 + 1);
				this.method5900(local13 - 1, 2, local4);
			}
			if (arg0 == 3) {
				this.method5900(local13, 160, local4);
				this.method5900(local13 - 1, 2, local4);
				this.method5900(local13, 8, local4 - 1);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					this.method5900(local13, 65536, local4);
					this.method5900(local13, 4096, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5900(local13, 1024, local4);
					this.method5900(local13 + 1, 16384, local4);
				}
				if (arg0 == 2) {
					this.method5900(local13, 4096, local4);
					this.method5900(local13, 65536, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5900(local13, 16384, local4);
					this.method5900(local13 - 1, 1024, local4);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					this.method5900(local13, 512, local4);
					this.method5900(local13 + 1, 8192, local4 - 1);
				}
				if (arg0 == 1) {
					this.method5900(local13, 2048, local4);
					this.method5900(local13 + 1, 32768, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5900(local13, 8192, local4);
					this.method5900(local13 - 1, 512, local4 + 1);
				}
				if (arg0 == 3) {
					this.method5900(local13, 32768, local4);
					this.method5900(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg3 == 2) {
				if (arg0 == 0) {
					this.method5900(local13, 66560, local4);
					this.method5900(local13, 4096, local4 - 1);
					this.method5900(local13 + 1, 16384, local4);
				}
				if (arg0 == 1) {
					this.method5900(local13, 5120, local4);
					this.method5900(local13 + 1, 16384, local4);
					this.method5900(local13, 65536, local4 + 1);
				}
				if (arg0 == 2) {
					this.method5900(local13, 20480, local4);
					this.method5900(local13, 65536, local4 + 1);
					this.method5900(local13 - 1, 1024, local4);
				}
				if (arg0 == 3) {
					this.method5900(local13, 81920, local4);
					this.method5900(local13 - 1, 1024, local4);
					this.method5900(local13, 4096, local4 - 1);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg0 == 0) {
				this.method5900(local13, 536870912, local4);
				this.method5900(local13, 33554432, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5900(local13, 8388608, local4);
				this.method5900(local13 + 1, 134217728, local4);
			}
			if (arg0 == 2) {
				this.method5900(local13, 33554432, local4);
				this.method5900(local13, 536870912, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5900(local13, 134217728, local4);
				this.method5900(local13 - 1, 8388608, local4);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				this.method5900(local13, 4194304, local4);
				this.method5900(local13 + 1, 67108864, local4 - 1);
			}
			if (arg0 == 1) {
				this.method5900(local13, 16777216, local4);
				this.method5900(local13 + 1, 268435456, local4 + 1);
			}
			if (arg0 == 2) {
				this.method5900(local13, 67108864, local4);
				this.method5900(local13 - 1, 4194304, local4 + 1);
			}
			if (arg0 == 3) {
				this.method5900(local13, 268435456, local4);
				this.method5900(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5900(local13, 545259520, local4);
			this.method5900(local13, 33554432, local4 - 1);
			this.method5900(local13 + 1, 134217728, local4);
		}
		if (arg0 == 1) {
			this.method5900(local13, 41943040, local4);
			this.method5900(local13 + 1, 134217728, local4);
			this.method5900(local13, 536870912, local4 + 1);
		}
		if (arg0 == 2) {
			this.method5900(local13, 167772160, local4);
			this.method5900(local13, 536870912, local4 + 1);
			this.method5900(local13 - 1, 8388608, local4);
		}
		if (arg0 == 3) {
			this.method5900(local13, 671088640, local4);
			this.method5900(local13 - 1, 8388608, local4);
			this.method5900(local13, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIB)V")
	private void method5907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray33[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg8 + arg3;
		@Pc(18) int local18 = arg1 + arg2;
		@Pc(22) int local22 = arg6 + arg7;
		@Pc(26) int local26 = arg0 + arg5;
		@Pc(40) int local40;
		@Pc(47) int local47;
		if (local22 == arg8 && (arg4 & 0x2) == 0) {
			local40 = arg2 > arg5 ? arg2 : arg5;
			local47 = local26 > local18 ? local18 : local26;
			while (local40 < local47) {
				if ((this.anIntArrayArray33[local22 - this.anInt6799 - 1][local40 - this.anInt6790] & 0x8) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local14 == arg7 && (arg4 & 0x8) == 0) {
			local40 = arg5 < arg2 ? arg2 : arg5;
			local47 = local26 <= local18 ? local26 : local18;
			while (local40 < local47) {
				if ((this.anIntArrayArray33[arg7 - this.anInt6799][local40 - this.anInt6790] & 0x80) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local26 == arg2 && (arg4 & 0x1) == 0) {
			local40 = arg7 >= arg8 ? arg7 : arg8;
			local47 = local22 <= local14 ? local22 : local14;
			while (local40 < local47) {
				if ((this.anIntArrayArray33[local40 - this.anInt6799][local26 - this.anInt6790 - 1] & 0x2) == 0) {
					return true;
				}
				local40++;
			}
		} else if (local18 == arg5 && (arg4 & 0x4) == 0) {
			local40 = arg7 >= arg8 ? arg7 : arg8;
			local47 = local14 >= local22 ? local22 : local14;
			while (local47 > local40) {
				if ((this.anIntArrayArray33[local40 - this.anInt6799][arg5 - this.anInt6790] & 0x20) == 0) {
					return true;
				}
				local40++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIBI)Z")
	public boolean method5910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg0 && arg5 == arg2) {
				return true;
			}
		} else if (arg3 <= arg0 && arg3 + arg1 - 1 >= arg0 && arg2 <= arg2 && arg2 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(64) int local64 = arg0 - this.anInt6799;
		@Pc(69) int local69 = arg3 - this.anInt6799;
		@Pc(74) int local74 = arg5 - this.anInt6790;
		@Pc(79) int local79 = arg2 - this.anInt6790;
		if (arg1 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local69 == local64 + 1 && local79 == local74 && (this.anIntArrayArray33[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local64 == local69 && local74 == local79 - 1 && (this.anIntArrayArray33[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local69 == local64 - 1 && local74 == local79 && (this.anIntArrayArray33[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local64 == local69 && local74 == local79 - 1 && (this.anIntArrayArray33[local69][local74] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local69 == local64 - 1 && local79 == local74 && (this.anIntArrayArray33[local69][local74] & 0x8) == 0) {
						return true;
					}
					if (local69 == local64 && local79 + 1 == local74 && (this.anIntArrayArray33[local69][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local69 == local64 + 1 && local79 == local74 && (this.anIntArrayArray33[local69][local74] & 0x80) == 0) {
						return true;
					}
					if (local69 == local64 && local74 == local79 + 1 && (this.anIntArrayArray33[local69][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local69 == local64 && local74 == local79 + 1 && (this.anIntArrayArray33[local69][local74] & 0x20) == 0) {
					return true;
				}
				if (local69 == local64 && local79 - 1 == local74 && (this.anIntArrayArray33[local69][local74] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local69 && local79 == local74 && (this.anIntArrayArray33[local69][local74] & 0x8) == 0) {
					return true;
				}
				if (local64 + 1 == local69 && local79 == local74 && (this.anIntArrayArray33[local69][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(434) int local434 = local69 + arg1 - 1;
			@Pc(441) int local441 = local74 + arg1 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local64 + 1 == local69 && local74 <= local79 && local79 <= local441 && (this.anIntArrayArray33[local69][local79] & 0x80) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local434 && local74 == local79 - arg1 && (this.anIntArrayArray33[local64][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local64 - arg1 == local69 && local74 <= local79 && local441 >= local79 && (this.anIntArrayArray33[local434][local79] & 0x8) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local434 && local79 - arg1 == local74 && (this.anIntArrayArray33[local64][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local64 - arg1 == local69 && local74 <= local79 && local441 >= local79 && (this.anIntArrayArray33[local434][local79] & 0x8) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local434 && local79 + 1 == local74 && (this.anIntArrayArray33[local64][local74] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local69 == local64 + 1 && local79 >= local74 && local441 >= local79 && (this.anIntArrayArray33[local69][local79] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local69 && local434 >= local64 && local79 + 1 == local74 && (this.anIntArrayArray33[local64][local74] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local69 <= local64 && local434 >= local64 && local74 == local79 + 1 && (this.anIntArrayArray33[local64][local74] & 0x20) == 0) {
					return true;
				}
				if (local64 >= local69 && local434 >= local64 && local74 == local79 - arg1 && (this.anIntArrayArray33[local64][local441] & 0x2) == 0) {
					return true;
				}
				if (local69 == local64 - arg1 && local74 <= local79 && local441 >= local79 && (this.anIntArrayArray33[local434][local79] & 0x8) == 0) {
					return true;
				}
				if (local64 + 1 == local69 && local79 >= local74 && local441 >= local79 && (this.anIntArrayArray33[local69][local79] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5911() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6796; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt6797; local15++) {
				if (local11 == 0 || local15 == 0 || this.anInt6796 - 5 <= local11 || local15 >= this.anInt6797 - 5) {
					this.anIntArrayArray33[local11][local15] = -1;
				} else {
					this.anIntArrayArray33[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(III)V")
	public void method5912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6790;
		@Pc(13) int local13 = arg1 - this.anInt6799;
		this.anIntArrayArray33[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZZZIII)V")
	public void method5913(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg4 - this.anInt6790;
		@Pc(13) int local13 = arg3 - this.anInt6799;
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method5907(local8, local13, 128);
				this.method5907(local8, local13 - 1, 8);
			}
			if (arg0 == 1) {
				this.method5907(local8, local13, 2);
				this.method5907(local8 + 1, local13, 32);
			}
			if (arg0 == 2) {
				this.method5907(local8, local13, 8);
				this.method5907(local8, local13 + 1, 128);
			}
			if (arg0 == 3) {
				this.method5907(local8, local13, 32);
				this.method5907(local8 - 1, local13, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method5907(local8, local13, 1);
				this.method5907(local8 + 1, local13 + -1, 16);
			}
			if (arg0 == 1) {
				this.method5907(local8, local13, 4);
				this.method5907(local8 + 1, local13 + 1, 64);
			}
			if (arg0 == 2) {
				this.method5907(local8, local13, 16);
				this.method5907(local8 - 1, local13 + 1, 1);
			}
			if (arg0 == 3) {
				this.method5907(local8, local13, 64);
				this.method5907(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				this.method5907(local8, local13, 130);
				this.method5907(local8, local13 - 1, 8);
				this.method5907(local8 + 1, local13, 32);
			}
			if (arg0 == 1) {
				this.method5907(local8, local13, 10);
				this.method5907(local8 + 1, local13, 32);
				this.method5907(local8, local13 + 1, 128);
			}
			if (arg0 == 2) {
				this.method5907(local8, local13, 40);
				this.method5907(local8, local13 + 1, 128);
				this.method5907(local8 - 1, local13, 2);
			}
			if (arg0 == 3) {
				this.method5907(local8, local13, 160);
				this.method5907(local8 - 1, local13, 2);
				this.method5907(local8, local13 - 1, 8);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg0 == 0) {
					this.method5907(local8, local13, 65536);
					this.method5907(local8, local13 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method5907(local8, local13, 1024);
					this.method5907(local8 + 1, local13, 16384);
				}
				if (arg0 == 2) {
					this.method5907(local8, local13, 4096);
					this.method5907(local8, local13 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method5907(local8, local13, 16384);
					this.method5907(local8 - 1, local13, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg0 == 0) {
					this.method5907(local8, local13, 512);
					this.method5907(local8 + 1, local13 - 1, 8192);
				}
				if (arg0 == 1) {
					this.method5907(local8, local13, 2048);
					this.method5907(local8 + 1, local13 - -1, 32768);
				}
				if (arg0 == 2) {
					this.method5907(local8, local13, 8192);
					this.method5907(local8 - 1, local13 + 1, 512);
				}
				if (arg0 == 3) {
					this.method5907(local8, local13, 32768);
					this.method5907(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg0 == 0) {
					this.method5907(local8, local13, 66560);
					this.method5907(local8, local13 - 1, 4096);
					this.method5907(local8 + 1, local13, 16384);
				}
				if (arg0 == 1) {
					this.method5907(local8, local13, 5120);
					this.method5907(local8 + 1, local13, 16384);
					this.method5907(local8, local13 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method5907(local8, local13, 20480);
					this.method5907(local8, local13 + 1, 65536);
					this.method5907(local8 - 1, local13, 1024);
				}
				if (arg0 == 3) {
					this.method5907(local8, local13, 81920);
					this.method5907(local8 - 1, local13, 1024);
					this.method5907(local8, local13 - 1, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg0 == 0) {
				this.method5907(local8, local13, 536870912);
				this.method5907(local8, local13 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method5907(local8, local13, 8388608);
				this.method5907(local8 + 1, local13, 134217728);
			}
			if (arg0 == 2) {
				this.method5907(local8, local13, 33554432);
				this.method5907(local8, local13 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method5907(local8, local13, 134217728);
				this.method5907(local8 - 1, local13, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg0 == 0) {
				this.method5907(local8, local13, 4194304);
				this.method5907(local8 + 1, local13 + -1, 67108864);
			}
			if (arg0 == 1) {
				this.method5907(local8, local13, 16777216);
				this.method5907(local8 + 1, local13 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method5907(local8, local13, 67108864);
				this.method5907(local8 - 1, local13 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method5907(local8, local13, 268435456);
				this.method5907(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method5907(local8, local13, 545259520);
			this.method5907(local8, local13 - 1, 33554432);
			this.method5907(local8 + 1, local13, 134217728);
		}
		if (arg0 == 1) {
			this.method5907(local8, local13, 41943040);
			this.method5907(local8 + 1, local13, 134217728);
			this.method5907(local8, local13 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method5907(local8, local13, 167772160);
			this.method5907(local8, local13 + 1, 536870912);
			this.method5907(local8 - 1, local13, 8388608);
		}
		if (arg0 == 3) {
			this.method5907(local8, local13, 671088640);
			this.method5907(local8 - 1, local13, 8388608);
			this.method5907(local8, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZZIIIII)V")
	public void method5914(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt6799;
		@Pc(35) int local35 = arg5 - this.anInt6790;
		for (@Pc(37) int local37 = local24; local37 < arg2 + local24; local37++) {
			if (local37 >= 0 && this.anInt6796 > local37) {
				for (@Pc(47) int local47 = local35; local47 < arg4 + local35; local47++) {
					if (local47 >= 0 && this.anInt6797 > local47) {
						this.method5900(local47, local7, local37);
					}
				}
			}
		}
	}
}
