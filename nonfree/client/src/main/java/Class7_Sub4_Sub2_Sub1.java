import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class7_Sub4_Sub2_Sub1 extends Class7_Sub4_Sub2 {

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "[B")
	public final byte[] aByteArray15;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!vd;II)V")
	public Class7_Sub4_Sub2_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray15 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
	public void method1373() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray15.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
			local15++;
			this.aByteArray15[local15] = 0;
		}
		while (local15 < this.aByteArray15.length - 1) {
			local15++;
			this.aByteArray15[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z")
	public boolean method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray15.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIZ)V")
	public void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg1 != arg4) {
			local11 = (arg2 - arg3 << 16) / (arg1 - arg4);
		}
		@Pc(32) int local32 = 0;
		if (arg0 != arg1) {
			local32 = (arg5 - arg2 << 16) / (arg0 - arg1);
		}
		@Pc(53) int local53 = 0;
		if (arg0 != arg4) {
			local53 = (arg3 - arg5 << 16) / (arg4 - arg0);
		}
		if (arg1 >= arg4 && arg0 >= arg4) {
			if (arg0 > arg1) {
				arg5 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local53;
					arg3 -= arg4 * local11;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local32;
					arg1 = 0;
				}
				if (arg1 != arg4 && local11 > local53 || arg4 == arg1 && local53 > local32) {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt1584;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method2958(arg2 >> 16, arg5 >> 16, this.aByteArray15, arg4);
								arg2 += local32;
								arg5 += local53;
								arg4 += this.anInt1584;
							}
						}
						Static205.method2958(arg3 >> 16, arg5 >> 16, this.aByteArray15, arg4);
						arg5 += local53;
						arg4 += this.anInt1584;
						arg3 += local11;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt1584;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method2958(arg5 >> 16, arg2 >> 16, this.aByteArray15, arg4);
								arg4 += this.anInt1584;
								arg5 += local53;
								arg2 += local32;
							}
						}
						Static205.method2958(arg5 >> 16, arg3 >> 16, this.aByteArray15, arg4);
						arg5 += local53;
						arg3 += local11;
						arg4 += this.anInt1584;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local53 * arg4;
					arg3 -= local11 * arg4;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local32;
					arg0 = 0;
				}
				if ((arg4 == arg0 || local53 >= local11) && (arg0 != arg4 || local11 >= local32)) {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt1584;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method2958(arg5 >> 16, arg3 >> 16, this.aByteArray15, arg4);
								arg3 += local11;
								arg4 += this.anInt1584;
								arg5 += local32;
							}
						}
						Static205.method2958(arg2 >> 16, arg3 >> 16, this.aByteArray15, arg4);
						arg4 += this.anInt1584;
						arg3 += local11;
						arg2 += local53;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt1584;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method2958(arg3 >> 16, arg5 >> 16, this.aByteArray15, arg4);
								arg3 += local11;
								arg5 += local32;
								arg4 += this.anInt1584;
							}
						}
						Static205.method2958(arg3 >> 16, arg2 >> 16, this.aByteArray15, arg4);
						arg4 += this.anInt1584;
						arg3 += local11;
						arg2 += local53;
					}
				}
			}
		} else if (arg1 <= arg0) {
			if (arg0 >= arg4) {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local11;
					arg2 -= local32 * arg1;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg3 -= local53 * arg4;
					arg4 = 0;
				}
				if (local32 > local11) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt1584;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method2958(arg2 >> 16, arg3 >> 16, this.aByteArray15, arg1);
								arg1 += this.anInt1584;
								arg2 += local32;
								arg3 += local53;
							}
						}
						Static205.method2958(arg2 >> 16, arg5 >> 16, this.aByteArray15, arg1);
						arg5 += local11;
						arg1 += this.anInt1584;
						arg2 += local32;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt1584 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method2958(arg3 >> 16, arg2 >> 16, this.aByteArray15, arg1);
								arg2 += local32;
								arg1 += this.anInt1584;
								arg3 += local53;
							}
						}
						Static205.method2958(arg5 >> 16, arg2 >> 16, this.aByteArray15, arg1);
						arg1 += this.anInt1584;
						arg5 += local11;
						arg2 += local32;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local11 * arg1;
					arg2 -= local32 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local53;
					arg0 = 0;
				}
				if ((arg1 == arg0 || local32 <= local11) && (arg0 != arg1 || local11 <= local53)) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt1584;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static205.method2958(arg3 >> 16, arg5 >> 16, this.aByteArray15, arg1);
								arg3 += local11;
								arg5 += local53;
								arg1 += this.anInt1584;
							}
						}
						Static205.method2958(arg3 >> 16, arg2 >> 16, this.aByteArray15, arg1);
						arg2 += local32;
						arg1 += this.anInt1584;
						arg3 += local11;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt1584;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static205.method2958(arg5 >> 16, arg3 >> 16, this.aByteArray15, arg1);
								arg5 += local53;
								arg3 += local11;
								arg1 += this.anInt1584;
							}
						}
						Static205.method2958(arg2 >> 16, arg3 >> 16, this.aByteArray15, arg1);
						arg2 += local32;
						arg3 += local11;
						arg1 += this.anInt1584;
					}
				}
			}
		} else if (arg1 <= arg4) {
			arg3 = arg5 <<= 0x10;
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local32 * arg0;
				arg5 -= arg0 * local53;
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg2 -= arg1 * local11;
				arg1 = 0;
			}
			if (local32 < local53) {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt1584;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static205.method2958(arg5 >> 16, arg2 >> 16, this.aByteArray15, arg0);
							arg0 += this.anInt1584;
							arg5 += local53;
							arg2 += local11;
						}
					}
					Static205.method2958(arg5 >> 16, arg3 >> 16, this.aByteArray15, arg0);
					arg3 += local32;
					arg5 += local53;
					arg0 += this.anInt1584;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt1584;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static205.method2958(arg2 >> 16, arg5 >> 16, this.aByteArray15, arg0);
							arg0 += this.anInt1584;
							arg5 += local53;
							arg2 += local11;
						}
					}
					Static205.method2958(arg3 >> 16, arg5 >> 16, this.aByteArray15, arg0);
					arg0 += this.anInt1584;
					arg3 += local32;
					arg5 += local53;
				}
			}
		} else {
			arg2 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local32 * arg0;
				arg5 -= arg0 * local53;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= local11 * arg4;
				arg4 = 0;
			}
			if (local53 <= local32) {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt1584;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static205.method2958(arg2 >> 16, arg3 >> 16, this.aByteArray15, arg0);
							arg0 += this.anInt1584;
							arg2 += local32;
							arg3 += local11;
						}
					}
					Static205.method2958(arg2 >> 16, arg5 >> 16, this.aByteArray15, arg0);
					arg2 += local32;
					arg0 += this.anInt1584;
					arg5 += local53;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt1584;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static205.method2958(arg3 >> 16, arg2 >> 16, this.aByteArray15, arg0);
							arg0 += this.anInt1584;
							arg2 += local32;
							arg3 += local11;
						}
					}
					Static205.method2958(arg5 >> 16, arg2 >> 16, this.aByteArray15, arg0);
					arg0 += this.anInt1584;
					arg5 += local53;
					arg2 += local32;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIII)V")
	public void method1377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1583 = arg1 - arg0;
		this.anInt1584 = arg3 - arg2;
		this.anInt1588 = arg0;
		this.anInt1585 = arg2;
	}
}
