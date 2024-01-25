import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub2_Sub1_Sub1 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!tt;II)V")
	public Class5_Sub2_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray2 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
	public void method143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg0) {
			local7 = (arg5 - arg3 << 16) / (arg4 - arg0);
		}
		@Pc(27) int local27 = 0;
		if (arg4 != arg1) {
			local27 = (arg2 - arg5 << 16) / (arg1 - arg4);
		}
		@Pc(47) int local47 = 0;
		if (arg1 != arg0) {
			local47 = (arg3 - arg2 << 16) / (arg0 - arg1);
		}
		if (arg0 <= arg4 && arg1 >= arg0) {
			if (arg4 >= arg1) {
				arg5 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local7;
					arg5 -= local47 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg2 -= arg1 * local27;
					arg1 = 0;
				}
				if (arg0 != arg1 && local7 > local47 || arg0 == arg1 && local7 < local27) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt193 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static129.method1799(arg2 >> 16, arg0, this.aByteArray2, arg3 >> 16);
								arg0 += this.anInt193;
								arg2 += local27;
								arg3 += local7;
							}
						}
						Static129.method1799(arg5 >> 16, arg0, this.aByteArray2, arg3 >> 16);
						arg0 += this.anInt193;
						arg3 += local7;
						arg5 += local47;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt193;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static129.method1799(arg3 >> 16, arg0, this.aByteArray2, arg2 >> 16);
								arg0 += this.anInt193;
								arg2 += local27;
								arg3 += local7;
							}
						}
						Static129.method1799(arg3 >> 16, arg0, this.aByteArray2, arg5 >> 16);
						arg5 += local47;
						arg3 += local7;
						arg0 += this.anInt193;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local47;
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local27 * arg4;
					arg4 = 0;
				}
				if ((arg0 == arg4 || local47 >= local7) && (arg0 != arg4 || local27 >= local47)) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt193;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static129.method1799(arg5 >> 16, arg0, this.aByteArray2, arg2 >> 16);
								arg2 += local47;
								arg5 += local27;
								arg0 += this.anInt193;
							}
						}
						Static129.method1799(arg3 >> 16, arg0, this.aByteArray2, arg2 >> 16);
						arg0 += this.anInt193;
						arg2 += local47;
						arg3 += local7;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt193 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static129.method1799(arg2 >> 16, arg0, this.aByteArray2, arg5 >> 16);
								arg0 += this.anInt193;
								arg2 += local47;
								arg5 += local27;
							}
						}
						Static129.method1799(arg2 >> 16, arg0, this.aByteArray2, arg3 >> 16);
						arg3 += local7;
						arg2 += local47;
						arg0 += this.anInt193;
					}
				}
			}
		} else if (arg4 > arg1) {
			if (arg4 <= arg0) {
				arg3 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local27;
					arg2 -= arg1 * local47;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local7 * arg4;
					arg4 = 0;
				}
				if (local27 >= local47) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt193;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static129.method1799(arg2 >> 16, arg1, this.aByteArray2, arg5 >> 16);
								arg2 += local47;
								arg5 += local7;
								arg1 += this.anInt193;
							}
						}
						Static129.method1799(arg2 >> 16, arg1, this.aByteArray2, arg3 >> 16);
						arg1 += this.anInt193;
						arg3 += local27;
						arg2 += local47;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt193 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static129.method1799(arg5 >> 16, arg1, this.aByteArray2, arg2 >> 16);
								arg2 += local47;
								arg5 += local7;
								arg1 += this.anInt193;
							}
						}
						Static129.method1799(arg3 >> 16, arg1, this.aByteArray2, arg2 >> 16);
						arg3 += local27;
						arg2 += local47;
						arg1 += this.anInt193;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local27 * arg1;
					arg2 -= local47 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg3 -= arg0 * local7;
					arg0 = 0;
				}
				if (local27 >= local47) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt193 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static129.method1799(arg3 >> 16, arg1, this.aByteArray2, arg5 >> 16);
								arg5 += local27;
								arg3 += local7;
								arg1 += this.anInt193;
							}
						}
						Static129.method1799(arg2 >> 16, arg1, this.aByteArray2, arg5 >> 16);
						arg1 += this.anInt193;
						arg5 += local27;
						arg2 += local47;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt193;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static129.method1799(arg5 >> 16, arg1, this.aByteArray2, arg3 >> 16);
								arg1 += this.anInt193;
								arg3 += local7;
								arg5 += local27;
							}
						}
						Static129.method1799(arg5 >> 16, arg1, this.aByteArray2, arg2 >> 16);
						arg5 += local27;
						arg2 += local47;
						arg1 += this.anInt193;
					}
				}
			}
		} else if (arg1 >= arg0) {
			arg2 = arg5 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local7 * arg4;
				arg5 -= local27 * arg4;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg3 -= arg0 * local47;
				arg0 = 0;
			}
			if (local7 >= local27) {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt193 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static129.method1799(arg5 >> 16, arg4, this.aByteArray2, arg3 >> 16);
							arg5 += local27;
							arg3 += local47;
							arg4 += this.anInt193;
						}
					}
					Static129.method1799(arg5 >> 16, arg4, this.aByteArray2, arg2 >> 16);
					arg5 += local27;
					arg4 += this.anInt193;
					arg2 += local7;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt193;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static129.method1799(arg3 >> 16, arg4, this.aByteArray2, arg5 >> 16);
							arg4 += this.anInt193;
							arg5 += local27;
							arg3 += local47;
						}
					}
					Static129.method1799(arg2 >> 16, arg4, this.aByteArray2, arg5 >> 16);
					arg4 += this.anInt193;
					arg2 += local7;
					arg5 += local27;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local27;
				arg3 -= arg4 * local7;
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg2 -= arg1 * local47;
				arg1 = 0;
			}
			if (arg1 != arg4 && local7 < local27 || arg4 == arg1 && local47 < local7) {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt193 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static129.method1799(arg3 >> 16, arg4, this.aByteArray2, arg2 >> 16);
							arg3 += local7;
							arg2 += local47;
							arg4 += this.anInt193;
						}
					}
					Static129.method1799(arg3 >> 16, arg4, this.aByteArray2, arg5 >> 16);
					arg5 += local27;
					arg4 += this.anInt193;
					arg3 += local7;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt193 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static129.method1799(arg2 >> 16, arg4, this.aByteArray2, arg3 >> 16);
							arg2 += local47;
							arg4 += this.anInt193;
							arg3 += local7;
						}
					}
					Static129.method1799(arg5 >> 16, arg4, this.aByteArray2, arg3 >> 16);
					arg3 += local7;
					arg5 += local27;
					arg4 += this.anInt193;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIZ)Z")
	public boolean method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray2.length;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIII)V")
	public void method147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt193 = arg1 - arg2;
		this.anInt183 = arg2;
		this.anInt186 = arg3;
		this.anInt192 = arg0 - arg3;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
	public void method150() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray2.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
			local13++;
			this.aByteArray2[local13] = 0;
		}
		while (local13 < this.aByteArray2.length - 1) {
			local13++;
			this.aByteArray2[local13] = 0;
		}
	}
}
