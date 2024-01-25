import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class4_Sub1_Sub4_Sub1 extends Class4_Sub1_Sub4 {

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
	public int anInt2722;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!fd;II)V")
	public Class4_Sub1_Sub4_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray26 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public void method2299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2722 = arg3 - arg0;
		this.anInt2725 = arg0;
		this.anInt2727 = arg1;
		this.anInt2728 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
	public boolean method2301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray26.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIZIII)V")
	public void method2303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg1) {
			local7 = (arg3 - arg0 << 16) / (arg1 - arg2);
		}
		@Pc(23) int local23 = 0;
		if (arg1 != arg4) {
			local23 = (arg5 - arg3 << 16) / (arg4 - arg1);
		}
		@Pc(43) int local43 = 0;
		if (arg4 != arg2) {
			local43 = (arg0 - arg5 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg1 && arg4 >= arg2) {
			if (arg1 >= arg4) {
				arg3 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local43 * arg2;
					arg0 -= local7 * arg2;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg5 -= arg4 * local23;
					arg4 = 0;
				}
				if (arg2 != arg4 && local7 > local43 || arg4 == arg2 && local23 > local7) {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt2728 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg0 >> 16, arg5 >> 16, arg2);
								arg5 += local23;
								arg0 += local7;
								arg2 += this.anInt2728;
							}
						}
						Static305.method4125(this.aByteArray26, arg0 >> 16, arg3 >> 16, arg2);
						arg3 += local43;
						arg2 += this.anInt2728;
						arg0 += local7;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt2728 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg5 >> 16, arg0 >> 16, arg2);
								arg5 += local23;
								arg0 += local7;
								arg2 += this.anInt2728;
							}
						}
						Static305.method4125(this.aByteArray26, arg3 >> 16, arg0 >> 16, arg2);
						arg3 += local43;
						arg0 += local7;
						arg2 += this.anInt2728;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg5 -= local43 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local23;
					arg1 = 0;
				}
				if ((arg2 == arg1 || local7 <= local43) && (arg1 != arg2 || local43 <= local23)) {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt2728 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg5 >> 16, arg3 >> 16, arg2);
								arg2 += this.anInt2728;
								arg5 += local43;
								arg3 += local23;
							}
						}
						Static305.method4125(this.aByteArray26, arg5 >> 16, arg0 >> 16, arg2);
						arg0 += local7;
						arg5 += local43;
						arg2 += this.anInt2728;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt2728;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg3 >> 16, arg5 >> 16, arg2);
								arg5 += local43;
								arg3 += local23;
								arg2 += this.anInt2728;
							}
						}
						Static305.method4125(this.aByteArray26, arg0 >> 16, arg5 >> 16, arg2);
						arg2 += this.anInt2728;
						arg5 += local43;
						arg0 += local7;
					}
				}
			}
		} else if (arg1 > arg4) {
			if (arg1 > arg2) {
				arg3 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local43 * arg4;
					arg3 -= arg4 * local23;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg2 = 0;
				}
				if (local23 >= local43) {
					arg1 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2728 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg3 >> 16, arg0 >> 16, arg4);
								arg0 += local7;
								arg4 += this.anInt2728;
								arg3 += local23;
							}
						}
						Static305.method4125(this.aByteArray26, arg3 >> 16, arg5 >> 16, arg4);
						arg4 += this.anInt2728;
						arg3 += local23;
						arg5 += local43;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2728 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg0 >> 16, arg3 >> 16, arg4);
								arg4 += this.anInt2728;
								arg3 += local23;
								arg0 += local7;
							}
						}
						Static305.method4125(this.aByteArray26, arg5 >> 16, arg3 >> 16, arg4);
						arg4 += this.anInt2728;
						arg3 += local23;
						arg5 += local43;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local43;
					arg0 -= local23 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (local23 >= local43) {
					arg2 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt2728 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg3 >> 16, arg5 >> 16, arg4);
								arg5 += local43;
								arg3 += local7;
								arg4 += this.anInt2728;
							}
						}
						Static305.method4125(this.aByteArray26, arg0 >> 16, arg5 >> 16, arg4);
						arg5 += local43;
						arg0 += local23;
						arg4 += this.anInt2728;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt2728 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static305.method4125(this.aByteArray26, arg5 >> 16, arg3 >> 16, arg4);
								arg4 += this.anInt2728;
								arg5 += local43;
								arg3 += local7;
							}
						}
						Static305.method4125(this.aByteArray26, arg5 >> 16, arg0 >> 16, arg4);
						arg5 += local43;
						arg4 += this.anInt2728;
						arg0 += local23;
					}
				}
			}
		} else if (arg2 <= arg4) {
			arg5 = arg3 <<= 0x10;
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local7;
				arg3 -= local23 * arg1;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg0 -= arg2 * local43;
				arg2 = 0;
			}
			if (local7 < local23) {
				arg4 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt2728;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static305.method4125(this.aByteArray26, arg3 >> 16, arg0 >> 16, arg1);
							arg0 += local43;
							arg3 += local23;
							arg1 += this.anInt2728;
						}
					}
					Static305.method4125(this.aByteArray26, arg3 >> 16, arg5 >> 16, arg1);
					arg1 += this.anInt2728;
					arg3 += local23;
					arg5 += local7;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt2728 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static305.method4125(this.aByteArray26, arg0 >> 16, arg3 >> 16, arg1);
							arg1 += this.anInt2728;
							arg0 += local43;
							arg3 += local23;
						}
					}
					Static305.method4125(this.aByteArray26, arg5 >> 16, arg3 >> 16, arg1);
					arg1 += this.anInt2728;
					arg5 += local7;
					arg3 += local23;
				}
			}
		} else {
			arg0 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local23;
				arg0 -= arg1 * local7;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local43;
				arg4 = 0;
			}
			if (arg1 != arg4 && local7 < local23 || arg1 == arg4 && local43 < local7) {
				arg2 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt2728 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static305.method4125(this.aByteArray26, arg5 >> 16, arg0 >> 16, arg1);
							arg5 += local43;
							arg1 += this.anInt2728;
							arg0 += local7;
						}
					}
					Static305.method4125(this.aByteArray26, arg3 >> 16, arg0 >> 16, arg1);
					arg3 += local23;
					arg0 += local7;
					arg1 += this.anInt2728;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt2728;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static305.method4125(this.aByteArray26, arg0 >> 16, arg5 >> 16, arg1);
							arg1 += this.anInt2728;
							arg5 += local43;
							arg0 += local7;
						}
					}
					Static305.method4125(this.aByteArray26, arg0 >> 16, arg3 >> 16, arg1);
					arg0 += local7;
					arg1 += this.anInt2728;
					arg3 += local23;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	public void method2304() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray26.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
			local7++;
			this.aByteArray26[local7] = 0;
		}
		while (local7 < this.aByteArray26.length - 1) {
			local7++;
			this.aByteArray26[local7] = 0;
		}
	}
}
