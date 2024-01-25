import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub6_Sub5_Sub2 extends Class1_Sub6_Sub5 {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int anInt8919;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	public int anInt8923;

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
	public int anInt8924;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
	public int anInt8925;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!hea;II)V")
	public Class1_Sub6_Sub5_Sub2(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray95 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public void method7294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8924 = arg2 - arg1;
		this.anInt8925 = arg3 - arg0;
		this.anInt8923 = arg0;
		this.anInt8919 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIIII)V")
	public void method7297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg5) {
			local7 = (arg3 - arg1 << 16) / (arg2 - arg5);
		}
		@Pc(28) int local28 = 0;
		if (arg4 != arg2) {
			local28 = (arg0 - arg3 << 16) / (arg4 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg4 != arg5) {
			local48 = (arg1 - arg0 << 16) / (arg5 - arg4);
		}
		if (arg5 <= arg2 && arg4 >= arg5) {
			if (arg2 >= arg4) {
				arg3 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg3 -= local48 * arg5;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local28 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg5 && local7 > local48 || arg4 == arg5 && local7 < local28) {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8924 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static164.method7467(arg5, arg1 >> 16, arg0 >> 16, this.aByteArray95);
								arg5 += this.anInt8924;
								arg0 += local28;
								arg1 += local7;
							}
						}
						Static164.method7467(arg5, arg1 >> 16, arg3 >> 16, this.aByteArray95);
						arg1 += local7;
						arg5 += this.anInt8924;
						arg3 += local48;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8924 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static164.method7467(arg5, arg0 >> 16, arg1 >> 16, this.aByteArray95);
								arg1 += local7;
								arg0 += local28;
								arg5 += this.anInt8924;
							}
						}
						Static164.method7467(arg5, arg3 >> 16, arg1 >> 16, this.aByteArray95);
						arg3 += local48;
						arg1 += local7;
						arg5 += this.anInt8924;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local48;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg3 -= arg2 * local28;
					arg2 = 0;
				}
				if ((arg5 == arg2 || local7 <= local48) && (arg2 != arg5 || local28 >= local48)) {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt8924;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static164.method7467(arg5, arg0 >> 16, arg3 >> 16, this.aByteArray95);
								arg0 += local48;
								arg3 += local28;
								arg5 += this.anInt8924;
							}
						}
						Static164.method7467(arg5, arg0 >> 16, arg1 >> 16, this.aByteArray95);
						arg1 += local7;
						arg5 += this.anInt8924;
						arg0 += local48;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt8924;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static164.method7467(arg5, arg3 >> 16, arg0 >> 16, this.aByteArray95);
								arg5 += this.anInt8924;
								arg0 += local48;
								arg3 += local28;
							}
						}
						Static164.method7467(arg5, arg1 >> 16, arg0 >> 16, this.aByteArray95);
						arg5 += this.anInt8924;
						arg0 += local48;
						arg1 += local7;
					}
				}
			}
		} else if (arg2 > arg4) {
			if (arg5 >= arg2) {
				arg1 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local48;
					arg1 -= local28 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local7;
					arg2 = 0;
				}
				if (local48 <= local28) {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt8924 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static164.method7467(arg4, arg3 >> 16, arg0 >> 16, this.aByteArray95);
								arg3 += local7;
								arg0 += local48;
								arg4 += this.anInt8924;
							}
						}
						Static164.method7467(arg4, arg1 >> 16, arg0 >> 16, this.aByteArray95);
						arg1 += local28;
						arg4 += this.anInt8924;
						arg0 += local48;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg4;
					arg4 *= this.anInt8924;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static164.method7467(arg4, arg0 >> 16, arg3 >> 16, this.aByteArray95);
								arg4 += this.anInt8924;
								arg3 += local7;
								arg0 += local48;
							}
						}
						Static164.method7467(arg4, arg0 >> 16, arg1 >> 16, this.aByteArray95);
						arg0 += local48;
						arg1 += local28;
						arg4 += this.anInt8924;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local28 * arg4;
					arg0 -= local48 * arg4;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg5 = 0;
				}
				if (local48 > local28) {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8924;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static164.method7467(arg4, arg1 >> 16, arg3 >> 16, this.aByteArray95);
								arg4 += this.anInt8924;
								arg3 += local28;
								arg1 += local7;
							}
						}
						Static164.method7467(arg4, arg0 >> 16, arg3 >> 16, this.aByteArray95);
						arg4 += this.anInt8924;
						arg3 += local28;
						arg0 += local48;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8924;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static164.method7467(arg4, arg3 >> 16, arg1 >> 16, this.aByteArray95);
								arg1 += local7;
								arg3 += local28;
								arg4 += this.anInt8924;
							}
						}
						Static164.method7467(arg4, arg3 >> 16, arg0 >> 16, this.aByteArray95);
						arg0 += local48;
						arg4 += this.anInt8924;
						arg3 += local28;
					}
				}
			}
		} else if (arg4 < arg5) {
			arg1 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local7;
				arg3 -= arg2 * local28;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local48;
				arg4 = 0;
			}
			if ((arg2 == arg4 || local7 >= local28) && (arg4 != arg2 || local7 <= local48)) {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt8924;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static164.method7467(arg2, arg1 >> 16, arg0 >> 16, this.aByteArray95);
							arg1 += local7;
							arg2 += this.anInt8924;
							arg0 += local48;
						}
					}
					Static164.method7467(arg2, arg1 >> 16, arg3 >> 16, this.aByteArray95);
					arg3 += local28;
					arg2 += this.anInt8924;
					arg1 += local7;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt8924;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static164.method7467(arg2, arg0 >> 16, arg1 >> 16, this.aByteArray95);
							arg2 += this.anInt8924;
							arg0 += local48;
							arg1 += local7;
						}
					}
					Static164.method7467(arg2, arg3 >> 16, arg1 >> 16, this.aByteArray95);
					arg3 += local28;
					arg2 += this.anInt8924;
					arg1 += local7;
				}
			}
		} else {
			arg0 = arg3 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local28;
				arg0 -= local7 * arg2;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= local48 * arg5;
				arg5 = 0;
			}
			if (local7 >= local28) {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt8924;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static164.method7467(arg2, arg1 >> 16, arg3 >> 16, this.aByteArray95);
							arg1 += local48;
							arg2 += this.anInt8924;
							arg3 += local28;
						}
					}
					Static164.method7467(arg2, arg0 >> 16, arg3 >> 16, this.aByteArray95);
					arg2 += this.anInt8924;
					arg0 += local7;
					arg3 += local28;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt8924 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static164.method7467(arg2, arg3 >> 16, arg1 >> 16, this.aByteArray95);
							arg2 += this.anInt8924;
							arg1 += local48;
							arg3 += local28;
						}
					}
					Static164.method7467(arg2, arg3 >> 16, arg0 >> 16, this.aByteArray95);
					arg3 += local28;
					arg0 += local7;
					arg2 += this.anInt8924;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
	public boolean method7298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray95.length;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(B)V")
	public void method7299() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray95.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
			local7++;
			this.aByteArray95[local7] = 0;
		}
		while (this.aByteArray95.length - 1 > local7) {
			local7++;
			this.aByteArray95[local7] = 0;
		}
	}
}
