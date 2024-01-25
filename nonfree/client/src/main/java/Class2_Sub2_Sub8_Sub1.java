import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class2_Sub2_Sub8_Sub1 extends Class2_Sub2_Sub8 {

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
	public int anInt7947;

	@OriginalMember(owner = "client!sw", name = "D", descriptor = "I")
	public int anInt7950;

	@OriginalMember(owner = "client!sw", name = "G", descriptor = "I")
	public int anInt7952;

	@OriginalMember(owner = "client!sw", name = "J", descriptor = "I")
	public int anInt7953;

	@OriginalMember(owner = "client!sw", name = "U", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!um;II)V")
	public Class2_Sub2_Sub8_Sub1(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray86 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIII)V")
	public void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7953 = arg1;
		this.anInt7950 = arg0 - arg3;
		this.anInt7947 = arg3;
		this.anInt7952 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIIII)V")
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg5) {
			local7 = (arg1 - arg3 << 16) / (arg5 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg4 != arg5) {
			local28 = (arg2 - arg1 << 16) / (arg4 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg4 != arg0) {
			local49 = (arg3 - arg2 << 16) / (arg0 - arg4);
		}
		if (arg0 <= arg5 && arg4 >= arg0) {
			if (arg4 <= arg5) {
				arg1 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local49 * arg0;
					arg3 -= arg0 * local7;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local28 * arg4;
					arg4 = 0;
				}
				if (arg0 != arg4 && local49 < local7 || arg4 == arg0 && local28 > local7) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt7952 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static551.method7229(arg0, arg3 >> 16, this.aByteArray86, arg2 >> 16);
								arg2 += local28;
								arg3 += local7;
								arg0 += this.anInt7952;
							}
						}
						Static551.method7229(arg0, arg3 >> 16, this.aByteArray86, arg1 >> 16);
						arg1 += local49;
						arg0 += this.anInt7952;
						arg3 += local7;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt7952 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static551.method7229(arg0, arg2 >> 16, this.aByteArray86, arg3 >> 16);
								arg2 += local28;
								arg3 += local7;
								arg0 += this.anInt7952;
							}
						}
						Static551.method7229(arg0, arg1 >> 16, this.aByteArray86, arg3 >> 16);
						arg3 += local7;
						arg1 += local49;
						arg0 += this.anInt7952;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local49;
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local28 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg0 || local49 >= local7) && (arg0 != arg5 || local28 >= local49)) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt7952;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static551.method7229(arg0, arg2 >> 16, this.aByteArray86, arg1 >> 16);
								arg2 += local49;
								arg1 += local28;
								arg0 += this.anInt7952;
							}
						}
						Static551.method7229(arg0, arg2 >> 16, this.aByteArray86, arg3 >> 16);
						arg2 += local49;
						arg3 += local7;
						arg0 += this.anInt7952;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt7952;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static551.method7229(arg0, arg1 >> 16, this.aByteArray86, arg2 >> 16);
								arg0 += this.anInt7952;
								arg1 += local28;
								arg2 += local49;
							}
						}
						Static551.method7229(arg0, arg3 >> 16, this.aByteArray86, arg2 >> 16);
						arg0 += this.anInt7952;
						arg2 += local49;
						arg3 += local7;
					}
				}
			}
		} else if (arg4 >= arg5) {
			if (arg4 < arg0) {
				arg3 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local7;
					arg1 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local49;
					arg4 = 0;
				}
				if (arg4 != arg5 && local7 < local28 || arg5 == arg4 && local49 < local7) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt7952 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static551.method7229(arg5, arg2 >> 16, this.aByteArray86, arg3 >> 16);
								arg5 += this.anInt7952;
								arg2 += local49;
								arg3 += local7;
							}
						}
						Static551.method7229(arg5, arg1 >> 16, this.aByteArray86, arg3 >> 16);
						arg3 += local7;
						arg1 += local28;
						arg5 += this.anInt7952;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt7952;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static551.method7229(arg5, arg3 >> 16, this.aByteArray86, arg2 >> 16);
								arg5 += this.anInt7952;
								arg3 += local7;
								arg2 += local49;
							}
						}
						Static551.method7229(arg5, arg3 >> 16, this.aByteArray86, arg1 >> 16);
						arg1 += local28;
						arg5 += this.anInt7952;
						arg3 += local7;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local7 * arg5;
					arg1 -= local28 * arg5;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg3 -= local49 * arg0;
					arg0 = 0;
				}
				if (local28 <= local7) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt7952 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static551.method7229(arg5, arg3 >> 16, this.aByteArray86, arg1 >> 16);
								arg1 += local28;
								arg3 += local49;
								arg5 += this.anInt7952;
							}
						}
						Static551.method7229(arg5, arg2 >> 16, this.aByteArray86, arg1 >> 16);
						arg2 += local7;
						arg5 += this.anInt7952;
						arg1 += local28;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt7952;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static551.method7229(arg5, arg1 >> 16, this.aByteArray86, arg3 >> 16);
								arg3 += local49;
								arg1 += local28;
								arg5 += this.anInt7952;
							}
						}
						Static551.method7229(arg5, arg1 >> 16, this.aByteArray86, arg2 >> 16);
						arg2 += local7;
						arg1 += local28;
						arg5 += this.anInt7952;
					}
				}
			}
		} else if (arg0 < arg5) {
			arg1 = arg2 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= arg4 * local49;
				arg1 -= local28 * arg4;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg3 -= local7 * arg0;
				arg0 = 0;
			}
			if (local28 < local49) {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 *= this.anInt7952;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static551.method7229(arg4, arg3 >> 16, this.aByteArray86, arg1 >> 16);
							arg4 += this.anInt7952;
							arg3 += local7;
							arg1 += local28;
						}
					}
					Static551.method7229(arg4, arg2 >> 16, this.aByteArray86, arg1 >> 16);
					arg2 += local49;
					arg4 += this.anInt7952;
					arg1 += local28;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt7952 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static551.method7229(arg4, arg1 >> 16, this.aByteArray86, arg3 >> 16);
							arg1 += local28;
							arg4 += this.anInt7952;
							arg3 += local7;
						}
					}
					Static551.method7229(arg4, arg1 >> 16, this.aByteArray86, arg2 >> 16);
					arg4 += this.anInt7952;
					arg2 += local49;
					arg1 += local28;
				}
			}
		} else {
			arg3 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local49 * arg4;
				arg3 -= arg4 * local28;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg5 = 0;
			}
			if (local49 <= local28) {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt7952;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static551.method7229(arg4, arg1 >> 16, this.aByteArray86, arg2 >> 16);
							arg4 += this.anInt7952;
							arg2 += local49;
							arg1 += local7;
						}
					}
					Static551.method7229(arg4, arg3 >> 16, this.aByteArray86, arg2 >> 16);
					arg2 += local49;
					arg4 += this.anInt7952;
					arg3 += local28;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt7952;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static551.method7229(arg4, arg2 >> 16, this.aByteArray86, arg1 >> 16);
							arg4 += this.anInt7952;
							arg2 += local49;
							arg1 += local7;
						}
					}
					Static551.method7229(arg4, arg2 >> 16, this.aByteArray86, arg3 >> 16);
					arg2 += local49;
					arg3 += local28;
					arg4 += this.anInt7952;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIB)Z")
	public boolean method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray86.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)V")
	public void method6472() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray86.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
			local7++;
			this.aByteArray86[local7] = 0;
		}
		while (local7 < this.aByteArray86.length - 1) {
			local7++;
			this.aByteArray86[local7] = 0;
		}
	}
}
