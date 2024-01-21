import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "[Z")
	private volatile boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
	private int anInt2857;

	@OriginalMember(owner = "client!vb", name = "fb", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "Z")
	private volatile boolean aBoolean155 = false;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	private int anInt2855 = -1;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "Lclient!ba;")
	private final Class8 aClass8_3;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lclient!ba;")
	private final Class8 aClass8_4;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
	private final int anInt2854;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ba;Lclient!ba;IZZZ)V")
	public Class11_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass8_3 = arg0;
		this.aBoolean154 = arg5;
		this.aClass8_4 = arg1;
		this.anInt2854 = arg2;
		Static67.method1167(this, this.anInt2854);
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
	public int method1886() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.aByteArrayArray10.length > local11; local11++) {
			if (super.anIntArray365[local11] > 0) {
				local9 += this.method1888(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
	public void method1887(@OriginalArg(1) int arg0) {
		this.anInt2857 = arg0;
		if (this.aClass8_4 == null) {
			Static85.method1368(this.anInt2854, this, 255, true, this.anInt2857, (byte) 0);
		} else {
			Static115.method1956(this, this.aClass8_4, this.anInt2854);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method1864(@OriginalArg(1) int arg0) {
		Static34.method672(this.anInt2854, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)I")
	private int method1888(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray10[arg0] == null) {
			return this.aBooleanArray24[arg0] ? 100 : Static46.method858(this.anInt2854, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1866(@OriginalArg(1) int arg0) {
		if (this.aClass8_3 == null || this.aBooleanArray24 == null || !this.aBooleanArray24[arg0]) {
			Static85.method1368(arg0, this, this.anInt2854, true, super.anIntArray367[arg0], (byte) 2);
		} else {
			Static115.method1956(this, this.aClass8_3, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIZLclient!ba;B)V")
	public void method1890(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8 arg3) {
		@Pc(44) int local44;
		if (this.aClass8_4 != arg3) {
			if (!arg2 && this.anInt2855 == arg1) {
				this.aBoolean155 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray24[arg1] = false;
				if (this.aBoolean154 || arg2) {
					Static85.method1368(arg1, this, this.anInt2854, arg2, super.anIntArray367[arg1], (byte) 2);
				}
			} else {
				Static32.aCRC32_1.reset();
				Static32.aCRC32_1.update(arg0, 0, arg0.length - 2);
				local44 = (int) Static32.aCRC32_1.getValue();
				@Pc(143) int local143 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local44 == super.anIntArray367[arg1] && local143 == super.anIntArray366[arg1]) {
					this.aBooleanArray24[arg1] = true;
					if (arg2) {
						super.aByteArrayArray10[arg1] = arg0;
					}
				} else {
					this.aBooleanArray24[arg1] = false;
					if (this.aBoolean154 || arg2) {
						Static85.method1368(arg1, this, this.anInt2854, arg2, super.anIntArray367[arg1], (byte) 2);
					}
				}
			}
		} else if (this.aBoolean155) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static85.method1368(this.anInt2854, this, 255, true, this.anInt2857, (byte) 0);
		} else {
			Static32.aCRC32_1.reset();
			Static32.aCRC32_1.update(arg0, 0, arg0.length);
			local44 = (int) Static32.aCRC32_1.getValue();
			if (local44 == this.anInt2857) {
				this.method1885(arg0);
				this.method1895();
			} else {
				Static85.method1368(this.anInt2854, this, 255, true, this.anInt2857, (byte) 0);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BZBZI)V")
	public void method1892(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg2) {
			if (this.aBoolean155) {
				throw new RuntimeException();
			}
			if (this.aClass8_4 != null) {
				Static111.method1921(this.aClass8_4, this.anInt2854, arg0);
			}
			this.method1885(arg0);
			this.method1895();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray366[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray366[arg3];
		if (this.aClass8_3 != null) {
			Static111.method1921(this.aClass8_3, arg3, arg0);
			this.aBooleanArray24[arg3] = true;
		}
		if (arg1) {
			super.aByteArrayArray10[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
	public int method1894() {
		if (this.aBoolean155) {
			return 100;
		} else if (super.aByteArrayArray10 == null) {
			@Pc(23) int local23 = Static46.method858(255, this.anInt2854);
			if (local23 >= 100) {
				local23 = 99;
			}
			return local23;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	private void method1895() {
		this.aBooleanArray24 = new boolean[super.aByteArrayArray10.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray24.length; local9++) {
			this.aBooleanArray24[local9] = false;
		}
		if (this.aClass8_3 == null) {
			this.aBoolean155 = true;
			return;
		}
		this.anInt2855 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray24.length; local42++) {
			if (super.anIntArray365[local42] > 0) {
				Static52.method918(this.aClass8_3, this, local42);
				this.anInt2855 = local42;
			}
		}
		if (this.anInt2855 == -1) {
			this.aBoolean155 = true;
		}
	}
}
