import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class70 {

	@OriginalMember(owner = "client!eq", name = "I", descriptor = "[Lclient!uc;")
	private static final Class240[] aClass240Array1 = new Class240[32];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public int anInt2308;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	static {
		@Pc(73) Class240[] local73 = Static353.method4804();
		for (@Pc(75) int local75 = 0; local75 < local73.length; local75++) {
			aClass240Array1[local73[local75].anInt6576] = local73[local75];
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 1) {
			if (arg1 == arg0 && arg3 == arg5) {
				return true;
			}
		} else if (arg0 <= arg1 && arg4 + arg0 - 1 >= arg1 && arg3 <= arg3 && arg3 <= arg4 + arg3 - 1) {
			return true;
		}
		@Pc(75) int local75 = arg1 - this.anInt2303;
		@Pc(80) int local80 = arg0 - this.anInt2303;
		@Pc(85) int local85 = arg3 - this.anInt2305;
		@Pc(90) int local90 = arg5 - this.anInt2305;
		if (arg4 == 1) {
			if (arg6 == 0) {
				if (arg2 == 0) {
					if (local80 == local75 - 1 && local85 == local90) {
						return true;
					}
					if (local80 == local75 && local90 == local85 + 1 && (this.anIntArrayArray17[local80][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local80 && local85 - 1 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local80 == local75 && local90 == local85 + 1) {
						return true;
					}
					if (local75 - 1 == local80 && local90 == local85 && (this.anIntArrayArray17[local80][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local80 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local75 + 1 == local80 && local85 == local90) {
						return true;
					}
					if (local75 == local80 && local85 + 1 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 == local80 && local85 - 1 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local80 == local75 && local90 == local85 - 1) {
						return true;
					}
					if (local75 - 1 == local80 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local80 == local75 + 1 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg2 == 0) {
					if (local80 == local75 - 1 && local90 == local85) {
						return true;
					}
					if (local75 == local80 && local90 == local85 + 1) {
						return true;
					}
					if (local75 + 1 == local80 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local80 && local90 == local85 - 1 && (this.anIntArrayArray17[local80][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 - 1 == local80 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 == local80 && local90 == local85 + 1) {
						return true;
					}
					if (local80 == local75 + 1 && local85 == local90) {
						return true;
					}
					if (local75 == local80 && local90 == local85 - 1 && (this.anIntArrayArray17[local80][local90] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local75 - 1 == local80 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2C0108) == 0) {
						return true;
					}
					if (local80 == local75 && local90 == local85 + 1 && (this.anIntArrayArray17[local80][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local80 == local75 + 1 && local90 == local85) {
						return true;
					}
					if (local75 == local80 && local85 - 1 == local90) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local80 == local75 - 1 && local90 == local85) {
						return true;
					}
					if (local75 == local80 && local90 == local85 + 1 && (this.anIntArrayArray17[local80][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local80 && local90 == local85 && (this.anIntArrayArray17[local80][local90] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 == local80 && local90 == local85 - 1) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local80 == local75 && local90 == local85 + 1 && (this.anIntArrayArray17[local80][local90] & 0x20) == 0) {
					return true;
				}
				if (local75 == local80 && local85 - 1 == local90 && (this.anIntArrayArray17[local80][local90] & 0x2) == 0) {
					return true;
				}
				if (local80 == local75 - 1 && local85 == local90 && (this.anIntArrayArray17[local80][local90] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local80 && local90 == local85 && (this.anIntArrayArray17[local80][local90] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(807) int local807 = local80 + arg4 - 1;
			@Pc(813) int local813 = local90 + arg4 - 1;
			if (arg6 == 0) {
				if (arg2 == 0) {
					if (local80 == local75 - arg4 && local85 >= local90 && local85 <= local813) {
						return true;
					}
					if (local80 <= local75 && local75 <= local807 && local85 + 1 == local90 && (this.anIntArrayArray17[local75][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local80 <= local75 && local75 <= local807 && local85 - arg4 == local90 && (this.anIntArrayArray17[local75][local813] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local75 >= local80 && local75 <= local807 && local90 == local85 + 1) {
						return true;
					}
					if (local75 - arg4 == local80 && local85 >= local90 && local813 >= local85 && (this.anIntArrayArray17[local807][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local80 && local90 <= local85 && local813 >= local85 && (this.anIntArrayArray17[local80][local85] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local80 == local75 + 1 && local85 >= local90 && local85 <= local813) {
						return true;
					}
					if (local80 <= local75 && local807 >= local75 && local85 + 1 == local90 && (this.anIntArrayArray17[local75][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 >= local80 && local75 <= local807 && local85 - arg4 == local90 && (this.anIntArrayArray17[local75][local813] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local80 <= local75 && local75 <= local807 && local85 - arg4 == local90) {
						return true;
					}
					if (local75 - arg4 == local80 && local90 <= local85 && local85 <= local813 && (this.anIntArrayArray17[local807][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 + 1 == local80 && local85 >= local90 && local813 >= local85 && (this.anIntArrayArray17[local80][local85] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 2) {
				if (arg2 == 0) {
					if (local80 == local75 - arg4 && local85 >= local90 && local813 >= local85) {
						return true;
					}
					if (local75 >= local80 && local75 <= local807 && local85 + 1 == local90) {
						return true;
					}
					if (local80 == local75 + 1 && local85 >= local90 && local85 <= local813 && (this.anIntArrayArray17[local80][local85] & 0x2C0180) == 0) {
						return true;
					}
					if (local80 <= local75 && local75 <= local807 && local90 == local85 - arg4 && (this.anIntArrayArray17[local75][local813] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local80 == local75 - arg4 && local90 <= local85 && local85 <= local813 && (this.anIntArrayArray17[local807][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local80 <= local75 && local807 >= local75 && local85 + 1 == local90) {
						return true;
					}
					if (local80 == local75 + 1 && local85 >= local90 && local85 <= local813) {
						return true;
					}
					if (local80 <= local75 && local75 <= local807 && local90 == local85 - arg4 && (this.anIntArrayArray17[local75][local813] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local75 - arg4 == local80 && local90 <= local85 && local85 <= local813 && (this.anIntArrayArray17[local807][local85] & 0x2C0108) == 0) {
						return true;
					}
					if (local75 >= local80 && local807 >= local75 && local90 == local85 + 1 && (this.anIntArrayArray17[local75][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local75 + 1 == local80 && local85 >= local90 && local85 <= local813) {
						return true;
					}
					if (local80 <= local75 && local75 <= local807 && local85 - arg4 == local90) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local80 == local75 - arg4 && local85 >= local90 && local85 <= local813) {
						return true;
					}
					if (local75 >= local80 && local75 <= local807 && local90 == local85 + 1 && (this.anIntArrayArray17[local75][local90] & 0x2C0120) == 0) {
						return true;
					}
					if (local80 == local75 + 1 && local90 <= local85 && local813 >= local85 && (this.anIntArrayArray17[local80][local85] & 0x2C0180) == 0) {
						return true;
					}
					if (local75 >= local80 && local807 >= local75 && local85 - arg4 == local90) {
						return true;
					}
				}
			}
			if (arg6 == 9) {
				if (local75 >= local80 && local75 <= local807 && local85 + 1 == local90 && (this.anIntArrayArray17[local75][local90] & 0x2C0120) == 0) {
					return true;
				}
				if (local75 >= local80 && local75 <= local807 && local90 == local85 - arg4 && (this.anIntArrayArray17[local75][local813] & 0x2C0102) == 0) {
					return true;
				}
				if (local80 == local75 - arg4 && local90 <= local85 && local813 >= local85 && (this.anIntArrayArray17[local807][local85] & 0x2C0108) == 0) {
					return true;
				}
				if (local75 + 1 == local80 && local90 <= local85 && local85 <= local813 && (this.anIntArrayArray17[local80][local85] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg0 == arg3 && arg5 == arg4) {
				return true;
			}
		} else if (arg0 >= arg3 && arg0 <= arg3 + arg2 - 1 && arg4 >= arg4 && arg4 <= arg4 + arg2 - 1) {
			return true;
		}
		@Pc(65) int local65 = arg3 - this.anInt2303;
		@Pc(70) int local70 = arg5 - this.anInt2305;
		@Pc(75) int local75 = arg0 - this.anInt2303;
		@Pc(92) int local92 = arg4 - this.anInt2305;
		if (arg2 == 1) {
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local65 == local75 + 1 && local70 == local92 && (this.anIntArrayArray17[local65][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 == local75 && local92 - 1 == local70 && (this.anIntArrayArray17[local65][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local65 == local75 - 1 && local92 == local70 && (this.anIntArrayArray17[local65][local70] & 0x8) == 0) {
						return true;
					}
					if (local65 == local75 && local70 == local92 - 1 && (this.anIntArrayArray17[local65][local70] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local75 - 1 == local65 && local70 == local92 && (this.anIntArrayArray17[local65][local70] & 0x8) == 0) {
						return true;
					}
					if (local75 == local65 && local70 == local92 + 1 && (this.anIntArrayArray17[local65][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local75 + 1 == local65 && local92 == local70 && (this.anIntArrayArray17[local65][local70] & 0x80) == 0) {
						return true;
					}
					if (local65 == local75 && local70 == local92 + 1 && (this.anIntArrayArray17[local65][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local65 == local75 && local92 + 1 == local70 && (this.anIntArrayArray17[local65][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 == local65 && local70 == local92 - 1 && (this.anIntArrayArray17[local65][local70] & 0x2) == 0) {
					return true;
				}
				if (local75 - 1 == local65 && local92 == local70 && (this.anIntArrayArray17[local65][local70] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local65 && local70 == local92 && (this.anIntArrayArray17[local65][local70] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(426) int local426 = local65 + arg2 - 1;
			@Pc(432) int local432 = arg2 + local70 - 1;
			if (arg6 == 6 || arg6 == 7) {
				if (arg6 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local65 == local75 + 1 && local70 <= local92 && local432 >= local92 && (this.anIntArrayArray17[local65][local92] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local426 && local92 - arg2 == local70 && (this.anIntArrayArray17[local75][local432] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local75 - arg2 == local65 && local70 <= local92 && local432 >= local92 && (this.anIntArrayArray17[local426][local92] & 0x8) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local426 && local70 == local92 - arg2 && (this.anIntArrayArray17[local75][local432] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local65 == local75 - arg2 && local70 <= local92 && local92 <= local432 && (this.anIntArrayArray17[local426][local92] & 0x8) == 0) {
						return true;
					}
					if (local65 <= local75 && local75 <= local426 && local92 + 1 == local70 && (this.anIntArrayArray17[local75][local70] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local75 + 1 == local65 && local70 <= local92 && local92 <= local432 && (this.anIntArrayArray17[local65][local92] & 0x80) == 0) {
						return true;
					}
					if (local75 >= local65 && local75 <= local426 && local92 + 1 == local70 && (this.anIntArrayArray17[local75][local70] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg6 == 8) {
				if (local75 >= local65 && local426 >= local75 && local92 + 1 == local70 && (this.anIntArrayArray17[local75][local70] & 0x20) == 0) {
					return true;
				}
				if (local75 >= local65 && local426 >= local75 && local92 - arg2 == local70 && (this.anIntArrayArray17[local75][local432] & 0x2) == 0) {
					return true;
				}
				if (local65 == local75 - arg2 && local92 >= local70 && local92 <= local432 && (this.anIntArrayArray17[local426][local92] & 0x8) == 0) {
					return true;
				}
				if (local75 + 1 == local65 && local70 <= local92 && local432 >= local92 && (this.anIntArrayArray17[local65][local92] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	public void method1797() {
		for (@Pc(19) int local19 = 0; local19 < this.anInt2308; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2309; local23++) {
				if (local19 == 0 || local23 == 0 || this.anInt2308 - 5 <= local19 || local23 >= this.anInt2309 - 5) {
					this.anIntArrayArray17[local19][local23] = -1;
				} else {
					this.anIntArrayArray17[local19][local23] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZIIIIIZ)V")
	public void method1798(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg2 - this.anInt2305;
		@Pc(29) int local29 = arg1 - this.anInt2303;
		for (@Pc(35) int local35 = local29; local35 < local29 + arg4; local35++) {
			if (local35 >= 0 && local35 < this.anInt2308) {
				for (@Pc(52) int local52 = local24; local52 < arg3 + local24; local52++) {
					if (local52 >= 0 && this.anInt2309 > local52) {
						this.method1807(local52, local35, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIIZI)V")
	public void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt2303;
		@Pc(13) int local13 = arg3 - this.anInt2305;
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1807(local13, local4, 128);
				this.method1807(local13, local4 - 1, 8);
			}
			if (arg2 == 1) {
				this.method1807(local13, local4, 2);
				this.method1807(local13 + 1, local4, 32);
			}
			if (arg2 == 2) {
				this.method1807(local13, local4, 8);
				this.method1807(local13, local4 + 1, 128);
			}
			if (arg2 == 3) {
				this.method1807(local13, local4, 32);
				this.method1807(local13 - 1, local4, 2);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1807(local13, local4, 1);
				this.method1807(local13 + 1, local4 + -1, 16);
			}
			if (arg2 == 1) {
				this.method1807(local13, local4, 4);
				this.method1807(local13 + 1, local4 + 1, 64);
			}
			if (arg2 == 2) {
				this.method1807(local13, local4, 16);
				this.method1807(local13 - 1, local4 - -1, 1);
			}
			if (arg2 == 3) {
				this.method1807(local13, local4, 64);
				this.method1807(local13 - 1, local4 + -1, 4);
			}
		}
		if (arg0 == 2) {
			if (arg2 == 0) {
				this.method1807(local13, local4, 130);
				this.method1807(local13, local4 - 1, 8);
				this.method1807(local13 + 1, local4, 32);
			}
			if (arg2 == 1) {
				this.method1807(local13, local4, 10);
				this.method1807(local13 + 1, local4, 32);
				this.method1807(local13, local4 + 1, 128);
			}
			if (arg2 == 2) {
				this.method1807(local13, local4, 40);
				this.method1807(local13, local4 + 1, 128);
				this.method1807(local13 - 1, local4, 2);
			}
			if (arg2 == 3) {
				this.method1807(local13, local4, 160);
				this.method1807(local13 - 1, local4, 2);
				this.method1807(local13, local4 - 1, 8);
			}
		}
		if (arg1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					this.method1807(local13, local4, 65536);
					this.method1807(local13, local4 - 1, 4096);
				}
				if (arg2 == 1) {
					this.method1807(local13, local4, 1024);
					this.method1807(local13 + 1, local4, 16384);
				}
				if (arg2 == 2) {
					this.method1807(local13, local4, 4096);
					this.method1807(local13, local4 + 1, 65536);
				}
				if (arg2 == 3) {
					this.method1807(local13, local4, 16384);
					this.method1807(local13 - 1, local4, 1024);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					this.method1807(local13, local4, 512);
					this.method1807(local13 + 1, local4 - 1, 8192);
				}
				if (arg2 == 1) {
					this.method1807(local13, local4, 2048);
					this.method1807(local13 + 1, local4 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method1807(local13, local4, 8192);
					this.method1807(local13 - 1, local4 + 1, 512);
				}
				if (arg2 == 3) {
					this.method1807(local13, local4, 32768);
					this.method1807(local13 - 1, local4 + -1, 2048);
				}
			}
			if (arg0 == 2) {
				if (arg2 == 0) {
					this.method1807(local13, local4, 66560);
					this.method1807(local13, local4 - 1, 4096);
					this.method1807(local13 + 1, local4, 16384);
				}
				if (arg2 == 1) {
					this.method1807(local13, local4, 5120);
					this.method1807(local13 + 1, local4, 16384);
					this.method1807(local13, local4 + 1, 65536);
				}
				if (arg2 == 2) {
					this.method1807(local13, local4, 20480);
					this.method1807(local13, local4 + 1, 65536);
					this.method1807(local13 - 1, local4, 1024);
				}
				if (arg2 == 3) {
					this.method1807(local13, local4, 81920);
					this.method1807(local13 - 1, local4, 1024);
					this.method1807(local13, local4 - 1, 4096);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 == 0) {
				this.method1807(local13, local4, 536870912);
				this.method1807(local13, local4 - 1, 33554432);
			}
			if (arg2 == 1) {
				this.method1807(local13, local4, 8388608);
				this.method1807(local13 + 1, local4, 134217728);
			}
			if (arg2 == 2) {
				this.method1807(local13, local4, 33554432);
				this.method1807(local13, local4 + 1, 536870912);
			}
			if (arg2 == 3) {
				this.method1807(local13, local4, 134217728);
				this.method1807(local13 - 1, local4, 8388608);
			}
		}
		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				this.method1807(local13, local4, 4194304);
				this.method1807(local13 + 1, local4 + -1, 67108864);
			}
			if (arg2 == 1) {
				this.method1807(local13, local4, 16777216);
				this.method1807(local13 + 1, local4 - -1, 268435456);
			}
			if (arg2 == 2) {
				this.method1807(local13, local4, 67108864);
				this.method1807(local13 - 1, local4 - -1, 4194304);
			}
			if (arg2 == 3) {
				this.method1807(local13, local4, 268435456);
				this.method1807(local13 - 1, local4 + -1, 16777216);
			}
		}
		if (arg0 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1807(local13, local4, 545259520);
			this.method1807(local13, local4 - 1, 33554432);
			this.method1807(local13 + 1, local4, 134217728);
		}
		if (arg2 == 1) {
			this.method1807(local13, local4, 41943040);
			this.method1807(local13 + 1, local4, 134217728);
			this.method1807(local13, local4 + 1, 536870912);
		}
		if (arg2 == 2) {
			this.method1807(local13, local4, 167772160);
			this.method1807(local13, local4 + 1, 536870912);
			this.method1807(local13 - 1, local4, 8388608);
		}
		if (arg2 == 3) {
			this.method1807(local13, local4, 671088640);
			this.method1807(local13 - 1, local4, 8388608);
			this.method1807(local13, local4 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public void method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt2303;
		@Pc(9) int local9 = arg1 - this.anInt2305;
		this.anIntArrayArray17[local4][local9] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - this.anInt2305;
		@Pc(17) int local17 = arg1 - this.anInt2303;
		this.anIntArrayArray17[local17][local12] |= 0x40000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIIIZ)V")
	public void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg0 - this.anInt2303;
		@Pc(13) int local13 = arg4 - this.anInt2305;
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1809(local8, local13, 128);
				this.method1809(local8 - 1, local13, 8);
			}
			if (arg2 == 1) {
				this.method1809(local8, local13, 2);
				this.method1809(local8, local13 + 1, 32);
			}
			if (arg2 == 2) {
				this.method1809(local8, local13, 8);
				this.method1809(local8 + 1, local13, 128);
			}
			if (arg2 == 3) {
				this.method1809(local8, local13, 32);
				this.method1809(local8, local13 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1809(local8, local13, 1);
				this.method1809(local8 - 1, local13 + 1, 16);
			}
			if (arg2 == 1) {
				this.method1809(local8, local13, 4);
				this.method1809(local8 + 1, local13 + 1, 64);
			}
			if (arg2 == 2) {
				this.method1809(local8, local13, 16);
				this.method1809(local8 + 1, local13 + -1, 1);
			}
			if (arg2 == 3) {
				this.method1809(local8, local13, 64);
				this.method1809(local8 - 1, local13 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg2 == 0) {
				this.method1809(local8, local13, 130);
				this.method1809(local8 - 1, local13, 8);
				this.method1809(local8, local13 + 1, 32);
			}
			if (arg2 == 1) {
				this.method1809(local8, local13, 10);
				this.method1809(local8, local13 + 1, 32);
				this.method1809(local8 + 1, local13, 128);
			}
			if (arg2 == 2) {
				this.method1809(local8, local13, 40);
				this.method1809(local8 + 1, local13, 128);
				this.method1809(local8, local13 - 1, 2);
			}
			if (arg2 == 3) {
				this.method1809(local8, local13, 160);
				this.method1809(local8, local13 - 1, 2);
				this.method1809(local8 - 1, local13, 8);
			}
		}
		if (arg1) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					this.method1809(local8, local13, 65536);
					this.method1809(local8 - 1, local13, 4096);
				}
				if (arg2 == 1) {
					this.method1809(local8, local13, 1024);
					this.method1809(local8, local13 + 1, 16384);
				}
				if (arg2 == 2) {
					this.method1809(local8, local13, 4096);
					this.method1809(local8 + 1, local13, 65536);
				}
				if (arg2 == 3) {
					this.method1809(local8, local13, 16384);
					this.method1809(local8, local13 - 1, 1024);
				}
			}
			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					this.method1809(local8, local13, 512);
					this.method1809(local8 - 1, local13 + 1, 8192);
				}
				if (arg2 == 1) {
					this.method1809(local8, local13, 2048);
					this.method1809(local8 + 1, local13 + 1, 32768);
				}
				if (arg2 == 2) {
					this.method1809(local8, local13, 8192);
					this.method1809(local8 + 1, local13 + -1, 512);
				}
				if (arg2 == 3) {
					this.method1809(local8, local13, 32768);
					this.method1809(local8 - 1, local13 - 1, 2048);
				}
			}
			if (arg3 == 2) {
				if (arg2 == 0) {
					this.method1809(local8, local13, 66560);
					this.method1809(local8 - 1, local13, 4096);
					this.method1809(local8, local13 + 1, 16384);
				}
				if (arg2 == 1) {
					this.method1809(local8, local13, 5120);
					this.method1809(local8, local13 + 1, 16384);
					this.method1809(local8 + 1, local13, 65536);
				}
				if (arg2 == 2) {
					this.method1809(local8, local13, 20480);
					this.method1809(local8 + 1, local13, 65536);
					this.method1809(local8, local13 - 1, 1024);
				}
				if (arg2 == 3) {
					this.method1809(local8, local13, 81920);
					this.method1809(local8, local13 - 1, 1024);
					this.method1809(local8 - 1, local13, 4096);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 == 0) {
				this.method1809(local8, local13, 536870912);
				this.method1809(local8 - 1, local13, 33554432);
			}
			if (arg2 == 1) {
				this.method1809(local8, local13, 8388608);
				this.method1809(local8, local13 + 1, 134217728);
			}
			if (arg2 == 2) {
				this.method1809(local8, local13, 33554432);
				this.method1809(local8 + 1, local13, 536870912);
			}
			if (arg2 == 3) {
				this.method1809(local8, local13, 134217728);
				this.method1809(local8, local13 - 1, 8388608);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				this.method1809(local8, local13, 4194304);
				this.method1809(local8 - 1, local13 + 1, 67108864);
			}
			if (arg2 == 1) {
				this.method1809(local8, local13, 16777216);
				this.method1809(local8 + 1, local13 + 1, 268435456);
			}
			if (arg2 == 2) {
				this.method1809(local8, local13, 67108864);
				this.method1809(local8 + 1, local13 + -1, 4194304);
			}
			if (arg2 == 3) {
				this.method1809(local8, local13, 268435456);
				this.method1809(local8 - 1, local13 - 1, 16777216);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg2 == 0) {
			this.method1809(local8, local13, 545259520);
			this.method1809(local8 - 1, local13, 33554432);
			this.method1809(local8, local13 + 1, 134217728);
		}
		if (arg2 == 1) {
			this.method1809(local8, local13, 41943040);
			this.method1809(local8, local13 + 1, 134217728);
			this.method1809(local8 + 1, local13, 536870912);
		}
		if (arg2 == 2) {
			this.method1809(local8, local13, 167772160);
			this.method1809(local8 + 1, local13, 536870912);
			this.method1809(local8, local13 - 1, 8388608);
		}
		if (arg2 == 3) {
			this.method1809(local8, local13, 671088640);
			this.method1809(local8, local13 - 1, 8388608);
			this.method1809(local8 - 1, local13, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIZIIIII)Z")
	public boolean method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static170.method2747(arg5, arg7, arg6, arg4, arg1, arg2, arg3, arg5) ? true : this.method1805(arg7, arg4, arg1, arg5, arg6, arg0, arg5, arg2, arg3);
		}
		@Pc(50) int local50 = arg3 + arg7 - 1;
		@Pc(56) int local56 = arg1 + arg6 - 1;
		if (arg2 >= arg3 && arg2 <= local50 && arg1 <= arg4 && arg4 <= local56) {
			return true;
		} else if (arg3 - 1 == arg2 && arg4 >= arg1 && local56 >= arg4 && (this.anIntArrayArray17[arg2 - this.anInt2303][arg4 - this.anInt2305] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (local50 + 1 == arg2 && arg4 >= arg1 && arg4 <= local56 && (this.anIntArrayArray17[arg2 - this.anInt2303][arg4 - this.anInt2305] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg1 - 1 && arg2 >= arg3 && local50 >= arg2 && (this.anIntArrayArray17[arg2 - this.anInt2303][arg4 - this.anInt2305] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local56 + 1 == arg4 && arg2 >= arg3 && arg2 <= local50 && (this.anIntArrayArray17[arg2 - this.anInt2303][arg4 - this.anInt2305] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V")
	public void method1804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2303;
		@Pc(17) int local17 = arg0 - this.anInt2305;
		this.anIntArrayArray17[local4][local17] |= 0x200000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIZIII)Z")
	public boolean method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) int local14 = arg3 + arg7;
		@Pc(18) int local18 = arg6 + arg1;
		@Pc(22) int local22 = arg0 + arg8;
		@Pc(26) int local26 = arg2 + arg4;
		@Pc(43) int local43;
		@Pc(54) int local54;
		if (local22 == arg7 && (arg5 & 0x2) == 0) {
			local43 = arg1 > arg2 ? arg1 : arg2;
			local54 = local26 <= local18 ? local26 : local18;
			while (local54 > local43) {
				if ((this.anIntArrayArray17[local22 - this.anInt2303 - 1][local43 - this.anInt2305] & 0x8) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local14 == arg8 && (arg5 & 0x8) == 0) {
			local43 = arg1 <= arg2 ? arg2 : arg1;
			local54 = local18 < local26 ? local18 : local26;
			while (local54 > local43) {
				if ((this.anIntArrayArray17[arg8 - this.anInt2303][local43 - this.anInt2305] & 0x80) == 0) {
					return true;
				}
				local43++;
			}
		} else if (local26 == arg1 && (arg5 & 0x1) == 0) {
			local43 = arg8 < arg7 ? arg7 : arg8;
			local54 = local14 < local22 ? local14 : local22;
			while (local43 < local54) {
				if ((this.anIntArrayArray17[local43 - this.anInt2303][local26 - this.anInt2305 - 1] & 0x2) == 0) {
					return true;
				}
				local43++;
			}
		} else if (arg2 == local18 && (arg5 & 0x4) == 0) {
			local43 = arg7 > arg8 ? arg7 : arg8;
			local54 = local22 > local14 ? local14 : local22;
			while (local43 < local54) {
				if ((this.anIntArrayArray17[local43 - this.anInt2303][arg2 - this.anInt2305] & 0x20) == 0) {
					return true;
				}
				local43++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(III)V")
	public void method1806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt2305;
		@Pc(13) int local13 = arg0 - this.anInt2303;
		this.anIntArrayArray17[local13][local4] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V")
	private void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray17[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V")
	private void method1809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray17[arg0][arg1] &= ~arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIIIIZ)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg2 - this.anInt2303;
		@Pc(23) int local23 = arg5 - this.anInt2305;
		@Pc(40) int local40;
		if (arg4 == 1 || arg4 == 3) {
			local40 = arg3;
			arg3 = arg0;
			arg0 = local40;
		}
		if (arg6) {
			local7 |= 0x40000000;
		}
		for (local40 = local18; local40 < local18 + arg3; local40++) {
			if (local40 >= 0 && this.anInt2308 > local40) {
				for (@Pc(65) int local65 = local23; local65 < local23 + arg0; local65++) {
					if (local65 >= 0 && this.anInt2309 > local65) {
						this.method1809(local40, local65, local7);
					}
				}
			}
		}
	}
}
