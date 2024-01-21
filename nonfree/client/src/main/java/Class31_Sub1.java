import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public abstract class Class31_Sub1 extends Class31 implements Runnable {

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	private int anInt1982;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	private int anInt1984;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	private int anInt1985;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	private int anInt1981 = 0;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	private int anInt1980 = 0;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	private int anInt1983 = 0;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
	private final int[] anIntArray266 = new int[512];

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt1979 = 256;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
	private int anInt1978 = 0;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	protected Class31_Sub1(@OriginalArg(0) int arg0) throws Exception {
		super(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	protected abstract void method1182() throws Exception;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(J)V")
	private void method1183(@OriginalArg(0) long arg0) throws Exception {
		this.method1188(this.anInt1982);
		while (true) {
			@Pc(6) int local6 = this.method1189();
			if (local6 < this.anInt1979) {
				this.anInt1984 = 0;
				this.anInt1985 = 0;
				this.aLong54 = arg0;
				this.aLong55 = arg0;
				return;
			}
			this.method1182();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	@Override
	public final void method1180() {
		synchronized (this) {
			this.aBoolean104 = true;
		}
		while (true) {
			synchronized (this) {
				if (!this.aBoolean104) {
					return;
				}
			}
			Static34.method698(50L);
		}
	}

	@OriginalMember(owner = "client!ob", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			while (true) {
				synchronized (this) {
					if (this.aBoolean104) {
						if (this.aLong56 == 0L) {
							this.method1186();
						}
						this.aBoolean104 = false;
						return;
					}
					this.method1178(Static76.method1306());
				}
				Static34.method698(5L);
			}
		} catch (@Pc(34) Exception local34) {
			Static30.method573(null, local34);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!sb;I)V")
	public final void method1185(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) throws Exception {
		this.anInt1982 = arg1;
		this.method1183(Static76.method1306());
		arg0.method1628(this, 10);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	protected abstract void method1186();

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(J)V")
	private void method1187(@OriginalArg(0) long arg0) {
		if (this.aLong56 != 0L) {
			while (true) {
				if (this.aLong54 >= arg0) {
					if (arg0 < this.aLong56) {
						return;
					}
					try {
						this.method1183(arg0);
					} catch (@Pc(33) Exception local33) {
						this.method1186();
						this.aLong56 += 5000L;
						return;
					}
					this.aLong56 = 0L;
					break;
				}
				Static95.method1174();
				this.aLong54 += 256000 / Static42.anInt1353;
			}
		}
		@Pc(58) int local58;
		while (this.aLong54 < arg0) {
			this.aLong54 += 250880 / Static42.anInt1353;
			try {
				local58 = this.method1189();
			} catch (@Pc(60) Exception local60) {
				this.method1186();
				this.aLong56 = arg0;
				return;
			}
			this.method1190(local58);
			@Pc(81) int local81 = this.anInt1983 * 3 / 512 - this.anInt1981 * 2;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > this.anInt1978) {
				local81 = this.anInt1978;
			}
			this.anInt1979 = this.anInt1982 - local81 - 256;
			if (this.anInt1979 < 256) {
				this.anInt1979 = 256;
			}
			if (this.anInt1982 < 16384) {
				if (local58 >= this.anInt1982) {
					this.anInt1984 += 5;
					if (this.anInt1984 >= 100) {
						this.method1186();
						this.anInt1982 += 2048;
						this.aLong56 = arg0;
						return;
					}
				} else if (local58 != this.anInt1985 && this.anInt1984 > 0) {
					this.anInt1984--;
				}
			}
			this.anInt1985 = local58;
			if (local58 < this.anInt1979) {
				break;
			}
			Static95.method1177(Static72.anIntArray267, 256);
			try {
				this.method1182();
			} catch (@Pc(165) Exception local165) {
				this.method1186();
				this.aLong56 = arg0;
				return;
			}
			this.aLong55 = arg0;
			this.anInt1985 -= 256;
		}
		if (arg0 < this.aLong55 + 5000L) {
			return;
		}
		this.method1186();
		this.aLong56 = arg0;
		for (local58 = 0; local58 < 512; local58++) {
			this.anIntArray266[local58] = 0;
		}
		this.anInt1981 = this.anInt1978 = this.anInt1983 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	protected abstract void method1188(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "()I")
	protected abstract int method1189() throws Exception;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	private void method1190(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1979;
		@Pc(10) int local10 = this.anIntArray266[this.anInt1980];
		this.anIntArray266[this.anInt1980] = local4;
		this.anInt1983 += local4 - local10;
		@Pc(31) int local31 = this.anInt1980 + 1 & 0x1FF;
		if (local4 > this.anInt1978) {
			this.anInt1978 = local4;
		}
		if (local4 < this.anInt1981) {
			this.anInt1981 = local4;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(59) int local59;
		if (local10 == this.anInt1978) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1980 && local51 < this.anInt1978; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray266[local53];
				if (local59 > local51) {
					local51 = local59;
				}
			}
			this.anInt1978 = local51;
		}
		if (local10 == this.anInt1981) {
			local51 = local4;
			for (local53 = local31; local53 != this.anInt1980 && local51 > this.anInt1981; local53 = local53 + 1 & 0x1FF) {
				local59 = this.anIntArray266[local53];
				if (local59 < local51) {
					local51 = local59;
				}
			}
			this.anInt1981 = local51;
		}
		this.anInt1980 = local31;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(J)V")
	@Override
	public final synchronized void method1178(@OriginalArg(0) long arg0) {
		this.method1187(arg0);
		if (this.aLong54 < arg0) {
			this.aLong54 = arg0;
		}
	}
}
