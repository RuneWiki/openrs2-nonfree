import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class3_Sub3_Sub9_Sub1 extends Class3_Sub3_Sub9 {

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!nq;II)V")
	public Class3_Sub3_Sub9_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray43 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIB)V")
	public void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2331 = arg3 - arg1;
		this.anInt2336 = arg0;
		this.anInt2329 = arg2 - arg0;
		this.anInt2335 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public boolean method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray43.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
	public void method2020() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray43.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
			local7++;
			this.aByteArray43[local7] = 0;
		}
		while (this.aByteArray43.length - 1 > local7) {
			local7++;
			this.aByteArray43[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBIII)V")
	public void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg4) {
			local7 = (arg0 - arg3 << 16) / (arg4 - arg1);
		}
		@Pc(27) int local27 = 0;
		if (arg2 != arg4) {
			local27 = (arg5 - arg0 << 16) / (arg2 - arg4);
		}
		@Pc(48) int local48 = 0;
		if (arg2 != arg1) {
			local48 = (arg3 - arg5 << 16) / (arg1 - arg2);
		}
		if (arg4 >= arg1 && arg1 <= arg2) {
			if (arg4 >= arg2) {
				arg0 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local48;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg5 -= local27 * arg2;
					arg2 = 0;
				}
				if (arg2 != arg1 && local7 > local48 || arg1 == arg2 && local7 < local27) {
					arg4 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt2329 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static422.method4718(arg3 >> 16, this.aByteArray43, arg5 >> 16, arg1);
								arg1 += this.anInt2329;
								arg3 += local7;
								arg5 += local27;
							}
						}
						Static422.method4718(arg3 >> 16, this.aByteArray43, arg0 >> 16, arg1);
						arg0 += local48;
						arg3 += local7;
						arg1 += this.anInt2329;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt2329;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static422.method4718(arg5 >> 16, this.aByteArray43, arg3 >> 16, arg1);
								arg3 += local7;
								arg5 += local27;
								arg1 += this.anInt2329;
							}
						}
						Static422.method4718(arg0 >> 16, this.aByteArray43, arg3 >> 16, arg1);
						arg1 += this.anInt2329;
						arg0 += local48;
						arg3 += local7;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg5 -= local48 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local27 * arg4;
					arg4 = 0;
				}
				if ((arg1 == arg4 || local7 <= local48) && (arg1 != arg4 || local48 <= local27)) {
					arg2 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt2329 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static422.method4718(arg5 >> 16, this.aByteArray43, arg0 >> 16, arg1);
								arg1 += this.anInt2329;
								arg0 += local27;
								arg5 += local48;
							}
						}
						Static422.method4718(arg5 >> 16, this.aByteArray43, arg3 >> 16, arg1);
						arg5 += local48;
						arg1 += this.anInt2329;
						arg3 += local7;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt2329;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static422.method4718(arg0 >> 16, this.aByteArray43, arg5 >> 16, arg1);
								arg0 += local27;
								arg1 += this.anInt2329;
								arg5 += local48;
							}
						}
						Static422.method4718(arg3 >> 16, this.aByteArray43, arg5 >> 16, arg1);
						arg1 += this.anInt2329;
						arg5 += local48;
						arg3 += local7;
					}
				}
			}
		} else if (arg4 > arg2) {
			if (arg4 <= arg1) {
				arg3 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local27 * arg2;
					arg5 -= arg2 * local48;
					arg2 = 0;
				}
				if (arg4 < 0) {
					arg0 -= arg4 * local7;
					arg4 = 0;
				}
				if (local27 >= local48) {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt2329 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static422.method4718(arg0 >> 16, this.aByteArray43, arg5 >> 16, arg2);
								arg5 += local48;
								arg0 += local7;
								arg2 += this.anInt2329;
							}
						}
						Static422.method4718(arg3 >> 16, this.aByteArray43, arg5 >> 16, arg2);
						arg2 += this.anInt2329;
						arg3 += local27;
						arg5 += local48;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt2329;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static422.method4718(arg5 >> 16, this.aByteArray43, arg0 >> 16, arg2);
								arg5 += local48;
								arg2 += this.anInt2329;
								arg0 += local7;
							}
						}
						Static422.method4718(arg5 >> 16, this.aByteArray43, arg3 >> 16, arg2);
						arg3 += local27;
						arg5 += local48;
						arg2 += this.anInt2329;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local48;
					arg0 -= arg2 * local27;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg1 = 0;
				}
				if (local27 < local48) {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt2329 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static422.method4718(arg3 >> 16, this.aByteArray43, arg0 >> 16, arg2);
								arg3 += local7;
								arg2 += this.anInt2329;
								arg0 += local27;
							}
						}
						Static422.method4718(arg5 >> 16, this.aByteArray43, arg0 >> 16, arg2);
						arg5 += local48;
						arg0 += local27;
						arg2 += this.anInt2329;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt2329;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static422.method4718(arg0 >> 16, this.aByteArray43, arg3 >> 16, arg2);
								arg3 += local7;
								arg0 += local27;
								arg2 += this.anInt2329;
							}
						}
						Static422.method4718(arg0 >> 16, this.aByteArray43, arg5 >> 16, arg2);
						arg5 += local48;
						arg2 += this.anInt2329;
						arg0 += local27;
					}
				}
			}
		} else if (arg1 > arg2) {
			arg3 = arg0 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local7;
				arg0 -= arg4 * local27;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local48 * arg2;
				arg2 = 0;
			}
			if ((arg2 == arg4 || local7 >= local27) && (arg4 != arg2 || local48 >= local7)) {
				arg1 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt2329 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static422.method4718(arg3 >> 16, this.aByteArray43, arg5 >> 16, arg4);
							arg3 += local7;
							arg5 += local48;
							arg4 += this.anInt2329;
						}
					}
					Static422.method4718(arg3 >> 16, this.aByteArray43, arg0 >> 16, arg4);
					arg0 += local27;
					arg4 += this.anInt2329;
					arg3 += local7;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt2329;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static422.method4718(arg5 >> 16, this.aByteArray43, arg3 >> 16, arg4);
							arg3 += local7;
							arg4 += this.anInt2329;
							arg5 += local48;
						}
					}
					Static422.method4718(arg0 >> 16, this.aByteArray43, arg3 >> 16, arg4);
					arg4 += this.anInt2329;
					arg0 += local27;
					arg3 += local7;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local7;
				arg0 -= arg4 * local27;
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg3 -= local48 * arg1;
				arg1 = 0;
			}
			if (local27 > local7) {
				arg2 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt2329;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static422.method4718(arg0 >> 16, this.aByteArray43, arg3 >> 16, arg4);
							arg0 += local27;
							arg3 += local48;
							arg4 += this.anInt2329;
						}
					}
					Static422.method4718(arg0 >> 16, this.aByteArray43, arg5 >> 16, arg4);
					arg5 += local7;
					arg0 += local27;
					arg4 += this.anInt2329;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt2329 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static422.method4718(arg3 >> 16, this.aByteArray43, arg0 >> 16, arg4);
							arg0 += local27;
							arg4 += this.anInt2329;
							arg3 += local48;
						}
					}
					Static422.method4718(arg5 >> 16, this.aByteArray43, arg0 >> 16, arg4);
					arg5 += local7;
					arg4 += this.anInt2329;
					arg0 += local27;
				}
			}
		}
	}
}
