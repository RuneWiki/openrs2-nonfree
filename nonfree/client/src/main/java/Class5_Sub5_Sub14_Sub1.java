import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class5_Sub5_Sub14_Sub1 extends Class5_Sub5_Sub14 {

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	public int anInt6223;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
	public int anInt6232;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
	public int anInt6235;

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!rs;II)V")
	public Class5_Sub5_Sub14_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray62 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIBI)V")
	public void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg4) {
			local7 = (arg2 - arg5 << 16) / (arg4 - arg0);
		}
		@Pc(34) int local34 = 0;
		if (arg1 != arg4) {
			local34 = (arg3 - arg2 << 16) / (arg1 - arg4);
		}
		@Pc(55) int local55 = 0;
		if (arg0 != arg1) {
			local55 = (arg5 - arg3 << 16) / (arg0 - arg1);
		}
		if (arg0 <= arg4 && arg0 <= arg1) {
			if (arg1 > arg4) {
				arg3 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= arg0 * local55;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local34;
					arg4 = 0;
				}
				if (arg0 != arg4 && local55 < local7 || arg0 == arg4 && local34 < local55) {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt6227 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static529.method7854(arg2 >> 16, arg0, arg3 >> 16, this.aByteArray62);
								arg2 += local34;
								arg0 += this.anInt6227;
								arg3 += local55;
							}
						}
						Static529.method7854(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray62);
						arg5 += local7;
						arg3 += local55;
						arg0 += this.anInt6227;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg0;
					arg0 *= this.anInt6227;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static529.method7854(arg3 >> 16, arg0, arg2 >> 16, this.aByteArray62);
								arg0 += this.anInt6227;
								arg3 += local55;
								arg2 += local34;
							}
						}
						Static529.method7854(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray62);
						arg5 += local7;
						arg3 += local55;
						arg0 += this.anInt6227;
					}
				}
			} else {
				arg2 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local7 * arg0;
					arg2 -= local55 * arg0;
					arg0 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local34 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg0 || local7 <= local55) && (arg1 != arg0 || local7 >= local34)) {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt6227 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static529.method7854(arg3 >> 16, arg0, arg5 >> 16, this.aByteArray62);
								arg3 += local34;
								arg5 += local7;
								arg0 += this.anInt6227;
							}
						}
						Static529.method7854(arg2 >> 16, arg0, arg5 >> 16, this.aByteArray62);
						arg2 += local55;
						arg0 += this.anInt6227;
						arg5 += local7;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt6227;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static529.method7854(arg5 >> 16, arg0, arg3 >> 16, this.aByteArray62);
								arg3 += local34;
								arg0 += this.anInt6227;
								arg5 += local7;
							}
						}
						Static529.method7854(arg5 >> 16, arg0, arg2 >> 16, this.aByteArray62);
						arg0 += this.anInt6227;
						arg5 += local7;
						arg2 += local55;
					}
				}
			}
		} else if (arg4 > arg1) {
			if (arg0 >= arg4) {
				arg5 = arg3 <<= 0x10;
				if (arg1 < 0) {
					arg5 -= local34 * arg1;
					arg3 -= arg1 * local55;
					arg1 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				if (local55 > local34) {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt6227 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static529.method7854(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray62);
								arg2 += local7;
								arg3 += local55;
								arg1 += this.anInt6227;
							}
						}
						Static529.method7854(arg3 >> 16, arg1, arg5 >> 16, this.aByteArray62);
						arg3 += local55;
						arg1 += this.anInt6227;
						arg5 += local34;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt6227;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static529.method7854(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray62);
								arg1 += this.anInt6227;
								arg3 += local55;
								arg2 += local7;
							}
						}
						Static529.method7854(arg5 >> 16, arg1, arg3 >> 16, this.aByteArray62);
						arg1 += this.anInt6227;
						arg5 += local34;
						arg3 += local55;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local55;
					arg2 -= local34 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				if (local55 <= local34) {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 *= this.anInt6227;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static529.method7854(arg2 >> 16, arg1, arg5 >> 16, this.aByteArray62);
								arg5 += local7;
								arg1 += this.anInt6227;
								arg2 += local34;
							}
						}
						Static529.method7854(arg2 >> 16, arg1, arg3 >> 16, this.aByteArray62);
						arg3 += local55;
						arg1 += this.anInt6227;
						arg2 += local34;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt6227 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static529.method7854(arg5 >> 16, arg1, arg2 >> 16, this.aByteArray62);
								arg2 += local34;
								arg1 += this.anInt6227;
								arg5 += local7;
							}
						}
						Static529.method7854(arg3 >> 16, arg1, arg2 >> 16, this.aByteArray62);
						arg1 += this.anInt6227;
						arg2 += local34;
						arg3 += local55;
					}
				}
			}
		} else if (arg0 <= arg1) {
			arg3 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= arg4 * local34;
				arg3 -= arg4 * local7;
				arg4 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local55 * arg0;
				arg0 = 0;
			}
			if (local7 < local34) {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt6227 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static529.method7854(arg2 >> 16, arg4, arg5 >> 16, this.aByteArray62);
							arg5 += local55;
							arg2 += local34;
							arg4 += this.anInt6227;
						}
					}
					Static529.method7854(arg2 >> 16, arg4, arg3 >> 16, this.aByteArray62);
					arg3 += local7;
					arg4 += this.anInt6227;
					arg2 += local34;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt6227 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static529.method7854(arg5 >> 16, arg4, arg2 >> 16, this.aByteArray62);
							arg4 += this.anInt6227;
							arg2 += local34;
							arg5 += local55;
						}
					}
					Static529.method7854(arg3 >> 16, arg4, arg2 >> 16, this.aByteArray62);
					arg3 += local7;
					arg4 += this.anInt6227;
					arg2 += local34;
				}
			}
		} else {
			arg5 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= arg4 * local7;
				arg2 -= arg4 * local34;
				arg4 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local55;
				arg1 = 0;
			}
			if (arg4 != arg1 && local7 < local34 || arg1 == arg4 && local55 < local7) {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt6227;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static529.method7854(arg3 >> 16, arg4, arg5 >> 16, this.aByteArray62);
							arg4 += this.anInt6227;
							arg5 += local7;
							arg3 += local55;
						}
					}
					Static529.method7854(arg2 >> 16, arg4, arg5 >> 16, this.aByteArray62);
					arg4 += this.anInt6227;
					arg2 += local34;
					arg5 += local7;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt6227 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static529.method7854(arg5 >> 16, arg4, arg3 >> 16, this.aByteArray62);
							arg5 += local7;
							arg3 += local55;
							arg4 += this.anInt6227;
						}
					}
					Static529.method7854(arg5 >> 16, arg4, arg2 >> 16, this.aByteArray62);
					arg2 += local34;
					arg5 += local7;
					arg4 += this.anInt6227;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method5522() {
		@Pc(16) int local16 = -1;
		@Pc(22) int local22 = this.aByteArray62.length - 8;
		while (local22 > local16) {
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
			local16++;
			this.aByteArray62[local16] = 0;
		}
		while (local16 < this.aByteArray62.length - 1) {
			local16++;
			this.aByteArray62[local16] = 0;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
	public void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6223 = arg0;
		this.anInt6227 = arg3 - arg2;
		this.anInt6235 = arg1 - arg0;
		this.anInt6232 = arg2;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)Z")
	public boolean method5526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray62.length >= arg1 * arg0;
	}
}
