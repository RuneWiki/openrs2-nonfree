import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
	private int anInt6741 = 0;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
	private int anInt6744 = 0;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "[Lclient!ac;")
	private Class4_Sub1[] aClass4_Sub1Array1 = new Class4_Sub1[0];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!dh;)V")
	@Override
	public void method5640(@OriginalArg(1) Class45 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray94[super.anInt6719] = 21;
			super.anObjectArray35[super.anInt6719] = arg0;
			super.anInt6719++;
			if (super.anInt6719 >= 5000) {
				super.anInt6719 = 0;
			}
			super.anInt6720++;
			super.anInt6721++;
			if (this.anInt6744 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	@Override
	public void method5629(@OriginalArg(1) int arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray94[super.anInt6719] = (byte) arg0;
			super.anInt6719++;
			super.anInt6721++;
			if (super.anInt6719 >= 5000) {
				super.anInt6719 = 0;
			}
			super.anInt6720++;
			if (this.anInt6744 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	@Override
	public void method5634() {
		try {
			@Pc(8) Object local8 = this.anObject8;
			synchronized (this.anObject8) {
				while (true) {
					if (super.anInt6720 == 0) {
						break;
					}
					this.anObject8.wait();
				}
			}
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ac;Z)V")
	public void method5646(@OriginalArg(0) Class4_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject8;
			@Pc(45) byte local45;
			synchronized (this.anObject8) {
				while (super.anInt6721 == 0) {
					this.anInt6744++;
					this.anObject8.wait();
					this.anInt6744--;
				}
				local45 = super.aByteArray94[super.anInt6725];
				if (arg0.anInt72 >= 0) {
					if (local45 < 0 || local45 > 3) {
						local7 = true;
					}
				} else if (local45 >= 0 && local45 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray35[super.anInt6725];
					local11 = super.aFloatArray30[super.anInt6725];
					super.anObjectArray35[super.anInt6725] = null;
					super.anInt6725++;
					if (super.anInt6725 >= 5000) {
						super.anInt6725 = 0;
					}
					super.anInt6721--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt72 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt72 = local45;
					Static140.aClass122_3.method4787(local45);
				}
			} else if (local45 == 21) {
				Static293.method5300(arg0, (Class45) arg0.anObject2);
			} else if (local45 == 20) {
				@Pc(153) Class45 local153 = (Class45) arg0.anObject2;
				if (local153.aClass5_Sub5_1 != null) {
					local153.aClass5_Sub5_1.method5331(Static140.aClass122_3);
				}
				if (local153.aClass5_Sub5_2 != null) {
					local153.aClass5_Sub5_2.method5331(Static140.aClass122_3);
				}
				if (local153.aClass5_Sub1_1 != null) {
					local153.aClass5_Sub1_1.method5331(Static140.aClass122_3);
				}
				if (local153.aClass5_Sub1_2 != null) {
					local153.aClass5_Sub1_2.method5331(Static140.aClass122_3);
				}
				if (local153.aClass5_Sub3_1 != null) {
					local153.aClass5_Sub3_1.method5331(Static140.aClass122_3);
				}
				for (@Pc(196) Class160 local196 = local153.aClass160_1; local196 != null; local196 = local196.aClass160_3) {
					local196.aClass5_Sub4_1.method5331(Static140.aClass122_3);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static140.aClass122_3.method4744(3000.0F, local11 * 1.5F);
				((Class22) arg0.anObject2).method4669(Static74.anInt1441, Static89.anInt6705, Static14.anInt494, Static192.aBooleanArrayArray9, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static140.aClass122_3.method4744(3000.0F, local11 * 1.5F);
				((Class22) arg0.anObject2).method4669(Static74.anInt1441, Static89.anInt6705, Static14.anInt494, Static108.aBooleanArrayArray15, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static140.aClass122_3.method4758();
			} else if (local45 == 23) {
				Static140.aClass122_3.method4755();
			} else if (local45 == 24) {
				Static140.aClass122_3.method4742(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static140.aClass122_3.method4729(arg0.anInt72);
				arg0.anInt72 = -1;
			}
		} catch (@Pc(328) Exception local328) {
		} finally {
			@Pc(334) Object local334 = null;
			if (local7) {
				@Pc(391) Object local391 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt6720--;
					if (super.anInt6720 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!dh;)V")
	@Override
	public void method5632(@OriginalArg(1) Class45 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt6725--;
			if (super.anInt6725 < 0) {
				super.anInt6725 = 4999;
			}
			super.aByteArray94[super.anInt6725] = 21;
			super.anObjectArray35[super.anInt6725] = arg0;
			super.anInt6721++;
			super.anInt6720++;
			if (this.anInt6744 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V")
	private void method5647(@OriginalArg(0) int arg0) {
		super.aByteArray94[super.anInt6719] = (byte) (arg0 + 10);
		super.anInt6719++;
		super.anInt6720++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
		super.anInt6721++;
		if (this.anInt6744 > 0) {
			@Pc(43) Object local43 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!dh;I)V")
	@Override
	public void method5630(@OriginalArg(0) Class45 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray94[super.anInt6719] = 20;
			super.anObjectArray35[super.anInt6719] = arg0;
			super.anInt6719++;
			super.anInt6721++;
			if (super.anInt6719 >= 5000) {
				super.anInt6719 = 0;
			}
			super.anInt6720++;
			if (this.anInt6744 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	@Override
	public void method5638() {
		@Pc(4) Object local4 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt6741; local14++) {
				if (this.aClass4_Sub1Array1[local14].anInt72 >= 0) {
					this.method5647(this.aClass4_Sub1Array1[local14].anInt72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V")
	private void method5648(@OriginalArg(0) int arg0) {
		super.aByteArray94[super.anInt6719] = (byte) arg0;
		super.anInt6719++;
		if (super.anInt6719 >= 5000) {
			super.anInt6719 = 0;
		}
		super.anInt6720++;
		super.anInt6721++;
		if (this.anInt6744 > 0) {
			@Pc(53) Object local53 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)V")
	@Override
	public void method5636(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject8;
		synchronized (this.anObject8) {
			if (arg0 == this.anInt6741) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt6741; local18++) {
					this.method5648(local7++);
				}
			} else {
				for (@Pc(43) int local43 = 0; local43 < this.anInt6741; local43++) {
					this.aClass4_Sub1Array1[local43].method36();
				}
				this.anInt6741 = arg0;
				this.aClass4_Sub1Array1 = new Class4_Sub1[this.anInt6741];
				for (@Pc(70) int local70 = 0; local70 < this.anInt6741; local70++) {
					this.aClass4_Sub1Array1[local70] = new Class4_Sub1(this);
					this.aClass4_Sub1Array1[local70].method35();
					this.method5648(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZFIILclient!da;)V")
	@Override
	public void method5627(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray94[super.anInt6719] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray35[super.anInt6719] = arg3;
			super.aFloatArray30[super.anInt6719] = arg1;
			super.anInt6719++;
			super.anInt6720++;
			super.anInt6721++;
			if (super.anInt6719 >= 5000) {
				super.anInt6719 = 0;
			}
			if (this.anInt6744 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}
}
