import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub11_Sub3_Sub1 extends Class3_Sub11_Sub3 {

	@OriginalMember(owner = "client!de", name = "D", descriptor = "I")
	public int anInt1811;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "I")
	public int anInt1812;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!de", name = "I", descriptor = "I")
	public int anInt1816;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ai;II)V")
	public Class3_Sub11_Sub3_Sub1(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray12 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V")
	public void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg2) {
			local7 = (arg4 - arg1 << 16) / (arg2 - arg3);
		}
		@Pc(23) int local23 = 0;
		if (arg5 != arg2) {
			local23 = (arg0 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(44) int local44 = 0;
		if (arg3 != arg5) {
			local44 = (arg1 - arg0 << 16) / (arg3 - arg5);
		}
		if (arg3 <= arg2 && arg5 >= arg3) {
			if (arg2 < arg5) {
				arg0 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= local44 * arg3;
					arg1 -= arg3 * local7;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local23;
					arg2 = 0;
				}
				if (arg2 != arg3 && local44 < local7 || arg3 == arg2 && local44 > local23) {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt1816 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg3, arg0 >> 16, arg4 >> 16);
								arg0 += local44;
								arg3 += this.anInt1816;
								arg4 += local23;
							}
						}
						Static329.method5011(this.aByteArray12, arg3, arg0 >> 16, arg1 >> 16);
						arg3 += this.anInt1816;
						arg0 += local44;
						arg1 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt1816;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg3, arg4 >> 16, arg0 >> 16);
								arg0 += local44;
								arg4 += local23;
								arg3 += this.anInt1816;
							}
						}
						Static329.method5011(this.aByteArray12, arg3, arg1 >> 16, arg0 >> 16);
						arg1 += local7;
						arg0 += local44;
						arg3 += this.anInt1816;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local7 * arg3;
					arg4 -= arg3 * local44;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg0 -= local23 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg3 || local44 >= local7) && (arg3 != arg5 || local23 <= local7)) {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt1816;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg3, arg1 >> 16, arg0 >> 16);
								arg3 += this.anInt1816;
								arg0 += local23;
								arg1 += local7;
							}
						}
						Static329.method5011(this.aByteArray12, arg3, arg1 >> 16, arg4 >> 16);
						arg4 += local44;
						arg1 += local7;
						arg3 += this.anInt1816;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt1816 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg3, arg0 >> 16, arg1 >> 16);
								arg3 += this.anInt1816;
								arg1 += local7;
								arg0 += local23;
							}
						}
						Static329.method5011(this.aByteArray12, arg3, arg4 >> 16, arg1 >> 16);
						arg3 += this.anInt1816;
						arg1 += local7;
						arg4 += local44;
					}
				}
			}
		} else if (arg5 < arg2) {
			if (arg3 >= arg2) {
				arg1 = arg0 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local44 * arg5;
					arg1 -= arg5 * local23;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local7;
					arg2 = 0;
				}
				if (local23 >= local44) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt1816 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg5, arg0 >> 16, arg4 >> 16);
								arg5 += this.anInt1816;
								arg4 += local7;
								arg0 += local44;
							}
						}
						Static329.method5011(this.aByteArray12, arg5, arg0 >> 16, arg1 >> 16);
						arg0 += local44;
						arg1 += local23;
						arg5 += this.anInt1816;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt1816 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg5, arg4 >> 16, arg0 >> 16);
								arg5 += this.anInt1816;
								arg0 += local44;
								arg4 += local7;
							}
						}
						Static329.method5011(this.aByteArray12, arg5, arg1 >> 16, arg0 >> 16);
						arg0 += local44;
						arg1 += local23;
						arg5 += this.anInt1816;
					}
				}
			} else {
				arg4 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local44;
					arg4 -= arg5 * local23;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local7;
					arg3 = 0;
				}
				if (local23 >= local44) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt1816;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg5, arg1 >> 16, arg4 >> 16);
								arg1 += local7;
								arg5 += this.anInt1816;
								arg4 += local23;
							}
						}
						Static329.method5011(this.aByteArray12, arg5, arg0 >> 16, arg4 >> 16);
						arg4 += local23;
						arg0 += local44;
						arg5 += this.anInt1816;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt1816 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static329.method5011(this.aByteArray12, arg5, arg4 >> 16, arg1 >> 16);
								arg1 += local7;
								arg4 += local23;
								arg5 += this.anInt1816;
							}
						}
						Static329.method5011(this.aByteArray12, arg5, arg4 >> 16, arg0 >> 16);
						arg5 += this.anInt1816;
						arg4 += local23;
						arg0 += local44;
					}
				}
			}
		} else if (arg3 > arg5) {
			arg1 = arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local23 * arg2;
				arg1 -= arg2 * local7;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local44;
				arg5 = 0;
			}
			if ((arg2 == arg5 || local7 >= local23) && (arg2 != arg5 || local7 <= local44)) {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt1816;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static329.method5011(this.aByteArray12, arg2, arg0 >> 16, arg1 >> 16);
							arg2 += this.anInt1816;
							arg1 += local7;
							arg0 += local44;
						}
					}
					Static329.method5011(this.aByteArray12, arg2, arg4 >> 16, arg1 >> 16);
					arg1 += local7;
					arg4 += local23;
					arg2 += this.anInt1816;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt1816 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static329.method5011(this.aByteArray12, arg2, arg1 >> 16, arg0 >> 16);
							arg2 += this.anInt1816;
							arg0 += local44;
							arg1 += local7;
						}
					}
					Static329.method5011(this.aByteArray12, arg2, arg1 >> 16, arg4 >> 16);
					arg2 += this.anInt1816;
					arg4 += local23;
					arg1 += local7;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local7;
				arg4 -= local23 * arg2;
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg1 -= local44 * arg3;
				arg3 = 0;
			}
			if (local23 <= local7) {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt1816;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static329.method5011(this.aByteArray12, arg2, arg4 >> 16, arg1 >> 16);
							arg4 += local23;
							arg2 += this.anInt1816;
							arg1 += local44;
						}
					}
					Static329.method5011(this.aByteArray12, arg2, arg4 >> 16, arg0 >> 16);
					arg4 += local23;
					arg0 += local7;
					arg2 += this.anInt1816;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt1816;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static329.method5011(this.aByteArray12, arg2, arg1 >> 16, arg4 >> 16);
							arg2 += this.anInt1816;
							arg4 += local23;
							arg1 += local44;
						}
					}
					Static329.method5011(this.aByteArray12, arg2, arg0 >> 16, arg4 >> 16);
					arg0 += local7;
					arg2 += this.anInt1816;
					arg4 += local23;
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public void method1748() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray12.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
			local7++;
			this.aByteArray12[local7] = 0;
		}
		while (this.aByteArray12.length - 1 > local7) {
			local7++;
			this.aByteArray12[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
	public void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1811 = arg2;
		this.anInt1812 = arg3 - arg1;
		this.anInt1813 = arg1;
		this.anInt1816 = arg0 - arg2;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(III)Z")
	public boolean method1751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray12.length;
	}
}
