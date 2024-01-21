import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public abstract class Class21_Sub1 extends Class21 implements Runnable {

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	private int anInt2769;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	private int anInt2772;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "[I")
	private final int[] anIntArray439 = new int[512];

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	private int anInt2767 = 0;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
	private int anInt2768 = 0;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
	private int anInt2771 = 256;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
	private int anInt2766 = 0;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	private int anInt2770 = 0;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "J")
	private long aLong84 = 0L;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class21_Sub1() {
		@Pc(28) int local28 = 256;
		if (Static86.aBoolean123) {
			local28 <<= 0x1;
		}
		Static29.anIntArray440 = new int[local28];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	protected abstract void method2027(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(J)V")
	private void method2028(@OriginalArg(0) long arg0) {
		if (this.aLong84 != 0L) {
			while (true) {
				if (this.aLong85 >= arg0) {
					if (arg0 < this.aLong84) {
						return;
					}
					try {
						this.method2036(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method2031();
						this.aLong84 += 5000L;
						return;
					}
					this.aLong84 = 0L;
					break;
				}
				Static25.method2025();
				this.aLong85 += 256000 / Static43.anInt980;
			}
		}
		@Pc(58) int local58;
		while (this.aLong85 < arg0) {
			this.aLong85 += 250880 / Static43.anInt980;
			try {
				local58 = this.method2029();
			} catch (@Pc(60) Exception local60) {
				this.method2031();
				this.aLong84 = arg0;
				return;
			}
			this.method2030(local58);
			@Pc(81) int local81 = this.anInt2770 * 3 / 512 - this.anInt2767 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2768) {
				local81 = this.anInt2768;
			}
			this.anInt2771 = this.anInt2769 - local81 - 256;
			if (this.anInt2771 < 256) {
				this.anInt2771 = 256;
			}
			if (this.anInt2769 < 16384) {
				if (local58 >= this.anInt2769) {
					this.anInt2765 += 5;
					if (this.anInt2765 >= 100) {
						this.method2031();
						this.anInt2769 += 2048;
						this.aLong84 = arg0;
						return;
					}
				} else if (local58 != this.anInt2772 && this.anInt2765 > 0) {
					this.anInt2765--;
				}
			}
			this.anInt2772 = local58;
			if (local58 < this.anInt2771) {
				break;
			}
			Static25.method2023(Static29.anIntArray440, 256);
			try {
				this.method2035();
			} catch (@Pc(165) Exception local165) {
				this.method2031();
				this.aLong84 = arg0;
				return;
			}
			this.aLong83 = arg0;
			this.anInt2772 -= 256;
		}
		if (arg0 < this.aLong83 + 5000L) {
			return;
		}
		this.method2031();
		this.aLong84 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray439[local58] = 0;
		}
		this.anInt2767 = this.anInt2768 = this.anInt2770 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	@Override
	public final void method2024() {
		synchronized (this) {
			this.aBoolean165 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean165) {
					break;
				}
			}
			Static117.method2058(50L);
		}
		Static29.anIntArray440 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method2021(@OriginalArg(0) long arg0) {
		this.method2028(arg0);
		if (this.aLong85 < arg0) {
			this.aLong85 = arg0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()I")
	protected abstract int method2029() throws Exception;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	private void method2030(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2771;
		@Pc(10) int local10 = this.anIntArray439[this.anInt2766];
		this.anIntArray439[this.anInt2766] = local4;
		this.anInt2770 += local4 - local10;
		@Pc(31) int local31 = this.anInt2766 + 1 & 0x1FF;
		if (local4 > this.anInt2768) {
			this.anInt2768 = local4;
		}
		if (local4 < this.anInt2767) {
			this.anInt2767 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2768) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2766 && local51 < this.anInt2768; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray439[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2768 = local51;
		}
		if (local10 == this.anInt2767) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2766 && local51 > this.anInt2767; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray439[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2767 = local51;
		}
		this.anInt2766 = local31;
	}

	@OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean165) {
						if (this.aLong84 == 0L) {
							this.method2031();
						}
						this.aBoolean165 = false;
						return;
					}
					this.method2021(Static80.method1369());
				}
				Static117.method2058(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static99.method1601(local34, null);
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	protected abstract void method2031();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public abstract void method2033(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!g;I)V")
	public final void method2034(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2769 = arg1;
		this.method2036(Static80.method1369());
		arg0.method579(10, this);
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
	protected abstract void method2035() throws Exception;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(J)V")
	private void method2036(@OriginalArg(0) long arg0) throws Exception {
		this.method2027(this.anInt2769);
		while (true) {
			@Pc(6) int local6 = this.method2029();
			if (local6 < this.anInt2771) {
				this.anInt2765 = 0;
				this.anInt2772 = 0;
				this.aLong85 = arg0;
				this.aLong83 = arg0;
				return;
			}
			this.method2035();
		}
	}
}
