import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Ljava/lang/Object;")
	private final Object anObject4 = new Object();

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "[Lclient!lb;")
	private Class128_Sub1[] aClass128_Sub1Array1 = new Class128_Sub1[0];

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
	private int anInt2878 = 0;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
	private int anInt2879 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
	private void method2658(@OriginalArg(0) int arg0) {
		super.aByteArray35[super.anInt3200] = (byte) arg0;
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
		super.anInt3205++;
		super.anInt3199++;
		if (this.anInt2878 > 0) {
			@Pc(50) Object local50 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!dg;I)V")
	@Override
	public void method2939(@OriginalArg(0) Class49 arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.anInt3204--;
			if (super.anInt3204 < 0) {
				super.anInt3204 = 4999;
			}
			super.aByteArray35[super.anInt3204] = 21;
			super.anObjectArray33[super.anInt3204] = arg0;
			super.anInt3199++;
			super.anInt3205++;
			if (this.anInt2878 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
	private void method2659(@OriginalArg(1) int arg0) {
		super.aByteArray35[super.anInt3200] = (byte) (arg0 + 10);
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
		super.anInt3199++;
		super.anInt3205++;
		if (this.anInt2878 > 0) {
			@Pc(46) Object local46 = this.anObject4;
			synchronized (this.anObject4) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!dg;)V")
	@Override
	public void method2943(@OriginalArg(1) Class49 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray35[super.anInt3200] = 20;
			super.anObjectArray33[super.anInt3200] = arg0;
			super.anInt3200++;
			if (super.anInt3200 >= 5000) {
				super.anInt3200 = 0;
			}
			super.anInt3199++;
			super.anInt3205++;
			if (this.anInt2878 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!lb;)V")
	public void method2662(@OriginalArg(1) Class128_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject4;
			@Pc(45) byte local45;
			synchronized (this.anObject4) {
				while (super.anInt3199 == 0) {
					this.anInt2878++;
					this.anObject4.wait();
					this.anInt2878--;
				}
				local45 = super.aByteArray35[super.anInt3204];
				if (arg0.anInt3700 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray33[super.anInt3204];
					local11 = super.aFloatArray16[super.anInt3204];
					super.anObjectArray33[super.anInt3204] = null;
					super.anInt3204++;
					super.anInt3199--;
					if (super.anInt3204 >= 5000) {
						super.anInt3204 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3700 >= 0) {
				if (local45 == 21) {
					Static292.method4787(arg0, (Class49) arg0.anObject6);
				} else if (local45 == 20) {
					@Pc(149) Class49 local149 = (Class49) arg0.anObject6;
					if (local149.aClass22_Sub4_1 != null) {
						local149.aClass22_Sub4_1.method5341(Static331.aClass89_8);
					}
					if (local149.aClass22_Sub4_2 != null) {
						local149.aClass22_Sub4_2.method5341(Static331.aClass89_8);
					}
					if (local149.aClass22_Sub5_2 != null) {
						local149.aClass22_Sub5_2.method5341(Static331.aClass89_8);
					}
					if (local149.aClass22_Sub5_1 != null) {
						local149.aClass22_Sub5_1.method5341(Static331.aClass89_8);
					}
					if (local149.aClass22_Sub1_1 != null) {
						local149.aClass22_Sub1_1.method5341(Static331.aClass89_8);
					}
					for (@Pc(194) Class47 local194 = local149.aClass47_3; local194 != null; local194 = local194.aClass47_2) {
						local194.aClass22_Sub2_1.method5341(Static331.aClass89_8);
					}
				} else if (local45 >= 30 && local45 <= 33) {
					Static331.aClass89_8.method5463(3000.0F, local11 * 1.5F);
					((Class8) arg0.anObject6).method4166(Static314.anInt6028, Static206.anInt4117, Static52.anInt1395, Static65.aBooleanArrayArray1, local45 - 30 == 0);
				} else if (local45 >= 40 && local45 <= 43) {
					Static331.aClass89_8.method5463(3000.0F, local11 * 1.5F);
					((Class8) arg0.anObject6).method4166(Static314.anInt6028, Static206.anInt4117, Static52.anInt1395, Static86.aBooleanArrayArray2, local45 - 40 == 0);
				} else if (local45 == 22) {
					Static331.aClass89_8.method5452();
				} else if (local45 == 23) {
					Static331.aClass89_8.method5474();
				} else if (local45 == 24) {
					Static331.aClass89_8.method5470(0, null);
				} else if (local45 >= 10 && local45 <= 13) {
					Static331.aClass89_8.method5407(arg0.anInt3700);
					arg0.anInt3700 = -1;
				}
			} else if (local45 >= 0 && local45 <= 3) {
				arg0.anInt3700 = local45;
				Static331.aClass89_8.method5420(local45);
			}
		} catch (@Pc(339) Exception local339) {
		} finally {
			@Pc(345) Object local345 = null;
			if (local7) {
				@Pc(402) Object local402 = this.anObject4;
				synchronized (this.anObject4) {
					super.anInt3205--;
					if (super.anInt3205 == 0) {
						this.anObject4.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	@Override
	public void method2942() {
		try {
			@Pc(8) Object local8 = this.anObject4;
			synchronized (this.anObject4) {
				while (super.anInt3205 != 0) {
					this.anObject4.wait();
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	@Override
	public void method2940(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject4;
		synchronized (this.anObject4) {
			@Pc(22) int local22;
			if (this.anInt2879 == arg0) {
				for (local22 = 0; local22 < this.anInt2879; local22++) {
					this.method2658(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt2879; local22++) {
					this.aClass128_Sub1Array1[local22].method3338();
				}
				this.anInt2879 = arg0;
				this.aClass128_Sub1Array1 = new Class128_Sub1[this.anInt2879];
				for (@Pc(76) int local76 = 0; local76 < this.anInt2879; local76++) {
					this.aClass128_Sub1Array1[local76] = new Class128_Sub1(this);
					this.aClass128_Sub1Array1[local76].method3337();
					this.method2658(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!dg;)V")
	@Override
	public void method2937(@OriginalArg(1) Class49 arg0) {
		@Pc(6) Object local6 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray35[super.anInt3200] = 21;
			super.anObjectArray33[super.anInt3200] = arg0;
			super.anInt3200++;
			super.anInt3199++;
			super.anInt3205++;
			if (super.anInt3200 >= 5000) {
				super.anInt3200 = 0;
			}
			if (this.anInt2878 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	@Override
	public void method2936(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray35[super.anInt3200] = (byte) arg0;
			super.anInt3200++;
			super.anInt3199++;
			super.anInt3205++;
			if (super.anInt3200 >= 5000) {
				super.anInt3200 = 0;
			}
			if (this.anInt2878 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	@Override
	public void method2944() {
		@Pc(8) Object local8 = this.anObject4;
		synchronized (this.anObject4) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2879; local12++) {
				if (this.aClass128_Sub1Array1[local12].anInt3700 >= 0) {
					this.method2659(this.aClass128_Sub1Array1[local12].anInt3700);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFZILclient!sa;)V")
	@Override
	public void method2938(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3) {
		@Pc(2) Object local2 = this.anObject4;
		synchronized (this.anObject4) {
			super.aByteArray35[super.anInt3200] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray33[super.anInt3200] = arg3;
			super.aFloatArray16[super.anInt3200] = arg0;
			super.anInt3200++;
			if (super.anInt3200 >= 5000) {
				super.anInt3200 = 0;
			}
			super.anInt3199++;
			super.anInt3205++;
			if (this.anInt2878 > 0) {
				this.anObject4.notifyAll();
			}
		}
	}
}
