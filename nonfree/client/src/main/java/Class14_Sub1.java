import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class14_Sub1 extends Class14 implements Runnable {

	@OriginalMember(owner = "client!na", name = "x", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	private int anInt2231;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "I")
	private int anInt2234;

	@OriginalMember(owner = "client!na", name = "E", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	private int anInt2238;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	private int anInt2235 = 0;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "I")
	private int anInt2233 = 0;

	@OriginalMember(owner = "client!na", name = "z", descriptor = "I")
	private int anInt2232 = 256;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	private int anInt2236 = 0;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
	private final int[] anIntArray242 = new int[512];

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	private int anInt2237 = 0;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	protected Class14_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
	protected abstract void method1362() throws Exception;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	private void method1363(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2232;
		@Pc(10) int local10 = this.anIntArray242[this.anInt2233];
		this.anIntArray242[this.anInt2233] = local4;
		this.anInt2237 += local4 - local10;
		@Pc(31) int local31 = this.anInt2233 + 1 & 0x1FF;
		if (local4 > this.anInt2236) {
			this.anInt2236 = local4;
		}
		if (local4 < this.anInt2235) {
			this.anInt2235 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2236) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2233 && local51 < this.anInt2236; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray242[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2236 = local51;
		}
		if (local10 == this.anInt2235) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2233 && local51 > this.anInt2235; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray242[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2235 = local51;
		}
		this.anInt2233 = local31;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jc;I)V")
	public final void method1365(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2234 = arg1;
		this.method1370(System.currentTimeMillis());
		arg0.method770(10, this);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	@Override
	public final void method1866() {
		synchronized (this) {
			this.aBoolean134 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean134) {
					return;
				}
			}
			Static24.method505(50L);
		}
	}

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean134) {
						if (this.aLong67 == 0L) {
							this.method1369();
						}
						this.aBoolean134 = false;
						return;
					}
					this.method1871(System.currentTimeMillis());
				}
				Static24.method505(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static72.method1184(null, local33);
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
	protected abstract int method1366() throws Exception;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	protected abstract void method1367(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(J)V")
	private void method1368(@OriginalArg(0) long arg0) {
		if (this.aLong67 != 0L) {
			while (true) {
				if (this.aLong65 >= arg0) {
					if (arg0 < this.aLong67) {
						return;
					}
					try {
						this.method1370(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1369();
						this.aLong67 += 5000L;
						return;
					}
					this.aLong67 = 0L;
					break;
				}
				Static17.method1869();
				this.aLong65 += 256000 / Static14.anInt545;
			}
		}
		@Pc(58) int local58;
		while (this.aLong65 < arg0) {
			this.aLong65 += 250880 / Static14.anInt545;
			try {
				local58 = this.method1366();
			} catch (@Pc(60) Exception local60) {
				this.method1369();
				this.aLong67 = arg0;
				return;
			}
			this.method1363(local58);
			@Pc(81) int local81 = this.anInt2237 * 3 / 512 - this.anInt2235 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2236) {
				local81 = this.anInt2236;
			}
			this.anInt2232 = this.anInt2234 - local81 - 256;
			if (this.anInt2232 < 256) {
				this.anInt2232 = 256;
			}
			if (this.anInt2234 < 16384) {
				if (local58 >= this.anInt2234) {
					this.anInt2238 += 5;
					if (this.anInt2238 >= 100) {
						this.method1369();
						this.anInt2234 += 2048;
						this.aLong67 = arg0;
						return;
					}
				} else if (local58 != this.anInt2231 && this.anInt2238 > 0) {
					this.anInt2238--;
				}
			}
			this.anInt2231 = local58;
			if (local58 < this.anInt2232) {
				break;
			}
			Static17.method1867(Static67.anIntArray241, 256);
			try {
				this.method1362();
			} catch (@Pc(165) Exception local165) {
				this.method1369();
				this.aLong67 = arg0;
				return;
			}
			this.aLong66 = arg0;
			this.anInt2231 -= 256;
		}
		if (arg0 < this.aLong66 + 5000L) {
			return;
		}
		this.method1369();
		this.aLong67 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray242[local58] = 0;
		}
		this.anInt2235 = this.anInt2236 = this.anInt2237 = 0;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
	protected abstract void method1369();

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(J)V")
	private void method1370(@OriginalArg(0) long arg0) throws Exception {
		this.method1367(this.anInt2234);
		while (true) {
			@Pc(6) int local6 = this.method1366();
			if (local6 < this.anInt2232) {
				this.anInt2238 = 0;
				this.anInt2231 = 0;
				this.aLong65 = arg0;
				this.aLong66 = arg0;
				return;
			}
			this.method1362();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1871(@OriginalArg(0) long arg0) {
		this.method1368(arg0);
		if (this.aLong65 < arg0) {
			this.aLong65 = arg0;
		}
	}
}
