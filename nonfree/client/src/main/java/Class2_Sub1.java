import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
	private int anInt59 = 0;

	@OriginalMember(owner = "client!aaa", name = "D", descriptor = "[Lclient!kg;")
	private Class154_Sub1[] aClass154_Sub1Array1 = new Class154_Sub1[0];

	@OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
	private int anInt60 = 0;

	static {
		new Class40("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!kg;)V")
	public void method200(@OriginalArg(1) Class154_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) float local12 = (float) 0;
			@Pc(15) Object local15 = this.anObject1;
			@Pc(43) byte local43;
			synchronized (this.anObject1) {
				while (super.anInt3446 == 0) {
					this.anInt60++;
					this.anObject1.wait();
					this.anInt60--;
				}
				local43 = super.aByteArray48[super.anInt3449];
				if (arg0.anInt5122 >= 0) {
					if (local43 < 0 || local43 > 3) {
						local7 = true;
					}
				} else if (local43 >= 0 && local43 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject11 = super.anObjectArray5[super.anInt3449];
					local12 = super.aFloatArray26[super.anInt3449];
					super.anObjectArray5[super.anInt3449] = null;
					super.anInt3449++;
					super.anInt3446--;
					if (super.anInt3449 >= 5000) {
						super.anInt3449 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5122 >= 0) {
				if (local43 == 21) {
					Static324.method5178(arg0, (Class37) arg0.anObject11);
				} else if (local43 == 20) {
					@Pc(135) Class37 local135 = (Class37) arg0.anObject11;
					if (local135.aClass15_Sub3_3 != null) {
						local135.aClass15_Sub3_3.method6862(Static60.aClass62_37);
					}
					if (local135.aClass15_Sub3_2 != null) {
						local135.aClass15_Sub3_2.method6862(Static60.aClass62_37);
					}
					if (local135.aClass15_Sub1_3 != null) {
						local135.aClass15_Sub1_3.method6862(Static60.aClass62_37);
					}
					if (local135.aClass15_Sub1_2 != null) {
						local135.aClass15_Sub1_2.method6862(Static60.aClass62_37);
					}
					if (local135.aClass15_Sub5_1 != null) {
						local135.aClass15_Sub5_1.method6862(Static60.aClass62_37);
					}
					for (@Pc(178) Class108 local178 = local135.aClass108_1; local178 != null; local178 = local178.aClass108_3) {
						local178.aClass15_Sub2_1.method6862(Static60.aClass62_37);
					}
				} else if (local43 >= 30 && local43 <= 33) {
					Static60.aClass62_37.la(3000.0F, local12 * 1.5F);
					((Class131) arg0.anObject11).method7190(Static489.anInt8410, Static461.anInt7924, Static479.anInt8261, Static398.aBooleanArrayArray4, local43 - 30 == 0);
				} else if (local43 >= 40 && local43 <= 43) {
					Static60.aClass62_37.la(3000.0F, local12 * 1.5F);
					((Class131) arg0.anObject11).method7190(Static489.anInt8410, Static461.anInt7924, Static479.anInt8261, Static527.aBooleanArrayArray6, local43 - 40 == 0);
				} else if (local43 == 22) {
					Static60.aClass62_37.q(-1, 1583160, 40, 127);
				} else if (local43 == 23) {
					Static60.aClass62_37.xa();
				} else if (local43 == 24) {
					Static60.aClass62_37.method7059(0, null);
				} else if (local43 >= 10 && local43 <= 13) {
					Static60.aClass62_37.method7060(arg0.anInt5122);
					arg0.anInt5122 = -1;
				}
			} else if (local43 >= 0 && local43 <= 3) {
				arg0.anInt5122 = local43;
				Static60.aClass62_37.method7001(local43);
			}
		} catch (@Pc(335) Exception local335) {
		} finally {
			@Pc(341) Object local341 = null;
			if (local7) {
				@Pc(398) Object local398 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt3447--;
					if (super.anInt3447 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)V")
	@Override
	public void method3043(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray48[super.anInt3445] = (byte) arg0;
			super.anInt3445++;
			super.anInt3447++;
			super.anInt3446++;
			if (super.anInt3445 >= 5000) {
				super.anInt3445 = 0;
			}
			if (this.anInt60 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
	private void method201(@OriginalArg(1) int arg0) {
		super.aByteArray48[super.anInt3445] = (byte) arg0;
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
		super.anInt3446++;
		super.anInt3447++;
		if (this.anInt60 > 0) {
			@Pc(52) Object local52 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLclient!sa;FII)V")
	@Override
	public void method3042(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray48[super.anInt3445] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray5[super.anInt3445] = arg1;
			super.aFloatArray26[super.anInt3445] = arg2;
			super.anInt3445++;
			super.anInt3447++;
			if (super.anInt3445 >= 5000) {
				super.anInt3445 = 0;
			}
			super.anInt3446++;
			if (this.anInt60 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	@Override
	public void method3039() {
		try {
			@Pc(8) Object local8 = this.anObject1;
			synchronized (this.anObject1) {
				while (super.anInt3447 != 0) {
					this.anObject1.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!br;B)V")
	@Override
	public void method3040(@OriginalArg(0) Class37 arg0) {
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt3449--;
			if (super.anInt3449 < 0) {
				super.anInt3449 = 4999;
			}
			super.aByteArray48[super.anInt3449] = 21;
			super.anObjectArray5[super.anInt3449] = arg0;
			super.anInt3446++;
			super.anInt3447++;
			if (this.anInt60 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!br;)V")
	@Override
	public void method3046(@OriginalArg(1) Class37 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray48[super.anInt3445] = 20;
			super.anObjectArray5[super.anInt3445] = arg0;
			super.anInt3445++;
			if (super.anInt3445 >= 5000) {
				super.anInt3445 = 0;
			}
			super.anInt3446++;
			super.anInt3447++;
			if (this.anInt60 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)V")
	@Override
	public void method3044(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(18) int local18;
			if (arg0 == this.anInt59) {
				for (local18 = 0; local18 < this.anInt59; local18++) {
					this.method201(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt59; local18++) {
					this.aClass154_Sub1Array1[local18].method4335();
				}
				this.anInt59 = arg0;
				this.aClass154_Sub1Array1 = new Class154_Sub1[this.anInt59];
				for (@Pc(68) int local68 = 0; local68 < this.anInt59; local68++) {
					this.aClass154_Sub1Array1[local68] = new Class154_Sub1(this);
					this.aClass154_Sub1Array1[local68].method4333();
					this.method201(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLclient!br;)V")
	@Override
	public void method3047(@OriginalArg(1) Class37 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray48[super.anInt3445] = 21;
			super.anObjectArray5[super.anInt3445] = arg0;
			super.anInt3445++;
			if (super.anInt3445 >= 5000) {
				super.anInt3445 = 0;
			}
			super.anInt3446++;
			super.anInt3447++;
			if (this.anInt60 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	@Override
	public void method3037() {
		@Pc(15) Object local15 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt59; local19++) {
				if (this.aClass154_Sub1Array1[local19].anInt5122 >= 0) {
					this.method204(this.aClass154_Sub1Array1[local19].anInt5122);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
	private void method204(@OriginalArg(1) int arg0) {
		super.aByteArray48[super.anInt3445] = (byte) (arg0 + 10);
		super.anInt3445++;
		if (super.anInt3445 >= 5000) {
			super.anInt3445 = 0;
		}
		super.anInt3446++;
		super.anInt3447++;
		if (this.anInt60 > 0) {
			@Pc(44) Object local44 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}
}
