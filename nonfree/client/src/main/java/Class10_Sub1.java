import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!t", name = "yb", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
	private int anInt2568 = -1;

	@OriginalMember(owner = "client!t", name = "xb", descriptor = "Z")
	private volatile boolean aBoolean111 = false;

	@OriginalMember(owner = "client!t", name = "kb", descriptor = "Lclient!nf;")
	private final Class56 aClass56_53;

	@OriginalMember(owner = "client!t", name = "ob", descriptor = "Lclient!nf;")
	private final Class56 aClass56_54;

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "I")
	private final int anInt2573;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!nf;Lclient!nf;IZZZ)V")
	public Class10_Sub1(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean110 = arg5;
		this.aClass56_53 = arg0;
		this.aClass56_54 = arg1;
		this.anInt2573 = arg2;
		Static27.method460(this, this.anInt2573);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1764(@OriginalArg(1) int arg0) {
		Static112.method1855(this.anInt2573, arg0);
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	private void method1787() {
		this.aBooleanArray16 = new boolean[super.anObjectArray27.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray16.length; local9++) {
			this.aBooleanArray16[local9] = false;
		}
		if (this.aClass56_53 == null) {
			this.aBoolean111 = true;
			return;
		}
		this.anInt2568 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray16.length; local38++) {
			if (super.anIntArray327[local38] > 0) {
				Static46.method640(this, local38, this.aClass56_53);
				this.anInt2568 = local38;
			}
		}
		if (this.anInt2568 == -1) {
			this.aBoolean111 = true;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)I")
	public int method1789() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray27.length; local11++) {
			if (super.anIntArray327[local11] > 0) {
				local7 += this.method1792(local11);
				local9 += 100;
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local7 * 100 / local9;
		}
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(II)I")
	private int method1792(@OriginalArg(0) int arg0) {
		if (super.anObjectArray27[arg0] == null) {
			return this.aBooleanArray16[arg0] ? 100 : Static74.method1239(this.anInt2573, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)I")
	public int method1793() {
		if (this.aBoolean111) {
			return 100;
		} else if (super.anObjectArray27 == null) {
			@Pc(19) int local19 = Static74.method1239(255, this.anInt2573);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BIZZI)V")
	public void method1794(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg1) {
			if (this.aBoolean111) {
				throw new RuntimeException();
			}
			if (this.aClass56_54 != null) {
				Static52.method861(this.aClass56_54, this.anInt2573, arg0);
			}
			this.method1779(arg0);
			this.method1787();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray329[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray329[arg3];
		if (this.aClass56_53 != null) {
			Static52.method861(this.aClass56_53, arg3, arg0);
			this.aBooleanArray16[arg3] = true;
		}
		if (arg2) {
			super.anObjectArray27[arg3] = Static47.method647(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BIIZLclient!nf;)V")
	public void method1795(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class56 arg3) {
		@Pc(63) int local63;
		if (this.aClass56_54 != arg3) {
			if (!arg2 && this.anInt2568 == arg1) {
				this.aBoolean111 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray16[arg1] = false;
				if (this.aBoolean110 || arg2) {
					Static99.method340(this.anInt2573, super.anIntArray326[arg1], arg1, (byte) 2, this, arg2);
				}
			} else {
				Static119.aCRC32_2.reset();
				Static119.aCRC32_2.update(arg0, 0, arg0.length - 2);
				local63 = (int) Static119.aCRC32_2.getValue();
				@Pc(83) int local83 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (super.anIntArray326[arg1] == local63 && super.anIntArray329[arg1] == local83) {
					this.aBooleanArray16[arg1] = true;
					if (arg2) {
						super.anObjectArray27[arg1] = Static47.method647(arg0);
					}
				} else {
					this.aBooleanArray16[arg1] = false;
					if (this.aBoolean110 || arg2) {
						Static99.method340(this.anInt2573, super.anIntArray326[arg1], arg1, (byte) 2, this, arg2);
					}
				}
			}
		} else if (this.aBoolean111) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static99.method340(255, this.anInt2575, this.anInt2573, (byte) 0, this, true);
		} else {
			Static119.aCRC32_2.reset();
			Static119.aCRC32_2.update(arg0, 0, arg0.length);
			local63 = (int) Static119.aCRC32_2.getValue();
			@Pc(181) Class4_Sub9 local181 = new Class4_Sub9(Static120.method1904(arg0));
			@Pc(185) int local185 = local181.method773();
			if (local185 != 5 && local185 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local185);
			}
			@Pc(208) int local208 = 0;
			if (local185 >= 6) {
				local208 = local181.method780();
			}
			if (local63 == this.anInt2575 && local208 == this.anInt2579) {
				this.method1779(arg0);
				this.method1787();
			} else {
				Static99.method340(255, this.anInt2575, this.anInt2573, (byte) 0, this, true);
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IBI)V")
	public void method1797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2575 = arg0;
		this.anInt2579 = arg1;
		if (this.aClass56_54 == null) {
			Static99.method340(255, this.anInt2575, this.anInt2573, (byte) 0, this, true);
		} else {
			Static25.method446(this, this.aClass56_54, this.anInt2573);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1767(@OriginalArg(0) int arg0) {
		if (this.aClass56_53 == null || this.aBooleanArray16 == null || !this.aBooleanArray16[arg0]) {
			Static99.method340(this.anInt2573, super.anIntArray326[arg0], arg0, (byte) 2, this, true);
		} else {
			Static25.method446(this, this.aClass56_53, arg0);
		}
	}
}
