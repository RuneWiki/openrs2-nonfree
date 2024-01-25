import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/Object;")
	private final Object anObject5 = new Object();

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	private int anInt4940 = 0;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "[Lclient!qk;")
	private Class172_Sub1[] aClass172_Sub1Array1 = new Class172_Sub1[0];

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	private int anInt4942 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	@Override
	public void method5664(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject5;
		synchronized (this.anObject5) {
			@Pc(18) int local18;
			if (this.anInt4940 == arg0) {
				for (local18 = 0; local18 < this.anInt4940; local18++) {
					this.method4521(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt4940; local18++) {
					this.aClass172_Sub1Array1[local18].method4784();
				}
				this.anInt4940 = arg0;
				this.aClass172_Sub1Array1 = new Class172_Sub1[this.anInt4940];
				for (@Pc(64) int local64 = 0; local64 < this.anInt4940; local64++) {
					this.aClass172_Sub1Array1[local64] = new Class172_Sub1(this);
					this.aClass172_Sub1Array1[local64].method4785();
					this.method4521(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)V")
	private void method4516(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt6398] = (byte) (arg0 + 10);
		super.anInt6398++;
		super.anInt6397++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
		super.anInt6393++;
		if (this.anInt4942 > 0) {
			@Pc(46) Object local46 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!qk;)V")
	public void method4519(@OriginalArg(1) Class172_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject5;
			@Pc(48) byte local48;
			synchronized (this.anObject5) {
				while (super.anInt6397 == 0) {
					this.anInt4942++;
					this.anObject5.wait();
					this.anInt4942--;
				}
				local48 = super.aByteArray93[super.anInt6395];
				if (arg0.anInt5189 >= 0) {
					if (local48 < 0 || local48 > 3) {
						local7 = true;
					}
				} else if (local48 >= 0 && local48 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray35[super.anInt6395];
					local11 = super.aFloatArray29[super.anInt6395];
					super.anObjectArray35[super.anInt6395] = null;
					super.anInt6395++;
					if (super.anInt6395 >= 5000) {
						super.anInt6395 = 0;
					}
					super.anInt6397--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5189 >= 0) {
				if (local48 == 21) {
					Static66.method1518(arg0, (Class155) arg0.anObject7);
				} else if (local48 == 20) {
					@Pc(260) Class155 local260 = (Class155) arg0.anObject7;
					if (local260.aClass11_Sub5_2 != null) {
						local260.aClass11_Sub5_2.method5912(Static368.aClass63_9);
					}
					if (local260.aClass11_Sub5_1 != null) {
						local260.aClass11_Sub5_1.method5912(Static368.aClass63_9);
					}
					if (local260.aClass11_Sub4_1 != null) {
						local260.aClass11_Sub4_1.method5912(Static368.aClass63_9);
					}
					if (local260.aClass11_Sub4_2 != null) {
						local260.aClass11_Sub4_2.method5912(Static368.aClass63_9);
					}
					if (local260.aClass11_Sub1_2 != null) {
						local260.aClass11_Sub1_2.method5912(Static368.aClass63_9);
					}
					for (@Pc(303) Class187 local303 = local260.aClass187_2; local303 != null; local303 = local303.aClass187_3) {
						local303.aClass11_Sub2_2.method5912(Static368.aClass63_9);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					Static368.aClass63_9.method4570(3000.0F, local11 * 1.5F);
					((Class36) arg0.anObject7).method4437(Static79.anInt1760, Static42.anInt1018, Static87.anInt1923, Static28.aBooleanArrayArray1, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					Static368.aClass63_9.method4570(3000.0F, local11 * 1.5F);
					((Class36) arg0.anObject7).method4437(Static79.anInt1760, Static42.anInt1018, Static87.anInt1923, Static75.aBooleanArrayArray5, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static368.aClass63_9.method4643();
				} else if (local48 == 23) {
					Static368.aClass63_9.method4561();
				} else if (local48 == 24) {
					Static368.aClass63_9.method4557(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static368.aClass63_9.method4618(arg0.anInt5189);
					arg0.anInt5189 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt5189 = local48;
				Static368.aClass63_9.method4600(local48);
			}
		} catch (@Pc(330) Exception local330) {
		} finally {
			@Pc(336) Object local336 = null;
			if (local7) {
				@Pc(396) Object local396 = this.anObject5;
				synchronized (this.anObject5) {
					super.anInt6393--;
					if (super.anInt6393 == 0) {
						this.anObject5.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	@Override
	public void method5669() {
		@Pc(8) Object local8 = this.anObject5;
		synchronized (this.anObject5) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4940; local12++) {
				if (this.aClass172_Sub1Array1[local12].anInt5189 >= 0) {
					this.method4516(this.aClass172_Sub1Array1[local12].anInt5189);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFZILclient!ui;)V")
	@Override
	public void method5667(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray93[super.anInt6398] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray35[super.anInt6398] = arg3;
			super.aFloatArray29[super.anInt6398] = arg0;
			super.anInt6398++;
			super.anInt6397++;
			super.anInt6393++;
			if (super.anInt6398 >= 5000) {
				super.anInt6398 = 0;
			}
			if (this.anInt4942 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!og;I)V")
	@Override
	public void method5660(@OriginalArg(0) Class155 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray93[super.anInt6398] = 20;
			super.anObjectArray35[super.anInt6398] = arg0;
			super.anInt6398++;
			super.anInt6393++;
			super.anInt6397++;
			if (super.anInt6398 >= 5000) {
				super.anInt6398 = 0;
			}
			if (this.anInt4942 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!og;)V")
	@Override
	public void method5666(@OriginalArg(1) Class155 arg0) {
		@Pc(7) Object local7 = this.anObject5;
		synchronized (this.anObject5) {
			super.anInt6395--;
			if (super.anInt6395 < 0) {
				super.anInt6395 = 4999;
			}
			super.aByteArray93[super.anInt6395] = 21;
			super.anObjectArray35[super.anInt6395] = arg0;
			super.anInt6393++;
			super.anInt6397++;
			if (this.anInt4942 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	@Override
	public void method5668(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray93[super.anInt6398] = (byte) arg0;
			super.anInt6398++;
			super.anInt6397++;
			super.anInt6393++;
			if (super.anInt6398 >= 5000) {
				super.anInt6398 = 0;
			}
			if (this.anInt4942 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!og;B)V")
	@Override
	public void method5662(@OriginalArg(0) Class155 arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray93[super.anInt6398] = 21;
			super.anObjectArray35[super.anInt6398] = arg0;
			super.anInt6398++;
			if (super.anInt6398 >= 5000) {
				super.anInt6398 = 0;
			}
			super.anInt6397++;
			super.anInt6393++;
			if (this.anInt4942 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)V")
	private void method4521(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6398] = (byte) arg0;
		super.anInt6398++;
		super.anInt6393++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
		super.anInt6397++;
		if (this.anInt4942 > 0) {
			@Pc(49) Object local49 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	@Override
	public void method5665() {
		try {
			@Pc(4) Object local4 = this.anObject5;
			synchronized (this.anObject5) {
				while (true) {
					if (super.anInt6393 == 0) {
						break;
					}
					this.anObject5.wait();
				}
			}
		} catch (@Pc(31) Exception local31) {
		}
	}
}
