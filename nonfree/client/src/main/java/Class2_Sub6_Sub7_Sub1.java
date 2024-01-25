import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub6_Sub7_Sub1 extends Class2_Sub6_Sub7 {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public int anInt3509;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "[B")
	public final byte[] aByteArray42;

	static {
		new Class350("", 76);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!wga;II)V")
	public Class2_Sub6_Sub7_Sub1(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray42 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	public void method3202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3508 = arg0 - arg3;
		this.anInt3509 = arg1 - arg2;
		this.anInt3510 = arg3;
		this.anInt3515 = arg2;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
	public void method3203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg0) {
			local7 = (arg2 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg4 != arg3) {
			local24 = (arg5 - arg2 << 16) / (arg4 - arg3);
		}
		@Pc(53) int local53 = 0;
		if (arg0 != arg4) {
			local53 = (arg1 - arg5 << 16) / (arg0 - arg4);
		}
		if (arg3 >= arg0 && arg0 <= arg4) {
			if (arg3 >= arg4) {
				arg2 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local53;
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg5 -= arg4 * local24;
					arg4 = 0;
				}
				if (arg4 != arg0 && local53 < local7 || arg4 == arg0 && local7 < local24) {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt3508 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static231.method4406(arg0, arg5 >> 16, this.aByteArray42, arg1 >> 16);
								arg0 += this.anInt3508;
								arg5 += local24;
								arg1 += local7;
							}
						}
						Static231.method4406(arg0, arg2 >> 16, this.aByteArray42, arg1 >> 16);
						arg0 += this.anInt3508;
						arg1 += local7;
						arg2 += local53;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt3508;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static231.method4406(arg0, arg1 >> 16, this.aByteArray42, arg5 >> 16);
								arg0 += this.anInt3508;
								arg5 += local24;
								arg1 += local7;
							}
						}
						Static231.method4406(arg0, arg1 >> 16, this.aByteArray42, arg2 >> 16);
						arg2 += local53;
						arg1 += local7;
						arg0 += this.anInt3508;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg5 -= local53 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local24;
					arg3 = 0;
				}
				if ((arg3 == arg0 || local7 <= local53) && (arg0 != arg3 || local24 >= local53)) {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt3508 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static231.method4406(arg0, arg2 >> 16, this.aByteArray42, arg5 >> 16);
								arg2 += local24;
								arg0 += this.anInt3508;
								arg5 += local53;
							}
						}
						Static231.method4406(arg0, arg1 >> 16, this.aByteArray42, arg5 >> 16);
						arg5 += local53;
						arg0 += this.anInt3508;
						arg1 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt3508;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static231.method4406(arg0, arg5 >> 16, this.aByteArray42, arg2 >> 16);
								arg0 += this.anInt3508;
								arg5 += local53;
								arg2 += local24;
							}
						}
						Static231.method4406(arg0, arg5 >> 16, this.aByteArray42, arg1 >> 16);
						arg1 += local7;
						arg5 += local53;
						arg0 += this.anInt3508;
					}
				}
			}
		} else if (arg3 <= arg4) {
			if (arg4 >= arg0) {
				arg5 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local24;
					arg5 -= arg3 * local7;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local53;
					arg0 = 0;
				}
				if (local7 < local24) {
					arg4 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3508 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static231.method4406(arg3, arg1 >> 16, this.aByteArray42, arg2 >> 16);
								arg2 += local24;
								arg3 += this.anInt3508;
								arg1 += local53;
							}
						}
						Static231.method4406(arg3, arg5 >> 16, this.aByteArray42, arg2 >> 16);
						arg5 += local7;
						arg3 += this.anInt3508;
						arg2 += local24;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3508 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static231.method4406(arg3, arg2 >> 16, this.aByteArray42, arg1 >> 16);
								arg2 += local24;
								arg1 += local53;
								arg3 += this.anInt3508;
							}
						}
						Static231.method4406(arg3, arg2 >> 16, this.aByteArray42, arg5 >> 16);
						arg3 += this.anInt3508;
						arg2 += local24;
						arg5 += local7;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local24 * arg3;
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local53;
					arg4 = 0;
				}
				if ((arg3 == arg4 || local24 <= local7) && (arg3 != arg4 || local7 <= local53)) {
					arg0 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt3508;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static231.method4406(arg3, arg5 >> 16, this.aByteArray42, arg1 >> 16);
								arg3 += this.anInt3508;
								arg1 += local7;
								arg5 += local53;
							}
						}
						Static231.method4406(arg3, arg2 >> 16, this.aByteArray42, arg1 >> 16);
						arg3 += this.anInt3508;
						arg1 += local7;
						arg2 += local24;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt3508;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static231.method4406(arg3, arg1 >> 16, this.aByteArray42, arg5 >> 16);
								arg3 += this.anInt3508;
								arg5 += local53;
								arg1 += local7;
							}
						}
						Static231.method4406(arg3, arg1 >> 16, this.aByteArray42, arg2 >> 16);
						arg2 += local24;
						arg3 += this.anInt3508;
						arg1 += local7;
					}
				}
			}
		} else if (arg0 < arg3) {
			arg2 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local53 * arg4;
				arg2 -= local24 * arg4;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg1 -= local7 * arg0;
				arg0 = 0;
			}
			if (local24 < local53) {
				arg3 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt3508;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static231.method4406(arg4, arg2 >> 16, this.aByteArray42, arg1 >> 16);
							arg1 += local7;
							arg4 += this.anInt3508;
							arg2 += local24;
						}
					}
					Static231.method4406(arg4, arg2 >> 16, this.aByteArray42, arg5 >> 16);
					arg4 += this.anInt3508;
					arg2 += local24;
					arg5 += local53;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt3508 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static231.method4406(arg4, arg1 >> 16, this.aByteArray42, arg2 >> 16);
							arg1 += local7;
							arg4 += this.anInt3508;
							arg2 += local24;
						}
					}
					Static231.method4406(arg4, arg5 >> 16, this.aByteArray42, arg2 >> 16);
					arg2 += local24;
					arg4 += this.anInt3508;
					arg5 += local53;
				}
			}
		} else {
			arg1 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local53 * arg4;
				arg1 -= arg4 * local24;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local7 * arg3;
				arg3 = 0;
			}
			if (local53 <= local24) {
				arg0 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt3508 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static231.method4406(arg4, arg5 >> 16, this.aByteArray42, arg2 >> 16);
							arg2 += local7;
							arg5 += local53;
							arg4 += this.anInt3508;
						}
					}
					Static231.method4406(arg4, arg5 >> 16, this.aByteArray42, arg1 >> 16);
					arg4 += this.anInt3508;
					arg1 += local24;
					arg5 += local53;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt3508 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static231.method4406(arg4, arg2 >> 16, this.aByteArray42, arg5 >> 16);
							arg5 += local53;
							arg4 += this.anInt3508;
							arg2 += local7;
						}
					}
					Static231.method4406(arg4, arg1 >> 16, this.aByteArray42, arg5 >> 16);
					arg1 += local24;
					arg5 += local53;
					arg4 += this.anInt3508;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public void method3205() {
		@Pc(17) int local17 = -1;
		@Pc(23) int local23 = this.aByteArray42.length - 8;
		while (local23 > local17) {
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
			local17++;
			this.aByteArray42[local17] = 0;
		}
		while (local17 < this.aByteArray42.length - 1) {
			local17++;
			this.aByteArray42[local17] = 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)Z")
	public boolean method3207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray42.length >= arg1 * arg0;
	}
}
