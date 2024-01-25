import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub9_Sub16_Sub1 extends Class2_Sub9_Sub16 {

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	public int anInt4701;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!cg;II)V")
	public Class2_Sub9_Sub16_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray59 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
	public void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4699 = arg3;
		this.anInt4701 = arg2 - arg1;
		this.anInt4700 = arg0 - arg3;
		this.anInt4698 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIBI)V")
	public void method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		if (arg4 != arg1) {
			local5 = (arg2 - arg0 << 16) / (arg4 - arg1);
		}
		@Pc(27) int local27 = 0;
		if (arg4 != arg5) {
			local27 = (arg3 - arg2 << 16) / (arg5 - arg4);
		}
		@Pc(48) int local48 = 0;
		if (arg5 != arg1) {
			local48 = (arg0 - arg3 << 16) / (arg1 - arg5);
		}
		if (arg4 >= arg1 && arg1 <= arg5) {
			if (arg5 > arg4) {
				arg3 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local5;
					arg3 -= arg1 * local48;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg2 -= local27 * arg4;
					arg4 = 0;
				}
				if (arg1 != arg4 && local48 < local5 || arg1 == arg4 && local27 < local48) {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt4701;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static373.method4039(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray59);
								arg1 += this.anInt4701;
								arg3 += local48;
								arg2 += local27;
							}
						}
						Static373.method4039(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray59);
						arg0 += local5;
						arg1 += this.anInt4701;
						arg3 += local48;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt4701 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static373.method4039(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray59);
								arg1 += this.anInt4701;
								arg3 += local48;
								arg2 += local27;
							}
						}
						Static373.method4039(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray59);
						arg0 += local5;
						arg3 += local48;
						arg1 += this.anInt4701;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local48 * arg1;
					arg0 -= arg1 * local5;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local27;
					arg5 = 0;
				}
				if ((arg5 == arg1 || local48 >= local5) && (arg5 != arg1 || local27 <= local5)) {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt4701;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static373.method4039(arg3 >> 16, arg1, arg0 >> 16, this.aByteArray59);
								arg1 += this.anInt4701;
								arg0 += local5;
								arg3 += local27;
							}
						}
						Static373.method4039(arg2 >> 16, arg1, arg0 >> 16, this.aByteArray59);
						arg2 += local48;
						arg0 += local5;
						arg1 += this.anInt4701;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt4701;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static373.method4039(arg0 >> 16, arg1, arg3 >> 16, this.aByteArray59);
								arg0 += local5;
								arg1 += this.anInt4701;
								arg3 += local27;
							}
						}
						Static373.method4039(arg0 >> 16, arg1, arg2 >> 16, this.aByteArray59);
						arg2 += local48;
						arg1 += this.anInt4701;
						arg0 += local5;
					}
				}
			}
		} else if (arg5 < arg4) {
			if (arg4 > arg1) {
				arg2 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local27;
					arg3 -= local48 * arg5;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local5;
					arg1 = 0;
				}
				if (local48 > local27) {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt4701 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static373.method4039(arg0 >> 16, arg5, arg2 >> 16, this.aByteArray59);
								arg2 += local27;
								arg0 += local5;
								arg5 += this.anInt4701;
							}
						}
						Static373.method4039(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray59);
						arg5 += this.anInt4701;
						arg2 += local27;
						arg3 += local48;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt4701;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static373.method4039(arg2 >> 16, arg5, arg0 >> 16, this.aByteArray59);
								arg0 += local5;
								arg5 += this.anInt4701;
								arg2 += local27;
							}
						}
						Static373.method4039(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray59);
						arg3 += local48;
						arg2 += local27;
						arg5 += this.anInt4701;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local48;
					arg0 -= local27 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local5;
					arg4 = 0;
				}
				if (local48 > local27) {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt4701 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static373.method4039(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray59);
								arg3 += local48;
								arg2 += local5;
								arg5 += this.anInt4701;
							}
						}
						Static373.method4039(arg3 >> 16, arg5, arg0 >> 16, this.aByteArray59);
						arg0 += local27;
						arg3 += local48;
						arg5 += this.anInt4701;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt4701;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static373.method4039(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray59);
								arg2 += local5;
								arg3 += local48;
								arg5 += this.anInt4701;
							}
						}
						Static373.method4039(arg0 >> 16, arg5, arg3 >> 16, this.aByteArray59);
						arg0 += local27;
						arg3 += local48;
						arg5 += this.anInt4701;
					}
				}
			}
		} else if (arg1 > arg5) {
			arg0 = arg2 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local5;
				arg2 -= local27 * arg4;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg3 -= arg5 * local48;
				arg5 = 0;
			}
			if ((arg4 == arg5 || local27 <= local5) && (arg5 != arg4 || local48 >= local5)) {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt4701;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static373.method4039(arg0 >> 16, arg4, arg3 >> 16, this.aByteArray59);
							arg4 += this.anInt4701;
							arg3 += local48;
							arg0 += local5;
						}
					}
					Static373.method4039(arg0 >> 16, arg4, arg2 >> 16, this.aByteArray59);
					arg0 += local5;
					arg2 += local27;
					arg4 += this.anInt4701;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt4701;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static373.method4039(arg3 >> 16, arg4, arg0 >> 16, this.aByteArray59);
							arg0 += local5;
							arg4 += this.anInt4701;
							arg3 += local48;
						}
					}
					Static373.method4039(arg2 >> 16, arg4, arg0 >> 16, this.aByteArray59);
					arg0 += local5;
					arg2 += local27;
					arg4 += this.anInt4701;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local5;
				arg2 -= local27 * arg4;
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg0 -= arg1 * local48;
				arg1 = 0;
			}
			if (local5 < local27) {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt4701 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static373.method4039(arg2 >> 16, arg4, arg0 >> 16, this.aByteArray59);
							arg4 += this.anInt4701;
							arg2 += local27;
							arg0 += local48;
						}
					}
					Static373.method4039(arg2 >> 16, arg4, arg3 >> 16, this.aByteArray59);
					arg2 += local27;
					arg4 += this.anInt4701;
					arg3 += local5;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt4701 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static373.method4039(arg0 >> 16, arg4, arg2 >> 16, this.aByteArray59);
							arg4 += this.anInt4701;
							arg0 += local48;
							arg2 += local27;
						}
					}
					Static373.method4039(arg3 >> 16, arg4, arg2 >> 16, this.aByteArray59);
					arg3 += local5;
					arg4 += this.anInt4701;
					arg2 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
	public void method4040() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray59.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
			local7++;
			this.aByteArray59[local7] = 0;
		}
		while (local7 < this.aByteArray59.length - 1) {
			local7++;
			this.aByteArray59[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZI)Z")
	public boolean method4041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray59.length;
	}
}
