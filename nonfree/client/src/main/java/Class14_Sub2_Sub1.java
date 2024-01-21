import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 implements Runnable {

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!sb;Lclient!u;)V")
	public Class14_Sub2_Sub1(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Interface3 arg1) {
		Static58.anInterface3_1 = arg1;
		Static58.anInterface3_1.method1709();
		Static58.anInterface3_1.method1710();
		this.method1561((long) Static58.anInt1775);
		Static58.anInterface3_1.method1711(Static58.anIntArray231, Static58.anInt1774);
		Static58.anInt1774 = 0;
		arg0.method1628(this, 10);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	@Override
	public void method1548() {
		synchronized (this) {
			Static58.aBoolean94 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static58.aBoolean94) {
					break;
				}
			}
			Static34.method698(20L);
		}
		Static58.anInterface3_1.method1714();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1554() {
		Static58.anInterface3_1.method1710();
		this.method1561((long) Static58.anInt1775);
		Static58.anInterface3_1.method1711(Static58.anIntArray231, Static58.anInt1774);
		Static58.anInt1774 = 0;
		Static58.aClass11_1.method297();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static58.method1053((int) arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1560((long) Static58.anInt1775, arg1, arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BZIZ)V")
	@Override
	public synchronized void method1555(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(1) boolean local1 = true;
		Static58.aClass11_1.method295(arg0);
		Static58.anInt1775 = 0;
		Static58.aBoolean95 = arg2;
		Static58.anInterface3_1.method1710();
		this.method1560((long) Static58.anInt1775, 0, arg1);
		@Pc(21) int local21 = Static58.aClass11_1.method299();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			Static58.aClass11_1.method288(local23);
			while (!Static58.aClass11_1.method294()) {
				Static58.aClass11_1.method287(local23);
				if (Static58.aClass11_1.anIntArray76[local23] != 0) {
					local1 = false;
					break;
				}
				this.method1054(local23, 0L);
			}
			Static58.aClass11_1.method301(local23);
		}
		if (local1) {
			if (Static58.aBoolean95) {
				throw new RuntimeException();
			}
			this.method1561((long) Static58.anInt1775);
			Static58.aClass11_1.method297();
		}
		Static58.method1052();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
	@Override
	public synchronized void method1557(@OriginalArg(1) int arg0) {
		this.method1559(arg0, (long) Static58.anInt1775);
		Static58.anInterface3_1.method1711(Static58.anIntArray231, Static58.anInt1774);
		Static58.anInt1774 = 0;
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static58.aBoolean94) {
						Static58.aBoolean94 = false;
						return;
					}
					this.method1550();
				}
				Static34.method698(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static30.method573(null, local24);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1550() {
		if (!Static58.aClass11_1.method298()) {
			return;
		}
		@Pc(18) long local18 = (long) (Static58.anInt1775 + 200 - Static58.anInterface3_1.method1712()) * (long) (Static58.aClass11_1.anInt462 * 1000);
		while (true) {
			while (true) {
				@Pc(29) int local29 = Static58.aClass11_1.method300();
				@Pc(34) int local34 = Static58.aClass11_1.anIntArray76[local29];
				@Pc(38) long local38 = Static58.aClass11_1.method293(local34);
				if (local38 > local18) {
					Static58.method1052();
					return;
				}
				while (local34 == Static58.aClass11_1.anIntArray76[local29]) {
					Static58.aClass11_1.method288(local29);
					this.method1054(local29, local38);
					if (Static58.aClass11_1.method294()) {
						Static58.aClass11_1.method301(local29);
						if (Static58.aClass11_1.method290()) {
							if (!Static58.aBoolean95) {
								this.method1561((long) (local38 / (long) (Static58.aClass11_1.anInt462 * 1000)));
								Static58.aClass11_1.method297();
								Static58.method1052();
								return;
							}
							Static58.aClass11_1.method292(local38);
						}
						break;
					}
					Static58.aClass11_1.method287(local29);
					Static58.aClass11_1.method301(local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJB)V")
	private void method1054(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(3) int local3 = Static58.aClass11_1.method302(arg0);
		if (local3 == 1) {
			Static58.aClass11_1.method296();
		} else if ((local3 & 0x80) != 0) {
			@Pc(16) int local16 = local3 & 0xFF;
			@Pc(25) int local25 = (int) (arg1 / (long) (Static58.aClass11_1.anInt462 * 1000));
			@Pc(31) int local31 = local3 >> 8 & 0xFF;
			@Pc(37) int local37 = local3 >> 16 & 0xFF;
			if (!this.method1563(local16, local31, local37, (long) local25)) {
				Static58.method1053(local25, local31, local37, local16);
			}
		}
	}
}
