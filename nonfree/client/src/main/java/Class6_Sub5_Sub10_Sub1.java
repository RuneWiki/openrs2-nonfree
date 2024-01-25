import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class6_Sub5_Sub10_Sub1 extends Class6_Sub5_Sub10 {

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public int anInt3264;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "I")
	public int anInt3265;

	@OriginalMember(owner = "client!en", name = "I", descriptor = "I")
	public int anInt3266;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ac;II)V")
	public Class6_Sub5_Sub10_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray19 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public void method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3266 = arg1 - arg3;
		this.anInt3260 = arg3;
		this.anInt3264 = arg2 - arg0;
		this.anInt3265 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	public void method2725() {
		@Pc(7) int local7 = -1;
		@Pc(21) int local21 = this.aByteArray19.length - 8;
		while (local7 < local21) {
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
			local7++;
			this.aByteArray19[local7] = 0;
		}
		while (this.aByteArray19.length - 1 > local7) {
			local7++;
			this.aByteArray19[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)Z")
	public boolean method2726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray19.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg4 != arg0) {
			local15 = (arg1 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(36) int local36 = 0;
		if (arg3 != arg4) {
			local36 = (arg5 - arg1 << 16) / (arg3 - arg4);
		}
		@Pc(53) int local53 = 0;
		if (arg3 != arg0) {
			local53 = (arg2 - arg5 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg4 && arg0 <= arg3) {
			if (arg3 > arg4) {
				arg5 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local15 * arg0;
					arg5 -= arg0 * local53;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local36 * arg4;
					arg4 = 0;
				}
				if (arg0 != arg4 && local15 > local53 || arg0 == arg4 && local53 > local36) {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt3264;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg1 >> 16, arg0, arg5 >> 16);
								arg5 += local53;
								arg1 += local36;
								arg0 += this.anInt3264;
							}
						}
						Static463.method6948(this.aByteArray19, arg2 >> 16, arg0, arg5 >> 16);
						arg0 += this.anInt3264;
						arg5 += local53;
						arg2 += local15;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt3264;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg5 >> 16, arg0, arg1 >> 16);
								arg1 += local36;
								arg5 += local53;
								arg0 += this.anInt3264;
							}
						}
						Static463.method6948(this.aByteArray19, arg5 >> 16, arg0, arg2 >> 16);
						arg2 += local15;
						arg0 += this.anInt3264;
						arg5 += local53;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local53 * arg0;
					arg2 -= local15 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg5 -= arg3 * local36;
					arg3 = 0;
				}
				if ((arg0 == arg3 || local53 >= local15) && (arg3 != arg0 || local15 >= local36)) {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt3264;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg5 >> 16, arg0, arg2 >> 16);
								arg5 += local36;
								arg2 += local15;
								arg0 += this.anInt3264;
							}
						}
						Static463.method6948(this.aByteArray19, arg1 >> 16, arg0, arg2 >> 16);
						arg1 += local53;
						arg0 += this.anInt3264;
						arg2 += local15;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt3264;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg2 >> 16, arg0, arg5 >> 16);
								arg2 += local15;
								arg5 += local36;
								arg0 += this.anInt3264;
							}
						}
						Static463.method6948(this.aByteArray19, arg2 >> 16, arg0, arg1 >> 16);
						arg1 += local53;
						arg0 += this.anInt3264;
						arg2 += local15;
					}
				}
			}
		} else if (arg3 < arg4) {
			if (arg0 >= arg4) {
				arg2 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local36 * arg3;
					arg5 -= local53 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local15;
					arg4 = 0;
				}
				if (local36 >= local53) {
					arg0 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt3264;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg1 >> 16, arg3, arg5 >> 16);
								arg5 += local53;
								arg1 += local15;
								arg3 += this.anInt3264;
							}
						}
						Static463.method6948(this.aByteArray19, arg2 >> 16, arg3, arg5 >> 16);
						arg5 += local53;
						arg2 += local36;
						arg3 += this.anInt3264;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt3264;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg5 >> 16, arg3, arg1 >> 16);
								arg5 += local53;
								arg3 += this.anInt3264;
								arg1 += local15;
							}
						}
						Static463.method6948(this.aByteArray19, arg5 >> 16, arg3, arg2 >> 16);
						arg5 += local53;
						arg3 += this.anInt3264;
						arg2 += local36;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local53 * arg3;
					arg1 -= local36 * arg3;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local15 * arg0;
					arg0 = 0;
				}
				if (local53 > local36) {
					arg4 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3264 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg2 >> 16, arg3, arg1 >> 16);
								arg1 += local36;
								arg3 += this.anInt3264;
								arg2 += local15;
							}
						}
						Static463.method6948(this.aByteArray19, arg5 >> 16, arg3, arg1 >> 16);
						arg3 += this.anInt3264;
						arg1 += local36;
						arg5 += local53;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3264 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static463.method6948(this.aByteArray19, arg1 >> 16, arg3, arg2 >> 16);
								arg3 += this.anInt3264;
								arg1 += local36;
								arg2 += local15;
							}
						}
						Static463.method6948(this.aByteArray19, arg1 >> 16, arg3, arg5 >> 16);
						arg3 += this.anInt3264;
						arg5 += local53;
						arg1 += local36;
					}
				}
			}
		} else if (arg0 > arg3) {
			arg2 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= local36 * arg4;
				arg2 -= arg4 * local15;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg5 -= arg3 * local53;
				arg3 = 0;
			}
			if ((arg3 == arg4 || local36 <= local15) && (arg3 != arg4 || local53 >= local15)) {
				arg0 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt3264;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static463.method6948(this.aByteArray19, arg2 >> 16, arg4, arg5 >> 16);
							arg4 += this.anInt3264;
							arg2 += local15;
							arg5 += local53;
						}
					}
					Static463.method6948(this.aByteArray19, arg2 >> 16, arg4, arg1 >> 16);
					arg4 += this.anInt3264;
					arg1 += local36;
					arg2 += local15;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt3264 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static463.method6948(this.aByteArray19, arg5 >> 16, arg4, arg2 >> 16);
							arg2 += local15;
							arg5 += local53;
							arg4 += this.anInt3264;
						}
					}
					Static463.method6948(this.aByteArray19, arg1 >> 16, arg4, arg2 >> 16);
					arg2 += local15;
					arg4 += this.anInt3264;
					arg1 += local36;
				}
			}
		} else {
			arg5 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local36;
				arg5 -= arg4 * local15;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local53;
				arg0 = 0;
			}
			if (local15 >= local36) {
				arg3 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt3264;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static463.method6948(this.aByteArray19, arg2 >> 16, arg4, arg1 >> 16);
							arg4 += this.anInt3264;
							arg2 += local53;
							arg1 += local36;
						}
					}
					Static463.method6948(this.aByteArray19, arg5 >> 16, arg4, arg1 >> 16);
					arg1 += local36;
					arg4 += this.anInt3264;
					arg5 += local15;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt3264;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static463.method6948(this.aByteArray19, arg1 >> 16, arg4, arg2 >> 16);
							arg1 += local36;
							arg4 += this.anInt3264;
							arg2 += local53;
						}
					}
					Static463.method6948(this.aByteArray19, arg1 >> 16, arg4, arg5 >> 16);
					arg1 += local36;
					arg4 += this.anInt3264;
					arg5 += local15;
				}
			}
		}
	}
}
