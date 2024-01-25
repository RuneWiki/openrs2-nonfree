import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class6_Sub1_Sub12_Sub1 extends Class6_Sub1_Sub12 {

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
	public int anInt5685;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
	public int anInt5686;

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
	public int anInt5690;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "[B")
	public final byte[] aByteArray70;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!sv;II)V")
	public Class6_Sub1_Sub12_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray70 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Z")
	public boolean method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray70.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V")
	public void method4891() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray70.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
			local13++;
			this.aByteArray70[local13] = 0;
		}
		while (local13 < this.aByteArray70.length - 1) {
			local13++;
			this.aByteArray70[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
	public void method4892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5685 = arg0;
		this.anInt5690 = arg1;
		this.anInt5683 = arg3 - arg1;
		this.anInt5686 = arg2 - arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIII)V")
	public void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg0) {
			local7 = (arg2 - arg1 << 16) / (arg0 - arg5);
		}
		@Pc(36) int local36 = 0;
		if (arg4 != arg0) {
			local36 = (arg3 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(52) int local52 = 0;
		if (arg5 != arg4) {
			local52 = (arg1 - arg3 << 16) / (arg5 - arg4);
		}
		if (arg0 >= arg5 && arg4 >= arg5) {
			if (arg4 > arg0) {
				arg3 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local52;
					arg1 -= local7 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local36 * arg0;
					arg0 = 0;
				}
				if (arg0 != arg5 && local52 < local7 || arg5 == arg0 && local52 > local36) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt5683;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static175.method2693(arg5, arg2 >> 16, this.aByteArray70, arg3 >> 16);
								arg5 += this.anInt5683;
								arg2 += local36;
								arg3 += local52;
							}
						}
						Static175.method2693(arg5, arg1 >> 16, this.aByteArray70, arg3 >> 16);
						arg5 += this.anInt5683;
						arg3 += local52;
						arg1 += local7;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt5683;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static175.method2693(arg5, arg3 >> 16, this.aByteArray70, arg2 >> 16);
								arg2 += local36;
								arg5 += this.anInt5683;
								arg3 += local52;
							}
						}
						Static175.method2693(arg5, arg3 >> 16, this.aByteArray70, arg1 >> 16);
						arg1 += local7;
						arg3 += local52;
						arg5 += this.anInt5683;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg2 -= local52 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local36;
					arg4 = 0;
				}
				if ((arg4 == arg5 || local7 <= local52) && (arg5 != arg4 || local36 <= local7)) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt5683;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static175.method2693(arg5, arg3 >> 16, this.aByteArray70, arg1 >> 16);
								arg1 += local7;
								arg5 += this.anInt5683;
								arg3 += local36;
							}
						}
						Static175.method2693(arg5, arg2 >> 16, this.aByteArray70, arg1 >> 16);
						arg1 += local7;
						arg2 += local52;
						arg5 += this.anInt5683;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt5683 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static175.method2693(arg5, arg1 >> 16, this.aByteArray70, arg3 >> 16);
								arg1 += local7;
								arg5 += this.anInt5683;
								arg3 += local36;
							}
						}
						Static175.method2693(arg5, arg1 >> 16, this.aByteArray70, arg2 >> 16);
						arg2 += local52;
						arg5 += this.anInt5683;
						arg1 += local7;
					}
				}
			}
		} else if (arg4 >= arg0) {
			if (arg5 > arg4) {
				arg1 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg2 -= local36 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg3 -= local52 * arg4;
					arg4 = 0;
				}
				if (arg0 != arg4 && local36 > local7 || arg0 == arg4 && local7 > local52) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt5683 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static175.method2693(arg0, arg3 >> 16, this.aByteArray70, arg1 >> 16);
								arg0 += this.anInt5683;
								arg1 += local7;
								arg3 += local52;
							}
						}
						Static175.method2693(arg0, arg2 >> 16, this.aByteArray70, arg1 >> 16);
						arg2 += local36;
						arg1 += local7;
						arg0 += this.anInt5683;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt5683 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static175.method2693(arg0, arg1 >> 16, this.aByteArray70, arg3 >> 16);
								arg1 += local7;
								arg3 += local52;
								arg0 += this.anInt5683;
							}
						}
						Static175.method2693(arg0, arg1 >> 16, this.aByteArray70, arg2 >> 16);
						arg0 += this.anInt5683;
						arg1 += local7;
						arg2 += local36;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local36;
					arg3 -= arg0 * local7;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local52;
					arg5 = 0;
				}
				if (local7 < local36) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt5683;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static175.method2693(arg0, arg2 >> 16, this.aByteArray70, arg1 >> 16);
								arg0 += this.anInt5683;
								arg2 += local36;
								arg1 += local52;
							}
						}
						Static175.method2693(arg0, arg2 >> 16, this.aByteArray70, arg3 >> 16);
						arg2 += local36;
						arg0 += this.anInt5683;
						arg3 += local7;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt5683;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static175.method2693(arg0, arg1 >> 16, this.aByteArray70, arg2 >> 16);
								arg1 += local52;
								arg0 += this.anInt5683;
								arg2 += local36;
							}
						}
						Static175.method2693(arg0, arg3 >> 16, this.aByteArray70, arg2 >> 16);
						arg3 += local7;
						arg0 += this.anInt5683;
						arg2 += local36;
					}
				}
			}
		} else if (arg0 > arg5) {
			arg2 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local52;
				arg2 -= arg4 * local36;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg1 -= arg5 * local7;
				arg5 = 0;
			}
			if (local36 < local52) {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt5683 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static175.method2693(arg4, arg1 >> 16, this.aByteArray70, arg2 >> 16);
							arg2 += local36;
							arg1 += local7;
							arg4 += this.anInt5683;
						}
					}
					Static175.method2693(arg4, arg3 >> 16, this.aByteArray70, arg2 >> 16);
					arg4 += this.anInt5683;
					arg3 += local52;
					arg2 += local36;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt5683 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static175.method2693(arg4, arg2 >> 16, this.aByteArray70, arg1 >> 16);
							arg4 += this.anInt5683;
							arg1 += local7;
							arg2 += local36;
						}
					}
					Static175.method2693(arg4, arg2 >> 16, this.aByteArray70, arg3 >> 16);
					arg4 += this.anInt5683;
					arg2 += local36;
					arg3 += local52;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local36;
				arg3 -= arg4 * local52;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local7;
				arg0 = 0;
			}
			if (local52 > local36) {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt5683 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static175.method2693(arg4, arg3 >> 16, this.aByteArray70, arg2 >> 16);
							arg3 += local52;
							arg4 += this.anInt5683;
							arg2 += local7;
						}
					}
					Static175.method2693(arg4, arg3 >> 16, this.aByteArray70, arg1 >> 16);
					arg3 += local52;
					arg1 += local36;
					arg4 += this.anInt5683;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt5683 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static175.method2693(arg4, arg2 >> 16, this.aByteArray70, arg3 >> 16);
							arg4 += this.anInt5683;
							arg2 += local7;
							arg3 += local52;
						}
					}
					Static175.method2693(arg4, arg1 >> 16, this.aByteArray70, arg3 >> 16);
					arg3 += local52;
					arg1 += local36;
					arg4 += this.anInt5683;
				}
			}
		}
	}
}
