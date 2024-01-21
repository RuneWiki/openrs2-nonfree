import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class15_Sub1 extends Class15 implements Runnable {

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
	private int anInt2081;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
	private int anInt2082;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
	private int anInt2084;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	private int anInt2079 = 0;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
	private int anInt2080 = 0;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt2083 = 0;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	private int anInt2078 = 0;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
	private final int[] anIntArray232 = new int[512];

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
	private int anInt2085 = 256;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class15_Sub1() {
		@Pc(28) int local28 = 256;
		if (Static106.aBoolean147) {
			local28 <<= 0x1;
		}
		Static77.anIntArray231 = new int[local28];
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	private void method1348(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2085;
		@Pc(10) int local10 = this.anIntArray232[this.anInt2080];
		this.anIntArray232[this.anInt2080] = local4;
		this.anInt2083 += local4 - local10;
		@Pc(31) int local31 = this.anInt2080 + 1 & 0x1FF;
		if (local4 > this.anInt2079) {
			this.anInt2079 = local4;
		}
		if (local4 < this.anInt2078) {
			this.anInt2078 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt2079) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2080 && local51 < this.anInt2079; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray232[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt2079 = local51;
		}
		if (local10 == this.anInt2078) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt2080 && local51 > this.anInt2078; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray232[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt2078 = local51;
		}
		this.anInt2080 = local31;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(J)V")
	private void method1349(@OriginalArg(0) long arg0) {
		if (this.aLong63 != 0L) {
			while (true) {
				if (this.aLong62 >= arg0) {
					if (arg0 < this.aLong63) {
						return;
					}
					try {
						this.method1356(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1357();
						this.aLong63 += 5000L;
						return;
					}
					this.aLong63 = 0L;
					break;
				}
				Static14.method1911();
				this.aLong62 += 256000 / Static17.anInt610;
			}
		}
		@Pc(58) int local58;
		while (this.aLong62 < arg0) {
			this.aLong62 += 250880 / Static17.anInt610;
			try {
				local58 = this.method1354();
			} catch (@Pc(60) Exception local60) {
				this.method1357();
				this.aLong63 = arg0;
				return;
			}
			this.method1348(local58);
			@Pc(81) int local81 = this.anInt2083 * 3 / 512 - this.anInt2078 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt2079) {
				local81 = this.anInt2079;
			}
			this.anInt2085 = this.anInt2082 - local81 - 256;
			if (this.anInt2085 < 256) {
				this.anInt2085 = 256;
			}
			if (this.anInt2082 < 16384) {
				if (local58 >= this.anInt2082) {
					this.anInt2081 += 5;
					if (this.anInt2081 >= 100) {
						this.method1357();
						this.anInt2082 += 2048;
						this.aLong63 = arg0;
						return;
					}
				} else if (local58 != this.anInt2084 && this.anInt2081 > 0) {
					this.anInt2081--;
				}
			}
			this.anInt2084 = local58;
			if (local58 < this.anInt2085) {
				break;
			}
			Static14.method1907(Static77.anIntArray231, 256);
			try {
				this.method1352();
			} catch (@Pc(165) Exception local165) {
				this.method1357();
				this.aLong63 = arg0;
				return;
			}
			this.aLong64 = arg0;
			this.anInt2084 -= 256;
		}
		if (arg0 < this.aLong64 + 5000L) {
			return;
		}
		this.method1357();
		this.aLong63 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray232[local58] = 0;
		}
		this.anInt2078 = this.anInt2079 = this.anInt2083 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ed;I)V")
	public final void method1350(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt2082 = arg1;
		this.method1356(Static3.method125());
		arg0.method520(this, 10);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	protected abstract void method1352() throws Exception;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public final void method1904() {
		synchronized (this) {
			this.aBoolean99 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean99) {
					break;
				}
			}
			Static74.method1220(50L);
		}
		Static77.anIntArray231 = null;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	protected abstract void method1353(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
	protected abstract int method1354() throws Exception;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
	public abstract void method1355(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean99) {
						if (this.aLong63 == 0L) {
							this.method1357();
						}
						this.aBoolean99 = false;
						return;
					}
					this.method1910(Static3.method125());
				}
				Static74.method1220(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static69.method1187(local34, null);
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(J)V")
	private void method1356(@OriginalArg(0) long arg0) throws Exception {
		this.method1353(this.anInt2082);
		while (true) {
			@Pc(6) int local6 = this.method1354();
			if (local6 < this.anInt2085) {
				this.anInt2081 = 0;
				this.anInt2084 = 0;
				this.aLong62 = arg0;
				this.aLong64 = arg0;
				return;
			}
			this.method1352();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1910(@OriginalArg(0) long arg0) {
		this.method1349(arg0);
		if (this.aLong62 < arg0) {
			this.aLong62 = arg0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	protected abstract void method1357();
}
