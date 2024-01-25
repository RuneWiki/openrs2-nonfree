import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject8 = new Object();

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
	private int anInt6890 = 0;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
	private int anInt6892 = 0;

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "[Lclient!wb;")
	private Class151_Sub1[] aClass151_Sub1Array1 = new Class151_Sub1[0];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	@Override
	public void method5701() {
		@Pc(8) Object local8 = this.anObject8;
		synchronized (this.anObject8) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt6890; local19++) {
				if (this.aClass151_Sub1Array1[local19].anInt6719 >= 0) {
					this.method5717(this.aClass151_Sub1Array1[local19].anInt6719);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class57 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray95[super.anInt6876] = 20;
			super.anObjectArray35[super.anInt6876] = arg0;
			super.anInt6876++;
			if (super.anInt6876 >= 5000) {
				super.anInt6876 = 0;
			}
			super.anInt6871++;
			super.anInt6865++;
			if (this.anInt6892 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	private void method5715(@OriginalArg(1) int arg0) {
		super.aByteArray95[super.anInt6876] = (byte) arg0;
		super.anInt6876++;
		super.anInt6865++;
		super.anInt6871++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
		if (this.anInt6892 > 0) {
			@Pc(51) Object local51 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method5716(@OriginalArg(0) Class151_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject8;
			@Pc(55) byte local55;
			synchronized (this.anObject8) {
				while (super.anInt6865 == 0) {
					this.anInt6892++;
					this.anObject8.wait();
					this.anInt6892--;
				}
				local55 = super.aByteArray95[super.anInt6877];
				if (arg0.anInt6719 < 0) {
					if (local55 >= 0 && local55 <= 3) {
						local7 = true;
					}
				} else if (local55 < 0 || local55 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject7 = super.anObjectArray35[super.anInt6877];
					local11 = super.aFloatArray30[super.anInt6877];
					super.anObjectArray35[super.anInt6877] = null;
					super.anInt6877++;
					super.anInt6865--;
					if (super.anInt6877 >= 5000) {
						super.anInt6877 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6719 >= 0) {
				if (local55 == 21) {
					Static148.method3991(arg0, (Class57) arg0.anObject7);
				} else if (local55 == 20) {
					@Pc(148) Class57 local148 = (Class57) arg0.anObject7;
					if (local148.aClass2_Sub4_1 != null) {
						local148.aClass2_Sub4_1.method5409(Static84.aClass92_1);
					}
					if (local148.aClass2_Sub4_2 != null) {
						local148.aClass2_Sub4_2.method5409(Static84.aClass92_1);
					}
					if (local148.aClass2_Sub1_1 != null) {
						local148.aClass2_Sub1_1.method5409(Static84.aClass92_1);
					}
					if (local148.aClass2_Sub1_2 != null) {
						local148.aClass2_Sub1_2.method5409(Static84.aClass92_1);
					}
					if (local148.aClass2_Sub5_1 != null) {
						local148.aClass2_Sub5_1.method5409(Static84.aClass92_1);
					}
					for (@Pc(191) Class95 local191 = local148.aClass95_2; local191 != null; local191 = local191.aClass95_3) {
						local191.aClass2_Sub2_1.method5409(Static84.aClass92_1);
					}
				} else if (local55 >= 30 && local55 <= 33) {
					Static84.aClass92_1.method4539(3000.0F, local11 * 1.5F);
					((Class26) arg0.anObject7).method4993(Static307.anInt3770, Static178.anInt6542, Static226.anInt4752, Static248.aBooleanArrayArray4, local55 - 30 == 0);
				} else if (local55 >= 40 && local55 <= 43) {
					Static84.aClass92_1.method4539(3000.0F, local11 * 1.5F);
					((Class26) arg0.anObject7).method4993(Static307.anInt3770, Static178.anInt6542, Static226.anInt4752, Static47.aBooleanArrayArray2, local55 - 40 == 0);
				} else if (local55 == 22) {
					Static84.aClass92_1.method4440();
				} else if (local55 == 23) {
					Static84.aClass92_1.method4446();
				} else if (local55 == 24) {
					Static84.aClass92_1.method4445(0, null);
				} else if (local55 >= 10 && local55 <= 13) {
					Static84.aClass92_1.method4511(arg0.anInt6719);
					arg0.anInt6719 = -1;
				}
			} else if (local55 >= 0 && local55 <= 3) {
				arg0.anInt6719 = local55;
				Static84.aClass92_1.method4514(local55);
			}
		} catch (@Pc(336) Exception local336) {
		} finally {
			@Pc(342) Object local342 = null;
			if (local7) {
				@Pc(399) Object local399 = this.anObject8;
				synchronized (this.anObject8) {
					super.anInt6871--;
					if (super.anInt6871 == 0) {
						this.anObject8.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!bl;IFBZ)V")
	@Override
	public void method5708(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray95[super.anInt6876] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt6876] = arg0;
			super.aFloatArray30[super.anInt6876] = arg2;
			super.anInt6876++;
			if (super.anInt6876 >= 5000) {
				super.anInt6876 = 0;
			}
			super.anInt6871++;
			super.anInt6865++;
			if (this.anInt6892 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	private void method5717(@OriginalArg(0) int arg0) {
		super.aByteArray95[super.anInt6876] = (byte) (arg0 + 10);
		super.anInt6876++;
		super.anInt6871++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
		super.anInt6865++;
		if (this.anInt6892 > 0) {
			@Pc(49) Object local49 = this.anObject8;
			synchronized (this.anObject8) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5700(@OriginalArg(0) Class57 arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.anInt6877--;
			if (super.anInt6877 < 0) {
				super.anInt6877 = 4999;
			}
			super.aByteArray95[super.anInt6877] = 21;
			super.anObjectArray35[super.anInt6877] = arg0;
			super.anInt6871++;
			super.anInt6865++;
			if (this.anInt6892 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray95[super.anInt6876] = (byte) arg0;
			super.anInt6876++;
			if (super.anInt6876 >= 5000) {
				super.anInt6876 = 0;
			}
			super.anInt6865++;
			super.anInt6871++;
			if (this.anInt6892 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V")
	@Override
	public void method5711(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = 0;
		@Pc(14) Object local14 = this.anObject8;
		synchronized (this.anObject8) {
			@Pc(26) int local26;
			if (this.anInt6890 == arg0) {
				for (local26 = 0; local26 < this.anInt6890; local26++) {
					this.method5715(local11++);
				}
			} else {
				for (local26 = 0; local26 < this.anInt6890; local26++) {
					this.aClass151_Sub1Array1[local26].method5586();
				}
				this.anInt6890 = arg0;
				this.aClass151_Sub1Array1 = new Class151_Sub1[this.anInt6890];
				for (@Pc(70) int local70 = 0; local70 < this.anInt6890; local70++) {
					this.aClass151_Sub1Array1[local70] = new Class151_Sub1(this);
					this.aClass151_Sub1Array1[local70].method5588();
					this.method5715(local11++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!e;)V")
	@Override
	public void method5709(@OriginalArg(1) Class57 arg0) {
		@Pc(2) Object local2 = this.anObject8;
		synchronized (this.anObject8) {
			super.aByteArray95[super.anInt6876] = 21;
			super.anObjectArray35[super.anInt6876] = arg0;
			super.anInt6876++;
			super.anInt6871++;
			super.anInt6865++;
			if (super.anInt6876 >= 5000) {
				super.anInt6876 = 0;
			}
			if (this.anInt6892 > 0) {
				this.anObject8.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
	@Override
	public void method5703() {
		try {
			@Pc(4) Object local4 = this.anObject8;
			synchronized (this.anObject8) {
				while (true) {
					if (super.anInt6871 == 0) {
						break;
					}
					this.anObject8.wait();
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}
}
