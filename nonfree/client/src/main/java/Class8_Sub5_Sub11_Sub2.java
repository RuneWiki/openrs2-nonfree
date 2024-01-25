import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class8_Sub5_Sub11_Sub2 extends Class8_Sub5_Sub11 {

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
	public int anInt8798;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
	public int anInt8799;

	@OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
	public int anInt8809;

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
	public int anInt8810;

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "[B")
	public final byte[] aByteArray81;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ln;II)V")
	public Class8_Sub5_Sub11_Sub2(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray81 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Z")
	public boolean method7261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray81.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V")
	public void method7264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8799 = arg3 - arg2;
		this.anInt8809 = arg2;
		this.anInt8798 = arg0 - arg1;
		this.anInt8810 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII)V")
	public void method7267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg4) {
			local7 = (arg1 - arg2 << 16) / (arg3 - arg4);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg3) {
			local24 = (arg0 - arg1 << 16) / (arg5 - arg3);
		}
		@Pc(41) int local41 = 0;
		if (arg5 != arg4) {
			local41 = (arg2 - arg0 << 16) / (arg4 - arg5);
		}
		if (arg4 <= arg3 && arg5 >= arg4) {
			if (arg5 <= arg3) {
				arg1 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local41 * arg4;
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local24;
					arg5 = 0;
				}
				if (arg5 != arg4 && local7 > local41 || arg4 == arg5 && local7 < local24) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8799;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static374.method4083(arg4, this.aByteArray81, arg0 >> 16, arg2 >> 16);
								arg2 += local7;
								arg0 += local24;
								arg4 += this.anInt8799;
							}
						}
						Static374.method4083(arg4, this.aByteArray81, arg1 >> 16, arg2 >> 16);
						arg1 += local41;
						arg2 += local7;
						arg4 += this.anInt8799;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt8799 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static374.method4083(arg4, this.aByteArray81, arg2 >> 16, arg0 >> 16);
								arg2 += local7;
								arg4 += this.anInt8799;
								arg0 += local24;
							}
						}
						Static374.method4083(arg4, this.aByteArray81, arg2 >> 16, arg1 >> 16);
						arg2 += local7;
						arg4 += this.anInt8799;
						arg1 += local41;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local41 * arg4;
					arg2 -= arg4 * local7;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local24 * arg3;
					arg3 = 0;
				}
				if ((arg4 == arg3 || local7 <= local41) && (arg3 != arg4 || local24 >= local41)) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt8799;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static374.method4083(arg4, this.aByteArray81, arg1 >> 16, arg0 >> 16);
								arg1 += local24;
								arg4 += this.anInt8799;
								arg0 += local41;
							}
						}
						Static374.method4083(arg4, this.aByteArray81, arg2 >> 16, arg0 >> 16);
						arg4 += this.anInt8799;
						arg2 += local7;
						arg0 += local41;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt8799 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static374.method4083(arg4, this.aByteArray81, arg0 >> 16, arg1 >> 16);
								arg1 += local24;
								arg0 += local41;
								arg4 += this.anInt8799;
							}
						}
						Static374.method4083(arg4, this.aByteArray81, arg0 >> 16, arg2 >> 16);
						arg0 += local41;
						arg4 += this.anInt8799;
						arg2 += local7;
					}
				}
			}
		} else if (arg5 >= arg3) {
			if (arg4 <= arg5) {
				arg0 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local24 * arg3;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local41;
					arg4 = 0;
				}
				if (local7 >= local24) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt8799 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static374.method4083(arg3, this.aByteArray81, arg1 >> 16, arg2 >> 16);
								arg1 += local24;
								arg3 += this.anInt8799;
								arg2 += local41;
							}
						}
						Static374.method4083(arg3, this.aByteArray81, arg1 >> 16, arg0 >> 16);
						arg0 += local7;
						arg3 += this.anInt8799;
						arg1 += local24;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt8799;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static374.method4083(arg3, this.aByteArray81, arg2 >> 16, arg1 >> 16);
								arg1 += local24;
								arg3 += this.anInt8799;
								arg2 += local41;
							}
						}
						Static374.method4083(arg3, this.aByteArray81, arg0 >> 16, arg1 >> 16);
						arg1 += local24;
						arg3 += this.anInt8799;
						arg0 += local7;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local7 * arg3;
					arg1 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg0 -= local41 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg3 || local24 <= local7) && (arg5 != arg3 || local41 >= local7)) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt8799 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static374.method4083(arg3, this.aByteArray81, arg0 >> 16, arg2 >> 16);
								arg0 += local41;
								arg3 += this.anInt8799;
								arg2 += local7;
							}
						}
						Static374.method4083(arg3, this.aByteArray81, arg1 >> 16, arg2 >> 16);
						arg3 += this.anInt8799;
						arg1 += local24;
						arg2 += local7;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt8799 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static374.method4083(arg3, this.aByteArray81, arg2 >> 16, arg0 >> 16);
								arg2 += local7;
								arg3 += this.anInt8799;
								arg0 += local41;
							}
						}
						Static374.method4083(arg3, this.aByteArray81, arg2 >> 16, arg1 >> 16);
						arg2 += local7;
						arg3 += this.anInt8799;
						arg1 += local24;
					}
				}
			}
		} else if (arg4 < arg3) {
			arg1 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local24 * arg5;
				arg0 -= local41 * arg5;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local7 * arg4;
				arg4 = 0;
			}
			if (local24 >= local41) {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt8799 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static374.method4083(arg5, this.aByteArray81, arg2 >> 16, arg1 >> 16);
							arg2 += local7;
							arg5 += this.anInt8799;
							arg1 += local24;
						}
					}
					Static374.method4083(arg5, this.aByteArray81, arg0 >> 16, arg1 >> 16);
					arg1 += local24;
					arg0 += local41;
					arg5 += this.anInt8799;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt8799;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static374.method4083(arg5, this.aByteArray81, arg1 >> 16, arg2 >> 16);
							arg2 += local7;
							arg1 += local24;
							arg5 += this.anInt8799;
						}
					}
					Static374.method4083(arg5, this.aByteArray81, arg1 >> 16, arg0 >> 16);
					arg1 += local24;
					arg5 += this.anInt8799;
					arg0 += local41;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local41;
				arg2 -= local24 * arg5;
				arg5 = 0;
			}
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local7 * arg3;
				arg3 = 0;
			}
			if (local41 <= local24) {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt8799;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static374.method4083(arg5, this.aByteArray81, arg0 >> 16, arg1 >> 16);
							arg5 += this.anInt8799;
							arg1 += local7;
							arg0 += local41;
						}
					}
					Static374.method4083(arg5, this.aByteArray81, arg0 >> 16, arg2 >> 16);
					arg0 += local41;
					arg5 += this.anInt8799;
					arg2 += local24;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt8799 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static374.method4083(arg5, this.aByteArray81, arg1 >> 16, arg0 >> 16);
							arg5 += this.anInt8799;
							arg0 += local41;
							arg1 += local7;
						}
					}
					Static374.method4083(arg5, this.aByteArray81, arg2 >> 16, arg0 >> 16);
					arg2 += local24;
					arg5 += this.anInt8799;
					arg0 += local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
	public void method7269() {
		@Pc(10) int local10 = -1;
		@Pc(16) int local16 = this.aByteArray81.length - 8;
		while (local16 > local10) {
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
			local10++;
			this.aByteArray81[local10] = 0;
		}
		while (local10 < this.aByteArray81.length - 1) {
			local10++;
			this.aByteArray81[local10] = 0;
		}
	}
}
