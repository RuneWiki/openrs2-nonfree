import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class1_Sub2_Sub5_Sub1 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
	public int anInt2038;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public int anInt2039;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
	public int anInt2040;

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!nf;II)V")
	public Class1_Sub2_Sub5_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray15 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBII)V")
	public void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2038 = arg0;
		this.anInt2037 = arg2;
		this.anInt2040 = arg1 - arg0;
		this.anInt2039 = arg3 - arg2;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V")
	public void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 != arg5) {
			local1 = (arg4 - arg3 << 16) / (arg0 - arg5);
		}
		@Pc(21) int local21 = 0;
		if (arg2 != arg0) {
			local21 = (arg1 - arg4 << 16) / (arg2 - arg0);
		}
		@Pc(46) int local46 = 0;
		if (arg2 != arg5) {
			local46 = (arg3 - arg1 << 16) / (arg5 - arg2);
		}
		if (arg0 >= arg5 && arg5 <= arg2) {
			if (arg0 < arg2) {
				arg1 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local1;
					arg1 -= local46 * arg5;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg4 -= arg0 * local21;
					arg0 = 0;
				}
				if (arg0 != arg5 && local46 < local1 || arg0 == arg5 && local46 > local21) {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2039;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static360.method1700(arg5, arg1 >> 16, this.aByteArray15, arg4 >> 16);
								arg4 += local21;
								arg5 += this.anInt2039;
								arg1 += local46;
							}
						}
						Static360.method1700(arg5, arg1 >> 16, this.aByteArray15, arg3 >> 16);
						arg1 += local46;
						arg5 += this.anInt2039;
						arg3 += local1;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt2039;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static360.method1700(arg5, arg4 >> 16, this.aByteArray15, arg1 >> 16);
								arg1 += local46;
								arg5 += this.anInt2039;
								arg4 += local21;
							}
						}
						Static360.method1700(arg5, arg3 >> 16, this.aByteArray15, arg1 >> 16);
						arg5 += this.anInt2039;
						arg3 += local1;
						arg1 += local46;
					}
				}
			} else {
				arg4 = arg3 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= arg5 * local46;
					arg3 -= local1 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local21 * arg2;
					arg2 = 0;
				}
				if (arg5 != arg2 && local1 > local46 || arg5 == arg2 && local1 < local21) {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt2039;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static360.method1700(arg5, arg1 >> 16, this.aByteArray15, arg3 >> 16);
								arg5 += this.anInt2039;
								arg1 += local21;
								arg3 += local1;
							}
						}
						Static360.method1700(arg5, arg4 >> 16, this.aByteArray15, arg3 >> 16);
						arg5 += this.anInt2039;
						arg3 += local1;
						arg4 += local46;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt2039;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static360.method1700(arg5, arg3 >> 16, this.aByteArray15, arg1 >> 16);
								arg5 += this.anInt2039;
								arg3 += local1;
								arg1 += local21;
							}
						}
						Static360.method1700(arg5, arg3 >> 16, this.aByteArray15, arg4 >> 16);
						arg5 += this.anInt2039;
						arg4 += local46;
						arg3 += local1;
					}
				}
			}
		} else if (arg2 < arg0) {
			if (arg0 <= arg5) {
				arg3 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local46;
					arg3 -= local21 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local1 * arg0;
					arg0 = 0;
				}
				if (local46 > local21) {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2039 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static360.method1700(arg2, arg4 >> 16, this.aByteArray15, arg1 >> 16);
								arg4 += local1;
								arg1 += local46;
								arg2 += this.anInt2039;
							}
						}
						Static360.method1700(arg2, arg3 >> 16, this.aByteArray15, arg1 >> 16);
						arg1 += local46;
						arg3 += local21;
						arg2 += this.anInt2039;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt2039 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static360.method1700(arg2, arg1 >> 16, this.aByteArray15, arg4 >> 16);
								arg4 += local1;
								arg1 += local46;
								arg2 += this.anInt2039;
							}
						}
						Static360.method1700(arg2, arg1 >> 16, this.aByteArray15, arg3 >> 16);
						arg2 += this.anInt2039;
						arg1 += local46;
						arg3 += local21;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local46;
					arg4 -= arg2 * local21;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= arg5 * local1;
					arg5 = 0;
				}
				if (local21 >= local46) {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 = this.anInt2039 * arg2;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static360.method1700(arg2, arg3 >> 16, this.aByteArray15, arg4 >> 16);
								arg3 += local1;
								arg4 += local21;
								arg2 += this.anInt2039;
							}
						}
						Static360.method1700(arg2, arg1 >> 16, this.aByteArray15, arg4 >> 16);
						arg1 += local46;
						arg4 += local21;
						arg2 += this.anInt2039;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt2039;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static360.method1700(arg2, arg4 >> 16, this.aByteArray15, arg3 >> 16);
								arg2 += this.anInt2039;
								arg4 += local21;
								arg3 += local1;
							}
						}
						Static360.method1700(arg2, arg4 >> 16, this.aByteArray15, arg1 >> 16);
						arg4 += local21;
						arg1 += local46;
						arg2 += this.anInt2039;
					}
				}
			}
		} else if (arg2 < arg5) {
			arg3 = arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local21 * arg0;
				arg3 -= arg0 * local1;
				arg0 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local46 * arg2;
				arg2 = 0;
			}
			if (arg0 != arg2 && local21 > local1 || arg2 == arg0 && local46 < local1) {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt2039 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static360.method1700(arg0, arg3 >> 16, this.aByteArray15, arg1 >> 16);
							arg3 += local1;
							arg1 += local46;
							arg0 += this.anInt2039;
						}
					}
					Static360.method1700(arg0, arg3 >> 16, this.aByteArray15, arg4 >> 16);
					arg0 += this.anInt2039;
					arg3 += local1;
					arg4 += local21;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt2039;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static360.method1700(arg0, arg1 >> 16, this.aByteArray15, arg3 >> 16);
							arg3 += local1;
							arg1 += local46;
							arg0 += this.anInt2039;
						}
					}
					Static360.method1700(arg0, arg4 >> 16, this.aByteArray15, arg3 >> 16);
					arg4 += local21;
					arg3 += local1;
					arg0 += this.anInt2039;
				}
			}
		} else {
			arg1 = arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local21 * arg0;
				arg1 -= arg0 * local1;
				arg0 = 0;
			}
			arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= arg5 * local46;
				arg5 = 0;
			}
			if (local1 < local21) {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt2039 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static360.method1700(arg0, arg3 >> 16, this.aByteArray15, arg4 >> 16);
							arg4 += local21;
							arg3 += local46;
							arg0 += this.anInt2039;
						}
					}
					Static360.method1700(arg0, arg1 >> 16, this.aByteArray15, arg4 >> 16);
					arg1 += local1;
					arg4 += local21;
					arg0 += this.anInt2039;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 *= this.anInt2039;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static360.method1700(arg0, arg4 >> 16, this.aByteArray15, arg3 >> 16);
							arg0 += this.anInt2039;
							arg4 += local21;
							arg3 += local46;
						}
					}
					Static360.method1700(arg0, arg4 >> 16, this.aByteArray15, arg1 >> 16);
					arg0 += this.anInt2039;
					arg1 += local1;
					arg4 += local21;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(Z)V")
	public void method1699() {
		@Pc(6) int local6 = -1;
		@Pc(12) int local12 = this.aByteArray15.length - 8;
		while (local12 > local6) {
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
			local6++;
			this.aByteArray15[local6] = 0;
		}
		while (local6 < this.aByteArray15.length - 1) {
			local6++;
			this.aByteArray15[local6] = 0;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBI)Z")
	public boolean method1701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray15.length >= arg0 * arg1;
	}
}
