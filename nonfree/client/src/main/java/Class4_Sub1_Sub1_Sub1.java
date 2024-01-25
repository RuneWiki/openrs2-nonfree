import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	public int anInt93;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public int anInt94;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	public int anInt96;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray1 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method79() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray1.length - 8;
		while (local7 > local1) {
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
			local1++;
			this.aByteArray1[local1] = 0;
		}
		while (this.aByteArray1.length - 1 > local1) {
			local1++;
			this.aByteArray1[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
	public void method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt95 = arg1 - arg0;
		this.anInt96 = arg3 - arg2;
		this.anInt94 = arg0;
		this.anInt93 = arg2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)Z")
	public boolean method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray1.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
	public void method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg4 != arg0) {
			local1 = (arg3 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(19) int local19 = 0;
		if (arg4 != arg1) {
			local19 = (arg5 - arg3 << 16) / (arg1 - arg4);
		}
		@Pc(35) int local35 = 0;
		if (arg0 != arg1) {
			local35 = (arg2 - arg5 << 16) / (arg0 - arg1);
		}
		if (arg4 >= arg0 && arg1 >= arg0) {
			if (arg1 <= arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local35;
					arg2 -= arg0 * local1;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local19 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg0 && local1 > local35 || arg1 == arg0 && local19 > local1) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt96 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method82(arg2 >> 16, this.aByteArray1, arg5 >> 16, arg0);
								arg2 += local1;
								arg5 += local19;
								arg0 += this.anInt96;
							}
						}
						Static356.method82(arg2 >> 16, this.aByteArray1, arg3 >> 16, arg0);
						arg2 += local1;
						arg3 += local35;
						arg0 += this.anInt96;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt96;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method82(arg5 >> 16, this.aByteArray1, arg2 >> 16, arg0);
								arg5 += local19;
								arg0 += this.anInt96;
								arg2 += local1;
							}
						}
						Static356.method82(arg3 >> 16, this.aByteArray1, arg2 >> 16, arg0);
						arg3 += local35;
						arg2 += local1;
						arg0 += this.anInt96;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local35 * arg0;
					arg2 -= arg0 * local1;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local19 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg0 && local35 < local1 || arg0 == arg4 && local19 < local35) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt96;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static356.method82(arg3 >> 16, this.aByteArray1, arg5 >> 16, arg0);
								arg3 += local19;
								arg5 += local35;
								arg0 += this.anInt96;
							}
						}
						Static356.method82(arg2 >> 16, this.aByteArray1, arg5 >> 16, arg0);
						arg2 += local1;
						arg0 += this.anInt96;
						arg5 += local35;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt96;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static356.method82(arg5 >> 16, this.aByteArray1, arg3 >> 16, arg0);
								arg5 += local35;
								arg0 += this.anInt96;
								arg3 += local19;
							}
						}
						Static356.method82(arg5 >> 16, this.aByteArray1, arg2 >> 16, arg0);
						arg5 += local35;
						arg0 += this.anInt96;
						arg2 += local1;
					}
				}
			}
		} else if (arg4 > arg1) {
			if (arg4 <= arg0) {
				arg2 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local35 * arg1;
					arg2 -= arg1 * local19;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg3 -= arg4 * local1;
					arg4 = 0;
				}
				if (local19 >= local35) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt96;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static356.method82(arg3 >> 16, this.aByteArray1, arg5 >> 16, arg1);
								arg5 += local35;
								arg3 += local1;
								arg1 += this.anInt96;
							}
						}
						Static356.method82(arg2 >> 16, this.aByteArray1, arg5 >> 16, arg1);
						arg1 += this.anInt96;
						arg2 += local19;
						arg5 += local35;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt96 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static356.method82(arg5 >> 16, this.aByteArray1, arg3 >> 16, arg1);
								arg1 += this.anInt96;
								arg5 += local35;
								arg3 += local1;
							}
						}
						Static356.method82(arg5 >> 16, this.aByteArray1, arg2 >> 16, arg1);
						arg5 += local35;
						arg2 += local19;
						arg1 += this.anInt96;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local35;
					arg3 -= local19 * arg1;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local1 * arg0;
					arg0 = 0;
				}
				if (local35 <= local19) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt96;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method82(arg3 >> 16, this.aByteArray1, arg2 >> 16, arg1);
								arg2 += local1;
								arg3 += local19;
								arg1 += this.anInt96;
							}
						}
						Static356.method82(arg3 >> 16, this.aByteArray1, arg5 >> 16, arg1);
						arg5 += local35;
						arg3 += local19;
						arg1 += this.anInt96;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt96;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method82(arg2 >> 16, this.aByteArray1, arg3 >> 16, arg1);
								arg3 += local19;
								arg1 += this.anInt96;
								arg2 += local1;
							}
						}
						Static356.method82(arg5 >> 16, this.aByteArray1, arg3 >> 16, arg1);
						arg5 += local35;
						arg3 += local19;
						arg1 += this.anInt96;
					}
				}
			}
		} else if (arg0 > arg1) {
			arg2 = arg3 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= local19 * arg4;
				arg2 -= arg4 * local1;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local35;
				arg1 = 0;
			}
			if (arg1 != arg4 && local1 < local19 || arg4 == arg1 && local1 > local35) {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt96 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static356.method82(arg5 >> 16, this.aByteArray1, arg2 >> 16, arg4);
							arg5 += local35;
							arg2 += local1;
							arg4 += this.anInt96;
						}
					}
					Static356.method82(arg3 >> 16, this.aByteArray1, arg2 >> 16, arg4);
					arg2 += local1;
					arg4 += this.anInt96;
					arg3 += local19;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt96;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static356.method82(arg2 >> 16, this.aByteArray1, arg5 >> 16, arg4);
							arg4 += this.anInt96;
							arg2 += local1;
							arg5 += local35;
						}
					}
					Static356.method82(arg2 >> 16, this.aByteArray1, arg3 >> 16, arg4);
					arg2 += local1;
					arg3 += local19;
					arg4 += this.anInt96;
				}
			}
		} else {
			arg5 = arg3 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local1 * arg4;
				arg3 -= arg4 * local19;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local35;
				arg0 = 0;
			}
			if (local19 <= local1) {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt96 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static356.method82(arg2 >> 16, this.aByteArray1, arg3 >> 16, arg4);
							arg3 += local19;
							arg2 += local35;
							arg4 += this.anInt96;
						}
					}
					Static356.method82(arg5 >> 16, this.aByteArray1, arg3 >> 16, arg4);
					arg3 += local19;
					arg5 += local1;
					arg4 += this.anInt96;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt96;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static356.method82(arg3 >> 16, this.aByteArray1, arg2 >> 16, arg4);
							arg3 += local19;
							arg4 += this.anInt96;
							arg2 += local35;
						}
					}
					Static356.method82(arg3 >> 16, this.aByteArray1, arg5 >> 16, arg4);
					arg3 += local19;
					arg5 += local1;
					arg4 += this.anInt96;
				}
			}
		}
	}
}
