import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "[Lclient!cb;")
	private Class34_Sub1[] aClass34_Sub1Array1 = new Class34_Sub1[0];

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	private int anInt2481 = 0;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private int anInt2482 = 0;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	@Override
	public void method1896(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray30[super.anInt2462] = (byte) arg0;
			super.anInt2462++;
			if (super.anInt2462 >= 5000) {
				super.anInt2462 = 0;
			}
			super.anInt2465++;
			super.anInt2461++;
			if (this.anInt2481 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	@Override
	public void method1889() {
		try {
			@Pc(8) Object local8 = this.anObject8;
			synchronized (this.anObject8) {
				while (super.anInt2465 != 0) {
					this.anObject8.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	private void method1900(@OriginalArg(1) int arg0) {
		super.aByteArray30[super.anInt2462] = (byte) arg0;
		super.anInt2462++;
		super.anInt2461++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
		super.anInt2465++;
		if (this.anInt2481 > 0) {
			@Pc(52) Object local52 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V")
	private void method1901(@OriginalArg(1) int arg0) {
		super.aByteArray30[super.anInt2462] = (byte) (arg0 + 10);
		super.anInt2462++;
		super.anInt2465++;
		if (super.anInt2462 >= 5000) {
			super.anInt2462 = 0;
		}
		super.anInt2461++;
		if (this.anInt2481 > 0) {
			@Pc(52) Object local52 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!iq;B)V")
	@Override
	public void method1888(@OriginalArg(0) Class118 arg0) {
		@Pc(8) Object local8 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray30[super.anInt2462] = 21;
			super.anObjectArray4[super.anInt2462] = arg0;
			super.anInt2462++;
			super.anInt2465++;
			super.anInt2461++;
			if (super.anInt2462 >= 5000) {
				super.anInt2462 = 0;
			}
			if (this.anInt2481 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(FZILclient!na;B)V")
	@Override
	public void method1891(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class159 arg3) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray30[super.anInt2462] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray4[super.anInt2462] = arg3;
			super.aFloatArray6[super.anInt2462] = arg0;
			super.anInt2462++;
			super.anInt2465++;
			if (super.anInt2462 >= 5000) {
				super.anInt2462 = 0;
			}
			super.anInt2461++;
			if (this.anInt2481 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!iq;)V")
	@Override
	public void method1897(@OriginalArg(1) Class118 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt2460--;
			if (super.anInt2460 < 0) {
				super.anInt2460 = 4999;
			}
			super.aByteArray30[super.anInt2460] = 21;
			super.anObjectArray4[super.anInt2460] = arg0;
			super.anInt2465++;
			super.anInt2461++;
			if (this.anInt2481 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	@Override
	public void method1893() {
		@Pc(8) Object local8 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2482; local12++) {
				if (this.aClass34_Sub1Array1[local12].anInt1159 >= 0) {
					this.method1901(this.aClass34_Sub1Array1[local12].anInt1159);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLclient!iq;)V")
	@Override
	public void method1898(@OriginalArg(1) Class118 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray30[super.anInt2462] = 20;
			super.anObjectArray4[super.anInt2462] = arg0;
			super.anInt2462++;
			super.anInt2465++;
			if (super.anInt2462 >= 5000) {
				super.anInt2462 = 0;
			}
			super.anInt2461++;
			if (this.anInt2481 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!cb;B)V")
	public void method1903(@OriginalArg(0) Class34_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject8;
			@Pc(51) byte local51;
			synchronized (this.anObject8) {
				while (super.anInt2461 == 0) {
					this.anInt2481++;
					this.anObject8.wait();
					this.anInt2481--;
				}
				local51 = super.aByteArray30[super.anInt2460];
				if (arg0.anInt1159 >= 0) {
					if (local51 < 0 || local51 > 3) {
						local7 = true;
					}
				} else if (local51 >= 0 && local51 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray4[super.anInt2460];
					local17 = super.aFloatArray6[super.anInt2460];
					super.anObjectArray4[super.anInt2460] = null;
					super.anInt2460++;
					super.anInt2461--;
					if (super.anInt2460 >= 5000) {
						super.anInt2460 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt1159 >= 0) {
				if (local51 == 21) {
					Static274.method3902(arg0, (Class118) arg0.anObject2);
				} else if (local51 == 20) {
					@Pc(260) Class118 local260 = (Class118) arg0.anObject2;
					if (local260.aClass7_Sub4_2 != null) {
						local260.aClass7_Sub4_2.method5267(Static255.aClass172_9);
					}
					if (local260.aClass7_Sub4_1 != null) {
						local260.aClass7_Sub4_1.method5267(Static255.aClass172_9);
					}
					if (local260.aClass7_Sub3_3 != null) {
						local260.aClass7_Sub3_3.method5267(Static255.aClass172_9);
					}
					if (local260.aClass7_Sub3_2 != null) {
						local260.aClass7_Sub3_2.method5267(Static255.aClass172_9);
					}
					if (local260.aClass7_Sub1_1 != null) {
						local260.aClass7_Sub1_1.method5267(Static255.aClass172_9);
					}
					for (@Pc(303) Class179 local303 = local260.aClass179_2; local303 != null; local303 = local303.aClass179_3) {
						local303.aClass7_Sub2_2.method5267(Static255.aClass172_9);
					}
				} else if (local51 >= 30 && local51 <= 33) {
					Static255.aClass172_9.o(3000.0F, local17 * 1.5F);
					((Class159) arg0.anObject2).method4833(Static310.anInt5498, Static111.anInt2450, Static80.anInt2001, Static313.aBooleanArrayArray6, local51 - 30 == 0);
				} else if (local51 >= 40 && local51 <= 43) {
					Static255.aClass172_9.o(3000.0F, local17 * 1.5F);
					((Class159) arg0.anObject2).method4833(Static310.anInt5498, Static111.anInt2450, Static80.anInt2001, Static14.aBooleanArrayArray1, local51 - 40 == 0);
				} else if (local51 == 22) {
					Static255.aClass172_9.fa(-1, 1583160, 40, 127);
				} else if (local51 == 23) {
					Static255.aClass172_9.S();
				} else if (local51 == 24) {
					Static255.aClass172_9.method5485(0, null);
				} else if (local51 >= 10 && local51 <= 13) {
					Static255.aClass172_9.method5523(arg0.anInt1159);
					arg0.anInt1159 = -1;
				}
			} else if (local51 >= 0 && local51 <= 3) {
				arg0.anInt1159 = local51;
				Static255.aClass172_9.method5521(local51);
			}
		} catch (@Pc(337) Exception local337) {
		} finally {
			@Pc(343) Object local343 = null;
			if (local7) {
				@Pc(433) Object local433 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt2465--;
					if (super.anInt2465 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	@Override
	public void method1892(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject8;
		synchronized (this.anObject8) {
			@Pc(18) int local18;
			if (this.anInt2482 == arg0) {
				for (local18 = 0; local18 < this.anInt2482; local18++) {
					this.method1900(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt2482; local18++) {
					this.aClass34_Sub1Array1[local18].method847();
				}
				this.anInt2482 = arg0;
				this.aClass34_Sub1Array1 = new Class34_Sub1[this.anInt2482];
				for (@Pc(62) int local62 = 0; local62 < this.anInt2482; local62++) {
					this.aClass34_Sub1Array1[local62] = new Class34_Sub1(this);
					this.aClass34_Sub1Array1[local62].method849();
					this.method1900(local7++);
				}
			}
		}
	}
}
