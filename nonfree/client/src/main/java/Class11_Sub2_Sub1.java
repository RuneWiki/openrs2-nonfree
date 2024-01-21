import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ra;Lclient!cd;)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Interface1 arg1) {
		Static53.anInterface1_1 = arg1;
		Static53.anInterface1_1.method190();
		Static53.anInterface1_1.method187();
		this.method1118((long) Static53.anInt1677);
		Static53.anInterface1_1.method186(Static53.anIntArray193, Static53.anInt1676);
		Static53.anInt1676 = 0;
		arg0.method1495(10, this);
	}

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static53.aBoolean84) {
						Static53.aBoolean84 = false;
						return;
					}
					this.method1111();
				}
				Static39.method862(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static42.method908(null, local24);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IJI)V")
	private void method1043(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static53.aClass64_1.method1689(arg1);
		if (local11 == 1) {
			Static53.aClass64_1.method1684();
		} else if ((local11 & 0x80) != 0) {
			@Pc(32) int local32 = (int) (arg0 / (long) (Static53.aClass64_1.anInt2595 * 1000));
			@Pc(36) int local36 = local11 & 0xFF;
			@Pc(42) int local42 = local11 >> 8 & 0xFF;
			@Pc(48) int local48 = local11 >> 16 & 0xFF;
			if (!this.method1119(local36, local42, local48, (long) local32)) {
				Static53.method1042(local36, local32, local48, local42);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1103() {
		Static53.anInterface1_1.method187();
		this.method1118((long) Static53.anInt1677);
		Static53.anInterface1_1.method186(Static53.anIntArray193, Static53.anInt1676);
		Static53.anInt1676 = 0;
		Static53.aClass64_1.method1682();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static53.method1042(arg0, (int) arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1116((long) Static53.anInt1677, arg0, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1111() {
		if (!Static53.aClass64_1.method1690()) {
			return;
		}
		@Pc(18) long local18 = (long) (Static53.anInt1677 + 200 - Static53.anInterface1_1.method189()) * (long) (Static53.aClass64_1.anInt2595 * 1000);
		while (true) {
			while (true) {
				@Pc(21) int local21 = Static53.aClass64_1.method1687();
				@Pc(26) int local26 = Static53.aClass64_1.anIntArray351[local21];
				@Pc(30) long local30 = Static53.aClass64_1.method1680(local26);
				if (local18 < local30) {
					Static53.method1044();
					return;
				}
				while (Static53.aClass64_1.anIntArray351[local21] == local26) {
					Static53.aClass64_1.method1678(local21);
					this.method1043(local30, local21);
					if (Static53.aClass64_1.method1676()) {
						Static53.aClass64_1.method1688(local21);
						if (Static53.aClass64_1.method1677()) {
							if (!Static53.aBoolean85) {
								this.method1118((long) (local30 / (long) (Static53.aClass64_1.anInt2595 * 1000)));
								Static53.aClass64_1.method1682();
								Static53.method1044();
								return;
							}
							Static53.aClass64_1.method1681(local30);
						}
						break;
					}
					Static53.aClass64_1.method1691(local21);
					Static53.aClass64_1.method1688(local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[BZI)V")
	@Override
	public synchronized void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		Static53.aClass64_1.method1679(arg1);
		Static53.aBoolean85 = arg2;
		Static53.anInt1677 = 0;
		@Pc(8) boolean local8 = true;
		Static53.anInterface1_1.method187();
		this.method1116((long) Static53.anInt1677, arg0, 0);
		@Pc(25) int local25 = Static53.aClass64_1.method1683();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			Static53.aClass64_1.method1678(local27);
			while (!Static53.aClass64_1.method1676()) {
				Static53.aClass64_1.method1691(local27);
				if (Static53.aClass64_1.anIntArray351[local27] != 0) {
					local8 = false;
					break;
				}
				this.method1043(0L, local27);
			}
			Static53.aClass64_1.method1688(local27);
		}
		if (local8) {
			if (Static53.aBoolean85) {
				throw new RuntimeException();
			}
			this.method1118((long) Static53.anInt1677);
			Static53.aClass64_1.method1682();
		}
		Static53.method1044();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)V")
	@Override
	public synchronized void method1105(@OriginalArg(1) int arg0) {
		this.method1121((long) Static53.anInt1677, arg0);
		Static53.anInterface1_1.method186(Static53.anIntArray193, Static53.anInt1676);
		Static53.anInt1676 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	@Override
	public void method1114() {
		synchronized (this) {
			Static53.aBoolean84 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static53.aBoolean84) {
					break;
				}
			}
			Static39.method862(20L);
		}
		Static53.anInterface1_1.method185();
	}
}
