import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub4_Sub2_Sub1 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "[I")
	public static final int[] anIntArray63 = new int[128];

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "[B")
	public final byte[] aByteArray11;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray63.length; local4++) {
			anIntArray63[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray63[local16] = local16 - 65;
		}
		for (@Pc(31) int local31 = 97; local31 <= 122; local31++) {
			anIntArray63[local31] = local31 + 26 - 97;
		}
		for (@Pc(46) int local46 = 48; local46 <= 57; local46++) {
			anIntArray63[local46] = local46 + 52 - 48;
		}
		anIntArray63[42] = anIntArray63[43] = 62;
		anIntArray63[45] = anIntArray63[47] = 63;
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!ji;II)V")
	public Class3_Sub4_Sub2_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray11 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)Z")
	public boolean method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray11.length;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public void method1057(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt947 = arg1;
		this.anInt948 = arg3 - arg1;
		this.anInt949 = arg0;
		this.anInt952 = arg2 - arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public void method1059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg0 != arg3) {
			local11 = (arg2 - arg5 << 16) / (arg3 - arg0);
		}
		@Pc(27) int local27 = 0;
		if (arg4 != arg3) {
			local27 = (arg1 - arg2 << 16) / (arg4 - arg3);
		}
		@Pc(47) int local47 = 0;
		if (arg0 != arg4) {
			local47 = (arg5 - arg1 << 16) / (arg0 - arg4);
		}
		if (arg3 >= arg0 && arg0 <= arg4) {
			if (arg4 <= arg3) {
				arg2 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local47 * arg0;
					arg5 -= local11 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local27;
					arg4 = 0;
				}
				if (arg0 != arg4 && local47 < local11 || arg4 == arg0 && local11 < local27) {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt952 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static484.method7401(arg5 >> 16, this.aByteArray11, arg0, arg1 >> 16);
								arg1 += local27;
								arg0 += this.anInt952;
								arg5 += local11;
							}
						}
						Static484.method7401(arg5 >> 16, this.aByteArray11, arg0, arg2 >> 16);
						arg2 += local47;
						arg0 += this.anInt952;
						arg5 += local11;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt952;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static484.method7401(arg1 >> 16, this.aByteArray11, arg0, arg5 >> 16);
								arg5 += local11;
								arg0 += this.anInt952;
								arg1 += local27;
							}
						}
						Static484.method7401(arg2 >> 16, this.aByteArray11, arg0, arg5 >> 16);
						arg0 += this.anInt952;
						arg5 += local11;
						arg2 += local47;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local11 * arg0;
					arg1 -= local47 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local27 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg0 || local47 >= local11) && (arg3 != arg0 || local47 <= local27)) {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt952 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static484.method7401(arg1 >> 16, this.aByteArray11, arg0, arg2 >> 16);
								arg0 += this.anInt952;
								arg1 += local47;
								arg2 += local27;
							}
						}
						Static484.method7401(arg1 >> 16, this.aByteArray11, arg0, arg5 >> 16);
						arg1 += local47;
						arg0 += this.anInt952;
						arg5 += local11;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt952;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static484.method7401(arg2 >> 16, this.aByteArray11, arg0, arg1 >> 16);
								arg1 += local47;
								arg0 += this.anInt952;
								arg2 += local27;
							}
						}
						Static484.method7401(arg5 >> 16, this.aByteArray11, arg0, arg1 >> 16);
						arg0 += this.anInt952;
						arg5 += local11;
						arg1 += local47;
					}
				}
			}
		} else if (arg3 > arg4) {
			if (arg0 >= arg3) {
				arg5 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local47;
					arg5 -= local27 * arg4;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local11 * arg3;
					arg3 = 0;
				}
				if (local47 > local27) {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt952;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static484.method7401(arg1 >> 16, this.aByteArray11, arg4, arg2 >> 16);
								arg2 += local11;
								arg4 += this.anInt952;
								arg1 += local47;
							}
						}
						Static484.method7401(arg1 >> 16, this.aByteArray11, arg4, arg5 >> 16);
						arg1 += local47;
						arg5 += local27;
						arg4 += this.anInt952;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt952 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static484.method7401(arg2 >> 16, this.aByteArray11, arg4, arg1 >> 16);
								arg4 += this.anInt952;
								arg1 += local47;
								arg2 += local11;
							}
						}
						Static484.method7401(arg5 >> 16, this.aByteArray11, arg4, arg1 >> 16);
						arg1 += local47;
						arg4 += this.anInt952;
						arg5 += local27;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local47;
					arg2 -= arg4 * local27;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local11;
					arg0 = 0;
				}
				if (local47 <= local27) {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt952;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static484.method7401(arg2 >> 16, this.aByteArray11, arg4, arg5 >> 16);
								arg4 += this.anInt952;
								arg5 += local11;
								arg2 += local27;
							}
						}
						Static484.method7401(arg2 >> 16, this.aByteArray11, arg4, arg1 >> 16);
						arg1 += local47;
						arg4 += this.anInt952;
						arg2 += local27;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt952 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static484.method7401(arg5 >> 16, this.aByteArray11, arg4, arg2 >> 16);
								arg5 += local11;
								arg4 += this.anInt952;
								arg2 += local27;
							}
						}
						Static484.method7401(arg1 >> 16, this.aByteArray11, arg4, arg2 >> 16);
						arg2 += local27;
						arg4 += this.anInt952;
						arg1 += local47;
					}
				}
			}
		} else if (arg0 > arg4) {
			arg5 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local27 * arg3;
				arg5 -= local11 * arg3;
				arg3 = 0;
			}
			if (arg4 < 0) {
				arg1 -= arg4 * local47;
				arg4 = 0;
			}
			if ((arg3 == arg4 || local11 >= local27) && (arg3 != arg4 || local47 >= local11)) {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt952 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static484.method7401(arg5 >> 16, this.aByteArray11, arg3, arg1 >> 16);
							arg1 += local47;
							arg5 += local11;
							arg3 += this.anInt952;
						}
					}
					Static484.method7401(arg5 >> 16, this.aByteArray11, arg3, arg2 >> 16);
					arg2 += local27;
					arg3 += this.anInt952;
					arg5 += local11;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt952;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static484.method7401(arg1 >> 16, this.aByteArray11, arg3, arg5 >> 16);
							arg3 += this.anInt952;
							arg1 += local47;
							arg5 += local11;
						}
					}
					Static484.method7401(arg2 >> 16, this.aByteArray11, arg3, arg5 >> 16);
					arg2 += local27;
					arg5 += local11;
					arg3 += this.anInt952;
				}
			}
		} else {
			arg1 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= arg3 * local11;
				arg2 -= arg3 * local27;
				arg3 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= arg0 * local47;
				arg0 = 0;
			}
			if (local11 >= local27) {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt952;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static484.method7401(arg5 >> 16, this.aByteArray11, arg3, arg2 >> 16);
							arg5 += local47;
							arg3 += this.anInt952;
							arg2 += local27;
						}
					}
					Static484.method7401(arg1 >> 16, this.aByteArray11, arg3, arg2 >> 16);
					arg3 += this.anInt952;
					arg2 += local27;
					arg1 += local11;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt952;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static484.method7401(arg2 >> 16, this.aByteArray11, arg3, arg5 >> 16);
							arg5 += local47;
							arg3 += this.anInt952;
							arg2 += local27;
						}
					}
					Static484.method7401(arg2 >> 16, this.aByteArray11, arg3, arg1 >> 16);
					arg3 += this.anInt952;
					arg1 += local11;
					arg2 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	public void method1060() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray11.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
			local7++;
			this.aByteArray11[local7] = 0;
		}
		while (this.aByteArray11.length - 1 > local7) {
			local7++;
			this.aByteArray11[local7] = 0;
		}
	}
}
