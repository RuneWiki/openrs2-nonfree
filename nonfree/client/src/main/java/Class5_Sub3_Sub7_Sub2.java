import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class5_Sub3_Sub7_Sub2 extends Class5_Sub3_Sub7 {

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	public int anInt7303;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public int anInt7304;

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
	public int anInt7309;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
	public int anInt7310;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "[B")
	public final byte[] aByteArray70;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!ck;II)V")
	public Class5_Sub3_Sub7_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray70 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	public void method6126() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray70.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
			local15++;
			this.aByteArray70[local15] = 0;
		}
		while (this.aByteArray70.length - 1 > local15) {
			local15++;
			this.aByteArray70[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIII)V")
	public void method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7310 = arg0;
		this.anInt7309 = arg3 - arg0;
		this.anInt7303 = arg1;
		this.anInt7304 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZI)Z")
	public boolean method6130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray70.length;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIII)V")
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg3) {
			local7 = (arg5 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg3 != arg2) {
			local24 = (arg4 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(44) int local44 = 0;
		if (arg2 != arg0) {
			local44 = (arg1 - arg4 << 16) / (arg0 - arg2);
		}
		if (arg3 >= arg0 && arg0 <= arg2) {
			if (arg3 < arg2) {
				arg4 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local44 * arg0;
					arg1 -= arg0 * local7;
					arg0 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local44 < local7 || arg0 == arg3 && local24 < local44) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt7309;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static639.method8643(arg5 >> 16, arg0, this.aByteArray70, arg4 >> 16);
								arg4 += local44;
								arg5 += local24;
								arg0 += this.anInt7309;
							}
						}
						Static639.method8643(arg1 >> 16, arg0, this.aByteArray70, arg4 >> 16);
						arg4 += local44;
						arg1 += local7;
						arg0 += this.anInt7309;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt7309;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static639.method8643(arg4 >> 16, arg0, this.aByteArray70, arg5 >> 16);
								arg4 += local44;
								arg0 += this.anInt7309;
								arg5 += local24;
							}
						}
						Static639.method8643(arg4 >> 16, arg0, this.aByteArray70, arg1 >> 16);
						arg4 += local44;
						arg0 += this.anInt7309;
						arg1 += local7;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local7;
					arg5 -= arg0 * local44;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local24 * arg2;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local7 <= local44) && (arg2 != arg0 || local24 <= local7)) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7309;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static639.method8643(arg4 >> 16, arg0, this.aByteArray70, arg1 >> 16);
								arg0 += this.anInt7309;
								arg1 += local7;
								arg4 += local24;
							}
						}
						Static639.method8643(arg5 >> 16, arg0, this.aByteArray70, arg1 >> 16);
						arg1 += local7;
						arg5 += local44;
						arg0 += this.anInt7309;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7309;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static639.method8643(arg1 >> 16, arg0, this.aByteArray70, arg4 >> 16);
								arg4 += local24;
								arg1 += local7;
								arg0 += this.anInt7309;
							}
						}
						Static639.method8643(arg1 >> 16, arg0, this.aByteArray70, arg5 >> 16);
						arg0 += this.anInt7309;
						arg1 += local7;
						arg5 += local44;
					}
				}
			}
		} else if (arg2 >= arg3) {
			if (arg0 <= arg2) {
				arg4 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local24;
					arg4 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg0 < 0) {
					arg1 -= arg0 * local44;
					arg0 = 0;
				}
				if (local24 <= local7) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt7309;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static639.method8643(arg1 >> 16, arg3, this.aByteArray70, arg5 >> 16);
								arg1 += local44;
								arg3 += this.anInt7309;
								arg5 += local24;
							}
						}
						Static639.method8643(arg4 >> 16, arg3, this.aByteArray70, arg5 >> 16);
						arg5 += local24;
						arg3 += this.anInt7309;
						arg4 += local7;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt7309;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static639.method8643(arg5 >> 16, arg3, this.aByteArray70, arg1 >> 16);
								arg5 += local24;
								arg3 += this.anInt7309;
								arg1 += local44;
							}
						}
						Static639.method8643(arg5 >> 16, arg3, this.aByteArray70, arg4 >> 16);
						arg5 += local24;
						arg4 += local7;
						arg3 += this.anInt7309;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local7;
					arg5 -= local24 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local44;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local7 >= local24) && (arg2 != arg3 || local44 >= local7)) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt7309;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static639.method8643(arg1 >> 16, arg3, this.aByteArray70, arg4 >> 16);
								arg1 += local7;
								arg3 += this.anInt7309;
								arg4 += local44;
							}
						}
						Static639.method8643(arg1 >> 16, arg3, this.aByteArray70, arg5 >> 16);
						arg5 += local24;
						arg1 += local7;
						arg3 += this.anInt7309;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt7309 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static639.method8643(arg4 >> 16, arg3, this.aByteArray70, arg1 >> 16);
								arg1 += local7;
								arg3 += this.anInt7309;
								arg4 += local44;
							}
						}
						Static639.method8643(arg5 >> 16, arg3, this.aByteArray70, arg1 >> 16);
						arg1 += local7;
						arg5 += local24;
						arg3 += this.anInt7309;
					}
				}
			}
		} else if (arg3 <= arg0) {
			arg1 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local44 * arg2;
				arg1 -= arg2 * local24;
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg5 -= arg3 * local7;
				arg3 = 0;
			}
			if (local24 >= local44) {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt7309 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static639.method8643(arg5 >> 16, arg2, this.aByteArray70, arg4 >> 16);
							arg4 += local44;
							arg2 += this.anInt7309;
							arg5 += local7;
						}
					}
					Static639.method8643(arg1 >> 16, arg2, this.aByteArray70, arg4 >> 16);
					arg2 += this.anInt7309;
					arg1 += local24;
					arg4 += local44;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt7309;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static639.method8643(arg4 >> 16, arg2, this.aByteArray70, arg5 >> 16);
							arg4 += local44;
							arg2 += this.anInt7309;
							arg5 += local7;
						}
					}
					Static639.method8643(arg4 >> 16, arg2, this.aByteArray70, arg1 >> 16);
					arg4 += local44;
					arg2 += this.anInt7309;
					arg1 += local24;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local44;
				arg5 -= arg2 * local24;
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg1 -= local7 * arg0;
				arg0 = 0;
			}
			if (local44 > local24) {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 = this.anInt7309 * arg2;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static639.method8643(arg1 >> 16, arg2, this.aByteArray70, arg5 >> 16);
							arg1 += local7;
							arg5 += local24;
							arg2 += this.anInt7309;
						}
					}
					Static639.method8643(arg4 >> 16, arg2, this.aByteArray70, arg5 >> 16);
					arg2 += this.anInt7309;
					arg5 += local24;
					arg4 += local44;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt7309;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static639.method8643(arg5 >> 16, arg2, this.aByteArray70, arg1 >> 16);
							arg2 += this.anInt7309;
							arg5 += local24;
							arg1 += local7;
						}
					}
					Static639.method8643(arg5 >> 16, arg2, this.aByteArray70, arg4 >> 16);
					arg5 += local24;
					arg2 += this.anInt7309;
					arg4 += local44;
				}
			}
		}
	}
}
