import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class4_Sub6_Sub7_Sub2 extends Class4_Sub6_Sub7 {

	@OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
	public int anInt9667;

	@OriginalMember(owner = "client!uda", name = "L", descriptor = "I")
	public int anInt9669;

	@OriginalMember(owner = "client!uda", name = "S", descriptor = "I")
	public int anInt9674;

	@OriginalMember(owner = "client!uda", name = "V", descriptor = "I")
	public int anInt9676;

	@OriginalMember(owner = "client!uda", name = "U", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!nh;II)V")
	public Class4_Sub6_Sub7_Sub2(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray91 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BIIII)V")
	public void method7448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9667 = arg3 - arg2;
		this.anInt9676 = arg1 - arg0;
		this.anInt9669 = arg0;
		this.anInt9674 = arg2;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIII)V")
	public void method7449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg3 - arg4 << 16) / (arg0 - arg2);
		}
		@Pc(36) int local36 = 0;
		if (arg1 != arg0) {
			local36 = (arg5 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(53) int local53 = 0;
		if (arg1 != arg2) {
			local53 = (arg4 - arg5 << 16) / (arg2 - arg1);
		}
		if (arg0 >= arg2 && arg1 >= arg2) {
			if (arg1 > arg0) {
				arg5 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local53 * arg2;
					arg4 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg3 -= arg0 * local36;
					arg0 = 0;
				}
				if (arg2 != arg0 && local7 > local53 || arg0 == arg2 && local36 < local53) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt9676;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static451.method6631(arg3 >> 16, arg2, this.aByteArray91, arg5 >> 16);
								arg5 += local53;
								arg3 += local36;
								arg2 += this.anInt9676;
							}
						}
						Static451.method6631(arg4 >> 16, arg2, this.aByteArray91, arg5 >> 16);
						arg5 += local53;
						arg2 += this.anInt9676;
						arg4 += local7;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt9676 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static451.method6631(arg5 >> 16, arg2, this.aByteArray91, arg3 >> 16);
								arg2 += this.anInt9676;
								arg5 += local53;
								arg3 += local36;
							}
						}
						Static451.method6631(arg5 >> 16, arg2, this.aByteArray91, arg4 >> 16);
						arg5 += local53;
						arg2 += this.anInt9676;
						arg4 += local7;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local7;
					arg3 -= local53 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= arg1 * local36;
					arg1 = 0;
				}
				if ((arg2 == arg1 || local53 >= local7) && (arg1 != arg2 || local36 <= local7)) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt9676;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static451.method6631(arg5 >> 16, arg2, this.aByteArray91, arg4 >> 16);
								arg2 += this.anInt9676;
								arg5 += local36;
								arg4 += local7;
							}
						}
						Static451.method6631(arg3 >> 16, arg2, this.aByteArray91, arg4 >> 16);
						arg3 += local53;
						arg4 += local7;
						arg2 += this.anInt9676;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt9676;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static451.method6631(arg4 >> 16, arg2, this.aByteArray91, arg5 >> 16);
								arg4 += local7;
								arg2 += this.anInt9676;
								arg5 += local36;
							}
						}
						Static451.method6631(arg4 >> 16, arg2, this.aByteArray91, arg3 >> 16);
						arg3 += local53;
						arg2 += this.anInt9676;
						arg4 += local7;
					}
				}
			}
		} else if (arg1 >= arg0) {
			if (arg1 >= arg2) {
				arg5 = arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local36;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local53 * arg2;
					arg2 = 0;
				}
				if (local7 >= local36) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt9676 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static451.method6631(arg4 >> 16, arg0, this.aByteArray91, arg3 >> 16);
								arg3 += local36;
								arg4 += local53;
								arg0 += this.anInt9676;
							}
						}
						Static451.method6631(arg5 >> 16, arg0, this.aByteArray91, arg3 >> 16);
						arg3 += local36;
						arg0 += this.anInt9676;
						arg5 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt9676;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static451.method6631(arg3 >> 16, arg0, this.aByteArray91, arg4 >> 16);
								arg4 += local53;
								arg0 += this.anInt9676;
								arg3 += local36;
							}
						}
						Static451.method6631(arg3 >> 16, arg0, this.aByteArray91, arg5 >> 16);
						arg3 += local36;
						arg5 += local7;
						arg0 += this.anInt9676;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local36;
					arg4 -= local7 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg5 -= local53 * arg1;
					arg1 = 0;
				}
				if ((arg0 == arg1 || local7 >= local36) && (arg0 != arg1 || local7 <= local53)) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt9676 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static451.method6631(arg4 >> 16, arg0, this.aByteArray91, arg5 >> 16);
								arg0 += this.anInt9676;
								arg4 += local7;
								arg5 += local53;
							}
						}
						Static451.method6631(arg4 >> 16, arg0, this.aByteArray91, arg3 >> 16);
						arg4 += local7;
						arg0 += this.anInt9676;
						arg3 += local36;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt9676 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static451.method6631(arg5 >> 16, arg0, this.aByteArray91, arg4 >> 16);
								arg4 += local7;
								arg5 += local53;
								arg0 += this.anInt9676;
							}
						}
						Static451.method6631(arg3 >> 16, arg0, this.aByteArray91, arg4 >> 16);
						arg4 += local7;
						arg0 += this.anInt9676;
						arg3 += local36;
					}
				}
			}
		} else if (arg2 >= arg0) {
			arg4 = arg5 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= arg1 * local53;
				arg4 -= arg1 * local36;
				arg1 = 0;
			}
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local7;
				arg0 = 0;
			}
			if (local53 > local36) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt9676;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static451.method6631(arg5 >> 16, arg1, this.aByteArray91, arg3 >> 16);
							arg3 += local7;
							arg5 += local53;
							arg1 += this.anInt9676;
						}
					}
					Static451.method6631(arg5 >> 16, arg1, this.aByteArray91, arg4 >> 16);
					arg4 += local36;
					arg1 += this.anInt9676;
					arg5 += local53;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt9676 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static451.method6631(arg3 >> 16, arg1, this.aByteArray91, arg5 >> 16);
							arg1 += this.anInt9676;
							arg5 += local53;
							arg3 += local7;
						}
					}
					Static451.method6631(arg4 >> 16, arg1, this.aByteArray91, arg5 >> 16);
					arg5 += local53;
					arg4 += local36;
					arg1 += this.anInt9676;
				}
			}
		} else {
			arg3 = arg5 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= local53 * arg1;
				arg3 -= local36 * arg1;
				arg1 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local7 * arg2;
				arg2 = 0;
			}
			if (local53 > local36) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = this.anInt9676 * arg1;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static451.method6631(arg4 >> 16, arg1, this.aByteArray91, arg3 >> 16);
							arg3 += local36;
							arg1 += this.anInt9676;
							arg4 += local7;
						}
					}
					Static451.method6631(arg5 >> 16, arg1, this.aByteArray91, arg3 >> 16);
					arg5 += local53;
					arg1 += this.anInt9676;
					arg3 += local36;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt9676;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static451.method6631(arg3 >> 16, arg1, this.aByteArray91, arg4 >> 16);
							arg4 += local7;
							arg3 += local36;
							arg1 += this.anInt9676;
						}
					}
					Static451.method6631(arg3 >> 16, arg1, this.aByteArray91, arg5 >> 16);
					arg1 += this.anInt9676;
					arg3 += local36;
					arg5 += local53;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public void method7450() {
		@Pc(19) int local19 = -1;
		@Pc(25) int local25 = this.aByteArray91.length - 8;
		while (local19 < local25) {
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
			local19++;
			this.aByteArray91[local19] = 0;
		}
		while (local19 < this.aByteArray91.length - 1) {
			local19++;
			this.aByteArray91[local19] = 0;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(III)Z")
	public boolean method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray91.length >= arg1 * arg0;
	}
}
