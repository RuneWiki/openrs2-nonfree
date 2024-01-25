import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class49 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	public int anInt1404;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public int anInt1413;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public void method1230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1413;
		@Pc(13) int local13 = arg1 - this.anInt1400;
		this.anIntArrayArray7[local4][local13] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZZII)V")
	public void method1231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt1413;
		@Pc(13) int local13 = arg4 - this.anInt1400;
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method1238(128, local4, local13);
				this.method1238(8, local4 - 1, local13);
			}
			if (arg5 == 1) {
				this.method1238(2, local4, local13);
				this.method1238(32, local4, local13 + 1);
			}
			if (arg5 == 2) {
				this.method1238(8, local4, local13);
				this.method1238(128, local4 + 1, local13);
			}
			if (arg5 == 3) {
				this.method1238(32, local4, local13);
				this.method1238(2, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method1238(1, local4, local13);
				this.method1238(16, local4 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method1238(4, local4, local13);
				this.method1238(64, local4 + 1, local13 - -1);
			}
			if (arg5 == 2) {
				this.method1238(16, local4, local13);
				this.method1238(1, local4 + 1, local13 - 1);
			}
			if (arg5 == 3) {
				this.method1238(64, local4, local13);
				this.method1238(4, local4 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg5 == 0) {
				this.method1238(130, local4, local13);
				this.method1238(8, local4 - 1, local13);
				this.method1238(32, local4, local13 + 1);
			}
			if (arg5 == 1) {
				this.method1238(10, local4, local13);
				this.method1238(32, local4, local13 + 1);
				this.method1238(128, local4 + 1, local13);
			}
			if (arg5 == 2) {
				this.method1238(40, local4, local13);
				this.method1238(128, local4 + 1, local13);
				this.method1238(2, local4, local13 - 1);
			}
			if (arg5 == 3) {
				this.method1238(160, local4, local13);
				this.method1238(2, local4, local13 - 1);
				this.method1238(8, local4 - 1, local13);
			}
		}
		if (arg2) {
			if (arg1 == 0) {
				if (arg5 == 0) {
					this.method1238(65536, local4, local13);
					this.method1238(4096, local4 - 1, local13);
				}
				if (arg5 == 1) {
					this.method1238(1024, local4, local13);
					this.method1238(16384, local4, local13 + 1);
				}
				if (arg5 == 2) {
					this.method1238(4096, local4, local13);
					this.method1238(65536, local4 + 1, local13);
				}
				if (arg5 == 3) {
					this.method1238(16384, local4, local13);
					this.method1238(1024, local4, local13 - 1);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg5 == 0) {
					this.method1238(512, local4, local13);
					this.method1238(8192, local4 - 1, local13 - -1);
				}
				if (arg5 == 1) {
					this.method1238(2048, local4, local13);
					this.method1238(32768, local4 + 1, local13 + 1);
				}
				if (arg5 == 2) {
					this.method1238(8192, local4, local13);
					this.method1238(512, local4 + 1, local13 + -1);
				}
				if (arg5 == 3) {
					this.method1238(32768, local4, local13);
					this.method1238(2048, local4 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg5 == 0) {
					this.method1238(66560, local4, local13);
					this.method1238(4096, local4 - 1, local13);
					this.method1238(16384, local4, local13 + 1);
				}
				if (arg5 == 1) {
					this.method1238(5120, local4, local13);
					this.method1238(16384, local4, local13 + 1);
					this.method1238(65536, local4 + 1, local13);
				}
				if (arg5 == 2) {
					this.method1238(20480, local4, local13);
					this.method1238(65536, local4 + 1, local13);
					this.method1238(1024, local4, local13 - 1);
				}
				if (arg5 == 3) {
					this.method1238(81920, local4, local13);
					this.method1238(1024, local4, local13 - 1);
					this.method1238(4096, local4 - 1, local13);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg5 == 0) {
				this.method1238(536870912, local4, local13);
				this.method1238(33554432, local4 - 1, local13);
			}
			if (arg5 == 1) {
				this.method1238(8388608, local4, local13);
				this.method1238(134217728, local4, local13 + 1);
			}
			if (arg5 == 2) {
				this.method1238(33554432, local4, local13);
				this.method1238(536870912, local4 + 1, local13);
			}
			if (arg5 == 3) {
				this.method1238(134217728, local4, local13);
				this.method1238(8388608, local4, local13 - 1);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg5 == 0) {
				this.method1238(4194304, local4, local13);
				this.method1238(67108864, local4 - 1, local13 + 1);
			}
			if (arg5 == 1) {
				this.method1238(16777216, local4, local13);
				this.method1238(268435456, local4 + 1, local13 + 1);
			}
			if (arg5 == 2) {
				this.method1238(67108864, local4, local13);
				this.method1238(4194304, local4 + 1, local13 + -1);
			}
			if (arg5 == 3) {
				this.method1238(268435456, local4, local13);
				this.method1238(16777216, local4 - 1, local13 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg5 == 0) {
			this.method1238(545259520, local4, local13);
			this.method1238(33554432, local4 - 1, local13);
			this.method1238(134217728, local4, local13 + 1);
		}
		if (arg5 == 1) {
			this.method1238(41943040, local4, local13);
			this.method1238(134217728, local4, local13 + 1);
			this.method1238(536870912, local4 + 1, local13);
		}
		if (arg5 == 2) {
			this.method1238(167772160, local4, local13);
			this.method1238(536870912, local4 + 1, local13);
			this.method1238(8388608, local4, local13 - 1);
		}
		if (arg5 == 3) {
			this.method1238(671088640, local4, local13);
			this.method1238(8388608, local4, local13 - 1);
			this.method1238(33554432, local4 - 1, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)V")
	public void method1232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1400;
		@Pc(21) int local21 = arg0 - this.anInt1413;
		this.anIntArrayArray7[local21][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg4 && arg1 == arg0) {
				return true;
			}
		} else if (arg2 <= arg4 && arg6 + arg2 - 1 >= arg4 && arg1 <= arg1 && arg1 <= arg6 + arg1 - 1) {
			return true;
		}
		@Pc(81) int local81 = arg2 - this.anInt1413;
		@Pc(86) int local86 = arg4 - this.anInt1413;
		@Pc(91) int local91 = arg1 - this.anInt1400;
		@Pc(96) int local96 = arg0 - this.anInt1400;
		if (arg6 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local86 + 1 == local81 && local96 == local91 && (this.anIntArrayArray7[local81][local96] & 0x80) == 0) {
						return true;
					}
					if (local86 == local81 && local91 - 1 == local96 && (this.anIntArrayArray7[local81][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local81 == local86 - 1 && local96 == local91 && (this.anIntArrayArray7[local81][local96] & 0x8) == 0) {
						return true;
					}
					if (local81 == local86 && local96 == local91 - 1 && (this.anIntArrayArray7[local81][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local86 - 1 == local81 && local96 == local91 && (this.anIntArrayArray7[local81][local96] & 0x8) == 0) {
						return true;
					}
					if (local86 == local81 && local96 == local91 + 1 && (this.anIntArrayArray7[local81][local96] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local86 + 1 == local81 && local91 == local96 && (this.anIntArrayArray7[local81][local96] & 0x80) == 0) {
						return true;
					}
					if (local86 == local81 && local96 == local91 + 1 && (this.anIntArrayArray7[local81][local96] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local81 == local86 && local96 == local91 + 1 && (this.anIntArrayArray7[local81][local96] & 0x20) == 0) {
					return true;
				}
				if (local81 == local86 && local96 == local91 - 1 && (this.anIntArrayArray7[local81][local96] & 0x2) == 0) {
					return true;
				}
				if (local86 - 1 == local81 && local96 == local91 && (this.anIntArrayArray7[local81][local96] & 0x8) == 0) {
					return true;
				}
				if (local86 + 1 == local81 && local91 == local96 && (this.anIntArrayArray7[local81][local96] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(107) int local107 = local81 + arg6 - 1;
			@Pc(113) int local113 = local96 + arg6 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local86 + 1 == local81 && local96 <= local91 && local91 <= local113 && (this.anIntArrayArray7[local81][local91] & 0x80) == 0) {
						return true;
					}
					if (local86 >= local81 && local86 <= local107 && local91 - arg6 == local96 && (this.anIntArrayArray7[local86][local113] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local86 - arg6 == local81 && local96 <= local91 && local91 <= local113 && (this.anIntArrayArray7[local107][local91] & 0x8) == 0) {
						return true;
					}
					if (local81 <= local86 && local86 <= local107 && local96 == local91 - arg6 && (this.anIntArrayArray7[local86][local113] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local86 - arg6 == local81 && local91 >= local96 && local91 <= local113 && (this.anIntArrayArray7[local107][local91] & 0x8) == 0) {
						return true;
					}
					if (local81 <= local86 && local107 >= local86 && local96 == local91 + 1 && (this.anIntArrayArray7[local86][local96] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local86 + 1 == local81 && local91 >= local96 && local113 >= local91 && (this.anIntArrayArray7[local81][local91] & 0x80) == 0) {
						return true;
					}
					if (local86 >= local81 && local107 >= local86 && local91 + 1 == local96 && (this.anIntArrayArray7[local86][local96] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local86 >= local81 && local86 <= local107 && local96 == local91 + 1 && (this.anIntArrayArray7[local86][local96] & 0x20) == 0) {
					return true;
				}
				if (local81 <= local86 && local107 >= local86 && local96 == local91 - arg6 && (this.anIntArrayArray7[local86][local113] & 0x2) == 0) {
					return true;
				}
				if (local86 - arg6 == local81 && local96 <= local91 && local113 >= local91 && (this.anIntArrayArray7[local107][local91] & 0x8) == 0) {
					return true;
				}
				if (local86 + 1 == local81 && local96 <= local91 && local113 >= local91 && (this.anIntArrayArray7[local81][local91] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBIIZIZ)V")
	public void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg1 - this.anInt1400;
		@Pc(13) int local13 = arg4 - this.anInt1413;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1240(local13, 128, local4);
				this.method1240(local13 - 1, 8, local4);
			}
			if (arg2 == 1) {
				this.method1240(local13, 2, local4);
				this.method1240(local13, 32, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1240(local13, 8, local4);
				this.method1240(local13 + 1, 128, local4);
			}
			if (arg2 == 3) {
				this.method1240(local13, 32, local4);
				this.method1240(local13, 2, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1240(local13, 1, local4);
				this.method1240(local13 - 1, 16, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1240(local13, 4, local4);
				this.method1240(local13 + 1, 64, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1240(local13, 16, local4);
				this.method1240(local13 + 1, 1, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1240(local13, 64, local4);
				this.method1240(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1240(local13, 130, local4);
				this.method1240(local13 - 1, 8, local4);
				this.method1240(local13, 32, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1240(local13, 10, local4);
				this.method1240(local13, 32, local4 + 1);
				this.method1240(local13 + 1, 128, local4);
			}
			if (arg2 == 2) {
				this.method1240(local13, 40, local4);
				this.method1240(local13 + 1, 128, local4);
				this.method1240(local13, 2, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1240(local13, 160, local4);
				this.method1240(local13, 2, local4 - 1);
				this.method1240(local13 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method1240(local13, 65536, local4);
					this.method1240(local13 - 1, 4096, local4);
				}
				if (arg2 == 1) {
					this.method1240(local13, 1024, local4);
					this.method1240(local13, 16384, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1240(local13, 4096, local4);
					this.method1240(local13 + 1, 65536, local4);
				}
				if (arg2 == 3) {
					this.method1240(local13, 16384, local4);
					this.method1240(local13, 1024, local4 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method1240(local13, 512, local4);
					this.method1240(local13 - 1, 8192, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1240(local13, 2048, local4);
					this.method1240(local13 + 1, 32768, local4 + 1);
				}
				if (arg2 == 2) {
					this.method1240(local13, 8192, local4);
					this.method1240(local13 + 1, 512, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1240(local13, 32768, local4);
					this.method1240(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method1240(local13, 66560, local4);
					this.method1240(local13 - 1, 4096, local4);
					this.method1240(local13, 16384, local4 + 1);
				}
				if (arg2 == 1) {
					this.method1240(local13, 5120, local4);
					this.method1240(local13, 16384, local4 + 1);
					this.method1240(local13 + 1, 65536, local4);
				}
				if (arg2 == 2) {
					this.method1240(local13, 20480, local4);
					this.method1240(local13 + 1, 65536, local4);
					this.method1240(local13, 1024, local4 - 1);
				}
				if (arg2 == 3) {
					this.method1240(local13, 81920, local4);
					this.method1240(local13, 1024, local4 - 1);
					this.method1240(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1240(local13, 536870912, local4);
				this.method1240(local13 - 1, 33554432, local4);
			}
			if (arg2 == 1) {
				this.method1240(local13, 8388608, local4);
				this.method1240(local13, 134217728, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1240(local13, 33554432, local4);
				this.method1240(local13 + 1, 536870912, local4);
			}
			if (arg2 == 3) {
				this.method1240(local13, 134217728, local4);
				this.method1240(local13, 8388608, local4 - 1);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1240(local13, 4194304, local4);
				this.method1240(local13 - 1, 67108864, local4 + 1);
			}
			if (arg2 == 1) {
				this.method1240(local13, 16777216, local4);
				this.method1240(local13 + 1, 268435456, local4 + 1);
			}
			if (arg2 == 2) {
				this.method1240(local13, 67108864, local4);
				this.method1240(local13 + 1, 4194304, local4 - 1);
			}
			if (arg2 == 3) {
				this.method1240(local13, 268435456, local4);
				this.method1240(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1240(local13, 545259520, local4);
			this.method1240(local13 - 1, 33554432, local4);
			this.method1240(local13, 134217728, local4 + 1);
		}
		if (arg2 == 1) {
			this.method1240(local13, 41943040, local4);
			this.method1240(local13, 134217728, local4 + 1);
			this.method1240(local13 + 1, 536870912, local4);
		}
		if (arg2 == 2) {
			this.method1240(local13, 167772160, local4);
			this.method1240(local13 + 1, 536870912, local4);
			this.method1240(local13, 8388608, local4 - 1);
		}
		if (arg2 == 3) {
			this.method1240(local13, 671088640, local4);
			this.method1240(local13, 8388608, local4 - 1);
			this.method1240(local13 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIZIBII)V")
	public void method1235(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt1413;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg3 - this.anInt1400;
		for (@Pc(31) int local31 = local18; local31 < arg4 + local18; local31++) {
			if (local31 >= 0 && this.anInt1408 > local31) {
				for (@Pc(48) int local48 = local29; local48 < local29 + arg5; local48++) {
					if (local48 >= 0 && this.anInt1404 > local48) {
						this.method1240(local31, local7, local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	public void method1236() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1408; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt1404; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt1408 - 5 || local15 >= this.anInt1404 - 5) {
					this.anIntArrayArray7[local11][local15] = -1;
				} else {
					this.anIntArrayArray7[local11][local15] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)V")
	public void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 - this.anInt1413;
		@Pc(14) int local14 = arg1 - this.anInt1400;
		this.anIntArrayArray7[local9][local14] |= 0x200000;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)V")
	private void method1238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg1][arg2] &= ~arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg3 == arg2 && arg4 == arg1) {
				return true;
			}
		} else if (arg2 >= arg3 && arg2 <= arg3 + arg0 - 1 && arg1 >= arg1 && arg1 <= arg1 + arg0 - 1) {
			return true;
		}
		@Pc(55) int local55 = arg1 - this.anInt1400;
		@Pc(60) int local60 = arg4 - this.anInt1400;
		@Pc(65) int local65 = arg2 - this.anInt1413;
		@Pc(70) int local70 = arg3 - this.anInt1413;
		if (arg0 == 1) {
			if (arg6 == 0) {
				if (arg5 == 0) {
					if (local65 - 1 == local70 && local60 == local55) {
						return true;
					}
					if (local65 == local70 && local60 == local55 + 1 && (this.anIntArrayArray7[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local55 - 1 && (this.anIntArrayArray7[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local65 == local70 && local60 == local55 + 1) {
						return true;
					}
					if (local65 - 1 == local70 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local65 + 1 && local60 == local55) {
						return true;
					}
					if (local70 == local65 && local60 == local55 + 1 && (this.anIntArrayArray7[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local55 - 1 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local65 == local70 && local55 - 1 == local60) {
						return true;
					}
					if (local65 - 1 == local70 && local60 == local55 && (this.anIntArrayArray7[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local55 && (this.anIntArrayArray7[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg5 == 0) {
					if (local70 == local65 - 1 && local60 == local55) {
						return true;
					}
					if (local70 == local65 && local60 == local55 + 1) {
						return true;
					}
					if (local70 == local65 + 1 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local55 - 1 && (this.anIntArrayArray7[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 == local65 - 1 && local60 == local55 && (this.anIntArrayArray7[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local55 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local55 == local60) {
						return true;
					}
					if (local70 == local65 && local60 == local55 - 1 && (this.anIntArrayArray7[local70][local60] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local65 - 1 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local55 + 1 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local55) {
						return true;
					}
					if (local65 == local70 && local60 == local55 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 == local65 - 1 && local60 == local55) {
						return true;
					}
					if (local65 == local70 && local55 + 1 == local60 && (this.anIntArrayArray7[local70][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local55 && (this.anIntArrayArray7[local70][local60] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 == local70 && local60 == local55 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local65 == local70 && local55 + 1 == local60 && (this.anIntArrayArray7[local70][local60] & 0x20) == 0) {
					return true;
				}
				if (local65 == local70 && local60 == local55 - 1 && (this.anIntArrayArray7[local70][local60] & 0x2) == 0) {
					return true;
				}
				if (local70 == local65 - 1 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x8) == 0) {
					return true;
				}
				if (local70 == local65 + 1 && local55 == local60 && (this.anIntArrayArray7[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(80) int local80 = local70 + arg0 - 1;
			@Pc(86) int local86 = local60 + arg0 - 1;
			if (arg6 == 0) {
				if (arg5 == 0) {
					if (local70 == local65 - arg0 && local55 >= local60 && local55 <= local86) {
						return true;
					}
					if (local65 >= local70 && local65 <= local80 && local60 == local55 + 1 && (this.anIntArrayArray7[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 <= local65 && local65 <= local80 && local60 == local55 - arg0 && (this.anIntArrayArray7[local65][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 <= local65 && local80 >= local65 && local60 == local55 + 1) {
						return true;
					}
					if (local70 == local65 - arg0 && local55 >= local60 && local55 <= local86 && (this.anIntArrayArray7[local80][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local60 <= local55 && local86 >= local55 && (this.anIntArrayArray7[local70][local55] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local65 + 1 == local70 && local55 >= local60 && local55 <= local86) {
						return true;
					}
					if (local70 <= local65 && local80 >= local65 && local55 + 1 == local60 && (this.anIntArrayArray7[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 >= local70 && local80 >= local65 && local60 == local55 - arg0 && (this.anIntArrayArray7[local65][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 <= local65 && local65 <= local80 && local60 == local55 - arg0) {
						return true;
					}
					if (local65 - arg0 == local70 && local60 <= local55 && local55 <= local86 && (this.anIntArrayArray7[local80][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local55 >= local60 && local86 >= local55 && (this.anIntArrayArray7[local70][local55] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg5 == 0) {
					if (local65 - arg0 == local70 && local60 <= local55 && local86 >= local55) {
						return true;
					}
					if (local65 >= local70 && local80 >= local65 && local60 == local55 + 1) {
						return true;
					}
					if (local70 == local65 + 1 && local55 >= local60 && local55 <= local86 && (this.anIntArrayArray7[local70][local55] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 <= local65 && local80 >= local65 && local55 - arg0 == local60 && (this.anIntArrayArray7[local65][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 == local65 - arg0 && local60 <= local55 && local86 >= local55 && (this.anIntArrayArray7[local80][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local80 && local55 + 1 == local60) {
						return true;
					}
					if (local65 + 1 == local70 && local60 <= local55 && local86 >= local55) {
						return true;
					}
					if (local65 >= local70 && local65 <= local80 && local55 - arg0 == local60 && (this.anIntArrayArray7[local65][local86] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 == local65 - arg0 && local60 <= local55 && local86 >= local55 && (this.anIntArrayArray7[local80][local55] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 <= local65 && local80 >= local65 && local60 == local55 + 1 && (this.anIntArrayArray7[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local55 >= local60 && local55 <= local86) {
						return true;
					}
					if (local65 >= local70 && local80 >= local65 && local55 - arg0 == local60) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 == local65 - arg0 && local55 >= local60 && local55 <= local86) {
						return true;
					}
					if (local70 <= local65 && local80 >= local65 && local55 + 1 == local60 && (this.anIntArrayArray7[local65][local60] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local55 >= local60 && local55 <= local86 && (this.anIntArrayArray7[local70][local55] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 >= local70 && local80 >= local65 && local55 - arg0 == local60) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local70 <= local65 && local65 <= local80 && local60 == local55 + 1 && (this.anIntArrayArray7[local65][local60] & 0x2C0120) == 0) {
					return true;
				}
				if (local65 >= local70 && local65 <= local80 && local60 == local55 - arg0 && (this.anIntArrayArray7[local65][local86] & 0x2C0102) == 0) {
					return true;
				}
				if (local70 == local65 - arg0 && local55 >= local60 && local55 <= local86 && (this.anIntArrayArray7[local80][local55] & 0x2C0108) == 0) {
					return true;
				}
				if (local65 + 1 == local70 && local60 <= local55 && local55 <= local86 && (this.anIntArrayArray7[local70][local55] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIII)V")
	private void method1240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray7[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZIIZI)V")
	public void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		@Pc(23) int local23;
		if (arg2 == 1 || arg2 == 3) {
			local23 = arg4;
			arg4 = arg1;
			arg1 = local23;
		}
		@Pc(32) int local32 = arg6 - this.anInt1400;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(49) int local49 = arg0 - this.anInt1413;
		for (local23 = local49; local23 < local49 + arg4; local23++) {
			if (local23 >= 0 && this.anInt1408 > local23) {
				for (@Pc(68) int local68 = local32; local68 < local32 + arg1; local68++) {
					if (local68 >= 0 && local68 < this.anInt1404) {
						this.method1238(local7, local23, local68);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIBII)Z")
	public boolean method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > 1) {
			return Static324.method5466(arg6, arg5, arg4, arg2, arg7, arg1, arg0, arg6) ? true : this.method1243(arg6, arg4, arg7, arg5, arg1, arg0, arg3, arg6, arg2);
		}
		@Pc(38) int local38 = arg2 + arg7 - 1;
		@Pc(60) int local60 = arg5 + arg0 - 1;
		if (arg2 <= arg1 && local38 >= arg1 && arg0 <= arg4 && local60 >= arg4) {
			return true;
		} else if (arg2 - 1 == arg1 && arg4 >= arg0 && arg4 <= local60 && (this.anIntArrayArray7[arg1 - this.anInt1413][arg4 - this.anInt1400] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg1 && arg0 <= arg4 && arg4 <= local60 && (this.anIntArrayArray7[arg1 - this.anInt1413][arg4 - this.anInt1400] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg4 && arg2 <= arg1 && local38 >= arg1 && (this.anIntArrayArray7[arg1 - this.anInt1413][arg4 - this.anInt1400] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local60 + 1 && arg2 <= arg1 && arg1 <= local38 && (this.anIntArrayArray7[arg1 - this.anInt1413][arg4 - this.anInt1400] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZIIIIII)Z")
	public boolean method1243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 + arg4;
		@Pc(13) int local13 = arg7 + arg1;
		@Pc(17) int local17 = arg2 + arg8;
		@Pc(26) int local26 = arg5 + arg3;
		@Pc(68) int local68;
		@Pc(79) int local79;
		if (arg4 == local17 && (arg6 & 0x2) == 0) {
			local68 = arg5 < arg1 ? arg1 : arg5;
			local79 = local26 > local13 ? local13 : local26;
			while (local79 > local68) {
				if ((this.anIntArrayArray7[local17 - this.anInt1413 - 1][local68 - this.anInt1400] & 0x8) == 0) {
					return true;
				}
				local68++;
			}
		} else if (arg8 == local9 && (arg6 & 0x8) == 0) {
			local68 = arg1 > arg5 ? arg1 : arg5;
			local79 = local26 > local13 ? local13 : local26;
			while (local79 > local68) {
				if ((this.anIntArrayArray7[arg8 - this.anInt1413][local68 - this.anInt1400] & 0x80) == 0) {
					return true;
				}
				local68++;
			}
		} else if (arg1 == local26 && (arg6 & 0x1) == 0) {
			local68 = arg4 <= arg8 ? arg8 : arg4;
			local79 = local9 >= local17 ? local17 : local9;
			while (local79 > local68) {
				if ((this.anIntArrayArray7[local68 - this.anInt1413][local26 - this.anInt1400 - 1] & 0x2) == 0) {
					return true;
				}
				local68++;
			}
		} else if (local13 == arg5 && (arg6 & 0x4) == 0) {
			local68 = arg8 < arg4 ? arg4 : arg8;
			local79 = local9 >= local17 ? local17 : local9;
			while (local79 > local68) {
				if ((this.anIntArrayArray7[local68 - this.anInt1413][arg5 - this.anInt1400] & 0x20) == 0) {
					return true;
				}
				local68++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)V")
	public void method1244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt1413;
		@Pc(17) int local17 = arg1 - this.anInt1400;
		this.anIntArrayArray7[local8][local17] &= 0xFFFBFFFF;
	}
}
