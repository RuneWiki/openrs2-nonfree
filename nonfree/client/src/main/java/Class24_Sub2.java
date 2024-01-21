import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public abstract class Class24_Sub2 extends Class24 implements Runnable {

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	private int anInt1628;

	@OriginalMember(owner = "client!h", name = "I", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	private int anInt1634;

	@OriginalMember(owner = "client!h", name = "K", descriptor = "I")
	private int anInt1635;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "I")
	private int anInt1629 = 256;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "I")
	private int anInt1632 = 0;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "I")
	private int anInt1630 = 0;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	private int anInt1631 = 0;

	@OriginalMember(owner = "client!h", name = "H", descriptor = "I")
	private int anInt1633 = 0;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "[I")
	private final int[] anIntArray216 = new int[512];

	@OriginalMember(owner = "client!h", name = "L", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "J")
	private long aLong43 = 0L;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	protected Class24_Sub2(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(J)V")
	private void method1139(@OriginalArg(0) long arg0) {
		if (this.aLong43 != 0L) {
			while (true) {
				if (this.aLong42 >= arg0) {
					if (arg0 < this.aLong43) {
						return;
					}
					try {
						this.method1144(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1142();
						this.aLong43 += 5000L;
						return;
					}
					this.aLong43 = 0L;
					break;
				}
				Static60.method1130();
				this.aLong42 += 256000 / Static57.anInt1657;
			}
		}
		@Pc(58) int local58;
		while (this.aLong42 < arg0) {
			this.aLong42 += 250880 / Static57.anInt1657;
			try {
				local58 = this.method1140();
			} catch (@Pc(60) Exception local60) {
				this.method1142();
				this.aLong43 = arg0;
				return;
			}
			this.method1145(local58);
			@Pc(81) int local81 = this.anInt1632 * 3 / 512 - this.anInt1630 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1633) {
				local81 = this.anInt1633;
			}
			this.anInt1629 = this.anInt1634 - local81 - 256;
			if (this.anInt1629 < 256) {
				this.anInt1629 = 256;
			}
			if (this.anInt1634 < 16384) {
				if (local58 >= this.anInt1634) {
					this.anInt1628 += 5;
					if (this.anInt1628 >= 100) {
						this.method1142();
						this.anInt1634 += 2048;
						this.aLong43 = arg0;
						return;
					}
				} else if (local58 != this.anInt1635 && this.anInt1628 > 0) {
					this.anInt1628--;
				}
			}
			this.anInt1635 = local58;
			if (local58 < this.anInt1629) {
				break;
			}
			Static60.method1128(Static36.anIntArray217, 256);
			try {
				this.method1146();
			} catch (@Pc(165) Exception local165) {
				this.method1142();
				this.aLong43 = arg0;
				return;
			}
			this.aLong44 = arg0;
			this.anInt1635 -= 256;
		}
		if (arg0 < this.aLong44 + 5000L) {
			return;
		}
		this.method1142();
		this.aLong43 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray216[local58] = 0;
		}
		this.anInt1630 = this.anInt1633 = this.anInt1632 = 0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	protected abstract int method1140() throws Exception;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()V")
	protected abstract void method1142();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	protected abstract void method1143(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1136(@OriginalArg(0) long arg0) {
		this.method1139(arg0);
		if (this.aLong42 < arg0) {
			this.aLong42 = arg0;
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(J)V")
	private void method1144(@OriginalArg(0) long arg0) throws Exception {
		this.method1143(this.anInt1634);
		while (true) {
			@Pc(6) int local6 = this.method1140();
			if (local6 < this.anInt1629) {
				this.anInt1628 = 0;
				this.anInt1635 = 0;
				this.aLong42 = arg0;
				this.aLong44 = arg0;
				return;
			}
			this.method1146();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	private void method1145(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1629;
		@Pc(10) int local10 = this.anIntArray216[this.anInt1631];
		this.anIntArray216[this.anInt1631] = local4;
		this.anInt1632 += local4 - local10;
		@Pc(31) int local31 = this.anInt1631 + 1 & 0x1FF;
		if (local4 > this.anInt1633) {
			this.anInt1633 = local4;
		}
		if (local4 < this.anInt1630) {
			this.anInt1630 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1633) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1631 && local51 < this.anInt1633; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray216[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1633 = local51;
		}
		if (local10 == this.anInt1630) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1631 && local51 > this.anInt1630; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray216[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1630 = local51;
		}
		this.anInt1631 = local31;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public final void method1133() {
		synchronized (this) {
			this.aBoolean88 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean88) {
					return;
				}
			}
			Static51.method1782(50L);
		}
	}

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean88) {
						if (this.aLong43 == 0L) {
							this.method1142();
						}
						this.aBoolean88 = false;
						return;
					}
					this.method1136(System.currentTimeMillis());
				}
				Static51.method1782(5L);
			}
		} catch (@Pc(33) Exception local33) {
			Static108.method2075(local33, null);
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	protected abstract void method1146() throws Exception;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!cc;I)V")
	public final void method1147(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1634 = arg1;
		this.method1144(System.currentTimeMillis());
		arg0.method324(this, 10);
	}
}
