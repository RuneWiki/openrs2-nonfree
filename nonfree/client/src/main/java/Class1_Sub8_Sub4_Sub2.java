import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub8_Sub4_Sub2 extends Class1_Sub8_Sub4 {

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	public int anInt9482;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	public int anInt9483;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	public int anInt9484;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt9485;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "[B")
	public final byte[] aByteArray101;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class1_Sub8_Sub4_Sub2(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray101 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	public void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9485 = arg3;
		this.anInt9482 = arg0;
		this.anInt9483 = arg2 - arg0;
		this.anInt9484 = arg1 - arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)Z")
	public boolean method7718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray101.length;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBIII)V")
	public void method7720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg1) {
			local7 = (arg2 - arg5 << 16) / (arg1 - arg4);
		}
		@Pc(23) int local23 = 0;
		if (arg1 != arg0) {
			local23 = (arg3 - arg2 << 16) / (arg0 - arg1);
		}
		@Pc(39) int local39 = 0;
		if (arg4 != arg0) {
			local39 = (arg5 - arg3 << 16) / (arg4 - arg0);
		}
		if (arg1 >= arg4 && arg0 >= arg4) {
			if (arg1 < arg0) {
				arg3 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local39;
					arg5 -= arg4 * local7;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local23 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg4 && local7 > local39 || arg4 == arg1 && local23 < local39) {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt9484 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static148.method2488(arg2 >> 16, arg3 >> 16, arg4, this.aByteArray101);
								arg4 += this.anInt9484;
								arg3 += local39;
								arg2 += local23;
							}
						}
						Static148.method2488(arg5 >> 16, arg3 >> 16, arg4, this.aByteArray101);
						arg3 += local39;
						arg4 += this.anInt9484;
						arg5 += local7;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt9484 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static148.method2488(arg3 >> 16, arg2 >> 16, arg4, this.aByteArray101);
								arg2 += local23;
								arg3 += local39;
								arg4 += this.anInt9484;
							}
						}
						Static148.method2488(arg3 >> 16, arg5 >> 16, arg4, this.aByteArray101);
						arg3 += local39;
						arg4 += this.anInt9484;
						arg5 += local7;
					}
				}
			} else {
				arg2 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local39 * arg4;
					arg5 -= arg4 * local7;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg3 -= local23 * arg0;
					arg0 = 0;
				}
				if ((arg4 == arg0 || local39 >= local7) && (arg4 != arg0 || local23 <= local7)) {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt9484 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static148.method2488(arg3 >> 16, arg5 >> 16, arg4, this.aByteArray101);
								arg4 += this.anInt9484;
								arg3 += local23;
								arg5 += local7;
							}
						}
						Static148.method2488(arg2 >> 16, arg5 >> 16, arg4, this.aByteArray101);
						arg4 += this.anInt9484;
						arg5 += local7;
						arg2 += local39;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt9484 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static148.method2488(arg5 >> 16, arg3 >> 16, arg4, this.aByteArray101);
								arg5 += local7;
								arg4 += this.anInt9484;
								arg3 += local23;
							}
						}
						Static148.method2488(arg5 >> 16, arg2 >> 16, arg4, this.aByteArray101);
						arg2 += local39;
						arg5 += local7;
						arg4 += this.anInt9484;
					}
				}
			}
		} else if (arg0 >= arg1) {
			if (arg0 < arg4) {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local7 * arg1;
					arg2 -= local23 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg3 -= arg0 * local39;
					arg0 = 0;
				}
				if (arg0 != arg1 && local7 < local23 || arg0 == arg1 && local7 > local39) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt9484;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static148.method2488(arg3 >> 16, arg5 >> 16, arg1, this.aByteArray101);
								arg1 += this.anInt9484;
								arg3 += local39;
								arg5 += local7;
							}
						}
						Static148.method2488(arg2 >> 16, arg5 >> 16, arg1, this.aByteArray101);
						arg1 += this.anInt9484;
						arg2 += local23;
						arg5 += local7;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt9484 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static148.method2488(arg5 >> 16, arg3 >> 16, arg1, this.aByteArray101);
								arg1 += this.anInt9484;
								arg5 += local7;
								arg3 += local39;
							}
						}
						Static148.method2488(arg5 >> 16, arg2 >> 16, arg1, this.aByteArray101);
						arg1 += this.anInt9484;
						arg2 += local23;
						arg5 += local7;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local23 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg5 -= local39 * arg4;
					arg4 = 0;
				}
				if (local23 <= local7) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt9484;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static148.method2488(arg5 >> 16, arg2 >> 16, arg1, this.aByteArray101);
								arg1 += this.anInt9484;
								arg2 += local23;
								arg5 += local39;
							}
						}
						Static148.method2488(arg3 >> 16, arg2 >> 16, arg1, this.aByteArray101);
						arg1 += this.anInt9484;
						arg2 += local23;
						arg3 += local7;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt9484;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static148.method2488(arg2 >> 16, arg5 >> 16, arg1, this.aByteArray101);
								arg1 += this.anInt9484;
								arg2 += local23;
								arg5 += local39;
							}
						}
						Static148.method2488(arg2 >> 16, arg3 >> 16, arg1, this.aByteArray101);
						arg1 += this.anInt9484;
						arg2 += local23;
						arg3 += local7;
					}
				}
			}
		} else if (arg4 < arg1) {
			arg2 = arg3 <<= 0x10;
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local23 * arg0;
				arg3 -= arg0 * local39;
				arg0 = 0;
			}
			if (arg4 < 0) {
				arg5 -= local7 * arg4;
				arg4 = 0;
			}
			if (local23 >= local39) {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt9484 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static148.method2488(arg2 >> 16, arg5 >> 16, arg0, this.aByteArray101);
							arg0 += this.anInt9484;
							arg2 += local23;
							arg5 += local7;
						}
					}
					Static148.method2488(arg2 >> 16, arg3 >> 16, arg0, this.aByteArray101);
					arg2 += local23;
					arg3 += local39;
					arg0 += this.anInt9484;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt9484;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static148.method2488(arg5 >> 16, arg2 >> 16, arg0, this.aByteArray101);
							arg5 += local7;
							arg0 += this.anInt9484;
							arg2 += local23;
						}
					}
					Static148.method2488(arg3 >> 16, arg2 >> 16, arg0, this.aByteArray101);
					arg3 += local39;
					arg0 += this.anInt9484;
					arg2 += local23;
				}
			}
		} else {
			arg5 = arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local39;
				arg5 -= local23 * arg0;
				arg0 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local7 * arg1;
				arg1 = 0;
			}
			if (local39 <= local23) {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt9484;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static148.method2488(arg2 >> 16, arg3 >> 16, arg0, this.aByteArray101);
							arg0 += this.anInt9484;
							arg2 += local7;
							arg3 += local39;
						}
					}
					Static148.method2488(arg5 >> 16, arg3 >> 16, arg0, this.aByteArray101);
					arg0 += this.anInt9484;
					arg5 += local23;
					arg3 += local39;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt9484;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static148.method2488(arg3 >> 16, arg2 >> 16, arg0, this.aByteArray101);
							arg3 += local39;
							arg2 += local7;
							arg0 += this.anInt9484;
						}
					}
					Static148.method2488(arg3 >> 16, arg5 >> 16, arg0, this.aByteArray101);
					arg3 += local39;
					arg5 += local23;
					arg0 += this.anInt9484;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public void method7723() {
		@Pc(7) int local7 = -1;
		@Pc(21) int local21 = this.aByteArray101.length - 8;
		while (local7 < local21) {
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
		}
		while (this.aByteArray101.length - 1 > local7) {
			local7++;
			this.aByteArray101[local7] = 0;
		}
	}
}
