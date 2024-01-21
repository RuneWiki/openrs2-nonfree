import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class38_Sub1_Sub2 extends Class38_Sub1 implements Runnable {

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "Lclient!cb;")
	private final Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!jc;Lclient!gb;)V")
	public Class38_Sub1_Sub2(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Interface2 arg1) {
		Static87.anInterface2_2 = arg1;
		Static87.anInterface2_2.method606();
		Static87.anInterface2_2.method604();
		this.method1438((long) Static87.anInt2334);
		Static87.anInterface2_2.method603(Static87.anIntArray254, Static87.anInt2333);
		Static87.anInt2333 = 0;
		arg0.method770(10, this);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	@Override
	public void method1577() {
		synchronized (this) {
			Static87.aBoolean142 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static87.aBoolean142) {
					break;
				}
			}
			Static24.method505(20L);
		}
		Static87.anInterface2_2.method602();
	}

	@OriginalMember(owner = "client!rb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static87.aBoolean142) {
						Static87.aBoolean142 = false;
						return;
					}
					this.method1579();
				}
				Static24.method505(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static72.method1184(null, local24);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1579() {
		if (!this.aClass10_1.method288()) {
			return;
		}
		@Pc(20) long local20 = (long) (Static87.anInt2334 + 200 - Static87.anInterface2_2.method607()) * (long) (this.aClass10_1.anInt437 * 1000);
		while (true) {
			while (true) {
				@Pc(33) int local33 = this.aClass10_1.method296();
				@Pc(39) int local39 = this.aClass10_1.anIntArray40[local33];
				@Pc(44) long local44 = this.aClass10_1.method287(local39);
				if (local20 < local44) {
					Static87.method1444();
					return;
				}
				while (this.aClass10_1.anIntArray40[local33] == local39) {
					this.aClass10_1.method286(local33);
					this.method1446(local44, local33);
					if (this.aClass10_1.method282()) {
						this.aClass10_1.method289(local33);
						if (this.aClass10_1.method284()) {
							if (!Static87.aBoolean141) {
								this.method1438((long) (local44 / (long) (this.aClass10_1.anInt437 * 1000)));
								this.aClass10_1.method293();
								Static87.method1444();
								return;
							}
							this.aClass10_1.method294(local44);
						}
						break;
					}
					this.aClass10_1.method283(local33);
					this.aClass10_1.method289(local33);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1434(arg1, (long) Static87.anInt2334, arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	@Override
	public synchronized void method1586(@OriginalArg(0) int arg0) {
		this.method1437(arg0, (long) Static87.anInt2334);
		Static87.anInterface2_2.method603(Static87.anIntArray254, Static87.anInt2333);
		Static87.anInt2333 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1581() {
		Static87.anInterface2_2.method604();
		this.method1438((long) Static87.anInt2334);
		Static87.anInterface2_2.method603(Static87.anIntArray254, Static87.anInt2333);
		Static87.anInt2333 = 0;
		this.aClass10_1.method293();
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static87.method1445(arg1, (int) arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI[BI)V")
	@Override
	public synchronized void method1578(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.aClass10_1.method285(arg2);
		Static87.aBoolean141 = arg0;
		Static87.anInt2334 = 0;
		Static87.anInterface2_2.method604();
		@Pc(20) boolean local20 = true;
		this.method1434(0, (long) Static87.anInt2334, arg1);
		@Pc(31) int local31 = this.aClass10_1.method280();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass10_1.method286(local33);
			while (!this.aClass10_1.method282()) {
				this.aClass10_1.method283(local33);
				if (this.aClass10_1.anIntArray40[local33] != 0) {
					local20 = false;
					break;
				}
				this.method1446(0L, local33);
			}
			this.aClass10_1.method289(local33);
		}
		if (local20) {
			if (Static87.aBoolean141) {
				throw new RuntimeException();
			}
			this.method1438((long) Static87.anInt2334);
			this.aClass10_1.method293();
		}
		Static87.method1444();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BJI)V")
	private void method1446(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.aClass10_1.method290(arg1);
		if (local8 == 1) {
			this.aClass10_1.method281();
		} else if ((local8 & 0x80) != 0) {
			@Pc(30) int local30 = (int) (arg0 / (long) (this.aClass10_1.anInt437 * 1000));
			@Pc(36) int local36 = local8 >> 8 & 0xFF;
			@Pc(40) int local40 = local8 & 0xFF;
			@Pc(46) int local46 = local8 >> 16 & 0xFF;
			if (!this.method1439(local40, local36, local46, (long) local30)) {
				Static87.method1445(local36, local30, local46, local40);
				return;
			}
		}
	}
}
