import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class6_Sub2_Sub16_Sub1 extends Class6_Sub2_Sub16 {

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
	public int anInt7422;

	@OriginalMember(owner = "client!oca", name = "L", descriptor = "I")
	public int anInt7424;

	@OriginalMember(owner = "client!oca", name = "M", descriptor = "I")
	public int anInt7425;

	@OriginalMember(owner = "client!oca", name = "N", descriptor = "I")
	public int anInt7426;

	@OriginalMember(owner = "client!oca", name = "O", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!wh;II)V")
	public Class6_Sub2_Sub16_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray72 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public void method6385() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray72.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
			local11++;
			this.aByteArray72[local11] = 0;
		}
		while (this.aByteArray72.length - 1 > local11) {
			local11++;
			this.aByteArray72[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)Z")
	public boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray72.length;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V")
	public void method6388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7422 = arg0 - arg2;
		this.anInt7425 = arg3;
		this.anInt7426 = arg2;
		this.anInt7424 = arg1 - arg3;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIBIII)V")
	public void method6389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = 0;
		if (arg2 != arg3) {
			local12 = (arg4 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(32) int local32 = 0;
		if (arg0 != arg2) {
			local32 = (arg1 - arg4 << 16) / (arg0 - arg2);
		}
		@Pc(49) int local49 = 0;
		if (arg0 != arg3) {
			local49 = (arg5 - arg1 << 16) / (arg3 - arg0);
		}
		if (arg2 >= arg3 && arg3 <= arg0) {
			if (arg2 < arg0) {
				arg1 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local49;
					arg5 -= local12 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local32;
					arg2 = 0;
				}
				if (arg2 != arg3 && local49 < local12 || arg2 == arg3 && local49 > local32) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt7422 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg1 >> 16, arg3, arg4 >> 16);
								arg3 += this.anInt7422;
								arg4 += local32;
								arg1 += local49;
							}
						}
						Static118.method1964(this.aByteArray72, arg1 >> 16, arg3, arg5 >> 16);
						arg1 += local49;
						arg5 += local12;
						arg3 += this.anInt7422;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt7422;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg4 >> 16, arg3, arg1 >> 16);
								arg1 += local49;
								arg4 += local32;
								arg3 += this.anInt7422;
							}
						}
						Static118.method1964(this.aByteArray72, arg5 >> 16, arg3, arg1 >> 16);
						arg5 += local12;
						arg3 += this.anInt7422;
						arg1 += local49;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local49;
					arg5 -= local12 * arg3;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local32 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg3 || local49 >= local12) && (arg3 != arg0 || local12 >= local32)) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt7422;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg5 >> 16, arg3, arg1 >> 16);
								arg5 += local12;
								arg1 += local32;
								arg3 += this.anInt7422;
							}
						}
						Static118.method1964(this.aByteArray72, arg5 >> 16, arg3, arg4 >> 16);
						arg5 += local12;
						arg4 += local49;
						arg3 += this.anInt7422;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt7422;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg1 >> 16, arg3, arg5 >> 16);
								arg3 += this.anInt7422;
								arg5 += local12;
								arg1 += local32;
							}
						}
						Static118.method1964(this.aByteArray72, arg4 >> 16, arg3, arg5 >> 16);
						arg3 += this.anInt7422;
						arg5 += local12;
						arg4 += local49;
					}
				}
			}
		} else if (arg0 >= arg2) {
			if (arg3 <= arg0) {
				arg1 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local12;
					arg4 -= local32 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local49;
					arg3 = 0;
				}
				if (local12 < local32) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt7422 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg5 >> 16, arg2, arg4 >> 16);
								arg2 += this.anInt7422;
								arg4 += local32;
								arg5 += local49;
							}
						}
						Static118.method1964(this.aByteArray72, arg1 >> 16, arg2, arg4 >> 16);
						arg2 += this.anInt7422;
						arg1 += local12;
						arg4 += local32;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt7422;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg4 >> 16, arg2, arg5 >> 16);
								arg2 += this.anInt7422;
								arg5 += local49;
								arg4 += local32;
							}
						}
						Static118.method1964(this.aByteArray72, arg4 >> 16, arg2, arg1 >> 16);
						arg1 += local12;
						arg2 += this.anInt7422;
						arg4 += local32;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local12 * arg2;
					arg4 -= arg2 * local32;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg1 -= local49 * arg0;
					arg0 = 0;
				}
				if ((arg2 == arg0 || local12 >= local32) && (arg0 != arg2 || local12 <= local49)) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt7422 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg1 >> 16, arg2, arg5 >> 16);
								arg5 += local12;
								arg1 += local49;
								arg2 += this.anInt7422;
							}
						}
						Static118.method1964(this.aByteArray72, arg4 >> 16, arg2, arg5 >> 16);
						arg2 += this.anInt7422;
						arg5 += local12;
						arg4 += local32;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt7422;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static118.method1964(this.aByteArray72, arg5 >> 16, arg2, arg1 >> 16);
								arg1 += local49;
								arg2 += this.anInt7422;
								arg5 += local12;
							}
						}
						Static118.method1964(this.aByteArray72, arg5 >> 16, arg2, arg4 >> 16);
						arg2 += this.anInt7422;
						arg4 += local32;
						arg5 += local12;
					}
				}
			}
		} else if (arg3 >= arg2) {
			arg5 = arg1 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local49;
				arg5 -= local32 * arg0;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local12 * arg2;
				arg2 = 0;
			}
			if (local32 >= local49) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt7422 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static118.method1964(this.aByteArray72, arg1 >> 16, arg0, arg4 >> 16);
							arg1 += local49;
							arg4 += local12;
							arg0 += this.anInt7422;
						}
					}
					Static118.method1964(this.aByteArray72, arg1 >> 16, arg0, arg5 >> 16);
					arg0 += this.anInt7422;
					arg5 += local32;
					arg1 += local49;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt7422 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static118.method1964(this.aByteArray72, arg4 >> 16, arg0, arg1 >> 16);
							arg1 += local49;
							arg0 += this.anInt7422;
							arg4 += local12;
						}
					}
					Static118.method1964(this.aByteArray72, arg5 >> 16, arg0, arg1 >> 16);
					arg5 += local32;
					arg0 += this.anInt7422;
					arg1 += local49;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= local49 * arg0;
				arg4 -= local32 * arg0;
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg5 -= local12 * arg3;
				arg3 = 0;
			}
			if (local32 < local49) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt7422 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static118.method1964(this.aByteArray72, arg4 >> 16, arg0, arg5 >> 16);
							arg0 += this.anInt7422;
							arg5 += local12;
							arg4 += local32;
						}
					}
					Static118.method1964(this.aByteArray72, arg4 >> 16, arg0, arg1 >> 16);
					arg0 += this.anInt7422;
					arg4 += local32;
					arg1 += local49;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt7422 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static118.method1964(this.aByteArray72, arg5 >> 16, arg0, arg4 >> 16);
							arg4 += local32;
							arg0 += this.anInt7422;
							arg5 += local12;
						}
					}
					Static118.method1964(this.aByteArray72, arg1 >> 16, arg0, arg4 >> 16);
					arg1 += local49;
					arg0 += this.anInt7422;
					arg4 += local32;
				}
			}
		}
	}
}
