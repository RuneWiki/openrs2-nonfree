import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class158 {

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public int anInt4537;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public int anInt4542;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public int anInt4546;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
	private void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray39[arg0][arg2] &= ~arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
	public void method3609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt4550;
		@Pc(13) int local13 = arg1 - this.anInt4542;
		this.anIntArrayArray39[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V")
	public void method3610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4542;
		@Pc(17) int local17 = arg0 - this.anInt4550;
		this.anIntArrayArray39[local4][local17] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIZZI)V")
	public void method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt4550;
		@Pc(9) int local9 = arg1 - this.anInt4542;
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method3612(128, local4, local9);
				this.method3612(8, local4, local9 - 1);
			}
			if (arg2 == 1) {
				this.method3612(2, local4, local9);
				this.method3612(32, local4 + 1, local9);
			}
			if (arg2 == 2) {
				this.method3612(8, local4, local9);
				this.method3612(128, local4, local9 + 1);
			}
			if (arg2 == 3) {
				this.method3612(32, local4, local9);
				this.method3612(2, local4 - 1, local9);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method3612(1, local4, local9);
				this.method3612(16, local4 + 1, local9 + -1);
			}
			if (arg2 == 1) {
				this.method3612(4, local4, local9);
				this.method3612(64, local4 + 1, local9 + 1);
			}
			if (arg2 == 2) {
				this.method3612(16, local4, local9);
				this.method3612(1, local4 - 1, local9 + 1);
			}
			if (arg2 == 3) {
				this.method3612(64, local4, local9);
				this.method3612(4, local4 - 1, local9 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg2 == 0) {
				this.method3612(130, local4, local9);
				this.method3612(8, local4, local9 - 1);
				this.method3612(32, local4 + 1, local9);
			}
			if (arg2 == 1) {
				this.method3612(10, local4, local9);
				this.method3612(32, local4 + 1, local9);
				this.method3612(128, local4, local9 + 1);
			}
			if (arg2 == 2) {
				this.method3612(40, local4, local9);
				this.method3612(128, local4, local9 + 1);
				this.method3612(2, local4 - 1, local9);
			}
			if (arg2 == 3) {
				this.method3612(160, local4, local9);
				this.method3612(2, local4 - 1, local9);
				this.method3612(8, local4, local9 - 1);
			}
		}
		if (arg3) {
			if (arg5 == 0) {
				if (arg2 == 0) {
					this.method3612(65536, local4, local9);
					this.method3612(4096, local4, local9 - 1);
				}
				if (arg2 == 1) {
					this.method3612(1024, local4, local9);
					this.method3612(16384, local4 + 1, local9);
				}
				if (arg2 == 2) {
					this.method3612(4096, local4, local9);
					this.method3612(65536, local4, local9 + 1);
				}
				if (arg2 == 3) {
					this.method3612(16384, local4, local9);
					this.method3612(1024, local4 - 1, local9);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg2 == 0) {
					this.method3612(512, local4, local9);
					this.method3612(8192, local4 + 1, local9 + -1);
				}
				if (arg2 == 1) {
					this.method3612(2048, local4, local9);
					this.method3612(32768, local4 + 1, local9 - -1);
				}
				if (arg2 == 2) {
					this.method3612(8192, local4, local9);
					this.method3612(512, local4 - 1, local9 + 1);
				}
				if (arg2 == 3) {
					this.method3612(32768, local4, local9);
					this.method3612(2048, local4 - 1, local9 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg2 == 0) {
					this.method3612(66560, local4, local9);
					this.method3612(4096, local4, local9 - 1);
					this.method3612(16384, local4 + 1, local9);
				}
				if (arg2 == 1) {
					this.method3612(5120, local4, local9);
					this.method3612(16384, local4 + 1, local9);
					this.method3612(65536, local4, local9 + 1);
				}
				if (arg2 == 2) {
					this.method3612(20480, local4, local9);
					this.method3612(65536, local4, local9 + 1);
					this.method3612(1024, local4 - 1, local9);
				}
				if (arg2 == 3) {
					this.method3612(81920, local4, local9);
					this.method3612(1024, local4 - 1, local9);
					this.method3612(4096, local4, local9 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg5 == 0) {
			if (arg2 == 0) {
				this.method3612(536870912, local4, local9);
				this.method3612(33554432, local4, local9 - 1);
			}
			if (arg2 == 1) {
				this.method3612(8388608, local4, local9);
				this.method3612(134217728, local4 + 1, local9);
			}
			if (arg2 == 2) {
				this.method3612(33554432, local4, local9);
				this.method3612(536870912, local4, local9 + 1);
			}
			if (arg2 == 3) {
				this.method3612(134217728, local4, local9);
				this.method3612(8388608, local4 - 1, local9);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg2 == 0) {
				this.method3612(4194304, local4, local9);
				this.method3612(67108864, local4 + 1, local9 + -1);
			}
			if (arg2 == 1) {
				this.method3612(16777216, local4, local9);
				this.method3612(268435456, local4 + 1, local9 + 1);
			}
			if (arg2 == 2) {
				this.method3612(67108864, local4, local9);
				this.method3612(4194304, local4 - 1, local9 + 1);
			}
			if (arg2 == 3) {
				this.method3612(268435456, local4, local9);
				this.method3612(16777216, local4 - 1, local9 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method3612(545259520, local4, local9);
			this.method3612(33554432, local4, local9 - 1);
			this.method3612(134217728, local4 + 1, local9);
		}
		if (arg2 == 1) {
			this.method3612(41943040, local4, local9);
			this.method3612(134217728, local4 + 1, local9);
			this.method3612(536870912, local4, local9 + 1);
		}
		if (arg2 == 2) {
			this.method3612(167772160, local4, local9);
			this.method3612(536870912, local4, local9 + 1);
			this.method3612(8388608, local4 - 1, local9);
		}
		if (arg2 == 3) {
			this.method3612(671088640, local4, local9);
			this.method3612(8388608, local4 - 1, local9);
			this.method3612(33554432, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZ)V")
	private void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray39[arg2][arg1] |= arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg6 && arg0 == arg4) {
				return true;
			}
		} else if (arg6 <= arg5 && arg5 <= arg1 + arg6 - 1 && arg4 >= arg4 && arg4 + arg1 - 1 >= arg4) {
			return true;
		}
		@Pc(53) int local53 = arg6 - this.anInt4542;
		@Pc(58) int local58 = arg5 - this.anInt4542;
		@Pc(69) int local69 = arg0 - this.anInt4550;
		@Pc(74) int local74 = arg4 - this.anInt4550;
		if (arg1 == 1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local58 - 1 == local53 && local74 == local69) {
						return true;
					}
					if (local53 == local58 && local69 == local74 + 1 && (this.anIntArrayArray39[local53][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local53 && local74 - 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 == local53 && local74 + 1 == local69) {
						return true;
					}
					if (local58 - 1 == local53 && local74 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local74 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local53 == local58 + 1 && local74 == local69) {
						return true;
					}
					if (local53 == local58 && local69 == local74 + 1 && (this.anIntArrayArray39[local53][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 && local69 == local74 - 1 && (this.anIntArrayArray39[local53][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 == local53 && local74 - 1 == local69) {
						return true;
					}
					if (local53 == local58 - 1 && local69 == local74 && (this.anIntArrayArray39[local53][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local69 == local74 && (this.anIntArrayArray39[local53][local69] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local53 == local58 - 1 && local74 == local69) {
						return true;
					}
					if (local53 == local58 && local69 == local74 + 1) {
						return true;
					}
					if (local53 == local58 + 1 && local69 == local74 && (this.anIntArrayArray39[local53][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 == local58 && local74 - 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 - 1 == local53 && local69 == local74 && (this.anIntArrayArray39[local53][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local53 && local69 == local74 + 1) {
						return true;
					}
					if (local58 + 1 == local53 && local74 == local69) {
						return true;
					}
					if (local53 == local58 && local74 - 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local58 - 1 == local53 && local69 == local74 && (this.anIntArrayArray39[local53][local69] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local58 && local74 + 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local69 == local74) {
						return true;
					}
					if (local53 == local58 && local69 == local74 - 1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 - 1 == local53 && local74 == local69) {
						return true;
					}
					if (local58 == local53 && local74 + 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local74 == local69 && (this.anIntArrayArray39[local53][local69] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local53 && local69 == local74 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local53 == local58 && local74 + 1 == local69 && (this.anIntArrayArray39[local53][local69] & 0x20) == 0) {
					return true;
				}
				if (local58 == local53 && local69 == local74 - 1 && (this.anIntArrayArray39[local53][local69] & 0x2) == 0) {
					return true;
				}
				if (local53 == local58 - 1 && local74 == local69 && (this.anIntArrayArray39[local53][local69] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local74 == local69 && (this.anIntArrayArray39[local53][local69] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(85) int local85 = arg1 + local53 - 1;
			@Pc(91) int local91 = local69 + arg1 - 1;
			if (arg2 == 0) {
				if (arg3 == 0) {
					if (local53 == local58 - arg1 && local69 <= local74 && local74 <= local91) {
						return true;
					}
					if (local53 <= local58 && local85 >= local58 && local74 + 1 == local69 && (this.anIntArrayArray39[local58][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 >= local53 && local85 >= local58 && local69 == local74 - arg1 && (this.anIntArrayArray39[local58][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local53 <= local58 && local58 <= local85 && local74 + 1 == local69) {
						return true;
					}
					if (local58 - arg1 == local53 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray39[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local69 <= local74 && local91 >= local74 && (this.anIntArrayArray39[local53][local74] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local53 == local58 + 1 && local69 <= local74 && local74 <= local91) {
						return true;
					}
					if (local58 >= local53 && local58 <= local85 && local69 == local74 + 1 && (this.anIntArrayArray39[local58][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local85 && local69 == local74 - arg1 && (this.anIntArrayArray39[local58][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local53 <= local58 && local85 >= local58 && local74 - arg1 == local69) {
						return true;
					}
					if (local53 == local58 - arg1 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray39[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local69 <= local74 && local74 <= local91 && (this.anIntArrayArray39[local53][local74] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg3 == 0) {
					if (local58 - arg1 == local53 && local74 >= local69 && local74 <= local91) {
						return true;
					}
					if (local53 <= local58 && local58 <= local85 && local69 == local74 + 1) {
						return true;
					}
					if (local58 + 1 == local53 && local74 >= local69 && local74 <= local91 && (this.anIntArrayArray39[local53][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local85 && local69 == local74 - arg1 && (this.anIntArrayArray39[local58][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local58 - arg1 == local53 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray39[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local85 && local74 + 1 == local69) {
						return true;
					}
					if (local53 == local58 + 1 && local74 >= local69 && local74 <= local91) {
						return true;
					}
					if (local53 <= local58 && local58 <= local85 && local74 - arg1 == local69 && (this.anIntArrayArray39[local58][local91] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local53 == local58 - arg1 && local69 <= local74 && local91 >= local74 && (this.anIntArrayArray39[local85][local74] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 <= local58 && local85 >= local58 && local69 == local74 + 1 && (this.anIntArrayArray39[local58][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local74 >= local69 && local91 >= local74) {
						return true;
					}
					if (local53 <= local58 && local58 <= local85 && local69 == local74 - arg1) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local58 - arg1 == local53 && local74 >= local69 && local74 <= local91) {
						return true;
					}
					if (local58 >= local53 && local58 <= local85 && local69 == local74 + 1 && (this.anIntArrayArray39[local58][local69] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local74 >= local69 && local91 >= local74 && (this.anIntArrayArray39[local53][local74] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local85 && local69 == local74 - arg1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local53 <= local58 && local85 >= local58 && local69 == local74 + 1 && (this.anIntArrayArray39[local58][local69] & 0x2C0120) == 0) {
					return true;
				}
				if (local53 <= local58 && local58 <= local85 && local74 - arg1 == local69 && (this.anIntArrayArray39[local58][local91] & 0x2C0102) == 0) {
					return true;
				}
				if (local53 == local58 - arg1 && local69 <= local74 && local74 <= local91 && (this.anIntArrayArray39[local85][local74] & 0x2C0108) == 0) {
					return true;
				}
				if (local58 + 1 == local53 && local69 <= local74 && local91 >= local74 && (this.anIntArrayArray39[local53][local74] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method3615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg5 == arg2 && arg6 == arg1) {
				return true;
			}
		} else if (arg2 >= arg5 && arg2 <= arg4 + arg5 - 1 && arg1 >= arg1 && arg4 + arg1 - 1 >= arg1) {
			return true;
		}
		@Pc(59) int local59 = arg5 - this.anInt4542;
		@Pc(64) int local64 = arg2 - this.anInt4542;
		@Pc(69) int local69 = arg1 - this.anInt4550;
		@Pc(79) int local79 = arg6 - this.anInt4550;
		if (arg4 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local64 + 1 && local79 == local69 && (this.anIntArrayArray39[local59][local79] & 0x80) == 0) {
						return true;
					}
					if (local64 == local59 && local79 == local69 - 1 && (this.anIntArrayArray39[local59][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local64 - 1 == local59 && local79 == local69 && (this.anIntArrayArray39[local59][local79] & 0x8) == 0) {
						return true;
					}
					if (local64 == local59 && local79 == local69 - 1 && (this.anIntArrayArray39[local59][local79] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local64 - 1 && local69 == local79 && (this.anIntArrayArray39[local59][local79] & 0x8) == 0) {
						return true;
					}
					if (local59 == local64 && local69 + 1 == local79 && (this.anIntArrayArray39[local59][local79] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 == local64 + 1 && local79 == local69 && (this.anIntArrayArray39[local59][local79] & 0x80) == 0) {
						return true;
					}
					if (local64 == local59 && local79 == local69 + 1 && (this.anIntArrayArray39[local59][local79] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local64 == local59 && local79 == local69 + 1 && (this.anIntArrayArray39[local59][local79] & 0x20) == 0) {
					return true;
				}
				if (local64 == local59 && local79 == local69 - 1 && (this.anIntArrayArray39[local59][local79] & 0x2) == 0) {
					return true;
				}
				if (local64 - 1 == local59 && local69 == local79 && (this.anIntArrayArray39[local59][local79] & 0x8) == 0) {
					return true;
				}
				if (local64 + 1 == local59 && local79 == local69 && (this.anIntArrayArray39[local59][local79] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(425) int local425 = local59 + arg4 - 1;
			@Pc(432) int local432 = local79 + arg4 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local64 + 1 == local59 && local79 <= local69 && local69 <= local432 && (this.anIntArrayArray39[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local59 && local64 <= local425 && local79 == local69 - arg4 && (this.anIntArrayArray39[local64][local432] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 == local64 - arg4 && local79 <= local69 && local69 <= local432 && (this.anIntArrayArray39[local425][local69] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local64 && local64 <= local425 && local79 == local69 - arg4 && (this.anIntArrayArray39[local64][local432] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local64 - arg4 == local59 && local79 <= local69 && local69 <= local432 && (this.anIntArrayArray39[local425][local69] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local64 && local425 >= local64 && local69 + 1 == local79 && (this.anIntArrayArray39[local64][local79] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 == local64 + 1 && local69 >= local79 && local69 <= local432 && (this.anIntArrayArray39[local59][local69] & 0x80) == 0) {
						return true;
					}
					if (local64 >= local59 && local64 <= local425 && local69 + 1 == local79 && (this.anIntArrayArray39[local64][local79] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local59 <= local64 && local64 <= local425 && local79 == local69 + 1 && (this.anIntArrayArray39[local64][local79] & 0x20) == 0) {
					return true;
				}
				if (local59 <= local64 && local64 <= local425 && local79 == local69 - arg4 && (this.anIntArrayArray39[local64][local432] & 0x2) == 0) {
					return true;
				}
				if (local59 == local64 - arg4 && local79 <= local69 && local69 <= local432 && (this.anIntArrayArray39[local425][local69] & 0x8) == 0) {
					return true;
				}
				if (local59 == local64 + 1 && local69 >= local79 && local432 >= local69 && (this.anIntArrayArray39[local59][local69] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIIIZ)V")
	public void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg6) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg5 - this.anInt4542;
		@Pc(23) int local23 = arg4 - this.anInt4550;
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(37) int local37;
		if (arg0 == 1 || arg0 == 3) {
			local37 = arg1;
			arg1 = arg3;
			arg3 = local37;
		}
		for (local37 = local18; local37 < arg1 + local18; local37++) {
			if (local37 >= 0 && local37 < this.anInt4537) {
				for (@Pc(55) int local55 = local23; local55 < arg3 + local23; local55++) {
					if (local55 >= 0 && this.anInt4546 > local55) {
						this.method3608(local37, local7, local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBIIIII)Z")
	public boolean method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static132.method5178(arg7, arg1, arg3, arg6, arg2, arg0, arg1, arg4) ? true : this.method3625(arg6, arg1, arg2, arg3, arg0, arg4, arg1, arg7, arg5);
		}
		@Pc(45) int local45 = arg2 + arg0 - 1;
		@Pc(51) int local51 = arg3 + arg7 - 1;
		if (arg6 >= arg2 && arg6 <= local45 && arg4 >= arg3 && arg4 <= local51) {
			return true;
		} else if (arg6 == arg2 - 1 && arg3 <= arg4 && arg4 <= local51 && (this.anIntArrayArray39[arg6 - this.anInt4542][arg4 - this.anInt4550] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (arg6 == local45 + 1 && arg3 <= arg4 && local51 >= arg4 && (this.anIntArrayArray39[arg6 - this.anInt4542][arg4 - this.anInt4550] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg4 && arg6 >= arg2 && local45 >= arg6 && (this.anIntArrayArray39[arg6 - this.anInt4542][arg4 - this.anInt4550] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return local51 + 1 == arg4 && arg2 <= arg6 && arg6 <= local45 && (this.anIntArrayArray39[arg6 - this.anInt4542][arg4 - this.anInt4550] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)V")
	public void method3619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt4550;
		@Pc(17) int local17 = arg1 - this.anInt4542;
		this.anIntArrayArray39[local17][local12] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIZI)V")
	public void method3620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt4542;
		@Pc(23) int local23 = arg3 - this.anInt4550;
		if (arg4) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local18; local39 < local18 + arg0; local39++) {
			if (local39 >= 0 && this.anInt4537 > local39) {
				for (@Pc(53) int local53 = local23; local53 < arg5 + local23; local53++) {
					if (local53 >= 0 && local53 < this.anInt4546) {
						this.method3612(local7, local53, local39);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZIZBII)V")
	public void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg2 - this.anInt4542;
		@Pc(13) int local13 = arg5 - this.anInt4550;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3608(local4, 128, local13);
				this.method3608(local4 - 1, 8, local13);
			}
			if (arg0 == 1) {
				this.method3608(local4, 2, local13);
				this.method3608(local4, 32, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3608(local4, 8, local13);
				this.method3608(local4 + 1, 128, local13);
			}
			if (arg0 == 3) {
				this.method3608(local4, 32, local13);
				this.method3608(local4, 2, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3608(local4, 1, local13);
				this.method3608(local4 - 1, 16, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3608(local4, 4, local13);
				this.method3608(local4 + 1, 64, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3608(local4, 16, local13);
				this.method3608(local4 + 1, 1, local13 - 1);
			}
			if (arg0 == 3) {
				this.method3608(local4, 64, local13);
				this.method3608(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method3608(local4, 130, local13);
				this.method3608(local4 - 1, 8, local13);
				this.method3608(local4, 32, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3608(local4, 10, local13);
				this.method3608(local4, 32, local13 + 1);
				this.method3608(local4 + 1, 128, local13);
			}
			if (arg0 == 2) {
				this.method3608(local4, 40, local13);
				this.method3608(local4 + 1, 128, local13);
				this.method3608(local4, 2, local13 - 1);
			}
			if (arg0 == 3) {
				this.method3608(local4, 160, local13);
				this.method3608(local4, 2, local13 - 1);
				this.method3608(local4 - 1, 8, local13);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method3608(local4, 65536, local13);
					this.method3608(local4 - 1, 4096, local13);
				}
				if (arg0 == 1) {
					this.method3608(local4, 1024, local13);
					this.method3608(local4, 16384, local13 + 1);
				}
				if (arg0 == 2) {
					this.method3608(local4, 4096, local13);
					this.method3608(local4 + 1, 65536, local13);
				}
				if (arg0 == 3) {
					this.method3608(local4, 16384, local13);
					this.method3608(local4, 1024, local13 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method3608(local4, 512, local13);
					this.method3608(local4 - 1, 8192, local13 + 1);
				}
				if (arg0 == 1) {
					this.method3608(local4, 2048, local13);
					this.method3608(local4 + 1, 32768, local13 + 1);
				}
				if (arg0 == 2) {
					this.method3608(local4, 8192, local13);
					this.method3608(local4 + 1, 512, local13 - 1);
				}
				if (arg0 == 3) {
					this.method3608(local4, 32768, local13);
					this.method3608(local4 - 1, 2048, local13 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method3608(local4, 66560, local13);
					this.method3608(local4 - 1, 4096, local13);
					this.method3608(local4, 16384, local13 + 1);
				}
				if (arg0 == 1) {
					this.method3608(local4, 5120, local13);
					this.method3608(local4, 16384, local13 + 1);
					this.method3608(local4 + 1, 65536, local13);
				}
				if (arg0 == 2) {
					this.method3608(local4, 20480, local13);
					this.method3608(local4 + 1, 65536, local13);
					this.method3608(local4, 1024, local13 - 1);
				}
				if (arg0 == 3) {
					this.method3608(local4, 81920, local13);
					this.method3608(local4, 1024, local13 - 1);
					this.method3608(local4 - 1, 4096, local13);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method3608(local4, 536870912, local13);
				this.method3608(local4 - 1, 33554432, local13);
			}
			if (arg0 == 1) {
				this.method3608(local4, 8388608, local13);
				this.method3608(local4, 134217728, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3608(local4, 33554432, local13);
				this.method3608(local4 + 1, 536870912, local13);
			}
			if (arg0 == 3) {
				this.method3608(local4, 134217728, local13);
				this.method3608(local4, 8388608, local13 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method3608(local4, 4194304, local13);
				this.method3608(local4 - 1, 67108864, local13 + 1);
			}
			if (arg0 == 1) {
				this.method3608(local4, 16777216, local13);
				this.method3608(local4 + 1, 268435456, local13 + 1);
			}
			if (arg0 == 2) {
				this.method3608(local4, 67108864, local13);
				this.method3608(local4 + 1, 4194304, local13 - 1);
			}
			if (arg0 == 3) {
				this.method3608(local4, 268435456, local13);
				this.method3608(local4 - 1, 16777216, local13 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method3608(local4, 545259520, local13);
			this.method3608(local4 - 1, 33554432, local13);
			this.method3608(local4, 134217728, local13 + 1);
		}
		if (arg0 == 1) {
			this.method3608(local4, 41943040, local13);
			this.method3608(local4, 134217728, local13 + 1);
			this.method3608(local4 + 1, 536870912, local13);
		}
		if (arg0 == 2) {
			this.method3608(local4, 167772160, local13);
			this.method3608(local4 + 1, 536870912, local13);
			this.method3608(local4, 8388608, local13 - 1);
		}
		if (arg0 == 3) {
			this.method3608(local4, 671088640, local13);
			this.method3608(local4, 8388608, local13 - 1);
			this.method3608(local4 - 1, 33554432, local13);
			return;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(III)V")
	public void method3622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt4550;
		@Pc(13) int local13 = arg0 - this.anInt4542;
		this.anIntArrayArray39[local13][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public void method3624() {
		for (@Pc(12) int local12 = 0; local12 < this.anInt4537; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4546; local16++) {
				if (local12 == 0 || local16 == 0 || local12 >= this.anInt4537 - 5 || this.anInt4546 - 5 <= local16) {
					this.anIntArrayArray39[local12][local16] = -1;
				} else {
					this.anIntArrayArray39[local12][local16] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16 = arg0 + arg1;
		@Pc(21) int local21 = arg5 + arg6;
		@Pc(26) int local26 = arg2 + arg4;
		@Pc(30) int local30 = arg7 + arg3;
		@Pc(48) int local48;
		@Pc(59) int local59;
		if (local26 == arg0 && (arg8 & 0x2) == 0) {
			local48 = arg5 <= arg3 ? arg3 : arg5;
			local59 = local30 <= local21 ? local30 : local21;
			while (local48 < local59) {
				if ((this.anIntArrayArray39[local26 - this.anInt4542 - 1][local48 - this.anInt4550] & 0x8) == 0) {
					return true;
				}
				local48++;
			}
		} else if (local16 == arg2 && (arg8 & 0x8) == 0) {
			local48 = arg3 >= arg5 ? arg3 : arg5;
			local59 = local21 >= local30 ? local30 : local21;
			while (local48 < local59) {
				if ((this.anIntArrayArray39[arg2 - this.anInt4542][local48 - this.anInt4550] & 0x80) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg5 == local30 && (arg8 & 0x1) == 0) {
			local48 = arg2 < arg0 ? arg0 : arg2;
			local59 = local16 >= local26 ? local26 : local16;
			while (local48 < local59) {
				if ((this.anIntArrayArray39[local48 - this.anInt4542][local30 - this.anInt4550 - 1] & 0x2) == 0) {
					return true;
				}
				local48++;
			}
		} else if (arg3 == local21 && (arg8 & 0x4) == 0) {
			local48 = arg2 >= arg0 ? arg2 : arg0;
			local59 = local26 <= local16 ? local26 : local16;
			while (local59 > local48) {
				if ((this.anIntArrayArray39[local48 - this.anInt4542][arg3 - this.anInt4550] & 0x20) == 0) {
					return true;
				}
				local48++;
			}
		}
		return false;
	}
}
