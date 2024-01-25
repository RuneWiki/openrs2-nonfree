import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "[Lclient!tm;")
	private Class158_Sub1[] aClass158_Sub1Array1 = new Class158_Sub1[0];

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	private int anInt1676 = 0;

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
	private int anInt1675 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	@Override
	public void method3938(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(22) int local22;
			if (arg0 == this.anInt1675) {
				for (local22 = 0; local22 < this.anInt1675; local22++) {
					this.method1347(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt1675; local22++) {
					this.aClass158_Sub1Array1[local22].method5098();
				}
				this.anInt1675 = arg0;
				this.aClass158_Sub1Array1 = new Class158_Sub1[this.anInt1675];
				for (@Pc(62) int local62 = 0; local62 < this.anInt1675; local62++) {
					this.aClass158_Sub1Array1[local62] = new Class158_Sub1(this);
					this.aClass158_Sub1Array1[local62].method5099();
					this.method1347(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(FBIZLclient!uh;)V")
	@Override
	public void method3945(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class60 arg3) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray58[super.anInt4430] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray33[super.anInt4430] = arg3;
			super.aFloatArray25[super.anInt4430] = arg0;
			super.anInt4430++;
			super.anInt4427++;
			super.anInt4431++;
			if (super.anInt4430 >= 5000) {
				super.anInt4430 = 0;
			}
			if (this.anInt1676 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!ls;)V")
	@Override
	public void method3947(@OriginalArg(1) Class128 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray58[super.anInt4430] = 20;
			super.anObjectArray33[super.anInt4430] = arg0;
			super.anInt4430++;
			super.anInt4427++;
			super.anInt4431++;
			if (super.anInt4430 >= 5000) {
				super.anInt4430 = 0;
			}
			if (this.anInt1676 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
	private void method1347(@OriginalArg(1) int arg0) {
		super.aByteArray58[super.anInt4430] = (byte) arg0;
		super.anInt4430++;
		super.anInt4427++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
		super.anInt4431++;
		if (this.anInt1676 > 0) {
			@Pc(52) Object local52 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	@Override
	public void method3946() {
		@Pc(8) Object local8 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1675; local20++) {
				if (this.aClass158_Sub1Array1[local20].anInt6002 >= 0) {
					this.method1348(this.aClass158_Sub1Array1[local20].anInt6002);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ls;Z)V")
	@Override
	public void method3941(@OriginalArg(0) Class128 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray58[super.anInt4430] = 21;
			super.anObjectArray33[super.anInt4430] = arg0;
			super.anInt4430++;
			super.anInt4427++;
			if (super.anInt4430 >= 5000) {
				super.anInt4430 = 0;
			}
			super.anInt4431++;
			if (this.anInt1676 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ls;B)V")
	@Override
	public void method3952(@OriginalArg(0) Class128 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt4432--;
			if (super.anInt4432 < 0) {
				super.anInt4432 = 4999;
			}
			super.aByteArray58[super.anInt4432] = 21;
			super.anObjectArray33[super.anInt4432] = arg0;
			super.anInt4431++;
			super.anInt4427++;
			if (this.anInt1676 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	private void method1348(@OriginalArg(1) int arg0) {
		super.aByteArray58[super.anInt4430] = (byte) (arg0 + 10);
		super.anInt4430++;
		super.anInt4427++;
		super.anInt4431++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
		if (this.anInt1676 > 0) {
			@Pc(49) Object local49 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	@Override
	public void method3950() {
		try {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				while (true) {
					if (super.anInt4427 == 0) {
						break;
					}
					this.anObject1.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray58[super.anInt4430] = (byte) arg0;
			super.anInt4430++;
			if (super.anInt4430 >= 5000) {
				super.anInt4430 = 0;
			}
			super.anInt4431++;
			super.anInt4427++;
			if (this.anInt1676 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!tm;I)V")
	public void method1352(@OriginalArg(0) Class158_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(50) byte local50;
			synchronized (this.anObject1) {
				while (super.anInt4431 == 0) {
					this.anInt1676++;
					this.anObject1.wait();
					this.anInt1676--;
				}
				local50 = super.aByteArray58[super.anInt4432];
				if (arg0.anInt6002 < 0) {
					if (local50 >= 0 && local50 <= 3) {
						local7 = true;
					}
				} else if (local50 < 0 || local50 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray33[super.anInt4432];
					local11 = super.aFloatArray25[super.anInt4432];
					super.anObjectArray33[super.anInt4432] = null;
					super.anInt4432++;
					if (super.anInt4432 >= 5000) {
						super.anInt4432 = 0;
					}
					super.anInt4431--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6002 < 0) {
				if (local50 >= 0 && local50 <= 3) {
					arg0.anInt6002 = local50;
					Static170.aClass47_5.method2744(local50);
				}
			} else if (local50 == 21) {
				Static127.method2628(arg0, (Class128) arg0.anObject6);
			} else if (local50 == 20) {
				@Pc(263) Class128 local263 = (Class128) arg0.anObject6;
				if (local263.aClass8_Sub4_1 != null) {
					local263.aClass8_Sub4_1.method5627(Static170.aClass47_5);
				}
				if (local263.aClass8_Sub4_2 != null) {
					local263.aClass8_Sub4_2.method5627(Static170.aClass47_5);
				}
				if (local263.aClass8_Sub2_1 != null) {
					local263.aClass8_Sub2_1.method5627(Static170.aClass47_5);
				}
				if (local263.aClass8_Sub2_2 != null) {
					local263.aClass8_Sub2_2.method5627(Static170.aClass47_5);
				}
				if (local263.aClass8_Sub5_1 != null) {
					local263.aClass8_Sub5_1.method5627(Static170.aClass47_5);
				}
				for (@Pc(306) Class117 local306 = local263.aClass117_2; local306 != null; local306 = local306.aClass117_1) {
					local306.aClass8_Sub1_1.method5627(Static170.aClass47_5);
				}
			} else if (local50 >= 30 && local50 <= 33) {
				Static170.aClass47_5.method2701(3000.0F, local11 * 1.5F);
				((Class60) arg0.anObject6).method2268(Static61.anInt1578, Static246.anInt5043, Static328.anInt6272, Static339.aBooleanArrayArray2, local50 - 30 == 0);
			} else if (local50 >= 40 && local50 <= 43) {
				Static170.aClass47_5.method2701(3000.0F, local11 * 1.5F);
				((Class60) arg0.anObject6).method2268(Static61.anInt1578, Static246.anInt5043, Static328.anInt6272, Static229.aBooleanArrayArray6, local50 - 40 == 0);
			} else if (local50 == 22) {
				Static170.aClass47_5.method2689();
			} else if (local50 == 23) {
				Static170.aClass47_5.method2719();
			} else if (local50 == 24) {
				Static170.aClass47_5.method2716(0, null);
			} else if (local50 >= 10 && local50 <= 13) {
				Static170.aClass47_5.method2755(arg0.anInt6002);
				arg0.anInt6002 = -1;
			}
		} catch (@Pc(327) Exception local327) {
		} finally {
			@Pc(333) Object local333 = null;
			if (local7) {
				@Pc(390) Object local390 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt4427--;
					if (super.anInt4427 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}
}
