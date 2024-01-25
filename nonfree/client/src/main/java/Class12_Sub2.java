import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Ljava/lang/Object;")
	private final Object anObject3 = new Object();

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
	private int anInt3623 = 0;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[Lclient!ui;")
	private Class135_Sub1[] aClass135_Sub1Array1 = new Class135_Sub1[0];

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
	private int anInt3624 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	@Override
	public void method3103(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray72[super.anInt3611] = (byte) arg0;
			super.anInt3611++;
			super.anInt3608++;
			if (super.anInt3611 >= 5000) {
				super.anInt3611 = 0;
			}
			super.anInt3612++;
			if (this.anInt3623 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!sn;I)V")
	@Override
	public void method3101(@OriginalArg(0) Class227 arg0) {
		@Pc(2) Object local2 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray72[super.anInt3611] = 21;
			super.anObjectArray35[super.anInt3611] = arg0;
			super.anInt3611++;
			super.anInt3612++;
			super.anInt3608++;
			if (super.anInt3611 >= 5000) {
				super.anInt3611 = 0;
			}
			if (this.anInt3623 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V")
	@Override
	public void method3108(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject3;
		synchronized (this.anObject3) {
			@Pc(22) int local22;
			if (arg0 == this.anInt3624) {
				for (local22 = 0; local22 < this.anInt3624; local22++) {
					this.method3114(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt3624; local22++) {
					this.aClass135_Sub1Array1[local22].method5696();
				}
				this.anInt3624 = arg0;
				this.aClass135_Sub1Array1 = new Class135_Sub1[this.anInt3624];
				for (@Pc(66) int local66 = 0; local66 < this.anInt3624; local66++) {
					this.aClass135_Sub1Array1[local66] = new Class135_Sub1(this);
					this.aClass135_Sub1Array1[local66].method5695();
					this.method3114(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	@Override
	public void method3107() {
		@Pc(4) Object local4 = this.anObject3;
		synchronized (this.anObject3) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt3624; local8++) {
				if (this.aClass135_Sub1Array1[local8].anInt6982 >= 0) {
					this.method3116(this.aClass135_Sub1Array1[local8].anInt6982);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLclient!ui;)V")
	public void method3113(@OriginalArg(1) Class135_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject3;
			@Pc(45) byte local45;
			synchronized (this.anObject3) {
				while (super.anInt3608 == 0) {
					this.anInt3623++;
					this.anObject3.wait();
					this.anInt3623--;
				}
				local45 = super.aByteArray72[super.anInt3613];
				if (arg0.anInt6982 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject11 = super.anObjectArray35[super.anInt3613];
					local11 = super.aFloatArray20[super.anInt3613];
					super.anObjectArray35[super.anInt3613] = null;
					super.anInt3613++;
					if (super.anInt3613 >= 5000) {
						super.anInt3613 = 0;
					}
					super.anInt3608--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6982 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt6982 = local45;
					Static157.aClass167_7.method6000(local45);
				}
			} else if (local45 == 21) {
				Static442.method6042(arg0, (Class227) arg0.anObject11);
			} else if (local45 == 20) {
				@Pc(168) Class227 local168 = (Class227) arg0.anObject11;
				if (local168.aClass1_Sub3_3 != null) {
					local168.aClass1_Sub3_3.method6241(Static157.aClass167_7);
				}
				if (local168.aClass1_Sub3_2 != null) {
					local168.aClass1_Sub3_2.method6241(Static157.aClass167_7);
				}
				if (local168.aClass1_Sub1_1 != null) {
					local168.aClass1_Sub1_1.method6241(Static157.aClass167_7);
				}
				if (local168.aClass1_Sub1_2 != null) {
					local168.aClass1_Sub1_2.method6241(Static157.aClass167_7);
				}
				if (local168.aClass1_Sub4_2 != null) {
					local168.aClass1_Sub4_2.method6241(Static157.aClass167_7);
				}
				for (@Pc(211) Class114 local211 = local168.aClass114_2; local211 != null; local211 = local211.aClass114_1) {
					local211.aClass1_Sub2_1.method6241(Static157.aClass167_7);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static157.aClass167_7.PA(3000.0F, local11 * 1.5F);
				((Class55) arg0.anObject11).method3816(Static366.anInt6203, Static465.anInt3909, Static24.anInt2908, Static39.aBooleanArrayArray1, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static157.aClass167_7.PA(3000.0F, local11 * 1.5F);
				((Class55) arg0.anObject11).method3816(Static366.anInt6203, Static465.anInt3909, Static24.anInt2908, Static111.aBooleanArrayArray4, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static157.aClass167_7.q(-1, 1583160, 40, 127);
			} else if (local45 == 23) {
				Static157.aClass167_7.r();
			} else if (local45 == 24) {
				Static157.aClass167_7.method5985(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static157.aClass167_7.method5983(arg0.anInt6982);
				arg0.anInt6982 = -1;
			}
		} catch (@Pc(342) Exception local342) {
		} finally {
			@Pc(348) Object local348 = null;
			if (local7) {
				@Pc(408) Object local408 = this.anObject3;
				synchronized (this.anObject3) {
					super.anInt3612--;
					if (super.anInt3612 == 0) {
						this.anObject3.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
	@Override
	public void method3111() {
		try {
			@Pc(2) Object local2 = this.anObject3;
			synchronized (this.anObject3) {
				while (true) {
					if (super.anInt3612 == 0) {
						break;
					}
					this.anObject3.wait();
				}
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZLclient!sn;)V")
	@Override
	public void method3109(@OriginalArg(1) Class227 arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.anInt3613--;
			if (super.anInt3613 < 0) {
				super.anInt3613 = 4999;
			}
			super.aByteArray72[super.anInt3613] = 21;
			super.anObjectArray35[super.anInt3613] = arg0;
			super.anInt3612++;
			super.anInt3608++;
			if (this.anInt3623 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(II)V")
	private void method3114(@OriginalArg(0) int arg0) {
		super.aByteArray72[super.anInt3611] = (byte) arg0;
		super.anInt3611++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
		super.anInt3608++;
		super.anInt3612++;
		if (this.anInt3623 > 0) {
			@Pc(45) Object local45 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZFIILclient!o;)V")
	@Override
	public void method3110(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class55 arg3) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray72[super.anInt3611] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray35[super.anInt3611] = arg3;
			super.aFloatArray20[super.anInt3611] = arg1;
			super.anInt3611++;
			if (super.anInt3611 >= 5000) {
				super.anInt3611 = 0;
			}
			super.anInt3608++;
			super.anInt3612++;
			if (this.anInt3623 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(Lclient!sn;I)V")
	@Override
	public void method3105(@OriginalArg(0) Class227 arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray72[super.anInt3611] = 20;
			super.anObjectArray35[super.anInt3611] = arg0;
			super.anInt3611++;
			if (super.anInt3611 >= 5000) {
				super.anInt3611 = 0;
			}
			super.anInt3612++;
			super.anInt3608++;
			if (this.anInt3623 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(II)V")
	private void method3116(@OriginalArg(0) int arg0) {
		super.aByteArray72[super.anInt3611] = (byte) (arg0 + 10);
		super.anInt3611++;
		super.anInt3608++;
		super.anInt3612++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
		if (this.anInt3623 > 0) {
			@Pc(49) Object local49 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}
}
