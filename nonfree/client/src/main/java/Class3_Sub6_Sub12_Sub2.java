import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class3_Sub6_Sub12_Sub2 extends Class3_Sub6_Sub12 {

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
	public int anInt9798;

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
	public int anInt9800;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
	public int anInt9802;

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
	public int anInt9803;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "[B")
	public final byte[] aByteArray107;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!hk;II)V")
	public Class3_Sub6_Sub12_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray107 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public void method8345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9802 = arg1 - arg3;
		this.anInt9798 = arg0;
		this.anInt9803 = arg2 - arg0;
		this.anInt9800 = arg3;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(III)Z")
	public boolean method8346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray107.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
	public void method8348() {
		@Pc(7) int local7 = -1;
		@Pc(22) int local22 = this.aByteArray107.length - 8;
		while (local7 < local22) {
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
			local7++;
			this.aByteArray107[local7] = 0;
		}
		while (this.aByteArray107.length - 1 > local7) {
			local7++;
			this.aByteArray107[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBIIII)V")
	public void method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg2) {
			local7 = (arg0 - arg5 << 16) / (arg4 - arg2);
		}
		@Pc(28) int local28 = 0;
		if (arg3 != arg4) {
			local28 = (arg1 - arg0 << 16) / (arg3 - arg4);
		}
		@Pc(48) int local48 = 0;
		if (arg3 != arg2) {
			local48 = (arg5 - arg1 << 16) / (arg2 - arg3);
		}
		if (arg4 >= arg2 && arg2 <= arg3) {
			if (arg3 > arg4) {
				arg1 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local7 * arg2;
					arg1 -= arg2 * local48;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local28;
					arg4 = 0;
				}
				if (arg4 != arg2 && local7 > local48 || arg4 == arg2 && local48 > local28) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt9802;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static569.method7693(arg2, arg0 >> 16, this.aByteArray107, arg1 >> 16);
								arg2 += this.anInt9802;
								arg1 += local48;
								arg0 += local28;
							}
						}
						Static569.method7693(arg2, arg5 >> 16, this.aByteArray107, arg1 >> 16);
						arg2 += this.anInt9802;
						arg1 += local48;
						arg5 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt9802;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static569.method7693(arg2, arg1 >> 16, this.aByteArray107, arg0 >> 16);
								arg2 += this.anInt9802;
								arg0 += local28;
								arg1 += local48;
							}
						}
						Static569.method7693(arg2, arg1 >> 16, this.aByteArray107, arg5 >> 16);
						arg1 += local48;
						arg5 += local7;
						arg2 += this.anInt9802;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg0 -= local48 * arg2;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local28 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg2 || local48 >= local7) && (arg3 != arg2 || local28 <= local7)) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt9802;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static569.method7693(arg2, arg1 >> 16, this.aByteArray107, arg5 >> 16);
								arg1 += local28;
								arg5 += local7;
								arg2 += this.anInt9802;
							}
						}
						Static569.method7693(arg2, arg0 >> 16, this.aByteArray107, arg5 >> 16);
						arg5 += local7;
						arg2 += this.anInt9802;
						arg0 += local48;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt9802;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static569.method7693(arg2, arg5 >> 16, this.aByteArray107, arg1 >> 16);
								arg5 += local7;
								arg1 += local28;
								arg2 += this.anInt9802;
							}
						}
						Static569.method7693(arg2, arg5 >> 16, this.aByteArray107, arg0 >> 16);
						arg5 += local7;
						arg0 += local48;
						arg2 += this.anInt9802;
					}
				}
			}
		} else if (arg4 <= arg3) {
			if (arg3 < arg2) {
				arg5 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local7;
					arg0 -= arg4 * local28;
					arg4 = 0;
				}
				if (arg3 < 0) {
					arg1 -= arg3 * local48;
					arg3 = 0;
				}
				if (arg3 != arg4 && local28 > local7 || arg3 == arg4 && local7 > local48) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt9802 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static569.method7693(arg4, arg1 >> 16, this.aByteArray107, arg5 >> 16);
								arg4 += this.anInt9802;
								arg5 += local7;
								arg1 += local48;
							}
						}
						Static569.method7693(arg4, arg0 >> 16, this.aByteArray107, arg5 >> 16);
						arg5 += local7;
						arg4 += this.anInt9802;
						arg0 += local28;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt9802 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static569.method7693(arg4, arg5 >> 16, this.aByteArray107, arg1 >> 16);
								arg4 += this.anInt9802;
								arg5 += local7;
								arg1 += local48;
							}
						}
						Static569.method7693(arg4, arg5 >> 16, this.aByteArray107, arg0 >> 16);
						arg4 += this.anInt9802;
						arg5 += local7;
						arg0 += local28;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local28 * arg4;
					arg1 -= local7 * arg4;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local48;
					arg2 = 0;
				}
				if (local7 >= local28) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt9802;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static569.method7693(arg4, arg5 >> 16, this.aByteArray107, arg0 >> 16);
								arg0 += local28;
								arg4 += this.anInt9802;
								arg5 += local48;
							}
						}
						Static569.method7693(arg4, arg1 >> 16, this.aByteArray107, arg0 >> 16);
						arg0 += local28;
						arg1 += local7;
						arg4 += this.anInt9802;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt9802 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static569.method7693(arg4, arg0 >> 16, this.aByteArray107, arg5 >> 16);
								arg5 += local48;
								arg0 += local28;
								arg4 += this.anInt9802;
							}
						}
						Static569.method7693(arg4, arg0 >> 16, this.aByteArray107, arg1 >> 16);
						arg0 += local28;
						arg1 += local7;
						arg4 += this.anInt9802;
					}
				}
			}
		} else if (arg2 >= arg4) {
			arg5 = arg1 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local48 * arg3;
				arg5 -= local28 * arg3;
				arg3 = 0;
			}
			if (arg4 < 0) {
				arg0 -= local7 * arg4;
				arg4 = 0;
			}
			if (local48 <= local28) {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt9802;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static569.method7693(arg3, arg0 >> 16, this.aByteArray107, arg1 >> 16);
							arg1 += local48;
							arg3 += this.anInt9802;
							arg0 += local7;
						}
					}
					Static569.method7693(arg3, arg5 >> 16, this.aByteArray107, arg1 >> 16);
					arg3 += this.anInt9802;
					arg5 += local28;
					arg1 += local48;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt9802;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static569.method7693(arg3, arg1 >> 16, this.aByteArray107, arg0 >> 16);
							arg0 += local7;
							arg1 += local48;
							arg3 += this.anInt9802;
						}
					}
					Static569.method7693(arg3, arg1 >> 16, this.aByteArray107, arg5 >> 16);
					arg3 += this.anInt9802;
					arg1 += local48;
					arg5 += local28;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local48 * arg3;
				arg0 -= arg3 * local28;
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg5 -= local7 * arg2;
				arg2 = 0;
			}
			if (local28 >= local48) {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt9802 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static569.method7693(arg3, arg0 >> 16, this.aByteArray107, arg5 >> 16);
							arg3 += this.anInt9802;
							arg5 += local7;
							arg0 += local28;
						}
					}
					Static569.method7693(arg3, arg0 >> 16, this.aByteArray107, arg1 >> 16);
					arg3 += this.anInt9802;
					arg0 += local28;
					arg1 += local48;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt9802 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static569.method7693(arg3, arg5 >> 16, this.aByteArray107, arg0 >> 16);
							arg0 += local28;
							arg5 += local7;
							arg3 += this.anInt9802;
						}
					}
					Static569.method7693(arg3, arg1 >> 16, this.aByteArray107, arg0 >> 16);
					arg0 += local28;
					arg3 += this.anInt9802;
					arg1 += local48;
				}
			}
		}
	}
}
