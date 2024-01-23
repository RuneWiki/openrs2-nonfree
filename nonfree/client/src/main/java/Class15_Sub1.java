import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bj", name = "cb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bj", name = "tb", descriptor = "I")
	private int anInt582;

	@OriginalMember(owner = "client!bj", name = "vb", descriptor = "I")
	private int anInt583;

	@OriginalMember(owner = "client!bj", name = "ub", descriptor = "Z")
	private volatile boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bj", name = "ob", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bj", name = "yb", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!bj", name = "mb", descriptor = "Lclient!ud;")
	private Class96 aClass96_2;

	@OriginalMember(owner = "client!bj", name = "gb", descriptor = "I")
	private int anInt572;

	@OriginalMember(owner = "client!bj", name = "fb", descriptor = "Lclient!ud;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ud;Lclient!ud;IZZZ)V")
	public Class15_Sub1(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass96_2 = arg1;
		this.aBoolean28 = arg5;
		this.anInt572 = arg2;
		this.aClass96_1 = arg0;
		Static105.method1790(this.anInt572, this);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BZIZ)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean29) {
				throw new RuntimeException();
			}
			if (this.aClass96_2 != null) {
				Static34.method679(arg1, this.anInt572, this.aClass96_2);
			}
			this.method417(arg1);
			this.method427();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray38[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray38[arg0];
		if (this.aClass96_1 != null) {
			Static34.method679(arg1, arg0, this.aClass96_1);
			this.aBooleanArray2[arg0] = true;
		}
		if (arg2) {
			super.anObjectArray2[arg0] = Static151.method2361(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt583 = arg0;
		this.anInt582 = arg1;
		if (this.aClass96_2 == null) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
		} else {
			Static71.method1303(this, this.anInt572, this.aClass96_2);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
	@Override
	protected void method386(@OriginalArg(1) int arg0) {
		if (this.method418(arg0)) {
			Static54.method1057(this.anInt572, arg0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BILclient!ud;BZ)V")
	public void method426(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(71) int local71;
		if (arg2 != this.aClass96_2) {
			if (!arg3 && arg1 == this.anInt585) {
				this.aBoolean29 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray2[arg1] = false;
				if (this.aBoolean28 || arg3) {
					Static166.method2402(this, arg1, this.anInt572, (byte) 2, super.anIntArray42[arg1], arg3);
				}
				return;
			}
			Static200.aCRC32_2.reset();
			Static200.aCRC32_2.update(arg0, 0, arg0.length - 2);
			local71 = (int) Static200.aCRC32_2.getValue();
			@Pc(92) int local92 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (local71 != super.anIntArray42[arg1] || super.anIntArray38[arg1] != local92) {
				this.aBooleanArray2[arg1] = false;
				if (this.aBoolean28 || arg3) {
					Static166.method2402(this, arg1, this.anInt572, (byte) 2, super.anIntArray42[arg1], arg3);
				}
				return;
			}
			this.aBooleanArray2[arg1] = true;
			if (arg3) {
				super.anObjectArray2[arg1] = Static151.method2361(arg0);
				return;
			}
			return;
		}
		if (this.aBoolean29) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
			return;
		}
		Static200.aCRC32_2.reset();
		Static200.aCRC32_2.update(arg0, 0, arg0.length);
		local71 = (int) Static200.aCRC32_2.getValue();
		if (local71 != this.anInt583) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
			return;
		}
		@Pc(197) Class2_Sub3 local197;
		try {
			local197 = new Class2_Sub3(Static21.method3202(arg0));
		} catch (@Pc(199) RuntimeException local199) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
			return;
		}
		@Pc(214) int local214 = local197.method209();
		if (local214 != 5 && local214 != 6) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
			return;
		}
		@Pc(235) int local235 = 0;
		if (local214 >= 6) {
			local235 = local197.method185();
		}
		if (this.anInt582 != local235) {
			Static166.method2402(this, this.anInt572, 255, (byte) 0, this.anInt583, true);
			return;
		}
		this.method417(arg0);
		this.method427();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method405(@OriginalArg(0) int arg0) {
		if (!this.method418(arg0)) {
			return;
		}
		if (this.aClass96_1 == null || this.aBooleanArray2 == null || !this.aBooleanArray2[arg0]) {
			Static166.method2402(this, arg0, this.anInt572, (byte) 2, super.anIntArray42[arg0], true);
		} else {
			Static71.method1303(this, arg0, this.aClass96_1);
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	private void method427() {
		this.aBooleanArray2 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray2.length; local13++) {
			this.aBooleanArray2[local13] = false;
		}
		if (this.aClass96_1 == null) {
			this.aBoolean29 = true;
			return;
		}
		this.anInt585 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray2.length; local48++) {
			if (super.anIntArray41[local48] > 0) {
				Static108.method1831(local48, this, this.aClass96_1);
				this.anInt585 = local48;
			}
		}
		if (this.anInt585 == -1) {
			this.aBoolean29 = true;
		}
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(Z)I")
	public int method429() {
		if (this.aBoolean29) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static202.method1217(255, this.anInt572);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)I")
	@Override
	protected int method403(@OriginalArg(1) int arg0) {
		if (!this.method418(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray2[arg0] ? 100 : Static202.method1217(this.anInt572, arg0);
		} else {
			return 100;
		}
	}
}
