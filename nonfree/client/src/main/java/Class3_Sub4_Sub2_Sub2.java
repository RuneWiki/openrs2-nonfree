import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class3_Sub4_Sub2_Sub2 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
	public int anInt3344;

	@OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
	public int anInt3347;

	@OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
	public int anInt3349;

	@OriginalMember(owner = "client!fw", name = "H", descriptor = "[B")
	public final byte[] aByteArray48;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!fc;II)V")
	public Class3_Sub4_Sub2_Sub2(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray48 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "(I)V")
	public void method2947() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray48.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
			local7++;
			this.aByteArray48[local7] = 0;
		}
		while (local7 < this.aByteArray48.length - 1) {
			local7++;
			this.aByteArray48[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z")
	public boolean method2948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray48.length;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIZ)V")
	public void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg0) {
			local7 = (arg5 - arg4 << 16) / (arg1 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg3 != arg1) {
			local28 = (arg2 - arg5 << 16) / (arg3 - arg1);
		}
		@Pc(52) int local52 = 0;
		if (arg0 != arg3) {
			local52 = (arg4 - arg2 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg1 && arg0 <= arg3) {
			if (arg1 >= arg3) {
				arg5 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local52 * arg0;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg3 != arg0 && local52 < local7 || arg0 == arg3 && local28 > local7) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt3349;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static376.method6090(arg2 >> 16, arg4 >> 16, this.aByteArray48, arg0);
								arg2 += local28;
								arg4 += local7;
								arg0 += this.anInt3349;
							}
						}
						Static376.method6090(arg5 >> 16, arg4 >> 16, this.aByteArray48, arg0);
						arg5 += local52;
						arg0 += this.anInt3349;
						arg4 += local7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt3349;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static376.method6090(arg4 >> 16, arg2 >> 16, this.aByteArray48, arg0);
								arg0 += this.anInt3349;
								arg2 += local28;
								arg4 += local7;
							}
						}
						Static376.method6090(arg4 >> 16, arg5 >> 16, this.aByteArray48, arg0);
						arg0 += this.anInt3349;
						arg4 += local7;
						arg5 += local52;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local52 * arg0;
					arg4 -= arg0 * local7;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local28 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local7 <= local52) && (arg0 != arg1 || local28 >= local52)) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt3349 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static376.method6090(arg5 >> 16, arg2 >> 16, this.aByteArray48, arg0);
								arg0 += this.anInt3349;
								arg2 += local52;
								arg5 += local28;
							}
						}
						Static376.method6090(arg4 >> 16, arg2 >> 16, this.aByteArray48, arg0);
						arg4 += local7;
						arg0 += this.anInt3349;
						arg2 += local52;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt3349 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static376.method6090(arg2 >> 16, arg5 >> 16, this.aByteArray48, arg0);
								arg5 += local28;
								arg0 += this.anInt3349;
								arg2 += local52;
							}
						}
						Static376.method6090(arg2 >> 16, arg4 >> 16, this.aByteArray48, arg0);
						arg2 += local52;
						arg0 += this.anInt3349;
						arg4 += local7;
					}
				}
			}
		} else if (arg3 < arg1) {
			if (arg1 > arg0) {
				arg5 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local52;
					arg5 -= local28 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				if (local52 <= local28) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt3349;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static376.method6090(arg4 >> 16, arg5 >> 16, this.aByteArray48, arg3);
								arg3 += this.anInt3349;
								arg4 += local7;
								arg5 += local28;
							}
						}
						Static376.method6090(arg2 >> 16, arg5 >> 16, this.aByteArray48, arg3);
						arg3 += this.anInt3349;
						arg2 += local52;
						arg5 += local28;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3349 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static376.method6090(arg5 >> 16, arg4 >> 16, this.aByteArray48, arg3);
								arg3 += this.anInt3349;
								arg5 += local28;
								arg4 += local7;
							}
						}
						Static376.method6090(arg5 >> 16, arg2 >> 16, this.aByteArray48, arg3);
						arg2 += local52;
						arg5 += local28;
						arg3 += this.anInt3349;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local28;
					arg2 -= local52 * arg3;
					arg3 = 0;
				}
				if (arg1 < 0) {
					arg5 -= arg1 * local7;
					arg1 = 0;
				}
				if (local28 < local52) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt3349 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static376.method6090(arg5 >> 16, arg2 >> 16, this.aByteArray48, arg3);
								arg5 += local7;
								arg2 += local52;
								arg3 += this.anInt3349;
							}
						}
						Static376.method6090(arg4 >> 16, arg2 >> 16, this.aByteArray48, arg3);
						arg2 += local52;
						arg4 += local28;
						arg3 += this.anInt3349;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt3349;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static376.method6090(arg2 >> 16, arg5 >> 16, this.aByteArray48, arg3);
								arg3 += this.anInt3349;
								arg5 += local7;
								arg2 += local52;
							}
						}
						Static376.method6090(arg2 >> 16, arg4 >> 16, this.aByteArray48, arg3);
						arg4 += local28;
						arg3 += this.anInt3349;
						arg2 += local52;
					}
				}
			}
		} else if (arg0 > arg3) {
			arg4 = arg5 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local7 * arg1;
				arg5 -= arg1 * local28;
				arg1 = 0;
			}
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local52 * arg3;
				arg3 = 0;
			}
			if ((arg1 == arg3 || local28 <= local7) && (arg3 != arg1 || local7 <= local52)) {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt3349;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static376.method6090(arg2 >> 16, arg4 >> 16, this.aByteArray48, arg1);
							arg2 += local52;
							arg4 += local7;
							arg1 += this.anInt3349;
						}
					}
					Static376.method6090(arg5 >> 16, arg4 >> 16, this.aByteArray48, arg1);
					arg4 += local7;
					arg5 += local28;
					arg1 += this.anInt3349;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt3349 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static376.method6090(arg4 >> 16, arg2 >> 16, this.aByteArray48, arg1);
							arg4 += local7;
							arg1 += this.anInt3349;
							arg2 += local52;
						}
					}
					Static376.method6090(arg4 >> 16, arg5 >> 16, this.aByteArray48, arg1);
					arg5 += local28;
					arg1 += this.anInt3349;
					arg4 += local7;
				}
			}
		} else {
			arg2 = arg5 <<= 0x10;
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local7 * arg1;
				arg5 -= local28 * arg1;
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg4 -= arg0 * local52;
				arg0 = 0;
			}
			if (local7 < local28) {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt3349;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static376.method6090(arg4 >> 16, arg5 >> 16, this.aByteArray48, arg1);
							arg4 += local52;
							arg5 += local28;
							arg1 += this.anInt3349;
						}
					}
					Static376.method6090(arg2 >> 16, arg5 >> 16, this.aByteArray48, arg1);
					arg5 += local28;
					arg1 += this.anInt3349;
					arg2 += local7;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt3349;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static376.method6090(arg5 >> 16, arg4 >> 16, this.aByteArray48, arg1);
							arg5 += local28;
							arg1 += this.anInt3349;
							arg4 += local52;
						}
					}
					Static376.method6090(arg5 >> 16, arg2 >> 16, this.aByteArray48, arg1);
					arg1 += this.anInt3349;
					arg5 += local28;
					arg2 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V")
	public void method2951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3344 = arg1 - arg0;
		this.anInt3347 = arg3;
		this.anInt3343 = arg0;
		this.anInt3349 = arg2 - arg3;
	}
}
