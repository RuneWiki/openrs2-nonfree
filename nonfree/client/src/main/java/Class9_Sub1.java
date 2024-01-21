import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class9_Sub1 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	private int anInt2737;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
	private int anInt2740;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	private int anInt2741;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	private int anInt2735 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	private int anInt2739 = 0;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	private int anInt2738 = 0;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	private int anInt2736 = 0;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	private int anInt2742 = 256;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "[I")
	private final int[] anIntArray397 = new int[512];

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	protected Class9_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(J)V")
	private void method1875(@OriginalArg(0) long arg0) throws Exception {
		this.method1876(this.anInt2740);
		while (true) {
			@Pc(6) int local6 = this.method1878();
			if (local6 < this.anInt2742) {
				this.anInt2737 = 0;
				this.anInt2741 = 0;
				this.aLong82 = arg0;
				this.aLong80 = arg0;
				return;
			}
			this.method1881();
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	protected abstract void method1876(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!jb;I)V")
	public final void method1877(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2740 = arg1;
		this.method1875(System.currentTimeMillis());
		arg0.method952(10, this);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()I")
	protected abstract int method1878() throws Exception;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
	protected abstract void method1879();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1867(@OriginalArg(0) long arg0) {
		this.method1882(arg0);
		if (this.aLong82 < arg0) {
			this.aLong82 = arg0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	private void method1880(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2742;
		@Pc(10) int local10 = this.anIntArray397[this.anInt2739];
		this.anIntArray397[this.anInt2739] = local4;
		this.anInt2736 += local4 - local10;
		@Pc(31) int local31 = this.anInt2739 + 1 & 0x1FF;
		if (local4 > this.anInt2738) {
			this.anInt2738 = local4;
		}
		if (local4 < this.anInt2735) {
			this.anInt2735 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2738) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2739 && local51 < this.anInt2738; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray397[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2738 = local51;
		}
		if (local10 == this.anInt2735) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2739 && local51 > this.anInt2735; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray397[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2735 = local51;
		}
		this.anInt2739 = local31;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	@Override
	public final void method1873() {
		synchronized (this) {
			this.aBoolean128 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean128) {
					return;
				}
			}
			Static41.method888(50L);
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
	protected abstract void method1881() throws Exception;

	@OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean128) {
						if (this.aLong81 == 0L) {
							this.method1879();
						}
						this.aBoolean128 = false;
						return;
					}
					this.method1867(System.currentTimeMillis());
				}
				Static41.method888(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static16.method293(null, local33);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(J)V")
	private void method1882(@OriginalArg(0) long arg0) {
		if (this.aLong81 != 0L) {
			while (true) {
				if (this.aLong82 >= arg0) {
					if (arg0 < this.aLong81) {
						return;
					}
					try {
						this.method1875(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1879();
						this.aLong81 += 5000L;
						return;
					}
					this.aLong81 = 0L;
					break;
				}
				Static11.method1865();
				this.aLong82 += 256000 / Static80.anInt2188;
			}
		}
		@Pc(58) int local58;
		while (this.aLong82 < arg0) {
			this.aLong82 += 250880 / Static80.anInt2188;
			try {
				local58 = this.method1878();
			} catch (@Pc(60) Exception local60) {
				this.method1879();
				this.aLong81 = arg0;
				return;
			}
			this.method1880(local58);
			@Pc(81) int local81 = this.anInt2736 * 3 / 512 - this.anInt2735 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2738) {
				local81 = this.anInt2738;
			}
			this.anInt2742 = this.anInt2740 - local81 - 256;
			if (this.anInt2742 < 256) {
				this.anInt2742 = 256;
			}
			if (this.anInt2740 < 16384) {
				if (local58 >= this.anInt2740) {
					this.anInt2737 += 5;
					if (this.anInt2737 >= 100) {
						this.method1879();
						this.anInt2740 += 2048;
						this.aLong81 = arg0;
						return;
					}
				} else if (local58 != this.anInt2741 && this.anInt2737 > 0) {
					this.anInt2737--;
				}
			}
			this.anInt2741 = local58;
			if (local58 < this.anInt2742) {
				break;
			}
			Static11.method1869(Static14.anIntArray396, 256);
			try {
				this.method1881();
			} catch (@Pc(165) Exception local165) {
				this.method1879();
				this.aLong81 = arg0;
				return;
			}
			this.aLong80 = arg0;
			this.anInt2741 -= 256;
		}
		if (arg0 < this.aLong80 + 5000L) {
			return;
		}
		this.method1879();
		this.aLong81 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray397[local58] = 0;
		}
		this.anInt2735 = this.anInt2738 = this.anInt2736 = 0;
	}
}
