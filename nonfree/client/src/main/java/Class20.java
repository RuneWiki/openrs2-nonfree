import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class20 {

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	private final int anInt698 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	private final int anInt694;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	private final int anInt696;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	private final int anInt686;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt694 = arg0;
		this.anInt696 = 0;
		this.anInt686 = arg1;
		this.anIntArrayArray8 = new int[this.anInt694][this.anInt686];
		this.method446();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIBZ)V")
	public void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg3 - this.anInt698;
		@Pc(13) int local13 = arg1 - this.anInt696;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method438(128, local13, local8);
				this.method438(8, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method438(2, local13, local8);
				this.method438(32, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method438(8, local13, local8);
				this.method438(128, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method438(32, local13, local8);
				this.method438(2, local13 - 1, local8);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method438(1, local13, local8);
				this.method438(16, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method438(4, local13, local8);
				this.method438(64, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method438(16, local13, local8);
				this.method438(1, local13 - 1, local8 + 1);
			}
			if (arg2 == 3) {
				this.method438(64, local13, local8);
				this.method438(4, local13 - 1, local8 + -1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method438(130, local13, local8);
				this.method438(8, local13, local8 - 1);
				this.method438(32, local13 + 1, local8);
			}
			if (arg2 == 1) {
				this.method438(10, local13, local8);
				this.method438(32, local13 + 1, local8);
				this.method438(128, local13, local8 + 1);
			}
			if (arg2 == 2) {
				this.method438(40, local13, local8);
				this.method438(128, local13, local8 + 1);
				this.method438(2, local13 - 1, local8);
			}
			if (arg2 == 3) {
				this.method438(160, local13, local8);
				this.method438(2, local13 - 1, local8);
				this.method438(8, local13, local8 - 1);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method438(65536, local13, local8);
				this.method438(4096, local13, local8 - 1);
			}
			if (arg2 == 1) {
				this.method438(1024, local13, local8);
				this.method438(16384, local13 + 1, local8);
			}
			if (arg2 == 2) {
				this.method438(4096, local13, local8);
				this.method438(65536, local13, local8 + 1);
			}
			if (arg2 == 3) {
				this.method438(16384, local13, local8);
				this.method438(1024, local13 - 1, local8);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method438(512, local13, local8);
				this.method438(8192, local13 + 1, local8 + -1);
			}
			if (arg2 == 1) {
				this.method438(2048, local13, local8);
				this.method438(32768, local13 + 1, local8 + 1);
			}
			if (arg2 == 2) {
				this.method438(8192, local13, local8);
				this.method438(512, local13 - 1, local8 - -1);
			}
			if (arg2 == 3) {
				this.method438(32768, local13, local8);
				this.method438(2048, local13 - 1, local8 + -1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method438(66560, local13, local8);
			this.method438(4096, local13, local8 - 1);
			this.method438(16384, local13 + 1, local8);
		}
		if (arg2 == 1) {
			this.method438(5120, local13, local8);
			this.method438(16384, local13 + 1, local8);
			this.method438(65536, local13, local8 + 1);
		}
		if (arg2 == 2) {
			this.method438(20480, local13, local8);
			this.method438(65536, local13, local8 + 1);
			this.method438(1024, local13 - 1, local8);
		}
		if (arg2 == 3) {
			this.method438(81920, local13, local8);
			this.method438(1024, local13 - 1, local8);
			this.method438(4096, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIZ)V")
	public void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) int local6 = arg1 - this.anInt698;
		@Pc(25) int local25;
		if (arg2 == 1 || arg2 == 3) {
			local25 = arg4;
			arg4 = arg0;
			arg0 = local25;
		}
		@Pc(34) int local34 = arg3 - this.anInt696;
		@Pc(36) int local36 = 256;
		if (arg5) {
			local36 = 131328;
		}
		for (local25 = local6; local25 < local6 + arg4; local25++) {
			if (local25 >= 0 && local25 < this.anInt694) {
				for (@Pc(58) int local58 = local34; local58 < arg0 + local34; local58++) {
					if (local58 >= 0 && local58 < this.anInt686) {
						this.method438(local36, local58, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public void method434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt698;
		@Pc(13) int local13 = arg0 - this.anInt696;
		this.anIntArrayArray8[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIIZII)V")
	public void method435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = 256;
		@Pc(24) int local24 = arg4 - this.anInt696;
		@Pc(29) int local29 = arg1 - this.anInt698;
		if (arg2) {
			local19 = 131328;
		}
		for (@Pc(37) int local37 = local29; local37 < arg3 + local29; local37++) {
			if (local37 >= 0 && local37 < this.anInt694) {
				for (@Pc(54) int local54 = local24; local54 < arg0 + local24; local54++) {
					if (local54 >= 0 && this.anInt686 > local54) {
						this.method443(local37, local19, local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	private void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray8[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBIII)Z")
	public boolean method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg1 && arg2 == arg0) {
			return true;
		}
		@Pc(16) int local16 = arg0 - this.anInt696;
		@Pc(21) int local21 = arg5 - this.anInt698;
		@Pc(26) int local26 = arg2 - this.anInt696;
		@Pc(31) int local31 = arg1 - this.anInt698;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}
			if (arg3 == 0) {
				if (local21 + 1 == local31 && local16 == local26 && (this.anIntArrayArray8[local31][local16] & 0x80) == 0) {
					return true;
				}
				if (local21 == local31 && local26 - 1 == local16 && (this.anIntArrayArray8[local31][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (local21 - 1 == local31 && local16 == local26 && (this.anIntArrayArray8[local31][local16] & 0x8) == 0) {
					return true;
				}
				if (local31 == local21 && local26 - 1 == local16 && (this.anIntArrayArray8[local31][local16] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (local31 == local21 - 1 && local26 == local16 && (this.anIntArrayArray8[local31][local16] & 0x8) == 0) {
					return true;
				}
				if (local21 == local31 && local16 == local26 + 1 && (this.anIntArrayArray8[local31][local16] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (local31 == local21 + 1 && local16 == local26 && (this.anIntArrayArray8[local31][local16] & 0x80) == 0) {
					return true;
				}
				if (local31 == local21 && local16 == local26 + 1 && (this.anIntArrayArray8[local31][local16] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (arg4 == 8) {
			if (local31 == local21 && local16 == local26 + 1 && (this.anIntArrayArray8[local31][local16] & 0x20) == 0) {
				return true;
			}
			if (local21 == local31 && local26 - 1 == local16 && (this.anIntArrayArray8[local31][local16] & 0x2) == 0) {
				return true;
			}
			if (local31 == local21 - 1 && local16 == local26 && (this.anIntArrayArray8[local31][local16] & 0x8) == 0) {
				return true;
			}
			if (local31 == local21 + 1 && local26 == local16 && (this.anIntArrayArray8[local31][local16] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	public void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt698;
		@Pc(13) int local13 = arg0 - this.anInt696;
		this.anIntArrayArray8[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIIBIII)Z")
	public boolean method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == arg4 && arg0 == arg3) {
			return true;
		}
		@Pc(20) int local20 = arg0 - this.anInt696;
		@Pc(25) int local25 = arg4 - this.anInt698;
		@Pc(30) int local30 = arg1 - this.anInt698;
		@Pc(40) int local40 = arg3 - this.anInt696;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (local25 - 1 == local30 && local40 == local20) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local25 && local40 == local20 - 1 && (this.anIntArrayArray8[local30][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local30 == local25 && local40 == local20 + 1) {
					return true;
				}
				if (local30 == local25 - 1 && local40 == local20 && (this.anIntArrayArray8[local30][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 + 1 == local30 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local25 + 1 == local30 && local40 == local20) {
					return true;
				}
				if (local25 == local30 && local20 + 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local25 == local30 && local40 == local20 - 1 && (this.anIntArrayArray8[local30][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local25 == local30 && local40 == local20 - 1) {
					return true;
				}
				if (local30 == local25 - 1 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 + 1 == local30 && local40 == local20 && (this.anIntArrayArray8[local30][local40] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		if (arg2 == 2) {
			if (arg5 == 0) {
				if (local25 - 1 == local30 && local40 == local20) {
					return true;
				}
				if (local25 == local30 && local40 == local20 + 1) {
					return true;
				}
				if (local25 + 1 == local30 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local25 == local30 && local40 == local20 - 1 && (this.anIntArrayArray8[local30][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (local30 == local25 - 1 && local40 == local20 && (this.anIntArrayArray8[local30][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local25 == local30 && local40 == local20 + 1) {
					return true;
				}
				if (local25 + 1 == local30 && local20 == local40) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (local30 == local25 - 1 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0108) == 0) {
					return true;
				}
				if (local30 == local25 && local20 + 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local25 + 1 && local20 == local40) {
					return true;
				}
				if (local25 == local30 && local40 == local20 - 1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (local25 - 1 == local30 && local20 == local40) {
					return true;
				}
				if (local25 == local30 && local40 == local20 + 1 && (this.anIntArrayArray8[local30][local40] & 0x12C0120) == 0) {
					return true;
				}
				if (local30 == local25 + 1 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x12C0180) == 0) {
					return true;
				}
				if (local30 == local25 && local20 - 1 == local40) {
					return true;
				}
			}
		}
		if (arg2 == 9) {
			if (local30 == local25 && local20 + 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x20) == 0) {
				return true;
			}
			if (local25 == local30 && local20 - 1 == local40 && (this.anIntArrayArray8[local30][local40] & 0x2) == 0) {
				return true;
			}
			if (local30 == local25 - 1 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x8) == 0) {
				return true;
			}
			if (local30 == local25 + 1 && local20 == local40 && (this.anIntArrayArray8[local30][local40] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIII)V")
	private void method443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray8[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
	public void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt698;
		@Pc(9) int local9 = arg0 - this.anInt696;
		this.anIntArrayArray8[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIZ)Z")
	public boolean method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg1 + arg4 - 1;
		@Pc(20) int local20 = arg3 + arg5 - 1;
		if (arg0 >= arg4 && arg0 <= local10 && arg5 <= arg6 && local20 >= arg6) {
			return true;
		} else if (arg4 - 1 == arg0 && arg6 >= arg5 && arg6 <= local20 && (this.anIntArrayArray8[arg0 - this.anInt698][arg6 - this.anInt696] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg0 == local10 + 1 && arg5 <= arg6 && arg6 <= local20 && (this.anIntArrayArray8[arg0 - this.anInt698][arg6 - this.anInt696] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg5 - 1 == arg6 && arg0 >= arg4 && arg0 <= local10 && (this.anIntArrayArray8[arg0 - this.anInt698][arg6 - this.anInt696] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return arg6 == local20 + 1 && arg0 >= arg4 && local10 >= arg0 && (this.anIntArrayArray8[arg0 - this.anInt698][arg6 - this.anInt696] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public void method446() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt694; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt686; local16++) {
				if (local12 == 0 || local16 == 0 || local12 >= this.anInt694 - 5 || local16 >= this.anInt686 - 5) {
					this.anIntArrayArray8[local12][local16] = 16777215;
				} else {
					this.anIntArrayArray8[local12][local16] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZIII)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 - this.anInt698;
		@Pc(13) int local13 = arg0 - this.anInt696;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method443(local8, 128, local13);
				this.method443(local8 - 1, 8, local13);
			}
			if (arg1 == 1) {
				this.method443(local8, 2, local13);
				this.method443(local8, 32, local13 + 1);
			}
			if (arg1 == 2) {
				this.method443(local8, 8, local13);
				this.method443(local8 + 1, 128, local13);
			}
			if (arg1 == 3) {
				this.method443(local8, 32, local13);
				this.method443(local8, 2, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method443(local8, 1, local13);
				this.method443(local8 - 1, 16, local13 + 1);
			}
			if (arg1 == 1) {
				this.method443(local8, 4, local13);
				this.method443(local8 + 1, 64, local13 + 1);
			}
			if (arg1 == 2) {
				this.method443(local8, 16, local13);
				this.method443(local8 + 1, 1, local13 - 1);
			}
			if (arg1 == 3) {
				this.method443(local8, 64, local13);
				this.method443(local8 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method443(local8, 130, local13);
				this.method443(local8 - 1, 8, local13);
				this.method443(local8, 32, local13 + 1);
			}
			if (arg1 == 1) {
				this.method443(local8, 10, local13);
				this.method443(local8, 32, local13 + 1);
				this.method443(local8 + 1, 128, local13);
			}
			if (arg1 == 2) {
				this.method443(local8, 40, local13);
				this.method443(local8 + 1, 128, local13);
				this.method443(local8, 2, local13 - 1);
			}
			if (arg1 == 3) {
				this.method443(local8, 160, local13);
				this.method443(local8, 2, local13 - 1);
				this.method443(local8 - 1, 8, local13);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method443(local8, 65536, local13);
				this.method443(local8 - 1, 4096, local13);
			}
			if (arg1 == 1) {
				this.method443(local8, 1024, local13);
				this.method443(local8, 16384, local13 + 1);
			}
			if (arg1 == 2) {
				this.method443(local8, 4096, local13);
				this.method443(local8 + 1, 65536, local13);
			}
			if (arg1 == 3) {
				this.method443(local8, 16384, local13);
				this.method443(local8, 1024, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method443(local8, 512, local13);
				this.method443(local8 - 1, 8192, local13 + 1);
			}
			if (arg1 == 1) {
				this.method443(local8, 2048, local13);
				this.method443(local8 + 1, 32768, local13 + 1);
			}
			if (arg1 == 2) {
				this.method443(local8, 8192, local13);
				this.method443(local8 + 1, 512, local13 - 1);
			}
			if (arg1 == 3) {
				this.method443(local8, 32768, local13);
				this.method443(local8 - 1, 2048, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method443(local8, 66560, local13);
			this.method443(local8 - 1, 4096, local13);
			this.method443(local8, 16384, local13 + 1);
		}
		if (arg1 == 1) {
			this.method443(local8, 5120, local13);
			this.method443(local8, 16384, local13 + 1);
			this.method443(local8 + 1, 65536, local13);
		}
		if (arg1 == 2) {
			this.method443(local8, 20480, local13);
			this.method443(local8 + 1, 65536, local13);
			this.method443(local8, 1024, local13 - 1);
		}
		if (arg1 == 3) {
			this.method443(local8, 81920, local13);
			this.method443(local8, 1024, local13 - 1);
			this.method443(local8 - 1, 4096, local13);
			return;
		}
	}
}
