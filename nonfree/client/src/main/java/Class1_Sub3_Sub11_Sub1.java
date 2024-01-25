import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class1_Sub3_Sub11_Sub1 extends Class1_Sub3_Sub11 {

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
	public int anInt4085;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "I")
	public int anInt4090;

	@OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
	public int anInt4092;

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class1_Sub3_Sub11_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)Z")
	public boolean method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray41.length;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method3202() {
		@Pc(7) int local7 = -1;
		@Pc(18) int local18 = this.aByteArray41.length - 8;
		while (local7 < local18) {
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
			local7++;
			this.aByteArray41[local7] = 0;
		}
		while (this.aByteArray41.length - 1 > local7) {
			local7++;
			this.aByteArray41[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBIII)V")
	public void method3206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4083 = arg1;
		this.anInt4085 = arg2;
		this.anInt4090 = arg0 - arg2;
		this.anInt4092 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIIIIII)V")
	public void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg3 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(36) int local36 = 0;
		if (arg0 != arg4) {
			local36 = (arg5 - arg3 << 16) / (arg4 - arg0);
		}
		@Pc(52) int local52 = 0;
		if (arg4 != arg2) {
			local52 = (arg1 - arg5 << 16) / (arg2 - arg4);
		}
		if (arg0 >= arg2 && arg4 >= arg2) {
			if (arg4 <= arg0) {
				arg3 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local52;
					arg1 -= local7 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local36 * arg4;
					arg4 = 0;
				}
				if (arg2 != arg4 && local7 > local52 || arg4 == arg2 && local7 < local36) {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt4092 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static49.method658(arg2, arg1 >> 16, this.aByteArray41, arg5 >> 16);
								arg2 += this.anInt4092;
								arg5 += local36;
								arg1 += local7;
							}
						}
						Static49.method658(arg2, arg1 >> 16, this.aByteArray41, arg3 >> 16);
						arg3 += local52;
						arg2 += this.anInt4092;
						arg1 += local7;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt4092;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static49.method658(arg2, arg5 >> 16, this.aByteArray41, arg1 >> 16);
								arg5 += local36;
								arg1 += local7;
								arg2 += this.anInt4092;
							}
						}
						Static49.method658(arg2, arg3 >> 16, this.aByteArray41, arg1 >> 16);
						arg2 += this.anInt4092;
						arg1 += local7;
						arg3 += local52;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local52 * arg2;
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local36;
					arg0 = 0;
				}
				if ((arg2 == arg0 || local52 >= local7) && (arg2 != arg0 || local52 <= local36)) {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt4092 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static49.method658(arg2, arg5 >> 16, this.aByteArray41, arg3 >> 16);
								arg3 += local36;
								arg2 += this.anInt4092;
								arg5 += local52;
							}
						}
						Static49.method658(arg2, arg5 >> 16, this.aByteArray41, arg1 >> 16);
						arg2 += this.anInt4092;
						arg1 += local7;
						arg5 += local52;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt4092 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static49.method658(arg2, arg3 >> 16, this.aByteArray41, arg5 >> 16);
								arg2 += this.anInt4092;
								arg5 += local52;
								arg3 += local36;
							}
						}
						Static49.method658(arg2, arg1 >> 16, this.aByteArray41, arg5 >> 16);
						arg2 += this.anInt4092;
						arg1 += local7;
						arg5 += local52;
					}
				}
			}
		} else if (arg4 < arg0) {
			if (arg0 <= arg2) {
				arg1 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local52 * arg4;
					arg1 -= arg4 * local36;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				if (local52 <= local36) {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt4092 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static49.method658(arg4, arg3 >> 16, this.aByteArray41, arg5 >> 16);
								arg3 += local7;
								arg5 += local52;
								arg4 += this.anInt4092;
							}
						}
						Static49.method658(arg4, arg1 >> 16, this.aByteArray41, arg5 >> 16);
						arg4 += this.anInt4092;
						arg5 += local52;
						arg1 += local36;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt4092 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static49.method658(arg4, arg5 >> 16, this.aByteArray41, arg3 >> 16);
								arg5 += local52;
								arg4 += this.anInt4092;
								arg3 += local7;
							}
						}
						Static49.method658(arg4, arg5 >> 16, this.aByteArray41, arg1 >> 16);
						arg5 += local52;
						arg1 += local36;
						arg4 += this.anInt4092;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local36;
					arg5 -= local52 * arg4;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (local52 <= local36) {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4092 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static49.method658(arg4, arg3 >> 16, this.aByteArray41, arg1 >> 16);
								arg4 += this.anInt4092;
								arg3 += local36;
								arg1 += local7;
							}
						}
						Static49.method658(arg4, arg3 >> 16, this.aByteArray41, arg5 >> 16);
						arg5 += local52;
						arg3 += local36;
						arg4 += this.anInt4092;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt4092;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static49.method658(arg4, arg1 >> 16, this.aByteArray41, arg3 >> 16);
								arg1 += local7;
								arg4 += this.anInt4092;
								arg3 += local36;
							}
						}
						Static49.method658(arg4, arg5 >> 16, this.aByteArray41, arg3 >> 16);
						arg4 += this.anInt4092;
						arg3 += local36;
						arg5 += local52;
					}
				}
			}
		} else if (arg2 <= arg4) {
			arg5 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local36;
				arg5 -= arg0 * local7;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg1 -= local52 * arg2;
				arg2 = 0;
			}
			if (local36 > local7) {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt4092 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static49.method658(arg0, arg3 >> 16, this.aByteArray41, arg1 >> 16);
							arg1 += local52;
							arg0 += this.anInt4092;
							arg3 += local36;
						}
					}
					Static49.method658(arg0, arg3 >> 16, this.aByteArray41, arg5 >> 16);
					arg0 += this.anInt4092;
					arg5 += local7;
					arg3 += local36;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt4092;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static49.method658(arg0, arg1 >> 16, this.aByteArray41, arg3 >> 16);
							arg3 += local36;
							arg0 += this.anInt4092;
							arg1 += local52;
						}
					}
					Static49.method658(arg0, arg5 >> 16, this.aByteArray41, arg3 >> 16);
					arg3 += local36;
					arg0 += this.anInt4092;
					arg5 += local7;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local7;
				arg3 -= local36 * arg0;
				arg0 = 0;
			}
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local52;
				arg4 = 0;
			}
			if (arg0 != arg4 && local7 < local36 || arg4 == arg0 && local52 < local7) {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt4092;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static49.method658(arg0, arg5 >> 16, this.aByteArray41, arg1 >> 16);
							arg1 += local7;
							arg5 += local52;
							arg0 += this.anInt4092;
						}
					}
					Static49.method658(arg0, arg3 >> 16, this.aByteArray41, arg1 >> 16);
					arg0 += this.anInt4092;
					arg1 += local7;
					arg3 += local36;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt4092;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static49.method658(arg0, arg1 >> 16, this.aByteArray41, arg5 >> 16);
							arg1 += local7;
							arg0 += this.anInt4092;
							arg5 += local52;
						}
					}
					Static49.method658(arg0, arg1 >> 16, this.aByteArray41, arg3 >> 16);
					arg1 += local7;
					arg0 += this.anInt4092;
					arg3 += local36;
				}
			}
		}
	}
}
