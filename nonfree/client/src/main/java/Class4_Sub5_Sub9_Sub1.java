import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class4_Sub5_Sub9_Sub1 extends Class4_Sub5_Sub9 {

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	public int anInt3578;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
	public int anInt3579;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	public int anInt3583;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!wg;II)V")
	public Class4_Sub5_Sub9_Sub1(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIBI)V")
	public void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg5 != arg2) {
			local15 = (arg0 - arg3 << 16) / (arg5 - arg2);
		}
		@Pc(35) int local35 = 0;
		if (arg5 != arg4) {
			local35 = (arg1 - arg0 << 16) / (arg4 - arg5);
		}
		@Pc(56) int local56 = 0;
		if (arg4 != arg2) {
			local56 = (arg3 - arg1 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg5 && arg2 <= arg4) {
			if (arg5 < arg4) {
				arg1 = arg3 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local56;
					arg3 -= arg2 * local15;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local35 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg2 && local56 < local15 || arg2 == arg5 && local56 > local35) {
					arg4 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt3583;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg2, arg0 >> 16, arg1 >> 16);
								arg2 += this.anInt3583;
								arg1 += local56;
								arg0 += local35;
							}
						}
						Static627.method8412(this.aByteArray41, arg2, arg3 >> 16, arg1 >> 16);
						arg1 += local56;
						arg3 += local15;
						arg2 += this.anInt3583;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt3583 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg2, arg1 >> 16, arg0 >> 16);
								arg2 += this.anInt3583;
								arg0 += local35;
								arg1 += local56;
							}
						}
						Static627.method8412(this.aByteArray41, arg2, arg1 >> 16, arg3 >> 16);
						arg2 += this.anInt3583;
						arg1 += local56;
						arg3 += local15;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local15;
					arg0 -= arg2 * local56;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local35;
					arg4 = 0;
				}
				if ((arg4 == arg2 || local56 >= local15) && (arg2 != arg4 || local35 <= local15)) {
					arg5 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt3583;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg2, arg1 >> 16, arg3 >> 16);
								arg1 += local35;
								arg3 += local15;
								arg2 += this.anInt3583;
							}
						}
						Static627.method8412(this.aByteArray41, arg2, arg0 >> 16, arg3 >> 16);
						arg3 += local15;
						arg0 += local56;
						arg2 += this.anInt3583;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt3583;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg2, arg3 >> 16, arg1 >> 16);
								arg3 += local15;
								arg1 += local35;
								arg2 += this.anInt3583;
							}
						}
						Static627.method8412(this.aByteArray41, arg2, arg3 >> 16, arg0 >> 16);
						arg3 += local15;
						arg2 += this.anInt3583;
						arg0 += local56;
					}
				}
			}
		} else if (arg4 < arg5) {
			if (arg5 <= arg2) {
				arg3 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local35 * arg4;
					arg1 -= local56 * arg4;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local15 * arg5;
					arg5 = 0;
				}
				if (local35 >= local56) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt3583;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg4, arg0 >> 16, arg1 >> 16);
								arg4 += this.anInt3583;
								arg1 += local56;
								arg0 += local15;
							}
						}
						Static627.method8412(this.aByteArray41, arg4, arg3 >> 16, arg1 >> 16);
						arg3 += local35;
						arg1 += local56;
						arg4 += this.anInt3583;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt3583 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg4, arg1 >> 16, arg0 >> 16);
								arg1 += local56;
								arg4 += this.anInt3583;
								arg0 += local15;
							}
						}
						Static627.method8412(this.aByteArray41, arg4, arg1 >> 16, arg3 >> 16);
						arg4 += this.anInt3583;
						arg3 += local35;
						arg1 += local56;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local56 * arg4;
					arg0 -= local35 * arg4;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg3 -= arg2 * local15;
					arg2 = 0;
				}
				if (local35 >= local56) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt3583 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg4, arg0 >> 16, arg3 >> 16);
								arg0 += local35;
								arg4 += this.anInt3583;
								arg3 += local15;
							}
						}
						Static627.method8412(this.aByteArray41, arg4, arg0 >> 16, arg1 >> 16);
						arg1 += local56;
						arg4 += this.anInt3583;
						arg0 += local35;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt3583;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static627.method8412(this.aByteArray41, arg4, arg3 >> 16, arg0 >> 16);
								arg4 += this.anInt3583;
								arg0 += local35;
								arg3 += local15;
							}
						}
						Static627.method8412(this.aByteArray41, arg4, arg1 >> 16, arg0 >> 16);
						arg0 += local35;
						arg1 += local56;
						arg4 += this.anInt3583;
					}
				}
			}
		} else if (arg4 < arg2) {
			arg3 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local35;
				arg3 -= arg5 * local15;
				arg5 = 0;
			}
			if (arg4 < 0) {
				arg1 -= arg4 * local56;
				arg4 = 0;
			}
			if ((arg5 == arg4 || local35 <= local15) && (arg5 != arg4 || local56 >= local15)) {
				arg2 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt3583 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static627.method8412(this.aByteArray41, arg5, arg3 >> 16, arg1 >> 16);
							arg3 += local15;
							arg1 += local56;
							arg5 += this.anInt3583;
						}
					}
					Static627.method8412(this.aByteArray41, arg5, arg3 >> 16, arg0 >> 16);
					arg0 += local35;
					arg3 += local15;
					arg5 += this.anInt3583;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt3583;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static627.method8412(this.aByteArray41, arg5, arg1 >> 16, arg3 >> 16);
							arg5 += this.anInt3583;
							arg1 += local56;
							arg3 += local15;
						}
					}
					Static627.method8412(this.aByteArray41, arg5, arg0 >> 16, arg3 >> 16);
					arg3 += local15;
					arg5 += this.anInt3583;
					arg0 += local35;
				}
			}
		} else {
			arg1 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local15;
				arg0 -= arg5 * local35;
				arg5 = 0;
			}
			if (arg2 < 0) {
				arg3 -= arg2 * local56;
				arg2 = 0;
			}
			if (local35 > local15) {
				arg4 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt3583;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static627.method8412(this.aByteArray41, arg5, arg0 >> 16, arg3 >> 16);
							arg0 += local35;
							arg5 += this.anInt3583;
							arg3 += local56;
						}
					}
					Static627.method8412(this.aByteArray41, arg5, arg0 >> 16, arg1 >> 16);
					arg0 += local35;
					arg5 += this.anInt3583;
					arg1 += local15;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt3583 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static627.method8412(this.aByteArray41, arg5, arg3 >> 16, arg0 >> 16);
							arg0 += local35;
							arg3 += local56;
							arg5 += this.anInt3583;
						}
					}
					Static627.method8412(this.aByteArray41, arg5, arg1 >> 16, arg0 >> 16);
					arg5 += this.anInt3583;
					arg1 += local15;
					arg0 += local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBI)V")
	public void method3289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3578 = arg0;
		this.anInt3582 = arg3;
		this.anInt3579 = arg1 - arg3;
		this.anInt3583 = arg2 - arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z")
	public boolean method3290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray41.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	public void method3291() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray41.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
		}
		while (local7 < this.aByteArray41.length - 1) {
			local7++;
			this.aByteArray41[local7] = 0;
		}
	}
}
