import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public abstract class Class17_Sub2 extends Class17 implements Runnable {

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
	private int anInt2346;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	private int anInt2348;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	private int anInt2350;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "J")
	private long aLong73 = 0L;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
	private int anInt2345 = 0;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	private int anInt2343 = 0;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
	private final int[] anIntArray308 = new int[512];

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
	private int anInt2344 = 0;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
	private int anInt2349 = 256;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	protected Class17_Sub2(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	protected abstract void method1438(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
	protected abstract void method1439();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(J)V")
	private void method1440(@OriginalArg(0) long arg0) throws Exception {
		this.method1438(this.anInt2350);
		while (true) {
			@Pc(6) int local6 = this.method1445();
			if (local6 < this.anInt2349) {
				this.anInt2348 = 0;
				this.anInt2346 = 0;
				this.aLong75 = arg0;
				this.aLong74 = arg0;
				return;
			}
			this.method1441();
		}
	}

	@OriginalMember(owner = "client!tb", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean104) {
						if (this.aLong73 == 0L) {
							this.method1439();
						}
						this.aBoolean104 = false;
						return;
					}
					this.method1433(System.currentTimeMillis());
				}
				Static93.method1123(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static99.method1580(null, local33);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	protected abstract void method1441() throws Exception;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(J)V")
	private void method1443(@OriginalArg(0) long arg0) {
		if (this.aLong73 != 0L) {
			while (true) {
				if (this.aLong75 >= arg0) {
					if (arg0 < this.aLong73) {
						return;
					}
					try {
						this.method1440(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1439();
						this.aLong73 += 5000L;
						return;
					}
					this.aLong73 = 0L;
					break;
				}
				Static24.method1437();
				this.aLong75 += 256000 / Static29.anInt894;
			}
		}
		@Pc(58) int local58;
		while (this.aLong75 < arg0) {
			this.aLong75 += 250880 / Static29.anInt894;
			try {
				local58 = this.method1445();
			} catch (@Pc(60) Exception local60) {
				this.method1439();
				this.aLong73 = arg0;
				return;
			}
			this.method1444(local58);
			@Pc(81) int local81 = this.anInt2345 * 3 / 512 - this.anInt2343 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2344) {
				local81 = this.anInt2344;
			}
			this.anInt2349 = this.anInt2350 - local81 - 256;
			if (this.anInt2349 < 256) {
				this.anInt2349 = 256;
			}
			if (this.anInt2350 < 16384) {
				if (local58 >= this.anInt2350) {
					this.anInt2348 += 5;
					if (this.anInt2348 >= 100) {
						this.method1439();
						this.anInt2350 += 2048;
						this.aLong73 = arg0;
						return;
					}
				} else if (local58 != this.anInt2346 && this.anInt2348 > 0) {
					this.anInt2348--;
				}
			}
			this.anInt2346 = local58;
			if (local58 < this.anInt2349) {
				break;
			}
			Static24.method1430(Static92.anIntArray307, 256);
			try {
				this.method1441();
			} catch (@Pc(165) Exception local165) {
				this.method1439();
				this.aLong73 = arg0;
				return;
			}
			this.aLong74 = arg0;
			this.anInt2346 -= 256;
		}
		if (arg0 < this.aLong74 + 5000L) {
			return;
		}
		this.method1439();
		this.aLong73 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray308[local58] = 0;
		}
		this.anInt2343 = this.anInt2344 = this.anInt2345 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	private void method1444(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2349;
		@Pc(10) int local10 = this.anIntArray308[this.anInt2347];
		this.anIntArray308[this.anInt2347] = local4;
		this.anInt2345 += local4 - local10;
		@Pc(31) int local31 = this.anInt2347 + 1 & 0x1FF;
		if (local4 > this.anInt2344) {
			this.anInt2344 = local4;
		}
		if (local4 < this.anInt2343) {
			this.anInt2343 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2344) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2347 && local51 < this.anInt2344; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray308[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2344 = local51;
		}
		if (local10 == this.anInt2343) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2347 && local51 > this.anInt2343; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray308[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2343 = local51;
		}
		this.anInt2347 = local31;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	@Override
	public final void method1435() {
		synchronized (this) {
			this.aBoolean104 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean104) {
					return;
				}
			}
			Static93.method1123(50L);
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "()I")
	protected abstract int method1445() throws Exception;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1433(@OriginalArg(0) long arg0) {
		this.method1443(arg0);
		if (this.aLong75 < arg0) {
			this.aLong75 = arg0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!s;I)V")
	public final void method1446(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2350 = arg1;
		this.method1440(System.currentTimeMillis());
		arg0.method1404(this, 10);
	}
}
