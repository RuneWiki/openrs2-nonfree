import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class29_Sub1_Sub2 extends Class29_Sub1 implements Runnable {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!c;Lclient!he;)V")
	public Class29_Sub1_Sub2(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Interface2 arg1) {
		Static98.anInterface2_2 = arg1;
		Static98.anInterface2_2.method797();
		Static98.anInterface2_2.method795();
		this.method1844((long) Static98.anInt2607);
		Static98.anInterface2_2.method794(Static98.anIntArray318, Static98.anInt2606);
		Static98.anInt2606 = 0;
		arg0.method237(10, this);
	}

	@OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static98.aBoolean114) {
						Static98.aBoolean114 = false;
						return;
					}
					this.method1929();
				}
				Static68.method1173(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static90.method1648(local24, null);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBJ)V")
	private void method1845(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(3) int local3 = Static98.aClass64_1.method1898(arg0);
		if (local3 == 1) {
			Static98.aClass64_1.method1890();
		} else if ((local3 & 0x80) != 0) {
			@Pc(25) int local25 = (int) (arg1 / (long) (Static98.aClass64_1.anInt2677 * 1000));
			@Pc(31) int local31 = local3 >> 8 & 0xFF;
			@Pc(35) int local35 = local3 & 0xFF;
			@Pc(41) int local41 = local3 >> 16 & 0xFF;
			if (!this.method1842(local35, local31, local41, (long) local25)) {
				Static98.method1847(local35, local41, local25, local31);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1929() {
		if (!Static98.aClass64_1.method1886()) {
			return;
		}
		@Pc(18) long local18 = (long) (Static98.anInt2607 + 200 - Static98.anInterface2_2.method798()) * (long) (Static98.aClass64_1.anInt2677 * 1000);
		while (true) {
			while (true) {
				@Pc(21) int local21 = Static98.aClass64_1.method1892();
				@Pc(26) int local26 = Static98.aClass64_1.anIntArray324[local21];
				@Pc(30) long local30 = Static98.aClass64_1.method1893(local26);
				if (local30 > local18) {
					Static98.method1846();
					return;
				}
				while (local26 == Static98.aClass64_1.anIntArray324[local21]) {
					Static98.aClass64_1.method1894(local21);
					this.method1845(local21, local30);
					if (Static98.aClass64_1.method1896()) {
						Static98.aClass64_1.method1888(local21);
						if (Static98.aClass64_1.method1883()) {
							if (!Static98.aBoolean115) {
								this.method1844((long) (local30 / (long) (Static98.aClass64_1.anInt2677 * 1000)));
								Static98.aClass64_1.method1884();
								Static98.method1846();
								return;
							}
							Static98.aClass64_1.method1891(local30);
						}
						break;
					}
					Static98.aClass64_1.method1887(local21);
					Static98.aClass64_1.method1888(local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static98.method1847(arg0, arg2, (int) arg3, arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[BII)V")
	@Override
	public synchronized void method1935(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		Static98.aClass64_1.method1889(arg1);
		@Pc(4) boolean local4 = true;
		Static98.anInt2607 = 0;
		Static98.aBoolean115 = arg0;
		Static98.anInterface2_2.method795();
		this.method1835(arg2, (long) Static98.anInt2607, 0);
		@Pc(21) int local21 = Static98.aClass64_1.method1882();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			Static98.aClass64_1.method1894(local23);
			while (!Static98.aClass64_1.method1896()) {
				Static98.aClass64_1.method1887(local23);
				if (Static98.aClass64_1.anIntArray324[local23] != 0) {
					local4 = false;
					break;
				}
				this.method1845(local23, 0L);
			}
			Static98.aClass64_1.method1888(local23);
		}
		if (local4) {
			if (Static98.aBoolean115) {
				throw new RuntimeException();
			}
			this.method1844((long) Static98.anInt2607);
			Static98.aClass64_1.method1884();
		}
		Static98.method1846();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1933() {
		Static98.anInterface2_2.method795();
		this.method1844((long) Static98.anInt2607);
		Static98.anInterface2_2.method794(Static98.anIntArray318, Static98.anInt2606);
		Static98.anInt2606 = 0;
		Static98.aClass64_1.method1884();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	@Override
	public void method1936() {
		synchronized (this) {
			Static98.aBoolean114 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static98.aBoolean114) {
					break;
				}
			}
			Static68.method1173(20L);
		}
		Static98.anInterface2_2.method793();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)V")
	@Override
	public synchronized void method1934(@OriginalArg(0) int arg0) {
		this.method1832(arg0, (long) Static98.anInt2607);
		Static98.anInterface2_2.method794(Static98.anIntArray318, Static98.anInt2606);
		Static98.anInt2606 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1835(arg1, (long) Static98.anInt2607, arg0);
	}
}
