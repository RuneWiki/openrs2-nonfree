import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Ljava/lang/Object;")
	private final Object anObject7 = new Object();

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[Lclient!uf;")
	private Class111_Sub1[] aClass111_Sub1Array1 = new Class111_Sub1[0];

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private int anInt4422 = 0;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	private int anInt4428 = 0;

	static {
		new Class119("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method3491() {
		@Pc(4) Object local4 = this.anObject7;
		synchronized (this.anObject7) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt4422; local8++) {
				if (this.aClass111_Sub1Array1[local8].anInt6709 >= 0) {
					this.method3503(this.aClass111_Sub1Array1[local8].anInt6709);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!uf;)V")
	public void method3499(@OriginalArg(1) Class111_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(18) float local18 = 0.0F;
			@Pc(21) Object local21 = this.anObject7;
			@Pc(52) byte local52;
			synchronized (this.anObject7) {
				while (super.anInt4407 == 0) {
					this.anInt4428++;
					this.anObject7.wait();
					this.anInt4428--;
				}
				local52 = super.aByteArray53[super.anInt4409];
				if (arg0.anInt6709 >= 0) {
					if (local52 < 0 || local52 > 3) {
						local7 = true;
					}
				} else if (local52 >= 0 && local52 <= 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject10 = super.anObjectArray35[super.anInt4409];
					local18 = super.aFloatArray19[super.anInt4409];
					super.anObjectArray35[super.anInt4409] = null;
					super.anInt4409++;
					super.anInt4407--;
					if (super.anInt4409 >= 5000) {
						super.anInt4409 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt6709 < 0) {
				if (local52 >= 0 && local52 <= 3) {
					arg0.anInt6709 = local52;
					Static52.aClass34_1.method5742(local52);
				}
			} else if (local52 == 21) {
				Static254.method3670(arg0, (Class169) arg0.anObject10);
			} else if (local52 == 20) {
				@Pc(278) Class169 local278 = (Class169) arg0.anObject10;
				if (local278.aClass25_Sub4_2 != null) {
					local278.aClass25_Sub4_2.method4606(Static52.aClass34_1);
				}
				if (local278.aClass25_Sub4_1 != null) {
					local278.aClass25_Sub4_1.method4606(Static52.aClass34_1);
				}
				if (local278.aClass25_Sub1_2 != null) {
					local278.aClass25_Sub1_2.method4606(Static52.aClass34_1);
				}
				if (local278.aClass25_Sub1_3 != null) {
					local278.aClass25_Sub1_3.method4606(Static52.aClass34_1);
				}
				if (local278.aClass25_Sub2_2 != null) {
					local278.aClass25_Sub2_2.method4606(Static52.aClass34_1);
				}
				for (@Pc(321) Class27 local321 = local278.aClass27_3; local321 != null; local321 = local321.aClass27_1) {
					local321.aClass25_Sub5_1.method4606(Static52.aClass34_1);
				}
			} else if (local52 >= 30 && local52 <= 33) {
				Static52.aClass34_1.da(3000.0F, local18 * 1.5F);
				((Class157) arg0.anObject10).method4944(Static321.anInt5494, Static64.anInt1211, Static179.anInt3132, Static44.aBooleanArrayArray1, local52 - 30 == 0);
			} else if (local52 >= 40 && local52 <= 43) {
				Static52.aClass34_1.da(3000.0F, local18 * 1.5F);
				((Class157) arg0.anObject10).method4944(Static321.anInt5494, Static64.anInt1211, Static179.anInt3132, Static431.aBooleanArrayArray6, local52 - 40 == 0);
			} else if (local52 == 22) {
				Static52.aClass34_1.s(-1, 1583160, 40, 127);
			} else if (local52 == 23) {
				Static52.aClass34_1.n();
			} else if (local52 == 24) {
				Static52.aClass34_1.method5730(0, null);
			} else if (local52 >= 10 && local52 <= 13) {
				Static52.aClass34_1.method5749(arg0.anInt6709);
				arg0.anInt6709 = -1;
			}
		} catch (@Pc(338) Exception local338) {
		} finally {
			@Pc(344) Object local344 = null;
			if (local7) {
				@Pc(401) Object local401 = this.anObject7;
				synchronized (this.anObject7) {
					super.anInt4408--;
					if (super.anInt4408 == 0) {
						this.anObject7.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	private void method3501(@OriginalArg(1) int arg0) {
		super.aByteArray53[super.anInt4410] = (byte) arg0;
		super.anInt4410++;
		super.anInt4407++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
		super.anInt4408++;
		if (this.anInt4428 > 0) {
			@Pc(47) Object local47 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!no;B)V")
	@Override
	public void method3489(@OriginalArg(0) Class169 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray53[super.anInt4410] = 21;
			super.anObjectArray35[super.anInt4410] = arg0;
			super.anInt4410++;
			if (super.anInt4410 >= 5000) {
				super.anInt4410 = 0;
			}
			super.anInt4407++;
			super.anInt4408++;
			if (this.anInt4428 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	@Override
	public void method3493(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) Object local10 = this.anObject7;
		synchronized (this.anObject7) {
			@Pc(18) int local18;
			if (this.anInt4422 == arg0) {
				for (local18 = 0; local18 < this.anInt4422; local18++) {
					this.method3501(local7++);
				}
			} else {
				for (local18 = 0; local18 < this.anInt4422; local18++) {
					this.aClass111_Sub1Array1[local18].method5262();
				}
				this.anInt4422 = arg0;
				this.aClass111_Sub1Array1 = new Class111_Sub1[this.anInt4422];
				for (@Pc(64) int local64 = 0; local64 < this.anInt4422; local64++) {
					this.aClass111_Sub1Array1[local64] = new Class111_Sub1(this);
					this.aClass111_Sub1Array1[local64].method5264();
					this.method3501(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	@Override
	public void method3496() {
		try {
			@Pc(12) Object local12 = this.anObject7;
			synchronized (this.anObject7) {
				while (super.anInt4408 != 0) {
					this.anObject7.wait();
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLclient!no;)V")
	@Override
	public void method3494(@OriginalArg(1) Class169 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.anInt4409--;
			if (super.anInt4409 < 0) {
				super.anInt4409 = 4999;
			}
			super.aByteArray53[super.anInt4409] = 21;
			super.anObjectArray35[super.anInt4409] = arg0;
			super.anInt4408++;
			super.anInt4407++;
			if (this.anInt4428 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!no;)V")
	@Override
	public void method3492(@OriginalArg(1) Class169 arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray53[super.anInt4410] = 20;
			super.anObjectArray35[super.anInt4410] = arg0;
			super.anInt4410++;
			super.anInt4408++;
			if (super.anInt4410 >= 5000) {
				super.anInt4410 = 0;
			}
			super.anInt4407++;
			if (this.anInt4428 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	@Override
	public void method3497(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray53[super.anInt4410] = (byte) arg0;
			super.anInt4410++;
			super.anInt4407++;
			super.anInt4408++;
			if (super.anInt4410 >= 5000) {
				super.anInt4410 = 0;
			}
			if (this.anInt4428 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	private void method3503(@OriginalArg(0) int arg0) {
		super.aByteArray53[super.anInt4410] = (byte) (arg0 + 10);
		super.anInt4410++;
		super.anInt4407++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
		super.anInt4408++;
		if (this.anInt4428 > 0) {
			@Pc(47) Object local47 = this.anObject7;
			synchronized (this.anObject7) {
				this.anObject7.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ya;FZII)V")
	@Override
	public void method3495(@OriginalArg(0) Class157 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Object local2 = this.anObject7;
		synchronized (this.anObject7) {
			super.aByteArray53[super.anInt4410] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
			super.anObjectArray35[super.anInt4410] = arg0;
			super.aFloatArray19[super.anInt4410] = arg1;
			super.anInt4410++;
			if (super.anInt4410 >= 5000) {
				super.anInt4410 = 0;
			}
			super.anInt4407++;
			super.anInt4408++;
			if (this.anInt4428 > 0) {
				this.anObject7.notifyAll();
			}
		}
	}
}
