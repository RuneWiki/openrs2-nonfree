import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "[Lclient!rn;")
	private Class117_Sub1[] aClass117_Sub1Array1 = new Class117_Sub1[0];

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	private int anInt2509 = 0;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	private int anInt2511 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method2404() {
		@Pc(4) Object local4 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2511; local15++) {
				if (this.aClass117_Sub1Array1[local15].anInt5371 >= 0) {
					this.method2413(this.aClass117_Sub1Array1[local15].anInt5371);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	@Override
	public void method2403(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt2497] = (byte) arg0;
			super.anInt2497++;
			super.anInt2491++;
			super.anInt2496++;
			if (super.anInt2497 >= 5000) {
				super.anInt2497 = 0;
			}
			if (this.anInt2509 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)V")
	private void method2413(@OriginalArg(1) int arg0) {
		super.aByteArray67[super.anInt2497] = (byte) (arg0 + 10);
		super.anInt2497++;
		super.anInt2496++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
		super.anInt2491++;
		if (this.anInt2509 > 0) {
			@Pc(52) Object local52 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method2407() {
		try {
			@Pc(14) Object local14 = this.anObject1;
			synchronized (this.anObject1) {
				while (super.anInt2491 != 0) {
					this.anObject1.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!we;I)V")
	@Override
	public void method2411(@OriginalArg(0) Class213 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt2497] = 20;
			super.anObjectArray4[super.anInt2497] = arg0;
			super.anInt2497++;
			super.anInt2491++;
			if (super.anInt2497 >= 5000) {
				super.anInt2497 = 0;
			}
			super.anInt2496++;
			if (this.anInt2509 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	@Override
	public void method2406(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) Object local15 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(27) int local27;
			if (arg0 == this.anInt2511) {
				for (local27 = 0; local27 < this.anInt2511; local27++) {
					this.method2414(local12++);
				}
			} else {
				for (local27 = 0; local27 < this.anInt2511; local27++) {
					this.aClass117_Sub1Array1[local27].method4781();
				}
				this.anInt2511 = arg0;
				this.aClass117_Sub1Array1 = new Class117_Sub1[this.anInt2511];
				for (@Pc(67) int local67 = 0; local67 < this.anInt2511; local67++) {
					this.aClass117_Sub1Array1[local67] = new Class117_Sub1(this);
					this.aClass117_Sub1Array1[local67].method4780();
					this.method2414(local12++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	private void method2414(@OriginalArg(0) int arg0) {
		super.aByteArray67[super.anInt2497] = (byte) arg0;
		super.anInt2497++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
		super.anInt2496++;
		super.anInt2491++;
		if (this.anInt2509 > 0) {
			@Pc(52) Object local52 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!rn;)V")
	public void method2415(@OriginalArg(1) Class117_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject1;
			@Pc(42) byte local42;
			synchronized (this.anObject1) {
				while (super.anInt2496 == 0) {
					this.anInt2509++;
					this.anObject1.wait();
					this.anInt2509--;
				}
				local42 = super.aByteArray67[super.anInt2495];
				if (arg0.anInt5371 >= 0) {
					if (local42 < 0 || local42 > 3) {
						local7 = true;
					}
				} else if (local42 >= 0 && local42 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject5 = super.anObjectArray4[super.anInt2495];
					local11 = super.aFloatArray8[super.anInt2495];
					super.anObjectArray4[super.anInt2495] = null;
					super.anInt2495++;
					if (super.anInt2495 >= 5000) {
						super.anInt2495 = 0;
					}
					super.anInt2496--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5371 >= 0) {
				if (local42 == 21) {
					Static335.method5775(arg0, (Class213) arg0.anObject5);
				} else if (local42 == 20) {
					@Pc(259) Class213 local259 = (Class213) arg0.anObject5;
					if (local259.aClass10_Sub2_2 != null) {
						local259.aClass10_Sub2_2.method5343(Static160.aClass46_4);
					}
					if (local259.aClass10_Sub2_1 != null) {
						local259.aClass10_Sub2_1.method5343(Static160.aClass46_4);
					}
					if (local259.aClass10_Sub4_1 != null) {
						local259.aClass10_Sub4_1.method5343(Static160.aClass46_4);
					}
					if (local259.aClass10_Sub4_2 != null) {
						local259.aClass10_Sub4_2.method5343(Static160.aClass46_4);
					}
					if (local259.aClass10_Sub5_1 != null) {
						local259.aClass10_Sub5_1.method5343(Static160.aClass46_4);
					}
					for (@Pc(302) Class81 local302 = local259.aClass81_4; local302 != null; local302 = local302.aClass81_3) {
						local302.aClass10_Sub3_1.method5343(Static160.aClass46_4);
					}
				} else if (local42 >= 30 && local42 <= 33) {
					Static160.aClass46_4.method5161(3000.0F, local11 * 1.5F);
					((Class114) arg0.anObject5).method3608(Static93.anInt2184, Static18.anInt373, Static312.anInt6032, Static134.aBooleanArrayArray1, local42 - 30 == 0);
				} else if (local42 >= 40 && local42 <= 43) {
					Static160.aClass46_4.method5161(3000.0F, local11 * 1.5F);
					((Class114) arg0.anObject5).method3608(Static93.anInt2184, Static18.anInt373, Static312.anInt6032, Static272.aBooleanArrayArray4, local42 - 40 == 0);
				} else if (local42 == 22) {
					Static160.aClass46_4.method5126();
				} else if (local42 == 23) {
					Static160.aClass46_4.method5131();
				} else if (local42 == 24) {
					Static160.aClass46_4.method5124(0, null);
				} else if (local42 >= 10 && local42 <= 13) {
					Static160.aClass46_4.method5159(arg0.anInt5371);
					arg0.anInt5371 = -1;
				}
			} else if (local42 >= 0 && local42 <= 3) {
				arg0.anInt5371 = local42;
				Static160.aClass46_4.method5132(local42);
			}
		} catch (@Pc(334) Exception local334) {
		} finally {
			@Pc(340) Object local340 = null;
			if (local7) {
				@Pc(430) Object local430 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt2491--;
					if (super.anInt2491 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!we;)V")
	@Override
	public void method2409(@OriginalArg(1) Class213 arg0) {
		@Pc(9) Object local9 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt2495--;
			if (super.anInt2495 < 0) {
				super.anInt2495 = 4999;
			}
			super.aByteArray67[super.anInt2495] = 21;
			super.anObjectArray4[super.anInt2495] = arg0;
			super.anInt2496++;
			super.anInt2491++;
			if (this.anInt2509 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!lf;ZFIZ)V")
	@Override
	public void method2408(@OriginalArg(0) Class114 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt2497] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray4[super.anInt2497] = arg0;
			super.aFloatArray8[super.anInt2497] = arg1;
			super.anInt2497++;
			super.anInt2496++;
			if (super.anInt2497 >= 5000) {
				super.anInt2497 = 0;
			}
			super.anInt2491++;
			if (this.anInt2509 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!we;I)V")
	@Override
	public void method2405(@OriginalArg(0) Class213 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray67[super.anInt2497] = 21;
			super.anObjectArray4[super.anInt2497] = arg0;
			super.anInt2497++;
			if (super.anInt2497 >= 5000) {
				super.anInt2497 = 0;
			}
			super.anInt2496++;
			super.anInt2491++;
			if (this.anInt2509 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}
}
