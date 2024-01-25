import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "Ljava/lang/Object;")
	private final Object anObject17 = new Object();

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "[Lclient!df;")
	private Class54_Sub1[] aClass54_Sub1Array1 = new Class54_Sub1[0];

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	private int anInt7843 = 0;

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	private int anInt7845 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!df;)V")
	public void method6070(@OriginalArg(1) Class54_Sub1 arg0) {
		@Pc(11) boolean local11 = false;
		try {
			@Pc(15) float local15 = 0.0F;
			@Pc(18) Object local18 = this.anObject17;
			@Pc(46) byte local46;
			synchronized (this.anObject17) {
				while (super.anInt7830 == 0) {
					this.anInt7845++;
					this.anObject17.wait();
					this.anInt7845--;
				}
				local46 = super.aByteArray96[super.anInt7827];
				if (arg0.anInt1889 >= 0) {
					if (local46 < 0 || local46 > 3) {
						local11 = true;
					}
				} else if (local46 >= 0 && local46 <= 3) {
					local11 = true;
				}
				if (local11) {
					arg0.anObject4 = super.anObjectArray36[super.anInt7827];
					local15 = super.aFloatArray33[super.anInt7827];
					super.anObjectArray36[super.anInt7827] = null;
					super.anInt7827++;
					if (super.anInt7827 >= 5000) {
						super.anInt7827 = 0;
					}
					super.anInt7830--;
				}
			}
			if (!local11) {
				Thread.yield();
			} else if (arg0.anInt1889 >= 0) {
				if (local46 == 21) {
					Static249.method3736(arg0, (Class252) arg0.anObject4);
				} else if (local46 == 20) {
					@Pc(246) Class252 local246 = (Class252) arg0.anObject4;
					if (local246.aClass30_Sub3_3 != null) {
						local246.aClass30_Sub3_3.method5716(Static227.aClass106_8);
					}
					if (local246.aClass30_Sub3_2 != null) {
						local246.aClass30_Sub3_2.method5716(Static227.aClass106_8);
					}
					if (local246.aClass30_Sub2_2 != null) {
						local246.aClass30_Sub2_2.method5716(Static227.aClass106_8);
					}
					if (local246.aClass30_Sub2_3 != null) {
						local246.aClass30_Sub2_3.method5716(Static227.aClass106_8);
					}
					if (local246.aClass30_Sub4_2 != null) {
						local246.aClass30_Sub4_2.method5716(Static227.aClass106_8);
					}
					for (@Pc(289) Class208 local289 = local246.aClass208_3; local289 != null; local289 = local289.aClass208_2) {
						local289.aClass30_Sub1_1.method5716(Static227.aClass106_8);
					}
				} else if (local46 >= 30 && local46 <= 33) {
					Static227.aClass106_8.da(3000.0F, local15 * 1.5F);
					((Class96) arg0.anObject4).method4429(Static166.anInt3464, Static31.anInt2066, Static235.anInt4661, Static335.aBooleanArrayArray4, local46 - 30 == 0);
				} else if (local46 >= 40 && local46 <= 43) {
					Static227.aClass106_8.da(3000.0F, local15 * 1.5F);
					((Class96) arg0.anObject4).method4429(Static166.anInt3464, Static31.anInt2066, Static235.anInt4661, Static166.aBooleanArrayArray2, local46 - 40 == 0);
				} else if (local46 == 22) {
					Static227.aClass106_8.s(-1, 1583160, 40, 127);
				} else if (local46 == 23) {
					Static227.aClass106_8.n();
				} else if (local46 == 24) {
					Static227.aClass106_8.method5956(0, null);
				} else if (local46 >= 10 && local46 <= 13) {
					Static227.aClass106_8.method5915(arg0.anInt1889);
					arg0.anInt1889 = -1;
				}
			} else if (local46 >= 0 && local46 <= 3) {
				arg0.anInt1889 = local46;
				Static227.aClass106_8.method5978(local46);
			}
		} catch (@Pc(328) Exception local328) {
		} finally {
			@Pc(334) Object local334 = null;
			if (local11) {
				@Pc(394) Object local394 = this.anObject17;
				synchronized (this.anObject17) {
					super.anInt7828--;
					if (super.anInt7828 == 0) {
						this.anObject17.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!ut;)V")
	@Override
	public void method6064(@OriginalArg(1) Class252 arg0) {
		@Pc(6) Object local6 = this.anObject17;
		synchronized (this.anObject17) {
			super.aByteArray96[super.anInt7829] = 21;
			super.anObjectArray36[super.anInt7829] = arg0;
			super.anInt7829++;
			super.anInt7828++;
			super.anInt7830++;
			if (super.anInt7829 >= 5000) {
				super.anInt7829 = 0;
			}
			if (this.anInt7845 > 0) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(ILclient!ut;)V")
	@Override
	public void method6068(@OriginalArg(1) Class252 arg0) {
		@Pc(2) Object local2 = this.anObject17;
		synchronized (this.anObject17) {
			super.aByteArray96[super.anInt7829] = 20;
			super.anObjectArray36[super.anInt7829] = arg0;
			super.anInt7829++;
			if (super.anInt7829 >= 5000) {
				super.anInt7829 = 0;
			}
			super.anInt7828++;
			super.anInt7830++;
			if (this.anInt7845 > 0) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	private void method6072(@OriginalArg(1) int arg0) {
		super.aByteArray96[super.anInt7829] = (byte) (arg0 + 10);
		super.anInt7829++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
		super.anInt7830++;
		super.anInt7828++;
		if (this.anInt7845 > 0) {
			@Pc(46) Object local46 = this.anObject17;
			synchronized (this.anObject17) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(IB)V")
	private void method6073(@OriginalArg(0) int arg0) {
		super.aByteArray96[super.anInt7829] = (byte) arg0;
		super.anInt7829++;
		super.anInt7830++;
		super.anInt7828++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
		if (this.anInt7845 > 0) {
			@Pc(47) Object local47 = this.anObject17;
			synchronized (this.anObject17) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ya;IZFI)V")
	@Override
	public void method6065(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3) {
		@Pc(6) Object local6 = this.anObject17;
		synchronized (this.anObject17) {
			super.aByteArray96[super.anInt7829] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt7829] = arg0;
			super.aFloatArray33[super.anInt7829] = arg3;
			super.anInt7829++;
			super.anInt7828++;
			super.anInt7830++;
			if (super.anInt7829 >= 5000) {
				super.anInt7829 = 0;
			}
			if (this.anInt7845 > 0) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	@Override
	public void method6069(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject17;
		synchronized (this.anObject17) {
			super.aByteArray96[super.anInt7829] = (byte) arg0;
			super.anInt7829++;
			if (super.anInt7829 >= 5000) {
				super.anInt7829 = 0;
			}
			super.anInt7828++;
			super.anInt7830++;
			if (this.anInt7845 > 0) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ut;I)V")
	@Override
	public void method6066(@OriginalArg(0) Class252 arg0) {
		@Pc(6) Object local6 = this.anObject17;
		synchronized (this.anObject17) {
			super.anInt7827--;
			if (super.anInt7827 < 0) {
				super.anInt7827 = 4999;
			}
			super.aByteArray96[super.anInt7827] = 21;
			super.anObjectArray36[super.anInt7827] = arg0;
			super.anInt7828++;
			super.anInt7830++;
			if (this.anInt7845 > 0) {
				this.anObject17.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	@Override
	public void method6063() {
		try {
			@Pc(4) Object local4 = this.anObject17;
			synchronized (this.anObject17) {
				while (true) {
					if (super.anInt7828 == 0) {
						break;
					}
					this.anObject17.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	@Override
	public void method6061() {
		@Pc(13) Object local13 = this.anObject17;
		synchronized (this.anObject17) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt7843; local17++) {
				if (this.aClass54_Sub1Array1[local17].anInt1889 >= 0) {
					this.method6072(this.aClass54_Sub1Array1[local17].anInt1889);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
	@Override
	public void method6067(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject17;
		synchronized (this.anObject17) {
			@Pc(22) int local22;
			if (arg0 == this.anInt7843) {
				for (local22 = 0; local22 < this.anInt7843; local22++) {
					this.method6073(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt7843; local22++) {
					this.aClass54_Sub1Array1[local22].method1373();
				}
				this.anInt7843 = arg0;
				this.aClass54_Sub1Array1 = new Class54_Sub1[this.anInt7843];
				for (@Pc(70) int local70 = 0; local70 < this.anInt7843; local70++) {
					this.aClass54_Sub1Array1[local70] = new Class54_Sub1(this);
					this.aClass54_Sub1Array1[local70].method1374();
					this.method6073(local7++);
				}
			}
		}
	}
}
