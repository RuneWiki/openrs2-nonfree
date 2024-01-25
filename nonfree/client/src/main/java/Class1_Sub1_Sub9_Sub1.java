import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class1_Sub1_Sub9_Sub1 extends Class1_Sub1_Sub9 {

	@OriginalMember(owner = "client!mda", name = "T", descriptor = "[Lclient!js;")
	private static final Class158[] aClass158Array1 = new Class158[32];

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
	public int anInt5504;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
	public int anInt5506;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
	public int anInt5508;

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "[B")
	public final byte[] aByteArray86;

	static {
		@Pc(95) Class158[] local95 = Static242.method4178();
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			aClass158Array1[local95[local97].anInt4745] = local95[local97];
		}
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!uq;II)V")
	public Class1_Sub1_Sub9_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray86 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
	public void method4712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5506 = arg0;
		this.anInt5508 = arg1 - arg3;
		this.anInt5504 = arg3;
		this.anInt5505 = arg2 - arg0;
	}

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)V")
	public void method4715() {
		@Pc(7) int local7 = -1;
		@Pc(17) int local17 = this.aByteArray86.length - 8;
		while (local17 > local7) {
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
		}
		while (local7 < this.aByteArray86.length - 1) {
			local7++;
			this.aByteArray86[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIIII)V")
	public void method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg5) {
			local7 = (arg4 - arg3 << 16) / (arg1 - arg5);
		}
		@Pc(23) int local23 = 0;
		if (arg1 != arg2) {
			local23 = (arg0 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(44) int local44 = 0;
		if (arg5 != arg2) {
			local44 = (arg3 - arg0 << 16) / (arg5 - arg2);
		}
		if (arg1 >= arg5 && arg2 >= arg5) {
			if (arg2 <= arg1) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local7 * arg5;
					arg4 -= local44 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local23;
					arg2 = 0;
				}
				if (arg2 != arg5 && local44 < local7 || arg5 == arg2 && local7 < local23) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt5508 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static56.method1090(arg0 >> 16, arg5, this.aByteArray86, arg3 >> 16);
								arg3 += local7;
								arg5 += this.anInt5508;
								arg0 += local23;
							}
						}
						Static56.method1090(arg4 >> 16, arg5, this.aByteArray86, arg3 >> 16);
						arg5 += this.anInt5508;
						arg4 += local44;
						arg3 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt5508;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static56.method1090(arg3 >> 16, arg5, this.aByteArray86, arg0 >> 16);
								arg0 += local23;
								arg5 += this.anInt5508;
								arg3 += local7;
							}
						}
						Static56.method1090(arg3 >> 16, arg5, this.aByteArray86, arg4 >> 16);
						arg3 += local7;
						arg5 += this.anInt5508;
						arg4 += local44;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local44;
					arg3 -= local7 * arg5;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg4 -= arg1 * local23;
					arg1 = 0;
				}
				if ((arg5 == arg1 || local7 <= local44) && (arg5 != arg1 || local23 >= local44)) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt5508 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static56.method1090(arg4 >> 16, arg5, this.aByteArray86, arg0 >> 16);
								arg5 += this.anInt5508;
								arg0 += local44;
								arg4 += local23;
							}
						}
						Static56.method1090(arg3 >> 16, arg5, this.aByteArray86, arg0 >> 16);
						arg5 += this.anInt5508;
						arg3 += local7;
						arg0 += local44;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt5508;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static56.method1090(arg0 >> 16, arg5, this.aByteArray86, arg4 >> 16);
								arg5 += this.anInt5508;
								arg0 += local44;
								arg4 += local23;
							}
						}
						Static56.method1090(arg0 >> 16, arg5, this.aByteArray86, arg3 >> 16);
						arg0 += local44;
						arg5 += this.anInt5508;
						arg3 += local7;
					}
				}
			}
		} else if (arg2 < arg1) {
			if (arg1 <= arg5) {
				arg3 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local44;
					arg3 -= arg2 * local23;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg1 = 0;
				}
				if (local44 > local23) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt5508 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static56.method1090(arg4 >> 16, arg2, this.aByteArray86, arg0 >> 16);
								arg0 += local44;
								arg4 += local7;
								arg2 += this.anInt5508;
							}
						}
						Static56.method1090(arg3 >> 16, arg2, this.aByteArray86, arg0 >> 16);
						arg2 += this.anInt5508;
						arg0 += local44;
						arg3 += local23;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt5508 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static56.method1090(arg0 >> 16, arg2, this.aByteArray86, arg4 >> 16);
								arg0 += local44;
								arg2 += this.anInt5508;
								arg4 += local7;
							}
						}
						Static56.method1090(arg0 >> 16, arg2, this.aByteArray86, arg3 >> 16);
						arg3 += local23;
						arg2 += this.anInt5508;
						arg0 += local44;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local44;
					arg4 -= local23 * arg2;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg3 -= local7 * arg5;
					arg5 = 0;
				}
				if (local23 >= local44) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt5508;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static56.method1090(arg3 >> 16, arg2, this.aByteArray86, arg4 >> 16);
								arg2 += this.anInt5508;
								arg4 += local23;
								arg3 += local7;
							}
						}
						Static56.method1090(arg0 >> 16, arg2, this.aByteArray86, arg4 >> 16);
						arg0 += local44;
						arg4 += local23;
						arg2 += this.anInt5508;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt5508 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static56.method1090(arg4 >> 16, arg2, this.aByteArray86, arg3 >> 16);
								arg4 += local23;
								arg3 += local7;
								arg2 += this.anInt5508;
							}
						}
						Static56.method1090(arg4 >> 16, arg2, this.aByteArray86, arg0 >> 16);
						arg0 += local44;
						arg2 += this.anInt5508;
						arg4 += local23;
					}
				}
			}
		} else if (arg5 <= arg2) {
			arg0 = arg4 <<= 0x10;
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local7;
				arg4 -= arg1 * local23;
				arg1 = 0;
			}
			if (arg5 < 0) {
				arg3 -= local44 * arg5;
				arg5 = 0;
			}
			if (local7 >= local23) {
				arg2 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt5508 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static56.method1090(arg4 >> 16, arg1, this.aByteArray86, arg3 >> 16);
							arg3 += local44;
							arg1 += this.anInt5508;
							arg4 += local23;
						}
					}
					Static56.method1090(arg4 >> 16, arg1, this.aByteArray86, arg0 >> 16);
					arg0 += local7;
					arg1 += this.anInt5508;
					arg4 += local23;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg1;
				arg1 *= this.anInt5508;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static56.method1090(arg3 >> 16, arg1, this.aByteArray86, arg4 >> 16);
							arg1 += this.anInt5508;
							arg3 += local44;
							arg4 += local23;
						}
					}
					Static56.method1090(arg0 >> 16, arg1, this.aByteArray86, arg4 >> 16);
					arg0 += local7;
					arg1 += this.anInt5508;
					arg4 += local23;
				}
			}
		} else {
			arg3 = arg4 <<= 0x10;
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local23 * arg1;
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg0 -= local44 * arg2;
				arg2 = 0;
			}
			if (arg2 != arg1 && local23 > local7 || arg2 == arg1 && local44 < local7) {
				arg5 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt5508 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static56.method1090(arg3 >> 16, arg1, this.aByteArray86, arg0 >> 16);
							arg1 += this.anInt5508;
							arg0 += local44;
							arg3 += local7;
						}
					}
					Static56.method1090(arg3 >> 16, arg1, this.aByteArray86, arg4 >> 16);
					arg1 += this.anInt5508;
					arg4 += local23;
					arg3 += local7;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt5508 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static56.method1090(arg0 >> 16, arg1, this.aByteArray86, arg3 >> 16);
							arg3 += local7;
							arg0 += local44;
							arg1 += this.anInt5508;
						}
					}
					Static56.method1090(arg4 >> 16, arg1, this.aByteArray86, arg3 >> 16);
					arg4 += local23;
					arg3 += local7;
					arg1 += this.anInt5508;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII)Z")
	public boolean method4718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray86.length;
	}
}
