import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!os", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	private int anInt5133 = 0;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "[Lclient!og;")
	private Class183_Sub1[] aClass183_Sub1Array1 = new Class183_Sub1[0];

	@OriginalMember(owner = "client!os", name = "H", descriptor = "I")
	private int anInt5135 = 0;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ILclient!rb;)V")
	@Override
	public void method4093(@OriginalArg(1) Class216 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt5117--;
			if (super.anInt5117 < 0) {
				super.anInt5117 = 4999;
			}
			super.aByteArray76[super.anInt5117] = 21;
			super.anObjectArray36[super.anInt5117] = arg0;
			super.anInt5120++;
			super.anInt5115++;
			if (this.anInt5133 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!rb;)V")
	@Override
	public void method4086(@OriginalArg(1) Class216 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray76[super.anInt5114] = 20;
			super.anObjectArray36[super.anInt5114] = arg0;
			super.anInt5114++;
			super.anInt5120++;
			super.anInt5115++;
			if (super.anInt5114 >= 5000) {
				super.anInt5114 = 0;
			}
			if (this.anInt5133 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!og;I)V")
	public void method4095(@OriginalArg(0) Class183_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(22) Object local22 = this.anObject7;
			@Pc(53) byte local53;
			synchronized (this.anObject7) {
				while (super.anInt5115 == 0) {
					this.anInt5133++;
					this.anObject7.wait();
					this.anInt5133--;
				}
				local53 = super.aByteArray76[super.anInt5117];
				if (arg0.anInt5005 < 0) {
					if (local53 >= 0 && local53 <= 3) {
						local7 = true;
					}
				} else if (local53 < 0 || local53 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray36[super.anInt5117];
					local11 = super.aFloatArray33[super.anInt5117];
					super.anObjectArray36[super.anInt5117] = null;
					super.anInt5117++;
					super.anInt5115--;
					if (super.anInt5117 >= 5000) {
						super.anInt5117 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5005 < 0) {
				if (local53 >= 0 && local53 <= 3) {
					arg0.anInt5005 = local53;
					Static335.aClass117_6.method5722(local53);
				}
			} else if (local53 == 21) {
				Static218.method3116(arg0, (Class216) arg0.anObject6);
			} else if (local53 == 20) {
				@Pc(268) Class216 local268 = (Class216) arg0.anObject6;
				if (local268.aClass11_Sub3_3 != null) {
					local268.aClass11_Sub3_3.method5182(Static335.aClass117_6);
				}
				if (local268.aClass11_Sub3_2 != null) {
					local268.aClass11_Sub3_2.method5182(Static335.aClass117_6);
				}
				if (local268.aClass11_Sub4_2 != null) {
					local268.aClass11_Sub4_2.method5182(Static335.aClass117_6);
				}
				if (local268.aClass11_Sub4_1 != null) {
					local268.aClass11_Sub4_1.method5182(Static335.aClass117_6);
				}
				if (local268.aClass11_Sub2_2 != null) {
					local268.aClass11_Sub2_2.method5182(Static335.aClass117_6);
				}
				for (@Pc(311) Class259 local311 = local268.aClass259_1; local311 != null; local311 = local311.aClass259_4) {
					local311.aClass11_Sub1_2.method5182(Static335.aClass117_6);
				}
			} else if (local53 >= 30 && local53 <= 33) {
				Static335.aClass117_6.da(3000.0F, local11 * 1.5F);
				((Class139) arg0.anObject6).method5362(Static166.anInt2722, Static44.anInt638, Static99.anInt1331, Static84.aBooleanArrayArray3, local53 - 30 == 0);
			} else if (local53 >= 40 && local53 <= 43) {
				Static335.aClass117_6.da(3000.0F, local11 * 1.5F);
				((Class139) arg0.anObject6).method5362(Static166.anInt2722, Static44.anInt638, Static99.anInt1331, Static81.aBooleanArrayArray2, local53 - 40 == 0);
			} else if (local53 == 22) {
				Static335.aClass117_6.s(-1, 1583160, 40, 127);
			} else if (local53 == 23) {
				Static335.aClass117_6.n();
			} else if (local53 == 24) {
				Static335.aClass117_6.method5693(0, null);
			} else if (local53 >= 10 && local53 <= 13) {
				Static335.aClass117_6.method5684(arg0.anInt5005);
				arg0.anInt5005 = -1;
			}
		} catch (@Pc(328) Exception local328) {
		} finally {
			@Pc(334) Object local334 = null;
			if (local7) {
				@Pc(394) Object local394 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt5120--;
					if (super.anInt5120 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	@Override
	public void method4082() {
		@Pc(4) Object local4 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt5135; local8++) {
				if (this.aClass183_Sub1Array1[local8].anInt5005 >= 0) {
					this.method4097(this.aClass183_Sub1Array1[local8].anInt5005);
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
	private void method4097(@OriginalArg(0) int arg0) {
		super.aByteArray76[super.anInt5114] = (byte) (arg0 + 10);
		super.anInt5114++;
		super.anInt5120++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
		super.anInt5115++;
		if (this.anInt5133 > 0) {
			@Pc(51) Object local51 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
	@Override
	public void method4085() {
		try {
			@Pc(4) Object local4 = this.anObject7;
			synchronized (this.anObject7) {
				while (true) {
					if (super.anInt5120 == 0) {
						break;
					}
					this.anObject7.wait();
				}
			}
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
	private void method4099(@OriginalArg(0) int arg0) {
		super.aByteArray76[super.anInt5114] = (byte) arg0;
		super.anInt5114++;
		super.anInt5115++;
		super.anInt5120++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
		if (this.anInt5133 > 0) {
			@Pc(48) Object local48 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!rb;)V")
	@Override
	public void method4091(@OriginalArg(1) Class216 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray76[super.anInt5114] = 21;
			super.anObjectArray36[super.anInt5114] = arg0;
			super.anInt5114++;
			super.anInt5120++;
			super.anInt5115++;
			if (super.anInt5114 >= 5000) {
				super.anInt5114 = 0;
			}
			if (this.anInt5133 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZILclient!ya;FI)V")
	@Override
	public void method4087(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class139 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray76[super.anInt5114] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray36[super.anInt5114] = arg1;
			super.aFloatArray33[super.anInt5114] = arg2;
			super.anInt5114++;
			super.anInt5115++;
			super.anInt5120++;
			if (super.anInt5114 >= 5000) {
				super.anInt5114 = 0;
			}
			if (this.anInt5133 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
	@Override
	public void method4090(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray76[super.anInt5114] = (byte) arg0;
			super.anInt5114++;
			super.anInt5120++;
			super.anInt5115++;
			if (super.anInt5114 >= 5000) {
				super.anInt5114 = 0;
			}
			if (this.anInt5133 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	@Override
	public void method4092(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(18) int local18;
			if (arg0 == this.anInt5135) {
				for (local18 = 0; local18 < this.anInt5135; local18++) {
					this.method4099(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt5135; local18++) {
					this.aClass183_Sub1Array1[local18].method3984();
				}
				this.anInt5135 = arg0;
				this.aClass183_Sub1Array1 = new Class183_Sub1[this.anInt5135];
				for (@Pc(62) int local62 = 0; local62 < this.anInt5135; local62++) {
					this.aClass183_Sub1Array1[local62] = new Class183_Sub1(this);
					this.aClass183_Sub1Array1[local62].method3982();
					this.method4099(local7++);
				}
			}
		}
	}
}
