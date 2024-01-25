import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class3_Sub4_Sub13_Sub1 extends Class3_Sub4_Sub13 {

	@OriginalMember(owner = "client!mfa", name = "G", descriptor = "I")
	public int anInt7011;

	@OriginalMember(owner = "client!mfa", name = "I", descriptor = "I")
	public int anInt7015;

	@OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
	public int anInt7019;

	@OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
	public int anInt7020;

	@OriginalMember(owner = "client!mfa", name = "J", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!nb;II)V")
	public Class3_Sub4_Sub13_Sub1(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBIIIII)V")
	public void method5885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg4) {
			local7 = (arg0 - arg5 << 16) / (arg2 - arg4);
		}
		@Pc(28) int local28 = 0;
		if (arg1 != arg2) {
			local28 = (arg3 - arg0 << 16) / (arg1 - arg2);
		}
		@Pc(56) int local56 = 0;
		if (arg1 != arg4) {
			local56 = (arg5 - arg3 << 16) / (arg4 - arg1);
		}
		if (arg2 >= arg4 && arg1 >= arg4) {
			if (arg1 <= arg2) {
				arg0 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local7 * arg4;
					arg0 -= local56 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local28;
					arg1 = 0;
				}
				if (arg1 != arg4 && local56 < local7 || arg1 == arg4 && local7 < local28) {
					arg2 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt7011;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static669.method8877(arg3 >> 16, arg4, arg5 >> 16, 12379, this.aByteArray55);
								arg4 += this.anInt7011;
								arg3 += local28;
								arg5 += local7;
							}
						}
						Static669.method8877(arg0 >> 16, arg4, arg5 >> 16, 12379, this.aByteArray55);
						arg5 += local7;
						arg4 += this.anInt7011;
						arg0 += local56;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt7011 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static669.method8877(arg5 >> 16, arg4, arg3 >> 16, 12379, this.aByteArray55);
								arg5 += local7;
								arg3 += local28;
								arg4 += this.anInt7011;
							}
						}
						Static669.method8877(arg5 >> 16, arg4, arg0 >> 16, 12379, this.aByteArray55);
						arg4 += this.anInt7011;
						arg0 += local56;
						arg5 += local7;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local56;
					arg5 -= local7 * arg4;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local28 * arg2;
					arg2 = 0;
				}
				if ((arg4 == arg2 || local56 >= local7) && (arg4 != arg2 || local28 >= local56)) {
					arg1 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt7011;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static669.method8877(arg0 >> 16, arg4, arg3 >> 16, 12379, this.aByteArray55);
								arg3 += local56;
								arg0 += local28;
								arg4 += this.anInt7011;
							}
						}
						Static669.method8877(arg5 >> 16, arg4, arg3 >> 16, 12379, this.aByteArray55);
						arg4 += this.anInt7011;
						arg3 += local56;
						arg5 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt7011 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static669.method8877(arg3 >> 16, arg4, arg0 >> 16, 12379, this.aByteArray55);
								arg0 += local28;
								arg4 += this.anInt7011;
								arg3 += local56;
							}
						}
						Static669.method8877(arg3 >> 16, arg4, arg5 >> 16, 12379, this.aByteArray55);
						arg4 += this.anInt7011;
						arg5 += local7;
						arg3 += local56;
					}
				}
			}
		} else if (arg2 <= arg1) {
			if (arg1 < arg4) {
				arg5 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg0 -= arg2 * local28;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local56;
					arg1 = 0;
				}
				if (arg2 != arg1 && local7 < local28 || arg1 == arg2 && local56 < local7) {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt7011;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static669.method8877(arg5 >> 16, arg2, arg3 >> 16, 12379, this.aByteArray55);
								arg3 += local56;
								arg5 += local7;
								arg2 += this.anInt7011;
							}
						}
						Static669.method8877(arg5 >> 16, arg2, arg0 >> 16, 12379, this.aByteArray55);
						arg0 += local28;
						arg2 += this.anInt7011;
						arg5 += local7;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt7011;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static669.method8877(arg3 >> 16, arg2, arg5 >> 16, 12379, this.aByteArray55);
								arg5 += local7;
								arg3 += local56;
								arg2 += this.anInt7011;
							}
						}
						Static669.method8877(arg0 >> 16, arg2, arg5 >> 16, 12379, this.aByteArray55);
						arg2 += this.anInt7011;
						arg5 += local7;
						arg0 += local28;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local28 * arg2;
					arg3 -= arg2 * local7;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local56;
					arg4 = 0;
				}
				if (local28 > local7) {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt7011;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static669.method8877(arg5 >> 16, arg2, arg0 >> 16, 12379, this.aByteArray55);
								arg0 += local28;
								arg5 += local56;
								arg2 += this.anInt7011;
							}
						}
						Static669.method8877(arg3 >> 16, arg2, arg0 >> 16, 12379, this.aByteArray55);
						arg3 += local7;
						arg2 += this.anInt7011;
						arg0 += local28;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt7011;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static669.method8877(arg0 >> 16, arg2, arg5 >> 16, 12379, this.aByteArray55);
								arg5 += local56;
								arg2 += this.anInt7011;
								arg0 += local28;
							}
						}
						Static669.method8877(arg0 >> 16, arg2, arg3 >> 16, 12379, this.aByteArray55);
						arg2 += this.anInt7011;
						arg3 += local7;
						arg0 += local28;
					}
				}
			}
		} else if (arg2 > arg4) {
			arg0 = arg3 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local28;
				arg3 -= local56 * arg1;
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg5 -= local7 * arg4;
				arg4 = 0;
			}
			if (local28 < local56) {
				arg2 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt7011;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static669.method8877(arg0 >> 16, arg1, arg5 >> 16, 12379, this.aByteArray55);
							arg1 += this.anInt7011;
							arg5 += local7;
							arg0 += local28;
						}
					}
					Static669.method8877(arg0 >> 16, arg1, arg3 >> 16, 12379, this.aByteArray55);
					arg1 += this.anInt7011;
					arg0 += local28;
					arg3 += local56;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt7011;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static669.method8877(arg5 >> 16, arg1, arg0 >> 16, 12379, this.aByteArray55);
							arg1 += this.anInt7011;
							arg5 += local7;
							arg0 += local28;
						}
					}
					Static669.method8877(arg3 >> 16, arg1, arg0 >> 16, 12379, this.aByteArray55);
					arg0 += local28;
					arg3 += local56;
					arg1 += this.anInt7011;
				}
			}
		} else {
			arg5 = arg3 <<= 0x10;
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local56;
				arg5 -= local28 * arg1;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg0 -= arg2 * local7;
				arg2 = 0;
			}
			if (local56 <= local28) {
				arg4 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt7011;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static669.method8877(arg3 >> 16, arg1, arg0 >> 16, 12379, this.aByteArray55);
							arg0 += local7;
							arg1 += this.anInt7011;
							arg3 += local56;
						}
					}
					Static669.method8877(arg3 >> 16, arg1, arg5 >> 16, 12379, this.aByteArray55);
					arg1 += this.anInt7011;
					arg5 += local28;
					arg3 += local56;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt7011;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static669.method8877(arg0 >> 16, arg1, arg3 >> 16, 12379, this.aByteArray55);
							arg3 += local56;
							arg1 += this.anInt7011;
							arg0 += local7;
						}
					}
					Static669.method8877(arg5 >> 16, arg1, arg3 >> 16, 12379, this.aByteArray55);
					arg5 += local28;
					arg3 += local56;
					arg1 += this.anInt7011;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIII)V")
	public void method5887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7020 = arg1 - arg3;
		this.anInt7011 = arg0 - arg2;
		this.anInt7015 = arg2;
		this.anInt7019 = arg3;
	}

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)V")
	public void method5889() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray55.length - 8;
		while (local12 < local18) {
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
			local12++;
			this.aByteArray55[local12] = 0;
		}
		while (local12 < this.aByteArray55.length - 1) {
			local12++;
			this.aByteArray55[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BII)Z")
	public boolean method5891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray55.length >= arg1 * arg0;
	}
}
