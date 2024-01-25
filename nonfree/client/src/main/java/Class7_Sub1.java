import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/lang/Object;")
	private final Object anObject1 = new Object();

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[Lclient!ln;")
	private Class180_Sub1[] aClass180_Sub1Array1 = new Class180_Sub1[0];

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	private int anInt453 = 0;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	private int anInt456 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	@Override
	public void method1154(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray24[super.anInt1209] = (byte) arg0;
			super.anInt1209++;
			super.anInt1210++;
			super.anInt1208++;
			if (super.anInt1209 >= 5000) {
				super.anInt1209 = 0;
			}
			if (this.anInt453 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!uaa;Z)V")
	@Override
	public void method1151(@OriginalArg(0) Class290 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.anInt1211--;
			if (super.anInt1211 < 0) {
				super.anInt1211 = 4999;
			}
			super.aByteArray24[super.anInt1211] = 21;
			super.anObjectArray3[super.anInt1211] = arg0;
			super.anInt1208++;
			super.anInt1210++;
			if (this.anInt453 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	private void method507(@OriginalArg(1) int arg0) {
		super.aByteArray24[super.anInt1209] = (byte) (arg0 + 10);
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
		super.anInt1210++;
		super.anInt1208++;
		if (this.anInt453 > 0) {
			@Pc(43) Object local43 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
	@Override
	public void method1155() {
		try {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				while (true) {
					if (super.anInt1210 == 0) {
						break;
					}
					this.anObject1.wait();
				}
			}
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!uaa;)V")
	@Override
	public void method1150(@OriginalArg(1) Class290 arg0) {
		@Pc(6) Object local6 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray24[super.anInt1209] = 21;
			super.anObjectArray3[super.anInt1209] = arg0;
			super.anInt1209++;
			super.anInt1208++;
			super.anInt1210++;
			if (super.anInt1209 >= 5000) {
				super.anInt1209 = 0;
			}
			if (this.anInt453 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	@Override
	public void method1152() {
		@Pc(17) Object local17 = this.anObject1;
		synchronized (this.anObject1) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt456; local21++) {
				if (this.aClass180_Sub1Array1[local21].anInt5758 >= 0) {
					this.method507(this.aClass180_Sub1Array1[local21].anInt5758);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	private void method509(@OriginalArg(0) int arg0) {
		super.aByteArray24[super.anInt1209] = (byte) arg0;
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
		super.anInt1210++;
		super.anInt1208++;
		if (this.anInt453 > 0) {
			@Pc(51) Object local51 = this.anObject1;
			synchronized (this.anObject1) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1153(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = 0;
		@Pc(17) Object local17 = this.anObject1;
		synchronized (this.anObject1) {
			@Pc(25) int local25;
			if (arg0 == this.anInt456) {
				for (local25 = 0; local25 < this.anInt456; local25++) {
					this.method509(local14++);
				}
			} else {
				for (local25 = 0; local25 < this.anInt456; local25++) {
					this.aClass180_Sub1Array1[local25].method4811();
				}
				this.anInt456 = arg0;
				this.aClass180_Sub1Array1 = new Class180_Sub1[this.anInt456];
				for (@Pc(69) int local69 = 0; local69 < this.anInt456; local69++) {
					this.aClass180_Sub1Array1[local69] = new Class180_Sub1(this);
					this.aClass180_Sub1Array1[local69].method4817();
					this.method509(local14++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!d;IBZ)V")
	@Override
	public void method1156(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray24[super.anInt1209] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray3[super.anInt1209] = arg0;
			super.anInt1209++;
			super.anInt1208++;
			if (super.anInt1209 >= 5000) {
				super.anInt1209 = 0;
			}
			super.anInt1210++;
			if (this.anInt453 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ln;B)V")
	public void method510(@OriginalArg(0) Class180_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject1;
			@Pc(40) byte local40;
			synchronized (this.anObject1) {
				while (super.anInt1208 == 0) {
					this.anInt453++;
					this.anObject1.wait();
					this.anInt453--;
				}
				local40 = super.aByteArray24[super.anInt1211];
				if (arg0.anInt5758 < 0) {
					if (local40 >= 0 && local40 <= 3) {
						local7 = true;
					}
				} else if (local40 < 0 || local40 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject10 = super.anObjectArray3[super.anInt1211];
					super.anObjectArray3[super.anInt1211] = null;
					super.anInt1211++;
					super.anInt1208--;
					if (super.anInt1211 >= 5000) {
						super.anInt1211 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5758 < 0) {
				if (local40 >= 0 && local40 <= 3) {
					arg0.anInt5758 = local40;
					Static263.aClass5_9.method7438(local40);
				}
			} else if (local40 == 21) {
				Static511.method7316(arg0, (Class290) arg0.anObject10);
			} else if (local40 == 20) {
				@Pc(234) Class290 local234 = (Class290) arg0.anObject10;
				if (local234.aClass6_Sub2_2 != null) {
					local234.aClass6_Sub2_2.method7746(Static263.aClass5_9);
				}
				if (local234.aClass6_Sub2_3 != null) {
					local234.aClass6_Sub2_3.method7746(Static263.aClass5_9);
				}
				if (local234.aClass6_Sub4_3 != null) {
					local234.aClass6_Sub4_3.method7746(Static263.aClass5_9);
				}
				if (local234.aClass6_Sub4_2 != null) {
					local234.aClass6_Sub4_2.method7746(Static263.aClass5_9);
				}
				if (local234.aClass6_Sub3_2 != null) {
					local234.aClass6_Sub3_2.method7746(Static263.aClass5_9);
				}
				for (@Pc(281) Class98 local281 = local234.aClass98_3; local281 != null; local281 = local281.aClass98_1) {
					local281.aClass6_Sub1_1.method7746(Static263.aClass5_9);
				}
			} else if (local40 >= 30 && local40 <= 33) {
				((Class52) arg0.anObject10).method7828(Static227.anInt4884, Static320.anInt6157, Static345.anInt6586, Static30.aBooleanArrayArray3, local40 - 30 == 0);
			} else if (local40 >= 40 && local40 <= 43) {
				((Class52) arg0.anObject10).method7828(Static227.anInt4884, Static320.anInt6157, Static345.anInt6586, Static131.aBooleanArrayArray4, local40 - 40 == 0);
			} else if (local40 == 22) {
				Static263.aClass5_9.AA(-1, 1583160, 40, 127);
			} else if (local40 == 23) {
				Static263.aClass5_9.k();
			} else if (local40 == 24) {
				Static263.aClass5_9.method7460(0, null);
			} else if (local40 >= 10 && local40 <= 13) {
				Static263.aClass5_9.method7454(arg0.anInt5758);
				arg0.anInt5758 = -1;
			}
		} catch (@Pc(305) Exception local305) {
		} finally {
			@Pc(311) Object local311 = null;
			if (local7) {
				@Pc(380) Object local380 = this.anObject1;
				synchronized (this.anObject1) {
					super.anInt1210--;
					if (super.anInt1210 == 0) {
						this.anObject1.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!uaa;B)V")
	@Override
	public void method1157(@OriginalArg(0) Class290 arg0) {
		@Pc(2) Object local2 = this.anObject1;
		synchronized (this.anObject1) {
			super.aByteArray24[super.anInt1209] = 20;
			super.anObjectArray3[super.anInt1209] = arg0;
			super.anInt1209++;
			if (super.anInt1209 >= 5000) {
				super.anInt1209 = 0;
			}
			super.anInt1210++;
			super.anInt1208++;
			if (this.anInt453 > 0) {
				this.anObject1.notifyAll();
			}
		}
	}
}
