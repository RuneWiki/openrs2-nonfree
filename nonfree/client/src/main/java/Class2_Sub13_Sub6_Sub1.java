import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class2_Sub13_Sub6_Sub1 extends Class2_Sub13_Sub6 {

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
	public int anInt3534;

	@OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
	public int anInt3538;

	@OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
	public int anInt3541;

	@OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
	public int anInt3542;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!os;II)V")
	public Class2_Sub13_Sub6_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray71 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "(I)V")
	public void method3164() {
		@Pc(7) int local7 = -1;
		@Pc(17) int local17 = this.aByteArray71.length - 8;
		while (local17 > local7) {
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
			local7++;
			this.aByteArray71[local7] = 0;
		}
		while (local7 < this.aByteArray71.length - 1) {
			local7++;
			this.aByteArray71[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(IBI)Z")
	public boolean method3166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray71.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBIII)V")
	public void method3167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3538 = arg3 - arg2;
		this.anInt3534 = arg1 - arg0;
		this.anInt3541 = arg2;
		this.anInt3542 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIZII)V")
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg3) {
			local7 = (arg1 - arg4 << 16) / (arg3 - arg5);
		}
		@Pc(24) int local24 = 0;
		if (arg2 != arg3) {
			local24 = (arg0 - arg1 << 16) / (arg2 - arg3);
		}
		@Pc(40) int local40 = 0;
		if (arg5 != arg2) {
			local40 = (arg4 - arg0 << 16) / (arg5 - arg2);
		}
		if (arg5 <= arg3 && arg5 <= arg2) {
			if (arg2 <= arg3) {
				arg1 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local7 * arg5;
					arg1 -= arg5 * local40;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local24 * arg2;
					arg2 = 0;
				}
				if (arg2 != arg5 && local40 < local7 || arg2 == arg5 && local7 < local24) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt3538;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static61.method1142(arg4 >> 16, arg5, this.aByteArray71, arg0 >> 16);
								arg4 += local7;
								arg0 += local24;
								arg5 += this.anInt3538;
							}
						}
						Static61.method1142(arg4 >> 16, arg5, this.aByteArray71, arg1 >> 16);
						arg1 += local40;
						arg5 += this.anInt3538;
						arg4 += local7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt3538 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static61.method1142(arg0 >> 16, arg5, this.aByteArray71, arg4 >> 16);
								arg5 += this.anInt3538;
								arg0 += local24;
								arg4 += local7;
							}
						}
						Static61.method1142(arg1 >> 16, arg5, this.aByteArray71, arg4 >> 16);
						arg4 += local7;
						arg1 += local40;
						arg5 += this.anInt3538;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local40;
					arg4 -= arg5 * local7;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local24;
					arg3 = 0;
				}
				if ((arg3 == arg5 || local40 >= local7) && (arg3 != arg5 || local40 <= local24)) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt3538;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static61.method1142(arg0 >> 16, arg5, this.aByteArray71, arg1 >> 16);
								arg1 += local24;
								arg0 += local40;
								arg5 += this.anInt3538;
							}
						}
						Static61.method1142(arg0 >> 16, arg5, this.aByteArray71, arg4 >> 16);
						arg4 += local7;
						arg0 += local40;
						arg5 += this.anInt3538;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt3538;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static61.method1142(arg1 >> 16, arg5, this.aByteArray71, arg0 >> 16);
								arg0 += local40;
								arg5 += this.anInt3538;
								arg1 += local24;
							}
						}
						Static61.method1142(arg4 >> 16, arg5, this.aByteArray71, arg0 >> 16);
						arg4 += local7;
						arg5 += this.anInt3538;
						arg0 += local40;
					}
				}
			}
		} else if (arg3 > arg2) {
			if (arg5 >= arg3) {
				arg4 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local24;
					arg0 -= local40 * arg2;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				if (local24 < local40) {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3538;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static61.method1142(arg0 >> 16, arg2, this.aByteArray71, arg1 >> 16);
								arg1 += local7;
								arg0 += local40;
								arg2 += this.anInt3538;
							}
						}
						Static61.method1142(arg0 >> 16, arg2, this.aByteArray71, arg4 >> 16);
						arg0 += local40;
						arg4 += local24;
						arg2 += this.anInt3538;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt3538 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static61.method1142(arg1 >> 16, arg2, this.aByteArray71, arg0 >> 16);
								arg2 += this.anInt3538;
								arg1 += local7;
								arg0 += local40;
							}
						}
						Static61.method1142(arg4 >> 16, arg2, this.aByteArray71, arg0 >> 16);
						arg4 += local24;
						arg0 += local40;
						arg2 += this.anInt3538;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local40;
					arg1 -= arg2 * local24;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg4 -= arg5 * local7;
					arg5 = 0;
				}
				if (local40 <= local24) {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt3538;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static61.method1142(arg1 >> 16, arg2, this.aByteArray71, arg4 >> 16);
								arg1 += local24;
								arg2 += this.anInt3538;
								arg4 += local7;
							}
						}
						Static61.method1142(arg1 >> 16, arg2, this.aByteArray71, arg0 >> 16);
						arg2 += this.anInt3538;
						arg1 += local24;
						arg0 += local40;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt3538 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static61.method1142(arg4 >> 16, arg2, this.aByteArray71, arg1 >> 16);
								arg1 += local24;
								arg4 += local7;
								arg2 += this.anInt3538;
							}
						}
						Static61.method1142(arg0 >> 16, arg2, this.aByteArray71, arg1 >> 16);
						arg0 += local40;
						arg1 += local24;
						arg2 += this.anInt3538;
					}
				}
			}
		} else if (arg5 > arg2) {
			arg4 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local7;
				arg1 -= local24 * arg3;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local40;
				arg2 = 0;
			}
			if ((arg3 == arg2 || local7 >= local24) && (arg3 != arg2 || local7 <= local40)) {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt3538;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static61.method1142(arg4 >> 16, arg3, this.aByteArray71, arg0 >> 16);
							arg0 += local40;
							arg4 += local7;
							arg3 += this.anInt3538;
						}
					}
					Static61.method1142(arg4 >> 16, arg3, this.aByteArray71, arg1 >> 16);
					arg3 += this.anInt3538;
					arg1 += local24;
					arg4 += local7;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt3538;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static61.method1142(arg0 >> 16, arg3, this.aByteArray71, arg4 >> 16);
							arg3 += this.anInt3538;
							arg0 += local40;
							arg4 += local7;
						}
					}
					Static61.method1142(arg1 >> 16, arg3, this.aByteArray71, arg4 >> 16);
					arg1 += local24;
					arg3 += this.anInt3538;
					arg4 += local7;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local24 * arg3;
				arg0 -= local7 * arg3;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local40 * arg5;
				arg5 = 0;
			}
			if (local24 > local7) {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt3538 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static61.method1142(arg1 >> 16, arg3, this.aByteArray71, arg4 >> 16);
							arg3 += this.anInt3538;
							arg1 += local24;
							arg4 += local40;
						}
					}
					Static61.method1142(arg1 >> 16, arg3, this.aByteArray71, arg0 >> 16);
					arg3 += this.anInt3538;
					arg1 += local24;
					arg0 += local7;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt3538;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static61.method1142(arg4 >> 16, arg3, this.aByteArray71, arg1 >> 16);
							arg3 += this.anInt3538;
							arg4 += local40;
							arg1 += local24;
						}
					}
					Static61.method1142(arg0 >> 16, arg3, this.aByteArray71, arg1 >> 16);
					arg1 += local24;
					arg3 += this.anInt3538;
					arg0 += local7;
				}
			}
		}
	}
}
