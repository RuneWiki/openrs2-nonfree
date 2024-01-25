import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class6_Sub1_Sub12_Sub2 extends Class6_Sub1_Sub12 {

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
	public int anInt8696;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	public int anInt8697;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
	public int anInt8699;

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
	public int anInt8702;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "[B")
	public final byte[] aByteArray112;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!pea;II)V")
	public Class6_Sub1_Sub12_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray112 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public void method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8696 = arg0;
		this.anInt8699 = arg1 - arg2;
		this.anInt8697 = arg3 - arg0;
		this.anInt8702 = arg2;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)V")
	public void method7078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg5) {
			local7 = (arg4 - arg0 << 16) / (arg5 - arg2);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg3) {
			local28 = (arg1 - arg4 << 16) / (arg3 - arg5);
		}
		@Pc(45) int local45 = 0;
		if (arg3 != arg2) {
			local45 = (arg0 - arg1 << 16) / (arg2 - arg3);
		}
		if (arg2 <= arg5 && arg3 >= arg2) {
			if (arg3 <= arg5) {
				arg4 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local7;
					arg4 -= local45 * arg2;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg1 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg2 != arg3 && local45 < local7 || arg2 == arg3 && local7 < local28) {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt8699 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg2, arg0 >> 16, arg1 >> 16);
								arg0 += local7;
								arg1 += local28;
								arg2 += this.anInt8699;
							}
						}
						Static526.method7356(this.aByteArray112, arg2, arg0 >> 16, arg4 >> 16);
						arg0 += local7;
						arg2 += this.anInt8699;
						arg4 += local45;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt8699 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg2, arg1 >> 16, arg0 >> 16);
								arg2 += this.anInt8699;
								arg1 += local28;
								arg0 += local7;
							}
						}
						Static526.method7356(this.aByteArray112, arg2, arg4 >> 16, arg0 >> 16);
						arg2 += this.anInt8699;
						arg0 += local7;
						arg4 += local45;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local45 * arg2;
					arg0 -= arg2 * local7;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg5 = 0;
				}
				if ((arg2 == arg5 || local7 <= local45) && (arg2 != arg5 || local28 >= local45)) {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt8699;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg2, arg1 >> 16, arg4 >> 16);
								arg2 += this.anInt8699;
								arg4 += local28;
								arg1 += local45;
							}
						}
						Static526.method7356(this.aByteArray112, arg2, arg1 >> 16, arg0 >> 16);
						arg1 += local45;
						arg2 += this.anInt8699;
						arg0 += local7;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt8699 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg2, arg4 >> 16, arg1 >> 16);
								arg2 += this.anInt8699;
								arg4 += local28;
								arg1 += local45;
							}
						}
						Static526.method7356(this.aByteArray112, arg2, arg0 >> 16, arg1 >> 16);
						arg1 += local45;
						arg2 += this.anInt8699;
						arg0 += local7;
					}
				}
			}
		} else if (arg3 >= arg5) {
			if (arg2 <= arg3) {
				arg1 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local45;
					arg2 = 0;
				}
				if (local7 >= local28) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt8699;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg5, arg0 >> 16, arg4 >> 16);
								arg4 += local28;
								arg5 += this.anInt8699;
								arg0 += local45;
							}
						}
						Static526.method7356(this.aByteArray112, arg5, arg1 >> 16, arg4 >> 16);
						arg5 += this.anInt8699;
						arg4 += local28;
						arg1 += local7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt8699 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg5, arg4 >> 16, arg0 >> 16);
								arg0 += local45;
								arg4 += local28;
								arg5 += this.anInt8699;
							}
						}
						Static526.method7356(this.aByteArray112, arg5, arg4 >> 16, arg1 >> 16);
						arg4 += local28;
						arg1 += local7;
						arg5 += this.anInt8699;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local28;
					arg0 -= arg5 * local7;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local45;
					arg3 = 0;
				}
				if ((arg5 == arg3 || local28 <= local7) && (arg5 != arg3 || local7 <= local45)) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt8699;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg5, arg0 >> 16, arg1 >> 16);
								arg0 += local7;
								arg5 += this.anInt8699;
								arg1 += local45;
							}
						}
						Static526.method7356(this.aByteArray112, arg5, arg0 >> 16, arg4 >> 16);
						arg4 += local28;
						arg0 += local7;
						arg5 += this.anInt8699;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt8699;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static526.method7356(this.aByteArray112, arg5, arg1 >> 16, arg0 >> 16);
								arg5 += this.anInt8699;
								arg1 += local45;
								arg0 += local7;
							}
						}
						Static526.method7356(this.aByteArray112, arg5, arg4 >> 16, arg0 >> 16);
						arg5 += this.anInt8699;
						arg0 += local7;
						arg4 += local28;
					}
				}
			}
		} else if (arg5 <= arg2) {
			arg0 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local28 * arg3;
				arg1 -= arg3 * local45;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= local7 * arg5;
				arg5 = 0;
			}
			if (local45 > local28) {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt8699 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static526.method7356(this.aByteArray112, arg3, arg1 >> 16, arg4 >> 16);
							arg3 += this.anInt8699;
							arg4 += local7;
							arg1 += local45;
						}
					}
					Static526.method7356(this.aByteArray112, arg3, arg1 >> 16, arg0 >> 16);
					arg0 += local28;
					arg1 += local45;
					arg3 += this.anInt8699;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt8699;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static526.method7356(this.aByteArray112, arg3, arg4 >> 16, arg1 >> 16);
							arg3 += this.anInt8699;
							arg4 += local7;
							arg1 += local45;
						}
					}
					Static526.method7356(this.aByteArray112, arg3, arg0 >> 16, arg1 >> 16);
					arg1 += local45;
					arg3 += this.anInt8699;
					arg0 += local28;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= arg3 * local45;
				arg4 -= arg3 * local28;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg0 -= local7 * arg2;
				arg2 = 0;
			}
			if (local45 > local28) {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt8699;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static526.method7356(this.aByteArray112, arg3, arg0 >> 16, arg4 >> 16);
							arg3 += this.anInt8699;
							arg4 += local28;
							arg0 += local7;
						}
					}
					Static526.method7356(this.aByteArray112, arg3, arg1 >> 16, arg4 >> 16);
					arg4 += local28;
					arg1 += local45;
					arg3 += this.anInt8699;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt8699;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static526.method7356(this.aByteArray112, arg3, arg4 >> 16, arg0 >> 16);
							arg3 += this.anInt8699;
							arg0 += local7;
							arg4 += local28;
						}
					}
					Static526.method7356(this.aByteArray112, arg3, arg4 >> 16, arg1 >> 16);
					arg4 += local28;
					arg1 += local45;
					arg3 += this.anInt8699;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
	public void method7079() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray112.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
			local13++;
			this.aByteArray112[local13] = 0;
		}
		while (this.aByteArray112.length - 1 > local13) {
			local13++;
			this.aByteArray112[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
	public boolean method7080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray112.length >= arg1 * arg0;
	}
}
