import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject5 = new Object();

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[Lclient!pi;")
	private Class37_Sub1[] aClass37_Sub1Array1 = new Class37_Sub1[0];

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
	private int anInt998 = 0;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	private int anInt995 = 0;

	static {
		new Class7("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fq;I)V")
	@Override
	public void method5186(@OriginalArg(0) Class80 arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray80[super.anInt6223] = 20;
			super.anObjectArray4[super.anInt6223] = arg0;
			super.anInt6223++;
			if (super.anInt6223 >= 5000) {
				super.anInt6223 = 0;
			}
			super.anInt6226++;
			super.anInt6225++;
			if (this.anInt998 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!fq;)V")
	@Override
	public void method5194(@OriginalArg(1) Class80 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.anInt6227--;
			if (super.anInt6227 < 0) {
				super.anInt6227 = 4999;
			}
			super.aByteArray80[super.anInt6227] = 21;
			super.anObjectArray4[super.anInt6227] = arg0;
			super.anInt6226++;
			super.anInt6225++;
			if (this.anInt998 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	@Override
	public void method5185() {
		@Pc(4) Object local4 = this.anObject5;
		synchronized (this.anObject5) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt995; local13++) {
				if (this.aClass37_Sub1Array1[local13].anInt5271 >= 0) {
					this.method910(this.aClass37_Sub1Array1[local13].anInt5271);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	@Override
	public void method5188(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject5;
		synchronized (this.anObject5) {
			@Pc(22) int local22;
			if (this.anInt995 == arg0) {
				for (local22 = 0; local22 < this.anInt995; local22++) {
					this.method909(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt995; local22++) {
					this.aClass37_Sub1Array1[local22].method4361();
				}
				this.anInt995 = arg0;
				this.aClass37_Sub1Array1 = new Class37_Sub1[this.anInt995];
				for (@Pc(62) int local62 = 0; local62 < this.anInt995; local62++) {
					this.aClass37_Sub1Array1[local62] = new Class37_Sub1(this);
					this.aClass37_Sub1Array1[local62].method4363();
					this.method909(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!pi;)V")
	public void method906(@OriginalArg(1) Class37_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject5;
			@Pc(48) byte local48;
			synchronized (this.anObject5) {
				while (super.anInt6225 == 0) {
					this.anInt998++;
					this.anObject5.wait();
					this.anInt998--;
				}
				local48 = super.aByteArray80[super.anInt6227];
				if (arg0.anInt5271 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject8 = super.anObjectArray4[super.anInt6227];
					local17 = super.aFloatArray28[super.anInt6227];
					super.anObjectArray4[super.anInt6227] = null;
					super.anInt6227++;
					super.anInt6225--;
					if (super.anInt6227 >= 5000) {
						super.anInt6227 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5271 >= 0) {
				if (local48 == 21) {
					Static251.method3764(arg0, (Class80) arg0.anObject8);
				} else if (local48 == 20) {
					@Pc(260) Class80 local260 = (Class80) arg0.anObject8;
					if (local260.aClass31_Sub3_3 != null) {
						local260.aClass31_Sub3_3.method5969(Static242.aClass39_7);
					}
					if (local260.aClass31_Sub3_2 != null) {
						local260.aClass31_Sub3_2.method5969(Static242.aClass39_7);
					}
					if (local260.aClass31_Sub4_2 != null) {
						local260.aClass31_Sub4_2.method5969(Static242.aClass39_7);
					}
					if (local260.aClass31_Sub4_1 != null) {
						local260.aClass31_Sub4_1.method5969(Static242.aClass39_7);
					}
					if (local260.aClass31_Sub1_2 != null) {
						local260.aClass31_Sub1_2.method5969(Static242.aClass39_7);
					}
					for (@Pc(303) Class22 local303 = local260.aClass22_2; local303 != null; local303 = local303.aClass22_1) {
						local303.aClass31_Sub2_1.method5969(Static242.aClass39_7);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					Static242.aClass39_7.g(3000.0F, local17 * 1.5F);
					((Class149) arg0.anObject8).method3569(Static398.anInt6395, Static350.anInt5829, Static75.anInt1695, Static23.aBooleanArrayArray4, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					Static242.aClass39_7.g(3000.0F, local17 * 1.5F);
					((Class149) arg0.anObject8).method3569(Static398.anInt6395, Static350.anInt5829, Static75.anInt1695, Static390.aBooleanArrayArray8, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static242.aClass39_7.AA(-1, 1583160, 40, 127);
				} else if (local48 == 23) {
					Static242.aClass39_7.l();
				} else if (local48 == 24) {
					Static242.aClass39_7.method4560(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static242.aClass39_7.method4493(arg0.anInt5271);
					arg0.anInt5271 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt5271 = local48;
				Static242.aClass39_7.method4531(local48);
			}
		} catch (@Pc(338) Exception local338) {
		} finally {
			@Pc(344) Object local344 = null;
			if (local7) {
				@Pc(428) Object local428 = this.anObject5;
				synchronized (this.anObject5) {
					super.anInt6226--;
					if (super.anInt6226 == 0) {
						this.anObject5.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(FZILclient!ta;I)V")
	@Override
	public void method5189(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray80[super.anInt6223] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray4[super.anInt6223] = arg3;
			super.aFloatArray28[super.anInt6223] = arg0;
			super.anInt6223++;
			super.anInt6225++;
			super.anInt6226++;
			if (super.anInt6223 >= 5000) {
				super.anInt6223 = 0;
			}
			if (this.anInt998 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	public void method5192() {
		try {
			@Pc(8) Object local8 = this.anObject5;
			synchronized (this.anObject5) {
				while (true) {
					if (super.anInt6226 == 0) {
						break;
					}
					this.anObject5.wait();
				}
			}
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
	private void method909(@OriginalArg(1) int arg0) {
		super.aByteArray80[super.anInt6223] = (byte) arg0;
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
		super.anInt6226++;
		super.anInt6225++;
		if (this.anInt998 > 0) {
			@Pc(49) Object local49 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V")
	private void method910(@OriginalArg(0) int arg0) {
		super.aByteArray80[super.anInt6223] = (byte) (arg0 + 10);
		super.anInt6223++;
		if (super.anInt6223 >= 5000) {
			super.anInt6223 = 0;
		}
		super.anInt6225++;
		super.anInt6226++;
		if (this.anInt998 > 0) {
			@Pc(55) Object local55 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLclient!fq;)V")
	@Override
	public void method5195(@OriginalArg(1) Class80 arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray80[super.anInt6223] = 21;
			super.anObjectArray4[super.anInt6223] = arg0;
			super.anInt6223++;
			super.anInt6225++;
			super.anInt6226++;
			if (super.anInt6223 >= 5000) {
				super.anInt6223 = 0;
			}
			if (this.anInt998 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
	@Override
	public void method5191(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray80[super.anInt6223] = (byte) arg0;
			super.anInt6223++;
			if (super.anInt6223 >= 5000) {
				super.anInt6223 = 0;
			}
			super.anInt6225++;
			super.anInt6226++;
			if (this.anInt998 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}
}
