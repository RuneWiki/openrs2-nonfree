import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub3_Sub6_Sub2 extends Class2_Sub3_Sub6 {

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
	public int anInt9185;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
	public int anInt9186;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
	public int anInt9187;

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
	public int anInt9194;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class2_Sub3_Sub6_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray98 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIZI)V")
	public void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9194 = arg1;
		this.anInt9187 = arg2 - arg1;
		this.anInt9185 = arg0;
		this.anInt9186 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
	public void method7629() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray98.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
			local13++;
			this.aByteArray98[local13] = 0;
		}
		while (local13 < this.aByteArray98.length - 1) {
			local13++;
			this.aByteArray98[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V")
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg5) {
			local7 = (arg3 - arg1 << 16) / (arg5 - arg4);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg5) {
			local28 = (arg2 - arg3 << 16) / (arg0 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg0 != arg4) {
			local49 = (arg1 - arg2 << 16) / (arg4 - arg0);
		}
		if (arg4 <= arg5 && arg4 <= arg0) {
			if (arg0 > arg5) {
				arg2 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local7;
					arg2 -= arg4 * local49;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg3 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg4 != arg5 && local49 < local7 || arg5 == arg4 && local28 < local49) {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9186 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static10.method240(arg2 >> 16, this.aByteArray98, arg3 >> 16, arg4);
								arg2 += local49;
								arg4 += this.anInt9186;
								arg3 += local28;
							}
						}
						Static10.method240(arg2 >> 16, this.aByteArray98, arg1 >> 16, arg4);
						arg1 += local7;
						arg4 += this.anInt9186;
						arg2 += local49;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt9186;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static10.method240(arg3 >> 16, this.aByteArray98, arg2 >> 16, arg4);
								arg3 += local28;
								arg2 += local49;
								arg4 += this.anInt9186;
							}
						}
						Static10.method240(arg1 >> 16, this.aByteArray98, arg2 >> 16, arg4);
						arg4 += this.anInt9186;
						arg1 += local7;
						arg2 += local49;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local49 * arg4;
					arg1 -= local7 * arg4;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg2 -= arg0 * local28;
					arg0 = 0;
				}
				if ((arg0 == arg4 || local7 <= local49) && (arg0 != arg4 || local28 <= local7)) {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt9186;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static10.method240(arg1 >> 16, this.aByteArray98, arg2 >> 16, arg4);
								arg1 += local7;
								arg4 += this.anInt9186;
								arg2 += local28;
							}
						}
						Static10.method240(arg1 >> 16, this.aByteArray98, arg3 >> 16, arg4);
						arg4 += this.anInt9186;
						arg3 += local49;
						arg1 += local7;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt9186;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static10.method240(arg2 >> 16, this.aByteArray98, arg1 >> 16, arg4);
								arg2 += local28;
								arg1 += local7;
								arg4 += this.anInt9186;
							}
						}
						Static10.method240(arg3 >> 16, this.aByteArray98, arg1 >> 16, arg4);
						arg3 += local49;
						arg4 += this.anInt9186;
						arg1 += local7;
					}
				}
			}
		} else if (arg0 >= arg5) {
			if (arg0 >= arg4) {
				arg2 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local28;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local49 * arg4;
					arg4 = 0;
				}
				if (local7 >= local28) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt9186;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static10.method240(arg3 >> 16, this.aByteArray98, arg1 >> 16, arg5);
								arg3 += local28;
								arg1 += local49;
								arg5 += this.anInt9186;
							}
						}
						Static10.method240(arg3 >> 16, this.aByteArray98, arg2 >> 16, arg5);
						arg2 += local7;
						arg5 += this.anInt9186;
						arg3 += local28;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt9186 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static10.method240(arg1 >> 16, this.aByteArray98, arg3 >> 16, arg5);
								arg3 += local28;
								arg1 += local49;
								arg5 += this.anInt9186;
							}
						}
						Static10.method240(arg2 >> 16, this.aByteArray98, arg3 >> 16, arg5);
						arg2 += local7;
						arg3 += local28;
						arg5 += this.anInt9186;
					}
				}
			} else {
				arg1 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local28 * arg5;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local49;
					arg0 = 0;
				}
				if ((arg0 == arg5 || local28 <= local7) && (arg0 != arg5 || local49 >= local7)) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt9186 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static10.method240(arg2 >> 16, this.aByteArray98, arg1 >> 16, arg5);
								arg5 += this.anInt9186;
								arg2 += local49;
								arg1 += local7;
							}
						}
						Static10.method240(arg3 >> 16, this.aByteArray98, arg1 >> 16, arg5);
						arg1 += local7;
						arg3 += local28;
						arg5 += this.anInt9186;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt9186 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static10.method240(arg1 >> 16, this.aByteArray98, arg2 >> 16, arg5);
								arg2 += local49;
								arg1 += local7;
								arg5 += this.anInt9186;
							}
						}
						Static10.method240(arg1 >> 16, this.aByteArray98, arg3 >> 16, arg5);
						arg5 += this.anInt9186;
						arg1 += local7;
						arg3 += local28;
					}
				}
			}
		} else if (arg4 >= arg5) {
			arg1 = arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local49;
				arg1 -= local28 * arg0;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= arg5 * local7;
				arg5 = 0;
			}
			if (local49 > local28) {
				arg4 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt9186;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static10.method240(arg3 >> 16, this.aByteArray98, arg2 >> 16, arg0);
							arg0 += this.anInt9186;
							arg2 += local49;
							arg3 += local7;
						}
					}
					Static10.method240(arg1 >> 16, this.aByteArray98, arg2 >> 16, arg0);
					arg1 += local28;
					arg0 += this.anInt9186;
					arg2 += local49;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt9186;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static10.method240(arg2 >> 16, this.aByteArray98, arg3 >> 16, arg0);
							arg2 += local49;
							arg0 += this.anInt9186;
							arg3 += local7;
						}
					}
					Static10.method240(arg2 >> 16, this.aByteArray98, arg1 >> 16, arg0);
					arg2 += local49;
					arg1 += local28;
					arg0 += this.anInt9186;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= local49 * arg0;
				arg3 -= arg0 * local28;
				arg0 = 0;
			}
			if (arg4 < 0) {
				arg1 -= local7 * arg4;
				arg4 = 0;
			}
			if (local28 >= local49) {
				arg5 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt9186;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static10.method240(arg1 >> 16, this.aByteArray98, arg3 >> 16, arg0);
							arg3 += local28;
							arg0 += this.anInt9186;
							arg1 += local7;
						}
					}
					Static10.method240(arg2 >> 16, this.aByteArray98, arg3 >> 16, arg0);
					arg0 += this.anInt9186;
					arg2 += local49;
					arg3 += local28;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt9186 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static10.method240(arg3 >> 16, this.aByteArray98, arg1 >> 16, arg0);
							arg3 += local28;
							arg1 += local7;
							arg0 += this.anInt9186;
						}
					}
					Static10.method240(arg3 >> 16, this.aByteArray98, arg2 >> 16, arg0);
					arg2 += local49;
					arg0 += this.anInt9186;
					arg3 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)Z")
	public boolean method7632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray98.length;
	}
}
