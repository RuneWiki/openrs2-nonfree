import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "I")
	private int anInt2590;

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
	private int anInt2582 = -1;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "Z")
	private volatile boolean aBoolean151 = false;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "Lclient!sa;")
	private final Class57 aClass57_4;

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "Lclient!sa;")
	private final Class57 aClass57_3;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	private final int anInt2587;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!sa;Lclient!sa;IZZZ)V")
	public Class8_Sub1(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass57_4 = arg0;
		this.aBoolean152 = arg5;
		this.aClass57_3 = arg1;
		this.anInt2587 = arg2;
		Static17.method497(this, this.anInt2587);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZIZ[B)V")
	public void method1708(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (!arg0) {
			arg3[arg3.length - 2] = (byte) (super.anIntArray316[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.anIntArray316[arg1];
			if (this.aClass57_4 != null) {
				Static38.method946(arg3, this.aClass57_4, arg1);
				this.aBooleanArray18[arg1] = true;
			}
			if (arg2) {
				super.aByteArrayArray10[arg1] = arg3;
			}
		} else if (this.aBoolean151) {
			throw new RuntimeException();
		} else {
			if (this.aClass57_3 != null) {
				Static38.method946(arg3, this.aClass57_3, this.anInt2587);
			}
			this.method1690(arg3);
			this.method1711();
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	public int method1709() {
		if (this.aBoolean151) {
			return 100;
		} else if (super.aByteArrayArray10 == null) {
			@Pc(19) int local19 = Static62.method1296(255, this.anInt2587);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BZ[BILclient!sa;)V")
	public void method1710(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class57 arg3) {
		@Pc(39) int local39;
		if (this.aClass57_3 == arg3) {
			if (this.aBoolean151) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static43.method987(true, this, 255, this.anInt2587, (byte) 0, this.anInt2590);
				return;
			}
			Static110.aCRC32_2.reset();
			Static110.aCRC32_2.update(arg1, 0, arg1.length);
			local39 = (int) Static110.aCRC32_2.getValue();
			if (this.anInt2590 != local39) {
				Static43.method987(true, this, 255, this.anInt2587, (byte) 0, this.anInt2590);
				return;
			}
			this.method1690(arg1);
			this.method1711();
			return;
		}
		if (!arg0 && arg2 == this.anInt2582) {
			this.aBoolean151 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray18[arg2] = false;
			if (this.aBoolean152 || arg0) {
				Static43.method987(arg0, this, this.anInt2587, arg2, (byte) 2, super.anIntArray320[arg2]);
			}
			return;
		}
		Static110.aCRC32_2.reset();
		Static110.aCRC32_2.update(arg1, 0, arg1.length - 2);
		local39 = (int) Static110.aCRC32_2.getValue();
		@Pc(146) int local146 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
		if (local39 != super.anIntArray320[arg2] || super.anIntArray316[arg2] != local146) {
			this.aBooleanArray18[arg2] = false;
			if (this.aBoolean152 || arg0) {
				Static43.method987(arg0, this, this.anInt2587, arg2, (byte) 2, super.anIntArray320[arg2]);
			}
			return;
		}
		this.aBooleanArray18[arg2] = true;
		if (arg0) {
			super.aByteArrayArray10[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
	@Override
	protected void method1689(@OriginalArg(1) int arg0) {
		if (this.aClass57_4 == null || this.aBooleanArray18 == null || !this.aBooleanArray18[arg0]) {
			Static43.method987(true, this, this.anInt2587, arg0, (byte) 2, super.anIntArray320[arg0]);
		} else {
			Static44.method1009(this, arg0, this.aClass57_4);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1686(@OriginalArg(0) int arg0) {
		Static59.method1267(this.anInt2587, arg0);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	private void method1711() {
		this.aBooleanArray18 = new boolean[super.aByteArrayArray10.length];
		for (@Pc(21) int local21 = 0; local21 < this.aBooleanArray18.length; local21++) {
			this.aBooleanArray18[local21] = false;
		}
		if (this.aClass57_4 == null) {
			this.aBoolean151 = true;
			return;
		}
		this.anInt2582 = -1;
		for (@Pc(50) int local50 = 0; local50 < this.aBooleanArray18.length; local50++) {
			if (super.anIntArray321[local50] > 0) {
				Static31.method836(local50, this, this.aClass57_4);
				this.anInt2582 = local50;
			}
		}
		if (this.anInt2582 == -1) {
			this.aBoolean151 = true;
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(II)V")
	public void method1712(@OriginalArg(0) int arg0) {
		this.anInt2590 = arg0;
		if (this.aClass57_3 == null) {
			Static43.method987(true, this, 255, this.anInt2587, (byte) 0, this.anInt2590);
		} else {
			Static44.method1009(this, this.anInt2587, this.aClass57_3);
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(II)I")
	private int method1713(@OriginalArg(0) int arg0) {
		if (super.aByteArrayArray10[arg0] == null) {
			return this.aBooleanArray18[arg0] ? 100 : Static62.method1296(this.anInt2587, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)I")
	public int method1714() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.aByteArrayArray10.length; local11++) {
			if (super.anIntArray321[local11] > 0) {
				local3 += 100;
				local9 += this.method1713(local11);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}
}
