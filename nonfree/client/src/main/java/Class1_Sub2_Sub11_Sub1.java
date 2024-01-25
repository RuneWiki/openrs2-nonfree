import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class1_Sub2_Sub11_Sub1 extends Class1_Sub2_Sub11 {

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
	public int anInt4914;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	public int anInt4921;

	@OriginalMember(owner = "client!nu", name = "K", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!ht;II)V")
	public Class1_Sub2_Sub11_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray61 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIZIIII)V")
	public void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg1) {
			local7 = (arg4 - arg3 << 16) / (arg2 - arg1);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg5) {
			local28 = (arg0 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg1 != arg5) {
			local48 = (arg3 - arg0 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg2 && arg1 <= arg5) {
			if (arg2 < arg5) {
				arg0 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local7;
					arg0 -= arg1 * local48;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg2 = 0;
				}
				if (arg1 != arg2 && local7 > local48 || arg1 == arg2 && local28 < local48) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt4918;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static124.method1858(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray61);
								arg0 += local48;
								arg4 += local28;
								arg1 += this.anInt4918;
							}
						}
						Static124.method1858(arg3 >> 16, arg0 >> 16, arg1, this.aByteArray61);
						arg1 += this.anInt4918;
						arg0 += local48;
						arg3 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt4918 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static124.method1858(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray61);
								arg1 += this.anInt4918;
								arg0 += local48;
								arg4 += local28;
							}
						}
						Static124.method1858(arg0 >> 16, arg3 >> 16, arg1, this.aByteArray61);
						arg1 += this.anInt4918;
						arg0 += local48;
						arg3 += local7;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local28 * arg5;
					arg5 = 0;
				}
				if ((arg1 == arg5 || local48 >= local7) && (arg5 != arg1 || local28 <= local7)) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt4918;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static124.method1858(arg0 >> 16, arg3 >> 16, arg1, this.aByteArray61);
								arg0 += local28;
								arg1 += this.anInt4918;
								arg3 += local7;
							}
						}
						Static124.method1858(arg4 >> 16, arg3 >> 16, arg1, this.aByteArray61);
						arg4 += local48;
						arg1 += this.anInt4918;
						arg3 += local7;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt4918;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static124.method1858(arg3 >> 16, arg0 >> 16, arg1, this.aByteArray61);
								arg0 += local28;
								arg1 += this.anInt4918;
								arg3 += local7;
							}
						}
						Static124.method1858(arg3 >> 16, arg4 >> 16, arg1, this.aByteArray61);
						arg4 += local48;
						arg1 += this.anInt4918;
						arg3 += local7;
					}
				}
			}
		} else if (arg5 >= arg2) {
			if (arg1 <= arg5) {
				arg0 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg0 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local48;
					arg1 = 0;
				}
				if (local28 > local7) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt4918;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static124.method1858(arg4 >> 16, arg3 >> 16, arg2, this.aByteArray61);
								arg4 += local28;
								arg2 += this.anInt4918;
								arg3 += local48;
							}
						}
						Static124.method1858(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray61);
						arg4 += local28;
						arg0 += local7;
						arg2 += this.anInt4918;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt4918 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static124.method1858(arg3 >> 16, arg4 >> 16, arg2, this.aByteArray61);
								arg3 += local48;
								arg4 += local28;
								arg2 += this.anInt4918;
							}
						}
						Static124.method1858(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray61);
						arg2 += this.anInt4918;
						arg0 += local7;
						arg4 += local28;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg3 -= arg2 * local7;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local48;
					arg5 = 0;
				}
				if ((arg5 == arg2 || local28 <= local7) && (arg5 != arg2 || local48 >= local7)) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt4918 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static124.method1858(arg3 >> 16, arg0 >> 16, arg2, this.aByteArray61);
								arg3 += local7;
								arg0 += local48;
								arg2 += this.anInt4918;
							}
						}
						Static124.method1858(arg3 >> 16, arg4 >> 16, arg2, this.aByteArray61);
						arg2 += this.anInt4918;
						arg3 += local7;
						arg4 += local28;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt4918 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static124.method1858(arg0 >> 16, arg3 >> 16, arg2, this.aByteArray61);
								arg0 += local48;
								arg2 += this.anInt4918;
								arg3 += local7;
							}
						}
						Static124.method1858(arg4 >> 16, arg3 >> 16, arg2, this.aByteArray61);
						arg4 += local28;
						arg3 += local7;
						arg2 += this.anInt4918;
					}
				}
			}
		} else if (arg2 <= arg1) {
			arg3 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= local48 * arg5;
				arg3 -= arg5 * local28;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local7;
				arg2 = 0;
			}
			if (local28 < local48) {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt4918;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static124.method1858(arg0 >> 16, arg4 >> 16, arg5, this.aByteArray61);
							arg5 += this.anInt4918;
							arg0 += local48;
							arg4 += local7;
						}
					}
					Static124.method1858(arg0 >> 16, arg3 >> 16, arg5, this.aByteArray61);
					arg5 += this.anInt4918;
					arg0 += local48;
					arg3 += local28;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt4918;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static124.method1858(arg4 >> 16, arg0 >> 16, arg5, this.aByteArray61);
							arg0 += local48;
							arg4 += local7;
							arg5 += this.anInt4918;
						}
					}
					Static124.method1858(arg3 >> 16, arg0 >> 16, arg5, this.aByteArray61);
					arg5 += this.anInt4918;
					arg0 += local48;
					arg3 += local28;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local28 * arg5;
				arg0 -= local48 * arg5;
				arg5 = 0;
			}
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local48 <= local28) {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt4918;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static124.method1858(arg4 >> 16, arg3 >> 16, arg5, this.aByteArray61);
							arg4 += local28;
							arg5 += this.anInt4918;
							arg3 += local7;
						}
					}
					Static124.method1858(arg4 >> 16, arg0 >> 16, arg5, this.aByteArray61);
					arg4 += local28;
					arg5 += this.anInt4918;
					arg0 += local48;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt4918 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static124.method1858(arg3 >> 16, arg4 >> 16, arg5, this.aByteArray61);
							arg5 += this.anInt4918;
							arg4 += local28;
							arg3 += local7;
						}
					}
					Static124.method1858(arg0 >> 16, arg4 >> 16, arg5, this.aByteArray61);
					arg4 += local28;
					arg5 += this.anInt4918;
					arg0 += local48;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
	public void method3997() {
		@Pc(16) int local16 = -1;
		@Pc(22) int local22 = this.aByteArray61.length - 8;
		while (local22 > local16) {
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
			local16++;
			this.aByteArray61[local16] = 0;
		}
		while (this.aByteArray61.length - 1 > local16) {
			local16++;
			this.aByteArray61[local16] = 0;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)Z")
	public boolean method3999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray61.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIB)V")
	public void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4918 = arg3 - arg2;
		this.anInt4914 = arg0;
		this.anInt4916 = arg2;
		this.anInt4921 = arg1 - arg0;
	}
}
