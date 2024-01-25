import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class6_Sub2_Sub10_Sub1 extends Class6_Sub2_Sub10 {

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
	public int anInt4262;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
	public int anInt4265;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public Class6_Sub2_Sub10_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray51 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIZIII)V")
	public void method3614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg5 != arg2) {
			local13 = (arg3 - arg1 << 16) / (arg2 - arg5);
		}
		@Pc(34) int local34 = 0;
		if (arg4 != arg2) {
			local34 = (arg0 - arg3 << 16) / (arg4 - arg2);
		}
		@Pc(50) int local50 = 0;
		if (arg4 != arg5) {
			local50 = (arg1 - arg0 << 16) / (arg5 - arg4);
		}
		if (arg5 <= arg2 && arg5 <= arg4) {
			if (arg4 > arg2) {
				arg0 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local13 * arg5;
					arg0 -= local50 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local34 * arg2;
					arg2 = 0;
				}
				if (arg5 != arg2 && local13 > local50 || arg2 == arg5 && local50 > local34) {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt4262 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg3 >> 16, arg0 >> 16, arg5);
								arg3 += local34;
								arg0 += local50;
								arg5 += this.anInt4262;
							}
						}
						Static280.method4208(this.aByteArray51, arg1 >> 16, arg0 >> 16, arg5);
						arg5 += this.anInt4262;
						arg1 += local13;
						arg0 += local50;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt4262 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg0 >> 16, arg3 >> 16, arg5);
								arg0 += local50;
								arg5 += this.anInt4262;
								arg3 += local34;
							}
						}
						Static280.method4208(this.aByteArray51, arg0 >> 16, arg1 >> 16, arg5);
						arg0 += local50;
						arg1 += local13;
						arg5 += this.anInt4262;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local50 * arg5;
					arg1 -= arg5 * local13;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local34 * arg4;
					arg4 = 0;
				}
				if ((arg5 == arg4 || local50 >= local13) && (arg4 != arg5 || local34 <= local13)) {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt4262;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg0 >> 16, arg1 >> 16, arg5);
								arg5 += this.anInt4262;
								arg0 += local34;
								arg1 += local13;
							}
						}
						Static280.method4208(this.aByteArray51, arg3 >> 16, arg1 >> 16, arg5);
						arg1 += local13;
						arg3 += local50;
						arg5 += this.anInt4262;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt4262;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg1 >> 16, arg0 >> 16, arg5);
								arg1 += local13;
								arg0 += local34;
								arg5 += this.anInt4262;
							}
						}
						Static280.method4208(this.aByteArray51, arg1 >> 16, arg3 >> 16, arg5);
						arg1 += local13;
						arg5 += this.anInt4262;
						arg3 += local50;
					}
				}
			}
		} else if (arg4 < arg2) {
			if (arg2 > arg5) {
				arg3 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local34;
					arg0 -= arg4 * local50;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local13 * arg5;
					arg5 = 0;
				}
				if (local50 <= local34) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt4262 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg3 >> 16, arg1 >> 16, arg4);
								arg4 += this.anInt4262;
								arg3 += local34;
								arg1 += local13;
							}
						}
						Static280.method4208(this.aByteArray51, arg3 >> 16, arg0 >> 16, arg4);
						arg4 += this.anInt4262;
						arg3 += local34;
						arg0 += local50;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt4262 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg1 >> 16, arg3 >> 16, arg4);
								arg4 += this.anInt4262;
								arg3 += local34;
								arg1 += local13;
							}
						}
						Static280.method4208(this.aByteArray51, arg0 >> 16, arg3 >> 16, arg4);
						arg0 += local50;
						arg3 += local34;
						arg4 += this.anInt4262;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local34 * arg4;
					arg0 -= local50 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local13 * arg2;
					arg2 = 0;
				}
				if (local34 < local50) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt4262;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg0 >> 16, arg3 >> 16, arg4);
								arg0 += local50;
								arg4 += this.anInt4262;
								arg3 += local13;
							}
						}
						Static280.method4208(this.aByteArray51, arg0 >> 16, arg1 >> 16, arg4);
						arg4 += this.anInt4262;
						arg0 += local50;
						arg1 += local34;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4262 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static280.method4208(this.aByteArray51, arg3 >> 16, arg0 >> 16, arg4);
								arg3 += local13;
								arg4 += this.anInt4262;
								arg0 += local50;
							}
						}
						Static280.method4208(this.aByteArray51, arg1 >> 16, arg0 >> 16, arg4);
						arg1 += local34;
						arg4 += this.anInt4262;
						arg0 += local50;
					}
				}
			}
		} else if (arg5 > arg4) {
			arg1 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local13 * arg2;
				arg3 -= local34 * arg2;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local50 * arg4;
				arg4 = 0;
			}
			if ((arg2 == arg4 || local13 >= local34) && (arg4 != arg2 || local50 >= local13)) {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 = this.anInt4262 * arg2;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static280.method4208(this.aByteArray51, arg1 >> 16, arg0 >> 16, arg2);
							arg2 += this.anInt4262;
							arg0 += local50;
							arg1 += local13;
						}
					}
					Static280.method4208(this.aByteArray51, arg1 >> 16, arg3 >> 16, arg2);
					arg3 += local34;
					arg2 += this.anInt4262;
					arg1 += local13;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt4262;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static280.method4208(this.aByteArray51, arg0 >> 16, arg1 >> 16, arg2);
							arg2 += this.anInt4262;
							arg1 += local13;
							arg0 += local50;
						}
					}
					Static280.method4208(this.aByteArray51, arg3 >> 16, arg1 >> 16, arg2);
					arg2 += this.anInt4262;
					arg3 += local34;
					arg1 += local13;
				}
			}
		} else {
			arg0 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local34;
				arg0 -= local13 * arg2;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local50;
				arg5 = 0;
			}
			if (local34 > local13) {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt4262;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static280.method4208(this.aByteArray51, arg3 >> 16, arg1 >> 16, arg2);
							arg2 += this.anInt4262;
							arg3 += local34;
							arg1 += local50;
						}
					}
					Static280.method4208(this.aByteArray51, arg3 >> 16, arg0 >> 16, arg2);
					arg0 += local13;
					arg3 += local34;
					arg2 += this.anInt4262;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt4262;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static280.method4208(this.aByteArray51, arg1 >> 16, arg3 >> 16, arg2);
							arg1 += local50;
							arg3 += local34;
							arg2 += this.anInt4262;
						}
					}
					Static280.method4208(this.aByteArray51, arg0 >> 16, arg3 >> 16, arg2);
					arg3 += local34;
					arg0 += local13;
					arg2 += this.anInt4262;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	public void method3615() {
		@Pc(16) int local16 = -1;
		@Pc(22) int local22 = this.aByteArray51.length - 8;
		while (local22 > local16) {
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
			local16++;
			this.aByteArray51[local16] = 0;
		}
		while (this.aByteArray51.length - 1 > local16) {
			local16++;
			this.aByteArray51[local16] = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)Z")
	public boolean method3617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray51.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V")
	public void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4272 = arg0 - arg1;
		this.anInt4265 = arg2;
		this.anInt4262 = arg3 - arg2;
		this.anInt4269 = arg1;
	}
}
