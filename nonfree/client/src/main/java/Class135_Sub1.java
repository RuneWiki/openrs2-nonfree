import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject4 = new Object();

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "[Lclient!ua;")
	private Class141_Sub1[] aClass141_Sub1Array1 = new Class141_Sub1[0];

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
	private int anInt4291 = 0;

	@OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
	private int anInt4296 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ua;I)V")
	public void method3681(@OriginalArg(0) Class141_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(16) float local16 = 0.0F;
			@Pc(19) Object local19 = this.anObject4;
			@Pc(47) byte local47;
			synchronized (this.anObject4) {
				while (super.anInt5774 == 0) {
					this.anInt4291++;
					this.anObject4.wait();
					this.anInt4291--;
				}
				local47 = super.aByteArray68[super.anInt5785];
				if (arg0.anInt6110 < 0) {
					if (local47 >= 0 && local47 <= 3) {
						local7 = true;
					}
				} else if (local47 < 0 || local47 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject8 = super.anObjectArray34[super.anInt5785];
					local16 = super.aFloatArray28[super.anInt5785];
					super.anObjectArray34[super.anInt5785] = null;
					super.anInt5785++;
					super.anInt5774--;
					if (super.anInt5785 >= 5000) {
						super.anInt5785 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6110 < 0) {
				if (local47 >= 0 && local47 <= 3) {
					arg0.anInt6110 = local47;
					Static176.aClass105_10.method4205(local47);
				}
			} else if (local47 == 21) {
				Static266.method4802(arg0, (Class83) arg0.anObject8);
			} else if (local47 == 20) {
				@Pc(167) Class83 local167 = (Class83) arg0.anObject8;
				if (local167.aClass10_Sub2_1 != null) {
					local167.aClass10_Sub2_1.method5822(Static176.aClass105_10);
				}
				if (local167.aClass10_Sub2_2 != null) {
					local167.aClass10_Sub2_2.method5822(Static176.aClass105_10);
				}
				if (local167.aClass10_Sub4_2 != null) {
					local167.aClass10_Sub4_2.method5822(Static176.aClass105_10);
				}
				if (local167.aClass10_Sub4_1 != null) {
					local167.aClass10_Sub4_1.method5822(Static176.aClass105_10);
				}
				if (local167.aClass10_Sub3_1 != null) {
					local167.aClass10_Sub3_1.method5822(Static176.aClass105_10);
				}
				for (@Pc(212) Class59 local212 = local167.aClass59_2; local212 != null; local212 = local212.aClass59_1) {
					local212.aClass10_Sub1_1.method5822(Static176.aClass105_10);
				}
			} else if (local47 >= 30 && local47 <= 33) {
				Static176.aClass105_10.method4207(3000.0F, local16 * 1.5F);
				((Class12) arg0.anObject8).method2703(Static97.anInt1886, Static349.anInt6708, Static131.anInt2605, Static50.aBooleanArrayArray1, local47 - 30 == 0);
			} else if (local47 >= 40 && local47 <= 43) {
				Static176.aClass105_10.method4207(3000.0F, local16 * 1.5F);
				((Class12) arg0.anObject8).method2703(Static97.anInt1886, Static349.anInt6708, Static131.anInt2605, Static296.aBooleanArrayArray8, local47 - 40 == 0);
			} else if (local47 == 22) {
				Static176.aClass105_10.method4226();
			} else if (local47 == 23) {
				Static176.aClass105_10.method4272();
			} else if (local47 == 24) {
				Static176.aClass105_10.method4242(0, null);
			} else if (local47 >= 10 && local47 <= 13) {
				Static176.aClass105_10.method4236(arg0.anInt6110);
				arg0.anInt6110 = -1;
			}
		} catch (@Pc(333) Exception local333) {
		} finally {
			@Pc(339) Object local339 = null;
			if (local7) {
				@Pc(399) Object local399 = this.anObject4;
				synchronized (this.anObject4) {
					super.anInt5780--;
					if (super.anInt5780 == 0) {
						this.anObject4.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V")
	private void method3682(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt5782] = (byte) (arg0 + 10);
		super.anInt5782++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
		super.anInt5780++;
		super.anInt5774++;
		if (this.anInt4291 > 0) {
			@Pc(49) Object local49 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gk;Z)V")
	@Override
	public void method5039(@OriginalArg(0) Class83 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.anInt5785--;
			if (super.anInt5785 < 0) {
				super.anInt5785 = 4999;
			}
			super.aByteArray68[super.anInt5785] = 21;
			super.anObjectArray34[super.anInt5785] = arg0;
			super.anInt5774++;
			super.anInt5780++;
			if (this.anInt4291 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	private void method3684(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt5782] = (byte) arg0;
		super.anInt5782++;
		super.anInt5774++;
		super.anInt5780++;
		if (super.anInt5782 >= 5000) {
			super.anInt5782 = 0;
		}
		if (this.anInt4291 > 0) {
			@Pc(49) Object local49 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
	@Override
	public void method5037(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject4;
		synchronized (this.anObject4) {
			@Pc(22) int local22;
			if (this.anInt4296 == arg0) {
				for (local22 = 0; local22 < this.anInt4296; local22++) {
					this.method3684(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt4296; local22++) {
					this.aClass141_Sub1Array1[local22].method5299();
				}
				this.anInt4296 = arg0;
				this.aClass141_Sub1Array1 = new Class141_Sub1[this.anInt4296];
				for (@Pc(66) int local66 = 0; local66 < this.anInt4296; local66++) {
					this.aClass141_Sub1Array1[local66] = new Class141_Sub1(this);
					this.aClass141_Sub1Array1[local66].method5297();
					this.method3684(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(BI)V")
	@Override
	public void method5047(@OriginalArg(1) int arg0) {
		@Pc(13) Object local13 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray68[super.anInt5782] = (byte) arg0;
			super.anInt5782++;
			super.anInt5774++;
			super.anInt5780++;
			if (super.anInt5782 >= 5000) {
				super.anInt5782 = 0;
			}
			if (this.anInt4291 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gk;B)V")
	@Override
	public void method5045(@OriginalArg(0) Class83 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray68[super.anInt5782] = 21;
			super.anObjectArray34[super.anInt5782] = arg0;
			super.anInt5782++;
			if (super.anInt5782 >= 5000) {
				super.anInt5782 = 0;
			}
			super.anInt5774++;
			super.anInt5780++;
			if (this.anInt4291 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	@Override
	public void method5043() {
		try {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				while (super.anInt5780 != 0) {
					this.anObject4.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	@Override
	public void method5041() {
		@Pc(8) Object local8 = this.anObject4;
		synchronized (this.anObject4) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4296; local12++) {
				if (this.aClass141_Sub1Array1[local12].anInt6110 >= 0) {
					this.method3682(this.aClass141_Sub1Array1[local12].anInt6110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(FIZILclient!ck;)V")
	@Override
	public void method5042(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class12 arg3) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray68[super.anInt5782] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray34[super.anInt5782] = arg3;
			super.aFloatArray28[super.anInt5782] = arg0;
			super.anInt5782++;
			super.anInt5780++;
			if (super.anInt5782 >= 5000) {
				super.anInt5782 = 0;
			}
			super.anInt5774++;
			if (this.anInt4291 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!gk;)V")
	@Override
	public void method5044(@OriginalArg(1) Class83 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray68[super.anInt5782] = 20;
			super.anObjectArray34[super.anInt5782] = arg0;
			super.anInt5782++;
			super.anInt5774++;
			if (super.anInt5782 >= 5000) {
				super.anInt5782 = 0;
			}
			super.anInt5780++;
			if (this.anInt4291 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}
}
