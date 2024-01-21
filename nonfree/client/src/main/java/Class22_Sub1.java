import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public abstract class Class22_Sub1 extends Class22 implements Runnable {

	@OriginalMember(owner = "client!va", name = "R", descriptor = "I")
	private int anInt1456;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "I")
	private int anInt1457;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "I")
	private int anInt1460;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "[I")
	private final int[] anIntArray209 = new int[512];

	@OriginalMember(owner = "client!va", name = "N", descriptor = "I")
	private int anInt1455 = 256;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	private int anInt1454 = 0;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "I")
	private int anInt1453 = 0;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	private int anInt1459 = 0;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	private int anInt1458 = 0;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	protected Class22_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()V")
	@Override
	public final void method990() {
		synchronized (this) {
			this.aBoolean106 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean106) {
					return;
				}
			}
			Static104.method1701(50L);
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
	protected abstract void method996();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method992(@OriginalArg(0) long arg0) {
		this.method1001(arg0);
		if (this.aLong52 < arg0) {
			this.aLong52 = arg0;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(J)V")
	private void method997(@OriginalArg(0) long arg0) throws Exception {
		this.method999(this.anInt1457);
		while (true) {
			@Pc(6) int local6 = this.method1004();
			if (local6 < this.anInt1455) {
				this.anInt1456 = 0;
				this.anInt1460 = 0;
				this.aLong52 = arg0;
				this.aLong51 = arg0;
				return;
			}
			this.method1000();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	private void method998(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1455;
		@Pc(10) int local10 = this.anIntArray209[this.anInt1458];
		this.anIntArray209[this.anInt1458] = local4;
		this.anInt1459 += local4 - local10;
		@Pc(31) int local31 = this.anInt1458 + 1 & 0x1FF;
		if (local4 > this.anInt1454) {
			this.anInt1454 = local4;
		}
		if (local4 < this.anInt1453) {
			this.anInt1453 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1454) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1458 && local51 < this.anInt1454; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray209[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1454 = local51;
		}
		if (local10 == this.anInt1453) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1458 && local51 > this.anInt1453; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray209[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1453 = local51;
		}
		this.anInt1458 = local31;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	protected abstract void method999(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
	protected abstract void method1000() throws Exception;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(J)V")
	private void method1001(@OriginalArg(0) long arg0) {
		if (this.aLong50 != 0L) {
			while (true) {
				if (this.aLong52 >= arg0) {
					if (arg0 < this.aLong50) {
						return;
					}
					try {
						this.method997(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method996();
						this.aLong50 += 5000L;
						return;
					}
					this.aLong50 = 0L;
					break;
				}
				Static87.method986();
				this.aLong52 += 256000 / Static89.anInt2053;
			}
		}
		@Pc(58) int local58;
		while (this.aLong52 < arg0) {
			this.aLong52 += 250880 / Static89.anInt2053;
			try {
				local58 = this.method1004();
			} catch (@Pc(60) Exception local60) {
				this.method996();
				this.aLong50 = arg0;
				return;
			}
			this.method998(local58);
			@Pc(81) int local81 = this.anInt1459 * 3 / 512 - this.anInt1453 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1454) {
				local81 = this.anInt1454;
			}
			this.anInt1455 = this.anInt1457 - local81 - 256;
			if (this.anInt1455 < 256) {
				this.anInt1455 = 256;
			}
			if (this.anInt1457 < 16384) {
				if (local58 >= this.anInt1457) {
					this.anInt1456 += 5;
					if (this.anInt1456 >= 100) {
						this.method996();
						this.anInt1457 += 2048;
						this.aLong50 = arg0;
						return;
					}
				} else if (local58 != this.anInt1460 && this.anInt1456 > 0) {
					this.anInt1456--;
				}
			}
			this.anInt1460 = local58;
			if (local58 < this.anInt1455) {
				break;
			}
			Static87.method991(Static105.anIntArray210, 256);
			try {
				this.method1000();
			} catch (@Pc(165) Exception local165) {
				this.method996();
				this.aLong50 = arg0;
				return;
			}
			this.aLong51 = arg0;
			this.anInt1460 -= 256;
		}
		if (arg0 < this.aLong51 + 5000L) {
			return;
		}
		this.method996();
		this.aLong50 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray209[local58] = 0;
		}
		this.anInt1453 = this.anInt1454 = this.anInt1459 = 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!aa;I)V")
	public final void method1002(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1457 = arg1;
		this.method997(Static82.method1291());
		arg0.method13(10, this);
	}

	@OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean106) {
						if (this.aLong50 == 0L) {
							this.method996();
						}
						this.aBoolean106 = false;
						return;
					}
					this.method992(Static82.method1291());
				}
				Static104.method1701(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static101.method1675(local34, null);
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "()I")
	protected abstract int method1004() throws Exception;
}
