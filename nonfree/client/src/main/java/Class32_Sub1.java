import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bw", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!bw", name = "H", descriptor = "[Lclient!nw;")
	private Class177_Sub1[] aClass177_Sub1Array1 = new Class177_Sub1[0];

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
	private int anInt944 = 0;

	@OriginalMember(owner = "client!bw", name = "J", descriptor = "I")
	private int anInt945 = 0;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V")
	@Override
	public void method5963(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray92[super.anInt7415] = (byte) arg0;
			super.anInt7415++;
			if (super.anInt7415 >= 5000) {
				super.anInt7415 = 0;
			}
			super.anInt7422++;
			super.anInt7418++;
			if (this.anInt944 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(II)V")
	private void method807(@OriginalArg(1) int arg0) {
		super.aByteArray92[super.anInt7415] = (byte) arg0;
		super.anInt7415++;
		super.anInt7422++;
		super.anInt7418++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
		if (this.anInt944 > 0) {
			@Pc(48) Object local48 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!mm;Z)V")
	@Override
	public void method5960(@OriginalArg(0) Class162 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray92[super.anInt7415] = 20;
			super.anObjectArray36[super.anInt7415] = arg0;
			super.anInt7415++;
			super.anInt7422++;
			super.anInt7418++;
			if (super.anInt7415 >= 5000) {
				super.anInt7415 = 0;
			}
			if (this.anInt944 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!mm;)V")
	@Override
	public void method5966(@OriginalArg(1) Class162 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt7420--;
			if (super.anInt7420 < 0) {
				super.anInt7420 = 4999;
			}
			super.aByteArray92[super.anInt7420] = 21;
			super.anObjectArray36[super.anInt7420] = arg0;
			super.anInt7418++;
			super.anInt7422++;
			if (this.anInt944 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	@Override
	public void method5957() {
		@Pc(16) Object local16 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt945; local20++) {
				if (this.aClass177_Sub1Array1[local20].anInt5197 >= 0) {
					this.method812(this.aClass177_Sub1Array1[local20].anInt5197);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!nw;)V")
	public void method811(@OriginalArg(1) Class177_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(42) byte local42;
			synchronized (this.anObject1) {
				while (super.anInt7422 == 0) {
					this.anInt944++;
					this.anObject1.wait();
					this.anInt944--;
				}
				local42 = super.aByteArray92[super.anInt7420];
				if (arg0.anInt5197 < 0) {
					if (local42 >= 0 && local42 <= 3) {
						local7 = true;
					}
				} else if (local42 < 0 || local42 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray36[super.anInt7420];
					local11 = super.aFloatArray41[super.anInt7420];
					super.anObjectArray36[super.anInt7420] = null;
					super.anInt7420++;
					if (super.anInt7420 >= 5000) {
						super.anInt7420 = 0;
					}
					super.anInt7422--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5197 >= 0) {
				if (local42 == 21) {
					Static220.method3819(arg0, (Class162) arg0.anObject7);
				} else if (local42 == 20) {
					@Pc(265) Class162 local265 = (Class162) arg0.anObject7;
					if (local265.aClass11_Sub2_2 != null) {
						local265.aClass11_Sub2_2.method6303(Static367.aClass30_20);
					}
					if (local265.aClass11_Sub2_1 != null) {
						local265.aClass11_Sub2_1.method6303(Static367.aClass30_20);
					}
					if (local265.aClass11_Sub3_1 != null) {
						local265.aClass11_Sub3_1.method6303(Static367.aClass30_20);
					}
					if (local265.aClass11_Sub3_2 != null) {
						local265.aClass11_Sub3_2.method6303(Static367.aClass30_20);
					}
					if (local265.aClass11_Sub1_2 != null) {
						local265.aClass11_Sub1_2.method6303(Static367.aClass30_20);
					}
					for (@Pc(308) Class199 local308 = local265.aClass199_1; local308 != null; local308 = local308.aClass199_2) {
						local308.aClass11_Sub5_1.method6303(Static367.aClass30_20);
					}
				} else if (local42 >= 30 && local42 <= 33) {
					Static367.aClass30_20.PA(3000.0F, local11 * 1.5F);
					((Class14) arg0.anObject7).method2553(Static243.anInt4735, Static140.anInt2891, Static120.anInt2511, Static327.aBooleanArrayArray10, local42 - 30 == 0);
				} else if (local42 >= 40 && local42 <= 43) {
					Static367.aClass30_20.PA(3000.0F, local11 * 1.5F);
					((Class14) arg0.anObject7).method2553(Static243.anInt4735, Static140.anInt2891, Static120.anInt2511, Static262.aBooleanArrayArray9, local42 - 40 == 0);
				} else if (local42 == 22) {
					Static367.aClass30_20.q(-1, 1583160, 40, 127);
				} else if (local42 == 23) {
					Static367.aClass30_20.r();
				} else if (local42 == 24) {
					Static367.aClass30_20.method2081(0, null);
				} else if (local42 >= 10 && local42 <= 13) {
					Static367.aClass30_20.method2044(arg0.anInt5197);
					arg0.anInt5197 = -1;
				}
			} else if (local42 >= 0 && local42 <= 3) {
				arg0.anInt5197 = local42;
				Static367.aClass30_20.method2049(local42);
			}
		} catch (@Pc(338) Exception local338) {
		} finally {
			@Pc(344) Object local344 = null;
			if (local7) {
				@Pc(401) Object local401 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt7418--;
					if (super.anInt7418 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V")
	private void method812(@OriginalArg(0) int arg0) {
		super.aByteArray92[super.anInt7415] = (byte) (arg0 + 10);
		super.anInt7415++;
		super.anInt7422++;
		super.anInt7418++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
		if (this.anInt944 > 0) {
			@Pc(54) Object local54 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	@Override
	public void method5959(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(18) int local18;
			if (arg0 == this.anInt945) {
				for (local18 = 0; local18 < this.anInt945; local18++) {
					this.method807(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt945; local18++) {
					this.aClass177_Sub1Array1[local18].method4388();
				}
				this.anInt945 = arg0;
				this.aClass177_Sub1Array1 = new Class177_Sub1[this.anInt945];
				for (@Pc(62) int local62 = 0; local62 < this.anInt945; local62++) {
					this.aClass177_Sub1Array1[local62] = new Class177_Sub1(this);
					this.aClass177_Sub1Array1[local62].method4389();
					this.method807(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	@Override
	public void method5962() {
		try {
			@Pc(8) Object local8 = this.anObject1;
			synchronized (this.anObject1) {
				while (super.anInt7418 != 0) {
					this.anObject1.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!mm;)V")
	@Override
	public void method5958(@OriginalArg(1) Class162 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray92[super.anInt7415] = 21;
			super.anObjectArray36[super.anInt7415] = arg0;
			super.anInt7415++;
			super.anInt7418++;
			super.anInt7422++;
			if (super.anInt7415 >= 5000) {
				super.anInt7415 = 0;
			}
			if (this.anInt944 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!o;ZFII)V")
	@Override
	public void method5955(@OriginalArg(0) Class14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray92[super.anInt7415] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray36[super.anInt7415] = arg0;
			super.aFloatArray41[super.anInt7415] = arg2;
			super.anInt7415++;
			if (super.anInt7415 >= 5000) {
				super.anInt7415 = 0;
			}
			super.anInt7418++;
			super.anInt7422++;
			if (this.anInt944 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}
}
