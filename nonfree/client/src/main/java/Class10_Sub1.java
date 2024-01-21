import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class10_Sub1 extends Class10 implements Runnable {

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	private int anInt2261 = 0;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	private int anInt2262 = 256;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
	private final int[] anIntArray349 = new int[512];

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int anInt2265 = 0;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	private int anInt2267 = 0;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt2266 = 0;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	protected abstract void method1565();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	@Override
	public final void method1554() {
		synchronized (this) {
			this.aBoolean126 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean126) {
					return;
				}
			}
			Static9.method179(50L);
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(J)V")
	private void method1566(@OriginalArg(0) long arg0) throws Exception {
		this.method1569(this.anInt2264);
		while (true) {
			@Pc(6) int local6 = this.method1570();
			if (local6 < this.anInt2262) {
				this.anInt2263 = 0;
				this.anInt2260 = 0;
				this.aLong70 = arg0;
				this.aLong71 = arg0;
				return;
			}
			this.method1567();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1559(@OriginalArg(0) long arg0) {
		this.method1571(arg0);
		if (this.aLong70 < arg0) {
			this.aLong70 = arg0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
	protected abstract void method1567() throws Exception;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	protected abstract void method1569(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()I")
	protected abstract int method1570() throws Exception;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(J)V")
	private void method1571(@OriginalArg(0) long arg0) {
		if (this.aLong72 != 0L) {
			while (true) {
				if (this.aLong70 >= arg0) {
					if (arg0 < this.aLong72) {
						return;
					}
					try {
						this.method1566(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1565();
						this.aLong72 += 5000L;
						return;
					}
					this.aLong72 = 0L;
					break;
				}
				Static31.method1560();
				this.aLong70 += 256000 / Static7.anInt234;
			}
		}
		@Pc(58) int local58;
		while (this.aLong70 < arg0) {
			this.aLong70 += 250880 / Static7.anInt234;
			try {
				local58 = this.method1570();
			} catch (@Pc(60) Exception local60) {
				this.method1565();
				this.aLong72 = arg0;
				return;
			}
			this.method1572(local58);
			@Pc(81) int local81 = this.anInt2267 * 3 / 512 - this.anInt2266 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2265) {
				local81 = this.anInt2265;
			}
			this.anInt2262 = this.anInt2264 - local81 - 256;
			if (this.anInt2262 < 256) {
				this.anInt2262 = 256;
			}
			if (this.anInt2264 < 16384) {
				if (local58 >= this.anInt2264) {
					this.anInt2263 += 5;
					if (this.anInt2263 >= 100) {
						this.method1565();
						this.anInt2264 += 2048;
						this.aLong72 = arg0;
						return;
					}
				} else if (local58 != this.anInt2260 && this.anInt2263 > 0) {
					this.anInt2263--;
				}
			}
			this.anInt2260 = local58;
			if (local58 < this.anInt2262) {
				break;
			}
			Static31.method1562(Static94.anIntArray348, 256);
			try {
				this.method1567();
			} catch (@Pc(165) Exception local165) {
				this.method1565();
				this.aLong72 = arg0;
				return;
			}
			this.aLong71 = arg0;
			this.anInt2260 -= 256;
		}
		if (arg0 < this.aLong71 + 5000L) {
			return;
		}
		this.method1565();
		this.aLong72 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray349[local58] = 0;
		}
		this.anInt2266 = this.anInt2265 = this.anInt2267 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean126) {
						if (this.aLong72 == 0L) {
							this.method1565();
						}
						this.aBoolean126 = false;
						return;
					}
					this.method1559(System.currentTimeMillis());
				}
				Static9.method179(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static95.method1687(null, local33);
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
	private void method1572(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2262;
		@Pc(10) int local10 = this.anIntArray349[this.anInt2261];
		this.anIntArray349[this.anInt2261] = local4;
		this.anInt2267 += local4 - local10;
		@Pc(31) int local31 = this.anInt2261 + 1 & 0x1FF;
		if (local4 > this.anInt2265) {
			this.anInt2265 = local4;
		}
		if (local4 < this.anInt2266) {
			this.anInt2266 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2265) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2261 && local51 < this.anInt2265; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray349[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2265 = local51;
		}
		if (local10 == this.anInt2266) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2261 && local51 > this.anInt2266; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray349[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2266 = local51;
		}
		this.anInt2261 = local31;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!vb;I)V")
	public final void method1573(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2264 = arg1;
		this.method1566(System.currentTimeMillis());
		arg0.method1807(this, 10);
	}
}
