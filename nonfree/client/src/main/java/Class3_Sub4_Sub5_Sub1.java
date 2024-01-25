import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class3_Sub4_Sub5_Sub1 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	public int anInt2668;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	public int anInt2672;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	public int anInt2673;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!kw;II)V")
	public Class3_Sub4_Sub5_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray24 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Z")
	public boolean method2492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray24.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V")
	public void method2493() {
		@Pc(7) int local7 = -1;
		@Pc(19) int local19 = this.aByteArray24.length - 8;
		while (local19 > local7) {
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
			local7++;
			this.aByteArray24[local7] = 0;
		}
		while (this.aByteArray24.length - 1 > local7) {
			local7++;
			this.aByteArray24[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
	public void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16 = 0;
		if (arg4 != arg2) {
			local16 = (arg0 - arg5 << 16) / (arg2 - arg4);
		}
		@Pc(37) int local37 = 0;
		if (arg3 != arg2) {
			local37 = (arg1 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(57) int local57 = 0;
		if (arg3 != arg4) {
			local57 = (arg5 - arg1 << 16) / (arg4 - arg3);
		}
		if (arg2 >= arg4 && arg4 <= arg3) {
			if (arg3 > arg2) {
				arg1 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local57 * arg4;
					arg5 -= local16 * arg4;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local37 * arg2;
					arg2 = 0;
				}
				if (arg4 != arg2 && local57 < local16 || arg4 == arg2 && local37 < local57) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2675 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg4, arg0 >> 16, arg1 >> 16);
								arg4 += this.anInt2675;
								arg0 += local37;
								arg1 += local57;
							}
						}
						Static213.method3606(this.aByteArray24, arg4, arg5 >> 16, arg1 >> 16);
						arg5 += local16;
						arg1 += local57;
						arg4 += this.anInt2675;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt2675;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg4, arg1 >> 16, arg0 >> 16);
								arg0 += local37;
								arg4 += this.anInt2675;
								arg1 += local57;
							}
						}
						Static213.method3606(this.aByteArray24, arg4, arg1 >> 16, arg5 >> 16);
						arg4 += this.anInt2675;
						arg5 += local16;
						arg1 += local57;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local16;
					arg0 -= local57 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local37 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg4 || local57 >= local16) && (arg3 != arg4 || local37 <= local16)) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt2675;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg4, arg1 >> 16, arg5 >> 16);
								arg5 += local16;
								arg1 += local37;
								arg4 += this.anInt2675;
							}
						}
						Static213.method3606(this.aByteArray24, arg4, arg0 >> 16, arg5 >> 16);
						arg0 += local57;
						arg5 += local16;
						arg4 += this.anInt2675;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt2675;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg4, arg5 >> 16, arg1 >> 16);
								arg5 += local16;
								arg4 += this.anInt2675;
								arg1 += local37;
							}
						}
						Static213.method3606(this.aByteArray24, arg4, arg5 >> 16, arg0 >> 16);
						arg5 += local16;
						arg0 += local57;
						arg4 += this.anInt2675;
					}
				}
			}
		} else if (arg2 > arg3) {
			if (arg4 < arg2) {
				arg0 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local37;
					arg1 -= arg3 * local57;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg5 -= arg4 * local16;
					arg4 = 0;
				}
				if (local57 <= local37) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt2675 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg3, arg0 >> 16, arg5 >> 16);
								arg0 += local37;
								arg5 += local16;
								arg3 += this.anInt2675;
							}
						}
						Static213.method3606(this.aByteArray24, arg3, arg0 >> 16, arg1 >> 16);
						arg1 += local57;
						arg0 += local37;
						arg3 += this.anInt2675;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt2675 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg3, arg5 >> 16, arg0 >> 16);
								arg0 += local37;
								arg3 += this.anInt2675;
								arg5 += local16;
							}
						}
						Static213.method3606(this.aByteArray24, arg3, arg1 >> 16, arg0 >> 16);
						arg3 += this.anInt2675;
						arg1 += local57;
						arg0 += local37;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local37;
					arg1 -= local57 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local16 * arg2;
					arg2 = 0;
				}
				if (local37 < local57) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt2675 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg3, arg1 >> 16, arg0 >> 16);
								arg3 += this.anInt2675;
								arg0 += local16;
								arg1 += local57;
							}
						}
						Static213.method3606(this.aByteArray24, arg3, arg1 >> 16, arg5 >> 16);
						arg5 += local37;
						arg3 += this.anInt2675;
						arg1 += local57;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt2675 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static213.method3606(this.aByteArray24, arg3, arg0 >> 16, arg1 >> 16);
								arg1 += local57;
								arg0 += local16;
								arg3 += this.anInt2675;
							}
						}
						Static213.method3606(this.aByteArray24, arg3, arg5 >> 16, arg1 >> 16);
						arg5 += local37;
						arg1 += local57;
						arg3 += this.anInt2675;
					}
				}
			}
		} else if (arg3 >= arg4) {
			arg1 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local37;
				arg1 -= local16 * arg2;
				arg2 = 0;
			}
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local57;
				arg4 = 0;
			}
			if (local37 > local16) {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt2675 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static213.method3606(this.aByteArray24, arg2, arg0 >> 16, arg5 >> 16);
							arg0 += local37;
							arg5 += local57;
							arg2 += this.anInt2675;
						}
					}
					Static213.method3606(this.aByteArray24, arg2, arg0 >> 16, arg1 >> 16);
					arg1 += local16;
					arg0 += local37;
					arg2 += this.anInt2675;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt2675 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static213.method3606(this.aByteArray24, arg2, arg5 >> 16, arg0 >> 16);
							arg2 += this.anInt2675;
							arg5 += local57;
							arg0 += local37;
						}
					}
					Static213.method3606(this.aByteArray24, arg2, arg1 >> 16, arg0 >> 16);
					arg1 += local16;
					arg2 += this.anInt2675;
					arg0 += local37;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local16 * arg2;
				arg0 -= local37 * arg2;
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg1 -= arg3 * local57;
				arg3 = 0;
			}
			if (arg2 != arg3 && local37 > local16 || arg3 == arg2 && local16 > local57) {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt2675 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static213.method3606(this.aByteArray24, arg2, arg1 >> 16, arg5 >> 16);
							arg2 += this.anInt2675;
							arg5 += local16;
							arg1 += local57;
						}
					}
					Static213.method3606(this.aByteArray24, arg2, arg0 >> 16, arg5 >> 16);
					arg0 += local37;
					arg5 += local16;
					arg2 += this.anInt2675;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt2675;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static213.method3606(this.aByteArray24, arg2, arg5 >> 16, arg1 >> 16);
							arg5 += local16;
							arg2 += this.anInt2675;
							arg1 += local57;
						}
					}
					Static213.method3606(this.aByteArray24, arg2, arg5 >> 16, arg0 >> 16);
					arg2 += this.anInt2675;
					arg5 += local16;
					arg0 += local37;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BIIII)V")
	public void method2497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2668 = arg0 - arg1;
		this.anInt2673 = arg1;
		this.anInt2675 = arg3 - arg2;
		this.anInt2672 = arg2;
	}
}
