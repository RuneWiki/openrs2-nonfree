import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub3_Sub4_Sub2 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	public int anInt2027;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	public int anInt2032;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!qq;II)V")
	public Class1_Sub3_Sub4_Sub2(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray16 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg5) {
			local7 = (arg0 - arg1 << 16) / (arg2 - arg5);
		}
		@Pc(33) int local33 = 0;
		if (arg3 != arg2) {
			local33 = (arg4 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(53) int local53 = 0;
		if (arg3 != arg5) {
			local53 = (arg1 - arg4 << 16) / (arg5 - arg3);
		}
		if (arg5 <= arg2 && arg3 >= arg5) {
			if (arg3 <= arg2) {
				arg0 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg0 -= arg5 * local53;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local33;
					arg3 = 0;
				}
				if (arg5 != arg3 && local7 > local53 || arg5 == arg3 && local7 < local33) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2029 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static176.method2700(arg5, this.aByteArray16, arg1 >> 16, arg4 >> 16);
								arg4 += local33;
								arg1 += local7;
								arg5 += this.anInt2029;
							}
						}
						Static176.method2700(arg5, this.aByteArray16, arg1 >> 16, arg0 >> 16);
						arg1 += local7;
						arg5 += this.anInt2029;
						arg0 += local53;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2029 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static176.method2700(arg5, this.aByteArray16, arg4 >> 16, arg1 >> 16);
								arg1 += local7;
								arg5 += this.anInt2029;
								arg4 += local33;
							}
						}
						Static176.method2700(arg5, this.aByteArray16, arg0 >> 16, arg1 >> 16);
						arg0 += local53;
						arg1 += local7;
						arg5 += this.anInt2029;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local53 * arg5;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local33;
					arg2 = 0;
				}
				if ((arg5 == arg2 || local53 >= local7) && (arg2 != arg5 || local33 >= local53)) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt2029;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static176.method2700(arg5, this.aByteArray16, arg4 >> 16, arg0 >> 16);
								arg0 += local33;
								arg4 += local53;
								arg5 += this.anInt2029;
							}
						}
						Static176.method2700(arg5, this.aByteArray16, arg4 >> 16, arg1 >> 16);
						arg1 += local7;
						arg4 += local53;
						arg5 += this.anInt2029;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt2029 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static176.method2700(arg5, this.aByteArray16, arg0 >> 16, arg4 >> 16);
								arg0 += local33;
								arg5 += this.anInt2029;
								arg4 += local53;
							}
						}
						Static176.method2700(arg5, this.aByteArray16, arg1 >> 16, arg4 >> 16);
						arg4 += local53;
						arg5 += this.anInt2029;
						arg1 += local7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 >= arg5) {
				arg4 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg0 -= local33 * arg2;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local53 * arg5;
					arg5 = 0;
				}
				if (local33 <= local7) {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt2029 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static176.method2700(arg2, this.aByteArray16, arg1 >> 16, arg0 >> 16);
								arg1 += local53;
								arg2 += this.anInt2029;
								arg0 += local33;
							}
						}
						Static176.method2700(arg2, this.aByteArray16, arg4 >> 16, arg0 >> 16);
						arg4 += local7;
						arg0 += local33;
						arg2 += this.anInt2029;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt2029 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static176.method2700(arg2, this.aByteArray16, arg0 >> 16, arg1 >> 16);
								arg2 += this.anInt2029;
								arg0 += local33;
								arg1 += local53;
							}
						}
						Static176.method2700(arg2, this.aByteArray16, arg0 >> 16, arg4 >> 16);
						arg0 += local33;
						arg2 += this.anInt2029;
						arg4 += local7;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local7 * arg2;
					arg0 -= arg2 * local33;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg4 -= arg3 * local53;
					arg3 = 0;
				}
				if ((arg2 == arg3 || local7 >= local33) && (arg2 != arg3 || local7 <= local53)) {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt2029 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static176.method2700(arg2, this.aByteArray16, arg1 >> 16, arg4 >> 16);
								arg2 += this.anInt2029;
								arg1 += local7;
								arg4 += local53;
							}
						}
						Static176.method2700(arg2, this.aByteArray16, arg1 >> 16, arg0 >> 16);
						arg2 += this.anInt2029;
						arg1 += local7;
						arg0 += local33;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt2029 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static176.method2700(arg2, this.aByteArray16, arg4 >> 16, arg1 >> 16);
								arg4 += local53;
								arg2 += this.anInt2029;
								arg1 += local7;
							}
						}
						Static176.method2700(arg2, this.aByteArray16, arg0 >> 16, arg1 >> 16);
						arg0 += local33;
						arg2 += this.anInt2029;
						arg1 += local7;
					}
				}
			}
		} else if (arg2 <= arg5) {
			arg1 = arg4 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local33 * arg3;
				arg4 -= arg3 * local53;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg0 -= local7 * arg2;
				arg2 = 0;
			}
			if (local33 < local53) {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt2029 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static176.method2700(arg3, this.aByteArray16, arg4 >> 16, arg0 >> 16);
							arg4 += local53;
							arg0 += local7;
							arg3 += this.anInt2029;
						}
					}
					Static176.method2700(arg3, this.aByteArray16, arg4 >> 16, arg1 >> 16);
					arg4 += local53;
					arg1 += local33;
					arg3 += this.anInt2029;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt2029 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static176.method2700(arg3, this.aByteArray16, arg0 >> 16, arg4 >> 16);
							arg0 += local7;
							arg3 += this.anInt2029;
							arg4 += local53;
						}
					}
					Static176.method2700(arg3, this.aByteArray16, arg1 >> 16, arg4 >> 16);
					arg3 += this.anInt2029;
					arg4 += local53;
					arg1 += local33;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local33 * arg3;
				arg4 -= local53 * arg3;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg5 = 0;
			}
			if (local53 <= local33) {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt2029;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static176.method2700(arg3, this.aByteArray16, arg0 >> 16, arg1 >> 16);
							arg0 += local33;
							arg1 += local7;
							arg3 += this.anInt2029;
						}
					}
					Static176.method2700(arg3, this.aByteArray16, arg0 >> 16, arg4 >> 16);
					arg3 += this.anInt2029;
					arg0 += local33;
					arg4 += local53;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt2029 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static176.method2700(arg3, this.aByteArray16, arg1 >> 16, arg0 >> 16);
							arg1 += local7;
							arg3 += this.anInt2029;
							arg0 += local33;
						}
					}
					Static176.method2700(arg3, this.aByteArray16, arg4 >> 16, arg0 >> 16);
					arg3 += this.anInt2029;
					arg0 += local33;
					arg4 += local53;
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z")
	public boolean method1796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray16.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
	public void method1797() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray16.length - 8;
		while (local17 > local11) {
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
			local11++;
			this.aByteArray16[local11] = 0;
		}
		while (this.aByteArray16.length - 1 > local11) {
			local11++;
			this.aByteArray16[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBII)V")
	public void method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2031 = arg0 - arg2;
		this.anInt2032 = arg2;
		this.anInt2029 = arg1 - arg3;
		this.anInt2027 = arg3;
	}
}
