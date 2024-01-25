import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Ljava/lang/Object;")
	private final Object anObject11 = new Object();

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "[Lclient!qga;")
	private Class78_Sub1[] aClass78_Sub1Array1 = new Class78_Sub1[0];

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	private int anInt2556 = 0;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
	private int anInt2567 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!qga;)V")
	public void method2285(@OriginalArg(1) Class78_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject11;
			@Pc(43) byte local43;
			synchronized (this.anObject11) {
				while (super.anInt9385 == 0) {
					this.anInt2556++;
					this.anObject11.wait();
					this.anInt2556--;
				}
				local43 = super.aByteArray116[super.anInt9384];
				if (arg0.anInt7415 >= 0) {
					if (local43 < 0 || local43 > 3) {
						local7 = true;
					}
				} else if (local43 >= 0 && local43 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject36 = super.anObjectArray36[super.anInt9384];
					super.anObjectArray36[super.anInt9384] = null;
					super.anInt9384++;
					super.anInt9385--;
					if (super.anInt9384 >= 5000) {
						super.anInt9384 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt7415 >= 0) {
				if (local43 == 21) {
					Static439.method7891(arg0, (Class100) arg0.anObject36);
				} else if (local43 == 20) {
					@Pc(228) Class100 local228 = (Class100) arg0.anObject36;
					if (local228.aClass10_Sub2_3 != null) {
						local228.aClass10_Sub2_3.method7729(Static474.aClass66_8);
					}
					if (local228.aClass10_Sub2_2 != null) {
						local228.aClass10_Sub2_2.method7729(Static474.aClass66_8);
					}
					if (local228.aClass10_Sub4_1 != null) {
						local228.aClass10_Sub4_1.method7729(Static474.aClass66_8);
					}
					if (local228.aClass10_Sub4_2 != null) {
						local228.aClass10_Sub4_2.method7729(Static474.aClass66_8);
					}
					if (local228.aClass10_Sub5_1 != null) {
						local228.aClass10_Sub5_1.method7729(Static474.aClass66_8);
					}
					for (@Pc(271) Class35 local271 = local228.aClass35_2; local271 != null; local271 = local271.aClass35_1) {
						local271.aClass10_Sub1_1.method7729(Static474.aClass66_8);
					}
				} else if (local43 >= 30 && local43 <= 33) {
					((Class16) arg0.anObject36).method8041(Static22.anInt439, Static140.anInt3150, Static415.anInt7175, Static56.aBooleanArrayArray1, local43 - 30 == 0);
				} else if (local43 >= 40 && local43 <= 43) {
					((Class16) arg0.anObject36).method8041(Static22.anInt439, Static140.anInt3150, Static415.anInt7175, Static575.aBooleanArrayArray6, local43 - 40 == 0);
				} else if (local43 == 22) {
					Static474.aClass66_8.AA(-1, 1583160, 40, 127);
				} else if (local43 == 23) {
					Static474.aClass66_8.k();
				} else if (local43 == 24) {
					Static474.aClass66_8.method6785(0, null);
				} else if (local43 >= 10 && local43 <= 13) {
					Static474.aClass66_8.method6787(arg0.anInt7415);
					arg0.anInt7415 = -1;
				}
			} else if (local43 >= 0 && local43 <= 3) {
				arg0.anInt7415 = local43;
				Static474.aClass66_8.method6813(local43);
			}
		} catch (@Pc(310) Exception local310) {
		} finally {
			@Pc(316) Object local316 = null;
			if (local7) {
				@Pc(387) Object local387 = this.anObject11;
				synchronized (this.anObject11) {
					super.anInt9383--;
					if (super.anInt9383 == 0) {
						this.anObject11.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7712() {
		@Pc(15) Object local15 = this.anObject11;
		synchronized (this.anObject11) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt2567; local19++) {
				if (this.aClass78_Sub1Array1[local19].anInt7415 >= 0) {
					this.method2286(this.aClass78_Sub1Array1[local19].anInt7415);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
	private void method2286(@OriginalArg(0) int arg0) {
		super.aByteArray116[super.anInt9379] = (byte) (arg0 + 10);
		super.anInt9379++;
		super.anInt9385++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
		super.anInt9383++;
		if (this.anInt2556 > 0) {
			@Pc(54) Object local54 = this.anObject11;
			synchronized (this.anObject11) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
	private void method2287(@OriginalArg(0) int arg0) {
		super.aByteArray116[super.anInt9379] = (byte) arg0;
		super.anInt9379++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
		super.anInt9385++;
		super.anInt9383++;
		if (this.anInt2556 > 0) {
			@Pc(52) Object local52 = this.anObject11;
			synchronized (this.anObject11) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!fba;I)V")
	@Override
	public void method7716(@OriginalArg(0) Class100 arg0) {
		@Pc(2) Object local2 = this.anObject11;
		synchronized (this.anObject11) {
			super.aByteArray116[super.anInt9379] = 21;
			super.anObjectArray36[super.anInt9379] = arg0;
			super.anInt9379++;
			super.anInt9383++;
			super.anInt9385++;
			if (super.anInt9379 >= 5000) {
				super.anInt9379 = 0;
			}
			if (this.anInt2556 > 0) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!fba;B)V")
	@Override
	public void method7711(@OriginalArg(0) Class100 arg0) {
		@Pc(11) Object local11 = this.anObject11;
		synchronized (this.anObject11) {
			super.anInt9384--;
			if (super.anInt9384 < 0) {
				super.anInt9384 = 4999;
			}
			super.aByteArray116[super.anInt9384] = 21;
			super.anObjectArray36[super.anInt9384] = arg0;
			super.anInt9385++;
			super.anInt9383++;
			if (this.anInt2556 > 0) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
	@Override
	public void method7713() {
		try {
			@Pc(4) Object local4 = this.anObject11;
			synchronized (this.anObject11) {
				while (true) {
					if (super.anInt9383 == 0) {
						break;
					}
					this.anObject11.wait();
				}
			}
		} catch (@Pc(21) Exception local21) {
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V")
	@Override
	public void method7708(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject11;
		synchronized (this.anObject11) {
			@Pc(22) int local22;
			if (arg0 == this.anInt2567) {
				for (local22 = 0; local22 < this.anInt2567; local22++) {
					this.method2287(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt2567; local22++) {
					this.aClass78_Sub1Array1[local22].method6140();
				}
				this.anInt2567 = arg0;
				this.aClass78_Sub1Array1 = new Class78_Sub1[this.anInt2567];
				for (@Pc(75) int local75 = 0; local75 < this.anInt2567; local75++) {
					this.aClass78_Sub1Array1[local75] = new Class78_Sub1(this);
					this.aClass78_Sub1Array1[local75].method6143();
					this.method2287(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7714(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.anObject11;
		synchronized (this.anObject11) {
			super.aByteArray116[super.anInt9379] = (byte) arg0;
			super.anInt9379++;
			super.anInt9383++;
			super.anInt9385++;
			if (super.anInt9379 >= 5000) {
				super.anInt9379 = 0;
			}
			if (this.anInt2556 > 0) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!fba;)V")
	@Override
	public void method7707(@OriginalArg(1) Class100 arg0) {
		@Pc(2) Object local2 = this.anObject11;
		synchronized (this.anObject11) {
			super.aByteArray116[super.anInt9379] = 20;
			super.anObjectArray36[super.anInt9379] = arg0;
			super.anInt9379++;
			super.anInt9385++;
			if (super.anInt9379 >= 5000) {
				super.anInt9379 = 0;
			}
			super.anInt9383++;
			if (this.anInt2556 > 0) {
				this.anObject11.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!d;IZ)V")
	@Override
	public void method7709(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) Object local6 = this.anObject11;
		synchronized (this.anObject11) {
			super.aByteArray116[super.anInt9379] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt9379] = arg0;
			super.anInt9379++;
			if (super.anInt9379 >= 5000) {
				super.anInt9379 = 0;
			}
			super.anInt9383++;
			super.anInt9385++;
			if (this.anInt2556 > 0) {
				this.anObject11.notifyAll();
			}
		}
	}
}
