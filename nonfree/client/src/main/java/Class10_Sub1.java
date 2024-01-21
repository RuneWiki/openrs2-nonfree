import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "[Z")
	private volatile boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	private int anInt2448;

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	private int anInt2449;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "Z")
	private volatile boolean aBoolean95 = false;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
	private int anInt2450 = -1;

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lclient!je;")
	private final Class40 aClass40_2;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!je;")
	private final Class40 aClass40_3;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	private final int anInt2439;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!je;Lclient!je;IZZZ)V")
	public Class10_Sub1(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass40_2 = arg0;
		this.aBoolean96 = arg5;
		this.aClass40_3 = arg1;
		this.anInt2439 = arg2;
		Static87.method1471(this, this.anInt2439);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method1598(@OriginalArg(1) int arg0) {
		if (this.aClass40_2 == null || this.aBooleanArray6 == null || !this.aBooleanArray6[arg0]) {
			Static84.method1453(super.anIntArray189[arg0], this.anInt2439, true, (byte) 2, this, arg0);
		} else {
			Static102.method1694(this, arg0, this.aClass40_2);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)I")
	private int method1606(@OriginalArg(1) int arg0) {
		if (super.anObjectArray3[arg0] == null) {
			return this.aBooleanArray6[arg0] ? 100 : Static39.method706(this.anInt2439, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BZLclient!je;I)V")
	public void method1608(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class40 arg3) {
		@Pc(67) int local67;
		if (this.aClass40_3 != arg3) {
			if (!arg2 && this.anInt2450 == arg0) {
				this.aBoolean95 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray6[arg0] = false;
				if (this.aBoolean96 || arg2) {
					Static84.method1453(super.anIntArray189[arg0], this.anInt2439, arg2, (byte) 2, this, arg0);
				}
			} else {
				Static170.aCRC32_2.reset();
				Static170.aCRC32_2.update(arg1, 0, arg1.length - 2);
				local67 = (int) Static170.aCRC32_2.getValue();
				@Pc(88) int local88 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (local67 == super.anIntArray189[arg0] && local88 == super.anIntArray187[arg0]) {
					this.aBooleanArray6[arg0] = true;
					if (arg2) {
						super.anObjectArray3[arg0] = Static10.method161(arg1);
					}
				} else {
					this.aBooleanArray6[arg0] = false;
					if (this.aBoolean96 || arg2) {
						Static84.method1453(super.anIntArray189[arg0], this.anInt2439, arg2, (byte) 2, this, arg0);
					}
				}
			}
		} else if (this.aBoolean95) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static84.method1453(this.anInt2449, 255, true, (byte) 0, this, this.anInt2439);
		} else {
			Static170.aCRC32_2.reset();
			Static170.aCRC32_2.update(arg1, 0, arg1.length);
			local67 = (int) Static170.aCRC32_2.getValue();
			@Pc(180) Class2_Sub13 local180 = new Class2_Sub13(Static160.method420(arg1));
			@Pc(184) int local184 = local180.method1402();
			if (local184 != 5 && local184 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local184);
			}
			@Pc(205) int local205 = 0;
			if (local184 >= 6) {
				local205 = local180.method1396();
			}
			if (local67 == this.anInt2449 && this.anInt2448 == local205) {
				this.method1583(arg1);
				this.method1609();
			} else {
				Static84.method1453(this.anInt2449, 255, true, (byte) 0, this, this.anInt2439);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	private void method1609() {
		this.aBooleanArray6 = new boolean[super.anObjectArray3.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray6.length; local9++) {
			this.aBooleanArray6[local9] = false;
		}
		if (this.aClass40_2 == null) {
			this.aBoolean95 = true;
			return;
		}
		this.anInt2450 = -1;
		for (@Pc(44) int local44 = 0; local44 < this.aBooleanArray6.length; local44++) {
			if (super.anIntArray190[local44] > 0) {
				Static85.method1462(this.aClass40_2, this, local44);
				this.anInt2450 = local44;
			}
		}
		if (this.anInt2450 == -1) {
			this.aBoolean95 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2448 = arg1;
		this.anInt2449 = arg0;
		if (this.aClass40_3 == null) {
			Static84.method1453(this.anInt2449, 255, true, (byte) 0, this, this.anInt2439);
		} else {
			Static102.method1694(this, this.anInt2439, this.aClass40_3);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	public int method1612() {
		if (this.aBoolean95) {
			return 100;
		} else if (super.anObjectArray3 == null) {
			@Pc(19) int local19 = Static39.method706(255, this.anInt2439);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)I")
	public int method1613() {
		@Pc(3) int local3 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < super.anObjectArray3.length; local17++) {
			if (super.anIntArray190[local17] > 0) {
				local3 += 100;
				local15 += this.method1606(local17);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local15 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZZBI)V")
	public void method1614(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg2) {
			if (this.aBoolean95) {
				throw new RuntimeException();
			}
			if (this.aClass40_3 != null) {
				Static72.method1127(this.anInt2439, arg0, this.aClass40_3);
			}
			this.method1583(arg0);
			this.method1609();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray187[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray187[arg3];
		if (this.aClass40_2 != null) {
			Static72.method1127(arg3, arg0, this.aClass40_2);
			this.aBooleanArray6[arg3] = true;
		}
		if (arg1) {
			super.anObjectArray3[arg3] = Static10.method161(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1594(@OriginalArg(0) int arg0) {
		Static149.method2284(arg0, this.anInt2439);
	}
}
