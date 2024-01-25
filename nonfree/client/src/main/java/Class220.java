import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class220 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public int anInt6189;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public int anInt6190;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	public int anInt6196;

	static {
		new Class182("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIZIII)V")
	public void method4873(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg4 - this.anInt6189;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg2 - this.anInt6196;
		for (@Pc(43) int local43 = local29; local43 < local29 + arg1; local43++) {
			if (local43 >= 0 && this.anInt6190 > local43) {
				for (@Pc(53) int local53 = local18; local53 < local18 + arg5; local53++) {
					if (local53 >= 0 && this.anInt6177 > local53) {
						this.method4882(local7, local43, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg5 == arg4 && arg3 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg0 + arg5 - 1 >= arg4 && arg3 >= arg3 && arg3 + arg0 - 1 >= arg3) {
			return true;
		}
		@Pc(57) int local57 = arg1 - this.anInt6189;
		@Pc(62) int local62 = arg4 - this.anInt6196;
		@Pc(67) int local67 = arg5 - this.anInt6196;
		@Pc(72) int local72 = arg3 - this.anInt6189;
		if (arg0 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local67 == local62 + 1 && local72 == local57 && (this.anIntArrayArray56[local67][local57] & 0x80) == 0) {
						return true;
					}
					if (local62 == local67 && local57 == local72 - 1 && (this.anIntArrayArray56[local67][local57] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local62 - 1 == local67 && local72 == local57 && (this.anIntArrayArray56[local67][local57] & 0x8) == 0) {
						return true;
					}
					if (local67 == local62 && local57 == local72 - 1 && (this.anIntArrayArray56[local67][local57] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local62 - 1 == local67 && local57 == local72 && (this.anIntArrayArray56[local67][local57] & 0x8) == 0) {
						return true;
					}
					if (local62 == local67 && local57 == local72 + 1 && (this.anIntArrayArray56[local67][local57] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local62 + 1 == local67 && local72 == local57 && (this.anIntArrayArray56[local67][local57] & 0x80) == 0) {
						return true;
					}
					if (local62 == local67 && local57 == local72 + 1 && (this.anIntArrayArray56[local67][local57] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local67 == local62 && local72 + 1 == local57 && (this.anIntArrayArray56[local67][local57] & 0x20) == 0) {
					return true;
				}
				if (local67 == local62 && local57 == local72 - 1 && (this.anIntArrayArray56[local67][local57] & 0x2) == 0) {
					return true;
				}
				if (local67 == local62 - 1 && local72 == local57 && (this.anIntArrayArray56[local67][local57] & 0x8) == 0) {
					return true;
				}
				if (local67 == local62 + 1 && local57 == local72 && (this.anIntArrayArray56[local67][local57] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(81) int local81 = local67 + arg0 - 1;
			@Pc(87) int local87 = local57 + arg0 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray56[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local62 >= local67 && local62 <= local81 && local57 == local72 - arg0 && (this.anIntArrayArray56[local62][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local67 == local62 - arg0 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray56[local81][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local62 && local81 >= local62 && local57 == local72 - arg0 && (this.anIntArrayArray56[local62][local87] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local62 - arg0 == local67 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray56[local81][local72] & 0x8) == 0) {
						return true;
					}
					if (local67 <= local62 && local62 <= local81 && local72 + 1 == local57 && (this.anIntArrayArray56[local62][local57] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray56[local67][local72] & 0x80) == 0) {
						return true;
					}
					if (local67 <= local62 && local81 >= local62 && local72 + 1 == local57 && (this.anIntArrayArray56[local62][local57] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local67 <= local62 && local62 <= local81 && local72 + 1 == local57 && (this.anIntArrayArray56[local62][local57] & 0x20) == 0) {
					return true;
				}
				if (local62 >= local67 && local81 >= local62 && local57 == local72 - arg0 && (this.anIntArrayArray56[local62][local87] & 0x2) == 0) {
					return true;
				}
				if (local62 - arg0 == local67 && local72 >= local57 && local72 <= local87 && (this.anIntArrayArray56[local81][local72] & 0x8) == 0) {
					return true;
				}
				if (local67 == local62 + 1 && local72 >= local57 && local87 >= local72 && (this.anIntArrayArray56[local67][local72] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6189;
		@Pc(13) int local13 = arg1 - this.anInt6196;
		this.anIntArrayArray56[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
	public void method4877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6196;
		@Pc(9) int local9 = arg0 - this.anInt6189;
		this.anIntArrayArray56[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIZIIII)V")
	public void method4878(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt6189;
		@Pc(13) int local13 = arg2 - this.anInt6196;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method4880(128, local8, local13);
				this.method4880(8, local8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method4880(2, local8, local13);
				this.method4880(32, local8 + 1, local13);
			}
			if (arg4 == 2) {
				this.method4880(8, local8, local13);
				this.method4880(128, local8, local13 + 1);
			}
			if (arg4 == 3) {
				this.method4880(32, local8, local13);
				this.method4880(2, local8 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method4880(1, local8, local13);
				this.method4880(16, local8 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method4880(4, local8, local13);
				this.method4880(64, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method4880(16, local8, local13);
				this.method4880(1, local8 - 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method4880(64, local8, local13);
				this.method4880(4, local8 - 1, local13 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method4880(130, local8, local13);
				this.method4880(8, local8, local13 - 1);
				this.method4880(32, local8 + 1, local13);
			}
			if (arg4 == 1) {
				this.method4880(10, local8, local13);
				this.method4880(32, local8 + 1, local13);
				this.method4880(128, local8, local13 + 1);
			}
			if (arg4 == 2) {
				this.method4880(40, local8, local13);
				this.method4880(128, local8, local13 + 1);
				this.method4880(2, local8 - 1, local13);
			}
			if (arg4 == 3) {
				this.method4880(160, local8, local13);
				this.method4880(2, local8 - 1, local13);
				this.method4880(8, local8, local13 - 1);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method4880(65536, local8, local13);
					this.method4880(4096, local8, local13 - 1);
				}
				if (arg4 == 1) {
					this.method4880(1024, local8, local13);
					this.method4880(16384, local8 + 1, local13);
				}
				if (arg4 == 2) {
					this.method4880(4096, local8, local13);
					this.method4880(65536, local8, local13 + 1);
				}
				if (arg4 == 3) {
					this.method4880(16384, local8, local13);
					this.method4880(1024, local8 - 1, local13);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method4880(512, local8, local13);
					this.method4880(8192, local8 + 1, local13 + -1);
				}
				if (arg4 == 1) {
					this.method4880(2048, local8, local13);
					this.method4880(32768, local8 + 1, local13 - -1);
				}
				if (arg4 == 2) {
					this.method4880(8192, local8, local13);
					this.method4880(512, local8 - 1, local13 - -1);
				}
				if (arg4 == 3) {
					this.method4880(32768, local8, local13);
					this.method4880(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method4880(66560, local8, local13);
					this.method4880(4096, local8, local13 - 1);
					this.method4880(16384, local8 + 1, local13);
				}
				if (arg4 == 1) {
					this.method4880(5120, local8, local13);
					this.method4880(16384, local8 + 1, local13);
					this.method4880(65536, local8, local13 + 1);
				}
				if (arg4 == 2) {
					this.method4880(20480, local8, local13);
					this.method4880(65536, local8, local13 + 1);
					this.method4880(1024, local8 - 1, local13);
				}
				if (arg4 == 3) {
					this.method4880(81920, local8, local13);
					this.method4880(1024, local8 - 1, local13);
					this.method4880(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method4880(536870912, local8, local13);
				this.method4880(33554432, local8, local13 - 1);
			}
			if (arg4 == 1) {
				this.method4880(8388608, local8, local13);
				this.method4880(134217728, local8 + 1, local13);
			}
			if (arg4 == 2) {
				this.method4880(33554432, local8, local13);
				this.method4880(536870912, local8, local13 + 1);
			}
			if (arg4 == 3) {
				this.method4880(134217728, local8, local13);
				this.method4880(8388608, local8 - 1, local13);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method4880(4194304, local8, local13);
				this.method4880(67108864, local8 + 1, local13 + -1);
			}
			if (arg4 == 1) {
				this.method4880(16777216, local8, local13);
				this.method4880(268435456, local8 + 1, local13 + 1);
			}
			if (arg4 == 2) {
				this.method4880(67108864, local8, local13);
				this.method4880(4194304, local8 - 1, local13 + 1);
			}
			if (arg4 == 3) {
				this.method4880(268435456, local8, local13);
				this.method4880(16777216, local8 - 1, local13 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4880(545259520, local8, local13);
			this.method4880(33554432, local8, local13 - 1);
			this.method4880(134217728, local8 + 1, local13);
		}
		if (arg4 == 1) {
			this.method4880(41943040, local8, local13);
			this.method4880(134217728, local8 + 1, local13);
			this.method4880(536870912, local8, local13 + 1);
		}
		if (arg4 == 2) {
			this.method4880(167772160, local8, local13);
			this.method4880(536870912, local8, local13 + 1);
			this.method4880(8388608, local8 - 1, local13);
		}
		if (arg4 == 3) {
			this.method4880(671088640, local8, local13);
			this.method4880(8388608, local8 - 1, local13);
			this.method4880(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public void method4879() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6190; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt6177; local13++) {
				if (local7 == 0 || local13 == 0 || local7 >= this.anInt6190 - 5 || this.anInt6177 - 5 <= local13) {
					this.anIntArrayArray56[local7][local13] = -1;
				} else {
					this.anIntArrayArray56[local7][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBII)V")
	private void method4880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method4881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg4 == arg5 && arg0 == arg1) {
				return true;
			}
		} else if (arg4 >= arg5 && arg6 + arg5 - 1 >= arg4 && arg0 >= arg0 && arg0 <= arg0 + arg6 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg4 - this.anInt6196;
		@Pc(75) int local75 = arg5 - this.anInt6196;
		@Pc(80) int local80 = arg1 - this.anInt6189;
		@Pc(85) int local85 = arg0 - this.anInt6189;
		if (arg6 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local75 == local55 - 1 && local80 == local85) {
						return true;
					}
					if (local75 == local55 && local85 + 1 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local55 && local85 - 1 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local75 == local55 && local85 + 1 == local80) {
						return true;
					}
					if (local75 == local55 - 1 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local55 + 1 && local85 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local75 == local55 + 1 && local85 == local80) {
						return true;
					}
					if (local55 == local75 && local85 + 1 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 == local75 && local85 - 1 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local55 == local75 && local80 == local85 - 1) {
						return true;
					}
					if (local55 - 1 == local75 && local85 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local75 == local55 - 1 && local80 == local85) {
						return true;
					}
					if (local55 == local75 && local80 == local85 + 1) {
						return true;
					}
					if (local55 + 1 == local75 && local85 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local55 && local80 == local85 - 1 && (this.anIntArrayArray56[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local75 == local55 - 1 && local85 == local80 && (this.anIntArrayArray56[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 == local75 && local80 == local85 + 1) {
						return true;
					}
					if (local55 + 1 == local75 && local85 == local80) {
						return true;
					}
					if (local75 == local55 && local80 == local85 - 1 && (this.anIntArrayArray56[local75][local80] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local75 == local55 - 1 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 == local75 && local80 == local85 + 1 && (this.anIntArrayArray56[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local85 == local80) {
						return true;
					}
					if (local55 == local75 && local85 - 1 == local80) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local75 == local55 - 1 && local80 == local85) {
						return true;
					}
					if (local55 == local75 && local80 == local85 + 1 && (this.anIntArrayArray56[local75][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local55 && local80 == local85 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local75 == local55 && local80 == local85 + 1 && (this.anIntArrayArray56[local75][local80] & 0x20) == 0) {
					return true;
				}
				if (local75 == local55 && local80 == local85 - 1 && (this.anIntArrayArray56[local75][local80] & 0x2) == 0) {
					return true;
				}
				if (local55 - 1 == local75 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x8) == 0) {
					return true;
				}
				if (local75 == local55 + 1 && local80 == local85 && (this.anIntArrayArray56[local75][local80] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(96) int local96 = local75 + arg6 - 1;
			@Pc(103) int local103 = local80 + arg6 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local75 == local55 - arg6 && local80 <= local85 && local85 <= local103) {
						return true;
					}
					if (local55 >= local75 && local55 <= local96 && local85 + 1 == local80 && (this.anIntArrayArray56[local55][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 >= local75 && local96 >= local55 && local80 == local85 - arg6 && (this.anIntArrayArray56[local55][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local75 <= local55 && local55 <= local96 && local80 == local85 + 1) {
						return true;
					}
					if (local55 - arg6 == local75 && local85 >= local80 && local103 >= local85 && (this.anIntArrayArray56[local96][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local55 + 1 && local85 >= local80 && local103 >= local85 && (this.anIntArrayArray56[local75][local85] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local75 == local55 + 1 && local80 <= local85 && local103 >= local85) {
						return true;
					}
					if (local75 <= local55 && local55 <= local96 && local80 == local85 + 1 && (this.anIntArrayArray56[local55][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 >= local75 && local96 >= local55 && local85 - arg6 == local80 && (this.anIntArrayArray56[local55][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local55 >= local75 && local55 <= local96 && local80 == local85 - arg6) {
						return true;
					}
					if (local75 == local55 - arg6 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local96][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local75][local85] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local55 - arg6 == local75 && local80 <= local85 && local103 >= local85) {
						return true;
					}
					if (local55 >= local75 && local55 <= local96 && local80 == local85 + 1) {
						return true;
					}
					if (local55 + 1 == local75 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local75][local85] & 0x2C0180) == 0) {
						return true;
					}
					if (local55 >= local75 && local55 <= local96 && local80 == local85 - arg6 && (this.anIntArrayArray56[local55][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local55 - arg6 == local75 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local96][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 <= local55 && local96 >= local55 && local85 + 1 == local80) {
						return true;
					}
					if (local75 == local55 + 1 && local80 <= local85 && local85 <= local103) {
						return true;
					}
					if (local75 <= local55 && local55 <= local96 && local80 == local85 - arg6 && (this.anIntArrayArray56[local55][local103] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local75 == local55 - arg6 && local80 <= local85 && local103 >= local85 && (this.anIntArrayArray56[local96][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 <= local55 && local96 >= local55 && local85 + 1 == local80 && (this.anIntArrayArray56[local55][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local80 <= local85 && local103 >= local85) {
						return true;
					}
					if (local55 >= local75 && local55 <= local96 && local85 - arg6 == local80) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local75 == local55 - arg6 && local85 >= local80 && local103 >= local85) {
						return true;
					}
					if (local75 <= local55 && local96 >= local55 && local85 + 1 == local80 && (this.anIntArrayArray56[local55][local80] & 0x2C0120) == 0) {
						return true;
					}
					if (local55 + 1 == local75 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local75][local85] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 <= local55 && local55 <= local96 && local80 == local85 - arg6) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local75 <= local55 && local55 <= local96 && local85 + 1 == local80 && (this.anIntArrayArray56[local55][local80] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 <= local55 && local55 <= local96 && local80 == local85 - arg6 && (this.anIntArrayArray56[local55][local103] & 0x2C0102) == 0) {
					return true;
				}
				if (local55 - arg6 == local75 && local85 >= local80 && local85 <= local103 && (this.anIntArrayArray56[local96][local85] & 0x2C0108) == 0) {
					return true;
				}
				if (local75 == local55 + 1 && local80 <= local85 && local103 >= local85 && (this.anIntArrayArray56[local75][local85] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	private void method4882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray56[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method4884(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt6196;
		@Pc(21) int local21 = arg1 - this.anInt6189;
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method4882(128, local8, local21);
				this.method4882(8, local8 - 1, local21);
			}
			if (arg4 == 1) {
				this.method4882(2, local8, local21);
				this.method4882(32, local8, local21 + 1);
			}
			if (arg4 == 2) {
				this.method4882(8, local8, local21);
				this.method4882(128, local8 + 1, local21);
			}
			if (arg4 == 3) {
				this.method4882(32, local8, local21);
				this.method4882(2, local8, local21 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method4882(1, local8, local21);
				this.method4882(16, local8 - 1, local21 + 1);
			}
			if (arg4 == 1) {
				this.method4882(4, local8, local21);
				this.method4882(64, local8 + 1, local21 + 1);
			}
			if (arg4 == 2) {
				this.method4882(16, local8, local21);
				this.method4882(1, local8 + 1, local21 - 1);
			}
			if (arg4 == 3) {
				this.method4882(64, local8, local21);
				this.method4882(4, local8 - 1, local21 + -1);
			}
		}
		if (arg3 == 2) {
			if (arg4 == 0) {
				this.method4882(130, local8, local21);
				this.method4882(8, local8 - 1, local21);
				this.method4882(32, local8, local21 + 1);
			}
			if (arg4 == 1) {
				this.method4882(10, local8, local21);
				this.method4882(32, local8, local21 + 1);
				this.method4882(128, local8 + 1, local21);
			}
			if (arg4 == 2) {
				this.method4882(40, local8, local21);
				this.method4882(128, local8 + 1, local21);
				this.method4882(2, local8, local21 - 1);
			}
			if (arg4 == 3) {
				this.method4882(160, local8, local21);
				this.method4882(2, local8, local21 - 1);
				this.method4882(8, local8 - 1, local21);
			}
		}
		if (arg5) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					this.method4882(65536, local8, local21);
					this.method4882(4096, local8 - 1, local21);
				}
				if (arg4 == 1) {
					this.method4882(1024, local8, local21);
					this.method4882(16384, local8, local21 + 1);
				}
				if (arg4 == 2) {
					this.method4882(4096, local8, local21);
					this.method4882(65536, local8 + 1, local21);
				}
				if (arg4 == 3) {
					this.method4882(16384, local8, local21);
					this.method4882(1024, local8, local21 - 1);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					this.method4882(512, local8, local21);
					this.method4882(8192, local8 - 1, local21 + 1);
				}
				if (arg4 == 1) {
					this.method4882(2048, local8, local21);
					this.method4882(32768, local8 + 1, local21 - -1);
				}
				if (arg4 == 2) {
					this.method4882(8192, local8, local21);
					this.method4882(512, local8 + 1, local21 + -1);
				}
				if (arg4 == 3) {
					this.method4882(32768, local8, local21);
					this.method4882(2048, local8 - 1, local21 + -1);
				}
			}
			if (arg3 == 2) {
				if (arg4 == 0) {
					this.method4882(66560, local8, local21);
					this.method4882(4096, local8 - 1, local21);
					this.method4882(16384, local8, local21 + 1);
				}
				if (arg4 == 1) {
					this.method4882(5120, local8, local21);
					this.method4882(16384, local8, local21 + 1);
					this.method4882(65536, local8 + 1, local21);
				}
				if (arg4 == 2) {
					this.method4882(20480, local8, local21);
					this.method4882(65536, local8 + 1, local21);
					this.method4882(1024, local8, local21 - 1);
				}
				if (arg4 == 3) {
					this.method4882(81920, local8, local21);
					this.method4882(1024, local8, local21 - 1);
					this.method4882(4096, local8 - 1, local21);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg3 == 0) {
			if (arg4 == 0) {
				this.method4882(536870912, local8, local21);
				this.method4882(33554432, local8 - 1, local21);
			}
			if (arg4 == 1) {
				this.method4882(8388608, local8, local21);
				this.method4882(134217728, local8, local21 + 1);
			}
			if (arg4 == 2) {
				this.method4882(33554432, local8, local21);
				this.method4882(536870912, local8 + 1, local21);
			}
			if (arg4 == 3) {
				this.method4882(134217728, local8, local21);
				this.method4882(8388608, local8, local21 - 1);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				this.method4882(4194304, local8, local21);
				this.method4882(67108864, local8 - 1, local21 + 1);
			}
			if (arg4 == 1) {
				this.method4882(16777216, local8, local21);
				this.method4882(268435456, local8 + 1, local21 - -1);
			}
			if (arg4 == 2) {
				this.method4882(67108864, local8, local21);
				this.method4882(4194304, local8 + 1, local21 - 1);
			}
			if (arg4 == 3) {
				this.method4882(268435456, local8, local21);
				this.method4882(16777216, local8 - 1, local21 + -1);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method4882(545259520, local8, local21);
			this.method4882(33554432, local8 - 1, local21);
			this.method4882(134217728, local8, local21 + 1);
		}
		if (arg4 == 1) {
			this.method4882(41943040, local8, local21);
			this.method4882(134217728, local8, local21 + 1);
			this.method4882(536870912, local8 + 1, local21);
		}
		if (arg4 == 2) {
			this.method4882(167772160, local8, local21);
			this.method4882(536870912, local8 + 1, local21);
			this.method4882(8388608, local8, local21 - 1);
		}
		if (arg4 == 3) {
			this.method4882(671088640, local8, local21);
			this.method4882(8388608, local8, local21 - 1);
			this.method4882(33554432, local8 - 1, local21);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method4885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg1 + arg7;
		@Pc(18) int local18 = arg8 + arg6;
		@Pc(22) int local22 = arg5 + arg0;
		@Pc(26) int local26 = arg4 + arg2;
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (local22 == arg7 && (arg3 & 0x2) == 0) {
			local54 = arg2 < arg6 ? arg6 : arg2;
			local61 = local26 <= local18 ? local26 : local18;
			while (local61 > local54) {
				if ((this.anIntArrayArray56[local22 - this.anInt6196 - 1][local54 - this.anInt6189] & 0x8) == 0) {
					return true;
				}
				local54++;
			}
		} else if (arg0 == local14 && (arg3 & 0x8) == 0) {
			local54 = arg6 <= arg2 ? arg2 : arg6;
			local61 = local26 <= local18 ? local26 : local18;
			while (local54 < local61) {
				if ((this.anIntArrayArray56[arg0 - this.anInt6196][local54 - this.anInt6189] & 0x80) == 0) {
					return true;
				}
				local54++;
			}
		} else if (local26 == arg6 && (arg3 & 0x1) == 0) {
			local54 = arg7 <= arg0 ? arg0 : arg7;
			local61 = local14 < local22 ? local14 : local22;
			while (local54 < local61) {
				if ((this.anIntArrayArray56[local54 - this.anInt6196][local26 - this.anInt6189 - 1] & 0x2) == 0) {
					return true;
				}
				local54++;
			}
		} else if (local18 == arg2 && (arg3 & 0x4) == 0) {
			local54 = arg0 < arg7 ? arg7 : arg0;
			local61 = local22 <= local14 ? local22 : local14;
			while (local61 > local54) {
				if ((this.anIntArrayArray56[local54 - this.anInt6196][arg2 - this.anInt6189] & 0x20) == 0) {
					return true;
				}
				local54++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZZIII)V")
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt6189;
		@Pc(23) int local23 = arg5 - this.anInt6196;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(37) int local37;
		if (arg1 == 1 || arg1 == 3) {
			local37 = arg6;
			arg6 = arg0;
			arg0 = local37;
		}
		for (local37 = local23; local37 < arg6 + local23; local37++) {
			if (local37 >= 0 && local37 < this.anInt6190) {
				for (@Pc(57) int local57 = local18; local57 < arg0 + local18; local57++) {
					if (local57 >= 0 && this.anInt6177 > local57) {
						this.method4880(local7, local57, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V")
	public void method4888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6196;
		@Pc(9) int local9 = arg0 - this.anInt6189;
		this.anIntArrayArray56[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZIIIII)Z")
	public boolean method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static43.method655(arg7, arg2, arg3, arg1, arg4, arg4, arg5, arg6) ? true : this.method4885(arg7, arg4, arg6, arg0, arg2, arg5, arg3, arg1, arg4);
		}
		@Pc(38) int local38 = arg5 + arg7 - 1;
		@Pc(44) int local44 = arg6 + arg2 - 1;
		if (arg1 >= arg7 && arg1 <= local38 && arg6 <= arg3 && arg3 <= local44) {
			return true;
		} else if (arg7 - 1 == arg1 && arg3 >= arg6 && local44 >= arg3 && (this.anIntArrayArray56[arg1 - this.anInt6196][arg3 - this.anInt6189] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg1 == local38 + 1 && arg3 >= arg6 && arg3 <= local44 && (this.anIntArrayArray56[arg1 - this.anInt6196][arg3 - this.anInt6189] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 - 1 == arg3 && arg1 >= arg7 && local38 >= arg1 && (this.anIntArrayArray56[arg1 - this.anInt6196][arg3 - this.anInt6189] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg3 && arg1 >= arg7 && local38 >= arg1 && (this.anIntArrayArray56[arg1 - this.anInt6196][arg3 - this.anInt6189] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6196;
		@Pc(13) int local13 = arg1 - this.anInt6189;
		this.anIntArrayArray56[local8][local13] &= 0xFFFBFFFF;
	}
}
