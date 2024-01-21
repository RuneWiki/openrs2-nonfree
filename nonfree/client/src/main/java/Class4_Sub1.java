import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class4_Sub1 extends Class4 implements Runnable {

	@OriginalMember(owner = "client!na", name = "w", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "I")
	private int anInt1362 = 256;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
	private final int[] anIntArray87 = new int[512];

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	private int anInt1365 = 0;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "I")
	private int anInt1367 = 0;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "I")
	private int anInt1366 = 0;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	private int anInt1368 = 0;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "J")
	private long aLong48 = 0L;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(J)V")
	private void method883(@OriginalArg(0) long arg0) throws Exception {
		this.method886(this.anInt1363);
		while (true) {
			@Pc(6) int local6 = this.method890();
			if (local6 < this.anInt1362) {
				this.anInt1369 = 0;
				this.anInt1364 = 0;
				this.aLong49 = arg0;
				this.aLong47 = arg0;
				return;
			}
			this.method888();
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
	protected abstract void method884();

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(J)V")
	private void method885(@OriginalArg(0) long arg0) {
		if (this.aLong48 != 0L) {
			while (true) {
				if (this.aLong49 >= arg0) {
					if (arg0 < this.aLong48) {
						return;
					}
					try {
						this.method883(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method884();
						this.aLong48 += 5000L;
						return;
					}
					this.aLong48 = 0L;
					break;
				}
				Static27.method875();
				this.aLong49 += 256000 / Static59.anInt1823;
			}
		}
		@Pc(58) int local58;
		while (this.aLong49 < arg0) {
			this.aLong49 += 250880 / Static59.anInt1823;
			try {
				local58 = this.method890();
			} catch (@Pc(60) Exception local60) {
				this.method884();
				this.aLong48 = arg0;
				return;
			}
			this.method889(local58);
			@Pc(81) int local81 = this.anInt1366 * 3 / 512 - this.anInt1367 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1368) {
				local81 = this.anInt1368;
			}
			this.anInt1362 = this.anInt1363 - local81 - 256;
			if (this.anInt1362 < 256) {
				this.anInt1362 = 256;
			}
			if (this.anInt1363 < 16384) {
				if (local58 >= this.anInt1363) {
					this.anInt1369 += 5;
					if (this.anInt1369 >= 100) {
						this.method884();
						this.anInt1363 += 2048;
						this.aLong48 = arg0;
						return;
					}
				} else if (local58 != this.anInt1364 && this.anInt1369 > 0) {
					this.anInt1369--;
				}
			}
			this.anInt1364 = local58;
			if (local58 < this.anInt1362) {
				break;
			}
			Static27.method880(Static62.anIntArray88, 256);
			try {
				this.method888();
			} catch (@Pc(165) Exception local165) {
				this.method884();
				this.aLong48 = arg0;
				return;
			}
			this.aLong47 = arg0;
			this.anInt1364 -= 256;
		}
		if (arg0 < this.aLong47 + 5000L) {
			return;
		}
		this.method884();
		this.aLong48 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray87[local58] = 0;
		}
		this.anInt1367 = this.anInt1368 = this.anInt1366 = 0;
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean61) {
						if (this.aLong48 == 0L) {
							this.method884();
						}
						this.aBoolean61 = false;
						return;
					}
					this.method874(Static1.method3());
				}
				Static58.method1193(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static15.method544(null, local34);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	@Override
	public final void method877() {
		synchronized (this) {
			this.aBoolean61 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean61) {
					return;
				}
			}
			Static58.method1193(50L);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	protected abstract void method886(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!fb;I)V")
	public final void method887(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1363 = arg1;
		this.method883(Static1.method3());
		arg0.method728(10, this);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
	protected abstract void method888() throws Exception;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	private void method889(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1362;
		@Pc(10) int local10 = this.anIntArray87[this.anInt1365];
		this.anIntArray87[this.anInt1365] = local4;
		this.anInt1366 += local4 - local10;
		@Pc(31) int local31 = this.anInt1365 + 1 & 0x1FF;
		if (local4 > this.anInt1368) {
			this.anInt1368 = local4;
		}
		if (local4 < this.anInt1367) {
			this.anInt1367 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1368) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1365 && local51 < this.anInt1368; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray87[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1368 = local51;
		}
		if (local10 == this.anInt1367) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1365 && local51 > this.anInt1367; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray87[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1367 = local51;
		}
		this.anInt1365 = local31;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method874(@OriginalArg(0) long arg0) {
		this.method885(arg0);
		if (this.aLong49 < arg0) {
			this.aLong49 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()I")
	protected abstract int method890() throws Exception;
}
