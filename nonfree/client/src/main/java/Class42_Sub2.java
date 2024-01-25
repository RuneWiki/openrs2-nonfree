import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
	private int anInt2333 = 0;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "[Lclient!wj;")
	private Class96_Sub1[] aClass96_Sub1Array1 = new Class96_Sub1[0];

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	private int anInt2337 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!sq;)V")
	@Override
	public void method2030(@OriginalArg(1) Class194 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray37[super.anInt2313] = 21;
			super.anObjectArray33[super.anInt2313] = arg0;
			super.anInt2313++;
			super.anInt2316++;
			super.anInt2317++;
			if (super.anInt2313 >= 5000) {
				super.anInt2313 = 0;
			}
			if (this.anInt2333 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLclient!ip;FZI)V")
	@Override
	public void method2029(@OriginalArg(1) Class53 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray37[super.anInt2313] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray33[super.anInt2313] = arg0;
			super.aFloatArray9[super.anInt2313] = arg1;
			super.anInt2313++;
			super.anInt2316++;
			if (super.anInt2313 >= 5000) {
				super.anInt2313 = 0;
			}
			super.anInt2317++;
			if (this.anInt2333 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
	private void method2039(@OriginalArg(0) int arg0) {
		super.aByteArray37[super.anInt2313] = (byte) (arg0 + 10);
		super.anInt2313++;
		super.anInt2317++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
		super.anInt2316++;
		if (this.anInt2333 > 0) {
			@Pc(53) Object local53 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	@Override
	public void method2031() {
		try {
			@Pc(8) Object local8 = this.anObject2;
			synchronized (this.anObject2) {
				while (super.anInt2317 != 0) {
					this.anObject2.wait();
				}
			}
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!wj;B)V")
	public void method2041(@OriginalArg(0) Class96_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject2;
			@Pc(51) byte local51;
			synchronized (this.anObject2) {
				while (super.anInt2316 == 0) {
					this.anInt2333++;
					this.anObject2.wait();
					this.anInt2333--;
				}
				local51 = super.aByteArray37[super.anInt2315];
				if (arg0.anInt6692 < 0) {
					if (local51 >= 0 && local51 <= 3) {
						local7 = true;
					}
				} else if (local51 < 0 || local51 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray33[super.anInt2315];
					local17 = super.aFloatArray9[super.anInt2315];
					super.anObjectArray33[super.anInt2315] = null;
					super.anInt2315++;
					if (super.anInt2315 >= 5000) {
						super.anInt2315 = 0;
					}
					super.anInt2316--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6692 < 0) {
				if (local51 >= 0 && local51 <= 3) {
					arg0.anInt6692 = local51;
					Static20.aClass32_4.method2211(local51);
				}
			} else if (local51 == 21) {
				Static285.method4004(arg0, (Class194) arg0.anObject7);
			} else if (local51 == 20) {
				@Pc(162) Class194 local162 = (Class194) arg0.anObject7;
				if (local162.aClass17_Sub4_1 != null) {
					local162.aClass17_Sub4_1.method4787(Static20.aClass32_4);
				}
				if (local162.aClass17_Sub4_2 != null) {
					local162.aClass17_Sub4_2.method4787(Static20.aClass32_4);
				}
				if (local162.aClass17_Sub3_1 != null) {
					local162.aClass17_Sub3_1.method4787(Static20.aClass32_4);
				}
				if (local162.aClass17_Sub3_2 != null) {
					local162.aClass17_Sub3_2.method4787(Static20.aClass32_4);
				}
				if (local162.aClass17_Sub5_1 != null) {
					local162.aClass17_Sub5_1.method4787(Static20.aClass32_4);
				}
				for (@Pc(205) Class126 local205 = local162.aClass126_2; local205 != null; local205 = local205.aClass126_1) {
					local205.aClass17_Sub1_1.method4787(Static20.aClass32_4);
				}
			} else if (local51 >= 30 && local51 <= 33) {
				Static20.aClass32_4.method2225(3000.0F, local17 * 1.5F);
				((Class53) arg0.anObject7).method2791(Static318.anInt6137, Static204.anInt4305, Static77.anInt2009, Static253.aBooleanArrayArray6, local51 - 30 == 0);
			} else if (local51 >= 40 && local51 <= 43) {
				Static20.aClass32_4.method2225(3000.0F, local17 * 1.5F);
				((Class53) arg0.anObject7).method2791(Static318.anInt6137, Static204.anInt4305, Static77.anInt2009, Static203.aBooleanArrayArray4, local51 - 40 == 0);
			} else if (local51 == 22) {
				Static20.aClass32_4.method2138();
			} else if (local51 == 23) {
				Static20.aClass32_4.method2162();
			} else if (local51 == 24) {
				Static20.aClass32_4.method2236(0, null);
			} else if (local51 >= 10 && local51 <= 13) {
				Static20.aClass32_4.method2195(arg0.anInt6692);
				arg0.anInt6692 = -1;
			}
		} catch (@Pc(341) Exception local341) {
		} finally {
			@Pc(347) Object local347 = null;
			if (local7) {
				@Pc(407) Object local407 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt2317--;
					if (super.anInt2317 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IB)V")
	private void method2042(@OriginalArg(0) int arg0) {
		super.aByteArray37[super.anInt2313] = (byte) arg0;
		super.anInt2313++;
		super.anInt2316++;
		super.anInt2317++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
		if (this.anInt2333 > 0) {
			@Pc(47) Object local47 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!sq;)V")
	@Override
	public void method2032(@OriginalArg(1) Class194 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray37[super.anInt2313] = 20;
			super.anObjectArray33[super.anInt2313] = arg0;
			super.anInt2313++;
			if (super.anInt2313 >= 5000) {
				super.anInt2313 = 0;
			}
			super.anInt2316++;
			super.anInt2317++;
			if (this.anInt2333 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	@Override
	public void method2034(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(22) int local22;
			if (this.anInt2337 == arg0) {
				for (local22 = 0; local22 < this.anInt2337; local22++) {
					this.method2042(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt2337; local22++) {
					this.aClass96_Sub1Array1[local22].method5598();
				}
				this.anInt2337 = arg0;
				this.aClass96_Sub1Array1 = new Class96_Sub1[this.anInt2337];
				for (@Pc(62) int local62 = 0; local62 < this.anInt2337; local62++) {
					this.aClass96_Sub1Array1[local62] = new Class96_Sub1(this);
					this.aClass96_Sub1Array1[local62].method5599();
					this.method2042(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!sq;I)V")
	@Override
	public void method2036(@OriginalArg(0) Class194 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt2315--;
			if (super.anInt2315 < 0) {
				super.anInt2315 = 4999;
			}
			super.aByteArray37[super.anInt2315] = 21;
			super.anObjectArray33[super.anInt2315] = arg0;
			super.anInt2316++;
			super.anInt2317++;
			if (this.anInt2333 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	@Override
	public void method2033() {
		@Pc(8) Object local8 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2337; local12++) {
				if (this.aClass96_Sub1Array1[local12].anInt6692 >= 0) {
					this.method2039(this.aClass96_Sub1Array1[local12].anInt6692);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	@Override
	public void method2035(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray37[super.anInt2313] = (byte) arg0;
			super.anInt2313++;
			super.anInt2317++;
			if (super.anInt2313 >= 5000) {
				super.anInt2313 = 0;
			}
			super.anInt2316++;
			if (this.anInt2333 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}
}
