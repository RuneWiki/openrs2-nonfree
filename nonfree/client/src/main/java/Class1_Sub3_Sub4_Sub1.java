import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub3_Sub4_Sub1 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!ag;II)V")
	public Class1_Sub3_Sub4_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray4 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBIII)V")
	public void method845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt958 = arg0;
		this.anInt961 = arg1 - arg2;
		this.anInt954 = arg3 - arg0;
		this.anInt960 = arg2;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(ZII)Z")
	public boolean method846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray4.length;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIBI)V")
	public void method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg1) {
			local7 = (arg2 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(34) int local34 = 0;
		if (arg0 != arg4) {
			local34 = (arg5 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(50) int local50 = 0;
		if (arg4 != arg1) {
			local50 = (arg3 - arg5 << 16) / (arg1 - arg4);
		}
		if (arg1 <= arg0 && arg4 >= arg1) {
			if (arg4 <= arg0) {
				arg2 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local50;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local34;
					arg4 = 0;
				}
				if (arg1 != arg4 && local7 > local50 || arg1 == arg4 && local7 < local34) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt961 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static31.method779(arg5 >> 16, arg3 >> 16, this.aByteArray4, arg1);
								arg5 += local34;
								arg3 += local7;
								arg1 += this.anInt961;
							}
						}
						Static31.method779(arg2 >> 16, arg3 >> 16, this.aByteArray4, arg1);
						arg1 += this.anInt961;
						arg3 += local7;
						arg2 += local50;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt961;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static31.method779(arg3 >> 16, arg5 >> 16, this.aByteArray4, arg1);
								arg3 += local7;
								arg1 += this.anInt961;
								arg5 += local34;
							}
						}
						Static31.method779(arg3 >> 16, arg2 >> 16, this.aByteArray4, arg1);
						arg3 += local7;
						arg2 += local50;
						arg1 += this.anInt961;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg5 -= arg1 * local50;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local34;
					arg0 = 0;
				}
				if ((arg0 == arg1 || local50 >= local7) && (arg0 != arg1 || local50 <= local34)) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt961;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static31.method779(arg2 >> 16, arg5 >> 16, this.aByteArray4, arg1);
								arg1 += this.anInt961;
								arg2 += local34;
								arg5 += local50;
							}
						}
						Static31.method779(arg3 >> 16, arg5 >> 16, this.aByteArray4, arg1);
						arg3 += local7;
						arg1 += this.anInt961;
						arg5 += local50;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt961 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static31.method779(arg5 >> 16, arg2 >> 16, this.aByteArray4, arg1);
								arg5 += local50;
								arg1 += this.anInt961;
								arg2 += local34;
							}
						}
						Static31.method779(arg5 >> 16, arg3 >> 16, this.aByteArray4, arg1);
						arg1 += this.anInt961;
						arg5 += local50;
						arg3 += local7;
					}
				}
			}
		} else if (arg0 <= arg4) {
			if (arg1 > arg4) {
				arg3 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local34;
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg5 -= arg4 * local50;
					arg4 = 0;
				}
				if (arg4 != arg0 && local7 < local34 || arg0 == arg4 && local7 > local50) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt961;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static31.method779(arg3 >> 16, arg5 >> 16, this.aByteArray4, arg0);
								arg0 += this.anInt961;
								arg5 += local50;
								arg3 += local7;
							}
						}
						Static31.method779(arg3 >> 16, arg2 >> 16, this.aByteArray4, arg0);
						arg3 += local7;
						arg2 += local34;
						arg0 += this.anInt961;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt961;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static31.method779(arg5 >> 16, arg3 >> 16, this.aByteArray4, arg0);
								arg5 += local50;
								arg0 += this.anInt961;
								arg3 += local7;
							}
						}
						Static31.method779(arg2 >> 16, arg3 >> 16, this.aByteArray4, arg0);
						arg2 += local34;
						arg0 += this.anInt961;
						arg3 += local7;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local34;
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local50;
					arg1 = 0;
				}
				if (local34 <= local7) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt961;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static31.method779(arg2 >> 16, arg3 >> 16, this.aByteArray4, arg0);
								arg2 += local34;
								arg0 += this.anInt961;
								arg3 += local50;
							}
						}
						Static31.method779(arg2 >> 16, arg5 >> 16, this.aByteArray4, arg0);
						arg5 += local7;
						arg2 += local34;
						arg0 += this.anInt961;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt961 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static31.method779(arg3 >> 16, arg2 >> 16, this.aByteArray4, arg0);
								arg2 += local34;
								arg0 += this.anInt961;
								arg3 += local50;
							}
						}
						Static31.method779(arg5 >> 16, arg2 >> 16, this.aByteArray4, arg0);
						arg5 += local7;
						arg2 += local34;
						arg0 += this.anInt961;
					}
				}
			}
		} else if (arg0 > arg1) {
			arg2 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local34 * arg4;
				arg5 -= arg4 * local50;
				arg4 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= local7 * arg1;
				arg1 = 0;
			}
			if (local50 > local34) {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt961 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static31.method779(arg2 >> 16, arg3 >> 16, this.aByteArray4, arg4);
							arg3 += local7;
							arg4 += this.anInt961;
							arg2 += local34;
						}
					}
					Static31.method779(arg2 >> 16, arg5 >> 16, this.aByteArray4, arg4);
					arg5 += local50;
					arg2 += local34;
					arg4 += this.anInt961;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt961;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static31.method779(arg3 >> 16, arg2 >> 16, this.aByteArray4, arg4);
							arg2 += local34;
							arg3 += local7;
							arg4 += this.anInt961;
						}
					}
					Static31.method779(arg5 >> 16, arg2 >> 16, this.aByteArray4, arg4);
					arg5 += local50;
					arg4 += this.anInt961;
					arg2 += local34;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local34;
				arg5 -= arg4 * local50;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local7;
				arg0 = 0;
			}
			if (local34 >= local50) {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt961;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static31.method779(arg5 >> 16, arg2 >> 16, this.aByteArray4, arg4);
							arg5 += local50;
							arg2 += local7;
							arg4 += this.anInt961;
						}
					}
					Static31.method779(arg5 >> 16, arg3 >> 16, this.aByteArray4, arg4);
					arg5 += local50;
					arg3 += local34;
					arg4 += this.anInt961;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt961 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static31.method779(arg2 >> 16, arg5 >> 16, this.aByteArray4, arg4);
							arg2 += local7;
							arg5 += local50;
							arg4 += this.anInt961;
						}
					}
					Static31.method779(arg3 >> 16, arg5 >> 16, this.aByteArray4, arg4);
					arg5 += local50;
					arg4 += this.anInt961;
					arg3 += local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public void method848() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray4.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
			local13++;
			this.aByteArray4[local13] = 0;
		}
		while (local13 < this.aByteArray4.length - 1) {
			local13++;
			this.aByteArray4[local13] = 0;
		}
	}
}
