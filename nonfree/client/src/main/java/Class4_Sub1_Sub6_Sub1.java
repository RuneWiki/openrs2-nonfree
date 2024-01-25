import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class4_Sub1_Sub6_Sub1 extends Class4_Sub1_Sub6 {

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
	public int anInt1727;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!bt;II)V")
	public Class4_Sub1_Sub6_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray20 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)Z")
	public boolean method1548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray20.length;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	public void method1549() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray20.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
			local7++;
			this.aByteArray20[local7] = 0;
		}
		while (local7 < this.aByteArray20.length - 1) {
			local7++;
			this.aByteArray20[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V")
	public void method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1727 = arg3 - arg1;
		this.anInt1719 = arg2 - arg0;
		this.anInt1717 = arg0;
		this.anInt1723 = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIIIIII)V")
	public void method1553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg3) {
			local7 = (arg2 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg4) {
			local27 = (arg5 - arg2 << 16) / (arg4 - arg3);
		}
		@Pc(57) int local57 = 0;
		if (arg0 != arg4) {
			local57 = (arg1 - arg5 << 16) / (arg0 - arg4);
		}
		if (arg3 >= arg0 && arg0 <= arg4) {
			if (arg4 > arg3) {
				arg5 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local57;
					arg1 -= arg0 * local7;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local27 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local57 || arg3 == arg0 && local27 < local57) {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt1719;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static47.method1023(arg5 >> 16, arg2 >> 16, this.aByteArray20, arg0);
								arg2 += local27;
								arg0 += this.anInt1719;
								arg5 += local57;
							}
						}
						Static47.method1023(arg5 >> 16, arg1 >> 16, this.aByteArray20, arg0);
						arg1 += local7;
						arg0 += this.anInt1719;
						arg5 += local57;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt1719;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static47.method1023(arg2 >> 16, arg5 >> 16, this.aByteArray20, arg0);
								arg5 += local57;
								arg2 += local27;
								arg0 += this.anInt1719;
							}
						}
						Static47.method1023(arg1 >> 16, arg5 >> 16, this.aByteArray20, arg0);
						arg5 += local57;
						arg0 += this.anInt1719;
						arg1 += local7;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local57 * arg0;
					arg1 -= arg0 * local7;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local27;
					arg4 = 0;
				}
				if ((arg0 == arg4 || local57 >= local7) && (arg0 != arg4 || local27 <= local7)) {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt1719 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static47.method1023(arg1 >> 16, arg5 >> 16, this.aByteArray20, arg0);
								arg1 += local7;
								arg0 += this.anInt1719;
								arg5 += local27;
							}
						}
						Static47.method1023(arg1 >> 16, arg2 >> 16, this.aByteArray20, arg0);
						arg1 += local7;
						arg2 += local57;
						arg0 += this.anInt1719;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt1719 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static47.method1023(arg5 >> 16, arg1 >> 16, this.aByteArray20, arg0);
								arg5 += local27;
								arg0 += this.anInt1719;
								arg1 += local7;
							}
						}
						Static47.method1023(arg2 >> 16, arg1 >> 16, this.aByteArray20, arg0);
						arg0 += this.anInt1719;
						arg2 += local57;
						arg1 += local7;
					}
				}
			}
		} else if (arg4 < arg3) {
			if (arg0 < arg3) {
				arg2 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local57 * arg4;
					arg2 -= local27 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (local27 < local57) {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt1719 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static47.method1023(arg2 >> 16, arg1 >> 16, this.aByteArray20, arg4);
								arg1 += local7;
								arg4 += this.anInt1719;
								arg2 += local27;
							}
						}
						Static47.method1023(arg2 >> 16, arg5 >> 16, this.aByteArray20, arg4);
						arg2 += local27;
						arg5 += local57;
						arg4 += this.anInt1719;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt1719;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static47.method1023(arg1 >> 16, arg2 >> 16, this.aByteArray20, arg4);
								arg4 += this.anInt1719;
								arg1 += local7;
								arg2 += local27;
							}
						}
						Static47.method1023(arg5 >> 16, arg2 >> 16, this.aByteArray20, arg4);
						arg5 += local57;
						arg4 += this.anInt1719;
						arg2 += local27;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local27;
					arg5 -= local57 * arg4;
					arg4 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local7 * arg3;
					arg3 = 0;
				}
				if (local27 >= local57) {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt1719;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static47.method1023(arg5 >> 16, arg2 >> 16, this.aByteArray20, arg4);
								arg4 += this.anInt1719;
								arg5 += local57;
								arg2 += local7;
							}
						}
						Static47.method1023(arg5 >> 16, arg1 >> 16, this.aByteArray20, arg4);
						arg5 += local57;
						arg4 += this.anInt1719;
						arg1 += local27;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt1719;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static47.method1023(arg2 >> 16, arg5 >> 16, this.aByteArray20, arg4);
								arg5 += local57;
								arg4 += this.anInt1719;
								arg2 += local7;
							}
						}
						Static47.method1023(arg1 >> 16, arg5 >> 16, this.aByteArray20, arg4);
						arg1 += local27;
						arg4 += this.anInt1719;
						arg5 += local57;
					}
				}
			}
		} else if (arg4 < arg0) {
			arg1 = arg2 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local7 * arg3;
				arg2 -= local27 * arg3;
				arg3 = 0;
			}
			if (arg4 < 0) {
				arg5 -= arg4 * local57;
				arg4 = 0;
			}
			if ((arg4 == arg3 || local27 <= local7) && (arg4 != arg3 || local57 >= local7)) {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt1719;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static47.method1023(arg5 >> 16, arg1 >> 16, this.aByteArray20, arg3);
							arg5 += local57;
							arg1 += local7;
							arg3 += this.anInt1719;
						}
					}
					Static47.method1023(arg2 >> 16, arg1 >> 16, this.aByteArray20, arg3);
					arg2 += local27;
					arg3 += this.anInt1719;
					arg1 += local7;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt1719 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static47.method1023(arg1 >> 16, arg5 >> 16, this.aByteArray20, arg3);
							arg1 += local7;
							arg3 += this.anInt1719;
							arg5 += local57;
						}
					}
					Static47.method1023(arg1 >> 16, arg2 >> 16, this.aByteArray20, arg3);
					arg3 += this.anInt1719;
					arg2 += local27;
					arg1 += local7;
				}
			}
		} else {
			arg5 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local27 * arg3;
				arg5 -= local7 * arg3;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg1 -= arg0 * local57;
				arg0 = 0;
			}
			if (local7 < local27) {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt1719 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static47.method1023(arg1 >> 16, arg2 >> 16, this.aByteArray20, arg3);
							arg1 += local57;
							arg2 += local27;
							arg3 += this.anInt1719;
						}
					}
					Static47.method1023(arg5 >> 16, arg2 >> 16, this.aByteArray20, arg3);
					arg2 += local27;
					arg5 += local7;
					arg3 += this.anInt1719;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt1719;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static47.method1023(arg2 >> 16, arg1 >> 16, this.aByteArray20, arg3);
							arg1 += local57;
							arg3 += this.anInt1719;
							arg2 += local27;
						}
					}
					Static47.method1023(arg2 >> 16, arg5 >> 16, this.aByteArray20, arg3);
					arg5 += local7;
					arg3 += this.anInt1719;
					arg2 += local27;
				}
			}
		}
	}
}
