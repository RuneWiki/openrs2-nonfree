import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 implements Runnable {

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "Lclient!aa;")
	private final Class2 aClass2_1 = new Class2();

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!s;Lclient!vc;)V")
	public Class13_Sub1_Sub2(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Interface4 arg1) {
		Static91.anInterface4_2 = arg1;
		Static91.anInterface4_2.method1629();
		Static91.anInterface4_2.method1626();
		this.method1467((long) Static91.anInt2378);
		Static91.anInterface4_2.method1624(Static91.anIntArray316, Static91.anInt2379);
		Static91.anInt2379 = 0;
		arg0.method1404(this, 10);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static91.method1474(arg0, (int) arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public synchronized void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		this.aClass2_1.method11(arg1);
		@Pc(5) boolean local5 = true;
		Static91.aBoolean108 = arg2;
		Static91.anInt2378 = 0;
		Static91.anInterface4_2.method1626();
		this.method1464(0, arg0, (long) Static91.anInt2378);
		@Pc(23) int local23 = this.aClass2_1.method19();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass2_1.method12(local25);
			while (!this.aClass2_1.method7()) {
				this.aClass2_1.method6(local25);
				if (this.aClass2_1.anIntArray7[local25] != 0) {
					local5 = false;
					break;
				}
				this.method1476(0L, local25);
			}
			this.aClass2_1.method8(local25);
		}
		if (local5) {
			if (Static91.aBoolean108) {
				throw new RuntimeException();
			}
			this.method1467((long) Static91.anInt2378);
			this.aClass2_1.method9();
		}
		Static91.method1475();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	@Override
	public synchronized void method1504(@OriginalArg(0) int arg0) {
		this.method1469(arg0, (long) Static91.anInt2378);
		Static91.anInterface4_2.method1624(Static91.anIntArray316, Static91.anInt2379);
		Static91.anInt2379 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1505() {
		if (!this.aClass2_1.method13()) {
			return;
		}
		@Pc(21) long local21 = (long) (Static91.anInt2378 + 200 - Static91.anInterface4_2.method1628()) * (long) (this.aClass2_1.anInt10 * 1000);
		while (true) {
			while (true) {
				@Pc(25) int local25 = this.aClass2_1.method22();
				@Pc(31) int local31 = this.aClass2_1.anIntArray7[local25];
				@Pc(36) long local36 = this.aClass2_1.method18(local31);
				if (local21 < local36) {
					Static91.method1475();
					return;
				}
				while (local31 == this.aClass2_1.anIntArray7[local25]) {
					this.aClass2_1.method12(local25);
					this.method1476(local36, local25);
					if (this.aClass2_1.method7()) {
						this.aClass2_1.method8(local25);
						if (this.aClass2_1.method17()) {
							if (!Static91.aBoolean108) {
								this.method1467((long) (local36 / (long) (this.aClass2_1.anInt10 * 1000)));
								this.aClass2_1.method9();
								Static91.method1475();
								return;
							}
							this.aClass2_1.method20(local36);
						}
						break;
					}
					this.aClass2_1.method6(local25);
					this.aClass2_1.method8(local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1506() {
		Static91.anInterface4_2.method1626();
		this.method1467((long) Static91.anInt2378);
		Static91.anInterface4_2.method1624(Static91.anIntArray316, Static91.anInt2379);
		Static91.anInt2379 = 0;
		this.aClass2_1.method9();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	@Override
	public void method1501() {
		synchronized (this) {
			Static91.aBoolean107 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static91.aBoolean107) {
					break;
				}
			}
			Static93.method1123(20L);
		}
		Static91.anInterface4_2.method1625();
	}

	@OriginalMember(owner = "client!ta", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static91.aBoolean107) {
						Static91.aBoolean107 = false;
						return;
					}
					this.method1505();
				}
				Static93.method1123(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static99.method1580(null, local24);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJI)V")
	private void method1476(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.aClass2_1.method15(arg1);
		if (local4 == 1) {
			this.aClass2_1.method14();
		} else if ((local4 & 0x80) != 0) {
			@Pc(23) int local23 = (int) (arg0 / (long) (this.aClass2_1.anInt10 * 1000));
			@Pc(27) int local27 = local4 & 0xFF;
			@Pc(33) int local33 = local4 >> 16 & 0xFF;
			@Pc(39) int local39 = local4 >> 8 & 0xFF;
			if (!this.method1466(local27, local39, local33, (long) local23)) {
				Static91.method1474(local27, local23, local39, local33);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)V")
	@Override
	public synchronized void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1464(arg1, arg0, (long) Static91.anInt2378);
	}
}
