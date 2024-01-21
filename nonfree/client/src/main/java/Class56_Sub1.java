import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!re", name = "yb", descriptor = "I")
	private int anInt2339;

	@OriginalMember(owner = "client!re", name = "Cb", descriptor = "I")
	private int anInt2341;

	@OriginalMember(owner = "client!re", name = "Ob", descriptor = "[Z")
	private volatile boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!re", name = "sb", descriptor = "I")
	private int anInt2334 = -1;

	@OriginalMember(owner = "client!re", name = "nb", descriptor = "Z")
	private volatile boolean aBoolean96 = false;

	@OriginalMember(owner = "client!re", name = "Xb", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!re", name = "Mb", descriptor = "Lclient!fb;")
	private final Class24 aClass24_2;

	@OriginalMember(owner = "client!re", name = "Bb", descriptor = "Lclient!fb;")
	private final Class24 aClass24_1;

	@OriginalMember(owner = "client!re", name = "Ub", descriptor = "I")
	private final int anInt2354;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!fb;Lclient!fb;IZZZ)V")
	public Class56_Sub1(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean97 = arg5;
		this.aClass24_2 = arg0;
		this.aClass24_1 = arg1;
		this.anInt2354 = arg2;
		Static2.method66(this.anInt2354, this);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZII)V")
	public void method1693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2339 = arg0;
		this.anInt2341 = arg1;
		if (this.aClass24_1 == null) {
			Static30.method603(this, this.anInt2341, (byte) 0, 255, this.anInt2354, true);
		} else {
			Static127.method1943(this, this.aClass24_1, this.anInt2354);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	private void method1694() {
		this.aBooleanArray17 = new boolean[super.anObjectArray3.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray17.length; local13++) {
			this.aBooleanArray17[local13] = false;
		}
		if (this.aClass24_2 == null) {
			this.aBoolean96 = true;
			return;
		}
		this.anInt2334 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray17.length; local38++) {
			if (super.anIntArray300[local38] > 0) {
				Static86.method1386(this.aClass24_2, local38, this);
				this.anInt2334 = local38;
			}
		}
		if (this.anInt2334 == -1) {
			this.aBoolean96 = true;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)I")
	public int method1695() {
		if (this.aBoolean96) {
			return 100;
		} else if (super.anObjectArray3 == null) {
			@Pc(19) int local19 = Static106.method1719(this.anInt2354, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BBZLclient!fb;)V")
	public void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class24 arg3) {
		@Pc(61) int local61;
		if (this.aClass24_1 != arg3) {
			if (!arg2 && arg0 == this.anInt2334) {
				this.aBoolean96 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray17[arg0] = false;
				if (this.aBoolean97 || arg2) {
					Static30.method603(this, super.anIntArray299[arg0], (byte) 2, this.anInt2354, arg0, arg2);
				}
			} else {
				Static82.aCRC32_3.reset();
				Static82.aCRC32_3.update(arg1, 0, arg1.length - 2);
				local61 = (int) Static82.aCRC32_3.getValue();
				@Pc(81) int local81 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (super.anIntArray299[arg0] == local61 && super.anIntArray296[arg0] == local81) {
					this.aBooleanArray17[arg0] = true;
					if (arg2) {
						super.anObjectArray3[arg0] = Static33.method628(arg1);
					}
				} else {
					this.aBooleanArray17[arg0] = false;
					if (this.aBoolean97 || arg2) {
						Static30.method603(this, super.anIntArray299[arg0], (byte) 2, this.anInt2354, arg0, arg2);
					}
				}
			}
		} else if (this.aBoolean96) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static30.method603(this, this.anInt2341, (byte) 0, 255, this.anInt2354, true);
		} else {
			Static82.aCRC32_3.reset();
			Static82.aCRC32_3.update(arg1, 0, arg1.length);
			local61 = (int) Static82.aCRC32_3.getValue();
			@Pc(176) Class2_Sub4 local176 = new Class2_Sub4(Static112.method1818(arg1));
			@Pc(180) int local180 = local176.method933();
			if (local180 != 5 && local180 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local180);
			}
			@Pc(201) int local201 = 0;
			if (local180 >= 6) {
				local201 = local176.method903();
			}
			if (this.anInt2341 == local61 && local201 == this.anInt2339) {
				this.method1677(arg1);
				this.method1694();
			} else {
				Static30.method603(this, this.anInt2341, (byte) 0, 255, this.anInt2354, true);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1676(@OriginalArg(0) int arg0) {
		if (this.aClass24_2 == null || this.aBooleanArray17 == null || !this.aBooleanArray17[arg0]) {
			Static30.method603(this, super.anIntArray299[arg0], (byte) 2, this.anInt2354, arg0, true);
		} else {
			Static127.method1943(this, this.aClass24_2, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
	public int method1699() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray3.length; local11++) {
			if (super.anIntArray300[local11] > 0) {
				local9 += 100;
				local7 += this.method1702(local11);
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local7 * 100 / local9;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)I")
	private int method1702(@OriginalArg(1) int arg0) {
		if (super.anObjectArray3[arg0] == null) {
			return this.aBooleanArray17[arg0] ? 100 : Static106.method1719(arg0, this.anInt2354);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	@Override
	protected void method1687(@OriginalArg(0) int arg0) {
		Static76.method1283(arg0, this.anInt2354);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[BBIZ)V")
	public void method1705(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray296[arg2] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray296[arg2];
			if (this.aClass24_2 != null) {
				Static22.method356(arg2, this.aClass24_2, arg1);
				this.aBooleanArray17[arg2] = true;
			}
			if (arg0) {
				super.anObjectArray3[arg2] = Static33.method628(arg1);
			}
		} else if (this.aBoolean96) {
			throw new RuntimeException();
		} else {
			if (this.aClass24_1 != null) {
				Static22.method356(this.anInt2354, this.aClass24_1, arg1);
			}
			this.method1677(arg1);
			this.method1694();
		}
	}
}
