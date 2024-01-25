import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class240 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public int anInt6841;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public int anInt6844;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	public int anInt6848;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	public int anInt6854;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt6844;
		@Pc(13) int local13 = arg1 - this.anInt6848;
		this.anIntArrayArray60[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZIZII)V")
	public void method5406(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg2 - this.anInt6844;
		@Pc(29) int local29 = arg0 - this.anInt6848;
		for (@Pc(31) int local31 = local29; local31 < arg5 + local29; local31++) {
			if (local31 >= 0 && this.anInt6854 > local31) {
				for (@Pc(41) int local41 = local24; local41 < local24 + arg4; local41++) {
					if (local41 >= 0 && this.anInt6841 > local41) {
						this.method5413(local41, local31, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIZZ)V")
	public void method5409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt6844;
		@Pc(36) int local36;
		if (arg0 == 1 || arg0 == 3) {
			local36 = arg1;
			arg1 = arg4;
			arg4 = local36;
		}
		@Pc(45) int local45 = arg2 - this.anInt6848;
		for (local36 = local45; local36 < arg1 + local45; local36++) {
			if (local36 >= 0 && local36 < this.anInt6854) {
				for (@Pc(64) int local64 = local24; local64 < local24 + arg4; local64++) {
					if (local64 >= 0 && this.anInt6841 > local64) {
						this.method5419(local36, local7, local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method5410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg6 == arg4 && arg1 == arg2) {
				return true;
			}
		} else if (arg4 >= arg6 && arg6 + arg5 - 1 >= arg4 && arg2 <= arg2 && arg2 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(54) int local54 = arg1 - this.anInt6844;
		@Pc(59) int local59 = arg2 - this.anInt6844;
		@Pc(64) int local64 = arg6 - this.anInt6848;
		@Pc(69) int local69 = arg4 - this.anInt6848;
		if (arg5 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local64 == local69 + 1 && local54 == local59 && (this.anIntArrayArray60[local64][local54] & 0x80) == 0) {
						return true;
					}
					if (local64 == local69 && local54 == local59 - 1 && (this.anIntArrayArray60[local64][local54] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local69 - 1 == local64 && local59 == local54 && (this.anIntArrayArray60[local64][local54] & 0x8) == 0) {
						return true;
					}
					if (local69 == local64 && local54 == local59 - 1 && (this.anIntArrayArray60[local64][local54] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local69 - 1 == local64 && local59 == local54 && (this.anIntArrayArray60[local64][local54] & 0x8) == 0) {
						return true;
					}
					if (local69 == local64 && local59 + 1 == local54 && (this.anIntArrayArray60[local64][local54] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local69 + 1 == local64 && local54 == local59 && (this.anIntArrayArray60[local64][local54] & 0x80) == 0) {
						return true;
					}
					if (local69 == local64 && local54 == local59 + 1 && (this.anIntArrayArray60[local64][local54] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local69 == local64 && local54 == local59 + 1 && (this.anIntArrayArray60[local64][local54] & 0x20) == 0) {
					return true;
				}
				if (local69 == local64 && local54 == local59 - 1 && (this.anIntArrayArray60[local64][local54] & 0x2) == 0) {
					return true;
				}
				if (local64 == local69 - 1 && local54 == local59 && (this.anIntArrayArray60[local64][local54] & 0x8) == 0) {
					return true;
				}
				if (local64 == local69 + 1 && local59 == local54 && (this.anIntArrayArray60[local64][local54] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(434) int local434 = local64 + arg5 - 1;
			@Pc(440) int local440 = arg5 + local54 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local69 + 1 == local64 && local54 <= local59 && local440 >= local59 && (this.anIntArrayArray60[local64][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 <= local69 && local69 <= local434 && local59 - arg5 == local54 && (this.anIntArrayArray60[local69][local440] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local64 == local69 - arg5 && local54 <= local59 && local59 <= local440 && (this.anIntArrayArray60[local434][local59] & 0x8) == 0) {
						return true;
					}
					if (local64 <= local69 && local69 <= local434 && local59 - arg5 == local54 && (this.anIntArrayArray60[local69][local440] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local64 == local69 - arg5 && local54 <= local59 && local440 >= local59 && (this.anIntArrayArray60[local434][local59] & 0x8) == 0) {
						return true;
					}
					if (local69 >= local64 && local434 >= local69 && local59 + 1 == local54 && (this.anIntArrayArray60[local69][local54] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local64 == local69 + 1 && local54 <= local59 && local440 >= local59 && (this.anIntArrayArray60[local64][local59] & 0x80) == 0) {
						return true;
					}
					if (local64 <= local69 && local69 <= local434 && local54 == local59 + 1 && (this.anIntArrayArray60[local69][local54] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local69 >= local64 && local434 >= local69 && local59 + 1 == local54 && (this.anIntArrayArray60[local69][local54] & 0x20) == 0) {
					return true;
				}
				if (local64 <= local69 && local434 >= local69 && local54 == local59 - arg5 && (this.anIntArrayArray60[local69][local440] & 0x2) == 0) {
					return true;
				}
				if (local69 - arg5 == local64 && local59 >= local54 && local440 >= local59 && (this.anIntArrayArray60[local434][local59] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local64 && local54 <= local59 && local59 <= local440 && (this.anIntArrayArray60[local64][local59] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIZZI)V")
	public void method5411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt6844;
		@Pc(21) int local21 = arg0 - this.anInt6848;
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method5419(local21, 128, local4);
				this.method5419(local21 - 1, 8, local4);
			}
			if (arg1 == 1) {
				this.method5419(local21, 2, local4);
				this.method5419(local21, 32, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5419(local21, 8, local4);
				this.method5419(local21 + 1, 128, local4);
			}
			if (arg1 == 3) {
				this.method5419(local21, 32, local4);
				this.method5419(local21, 2, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method5419(local21, 1, local4);
				this.method5419(local21 - 1, 16, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5419(local21, 4, local4);
				this.method5419(local21 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5419(local21, 16, local4);
				this.method5419(local21 + 1, 1, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5419(local21, 64, local4);
				this.method5419(local21 - 1, 4, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg1 == 0) {
				this.method5419(local21, 130, local4);
				this.method5419(local21 - 1, 8, local4);
				this.method5419(local21, 32, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5419(local21, 10, local4);
				this.method5419(local21, 32, local4 + 1);
				this.method5419(local21 + 1, 128, local4);
			}
			if (arg1 == 2) {
				this.method5419(local21, 40, local4);
				this.method5419(local21 + 1, 128, local4);
				this.method5419(local21, 2, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5419(local21, 160, local4);
				this.method5419(local21, 2, local4 - 1);
				this.method5419(local21 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method5419(local21, 65536, local4);
					this.method5419(local21 - 1, 4096, local4);
				}
				if (arg1 == 1) {
					this.method5419(local21, 1024, local4);
					this.method5419(local21, 16384, local4 + 1);
				}
				if (arg1 == 2) {
					this.method5419(local21, 4096, local4);
					this.method5419(local21 + 1, 65536, local4);
				}
				if (arg1 == 3) {
					this.method5419(local21, 16384, local4);
					this.method5419(local21, 1024, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method5419(local21, 512, local4);
					this.method5419(local21 - 1, 8192, local4 + 1);
				}
				if (arg1 == 1) {
					this.method5419(local21, 2048, local4);
					this.method5419(local21 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method5419(local21, 8192, local4);
					this.method5419(local21 + 1, 512, local4 - 1);
				}
				if (arg1 == 3) {
					this.method5419(local21, 32768, local4);
					this.method5419(local21 - 1, 2048, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method5419(local21, 66560, local4);
					this.method5419(local21 - 1, 4096, local4);
					this.method5419(local21, 16384, local4 + 1);
				}
				if (arg1 == 1) {
					this.method5419(local21, 5120, local4);
					this.method5419(local21, 16384, local4 + 1);
					this.method5419(local21 + 1, 65536, local4);
				}
				if (arg1 == 2) {
					this.method5419(local21, 20480, local4);
					this.method5419(local21 + 1, 65536, local4);
					this.method5419(local21, 1024, local4 - 1);
				}
				if (arg1 == 3) {
					this.method5419(local21, 81920, local4);
					this.method5419(local21, 1024, local4 - 1);
					this.method5419(local21 - 1, 4096, local4);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg1 == 0) {
				this.method5419(local21, 536870912, local4);
				this.method5419(local21 - 1, 33554432, local4);
			}
			if (arg1 == 1) {
				this.method5419(local21, 8388608, local4);
				this.method5419(local21, 134217728, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5419(local21, 33554432, local4);
				this.method5419(local21 + 1, 536870912, local4);
			}
			if (arg1 == 3) {
				this.method5419(local21, 134217728, local4);
				this.method5419(local21, 8388608, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg1 == 0) {
				this.method5419(local21, 4194304, local4);
				this.method5419(local21 - 1, 67108864, local4 + 1);
			}
			if (arg1 == 1) {
				this.method5419(local21, 16777216, local4);
				this.method5419(local21 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method5419(local21, 67108864, local4);
				this.method5419(local21 + 1, 4194304, local4 - 1);
			}
			if (arg1 == 3) {
				this.method5419(local21, 268435456, local4);
				this.method5419(local21 - 1, 16777216, local4 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method5419(local21, 545259520, local4);
			this.method5419(local21 - 1, 33554432, local4);
			this.method5419(local21, 134217728, local4 + 1);
		}
		if (arg1 == 1) {
			this.method5419(local21, 41943040, local4);
			this.method5419(local21, 134217728, local4 + 1);
			this.method5419(local21 + 1, 536870912, local4);
		}
		if (arg1 == 2) {
			this.method5419(local21, 167772160, local4);
			this.method5419(local21 + 1, 536870912, local4);
			this.method5419(local21, 8388608, local4 - 1);
		}
		if (arg1 == 3) {
			this.method5419(local21, 671088640, local4);
			this.method5419(local21, 8388608, local4 - 1);
			this.method5419(local21 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V")
	public void method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - this.anInt6848;
		@Pc(21) int local21 = arg1 - this.anInt6844;
		this.anIntArrayArray60[local16][local21] |= 0x40000;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
	private void method5413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray60[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V")
	public void method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt6848;
		@Pc(21) int local21 = arg0 - this.anInt6844;
		this.anIntArrayArray60[local16][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)V")
	public void method5415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt6844;
		@Pc(9) int local9 = arg0 - this.anInt6848;
		this.anIntArrayArray60[local9][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public void method5416() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6854; local7++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt6841; local25++) {
				if (local7 == 0 || local25 == 0 || local7 >= this.anInt6854 - 5 || local25 >= this.anInt6841 - 5) {
					this.anIntArrayArray60[local7][local25] = -1;
				} else {
					this.anIntArrayArray60[local7][local25] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIZIII)V")
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt6844;
		@Pc(13) int local13 = arg5 - this.anInt6848;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5413(local4, local13, 128);
				this.method5413(local4, local13 - 1, 8);
			}
			if (arg4 == 1) {
				this.method5413(local4, local13, 2);
				this.method5413(local4 + 1, local13, 32);
			}
			if (arg4 == 2) {
				this.method5413(local4, local13, 8);
				this.method5413(local4, local13 + 1, 128);
			}
			if (arg4 == 3) {
				this.method5413(local4, local13, 32);
				this.method5413(local4 - 1, local13, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5413(local4, local13, 1);
				this.method5413(local4 + 1, local13 - 1, 16);
			}
			if (arg4 == 1) {
				this.method5413(local4, local13, 4);
				this.method5413(local4 + 1, local13 + 1, 64);
			}
			if (arg4 == 2) {
				this.method5413(local4, local13, 16);
				this.method5413(local4 - 1, local13 - -1, 1);
			}
			if (arg4 == 3) {
				this.method5413(local4, local13, 64);
				this.method5413(local4 - 1, local13 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method5413(local4, local13, 130);
				this.method5413(local4, local13 - 1, 8);
				this.method5413(local4 + 1, local13, 32);
			}
			if (arg4 == 1) {
				this.method5413(local4, local13, 10);
				this.method5413(local4 + 1, local13, 32);
				this.method5413(local4, local13 + 1, 128);
			}
			if (arg4 == 2) {
				this.method5413(local4, local13, 40);
				this.method5413(local4, local13 + 1, 128);
				this.method5413(local4 - 1, local13, 2);
			}
			if (arg4 == 3) {
				this.method5413(local4, local13, 160);
				this.method5413(local4 - 1, local13, 2);
				this.method5413(local4, local13 - 1, 8);
			}
		}
		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method5413(local4, local13, 65536);
					this.method5413(local4, local13 - 1, 4096);
				}
				if (arg4 == 1) {
					this.method5413(local4, local13, 1024);
					this.method5413(local4 + 1, local13, 16384);
				}
				if (arg4 == 2) {
					this.method5413(local4, local13, 4096);
					this.method5413(local4, local13 + 1, 65536);
				}
				if (arg4 == 3) {
					this.method5413(local4, local13, 16384);
					this.method5413(local4 - 1, local13, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method5413(local4, local13, 512);
					this.method5413(local4 + 1, local13 + -1, 8192);
				}
				if (arg4 == 1) {
					this.method5413(local4, local13, 2048);
					this.method5413(local4 + 1, local13 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method5413(local4, local13, 8192);
					this.method5413(local4 - 1, local13 + 1, 512);
				}
				if (arg4 == 3) {
					this.method5413(local4, local13, 32768);
					this.method5413(local4 - 1, local13 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method5413(local4, local13, 66560);
					this.method5413(local4, local13 - 1, 4096);
					this.method5413(local4 + 1, local13, 16384);
				}
				if (arg4 == 1) {
					this.method5413(local4, local13, 5120);
					this.method5413(local4 + 1, local13, 16384);
					this.method5413(local4, local13 + 1, 65536);
				}
				if (arg4 == 2) {
					this.method5413(local4, local13, 20480);
					this.method5413(local4, local13 + 1, 65536);
					this.method5413(local4 - 1, local13, 1024);
				}
				if (arg4 == 3) {
					this.method5413(local4, local13, 81920);
					this.method5413(local4 - 1, local13, 1024);
					this.method5413(local4, local13 - 1, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method5413(local4, local13, 536870912);
				this.method5413(local4, local13 - 1, 33554432);
			}
			if (arg4 == 1) {
				this.method5413(local4, local13, 8388608);
				this.method5413(local4 + 1, local13, 134217728);
			}
			if (arg4 == 2) {
				this.method5413(local4, local13, 33554432);
				this.method5413(local4, local13 + 1, 536870912);
			}
			if (arg4 == 3) {
				this.method5413(local4, local13, 134217728);
				this.method5413(local4 - 1, local13, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method5413(local4, local13, 4194304);
				this.method5413(local4 + 1, local13 + -1, 67108864);
			}
			if (arg4 == 1) {
				this.method5413(local4, local13, 16777216);
				this.method5413(local4 + 1, local13 - -1, 268435456);
			}
			if (arg4 == 2) {
				this.method5413(local4, local13, 67108864);
				this.method5413(local4 - 1, local13 - -1, 4194304);
			}
			if (arg4 == 3) {
				this.method5413(local4, local13, 268435456);
				this.method5413(local4 - 1, local13 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method5413(local4, local13, 545259520);
			this.method5413(local4, local13 - 1, 33554432);
			this.method5413(local4 + 1, local13, 134217728);
		}
		if (arg4 == 1) {
			this.method5413(local4, local13, 41943040);
			this.method5413(local4 + 1, local13, 134217728);
			this.method5413(local4, local13 + 1, 536870912);
		}
		if (arg4 == 2) {
			this.method5413(local4, local13, 167772160);
			this.method5413(local4, local13 + 1, 536870912);
			this.method5413(local4 - 1, local13, 8388608);
		}
		if (arg4 == 3) {
			this.method5413(local4, local13, 671088640);
			this.method5413(local4 - 1, local13, 8388608);
			this.method5413(local4, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg5 + arg4;
		@Pc(18) int local18 = arg0 + arg1;
		@Pc(22) int local22 = arg3 + arg2;
		@Pc(27) int local27 = arg6 + arg8;
		@Pc(52) int local52;
		@Pc(63) int local63;
		if (arg5 == local22 && (arg7 & 0x2) == 0) {
			local52 = arg6 >= arg0 ? arg6 : arg0;
			local63 = local18 >= local27 ? local27 : local18;
			while (local52 < local63) {
				if ((this.anIntArrayArray60[local22 - this.anInt6848 - 1][local52 - this.anInt6844] & 0x8) == 0) {
					return true;
				}
				local52++;
			}
		} else if (local14 == arg3 && (arg7 & 0x8) == 0) {
			local52 = arg0 > arg6 ? arg0 : arg6;
			local63 = local27 > local18 ? local18 : local27;
			while (local63 > local52) {
				if ((this.anIntArrayArray60[arg3 - this.anInt6848][local52 - this.anInt6844] & 0x80) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg0 == local27 && (arg7 & 0x1) == 0) {
			local52 = arg3 >= arg5 ? arg3 : arg5;
			local63 = local14 < local22 ? local14 : local22;
			while (local63 > local52) {
				if ((this.anIntArrayArray60[local52 - this.anInt6848][local27 - this.anInt6844 - 1] & 0x2) == 0) {
					return true;
				}
				local52++;
			}
		} else if (arg6 == local18 && (arg7 & 0x4) == 0) {
			local52 = arg3 >= arg5 ? arg3 : arg5;
			local63 = local14 < local22 ? local14 : local22;
			while (local52 < local63) {
				if ((this.anIntArrayArray60[local52 - this.anInt6848][arg6 - this.anInt6844] & 0x20) == 0) {
					return true;
				}
				local52++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIII)V")
	private void method5419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray60[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == 1) {
			if (arg0 == arg6 && arg2 == arg5) {
				return true;
			}
		} else if (arg6 >= arg0 && arg6 <= arg0 + arg4 - 1 && arg5 <= arg5 && arg5 + arg4 - 1 >= arg5) {
			return true;
		}
		@Pc(61) int local61 = arg2 - this.anInt6844;
		@Pc(66) int local66 = arg0 - this.anInt6848;
		@Pc(71) int local71 = arg6 - this.anInt6848;
		@Pc(76) int local76 = arg5 - this.anInt6844;
		if (arg4 == 1) {
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local66 == local71 - 1 && local76 == local61) {
						return true;
					}
					if (local71 == local66 && local76 + 1 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local66 && local61 == local76 - 1 && (this.anIntArrayArray60[local66][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local71 == local66 && local61 == local76 + 1) {
						return true;
					}
					if (local66 == local71 - 1 && local76 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 + 1 && local76 == local61) {
						return true;
					}
					if (local66 == local71 && local61 == local76 + 1 && (this.anIntArrayArray60[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local66 && local61 == local76 - 1 && (this.anIntArrayArray60[local66][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 == local66 && local76 - 1 == local61) {
						return true;
					}
					if (local66 == local71 - 1 && local76 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local66 == local71 - 1 && local61 == local76) {
						return true;
					}
					if (local71 == local66 && local76 + 1 == local61) {
						return true;
					}
					if (local71 + 1 == local66 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local71 && local76 - 1 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local71 - 1 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local66 && local76 + 1 == local61) {
						return true;
					}
					if (local71 + 1 == local66 && local76 == local61) {
						return true;
					}
					if (local71 == local66 && local61 == local76 - 1 && (this.anIntArrayArray60[local66][local61] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 - 1 && local76 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local71 && local76 + 1 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local61 == local76) {
						return true;
					}
					if (local66 == local71 && local61 == local76 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 - 1 == local66 && local61 == local76) {
						return true;
					}
					if (local71 == local66 && local61 == local76 + 1 && (this.anIntArrayArray60[local66][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 == local61 && (this.anIntArrayArray60[local66][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local66 && local76 - 1 == local61) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local66 == local71 && local76 + 1 == local61 && (this.anIntArrayArray60[local66][local61] & 0x20) == 0) {
					return true;
				}
				if (local66 == local71 && local61 == local76 - 1 && (this.anIntArrayArray60[local66][local61] & 0x2) == 0) {
					return true;
				}
				if (local71 - 1 == local66 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x8) == 0) {
					return true;
				}
				if (local66 == local71 + 1 && local61 == local76 && (this.anIntArrayArray60[local66][local61] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(775) int local775 = arg4 + local66 - 1;
			@Pc(781) int local781 = local61 + arg4 - 1;
			if (arg1 == 0) {
				if (arg3 == 0) {
					if (local71 - arg4 == local66 && local76 >= local61 && local781 >= local76) {
						return true;
					}
					if (local71 >= local66 && local71 <= local775 && local76 + 1 == local61 && (this.anIntArrayArray60[local71][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 >= local66 && local775 >= local71 && local61 == local76 - arg4 && (this.anIntArrayArray60[local71][local781] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 <= local71 && local775 >= local71 && local76 + 1 == local61) {
						return true;
					}
					if (local71 - arg4 == local66 && local76 >= local61 && local781 >= local76 && (this.anIntArrayArray60[local775][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local71 + 1 && local61 <= local76 && local781 >= local76 && (this.anIntArrayArray60[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 + 1 && local76 >= local61 && local76 <= local781) {
						return true;
					}
					if (local66 <= local71 && local71 <= local775 && local76 + 1 == local61 && (this.anIntArrayArray60[local71][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 <= local71 && local71 <= local775 && local76 - arg4 == local61 && (this.anIntArrayArray60[local71][local781] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 <= local71 && local775 >= local71 && local61 == local76 - arg4) {
						return true;
					}
					if (local71 - arg4 == local66 && local76 >= local61 && local781 >= local76 && (this.anIntArrayArray60[local775][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local76 >= local61 && local781 >= local76 && (this.anIntArrayArray60[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg3 == 0) {
					if (local71 - arg4 == local66 && local76 >= local61 && local781 >= local76) {
						return true;
					}
					if (local71 >= local66 && local775 >= local71 && local76 + 1 == local61) {
						return true;
					}
					if (local66 == local71 + 1 && local61 <= local76 && local781 >= local76 && (this.anIntArrayArray60[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 >= local66 && local775 >= local71 && local76 - arg4 == local61 && (this.anIntArrayArray60[local71][local781] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local71 - arg4 == local66 && local61 <= local76 && local781 >= local76 && (this.anIntArrayArray60[local775][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local775 && local61 == local76 + 1) {
						return true;
					}
					if (local66 == local71 + 1 && local76 >= local61 && local781 >= local76) {
						return true;
					}
					if (local71 >= local66 && local71 <= local775 && local76 - arg4 == local61 && (this.anIntArrayArray60[local71][local781] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local66 == local71 - arg4 && local61 <= local76 && local76 <= local781 && (this.anIntArrayArray60[local775][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local775 && local76 + 1 == local61 && (this.anIntArrayArray60[local71][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local61 <= local76 && local76 <= local781) {
						return true;
					}
					if (local71 >= local66 && local71 <= local775 && local76 - arg4 == local61) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 == local71 - arg4 && local61 <= local76 && local781 >= local76) {
						return true;
					}
					if (local66 <= local71 && local71 <= local775 && local76 + 1 == local61 && (this.anIntArrayArray60[local71][local61] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 + 1 == local66 && local61 <= local76 && local76 <= local781 && (this.anIntArrayArray60[local66][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 <= local71 && local71 <= local775 && local76 - arg4 == local61) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local66 <= local71 && local71 <= local775 && local61 == local76 + 1 && (this.anIntArrayArray60[local71][local61] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 <= local71 && local775 >= local71 && local61 == local76 - arg4 && (this.anIntArrayArray60[local71][local781] & 0x2C0102) == 0) {
					return true;
				}
				if (local71 - arg4 == local66 && local76 >= local61 && local781 >= local76 && (this.anIntArrayArray60[local775][local76] & 0x2C0108) == 0) {
					return true;
				}
				if (local71 + 1 == local66 && local76 >= local61 && local781 >= local76 && (this.anIntArrayArray60[local66][local76] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > 1) {
			return Static246.method3174(arg7, arg2, arg6, arg5, arg1, arg4, arg3, arg2) ? true : this.method5418(arg1, arg2, arg3, arg6, arg2, arg7, arg5, arg0, arg4);
		}
		@Pc(40) int local40 = arg3 + arg6 - 1;
		@Pc(47) int local47 = arg5 + arg4 - 1;
		if (arg7 >= arg6 && local40 >= arg7 && arg5 <= arg1 && arg1 <= local47) {
			return true;
		} else if (arg6 - 1 == arg7 && arg1 >= arg5 && local47 >= arg1 && (this.anIntArrayArray60[arg7 - this.anInt6848][arg1 - this.anInt6844] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg7 == local40 + 1 && arg5 <= arg1 && local47 >= arg1 && (this.anIntArrayArray60[arg7 - this.anInt6848][arg1 - this.anInt6844] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg1 == arg5 - 1 && arg6 <= arg7 && local40 >= arg7 && (this.anIntArrayArray60[arg7 - this.anInt6848][arg1 - this.anInt6844] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local47 + 1 == arg1 && arg7 >= arg6 && arg7 <= local40 && (this.anIntArrayArray60[arg7 - this.anInt6848][arg1 - this.anInt6844] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}
}
