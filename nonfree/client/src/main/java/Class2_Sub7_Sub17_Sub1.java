import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class2_Sub7_Sub17_Sub1 extends Class2_Sub7_Sub17 {

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
	public int anInt9882;

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
	public int anInt9884;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
	public int anInt9887;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	public int anInt9888;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "[B")
	public final byte[] aByteArray102;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!bi;II)V")
	public Class2_Sub7_Sub17_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray102 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIZIII)V")
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = 0;
		if (arg2 != arg5) {
			local17 = (arg0 - arg4 << 16) / (arg2 - arg5);
		}
		@Pc(34) int local34 = 0;
		if (arg2 != arg3) {
			local34 = (arg1 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(50) int local50 = 0;
		if (arg5 != arg3) {
			local50 = (arg4 - arg1 << 16) / (arg5 - arg3);
		}
		if (arg5 <= arg2 && arg3 >= arg5) {
			if (arg3 <= arg2) {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local50;
					arg4 -= local17 * arg5;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local34;
					arg3 = 0;
				}
				if (arg3 != arg5 && local50 < local17 || arg5 == arg3 && local34 > local17) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt9884;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static95.method1909(arg5, arg1 >> 16, this.aByteArray102, arg4 >> 16);
								arg4 += local17;
								arg5 += this.anInt9884;
								arg1 += local34;
							}
						}
						Static95.method1909(arg5, arg0 >> 16, this.aByteArray102, arg4 >> 16);
						arg0 += local50;
						arg5 += this.anInt9884;
						arg4 += local17;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt9884 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static95.method1909(arg5, arg4 >> 16, this.aByteArray102, arg1 >> 16);
								arg5 += this.anInt9884;
								arg1 += local34;
								arg4 += local17;
							}
						}
						Static95.method1909(arg5, arg4 >> 16, this.aByteArray102, arg0 >> 16);
						arg4 += local17;
						arg5 += this.anInt9884;
						arg0 += local50;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local17;
					arg1 -= arg5 * local50;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local34;
					arg2 = 0;
				}
				if ((arg2 == arg5 || local17 <= local50) && (arg2 != arg5 || local34 >= local50)) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt9884;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static95.method1909(arg5, arg0 >> 16, this.aByteArray102, arg1 >> 16);
								arg0 += local34;
								arg5 += this.anInt9884;
								arg1 += local50;
							}
						}
						Static95.method1909(arg5, arg4 >> 16, this.aByteArray102, arg1 >> 16);
						arg4 += local17;
						arg5 += this.anInt9884;
						arg1 += local50;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt9884;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static95.method1909(arg5, arg1 >> 16, this.aByteArray102, arg0 >> 16);
								arg1 += local50;
								arg0 += local34;
								arg5 += this.anInt9884;
							}
						}
						Static95.method1909(arg5, arg1 >> 16, this.aByteArray102, arg4 >> 16);
						arg4 += local17;
						arg5 += this.anInt9884;
						arg1 += local50;
					}
				}
			}
		} else if (arg3 < arg2) {
			if (arg2 <= arg5) {
				arg4 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local50;
					arg4 -= arg3 * local34;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local17 * arg2;
					arg2 = 0;
				}
				if (local34 < local50) {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt9884 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1909(arg3, arg0 >> 16, this.aByteArray102, arg1 >> 16);
								arg3 += this.anInt9884;
								arg0 += local17;
								arg1 += local50;
							}
						}
						Static95.method1909(arg3, arg4 >> 16, this.aByteArray102, arg1 >> 16);
						arg4 += local34;
						arg1 += local50;
						arg3 += this.anInt9884;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt9884 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static95.method1909(arg3, arg1 >> 16, this.aByteArray102, arg0 >> 16);
								arg0 += local17;
								arg3 += this.anInt9884;
								arg1 += local50;
							}
						}
						Static95.method1909(arg3, arg1 >> 16, this.aByteArray102, arg4 >> 16);
						arg3 += this.anInt9884;
						arg1 += local50;
						arg4 += local34;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local34;
					arg1 -= local50 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local17 * arg5;
					arg5 = 0;
				}
				if (local50 <= local34) {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt9884;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static95.method1909(arg3, arg4 >> 16, this.aByteArray102, arg0 >> 16);
								arg3 += this.anInt9884;
								arg4 += local17;
								arg0 += local34;
							}
						}
						Static95.method1909(arg3, arg1 >> 16, this.aByteArray102, arg0 >> 16);
						arg1 += local50;
						arg0 += local34;
						arg3 += this.anInt9884;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt9884 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static95.method1909(arg3, arg0 >> 16, this.aByteArray102, arg4 >> 16);
								arg3 += this.anInt9884;
								arg4 += local17;
								arg0 += local34;
							}
						}
						Static95.method1909(arg3, arg0 >> 16, this.aByteArray102, arg1 >> 16);
						arg1 += local50;
						arg3 += this.anInt9884;
						arg0 += local34;
					}
				}
			}
		} else if (arg5 <= arg3) {
			arg1 = arg0 <<= 0x10;
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local34 * arg2;
				arg1 -= local17 * arg2;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local50 * arg5;
				arg5 = 0;
			}
			if (local34 <= local17) {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt9884 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static95.method1909(arg2, arg0 >> 16, this.aByteArray102, arg4 >> 16);
							arg0 += local34;
							arg2 += this.anInt9884;
							arg4 += local50;
						}
					}
					Static95.method1909(arg2, arg0 >> 16, this.aByteArray102, arg1 >> 16);
					arg2 += this.anInt9884;
					arg0 += local34;
					arg1 += local17;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt9884 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static95.method1909(arg2, arg4 >> 16, this.aByteArray102, arg0 >> 16);
							arg0 += local34;
							arg4 += local50;
							arg2 += this.anInt9884;
						}
					}
					Static95.method1909(arg2, arg1 >> 16, this.aByteArray102, arg0 >> 16);
					arg2 += this.anInt9884;
					arg0 += local34;
					arg1 += local17;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local17 * arg2;
				arg0 -= arg2 * local34;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= arg3 * local50;
				arg3 = 0;
			}
			if (arg3 != arg2 && local34 > local17 || arg2 == arg3 && local50 < local17) {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt9884;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static95.method1909(arg2, arg4 >> 16, this.aByteArray102, arg1 >> 16);
							arg2 += this.anInt9884;
							arg1 += local50;
							arg4 += local17;
						}
					}
					Static95.method1909(arg2, arg4 >> 16, this.aByteArray102, arg0 >> 16);
					arg4 += local17;
					arg2 += this.anInt9884;
					arg0 += local34;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt9884 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static95.method1909(arg2, arg1 >> 16, this.aByteArray102, arg4 >> 16);
							arg1 += local50;
							arg4 += local17;
							arg2 += this.anInt9884;
						}
					}
					Static95.method1909(arg2, arg0 >> 16, this.aByteArray102, arg4 >> 16);
					arg4 += local17;
					arg0 += local34;
					arg2 += this.anInt9884;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
	public void method8389() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray102.length - 8;
		while (local15 < local21) {
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
			local15++;
			this.aByteArray102[local15] = 0;
		}
		while (local15 < this.aByteArray102.length - 1) {
			local15++;
			this.aByteArray102[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z")
	public boolean method8391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray102.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIII)V")
	public void method8392(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9888 = arg2;
		this.anInt9882 = arg3 - arg1;
		this.anInt9884 = arg0 - arg2;
		this.anInt9887 = arg1;
	}
}
