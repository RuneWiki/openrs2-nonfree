import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub1_Sub11_Sub2 extends Class2_Sub1_Sub11 {

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
	public int anInt9352;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
	public int anInt9355;

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
	public int anInt9356;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public int anInt9362;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!mj;II)V")
	public Class2_Sub1_Sub11_Sub2(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray85 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public void method8246() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray85.length - 8;
		while (local12 < local18) {
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
			local12++;
			this.aByteArray85[local12] = 0;
		}
		while (local12 < this.aByteArray85.length - 1) {
			local12++;
			this.aByteArray85[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIIII)V")
	public void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg0) {
			local7 = (arg2 - arg4 << 16) / (arg5 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg3) {
			local28 = (arg1 - arg2 << 16) / (arg3 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg3 != arg0) {
			local49 = (arg4 - arg1 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg5 && arg0 <= arg3) {
			if (arg3 <= arg5) {
				arg2 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local49;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local28 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local49 || arg0 == arg3 && local7 < local28) {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt9356;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg4 >> 16, arg0, arg1 >> 16);
								arg4 += local7;
								arg0 += this.anInt9356;
								arg1 += local28;
							}
						}
						Static550.method8453(this.aByteArray85, arg4 >> 16, arg0, arg2 >> 16);
						arg0 += this.anInt9356;
						arg4 += local7;
						arg2 += local49;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt9356;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg1 >> 16, arg0, arg4 >> 16);
								arg1 += local28;
								arg4 += local7;
								arg0 += this.anInt9356;
							}
						}
						Static550.method8453(this.aByteArray85, arg2 >> 16, arg0, arg4 >> 16);
						arg0 += this.anInt9356;
						arg2 += local49;
						arg4 += local7;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local49 * arg0;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local28;
					arg5 = 0;
				}
				if ((arg0 == arg5 || local7 <= local49) && (arg0 != arg5 || local28 >= local49)) {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt9356 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg1 >> 16, arg0, arg2 >> 16);
								arg0 += this.anInt9356;
								arg2 += local28;
								arg1 += local49;
							}
						}
						Static550.method8453(this.aByteArray85, arg1 >> 16, arg0, arg4 >> 16);
						arg4 += local7;
						arg0 += this.anInt9356;
						arg1 += local49;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt9356;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg2 >> 16, arg0, arg1 >> 16);
								arg2 += local28;
								arg0 += this.anInt9356;
								arg1 += local49;
							}
						}
						Static550.method8453(this.aByteArray85, arg4 >> 16, arg0, arg1 >> 16);
						arg0 += this.anInt9356;
						arg4 += local7;
						arg1 += local49;
					}
				}
			}
		} else if (arg3 < arg5) {
			if (arg0 < arg5) {
				arg2 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local49 * arg3;
					arg2 -= local28 * arg3;
					arg3 = 0;
				}
				if (arg0 < 0) {
					arg4 -= arg0 * local7;
					arg0 = 0;
				}
				if (local28 >= local49) {
					arg5 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt9356 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg2 >> 16, arg3, arg4 >> 16);
								arg2 += local28;
								arg4 += local7;
								arg3 += this.anInt9356;
							}
						}
						Static550.method8453(this.aByteArray85, arg2 >> 16, arg3, arg1 >> 16);
						arg3 += this.anInt9356;
						arg2 += local28;
						arg1 += local49;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt9356 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg4 >> 16, arg3, arg2 >> 16);
								arg4 += local7;
								arg3 += this.anInt9356;
								arg2 += local28;
							}
						}
						Static550.method8453(this.aByteArray85, arg1 >> 16, arg3, arg2 >> 16);
						arg1 += local49;
						arg3 += this.anInt9356;
						arg2 += local28;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local49;
					arg4 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg2 -= local7 * arg5;
					arg5 = 0;
				}
				if (local28 >= local49) {
					arg0 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt9356;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg2 >> 16, arg3, arg1 >> 16);
								arg3 += this.anInt9356;
								arg2 += local7;
								arg1 += local49;
							}
						}
						Static550.method8453(this.aByteArray85, arg4 >> 16, arg3, arg1 >> 16);
						arg4 += local28;
						arg1 += local49;
						arg3 += this.anInt9356;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt9356 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static550.method8453(this.aByteArray85, arg1 >> 16, arg3, arg2 >> 16);
								arg1 += local49;
								arg3 += this.anInt9356;
								arg2 += local7;
							}
						}
						Static550.method8453(this.aByteArray85, arg1 >> 16, arg3, arg4 >> 16);
						arg4 += local28;
						arg1 += local49;
						arg3 += this.anInt9356;
					}
				}
			}
		} else if (arg0 <= arg3) {
			arg1 = arg2 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local7;
				arg2 -= arg5 * local28;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local49 * arg0;
				arg0 = 0;
			}
			if (local7 < local28) {
				arg3 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt9356;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static550.method8453(this.aByteArray85, arg2 >> 16, arg5, arg4 >> 16);
							arg2 += local28;
							arg5 += this.anInt9356;
							arg4 += local49;
						}
					}
					Static550.method8453(this.aByteArray85, arg2 >> 16, arg5, arg1 >> 16);
					arg2 += local28;
					arg5 += this.anInt9356;
					arg1 += local7;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt9356 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static550.method8453(this.aByteArray85, arg4 >> 16, arg5, arg2 >> 16);
							arg4 += local49;
							arg5 += this.anInt9356;
							arg2 += local28;
						}
					}
					Static550.method8453(this.aByteArray85, arg1 >> 16, arg5, arg2 >> 16);
					arg2 += local28;
					arg5 += this.anInt9356;
					arg1 += local7;
				}
			}
		} else {
			arg4 = arg2 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= arg5 * local7;
				arg2 -= arg5 * local28;
				arg5 = 0;
			}
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local49 * arg3;
				arg3 = 0;
			}
			if (arg5 != arg3 && local7 < local28 || arg3 == arg5 && local7 > local49) {
				arg0 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt9356;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static550.method8453(this.aByteArray85, arg1 >> 16, arg5, arg4 >> 16);
							arg4 += local7;
							arg1 += local49;
							arg5 += this.anInt9356;
						}
					}
					Static550.method8453(this.aByteArray85, arg2 >> 16, arg5, arg4 >> 16);
					arg2 += local28;
					arg5 += this.anInt9356;
					arg4 += local7;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt9356;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static550.method8453(this.aByteArray85, arg4 >> 16, arg5, arg1 >> 16);
							arg1 += local49;
							arg4 += local7;
							arg5 += this.anInt9356;
						}
					}
					Static550.method8453(this.aByteArray85, arg4 >> 16, arg5, arg2 >> 16);
					arg5 += this.anInt9356;
					arg4 += local7;
					arg2 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIII)V")
	public void method8248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9355 = arg0 - arg3;
		this.anInt9352 = arg3;
		this.anInt9356 = arg1 - arg2;
		this.anInt9362 = arg2;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z")
	public boolean method8250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray85.length;
	}
}
