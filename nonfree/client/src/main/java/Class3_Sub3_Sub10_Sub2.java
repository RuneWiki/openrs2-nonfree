import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class3_Sub3_Sub10_Sub2 extends Class3_Sub3_Sub10 {

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
	public int anInt3382;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	public int anInt3385;

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!cf;II)V")
	public Class3_Sub3_Sub10_Sub2(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray35 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)V")
	public void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3386 = arg0;
		this.anInt3385 = arg1 - arg0;
		this.anInt3382 = arg2;
		this.anInt3381 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(BII)Z")
	public boolean method2992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray35.length;
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)V")
	public void method2993() {
		@Pc(7) int local7 = -1;
		@Pc(18) int local18 = this.aByteArray35.length - 8;
		while (local7 < local18) {
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
			local7++;
			this.aByteArray35[local7] = 0;
		}
		while (local7 < this.aByteArray35.length - 1) {
			local7++;
			this.aByteArray35[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIZIII)V")
	public void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg4 != arg2) {
			local13 = (arg1 - arg0 << 16) / (arg4 - arg2);
		}
		@Pc(34) int local34 = 0;
		if (arg4 != arg3) {
			local34 = (arg5 - arg1 << 16) / (arg3 - arg4);
		}
		@Pc(55) int local55 = 0;
		if (arg2 != arg3) {
			local55 = (arg0 - arg5 << 16) / (arg2 - arg3);
		}
		if (arg4 >= arg2 && arg2 <= arg3) {
			if (arg3 > arg4) {
				arg5 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local55 * arg2;
					arg0 -= local13 * arg2;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg1 -= arg4 * local34;
					arg4 = 0;
				}
				if (arg4 != arg2 && local13 > local55 || arg4 == arg2 && local34 < local55) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt3381;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg5 >> 16, arg2, arg1 >> 16);
								arg1 += local34;
								arg5 += local55;
								arg2 += this.anInt3381;
							}
						}
						Static331.method5123(this.aByteArray35, arg5 >> 16, arg2, arg0 >> 16);
						arg5 += local55;
						arg0 += local13;
						arg2 += this.anInt3381;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt3381;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg1 >> 16, arg2, arg5 >> 16);
								arg5 += local55;
								arg2 += this.anInt3381;
								arg1 += local34;
							}
						}
						Static331.method5123(this.aByteArray35, arg0 >> 16, arg2, arg5 >> 16);
						arg2 += this.anInt3381;
						arg5 += local55;
						arg0 += local13;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local13 * arg2;
					arg1 -= local55 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local34 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg2 || local13 <= local55) && (arg2 != arg3 || local13 >= local34)) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3381;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg0 >> 16, arg2, arg5 >> 16);
								arg0 += local13;
								arg5 += local34;
								arg2 += this.anInt3381;
							}
						}
						Static331.method5123(this.aByteArray35, arg0 >> 16, arg2, arg1 >> 16);
						arg1 += local55;
						arg0 += local13;
						arg2 += this.anInt3381;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt3381;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg5 >> 16, arg2, arg0 >> 16);
								arg5 += local34;
								arg0 += local13;
								arg2 += this.anInt3381;
							}
						}
						Static331.method5123(this.aByteArray35, arg1 >> 16, arg2, arg0 >> 16);
						arg1 += local55;
						arg2 += this.anInt3381;
						arg0 += local13;
					}
				}
			}
		} else if (arg4 > arg3) {
			if (arg4 > arg2) {
				arg1 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local55 * arg3;
					arg1 -= local34 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local13;
					arg2 = 0;
				}
				if (local34 < local55) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt3381;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg1 >> 16, arg3, arg0 >> 16);
								arg1 += local34;
								arg3 += this.anInt3381;
								arg0 += local13;
							}
						}
						Static331.method5123(this.aByteArray35, arg1 >> 16, arg3, arg5 >> 16);
						arg3 += this.anInt3381;
						arg1 += local34;
						arg5 += local55;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt3381 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg0 >> 16, arg3, arg1 >> 16);
								arg0 += local13;
								arg3 += this.anInt3381;
								arg1 += local34;
							}
						}
						Static331.method5123(this.aByteArray35, arg5 >> 16, arg3, arg1 >> 16);
						arg3 += this.anInt3381;
						arg5 += local55;
						arg1 += local34;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local55;
					arg0 -= local34 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg1 -= local13 * arg4;
					arg4 = 0;
				}
				if (local34 >= local55) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt3381 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg5 >> 16, arg3, arg1 >> 16);
								arg5 += local55;
								arg1 += local13;
								arg3 += this.anInt3381;
							}
						}
						Static331.method5123(this.aByteArray35, arg5 >> 16, arg3, arg0 >> 16);
						arg3 += this.anInt3381;
						arg5 += local55;
						arg0 += local34;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt3381;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static331.method5123(this.aByteArray35, arg1 >> 16, arg3, arg5 >> 16);
								arg1 += local13;
								arg3 += this.anInt3381;
								arg5 += local55;
							}
						}
						Static331.method5123(this.aByteArray35, arg0 >> 16, arg3, arg5 >> 16);
						arg0 += local34;
						arg5 += local55;
						arg3 += this.anInt3381;
					}
				}
			}
		} else if (arg2 <= arg3) {
			arg5 = arg1 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local34;
				arg5 -= local13 * arg4;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local55 * arg2;
				arg2 = 0;
			}
			if (local13 < local34) {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt3381;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static331.method5123(this.aByteArray35, arg0 >> 16, arg4, arg1 >> 16);
							arg1 += local34;
							arg4 += this.anInt3381;
							arg0 += local55;
						}
					}
					Static331.method5123(this.aByteArray35, arg5 >> 16, arg4, arg1 >> 16);
					arg1 += local34;
					arg4 += this.anInt3381;
					arg5 += local13;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt3381 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static331.method5123(this.aByteArray35, arg1 >> 16, arg4, arg0 >> 16);
							arg4 += this.anInt3381;
							arg1 += local34;
							arg0 += local55;
						}
					}
					Static331.method5123(this.aByteArray35, arg1 >> 16, arg4, arg5 >> 16);
					arg4 += this.anInt3381;
					arg5 += local13;
					arg1 += local34;
				}
			}
		} else {
			arg0 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local13 * arg4;
				arg1 -= arg4 * local34;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg5 -= local55 * arg3;
				arg3 = 0;
			}
			if (arg3 != arg4 && local13 < local34 || arg3 == arg4 && local55 < local13) {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt3381 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static331.method5123(this.aByteArray35, arg0 >> 16, arg4, arg5 >> 16);
							arg0 += local13;
							arg5 += local55;
							arg4 += this.anInt3381;
						}
					}
					Static331.method5123(this.aByteArray35, arg0 >> 16, arg4, arg1 >> 16);
					arg0 += local13;
					arg1 += local34;
					arg4 += this.anInt3381;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt3381;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static331.method5123(this.aByteArray35, arg5 >> 16, arg4, arg0 >> 16);
							arg4 += this.anInt3381;
							arg0 += local13;
							arg5 += local55;
						}
					}
					Static331.method5123(this.aByteArray35, arg1 >> 16, arg4, arg0 >> 16);
					arg0 += local13;
					arg1 += local34;
					arg4 += this.anInt3381;
				}
			}
		}
	}
}
