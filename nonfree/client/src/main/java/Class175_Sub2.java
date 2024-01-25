import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class175_Sub2 extends Class175 {

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject9 = new Object();

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "[Lclient!hg;")
	private Class128_Sub1[] aClass128_Sub1Array1 = new Class128_Sub1[0];

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
	private int anInt4906 = 0;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
	private int anInt4911 = 0;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(ZLclient!hl;)V")
	@Override
	public void method4162(@OriginalArg(1) Class133 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.anInt4896--;
			if (super.anInt4896 < 0) {
				super.anInt4896 = 4999;
			}
			super.aByteArray68[super.anInt4896] = 21;
			super.anObjectArray35[super.anInt4896] = arg0;
			super.anInt4890++;
			super.anInt4892++;
			if (this.anInt4911 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V")
	private void method4164(@OriginalArg(0) int arg0) {
		super.aByteArray68[super.anInt4891] = (byte) (arg0 + 10);
		super.anInt4891++;
		super.anInt4892++;
		super.anInt4890++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
		if (this.anInt4911 > 0) {
			@Pc(46) Object local46 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!hg;)V")
	public void method4165(@OriginalArg(1) Class128_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject9;
			@Pc(40) byte local40;
			synchronized (this.anObject9) {
				while (super.anInt4892 == 0) {
					this.anInt4911++;
					this.anObject9.wait();
					this.anInt4911--;
				}
				local40 = super.aByteArray68[super.anInt4896];
				if (arg0.anInt3812 < 0) {
					if (local40 >= 0 && local40 <= 3) {
						local7 = true;
					}
				} else if (local40 < 0 || local40 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray35[super.anInt4896];
					super.anObjectArray35[super.anInt4896] = null;
					super.anInt4896++;
					super.anInt4892--;
					if (super.anInt4896 >= 5000) {
						super.anInt4896 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3812 >= 0) {
				if (local40 == 21) {
					Static545.method7379(arg0, (Class133) arg0.anObject6);
				} else if (local40 == 20) {
					@Pc(134) Class133 local134 = (Class133) arg0.anObject6;
					if (local134.aClass15_Sub1_2 != null) {
						local134.aClass15_Sub1_2.method7160(Static276.aClass90_9);
					}
					if (local134.aClass15_Sub1_1 != null) {
						local134.aClass15_Sub1_1.method7160(Static276.aClass90_9);
					}
					if (local134.aClass15_Sub4_2 != null) {
						local134.aClass15_Sub4_2.method7160(Static276.aClass90_9);
					}
					if (local134.aClass15_Sub4_1 != null) {
						local134.aClass15_Sub4_1.method7160(Static276.aClass90_9);
					}
					if (local134.aClass15_Sub3_2 != null) {
						local134.aClass15_Sub3_2.method7160(Static276.aClass90_9);
					}
					for (@Pc(177) Class315 local177 = local134.aClass315_1; local177 != null; local177 = local177.aClass315_3) {
						local177.aClass15_Sub2_2.method7160(Static276.aClass90_9);
					}
				} else if (local40 >= 30 && local40 <= 33) {
					((Class46) arg0.anObject6).method7967(Static207.anInt3926, Static3.anInt7083, Static2.anInt40, Static528.aBooleanArrayArray9, local40 - 30 == 0);
				} else if (local40 >= 40 && local40 <= 43) {
					((Class46) arg0.anObject6).method7967(Static207.anInt3926, Static3.anInt7083, Static2.anInt40, Static467.aBooleanArrayArray7, local40 - 40 == 0);
				} else if (local40 == 22) {
					Static276.aClass90_9.AA(-1, 1583160, 40, 127);
				} else if (local40 == 23) {
					Static276.aClass90_9.k();
				} else if (local40 == 24) {
					Static276.aClass90_9.method7448(0, null);
				} else if (local40 >= 10 && local40 <= 13) {
					Static276.aClass90_9.method7468(arg0.anInt3812);
					arg0.anInt3812 = -1;
				}
			} else if (local40 >= 0 && local40 <= 3) {
				arg0.anInt3812 = local40;
				Static276.aClass90_9.method7491(local40);
			}
		} catch (@Pc(303) Exception local303) {
		} finally {
			@Pc(309) Object local309 = null;
			if (local7) {
				@Pc(369) Object local369 = this.anObject9;
				synchronized (this.anObject9) {
					super.anInt4890--;
					if (super.anInt4890 == 0) {
						this.anObject9.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V")
	@Override
	public void method4163(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject9;
		synchronized (this.anObject9) {
			@Pc(18) int local18;
			if (this.anInt4906 == arg0) {
				for (local18 = 0; local18 < this.anInt4906; local18++) {
					this.method4170(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt4906; local18++) {
					this.aClass128_Sub1Array1[local18].method3308();
				}
				this.anInt4906 = arg0;
				this.aClass128_Sub1Array1 = new Class128_Sub1[this.anInt4906];
				for (@Pc(70) int local70 = 0; local70 < this.anInt4906; local70++) {
					this.aClass128_Sub1Array1[local70] = new Class128_Sub1(this);
					this.aClass128_Sub1Array1[local70].method3309();
					this.method4170(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIZLclient!d;)V")
	@Override
	public void method4155(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray68[super.anInt4891] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray35[super.anInt4891] = arg2;
			super.anInt4891++;
			super.anInt4890++;
			super.anInt4892++;
			if (super.anInt4891 >= 5000) {
				super.anInt4891 = 0;
			}
			if (this.anInt4911 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!hl;B)V")
	@Override
	public void method4153(@OriginalArg(0) Class133 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray68[super.anInt4891] = 21;
			super.anObjectArray35[super.anInt4891] = arg0;
			super.anInt4891++;
			super.anInt4890++;
			super.anInt4892++;
			if (super.anInt4891 >= 5000) {
				super.anInt4891 = 0;
			}
			if (this.anInt4911 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZLclient!hl;)V")
	@Override
	public void method4157(@OriginalArg(1) Class133 arg0) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray68[super.anInt4891] = 20;
			super.anObjectArray35[super.anInt4891] = arg0;
			super.anInt4891++;
			super.anInt4890++;
			super.anInt4892++;
			if (super.anInt4891 >= 5000) {
				super.anInt4891 = 0;
			}
			if (this.anInt4911 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	@Override
	public void method4154() {
		try {
			@Pc(4) Object local4 = this.anObject9;
			synchronized (this.anObject9) {
				while (true) {
					if (super.anInt4890 == 0) {
						break;
					}
					this.anObject9.wait();
				}
			}
		} catch (@Pc(21) Exception local21) {
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V")
	private void method4170(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt4891] = (byte) arg0;
		super.anInt4891++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
		super.anInt4890++;
		super.anInt4892++;
		if (this.anInt4911 > 0) {
			@Pc(52) Object local52 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	@Override
	public void method4160() {
		@Pc(4) Object local4 = this.anObject9;
		synchronized (this.anObject9) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4906; local14++) {
				if (this.aClass128_Sub1Array1[local14].anInt3812 >= 0) {
					this.method4164(this.aClass128_Sub1Array1[local14].anInt3812);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	@Override
	public void method4159(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray68[super.anInt4891] = (byte) arg0;
			super.anInt4891++;
			super.anInt4892++;
			if (super.anInt4891 >= 5000) {
				super.anInt4891 = 0;
			}
			super.anInt4890++;
			if (this.anInt4911 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}
}
