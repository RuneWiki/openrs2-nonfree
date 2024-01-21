import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class24_Sub1 extends Class24 implements Runnable {

	@OriginalMember(owner = "client!he", name = "z", descriptor = "I")
	private int anInt1636;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "I")
	private int anInt1640;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	private int anInt1643;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
	private final int[] anIntArray336 = new int[512];

	@OriginalMember(owner = "client!he", name = "A", descriptor = "I")
	private int anInt1637 = 0;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "I")
	private int anInt1638 = 0;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "I")
	private int anInt1641 = 256;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "I")
	private int anInt1639 = 0;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	private int anInt1642 = 0;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	protected Class24_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	protected abstract void method1083() throws Exception;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(J)V")
	private void method1084(@OriginalArg(0) long arg0) throws Exception {
		this.method1089(this.anInt1640);
		while (true) {
			@Pc(6) int local6 = this.method1090();
			if (local6 < this.anInt1641) {
				this.anInt1643 = 0;
				this.anInt1636 = 0;
				this.aLong111 = arg0;
				this.aLong109 = arg0;
				return;
			}
			this.method1083();
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(J)V")
	private void method1085(@OriginalArg(0) long arg0) {
		if (this.aLong110 != 0L) {
			while (true) {
				if (this.aLong111 >= arg0) {
					if (arg0 < this.aLong110) {
						return;
					}
					try {
						this.method1084(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1087();
						this.aLong110 += 5000L;
						return;
					}
					this.aLong110 = 0L;
					break;
				}
				Static107.method1658();
				this.aLong111 += 256000 / Static12.anInt291;
			}
		}
		@Pc(58) int local58;
		while (this.aLong111 < arg0) {
			this.aLong111 += 250880 / Static12.anInt291;
			try {
				local58 = this.method1090();
			} catch (@Pc(60) Exception local60) {
				this.method1087();
				this.aLong110 = arg0;
				return;
			}
			this.method1091(local58);
			@Pc(81) int local81 = this.anInt1642 * 3 / 512 - this.anInt1639 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1637) {
				local81 = this.anInt1637;
			}
			this.anInt1641 = this.anInt1640 - local81 - 256;
			if (this.anInt1641 < 256) {
				this.anInt1641 = 256;
			}
			if (this.anInt1640 < 16384) {
				if (local58 >= this.anInt1640) {
					this.anInt1643 += 5;
					if (this.anInt1643 >= 100) {
						this.method1087();
						this.anInt1640 += 2048;
						this.aLong110 = arg0;
						return;
					}
				} else if (local58 != this.anInt1636 && this.anInt1643 > 0) {
					this.anInt1643--;
				}
			}
			this.anInt1636 = local58;
			if (local58 < this.anInt1641) {
				break;
			}
			Static107.method1663(Static40.anIntArray337, 256);
			try {
				this.method1083();
			} catch (@Pc(165) Exception local165) {
				this.method1087();
				this.aLong110 = arg0;
				return;
			}
			this.aLong109 = arg0;
			this.anInt1636 -= 256;
		}
		if (arg0 < this.aLong109 + 5000L) {
			return;
		}
		this.method1087();
		this.aLong110 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray336[local58] = 0;
		}
		this.anInt1639 = this.anInt1637 = this.anInt1642 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	@Override
	public final void method1656() {
		synchronized (this) {
			this.aBoolean132 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean132) {
					return;
				}
			}
			Static94.method1494(50L);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1654(@OriginalArg(0) long arg0) {
		this.method1085(arg0);
		if (this.aLong111 < arg0) {
			this.aLong111 = arg0;
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
	protected abstract void method1087();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!bb;I)V")
	public final void method1088(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1640 = arg1;
		this.method1084(System.currentTimeMillis());
		arg0.method207(10, this);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	protected abstract void method1089(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "()I")
	protected abstract int method1090() throws Exception;

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean132) {
						if (this.aLong110 == 0L) {
							this.method1087();
						}
						this.aBoolean132 = false;
						return;
					}
					this.method1654(System.currentTimeMillis());
				}
				Static94.method1494(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static38.method727(null, local33);
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	private void method1091(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1641;
		@Pc(10) int local10 = this.anIntArray336[this.anInt1638];
		this.anIntArray336[this.anInt1638] = local4;
		this.anInt1642 += local4 - local10;
		@Pc(31) int local31 = this.anInt1638 + 1 & 0x1FF;
		if (local4 > this.anInt1637) {
			this.anInt1637 = local4;
		}
		if (local4 < this.anInt1639) {
			this.anInt1639 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1637) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1638 && local51 < this.anInt1637; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray336[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1637 = local51;
		}
		if (local10 == this.anInt1639) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1638 && local51 > this.anInt1639; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray336[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1639 = local51;
		}
		this.anInt1638 = local31;
	}
}
