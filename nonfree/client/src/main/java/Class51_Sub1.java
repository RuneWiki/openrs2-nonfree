import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject3 = new Object();

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
	private int anInt1240 = 0;

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "[Lclient!qf;")
	private Class188_Sub1[] aClass188_Sub1Array1 = new Class188_Sub1[0];

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
	private int anInt1242 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!ui;)V")
	@Override
	public void method2514(@OriginalArg(1) Class227 arg0) {
		@Pc(2) Object local2 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray46[super.anInt2672] = 20;
			super.anObjectArray4[super.anInt2672] = arg0;
			super.anInt2672++;
			if (super.anInt2672 >= 5000) {
				super.anInt2672 = 0;
			}
			super.anInt2673++;
			super.anInt2676++;
			if (this.anInt1242 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ui;B)V")
	@Override
	public void method2513(@OriginalArg(0) Class227 arg0) {
		@Pc(2) Object local2 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray46[super.anInt2672] = 21;
			super.anObjectArray4[super.anInt2672] = arg0;
			super.anInt2672++;
			super.anInt2676++;
			super.anInt2673++;
			if (super.anInt2672 >= 5000) {
				super.anInt2672 = 0;
			}
			if (this.anInt1242 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	@Override
	public void method2511(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		@Pc(16) Object local16 = this.anObject3;
		synchronized (this.anObject3) {
			@Pc(28) int local28;
			if (arg0 == this.anInt1240) {
				for (local28 = 0; local28 < this.anInt1240; local28++) {
					this.method1161(local13++);
				}
			} else {
				for (local28 = 0; local28 < this.anInt1240; local28++) {
					this.aClass188_Sub1Array1[local28].method4430();
				}
				this.anInt1240 = arg0;
				this.aClass188_Sub1Array1 = new Class188_Sub1[this.anInt1240];
				for (@Pc(76) int local76 = 0; local76 < this.anInt1240; local76++) {
					this.aClass188_Sub1Array1[local76] = new Class188_Sub1(this);
					this.aClass188_Sub1Array1[local76].method4428();
					this.method1161(local13++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ui;I)V")
	@Override
	public void method2508(@OriginalArg(0) Class227 arg0) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.anInt2674--;
			if (super.anInt2674 < 0) {
				super.anInt2674 = 4999;
			}
			super.aByteArray46[super.anInt2674] = 21;
			super.anObjectArray4[super.anInt2674] = arg0;
			super.anInt2676++;
			super.anInt2673++;
			if (this.anInt1242 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	private void method1160(@OriginalArg(0) int arg0) {
		super.aByteArray46[super.anInt2672] = (byte) (arg0 + 10);
		super.anInt2672++;
		super.anInt2676++;
		super.anInt2673++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
		if (this.anInt1242 > 0) {
			@Pc(55) Object local55 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIFLclient!dh;Z)V")
	@Override
	public void method2512(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Object local6 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray46[super.anInt2672] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray4[super.anInt2672] = arg2;
			super.aFloatArray8[super.anInt2672] = arg1;
			super.anInt2672++;
			super.anInt2673++;
			super.anInt2676++;
			if (super.anInt2672 >= 5000) {
				super.anInt2672 = 0;
			}
			if (this.anInt1242 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	@Override
	public void method2510() {
		try {
			@Pc(4) Object local4 = this.anObject3;
			synchronized (this.anObject3) {
				while (true) {
					if (super.anInt2673 == 0) {
						break;
					}
					this.anObject3.wait();
				}
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	@Override
	public void method2515() {
		@Pc(8) Object local8 = this.anObject3;
		synchronized (this.anObject3) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt1240; local19++) {
				if (this.aClass188_Sub1Array1[local19].anInt5145 >= 0) {
					this.method1160(this.aClass188_Sub1Array1[local19].anInt5145);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)V")
	private void method1161(@OriginalArg(0) int arg0) {
		super.aByteArray46[super.anInt2672] = (byte) arg0;
		super.anInt2672++;
		if (super.anInt2672 >= 5000) {
			super.anInt2672 = 0;
		}
		super.anInt2673++;
		super.anInt2676++;
		if (this.anInt1242 > 0) {
			@Pc(47) Object local47 = this.anObject3;
			synchronized (this.anObject3) {
				this.anObject3.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!qf;Z)V")
	public void method1162(@OriginalArg(0) Class188_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject3;
			@Pc(51) byte local51;
			synchronized (this.anObject3) {
				while (super.anInt2676 == 0) {
					this.anInt1242++;
					this.anObject3.wait();
					this.anInt1242--;
				}
				local51 = super.aByteArray46[super.anInt2674];
				if (arg0.anInt5145 >= 0) {
					if (local51 < 0 || local51 > 3) {
						local7 = true;
					}
				} else if (local51 >= 0 && local51 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray4[super.anInt2674];
					local17 = super.aFloatArray8[super.anInt2674];
					super.anObjectArray4[super.anInt2674] = null;
					super.anInt2674++;
					if (super.anInt2674 >= 5000) {
						super.anInt2674 = 0;
					}
					super.anInt2676--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5145 >= 0) {
				if (local51 == 21) {
					Static140.method5081(arg0, (Class227) arg0.anObject7);
				} else if (local51 == 20) {
					@Pc(260) Class227 local260 = (Class227) arg0.anObject7;
					if (local260.aClass12_Sub2_2 != null) {
						local260.aClass12_Sub2_2.method5449(Static315.aClass82_7);
					}
					if (local260.aClass12_Sub2_3 != null) {
						local260.aClass12_Sub2_3.method5449(Static315.aClass82_7);
					}
					if (local260.aClass12_Sub4_3 != null) {
						local260.aClass12_Sub4_3.method5449(Static315.aClass82_7);
					}
					if (local260.aClass12_Sub4_2 != null) {
						local260.aClass12_Sub4_2.method5449(Static315.aClass82_7);
					}
					if (local260.aClass12_Sub5_2 != null) {
						local260.aClass12_Sub5_2.method5449(Static315.aClass82_7);
					}
					for (@Pc(303) Class164 local303 = local260.aClass164_25; local303 != null; local303 = local303.aClass164_19) {
						local303.aClass12_Sub1_2.method5449(Static315.aClass82_7);
					}
				} else if (local51 >= 30 && local51 <= 33) {
					Static315.aClass82_7.method4516(3000.0F, local17 * 1.5F);
					((Class33) arg0.anObject7).method4070(Static33.anInt702, Static345.anInt6083, Static273.anInt4882, Static227.aBooleanArrayArray5, local51 - 30 == 0);
				} else if (local51 >= 40 && local51 <= 43) {
					Static315.aClass82_7.method4516(3000.0F, local17 * 1.5F);
					((Class33) arg0.anObject7).method4070(Static33.anInt702, Static345.anInt6083, Static273.anInt4882, Static15.aBooleanArrayArray1, local51 - 40 == 0);
				} else if (local51 == 22) {
					Static315.aClass82_7.method4544();
				} else if (local51 == 23) {
					Static315.aClass82_7.method4495();
				} else if (local51 == 24) {
					Static315.aClass82_7.method4489(0, null);
				} else if (local51 >= 10 && local51 <= 13) {
					Static315.aClass82_7.method4522(arg0.anInt5145);
					arg0.anInt5145 = -1;
				}
			} else if (local51 >= 0 && local51 <= 3) {
				arg0.anInt5145 = local51;
				Static315.aClass82_7.method4464(local51);
			}
		} catch (@Pc(335) Exception local335) {
		} finally {
			@Pc(341) Object local341 = null;
			if (local7) {
				@Pc(425) Object local425 = this.anObject3;
				synchronized (this.anObject3) {
					super.anInt2673--;
					if (super.anInt2673 == 0) {
						this.anObject3.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
	@Override
	public void method2516(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject3;
		synchronized (this.anObject3) {
			super.aByteArray46[super.anInt2672] = (byte) arg0;
			super.anInt2672++;
			super.anInt2673++;
			super.anInt2676++;
			if (super.anInt2672 >= 5000) {
				super.anInt2672 = 0;
			}
			if (this.anInt1242 > 0) {
				this.anObject3.notifyAll();
			}
		}
	}
}
