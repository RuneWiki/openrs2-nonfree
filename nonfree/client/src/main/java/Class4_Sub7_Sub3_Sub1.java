import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class4_Sub7_Sub3_Sub1 extends Class4_Sub7_Sub3 {

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	public int anInt2319;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ej;II)V")
	public Class4_Sub7_Sub3_Sub1(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray29 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	public void method2089() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray29.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
			local15++;
			this.aByteArray29[local15] = 0;
		}
		while (local15 < this.aByteArray29.length - 1) {
			local15++;
			this.aByteArray29[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIBI)V")
	public void method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg3) {
			local7 = (arg4 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg3 != arg5) {
			local24 = (arg2 - arg4 << 16) / (arg5 - arg3);
		}
		@Pc(48) int local48 = 0;
		if (arg0 != arg5) {
			local48 = (arg1 - arg2 << 16) / (arg0 - arg5);
		}
		if (arg0 <= arg3 && arg0 <= arg5) {
			if (arg5 > arg3) {
				arg2 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local48;
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg4 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg0 != arg3 && local7 > local48 || arg0 == arg3 && local48 > local24) {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt2323;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static481.method6703(arg2 >> 16, this.aByteArray29, arg4 >> 16, arg0);
								arg0 += this.anInt2323;
								arg2 += local48;
								arg4 += local24;
							}
						}
						Static481.method6703(arg2 >> 16, this.aByteArray29, arg1 >> 16, arg0);
						arg1 += local7;
						arg0 += this.anInt2323;
						arg2 += local48;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt2323;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static481.method6703(arg4 >> 16, this.aByteArray29, arg2 >> 16, arg0);
								arg0 += this.anInt2323;
								arg2 += local48;
								arg4 += local24;
							}
						}
						Static481.method6703(arg1 >> 16, this.aByteArray29, arg2 >> 16, arg0);
						arg1 += local7;
						arg2 += local48;
						arg0 += this.anInt2323;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local48 * arg0;
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local24 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg0 || local48 >= local7) && (arg5 != arg0 || local7 >= local24)) {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt2323;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static481.method6703(arg1 >> 16, this.aByteArray29, arg2 >> 16, arg0);
								arg0 += this.anInt2323;
								arg1 += local7;
								arg2 += local24;
							}
						}
						Static481.method6703(arg1 >> 16, this.aByteArray29, arg4 >> 16, arg0);
						arg0 += this.anInt2323;
						arg4 += local48;
						arg1 += local7;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt2323;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static481.method6703(arg2 >> 16, this.aByteArray29, arg1 >> 16, arg0);
								arg0 += this.anInt2323;
								arg1 += local7;
								arg2 += local24;
							}
						}
						Static481.method6703(arg4 >> 16, this.aByteArray29, arg1 >> 16, arg0);
						arg1 += local7;
						arg4 += local48;
						arg0 += this.anInt2323;
					}
				}
			}
		} else if (arg3 > arg5) {
			if (arg3 > arg0) {
				arg4 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local48;
					arg4 -= arg5 * local24;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (local24 >= local48) {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2323;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static481.method6703(arg1 >> 16, this.aByteArray29, arg4 >> 16, arg5);
								arg1 += local7;
								arg4 += local24;
								arg5 += this.anInt2323;
							}
						}
						Static481.method6703(arg2 >> 16, this.aByteArray29, arg4 >> 16, arg5);
						arg2 += local48;
						arg5 += this.anInt2323;
						arg4 += local24;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2323;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static481.method6703(arg4 >> 16, this.aByteArray29, arg1 >> 16, arg5);
								arg1 += local7;
								arg5 += this.anInt2323;
								arg4 += local24;
							}
						}
						Static481.method6703(arg4 >> 16, this.aByteArray29, arg2 >> 16, arg5);
						arg5 += this.anInt2323;
						arg4 += local24;
						arg2 += local48;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local48 * arg5;
					arg1 -= local24 * arg5;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg4 -= local7 * arg3;
					arg3 = 0;
				}
				if (local24 < local48) {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2323 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static481.method6703(arg4 >> 16, this.aByteArray29, arg2 >> 16, arg5);
								arg2 += local48;
								arg5 += this.anInt2323;
								arg4 += local7;
							}
						}
						Static481.method6703(arg1 >> 16, this.aByteArray29, arg2 >> 16, arg5);
						arg2 += local48;
						arg1 += local24;
						arg5 += this.anInt2323;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2323 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static481.method6703(arg2 >> 16, this.aByteArray29, arg4 >> 16, arg5);
								arg4 += local7;
								arg5 += this.anInt2323;
								arg2 += local48;
							}
						}
						Static481.method6703(arg2 >> 16, this.aByteArray29, arg1 >> 16, arg5);
						arg2 += local48;
						arg5 += this.anInt2323;
						arg1 += local24;
					}
				}
			}
		} else if (arg0 <= arg5) {
			arg2 = arg4 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local7;
				arg4 -= arg3 * local24;
				arg3 = 0;
			}
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= local48 * arg0;
				arg0 = 0;
			}
			if (local24 > local7) {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt2323 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static481.method6703(arg1 >> 16, this.aByteArray29, arg4 >> 16, arg3);
							arg1 += local48;
							arg4 += local24;
							arg3 += this.anInt2323;
						}
					}
					Static481.method6703(arg2 >> 16, this.aByteArray29, arg4 >> 16, arg3);
					arg2 += local7;
					arg3 += this.anInt2323;
					arg4 += local24;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt2323 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static481.method6703(arg4 >> 16, this.aByteArray29, arg1 >> 16, arg3);
							arg1 += local48;
							arg3 += this.anInt2323;
							arg4 += local24;
						}
					}
					Static481.method6703(arg4 >> 16, this.aByteArray29, arg2 >> 16, arg3);
					arg4 += local24;
					arg2 += local7;
					arg3 += this.anInt2323;
				}
			}
		} else {
			arg1 = arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local24 * arg3;
				arg1 -= arg3 * local7;
				arg3 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local48 * arg5;
				arg5 = 0;
			}
			if (arg5 != arg3 && local24 > local7 || arg3 == arg5 && local7 > local48) {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt2323;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static481.method6703(arg1 >> 16, this.aByteArray29, arg2 >> 16, arg3);
							arg1 += local7;
							arg3 += this.anInt2323;
							arg2 += local48;
						}
					}
					Static481.method6703(arg1 >> 16, this.aByteArray29, arg4 >> 16, arg3);
					arg3 += this.anInt2323;
					arg1 += local7;
					arg4 += local24;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt2323;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static481.method6703(arg2 >> 16, this.aByteArray29, arg1 >> 16, arg3);
							arg1 += local7;
							arg3 += this.anInt2323;
							arg2 += local48;
						}
					}
					Static481.method6703(arg4 >> 16, this.aByteArray29, arg1 >> 16, arg3);
					arg4 += local24;
					arg1 += local7;
					arg3 += this.anInt2323;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public boolean method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray29.length;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
	public void method2095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2322 = arg2;
		this.anInt2323 = arg0 - arg3;
		this.anInt2319 = arg3;
		this.anInt2327 = arg1 - arg2;
	}
}
