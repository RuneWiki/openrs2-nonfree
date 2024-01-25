import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class8_Sub5_Sub11_Sub1 extends Class8_Sub5_Sub11 {

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
	public int anInt6760;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "I")
	public int anInt6762;

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
	public int anInt6764;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
	public int anInt6766;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class8_Sub5_Sub11_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray51 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Z")
	public boolean method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray51.length;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBIII)V")
	public void method5553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6764 = arg2 - arg1;
		this.anInt6760 = arg3;
		this.anInt6766 = arg0 - arg3;
		this.anInt6762 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII)V")
	public void method5554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg5) {
			local7 = (arg3 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(24) int local24 = 0;
		if (arg5 != arg1) {
			local24 = (arg0 - arg3 << 16) / (arg1 - arg5);
		}
		@Pc(39) int local39 = 0;
		if (arg1 != arg2) {
			local39 = (arg4 - arg0 << 16) / (arg2 - arg1);
		}
		if (arg5 >= arg2 && arg1 >= arg2) {
			if (arg1 <= arg5) {
				arg3 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg3 -= arg2 * local39;
					arg2 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local24;
					arg1 = 0;
				}
				if (arg1 != arg2 && local7 > local39 || arg2 == arg1 && local7 < local24) {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt6766 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static545.method7617(arg2, this.aByteArray51, arg0 >> 16, arg4 >> 16);
								arg0 += local24;
								arg4 += local7;
								arg2 += this.anInt6766;
							}
						}
						Static545.method7617(arg2, this.aByteArray51, arg3 >> 16, arg4 >> 16);
						arg3 += local39;
						arg4 += local7;
						arg2 += this.anInt6766;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt6766 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static545.method7617(arg2, this.aByteArray51, arg4 >> 16, arg0 >> 16);
								arg0 += local24;
								arg2 += this.anInt6766;
								arg4 += local7;
							}
						}
						Static545.method7617(arg2, this.aByteArray51, arg4 >> 16, arg3 >> 16);
						arg2 += this.anInt6766;
						arg4 += local7;
						arg3 += local39;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local7;
					arg0 -= local39 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local24 * arg5;
					arg5 = 0;
				}
				if ((arg2 == arg5 || local39 >= local7) && (arg5 != arg2 || local24 >= local39)) {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt6766 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static545.method7617(arg2, this.aByteArray51, arg3 >> 16, arg0 >> 16);
								arg3 += local24;
								arg2 += this.anInt6766;
								arg0 += local39;
							}
						}
						Static545.method7617(arg2, this.aByteArray51, arg4 >> 16, arg0 >> 16);
						arg0 += local39;
						arg4 += local7;
						arg2 += this.anInt6766;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt6766 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static545.method7617(arg2, this.aByteArray51, arg0 >> 16, arg3 >> 16);
								arg3 += local24;
								arg2 += this.anInt6766;
								arg0 += local39;
							}
						}
						Static545.method7617(arg2, this.aByteArray51, arg0 >> 16, arg4 >> 16);
						arg0 += local39;
						arg2 += this.anInt6766;
						arg4 += local7;
					}
				}
			}
		} else if (arg1 >= arg5) {
			if (arg1 >= arg2) {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local7;
					arg3 -= arg5 * local24;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local39;
					arg2 = 0;
				}
				if (local24 <= local7) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt6766;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static545.method7617(arg5, this.aByteArray51, arg3 >> 16, arg4 >> 16);
								arg3 += local24;
								arg5 += this.anInt6766;
								arg4 += local39;
							}
						}
						Static545.method7617(arg5, this.aByteArray51, arg3 >> 16, arg0 >> 16);
						arg3 += local24;
						arg0 += local7;
						arg5 += this.anInt6766;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt6766 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static545.method7617(arg5, this.aByteArray51, arg4 >> 16, arg3 >> 16);
								arg3 += local24;
								arg4 += local39;
								arg5 += this.anInt6766;
							}
						}
						Static545.method7617(arg5, this.aByteArray51, arg0 >> 16, arg3 >> 16);
						arg0 += local7;
						arg5 += this.anInt6766;
						arg3 += local24;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local24 * arg5;
					arg4 -= local7 * arg5;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local39 * arg1;
					arg1 = 0;
				}
				if ((arg5 == arg1 || local24 <= local7) && (arg5 != arg1 || local39 >= local7)) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt6766;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static545.method7617(arg5, this.aByteArray51, arg0 >> 16, arg4 >> 16);
								arg0 += local39;
								arg5 += this.anInt6766;
								arg4 += local7;
							}
						}
						Static545.method7617(arg5, this.aByteArray51, arg3 >> 16, arg4 >> 16);
						arg4 += local7;
						arg3 += local24;
						arg5 += this.anInt6766;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt6766;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static545.method7617(arg5, this.aByteArray51, arg4 >> 16, arg0 >> 16);
								arg0 += local39;
								arg4 += local7;
								arg5 += this.anInt6766;
							}
						}
						Static545.method7617(arg5, this.aByteArray51, arg4 >> 16, arg3 >> 16);
						arg3 += local24;
						arg5 += this.anInt6766;
						arg4 += local7;
					}
				}
			}
		} else if (arg5 > arg2) {
			arg3 = arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= local39 * arg1;
				arg3 -= local24 * arg1;
				arg1 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local7;
				arg2 = 0;
			}
			if (local39 > local24) {
				arg5 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt6766 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static545.method7617(arg1, this.aByteArray51, arg3 >> 16, arg4 >> 16);
							arg1 += this.anInt6766;
							arg3 += local24;
							arg4 += local7;
						}
					}
					Static545.method7617(arg1, this.aByteArray51, arg3 >> 16, arg0 >> 16);
					arg0 += local39;
					arg3 += local24;
					arg1 += this.anInt6766;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt6766 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static545.method7617(arg1, this.aByteArray51, arg4 >> 16, arg3 >> 16);
							arg3 += local24;
							arg1 += this.anInt6766;
							arg4 += local7;
						}
					}
					Static545.method7617(arg1, this.aByteArray51, arg0 >> 16, arg3 >> 16);
					arg1 += this.anInt6766;
					arg3 += local24;
					arg0 += local39;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local24 * arg1;
				arg0 -= local39 * arg1;
				arg1 = 0;
			}
			if (arg5 < 0) {
				arg3 -= arg5 * local7;
				arg5 = 0;
			}
			if (local24 < local39) {
				arg2 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt6766 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static545.method7617(arg1, this.aByteArray51, arg3 >> 16, arg0 >> 16);
							arg1 += this.anInt6766;
							arg3 += local7;
							arg0 += local39;
						}
					}
					Static545.method7617(arg1, this.aByteArray51, arg4 >> 16, arg0 >> 16);
					arg1 += this.anInt6766;
					arg0 += local39;
					arg4 += local24;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg1;
				arg1 *= this.anInt6766;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static545.method7617(arg1, this.aByteArray51, arg0 >> 16, arg3 >> 16);
							arg1 += this.anInt6766;
							arg0 += local39;
							arg3 += local7;
						}
					}
					Static545.method7617(arg1, this.aByteArray51, arg0 >> 16, arg4 >> 16);
					arg0 += local39;
					arg1 += this.anInt6766;
					arg4 += local24;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)V")
	public void method5555() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray51.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
			local13++;
			this.aByteArray51[local13] = 0;
		}
		while (this.aByteArray51.length - 1 > local13) {
			local13++;
			this.aByteArray51[local13] = 0;
		}
	}
}
