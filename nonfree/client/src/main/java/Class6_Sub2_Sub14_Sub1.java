import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class6_Sub2_Sub14_Sub1 extends Class6_Sub2_Sub14 {

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "I")
	public int anInt6804;

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
	public int anInt6806;

	@OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!kea;II)V")
	public Class6_Sub2_Sub14_Sub1(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray86 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIIZI)V")
	public void method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg1) {
			local7 = (arg5 - arg4 << 16) / (arg1 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg1) {
			local28 = (arg0 - arg5 << 16) / (arg2 - arg1);
		}
		@Pc(45) int local45 = 0;
		if (arg2 != arg3) {
			local45 = (arg4 - arg0 << 16) / (arg3 - arg2);
		}
		if (arg1 >= arg3 && arg2 >= arg3) {
			if (arg1 >= arg2) {
				arg5 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local45;
					arg4 -= arg3 * local7;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local28;
					arg2 = 0;
				}
				if (arg3 != arg2 && local7 > local45 || arg3 == arg2 && local28 > local7) {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6804;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static89.method1673(arg0 >> 16, arg4 >> 16, arg3, this.aByteArray86);
								arg3 += this.anInt6804;
								arg4 += local7;
								arg0 += local28;
							}
						}
						Static89.method1673(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray86);
						arg5 += local45;
						arg4 += local7;
						arg3 += this.anInt6804;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6804;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static89.method1673(arg4 >> 16, arg0 >> 16, arg3, this.aByteArray86);
								arg0 += local28;
								arg4 += local7;
								arg3 += this.anInt6804;
							}
						}
						Static89.method1673(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray86);
						arg5 += local45;
						arg4 += local7;
						arg3 += this.anInt6804;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= local45 * arg3;
					arg4 -= local7 * arg3;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local28 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg3 || local7 <= local45) && (arg1 != arg3 || local28 >= local45)) {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6804 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static89.method1673(arg5 >> 16, arg0 >> 16, arg3, this.aByteArray86);
								arg0 += local45;
								arg3 += this.anInt6804;
								arg5 += local28;
							}
						}
						Static89.method1673(arg4 >> 16, arg0 >> 16, arg3, this.aByteArray86);
						arg0 += local45;
						arg3 += this.anInt6804;
						arg4 += local7;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6804 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static89.method1673(arg0 >> 16, arg5 >> 16, arg3, this.aByteArray86);
								arg0 += local45;
								arg5 += local28;
								arg3 += this.anInt6804;
							}
						}
						Static89.method1673(arg0 >> 16, arg4 >> 16, arg3, this.aByteArray86);
						arg3 += this.anInt6804;
						arg0 += local45;
						arg4 += local7;
					}
				}
			}
		} else if (arg2 >= arg1) {
			if (arg3 <= arg2) {
				arg0 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg5 -= arg1 * local28;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local45 * arg3;
					arg3 = 0;
				}
				if (local28 > local7) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt6804;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static89.method1673(arg4 >> 16, arg5 >> 16, arg1, this.aByteArray86);
								arg4 += local45;
								arg5 += local28;
								arg1 += this.anInt6804;
							}
						}
						Static89.method1673(arg0 >> 16, arg5 >> 16, arg1, this.aByteArray86);
						arg0 += local7;
						arg1 += this.anInt6804;
						arg5 += local28;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt6804;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static89.method1673(arg5 >> 16, arg4 >> 16, arg1, this.aByteArray86);
								arg4 += local45;
								arg1 += this.anInt6804;
								arg5 += local28;
							}
						}
						Static89.method1673(arg5 >> 16, arg0 >> 16, arg1, this.aByteArray86);
						arg1 += this.anInt6804;
						arg5 += local28;
						arg0 += local7;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local28;
					arg4 -= arg1 * local7;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local45 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg1 || local28 <= local7) && (arg2 != arg1 || local45 >= local7)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt6804;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static89.method1673(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray86);
								arg4 += local7;
								arg1 += this.anInt6804;
								arg0 += local45;
							}
						}
						Static89.method1673(arg5 >> 16, arg4 >> 16, arg1, this.aByteArray86);
						arg1 += this.anInt6804;
						arg5 += local28;
						arg4 += local7;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt6804;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static89.method1673(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray86);
								arg4 += local7;
								arg0 += local45;
								arg1 += this.anInt6804;
							}
						}
						Static89.method1673(arg4 >> 16, arg5 >> 16, arg1, this.aByteArray86);
						arg4 += local7;
						arg5 += local28;
						arg1 += this.anInt6804;
					}
				}
			}
		} else if (arg3 >= arg1) {
			arg4 = arg0 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local28 * arg2;
				arg0 -= local45 * arg2;
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg5 -= arg1 * local7;
				arg1 = 0;
			}
			if (local28 < local45) {
				arg3 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt6804;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static89.method1673(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray86);
							arg5 += local7;
							arg2 += this.anInt6804;
							arg0 += local45;
						}
					}
					Static89.method1673(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray86);
					arg0 += local45;
					arg4 += local28;
					arg2 += this.anInt6804;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt6804 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static89.method1673(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray86);
							arg2 += this.anInt6804;
							arg0 += local45;
							arg5 += local7;
						}
					}
					Static89.method1673(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray86);
					arg0 += local45;
					arg2 += this.anInt6804;
					arg4 += local28;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local45 * arg2;
				arg5 -= arg2 * local28;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local7 * arg3;
				arg3 = 0;
			}
			if (local28 < local45) {
				arg1 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt6804;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static89.method1673(arg5 >> 16, arg4 >> 16, arg2, this.aByteArray86);
							arg5 += local28;
							arg4 += local7;
							arg2 += this.anInt6804;
						}
					}
					Static89.method1673(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray86);
					arg5 += local28;
					arg0 += local45;
					arg2 += this.anInt6804;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt6804 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static89.method1673(arg4 >> 16, arg5 >> 16, arg2, this.aByteArray86);
							arg2 += this.anInt6804;
							arg5 += local28;
							arg4 += local7;
						}
					}
					Static89.method1673(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray86);
					arg2 += this.anInt6804;
					arg0 += local45;
					arg5 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
	public boolean method5717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray86.length;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(IIIII)V")
	public void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6805 = arg0;
		this.anInt6804 = arg2 - arg3;
		this.anInt6811 = arg3;
		this.anInt6806 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V")
	public void method5720() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray86.length - 8;
		while (local13 > local7) {
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
		while (this.aByteArray86.length - 1 > local7) {
			local7++;
			this.aByteArray86[local7] = 0;
		}
	}
}
