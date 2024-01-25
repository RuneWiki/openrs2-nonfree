import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class59 {

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	public int anInt1345;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	public int anInt1347;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIIIII)Z")
	public boolean method1181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg3 == arg0 && arg6 == arg4) {
				return true;
			}
		} else if (arg3 >= arg0 && arg5 + arg0 - 1 >= arg3 && arg6 <= arg6 && arg6 <= arg6 + arg5 - 1) {
			return true;
		}
		@Pc(48) int local48 = arg4 - this.anInt1342;
		@Pc(53) int local53 = arg0 - this.anInt1345;
		@Pc(58) int local58 = arg3 - this.anInt1345;
		@Pc(68) int local68 = arg6 - this.anInt1342;
		if (arg5 == 1) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local53 == local58 - 1 && local68 == local48) {
						return true;
					}
					if (local58 == local53 && local68 + 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 && local68 - 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local58 == local53 && local48 == local68 + 1) {
						return true;
					}
					if (local53 == local58 - 1 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local58 + 1 == local53 && local48 == local68) {
						return true;
					}
					if (local53 == local58 && local68 + 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local68 - 1 && (this.anIntArrayArray34[local53][local48] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local53 == local58 && local68 - 1 == local48) {
						return true;
					}
					if (local58 - 1 == local53 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local58 - 1 == local53 && local48 == local68) {
						return true;
					}
					if (local53 == local58 && local48 == local68 + 1) {
						return true;
					}
					if (local58 + 1 == local53 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local68 - 1 && (this.anIntArrayArray34[local53][local48] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local58 - 1 == local53 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 == local58 && local68 + 1 == local48) {
						return true;
					}
					if (local58 + 1 == local53 && local68 == local48) {
						return true;
					}
					if (local53 == local58 && local68 - 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local53 == local58 - 1 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 == local53 && local48 == local68 + 1 && (this.anIntArrayArray34[local53][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local48 == local68) {
						return true;
					}
					if (local53 == local58 && local48 == local68 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local58 - 1 == local53 && local48 == local68) {
						return true;
					}
					if (local53 == local58 && local68 + 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 == local53 && local68 - 1 == local48) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local53 == local58 && local68 + 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x20) == 0) {
					return true;
				}
				if (local58 == local53 && local68 - 1 == local48 && (this.anIntArrayArray34[local53][local48] & 0x2) == 0) {
					return true;
				}
				if (local58 - 1 == local53 && local68 == local48 && (this.anIntArrayArray34[local53][local48] & 0x8) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local48 == local68 && (this.anIntArrayArray34[local53][local48] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(79) int local79 = arg5 + local53 - 1;
			@Pc(85) int local85 = local48 + arg5 - 1;
			if (arg1 == 0) {
				if (arg2 == 0) {
					if (local58 - arg5 == local53 && local48 <= local68 && local68 <= local85) {
						return true;
					}
					if (local53 <= local58 && local58 <= local79 && local68 + 1 == local48 && (this.anIntArrayArray34[local58][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 <= local58 && local58 <= local79 && local68 - arg5 == local48 && (this.anIntArrayArray34[local58][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local53 <= local58 && local79 >= local58 && local48 == local68 + 1) {
						return true;
					}
					if (local58 - arg5 == local53 && local68 >= local48 && local85 >= local68 && (this.anIntArrayArray34[local79][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local68 >= local48 && local68 <= local85 && (this.anIntArrayArray34[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local53 == local58 + 1 && local48 <= local68 && local68 <= local85) {
						return true;
					}
					if (local53 <= local58 && local58 <= local79 && local48 == local68 + 1 && (this.anIntArrayArray34[local58][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 <= local58 && local79 >= local58 && local48 == local68 - arg5 && (this.anIntArrayArray34[local58][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local53 <= local58 && local58 <= local79 && local48 == local68 - arg5) {
						return true;
					}
					if (local58 - arg5 == local53 && local48 <= local68 && local85 >= local68 && (this.anIntArrayArray34[local79][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 + 1 == local53 && local68 >= local48 && local85 >= local68 && (this.anIntArrayArray34[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					if (local53 == local58 - arg5 && local48 <= local68 && local68 <= local85) {
						return true;
					}
					if (local58 >= local53 && local58 <= local79 && local48 == local68 + 1) {
						return true;
					}
					if (local58 + 1 == local53 && local48 <= local68 && local68 <= local85 && (this.anIntArrayArray34[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local53 <= local58 && local79 >= local58 && local68 - arg5 == local48 && (this.anIntArrayArray34[local58][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local53 == local58 - arg5 && local48 <= local68 && local85 >= local68 && (this.anIntArrayArray34[local79][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local53 <= local58 && local79 >= local58 && local68 + 1 == local48) {
						return true;
					}
					if (local58 + 1 == local53 && local48 <= local68 && local85 >= local68) {
						return true;
					}
					if (local53 <= local58 && local79 >= local58 && local68 - arg5 == local48 && (this.anIntArrayArray34[local58][local85] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local53 == local58 - arg5 && local68 >= local48 && local68 <= local85 && (this.anIntArrayArray34[local79][local68] & 0x2C0108) == 0) {
						return true;
					}
					if (local58 >= local53 && local58 <= local79 && local68 + 1 == local48 && (this.anIntArrayArray34[local58][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local48 <= local68 && local85 >= local68) {
						return true;
					}
					if (local58 >= local53 && local79 >= local58 && local48 == local68 - arg5) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local58 - arg5 == local53 && local48 <= local68 && local68 <= local85) {
						return true;
					}
					if (local58 >= local53 && local58 <= local79 && local68 + 1 == local48 && (this.anIntArrayArray34[local58][local48] & 0x2C0120) == 0) {
						return true;
					}
					if (local53 == local58 + 1 && local68 >= local48 && local68 <= local85 && (this.anIntArrayArray34[local53][local68] & 0x2C0180) == 0) {
						return true;
					}
					if (local58 >= local53 && local79 >= local58 && local48 == local68 - arg5) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local53 <= local58 && local79 >= local58 && local68 + 1 == local48 && (this.anIntArrayArray34[local58][local48] & 0x2C0120) == 0) {
					return true;
				}
				if (local53 <= local58 && local79 >= local58 && local68 - arg5 == local48 && (this.anIntArrayArray34[local58][local85] & 0x2C0102) == 0) {
					return true;
				}
				if (local58 - arg5 == local53 && local68 >= local48 && local68 <= local85 && (this.anIntArrayArray34[local79][local68] & 0x2C0108) == 0) {
					return true;
				}
				if (local53 == local58 + 1 && local48 <= local68 && local85 >= local68 && (this.anIntArrayArray34[local53][local68] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIZIZB)V")
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) int local8 = arg4 - this.anInt1345;
		@Pc(13) int local13 = arg1 - this.anInt1342;
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1185(local13, local8, 128);
				this.method1185(local13, local8 - 1, 8);
			}
			if (arg0 == 1) {
				this.method1185(local13, local8, 2);
				this.method1185(local13 + 1, local8, 32);
			}
			if (arg0 == 2) {
				this.method1185(local13, local8, 8);
				this.method1185(local13, local8 + 1, 128);
			}
			if (arg0 == 3) {
				this.method1185(local13, local8, 32);
				this.method1185(local13 - 1, local8, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1185(local13, local8, 1);
				this.method1185(local13 + 1, local8 + -1, 16);
			}
			if (arg0 == 1) {
				this.method1185(local13, local8, 4);
				this.method1185(local13 + 1, local8 - -1, 64);
			}
			if (arg0 == 2) {
				this.method1185(local13, local8, 16);
				this.method1185(local13 - 1, local8 + 1, 1);
			}
			if (arg0 == 3) {
				this.method1185(local13, local8, 64);
				this.method1185(local13 - 1, local8 - 1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg0 == 0) {
				this.method1185(local13, local8, 130);
				this.method1185(local13, local8 - 1, 8);
				this.method1185(local13 + 1, local8, 32);
			}
			if (arg0 == 1) {
				this.method1185(local13, local8, 10);
				this.method1185(local13 + 1, local8, 32);
				this.method1185(local13, local8 + 1, 128);
			}
			if (arg0 == 2) {
				this.method1185(local13, local8, 40);
				this.method1185(local13, local8 + 1, 128);
				this.method1185(local13 - 1, local8, 2);
			}
			if (arg0 == 3) {
				this.method1185(local13, local8, 160);
				this.method1185(local13 - 1, local8, 2);
				this.method1185(local13, local8 - 1, 8);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					this.method1185(local13, local8, 65536);
					this.method1185(local13, local8 - 1, 4096);
				}
				if (arg0 == 1) {
					this.method1185(local13, local8, 1024);
					this.method1185(local13 + 1, local8, 16384);
				}
				if (arg0 == 2) {
					this.method1185(local13, local8, 4096);
					this.method1185(local13, local8 + 1, 65536);
				}
				if (arg0 == 3) {
					this.method1185(local13, local8, 16384);
					this.method1185(local13 - 1, local8, 1024);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					this.method1185(local13, local8, 512);
					this.method1185(local13 + 1, local8 + -1, 8192);
				}
				if (arg0 == 1) {
					this.method1185(local13, local8, 2048);
					this.method1185(local13 + 1, local8 + 1, 32768);
				}
				if (arg0 == 2) {
					this.method1185(local13, local8, 8192);
					this.method1185(local13 - 1, local8 + 1, 512);
				}
				if (arg0 == 3) {
					this.method1185(local13, local8, 32768);
					this.method1185(local13 - 1, local8 + -1, 2048);
				}
			}
			if (arg2 == 2) {
				if (arg0 == 0) {
					this.method1185(local13, local8, 66560);
					this.method1185(local13, local8 - 1, 4096);
					this.method1185(local13 + 1, local8, 16384);
				}
				if (arg0 == 1) {
					this.method1185(local13, local8, 5120);
					this.method1185(local13 + 1, local8, 16384);
					this.method1185(local13, local8 + 1, 65536);
				}
				if (arg0 == 2) {
					this.method1185(local13, local8, 20480);
					this.method1185(local13, local8 + 1, 65536);
					this.method1185(local13 - 1, local8, 1024);
				}
				if (arg0 == 3) {
					this.method1185(local13, local8, 81920);
					this.method1185(local13 - 1, local8, 1024);
					this.method1185(local13, local8 - 1, 4096);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 == 0) {
				this.method1185(local13, local8, 536870912);
				this.method1185(local13, local8 - 1, 33554432);
			}
			if (arg0 == 1) {
				this.method1185(local13, local8, 8388608);
				this.method1185(local13 + 1, local8, 134217728);
			}
			if (arg0 == 2) {
				this.method1185(local13, local8, 33554432);
				this.method1185(local13, local8 + 1, 536870912);
			}
			if (arg0 == 3) {
				this.method1185(local13, local8, 134217728);
				this.method1185(local13 - 1, local8, 8388608);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				this.method1185(local13, local8, 4194304);
				this.method1185(local13 + 1, local8 + -1, 67108864);
			}
			if (arg0 == 1) {
				this.method1185(local13, local8, 16777216);
				this.method1185(local13 + 1, local8 + 1, 268435456);
			}
			if (arg0 == 2) {
				this.method1185(local13, local8, 67108864);
				this.method1185(local13 - 1, local8 + 1, 4194304);
			}
			if (arg0 == 3) {
				this.method1185(local13, local8, 268435456);
				this.method1185(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1185(local13, local8, 545259520);
			this.method1185(local13, local8 - 1, 33554432);
			this.method1185(local13 + 1, local8, 134217728);
		}
		if (arg0 == 1) {
			this.method1185(local13, local8, 41943040);
			this.method1185(local13 + 1, local8, 134217728);
			this.method1185(local13, local8 + 1, 536870912);
		}
		if (arg0 == 2) {
			this.method1185(local13, local8, 167772160);
			this.method1185(local13, local8 + 1, 536870912);
			this.method1185(local13 - 1, local8, 8388608);
		}
		if (arg0 == 3) {
			this.method1185(local13, local8, 671088640);
			this.method1185(local13 - 1, local8, 8388608);
			this.method1185(local13, local8 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
	private void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIBIIII)Z")
	public boolean method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg6 == arg3 && arg2 == arg4) {
				return true;
			}
		} else if (arg6 <= arg3 && arg3 <= arg0 + arg6 - 1 && arg4 >= arg4 && arg0 + arg4 - 1 >= arg4) {
			return true;
		}
		@Pc(55) int local55 = arg6 - this.anInt1345;
		@Pc(60) int local60 = arg4 - this.anInt1342;
		@Pc(70) int local70 = arg3 - this.anInt1345;
		@Pc(75) int local75 = arg2 - this.anInt1342;
		if (arg0 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local55 == local70 + 1 && local75 == local60 && (this.anIntArrayArray34[local55][local75] & 0x80) == 0) {
						return true;
					}
					if (local70 == local55 && local75 == local60 - 1 && (this.anIntArrayArray34[local55][local75] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 - 1 == local55 && local60 == local75 && (this.anIntArrayArray34[local55][local75] & 0x8) == 0) {
						return true;
					}
					if (local55 == local70 && local75 == local60 - 1 && (this.anIntArrayArray34[local55][local75] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local55 == local70 - 1 && local60 == local75 && (this.anIntArrayArray34[local55][local75] & 0x8) == 0) {
						return true;
					}
					if (local55 == local70 && local60 + 1 == local75 && (this.anIntArrayArray34[local55][local75] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local55 == local70 + 1 && local60 == local75 && (this.anIntArrayArray34[local55][local75] & 0x80) == 0) {
						return true;
					}
					if (local55 == local70 && local60 + 1 == local75 && (this.anIntArrayArray34[local55][local75] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local70 == local55 && local60 + 1 == local75 && (this.anIntArrayArray34[local55][local75] & 0x20) == 0) {
					return true;
				}
				if (local70 == local55 && local75 == local60 - 1 && (this.anIntArrayArray34[local55][local75] & 0x2) == 0) {
					return true;
				}
				if (local70 - 1 == local55 && local75 == local60 && (this.anIntArrayArray34[local55][local75] & 0x8) == 0) {
					return true;
				}
				if (local70 + 1 == local55 && local75 == local60 && (this.anIntArrayArray34[local55][local75] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(427) int local427 = arg0 + local55 - 1;
			@Pc(433) int local433 = local75 + arg0 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg5 = arg5 + 2 & 0x3;
				}
				if (arg5 == 0) {
					if (local55 == local70 + 1 && local60 >= local75 && local60 <= local433 && (this.anIntArrayArray34[local55][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 >= local55 && local70 <= local427 && local60 - arg0 == local75 && (this.anIntArrayArray34[local70][local433] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (local70 - arg0 == local55 && local75 <= local60 && local60 <= local433 && (this.anIntArrayArray34[local427][local60] & 0x8) == 0) {
						return true;
					}
					if (local55 <= local70 && local70 <= local427 && local75 == local60 - arg0 && (this.anIntArrayArray34[local70][local433] & 0x2) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (local70 - arg0 == local55 && local60 >= local75 && local60 <= local433 && (this.anIntArrayArray34[local427][local60] & 0x8) == 0) {
						return true;
					}
					if (local70 >= local55 && local427 >= local70 && local75 == local60 + 1 && (this.anIntArrayArray34[local70][local75] & 0x20) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (local70 + 1 == local55 && local75 <= local60 && local433 >= local60 && (this.anIntArrayArray34[local55][local60] & 0x80) == 0) {
						return true;
					}
					if (local70 >= local55 && local70 <= local427 && local75 == local60 + 1 && (this.anIntArrayArray34[local70][local75] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local55 <= local70 && local427 >= local70 && local60 + 1 == local75 && (this.anIntArrayArray34[local70][local75] & 0x20) == 0) {
					return true;
				}
				if (local55 <= local70 && local70 <= local427 && local75 == local60 - arg0 && (this.anIntArrayArray34[local70][local433] & 0x2) == 0) {
					return true;
				}
				if (local70 - arg0 == local55 && local75 <= local60 && local433 >= local60 && (this.anIntArrayArray34[local427][local60] & 0x8) == 0) {
					return true;
				}
				if (local55 == local70 + 1 && local75 <= local60 && local60 <= local433 && (this.anIntArrayArray34[local55][local60] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIIZI)V")
	public void method1187(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg3 - this.anInt1342;
		@Pc(13) int local13 = arg5 - this.anInt1345;
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1199(local4, 128, local13);
				this.method1199(local4, 8, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1199(local4, 2, local13);
				this.method1199(local4 + 1, 32, local13);
			}
			if (arg2 == 2) {
				this.method1199(local4, 8, local13);
				this.method1199(local4, 128, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1199(local4, 32, local13);
				this.method1199(local4 - 1, 2, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1199(local4, 1, local13);
				this.method1199(local4 + 1, 16, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1199(local4, 4, local13);
				this.method1199(local4 + 1, 64, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1199(local4, 16, local13);
				this.method1199(local4 - 1, 1, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1199(local4, 64, local13);
				this.method1199(local4 - 1, 4, local13 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg2 == 0) {
				this.method1199(local4, 130, local13);
				this.method1199(local4, 8, local13 - 1);
				this.method1199(local4 + 1, 32, local13);
			}
			if (arg2 == 1) {
				this.method1199(local4, 10, local13);
				this.method1199(local4 + 1, 32, local13);
				this.method1199(local4, 128, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1199(local4, 40, local13);
				this.method1199(local4, 128, local13 + 1);
				this.method1199(local4 - 1, 2, local13);
			}
			if (arg2 == 3) {
				this.method1199(local4, 160, local13);
				this.method1199(local4 - 1, 2, local13);
				this.method1199(local4, 8, local13 - 1);
			}
		}
		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					this.method1199(local4, 65536, local13);
					this.method1199(local4, 4096, local13 - 1);
				}
				if (arg2 == 1) {
					this.method1199(local4, 1024, local13);
					this.method1199(local4 + 1, 16384, local13);
				}
				if (arg2 == 2) {
					this.method1199(local4, 4096, local13);
					this.method1199(local4, 65536, local13 + 1);
				}
				if (arg2 == 3) {
					this.method1199(local4, 16384, local13);
					this.method1199(local4 - 1, 1024, local13);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					this.method1199(local4, 512, local13);
					this.method1199(local4 + 1, 8192, local13 - 1);
				}
				if (arg2 == 1) {
					this.method1199(local4, 2048, local13);
					this.method1199(local4 + 1, 32768, local13 + 1);
				}
				if (arg2 == 2) {
					this.method1199(local4, 8192, local13);
					this.method1199(local4 - 1, 512, local13 + 1);
				}
				if (arg2 == 3) {
					this.method1199(local4, 32768, local13);
					this.method1199(local4 - 1, 2048, local13 - 1);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					this.method1199(local4, 66560, local13);
					this.method1199(local4, 4096, local13 - 1);
					this.method1199(local4 + 1, 16384, local13);
				}
				if (arg2 == 1) {
					this.method1199(local4, 5120, local13);
					this.method1199(local4 + 1, 16384, local13);
					this.method1199(local4, 65536, local13 + 1);
				}
				if (arg2 == 2) {
					this.method1199(local4, 20480, local13);
					this.method1199(local4, 65536, local13 + 1);
					this.method1199(local4 - 1, 1024, local13);
				}
				if (arg2 == 3) {
					this.method1199(local4, 81920, local13);
					this.method1199(local4 - 1, 1024, local13);
					this.method1199(local4, 4096, local13 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 == 0) {
				this.method1199(local4, 536870912, local13);
				this.method1199(local4, 33554432, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1199(local4, 8388608, local13);
				this.method1199(local4 + 1, 134217728, local13);
			}
			if (arg2 == 2) {
				this.method1199(local4, 33554432, local13);
				this.method1199(local4, 536870912, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1199(local4, 134217728, local13);
				this.method1199(local4 - 1, 8388608, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				this.method1199(local4, 4194304, local13);
				this.method1199(local4 + 1, 67108864, local13 - 1);
			}
			if (arg2 == 1) {
				this.method1199(local4, 16777216, local13);
				this.method1199(local4 + 1, 268435456, local13 + 1);
			}
			if (arg2 == 2) {
				this.method1199(local4, 67108864, local13);
				this.method1199(local4 - 1, 4194304, local13 + 1);
			}
			if (arg2 == 3) {
				this.method1199(local4, 268435456, local13);
				this.method1199(local4 - 1, 16777216, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1199(local4, 545259520, local13);
			this.method1199(local4, 33554432, local13 - 1);
			this.method1199(local4 + 1, 134217728, local13);
		}
		if (arg2 == 1) {
			this.method1199(local4, 41943040, local13);
			this.method1199(local4 + 1, 134217728, local13);
			this.method1199(local4, 536870912, local13 + 1);
		}
		if (arg2 == 2) {
			this.method1199(local4, 167772160, local13);
			this.method1199(local4, 536870912, local13 + 1);
			this.method1199(local4 - 1, 8388608, local13);
		}
		if (arg2 == 3) {
			this.method1199(local4, 671088640, local13);
			this.method1199(local4 - 1, 8388608, local13);
			this.method1199(local4, 33554432, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZIIZII)V")
	public void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg2) {
			local7 = 131328;
		}
		@Pc(24) int local24 = arg0 - this.anInt1342;
		@Pc(34) int local34;
		if (arg4 == 1 || arg4 == 3) {
			local34 = arg1;
			arg1 = arg6;
			arg6 = local34;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(49) int local49 = arg3 - this.anInt1345;
		for (local34 = local49; local34 < local49 + arg1; local34++) {
			if (local34 >= 0 && local34 < this.anInt1347) {
				for (@Pc(65) int local65 = local24; local65 < arg6 + local24; local65++) {
					if (local65 >= 0 && this.anInt1343 > local65) {
						this.method1199(local65, local7, local34);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	public void method1189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1345;
		@Pc(9) int local9 = arg1 - this.anInt1342;
		this.anIntArrayArray34[local4][local9] |= 0x40000;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZIIIBI)V")
	public void method1190(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = 256;
		if (arg1) {
			local23 = 131328;
		}
		@Pc(34) int local34 = arg2 - this.anInt1345;
		@Pc(39) int local39 = arg4 - this.anInt1342;
		if (arg0) {
			local23 |= 0x40000000;
		}
		for (@Pc(47) int local47 = local34; local47 < arg5 + local34; local47++) {
			if (local47 >= 0 && this.anInt1347 > local47) {
				for (@Pc(57) int local57 = local39; local57 < arg3 + local39; local57++) {
					if (local57 >= 0 && local57 < this.anInt1343) {
						this.method1185(local57, local47, local23);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	public void method1192() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1347; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt1343; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt1347 - 5 <= local8 || this.anInt1343 - 5 <= local12) {
					this.anIntArrayArray34[local8][local12] = -1;
				} else {
					this.anIntArrayArray34[local8][local12] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIIIB)Z")
	public boolean method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(14) int local14 = arg7 + arg6;
		@Pc(19) int local19 = arg3 + arg0;
		@Pc(24) int local24 = arg2 + arg8;
		@Pc(28) int local28 = arg1 + arg4;
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (local24 == arg6 && (arg5 & 0x2) == 0) {
			local60 = arg4 < arg3 ? arg3 : arg4;
			local67 = local19 >= local28 ? local28 : local19;
			while (local67 > local60) {
				if ((this.anIntArrayArray34[local24 - this.anInt1345 - 1][local60 - this.anInt1342] & 0x8) == 0) {
					return true;
				}
				local60++;
			}
		} else if (local14 == arg2 && (arg5 & 0x8) == 0) {
			local60 = arg3 <= arg4 ? arg4 : arg3;
			local67 = local28 <= local19 ? local28 : local19;
			while (local67 > local60) {
				if ((this.anIntArrayArray34[arg2 - this.anInt1345][local60 - this.anInt1342] & 0x80) == 0) {
					return true;
				}
				local60++;
			}
		} else if (arg3 == local28 && (arg5 & 0x1) == 0) {
			local60 = arg6 <= arg2 ? arg2 : arg6;
			local67 = local24 <= local14 ? local24 : local14;
			while (local67 > local60) {
				if ((this.anIntArrayArray34[local60 - this.anInt1345][local28 - this.anInt1342 - 1] & 0x2) == 0) {
					return true;
				}
				local60++;
			}
		} else if (local19 == arg4 && (arg5 & 0x4) == 0) {
			local60 = arg6 <= arg2 ? arg2 : arg6;
			local67 = local24 > local14 ? local14 : local24;
			while (local67 > local60) {
				if ((this.anIntArrayArray34[local60 - this.anInt1345][arg4 - this.anInt1342] & 0x20) == 0) {
					return true;
				}
				local60++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static113.method1786(arg2, arg1, arg7, arg5, arg4, arg3, arg7, arg0) ? true : this.method1193(arg7, arg1, arg3, arg4, arg0, arg6, arg5, arg7, arg2);
		}
		@Pc(45) int local45 = arg2 + arg3 - 1;
		@Pc(51) int local51 = arg0 + arg1 - 1;
		if (arg5 >= arg3 && arg5 <= local45 && arg0 <= arg4 && arg4 <= local51) {
			return true;
		} else if (arg3 - 1 == arg5 && arg4 >= arg0 && arg4 <= local51 && (this.anIntArrayArray34[arg5 - this.anInt1345][arg4 - this.anInt1342] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		} else if (local45 + 1 == arg5 && arg4 >= arg0 && local51 >= arg4 && (this.anIntArrayArray34[arg5 - this.anInt1345][arg4 - this.anInt1342] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg0 - 1 && arg3 <= arg5 && local45 >= arg5 && (this.anIntArrayArray34[arg5 - this.anInt1345][arg4 - this.anInt1342] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		} else {
			return arg4 == local51 + 1 && arg3 <= arg5 && arg5 <= local45 && (this.anIntArrayArray34[arg5 - this.anInt1345][arg4 - this.anInt1342] & 0x20) == 0 && (arg6 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V")
	public void method1196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1345;
		@Pc(18) int local18 = arg1 - this.anInt1342;
		this.anIntArrayArray34[local4][local18] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V")
	public void method1197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt1342;
		@Pc(9) int local9 = arg0 - this.anInt1345;
		this.anIntArrayArray34[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(III)V")
	public void method1198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1345;
		@Pc(9) int local9 = arg1 - this.anInt1342;
		this.anIntArrayArray34[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZII)V")
	private void method1199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray34[arg2][arg0] &= ~arg1;
	}
}
