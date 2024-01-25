import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class6_Sub4_Sub5_Sub1 extends Class6_Sub4_Sub5 {

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!pq;II)V")
	public Class6_Sub4_Sub5_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray33 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "(I)V")
	public void method2495() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray33.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
			local7++;
			this.aByteArray33[local7] = 0;
		}
		while (local7 < this.aByteArray33.length - 1) {
			local7++;
			this.aByteArray33[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BII)Z")
	public boolean method2496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray33.length;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIII)V")
	public void method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = 0;
		if (arg2 != arg4) {
			local19 = (arg1 - arg3 << 16) / (arg2 - arg4);
		}
		@Pc(39) int local39 = 0;
		if (arg0 != arg2) {
			local39 = (arg5 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(56) int local56 = 0;
		if (arg0 != arg4) {
			local56 = (arg3 - arg5 << 16) / (arg4 - arg0);
		}
		if (arg2 >= arg4 && arg0 >= arg4) {
			if (arg2 >= arg0) {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local56 * arg4;
					arg3 -= arg4 * local19;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local39 * arg0;
					arg0 = 0;
				}
				if (arg0 != arg4 && local56 < local19 || arg0 == arg4 && local39 > local19) {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt2995 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static212.method3106(arg4, arg5 >> 16, this.aByteArray33, arg3 >> 16);
								arg5 += local39;
								arg4 += this.anInt2995;
								arg3 += local19;
							}
						}
						Static212.method3106(arg4, arg1 >> 16, this.aByteArray33, arg3 >> 16);
						arg3 += local19;
						arg4 += this.anInt2995;
						arg1 += local56;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt2995;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static212.method3106(arg4, arg3 >> 16, this.aByteArray33, arg5 >> 16);
								arg3 += local19;
								arg4 += this.anInt2995;
								arg5 += local39;
							}
						}
						Static212.method3106(arg4, arg3 >> 16, this.aByteArray33, arg1 >> 16);
						arg1 += local56;
						arg4 += this.anInt2995;
						arg3 += local19;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local56;
					arg3 -= arg4 * local19;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local39 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg4 || local56 >= local19) && (arg4 != arg2 || local56 <= local39)) {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2995 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static212.method3106(arg4, arg1 >> 16, this.aByteArray33, arg5 >> 16);
								arg5 += local56;
								arg1 += local39;
								arg4 += this.anInt2995;
							}
						}
						Static212.method3106(arg4, arg3 >> 16, this.aByteArray33, arg5 >> 16);
						arg4 += this.anInt2995;
						arg5 += local56;
						arg3 += local19;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt2995 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static212.method3106(arg4, arg5 >> 16, this.aByteArray33, arg1 >> 16);
								arg1 += local39;
								arg4 += this.anInt2995;
								arg5 += local56;
							}
						}
						Static212.method3106(arg4, arg5 >> 16, this.aByteArray33, arg3 >> 16);
						arg3 += local19;
						arg5 += local56;
						arg4 += this.anInt2995;
					}
				}
			}
		} else if (arg2 <= arg0) {
			if (arg0 >= arg4) {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local39 * arg2;
					arg5 -= local19 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local56;
					arg4 = 0;
				}
				if (local39 <= local19) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt2995;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static212.method3106(arg2, arg1 >> 16, this.aByteArray33, arg3 >> 16);
								arg1 += local39;
								arg2 += this.anInt2995;
								arg3 += local56;
							}
						}
						Static212.method3106(arg2, arg1 >> 16, this.aByteArray33, arg5 >> 16);
						arg1 += local39;
						arg5 += local19;
						arg2 += this.anInt2995;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt2995 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static212.method3106(arg2, arg3 >> 16, this.aByteArray33, arg1 >> 16);
								arg3 += local56;
								arg2 += this.anInt2995;
								arg1 += local39;
							}
						}
						Static212.method3106(arg2, arg5 >> 16, this.aByteArray33, arg1 >> 16);
						arg2 += this.anInt2995;
						arg1 += local39;
						arg5 += local19;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local19 * arg2;
					arg1 -= arg2 * local39;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local56 * arg0;
					arg0 = 0;
				}
				if ((arg2 == arg0 || local19 >= local39) && (arg2 != arg0 || local56 >= local19)) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2995 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static212.method3106(arg2, arg5 >> 16, this.aByteArray33, arg3 >> 16);
								arg5 += local56;
								arg2 += this.anInt2995;
								arg3 += local19;
							}
						}
						Static212.method3106(arg2, arg1 >> 16, this.aByteArray33, arg3 >> 16);
						arg2 += this.anInt2995;
						arg3 += local19;
						arg1 += local39;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2995 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static212.method3106(arg2, arg3 >> 16, this.aByteArray33, arg5 >> 16);
								arg2 += this.anInt2995;
								arg5 += local56;
								arg3 += local19;
							}
						}
						Static212.method3106(arg2, arg3 >> 16, this.aByteArray33, arg1 >> 16);
						arg2 += this.anInt2995;
						arg3 += local19;
						arg1 += local39;
					}
				}
			}
		} else if (arg2 > arg4) {
			arg1 = arg5 <<= 0x10;
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local56 * arg0;
				arg1 -= local39 * arg0;
				arg0 = 0;
			}
			if (arg4 < 0) {
				arg3 -= local19 * arg4;
				arg4 = 0;
			}
			if (local56 > local39) {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt2995 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static212.method3106(arg0, arg1 >> 16, this.aByteArray33, arg3 >> 16);
							arg3 += local19;
							arg0 += this.anInt2995;
							arg1 += local39;
						}
					}
					Static212.method3106(arg0, arg1 >> 16, this.aByteArray33, arg5 >> 16);
					arg0 += this.anInt2995;
					arg5 += local56;
					arg1 += local39;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt2995 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static212.method3106(arg0, arg3 >> 16, this.aByteArray33, arg1 >> 16);
							arg0 += this.anInt2995;
							arg1 += local39;
							arg3 += local19;
						}
					}
					Static212.method3106(arg0, arg5 >> 16, this.aByteArray33, arg1 >> 16);
					arg1 += local39;
					arg0 += this.anInt2995;
					arg5 += local56;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local56 * arg0;
				arg3 -= arg0 * local39;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg1 -= arg2 * local19;
				arg2 = 0;
			}
			if (local56 > local39) {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt2995;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static212.method3106(arg0, arg1 >> 16, this.aByteArray33, arg5 >> 16);
							arg1 += local19;
							arg0 += this.anInt2995;
							arg5 += local56;
						}
					}
					Static212.method3106(arg0, arg3 >> 16, this.aByteArray33, arg5 >> 16);
					arg3 += local39;
					arg0 += this.anInt2995;
					arg5 += local56;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt2995 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static212.method3106(arg0, arg5 >> 16, this.aByteArray33, arg1 >> 16);
							arg5 += local56;
							arg0 += this.anInt2995;
							arg1 += local19;
						}
					}
					Static212.method3106(arg0, arg5 >> 16, this.aByteArray33, arg3 >> 16);
					arg3 += local39;
					arg0 += this.anInt2995;
					arg5 += local56;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)V")
	public void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2990 = arg2 - arg1;
		this.anInt2989 = arg3;
		this.anInt2995 = arg0 - arg3;
		this.anInt2996 = arg1;
	}
}
