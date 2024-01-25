import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
	private int anInt6772 = 0;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "[Lclient!ls;")
	private Class37_Sub1[] aClass37_Sub1Array1 = new Class37_Sub1[0];

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	private int anInt6771 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI)V")
	private void method5260(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt6760] = (byte) arg0;
		super.anInt6760++;
		super.anInt6764++;
		super.anInt6758++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
		if (this.anInt6771 > 0) {
			@Pc(45) Object local45 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(BI)V")
	private void method5261(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt6760] = (byte) (arg0 + 10);
		super.anInt6760++;
		super.anInt6758++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
		super.anInt6764++;
		if (this.anInt6771 > 0) {
			@Pc(45) Object local45 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!dr;)V")
	@Override
	public void method5251(@OriginalArg(1) Class53 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray88[super.anInt6760] = 21;
			super.anObjectArray34[super.anInt6760] = arg0;
			super.anInt6760++;
			super.anInt6758++;
			super.anInt6764++;
			if (super.anInt6760 >= 5000) {
				super.anInt6760 = 0;
			}
			if (this.anInt6771 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!na;ZFIZ)V")
	@Override
	public void method5258(@OriginalArg(0) Class146 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray88[super.anInt6760] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray34[super.anInt6760] = arg0;
			super.aFloatArray24[super.anInt6760] = arg1;
			super.anInt6760++;
			if (super.anInt6760 >= 5000) {
				super.anInt6760 = 0;
			}
			super.anInt6758++;
			super.anInt6764++;
			if (this.anInt6771 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5250(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray88[super.anInt6760] = (byte) arg0;
			super.anInt6760++;
			super.anInt6764++;
			if (super.anInt6760 >= 5000) {
				super.anInt6760 = 0;
			}
			super.anInt6758++;
			if (this.anInt6771 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!dr;B)V")
	@Override
	public void method5259(@OriginalArg(0) Class53 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray88[super.anInt6760] = 20;
			super.anObjectArray34[super.anInt6760] = arg0;
			super.anInt6760++;
			if (super.anInt6760 >= 5000) {
				super.anInt6760 = 0;
			}
			super.anInt6764++;
			super.anInt6758++;
			if (this.anInt6771 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method5252() {
		try {
			@Pc(6) Object local6 = this.anObject8;
			synchronized (this.anObject8) {
				while (super.anInt6764 != 0) {
					this.anObject8.wait();
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	@Override
	public void method5256(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject8;
		synchronized (this.anObject8) {
			@Pc(22) int local22;
			if (this.anInt6772 == arg0) {
				for (local22 = 0; local22 < this.anInt6772; local22++) {
					this.method5260(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt6772; local22++) {
					this.aClass37_Sub1Array1[local22].method3289();
				}
				this.anInt6772 = arg0;
				this.aClass37_Sub1Array1 = new Class37_Sub1[this.anInt6772];
				for (@Pc(76) int local76 = 0; local76 < this.anInt6772; local76++) {
					this.aClass37_Sub1Array1[local76] = new Class37_Sub1(this);
					this.aClass37_Sub1Array1[local76].method3291();
					this.method5260(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ls;B)V")
	public void method5264(@OriginalArg(0) Class37_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject8;
			@Pc(42) byte local42;
			synchronized (this.anObject8) {
				while (super.anInt6758 == 0) {
					this.anInt6771++;
					this.anObject8.wait();
					this.anInt6771--;
				}
				local42 = super.aByteArray88[super.anInt6762];
				if (arg0.anInt4353 < 0) {
					if (local42 >= 0 && local42 <= 3) {
						local7 = true;
					}
				} else if (local42 < 0 || local42 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray34[super.anInt6762];
					local11 = super.aFloatArray24[super.anInt6762];
					super.anObjectArray34[super.anInt6762] = null;
					super.anInt6762++;
					super.anInt6758--;
					if (super.anInt6762 >= 5000) {
						super.anInt6762 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt4353 < 0) {
				if (local42 >= 0 && local42 <= 3) {
					arg0.anInt4353 = local42;
					Static42.aClass30_3.method4673(local42);
				}
			} else if (local42 == 21) {
				Static54.method5869(arg0, (Class53) arg0.anObject7);
			} else if (local42 == 20) {
				@Pc(283) Class53 local283 = (Class53) arg0.anObject7;
				if (local283.aClass6_Sub1_1 != null) {
					local283.aClass6_Sub1_1.method5637(Static42.aClass30_3);
				}
				if (local283.aClass6_Sub1_2 != null) {
					local283.aClass6_Sub1_2.method5637(Static42.aClass30_3);
				}
				if (local283.aClass6_Sub3_1 != null) {
					local283.aClass6_Sub3_1.method5637(Static42.aClass30_3);
				}
				if (local283.aClass6_Sub3_2 != null) {
					local283.aClass6_Sub3_2.method5637(Static42.aClass30_3);
				}
				if (local283.aClass6_Sub4_1 != null) {
					local283.aClass6_Sub4_1.method5637(Static42.aClass30_3);
				}
				for (@Pc(326) Class165 local326 = local283.aClass165_1; local326 != null; local326 = local326.aClass165_2) {
					local326.aClass6_Sub2_2.method5637(Static42.aClass30_3);
				}
			} else if (local42 >= 30 && local42 <= 33) {
				Static42.aClass30_3.o(3000.0F, local11 * 1.5F);
				((Class146) arg0.anObject7).method3600(Static50.anInt1363, Static354.anInt6362, Static116.anInt2459, Static282.aBooleanArrayArray5, local42 - 30 == 0);
			} else if (local42 >= 40 && local42 <= 43) {
				Static42.aClass30_3.o(3000.0F, local11 * 1.5F);
				((Class146) arg0.anObject7).method3600(Static50.anInt1363, Static354.anInt6362, Static116.anInt2459, Static249.aBooleanArrayArray4, local42 - 40 == 0);
			} else if (local42 == 22) {
				Static42.aClass30_3.fa(-1, 1583160, 40, 127);
			} else if (local42 == 23) {
				Static42.aClass30_3.S();
			} else if (local42 == 24) {
				Static42.aClass30_3.method4706(0, null);
			} else if (local42 >= 10 && local42 <= 13) {
				Static42.aClass30_3.method4685(arg0.anInt4353);
				arg0.anInt4353 = -1;
			}
		} catch (@Pc(340) Exception local340) {
		} finally {
			@Pc(346) Object local346 = null;
			if (local7) {
				@Pc(440) Object local440 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt6764--;
					if (super.anInt6764 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!dr;B)V")
	@Override
	public void method5253(@OriginalArg(0) Class53 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt6762--;
			if (super.anInt6762 < 0) {
				super.anInt6762 = 4999;
			}
			super.aByteArray88[super.anInt6762] = 21;
			super.anObjectArray34[super.anInt6762] = arg0;
			super.anInt6764++;
			super.anInt6758++;
			if (this.anInt6771 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	@Override
	public void method5257() {
		@Pc(4) Object local4 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt6772; local8++) {
				if (this.aClass37_Sub1Array1[local8].anInt4353 >= 0) {
					this.method5261(this.aClass37_Sub1Array1[local8].anInt4353);
				}
			}
		}
	}
}
