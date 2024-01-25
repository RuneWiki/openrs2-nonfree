import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub7_Sub17_Sub2 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	public int anInt9949;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public int anInt9951;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	public int anInt9952;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
	public int anInt9953;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "[B")
	public final byte[] aByteArray97;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!aq;II)V")
	public Class3_Sub7_Sub17_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray97 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIII)V")
	public void method8471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9951 = arg1;
		this.anInt9952 = arg0 - arg1;
		this.anInt9949 = arg2;
		this.anInt9953 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIBIIII)V")
	public void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg1) {
			local7 = (arg4 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg0) {
			local24 = (arg2 - arg4 << 16) / (arg5 - arg0);
		}
		@Pc(50) int local50 = 0;
		if (arg1 != arg5) {
			local50 = (arg3 - arg2 << 16) / (arg1 - arg5);
		}
		if (arg0 >= arg1 && arg5 >= arg1) {
			if (arg0 >= arg5) {
				arg4 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg4 -= arg1 * local50;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local24;
					arg5 = 0;
				}
				if (arg1 != arg5 && local50 < local7 || arg1 == arg5 && local24 > local7) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9953;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static655.method8595(arg3 >> 16, arg2 >> 16, arg1, this.aByteArray97);
								arg1 += this.anInt9953;
								arg2 += local24;
								arg3 += local7;
							}
						}
						Static655.method8595(arg3 >> 16, arg4 >> 16, arg1, this.aByteArray97);
						arg4 += local50;
						arg3 += local7;
						arg1 += this.anInt9953;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt9953 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static655.method8595(arg2 >> 16, arg3 >> 16, arg1, this.aByteArray97);
								arg3 += local7;
								arg1 += this.anInt9953;
								arg2 += local24;
							}
						}
						Static655.method8595(arg4 >> 16, arg3 >> 16, arg1, this.aByteArray97);
						arg4 += local50;
						arg3 += local7;
						arg1 += this.anInt9953;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg2 -= arg1 * local50;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg4 -= local24 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg1 || local50 >= local7) && (arg0 != arg1 || local24 >= local50)) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt9953;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static655.method8595(arg2 >> 16, arg4 >> 16, arg1, this.aByteArray97);
								arg4 += local24;
								arg1 += this.anInt9953;
								arg2 += local50;
							}
						}
						Static655.method8595(arg2 >> 16, arg3 >> 16, arg1, this.aByteArray97);
						arg1 += this.anInt9953;
						arg3 += local7;
						arg2 += local50;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt9953 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static655.method8595(arg4 >> 16, arg2 >> 16, arg1, this.aByteArray97);
								arg2 += local50;
								arg1 += this.anInt9953;
								arg4 += local24;
							}
						}
						Static655.method8595(arg3 >> 16, arg2 >> 16, arg1, this.aByteArray97);
						arg2 += local50;
						arg1 += this.anInt9953;
						arg3 += local7;
					}
				}
			}
		} else if (arg5 >= arg0) {
			if (arg1 <= arg5) {
				arg2 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg4 -= arg0 * local24;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local50;
					arg1 = 0;
				}
				if (local7 < local24) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt9953;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static655.method8595(arg4 >> 16, arg3 >> 16, arg0, this.aByteArray97);
								arg0 += this.anInt9953;
								arg3 += local50;
								arg4 += local24;
							}
						}
						Static655.method8595(arg4 >> 16, arg2 >> 16, arg0, this.aByteArray97);
						arg0 += this.anInt9953;
						arg4 += local24;
						arg2 += local7;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt9953 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static655.method8595(arg3 >> 16, arg4 >> 16, arg0, this.aByteArray97);
								arg0 += this.anInt9953;
								arg3 += local50;
								arg4 += local24;
							}
						}
						Static655.method8595(arg2 >> 16, arg4 >> 16, arg0, this.aByteArray97);
						arg0 += this.anInt9953;
						arg2 += local7;
						arg4 += local24;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg4 -= local24 * arg0;
					arg0 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local50;
					arg5 = 0;
				}
				if ((arg5 == arg0 || local24 <= local7) && (arg5 != arg0 || local7 <= local50)) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt9953;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static655.method8595(arg3 >> 16, arg2 >> 16, arg0, this.aByteArray97);
								arg2 += local50;
								arg0 += this.anInt9953;
								arg3 += local7;
							}
						}
						Static655.method8595(arg3 >> 16, arg4 >> 16, arg0, this.aByteArray97);
						arg0 += this.anInt9953;
						arg3 += local7;
						arg4 += local24;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt9953 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static655.method8595(arg2 >> 16, arg3 >> 16, arg0, this.aByteArray97);
								arg2 += local50;
								arg0 += this.anInt9953;
								arg3 += local7;
							}
						}
						Static655.method8595(arg4 >> 16, arg3 >> 16, arg0, this.aByteArray97);
						arg4 += local24;
						arg0 += this.anInt9953;
						arg3 += local7;
					}
				}
			}
		} else if (arg0 > arg1) {
			arg4 = arg2 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local50 * arg5;
				arg4 -= local24 * arg5;
				arg5 = 0;
			}
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local50 > local24) {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt9953;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static655.method8595(arg3 >> 16, arg4 >> 16, arg5, this.aByteArray97);
							arg3 += local7;
							arg5 += this.anInt9953;
							arg4 += local24;
						}
					}
					Static655.method8595(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray97);
					arg2 += local50;
					arg4 += local24;
					arg5 += this.anInt9953;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt9953 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static655.method8595(arg4 >> 16, arg3 >> 16, arg5, this.aByteArray97);
							arg5 += this.anInt9953;
							arg3 += local7;
							arg4 += local24;
						}
					}
					Static655.method8595(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray97);
					arg2 += local50;
					arg5 += this.anInt9953;
					arg4 += local24;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local50;
				arg3 -= local24 * arg5;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg0 = 0;
			}
			if (local50 <= local24) {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt9953;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static655.method8595(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray97);
							arg2 += local50;
							arg4 += local7;
							arg5 += this.anInt9953;
						}
					}
					Static655.method8595(arg3 >> 16, arg2 >> 16, arg5, this.aByteArray97);
					arg2 += local50;
					arg5 += this.anInt9953;
					arg3 += local24;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt9953;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static655.method8595(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray97);
							arg2 += local50;
							arg4 += local7;
							arg5 += this.anInt9953;
						}
					}
					Static655.method8595(arg2 >> 16, arg3 >> 16, arg5, this.aByteArray97);
					arg3 += local24;
					arg5 += this.anInt9953;
					arg2 += local50;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public void method8473() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray97.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
			local15++;
			this.aByteArray97[local15] = 0;
		}
		while (local15 < this.aByteArray97.length - 1) {
			local15++;
			this.aByteArray97[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BII)Z")
	public boolean method8475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray97.length;
	}
}
