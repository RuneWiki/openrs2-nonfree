import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class226 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt6523;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt6527;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt6536;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public int anInt6545;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIZIII)V")
	public void method5358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt6536;
		@Pc(9) int local9 = arg3 - this.anInt6545;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method5361(128, local4, local9);
				this.method5361(8, local4 - 1, local9);
			}
			if (arg1 == 1) {
				this.method5361(2, local4, local9);
				this.method5361(32, local4, local9 + 1);
			}
			if (arg1 == 2) {
				this.method5361(8, local4, local9);
				this.method5361(128, local4 + 1, local9);
			}
			if (arg1 == 3) {
				this.method5361(32, local4, local9);
				this.method5361(2, local4, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method5361(1, local4, local9);
				this.method5361(16, local4 - 1, local9 + 1);
			}
			if (arg1 == 1) {
				this.method5361(4, local4, local9);
				this.method5361(64, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method5361(16, local4, local9);
				this.method5361(1, local4 + 1, local9 + -1);
			}
			if (arg1 == 3) {
				this.method5361(64, local4, local9);
				this.method5361(4, local4 - 1, local9 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method5361(130, local4, local9);
				this.method5361(8, local4 - 1, local9);
				this.method5361(32, local4, local9 + 1);
			}
			if (arg1 == 1) {
				this.method5361(10, local4, local9);
				this.method5361(32, local4, local9 + 1);
				this.method5361(128, local4 + 1, local9);
			}
			if (arg1 == 2) {
				this.method5361(40, local4, local9);
				this.method5361(128, local4 + 1, local9);
				this.method5361(2, local4, local9 - 1);
			}
			if (arg1 == 3) {
				this.method5361(160, local4, local9);
				this.method5361(2, local4, local9 - 1);
				this.method5361(8, local4 - 1, local9);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method5361(65536, local4, local9);
					this.method5361(4096, local4 - 1, local9);
				}
				if (arg1 == 1) {
					this.method5361(1024, local4, local9);
					this.method5361(16384, local4, local9 + 1);
				}
				if (arg1 == 2) {
					this.method5361(4096, local4, local9);
					this.method5361(65536, local4 + 1, local9);
				}
				if (arg1 == 3) {
					this.method5361(16384, local4, local9);
					this.method5361(1024, local4, local9 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method5361(512, local4, local9);
					this.method5361(8192, local4 - 1, local9 - -1);
				}
				if (arg1 == 1) {
					this.method5361(2048, local4, local9);
					this.method5361(32768, local4 + 1, local9 - -1);
				}
				if (arg1 == 2) {
					this.method5361(8192, local4, local9);
					this.method5361(512, local4 + 1, local9 + -1);
				}
				if (arg1 == 3) {
					this.method5361(32768, local4, local9);
					this.method5361(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method5361(66560, local4, local9);
					this.method5361(4096, local4 - 1, local9);
					this.method5361(16384, local4, local9 + 1);
				}
				if (arg1 == 1) {
					this.method5361(5120, local4, local9);
					this.method5361(16384, local4, local9 + 1);
					this.method5361(65536, local4 + 1, local9);
				}
				if (arg1 == 2) {
					this.method5361(20480, local4, local9);
					this.method5361(65536, local4 + 1, local9);
					this.method5361(1024, local4, local9 - 1);
				}
				if (arg1 == 3) {
					this.method5361(81920, local4, local9);
					this.method5361(1024, local4, local9 - 1);
					this.method5361(4096, local4 - 1, local9);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method5361(536870912, local4, local9);
				this.method5361(33554432, local4 - 1, local9);
			}
			if (arg1 == 1) {
				this.method5361(8388608, local4, local9);
				this.method5361(134217728, local4, local9 + 1);
			}
			if (arg1 == 2) {
				this.method5361(33554432, local4, local9);
				this.method5361(536870912, local4 + 1, local9);
			}
			if (arg1 == 3) {
				this.method5361(134217728, local4, local9);
				this.method5361(8388608, local4, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method5361(4194304, local4, local9);
				this.method5361(67108864, local4 - 1, local9 - -1);
			}
			if (arg1 == 1) {
				this.method5361(16777216, local4, local9);
				this.method5361(268435456, local4 + 1, local9 + 1);
			}
			if (arg1 == 2) {
				this.method5361(67108864, local4, local9);
				this.method5361(4194304, local4 + 1, local9 + -1);
			}
			if (arg1 == 3) {
				this.method5361(268435456, local4, local9);
				this.method5361(16777216, local4 - 1, local9 + -1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5361(545259520, local4, local9);
			this.method5361(33554432, local4 - 1, local9);
			this.method5361(134217728, local4, local9 + 1);
		}
		if (arg1 == 1) {
			this.method5361(41943040, local4, local9);
			this.method5361(134217728, local4, local9 + 1);
			this.method5361(536870912, local4 + 1, local9);
		}
		if (arg1 == 2) {
			this.method5361(167772160, local4, local9);
			this.method5361(536870912, local4 + 1, local9);
			this.method5361(8388608, local4, local9 - 1);
		}
		if (arg1 == 3) {
			this.method5361(671088640, local4, local9);
			this.method5361(8388608, local4, local9 - 1);
			this.method5361(33554432, local4 - 1, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V")
	public void method5359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt6536;
		@Pc(13) int local13 = arg1 - this.anInt6545;
		this.anIntArrayArray39[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZII)V")
	private void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray39[arg1][arg2] |= arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZBIZ)V")
	public void method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg5) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg1 - this.anInt6545;
		@Pc(29) int local29 = arg2 - this.anInt6536;
		for (@Pc(31) int local31 = local29; local31 < local29 + arg0; local31++) {
			if (local31 >= 0 && local31 < this.anInt6527) {
				for (@Pc(44) int local44 = local24; local44 < local24 + arg4; local44++) {
					if (local44 >= 0 && this.anInt6523 > local44) {
						this.method5361(local7, local31, local44);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZIIIII)V")
	public void method5364(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt6545;
		@Pc(9) int local9 = arg3 - this.anInt6536;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5369(local4, local9, 128);
				this.method5369(local4, local9 - 1, 8);
			}
			if (arg4 == 1) {
				this.method5369(local4, local9, 2);
				this.method5369(local4 + 1, local9, 32);
			}
			if (arg4 == 2) {
				this.method5369(local4, local9, 8);
				this.method5369(local4, local9 + 1, 128);
			}
			if (arg4 == 3) {
				this.method5369(local4, local9, 32);
				this.method5369(local4 - 1, local9, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5369(local4, local9, 1);
				this.method5369(local4 + 1, local9 + -1, 16);
			}
			if (arg4 == 1) {
				this.method5369(local4, local9, 4);
				this.method5369(local4 + 1, local9 + 1, 64);
			}
			if (arg4 == 2) {
				this.method5369(local4, local9, 16);
				this.method5369(local4 - 1, local9 + 1, 1);
			}
			if (arg4 == 3) {
				this.method5369(local4, local9, 64);
				this.method5369(local4 - 1, local9 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method5369(local4, local9, 130);
				this.method5369(local4, local9 - 1, 8);
				this.method5369(local4 + 1, local9, 32);
			}
			if (arg4 == 1) {
				this.method5369(local4, local9, 10);
				this.method5369(local4 + 1, local9, 32);
				this.method5369(local4, local9 + 1, 128);
			}
			if (arg4 == 2) {
				this.method5369(local4, local9, 40);
				this.method5369(local4, local9 + 1, 128);
				this.method5369(local4 - 1, local9, 2);
			}
			if (arg4 == 3) {
				this.method5369(local4, local9, 160);
				this.method5369(local4 - 1, local9, 2);
				this.method5369(local4, local9 - 1, 8);
			}
		}
		if (arg0) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method5369(local4, local9, 65536);
					this.method5369(local4, local9 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method5369(local4, local9, 1024);
					this.method5369(local4 + 1, local9, 16384);
				}
				if (arg4 == 2) {
					this.method5369(local4, local9, 4096);
					this.method5369(local4, local9 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method5369(local4, local9, 16384);
					this.method5369(local4 - 1, local9, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method5369(local4, local9, 512);
					this.method5369(local4 + 1, local9 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method5369(local4, local9, 2048);
					this.method5369(local4 + 1, local9 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method5369(local4, local9, 8192);
					this.method5369(local4 - 1, local9 - -1, 512);
				}
				if (arg4 == 3) {
					this.method5369(local4, local9, 32768);
					this.method5369(local4 - 1, local9 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method5369(local4, local9, 66560);
					this.method5369(local4, local9 - 1, 4096);
					this.method5369(local4 + 1, local9, 16384);
				}
				if (arg4 == 1) {
					this.method5369(local4, local9, 5120);
					this.method5369(local4 + 1, local9, 16384);
					this.method5369(local4, local9 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method5369(local4, local9, 20480);
					this.method5369(local4, local9 + 1, 65536);
					this.method5369(local4 - 1, local9, 1024);
				}
				if (arg4 == 3) {
					this.method5369(local4, local9, 81920);
					this.method5369(local4 - 1, local9, 1024);
					this.method5369(local4, local9 - 1, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5369(local4, local9, 536870912);
				this.method5369(local4, local9 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method5369(local4, local9, 8388608);
				this.method5369(local4 + 1, local9, 134217728);
			}
			if (arg4 == 2) {
				this.method5369(local4, local9, 33554432);
				this.method5369(local4, local9 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method5369(local4, local9, 134217728);
				this.method5369(local4 - 1, local9, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5369(local4, local9, 4194304);
				this.method5369(local4 + 1, local9 + -1, 67108864);
			}
			if (arg4 == 1) {
				this.method5369(local4, local9, 16777216);
				this.method5369(local4 + 1, local9 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method5369(local4, local9, 67108864);
				this.method5369(local4 - 1, local9 + 1, 4194304);
			}
			if (arg4 == 3) {
				this.method5369(local4, local9, 268435456);
				this.method5369(local4 - 1, local9 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5369(local4, local9, 545259520);
			this.method5369(local4, local9 - 1, 33554432);
			this.method5369(local4 + 1, local9, 134217728);
		}
		if (arg4 == 1) {
			this.method5369(local4, local9, 41943040);
			this.method5369(local4 + 1, local9, 134217728);
			this.method5369(local4, local9 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method5369(local4, local9, 167772160);
			this.method5369(local4, local9 + 1, 536870912);
			this.method5369(local4 - 1, local9, 8388608);
		}
		if (arg4 == 3) {
			this.method5369(local4, local9, 671088640);
			this.method5369(local4 - 1, local9, 8388608);
			this.method5369(local4, local9 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg5 == arg3 && arg1 == arg2) {
				return true;
			}
		} else if (arg3 <= arg5 && arg0 + arg3 - 1 >= arg5 && arg2 <= arg2 && arg0 + arg2 - 1 >= arg2) {
			return true;
		}
		@Pc(49) int local49 = arg2 - this.anInt6545;
		@Pc(54) int local54 = arg1 - this.anInt6545;
		@Pc(64) int local64 = arg5 - this.anInt6536;
		@Pc(69) int local69 = arg3 - this.anInt6536;
		if (arg0 == 1) {
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local64 - 1 == local69 && local49 == local54) {
						return true;
					}
					if (local64 == local69 && local49 + 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local69 && local54 == local49 - 1 && (this.anIntArrayArray39[local69][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 == local69 && local49 + 1 == local54) {
						return true;
					}
					if (local69 == local64 - 1 && local49 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local69 == local64 + 1 && local54 == local49) {
						return true;
					}
					if (local64 == local69 && local49 + 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 && local49 - 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 == local64 && local54 == local49 - 1) {
						return true;
					}
					if (local69 == local64 - 1 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local49 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local64 - 1 == local69 && local49 == local54) {
						return true;
					}
					if (local69 == local64 && local54 == local49 + 1) {
						return true;
					}
					if (local64 + 1 == local69 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local64 && local49 - 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local64 - 1 == local69 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 == local64 && local54 == local49 + 1) {
						return true;
					}
					if (local69 == local64 + 1 && local54 == local49) {
						return true;
					}
					if (local69 == local64 && local49 - 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 - 1 == local69 && local49 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local69 && local49 + 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local49 == local54) {
						return true;
					}
					if (local64 == local69 && local54 == local49 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 - 1 == local69 && local49 == local54) {
						return true;
					}
					if (local64 == local69 && local49 + 1 == local54 && (this.anIntArrayArray39[local69][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local69 == local64 + 1 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local69 == local64 && local49 - 1 == local54) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local69 == local64 && local54 == local49 + 1 && (this.anIntArrayArray39[local69][local54] & 0x20) == 0) {
					return true;
				}
				if (local69 == local64 && local54 == local49 - 1 && (this.anIntArrayArray39[local69][local54] & 0x2) == 0) {
					return true;
				}
				if (local69 == local64 - 1 && local54 == local49 && (this.anIntArrayArray39[local69][local54] & 0x8) == 0) {
					return true;
				}
				if (local69 == local64 + 1 && local49 == local54 && (this.anIntArrayArray39[local69][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(80) int local80 = arg0 + local69 - 1;
			@Pc(87) int local87 = local54 + arg0 - 1;
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local64 - arg0 == local69 && local49 >= local54 && local49 <= local87) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local54 == local49 + 1 && (this.anIntArrayArray39[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local54 == local49 - arg0 && (this.anIntArrayArray39[local64][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 <= local64 && local64 <= local80 && local54 == local49 + 1) {
						return true;
					}
					if (local69 == local64 - arg0 && local49 >= local54 && local87 >= local49 && (this.anIntArrayArray39[local80][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local49 >= local54 && local49 <= local87 && (this.anIntArrayArray39[local69][local49] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 + 1 == local69 && local49 >= local54 && local87 >= local49) {
						return true;
					}
					if (local64 >= local69 && local64 <= local80 && local54 == local49 + 1 && (this.anIntArrayArray39[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local80 && local49 - arg0 == local54 && (this.anIntArrayArray39[local64][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 <= local64 && local64 <= local80 && local49 - arg0 == local54) {
						return true;
					}
					if (local69 == local64 - arg0 && local54 <= local49 && local49 <= local87 && (this.anIntArrayArray39[local80][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local49 >= local54 && local49 <= local87 && (this.anIntArrayArray39[local69][local49] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local69 == local64 - arg0 && local49 >= local54 && local87 >= local49) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local49 + 1 == local54) {
						return true;
					}
					if (local69 == local64 + 1 && local54 <= local49 && local49 <= local87 && (this.anIntArrayArray39[local69][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local49 - arg0 == local54 && (this.anIntArrayArray39[local64][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 == local64 - arg0 && local54 <= local49 && local87 >= local49 && (this.anIntArrayArray39[local80][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local69 <= local64 && local64 <= local80 && local54 == local49 + 1) {
						return true;
					}
					if (local69 == local64 + 1 && local49 >= local54 && local87 >= local49) {
						return true;
					}
					if (local64 >= local69 && local64 <= local80 && local54 == local49 - arg0 && (this.anIntArrayArray39[local64][local87] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local64 - arg0 == local69 && local49 >= local54 && local49 <= local87 && (this.anIntArrayArray39[local80][local49] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local49 + 1 == local54 && (this.anIntArrayArray39[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local49 >= local54 && local87 >= local49) {
						return true;
					}
					if (local64 >= local69 && local64 <= local80 && local49 - arg0 == local54) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local64 - arg0 == local69 && local54 <= local49 && local87 >= local49) {
						return true;
					}
					if (local64 >= local69 && local80 >= local64 && local54 == local49 + 1 && (this.anIntArrayArray39[local64][local54] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 + 1 == local69 && local49 >= local54 && local49 <= local87 && (this.anIntArrayArray39[local69][local49] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 >= local69 && local64 <= local80 && local49 - arg0 == local54) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local64 >= local69 && local64 <= local80 && local54 == local49 + 1 && (this.anIntArrayArray39[local64][local54] & 0x2C0120) == 0) {
					return true;
				}
				if (local69 <= local64 && local80 >= local64 && local54 == local49 - arg0 && (this.anIntArrayArray39[local64][local87] & 0x2C0102) == 0) {
					return true;
				}
				if (local69 == local64 - arg0 && local54 <= local49 && local49 <= local87 && (this.anIntArrayArray39[local80][local49] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 + 1 == local69 && local49 >= local54 && local87 >= local49 && (this.anIntArrayArray39[local69][local49] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)V")
	public void method5366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6545;
		@Pc(13) int local13 = arg0 - this.anInt6536;
		this.anIntArrayArray39[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIBIII)Z")
	public boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static89.method1687(arg4, arg2, arg0, arg5, arg2, arg6, arg3, arg1) ? true : this.method5375(arg5, arg2, arg1, arg6, arg7, arg4, arg0, arg3, arg2);
		}
		@Pc(40) int local40 = arg6 + arg3 - 1;
		@Pc(46) int local46 = arg0 + arg1 - 1;
		if (arg4 >= arg6 && arg4 <= local40 && arg5 >= arg0 && local46 >= arg5) {
			return true;
		} else if (arg6 - 1 == arg4 && arg5 >= arg0 && local46 >= arg5 && (this.anIntArrayArray39[arg4 - this.anInt6536][arg5 - this.anInt6545] & 0x8) == 0 && (arg7 & 0x8) == 0) {
			return true;
		} else if (arg4 == local40 + 1 && arg0 <= arg5 && local46 >= arg5 && (this.anIntArrayArray39[arg4 - this.anInt6536][arg5 - this.anInt6545] & 0x80) == 0 && (arg7 & 0x2) == 0) {
			return true;
		} else if (arg5 == arg0 - 1 && arg6 <= arg4 && arg4 <= local40 && (this.anIntArrayArray39[arg4 - this.anInt6536][arg5 - this.anInt6545] & 0x2) == 0 && (arg7 & 0x4) == 0) {
			return true;
		} else {
			return arg5 == local46 + 1 && arg4 >= arg6 && local40 >= arg4 && (this.anIntArrayArray39[arg4 - this.anInt6536][arg5 - this.anInt6545] & 0x20) == 0 && (arg7 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method5368() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6527; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt6523; local9++) {
				if (local3 == 0 || local9 == 0 || local3 >= this.anInt6527 - 5 || this.anInt6523 - 5 <= local9) {
					this.anIntArrayArray39[local3][local9] = -1;
				} else {
					this.anIntArrayArray39[local3][local9] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)V")
	private void method5369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray39[arg1][arg0] &= ~arg2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZZIII)V")
	public void method5370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(23) int local23;
		if (arg4 == 1 || arg4 == 3) {
			local23 = arg1;
			arg1 = arg5;
			arg5 = local23;
		}
		@Pc(37) int local37 = arg6 - this.anInt6536;
		@Pc(42) int local42 = arg0 - this.anInt6545;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (local23 = local37; local23 < local37 + arg1; local23++) {
			if (local23 >= 0 && this.anInt6527 > local23) {
				for (@Pc(60) int local60 = local42; local60 < local42 + arg5; local60++) {
					if (local60 >= 0 && this.anInt6523 > local60) {
						this.method5369(local60, local23, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
	public void method5371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 - this.anInt6545;
		@Pc(20) int local20 = arg1 - this.anInt6536;
		this.anIntArrayArray39[local20][local15] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method5372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg4 == arg5 && arg1 == arg3) {
				return true;
			}
		} else if (arg4 <= arg5 && arg5 <= arg0 + arg4 - 1 && arg1 >= arg1 && arg1 + arg0 - 1 >= arg1) {
			return true;
		}
		@Pc(55) int local55 = arg5 - this.anInt6536;
		@Pc(60) int local60 = arg3 - this.anInt6545;
		@Pc(65) int local65 = arg1 - this.anInt6545;
		@Pc(70) int local70 = arg4 - this.anInt6536;
		if (arg0 == 1) {
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local70 == local55 + 1 && local65 == local60 && (this.anIntArrayArray39[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local55 == local70 && local65 - 1 == local60 && (this.anIntArrayArray39[local70][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local55 - 1 == local70 && local65 == local60 && (this.anIntArrayArray39[local70][local60] & 0x8) == 0) {
						return true;
					}
					if (local70 == local55 && local60 == local65 - 1 && (this.anIntArrayArray39[local70][local60] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local70 == local55 - 1 && local60 == local65 && (this.anIntArrayArray39[local70][local60] & 0x8) == 0) {
						return true;
					}
					if (local70 == local55 && local65 + 1 == local60 && (this.anIntArrayArray39[local70][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local70 == local55 + 1 && local65 == local60 && (this.anIntArrayArray39[local70][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 == local55 && local65 + 1 == local60 && (this.anIntArrayArray39[local70][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local70 == local55 && local65 + 1 == local60 && (this.anIntArrayArray39[local70][local60] & 0x20) == 0) {
					return true;
				}
				if (local55 == local70 && local65 - 1 == local60 && (this.anIntArrayArray39[local70][local60] & 0x2) == 0) {
					return true;
				}
				if (local70 == local55 - 1 && local65 == local60 && (this.anIntArrayArray39[local70][local60] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local70 && local60 == local65 && (this.anIntArrayArray39[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(397) int local397 = local70 + arg0 - 1;
			@Pc(404) int local404 = local60 + arg0 - 1;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg6 = arg6 + 2 & 0x3;
				}
				if (arg6 == 0) {
					if (local55 + 1 == local70 && local60 <= local65 && local65 <= local404 && (this.anIntArrayArray39[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local55 && local397 >= local55 && local65 - arg0 == local60 && (this.anIntArrayArray39[local55][local404] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local55 - arg0 == local70 && local65 >= local60 && local404 >= local65 && (this.anIntArrayArray39[local397][local65] & 0x8) == 0) {
						return true;
					}
					if (local70 <= local55 && local55 <= local397 && local65 - arg0 == local60 && (this.anIntArrayArray39[local55][local404] & 0x2) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local55 - arg0 == local70 && local65 >= local60 && local404 >= local65 && (this.anIntArrayArray39[local397][local65] & 0x8) == 0) {
						return true;
					}
					if (local55 >= local70 && local55 <= local397 && local60 == local65 + 1 && (this.anIntArrayArray39[local55][local60] & 0x20) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local70 == local55 + 1 && local60 <= local65 && local404 >= local65 && (this.anIntArrayArray39[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local55 >= local70 && local55 <= local397 && local60 == local65 + 1 && (this.anIntArrayArray39[local55][local60] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (local55 >= local70 && local397 >= local55 && local65 + 1 == local60 && (this.anIntArrayArray39[local55][local60] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local55 && local55 <= local397 && local65 - arg0 == local60 && (this.anIntArrayArray39[local55][local404] & 0x2) == 0) {
					return true;
				}
				if (local55 - arg0 == local70 && local65 >= local60 && local65 <= local404 && (this.anIntArrayArray39[local397][local65] & 0x8) == 0) {
					return true;
				}
				if (local55 + 1 == local70 && local65 >= local60 && local404 >= local65 && (this.anIntArrayArray39[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
	public void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt6545;
		@Pc(21) int local21 = arg1 - this.anInt6536;
		this.anIntArrayArray39[local21][local16] |= 0x40000;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIIB)Z")
	public boolean method5375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(9) int local9 = arg1 + arg5;
		@Pc(13) int local13 = arg8 + arg0;
		@Pc(17) int local17 = arg3 + arg7;
		@Pc(29) int local29 = arg2 + arg6;
		@Pc(51) int local51;
		@Pc(62) int local62;
		if (arg5 == local17 && (arg4 & 0x2) == 0) {
			local51 = arg6 < arg0 ? arg0 : arg6;
			local62 = local13 < local29 ? local13 : local29;
			while (local62 > local51) {
				if ((this.anIntArrayArray39[local17 - this.anInt6536 - 1][local51 - this.anInt6545] & 0x8) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local9 == arg3 && (arg4 & 0x8) == 0) {
			local51 = arg6 < arg0 ? arg0 : arg6;
			local62 = local13 < local29 ? local13 : local29;
			while (local51 < local62) {
				if ((this.anIntArrayArray39[arg3 - this.anInt6536][local51 - this.anInt6545] & 0x80) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local29 == arg0 && (arg4 & 0x1) == 0) {
			local51 = arg3 >= arg5 ? arg3 : arg5;
			local62 = local9 < local17 ? local9 : local17;
			while (local51 < local62) {
				if ((this.anIntArrayArray39[local51 - this.anInt6536][local29 - this.anInt6545 - 1] & 0x2) == 0) {
					return true;
				}
				local51++;
			}
		} else if (local13 == arg6 && (arg4 & 0x4) == 0) {
			local51 = arg3 >= arg5 ? arg3 : arg5;
			local62 = local9 >= local17 ? local17 : local9;
			while (local62 > local51) {
				if ((this.anIntArrayArray39[local51 - this.anInt6536][arg6 - this.anInt6545] & 0x20) == 0) {
					return true;
				}
				local51++;
			}
		}
		return false;
	}
}
