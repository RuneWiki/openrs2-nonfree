import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class155_Sub1 extends Class155 {

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject5 = new Object();

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
	private int anInt4254 = 0;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	private int anInt4255 = 0;

	@OriginalMember(owner = "client!ok", name = "K", descriptor = "[Lclient!qe;")
	private Class25_Sub1[] aClass25_Sub1Array1 = new Class25_Sub1[0];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!sk;B)V")
	@Override
	public void method5565(@OriginalArg(0) Class187 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray95[super.anInt6146] = 21;
			super.anObjectArray35[super.anInt6146] = arg0;
			super.anInt6146++;
			super.anInt6143++;
			if (super.anInt6146 >= 5000) {
				super.anInt6146 = 0;
			}
			super.anInt6139++;
			if (this.anInt4254 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	@Override
	public void method5570(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray95[super.anInt6146] = (byte) arg0;
			super.anInt6146++;
			super.anInt6143++;
			if (super.anInt6146 >= 5000) {
				super.anInt6146 = 0;
			}
			super.anInt6139++;
			if (this.anInt4254 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	@Override
	public void method5569() {
		try {
			@Pc(12) Object local12 = this.anObject5;
			synchronized (this.anObject5) {
				while (true) {
					if (super.anInt6143 == 0) {
						break;
					}
					this.anObject5.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	@Override
	public void method5572() {
		@Pc(8) Object local8 = this.anObject5;
		synchronized (this.anObject5) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt4255; local17++) {
				if (this.aClass25_Sub1Array1[local17].anInt4730 >= 0) {
					this.method4061(this.aClass25_Sub1Array1[local17].anInt4730);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!sk;I)V")
	@Override
	public void method5563(@OriginalArg(0) Class187 arg0) {
		@Pc(2) Object local2 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray95[super.anInt6146] = 20;
			super.anObjectArray35[super.anInt6146] = arg0;
			super.anInt6146++;
			super.anInt6143++;
			if (super.anInt6146 >= 5000) {
				super.anInt6146 = 0;
			}
			super.anInt6139++;
			if (this.anInt4254 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!qe;)V")
	public void method4060(@OriginalArg(1) Class25_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject5;
			@Pc(48) byte local48;
			synchronized (this.anObject5) {
				while (super.anInt6139 == 0) {
					this.anInt4254++;
					this.anObject5.wait();
					this.anInt4254--;
				}
				local48 = super.aByteArray95[super.anInt6147];
				if (arg0.anInt4730 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray35[super.anInt6147];
					local17 = super.aFloatArray29[super.anInt6147];
					super.anObjectArray35[super.anInt6147] = null;
					super.anInt6147++;
					super.anInt6139--;
					if (super.anInt6147 >= 5000) {
						super.anInt6147 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt4730 < 0) {
				if (local48 >= 0 && local48 <= 3) {
					arg0.anInt4730 = local48;
					Static289.aClass81_6.method3039(local48);
				}
			} else if (local48 == 21) {
				Static150.method2942(arg0, (Class187) arg0.anObject6);
			} else if (local48 == 20) {
				@Pc(278) Class187 local278 = (Class187) arg0.anObject6;
				if (local278.aClass44_Sub5_1 != null) {
					local278.aClass44_Sub5_1.method5775(Static289.aClass81_6);
				}
				if (local278.aClass44_Sub5_2 != null) {
					local278.aClass44_Sub5_2.method5775(Static289.aClass81_6);
				}
				if (local278.aClass44_Sub1_1 != null) {
					local278.aClass44_Sub1_1.method5775(Static289.aClass81_6);
				}
				if (local278.aClass44_Sub1_2 != null) {
					local278.aClass44_Sub1_2.method5775(Static289.aClass81_6);
				}
				if (local278.aClass44_Sub3_1 != null) {
					local278.aClass44_Sub3_1.method5775(Static289.aClass81_6);
				}
				for (@Pc(323) Class214 local323 = local278.aClass214_19; local323 != null; local323 = local323.aClass214_21) {
					local323.aClass44_Sub4_1.method5775(Static289.aClass81_6);
				}
			} else if (local48 >= 30 && local48 <= 33) {
				Static289.aClass81_6.method2974(3000.0F, local17 * 1.5F);
				((Class106) arg0.anObject6).method5723(Static339.anInt6187, Static8.anInt3154, Static30.anInt573, Static258.aBooleanArrayArray5, local48 - 30 == 0);
			} else if (local48 >= 40 && local48 <= 43) {
				Static289.aClass81_6.method2974(3000.0F, local17 * 1.5F);
				((Class106) arg0.anObject6).method5723(Static339.anInt6187, Static8.anInt3154, Static30.anInt573, Static266.aBooleanArrayArray6, local48 - 40 == 0);
			} else if (local48 == 22) {
				Static289.aClass81_6.method3049();
			} else if (local48 == 23) {
				Static289.aClass81_6.method3042();
			} else if (local48 == 24) {
				Static289.aClass81_6.method3036(0, null);
			} else if (local48 >= 10 && local48 <= 13) {
				Static289.aClass81_6.method2982(arg0.anInt4730);
				arg0.anInt4730 = -1;
			}
		} catch (@Pc(340) Exception local340) {
		} finally {
			@Pc(346) Object local346 = null;
			if (local7) {
				@Pc(430) Object local430 = this.anObject5;
				synchronized (this.anObject5) {
					super.anInt6143--;
					if (super.anInt6143 == 0) {
						this.anObject5.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
	private void method4061(@OriginalArg(1) int arg0) {
		super.aByteArray95[super.anInt6146] = (byte) (arg0 + 10);
		super.anInt6146++;
		super.anInt6143++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
		super.anInt6139++;
		if (this.anInt4254 > 0) {
			@Pc(53) Object local53 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FBIZLclient!nc;)V")
	@Override
	public void method5566(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class106 arg3) {
		@Pc(14) Object local14 = this.anObject5;
		synchronized (this.anObject5) {
			super.aByteArray95[super.anInt6146] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt6146] = arg3;
			super.aFloatArray29[super.anInt6146] = arg0;
			super.anInt6146++;
			if (super.anInt6146 >= 5000) {
				super.anInt6146 = 0;
			}
			super.anInt6143++;
			super.anInt6139++;
			if (this.anInt4254 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	@Override
	public void method5571(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject5;
		synchronized (this.anObject5) {
			@Pc(24) int local24;
			if (this.anInt4255 == arg0) {
				for (local24 = 0; local24 < this.anInt4255; local24++) {
					this.method4063(local7++);
				}
			} else {
				for (local24 = 0; local24 < this.anInt4255; local24++) {
					this.aClass25_Sub1Array1[local24].method4364();
				}
				this.anInt4255 = arg0;
				this.aClass25_Sub1Array1 = new Class25_Sub1[this.anInt4255];
				for (@Pc(68) int local68 = 0; local68 < this.anInt4255; local68++) {
					this.aClass25_Sub1Array1[local68] = new Class25_Sub1(this);
					this.aClass25_Sub1Array1[local68].method4366();
					this.method4063(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V")
	private void method4063(@OriginalArg(1) int arg0) {
		super.aByteArray95[super.anInt6146] = (byte) arg0;
		super.anInt6146++;
		if (super.anInt6146 >= 5000) {
			super.anInt6146 = 0;
		}
		super.anInt6139++;
		super.anInt6143++;
		if (this.anInt4254 > 0) {
			@Pc(46) Object local46 = this.anObject5;
			synchronized (this.anObject5) {
				this.anObject5.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!sk;)V")
	@Override
	public void method5567(@OriginalArg(1) Class187 arg0) {
		@Pc(6) Object local6 = this.anObject5;
		synchronized (this.anObject5) {
			super.anInt6147--;
			if (super.anInt6147 < 0) {
				super.anInt6147 = 4999;
			}
			super.aByteArray95[super.anInt6147] = 21;
			super.anObjectArray35[super.anInt6147] = arg0;
			super.anInt6139++;
			super.anInt6143++;
			if (this.anInt4254 > 0) {
				this.anObject5.notifyAll();
			}
		}
	}
}
