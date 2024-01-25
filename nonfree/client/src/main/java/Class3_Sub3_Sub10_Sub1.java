import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class3_Sub3_Sub10_Sub1 extends Class3_Sub3_Sub10 {

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
	public int anInt3009;

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "I")
	public int anInt3011;

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!us;II)V")
	public Class3_Sub3_Sub10_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray33 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V")
	public void method2710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg5 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg0) {
			local27 = (arg4 - arg5 << 16) / (arg3 - arg0);
		}
		@Pc(48) int local48 = 0;
		if (arg2 != arg3) {
			local48 = (arg1 - arg4 << 16) / (arg2 - arg3);
		}
		if (arg2 <= arg0 && arg2 <= arg3) {
			if (arg3 > arg0) {
				arg4 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local7;
					arg4 -= local48 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local27;
					arg0 = 0;
				}
				if (arg0 != arg2 && local7 > local48 || arg0 == arg2 && local27 < local48) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt3015;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static491.method6671(arg2, this.aByteArray33, arg5 >> 16, arg4 >> 16);
								arg4 += local48;
								arg5 += local27;
								arg2 += this.anInt3015;
							}
						}
						Static491.method6671(arg2, this.aByteArray33, arg1 >> 16, arg4 >> 16);
						arg4 += local48;
						arg2 += this.anInt3015;
						arg1 += local7;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt3015;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static491.method6671(arg2, this.aByteArray33, arg4 >> 16, arg5 >> 16);
								arg5 += local27;
								arg2 += this.anInt3015;
								arg4 += local48;
							}
						}
						Static491.method6671(arg2, this.aByteArray33, arg4 >> 16, arg1 >> 16);
						arg2 += this.anInt3015;
						arg1 += local7;
						arg4 += local48;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local48;
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg4 -= arg3 * local27;
					arg3 = 0;
				}
				if ((arg2 == arg3 || local48 >= local7) && (arg2 != arg3 || local7 >= local27)) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt3015 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static491.method6671(arg2, this.aByteArray33, arg4 >> 16, arg1 >> 16);
								arg2 += this.anInt3015;
								arg1 += local7;
								arg4 += local27;
							}
						}
						Static491.method6671(arg2, this.aByteArray33, arg5 >> 16, arg1 >> 16);
						arg2 += this.anInt3015;
						arg1 += local7;
						arg5 += local48;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3015;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static491.method6671(arg2, this.aByteArray33, arg1 >> 16, arg4 >> 16);
								arg1 += local7;
								arg2 += this.anInt3015;
								arg4 += local27;
							}
						}
						Static491.method6671(arg2, this.aByteArray33, arg1 >> 16, arg5 >> 16);
						arg1 += local7;
						arg2 += this.anInt3015;
						arg5 += local48;
					}
				}
			}
		} else if (arg0 > arg3) {
			if (arg2 < arg0) {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local27;
					arg4 -= arg3 * local48;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local7 * arg2;
					arg2 = 0;
				}
				if (local48 > local27) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt3015;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static491.method6671(arg3, this.aByteArray33, arg1 >> 16, arg5 >> 16);
								arg1 += local7;
								arg5 += local27;
								arg3 += this.anInt3015;
							}
						}
						Static491.method6671(arg3, this.aByteArray33, arg4 >> 16, arg5 >> 16);
						arg3 += this.anInt3015;
						arg5 += local27;
						arg4 += local48;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt3015;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static491.method6671(arg3, this.aByteArray33, arg5 >> 16, arg1 >> 16);
								arg3 += this.anInt3015;
								arg5 += local27;
								arg1 += local7;
							}
						}
						Static491.method6671(arg3, this.aByteArray33, arg5 >> 16, arg4 >> 16);
						arg4 += local48;
						arg5 += local27;
						arg3 += this.anInt3015;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local48 * arg3;
					arg1 -= local27 * arg3;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				if (local48 > local27) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3015 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static491.method6671(arg3, this.aByteArray33, arg4 >> 16, arg5 >> 16);
								arg3 += this.anInt3015;
								arg4 += local48;
								arg5 += local7;
							}
						}
						Static491.method6671(arg3, this.aByteArray33, arg4 >> 16, arg1 >> 16);
						arg3 += this.anInt3015;
						arg1 += local27;
						arg4 += local48;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt3015 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static491.method6671(arg3, this.aByteArray33, arg5 >> 16, arg4 >> 16);
								arg4 += local48;
								arg3 += this.anInt3015;
								arg5 += local7;
							}
						}
						Static491.method6671(arg3, this.aByteArray33, arg1 >> 16, arg4 >> 16);
						arg3 += this.anInt3015;
						arg1 += local27;
						arg4 += local48;
					}
				}
			}
		} else if (arg3 < arg2) {
			arg1 = arg5 <<= 0x10;
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= local7 * arg0;
				arg5 -= local27 * arg0;
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg4 -= local48 * arg3;
				arg3 = 0;
			}
			if ((arg3 == arg0 || local27 <= local7) && (arg3 != arg0 || local48 >= local7)) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt3015 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static491.method6671(arg0, this.aByteArray33, arg1 >> 16, arg4 >> 16);
							arg4 += local48;
							arg0 += this.anInt3015;
							arg1 += local7;
						}
					}
					Static491.method6671(arg0, this.aByteArray33, arg1 >> 16, arg5 >> 16);
					arg0 += this.anInt3015;
					arg5 += local27;
					arg1 += local7;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt3015;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static491.method6671(arg0, this.aByteArray33, arg4 >> 16, arg1 >> 16);
							arg4 += local48;
							arg1 += local7;
							arg0 += this.anInt3015;
						}
					}
					Static491.method6671(arg0, this.aByteArray33, arg5 >> 16, arg1 >> 16);
					arg0 += this.anInt3015;
					arg1 += local7;
					arg5 += local27;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg5 -= arg0 * local27;
				arg0 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local48 * arg2;
				arg2 = 0;
			}
			if (local27 > local7) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt3015 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static491.method6671(arg0, this.aByteArray33, arg5 >> 16, arg1 >> 16);
							arg1 += local48;
							arg5 += local27;
							arg0 += this.anInt3015;
						}
					}
					Static491.method6671(arg0, this.aByteArray33, arg5 >> 16, arg4 >> 16);
					arg0 += this.anInt3015;
					arg5 += local27;
					arg4 += local7;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt3015 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static491.method6671(arg0, this.aByteArray33, arg1 >> 16, arg5 >> 16);
							arg0 += this.anInt3015;
							arg5 += local27;
							arg1 += local48;
						}
					}
					Static491.method6671(arg0, this.aByteArray33, arg4 >> 16, arg5 >> 16);
					arg0 += this.anInt3015;
					arg4 += local7;
					arg5 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z")
	public boolean method2711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray33.length;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIII)V")
	public void method2712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3006 = arg2;
		this.anInt3011 = arg1 - arg0;
		this.anInt3009 = arg0;
		this.anInt3015 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	public void method2715() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray33.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
			local13++;
			this.aByteArray33[local13] = 0;
		}
		while (local13 < this.aByteArray33.length - 1) {
			local13++;
			this.aByteArray33[local13] = 0;
		}
	}
}
