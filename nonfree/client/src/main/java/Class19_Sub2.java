import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!t", name = "x", descriptor = "[Lclient!ia;")
	private Class103_Sub1[] aClass103_Sub1Array1 = new Class103_Sub1[0];

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	private int anInt6085 = 0;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	private int anInt6090 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
	private void method5308(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6073] = (byte) (arg0 + 10);
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
		super.anInt6071++;
		super.anInt6072++;
		if (this.anInt6085 > 0) {
			@Pc(53) Object local53 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZLclient!mi;F)V")
	@Override
	public void method5304(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class149 arg2, @OriginalArg(4) float arg3) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray93[super.anInt6073] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray35[super.anInt6073] = arg2;
			super.aFloatArray27[super.anInt6073] = arg3;
			super.anInt6073++;
			super.anInt6071++;
			if (super.anInt6073 >= 5000) {
				super.anInt6073 = 0;
			}
			super.anInt6072++;
			if (this.anInt6085 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	@Override
	public void method5301(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(18) int local18;
			if (this.anInt6090 == arg0) {
				for (local18 = 0; local18 < this.anInt6090; local18++) {
					this.method5310(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt6090; local18++) {
					this.aClass103_Sub1Array1[local18].method2437();
				}
				this.anInt6090 = arg0;
				this.aClass103_Sub1Array1 = new Class103_Sub1[this.anInt6090];
				for (@Pc(58) int local58 = 0; local58 < this.anInt6090; local58++) {
					this.aClass103_Sub1Array1[local58] = new Class103_Sub1(this);
					this.aClass103_Sub1Array1[local58].method2436();
					this.method5310(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
	private void method5310(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6073] = (byte) arg0;
		super.anInt6073++;
		if (super.anInt6073 >= 5000) {
			super.anInt6073 = 0;
		}
		super.anInt6072++;
		super.anInt6071++;
		if (this.anInt6085 > 0) {
			@Pc(44) Object local44 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public void method5298() {
		try {
			@Pc(14) Object local14 = this.anObject7;
			synchronized (this.anObject7) {
				while (true) {
					if (super.anInt6072 == 0) {
						break;
					}
					this.anObject7.wait();
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5305(@OriginalArg(1) Class188 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt6070--;
			if (super.anInt6070 < 0) {
				super.anInt6070 = 4999;
			}
			super.aByteArray93[super.anInt6070] = 21;
			super.anObjectArray35[super.anInt6070] = arg0;
			super.anInt6072++;
			super.anInt6071++;
			if (this.anInt6085 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5307(@OriginalArg(0) Class188 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray93[super.anInt6073] = 21;
			super.anObjectArray35[super.anInt6073] = arg0;
			super.anInt6073++;
			super.anInt6071++;
			if (super.anInt6073 >= 5000) {
				super.anInt6073 = 0;
			}
			super.anInt6072++;
			if (this.anInt6085 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method5312(@OriginalArg(0) Class103_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject7;
			@Pc(48) byte local48;
			synchronized (this.anObject7) {
				while (super.anInt6071 == 0) {
					this.anInt6085++;
					this.anObject7.wait();
					this.anInt6085--;
				}
				local48 = super.aByteArray93[super.anInt6070];
				if (arg0.anInt3028 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject5 = super.anObjectArray35[super.anInt6070];
					local17 = super.aFloatArray27[super.anInt6070];
					super.anObjectArray35[super.anInt6070] = null;
					super.anInt6070++;
					if (super.anInt6070 >= 5000) {
						super.anInt6070 = 0;
					}
					super.anInt6071--;
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3028 >= 0) {
				if (local48 == 21) {
					Static84.method1454(arg0, (Class188) arg0.anObject5);
				} else if (local48 == 20) {
					@Pc(148) Class188 local148 = (Class188) arg0.anObject5;
					if (local148.aClass1_Sub5_2 != null) {
						local148.aClass1_Sub5_2.method6023(Static59.aClass48_2);
					}
					if (local148.aClass1_Sub5_1 != null) {
						local148.aClass1_Sub5_1.method6023(Static59.aClass48_2);
					}
					if (local148.aClass1_Sub3_3 != null) {
						local148.aClass1_Sub3_3.method6023(Static59.aClass48_2);
					}
					if (local148.aClass1_Sub3_2 != null) {
						local148.aClass1_Sub3_2.method6023(Static59.aClass48_2);
					}
					if (local148.aClass1_Sub1_2 != null) {
						local148.aClass1_Sub1_2.method6023(Static59.aClass48_2);
					}
					for (@Pc(195) Class168 local195 = local148.aClass168_2; local195 != null; local195 = local195.aClass168_1) {
						local195.aClass1_Sub2_1.method6023(Static59.aClass48_2);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					Static59.aClass48_2.method2460(3000.0F, local17 * 1.5F);
					((Class149) arg0.anObject5).method5833(Static284.anInt5626, Static373.anInt6861, Static113.anInt5764, Static133.aBooleanArrayArray3, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					Static59.aClass48_2.method2460(3000.0F, local17 * 1.5F);
					((Class149) arg0.anObject5).method5833(Static284.anInt5626, Static373.anInt6861, Static113.anInt5764, Static66.aBooleanArrayArray1, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static59.aClass48_2.method2521();
				} else if (local48 == 23) {
					Static59.aClass48_2.method2533();
				} else if (local48 == 24) {
					Static59.aClass48_2.method2474(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static59.aClass48_2.method2457(arg0.anInt3028);
					arg0.anInt3028 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt3028 = local48;
				Static59.aClass48_2.method2518(local48);
			}
		} catch (@Pc(340) Exception local340) {
		} finally {
			@Pc(346) Object local346 = null;
			if (local7) {
				@Pc(406) Object local406 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt6072--;
					if (super.anInt6072 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5299(@OriginalArg(0) Class188 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray93[super.anInt6073] = 20;
			super.anObjectArray35[super.anInt6073] = arg0;
			super.anInt6073++;
			super.anInt6072++;
			super.anInt6071++;
			if (super.anInt6073 >= 5000) {
				super.anInt6073 = 0;
			}
			if (this.anInt6085 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	@Override
	public void method5300() {
		@Pc(8) Object local8 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt6090; local12++) {
				if (this.aClass103_Sub1Array1[local12].anInt3028 >= 0) {
					this.method5308(this.aClass103_Sub1Array1[local12].anInt3028);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
	@Override
	public void method5303(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray93[super.anInt6073] = (byte) arg0;
			super.anInt6073++;
			super.anInt6072++;
			super.anInt6071++;
			if (super.anInt6073 >= 5000) {
				super.anInt6073 = 0;
			}
			if (this.anInt6085 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}
}
