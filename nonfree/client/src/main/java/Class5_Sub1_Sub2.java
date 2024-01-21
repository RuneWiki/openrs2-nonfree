import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 implements Runnable {

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!fb;Lclient!ac;)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Interface1 arg1) {
		Static84.anInterface1_2 = arg1;
		Static84.anInterface1_2.method42();
		Static84.anInterface1_2.method41();
		this.method1611((long) Static84.anInt2365);
		Static84.anInterface1_2.method38(Static84.anIntArray235, Static84.anInt2364);
		Static84.anInt2364 = 0;
		arg0.method728(10, this);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1598() {
		if (!Static84.aClass2_1.method12()) {
			return;
		}
		@Pc(19) long local19 = (long) (Static84.anInt2365 + 200 - Static84.anInterface1_2.method40()) * (long) (Static84.aClass2_1.anInt8 * 1000);
		while (true) {
			while (true) {
				@Pc(26) int local26 = Static84.aClass2_1.method19();
				@Pc(31) int local31 = Static84.aClass2_1.anIntArray3[local26];
				@Pc(35) long local35 = Static84.aClass2_1.method9(local31);
				if (local35 > local19) {
					Static84.method1621();
					return;
				}
				while (local31 == Static84.aClass2_1.anIntArray3[local26]) {
					Static84.aClass2_1.method20(local26);
					this.method1619(local35, local26);
					if (Static84.aClass2_1.method15()) {
						Static84.aClass2_1.method14(local26);
						if (Static84.aClass2_1.method17()) {
							if (!Static84.aBoolean113) {
								this.method1611((long) (local35 / (long) (Static84.aClass2_1.anInt8 * 1000)));
								Static84.aClass2_1.method8();
								Static84.method1621();
								return;
							}
							Static84.aClass2_1.method11(local35);
						}
						break;
					}
					Static84.aClass2_1.method13(local26);
					Static84.aClass2_1.method14(local26);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V")
	@Override
	public synchronized void method1604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1609(arg1, (long) Static84.anInt2365, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static84.aBoolean112) {
						Static84.aBoolean112 = false;
						return;
					}
					this.method1598();
				}
				Static58.method1193(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static15.method544(null, local24);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static84.method1620(arg0, arg1, (int) arg3, arg2);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V")
	@Override
	public synchronized void method1602(@OriginalArg(0) int arg0) {
		this.method1617(arg0, (long) Static84.anInt2365);
		Static84.anInterface1_2.method38(Static84.anIntArray235, Static84.anInt2364);
		Static84.anInt2364 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1606() {
		Static84.anInterface1_2.method41();
		this.method1611((long) Static84.anInt2365);
		Static84.anInterface1_2.method38(Static84.anIntArray235, Static84.anInt2364);
		Static84.anInt2364 = 0;
		Static84.aClass2_1.method8();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(JIB)V")
	private void method1619(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static84.aClass2_1.method10(arg1);
		if (local7 == 1) {
			Static84.aClass2_1.method7();
		} else if ((local7 & 0x80) != 0) {
			@Pc(29) int local29 = (int) (arg0 / (long) (Static84.aClass2_1.anInt8 * 1000));
			@Pc(33) int local33 = local7 & 0xFF;
			@Pc(39) int local39 = local7 >> 8 & 0xFF;
			@Pc(45) int local45 = local7 >> 16 & 0xFF;
			if (!this.method1614(local33, local39, local45, (long) local29)) {
				Static84.method1620(local33, local39, local29, local45);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BZII)V")
	@Override
	public synchronized void method1600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		Static84.aClass2_1.method18(arg0);
		Static84.aBoolean113 = arg1;
		Static84.anInt2365 = 0;
		Static84.anInterface1_2.method41();
		this.method1609(0, (long) Static84.anInt2365, arg2);
		@Pc(19) int local19 = Static84.aClass2_1.method4();
		@Pc(21) boolean local21 = true;
		for (@Pc(31) int local31 = 0; local31 < local19; local31++) {
			Static84.aClass2_1.method20(local31);
			while (!Static84.aClass2_1.method15()) {
				Static84.aClass2_1.method13(local31);
				if (Static84.aClass2_1.anIntArray3[local31] != 0) {
					local21 = false;
					break;
				}
				this.method1619(0L, local31);
			}
			Static84.aClass2_1.method14(local31);
		}
		if (local21) {
			if (Static84.aBoolean113) {
				throw new RuntimeException();
			}
			this.method1611((long) Static84.anInt2365);
			Static84.aClass2_1.method8();
		}
		Static84.method1621();
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method1607() {
		synchronized (this) {
			Static84.aBoolean112 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static84.aBoolean112) {
					break;
				}
			}
			Static58.method1193(20L);
		}
		Static84.anInterface1_2.method43();
	}
}
