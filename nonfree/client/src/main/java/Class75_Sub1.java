import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject4 = new Object();

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	private int anInt2112 = 0;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	private int anInt2113 = 0;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[Lclient!er;")
	private Class86_Sub1[] aClass86_Sub1Array1 = new Class86_Sub1[0];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	@Override
	public void method3840() {
		try {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				while (super.anInt4398 != 0) {
					this.anObject4.wait();
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!rg;)V")
	@Override
	public void method3837(@OriginalArg(1) Class255 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray65[super.anInt4400] = 21;
			super.anObjectArray3[super.anInt4400] = arg0;
			super.anInt4400++;
			if (super.anInt4400 >= 5000) {
				super.anInt4400 = 0;
			}
			super.anInt4393++;
			super.anInt4398++;
			if (this.anInt2113 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray65[super.anInt4400] = (byte) arg0;
			super.anInt4400++;
			if (super.anInt4400 >= 5000) {
				super.anInt4400 = 0;
			}
			super.anInt4398++;
			super.anInt4393++;
			if (this.anInt2113 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!rg;)V")
	@Override
	public void method3842(@OriginalArg(1) Class255 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.anInt4392--;
			if (super.anInt4392 < 0) {
				super.anInt4392 = 4999;
			}
			super.aByteArray65[super.anInt4392] = 21;
			super.anObjectArray3[super.anInt4392] = arg0;
			super.anInt4393++;
			super.anInt4398++;
			if (this.anInt2113 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	@Override
	public void method3834(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject4;
		synchronized (this.anObject4) {
			@Pc(22) int local22;
			if (this.anInt2112 == arg0) {
				for (local22 = 0; local22 < this.anInt2112; local22++) {
					this.method1788(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt2112; local22++) {
					this.aClass86_Sub1Array1[local22].method1993();
				}
				this.anInt2112 = arg0;
				this.aClass86_Sub1Array1 = new Class86_Sub1[this.anInt2112];
				for (@Pc(70) int local70 = 0; local70 < this.anInt2112; local70++) {
					this.aClass86_Sub1Array1[local70] = new Class86_Sub1(this);
					this.aClass86_Sub1Array1[local70].method1991();
					this.method1788(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILclient!sa;)V")
	@Override
	public void method3831(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class205 arg2) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray65[super.anInt4400] = (byte) (arg0 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray3[super.anInt4400] = arg2;
			super.anInt4400++;
			super.anInt4393++;
			super.anInt4398++;
			if (super.anInt4400 >= 5000) {
				super.anInt4400 = 0;
			}
			if (this.anInt2113 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!er;I)V")
	public void method1785(@OriginalArg(0) Class86_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject4;
			@Pc(43) byte local43;
			synchronized (this.anObject4) {
				while (super.anInt4393 == 0) {
					this.anInt2113++;
					this.anObject4.wait();
					this.anInt2113--;
				}
				local43 = super.aByteArray65[super.anInt4392];
				if (arg0.anInt2373 < 0) {
					if (local43 >= 0 && local43 <= 3) {
						local7 = true;
					}
				} else if (local43 < 0 || local43 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray3[super.anInt4392];
					super.anObjectArray3[super.anInt4392] = null;
					super.anInt4392++;
					super.anInt4393--;
					if (super.anInt4392 >= 5000) {
						super.anInt4392 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt2373 >= 0) {
				if (local43 == 21) {
					Static342.method5171(arg0, (Class255) arg0.anObject6);
				} else if (local43 == 20) {
					@Pc(122) Class255 local122 = (Class255) arg0.anObject6;
					if (local122.aClass49_Sub1_3 != null) {
						local122.aClass49_Sub1_3.method7455(Static416.aClass122_7);
					}
					if (local122.aClass49_Sub1_2 != null) {
						local122.aClass49_Sub1_2.method7455(Static416.aClass122_7);
					}
					if (local122.aClass49_Sub3_1 != null) {
						local122.aClass49_Sub3_1.method7455(Static416.aClass122_7);
					}
					if (local122.aClass49_Sub3_2 != null) {
						local122.aClass49_Sub3_2.method7455(Static416.aClass122_7);
					}
					if (local122.aClass49_Sub5_2 != null) {
						local122.aClass49_Sub5_2.method7455(Static416.aClass122_7);
					}
					for (@Pc(167) Class63 local167 = local122.aClass63_3; local167 != null; local167 = local167.aClass63_1) {
						local167.aClass49_Sub2_1.method7455(Static416.aClass122_7);
					}
				} else if (local43 >= 30 && local43 <= 33) {
					((Class205) arg0.anObject6).method6750(Static393.anInt7097, Static211.anInt4100, Static251.anInt4913, Static149.aBooleanArrayArray5, local43 - 30 == 0);
				} else if (local43 >= 40 && local43 <= 43) {
					((Class205) arg0.anObject6).method6750(Static393.anInt7097, Static211.anInt4100, Static251.anInt4913, Static360.aBooleanArrayArray6, local43 - 40 == 0);
				} else if (local43 == 22) {
					Static416.aClass122_7.q(-1, 1583160, 40, 127);
				} else if (local43 == 23) {
					Static416.aClass122_7.xa();
				} else if (local43 == 24) {
					Static416.aClass122_7.method7264(0, null);
				} else if (local43 >= 10 && local43 <= 13) {
					Static416.aClass122_7.method7211(arg0.anInt2373);
					arg0.anInt2373 = -1;
				}
			} else if (local43 >= 0 && local43 <= 3) {
				arg0.anInt2373 = local43;
				Static416.aClass122_7.method7232(local43);
			}
		} catch (@Pc(301) Exception local301) {
		} finally {
			@Pc(307) Object local307 = null;
			if (local7) {
				@Pc(372) Object local372 = this.anObject4;
				synchronized (this.anObject4) {
					super.anInt4398--;
					if (super.anInt4398 == 0) {
						this.anObject4.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)V")
	private void method1787(@OriginalArg(0) int arg0) {
		super.aByteArray65[super.anInt4400] = (byte) (arg0 + 10);
		super.anInt4400++;
		super.anInt4393++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
		super.anInt4398++;
		if (this.anInt2113 > 0) {
			@Pc(50) Object local50 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!rg;B)V")
	@Override
	public void method3835(@OriginalArg(0) Class255 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray65[super.anInt4400] = 20;
			super.anObjectArray3[super.anInt4400] = arg0;
			super.anInt4400++;
			if (super.anInt4400 >= 5000) {
				super.anInt4400 = 0;
			}
			super.anInt4393++;
			super.anInt4398++;
			if (this.anInt2113 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	@Override
	public void method3836() {
		@Pc(8) Object local8 = this.anObject4;
		synchronized (this.anObject4) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2112; local12++) {
				if (this.aClass86_Sub1Array1[local12].anInt2373 >= 0) {
					this.method1787(this.aClass86_Sub1Array1[local12].anInt2373);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	private void method1788(@OriginalArg(1) int arg0) {
		super.aByteArray65[super.anInt4400] = (byte) arg0;
		super.anInt4400++;
		super.anInt4398++;
		if (super.anInt4400 >= 5000) {
			super.anInt4400 = 0;
		}
		super.anInt4393++;
		if (this.anInt2113 > 0) {
			@Pc(49) Object local49 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}
}
