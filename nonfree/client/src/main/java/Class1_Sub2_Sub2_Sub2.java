import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
	public int anInt6873;

	@OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!qba", name = "O", descriptor = "I")
	public int anInt6882;

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "[B")
	public final byte[] aByteArray94;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!mh;II)V")
	public Class1_Sub2_Sub2_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray94 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
	public void method6200() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray94.length - 8;
		while (local12 < local18) {
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
			local12++;
			this.aByteArray94[local12] = 0;
		}
		while (this.aByteArray94.length - 1 > local12) {
			local12++;
			this.aByteArray94[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(III)Z")
	public boolean method6202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray94.length;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIIII)V")
	public void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg0) {
			local7 = (arg5 - arg2 << 16) / (arg0 - arg4);
		}
		@Pc(26) int local26 = 0;
		if (arg1 != arg0) {
			local26 = (arg3 - arg5 << 16) / (arg1 - arg0);
		}
		@Pc(43) int local43 = 0;
		if (arg1 != arg4) {
			local43 = (arg2 - arg3 << 16) / (arg4 - arg1);
		}
		if (arg0 >= arg4 && arg1 >= arg4) {
			if (arg1 <= arg0) {
				arg5 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local43;
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local26 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg4 && local7 > local43 || arg1 == arg4 && local26 > local7) {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt6878;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static115.method2259(arg4, arg3 >> 16, this.aByteArray94, arg2 >> 16);
								arg3 += local26;
								arg4 += this.anInt6878;
								arg2 += local7;
							}
						}
						Static115.method2259(arg4, arg5 >> 16, this.aByteArray94, arg2 >> 16);
						arg5 += local43;
						arg4 += this.anInt6878;
						arg2 += local7;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg4;
					arg4 = this.anInt6878 * arg4;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static115.method2259(arg4, arg2 >> 16, this.aByteArray94, arg3 >> 16);
								arg4 += this.anInt6878;
								arg2 += local7;
								arg3 += local26;
							}
						}
						Static115.method2259(arg4, arg2 >> 16, this.aByteArray94, arg5 >> 16);
						arg2 += local7;
						arg5 += local43;
						arg4 += this.anInt6878;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local7 * arg4;
					arg3 -= arg4 * local43;
					arg4 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local26 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg4 || local43 >= local7) && (arg4 != arg0 || local43 <= local26)) {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 = this.anInt6878 * arg4;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static115.method2259(arg4, arg5 >> 16, this.aByteArray94, arg3 >> 16);
								arg4 += this.anInt6878;
								arg5 += local26;
								arg3 += local43;
							}
						}
						Static115.method2259(arg4, arg2 >> 16, this.aByteArray94, arg3 >> 16);
						arg2 += local7;
						arg4 += this.anInt6878;
						arg3 += local43;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt6878;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static115.method2259(arg4, arg3 >> 16, this.aByteArray94, arg5 >> 16);
								arg5 += local26;
								arg4 += this.anInt6878;
								arg3 += local43;
							}
						}
						Static115.method2259(arg4, arg3 >> 16, this.aByteArray94, arg2 >> 16);
						arg2 += local7;
						arg4 += this.anInt6878;
						arg3 += local43;
					}
				}
			}
		} else if (arg1 >= arg0) {
			if (arg1 < arg4) {
				arg2 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local26;
					arg2 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= local43 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg0 && local7 < local26 || arg1 == arg0 && local43 < local7) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt6878 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static115.method2259(arg0, arg2 >> 16, this.aByteArray94, arg3 >> 16);
								arg3 += local43;
								arg0 += this.anInt6878;
								arg2 += local7;
							}
						}
						Static115.method2259(arg0, arg2 >> 16, this.aByteArray94, arg5 >> 16);
						arg0 += this.anInt6878;
						arg5 += local26;
						arg2 += local7;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt6878 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static115.method2259(arg0, arg3 >> 16, this.aByteArray94, arg2 >> 16);
								arg0 += this.anInt6878;
								arg2 += local7;
								arg3 += local43;
							}
						}
						Static115.method2259(arg0, arg5 >> 16, this.aByteArray94, arg2 >> 16);
						arg5 += local26;
						arg0 += this.anInt6878;
						arg2 += local7;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local26 * arg0;
					arg3 -= arg0 * local7;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local43;
					arg4 = 0;
				}
				if (local26 <= local7) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt6878 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static115.method2259(arg0, arg5 >> 16, this.aByteArray94, arg2 >> 16);
								arg0 += this.anInt6878;
								arg5 += local26;
								arg2 += local43;
							}
						}
						Static115.method2259(arg0, arg5 >> 16, this.aByteArray94, arg3 >> 16);
						arg0 += this.anInt6878;
						arg3 += local7;
						arg5 += local26;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt6878 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static115.method2259(arg0, arg2 >> 16, this.aByteArray94, arg5 >> 16);
								arg2 += local43;
								arg5 += local26;
								arg0 += this.anInt6878;
							}
						}
						Static115.method2259(arg0, arg3 >> 16, this.aByteArray94, arg5 >> 16);
						arg3 += local7;
						arg0 += this.anInt6878;
						arg5 += local26;
					}
				}
			}
		} else if (arg0 > arg4) {
			arg5 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local43;
				arg5 -= local26 * arg1;
				arg1 = 0;
			}
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local7 * arg4;
				arg4 = 0;
			}
			if (local26 < local43) {
				arg0 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt6878 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static115.method2259(arg1, arg5 >> 16, this.aByteArray94, arg2 >> 16);
							arg1 += this.anInt6878;
							arg5 += local26;
							arg2 += local7;
						}
					}
					Static115.method2259(arg1, arg5 >> 16, this.aByteArray94, arg3 >> 16);
					arg5 += local26;
					arg3 += local43;
					arg1 += this.anInt6878;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg1;
				arg1 = this.anInt6878 * arg1;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static115.method2259(arg1, arg2 >> 16, this.aByteArray94, arg5 >> 16);
							arg5 += local26;
							arg2 += local7;
							arg1 += this.anInt6878;
						}
					}
					Static115.method2259(arg1, arg3 >> 16, this.aByteArray94, arg5 >> 16);
					arg5 += local26;
					arg3 += local43;
					arg1 += this.anInt6878;
				}
			}
		} else {
			arg2 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local43;
				arg2 -= local26 * arg1;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local7 * arg0;
				arg0 = 0;
			}
			if (local43 > local26) {
				arg4 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt6878;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static115.method2259(arg1, arg5 >> 16, this.aByteArray94, arg3 >> 16);
							arg3 += local43;
							arg1 += this.anInt6878;
							arg5 += local7;
						}
					}
					Static115.method2259(arg1, arg2 >> 16, this.aByteArray94, arg3 >> 16);
					arg1 += this.anInt6878;
					arg3 += local43;
					arg2 += local26;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt6878 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static115.method2259(arg1, arg3 >> 16, this.aByteArray94, arg5 >> 16);
							arg1 += this.anInt6878;
							arg3 += local43;
							arg5 += local7;
						}
					}
					Static115.method2259(arg1, arg3 >> 16, this.aByteArray94, arg2 >> 16);
					arg1 += this.anInt6878;
					arg2 += local26;
					arg3 += local43;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIII)V")
	public void method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6880 = arg0;
		this.anInt6882 = arg1;
		this.anInt6873 = arg2 - arg1;
		this.anInt6878 = arg3 - arg0;
	}
}
