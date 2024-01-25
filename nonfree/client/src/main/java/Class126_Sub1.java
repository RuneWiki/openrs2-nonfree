import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class126_Sub1 extends Class126 {

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject10 = new Object();

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	private int anInt3965 = 0;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "[Lclient!qj;")
	private Class253_Sub1[] aClass253_Sub1Array1 = new Class253_Sub1[0];

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method7342() {
		try {
			@Pc(8) Object local8 = this.anObject10;
			synchronized (this.anObject10) {
				while (super.anInt8919 != 0) {
					this.anObject10.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!bo;)V")
	@Override
	public void method7343(@OriginalArg(1) Class37 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.anInt8917--;
			if (super.anInt8917 < 0) {
				super.anInt8917 = 4999;
			}
			super.aByteArray112[super.anInt8917] = 21;
			super.anObjectArray36[super.anInt8917] = arg0;
			super.anInt8919++;
			super.anInt8915++;
			if (this.anInt3965 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	@Override
	public void method7340(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray112[super.anInt8918] = (byte) arg0;
			super.anInt8918++;
			if (super.anInt8918 >= 5000) {
				super.anInt8918 = 0;
			}
			super.anInt8919++;
			super.anInt8915++;
			if (this.anInt3965 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!bo;)V")
	@Override
	public void method7344(@OriginalArg(1) Class37 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray112[super.anInt8918] = 20;
			super.anObjectArray36[super.anInt8918] = arg0;
			super.anInt8918++;
			super.anInt8915++;
			super.anInt8919++;
			if (super.anInt8918 >= 5000) {
				super.anInt8918 = 0;
			}
			if (this.anInt3965 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	private void method3478(@OriginalArg(1) int arg0) {
		super.aByteArray112[super.anInt8918] = (byte) arg0;
		super.anInt8918++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
		super.anInt8919++;
		super.anInt8915++;
		if (this.anInt3965 > 0) {
			@Pc(50) Object local50 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(FIILclient!sa;Z)V")
	@Override
	public void method7339(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class215 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray112[super.anInt8918] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt8918] = arg2;
			super.aFloatArray69[super.anInt8918] = arg0;
			super.anInt8918++;
			if (super.anInt8918 >= 5000) {
				super.anInt8918 = 0;
			}
			super.anInt8919++;
			super.anInt8915++;
			if (this.anInt3965 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!bo;Z)V")
	@Override
	public void method7347(@OriginalArg(0) Class37 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray112[super.anInt8918] = 21;
			super.anObjectArray36[super.anInt8918] = arg0;
			super.anInt8918++;
			super.anInt8915++;
			super.anInt8919++;
			if (super.anInt8918 >= 5000) {
				super.anInt8918 = 0;
			}
			if (this.anInt3965 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method7341() {
		@Pc(13) Object local13 = this.anObject10;
		synchronized (this.anObject10) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt3967; local17++) {
				if (this.aClass253_Sub1Array1[local17].anInt7560 >= 0) {
					this.method3481(this.aClass253_Sub1Array1[local17].anInt7560);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!qj;I)V")
	public void method3480(@OriginalArg(0) Class253_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(16) float local16 = 0.0F;
			@Pc(19) Object local19 = this.anObject10;
			@Pc(47) byte local47;
			synchronized (this.anObject10) {
				while (super.anInt8915 == 0) {
					this.anInt3965++;
					this.anObject10.wait();
					this.anInt3965--;
				}
				local47 = super.aByteArray112[super.anInt8917];
				if (arg0.anInt7560 >= 0) {
					if (local47 < 0 || local47 > 3) {
						local7 = true;
					}
				} else if (local47 >= 0 && local47 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject14 = super.anObjectArray36[super.anInt8917];
					local16 = super.aFloatArray69[super.anInt8917];
					super.anObjectArray36[super.anInt8917] = null;
					super.anInt8917++;
					super.anInt8915--;
					if (super.anInt8917 >= 5000) {
						super.anInt8917 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt7560 < 0) {
				if (local47 >= 0 && local47 <= 3) {
					arg0.anInt7560 = local47;
					Static286.aClass42_5.method5804(local47);
				}
			} else if (local47 == 21) {
				Static265.method4440(arg0, (Class37) arg0.anObject14);
			} else if (local47 == 20) {
				@Pc(159) Class37 local159 = (Class37) arg0.anObject14;
				if (local159.aClass30_Sub2_2 != null) {
					local159.aClass30_Sub2_2.method7903(Static286.aClass42_5);
				}
				if (local159.aClass30_Sub2_1 != null) {
					local159.aClass30_Sub2_1.method7903(Static286.aClass42_5);
				}
				if (local159.aClass30_Sub4_2 != null) {
					local159.aClass30_Sub4_2.method7903(Static286.aClass42_5);
				}
				if (local159.aClass30_Sub4_1 != null) {
					local159.aClass30_Sub4_1.method7903(Static286.aClass42_5);
				}
				if (local159.aClass30_Sub3_1 != null) {
					local159.aClass30_Sub3_1.method7903(Static286.aClass42_5);
				}
				for (@Pc(202) Class243 local202 = local159.aClass243_3; local202 != null; local202 = local202.aClass243_11) {
					local202.aClass30_Sub1_2.method7903(Static286.aClass42_5);
				}
			} else if (local47 >= 30 && local47 <= 33) {
				Static286.aClass42_5.la(3000.0F, local16 * 1.5F);
				((Class215) arg0.anObject14).method7835(Static176.anInt3987, Static412.anInt7717, Static307.anInt5970, Static243.aBooleanArrayArray6, local47 - 30 == 0);
			} else if (local47 >= 40 && local47 <= 43) {
				Static286.aClass42_5.la(3000.0F, local16 * 1.5F);
				((Class215) arg0.anObject14).method7835(Static176.anInt3987, Static412.anInt7717, Static307.anInt5970, Static143.aBooleanArrayArray3, local47 - 40 == 0);
			} else if (local47 == 22) {
				Static286.aClass42_5.q(-1, 1583160, 40, 127);
			} else if (local47 == 23) {
				Static286.aClass42_5.xa();
			} else if (local47 == 24) {
				Static286.aClass42_5.method5824(0, null);
			} else if (local47 >= 10 && local47 <= 13) {
				Static286.aClass42_5.method5837(arg0.anInt7560);
				arg0.anInt7560 = -1;
			}
		} catch (@Pc(338) Exception local338) {
		} finally {
			@Pc(344) Object local344 = null;
			if (local7) {
				@Pc(404) Object local404 = this.anObject10;
				synchronized (this.anObject10) {
					super.anInt8919--;
					if (super.anInt8919 == 0) {
						this.anObject10.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	@Override
	public void method7345(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject10;
		synchronized (this.anObject10) {
			@Pc(18) int local18;
			if (this.anInt3967 == arg0) {
				for (local18 = 0; local18 < this.anInt3967; local18++) {
					this.method3478(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt3967; local18++) {
					this.aClass253_Sub1Array1[local18].method6314();
				}
				this.anInt3967 = arg0;
				this.aClass253_Sub1Array1 = new Class253_Sub1[this.anInt3967];
				for (@Pc(73) int local73 = 0; local73 < this.anInt3967; local73++) {
					this.aClass253_Sub1Array1[local73] = new Class253_Sub1(this);
					this.aClass253_Sub1Array1[local73].method6315();
					this.method3478(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	private void method3481(@OriginalArg(0) int arg0) {
		super.aByteArray112[super.anInt8918] = (byte) (arg0 + 10);
		super.anInt8918++;
		super.anInt8915++;
		super.anInt8919++;
		if (super.anInt8918 >= 5000) {
			super.anInt8918 = 0;
		}
		if (this.anInt3965 > 0) {
			@Pc(52) Object local52 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}
}
