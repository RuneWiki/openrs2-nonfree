import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 implements Runnable {

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Lclient!ib;")
	private final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!jb;Lclient!rd;)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface3 arg1) {
		Static29.anInterface3_1 = arg1;
		Static29.anInterface3_1.method1718();
		Static29.anInterface3_1.method1716();
		this.method638((long) Static29.anInt774);
		Static29.anInterface3_1.method1721(Static29.anIntArray149, Static29.anInt773);
		Static29.anInt773 = 0;
		arg0.method952(10, this);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static29.method643(arg2, arg0, (int) arg3, arg1);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	@Override
	public synchronized void method1233(@OriginalArg(1) int arg0) {
		this.method636((long) Static29.anInt774, arg0);
		Static29.anInterface3_1.method1721(Static29.anIntArray149, Static29.anInt773);
		Static29.anInt773 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.method633((long) Static29.anInt774, arg1, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static29.aBoolean43) {
						Static29.aBoolean43 = false;
						return;
					}
					this.method1228();
				}
				Static41.method888(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static16.method293(null, local24);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public void method1230() {
		synchronized (this) {
			Static29.aBoolean43 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static29.aBoolean43) {
					break;
				}
			}
			Static41.method888(20L);
		}
		Static29.anInterface3_1.method1719();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(JIB)V")
	private void method644(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.aClass30_1.method917(arg1);
		if (local9 == 1) {
			this.aClass30_1.method916();
		} else if ((local9 & 0x80) != 0) {
			@Pc(26) int local26 = (int) (arg0 / (long) (this.aClass30_1.anInt1250 * 1000));
			@Pc(30) int local30 = local9 & 0xFF;
			@Pc(36) int local36 = local9 >> 8 & 0xFF;
			@Pc(42) int local42 = local9 >> 16 & 0xFF;
			if (!this.method635(local30, local36, local42, (long) local26)) {
				Static29.method643(local42, local30, local26, local36);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1231() {
		Static29.anInterface3_1.method1716();
		this.method638((long) Static29.anInt774);
		Static29.anInterface3_1.method1721(Static29.anIntArray149, Static29.anInt773);
		Static29.anInt773 = 0;
		this.aClass30_1.method906();
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1228() {
		if (!this.aClass30_1.method914()) {
			return;
		}
		@Pc(27) long local27 = (long) (Static29.anInt774 + 200 - Static29.anInterface3_1.method1717()) * (long) (this.aClass30_1.anInt1250 * 1000);
		while (true) {
			while (true) {
				@Pc(31) int local31 = this.aClass30_1.method911();
				@Pc(37) int local37 = this.aClass30_1.anIntArray204[local31];
				@Pc(42) long local42 = this.aClass30_1.method910(local37);
				if (local42 > local27) {
					Static29.method645();
					return;
				}
				while (local37 == this.aClass30_1.anIntArray204[local31]) {
					this.aClass30_1.method912(local31);
					this.method644(local42, local31);
					if (this.aClass30_1.method918()) {
						this.aClass30_1.method921(local31);
						if (this.aClass30_1.method905()) {
							if (!Static29.aBoolean42) {
								this.method638((long) (local42 / (long) (this.aClass30_1.anInt1250 * 1000)));
								this.aClass30_1.method906();
								Static29.method645();
								return;
							}
							this.aClass30_1.method915(local42);
						}
						break;
					}
					this.aClass30_1.method913(local31);
					this.aClass30_1.method921(local31);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public synchronized void method1234(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.aClass30_1.method919(arg2);
		Static29.aBoolean42 = arg0;
		Static29.anInt774 = 0;
		Static29.anInterface3_1.method1716();
		this.method633((long) Static29.anInt774, arg1, 0);
		@Pc(27) boolean local27 = true;
		@Pc(31) int local31 = this.aClass30_1.method920();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass30_1.method912(local33);
			while (!this.aClass30_1.method918()) {
				this.aClass30_1.method913(local33);
				if (this.aClass30_1.anIntArray204[local33] != 0) {
					local27 = false;
					break;
				}
				this.method644(0L, local33);
			}
			this.aClass30_1.method921(local33);
		}
		if (local27) {
			if (Static29.aBoolean42) {
				throw new RuntimeException();
			}
			this.method638((long) Static29.anInt774);
			this.aClass30_1.method906();
		}
		Static29.method645();
	}
}
