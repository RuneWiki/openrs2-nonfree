import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class2_Sub6_Sub9_Sub1 extends Class2_Sub6_Sub9 {

	@OriginalMember(owner = "client!kja", name = "L", descriptor = "I")
	public int anInt5097;

	@OriginalMember(owner = "client!kja", name = "A", descriptor = "I")
	public int anInt5100;

	@OriginalMember(owner = "client!kja", name = "R", descriptor = "I")
	public int anInt5102;

	@OriginalMember(owner = "client!kja", name = "S", descriptor = "I")
	public int anInt5106;

	@OriginalMember(owner = "client!kja", name = "C", descriptor = "[B")
	public final byte[] aByteArray70;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lclient!uja;II)V")
	public Class2_Sub6_Sub9_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray70 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(III)Z")
	public boolean method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray70.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!kja", name = "g", descriptor = "(I)V")
	public void method4631() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray70.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
			local7++;
			this.aByteArray70[local7] = 0;
		}
		while (local7 < this.aByteArray70.length - 1) {
			local7++;
			this.aByteArray70[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIIIII)V")
	public void method4633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg5) {
			local7 = (arg2 - arg4 << 16) / (arg5 - arg0);
		}
		@Pc(27) int local27 = 0;
		if (arg5 != arg1) {
			local27 = (arg3 - arg2 << 16) / (arg1 - arg5);
		}
		@Pc(48) int local48 = 0;
		if (arg0 != arg1) {
			local48 = (arg4 - arg3 << 16) / (arg0 - arg1);
		}
		if (arg0 <= arg5 && arg1 >= arg0) {
			if (arg5 >= arg1) {
				arg2 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local7;
					arg2 -= local48 * arg0;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= local27 * arg1;
					arg1 = 0;
				}
				if (arg0 != arg1 && local7 > local48 || arg0 == arg1 && local27 > local7) {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt5100 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg0, arg4 >> 16, arg3 >> 16);
								arg3 += local27;
								arg4 += local7;
								arg0 += this.anInt5100;
							}
						}
						Static703.method9414(this.aByteArray70, arg0, arg4 >> 16, arg2 >> 16);
						arg0 += this.anInt5100;
						arg2 += local48;
						arg4 += local7;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt5100;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg0, arg3 >> 16, arg4 >> 16);
								arg4 += local7;
								arg0 += this.anInt5100;
								arg3 += local27;
							}
						}
						Static703.method9414(this.aByteArray70, arg0, arg2 >> 16, arg4 >> 16);
						arg0 += this.anInt5100;
						arg4 += local7;
						arg2 += local48;
					}
				}
			} else {
				arg3 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (arg5 < 0) {
					arg2 -= arg5 * local27;
					arg5 = 0;
				}
				if ((arg0 == arg5 || local48 >= local7) && (arg0 != arg5 || local48 <= local27)) {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt5100 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg0, arg3 >> 16, arg2 >> 16);
								arg0 += this.anInt5100;
								arg3 += local48;
								arg2 += local27;
							}
						}
						Static703.method9414(this.aByteArray70, arg0, arg3 >> 16, arg4 >> 16);
						arg0 += this.anInt5100;
						arg3 += local48;
						arg4 += local7;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt5100;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg0, arg2 >> 16, arg3 >> 16);
								arg3 += local48;
								arg2 += local27;
								arg0 += this.anInt5100;
							}
						}
						Static703.method9414(this.aByteArray70, arg0, arg4 >> 16, arg3 >> 16);
						arg4 += local7;
						arg3 += local48;
						arg0 += this.anInt5100;
					}
				}
			}
		} else if (arg5 <= arg1) {
			if (arg1 >= arg0) {
				arg3 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local27 * arg5;
					arg3 -= local7 * arg5;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local48;
					arg0 = 0;
				}
				if (local27 <= local7) {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt5100;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg5, arg4 >> 16, arg2 >> 16);
								arg5 += this.anInt5100;
								arg4 += local48;
								arg2 += local27;
							}
						}
						Static703.method9414(this.aByteArray70, arg5, arg3 >> 16, arg2 >> 16);
						arg3 += local7;
						arg2 += local27;
						arg5 += this.anInt5100;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt5100;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg5, arg2 >> 16, arg4 >> 16);
								arg5 += this.anInt5100;
								arg4 += local48;
								arg2 += local27;
							}
						}
						Static703.method9414(this.aByteArray70, arg5, arg2 >> 16, arg3 >> 16);
						arg5 += this.anInt5100;
						arg2 += local27;
						arg3 += local7;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local27 * arg5;
					arg4 -= local7 * arg5;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local48;
					arg1 = 0;
				}
				if ((arg5 == arg1 || local7 >= local27) && (arg1 != arg5 || local7 <= local48)) {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt5100;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg5, arg4 >> 16, arg3 >> 16);
								arg4 += local7;
								arg5 += this.anInt5100;
								arg3 += local48;
							}
						}
						Static703.method9414(this.aByteArray70, arg5, arg4 >> 16, arg2 >> 16);
						arg4 += local7;
						arg2 += local27;
						arg5 += this.anInt5100;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt5100 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static703.method9414(this.aByteArray70, arg5, arg3 >> 16, arg4 >> 16);
								arg3 += local48;
								arg4 += local7;
								arg5 += this.anInt5100;
							}
						}
						Static703.method9414(this.aByteArray70, arg5, arg2 >> 16, arg4 >> 16);
						arg5 += this.anInt5100;
						arg4 += local7;
						arg2 += local27;
					}
				}
			}
		} else if (arg0 < arg5) {
			arg2 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= local48 * arg1;
				arg2 -= arg1 * local27;
				arg1 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= arg0 * local7;
				arg0 = 0;
			}
			if (local48 > local27) {
				arg5 -= arg0;
				arg0 -= arg1;
				arg1 *= this.anInt5100;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static703.method9414(this.aByteArray70, arg1, arg4 >> 16, arg2 >> 16);
							arg4 += local7;
							arg1 += this.anInt5100;
							arg2 += local27;
						}
					}
					Static703.method9414(this.aByteArray70, arg1, arg3 >> 16, arg2 >> 16);
					arg1 += this.anInt5100;
					arg2 += local27;
					arg3 += local48;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt5100 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static703.method9414(this.aByteArray70, arg1, arg2 >> 16, arg4 >> 16);
							arg4 += local7;
							arg2 += local27;
							arg1 += this.anInt5100;
						}
					}
					Static703.method9414(this.aByteArray70, arg1, arg2 >> 16, arg3 >> 16);
					arg2 += local27;
					arg3 += local48;
					arg1 += this.anInt5100;
				}
			}
		} else {
			arg4 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= local27 * arg1;
				arg3 -= arg1 * local48;
				arg1 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local7;
				arg5 = 0;
			}
			if (local48 <= local27) {
				arg0 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt5100 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static703.method9414(this.aByteArray70, arg1, arg2 >> 16, arg3 >> 16);
							arg1 += this.anInt5100;
							arg2 += local7;
							arg3 += local48;
						}
					}
					Static703.method9414(this.aByteArray70, arg1, arg4 >> 16, arg3 >> 16);
					arg1 += this.anInt5100;
					arg3 += local48;
					arg4 += local27;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt5100 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static703.method9414(this.aByteArray70, arg1, arg3 >> 16, arg2 >> 16);
							arg3 += local48;
							arg2 += local7;
							arg1 += this.anInt5100;
						}
					}
					Static703.method9414(this.aByteArray70, arg1, arg3 >> 16, arg4 >> 16);
					arg4 += local27;
					arg1 += this.anInt5100;
					arg3 += local48;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIII)V")
	public void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5102 = arg1;
		this.anInt5106 = arg0;
		this.anInt5097 = arg2 - arg1;
		this.anInt5100 = arg3 - arg0;
	}
}
