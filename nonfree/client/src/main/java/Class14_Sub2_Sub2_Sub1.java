import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class14_Sub2_Sub2_Sub1 extends Class14_Sub2_Sub2 {

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	public int anInt6072;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	public int anInt6073;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	public int anInt6074;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "[B")
	public final byte[] aByteArray191;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!sq;II)V")
	public Class14_Sub2_Sub2_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray191 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
	public boolean method5428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray191.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
	public void method5430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6072 = arg1 - arg3;
		this.anInt6074 = arg2;
		this.anInt6075 = arg3;
		this.anInt6073 = arg0 - arg2;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public void method5431() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray191.length - 8;
		while (local1 < local7) {
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
			local1++;
			this.aByteArray191[local1] = 0;
		}
		while (local1 < this.aByteArray191.length - 1) {
			local1++;
			this.aByteArray191[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V")
	public void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg5 != arg0) {
			local1 = (arg2 - arg1 << 16) / (arg0 - arg5);
		}
		@Pc(18) int local18 = 0;
		if (arg4 != arg0) {
			local18 = (arg3 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(40) int local40 = 0;
		if (arg4 != arg5) {
			local40 = (arg1 - arg3 << 16) / (arg5 - arg4);
		}
		if (arg5 <= arg0 && arg4 >= arg5) {
			if (arg0 < arg4) {
				arg3 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local40 * arg5;
					arg1 -= local1 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local18;
					arg0 = 0;
				}
				if (arg0 != arg5 && local40 < local1 || arg0 == arg5 && local18 < local40) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt6072 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static367.method5429(arg3 >> 16, arg2 >> 16, arg5, this.aByteArray191);
								arg5 += this.anInt6072;
								arg2 += local18;
								arg3 += local40;
							}
						}
						Static367.method5429(arg3 >> 16, arg1 >> 16, arg5, this.aByteArray191);
						arg1 += local1;
						arg3 += local40;
						arg5 += this.anInt6072;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt6072 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static367.method5429(arg2 >> 16, arg3 >> 16, arg5, this.aByteArray191);
								arg5 += this.anInt6072;
								arg2 += local18;
								arg3 += local40;
							}
						}
						Static367.method5429(arg1 >> 16, arg3 >> 16, arg5, this.aByteArray191);
						arg5 += this.anInt6072;
						arg3 += local40;
						arg1 += local1;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local40 * arg5;
					arg1 -= local1 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local18 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg5 && local40 < local1 || arg5 == arg4 && local18 > local1) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt6072;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static367.method5429(arg3 >> 16, arg1 >> 16, arg5, this.aByteArray191);
								arg5 += this.anInt6072;
								arg3 += local18;
								arg1 += local1;
							}
						}
						Static367.method5429(arg2 >> 16, arg1 >> 16, arg5, this.aByteArray191);
						arg5 += this.anInt6072;
						arg2 += local40;
						arg1 += local1;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt6072 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static367.method5429(arg1 >> 16, arg3 >> 16, arg5, this.aByteArray191);
								arg1 += local1;
								arg3 += local18;
								arg5 += this.anInt6072;
							}
						}
						Static367.method5429(arg1 >> 16, arg2 >> 16, arg5, this.aByteArray191);
						arg5 += this.anInt6072;
						arg2 += local40;
						arg1 += local1;
					}
				}
			}
		} else if (arg0 <= arg4) {
			if (arg5 > arg4) {
				arg1 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local1;
					arg2 -= arg0 * local18;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local40 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg0 && local18 > local1 || arg0 == arg4 && local1 > local40) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt6072;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static367.method5429(arg1 >> 16, arg3 >> 16, arg0, this.aByteArray191);
								arg3 += local40;
								arg1 += local1;
								arg0 += this.anInt6072;
							}
						}
						Static367.method5429(arg1 >> 16, arg2 >> 16, arg0, this.aByteArray191);
						arg0 += this.anInt6072;
						arg2 += local18;
						arg1 += local1;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt6072 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static367.method5429(arg3 >> 16, arg1 >> 16, arg0, this.aByteArray191);
								arg0 += this.anInt6072;
								arg1 += local1;
								arg3 += local40;
							}
						}
						Static367.method5429(arg2 >> 16, arg1 >> 16, arg0, this.aByteArray191);
						arg2 += local18;
						arg1 += local1;
						arg0 += this.anInt6072;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local1;
					arg2 -= arg0 * local18;
					arg0 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local40 * arg5;
					arg5 = 0;
				}
				if (local1 >= local18) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt6072;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static367.method5429(arg2 >> 16, arg1 >> 16, arg0, this.aByteArray191);
								arg2 += local18;
								arg1 += local40;
								arg0 += this.anInt6072;
							}
						}
						Static367.method5429(arg2 >> 16, arg3 >> 16, arg0, this.aByteArray191);
						arg2 += local18;
						arg3 += local1;
						arg0 += this.anInt6072;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt6072 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static367.method5429(arg1 >> 16, arg2 >> 16, arg0, this.aByteArray191);
								arg2 += local18;
								arg1 += local40;
								arg0 += this.anInt6072;
							}
						}
						Static367.method5429(arg3 >> 16, arg2 >> 16, arg0, this.aByteArray191);
						arg3 += local1;
						arg2 += local18;
						arg0 += this.anInt6072;
					}
				}
			}
		} else if (arg5 < arg0) {
			arg2 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= arg4 * local18;
				arg3 -= local40 * arg4;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local1 * arg5;
				arg5 = 0;
			}
			if (local18 < local40) {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt6072;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static367.method5429(arg2 >> 16, arg1 >> 16, arg4, this.aByteArray191);
							arg4 += this.anInt6072;
							arg1 += local1;
							arg2 += local18;
						}
					}
					Static367.method5429(arg2 >> 16, arg3 >> 16, arg4, this.aByteArray191);
					arg4 += this.anInt6072;
					arg2 += local18;
					arg3 += local40;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt6072 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static367.method5429(arg1 >> 16, arg2 >> 16, arg4, this.aByteArray191);
							arg1 += local1;
							arg4 += this.anInt6072;
							arg2 += local18;
						}
					}
					Static367.method5429(arg3 >> 16, arg2 >> 16, arg4, this.aByteArray191);
					arg4 += this.anInt6072;
					arg3 += local40;
					arg2 += local18;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= local18 * arg4;
				arg3 -= local40 * arg4;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg2 -= arg0 * local1;
				arg0 = 0;
			}
			if (local18 < local40) {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt6072;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static367.method5429(arg2 >> 16, arg3 >> 16, arg4, this.aByteArray191);
							arg4 += this.anInt6072;
							arg3 += local40;
							arg2 += local1;
						}
					}
					Static367.method5429(arg1 >> 16, arg3 >> 16, arg4, this.aByteArray191);
					arg4 += this.anInt6072;
					arg1 += local18;
					arg3 += local40;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt6072;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static367.method5429(arg3 >> 16, arg2 >> 16, arg4, this.aByteArray191);
							arg2 += local1;
							arg3 += local40;
							arg4 += this.anInt6072;
						}
					}
					Static367.method5429(arg3 >> 16, arg1 >> 16, arg4, this.aByteArray191);
					arg4 += this.anInt6072;
					arg1 += local18;
					arg3 += local40;
				}
			}
		}
	}
}
