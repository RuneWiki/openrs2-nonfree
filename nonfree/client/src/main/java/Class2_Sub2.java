import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "Ljava/lang/Object;")
	private final Object anObject6 = new Object();

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	private int anInt3090 = 0;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	private int anInt3094 = 0;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "[Lclient!pe;")
	private Class121_Sub1[] aClass121_Sub1Array1 = new Class121_Sub1[0];

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V")
	private void method2562(@OriginalArg(1) int arg0) {
		super.aByteArray34[super.anInt3080] = (byte) (arg0 + 10);
		super.anInt3080++;
		super.anInt3081++;
		super.anInt3077++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
		if (this.anInt3094 > 0) {
			@Pc(51) Object local51 = this.anObject6;
			synchronized (this.anObject6) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BFLclient!na;IZ)V")
	@Override
	public void method2554(@OriginalArg(1) float arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray34[super.anInt3080] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray4[super.anInt3080] = arg1;
			super.aFloatArray18[super.anInt3080] = arg0;
			super.anInt3080++;
			if (super.anInt3080 >= 5000) {
				super.anInt3080 = 0;
			}
			super.anInt3081++;
			super.anInt3077++;
			if (this.anInt3094 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(II)V")
	private void method2564(@OriginalArg(0) int arg0) {
		super.aByteArray34[super.anInt3080] = (byte) arg0;
		super.anInt3080++;
		if (super.anInt3080 >= 5000) {
			super.anInt3080 = 0;
		}
		super.anInt3081++;
		super.anInt3077++;
		if (this.anInt3094 > 0) {
			@Pc(47) Object local47 = this.anObject6;
			synchronized (this.anObject6) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLclient!fl;)V")
	@Override
	public void method2555(@OriginalArg(1) Class82 arg0) {
		@Pc(6) Object local6 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray34[super.anInt3080] = 20;
			super.anObjectArray4[super.anInt3080] = arg0;
			super.anInt3080++;
			super.anInt3077++;
			if (super.anInt3080 >= 5000) {
				super.anInt3080 = 0;
			}
			super.anInt3081++;
			if (this.anInt3094 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!fl;B)V")
	@Override
	public void method2557(@OriginalArg(0) Class82 arg0) {
		@Pc(6) Object local6 = this.anObject6;
		synchronized (this.anObject6) {
			super.anInt3078--;
			if (super.anInt3078 < 0) {
				super.anInt3078 = 4999;
			}
			super.aByteArray34[super.anInt3078] = 21;
			super.anObjectArray4[super.anInt3078] = arg0;
			super.anInt3081++;
			super.anInt3077++;
			if (this.anInt3094 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	@Override
	public void method2556(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(14) Object local14 = this.anObject6;
		synchronized (this.anObject6) {
			@Pc(22) int local22;
			if (arg0 == this.anInt3090) {
				for (local22 = 0; local22 < this.anInt3090; local22++) {
					this.method2564(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt3090; local22++) {
					this.aClass121_Sub1Array1[local22].method3973();
				}
				this.anInt3090 = arg0;
				this.aClass121_Sub1Array1 = new Class121_Sub1[this.anInt3090];
				for (@Pc(62) int local62 = 0; local62 < this.anInt3090; local62++) {
					this.aClass121_Sub1Array1[local62] = new Class121_Sub1(this);
					this.aClass121_Sub1Array1[local62].method3974();
					this.method2564(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!fl;)V")
	@Override
	public void method2560(@OriginalArg(1) Class82 arg0) {
		@Pc(2) Object local2 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray34[super.anInt3080] = 21;
			super.anObjectArray4[super.anInt3080] = arg0;
			super.anInt3080++;
			super.anInt3077++;
			if (super.anInt3080 >= 5000) {
				super.anInt3080 = 0;
			}
			super.anInt3081++;
			if (this.anInt3094 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
	@Override
	public void method2561() {
		try {
			@Pc(8) Object local8 = this.anObject6;
			synchronized (this.anObject6) {
				while (true) {
					if (super.anInt3081 == 0) {
						break;
					}
					this.anObject6.wait();
				}
			}
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!pe;)V")
	public void method2566(@OriginalArg(1) Class121_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject6;
			@Pc(45) byte local45;
			synchronized (this.anObject6) {
				while (super.anInt3077 == 0) {
					this.anInt3094++;
					this.anObject6.wait();
					this.anInt3094--;
				}
				local45 = super.aByteArray34[super.anInt3078];
				if (arg0.anInt5080 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject8 = super.anObjectArray4[super.anInt3078];
					local11 = super.aFloatArray18[super.anInt3078];
					super.anObjectArray4[super.anInt3078] = null;
					super.anInt3078++;
					super.anInt3077--;
					if (super.anInt3078 >= 5000) {
						super.anInt3078 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5080 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt5080 = local45;
					Static257.aClass128_36.method3592(local45);
				}
			} else if (local45 == 21) {
				Static446.method5580(arg0, (Class82) arg0.anObject8);
			} else if (local45 == 20) {
				@Pc(152) Class82 local152 = (Class82) arg0.anObject8;
				if (local152.aClass20_Sub1_2 != null) {
					local152.aClass20_Sub1_2.method5114(Static257.aClass128_36);
				}
				if (local152.aClass20_Sub1_3 != null) {
					local152.aClass20_Sub1_3.method5114(Static257.aClass128_36);
				}
				if (local152.aClass20_Sub4_1 != null) {
					local152.aClass20_Sub4_1.method5114(Static257.aClass128_36);
				}
				if (local152.aClass20_Sub4_2 != null) {
					local152.aClass20_Sub4_2.method5114(Static257.aClass128_36);
				}
				if (local152.aClass20_Sub2_1 != null) {
					local152.aClass20_Sub2_1.method5114(Static257.aClass128_36);
				}
				for (@Pc(195) Class146 local195 = local152.aClass146_1; local195 != null; local195 = local195.aClass146_3) {
					local195.aClass20_Sub3_1.method5114(Static257.aClass128_36);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static257.aClass128_36.o(3000.0F, local11 * 1.5F);
				((Class163) arg0.anObject8).method4518(Static85.anInt4657, Static179.anInt2929, Static317.anInt5269, Static269.aBooleanArrayArray7, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static257.aClass128_36.o(3000.0F, local11 * 1.5F);
				((Class163) arg0.anObject8).method4518(Static85.anInt4657, Static179.anInt2929, Static317.anInt5269, Static82.aBooleanArrayArray1, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static257.aClass128_36.fa(-1, 1583160, 40, 127);
			} else if (local45 == 23) {
				Static257.aClass128_36.S();
			} else if (local45 == 24) {
				Static257.aClass128_36.method3565(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static257.aClass128_36.method3590(arg0.anInt5080);
				arg0.anInt5080 = -1;
			}
		} catch (@Pc(339) Exception local339) {
		} finally {
			@Pc(345) Object local345 = null;
			if (local7) {
				@Pc(402) Object local402 = this.anObject6;
				synchronized (this.anObject6) {
					super.anInt3081--;
					if (super.anInt3081 == 0) {
						this.anObject6.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	@Override
	public void method2558() {
		@Pc(8) Object local8 = this.anObject6;
		synchronized (this.anObject6) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt3090; local12++) {
				if (this.aClass121_Sub1Array1[local12].anInt5080 >= 0) {
					this.method2562(this.aClass121_Sub1Array1[local12].anInt5080);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V")
	@Override
	public void method2551(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray34[super.anInt3080] = (byte) arg0;
			super.anInt3080++;
			super.anInt3081++;
			super.anInt3077++;
			if (super.anInt3080 >= 5000) {
				super.anInt3080 = 0;
			}
			if (this.anInt3094 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}
}
