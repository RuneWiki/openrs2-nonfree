import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class24 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	public void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - this.anInt543;
		@Pc(12) int local12 = arg1 - this.anInt542;
		this.anIntArrayArray15[local7][local12] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg4 == arg5 && arg6 == arg0) {
				return true;
			}
		} else if (arg5 <= arg4 && arg5 + arg2 - 1 >= arg4 && arg0 >= arg0 && arg0 <= arg2 + arg0 - 1) {
			return true;
		}
		@Pc(52) int local52 = arg5 - this.anInt543;
		@Pc(61) int local61 = arg0 - this.anInt542;
		@Pc(66) int local66 = arg4 - this.anInt543;
		@Pc(71) int local71 = arg6 - this.anInt542;
		if (arg2 == 1) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local52 == local66 - 1 && local71 == local61) {
						return true;
					}
					if (local66 == local52 && local71 == local61 + 1 && (this.anIntArrayArray15[local52][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local52 && local61 - 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local52 && local61 + 1 == local71) {
						return true;
					}
					if (local66 - 1 == local52 && local71 == local61 && (this.anIntArrayArray15[local52][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local52 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 + 1 == local52 && local71 == local61) {
						return true;
					}
					if (local52 == local66 && local61 + 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local66 && local61 - 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 == local52 && local71 == local61 - 1) {
						return true;
					}
					if (local52 == local66 - 1 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local66 + 1 && local71 == local61 && (this.anIntArrayArray15[local52][local71] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local66 - 1 == local52 && local61 == local71) {
						return true;
					}
					if (local66 == local52 && local61 + 1 == local71) {
						return true;
					}
					if (local52 == local66 + 1 && local71 == local61 && (this.anIntArrayArray15[local52][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local52 && local61 - 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 - 1 == local52 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local52 && local71 == local61 + 1) {
						return true;
					}
					if (local52 == local66 + 1 && local61 == local71) {
						return true;
					}
					if (local52 == local66 && local61 - 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 - 1 == local52 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local52 && local71 == local61 + 1 && (this.anIntArrayArray15[local52][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local66 + 1 && local61 == local71) {
						return true;
					}
					if (local66 == local52 && local61 - 1 == local71) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local52 == local66 - 1 && local71 == local61) {
						return true;
					}
					if (local52 == local66 && local71 == local61 + 1 && (this.anIntArrayArray15[local52][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 == local66 + 1 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2C0180) == 0) {
						return true;
					}
					if (local52 == local66 && local61 - 1 == local71) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local52 == local66 && local61 + 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x20) == 0) {
					return true;
				}
				if (local66 == local52 && local61 - 1 == local71 && (this.anIntArrayArray15[local52][local71] & 0x2) == 0) {
					return true;
				}
				if (local52 == local66 - 1 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x8) == 0) {
					return true;
				}
				if (local52 == local66 + 1 && local61 == local71 && (this.anIntArrayArray15[local52][local71] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(763) int local763 = local52 + arg2 - 1;
			@Pc(769) int local769 = local71 + arg2 - 1;
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local66 - arg2 == local52 && local61 >= local71 && local769 >= local61) {
						return true;
					}
					if (local52 <= local66 && local763 >= local66 && local61 + 1 == local71 && (this.anIntArrayArray15[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 >= local52 && local66 <= local763 && local71 == local61 - arg2 && (this.anIntArrayArray15[local66][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local52 <= local66 && local763 >= local66 && local61 + 1 == local71) {
						return true;
					}
					if (local52 == local66 - arg2 && local71 <= local61 && local61 <= local769 && (this.anIntArrayArray15[local763][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local52 && local61 >= local71 && local769 >= local61 && (this.anIntArrayArray15[local52][local61] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local52 == local66 + 1 && local71 <= local61 && local769 >= local61) {
						return true;
					}
					if (local66 >= local52 && local66 <= local763 && local61 + 1 == local71 && (this.anIntArrayArray15[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local52 <= local66 && local66 <= local763 && local61 - arg2 == local71 && (this.anIntArrayArray15[local66][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local52 <= local66 && local763 >= local66 && local61 - arg2 == local71) {
						return true;
					}
					if (local52 == local66 - arg2 && local71 <= local61 && local769 >= local61 && (this.anIntArrayArray15[local763][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 == local66 + 1 && local71 <= local61 && local769 >= local61 && (this.anIntArrayArray15[local52][local61] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local66 - arg2 == local52 && local61 >= local71 && local769 >= local61) {
						return true;
					}
					if (local66 >= local52 && local763 >= local66 && local61 + 1 == local71) {
						return true;
					}
					if (local66 + 1 == local52 && local71 <= local61 && local769 >= local61 && (this.anIntArrayArray15[local52][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local52 <= local66 && local66 <= local763 && local71 == local61 - arg2 && (this.anIntArrayArray15[local66][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local52 == local66 - arg2 && local61 >= local71 && local769 >= local61 && (this.anIntArrayArray15[local763][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local52 <= local66 && local66 <= local763 && local71 == local61 + 1) {
						return true;
					}
					if (local66 + 1 == local52 && local61 >= local71 && local769 >= local61) {
						return true;
					}
					if (local52 <= local66 && local66 <= local763 && local61 - arg2 == local71 && (this.anIntArrayArray15[local66][local769] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 - arg2 == local52 && local61 >= local71 && local61 <= local769 && (this.anIntArrayArray15[local763][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 >= local52 && local763 >= local66 && local71 == local61 + 1 && (this.anIntArrayArray15[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local52 && local61 >= local71 && local61 <= local769) {
						return true;
					}
					if (local66 >= local52 && local66 <= local763 && local71 == local61 - arg2) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 - arg2 == local52 && local61 >= local71 && local769 >= local61) {
						return true;
					}
					if (local52 <= local66 && local763 >= local66 && local61 + 1 == local71 && (this.anIntArrayArray15[local66][local71] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local52 && local61 >= local71 && local769 >= local61 && (this.anIntArrayArray15[local52][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local52 && local763 >= local66 && local71 == local61 - arg2) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local66 >= local52 && local66 <= local763 && local61 + 1 == local71 && (this.anIntArrayArray15[local66][local71] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 >= local52 && local763 >= local66 && local71 == local61 - arg2 && (this.anIntArrayArray15[local66][local769] & 0x2C0102) == 0) {
					return true;
				}
				if (local52 == local66 - arg2 && local71 <= local61 && local61 <= local769 && (this.anIntArrayArray15[local763][local61] & 0x2C0108) == 0) {
					return true;
				}
				if (local66 + 1 == local52 && local61 >= local71 && local61 <= local769 && (this.anIntArrayArray15[local52][local61] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIZIIB)V")
	public void method482(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt542;
		@Pc(13) int local13 = arg5 - this.anInt543;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method489(local13, 128, local8);
				this.method489(local13 - 1, 8, local8);
			}
			if (arg4 == 1) {
				this.method489(local13, 2, local8);
				this.method489(local13, 32, local8 + 1);
			}
			if (arg4 == 2) {
				this.method489(local13, 8, local8);
				this.method489(local13 + 1, 128, local8);
			}
			if (arg4 == 3) {
				this.method489(local13, 32, local8);
				this.method489(local13, 2, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method489(local13, 1, local8);
				this.method489(local13 - 1, 16, local8 + 1);
			}
			if (arg4 == 1) {
				this.method489(local13, 4, local8);
				this.method489(local13 + 1, 64, local8 + 1);
			}
			if (arg4 == 2) {
				this.method489(local13, 16, local8);
				this.method489(local13 + 1, 1, local8 - 1);
			}
			if (arg4 == 3) {
				this.method489(local13, 64, local8);
				this.method489(local13 - 1, 4, local8 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method489(local13, 130, local8);
				this.method489(local13 - 1, 8, local8);
				this.method489(local13, 32, local8 + 1);
			}
			if (arg4 == 1) {
				this.method489(local13, 10, local8);
				this.method489(local13, 32, local8 + 1);
				this.method489(local13 + 1, 128, local8);
			}
			if (arg4 == 2) {
				this.method489(local13, 40, local8);
				this.method489(local13 + 1, 128, local8);
				this.method489(local13, 2, local8 - 1);
			}
			if (arg4 == 3) {
				this.method489(local13, 160, local8);
				this.method489(local13, 2, local8 - 1);
				this.method489(local13 - 1, 8, local8);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method489(local13, 65536, local8);
					this.method489(local13 - 1, 4096, local8);
				}
				if (arg4 == 1) {
					this.method489(local13, 1024, local8);
					this.method489(local13, 16384, local8 + 1);
				}
				if (arg4 == 2) {
					this.method489(local13, 4096, local8);
					this.method489(local13 + 1, 65536, local8);
				}
				if (arg4 == 3) {
					this.method489(local13, 16384, local8);
					this.method489(local13, 1024, local8 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method489(local13, 512, local8);
					this.method489(local13 - 1, 8192, local8 + 1);
				}
				if (arg4 == 1) {
					this.method489(local13, 2048, local8);
					this.method489(local13 + 1, 32768, local8 + 1);
				}
				if (arg4 == 2) {
					this.method489(local13, 8192, local8);
					this.method489(local13 + 1, 512, local8 - 1);
				}
				if (arg4 == 3) {
					this.method489(local13, 32768, local8);
					this.method489(local13 - 1, 2048, local8 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method489(local13, 66560, local8);
					this.method489(local13 - 1, 4096, local8);
					this.method489(local13, 16384, local8 + 1);
				}
				if (arg4 == 1) {
					this.method489(local13, 5120, local8);
					this.method489(local13, 16384, local8 + 1);
					this.method489(local13 + 1, 65536, local8);
				}
				if (arg4 == 2) {
					this.method489(local13, 20480, local8);
					this.method489(local13 + 1, 65536, local8);
					this.method489(local13, 1024, local8 - 1);
				}
				if (arg4 == 3) {
					this.method489(local13, 81920, local8);
					this.method489(local13, 1024, local8 - 1);
					this.method489(local13 - 1, 4096, local8);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method489(local13, 536870912, local8);
				this.method489(local13 - 1, 33554432, local8);
			}
			if (arg4 == 1) {
				this.method489(local13, 8388608, local8);
				this.method489(local13, 134217728, local8 + 1);
			}
			if (arg4 == 2) {
				this.method489(local13, 33554432, local8);
				this.method489(local13 + 1, 536870912, local8);
			}
			if (arg4 == 3) {
				this.method489(local13, 134217728, local8);
				this.method489(local13, 8388608, local8 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method489(local13, 4194304, local8);
				this.method489(local13 - 1, 67108864, local8 + 1);
			}
			if (arg4 == 1) {
				this.method489(local13, 16777216, local8);
				this.method489(local13 + 1, 268435456, local8 + 1);
			}
			if (arg4 == 2) {
				this.method489(local13, 67108864, local8);
				this.method489(local13 + 1, 4194304, local8 - 1);
			}
			if (arg4 == 3) {
				this.method489(local13, 268435456, local8);
				this.method489(local13 - 1, 16777216, local8 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method489(local13, 545259520, local8);
			this.method489(local13 - 1, 33554432, local8);
			this.method489(local13, 134217728, local8 + 1);
		}
		if (arg4 == 1) {
			this.method489(local13, 41943040, local8);
			this.method489(local13, 134217728, local8 + 1);
			this.method489(local13 + 1, 536870912, local8);
		}
		if (arg4 == 2) {
			this.method489(local13, 167772160, local8);
			this.method489(local13 + 1, 536870912, local8);
			this.method489(local13, 8388608, local8 - 1);
		}
		if (arg4 == 3) {
			this.method489(local13, 671088640, local8);
			this.method489(local13, 8388608, local8 - 1);
			this.method489(local13 - 1, 33554432, local8);
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZI)V")
	public void method484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 - this.anInt543;
		@Pc(19) int local19 = arg1 - this.anInt542;
		this.anIntArrayArray15[local14][local19] |= 0x40000;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
	public void method485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt542;
		@Pc(19) int local19 = arg1 - this.anInt543;
		this.anIntArrayArray15[local19][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZ)V")
	public void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt543;
		@Pc(21) int local21 = arg0 - this.anInt542;
		this.anIntArrayArray15[local16][local21] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V")
	private void method489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray15[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZIIIII)V")
	public void method490(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt542;
		@Pc(34) int local34 = arg5 - this.anInt543;
		for (@Pc(36) int local36 = local34; local36 < local34 + arg2; local36++) {
			if (local36 >= 0 && this.anInt524 > local36) {
				for (@Pc(46) int local46 = local24; local46 < local24 + arg4; local46++) {
					if (local46 >= 0 && this.anInt539 > local46) {
						this.method493(local46, local36, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZIIZ)V")
	public void method491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg3 - this.anInt543;
		@Pc(13) int local13 = arg1 - this.anInt542;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method493(local13, local8, 128);
				this.method493(local13, local8 - 1, 8);
			}
			if (arg0 == 1) {
				this.method493(local13, local8, 2);
				this.method493(local13 + 1, local8, 32);
			}
			if (arg0 == 2) {
				this.method493(local13, local8, 8);
				this.method493(local13, local8 + 1, 128);
			}
			if (arg0 == 3) {
				this.method493(local13, local8, 32);
				this.method493(local13 - 1, local8, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method493(local13, local8, 1);
				this.method493(local13 + 1, local8 + -1, 16);
			}
			if (arg0 == 1) {
				this.method493(local13, local8, 4);
				this.method493(local13 + 1, local8 + 1, 64);
			}
			if (arg0 == 2) {
				this.method493(local13, local8, 16);
				this.method493(local13 - 1, local8 + 1, 1);
			}
			if (arg0 == 3) {
				this.method493(local13, local8, 64);
				this.method493(local13 - 1, local8 - 1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method493(local13, local8, 130);
				this.method493(local13, local8 - 1, 8);
				this.method493(local13 + 1, local8, 32);
			}
			if (arg0 == 1) {
				this.method493(local13, local8, 10);
				this.method493(local13 + 1, local8, 32);
				this.method493(local13, local8 + 1, 128);
			}
			if (arg0 == 2) {
				this.method493(local13, local8, 40);
				this.method493(local13, local8 + 1, 128);
				this.method493(local13 - 1, local8, 2);
			}
			if (arg0 == 3) {
				this.method493(local13, local8, 160);
				this.method493(local13 - 1, local8, 2);
				this.method493(local13, local8 - 1, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method493(local13, local8, 65536);
					this.method493(local13, local8 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method493(local13, local8, 1024);
					this.method493(local13 + 1, local8, 16384);
				}
				if (arg0 == 2) {
					this.method493(local13, local8, 4096);
					this.method493(local13, local8 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method493(local13, local8, 16384);
					this.method493(local13 - 1, local8, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method493(local13, local8, 512);
					this.method493(local13 + 1, local8 + -1, 8192);
				}
				if (arg0 == 1) {
					this.method493(local13, local8, 2048);
					this.method493(local13 + 1, local8 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method493(local13, local8, 8192);
					this.method493(local13 - 1, local8 + 1, 512);
				}
				if (arg0 == 3) {
					this.method493(local13, local8, 32768);
					this.method493(local13 - 1, local8 - 1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method493(local13, local8, 66560);
					this.method493(local13, local8 - 1, 4096);
					this.method493(local13 + 1, local8, 16384);
				}
				if (arg0 == 1) {
					this.method493(local13, local8, 5120);
					this.method493(local13 + 1, local8, 16384);
					this.method493(local13, local8 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method493(local13, local8, 20480);
					this.method493(local13, local8 + 1, 65536);
					this.method493(local13 - 1, local8, 1024);
				}
				if (arg0 == 3) {
					this.method493(local13, local8, 81920);
					this.method493(local13 - 1, local8, 1024);
					this.method493(local13, local8 - 1, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method493(local13, local8, 536870912);
				this.method493(local13, local8 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method493(local13, local8, 8388608);
				this.method493(local13 + 1, local8, 134217728);
			}
			if (arg0 == 2) {
				this.method493(local13, local8, 33554432);
				this.method493(local13, local8 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method493(local13, local8, 134217728);
				this.method493(local13 - 1, local8, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method493(local13, local8, 4194304);
				this.method493(local13 + 1, local8 + -1, 67108864);
			}
			if (arg0 == 1) {
				this.method493(local13, local8, 16777216);
				this.method493(local13 + 1, local8 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method493(local13, local8, 67108864);
				this.method493(local13 - 1, local8 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method493(local13, local8, 268435456);
				this.method493(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method493(local13, local8, 545259520);
			this.method493(local13, local8 - 1, 33554432);
			this.method493(local13 + 1, local8, 134217728);
		}
		if (arg0 == 1) {
			this.method493(local13, local8, 41943040);
			this.method493(local13 + 1, local8, 134217728);
			this.method493(local13, local8 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method493(local13, local8, 167772160);
			this.method493(local13, local8 + 1, 536870912);
			this.method493(local13 - 1, local8, 8388608);
		}
		if (arg0 == 3) {
			this.method493(local13, local8, 671088640);
			this.method493(local13 - 1, local8, 8388608);
			this.method493(local13, local8 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIBI)V")
	private void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray15[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public void method494() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt524; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt539; local4++) {
				if (local1 == 0 || local4 == 0 || local1 >= this.anInt524 - 5 || local4 >= this.anInt539 - 5) {
					this.anIntArrayArray15[local1][local4] = -1;
				} else {
					this.anIntArrayArray15[local1][local4] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg2 + arg1;
		@Pc(16) int local16 = arg6 + arg0;
		@Pc(20) int local20 = arg3 + arg5;
		@Pc(24) int local24 = arg4 + arg7;
		@Pc(84) int local84;
		@Pc(91) int local91;
		if (local20 == arg1 && (arg8 & 0x2) == 0) {
			local84 = arg4 >= arg0 ? arg4 : arg0;
			local91 = local24 <= local16 ? local24 : local16;
			while (local91 > local84) {
				if ((this.anIntArrayArray15[local20 - this.anInt543 - 1][local84 - this.anInt542] & 0x8) == 0) {
					return true;
				}
				local84++;
			}
		} else if (local12 == arg5 && (arg8 & 0x8) == 0) {
			local84 = arg4 >= arg0 ? arg4 : arg0;
			local91 = local24 > local16 ? local16 : local24;
			while (local84 < local91) {
				if ((this.anIntArrayArray15[arg5 - this.anInt543][local84 - this.anInt542] & 0x80) == 0) {
					return true;
				}
				local84++;
			}
		} else if (arg0 == local24 && (arg8 & 0x1) == 0) {
			local84 = arg1 > arg5 ? arg1 : arg5;
			local91 = local20 > local12 ? local12 : local20;
			while (local84 < local91) {
				if ((this.anIntArrayArray15[local84 - this.anInt543][local24 - this.anInt542 - 1] & 0x2) == 0) {
					return true;
				}
				local84++;
			}
		} else if (arg4 == local16 && (arg8 & 0x4) == 0) {
			local84 = arg5 >= arg1 ? arg5 : arg1;
			local91 = local20 <= local12 ? local20 : local12;
			while (local91 > local84) {
				if ((this.anIntArrayArray15[local84 - this.anInt543][arg4 - this.anInt542] & 0x20) == 0) {
					return true;
				}
				local84++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static174.method3164(arg5, arg6, arg7, arg4, arg3, arg1, arg2, arg7) ? true : this.method495(arg5, arg1, arg7, arg3, arg2, arg4, arg7, arg6, arg0);
		}
		@Pc(46) int local46 = arg3 + arg4 - 1;
		@Pc(52) int local52 = arg6 + arg2 - 1;
		if (arg4 <= arg1 && arg1 <= local46 && arg5 >= arg2 && arg5 <= local52) {
			return true;
		} else if (arg1 == arg4 - 1 && arg5 >= arg2 && arg5 <= local52 && (this.anIntArrayArray15[arg1 - this.anInt543][arg5 - this.anInt542] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local46 + 1 == arg1 && arg2 <= arg5 && local52 >= arg5 && (this.anIntArrayArray15[arg1 - this.anInt543][arg5 - this.anInt542] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg2 - 1 && arg4 <= arg1 && local46 >= arg1 && (this.anIntArrayArray15[arg1 - this.anInt543][arg5 - this.anInt542] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local52 + 1 == arg5 && arg1 >= arg4 && arg1 <= local46 && (this.anIntArrayArray15[arg1 - this.anInt543][arg5 - this.anInt542] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg0 == arg4 && arg2 == arg5) {
				return true;
			}
		} else if (arg4 <= arg0 && arg1 + arg4 - 1 >= arg0 && arg2 >= arg2 && arg2 <= arg2 + arg1 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg5 - this.anInt542;
		@Pc(60) int local60 = arg0 - this.anInt543;
		@Pc(70) int local70 = arg4 - this.anInt543;
		@Pc(75) int local75 = arg2 - this.anInt542;
		if (arg1 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local60 + 1 == local70 && local75 == local55 && (this.anIntArrayArray15[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local70 == local60 && local55 == local75 - 1 && (this.anIntArrayArray15[local70][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local60 - 1 == local70 && local75 == local55 && (this.anIntArrayArray15[local70][local55] & 0x8) == 0) {
						return true;
					}
					if (local70 == local60 && local75 - 1 == local55 && (this.anIntArrayArray15[local70][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local60 - 1 == local70 && local55 == local75 && (this.anIntArrayArray15[local70][local55] & 0x8) == 0) {
						return true;
					}
					if (local60 == local70 && local55 == local75 + 1 && (this.anIntArrayArray15[local70][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local70 == local60 + 1 && local75 == local55 && (this.anIntArrayArray15[local70][local55] & 0x80) == 0) {
						return true;
					}
					if (local60 == local70 && local75 + 1 == local55 && (this.anIntArrayArray15[local70][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local70 == local60 && local75 + 1 == local55 && (this.anIntArrayArray15[local70][local55] & 0x20) == 0) {
					return true;
				}
				if (local70 == local60 && local55 == local75 - 1 && (this.anIntArrayArray15[local70][local55] & 0x2) == 0) {
					return true;
				}
				if (local60 - 1 == local70 && local75 == local55 && (this.anIntArrayArray15[local70][local55] & 0x8) == 0) {
					return true;
				}
				if (local70 == local60 + 1 && local75 == local55 && (this.anIntArrayArray15[local70][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(435) int local435 = arg1 + local70 - 1;
			@Pc(441) int local441 = arg1 + local55 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local70 == local60 + 1 && local55 <= local75 && local441 >= local75 && (this.anIntArrayArray15[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local60 && local435 >= local60 && local75 - arg1 == local55 && (this.anIntArrayArray15[local60][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local70 == local60 - arg1 && local75 >= local55 && local75 <= local441 && (this.anIntArrayArray15[local435][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local60 && local435 >= local60 && local55 == local75 - arg1 && (this.anIntArrayArray15[local60][local441] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local60 - arg1 == local70 && local55 <= local75 && local441 >= local75 && (this.anIntArrayArray15[local435][local75] & 0x8) == 0) {
						return true;
					}
					if (local60 >= local70 && local60 <= local435 && local75 + 1 == local55 && (this.anIntArrayArray15[local60][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local70 == local60 + 1 && local55 <= local75 && local75 <= local441 && (this.anIntArrayArray15[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local70 && local435 >= local60 && local75 + 1 == local55 && (this.anIntArrayArray15[local60][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local70 <= local60 && local60 <= local435 && local75 + 1 == local55 && (this.anIntArrayArray15[local60][local55] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local60 && local60 <= local435 && local75 - arg1 == local55 && (this.anIntArrayArray15[local60][local441] & 0x2) == 0) {
					return true;
				}
				if (local70 == local60 - arg1 && local55 <= local75 && local75 <= local441 && (this.anIntArrayArray15[local435][local75] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local70 && local75 >= local55 && local75 <= local441 && (this.anIntArrayArray15[local70][local75] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIZIIII)V")
	public void method498(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(27) int local27;
		if (arg3 == 1 || arg3 == 3) {
			local27 = arg6;
			arg6 = arg4;
			arg4 = local27;
		}
		@Pc(42) int local42 = arg1 - this.anInt542;
		@Pc(47) int local47 = arg5 - this.anInt543;
		for (local27 = local47; local27 < arg6 + local47; local27++) {
			if (local27 >= 0 && this.anInt524 > local27) {
				for (@Pc(59) int local59 = local42; local59 < local42 + arg4; local59++) {
					if (local59 >= 0 && this.anInt539 > local59) {
						this.method489(local27, local7, local59);
					}
				}
			}
		}
	}
}
