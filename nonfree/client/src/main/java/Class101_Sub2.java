import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
	private int anInt3551 = 0;

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
	private int anInt3555 = 0;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "[Lclient!t;")
	private Class145_Sub1[] aClass145_Sub1Array1 = new Class145_Sub1[0];

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V")
	@Override
	public void method3255(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray51[super.anInt3542] = (byte) arg0;
			super.anInt3542++;
			if (super.anInt3542 >= 5000) {
				super.anInt3542 = 0;
			}
			super.anInt3534++;
			super.anInt3539++;
			if (this.anInt3551 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ak;Z)V")
	@Override
	public void method3250(@OriginalArg(0) Class8 arg0) {
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray51[super.anInt3542] = 21;
			super.anObjectArray3[super.anInt3542] = arg0;
			super.anInt3542++;
			if (super.anInt3542 >= 5000) {
				super.anInt3542 = 0;
			}
			super.anInt3539++;
			super.anInt3534++;
			if (this.anInt3551 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!t;)V")
	public void method3256(@OriginalArg(1) Class145_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(45) byte local45;
			synchronized (this.anObject1) {
				while (super.anInt3534 == 0) {
					this.anInt3551++;
					this.anObject1.wait();
					this.anInt3551--;
				}
				local45 = super.aByteArray51[super.anInt3535];
				if (arg0.anInt6010 >= 0) {
					if (local45 < 0 || local45 > 3) {
						local7 = true;
					}
				} else if (local45 >= 0 && local45 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject5 = super.anObjectArray3[super.anInt3535];
					local11 = super.aFloatArray16[super.anInt3535];
					super.anObjectArray3[super.anInt3535] = null;
					super.anInt3535++;
					super.anInt3534--;
					if (super.anInt3535 >= 5000) {
						super.anInt3535 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6010 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt6010 = local45;
					Static50.aClass4_5.method4217(local45);
				}
			} else if (local45 == 21) {
				Static81.method1820(arg0, (Class8) arg0.anObject5);
			} else if (local45 == 20) {
				@Pc(155) Class8 local155 = (Class8) arg0.anObject5;
				if (local155.aClass62_Sub4_2 != null) {
					local155.aClass62_Sub4_2.method5567(Static50.aClass4_5);
				}
				if (local155.aClass62_Sub4_1 != null) {
					local155.aClass62_Sub4_1.method5567(Static50.aClass4_5);
				}
				if (local155.aClass62_Sub5_2 != null) {
					local155.aClass62_Sub5_2.method5567(Static50.aClass4_5);
				}
				if (local155.aClass62_Sub5_1 != null) {
					local155.aClass62_Sub5_1.method5567(Static50.aClass4_5);
				}
				if (local155.aClass62_Sub3_1 != null) {
					local155.aClass62_Sub3_1.method5567(Static50.aClass4_5);
				}
				for (@Pc(198) Class172 local198 = local155.aClass172_1; local198 != null; local198 = local198.aClass172_4) {
					local198.aClass62_Sub1_1.method5567(Static50.aClass4_5);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static50.aClass4_5.method4306(3000.0F, local11 * 1.5F);
				((Class73) arg0.anObject5).method4922(Static250.anInt4943, Static230.anInt4394, Static206.anInt4000, Static207.aBooleanArrayArray25, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static50.aClass4_5.method4306(3000.0F, local11 * 1.5F);
				((Class73) arg0.anObject5).method4922(Static250.anInt4943, Static230.anInt4394, Static206.anInt4000, Static162.aBooleanArrayArray13, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static50.aClass4_5.method4270();
			} else if (local45 == 23) {
				Static50.aClass4_5.method4209();
			} else if (local45 == 24) {
				Static50.aClass4_5.method4284(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static50.aClass4_5.method4219(arg0.anInt6010);
				arg0.anInt6010 = -1;
			}
		} catch (@Pc(333) Exception local333) {
		} finally {
			@Pc(339) Object local339 = null;
			if (local7) {
				@Pc(396) Object local396 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt3539--;
					if (super.anInt3539 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V")
	@Override
	public void method3253(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(18) int local18;
			if (this.anInt3555 == arg0) {
				for (local18 = 0; local18 < this.anInt3555; local18++) {
					this.method3259(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt3555; local18++) {
					this.aClass145_Sub1Array1[local18].method5241();
				}
				this.anInt3555 = arg0;
				this.aClass145_Sub1Array1 = new Class145_Sub1[this.anInt3555];
				for (@Pc(66) int local66 = 0; local66 < this.anInt3555; local66++) {
					this.aClass145_Sub1Array1[local66] = new Class145_Sub1(this);
					this.aClass145_Sub1Array1[local66].method5245();
					this.method3259(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(II)V")
	private void method3257(@OriginalArg(1) int arg0) {
		super.aByteArray51[super.anInt3542] = (byte) (arg0 + 10);
		super.anInt3542++;
		super.anInt3534++;
		super.anInt3539++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
		if (this.anInt3551 > 0) {
			@Pc(49) Object local49 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	@Override
	public void method3254() {
		@Pc(14) Object local14 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3555; local18++) {
				if (this.aClass145_Sub1Array1[local18].anInt6010 >= 0) {
					this.method3257(this.aClass145_Sub1Array1[local18].anInt6010);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3247(@OriginalArg(1) Class8 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray51[super.anInt3542] = 20;
			super.anObjectArray3[super.anInt3542] = arg0;
			super.anInt3542++;
			super.anInt3534++;
			super.anInt3539++;
			if (super.anInt3542 >= 5000) {
				super.anInt3542 = 0;
			}
			if (this.anInt3551 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	@Override
	public void method3248() {
		try {
			@Pc(12) Object local12 = this.anObject1;
			synchronized (this.anObject1) {
				while (super.anInt3539 != 0) {
					this.anObject1.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(ILclient!ak;)V")
	@Override
	public void method3252(@OriginalArg(1) Class8 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt3535--;
			if (super.anInt3535 < 0) {
				super.anInt3535 = 4999;
			}
			super.aByteArray51[super.anInt3535] = 21;
			super.anObjectArray3[super.anInt3535] = arg0;
			super.anInt3534++;
			super.anInt3539++;
			if (this.anInt3551 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZFBLclient!gh;)V")
	@Override
	public void method3251(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) Class73 arg3) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray51[super.anInt3542] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray3[super.anInt3542] = arg3;
			super.aFloatArray16[super.anInt3542] = arg2;
			super.anInt3542++;
			if (super.anInt3542 >= 5000) {
				super.anInt3542 = 0;
			}
			super.anInt3539++;
			super.anInt3534++;
			if (this.anInt3551 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)V")
	private void method3259(@OriginalArg(0) int arg0) {
		super.aByteArray51[super.anInt3542] = (byte) arg0;
		super.anInt3542++;
		if (super.anInt3542 >= 5000) {
			super.anInt3542 = 0;
		}
		super.anInt3539++;
		super.anInt3534++;
		if (this.anInt3551 > 0) {
			@Pc(50) Object local50 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}
}
