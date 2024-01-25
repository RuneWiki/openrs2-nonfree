import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class3_Sub7_Sub3_Sub2 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
	public int anInt10300;

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
	public int anInt10302;

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
	public int anInt10303;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
	public int anInt10304;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "[B")
	public final byte[] aByteArray245;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!rr;II)V")
	public Class3_Sub7_Sub3_Sub2(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray245 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BII)Z")
	public boolean method8142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray245.length;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIBI)V")
	public void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg2) {
			local7 = (arg3 - arg0 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg5 != arg2) {
			local31 = (arg4 - arg3 << 16) / (arg5 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg1 != arg5) {
			local48 = (arg0 - arg4 << 16) / (arg1 - arg5);
		}
		if (arg2 >= arg1 && arg5 >= arg1) {
			if (arg2 >= arg5) {
				arg3 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg3 -= local48 * arg1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg4 -= local31 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg1 && local48 < local7 || arg5 == arg1 && local7 < local31) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt10302 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg1, arg0 >> 16, arg4 >> 16);
								arg0 += local7;
								arg1 += this.anInt10302;
								arg4 += local31;
							}
						}
						Static136.method2655(this.aByteArray245, arg1, arg0 >> 16, arg3 >> 16);
						arg0 += local7;
						arg1 += this.anInt10302;
						arg3 += local48;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt10302 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg1, arg4 >> 16, arg0 >> 16);
								arg0 += local7;
								arg1 += this.anInt10302;
								arg4 += local31;
							}
						}
						Static136.method2655(this.aByteArray245, arg1, arg3 >> 16, arg0 >> 16);
						arg0 += local7;
						arg3 += local48;
						arg1 += this.anInt10302;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg0 -= local7 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local31;
					arg2 = 0;
				}
				if ((arg2 == arg1 || local7 <= local48) && (arg1 != arg2 || local31 >= local48)) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt10302 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg1, arg4 >> 16, arg3 >> 16);
								arg4 += local48;
								arg1 += this.anInt10302;
								arg3 += local31;
							}
						}
						Static136.method2655(this.aByteArray245, arg1, arg4 >> 16, arg0 >> 16);
						arg4 += local48;
						arg0 += local7;
						arg1 += this.anInt10302;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt10302;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg1, arg3 >> 16, arg4 >> 16);
								arg4 += local48;
								arg3 += local31;
								arg1 += this.anInt10302;
							}
						}
						Static136.method2655(this.aByteArray245, arg1, arg0 >> 16, arg4 >> 16);
						arg0 += local7;
						arg4 += local48;
						arg1 += this.anInt10302;
					}
				}
			}
		} else if (arg5 < arg2) {
			if (arg2 > arg1) {
				arg3 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local31 * arg5;
					arg4 -= local48 * arg5;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg1 = 0;
				}
				if (local31 < local48) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt10302 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg5, arg0 >> 16, arg3 >> 16);
								arg5 += this.anInt10302;
								arg0 += local7;
								arg3 += local31;
							}
						}
						Static136.method2655(this.aByteArray245, arg5, arg4 >> 16, arg3 >> 16);
						arg3 += local31;
						arg5 += this.anInt10302;
						arg4 += local48;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt10302 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg5, arg3 >> 16, arg0 >> 16);
								arg3 += local31;
								arg0 += local7;
								arg5 += this.anInt10302;
							}
						}
						Static136.method2655(this.aByteArray245, arg5, arg3 >> 16, arg4 >> 16);
						arg5 += this.anInt10302;
						arg4 += local48;
						arg3 += local31;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local48;
					arg0 -= arg5 * local31;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg3 -= local7 * arg2;
					arg2 = 0;
				}
				if (local48 <= local31) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt10302 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg5, arg3 >> 16, arg4 >> 16);
								arg4 += local48;
								arg5 += this.anInt10302;
								arg3 += local7;
							}
						}
						Static136.method2655(this.aByteArray245, arg5, arg0 >> 16, arg4 >> 16);
						arg0 += local31;
						arg5 += this.anInt10302;
						arg4 += local48;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt10302 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static136.method2655(this.aByteArray245, arg5, arg4 >> 16, arg3 >> 16);
								arg3 += local7;
								arg5 += this.anInt10302;
								arg4 += local48;
							}
						}
						Static136.method2655(this.aByteArray245, arg5, arg4 >> 16, arg0 >> 16);
						arg0 += local31;
						arg5 += this.anInt10302;
						arg4 += local48;
					}
				}
			}
		} else if (arg1 > arg5) {
			arg0 = arg3 <<= 0x10;
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local7;
				arg3 -= local31 * arg2;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local48 * arg5;
				arg5 = 0;
			}
			if ((arg2 == arg5 || local31 <= local7) && (arg2 != arg5 || local48 >= local7)) {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt10302;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static136.method2655(this.aByteArray245, arg2, arg0 >> 16, arg4 >> 16);
							arg2 += this.anInt10302;
							arg4 += local48;
							arg0 += local7;
						}
					}
					Static136.method2655(this.aByteArray245, arg2, arg0 >> 16, arg3 >> 16);
					arg3 += local31;
					arg2 += this.anInt10302;
					arg0 += local7;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt10302 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static136.method2655(this.aByteArray245, arg2, arg4 >> 16, arg0 >> 16);
							arg4 += local48;
							arg2 += this.anInt10302;
							arg0 += local7;
						}
					}
					Static136.method2655(this.aByteArray245, arg2, arg3 >> 16, arg0 >> 16);
					arg2 += this.anInt10302;
					arg3 += local31;
					arg0 += local7;
				}
			}
		} else {
			arg4 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local31 * arg2;
				arg4 -= local7 * arg2;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local48;
				arg1 = 0;
			}
			if (local7 < local31) {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt10302;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static136.method2655(this.aByteArray245, arg2, arg3 >> 16, arg0 >> 16);
							arg2 += this.anInt10302;
							arg3 += local31;
							arg0 += local48;
						}
					}
					Static136.method2655(this.aByteArray245, arg2, arg3 >> 16, arg4 >> 16);
					arg2 += this.anInt10302;
					arg4 += local7;
					arg3 += local31;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt10302;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static136.method2655(this.aByteArray245, arg2, arg0 >> 16, arg3 >> 16);
							arg2 += this.anInt10302;
							arg3 += local31;
							arg0 += local48;
						}
					}
					Static136.method2655(this.aByteArray245, arg2, arg4 >> 16, arg3 >> 16);
					arg2 += this.anInt10302;
					arg4 += local7;
					arg3 += local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V")
	public void method8144() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray245.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
			local15++;
			this.aByteArray245[local15] = 0;
		}
		while (local15 < this.aByteArray245.length - 1) {
			local15++;
			this.aByteArray245[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V")
	public void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10300 = arg0 - arg1;
		this.anInt10303 = arg1;
		this.anInt10302 = arg2 - arg3;
		this.anInt10304 = arg3;
	}
}
