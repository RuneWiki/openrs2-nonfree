import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!oc", name = "ib", descriptor = "[I")
	public static final int[] anIntArray270 = new int[99];

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!oc", name = "ob", descriptor = "[Z")
	private volatile boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "Z")
	private volatile boolean aBoolean134 = false;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
	private int anInt3010 = -1;

	@OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
	private final int anInt3017;

	@OriginalMember(owner = "client!oc", name = "vb", descriptor = "Lclient!u;")
	private final Class98 aClass98_2;

	@OriginalMember(owner = "client!oc", name = "xb", descriptor = "Lclient!u;")
	private final Class98 aClass98_3;

	static {
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < 99; local33++) {
			@Pc(38) int local38 = local33 + 1;
			@Pc(51) int local51 = (int) (Math.pow(2.0D, (double) local38 / 7.0D) * 300.0D + (double) local38);
			local31 += local51;
			anIntArray270[local33] = local31 / 4;
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!u;Lclient!u;IZZZ)V")
	public Class71_Sub1(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt3017 = arg2;
		this.aClass98_2 = arg0;
		this.aBoolean133 = arg5;
		this.aClass98_3 = arg1;
		Static185.method2663(this.anInt3017, this);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	private void method2144() {
		this.aBooleanArray17 = new boolean[super.anObjectArray29.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray17.length; local13++) {
			this.aBooleanArray17[local13] = false;
		}
		if (this.aClass98_2 == null) {
			this.aBoolean134 = true;
			return;
		}
		this.anInt3010 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray17.length; local42++) {
			if (super.anIntArray269[local42] > 0) {
				Static102.method1626(this, this.aClass98_2, local42);
				this.anInt3010 = local42;
			}
		}
		if (this.anInt3010 == -1) {
			this.aBoolean134 = true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)V")
	@Override
	protected void method2127(@OriginalArg(0) int arg0) {
		if (this.method2112(arg0)) {
			Static131.method1035(this.anInt3017, arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIB[BLclient!u;)V")
	public void method2146(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class98 arg3) {
		@Pc(71) int local71;
		if (this.aClass98_3 != arg3) {
			if (!arg0 && this.anInt3010 == arg1) {
				this.aBoolean134 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray17[arg1] = false;
				if (this.aBoolean133 || arg0) {
					Static206.method279(this.anInt3017, super.anIntArray264[arg1], (byte) 2, arg0, arg1, this);
				}
				return;
			}
			Static147.aCRC32_1.reset();
			Static147.aCRC32_1.update(arg2, 0, arg2.length - 2);
			local71 = (int) Static147.aCRC32_1.getValue();
			@Pc(91) int local91 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
			if (super.anIntArray264[arg1] != local71 || local91 != super.anIntArray268[arg1]) {
				this.aBooleanArray17[arg1] = false;
				if (this.aBoolean133 || arg0) {
					Static206.method279(this.anInt3017, super.anIntArray264[arg1], (byte) 2, arg0, arg1, this);
				}
				return;
			}
			this.aBooleanArray17[arg1] = true;
			if (arg0) {
				super.anObjectArray29[arg1] = Static195.method2784(arg2);
				return;
			}
			return;
		}
		if (this.aBoolean134) {
			throw new RuntimeException();
		}
		if (arg2 == null) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
			return;
		}
		Static147.aCRC32_1.reset();
		Static147.aCRC32_1.update(arg2, 0, arg2.length);
		local71 = (int) Static147.aCRC32_1.getValue();
		if (this.anInt3009 != local71) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
			return;
		}
		@Pc(200) Class2_Sub11 local200;
		try {
			local200 = new Class2_Sub11(Static146.method2189(arg2));
		} catch (@Pc(202) RuntimeException local202) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
			return;
		}
		@Pc(217) int local217 = local200.method1534();
		if (local217 != 5 && local217 != 6) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
			return;
		}
		@Pc(240) int local240 = 0;
		if (local217 >= 6) {
			local240 = local200.method1577();
		}
		if (local240 != this.anInt3013) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
			return;
		}
		this.method2134(arg2);
		this.method2144();
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
	public int method2147() {
		if (this.aBoolean134) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(19) int local19 = Static77.method2469(255, this.anInt3017);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(II)V")
	@Override
	protected void method2137(@OriginalArg(1) int arg0) {
		if (!this.method2112(arg0)) {
			return;
		}
		if (this.aClass98_2 == null || this.aBooleanArray17 == null || !this.aBooleanArray17[arg0]) {
			Static206.method279(this.anInt3017, super.anIntArray264[arg0], (byte) 2, true, arg0, this);
		} else {
			Static128.method106(arg0, this, this.aClass98_2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIBZZ)V")
	public void method2148(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg2) {
			if (this.aBoolean134) {
				throw new RuntimeException();
			}
			if (this.aClass98_3 != null) {
				Static158.method2343(this.anInt3017, this.aClass98_3, arg0);
			}
			this.method2134(arg0);
			this.method2144();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray268[arg1] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray268[arg1];
		if (this.aClass98_2 != null) {
			Static158.method2343(arg1, this.aClass98_2, arg0);
			this.aBooleanArray17[arg1] = true;
		}
		if (arg3) {
			super.anObjectArray29[arg1] = Static195.method2784(arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)V")
	public void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3009 = arg1;
		this.anInt3013 = arg0;
		if (this.aClass98_3 == null) {
			Static206.method279(255, this.anInt3009, (byte) 0, true, this.anInt3017, this);
		} else {
			Static128.method106(this.anInt3017, this, this.aClass98_3);
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)I")
	@Override
	protected int method2126(@OriginalArg(1) int arg0) {
		if (!this.method2112(arg0)) {
			return 0;
		} else if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray17[arg0] ? 100 : Static77.method2469(this.anInt3017, arg0);
		} else {
			return 100;
		}
	}
}
