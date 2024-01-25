import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class3_Sub7_Sub17_Sub2 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!pfa", name = "w", descriptor = "I")
	public int anInt7497;

	@OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
	public int anInt7498;

	@OriginalMember(owner = "client!pfa", name = "z", descriptor = "I")
	public int anInt7500;

	@OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
	public int anInt7506;

	@OriginalMember(owner = "client!pfa", name = "B", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!dw;II)V")
	public Class3_Sub7_Sub17_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray74 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIZ)Z")
	public boolean method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray74.length;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIII)V")
	public void method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg5 != arg2) {
			local7 = (arg3 - arg4 << 16) / (arg5 - arg2);
		}
		@Pc(29) int local29 = 0;
		if (arg5 != arg0) {
			local29 = (arg1 - arg3 << 16) / (arg0 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg2 != arg0) {
			local49 = (arg4 - arg1 << 16) / (arg2 - arg0);
		}
		if (arg5 >= arg2 && arg2 <= arg0) {
			if (arg5 >= arg0) {
				arg3 = arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg3 -= arg2 * local49;
					arg2 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local29;
					arg0 = 0;
				}
				if (arg0 != arg2 && local7 > local49 || arg2 == arg0 && local7 < local29) {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt7506 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static157.method2759(arg1 >> 16, this.aByteArray74, arg4 >> 16, arg2);
								arg1 += local29;
								arg4 += local7;
								arg2 += this.anInt7506;
							}
						}
						Static157.method2759(arg3 >> 16, this.aByteArray74, arg4 >> 16, arg2);
						arg3 += local49;
						arg4 += local7;
						arg2 += this.anInt7506;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt7506;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static157.method2759(arg4 >> 16, this.aByteArray74, arg1 >> 16, arg2);
								arg1 += local29;
								arg2 += this.anInt7506;
								arg4 += local7;
							}
						}
						Static157.method2759(arg4 >> 16, this.aByteArray74, arg3 >> 16, arg2);
						arg2 += this.anInt7506;
						arg3 += local49;
						arg4 += local7;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local49;
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg3 -= local29 * arg5;
					arg5 = 0;
				}
				if ((arg2 == arg5 || local7 <= local49) && (arg5 != arg2 || local29 >= local49)) {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt7506 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static157.method2759(arg3 >> 16, this.aByteArray74, arg1 >> 16, arg2);
								arg3 += local29;
								arg2 += this.anInt7506;
								arg1 += local49;
							}
						}
						Static157.method2759(arg4 >> 16, this.aByteArray74, arg1 >> 16, arg2);
						arg4 += local7;
						arg2 += this.anInt7506;
						arg1 += local49;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt7506;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static157.method2759(arg1 >> 16, this.aByteArray74, arg3 >> 16, arg2);
								arg1 += local49;
								arg3 += local29;
								arg2 += this.anInt7506;
							}
						}
						Static157.method2759(arg1 >> 16, this.aByteArray74, arg4 >> 16, arg2);
						arg2 += this.anInt7506;
						arg4 += local7;
						arg1 += local49;
					}
				}
			}
		} else if (arg0 >= arg5) {
			if (arg0 >= arg2) {
				arg1 = arg3 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local7 * arg5;
					arg3 -= arg5 * local29;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local49 * arg2;
					arg2 = 0;
				}
				if (local29 <= local7) {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt7506;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static157.method2759(arg3 >> 16, this.aByteArray74, arg4 >> 16, arg5);
								arg3 += local29;
								arg5 += this.anInt7506;
								arg4 += local49;
							}
						}
						Static157.method2759(arg3 >> 16, this.aByteArray74, arg1 >> 16, arg5);
						arg5 += this.anInt7506;
						arg1 += local7;
						arg3 += local29;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt7506;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static157.method2759(arg4 >> 16, this.aByteArray74, arg3 >> 16, arg5);
								arg5 += this.anInt7506;
								arg3 += local29;
								arg4 += local49;
							}
						}
						Static157.method2759(arg1 >> 16, this.aByteArray74, arg3 >> 16, arg5);
						arg5 += this.anInt7506;
						arg1 += local7;
						arg3 += local29;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local7 * arg5;
					arg3 -= local29 * arg5;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg1 -= arg0 * local49;
					arg0 = 0;
				}
				if ((arg5 == arg0 || local29 <= local7) && (arg5 != arg0 || local7 <= local49)) {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt7506 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static157.method2759(arg1 >> 16, this.aByteArray74, arg4 >> 16, arg5);
								arg5 += this.anInt7506;
								arg1 += local49;
								arg4 += local7;
							}
						}
						Static157.method2759(arg3 >> 16, this.aByteArray74, arg4 >> 16, arg5);
						arg5 += this.anInt7506;
						arg4 += local7;
						arg3 += local29;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt7506;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static157.method2759(arg4 >> 16, this.aByteArray74, arg1 >> 16, arg5);
								arg1 += local49;
								arg5 += this.anInt7506;
								arg4 += local7;
							}
						}
						Static157.method2759(arg4 >> 16, this.aByteArray74, arg3 >> 16, arg5);
						arg4 += local7;
						arg3 += local29;
						arg5 += this.anInt7506;
					}
				}
			}
		} else if (arg5 > arg2) {
			arg3 = arg1 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= local49 * arg0;
				arg3 -= arg0 * local29;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local7;
				arg2 = 0;
			}
			if (local49 <= local29) {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt7506;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static157.method2759(arg4 >> 16, this.aByteArray74, arg3 >> 16, arg0);
							arg0 += this.anInt7506;
							arg4 += local7;
							arg3 += local29;
						}
					}
					Static157.method2759(arg1 >> 16, this.aByteArray74, arg3 >> 16, arg0);
					arg0 += this.anInt7506;
					arg3 += local29;
					arg1 += local49;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt7506;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static157.method2759(arg3 >> 16, this.aByteArray74, arg4 >> 16, arg0);
							arg4 += local7;
							arg0 += this.anInt7506;
							arg3 += local29;
						}
					}
					Static157.method2759(arg3 >> 16, this.aByteArray74, arg1 >> 16, arg0);
					arg1 += local49;
					arg0 += this.anInt7506;
					arg3 += local29;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local29 * arg0;
				arg1 -= arg0 * local49;
				arg0 = 0;
			}
			if (arg5 < 0) {
				arg3 -= local7 * arg5;
				arg5 = 0;
			}
			if (local29 < local49) {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt7506 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static157.method2759(arg3 >> 16, this.aByteArray74, arg1 >> 16, arg0);
							arg3 += local7;
							arg1 += local49;
							arg0 += this.anInt7506;
						}
					}
					Static157.method2759(arg4 >> 16, this.aByteArray74, arg1 >> 16, arg0);
					arg4 += local29;
					arg1 += local49;
					arg0 += this.anInt7506;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt7506 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static157.method2759(arg1 >> 16, this.aByteArray74, arg3 >> 16, arg0);
							arg1 += local49;
							arg3 += local7;
							arg0 += this.anInt7506;
						}
					}
					Static157.method2759(arg1 >> 16, this.aByteArray74, arg4 >> 16, arg0);
					arg1 += local49;
					arg4 += local29;
					arg0 += this.anInt7506;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "(I)V")
	public void method6559() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray74.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
			local7++;
			this.aByteArray74[local7] = 0;
		}
		while (local7 < this.aByteArray74.length - 1) {
			local7++;
			this.aByteArray74[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIII)V")
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7506 = arg0 - arg2;
		this.anInt7497 = arg3;
		this.anInt7498 = arg2;
		this.anInt7500 = arg1 - arg3;
	}
}
