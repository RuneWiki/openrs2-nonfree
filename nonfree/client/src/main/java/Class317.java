import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class317 {

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	public int anInt9120;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	public int anInt9121;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
	public int anInt9122;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
	public int anInt9124;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Z")
	private boolean aBoolean668 = false;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Z")
	public boolean aBoolean667 = true;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
	public boolean aBoolean666 = false;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Z")
	public boolean aBoolean669 = false;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	public int anInt9123 = 0;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "[I")
	public final int[] anIntArray727 = new int[4096];

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!vda;")
	private final Class62_Sub2 aClass62_Sub2_18;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	private final int anInt9125;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "[I")
	private final int[] anIntArray726;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "[I")
	private final int[] anIntArray728;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class317(@OriginalArg(0) Class62_Sub2_Sub1 arg0) {
		this.aClass62_Sub2_18 = arg0;
		this.anInt9125 = this.aClass62_Sub2_18.anInt8670;
		this.anIntArray726 = this.aClass62_Sub2_18.anIntArray672;
		this.anIntArray728 = ((Class62_Sub2_Sub1) this.aClass62_Sub2_18).anIntArray295;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = this.aClass62_Sub2_18.method7080(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass62_Sub2_18.method7076(arg18);
			this.method7413(arg0, arg1, arg2, arg3, arg4, arg5, 0, 0, 0, Static560.method7411(local11, arg6), Static560.method7411(local11, arg7), Static560.method7411(local11, arg8));
			return;
		}
		this.aBoolean665 = this.aClass62_Sub2_18.method7069(arg18);
		this.aBoolean668 = this.aClass62_Sub2_18.method7074(arg18);
		local11 = arg4 - arg3;
		@Pc(52) int local52 = arg1 - arg0;
		@Pc(56) int local56 = arg5 - arg3;
		@Pc(60) int local60 = arg2 - arg0;
		@Pc(64) int local64 = arg7 - arg6;
		@Pc(68) int local68 = arg8 - arg6;
		@Pc(70) int local70 = 0;
		if (arg1 != arg0) {
			local70 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(85) int local85 = 0;
		if (arg2 != arg1) {
			local85 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(100) int local100 = 0;
		if (arg2 != arg0) {
			local100 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(121) int local121 = local11 * local60 - local56 * local52;
		if (local121 == 0) {
			return;
		}
		@Pc(136) int local136 = (local64 * local60 - local68 * local52 << 9) / local121;
		@Pc(148) int local148 = (local68 * local11 - local64 * local56 << 9) / local121;
		@Pc(155) float local155 = 1.0F / (float) this.aClass62_Sub2_18.anInt8674;
		@Pc(160) float local160 = (float) this.aClass62_Sub2_18.anInt8689;
		@Pc(164) int local164 = arg9 - arg10;
		@Pc(168) int local168 = arg12 - arg13;
		@Pc(172) int local172 = arg15 - arg16;
		@Pc(176) int local176 = arg11 - arg9;
		@Pc(180) int local180 = arg14 - arg12;
		@Pc(184) int local184 = arg17 - arg15;
		@Pc(193) float local193 = (float) (local176 * arg12 - local180 * arg9);
		@Pc(204) float local204 = (float) (local180 * arg15 - local184 * arg12) * local155;
		@Pc(215) float local215 = (float) (local184 * arg9 - local176 * arg15) / local160;
		@Pc(224) float local224 = (float) (local164 * arg12 - local168 * arg9);
		@Pc(235) float local235 = (float) (local168 * arg15 - local172 * arg12) * local155;
		@Pc(246) float local246 = (float) (local172 * arg9 - local164 * arg15) / local160;
		@Pc(255) float local255 = (float) (local168 * local176 - local164 * local180);
		@Pc(266) float local266 = (float) (local172 * local180 - local168 * local184) * local155;
		@Pc(277) float local277 = (float) (local164 * local184 - local172 * local176) / local160;
		@Pc(362) int local362;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg6 = (arg6 << 9) + local136 - local136 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local100 * arg0;
						arg3 -= local70 * arg0;
						arg6 -= local148 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local85 * arg1;
						arg1 = 0;
					}
					local362 = arg0 - this.anInt9124;
					local193 += local215 * (float) local362;
					local224 += local246 * (float) local362;
					local255 += local277 * (float) local362;
					if (arg0 != arg1 && local100 < local70 || arg0 == arg1 && local100 > local85) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
									arg5 += local100;
									arg4 += local85;
									arg6 += local148;
									arg0 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
							arg5 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
									arg5 += local100;
									arg4 += local85;
									arg6 += local148;
									arg0 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
							arg5 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local100 * arg0;
						arg3 -= local70 * arg0;
						arg6 -= local148 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local85 * arg2;
						arg2 = 0;
					}
					local362 = arg0 - this.anInt9124;
					local193 += local215 * (float) local362;
					local224 += local246 * (float) local362;
					local255 += local277 * (float) local362;
					if ((arg0 == arg2 || local100 >= local70) && (arg0 != arg2 || local85 <= local70)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
									arg5 += local85;
									arg3 += local70;
									arg6 += local148;
									arg0 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
							arg4 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
									arg5 += local85;
									arg3 += local70;
									arg6 += local148;
									arg0 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local136, local193, local224, local255, local204, local235, local266);
							arg4 += local100;
							arg3 += local70;
							arg6 += local148;
							arg0 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				arg7 = (arg7 << 9) + local136 - local136 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local70 * arg1;
						arg4 -= local85 * arg1;
						arg7 -= local148 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local100 * arg2;
						arg2 = 0;
					}
					local362 = arg1 - this.anInt9124;
					local193 += local215 * (float) local362;
					local224 += local246 * (float) local362;
					local255 += local277 * (float) local362;
					if (arg1 != arg2 && local70 < local85 || arg1 == arg2 && local70 > local100) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
									arg3 += local70;
									arg5 += local100;
									arg7 += local148;
									arg1 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
							arg3 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
									arg3 += local70;
									arg5 += local100;
									arg7 += local148;
									arg1 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
							arg3 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local70 * arg1;
						arg4 -= local85 * arg1;
						arg7 -= local148 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local100 * arg0;
						arg0 = 0;
					}
					local362 = arg1 - this.anInt9124;
					local193 += local215 * (float) local362;
					local224 += local246 * (float) local362;
					local255 += local277 * (float) local362;
					if (local70 < local85) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
									arg3 += local100;
									arg4 += local85;
									arg7 += local148;
									arg1 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
							arg5 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7409(this.anIntArray726, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
									arg3 += local100;
									arg4 += local85;
									arg7 += local148;
									arg1 += this.anInt9125;
									local193 += local215;
									local224 += local246;
									local255 += local277;
								}
							}
							this.method7409(this.anIntArray726, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local136, local193, local224, local255, local204, local235, local266);
							arg5 += local70;
							arg4 += local85;
							arg7 += local148;
							arg1 += this.anInt9125;
							local193 += local215;
							local224 += local246;
							local255 += local277;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			arg8 = (arg8 << 9) + local136 - local136 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local85 * arg2;
					arg5 -= local100 * arg2;
					arg8 -= local148 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local70 * arg0;
					arg0 = 0;
				}
				local362 = arg2 - this.anInt9124;
				local193 += local215 * (float) local362;
				local224 += local246 * (float) local362;
				local255 += local277 * (float) local362;
				if (local85 < local100) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7409(this.anIntArray726, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
								arg4 += local85;
								arg3 += local70;
								arg8 += local148;
								arg2 += this.anInt9125;
								local193 += local215;
								local224 += local246;
								local255 += local277;
							}
						}
						this.method7409(this.anIntArray726, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
						arg4 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += this.anInt9125;
						local193 += local215;
						local224 += local246;
						local255 += local277;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7409(this.anIntArray726, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
								arg4 += local85;
								arg3 += local70;
								arg8 += local148;
								arg2 += this.anInt9125;
								local193 += local215;
								local224 += local246;
								local255 += local277;
							}
						}
						this.method7409(this.anIntArray726, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
						arg4 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += this.anInt9125;
						local193 += local215;
						local224 += local246;
						local255 += local277;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local85 * arg2;
					arg5 -= local100 * arg2;
					arg8 -= local148 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local70 * arg1;
					arg1 = 0;
				}
				local362 = arg2 - this.anInt9124;
				local193 += local215 * (float) local362;
				local224 += local246 * (float) local362;
				local255 += local277 * (float) local362;
				if (local85 < local100) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7409(this.anIntArray726, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
								arg4 += local70;
								arg5 += local100;
								arg8 += local148;
								arg2 += this.anInt9125;
								local193 += local215;
								local224 += local246;
								local255 += local277;
							}
						}
						this.method7409(this.anIntArray726, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
						arg3 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += this.anInt9125;
						local193 += local215;
						local224 += local246;
						local255 += local277;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7409(this.anIntArray726, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
								arg4 += local70;
								arg5 += local100;
								arg8 += local148;
								arg2 += this.anInt9125;
								local193 += local215;
								local224 += local246;
								local255 += local277;
							}
						}
						this.method7409(this.anIntArray726, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local136, local193, local224, local255, local204, local235, local266);
						arg3 += local85;
						arg5 += local100;
						arg8 += local148;
						arg2 += this.anInt9125;
						local193 += local215;
						local224 += local246;
						local255 += local277;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public void method7405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(33) int local33 = (arg10 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
		@Pc(43) int local43 = (arg11 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
		@Pc(51) int local51 = (arg10 & 0xFF00) - (arg9 & 0xFF00);
		@Pc(59) int local59 = (arg11 & 0xFF00) - (arg9 & 0xFF00);
		@Pc(67) int local67 = (arg10 & 0xFF) - (arg9 & 0xFF);
		@Pc(75) int local75 = (arg11 & 0xFF) - (arg9 & 0xFF);
		@Pc(88) int local88;
		if (arg2 == arg1) {
			local88 = 0;
		} else {
			local88 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(100) int local100;
		if (arg1 == arg0) {
			local100 = 0;
		} else {
			local100 = (local3 << 16) / local7;
		}
		@Pc(112) int local112;
		if (arg2 == arg0) {
			local112 = 0;
		} else {
			local112 = (local11 << 16) / local15;
		}
		@Pc(123) int local123 = local3 * local15 - local11 * local7;
		if (local123 == 0) {
			return;
		}
		@Pc(138) int local138 = (local19 * local15 - local23 * local7 << 8) / local123;
		@Pc(150) int local150 = (local23 * local3 - local19 * local11 << 8) / local123;
		@Pc(160) int local160 = (local33 * local15 - local43 * local7) / local123;
		@Pc(170) int local170 = (local43 * local3 - local33 * local11) / local123;
		@Pc(180) int local180 = (local51 * local15 - local59 * local7) / local123;
		@Pc(190) int local190 = (local59 * local3 - local51 * local11) / local123;
		@Pc(202) int local202 = (local67 * local15 - local75 * local7 << 8) / local123;
		@Pc(214) int local214 = (local75 * local3 - local67 * local11 << 8) / local123;
		@Pc(261) int local261;
		@Pc(271) int local271;
		@Pc(283) int local283;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg6 = (arg6 << 8) + local138 - local138 * arg3;
				local261 = (arg9 >> 8 & 0xFF00) + local160 - local160 * arg3;
				local271 = (arg9 & 0xFF00) + local180 - local180 * arg3;
				local283 = ((arg9 & 0xFF) << 8) + local202 - local202 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local112 * arg0;
						arg3 -= local100 * arg0;
						arg6 -= local150 * arg0;
						local261 -= local170 * arg0;
						local271 -= local190 * arg0;
						local283 -= local214 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local88 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local112 < local100 || arg0 == arg1 && local112 > local88) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg4 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
									arg5 += local112;
									arg4 += local88;
									arg6 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg0 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg3 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
							arg5 += local112;
							arg3 += local100;
							arg6 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg0 += this.anInt9125;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg4 >> 16, arg5 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
									arg5 += local112;
									arg4 += local88;
									arg6 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg0 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg5 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
							arg5 += local112;
							arg3 += local100;
							arg6 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg0 += this.anInt9125;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local112 * arg0;
						arg3 -= local100 * arg0;
						arg6 -= local150 * arg0;
						local261 -= local170 * arg0;
						local271 -= local190 * arg0;
						local283 -= local214 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local88 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local112 < local100 || arg0 == arg2 && local88 > local100) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg3 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
									arg5 += local88;
									arg3 += local100;
									arg6 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg0 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg4 >> 16, arg3 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
							arg4 += local112;
							arg3 += local100;
							arg6 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg0 += this.anInt9125;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg5 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
									arg5 += local88;
									arg3 += local100;
									arg6 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg0 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg4 >> 16, arg6, local138, local261, local160, local271, local180, local283, local202);
							arg4 += local112;
							arg3 += local100;
							arg6 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg0 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				local261 = (arg10 >> 8 & 0xFF00) + local160 - local160 * arg4;
				local271 = (arg10 & 0xFF00) + local180 - local180 * arg4;
				local283 = ((arg10 & 0xFF) << 8) + local202 - local202 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local100 * arg1;
						arg4 -= local88 * arg1;
						arg7 -= local150 * arg1;
						local261 -= local170 * arg1;
						local271 -= local190 * arg1;
						local283 -= local214 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local112 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local100 >= local88) && (arg1 != arg2 || local100 <= local112)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg5 >> 16, arg3 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
									arg3 += local100;
									arg5 += local112;
									arg7 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg1 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg3 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
							arg3 += local100;
							arg4 += local88;
							arg7 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg1 += this.anInt9125;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg5 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
									arg3 += local100;
									arg5 += local112;
									arg7 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg1 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg4 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
							arg3 += local100;
							arg4 += local88;
							arg7 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg1 += this.anInt9125;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local100 * arg1;
						arg4 -= local88 * arg1;
						arg7 -= local150 * arg1;
						local261 -= local170 * arg1;
						local271 -= local190 * arg1;
						local283 -= local214 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local112 * arg0;
						arg0 = 0;
					}
					if (local100 < local88) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg4 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
									arg3 += local112;
									arg4 += local88;
									arg7 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg1 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg5 >> 16, arg4 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
							arg5 += local100;
							arg4 += local88;
							arg7 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg1 += this.anInt9125;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg3 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
									arg3 += local112;
									arg4 += local88;
									arg7 += local150;
									local261 += local170;
									local271 += local190;
									local283 += local214;
									arg1 += this.anInt9125;
								}
							}
							this.method7407(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg5 >> 16, arg7, local138, local261, local160, local271, local180, local283, local202);
							arg5 += local100;
							arg4 += local88;
							arg7 += local150;
							local261 += local170;
							local271 += local190;
							local283 += local214;
							arg1 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			local261 = (arg11 >> 8 & 0xFF00) + local160 - local160 * arg5;
			local271 = (arg11 & 0xFF00) + local180 - local180 * arg5;
			local283 = ((arg11 & 0xFF) << 8) + local202 - local202 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local88 * arg2;
					arg5 -= local112 * arg2;
					arg8 -= local150 * arg2;
					local261 -= local170 * arg2;
					local271 -= local190 * arg2;
					local283 -= local214 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local100 * arg0;
					arg0 = 0;
				}
				if (local88 < local112) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg3 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
								arg4 += local88;
								arg3 += local100;
								arg8 += local150;
								local261 += local170;
								local271 += local190;
								local283 += local214;
								arg2 += this.anInt9125;
							}
						}
						this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg5 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
						arg4 += local88;
						arg5 += local112;
						arg8 += local150;
						local261 += local170;
						local271 += local190;
						local283 += local214;
						arg2 += this.anInt9125;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg3 >> 16, arg4 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
								arg4 += local88;
								arg3 += local100;
								arg8 += local150;
								local261 += local170;
								local271 += local190;
								local283 += local214;
								arg2 += this.anInt9125;
							}
						}
						this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg4 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
						arg4 += local88;
						arg5 += local112;
						arg8 += local150;
						local261 += local170;
						local271 += local190;
						local283 += local214;
						arg2 += this.anInt9125;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local88 * arg2;
					arg5 -= local112 * arg2;
					arg8 -= local150 * arg2;
					local261 -= local170 * arg2;
					local271 -= local190 * arg2;
					local283 -= local214 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local100 * arg1;
					arg1 = 0;
				}
				if (local88 < local112) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg5 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
								arg4 += local100;
								arg5 += local112;
								arg8 += local150;
								local261 += local170;
								local271 += local190;
								local283 += local214;
								arg2 += this.anInt9125;
							}
						}
						this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg3 >> 16, arg5 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
						arg3 += local88;
						arg5 += local112;
						arg8 += local150;
						local261 += local170;
						local271 += local190;
						local283 += local214;
						arg2 += this.anInt9125;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg4 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
								arg4 += local100;
								arg5 += local112;
								arg8 += local150;
								local261 += local170;
								local271 += local190;
								local283 += local214;
								arg2 += this.anInt9125;
							}
						}
						this.method7407(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg3 >> 16, arg8, local138, local261, local160, local271, local180, local283, local202);
						arg3 += local88;
						arg5 += local112;
						arg8 += local150;
						local261 += local170;
						local271 += local190;
						local283 += local214;
						arg2 += this.anInt9125;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method7406(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (this.aBoolean669) {
			if (arg5 > this.anInt9122) {
				arg5 = this.anInt9122;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		arg2 += arg4;
		@Pc(27) int local27 = arg5 - arg4 >> 2;
		arg6 += arg7 * arg4;
		@Pc(40) int local40;
		@Pc(55) int local55;
		if (this.anInt9123 == 0) {
			while (true) {
				local27--;
				if (local27 < 0) {
					local27 = arg5 - arg4 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2] = arg3;
							arg1[arg2] = arg6;
						}
						arg6 += arg7;
					}
				}
				local40 = arg2 + 1;
				if (arg6 < arg1[local40]) {
					arg0[local40] = arg3;
					arg1[local40] = arg6;
				}
				local55 = arg6 + arg7;
				local40++;
				if (local55 < arg1[local40]) {
					arg0[local40] = arg3;
					arg1[local40] = local55;
				}
				local55 += arg7;
				local40++;
				if (local55 < arg1[local40]) {
					arg0[local40] = arg3;
					arg1[local40] = local55;
				}
				local55 += arg7;
				arg2 = local40 + 1;
				if (local55 < arg1[arg2]) {
					arg0[arg2] = arg3;
					arg1[arg2] = local55;
				}
				arg6 = local55 + arg7;
			}
		} else if (this.anInt9123 != 254) {
			@Pc(259) int local259 = this.anInt9123;
			@Pc(264) int local264 = 256 - this.anInt9123;
			@Pc(284) int local284 = ((arg3 & 0xFF00FF) * local264 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local264 >> 8 & 0xFF00);
			while (true) {
				local27--;
				@Pc(295) int local295;
				if (local27 < 0) {
					local27 = arg5 - arg4 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							local295 = arg0[arg2];
							arg0[arg2] = local284 + ((local295 & 0xFF00FF) * local259 >> 8 & 0xFF00FF) + ((local295 & 0xFF00) * local259 >> 8 & 0xFF00);
							arg1[arg2] = arg6;
						}
						arg6 += arg7;
					}
				}
				local40 = arg2 + 1;
				if (arg6 < arg1[local40]) {
					local295 = arg0[local40];
					arg0[local40] = local284 + ((local295 & 0xFF00FF) * local259 >> 8 & 0xFF00FF) + ((local295 & 0xFF00) * local259 >> 8 & 0xFF00);
					arg1[local40] = arg6;
				}
				local55 = arg6 + arg7;
				local40++;
				if (local55 < arg1[local40]) {
					local295 = arg0[local40];
					arg0[local40] = local284 + ((local295 & 0xFF00FF) * local259 >> 8 & 0xFF00FF) + ((local295 & 0xFF00) * local259 >> 8 & 0xFF00);
					arg1[local40] = local55;
				}
				local55 += arg7;
				local40++;
				if (local55 < arg1[local40]) {
					local295 = arg0[local40];
					arg0[local40] = local284 + ((local295 & 0xFF00FF) * local259 >> 8 & 0xFF00FF) + ((local295 & 0xFF00) * local259 >> 8 & 0xFF00);
					arg1[local40] = local55;
				}
				local55 += arg7;
				arg2 = local40 + 1;
				if (local55 < arg1[arg2]) {
					local295 = arg0[arg2];
					arg0[arg2] = local284 + ((local295 & 0xFF00FF) * local259 >> 8 & 0xFF00FF) + ((local295 & 0xFF00) * local259 >> 8 & 0xFF00);
					arg1[arg2] = local55;
				}
				arg6 = local55 + arg7;
			}
		} else if (arg5 <= this.anInt9122 - 1) {
			while (true) {
				local27--;
				if (local27 < 0) {
					local27 = arg5 - arg4 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2 - 1] = arg0[arg2];
						}
						arg6 += arg7;
					}
				}
				local40 = arg2 + 1;
				if (arg6 < arg1[local40]) {
					arg0[local40 - 1] = arg0[local40];
				}
				local55 = arg6 + arg7;
				local40++;
				if (local55 < arg1[local40]) {
					arg0[local40 - 1] = arg0[local40];
				}
				local55 += arg7;
				local40++;
				if (local55 < arg1[local40]) {
					arg0[local40 - 1] = arg0[local40];
				}
				local55 += arg7;
				arg2 = local40 + 1;
				if (local55 < arg1[arg2]) {
					arg0[arg2 - 1] = arg0[arg2];
				}
				arg6 = local55 + arg7;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private void method7407(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (this.aBoolean669) {
			if (arg4 > this.anInt9122) {
				arg4 = this.anInt9122;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg7 += arg8 * arg3;
		arg9 += arg10 * arg3;
		arg11 += arg12 * arg3;
		@Pc(159) int local159;
		@Pc(164) int local164;
		@Pc(220) int local220;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(467) int local467;
		@Pc(48) int local48;
		@Pc(83) int local83;
		if (!this.aBoolean667) {
			local48 = arg4 - arg3;
			if (this.anInt9123 == 0) {
				do {
					arg0[arg2++] = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local48--;
				} while (local48 > 0);
			} else if (this.aBoolean666) {
				do {
					local164 = arg2++;
					local220 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					local455 = arg0[local164];
					local459 = local220 + local455;
					local467 = (local220 & 0xFF00FF) + (local455 & 0xFF00FF);
					@Pc(895) int local895 = (local467 & 0x1000100) + (local459 - local467 & 0x10000);
					arg0[local164] = local459 - local895 | 0xFF000000 | local895 - (local895 >>> 8);
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local48--;
				} while (local48 > 0);
			} else {
				local159 = this.anInt9123;
				local164 = 256 - this.anInt9123;
				do {
					local83 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					@Pc(815) int local815 = ((local83 & 0xFF00FF) * local164 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local164 >> 8 & 0xFF00);
					local220 = arg0[arg2];
					arg0[arg2++] = local815 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
			}
			return;
		}
		local48 = arg4 - arg3 >> 2;
		@Pc(52) int local52 = arg8 << 2;
		@Pc(56) int local56 = arg10 << 2;
		@Pc(60) int local60 = arg12 << 2;
		@Pc(98) int local98;
		if (this.anInt9123 == 0) {
			if (local48 > 0) {
				do {
					local83 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					arg7 += local52;
					arg9 += local56;
					arg11 += local60;
					local98 = arg2 + 1;
					arg0[arg2] = local83;
					@Pc(103) int local103 = local98 + 1;
					arg0[local98] = local83;
					@Pc(108) int local108 = local103 + 1;
					arg0[local103] = local83;
					arg2 = local108 + 1;
					arg0[local108] = local83;
					local48--;
				} while (local48 > 0);
			}
			local48 = arg4 - arg3 & 0x3;
			if (local48 > 0) {
				local83 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
				do {
					arg0[arg2++] = local83;
					local48--;
				} while (local48 > 0);
				return;
			}
		} else if (this.aBoolean666) {
			if (local48 > 0) {
				do {
					local83 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					arg7 += local52;
					arg9 += local56;
					arg11 += local60;
					local98 = arg2 + 1;
					local455 = arg0[arg2];
					local459 = local83 + local455;
					local467 = (local83 & 0xFF00FF) + (local455 & 0xFF00FF);
					local455 = (local467 & 0x1000100) + (local459 - local467 & 0x10000);
					arg0[arg2] = local459 - local455 | 0xFF000000 | local455 - (local455 >>> 8);
					@Pc(496) int local496 = local98++;
					@Pc(502) int local502 = arg0[local496];
					@Pc(506) int local506 = local83 + local502;
					@Pc(514) int local514 = (local83 & 0xFF00FF) + (local502 & 0xFF00FF);
					@Pc(524) int local524 = (local514 & 0x1000100) + (local506 - local514 & 0x10000);
					arg0[local496] = local506 - local524 | 0xFF000000 | local524 - (local524 >>> 8);
					@Pc(543) int local543 = local98++;
					@Pc(549) int local549 = arg0[local543];
					@Pc(553) int local553 = local83 + local549;
					@Pc(561) int local561 = (local83 & 0xFF00FF) + (local549 & 0xFF00FF);
					@Pc(571) int local571 = (local561 & 0x1000100) + (local553 - local561 & 0x10000);
					arg0[local543] = local553 - local571 | 0xFF000000 | local571 - (local571 >>> 8);
					arg2 = local98 + 1;
					@Pc(596) int local596 = arg0[local98];
					@Pc(600) int local600 = local83 + local596;
					@Pc(608) int local608 = (local83 & 0xFF00FF) + (local596 & 0xFF00FF);
					@Pc(618) int local618 = (local608 & 0x1000100) + (local600 - local608 & 0x10000);
					arg0[local98] = local600 - local618 | 0xFF000000 | local618 - (local618 >>> 8);
					local48--;
				} while (local48 > 0);
			}
			local48 = arg4 - arg3 & 0x3;
			if (local48 > 0) {
				local83 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
				do {
					local164 = arg2++;
					local455 = arg0[local164];
					local459 = local83 + local455;
					local467 = (local83 & 0xFF00FF) + (local455 & 0xFF00FF);
					local455 = (local467 & 0x1000100) + (local459 - local467 & 0x10000);
					arg0[local164] = local459 - local455 | 0xFF000000 | local455 - (local455 >>> 8);
					local48--;
				} while (local48 > 0);
			}
		} else {
			local159 = this.anInt9123;
			local164 = 256 - this.anInt9123;
			if (local48 > 0) {
				do {
					local83 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					arg7 += local52;
					arg9 += local56;
					arg11 += local60;
					local83 = ((local83 & 0xFF00FF) * local164 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local164 >> 8 & 0xFF00);
					local220 = arg0[arg2];
					local98 = arg2 + 1;
					arg0[arg2] = local83 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local220 = arg0[local98];
					arg0[local98++] = local83 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local220 = arg0[local98];
					arg0[local98++] = local83 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local220 = arg0[local98];
					arg2 = local98 + 1;
					arg0[local98] = local83 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
			}
			local48 = arg4 - arg3 & 0x3;
			if (local48 > 0) {
				local83 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
				local83 = ((local83 & 0xFF00FF) * local164 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local164 >> 8 & 0xFF00);
				do {
					local220 = arg0[arg2];
					arg0[arg2++] = local83 + ((local220 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((local220 & 0xFF00) * local159 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIIIIIII)V")
	public void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) int arg25) {
		@Pc(4) int[] local4 = this.aClass62_Sub2_18.method7080(arg25);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass62_Sub2_18.method7076(arg25);
			this.method7405(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Static75.method1354(arg9 | arg10 << 24, local11), Static75.method1354(arg9 | arg11 << 24, local11), Static75.method1354(arg9 | arg12 << 24, local11));
			return;
		}
		this.aBoolean665 = this.aClass62_Sub2_18.method7069(arg25);
		this.aBoolean668 = this.aClass62_Sub2_18.method7074(arg25);
		local11 = arg4 - arg3;
		@Pc(67) int local67 = arg1 - arg0;
		@Pc(71) int local71 = arg5 - arg3;
		@Pc(75) int local75 = arg2 - arg0;
		@Pc(77) int local77 = 0;
		if (arg1 != arg0) {
			local77 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(92) int local92 = 0;
		if (arg2 != arg1) {
			local92 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(107) int local107 = 0;
		if (arg2 != arg0) {
			local107 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(128) int local128 = local11 * local75 - local71 * local67;
		if (local128 == 0) {
			return;
		}
		@Pc(135) int local135 = arg11 - arg10;
		@Pc(139) int local139 = arg12 - arg10;
		@Pc(151) int local151 = (local135 * local75 - local139 * local67 << 16) / local128;
		@Pc(163) int local163 = (local139 * local11 - local135 * local71 << 16) / local128;
		@Pc(167) int local167 = arg14 - arg13;
		@Pc(171) int local171 = arg15 - arg13;
		@Pc(183) int local183 = (local167 * local75 - local171 * local67 << 9) / local128;
		@Pc(195) int local195 = (local171 * local11 - local167 * local71 << 9) / local128;
		@Pc(202) float local202 = 8.0F / (float) this.aClass62_Sub2_18.anInt8674;
		@Pc(207) float local207 = (float) this.aClass62_Sub2_18.anInt8689;
		@Pc(211) int local211 = arg16 - arg17;
		@Pc(215) int local215 = arg19 - arg20;
		@Pc(219) int local219 = arg22 - arg23;
		@Pc(223) int local223 = arg18 - arg16;
		@Pc(227) int local227 = arg21 - arg19;
		@Pc(231) int local231 = arg24 - arg22;
		@Pc(240) float local240 = (float) (local223 * arg19 - local227 * arg16);
		@Pc(251) float local251 = (float) (local227 * arg22 - local231 * arg19) * local202;
		@Pc(262) float local262 = (float) (local231 * arg16 - local223 * arg22) / local207;
		@Pc(271) float local271 = (float) (local211 * arg19 - local215 * arg16);
		@Pc(282) float local282 = (float) (local215 * arg22 - local219 * arg19) * local202;
		@Pc(293) float local293 = (float) (local219 * arg16 - local211 * arg22) / local207;
		@Pc(302) float local302 = (float) (local215 * local223 - local211 * local227);
		@Pc(313) float local313 = (float) (local219 * local227 - local215 * local231) * local202;
		@Pc(324) float local324 = (float) (local211 * local231 - local219 * local223) / local207;
		@Pc(425) int local425;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg10 = (arg10 << 16) + local151 - local151 * arg3;
				arg13 = (arg13 << 9) + local183 - local183 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local107 * arg0;
						arg3 -= local77 * arg0;
						arg10 -= local163 * arg0;
						arg13 -= local195 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local92 * arg1;
						arg1 = 0;
					}
					local425 = arg0 - this.anInt9124;
					local240 += local262 * (float) local425;
					local271 += local293 * (float) local425;
					local302 += local324 * (float) local425;
					if (arg0 != arg1 && local107 < local77 || arg0 == arg1 && local107 > local92) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg0, arg5 >> 16, arg4 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
									arg5 += local107;
									arg4 += local92;
									arg10 += local163;
									arg13 += local195;
									arg0 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg0, arg5 >> 16, arg3 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
							arg5 += local107;
							arg3 += local77;
							arg10 += local163;
							arg13 += local195;
							arg0 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg0, arg4 >> 16, arg5 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
									arg5 += local107;
									arg4 += local92;
									arg10 += local163;
									arg13 += local195;
									arg0 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg0, arg3 >> 16, arg5 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
							arg5 += local107;
							arg3 += local77;
							arg10 += local163;
							arg13 += local195;
							arg0 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local107 * arg0;
						arg3 -= local77 * arg0;
						arg10 -= local163 * arg0;
						arg13 -= local195 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local92 * arg2;
						arg2 = 0;
					}
					local425 = arg0 - this.anInt9124;
					local240 += local262 * (float) local425;
					local271 += local293 * (float) local425;
					local302 += local324 * (float) local425;
					if ((arg0 == arg2 || local107 >= local77) && (arg0 != arg2 || local92 <= local77)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg0, arg3 >> 16, arg5 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
									arg5 += local92;
									arg3 += local77;
									arg10 += local163;
									arg13 += local195;
									arg0 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg0, arg3 >> 16, arg4 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
							arg4 += local107;
							arg3 += local77;
							arg10 += local163;
							arg13 += local195;
							arg0 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg0, arg5 >> 16, arg3 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
									arg5 += local92;
									arg3 += local77;
									arg10 += local163;
									arg13 += local195;
									arg0 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg0, arg4 >> 16, arg3 >> 16, arg10, local151, arg9, arg13, local183, local240, local271, local302, local251, local282, local313);
							arg4 += local107;
							arg3 += local77;
							arg10 += local163;
							arg13 += local195;
							arg0 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				arg11 = (arg11 << 16) + local151 - local151 * arg4;
				arg14 = (arg14 << 9) + local183 - local183 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local77 * arg1;
						arg4 -= local92 * arg1;
						arg11 -= local163 * arg1;
						arg14 -= local195 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local107 * arg2;
						arg2 = 0;
					}
					local425 = arg1 - this.anInt9124;
					local240 += local262 * (float) local425;
					local271 += local293 * (float) local425;
					local302 += local324 * (float) local425;
					if (arg1 != arg2 && local77 < local92 || arg1 == arg2 && local77 > local107) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg1, arg3 >> 16, arg5 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
									arg3 += local77;
									arg5 += local107;
									arg11 += local163;
									arg14 += local195;
									arg1 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg1, arg3 >> 16, arg4 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
							arg3 += local77;
							arg4 += local92;
							arg11 += local163;
							arg14 += local195;
							arg1 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg1, arg5 >> 16, arg3 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
									arg3 += local77;
									arg5 += local107;
									arg11 += local163;
									arg14 += local195;
									arg1 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg1, arg4 >> 16, arg3 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
							arg3 += local77;
							arg4 += local92;
							arg11 += local163;
							arg14 += local195;
							arg1 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local77 * arg1;
						arg4 -= local92 * arg1;
						arg11 -= local163 * arg1;
						arg14 -= local195 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local107 * arg0;
						arg0 = 0;
					}
					local425 = arg1 - this.anInt9124;
					local240 += local262 * (float) local425;
					local271 += local293 * (float) local425;
					local302 += local324 * (float) local425;
					if (local77 < local92) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg1, arg3 >> 16, arg4 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
									arg3 += local107;
									arg4 += local92;
									arg11 += local163;
									arg14 += local195;
									arg1 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg1, arg5 >> 16, arg4 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
							arg5 += local77;
							arg4 += local92;
							arg11 += local163;
							arg14 += local195;
							arg1 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7415(this.anIntArray726, local4, arg1, arg4 >> 16, arg3 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
									arg3 += local107;
									arg4 += local92;
									arg11 += local163;
									arg14 += local195;
									arg1 += this.anInt9125;
									local240 += local262;
									local271 += local293;
									local302 += local324;
								}
							}
							this.method7415(this.anIntArray726, local4, arg1, arg4 >> 16, arg5 >> 16, arg11, local151, arg9, arg14, local183, local240, local271, local302, local251, local282, local313);
							arg5 += local77;
							arg4 += local92;
							arg11 += local163;
							arg14 += local195;
							arg1 += this.anInt9125;
							local240 += local262;
							local271 += local293;
							local302 += local324;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			arg12 = (arg12 << 16) + local151 - local151 * arg5;
			arg15 = (arg15 << 9) + local183 - local183 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local92 * arg2;
					arg5 -= local107 * arg2;
					arg12 -= local163 * arg2;
					arg15 -= local195 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local77 * arg0;
					arg0 = 0;
				}
				local425 = arg2 - this.anInt9124;
				local240 += local262 * (float) local425;
				local271 += local293 * (float) local425;
				local302 += local324 * (float) local425;
				if (local92 < local107) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7415(this.anIntArray726, local4, arg2, arg4 >> 16, arg3 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
								arg4 += local92;
								arg3 += local77;
								arg12 += local163;
								arg15 += local195;
								arg2 += this.anInt9125;
								local240 += local262;
								local271 += local293;
								local302 += local324;
							}
						}
						this.method7415(this.anIntArray726, local4, arg2, arg4 >> 16, arg5 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
						arg4 += local92;
						arg5 += local107;
						arg12 += local163;
						arg15 += local195;
						arg2 += this.anInt9125;
						local240 += local262;
						local271 += local293;
						local302 += local324;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7415(this.anIntArray726, local4, arg2, arg3 >> 16, arg4 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
								arg4 += local92;
								arg3 += local77;
								arg12 += local163;
								arg15 += local195;
								arg2 += this.anInt9125;
								local240 += local262;
								local271 += local293;
								local302 += local324;
							}
						}
						this.method7415(this.anIntArray726, local4, arg2, arg5 >> 16, arg4 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
						arg4 += local92;
						arg5 += local107;
						arg12 += local163;
						arg15 += local195;
						arg2 += this.anInt9125;
						local240 += local262;
						local271 += local293;
						local302 += local324;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local92 * arg2;
					arg5 -= local107 * arg2;
					arg12 -= local163 * arg2;
					arg15 -= local195 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local77 * arg1;
					arg1 = 0;
				}
				local425 = arg2 - this.anInt9124;
				local240 += local262 * (float) local425;
				local271 += local293 * (float) local425;
				local302 += local324 * (float) local425;
				if (local92 < local107) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7415(this.anIntArray726, local4, arg2, arg4 >> 16, arg5 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
								arg4 += local77;
								arg5 += local107;
								arg12 += local163;
								arg15 += local195;
								arg2 += this.anInt9125;
								local240 += local262;
								local271 += local293;
								local302 += local324;
							}
						}
						this.method7415(this.anIntArray726, local4, arg2, arg3 >> 16, arg5 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
						arg3 += local92;
						arg5 += local107;
						arg12 += local163;
						arg15 += local195;
						arg2 += this.anInt9125;
						local240 += local262;
						local271 += local293;
						local302 += local324;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7415(this.anIntArray726, local4, arg2, arg5 >> 16, arg4 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
								arg4 += local77;
								arg5 += local107;
								arg12 += local163;
								arg15 += local195;
								arg2 += this.anInt9125;
								local240 += local262;
								local271 += local293;
								local302 += local324;
							}
						}
						this.method7415(this.anIntArray726, local4, arg2, arg5 >> 16, arg3 >> 16, arg12, local151, arg9, arg15, local183, local240, local271, local302, local251, local282, local313);
						arg3 += local92;
						arg5 += local107;
						arg12 += local163;
						arg15 += local195;
						arg2 += this.anInt9125;
						local240 += local262;
						local271 += local293;
						local302 += local324;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[IIIIIIIIFFFFFF)V")
	private void method7409(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12) {
		if (this.aBoolean669) {
			if (arg4 > this.anInt9122) {
				arg4 = this.anInt9122;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(31) int local31 = arg4 - arg3;
		@Pc(162) int local162;
		@Pc(150) int local150;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(118) int local118;
		@Pc(125) int local125;
		@Pc(42) int local42;
		@Pc(136) int local136;
		@Pc(180) int local180;
		@Pc(158) int local158;
		@Pc(49) float local49;
		@Pc(56) float local56;
		@Pc(63) float local63;
		@Pc(177) int local177;
		if (this.anInt9123 == 0) {
			if (this.aBoolean665) {
				local42 = arg3 - this.anInt9121;
				local49 = arg7 + arg10 * (float) local42;
				local56 = arg8 + arg11 * (float) local42;
				local63 = arg9 + arg12 * (float) local42;
				if (local63 == 0.0F) {
					local74 = 0;
					local81 = 0;
				} else {
					local74 = (int) (local49 * 4096.0F / local63);
					local81 = (int) (local56 * 4096.0F / local63);
				}
				local49 += arg10 * (float) local31;
				local56 += arg11 * (float) local31;
				local63 += arg12 * (float) local31;
				if (local63 == 0.0F) {
					local118 = 0;
					local125 = 0;
				} else {
					local118 = (int) (local49 * 4096.0F / local63);
					local125 = (int) (local56 * 4096.0F / local63);
				}
				local136 = (local74 << 20) + local81;
				local150 = ((local118 - local74) / local31 << 20) + (local125 - local81) / local31;
				local31 >>= 0x3;
				local158 = arg6 << 3;
				local162 = arg5 >> 8;
				if (this.aBoolean668) {
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							local180 = arg2 + 1;
							arg0[arg2] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(212) int local212 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local212 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local212 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(247) int local247 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local247 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local247 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(282) int local282 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local282 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local282 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(317) int local317 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local317 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local317 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(352) int local352 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local352 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local352 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(387) int local387 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local387 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local387 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(422) int local422 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg2 = local180 + 1;
							arg0[local180] = ((local422 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local422 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[arg2++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local31--;
						} while (local31 > 0);
						return;
					}
					return;
				}
				if (local31 > 0) {
					do {
						@Pc(518) int local518;
						if ((local518 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[arg2] = ((local518 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local518 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180 = arg2 + 1;
						local136 += local150;
						@Pc(555) int local555;
						if ((local555 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local555 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local555 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(592) int local592;
						if ((local592 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local592 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local592 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(629) int local629;
						if ((local629 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local629 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local629 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(666) int local666;
						if ((local666 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local666 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local666 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(703) int local703;
						if ((local703 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local703 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local703 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(740) int local740;
						if ((local740 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local740 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local740 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(777) int local777;
						if ((local777 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local777 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local777 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2 = local180 + 1;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(833) int local833;
						if ((local833 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[arg2] = ((local833 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local833 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
					return;
				}
			} else {
				local42 = arg3 - this.anInt9121;
				local49 = arg7 + arg10 * (float) local42;
				local56 = arg8 + arg11 * (float) local42;
				local63 = arg9 + arg12 * (float) local42;
				if (local63 == 0.0F) {
					local74 = 0;
					local81 = 0;
				} else {
					local74 = (int) (local49 * 16384.0F / local63);
					local81 = (int) (local56 * 16384.0F / local63);
				}
				local49 += arg10 * (float) local31;
				local56 += arg11 * (float) local31;
				local63 += arg12 * (float) local31;
				if (local63 == 0.0F) {
					local118 = 0;
					local125 = 0;
				} else {
					local118 = (int) (local49 * 16384.0F / local63);
					local125 = (int) (local56 * 16384.0F / local63);
				}
				local136 = (local74 << 18) + local81;
				local150 = ((local118 - local74) / local31 << 18) + (local125 - local81) / local31;
				local31 >>= 0x3;
				local158 = arg6 << 3;
				local162 = arg5 >> 8;
				if (this.aBoolean668) {
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							local180 = arg2 + 1;
							arg0[arg2] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg2 = local180 + 1;
							arg0[local180] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[arg2++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local31--;
						} while (local31 > 0);
						return;
					}
				} else {
					if (local31 > 0) {
						do {
							@Pc(1344) int local1344;
							if ((local1344 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[arg2] = ((local1344 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1344 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180 = arg2 + 1;
							local136 += local150;
							@Pc(1381) int local1381;
							if ((local1381 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1381 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1381 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1418) int local1418;
							if ((local1418 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1418 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1418 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1455) int local1455;
							if ((local1455 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1455 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1455 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1492) int local1492;
							if ((local1492 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1492 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1492 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1529) int local1529;
							if ((local1529 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1529 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1529 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1566) int local1566;
							if ((local1566 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1566 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1566 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1603) int local1603;
							if ((local1603 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1603 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1603 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							arg2 = local180 + 1;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 <= 0) {
						return;
					}
					do {
						@Pc(1659) int local1659;
						if ((local1659 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							arg0[arg2] = ((local1659 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1659 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
				}
			}
			return;
		}
		local74 = this.anInt9123;
		local81 = 256 - this.anInt9123;
		@Pc(1788) int local1788;
		@Pc(1834) int local1834;
		@Pc(1705) int local1705;
		if (!this.aBoolean665) {
			local1705 = arg3 - this.anInt9121;
			local49 = arg7 + arg10 * (float) local1705;
			local56 = arg8 + arg11 * (float) local1705;
			local63 = arg9 + arg12 * (float) local1705;
			if (local63 == 0.0F) {
				local118 = 0;
				local125 = 0;
			} else {
				local118 = (int) (local49 * 16384.0F / local63);
				local125 = (int) (local56 * 16384.0F / local63);
			}
			local49 += arg10 * (float) local31;
			local56 += arg11 * (float) local31;
			local63 += arg12 * (float) local31;
			if (local63 == 0.0F) {
				local42 = 0;
				local1788 = 0;
			} else {
				local42 = (int) (local49 * 16384.0F / local63);
				local1788 = (int) (local56 * 16384.0F / local63);
			}
			local136 = (local118 << 18) + local125;
			local150 = ((local42 - local118) / local31 << 18) + (local1788 - local125) / local31;
			local31 >>= 0x3;
			local158 = arg6 << 3;
			local162 = arg5 >> 8;
			if (this.aBoolean668) {
				if (local31 > 0) {
					do {
						local1834 = arg0[arg2];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						local180 = arg2 + 1;
						arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg2 = local180 + 1;
						arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						local1834 = arg0[arg2];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[arg2++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local31--;
					} while (local31 > 0);
					return;
				}
			} else {
				if (local31 > 0) {
					do {
						@Pc(3925) int local3925;
						if ((local3925 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[arg2];
							local177 = ((local3925 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3925 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180 = arg2 + 1;
						local136 += local150;
						@Pc(3996) int local3996;
						if ((local3996 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local3996 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3996 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4067) int local4067;
						if ((local4067 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4067 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4067 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4138) int local4138;
						if ((local4138 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4138 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4138 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4209) int local4209;
						if ((local4209 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4209 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4209 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4280) int local4280;
						if ((local4280 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4280 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4280 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4351) int local4351;
						if ((local4351 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4351 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4351 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4422) int local4422;
						if ((local4422 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4422 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4422 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						arg2 = local180 + 1;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(4512) int local4512;
						if ((local4512 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[arg2];
							local177 = ((local4512 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4512 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
				}
			}
			return;
		}
		local1705 = arg3 - this.anInt9121;
		local49 = arg7 + arg10 * (float) local1705;
		local56 = arg8 + arg11 * (float) local1705;
		local63 = arg9 + arg12 * (float) local1705;
		if (local63 == 0.0F) {
			local118 = 0;
			local125 = 0;
		} else {
			local118 = (int) (local49 * 4096.0F / local63);
			local125 = (int) (local56 * 4096.0F / local63);
		}
		local49 += arg10 * (float) local31;
		local56 += arg11 * (float) local31;
		local63 += arg12 * (float) local31;
		if (local63 == 0.0F) {
			local42 = 0;
			local1788 = 0;
		} else {
			local42 = (int) (local49 * 4096.0F / local63);
			local1788 = (int) (local56 * 4096.0F / local63);
		}
		local136 = (local118 << 20) + local125;
		local150 = ((local42 - local118) / local31 << 20) + (local1788 - local125) / local31;
		local31 >>= 0x3;
		local158 = arg6 << 3;
		local162 = arg5 >> 8;
		if (this.aBoolean668) {
			if (local31 > 0) {
				do {
					local1834 = arg0[arg2];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					local180 = arg2 + 1;
					arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg2 = local180 + 1;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					arg5 += local158;
					local162 = arg5 >> 8;
					local31--;
				} while (local31 > 0);
			}
			local31 = arg4 - arg3 & 0x7;
			if (local31 > 0) {
				do {
					local1834 = arg0[arg2];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[arg2++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local31--;
				} while (local31 > 0);
				return;
			}
			return;
		}
		if (local31 > 0) {
			do {
				@Pc(2487) int local2487;
				if ((local2487 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[arg2];
					local177 = ((local2487 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2487 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180 = arg2 + 1;
				local136 += local150;
				@Pc(2558) int local2558;
				if ((local2558 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2558 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2558 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2629) int local2629;
				if ((local2629 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2629 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2629 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2700) int local2700;
				if ((local2700 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2700 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2700 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2771) int local2771;
				if ((local2771 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2771 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2771 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2842) int local2842;
				if ((local2842 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2842 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2842 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2913) int local2913;
				if ((local2913 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2913 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2913 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2984) int local2984;
				if ((local2984 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2984 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2984 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				arg2 = local180 + 1;
				local136 += local150;
				arg5 += local158;
				local162 = arg5 >> 8;
				local31--;
			} while (local31 > 0);
		}
		local31 = arg4 - arg3 & 0x7;
		if (local31 <= 0) {
			return;
		}
		do {
			@Pc(3074) int local3074;
			if ((local3074 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
				local1834 = arg0[arg2];
				local177 = ((local3074 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3074 & 0xFF00) * local162 & 0xFF0000) >> 8;
				arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
			}
			arg2++;
			local136 += local150;
			local31--;
		} while (local31 > 0);
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
	public int method7410() {
		return this.anIntArray727[0] % this.anInt9125;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method7412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(25) int local25 = 0;
		if (arg1 != arg0) {
			local25 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(40) int local40 = 0;
		if (arg2 != arg1) {
			local40 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(55) int local55 = 0;
		if (arg2 != arg0) {
			local55 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(76) int local76 = local3 * local15 - local11 * local7;
		if (local76 == 0) {
			return;
		}
		@Pc(91) int local91 = (local19 * local15 - local23 * local7 << 8) / local76;
		@Pc(103) int local103 = (local23 * local3 - local19 * local11 << 8) / local76;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg6 = (arg6 << 8) + local91 - local91 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local55 * arg0;
						arg3 -= local25 * arg0;
						arg6 -= local103 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local40 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local55 < local25 || arg0 == arg1 && local55 > local40) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg5 >> 16, arg4 >> 16, arg6, local91);
									arg5 += local55;
									arg4 += local40;
									arg6 += local103;
									arg0 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg5 >> 16, arg3 >> 16, arg6, local91);
							arg5 += local55;
							arg3 += local25;
							arg6 += local103;
							arg0 += this.anInt9125;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg4 >> 16, arg5 >> 16, arg6, local91);
									arg5 += local55;
									arg4 += local40;
									arg6 += local103;
									arg0 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg3 >> 16, arg5 >> 16, arg6, local91);
							arg5 += local55;
							arg3 += local25;
							arg6 += local103;
							arg0 += this.anInt9125;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local55 * arg0;
						arg3 -= local25 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local40 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local55 < local25 || arg0 == arg2 && local40 > local25) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg5 >> 16, arg3 >> 16, arg6, local91);
									arg5 += local40;
									arg3 += local25;
									arg6 += local103;
									arg0 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg4 >> 16, arg3 >> 16, arg6, local91);
							arg4 += local55;
							arg3 += local25;
							arg6 += local103;
							arg0 += this.anInt9125;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg3 >> 16, arg5 >> 16, arg6, local91);
									arg5 += local40;
									arg3 += local25;
									arg6 += local103;
									arg0 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg0, arg9, arg3 >> 16, arg4 >> 16, arg6, local91);
							arg4 += local55;
							arg3 += local25;
							arg6 += local103;
							arg0 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				arg7 = (arg7 << 8) + local91 - local91 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local25 * arg1;
						arg4 -= local40 * arg1;
						arg7 -= local103 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local55 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local25 < local40 || arg1 == arg2 && local25 > local55) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg3 >> 16, arg5 >> 16, arg7, local91);
									arg3 += local25;
									arg5 += local55;
									arg7 += local103;
									arg1 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg3 >> 16, arg4 >> 16, arg7, local91);
							arg3 += local25;
							arg4 += local40;
							arg7 += local103;
							arg1 += this.anInt9125;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg5 >> 16, arg3 >> 16, arg7, local91);
									arg3 += local25;
									arg5 += local55;
									arg7 += local103;
									arg1 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg4 >> 16, arg3 >> 16, arg7, local91);
							arg3 += local25;
							arg4 += local40;
							arg7 += local103;
							arg1 += this.anInt9125;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local25 * arg1;
						arg4 -= local40 * arg1;
						arg7 -= local103 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local55 * arg0;
						arg0 = 0;
					}
					if (local25 < local40) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg3 >> 16, arg4 >> 16, arg7, local91);
									arg3 += local55;
									arg4 += local40;
									arg7 += local103;
									arg1 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg5 >> 16, arg4 >> 16, arg7, local91);
							arg5 += local25;
							arg4 += local40;
							arg7 += local103;
							arg1 += this.anInt9125;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg4 >> 16, arg3 >> 16, arg7, local91);
									arg3 += local55;
									arg4 += local40;
									arg7 += local103;
									arg1 += this.anInt9125;
								}
							}
							this.method7406(this.anIntArray726, this.anIntArray728, arg1, arg9, arg4 >> 16, arg5 >> 16, arg7, local91);
							arg5 += local25;
							arg4 += local40;
							arg7 += local103;
							arg1 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			arg8 = (arg8 << 8) + local91 - local91 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local40 * arg2;
					arg5 -= local55 * arg2;
					arg8 -= local103 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local25 * arg0;
					arg0 = 0;
				}
				if (local40 < local55) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg4 >> 16, arg3 >> 16, arg8, local91);
								arg4 += local40;
								arg3 += local25;
								arg8 += local103;
								arg2 += this.anInt9125;
							}
						}
						this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg4 >> 16, arg5 >> 16, arg8, local91);
						arg4 += local40;
						arg5 += local55;
						arg8 += local103;
						arg2 += this.anInt9125;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg3 >> 16, arg4 >> 16, arg8, local91);
								arg4 += local40;
								arg3 += local25;
								arg8 += local103;
								arg2 += this.anInt9125;
							}
						}
						this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg5 >> 16, arg4 >> 16, arg8, local91);
						arg4 += local40;
						arg5 += local55;
						arg8 += local103;
						arg2 += this.anInt9125;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local40 * arg2;
					arg5 -= local55 * arg2;
					arg8 -= local103 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local25 * arg1;
					arg1 = 0;
				}
				if (local40 < local55) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg4 >> 16, arg5 >> 16, arg8, local91);
								arg4 += local25;
								arg5 += local55;
								arg8 += local103;
								arg2 += this.anInt9125;
							}
						}
						this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg3 >> 16, arg5 >> 16, arg8, local91);
						arg3 += local40;
						arg5 += local55;
						arg8 += local103;
						arg2 += this.anInt9125;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg5 >> 16, arg4 >> 16, arg8, local91);
								arg4 += local25;
								arg5 += local55;
								arg8 += local103;
								arg2 += this.anInt9125;
							}
						}
						this.method7406(this.anIntArray726, this.anIntArray728, arg2, arg9, arg5 >> 16, arg3 >> 16, arg8, local91);
						arg3 += local40;
						arg5 += local55;
						arg8 += local103;
						arg2 += this.anInt9125;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIIIIIIIIIII)V")
	public void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg10 - arg9;
		@Pc(23) int local23 = arg11 - arg9;
		@Pc(27) int local27 = arg7 - arg6;
		@Pc(31) int local31 = arg8 - arg6;
		@Pc(44) int local44;
		if (arg2 == arg1) {
			local44 = 0;
		} else {
			local44 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(56) int local56;
		if (arg1 == arg0) {
			local56 = 0;
		} else {
			local56 = (local3 << 16) / local7;
		}
		@Pc(68) int local68;
		if (arg2 == arg0) {
			local68 = 0;
		} else {
			local68 = (local11 << 16) / local15;
		}
		@Pc(79) int local79 = local3 * local15 - local11 * local7;
		if (local79 == 0) {
			return;
		}
		@Pc(94) int local94 = (local19 * local15 - local23 * local7 << 8) / local79;
		@Pc(106) int local106 = (local23 * local3 - local19 * local11 << 8) / local79;
		@Pc(118) int local118 = (local27 * local15 - local31 * local7 << 8) / local79;
		@Pc(130) int local130 = (local31 * local3 - local27 * local11 << 8) / local79;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg9 = (arg9 << 8) + local94 - local94 * arg3;
				arg6 = (arg6 << 8) + local118 - local118 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local68 * arg0;
						arg3 -= local56 * arg0;
						arg9 -= local106 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local44 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local68 < local56 || arg0 == arg1 && local68 > local44) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg4 >> 16, arg9, local94, arg6, local118);
									arg5 += local68;
									arg4 += local44;
									arg9 += local106;
									arg6 += local130;
									arg0 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg3 >> 16, arg9, local94, arg6, local118);
							arg5 += local68;
							arg3 += local56;
							arg9 += local106;
							arg6 += local130;
							arg0 += this.anInt9125;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg4 >> 16, arg5 >> 16, arg9, local94, arg6, local118);
									arg5 += local68;
									arg4 += local44;
									arg9 += local106;
									arg6 += local130;
									arg0 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg5 >> 16, arg9, local94, arg6, local118);
							arg5 += local68;
							arg3 += local56;
							arg9 += local106;
							arg6 += local130;
							arg0 += this.anInt9125;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local68 * arg0;
						arg3 -= local56 * arg0;
						arg9 -= local106 * arg0;
						arg6 -= local130 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local44 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local68 < local56 || arg0 == arg2 && local44 > local56) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg5 >> 16, arg3 >> 16, arg9, local94, arg6, local118);
									arg5 += local44;
									arg3 += local56;
									arg9 += local106;
									arg6 += local130;
									arg0 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg4 >> 16, arg3 >> 16, arg9, local94, arg6, local118);
							arg4 += local68;
							arg3 += local56;
							arg9 += local106;
							arg6 += local130;
							arg0 += this.anInt9125;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg5 >> 16, arg9, local94, arg6, local118);
									arg5 += local44;
									arg3 += local56;
									arg9 += local106;
									arg6 += local130;
									arg0 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg0, arg3 >> 16, arg4 >> 16, arg9, local94, arg6, local118);
							arg4 += local68;
							arg3 += local56;
							arg9 += local106;
							arg6 += local130;
							arg0 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				arg10 = (arg10 << 8) + local94 - local94 * arg4;
				arg7 = (arg7 << 8) + local118 - local118 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local56 * arg1;
						arg4 -= local44 * arg1;
						arg10 -= local106 * arg1;
						arg7 -= local130 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local68 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local56 >= local44) && (arg1 != arg2 || local56 <= local68)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg5 >> 16, arg3 >> 16, arg10, local94, arg7, local118);
									arg3 += local56;
									arg5 += local68;
									arg10 += local106;
									arg7 += local130;
									arg1 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg3 >> 16, arg10, local94, arg7, local118);
							arg3 += local56;
							arg4 += local44;
							arg10 += local106;
							arg7 += local130;
							arg1 += this.anInt9125;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg5 >> 16, arg10, local94, arg7, local118);
									arg3 += local56;
									arg5 += local68;
									arg10 += local106;
									arg7 += local130;
									arg1 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg4 >> 16, arg10, local94, arg7, local118);
							arg3 += local56;
							arg4 += local44;
							arg10 += local106;
							arg7 += local130;
							arg1 += this.anInt9125;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local56 * arg1;
						arg4 -= local44 * arg1;
						arg10 -= local106 * arg1;
						arg7 -= local130 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local68 * arg0;
						arg0 = 0;
					}
					if (local56 < local44) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg3 >> 16, arg4 >> 16, arg10, local94, arg7, local118);
									arg3 += local68;
									arg4 += local44;
									arg10 += local106;
									arg7 += local130;
									arg1 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg5 >> 16, arg4 >> 16, arg10, local94, arg7, local118);
							arg5 += local56;
							arg4 += local44;
							arg10 += local106;
							arg7 += local130;
							arg1 += this.anInt9125;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg3 >> 16, arg10, local94, arg7, local118);
									arg3 += local68;
									arg4 += local44;
									arg10 += local106;
									arg7 += local130;
									arg1 += this.anInt9125;
								}
							}
							this.method7417(this.anIntArray726, this.anIntArray728, arg1, arg4 >> 16, arg5 >> 16, arg10, local94, arg7, local118);
							arg5 += local56;
							arg4 += local44;
							arg10 += local106;
							arg7 += local130;
							arg1 += this.anInt9125;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			arg11 = (arg11 << 8) + local94 - local94 * arg5;
			arg8 = (arg8 << 8) + local118 - local118 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local44 * arg2;
					arg5 -= local68 * arg2;
					arg11 -= local106 * arg2;
					arg8 -= local130 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local56 * arg0;
					arg0 = 0;
				}
				if (local44 < local68) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg3 >> 16, arg11, local94, arg8, local118);
								arg4 += local44;
								arg3 += local56;
								arg11 += local106;
								arg8 += local130;
								arg2 += this.anInt9125;
							}
						}
						this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg5 >> 16, arg11, local94, arg8, local118);
						arg4 += local44;
						arg5 += local68;
						arg11 += local106;
						arg8 += local130;
						arg2 += this.anInt9125;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg3 >> 16, arg4 >> 16, arg11, local94, arg8, local118);
								arg4 += local44;
								arg3 += local56;
								arg11 += local106;
								arg8 += local130;
								arg2 += this.anInt9125;
							}
						}
						this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg4 >> 16, arg11, local94, arg8, local118);
						arg4 += local44;
						arg5 += local68;
						arg11 += local106;
						arg8 += local130;
						arg2 += this.anInt9125;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local44 * arg2;
					arg5 -= local68 * arg2;
					arg11 -= local106 * arg2;
					arg8 -= local130 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local56 * arg1;
					arg1 = 0;
				}
				if (local44 < local68) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg4 >> 16, arg5 >> 16, arg11, local94, arg8, local118);
								arg4 += local56;
								arg5 += local68;
								arg11 += local106;
								arg8 += local130;
								arg2 += this.anInt9125;
							}
						}
						this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg3 >> 16, arg5 >> 16, arg11, local94, arg8, local118);
						arg3 += local44;
						arg5 += local68;
						arg11 += local106;
						arg8 += local130;
						arg2 += this.anInt9125;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg4 >> 16, arg11, local94, arg8, local118);
								arg4 += local56;
								arg5 += local68;
								arg11 += local106;
								arg8 += local130;
								arg2 += this.anInt9125;
							}
						}
						this.method7417(this.anIntArray726, this.anIntArray728, arg2, arg5 >> 16, arg3 >> 16, arg11, local94, arg8, local118);
						arg3 += local44;
						arg5 += local68;
						arg11 += local106;
						arg8 += local130;
						arg2 += this.anInt9125;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method7414(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(6) int local6 = this.anInt9123;
		@Pc(11) int local11 = 256 - this.anInt9123;
		@Pc(136) int local136;
		@Pc(124) int local124;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(145) int local145;
		@Pc(19) int local19;
		@Pc(155) int local155;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(28) float local28;
		@Pc(37) float local37;
		@Pc(46) float local46;
		if (!this.aBoolean665) {
			local19 = arg4 - this.anInt9121;
			local28 = arg10 + arg13 / 8.0F * (float) local19;
			local37 = arg11 + arg14 / 8.0F * (float) local19;
			local46 = arg12 + arg15 / 8.0F * (float) local19;
			if (local46 == 0.0F) {
				local57 = 0;
				local64 = 0;
			} else {
				local57 = (int) (local28 * 16384.0F / local46);
				local64 = (int) (local37 * 16384.0F / local46);
			}
			arg10 = local28 + arg13;
			arg11 = local37 + arg14;
			arg12 = local46 + arg15;
			if (arg12 == 0.0F) {
				local92 = 0;
				local99 = 0;
			} else {
				local92 = (int) (arg10 * 16384.0F / arg12);
				local99 = (int) (arg11 * 16384.0F / arg12);
			}
			local110 = (local57 << 18) + local64;
			local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
			local3 >>= 0x3;
			local132 = arg9 << 3;
			local136 = arg8 >> 8;
			if (this.aBoolean668) {
				if (local3 > 0) {
					do {
						local155 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						local145 = arg0[arg3];
						@Pc(1726) int local1726 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local1726 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local1726 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(1773) int local1773 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(1777) int local1777 = arg0[arg3];
						@Pc(1795) int local1795 = ((local1773 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1773 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local1777 & 0xFF00FF) * local6 + (local1795 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local1777 & 0xFF00) * local6 + (local1795 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(1842) int local1842 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(1846) int local1846 = arg0[arg3];
						@Pc(1864) int local1864 = ((local1842 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1842 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local1846 & 0xFF00FF) * local6 + (local1864 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local1846 & 0xFF00) * local6 + (local1864 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(1911) int local1911 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(1915) int local1915 = arg0[arg3];
						@Pc(1933) int local1933 = ((local1911 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1911 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local1915 & 0xFF00FF) * local6 + (local1933 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local1915 & 0xFF00) * local6 + (local1933 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(1980) int local1980 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(1984) int local1984 = arg0[arg3];
						@Pc(2002) int local2002 = ((local1980 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1980 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local1984 & 0xFF00FF) * local6 + (local2002 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local1984 & 0xFF00) * local6 + (local2002 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(2049) int local2049 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(2053) int local2053 = arg0[arg3];
						@Pc(2071) int local2071 = ((local2049 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2049 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local2053 & 0xFF00FF) * local6 + (local2071 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local2053 & 0xFF00) * local6 + (local2071 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(2118) int local2118 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(2122) int local2122 = arg0[arg3];
						@Pc(2140) int local2140 = ((local2118 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2118 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local2122 & 0xFF00FF) * local6 + (local2140 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local2122 & 0xFF00) * local6 + (local2140 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						@Pc(2187) int local2187 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						@Pc(2191) int local2191 = arg0[arg3];
						@Pc(2209) int local2209 = ((local2187 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2187 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local2191 & 0xFF00FF) * local6 + (local2209 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local2191 & 0xFF00) * local6 + (local2209 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						local155 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
						local145 = arg0[arg3];
						local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						local110 += local124;
						local3--;
					} while (local3 > 0);
					return;
				}
			} else {
				if (local3 > 0) {
					do {
						@Pc(2410) int local2410;
						if ((local2410 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2410 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2410 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2481) int local2481;
						if ((local2481 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2481 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2481 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2552) int local2552;
						if ((local2552 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2552 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2552 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2623) int local2623;
						if ((local2623 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2623 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2623 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2694) int local2694;
						if ((local2694 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2694 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2694 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2765) int local2765;
						if ((local2765 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2765 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2765 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2836) int local2836;
						if ((local2836 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2836 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2836 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						@Pc(2907) int local2907;
						if ((local2907 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local2907 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2907 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						@Pc(3056) int local3056;
						if ((local3056 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local145 = arg0[arg3];
							local155 = ((local3056 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3056 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg3++;
						local110 += local124;
						local3--;
					} while (local3 > 0);
				}
			}
			return;
		}
		local19 = arg4 - this.anInt9121;
		local28 = arg10 + arg13 / 8.0F * (float) local19;
		local37 = arg11 + arg14 / 8.0F * (float) local19;
		local46 = arg12 + arg15 / 8.0F * (float) local19;
		if (local46 == 0.0F) {
			local57 = 0;
			local64 = 0;
		} else {
			local57 = (int) (local28 * 4096.0F / local46);
			local64 = (int) (local37 * 4096.0F / local46);
		}
		arg10 = local28 + arg13;
		arg11 = local37 + arg14;
		arg12 = local46 + arg15;
		if (arg12 == 0.0F) {
			local92 = 0;
			local99 = 0;
		} else {
			local92 = (int) (arg10 * 4096.0F / arg12);
			local99 = (int) (arg11 * 4096.0F / arg12);
		}
		local110 = (local57 << 20) + local64;
		local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
		local3 >>= 0x3;
		local132 = arg9 << 3;
		local136 = arg8 >> 8;
		if (this.aBoolean668) {
			if (local3 > 0) {
				do {
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local57 = local92;
					local64 = local99;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local92 = 0;
						local99 = 0;
					} else {
						local92 = (int) (arg10 * 4096.0F / arg12);
						local99 = (int) (arg11 * 4096.0F / arg12);
					}
					local110 = (local57 << 20) + local64;
					local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
					arg8 += local132;
					local136 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					local145 = arg0[arg3];
					local155 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
					local155 = ((local155 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local155 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3++] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					local110 += local124;
					local3--;
				} while (local3 > 0);
				return;
			}
		} else {
			if (local3 > 0) {
				do {
					@Pc(857) int local857;
					if ((local857 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local857 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local857 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(928) int local928;
					if ((local928 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local928 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local928 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(999) int local999;
					if ((local999 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local999 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local999 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(1070) int local1070;
					if ((local1070 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local1070 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1070 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(1141) int local1141;
					if ((local1141 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local1141 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1141 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(1212) int local1212;
					if ((local1212 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local1212 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1212 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(1283) int local1283;
					if ((local1283 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local1283 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1283 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local110 += local124;
					@Pc(1354) int local1354;
					if ((local1354 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
						local145 = arg0[arg3];
						local155 = ((local1354 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1354 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg3++;
					local57 = local92;
					local64 = local99;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local92 = 0;
						local99 = 0;
					} else {
						local92 = (int) (arg10 * 4096.0F / arg12);
						local99 = (int) (arg11 * 4096.0F / arg12);
					}
					local110 = (local57 << 20) + local64;
					local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
					arg8 += local132;
					local136 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 <= 0) {
				return;
			}
			do {
				@Pc(1503) int local1503;
				if ((local1503 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local145 = arg0[arg3];
					local155 = ((local1503 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1503 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local145 & 0xFF00FF) * local6 + (local155 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local145 & 0xFF00) * local6 + (local155 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg3++;
				local110 += local124;
				local3--;
			} while (local3 > 0);
		}
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[IIIIIIIIIIIFFFFFF)V")
	private void method7415(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		if (this.aBoolean669) {
			if (arg4 > this.anInt9122) {
				arg4 = this.anInt9122;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		arg8 += arg9 * arg3;
		@Pc(37) int local37 = arg4 - arg3;
		@Pc(41) int local41 = arg6 << 3;
		@Pc(45) int local45 = arg5 >> 16;
		@Pc(49) int local49 = 255 - local45;
		@Pc(67) int local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
		@Pc(195) int local195;
		@Pc(183) int local183;
		@Pc(116) int local116;
		@Pc(123) int local123;
		@Pc(151) int local151;
		@Pc(158) int local158;
		@Pc(78) int local78;
		@Pc(169) int local169;
		@Pc(231) int local231;
		@Pc(191) int local191;
		@Pc(87) float local87;
		@Pc(96) float local96;
		@Pc(105) float local105;
		@Pc(210) int local210;
		if (this.anInt9123 == 0) {
			if (this.aBoolean665) {
				local78 = arg3 - this.anInt9121;
				local87 = arg10 + arg13 / 8.0F * (float) local78;
				local96 = arg11 + arg14 / 8.0F * (float) local78;
				local105 = arg12 + arg15 / 8.0F * (float) local78;
				if (local105 == 0.0F) {
					local116 = 0;
					local123 = 0;
				} else {
					local116 = (int) (local87 * 4096.0F / local105);
					local123 = (int) (local96 * 4096.0F / local105);
				}
				arg10 = local87 + arg13;
				arg11 = local96 + arg14;
				arg12 = local105 + arg15;
				if (arg12 == 0.0F) {
					local151 = 0;
					local158 = 0;
				} else {
					local151 = (int) (arg10 * 4096.0F / arg12);
					local158 = (int) (arg11 * 4096.0F / arg12);
				}
				local169 = (local116 << 20) + local123;
				local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
				local37 >>= 0x3;
				local191 = arg9 << 3;
				local195 = arg8 >> 8;
				if (this.aBoolean668) {
					if (local37 > 0) {
						do {
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local231 = arg2 + 1;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg2 = local231 + 1;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local116 = local151;
							local123 = local158;
							arg10 += arg13;
							arg11 += arg14;
							arg12 += arg15;
							if (arg12 == 0.0F) {
								local151 = 0;
								local158 = 0;
							} else {
								local151 = (int) (arg10 * 4096.0F / arg12);
								local158 = (int) (arg11 * 4096.0F / arg12);
							}
							local169 = (local116 << 20) + local123;
							local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
							arg8 += local191;
							local195 = arg8 >> 8;
							arg5 += local41;
							local45 = arg5 >> 16;
							local49 = 255 - local45;
							local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
							local37--;
						} while (local37 > 0);
					}
					local37 = arg4 - arg3 & 0x7;
					if (local37 > 0) {
						do {
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local37--;
						} while (local37 > 0);
						return;
					}
					return;
				}
				if (local37 > 0) {
					do {
						@Pc(820) int local820;
						if ((local820 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local820 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local820 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231 = arg2 + 1;
						local169 += local183;
						@Pc(877) int local877;
						if ((local877 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local877 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local877 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(934) int local934;
						if ((local934 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local934 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local934 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(991) int local991;
						if ((local991 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local991 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local991 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1048) int local1048;
						if ((local1048 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1048 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1048 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1105) int local1105;
						if ((local1105 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1105 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1105 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1162) int local1162;
						if ((local1162 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1162 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1162 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1219) int local1219;
						if ((local1219 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1219 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1219 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2 = local231 + 1;
						local116 = local151;
						local123 = local158;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local151 = 0;
							local158 = 0;
						} else {
							local151 = (int) (arg10 * 4096.0F / arg12);
							local158 = (int) (arg11 * 4096.0F / arg12);
						}
						local169 = (local116 << 20) + local123;
						local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						@Pc(1384) int local1384;
						if ((local1384 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1384 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1384 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2++;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
				return;
			}
			local78 = arg3 - this.anInt9121;
			local87 = arg10 + arg13 / 8.0F * (float) local78;
			local96 = arg11 + arg14 / 8.0F * (float) local78;
			local105 = arg12 + arg15 / 8.0F * (float) local78;
			if (local105 == 0.0F) {
				local116 = 0;
				local123 = 0;
			} else {
				local116 = (int) (local87 * 16384.0F / local105);
				local123 = (int) (local96 * 16384.0F / local105);
			}
			arg10 = local87 + arg13;
			arg11 = local96 + arg14;
			arg12 = local105 + arg15;
			if (arg12 == 0.0F) {
				local151 = 0;
				local158 = 0;
			} else {
				local151 = (int) (arg10 * 16384.0F / arg12);
				local158 = (int) (arg11 * 16384.0F / arg12);
			}
			local169 = (local116 << 18) + local123;
			local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
			local37 >>= 0x3;
			local191 = arg9 << 3;
			local195 = arg8 >> 8;
			if (this.aBoolean668) {
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local231 = arg2 + 1;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg2 = local231 + 1;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local116 = local151;
						local123 = local158;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local151 = 0;
							local158 = 0;
						} else {
							local151 = (int) (arg10 * 16384.0F / arg12);
							local158 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local116 << 18) + local123;
						local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
				return;
			}
			if (local37 > 0) {
				do {
					@Pc(2181) int local2181;
					if ((local2181 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2181 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2181 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231 = arg2 + 1;
					local169 += local183;
					@Pc(2238) int local2238;
					if ((local2238 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2238 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2238 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2295) int local2295;
					if ((local2295 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2295 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2295 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2352) int local2352;
					if ((local2352 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2352 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2352 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2409) int local2409;
					if ((local2409 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2409 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2409 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2466) int local2466;
					if ((local2466 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2466 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2466 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2523) int local2523;
					if ((local2523 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2523 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2523 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2580) int local2580;
					if ((local2580 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2580 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2580 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					arg2 = local231 + 1;
					local116 = local151;
					local123 = local158;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local151 = 0;
						local158 = 0;
					} else {
						local151 = (int) (arg10 / arg12 * 16384.0F);
						local158 = (int) (arg11 / arg12 * 16384.0F);
					}
					local169 = (local116 << 18) + local123;
					local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
					arg8 += local191;
					local195 = arg8 >> 8;
					arg5 += local41;
					local45 = arg5 >> 16;
					local49 = 255 - local45;
					local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
					local37--;
				} while (local37 > 0);
			}
			local37 = arg4 - arg3 & 0x7;
			if (local37 > 0) {
				do {
					@Pc(2745) int local2745;
					if ((local2745 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2745 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2745 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					arg2++;
					local169 += local183;
					local37--;
				} while (local37 > 0);
				return;
			}
			return;
		}
		local116 = this.anInt9123;
		local123 = 256 - this.anInt9123;
		@Pc(2891) int local2891;
		@Pc(2937) int local2937;
		@Pc(2811) int local2811;
		if (!this.aBoolean665) {
			local2811 = arg3 - this.anInt9121;
			local87 = arg10 + arg13 / 8.0F * (float) local2811;
			local96 = arg11 + arg14 / 8.0F * (float) local2811;
			local105 = arg12 + arg15 / 8.0F * (float) local2811;
			if (local105 == 0.0F) {
				local151 = 0;
				local158 = 0;
			} else {
				local151 = (int) (local87 * 16384.0F / local105);
				local158 = (int) (local96 * 16384.0F / local105);
			}
			arg10 = local87 + arg13;
			arg11 = local96 + arg14;
			arg12 = local105 + arg15;
			if (arg12 == 0.0F) {
				local78 = 0;
				local2891 = 0;
			} else {
				local78 = (int) (arg10 * 16384.0F / arg12);
				local2891 = (int) (arg11 * 16384.0F / arg12);
			}
			local169 = (local151 << 18) + local158;
			local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
			local37 >>= 0x3;
			local191 = arg9 << 3;
			local195 = arg8 >> 8;
			if (this.aBoolean668) {
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[arg2];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						local231 = arg2 + 1;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg2 = local231 + 1;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local151 = local78;
						local158 = local2891;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local78 = 0;
							local2891 = 0;
						} else {
							local78 = (int) (arg10 * 16384.0F / arg12);
							local2891 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local151 << 18) + local158;
						local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[arg2];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
			} else {
				if (local37 > 0) {
					do {
						@Pc(5832) int local5832;
						if ((local5832 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[arg2];
							local210 = ((local5832 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local5832 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231 = arg2 + 1;
						local169 += local183;
						@Pc(5923) int local5923;
						if ((local5923 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local5923 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local5923 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6014) int local6014;
						if ((local6014 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6014 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6014 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6105) int local6105;
						if ((local6105 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6105 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6105 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6196) int local6196;
						if ((local6196 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6196 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6196 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6287) int local6287;
						if ((local6287 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6287 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6287 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6378) int local6378;
						if ((local6378 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6378 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6378 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6469) int local6469;
						if ((local6469 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6469 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6469 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2 = local231 + 1;
						local151 = local78;
						local158 = local2891;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local78 = 0;
							local2891 = 0;
						} else {
							local78 = (int) (arg10 * 16384.0F / arg12);
							local2891 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local151 << 18) + local158;
						local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						@Pc(6668) int local6668;
						if ((local6668 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[arg2];
							local210 = ((local6668 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6668 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2++;
						local169 += local183;
						local37--;
					} while (local37 > 0);
				}
			}
			return;
		}
		local2811 = arg3 - this.anInt9121;
		local87 = arg10 + arg13 / 8.0F * (float) local2811;
		local96 = arg11 + arg14 / 8.0F * (float) local2811;
		local105 = arg12 + arg15 / 8.0F * (float) local2811;
		if (local105 == 0.0F) {
			local151 = 0;
			local158 = 0;
		} else {
			local151 = (int) (local87 * 4096.0F / local105);
			local158 = (int) (local96 * 4096.0F / local105);
		}
		arg10 = local87 + arg13;
		arg11 = local96 + arg14;
		arg12 = local105 + arg15;
		if (arg12 == 0.0F) {
			local78 = 0;
			local2891 = 0;
		} else {
			local78 = (int) (arg10 * 4096.0F / arg12);
			local2891 = (int) (arg11 * 4096.0F / arg12);
		}
		local169 = (local151 << 20) + local158;
		local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
		local37 >>= 0x3;
		local191 = arg9 << 3;
		local195 = arg8 >> 8;
		if (this.aBoolean668) {
			if (local37 > 0) {
				do {
					local2937 = arg0[arg2];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					local231 = arg2 + 1;
					arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg2 = local231 + 1;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local151 = local78;
					local158 = local2891;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local78 = 0;
						local2891 = 0;
					} else {
						local78 = (int) (arg10 * 4096.0F / arg12);
						local2891 = (int) (arg11 * 4096.0F / arg12);
					}
					local169 = (local151 << 20) + local158;
					local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
					arg8 += local191;
					local195 = arg8 >> 8;
					arg5 += local41;
					local45 = arg5 >> 16;
					local49 = 255 - local45;
					local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
					local37--;
				} while (local37 > 0);
			}
			local37 = arg4 - arg3 & 0x7;
			if (local37 > 0) {
				do {
					local2937 = arg0[arg2];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local37--;
				} while (local37 > 0);
				return;
			}
			return;
		}
		if (local37 > 0) {
			do {
				@Pc(3859) int local3859;
				if ((local3859 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[arg2];
					local210 = ((local3859 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local3859 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231 = arg2 + 1;
				local169 += local183;
				@Pc(3950) int local3950;
				if ((local3950 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local3950 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local3950 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4041) int local4041;
				if ((local4041 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4041 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4041 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4132) int local4132;
				if ((local4132 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4132 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4132 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4223) int local4223;
				if ((local4223 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4223 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4223 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4314) int local4314;
				if ((local4314 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4314 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4314 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4405) int local4405;
				if ((local4405 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4405 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4405 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4496) int local4496;
				if ((local4496 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4496 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4496 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				arg2 = local231 + 1;
				local151 = local78;
				local158 = local2891;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local78 = 0;
					local2891 = 0;
				} else {
					local78 = (int) (arg10 * 4096.0F / arg12);
					local2891 = (int) (arg11 * 4096.0F / arg12);
				}
				local169 = (local151 << 20) + local158;
				local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
				arg8 += local191;
				local195 = arg8 >> 8;
				arg5 += local41;
				local45 = arg5 >> 16;
				local49 = 255 - local45;
				local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
				local37--;
			} while (local37 > 0);
		}
		local37 = arg4 - arg3 & 0x7;
		if (local37 <= 0) {
			return;
		}
		do {
			@Pc(4695) int local4695;
			if ((local4695 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
				local2937 = arg0[arg2];
				local210 = ((local4695 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4695 & 0xFF00) * local195 & 0xFF0000) >> 8;
				local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
				arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
			}
			arg2++;
			local169 += local183;
			local37--;
		} while (local37 > 0);
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIII)V")
	public void method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21) {
		@Pc(4) int[] local4 = this.aClass62_Sub2_18.method7080(arg21);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass62_Sub2_18.method7076(arg21);
			this.method7413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Static560.method7411(local11, arg9), Static560.method7411(local11, arg10), Static560.method7411(local11, arg11));
			return;
		}
		this.aBoolean665 = this.aClass62_Sub2_18.method7069(arg21);
		this.aBoolean668 = this.aClass62_Sub2_18.method7074(arg21);
		local11 = arg4 - arg3;
		@Pc(52) int local52 = arg1 - arg0;
		@Pc(56) int local56 = arg5 - arg3;
		@Pc(60) int local60 = arg2 - arg0;
		@Pc(64) int local64 = arg10 - arg9;
		@Pc(68) int local68 = arg11 - arg9;
		@Pc(72) int local72 = arg7 - arg6;
		@Pc(76) int local76 = arg8 - arg6;
		@Pc(78) int local78 = 0;
		if (arg1 != arg0) {
			local78 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(93) int local93 = 0;
		if (arg2 != arg1) {
			local93 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(108) int local108 = 0;
		if (arg2 != arg0) {
			local108 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(129) int local129 = local11 * local60 - local56 * local52;
		if (local129 == 0) {
			return;
		}
		@Pc(144) int local144 = (local64 * local60 - local68 * local52 << 9) / local129;
		@Pc(156) int local156 = (local68 * local11 - local64 * local56 << 9) / local129;
		@Pc(168) int local168 = (local72 * local60 - local76 * local52 << 8) / local129;
		@Pc(180) int local180 = (local76 * local11 - local72 * local56 << 8) / local129;
		@Pc(187) float local187 = 8.0F / (float) this.aClass62_Sub2_18.anInt8674;
		@Pc(192) float local192 = (float) this.aClass62_Sub2_18.anInt8689;
		@Pc(196) int local196 = arg12 - arg13;
		@Pc(200) int local200 = arg15 - arg16;
		@Pc(204) int local204 = arg18 - arg19;
		@Pc(208) int local208 = arg14 - arg12;
		@Pc(212) int local212 = arg17 - arg15;
		@Pc(216) int local216 = arg20 - arg18;
		@Pc(225) float local225 = (float) (local208 * arg15 - local212 * arg12);
		@Pc(236) float local236 = (float) (local212 * arg18 - local216 * arg15) * local187;
		@Pc(247) float local247 = (float) (local216 * arg12 - local208 * arg18) / local192;
		@Pc(256) float local256 = (float) (local196 * arg15 - local200 * arg12);
		@Pc(267) float local267 = (float) (local200 * arg18 - local204 * arg15) * local187;
		@Pc(278) float local278 = (float) (local204 * arg12 - local196 * arg18) / local192;
		@Pc(287) float local287 = (float) (local200 * local208 - local196 * local212);
		@Pc(298) float local298 = (float) (local204 * local212 - local200 * local216) * local187;
		@Pc(309) float local309 = (float) (local196 * local216 - local204 * local208) / local192;
		@Pc(410) int local410;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt9120) {
				if (arg1 > this.anInt9120) {
					arg1 = this.anInt9120;
				}
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				arg9 = (arg9 << 9) + local144 - local144 * arg3;
				arg6 = (arg6 << 8) + local168 - local168 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local108 * arg0;
						arg3 -= local78 * arg0;
						arg9 -= local156 * arg0;
						arg6 -= local180 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local93 * arg1;
						arg1 = 0;
					}
					local410 = arg0 - this.anInt9124;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (arg0 != arg1 && local108 < local78 || arg0 == arg1 && local108 > local93) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local108;
									arg4 += local93;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local108;
									arg4 += local93;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local108 * arg0;
						arg3 -= local78 * arg0;
						arg9 -= local156 * arg0;
						arg6 -= local180 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local93 * arg2;
						arg2 = 0;
					}
					local410 = arg0 - this.anInt9124;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if ((arg0 == arg2 || local108 >= local78) && (arg0 != arg2 || local93 <= local78)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local93;
									arg3 += local78;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg4 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray727[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local93;
									arg3 += local78;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg4 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt9120) {
				if (arg2 > this.anInt9120) {
					arg2 = this.anInt9120;
				}
				if (arg0 > this.anInt9120) {
					arg0 = this.anInt9120;
				}
				arg10 = (arg10 << 9) + local144 - local144 * arg4;
				arg7 = (arg7 << 8) + local168 - local168 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local78 * arg1;
						arg4 -= local93 * arg1;
						arg10 -= local156 * arg1;
						arg7 -= local180 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local108 * arg2;
						arg2 = 0;
					}
					local410 = arg1 - this.anInt9124;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (arg1 != arg2 && local78 < local93 || arg1 == arg2 && local78 > local108) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local78;
									arg5 += local108;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg3 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local78;
									arg5 += local108;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg3 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local78 * arg1;
						arg4 -= local93 * arg1;
						arg10 -= local156 * arg1;
						arg7 -= local180 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local108 * arg0;
						arg0 = 0;
					}
					local410 = arg1 - this.anInt9124;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (local78 < local93) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local108;
									arg4 += local93;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray727[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local108;
									arg4 += local93;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt9125;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method7420(this.anIntArray726, this.anIntArray728, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt9125;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				}
			}
		} else if (arg2 < this.anInt9120) {
			if (arg0 > this.anInt9120) {
				arg0 = this.anInt9120;
			}
			if (arg1 > this.anInt9120) {
				arg1 = this.anInt9120;
			}
			arg11 = (arg11 << 9) + local144 - local144 * arg5;
			arg8 = (arg8 << 8) + local168 - local168 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local93 * arg2;
					arg5 -= local108 * arg2;
					arg11 -= local156 * arg2;
					arg8 -= local180 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local78 * arg0;
					arg0 = 0;
				}
				local410 = arg2 - this.anInt9124;
				local225 += local247 * (float) local410;
				local256 += local278 * (float) local410;
				local287 += local309 * (float) local410;
				if (local93 < local108) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local93;
								arg3 += local78;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt9125;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg4 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt9125;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local93;
								arg3 += local78;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt9125;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg4 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt9125;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local93 * arg2;
					arg5 -= local108 * arg2;
					arg11 -= local156 * arg2;
					arg8 -= local180 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local78 * arg1;
					arg1 = 0;
				}
				local410 = arg2 - this.anInt9124;
				local225 += local247 * (float) local410;
				local256 += local278 * (float) local410;
				local287 += local309 * (float) local410;
				if (local93 < local108) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local78;
								arg5 += local108;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt9125;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg3 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt9125;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray727[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local78;
								arg5 += local108;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt9125;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method7420(this.anIntArray726, this.anIntArray728, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg3 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt9125;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([I[IIIIIIIIII)V")
	private void method7417(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (this.aBoolean669) {
			if (arg4 > this.anInt9122) {
				arg4 = this.anInt9122;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3 - 1;
		arg5 += arg6 * arg3;
		arg7 += arg8 * arg3;
		@Pc(177) int local177;
		@Pc(182) int local182;
		@Pc(224) int local224;
		@Pc(44) int local44;
		@Pc(59) int local59;
		if (!this.aBoolean667) {
			local44 = arg4 - arg3;
			if (this.anInt9123 == 0) {
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						arg0[arg2] = Static403.anIntArray560[arg5 >> 8];
						arg1[arg2] = arg7;
					}
					arg7 += arg8;
					arg5 += arg6;
					local44--;
				} while (local44 > 0);
			} else {
				local177 = this.anInt9123;
				local182 = 256 - this.anInt9123;
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						local59 = Static403.anIntArray560[arg5 >> 8];
						@Pc(522) int local522 = ((local59 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((local59 & 0xFF00) * local182 >> 8 & 0xFF00);
						local224 = arg0[arg2];
						arg0[arg2] = local522 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
					}
					arg5 += arg6;
					arg7 += arg8;
					local44--;
				} while (local44 > 0);
			}
			return;
		}
		local44 = arg4 - arg3 >> 2;
		@Pc(48) int local48 = arg6 << 2;
		@Pc(66) int local66;
		@Pc(81) int local81;
		if (this.anInt9123 == 0) {
			if (local44 > 0) {
				do {
					local59 = Static403.anIntArray560[arg5 >> 8];
					arg5 += local48;
					local66 = arg2 + 1;
					if (arg7 < arg1[local66]) {
						arg0[local66] = local59;
						arg1[local66] = arg7;
					}
					local81 = arg7 + arg8;
					local66++;
					if (local81 < arg1[local66]) {
						arg0[local66] = local59;
						arg1[local66] = local81;
					}
					local81 += arg8;
					local66++;
					if (local81 < arg1[local66]) {
						arg0[local66] = local59;
						arg1[local66] = local81;
					}
					local81 += arg8;
					arg2 = local66 + 1;
					if (local81 < arg1[arg2]) {
						arg0[arg2] = local59;
						arg1[arg2] = local81;
					}
					arg7 = local81 + arg8;
					local44--;
				} while (local44 > 0);
			}
			local44 = arg4 - arg3 & 0x3;
			if (local44 > 0) {
				local59 = Static403.anIntArray560[arg5 >> 8];
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						arg0[arg2] = local59;
						arg1[arg2] = arg7;
					}
					arg7 += arg8;
					local44--;
				} while (local44 > 0);
				return;
			}
			return;
		}
		local177 = this.anInt9123;
		local182 = 256 - this.anInt9123;
		if (local44 > 0) {
			do {
				local59 = Static403.anIntArray560[arg5 >> 8];
				arg5 += local48;
				local59 = ((local59 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((local59 & 0xFF00) * local182 >> 8 & 0xFF00);
				local66 = arg2 + 1;
				if (arg7 < arg1[local66]) {
					local224 = arg0[local66];
					arg0[local66] = local59 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
				}
				local81 = arg7 + arg8;
				local66++;
				if (local81 < arg1[local66]) {
					local224 = arg0[local66];
					arg0[local66] = local59 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
				}
				local81 += arg8;
				local66++;
				if (local81 < arg1[local66]) {
					local224 = arg0[local66];
					arg0[local66] = local59 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
				}
				local81 += arg8;
				arg2 = local66 + 1;
				if (local81 < arg1[arg2]) {
					local224 = arg0[arg2];
					arg0[arg2] = local59 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
				}
				arg7 = local81 + arg8;
				local44--;
			} while (local44 > 0);
		}
		local44 = arg4 - arg3 & 0x3;
		if (local44 <= 0) {
			return;
		}
		local59 = Static403.anIntArray560[arg5 >> 8];
		local59 = ((local59 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((local59 & 0xFF00) * local182 >> 8 & 0xFF00);
		do {
			arg2++;
			if (arg7 < arg1[arg2]) {
				local224 = arg0[arg2];
				arg0[arg2] = local59 + ((local224 & 0xFF00FF) * local177 >> 8 & 0xFF00FF) + ((local224 & 0xFF00) * local177 >> 8 & 0xFF00);
			}
			arg7 += arg8;
			local44--;
		} while (local44 > 0);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method7418(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(128) int local128;
		@Pc(116) int local116;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(84) int local84;
		@Pc(91) int local91;
		@Pc(11) int local11;
		@Pc(102) int local102;
		@Pc(124) int local124;
		@Pc(20) float local20;
		@Pc(29) float local29;
		@Pc(38) float local38;
		@Pc(143) int local143;
		if (this.aBoolean665) {
			local11 = arg4 - this.anInt9121;
			local20 = arg10 + arg13 / 8.0F * (float) local11;
			local29 = arg11 + arg14 / 8.0F * (float) local11;
			local38 = arg12 + arg15 / 8.0F * (float) local11;
			if (local38 == 0.0F) {
				local49 = 0;
				local56 = 0;
			} else {
				local49 = (int) (local20 * 4096.0F / local38);
				local56 = (int) (local29 * 4096.0F / local38);
			}
			arg10 = local20 + arg13;
			arg11 = local29 + arg14;
			arg12 = local38 + arg15;
			if (arg12 == 0.0F) {
				local84 = 0;
				local91 = 0;
			} else {
				local84 = (int) (arg10 * 4096.0F / arg12);
				local91 = (int) (arg11 * 4096.0F / arg12);
			}
			local102 = (local49 << 20) + local56;
			local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
			local3 >>= 0x3;
			local124 = arg9 << 3;
			local128 = arg8 >> 8;
			if (this.aBoolean668) {
				if (local3 > 0) {
					do {
						local143 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(178) int local178 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local178 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local178 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(213) int local213 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local213 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local213 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(248) int local248 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local248 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local248 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(283) int local283 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local283 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local283 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(318) int local318 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local318 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local318 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(353) int local353 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local353 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local353 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						@Pc(388) int local388 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local388 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local388 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local49 = local84;
						local56 = local91;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local84 = 0;
							local91 = 0;
						} else {
							local84 = (int) (arg10 * 4096.0F / arg12);
							local91 = (int) (arg11 * 4096.0F / arg12);
						}
						local102 = (local49 << 20) + local56;
						local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
						arg8 += local124;
						local128 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						local143 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3++] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
						local102 += local116;
						local3--;
					} while (local3 > 0);
					return;
				}
				return;
			}
			if (local3 > 0) {
				do {
					@Pc(543) int local543;
					if ((local543 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local543 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local543 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(580) int local580;
					if ((local580 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local580 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local580 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(617) int local617;
					if ((local617 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local617 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local617 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(654) int local654;
					if ((local654 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local654 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local654 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(691) int local691;
					if ((local691 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local691 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local691 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(728) int local728;
					if ((local728 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local728 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local728 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(765) int local765;
					if ((local765 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local765 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local765 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					@Pc(802) int local802;
					if ((local802 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local802 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local802 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local49 = local84;
					local56 = local91;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local84 = 0;
						local91 = 0;
					} else {
						local84 = (int) (arg10 * 4096.0F / arg12);
						local91 = (int) (arg11 * 4096.0F / arg12);
					}
					local102 = (local49 << 20) + local56;
					local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
					arg8 += local124;
					local128 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					@Pc(917) int local917;
					if ((local917 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
						arg0[arg3] = ((local917 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local917 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg3++;
					local102 += local116;
					local3--;
				} while (local3 > 0);
				return;
			}
			return;
		}
		local11 = arg4 - this.anInt9121;
		local20 = arg10 + arg13 / 8.0F * (float) local11;
		local29 = arg11 + arg14 / 8.0F * (float) local11;
		local38 = arg12 + arg15 / 8.0F * (float) local11;
		if (local38 == 0.0F) {
			local49 = 0;
			local56 = 0;
		} else {
			local49 = (int) (local20 * 16384.0F / local38);
			local56 = (int) (local29 * 16384.0F / local38);
		}
		arg10 = local20 + arg13;
		arg11 = local29 + arg14;
		arg12 = local38 + arg15;
		if (arg12 == 0.0F) {
			local84 = 0;
			local91 = 0;
		} else {
			local84 = (int) (arg10 * 16384.0F / arg12);
			local91 = (int) (arg11 * 16384.0F / arg12);
		}
		local102 = (local49 << 18) + local56;
		local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
		local3 >>= 0x3;
		local124 = arg9 << 3;
		local128 = arg8 >> 8;
		if (!this.aBoolean668) {
			if (local3 > 0) {
				do {
					@Pc(1606) int local1606;
					if (arg6 < arg1[arg3] && (local1606 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1606 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1606 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1656) int local1656;
					if (arg6 < arg1[arg3] && (local1656 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1656 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1656 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1706) int local1706;
					if (arg6 < arg1[arg3] && (local1706 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1706 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1706 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1756) int local1756;
					if (arg6 < arg1[arg3] && (local1756 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1756 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1756 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1806) int local1806;
					if (arg6 < arg1[arg3] && (local1806 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1806 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1806 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1856) int local1856;
					if (arg6 < arg1[arg3] && (local1856 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1856 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1856 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1906) int local1906;
					if (arg6 < arg1[arg3] && (local1906 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1906 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1906 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					@Pc(1956) int local1956;
					if (arg6 < arg1[arg3] && (local1956 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local1956 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1956 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					arg3++;
					local49 = local84;
					local56 = local91;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local84 = 0;
						local91 = 0;
					} else {
						local84 = (int) (arg10 / arg12 * 16384.0F);
						local91 = (int) (arg11 / arg12 * 16384.0F);
					}
					local102 = (local49 << 18) + local56;
					local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
					arg8 += local124;
					local128 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					@Pc(2084) int local2084;
					if (arg6 < arg1[arg3] && (local2084 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
						arg0[arg3] = ((local2084 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2084 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					local3--;
				} while (local3 > 0);
			}
			return;
		}
		if (local3 > 0) {
			do {
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				if (arg6 < arg1[arg3]) {
					local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
					arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local49 = local84;
				local56 = local91;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local84 = 0;
					local91 = 0;
				} else {
					local84 = (int) (arg10 * 16384.0F / arg12);
					local91 = (int) (arg11 * 16384.0F / arg12);
				}
				local102 = (local49 << 18) + local56;
				local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
				arg8 += local124;
				local128 = arg8 >> 8;
				local3--;
			} while (local3 > 0);
		}
		local3 = arg5 - arg4 & 0x7;
		if (local3 <= 0) {
			return;
		}
		do {
			if (arg6 < arg1[arg3]) {
				local143 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
				arg0[arg3] = ((local143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local143 & 0xFF00) * local128 & 0xFF0000) >> 8;
				arg1[arg3] = arg6;
			}
			arg6 += arg7;
			local102 += local116;
			arg3++;
			local3--;
		} while (local3 > 0);
		return;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()I")
	public int method7419() {
		return this.anIntArray727[0] / this.anInt9125;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method7420(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		if (this.aBoolean669) {
			if (arg5 > this.anInt9122) {
				arg5 = this.anInt9122;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		@Pc(21) int local21 = arg3 + arg4;
		@Pc(27) int local27 = arg8 + arg9 * arg4;
		@Pc(33) int local33 = arg6 + arg7 * arg4;
		if (this.anInt9123 == 0) {
			this.method7418(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
		} else {
			this.method7414(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
		}
	}
}
