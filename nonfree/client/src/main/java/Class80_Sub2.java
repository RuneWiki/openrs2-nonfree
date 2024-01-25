import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject5 = new Object();

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
	private int anInt4526 = 0;

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	private int anInt4527 = 0;

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "[Lclient!nd;")
	private Class132_Sub1[] aClass132_Sub1Array1 = new Class132_Sub1[0];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!dc;I)V")
	@Override
	public void method3929(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4509] = 21;
			super.anObjectArray34[super.anInt4509] = arg0;
			super.anInt4509++;
			super.anInt4508++;
			super.anInt4506++;
			if (super.anInt4509 >= 5000) {
				super.anInt4509 = 0;
			}
			if (this.anInt4526 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!nd;)V")
	public void method3931(@OriginalArg(1) Class132_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(16) float local16 = 0.0F;
			@Pc(19) Object local19 = this.anObject5;
			@Pc(47) byte local47;
			synchronized (this.anObject5) {
				while (super.anInt4508 == 0) {
					this.anInt4526++;
					this.anObject5.wait();
					this.anInt4526--;
				}
				local47 = super.aByteArray58[super.anInt4507];
				if (arg0.anInt4645 >= 0) {
					if (local47 < 0 || local47 > 3) {
						local7 = true;
					}
				} else if (local47 >= 0 && local47 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray34[super.anInt4507];
					local16 = super.aFloatArray19[super.anInt4507];
					super.anObjectArray34[super.anInt4507] = null;
					super.anInt4507++;
					super.anInt4508--;
					if (super.anInt4507 >= 5000) {
						super.anInt4507 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt4645 >= 0) {
				if (local47 == 21) {
					Static77.method1591(arg0, (Class51) arg0.anObject6);
				} else if (local47 == 20) {
					@Pc(146) Class51 local146 = (Class51) arg0.anObject6;
					if (local146.aClass1_Sub1_2 != null) {
						local146.aClass1_Sub1_2.method5754(Static145.aClass37_8);
					}
					if (local146.aClass1_Sub1_1 != null) {
						local146.aClass1_Sub1_1.method5754(Static145.aClass37_8);
					}
					if (local146.aClass1_Sub3_2 != null) {
						local146.aClass1_Sub3_2.method5754(Static145.aClass37_8);
					}
					if (local146.aClass1_Sub3_1 != null) {
						local146.aClass1_Sub3_1.method5754(Static145.aClass37_8);
					}
					if (local146.aClass1_Sub4_1 != null) {
						local146.aClass1_Sub4_1.method5754(Static145.aClass37_8);
					}
					for (@Pc(189) Class11 local189 = local146.aClass11_2; local189 != null; local189 = local189.aClass11_1) {
						local189.aClass1_Sub2_1.method5754(Static145.aClass37_8);
					}
				} else if (local47 >= 30 && local47 <= 33) {
					Static145.aClass37_8.method3662(3000.0F, local16 * 1.5F);
					((Class105) arg0.anObject6).method4451(Static250.anInt5229, Static328.anInt6686, Static26.anInt3838, Static148.aBooleanArrayArray3, local47 - 30 == 0);
				} else if (local47 >= 40 && local47 <= 43) {
					Static145.aClass37_8.method3662(3000.0F, local16 * 1.5F);
					((Class105) arg0.anObject6).method4451(Static250.anInt5229, Static328.anInt6686, Static26.anInt3838, Static162.aBooleanArrayArray4, local47 - 40 == 0);
				} else if (local47 == 22) {
					Static145.aClass37_8.method3656();
				} else if (local47 == 23) {
					Static145.aClass37_8.method3747();
				} else if (local47 == 24) {
					Static145.aClass37_8.method3652(0, null);
				} else if (local47 >= 10 && local47 <= 13) {
					Static145.aClass37_8.method3647(arg0.anInt4645);
					arg0.anInt4645 = -1;
				}
			} else if (local47 >= 0 && local47 <= 3) {
				arg0.anInt4645 = local47;
				Static145.aClass37_8.method3678(local47);
			}
		} catch (@Pc(336) Exception local336) {
		} finally {
			@Pc(342) Object local342 = null;
			if (local7) {
				@Pc(402) Object local402 = this.anObject5;
				synchronized (this.anObject5) {
					super.anInt4506--;
					if (super.anInt4506 == 0) {
						this.anObject5.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)V")
	private void method3932(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4509] = (byte) arg0;
		super.anInt4509++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
		super.anInt4506++;
		super.anInt4508++;
		if (this.anInt4526 > 0) {
			@Pc(44) Object local44 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V")
	@Override
	public void method3926(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = 0;
		@Pc(18) Object local18 = this.anObject5;
		synchronized (this.anObject5) {
			@Pc(30) int local30;
			if (arg0 == this.anInt4527) {
				for (local30 = 0; local30 < this.anInt4527; local30++) {
					this.method3932(local15++);
				}
			} else {
				for (local30 = 0; local30 < this.anInt4527; local30++) {
					this.aClass132_Sub1Array1[local30].method3995();
				}
				this.anInt4527 = arg0;
				this.aClass132_Sub1Array1 = new Class132_Sub1[this.anInt4527];
				for (@Pc(78) int local78 = 0; local78 < this.anInt4527; local78++) {
					this.aClass132_Sub1Array1[local78] = new Class132_Sub1(this);
					this.aClass132_Sub1Array1[local78].method3999();
					this.method3932(local15++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
	@Override
	public void method3922(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4509] = (byte) arg0;
			super.anInt4509++;
			super.anInt4506++;
			if (super.anInt4509 >= 5000) {
				super.anInt4509 = 0;
			}
			super.anInt4508++;
			if (this.anInt4526 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	private void method3933(@OriginalArg(1) int arg0) {
		super.aByteArray58[super.anInt4509] = (byte) (arg0 + 10);
		super.anInt4509++;
		super.anInt4508++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
		super.anInt4506++;
		if (this.anInt4526 > 0) {
			@Pc(51) Object local51 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!dc;)V")
	@Override
	public void method3930(@OriginalArg(1) Class51 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.anInt4507--;
			if (super.anInt4507 < 0) {
				super.anInt4507 = 4999;
			}
			super.aByteArray58[super.anInt4507] = 21;
			super.anObjectArray34[super.anInt4507] = arg0;
			super.anInt4506++;
			super.anInt4508++;
			if (this.anInt4526 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!dc;B)V")
	@Override
	public void method3920(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4509] = 20;
			super.anObjectArray34[super.anInt4509] = arg0;
			super.anInt4509++;
			super.anInt4506++;
			if (super.anInt4509 >= 5000) {
				super.anInt4509 = 0;
			}
			super.anInt4508++;
			if (this.anInt4526 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZLclient!s;F)V")
	@Override
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) float arg3) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4509] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray34[super.anInt4509] = arg2;
			super.aFloatArray19[super.anInt4509] = arg3;
			super.anInt4509++;
			if (super.anInt4509 >= 5000) {
				super.anInt4509 = 0;
			}
			super.anInt4508++;
			super.anInt4506++;
			if (this.anInt4526 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	@Override
	public void method3924() {
		try {
			@Pc(12) Object local12 = this.anObject5;
			synchronized (this.anObject5) {
				while (super.anInt4506 != 0) {
					this.anObject5.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	@Override
	public void method3923() {
		@Pc(8) Object local8 = this.anObject5;
		synchronized (this.anObject5) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4527; local12++) {
				if (this.aClass132_Sub1Array1[local12].anInt4645 >= 0) {
					this.method3933(this.aClass132_Sub1Array1[local12].anInt4645);
				}
			}
		}
	}
}
