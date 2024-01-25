import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class158_Sub2 extends Class158 {

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "Ljava/lang/Object;")
	private final Object anObject22 = new Object();

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "[Lclient!ab;")
	private Class2_Sub1[] aClass2_Sub1Array1 = new Class2_Sub1[0];

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
	private int anInt6315 = 0;

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
	private int anInt6314 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
	private void method5360(@OriginalArg(1) int arg0) {
		super.aByteArray79[super.anInt6301] = (byte) (arg0 + 10);
		super.anInt6301++;
		super.anInt6300++;
		super.anInt6298++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
		if (this.anInt6315 > 0) {
			@Pc(50) Object local50 = this.anObject22;
			synchronized (this.anObject22) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Lclient!af;I)V")
	@Override
	public void method5355(@OriginalArg(0) Class9 arg0) {
		@Pc(6) Object local6 = this.anObject22;
		synchronized (this.anObject22) {
			super.anInt6302--;
			if (super.anInt6302 < 0) {
				super.anInt6302 = 4999;
			}
			super.aByteArray79[super.anInt6302] = 21;
			super.anObjectArray35[super.anInt6302] = arg0;
			super.anInt6298++;
			super.anInt6300++;
			if (this.anInt6315 > 0) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public void method5354(@OriginalArg(0) Class9 arg0) {
		@Pc(2) Object local2 = this.anObject22;
		synchronized (this.anObject22) {
			super.aByteArray79[super.anInt6301] = 20;
			super.anObjectArray35[super.anInt6301] = arg0;
			super.anInt6301++;
			super.anInt6298++;
			super.anInt6300++;
			if (super.anInt6301 >= 5000) {
				super.anInt6301 = 0;
			}
			if (this.anInt6315 > 0) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!d;IZI)V")
	@Override
	public void method5358(@OriginalArg(0) Class60 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Object local6 = this.anObject22;
		synchronized (this.anObject22) {
			super.aByteArray79[super.anInt6301] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray35[super.anInt6301] = arg0;
			super.anInt6301++;
			super.anInt6300++;
			super.anInt6298++;
			if (super.anInt6301 >= 5000) {
				super.anInt6301 = 0;
			}
			if (this.anInt6315 > 0) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!af;)V")
	@Override
	public void method5353(@OriginalArg(1) Class9 arg0) {
		@Pc(2) Object local2 = this.anObject22;
		synchronized (this.anObject22) {
			super.aByteArray79[super.anInt6301] = 21;
			super.anObjectArray35[super.anInt6301] = arg0;
			super.anInt6301++;
			if (super.anInt6301 >= 5000) {
				super.anInt6301 = 0;
			}
			super.anInt6298++;
			super.anInt6300++;
			if (this.anInt6315 > 0) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5352() {
		try {
			@Pc(4) Object local4 = this.anObject22;
			synchronized (this.anObject22) {
				while (true) {
					if (super.anInt6298 == 0) {
						break;
					}
					this.anObject22.wait();
				}
			}
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5359(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject22;
		synchronized (this.anObject22) {
			@Pc(22) int local22;
			if (arg0 == this.anInt6314) {
				for (local22 = 0; local22 < this.anInt6314; local22++) {
					this.method5362(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt6314; local22++) {
					this.aClass2_Sub1Array1[local22].method48();
				}
				this.anInt6314 = arg0;
				this.aClass2_Sub1Array1 = new Class2_Sub1[this.anInt6314];
				for (@Pc(77) int local77 = 0; local77 < this.anInt6314; local77++) {
					this.aClass2_Sub1Array1[local77] = new Class2_Sub1(this);
					this.aClass2_Sub1Array1[local77].method49();
					this.method5362(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ab;B)V")
	public void method5361(@OriginalArg(0) Class2_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(20) Object local20 = this.anObject22;
			@Pc(48) byte local48;
			synchronized (this.anObject22) {
				while (super.anInt6300 == 0) {
					this.anInt6315++;
					this.anObject22.wait();
					this.anInt6315--;
				}
				local48 = super.aByteArray79[super.anInt6302];
				if (arg0.anInt32 >= 0) {
					if (local48 < 0 || local48 > 3) {
						local7 = true;
					}
				} else if (local48 >= 0 && local48 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray35[super.anInt6302];
					super.anObjectArray35[super.anInt6302] = null;
					super.anInt6302++;
					if (super.anInt6302 >= 5000) {
						super.anInt6302 = 0;
					}
					super.anInt6300--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt32 >= 0) {
				if (local48 == 21) {
					Static75.method7891(arg0, (Class9) arg0.anObject2);
				} else if (local48 == 20) {
					@Pc(146) Class9 local146 = (Class9) arg0.anObject2;
					if (local146.aClass29_Sub5_1 != null) {
						local146.aClass29_Sub5_1.method7544(Static432.aClass121_14);
					}
					if (local146.aClass29_Sub5_2 != null) {
						local146.aClass29_Sub5_2.method7544(Static432.aClass121_14);
					}
					if (local146.aClass29_Sub1_2 != null) {
						local146.aClass29_Sub1_2.method7544(Static432.aClass121_14);
					}
					if (local146.aClass29_Sub1_1 != null) {
						local146.aClass29_Sub1_1.method7544(Static432.aClass121_14);
					}
					if (local146.aClass29_Sub3_1 != null) {
						local146.aClass29_Sub3_1.method7544(Static432.aClass121_14);
					}
					for (@Pc(189) Class66 local189 = local146.aClass66_1; local189 != null; local189 = local189.aClass66_2) {
						local189.aClass29_Sub2_1.method7544(Static432.aClass121_14);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					((Class60) arg0.anObject2).method7896(Static325.anInt5850, Static486.anInt8128, Static387.anInt6907, Static6.aBooleanArrayArray3, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					((Class60) arg0.anObject2).method7896(Static325.anInt5850, Static486.anInt8128, Static387.anInt6907, Static286.aBooleanArrayArray5, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static432.aClass121_14.AA(-1, 1583160, 40, 127);
				} else if (local48 == 23) {
					Static432.aClass121_14.k();
				} else if (local48 == 24) {
					Static432.aClass121_14.method7158(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static432.aClass121_14.method7089(arg0.anInt32);
					arg0.anInt32 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt32 = local48;
				Static432.aClass121_14.method7105(local48);
			}
		} catch (@Pc(317) Exception local317) {
		} finally {
			@Pc(323) Object local323 = null;
			if (local7) {
				@Pc(380) Object local380 = this.anObject22;
				synchronized (this.anObject22) {
					super.anInt6298--;
					if (super.anInt6298 == 0) {
						this.anObject22.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	private void method5362(@OriginalArg(0) int arg0) {
		super.aByteArray79[super.anInt6301] = (byte) arg0;
		super.anInt6301++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
		super.anInt6298++;
		super.anInt6300++;
		if (this.anInt6315 > 0) {
			@Pc(48) Object local48 = this.anObject22;
			synchronized (this.anObject22) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5351(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject22;
		synchronized (this.anObject22) {
			super.aByteArray79[super.anInt6301] = (byte) arg0;
			super.anInt6301++;
			if (super.anInt6301 >= 5000) {
				super.anInt6301 = 0;
			}
			super.anInt6298++;
			super.anInt6300++;
			if (this.anInt6315 > 0) {
				this.anObject22.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public void method5357() {
		@Pc(2) Object local2 = this.anObject22;
		synchronized (this.anObject22) {
			for (@Pc(6) int local6 = 0; local6 < this.anInt6314; local6++) {
				if (this.aClass2_Sub1Array1[local6].anInt32 >= 0) {
					this.method5360(this.aClass2_Sub1Array1[local6].anInt32);
				}
			}
		}
	}
}
