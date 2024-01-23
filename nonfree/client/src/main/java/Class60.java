import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class60 {

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private int anInt2157 = 0;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private int anInt2155;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	private int anInt2163;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	private int anInt2166;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2155 = arg0;
		this.anInt2163 = arg1;
		this.anInt2166 = 0;
		this.anIntArrayArray24 = new int[this.anInt2155][this.anInt2163];
		this.method1686();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
	public void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg4 - this.anInt2157;
		@Pc(8) int local8 = 256;
		@Pc(13) int local13 = arg5 - this.anInt2166;
		@Pc(25) int local25;
		if (arg0 == 1 || arg0 == 3) {
			local25 = arg3;
			arg3 = arg2;
			arg2 = local25;
		}
		if (arg1) {
			local8 = 131328;
		}
		for (local25 = local6; local25 < local6 + arg3; local25++) {
			if (local25 >= 0 && local25 < this.anInt2155) {
				for (@Pc(61) int local61 = local13; local61 < local13 + arg2; local61++) {
					if (local61 >= 0 && this.anInt2163 > local61) {
						this.method1681(local8, local61, local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg2 + arg6 && arg1 + arg5 > arg2) {
			return arg7 + arg3 > arg0 && arg7 < arg4 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 1) {
			if (arg2 == arg4 && arg3 == arg1) {
				return true;
			}
		} else if (arg2 <= arg4 && arg4 <= arg2 + arg5 - 1 && arg3 >= arg3 && arg3 + arg5 - 1 >= arg3) {
			return true;
		}
		@Pc(59) int local59 = arg2 - this.anInt2157;
		@Pc(64) int local64 = arg1 - this.anInt2166;
		@Pc(69) int local69 = arg4 - this.anInt2157;
		@Pc(74) int local74 = arg3 - this.anInt2166;
		if (arg5 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray24[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local59 == local69 && local64 == local74 - 1 && (this.anIntArrayArray24[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local59 == local69 - 1 && local74 == local64 && (this.anIntArrayArray24[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local59 == local69 && local64 == local74 - 1 && (this.anIntArrayArray24[local59][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local69 - 1 && local64 == local74 && (this.anIntArrayArray24[local59][local64] & 0x8) == 0) {
						return true;
					}
					if (local69 == local59 && local64 == local74 + 1 && (this.anIntArrayArray24[local59][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray24[local59][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 == local59 && local74 + 1 == local64 && (this.anIntArrayArray24[local59][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local69 == local59 && local64 == local74 + 1 && (this.anIntArrayArray24[local59][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 == local59 && local64 == local74 - 1 && (this.anIntArrayArray24[local59][local64] & 0x2) == 0) {
					return true;
				}
				if (local69 - 1 == local59 && local74 == local64 && (this.anIntArrayArray24[local59][local64] & 0x8) == 0) {
					return true;
				}
				if (local59 == local69 + 1 && local64 == local74 && (this.anIntArrayArray24[local59][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(404) int local404 = local59 + arg5 - 1;
			@Pc(411) int local411 = local64 + arg5 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local59 == local69 + 1 && local64 <= local74 && local411 >= local74 && (this.anIntArrayArray24[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local404 && local64 == local74 - arg5 && (this.anIntArrayArray24[local69][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local69 - arg5 == local59 && local64 <= local74 && local411 >= local74 && (this.anIntArrayArray24[local404][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local404 && local64 == local74 - arg5 && (this.anIntArrayArray24[local69][local411] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local59 == local69 - arg5 && local64 <= local74 && local74 <= local411 && (this.anIntArrayArray24[local404][local74] & 0x8) == 0) {
						return true;
					}
					if (local59 <= local69 && local69 <= local404 && local74 + 1 == local64 && (this.anIntArrayArray24[local69][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local59 == local69 + 1 && local74 >= local64 && local411 >= local74 && (this.anIntArrayArray24[local59][local74] & 0x80) == 0) {
						return true;
					}
					if (local59 <= local69 && local404 >= local69 && local64 == local74 + 1 && (this.anIntArrayArray24[local69][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local69 >= local59 && local404 >= local69 && local64 == local74 + 1 && (this.anIntArrayArray24[local69][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 >= local59 && local69 <= local404 && local64 == local74 - arg5 && (this.anIntArrayArray24[local69][local411] & 0x2) == 0) {
					return true;
				}
				if (local59 == local69 - arg5 && local74 >= local64 && local411 >= local74 && (this.anIntArrayArray24[local404][local74] & 0x8) == 0) {
					return true;
				}
				if (local69 + 1 == local59 && local64 <= local74 && local411 >= local74 && (this.anIntArrayArray24[local59][local74] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZII)V")
	public void method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 - this.anInt2166;
		@Pc(9) int local9 = arg4 - this.anInt2157;
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1681(128, local4, local9);
				this.method1681(8, local4, local9 - 1);
			}
			if (arg3 == 1) {
				this.method1681(2, local4, local9);
				this.method1681(32, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method1681(8, local4, local9);
				this.method1681(128, local4, local9 + 1);
			}
			if (arg3 == 3) {
				this.method1681(32, local4, local9);
				this.method1681(2, local4 - 1, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1681(1, local4, local9);
				this.method1681(16, local4 + 1, local9 + -1);
			}
			if (arg3 == 1) {
				this.method1681(4, local4, local9);
				this.method1681(64, local4 + 1, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1681(16, local4, local9);
				this.method1681(1, local4 - 1, local9 + 1);
			}
			if (arg3 == 3) {
				this.method1681(64, local4, local9);
				this.method1681(4, local4 - 1, local9 - 1);
			}
		}
		if (arg1 == 2) {
			if (arg3 == 0) {
				this.method1681(130, local4, local9);
				this.method1681(8, local4, local9 - 1);
				this.method1681(32, local4 + 1, local9);
			}
			if (arg3 == 1) {
				this.method1681(10, local4, local9);
				this.method1681(32, local4 + 1, local9);
				this.method1681(128, local4, local9 + 1);
			}
			if (arg3 == 2) {
				this.method1681(40, local4, local9);
				this.method1681(128, local4, local9 + 1);
				this.method1681(2, local4 - 1, local9);
			}
			if (arg3 == 3) {
				this.method1681(160, local4, local9);
				this.method1681(2, local4 - 1, local9);
				this.method1681(8, local4, local9 - 1);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 == 0) {
				this.method1681(65536, local4, local9);
				this.method1681(4096, local4, local9 - 1);
			}
			if (arg3 == 1) {
				this.method1681(1024, local4, local9);
				this.method1681(16384, local4 + 1, local9);
			}
			if (arg3 == 2) {
				this.method1681(4096, local4, local9);
				this.method1681(65536, local4, local9 + 1);
			}
			if (arg3 == 3) {
				this.method1681(16384, local4, local9);
				this.method1681(1024, local4 - 1, local9);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg3 == 0) {
				this.method1681(512, local4, local9);
				this.method1681(8192, local4 + 1, local9 + -1);
			}
			if (arg3 == 1) {
				this.method1681(2048, local4, local9);
				this.method1681(32768, local4 + 1, local9 - -1);
			}
			if (arg3 == 2) {
				this.method1681(8192, local4, local9);
				this.method1681(512, local4 - 1, local9 + 1);
			}
			if (arg3 == 3) {
				this.method1681(32768, local4, local9);
				this.method1681(2048, local4 - 1, local9 + -1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1681(66560, local4, local9);
			this.method1681(4096, local4, local9 - 1);
			this.method1681(16384, local4 + 1, local9);
		}
		if (arg3 == 1) {
			this.method1681(5120, local4, local9);
			this.method1681(16384, local4 + 1, local9);
			this.method1681(65536, local4, local9 + 1);
		}
		if (arg3 == 2) {
			this.method1681(20480, local4, local9);
			this.method1681(65536, local4, local9 + 1);
			this.method1681(1024, local4 - 1, local9);
		}
		if (arg3 == 3) {
			this.method1681(81920, local4, local9);
			this.method1681(1024, local4 - 1, local9);
			this.method1681(4096, local4, local9 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIZI)V")
	public void method1677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - this.anInt2166;
		@Pc(15) int local15 = arg3 - this.anInt2157;
		@Pc(17) int local17 = 256;
		if (arg2) {
			local17 = 131328;
		}
		for (@Pc(25) int local25 = local15; local25 < arg0 + local15; local25++) {
			if (local25 >= 0 && this.anInt2155 > local25) {
				for (@Pc(47) int local47 = local10; local47 < local10 + arg4; local47++) {
					if (local47 >= 0 && local47 < this.anInt2163) {
						this.method1684(local25, local47, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
	public void method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(8) int local8 = arg1 - this.anInt2157;
		@Pc(29) int local29 = arg0 - this.anInt2166;
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1684(local8, local29, 128);
				this.method1684(local8 - 1, local29, 8);
			}
			if (arg3 == 1) {
				this.method1684(local8, local29, 2);
				this.method1684(local8, local29 + 1, 32);
			}
			if (arg3 == 2) {
				this.method1684(local8, local29, 8);
				this.method1684(local8 + 1, local29, 128);
			}
			if (arg3 == 3) {
				this.method1684(local8, local29, 32);
				this.method1684(local8, local29 - 1, 2);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1684(local8, local29, 1);
				this.method1684(local8 - 1, local29 + 1, 16);
			}
			if (arg3 == 1) {
				this.method1684(local8, local29, 4);
				this.method1684(local8 + 1, local29 - -1, 64);
			}
			if (arg3 == 2) {
				this.method1684(local8, local29, 16);
				this.method1684(local8 + 1, local29 - 1, 1);
			}
			if (arg3 == 3) {
				this.method1684(local8, local29, 64);
				this.method1684(local8 - 1, local29 + -1, 4);
			}
		}
		if (arg2 == 2) {
			if (arg3 == 0) {
				this.method1684(local8, local29, 130);
				this.method1684(local8 - 1, local29, 8);
				this.method1684(local8, local29 + 1, 32);
			}
			if (arg3 == 1) {
				this.method1684(local8, local29, 10);
				this.method1684(local8, local29 + 1, 32);
				this.method1684(local8 + 1, local29, 128);
			}
			if (arg3 == 2) {
				this.method1684(local8, local29, 40);
				this.method1684(local8 + 1, local29, 128);
				this.method1684(local8, local29 - 1, 2);
			}
			if (arg3 == 3) {
				this.method1684(local8, local29, 160);
				this.method1684(local8, local29 - 1, 2);
				this.method1684(local8 - 1, local29, 8);
			}
		}
		if (!arg4) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 == 0) {
				this.method1684(local8, local29, 65536);
				this.method1684(local8 - 1, local29, 4096);
			}
			if (arg3 == 1) {
				this.method1684(local8, local29, 1024);
				this.method1684(local8, local29 + 1, 16384);
			}
			if (arg3 == 2) {
				this.method1684(local8, local29, 4096);
				this.method1684(local8 + 1, local29, 65536);
			}
			if (arg3 == 3) {
				this.method1684(local8, local29, 16384);
				this.method1684(local8, local29 - 1, 1024);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				this.method1684(local8, local29, 512);
				this.method1684(local8 - 1, local29 + 1, 8192);
			}
			if (arg3 == 1) {
				this.method1684(local8, local29, 2048);
				this.method1684(local8 + 1, local29 - -1, 32768);
			}
			if (arg3 == 2) {
				this.method1684(local8, local29, 8192);
				this.method1684(local8 + 1, local29 - 1, 512);
			}
			if (arg3 == 3) {
				this.method1684(local8, local29, 32768);
				this.method1684(local8 - 1, local29 + -1, 2048);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method1684(local8, local29, 66560);
			this.method1684(local8 - 1, local29, 4096);
			this.method1684(local8, local29 + 1, 16384);
		}
		if (arg3 == 1) {
			this.method1684(local8, local29, 5120);
			this.method1684(local8, local29 + 1, 16384);
			this.method1684(local8 + 1, local29, 65536);
		}
		if (arg3 == 2) {
			this.method1684(local8, local29, 20480);
			this.method1684(local8 + 1, local29, 65536);
			this.method1684(local8, local29 - 1, 1024);
		}
		if (arg3 == 3) {
			this.method1684(local8, local29, 81920);
			this.method1684(local8, local29 - 1, 1024);
			this.method1684(local8 - 1, local29, 4096);
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
	public void method1679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - this.anInt2157;
		@Pc(13) int local13 = arg1 - this.anInt2166;
		this.anIntArrayArray24[local8][local13] |= 0x200000;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method1680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2157;
		@Pc(14) int local14 = arg1 - this.anInt2166;
		this.anIntArrayArray24[local4][local14] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method1681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray24[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public void method1683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2166;
		@Pc(13) int local13 = arg1 - this.anInt2157;
		this.anIntArrayArray24[local13][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIII)V")
	private void method1684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray24[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIIII)Z")
	public boolean method1685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg4 == arg0 && arg5 == arg2) {
				return true;
			}
		} else if (arg0 <= arg4 && arg4 <= arg0 + arg6 - 1 && arg5 >= arg5 && arg5 + arg6 - 1 >= arg5) {
			return true;
		}
		@Pc(60) int local60 = arg2 - this.anInt2166;
		@Pc(65) int local65 = arg4 - this.anInt2157;
		@Pc(70) int local70 = arg0 - this.anInt2157;
		@Pc(81) int local81 = arg5 - this.anInt2166;
		if (arg6 == 1) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local70 == local65 - 1 && local60 == local81) {
						return true;
					}
					if (local70 == local65 && local81 + 1 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local81 - 1 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local65 == local70 && local81 + 1 == local60) {
						return true;
					}
					if (local70 == local65 - 1 && local60 == local81 && (this.anIntArrayArray24[local70][local60] & 0x12C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local81 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 + 1 == local70 && local81 == local60) {
						return true;
					}
					if (local70 == local65 && local81 + 1 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local81 - 1 && (this.anIntArrayArray24[local70][local60] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 == local70 && local60 == local81 - 1) {
						return true;
					}
					if (local70 == local65 - 1 && local81 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local81 && (this.anIntArrayArray24[local70][local60] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local70 == local65 - 1 && local60 == local81) {
						return true;
					}
					if (local65 == local70 && local81 + 1 == local60) {
						return true;
					}
					if (local70 == local65 + 1 && local60 == local81 && (this.anIntArrayArray24[local70][local60] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local81 - 1 && (this.anIntArrayArray24[local70][local60] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local65 - 1 == local70 && local60 == local81 && (this.anIntArrayArray24[local70][local60] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local81 + 1) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local81) {
						return true;
					}
					if (local65 == local70 && local60 == local81 - 1 && (this.anIntArrayArray24[local70][local60] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 - 1 == local70 && local81 == local60 && (this.anIntArrayArray24[local70][local60] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local65 && local60 == local81 + 1 && (this.anIntArrayArray24[local70][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local81) {
						return true;
					}
					if (local65 == local70 && local81 - 1 == local60) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 - 1 == local70 && local60 == local81) {
						return true;
					}
					if (local65 == local70 && local60 == local81 + 1 && (this.anIntArrayArray24[local70][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 == local81 && (this.anIntArrayArray24[local70][local60] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 == local65 && local81 - 1 == local60) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local70 == local65 && local81 + 1 == local60 && (this.anIntArrayArray24[local70][local60] & 0x20) == 0) {
					return true;
				}
				if (local70 == local65 && local60 == local81 - 1 && (this.anIntArrayArray24[local70][local60] & 0x2) == 0) {
					return true;
				}
				if (local65 - 1 == local70 && local81 == local60 && (this.anIntArrayArray24[local70][local60] & 0x8) == 0) {
					return true;
				}
				if (local65 + 1 == local70 && local81 == local60 && (this.anIntArrayArray24[local70][local60] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(821) int local821 = local70 + arg6 - 1;
			@Pc(827) int local827 = arg6 + local60 - 1;
			if (arg3 == 0) {
				if (arg1 == 0) {
					if (local65 - arg6 == local70 && local60 <= local81 && local827 >= local81) {
						return true;
					}
					if (local70 <= local65 && local65 <= local821 && local81 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 <= local65 && local821 >= local65 && local60 == local81 - arg6 && (this.anIntArrayArray24[local65][local827] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 <= local65 && local821 >= local65 && local81 + 1 == local60) {
						return true;
					}
					if (local70 == local65 - arg6 && local60 <= local81 && local827 >= local81 && (this.anIntArrayArray24[local821][local81] & 0x12C0108) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local81 >= local60 && local827 >= local81 && (this.anIntArrayArray24[local70][local81] & 0x12C0180) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local70 == local65 + 1 && local81 >= local60 && local827 >= local81) {
						return true;
					}
					if (local65 >= local70 && local65 <= local821 && local81 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local65 >= local70 && local65 <= local821 && local81 - arg6 == local60 && (this.anIntArrayArray24[local65][local827] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 <= local65 && local65 <= local821 && local60 == local81 - arg6) {
						return true;
					}
					if (local65 - arg6 == local70 && local81 >= local60 && local827 >= local81 && (this.anIntArrayArray24[local821][local81] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local81 >= local60 && local827 >= local81 && (this.anIntArrayArray24[local70][local81] & 0x12C0180) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 2) {
				if (arg1 == 0) {
					if (local65 - arg6 == local70 && local81 >= local60 && local81 <= local827) {
						return true;
					}
					if (local65 >= local70 && local821 >= local65 && local60 == local81 + 1) {
						return true;
					}
					if (local70 == local65 + 1 && local81 >= local60 && local81 <= local827 && (this.anIntArrayArray24[local70][local81] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 <= local65 && local65 <= local821 && local60 == local81 - arg6 && (this.anIntArrayArray24[local65][local827] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 == local65 - arg6 && local81 >= local60 && local81 <= local827 && (this.anIntArrayArray24[local821][local81] & 0x12C0108) == 0) {
						return true;
					}
					if (local70 <= local65 && local821 >= local65 && local60 == local81 + 1) {
						return true;
					}
					if (local70 == local65 + 1 && local60 <= local81 && local827 >= local81) {
						return true;
					}
					if (local65 >= local70 && local821 >= local65 && local60 == local81 - arg6 && (this.anIntArrayArray24[local65][local827] & 0x12C0102) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 - arg6 == local70 && local81 >= local60 && local827 >= local81 && (this.anIntArrayArray24[local821][local81] & 0x12C0108) == 0) {
						return true;
					}
					if (local65 >= local70 && local821 >= local65 && local60 == local81 + 1 && (this.anIntArrayArray24[local65][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local70 == local65 + 1 && local81 >= local60 && local827 >= local81) {
						return true;
					}
					if (local65 >= local70 && local65 <= local821 && local81 - arg6 == local60) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local65 - arg6 == local70 && local60 <= local81 && local81 <= local827) {
						return true;
					}
					if (local70 <= local65 && local821 >= local65 && local60 == local81 + 1 && (this.anIntArrayArray24[local65][local60] & 0x12C0120) == 0) {
						return true;
					}
					if (local65 + 1 == local70 && local60 <= local81 && local81 <= local827 && (this.anIntArrayArray24[local70][local81] & 0x12C0180) == 0) {
						return true;
					}
					if (local70 <= local65 && local65 <= local821 && local60 == local81 - arg6) {
						return true;
					}
				}
			}
			if (arg3 == 9) {
				if (local70 <= local65 && local65 <= local821 && local81 + 1 == local60 && (this.anIntArrayArray24[local65][local60] & 0x12C0120) == 0) {
					return true;
				}
				if (local65 >= local70 && local65 <= local821 && local60 == local81 - arg6 && (this.anIntArrayArray24[local65][local827] & 0x12C0102) == 0) {
					return true;
				}
				if (local70 == local65 - arg6 && local81 >= local60 && local81 <= local827 && (this.anIntArrayArray24[local821][local81] & 0x12C0108) == 0) {
					return true;
				}
				if (local65 + 1 == local70 && local81 >= local60 && local81 <= local827 && (this.anIntArrayArray24[local70][local81] & 0x12C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method1686() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt2155; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2163; local12++) {
				if (local8 == 0 || local12 == 0 || this.anInt2155 - 5 <= local8 || local12 >= this.anInt2163 - 5) {
					this.anIntArrayArray24[local8][local12] = 16777215;
				} else {
					this.anIntArrayArray24[local8][local12] = 16777216;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIIIII)Z")
	public boolean method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 > 1) {
			return this.method1674(arg6, arg7, arg0, arg5, arg3, arg3, arg4, arg1) ? true : this.method1688(arg7, arg1, arg2, arg6, arg4, arg0, arg5, arg3, arg3);
		}
		@Pc(54) int local54 = arg0 + arg4 - 1;
		@Pc(60) int local60 = arg5 + arg1 - 1;
		if (arg7 >= arg0 && arg7 <= local54 && arg6 >= arg1 && local60 >= arg6) {
			return true;
		} else if (arg0 - 1 == arg7 && arg1 <= arg6 && arg6 <= local60 && (this.anIntArrayArray24[arg7 - this.anInt2157][arg6 - this.anInt2166] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		} else if (arg7 == local54 + 1 && arg6 >= arg1 && arg6 <= local60 && (this.anIntArrayArray24[arg7 - this.anInt2157][arg6 - this.anInt2166] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg1 - 1 && arg7 >= arg0 && arg7 <= local54 && (this.anIntArrayArray24[arg7 - this.anInt2157][arg6 - this.anInt2166] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		} else {
			return local60 + 1 == arg6 && arg0 <= arg7 && local54 >= arg7 && (this.anIntArrayArray24[arg7 - this.anInt2157][arg6 - this.anInt2166] & 0x20) == 0 && (arg2 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIII)Z")
	private boolean method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(17) int local17 = arg7 + arg0;
		@Pc(21) int local21 = arg5 + arg4;
		@Pc(25) int local25 = arg8 + arg3;
		@Pc(30) int local30 = arg1 + arg6;
		@Pc(68) int local68;
		@Pc(162) int local162;
		if (arg0 >= arg5 && local21 > arg0) {
			if (arg1 == local25 && (arg2 & 0x4) == 0) {
				local68 = arg0;
				local162 = local17 <= local21 ? local17 : local21;
				while (local68 < local162) {
					if ((this.anIntArrayArray24[local68 - this.anInt2157][local25 - this.anInt2166 - 1] & 0x2) == 0) {
						return true;
					}
					local68++;
				}
			} else if (arg3 == local30 && (arg2 & 0x1) == 0) {
				local68 = arg0;
				local162 = local17 <= local21 ? local17 : local21;
				while (local162 > local68) {
					if ((this.anIntArrayArray24[local68 - this.anInt2157][arg3 - this.anInt2166] & 0x20) == 0) {
						return true;
					}
					local68++;
				}
			}
		} else if (local17 > arg5 && local17 <= local21) {
			if (arg1 == local25 && (arg2 & 0x4) == 0) {
				for (local68 = arg5; local68 < local17; local68++) {
					if ((this.anIntArrayArray24[local68 - this.anInt2157][local25 - this.anInt2166 - 1] & 0x2) == 0) {
						return true;
					}
				}
			} else if (arg3 == local30 && (arg2 & 0x1) == 0) {
				for (local68 = arg5; local68 < local17; local68++) {
					if ((this.anIntArrayArray24[local68 - this.anInt2157][arg3 - this.anInt2166] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else if (arg1 <= arg3 && local30 > arg3) {
			if (local17 == arg5 && (arg2 & 0x8) == 0) {
				local162 = local25 > local30 ? local30 : local25;
				for (local68 = arg3; local68 < local162; local68++) {
					if ((this.anIntArrayArray24[local17 - this.anInt2157 - 1][local68 - this.anInt2166] & 0x8) == 0) {
						return true;
					}
				}
			} else if (arg0 == local21 && (arg2 & 0x2) == 0) {
				local162 = local30 >= local25 ? local25 : local30;
				for (local68 = arg3; local68 < local162; local68++) {
					if ((this.anIntArrayArray24[arg0 - this.anInt2157][local68 - this.anInt2166] & 0x80) == 0) {
						return true;
					}
				}
			}
		} else if (local25 > arg1 && local25 <= local30) {
			if (local17 == arg5 && (arg2 & 0x8) == 0) {
				for (local68 = arg1; local68 < local25; local68++) {
					if ((this.anIntArrayArray24[local17 - this.anInt2157 - 1][local68 - this.anInt2166] & 0x8) == 0) {
						return true;
					}
				}
			} else if (local21 == arg0 && (arg2 & 0x2) == 0) {
				for (local68 = arg1; local68 < local25; local68++) {
					if ((this.anIntArrayArray24[arg0 - this.anInt2157][local68 - this.anInt2166] & 0x80) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
