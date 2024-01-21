import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public abstract class Class6_Sub1 extends Class6 implements Runnable {

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
	private int anInt2518 = 256;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	private int anInt2520 = 0;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
	private int anInt2515 = 0;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
	private final int[] anIntArray359 = new int[512];

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
	private int anInt2516 = 0;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
	private int anInt2517 = 0;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(J)V")
	private void method1569(@OriginalArg(0) long arg0) {
		if (this.aLong67 != 0L) {
			while (true) {
				if (this.aLong65 >= arg0) {
					if (arg0 < this.aLong67) {
						return;
					}
					try {
						this.method1570(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1575();
						this.aLong67 += 5000L;
						return;
					}
					this.aLong67 = 0L;
					break;
				}
				Static85.method1564();
				this.aLong65 += 256000 / Static27.anInt1162;
			}
		}
		@Pc(58) int local58;
		while (this.aLong65 < arg0) {
			this.aLong65 += 250880 / Static27.anInt1162;
			try {
				local58 = this.method1571();
			} catch (@Pc(60) Exception local60) {
				this.method1575();
				this.aLong67 = arg0;
				return;
			}
			this.method1576(local58);
			@Pc(81) int local81 = this.anInt2520 * 3 / 512 - this.anInt2517 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2515) {
				local81 = this.anInt2515;
			}
			this.anInt2518 = this.anInt2514 - local81 - 256;
			if (this.anInt2518 < 256) {
				this.anInt2518 = 256;
			}
			if (this.anInt2514 < 16384) {
				if (local58 >= this.anInt2514) {
					this.anInt2521 += 5;
					if (this.anInt2521 >= 100) {
						this.method1575();
						this.anInt2514 += 2048;
						this.aLong67 = arg0;
						return;
					}
				} else if (local58 != this.anInt2519 && this.anInt2521 > 0) {
					this.anInt2521--;
				}
			}
			this.anInt2519 = local58;
			if (local58 < this.anInt2518) {
				break;
			}
			Static85.method1560(Static104.anIntArray360, 256);
			try {
				this.method1574();
			} catch (@Pc(165) Exception local165) {
				this.method1575();
				this.aLong67 = arg0;
				return;
			}
			this.aLong66 = arg0;
			this.anInt2519 -= 256;
		}
		if (arg0 < this.aLong66 + 5000L) {
			return;
		}
		this.method1575();
		this.aLong67 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray359[local58] = 0;
		}
		this.anInt2517 = this.anInt2515 = this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(J)V")
	private void method1570(@OriginalArg(0) long arg0) throws Exception {
		this.method1573(this.anInt2514);
		while (true) {
			@Pc(6) int local6 = this.method1571();
			if (local6 < this.anInt2518) {
				this.anInt2521 = 0;
				this.anInt2519 = 0;
				this.aLong65 = arg0;
				this.aLong66 = arg0;
				return;
			}
			this.method1574();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1562(@OriginalArg(0) long arg0) {
		this.method1569(arg0);
		if (this.aLong65 < arg0) {
			this.aLong65 = arg0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "()I")
	protected abstract int method1571() throws Exception;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qd;I)V")
	public final void method1572(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2514 = arg1;
		this.method1570(System.currentTimeMillis());
		arg0.method1467(10, this);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
	@Override
	public final void method1561() {
		synchronized (this) {
			this.aBoolean131 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean131) {
					return;
				}
			}
			Static91.method1548(50L);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	protected abstract void method1573(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
	protected abstract void method1574() throws Exception;

	@OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean131) {
						if (this.aLong67 == 0L) {
							this.method1575();
						}
						this.aBoolean131 = false;
						return;
					}
					this.method1562(System.currentTimeMillis());
				}
				Static91.method1548(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static57.method1692(null, local33);
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "()V")
	protected abstract void method1575();

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	private void method1576(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2518;
		@Pc(10) int local10 = this.anIntArray359[this.anInt2516];
		this.anIntArray359[this.anInt2516] = local4;
		this.anInt2520 += local4 - local10;
		@Pc(31) int local31 = this.anInt2516 + 1 & 0x1FF;
		if (local4 > this.anInt2515) {
			this.anInt2515 = local4;
		}
		if (local4 < this.anInt2517) {
			this.anInt2517 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2515) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2516 && local51 < this.anInt2515; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray359[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2515 = local51;
		}
		if (local10 == this.anInt2517) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2516 && local51 > this.anInt2517; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray359[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2517 = local51;
		}
		this.anInt2516 = local31;
	}
}
