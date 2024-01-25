import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject10 = new Object();

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "[Lclient!hk;")
	private Class69_Sub1[] aClass69_Sub1Array1 = new Class69_Sub1[0];

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
	private int anInt6694 = 0;

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
	private int anInt6695 = 0;

	static {
		new Class209(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BFILclient!ta;Z)V")
	@Override
	public void method5285(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray124[super.anInt6678] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt6678] = arg2;
			super.aFloatArray49[super.anInt6678] = arg0;
			super.anInt6678++;
			if (super.anInt6678 >= 5000) {
				super.anInt6678 = 0;
			}
			super.anInt6674++;
			super.anInt6675++;
			if (this.anInt6695 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	private void method5289(@OriginalArg(0) int arg0) {
		super.aByteArray124[super.anInt6678] = (byte) arg0;
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
		super.anInt6675++;
		super.anInt6674++;
		if (this.anInt6695 > 0) {
			@Pc(52) Object local52 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	@Override
	public void method5282(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject10;
		synchronized (this.anObject10) {
			@Pc(22) int local22;
			if (this.anInt6694 == arg0) {
				for (local22 = 0; local22 < this.anInt6694; local22++) {
					this.method5289(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt6694; local22++) {
					this.aClass69_Sub1Array1[local22].method2442();
				}
				this.anInt6694 = arg0;
				this.aClass69_Sub1Array1 = new Class69_Sub1[this.anInt6694];
				for (@Pc(73) int local73 = 0; local73 < this.anInt6694; local73++) {
					this.aClass69_Sub1Array1[local73] = new Class69_Sub1(this);
					this.aClass69_Sub1Array1[local73].method2443();
					this.method5289(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V")
	private void method5291(@OriginalArg(0) int arg0) {
		super.aByteArray124[super.anInt6678] = (byte) (arg0 + 10);
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
		super.anInt6674++;
		super.anInt6675++;
		if (this.anInt6695 > 0) {
			@Pc(43) Object local43 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!hg;I)V")
	@Override
	public void method5281(@OriginalArg(0) Class106 arg0) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray124[super.anInt6678] = 21;
			super.anObjectArray36[super.anInt6678] = arg0;
			super.anInt6678++;
			super.anInt6674++;
			if (super.anInt6678 >= 5000) {
				super.anInt6678 = 0;
			}
			super.anInt6675++;
			if (this.anInt6695 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!hg;)V")
	@Override
	public void method5287(@OriginalArg(1) Class106 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray124[super.anInt6678] = 20;
			super.anObjectArray36[super.anInt6678] = arg0;
			super.anInt6678++;
			super.anInt6674++;
			super.anInt6675++;
			if (super.anInt6678 >= 5000) {
				super.anInt6678 = 0;
			}
			if (this.anInt6695 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!hk;I)V")
	public void method5294(@OriginalArg(0) Class69_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject10;
			@Pc(45) byte local45;
			synchronized (this.anObject10) {
				while (super.anInt6674 == 0) {
					this.anInt6695++;
					this.anObject10.wait();
					this.anInt6695--;
				}
				local45 = super.aByteArray124[super.anInt6677];
				if (arg0.anInt3081 >= 0) {
					if (local45 < 0 || local45 > 3) {
						local7 = true;
					}
				} else if (local45 >= 0 && local45 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject5 = super.anObjectArray36[super.anInt6677];
					local11 = super.aFloatArray49[super.anInt6677];
					super.anObjectArray36[super.anInt6677] = null;
					super.anInt6677++;
					super.anInt6674--;
					if (super.anInt6677 >= 5000) {
						super.anInt6677 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3081 >= 0) {
				if (local45 == 21) {
					Static216.method4818(arg0, (Class106) arg0.anObject5);
				} else if (local45 == 20) {
					@Pc(259) Class106 local259 = (Class106) arg0.anObject5;
					if (local259.aClass3_Sub5_1 != null) {
						local259.aClass3_Sub5_1.method5143(Static332.aClass49_10);
					}
					if (local259.aClass3_Sub5_2 != null) {
						local259.aClass3_Sub5_2.method5143(Static332.aClass49_10);
					}
					if (local259.aClass3_Sub3_1 != null) {
						local259.aClass3_Sub3_1.method5143(Static332.aClass49_10);
					}
					if (local259.aClass3_Sub3_2 != null) {
						local259.aClass3_Sub3_2.method5143(Static332.aClass49_10);
					}
					if (local259.aClass3_Sub1_2 != null) {
						local259.aClass3_Sub1_2.method5143(Static332.aClass49_10);
					}
					for (@Pc(304) Class4 local304 = local259.aClass4_3; local304 != null; local304 = local304.aClass4_1) {
						local304.aClass3_Sub2_1.method5143(Static332.aClass49_10);
					}
				} else if (local45 >= 30 && local45 <= 33) {
					Static332.aClass49_10.g(3000.0F, local11 * 1.5F);
					((Class64) arg0.anObject5).method2355(Static312.anInt5514, Static402.anInt6690, Static182.anInt3568, Static281.aBooleanArrayArray41, local45 - 30 == 0);
				} else if (local45 >= 40 && local45 <= 43) {
					Static332.aClass49_10.g(3000.0F, local11 * 1.5F);
					((Class64) arg0.anObject5).method2355(Static312.anInt5514, Static402.anInt6690, Static182.anInt3568, Static223.aBooleanArrayArray19, local45 - 40 == 0);
				} else if (local45 == 22) {
					Static332.aClass49_10.AA(-1, 1583160, 40, 127);
				} else if (local45 == 23) {
					Static332.aClass49_10.l();
				} else if (local45 == 24) {
					Static332.aClass49_10.method4428(0, null);
				} else if (local45 >= 10 && local45 <= 13) {
					Static332.aClass49_10.method4481(arg0.anInt3081);
					arg0.anInt3081 = -1;
				}
			} else if (local45 >= 0 && local45 <= 3) {
				arg0.anInt3081 = local45;
				Static332.aClass49_10.method4407(local45);
			}
		} catch (@Pc(341) Exception local341) {
		} finally {
			@Pc(347) Object local347 = null;
			if (local7) {
				@Pc(412) Object local412 = this.anObject10;
				synchronized (this.anObject10) {
					super.anInt6675--;
					if (super.anInt6675 == 0) {
						this.anObject10.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!hg;Z)V")
	@Override
	public void method5284(@OriginalArg(0) Class106 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.anInt6677--;
			if (super.anInt6677 < 0) {
				super.anInt6677 = 4999;
			}
			super.aByteArray124[super.anInt6677] = 21;
			super.anObjectArray36[super.anInt6677] = arg0;
			super.anInt6674++;
			super.anInt6675++;
			if (this.anInt6695 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	@Override
	public void method5288() {
		try {
			@Pc(2) Object local2 = this.anObject10;
			synchronized (this.anObject10) {
				while (true) {
					if (super.anInt6675 == 0) {
						break;
					}
					this.anObject10.wait();
				}
			}
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	@Override
	public void method5286() {
		@Pc(14) Object local14 = this.anObject10;
		synchronized (this.anObject10) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6694; local18++) {
				if (this.aClass69_Sub1Array1[local18].anInt3081 >= 0) {
					this.method5291(this.aClass69_Sub1Array1[local18].anInt3081);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)V")
	@Override
	public void method5283(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray124[super.anInt6678] = (byte) arg0;
			super.anInt6678++;
			super.anInt6675++;
			super.anInt6674++;
			if (super.anInt6678 >= 5000) {
				super.anInt6678 = 0;
			}
			if (this.anInt6695 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}
}
