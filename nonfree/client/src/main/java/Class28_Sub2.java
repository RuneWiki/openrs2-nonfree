import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject4 = new Object();

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	private int anInt3679 = 0;

	@OriginalMember(owner = "client!li", name = "J", descriptor = "[Lclient!hk;")
	private Class82_Sub1[] aClass82_Sub1Array1 = new Class82_Sub1[0];

	@OriginalMember(owner = "client!li", name = "K", descriptor = "I")
	private int anInt3681 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	@Override
	public void method3465() {
		@Pc(14) Object local14 = this.anObject4;
		synchronized (this.anObject4) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3679; local18++) {
				if (this.aClass82_Sub1Array1[local18].anInt2472 >= 0) {
					this.method3478(this.aClass82_Sub1Array1[local18].anInt2472);
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	@Override
	public void method3473(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray60[super.anInt3663] = (byte) arg0;
			super.anInt3663++;
			super.anInt3659++;
			super.anInt3658++;
			if (super.anInt3663 >= 5000) {
				super.anInt3663 = 0;
			}
			if (this.anInt3681 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!hk;)V")
	public void method3477(@OriginalArg(1) Class82_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject4;
			@Pc(50) byte local50;
			synchronized (this.anObject4) {
				while (super.anInt3658 == 0) {
					this.anInt3681++;
					this.anObject4.wait();
					this.anInt3681--;
				}
				local50 = super.aByteArray60[super.anInt3657];
				if (arg0.anInt2472 >= 0) {
					if (local50 < 0 || local50 > 3) {
						local7 = true;
					}
				} else if (local50 >= 0 && local50 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject3 = super.anObjectArray4[super.anInt3657];
					local11 = super.aFloatArray25[super.anInt3657];
					super.anObjectArray4[super.anInt3657] = null;
					super.anInt3657++;
					super.anInt3658--;
					if (super.anInt3657 >= 5000) {
						super.anInt3657 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt2472 < 0) {
				if (local50 >= 0 && local50 <= 3) {
					arg0.anInt2472 = local50;
					Static271.aClass2_12.method3313(local50);
				}
			} else if (local50 == 21) {
				Static318.method5341(arg0, (Class204) arg0.anObject3);
			} else if (local50 == 20) {
				@Pc(166) Class204 local166 = (Class204) arg0.anObject3;
				if (local166.aClass5_Sub1_1 != null) {
					local166.aClass5_Sub1_1.method5686(Static271.aClass2_12);
				}
				if (local166.aClass5_Sub1_2 != null) {
					local166.aClass5_Sub1_2.method5686(Static271.aClass2_12);
				}
				if (local166.aClass5_Sub4_2 != null) {
					local166.aClass5_Sub4_2.method5686(Static271.aClass2_12);
				}
				if (local166.aClass5_Sub4_1 != null) {
					local166.aClass5_Sub4_1.method5686(Static271.aClass2_12);
				}
				if (local166.aClass5_Sub5_1 != null) {
					local166.aClass5_Sub5_1.method5686(Static271.aClass2_12);
				}
				for (@Pc(209) Class17 local209 = local166.aClass17_3; local209 != null; local209 = local209.aClass17_1) {
					local209.aClass5_Sub3_1.method5686(Static271.aClass2_12);
				}
			} else if (local50 >= 30 && local50 <= 33) {
				Static271.aClass2_12.method3320(3000.0F, local11 * 1.5F);
				((Class41) arg0.anObject3).method5416(Static199.anInt4061, Static268.anInt5167, Static346.anInt6451, Static57.aBooleanArrayArray7, local50 - 30 == 0);
			} else if (local50 >= 40 && local50 <= 43) {
				Static271.aClass2_12.method3320(3000.0F, local11 * 1.5F);
				((Class41) arg0.anObject3).method5416(Static199.anInt4061, Static268.anInt5167, Static346.anInt6451, Static134.aBooleanArrayArray13, local50 - 40 == 0);
			} else if (local50 == 22) {
				Static271.aClass2_12.method3332();
			} else if (local50 == 23) {
				Static271.aClass2_12.method3256();
			} else if (local50 == 24) {
				Static271.aClass2_12.method3260(0, null);
			} else if (local50 >= 10 && local50 <= 13) {
				Static271.aClass2_12.method3272(arg0.anInt2472);
				arg0.anInt2472 = -1;
			}
		} catch (@Pc(337) Exception local337) {
		} finally {
			@Pc(343) Object local343 = null;
			if (local7) {
				@Pc(400) Object local400 = this.anObject4;
				synchronized (this.anObject4) {
					super.anInt3659--;
					if (super.anInt3659 == 0) {
						this.anObject4.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	@Override
	public void method3464() {
		try {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				while (true) {
					if (super.anInt3659 == 0) {
						break;
					}
					this.anObject4.wait();
				}
			}
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!uk;)V")
	@Override
	public void method3467(@OriginalArg(1) Class204 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.anInt3657--;
			if (super.anInt3657 < 0) {
				super.anInt3657 = 4999;
			}
			super.aByteArray60[super.anInt3657] = 21;
			super.anObjectArray4[super.anInt3657] = arg0;
			super.anInt3658++;
			super.anInt3659++;
			if (this.anInt3681 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!uk;I)V")
	@Override
	public void method3471(@OriginalArg(0) Class204 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray60[super.anInt3663] = 20;
			super.anObjectArray4[super.anInt3663] = arg0;
			super.anInt3663++;
			if (super.anInt3663 >= 5000) {
				super.anInt3663 = 0;
			}
			super.anInt3659++;
			super.anInt3658++;
			if (this.anInt3681 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
	@Override
	public void method3469(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject4;
		synchronized (this.anObject4) {
			@Pc(18) int local18;
			if (this.anInt3679 == arg0) {
				for (local18 = 0; local18 < this.anInt3679; local18++) {
					this.method3481(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt3679; local18++) {
					this.aClass82_Sub1Array1[local18].method2395();
				}
				this.anInt3679 = arg0;
				this.aClass82_Sub1Array1 = new Class82_Sub1[this.anInt3679];
				for (@Pc(68) int local68 = 0; local68 < this.anInt3679; local68++) {
					this.aClass82_Sub1Array1[local68] = new Class82_Sub1(this);
					this.aClass82_Sub1Array1[local68].method2399();
					this.method3481(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!sm;ZBIF)V")
	@Override
	public void method3468(@OriginalArg(0) Class41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray60[super.anInt3663] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray4[super.anInt3663] = arg0;
			super.aFloatArray25[super.anInt3663] = arg3;
			super.anInt3663++;
			super.anInt3658++;
			if (super.anInt3663 >= 5000) {
				super.anInt3663 = 0;
			}
			super.anInt3659++;
			if (this.anInt3681 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
	private void method3478(@OriginalArg(0) int arg0) {
		super.aByteArray60[super.anInt3663] = (byte) (arg0 + 10);
		super.anInt3663++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
		super.anInt3659++;
		super.anInt3658++;
		if (this.anInt3681 > 0) {
			@Pc(47) Object local47 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!uk;)V")
	@Override
	public void method3474(@OriginalArg(1) Class204 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray60[super.anInt3663] = 21;
			super.anObjectArray4[super.anInt3663] = arg0;
			super.anInt3663++;
			if (super.anInt3663 >= 5000) {
				super.anInt3663 = 0;
			}
			super.anInt3658++;
			super.anInt3659++;
			if (this.anInt3681 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V")
	private void method3481(@OriginalArg(0) int arg0) {
		super.aByteArray60[super.anInt3663] = (byte) arg0;
		super.anInt3663++;
		super.anInt3659++;
		if (super.anInt3663 >= 5000) {
			super.anInt3663 = 0;
		}
		super.anInt3658++;
		if (this.anInt3681 > 0) {
			@Pc(45) Object local45 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}
}
