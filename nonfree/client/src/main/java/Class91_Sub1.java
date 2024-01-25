import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Ljava/lang/Object;")
	private final Object anObject5 = new Object();

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	private int anInt2563 = 0;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	private int anInt2560 = 0;

	@OriginalMember(owner = "client!id", name = "E", descriptor = "[Lclient!rf;")
	private Class76_Sub1[] aClass76_Sub1Array1 = new Class76_Sub1[0];

	static {
		new Class85("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)V")
	private void method2363(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4216] = (byte) (arg0 + 10);
		super.anInt4216++;
		super.anInt4215++;
		super.anInt4212++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
		if (this.anInt2560 > 0) {
			@Pc(52) Object local52 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method3911(@OriginalArg(0) Class174 arg0) {
		@Pc(8) Object local8 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4216] = 21;
			super.anObjectArray5[super.anInt4216] = arg0;
			super.anInt4216++;
			super.anInt4212++;
			if (super.anInt4216 >= 5000) {
				super.anInt4216 = 0;
			}
			super.anInt4215++;
			if (this.anInt2560 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rf;I)V")
	public void method2364(@OriginalArg(0) Class76_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject5;
			@Pc(51) byte local51;
			synchronized (this.anObject5) {
				while (super.anInt4215 == 0) {
					this.anInt2560++;
					this.anObject5.wait();
					this.anInt2560--;
				}
				local51 = super.aByteArray58[super.anInt4213];
				if (arg0.anInt5460 >= 0) {
					if (local51 < 0 || local51 > 3) {
						local7 = true;
					}
				} else if (local51 >= 0 && local51 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray5[super.anInt4213];
					local17 = super.aFloatArray17[super.anInt4213];
					super.anObjectArray5[super.anInt4213] = null;
					super.anInt4213++;
					if (super.anInt4213 >= 5000) {
						super.anInt4213 = 0;
					}
					super.anInt4215--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5460 < 0) {
				if (local51 >= 0 && local51 <= 3) {
					arg0.anInt5460 = local51;
					Static42.aClass55_3.method5255(local51);
				}
			} else if (local51 == 21) {
				Static4.method72(arg0, (Class174) arg0.anObject7);
			} else if (local51 == 20) {
				@Pc(275) Class174 local275 = (Class174) arg0.anObject7;
				if (local275.aClass4_Sub3_2 != null) {
					local275.aClass4_Sub3_2.method5899(Static42.aClass55_3);
				}
				if (local275.aClass4_Sub3_1 != null) {
					local275.aClass4_Sub3_1.method5899(Static42.aClass55_3);
				}
				if (local275.aClass4_Sub1_2 != null) {
					local275.aClass4_Sub1_2.method5899(Static42.aClass55_3);
				}
				if (local275.aClass4_Sub1_1 != null) {
					local275.aClass4_Sub1_1.method5899(Static42.aClass55_3);
				}
				if (local275.aClass4_Sub4_1 != null) {
					local275.aClass4_Sub4_1.method5899(Static42.aClass55_3);
				}
				for (@Pc(318) Class84 local318 = local275.aClass84_3; local318 != null; local318 = local318.aClass84_2) {
					local318.aClass4_Sub5_1.method5899(Static42.aClass55_3);
				}
			} else if (local51 >= 30 && local51 <= 33) {
				Static42.aClass55_3.method5156(3000.0F, local17 * 1.5F);
				((Class51) arg0.anObject7).method1842(Static66.anInt5817, Static150.anInt2937, Static257.anInt5067, Static172.aBooleanArrayArray6, local51 - 30 == 0);
			} else if (local51 >= 40 && local51 <= 43) {
				Static42.aClass55_3.method5156(3000.0F, local17 * 1.5F);
				((Class51) arg0.anObject7).method1842(Static66.anInt5817, Static150.anInt2937, Static257.anInt5067, Static206.aBooleanArrayArray5, local51 - 40 == 0);
			} else if (local51 == 22) {
				Static42.aClass55_3.method5234();
			} else if (local51 == 23) {
				Static42.aClass55_3.method5224();
			} else if (local51 == 24) {
				Static42.aClass55_3.method5172(0, null);
			} else if (local51 >= 10 && local51 <= 13) {
				Static42.aClass55_3.method5257(arg0.anInt5460);
				arg0.anInt5460 = -1;
			}
		} catch (@Pc(335) Exception local335) {
		} finally {
			@Pc(341) Object local341 = null;
			if (local7) {
				@Pc(401) Object local401 = this.anObject5;
				synchronized (this.anObject5) {
					super.anInt4212--;
					if (super.anInt4212 == 0) {
						this.anObject5.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3913(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject5;
		synchronized (this.anObject5) {
			@Pc(18) int local18;
			if (this.anInt2563 == arg0) {
				for (local18 = 0; local18 < this.anInt2563; local18++) {
					this.method2367(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt2563; local18++) {
					this.aClass76_Sub1Array1[local18].method4839();
				}
				this.anInt2563 = arg0;
				this.aClass76_Sub1Array1 = new Class76_Sub1[this.anInt2563];
				for (@Pc(68) int local68 = 0; local68 < this.anInt2563; local68++) {
					this.aClass76_Sub1Array1[local68] = new Class76_Sub1(this);
					this.aClass76_Sub1Array1[local68].method4841();
					this.method2367(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method3915(@OriginalArg(1) Class174 arg0) {
		@Pc(12) Object local12 = this.anObject5;
		synchronized (this.anObject5) {
			super.anInt4213--;
			if (super.anInt4213 < 0) {
				super.anInt4213 = 4999;
			}
			super.aByteArray58[super.anInt4213] = 21;
			super.anObjectArray5[super.anInt4213] = arg0;
			super.anInt4212++;
			super.anInt4215++;
			if (this.anInt2560 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	@Override
	public void method3919(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4216] = (byte) arg0;
			super.anInt4216++;
			if (super.anInt4216 >= 5000) {
				super.anInt4216 = 0;
			}
			super.anInt4212++;
			super.anInt4215++;
			if (this.anInt2560 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	private void method2367(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4216] = (byte) arg0;
		super.anInt4216++;
		super.anInt4215++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
		super.anInt4212++;
		if (this.anInt2560 > 0) {
			@Pc(52) Object local52 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!r;B)V")
	@Override
	public void method3920(@OriginalArg(0) Class174 arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4216] = 20;
			super.anObjectArray5[super.anInt4216] = arg0;
			super.anInt4216++;
			super.anInt4215++;
			super.anInt4212++;
			if (super.anInt4216 >= 5000) {
				super.anInt4216 = 0;
			}
			if (this.anInt2560 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(FLclient!dn;ZII)V")
	@Override
	public void method3918(@OriginalArg(0) float arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray58[super.anInt4216] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray5[super.anInt4216] = arg1;
			super.aFloatArray17[super.anInt4216] = arg0;
			super.anInt4216++;
			super.anInt4215++;
			super.anInt4212++;
			if (super.anInt4216 >= 5000) {
				super.anInt4216 = 0;
			}
			if (this.anInt2560 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	@Override
	public void method3916() {
		try {
			@Pc(12) Object local12 = this.anObject5;
			synchronized (this.anObject5) {
				while (true) {
					if (super.anInt4212 == 0) {
						break;
					}
					this.anObject5.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	@Override
	public void method3912() {
		@Pc(12) Object local12 = this.anObject5;
		synchronized (this.anObject5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2563; local16++) {
				if (this.aClass76_Sub1Array1[local16].anInt5460 >= 0) {
					this.method2363(this.aClass76_Sub1Array1[local16].anInt5460);
				}
			}
		}
	}
}
