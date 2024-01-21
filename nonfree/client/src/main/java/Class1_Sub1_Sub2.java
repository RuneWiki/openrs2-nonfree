import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Runnable {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "Lclient!ke;")
	private final Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!qd;Lclient!fa;)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Interface2 arg1) {
		Static29.anInterface2_1 = arg1;
		Static29.anInterface2_1.method752();
		Static29.anInterface2_1.method751();
		this.method802((long) Static29.anInt1190);
		Static29.anInterface2_1.method750(Static29.anIntArray145, Static29.anInt1191);
		Static29.anInt1191 = 0;
		arg0.method1467(10, this);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1051() {
		if (!this.aClass28_1.method1145()) {
			return;
		}
		@Pc(30) long local30 = (long) (Static29.anInt1190 + 200 - Static29.anInterface2_1.method753()) * (long) (this.aClass28_1.anInt1784 * 1000);
		while (true) {
			while (true) {
				@Pc(34) int local34 = this.aClass28_1.method1147();
				@Pc(40) int local40 = this.aClass28_1.anIntArray262[local34];
				@Pc(45) long local45 = this.aClass28_1.method1137(local40);
				if (local30 < local45) {
					Static29.method808();
					return;
				}
				while (this.aClass28_1.anIntArray262[local34] == local40) {
					this.aClass28_1.method1144(local34);
					this.method810(local34, local45);
					if (this.aClass28_1.method1151()) {
						this.aClass28_1.method1143(local34);
						if (this.aClass28_1.method1139()) {
							if (!Static29.aBoolean69) {
								this.method802((long) (local45 / (long) (this.aClass28_1.anInt1784 * 1000)));
								this.aClass28_1.method1138();
								Static29.method808();
								return;
							}
							this.aClass28_1.method1152(local45);
						}
						break;
					}
					this.aClass28_1.method1136(local34);
					this.aClass28_1.method1143(local34);
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1041() {
		this.method805((long) Static29.anInt1190);
		Static29.anInterface2_1.method750(Static29.anIntArray145, Static29.anInt1191);
		Static29.anInt1191 = 0;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1050() {
		Static29.anInterface2_1.method751();
		this.method802((long) Static29.anInt1190);
		Static29.anInterface2_1.method750(Static29.anIntArray145, Static29.anInt1191);
		Static29.anInt1191 = 0;
		this.aClass28_1.method1138();
	}

	@OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static29.aBoolean68) {
						Static29.aBoolean68 = false;
						return;
					}
					this.method1051();
				}
				Static91.method1548(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static57.method1692(null, local24);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public synchronized void method1048(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass28_1.method1148(arg2);
		Static29.aBoolean69 = arg0;
		@Pc(7) boolean local7 = true;
		Static29.anInt1190 = 0;
		Static29.anInterface2_1.method751();
		this.method800(arg1, (long) Static29.anInt1190, 0);
		@Pc(29) int local29 = this.aClass28_1.method1146();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass28_1.method1144(local31);
			while (!this.aClass28_1.method1151()) {
				this.aClass28_1.method1136(local31);
				if (this.aClass28_1.anIntArray262[local31] != 0) {
					local7 = false;
					break;
				}
				this.method810(local31, 0L);
			}
			this.aClass28_1.method1143(local31);
		}
		if (local7) {
			if (Static29.aBoolean69) {
				throw new RuntimeException();
			}
			this.method802((long) Static29.anInt1190);
			this.aClass28_1.method1138();
		}
		Static29.method808();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	@Override
	public void method1047() {
		synchronized (this) {
			Static29.aBoolean68 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static29.aBoolean68) {
					break;
				}
			}
			Static91.method1548(20L);
		}
		Static29.anInterface2_1.method749();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static29.method809(arg0, arg2, (int) arg3, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V")
	@Override
	public synchronized void method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method800(arg0, (long) Static29.anInt1190, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IJI)V")
	private void method810(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(4) int local4 = this.aClass28_1.method1141(arg0);
		if (local4 == 1) {
			this.aClass28_1.method1150();
		} else if ((local4 & 0x80) != 0) {
			@Pc(28) int local28 = (int) (arg1 / (long) (this.aClass28_1.anInt1784 * 1000));
			@Pc(32) int local32 = local4 & 0xFF;
			@Pc(38) int local38 = local4 >> 8 & 0xFF;
			@Pc(44) int local44 = local4 >> 16 & 0xFF;
			if (!this.method803(local32, local38, local44, (long) local28)) {
				Static29.method809(local32, local44, local28, local38);
				return;
			}
		}
	}
}
