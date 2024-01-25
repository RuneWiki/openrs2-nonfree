import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	private int anInt145 = 0;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	private int anInt146 = 0;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "[Lclient!qk;")
	private Class193_Sub1[] aClass193_Sub1Array1 = new Class193_Sub1[0];

	static {
		new Class175("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	private void method143(@OriginalArg(0) int arg0) {
		super.aByteArray67[super.anInt5928] = (byte) (arg0 + 10);
		super.anInt5928++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
		super.anInt5929++;
		super.anInt5930++;
		if (this.anInt146 > 0) {
			@Pc(54) Object local54 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!qk;)V")
	public void method144(@OriginalArg(1) Class193_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(42) byte local42;
			synchronized (this.anObject1) {
				while (super.anInt5929 == 0) {
					this.anInt146++;
					this.anObject1.wait();
					this.anInt146--;
				}
				local42 = super.aByteArray67[super.anInt5932];
				if (arg0.anInt5919 >= 0) {
					if (local42 < 0 || local42 > 3) {
						local7 = true;
					}
				} else if (local42 >= 0 && local42 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject9 = super.anObjectArray36[super.anInt5932];
					local11 = super.aFloatArray33[super.anInt5932];
					super.anObjectArray36[super.anInt5932] = null;
					super.anInt5932++;
					if (super.anInt5932 >= 5000) {
						super.anInt5932 = 0;
					}
					super.anInt5929--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5919 >= 0) {
				if (local42 == 21) {
					Static73.method1340(arg0, (Class217) arg0.anObject9);
				} else if (local42 == 20) {
					@Pc(261) Class217 local261 = (Class217) arg0.anObject9;
					if (local261.aClass1_Sub5_2 != null) {
						local261.aClass1_Sub5_2.method5840(Static355.aClass75_10);
					}
					if (local261.aClass1_Sub5_3 != null) {
						local261.aClass1_Sub5_3.method5840(Static355.aClass75_10);
					}
					if (local261.aClass1_Sub1_2 != null) {
						local261.aClass1_Sub1_2.method5840(Static355.aClass75_10);
					}
					if (local261.aClass1_Sub1_3 != null) {
						local261.aClass1_Sub1_3.method5840(Static355.aClass75_10);
					}
					if (local261.aClass1_Sub2_1 != null) {
						local261.aClass1_Sub2_1.method5840(Static355.aClass75_10);
					}
					for (@Pc(304) Class182 local304 = local261.aClass182_3; local304 != null; local304 = local304.aClass182_2) {
						local304.aClass1_Sub3_2.method5840(Static355.aClass75_10);
					}
				} else if (local42 >= 30 && local42 <= 33) {
					Static355.aClass75_10.o(3000.0F, local11 * 1.5F);
					((Class64) arg0.anObject9).method5441(Static444.anInt7531, Static340.anInt6288, Static251.anInt4730, Static200.aBooleanArrayArray2, local42 - 30 == 0);
				} else if (local42 >= 40 && local42 <= 43) {
					Static355.aClass75_10.o(3000.0F, local11 * 1.5F);
					((Class64) arg0.anObject9).method5441(Static444.anInt7531, Static340.anInt6288, Static251.anInt4730, Static435.aBooleanArrayArray6, local42 - 40 == 0);
				} else if (local42 == 22) {
					Static355.aClass75_10.fa(-1, 1583160, 40, 127);
				} else if (local42 == 23) {
					Static355.aClass75_10.S();
				} else if (local42 == 24) {
					Static355.aClass75_10.method2628(0, null);
				} else if (local42 >= 10 && local42 <= 13) {
					Static355.aClass75_10.method2630(arg0.anInt5919);
					arg0.anInt5919 = -1;
				}
			} else if (local42 >= 0 && local42 <= 3) {
				arg0.anInt5919 = local42;
				Static355.aClass75_10.method2606(local42);
			}
		} catch (@Pc(336) Exception local336) {
		} finally {
			@Pc(342) Object local342 = null;
			if (local7) {
				@Pc(402) Object local402 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt5930--;
					if (super.anInt5930 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!tg;)V")
	@Override
	public void method4737(@OriginalArg(1) Class217 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt5928] = 21;
			super.anObjectArray36[super.anInt5928] = arg0;
			super.anInt5928++;
			super.anInt5930++;
			super.anInt5929++;
			if (super.anInt5928 >= 5000) {
				super.anInt5928 = 0;
			}
			if (this.anInt146 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tg;B)V")
	@Override
	public void method4728(@OriginalArg(0) Class217 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt5932--;
			if (super.anInt5932 < 0) {
				super.anInt5932 = 4999;
			}
			super.aByteArray67[super.anInt5932] = 21;
			super.anObjectArray36[super.anInt5932] = arg0;
			super.anInt5929++;
			super.anInt5930++;
			if (this.anInt146 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!tg;I)V")
	@Override
	public void method4730(@OriginalArg(0) Class217 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt5928] = 20;
			super.anObjectArray36[super.anInt5928] = arg0;
			super.anInt5928++;
			super.anInt5929++;
			super.anInt5930++;
			if (super.anInt5928 >= 5000) {
				super.anInt5928 = 0;
			}
			if (this.anInt146 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method4735() {
		@Pc(8) Object local8 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt145; local18++) {
				if (this.aClass193_Sub1Array1[local18].anInt5919 >= 0) {
					this.method143(this.aClass193_Sub1Array1[local18].anInt5919);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	@Override
	public void method4733(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) Object local15 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(27) int local27;
			if (this.anInt145 == arg0) {
				for (local27 = 0; local27 < this.anInt145; local27++) {
					this.method146(local12++);
				}
			} else {
				for (local27 = 0; local27 < this.anInt145; local27++) {
					this.aClass193_Sub1Array1[local27].method4727();
				}
				this.anInt145 = arg0;
				this.aClass193_Sub1Array1 = new Class193_Sub1[this.anInt145];
				for (@Pc(67) int local67 = 0; local67 < this.anInt145; local67++) {
					this.aClass193_Sub1Array1[local67] = new Class193_Sub1(this);
					this.aClass193_Sub1Array1[local67].method4725();
					this.method146(local12++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!na;IBFZ)V")
	@Override
	public void method4738(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt5928] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt5928] = arg0;
			super.aFloatArray33[super.anInt5928] = arg2;
			super.anInt5928++;
			super.anInt5929++;
			super.anInt5930++;
			if (super.anInt5928 >= 5000) {
				super.anInt5928 = 0;
			}
			if (this.anInt146 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	@Override
	public void method4729() {
		try {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				while (true) {
					if (super.anInt5930 == 0) {
						break;
					}
					this.anObject1.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	private void method146(@OriginalArg(0) int arg0) {
		super.aByteArray67[super.anInt5928] = (byte) arg0;
		super.anInt5928++;
		super.anInt5929++;
		super.anInt5930++;
		if (super.anInt5928 >= 5000) {
			super.anInt5928 = 0;
		}
		if (this.anInt146 > 0) {
			@Pc(53) Object local53 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4736(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt5928] = (byte) arg0;
			super.anInt5928++;
			super.anInt5930++;
			if (super.anInt5928 >= 5000) {
				super.anInt5928 = 0;
			}
			super.anInt5929++;
			if (this.anInt146 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}
}
