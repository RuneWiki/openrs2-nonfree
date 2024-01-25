import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class2_Sub7_Sub17_Sub2 extends Class2_Sub7_Sub17 {

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	public int anInt9954;

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
	public int anInt9956;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	public int anInt9957;

	@OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
	public int anInt9960;

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ij;II)V")
	public Class2_Sub7_Sub17_Sub2(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray103 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZ)Z")
	public boolean method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray103.length;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIBI)V")
	public void method8463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9960 = arg2;
		this.anInt9957 = arg3;
		this.anInt9954 = arg0 - arg3;
		this.anInt9956 = arg1 - arg2;
	}

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
	public void method8466() {
		@Pc(19) int local19 = -1;
		@Pc(25) int local25 = this.aByteArray103.length - 8;
		while (local25 > local19) {
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
			local19++;
			this.aByteArray103[local19] = 0;
		}
		while (local19 < this.aByteArray103.length - 1) {
			local19++;
			this.aByteArray103[local19] = 0;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIIBI)V")
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg0) {
			local7 = (arg3 - arg2 << 16) / (arg4 - arg0);
		}
		@Pc(24) int local24 = 0;
		if (arg4 != arg5) {
			local24 = (arg1 - arg3 << 16) / (arg5 - arg4);
		}
		@Pc(53) int local53 = 0;
		if (arg0 != arg5) {
			local53 = (arg2 - arg1 << 16) / (arg0 - arg5);
		}
		if (arg4 >= arg0 && arg0 <= arg5) {
			if (arg5 > arg4) {
				arg1 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local53;
					arg2 -= local7 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local24;
					arg4 = 0;
				}
				if (arg0 != arg4 && local7 > local53 || arg0 == arg4 && local24 < local53) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt9956 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static38.method889(arg1 >> 16, arg0, arg3 >> 16, this.aByteArray103);
								arg0 += this.anInt9956;
								arg3 += local24;
								arg1 += local53;
							}
						}
						Static38.method889(arg1 >> 16, arg0, arg2 >> 16, this.aByteArray103);
						arg2 += local7;
						arg0 += this.anInt9956;
						arg1 += local53;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt9956;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static38.method889(arg3 >> 16, arg0, arg1 >> 16, this.aByteArray103);
								arg3 += local24;
								arg1 += local53;
								arg0 += this.anInt9956;
							}
						}
						Static38.method889(arg2 >> 16, arg0, arg1 >> 16, this.aByteArray103);
						arg2 += local7;
						arg0 += this.anInt9956;
						arg1 += local53;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= local7 * arg0;
					arg3 -= arg0 * local53;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local24 * arg5;
					arg5 = 0;
				}
				if ((arg0 == arg5 || local53 >= local7) && (arg5 != arg0 || local24 <= local7)) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt9956 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static38.method889(arg2 >> 16, arg0, arg1 >> 16, this.aByteArray103);
								arg1 += local24;
								arg2 += local7;
								arg0 += this.anInt9956;
							}
						}
						Static38.method889(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray103);
						arg0 += this.anInt9956;
						arg2 += local7;
						arg3 += local53;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt9956;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static38.method889(arg1 >> 16, arg0, arg2 >> 16, this.aByteArray103);
								arg2 += local7;
								arg1 += local24;
								arg0 += this.anInt9956;
							}
						}
						Static38.method889(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray103);
						arg3 += local53;
						arg2 += local7;
						arg0 += this.anInt9956;
					}
				}
			}
		} else if (arg5 >= arg4) {
			if (arg0 > arg5) {
				arg2 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local24;
					arg2 -= arg4 * local7;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg1 -= arg5 * local53;
					arg5 = 0;
				}
				if (arg4 != arg5 && local24 > local7 || arg5 == arg4 && local7 > local53) {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9956 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static38.method889(arg2 >> 16, arg4, arg1 >> 16, this.aByteArray103);
								arg2 += local7;
								arg4 += this.anInt9956;
								arg1 += local53;
							}
						}
						Static38.method889(arg2 >> 16, arg4, arg3 >> 16, this.aByteArray103);
						arg3 += local24;
						arg4 += this.anInt9956;
						arg2 += local7;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt9956;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static38.method889(arg1 >> 16, arg4, arg2 >> 16, this.aByteArray103);
								arg4 += this.anInt9956;
								arg1 += local53;
								arg2 += local7;
							}
						}
						Static38.method889(arg3 >> 16, arg4, arg2 >> 16, this.aByteArray103);
						arg3 += local24;
						arg2 += local7;
						arg4 += this.anInt9956;
					}
				}
			} else {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= local7 * arg4;
					arg3 -= arg4 * local24;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local53;
					arg0 = 0;
				}
				if (local24 <= local7) {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt9956;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static38.method889(arg3 >> 16, arg4, arg2 >> 16, this.aByteArray103);
								arg4 += this.anInt9956;
								arg3 += local24;
								arg2 += local53;
							}
						}
						Static38.method889(arg3 >> 16, arg4, arg1 >> 16, this.aByteArray103);
						arg1 += local7;
						arg4 += this.anInt9956;
						arg3 += local24;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt9956;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static38.method889(arg2 >> 16, arg4, arg3 >> 16, this.aByteArray103);
								arg4 += this.anInt9956;
								arg2 += local53;
								arg3 += local24;
							}
						}
						Static38.method889(arg1 >> 16, arg4, arg3 >> 16, this.aByteArray103);
						arg3 += local24;
						arg4 += this.anInt9956;
						arg1 += local7;
					}
				}
			}
		} else if (arg0 < arg4) {
			arg3 = arg1 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local24 * arg5;
				arg1 -= arg5 * local53;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local7;
				arg0 = 0;
			}
			if (local53 > local24) {
				arg4 -= arg0;
				arg0 -= arg5;
				arg5 = this.anInt9956 * arg5;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static38.method889(arg3 >> 16, arg5, arg2 >> 16, this.aByteArray103);
							arg2 += local7;
							arg3 += local24;
							arg5 += this.anInt9956;
						}
					}
					Static38.method889(arg3 >> 16, arg5, arg1 >> 16, this.aByteArray103);
					arg1 += local53;
					arg3 += local24;
					arg5 += this.anInt9956;
				}
			} else {
				arg4 -= arg0;
				arg0 -= arg5;
				arg5 *= this.anInt9956;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static38.method889(arg2 >> 16, arg5, arg3 >> 16, this.aByteArray103);
							arg5 += this.anInt9956;
							arg3 += local24;
							arg2 += local7;
						}
					}
					Static38.method889(arg1 >> 16, arg5, arg3 >> 16, this.aByteArray103);
					arg5 += this.anInt9956;
					arg3 += local24;
					arg1 += local53;
				}
			}
		} else {
			arg2 = arg1 <<= 0x10;
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg1 -= arg5 * local53;
				arg2 -= arg5 * local24;
				arg5 = 0;
			}
			if (arg4 < 0) {
				arg3 -= local7 * arg4;
				arg4 = 0;
			}
			if (local53 <= local24) {
				arg0 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt9956;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static38.method889(arg1 >> 16, arg5, arg3 >> 16, this.aByteArray103);
							arg3 += local7;
							arg5 += this.anInt9956;
							arg1 += local53;
						}
					}
					Static38.method889(arg1 >> 16, arg5, arg2 >> 16, this.aByteArray103);
					arg1 += local53;
					arg2 += local24;
					arg5 += this.anInt9956;
				}
			} else {
				arg0 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt9956;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static38.method889(arg3 >> 16, arg5, arg1 >> 16, this.aByteArray103);
							arg3 += local7;
							arg5 += this.anInt9956;
							arg1 += local53;
						}
					}
					Static38.method889(arg2 >> 16, arg5, arg1 >> 16, this.aByteArray103);
					arg5 += this.anInt9956;
					arg1 += local53;
					arg2 += local24;
				}
			}
		}
	}
}
