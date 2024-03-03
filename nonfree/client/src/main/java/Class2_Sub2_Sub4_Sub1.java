import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class2_Sub2_Sub4_Sub1 extends Class2_Sub2_Sub4 {

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
	public int anInt1301;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
	public int anInt1302;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
	public int anInt1304;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!bf;II)V", line = 532)
	public Class2_Sub2_Sub4_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray14 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZIII)V", line = 4)
	public void method1513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1301 = arg1;
		this.anInt1304 = arg3;
		this.anInt1302 = arg2 - arg3;
		this.anInt1303 = arg0 - arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)V", line = 51)
	public void method1515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg4) {
			local1 = (arg5 - arg0 << 16) / (arg1 - arg4);
		}
		@Pc(18) int local18 = 0;
		if (arg3 != arg1) {
			local18 = (arg2 - arg5 << 16) / (arg3 - arg1);
		}
		@Pc(38) int local38 = 0;
		if (arg3 != arg4) {
			local38 = (arg0 - arg2 << 16) / (arg4 - arg3);
		}
		if (arg4 <= arg1 && arg4 <= arg3) {
			if (arg3 > arg1) {
				arg2 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local1 * arg4;
					arg2 -= arg4 * local38;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local18 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg4 && local1 > local38 || arg4 == arg1 && local38 > local18) {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt1302;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method1514(arg4, this.aByteArray14, arg2 >> 16, arg5 >> 16);
								arg2 += local38;
								arg5 += local18;
								arg4 += this.anInt1302;
							}
						}
						Static371.method1514(arg4, this.aByteArray14, arg2 >> 16, arg0 >> 16);
						arg4 += this.anInt1302;
						arg0 += local1;
						arg2 += local38;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt1302;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method1514(arg4, this.aByteArray14, arg5 >> 16, arg2 >> 16);
								arg5 += local18;
								arg2 += local38;
								arg4 += this.anInt1302;
							}
						}
						Static371.method1514(arg4, this.aByteArray14, arg0 >> 16, arg2 >> 16);
						arg4 += this.anInt1302;
						arg0 += local1;
						arg2 += local38;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local1;
					arg5 -= arg4 * local38;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local18;
					arg3 = 0;
				}
				if (arg3 != arg4 && local1 > local38 || arg4 == arg3 && local1 < local18) {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt1302 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method1514(arg4, this.aByteArray14, arg2 >> 16, arg0 >> 16);
								arg4 += this.anInt1302;
								arg2 += local18;
								arg0 += local1;
							}
						}
						Static371.method1514(arg4, this.aByteArray14, arg5 >> 16, arg0 >> 16);
						arg5 += local38;
						arg4 += this.anInt1302;
						arg0 += local1;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt1302;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method1514(arg4, this.aByteArray14, arg0 >> 16, arg2 >> 16);
								arg0 += local1;
								arg2 += local18;
								arg4 += this.anInt1302;
							}
						}
						Static371.method1514(arg4, this.aByteArray14, arg0 >> 16, arg5 >> 16);
						arg0 += local1;
						arg4 += this.anInt1302;
						arg5 += local38;
					}
				}
			}
		} else if (arg1 <= arg3) {
			if (arg3 >= arg4) {
				arg2 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local1 * arg1;
					arg5 -= local18 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local38;
					arg4 = 0;
				}
				if (local18 > local1) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt1302;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method1514(arg1, this.aByteArray14, arg0 >> 16, arg5 >> 16);
								arg1 += this.anInt1302;
								arg0 += local38;
								arg5 += local18;
							}
						}
						Static371.method1514(arg1, this.aByteArray14, arg2 >> 16, arg5 >> 16);
						arg1 += this.anInt1302;
						arg2 += local1;
						arg5 += local18;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt1302 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method1514(arg1, this.aByteArray14, arg5 >> 16, arg0 >> 16);
								arg5 += local18;
								arg1 += this.anInt1302;
								arg0 += local38;
							}
						}
						Static371.method1514(arg1, this.aByteArray14, arg5 >> 16, arg2 >> 16);
						arg2 += local1;
						arg5 += local18;
						arg1 += this.anInt1302;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local18;
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local38 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg1 || local18 <= local1) && (arg3 != arg1 || local1 <= local38)) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt1302 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static371.method1514(arg1, this.aByteArray14, arg2 >> 16, arg0 >> 16);
								arg2 += local38;
								arg1 += this.anInt1302;
								arg0 += local1;
							}
						}
						Static371.method1514(arg1, this.aByteArray14, arg5 >> 16, arg0 >> 16);
						arg5 += local18;
						arg1 += this.anInt1302;
						arg0 += local1;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt1302;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static371.method1514(arg1, this.aByteArray14, arg0 >> 16, arg2 >> 16);
								arg0 += local1;
								arg1 += this.anInt1302;
								arg2 += local38;
							}
						}
						Static371.method1514(arg1, this.aByteArray14, arg0 >> 16, arg5 >> 16);
						arg0 += local1;
						arg1 += this.anInt1302;
						arg5 += local18;
					}
				}
			}
		} else if (arg1 > arg4) {
			arg5 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local18;
				arg2 -= local38 * arg3;
				arg3 = 0;
			}
			if (arg4 < 0) {
				arg0 -= local1 * arg4;
				arg4 = 0;
			}
			if (local18 < local38) {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt1302 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method1514(arg3, this.aByteArray14, arg5 >> 16, arg0 >> 16);
							arg0 += local1;
							arg3 += this.anInt1302;
							arg5 += local18;
						}
					}
					Static371.method1514(arg3, this.aByteArray14, arg5 >> 16, arg2 >> 16);
					arg3 += this.anInt1302;
					arg5 += local18;
					arg2 += local38;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt1302;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method1514(arg3, this.aByteArray14, arg0 >> 16, arg5 >> 16);
							arg3 += this.anInt1302;
							arg5 += local18;
							arg0 += local1;
						}
					}
					Static371.method1514(arg3, this.aByteArray14, arg2 >> 16, arg5 >> 16);
					arg5 += local18;
					arg3 += this.anInt1302;
					arg2 += local38;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local38 * arg3;
				arg0 -= arg3 * local18;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= local1 * arg1;
				arg1 = 0;
			}
			if (local38 > local18) {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt1302 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static371.method1514(arg3, this.aByteArray14, arg5 >> 16, arg2 >> 16);
							arg5 += local1;
							arg3 += this.anInt1302;
							arg2 += local38;
						}
					}
					Static371.method1514(arg3, this.aByteArray14, arg0 >> 16, arg2 >> 16);
					arg0 += local18;
					arg2 += local38;
					arg3 += this.anInt1302;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt1302;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static371.method1514(arg3, this.aByteArray14, arg2 >> 16, arg5 >> 16);
							arg3 += this.anInt1302;
							arg2 += local38;
							arg5 += local1;
						}
					}
					Static371.method1514(arg3, this.aByteArray14, arg2 >> 16, arg0 >> 16);
					arg0 += local18;
					arg3 += this.anInt1302;
					arg2 += local38;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZ)Z", line = 487)
	public boolean method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray14.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)V", line = 501)
	public void method1517() {
		@Pc(10) int local10 = -1;
		@Pc(16) int local16 = this.aByteArray14.length - 8;
		while (local16 > local10) {
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
			local10++;
			this.aByteArray14[local10] = 0;
		}
		while (this.aByteArray14.length - 1 > local10) {
			local10++;
			this.aByteArray14[local10] = 0;
		}
	}
}
