import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	private int anInt5955 = 0;

	@OriginalMember(owner = "client!md", name = "B", descriptor = "I")
	private int anInt5956 = 0;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "[Lclient!sl;")
	private Class288_Sub1[] aClass288_Sub1Array1 = new Class288_Sub1[0];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!sl;)V")
	public void method5098(@OriginalArg(1) Class288_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Object local12 = this.anObject7;
			@Pc(43) byte local43;
			synchronized (this.anObject7) {
				while (super.anInt5937 == 0) {
					this.anInt5955++;
					this.anObject7.wait();
					this.anInt5955--;
				}
				local43 = super.aByteArray68[super.anInt5935];
				if (arg0.anInt8656 >= 0) {
					if (local43 < 0 || local43 > 3) {
						local7 = true;
					}
				} else if (local43 >= 0 && local43 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject18 = super.anObjectArray35[super.anInt5935];
					super.anObjectArray35[super.anInt5935] = null;
					super.anInt5935++;
					if (super.anInt5935 >= 5000) {
						super.anInt5935 = 0;
					}
					super.anInt5937--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt8656 >= 0) {
				if (local43 == 21) {
					Static6.method504(arg0, (Class224) arg0.anObject18);
				} else if (local43 == 20) {
					@Pc(128) Class224 local128 = (Class224) arg0.anObject18;
					if (local128.aClass11_Sub4_3 != null) {
						local128.aClass11_Sub4_3.method8110(Static114.aClass9_5);
					}
					if (local128.aClass11_Sub4_2 != null) {
						local128.aClass11_Sub4_2.method8110(Static114.aClass9_5);
					}
					if (local128.aClass11_Sub3_2 != null) {
						local128.aClass11_Sub3_2.method8110(Static114.aClass9_5);
					}
					if (local128.aClass11_Sub3_1 != null) {
						local128.aClass11_Sub3_1.method8110(Static114.aClass9_5);
					}
					if (local128.aClass11_Sub5_2 != null) {
						local128.aClass11_Sub5_2.method8110(Static114.aClass9_5);
					}
					for (@Pc(171) Class270 local171 = local128.aClass270_1; local171 != null; local171 = local171.aClass270_2) {
						local171.aClass11_Sub1_2.method8110(Static114.aClass9_5);
					}
				} else if (local43 >= 30 && local43 <= 33) {
					((Class62) arg0.anObject18).method8208(Static579.anInt7897, Static266.anInt4817, Static203.anInt4358, Static487.aBooleanArrayArray9, local43 - 30 == 0);
				} else if (local43 >= 40 && local43 <= 43) {
					((Class62) arg0.anObject18).method8208(Static579.anInt7897, Static266.anInt4817, Static203.anInt4358, Static277.aBooleanArrayArray3, local43 - 40 == 0);
				} else if (local43 == 22) {
					Static114.aClass9_5.AA(-1, 1583160, 40, 127);
				} else if (local43 == 23) {
					Static114.aClass9_5.k();
				} else if (local43 == 24) {
					Static114.aClass9_5.method5401(0, null);
				} else if (local43 >= 10 && local43 <= 13) {
					Static114.aClass9_5.method5426(arg0.anInt8656);
					arg0.anInt8656 = -1;
				}
			} else if (local43 >= 0 && local43 <= 3) {
				arg0.anInt8656 = local43;
				Static114.aClass9_5.method5459(local43);
			}
		} catch (@Pc(306) Exception local306) {
		} finally {
			@Pc(312) Object local312 = null;
			if (local7) {
				@Pc(372) Object local372 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt5938--;
					if (super.anInt5938 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!d;IZI)V")
	@Override
	public void method5094(@OriginalArg(0) Class62 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Object local8 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray68[super.anInt5940] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
			super.anObjectArray35[super.anInt5940] = arg0;
			super.anInt5940++;
			super.anInt5937++;
			super.anInt5938++;
			if (super.anInt5940 >= 5000) {
				super.anInt5940 = 0;
			}
			if (this.anInt5955 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	@Override
	public void method5095() {
		try {
			@Pc(8) Object local8 = this.anObject7;
			synchronized (this.anObject7) {
				while (super.anInt5938 != 0) {
					this.anObject7.wait();
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ne;)V")
	@Override
	public void method5091(@OriginalArg(1) Class224 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray68[super.anInt5940] = 20;
			super.anObjectArray35[super.anInt5940] = arg0;
			super.anInt5940++;
			super.anInt5938++;
			if (super.anInt5940 >= 5000) {
				super.anInt5940 = 0;
			}
			super.anInt5937++;
			if (this.anInt5955 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(ILclient!ne;)V")
	@Override
	public void method5092(@OriginalArg(1) Class224 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray68[super.anInt5940] = 21;
			super.anObjectArray35[super.anInt5940] = arg0;
			super.anInt5940++;
			super.anInt5937++;
			if (super.anInt5940 >= 5000) {
				super.anInt5940 = 0;
			}
			super.anInt5938++;
			if (this.anInt5955 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method5088() {
		@Pc(8) Object local8 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt5956; local12++) {
				if (this.aClass288_Sub1Array1[local12].anInt8656 >= 0) {
					this.method5100(this.aClass288_Sub1Array1[local12].anInt8656);
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	@Override
	public void method5090(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(18) int local18;
			if (arg0 == this.anInt5956) {
				for (local18 = 0; local18 < this.anInt5956; local18++) {
					this.method5105(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt5956; local18++) {
					this.aClass288_Sub1Array1[local18].method7229();
				}
				this.anInt5956 = arg0;
				this.aClass288_Sub1Array1 = new Class288_Sub1[this.anInt5956];
				for (@Pc(68) int local68 = 0; local68 < this.anInt5956; local68++) {
					this.aClass288_Sub1Array1[local68] = new Class288_Sub1(this);
					this.aClass288_Sub1Array1[local68].method7228();
					this.method5105(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!ne;)V")
	@Override
	public void method5089(@OriginalArg(1) Class224 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt5935--;
			if (super.anInt5935 < 0) {
				super.anInt5935 = 4999;
			}
			super.aByteArray68[super.anInt5935] = 21;
			super.anObjectArray35[super.anInt5935] = arg0;
			super.anInt5937++;
			super.anInt5938++;
			if (this.anInt5955 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V")
	private void method5100(@OriginalArg(1) int arg0) {
		super.aByteArray68[super.anInt5940] = (byte) (arg0 + 10);
		super.anInt5940++;
		super.anInt5937++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
		super.anInt5938++;
		if (this.anInt5955 > 0) {
			@Pc(50) Object local50 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	@Override
	public void method5096(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray68[super.anInt5940] = (byte) arg0;
			super.anInt5940++;
			super.anInt5937++;
			if (super.anInt5940 >= 5000) {
				super.anInt5940 = 0;
			}
			super.anInt5938++;
			if (this.anInt5955 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V")
	private void method5105(@OriginalArg(0) int arg0) {
		super.aByteArray68[super.anInt5940] = (byte) arg0;
		super.anInt5940++;
		if (super.anInt5940 >= 5000) {
			super.anInt5940 = 0;
		}
		super.anInt5937++;
		super.anInt5938++;
		if (this.anInt5955 > 0) {
			@Pc(52) Object local52 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}
}
