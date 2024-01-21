import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!ta", name = "Ab", descriptor = "[Z")
	private volatile boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!ta", name = "Fb", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "Z")
	private volatile boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ta", name = "Jb", descriptor = "I")
	private int anInt2490 = -1;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "Lclient!ld;")
	private final Class42 aClass42_3;

	@OriginalMember(owner = "client!ta", name = "Mb", descriptor = "Lclient!ld;")
	private final Class42 aClass42_4;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	private final int anInt2482;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ld;Lclient!ld;IZZZ)V")
	public Class36_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean110 = arg5;
		this.aClass42_3 = arg0;
		this.aClass42_4 = arg1;
		this.anInt2482 = arg2;
		Static50.method950(this.anInt2482, this);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)V")
	public void method1783(@OriginalArg(0) int arg0) {
		this.anInt2488 = arg0;
		if (this.aClass42_4 == null) {
			Static84.method2049(this.anInt2482, this, this.anInt2488, 255, (byte) 0, true);
		} else {
			Static107.method1860(this.anInt2482, this.aClass42_4, this);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIZZ)V")
	public void method1785(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean109) {
				throw new RuntimeException();
			}
			if (this.aClass42_4 != null) {
				Static100.method1953(this.aClass42_4, this.anInt2482, arg0);
			}
			this.method1781(arg0);
			this.method1795();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray309[arg1] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray309[arg1];
		if (this.aClass42_3 != null) {
			Static100.method1953(this.aClass42_3, arg1, arg0);
			this.aBooleanArray13[arg1] = true;
		}
		if (arg2) {
			super.aByteArrayArray11[arg1] = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)I")
	public int method1786() {
		if (this.aBoolean109) {
			return 100;
		} else if (super.aByteArrayArray11 == null) {
			@Pc(24) int local24 = Static1.method6(255, this.anInt2482);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IZ)V")
	@Override
	protected void method1770(@OriginalArg(0) int arg0) {
		if (this.aClass42_3 == null || this.aBooleanArray13 == null || !this.aBooleanArray13[arg0]) {
			Static84.method2049(arg0, this, super.anIntArray310[arg0], this.anInt2482, (byte) 2, true);
		} else {
			Static107.method1860(arg0, this.aClass42_3, this);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ld;[BIBZ)V")
	public void method1787(@OriginalArg(0) Class42 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(68) int local68;
		if (this.aClass42_4 == arg0) {
			if (this.aBoolean109) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static84.method2049(this.anInt2482, this, this.anInt2488, 255, (byte) 0, true);
				return;
			}
			Static75.aCRC32_2.reset();
			Static75.aCRC32_2.update(arg1, 0, arg1.length);
			local68 = (int) Static75.aCRC32_2.getValue();
			if (this.anInt2488 != local68) {
				Static84.method2049(this.anInt2482, this, this.anInt2488, 255, (byte) 0, true);
				return;
			}
			this.method1781(arg1);
			this.method1795();
			return;
		}
		if (!arg3 && this.anInt2490 == arg2) {
			this.aBoolean109 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray13[arg2] = false;
			if (this.aBoolean110 || arg3) {
				Static84.method2049(arg2, this, super.anIntArray310[arg2], this.anInt2482, (byte) 2, arg3);
			}
			return;
		}
		Static75.aCRC32_2.reset();
		Static75.aCRC32_2.update(arg1, 0, arg1.length - 2);
		local68 = (int) Static75.aCRC32_2.getValue();
		@Pc(88) int local88 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
		if (local68 != super.anIntArray310[arg2] || super.anIntArray309[arg2] != local88) {
			this.aBooleanArray13[arg2] = false;
			if (this.aBoolean110 || arg3) {
				Static84.method2049(arg2, this, super.anIntArray310[arg2], this.anInt2482, (byte) 2, arg3);
			}
			return;
		}
		this.aBooleanArray13[arg2] = true;
		if (arg3) {
			super.aByteArrayArray11[arg2] = arg1;
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)I")
	public int method1789() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < super.aByteArrayArray11.length; local7++) {
			if (super.anIntArray308[local7] > 0) {
				local3 += 100;
				local5 += this.method1792(local7);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local5 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1778(@OriginalArg(0) int arg0) {
		Static29.method568(this.anInt2482, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(II)I")
	private int method1792(@OriginalArg(0) int arg0) {
		if (super.aByteArrayArray11[arg0] == null) {
			return this.aBooleanArray13[arg0] ? 100 : Static1.method6(this.anInt2482, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	private void method1795() {
		this.aBooleanArray13 = new boolean[super.aByteArrayArray11.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray13.length; local13++) {
			this.aBooleanArray13[local13] = false;
		}
		if (this.aClass42_3 == null) {
			this.aBoolean109 = true;
			return;
		}
		this.anInt2490 = -1;
		for (@Pc(46) int local46 = 0; local46 < this.aBooleanArray13.length; local46++) {
			if (super.anIntArray308[local46] > 0) {
				Static48.method919(local46, this, this.aClass42_3);
				this.anInt2490 = local46;
			}
		}
		if (this.anInt2490 == -1) {
			this.aBoolean109 = true;
		}
	}
}
