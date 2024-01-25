import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class210 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	public int anInt5598;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public int anInt5599;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public int anInt5610;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt5612;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIBI)Z")
	public boolean method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > 1) {
			return Static9.method304(arg2, arg3, arg1, arg4, arg0, arg7, arg5, arg0) ? true : this.method4711(arg7, arg2, arg5, arg0, arg6, arg4, arg1, arg3, arg0);
		}
		@Pc(38) int local38 = arg1 + arg2 - 1;
		@Pc(44) int local44 = arg5 + arg3 - 1;
		if (arg1 <= arg7 && arg7 <= local38 && arg3 <= arg4 && arg4 <= local44) {
			return true;
		} else if (arg1 - 1 == arg7 && arg3 <= arg4 && arg4 <= local44 && (this.anIntArrayArray34[arg7 - this.anInt5599][arg4 - this.anInt5598] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (arg7 == local38 + 1 && arg4 >= arg3 && arg4 <= local44 && (this.anIntArrayArray34[arg7 - this.anInt5599][arg4 - this.anInt5598] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg3 - 1 == arg4 && arg7 >= arg1 && local38 >= arg7 && (this.anIntArrayArray34[arg7 - this.anInt5599][arg4 - this.anInt5598] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local44 + 1 && arg7 >= arg1 && local38 >= arg7 && (this.anIntArrayArray34[arg7 - this.anInt5599][arg4 - this.anInt5598] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIB)Z")
	public boolean method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg4 && arg6 == arg5) {
				return true;
			}
		} else if (arg0 <= arg4 && arg4 <= arg0 + arg2 - 1 && arg5 <= arg5 && arg5 <= arg5 + arg2 - 1) {
			return true;
		}
		@Pc(56) int local56 = arg0 - this.anInt5599;
		@Pc(61) int local61 = arg5 - this.anInt5598;
		@Pc(66) int local66 = arg4 - this.anInt5599;
		@Pc(76) int local76 = arg6 - this.anInt5598;
		if (arg2 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local56 == local66 - 1 && local76 == local61) {
						return true;
					}
					if (local66 == local56 && local76 == local61 + 1 && (this.anIntArrayArray34[local56][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 && local76 == local61 - 1 && (this.anIntArrayArray34[local56][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 == local56 && local61 + 1 == local76) {
						return true;
					}
					if (local56 == local66 - 1 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local61 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local56 == local66 + 1 && local61 == local76) {
						return true;
					}
					if (local56 == local66 && local61 + 1 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 && local76 == local61 - 1 && (this.anIntArrayArray34[local56][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 == local56 && local61 - 1 == local76) {
						return true;
					}
					if (local66 - 1 == local56 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local61 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local56 == local66 - 1 && local76 == local61) {
						return true;
					}
					if (local66 == local56 && local76 == local61 + 1) {
						return true;
					}
					if (local66 + 1 == local56 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 == local56 && local61 - 1 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local66 - 1 == local56 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 && local61 + 1 == local76) {
						return true;
					}
					if (local56 == local66 + 1 && local61 == local76) {
						return true;
					}
					if (local66 == local56 && local61 - 1 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local56 == local66 - 1 && local61 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 == local56 && local61 + 1 == local76 && (this.anIntArrayArray34[local56][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local76 == local61) {
						return true;
					}
					if (local66 == local56 && local61 - 1 == local76) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local66 - 1 == local56 && local61 == local76) {
						return true;
					}
					if (local56 == local66 && local76 == local61 + 1 && (this.anIntArrayArray34[local56][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 == local66 && local61 - 1 == local76) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local56 == local66 && local61 + 1 == local76 && (this.anIntArrayArray34[local56][local76] & 0x20) == 0) {
					return true;
				}
				if (local56 == local66 && local76 == local61 - 1 && (this.anIntArrayArray34[local56][local76] & 0x2) == 0) {
					return true;
				}
				if (local66 - 1 == local56 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x8) == 0) {
					return true;
				}
				if (local56 == local66 + 1 && local76 == local61 && (this.anIntArrayArray34[local56][local76] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(797) int local797 = local56 + arg2 - 1;
			@Pc(804) int local804 = local76 + arg2 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local56 == local66 - arg2 && local61 >= local76 && local61 <= local804) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local76 == local61 + 1 && (this.anIntArrayArray34[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 <= local66 && local66 <= local797 && local76 == local61 - arg2 && (this.anIntArrayArray34[local66][local804] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local56 <= local66 && local66 <= local797 && local76 == local61 + 1) {
						return true;
					}
					if (local66 - arg2 == local56 && local61 >= local76 && local804 >= local61 && (this.anIntArrayArray34[local797][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local66 + 1 == local56 && local76 <= local61 && local804 >= local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local56 == local66 + 1 && local76 <= local61 && local804 >= local61) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local76 == local61 + 1 && (this.anIntArrayArray34[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local61 - arg2 == local76 && (this.anIntArrayArray34[local66][local804] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local56 <= local66 && local66 <= local797 && local61 - arg2 == local76) {
						return true;
					}
					if (local56 == local66 - arg2 && local76 <= local61 && local804 >= local61 && (this.anIntArrayArray34[local797][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local61 >= local76 && local804 >= local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local66 - arg2 == local56 && local76 <= local61 && local61 <= local804) {
						return true;
					}
					if (local56 <= local66 && local797 >= local66 && local61 + 1 == local76) {
						return true;
					}
					if (local56 == local66 + 1 && local61 >= local76 && local804 >= local61 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local56 <= local66 && local797 >= local66 && local76 == local61 - arg2 && (this.anIntArrayArray34[local66][local804] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local56 == local66 - arg2 && local61 >= local76 && local61 <= local804 && (this.anIntArrayArray34[local797][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 <= local66 && local66 <= local797 && local61 + 1 == local76) {
						return true;
					}
					if (local66 + 1 == local56 && local61 >= local76 && local804 >= local61) {
						return true;
					}
					if (local56 <= local66 && local797 >= local66 && local61 - arg2 == local76 && (this.anIntArrayArray34[local66][local804] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local66 - arg2 == local56 && local76 <= local61 && local804 >= local61 && (this.anIntArrayArray34[local797][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local56 <= local66 && local797 >= local66 && local76 == local61 + 1 && (this.anIntArrayArray34[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local76 <= local61 && local804 >= local61) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local76 == local61 - arg2) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local56 == local66 - arg2 && local76 <= local61 && local804 >= local61) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local76 == local61 + 1 && (this.anIntArrayArray34[local66][local76] & 0x2C0120) == 0) {
						return true;
					}
					if (local56 == local66 + 1 && local76 <= local61 && local61 <= local804 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local66 >= local56 && local797 >= local66 && local76 == local61 - arg2) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local66 >= local56 && local66 <= local797 && local61 + 1 == local76 && (this.anIntArrayArray34[local66][local76] & 0x2C0120) == 0) {
					return true;
				}
				if (local66 >= local56 && local797 >= local66 && local61 - arg2 == local76 && (this.anIntArrayArray34[local66][local804] & 0x2C0102) == 0) {
					return true;
				}
				if (local56 == local66 - arg2 && local76 <= local61 && local804 >= local61 && (this.anIntArrayArray34[local797][local61] & 0x2C0108) == 0) {
					return true;
				}
				if (local66 + 1 == local56 && local61 >= local76 && local61 <= local804 && (this.anIntArrayArray34[local56][local61] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public void method4706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5598;
		@Pc(21) int local21 = arg1 - this.anInt5599;
		this.anIntArrayArray34[local21][local4] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)V")
	public void method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt5598;
		@Pc(19) int local19 = arg1 - this.anInt5599;
		this.anIntArrayArray34[local19][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public void method4708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt5598;
		@Pc(13) int local13 = arg0 - this.anInt5599;
		this.anIntArrayArray34[local13][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
	private void method4709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZZIII)V")
	public void method4710(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg3 - this.anInt5599;
		@Pc(13) int local13 = arg5 - this.anInt5598;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4718(local8, local13, 128);
				this.method4718(local8 - 1, local13, 8);
			}
			if (arg0 == 1) {
				this.method4718(local8, local13, 2);
				this.method4718(local8, local13 + 1, 32);
			}
			if (arg0 == 2) {
				this.method4718(local8, local13, 8);
				this.method4718(local8 + 1, local13, 128);
			}
			if (arg0 == 3) {
				this.method4718(local8, local13, 32);
				this.method4718(local8, local13 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4718(local8, local13, 1);
				this.method4718(local8 - 1, local13 + 1, 16);
			}
			if (arg0 == 1) {
				this.method4718(local8, local13, 4);
				this.method4718(local8 + 1, local13 - -1, 64);
			}
			if (arg0 == 2) {
				this.method4718(local8, local13, 16);
				this.method4718(local8 + 1, local13 + -1, 1);
			}
			if (arg0 == 3) {
				this.method4718(local8, local13, 64);
				this.method4718(local8 - 1, local13 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method4718(local8, local13, 130);
				this.method4718(local8 - 1, local13, 8);
				this.method4718(local8, local13 + 1, 32);
			}
			if (arg0 == 1) {
				this.method4718(local8, local13, 10);
				this.method4718(local8, local13 + 1, 32);
				this.method4718(local8 + 1, local13, 128);
			}
			if (arg0 == 2) {
				this.method4718(local8, local13, 40);
				this.method4718(local8 + 1, local13, 128);
				this.method4718(local8, local13 - 1, 2);
			}
			if (arg0 == 3) {
				this.method4718(local8, local13, 160);
				this.method4718(local8, local13 - 1, 2);
				this.method4718(local8 - 1, local13, 8);
			}
		}
		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method4718(local8, local13, 65536);
					this.method4718(local8 - 1, local13, 4096);
				}
				if (arg0 == 1) {
					this.method4718(local8, local13, 1024);
					this.method4718(local8, local13 + 1, 16384);
				}
				if (arg0 == 2) {
					this.method4718(local8, local13, 4096);
					this.method4718(local8 + 1, local13, 65536);
				}
				if (arg0 == 3) {
					this.method4718(local8, local13, 16384);
					this.method4718(local8, local13 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method4718(local8, local13, 512);
					this.method4718(local8 - 1, local13 + 1, 8192);
				}
				if (arg0 == 1) {
					this.method4718(local8, local13, 2048);
					this.method4718(local8 + 1, local13 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method4718(local8, local13, 8192);
					this.method4718(local8 + 1, local13 + -1, 512);
				}
				if (arg0 == 3) {
					this.method4718(local8, local13, 32768);
					this.method4718(local8 - 1, local13 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method4718(local8, local13, 66560);
					this.method4718(local8 - 1, local13, 4096);
					this.method4718(local8, local13 + 1, 16384);
				}
				if (arg0 == 1) {
					this.method4718(local8, local13, 5120);
					this.method4718(local8, local13 + 1, 16384);
					this.method4718(local8 + 1, local13, 65536);
				}
				if (arg0 == 2) {
					this.method4718(local8, local13, 20480);
					this.method4718(local8 + 1, local13, 65536);
					this.method4718(local8, local13 - 1, 1024);
				}
				if (arg0 == 3) {
					this.method4718(local8, local13, 81920);
					this.method4718(local8, local13 - 1, 1024);
					this.method4718(local8 - 1, local13, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method4718(local8, local13, 536870912);
				this.method4718(local8 - 1, local13, 33554432);
			}
			if (arg0 == 1) {
				this.method4718(local8, local13, 8388608);
				this.method4718(local8, local13 + 1, 134217728);
			}
			if (arg0 == 2) {
				this.method4718(local8, local13, 33554432);
				this.method4718(local8 + 1, local13, 536870912);
			}
			if (arg0 == 3) {
				this.method4718(local8, local13, 134217728);
				this.method4718(local8, local13 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method4718(local8, local13, 4194304);
				this.method4718(local8 - 1, local13 + 1, 67108864);
			}
			if (arg0 == 1) {
				this.method4718(local8, local13, 16777216);
				this.method4718(local8 + 1, local13 - -1, 268435456);
			}
			if (arg0 == 2) {
				this.method4718(local8, local13, 67108864);
				this.method4718(local8 + 1, local13 - 1, 4194304);
			}
			if (arg0 == 3) {
				this.method4718(local8, local13, 268435456);
				this.method4718(local8 - 1, local13 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method4718(local8, local13, 545259520);
			this.method4718(local8 - 1, local13, 33554432);
			this.method4718(local8, local13 + 1, 134217728);
		}
		if (arg0 == 1) {
			this.method4718(local8, local13, 41943040);
			this.method4718(local8, local13 + 1, 134217728);
			this.method4718(local8 + 1, local13, 536870912);
		}
		if (arg0 == 2) {
			this.method4718(local8, local13, 167772160);
			this.method4718(local8 + 1, local13, 536870912);
			this.method4718(local8, local13 - 1, 8388608);
		}
		if (arg0 == 3) {
			this.method4718(local8, local13, 671088640);
			this.method4718(local8, local13 - 1, 8388608);
			this.method4718(local8 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIIIIIIIII)Z")
	public boolean method4711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16 = arg0 + arg3;
		@Pc(20) int local20 = arg8 + arg5;
		@Pc(24) int local24 = arg1 + arg6;
		@Pc(28) int local28 = arg2 + arg7;
		@Pc(49) int local49;
		@Pc(60) int local60;
		if (local24 == arg0 && (arg4 & 0x2) == 0) {
			local49 = arg5 > arg7 ? arg5 : arg7;
			local60 = local20 < local28 ? local20 : local28;
			while (local49 < local60) {
				if ((this.anIntArrayArray34[local24 - this.anInt5599 - 1][local49 - this.anInt5598] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg6 == local16 && (arg4 & 0x8) == 0) {
			local49 = arg7 >= arg5 ? arg7 : arg5;
			local60 = local20 >= local28 ? local28 : local20;
			while (local49 < local60) {
				if ((this.anIntArrayArray34[arg6 - this.anInt5599][local49 - this.anInt5598] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local28 == arg5 && (arg4 & 0x1) == 0) {
			local49 = arg6 < arg0 ? arg0 : arg6;
			local60 = local16 < local24 ? local16 : local24;
			while (local49 < local60) {
				if ((this.anIntArrayArray34[local49 - this.anInt5599][local28 - this.anInt5598 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg7 == local20 && (arg4 & 0x4) == 0) {
			local49 = arg0 <= arg6 ? arg6 : arg0;
			local60 = local16 >= local24 ? local24 : local16;
			while (local49 < local60) {
				if ((this.anIntArrayArray34[local49 - this.anInt5599][arg7 - this.anInt5598] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIIIIII)Z")
	public boolean method4712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg6 == arg2 && arg4 == arg5) {
				return true;
			}
		} else if (arg2 >= arg6 && arg6 + arg1 - 1 >= arg2 && arg4 >= arg4 && arg1 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(66) int local66 = arg6 - this.anInt5599;
		@Pc(71) int local71 = arg2 - this.anInt5599;
		@Pc(76) int local76 = arg4 - this.anInt5598;
		@Pc(81) int local81 = arg5 - this.anInt5598;
		if (arg1 == 1) {
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local66 == local71 + 1 && local81 == local76 && (this.anIntArrayArray34[local66][local81] & 0x80) == 0) {
						return true;
					}
					if (local71 == local66 && local76 - 1 == local81 && (this.anIntArrayArray34[local66][local81] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local71 - 1 == local66 && local76 == local81 && (this.anIntArrayArray34[local66][local81] & 0x8) == 0) {
						return true;
					}
					if (local66 == local71 && local81 == local76 - 1 && (this.anIntArrayArray34[local66][local81] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local71 - 1 == local66 && local76 == local81 && (this.anIntArrayArray34[local66][local81] & 0x8) == 0) {
						return true;
					}
					if (local71 == local66 && local81 == local76 + 1 && (this.anIntArrayArray34[local66][local81] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local66 == local71 + 1 && local81 == local76 && (this.anIntArrayArray34[local66][local81] & 0x80) == 0) {
						return true;
					}
					if (local66 == local71 && local76 + 1 == local81 && (this.anIntArrayArray34[local66][local81] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local71 == local66 && local81 == local76 + 1 && (this.anIntArrayArray34[local66][local81] & 0x20) == 0) {
					return true;
				}
				if (local66 == local71 && local81 == local76 - 1 && (this.anIntArrayArray34[local66][local81] & 0x2) == 0) {
					return true;
				}
				if (local66 == local71 - 1 && local76 == local81 && (this.anIntArrayArray34[local66][local81] & 0x8) == 0) {
					return true;
				}
				if (local66 == local71 + 1 && local81 == local76 && (this.anIntArrayArray34[local66][local81] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(90) int local90 = local66 + arg1 - 1;
			@Pc(96) int local96 = arg1 + local81 - 1;
			if (arg0 == 6 || arg0 == 7) {
				if (arg0 == 7) {
					arg3 = arg3 + 2 & 0x3;
				}
				if (arg3 == 0) {
					if (local71 + 1 == local66 && local81 <= local76 && local96 >= local76 && (this.anIntArrayArray34[local66][local76] & 0x80) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local90 && local81 == local76 - arg1 && (this.anIntArrayArray34[local71][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 1) {
					if (local66 == local71 - arg1 && local81 <= local76 && local96 >= local76 && (this.anIntArrayArray34[local90][local76] & 0x8) == 0) {
						return true;
					}
					if (local66 <= local71 && local71 <= local90 && local81 == local76 - arg1 && (this.anIntArrayArray34[local71][local96] & 0x2) == 0) {
						return true;
					}
				} else if (arg3 == 2) {
					if (local71 - arg1 == local66 && local81 <= local76 && local96 >= local76 && (this.anIntArrayArray34[local90][local76] & 0x8) == 0) {
						return true;
					}
					if (local71 >= local66 && local90 >= local71 && local76 + 1 == local81 && (this.anIntArrayArray34[local71][local81] & 0x20) == 0) {
						return true;
					}
				} else if (arg3 == 3) {
					if (local71 + 1 == local66 && local76 >= local81 && local76 <= local96 && (this.anIntArrayArray34[local66][local76] & 0x80) == 0) {
						return true;
					}
					if (local71 >= local66 && local71 <= local90 && local76 + 1 == local81 && (this.anIntArrayArray34[local71][local81] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg0 == 8) {
				if (local66 <= local71 && local71 <= local90 && local76 + 1 == local81 && (this.anIntArrayArray34[local71][local81] & 0x20) == 0) {
					return true;
				}
				if (local71 >= local66 && local90 >= local71 && local81 == local76 - arg1 && (this.anIntArrayArray34[local71][local96] & 0x2) == 0) {
					return true;
				}
				if (local71 - arg1 == local66 && local76 >= local81 && local76 <= local96 && (this.anIntArrayArray34[local90][local76] & 0x8) == 0) {
					return true;
				}
				if (local71 + 1 == local66 && local76 >= local81 && local96 >= local76 && (this.anIntArrayArray34[local66][local76] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIZIZI)V")
	public void method4713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		if (arg4) {
			local7 |= 0x40000000;
		}
		@Pc(28) int local28 = arg3 - this.anInt5599;
		@Pc(33) int local33 = arg5 - this.anInt5598;
		for (@Pc(35) int local35 = local28; local35 < local28 + arg0; local35++) {
			if (local35 >= 0 && local35 < this.anInt5610) {
				for (@Pc(49) int local49 = local33; local49 < arg1 + local33; local49++) {
					if (local49 >= 0 && this.anInt5612 > local49) {
						this.method4709(local35, local49, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	public void method4714() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5610; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt5612; local11++) {
				if (local7 == 0 || local11 == 0 || local7 >= this.anInt5610 - 5 || local11 >= this.anInt5612 - 5) {
					this.anIntArrayArray34[local7][local11] = -1;
				} else {
					this.anIntArrayArray34[local7][local11] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZZIII)V")
	public void method4715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		@Pc(22) int local22 = arg6 - this.anInt5598;
		@Pc(30) int local30;
		if (arg1 == 1 || arg1 == 3) {
			local30 = arg0;
			arg0 = arg4;
			arg4 = local30;
		}
		@Pc(39) int local39 = arg5 - this.anInt5599;
		if (arg2) {
			local7 |= 0x40000000;
		}
		for (local30 = local39; local30 < local39 + arg0; local30++) {
			if (local30 >= 0 && local30 < this.anInt5610) {
				for (@Pc(64) int local64 = local22; local64 < local22 + arg4; local64++) {
					if (local64 >= 0 && this.anInt5612 > local64) {
						this.method4718(local30, local64, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIZIIZ)V")
	public void method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(12) int local12 = arg4 - this.anInt5598;
		@Pc(17) int local17 = arg2 - this.anInt5599;
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4709(local17, local12, 128);
				this.method4709(local17 - 1, local12, 8);
			}
			if (arg1 == 1) {
				this.method4709(local17, local12, 2);
				this.method4709(local17, local12 + 1, 32);
			}
			if (arg1 == 2) {
				this.method4709(local17, local12, 8);
				this.method4709(local17 + 1, local12, 128);
			}
			if (arg1 == 3) {
				this.method4709(local17, local12, 32);
				this.method4709(local17, local12 - 1, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4709(local17, local12, 1);
				this.method4709(local17 - 1, local12 + 1, 16);
			}
			if (arg1 == 1) {
				this.method4709(local17, local12, 4);
				this.method4709(local17 + 1, local12 + 1, 64);
			}
			if (arg1 == 2) {
				this.method4709(local17, local12, 16);
				this.method4709(local17 + 1, local12 + -1, 1);
			}
			if (arg1 == 3) {
				this.method4709(local17, local12, 64);
				this.method4709(local17 - 1, local12 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg1 == 0) {
				this.method4709(local17, local12, 130);
				this.method4709(local17 - 1, local12, 8);
				this.method4709(local17, local12 + 1, 32);
			}
			if (arg1 == 1) {
				this.method4709(local17, local12, 10);
				this.method4709(local17, local12 + 1, 32);
				this.method4709(local17 + 1, local12, 128);
			}
			if (arg1 == 2) {
				this.method4709(local17, local12, 40);
				this.method4709(local17 + 1, local12, 128);
				this.method4709(local17, local12 - 1, 2);
			}
			if (arg1 == 3) {
				this.method4709(local17, local12, 160);
				this.method4709(local17, local12 - 1, 2);
				this.method4709(local17 - 1, local12, 8);
			}
		}
		if (arg5) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					this.method4709(local17, local12, 65536);
					this.method4709(local17 - 1, local12, 4096);
				}
				if (arg1 == 1) {
					this.method4709(local17, local12, 1024);
					this.method4709(local17, local12 + 1, 16384);
				}
				if (arg1 == 2) {
					this.method4709(local17, local12, 4096);
					this.method4709(local17 + 1, local12, 65536);
				}
				if (arg1 == 3) {
					this.method4709(local17, local12, 16384);
					this.method4709(local17, local12 - 1, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					this.method4709(local17, local12, 512);
					this.method4709(local17 - 1, local12 + 1, 8192);
				}
				if (arg1 == 1) {
					this.method4709(local17, local12, 2048);
					this.method4709(local17 + 1, local12 - -1, 32768);
				}
				if (arg1 == 2) {
					this.method4709(local17, local12, 8192);
					this.method4709(local17 + 1, local12 + -1, 512);
				}
				if (arg1 == 3) {
					this.method4709(local17, local12, 32768);
					this.method4709(local17 - 1, local12 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg1 == 0) {
					this.method4709(local17, local12, 66560);
					this.method4709(local17 - 1, local12, 4096);
					this.method4709(local17, local12 + 1, 16384);
				}
				if (arg1 == 1) {
					this.method4709(local17, local12, 5120);
					this.method4709(local17, local12 + 1, 16384);
					this.method4709(local17 + 1, local12, 65536);
				}
				if (arg1 == 2) {
					this.method4709(local17, local12, 20480);
					this.method4709(local17 + 1, local12, 65536);
					this.method4709(local17, local12 - 1, 1024);
				}
				if (arg1 == 3) {
					this.method4709(local17, local12, 81920);
					this.method4709(local17, local12 - 1, 1024);
					this.method4709(local17 - 1, local12, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 == 0) {
				this.method4709(local17, local12, 536870912);
				this.method4709(local17 - 1, local12, 33554432);
			}
			if (arg1 == 1) {
				this.method4709(local17, local12, 8388608);
				this.method4709(local17, local12 + 1, 134217728);
			}
			if (arg1 == 2) {
				this.method4709(local17, local12, 33554432);
				this.method4709(local17 + 1, local12, 536870912);
			}
			if (arg1 == 3) {
				this.method4709(local17, local12, 134217728);
				this.method4709(local17, local12 - 1, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				this.method4709(local17, local12, 4194304);
				this.method4709(local17 - 1, local12 + 1, 67108864);
			}
			if (arg1 == 1) {
				this.method4709(local17, local12, 16777216);
				this.method4709(local17 + 1, local12 - -1, 268435456);
			}
			if (arg1 == 2) {
				this.method4709(local17, local12, 67108864);
				this.method4709(local17 + 1, local12 + -1, 4194304);
			}
			if (arg1 == 3) {
				this.method4709(local17, local12, 268435456);
				this.method4709(local17 - 1, local12 - 1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method4709(local17, local12, 545259520);
			this.method4709(local17 - 1, local12, 33554432);
			this.method4709(local17, local12 + 1, 134217728);
		}
		if (arg1 == 1) {
			this.method4709(local17, local12, 41943040);
			this.method4709(local17, local12 + 1, 134217728);
			this.method4709(local17 + 1, local12, 536870912);
		}
		if (arg1 == 2) {
			this.method4709(local17, local12, 167772160);
			this.method4709(local17 + 1, local12, 536870912);
			this.method4709(local17, local12 - 1, 8388608);
		}
		if (arg1 == 3) {
			this.method4709(local17, local12, 671088640);
			this.method4709(local17, local12 - 1, 8388608);
			this.method4709(local17 - 1, local12, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(III)V")
	public void method4717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = arg1 - this.anInt5599;
		@Pc(27) int local27 = arg0 - this.anInt5598;
		this.anIntArrayArray34[local22][local27] |= 0x40000;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIII)V")
	private void method4718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray34[arg0][arg1] &= ~arg2;
	}
}
