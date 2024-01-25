import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class3_Sub4_Sub13_Sub2 extends Class3_Sub4_Sub13 {

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	public int anInt7455;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	public int anInt7457;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
	public int anInt7460;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
	public int anInt7462;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "[B")
	public final byte[] aByteArray59;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!gia;II)V")
	public Class3_Sub4_Sub13_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray59 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIBI)V")
	public void method6239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg3 != arg4) {
			local15 = (arg2 - arg5 << 16) / (arg4 - arg3);
		}
		@Pc(32) int local32 = 0;
		if (arg4 != arg1) {
			local32 = (arg0 - arg2 << 16) / (arg1 - arg4);
		}
		@Pc(49) int local49 = 0;
		if (arg1 != arg3) {
			local49 = (arg5 - arg0 << 16) / (arg3 - arg1);
		}
		if (arg3 <= arg4 && arg3 <= arg1) {
			if (arg1 > arg4) {
				arg0 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local15 * arg3;
					arg0 -= local49 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg2 -= local32 * arg4;
					arg4 = 0;
				}
				if (arg3 != arg4 && local15 > local49 || arg3 == arg4 && local32 < local49) {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt7457 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg0 >> 16, arg3, arg2 >> 16);
								arg3 += this.anInt7457;
								arg2 += local32;
								arg0 += local49;
							}
						}
						Static133.method2922(this.aByteArray59, arg0 >> 16, arg3, arg5 >> 16);
						arg5 += local15;
						arg0 += local49;
						arg3 += this.anInt7457;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt7457 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg2 >> 16, arg3, arg0 >> 16);
								arg0 += local49;
								arg3 += this.anInt7457;
								arg2 += local32;
							}
						}
						Static133.method2922(this.aByteArray59, arg5 >> 16, arg3, arg0 >> 16);
						arg5 += local15;
						arg0 += local49;
						arg3 += this.anInt7457;
					}
				}
			} else {
				arg2 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local15 * arg3;
					arg2 -= arg3 * local49;
					arg3 = 0;
				}
				if (arg1 < 0) {
					arg0 -= local32 * arg1;
					arg1 = 0;
				}
				if ((arg3 == arg1 || local49 >= local15) && (arg1 != arg3 || local15 >= local32)) {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt7457;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg5 >> 16, arg3, arg0 >> 16);
								arg3 += this.anInt7457;
								arg5 += local15;
								arg0 += local32;
							}
						}
						Static133.method2922(this.aByteArray59, arg5 >> 16, arg3, arg2 >> 16);
						arg3 += this.anInt7457;
						arg2 += local49;
						arg5 += local15;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt7457;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg0 >> 16, arg3, arg5 >> 16);
								arg0 += local32;
								arg3 += this.anInt7457;
								arg5 += local15;
							}
						}
						Static133.method2922(this.aByteArray59, arg2 >> 16, arg3, arg5 >> 16);
						arg2 += local49;
						arg5 += local15;
						arg3 += this.anInt7457;
					}
				}
			}
		} else if (arg1 < arg4) {
			if (arg4 > arg3) {
				arg2 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local49 * arg1;
					arg2 -= local32 * arg1;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg5 -= local15 * arg3;
					arg3 = 0;
				}
				if (local32 < local49) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt7457 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg2 >> 16, arg1, arg5 >> 16);
								arg2 += local32;
								arg1 += this.anInt7457;
								arg5 += local15;
							}
						}
						Static133.method2922(this.aByteArray59, arg2 >> 16, arg1, arg0 >> 16);
						arg2 += local32;
						arg1 += this.anInt7457;
						arg0 += local49;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt7457 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg5 >> 16, arg1, arg2 >> 16);
								arg5 += local15;
								arg2 += local32;
								arg1 += this.anInt7457;
							}
						}
						Static133.method2922(this.aByteArray59, arg0 >> 16, arg1, arg2 >> 16);
						arg1 += this.anInt7457;
						arg0 += local49;
						arg2 += local32;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local49 * arg1;
					arg5 -= arg1 * local32;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg2 -= local15 * arg4;
					arg4 = 0;
				}
				if (local32 >= local49) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt7457;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg0 >> 16, arg1, arg2 >> 16);
								arg0 += local49;
								arg2 += local15;
								arg1 += this.anInt7457;
							}
						}
						Static133.method2922(this.aByteArray59, arg0 >> 16, arg1, arg5 >> 16);
						arg1 += this.anInt7457;
						arg0 += local49;
						arg5 += local32;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt7457;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static133.method2922(this.aByteArray59, arg2 >> 16, arg1, arg0 >> 16);
								arg2 += local15;
								arg1 += this.anInt7457;
								arg0 += local49;
							}
						}
						Static133.method2922(this.aByteArray59, arg5 >> 16, arg1, arg0 >> 16);
						arg5 += local32;
						arg0 += local49;
						arg1 += this.anInt7457;
					}
				}
			}
		} else if (arg1 >= arg3) {
			arg0 = arg2 <<= 0x10;
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local15 * arg4;
				arg2 -= arg4 * local32;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg5 -= local49 * arg3;
				arg3 = 0;
			}
			if (local32 <= local15) {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt7457;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static133.method2922(this.aByteArray59, arg2 >> 16, arg4, arg5 >> 16);
							arg4 += this.anInt7457;
							arg2 += local32;
							arg5 += local49;
						}
					}
					Static133.method2922(this.aByteArray59, arg2 >> 16, arg4, arg0 >> 16);
					arg2 += local32;
					arg0 += local15;
					arg4 += this.anInt7457;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt7457;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static133.method2922(this.aByteArray59, arg5 >> 16, arg4, arg2 >> 16);
							arg4 += this.anInt7457;
							arg5 += local49;
							arg2 += local32;
						}
					}
					Static133.method2922(this.aByteArray59, arg0 >> 16, arg4, arg2 >> 16);
					arg0 += local15;
					arg4 += this.anInt7457;
					arg2 += local32;
				}
			}
		} else {
			arg5 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local15;
				arg2 -= arg4 * local32;
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg0 -= local49 * arg1;
				arg1 = 0;
			}
			if (arg4 != arg1 && local15 < local32 || arg4 == arg1 && local15 > local49) {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt7457;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static133.method2922(this.aByteArray59, arg5 >> 16, arg4, arg0 >> 16);
							arg0 += local49;
							arg5 += local15;
							arg4 += this.anInt7457;
						}
					}
					Static133.method2922(this.aByteArray59, arg5 >> 16, arg4, arg2 >> 16);
					arg4 += this.anInt7457;
					arg5 += local15;
					arg2 += local32;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt7457;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static133.method2922(this.aByteArray59, arg0 >> 16, arg4, arg5 >> 16);
							arg0 += local49;
							arg5 += local15;
							arg4 += this.anInt7457;
						}
					}
					Static133.method2922(this.aByteArray59, arg2 >> 16, arg4, arg5 >> 16);
					arg4 += this.anInt7457;
					arg5 += local15;
					arg2 += local32;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
	public void method6240() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray59.length - 8;
		while (local12 < local18) {
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
			local12++;
			this.aByteArray59[local12] = 0;
		}
		while (this.aByteArray59.length - 1 > local12) {
			local12++;
			this.aByteArray59[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public void method6242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7457 = arg3 - arg0;
		this.anInt7462 = arg0;
		this.anInt7460 = arg1 - arg2;
		this.anInt7455 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Z")
	public boolean method6245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray59.length;
	}
}
