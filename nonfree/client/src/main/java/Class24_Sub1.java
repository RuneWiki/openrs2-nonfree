import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
	private int anInt2693;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "[Z")
	private volatile boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
	private int anInt2700;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
	private int anInt2696 = -1;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ua", name = "zb", descriptor = "Z")
	private volatile boolean aBoolean224 = false;

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "Lclient!ha;")
	private final Class29 aClass29_5;

	@OriginalMember(owner = "client!ua", name = "sb", descriptor = "Lclient!ha;")
	private final Class29 aClass29_6;

	@OriginalMember(owner = "client!ua", name = "yb", descriptor = "I")
	private final int anInt2702;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ha;Lclient!ha;IZZZ)V")
	public Class24_Sub1(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass29_5 = arg0;
		this.aClass29_6 = arg1;
		this.aBoolean222 = arg5;
		this.anInt2702 = arg2;
		Static1.method11(this.anInt2702, this);
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)I")
	public int method1936() {
		if (this.aBoolean224) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(24) int local24 = Static1.method5(255, this.anInt2702);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZZ[BI)V")
	public void method1937(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) {
		if (arg1) {
			if (this.aBoolean224) {
				throw new RuntimeException();
			}
			if (this.aClass29_6 != null) {
				Static117.method1993(this.anInt2702, arg3, this.aClass29_6);
			}
			this.method1912(arg3);
			this.method1942();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray308[arg0] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray308[arg0];
		if (this.aClass29_5 != null) {
			Static117.method1993(arg0, arg3, this.aClass29_5);
			this.aBooleanArray24[arg0] = true;
		}
		if (arg2) {
			super.anObjectArray28[arg0] = Static5.method129(arg3);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method1919(@OriginalArg(0) int arg0) {
		if (this.aClass29_5 == null || this.aBooleanArray24 == null || !this.aBooleanArray24[arg0]) {
			Static75.method1249(this.anInt2702, super.anIntArray305[arg0], (byte) 2, arg0, this, true);
		} else {
			Static37.method679(this.aClass29_5, arg0, this);
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(II)I")
	private int method1938(@OriginalArg(0) int arg0) {
		if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray24[arg0] ? 100 : Static1.method5(this.anInt2702, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ha;I[BZI)V")
	public void method1939(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(63) int local63;
		if (this.aClass29_6 != arg0) {
			if (!arg3 && arg1 == this.anInt2696) {
				this.aBoolean224 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray24[arg1] = false;
				if (this.aBoolean222 || arg3) {
					Static75.method1249(this.anInt2702, super.anIntArray305[arg1], (byte) 2, arg1, this, arg3);
				}
			} else {
				Static94.aCRC32_2.reset();
				Static94.aCRC32_2.update(arg2, 0, arg2.length - 2);
				local63 = (int) Static94.aCRC32_2.getValue();
				@Pc(84) int local84 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
				if (local63 == super.anIntArray305[arg1] && local84 == super.anIntArray308[arg1]) {
					this.aBooleanArray24[arg1] = true;
					if (arg3) {
						super.anObjectArray28[arg1] = Static5.method129(arg2);
					}
				} else {
					this.aBooleanArray24[arg1] = false;
					if (this.aBoolean222 || arg3) {
						Static75.method1249(this.anInt2702, super.anIntArray305[arg1], (byte) 2, arg1, this, arg3);
					}
				}
			}
		} else if (this.aBoolean224) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static75.method1249(255, this.anInt2693, (byte) 0, this.anInt2702, this, true);
		} else {
			Static94.aCRC32_2.reset();
			Static94.aCRC32_2.update(arg2, 0, arg2.length);
			local63 = (int) Static94.aCRC32_2.getValue();
			@Pc(181) Class2_Sub9 local181 = new Class2_Sub9(Static103.method1818(arg2));
			@Pc(185) int local185 = local181.method640();
			if (local185 != 5 && local185 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local185);
			}
			@Pc(206) int local206 = 0;
			if (local185 >= 6) {
				local206 = local181.method622();
			}
			if (local63 == this.anInt2693 && local206 == this.anInt2700) {
				this.method1912(arg2);
				this.method1942();
			} else {
				Static75.method1249(255, this.anInt2693, (byte) 0, this.anInt2702, this, true);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	private void method1942() {
		this.aBooleanArray24 = new boolean[super.anObjectArray28.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray24.length; local13++) {
			this.aBooleanArray24[local13] = false;
		}
		if (this.aClass29_5 == null) {
			this.aBoolean224 = true;
			return;
		}
		this.anInt2696 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray24.length; local48++) {
			if (super.anIntArray307[local48] > 0) {
				Static21.method401(this.aClass29_5, local48, this);
				this.anInt2696 = local48;
			}
		}
		if (this.anInt2696 == -1) {
			this.aBoolean224 = true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I")
	public int method1943() {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < super.anObjectArray28.length; local19++) {
			if (super.anIntArray307[local19] > 0) {
				local17 += 100;
				local7 += this.method1938(local19);
			}
		}
		if (local17 == 0) {
			return 100;
		} else {
			return local7 * 100 / local17;
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	@Override
	protected void method1921(@OriginalArg(1) int arg0) {
		Static11.method209(this.anInt2702, arg0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIZ)V")
	public void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2700 = arg1;
		this.anInt2693 = arg0;
		if (this.aClass29_6 == null) {
			Static75.method1249(255, this.anInt2693, (byte) 0, this.anInt2702, this, true);
		} else {
			Static37.method679(this.aClass29_6, this.anInt2702, this);
		}
	}
}
