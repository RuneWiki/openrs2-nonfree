import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class5_Sub5_Sub14_Sub2 extends Class5_Sub5_Sub14 {

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	public int anInt9224;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	public int anInt9225;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	public int anInt9228;

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	public int anInt9230;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "[B")
	public final byte[] aByteArray97;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!pj;II)V")
	public Class5_Sub5_Sub14_Sub2(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray97 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public void method7960() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray97.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
			local13++;
			this.aByteArray97[local13] = 0;
		}
		while (local13 < this.aByteArray97.length - 1) {
			local13++;
			this.aByteArray97[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public void method7962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9228 = arg3;
		this.anInt9225 = arg0 - arg1;
		this.anInt9230 = arg2 - arg3;
		this.anInt9224 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)V")
	public void method7964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg1 != arg3) {
			local15 = (arg4 - arg5 << 16) / (arg3 - arg1);
		}
		@Pc(35) int local35 = 0;
		if (arg2 != arg3) {
			local35 = (arg0 - arg4 << 16) / (arg2 - arg3);
		}
		@Pc(56) int local56 = 0;
		if (arg1 != arg2) {
			local56 = (arg5 - arg0 << 16) / (arg1 - arg2);
		}
		if (arg3 >= arg1 && arg2 >= arg1) {
			if (arg2 > arg3) {
				arg0 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local56 * arg1;
					arg5 -= arg1 * local15;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg4 -= local35 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg1 && local56 < local15 || arg3 == arg1 && local56 > local35) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt9225 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static287.method5381(arg0 >> 16, arg4 >> 16, arg1, this.aByteArray97);
								arg0 += local56;
								arg4 += local35;
								arg1 += this.anInt9225;
							}
						}
						Static287.method5381(arg0 >> 16, arg5 >> 16, arg1, this.aByteArray97);
						arg5 += local15;
						arg0 += local56;
						arg1 += this.anInt9225;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt9225;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static287.method5381(arg4 >> 16, arg0 >> 16, arg1, this.aByteArray97);
								arg4 += local35;
								arg0 += local56;
								arg1 += this.anInt9225;
							}
						}
						Static287.method5381(arg5 >> 16, arg0 >> 16, arg1, this.aByteArray97);
						arg1 += this.anInt9225;
						arg0 += local56;
						arg5 += local15;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local56;
					arg5 -= arg1 * local15;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local35;
					arg2 = 0;
				}
				if ((arg1 == arg2 || local15 <= local56) && (arg2 != arg1 || local35 <= local15)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt9225;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static287.method5381(arg5 >> 16, arg0 >> 16, arg1, this.aByteArray97);
								arg1 += this.anInt9225;
								arg0 += local35;
								arg5 += local15;
							}
						}
						Static287.method5381(arg5 >> 16, arg4 >> 16, arg1, this.aByteArray97);
						arg5 += local15;
						arg1 += this.anInt9225;
						arg4 += local56;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt9225;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static287.method5381(arg0 >> 16, arg5 >> 16, arg1, this.aByteArray97);
								arg1 += this.anInt9225;
								arg5 += local15;
								arg0 += local35;
							}
						}
						Static287.method5381(arg4 >> 16, arg5 >> 16, arg1, this.aByteArray97);
						arg1 += this.anInt9225;
						arg5 += local15;
						arg4 += local56;
					}
				}
			}
		} else if (arg3 <= arg2) {
			if (arg1 > arg2) {
				arg5 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local15;
					arg4 -= arg3 * local35;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local56 * arg2;
					arg2 = 0;
				}
				if (arg2 != arg3 && local15 < local35 || arg3 == arg2 && local15 > local56) {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt9225 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static287.method5381(arg5 >> 16, arg0 >> 16, arg3, this.aByteArray97);
								arg5 += local15;
								arg0 += local56;
								arg3 += this.anInt9225;
							}
						}
						Static287.method5381(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray97);
						arg3 += this.anInt9225;
						arg5 += local15;
						arg4 += local35;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt9225 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static287.method5381(arg0 >> 16, arg5 >> 16, arg3, this.aByteArray97);
								arg3 += this.anInt9225;
								arg0 += local56;
								arg5 += local15;
							}
						}
						Static287.method5381(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray97);
						arg5 += local15;
						arg3 += this.anInt9225;
						arg4 += local35;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local15;
					arg4 -= local35 * arg3;
					arg3 = 0;
				}
				if (arg1 < 0) {
					arg5 -= arg1 * local56;
					arg1 = 0;
				}
				if (local35 > local15) {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt9225;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static287.method5381(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray97);
								arg3 += this.anInt9225;
								arg4 += local35;
								arg5 += local56;
							}
						}
						Static287.method5381(arg0 >> 16, arg4 >> 16, arg3, this.aByteArray97);
						arg4 += local35;
						arg3 += this.anInt9225;
						arg0 += local15;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt9225 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static287.method5381(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray97);
								arg4 += local35;
								arg5 += local56;
								arg3 += this.anInt9225;
							}
						}
						Static287.method5381(arg4 >> 16, arg0 >> 16, arg3, this.aByteArray97);
						arg3 += this.anInt9225;
						arg4 += local35;
						arg0 += local15;
					}
				}
			}
		} else if (arg3 <= arg1) {
			arg5 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= local35 * arg2;
				arg0 -= arg2 * local56;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= local15 * arg3;
				arg3 = 0;
			}
			if (local56 > local35) {
				arg1 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt9225 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static287.method5381(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray97);
							arg4 += local15;
							arg2 += this.anInt9225;
							arg0 += local56;
						}
					}
					Static287.method5381(arg5 >> 16, arg0 >> 16, arg2, this.aByteArray97);
					arg0 += local56;
					arg5 += local35;
					arg2 += this.anInt9225;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt9225 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static287.method5381(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray97);
							arg2 += this.anInt9225;
							arg4 += local15;
							arg0 += local56;
						}
					}
					Static287.method5381(arg0 >> 16, arg5 >> 16, arg2, this.aByteArray97);
					arg0 += local56;
					arg2 += this.anInt9225;
					arg5 += local35;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local35;
				arg0 -= arg2 * local56;
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg5 -= arg1 * local15;
				arg1 = 0;
			}
			if (local35 < local56) {
				arg3 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt9225;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static287.method5381(arg4 >> 16, arg5 >> 16, arg2, this.aByteArray97);
							arg5 += local15;
							arg4 += local35;
							arg2 += this.anInt9225;
						}
					}
					Static287.method5381(arg4 >> 16, arg0 >> 16, arg2, this.aByteArray97);
					arg4 += local35;
					arg2 += this.anInt9225;
					arg0 += local56;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt9225 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static287.method5381(arg5 >> 16, arg4 >> 16, arg2, this.aByteArray97);
							arg2 += this.anInt9225;
							arg4 += local35;
							arg5 += local15;
						}
					}
					Static287.method5381(arg0 >> 16, arg4 >> 16, arg2, this.aByteArray97);
					arg0 += local56;
					arg2 += this.anInt9225;
					arg4 += local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
	public boolean method7965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray97.length >= arg1 * arg0;
	}
}
