import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class3_Sub10_Sub18_Sub2 extends Class3_Sub10_Sub18 {

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
	public int anInt9246;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
	public int anInt9247;

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
	public int anInt9249;

	@OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
	public int anInt9252;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "[B")
	public final byte[] aByteArray115;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!ad;II)V")
	public Class3_Sub10_Sub18_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray115 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public void method7645() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray115.length - 8;
		while (local17 > local11) {
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
			local11++;
			this.aByteArray115[local11] = 0;
		}
		while (this.aByteArray115.length - 1 > local11) {
			local11++;
			this.aByteArray115[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIBIIII)V")
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = 0;
		if (arg1 != arg2) {
			local12 = (arg4 - arg0 << 16) / (arg1 - arg2);
		}
		@Pc(29) int local29 = 0;
		if (arg1 != arg3) {
			local29 = (arg5 - arg4 << 16) / (arg3 - arg1);
		}
		@Pc(49) int local49 = 0;
		if (arg2 != arg3) {
			local49 = (arg0 - arg5 << 16) / (arg2 - arg3);
		}
		if (arg2 <= arg1 && arg2 <= arg3) {
			if (arg1 >= arg3) {
				arg4 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local12 * arg2;
					arg4 -= arg2 * local49;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg5 -= local29 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg2 && local49 < local12 || arg3 == arg2 && local12 < local29) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt9247;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static29.method805(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray115);
								arg5 += local29;
								arg0 += local12;
								arg2 += this.anInt9247;
							}
						}
						Static29.method805(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray115);
						arg0 += local12;
						arg4 += local49;
						arg2 += this.anInt9247;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt9247 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static29.method805(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray115);
								arg5 += local29;
								arg0 += local12;
								arg2 += this.anInt9247;
							}
						}
						Static29.method805(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray115);
						arg4 += local49;
						arg2 += this.anInt9247;
						arg0 += local12;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local12;
					arg5 -= local49 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local29 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg2 || local12 <= local49) && (arg2 != arg1 || local29 >= local49)) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt9247 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static29.method805(arg4 >> 16, arg5 >> 16, arg2, this.aByteArray115);
								arg4 += local29;
								arg5 += local49;
								arg2 += this.anInt9247;
							}
						}
						Static29.method805(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray115);
						arg2 += this.anInt9247;
						arg0 += local12;
						arg5 += local49;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt9247 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static29.method805(arg5 >> 16, arg4 >> 16, arg2, this.aByteArray115);
								arg4 += local29;
								arg5 += local49;
								arg2 += this.anInt9247;
							}
						}
						Static29.method805(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray115);
						arg2 += this.anInt9247;
						arg0 += local12;
						arg5 += local49;
					}
				}
			}
		} else if (arg1 <= arg3) {
			if (arg2 > arg3) {
				arg0 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local29;
					arg0 -= arg1 * local12;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local49;
					arg3 = 0;
				}
				if (arg1 != arg3 && local29 > local12 || arg3 == arg1 && local12 > local49) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt9247;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static29.method805(arg0 >> 16, arg5 >> 16, arg1, this.aByteArray115);
								arg0 += local12;
								arg5 += local49;
								arg1 += this.anInt9247;
							}
						}
						Static29.method805(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray115);
						arg1 += this.anInt9247;
						arg4 += local29;
						arg0 += local12;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt9247;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static29.method805(arg5 >> 16, arg0 >> 16, arg1, this.aByteArray115);
								arg1 += this.anInt9247;
								arg5 += local49;
								arg0 += local12;
							}
						}
						Static29.method805(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray115);
						arg0 += local12;
						arg4 += local29;
						arg1 += this.anInt9247;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local29;
					arg5 -= arg1 * local12;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local49 * arg2;
					arg2 = 0;
				}
				if (local12 >= local29) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt9247 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static29.method805(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray115);
								arg4 += local29;
								arg1 += this.anInt9247;
								arg0 += local49;
							}
						}
						Static29.method805(arg4 >> 16, arg5 >> 16, arg1, this.aByteArray115);
						arg5 += local12;
						arg1 += this.anInt9247;
						arg4 += local29;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt9247;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static29.method805(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray115);
								arg0 += local49;
								arg1 += this.anInt9247;
								arg4 += local29;
							}
						}
						Static29.method805(arg5 >> 16, arg4 >> 16, arg1, this.aByteArray115);
						arg1 += this.anInt9247;
						arg4 += local29;
						arg5 += local12;
					}
				}
			}
		} else if (arg1 > arg2) {
			arg4 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local29;
				arg5 -= arg3 * local49;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local12;
				arg2 = 0;
			}
			if (local49 > local29) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt9247;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static29.method805(arg4 >> 16, arg0 >> 16, arg3, this.aByteArray115);
							arg3 += this.anInt9247;
							arg0 += local12;
							arg4 += local29;
						}
					}
					Static29.method805(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray115);
					arg4 += local29;
					arg5 += local49;
					arg3 += this.anInt9247;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt9247 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static29.method805(arg0 >> 16, arg4 >> 16, arg3, this.aByteArray115);
							arg0 += local12;
							arg4 += local29;
							arg3 += this.anInt9247;
						}
					}
					Static29.method805(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray115);
					arg5 += local49;
					arg3 += this.anInt9247;
					arg4 += local29;
				}
			}
		} else {
			arg0 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local49 * arg3;
				arg0 -= local29 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local12 * arg1;
				arg1 = 0;
			}
			if (local49 <= local29) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt9247;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static29.method805(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray115);
							arg4 += local12;
							arg5 += local49;
							arg3 += this.anInt9247;
						}
					}
					Static29.method805(arg5 >> 16, arg0 >> 16, arg3, this.aByteArray115);
					arg3 += this.anInt9247;
					arg5 += local49;
					arg0 += local29;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 *= this.anInt9247;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static29.method805(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray115);
							arg3 += this.anInt9247;
							arg5 += local49;
							arg4 += local12;
						}
					}
					Static29.method805(arg0 >> 16, arg5 >> 16, arg3, this.aByteArray115);
					arg5 += local49;
					arg3 += this.anInt9247;
					arg0 += local29;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BII)Z")
	public boolean method7648(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray115.length;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIII)V")
	public void method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9247 = arg2 - arg1;
		this.anInt9249 = arg3;
		this.anInt9252 = arg1;
		this.anInt9246 = arg0 - arg3;
	}
}
