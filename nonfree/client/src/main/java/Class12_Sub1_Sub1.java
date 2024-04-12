import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 implements Runnable {

	@OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
	public static final int[] anIntArray301 = new int[256];

	@OriginalMember(owner = "client!l", name = "T", descriptor = "Lclient!bc;")
	private final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 4)
	@Override
	public synchronized void method1252() {
		if (!this.aClass8_1.method225()) {
			return;
		}
		@Pc(20) long local20 = (long) (Static52.anInt1459 + 200 - Static52.anInterface3_2.method796()) * (long) (this.aClass8_1.anInt250 * 1000);
		while (true) {
			while (true) {
				@Pc(24) int local24 = this.aClass8_1.method211();
				@Pc(30) int local30 = this.aClass8_1.anIntArray66[local24];
				@Pc(35) long local35 = this.aClass8_1.method216(local30);
				if (local20 < local35) {
					Static52.method969();
					return;
				}
				while (local30 == this.aClass8_1.anIntArray66[local24]) {
					this.aClass8_1.method226(local24);
					this.method971(local24, local35);
					if (this.aClass8_1.method215()) {
						this.aClass8_1.method217(local24);
						if (this.aClass8_1.method214()) {
							if (!Static52.aBoolean112) {
								this.method1257((long) (local35 / (long) (this.aClass8_1.anInt250 * 1000)));
								this.aClass8_1.method220();
								Static52.method969();
								return;
							}
							this.aClass8_1.method210(local35);
						}
						break;
					}
					this.aClass8_1.method221(local24);
					this.aClass8_1.method217(local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZB[BI)V", line = 101)
	@Override
	public synchronized void method1250(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.aClass8_1.method223(arg1);
		Static52.anInt1459 = 0;
		Static52.aBoolean112 = arg0;
		Static52.anInterface3_2.method791();
		@Pc(12) boolean local12 = true;
		this.method1256(arg2, (long) Static52.anInt1459, 0);
		@Pc(23) int local23 = this.aClass8_1.method218();
		for (@Pc(34) int local34 = 0; local34 < local23; local34++) {
			this.aClass8_1.method226(local34);
			while (!this.aClass8_1.method215()) {
				this.aClass8_1.method221(local34);
				if (this.aClass8_1.anIntArray66[local34] != 0) {
					local12 = false;
					break;
				}
				this.method971(local34, 0L);
			}
			this.aClass8_1.method217(local34);
		}
		if (local12) {
			if (Static52.aBoolean112) {
				throw new RuntimeException();
			}
			this.method1257((long) Static52.anInt1459);
			this.aClass8_1.method220();
		}
		Static52.method969();
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V", line = 154)
	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Static52.aBoolean111) {
						Static52.aBoolean111 = false;
						return;
					}
					this.method1252();
				}
				Static86.method1494(100L);
			}
		} catch (@Pc(24) Exception local24) {
			Static36.method727(null, local24);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIJ)V", line = 181)
	private void method971(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(4) int local4 = this.aClass8_1.method212(arg0);
		if (local4 == 1) {
			this.aClass8_1.method213();
		} else if ((local4 & 0x80) != 0) {
			@Pc(26) int local26 = (int) (arg1 / (long) (this.aClass8_1.anInt250 * 1000));
			@Pc(30) int local30 = local4 & 0xFF;
			@Pc(36) int local36 = local4 >> 8 & 0xFF;
			@Pc(42) int local42 = local4 >> 16 & 0xFF;
			if (!this.method1253(local30, local36, local42, (long) local26)) {
				Static52.method970(local36, local26, local42, local30);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIJ)V", line = 214)
	@Override
	protected void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		Static52.method970(arg1, (int) arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BII)V", line = 221)
	@Override
	public synchronized void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.method1256(arg1, (long) Static52.anInt1459, arg0);
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 234)
	@Override
	public void method1249() {
		synchronized (this) {
			Static52.aBoolean111 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Static52.aBoolean111) {
					break;
				}
			}
			Static86.method1494(20L);
		}
		Static52.anInterface3_2.method793();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 260)
	@Override
	public synchronized void method1241() {
		Static52.anInterface3_2.method791();
		this.method1257((long) Static52.anInt1459);
		Static52.anInterface3_2.method792(anIntArray301, Static52.anInt1460);
		Static52.anInt1460 = 0;
		this.aClass8_1.method220();
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!bb;Lclient!id;)V", line = 275)
	public Class12_Sub1_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Interface3 arg1) {
		Static52.anInterface3_2 = arg1;
		Static52.anInterface3_2.method794();
		Static52.anInterface3_2.method791();
		this.method1257((long) Static52.anInt1459);
		Static52.anInterface3_2.method792(anIntArray301, Static52.anInt1460);
		Static52.anInt1460 = 0;
		arg0.method207(10, this);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 289)
	@Override
	public synchronized void method1251() {
		this.method1259((long) Static52.anInt1459);
		Static52.anInterface3_2.method792(anIntArray301, Static52.anInt1460);
		Static52.anInt1460 = 0;
	}
}
