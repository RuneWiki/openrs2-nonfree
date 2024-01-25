import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub1_Sub7_Sub1 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!bv;II)V")
	public Class4_Sub1_Sub7_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray17 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
	public void method1805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2411 = arg1 - arg0;
		this.anInt2408 = arg2;
		this.anInt2409 = arg0;
		this.anInt2414 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	public void method1806() {
		@Pc(7) int local7 = -1;
		@Pc(23) int local23 = this.aByteArray17.length - 8;
		while (local7 < local23) {
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
			local7++;
			this.aByteArray17[local7] = 0;
		}
		while (local7 < this.aByteArray17.length - 1) {
			local7++;
			this.aByteArray17[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)Z")
	public boolean method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray17.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIIIIII)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg2) {
			local7 = (arg3 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg2) {
			local28 = (arg0 - arg3 << 16) / (arg5 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg1 != arg5) {
			local48 = (arg4 - arg0 << 16) / (arg1 - arg5);
		}
		if (arg2 >= arg1 && arg5 >= arg1) {
			if (arg2 >= arg5) {
				arg3 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg3 -= arg1 * local48;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg1 && local7 > local48 || arg1 == arg5 && local28 > local7) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt2414;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static313.method4318(arg1, arg0 >> 16, this.aByteArray17, arg4 >> 16);
								arg4 += local7;
								arg0 += local28;
								arg1 += this.anInt2414;
							}
						}
						Static313.method4318(arg1, arg3 >> 16, this.aByteArray17, arg4 >> 16);
						arg3 += local48;
						arg1 += this.anInt2414;
						arg4 += local7;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt2414 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static313.method4318(arg1, arg4 >> 16, this.aByteArray17, arg0 >> 16);
								arg0 += local28;
								arg1 += this.anInt2414;
								arg4 += local7;
							}
						}
						Static313.method4318(arg1, arg4 >> 16, this.aByteArray17, arg3 >> 16);
						arg3 += local48;
						arg1 += this.anInt2414;
						arg4 += local7;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local48 * arg1;
					arg4 -= local7 * arg1;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg3 -= local28 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg1 || local48 >= local7) && (arg2 != arg1 || local28 >= local48)) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt2414;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static313.method4318(arg1, arg3 >> 16, this.aByteArray17, arg0 >> 16);
								arg1 += this.anInt2414;
								arg3 += local28;
								arg0 += local48;
							}
						}
						Static313.method4318(arg1, arg4 >> 16, this.aByteArray17, arg0 >> 16);
						arg1 += this.anInt2414;
						arg0 += local48;
						arg4 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt2414 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static313.method4318(arg1, arg0 >> 16, this.aByteArray17, arg3 >> 16);
								arg1 += this.anInt2414;
								arg0 += local48;
								arg3 += local28;
							}
						}
						Static313.method4318(arg1, arg0 >> 16, this.aByteArray17, arg4 >> 16);
						arg4 += local7;
						arg0 += local48;
						arg1 += this.anInt2414;
					}
				}
			}
		} else if (arg2 <= arg5) {
			if (arg1 > arg5) {
				arg4 = arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local28;
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local48;
					arg5 = 0;
				}
				if (arg5 != arg2 && local7 < local28 || arg2 == arg5 && local7 > local48) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt2414 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static313.method4318(arg2, arg4 >> 16, this.aByteArray17, arg0 >> 16);
								arg4 += local7;
								arg2 += this.anInt2414;
								arg0 += local48;
							}
						}
						Static313.method4318(arg2, arg4 >> 16, this.aByteArray17, arg3 >> 16);
						arg4 += local7;
						arg2 += this.anInt2414;
						arg3 += local28;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt2414 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static313.method4318(arg2, arg0 >> 16, this.aByteArray17, arg4 >> 16);
								arg0 += local48;
								arg2 += this.anInt2414;
								arg4 += local7;
							}
						}
						Static313.method4318(arg2, arg3 >> 16, this.aByteArray17, arg4 >> 16);
						arg3 += local28;
						arg2 += this.anInt2414;
						arg4 += local7;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg3 -= arg2 * local28;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local28 > local7) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt2414;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static313.method4318(arg2, arg4 >> 16, this.aByteArray17, arg3 >> 16);
								arg3 += local28;
								arg4 += local48;
								arg2 += this.anInt2414;
							}
						}
						Static313.method4318(arg2, arg0 >> 16, this.aByteArray17, arg3 >> 16);
						arg0 += local7;
						arg2 += this.anInt2414;
						arg3 += local28;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt2414;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static313.method4318(arg2, arg3 >> 16, this.aByteArray17, arg4 >> 16);
								arg4 += local48;
								arg2 += this.anInt2414;
								arg3 += local28;
							}
						}
						Static313.method4318(arg2, arg3 >> 16, this.aByteArray17, arg0 >> 16);
						arg0 += local7;
						arg3 += local28;
						arg2 += this.anInt2414;
					}
				}
			}
		} else if (arg1 >= arg2) {
			arg4 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local28 * arg5;
				arg0 -= arg5 * local48;
				arg5 = 0;
			}
			if (arg2 < 0) {
				arg3 -= local7 * arg2;
				arg2 = 0;
			}
			if (local48 <= local28) {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt2414;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static313.method4318(arg5, arg0 >> 16, this.aByteArray17, arg3 >> 16);
							arg0 += local48;
							arg5 += this.anInt2414;
							arg3 += local7;
						}
					}
					Static313.method4318(arg5, arg0 >> 16, this.aByteArray17, arg4 >> 16);
					arg5 += this.anInt2414;
					arg4 += local28;
					arg0 += local48;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt2414;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static313.method4318(arg5, arg3 >> 16, this.aByteArray17, arg0 >> 16);
							arg3 += local7;
							arg5 += this.anInt2414;
							arg0 += local48;
						}
					}
					Static313.method4318(arg5, arg4 >> 16, this.aByteArray17, arg0 >> 16);
					arg5 += this.anInt2414;
					arg4 += local28;
					arg0 += local48;
				}
			}
		} else {
			arg3 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local48;
				arg3 -= arg5 * local28;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local7 * arg1;
				arg1 = 0;
			}
			if (local48 <= local28) {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt2414;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static313.method4318(arg5, arg4 >> 16, this.aByteArray17, arg3 >> 16);
							arg5 += this.anInt2414;
							arg3 += local28;
							arg4 += local7;
						}
					}
					Static313.method4318(arg5, arg0 >> 16, this.aByteArray17, arg3 >> 16);
					arg5 += this.anInt2414;
					arg0 += local48;
					arg3 += local28;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt2414 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static313.method4318(arg5, arg3 >> 16, this.aByteArray17, arg4 >> 16);
							arg4 += local7;
							arg3 += local28;
							arg5 += this.anInt2414;
						}
					}
					Static313.method4318(arg5, arg3 >> 16, this.aByteArray17, arg0 >> 16);
					arg3 += local28;
					arg5 += this.anInt2414;
					arg0 += local48;
				}
			}
		}
	}
}
