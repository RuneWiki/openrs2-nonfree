import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class14_Sub2_Sub5_Sub1 extends Class14_Sub2_Sub5 {

	@OriginalMember(owner = "client!cka", name = "D", descriptor = "I")
	public int anInt1263;

	@OriginalMember(owner = "client!cka", name = "G", descriptor = "I")
	public int anInt1266;

	@OriginalMember(owner = "client!cka", name = "E", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!cka", name = "H", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!he;II)V")
	public Class14_Sub2_Sub5_Sub1(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray8 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIIII)V")
	public void method1269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1267 = arg1;
		this.anInt1263 = arg2 - arg1;
		this.anInt1268 = arg0 - arg3;
		this.anInt1266 = arg3;
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
	public void method1270() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray8.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
			local7++;
			this.aByteArray8[local7] = 0;
		}
		while (local7 < this.aByteArray8.length - 1) {
			local7++;
			this.aByteArray8[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIZ)Z")
	public boolean method1271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray8.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIIIIZI)V")
	public void method1272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg3) {
			local7 = (arg4 - arg1 << 16) / (arg3 - arg5);
		}
		@Pc(23) int local23 = 0;
		if (arg2 != arg3) {
			local23 = (arg0 - arg4 << 16) / (arg2 - arg3);
		}
		@Pc(54) int local54 = 0;
		if (arg5 != arg2) {
			local54 = (arg1 - arg0 << 16) / (arg5 - arg2);
		}
		if (arg5 <= arg3 && arg5 <= arg2) {
			if (arg3 < arg2) {
				arg0 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local54 * arg5;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg4 -= arg3 * local23;
					arg3 = 0;
				}
				if (arg5 != arg3 && local54 < local7 || arg5 == arg3 && local54 > local23) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt1263;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static518.method7671(arg0 >> 16, this.aByteArray8, arg5, arg4 >> 16);
								arg5 += this.anInt1263;
								arg0 += local54;
								arg4 += local23;
							}
						}
						Static518.method7671(arg0 >> 16, this.aByteArray8, arg5, arg1 >> 16);
						arg1 += local7;
						arg0 += local54;
						arg5 += this.anInt1263;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt1263 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static518.method7671(arg4 >> 16, this.aByteArray8, arg5, arg0 >> 16);
								arg5 += this.anInt1263;
								arg0 += local54;
								arg4 += local23;
							}
						}
						Static518.method7671(arg1 >> 16, this.aByteArray8, arg5, arg0 >> 16);
						arg1 += local7;
						arg5 += this.anInt1263;
						arg0 += local54;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg4 -= arg5 * local54;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local23 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg5 || local54 >= local7) && (arg2 != arg5 || local23 <= local7)) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt1263;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static518.method7671(arg1 >> 16, this.aByteArray8, arg5, arg0 >> 16);
								arg5 += this.anInt1263;
								arg1 += local7;
								arg0 += local23;
							}
						}
						Static518.method7671(arg1 >> 16, this.aByteArray8, arg5, arg4 >> 16);
						arg5 += this.anInt1263;
						arg1 += local7;
						arg4 += local54;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt1263;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static518.method7671(arg0 >> 16, this.aByteArray8, arg5, arg1 >> 16);
								arg5 += this.anInt1263;
								arg1 += local7;
								arg0 += local23;
							}
						}
						Static518.method7671(arg4 >> 16, this.aByteArray8, arg5, arg1 >> 16);
						arg5 += this.anInt1263;
						arg1 += local7;
						arg4 += local54;
					}
				}
			}
		} else if (arg3 > arg2) {
			if (arg5 < arg3) {
				arg4 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local23 * arg2;
					arg0 -= local54 * arg2;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				if (local23 < local54) {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt1263;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static518.method7671(arg4 >> 16, this.aByteArray8, arg2, arg1 >> 16);
								arg1 += local7;
								arg2 += this.anInt1263;
								arg4 += local23;
							}
						}
						Static518.method7671(arg4 >> 16, this.aByteArray8, arg2, arg0 >> 16);
						arg2 += this.anInt1263;
						arg0 += local54;
						arg4 += local23;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt1263;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static518.method7671(arg1 >> 16, this.aByteArray8, arg2, arg4 >> 16);
								arg1 += local7;
								arg2 += this.anInt1263;
								arg4 += local23;
							}
						}
						Static518.method7671(arg0 >> 16, this.aByteArray8, arg2, arg4 >> 16);
						arg2 += this.anInt1263;
						arg0 += local54;
						arg4 += local23;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local23;
					arg0 -= arg2 * local54;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local7;
					arg3 = 0;
				}
				if (local23 < local54) {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt1263;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static518.method7671(arg4 >> 16, this.aByteArray8, arg2, arg0 >> 16);
								arg0 += local54;
								arg2 += this.anInt1263;
								arg4 += local7;
							}
						}
						Static518.method7671(arg1 >> 16, this.aByteArray8, arg2, arg0 >> 16);
						arg1 += local23;
						arg0 += local54;
						arg2 += this.anInt1263;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt1263;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static518.method7671(arg0 >> 16, this.aByteArray8, arg2, arg4 >> 16);
								arg4 += local7;
								arg2 += this.anInt1263;
								arg0 += local54;
							}
						}
						Static518.method7671(arg0 >> 16, this.aByteArray8, arg2, arg1 >> 16);
						arg0 += local54;
						arg2 += this.anInt1263;
						arg1 += local23;
					}
				}
			}
		} else if (arg5 <= arg2) {
			arg0 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local7 * arg3;
				arg4 -= arg3 * local23;
				arg3 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local54 * arg5;
				arg5 = 0;
			}
			if (local23 > local7) {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt1263;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static518.method7671(arg1 >> 16, this.aByteArray8, arg3, arg4 >> 16);
							arg1 += local54;
							arg4 += local23;
							arg3 += this.anInt1263;
						}
					}
					Static518.method7671(arg0 >> 16, this.aByteArray8, arg3, arg4 >> 16);
					arg3 += this.anInt1263;
					arg4 += local23;
					arg0 += local7;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg3;
				arg3 = this.anInt1263 * arg3;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static518.method7671(arg4 >> 16, this.aByteArray8, arg3, arg1 >> 16);
							arg1 += local54;
							arg3 += this.anInt1263;
							arg4 += local23;
						}
					}
					Static518.method7671(arg4 >> 16, this.aByteArray8, arg3, arg0 >> 16);
					arg3 += this.anInt1263;
					arg4 += local23;
					arg0 += local7;
				}
			}
		} else {
			arg1 = arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local23 * arg3;
				arg1 -= arg3 * local7;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local54 * arg2;
				arg2 = 0;
			}
			if (arg2 != arg3 && local7 < local23 || arg3 == arg2 && local54 < local7) {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt1263;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static518.method7671(arg1 >> 16, this.aByteArray8, arg3, arg0 >> 16);
							arg1 += local7;
							arg0 += local54;
							arg3 += this.anInt1263;
						}
					}
					Static518.method7671(arg1 >> 16, this.aByteArray8, arg3, arg4 >> 16);
					arg1 += local7;
					arg4 += local23;
					arg3 += this.anInt1263;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt1263 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static518.method7671(arg0 >> 16, this.aByteArray8, arg3, arg1 >> 16);
							arg1 += local7;
							arg0 += local54;
							arg3 += this.anInt1263;
						}
					}
					Static518.method7671(arg4 >> 16, this.aByteArray8, arg3, arg1 >> 16);
					arg4 += local23;
					arg3 += this.anInt1263;
					arg1 += local7;
				}
			}
		}
	}
}
