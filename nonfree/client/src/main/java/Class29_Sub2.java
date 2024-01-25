import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
	private int anInt4751 = 0;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
	private int anInt4754 = 0;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "[Lclient!lt;")
	private Class152_Sub1[] aClass152_Sub1Array1 = new Class152_Sub1[0];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!wr;B)V")
	@Override
	public void method4183(@OriginalArg(0) Class251 arg0) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray84[super.anInt4737] = 20;
			super.anObjectArray35[super.anInt4737] = arg0;
			super.anInt4737++;
			super.anInt4740++;
			if (super.anInt4737 >= 5000) {
				super.anInt4737 = 0;
			}
			super.anInt4739++;
			if (this.anInt4751 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	@Override
	public void method4188() {
		try {
			@Pc(9) Object local9 = this.anObject7;
			synchronized (this.anObject7) {
				while (true) {
					if (super.anInt4739 == 0) {
						break;
					}
					this.anObject7.wait();
				}
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)V")
	private void method4196(@OriginalArg(1) int arg0) {
		super.aByteArray84[super.anInt4737] = (byte) arg0;
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
		super.anInt4740++;
		super.anInt4739++;
		if (this.anInt4751 > 0) {
			@Pc(54) Object local54 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method4197(@OriginalArg(0) int arg0) {
		super.aByteArray84[super.anInt4737] = (byte) (arg0 + 10);
		super.anInt4737++;
		if (super.anInt4737 >= 5000) {
			super.anInt4737 = 0;
		}
		super.anInt4740++;
		super.anInt4739++;
		if (this.anInt4751 > 0) {
			@Pc(52) Object local52 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(FIZLclient!ij;B)V")
	@Override
	public void method4193(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class107 arg3) {
		@Pc(12) Object local12 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray84[super.anInt4737] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
			super.anObjectArray35[super.anInt4737] = arg3;
			super.aFloatArray28[super.anInt4737] = arg0;
			super.anInt4737++;
			super.anInt4740++;
			super.anInt4739++;
			if (super.anInt4737 >= 5000) {
				super.anInt4737 = 0;
			}
			if (this.anInt4751 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
	@Override
	public void method4194(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray84[super.anInt4737] = (byte) arg0;
			super.anInt4737++;
			if (super.anInt4737 >= 5000) {
				super.anInt4737 = 0;
			}
			super.anInt4739++;
			super.anInt4740++;
			if (this.anInt4751 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!lt;I)V")
	public void method4198(@OriginalArg(0) Class152_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(11) float local11 = 0.0F;
			@Pc(14) Object local14 = this.anObject7;
			@Pc(45) byte local45;
			synchronized (this.anObject7) {
				while (super.anInt4740 == 0) {
					this.anInt4751++;
					this.anObject7.wait();
					this.anInt4751--;
				}
				local45 = super.aByteArray84[super.anInt4738];
				if (arg0.anInt3748 < 0) {
					if (local45 >= 0 && local45 <= 3) {
						local7 = true;
					}
				} else if (local45 < 0 || local45 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject4 = super.anObjectArray35[super.anInt4738];
					local11 = super.aFloatArray28[super.anInt4738];
					super.anObjectArray35[super.anInt4738] = null;
					super.anInt4738++;
					super.anInt4740--;
					if (super.anInt4738 >= 5000) {
						super.anInt4738 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3748 < 0) {
				if (local45 >= 0 && local45 <= 3) {
					arg0.anInt3748 = local45;
					Static350.aClass63_8.method2044(local45);
				}
			} else if (local45 == 21) {
				Static357.method4127(arg0, (Class251) arg0.anObject4);
			} else if (local45 == 20) {
				@Pc(151) Class251 local151 = (Class251) arg0.anObject4;
				if (local151.aClass1_Sub1_3 != null) {
					local151.aClass1_Sub1_3.method5644(Static350.aClass63_8);
				}
				if (local151.aClass1_Sub1_2 != null) {
					local151.aClass1_Sub1_2.method5644(Static350.aClass63_8);
				}
				if (local151.aClass1_Sub2_2 != null) {
					local151.aClass1_Sub2_2.method5644(Static350.aClass63_8);
				}
				if (local151.aClass1_Sub2_3 != null) {
					local151.aClass1_Sub2_3.method5644(Static350.aClass63_8);
				}
				if (local151.aClass1_Sub3_2 != null) {
					local151.aClass1_Sub3_2.method5644(Static350.aClass63_8);
				}
				for (@Pc(194) Class46 local194 = local151.aClass46_3; local194 != null; local194 = local194.aClass46_1) {
					local194.aClass1_Sub5_1.method5644(Static350.aClass63_8);
				}
			} else if (local45 >= 30 && local45 <= 33) {
				Static350.aClass63_8.method2030(3000.0F, local11 * 1.5F);
				((Class107) arg0.anObject4).method4681(Static322.anInt5531, Static314.anInt5359, Static309.anInt5190, Static199.aBooleanArrayArray4, local45 - 30 == 0);
			} else if (local45 >= 40 && local45 <= 43) {
				Static350.aClass63_8.method2030(3000.0F, local11 * 1.5F);
				((Class107) arg0.anObject4).method4681(Static322.anInt5531, Static314.anInt5359, Static309.anInt5190, Static360.aBooleanArrayArray7, local45 - 40 == 0);
			} else if (local45 == 22) {
				Static350.aClass63_8.method1978();
			} else if (local45 == 23) {
				Static350.aClass63_8.method1952();
			} else if (local45 == 24) {
				Static350.aClass63_8.method2011(0, null);
			} else if (local45 >= 10 && local45 <= 13) {
				Static350.aClass63_8.method2042(arg0.anInt3748);
				arg0.anInt3748 = -1;
			}
		} catch (@Pc(328) Exception local328) {
		} finally {
			@Pc(334) Object local334 = null;
			if (local7) {
				@Pc(403) Object local403 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt4739--;
					if (super.anInt4739 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!wr;)V")
	@Override
	public void method4189(@OriginalArg(1) Class251 arg0) {
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt4738--;
			if (super.anInt4738 < 0) {
				super.anInt4738 = 4999;
			}
			super.aByteArray84[super.anInt4738] = 21;
			super.anObjectArray35[super.anInt4738] = arg0;
			super.anInt4739++;
			super.anInt4740++;
			if (this.anInt4751 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	@Override
	public void method4184() {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(6) int local6 = 0; local6 < this.anInt4754; local6++) {
				if (this.aClass152_Sub1Array1[local6].anInt3748 >= 0) {
					this.method4197(this.aClass152_Sub1Array1[local6].anInt3748);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!wr;I)V")
	@Override
	public void method4191(@OriginalArg(0) Class251 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray84[super.anInt4737] = 21;
			super.anObjectArray35[super.anInt4737] = arg0;
			super.anInt4737++;
			if (super.anInt4737 >= 5000) {
				super.anInt4737 = 0;
			}
			super.anInt4739++;
			super.anInt4740++;
			if (this.anInt4751 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
	@Override
	public void method4190(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(22) int local22;
			if (arg0 == this.anInt4754) {
				for (local22 = 0; local22 < this.anInt4754; local22++) {
					this.method4196(local7++);
				}
			} else {
				for (local22 = 0; local22 < this.anInt4754; local22++) {
					this.aClass152_Sub1Array1[local22].method3443();
				}
				this.anInt4754 = arg0;
				this.aClass152_Sub1Array1 = new Class152_Sub1[this.anInt4754];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4754; local75++) {
					this.aClass152_Sub1Array1[local75] = new Class152_Sub1(this);
					this.aClass152_Sub1Array1[local75].method3446();
					this.method4196(local7++);
				}
			}
		}
	}
}
