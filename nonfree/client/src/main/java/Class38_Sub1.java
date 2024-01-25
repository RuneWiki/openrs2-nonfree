import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject3 = new Object();

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "[Lclient!nc;")
	private Class88_Sub1[] aClass88_Sub1Array1 = new Class88_Sub1[0];

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	private int anInt726 = 0;

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
	private int anInt724 = 0;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
	private void method576(@OriginalArg(1) int arg0) {
		super.aByteArray82[super.anInt4723] = (byte) (arg0 + 10);
		super.anInt4723++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
		super.anInt4720++;
		super.anInt4725++;
		if (this.anInt726 > 0) {
			@Pc(45) Object local45 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method4170() {
		try {
			@Pc(8) Object local8 = this.anObject3;
			synchronized (this.anObject3) {
				while (super.anInt4725 != 0) {
					this.anObject3.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
	@Override
	public void method4167(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray82[super.anInt4723] = (byte) arg0;
			super.anInt4723++;
			if (super.anInt4723 >= 5000) {
				super.anInt4723 = 0;
			}
			super.anInt4720++;
			super.anInt4725++;
			if (this.anInt726 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!jd;Z)V")
	@Override
	public void method4163(@OriginalArg(0) Class106 arg0) {
		@Pc(12) Object local12 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray82[super.anInt4723] = 21;
			super.anObjectArray35[super.anInt4723] = arg0;
			super.anInt4723++;
			if (super.anInt4723 >= 5000) {
				super.anInt4723 = 0;
			}
			super.anInt4720++;
			super.anInt4725++;
			if (this.anInt726 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!nc;I)V")
	public void method578(@OriginalArg(0) Class88_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject3;
			@Pc(48) byte local48;
			synchronized (this.anObject3) {
				while (super.anInt4720 == 0) {
					this.anInt726++;
					this.anObject3.wait();
					this.anInt726--;
				}
				local48 = super.aByteArray82[super.anInt4722];
				if (arg0.anInt4172 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject5 = super.anObjectArray35[super.anInt4722];
					local17 = super.aFloatArray23[super.anInt4722];
					super.anObjectArray35[super.anInt4722] = null;
					super.anInt4722++;
					super.anInt4720--;
					if (super.anInt4722 >= 5000) {
						super.anInt4722 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt4172 >= 0) {
				if (local48 == 21) {
					Static343.method5591(arg0, (Class106) arg0.anObject5);
				} else if (local48 == 20) {
					@Pc(255) Class106 local255 = (Class106) arg0.anObject5;
					if (local255.aClass67_Sub2_1 != null) {
						local255.aClass67_Sub2_1.method5395(Static174.aClass129_5);
					}
					if (local255.aClass67_Sub2_2 != null) {
						local255.aClass67_Sub2_2.method5395(Static174.aClass129_5);
					}
					if (local255.aClass67_Sub1_1 != null) {
						local255.aClass67_Sub1_1.method5395(Static174.aClass129_5);
					}
					if (local255.aClass67_Sub1_2 != null) {
						local255.aClass67_Sub1_2.method5395(Static174.aClass129_5);
					}
					if (local255.aClass67_Sub4_1 != null) {
						local255.aClass67_Sub4_1.method5395(Static174.aClass129_5);
					}
					for (@Pc(300) Class64 local300 = local255.aClass64_4; local300 != null; local300 = local300.aClass64_2) {
						local300.aClass67_Sub3_1.method5395(Static174.aClass129_5);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					Static174.aClass129_5.method4986(3000.0F, local17 * 1.5F);
					((Class77) arg0.anObject5).method4134(Static6.anInt4021, Static104.anInt1932, Static209.anInt4263, Static8.aBooleanArrayArray1, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					Static174.aClass129_5.method4986(3000.0F, local17 * 1.5F);
					((Class77) arg0.anObject5).method4134(Static6.anInt4021, Static104.anInt1932, Static209.anInt4263, Static195.aBooleanArrayArray6, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static174.aClass129_5.method5019();
				} else if (local48 == 23) {
					Static174.aClass129_5.method4950();
				} else if (local48 == 24) {
					Static174.aClass129_5.method4963(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static174.aClass129_5.method4924(arg0.anInt4172);
					arg0.anInt4172 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt4172 = local48;
				Static174.aClass129_5.method4953(local48);
			}
		} catch (@Pc(331) Exception local331) {
		} finally {
			@Pc(337) Object local337 = null;
			if (local7) {
				@Pc(421) Object local421 = this.anObject3;
				synchronized (this.anObject3) {
					super.anInt4725--;
					if (super.anInt4725 == 0) {
						this.anObject3.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
	private void method579(@OriginalArg(0) int arg0) {
		super.aByteArray82[super.anInt4723] = (byte) arg0;
		super.anInt4723++;
		super.anInt4725++;
		super.anInt4720++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
		if (this.anInt726 > 0) {
			@Pc(44) Object local44 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!jd;)V")
	@Override
	public void method4164(@OriginalArg(1) Class106 arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray82[super.anInt4723] = 20;
			super.anObjectArray35[super.anInt4723] = arg0;
			super.anInt4723++;
			super.anInt4720++;
			super.anInt4725++;
			if (super.anInt4723 >= 5000) {
				super.anInt4723 = 0;
			}
			if (this.anInt726 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	@Override
	public void method4168(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject3;
		synchronized (this.anObject3) {
			@Pc(18) int local18;
			if (this.anInt724 == arg0) {
				for (local18 = 0; local18 < this.anInt724; local18++) {
					this.method579(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt724; local18++) {
					this.aClass88_Sub1Array1[local18].method3651();
				}
				this.anInt724 = arg0;
				this.aClass88_Sub1Array1 = new Class88_Sub1[this.anInt724];
				for (@Pc(62) int local62 = 0; local62 < this.anInt724; local62++) {
					this.aClass88_Sub1Array1[local62] = new Class88_Sub1(this);
					this.aClass88_Sub1Array1[local62].method3649();
					this.method579(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4169() {
		@Pc(4) Object local4 = this.anObject3;
		synchronized (this.anObject3) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt724; local15++) {
				if (this.aClass88_Sub1Array1[local15].anInt4172 >= 0) {
					this.method576(this.aClass88_Sub1Array1[local15].anInt4172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(FILclient!ij;ZI)V")
	@Override
	public void method4165(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Object local2 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray82[super.anInt4723] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt4723] = arg2;
			super.aFloatArray23[super.anInt4723] = arg0;
			super.anInt4723++;
			super.anInt4725++;
			super.anInt4720++;
			if (super.anInt4723 >= 5000) {
				super.anInt4723 = 0;
			}
			if (this.anInt726 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!jd;)V")
	@Override
	public void method4166(@OriginalArg(1) Class106 arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.anInt4722--;
			if (super.anInt4722 < 0) {
				super.anInt4722 = 4999;
			}
			super.aByteArray82[super.anInt4722] = 21;
			super.anObjectArray35[super.anInt4722] = arg0;
			super.anInt4725++;
			super.anInt4720++;
			if (this.anInt726 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}
}
