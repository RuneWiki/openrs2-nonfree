import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class4_Sub4_Sub4_Sub1 extends Class4_Sub4_Sub4 {

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!ig;II)V")
	public Class4_Sub4_Sub4_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray45 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIII)V")
	public void method2480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2810 = arg3;
		this.anInt2812 = arg0;
		this.anInt2811 = arg1 - arg0;
		this.anInt2809 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIIII)V")
	public void method2482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg5 != arg1) {
			local1 = (arg3 - arg4 << 16) / (arg5 - arg1);
		}
		@Pc(22) int local22 = 0;
		if (arg0 != arg5) {
			local22 = (arg2 - arg3 << 16) / (arg0 - arg5);
		}
		@Pc(39) int local39 = 0;
		if (arg0 != arg1) {
			local39 = (arg4 - arg2 << 16) / (arg1 - arg0);
		}
		if (arg5 >= arg1 && arg1 <= arg0) {
			if (arg0 > arg5) {
				arg2 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local39 * arg1;
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local22;
					arg5 = 0;
				}
				if (arg1 != arg5 && local39 < local1 || arg1 == arg5 && local39 > local22) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt2809 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static361.method2481(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray45);
								arg3 += local22;
								arg1 += this.anInt2809;
								arg2 += local39;
							}
						}
						Static361.method2481(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray45);
						arg2 += local39;
						arg1 += this.anInt2809;
						arg4 += local1;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt2809 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static361.method2481(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray45);
								arg2 += local39;
								arg1 += this.anInt2809;
								arg3 += local22;
							}
						}
						Static361.method2481(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray45);
						arg1 += this.anInt2809;
						arg2 += local39;
						arg4 += local1;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local1;
					arg3 -= arg1 * local39;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg2 -= arg0 * local22;
					arg0 = 0;
				}
				if (arg1 != arg0 && local39 < local1 || arg1 == arg0 && local22 > local1) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt2809 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static361.method2481(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray45);
								arg2 += local22;
								arg4 += local1;
								arg1 += this.anInt2809;
							}
						}
						Static361.method2481(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray45);
						arg3 += local39;
						arg4 += local1;
						arg1 += this.anInt2809;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt2809;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static361.method2481(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray45);
								arg1 += this.anInt2809;
								arg4 += local1;
								arg2 += local22;
							}
						}
						Static361.method2481(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray45);
						arg4 += local1;
						arg3 += local39;
						arg1 += this.anInt2809;
					}
				}
			}
		} else if (arg5 > arg0) {
			if (arg5 <= arg1) {
				arg4 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local22;
					arg2 -= arg0 * local39;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local1;
					arg5 = 0;
				}
				if (local39 <= local22) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt2809;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static361.method2481(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray45);
								arg0 += this.anInt2809;
								arg2 += local39;
								arg3 += local1;
							}
						}
						Static361.method2481(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray45);
						arg4 += local22;
						arg2 += local39;
						arg0 += this.anInt2809;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt2809;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static361.method2481(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray45);
								arg3 += local1;
								arg0 += this.anInt2809;
								arg2 += local39;
							}
						}
						Static361.method2481(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray45);
						arg2 += local39;
						arg4 += local22;
						arg0 += this.anInt2809;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local39;
					arg3 -= arg0 * local22;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local39 <= local22) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt2809 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static361.method2481(arg4 >> 16, arg0, arg3 >> 16, this.aByteArray45);
								arg0 += this.anInt2809;
								arg3 += local22;
								arg4 += local1;
							}
						}
						Static361.method2481(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray45);
						arg0 += this.anInt2809;
						arg3 += local22;
						arg2 += local39;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt2809 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static361.method2481(arg3 >> 16, arg0, arg4 >> 16, this.aByteArray45);
								arg4 += local1;
								arg0 += this.anInt2809;
								arg3 += local22;
							}
						}
						Static361.method2481(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray45);
						arg0 += this.anInt2809;
						arg2 += local39;
						arg3 += local22;
					}
				}
			}
		} else if (arg1 > arg0) {
			arg4 = arg3 <<= 0x10;
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= arg5 * local1;
				arg3 -= local22 * arg5;
				arg5 = 0;
			}
			if (arg0 < 0) {
				arg2 -= local39 * arg0;
				arg0 = 0;
			}
			if (arg0 != arg5 && local22 > local1 || arg5 == arg0 && local1 > local39) {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt2809 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static361.method2481(arg4 >> 16, arg5, arg2 >> 16, this.aByteArray45);
							arg2 += local39;
							arg5 += this.anInt2809;
							arg4 += local1;
						}
					}
					Static361.method2481(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray45);
					arg5 += this.anInt2809;
					arg4 += local1;
					arg3 += local22;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt2809 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static361.method2481(arg2 >> 16, arg5, arg4 >> 16, this.aByteArray45);
							arg5 += this.anInt2809;
							arg2 += local39;
							arg4 += local1;
						}
					}
					Static361.method2481(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray45);
					arg3 += local22;
					arg4 += local1;
					arg5 += this.anInt2809;
				}
			}
		} else {
			arg2 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local22 * arg5;
				arg2 -= local1 * arg5;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local39 * arg1;
				arg1 = 0;
			}
			if (local22 > local1) {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt2809 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static361.method2481(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray45);
							arg5 += this.anInt2809;
							arg4 += local39;
							arg3 += local22;
						}
					}
					Static361.method2481(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray45);
					arg2 += local1;
					arg3 += local22;
					arg5 += this.anInt2809;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt2809;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static361.method2481(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray45);
							arg3 += local22;
							arg4 += local39;
							arg5 += this.anInt2809;
						}
					}
					Static361.method2481(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray45);
					arg5 += this.anInt2809;
					arg3 += local22;
					arg2 += local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
	public void method2483() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray45.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
			local1++;
			this.aByteArray45[local1] = 0;
		}
		while (local1 < this.aByteArray45.length - 1) {
			local1++;
			this.aByteArray45[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
	public boolean method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray45.length;
	}
}
