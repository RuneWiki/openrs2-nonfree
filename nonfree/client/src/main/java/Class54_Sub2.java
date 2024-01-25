import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	private int anInt5410 = 0;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[Lclient!ge;")
	private Class91_Sub1[] aClass91_Sub1Array1 = new Class91_Sub1[0];

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	private int anInt5411 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!sd;)V")
	@Override
	public void method4348(@OriginalArg(1) Class211 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray71[super.anInt5391] = 21;
			super.anObjectArray4[super.anInt5391] = arg0;
			super.anInt5391++;
			super.anInt5388++;
			if (super.anInt5391 >= 5000) {
				super.anInt5391 = 0;
			}
			super.anInt5395++;
			if (this.anInt5411 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray71[super.anInt5391] = (byte) arg0;
			super.anInt5391++;
			if (super.anInt5391 >= 5000) {
				super.anInt5391 = 0;
			}
			super.anInt5388++;
			super.anInt5395++;
			if (this.anInt5411 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V")
	private void method4352(@OriginalArg(1) int arg0) {
		super.aByteArray71[super.anInt5391] = (byte) arg0;
		super.anInt5391++;
		super.anInt5395++;
		super.anInt5388++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
		if (this.anInt5411 > 0) {
			@Pc(41) Object local41 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!ge;)V")
	public void method4353(@OriginalArg(1) Class91_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(20) float local20 = 0.0F;
			@Pc(23) Object local23 = this.anObject8;
			@Pc(51) byte local51;
			synchronized (this.anObject8) {
				while (super.anInt5395 == 0) {
					this.anInt5411++;
					this.anObject8.wait();
					this.anInt5411--;
				}
				local51 = super.aByteArray71[super.anInt5394];
				if (arg0.anInt2253 >= 0) {
					if (local51 < 0 || local51 > 3) {
						local7 = true;
					}
				} else if (local51 >= 0 && local51 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray4[super.anInt5394];
					local20 = super.aFloatArray31[super.anInt5394];
					super.anObjectArray4[super.anInt5394] = null;
					super.anInt5394++;
					if (super.anInt5394 >= 5000) {
						super.anInt5394 = 0;
					}
					super.anInt5395--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt2253 < 0) {
				if (local51 >= 0 && local51 <= 3) {
					arg0.anInt2253 = local51;
					Static233.aClass109_7.method4725(local51);
				}
			} else if (local51 == 21) {
				Static251.method3700(arg0, (Class211) arg0.anObject2);
			} else if (local51 == 20) {
				@Pc(165) Class211 local165 = (Class211) arg0.anObject2;
				if (local165.aClass26_Sub1_2 != null) {
					local165.aClass26_Sub1_2.method5519(Static233.aClass109_7);
				}
				if (local165.aClass26_Sub1_3 != null) {
					local165.aClass26_Sub1_3.method5519(Static233.aClass109_7);
				}
				if (local165.aClass26_Sub3_3 != null) {
					local165.aClass26_Sub3_3.method5519(Static233.aClass109_7);
				}
				if (local165.aClass26_Sub3_2 != null) {
					local165.aClass26_Sub3_2.method5519(Static233.aClass109_7);
				}
				if (local165.aClass26_Sub4_2 != null) {
					local165.aClass26_Sub4_2.method5519(Static233.aClass109_7);
				}
				for (@Pc(208) Class125 local208 = local165.aClass125_3; local208 != null; local208 = local208.aClass125_1) {
					local208.aClass26_Sub2_1.method5519(Static233.aClass109_7);
				}
			} else if (local51 >= 30 && local51 <= 33) {
				Static233.aClass109_7.o(3000.0F, local20 * 1.5F);
				((Class136) arg0.anObject2).method5977(Static384.anInt6665, Static379.anInt6498, Static11.anInt315, Static250.aBooleanArrayArray3, local51 - 30 == 0);
			} else if (local51 >= 40 && local51 <= 43) {
				Static233.aClass109_7.o(3000.0F, local20 * 1.5F);
				((Class136) arg0.anObject2).method5977(Static384.anInt6665, Static379.anInt6498, Static11.anInt315, Static420.aBooleanArrayArray6, local51 - 40 == 0);
			} else if (local51 == 22) {
				Static233.aClass109_7.fa(-1, 1583160, 40, 127);
			} else if (local51 == 23) {
				Static233.aClass109_7.S();
			} else if (local51 == 24) {
				Static233.aClass109_7.method4726(0, null);
			} else if (local51 >= 10 && local51 <= 13) {
				Static233.aClass109_7.method4708(arg0.anInt2253);
				arg0.anInt2253 = -1;
			}
		} catch (@Pc(336) Exception local336) {
		} finally {
			@Pc(342) Object local342 = null;
			if (local7) {
				@Pc(399) Object local399 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt5388--;
					if (super.anInt5388 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	@Override
	public void method4340() {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(6) int local6 = 0; local6 < this.anInt5410; local6++) {
				if (this.aClass91_Sub1Array1[local6].anInt2253 >= 0) {
					this.method4355(this.aClass91_Sub1Array1[local6].anInt2253);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!sd;)V")
	@Override
	public void method4344(@OriginalArg(1) Class211 arg0) {
		@Pc(8) Object local8 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt5394--;
			if (super.anInt5394 < 0) {
				super.anInt5394 = 4999;
			}
			super.aByteArray71[super.anInt5394] = 21;
			super.anObjectArray4[super.anInt5394] = arg0;
			super.anInt5395++;
			super.anInt5388++;
			if (this.anInt5411 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	private void method4355(@OriginalArg(0) int arg0) {
		super.aByteArray71[super.anInt5391] = (byte) (arg0 + 10);
		super.anInt5391++;
		super.anInt5395++;
		super.anInt5388++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
		if (this.anInt5411 > 0) {
			@Pc(55) Object local55 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!na;FII)V")
	@Override
	public void method4351(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Object local9 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray71[super.anInt5391] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray4[super.anInt5391] = arg1;
			super.aFloatArray31[super.anInt5391] = arg2;
			super.anInt5391++;
			super.anInt5395++;
			super.anInt5388++;
			if (super.anInt5391 >= 5000) {
				super.anInt5391 = 0;
			}
			if (this.anInt5411 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	@Override
	public void method4343(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject8;
		synchronized (this.anObject8) {
			@Pc(18) int local18;
			if (arg0 == this.anInt5410) {
				for (local18 = 0; local18 < this.anInt5410; local18++) {
					this.method4352(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt5410; local18++) {
					this.aClass91_Sub1Array1[local18].method1874();
				}
				this.anInt5410 = arg0;
				this.aClass91_Sub1Array1 = new Class91_Sub1[this.anInt5410];
				for (@Pc(74) int local74 = 0; local74 < this.anInt5410; local74++) {
					this.aClass91_Sub1Array1[local74] = new Class91_Sub1(this);
					this.aClass91_Sub1Array1[local74].method1872();
					this.method4352(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!sd;B)V")
	@Override
	public void method4347(@OriginalArg(0) Class211 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray71[super.anInt5391] = 20;
			super.anObjectArray4[super.anInt5391] = arg0;
			super.anInt5391++;
			super.anInt5395++;
			super.anInt5388++;
			if (super.anInt5391 >= 5000) {
				super.anInt5391 = 0;
			}
			if (this.anInt5411 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	@Override
	public void method4337() {
		try {
			@Pc(6) Object local6 = this.anObject8;
			synchronized (this.anObject8) {
				while (super.anInt5388 != 0) {
					this.anObject8.wait();
				}
			}
		} catch (@Pc(27) Exception local27) {
		}
	}
}
