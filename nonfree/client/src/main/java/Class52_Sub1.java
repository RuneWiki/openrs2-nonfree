import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!kh", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!kh", name = "ub", descriptor = "I")
	private int anInt2233;

	@OriginalMember(owner = "client!kh", name = "Ab", descriptor = "I")
	private int anInt2236;

	@OriginalMember(owner = "client!kh", name = "yb", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!kh", name = "xb", descriptor = "I")
	private int anInt2235 = -1;

	@OriginalMember(owner = "client!kh", name = "vb", descriptor = "Z")
	private volatile boolean aBoolean116 = false;

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "Lclient!cg;")
	private final Class18 aClass18_3;

	@OriginalMember(owner = "client!kh", name = "Jb", descriptor = "I")
	private final int anInt2242;

	@OriginalMember(owner = "client!kh", name = "pb", descriptor = "Lclient!cg;")
	private final Class18 aClass18_4;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!cg;Lclient!cg;IZZZ)V")
	public Class52_Sub1(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass18_3 = arg0;
		this.anInt2242 = arg2;
		this.aClass18_4 = arg1;
		this.aBoolean117 = arg5;
		Static4.method61(this.anInt2242, this);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
	@Override
	protected int method1552(@OriginalArg(1) int arg0) {
		if (!this.method1573(arg0)) {
			return 0;
		} else if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static60.method2389(arg0, this.anInt2242);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIZZI)V")
	public void method1583(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			arg0[arg0.length - 2] = (byte) (super.anIntArray127[arg1] >> 8);
			arg0[arg0.length - 1] = (byte) super.anIntArray127[arg1];
			if (this.aClass18_3 != null) {
				Static56.method884(this.aClass18_3, arg1, arg0);
				this.aBooleanArray10[arg1] = true;
			}
			if (arg2) {
				super.anObjectArray28[arg1] = Static135.method1929(arg0);
			}
		} else if (this.aBoolean116) {
			throw new RuntimeException();
		} else {
			if (this.aClass18_4 != null) {
				Static56.method884(this.aClass18_4, this.anInt2242, arg0);
			}
			this.method1563(arg0);
			this.method1590();
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
	public int method1587() {
		if (this.aBoolean116) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(19) int local19 = Static60.method2389(this.anInt2242, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)V")
	@Override
	protected void method1561(@OriginalArg(1) int arg0) {
		if (this.method1573(arg0)) {
			Static102.method1457(arg0, this.anInt2242);
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)V")
	public void method1589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2236 = arg0;
		this.anInt2233 = arg1;
		if (this.aClass18_4 == null) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
		} else {
			Static116.method2443(this.anInt2242, this, this.aClass18_4);
		}
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	private void method1590() {
		this.aBooleanArray10 = new boolean[super.anObjectArray28.length];
		for (@Pc(11) int local11 = 0; local11 < this.aBooleanArray10.length; local11++) {
			this.aBooleanArray10[local11] = false;
		}
		if (this.aClass18_3 == null) {
			this.aBoolean116 = true;
			return;
		}
		this.anInt2235 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray10.length; local42++) {
			if (super.anIntArray131[local42] > 0) {
				Static50.method785(local42, this, this.aClass18_3);
				this.anInt2235 = local42;
			}
		}
		if (this.anInt2235 == -1) {
			this.aBoolean116 = true;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	@Override
	protected void method1555(@OriginalArg(0) int arg0) {
		if (!this.method1573(arg0)) {
			return;
		}
		if (this.aClass18_3 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static163.method2435(this, super.anIntArray133[arg0], arg0, true, (byte) 2, this.anInt2242);
		} else {
			Static116.method2443(arg0, this, this.aClass18_3);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!cg;[BZIB)V")
	public void method1593(@OriginalArg(0) Class18 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(71) int local71;
		if (arg0 != this.aClass18_4) {
			if (!arg2 && arg3 == this.anInt2235) {
				this.aBoolean116 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray10[arg3] = false;
				if (this.aBoolean117 || arg2) {
					Static163.method2435(this, super.anIntArray133[arg3], arg3, arg2, (byte) 2, this.anInt2242);
				}
				return;
			}
			Static179.aCRC32_2.reset();
			Static179.aCRC32_2.update(arg1, 0, arg1.length - 2);
			local71 = (int) Static179.aCRC32_2.getValue();
			@Pc(92) int local92 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
			if (super.anIntArray133[arg3] != local71 || local92 != super.anIntArray127[arg3]) {
				this.aBooleanArray10[arg3] = false;
				if (this.aBoolean117 || arg2) {
					Static163.method2435(this, super.anIntArray133[arg3], arg3, arg2, (byte) 2, this.anInt2242);
				}
				return;
			}
			this.aBooleanArray10[arg3] = true;
			if (arg2) {
				super.anObjectArray28[arg3] = Static135.method1929(arg1);
				return;
			}
			return;
		}
		if (this.aBoolean116) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
			return;
		}
		Static179.aCRC32_2.reset();
		Static179.aCRC32_2.update(arg1, 0, arg1.length);
		local71 = (int) Static179.aCRC32_2.getValue();
		if (this.anInt2233 != local71) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
			return;
		}
		@Pc(209) Class3_Sub4 local209;
		try {
			local209 = new Class3_Sub4(Static135.method1932(arg1));
		} catch (@Pc(211) RuntimeException local211) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
			return;
		}
		@Pc(226) int local226 = local209.method1278();
		if (local226 != 5 && local226 != 6) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
			return;
		}
		@Pc(245) int local245 = 0;
		if (local226 >= 6) {
			local245 = local209.method1245();
		}
		if (local245 != this.anInt2236) {
			Static163.method2435(this, this.anInt2233, this.anInt2242, true, (byte) 0, 255);
			return;
		}
		this.method1563(arg1);
		this.method1590();
	}
}
