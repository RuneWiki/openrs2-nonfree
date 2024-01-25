import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject9 = new Object();

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
	private int anInt4401 = 0;

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "[Lclient!au;")
	private Class17_Sub1[] aClass17_Sub1Array1 = new Class17_Sub1[0];

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
	private int anInt4403 = 0;

	static {
		new Class96("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method5057() {
		@Pc(8) Object local8 = this.anObject9;
		synchronized (this.anObject9) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt4401; local12++) {
				if (this.aClass17_Sub1Array1[local12].anInt301 >= 0) {
					this.method3638(this.aClass17_Sub1Array1[local12].anInt301);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!kf;B)V")
	@Override
	public void method5056(@OriginalArg(0) Class137 arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray74[super.anInt6458] = 20;
			super.anObjectArray5[super.anInt6458] = arg0;
			super.anInt6458++;
			if (super.anInt6458 >= 5000) {
				super.anInt6458 = 0;
			}
			super.anInt6456++;
			super.anInt6460++;
			if (this.anInt4403 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
	@Override
	public void method5054() {
		try {
			@Pc(4) Object local4 = this.anObject9;
			synchronized (this.anObject9) {
				while (true) {
					if (super.anInt6460 == 0) {
						break;
					}
					this.anObject9.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
	private void method3638(@OriginalArg(0) int arg0) {
		super.aByteArray74[super.anInt6458] = (byte) (arg0 + 10);
		super.anInt6458++;
		super.anInt6456++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
		super.anInt6460++;
		if (this.anInt4403 > 0) {
			@Pc(53) Object local53 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IZ)V")
	private void method3639(@OriginalArg(0) int arg0) {
		super.aByteArray74[super.anInt6458] = (byte) arg0;
		super.anInt6458++;
		if (super.anInt6458 >= 5000) {
			super.anInt6458 = 0;
		}
		super.anInt6460++;
		super.anInt6456++;
		if (this.anInt4403 > 0) {
			@Pc(52) Object local52 = this.anObject9;
			synchronized (this.anObject9) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray74[super.anInt6458] = (byte) arg0;
			super.anInt6458++;
			if (super.anInt6458 >= 5000) {
				super.anInt6458 = 0;
			}
			super.anInt6456++;
			super.anInt6460++;
			if (this.anInt4403 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lclient!kf;I)V")
	@Override
	public void method5050(@OriginalArg(0) Class137 arg0) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray74[super.anInt6458] = 21;
			super.anObjectArray5[super.anInt6458] = arg0;
			super.anInt6458++;
			super.anInt6456++;
			super.anInt6460++;
			if (super.anInt6458 >= 5000) {
				super.anInt6458 = 0;
			}
			if (this.anInt4403 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZFBLclient!na;I)V")
	@Override
	public void method5051(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) int arg3) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.aByteArray74[super.anInt6458] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray5[super.anInt6458] = arg2;
			super.aFloatArray40[super.anInt6458] = arg1;
			super.anInt6458++;
			if (super.anInt6458 >= 5000) {
				super.anInt6458 = 0;
			}
			super.anInt6456++;
			super.anInt6460++;
			if (this.anInt4403 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5052(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject9;
		synchronized (this.anObject9) {
			@Pc(18) int local18;
			if (arg0 == this.anInt4401) {
				for (local18 = 0; local18 < this.anInt4401; local18++) {
					this.method3639(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt4401; local18++) {
					this.aClass17_Sub1Array1[local18].method249();
				}
				this.anInt4401 = arg0;
				this.aClass17_Sub1Array1 = new Class17_Sub1[this.anInt4401];
				for (@Pc(68) int local68 = 0; local68 < this.anInt4401; local68++) {
					this.aClass17_Sub1Array1[local68] = new Class17_Sub1(this);
					this.aClass17_Sub1Array1[local68].method250();
					this.method3639(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!kf;I)V")
	@Override
	public void method5049(@OriginalArg(0) Class137 arg0) {
		@Pc(2) Object local2 = this.anObject9;
		synchronized (this.anObject9) {
			super.anInt6454--;
			if (super.anInt6454 < 0) {
				super.anInt6454 = 4999;
			}
			super.aByteArray74[super.anInt6454] = 21;
			super.anObjectArray5[super.anInt6454] = arg0;
			super.anInt6460++;
			super.anInt6456++;
			if (this.anInt4403 > 0) {
				this.anObject9.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!au;)V")
	public void method3641(@OriginalArg(1) Class17_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(19) Object local19 = this.anObject9;
			@Pc(47) byte local47;
			synchronized (this.anObject9) {
				while (super.anInt6456 == 0) {
					this.anInt4403++;
					this.anObject9.wait();
					this.anInt4403--;
				}
				local47 = super.aByteArray74[super.anInt6454];
				if (arg0.anInt301 >= 0) {
					if (local47 < 0 || local47 > 3) {
						local7 = true;
					}
				} else if (local47 >= 0 && local47 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject2 = super.anObjectArray5[super.anInt6454];
					local11 = super.aFloatArray40[super.anInt6454];
					super.anObjectArray5[super.anInt6454] = null;
					super.anInt6454++;
					if (super.anInt6454 >= 5000) {
						super.anInt6454 = 0;
					}
					super.anInt6456--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt301 < 0) {
				if (local47 >= 0 && local47 <= 3) {
					arg0.anInt301 = local47;
					Static74.aClass121_3.method4609(local47);
				}
			} else if (local47 == 21) {
				Static154.method2451(arg0, (Class137) arg0.anObject2);
			} else if (local47 == 20) {
				@Pc(153) Class137 local153 = (Class137) arg0.anObject2;
				if (local153.aClass47_Sub2_1 != null) {
					local153.aClass47_Sub2_1.method5732(Static74.aClass121_3);
				}
				if (local153.aClass47_Sub2_2 != null) {
					local153.aClass47_Sub2_2.method5732(Static74.aClass121_3);
				}
				if (local153.aClass47_Sub4_1 != null) {
					local153.aClass47_Sub4_1.method5732(Static74.aClass121_3);
				}
				if (local153.aClass47_Sub4_2 != null) {
					local153.aClass47_Sub4_2.method5732(Static74.aClass121_3);
				}
				if (local153.aClass47_Sub5_1 != null) {
					local153.aClass47_Sub5_1.method5732(Static74.aClass121_3);
				}
				for (@Pc(196) Class167 local196 = local153.aClass167_1; local196 != null; local196 = local196.aClass167_2) {
					local196.aClass47_Sub1_2.method5732(Static74.aClass121_3);
				}
			} else if (local47 >= 30 && local47 <= 33) {
				Static74.aClass121_3.o(3000.0F, local11 * 1.5F);
				((Class70) arg0.anObject2).method4266(Static59.anInt1066, Static161.anInt2868, Static370.anInt7659, Static6.aBooleanArrayArray3, local47 - 30 == 0);
			} else if (local47 >= 40 && local47 <= 43) {
				Static74.aClass121_3.o(3000.0F, local11 * 1.5F);
				((Class70) arg0.anObject2).method4266(Static59.anInt1066, Static161.anInt2868, Static370.anInt7659, Static418.aBooleanArrayArray11, local47 - 40 == 0);
			} else if (local47 == 22) {
				Static74.aClass121_3.fa(-1, 1583160, 40, 127);
			} else if (local47 == 23) {
				Static74.aClass121_3.S();
			} else if (local47 == 24) {
				Static74.aClass121_3.method4591(0, null);
			} else if (local47 >= 10 && local47 <= 13) {
				Static74.aClass121_3.method4632(arg0.anInt301);
				arg0.anInt301 = -1;
			}
		} catch (@Pc(328) Exception local328) {
		} finally {
			@Pc(334) Object local334 = null;
			if (local7) {
				@Pc(391) Object local391 = this.anObject9;
				synchronized (this.anObject9) {
					super.anInt6460--;
					if (super.anInt6460 == 0) {
						this.anObject9.notifyAll();
					}
				}
			}
		}
	}
}
