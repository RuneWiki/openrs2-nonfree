import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class1_Sub6_Sub5_Sub1 extends Class1_Sub6_Sub5 {

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
	public int anInt8715;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
	public int anInt8719;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
	public int anInt8721;

	@OriginalMember(owner = "client!tv", name = "I", descriptor = "I")
	public int anInt8724;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ok;II)V")
	public Class1_Sub6_Sub5_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray92 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIIII)V")
	public void method7148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8724 = arg3;
		this.anInt8721 = arg1;
		this.anInt8719 = arg0 - arg1;
		this.anInt8715 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZI)Z")
	public boolean method7150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray92.length;
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V")
	public void method7151() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray92.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
			local7++;
			this.aByteArray92[local7] = 0;
		}
		while (this.aByteArray92.length - 1 > local7) {
			local7++;
			this.aByteArray92[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIII)V")
	public void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg5) {
			local7 = (arg2 - arg1 << 16) / (arg5 - arg4);
		}
		@Pc(37) int local37 = 0;
		if (arg3 != arg5) {
			local37 = (arg0 - arg2 << 16) / (arg3 - arg5);
		}
		@Pc(58) int local58 = 0;
		if (arg4 != arg3) {
			local58 = (arg1 - arg0 << 16) / (arg4 - arg3);
		}
		if (arg4 <= arg5 && arg4 <= arg3) {
			if (arg3 <= arg5) {
				arg2 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local58;
					arg1 -= arg4 * local7;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local37;
					arg3 = 0;
				}
				if (arg3 != arg4 && local58 < local7 || arg4 == arg3 && local37 > local7) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt8719;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static187.method6776(arg4, arg1 >> 16, this.aByteArray92, arg0 >> 16);
								arg4 += this.anInt8719;
								arg0 += local37;
								arg1 += local7;
							}
						}
						Static187.method6776(arg4, arg1 >> 16, this.aByteArray92, arg2 >> 16);
						arg2 += local58;
						arg1 += local7;
						arg4 += this.anInt8719;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt8719 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static187.method6776(arg4, arg0 >> 16, this.aByteArray92, arg1 >> 16);
								arg1 += local7;
								arg4 += this.anInt8719;
								arg0 += local37;
							}
						}
						Static187.method6776(arg4, arg2 >> 16, this.aByteArray92, arg1 >> 16);
						arg1 += local7;
						arg4 += this.anInt8719;
						arg2 += local58;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local58;
					arg1 -= local7 * arg4;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg2 -= local37 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg4 || local58 >= local7) && (arg4 != arg5 || local37 >= local58)) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8719;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static187.method6776(arg4, arg0 >> 16, this.aByteArray92, arg2 >> 16);
								arg4 += this.anInt8719;
								arg2 += local37;
								arg0 += local58;
							}
						}
						Static187.method6776(arg4, arg0 >> 16, this.aByteArray92, arg1 >> 16);
						arg0 += local58;
						arg4 += this.anInt8719;
						arg1 += local7;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt8719 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static187.method6776(arg4, arg2 >> 16, this.aByteArray92, arg0 >> 16);
								arg0 += local58;
								arg2 += local37;
								arg4 += this.anInt8719;
							}
						}
						Static187.method6776(arg4, arg1 >> 16, this.aByteArray92, arg0 >> 16);
						arg4 += this.anInt8719;
						arg0 += local58;
						arg1 += local7;
					}
				}
			}
		} else if (arg5 > arg3) {
			if (arg4 < arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local58;
					arg2 -= arg3 * local37;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local7 * arg4;
					arg4 = 0;
				}
				if (local58 <= local37) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt8719 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static187.method6776(arg3, arg2 >> 16, this.aByteArray92, arg1 >> 16);
								arg1 += local7;
								arg2 += local37;
								arg3 += this.anInt8719;
							}
						}
						Static187.method6776(arg3, arg2 >> 16, this.aByteArray92, arg0 >> 16);
						arg2 += local37;
						arg0 += local58;
						arg3 += this.anInt8719;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt8719;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static187.method6776(arg3, arg1 >> 16, this.aByteArray92, arg2 >> 16);
								arg3 += this.anInt8719;
								arg1 += local7;
								arg2 += local37;
							}
						}
						Static187.method6776(arg3, arg0 >> 16, this.aByteArray92, arg2 >> 16);
						arg2 += local37;
						arg0 += local58;
						arg3 += this.anInt8719;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local37 * arg3;
					arg0 -= local58 * arg3;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				if (local37 >= local58) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt8719;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static187.method6776(arg3, arg2 >> 16, this.aByteArray92, arg0 >> 16);
								arg3 += this.anInt8719;
								arg2 += local7;
								arg0 += local58;
							}
						}
						Static187.method6776(arg3, arg1 >> 16, this.aByteArray92, arg0 >> 16);
						arg1 += local37;
						arg0 += local58;
						arg3 += this.anInt8719;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt8719;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static187.method6776(arg3, arg0 >> 16, this.aByteArray92, arg2 >> 16);
								arg0 += local58;
								arg2 += local7;
								arg3 += this.anInt8719;
							}
						}
						Static187.method6776(arg3, arg0 >> 16, this.aByteArray92, arg1 >> 16);
						arg0 += local58;
						arg1 += local37;
						arg3 += this.anInt8719;
					}
				}
			}
		} else if (arg4 > arg3) {
			arg1 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg2 -= arg5 * local37;
				arg5 = 0;
			}
			if (arg3 < 0) {
				arg0 -= local58 * arg3;
				arg3 = 0;
			}
			if ((arg3 == arg5 || local7 >= local37) && (arg5 != arg3 || local7 <= local58)) {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt8719;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static187.method6776(arg5, arg1 >> 16, this.aByteArray92, arg0 >> 16);
							arg0 += local58;
							arg5 += this.anInt8719;
							arg1 += local7;
						}
					}
					Static187.method6776(arg5, arg1 >> 16, this.aByteArray92, arg2 >> 16);
					arg5 += this.anInt8719;
					arg2 += local37;
					arg1 += local7;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt8719;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static187.method6776(arg5, arg0 >> 16, this.aByteArray92, arg1 >> 16);
							arg5 += this.anInt8719;
							arg1 += local7;
							arg0 += local58;
						}
					}
					Static187.method6776(arg5, arg2 >> 16, this.aByteArray92, arg1 >> 16);
					arg1 += local7;
					arg2 += local37;
					arg5 += this.anInt8719;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= local7 * arg5;
				arg2 -= arg5 * local37;
				arg5 = 0;
			}
			if (arg4 < 0) {
				arg1 -= local58 * arg4;
				arg4 = 0;
			}
			if (local37 > local7) {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt8719 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static187.method6776(arg5, arg2 >> 16, this.aByteArray92, arg1 >> 16);
							arg2 += local37;
							arg1 += local58;
							arg5 += this.anInt8719;
						}
					}
					Static187.method6776(arg5, arg2 >> 16, this.aByteArray92, arg0 >> 16);
					arg5 += this.anInt8719;
					arg2 += local37;
					arg0 += local7;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt8719 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static187.method6776(arg5, arg1 >> 16, this.aByteArray92, arg2 >> 16);
							arg2 += local37;
							arg5 += this.anInt8719;
							arg1 += local58;
						}
					}
					Static187.method6776(arg5, arg0 >> 16, this.aByteArray92, arg2 >> 16);
					arg2 += local37;
					arg5 += this.anInt8719;
					arg0 += local7;
				}
			}
		}
	}
}
