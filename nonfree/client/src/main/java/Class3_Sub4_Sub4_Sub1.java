import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class3_Sub4_Sub4_Sub1 extends Class3_Sub4_Sub4 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public int anInt1510;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	public int anInt1511;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	public int anInt1512;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	public int anInt1513;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "[B")
	public final byte[] aByteArray20;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class3_Sub4_Sub4_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray20 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	public void method1167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1513 = arg1;
		this.anInt1511 = arg0;
		this.anInt1512 = arg2 - arg0;
		this.anInt1510 = arg3 - arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z")
	public boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray20.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
	public void method1170() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray20.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
			local15++;
			this.aByteArray20[local15] = 0;
		}
		while (this.aByteArray20.length - 1 > local15) {
			local15++;
			this.aByteArray20[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIBI)V")
	public void method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = 0;
		if (arg1 != arg3) {
			local12 = (arg4 - arg5 << 16) / (arg1 - arg3);
		}
		@Pc(33) int local33 = 0;
		if (arg1 != arg0) {
			local33 = (arg2 - arg4 << 16) / (arg0 - arg1);
		}
		@Pc(49) int local49 = 0;
		if (arg0 != arg3) {
			local49 = (arg5 - arg2 << 16) / (arg3 - arg0);
		}
		if (arg1 >= arg3 && arg3 <= arg0) {
			if (arg0 > arg1) {
				arg2 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local49;
					arg5 -= local12 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local33;
					arg1 = 0;
				}
				if (arg1 != arg3 && local12 > local49 || arg3 == arg1 && local49 > local33) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt1512;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static403.method5206(arg2 >> 16, this.aByteArray20, arg3, arg4 >> 16);
								arg4 += local33;
								arg3 += this.anInt1512;
								arg2 += local49;
							}
						}
						Static403.method5206(arg2 >> 16, this.aByteArray20, arg3, arg5 >> 16);
						arg3 += this.anInt1512;
						arg5 += local12;
						arg2 += local49;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt1512;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static403.method5206(arg4 >> 16, this.aByteArray20, arg3, arg2 >> 16);
								arg3 += this.anInt1512;
								arg2 += local49;
								arg4 += local33;
							}
						}
						Static403.method5206(arg5 >> 16, this.aByteArray20, arg3, arg2 >> 16);
						arg2 += local49;
						arg3 += this.anInt1512;
						arg5 += local12;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local49 * arg3;
					arg5 -= arg3 * local12;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local33 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg3 || local49 >= local12) && (arg0 != arg3 || local33 <= local12)) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt1512 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static403.method5206(arg5 >> 16, this.aByteArray20, arg3, arg2 >> 16);
								arg2 += local33;
								arg5 += local12;
								arg3 += this.anInt1512;
							}
						}
						Static403.method5206(arg5 >> 16, this.aByteArray20, arg3, arg4 >> 16);
						arg3 += this.anInt1512;
						arg4 += local49;
						arg5 += local12;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt1512;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static403.method5206(arg2 >> 16, this.aByteArray20, arg3, arg5 >> 16);
								arg5 += local12;
								arg3 += this.anInt1512;
								arg2 += local33;
							}
						}
						Static403.method5206(arg4 >> 16, this.aByteArray20, arg3, arg5 >> 16);
						arg5 += local12;
						arg3 += this.anInt1512;
						arg4 += local49;
					}
				}
			}
		} else if (arg0 >= arg1) {
			if (arg3 <= arg0) {
				arg2 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local12 * arg1;
					arg4 -= local33 * arg1;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg5 -= local49 * arg3;
					arg3 = 0;
				}
				if (local12 >= local33) {
					arg0 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt1512;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static403.method5206(arg4 >> 16, this.aByteArray20, arg1, arg5 >> 16);
								arg1 += this.anInt1512;
								arg4 += local33;
								arg5 += local49;
							}
						}
						Static403.method5206(arg4 >> 16, this.aByteArray20, arg1, arg2 >> 16);
						arg2 += local12;
						arg4 += local33;
						arg1 += this.anInt1512;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt1512 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static403.method5206(arg5 >> 16, this.aByteArray20, arg1, arg4 >> 16);
								arg1 += this.anInt1512;
								arg4 += local33;
								arg5 += local49;
							}
						}
						Static403.method5206(arg2 >> 16, this.aByteArray20, arg1, arg4 >> 16);
						arg2 += local12;
						arg1 += this.anInt1512;
						arg4 += local33;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local12 * arg1;
					arg4 -= arg1 * local33;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local49;
					arg0 = 0;
				}
				if ((arg0 == arg1 || local33 <= local12) && (arg0 != arg1 || local12 <= local49)) {
					arg3 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt1512 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static403.method5206(arg2 >> 16, this.aByteArray20, arg1, arg5 >> 16);
								arg5 += local12;
								arg1 += this.anInt1512;
								arg2 += local49;
							}
						}
						Static403.method5206(arg4 >> 16, this.aByteArray20, arg1, arg5 >> 16);
						arg4 += local33;
						arg5 += local12;
						arg1 += this.anInt1512;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt1512 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static403.method5206(arg5 >> 16, this.aByteArray20, arg1, arg2 >> 16);
								arg5 += local12;
								arg2 += local49;
								arg1 += this.anInt1512;
							}
						}
						Static403.method5206(arg5 >> 16, this.aByteArray20, arg1, arg4 >> 16);
						arg5 += local12;
						arg4 += local33;
						arg1 += this.anInt1512;
					}
				}
			}
		} else if (arg1 > arg3) {
			arg4 = arg2 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= arg0 * local33;
				arg2 -= arg0 * local49;
				arg0 = 0;
			}
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local12 * arg3;
				arg3 = 0;
			}
			if (local33 < local49) {
				arg1 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt1512;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static403.method5206(arg4 >> 16, this.aByteArray20, arg0, arg5 >> 16);
							arg4 += local33;
							arg0 += this.anInt1512;
							arg5 += local12;
						}
					}
					Static403.method5206(arg4 >> 16, this.aByteArray20, arg0, arg2 >> 16);
					arg0 += this.anInt1512;
					arg2 += local49;
					arg4 += local33;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt1512;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static403.method5206(arg5 >> 16, this.aByteArray20, arg0, arg4 >> 16);
							arg4 += local33;
							arg5 += local12;
							arg0 += this.anInt1512;
						}
					}
					Static403.method5206(arg2 >> 16, this.aByteArray20, arg0, arg4 >> 16);
					arg0 += this.anInt1512;
					arg2 += local49;
					arg4 += local33;
				}
			}
		} else {
			arg5 = arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local49;
				arg5 -= arg0 * local33;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local12;
				arg1 = 0;
			}
			if (local33 >= local49) {
				arg3 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt1512;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static403.method5206(arg2 >> 16, this.aByteArray20, arg0, arg4 >> 16);
							arg2 += local49;
							arg0 += this.anInt1512;
							arg4 += local12;
						}
					}
					Static403.method5206(arg2 >> 16, this.aByteArray20, arg0, arg5 >> 16);
					arg5 += local33;
					arg0 += this.anInt1512;
					arg2 += local49;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg0;
				arg0 *= this.anInt1512;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static403.method5206(arg4 >> 16, this.aByteArray20, arg0, arg2 >> 16);
							arg4 += local12;
							arg0 += this.anInt1512;
							arg2 += local49;
						}
					}
					Static403.method5206(arg5 >> 16, this.aByteArray20, arg0, arg2 >> 16);
					arg2 += local49;
					arg5 += local33;
					arg0 += this.anInt1512;
				}
			}
		}
	}
}
