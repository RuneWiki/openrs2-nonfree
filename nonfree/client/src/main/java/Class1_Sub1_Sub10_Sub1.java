import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class1_Sub1_Sub10_Sub1 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
	public int anInt4392;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	public int anInt4397;

	@OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
	public int anInt4399;

	@OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
	public int anInt4402;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class1_Sub1_Sub10_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray52 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)Z")
	public boolean method3401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray52.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)V")
	public void method3403() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray52.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
		}
		while (this.aByteArray52.length - 1 > local7) {
			local7++;
			this.aByteArray52[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBIII)V")
	public void method3404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4392 = arg2 - arg3;
		this.anInt4399 = arg1 - arg0;
		this.anInt4397 = arg3;
		this.anInt4402 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)V")
	public void method3405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg4) {
			local7 = (arg0 - arg2 << 16) / (arg4 - arg5);
		}
		@Pc(23) int local23 = 0;
		if (arg4 != arg3) {
			local23 = (arg1 - arg0 << 16) / (arg3 - arg4);
		}
		@Pc(44) int local44 = 0;
		if (arg3 != arg5) {
			local44 = (arg2 - arg1 << 16) / (arg5 - arg3);
		}
		if (arg4 >= arg5 && arg5 <= arg3) {
			if (arg4 >= arg3) {
				arg0 = arg2 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local44;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg1 -= local23 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg5 && local7 > local44 || arg5 == arg3 && local7 < local23) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt4392 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static99.method1703(arg1 >> 16, arg2 >> 16, arg5, this.aByteArray52);
								arg2 += local7;
								arg5 += this.anInt4392;
								arg1 += local23;
							}
						}
						Static99.method1703(arg0 >> 16, arg2 >> 16, arg5, this.aByteArray52);
						arg5 += this.anInt4392;
						arg0 += local44;
						arg2 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt4392 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static99.method1703(arg2 >> 16, arg1 >> 16, arg5, this.aByteArray52);
								arg2 += local7;
								arg5 += this.anInt4392;
								arg1 += local23;
							}
						}
						Static99.method1703(arg2 >> 16, arg0 >> 16, arg5, this.aByteArray52);
						arg5 += this.anInt4392;
						arg0 += local44;
						arg2 += local7;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local44 * arg5;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg0 -= arg4 * local23;
					arg4 = 0;
				}
				if ((arg4 == arg5 || local44 >= local7) && (arg5 != arg4 || local44 <= local23)) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt4392 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static99.method1703(arg0 >> 16, arg1 >> 16, arg5, this.aByteArray52);
								arg0 += local23;
								arg1 += local44;
								arg5 += this.anInt4392;
							}
						}
						Static99.method1703(arg2 >> 16, arg1 >> 16, arg5, this.aByteArray52);
						arg1 += local44;
						arg2 += local7;
						arg5 += this.anInt4392;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt4392 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static99.method1703(arg1 >> 16, arg0 >> 16, arg5, this.aByteArray52);
								arg0 += local23;
								arg1 += local44;
								arg5 += this.anInt4392;
							}
						}
						Static99.method1703(arg1 >> 16, arg2 >> 16, arg5, this.aByteArray52);
						arg2 += local7;
						arg5 += this.anInt4392;
						arg1 += local44;
					}
				}
			}
		} else if (arg3 < arg4) {
			if (arg4 > arg5) {
				arg0 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local44;
					arg0 -= arg3 * local23;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				if (local44 <= local23) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt4392;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static99.method1703(arg2 >> 16, arg0 >> 16, arg3, this.aByteArray52);
								arg3 += this.anInt4392;
								arg0 += local23;
								arg2 += local7;
							}
						}
						Static99.method1703(arg1 >> 16, arg0 >> 16, arg3, this.aByteArray52);
						arg3 += this.anInt4392;
						arg0 += local23;
						arg1 += local44;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt4392 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static99.method1703(arg0 >> 16, arg2 >> 16, arg3, this.aByteArray52);
								arg2 += local7;
								arg3 += this.anInt4392;
								arg0 += local23;
							}
						}
						Static99.method1703(arg0 >> 16, arg1 >> 16, arg3, this.aByteArray52);
						arg3 += this.anInt4392;
						arg1 += local44;
						arg0 += local23;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local44;
					arg2 -= arg3 * local23;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local7 * arg4;
					arg4 = 0;
				}
				if (local44 > local23) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt4392 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static99.method1703(arg0 >> 16, arg1 >> 16, arg3, this.aByteArray52);
								arg1 += local44;
								arg0 += local7;
								arg3 += this.anInt4392;
							}
						}
						Static99.method1703(arg2 >> 16, arg1 >> 16, arg3, this.aByteArray52);
						arg2 += local23;
						arg3 += this.anInt4392;
						arg1 += local44;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt4392 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static99.method1703(arg1 >> 16, arg0 >> 16, arg3, this.aByteArray52);
								arg0 += local7;
								arg1 += local44;
								arg3 += this.anInt4392;
							}
						}
						Static99.method1703(arg1 >> 16, arg2 >> 16, arg3, this.aByteArray52);
						arg2 += local23;
						arg3 += this.anInt4392;
						arg1 += local44;
					}
				}
			}
		} else if (arg5 > arg3) {
			arg2 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local23;
				arg2 -= local7 * arg4;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg1 -= local44 * arg3;
				arg3 = 0;
			}
			if ((arg4 == arg3 || local7 >= local23) && (arg4 != arg3 || local44 >= local7)) {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt4392 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static99.method1703(arg1 >> 16, arg2 >> 16, arg4, this.aByteArray52);
							arg1 += local44;
							arg2 += local7;
							arg4 += this.anInt4392;
						}
					}
					Static99.method1703(arg0 >> 16, arg2 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4392;
					arg2 += local7;
					arg0 += local23;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt4392 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static99.method1703(arg2 >> 16, arg1 >> 16, arg4, this.aByteArray52);
							arg1 += local44;
							arg4 += this.anInt4392;
							arg2 += local7;
						}
					}
					Static99.method1703(arg2 >> 16, arg0 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4392;
					arg2 += local7;
					arg0 += local23;
				}
			}
		} else {
			arg1 = arg0 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local7;
				arg0 -= arg4 * local23;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local44 * arg5;
				arg5 = 0;
			}
			if (local7 < local23) {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt4392 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static99.method1703(arg2 >> 16, arg0 >> 16, arg4, this.aByteArray52);
							arg2 += local44;
							arg0 += local23;
							arg4 += this.anInt4392;
						}
					}
					Static99.method1703(arg1 >> 16, arg0 >> 16, arg4, this.aByteArray52);
					arg1 += local7;
					arg0 += local23;
					arg4 += this.anInt4392;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt4392;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static99.method1703(arg0 >> 16, arg2 >> 16, arg4, this.aByteArray52);
							arg4 += this.anInt4392;
							arg2 += local44;
							arg0 += local23;
						}
					}
					Static99.method1703(arg0 >> 16, arg1 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4392;
					arg1 += local7;
					arg0 += local23;
				}
			}
		}
	}
}
