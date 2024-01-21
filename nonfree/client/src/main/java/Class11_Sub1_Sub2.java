import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Runnable {

	@OriginalMember(owner = "client!u", name = "db", descriptor = "Lclient!nd;")
	private final Class46 aClass46_1 = new Class46();

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!cc;Lclient!rd;)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Interface3 arg1) {
		Static98.anInterface3_2 = arg1;
		Static98.anInterface3_2.method1682();
		Static98.anInterface3_2.method1681();
		this.method1877((long) Static98.anInt2670);
		Static98.anInterface3_2.method1680(Static98.anIntArray327, Static98.anInt2671);
		Static98.anInt2671 = 0;
		arg0.method324(this, 10);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1861() {
		Static98.anInterface3_2.method1681();
		this.method1877((long) Static98.anInt2670);
		Static98.anInterface3_2.method1680(Static98.anIntArray327, Static98.anInt2671);
		Static98.anInt2671 = 0;
		this.aClass46_1.method1448();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static98.method1884((int) arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IJB)V")
	private void method1883(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(12) int local12 = this.aClass46_1.method1451(arg0);
		if (local12 == 1) {
			this.aClass46_1.method1454();
		} else if ((local12 & 0x80) != 0) {
			@Pc(29) int local29 = (int) (arg1 / (long) (this.aClass46_1.anInt2017 * 1000));
			@Pc(35) int local35 = local12 >> 8 & 0xFF;
			@Pc(39) int local39 = local12 & 0xFF;
			@Pc(45) int local45 = local12 >> 16 & 0xFF;
			if (!this.method1871(local39, local35, local45, (long) local29)) {
				Static98.method1884(local29, local35, local45, local39);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static98.aBoolean122) {
						Static98.aBoolean122 = false;
						return;
					}
					this.method1868();
				}
				Static51.method1782(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static108.method2075(local24, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
	@Override
	public void method1866() {
		synchronized (this) {
			Static98.aBoolean122 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static98.aBoolean122) {
					break;
				}
			}
			Static51.method1782(20L);
		}
		Static98.anInterface3_2.method1679();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method1868() {
		if (!this.aClass46_1.method1452()) {
			return;
		}
		@Pc(27) long local27 = (long) (Static98.anInt2670 + 200 - Static98.anInterface3_2.method1683()) * (long) (this.aClass46_1.anInt2017 * 1000);
		while (true) {
			while (true) {
				@Pc(31) int local31 = this.aClass46_1.method1441();
				@Pc(37) int local37 = this.aClass46_1.anIntArray252[local31];
				@Pc(42) long local42 = this.aClass46_1.method1450(local37);
				if (local42 > local27) {
					Static98.method1885();
					return;
				}
				while (local37 == this.aClass46_1.anIntArray252[local31]) {
					this.aClass46_1.method1449(local31);
					this.method1883(local31, local42);
					if (this.aClass46_1.method1455()) {
						this.aClass46_1.method1442(local31);
						if (this.aClass46_1.method1446()) {
							if (!Static98.aBoolean123) {
								this.method1877((long) (local42 / (long) (this.aClass46_1.anInt2017 * 1000)));
								this.aClass46_1.method1448();
								Static98.method1885();
								return;
							}
							this.aClass46_1.method1453(local42);
						}
						break;
					}
					this.aClass46_1.method1444(local31);
					this.aClass46_1.method1442(local31);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method1878((long) Static98.anInt2670, arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	@Override
	public synchronized void method1867(@OriginalArg(0) int arg0) {
		this.method1872(arg0, (long) Static98.anInt2670);
		Static98.anInterface3_2.method1680(Static98.anIntArray327, Static98.anInt2671);
		Static98.anInt2671 = 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BZI[B)V")
	@Override
	public synchronized void method1862(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(1) boolean local1 = true;
		this.aClass46_1.method1457(arg2);
		Static98.anInt2670 = 0;
		Static98.aBoolean123 = arg0;
		Static98.anInterface3_2.method1681();
		this.method1878((long) Static98.anInt2670, 0, arg1);
		@Pc(32) int local32 = this.aClass46_1.method1447();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass46_1.method1449(local34);
			while (!this.aClass46_1.method1455()) {
				this.aClass46_1.method1444(local34);
				if (this.aClass46_1.anIntArray252[local34] != 0) {
					local1 = false;
					break;
				}
				this.method1883(local34, 0L);
			}
			this.aClass46_1.method1442(local34);
		}
		if (local1) {
			if (Static98.aBoolean123) {
				throw new RuntimeException();
			}
			this.method1877((long) Static98.anInt2670);
			this.aClass46_1.method1448();
		}
		Static98.method1885();
	}
}
