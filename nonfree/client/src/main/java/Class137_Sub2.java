import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject6 = new Object();

	@OriginalMember(owner = "client!si", name = "G", descriptor = "I")
	private int anInt5432 = 0;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "[Lclient!uh;")
	private Class191_Sub1[] aClass191_Sub1Array1 = new Class191_Sub1[0];

	@OriginalMember(owner = "client!si", name = "C", descriptor = "I")
	private int anInt5430 = 0;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	@Override
	public void method4820() {
		try {
			@Pc(4) Object local4 = this.anObject6;
			synchronized (this.anObject6) {
				while (true) {
					if (super.anInt5408 == 0) {
						break;
					}
					this.anObject6.wait();
				}
			}
		} catch (@Pc(21) Exception local21) {
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IFLclient!pl;ZI)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(6) Object local6 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray79[super.anInt5410] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray34[super.anInt5410] = arg2;
			super.aFloatArray25[super.anInt5410] = arg1;
			super.anInt5410++;
			super.anInt5412++;
			super.anInt5408++;
			if (super.anInt5410 >= 5000) {
				super.anInt5410 = 0;
			}
			if (this.anInt5430 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!ct;)V")
	@Override
	public void method4822(@OriginalArg(1) Class48 arg0) {
		@Pc(2) Object local2 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray79[super.anInt5410] = 20;
			super.anObjectArray34[super.anInt5410] = arg0;
			super.anInt5410++;
			super.anInt5408++;
			if (super.anInt5410 >= 5000) {
				super.anInt5410 = 0;
			}
			super.anInt5412++;
			if (this.anInt5430 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
	private void method4828(@OriginalArg(0) int arg0) {
		super.aByteArray79[super.anInt5410] = (byte) (arg0 + 10);
		super.anInt5410++;
		super.anInt5412++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
		super.anInt5408++;
		if (this.anInt5430 > 0) {
			@Pc(43) Object local43 = this.anObject6;
			synchronized (this.anObject6) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	@Override
	public void method4821() {
		@Pc(8) Object local8 = this.anObject6;
		synchronized (this.anObject6) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt5432; local12++) {
				if (this.aClass191_Sub1Array1[local12].anInt5887 >= 0) {
					this.method4828(this.aClass191_Sub1Array1[local12].anInt5887);
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!uh;B)V")
	public void method4830(@OriginalArg(0) Class191_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject6;
			@Pc(42) byte local42;
			synchronized (this.anObject6) {
				while (super.anInt5412 == 0) {
					this.anInt5430++;
					this.anObject6.wait();
					this.anInt5430--;
				}
				local42 = super.aByteArray79[super.anInt5409];
				if (arg0.anInt5887 >= 0) {
					if (local42 < 0 || local42 > 3) {
						local7 = true;
					}
				} else if (local42 >= 0 && local42 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray34[super.anInt5409];
					local11 = super.aFloatArray25[super.anInt5409];
					super.anObjectArray34[super.anInt5409] = null;
					super.anInt5409++;
					super.anInt5412--;
					if (super.anInt5409 >= 5000) {
						super.anInt5409 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5887 >= 0) {
				if (local42 == 21) {
					Static248.method4060(arg0, (Class48) arg0.anObject7);
				} else if (local42 == 20) {
					@Pc(252) Class48 local252 = (Class48) arg0.anObject7;
					if (local252.aClass28_Sub3_1 != null) {
						local252.aClass28_Sub3_1.method5406(Static121.aClass155_1);
					}
					if (local252.aClass28_Sub3_2 != null) {
						local252.aClass28_Sub3_2.method5406(Static121.aClass155_1);
					}
					if (local252.aClass28_Sub4_2 != null) {
						local252.aClass28_Sub4_2.method5406(Static121.aClass155_1);
					}
					if (local252.aClass28_Sub4_1 != null) {
						local252.aClass28_Sub4_1.method5406(Static121.aClass155_1);
					}
					if (local252.aClass28_Sub2_2 != null) {
						local252.aClass28_Sub2_2.method5406(Static121.aClass155_1);
					}
					for (@Pc(295) Class50 local295 = local252.aClass50_1; local295 != null; local295 = local295.aClass50_2) {
						local295.aClass28_Sub1_1.method5406(Static121.aClass155_1);
					}
				} else if (local42 >= 30 && local42 <= 33) {
					Static121.aClass155_1.method4856(3000.0F, local11 * 1.5F);
					((Class7) arg0.anObject7).method5647(Static12.anInt167, Static327.anInt5555, Static68.anInt1339, Static191.aBooleanArrayArray3, local42 - 30 == 0);
				} else if (local42 >= 40 && local42 <= 43) {
					Static121.aClass155_1.method4856(3000.0F, local11 * 1.5F);
					((Class7) arg0.anObject7).method5647(Static12.anInt167, Static327.anInt5555, Static68.anInt1339, Static202.aBooleanArrayArray4, local42 - 40 == 0);
				} else if (local42 == 22) {
					Static121.aClass155_1.method4878();
				} else if (local42 == 23) {
					Static121.aClass155_1.method4892();
				} else if (local42 == 24) {
					Static121.aClass155_1.method4945(0, null);
				} else if (local42 >= 10 && local42 <= 13) {
					Static121.aClass155_1.method4890(arg0.anInt5887);
					arg0.anInt5887 = -1;
				}
			} else if (local42 >= 0 && local42 <= 3) {
				arg0.anInt5887 = local42;
				Static121.aClass155_1.method4852(local42);
			}
		} catch (@Pc(334) Exception local334) {
		} finally {
			@Pc(340) Object local340 = null;
			if (local7) {
				@Pc(400) Object local400 = this.anObject6;
				synchronized (this.anObject6) {
					super.anInt5408--;
					if (super.anInt5408 == 0) {
						this.anObject6.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	@Override
	public void method4819(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject6;
		synchronized (this.anObject6) {
			@Pc(22) int local22;
			if (this.anInt5432 == arg0) {
				for (local22 = 0; local22 < this.anInt5432; local22++) {
					this.method4833(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt5432; local22++) {
					this.aClass191_Sub1Array1[local22].method5266();
				}
				this.anInt5432 = arg0;
				this.aClass191_Sub1Array1 = new Class191_Sub1[this.anInt5432];
				for (@Pc(67) int local67 = 0; local67 < this.anInt5432; local67++) {
					this.aClass191_Sub1Array1[local67] = new Class191_Sub1(this);
					this.aClass191_Sub1Array1[local67].method5264();
					this.method4833(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	@Override
	public void method4825(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray79[super.anInt5410] = (byte) arg0;
			super.anInt5410++;
			super.anInt5412++;
			super.anInt5408++;
			if (super.anInt5410 >= 5000) {
				super.anInt5410 = 0;
			}
			if (this.anInt5430 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ct;I)V")
	@Override
	public void method4818(@OriginalArg(0) Class48 arg0) {
		@Pc(2) Object local2 = this.anObject6;
		synchronized (this.anObject6) {
			super.anInt5409--;
			if (super.anInt5409 < 0) {
				super.anInt5409 = 4999;
			}
			super.aByteArray79[super.anInt5409] = 21;
			super.anObjectArray34[super.anInt5409] = arg0;
			super.anInt5408++;
			super.anInt5412++;
			if (this.anInt5430 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
	private void method4833(@OriginalArg(1) int arg0) {
		super.aByteArray79[super.anInt5410] = (byte) arg0;
		super.anInt5410++;
		super.anInt5408++;
		if (super.anInt5410 >= 5000) {
			super.anInt5410 = 0;
		}
		super.anInt5412++;
		if (this.anInt5430 > 0) {
			@Pc(45) Object local45 = this.anObject6;
			synchronized (this.anObject6) {
				this.anObject6.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ct;)V")
	@Override
	public void method4823(@OriginalArg(1) Class48 arg0) {
		@Pc(6) Object local6 = this.anObject6;
		synchronized (this.anObject6) {
			super.aByteArray79[super.anInt5410] = 21;
			super.anObjectArray34[super.anInt5410] = arg0;
			super.anInt5410++;
			super.anInt5408++;
			super.anInt5412++;
			if (super.anInt5410 >= 5000) {
				super.anInt5410 = 0;
			}
			if (this.anInt5430 > 0) {
				this.anObject6.notifyAll();
			}
		}
	}
}
