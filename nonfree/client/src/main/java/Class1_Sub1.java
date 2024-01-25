import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!vaa", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject20 = new Object();

	@OriginalMember(owner = "client!vaa", name = "D", descriptor = "[Lclient!wba;")
	private Class260_Sub1[] aClass260_Sub1Array1 = new Class260_Sub1[0];

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
	private int anInt9087 = 0;

	@OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
	private int anInt9092 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!wba;)V")
	public void method7449(@OriginalArg(1) Class260_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(20) Object local20 = this.anObject20;
			@Pc(48) byte local48;
			synchronized (this.anObject20) {
				while (super.anInt9402 == 0) {
					this.anInt9087++;
					this.anObject20.wait();
					this.anInt9087--;
				}
				local48 = super.aByteArray118[super.anInt9401];
				if (arg0.anInt9444 >= 0) {
					if (local48 < 0 || local48 > 3) {
						local7 = true;
					}
				} else if (local48 >= 0 && local48 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject21 = super.anObjectArray36[super.anInt9401];
					super.anObjectArray36[super.anInt9401] = null;
					super.anInt9401++;
					super.anInt9402--;
					if (super.anInt9401 >= 5000) {
						super.anInt9401 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt9444 < 0) {
				if (local48 >= 0 && local48 <= 3) {
					arg0.anInt9444 = local48;
					Static394.aClass14_11.method6873(local48);
				}
			} else if (local48 == 21) {
				Static263.method4409(arg0, (Class276) arg0.anObject21);
			} else if (local48 == 20) {
				@Pc(150) Class276 local150 = (Class276) arg0.anObject21;
				if (local150.aClass4_Sub5_2 != null) {
					local150.aClass4_Sub5_2.method7786(Static394.aClass14_11);
				}
				if (local150.aClass4_Sub5_3 != null) {
					local150.aClass4_Sub5_3.method7786(Static394.aClass14_11);
				}
				if (local150.aClass4_Sub2_3 != null) {
					local150.aClass4_Sub2_3.method7786(Static394.aClass14_11);
				}
				if (local150.aClass4_Sub2_2 != null) {
					local150.aClass4_Sub2_2.method7786(Static394.aClass14_11);
				}
				if (local150.aClass4_Sub3_2 != null) {
					local150.aClass4_Sub3_2.method7786(Static394.aClass14_11);
				}
				for (@Pc(193) Class267 local193 = local150.aClass267_3; local193 != null; local193 = local193.aClass267_2) {
					local193.aClass4_Sub1_2.method7786(Static394.aClass14_11);
				}
			} else if (local48 >= 30 && local48 <= 33) {
				((Class59) arg0.anObject21).method7860(Static213.anInt8691, Static117.anInt2704, Static156.anInt3342, Static211.aBooleanArrayArray2, local48 - 30 == 0);
			} else if (local48 >= 40 && local48 <= 43) {
				((Class59) arg0.anObject21).method7860(Static213.anInt8691, Static117.anInt2704, Static156.anInt3342, Static472.aBooleanArrayArray8, local48 - 40 == 0);
			} else if (local48 == 22) {
				Static394.aClass14_11.AA(-1, 1583160, 40, 127);
			} else if (local48 == 23) {
				Static394.aClass14_11.k();
			} else if (local48 == 24) {
				Static394.aClass14_11.method6869(0, null);
			} else if (local48 >= 10 && local48 <= 13) {
				Static394.aClass14_11.method6850(arg0.anInt9444);
				arg0.anInt9444 = -1;
			}
		} catch (@Pc(309) Exception local309) {
		} finally {
			@Pc(315) Object local315 = null;
			if (local7) {
				@Pc(372) Object local372 = this.anObject20;
				synchronized (this.anObject20) {
					super.anInt9400--;
					if (super.anInt9400 == 0) {
						this.anObject20.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!qs;B)V")
	@Override
	public void method7680(@OriginalArg(0) Class276 arg0) {
		@Pc(6) Object local6 = this.anObject20;
		synchronized (this.anObject20) {
			super.anInt9401--;
			if (super.anInt9401 < 0) {
				super.anInt9401 = 4999;
			}
			super.aByteArray118[super.anInt9401] = 21;
			super.anObjectArray36[super.anInt9401] = arg0;
			super.anInt9400++;
			super.anInt9402++;
			if (this.anInt9087 > 0) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BI)V")
	private void method7450(@OriginalArg(1) int arg0) {
		super.aByteArray118[super.anInt9399] = (byte) (arg0 + 10);
		super.anInt9399++;
		super.anInt9400++;
		super.anInt9402++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
		if (this.anInt9087 > 0) {
			@Pc(54) Object local54 = this.anObject20;
			synchronized (this.anObject20) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7678(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject20;
		synchronized (this.anObject20) {
			super.aByteArray118[super.anInt9399] = (byte) arg0;
			super.anInt9399++;
			super.anInt9400++;
			if (super.anInt9399 >= 5000) {
				super.anInt9399 = 0;
			}
			super.anInt9402++;
			if (this.anInt9087 > 0) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!qs;)V")
	@Override
	public void method7676(@OriginalArg(1) Class276 arg0) {
		@Pc(2) Object local2 = this.anObject20;
		synchronized (this.anObject20) {
			super.aByteArray118[super.anInt9399] = 21;
			super.anObjectArray36[super.anInt9399] = arg0;
			super.anInt9399++;
			if (super.anInt9399 >= 5000) {
				super.anInt9399 = 0;
			}
			super.anInt9400++;
			super.anInt9402++;
			if (this.anInt9087 > 0) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BZILclient!d;)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(6) Object local6 = this.anObject20;
		synchronized (this.anObject20) {
			super.aByteArray118[super.anInt9399] = (byte) (arg0 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt9399] = arg2;
			super.anInt9399++;
			super.anInt9400++;
			if (super.anInt9399 >= 5000) {
				super.anInt9399 = 0;
			}
			super.anInt9402++;
			if (this.anInt9087 > 0) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IB)V")
	private void method7452(@OriginalArg(0) int arg0) {
		super.aByteArray118[super.anInt9399] = (byte) arg0;
		super.anInt9399++;
		super.anInt9402++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
		super.anInt9400++;
		if (this.anInt9087 > 0) {
			@Pc(49) Object local49 = this.anObject20;
			synchronized (this.anObject20) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!qs;I)V")
	@Override
	public void method7674(@OriginalArg(0) Class276 arg0) {
		@Pc(2) Object local2 = this.anObject20;
		synchronized (this.anObject20) {
			super.aByteArray118[super.anInt9399] = 20;
			super.anObjectArray36[super.anInt9399] = arg0;
			super.anInt9399++;
			super.anInt9402++;
			if (super.anInt9399 >= 5000) {
				super.anInt9399 = 0;
			}
			super.anInt9400++;
			if (this.anInt9087 > 0) {
				this.anObject20.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject20;
		synchronized (this.anObject20) {
			@Pc(22) int local22;
			if (this.anInt9092 == arg0) {
				for (local22 = 0; local22 < this.anInt9092; local22++) {
					this.method7452(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt9092; local22++) {
					this.aClass260_Sub1Array1[local22].method7710();
				}
				this.anInt9092 = arg0;
				this.aClass260_Sub1Array1 = new Class260_Sub1[this.anInt9092];
				for (@Pc(70) int local70 = 0; local70 < this.anInt9092; local70++) {
					this.aClass260_Sub1Array1[local70] = new Class260_Sub1(this);
					this.aClass260_Sub1Array1[local70].method7707();
					this.method7452(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7673() {
		@Pc(8) Object local8 = this.anObject20;
		synchronized (this.anObject20) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt9092; local12++) {
				if (this.aClass260_Sub1Array1[local12].anInt9444 >= 0) {
					this.method7450(this.aClass260_Sub1Array1[local12].anInt9444);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7677() {
		try {
			@Pc(8) Object local8 = this.anObject20;
			synchronized (this.anObject20) {
				while (super.anInt9400 != 0) {
					this.anObject20.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}
}
