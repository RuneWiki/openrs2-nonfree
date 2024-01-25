import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class5_Sub2_Sub7_Sub1 extends Class5_Sub2_Sub7 {

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public int anInt3071;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	public int anInt3074;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
	public int anInt3075;

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
	public int anInt3076;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "[B")
	public final byte[] aByteArray25;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!wk;II)V")
	public Class5_Sub2_Sub7_Sub1(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray25 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	public void method2715() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray25.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
			local13++;
			this.aByteArray25[local13] = 0;
		}
		while (local13 < this.aByteArray25.length - 1) {
			local13++;
			this.aByteArray25[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)V")
	public void method2718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3074 = arg1 - arg0;
		this.anInt3075 = arg0;
		this.anInt3076 = arg3;
		this.anInt3071 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)Z")
	public boolean method2719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray25.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
	public void method2720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg2) {
			local7 = (arg1 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg2) {
			local28 = (arg4 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(52) int local52 = 0;
		if (arg0 != arg3) {
			local52 = (arg5 - arg4 << 16) / (arg3 - arg0);
		}
		if (arg2 >= arg3 && arg3 <= arg0) {
			if (arg2 >= arg0) {
				arg1 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local7 * arg3;
					arg1 -= local52 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local28 * arg0;
					arg0 = 0;
				}
				if (arg3 != arg0 && local7 > local52 || arg3 == arg0 && local7 < local28) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3071 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg3, arg4 >> 16, arg5 >> 16);
								arg3 += this.anInt3071;
								arg5 += local7;
								arg4 += local28;
							}
						}
						Static517.method7336(this.aByteArray25, arg3, arg1 >> 16, arg5 >> 16);
						arg3 += this.anInt3071;
						arg1 += local52;
						arg5 += local7;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3071 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg3, arg5 >> 16, arg4 >> 16);
								arg4 += local28;
								arg3 += this.anInt3071;
								arg5 += local7;
							}
						}
						Static517.method7336(this.aByteArray25, arg3, arg5 >> 16, arg1 >> 16);
						arg3 += this.anInt3071;
						arg1 += local52;
						arg5 += local7;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local7;
					arg4 -= local52 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local28 * arg2;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local7 <= local52) && (arg3 != arg2 || local52 <= local28)) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt3071;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg3, arg1 >> 16, arg4 >> 16);
								arg3 += this.anInt3071;
								arg1 += local28;
								arg4 += local52;
							}
						}
						Static517.method7336(this.aByteArray25, arg3, arg5 >> 16, arg4 >> 16);
						arg4 += local52;
						arg3 += this.anInt3071;
						arg5 += local7;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt3071 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg3, arg4 >> 16, arg1 >> 16);
								arg3 += this.anInt3071;
								arg4 += local52;
								arg1 += local28;
							}
						}
						Static517.method7336(this.aByteArray25, arg3, arg4 >> 16, arg5 >> 16);
						arg3 += this.anInt3071;
						arg4 += local52;
						arg5 += local7;
					}
				}
			}
		} else if (arg0 >= arg2) {
			if (arg0 >= arg3) {
				arg4 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local28;
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local52 * arg3;
					arg3 = 0;
				}
				if (local7 < local28) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3071;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg2, arg5 >> 16, arg1 >> 16);
								arg5 += local52;
								arg2 += this.anInt3071;
								arg1 += local28;
							}
						}
						Static517.method7336(this.aByteArray25, arg2, arg4 >> 16, arg1 >> 16);
						arg2 += this.anInt3071;
						arg4 += local7;
						arg1 += local28;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt3071 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg2, arg1 >> 16, arg5 >> 16);
								arg1 += local28;
								arg5 += local52;
								arg2 += this.anInt3071;
							}
						}
						Static517.method7336(this.aByteArray25, arg2, arg1 >> 16, arg4 >> 16);
						arg2 += this.anInt3071;
						arg4 += local7;
						arg1 += local28;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg1 -= local28 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local52 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg2 || local7 >= local28) && (arg2 != arg0 || local52 >= local7)) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt3071;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg2, arg4 >> 16, arg5 >> 16);
								arg4 += local52;
								arg2 += this.anInt3071;
								arg5 += local7;
							}
						}
						Static517.method7336(this.aByteArray25, arg2, arg1 >> 16, arg5 >> 16);
						arg2 += this.anInt3071;
						arg5 += local7;
						arg1 += local28;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt3071 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static517.method7336(this.aByteArray25, arg2, arg5 >> 16, arg4 >> 16);
								arg4 += local52;
								arg5 += local7;
								arg2 += this.anInt3071;
							}
						}
						Static517.method7336(this.aByteArray25, arg2, arg5 >> 16, arg1 >> 16);
						arg1 += local28;
						arg5 += local7;
						arg2 += this.anInt3071;
					}
				}
			}
		} else if (arg2 <= arg3) {
			arg5 = arg4 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local28 * arg0;
				arg4 -= local52 * arg0;
				arg0 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local7 * arg2;
				arg2 = 0;
			}
			if (local52 <= local28) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt3071 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static517.method7336(this.aByteArray25, arg0, arg4 >> 16, arg1 >> 16);
							arg1 += local7;
							arg0 += this.anInt3071;
							arg4 += local52;
						}
					}
					Static517.method7336(this.aByteArray25, arg0, arg4 >> 16, arg5 >> 16);
					arg5 += local28;
					arg0 += this.anInt3071;
					arg4 += local52;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt3071 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static517.method7336(this.aByteArray25, arg0, arg1 >> 16, arg4 >> 16);
							arg1 += local7;
							arg4 += local52;
							arg0 += this.anInt3071;
						}
					}
					Static517.method7336(this.aByteArray25, arg0, arg5 >> 16, arg4 >> 16);
					arg4 += local52;
					arg0 += this.anInt3071;
					arg5 += local28;
				}
			}
		} else {
			arg1 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local52 * arg0;
				arg1 -= local28 * arg0;
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg5 -= arg3 * local7;
				arg3 = 0;
			}
			if (local52 <= local28) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt3071 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static517.method7336(this.aByteArray25, arg0, arg5 >> 16, arg1 >> 16);
							arg1 += local28;
							arg5 += local7;
							arg0 += this.anInt3071;
						}
					}
					Static517.method7336(this.aByteArray25, arg0, arg4 >> 16, arg1 >> 16);
					arg0 += this.anInt3071;
					arg1 += local28;
					arg4 += local52;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt3071 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static517.method7336(this.aByteArray25, arg0, arg1 >> 16, arg5 >> 16);
							arg0 += this.anInt3071;
							arg5 += local7;
							arg1 += local28;
						}
					}
					Static517.method7336(this.aByteArray25, arg0, arg1 >> 16, arg4 >> 16);
					arg0 += this.anInt3071;
					arg4 += local52;
					arg1 += local28;
				}
			}
		}
	}
}
