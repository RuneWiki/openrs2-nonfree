import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject19 = new Object();

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "[Lclient!al;")
	private Class12_Sub1[] aClass12_Sub1Array1 = new Class12_Sub1[0];

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
	private int anInt6257 = 0;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
	private int anInt6258 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	@Override
	public void method5677(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 0;
		@Pc(16) Object local16 = this.anObject19;
		synchronized (this.anObject19) {
			@Pc(24) int local24;
			if (this.anInt6257 == arg0) {
				for (local24 = 0; local24 < this.anInt6257; local24++) {
					this.method4988(local13++);
				}
			} else {
				for (local24 = 0; local24 < this.anInt6257; local24++) {
					this.aClass12_Sub1Array1[local24].method177();
				}
				this.anInt6257 = arg0;
				this.aClass12_Sub1Array1 = new Class12_Sub1[this.anInt6257];
				for (@Pc(68) int local68 = 0; local68 < this.anInt6257; local68++) {
					this.aClass12_Sub1Array1[local68] = new Class12_Sub1(this);
					this.aClass12_Sub1Array1[local68].method176();
					this.method4988(local13++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
	@Override
	public void method5678(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject19;
		synchronized (this.anObject19) {
			super.aByteArray87[super.anInt7089] = (byte) arg0;
			super.anInt7089++;
			super.anInt7090++;
			if (super.anInt7089 >= 5000) {
				super.anInt7089 = 0;
			}
			super.anInt7088++;
			if (this.anInt6258 > 0) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!al;)V")
	public void method4984(@OriginalArg(1) Class12_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(16) float local16 = 0.0F;
			@Pc(19) Object local19 = this.anObject19;
			@Pc(50) byte local50;
			synchronized (this.anObject19) {
				while (super.anInt7090 == 0) {
					this.anInt6258++;
					this.anObject19.wait();
					this.anInt6258--;
				}
				local50 = super.aByteArray87[super.anInt7091];
				if (arg0.anInt174 < 0) {
					if (local50 >= 0 && local50 <= 3) {
						local7 = true;
					}
				} else if (local50 < 0 || local50 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray36[super.anInt7091];
					local16 = super.aFloatArray31[super.anInt7091];
					super.anObjectArray36[super.anInt7091] = null;
					super.anInt7091++;
					super.anInt7090--;
					if (super.anInt7091 >= 5000) {
						super.anInt7091 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt174 >= 0) {
				if (local50 == 21) {
					Static238.method3236(arg0, (Class36) arg0.anObject2);
				} else if (local50 == 20) {
					@Pc(248) Class36 local248 = (Class36) arg0.anObject2;
					if (local248.aClass11_Sub1_2 != null) {
						local248.aClass11_Sub1_2.method6210(Static29.aClass75_4);
					}
					if (local248.aClass11_Sub1_3 != null) {
						local248.aClass11_Sub1_3.method6210(Static29.aClass75_4);
					}
					if (local248.aClass11_Sub2_1 != null) {
						local248.aClass11_Sub2_1.method6210(Static29.aClass75_4);
					}
					if (local248.aClass11_Sub2_2 != null) {
						local248.aClass11_Sub2_2.method6210(Static29.aClass75_4);
					}
					if (local248.aClass11_Sub3_1 != null) {
						local248.aClass11_Sub3_1.method6210(Static29.aClass75_4);
					}
					for (@Pc(291) Class195 local291 = local248.aClass195_1; local291 != null; local291 = local291.aClass195_2) {
						local291.aClass11_Sub5_1.method6210(Static29.aClass75_4);
					}
				} else if (local50 >= 30 && local50 <= 33) {
					Static29.aClass75_4.da(3000.0F, local16 * 1.5F);
					((Class22) arg0.anObject2).method2328(Static308.anInt5540, Static109.anInt1838, Static30.anInt535, Static409.aBooleanArrayArray5, local50 - 30 == 0);
				} else if (local50 >= 40 && local50 <= 43) {
					Static29.aClass75_4.da(3000.0F, local16 * 1.5F);
					((Class22) arg0.anObject2).method2328(Static308.anInt5540, Static109.anInt1838, Static30.anInt535, Static150.aBooleanArrayArray20, local50 - 40 == 0);
				} else if (local50 == 22) {
					Static29.aClass75_4.s(-1, 1583160, 40, 127);
				} else if (local50 == 23) {
					Static29.aClass75_4.n();
				} else if (local50 == 24) {
					Static29.aClass75_4.method6018(0, null);
				} else if (local50 >= 10 && local50 <= 13) {
					Static29.aClass75_4.method5974(arg0.anInt174);
					arg0.anInt174 = -1;
				}
			} else if (local50 >= 0 && local50 <= 3) {
				arg0.anInt174 = local50;
				Static29.aClass75_4.method5954(local50);
			}
		} catch (@Pc(331) Exception local331) {
		} finally {
			@Pc(337) Object local337 = null;
			if (local7) {
				@Pc(397) Object local397 = this.anObject19;
				synchronized (this.anObject19) {
					super.anInt7088--;
					if (super.anInt7088 == 0) {
						this.anObject19.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	@Override
	public void method5682() {
		try {
			@Pc(11) Object local11 = this.anObject19;
			synchronized (this.anObject19) {
				while (super.anInt7088 != 0) {
					this.anObject19.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!ce;)V")
	@Override
	public void method5680(@OriginalArg(1) Class36 arg0) {
		@Pc(13) Object local13 = this.anObject19;
		synchronized (this.anObject19) {
			super.aByteArray87[super.anInt7089] = 21;
			super.anObjectArray36[super.anInt7089] = arg0;
			super.anInt7089++;
			super.anInt7090++;
			super.anInt7088++;
			if (super.anInt7089 >= 5000) {
				super.anInt7089 = 0;
			}
			if (this.anInt6258 > 0) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!ce;)V")
	@Override
	public void method5679(@OriginalArg(1) Class36 arg0) {
		@Pc(2) Object local2 = this.anObject19;
		synchronized (this.anObject19) {
			super.anInt7091--;
			if (super.anInt7091 < 0) {
				super.anInt7091 = 4999;
			}
			super.aByteArray87[super.anInt7091] = 21;
			super.anObjectArray36[super.anInt7091] = arg0;
			super.anInt7090++;
			super.anInt7088++;
			if (this.anInt6258 > 0) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(FLclient!ya;BIZ)V")
	@Override
	public void method5675(@OriginalArg(0) float arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Object local10 = this.anObject19;
		synchronized (this.anObject19) {
			super.aByteArray87[super.anInt7089] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray36[super.anInt7089] = arg1;
			super.aFloatArray31[super.anInt7089] = arg0;
			super.anInt7089++;
			super.anInt7088++;
			if (super.anInt7089 >= 5000) {
				super.anInt7089 = 0;
			}
			super.anInt7090++;
			if (this.anInt6258 > 0) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public void method5684() {
		@Pc(8) Object local8 = this.anObject19;
		synchronized (this.anObject19) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt6257; local12++) {
				if (this.aClass12_Sub1Array1[local12].anInt174 >= 0) {
					this.method4987(this.aClass12_Sub1Array1[local12].anInt174);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(II)V")
	private void method4987(@OriginalArg(1) int arg0) {
		super.aByteArray87[super.anInt7089] = (byte) (arg0 + 10);
		super.anInt7089++;
		super.anInt7090++;
		super.anInt7088++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
		if (this.anInt6258 > 0) {
			@Pc(45) Object local45 = this.anObject19;
			synchronized (this.anObject19) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(BLclient!ce;)V")
	@Override
	public void method5681(@OriginalArg(1) Class36 arg0) {
		@Pc(6) Object local6 = this.anObject19;
		synchronized (this.anObject19) {
			super.aByteArray87[super.anInt7089] = 20;
			super.anObjectArray36[super.anInt7089] = arg0;
			super.anInt7089++;
			if (super.anInt7089 >= 5000) {
				super.anInt7089 = 0;
			}
			super.anInt7088++;
			super.anInt7090++;
			if (this.anInt6258 > 0) {
				this.anObject19.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(II)V")
	private void method4988(@OriginalArg(1) int arg0) {
		super.aByteArray87[super.anInt7089] = (byte) arg0;
		super.anInt7089++;
		super.anInt7090++;
		super.anInt7088++;
		if (super.anInt7089 >= 5000) {
			super.anInt7089 = 0;
		}
		if (this.anInt6258 > 0) {
			@Pc(44) Object local44 = this.anObject19;
			synchronized (this.anObject19) {
				this.anObject19.notifyAll();
			}
		}
	}
}
