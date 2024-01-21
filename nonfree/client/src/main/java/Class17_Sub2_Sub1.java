import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 implements Runnable {

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!g;Lclient!hd;)V")
	public Class17_Sub2_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Interface4 arg1) {
		Static24.anInterface4_1 = arg1;
		Static24.anInterface4_1.method730();
		Static24.anInterface4_1.method726();
		this.method2017((long) Static24.anInt746);
		Static24.anInterface4_1.method725(Static24.anIntArray104, Static24.anInt747);
		Static24.anInt747 = 0;
		arg0.method579(10, this);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	@Override
	public synchronized void method2009(@OriginalArg(1) int arg0) {
		this.method2014(arg0, (long) Static24.anInt746);
		Static24.anInterface4_1.method725(Static24.anIntArray104, Static24.anInt747);
		Static24.anInt747 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static24.aBoolean48) {
						Static24.aBoolean48 = false;
						return;
					}
					this.method2004();
				}
				Static117.method2058(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static99.method1601(local24, null);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2004() {
		if (!Static24.aClass65_1.method1584()) {
			return;
		}
		@Pc(30) long local30 = (long) (Static24.anInt746 + 200 - Static24.anInterface4_1.method728()) * (long) (Static24.aClass65_1.anInt2185 * 1000);
		while (true) {
			while (true) {
				@Pc(33) int local33 = Static24.aClass65_1.method1579();
				@Pc(38) int local38 = Static24.aClass65_1.anIntArray318[local33];
				@Pc(42) long local42 = Static24.aClass65_1.method1570(local38);
				if (local30 < local42) {
					Static24.method503();
					return;
				}
				while (local38 == Static24.aClass65_1.anIntArray318[local33]) {
					Static24.aClass65_1.method1575(local33);
					this.method505(local42, local33);
					if (Static24.aClass65_1.method1581()) {
						Static24.aClass65_1.method1580(local33);
						if (Static24.aClass65_1.method1574()) {
							if (!Static24.aBoolean49) {
								this.method2017((long) (local42 / (long) (Static24.aClass65_1.anInt2185 * 1000)));
								Static24.aClass65_1.method1571();
								Static24.method503();
								return;
							}
							Static24.aClass65_1.method1577(local42);
						}
						break;
					}
					Static24.aClass65_1.method1578(local33);
					Static24.aClass65_1.method1580(local33);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method2001() {
		Static24.anInterface4_1.method726();
		this.method2017((long) Static24.anInt746);
		Static24.anInterface4_1.method725(Static24.anIntArray104, Static24.anInt747);
		Static24.anInt747 = 0;
		Static24.aClass65_1.method1571();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIB[B)V")
	@Override
	public synchronized void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		Static24.aClass65_1.method1572(arg2);
		Static24.anInt746 = 0;
		@Pc(10) boolean local10 = true;
		Static24.aBoolean49 = arg0;
		Static24.anInterface4_1.method726();
		this.method2019((long) Static24.anInt746, arg1, 0);
		@Pc(25) int local25 = Static24.aClass65_1.method1585();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			Static24.aClass65_1.method1575(local27);
			while (!Static24.aClass65_1.method1581()) {
				Static24.aClass65_1.method1578(local27);
				if (Static24.aClass65_1.anIntArray318[local27] != 0) {
					local10 = false;
					break;
				}
				this.method505(0L, local27);
			}
			Static24.aClass65_1.method1580(local27);
		}
		if (local10) {
			if (Static24.aBoolean49) {
				throw new RuntimeException();
			}
			this.method2017((long) Static24.anInt746);
			Static24.aClass65_1.method1571();
		}
		Static24.method503();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2019((long) Static24.anInt746, arg1, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	@Override
	public void method2008() {
		synchronized (this) {
			Static24.aBoolean48 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static24.aBoolean48) {
					break;
				}
			}
			Static117.method2058(20L);
		}
		Static24.anInterface4_1.method727();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(JBI)V")
	private void method505(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static24.aClass65_1.method1586(arg1);
		if (local7 == 1) {
			Static24.aClass65_1.method1573();
		} else if ((local7 & 0x80) != 0) {
			@Pc(25) int local25 = (int) (arg0 / (long) (Static24.aClass65_1.anInt2185 * 1000));
			@Pc(31) int local31 = local7 >> 8 & 0xFF;
			@Pc(35) int local35 = local7 & 0xFF;
			@Pc(41) int local41 = local7 >> 16 & 0xFF;
			if (!this.method2015(local35, local31, local41, (long) local25)) {
				Static24.method504(local41, local25, local31, local35);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static24.method504(arg2, (int) arg3, arg1, arg0);
	}
}
