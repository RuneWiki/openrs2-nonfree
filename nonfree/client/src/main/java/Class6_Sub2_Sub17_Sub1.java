import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class6_Sub2_Sub17_Sub1 extends Class6_Sub2_Sub17 {

	@OriginalMember(owner = "client!v", name = "B", descriptor = "I")
	public int anInt5973;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public int anInt5975;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public int anInt5976;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class6_Sub2_Sub17_Sub1(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray92 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
	public void method5398() {
		@Pc(1) int local1 = -1;
		@Pc(17) int local17 = this.aByteArray92.length - 8;
		while (local1 < local17) {
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
			local1++;
			this.aByteArray92[local1] = 0;
		}
		while (this.aByteArray92.length - 1 > local1) {
			local1++;
			this.aByteArray92[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	public void method5400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5974 = arg3;
		this.anInt5975 = arg2 - arg3;
		this.anInt5976 = arg1 - arg0;
		this.anInt5973 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Z")
	public boolean method5401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray92.length;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	public void method5402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg1) {
			local1 = (arg4 - arg0 << 16) / (arg2 - arg1);
		}
		@Pc(18) int local18 = 0;
		if (arg2 != arg5) {
			local18 = (arg3 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(46) int local46 = 0;
		if (arg5 != arg1) {
			local46 = (arg0 - arg3 << 16) / (arg1 - arg5);
		}
		if (arg2 >= arg1 && arg5 >= arg1) {
			if (arg2 >= arg5) {
				arg4 = arg0 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local1 * arg1;
					arg4 -= arg1 * local46;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg3 -= local18 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg1 && local46 < local1 || arg5 == arg1 && local18 > local1) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt5975 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static368.method5399(arg3 >> 16, arg0 >> 16, arg1, this.aByteArray92);
								arg3 += local18;
								arg0 += local1;
								arg1 += this.anInt5975;
							}
						}
						Static368.method5399(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray92);
						arg4 += local46;
						arg1 += this.anInt5975;
						arg0 += local1;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt5975;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static368.method5399(arg0 >> 16, arg3 >> 16, arg1, this.aByteArray92);
								arg0 += local1;
								arg1 += this.anInt5975;
								arg3 += local18;
							}
						}
						Static368.method5399(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray92);
						arg4 += local46;
						arg1 += this.anInt5975;
						arg0 += local1;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local46 * arg1;
					arg0 -= arg1 * local1;
					arg1 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg2 = 0;
				}
				if (arg1 != arg2 && local46 < local1 || arg2 == arg1 && local46 > local18) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt5975;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5399(arg3 >> 16, arg4 >> 16, arg1, this.aByteArray92);
								arg1 += this.anInt5975;
								arg3 += local46;
								arg4 += local18;
							}
						}
						Static368.method5399(arg3 >> 16, arg0 >> 16, arg1, this.aByteArray92);
						arg1 += this.anInt5975;
						arg0 += local1;
						arg3 += local46;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt5975;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5399(arg4 >> 16, arg3 >> 16, arg1, this.aByteArray92);
								arg4 += local18;
								arg1 += this.anInt5975;
								arg3 += local46;
							}
						}
						Static368.method5399(arg0 >> 16, arg3 >> 16, arg1, this.aByteArray92);
						arg3 += local46;
						arg0 += local1;
						arg1 += this.anInt5975;
					}
				}
			}
		} else if (arg5 < arg2) {
			if (arg1 < arg2) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local18;
					arg3 -= arg5 * local46;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg0 -= local1 * arg1;
					arg1 = 0;
				}
				if (local18 >= local46) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt5975;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static368.method5399(arg0 >> 16, arg4 >> 16, arg5, this.aByteArray92);
								arg4 += local18;
								arg0 += local1;
								arg5 += this.anInt5975;
							}
						}
						Static368.method5399(arg3 >> 16, arg4 >> 16, arg5, this.aByteArray92);
						arg3 += local46;
						arg4 += local18;
						arg5 += this.anInt5975;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt5975;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static368.method5399(arg4 >> 16, arg0 >> 16, arg5, this.aByteArray92);
								arg4 += local18;
								arg5 += this.anInt5975;
								arg0 += local1;
							}
						}
						Static368.method5399(arg4 >> 16, arg3 >> 16, arg5, this.aByteArray92);
						arg5 += this.anInt5975;
						arg3 += local46;
						arg4 += local18;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local18 * arg5;
					arg3 -= local46 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local1;
					arg2 = 0;
				}
				if (local46 <= local18) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt5975 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static368.method5399(arg3 >> 16, arg4 >> 16, arg5, this.aByteArray92);
								arg3 += local46;
								arg4 += local1;
								arg5 += this.anInt5975;
							}
						}
						Static368.method5399(arg3 >> 16, arg0 >> 16, arg5, this.aByteArray92);
						arg0 += local18;
						arg5 += this.anInt5975;
						arg3 += local46;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt5975;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static368.method5399(arg4 >> 16, arg3 >> 16, arg5, this.aByteArray92);
								arg5 += this.anInt5975;
								arg3 += local46;
								arg4 += local1;
							}
						}
						Static368.method5399(arg0 >> 16, arg3 >> 16, arg5, this.aByteArray92);
						arg5 += this.anInt5975;
						arg3 += local46;
						arg0 += local18;
					}
				}
			}
		} else if (arg5 >= arg1) {
			arg3 = arg4 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= arg2 * local1;
				arg4 -= arg2 * local18;
				arg2 = 0;
			}
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local46;
				arg1 = 0;
			}
			if (local18 <= local1) {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt5975;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static368.method5399(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray92);
							arg4 += local18;
							arg2 += this.anInt5975;
							arg0 += local46;
						}
					}
					Static368.method5399(arg4 >> 16, arg3 >> 16, arg2, this.aByteArray92);
					arg3 += local1;
					arg2 += this.anInt5975;
					arg4 += local18;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt5975;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static368.method5399(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray92);
							arg4 += local18;
							arg2 += this.anInt5975;
							arg0 += local46;
						}
					}
					Static368.method5399(arg3 >> 16, arg4 >> 16, arg2, this.aByteArray92);
					arg3 += local1;
					arg4 += local18;
					arg2 += this.anInt5975;
				}
			}
		} else {
			arg0 = arg4 <<= 0x10;
			arg3 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local18;
				arg0 -= local1 * arg2;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg3 -= arg5 * local46;
				arg5 = 0;
			}
			if (arg2 != arg5 && local18 > local1 || arg5 == arg2 && local1 > local46) {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt5975;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static368.method5399(arg0 >> 16, arg3 >> 16, arg2, this.aByteArray92);
							arg3 += local46;
							arg2 += this.anInt5975;
							arg0 += local1;
						}
					}
					Static368.method5399(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray92);
					arg2 += this.anInt5975;
					arg4 += local18;
					arg0 += local1;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt5975;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static368.method5399(arg3 >> 16, arg0 >> 16, arg2, this.aByteArray92);
							arg0 += local1;
							arg2 += this.anInt5975;
							arg3 += local46;
						}
					}
					Static368.method5399(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray92);
					arg0 += local1;
					arg4 += local18;
					arg2 += this.anInt5975;
				}
			}
		}
	}
}
