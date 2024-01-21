import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public abstract class Class10_Sub1 extends Class10 implements Runnable {

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	private int anInt1539 = 0;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "J")
	private long aLong48 = 0L;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt1540 = 256;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	private int anInt1541 = 0;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	private int anInt1536 = 0;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
	private int anInt1538 = 0;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "[I")
	private final int[] anIntArray161 = new int[512];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(J)V")
	private void method1035(@OriginalArg(0) long arg0) throws Exception {
		this.method1042(this.anInt1543);
		while (true) {
			@Pc(6) int local6 = this.method1040();
			if (local6 < this.anInt1540) {
				this.anInt1537 = 0;
				this.anInt1542 = 0;
				this.aLong50 = arg0;
				this.aLong49 = arg0;
				return;
			}
			this.method1039();
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(J)V")
	private void method1037(@OriginalArg(0) long arg0) {
		if (this.aLong48 != 0L) {
			while (true) {
				if (this.aLong50 >= arg0) {
					if (arg0 < this.aLong48) {
						return;
					}
					try {
						this.method1035(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1041();
						this.aLong48 += 5000L;
						return;
					}
					this.aLong48 = 0L;
					break;
				}
				Static12.method1744();
				this.aLong50 += 256000 / Static5.anInt382;
			}
		}
		@Pc(58) int local58;
		while (this.aLong50 < arg0) {
			this.aLong50 += 250880 / Static5.anInt382;
			try {
				local58 = this.method1040();
			} catch (@Pc(60) Exception local60) {
				this.method1041();
				this.aLong48 = arg0;
				return;
			}
			this.method1043(local58);
			@Pc(81) int local81 = this.anInt1541 * 3 / 512 - this.anInt1536 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1538) {
				local81 = this.anInt1538;
			}
			this.anInt1540 = this.anInt1543 - local81 - 256;
			if (this.anInt1540 < 256) {
				this.anInt1540 = 256;
			}
			if (this.anInt1543 < 16384) {
				if (local58 >= this.anInt1543) {
					this.anInt1537 += 5;
					if (this.anInt1537 >= 100) {
						this.method1041();
						this.anInt1543 += 2048;
						this.aLong48 = arg0;
						return;
					}
				} else if (local58 != this.anInt1542 && this.anInt1537 > 0) {
					this.anInt1537--;
				}
			}
			this.anInt1542 = local58;
			if (local58 < this.anInt1540) {
				break;
			}
			Static12.method1742(Static78.anIntArray160, 256);
			try {
				this.method1039();
			} catch (@Pc(165) Exception local165) {
				this.method1041();
				this.aLong48 = arg0;
				return;
			}
			this.aLong49 = arg0;
			this.anInt1542 -= 256;
		}
		if (arg0 < this.aLong49 + 5000L) {
			return;
		}
		this.method1041();
		this.aLong48 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray161[local58] = 0;
		}
		this.anInt1536 = this.anInt1538 = this.anInt1541 = 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lc;I)V")
	public final void method1038(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1543 = arg1;
		this.method1035(Static85.method1534());
		arg0.method1262(10, this);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
	@Override
	public final void method1740() {
		synchronized (this) {
			this.aBoolean84 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean84) {
					return;
				}
			}
			Static72.method1367(50L);
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()V")
	protected abstract void method1039() throws Exception;

	@OriginalMember(owner = "client!pd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean84) {
						if (this.aLong48 == 0L) {
							this.method1041();
						}
						this.aBoolean84 = false;
						return;
					}
					this.method1739(Static85.method1534());
				}
				Static72.method1367(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static10.method1681(null, local34);
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
	protected abstract int method1040() throws Exception;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
	protected abstract void method1041();

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	protected abstract void method1042(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1739(@OriginalArg(0) long arg0) {
		this.method1037(arg0);
		if (this.aLong50 < arg0) {
			this.aLong50 = arg0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	private void method1043(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1540;
		@Pc(10) int local10 = this.anIntArray161[this.anInt1539];
		this.anIntArray161[this.anInt1539] = local4;
		this.anInt1541 += local4 - local10;
		@Pc(31) int local31 = this.anInt1539 + 1 & 0x1FF;
		if (local4 > this.anInt1538) {
			this.anInt1538 = local4;
		}
		if (local4 < this.anInt1536) {
			this.anInt1536 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1538) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1539 && local51 < this.anInt1538; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray161[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1538 = local51;
		}
		if (local10 == this.anInt1536) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1539 && local51 > this.anInt1536; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray161[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1536 = local51;
		}
		this.anInt1539 = local31;
	}
}
