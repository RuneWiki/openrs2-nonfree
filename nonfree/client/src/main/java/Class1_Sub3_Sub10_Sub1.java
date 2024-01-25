import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub3_Sub10_Sub1 extends Class1_Sub3_Sub10 {

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	public int anInt5355;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
	public int anInt5364;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "[B")
	public final byte[] aByteArray60;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!od;II)V")
	public Class1_Sub3_Sub10_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray60 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIII)V")
	public void method4176(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg3) {
			local7 = (arg5 - arg2 << 16) / (arg1 - arg3);
		}
		@Pc(23) int local23 = 0;
		if (arg1 != arg4) {
			local23 = (arg0 - arg5 << 16) / (arg4 - arg1);
		}
		@Pc(51) int local51 = 0;
		if (arg3 != arg4) {
			local51 = (arg2 - arg0 << 16) / (arg3 - arg4);
		}
		if (arg3 <= arg1 && arg4 >= arg3) {
			if (arg1 < arg4) {
				arg0 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local7;
					arg0 -= arg3 * local51;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local23 * arg1;
					arg1 = 0;
				}
				if (arg3 != arg1 && local7 > local51 || arg3 == arg1 && local23 < local51) {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5358 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg0 >> 16, arg3, arg5 >> 16);
								arg5 += local23;
								arg0 += local51;
								arg3 += this.anInt5358;
							}
						}
						Static379.method4850(this.aByteArray60, arg0 >> 16, arg3, arg2 >> 16);
						arg2 += local7;
						arg0 += local51;
						arg3 += this.anInt5358;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5358 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg5 >> 16, arg3, arg0 >> 16);
								arg0 += local51;
								arg5 += local23;
								arg3 += this.anInt5358;
							}
						}
						Static379.method4850(this.aByteArray60, arg2 >> 16, arg3, arg0 >> 16);
						arg3 += this.anInt5358;
						arg0 += local51;
						arg2 += local7;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local51;
					arg2 -= local7 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local23;
					arg4 = 0;
				}
				if ((arg4 == arg3 || local51 >= local7) && (arg4 != arg3 || local7 >= local23)) {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt5358 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg2 >> 16, arg3, arg0 >> 16);
								arg2 += local7;
								arg0 += local23;
								arg3 += this.anInt5358;
							}
						}
						Static379.method4850(this.aByteArray60, arg2 >> 16, arg3, arg5 >> 16);
						arg2 += local7;
						arg3 += this.anInt5358;
						arg5 += local51;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt5358 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg0 >> 16, arg3, arg2 >> 16);
								arg3 += this.anInt5358;
								arg0 += local23;
								arg2 += local7;
							}
						}
						Static379.method4850(this.aByteArray60, arg5 >> 16, arg3, arg2 >> 16);
						arg3 += this.anInt5358;
						arg2 += local7;
						arg5 += local51;
					}
				}
			}
		} else if (arg1 <= arg4) {
			if (arg3 > arg4) {
				arg2 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local23 * arg1;
					arg2 -= local7 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local51;
					arg4 = 0;
				}
				if (arg1 != arg4 && local7 < local23 || arg4 == arg1 && local51 < local7) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt5358 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg2 >> 16, arg1, arg0 >> 16);
								arg1 += this.anInt5358;
								arg0 += local51;
								arg2 += local7;
							}
						}
						Static379.method4850(this.aByteArray60, arg2 >> 16, arg1, arg5 >> 16);
						arg5 += local23;
						arg1 += this.anInt5358;
						arg2 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt5358;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg0 >> 16, arg1, arg2 >> 16);
								arg0 += local51;
								arg2 += local7;
								arg1 += this.anInt5358;
							}
						}
						Static379.method4850(this.aByteArray60, arg5 >> 16, arg1, arg2 >> 16);
						arg2 += local7;
						arg1 += this.anInt5358;
						arg5 += local23;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local7 * arg1;
					arg5 -= arg1 * local23;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local51 * arg3;
					arg3 = 0;
				}
				if (local23 > local7) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt5358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg2 >> 16, arg1, arg5 >> 16);
								arg1 += this.anInt5358;
								arg2 += local51;
								arg5 += local23;
							}
						}
						Static379.method4850(this.aByteArray60, arg0 >> 16, arg1, arg5 >> 16);
						arg1 += this.anInt5358;
						arg0 += local7;
						arg5 += local23;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt5358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static379.method4850(this.aByteArray60, arg5 >> 16, arg1, arg2 >> 16);
								arg5 += local23;
								arg1 += this.anInt5358;
								arg2 += local51;
							}
						}
						Static379.method4850(this.aByteArray60, arg5 >> 16, arg1, arg0 >> 16);
						arg5 += local23;
						arg1 += this.anInt5358;
						arg0 += local7;
					}
				}
			}
		} else if (arg1 <= arg3) {
			arg2 = arg0 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local23 * arg4;
				arg0 -= local51 * arg4;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local7;
				arg1 = 0;
			}
			if (local51 <= local23) {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt5358 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static379.method4850(this.aByteArray60, arg0 >> 16, arg4, arg5 >> 16);
							arg5 += local7;
							arg4 += this.anInt5358;
							arg0 += local51;
						}
					}
					Static379.method4850(this.aByteArray60, arg0 >> 16, arg4, arg2 >> 16);
					arg0 += local51;
					arg4 += this.anInt5358;
					arg2 += local23;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt5358;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static379.method4850(this.aByteArray60, arg5 >> 16, arg4, arg0 >> 16);
							arg5 += local7;
							arg0 += local51;
							arg4 += this.anInt5358;
						}
					}
					Static379.method4850(this.aByteArray60, arg2 >> 16, arg4, arg0 >> 16);
					arg0 += local51;
					arg2 += local23;
					arg4 += this.anInt5358;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local51;
				arg5 -= arg4 * local23;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local7;
				arg3 = 0;
			}
			if (local23 >= local51) {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt5358;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static379.method4850(this.aByteArray60, arg2 >> 16, arg4, arg5 >> 16);
							arg4 += this.anInt5358;
							arg2 += local7;
							arg5 += local23;
						}
					}
					Static379.method4850(this.aByteArray60, arg0 >> 16, arg4, arg5 >> 16);
					arg5 += local23;
					arg0 += local51;
					arg4 += this.anInt5358;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt5358 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static379.method4850(this.aByteArray60, arg5 >> 16, arg4, arg2 >> 16);
							arg4 += this.anInt5358;
							arg5 += local23;
							arg2 += local7;
						}
					}
					Static379.method4850(this.aByteArray60, arg5 >> 16, arg4, arg0 >> 16);
					arg5 += local23;
					arg4 += this.anInt5358;
					arg0 += local51;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
	public void method4177() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray60.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
			local7++;
			this.aByteArray60[local7] = 0;
		}
		while (local7 < this.aByteArray60.length - 1) {
			local7++;
			this.aByteArray60[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZI)Z")
	public boolean method4181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray60.length;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public void method4182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5353 = arg2 - arg0;
		this.anInt5355 = arg1;
		this.anInt5364 = arg0;
		this.anInt5358 = arg3 - arg1;
	}
}
