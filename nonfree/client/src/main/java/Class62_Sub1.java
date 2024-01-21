import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!q", name = "nb", descriptor = "I")
	private int anInt2196;

	@OriginalMember(owner = "client!q", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	private int anInt2191 = -1;

	@OriginalMember(owner = "client!q", name = "Bb", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!q", name = "Ab", descriptor = "Z")
	private volatile boolean aBoolean88 = false;

	@OriginalMember(owner = "client!q", name = "zb", descriptor = "Lclient!dd;")
	private final Class17 aClass17_3;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
	private final int anInt2190;

	@OriginalMember(owner = "client!q", name = "tb", descriptor = "Lclient!dd;")
	private final Class17 aClass17_2;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;IZZZ)V")
	public Class62_Sub1(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass17_3 = arg1;
		this.aBoolean89 = arg5;
		this.anInt2190 = arg2;
		this.aClass17_2 = arg0;
		Static119.method274(this, this.anInt2190);
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(II)V")
	public void method1522(@OriginalArg(0) int arg0) {
		this.anInt2196 = arg0;
		if (this.aClass17_3 == null) {
			Static58.method1063((byte) 0, 255, this.anInt2190, this.anInt2196, true, this);
		} else {
			Static76.method1295(this.anInt2190, this, this.aClass17_3);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BIILclient!dd;Z)V")
	public void method1523(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(39) int local39;
		if (arg2 == this.aClass17_3) {
			if (this.aBoolean88) {
				throw new RuntimeException();
			}
			if (arg0 == null) {
				Static58.method1063((byte) 0, 255, this.anInt2190, this.anInt2196, true, this);
				return;
			}
			Static35.aCRC32_1.reset();
			Static35.aCRC32_1.update(arg0, 0, arg0.length);
			local39 = (int) Static35.aCRC32_1.getValue();
			if (local39 != this.anInt2196) {
				Static58.method1063((byte) 0, 255, this.anInt2190, this.anInt2196, true, this);
				return;
			}
			this.method1516(arg0);
			this.method1524();
			return;
		}
		if (!arg3 && this.anInt2191 == arg1) {
			this.aBoolean88 = true;
		}
		if (arg0 == null || arg0.length <= 2) {
			this.aBooleanArray10[arg1] = false;
			if (this.aBoolean89 || arg3) {
				Static58.method1063((byte) 2, this.anInt2190, arg1, super.anIntArray287[arg1], arg3, this);
			}
			return;
		}
		Static35.aCRC32_1.reset();
		Static35.aCRC32_1.update(arg0, 0, arg0.length - 2);
		local39 = (int) Static35.aCRC32_1.getValue();
		@Pc(139) int local139 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
		if (local39 != super.anIntArray287[arg1] || super.anIntArray283[arg1] != local139) {
			this.aBooleanArray10[arg1] = false;
			if (this.aBoolean89 || arg3) {
				Static58.method1063((byte) 2, this.anInt2190, arg1, super.anIntArray287[arg1], arg3, this);
			}
			return;
		}
		this.aBooleanArray10[arg1] = true;
		if (arg3) {
			super.anObjectArray2[arg1] = Static75.method1251(arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
	private void method1524() {
		this.aBooleanArray10 = new boolean[super.anObjectArray2.length];
		for (@Pc(17) int local17 = 0; local17 < this.aBooleanArray10.length; local17++) {
			this.aBooleanArray10[local17] = false;
		}
		if (this.aClass17_2 == null) {
			this.aBoolean88 = true;
			return;
		}
		this.anInt2191 = -1;
		for (@Pc(46) int local46 = 0; local46 < this.aBooleanArray10.length; local46++) {
			if (super.anIntArray285[local46] > 0) {
				Static41.method838(this, this.aClass17_2, local46);
				this.anInt2191 = local46;
			}
		}
		if (this.anInt2191 == -1) {
			this.aBoolean88 = true;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BZIZB)V")
	public void method1525(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg1) {
			if (this.aBoolean88) {
				throw new RuntimeException();
			}
			if (this.aClass17_3 != null) {
				Static77.method1356(this.anInt2190, this.aClass17_3, arg0);
			}
			this.method1516(arg0);
			this.method1524();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray283[arg2] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray283[arg2];
		if (this.aClass17_2 != null) {
			Static77.method1356(arg2, this.aClass17_2, arg0);
			this.aBooleanArray10[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg2] = Static75.method1251(arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1500(@OriginalArg(0) int arg0) {
		Static99.method1646(arg0, this.anInt2190);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I")
	public int method1527() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray2.length > local11; local11++) {
			if (super.anIntArray285[local11] > 0) {
				local9 += this.method1529(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(B)I")
	public int method1528() {
		if (this.aBoolean88) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static95.method1570(255, this.anInt2190);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(ZI)I")
	private int method1529(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static95.method1570(this.anInt2190, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	@Override
	protected void method1503(@OriginalArg(0) int arg0) {
		if (this.aClass17_2 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static58.method1063((byte) 2, this.anInt2190, arg0, super.anIntArray287[arg0], true, this);
		} else {
			Static76.method1295(arg0, this, this.aClass17_2);
		}
	}
}
