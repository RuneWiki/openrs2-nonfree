import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class3_Sub10_Sub18_Sub1 extends Class3_Sub10_Sub18 {

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	public int anInt9104;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public int anInt9108;

	@OriginalMember(owner = "client!vs", name = "A", descriptor = "I")
	public int anInt9112;

	@OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
	public int anInt9114;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "[B")
	public final byte[] aByteArray113;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!tu;II)V")
	public Class3_Sub10_Sub18_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray113 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public boolean method7512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray113.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void method7513() {
		@Pc(7) int local7 = -1;
		@Pc(25) int local25 = this.aByteArray113.length - 8;
		while (local7 < local25) {
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
			local7++;
			this.aByteArray113[local7] = 0;
		}
		while (local7 < this.aByteArray113.length - 1) {
			local7++;
			this.aByteArray113[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)V")
	public void method7517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9114 = arg0;
		this.anInt9104 = arg3 - arg0;
		this.anInt9108 = arg2 - arg1;
		this.anInt9112 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIII)V")
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg1) {
			local7 = (arg0 - arg4 << 16) / (arg3 - arg1);
		}
		@Pc(24) int local24 = 0;
		if (arg3 != arg5) {
			local24 = (arg2 - arg0 << 16) / (arg5 - arg3);
		}
		@Pc(45) int local45 = 0;
		if (arg5 != arg1) {
			local45 = (arg4 - arg2 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg3 && arg5 >= arg1) {
			if (arg5 > arg3) {
				arg2 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg2 -= arg1 * local45;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local24;
					arg3 = 0;
				}
				if (arg1 != arg3 && local45 < local7 || arg1 == arg3 && local45 > local24) {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt9104 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg2 >> 16, arg1, arg0 >> 16);
								arg1 += this.anInt9104;
								arg2 += local45;
								arg0 += local24;
							}
						}
						Static206.method3805(this.aByteArray113, arg2 >> 16, arg1, arg4 >> 16);
						arg2 += local45;
						arg1 += this.anInt9104;
						arg4 += local7;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt9104;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg0 >> 16, arg1, arg2 >> 16);
								arg0 += local24;
								arg2 += local45;
								arg1 += this.anInt9104;
							}
						}
						Static206.method3805(this.aByteArray113, arg4 >> 16, arg1, arg2 >> 16);
						arg4 += local7;
						arg1 += this.anInt9104;
						arg2 += local45;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local45 * arg1;
					arg4 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local24;
					arg5 = 0;
				}
				if ((arg5 == arg1 || local45 >= local7) && (arg5 != arg1 || local24 <= local7)) {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt9104 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg4 >> 16, arg1, arg2 >> 16);
								arg1 += this.anInt9104;
								arg2 += local24;
								arg4 += local7;
							}
						}
						Static206.method3805(this.aByteArray113, arg4 >> 16, arg1, arg0 >> 16);
						arg1 += this.anInt9104;
						arg4 += local7;
						arg0 += local45;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt9104 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg2 >> 16, arg1, arg4 >> 16);
								arg4 += local7;
								arg1 += this.anInt9104;
								arg2 += local24;
							}
						}
						Static206.method3805(this.aByteArray113, arg0 >> 16, arg1, arg4 >> 16);
						arg4 += local7;
						arg0 += local45;
						arg1 += this.anInt9104;
					}
				}
			}
		} else if (arg5 < arg3) {
			if (arg1 < arg3) {
				arg0 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local24 * arg5;
					arg2 -= local45 * arg5;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local7;
					arg1 = 0;
				}
				if (local24 < local45) {
					arg3 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt9104 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg0 >> 16, arg5, arg4 >> 16);
								arg4 += local7;
								arg0 += local24;
								arg5 += this.anInt9104;
							}
						}
						Static206.method3805(this.aByteArray113, arg0 >> 16, arg5, arg2 >> 16);
						arg2 += local45;
						arg5 += this.anInt9104;
						arg0 += local24;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9104;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg4 >> 16, arg5, arg0 >> 16);
								arg0 += local24;
								arg5 += this.anInt9104;
								arg4 += local7;
							}
						}
						Static206.method3805(this.aByteArray113, arg2 >> 16, arg5, arg0 >> 16);
						arg0 += local24;
						arg5 += this.anInt9104;
						arg2 += local45;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local45 * arg5;
					arg4 -= local24 * arg5;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				if (local45 <= local24) {
					arg1 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt9104;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg2 >> 16, arg5, arg0 >> 16);
								arg2 += local45;
								arg5 += this.anInt9104;
								arg0 += local7;
							}
						}
						Static206.method3805(this.aByteArray113, arg2 >> 16, arg5, arg4 >> 16);
						arg2 += local45;
						arg4 += local24;
						arg5 += this.anInt9104;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt9104 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static206.method3805(this.aByteArray113, arg0 >> 16, arg5, arg2 >> 16);
								arg0 += local7;
								arg2 += local45;
								arg5 += this.anInt9104;
							}
						}
						Static206.method3805(this.aByteArray113, arg4 >> 16, arg5, arg2 >> 16);
						arg5 += this.anInt9104;
						arg4 += local24;
						arg2 += local45;
					}
				}
			}
		} else if (arg1 > arg5) {
			arg4 = arg0 <<= 0x10;
			arg2 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local7;
				arg0 -= arg3 * local24;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg2 -= local45 * arg5;
				arg5 = 0;
			}
			if ((arg3 == arg5 || local7 >= local24) && (arg5 != arg3 || local45 >= local7)) {
				arg1 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt9104;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static206.method3805(this.aByteArray113, arg2 >> 16, arg3, arg4 >> 16);
							arg4 += local7;
							arg2 += local45;
							arg3 += this.anInt9104;
						}
					}
					Static206.method3805(this.aByteArray113, arg0 >> 16, arg3, arg4 >> 16);
					arg4 += local7;
					arg3 += this.anInt9104;
					arg0 += local24;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt9104;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static206.method3805(this.aByteArray113, arg4 >> 16, arg3, arg2 >> 16);
							arg3 += this.anInt9104;
							arg4 += local7;
							arg2 += local45;
						}
					}
					Static206.method3805(this.aByteArray113, arg4 >> 16, arg3, arg0 >> 16);
					arg4 += local7;
					arg0 += local24;
					arg3 += this.anInt9104;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local7 * arg3;
				arg0 -= local24 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local45;
				arg1 = 0;
			}
			if (local7 < local24) {
				arg5 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt9104;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static206.method3805(this.aByteArray113, arg4 >> 16, arg3, arg0 >> 16);
							arg3 += this.anInt9104;
							arg0 += local24;
							arg4 += local45;
						}
					}
					Static206.method3805(this.aByteArray113, arg2 >> 16, arg3, arg0 >> 16);
					arg3 += this.anInt9104;
					arg2 += local7;
					arg0 += local24;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt9104;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static206.method3805(this.aByteArray113, arg0 >> 16, arg3, arg4 >> 16);
							arg3 += this.anInt9104;
							arg4 += local45;
							arg0 += local24;
						}
					}
					Static206.method3805(this.aByteArray113, arg0 >> 16, arg3, arg2 >> 16);
					arg3 += this.anInt9104;
					arg0 += local24;
					arg2 += local7;
				}
			}
		}
	}
}
