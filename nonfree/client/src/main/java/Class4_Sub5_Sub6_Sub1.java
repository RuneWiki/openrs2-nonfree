import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class4_Sub5_Sub6_Sub1 extends Class4_Sub5_Sub6 {

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
	public int anInt8626;

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
	public int anInt8628;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
	public int anInt8631;

	@OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
	public int anInt8635;

	@OriginalMember(owner = "client!rr", name = "M", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ifa;II)V")
	public Class4_Sub5_Sub6_Sub1(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray95 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)Z")
	public boolean method7039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray95.length;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
	public void method7040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg0) {
			local7 = (arg1 - arg5 << 16) / (arg3 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg3 != arg2) {
			local28 = (arg4 - arg1 << 16) / (arg2 - arg3);
		}
		@Pc(51) int local51 = 0;
		if (arg2 != arg0) {
			local51 = (arg5 - arg4 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg3 && arg2 >= arg0) {
			if (arg3 < arg2) {
				arg4 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local51 * arg0;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg1 -= local28 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local51 || arg0 == arg3 && local28 < local51) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt8628;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg0, arg4 >> 16, arg1 >> 16);
								arg0 += this.anInt8628;
								arg1 += local28;
								arg4 += local51;
							}
						}
						Static387.method6108(this.aByteArray95, arg0, arg4 >> 16, arg5 >> 16);
						arg0 += this.anInt8628;
						arg5 += local7;
						arg4 += local51;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt8628 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg0, arg1 >> 16, arg4 >> 16);
								arg4 += local51;
								arg0 += this.anInt8628;
								arg1 += local28;
							}
						}
						Static387.method6108(this.aByteArray95, arg0, arg5 >> 16, arg4 >> 16);
						arg5 += local7;
						arg4 += local51;
						arg0 += this.anInt8628;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local7;
					arg1 -= arg0 * local51;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local28 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg0 || local7 <= local51) && (arg2 != arg0 || local7 >= local28)) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt8628;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg0, arg5 >> 16, arg4 >> 16);
								arg4 += local28;
								arg0 += this.anInt8628;
								arg5 += local7;
							}
						}
						Static387.method6108(this.aByteArray95, arg0, arg5 >> 16, arg1 >> 16);
						arg5 += local7;
						arg0 += this.anInt8628;
						arg1 += local51;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt8628;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg0, arg4 >> 16, arg5 >> 16);
								arg5 += local7;
								arg0 += this.anInt8628;
								arg4 += local28;
							}
						}
						Static387.method6108(this.aByteArray95, arg0, arg1 >> 16, arg5 >> 16);
						arg1 += local51;
						arg5 += local7;
						arg0 += this.anInt8628;
					}
				}
			}
		} else if (arg3 > arg2) {
			if (arg3 <= arg0) {
				arg5 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local51 * arg2;
					arg5 -= local28 * arg2;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				if (local51 <= local28) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt8628 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg2, arg4 >> 16, arg1 >> 16);
								arg1 += local7;
								arg2 += this.anInt8628;
								arg4 += local51;
							}
						}
						Static387.method6108(this.aByteArray95, arg2, arg4 >> 16, arg5 >> 16);
						arg5 += local28;
						arg4 += local51;
						arg2 += this.anInt8628;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt8628;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg2, arg1 >> 16, arg4 >> 16);
								arg2 += this.anInt8628;
								arg4 += local51;
								arg1 += local7;
							}
						}
						Static387.method6108(this.aByteArray95, arg2, arg5 >> 16, arg4 >> 16);
						arg5 += local28;
						arg4 += local51;
						arg2 += this.anInt8628;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local28 * arg2;
					arg4 -= arg2 * local51;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				if (local28 < local51) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt8628;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg2, arg1 >> 16, arg5 >> 16);
								arg5 += local7;
								arg2 += this.anInt8628;
								arg1 += local28;
							}
						}
						Static387.method6108(this.aByteArray95, arg2, arg1 >> 16, arg4 >> 16);
						arg4 += local51;
						arg1 += local28;
						arg2 += this.anInt8628;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt8628 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method6108(this.aByteArray95, arg2, arg5 >> 16, arg1 >> 16);
								arg2 += this.anInt8628;
								arg1 += local28;
								arg5 += local7;
							}
						}
						Static387.method6108(this.aByteArray95, arg2, arg4 >> 16, arg1 >> 16);
						arg1 += local28;
						arg4 += local51;
						arg2 += this.anInt8628;
					}
				}
			}
		} else if (arg0 > arg2) {
			arg5 = arg1 <<= 0x10;
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local28 * arg3;
				arg5 -= local7 * arg3;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg4 -= arg2 * local51;
				arg2 = 0;
			}
			if ((arg3 == arg2 || local28 <= local7) && (arg2 != arg3 || local51 >= local7)) {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt8628 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static387.method6108(this.aByteArray95, arg3, arg4 >> 16, arg5 >> 16);
							arg5 += local7;
							arg4 += local51;
							arg3 += this.anInt8628;
						}
					}
					Static387.method6108(this.aByteArray95, arg3, arg1 >> 16, arg5 >> 16);
					arg5 += local7;
					arg3 += this.anInt8628;
					arg1 += local28;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt8628 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static387.method6108(this.aByteArray95, arg3, arg5 >> 16, arg4 >> 16);
							arg5 += local7;
							arg3 += this.anInt8628;
							arg4 += local51;
						}
					}
					Static387.method6108(this.aByteArray95, arg3, arg5 >> 16, arg1 >> 16);
					arg3 += this.anInt8628;
					arg1 += local28;
					arg5 += local7;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local7 * arg3;
				arg1 -= arg3 * local28;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg5 -= arg0 * local51;
				arg0 = 0;
			}
			if (local28 > local7) {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt8628;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static387.method6108(this.aByteArray95, arg3, arg5 >> 16, arg1 >> 16);
							arg5 += local51;
							arg1 += local28;
							arg3 += this.anInt8628;
						}
					}
					Static387.method6108(this.aByteArray95, arg3, arg4 >> 16, arg1 >> 16);
					arg1 += local28;
					arg4 += local7;
					arg3 += this.anInt8628;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt8628;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static387.method6108(this.aByteArray95, arg3, arg1 >> 16, arg5 >> 16);
							arg5 += local51;
							arg3 += this.anInt8628;
							arg1 += local28;
						}
					}
					Static387.method6108(this.aByteArray95, arg3, arg1 >> 16, arg4 >> 16);
					arg1 += local28;
					arg4 += local7;
					arg3 += this.anInt8628;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public void method7042() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray95.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
		}
		while (local7 < this.aByteArray95.length - 1) {
			local7++;
			this.aByteArray95[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIII)V")
	public void method7043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8631 = arg1;
		this.anInt8628 = arg0 - arg2;
		this.anInt8635 = arg3 - arg1;
		this.anInt8626 = arg2;
	}
}
