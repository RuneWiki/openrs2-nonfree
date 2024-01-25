import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject4 = new Object();

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
	private int anInt2778 = 0;

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "[Lclient!to;")
	private Class18_Sub1[] aClass18_Sub1Array1 = new Class18_Sub1[0];

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
	private int anInt2779 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!to;I)V")
	public void method2242(@OriginalArg(0) Class18_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject4;
			@Pc(48) byte local48;
			synchronized (this.anObject4) {
				while (super.anInt3602 == 0) {
					this.anInt2778++;
					this.anObject4.wait();
					this.anInt2778--;
				}
				local48 = super.aByteArray51[super.anInt3600];
				if (arg0.anInt6455 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject8 = super.anObjectArray34[super.anInt3600];
					local11 = super.aFloatArray6[super.anInt3600];
					super.anObjectArray34[super.anInt3600] = null;
					super.anInt3600++;
					super.anInt3602--;
					if (super.anInt3600 >= 5000) {
						super.anInt3600 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6455 < 0) {
				if (local48 >= 0 && local48 <= 3) {
					arg0.anInt6455 = local48;
					Static293.aClass200_5.method5838(local48);
				}
			} else if (local48 == 21) {
				Static67.method1021(arg0, (Class258) arg0.anObject8);
			} else if (local48 == 20) {
				@Pc(162) Class258 local162 = (Class258) arg0.anObject8;
				if (local162.aClass2_Sub4_2 != null) {
					local162.aClass2_Sub4_2.method6021(Static293.aClass200_5);
				}
				if (local162.aClass2_Sub4_3 != null) {
					local162.aClass2_Sub4_3.method6021(Static293.aClass200_5);
				}
				if (local162.aClass2_Sub2_2 != null) {
					local162.aClass2_Sub2_2.method6021(Static293.aClass200_5);
				}
				if (local162.aClass2_Sub2_3 != null) {
					local162.aClass2_Sub2_3.method6021(Static293.aClass200_5);
				}
				if (local162.aClass2_Sub3_2 != null) {
					local162.aClass2_Sub3_2.method6021(Static293.aClass200_5);
				}
				for (@Pc(205) Class122 local205 = local162.aClass122_3; local205 != null; local205 = local205.aClass122_1) {
					local205.aClass2_Sub1_1.method6021(Static293.aClass200_5);
				}
			} else if (local48 >= 30 && local48 <= 33) {
				Static293.aClass200_5.da(3000.0F, local11 * 1.5F);
				((Class125) arg0.anObject8).method4992(Static448.anInt7370, Static17.anInt369, Static70.anInt1271, Static309.aBooleanArrayArray6, local48 - 30 == 0);
			} else if (local48 >= 40 && local48 <= 43) {
				Static293.aClass200_5.da(3000.0F, local11 * 1.5F);
				((Class125) arg0.anObject8).method4992(Static448.anInt7370, Static17.anInt369, Static70.anInt1271, Static37.aBooleanArrayArray1, local48 - 40 == 0);
			} else if (local48 == 22) {
				Static293.aClass200_5.s(-1, 1583160, 40, 127);
			} else if (local48 == 23) {
				Static293.aClass200_5.n();
			} else if (local48 == 24) {
				Static293.aClass200_5.method5846(0, null);
			} else if (local48 >= 10 && local48 <= 13) {
				Static293.aClass200_5.method5848(arg0.anInt6455);
				arg0.anInt6455 = -1;
			}
		} catch (@Pc(329) Exception local329) {
		} finally {
			@Pc(335) Object local335 = null;
			if (local7) {
				@Pc(423) Object local423 = this.anObject4;
				synchronized (this.anObject4) {
					super.anInt3596--;
					if (super.anInt3596 == 0) {
						this.anObject4.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void method2849() {
		try {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				while (super.anInt3596 != 0) {
					this.anObject4.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ya;IIZF)V")
	@Override
	public void method2853(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray51[super.anInt3606] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray34[super.anInt3606] = arg0;
			super.aFloatArray6[super.anInt3606] = arg3;
			super.anInt3606++;
			super.anInt3596++;
			if (super.anInt3606 >= 5000) {
				super.anInt3606 = 0;
			}
			super.anInt3602++;
			if (this.anInt2778 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)V")
	private void method2245(@OriginalArg(1) int arg0) {
		super.aByteArray51[super.anInt3606] = (byte) (arg0 + 10);
		super.anInt3606++;
		super.anInt3596++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
		super.anInt3602++;
		if (this.anInt2778 > 0) {
			@Pc(54) Object local54 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!vt;)V")
	@Override
	public void method2848(@OriginalArg(1) Class258 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray51[super.anInt3606] = 20;
			super.anObjectArray34[super.anInt3606] = arg0;
			super.anInt3606++;
			super.anInt3602++;
			super.anInt3596++;
			if (super.anInt3606 >= 5000) {
				super.anInt3606 = 0;
			}
			if (this.anInt2778 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V")
	@Override
	public void method2859(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray51[super.anInt3606] = (byte) arg0;
			super.anInt3606++;
			super.anInt3596++;
			super.anInt3602++;
			if (super.anInt3606 >= 5000) {
				super.anInt3606 = 0;
			}
			if (this.anInt2778 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!vt;I)V")
	@Override
	public void method2850(@OriginalArg(0) Class258 arg0) {
		@Pc(14) Object local14 = this.anObject4;
		synchronized (this.anObject4) {
			super.anInt3600--;
			if (super.anInt3600 < 0) {
				super.anInt3600 = 4999;
			}
			super.aByteArray51[super.anInt3600] = 21;
			super.anObjectArray34[super.anInt3600] = arg0;
			super.anInt3602++;
			super.anInt3596++;
			if (this.anInt2778 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	@Override
	public void method2860(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = 0;
		@Pc(14) Object local14 = this.anObject4;
		synchronized (this.anObject4) {
			@Pc(22) int local22;
			if (this.anInt2779 == arg0) {
				for (local22 = 0; local22 < this.anInt2779; local22++) {
					this.method2248(local11++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt2779; local22++) {
					this.aClass18_Sub1Array1[local22].method5138();
				}
				this.anInt2779 = arg0;
				this.aClass18_Sub1Array1 = new Class18_Sub1[this.anInt2779];
				for (@Pc(66) int local66 = 0; local66 < this.anInt2779; local66++) {
					this.aClass18_Sub1Array1[local66] = new Class18_Sub1(this);
					this.aClass18_Sub1Array1[local66].method5137();
					this.method2248(local11++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	@Override
	public void method2861() {
		@Pc(4) Object local4 = this.anObject4;
		synchronized (this.anObject4) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt2779; local14++) {
				if (this.aClass18_Sub1Array1[local14].anInt6455 >= 0) {
					this.method2245(this.aClass18_Sub1Array1[local14].anInt6455);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(BI)V")
	private void method2248(@OriginalArg(1) int arg0) {
		super.aByteArray51[super.anInt3606] = (byte) arg0;
		super.anInt3606++;
		super.anInt3602++;
		if (super.anInt3606 >= 5000) {
			super.anInt3606 = 0;
		}
		super.anInt3596++;
		if (this.anInt2778 > 0) {
			@Pc(53) Object local53 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(ILclient!vt;)V")
	@Override
	public void method2858(@OriginalArg(1) Class258 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray51[super.anInt3606] = 21;
			super.anObjectArray34[super.anInt3606] = arg0;
			super.anInt3606++;
			super.anInt3602++;
			super.anInt3596++;
			if (super.anInt3606 >= 5000) {
				super.anInt3606 = 0;
			}
			if (this.anInt2778 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}
}
