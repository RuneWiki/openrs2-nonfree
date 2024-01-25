import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class2_Sub5_Sub7_Sub1 extends Class2_Sub5_Sub7 {

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
	public int anInt4717;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public int anInt4719;

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
	public int anInt4725;

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
	public int anInt4726;

	@OriginalMember(owner = "client!ok", name = "M", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!pg;II)V")
	public Class2_Sub5_Sub7_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray56 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
	public void method3834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4717 = arg3 - arg0;
		this.anInt4726 = arg0;
		this.anInt4725 = arg1 - arg2;
		this.anInt4719 = arg2;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
	public void method3836() {
		@Pc(17) int local17 = -1;
		@Pc(23) int local23 = this.aByteArray56.length - 8;
		while (local23 > local17) {
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
			local17++;
			this.aByteArray56[local17] = 0;
		}
		while (this.aByteArray56.length - 1 > local17) {
			local17++;
			this.aByteArray56[local17] = 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z")
	public boolean method3838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray56.length;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIIIII)V")
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg4) {
			local7 = (arg3 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(32) int local32 = 0;
		if (arg1 != arg4) {
			local32 = (arg5 - arg3 << 16) / (arg1 - arg4);
		}
		@Pc(53) int local53 = 0;
		if (arg0 != arg1) {
			local53 = (arg2 - arg5 << 16) / (arg0 - arg1);
		}
		if (arg0 <= arg4 && arg0 <= arg1) {
			if (arg1 <= arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg3 -= local53 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local32;
					arg1 = 0;
				}
				if (arg0 != arg1 && local53 < local7 || arg0 == arg1 && local7 < local32) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt4725;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method4738(arg5 >> 16, this.aByteArray56, arg0, arg2 >> 16);
								arg0 += this.anInt4725;
								arg2 += local7;
								arg5 += local32;
							}
						}
						Static359.method4738(arg3 >> 16, this.aByteArray56, arg0, arg2 >> 16);
						arg2 += local7;
						arg0 += this.anInt4725;
						arg3 += local53;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt4725;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method4738(arg2 >> 16, this.aByteArray56, arg0, arg5 >> 16);
								arg0 += this.anInt4725;
								arg2 += local7;
								arg5 += local32;
							}
						}
						Static359.method4738(arg2 >> 16, this.aByteArray56, arg0, arg3 >> 16);
						arg2 += local7;
						arg0 += this.anInt4725;
						arg3 += local53;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg5 -= local53 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg3 -= local32 * arg4;
					arg4 = 0;
				}
				if ((arg0 == arg4 || local53 >= local7) && (arg4 != arg0 || local32 >= local53)) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt4725;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method4738(arg3 >> 16, this.aByteArray56, arg0, arg5 >> 16);
								arg3 += local32;
								arg5 += local53;
								arg0 += this.anInt4725;
							}
						}
						Static359.method4738(arg2 >> 16, this.aByteArray56, arg0, arg5 >> 16);
						arg0 += this.anInt4725;
						arg5 += local53;
						arg2 += local7;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt4725 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method4738(arg5 >> 16, this.aByteArray56, arg0, arg3 >> 16);
								arg5 += local53;
								arg0 += this.anInt4725;
								arg3 += local32;
							}
						}
						Static359.method4738(arg5 >> 16, this.aByteArray56, arg0, arg2 >> 16);
						arg2 += local7;
						arg5 += local53;
						arg0 += this.anInt4725;
					}
				}
			}
		} else if (arg1 >= arg4) {
			if (arg0 <= arg1) {
				arg5 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local7;
					arg3 -= arg4 * local32;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg2 -= local53 * arg0;
					arg0 = 0;
				}
				if (local7 < local32) {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt4725 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method4738(arg2 >> 16, this.aByteArray56, arg4, arg3 >> 16);
								arg3 += local32;
								arg4 += this.anInt4725;
								arg2 += local53;
							}
						}
						Static359.method4738(arg5 >> 16, this.aByteArray56, arg4, arg3 >> 16);
						arg3 += local32;
						arg5 += local7;
						arg4 += this.anInt4725;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt4725;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method4738(arg3 >> 16, this.aByteArray56, arg4, arg2 >> 16);
								arg3 += local32;
								arg4 += this.anInt4725;
								arg2 += local53;
							}
						}
						Static359.method4738(arg3 >> 16, this.aByteArray56, arg4, arg5 >> 16);
						arg3 += local32;
						arg4 += this.anInt4725;
						arg5 += local7;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local7;
					arg3 -= arg4 * local32;
					arg4 = 0;
				}
				if (arg1 < 0) {
					arg5 -= arg1 * local53;
					arg1 = 0;
				}
				if ((arg4 == arg1 || local7 >= local32) && (arg4 != arg1 || local7 <= local53)) {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt4725;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static359.method4738(arg5 >> 16, this.aByteArray56, arg4, arg2 >> 16);
								arg4 += this.anInt4725;
								arg5 += local53;
								arg2 += local7;
							}
						}
						Static359.method4738(arg3 >> 16, this.aByteArray56, arg4, arg2 >> 16);
						arg2 += local7;
						arg3 += local32;
						arg4 += this.anInt4725;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt4725;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static359.method4738(arg2 >> 16, this.aByteArray56, arg4, arg5 >> 16);
								arg4 += this.anInt4725;
								arg2 += local7;
								arg5 += local53;
							}
						}
						Static359.method4738(arg2 >> 16, this.aByteArray56, arg4, arg3 >> 16);
						arg4 += this.anInt4725;
						arg2 += local7;
						arg3 += local32;
					}
				}
			}
		} else if (arg0 >= arg4) {
			arg2 = arg5 <<= 0x10;
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local53;
				arg2 -= arg1 * local32;
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg3 -= local7 * arg4;
				arg4 = 0;
			}
			if (local53 > local32) {
				arg0 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt4725 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static359.method4738(arg3 >> 16, this.aByteArray56, arg1, arg5 >> 16);
							arg3 += local7;
							arg5 += local53;
							arg1 += this.anInt4725;
						}
					}
					Static359.method4738(arg2 >> 16, this.aByteArray56, arg1, arg5 >> 16);
					arg2 += local32;
					arg5 += local53;
					arg1 += this.anInt4725;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt4725 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static359.method4738(arg5 >> 16, this.aByteArray56, arg1, arg3 >> 16);
							arg1 += this.anInt4725;
							arg5 += local53;
							arg3 += local7;
						}
					}
					Static359.method4738(arg5 >> 16, this.aByteArray56, arg1, arg2 >> 16);
					arg1 += this.anInt4725;
					arg2 += local32;
					arg5 += local53;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local53;
				arg3 -= local32 * arg1;
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg2 -= local7 * arg0;
				arg0 = 0;
			}
			if (local32 < local53) {
				arg4 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt4725;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static359.method4738(arg3 >> 16, this.aByteArray56, arg1, arg2 >> 16);
							arg3 += local32;
							arg2 += local7;
							arg1 += this.anInt4725;
						}
					}
					Static359.method4738(arg3 >> 16, this.aByteArray56, arg1, arg5 >> 16);
					arg1 += this.anInt4725;
					arg3 += local32;
					arg5 += local53;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt4725;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static359.method4738(arg2 >> 16, this.aByteArray56, arg1, arg3 >> 16);
							arg1 += this.anInt4725;
							arg3 += local32;
							arg2 += local7;
						}
					}
					Static359.method4738(arg5 >> 16, this.aByteArray56, arg1, arg3 >> 16);
					arg5 += local53;
					arg3 += local32;
					arg1 += this.anInt4725;
				}
			}
		}
	}
}
