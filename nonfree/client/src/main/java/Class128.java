import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class128 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public int anInt3167;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public int anInt3169;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public int anInt3176;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "I")
	public int anInt3180;

	static {
		new Class15("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		new Class15(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg2 == arg3 && arg1 == arg6) {
				return true;
			}
		} else if (arg2 <= arg3 && arg3 <= arg2 + arg0 - 1 && arg6 <= arg6 && arg6 <= arg0 + arg6 - 1) {
			return true;
		}
		@Pc(53) int local53 = arg6 - this.anInt3167;
		@Pc(66) int local66 = arg1 - this.anInt3167;
		@Pc(71) int local71 = arg2 - this.anInt3180;
		@Pc(76) int local76 = arg3 - this.anInt3180;
		if (arg0 == 1) {
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local71 == local76 + 1 && local53 == local66 && (this.anIntArrayArray38[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local76 == local71 && local66 == local53 - 1 && (this.anIntArrayArray38[local71][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local76 - 1 == local71 && local53 == local66 && (this.anIntArrayArray38[local71][local66] & 0x8) == 0) {
						return true;
					}
					if (local76 == local71 && local66 == local53 - 1 && (this.anIntArrayArray38[local71][local66] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local76 - 1 && local53 == local66 && (this.anIntArrayArray38[local71][local66] & 0x8) == 0) {
						return true;
					}
					if (local76 == local71 && local66 == local53 + 1 && (this.anIntArrayArray38[local71][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local76 + 1 && local66 == local53 && (this.anIntArrayArray38[local71][local66] & 0x80) == 0) {
						return true;
					}
					if (local76 == local71 && local66 == local53 + 1 && (this.anIntArrayArray38[local71][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local71 == local76 && local53 + 1 == local66 && (this.anIntArrayArray38[local71][local66] & 0x20) == 0) {
					return true;
				}
				if (local76 == local71 && local66 == local53 - 1 && (this.anIntArrayArray38[local71][local66] & 0x2) == 0) {
					return true;
				}
				if (local76 - 1 == local71 && local53 == local66 && (this.anIntArrayArray38[local71][local66] & 0x8) == 0) {
					return true;
				}
				if (local71 == local76 + 1 && local66 == local53 && (this.anIntArrayArray38[local71][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(404) int local404 = local71 + arg0 - 1;
			@Pc(410) int local410 = arg0 + local66 - 1;
			if (arg5 == 6 || arg5 == 7) {
				if (arg5 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local76 + 1 == local71 && local66 <= local53 && local410 >= local53 && (this.anIntArrayArray38[local71][local53] & 0x80) == 0) {
						return true;
					}
					if (local76 >= local71 && local76 <= local404 && local53 - arg0 == local66 && (this.anIntArrayArray38[local76][local410] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local76 - arg0 && local53 >= local66 && local53 <= local410 && (this.anIntArrayArray38[local404][local53] & 0x8) == 0) {
						return true;
					}
					if (local76 >= local71 && local404 >= local76 && local66 == local53 - arg0 && (this.anIntArrayArray38[local76][local410] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local76 - arg0 && local66 <= local53 && local53 <= local410 && (this.anIntArrayArray38[local404][local53] & 0x8) == 0) {
						return true;
					}
					if (local71 <= local76 && local404 >= local76 && local66 == local53 + 1 && (this.anIntArrayArray38[local76][local66] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local76 + 1 && local66 <= local53 && local53 <= local410 && (this.anIntArrayArray38[local71][local53] & 0x80) == 0) {
						return true;
					}
					if (local71 <= local76 && local404 >= local76 && local53 + 1 == local66 && (this.anIntArrayArray38[local76][local66] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg5 == 8) {
				if (local76 >= local71 && local404 >= local76 && local53 + 1 == local66 && (this.anIntArrayArray38[local76][local66] & 0x20) == 0) {
					return true;
				}
				if (local71 <= local76 && local76 <= local404 && local53 - arg0 == local66 && (this.anIntArrayArray38[local76][local410] & 0x2) == 0) {
					return true;
				}
				if (local71 == local76 - arg0 && local66 <= local53 && local410 >= local53 && (this.anIntArrayArray38[local404][local53] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local71 && local66 <= local53 && local410 >= local53 && (this.anIntArrayArray38[local71][local53] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)V")
	private void method2450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray38[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public void method2451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 - this.anInt3180;
		@Pc(18) int local18 = arg1 - this.anInt3167;
		this.anIntArrayArray38[local9][local18] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIIZII)V")
	public void method2452(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt3167;
		@Pc(13) int local13 = arg0 - this.anInt3180;
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method2464(local13, 128, local4);
				this.method2464(local13 - 1, 8, local4);
			}
			if (arg4 == 1) {
				this.method2464(local13, 2, local4);
				this.method2464(local13, 32, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2464(local13, 8, local4);
				this.method2464(local13 + 1, 128, local4);
			}
			if (arg4 == 3) {
				this.method2464(local13, 32, local4);
				this.method2464(local13, 2, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method2464(local13, 1, local4);
				this.method2464(local13 - 1, 16, local4 + 1);
			}
			if (arg4 == 1) {
				this.method2464(local13, 4, local4);
				this.method2464(local13 + 1, 64, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2464(local13, 16, local4);
				this.method2464(local13 + 1, 1, local4 - 1);
			}
			if (arg4 == 3) {
				this.method2464(local13, 64, local4);
				this.method2464(local13 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg4 == 0) {
				this.method2464(local13, 130, local4);
				this.method2464(local13 - 1, 8, local4);
				this.method2464(local13, 32, local4 + 1);
			}
			if (arg4 == 1) {
				this.method2464(local13, 10, local4);
				this.method2464(local13, 32, local4 + 1);
				this.method2464(local13 + 1, 128, local4);
			}
			if (arg4 == 2) {
				this.method2464(local13, 40, local4);
				this.method2464(local13 + 1, 128, local4);
				this.method2464(local13, 2, local4 - 1);
			}
			if (arg4 == 3) {
				this.method2464(local13, 160, local4);
				this.method2464(local13, 2, local4 - 1);
				this.method2464(local13 - 1, 8, local4);
			}
		}
		if (arg3) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					this.method2464(local13, 65536, local4);
					this.method2464(local13 - 1, 4096, local4);
				}
				if (arg4 == 1) {
					this.method2464(local13, 1024, local4);
					this.method2464(local13, 16384, local4 + 1);
				}
				if (arg4 == 2) {
					this.method2464(local13, 4096, local4);
					this.method2464(local13 + 1, 65536, local4);
				}
				if (arg4 == 3) {
					this.method2464(local13, 16384, local4);
					this.method2464(local13, 1024, local4 - 1);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					this.method2464(local13, 512, local4);
					this.method2464(local13 - 1, 8192, local4 + 1);
				}
				if (arg4 == 1) {
					this.method2464(local13, 2048, local4);
					this.method2464(local13 + 1, 32768, local4 + 1);
				}
				if (arg4 == 2) {
					this.method2464(local13, 8192, local4);
					this.method2464(local13 + 1, 512, local4 - 1);
				}
				if (arg4 == 3) {
					this.method2464(local13, 32768, local4);
					this.method2464(local13 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					this.method2464(local13, 66560, local4);
					this.method2464(local13 - 1, 4096, local4);
					this.method2464(local13, 16384, local4 + 1);
				}
				if (arg4 == 1) {
					this.method2464(local13, 5120, local4);
					this.method2464(local13, 16384, local4 + 1);
					this.method2464(local13 + 1, 65536, local4);
				}
				if (arg4 == 2) {
					this.method2464(local13, 20480, local4);
					this.method2464(local13 + 1, 65536, local4);
					this.method2464(local13, 1024, local4 - 1);
				}
				if (arg4 == 3) {
					this.method2464(local13, 81920, local4);
					this.method2464(local13, 1024, local4 - 1);
					this.method2464(local13 - 1, 4096, local4);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 == 0) {
				this.method2464(local13, 536870912, local4);
				this.method2464(local13 - 1, 33554432, local4);
			}
			if (arg4 == 1) {
				this.method2464(local13, 8388608, local4);
				this.method2464(local13, 134217728, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2464(local13, 33554432, local4);
				this.method2464(local13 + 1, 536870912, local4);
			}
			if (arg4 == 3) {
				this.method2464(local13, 134217728, local4);
				this.method2464(local13, 8388608, local4 - 1);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				this.method2464(local13, 4194304, local4);
				this.method2464(local13 - 1, 67108864, local4 + 1);
			}
			if (arg4 == 1) {
				this.method2464(local13, 16777216, local4);
				this.method2464(local13 + 1, 268435456, local4 + 1);
			}
			if (arg4 == 2) {
				this.method2464(local13, 67108864, local4);
				this.method2464(local13 + 1, 4194304, local4 - 1);
			}
			if (arg4 == 3) {
				this.method2464(local13, 268435456, local4);
				this.method2464(local13 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method2464(local13, 545259520, local4);
			this.method2464(local13 - 1, 33554432, local4);
			this.method2464(local13, 134217728, local4 + 1);
		}
		if (arg4 == 1) {
			this.method2464(local13, 41943040, local4);
			this.method2464(local13, 134217728, local4 + 1);
			this.method2464(local13 + 1, 536870912, local4);
		}
		if (arg4 == 2) {
			this.method2464(local13, 167772160, local4);
			this.method2464(local13 + 1, 536870912, local4);
			this.method2464(local13, 8388608, local4 - 1);
		}
		if (arg4 == 3) {
			this.method2464(local13, 671088640, local4);
			this.method2464(local13, 8388608, local4 - 1);
			this.method2464(local13 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(III)V")
	public void method2455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - this.anInt3167;
		@Pc(21) int local21 = arg0 - this.anInt3180;
		this.anIntArrayArray38[local21][local16] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBIIIIIIII)Z")
	public boolean method2456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18 = arg8 + arg7;
		@Pc(22) int local22 = arg1 + arg2;
		@Pc(27) int local27 = arg4 + arg0;
		@Pc(31) int local31 = arg3 + arg5;
		@Pc(63) int local63;
		@Pc(70) int local70;
		if (arg8 == local27 && (arg6 & 0x2) == 0) {
			local63 = arg1 <= arg5 ? arg5 : arg1;
			local70 = local22 < local31 ? local22 : local31;
			while (local70 > local63) {
				if ((this.anIntArrayArray38[local27 - this.anInt3180 - 1][local63 - this.anInt3167] & 0x8) == 0) {
					return true;
				}
				local63++;
			}
		} else if (arg4 == local18 && (arg6 & 0x8) == 0) {
			local63 = arg5 < arg1 ? arg1 : arg5;
			local70 = local31 <= local22 ? local31 : local22;
			while (local63 < local70) {
				if ((this.anIntArrayArray38[arg4 - this.anInt3180][local63 - this.anInt3167] & 0x80) == 0) {
					return true;
				}
				local63++;
			}
		} else if (arg1 == local31 && (arg6 & 0x1) == 0) {
			local63 = arg8 > arg4 ? arg8 : arg4;
			local70 = local27 <= local18 ? local27 : local18;
			while (local70 > local63) {
				if ((this.anIntArrayArray38[local63 - this.anInt3180][local31 - this.anInt3167 - 1] & 0x2) == 0) {
					return true;
				}
				local63++;
			}
		} else if (arg5 == local22 && (arg6 & 0x4) == 0) {
			local63 = arg4 < arg8 ? arg8 : arg4;
			local70 = local18 >= local27 ? local27 : local18;
			while (local70 > local63) {
				if ((this.anIntArrayArray38[local63 - this.anInt3180][arg5 - this.anInt3167] & 0x20) == 0) {
					return true;
				}
				local63++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIBIIZI)V")
	public void method2457(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = 256;
		if (arg5) {
			local16 = 131328;
		}
		@Pc(30) int local30;
		if (arg3 == 1 || arg3 == 3) {
			local30 = arg6;
			arg6 = arg0;
			arg0 = local30;
		}
		@Pc(39) int local39 = arg4 - this.anInt3167;
		if (arg1) {
			local16 |= 0x40000000;
		}
		@Pc(50) int local50 = arg2 - this.anInt3180;
		for (local30 = local50; local30 < arg6 + local50; local30++) {
			if (local30 >= 0 && local30 < this.anInt3176) {
				for (@Pc(69) int local69 = local39; local69 < local39 + arg0; local69++) {
					if (local69 >= 0 && local69 < this.anInt3169) {
						this.method2450(local16, local69, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIZIZ)V")
	public void method2458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt3180;
		@Pc(13) int local13 = arg0 - this.anInt3167;
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method2450(128, local13, local8);
				this.method2450(8, local13, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2450(2, local13, local8);
				this.method2450(32, local13 + 1, local8);
			}
			if (arg1 == 2) {
				this.method2450(8, local13, local8);
				this.method2450(128, local13, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2450(32, local13, local8);
				this.method2450(2, local13 - 1, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method2450(1, local13, local8);
				this.method2450(16, local13 + 1, local8 + -1);
			}
			if (arg1 == 1) {
				this.method2450(4, local13, local8);
				this.method2450(64, local13 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2450(16, local13, local8);
				this.method2450(1, local13 - 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2450(64, local13, local8);
				this.method2450(4, local13 - 1, local8 + -1);
			}
		}
		if (arg4 == 2) {
			if (arg1 == 0) {
				this.method2450(130, local13, local8);
				this.method2450(8, local13, local8 - 1);
				this.method2450(32, local13 + 1, local8);
			}
			if (arg1 == 1) {
				this.method2450(10, local13, local8);
				this.method2450(32, local13 + 1, local8);
				this.method2450(128, local13, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2450(40, local13, local8);
				this.method2450(128, local13, local8 + 1);
				this.method2450(2, local13 - 1, local8);
			}
			if (arg1 == 3) {
				this.method2450(160, local13, local8);
				this.method2450(2, local13 - 1, local8);
				this.method2450(8, local13, local8 - 1);
			}
		}
		if (arg5) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					this.method2450(65536, local13, local8);
					this.method2450(4096, local13, local8 - 1);
				}
				if (arg1 == 1) {
					this.method2450(1024, local13, local8);
					this.method2450(16384, local13 + 1, local8);
				}
				if (arg1 == 2) {
					this.method2450(4096, local13, local8);
					this.method2450(65536, local13, local8 + 1);
				}
				if (arg1 == 3) {
					this.method2450(16384, local13, local8);
					this.method2450(1024, local13 - 1, local8);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					this.method2450(512, local13, local8);
					this.method2450(8192, local13 + 1, local8 - 1);
				}
				if (arg1 == 1) {
					this.method2450(2048, local13, local8);
					this.method2450(32768, local13 + 1, local8 + 1);
				}
				if (arg1 == 2) {
					this.method2450(8192, local13, local8);
					this.method2450(512, local13 - 1, local8 + 1);
				}
				if (arg1 == 3) {
					this.method2450(32768, local13, local8);
					this.method2450(2048, local13 - 1, local8 + -1);
				}
			}
			if (arg4 == 2) {
				if (arg1 == 0) {
					this.method2450(66560, local13, local8);
					this.method2450(4096, local13, local8 - 1);
					this.method2450(16384, local13 + 1, local8);
				}
				if (arg1 == 1) {
					this.method2450(5120, local13, local8);
					this.method2450(16384, local13 + 1, local8);
					this.method2450(65536, local13, local8 + 1);
				}
				if (arg1 == 2) {
					this.method2450(20480, local13, local8);
					this.method2450(65536, local13, local8 + 1);
					this.method2450(1024, local13 - 1, local8);
				}
				if (arg1 == 3) {
					this.method2450(81920, local13, local8);
					this.method2450(1024, local13 - 1, local8);
					this.method2450(4096, local13, local8 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg1 == 0) {
				this.method2450(536870912, local13, local8);
				this.method2450(33554432, local13, local8 - 1);
			}
			if (arg1 == 1) {
				this.method2450(8388608, local13, local8);
				this.method2450(134217728, local13 + 1, local8);
			}
			if (arg1 == 2) {
				this.method2450(33554432, local13, local8);
				this.method2450(536870912, local13, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2450(134217728, local13, local8);
				this.method2450(8388608, local13 - 1, local8);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				this.method2450(4194304, local13, local8);
				this.method2450(67108864, local13 + 1, local8 + -1);
			}
			if (arg1 == 1) {
				this.method2450(16777216, local13, local8);
				this.method2450(268435456, local13 + 1, local8 + 1);
			}
			if (arg1 == 2) {
				this.method2450(67108864, local13, local8);
				this.method2450(4194304, local13 - 1, local8 + 1);
			}
			if (arg1 == 3) {
				this.method2450(268435456, local13, local8);
				this.method2450(16777216, local13 - 1, local8 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2450(545259520, local13, local8);
			this.method2450(33554432, local13, local8 - 1);
			this.method2450(134217728, local13 + 1, local8);
		}
		if (arg1 == 1) {
			this.method2450(41943040, local13, local8);
			this.method2450(134217728, local13 + 1, local8);
			this.method2450(536870912, local13, local8 + 1);
		}
		if (arg1 == 2) {
			this.method2450(167772160, local13, local8);
			this.method2450(536870912, local13, local8 + 1);
			this.method2450(8388608, local13 - 1, local8);
		}
		if (arg1 == 3) {
			this.method2450(671088640, local13, local8);
			this.method2450(8388608, local13 - 1, local8);
			this.method2450(33554432, local13, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > 1) {
			return Static248.method3584(arg1, arg5, arg0, arg3, arg7, arg4, arg1, arg6) ? true : this.method2456(arg4, arg5, arg1, arg3, arg6, arg7, arg2, arg1, arg0);
		}
		@Pc(38) int local38 = arg4 + arg6 - 1;
		@Pc(45) int local45 = arg7 + arg3 - 1;
		if (arg0 >= arg6 && arg0 <= local38 && arg5 >= arg7 && local45 >= arg5) {
			return true;
		} else if (arg6 - 1 == arg0 && arg5 >= arg7 && local45 >= arg5 && (this.anIntArrayArray38[arg0 - this.anInt3180][arg5 - this.anInt3167] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg0 && arg5 >= arg7 && local45 >= arg5 && (this.anIntArrayArray38[arg0 - this.anInt3180][arg5 - this.anInt3167] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg7 - 1 == arg5 && arg6 <= arg0 && arg0 <= local38 && (this.anIntArrayArray38[arg0 - this.anInt3180][arg5 - this.anInt3167] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local45 + 1 == arg5 && arg6 <= arg0 && local38 >= arg0 && (this.anIntArrayArray38[arg0 - this.anInt3180][arg5 - this.anInt3167] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BII)V")
	public void method2460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt3180;
		@Pc(17) int local17 = arg1 - this.anInt3167;
		this.anIntArrayArray38[local8][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(III)V")
	public void method2462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt3180;
		@Pc(13) int local13 = arg0 - this.anInt3167;
		this.anIntArrayArray38[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg0 == arg6 && arg4 == arg2) {
				return true;
			}
		} else if (arg6 <= arg0 && arg5 + arg6 - 1 >= arg0 && arg2 >= arg2 && arg2 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(65) int local65 = arg6 - this.anInt3180;
		@Pc(70) int local70 = arg0 - this.anInt3180;
		@Pc(75) int local75 = arg4 - this.anInt3167;
		@Pc(80) int local80 = arg2 - this.anInt3167;
		if (arg5 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local65 == local70 - 1 && local75 == local80) {
						return true;
					}
					if (local70 == local65 && local75 == local80 + 1 && (this.anIntArrayArray38[local65][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local70 && local80 - 1 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local65 == local70 && local75 == local80 + 1) {
						return true;
					}
					if (local70 - 1 == local65 && local80 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local70 + 1 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local70 + 1 && local80 == local75) {
						return true;
					}
					if (local65 == local70 && local80 + 1 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local70 && local75 == local80 - 1 && (this.anIntArrayArray38[local65][local75] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 == local65 && local80 - 1 == local75) {
						return true;
					}
					if (local70 - 1 == local65 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local70 + 1 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local70 - 1 == local65 && local75 == local80) {
						return true;
					}
					if (local70 == local65 && local80 + 1 == local75) {
						return true;
					}
					if (local65 == local70 + 1 && local80 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local75 == local80 - 1 && (this.anIntArrayArray38[local65][local75] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 - 1 == local65 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local70 && local80 + 1 == local75) {
						return true;
					}
					if (local65 == local70 + 1 && local75 == local80) {
						return true;
					}
					if (local65 == local70 && local80 - 1 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local70 - 1 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local80 + 1 == local75 && (this.anIntArrayArray38[local65][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 + 1 == local65 && local80 == local75) {
						return true;
					}
					if (local65 == local70 && local75 == local80 - 1) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 - 1 == local65 && local80 == local75) {
						return true;
					}
					if (local65 == local70 && local75 == local80 + 1 && (this.anIntArrayArray38[local65][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 + 1 == local65 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local80 - 1 == local75) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local70 == local65 && local75 == local80 + 1 && (this.anIntArrayArray38[local65][local75] & 0x20) == 0) {
					return true;
				}
				if (local65 == local70 && local75 == local80 - 1 && (this.anIntArrayArray38[local65][local75] & 0x2) == 0) {
					return true;
				}
				if (local65 == local70 - 1 && local75 == local80 && (this.anIntArrayArray38[local65][local75] & 0x8) == 0) {
					return true;
				}
				if (local65 == local70 + 1 && local80 == local75 && (this.anIntArrayArray38[local65][local75] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(772) int local772 = arg5 + local65 - 1;
			@Pc(778) int local778 = arg5 + local75 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local70 - arg5 == local65 && local75 <= local80 && local778 >= local80) {
						return true;
					}
					if (local65 <= local70 && local772 >= local70 && local80 + 1 == local75 && (this.anIntArrayArray38[local70][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 >= local65 && local772 >= local70 && local75 == local80 - arg5 && (this.anIntArrayArray38[local70][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 >= local65 && local70 <= local772 && local75 == local80 + 1) {
						return true;
					}
					if (local65 == local70 - arg5 && local75 <= local80 && local80 <= local778 && (this.anIntArrayArray38[local772][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 + 1 == local65 && local75 <= local80 && local778 >= local80 && (this.anIntArrayArray38[local65][local80] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local70 + 1 && local80 >= local75 && local778 >= local80) {
						return true;
					}
					if (local65 <= local70 && local772 >= local70 && local80 + 1 == local75 && (this.anIntArrayArray38[local70][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 <= local70 && local70 <= local772 && local80 - arg5 == local75 && (this.anIntArrayArray38[local70][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 >= local65 && local772 >= local70 && local80 - arg5 == local75) {
						return true;
					}
					if (local65 == local70 - arg5 && local75 <= local80 && local80 <= local778 && (this.anIntArrayArray38[local772][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 == local70 + 1 && local80 >= local75 && local778 >= local80 && (this.anIntArrayArray38[local65][local80] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local65 == local70 - arg5 && local75 <= local80 && local778 >= local80) {
						return true;
					}
					if (local65 <= local70 && local70 <= local772 && local75 == local80 + 1) {
						return true;
					}
					if (local65 == local70 + 1 && local75 <= local80 && local80 <= local778 && (this.anIntArrayArray38[local65][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local65 <= local70 && local70 <= local772 && local75 == local80 - arg5 && (this.anIntArrayArray38[local70][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 - arg5 == local65 && local75 <= local80 && local778 >= local80 && (this.anIntArrayArray38[local772][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local65 <= local70 && local772 >= local70 && local75 == local80 + 1) {
						return true;
					}
					if (local65 == local70 + 1 && local75 <= local80 && local80 <= local778) {
						return true;
					}
					if (local65 <= local70 && local70 <= local772 && local75 == local80 - arg5 && (this.anIntArrayArray38[local70][local778] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local70 - arg5 == local65 && local80 >= local75 && local80 <= local778 && (this.anIntArrayArray38[local772][local80] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 >= local65 && local70 <= local772 && local75 == local80 + 1 && (this.anIntArrayArray38[local70][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local70 + 1 && local80 >= local75 && local778 >= local80) {
						return true;
					}
					if (local70 >= local65 && local70 <= local772 && local75 == local80 - arg5) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 - arg5 == local65 && local80 >= local75 && local778 >= local80) {
						return true;
					}
					if (local70 >= local65 && local772 >= local70 && local80 + 1 == local75 && (this.anIntArrayArray38[local70][local75] & 0x2C0120) == 0) {
						return true;
					}
					if (local65 == local70 + 1 && local80 >= local75 && local80 <= local778 && (this.anIntArrayArray38[local65][local80] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 >= local65 && local772 >= local70 && local80 - arg5 == local75) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local70 >= local65 && local772 >= local70 && local80 + 1 == local75 && (this.anIntArrayArray38[local70][local75] & 0x2C0120) == 0) {
					return true;
				}
				if (local65 <= local70 && local772 >= local70 && local80 - arg5 == local75 && (this.anIntArrayArray38[local70][local778] & 0x2C0102) == 0) {
					return true;
				}
				if (local65 == local70 - arg5 && local75 <= local80 && local80 <= local778 && (this.anIntArrayArray38[local772][local80] & 0x2C0108) == 0) {
					return true;
				}
				if (local70 + 1 == local65 && local80 >= local75 && local80 <= local778 && (this.anIntArrayArray38[local65][local80] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(IIII)V")
	private void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray38[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIIIZII)V")
	public void method2465(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(26) int local26 = arg4 - this.anInt3180;
		@Pc(31) int local31 = arg1 - this.anInt3167;
		if (arg3) {
			local7 |= 0x40000000;
		}
		for (@Pc(39) int local39 = local26; local39 < local26 + arg2; local39++) {
			if (local39 >= 0 && local39 < this.anInt3176) {
				for (@Pc(53) int local53 = local31; local53 < arg5 + local31; local53++) {
					if (local53 >= 0 && this.anInt3169 > local53) {
						this.method2464(local39, local7, local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method2466() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt3176; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt3169; local12++) {
				if (local8 == 0 || local12 == 0 || local8 >= this.anInt3176 - 5 || local12 >= this.anInt3169 - 5) {
					this.anIntArrayArray38[local8][local12] = -1;
				} else {
					this.anIntArrayArray38[local8][local12] = 2097152;
				}
			}
		}
	}
}
