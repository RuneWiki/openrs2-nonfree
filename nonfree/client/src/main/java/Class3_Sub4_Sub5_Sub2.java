import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class3_Sub4_Sub5_Sub2 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
	public int anInt4141;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
	public int anInt4145;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
	public int anInt4146;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ch;II)V")
	public Class3_Sub4_Sub5_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray52 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public void method3675() {
		@Pc(7) int local7 = -1;
		@Pc(17) int local17 = this.aByteArray52.length - 8;
		while (local7 < local17) {
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
		}
		while (this.aByteArray52.length - 1 > local7) {
			local7++;
			this.aByteArray52[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)Z")
	public boolean method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray52.length;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIBIII)V")
	public void method3678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg3) {
			local7 = (arg1 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg4) {
			local27 = (arg5 - arg1 << 16) / (arg4 - arg3);
		}
		@Pc(47) int local47 = 0;
		if (arg2 != arg4) {
			local47 = (arg0 - arg5 << 16) / (arg2 - arg4);
		}
		if (arg2 <= arg3 && arg2 <= arg4) {
			if (arg4 > arg3) {
				arg5 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg5 -= arg2 * local47;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local27 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local7 > local47 || arg2 == arg3 && local27 < local47) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt4150 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static333.method1856(arg5 >> 16, arg1 >> 16, arg2, this.aByteArray52);
								arg5 += local47;
								arg2 += this.anInt4150;
								arg1 += local27;
							}
						}
						Static333.method1856(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray52);
						arg5 += local47;
						arg2 += this.anInt4150;
						arg0 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt4150;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static333.method1856(arg1 >> 16, arg5 >> 16, arg2, this.aByteArray52);
								arg2 += this.anInt4150;
								arg1 += local27;
								arg5 += local47;
							}
						}
						Static333.method1856(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray52);
						arg2 += this.anInt4150;
						arg5 += local47;
						arg0 += local7;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg1 -= arg2 * local47;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local27 * arg4;
					arg4 = 0;
				}
				if ((arg2 == arg4 || local47 >= local7) && (arg4 != arg2 || local7 >= local27)) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt4150;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static333.method1856(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray52);
								arg2 += this.anInt4150;
								arg0 += local7;
								arg5 += local27;
							}
						}
						Static333.method1856(arg0 >> 16, arg1 >> 16, arg2, this.aByteArray52);
						arg0 += local7;
						arg1 += local47;
						arg2 += this.anInt4150;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt4150;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static333.method1856(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray52);
								arg0 += local7;
								arg5 += local27;
								arg2 += this.anInt4150;
							}
						}
						Static333.method1856(arg1 >> 16, arg0 >> 16, arg2, this.aByteArray52);
						arg2 += this.anInt4150;
						arg0 += local7;
						arg1 += local47;
					}
				}
			}
		} else if (arg4 >= arg3) {
			if (arg2 <= arg4) {
				arg5 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local7 * arg3;
					arg1 -= arg3 * local27;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local47;
					arg2 = 0;
				}
				if (local27 <= local7) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt4150;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static333.method1856(arg1 >> 16, arg0 >> 16, arg3, this.aByteArray52);
								arg0 += local47;
								arg1 += local27;
								arg3 += this.anInt4150;
							}
						}
						Static333.method1856(arg1 >> 16, arg5 >> 16, arg3, this.aByteArray52);
						arg3 += this.anInt4150;
						arg5 += local7;
						arg1 += local27;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt4150;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static333.method1856(arg0 >> 16, arg1 >> 16, arg3, this.aByteArray52);
								arg1 += local27;
								arg3 += this.anInt4150;
								arg0 += local47;
							}
						}
						Static333.method1856(arg5 >> 16, arg1 >> 16, arg3, this.aByteArray52);
						arg3 += this.anInt4150;
						arg1 += local27;
						arg5 += local7;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local27;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local47;
					arg4 = 0;
				}
				if ((arg3 == arg4 || local7 >= local27) && (arg4 != arg3 || local7 <= local47)) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt4150 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static333.method1856(arg5 >> 16, arg0 >> 16, arg3, this.aByteArray52);
								arg5 += local47;
								arg0 += local7;
								arg3 += this.anInt4150;
							}
						}
						Static333.method1856(arg1 >> 16, arg0 >> 16, arg3, this.aByteArray52);
						arg1 += local27;
						arg0 += local7;
						arg3 += this.anInt4150;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt4150;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static333.method1856(arg0 >> 16, arg5 >> 16, arg3, this.aByteArray52);
								arg0 += local7;
								arg3 += this.anInt4150;
								arg5 += local47;
							}
						}
						Static333.method1856(arg0 >> 16, arg1 >> 16, arg3, this.aByteArray52);
						arg1 += local27;
						arg3 += this.anInt4150;
						arg0 += local7;
					}
				}
			}
		} else if (arg2 < arg3) {
			arg1 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local47;
				arg1 -= arg4 * local27;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local7 * arg2;
				arg2 = 0;
			}
			if (local47 <= local27) {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt4150 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static333.method1856(arg0 >> 16, arg1 >> 16, arg4, this.aByteArray52);
							arg0 += local7;
							arg1 += local27;
							arg4 += this.anInt4150;
						}
					}
					Static333.method1856(arg5 >> 16, arg1 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4150;
					arg5 += local47;
					arg1 += local27;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt4150;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static333.method1856(arg1 >> 16, arg0 >> 16, arg4, this.aByteArray52);
							arg4 += this.anInt4150;
							arg1 += local27;
							arg0 += local7;
						}
					}
					Static333.method1856(arg1 >> 16, arg5 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4150;
					arg5 += local47;
					arg1 += local27;
				}
			}
		} else {
			arg0 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local27 * arg4;
				arg5 -= arg4 * local47;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg1 -= local7 * arg3;
				arg3 = 0;
			}
			if (local27 >= local47) {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt4150 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static333.method1856(arg5 >> 16, arg1 >> 16, arg4, this.aByteArray52);
							arg5 += local47;
							arg4 += this.anInt4150;
							arg1 += local7;
						}
					}
					Static333.method1856(arg5 >> 16, arg0 >> 16, arg4, this.aByteArray52);
					arg5 += local47;
					arg0 += local27;
					arg4 += this.anInt4150;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt4150 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static333.method1856(arg1 >> 16, arg5 >> 16, arg4, this.aByteArray52);
							arg5 += local47;
							arg1 += local7;
							arg4 += this.anInt4150;
						}
					}
					Static333.method1856(arg0 >> 16, arg5 >> 16, arg4, this.aByteArray52);
					arg4 += this.anInt4150;
					arg5 += local47;
					arg0 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4141 = arg3;
		this.anInt4145 = arg0 - arg1;
		this.anInt4146 = arg1;
		this.anInt4150 = arg2 - arg3;
	}
}
