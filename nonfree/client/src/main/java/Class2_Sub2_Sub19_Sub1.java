import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class2_Sub2_Sub19_Sub1 extends Class2_Sub2_Sub19 {

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
	public int anInt6550;

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
	public int anInt6551;

	@OriginalMember(owner = "client!ov", name = "K", descriptor = "I")
	public int anInt6554;

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
	public int anInt6555;

	@OriginalMember(owner = "client!ov", name = "J", descriptor = "[B")
	public final byte[] aByteArray82;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!ep;II)V")
	public Class2_Sub2_Sub19_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray82 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIII)V")
	public void method5594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg3) {
			local7 = (arg4 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(23) int local23 = 0;
		if (arg1 != arg2) {
			local23 = (arg0 - arg4 << 16) / (arg1 - arg2);
		}
		@Pc(39) int local39 = 0;
		if (arg1 != arg3) {
			local39 = (arg5 - arg0 << 16) / (arg3 - arg1);
		}
		if (arg2 >= arg3 && arg1 >= arg3) {
			if (arg2 >= arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local39 * arg3;
					arg5 -= local7 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local23 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg3 && local7 > local39 || arg1 == arg3 && local7 < local23) {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6554 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static387.method5183(arg0 >> 16, arg3, this.aByteArray82, arg5 >> 16);
								arg5 += local7;
								arg3 += this.anInt6554;
								arg0 += local23;
							}
						}
						Static387.method5183(arg4 >> 16, arg3, this.aByteArray82, arg5 >> 16);
						arg5 += local7;
						arg3 += this.anInt6554;
						arg4 += local39;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6554 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static387.method5183(arg5 >> 16, arg3, this.aByteArray82, arg0 >> 16);
								arg3 += this.anInt6554;
								arg0 += local23;
								arg5 += local7;
							}
						}
						Static387.method5183(arg5 >> 16, arg3, this.aByteArray82, arg4 >> 16);
						arg3 += this.anInt6554;
						arg5 += local7;
						arg4 += local39;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local7 * arg3;
					arg0 -= local39 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local23 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg3 || local39 >= local7) && (arg3 != arg2 || local39 <= local23)) {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6554;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static387.method5183(arg4 >> 16, arg3, this.aByteArray82, arg0 >> 16);
								arg4 += local23;
								arg3 += this.anInt6554;
								arg0 += local39;
							}
						}
						Static387.method5183(arg5 >> 16, arg3, this.aByteArray82, arg0 >> 16);
						arg0 += local39;
						arg5 += local7;
						arg3 += this.anInt6554;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt6554 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static387.method5183(arg0 >> 16, arg3, this.aByteArray82, arg4 >> 16);
								arg4 += local23;
								arg0 += local39;
								arg3 += this.anInt6554;
							}
						}
						Static387.method5183(arg0 >> 16, arg3, this.aByteArray82, arg5 >> 16);
						arg5 += local7;
						arg0 += local39;
						arg3 += this.anInt6554;
					}
				}
			}
		} else if (arg1 >= arg2) {
			if (arg3 > arg1) {
				arg5 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local23 * arg2;
					arg5 -= local7 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local39;
					arg1 = 0;
				}
				if (arg1 != arg2 && local7 < local23 || arg1 == arg2 && local39 < local7) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt6554;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method5183(arg5 >> 16, arg2, this.aByteArray82, arg0 >> 16);
								arg5 += local7;
								arg2 += this.anInt6554;
								arg0 += local39;
							}
						}
						Static387.method5183(arg5 >> 16, arg2, this.aByteArray82, arg4 >> 16);
						arg4 += local23;
						arg2 += this.anInt6554;
						arg5 += local7;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt6554;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static387.method5183(arg0 >> 16, arg2, this.aByteArray82, arg5 >> 16);
								arg0 += local39;
								arg5 += local7;
								arg2 += this.anInt6554;
							}
						}
						Static387.method5183(arg4 >> 16, arg2, this.aByteArray82, arg5 >> 16);
						arg2 += this.anInt6554;
						arg5 += local7;
						arg4 += local23;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local23;
					arg0 -= local7 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local39 * arg3;
					arg3 = 0;
				}
				if (local23 > local7) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt6554 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static387.method5183(arg5 >> 16, arg2, this.aByteArray82, arg4 >> 16);
								arg2 += this.anInt6554;
								arg4 += local23;
								arg5 += local39;
							}
						}
						Static387.method5183(arg0 >> 16, arg2, this.aByteArray82, arg4 >> 16);
						arg4 += local23;
						arg2 += this.anInt6554;
						arg0 += local7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt6554 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static387.method5183(arg4 >> 16, arg2, this.aByteArray82, arg5 >> 16);
								arg5 += local39;
								arg2 += this.anInt6554;
								arg4 += local23;
							}
						}
						Static387.method5183(arg4 >> 16, arg2, this.aByteArray82, arg0 >> 16);
						arg4 += local23;
						arg2 += this.anInt6554;
						arg0 += local7;
					}
				}
			}
		} else if (arg3 < arg2) {
			arg4 = arg0 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local23 * arg1;
				arg0 -= arg1 * local39;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local7 * arg3;
				arg3 = 0;
			}
			if (local39 <= local23) {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt6554;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static387.method5183(arg5 >> 16, arg1, this.aByteArray82, arg4 >> 16);
							arg4 += local23;
							arg1 += this.anInt6554;
							arg5 += local7;
						}
					}
					Static387.method5183(arg0 >> 16, arg1, this.aByteArray82, arg4 >> 16);
					arg0 += local39;
					arg1 += this.anInt6554;
					arg4 += local23;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt6554;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static387.method5183(arg4 >> 16, arg1, this.aByteArray82, arg5 >> 16);
							arg4 += local23;
							arg1 += this.anInt6554;
							arg5 += local7;
						}
					}
					Static387.method5183(arg4 >> 16, arg1, this.aByteArray82, arg0 >> 16);
					arg4 += local23;
					arg1 += this.anInt6554;
					arg0 += local39;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= local23 * arg1;
				arg0 -= arg1 * local39;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg4 -= local7 * arg2;
				arg2 = 0;
			}
			if (local23 >= local39) {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt6554 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static387.method5183(arg0 >> 16, arg1, this.aByteArray82, arg4 >> 16);
							arg1 += this.anInt6554;
							arg4 += local7;
							arg0 += local39;
						}
					}
					Static387.method5183(arg0 >> 16, arg1, this.aByteArray82, arg5 >> 16);
					arg0 += local39;
					arg1 += this.anInt6554;
					arg5 += local23;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt6554;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static387.method5183(arg4 >> 16, arg1, this.aByteArray82, arg0 >> 16);
							arg1 += this.anInt6554;
							arg4 += local7;
							arg0 += local39;
						}
					}
					Static387.method5183(arg5 >> 16, arg1, this.aByteArray82, arg0 >> 16);
					arg5 += local23;
					arg1 += this.anInt6554;
					arg0 += local39;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V")
	public void method5595() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray82.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
			local7++;
			this.aByteArray82[local7] = 0;
		}
		while (this.aByteArray82.length - 1 > local7) {
			local7++;
			this.aByteArray82[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z")
	public boolean method5596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray82.length;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZI)V")
	public void method5597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6554 = arg0 - arg2;
		this.anInt6551 = arg1;
		this.anInt6555 = arg3 - arg1;
		this.anInt6550 = arg2;
	}
}
