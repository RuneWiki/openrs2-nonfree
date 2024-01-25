import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class2_Sub2_Sub19_Sub2 extends Class2_Sub2_Sub19 {

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public int anInt9925;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	public int anInt9929;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "I")
	public int anInt9931;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "I")
	public int anInt9932;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "[B")
	public final byte[] aByteArray114;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!pga;II)V")
	public Class2_Sub2_Sub19_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray114 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
	public void method8277() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray114.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
			local15++;
			this.aByteArray114[local15] = 0;
		}
		while (local15 < this.aByteArray114.length - 1) {
			local15++;
			this.aByteArray114[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BIIIIII)V")
	public void method8279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg2) {
			local7 = (arg4 - arg3 << 16) / (arg2 - arg1);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg2) {
			local24 = (arg0 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(39) int local39 = 0;
		if (arg5 != arg1) {
			local39 = (arg3 - arg0 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg2 && arg1 <= arg5) {
			if (arg2 >= arg5) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg4 -= arg1 * local39;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg0 -= arg5 * local24;
					arg5 = 0;
				}
				if (arg1 != arg5 && local39 < local7 || arg1 == arg5 && local24 > local7) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9929;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static170.method7977(arg3 >> 16, this.aByteArray114, arg0 >> 16, arg1);
								arg1 += this.anInt9929;
								arg0 += local24;
								arg3 += local7;
							}
						}
						Static170.method7977(arg3 >> 16, this.aByteArray114, arg4 >> 16, arg1);
						arg4 += local39;
						arg3 += local7;
						arg1 += this.anInt9929;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt9929 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static170.method7977(arg0 >> 16, this.aByteArray114, arg3 >> 16, arg1);
								arg3 += local7;
								arg0 += local24;
								arg1 += this.anInt9929;
							}
						}
						Static170.method7977(arg4 >> 16, this.aByteArray114, arg3 >> 16, arg1);
						arg3 += local7;
						arg4 += local39;
						arg1 += this.anInt9929;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg0 -= local39 * arg1;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg4 -= local24 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg1 || local7 <= local39) && (arg2 != arg1 || local39 <= local24)) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt9929 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static170.method7977(arg0 >> 16, this.aByteArray114, arg4 >> 16, arg1);
								arg0 += local39;
								arg4 += local24;
								arg1 += this.anInt9929;
							}
						}
						Static170.method7977(arg0 >> 16, this.aByteArray114, arg3 >> 16, arg1);
						arg3 += local7;
						arg1 += this.anInt9929;
						arg0 += local39;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt9929;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static170.method7977(arg4 >> 16, this.aByteArray114, arg0 >> 16, arg1);
								arg0 += local39;
								arg4 += local24;
								arg1 += this.anInt9929;
							}
						}
						Static170.method7977(arg3 >> 16, this.aByteArray114, arg0 >> 16, arg1);
						arg0 += local39;
						arg1 += this.anInt9929;
						arg3 += local7;
					}
				}
			}
		} else if (arg2 <= arg5) {
			if (arg5 < arg1) {
				arg3 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local7 * arg2;
					arg4 -= local24 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local39;
					arg5 = 0;
				}
				if (arg5 != arg2 && local24 > local7 || arg2 == arg5 && local7 > local39) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt9929 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static170.method7977(arg0 >> 16, this.aByteArray114, arg3 >> 16, arg2);
								arg3 += local7;
								arg2 += this.anInt9929;
								arg0 += local39;
							}
						}
						Static170.method7977(arg4 >> 16, this.aByteArray114, arg3 >> 16, arg2);
						arg2 += this.anInt9929;
						arg3 += local7;
						arg4 += local24;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt9929;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static170.method7977(arg3 >> 16, this.aByteArray114, arg0 >> 16, arg2);
								arg3 += local7;
								arg0 += local39;
								arg2 += this.anInt9929;
							}
						}
						Static170.method7977(arg3 >> 16, this.aByteArray114, arg4 >> 16, arg2);
						arg4 += local24;
						arg2 += this.anInt9929;
						arg3 += local7;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local7;
					arg4 -= arg2 * local24;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local39 * arg1;
					arg1 = 0;
				}
				if (local7 >= local24) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt9929 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static170.method7977(arg3 >> 16, this.aByteArray114, arg4 >> 16, arg2);
								arg4 += local24;
								arg2 += this.anInt9929;
								arg3 += local39;
							}
						}
						Static170.method7977(arg0 >> 16, this.aByteArray114, arg4 >> 16, arg2);
						arg0 += local7;
						arg2 += this.anInt9929;
						arg4 += local24;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt9929;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static170.method7977(arg4 >> 16, this.aByteArray114, arg3 >> 16, arg2);
								arg3 += local39;
								arg2 += this.anInt9929;
								arg4 += local24;
							}
						}
						Static170.method7977(arg4 >> 16, this.aByteArray114, arg0 >> 16, arg2);
						arg0 += local7;
						arg2 += this.anInt9929;
						arg4 += local24;
					}
				}
			}
		} else if (arg1 < arg2) {
			arg4 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= arg5 * local24;
				arg0 -= arg5 * local39;
				arg5 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local24 >= local39) {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 = this.anInt9929 * arg5;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static170.method7977(arg4 >> 16, this.aByteArray114, arg3 >> 16, arg5);
							arg5 += this.anInt9929;
							arg4 += local24;
							arg3 += local7;
						}
					}
					Static170.method7977(arg4 >> 16, this.aByteArray114, arg0 >> 16, arg5);
					arg4 += local24;
					arg0 += local39;
					arg5 += this.anInt9929;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt9929;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static170.method7977(arg3 >> 16, this.aByteArray114, arg4 >> 16, arg5);
							arg5 += this.anInt9929;
							arg3 += local7;
							arg4 += local24;
						}
					}
					Static170.method7977(arg0 >> 16, this.aByteArray114, arg4 >> 16, arg5);
					arg0 += local39;
					arg5 += this.anInt9929;
					arg4 += local24;
				}
			}
		} else {
			arg3 = arg0 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local24 * arg5;
				arg0 -= local39 * arg5;
				arg5 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local7 * arg2;
				arg2 = 0;
			}
			if (local24 < local39) {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt9929 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static170.method7977(arg0 >> 16, this.aByteArray114, arg4 >> 16, arg5);
							arg5 += this.anInt9929;
							arg0 += local39;
							arg4 += local7;
						}
					}
					Static170.method7977(arg0 >> 16, this.aByteArray114, arg3 >> 16, arg5);
					arg3 += local24;
					arg0 += local39;
					arg5 += this.anInt9929;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt9929 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static170.method7977(arg4 >> 16, this.aByteArray114, arg0 >> 16, arg5);
							arg0 += local39;
							arg5 += this.anInt9929;
							arg4 += local7;
						}
					}
					Static170.method7977(arg3 >> 16, this.aByteArray114, arg0 >> 16, arg5);
					arg5 += this.anInt9929;
					arg0 += local39;
					arg3 += local24;
				}
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BIIII)V")
	public void method8280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9932 = arg1;
		this.anInt9929 = arg3 - arg2;
		this.anInt9931 = arg0 - arg1;
		this.anInt9925 = arg2;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public boolean method8284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray114.length >= arg0 * arg1;
	}
}
