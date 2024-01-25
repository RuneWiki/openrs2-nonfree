import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
	private int anInt2556 = 0;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
	private int anInt2557 = 0;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "[Lclient!vs;")
	private Class220_Sub1[] aClass220_Sub1Array1 = new Class220_Sub1[0];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!rr;)V")
	@Override
	public void method3221(@OriginalArg(1) Class223 arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray55[super.anInt4042] = 20;
			super.anObjectArray35[super.anInt4042] = arg0;
			super.anInt4042++;
			if (super.anInt4042 >= 5000) {
				super.anInt4042 = 0;
			}
			super.anInt4044++;
			super.anInt4046++;
			if (this.anInt2557 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lclient!rr;I)V")
	@Override
	public void method3220(@OriginalArg(0) Class223 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray55[super.anInt4042] = 21;
			super.anObjectArray35[super.anInt4042] = arg0;
			super.anInt4042++;
			super.anInt4044++;
			if (super.anInt4042 >= 5000) {
				super.anInt4042 = 0;
			}
			super.anInt4046++;
			if (this.anInt2557 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZFLclient!ta;II)V")
	@Override
	public void method3213(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3) {
		@Pc(11) Object local11 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray55[super.anInt4042] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray35[super.anInt4042] = arg2;
			super.aFloatArray8[super.anInt4042] = arg1;
			super.anInt4042++;
			if (super.anInt4042 >= 5000) {
				super.anInt4042 = 0;
			}
			super.anInt4046++;
			super.anInt4044++;
			if (this.anInt2557 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
	@Override
	public void method3222(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray55[super.anInt4042] = (byte) arg0;
			super.anInt4042++;
			super.anInt4044++;
			if (super.anInt4042 >= 5000) {
				super.anInt4042 = 0;
			}
			super.anInt4046++;
			if (this.anInt2557 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	@Override
	public void method3216() {
		try {
			@Pc(4) Object local4 = this.anObject2;
			synchronized (this.anObject2) {
				while (true) {
					if (super.anInt4044 == 0) {
						break;
					}
					this.anObject2.wait();
				}
			}
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
	private void method2134(@OriginalArg(0) int arg0) {
		super.aByteArray55[super.anInt4042] = (byte) arg0;
		super.anInt4042++;
		super.anInt4046++;
		super.anInt4044++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
		if (this.anInt2557 > 0) {
			@Pc(56) Object local56 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!vs;)V")
	public void method2135(@OriginalArg(1) Class220_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject2;
			@Pc(42) byte local42;
			synchronized (this.anObject2) {
				while (super.anInt4046 == 0) {
					this.anInt2557++;
					this.anObject2.wait();
					this.anInt2557--;
				}
				local42 = super.aByteArray55[super.anInt4048];
				if (arg0.anInt7290 >= 0) {
					if (local42 < 0 || local42 > 3) {
						local7 = true;
					}
				} else if (local42 >= 0 && local42 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject10 = super.anObjectArray35[super.anInt4048];
					local11 = super.aFloatArray8[super.anInt4048];
					super.anObjectArray35[super.anInt4048] = null;
					super.anInt4048++;
					if (super.anInt4048 >= 5000) {
						super.anInt4048 = 0;
					}
					super.anInt4046--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt7290 < 0) {
				if (local42 >= 0 && local42 <= 3) {
					arg0.anInt7290 = local42;
					Static268.aClass51_8.method5341(local42);
				}
			} else if (local42 == 21) {
				Static248.method3339(arg0, (Class223) arg0.anObject10);
			} else if (local42 == 20) {
				@Pc(148) Class223 local148 = (Class223) arg0.anObject10;
				if (local148.aClass26_Sub3_2 != null) {
					local148.aClass26_Sub3_2.method5713(Static268.aClass51_8);
				}
				if (local148.aClass26_Sub3_1 != null) {
					local148.aClass26_Sub3_1.method5713(Static268.aClass51_8);
				}
				if (local148.aClass26_Sub1_2 != null) {
					local148.aClass26_Sub1_2.method5713(Static268.aClass51_8);
				}
				if (local148.aClass26_Sub1_1 != null) {
					local148.aClass26_Sub1_1.method5713(Static268.aClass51_8);
				}
				if (local148.aClass26_Sub4_2 != null) {
					local148.aClass26_Sub4_2.method5713(Static268.aClass51_8);
				}
				for (@Pc(191) Class270 local191 = local148.aClass270_1; local191 != null; local191 = local191.aClass270_3) {
					local191.aClass26_Sub2_2.method5713(Static268.aClass51_8);
				}
			} else if (local42 >= 30 && local42 <= 33) {
				Static268.aClass51_8.g(3000.0F, local11 * 1.5F);
				((Class165) arg0.anObject10).method3575(Static408.anInt6461, Static72.anInt1379, Static133.anInt2523, Static262.aBooleanArrayArray20, local42 - 30 == 0);
			} else if (local42 >= 40 && local42 <= 43) {
				Static268.aClass51_8.g(3000.0F, local11 * 1.5F);
				((Class165) arg0.anObject10).method3575(Static408.anInt6461, Static72.anInt1379, Static133.anInt2523, Static454.aBooleanArrayArray22, local42 - 40 == 0);
			} else if (local42 == 22) {
				Static268.aClass51_8.AA(-1, 1583160, 40, 127);
			} else if (local42 == 23) {
				Static268.aClass51_8.l();
			} else if (local42 == 24) {
				Static268.aClass51_8.method5318(0, null);
			} else if (local42 >= 10 && local42 <= 13) {
				Static268.aClass51_8.method5306(arg0.anInt7290);
				arg0.anInt7290 = -1;
			}
		} catch (@Pc(321) Exception local321) {
		} finally {
			@Pc(327) Object local327 = null;
			if (local7) {
				@Pc(384) Object local384 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt4044--;
					if (super.anInt4044 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	@Override
	public void method3218() {
		@Pc(8) Object local8 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2556; local12++) {
				if (this.aClass220_Sub1Array1[local12].anInt7290 >= 0) {
					this.method2137(this.aClass220_Sub1Array1[local12].anInt7290);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
	private void method2137(@OriginalArg(1) int arg0) {
		super.aByteArray55[super.anInt4042] = (byte) (arg0 + 10);
		super.anInt4042++;
		if (super.anInt4042 >= 5000) {
			super.anInt4042 = 0;
		}
		super.anInt4044++;
		super.anInt4046++;
		if (this.anInt2557 > 0) {
			@Pc(49) Object local49 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	@Override
	public void method3223(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(18) int local18;
			if (arg0 == this.anInt2556) {
				for (local18 = 0; local18 < this.anInt2556; local18++) {
					this.method2134(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt2556; local18++) {
					this.aClass220_Sub1Array1[local18].method5608();
				}
				this.anInt2556 = arg0;
				this.aClass220_Sub1Array1 = new Class220_Sub1[this.anInt2556];
				for (@Pc(58) int local58 = 0; local58 < this.anInt2556; local58++) {
					this.aClass220_Sub1Array1[local58] = new Class220_Sub1(this);
					this.aClass220_Sub1Array1[local58].method5611();
					this.method2134(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!rr;I)V")
	@Override
	public void method3214(@OriginalArg(0) Class223 arg0) {
		@Pc(12) Object local12 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt4048--;
			if (super.anInt4048 < 0) {
				super.anInt4048 = 4999;
			}
			super.aByteArray55[super.anInt4048] = 21;
			super.anObjectArray35[super.anInt4048] = arg0;
			super.anInt4044++;
			super.anInt4046++;
			if (this.anInt2557 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}
}
