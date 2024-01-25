import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	private int anInt594 = 0;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "[Lclient!nt;")
	private Class184_Sub1[] aClass184_Sub1Array1 = new Class184_Sub1[0];

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	private int anInt603 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)V")
	@Override
	public void method4504(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(18) int local18;
			if (this.anInt594 == arg0) {
				for (local18 = 0; local18 < this.anInt594; local18++) {
					this.method498(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt594; local18++) {
					this.aClass184_Sub1Array1[local18].method3631();
				}
				this.anInt594 = arg0;
				this.aClass184_Sub1Array1 = new Class184_Sub1[this.anInt594];
				for (@Pc(70) int local70 = 0; local70 < this.anInt594; local70++) {
					this.aClass184_Sub1Array1[local70] = new Class184_Sub1(this);
					this.aClass184_Sub1Array1[local70].method3632();
					this.method498(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ta;IIFZ)V")
	@Override
	public void method4505(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray71[super.anInt5529] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt5529] = arg0;
			super.aFloatArray26[super.anInt5529] = arg2;
			super.anInt5529++;
			super.anInt5527++;
			if (super.anInt5529 >= 5000) {
				super.anInt5529 = 0;
			}
			super.anInt5530++;
			if (this.anInt603 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	@Override
	public void method4506() {
		@Pc(9) Object local9 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt594; local13++) {
				if (this.aClass184_Sub1Array1[local13].anInt4555 >= 0) {
					this.method496(this.aClass184_Sub1Array1[local13].anInt4555);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!nt;B)V")
	public void method495(@OriginalArg(0) Class184_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(19) float local19 = 0.0F;
			@Pc(22) Object local22 = this.anObject2;
			@Pc(53) byte local53;
			synchronized (this.anObject2) {
				while (super.anInt5530 == 0) {
					this.anInt603++;
					this.anObject2.wait();
					this.anInt603--;
				}
				local53 = super.aByteArray71[super.anInt5532];
				if (arg0.anInt4555 >= 0) {
					if (local53 < 0 || local53 > 3) {
						local7 = true;
					}
				} else if (local53 >= 0 && local53 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject15 = super.anObjectArray36[super.anInt5532];
					local19 = super.aFloatArray26[super.anInt5532];
					super.anObjectArray36[super.anInt5532] = null;
					super.anInt5532++;
					super.anInt5530--;
					if (super.anInt5532 >= 5000) {
						super.anInt5532 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt4555 < 0) {
				if (local53 >= 0 && local53 <= 3) {
					arg0.anInt4555 = local53;
					Static323.aClass135_12.method5335(local53);
				}
			} else if (local53 == 21) {
				Static51.method679(arg0, (Class75) arg0.anObject15);
			} else if (local53 == 20) {
				@Pc(273) Class75 local273 = (Class75) arg0.anObject15;
				if (local273.aClass8_Sub2_1 != null) {
					local273.aClass8_Sub2_1.method5877(Static323.aClass135_12);
				}
				if (local273.aClass8_Sub2_2 != null) {
					local273.aClass8_Sub2_2.method5877(Static323.aClass135_12);
				}
				if (local273.aClass8_Sub5_2 != null) {
					local273.aClass8_Sub5_2.method5877(Static323.aClass135_12);
				}
				if (local273.aClass8_Sub5_1 != null) {
					local273.aClass8_Sub5_1.method5877(Static323.aClass135_12);
				}
				if (local273.aClass8_Sub4_1 != null) {
					local273.aClass8_Sub4_1.method5877(Static323.aClass135_12);
				}
				for (@Pc(316) Class251 local316 = local273.aClass251_2; local316 != null; local316 = local316.aClass251_3) {
					local316.aClass8_Sub3_2.method5877(Static323.aClass135_12);
				}
			} else if (local53 >= 30 && local53 <= 33) {
				Static323.aClass135_12.g(3000.0F, local19 * 1.5F);
				((Class41) arg0.anObject15).method5565(Static32.anInt531, Static150.anInt2733, Static387.anInt6326, Static458.aBooleanArrayArray8, local53 - 30 == 0);
			} else if (local53 >= 40 && local53 <= 43) {
				Static323.aClass135_12.g(3000.0F, local19 * 1.5F);
				((Class41) arg0.anObject15).method5565(Static32.anInt531, Static150.anInt2733, Static387.anInt6326, Static399.aBooleanArrayArray7, local53 - 40 == 0);
			} else if (local53 == 22) {
				Static323.aClass135_12.AA(-1, 1583160, 40, 127);
			} else if (local53 == 23) {
				Static323.aClass135_12.l();
			} else if (local53 == 24) {
				Static323.aClass135_12.method5359(0, null);
			} else if (local53 >= 10 && local53 <= 13) {
				Static323.aClass135_12.method5340(arg0.anInt4555);
				arg0.anInt4555 = -1;
			}
		} catch (@Pc(330) Exception local330) {
		} finally {
			@Pc(336) Object local336 = null;
			if (local7) {
				@Pc(396) Object local396 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt5527--;
					if (super.anInt5527 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	private void method496(@OriginalArg(1) int arg0) {
		super.aByteArray71[super.anInt5529] = (byte) (arg0 + 10);
		super.anInt5529++;
		super.anInt5527++;
		super.anInt5530++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
		if (this.anInt603 > 0) {
			@Pc(55) Object local55 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
	@Override
	public void method4499(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray71[super.anInt5529] = (byte) arg0;
			super.anInt5529++;
			if (super.anInt5529 >= 5000) {
				super.anInt5529 = 0;
			}
			super.anInt5527++;
			super.anInt5530++;
			if (this.anInt603 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ev;I)V")
	@Override
	public void method4502(@OriginalArg(0) Class75 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray71[super.anInt5529] = 20;
			super.anObjectArray36[super.anInt5529] = arg0;
			super.anInt5529++;
			super.anInt5527++;
			super.anInt5530++;
			if (super.anInt5529 >= 5000) {
				super.anInt5529 = 0;
			}
			if (this.anInt603 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	private void method498(@OriginalArg(0) int arg0) {
		super.aByteArray71[super.anInt5529] = (byte) arg0;
		super.anInt5529++;
		super.anInt5527++;
		super.anInt5530++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
		if (this.anInt603 > 0) {
			@Pc(50) Object local50 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILclient!ev;)V")
	@Override
	public void method4507(@OriginalArg(1) Class75 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt5532--;
			if (super.anInt5532 < 0) {
				super.anInt5532 = 4999;
			}
			super.aByteArray71[super.anInt5532] = 21;
			super.anObjectArray36[super.anInt5532] = arg0;
			super.anInt5530++;
			super.anInt5527++;
			if (this.anInt603 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	@Override
	public void method4503() {
		try {
			@Pc(10) Object local10 = this.anObject2;
			synchronized (this.anObject2) {
				while (true) {
					if (super.anInt5527 == 0) {
						break;
					}
					this.anObject2.wait();
				}
			}
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!ev;)V")
	@Override
	public void method4501(@OriginalArg(1) Class75 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray71[super.anInt5529] = 21;
			super.anObjectArray36[super.anInt5529] = arg0;
			super.anInt5529++;
			if (super.anInt5529 >= 5000) {
				super.anInt5529 = 0;
			}
			super.anInt5527++;
			super.anInt5530++;
			if (this.anInt603 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}
}
