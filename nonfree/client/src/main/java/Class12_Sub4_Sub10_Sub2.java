import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class12_Sub4_Sub10_Sub2 extends Class12_Sub4_Sub10 {

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
	public int anInt9234;

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
	public int anInt9236;

	@OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
	public int anInt9237;

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
	public int anInt9241;

	@OriginalMember(owner = "client!vh", name = "N", descriptor = "[B")
	public final byte[] aByteArray113;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!gi;II)V")
	public Class12_Sub4_Sub10_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray113 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	public void method7613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9241 = arg2 - arg1;
		this.anInt9236 = arg1;
		this.anInt9234 = arg3 - arg0;
		this.anInt9237 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public void method7614() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray113.length - 8;
		while (local13 > local7) {
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

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
	public void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg1) {
			local7 = (arg2 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg0) {
			local28 = (arg4 - arg2 << 16) / (arg5 - arg0);
		}
		@Pc(53) int local53 = 0;
		if (arg5 != arg1) {
			local53 = (arg3 - arg4 << 16) / (arg1 - arg5);
		}
		if (arg0 >= arg1 && arg1 <= arg5) {
			if (arg5 > arg0) {
				arg4 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg4 -= local53 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg2 -= local28 * arg0;
					arg0 = 0;
				}
				if (arg0 != arg1 && local53 < local7 || arg1 == arg0 && local28 < local53) {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt9241 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static511.method7594(arg4 >> 16, arg2 >> 16, this.aByteArray113, arg1);
								arg4 += local53;
								arg1 += this.anInt9241;
								arg2 += local28;
							}
						}
						Static511.method7594(arg4 >> 16, arg3 >> 16, this.aByteArray113, arg1);
						arg1 += this.anInt9241;
						arg3 += local7;
						arg4 += local53;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt9241;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static511.method7594(arg2 >> 16, arg4 >> 16, this.aByteArray113, arg1);
								arg4 += local53;
								arg1 += this.anInt9241;
								arg2 += local28;
							}
						}
						Static511.method7594(arg3 >> 16, arg4 >> 16, this.aByteArray113, arg1);
						arg4 += local53;
						arg3 += local7;
						arg1 += this.anInt9241;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local53 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg5 = 0;
				}
				if ((arg1 == arg5 || local53 >= local7) && (arg5 != arg1 || local28 <= local7)) {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9241;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static511.method7594(arg3 >> 16, arg4 >> 16, this.aByteArray113, arg1);
								arg4 += local28;
								arg3 += local7;
								arg1 += this.anInt9241;
							}
						}
						Static511.method7594(arg3 >> 16, arg2 >> 16, this.aByteArray113, arg1);
						arg1 += this.anInt9241;
						arg2 += local53;
						arg3 += local7;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9241;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static511.method7594(arg4 >> 16, arg3 >> 16, this.aByteArray113, arg1);
								arg3 += local7;
								arg4 += local28;
								arg1 += this.anInt9241;
							}
						}
						Static511.method7594(arg2 >> 16, arg3 >> 16, this.aByteArray113, arg1);
						arg2 += local53;
						arg1 += this.anInt9241;
						arg3 += local7;
					}
				}
			}
		} else if (arg0 > arg5) {
			if (arg1 < arg0) {
				arg2 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local53 * arg5;
					arg2 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (local53 > local28) {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9241;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static511.method7594(arg2 >> 16, arg3 >> 16, this.aByteArray113, arg5);
								arg5 += this.anInt9241;
								arg3 += local7;
								arg2 += local28;
							}
						}
						Static511.method7594(arg2 >> 16, arg4 >> 16, this.aByteArray113, arg5);
						arg4 += local53;
						arg2 += local28;
						arg5 += this.anInt9241;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9241;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static511.method7594(arg3 >> 16, arg2 >> 16, this.aByteArray113, arg5);
								arg3 += local7;
								arg5 += this.anInt9241;
								arg2 += local28;
							}
						}
						Static511.method7594(arg4 >> 16, arg2 >> 16, this.aByteArray113, arg5);
						arg2 += local28;
						arg4 += local53;
						arg5 += this.anInt9241;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local28 * arg5;
					arg4 -= arg5 * local53;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local7;
					arg0 = 0;
				}
				if (local53 > local28) {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt9241 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static511.method7594(arg2 >> 16, arg4 >> 16, this.aByteArray113, arg5);
								arg4 += local53;
								arg2 += local7;
								arg5 += this.anInt9241;
							}
						}
						Static511.method7594(arg3 >> 16, arg4 >> 16, this.aByteArray113, arg5);
						arg4 += local53;
						arg3 += local28;
						arg5 += this.anInt9241;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt9241;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static511.method7594(arg4 >> 16, arg2 >> 16, this.aByteArray113, arg5);
								arg5 += this.anInt9241;
								arg4 += local53;
								arg2 += local7;
							}
						}
						Static511.method7594(arg4 >> 16, arg3 >> 16, this.aByteArray113, arg5);
						arg3 += local28;
						arg5 += this.anInt9241;
						arg4 += local53;
					}
				}
			}
		} else if (arg5 >= arg1) {
			arg4 = arg2 <<= 0x10;
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg2 -= arg0 * local28;
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg3 -= local53 * arg1;
				arg1 = 0;
			}
			if (local28 > local7) {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 = this.anInt9241 * arg0;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static511.method7594(arg3 >> 16, arg2 >> 16, this.aByteArray113, arg0);
							arg2 += local28;
							arg3 += local53;
							arg0 += this.anInt9241;
						}
					}
					Static511.method7594(arg4 >> 16, arg2 >> 16, this.aByteArray113, arg0);
					arg4 += local7;
					arg2 += local28;
					arg0 += this.anInt9241;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg0;
				arg0 = this.anInt9241 * arg0;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static511.method7594(arg2 >> 16, arg3 >> 16, this.aByteArray113, arg0);
							arg2 += local28;
							arg0 += this.anInt9241;
							arg3 += local53;
						}
					}
					Static511.method7594(arg2 >> 16, arg4 >> 16, this.aByteArray113, arg0);
					arg2 += local28;
					arg4 += local7;
					arg0 += this.anInt9241;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local7;
				arg2 -= arg0 * local28;
				arg0 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local53 * arg5;
				arg5 = 0;
			}
			if (arg0 != arg5 && local28 > local7 || arg0 == arg5 && local7 > local53) {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt9241;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static511.method7594(arg3 >> 16, arg4 >> 16, this.aByteArray113, arg0);
							arg0 += this.anInt9241;
							arg4 += local53;
							arg3 += local7;
						}
					}
					Static511.method7594(arg3 >> 16, arg2 >> 16, this.aByteArray113, arg0);
					arg2 += local28;
					arg3 += local7;
					arg0 += this.anInt9241;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt9241;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static511.method7594(arg4 >> 16, arg3 >> 16, this.aByteArray113, arg0);
							arg0 += this.anInt9241;
							arg4 += local53;
							arg3 += local7;
						}
					}
					Static511.method7594(arg2 >> 16, arg3 >> 16, this.aByteArray113, arg0);
					arg3 += local7;
					arg0 += this.anInt9241;
					arg2 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)Z")
	public boolean method7617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray113.length >= arg1 * arg0;
	}
}
