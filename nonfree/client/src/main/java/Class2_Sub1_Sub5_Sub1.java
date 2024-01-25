import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class2_Sub1_Sub5_Sub1 extends Class2_Sub1_Sub5 {

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "[B")
	public final byte[] aByteArray68;

	static {
		new Class231("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!na;II)V")
	public Class2_Sub1_Sub5_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray68 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z")
	public boolean method5041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray68.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public void method5042() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray68.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
			local11++;
			this.aByteArray68[local11] = 0;
		}
		while (local11 < this.aByteArray68.length - 1) {
			local11++;
			this.aByteArray68[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
	public void method5043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6343 = arg3;
		this.anInt6350 = arg1 - arg0;
		this.anInt6348 = arg0;
		this.anInt6347 = arg2 - arg3;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
	public void method5044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg5) {
			local7 = (arg3 - arg4 << 16) / (arg5 - arg0);
		}
		@Pc(26) int local26 = 0;
		if (arg2 != arg5) {
			local26 = (arg1 - arg3 << 16) / (arg2 - arg5);
		}
		@Pc(56) int local56 = 0;
		if (arg0 != arg2) {
			local56 = (arg4 - arg1 << 16) / (arg0 - arg2);
		}
		if (arg5 >= arg0 && arg0 <= arg2) {
			if (arg2 > arg5) {
				arg1 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local7;
					arg1 -= arg0 * local56;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local26;
					arg5 = 0;
				}
				if (arg0 != arg5 && local7 > local56 || arg0 == arg5 && local26 < local56) {
					arg2 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt6347;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static455.method6180(arg3 >> 16, arg1 >> 16, this.aByteArray68, arg0);
								arg3 += local26;
								arg0 += this.anInt6347;
								arg1 += local56;
							}
						}
						Static455.method6180(arg4 >> 16, arg1 >> 16, this.aByteArray68, arg0);
						arg4 += local7;
						arg1 += local56;
						arg0 += this.anInt6347;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt6347;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static455.method6180(arg1 >> 16, arg3 >> 16, this.aByteArray68, arg0);
								arg3 += local26;
								arg0 += this.anInt6347;
								arg1 += local56;
							}
						}
						Static455.method6180(arg1 >> 16, arg4 >> 16, this.aByteArray68, arg0);
						arg4 += local7;
						arg0 += this.anInt6347;
						arg1 += local56;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local56;
					arg4 -= arg0 * local7;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local26 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local56 >= local7) && (arg0 != arg2 || local26 <= local7)) {
					arg5 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt6347;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static455.method6180(arg1 >> 16, arg4 >> 16, this.aByteArray68, arg0);
								arg4 += local7;
								arg0 += this.anInt6347;
								arg1 += local26;
							}
						}
						Static455.method6180(arg3 >> 16, arg4 >> 16, this.aByteArray68, arg0);
						arg3 += local56;
						arg0 += this.anInt6347;
						arg4 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt6347;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static455.method6180(arg4 >> 16, arg1 >> 16, this.aByteArray68, arg0);
								arg4 += local7;
								arg1 += local26;
								arg0 += this.anInt6347;
							}
						}
						Static455.method6180(arg4 >> 16, arg3 >> 16, this.aByteArray68, arg0);
						arg3 += local56;
						arg4 += local7;
						arg0 += this.anInt6347;
					}
				}
			}
		} else if (arg5 > arg2) {
			if (arg0 < arg5) {
				arg3 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local26 * arg2;
					arg1 -= arg2 * local56;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				if (local26 < local56) {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt6347 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static455.method6180(arg4 >> 16, arg3 >> 16, this.aByteArray68, arg2);
								arg2 += this.anInt6347;
								arg4 += local7;
								arg3 += local26;
							}
						}
						Static455.method6180(arg1 >> 16, arg3 >> 16, this.aByteArray68, arg2);
						arg1 += local56;
						arg3 += local26;
						arg2 += this.anInt6347;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt6347 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static455.method6180(arg3 >> 16, arg4 >> 16, this.aByteArray68, arg2);
								arg2 += this.anInt6347;
								arg4 += local7;
								arg3 += local26;
							}
						}
						Static455.method6180(arg3 >> 16, arg1 >> 16, this.aByteArray68, arg2);
						arg3 += local26;
						arg1 += local56;
						arg2 += this.anInt6347;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local26 * arg2;
					arg1 -= local56 * arg2;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg3 -= local7 * arg5;
					arg5 = 0;
				}
				if (local26 >= local56) {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt6347;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static455.method6180(arg3 >> 16, arg1 >> 16, this.aByteArray68, arg2);
								arg2 += this.anInt6347;
								arg3 += local7;
								arg1 += local56;
							}
						}
						Static455.method6180(arg4 >> 16, arg1 >> 16, this.aByteArray68, arg2);
						arg4 += local26;
						arg1 += local56;
						arg2 += this.anInt6347;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt6347 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static455.method6180(arg1 >> 16, arg3 >> 16, this.aByteArray68, arg2);
								arg2 += this.anInt6347;
								arg3 += local7;
								arg1 += local56;
							}
						}
						Static455.method6180(arg1 >> 16, arg4 >> 16, this.aByteArray68, arg2);
						arg2 += this.anInt6347;
						arg4 += local26;
						arg1 += local56;
					}
				}
			}
		} else if (arg2 < arg0) {
			arg4 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local26 * arg5;
				arg4 -= arg5 * local7;
				arg5 = 0;
			}
			if (arg2 < 0) {
				arg1 -= arg2 * local56;
				arg2 = 0;
			}
			if ((arg2 == arg5 || local7 >= local26) && (arg5 != arg2 || local7 <= local56)) {
				arg0 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt6347 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static455.method6180(arg4 >> 16, arg1 >> 16, this.aByteArray68, arg5);
							arg5 += this.anInt6347;
							arg4 += local7;
							arg1 += local56;
						}
					}
					Static455.method6180(arg4 >> 16, arg3 >> 16, this.aByteArray68, arg5);
					arg3 += local26;
					arg5 += this.anInt6347;
					arg4 += local7;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt6347;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static455.method6180(arg1 >> 16, arg4 >> 16, this.aByteArray68, arg5);
							arg5 += this.anInt6347;
							arg4 += local7;
							arg1 += local56;
						}
					}
					Static455.method6180(arg3 >> 16, arg4 >> 16, this.aByteArray68, arg5);
					arg5 += this.anInt6347;
					arg4 += local7;
					arg3 += local26;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local7;
				arg3 -= local26 * arg5;
				arg5 = 0;
			}
			if (arg0 < 0) {
				arg4 -= local56 * arg0;
				arg0 = 0;
			}
			if (local7 >= local26) {
				arg2 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt6347 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static455.method6180(arg4 >> 16, arg3 >> 16, this.aByteArray68, arg5);
							arg4 += local56;
							arg5 += this.anInt6347;
							arg3 += local26;
						}
					}
					Static455.method6180(arg1 >> 16, arg3 >> 16, this.aByteArray68, arg5);
					arg1 += local7;
					arg3 += local26;
					arg5 += this.anInt6347;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt6347;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static455.method6180(arg3 >> 16, arg4 >> 16, this.aByteArray68, arg5);
							arg3 += local26;
							arg5 += this.anInt6347;
							arg4 += local56;
						}
					}
					Static455.method6180(arg3 >> 16, arg1 >> 16, this.aByteArray68, arg5);
					arg3 += local26;
					arg5 += this.anInt6347;
					arg1 += local7;
				}
			}
		}
	}
}
