import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject18 = new Object();

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "[Lclient!gba;")
	private Class111_Sub1[] aClass111_Sub1Array1 = new Class111_Sub1[0];

	@OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
	private int anInt9553 = 0;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
	private int anInt9552 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8210(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject18;
		synchronized (this.anObject18) {
			@Pc(18) int local18;
			if (arg0 == this.anInt9552) {
				for (local18 = 0; local18 < this.anInt9552; local18++) {
					this.method8225(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt9552; local18++) {
					this.aClass111_Sub1Array1[local18].method2794();
				}
				this.anInt9552 = arg0;
				this.aClass111_Sub1Array1 = new Class111_Sub1[this.anInt9552];
				for (@Pc(66) int local66 = 0; local66 < this.anInt9552; local66++) {
					this.aClass111_Sub1Array1[local66] = new Class111_Sub1(this);
					this.aClass111_Sub1Array1[local66].method2792();
					this.method8225(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	@Override
	public void method8209() {
		try {
			@Pc(8) Object local8 = this.anObject18;
			synchronized (this.anObject18) {
				while (super.anInt9531 != 0) {
					this.anObject18.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!dg;)V")
	@Override
	public void method8212(@OriginalArg(1) Class64 arg0) {
		@Pc(6) Object local6 = this.anObject18;
		synchronized (this.anObject18) {
			super.anInt9535--;
			if (super.anInt9535 < 0) {
				super.anInt9535 = 4999;
			}
			super.aByteArray118[super.anInt9535] = 21;
			super.anObjectArray36[super.anInt9535] = arg0;
			super.anInt9531++;
			super.anInt9537++;
			if (this.anInt9553 > 0) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!sa;IIZF)V")
	@Override
	public void method8216(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) float arg3) {
		@Pc(6) Object local6 = this.anObject18;
		synchronized (this.anObject18) {
			super.aByteArray118[super.anInt9534] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray36[super.anInt9534] = arg0;
			super.aFloatArray79[super.anInt9534] = arg3;
			super.anInt9534++;
			if (super.anInt9534 >= 5000) {
				super.anInt9534 = 0;
			}
			super.anInt9537++;
			super.anInt9531++;
			if (this.anInt9553 > 0) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!gba;)V")
	public void method8222(@OriginalArg(1) Class111_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject18;
			@Pc(45) byte local45;
			synchronized (this.anObject18) {
				while (super.anInt9537 == 0) {
					this.anInt9553++;
					this.anObject18.wait();
					this.anInt9553--;
				}
				local45 = super.aByteArray118[super.anInt9535];
				if (arg0.anInt2980 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray36[super.anInt9535];
					local11 = super.aFloatArray79[super.anInt9535];
					super.anObjectArray36[super.anInt9535] = null;
					super.anInt9535++;
					super.anInt9537--;
					if (super.anInt9535 >= 5000) {
						super.anInt9535 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt2980 >= 0) {
				if (local45 == 21) {
					Static503.method5019(arg0, (Class64) arg0.anObject6);
				} else if (local45 == 20) {
					@Pc(153) Class64 local153 = (Class64) arg0.anObject6;
					if (local153.aClass20_Sub2_1 != null) {
						local153.aClass20_Sub2_1.method8030(Static281.aClass4_9);
					}
					if (local153.aClass20_Sub2_2 != null) {
						local153.aClass20_Sub2_2.method8030(Static281.aClass4_9);
					}
					if (local153.aClass20_Sub4_2 != null) {
						local153.aClass20_Sub4_2.method8030(Static281.aClass4_9);
					}
					if (local153.aClass20_Sub4_1 != null) {
						local153.aClass20_Sub4_1.method8030(Static281.aClass4_9);
					}
					if (local153.aClass20_Sub5_1 != null) {
						local153.aClass20_Sub5_1.method8030(Static281.aClass4_9);
					}
					for (@Pc(196) Class232 local196 = local153.aClass232_2; local196 != null; local196 = local196.aClass232_3) {
						local196.aClass20_Sub1_2.method8030(Static281.aClass4_9);
					}
				} else if (local45 >= 30 && local45 <= 33) {
					Static281.aClass4_9.la(3000.0F, local11 * 1.5F);
					((Class7) arg0.anObject6).method8249(Static539.anInt9517, Static421.anInt7325, Static466.anInt8044, Static38.aBooleanArrayArray1, local45 - 30 == 0);
				} else if (local45 >= 40 && local45 <= 43) {
					Static281.aClass4_9.la(3000.0F, local11 * 1.5F);
					((Class7) arg0.anObject6).method8249(Static539.anInt9517, Static421.anInt7325, Static466.anInt8044, Static442.aBooleanArrayArray10, local45 - 40 == 0);
				} else if (local45 == 22) {
					Static281.aClass4_9.q(-1, 1583160, 40, 127);
				} else if (local45 == 23) {
					Static281.aClass4_9.xa();
				} else if (local45 == 24) {
					Static281.aClass4_9.method7222(0, null);
				} else if (local45 >= 10 && local45 <= 13) {
					Static281.aClass4_9.method7213(arg0.anInt2980);
					arg0.anInt2980 = -1;
				}
			} else if (local45 >= 0 && local45 <= 3) {
				arg0.anInt2980 = local45;
				Static281.aClass4_9.method7196(local45);
			}
		} catch (@Pc(343) Exception local343) {
		} finally {
			@Pc(349) Object local349 = null;
			if (local7) {
				@Pc(406) Object local406 = this.anObject18;
				synchronized (this.anObject18) {
					super.anInt9531--;
					if (super.anInt9531 == 0) {
						this.anObject18.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	private void method8223(@OriginalArg(0) int arg0) {
		super.aByteArray118[super.anInt9534] = (byte) (arg0 + 10);
		super.anInt9534++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
		super.anInt9531++;
		super.anInt9537++;
		if (this.anInt9553 > 0) {
			@Pc(46) Object local46 = this.anObject18;
			synchronized (this.anObject18) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dg;Z)V")
	@Override
	public void method8213(@OriginalArg(0) Class64 arg0) {
		@Pc(6) Object local6 = this.anObject18;
		synchronized (this.anObject18) {
			super.aByteArray118[super.anInt9534] = 21;
			super.anObjectArray36[super.anInt9534] = arg0;
			super.anInt9534++;
			if (super.anInt9534 >= 5000) {
				super.anInt9534 = 0;
			}
			super.anInt9531++;
			super.anInt9537++;
			if (this.anInt9553 > 0) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	@Override
	public void method8219(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject18;
		synchronized (this.anObject18) {
			super.aByteArray118[super.anInt9534] = (byte) arg0;
			super.anInt9534++;
			super.anInt9531++;
			super.anInt9537++;
			if (super.anInt9534 >= 5000) {
				super.anInt9534 = 0;
			}
			if (this.anInt9553 > 0) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	@Override
	public void method8215() {
		@Pc(11) Object local11 = this.anObject18;
		synchronized (this.anObject18) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt9552; local15++) {
				if (this.aClass111_Sub1Array1[local15].anInt2980 >= 0) {
					this.method8223(this.aClass111_Sub1Array1[local15].anInt2980);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dg;B)V")
	@Override
	public void method8217(@OriginalArg(0) Class64 arg0) {
		@Pc(6) Object local6 = this.anObject18;
		synchronized (this.anObject18) {
			super.aByteArray118[super.anInt9534] = 20;
			super.anObjectArray36[super.anInt9534] = arg0;
			super.anInt9534++;
			super.anInt9537++;
			if (super.anInt9534 >= 5000) {
				super.anInt9534 = 0;
			}
			super.anInt9531++;
			if (this.anInt9553 > 0) {
				this.anObject18.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	private void method8225(@OriginalArg(1) int arg0) {
		super.aByteArray118[super.anInt9534] = (byte) arg0;
		super.anInt9534++;
		super.anInt9537++;
		super.anInt9531++;
		if (super.anInt9534 >= 5000) {
			super.anInt9534 = 0;
		}
		if (this.anInt9553 > 0) {
			@Pc(45) Object local45 = this.anObject18;
			synchronized (this.anObject18) {
				this.anObject18.notifyAll();
			}
		}
	}
}
