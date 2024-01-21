import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public abstract class Class3_Sub2 extends Class3 implements Runnable {

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private int anInt1845;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	private int anInt1847;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	private int anInt1848;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	private int anInt1844 = 0;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	private int anInt1846 = 256;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
	private final int[] anIntArray227 = new int[512];

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	private int anInt1849 = 0;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	private int anInt1850 = 0;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
	private int anInt1851 = 0;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class3_Sub2() {
		@Pc(28) int local28 = 256;
		if (Static102.aBoolean104) {
			local28 <<= 0x1;
		}
		Static44.anIntArray226 = new int[local28];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	@Override
	public final void method1220() {
		synchronized (this) {
			this.aBoolean88 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean88) {
					break;
				}
			}
			Static23.method546(50L);
		}
		Static44.anIntArray226 = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(J)V")
	private void method1221(@OriginalArg(0) long arg0) throws Exception {
		this.method1226(this.anInt1845);
		while (true) {
			@Pc(6) int local6 = this.method1225();
			if (local6 < this.anInt1846) {
				this.anInt1848 = 0;
				this.anInt1847 = 0;
				this.aLong63 = arg0;
				this.aLong64 = arg0;
				return;
			}
			this.method1228();
		}
	}

	@OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean88) {
						if (this.aLong62 == 0L) {
							this.method1230();
						}
						this.aBoolean88 = false;
						return;
					}
					this.method1210(Static50.method959());
				}
				Static23.method546(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static93.method1558(null, local34);
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(J)V")
	private void method1222(@OriginalArg(0) long arg0) {
		if (this.aLong62 != 0L) {
			while (true) {
				if (this.aLong63 >= arg0) {
					if (arg0 < this.aLong62) {
						return;
					}
					try {
						this.method1221(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1230();
						this.aLong62 += 5000L;
						return;
					}
					this.aLong62 = 0L;
					break;
				}
				Static73.method1217();
				this.aLong63 += 256000 / Static72.anInt1825;
			}
		}
		@Pc(58) int local58;
		while (this.aLong63 < arg0) {
			this.aLong63 += 250880 / Static72.anInt1825;
			try {
				local58 = this.method1225();
			} catch (@Pc(60) Exception local60) {
				this.method1230();
				this.aLong62 = arg0;
				return;
			}
			this.method1224(local58);
			@Pc(81) int local81 = this.anInt1844 * 3 / 512 - this.anInt1850 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1849) {
				local81 = this.anInt1849;
			}
			this.anInt1846 = this.anInt1845 - local81 - 256;
			if (this.anInt1846 < 256) {
				this.anInt1846 = 256;
			}
			if (this.anInt1845 < 16384) {
				if (local58 >= this.anInt1845) {
					this.anInt1848 += 5;
					if (this.anInt1848 >= 100) {
						this.method1230();
						this.anInt1845 += 2048;
						this.aLong62 = arg0;
						return;
					}
				} else if (local58 != this.anInt1847 && this.anInt1848 > 0) {
					this.anInt1848--;
				}
			}
			this.anInt1847 = local58;
			if (local58 < this.anInt1846) {
				break;
			}
			Static73.method1215(Static44.anIntArray226, 256);
			try {
				this.method1228();
			} catch (@Pc(165) Exception local165) {
				this.method1230();
				this.aLong62 = arg0;
				return;
			}
			this.aLong64 = arg0;
			this.anInt1847 -= 256;
		}
		if (arg0 < this.aLong64 + 5000L) {
			return;
		}
		this.method1230();
		this.aLong62 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray227[local58] = 0;
		}
		this.anInt1850 = this.anInt1849 = this.anInt1844 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1210(@OriginalArg(0) long arg0) {
		this.method1222(arg0);
		if (this.aLong63 < arg0) {
			this.aLong63 = arg0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ha;I)V")
	public final void method1223(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1845 = arg1;
		this.method1221(Static50.method959());
		arg0.method774(this, 10);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	private void method1224(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1846;
		@Pc(10) int local10 = this.anIntArray227[this.anInt1851];
		this.anIntArray227[this.anInt1851] = local4;
		this.anInt1844 += local4 - local10;
		@Pc(31) int local31 = this.anInt1851 + 1 & 0x1FF;
		if (local4 > this.anInt1849) {
			this.anInt1849 = local4;
		}
		if (local4 < this.anInt1850) {
			this.anInt1850 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1849) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1851 && local51 < this.anInt1849; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray227[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1849 = local51;
		}
		if (local10 == this.anInt1850) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1851 && local51 > this.anInt1850; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray227[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1850 = local51;
		}
		this.anInt1851 = local31;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()I")
	protected abstract int method1225() throws Exception;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	protected abstract void method1226(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
	protected abstract void method1228() throws Exception;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public abstract void method1229(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "()V")
	protected abstract void method1230();
}
