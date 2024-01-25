import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class2_Sub5_Sub12_Sub2 extends Class2_Sub5_Sub12 {

	@OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
	public int anInt8815;

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
	public int anInt8817;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	public int anInt8819;

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
	public int anInt8820;

	@OriginalMember(owner = "client!ss", name = "R", descriptor = "[B")
	public final byte[] aByteArray90;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!oea;II)V")
	public Class2_Sub5_Sub12_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray90 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
	public boolean method7388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray90.length;
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
	public void method7389() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray90.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
			local11++;
			this.aByteArray90[local11] = 0;
		}
		while (local11 < this.aByteArray90.length - 1) {
			local11++;
			this.aByteArray90[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
	public void method7392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8819 = arg2;
		this.anInt8820 = arg1 - arg2;
		this.anInt8817 = arg3 - arg0;
		this.anInt8815 = arg0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIBII)V")
	public void method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg3 != arg0) {
			local13 = (arg4 - arg5 << 16) / (arg3 - arg0);
		}
		@Pc(29) int local29 = 0;
		if (arg1 != arg3) {
			local29 = (arg2 - arg4 << 16) / (arg1 - arg3);
		}
		@Pc(49) int local49 = 0;
		if (arg1 != arg0) {
			local49 = (arg5 - arg2 << 16) / (arg0 - arg1);
		}
		if (arg0 <= arg3 && arg0 <= arg1) {
			if (arg1 > arg3) {
				arg2 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local13 * arg0;
					arg2 -= local49 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg4 -= local29 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local13 > local49 || arg3 == arg0 && local29 < local49) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt8820;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static570.method7844(arg2 >> 16, arg0, arg4 >> 16, this.aByteArray90);
								arg4 += local29;
								arg2 += local49;
								arg0 += this.anInt8820;
							}
						}
						Static570.method7844(arg2 >> 16, arg0, arg5 >> 16, this.aByteArray90);
						arg0 += this.anInt8820;
						arg5 += local13;
						arg2 += local49;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt8820;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static570.method7844(arg4 >> 16, arg0, arg2 >> 16, this.aByteArray90);
								arg0 += this.anInt8820;
								arg2 += local49;
								arg4 += local29;
							}
						}
						Static570.method7844(arg5 >> 16, arg0, arg2 >> 16, this.aByteArray90);
						arg2 += local49;
						arg5 += local13;
						arg0 += this.anInt8820;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local13;
					arg4 -= arg0 * local49;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg2 -= local29 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg0 || local13 <= local49) && (arg0 != arg1 || local13 >= local29)) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt8820 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static570.method7844(arg5 >> 16, arg0, arg2 >> 16, this.aByteArray90);
								arg5 += local13;
								arg0 += this.anInt8820;
								arg2 += local29;
							}
						}
						Static570.method7844(arg5 >> 16, arg0, arg4 >> 16, this.aByteArray90);
						arg5 += local13;
						arg0 += this.anInt8820;
						arg4 += local49;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt8820 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static570.method7844(arg2 >> 16, arg0, arg5 >> 16, this.aByteArray90);
								arg5 += local13;
								arg0 += this.anInt8820;
								arg2 += local29;
							}
						}
						Static570.method7844(arg4 >> 16, arg0, arg5 >> 16, this.aByteArray90);
						arg4 += local49;
						arg5 += local13;
						arg0 += this.anInt8820;
					}
				}
			}
		} else if (arg3 <= arg1) {
			if (arg1 >= arg0) {
				arg2 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local29 * arg3;
					arg2 -= arg3 * local13;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local49;
					arg0 = 0;
				}
				if (local29 <= local13) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt8820 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static570.method7844(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray90);
								arg4 += local29;
								arg3 += this.anInt8820;
								arg5 += local49;
							}
						}
						Static570.method7844(arg4 >> 16, arg3, arg2 >> 16, this.aByteArray90);
						arg3 += this.anInt8820;
						arg4 += local29;
						arg2 += local13;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt8820;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static570.method7844(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray90);
								arg4 += local29;
								arg5 += local49;
								arg3 += this.anInt8820;
							}
						}
						Static570.method7844(arg2 >> 16, arg3, arg4 >> 16, this.aByteArray90);
						arg4 += local29;
						arg2 += local13;
						arg3 += this.anInt8820;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local13;
					arg4 -= arg3 * local29;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local49;
					arg1 = 0;
				}
				if ((arg3 == arg1 || local13 >= local29) && (arg3 != arg1 || local13 <= local49)) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt8820;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static570.method7844(arg2 >> 16, arg3, arg5 >> 16, this.aByteArray90);
								arg3 += this.anInt8820;
								arg5 += local13;
								arg2 += local49;
							}
						}
						Static570.method7844(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray90);
						arg3 += this.anInt8820;
						arg4 += local29;
						arg5 += local13;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt8820;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static570.method7844(arg5 >> 16, arg3, arg2 >> 16, this.aByteArray90);
								arg5 += local13;
								arg3 += this.anInt8820;
								arg2 += local49;
							}
						}
						Static570.method7844(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray90);
						arg4 += local29;
						arg3 += this.anInt8820;
						arg5 += local13;
					}
				}
			}
		} else if (arg3 <= arg0) {
			arg5 = arg2 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local29;
				arg2 -= arg1 * local49;
				arg1 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local13;
				arg3 = 0;
			}
			if (local29 < local49) {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt8820;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static570.method7844(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray90);
							arg1 += this.anInt8820;
							arg2 += local49;
							arg4 += local13;
						}
					}
					Static570.method7844(arg5 >> 16, arg1, arg2 >> 16, this.aByteArray90);
					arg2 += local49;
					arg1 += this.anInt8820;
					arg5 += local29;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt8820;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static570.method7844(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray90);
							arg1 += this.anInt8820;
							arg4 += local13;
							arg2 += local49;
						}
					}
					Static570.method7844(arg2 >> 16, arg1, arg5 >> 16, this.aByteArray90);
					arg1 += this.anInt8820;
					arg5 += local29;
					arg2 += local49;
				}
			}
		} else {
			arg4 = arg2 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local49 * arg1;
				arg4 -= local29 * arg1;
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg5 -= local13 * arg0;
				arg0 = 0;
			}
			if (local29 >= local49) {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt8820;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static570.method7844(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray90);
							arg1 += this.anInt8820;
							arg5 += local13;
							arg4 += local29;
						}
					}
					Static570.method7844(arg2 >> 16, arg1, arg4 >> 16, this.aByteArray90);
					arg2 += local49;
					arg1 += this.anInt8820;
					arg4 += local29;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt8820;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static570.method7844(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray90);
							arg5 += local13;
							arg1 += this.anInt8820;
							arg4 += local29;
						}
					}
					Static570.method7844(arg4 >> 16, arg1, arg2 >> 16, this.aByteArray90);
					arg2 += local49;
					arg4 += local29;
					arg1 += this.anInt8820;
				}
			}
		}
	}
}
