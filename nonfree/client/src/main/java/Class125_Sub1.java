import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	private int anInt3682 = 0;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "[Lclient!ue;")
	private Class22_Sub1[] aClass22_Sub1Array1 = new Class22_Sub1[0];

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt3680 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	@Override
	public void method2948(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray112[super.anInt3691] = (byte) arg0;
			super.anInt3691++;
			super.anInt3688++;
			super.anInt3685++;
			if (super.anInt3691 >= 5000) {
				super.anInt3691 = 0;
			}
			if (this.anInt3682 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	@Override
	public void method2955() {
		try {
			@Pc(8) Object local8 = this.anObject2;
			synchronized (this.anObject2) {
				while (super.anInt3688 != 0) {
					this.anObject2.wait();
				}
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ht;I)V")
	@Override
	public void method2953(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt3687--;
			if (super.anInt3687 < 0) {
				super.anInt3687 = 4999;
			}
			super.aByteArray112[super.anInt3687] = 21;
			super.anObjectArray35[super.anInt3687] = arg0;
			super.anInt3685++;
			super.anInt3688++;
			if (this.anInt3682 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILclient!ht;)V")
	@Override
	public void method2952(@OriginalArg(1) Class113 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray112[super.anInt3691] = 21;
			super.anObjectArray35[super.anInt3691] = arg0;
			super.anInt3691++;
			if (super.anInt3691 >= 5000) {
				super.anInt3691 = 0;
			}
			super.anInt3685++;
			super.anInt3688++;
			if (this.anInt3682 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	@Override
	public void method2947() {
		@Pc(4) Object local4 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt3680; local8++) {
				if (this.aClass22_Sub1Array1[local8].anInt6963 >= 0) {
					this.method2945(this.aClass22_Sub1Array1[local8].anInt6963);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	private void method2944(@OriginalArg(0) int arg0) {
		super.aByteArray112[super.anInt3691] = (byte) arg0;
		super.anInt3691++;
		super.anInt3688++;
		super.anInt3685++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
		if (this.anInt3682 > 0) {
			@Pc(46) Object local46 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ht;)V")
	@Override
	public void method2949(@OriginalArg(1) Class113 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray112[super.anInt3691] = 20;
			super.anObjectArray35[super.anInt3691] = arg0;
			super.anInt3691++;
			if (super.anInt3691 >= 5000) {
				super.anInt3691 = 0;
			}
			super.anInt3685++;
			super.anInt3688++;
			if (this.anInt3682 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IFZLclient!na;I)V")
	@Override
	public void method2950(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class106 arg3) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray112[super.anInt3691] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray35[super.anInt3691] = arg3;
			super.aFloatArray22[super.anInt3691] = arg1;
			super.anInt3691++;
			super.anInt3685++;
			if (super.anInt3691 >= 5000) {
				super.anInt3691 = 0;
			}
			super.anInt3688++;
			if (this.anInt3682 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	@Override
	public void method2951(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = 0;
		@Pc(17) Object local17 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(25) int local25;
			if (arg0 == this.anInt3680) {
				for (local25 = 0; local25 < this.anInt3680; local25++) {
					this.method2944(local14++);
				}
			} else {
				for (local25 = 0; local25 < this.anInt3680; local25++) {
					this.aClass22_Sub1Array1[local25].method5457();
				}
				this.anInt3680 = arg0;
				this.aClass22_Sub1Array1 = new Class22_Sub1[this.anInt3680];
				for (@Pc(73) int local73 = 0; local73 < this.anInt3680; local73++) {
					this.aClass22_Sub1Array1[local73] = new Class22_Sub1(this);
					this.aClass22_Sub1Array1[local73].method5455();
					this.method2944(local14++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	private void method2945(@OriginalArg(1) int arg0) {
		super.aByteArray112[super.anInt3691] = (byte) (arg0 + 10);
		super.anInt3691++;
		super.anInt3688++;
		if (super.anInt3691 >= 5000) {
			super.anInt3691 = 0;
		}
		super.anInt3685++;
		if (this.anInt3682 > 0) {
			@Pc(52) Object local52 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ue;I)V")
	public void method2946(@OriginalArg(0) Class22_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(18) float local18 = 0.0F;
			@Pc(21) Object local21 = this.anObject2;
			@Pc(52) byte local52;
			synchronized (this.anObject2) {
				while (super.anInt3685 == 0) {
					this.anInt3682++;
					this.anObject2.wait();
					this.anInt3682--;
				}
				local52 = super.aByteArray112[super.anInt3687];
				if (arg0.anInt6963 < 0) {
					if (local52 >= 0 && local52 <= 3) {
						local7 = true;
					}
				} else if (local52 < 0 || local52 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject10 = super.anObjectArray35[super.anInt3687];
					local18 = super.aFloatArray22[super.anInt3687];
					super.anObjectArray35[super.anInt3687] = null;
					super.anInt3687++;
					super.anInt3685--;
					if (super.anInt3687 >= 5000) {
						super.anInt3687 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6963 < 0) {
				if (local52 >= 0 && local52 <= 3) {
					arg0.anInt6963 = local52;
					Static444.aClass26_11.method2256(local52);
				}
			} else if (local52 == 21) {
				Static322.method4615(arg0, (Class113) arg0.anObject10);
			} else if (local52 == 20) {
				@Pc(163) Class113 local163 = (Class113) arg0.anObject10;
				if (local163.aClass4_Sub4_2 != null) {
					local163.aClass4_Sub4_2.method5893(Static444.aClass26_11);
				}
				if (local163.aClass4_Sub4_1 != null) {
					local163.aClass4_Sub4_1.method5893(Static444.aClass26_11);
				}
				if (local163.aClass4_Sub1_2 != null) {
					local163.aClass4_Sub1_2.method5893(Static444.aClass26_11);
				}
				if (local163.aClass4_Sub1_3 != null) {
					local163.aClass4_Sub1_3.method5893(Static444.aClass26_11);
				}
				if (local163.aClass4_Sub3_1 != null) {
					local163.aClass4_Sub3_1.method5893(Static444.aClass26_11);
				}
				for (@Pc(206) Class134 local206 = local163.aClass134_1; local206 != null; local206 = local206.aClass134_2) {
					local206.aClass4_Sub2_1.method5893(Static444.aClass26_11);
				}
			} else if (local52 >= 30 && local52 <= 33) {
				Static444.aClass26_11.o(3000.0F, local18 * 1.5F);
				((Class106) arg0.anObject10).method5479(Static249.anInt4746, Static404.anInt7034, Static178.anInt3432, Static348.aBooleanArrayArray7, local52 - 30 == 0);
			} else if (local52 >= 40 && local52 <= 43) {
				Static444.aClass26_11.o(3000.0F, local18 * 1.5F);
				((Class106) arg0.anObject10).method5479(Static249.anInt4746, Static404.anInt7034, Static178.anInt3432, Static24.aBooleanArrayArray1, local52 - 40 == 0);
			} else if (local52 == 22) {
				Static444.aClass26_11.fa(-1, 1583160, 40, 127);
			} else if (local52 == 23) {
				Static444.aClass26_11.S();
			} else if (local52 == 24) {
				Static444.aClass26_11.method2265(0, null);
			} else if (local52 >= 10 && local52 <= 13) {
				Static444.aClass26_11.method2235(arg0.anInt6963);
				arg0.anInt6963 = -1;
			}
		} catch (@Pc(335) Exception local335) {
		} finally {
			@Pc(341) Object local341 = null;
			if (local7) {
				@Pc(401) Object local401 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt3688--;
					if (super.anInt3688 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}
}
