import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub5_Sub10_Sub1 extends Class1_Sub5_Sub10 {

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	public int anInt5924;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public int anInt5927;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	public int anInt5928;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!ur;II)V")
	public Class1_Sub5_Sub10_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray71 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	public void method4687() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray71.length - 8;
		while (local18 > local12) {
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
			local12++;
			this.aByteArray71[local12] = 0;
		}
		while (this.aByteArray71.length - 1 > local12) {
			local12++;
			this.aByteArray71[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5921 = arg2 - arg3;
		this.anInt5924 = arg0;
		this.anInt5928 = arg1 - arg0;
		this.anInt5927 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	public void method4689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg2) {
			local7 = (arg5 - arg1 << 16) / (arg2 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg2) {
			local28 = (arg4 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg3 != arg0) {
			local48 = (arg1 - arg4 << 16) / (arg3 - arg0);
		}
		if (arg2 >= arg3 && arg0 >= arg3) {
			if (arg2 >= arg0) {
				arg5 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local48;
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local28 * arg0;
					arg0 = 0;
				}
				if (arg0 != arg3 && local7 > local48 || arg3 == arg0 && local7 < local28) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt5921;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static116.method1854(arg1 >> 16, this.aByteArray71, arg4 >> 16, arg3);
								arg1 += local7;
								arg4 += local28;
								arg3 += this.anInt5921;
							}
						}
						Static116.method1854(arg1 >> 16, this.aByteArray71, arg5 >> 16, arg3);
						arg3 += this.anInt5921;
						arg1 += local7;
						arg5 += local48;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt5921;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static116.method1854(arg4 >> 16, this.aByteArray71, arg1 >> 16, arg3);
								arg3 += this.anInt5921;
								arg1 += local7;
								arg4 += local28;
							}
						}
						Static116.method1854(arg5 >> 16, this.aByteArray71, arg1 >> 16, arg3);
						arg1 += local7;
						arg3 += this.anInt5921;
						arg5 += local48;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local48;
					arg1 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg5 -= arg2 * local28;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local7 <= local48) && (arg2 != arg3 || local28 >= local48)) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt5921;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static116.method1854(arg4 >> 16, this.aByteArray71, arg5 >> 16, arg3);
								arg3 += this.anInt5921;
								arg4 += local48;
								arg5 += local28;
							}
						}
						Static116.method1854(arg4 >> 16, this.aByteArray71, arg1 >> 16, arg3);
						arg4 += local48;
						arg3 += this.anInt5921;
						arg1 += local7;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt5921;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static116.method1854(arg5 >> 16, this.aByteArray71, arg4 >> 16, arg3);
								arg5 += local28;
								arg4 += local48;
								arg3 += this.anInt5921;
							}
						}
						Static116.method1854(arg1 >> 16, this.aByteArray71, arg4 >> 16, arg3);
						arg3 += this.anInt5921;
						arg4 += local48;
						arg1 += local7;
					}
				}
			}
		} else if (arg2 > arg0) {
			if (arg3 < arg2) {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local28 * arg0;
					arg4 -= arg0 * local48;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg1 -= arg3 * local7;
					arg3 = 0;
				}
				if (local28 < local48) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5921;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static116.method1854(arg1 >> 16, this.aByteArray71, arg5 >> 16, arg0);
								arg1 += local7;
								arg5 += local28;
								arg0 += this.anInt5921;
							}
						}
						Static116.method1854(arg4 >> 16, this.aByteArray71, arg5 >> 16, arg0);
						arg5 += local28;
						arg4 += local48;
						arg0 += this.anInt5921;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5921;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static116.method1854(arg5 >> 16, this.aByteArray71, arg1 >> 16, arg0);
								arg0 += this.anInt5921;
								arg1 += local7;
								arg5 += local28;
							}
						}
						Static116.method1854(arg5 >> 16, this.aByteArray71, arg4 >> 16, arg0);
						arg0 += this.anInt5921;
						arg4 += local48;
						arg5 += local28;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local28;
					arg4 -= arg0 * local48;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg2 = 0;
				}
				if (local28 >= local48) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt5921 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static116.method1854(arg5 >> 16, this.aByteArray71, arg4 >> 16, arg0);
								arg5 += local7;
								arg4 += local48;
								arg0 += this.anInt5921;
							}
						}
						Static116.method1854(arg1 >> 16, this.aByteArray71, arg4 >> 16, arg0);
						arg1 += local28;
						arg0 += this.anInt5921;
						arg4 += local48;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt5921;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static116.method1854(arg4 >> 16, this.aByteArray71, arg5 >> 16, arg0);
								arg4 += local48;
								arg0 += this.anInt5921;
								arg5 += local7;
							}
						}
						Static116.method1854(arg4 >> 16, this.aByteArray71, arg1 >> 16, arg0);
						arg4 += local48;
						arg1 += local28;
						arg0 += this.anInt5921;
					}
				}
			}
		} else if (arg0 < arg3) {
			arg1 = arg5 <<= 0x10;
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local7 * arg2;
				arg5 -= local28 * arg2;
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg4 -= arg0 * local48;
				arg0 = 0;
			}
			if ((arg2 == arg0 || local28 <= local7) && (arg0 != arg2 || local48 >= local7)) {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt5921;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static116.method1854(arg1 >> 16, this.aByteArray71, arg4 >> 16, arg2);
							arg1 += local7;
							arg4 += local48;
							arg2 += this.anInt5921;
						}
					}
					Static116.method1854(arg1 >> 16, this.aByteArray71, arg5 >> 16, arg2);
					arg1 += local7;
					arg2 += this.anInt5921;
					arg5 += local28;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 = this.anInt5921 * arg2;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static116.method1854(arg4 >> 16, this.aByteArray71, arg1 >> 16, arg2);
							arg4 += local48;
							arg1 += local7;
							arg2 += this.anInt5921;
						}
					}
					Static116.method1854(arg5 >> 16, this.aByteArray71, arg1 >> 16, arg2);
					arg5 += local28;
					arg1 += local7;
					arg2 += this.anInt5921;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= arg2 * local28;
				arg4 -= local7 * arg2;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local48 * arg3;
				arg3 = 0;
			}
			if (local28 <= local7) {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt5921;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static116.method1854(arg1 >> 16, this.aByteArray71, arg5 >> 16, arg2);
							arg2 += this.anInt5921;
							arg5 += local28;
							arg1 += local48;
						}
					}
					Static116.method1854(arg4 >> 16, this.aByteArray71, arg5 >> 16, arg2);
					arg4 += local7;
					arg5 += local28;
					arg2 += this.anInt5921;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt5921;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static116.method1854(arg5 >> 16, this.aByteArray71, arg1 >> 16, arg2);
							arg1 += local48;
							arg5 += local28;
							arg2 += this.anInt5921;
						}
					}
					Static116.method1854(arg5 >> 16, this.aByteArray71, arg4 >> 16, arg2);
					arg4 += local7;
					arg5 += local28;
					arg2 += this.anInt5921;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public boolean method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray71.length >= arg1 * arg0;
	}
}
