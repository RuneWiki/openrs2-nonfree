import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class4_Sub6_Sub7_Sub1 extends Class4_Sub6_Sub7 {

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	public int anInt4046;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
	public int anInt4049;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!kfa;II)V")
	public Class4_Sub6_Sub7_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray33 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)Z")
	public boolean method3192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray33.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
	public void method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg0) {
			local7 = (arg5 - arg2 << 16) / (arg0 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg1) {
			local28 = (arg4 - arg5 << 16) / (arg1 - arg0);
		}
		@Pc(49) int local49 = 0;
		if (arg3 != arg1) {
			local49 = (arg2 - arg4 << 16) / (arg3 - arg1);
		}
		if (arg0 >= arg3 && arg1 >= arg3) {
			if (arg0 < arg1) {
				arg4 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local49 * arg3;
					arg2 -= local7 * arg3;
					arg3 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local28;
					arg0 = 0;
				}
				if (arg3 != arg0 && local49 < local7 || arg0 == arg3 && local49 > local28) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt4052 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static367.method5536(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray33);
								arg5 += local28;
								arg4 += local49;
								arg3 += this.anInt4052;
							}
						}
						Static367.method5536(arg2 >> 16, arg3, arg4 >> 16, this.aByteArray33);
						arg2 += local7;
						arg4 += local49;
						arg3 += this.anInt4052;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt4052;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static367.method5536(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray33);
								arg4 += local49;
								arg3 += this.anInt4052;
								arg5 += local28;
							}
						}
						Static367.method5536(arg4 >> 16, arg3, arg2 >> 16, this.aByteArray33);
						arg3 += this.anInt4052;
						arg4 += local49;
						arg2 += local7;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local7;
					arg5 -= local49 * arg3;
					arg3 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local28 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg3 || local7 <= local49) && (arg1 != arg3 || local7 >= local28)) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt4052 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static367.method5536(arg4 >> 16, arg3, arg2 >> 16, this.aByteArray33);
								arg3 += this.anInt4052;
								arg4 += local28;
								arg2 += local7;
							}
						}
						Static367.method5536(arg5 >> 16, arg3, arg2 >> 16, this.aByteArray33);
						arg2 += local7;
						arg3 += this.anInt4052;
						arg5 += local49;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt4052;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static367.method5536(arg2 >> 16, arg3, arg4 >> 16, this.aByteArray33);
								arg4 += local28;
								arg2 += local7;
								arg3 += this.anInt4052;
							}
						}
						Static367.method5536(arg2 >> 16, arg3, arg5 >> 16, this.aByteArray33);
						arg5 += local49;
						arg3 += this.anInt4052;
						arg2 += local7;
					}
				}
			}
		} else if (arg1 >= arg0) {
			if (arg3 <= arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local7;
					arg5 -= arg0 * local28;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local49 * arg3;
					arg3 = 0;
				}
				if (local7 < local28) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt4052 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static367.method5536(arg5 >> 16, arg0, arg2 >> 16, this.aByteArray33);
								arg5 += local28;
								arg0 += this.anInt4052;
								arg2 += local49;
							}
						}
						Static367.method5536(arg5 >> 16, arg0, arg4 >> 16, this.aByteArray33);
						arg5 += local28;
						arg4 += local7;
						arg0 += this.anInt4052;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt4052;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static367.method5536(arg2 >> 16, arg0, arg5 >> 16, this.aByteArray33);
								arg2 += local49;
								arg0 += this.anInt4052;
								arg5 += local28;
							}
						}
						Static367.method5536(arg4 >> 16, arg0, arg5 >> 16, this.aByteArray33);
						arg5 += local28;
						arg0 += this.anInt4052;
						arg4 += local7;
					}
				}
			} else {
				arg2 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg5 -= arg0 * local28;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= arg1 * local49;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local28 <= local7) && (arg1 != arg0 || local49 >= local7)) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt4052 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static367.method5536(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray33);
								arg4 += local49;
								arg2 += local7;
								arg0 += this.anInt4052;
							}
						}
						Static367.method5536(arg2 >> 16, arg0, arg5 >> 16, this.aByteArray33);
						arg0 += this.anInt4052;
						arg2 += local7;
						arg5 += local28;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt4052;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static367.method5536(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray33);
								arg2 += local7;
								arg0 += this.anInt4052;
								arg4 += local49;
							}
						}
						Static367.method5536(arg5 >> 16, arg0, arg2 >> 16, this.aByteArray33);
						arg2 += local7;
						arg5 += local28;
						arg0 += this.anInt4052;
					}
				}
			}
		} else if (arg3 >= arg0) {
			arg2 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local28 * arg1;
				arg4 -= arg1 * local49;
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg5 -= arg0 * local7;
				arg0 = 0;
			}
			if (local49 <= local28) {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt4052;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static367.method5536(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray33);
							arg5 += local7;
							arg4 += local49;
							arg1 += this.anInt4052;
						}
					}
					Static367.method5536(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray33);
					arg2 += local28;
					arg4 += local49;
					arg1 += this.anInt4052;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt4052;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static367.method5536(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray33);
							arg5 += local7;
							arg1 += this.anInt4052;
							arg4 += local49;
						}
					}
					Static367.method5536(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray33);
					arg4 += local49;
					arg2 += local28;
					arg1 += this.anInt4052;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local49 * arg1;
				arg5 -= arg1 * local28;
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg2 -= arg3 * local7;
				arg3 = 0;
			}
			if (local49 <= local28) {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt4052;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static367.method5536(arg5 >> 16, arg1, arg2 >> 16, this.aByteArray33);
							arg1 += this.anInt4052;
							arg2 += local7;
							arg5 += local28;
						}
					}
					Static367.method5536(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray33);
					arg1 += this.anInt4052;
					arg5 += local28;
					arg4 += local49;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt4052;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static367.method5536(arg2 >> 16, arg1, arg5 >> 16, this.aByteArray33);
							arg1 += this.anInt4052;
							arg5 += local28;
							arg2 += local7;
						}
					}
					Static367.method5536(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray33);
					arg4 += local49;
					arg1 += this.anInt4052;
					arg5 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V")
	public void method3195() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray33.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
			local15++;
			this.aByteArray33[local15] = 0;
		}
		while (local15 < this.aByteArray33.length - 1) {
			local15++;
			this.aByteArray33[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public void method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4046 = arg2;
		this.anInt4052 = arg3 - arg2;
		this.anInt4044 = arg1;
		this.anInt4049 = arg0 - arg1;
	}
}
