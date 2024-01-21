import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!rd", name = "Cb", descriptor = "I")
	private int anInt2403;

	@OriginalMember(owner = "client!rd", name = "Mb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!rd", name = "Hb", descriptor = "Z")
	private volatile boolean aBoolean149 = false;

	@OriginalMember(owner = "client!rd", name = "Ab", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!rd", name = "Ib", descriptor = "I")
	private int anInt2407 = -1;

	@OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
	private final int anInt2399;

	@OriginalMember(owner = "client!rd", name = "Pb", descriptor = "Lclient!ne;")
	private final Class46 aClass46_6;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lclient!ne;")
	private final Class46 aClass46_5;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ne;Lclient!ne;IZZZ)V")
	public Class42_Sub1(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt2399 = arg2;
		this.aBoolean148 = arg5;
		this.aClass46_6 = arg1;
		this.aClass46_5 = arg0;
		Static14.method363(this, this.anInt2399);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(II)I")
	private int method1522(@OriginalArg(0) int arg0) {
		if (super.aByteArrayArray8[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static12.method313(this.anInt2399, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
	public int method1523() {
		if (this.aBoolean149) {
			return 100;
		} else if (super.aByteArrayArray8 == null) {
			@Pc(19) int local19 = Static12.method313(255, this.anInt2399);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BZLclient!ne;)V")
	public void method1524(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class46 arg3) {
		@Pc(39) int local39;
		if (arg3 == this.aClass46_6) {
			if (this.aBoolean149) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static27.method526(true, 255, this.anInt2403, (byte) 0, this.anInt2399, this);
				return;
			}
			Static72.aCRC32_4.reset();
			Static72.aCRC32_4.update(arg1, 0, arg1.length);
			local39 = (int) Static72.aCRC32_4.getValue();
			if (local39 != this.anInt2403) {
				Static27.method526(true, 255, this.anInt2403, (byte) 0, this.anInt2399, this);
				return;
			}
			this.method1495(arg1);
			this.method1526();
			return;
		}
		if (!arg2 && arg0 == this.anInt2407) {
			this.aBoolean149 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray10[arg0] = false;
			if (this.aBoolean148 || arg2) {
				Static27.method526(arg2, this.anInt2399, super.anIntArray262[arg0], (byte) 2, arg0, this);
			}
			return;
		}
		Static72.aCRC32_4.reset();
		Static72.aCRC32_4.update(arg1, 0, arg1.length - 2);
		local39 = (int) Static72.aCRC32_4.getValue();
		@Pc(142) int local142 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
		if (super.anIntArray262[arg0] != local39 || local142 != super.anIntArray263[arg0]) {
			this.aBooleanArray10[arg0] = false;
			if (this.aBoolean148 || arg2) {
				Static27.method526(arg2, this.anInt2399, super.anIntArray262[arg0], (byte) 2, arg0, this);
			}
			return;
		}
		this.aBooleanArray10[arg0] = true;
		if (arg2) {
			super.aByteArrayArray8[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	private void method1526() {
		this.aBooleanArray10 = new boolean[super.aByteArrayArray8.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray10.length; local9++) {
			this.aBooleanArray10[local9] = false;
		}
		if (this.aClass46_5 == null) {
			this.aBoolean149 = true;
			return;
		}
		this.anInt2407 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray10.length; local42++) {
			if (super.anIntArray261[local42] > 0) {
				Static48.method780(this, local42, this.aClass46_5);
				this.anInt2407 = local42;
			}
		}
		if (this.anInt2407 == -1) {
			this.aBoolean149 = true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1505(@OriginalArg(1) int arg0) {
		if (this.aClass46_5 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static27.method526(true, this.anInt2399, super.anIntArray262[arg0], (byte) 2, arg0, this);
		} else {
			Static45.method751(this, this.aClass46_5, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZ[BZ)V")
	public void method1528(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean149) {
				throw new RuntimeException();
			}
			if (this.aClass46_6 != null) {
				Static8.method216(arg2, this.anInt2399, this.aClass46_6);
			}
			this.method1495(arg2);
			this.method1526();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray263[arg0] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray263[arg0];
		if (this.aClass46_5 != null) {
			Static8.method216(arg2, arg0, this.aClass46_5);
			this.aBooleanArray10[arg0] = true;
		}
		if (arg1) {
			super.aByteArrayArray8[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
	public int method1529() {
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		for (@Pc(16) int local16 = 0; super.aByteArrayArray8.length > local16; local16++) {
			if (super.anIntArray261[local16] > 0) {
				local8 += 100;
				local10 += this.method1522(local16);
			}
		}
		if (local8 == 0) {
			return 100;
		} else {
			return local10 * 100 / local8;
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
	@Override
	protected void method1501(@OriginalArg(1) int arg0) {
		Static37.method671(arg0, this.anInt2399);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
	public void method1532(@OriginalArg(1) int arg0) {
		this.anInt2403 = arg0;
		if (this.aClass46_6 == null) {
			Static27.method526(true, 255, this.anInt2403, (byte) 0, this.anInt2399, this);
		} else {
			Static45.method751(this, this.aClass46_6, this.anInt2399);
		}
	}
}
