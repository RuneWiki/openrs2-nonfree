import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class6_Sub2_Sub16_Sub2 extends Class6_Sub2_Sub16 {

	@OriginalMember(owner = "client!wga", name = "K", descriptor = "I")
	public int anInt10364;

	@OriginalMember(owner = "client!wga", name = "Q", descriptor = "I")
	public int anInt10367;

	@OriginalMember(owner = "client!wga", name = "R", descriptor = "I")
	public int anInt10368;

	@OriginalMember(owner = "client!wga", name = "S", descriptor = "I")
	public int anInt10369;

	@OriginalMember(owner = "client!wga", name = "M", descriptor = "[B")
	public final byte[] aByteArray122;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!wu;II)V")
	public Class6_Sub2_Sub16_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray122 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)Z")
	public boolean method8763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray122.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	public void method8766() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray122.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
			local7++;
			this.aByteArray122[local7] = 0;
		}
		while (this.aByteArray122.length - 1 > local7) {
			local7++;
			this.aByteArray122[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIB)V")
	public void method8767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10369 = arg2;
		this.anInt10368 = arg1 - arg0;
		this.anInt10367 = arg3 - arg2;
		this.anInt10364 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZIII)V")
	public void method8768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg3) {
			local7 = (arg5 - arg0 << 16) / (arg2 - arg3);
		}
		@Pc(29) int local29 = 0;
		if (arg2 != arg1) {
			local29 = (arg4 - arg5 << 16) / (arg1 - arg2);
		}
		@Pc(50) int local50 = 0;
		if (arg1 != arg3) {
			local50 = (arg0 - arg4 << 16) / (arg3 - arg1);
		}
		if (arg3 <= arg2 && arg1 >= arg3) {
			if (arg1 > arg2) {
				arg4 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local50;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local29 * arg2;
					arg2 = 0;
				}
				if (arg2 != arg3 && local7 > local50 || arg3 == arg2 && local29 < local50) {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt10368;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static543.method7946(arg3, arg4 >> 16, this.aByteArray122, arg5 >> 16);
								arg4 += local50;
								arg3 += this.anInt10368;
								arg5 += local29;
							}
						}
						Static543.method7946(arg3, arg4 >> 16, this.aByteArray122, arg0 >> 16);
						arg0 += local7;
						arg4 += local50;
						arg3 += this.anInt10368;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt10368;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static543.method7946(arg3, arg5 >> 16, this.aByteArray122, arg4 >> 16);
								arg3 += this.anInt10368;
								arg4 += local50;
								arg5 += local29;
							}
						}
						Static543.method7946(arg3, arg0 >> 16, this.aByteArray122, arg4 >> 16);
						arg0 += local7;
						arg4 += local50;
						arg3 += this.anInt10368;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local50;
					arg0 -= local7 * arg3;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local29 * arg1;
					arg1 = 0;
				}
				if ((arg1 == arg3 || local7 <= local50) && (arg3 != arg1 || local29 <= local7)) {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 *= this.anInt10368;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static543.method7946(arg3, arg0 >> 16, this.aByteArray122, arg4 >> 16);
								arg3 += this.anInt10368;
								arg0 += local7;
								arg4 += local29;
							}
						}
						Static543.method7946(arg3, arg0 >> 16, this.aByteArray122, arg5 >> 16);
						arg0 += local7;
						arg5 += local50;
						arg3 += this.anInt10368;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt10368 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static543.method7946(arg3, arg4 >> 16, this.aByteArray122, arg0 >> 16);
								arg4 += local29;
								arg0 += local7;
								arg3 += this.anInt10368;
							}
						}
						Static543.method7946(arg3, arg5 >> 16, this.aByteArray122, arg0 >> 16);
						arg0 += local7;
						arg3 += this.anInt10368;
						arg5 += local50;
					}
				}
			}
		} else if (arg1 >= arg2) {
			if (arg3 <= arg1) {
				arg4 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg5 -= local29 * arg2;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg0 -= local50 * arg3;
					arg3 = 0;
				}
				if (local7 >= local29) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt10368;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static543.method7946(arg2, arg5 >> 16, this.aByteArray122, arg0 >> 16);
								arg0 += local50;
								arg2 += this.anInt10368;
								arg5 += local29;
							}
						}
						Static543.method7946(arg2, arg5 >> 16, this.aByteArray122, arg4 >> 16);
						arg2 += this.anInt10368;
						arg4 += local7;
						arg5 += local29;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt10368 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static543.method7946(arg2, arg0 >> 16, this.aByteArray122, arg5 >> 16);
								arg2 += this.anInt10368;
								arg5 += local29;
								arg0 += local50;
							}
						}
						Static543.method7946(arg2, arg4 >> 16, this.aByteArray122, arg5 >> 16);
						arg4 += local7;
						arg5 += local29;
						arg2 += this.anInt10368;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local7 * arg2;
					arg5 -= local29 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local50;
					arg1 = 0;
				}
				if ((arg1 == arg2 || local7 >= local29) && (arg1 != arg2 || local7 <= local50)) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt10368 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static543.method7946(arg2, arg4 >> 16, this.aByteArray122, arg0 >> 16);
								arg2 += this.anInt10368;
								arg4 += local50;
								arg0 += local7;
							}
						}
						Static543.method7946(arg2, arg5 >> 16, this.aByteArray122, arg0 >> 16);
						arg0 += local7;
						arg2 += this.anInt10368;
						arg5 += local29;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt10368;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static543.method7946(arg2, arg0 >> 16, this.aByteArray122, arg4 >> 16);
								arg2 += this.anInt10368;
								arg0 += local7;
								arg4 += local50;
							}
						}
						Static543.method7946(arg2, arg0 >> 16, this.aByteArray122, arg5 >> 16);
						arg5 += local29;
						arg0 += local7;
						arg2 += this.anInt10368;
					}
				}
			}
		} else if (arg3 >= arg2) {
			arg0 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= local29 * arg1;
				arg4 -= local50 * arg1;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg5 -= local7 * arg2;
				arg2 = 0;
			}
			if (local29 >= local50) {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt10368;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static543.method7946(arg1, arg4 >> 16, this.aByteArray122, arg5 >> 16);
							arg5 += local7;
							arg4 += local50;
							arg1 += this.anInt10368;
						}
					}
					Static543.method7946(arg1, arg4 >> 16, this.aByteArray122, arg0 >> 16);
					arg0 += local29;
					arg1 += this.anInt10368;
					arg4 += local50;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt10368;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static543.method7946(arg1, arg5 >> 16, this.aByteArray122, arg4 >> 16);
							arg4 += local50;
							arg1 += this.anInt10368;
							arg5 += local7;
						}
					}
					Static543.method7946(arg1, arg0 >> 16, this.aByteArray122, arg4 >> 16);
					arg4 += local50;
					arg0 += local29;
					arg1 += this.anInt10368;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local50;
				arg5 -= local29 * arg1;
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg0 -= local7 * arg3;
				arg3 = 0;
			}
			if (local50 > local29) {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt10368 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static543.method7946(arg1, arg5 >> 16, this.aByteArray122, arg0 >> 16);
							arg0 += local7;
							arg5 += local29;
							arg1 += this.anInt10368;
						}
					}
					Static543.method7946(arg1, arg5 >> 16, this.aByteArray122, arg4 >> 16);
					arg4 += local50;
					arg5 += local29;
					arg1 += this.anInt10368;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt10368 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static543.method7946(arg1, arg0 >> 16, this.aByteArray122, arg5 >> 16);
							arg1 += this.anInt10368;
							arg0 += local7;
							arg5 += local29;
						}
					}
					Static543.method7946(arg1, arg4 >> 16, this.aByteArray122, arg5 >> 16);
					arg4 += local50;
					arg5 += local29;
					arg1 += this.anInt10368;
				}
			}
		}
	}
}
