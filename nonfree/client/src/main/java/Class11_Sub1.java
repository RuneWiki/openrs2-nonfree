import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
	private int anInt2552;

	@OriginalMember(owner = "client!oh", name = "eb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!oh", name = "qb", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!oh", name = "hb", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!oh", name = "kb", descriptor = "Z")
	private volatile boolean aBoolean115 = false;

	@OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
	private int anInt2555 = -1;

	@OriginalMember(owner = "client!oh", name = "nb", descriptor = "Lclient!wb;")
	private final Class88 aClass88_3;

	@OriginalMember(owner = "client!oh", name = "yb", descriptor = "Lclient!wb;")
	private final Class88 aClass88_4;

	@OriginalMember(owner = "client!oh", name = "jb", descriptor = "I")
	private final int anInt2556;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!wb;Lclient!wb;IZZZ)V")
	public Class11_Sub1(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean114 = arg5;
		this.aClass88_3 = arg0;
		this.aClass88_4 = arg1;
		this.anInt2556 = arg2;
		Static103.method1760(this.anInt2556, this);
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
	public int method2079() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray3.length > local11; local11++) {
			if (super.anIntArray243[local11] > 0) {
				local7 += 100;
				local9 += this.method2081(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(III)V")
	public void method2080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2559 = arg1;
		this.anInt2552 = arg0;
		if (this.aClass88_4 == null) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
		} else {
			Static98.method1701(this.anInt2556, this, this.aClass88_4);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2059(@OriginalArg(0) int arg0) {
		Static49.method886(arg0, this.anInt2556);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	@Override
	protected void method2054(@OriginalArg(0) int arg0) {
		if (this.aClass88_3 == null || this.aBooleanArray12 == null || !this.aBooleanArray12[arg0]) {
			Static79.method3014(super.anIntArray244[arg0], (byte) 2, this, true, this.anInt2556, arg0);
		} else {
			Static98.method1701(arg0, this, this.aClass88_3);
		}
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(II)I")
	private int method2081(@OriginalArg(0) int arg0) {
		if (super.anObjectArray3[arg0] == null) {
			return this.aBooleanArray12[arg0] ? 100 : Static26.method477(this.anInt2556, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIZZI)V")
	public void method2082(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg1) {
			if (this.aBoolean115) {
				throw new RuntimeException();
			}
			if (this.aClass88_4 != null) {
				Static180.method2980(arg0, this.anInt2556, this.aClass88_4);
			}
			this.method2071(arg0);
			this.method2085();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray241[arg3] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray241[arg3];
		if (this.aClass88_3 != null) {
			Static180.method2980(arg0, arg3, this.aClass88_3);
			this.aBooleanArray12[arg3] = true;
		}
		if (arg2) {
			super.anObjectArray3[arg3] = Static165.method2737(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([BLclient!wb;ZZI)V")
	public void method2083(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(61) int local61;
		if (this.aClass88_4 != arg1) {
			if (!arg2 && arg3 == this.anInt2555) {
				this.aBoolean115 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray12[arg3] = false;
				if (this.aBoolean114 || arg2) {
					Static79.method3014(super.anIntArray244[arg3], (byte) 2, this, arg2, this.anInt2556, arg3);
				}
				return;
			}
			Static139.aCRC32_2.reset();
			Static139.aCRC32_2.update(arg0, 0, arg0.length - 2);
			local61 = (int) Static139.aCRC32_2.getValue();
			@Pc(81) int local81 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (super.anIntArray244[arg3] != local61 || super.anIntArray241[arg3] != local81) {
				this.aBooleanArray12[arg3] = false;
				if (this.aBoolean114 || arg2) {
					Static79.method3014(super.anIntArray244[arg3], (byte) 2, this, arg2, this.anInt2556, arg3);
				}
				return;
			}
			this.aBooleanArray12[arg3] = true;
			if (arg2) {
				super.anObjectArray3[arg3] = Static165.method2737(arg0);
			}
			return;
		}
		if (this.aBoolean115) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
			return;
		}
		Static139.aCRC32_2.reset();
		Static139.aCRC32_2.update(arg0, 0, arg0.length);
		local61 = (int) Static139.aCRC32_2.getValue();
		if (local61 != this.anInt2552) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
			return;
		}
		@Pc(191) Class2_Sub13 local191;
		try {
			local191 = new Class2_Sub13(Static118.method1997(arg0));
		} catch (@Pc(193) RuntimeException local193) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
			return;
		}
		@Pc(208) int local208 = local191.method2962();
		if (local208 != 5 && local208 != 6) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
			return;
		}
		@Pc(229) int local229 = 0;
		if (local208 >= 6) {
			local229 = local191.method2946();
		}
		if (this.anInt2559 != local229) {
			Static79.method3014(this.anInt2552, (byte) 0, this, true, 255, this.anInt2556);
			return;
		}
		this.method2071(arg0);
		this.method2085();
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
	private void method2085() {
		this.aBooleanArray12 = new boolean[super.anObjectArray3.length];
		for (@Pc(19) int local19 = 0; local19 < this.aBooleanArray12.length; local19++) {
			this.aBooleanArray12[local19] = false;
		}
		if (this.aClass88_3 == null) {
			this.aBoolean115 = true;
			return;
		}
		this.anInt2555 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray12.length; local48++) {
			if (super.anIntArray243[local48] > 0) {
				Static78.method1258(this.aClass88_3, local48, this);
				this.anInt2555 = local48;
			}
		}
		if (this.anInt2555 == -1) {
			this.aBoolean115 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)I")
	public int method2087() {
		if (this.aBoolean115) {
			return 100;
		} else if (super.anObjectArray3 == null) {
			@Pc(24) int local24 = Static26.method477(255, this.anInt2556);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}
}
