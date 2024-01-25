import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class2_Sub5_Sub1_Sub1 extends Class2_Sub5_Sub1 {

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public int anInt2547;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
	public int anInt2550;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
	public int anInt2551;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	public int anInt2554;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!ef;II)V")
	public Class2_Sub5_Sub1_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray50 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIB)V")
	public void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg3) {
			local7 = (arg5 - arg4 << 16) / (arg3 - arg1);
		}
		@Pc(35) int local35 = 0;
		if (arg0 != arg3) {
			local35 = (arg2 - arg5 << 16) / (arg0 - arg3);
		}
		@Pc(51) int local51 = 0;
		if (arg1 != arg0) {
			local51 = (arg4 - arg2 << 16) / (arg1 - arg0);
		}
		if (arg1 <= arg3 && arg0 >= arg1) {
			if (arg3 >= arg0) {
				arg5 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local7 * arg1;
					arg5 -= arg1 * local51;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg2 -= local35 * arg0;
					arg0 = 0;
				}
				if (arg0 != arg1 && local51 < local7 || arg1 == arg0 && local7 < local35) {
					arg3 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt2547;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method3277(arg1, this.aByteArray50, arg2 >> 16, arg4 >> 16);
								arg4 += local7;
								arg2 += local35;
								arg1 += this.anInt2547;
							}
						}
						Static371.method3277(arg1, this.aByteArray50, arg5 >> 16, arg4 >> 16);
						arg1 += this.anInt2547;
						arg5 += local51;
						arg4 += local7;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt2547;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method3277(arg1, this.aByteArray50, arg4 >> 16, arg2 >> 16);
								arg4 += local7;
								arg1 += this.anInt2547;
								arg2 += local35;
							}
						}
						Static371.method3277(arg1, this.aByteArray50, arg4 >> 16, arg5 >> 16);
						arg4 += local7;
						arg5 += local51;
						arg1 += this.anInt2547;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local7 * arg1;
					arg2 -= arg1 * local51;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg5 -= arg3 * local35;
					arg3 = 0;
				}
				if ((arg1 == arg3 || local51 >= local7) && (arg1 != arg3 || local51 <= local35)) {
					arg0 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt2547 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method3277(arg1, this.aByteArray50, arg5 >> 16, arg2 >> 16);
								arg1 += this.anInt2547;
								arg2 += local51;
								arg5 += local35;
							}
						}
						Static371.method3277(arg1, this.aByteArray50, arg4 >> 16, arg2 >> 16);
						arg1 += this.anInt2547;
						arg4 += local7;
						arg2 += local51;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt2547 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static371.method3277(arg1, this.aByteArray50, arg2 >> 16, arg5 >> 16);
								arg1 += this.anInt2547;
								arg5 += local35;
								arg2 += local51;
							}
						}
						Static371.method3277(arg1, this.aByteArray50, arg2 >> 16, arg4 >> 16);
						arg1 += this.anInt2547;
						arg4 += local7;
						arg2 += local51;
					}
				}
			}
		} else if (arg0 < arg3) {
			if (arg3 <= arg1) {
				arg4 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local35 * arg0;
					arg2 -= local51 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local7;
					arg3 = 0;
				}
				if (local51 <= local35) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt2547;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method3277(arg0, this.aByteArray50, arg2 >> 16, arg5 >> 16);
								arg0 += this.anInt2547;
								arg2 += local51;
								arg5 += local7;
							}
						}
						Static371.method3277(arg0, this.aByteArray50, arg2 >> 16, arg4 >> 16);
						arg0 += this.anInt2547;
						arg2 += local51;
						arg4 += local35;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt2547;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static371.method3277(arg0, this.aByteArray50, arg5 >> 16, arg2 >> 16);
								arg5 += local7;
								arg0 += this.anInt2547;
								arg2 += local51;
							}
						}
						Static371.method3277(arg0, this.aByteArray50, arg4 >> 16, arg2 >> 16);
						arg4 += local35;
						arg0 += this.anInt2547;
						arg2 += local51;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local51 * arg0;
					arg5 -= arg0 * local35;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg1 = 0;
				}
				if (local35 >= local51) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt2547 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method3277(arg0, this.aByteArray50, arg4 >> 16, arg5 >> 16);
								arg5 += local35;
								arg0 += this.anInt2547;
								arg4 += local7;
							}
						}
						Static371.method3277(arg0, this.aByteArray50, arg2 >> 16, arg5 >> 16);
						arg0 += this.anInt2547;
						arg5 += local35;
						arg2 += local51;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt2547;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static371.method3277(arg0, this.aByteArray50, arg5 >> 16, arg4 >> 16);
								arg0 += this.anInt2547;
								arg5 += local35;
								arg4 += local7;
							}
						}
						Static371.method3277(arg0, this.aByteArray50, arg5 >> 16, arg2 >> 16);
						arg0 += this.anInt2547;
						arg2 += local51;
						arg5 += local35;
					}
				}
			}
		} else if (arg0 >= arg1) {
			arg2 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local7;
				arg5 -= arg3 * local35;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local51 * arg1;
				arg1 = 0;
			}
			if (local35 <= local7) {
				arg0 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt2547;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static371.method3277(arg3, this.aByteArray50, arg5 >> 16, arg4 >> 16);
							arg5 += local35;
							arg3 += this.anInt2547;
							arg4 += local51;
						}
					}
					Static371.method3277(arg3, this.aByteArray50, arg5 >> 16, arg2 >> 16);
					arg5 += local35;
					arg3 += this.anInt2547;
					arg2 += local7;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt2547 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static371.method3277(arg3, this.aByteArray50, arg4 >> 16, arg5 >> 16);
							arg3 += this.anInt2547;
							arg4 += local51;
							arg5 += local35;
						}
					}
					Static371.method3277(arg3, this.aByteArray50, arg2 >> 16, arg5 >> 16);
					arg2 += local7;
					arg3 += this.anInt2547;
					arg5 += local35;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local35;
				arg4 -= arg3 * local7;
				arg3 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local51;
				arg0 = 0;
			}
			if (arg0 != arg3 && local35 > local7 || arg0 == arg3 && local7 > local51) {
				arg1 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt2547;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method3277(arg3, this.aByteArray50, arg4 >> 16, arg2 >> 16);
							arg3 += this.anInt2547;
							arg4 += local7;
							arg2 += local51;
						}
					}
					Static371.method3277(arg3, this.aByteArray50, arg4 >> 16, arg5 >> 16);
					arg5 += local35;
					arg4 += local7;
					arg3 += this.anInt2547;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt2547;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static371.method3277(arg3, this.aByteArray50, arg2 >> 16, arg4 >> 16);
							arg4 += local7;
							arg2 += local51;
							arg3 += this.anInt2547;
						}
					}
					Static371.method3277(arg3, this.aByteArray50, arg5 >> 16, arg4 >> 16);
					arg4 += local7;
					arg3 += this.anInt2547;
					arg5 += local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBI)V")
	public void method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2547 = arg3 - arg0;
		this.anInt2550 = arg2 - arg1;
		this.anInt2554 = arg1;
		this.anInt2551 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
	public void method2003() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray50.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
			local7++;
			this.aByteArray50[local7] = 0;
		}
		while (local7 < this.aByteArray50.length - 1) {
			local7++;
			this.aByteArray50[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z")
	public boolean method2004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray50.length >= arg1 * arg0;
	}
}
