import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject12 = new Object();

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	private int anInt2072 = 0;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "[Lclient!pg;")
	private Class120_Sub1[] aClass120_Sub1Array1 = new Class120_Sub1[0];

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	private int anInt2073 = 0;

	static {
		new Class186("", 76);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
	@Override
	public void method5077(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.anObject12;
		synchronized (this.anObject12) {
			super.aByteArray91[super.anInt6472] = (byte) arg0;
			super.anInt6472++;
			if (super.anInt6472 >= 5000) {
				super.anInt6472 = 0;
			}
			super.anInt6474++;
			super.anInt6473++;
			if (this.anInt2072 > 0) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	private void method1814(@OriginalArg(1) int arg0) {
		super.aByteArray91[super.anInt6472] = (byte) (arg0 + 10);
		super.anInt6472++;
		super.anInt6474++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
		super.anInt6473++;
		if (this.anInt2072 > 0) {
			@Pc(53) Object local53 = this.anObject12;
			synchronized (this.anObject12) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!nt;)V")
	@Override
	public void method5078(@OriginalArg(1) Class164 arg0) {
		@Pc(8) Object local8 = this.anObject12;
		synchronized (this.anObject12) {
			super.anInt6471--;
			if (super.anInt6471 < 0) {
				super.anInt6471 = 4999;
			}
			super.aByteArray91[super.anInt6471] = 21;
			super.anObjectArray5[super.anInt6471] = arg0;
			super.anInt6473++;
			super.anInt6474++;
			if (this.anInt2072 > 0) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLclient!ta;FB)V")
	@Override
	public void method5079(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) float arg3) {
		@Pc(2) Object local2 = this.anObject12;
		synchronized (this.anObject12) {
			super.aByteArray91[super.anInt6472] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray5[super.anInt6472] = arg2;
			super.aFloatArray29[super.anInt6472] = arg3;
			super.anInt6472++;
			super.anInt6474++;
			super.anInt6473++;
			if (super.anInt6472 >= 5000) {
				super.anInt6472 = 0;
			}
			if (this.anInt2072 > 0) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method5073() {
		@Pc(12) Object local12 = this.anObject12;
		synchronized (this.anObject12) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2073; local16++) {
				if (this.aClass120_Sub1Array1[local16].anInt5366 >= 0) {
					this.method1814(this.aClass120_Sub1Array1[local16].anInt5366);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!nt;I)V")
	@Override
	public void method5080(@OriginalArg(0) Class164 arg0) {
		@Pc(6) Object local6 = this.anObject12;
		synchronized (this.anObject12) {
			super.aByteArray91[super.anInt6472] = 21;
			super.anObjectArray5[super.anInt6472] = arg0;
			super.anInt6472++;
			super.anInt6474++;
			super.anInt6473++;
			if (super.anInt6472 >= 5000) {
				super.anInt6472 = 0;
			}
			if (this.anInt2072 > 0) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!nt;B)V")
	@Override
	public void method5076(@OriginalArg(0) Class164 arg0) {
		@Pc(6) Object local6 = this.anObject12;
		synchronized (this.anObject12) {
			super.aByteArray91[super.anInt6472] = 20;
			super.anObjectArray5[super.anInt6472] = arg0;
			super.anInt6472++;
			super.anInt6474++;
			if (super.anInt6472 >= 5000) {
				super.anInt6472 = 0;
			}
			super.anInt6473++;
			if (this.anInt2072 > 0) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public void method5074() {
		try {
			@Pc(8) Object local8 = this.anObject12;
			synchronized (this.anObject12) {
				while (true) {
					if (super.anInt6473 == 0) {
						break;
					}
					this.anObject12.wait();
				}
			}
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	@Override
	public void method5075(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject12;
		synchronized (this.anObject12) {
			@Pc(18) int local18;
			if (this.anInt2073 == arg0) {
				for (local18 = 0; local18 < this.anInt2073; local18++) {
					this.method1817(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt2073; local18++) {
					this.aClass120_Sub1Array1[local18].method4109();
				}
				this.anInt2073 = arg0;
				this.aClass120_Sub1Array1 = new Class120_Sub1[this.anInt2073];
				for (@Pc(63) int local63 = 0; local63 < this.anInt2073; local63++) {
					this.aClass120_Sub1Array1[local63] = new Class120_Sub1(this);
					this.aClass120_Sub1Array1[local63].method4112();
					this.method1817(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
	private void method1817(@OriginalArg(1) int arg0) {
		super.aByteArray91[super.anInt6472] = (byte) arg0;
		super.anInt6472++;
		super.anInt6473++;
		if (super.anInt6472 >= 5000) {
			super.anInt6472 = 0;
		}
		super.anInt6474++;
		if (this.anInt2072 > 0) {
			@Pc(49) Object local49 = this.anObject12;
			synchronized (this.anObject12) {
				this.anObject12.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method1818(@OriginalArg(0) Class120_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject12;
			@Pc(45) byte local45;
			synchronized (this.anObject12) {
				while (super.anInt6474 == 0) {
					this.anInt2072++;
					this.anObject12.wait();
					this.anInt2072--;
				}
				local45 = super.aByteArray91[super.anInt6471];
				if (arg0.anInt5366 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject27 = super.anObjectArray5[super.anInt6471];
					local11 = super.aFloatArray29[super.anInt6471];
					super.anObjectArray5[super.anInt6471] = null;
					super.anInt6471++;
					if (super.anInt6471 >= 5000) {
						super.anInt6471 = 0;
					}
					super.anInt6474--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt5366 >= 0) {
				if (local45 == 21) {
					Static302.method4101(arg0, (Class164) arg0.anObject27);
				} else if (local45 == 20) {
					@Pc(134) Class164 local134 = (Class164) arg0.anObject27;
					if (local134.aClass16_Sub5_3 != null) {
						local134.aClass16_Sub5_3.method5335(Static390.aClass19_37);
					}
					if (local134.aClass16_Sub5_2 != null) {
						local134.aClass16_Sub5_2.method5335(Static390.aClass19_37);
					}
					if (local134.aClass16_Sub2_2 != null) {
						local134.aClass16_Sub2_2.method5335(Static390.aClass19_37);
					}
					if (local134.aClass16_Sub2_3 != null) {
						local134.aClass16_Sub2_3.method5335(Static390.aClass19_37);
					}
					if (local134.aClass16_Sub4_2 != null) {
						local134.aClass16_Sub4_2.method5335(Static390.aClass19_37);
					}
					for (@Pc(179) Class7 local179 = local134.aClass7_3; local179 != null; local179 = local179.aClass7_1) {
						local179.aClass16_Sub1_1.method5335(Static390.aClass19_37);
					}
				} else if (local45 >= 30 && local45 <= 33) {
					Static390.aClass19_37.g(3000.0F, local11 * 1.5F);
					((Class65) arg0.anObject27).method4029(Static431.anInt7073, Static93.anInt1887, Static230.anInt4431, Static252.aBooleanArrayArray4, local45 - 30 == 0);
				} else if (local45 >= 40 && local45 <= 43) {
					Static390.aClass19_37.g(3000.0F, local11 * 1.5F);
					((Class65) arg0.anObject27).method4029(Static431.anInt7073, Static93.anInt1887, Static230.anInt4431, Static440.aBooleanArrayArray6, local45 - 40 == 0);
				} else if (local45 == 22) {
					Static390.aClass19_37.AA(-1, 1583160, 40, 127);
				} else if (local45 == 23) {
					Static390.aClass19_37.l();
				} else if (local45 == 24) {
					Static390.aClass19_37.method4238(0, null);
				} else if (local45 >= 10 && local45 <= 13) {
					Static390.aClass19_37.method4303(arg0.anInt5366);
					arg0.anInt5366 = -1;
				}
			} else if (local45 >= 0 && local45 <= 3) {
				arg0.anInt5366 = local45;
				Static390.aClass19_37.method4273(local45);
			}
		} catch (@Pc(333) Exception local333) {
		} finally {
			@Pc(339) Object local339 = null;
			if (local7) {
				@Pc(405) Object local405 = this.anObject12;
				synchronized (this.anObject12) {
					super.anInt6473--;
					if (super.anInt6473 == 0) {
						this.anObject12.notifyAll();
					}
				}
			}
		}
	}
}
