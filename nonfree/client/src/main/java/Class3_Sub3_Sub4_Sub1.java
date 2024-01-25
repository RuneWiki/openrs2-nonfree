import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class3_Sub3_Sub4_Sub1 extends Class3_Sub3_Sub4 {

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
	public int anInt1135;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
	public int anInt1136;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!gk;II)V")
	public Class3_Sub3_Sub4_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray10 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
	public void method995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg0 != arg1) {
			local13 = (arg3 - arg2 << 16) / (arg0 - arg1);
		}
		@Pc(30) int local30 = 0;
		if (arg0 != arg4) {
			local30 = (arg5 - arg3 << 16) / (arg4 - arg0);
		}
		@Pc(47) int local47 = 0;
		if (arg1 != arg4) {
			local47 = (arg2 - arg5 << 16) / (arg1 - arg4);
		}
		if (arg0 >= arg1 && arg4 >= arg1) {
			if (arg0 >= arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local13;
					arg3 -= arg1 * local47;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local30;
					arg4 = 0;
				}
				if (arg1 != arg4 && local47 < local13 || arg1 == arg4 && local13 < local30) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt1136 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static196.method3201(arg2 >> 16, this.aByteArray10, arg5 >> 16, arg1);
								arg5 += local30;
								arg1 += this.anInt1136;
								arg2 += local13;
							}
						}
						Static196.method3201(arg2 >> 16, this.aByteArray10, arg3 >> 16, arg1);
						arg3 += local47;
						arg1 += this.anInt1136;
						arg2 += local13;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt1136;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static196.method3201(arg5 >> 16, this.aByteArray10, arg2 >> 16, arg1);
								arg5 += local30;
								arg1 += this.anInt1136;
								arg2 += local13;
							}
						}
						Static196.method3201(arg3 >> 16, this.aByteArray10, arg2 >> 16, arg1);
						arg3 += local47;
						arg2 += local13;
						arg1 += this.anInt1136;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local13;
					arg5 -= local47 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg3 -= local30 * arg0;
					arg0 = 0;
				}
				if ((arg1 == arg0 || local13 <= local47) && (arg1 != arg0 || local47 <= local30)) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt1136;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static196.method3201(arg5 >> 16, this.aByteArray10, arg3 >> 16, arg1);
								arg1 += this.anInt1136;
								arg5 += local47;
								arg3 += local30;
							}
						}
						Static196.method3201(arg5 >> 16, this.aByteArray10, arg2 >> 16, arg1);
						arg1 += this.anInt1136;
						arg5 += local47;
						arg2 += local13;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt1136;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static196.method3201(arg3 >> 16, this.aByteArray10, arg5 >> 16, arg1);
								arg3 += local30;
								arg5 += local47;
								arg1 += this.anInt1136;
							}
						}
						Static196.method3201(arg2 >> 16, this.aByteArray10, arg5 >> 16, arg1);
						arg1 += this.anInt1136;
						arg5 += local47;
						arg2 += local13;
					}
				}
			}
		} else if (arg4 >= arg0) {
			if (arg1 <= arg4) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local30 * arg0;
					arg5 -= arg0 * local13;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local47 * arg1;
					arg1 = 0;
				}
				if (local13 < local30) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt1136;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static196.method3201(arg3 >> 16, this.aByteArray10, arg2 >> 16, arg0);
								arg0 += this.anInt1136;
								arg3 += local30;
								arg2 += local47;
							}
						}
						Static196.method3201(arg3 >> 16, this.aByteArray10, arg5 >> 16, arg0);
						arg5 += local13;
						arg3 += local30;
						arg0 += this.anInt1136;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt1136 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static196.method3201(arg2 >> 16, this.aByteArray10, arg3 >> 16, arg0);
								arg3 += local30;
								arg0 += this.anInt1136;
								arg2 += local47;
							}
						}
						Static196.method3201(arg5 >> 16, this.aByteArray10, arg3 >> 16, arg0);
						arg3 += local30;
						arg0 += this.anInt1136;
						arg5 += local13;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local13 * arg0;
					arg3 -= local30 * arg0;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg5 -= local47 * arg4;
					arg4 = 0;
				}
				if ((arg4 == arg0 || local13 >= local30) && (arg4 != arg0 || local47 >= local13)) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt1136 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static196.method3201(arg2 >> 16, this.aByteArray10, arg5 >> 16, arg0);
								arg5 += local47;
								arg2 += local13;
								arg0 += this.anInt1136;
							}
						}
						Static196.method3201(arg2 >> 16, this.aByteArray10, arg3 >> 16, arg0);
						arg3 += local30;
						arg0 += this.anInt1136;
						arg2 += local13;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt1136;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static196.method3201(arg5 >> 16, this.aByteArray10, arg2 >> 16, arg0);
								arg0 += this.anInt1136;
								arg2 += local13;
								arg5 += local47;
							}
						}
						Static196.method3201(arg3 >> 16, this.aByteArray10, arg2 >> 16, arg0);
						arg0 += this.anInt1136;
						arg2 += local13;
						arg3 += local30;
					}
				}
			}
		} else if (arg0 <= arg1) {
			arg2 = arg5 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local47;
				arg2 -= arg4 * local30;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg3 -= arg0 * local13;
				arg0 = 0;
			}
			if (local30 >= local47) {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt1136;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static196.method3201(arg3 >> 16, this.aByteArray10, arg5 >> 16, arg4);
							arg3 += local13;
							arg4 += this.anInt1136;
							arg5 += local47;
						}
					}
					Static196.method3201(arg2 >> 16, this.aByteArray10, arg5 >> 16, arg4);
					arg4 += this.anInt1136;
					arg5 += local47;
					arg2 += local30;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt1136 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static196.method3201(arg5 >> 16, this.aByteArray10, arg3 >> 16, arg4);
							arg4 += this.anInt1136;
							arg3 += local13;
							arg5 += local47;
						}
					}
					Static196.method3201(arg5 >> 16, this.aByteArray10, arg2 >> 16, arg4);
					arg2 += local30;
					arg5 += local47;
					arg4 += this.anInt1136;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= local30 * arg4;
				arg5 -= local47 * arg4;
				arg4 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local13 * arg1;
				arg1 = 0;
			}
			if (local30 >= local47) {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt1136;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static196.method3201(arg3 >> 16, this.aByteArray10, arg2 >> 16, arg4);
							arg2 += local13;
							arg4 += this.anInt1136;
							arg3 += local30;
						}
					}
					Static196.method3201(arg3 >> 16, this.aByteArray10, arg5 >> 16, arg4);
					arg5 += local47;
					arg3 += local30;
					arg4 += this.anInt1136;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt1136;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static196.method3201(arg2 >> 16, this.aByteArray10, arg3 >> 16, arg4);
							arg2 += local13;
							arg4 += this.anInt1136;
							arg3 += local30;
						}
					}
					Static196.method3201(arg5 >> 16, this.aByteArray10, arg3 >> 16, arg4);
					arg3 += local30;
					arg5 += local47;
					arg4 += this.anInt1136;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI)Z")
	public boolean method997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray10.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public void method998() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray10.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
		}
		while (local13 < this.aByteArray10.length - 1) {
			local13++;
			this.aByteArray10[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBII)V")
	public void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1136 = arg2 - arg3;
		this.anInt1144 = arg3;
		this.anInt1138 = arg0 - arg1;
		this.anInt1135 = arg1;
	}
}
