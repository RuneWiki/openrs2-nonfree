import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class258 {

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
	public int anInt7870;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
	public int anInt7874;

	@OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
	public int anInt7877;

	@OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
	public int anInt7878;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21 = arg5 + arg6;
		@Pc(26) int local26 = arg3 + arg7;
		@Pc(30) int local30 = arg4 + arg0;
		@Pc(35) int local35 = arg2 + arg1;
		@Pc(73) int local73;
		@Pc(80) int local80;
		if (local30 == arg6 && (arg8 & 0x2) == 0) {
			local73 = arg3 > arg2 ? arg3 : arg2;
			local80 = local35 > local26 ? local26 : local35;
			while (local73 < local80) {
				if ((this.anIntArrayArray38[local30 - this.anInt7870 - 1][local73 - this.anInt7874] & 0x8) == 0) {
					return true;
				}
				local73++;
			}
		} else if (local21 == arg0 && (arg8 & 0x8) == 0) {
			local73 = arg3 <= arg2 ? arg2 : arg3;
			local80 = local26 < local35 ? local26 : local35;
			while (local80 > local73) {
				if ((this.anIntArrayArray38[arg0 - this.anInt7870][local73 - this.anInt7874] & 0x80) == 0) {
					return true;
				}
				local73++;
			}
		} else if (arg3 == local35 && (arg8 & 0x1) == 0) {
			local73 = arg6 > arg0 ? arg6 : arg0;
			local80 = local30 > local21 ? local21 : local30;
			while (local73 < local80) {
				if ((this.anIntArrayArray38[local73 - this.anInt7870][local35 - this.anInt7874 - 1] & 0x2) == 0) {
					return true;
				}
				local73++;
			}
		} else if (arg2 == local26 && (arg8 & 0x4) == 0) {
			local73 = arg0 >= arg6 ? arg0 : arg6;
			local80 = local30 <= local21 ? local30 : local21;
			while (local73 < local80) {
				if ((this.anIntArrayArray38[local73 - this.anInt7870][arg2 - this.anInt7874] & 0x20) == 0) {
					return true;
				}
				local73++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZBZIII)V")
	public void method6632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg5 - this.anInt7874;
		@Pc(21) int local21 = arg3 - this.anInt7870;
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method6635(local21, local12, 128);
				this.method6635(local21 - 1, local12, 8);
			}
			if (arg4 == 1) {
				this.method6635(local21, local12, 2);
				this.method6635(local21, local12 + 1, 32);
			}
			if (arg4 == 2) {
				this.method6635(local21, local12, 8);
				this.method6635(local21 + 1, local12, 128);
			}
			if (arg4 == 3) {
				this.method6635(local21, local12, 32);
				this.method6635(local21, local12 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method6635(local21, local12, 1);
				this.method6635(local21 - 1, local12 + 1, 16);
			}
			if (arg4 == 1) {
				this.method6635(local21, local12, 4);
				this.method6635(local21 + 1, local12 + 1, 64);
			}
			if (arg4 == 2) {
				this.method6635(local21, local12, 16);
				this.method6635(local21 + 1, local12 + -1, 1);
			}
			if (arg4 == 3) {
				this.method6635(local21, local12, 64);
				this.method6635(local21 - 1, local12 - 1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg4 == 0) {
				this.method6635(local21, local12, 130);
				this.method6635(local21 - 1, local12, 8);
				this.method6635(local21, local12 + 1, 32);
			}
			if (arg4 == 1) {
				this.method6635(local21, local12, 10);
				this.method6635(local21, local12 + 1, 32);
				this.method6635(local21 + 1, local12, 128);
			}
			if (arg4 == 2) {
				this.method6635(local21, local12, 40);
				this.method6635(local21 + 1, local12, 128);
				this.method6635(local21, local12 - 1, 2);
			}
			if (arg4 == 3) {
				this.method6635(local21, local12, 160);
				this.method6635(local21, local12 - 1, 2);
				this.method6635(local21 - 1, local12, 8);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					this.method6635(local21, local12, 65536);
					this.method6635(local21 - 1, local12, 4096);
				}
				if (arg4 == 1) {
					this.method6635(local21, local12, 1024);
					this.method6635(local21, local12 + 1, 16384);
				}
				if (arg4 == 2) {
					this.method6635(local21, local12, 4096);
					this.method6635(local21 + 1, local12, 65536);
				}
				if (arg4 == 3) {
					this.method6635(local21, local12, 16384);
					this.method6635(local21, local12 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					this.method6635(local21, local12, 512);
					this.method6635(local21 - 1, local12 - -1, 8192);
				}
				if (arg4 == 1) {
					this.method6635(local21, local12, 2048);
					this.method6635(local21 + 1, local12 + 1, 32768);
				}
				if (arg4 == 2) {
					this.method6635(local21, local12, 8192);
					this.method6635(local21 + 1, local12 + -1, 512);
				}
				if (arg4 == 3) {
					this.method6635(local21, local12, 32768);
					this.method6635(local21 - 1, local12 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg4 == 0) {
					this.method6635(local21, local12, 66560);
					this.method6635(local21 - 1, local12, 4096);
					this.method6635(local21, local12 + 1, 16384);
				}
				if (arg4 == 1) {
					this.method6635(local21, local12, 5120);
					this.method6635(local21, local12 + 1, 16384);
					this.method6635(local21 + 1, local12, 65536);
				}
				if (arg4 == 2) {
					this.method6635(local21, local12, 20480);
					this.method6635(local21 + 1, local12, 65536);
					this.method6635(local21, local12 - 1, 1024);
				}
				if (arg4 == 3) {
					this.method6635(local21, local12, 81920);
					this.method6635(local21, local12 - 1, 1024);
					this.method6635(local21 - 1, local12, 4096);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 == 0) {
				this.method6635(local21, local12, 536870912);
				this.method6635(local21 - 1, local12, 33554432);
			}
			if (arg4 == 1) {
				this.method6635(local21, local12, 8388608);
				this.method6635(local21, local12 + 1, 134217728);
			}
			if (arg4 == 2) {
				this.method6635(local21, local12, 33554432);
				this.method6635(local21 + 1, local12, 536870912);
			}
			if (arg4 == 3) {
				this.method6635(local21, local12, 134217728);
				this.method6635(local21, local12 - 1, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				this.method6635(local21, local12, 4194304);
				this.method6635(local21 - 1, local12 + 1, 67108864);
			}
			if (arg4 == 1) {
				this.method6635(local21, local12, 16777216);
				this.method6635(local21 + 1, local12 + 1, 268435456);
			}
			if (arg4 == 2) {
				this.method6635(local21, local12, 67108864);
				this.method6635(local21 + 1, local12 - 1, 4194304);
			}
			if (arg4 == 3) {
				this.method6635(local21, local12, 268435456);
				this.method6635(local21 - 1, local12 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method6635(local21, local12, 545259520);
			this.method6635(local21 - 1, local12, 33554432);
			this.method6635(local21, local12 + 1, 134217728);
		}
		if (arg4 == 1) {
			this.method6635(local21, local12, 41943040);
			this.method6635(local21, local12 + 1, 134217728);
			this.method6635(local21 + 1, local12, 536870912);
		}
		if (arg4 == 2) {
			this.method6635(local21, local12, 167772160);
			this.method6635(local21 + 1, local12, 536870912);
			this.method6635(local21, local12 - 1, 8388608);
		}
		if (arg4 == 3) {
			this.method6635(local21, local12, 671088640);
			this.method6635(local21, local12 - 1, 8388608);
			this.method6635(local21 - 1, local12, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method6633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg6 == arg0 && arg2 == arg3) {
				return true;
			}
		} else if (arg0 >= arg6 && arg0 <= arg6 + arg5 - 1 && arg3 <= arg3 && arg3 <= arg5 + arg3 - 1) {
			return true;
		}
		@Pc(50) int local50 = arg6 - this.anInt7870;
		@Pc(55) int local55 = arg2 - this.anInt7874;
		@Pc(60) int local60 = arg3 - this.anInt7874;
		@Pc(73) int local73 = arg0 - this.anInt7870;
		if (arg5 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local50 == local73 + 1 && local60 == local55 && (this.anIntArrayArray38[local50][local55] & 0x80) == 0) {
						return true;
					}
					if (local73 == local50 && local60 - 1 == local55 && (this.anIntArrayArray38[local50][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local73 - 1 == local50 && local55 == local60 && (this.anIntArrayArray38[local50][local55] & 0x8) == 0) {
						return true;
					}
					if (local73 == local50 && local60 - 1 == local55 && (this.anIntArrayArray38[local50][local55] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local50 == local73 - 1 && local55 == local60 && (this.anIntArrayArray38[local50][local55] & 0x8) == 0) {
						return true;
					}
					if (local50 == local73 && local55 == local60 + 1 && (this.anIntArrayArray38[local50][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local50 == local73 + 1 && local60 == local55 && (this.anIntArrayArray38[local50][local55] & 0x80) == 0) {
						return true;
					}
					if (local73 == local50 && local60 + 1 == local55 && (this.anIntArrayArray38[local50][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local50 == local73 && local60 + 1 == local55 && (this.anIntArrayArray38[local50][local55] & 0x20) == 0) {
					return true;
				}
				if (local73 == local50 && local55 == local60 - 1 && (this.anIntArrayArray38[local50][local55] & 0x2) == 0) {
					return true;
				}
				if (local50 == local73 - 1 && local55 == local60 && (this.anIntArrayArray38[local50][local55] & 0x8) == 0) {
					return true;
				}
				if (local50 == local73 + 1 && local55 == local60 && (this.anIntArrayArray38[local50][local55] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(395) int local395 = arg5 + local50 - 1;
			@Pc(401) int local401 = arg5 + local55 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local50 == local73 + 1 && local60 >= local55 && local401 >= local60 && (this.anIntArrayArray38[local50][local60] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local50 && local395 >= local73 && local60 - arg5 == local55 && (this.anIntArrayArray38[local73][local401] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local50 == local73 - arg5 && local60 >= local55 && local60 <= local401 && (this.anIntArrayArray38[local395][local60] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local50 && local395 >= local73 && local55 == local60 - arg5 && (this.anIntArrayArray38[local73][local401] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local50 == local73 - arg5 && local55 <= local60 && local401 >= local60 && (this.anIntArrayArray38[local395][local60] & 0x8) == 0) {
						return true;
					}
					if (local50 <= local73 && local73 <= local395 && local55 == local60 + 1 && (this.anIntArrayArray38[local73][local55] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local50 == local73 + 1 && local60 >= local55 && local60 <= local401 && (this.anIntArrayArray38[local50][local60] & 0x80) == 0) {
						return true;
					}
					if (local50 <= local73 && local395 >= local73 && local60 + 1 == local55 && (this.anIntArrayArray38[local73][local55] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local50 <= local73 && local73 <= local395 && local55 == local60 + 1 && (this.anIntArrayArray38[local73][local55] & 0x20) == 0) {
					return true;
				}
				if (local73 >= local50 && local73 <= local395 && local55 == local60 - arg5 && (this.anIntArrayArray38[local73][local401] & 0x2) == 0) {
					return true;
				}
				if (local50 == local73 - arg5 && local60 >= local55 && local401 >= local60 && (this.anIntArrayArray38[local395][local60] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local50 && local55 <= local60 && local401 >= local60 && (this.anIntArrayArray38[local50][local60] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method6634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return Static60.method5318(arg1, arg0, arg2, arg7, arg6, arg4, arg3, arg3) ? true : this.method6631(arg1, arg7, arg4, arg2, arg0, arg3, arg6, arg3, arg5);
		}
		@Pc(39) int local39 = arg1 + arg0 - 1;
		@Pc(46) int local46 = arg4 + arg7 - 1;
		if (arg1 <= arg6 && local39 >= arg6 && arg2 >= arg4 && arg2 <= local46) {
			return true;
		} else if (arg6 == arg1 - 1 && arg2 >= arg4 && local46 >= arg2 && (this.anIntArrayArray38[arg6 - this.anInt7870][arg2 - this.anInt7874] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (local39 + 1 == arg6 && arg4 <= arg2 && local46 >= arg2 && (this.anIntArrayArray38[arg6 - this.anInt7870][arg2 - this.anInt7874] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg4 - 1 == arg2 && arg1 <= arg6 && local39 >= arg6 && (this.anIntArrayArray38[arg6 - this.anInt7870][arg2 - this.anInt7874] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return arg2 == local46 + 1 && arg1 <= arg6 && arg6 <= local39 && (this.anIntArrayArray38[arg6 - this.anInt7870][arg2 - this.anInt7874] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIII)V")
	private void method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray38[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)V")
	public void method6636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7870;
		@Pc(13) int local13 = arg0 - this.anInt7874;
		this.anIntArrayArray38[local4][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III)V")
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt7874;
		@Pc(13) int local13 = arg1 - this.anInt7870;
		this.anIntArrayArray38[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZZIIIB)V")
	public void method6640(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4 = arg0 - this.anInt7874;
		@Pc(19) int local19 = arg4 - this.anInt7870;
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method6642(local19, 128, local4);
				this.method6642(local19 - 1, 8, local4);
			}
			if (arg3 == 1) {
				this.method6642(local19, 2, local4);
				this.method6642(local19, 32, local4 + 1);
			}
			if (arg3 == 2) {
				this.method6642(local19, 8, local4);
				this.method6642(local19 + 1, 128, local4);
			}
			if (arg3 == 3) {
				this.method6642(local19, 32, local4);
				this.method6642(local19, 2, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method6642(local19, 1, local4);
				this.method6642(local19 - 1, 16, local4 + 1);
			}
			if (arg3 == 1) {
				this.method6642(local19, 4, local4);
				this.method6642(local19 + 1, 64, local4 + 1);
			}
			if (arg3 == 2) {
				this.method6642(local19, 16, local4);
				this.method6642(local19 + 1, 1, local4 - 1);
			}
			if (arg3 == 3) {
				this.method6642(local19, 64, local4);
				this.method6642(local19 - 1, 4, local4 - 1);
			}
		}
		if (arg5 == 2) {
			if (arg3 == 0) {
				this.method6642(local19, 130, local4);
				this.method6642(local19 - 1, 8, local4);
				this.method6642(local19, 32, local4 + 1);
			}
			if (arg3 == 1) {
				this.method6642(local19, 10, local4);
				this.method6642(local19, 32, local4 + 1);
				this.method6642(local19 + 1, 128, local4);
			}
			if (arg3 == 2) {
				this.method6642(local19, 40, local4);
				this.method6642(local19 + 1, 128, local4);
				this.method6642(local19, 2, local4 - 1);
			}
			if (arg3 == 3) {
				this.method6642(local19, 160, local4);
				this.method6642(local19, 2, local4 - 1);
				this.method6642(local19 - 1, 8, local4);
			}
		}
		if (arg1) {
			if (arg5 == 0) {
				if (arg3 == 0) {
					this.method6642(local19, 65536, local4);
					this.method6642(local19 - 1, 4096, local4);
				}
				if (arg3 == 1) {
					this.method6642(local19, 1024, local4);
					this.method6642(local19, 16384, local4 + 1);
				}
				if (arg3 == 2) {
					this.method6642(local19, 4096, local4);
					this.method6642(local19 + 1, 65536, local4);
				}
				if (arg3 == 3) {
					this.method6642(local19, 16384, local4);
					this.method6642(local19, 1024, local4 - 1);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg3 == 0) {
					this.method6642(local19, 512, local4);
					this.method6642(local19 - 1, 8192, local4 + 1);
				}
				if (arg3 == 1) {
					this.method6642(local19, 2048, local4);
					this.method6642(local19 + 1, 32768, local4 + 1);
				}
				if (arg3 == 2) {
					this.method6642(local19, 8192, local4);
					this.method6642(local19 + 1, 512, local4 - 1);
				}
				if (arg3 == 3) {
					this.method6642(local19, 32768, local4);
					this.method6642(local19 - 1, 2048, local4 - 1);
				}
			}
			if (arg5 == 2) {
				if (arg3 == 0) {
					this.method6642(local19, 66560, local4);
					this.method6642(local19 - 1, 4096, local4);
					this.method6642(local19, 16384, local4 + 1);
				}
				if (arg3 == 1) {
					this.method6642(local19, 5120, local4);
					this.method6642(local19, 16384, local4 + 1);
					this.method6642(local19 + 1, 65536, local4);
				}
				if (arg3 == 2) {
					this.method6642(local19, 20480, local4);
					this.method6642(local19 + 1, 65536, local4);
					this.method6642(local19, 1024, local4 - 1);
				}
				if (arg3 == 3) {
					this.method6642(local19, 81920, local4);
					this.method6642(local19, 1024, local4 - 1);
					this.method6642(local19 - 1, 4096, local4);
				}
			}
		}
		if (!arg2) {
			return;
		}
		if (arg5 == 0) {
			if (arg3 == 0) {
				this.method6642(local19, 536870912, local4);
				this.method6642(local19 - 1, 33554432, local4);
			}
			if (arg3 == 1) {
				this.method6642(local19, 8388608, local4);
				this.method6642(local19, 134217728, local4 + 1);
			}
			if (arg3 == 2) {
				this.method6642(local19, 33554432, local4);
				this.method6642(local19 + 1, 536870912, local4);
			}
			if (arg3 == 3) {
				this.method6642(local19, 134217728, local4);
				this.method6642(local19, 8388608, local4 - 1);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg3 == 0) {
				this.method6642(local19, 4194304, local4);
				this.method6642(local19 - 1, 67108864, local4 + 1);
			}
			if (arg3 == 1) {
				this.method6642(local19, 16777216, local4);
				this.method6642(local19 + 1, 268435456, local4 + 1);
			}
			if (arg3 == 2) {
				this.method6642(local19, 67108864, local4);
				this.method6642(local19 + 1, 4194304, local4 - 1);
			}
			if (arg3 == 3) {
				this.method6642(local19, 268435456, local4);
				this.method6642(local19 - 1, 16777216, local4 - 1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method6642(local19, 545259520, local4);
			this.method6642(local19 - 1, 33554432, local4);
			this.method6642(local19, 134217728, local4 + 1);
		}
		if (arg3 == 1) {
			this.method6642(local19, 41943040, local4);
			this.method6642(local19, 134217728, local4 + 1);
			this.method6642(local19 + 1, 536870912, local4);
		}
		if (arg3 == 2) {
			this.method6642(local19, 167772160, local4);
			this.method6642(local19 + 1, 536870912, local4);
			this.method6642(local19, 8388608, local4 - 1);
		}
		if (arg3 == 3) {
			this.method6642(local19, 671088640, local4);
			this.method6642(local19, 8388608, local4 - 1);
			this.method6642(local19 - 1, 33554432, local4);
			return;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IBI)V")
	public void method6641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7874;
		@Pc(21) int local21 = arg0 - this.anInt7870;
		this.anIntArrayArray38[local21][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIBI)V")
	private void method6642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray38[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZII)V")
	public void method6643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt7874;
		@Pc(13) int local13 = arg0 - this.anInt7870;
		this.anIntArrayArray38[local13][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIIZI)V")
	public void method6644(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg4) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg1 - this.anInt7870;
		if (arg0) {
			local7 |= 0x40000000;
		}
		@Pc(36) int local36 = arg5 - this.anInt7874;
		for (@Pc(38) int local38 = local18; local38 < local18 + arg3; local38++) {
			if (local38 >= 0 && local38 < this.anInt7878) {
				for (@Pc(55) int local55 = local36; local55 < local36 + arg2; local55++) {
					if (local55 >= 0 && local55 < this.anInt7877) {
						this.method6642(local38, local7, local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	public void method6645() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7878; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt7877; local13++) {
				if (local7 == 0 || local13 == 0 || local7 >= this.anInt7878 - 5 || local13 >= this.anInt7877 - 5) {
					this.anIntArrayArray38[local7][local13] = -1;
				} else {
					this.anIntArrayArray38[local7][local13] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIIZII)V")
	public void method6646(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29;
		if (arg2 == 1 || arg2 == 3) {
			local29 = arg0;
			arg0 = arg3;
			arg3 = local29;
		}
		@Pc(38) int local38 = arg4 - this.anInt7874;
		@Pc(43) int local43 = arg6 - this.anInt7870;
		for (local29 = local43; local29 < arg0 + local43; local29++) {
			if (local29 >= 0 && local29 < this.anInt7878) {
				for (@Pc(59) int local59 = local38; local59 < local38 + arg3; local59++) {
					if (local59 >= 0 && this.anInt7877 > local59) {
						this.method6635(local29, local59, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIBIIIII)Z")
	public boolean method6647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg1 == arg5 && arg3 == arg0) {
				return true;
			}
		} else if (arg1 <= arg5 && arg5 <= arg1 + arg2 - 1 && arg0 <= arg0 && arg2 + arg0 - 1 >= arg0) {
			return true;
		}
		@Pc(47) int local47 = arg3 - this.anInt7874;
		@Pc(60) int local60 = arg1 - this.anInt7870;
		@Pc(65) int local65 = arg0 - this.anInt7874;
		@Pc(70) int local70 = arg5 - this.anInt7870;
		if (arg2 == 1) {
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local60 == local70 - 1 && local65 == local47) {
						return true;
					}
					if (local60 == local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 == local60 && local47 == local65 - 1 && (this.anIntArrayArray38[local60][local47] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local60 == local70 && local65 + 1 == local47) {
						return true;
					}
					if (local60 == local70 - 1 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local70 + 1 && local65 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local70 + 1 == local60 && local47 == local65) {
						return true;
					}
					if (local70 == local60 && local47 == local65 + 1 && (this.anIntArrayArray38[local60][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local70 && local47 == local65 - 1 && (this.anIntArrayArray38[local60][local47] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local70 == local60 && local65 - 1 == local47) {
						return true;
					}
					if (local70 - 1 == local60 && local65 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 + 1 == local60 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local70 - 1 == local60 && local65 == local47) {
						return true;
					}
					if (local60 == local70 && local65 + 1 == local47) {
						return true;
					}
					if (local60 == local70 + 1 && local65 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 == local70 && local47 == local65 - 1 && (this.anIntArrayArray38[local60][local47] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local60 == local70 - 1 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local70 && local47 == local65 + 1) {
						return true;
					}
					if (local60 == local70 + 1 && local47 == local65) {
						return true;
					}
					if (local60 == local70 && local65 - 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local60 == local70 - 1 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 == local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local70 + 1 && local47 == local65) {
						return true;
					}
					if (local60 == local70 && local47 == local65 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local60 == local70 - 1 && local47 == local65) {
						return true;
					}
					if (local60 == local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local70 + 1 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x2C0180) == 0) {
						return true;
					}
					if (local70 == local60 && local47 == local65 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local60 == local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x20) == 0) {
					return true;
				}
				if (local70 == local60 && local65 - 1 == local47 && (this.anIntArrayArray38[local60][local47] & 0x2) == 0) {
					return true;
				}
				if (local70 - 1 == local60 && local65 == local47 && (this.anIntArrayArray38[local60][local47] & 0x8) == 0) {
					return true;
				}
				if (local70 + 1 == local60 && local47 == local65 && (this.anIntArrayArray38[local60][local47] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = local60 + arg2 - 1;
			@Pc(88) int local88 = arg2 + local47 - 1;
			if (arg6 == 0) {
				if (arg4 == 0) {
					if (local60 == local70 - arg2 && local47 <= local65 && local88 >= local65) {
						return true;
					}
					if (local70 >= local60 && local82 >= local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local70][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 <= local70 && local70 <= local82 && local47 == local65 - arg2 && (this.anIntArrayArray38[local70][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local60 <= local70 && local82 >= local70 && local65 + 1 == local47) {
						return true;
					}
					if (local70 - arg2 == local60 && local65 >= local47 && local88 >= local65 && (this.anIntArrayArray38[local82][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 + 1 == local60 && local65 >= local47 && local88 >= local65 && (this.anIntArrayArray38[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local60 == local70 + 1 && local65 >= local47 && local88 >= local65) {
						return true;
					}
					if (local70 >= local60 && local82 >= local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local70][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 >= local60 && local70 <= local82 && local47 == local65 - arg2 && (this.anIntArrayArray38[local70][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local70 >= local60 && local82 >= local70 && local65 - arg2 == local47) {
						return true;
					}
					if (local70 - arg2 == local60 && local47 <= local65 && local65 <= local88 && (this.anIntArrayArray38[local82][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local70 + 1 == local60 && local47 <= local65 && local65 <= local88 && (this.anIntArrayArray38[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg4 == 0) {
					if (local70 - arg2 == local60 && local65 >= local47 && local65 <= local88) {
						return true;
					}
					if (local60 <= local70 && local82 >= local70 && local47 == local65 + 1) {
						return true;
					}
					if (local60 == local70 + 1 && local47 <= local65 && local65 <= local88 && (this.anIntArrayArray38[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 <= local70 && local70 <= local82 && local65 - arg2 == local47 && (this.anIntArrayArray38[local70][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local60 == local70 - arg2 && local65 >= local47 && local65 <= local88 && (this.anIntArrayArray38[local82][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local70 && local82 >= local70 && local47 == local65 + 1) {
						return true;
					}
					if (local70 + 1 == local60 && local65 >= local47 && local65 <= local88) {
						return true;
					}
					if (local70 >= local60 && local70 <= local82 && local47 == local65 - arg2 && (this.anIntArrayArray38[local70][local88] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local60 == local70 - arg2 && local65 >= local47 && local88 >= local65 && (this.anIntArrayArray38[local82][local65] & 0x2C0108) == 0) {
						return true;
					}
					if (local60 <= local70 && local70 <= local82 && local47 == local65 + 1 && (this.anIntArrayArray38[local70][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local70 + 1 == local60 && local65 >= local47 && local65 <= local88) {
						return true;
					}
					if (local70 >= local60 && local82 >= local70 && local47 == local65 - arg2) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local70 - arg2 == local60 && local65 >= local47 && local65 <= local88) {
						return true;
					}
					if (local60 <= local70 && local70 <= local82 && local47 == local65 + 1 && (this.anIntArrayArray38[local70][local47] & 0x2C0120) == 0) {
						return true;
					}
					if (local60 == local70 + 1 && local47 <= local65 && local65 <= local88 && (this.anIntArrayArray38[local60][local65] & 0x2C0180) == 0) {
						return true;
					}
					if (local60 <= local70 && local82 >= local70 && local47 == local65 - arg2) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local70 >= local60 && local82 >= local70 && local65 + 1 == local47 && (this.anIntArrayArray38[local70][local47] & 0x2C0120) == 0) {
					return true;
				}
				if (local70 >= local60 && local82 >= local70 && local65 - arg2 == local47 && (this.anIntArrayArray38[local70][local88] & 0x2C0102) == 0) {
					return true;
				}
				if (local70 - arg2 == local60 && local47 <= local65 && local88 >= local65 && (this.anIntArrayArray38[local82][local65] & 0x2C0108) == 0) {
					return true;
				}
				if (local60 == local70 + 1 && local65 >= local47 && local65 <= local88 && (this.anIntArrayArray38[local60][local65] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
