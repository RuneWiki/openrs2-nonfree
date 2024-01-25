import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class6_Sub5_Sub10_Sub2 extends Class6_Sub5_Sub10 {

	@OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
	public int anInt6246;

	@OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!mv", name = "C", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!en;II)V")
	public Class6_Sub5_Sub10_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray80 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
	public void method5061() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray80.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
			local12++;
			this.aByteArray80[local12] = 0;
		}
		while (this.aByteArray80.length - 1 > local12) {
			local12++;
			this.aByteArray80[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIBIIII)V")
	public void method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg4) {
			local7 = (arg2 - arg5 << 16) / (arg3 - arg4);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg1) {
			local27 = (arg0 - arg2 << 16) / (arg1 - arg3);
		}
		@Pc(52) int local52 = 0;
		if (arg1 != arg4) {
			local52 = (arg5 - arg0 << 16) / (arg4 - arg1);
		}
		if (arg4 <= arg3 && arg1 >= arg4) {
			if (arg1 <= arg3) {
				arg2 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local52 * arg4;
					arg5 -= local7 * arg4;
					arg4 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local27;
					arg1 = 0;
				}
				if (arg1 != arg4 && local52 < local7 || arg1 == arg4 && local7 < local27) {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt6253;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg5 >> 16, arg4, arg0 >> 16);
								arg4 += this.anInt6253;
								arg0 += local27;
								arg5 += local7;
							}
						}
						Static513.method6920(this.aByteArray80, arg5 >> 16, arg4, arg2 >> 16);
						arg5 += local7;
						arg4 += this.anInt6253;
						arg2 += local52;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt6253;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg0 >> 16, arg4, arg5 >> 16);
								arg4 += this.anInt6253;
								arg5 += local7;
								arg0 += local27;
							}
						}
						Static513.method6920(this.aByteArray80, arg2 >> 16, arg4, arg5 >> 16);
						arg5 += local7;
						arg2 += local52;
						arg4 += this.anInt6253;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local52;
					arg5 -= arg4 * local7;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local27 * arg3;
					arg3 = 0;
				}
				if ((arg4 == arg3 || local52 >= local7) && (arg3 != arg4 || local52 <= local27)) {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt6253;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg0 >> 16, arg4, arg2 >> 16);
								arg2 += local27;
								arg0 += local52;
								arg4 += this.anInt6253;
							}
						}
						Static513.method6920(this.aByteArray80, arg0 >> 16, arg4, arg5 >> 16);
						arg0 += local52;
						arg5 += local7;
						arg4 += this.anInt6253;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt6253;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg2 >> 16, arg4, arg0 >> 16);
								arg4 += this.anInt6253;
								arg2 += local27;
								arg0 += local52;
							}
						}
						Static513.method6920(this.aByteArray80, arg5 >> 16, arg4, arg0 >> 16);
						arg5 += local7;
						arg0 += local52;
						arg4 += this.anInt6253;
					}
				}
			}
		} else if (arg3 <= arg1) {
			if (arg1 >= arg4) {
				arg0 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local27;
					arg0 -= local7 * arg3;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local52;
					arg4 = 0;
				}
				if (local7 >= local27) {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt6253 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg5 >> 16, arg3, arg2 >> 16);
								arg3 += this.anInt6253;
								arg5 += local52;
								arg2 += local27;
							}
						}
						Static513.method6920(this.aByteArray80, arg0 >> 16, arg3, arg2 >> 16);
						arg0 += local7;
						arg2 += local27;
						arg3 += this.anInt6253;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt6253;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg2 >> 16, arg3, arg5 >> 16);
								arg5 += local52;
								arg3 += this.anInt6253;
								arg2 += local27;
							}
						}
						Static513.method6920(this.aByteArray80, arg2 >> 16, arg3, arg0 >> 16);
						arg0 += local7;
						arg3 += this.anInt6253;
						arg2 += local27;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local27;
					arg5 -= local7 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local52;
					arg1 = 0;
				}
				if ((arg1 == arg3 || local27 <= local7) && (arg3 != arg1 || local52 >= local7)) {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6253 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg5 >> 16, arg3, arg0 >> 16);
								arg5 += local7;
								arg0 += local52;
								arg3 += this.anInt6253;
							}
						}
						Static513.method6920(this.aByteArray80, arg5 >> 16, arg3, arg2 >> 16);
						arg5 += local7;
						arg3 += this.anInt6253;
						arg2 += local27;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6253 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static513.method6920(this.aByteArray80, arg0 >> 16, arg3, arg5 >> 16);
								arg0 += local52;
								arg3 += this.anInt6253;
								arg5 += local7;
							}
						}
						Static513.method6920(this.aByteArray80, arg2 >> 16, arg3, arg5 >> 16);
						arg2 += local27;
						arg3 += this.anInt6253;
						arg5 += local7;
					}
				}
			}
		} else if (arg4 >= arg3) {
			arg5 = arg0 <<= 0x10;
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local52;
				arg5 -= arg1 * local27;
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg2 -= local7 * arg3;
				arg3 = 0;
			}
			if (local52 > local27) {
				arg4 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt6253 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static513.method6920(this.aByteArray80, arg0 >> 16, arg1, arg2 >> 16);
							arg2 += local7;
							arg0 += local52;
							arg1 += this.anInt6253;
						}
					}
					Static513.method6920(this.aByteArray80, arg0 >> 16, arg1, arg5 >> 16);
					arg5 += local27;
					arg0 += local52;
					arg1 += this.anInt6253;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt6253;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static513.method6920(this.aByteArray80, arg2 >> 16, arg1, arg0 >> 16);
							arg2 += local7;
							arg0 += local52;
							arg1 += this.anInt6253;
						}
					}
					Static513.method6920(this.aByteArray80, arg5 >> 16, arg1, arg0 >> 16);
					arg1 += this.anInt6253;
					arg5 += local27;
					arg0 += local52;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= arg1 * local27;
				arg0 -= local52 * arg1;
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg5 -= arg4 * local7;
				arg4 = 0;
			}
			if (local52 > local27) {
				arg3 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt6253;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static513.method6920(this.aByteArray80, arg5 >> 16, arg1, arg2 >> 16);
							arg1 += this.anInt6253;
							arg5 += local7;
							arg2 += local27;
						}
					}
					Static513.method6920(this.aByteArray80, arg0 >> 16, arg1, arg2 >> 16);
					arg1 += this.anInt6253;
					arg2 += local27;
					arg0 += local52;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt6253 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static513.method6920(this.aByteArray80, arg2 >> 16, arg1, arg5 >> 16);
							arg5 += local7;
							arg2 += local27;
							arg1 += this.anInt6253;
						}
					}
					Static513.method6920(this.aByteArray80, arg2 >> 16, arg1, arg0 >> 16);
					arg0 += local52;
					arg1 += this.anInt6253;
					arg2 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(III)Z")
	public boolean method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray80.length;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIBII)V")
	public void method5065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6246 = arg3;
		this.anInt6247 = arg1 - arg3;
		this.anInt6253 = arg0 - arg2;
		this.anInt6252 = arg2;
	}
}
