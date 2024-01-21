import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class14_Sub1_Sub2 extends Class14_Sub1 implements Runnable {

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "Lclient!r;")
	private final Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!vb;Lclient!bb;)V")
	public Class14_Sub1_Sub2(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Interface1 arg1) {
		Static78.anInterface1_1 = arg1;
		Static78.anInterface1_1.method131();
		Static78.anInterface1_1.method133();
		this.method1434((long) Static78.anInt2011);
		Static78.anInterface1_1.method130(Static78.anIntArray314, Static78.anInt2012);
		Static78.anInt2012 = 0;
		arg0.method1807(this, 10);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public synchronized void method1421(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		this.aClass50_1.method1541(arg0);
		@Pc(5) boolean local5 = true;
		Static78.aBoolean113 = arg2;
		Static78.anInt2011 = 0;
		Static78.anInterface1_1.method133();
		this.method1433((long) Static78.anInt2011, arg1, 0);
		@Pc(27) int local27 = this.aClass50_1.method1540();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass50_1.method1537(local29);
			while (!this.aClass50_1.method1545()) {
				this.aClass50_1.method1552(local29);
				if (this.aClass50_1.anIntArray344[local29] != 0) {
					local5 = false;
					break;
				}
				this.method1442(local29, 0L);
			}
			this.aClass50_1.method1539(local29);
		}
		if (local5) {
			if (Static78.aBoolean113) {
				throw new RuntimeException();
			}
			this.method1434((long) Static78.anInt2011);
			this.aClass50_1.method1542();
		}
		Static78.method1440();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	@Override
	public void method1420() {
		synchronized (this) {
			Static78.aBoolean112 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static78.aBoolean112) {
					break;
				}
			}
			Static9.method179(20L);
		}
		Static78.anInterface1_1.method128();
	}

	@OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static78.aBoolean112) {
						Static78.aBoolean112 = false;
						return;
					}
					this.method1424();
				}
				Static9.method179(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static95.method1687(null, local24);
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1426() {
		Static78.anInterface1_1.method133();
		this.method1434((long) Static78.anInt2011);
		Static78.anInterface1_1.method130(Static78.anIntArray314, Static78.anInt2012);
		Static78.anInt2012 = 0;
		this.aClass50_1.method1542();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1433((long) Static78.anInt2011, arg1, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)V")
	@Override
	public synchronized void method1425(@OriginalArg(0) int arg0) {
		this.method1439(arg0, (long) Static78.anInt2011);
		Static78.anInterface1_1.method130(Static78.anIntArray314, Static78.anInt2012);
		Static78.anInt2012 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static78.method1441(arg1, arg2, (int) arg3, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IJB)V")
	private void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(11) int local11 = this.aClass50_1.method1538(arg0);
		if (local11 == 1) {
			this.aClass50_1.method1550();
		} else if ((local11 & 0x80) != 0) {
			@Pc(32) int local32 = (int) (arg1 / (long) (this.aClass50_1.anInt2246 * 1000));
			@Pc(38) int local38 = local11 >> 8 & 0xFF;
			@Pc(42) int local42 = local11 & 0xFF;
			@Pc(48) int local48 = local11 >> 16 & 0xFF;
			if (!this.method1432(local42, local38, local48, (long) local32)) {
				Static78.method1441(local38, local48, local32, local42);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1424() {
		if (!this.aClass50_1.method1546()) {
			return;
		}
		@Pc(21) long local21 = (long) (Static78.anInt2011 + 200 - Static78.anInterface1_1.method132()) * (long) (this.aClass50_1.anInt2246 * 1000);
		while (true) {
			while (true) {
				@Pc(25) int local25 = this.aClass50_1.method1547();
				@Pc(31) int local31 = this.aClass50_1.anIntArray344[local25];
				@Pc(36) long local36 = this.aClass50_1.method1536(local31);
				if (local21 < local36) {
					Static78.method1440();
					return;
				}
				while (local31 == this.aClass50_1.anIntArray344[local25]) {
					this.aClass50_1.method1537(local25);
					this.method1442(local25, local36);
					if (this.aClass50_1.method1545()) {
						this.aClass50_1.method1539(local25);
						if (this.aClass50_1.method1543()) {
							if (!Static78.aBoolean113) {
								this.method1434((long) (local36 / (long) (this.aClass50_1.anInt2246 * 1000)));
								this.aClass50_1.method1542();
								Static78.method1440();
								return;
							}
							this.aClass50_1.method1551(local36);
						}
						break;
					}
					this.aClass50_1.method1552(local25);
					this.aClass50_1.method1539(local25);
				}
			}
		}
	}
}
