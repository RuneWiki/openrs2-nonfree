import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!dk", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject2 = new Object();

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "[Lclient!li;")
	private Class10_Sub1[] aClass10_Sub1Array1 = new Class10_Sub1[0];

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
	private int anInt1371 = 0;

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
	private int anInt1372 = 0;

	static {
		new Class169("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
	private void method1121(@OriginalArg(1) int arg0) {
		super.aByteArray28[super.anInt1354] = (byte) (arg0 + 10);
		super.anInt1354++;
		super.anInt1351++;
		super.anInt1353++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
		if (this.anInt1372 > 0) {
			@Pc(46) Object local46 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method1116(@OriginalArg(0) Class132 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray28[super.anInt1354] = 21;
			super.anObjectArray3[super.anInt1354] = arg0;
			super.anInt1354++;
			if (super.anInt1354 >= 5000) {
				super.anInt1354 = 0;
			}
			super.anInt1353++;
			super.anInt1351++;
			if (this.anInt1372 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)V")
	private void method1122(@OriginalArg(0) int arg0) {
		super.aByteArray28[super.anInt1354] = (byte) arg0;
		super.anInt1354++;
		super.anInt1353++;
		super.anInt1351++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
		if (this.anInt1372 > 0) {
			@Pc(42) Object local42 = this.anObject2;
			synchronized (this.anObject2) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public void method1117() {
		@Pc(4) Object local4 = this.anObject2;
		synchronized (this.anObject2) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt1371; local8++) {
				if (this.aClass10_Sub1Array1[local8].anInt3607 >= 0) {
					this.method1121(this.aClass10_Sub1Array1[local8].anInt3607);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(BLclient!ke;)V")
	@Override
	public void method1120(@OriginalArg(1) Class132 arg0) {
		@Pc(11) Object local11 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray28[super.anInt1354] = 20;
			super.anObjectArray3[super.anInt1354] = arg0;
			super.anInt1354++;
			if (super.anInt1354 >= 5000) {
				super.anInt1354 = 0;
			}
			super.anInt1351++;
			super.anInt1353++;
			if (this.anInt1372 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!li;I)V")
	public void method1125(@OriginalArg(0) Class10_Sub1 arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(17) float local17 = 0.0F;
			@Pc(20) Object local20 = this.anObject2;
			@Pc(48) byte local48;
			synchronized (this.anObject2) {
				while (super.anInt1351 == 0) {
					this.anInt1372++;
					this.anObject2.wait();
					this.anInt1372--;
				}
				local48 = super.aByteArray28[super.anInt1352];
				if (arg0.anInt3607 < 0) {
					if (local48 >= 0 && local48 <= 3) {
						local7 = true;
					}
				} else if (local48 < 0 || local48 > 3) {
					local7 = true;
				}
				if (local7) {
					arg0.anObject6 = super.anObjectArray3[super.anInt1352];
					local17 = super.aFloatArray6[super.anInt1352];
					super.anObjectArray3[super.anInt1352] = null;
					super.anInt1352++;
					super.anInt1351--;
					if (super.anInt1352 >= 5000) {
						super.anInt1352 = 0;
					}
				}
			}
			if (!local7) {
				Thread.yield();
			} else if (arg0.anInt3607 >= 0) {
				if (local48 == 21) {
					Static348.method5091(arg0, (Class132) arg0.anObject6);
				} else if (local48 == 20) {
					@Pc(146) Class132 local146 = (Class132) arg0.anObject6;
					if (local146.aClass25_Sub5_1 != null) {
						local146.aClass25_Sub5_1.method5232(Static90.aClass164_3);
					}
					if (local146.aClass25_Sub5_2 != null) {
						local146.aClass25_Sub5_2.method5232(Static90.aClass164_3);
					}
					if (local146.aClass25_Sub3_2 != null) {
						local146.aClass25_Sub3_2.method5232(Static90.aClass164_3);
					}
					if (local146.aClass25_Sub3_1 != null) {
						local146.aClass25_Sub3_1.method5232(Static90.aClass164_3);
					}
					if (local146.aClass25_Sub4_2 != null) {
						local146.aClass25_Sub4_2.method5232(Static90.aClass164_3);
					}
					for (@Pc(191) Class116 local191 = local146.aClass116_3; local191 != null; local191 = local191.aClass116_2) {
						local191.aClass25_Sub1_1.method5232(Static90.aClass164_3);
					}
				} else if (local48 >= 30 && local48 <= 33) {
					Static90.aClass164_3.method5314(3000.0F, local17 * 1.5F);
					((Class42) arg0.anObject6).method3053(Static266.anInt4625, Static249.anInt4358, Static32.anInt647, Static54.aBooleanArrayArray1, local48 - 30 == 0);
				} else if (local48 >= 40 && local48 <= 43) {
					Static90.aClass164_3.method5314(3000.0F, local17 * 1.5F);
					((Class42) arg0.anObject6).method3053(Static266.anInt4625, Static249.anInt4358, Static32.anInt647, Static63.aBooleanArrayArray5, local48 - 40 == 0);
				} else if (local48 == 22) {
					Static90.aClass164_3.method5330();
				} else if (local48 == 23) {
					Static90.aClass164_3.method5324();
				} else if (local48 == 24) {
					Static90.aClass164_3.method5355(0, null);
				} else if (local48 >= 10 && local48 <= 13) {
					Static90.aClass164_3.method5345(arg0.anInt3607);
					arg0.anInt3607 = -1;
				}
			} else if (local48 >= 0 && local48 <= 3) {
				arg0.anInt3607 = local48;
				Static90.aClass164_3.method5377(local48);
			}
		} catch (@Pc(347) Exception local347) {
		} finally {
			@Pc(353) Object local353 = null;
			if (local7) {
				@Pc(410) Object local410 = this.anObject2;
				synchronized (this.anObject2) {
					super.anInt1353--;
					if (super.anInt1353 == 0) {
						this.anObject2.notifyAll();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!cl;ZIF)V")
	@Override
	public void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray28[super.anInt1354] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
			super.anObjectArray3[super.anInt1354] = arg1;
			super.aFloatArray6[super.anInt1354] = arg3;
			super.anInt1354++;
			super.anInt1353++;
			if (super.anInt1354 >= 5000) {
				super.anInt1354 = 0;
			}
			super.anInt1351++;
			if (this.anInt1372 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	@Override
	public void method1110(@OriginalArg(0) int arg0) {
		@Pc(2) Object local2 = this.anObject2;
		synchronized (this.anObject2) {
			super.aByteArray28[super.anInt1354] = (byte) arg0;
			super.anInt1354++;
			super.anInt1353++;
			if (super.anInt1354 >= 5000) {
				super.anInt1354 = 0;
			}
			super.anInt1351++;
			if (this.anInt1372 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method1109() {
		try {
			@Pc(8) Object local8 = this.anObject2;
			synchronized (this.anObject2) {
				while (true) {
					if (super.anInt1353 == 0) {
						break;
					}
					this.anObject2.wait();
				}
			}
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	@Override
	public void method1111(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(16) Object local16 = this.anObject2;
		synchronized (this.anObject2) {
			@Pc(28) int local28;
			if (this.anInt1371 == arg0) {
				for (local28 = 0; local28 < this.anInt1371; local28++) {
					this.method1122(local7++);
				}
			} else {
				for (local28 = 0; local28 < this.anInt1371; local28++) {
					this.aClass10_Sub1Array1[local28].method2938();
				}
				this.anInt1371 = arg0;
				this.aClass10_Sub1Array1 = new Class10_Sub1[this.anInt1371];
				for (@Pc(74) int local74 = 0; local74 < this.anInt1371; local74++) {
					this.aClass10_Sub1Array1[local74] = new Class10_Sub1(this);
					this.aClass10_Sub1Array1[local74].method2937();
					this.method1122(local7++);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!ke;)V")
	@Override
	public void method1115(@OriginalArg(1) Class132 arg0) {
		@Pc(6) Object local6 = this.anObject2;
		synchronized (this.anObject2) {
			super.anInt1352--;
			if (super.anInt1352 < 0) {
				super.anInt1352 = 4999;
			}
			super.aByteArray28[super.anInt1352] = 21;
			super.anObjectArray3[super.anInt1352] = arg0;
			super.anInt1353++;
			super.anInt1351++;
			if (this.anInt1372 > 0) {
				this.anObject2.notifyAll();
			}
		}
	}
}
