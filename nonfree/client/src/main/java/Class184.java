import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class184 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public int anInt5438;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public int anInt5439;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public int anInt5440;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public int anInt5447;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIII)V")
	public void method4583(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		@Pc(32) int local32 = arg5 - this.anInt5439;
		@Pc(37) int local37 = arg2 - this.anInt5440;
		for (@Pc(39) int local39 = local32; local39 < local32 + arg4; local39++) {
			if (local39 >= 0 && local39 < this.anInt5447) {
				for (@Pc(49) int local49 = local37; local49 < local37 + arg3; local49++) {
					if (local49 >= 0 && local49 < this.anInt5438) {
						this.method4585(local39, local49, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIZII)V")
	public void method4584(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(37) int local37;
		if (arg1 == 1 || arg1 == 3) {
			local37 = arg3;
			arg3 = arg6;
			arg6 = local37;
		}
		@Pc(46) int local46 = arg2 - this.anInt5439;
		@Pc(51) int local51 = arg5 - this.anInt5440;
		for (local37 = local46; local37 < local46 + arg3; local37++) {
			if (local37 >= 0 && local37 < this.anInt5447) {
				for (@Pc(67) int local67 = local51; local67 < arg6 + local51; local67++) {
					if (local67 >= 0 && this.anInt5438 > local67) {
						this.method4590(local37, local67, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	private void method4585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray51[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIZIII)Z")
	public boolean method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg1 && arg5 == arg0) {
				return true;
			}
		} else if (arg2 <= arg1 && arg1 <= arg2 + arg6 - 1 && arg0 <= arg0 && arg6 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(54) int local54 = arg0 - this.anInt5440;
		@Pc(59) int local59 = arg1 - this.anInt5439;
		@Pc(64) int local64 = arg2 - this.anInt5439;
		@Pc(74) int local74 = arg5 - this.anInt5440;
		if (arg6 == 1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local64 == local59 - 1 && local54 == local74) {
						return true;
					}
					if (local64 == local59 && local74 == local54 + 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 && local74 == local54 - 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 == local59 && local74 == local54 + 1) {
						return true;
					}
					if (local59 - 1 == local64 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 == local59 + 1 && local74 == local54) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local74 && (this.anIntArrayArray51[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 && local74 == local54 - 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 == local64 && local54 - 1 == local74) {
						return true;
					}
					if (local64 == local59 - 1 && local54 == local74 && (this.anIntArrayArray51[local64][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local59 - 1 == local64 && local54 == local74) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local74) {
						return true;
					}
					if (local64 == local59 + 1 && local54 == local74 && (this.anIntArrayArray51[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 == local64 && local74 == local54 - 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 == local59 - 1 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local64 && local74 == local54 + 1) {
						return true;
					}
					if (local64 == local59 + 1 && local54 == local74) {
						return true;
					}
					if (local59 == local64 && local74 == local54 - 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 - 1 == local64 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 == local64 && local74 == local54 + 1 && (this.anIntArrayArray51[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 == local74) {
						return true;
					}
					if (local64 == local59 && local74 == local54 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local59 - 1 && local54 == local74) {
						return true;
					}
					if (local59 == local64 && local54 + 1 == local74 && (this.anIntArrayArray51[local64][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local64 == local59 && local74 == local54 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local64 == local59 && local74 == local54 + 1 && (this.anIntArrayArray51[local64][local74] & 0x20) == 0) {
					return true;
				}
				if (local64 == local59 && local54 - 1 == local74 && (this.anIntArrayArray51[local64][local74] & 0x2) == 0) {
					return true;
				}
				if (local59 - 1 == local64 && local74 == local54 && (this.anIntArrayArray51[local64][local74] & 0x8) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local54 == local74 && (this.anIntArrayArray51[local64][local74] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(771) int local771 = arg6 + local64 - 1;
			@Pc(778) int local778 = local74 + arg6 - 1;
			if (arg4 == 0) {
				if (arg3 == 0) {
					if (local64 == local59 - arg6 && local54 >= local74 && local778 >= local54) {
						return true;
					}
					if (local59 >= local64 && local59 <= local771 && local74 == local54 + 1 && (this.anIntArrayArray51[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local771 && local54 - arg6 == local74 && (this.anIntArrayArray51[local59][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 >= local64 && local59 <= local771 && local54 + 1 == local74) {
						return true;
					}
					if (local59 - arg6 == local64 && local74 <= local54 && local778 >= local54 && (this.anIntArrayArray51[local771][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local54 >= local74 && local778 >= local54 && (this.anIntArrayArray51[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 + 1 == local64 && local74 <= local54 && local778 >= local54) {
						return true;
					}
					if (local64 <= local59 && local771 >= local59 && local74 == local54 + 1 && (this.anIntArrayArray51[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local771 && local54 - arg6 == local74 && (this.anIntArrayArray51[local59][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local59 >= local64 && local59 <= local771 && local54 - arg6 == local74) {
						return true;
					}
					if (local59 - arg6 == local64 && local74 <= local54 && local54 <= local778 && (this.anIntArrayArray51[local771][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local59 + 1 == local64 && local54 >= local74 && local54 <= local778 && (this.anIntArrayArray51[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					if (local59 - arg6 == local64 && local74 <= local54 && local54 <= local778) {
						return true;
					}
					if (local59 >= local64 && local771 >= local59 && local54 + 1 == local74) {
						return true;
					}
					if (local59 + 1 == local64 && local74 <= local54 && local54 <= local778 && (this.anIntArrayArray51[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local64 && local59 <= local771 && local54 - arg6 == local74 && (this.anIntArrayArray51[local59][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local59 - arg6 == local64 && local74 <= local54 && local54 <= local778 && (this.anIntArrayArray51[local771][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local59 && local771 >= local59 && local74 == local54 + 1) {
						return true;
					}
					if (local59 + 1 == local64 && local54 >= local74 && local778 >= local54) {
						return true;
					}
					if (local64 <= local59 && local771 >= local59 && local74 == local54 - arg6 && (this.anIntArrayArray51[local59][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local59 - arg6 == local64 && local54 >= local74 && local778 >= local54 && (this.anIntArrayArray51[local771][local54] & 0x2C0108) == 0) {
						return true;
					}
					if (local64 <= local59 && local771 >= local59 && local54 + 1 == local74 && (this.anIntArrayArray51[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local74 <= local54 && local54 <= local778) {
						return true;
					}
					if (local64 <= local59 && local771 >= local59 && local74 == local54 - arg6) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local59 - arg6 && local74 <= local54 && local54 <= local778) {
						return true;
					}
					if (local59 >= local64 && local59 <= local771 && local54 + 1 == local74 && (this.anIntArrayArray51[local59][local74] & 0x2C0120) == 0) {
						return true;
					}
					if (local64 == local59 + 1 && local54 >= local74 && local54 <= local778 && (this.anIntArrayArray51[local64][local54] & 0x2C0180) == 0) {
						return true;
					}
					if (local59 >= local64 && local771 >= local59 && local54 - arg6 == local74) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local59 >= local64 && local59 <= local771 && local74 == local54 + 1 && (this.anIntArrayArray51[local59][local74] & 0x2C0120) == 0) {
					return true;
				}
				if (local64 <= local59 && local771 >= local59 && local74 == local54 - arg6 && (this.anIntArrayArray51[local59][local778] & 0x2C0102) == 0) {
					return true;
				}
				if (local59 - arg6 == local64 && local74 <= local54 && local54 <= local778 && (this.anIntArrayArray51[local771][local54] & 0x2C0108) == 0) {
					return true;
				}
				if (local64 == local59 + 1 && local54 >= local74 && local778 >= local54 && (this.anIntArrayArray51[local64][local54] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public void method4588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5439;
		@Pc(9) int local9 = arg1 - this.anInt5440;
		this.anIntArrayArray51[local4][local9] |= 0x200000;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZZZIII)V")
	public void method4589(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt5440;
		@Pc(9) int local9 = arg4 - this.anInt5439;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method4585(local9, local4, 128);
				this.method4585(local9 - 1, local4, 8);
			}
			if (arg3 == 1) {
				this.method4585(local9, local4, 2);
				this.method4585(local9, local4 + 1, 32);
			}
			if (arg3 == 2) {
				this.method4585(local9, local4, 8);
				this.method4585(local9 + 1, local4, 128);
			}
			if (arg3 == 3) {
				this.method4585(local9, local4, 32);
				this.method4585(local9, local4 - 1, 2);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method4585(local9, local4, 1);
				this.method4585(local9 - 1, local4 + 1, 16);
			}
			if (arg3 == 1) {
				this.method4585(local9, local4, 4);
				this.method4585(local9 + 1, local4 - -1, 64);
			}
			if (arg3 == 2) {
				this.method4585(local9, local4, 16);
				this.method4585(local9 + 1, local4 + -1, 1);
			}
			if (arg3 == 3) {
				this.method4585(local9, local4, 64);
				this.method4585(local9 - 1, local4 - 1, 4);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method4585(local9, local4, 130);
				this.method4585(local9 - 1, local4, 8);
				this.method4585(local9, local4 + 1, 32);
			}
			if (arg3 == 1) {
				this.method4585(local9, local4, 10);
				this.method4585(local9, local4 + 1, 32);
				this.method4585(local9 + 1, local4, 128);
			}
			if (arg3 == 2) {
				this.method4585(local9, local4, 40);
				this.method4585(local9 + 1, local4, 128);
				this.method4585(local9, local4 - 1, 2);
			}
			if (arg3 == 3) {
				this.method4585(local9, local4, 160);
				this.method4585(local9, local4 - 1, 2);
				this.method4585(local9 - 1, local4, 8);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					this.method4585(local9, local4, 65536);
					this.method4585(local9 - 1, local4, 4096);
				}
				if (arg3 == 1) {
					this.method4585(local9, local4, 1024);
					this.method4585(local9, local4 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method4585(local9, local4, 4096);
					this.method4585(local9 + 1, local4, 65536);
				}
				if (arg3 == 3) {
					this.method4585(local9, local4, 16384);
					this.method4585(local9, local4 - 1, 1024);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg3 == 0) {
					this.method4585(local9, local4, 512);
					this.method4585(local9 - 1, local4 + 1, 8192);
				}
				if (arg3 == 1) {
					this.method4585(local9, local4, 2048);
					this.method4585(local9 + 1, local4 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method4585(local9, local4, 8192);
					this.method4585(local9 + 1, local4 + -1, 512);
				}
				if (arg3 == 3) {
					this.method4585(local9, local4, 32768);
					this.method4585(local9 - 1, local4 - 1, 2048);
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					this.method4585(local9, local4, 66560);
					this.method4585(local9 - 1, local4, 4096);
					this.method4585(local9, local4 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method4585(local9, local4, 5120);
					this.method4585(local9, local4 + 1, 16384);
					this.method4585(local9 + 1, local4, 65536);
				}
				if (arg3 == 2) {
					this.method4585(local9, local4, 20480);
					this.method4585(local9 + 1, local4, 65536);
					this.method4585(local9, local4 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method4585(local9, local4, 81920);
					this.method4585(local9, local4 - 1, 1024);
					this.method4585(local9 - 1, local4, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method4585(local9, local4, 536870912);
				this.method4585(local9 - 1, local4, 33554432);
			}
			if (arg3 == 1) {
				this.method4585(local9, local4, 8388608);
				this.method4585(local9, local4 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method4585(local9, local4, 33554432);
				this.method4585(local9 + 1, local4, 536870912);
			}
			if (arg3 == 3) {
				this.method4585(local9, local4, 134217728);
				this.method4585(local9, local4 - 1, 8388608);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method4585(local9, local4, 4194304);
				this.method4585(local9 - 1, local4 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method4585(local9, local4, 16777216);
				this.method4585(local9 + 1, local4 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method4585(local9, local4, 67108864);
				this.method4585(local9 + 1, local4 + -1, 4194304);
			}
			if (arg3 == 3) {
				this.method4585(local9, local4, 268435456);
				this.method4585(local9 - 1, local4 - 1, 16777216);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method4585(local9, local4, 545259520);
			this.method4585(local9 - 1, local4, 33554432);
			this.method4585(local9, local4 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method4585(local9, local4, 41943040);
			this.method4585(local9, local4 + 1, 134217728);
			this.method4585(local9 + 1, local4, 536870912);
		}
		if (arg3 == 2) {
			this.method4585(local9, local4, 167772160);
			this.method4585(local9 + 1, local4, 536870912);
			this.method4585(local9, local4 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method4585(local9, local4, 671088640);
			this.method4585(local9, local4 - 1, 8388608);
			this.method4585(local9 - 1, local4, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V")
	private void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray51[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method4591() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5447; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt5438; local19++) {
				if (local15 == 0 || local19 == 0 || local15 >= this.anInt5447 - 5 || local19 >= this.anInt5438 - 5) {
					this.anIntArrayArray51[local15][local19] = -1;
				} else {
					this.anIntArrayArray51[local15][local19] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method4592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 1) {
			if (arg6 == arg5 && arg0 == arg2) {
				return true;
			}
		} else if (arg5 <= arg6 && arg3 + arg5 - 1 >= arg6 && arg2 >= arg2 && arg2 <= arg2 + arg3 - 1) {
			return true;
		}
		@Pc(57) int local57 = arg5 - this.anInt5439;
		@Pc(62) int local62 = arg0 - this.anInt5440;
		@Pc(80) int local80 = arg6 - this.anInt5439;
		@Pc(85) int local85 = arg2 - this.anInt5440;
		if (arg3 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local57 == local80 + 1 && local62 == local85 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local80 == local57 && local62 == local85 - 1 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 == local80 - 1 && local85 == local62 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local57 == local80 && local62 == local85 - 1 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local80 - 1 == local57 && local62 == local85 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
						return true;
					}
					if (local80 == local57 && local62 == local85 + 1 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 == local80 + 1 && local62 == local85 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
						return true;
					}
					if (local57 == local80 && local62 == local85 + 1 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local57 == local80 && local62 == local85 + 1 && (this.anIntArrayArray51[local57][local62] & 0x20) == 0) {
					return true;
				}
				if (local80 == local57 && local62 == local85 - 1 && (this.anIntArrayArray51[local57][local62] & 0x2) == 0) {
					return true;
				}
				if (local80 - 1 == local57 && local85 == local62 && (this.anIntArrayArray51[local57][local62] & 0x8) == 0) {
					return true;
				}
				if (local80 + 1 == local57 && local62 == local85 && (this.anIntArrayArray51[local57][local62] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(96) int local96 = local57 + arg3 - 1;
			@Pc(102) int local102 = arg3 + local62 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local80 + 1 == local57 && local62 <= local85 && local102 >= local85 && (this.anIntArrayArray51[local57][local85] & 0x80) == 0) {
						return true;
					}
					if (local80 >= local57 && local96 >= local80 && local62 == local85 - arg3 && (this.anIntArrayArray51[local80][local102] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local57 == local80 - arg3 && local85 >= local62 && local102 >= local85 && (this.anIntArrayArray51[local96][local85] & 0x8) == 0) {
						return true;
					}
					if (local80 >= local57 && local96 >= local80 && local62 == local85 - arg3 && (this.anIntArrayArray51[local80][local102] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local80 - arg3 == local57 && local62 <= local85 && local102 >= local85 && (this.anIntArrayArray51[local96][local85] & 0x8) == 0) {
						return true;
					}
					if (local57 <= local80 && local96 >= local80 && local85 + 1 == local62 && (this.anIntArrayArray51[local80][local62] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local57 == local80 + 1 && local62 <= local85 && local85 <= local102 && (this.anIntArrayArray51[local57][local85] & 0x80) == 0) {
						return true;
					}
					if (local57 <= local80 && local96 >= local80 && local62 == local85 + 1 && (this.anIntArrayArray51[local80][local62] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local80 >= local57 && local80 <= local96 && local85 + 1 == local62 && (this.anIntArrayArray51[local80][local62] & 0x20) == 0) {
					return true;
				}
				if (local57 <= local80 && local80 <= local96 && local62 == local85 - arg3 && (this.anIntArrayArray51[local80][local102] & 0x2) == 0) {
					return true;
				}
				if (local80 - arg3 == local57 && local62 <= local85 && local102 >= local85 && (this.anIntArrayArray51[local96][local85] & 0x8) == 0) {
					return true;
				}
				if (local80 + 1 == local57 && local62 <= local85 && local85 <= local102 && (this.anIntArrayArray51[local57][local85] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	public void method4593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5440;
		@Pc(13) int local13 = arg1 - this.anInt5439;
		this.anIntArrayArray51[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIIII)Z")
	public boolean method4594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static176.method3493(arg1, arg3, arg7, arg4, arg2, arg5, arg4, arg0) ? true : this.method4598(arg4, arg6, arg2, arg1, arg7, arg4, arg0, arg3, arg5);
		}
		@Pc(40) int local40 = arg3 + arg2 - 1;
		@Pc(46) int local46 = arg0 + arg5 - 1;
		if (arg1 >= arg2 && local40 >= arg1 && arg7 >= arg0 && local46 >= arg7) {
			return true;
		} else if (arg2 - 1 == arg1 && arg0 <= arg7 && local46 >= arg7 && (this.anIntArrayArray51[arg1 - this.anInt5439][arg7 - this.anInt5440] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local40 + 1 == arg1 && arg0 <= arg7 && local46 >= arg7 && (this.anIntArrayArray51[arg1 - this.anInt5439][arg7 - this.anInt5440] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg7 == arg0 - 1 && arg2 <= arg1 && local40 >= arg1 && (this.anIntArrayArray51[arg1 - this.anInt5439][arg7 - this.anInt5440] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local46 + 1 && arg2 <= arg1 && arg1 <= local40 && (this.anIntArrayArray51[arg1 - this.anInt5439][arg7 - this.anInt5440] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZIIIIZ)V")
	public void method4595(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg5 - this.anInt5439;
		@Pc(19) int local19 = arg2 - this.anInt5440;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method4590(local10, local19, 128);
				this.method4590(local10 - 1, local19, 8);
			}
			if (arg3 == 1) {
				this.method4590(local10, local19, 2);
				this.method4590(local10, local19 + 1, 32);
			}
			if (arg3 == 2) {
				this.method4590(local10, local19, 8);
				this.method4590(local10 + 1, local19, 128);
			}
			if (arg3 == 3) {
				this.method4590(local10, local19, 32);
				this.method4590(local10, local19 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method4590(local10, local19, 1);
				this.method4590(local10 - 1, local19 - -1, 16);
			}
			if (arg3 == 1) {
				this.method4590(local10, local19, 4);
				this.method4590(local10 + 1, local19 + 1, 64);
			}
			if (arg3 == 2) {
				this.method4590(local10, local19, 16);
				this.method4590(local10 + 1, local19 - 1, 1);
			}
			if (arg3 == 3) {
				this.method4590(local10, local19, 64);
				this.method4590(local10 - 1, local19 - 1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method4590(local10, local19, 130);
				this.method4590(local10 - 1, local19, 8);
				this.method4590(local10, local19 + 1, 32);
			}
			if (arg3 == 1) {
				this.method4590(local10, local19, 10);
				this.method4590(local10, local19 + 1, 32);
				this.method4590(local10 + 1, local19, 128);
			}
			if (arg3 == 2) {
				this.method4590(local10, local19, 40);
				this.method4590(local10 + 1, local19, 128);
				this.method4590(local10, local19 - 1, 2);
			}
			if (arg3 == 3) {
				this.method4590(local10, local19, 160);
				this.method4590(local10, local19 - 1, 2);
				this.method4590(local10 - 1, local19, 8);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method4590(local10, local19, 65536);
					this.method4590(local10 - 1, local19, 4096);
				}
				if (arg3 == 1) {
					this.method4590(local10, local19, 1024);
					this.method4590(local10, local19 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method4590(local10, local19, 4096);
					this.method4590(local10 + 1, local19, 65536);
				}
				if (arg3 == 3) {
					this.method4590(local10, local19, 16384);
					this.method4590(local10, local19 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method4590(local10, local19, 512);
					this.method4590(local10 - 1, local19 + 1, 8192);
				}
				if (arg3 == 1) {
					this.method4590(local10, local19, 2048);
					this.method4590(local10 + 1, local19 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method4590(local10, local19, 8192);
					this.method4590(local10 + 1, local19 - 1, 512);
				}
				if (arg3 == 3) {
					this.method4590(local10, local19, 32768);
					this.method4590(local10 - 1, local19 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method4590(local10, local19, 66560);
					this.method4590(local10 - 1, local19, 4096);
					this.method4590(local10, local19 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method4590(local10, local19, 5120);
					this.method4590(local10, local19 + 1, 16384);
					this.method4590(local10 + 1, local19, 65536);
				}
				if (arg3 == 2) {
					this.method4590(local10, local19, 20480);
					this.method4590(local10 + 1, local19, 65536);
					this.method4590(local10, local19 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method4590(local10, local19, 81920);
					this.method4590(local10, local19 - 1, 1024);
					this.method4590(local10 - 1, local19, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method4590(local10, local19, 536870912);
				this.method4590(local10 - 1, local19, 33554432);
			}
			if (arg3 == 1) {
				this.method4590(local10, local19, 8388608);
				this.method4590(local10, local19 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method4590(local10, local19, 33554432);
				this.method4590(local10 + 1, local19, 536870912);
			}
			if (arg3 == 3) {
				this.method4590(local10, local19, 134217728);
				this.method4590(local10, local19 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method4590(local10, local19, 4194304);
				this.method4590(local10 - 1, local19 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method4590(local10, local19, 16777216);
				this.method4590(local10 + 1, local19 - -1, 268435456);
			}
			if (arg3 == 2) {
				this.method4590(local10, local19, 67108864);
				this.method4590(local10 + 1, local19 + -1, 4194304);
			}
			if (arg3 == 3) {
				this.method4590(local10, local19, 268435456);
				this.method4590(local10 - 1, local19 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method4590(local10, local19, 545259520);
			this.method4590(local10 - 1, local19, 33554432);
			this.method4590(local10, local19 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method4590(local10, local19, 41943040);
			this.method4590(local10, local19 + 1, 134217728);
			this.method4590(local10 + 1, local19, 536870912);
		}
		if (arg3 == 2) {
			this.method4590(local10, local19, 167772160);
			this.method4590(local10 + 1, local19, 536870912);
			this.method4590(local10, local19 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method4590(local10, local19, 671088640);
			this.method4590(local10, local19 - 1, 8388608);
			this.method4590(local10 - 1, local19, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
	public void method4597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt5440;
		@Pc(13) int local13 = arg1 - this.anInt5439;
		this.anIntArrayArray51[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIIIIIII)Z")
	public boolean method4598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg5 + arg3;
		@Pc(19) int local19 = arg0 + arg4;
		@Pc(23) int local23 = arg2 + arg7;
		@Pc(28) int local28 = arg6 + arg8;
		@Pc(49) int local49;
		@Pc(60) int local60;
		if (local23 == arg3 && (arg1 & 0x2) == 0) {
			local49 = arg6 < arg4 ? arg4 : arg6;
			local60 = local28 <= local19 ? local28 : local19;
			while (local49 < local60) {
				if ((this.anIntArrayArray51[local23 - this.anInt5439 - 1][local49 - this.anInt5440] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local15 == arg2 && (arg1 & 0x8) == 0) {
			local49 = arg6 < arg4 ? arg4 : arg6;
			local60 = local28 <= local19 ? local28 : local19;
			while (local49 < local60) {
				if ((this.anIntArrayArray51[arg2 - this.anInt5439][local49 - this.anInt5440] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg4 == local28 && (arg1 & 0x1) == 0) {
			local49 = arg2 >= arg3 ? arg2 : arg3;
			local60 = local23 <= local15 ? local23 : local15;
			while (local49 < local60) {
				if ((this.anIntArrayArray51[local49 - this.anInt5439][local28 - this.anInt5440 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local19 == arg6 && (arg1 & 0x4) == 0) {
			local49 = arg3 <= arg2 ? arg2 : arg3;
			local60 = local15 >= local23 ? local23 : local15;
			while (local60 > local49) {
				if ((this.anIntArrayArray51[local49 - this.anInt5439][arg6 - this.anInt5440] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(III)V")
	public void method4599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt5440;
		@Pc(9) int local9 = arg0 - this.anInt5439;
		this.anIntArrayArray51[local9][local4] &= 0xFFDFFFFF;
	}
}
