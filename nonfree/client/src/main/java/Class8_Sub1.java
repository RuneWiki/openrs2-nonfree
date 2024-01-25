import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
	private int anInt119 = 0;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private int anInt118 = 0;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "[Lclient!au;")
	private Class17_Sub1[] aClass17_Sub1Array1 = new Class17_Sub1[0];

	static {
		new Class182("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(FIZLclient!ya;I)V")
	@Override
	public void method3749(@OriginalArg(0) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray53[super.anInt4634] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray34[super.anInt4634] = arg2;
			super.aFloatArray27[super.anInt4634] = arg0;
			super.anInt4634++;
			super.anInt4633++;
			super.anInt4630++;
			if (super.anInt4634 >= 5000) {
				super.anInt4634 = 0;
			}
			if (this.anInt118 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ak;I)V")
	@Override
	public void method3757(@OriginalArg(0) Class11 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt4631--;
			if (super.anInt4631 < 0) {
				super.anInt4631 = 4999;
			}
			super.aByteArray53[super.anInt4631] = 21;
			super.anObjectArray34[super.anInt4631] = arg0;
			super.anInt4633++;
			super.anInt4630++;
			if (this.anInt118 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	@Override
	public void method3754(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray53[super.anInt4634] = (byte) arg0;
			super.anInt4634++;
			super.anInt4633++;
			if (super.anInt4634 >= 5000) {
				super.anInt4634 = 0;
			}
			super.anInt4630++;
			if (this.anInt118 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)V")
	private void method80(@OriginalArg(0) int arg0) {
		super.aByteArray53[super.anInt4634] = (byte) (arg0 + 10);
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
		super.anInt4633++;
		super.anInt4630++;
		if (this.anInt118 > 0) {
			@Pc(50) Object local50 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	@Override
	public void method3750() {
		try {
			@Pc(14) Object local14 = this.anObject1;
			synchronized (this.anObject1) {
				while (super.anInt4633 != 0) {
					this.anObject1.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3751(@OriginalArg(1) Class11 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray53[super.anInt4634] = 20;
			super.anObjectArray34[super.anInt4634] = arg0;
			super.anInt4634++;
			super.anInt4633++;
			if (super.anInt4634 >= 5000) {
				super.anInt4634 = 0;
			}
			super.anInt4630++;
			if (this.anInt118 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	@Override
	public void method3755() {
		@Pc(8) Object local8 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt119; local12++) {
				if (this.aClass17_Sub1Array1[local12].anInt354 >= 0) {
					this.method80(this.aClass17_Sub1Array1[local12].anInt354);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!au;)V")
	public void method81(@OriginalArg(1) Class17_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(45) byte local45;
			synchronized (this.anObject1) {
				while (super.anInt4630 == 0) {
					this.anInt118++;
					this.anObject1.wait();
					this.anInt118--;
				}
				local45 = super.aByteArray53[super.anInt4631];
				if (arg0.anInt354 >= 0) {
					if (local45 < 0 || local45 > 3) {
						local7 = true;
					}
				} else if (local45 >= 0 && local45 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject3 = super.anObjectArray34[super.anInt4631];
					local11 = super.aFloatArray27[super.anInt4631];
					super.anObjectArray34[super.anInt4631] = null;
					super.anInt4631++;
					if (super.anInt4631 >= 5000) {
						super.anInt4631 = 0;
					}
					super.anInt4630--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt354 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt354 = local45;
					Static142.aClass50_5.method5832(local45);
				}
			} else if (local45 == 21) {
				Static199.method3241(arg0, (Class11) arg0.anObject3);
			} else if (local45 == 20) {
				@Pc(162) Class11 local162 = (Class11) arg0.anObject3;
				if (local162.aClass24_Sub5_1 != null) {
					local162.aClass24_Sub5_1.method5685(Static142.aClass50_5);
				}
				if (local162.aClass24_Sub5_2 != null) {
					local162.aClass24_Sub5_2.method5685(Static142.aClass50_5);
				}
				if (local162.aClass24_Sub1_2 != null) {
					local162.aClass24_Sub1_2.method5685(Static142.aClass50_5);
				}
				if (local162.aClass24_Sub1_1 != null) {
					local162.aClass24_Sub1_1.method5685(Static142.aClass50_5);
				}
				if (local162.aClass24_Sub4_1 != null) {
					local162.aClass24_Sub4_1.method5685(Static142.aClass50_5);
				}
				for (@Pc(205) Class1 local205 = local162.aClass1_3; local205 != null; local205 = local205.aClass1_1) {
					local205.aClass24_Sub3_1.method5685(Static142.aClass50_5);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static142.aClass50_5.da(3000.0F, local11 * 1.5F);
				((Class154) arg0.anObject3).method6076(Static18.anInt316, Static265.anInt4683, Static451.anInt7524, Static460.aBooleanArrayArray9, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static142.aClass50_5.da(3000.0F, local11 * 1.5F);
				((Class154) arg0.anObject3).method6076(Static18.anInt316, Static265.anInt4683, Static451.anInt7524, Static432.aBooleanArrayArray7, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static142.aClass50_5.s(-1, 1583160, 40, 127);
			} else if (local45 == 23) {
				Static142.aClass50_5.n();
			} else if (local45 == 24) {
				Static142.aClass50_5.method5869(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static142.aClass50_5.method5826(arg0.anInt354);
				arg0.anInt354 = -1;
			}
		} catch (@Pc(342) Exception local342) {
		} finally {
			@Pc(348) Object local348 = null;
			if (local7) {
				@Pc(408) Object local408 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt4633--;
					if (super.anInt4633 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!ak;)V")
	@Override
	public void method3746(@OriginalArg(1) Class11 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray53[super.anInt4634] = 21;
			super.anObjectArray34[super.anInt4634] = arg0;
			super.anInt4634++;
			super.anInt4630++;
			if (super.anInt4634 >= 5000) {
				super.anInt4634 = 0;
			}
			super.anInt4633++;
			if (this.anInt118 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZI)V")
	private void method82(@OriginalArg(1) int arg0) {
		super.aByteArray53[super.anInt4634] = (byte) arg0;
		super.anInt4634++;
		if (super.anInt4634 >= 5000) {
			super.anInt4634 = 0;
		}
		super.anInt4630++;
		super.anInt4633++;
		if (this.anInt118 > 0) {
			@Pc(47) Object local47 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V")
	@Override
	public void method3752(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(22) int local22;
			if (arg0 == this.anInt119) {
				for (local22 = 0; local22 < this.anInt119; local22++) {
					this.method82(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt119; local22++) {
					this.aClass17_Sub1Array1[local22].method283();
				}
				this.anInt119 = arg0;
				this.aClass17_Sub1Array1 = new Class17_Sub1[this.anInt119];
				for (@Pc(62) int local62 = 0; local62 < this.anInt119; local62++) {
					this.aClass17_Sub1Array1[local62] = new Class17_Sub1(this);
					this.aClass17_Sub1Array1[local62].method285();
					this.method82(local7++);
				}
			}
		}
	}
}
