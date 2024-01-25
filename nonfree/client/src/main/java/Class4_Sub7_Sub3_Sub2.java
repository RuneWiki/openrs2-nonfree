import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class4_Sub7_Sub3_Sub2 extends Class4_Sub7_Sub3 {

	@OriginalMember(owner = "client!nw", name = "A", descriptor = "I")
	public int anInt6600;

	@OriginalMember(owner = "client!nw", name = "B", descriptor = "I")
	public int anInt6601;

	@OriginalMember(owner = "client!nw", name = "E", descriptor = "I")
	public int anInt6603;

	@OriginalMember(owner = "client!nw", name = "P", descriptor = "I")
	public int anInt6608;

	@OriginalMember(owner = "client!nw", name = "I", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!no;II)V")
	public Class4_Sub7_Sub3_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray73 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V")
	public void method5507() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray73.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
			local7++;
			this.aByteArray73[local7] = 0;
		}
		while (this.aByteArray73.length - 1 > local7) {
			local7++;
			this.aByteArray73[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)V")
	public void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6600 = arg3 - arg2;
		this.anInt6603 = arg1 - arg0;
		this.anInt6608 = arg2;
		this.anInt6601 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZIIIII)V")
	public void method5511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg2) {
			local7 = (arg0 - arg5 << 16) / (arg3 - arg2);
		}
		@Pc(28) int local28 = 0;
		if (arg1 != arg3) {
			local28 = (arg4 - arg0 << 16) / (arg1 - arg3);
		}
		@Pc(54) int local54 = 0;
		if (arg1 != arg2) {
			local54 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		if (arg3 >= arg2 && arg2 <= arg1) {
			if (arg1 > arg3) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local7;
					arg4 -= local54 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= local28 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg2 && local7 > local54 || arg2 == arg3 && local28 < local54) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt6600;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static245.method4152(arg4 >> 16, arg2, arg0 >> 16, this.aByteArray73);
								arg4 += local54;
								arg0 += local28;
								arg2 += this.anInt6600;
							}
						}
						Static245.method4152(arg4 >> 16, arg2, arg5 >> 16, this.aByteArray73);
						arg5 += local7;
						arg4 += local54;
						arg2 += this.anInt6600;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt6600;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static245.method4152(arg0 >> 16, arg2, arg4 >> 16, this.aByteArray73);
								arg4 += local54;
								arg2 += this.anInt6600;
								arg0 += local28;
							}
						}
						Static245.method4152(arg5 >> 16, arg2, arg4 >> 16, this.aByteArray73);
						arg4 += local54;
						arg5 += local7;
						arg2 += this.anInt6600;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local54 * arg2;
					arg5 -= local7 * arg2;
					arg2 = 0;
				}
				if (arg1 < 0) {
					arg4 -= local28 * arg1;
					arg1 = 0;
				}
				if ((arg2 == arg1 || local7 <= local54) && (arg1 != arg2 || local7 >= local28)) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt6600;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static245.method4152(arg5 >> 16, arg2, arg4 >> 16, this.aByteArray73);
								arg5 += local7;
								arg4 += local28;
								arg2 += this.anInt6600;
							}
						}
						Static245.method4152(arg5 >> 16, arg2, arg0 >> 16, this.aByteArray73);
						arg0 += local54;
						arg5 += local7;
						arg2 += this.anInt6600;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt6600;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static245.method4152(arg4 >> 16, arg2, arg5 >> 16, this.aByteArray73);
								arg2 += this.anInt6600;
								arg4 += local28;
								arg5 += local7;
							}
						}
						Static245.method4152(arg0 >> 16, arg2, arg5 >> 16, this.aByteArray73);
						arg2 += this.anInt6600;
						arg0 += local54;
						arg5 += local7;
					}
				}
			}
		} else if (arg1 >= arg3) {
			if (arg1 >= arg2) {
				arg4 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local7 * arg3;
					arg0 -= local28 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg5 -= arg2 * local54;
					arg2 = 0;
				}
				if (local7 < local28) {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6600;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static245.method4152(arg5 >> 16, arg3, arg0 >> 16, this.aByteArray73);
								arg3 += this.anInt6600;
								arg0 += local28;
								arg5 += local54;
							}
						}
						Static245.method4152(arg4 >> 16, arg3, arg0 >> 16, this.aByteArray73);
						arg3 += this.anInt6600;
						arg0 += local28;
						arg4 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt6600;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static245.method4152(arg0 >> 16, arg3, arg5 >> 16, this.aByteArray73);
								arg5 += local54;
								arg3 += this.anInt6600;
								arg0 += local28;
							}
						}
						Static245.method4152(arg0 >> 16, arg3, arg4 >> 16, this.aByteArray73);
						arg3 += this.anInt6600;
						arg4 += local7;
						arg0 += local28;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local28;
					arg5 -= arg3 * local7;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local54;
					arg1 = 0;
				}
				if ((arg1 == arg3 || local28 <= local7) && (arg1 != arg3 || local7 <= local54)) {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6600 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static245.method4152(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray73);
								arg3 += this.anInt6600;
								arg5 += local7;
								arg4 += local54;
							}
						}
						Static245.method4152(arg0 >> 16, arg3, arg5 >> 16, this.aByteArray73);
						arg3 += this.anInt6600;
						arg0 += local28;
						arg5 += local7;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt6600 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static245.method4152(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray73);
								arg5 += local7;
								arg3 += this.anInt6600;
								arg4 += local54;
							}
						}
						Static245.method4152(arg5 >> 16, arg3, arg0 >> 16, this.aByteArray73);
						arg3 += this.anInt6600;
						arg5 += local7;
						arg0 += local28;
					}
				}
			}
		} else if (arg3 <= arg2) {
			arg5 = arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local54;
				arg5 -= local28 * arg1;
				arg1 = 0;
			}
			arg0 <<= 0x10;
			if (arg3 < 0) {
				arg0 -= local7 * arg3;
				arg3 = 0;
			}
			if (local28 < local54) {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt6600 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static245.method4152(arg0 >> 16, arg1, arg4 >> 16, this.aByteArray73);
							arg0 += local7;
							arg1 += this.anInt6600;
							arg4 += local54;
						}
					}
					Static245.method4152(arg5 >> 16, arg1, arg4 >> 16, this.aByteArray73);
					arg4 += local54;
					arg1 += this.anInt6600;
					arg5 += local28;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 *= this.anInt6600;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static245.method4152(arg4 >> 16, arg1, arg0 >> 16, this.aByteArray73);
							arg1 += this.anInt6600;
							arg0 += local7;
							arg4 += local54;
						}
					}
					Static245.method4152(arg4 >> 16, arg1, arg5 >> 16, this.aByteArray73);
					arg1 += this.anInt6600;
					arg4 += local54;
					arg5 += local28;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local54;
				arg0 -= local28 * arg1;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= arg2 * local7;
				arg2 = 0;
			}
			if (local54 > local28) {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt6600;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static245.method4152(arg0 >> 16, arg1, arg5 >> 16, this.aByteArray73);
							arg5 += local7;
							arg0 += local28;
							arg1 += this.anInt6600;
						}
					}
					Static245.method4152(arg0 >> 16, arg1, arg4 >> 16, this.aByteArray73);
					arg0 += local28;
					arg1 += this.anInt6600;
					arg4 += local54;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt6600 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static245.method4152(arg5 >> 16, arg1, arg0 >> 16, this.aByteArray73);
							arg0 += local28;
							arg5 += local7;
							arg1 += this.anInt6600;
						}
					}
					Static245.method4152(arg4 >> 16, arg1, arg0 >> 16, this.aByteArray73);
					arg4 += local54;
					arg0 += local28;
					arg1 += this.anInt6600;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
	public boolean method5512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray73.length;
	}
}
