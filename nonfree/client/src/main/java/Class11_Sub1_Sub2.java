import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Runnable {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ha;Lclient!ad;)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Interface1 arg1) {
		Static22.anInterface1_1 = arg1;
		Static22.anInterface1_1.method70();
		Static22.anInterface1_1.method69();
		this.method536((long) Static22.anInt719);
		Static22.anInterface1_1.method67(Static22.anIntArray86, Static22.anInt720);
		Static22.anInt720 = 0;
		arg0.method774(this, 10);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	@Override
	public void method1280() {
		synchronized (this) {
			Static22.aBoolean29 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static22.aBoolean29) {
					break;
				}
			}
			Static23.method546(20L);
		}
		Static22.anInterface1_1.method71();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1275() {
		if (!Static22.aClass68_1.method1759()) {
			return;
		}
		@Pc(19) long local19 = (long) (Static22.anInt719 + 200 - Static22.anInterface1_1.method72()) * (long) (Static22.aClass68_1.anInt2663 * 1000);
		while (true) {
			while (true) {
				@Pc(22) int local22 = Static22.aClass68_1.method1763();
				@Pc(27) int local27 = Static22.aClass68_1.anIntArray275[local22];
				@Pc(31) long local31 = Static22.aClass68_1.method1765(local27);
				if (local19 < local31) {
					Static22.method543();
					return;
				}
				while (Static22.aClass68_1.anIntArray275[local22] == local27) {
					Static22.aClass68_1.method1756(local22);
					this.method544(local22, local31);
					if (Static22.aClass68_1.method1761()) {
						Static22.aClass68_1.method1757(local22);
						if (Static22.aClass68_1.method1760()) {
							if (!Static22.aBoolean30) {
								this.method536((long) (local31 / (long) (Static22.aClass68_1.anInt2663 * 1000)));
								Static22.aClass68_1.method1758();
								Static22.method543();
								return;
							}
							Static22.aClass68_1.method1769(local31);
						}
						break;
					}
					Static22.aClass68_1.method1764(local22);
					Static22.aClass68_1.method1757(local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method537(arg0, arg1, (long) Static22.anInt719);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static22.method542(arg0, arg1, arg2, (int) arg3);
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static22.aBoolean29) {
						Static22.aBoolean29 = false;
						return;
					}
					this.method1275();
				}
				Static23.method546(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static93.method1558(null, local24);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIJ)V")
	private void method544(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(3) int local3 = Static22.aClass68_1.method1771(arg0);
		if (local3 == 1) {
			Static22.aClass68_1.method1767();
		} else if ((local3 & 0x80) != 0) {
			@Pc(26) int local26 = local3 & 0xFF;
			@Pc(32) int local32 = local3 >> 8 & 0xFF;
			@Pc(38) int local38 = local3 >> 16 & 0xFF;
			@Pc(47) int local47 = (int) (arg1 / (long) (Static22.aClass68_1.anInt2663 * 1000));
			if (!this.method538(local26, local32, local38, (long) local47)) {
				Static22.method542(local26, local32, local38, local47);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method1277() {
		Static22.anInterface1_1.method69();
		this.method536((long) Static22.anInt719);
		Static22.anInterface1_1.method67(Static22.anIntArray86, Static22.anInt720);
		Static22.anInt720 = 0;
		Static22.aClass68_1.method1758();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
	@Override
	public synchronized void method1271(@OriginalArg(1) int arg0) {
		this.method534((long) Static22.anInt719, arg0);
		Static22.anInterface1_1.method67(Static22.anIntArray86, Static22.anInt720);
		Static22.anInt720 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI[B)V")
	@Override
	public synchronized void method1272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static22.aClass68_1.method1766(arg2);
		Static22.aBoolean30 = arg0;
		@Pc(12) boolean local12 = true;
		Static22.anInt719 = 0;
		Static22.anInterface1_1.method69();
		this.method537(arg1, 0, (long) Static22.anInt719);
		@Pc(27) int local27 = Static22.aClass68_1.method1768();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			Static22.aClass68_1.method1756(local29);
			while (!Static22.aClass68_1.method1761()) {
				Static22.aClass68_1.method1764(local29);
				if (Static22.aClass68_1.anIntArray275[local29] != 0) {
					local12 = false;
					break;
				}
				this.method544(local29, 0L);
			}
			Static22.aClass68_1.method1757(local29);
		}
		if (local12) {
			if (Static22.aBoolean30) {
				throw new RuntimeException();
			}
			this.method536((long) Static22.anInt719);
			Static22.aClass68_1.method1758();
		}
		Static22.method543();
	}
}
