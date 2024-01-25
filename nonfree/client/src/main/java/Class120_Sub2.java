import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "Ljava/lang/Object;")
	private final Object anObject10 = new Object();

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	private int anInt7420 = 0;

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "[Lclient!wh;")
	private Class121_Sub1[] aClass121_Sub1Array1 = new Class121_Sub1[0];

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
	private int anInt7419 = 0;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(BLclient!hg;)V")
	@Override
	public void method6078(@OriginalArg(1) Class101 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray91[super.anInt7401] = 21;
			super.anObjectArray35[super.anInt7401] = arg0;
			super.anInt7401++;
			if (super.anInt7401 >= 5000) {
				super.anInt7401 = 0;
			}
			super.anInt7402++;
			super.anInt7404++;
			if (this.anInt7420 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)V")
	@Override
	public void method6077(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray91[super.anInt7401] = (byte) arg0;
			super.anInt7401++;
			super.anInt7402++;
			if (super.anInt7401 >= 5000) {
				super.anInt7401 = 0;
			}
			super.anInt7404++;
			if (this.anInt7420 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	@Override
	public void method6080() {
		@Pc(8) Object local8 = this.anObject10;
		synchronized (this.anObject10) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt7419; local22++) {
				if (this.aClass121_Sub1Array1[local22].anInt7780 >= 0) {
					this.method6086(this.aClass121_Sub1Array1[local22].anInt7780);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)V")
	private void method6082(@OriginalArg(0) int arg0) {
		super.aByteArray91[super.anInt7401] = (byte) arg0;
		super.anInt7401++;
		super.anInt7402++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
		super.anInt7404++;
		if (this.anInt7420 > 0) {
			@Pc(48) Object local48 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!hg;)V")
	@Override
	public void method6072(@OriginalArg(1) Class101 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.anInt7403--;
			if (super.anInt7403 < 0) {
				super.anInt7403 = 4999;
			}
			super.aByteArray91[super.anInt7403] = 21;
			super.anObjectArray35[super.anInt7403] = arg0;
			super.anInt7402++;
			super.anInt7404++;
			if (this.anInt7420 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!wh;B)V")
	public void method6084(@OriginalArg(0) Class121_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject10;
			@Pc(53) byte local53;
			synchronized (this.anObject10) {
				while (super.anInt7402 == 0) {
					this.anInt7420++;
					this.anObject10.wait();
					this.anInt7420--;
				}
				local53 = super.aByteArray91[super.anInt7403];
				if (arg0.anInt7780 >= 0) {
					if (local53 < 0 || local53 > 3) {
						local7 = true;
					}
				} else if (local53 >= 0 && local53 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject11 = super.anObjectArray35[super.anInt7403];
					local11 = super.aFloatArray29[super.anInt7403];
					super.anObjectArray35[super.anInt7403] = null;
					super.anInt7403++;
					if (super.anInt7403 >= 5000) {
						super.anInt7403 = 0;
					}
					super.anInt7402--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt7780 >= 0) {
				if (local53 == 21) {
					Static399.method5889(arg0, (Class101) arg0.anObject11);
				} else if (local53 == 20) {
					@Pc(264) Class101 local264 = (Class101) arg0.anObject11;
					if (local264.aClass3_Sub3_2 != null) {
						local264.aClass3_Sub3_2.method5937(Static165.aClass66_8);
					}
					if (local264.aClass3_Sub3_1 != null) {
						local264.aClass3_Sub3_1.method5937(Static165.aClass66_8);
					}
					if (local264.aClass3_Sub1_2 != null) {
						local264.aClass3_Sub1_2.method5937(Static165.aClass66_8);
					}
					if (local264.aClass3_Sub1_3 != null) {
						local264.aClass3_Sub1_3.method5937(Static165.aClass66_8);
					}
					if (local264.aClass3_Sub5_1 != null) {
						local264.aClass3_Sub5_1.method5937(Static165.aClass66_8);
					}
					for (@Pc(309) Class145 local309 = local264.aClass145_1; local309 != null; local309 = local309.aClass145_2) {
						local309.aClass3_Sub2_2.method5937(Static165.aClass66_8);
					}
				} else if (local53 >= 30 && local53 <= 33) {
					Static165.aClass66_8.method5055(3000.0F, local11 * 1.5F);
					((Class86) arg0.anObject11).method6595(Static6.anInt253, Static370.anInt6673, Static195.anInt7212, Static202.aBooleanArrayArray7, local53 - 30 == 0);
				} else if (local53 >= 40 && local53 <= 43) {
					Static165.aClass66_8.method5055(3000.0F, local11 * 1.5F);
					((Class86) arg0.anObject11).method6595(Static6.anInt253, Static370.anInt6673, Static195.anInt7212, Static59.aBooleanArrayArray4, local53 - 40 == 0);
				} else if (local53 == 22) {
					Static165.aClass66_8.method5042();
				} else if (local53 == 23) {
					Static165.aClass66_8.method5002();
				} else if (local53 == 24) {
					Static165.aClass66_8.method5000(0, null);
				} else if (local53 >= 10 && local53 <= 13) {
					Static165.aClass66_8.method5073(arg0.anInt7780);
					arg0.anInt7780 = -1;
				}
			} else if (local53 >= 0 && local53 <= 3) {
				arg0.anInt7780 = local53;
				Static165.aClass66_8.method5047(local53);
			}
		} catch (@Pc(344) Exception local344) {
		} finally {
			@Pc(350) Object local350 = null;
			if (local7) {
				@Pc(444) Object local444 = this.anObject10;
				synchronized (this.anObject10) {
					super.anInt7404--;
					if (super.anInt7404 == 0) {
						this.anObject10.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	@Override
	public void method6079() {
		try {
			@Pc(4) Object local4 = this.anObject10;
			synchronized (this.anObject10) {
				while (true) {
					if (super.anInt7404 == 0) {
						break;
					}
					this.anObject10.wait();
				}
			}
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!og;IIFZ)V")
	@Override
	public void method6071(@OriginalArg(0) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray91[super.anInt7401] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt7401] = arg0;
			super.aFloatArray29[super.anInt7401] = arg2;
			super.anInt7401++;
			if (super.anInt7401 >= 5000) {
				super.anInt7401 = 0;
			}
			super.anInt7404++;
			super.anInt7402++;
			if (this.anInt7420 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V")
	@Override
	public void method6076(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject10;
		synchronized (this.anObject10) {
			@Pc(18) int local18;
			if (arg0 == this.anInt7419) {
				for (local18 = 0; local18 < this.anInt7419; local18++) {
					this.method6082(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt7419; local18++) {
					this.aClass121_Sub1Array1[local18].method6359();
				}
				this.anInt7419 = arg0;
				this.aClass121_Sub1Array1 = new Class121_Sub1[this.anInt7419];
				for (@Pc(66) int local66 = 0; local66 < this.anInt7419; local66++) {
					this.aClass121_Sub1Array1[local66] = new Class121_Sub1(this);
					this.aClass121_Sub1Array1[local66].method6355();
					this.method6082(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!hg;I)V")
	@Override
	public void method6073(@OriginalArg(0) Class101 arg0) {
		@Pc(2) Object local2 = this.anObject10;
		synchronized (this.anObject10) {
			super.aByteArray91[super.anInt7401] = 20;
			super.anObjectArray35[super.anInt7401] = arg0;
			super.anInt7401++;
			if (super.anInt7401 >= 5000) {
				super.anInt7401 = 0;
			}
			super.anInt7404++;
			super.anInt7402++;
			if (this.anInt7420 > 0) {
				this.anObject10.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)V")
	private void method6086(@OriginalArg(1) int arg0) {
		super.aByteArray91[super.anInt7401] = (byte) (arg0 + 10);
		super.anInt7401++;
		super.anInt7402++;
		if (super.anInt7401 >= 5000) {
			super.anInt7401 = 0;
		}
		super.anInt7404++;
		if (this.anInt7420 > 0) {
			@Pc(43) Object local43 = this.anObject10;
			synchronized (this.anObject10) {
				this.anObject10.notifyAll();
			}
		}
	}
}
