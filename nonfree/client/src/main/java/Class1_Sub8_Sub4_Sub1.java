import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub8_Sub4_Sub1 extends Class1_Sub8_Sub4 {

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
	public int anInt2967;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	public int anInt2970;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public int anInt2973;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!lj;II)V")
	public Class1_Sub8_Sub4_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray16 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
	public boolean method2583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray16.length;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2967 = arg0 - arg3;
		this.anInt2971 = arg2 - arg1;
		this.anInt2970 = arg3;
		this.anInt2973 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
	public void method2586() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray16.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
			local7++;
			this.aByteArray16[local7] = 0;
		}
		while (local7 < this.aByteArray16.length - 1) {
			local7++;
			this.aByteArray16[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBIII)V")
	public void method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg2) {
			local7 = (arg1 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(24) int local24 = 0;
		if (arg0 != arg3) {
			local24 = (arg4 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(48) int local48 = 0;
		if (arg2 != arg3) {
			local48 = (arg5 - arg4 << 16) / (arg2 - arg3);
		}
		if (arg2 <= arg0 && arg3 >= arg2) {
			if (arg3 > arg0) {
				arg4 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg4 -= arg2 * local48;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg1 -= arg0 * local24;
					arg0 = 0;
				}
				if (arg0 != arg2 && local7 > local48 || arg2 == arg0 && local48 > local24) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt2971;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static170.method2746(arg2, this.aByteArray16, arg1 >> 16, arg4 >> 16);
								arg1 += local24;
								arg4 += local48;
								arg2 += this.anInt2971;
							}
						}
						Static170.method2746(arg2, this.aByteArray16, arg5 >> 16, arg4 >> 16);
						arg4 += local48;
						arg5 += local7;
						arg2 += this.anInt2971;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt2971;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static170.method2746(arg2, this.aByteArray16, arg4 >> 16, arg1 >> 16);
								arg1 += local24;
								arg2 += this.anInt2971;
								arg4 += local48;
							}
						}
						Static170.method2746(arg2, this.aByteArray16, arg4 >> 16, arg5 >> 16);
						arg5 += local7;
						arg4 += local48;
						arg2 += this.anInt2971;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg1 -= local48 * arg2;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg4 -= local24 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg2 || local48 >= local7) && (arg2 != arg3 || local7 >= local24)) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt2971;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static170.method2746(arg2, this.aByteArray16, arg4 >> 16, arg5 >> 16);
								arg4 += local24;
								arg5 += local7;
								arg2 += this.anInt2971;
							}
						}
						Static170.method2746(arg2, this.aByteArray16, arg1 >> 16, arg5 >> 16);
						arg2 += this.anInt2971;
						arg1 += local48;
						arg5 += local7;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt2971 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static170.method2746(arg2, this.aByteArray16, arg5 >> 16, arg4 >> 16);
								arg5 += local7;
								arg4 += local24;
								arg2 += this.anInt2971;
							}
						}
						Static170.method2746(arg2, this.aByteArray16, arg5 >> 16, arg1 >> 16);
						arg2 += this.anInt2971;
						arg5 += local7;
						arg1 += local48;
					}
				}
			}
		} else if (arg0 > arg3) {
			if (arg2 >= arg0) {
				arg5 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local48 * arg3;
					arg5 -= arg3 * local24;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local7;
					arg0 = 0;
				}
				if (local24 < local48) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt2971 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static170.method2746(arg3, this.aByteArray16, arg4 >> 16, arg1 >> 16);
								arg1 += local7;
								arg4 += local48;
								arg3 += this.anInt2971;
							}
						}
						Static170.method2746(arg3, this.aByteArray16, arg4 >> 16, arg5 >> 16);
						arg3 += this.anInt2971;
						arg5 += local24;
						arg4 += local48;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt2971;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static170.method2746(arg3, this.aByteArray16, arg1 >> 16, arg4 >> 16);
								arg3 += this.anInt2971;
								arg1 += local7;
								arg4 += local48;
							}
						}
						Static170.method2746(arg3, this.aByteArray16, arg5 >> 16, arg4 >> 16);
						arg4 += local48;
						arg3 += this.anInt2971;
						arg5 += local24;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local24;
					arg4 -= arg3 * local48;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg2 = 0;
				}
				if (local24 < local48) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt2971;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static170.method2746(arg3, this.aByteArray16, arg5 >> 16, arg1 >> 16);
								arg1 += local24;
								arg5 += local7;
								arg3 += this.anInt2971;
							}
						}
						Static170.method2746(arg3, this.aByteArray16, arg4 >> 16, arg1 >> 16);
						arg3 += this.anInt2971;
						arg1 += local24;
						arg4 += local48;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt2971 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static170.method2746(arg3, this.aByteArray16, arg1 >> 16, arg5 >> 16);
								arg3 += this.anInt2971;
								arg1 += local24;
								arg5 += local7;
							}
						}
						Static170.method2746(arg3, this.aByteArray16, arg1 >> 16, arg4 >> 16);
						arg3 += this.anInt2971;
						arg1 += local24;
						arg4 += local48;
					}
				}
			}
		} else if (arg3 < arg2) {
			arg5 = arg1 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local7;
				arg1 -= local24 * arg0;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local48;
				arg3 = 0;
			}
			if ((arg0 == arg3 || local24 <= local7) && (arg3 != arg0 || local7 <= local48)) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt2971;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static170.method2746(arg0, this.aByteArray16, arg5 >> 16, arg4 >> 16);
							arg5 += local7;
							arg4 += local48;
							arg0 += this.anInt2971;
						}
					}
					Static170.method2746(arg0, this.aByteArray16, arg5 >> 16, arg1 >> 16);
					arg0 += this.anInt2971;
					arg5 += local7;
					arg1 += local24;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt2971 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static170.method2746(arg0, this.aByteArray16, arg4 >> 16, arg5 >> 16);
							arg5 += local7;
							arg0 += this.anInt2971;
							arg4 += local48;
						}
					}
					Static170.method2746(arg0, this.aByteArray16, arg1 >> 16, arg5 >> 16);
					arg1 += local24;
					arg0 += this.anInt2971;
					arg5 += local7;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local24;
				arg4 -= local7 * arg0;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg5 -= arg2 * local48;
				arg2 = 0;
			}
			if (local24 > local7) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt2971 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static170.method2746(arg0, this.aByteArray16, arg1 >> 16, arg5 >> 16);
							arg1 += local24;
							arg5 += local48;
							arg0 += this.anInt2971;
						}
					}
					Static170.method2746(arg0, this.aByteArray16, arg1 >> 16, arg4 >> 16);
					arg1 += local24;
					arg4 += local7;
					arg0 += this.anInt2971;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt2971 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static170.method2746(arg0, this.aByteArray16, arg5 >> 16, arg1 >> 16);
							arg0 += this.anInt2971;
							arg1 += local24;
							arg5 += local48;
						}
					}
					Static170.method2746(arg0, this.aByteArray16, arg4 >> 16, arg1 >> 16);
					arg4 += local7;
					arg0 += this.anInt2971;
					arg1 += local24;
				}
			}
		}
	}
}
