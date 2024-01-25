import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[Lclient!ga;")
	private Class96_Sub1[] aClass96_Sub1Array1 = new Class96_Sub1[0];

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt4097 = 0;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt4098 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
	private void method3644(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt4078] = (byte) (arg0 + 10);
		super.anInt4078++;
		super.anInt4082++;
		super.anInt4083++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
		if (this.anInt4098 > 0) {
			@Pc(50) Object local50 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!nj;I)V")
	@Override
	public void method3642(@OriginalArg(0) Class206 arg0) {
		@Pc(16) Object local16 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray62[super.anInt4078] = 20;
			super.anObjectArray3[super.anInt4078] = arg0;
			super.anInt4078++;
			super.anInt4083++;
			if (super.anInt4078 >= 5000) {
				super.anInt4078 = 0;
			}
			super.anInt4082++;
			if (this.anInt4098 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Lclient!nj;B)V")
	@Override
	public void method3643(@OriginalArg(0) Class206 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray62[super.anInt4078] = 21;
			super.anObjectArray3[super.anInt4078] = arg0;
			super.anInt4078++;
			super.anInt4083++;
			super.anInt4082++;
			if (super.anInt4078 >= 5000) {
				super.anInt4078 = 0;
			}
			if (this.anInt4098 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ga;B)V")
	public void method3645(@OriginalArg(0) Class96_Sub1 arg0) {
		@Pc(17) boolean local17 = false;
		try {
			@Pc(21) float local21 = 0.0F;
			@Pc(24) Object local24 = this.anObject7;
			@Pc(52) byte local52;
			synchronized (this.anObject7) {
				while (super.anInt4083 == 0) {
					this.anInt4098++;
					this.anObject7.wait();
					this.anInt4098--;
				}
				local52 = super.aByteArray62[super.anInt4085];
				if (arg0.anInt3342 < 0) {
					if (local52 >= 0 && local52 <= 3) {
						local17 = true;
					}
				} else if (local52 < 0 || local52 > 3) {
					local17 = true;
				}
				if (local17) {
					arg0.anObject6 = super.anObjectArray3[super.anInt4085];
					local21 = super.aFloatArray35[super.anInt4085];
					super.anObjectArray3[super.anInt4085] = null;
					super.anInt4085++;
					if (super.anInt4085 >= 5000) {
						super.anInt4085 = 0;
					}
					super.anInt4083--;
				}
			}
			if (!local17) {
				Thread.yield();
			} else if (arg0.anInt3342 < 0) {
				if (local52 >= 0 && local52 <= 3) {
					arg0.anInt3342 = local52;
					Static423.aClass9_12.method7596(local52);
				}
			} else if (local52 == 21) {
				Static248.method4195(arg0, (Class206) arg0.anObject6);
			} else if (local52 == 20) {
				@Pc(266) Class206 local266 = (Class206) arg0.anObject6;
				if (local266.aClass47_Sub4_2 != null) {
					local266.aClass47_Sub4_2.method7161(Static423.aClass9_12);
				}
				if (local266.aClass47_Sub4_1 != null) {
					local266.aClass47_Sub4_1.method7161(Static423.aClass9_12);
				}
				if (local266.aClass47_Sub5_1 != null) {
					local266.aClass47_Sub5_1.method7161(Static423.aClass9_12);
				}
				if (local266.aClass47_Sub5_2 != null) {
					local266.aClass47_Sub5_2.method7161(Static423.aClass9_12);
				}
				if (local266.aClass47_Sub3_1 != null) {
					local266.aClass47_Sub3_1.method7161(Static423.aClass9_12);
				}
				for (@Pc(313) Class168 local313 = local266.aClass168_2; local313 != null; local313 = local313.aClass168_1) {
					local313.aClass47_Sub2_2.method7161(Static423.aClass9_12);
				}
			} else if (local52 >= 30 && local52 <= 33) {
				Static423.aClass9_12.la(3000.0F, local21 * 1.5F);
				((Class10) arg0.anObject6).method6332(Static406.anInt7107, Static265.anInt5150, Static278.anInt5506, Static339.aBooleanArrayArray4, local52 - 30 == 0);
			} else if (local52 >= 40 && local52 <= 43) {
				Static423.aClass9_12.la(3000.0F, local21 * 1.5F);
				((Class10) arg0.anObject6).method6332(Static406.anInt7107, Static265.anInt5150, Static278.anInt5506, Static213.aBooleanArrayArray2, local52 - 40 == 0);
			} else if (local52 == 22) {
				Static423.aClass9_12.q(-1, 1583160, 40, 127);
			} else if (local52 == 23) {
				Static423.aClass9_12.xa();
			} else if (local52 == 24) {
				Static423.aClass9_12.method7588(0, null);
			} else if (local52 >= 10 && local52 <= 13) {
				Static423.aClass9_12.method7584(arg0.anInt3342);
				arg0.anInt3342 = -1;
			}
		} catch (@Pc(339) Exception local339) {
		} finally {
			@Pc(345) Object local345 = null;
			if (local17) {
				@Pc(405) Object local405 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt4082--;
					if (super.anInt4082 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(28) int local28;
			if (this.anInt4097 == arg0) {
				for (local28 = 0; local28 < this.anInt4097; local28++) {
					this.method3647(local7++);
				}
			} else {
				for (local28 = 0; local28 < this.anInt4097; local28++) {
					this.aClass96_Sub1Array1[local28].method2997();
				}
				this.anInt4097 = arg0;
				this.aClass96_Sub1Array1 = new Class96_Sub1[this.anInt4097];
				for (@Pc(72) int local72 = 0; local72 < this.anInt4097; local72++) {
					this.aClass96_Sub1Array1[local72] = new Class96_Sub1(this);
					this.aClass96_Sub1Array1[local72].method3000();
					this.method3647(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	private void method3647(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt4078] = (byte) arg0;
		super.anInt4078++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
		super.anInt4083++;
		super.anInt4082++;
		if (this.anInt4098 > 0) {
			@Pc(41) Object local41 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!nj;B)V")
	@Override
	public void method3638(@OriginalArg(0) Class206 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt4085--;
			if (super.anInt4085 < 0) {
				super.anInt4085 = 4999;
			}
			super.aByteArray62[super.anInt4085] = 21;
			super.anObjectArray3[super.anInt4085] = arg0;
			super.anInt4083++;
			super.anInt4082++;
			if (this.anInt4098 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IFLclient!sa;ZI)V")
	@Override
	public void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray62[super.anInt4078] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray3[super.anInt4078] = arg2;
			super.aFloatArray35[super.anInt4078] = arg1;
			super.anInt4078++;
			super.anInt4083++;
			if (super.anInt4078 >= 5000) {
				super.anInt4078 = 0;
			}
			super.anInt4082++;
			if (this.anInt4098 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	@Override
	public void method3639(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray62[super.anInt4078] = (byte) arg0;
			super.anInt4078++;
			if (super.anInt4078 >= 5000) {
				super.anInt4078 = 0;
			}
			super.anInt4082++;
			super.anInt4083++;
			if (this.anInt4098 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	@Override
	public void method3636() {
		try {
			@Pc(8) Object local8 = this.anObject7;
			synchronized (this.anObject7) {
				while (true) {
					if (super.anInt4082 == 0) {
						break;
					}
					this.anObject7.wait();
				}
			}
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	@Override
	public void method3633() {
		@Pc(4) Object local4 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt4097; local8++) {
				if (this.aClass96_Sub1Array1[local8].anInt3342 >= 0) {
					this.method3644(this.aClass96_Sub1Array1[local8].anInt3342);
				}
			}
		}
	}
}
