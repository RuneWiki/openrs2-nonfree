import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class89_Sub2 extends Class89 {

	@OriginalMember(owner = "client!io", name = "v", descriptor = "Ljava/lang/Object;")
	private final Object anObject10 = new Object();

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	private int anInt4594 = 0;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "I")
	private int anInt4596 = 0;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[Lclient!pq;")
	private Class51_Sub1[] aClass51_Sub1Array1 = new Class51_Sub1[0];

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
	@Override
	public void method3863(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject10;
		synchronized (this.anObject10) {
			@Pc(18) int local18;
			if (this.anInt4594 == arg0) {
				for (local18 = 0; local18 < this.anInt4594; local18++) {
					this.method3876(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt4594; local18++) {
					this.aClass51_Sub1Array1[local18].method6652();
				}
				this.anInt4594 = arg0;
				this.aClass51_Sub1Array1 = new Class51_Sub1[this.anInt4594];
				for (@Pc(72) int local72 = 0; local72 < this.anInt4594; local72++) {
					this.aClass51_Sub1Array1[local72] = new Class51_Sub1(this);
					this.aClass51_Sub1Array1[local72].method6651();
					this.method3876(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V")
	private void method3871(@OriginalArg(0) int arg0) {
		super.aByteArray57[super.anInt4579] = (byte) (arg0 + 10);
		super.anInt4579++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
		super.anInt4578++;
		super.anInt4581++;
		if (this.anInt4596 > 0) {
			@Pc(49) Object local49 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!pq;)V")
	public void method3873(@OriginalArg(1) Class51_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject10;
			@Pc(51) byte local51;
			synchronized (this.anObject10) {
				while (super.anInt4581 == 0) {
					this.anInt4596++;
					this.anObject10.wait();
					this.anInt4596--;
				}
				local51 = super.aByteArray57[super.anInt4580];
				if (arg0.anInt8064 >= 0) {
					if (local51 < 0 || local51 > 3) {
						local7 = true;
					}
				} else if (local51 >= 0 && local51 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject14 = super.anObjectArray3[super.anInt4580];
					super.anObjectArray3[super.anInt4580] = null;
					super.anInt4580++;
					super.anInt4581--;
					if (super.anInt4580 >= 5000) {
						super.anInt4580 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt8064 >= 0) {
				if (local51 == 21) {
					Static386.method6189(arg0, (Class125) arg0.anObject14);
				} else if (local51 == 20) {
					@Pc(137) Class125 local137 = (Class125) arg0.anObject14;
					if (local137.aClass2_Sub4_1 != null) {
						local137.aClass2_Sub4_1.method8384(Static338.aClass15_11);
					}
					if (local137.aClass2_Sub4_2 != null) {
						local137.aClass2_Sub4_2.method8384(Static338.aClass15_11);
					}
					if (local137.aClass2_Sub3_2 != null) {
						local137.aClass2_Sub3_2.method8384(Static338.aClass15_11);
					}
					if (local137.aClass2_Sub3_1 != null) {
						local137.aClass2_Sub3_1.method8384(Static338.aClass15_11);
					}
					if (local137.aClass2_Sub1_1 != null) {
						local137.aClass2_Sub1_1.method8384(Static338.aClass15_11);
					}
					for (@Pc(180) Class302 local180 = local137.aClass302_1; local180 != null; local180 = local180.aClass302_2) {
						local180.aClass2_Sub2_1.method8384(Static338.aClass15_11);
					}
				} else if (local51 >= 30 && local51 <= 33) {
					((Class4) arg0.anObject14).method8443(Static342.anInt6991, Static484.anInt9030, Static403.anInt7929, Static331.aBooleanArrayArray3, local51 - 30 == 0);
				} else if (local51 >= 40 && local51 <= 43) {
					((Class4) arg0.anObject14).method8443(Static342.anInt6991, Static484.anInt9030, Static403.anInt7929, Static281.aBooleanArrayArray2, local51 - 40 == 0);
				} else if (local51 == 22) {
					Static338.aClass15_11.AA(-1, 1583160, 40, 127);
				} else if (local51 == 23) {
					Static338.aClass15_11.k();
				} else if (local51 == 24) {
					Static338.aClass15_11.method5353(0, null);
				} else if (local51 >= 10 && local51 <= 13) {
					Static338.aClass15_11.method5340(arg0.anInt8064);
					arg0.anInt8064 = -1;
				}
			} else if (local51 >= 0 && local51 <= 3) {
				arg0.anInt8064 = local51;
				Static338.aClass15_11.method5317(local51);
			}
		} catch (@Pc(319) Exception local319) {
		} finally {
			@Pc(325) Object local325 = null;
			if (local7) {
				@Pc(413) Object local413 = this.anObject10;
				synchronized (this.anObject10) {
					super.anInt4578--;
					if (super.anInt4578 == 0) {
						this.anObject10.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	@Override
	public void method3864() {
		try {
			@Pc(4) Object local4 = this.anObject10;
			synchronized (this.anObject10) {
				while (true) {
					if (super.anInt4578 == 0) {
						break;
					}
					this.anObject10.wait();
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!gn;)V")
	@Override
	public void method3865(@OriginalArg(1) Class125 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.anInt4580--;
			if (super.anInt4580 < 0) {
				super.anInt4580 = 4999;
			}
			super.aByteArray57[super.anInt4580] = 21;
			super.anObjectArray3[super.anInt4580] = arg0;
			super.anInt4578++;
			super.anInt4581++;
			if (this.anInt4596 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method3867() {
		@Pc(8) Object local8 = this.anObject10;
		synchronized (this.anObject10) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4594; local12++) {
				if (this.aClass51_Sub1Array1[local12].anInt8064 >= 0) {
					this.method3871(this.aClass51_Sub1Array1[local12].anInt8064);
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(II)V")
	private void method3876(@OriginalArg(0) int arg0) {
		super.aByteArray57[super.anInt4579] = (byte) arg0;
		super.anInt4579++;
		super.anInt4578++;
		super.anInt4581++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
		if (this.anInt4596 > 0) {
			@Pc(51) Object local51 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	@Override
	public void method3862(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray57[super.anInt4579] = (byte) arg0;
			super.anInt4579++;
			if (super.anInt4579 >= 5000) {
				super.anInt4579 = 0;
			}
			super.anInt4581++;
			super.anInt4578++;
			if (this.anInt4596 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!gn;Z)V")
	@Override
	public void method3870(@OriginalArg(0) Class125 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray57[super.anInt4579] = 21;
			super.anObjectArray3[super.anInt4579] = arg0;
			super.anInt4579++;
			super.anInt4581++;
			if (super.anInt4579 >= 5000) {
				super.anInt4579 = 0;
			}
			super.anInt4578++;
			if (this.anInt4596 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZBLclient!d;I)V")
	@Override
	public void method3866(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray57[super.anInt4579] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray3[super.anInt4579] = arg1;
			super.anInt4579++;
			super.anInt4578++;
			if (super.anInt4579 >= 5000) {
				super.anInt4579 = 0;
			}
			super.anInt4581++;
			if (this.anInt4596 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!gn;I)V")
	@Override
	public void method3868(@OriginalArg(0) Class125 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray57[super.anInt4579] = 20;
			super.anObjectArray3[super.anInt4579] = arg0;
			super.anInt4579++;
			super.anInt4578++;
			if (super.anInt4579 >= 5000) {
				super.anInt4579 = 0;
			}
			super.anInt4581++;
			if (this.anInt4596 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}
}
