import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "[Lclient!of;")
	private Class109_Sub1[] aClass109_Sub1Array1 = new Class109_Sub1[0];

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
	private int anInt3837 = 0;

	@OriginalMember(owner = "client!iu", name = "C", descriptor = "I")
	private int anInt3840 = 0;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	@Override
	public void method6552() {
		try {
			@Pc(2) Object local2 = this.anObject7;
			synchronized (this.anObject7) {
				while (true) {
					if (super.anInt7821 == 0) {
						break;
					}
					this.anObject7.wait();
				}
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6550(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray104[super.anInt7820] = (byte) arg0;
			super.anInt7820++;
			super.anInt7819++;
			if (super.anInt7820 >= 5000) {
				super.anInt7820 = 0;
			}
			super.anInt7821++;
			if (this.anInt3840 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLclient!sk;)V")
	@Override
	public void method6546(@OriginalArg(1) Class262 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt7816--;
			if (super.anInt7816 < 0) {
				super.anInt7816 = 4999;
			}
			super.aByteArray104[super.anInt7816] = 21;
			super.anObjectArray5[super.anInt7816] = arg0;
			super.anInt7819++;
			super.anInt7821++;
			if (this.anInt3840 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(IZ)V")
	private void method3395(@OriginalArg(0) int arg0) {
		super.aByteArray104[super.anInt7820] = (byte) arg0;
		super.anInt7820++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
		super.anInt7821++;
		super.anInt7819++;
		if (this.anInt3840 > 0) {
			@Pc(46) Object local46 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!of;I)V")
	public void method3396(@OriginalArg(0) Class109_Sub1 arg0) {
		@Pc(15) boolean local15 = false;
		try {
			@Pc(19) float local19 = 0.0F;
			@Pc(22) Object local22 = this.anObject7;
			@Pc(50) byte local50;
			synchronized (this.anObject7) {
				while (super.anInt7819 == 0) {
					this.anInt3840++;
					this.anObject7.wait();
					this.anInt3840--;
				}
				local50 = super.aByteArray104[super.anInt7816];
				if (arg0.anInt6358 < 0) {
					if (local50 >= 0 && local50 <= 3) {
						local15 = true;
					}
				} else if (local50 < 0 || local50 > 3) {
					local15 = true;
				}
				if (local15) {
					arg0.anObject14 = super.anObjectArray5[super.anInt7816];
					local19 = super.aFloatArray68[super.anInt7816];
					super.anObjectArray5[super.anInt7816] = null;
					super.anInt7816++;
					super.anInt7819--;
					if (super.anInt7816 >= 5000) {
						super.anInt7816 = 0;
					}
				}
			}
			if (!local15) {
				Thread.yield();
			} else if (arg0.anInt6358 >= 0) {
				if (local50 == 21) {
					Static490.method6645(arg0, (Class262) arg0.anObject14);
				} else if (local50 == 20) {
					@Pc(261) Class262 local261 = (Class262) arg0.anObject14;
					if (local261.aClass1_Sub2_3 != null) {
						local261.aClass1_Sub2_3.method7677(Static452.aClass39_10);
					}
					if (local261.aClass1_Sub2_2 != null) {
						local261.aClass1_Sub2_2.method7677(Static452.aClass39_10);
					}
					if (local261.aClass1_Sub3_2 != null) {
						local261.aClass1_Sub3_2.method7677(Static452.aClass39_10);
					}
					if (local261.aClass1_Sub3_3 != null) {
						local261.aClass1_Sub3_3.method7677(Static452.aClass39_10);
					}
					if (local261.aClass1_Sub4_1 != null) {
						local261.aClass1_Sub4_1.method7677(Static452.aClass39_10);
					}
					for (@Pc(304) Class187 local304 = local261.aClass187_3; local304 != null; local304 = local304.aClass187_1) {
						local304.aClass1_Sub1_1.method7677(Static452.aClass39_10);
					}
				} else if (local50 >= 30 && local50 <= 33) {
					Static452.aClass39_10.la(3000.0F, local19 * 1.5F);
					((Class75) arg0.anObject14).method6705(Static364.anInt6864, Static113.anInt2306, Static207.anInt3723, Static533.aBooleanArrayArray6, local50 - 30 == 0);
				} else if (local50 >= 40 && local50 <= 43) {
					Static452.aClass39_10.la(3000.0F, local19 * 1.5F);
					((Class75) arg0.anObject14).method6705(Static364.anInt6864, Static113.anInt2306, Static207.anInt3723, Static138.aBooleanArrayArray1, local50 - 40 == 0);
				} else if (local50 == 22) {
					Static452.aClass39_10.q(-1, 1583160, 40, 127);
				} else if (local50 == 23) {
					Static452.aClass39_10.xa();
				} else if (local50 == 24) {
					Static452.aClass39_10.method6063(0, null);
				} else if (local50 >= 10 && local50 <= 13) {
					Static452.aClass39_10.method6027(arg0.anInt6358);
					arg0.anInt6358 = -1;
				}
			} else if (local50 >= 0 && local50 <= 3) {
				arg0.anInt6358 = local50;
				Static452.aClass39_10.method6047(local50);
			}
		} catch (@Pc(333) Exception local333) {
		} finally {
			@Pc(339) Object local339 = null;
			if (local15) {
				@Pc(399) Object local399 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt7821--;
					if (super.anInt7821 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	@Override
	public void method6553(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(18) int local18;
			if (arg0 == this.anInt3837) {
				for (local18 = 0; local18 < this.anInt3837; local18++) {
					this.method3395(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt3837; local18++) {
					this.aClass109_Sub1Array1[local18].method5414();
				}
				this.anInt3837 = arg0;
				this.aClass109_Sub1Array1 = new Class109_Sub1[this.anInt3837];
				for (@Pc(69) int local69 = 0; local69 < this.anInt3837; local69++) {
					this.aClass109_Sub1Array1[local69] = new Class109_Sub1(this);
					this.aClass109_Sub1Array1[local69].method5416();
					this.method3395(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(BLclient!sk;)V")
	@Override
	public void method6551(@OriginalArg(1) Class262 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray104[super.anInt7820] = 21;
			super.anObjectArray5[super.anInt7820] = arg0;
			super.anInt7820++;
			super.anInt7821++;
			if (super.anInt7820 >= 5000) {
				super.anInt7820 = 0;
			}
			super.anInt7819++;
			if (this.anInt3840 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!sk;B)V")
	@Override
	public void method6554(@OriginalArg(0) Class262 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray104[super.anInt7820] = 20;
			super.anObjectArray5[super.anInt7820] = arg0;
			super.anInt7820++;
			if (super.anInt7820 >= 5000) {
				super.anInt7820 = 0;
			}
			super.anInt7819++;
			super.anInt7821++;
			if (this.anInt3840 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)V")
	private void method3397(@OriginalArg(0) int arg0) {
		super.aByteArray104[super.anInt7820] = (byte) (arg0 + 10);
		super.anInt7820++;
		super.anInt7821++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
		super.anInt7819++;
		if (this.anInt3840 > 0) {
			@Pc(53) Object local53 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	@Override
	public void method6547() {
		@Pc(12) Object local12 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3837; local16++) {
				if (this.aClass109_Sub1Array1[local16].anInt6358 >= 0) {
					this.method3397(this.aClass109_Sub1Array1[local16].anInt6358);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(FIIZLclient!sa;)V")
	@Override
	public void method6545(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class75 arg3) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray104[super.anInt7820] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray5[super.anInt7820] = arg3;
			super.aFloatArray68[super.anInt7820] = arg0;
			super.anInt7820++;
			if (super.anInt7820 >= 5000) {
				super.anInt7820 = 0;
			}
			super.anInt7821++;
			super.anInt7819++;
			if (this.anInt3840 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}
}
