import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class3_Sub7_Sub17_Sub1 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!oja", name = "w", descriptor = "[I")
	public static final int[] anIntArray548 = new int[16384];

	@OriginalMember(owner = "client!oja", name = "B", descriptor = "[I")
	public static final int[] anIntArray549 = new int[16384];

	@OriginalMember(owner = "client!oja", name = "I", descriptor = "I")
	public int anInt7358;

	@OriginalMember(owner = "client!oja", name = "G", descriptor = "I")
	public int anInt7361;

	@OriginalMember(owner = "client!oja", name = "H", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!oja", name = "E", descriptor = "I")
	public int anInt7364;

	@OriginalMember(owner = "client!oja", name = "F", descriptor = "[B")
	public final byte[] aByteArray72;

	static {
		@Pc(72) double local72 = 3.834951969714103E-4D;
		for (@Pc(74) int local74 = 0; local74 < 16384; local74++) {
			anIntArray549[local74] = (int) (Math.sin((double) local74 * local72) * 16384.0D);
			anIntArray548[local74] = (int) (Math.cos(local72 * (double) local74) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!jca;II)V")
	public Class3_Sub7_Sub17_Sub1(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray72 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(BIIII)V")
	public void method6363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7361 = arg3 - arg0;
		this.anInt7358 = arg2 - arg1;
		this.anInt7364 = arg1;
		this.anInt7363 = arg0;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IBI)Z")
	public boolean method6364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray72.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(IIIIIII)V")
	public void method6366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg5) {
			local7 = (arg1 - arg4 << 16) / (arg5 - arg0);
		}
		@Pc(31) int local31 = 0;
		if (arg5 != arg3) {
			local31 = (arg2 - arg1 << 16) / (arg3 - arg5);
		}
		@Pc(51) int local51 = 0;
		if (arg3 != arg0) {
			local51 = (arg4 - arg2 << 16) / (arg0 - arg3);
		}
		if (arg5 >= arg0 && arg0 <= arg3) {
			if (arg3 <= arg5) {
				arg1 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local51 * arg0;
					arg4 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg2 -= arg3 * local31;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 > local51 || arg3 == arg0 && local7 < local31) {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt7358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static647.method8505(arg2 >> 16, this.aByteArray72, arg4 >> 16, arg0);
								arg4 += local7;
								arg0 += this.anInt7358;
								arg2 += local31;
							}
						}
						Static647.method8505(arg1 >> 16, this.aByteArray72, arg4 >> 16, arg0);
						arg0 += this.anInt7358;
						arg1 += local51;
						arg4 += local7;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt7358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static647.method8505(arg4 >> 16, this.aByteArray72, arg2 >> 16, arg0);
								arg4 += local7;
								arg0 += this.anInt7358;
								arg2 += local31;
							}
						}
						Static647.method8505(arg4 >> 16, this.aByteArray72, arg1 >> 16, arg0);
						arg1 += local51;
						arg4 += local7;
						arg0 += this.anInt7358;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local51;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local31;
					arg5 = 0;
				}
				if ((arg5 == arg0 || local51 >= local7) && (arg5 != arg0 || local51 <= local31)) {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt7358 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static647.method8505(arg1 >> 16, this.aByteArray72, arg2 >> 16, arg0);
								arg2 += local51;
								arg0 += this.anInt7358;
								arg1 += local31;
							}
						}
						Static647.method8505(arg4 >> 16, this.aByteArray72, arg2 >> 16, arg0);
						arg4 += local7;
						arg2 += local51;
						arg0 += this.anInt7358;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt7358 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static647.method8505(arg2 >> 16, this.aByteArray72, arg1 >> 16, arg0);
								arg2 += local51;
								arg1 += local31;
								arg0 += this.anInt7358;
							}
						}
						Static647.method8505(arg2 >> 16, this.aByteArray72, arg4 >> 16, arg0);
						arg2 += local51;
						arg0 += this.anInt7358;
						arg4 += local7;
					}
				}
			}
		} else if (arg5 <= arg3) {
			if (arg0 > arg3) {
				arg4 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local31;
					arg4 -= local7 * arg5;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local51 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg5 && local7 < local31 || arg3 == arg5 && local51 < local7) {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt7358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static647.method8505(arg4 >> 16, this.aByteArray72, arg2 >> 16, arg5);
								arg2 += local51;
								arg4 += local7;
								arg5 += this.anInt7358;
							}
						}
						Static647.method8505(arg4 >> 16, this.aByteArray72, arg1 >> 16, arg5);
						arg1 += local31;
						arg4 += local7;
						arg5 += this.anInt7358;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt7358;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static647.method8505(arg2 >> 16, this.aByteArray72, arg4 >> 16, arg5);
								arg2 += local51;
								arg4 += local7;
								arg5 += this.anInt7358;
							}
						}
						Static647.method8505(arg1 >> 16, this.aByteArray72, arg4 >> 16, arg5);
						arg1 += local31;
						arg4 += local7;
						arg5 += this.anInt7358;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local31 * arg5;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local51 * arg0;
					arg0 = 0;
				}
				if (local31 <= local7) {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt7358;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static647.method8505(arg1 >> 16, this.aByteArray72, arg4 >> 16, arg5);
								arg4 += local51;
								arg1 += local31;
								arg5 += this.anInt7358;
							}
						}
						Static647.method8505(arg1 >> 16, this.aByteArray72, arg2 >> 16, arg5);
						arg2 += local7;
						arg5 += this.anInt7358;
						arg1 += local31;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt7358;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static647.method8505(arg4 >> 16, this.aByteArray72, arg1 >> 16, arg5);
								arg1 += local31;
								arg5 += this.anInt7358;
								arg4 += local51;
							}
						}
						Static647.method8505(arg2 >> 16, this.aByteArray72, arg1 >> 16, arg5);
						arg1 += local31;
						arg5 += this.anInt7358;
						arg2 += local7;
					}
				}
			}
		} else if (arg5 <= arg0) {
			arg4 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local51 * arg3;
				arg4 -= arg3 * local31;
				arg3 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg5 = 0;
			}
			if (local51 <= local31) {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt7358 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static647.method8505(arg2 >> 16, this.aByteArray72, arg1 >> 16, arg3);
							arg3 += this.anInt7358;
							arg2 += local51;
							arg1 += local7;
						}
					}
					Static647.method8505(arg2 >> 16, this.aByteArray72, arg4 >> 16, arg3);
					arg3 += this.anInt7358;
					arg2 += local51;
					arg4 += local31;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt7358 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static647.method8505(arg1 >> 16, this.aByteArray72, arg2 >> 16, arg3);
							arg1 += local7;
							arg2 += local51;
							arg3 += this.anInt7358;
						}
					}
					Static647.method8505(arg4 >> 16, this.aByteArray72, arg2 >> 16, arg3);
					arg3 += this.anInt7358;
					arg2 += local51;
					arg4 += local31;
				}
			}
		} else {
			arg1 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= arg3 * local31;
				arg2 -= local51 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg0 = 0;
			}
			if (local31 >= local51) {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt7358 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static647.method8505(arg4 >> 16, this.aByteArray72, arg1 >> 16, arg3);
							arg3 += this.anInt7358;
							arg1 += local31;
							arg4 += local7;
						}
					}
					Static647.method8505(arg2 >> 16, this.aByteArray72, arg1 >> 16, arg3);
					arg2 += local51;
					arg3 += this.anInt7358;
					arg1 += local31;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt7358 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static647.method8505(arg1 >> 16, this.aByteArray72, arg4 >> 16, arg3);
							arg3 += this.anInt7358;
							arg1 += local31;
							arg4 += local7;
						}
					}
					Static647.method8505(arg1 >> 16, this.aByteArray72, arg2 >> 16, arg3);
					arg1 += local31;
					arg2 += local51;
					arg3 += this.anInt7358;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oja", name = "d", descriptor = "(I)V")
	public void method6368() {
		@Pc(19) int local19 = -1;
		@Pc(25) int local25 = this.aByteArray72.length - 8;
		while (local19 < local25) {
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
			local19++;
			this.aByteArray72[local19] = 0;
		}
		while (local19 < this.aByteArray72.length - 1) {
			local19++;
			this.aByteArray72[local19] = 0;
		}
	}
}
