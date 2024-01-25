import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class5_Sub5_Sub4_Sub2 extends Class5_Sub5_Sub4 {

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
	public int anInt10515;

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "I")
	public int anInt10521;

	@OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
	public int anInt10522;

	@OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
	public int anInt10524;

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class5_Sub5_Sub4_Sub2(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray105 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)V")
	public void method9023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg4) {
			local7 = (arg5 - arg2 << 16) / (arg3 - arg4);
		}
		@Pc(34) int local34 = 0;
		if (arg1 != arg3) {
			local34 = (arg0 - arg5 << 16) / (arg1 - arg3);
		}
		@Pc(51) int local51 = 0;
		if (arg4 != arg1) {
			local51 = (arg2 - arg0 << 16) / (arg4 - arg1);
		}
		if (arg4 <= arg3 && arg1 >= arg4) {
			if (arg3 >= arg1) {
				arg5 = arg2 <<= 0x10;
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= arg4 * local51;
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local34;
					arg1 = 0;
				}
				if (arg1 != arg4 && local51 < local7 || arg1 == arg4 && local34 > local7) {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt10515;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static659.method9133(arg4, this.aByteArray105, arg2 >> 16, arg0 >> 16);
								arg4 += this.anInt10515;
								arg0 += local34;
								arg2 += local7;
							}
						}
						Static659.method9133(arg4, this.aByteArray105, arg2 >> 16, arg5 >> 16);
						arg4 += this.anInt10515;
						arg5 += local51;
						arg2 += local7;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt10515;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static659.method9133(arg4, this.aByteArray105, arg0 >> 16, arg2 >> 16);
								arg2 += local7;
								arg4 += this.anInt10515;
								arg0 += local34;
							}
						}
						Static659.method9133(arg4, this.aByteArray105, arg5 >> 16, arg2 >> 16);
						arg4 += this.anInt10515;
						arg5 += local51;
						arg2 += local7;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local7;
					arg0 -= local51 * arg4;
					arg4 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local34 * arg3;
					arg3 = 0;
				}
				if ((arg4 == arg3 || local7 <= local51) && (arg4 != arg3 || local34 >= local51)) {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt10515 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static659.method9133(arg4, this.aByteArray105, arg0 >> 16, arg5 >> 16);
								arg0 += local51;
								arg4 += this.anInt10515;
								arg5 += local34;
							}
						}
						Static659.method9133(arg4, this.aByteArray105, arg0 >> 16, arg2 >> 16);
						arg0 += local51;
						arg4 += this.anInt10515;
						arg2 += local7;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt10515;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static659.method9133(arg4, this.aByteArray105, arg5 >> 16, arg0 >> 16);
								arg0 += local51;
								arg5 += local34;
								arg4 += this.anInt10515;
							}
						}
						Static659.method9133(arg4, this.aByteArray105, arg2 >> 16, arg0 >> 16);
						arg2 += local7;
						arg0 += local51;
						arg4 += this.anInt10515;
					}
				}
			}
		} else if (arg3 > arg1) {
			if (arg4 < arg3) {
				arg5 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local51;
					arg5 -= arg1 * local34;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				if (local51 <= local34) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt10515 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static659.method9133(arg1, this.aByteArray105, arg5 >> 16, arg2 >> 16);
								arg1 += this.anInt10515;
								arg2 += local7;
								arg5 += local34;
							}
						}
						Static659.method9133(arg1, this.aByteArray105, arg5 >> 16, arg0 >> 16);
						arg0 += local51;
						arg5 += local34;
						arg1 += this.anInt10515;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt10515 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static659.method9133(arg1, this.aByteArray105, arg2 >> 16, arg5 >> 16);
								arg1 += this.anInt10515;
								arg5 += local34;
								arg2 += local7;
							}
						}
						Static659.method9133(arg1, this.aByteArray105, arg0 >> 16, arg5 >> 16);
						arg1 += this.anInt10515;
						arg5 += local34;
						arg0 += local51;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local34;
					arg0 -= arg1 * local51;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local7;
					arg3 = 0;
				}
				if (local51 <= local34) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt10515;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static659.method9133(arg1, this.aByteArray105, arg5 >> 16, arg0 >> 16);
								arg5 += local7;
								arg0 += local51;
								arg1 += this.anInt10515;
							}
						}
						Static659.method9133(arg1, this.aByteArray105, arg2 >> 16, arg0 >> 16);
						arg0 += local51;
						arg2 += local34;
						arg1 += this.anInt10515;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt10515;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static659.method9133(arg1, this.aByteArray105, arg0 >> 16, arg5 >> 16);
								arg1 += this.anInt10515;
								arg5 += local7;
								arg0 += local51;
							}
						}
						Static659.method9133(arg1, this.aByteArray105, arg0 >> 16, arg2 >> 16);
						arg0 += local51;
						arg1 += this.anInt10515;
						arg2 += local34;
					}
				}
			}
		} else if (arg4 > arg1) {
			arg2 = arg5 <<= 0x10;
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local34 * arg3;
				arg2 -= arg3 * local7;
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg0 -= local51 * arg1;
				arg1 = 0;
			}
			if ((arg3 == arg1 || local34 <= local7) && (arg3 != arg1 || local51 >= local7)) {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt10515 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static659.method9133(arg3, this.aByteArray105, arg2 >> 16, arg0 >> 16);
							arg0 += local51;
							arg3 += this.anInt10515;
							arg2 += local7;
						}
					}
					Static659.method9133(arg3, this.aByteArray105, arg2 >> 16, arg5 >> 16);
					arg2 += local7;
					arg5 += local34;
					arg3 += this.anInt10515;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt10515;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static659.method9133(arg3, this.aByteArray105, arg0 >> 16, arg2 >> 16);
							arg0 += local51;
							arg2 += local7;
							arg3 += this.anInt10515;
						}
					}
					Static659.method9133(arg3, this.aByteArray105, arg5 >> 16, arg2 >> 16);
					arg3 += this.anInt10515;
					arg5 += local34;
					arg2 += local7;
				}
			}
		} else {
			arg0 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local34 * arg3;
				arg0 -= arg3 * local7;
				arg3 = 0;
			}
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local51 * arg4;
				arg4 = 0;
			}
			if (local7 >= local34) {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt10515;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static659.method9133(arg3, this.aByteArray105, arg2 >> 16, arg5 >> 16);
							arg2 += local51;
							arg3 += this.anInt10515;
							arg5 += local34;
						}
					}
					Static659.method9133(arg3, this.aByteArray105, arg0 >> 16, arg5 >> 16);
					arg0 += local7;
					arg3 += this.anInt10515;
					arg5 += local34;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt10515;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static659.method9133(arg3, this.aByteArray105, arg5 >> 16, arg2 >> 16);
							arg2 += local51;
							arg5 += local34;
							arg3 += this.anInt10515;
						}
					}
					Static659.method9133(arg3, this.aByteArray105, arg5 >> 16, arg0 >> 16);
					arg3 += this.anInt10515;
					arg0 += local7;
					arg5 += local34;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
	public boolean method9026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray105.length;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method9028() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray105.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
			local15++;
			this.aByteArray105[local15] = 0;
		}
		while (this.aByteArray105.length - 1 > local15) {
			local15++;
			this.aByteArray105[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIII)V")
	public void method9029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10521 = arg1;
		this.anInt10524 = arg2;
		this.anInt10522 = arg0 - arg2;
		this.anInt10515 = arg3 - arg1;
	}
}
