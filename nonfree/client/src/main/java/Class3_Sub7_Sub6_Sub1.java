import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class3_Sub7_Sub6_Sub1 extends Class3_Sub7_Sub6 {

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
	public int anInt2337;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public int anInt2338;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public int anInt2340;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!mi;II)V")
	public Class3_Sub7_Sub6_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray35 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)Z")
	public boolean method1973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray35.length;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIII)V")
	public void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2339 = arg2 - arg1;
		this.anInt2340 = arg0;
		this.anInt2337 = arg1;
		this.anInt2338 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(B)V")
	public void method1975() {
		@Pc(1) int local1 = -1;
		@Pc(19) int local19 = this.aByteArray35.length - 8;
		while (local19 > local1) {
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
			local1++;
			this.aByteArray35[local1] = 0;
		}
		while (this.aByteArray35.length - 1 > local1) {
			local1++;
			this.aByteArray35[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V")
	public void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg4) {
			local7 = (arg2 - arg0 << 16) / (arg5 - arg4);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg5) {
			local27 = (arg1 - arg2 << 16) / (arg3 - arg5);
		}
		@Pc(44) int local44 = 0;
		if (arg3 != arg4) {
			local44 = (arg0 - arg1 << 16) / (arg4 - arg3);
		}
		if (arg4 <= arg5 && arg3 >= arg4) {
			if (arg3 <= arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local7;
					arg2 -= arg4 * local44;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local27 * arg3;
					arg3 = 0;
				}
				if (arg4 != arg3 && local7 > local44 || arg4 == arg3 && local27 > local7) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt2339;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg1 >> 16, arg0 >> 16, arg4);
								arg4 += this.anInt2339;
								arg0 += local7;
								arg1 += local27;
							}
						}
						Static401.method1977(this.aByteArray35, arg2 >> 16, arg0 >> 16, arg4);
						arg0 += local7;
						arg2 += local44;
						arg4 += this.anInt2339;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt2339 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg0 >> 16, arg1 >> 16, arg4);
								arg4 += this.anInt2339;
								arg0 += local7;
								arg1 += local27;
							}
						}
						Static401.method1977(this.aByteArray35, arg0 >> 16, arg2 >> 16, arg4);
						arg0 += local7;
						arg2 += local44;
						arg4 += this.anInt2339;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local7;
					arg1 -= arg4 * local44;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg2 -= local27 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg4 && local7 > local44 || arg4 == arg5 && local44 > local27) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt2339 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg1 >> 16, arg2 >> 16, arg4);
								arg4 += this.anInt2339;
								arg2 += local27;
								arg1 += local44;
							}
						}
						Static401.method1977(this.aByteArray35, arg1 >> 16, arg0 >> 16, arg4);
						arg0 += local7;
						arg4 += this.anInt2339;
						arg1 += local44;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt2339 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg2 >> 16, arg1 >> 16, arg4);
								arg4 += this.anInt2339;
								arg1 += local44;
								arg2 += local27;
							}
						}
						Static401.method1977(this.aByteArray35, arg0 >> 16, arg1 >> 16, arg4);
						arg0 += local7;
						arg1 += local44;
						arg4 += this.anInt2339;
					}
				}
			}
		} else if (arg3 >= arg5) {
			if (arg3 < arg4) {
				arg0 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local27 * arg5;
					arg0 -= arg5 * local7;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local44;
					arg3 = 0;
				}
				if ((arg3 == arg5 || local7 >= local27) && (arg5 != arg3 || local44 >= local7)) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2339 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg1 >> 16, arg0 >> 16, arg5);
								arg1 += local44;
								arg5 += this.anInt2339;
								arg0 += local7;
							}
						}
						Static401.method1977(this.aByteArray35, arg2 >> 16, arg0 >> 16, arg5);
						arg2 += local27;
						arg5 += this.anInt2339;
						arg0 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2339 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg0 >> 16, arg1 >> 16, arg5);
								arg1 += local44;
								arg5 += this.anInt2339;
								arg0 += local7;
							}
						}
						Static401.method1977(this.aByteArray35, arg0 >> 16, arg2 >> 16, arg5);
						arg0 += local7;
						arg5 += this.anInt2339;
						arg2 += local27;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg2 -= arg5 * local27;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local44 * arg4;
					arg4 = 0;
				}
				if (local27 > local7) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt2339;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg0 >> 16, arg2 >> 16, arg5);
								arg5 += this.anInt2339;
								arg2 += local27;
								arg0 += local44;
							}
						}
						Static401.method1977(this.aByteArray35, arg1 >> 16, arg2 >> 16, arg5);
						arg5 += this.anInt2339;
						arg2 += local27;
						arg1 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt2339 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static401.method1977(this.aByteArray35, arg2 >> 16, arg0 >> 16, arg5);
								arg5 += this.anInt2339;
								arg0 += local44;
								arg2 += local27;
							}
						}
						Static401.method1977(this.aByteArray35, arg2 >> 16, arg1 >> 16, arg5);
						arg2 += local27;
						arg5 += this.anInt2339;
						arg1 += local7;
					}
				}
			}
		} else if (arg4 >= arg5) {
			arg0 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local44 * arg3;
				arg0 -= arg3 * local27;
				arg3 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local7;
				arg5 = 0;
			}
			if (local44 > local27) {
				arg4 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt2339;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static401.method1977(this.aByteArray35, arg2 >> 16, arg1 >> 16, arg3);
							arg2 += local7;
							arg1 += local44;
							arg3 += this.anInt2339;
						}
					}
					Static401.method1977(this.aByteArray35, arg0 >> 16, arg1 >> 16, arg3);
					arg3 += this.anInt2339;
					arg0 += local27;
					arg1 += local44;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt2339;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static401.method1977(this.aByteArray35, arg1 >> 16, arg2 >> 16, arg3);
							arg2 += local7;
							arg1 += local44;
							arg3 += this.anInt2339;
						}
					}
					Static401.method1977(this.aByteArray35, arg1 >> 16, arg0 >> 16, arg3);
					arg1 += local44;
					arg0 += local27;
					arg3 += this.anInt2339;
				}
			}
		} else {
			arg2 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local27;
				arg1 -= arg3 * local44;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local7;
				arg4 = 0;
			}
			if (local44 > local27) {
				arg5 -= arg4;
				arg4 -= arg3;
				arg3 = this.anInt2339 * arg3;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static401.method1977(this.aByteArray35, arg2 >> 16, arg0 >> 16, arg3);
							arg0 += local7;
							arg2 += local27;
							arg3 += this.anInt2339;
						}
					}
					Static401.method1977(this.aByteArray35, arg2 >> 16, arg1 >> 16, arg3);
					arg3 += this.anInt2339;
					arg2 += local27;
					arg1 += local44;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg3;
				arg3 *= this.anInt2339;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static401.method1977(this.aByteArray35, arg0 >> 16, arg2 >> 16, arg3);
							arg0 += local7;
							arg3 += this.anInt2339;
							arg2 += local27;
						}
					}
					Static401.method1977(this.aByteArray35, arg1 >> 16, arg2 >> 16, arg3);
					arg1 += local44;
					arg3 += this.anInt2339;
					arg2 += local27;
				}
			}
		}
	}
}
