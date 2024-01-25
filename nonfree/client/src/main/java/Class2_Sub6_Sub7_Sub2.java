import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub6_Sub7_Sub2 extends Class2_Sub6_Sub7 {

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	public int anInt10145;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	public int anInt10147;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public int anInt10149;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	public int anInt10150;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "[B")
	public final byte[] aByteArray129;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!qo;II)V")
	public Class2_Sub6_Sub7_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray129 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
	public void method8453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10147 = arg2;
		this.anInt10150 = arg3;
		this.anInt10149 = arg0 - arg2;
		this.anInt10145 = arg1 - arg3;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
	public void method8454() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray129.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
			local7++;
			this.aByteArray129[local7] = 0;
		}
		while (this.aByteArray129.length - 1 > local7) {
			local7++;
			this.aByteArray129[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
	public void method8455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg2) {
			local7 = (arg3 - arg1 << 16) / (arg5 - arg2);
		}
		@Pc(32) int local32 = 0;
		if (arg5 != arg4) {
			local32 = (arg0 - arg3 << 16) / (arg4 - arg5);
		}
		@Pc(48) int local48 = 0;
		if (arg2 != arg4) {
			local48 = (arg1 - arg0 << 16) / (arg2 - arg4);
		}
		if (arg5 >= arg2 && arg2 <= arg4) {
			if (arg5 < arg4) {
				arg0 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local48;
					arg1 -= local7 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local32 * arg5;
					arg5 = 0;
				}
				if (arg2 != arg5 && local48 < local7 || arg5 == arg2 && local48 > local32) {
					arg4 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt10145 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static638.method9206(arg0 >> 16, arg2, this.aByteArray129, arg3 >> 16);
								arg3 += local32;
								arg2 += this.anInt10145;
								arg0 += local48;
							}
						}
						Static638.method9206(arg0 >> 16, arg2, this.aByteArray129, arg1 >> 16);
						arg2 += this.anInt10145;
						arg0 += local48;
						arg1 += local7;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt10145 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static638.method9206(arg3 >> 16, arg2, this.aByteArray129, arg0 >> 16);
								arg0 += local48;
								arg2 += this.anInt10145;
								arg3 += local32;
							}
						}
						Static638.method9206(arg1 >> 16, arg2, this.aByteArray129, arg0 >> 16);
						arg1 += local7;
						arg2 += this.anInt10145;
						arg0 += local48;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local7 * arg2;
					arg3 -= local48 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local32 * arg4;
					arg4 = 0;
				}
				if ((arg4 == arg2 || local7 <= local48) && (arg2 != arg4 || local32 <= local7)) {
					arg5 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt10145 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static638.method9206(arg1 >> 16, arg2, this.aByteArray129, arg0 >> 16);
								arg2 += this.anInt10145;
								arg1 += local7;
								arg0 += local32;
							}
						}
						Static638.method9206(arg1 >> 16, arg2, this.aByteArray129, arg3 >> 16);
						arg3 += local48;
						arg2 += this.anInt10145;
						arg1 += local7;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt10145;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static638.method9206(arg0 >> 16, arg2, this.aByteArray129, arg1 >> 16);
								arg0 += local32;
								arg1 += local7;
								arg2 += this.anInt10145;
							}
						}
						Static638.method9206(arg3 >> 16, arg2, this.aByteArray129, arg1 >> 16);
						arg2 += this.anInt10145;
						arg3 += local48;
						arg1 += local7;
					}
				}
			}
		} else if (arg5 > arg4) {
			if (arg5 <= arg2) {
				arg1 = arg0 <<= 0x10;
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local48;
					arg1 -= arg4 * local32;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg3 -= arg5 * local7;
					arg5 = 0;
				}
				if (local32 >= local48) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt10145 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static638.method9206(arg0 >> 16, arg4, this.aByteArray129, arg3 >> 16);
								arg3 += local7;
								arg0 += local48;
								arg4 += this.anInt10145;
							}
						}
						Static638.method9206(arg0 >> 16, arg4, this.aByteArray129, arg1 >> 16);
						arg1 += local32;
						arg4 += this.anInt10145;
						arg0 += local48;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt10145;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static638.method9206(arg3 >> 16, arg4, this.aByteArray129, arg0 >> 16);
								arg0 += local48;
								arg3 += local7;
								arg4 += this.anInt10145;
							}
						}
						Static638.method9206(arg1 >> 16, arg4, this.aByteArray129, arg0 >> 16);
						arg0 += local48;
						arg1 += local32;
						arg4 += this.anInt10145;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local32 * arg4;
					arg0 -= arg4 * local48;
					arg4 = 0;
				}
				if (arg2 < 0) {
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (local48 > local32) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt10145 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static638.method9206(arg3 >> 16, arg4, this.aByteArray129, arg1 >> 16);
								arg3 += local32;
								arg1 += local7;
								arg4 += this.anInt10145;
							}
						}
						Static638.method9206(arg3 >> 16, arg4, this.aByteArray129, arg0 >> 16);
						arg4 += this.anInt10145;
						arg0 += local48;
						arg3 += local32;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt10145;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static638.method9206(arg1 >> 16, arg4, this.aByteArray129, arg3 >> 16);
								arg4 += this.anInt10145;
								arg3 += local32;
								arg1 += local7;
							}
						}
						Static638.method9206(arg0 >> 16, arg4, this.aByteArray129, arg3 >> 16);
						arg0 += local48;
						arg3 += local32;
						arg4 += this.anInt10145;
					}
				}
			}
		} else if (arg4 >= arg2) {
			arg0 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local7;
				arg3 -= local32 * arg5;
				arg5 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local48;
				arg2 = 0;
			}
			if (local7 < local32) {
				arg4 -= arg2;
				arg2 -= arg5;
				arg5 = this.anInt10145 * arg5;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static638.method9206(arg1 >> 16, arg5, this.aByteArray129, arg3 >> 16);
							arg1 += local48;
							arg3 += local32;
							arg5 += this.anInt10145;
						}
					}
					Static638.method9206(arg0 >> 16, arg5, this.aByteArray129, arg3 >> 16);
					arg0 += local7;
					arg3 += local32;
					arg5 += this.anInt10145;
				}
			} else {
				arg4 -= arg2;
				arg2 -= arg5;
				arg5 *= this.anInt10145;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static638.method9206(arg3 >> 16, arg5, this.aByteArray129, arg1 >> 16);
							arg3 += local32;
							arg1 += local48;
							arg5 += this.anInt10145;
						}
					}
					Static638.method9206(arg3 >> 16, arg5, this.aByteArray129, arg0 >> 16);
					arg3 += local32;
					arg0 += local7;
					arg5 += this.anInt10145;
				}
			}
		} else {
			arg1 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local7 * arg5;
				arg3 -= local32 * arg5;
				arg5 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local48 * arg4;
				arg4 = 0;
			}
			if (arg5 != arg4 && local32 > local7 || arg4 == arg5 && local7 > local48) {
				arg2 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt10145 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static638.method9206(arg1 >> 16, arg5, this.aByteArray129, arg0 >> 16);
							arg1 += local7;
							arg0 += local48;
							arg5 += this.anInt10145;
						}
					}
					Static638.method9206(arg1 >> 16, arg5, this.aByteArray129, arg3 >> 16);
					arg5 += this.anInt10145;
					arg1 += local7;
					arg3 += local32;
				}
			} else {
				arg2 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt10145 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static638.method9206(arg0 >> 16, arg5, this.aByteArray129, arg1 >> 16);
							arg5 += this.anInt10145;
							arg0 += local48;
							arg1 += local7;
						}
					}
					Static638.method9206(arg3 >> 16, arg5, this.aByteArray129, arg1 >> 16);
					arg1 += local7;
					arg5 += this.anInt10145;
					arg3 += local32;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BII)Z")
	public boolean method8457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray129.length;
	}
}
