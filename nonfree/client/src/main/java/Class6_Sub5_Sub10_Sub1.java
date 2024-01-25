import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class6_Sub5_Sub10_Sub1 extends Class6_Sub5_Sub10 {

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public int anInt5249;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	public int anInt5251;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	public int anInt5254;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!gj;II)V")
	public Class6_Sub5_Sub10_Sub1(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray72 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIIII)V")
	public void method4338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg0) {
			local7 = (arg4 - arg2 << 16) / (arg1 - arg0);
		}
		@Pc(36) int local36 = 0;
		if (arg3 != arg1) {
			local36 = (arg5 - arg4 << 16) / (arg3 - arg1);
		}
		@Pc(57) int local57 = 0;
		if (arg0 != arg3) {
			local57 = (arg2 - arg5 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg1 && arg0 <= arg3) {
			if (arg1 >= arg3) {
				arg4 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local57;
					arg2 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg5 -= arg3 * local36;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local57 || arg0 == arg3 && local36 > local7) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt5255 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg0, arg5 >> 16, arg2 >> 16);
								arg0 += this.anInt5255;
								arg2 += local7;
								arg5 += local36;
							}
						}
						Static205.method3377(this.aByteArray72, arg0, arg4 >> 16, arg2 >> 16);
						arg2 += local7;
						arg0 += this.anInt5255;
						arg4 += local57;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5255;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg0, arg2 >> 16, arg5 >> 16);
								arg0 += this.anInt5255;
								arg2 += local7;
								arg5 += local36;
							}
						}
						Static205.method3377(this.aByteArray72, arg0, arg2 >> 16, arg4 >> 16);
						arg4 += local57;
						arg2 += local7;
						arg0 += this.anInt5255;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local57;
					arg2 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= arg1 * local36;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local57 >= local7) && (arg1 != arg0 || local57 <= local36)) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt5255;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg0, arg4 >> 16, arg5 >> 16);
								arg5 += local57;
								arg4 += local36;
								arg0 += this.anInt5255;
							}
						}
						Static205.method3377(this.aByteArray72, arg0, arg2 >> 16, arg5 >> 16);
						arg2 += local7;
						arg0 += this.anInt5255;
						arg5 += local57;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt5255 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg0, arg5 >> 16, arg4 >> 16);
								arg0 += this.anInt5255;
								arg4 += local36;
								arg5 += local57;
							}
						}
						Static205.method3377(this.aByteArray72, arg0, arg5 >> 16, arg2 >> 16);
						arg2 += local7;
						arg0 += this.anInt5255;
						arg5 += local57;
					}
				}
			}
		} else if (arg3 < arg1) {
			if (arg1 <= arg0) {
				arg2 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local36;
					arg5 -= arg3 * local57;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local7 * arg1;
					arg1 = 0;
				}
				if (local36 < local57) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5255 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg3, arg4 >> 16, arg5 >> 16);
								arg3 += this.anInt5255;
								arg5 += local57;
								arg4 += local7;
							}
						}
						Static205.method3377(this.aByteArray72, arg3, arg2 >> 16, arg5 >> 16);
						arg2 += local36;
						arg5 += local57;
						arg3 += this.anInt5255;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5255 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg3, arg5 >> 16, arg4 >> 16);
								arg3 += this.anInt5255;
								arg4 += local7;
								arg5 += local57;
							}
						}
						Static205.method3377(this.aByteArray72, arg3, arg5 >> 16, arg2 >> 16);
						arg5 += local57;
						arg3 += this.anInt5255;
						arg2 += local36;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local36;
					arg5 -= local57 * arg3;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg0 = 0;
				}
				if (local57 > local36) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5255 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg3, arg4 >> 16, arg2 >> 16);
								arg2 += local7;
								arg4 += local36;
								arg3 += this.anInt5255;
							}
						}
						Static205.method3377(this.aByteArray72, arg3, arg4 >> 16, arg5 >> 16);
						arg4 += local36;
						arg3 += this.anInt5255;
						arg5 += local57;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5255 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static205.method3377(this.aByteArray72, arg3, arg2 >> 16, arg4 >> 16);
								arg3 += this.anInt5255;
								arg4 += local36;
								arg2 += local7;
							}
						}
						Static205.method3377(this.aByteArray72, arg3, arg5 >> 16, arg4 >> 16);
						arg3 += this.anInt5255;
						arg5 += local57;
						arg4 += local36;
					}
				}
			}
		} else if (arg0 > arg3) {
			arg2 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local36 * arg1;
				arg2 -= local7 * arg1;
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg5 -= local57 * arg3;
				arg3 = 0;
			}
			if ((arg1 == arg3 || local36 <= local7) && (arg3 != arg1 || local7 <= local57)) {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt5255;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static205.method3377(this.aByteArray72, arg1, arg5 >> 16, arg2 >> 16);
							arg5 += local57;
							arg2 += local7;
							arg1 += this.anInt5255;
						}
					}
					Static205.method3377(this.aByteArray72, arg1, arg4 >> 16, arg2 >> 16);
					arg4 += local36;
					arg2 += local7;
					arg1 += this.anInt5255;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt5255 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static205.method3377(this.aByteArray72, arg1, arg2 >> 16, arg5 >> 16);
							arg2 += local7;
							arg5 += local57;
							arg1 += this.anInt5255;
						}
					}
					Static205.method3377(this.aByteArray72, arg1, arg2 >> 16, arg4 >> 16);
					arg4 += local36;
					arg2 += local7;
					arg1 += this.anInt5255;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local36;
				arg5 -= local7 * arg1;
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg2 -= arg0 * local57;
				arg0 = 0;
			}
			if (local36 > local7) {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt5255 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static205.method3377(this.aByteArray72, arg1, arg2 >> 16, arg4 >> 16);
							arg2 += local57;
							arg1 += this.anInt5255;
							arg4 += local36;
						}
					}
					Static205.method3377(this.aByteArray72, arg1, arg5 >> 16, arg4 >> 16);
					arg1 += this.anInt5255;
					arg4 += local36;
					arg5 += local7;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt5255 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static205.method3377(this.aByteArray72, arg1, arg4 >> 16, arg2 >> 16);
							arg4 += local36;
							arg1 += this.anInt5255;
							arg2 += local57;
						}
					}
					Static205.method3377(this.aByteArray72, arg1, arg4 >> 16, arg5 >> 16);
					arg4 += local36;
					arg5 += local7;
					arg1 += this.anInt5255;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	public void method4339() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray72.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
			local7++;
			this.aByteArray72[local7] = 0;
		}
		while (this.aByteArray72.length - 1 > local7) {
			local7++;
			this.aByteArray72[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	public void method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5249 = arg2;
		this.anInt5254 = arg0;
		this.anInt5255 = arg1 - arg2;
		this.anInt5251 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)Z")
	public boolean method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray72.length;
	}
}
