import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
	private int anInt6486 = 0;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "[Lclient!fb;")
	private Class64_Sub1[] aClass64_Sub1Array1 = new Class64_Sub1[0];

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
	private int anInt6487 = 0;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	private void method5720(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6462] = (byte) (arg0 + 10);
		super.anInt6462++;
		super.anInt6468++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
		super.anInt6467++;
		if (this.anInt6486 > 0) {
			@Pc(54) Object local54 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	@Override
	public void method5716() {
		try {
			@Pc(6) Object local6 = this.anObject8;
			synchronized (this.anObject8) {
				while (super.anInt6467 != 0) {
					this.anObject8.wait();
				}
			}
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!dn;)V")
	@Override
	public void method5710(@OriginalArg(1) Class51 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt6460--;
			if (super.anInt6460 < 0) {
				super.anInt6460 = 4999;
			}
			super.aByteArray93[super.anInt6460] = 21;
			super.anObjectArray35[super.anInt6460] = arg0;
			super.anInt6467++;
			super.anInt6468++;
			if (this.anInt6486 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!dn;B)V")
	@Override
	public void method5717(@OriginalArg(0) Class51 arg0) {
		@Pc(14) Object local14 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray93[super.anInt6462] = 20;
			super.anObjectArray35[super.anInt6462] = arg0;
			super.anInt6462++;
			if (super.anInt6462 >= 5000) {
				super.anInt6462 = 0;
			}
			super.anInt6467++;
			super.anInt6468++;
			if (this.anInt6486 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!fb;)V")
	public void method5725(@OriginalArg(1) Class64_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject8;
			@Pc(50) byte local50;
			synchronized (this.anObject8) {
				while (super.anInt6468 == 0) {
					this.anInt6486++;
					this.anObject8.wait();
					this.anInt6486--;
				}
				local50 = super.aByteArray93[super.anInt6460];
				if (arg0.anInt1948 < 0) {
					if (local50 >= 0 && local50 <= 3) {
						local7 = true;
					}
				} else if (local50 < 0 || local50 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject4 = super.anObjectArray35[super.anInt6460];
					local11 = super.aFloatArray29[super.anInt6460];
					super.anObjectArray35[super.anInt6460] = null;
					super.anInt6460++;
					super.anInt6468--;
					if (super.anInt6460 >= 5000) {
						super.anInt6460 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt1948 < 0) {
				if (local50 >= 0 && local50 <= 3) {
					arg0.anInt1948 = local50;
					Static98.aClass59_3.method4847(local50);
				}
			} else if (local50 == 21) {
				Static230.method3968(arg0, (Class51) arg0.anObject4);
			} else if (local50 == 20) {
				@Pc(164) Class51 local164 = (Class51) arg0.anObject4;
				if (local164.aClass25_Sub2_1 != null) {
					local164.aClass25_Sub2_1.method5583(Static98.aClass59_3);
				}
				if (local164.aClass25_Sub2_2 != null) {
					local164.aClass25_Sub2_2.method5583(Static98.aClass59_3);
				}
				if (local164.aClass25_Sub3_2 != null) {
					local164.aClass25_Sub3_2.method5583(Static98.aClass59_3);
				}
				if (local164.aClass25_Sub3_1 != null) {
					local164.aClass25_Sub3_1.method5583(Static98.aClass59_3);
				}
				if (local164.aClass25_Sub4_1 != null) {
					local164.aClass25_Sub4_1.method5583(Static98.aClass59_3);
				}
				for (@Pc(207) Class103 local207 = local164.aClass103_1; local207 != null; local207 = local207.aClass103_2) {
					local207.aClass25_Sub1_1.method5583(Static98.aClass59_3);
				}
			} else if (local50 >= 30 && local50 <= 33) {
				Static98.aClass59_3.method4859(3000.0F, local11 * 1.5F);
				((Class3) arg0.anObject4).method5635(Static210.anInt5625, Static103.anInt2249, Static98.anInt2185, Static240.aBooleanArrayArray31, local50 - 30 == 0);
			} else if (local50 >= 40 && local50 <= 43) {
				Static98.aClass59_3.method4859(3000.0F, local11 * 1.5F);
				((Class3) arg0.anObject4).method5635(Static210.anInt5625, Static103.anInt2249, Static98.anInt2185, Static187.aBooleanArrayArray43, local50 - 40 == 0);
			} else if (local50 == 22) {
				Static98.aClass59_3.method4822();
			} else if (local50 == 23) {
				Static98.aClass59_3.method4858();
			} else if (local50 == 24) {
				Static98.aClass59_3.method4885(0, null);
			} else if (local50 >= 10 && local50 <= 13) {
				Static98.aClass59_3.method4852(arg0.anInt1948);
				arg0.anInt1948 = -1;
			}
		} catch (@Pc(332) Exception local332) {
		} finally {
			@Pc(338) Object local338 = null;
			if (local7) {
				@Pc(432) Object local432 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt6467--;
					if (super.anInt6467 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IFLclient!ac;ZI)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray93[super.anInt6462] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray35[super.anInt6462] = arg2;
			super.aFloatArray29[super.anInt6462] = arg1;
			super.anInt6462++;
			if (super.anInt6462 >= 5000) {
				super.anInt6462 = 0;
			}
			super.anInt6468++;
			super.anInt6467++;
			if (this.anInt6486 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	@Override
	public void method5718() {
		@Pc(15) Object local15 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt6487; local19++) {
				if (this.aClass64_Sub1Array1[local19].anInt1948 >= 0) {
					this.method5720(this.aClass64_Sub1Array1[local19].anInt1948);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!dn;I)V")
	@Override
	public void method5715(@OriginalArg(0) Class51 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray93[super.anInt6462] = 21;
			super.anObjectArray35[super.anInt6462] = arg0;
			super.anInt6462++;
			super.anInt6467++;
			super.anInt6468++;
			if (super.anInt6462 >= 5000) {
				super.anInt6462 = 0;
			}
			if (this.anInt6486 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	@Override
	public void method5719(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray93[super.anInt6462] = (byte) arg0;
			super.anInt6462++;
			super.anInt6467++;
			if (super.anInt6462 >= 5000) {
				super.anInt6462 = 0;
			}
			super.anInt6468++;
			if (this.anInt6486 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V")
	@Override
	public void method5711(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject8;
		synchronized (this.anObject8) {
			@Pc(18) int local18;
			if (arg0 == this.anInt6487) {
				for (local18 = 0; local18 < this.anInt6487; local18++) {
					this.method5727(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt6487; local18++) {
					this.aClass64_Sub1Array1[local18].method1793();
				}
				this.anInt6487 = arg0;
				this.aClass64_Sub1Array1 = new Class64_Sub1[this.anInt6487];
				for (@Pc(73) int local73 = 0; local73 < this.anInt6487; local73++) {
					this.aClass64_Sub1Array1[local73] = new Class64_Sub1(this);
					this.aClass64_Sub1Array1[local73].method1792();
					this.method5727(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V")
	private void method5727(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt6462] = (byte) arg0;
		super.anInt6462++;
		super.anInt6468++;
		super.anInt6467++;
		if (super.anInt6462 >= 5000) {
			super.anInt6462 = 0;
		}
		if (this.anInt6486 > 0) {
			@Pc(46) Object local46 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}
}
