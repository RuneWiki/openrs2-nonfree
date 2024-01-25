import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class6_Sub4_Sub2_Sub2 extends Class6_Sub4_Sub2 {

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
	public int anInt9107;

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
	public int anInt9109;

	@OriginalMember(owner = "client!ur", name = "A", descriptor = "I")
	public int anInt9110;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
	public int anInt9115;

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "[B")
	public final byte[] aByteArray121;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!fo;II)V")
	public Class6_Sub4_Sub2_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray121 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIBI)V")
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg5) {
			local7 = (arg3 - arg1 << 16) / (arg4 - arg5);
		}
		@Pc(27) int local27 = 0;
		if (arg4 != arg2) {
			local27 = (arg0 - arg3 << 16) / (arg2 - arg4);
		}
		@Pc(59) int local59 = 0;
		if (arg2 != arg5) {
			local59 = (arg1 - arg0 << 16) / (arg5 - arg2);
		}
		if (arg4 >= arg5 && arg5 <= arg2) {
			if (arg2 <= arg4) {
				arg3 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local7;
					arg3 -= arg5 * local59;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local27 * arg2;
					arg2 = 0;
				}
				if (arg5 != arg2 && local7 > local59 || arg5 == arg2 && local27 > local7) {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt9107;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static222.method3999(arg1 >> 16, arg0 >> 16, arg5, this.aByteArray121);
								arg1 += local7;
								arg0 += local27;
								arg5 += this.anInt9107;
							}
						}
						Static222.method3999(arg1 >> 16, arg3 >> 16, arg5, this.aByteArray121);
						arg3 += local59;
						arg5 += this.anInt9107;
						arg1 += local7;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt9107 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static222.method3999(arg0 >> 16, arg1 >> 16, arg5, this.aByteArray121);
								arg1 += local7;
								arg0 += local27;
								arg5 += this.anInt9107;
							}
						}
						Static222.method3999(arg3 >> 16, arg1 >> 16, arg5, this.aByteArray121);
						arg1 += local7;
						arg5 += this.anInt9107;
						arg3 += local59;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg0 -= local59 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg3 -= local27 * arg4;
					arg4 = 0;
				}
				if ((arg5 == arg4 || local7 <= local59) && (arg5 != arg4 || local27 >= local59)) {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt9107 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static222.method3999(arg0 >> 16, arg3 >> 16, arg5, this.aByteArray121);
								arg0 += local59;
								arg5 += this.anInt9107;
								arg3 += local27;
							}
						}
						Static222.method3999(arg0 >> 16, arg1 >> 16, arg5, this.aByteArray121);
						arg5 += this.anInt9107;
						arg0 += local59;
						arg1 += local7;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt9107;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static222.method3999(arg3 >> 16, arg0 >> 16, arg5, this.aByteArray121);
								arg5 += this.anInt9107;
								arg3 += local27;
								arg0 += local59;
							}
						}
						Static222.method3999(arg1 >> 16, arg0 >> 16, arg5, this.aByteArray121);
						arg0 += local59;
						arg1 += local7;
						arg5 += this.anInt9107;
					}
				}
			}
		} else if (arg4 <= arg2) {
			if (arg2 >= arg5) {
				arg0 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local7;
					arg3 -= arg4 * local27;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local59;
					arg5 = 0;
				}
				if (local27 <= local7) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9107 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static222.method3999(arg1 >> 16, arg3 >> 16, arg4, this.aByteArray121);
								arg1 += local59;
								arg3 += local27;
								arg4 += this.anInt9107;
							}
						}
						Static222.method3999(arg0 >> 16, arg3 >> 16, arg4, this.aByteArray121);
						arg0 += local7;
						arg3 += local27;
						arg4 += this.anInt9107;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9107 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static222.method3999(arg3 >> 16, arg1 >> 16, arg4, this.aByteArray121);
								arg3 += local27;
								arg4 += this.anInt9107;
								arg1 += local59;
							}
						}
						Static222.method3999(arg3 >> 16, arg0 >> 16, arg4, this.aByteArray121);
						arg3 += local27;
						arg4 += this.anInt9107;
						arg0 += local7;
					}
				}
			} else {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local7;
					arg3 -= arg4 * local27;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local59;
					arg2 = 0;
				}
				if ((arg4 == arg2 || local7 >= local27) && (arg4 != arg2 || local59 >= local7)) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt9107 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static222.method3999(arg1 >> 16, arg0 >> 16, arg4, this.aByteArray121);
								arg0 += local59;
								arg4 += this.anInt9107;
								arg1 += local7;
							}
						}
						Static222.method3999(arg1 >> 16, arg3 >> 16, arg4, this.aByteArray121);
						arg3 += local27;
						arg4 += this.anInt9107;
						arg1 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt9107 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static222.method3999(arg0 >> 16, arg1 >> 16, arg4, this.aByteArray121);
								arg4 += this.anInt9107;
								arg0 += local59;
								arg1 += local7;
							}
						}
						Static222.method3999(arg3 >> 16, arg1 >> 16, arg4, this.aByteArray121);
						arg1 += local7;
						arg4 += this.anInt9107;
						arg3 += local27;
					}
				}
			}
		} else if (arg4 <= arg5) {
			arg1 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local59;
				arg1 -= arg2 * local27;
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg3 -= arg4 * local7;
				arg4 = 0;
			}
			if (local27 < local59) {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt9107 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static222.method3999(arg0 >> 16, arg3 >> 16, arg2, this.aByteArray121);
							arg3 += local7;
							arg0 += local59;
							arg2 += this.anInt9107;
						}
					}
					Static222.method3999(arg0 >> 16, arg1 >> 16, arg2, this.aByteArray121);
					arg1 += local27;
					arg0 += local59;
					arg2 += this.anInt9107;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt9107;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static222.method3999(arg3 >> 16, arg0 >> 16, arg2, this.aByteArray121);
							arg2 += this.anInt9107;
							arg3 += local7;
							arg0 += local59;
						}
					}
					Static222.method3999(arg1 >> 16, arg0 >> 16, arg2, this.aByteArray121);
					arg1 += local27;
					arg0 += local59;
					arg2 += this.anInt9107;
				}
			}
		} else {
			arg3 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local27;
				arg0 -= local59 * arg2;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local7;
				arg5 = 0;
			}
			if (local59 > local27) {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt9107;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static222.method3999(arg1 >> 16, arg3 >> 16, arg2, this.aByteArray121);
							arg2 += this.anInt9107;
							arg3 += local27;
							arg1 += local7;
						}
					}
					Static222.method3999(arg0 >> 16, arg3 >> 16, arg2, this.aByteArray121);
					arg0 += local59;
					arg3 += local27;
					arg2 += this.anInt9107;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt9107;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static222.method3999(arg3 >> 16, arg1 >> 16, arg2, this.aByteArray121);
							arg2 += this.anInt9107;
							arg3 += local27;
							arg1 += local7;
						}
					}
					Static222.method3999(arg3 >> 16, arg0 >> 16, arg2, this.aByteArray121);
					arg2 += this.anInt9107;
					arg0 += local59;
					arg3 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
	public void method7648() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray121.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
			local11++;
			this.aByteArray121[local11] = 0;
		}
		while (this.aByteArray121.length - 1 > local11) {
			local11++;
			this.aByteArray121[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIII)V")
	public void method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9109 = arg0 - arg2;
		this.anInt9115 = arg1;
		this.anInt9107 = arg3 - arg1;
		this.anInt9110 = arg2;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z")
	public boolean method7651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray121.length;
	}
}
