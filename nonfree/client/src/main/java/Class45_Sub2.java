import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!tu", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject10 = new Object();

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "[Lclient!bj;")
	private Class25_Sub1[] aClass25_Sub1Array1 = new Class25_Sub1[0];

	@OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
	private int anInt6528 = 0;

	@OriginalMember(owner = "client!tu", name = "D", descriptor = "I")
	private int anInt6529 = 0;

	static {
		new Class240("", 76);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BI)V")
	@Override
	public void method5054(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray80[super.anInt6514] = (byte) arg0;
			super.anInt6514++;
			super.anInt6509++;
			if (super.anInt6514 >= 5000) {
				super.anInt6514 = 0;
			}
			super.anInt6515++;
			if (this.anInt6529 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!wr;)V")
	@Override
	public void method5053(@OriginalArg(1) Class270 arg0) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray80[super.anInt6514] = 21;
			super.anObjectArray35[super.anInt6514] = arg0;
			super.anInt6514++;
			if (super.anInt6514 >= 5000) {
				super.anInt6514 = 0;
			}
			super.anInt6515++;
			super.anInt6509++;
			if (this.anInt6529 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ya;IZZF)V")
	@Override
	public void method5052(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray80[super.anInt6514] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt6514] = arg0;
			super.aFloatArray31[super.anInt6514] = arg3;
			super.anInt6514++;
			super.anInt6515++;
			super.anInt6509++;
			if (super.anInt6514 >= 5000) {
				super.anInt6514 = 0;
			}
			if (this.anInt6529 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method5059() {
		try {
			@Pc(4) Object local4 = this.anObject10;
			synchronized (this.anObject10) {
				while (true) {
					if (super.anInt6515 == 0) {
						break;
					}
					this.anObject10.wait();
				}
			}
		} catch (@Pc(21) Exception local21) {
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	private void method5060(@OriginalArg(0) int arg0) {
		super.aByteArray80[super.anInt6514] = (byte) arg0;
		super.anInt6514++;
		super.anInt6515++;
		super.anInt6509++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
		if (this.anInt6529 > 0) {
			@Pc(47) Object local47 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!bj;)V")
	public void method5061(@OriginalArg(1) Class25_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject10;
			@Pc(42) byte local42;
			synchronized (this.anObject10) {
				while (super.anInt6509 == 0) {
					this.anInt6529++;
					this.anObject10.wait();
					this.anInt6529--;
				}
				local42 = super.aByteArray80[super.anInt6512];
				if (arg0.anInt615 >= 0) {
					if (local42 < 0 || local42 > 3) {
						local7 = true;
					}
				} else if (local42 >= 0 && local42 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray35[super.anInt6512];
					local11 = super.aFloatArray31[super.anInt6512];
					super.anObjectArray35[super.anInt6512] = null;
					super.anInt6512++;
					super.anInt6509--;
					if (super.anInt6512 >= 5000) {
						super.anInt6512 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt615 < 0) {
				if (local42 >= 0 && local42 <= 3) {
					arg0.anInt615 = local42;
					Static307.aClass163_7.method5547(local42);
				}
			} else if (local42 == 21) {
				Static206.method2750(arg0, (Class270) arg0.anObject2);
			} else if (local42 == 20) {
				@Pc(169) Class270 local169 = (Class270) arg0.anObject2;
				if (local169.aClass3_Sub2_3 != null) {
					local169.aClass3_Sub2_3.method5285(Static307.aClass163_7);
				}
				if (local169.aClass3_Sub2_2 != null) {
					local169.aClass3_Sub2_2.method5285(Static307.aClass163_7);
				}
				if (local169.aClass3_Sub3_2 != null) {
					local169.aClass3_Sub3_2.method5285(Static307.aClass163_7);
				}
				if (local169.aClass3_Sub3_3 != null) {
					local169.aClass3_Sub3_3.method5285(Static307.aClass163_7);
				}
				if (local169.aClass3_Sub5_2 != null) {
					local169.aClass3_Sub5_2.method5285(Static307.aClass163_7);
				}
				for (@Pc(212) Class241 local212 = local169.aClass241_2; local212 != null; local212 = local212.aClass241_1) {
					local212.aClass3_Sub4_2.method5285(Static307.aClass163_7);
				}
			} else if (local42 >= 30 && local42 <= 33) {
				Static307.aClass163_7.da(3000.0F, local11 * 1.5F);
				((Class162) arg0.anObject2).method3277(Static352.anInt5986, Static411.anInt6740, Static453.anInt7270, Static356.aBooleanArrayArray6, local42 - 30 == 0);
			} else if (local42 >= 40 && local42 <= 43) {
				Static307.aClass163_7.da(3000.0F, local11 * 1.5F);
				((Class162) arg0.anObject2).method3277(Static352.anInt5986, Static411.anInt6740, Static453.anInt7270, Static19.aBooleanArrayArray1, local42 - 40 == 0);
			} else if (local42 == 22) {
				Static307.aClass163_7.s(-1, 1583160, 40, 127);
			} else if (local42 == 23) {
				Static307.aClass163_7.n();
			} else if (local42 == 24) {
				Static307.aClass163_7.method5536(0, null);
			} else if (local42 >= 10 && local42 <= 13) {
				Static307.aClass163_7.method5496(arg0.anInt615);
				arg0.anInt615 = -1;
			}
		} catch (@Pc(339) Exception local339) {
		} finally {
			@Pc(345) Object local345 = null;
			if (local7) {
				@Pc(405) Object local405 = this.anObject10;
				synchronized (this.anObject10) {
					super.anInt6515--;
					if (super.anInt6515 == 0) {
						this.anObject10.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	@Override
	public void method5057() {
		@Pc(8) Object local8 = this.anObject10;
		synchronized (this.anObject10) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt6528; local12++) {
				if (this.aClass25_Sub1Array1[local12].anInt615 >= 0) {
					this.method5064(this.aClass25_Sub1Array1[local12].anInt615);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!wr;I)V")
	@Override
	public void method5051(@OriginalArg(0) Class270 arg0) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray80[super.anInt6514] = 20;
			super.anObjectArray35[super.anInt6514] = arg0;
			super.anInt6514++;
			if (super.anInt6514 >= 5000) {
				super.anInt6514 = 0;
			}
			super.anInt6515++;
			super.anInt6509++;
			if (this.anInt6529 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)V")
	@Override
	public void method5056(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject10;
		synchronized (this.anObject10) {
			@Pc(18) int local18;
			if (this.anInt6528 == arg0) {
				for (local18 = 0; local18 < this.anInt6528; local18++) {
					this.method5060(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt6528; local18++) {
					this.aClass25_Sub1Array1[local18].method477();
				}
				this.anInt6528 = arg0;
				this.aClass25_Sub1Array1 = new Class25_Sub1[this.anInt6528];
				for (@Pc(68) int local68 = 0; local68 < this.anInt6528; local68++) {
					this.aClass25_Sub1Array1[local68] = new Class25_Sub1(this);
					this.aClass25_Sub1Array1[local68].method479();
					this.method5060(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)V")
	private void method5064(@OriginalArg(0) int arg0) {
		super.aByteArray80[super.anInt6514] = (byte) (arg0 + 10);
		super.anInt6514++;
		super.anInt6515++;
		super.anInt6509++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
		if (this.anInt6529 > 0) {
			@Pc(54) Object local54 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!wr;)V")
	@Override
	public void method5058(@OriginalArg(1) Class270 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.anInt6512--;
			if (super.anInt6512 < 0) {
				super.anInt6512 = 4999;
			}
			super.aByteArray80[super.anInt6512] = 21;
			super.anObjectArray35[super.anInt6512] = arg0;
			super.anInt6515++;
			super.anInt6509++;
			if (this.anInt6529 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}
}
