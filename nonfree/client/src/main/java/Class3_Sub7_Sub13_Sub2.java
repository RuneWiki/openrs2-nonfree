import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class3_Sub7_Sub13_Sub2 extends Class3_Sub7_Sub13 {

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public int anInt7668;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "I")
	public int anInt7672;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public int anInt7673;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	public int anInt7677;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!mj;II)V")
	public Class3_Sub7_Sub13_Sub2(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray85 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)Z")
	public boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray85.length;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	public void method6387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg0 != arg4) {
			local11 = (arg1 - arg3 << 16) / (arg4 - arg0);
		}
		@Pc(32) int local32 = 0;
		if (arg2 != arg4) {
			local32 = (arg5 - arg1 << 16) / (arg2 - arg4);
		}
		@Pc(49) int local49 = 0;
		if (arg0 != arg2) {
			local49 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg4 >= arg0 && arg2 >= arg0) {
			if (arg4 >= arg2) {
				arg1 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local49;
					arg3 -= arg0 * local11;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local32;
					arg2 = 0;
				}
				if (arg2 != arg0 && local49 < local11 || arg2 == arg0 && local11 < local32) {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7672;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg3 >> 16, arg0, arg5 >> 16);
								arg0 += this.anInt7672;
								arg3 += local11;
								arg5 += local32;
							}
						}
						Static112.method1927(this.aByteArray85, arg3 >> 16, arg0, arg1 >> 16);
						arg3 += local11;
						arg1 += local49;
						arg0 += this.anInt7672;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7672;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg5 >> 16, arg0, arg3 >> 16);
								arg5 += local32;
								arg0 += this.anInt7672;
								arg3 += local11;
							}
						}
						Static112.method1927(this.aByteArray85, arg1 >> 16, arg0, arg3 >> 16);
						arg1 += local49;
						arg3 += local11;
						arg0 += this.anInt7672;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local49 * arg0;
					arg3 -= local11 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local32;
					arg4 = 0;
				}
				if ((arg4 == arg0 || local49 >= local11) && (arg4 != arg0 || local32 >= local49)) {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt7672 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg5 >> 16, arg0, arg1 >> 16);
								arg5 += local49;
								arg0 += this.anInt7672;
								arg1 += local32;
							}
						}
						Static112.method1927(this.aByteArray85, arg5 >> 16, arg0, arg3 >> 16);
						arg3 += local11;
						arg0 += this.anInt7672;
						arg5 += local49;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt7672;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg1 >> 16, arg0, arg5 >> 16);
								arg5 += local49;
								arg1 += local32;
								arg0 += this.anInt7672;
							}
						}
						Static112.method1927(this.aByteArray85, arg3 >> 16, arg0, arg5 >> 16);
						arg5 += local49;
						arg0 += this.anInt7672;
						arg3 += local11;
					}
				}
			}
		} else if (arg4 > arg2) {
			if (arg4 <= arg0) {
				arg3 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local32;
					arg5 -= arg2 * local49;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local11;
					arg4 = 0;
				}
				if (local49 <= local32) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt7672 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg1 >> 16, arg2, arg5 >> 16);
								arg2 += this.anInt7672;
								arg1 += local11;
								arg5 += local49;
							}
						}
						Static112.method1927(this.aByteArray85, arg3 >> 16, arg2, arg5 >> 16);
						arg3 += local32;
						arg5 += local49;
						arg2 += this.anInt7672;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt7672 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg5 >> 16, arg2, arg1 >> 16);
								arg2 += this.anInt7672;
								arg5 += local49;
								arg1 += local11;
							}
						}
						Static112.method1927(this.aByteArray85, arg5 >> 16, arg2, arg3 >> 16);
						arg5 += local49;
						arg2 += this.anInt7672;
						arg3 += local32;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local32;
					arg5 -= local49 * arg2;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg3 -= arg0 * local11;
					arg0 = 0;
				}
				if (local49 > local32) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt7672 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg3 >> 16, arg2, arg1 >> 16);
								arg1 += local32;
								arg3 += local11;
								arg2 += this.anInt7672;
							}
						}
						Static112.method1927(this.aByteArray85, arg5 >> 16, arg2, arg1 >> 16);
						arg5 += local49;
						arg1 += local32;
						arg2 += this.anInt7672;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt7672;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static112.method1927(this.aByteArray85, arg1 >> 16, arg2, arg3 >> 16);
								arg3 += local11;
								arg2 += this.anInt7672;
								arg1 += local32;
							}
						}
						Static112.method1927(this.aByteArray85, arg1 >> 16, arg2, arg5 >> 16);
						arg1 += local32;
						arg2 += this.anInt7672;
						arg5 += local49;
					}
				}
			}
		} else if (arg2 >= arg0) {
			arg5 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local11 * arg4;
				arg1 -= arg4 * local32;
				arg4 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local49 * arg0;
				arg0 = 0;
			}
			if (local11 >= local32) {
				arg2 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt7672;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static112.method1927(this.aByteArray85, arg3 >> 16, arg4, arg1 >> 16);
							arg4 += this.anInt7672;
							arg3 += local49;
							arg1 += local32;
						}
					}
					Static112.method1927(this.aByteArray85, arg5 >> 16, arg4, arg1 >> 16);
					arg5 += local11;
					arg4 += this.anInt7672;
					arg1 += local32;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt7672;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static112.method1927(this.aByteArray85, arg1 >> 16, arg4, arg3 >> 16);
							arg1 += local32;
							arg4 += this.anInt7672;
							arg3 += local49;
						}
					}
					Static112.method1927(this.aByteArray85, arg1 >> 16, arg4, arg5 >> 16);
					arg1 += local32;
					arg4 += this.anInt7672;
					arg5 += local11;
				}
			}
		} else {
			arg3 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local32;
				arg3 -= local11 * arg4;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local49 * arg2;
				arg2 = 0;
			}
			if (arg4 != arg2 && local32 > local11 || arg2 == arg4 && local11 > local49) {
				arg0 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt7672 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static112.method1927(this.aByteArray85, arg5 >> 16, arg4, arg3 >> 16);
							arg5 += local49;
							arg4 += this.anInt7672;
							arg3 += local11;
						}
					}
					Static112.method1927(this.aByteArray85, arg1 >> 16, arg4, arg3 >> 16);
					arg4 += this.anInt7672;
					arg3 += local11;
					arg1 += local32;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt7672;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static112.method1927(this.aByteArray85, arg3 >> 16, arg4, arg5 >> 16);
							arg4 += this.anInt7672;
							arg3 += local11;
							arg5 += local49;
						}
					}
					Static112.method1927(this.aByteArray85, arg3 >> 16, arg4, arg1 >> 16);
					arg1 += local32;
					arg4 += this.anInt7672;
					arg3 += local11;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)V")
	public void method6389() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray85.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
		}
		while (this.aByteArray85.length - 1 > local12) {
			local12++;
			this.aByteArray85[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public void method6391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7668 = arg1;
		this.anInt7672 = arg0 - arg2;
		this.anInt7677 = arg2;
		this.anInt7673 = arg3 - arg1;
	}
}
