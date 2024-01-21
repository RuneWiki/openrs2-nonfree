import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!qd", name = "Eb", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!qd", name = "sb", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!qd", name = "ob", descriptor = "Z")
	private volatile boolean aBoolean113 = false;

	@OriginalMember(owner = "client!qd", name = "Cb", descriptor = "I")
	private int anInt2306 = -1;

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "I")
	private final int anInt2303;

	@OriginalMember(owner = "client!qd", name = "xb", descriptor = "Lclient!r;")
	private final Class55 aClass55_2;

	@OriginalMember(owner = "client!qd", name = "zb", descriptor = "Lclient!r;")
	private final Class55 aClass55_3;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!r;Lclient!r;IZZZ)V")
	public Class54_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt2303 = arg2;
		this.aClass55_2 = arg1;
		this.aBoolean114 = arg5;
		this.aClass55_3 = arg0;
		Static42.method897(this, this.anInt2303);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ[BLclient!r;I)V")
	public void method1624(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3) {
		@Pc(45) int local45;
		if (this.aClass55_2 != arg2) {
			if (!arg0 && arg3 == this.anInt2306) {
				this.aBoolean113 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray10[arg3] = false;
				if (this.aBoolean114 || arg0) {
					Static93.method1748(arg3, this, super.anIntArray344[arg3], this.anInt2303, (byte) 2, arg0);
				}
			} else {
				Static97.aCRC32_2.reset();
				Static97.aCRC32_2.update(arg1, 0, arg1.length - 2);
				local45 = (int) Static97.aCRC32_2.getValue();
				@Pc(147) int local147 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (local45 == super.anIntArray344[arg3] && local147 == super.anIntArray347[arg3]) {
					this.aBooleanArray10[arg3] = true;
					if (arg0) {
						super.aByteArrayArray13[arg3] = arg1;
					}
				} else {
					this.aBooleanArray10[arg3] = false;
					if (this.aBoolean114 || arg0) {
						Static93.method1748(arg3, this, super.anIntArray344[arg3], this.anInt2303, (byte) 2, arg0);
					}
				}
			}
		} else if (this.aBoolean113) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static93.method1748(this.anInt2303, this, this.anInt2307, 255, (byte) 0, true);
		} else {
			Static97.aCRC32_2.reset();
			Static97.aCRC32_2.update(arg1, 0, arg1.length);
			local45 = (int) Static97.aCRC32_2.getValue();
			if (local45 == this.anInt2307) {
				this.method1605(arg1);
				this.method1633();
			} else {
				Static93.method1748(this.anInt2303, this, this.anInt2307, 255, (byte) 0, true);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
	public int method1625() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.aByteArrayArray13.length; local11++) {
			if (super.anIntArray348[local11] > 0) {
				local7 += 100;
				local9 += this.method1629(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(II)V")
	public void method1626(@OriginalArg(1) int arg0) {
		this.anInt2307 = arg0;
		if (this.aClass55_2 == null) {
			Static93.method1748(this.anInt2303, this, this.anInt2307, 255, (byte) 0, true);
		} else {
			Static84.method1561(this.aClass55_2, this, this.anInt2303);
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(IB)V")
	@Override
	protected void method1621(@OriginalArg(0) int arg0) {
		Static83.method1663(this.anInt2303, arg0);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(ZI)I")
	private int method1629(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray13[arg0] == null) {
			return this.aBooleanArray10[arg0] ? 100 : Static91.method1730(arg0, this.anInt2303);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)I")
	public int method1632() {
		if (this.aBoolean113) {
			return 100;
		} else if (super.aByteArrayArray13 == null) {
			@Pc(29) int local29 = Static91.method1730(this.anInt2303, 255);
			if (local29 >= 100) {
				local29 = 99;
			}
			return local29;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	private void method1633() {
		this.aBooleanArray10 = new boolean[super.aByteArrayArray13.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray10.length; local13++) {
			this.aBooleanArray10[local13] = false;
		}
		if (this.aClass55_3 == null) {
			this.aBoolean113 = true;
			return;
		}
		this.anInt2306 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray10.length; local38++) {
			if (super.anIntArray348[local38] > 0) {
				Static20.method338(this, local38, this.aClass55_3);
				this.anInt2306 = local38;
			}
		}
		if (this.anInt2306 == -1) {
			this.aBoolean113 = true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1623(@OriginalArg(1) int arg0) {
		if (this.aClass55_3 == null || this.aBooleanArray10 == null || !this.aBooleanArray10[arg0]) {
			Static93.method1748(arg0, this, super.anIntArray344[arg0], this.anInt2303, (byte) 2, true);
		} else {
			Static84.method1561(this.aClass55_3, this, arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZZI[B)V")
	public void method1634(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1) {
			if (this.aBoolean113) {
				throw new RuntimeException();
			}
			if (this.aClass55_2 != null) {
				Static43.method904(this.aClass55_2, this.anInt2303, arg3);
			}
			this.method1605(arg3);
			this.method1633();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray347[arg2] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray347[arg2];
		if (this.aClass55_3 != null) {
			Static43.method904(this.aClass55_3, arg2, arg3);
			this.aBooleanArray10[arg2] = true;
		}
		if (arg0) {
			super.aByteArrayArray13[arg2] = arg3;
			return;
		}
	}
}
