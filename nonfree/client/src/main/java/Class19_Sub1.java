import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class19_Sub1 extends Class19 implements Runnable {

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	private int anInt1796;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	private int anInt1800;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	private int anInt1795 = 0;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	private int anInt1797 = 0;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "[I")
	private final int[] anIntArray227 = new int[512];

	@OriginalMember(owner = "client!f", name = "C", descriptor = "I")
	private int anInt1801 = 0;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	private int anInt1799 = 0;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	private int anInt1802 = 256;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class19_Sub1() {
		@Pc(28) int local28 = 256;
		if (Static35.aBoolean50) {
			local28 <<= 0x1;
		}
		Static28.anIntArray226 = new int[local28];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	protected abstract int method1263() throws Exception;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!c;I)V")
	public final void method1264(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1798 = arg1;
		this.method1269(Static66.method1158());
		arg0.method237(10, this);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1259(@OriginalArg(0) long arg0) {
		this.method1272(arg0);
		if (this.aLong53 < arg0) {
			this.aLong53 = arg0;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	private void method1265(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1802;
		@Pc(10) int local10 = this.anIntArray227[this.anInt1801];
		this.anIntArray227[this.anInt1801] = local4;
		this.anInt1795 += local4 - local10;
		@Pc(31) int local31 = this.anInt1801 + 1 & 0x1FF;
		if (local4 > this.anInt1799) {
			this.anInt1799 = local4;
		}
		if (local4 < this.anInt1797) {
			this.anInt1797 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1799) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1801 && local51 < this.anInt1799; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray227[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1799 = local51;
		}
		if (local10 == this.anInt1797) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1801 && local51 > this.anInt1797; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray227[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1797 = local51;
		}
		this.anInt1801 = local31;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
	protected abstract void method1266() throws Exception;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	@Override
	public final void method1262() {
		synchronized (this) {
			this.aBoolean78 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean78) {
					break;
				}
			}
			Static68.method1173(50L);
		}
		Static28.anIntArray226 = null;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	protected abstract void method1268(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(J)V")
	private void method1269(@OriginalArg(0) long arg0) throws Exception {
		this.method1268(this.anInt1798);
		while (true) {
			@Pc(6) int local6 = this.method1263();
			if (local6 < this.anInt1802) {
				this.anInt1800 = 0;
				this.anInt1796 = 0;
				this.aLong53 = arg0;
				this.aLong54 = arg0;
				return;
			}
			this.method1266();
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	protected abstract void method1270();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public abstract void method1271(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(J)V")
	private void method1272(@OriginalArg(0) long arg0) {
		if (this.aLong55 != 0L) {
			while (true) {
				if (this.aLong53 >= arg0) {
					if (arg0 < this.aLong55) {
						return;
					}
					try {
						this.method1269(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1270();
						this.aLong55 += 5000L;
						return;
					}
					this.aLong55 = 0L;
					break;
				}
				Static115.method1257();
				this.aLong53 += 256000 / Static3.anInt1282;
			}
		}
		@Pc(58) int local58;
		while (this.aLong53 < arg0) {
			this.aLong53 += 250880 / Static3.anInt1282;
			try {
				local58 = this.method1263();
			} catch (@Pc(60) Exception local60) {
				this.method1270();
				this.aLong55 = arg0;
				return;
			}
			this.method1265(local58);
			@Pc(81) int local81 = this.anInt1795 * 3 / 512 - this.anInt1797 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1799) {
				local81 = this.anInt1799;
			}
			this.anInt1802 = this.anInt1798 - local81 - 256;
			if (this.anInt1802 < 256) {
				this.anInt1802 = 256;
			}
			if (this.anInt1798 < 16384) {
				if (local58 >= this.anInt1798) {
					this.anInt1800 += 5;
					if (this.anInt1800 >= 100) {
						this.method1270();
						this.anInt1798 += 2048;
						this.aLong55 = arg0;
						return;
					}
				} else if (local58 != this.anInt1796 && this.anInt1800 > 0) {
					this.anInt1800--;
				}
			}
			this.anInt1796 = local58;
			if (local58 < this.anInt1802) {
				break;
			}
			Static115.method1260(Static28.anIntArray226, 256);
			try {
				this.method1266();
			} catch (@Pc(165) Exception local165) {
				this.method1270();
				this.aLong55 = arg0;
				return;
			}
			this.aLong54 = arg0;
			this.anInt1796 -= 256;
		}
		if (arg0 < this.aLong54 + 5000L) {
			return;
		}
		this.method1270();
		this.aLong55 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray227[local58] = 0;
		}
		this.anInt1797 = this.anInt1799 = this.anInt1795 = 0;
	}

	@OriginalMember(owner = "client!f", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean78) {
						if (this.aLong55 == 0L) {
							this.method1270();
						}
						this.aBoolean78 = false;
						return;
					}
					this.method1259(Static66.method1158());
				}
				Static68.method1173(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static90.method1648(local34, null);
		}
	}
}
