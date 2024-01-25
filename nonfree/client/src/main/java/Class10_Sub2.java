import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Ljava/lang/Object;")
	private final Object anObject9 = new Object();

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	private int anInt6513 = 0;

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
	private int anInt6515 = 0;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "[Lclient!ge;")
	private Class93_Sub1[] aClass93_Sub1Array1 = new Class93_Sub1[0];

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!oh;I)V")
	@Override
	public void method5383(@OriginalArg(0) Class189 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray83[super.anInt6500] = 21;
			super.anObjectArray36[super.anInt6500] = arg0;
			super.anInt6500++;
			super.anInt6503++;
			super.anInt6504++;
			if (super.anInt6500 >= 5000) {
				super.anInt6500 = 0;
			}
			if (this.anInt6515 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLclient!oh;)V")
	@Override
	public void method5382(@OriginalArg(1) Class189 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray83[super.anInt6500] = 20;
			super.anObjectArray36[super.anInt6500] = arg0;
			super.anInt6500++;
			super.anInt6503++;
			if (super.anInt6500 >= 5000) {
				super.anInt6500 = 0;
			}
			super.anInt6504++;
			if (this.anInt6515 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5375() {
		@Pc(8) Object local8 = this.anObject9;
		synchronized (this.anObject9) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6513; local18++) {
				if (this.aClass93_Sub1Array1[local18].anInt2151 >= 0) {
					this.method5387(this.aClass93_Sub1Array1[local18].anInt2151);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(II)V")
	private void method5386(@OriginalArg(1) int arg0) {
		super.aByteArray83[super.anInt6500] = (byte) arg0;
		super.anInt6500++;
		super.anInt6504++;
		super.anInt6503++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
		if (this.anInt6515 > 0) {
			@Pc(47) Object local47 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIFLclient!fo;Z)V")
	@Override
	public void method5384(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray83[super.anInt6500] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray36[super.anInt6500] = arg2;
			super.aFloatArray30[super.anInt6500] = arg1;
			super.anInt6500++;
			super.anInt6503++;
			if (super.anInt6500 >= 5000) {
				super.anInt6500 = 0;
			}
			super.anInt6504++;
			if (this.anInt6515 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!oh;I)V")
	@Override
	public void method5380(@OriginalArg(0) Class189 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.anInt6505--;
			if (super.anInt6505 < 0) {
				super.anInt6505 = 4999;
			}
			super.aByteArray83[super.anInt6505] = 21;
			super.anObjectArray36[super.anInt6505] = arg0;
			super.anInt6504++;
			super.anInt6503++;
			if (this.anInt6515 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	@Override
	public void method5374(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject9;
		synchronized (this.anObject9) {
			@Pc(18) int local18;
			if (arg0 == this.anInt6513) {
				for (local18 = 0; local18 < this.anInt6513; local18++) {
					this.method5386(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt6513; local18++) {
					this.aClass93_Sub1Array1[local18].method1993();
				}
				this.anInt6513 = arg0;
				this.aClass93_Sub1Array1 = new Class93_Sub1[this.anInt6513];
				for (@Pc(67) int local67 = 0; local67 < this.anInt6513; local67++) {
					this.aClass93_Sub1Array1[local67] = new Class93_Sub1(this);
					this.aClass93_Sub1Array1[local67].method1996();
					this.method5386(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	@Override
	public void method5381() {
		try {
			@Pc(8) Object local8 = this.anObject9;
			synchronized (this.anObject9) {
				while (true) {
					if (super.anInt6503 == 0) {
						break;
					}
					this.anObject9.wait();
				}
			}
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(II)V")
	private void method5387(@OriginalArg(0) int arg0) {
		super.aByteArray83[super.anInt6500] = (byte) (arg0 + 10);
		super.anInt6500++;
		super.anInt6504++;
		if (super.anInt6500 >= 5000) {
			super.anInt6500 = 0;
		}
		super.anInt6503++;
		if (this.anInt6515 > 0) {
			@Pc(53) Object local53 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
	@Override
	public void method5379(@OriginalArg(0) int arg0) {
		@Pc(11) Object local11 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray83[super.anInt6500] = (byte) arg0;
			super.anInt6500++;
			super.anInt6504++;
			super.anInt6503++;
			if (super.anInt6500 >= 5000) {
				super.anInt6500 = 0;
			}
			if (this.anInt6515 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method5388(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(19) float local19 = 0.0F;
			@Pc(22) Object local22 = this.anObject9;
			@Pc(53) byte local53;
			synchronized (this.anObject9) {
				while (super.anInt6504 == 0) {
					this.anInt6515++;
					this.anObject9.wait();
					this.anInt6515--;
				}
				local53 = super.aByteArray83[super.anInt6505];
				if (arg0.anInt2151 < 0) {
					if (local53 >= 0 && local53 <= 3) {
						local7 = true;
					}
				} else if (local53 < 0 || local53 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject3 = super.anObjectArray36[super.anInt6505];
					local19 = super.aFloatArray30[super.anInt6505];
					super.anObjectArray36[super.anInt6505] = null;
					super.anInt6505++;
					if (super.anInt6505 >= 5000) {
						super.anInt6505 = 0;
					}
					super.anInt6504--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt2151 < 0) {
				if (local53 >= 0 && local53 <= 3) {
					arg0.anInt2151 = local53;
					Static291.aClass28_132.method3490(local53);
				}
			} else if (local53 == 21) {
				Static367.method5805(arg0, (Class189) arg0.anObject3);
			} else if (local53 == 20) {
				@Pc(282) Class189 local282 = (Class189) arg0.anObject3;
				if (local282.aClass3_Sub1_1 != null) {
					local282.aClass3_Sub1_1.method5792(Static291.aClass28_132);
				}
				if (local282.aClass3_Sub1_2 != null) {
					local282.aClass3_Sub1_2.method5792(Static291.aClass28_132);
				}
				if (local282.aClass3_Sub4_3 != null) {
					local282.aClass3_Sub4_3.method5792(Static291.aClass28_132);
				}
				if (local282.aClass3_Sub4_2 != null) {
					local282.aClass3_Sub4_2.method5792(Static291.aClass28_132);
				}
				if (local282.aClass3_Sub5_1 != null) {
					local282.aClass3_Sub5_1.method5792(Static291.aClass28_132);
				}
				for (@Pc(325) Class242 local325 = local282.aClass242_2; local325 != null; local325 = local325.aClass242_4) {
					local325.aClass3_Sub3_2.method5792(Static291.aClass28_132);
				}
			} else if (local53 >= 30 && local53 <= 33) {
				Static291.aClass28_132.method3581(3000.0F, local19 * 1.5F);
				((Class84) arg0.anObject3).method5324(Static165.anInt2942, Static97.anInt1799, Static99.anInt1813, Static27.aBooleanArrayArray2, local53 - 30 == 0);
			} else if (local53 >= 40 && local53 <= 43) {
				Static291.aClass28_132.method3581(3000.0F, local19 * 1.5F);
				((Class84) arg0.anObject3).method5324(Static165.anInt2942, Static97.anInt1799, Static99.anInt1813, Static87.aBooleanArrayArray3, local53 - 40 == 0);
			} else if (local53 == 22) {
				Static291.aClass28_132.method3528();
			} else if (local53 == 23) {
				Static291.aClass28_132.method3546();
			} else if (local53 == 24) {
				Static291.aClass28_132.method3504(0, null);
			} else if (local53 >= 10 && local53 <= 13) {
				Static291.aClass28_132.method3498(arg0.anInt2151);
				arg0.anInt2151 = -1;
			}
		} catch (@Pc(346) Exception local346) {
		} finally {
			@Pc(352) Object local352 = null;
			if (local7) {
				@Pc(409) Object local409 = this.anObject9;
				synchronized (this.anObject9) {
					super.anInt6503--;
					if (super.anInt6503 == 0) {
						this.anObject9.notifyAll();
					}
				}
			}
		}
	}
}
