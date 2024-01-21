import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public abstract class Class9_Sub2 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	private int anInt2439;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	private int anInt2442;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	private int anInt2445;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	private int anInt2440 = 0;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	private int anInt2444 = 0;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	private int anInt2443 = 0;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	private int anInt2441 = 0;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
	private final int[] anIntArray330 = new int[512];

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	private int anInt2446 = 256;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	protected Class9_Sub2(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	private void method1551(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2446;
		@Pc(10) int local10 = this.anIntArray330[this.anInt2444];
		this.anIntArray330[this.anInt2444] = local4;
		this.anInt2443 += local4 - local10;
		@Pc(31) int local31 = this.anInt2444 + 1 & 0x1FF;
		if (local4 > this.anInt2440) {
			this.anInt2440 = local4;
		}
		if (local4 < this.anInt2441) {
			this.anInt2441 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2440) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2444 && local51 < this.anInt2440; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray330[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2440 = local51;
		}
		if (local10 == this.anInt2441) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2444 && local51 > this.anInt2441; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray330[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2441 = local51;
		}
		this.anInt2444 = local31;
	}

	@OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean114) {
						if (this.aLong67 == 0L) {
							this.method1556();
						}
						this.aBoolean114 = false;
						return;
					}
					this.method1550(Static82.method1454());
				}
				Static39.method862(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static42.method908(null, local34);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(J)V")
	private void method1552(@OriginalArg(0) long arg0) {
		if (this.aLong67 != 0L) {
			while (true) {
				if (this.aLong66 >= arg0) {
					if (arg0 < this.aLong67) {
						return;
					}
					try {
						this.method1558(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1556();
						this.aLong67 += 5000L;
						return;
					}
					this.aLong67 = 0L;
					break;
				}
				Static12.method1542();
				this.aLong66 += 256000 / Static109.anInt2826;
			}
		}
		@Pc(58) int local58;
		while (this.aLong66 < arg0) {
			this.aLong66 += 250880 / Static109.anInt2826;
			try {
				local58 = this.method1559();
			} catch (@Pc(60) Exception local60) {
				this.method1556();
				this.aLong67 = arg0;
				return;
			}
			this.method1551(local58);
			@Pc(81) int local81 = this.anInt2443 * 3 / 512 - this.anInt2441 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2440) {
				local81 = this.anInt2440;
			}
			this.anInt2446 = this.anInt2439 - local81 - 256;
			if (this.anInt2446 < 256) {
				this.anInt2446 = 256;
			}
			if (this.anInt2439 < 16384) {
				if (local58 >= this.anInt2439) {
					this.anInt2442 += 5;
					if (this.anInt2442 >= 100) {
						this.method1556();
						this.anInt2439 += 2048;
						this.aLong67 = arg0;
						return;
					}
				} else if (local58 != this.anInt2445 && this.anInt2442 > 0) {
					this.anInt2442--;
				}
			}
			this.anInt2445 = local58;
			if (local58 < this.anInt2446) {
				break;
			}
			Static12.method1546(Static30.anIntArray329, 256);
			try {
				this.method1555();
			} catch (@Pc(165) Exception local165) {
				this.method1556();
				this.aLong67 = arg0;
				return;
			}
			this.aLong65 = arg0;
			this.anInt2445 -= 256;
		}
		if (arg0 < this.aLong65 + 5000L) {
			return;
		}
		this.method1556();
		this.aLong67 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray330[local58] = 0;
		}
		this.anInt2441 = this.anInt2440 = this.anInt2443 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	protected abstract void method1553(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	@Override
	public final void method1549() {
		synchronized (this) {
			this.aBoolean114 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean114) {
					return;
				}
			}
			Static39.method862(50L);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1550(@OriginalArg(0) long arg0) {
		this.method1552(arg0);
		if (this.aLong66 < arg0) {
			this.aLong66 = arg0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	protected abstract void method1555() throws Exception;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	protected abstract void method1556();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ra;I)V")
	public final void method1557(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2439 = arg1;
		this.method1558(Static82.method1454());
		arg0.method1495(10, this);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(J)V")
	private void method1558(@OriginalArg(0) long arg0) throws Exception {
		this.method1553(this.anInt2439);
		while (true) {
			@Pc(6) int local6 = this.method1559();
			if (local6 < this.anInt2446) {
				this.anInt2442 = 0;
				this.anInt2445 = 0;
				this.aLong66 = arg0;
				this.aLong65 = arg0;
				return;
			}
			this.method1555();
		}
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()I")
	protected abstract int method1559() throws Exception;
}
