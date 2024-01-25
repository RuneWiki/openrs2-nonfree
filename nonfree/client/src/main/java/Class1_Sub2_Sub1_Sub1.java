import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "[I")
	public static final int[] anIntArray8 = new int[32];

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "[B")
	public final byte[] aByteArray2;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray8[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class1_Sub2_Sub1_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray2 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZII)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg0) {
			local7 = (arg4 - arg5 << 16) / (arg1 - arg0);
		}
		@Pc(33) int local33 = 0;
		if (arg1 != arg2) {
			local33 = (arg3 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(50) int local50 = 0;
		if (arg0 != arg2) {
			local50 = (arg5 - arg3 << 16) / (arg0 - arg2);
		}
		if (arg1 >= arg0 && arg0 <= arg2) {
			if (arg2 <= arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local50 * arg0;
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local33 * arg2;
					arg2 = 0;
				}
				if (arg0 != arg2 && local50 < local7 || arg0 == arg2 && local33 > local7) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt61 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static163.method2640(arg0, arg5 >> 16, this.aByteArray2, arg3 >> 16);
								arg3 += local33;
								arg5 += local7;
								arg0 += this.anInt61;
							}
						}
						Static163.method2640(arg0, arg5 >> 16, this.aByteArray2, arg4 >> 16);
						arg4 += local50;
						arg0 += this.anInt61;
						arg5 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt61;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static163.method2640(arg0, arg3 >> 16, this.aByteArray2, arg5 >> 16);
								arg5 += local7;
								arg0 += this.anInt61;
								arg3 += local33;
							}
						}
						Static163.method2640(arg0, arg4 >> 16, this.aByteArray2, arg5 >> 16);
						arg4 += local50;
						arg5 += local7;
						arg0 += this.anInt61;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local50;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg4 -= arg1 * local33;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local50 >= local7) && (arg0 != arg1 || local50 <= local33)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt61;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static163.method2640(arg0, arg3 >> 16, this.aByteArray2, arg4 >> 16);
								arg0 += this.anInt61;
								arg4 += local33;
								arg3 += local50;
							}
						}
						Static163.method2640(arg0, arg3 >> 16, this.aByteArray2, arg5 >> 16);
						arg3 += local50;
						arg5 += local7;
						arg0 += this.anInt61;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt61 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static163.method2640(arg0, arg4 >> 16, this.aByteArray2, arg3 >> 16);
								arg4 += local33;
								arg3 += local50;
								arg0 += this.anInt61;
							}
						}
						Static163.method2640(arg0, arg5 >> 16, this.aByteArray2, arg3 >> 16);
						arg3 += local50;
						arg0 += this.anInt61;
						arg5 += local7;
					}
				}
			}
		} else if (arg2 >= arg1) {
			if (arg0 <= arg2) {
				arg3 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local33 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local50;
					arg0 = 0;
				}
				if (local33 <= local7) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt61 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static163.method2640(arg1, arg5 >> 16, this.aByteArray2, arg4 >> 16);
								arg1 += this.anInt61;
								arg4 += local33;
								arg5 += local50;
							}
						}
						Static163.method2640(arg1, arg3 >> 16, this.aByteArray2, arg4 >> 16);
						arg4 += local33;
						arg1 += this.anInt61;
						arg3 += local7;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt61 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static163.method2640(arg1, arg4 >> 16, this.aByteArray2, arg5 >> 16);
								arg1 += this.anInt61;
								arg5 += local50;
								arg4 += local33;
							}
						}
						Static163.method2640(arg1, arg4 >> 16, this.aByteArray2, arg3 >> 16);
						arg3 += local7;
						arg1 += this.anInt61;
						arg4 += local33;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local33;
					arg5 -= arg1 * local7;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local50 * arg2;
					arg2 = 0;
				}
				if ((arg1 == arg2 || local7 >= local33) && (arg2 != arg1 || local7 <= local50)) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt61 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static163.method2640(arg1, arg5 >> 16, this.aByteArray2, arg3 >> 16);
								arg1 += this.anInt61;
								arg3 += local50;
								arg5 += local7;
							}
						}
						Static163.method2640(arg1, arg5 >> 16, this.aByteArray2, arg4 >> 16);
						arg4 += local33;
						arg5 += local7;
						arg1 += this.anInt61;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt61;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static163.method2640(arg1, arg3 >> 16, this.aByteArray2, arg5 >> 16);
								arg5 += local7;
								arg3 += local50;
								arg1 += this.anInt61;
							}
						}
						Static163.method2640(arg1, arg4 >> 16, this.aByteArray2, arg5 >> 16);
						arg1 += this.anInt61;
						arg4 += local33;
						arg5 += local7;
					}
				}
			}
		} else if (arg0 >= arg1) {
			arg5 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local50;
				arg5 -= local33 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local7 * arg1;
				arg1 = 0;
			}
			if (local50 > local33) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt61;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static163.method2640(arg2, arg3 >> 16, this.aByteArray2, arg4 >> 16);
							arg4 += local7;
							arg3 += local50;
							arg2 += this.anInt61;
						}
					}
					Static163.method2640(arg2, arg3 >> 16, this.aByteArray2, arg5 >> 16);
					arg5 += local33;
					arg2 += this.anInt61;
					arg3 += local50;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt61;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static163.method2640(arg2, arg4 >> 16, this.aByteArray2, arg3 >> 16);
							arg3 += local50;
							arg2 += this.anInt61;
							arg4 += local7;
						}
					}
					Static163.method2640(arg2, arg5 >> 16, this.aByteArray2, arg3 >> 16);
					arg3 += local50;
					arg5 += local33;
					arg2 += this.anInt61;
				}
			}
		} else {
			arg4 = arg3 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local50 * arg2;
				arg4 -= local33 * arg2;
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg5 -= local7 * arg0;
				arg0 = 0;
			}
			if (local33 < local50) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt61;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static163.method2640(arg2, arg5 >> 16, this.aByteArray2, arg4 >> 16);
							arg2 += this.anInt61;
							arg4 += local33;
							arg5 += local7;
						}
					}
					Static163.method2640(arg2, arg3 >> 16, this.aByteArray2, arg4 >> 16);
					arg3 += local50;
					arg4 += local33;
					arg2 += this.anInt61;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt61;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static163.method2640(arg2, arg4 >> 16, this.aByteArray2, arg5 >> 16);
							arg2 += this.anInt61;
							arg4 += local33;
							arg5 += local7;
						}
					}
					Static163.method2640(arg2, arg4 >> 16, this.aByteArray2, arg3 >> 16);
					arg2 += this.anInt61;
					arg4 += local33;
					arg3 += local50;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "(I)V")
	public void method60() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray2.length - 8;
		while (local13 < local19) {
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
		while (this.aByteArray2.length - 1 > local13) {
			local13++;
			this.aByteArray2[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Z")
	public boolean method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray2.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V")
	public void method62(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt58 = arg1 - arg3;
		this.anInt57 = arg0;
		this.anInt61 = arg2 - arg0;
		this.anInt53 = arg3;
	}
}
