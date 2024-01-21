import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class30_Sub1_Sub1 extends Class30_Sub1 implements Runnable {

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!aa;Lclient!jc;)V")
	public Class30_Sub1_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Interface1 arg1) {
		Static33.anInterface1_2 = arg1;
		Static33.anInterface1_2.method875();
		Static33.anInterface1_2.method876();
		this.method1515((long) Static33.anInt1010);
		Static33.anInterface1_2.method874(Static33.anIntArray95, Static33.anInt1011);
		Static33.anInt1011 = 0;
		arg0.method13(10, this);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	@Override
	public void method1881() {
		synchronized (this) {
			Static33.aBoolean63 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static33.aBoolean63) {
					break;
				}
			}
			Static104.method1701(20L);
		}
		Static33.anInterface1_2.method871();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method1522(arg0, arg1, (long) Static33.anInt1010);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1883() {
		Static33.anInterface1_2.method876();
		this.method1515((long) Static33.anInt1010);
		Static33.anInterface1_2.method874(Static33.anIntArray95, Static33.anInt1011);
		Static33.anInt1011 = 0;
		Static33.aClass45_1.method983();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJI)V")
	private void method691(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static33.aClass45_1.method973(arg1);
		if (local11 == 1) {
			Static33.aClass45_1.method977();
		} else if ((local11 & 0x80) != 0) {
			@Pc(29) int local29 = (int) (arg0 / (long) (Static33.aClass45_1.anInt1439 * 1000));
			@Pc(33) int local33 = local11 & 0xFF;
			@Pc(39) int local39 = local11 >> 8 & 0xFF;
			@Pc(45) int local45 = local11 >> 16 & 0xFF;
			if (!this.method1514(local33, local39, local45, (long) local29)) {
				Static33.method692(local45, local39, local33, local29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(IIIJ)V")
	@Override
	protected void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static33.method692(arg2, arg1, arg0, (int) arg3);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1882() {
		if (!Static33.aClass45_1.method981()) {
			return;
		}
		@Pc(20) long local20 = (long) (Static33.anInt1010 + 200 - Static33.anInterface1_2.method872()) * (long) (Static33.aClass45_1.anInt1439 * 1000);
		while (true) {
			while (true) {
				@Pc(23) int local23 = Static33.aClass45_1.method975();
				@Pc(28) int local28 = Static33.aClass45_1.anIntArray198[local23];
				@Pc(32) long local32 = Static33.aClass45_1.method971(local28);
				if (local20 < local32) {
					Static33.method693();
					return;
				}
				while (local28 == Static33.aClass45_1.anIntArray198[local23]) {
					Static33.aClass45_1.method974(local23);
					this.method691(local32, local23);
					if (Static33.aClass45_1.method972()) {
						Static33.aClass45_1.method980(local23);
						if (Static33.aClass45_1.method969()) {
							if (!Static33.aBoolean64) {
								this.method1515((long) (local32 / (long) (Static33.aClass45_1.anInt1439 * 1000)));
								Static33.aClass45_1.method983();
								Static33.method693();
								return;
							}
							Static33.aClass45_1.method978(local32);
						}
						break;
					}
					Static33.aClass45_1.method970(local23);
					Static33.aClass45_1.method980(local23);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static33.aBoolean63) {
						Static33.aBoolean63 = false;
						return;
					}
					this.method1882();
				}
				Static104.method1701(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static101.method1675(local24, null);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BIBZ)V")
	@Override
	public synchronized void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(1) boolean local1 = true;
		Static33.aClass45_1.method984(arg0);
		Static33.aBoolean64 = arg2;
		Static33.anInt1010 = 0;
		Static33.anInterface1_2.method876();
		this.method1522(arg1, 0, (long) Static33.anInt1010);
		@Pc(21) int local21 = Static33.aClass45_1.method979();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			Static33.aClass45_1.method974(local23);
			while (!Static33.aClass45_1.method972()) {
				Static33.aClass45_1.method970(local23);
				if (Static33.aClass45_1.anIntArray198[local23] != 0) {
					local1 = false;
					break;
				}
				this.method691(0L, local23);
			}
			Static33.aClass45_1.method980(local23);
		}
		if (local1) {
			if (Static33.aBoolean64) {
				throw new RuntimeException();
			}
			this.method1515((long) Static33.anInt1010);
			Static33.aClass45_1.method983();
		}
		Static33.method693();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	@Override
	public synchronized void method1873(@OriginalArg(0) int arg0) {
		this.method1516((long) Static33.anInt1010, arg0);
		Static33.anInterface1_2.method874(Static33.anIntArray95, Static33.anInt1011);
		Static33.anInt1011 = 0;
	}
}
