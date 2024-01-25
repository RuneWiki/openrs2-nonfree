import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class6_Sub4_Sub2_Sub1 extends Class6_Sub4_Sub2 {

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!caa", name = "G", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!caa", name = "I", descriptor = "I")
	public int anInt1438;

	@OriginalMember(owner = "client!caa", name = "H", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!ap;II)V")
	public Class6_Sub4_Sub2_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray34 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V")
	public void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1433 = arg1 - arg3;
		this.anInt1434 = arg2 - arg0;
		this.anInt1437 = arg0;
		this.anInt1438 = arg3;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIIIII)V")
	public void method1260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg0) {
			local7 = (arg1 - arg2 << 16) / (arg0 - arg3);
		}
		@Pc(33) int local33 = 0;
		if (arg0 != arg5) {
			local33 = (arg4 - arg1 << 16) / (arg5 - arg0);
		}
		@Pc(49) int local49 = 0;
		if (arg3 != arg5) {
			local49 = (arg2 - arg4 << 16) / (arg3 - arg5);
		}
		if (arg3 <= arg0 && arg3 <= arg5) {
			if (arg5 <= arg0) {
				arg1 = arg2 <<= 0x10;
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local7 * arg3;
					arg1 -= arg3 * local49;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg4 -= arg5 * local33;
					arg5 = 0;
				}
				if (arg5 != arg3 && local49 < local7 || arg3 == arg5 && local7 < local33) {
					arg0 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt1433;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg2 >> 16, arg3, arg4 >> 16);
								arg4 += local33;
								arg3 += this.anInt1433;
								arg2 += local7;
							}
						}
						Static243.method4251(this.aByteArray34, arg2 >> 16, arg3, arg1 >> 16);
						arg1 += local49;
						arg2 += local7;
						arg3 += this.anInt1433;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt1433 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg4 >> 16, arg3, arg2 >> 16);
								arg4 += local33;
								arg2 += local7;
								arg3 += this.anInt1433;
							}
						}
						Static243.method4251(this.aByteArray34, arg1 >> 16, arg3, arg2 >> 16);
						arg2 += local7;
						arg1 += local49;
						arg3 += this.anInt1433;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local7;
					arg4 -= arg3 * local49;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local33 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg3 || local49 >= local7) && (arg0 != arg3 || local49 <= local33)) {
					arg5 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt1433;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg4 >> 16, arg3, arg1 >> 16);
								arg3 += this.anInt1433;
								arg4 += local49;
								arg1 += local33;
							}
						}
						Static243.method4251(this.aByteArray34, arg4 >> 16, arg3, arg2 >> 16);
						arg2 += local7;
						arg3 += this.anInt1433;
						arg4 += local49;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt1433;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg1 >> 16, arg3, arg4 >> 16);
								arg1 += local33;
								arg3 += this.anInt1433;
								arg4 += local49;
							}
						}
						Static243.method4251(this.aByteArray34, arg2 >> 16, arg3, arg4 >> 16);
						arg4 += local49;
						arg2 += local7;
						arg3 += this.anInt1433;
					}
				}
			}
		} else if (arg5 < arg0) {
			if (arg0 <= arg3) {
				arg2 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local33;
					arg4 -= arg5 * local49;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg1 -= local7 * arg0;
					arg0 = 0;
				}
				if (local49 > local33) {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt1433;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg4 >> 16, arg5, arg1 >> 16);
								arg5 += this.anInt1433;
								arg4 += local49;
								arg1 += local7;
							}
						}
						Static243.method4251(this.aByteArray34, arg4 >> 16, arg5, arg2 >> 16);
						arg2 += local33;
						arg4 += local49;
						arg5 += this.anInt1433;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt1433;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg1 >> 16, arg5, arg4 >> 16);
								arg5 += this.anInt1433;
								arg1 += local7;
								arg4 += local49;
							}
						}
						Static243.method4251(this.aByteArray34, arg2 >> 16, arg5, arg4 >> 16);
						arg5 += this.anInt1433;
						arg4 += local49;
						arg2 += local33;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local49 * arg5;
					arg1 -= local33 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local7;
					arg3 = 0;
				}
				if (local49 > local33) {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt1433 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg2 >> 16, arg5, arg1 >> 16);
								arg5 += this.anInt1433;
								arg1 += local33;
								arg2 += local7;
							}
						}
						Static243.method4251(this.aByteArray34, arg4 >> 16, arg5, arg1 >> 16);
						arg5 += this.anInt1433;
						arg4 += local49;
						arg1 += local33;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt1433;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static243.method4251(this.aByteArray34, arg1 >> 16, arg5, arg2 >> 16);
								arg2 += local7;
								arg1 += local33;
								arg5 += this.anInt1433;
							}
						}
						Static243.method4251(this.aByteArray34, arg1 >> 16, arg5, arg4 >> 16);
						arg5 += this.anInt1433;
						arg4 += local49;
						arg1 += local33;
					}
				}
			}
		} else if (arg5 >= arg3) {
			arg4 = arg1 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= arg0 * local7;
				arg1 -= local33 * arg0;
				arg0 = 0;
			}
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local49;
				arg3 = 0;
			}
			if (local33 <= local7) {
				arg5 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt1433;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static243.method4251(this.aByteArray34, arg2 >> 16, arg0, arg1 >> 16);
							arg2 += local49;
							arg1 += local33;
							arg0 += this.anInt1433;
						}
					}
					Static243.method4251(this.aByteArray34, arg4 >> 16, arg0, arg1 >> 16);
					arg4 += local7;
					arg1 += local33;
					arg0 += this.anInt1433;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt1433 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static243.method4251(this.aByteArray34, arg1 >> 16, arg0, arg2 >> 16);
							arg1 += local33;
							arg2 += local49;
							arg0 += this.anInt1433;
						}
					}
					Static243.method4251(this.aByteArray34, arg1 >> 16, arg0, arg4 >> 16);
					arg4 += local7;
					arg0 += this.anInt1433;
					arg1 += local33;
				}
			}
		} else {
			arg2 = arg1 <<= 0x10;
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= local33 * arg0;
				arg2 -= arg0 * local7;
				arg0 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local49 * arg5;
				arg5 = 0;
			}
			if (arg0 != arg5 && local33 > local7 || arg0 == arg5 && local49 < local7) {
				arg3 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt1433;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static243.method4251(this.aByteArray34, arg4 >> 16, arg0, arg2 >> 16);
							arg0 += this.anInt1433;
							arg4 += local49;
							arg2 += local7;
						}
					}
					Static243.method4251(this.aByteArray34, arg1 >> 16, arg0, arg2 >> 16);
					arg1 += local33;
					arg2 += local7;
					arg0 += this.anInt1433;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt1433;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static243.method4251(this.aByteArray34, arg2 >> 16, arg0, arg4 >> 16);
							arg0 += this.anInt1433;
							arg2 += local7;
							arg4 += local49;
						}
					}
					Static243.method4251(this.aByteArray34, arg2 >> 16, arg0, arg1 >> 16);
					arg0 += this.anInt1433;
					arg1 += local33;
					arg2 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)Z")
	public boolean method1262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray34.length;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
	public void method1265() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray34.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
			local7++;
			this.aByteArray34[local7] = 0;
		}
		while (this.aByteArray34.length - 1 > local7) {
			local7++;
			this.aByteArray34[local7] = 0;
		}
	}
}
