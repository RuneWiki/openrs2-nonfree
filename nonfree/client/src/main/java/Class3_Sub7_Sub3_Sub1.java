import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class3_Sub7_Sub3_Sub1 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!cda", name = "K", descriptor = "I")
	public int anInt1589;

	@OriginalMember(owner = "client!cda", name = "P", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!cda", name = "T", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!cda", name = "N", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!er;II)V")
	public Class3_Sub7_Sub3_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray19 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBIIIII)V")
	public void method1439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg5) {
			local7 = (arg0 - arg4 << 16) / (arg1 - arg5);
		}
		@Pc(24) int local24 = 0;
		if (arg1 != arg3) {
			local24 = (arg2 - arg0 << 16) / (arg3 - arg1);
		}
		@Pc(44) int local44 = 0;
		if (arg3 != arg5) {
			local44 = (arg4 - arg2 << 16) / (arg5 - arg3);
		}
		if (arg1 >= arg5 && arg5 <= arg3) {
			if (arg3 <= arg1) {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local7;
					arg0 -= arg5 * local44;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg5 && local7 > local44 || arg3 == arg5 && local24 > local7) {
					arg1 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt1594;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static240.method3816(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray19);
								arg5 += this.anInt1594;
								arg2 += local24;
								arg4 += local7;
							}
						}
						Static240.method3816(arg0 >> 16, arg4 >> 16, arg5, this.aByteArray19);
						arg0 += local44;
						arg4 += local7;
						arg5 += this.anInt1594;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt1594 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static240.method3816(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray19);
								arg5 += this.anInt1594;
								arg2 += local24;
								arg4 += local7;
							}
						}
						Static240.method3816(arg4 >> 16, arg0 >> 16, arg5, this.aByteArray19);
						arg4 += local7;
						arg5 += this.anInt1594;
						arg0 += local44;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local7 * arg5;
					arg2 -= arg5 * local44;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local24 * arg1;
					arg1 = 0;
				}
				if ((arg5 == arg1 || local7 <= local44) && (arg1 != arg5 || local24 >= local44)) {
					arg3 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt1594 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static240.method3816(arg0 >> 16, arg2 >> 16, arg5, this.aByteArray19);
								arg5 += this.anInt1594;
								arg0 += local24;
								arg2 += local44;
							}
						}
						Static240.method3816(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray19);
						arg5 += this.anInt1594;
						arg4 += local7;
						arg2 += local44;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt1594;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static240.method3816(arg2 >> 16, arg0 >> 16, arg5, this.aByteArray19);
								arg2 += local44;
								arg5 += this.anInt1594;
								arg0 += local24;
							}
						}
						Static240.method3816(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray19);
						arg4 += local7;
						arg5 += this.anInt1594;
						arg2 += local44;
					}
				}
			}
		} else if (arg3 >= arg1) {
			if (arg5 <= arg3) {
				arg2 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local24;
					arg2 -= local7 * arg1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local44 * arg5;
					arg5 = 0;
				}
				if (local24 <= local7) {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt1594 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static240.method3816(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray19);
								arg1 += this.anInt1594;
								arg4 += local44;
								arg0 += local24;
							}
						}
						Static240.method3816(arg0 >> 16, arg2 >> 16, arg1, this.aByteArray19);
						arg0 += local24;
						arg2 += local7;
						arg1 += this.anInt1594;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt1594;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static240.method3816(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray19);
								arg1 += this.anInt1594;
								arg0 += local24;
								arg4 += local44;
							}
						}
						Static240.method3816(arg2 >> 16, arg0 >> 16, arg1, this.aByteArray19);
						arg0 += local24;
						arg2 += local7;
						arg1 += this.anInt1594;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local7 * arg1;
					arg0 -= arg1 * local24;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local44;
					arg3 = 0;
				}
				if ((arg1 == arg3 || local7 >= local24) && (arg1 != arg3 || local7 <= local44)) {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt1594 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static240.method3816(arg2 >> 16, arg4 >> 16, arg1, this.aByteArray19);
								arg1 += this.anInt1594;
								arg2 += local44;
								arg4 += local7;
							}
						}
						Static240.method3816(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray19);
						arg1 += this.anInt1594;
						arg4 += local7;
						arg0 += local24;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt1594;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static240.method3816(arg4 >> 16, arg2 >> 16, arg1, this.aByteArray19);
								arg4 += local7;
								arg1 += this.anInt1594;
								arg2 += local44;
							}
						}
						Static240.method3816(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray19);
						arg4 += local7;
						arg1 += this.anInt1594;
						arg0 += local24;
					}
				}
			}
		} else if (arg1 <= arg5) {
			arg4 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local44;
				arg4 -= local24 * arg3;
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg0 -= local7 * arg1;
				arg1 = 0;
			}
			if (local44 > local24) {
				arg5 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt1594;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static240.method3816(arg0 >> 16, arg2 >> 16, arg3, this.aByteArray19);
							arg0 += local7;
							arg2 += local44;
							arg3 += this.anInt1594;
						}
					}
					Static240.method3816(arg4 >> 16, arg2 >> 16, arg3, this.aByteArray19);
					arg3 += this.anInt1594;
					arg4 += local24;
					arg2 += local44;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt1594 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static240.method3816(arg2 >> 16, arg0 >> 16, arg3, this.aByteArray19);
							arg2 += local44;
							arg0 += local7;
							arg3 += this.anInt1594;
						}
					}
					Static240.method3816(arg2 >> 16, arg4 >> 16, arg3, this.aByteArray19);
					arg4 += local24;
					arg3 += this.anInt1594;
					arg2 += local44;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local44;
				arg0 -= arg3 * local24;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg4 -= arg5 * local7;
				arg5 = 0;
			}
			if (local44 > local24) {
				arg1 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt1594;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static240.method3816(arg0 >> 16, arg4 >> 16, arg3, this.aByteArray19);
							arg4 += local7;
							arg0 += local24;
							arg3 += this.anInt1594;
						}
					}
					Static240.method3816(arg0 >> 16, arg2 >> 16, arg3, this.aByteArray19);
					arg2 += local44;
					arg0 += local24;
					arg3 += this.anInt1594;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt1594 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static240.method3816(arg4 >> 16, arg0 >> 16, arg3, this.aByteArray19);
							arg4 += local7;
							arg0 += local24;
							arg3 += this.anInt1594;
						}
					}
					Static240.method3816(arg2 >> 16, arg0 >> 16, arg3, this.aByteArray19);
					arg0 += local24;
					arg2 += local44;
					arg3 += this.anInt1594;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIII)V")
	public void method1442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1589 = arg0;
		this.anInt1594 = arg3 - arg0;
		this.anInt1587 = arg1;
		this.anInt1592 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBI)Z")
	public boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray19.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	public void method1445() {
		@Pc(17) int local17 = -1;
		@Pc(23) int local23 = this.aByteArray19.length - 8;
		while (local23 > local17) {
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
			local17++;
			this.aByteArray19[local17] = 0;
		}
		while (this.aByteArray19.length - 1 > local17) {
			local17++;
			this.aByteArray19[local17] = 0;
		}
	}
}
