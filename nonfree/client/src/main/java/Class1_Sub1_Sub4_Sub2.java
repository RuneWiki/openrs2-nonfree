import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	public int anInt2910;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public int anInt2916;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!te;II)V")
	public Class1_Sub1_Sub4_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray32 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIBIII)V")
	public void method2712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg1 != arg5) {
			local11 = (arg4 - arg3 << 16) / (arg1 - arg5);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg1) {
			local28 = (arg2 - arg4 << 16) / (arg0 - arg1);
		}
		@Pc(44) int local44 = 0;
		if (arg5 != arg0) {
			local44 = (arg3 - arg2 << 16) / (arg5 - arg0);
		}
		if (arg5 <= arg1 && arg0 >= arg5) {
			if (arg1 < arg0) {
				arg2 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local44 * arg5;
					arg3 -= arg5 * local11;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local28;
					arg1 = 0;
				}
				if (arg5 != arg1 && local11 > local44 || arg1 == arg5 && local44 > local28) {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt2912;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static299.method3935(arg4 >> 16, arg5, arg2 >> 16, this.aByteArray32);
								arg2 += local44;
								arg4 += local28;
								arg5 += this.anInt2912;
							}
						}
						Static299.method3935(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray32);
						arg5 += this.anInt2912;
						arg3 += local11;
						arg2 += local44;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt2912;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static299.method3935(arg2 >> 16, arg5, arg4 >> 16, this.aByteArray32);
								arg5 += this.anInt2912;
								arg4 += local28;
								arg2 += local44;
							}
						}
						Static299.method3935(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray32);
						arg2 += local44;
						arg5 += this.anInt2912;
						arg3 += local11;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local44;
					arg3 -= local11 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local28;
					arg0 = 0;
				}
				if ((arg5 == arg0 || local44 >= local11) && (arg5 != arg0 || local28 <= local11)) {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2912;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static299.method3935(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray32);
								arg5 += this.anInt2912;
								arg3 += local11;
								arg2 += local28;
							}
						}
						Static299.method3935(arg4 >> 16, arg5, arg3 >> 16, this.aByteArray32);
						arg4 += local44;
						arg3 += local11;
						arg5 += this.anInt2912;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2912;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static299.method3935(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray32);
								arg3 += local11;
								arg2 += local28;
								arg5 += this.anInt2912;
							}
						}
						Static299.method3935(arg3 >> 16, arg5, arg4 >> 16, this.aByteArray32);
						arg3 += local11;
						arg4 += local44;
						arg5 += this.anInt2912;
					}
				}
			}
		} else if (arg0 >= arg1) {
			if (arg5 <= arg0) {
				arg2 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local11 * arg1;
					arg4 -= local28 * arg1;
					arg1 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local44 * arg5;
					arg5 = 0;
				}
				if (local28 <= local11) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt2912;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static299.method3935(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray32);
								arg1 += this.anInt2912;
								arg4 += local28;
								arg3 += local44;
							}
						}
						Static299.method3935(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray32);
						arg4 += local28;
						arg2 += local11;
						arg1 += this.anInt2912;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt2912;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static299.method3935(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray32);
								arg1 += this.anInt2912;
								arg3 += local44;
								arg4 += local28;
							}
						}
						Static299.method3935(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray32);
						arg2 += local11;
						arg4 += local28;
						arg1 += this.anInt2912;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local11;
					arg4 -= arg1 * local28;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg2 -= arg0 * local44;
					arg0 = 0;
				}
				if ((arg0 == arg1 || local28 <= local11) && (arg1 != arg0 || local44 >= local11)) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt2912 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static299.method3935(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray32);
								arg3 += local11;
								arg2 += local44;
								arg1 += this.anInt2912;
							}
						}
						Static299.method3935(arg3 >> 16, arg1, arg4 >> 16, this.aByteArray32);
						arg4 += local28;
						arg1 += this.anInt2912;
						arg3 += local11;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt2912;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static299.method3935(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray32);
								arg3 += local11;
								arg1 += this.anInt2912;
								arg2 += local44;
							}
						}
						Static299.method3935(arg4 >> 16, arg1, arg3 >> 16, this.aByteArray32);
						arg3 += local11;
						arg1 += this.anInt2912;
						arg4 += local28;
					}
				}
			}
		} else if (arg5 < arg1) {
			arg4 = arg2 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= arg0 * local28;
				arg2 -= local44 * arg0;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local11 * arg5;
				arg5 = 0;
			}
			if (local28 < local44) {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt2912 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static299.method3935(arg3 >> 16, arg0, arg4 >> 16, this.aByteArray32);
							arg4 += local28;
							arg3 += local11;
							arg0 += this.anInt2912;
						}
					}
					Static299.method3935(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray32);
					arg0 += this.anInt2912;
					arg2 += local44;
					arg4 += local28;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt2912 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static299.method3935(arg4 >> 16, arg0, arg3 >> 16, this.aByteArray32);
							arg0 += this.anInt2912;
							arg3 += local11;
							arg4 += local28;
						}
					}
					Static299.method3935(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray32);
					arg0 += this.anInt2912;
					arg4 += local28;
					arg2 += local44;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local28 * arg0;
				arg2 -= arg0 * local44;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local11;
				arg1 = 0;
			}
			if (local44 <= local28) {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 = this.anInt2912 * arg0;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static299.method3935(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray32);
							arg2 += local44;
							arg0 += this.anInt2912;
							arg4 += local11;
						}
					}
					Static299.method3935(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray32);
					arg3 += local28;
					arg2 += local44;
					arg0 += this.anInt2912;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 = this.anInt2912 * arg0;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static299.method3935(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray32);
							arg2 += local44;
							arg4 += local11;
							arg0 += this.anInt2912;
						}
					}
					Static299.method3935(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray32);
					arg3 += local28;
					arg2 += local44;
					arg0 += this.anInt2912;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public void method2713() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray32.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
			local7++;
			this.aByteArray32[local7] = 0;
		}
		while (local7 < this.aByteArray32.length - 1) {
			local7++;
			this.aByteArray32[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Z")
	public boolean method2715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray32.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2910 = arg1;
		this.anInt2911 = arg3 - arg1;
		this.anInt2916 = arg0;
		this.anInt2912 = arg2 - arg0;
	}
}
