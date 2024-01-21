import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!w", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!w", name = "vb", descriptor = "I")
	private int anInt2878;

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!w", name = "mb", descriptor = "Z")
	private volatile boolean aBoolean134 = false;

	@OriginalMember(owner = "client!w", name = "Bb", descriptor = "I")
	private int anInt2883 = -1;

	@OriginalMember(owner = "client!w", name = "ub", descriptor = "I")
	private final int anInt2877;

	@OriginalMember(owner = "client!w", name = "ob", descriptor = "Lclient!nd;")
	private final Class41 aClass41_3;

	@OriginalMember(owner = "client!w", name = "Jb", descriptor = "Lclient!nd;")
	private final Class41 aClass41_4;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;IZZZ)V")
	public Class55_Sub1(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt2877 = arg2;
		this.aClass41_3 = arg0;
		this.aClass41_4 = arg1;
		this.aBoolean133 = arg5;
		Static65.method1253(this, this.anInt2877);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(II)I")
	private int method1890(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray8[arg0] == null) {
			return this.aBooleanArray11[arg0] ? 100 : Static16.method193(this.anInt2877, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
	@Override
	protected void method1878(@OriginalArg(1) int arg0) {
		Static83.method1460(arg0, this.anInt2877);
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(II)V")
	public void method1892(@OriginalArg(1) int arg0) {
		this.anInt2878 = arg0;
		if (this.aClass41_4 == null) {
			Static65.method1254(this.anInt2877, this.anInt2878, this, true, 255, (byte) 0);
		} else {
			Static94.method1606(this.aClass41_4, this.anInt2877, this);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method1872(@OriginalArg(0) int arg0) {
		if (this.aClass41_3 == null || this.aBooleanArray11 == null || !this.aBooleanArray11[arg0]) {
			Static65.method1254(arg0, super.anIntArray400[arg0], this, true, this.anInt2877, (byte) 2);
		} else {
			Static94.method1606(this.aClass41_3, arg0, this);
		}
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)I")
	public int method1895() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; super.aByteArrayArray8.length > local11; local11++) {
			if (super.anIntArray396[local11] > 0) {
				local3 += 100;
				local5 += this.method1890(local11);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local5 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BLclient!nd;IBZ)V")
	public void method1897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(69) int local69;
		if (this.aClass41_4 == arg1) {
			if (this.aBoolean134) {
				throw new RuntimeException();
			}
			if (arg0 == null) {
				Static65.method1254(this.anInt2877, this.anInt2878, this, true, 255, (byte) 0);
				return;
			}
			Static108.aCRC32_2.reset();
			Static108.aCRC32_2.update(arg0, 0, arg0.length);
			local69 = (int) Static108.aCRC32_2.getValue();
			if (local69 != this.anInt2878) {
				Static65.method1254(this.anInt2877, this.anInt2878, this, true, 255, (byte) 0);
				return;
			}
			this.method1869(arg0);
			this.method1901();
			return;
		}
		if (!arg3 && this.anInt2883 == arg2) {
			this.aBoolean134 = true;
		}
		if (arg0 == null || arg0.length <= 2) {
			this.aBooleanArray11[arg2] = false;
			if (this.aBoolean133 || arg3) {
				Static65.method1254(arg2, super.anIntArray400[arg2], this, arg3, this.anInt2877, (byte) 2);
			}
			return;
		}
		Static108.aCRC32_2.reset();
		Static108.aCRC32_2.update(arg0, 0, arg0.length - 2);
		local69 = (int) Static108.aCRC32_2.getValue();
		@Pc(89) int local89 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
		if (super.anIntArray400[arg2] != local69 || super.anIntArray398[arg2] != local89) {
			this.aBooleanArray11[arg2] = false;
			if (this.aBoolean133 || arg3) {
				Static65.method1254(arg2, super.anIntArray400[arg2], this, arg3, this.anInt2877, (byte) 2);
			}
			return;
		}
		this.aBooleanArray11[arg2] = true;
		if (arg3) {
			super.aByteArrayArray8[arg2] = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)I")
	public int method1898() {
		if (this.aBoolean134) {
			return 100;
		} else if (super.aByteArrayArray8 == null) {
			@Pc(25) int local25 = Static16.method193(255, this.anInt2877);
			if (local25 >= 100) {
				local25 = 99;
			}
			return local25;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BZIZI)V")
	public void method1899(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg3) {
			if (this.aBoolean134) {
				throw new RuntimeException();
			}
			if (this.aClass41_4 != null) {
				Static82.method1455(this.anInt2877, arg0, this.aClass41_4);
			}
			this.method1869(arg0);
			this.method1901();
			return;
		}
		arg0[arg0.length - 2] = (byte) (super.anIntArray398[arg2] >> 8);
		arg0[arg0.length - 1] = (byte) super.anIntArray398[arg2];
		if (this.aClass41_3 != null) {
			Static82.method1455(arg2, arg0, this.aClass41_3);
			this.aBooleanArray11[arg2] = true;
		}
		if (arg1) {
			super.aByteArrayArray8[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	private void method1901() {
		this.aBooleanArray11 = new boolean[super.aByteArrayArray8.length];
		for (@Pc(15) int local15 = 0; local15 < this.aBooleanArray11.length; local15++) {
			this.aBooleanArray11[local15] = false;
		}
		if (this.aClass41_3 == null) {
			this.aBoolean134 = true;
			return;
		}
		this.anInt2883 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray11.length; local43++) {
			if (super.anIntArray396[local43] > 0) {
				Static25.method414(this, local43, this.aClass41_3);
				this.anInt2883 = local43;
			}
		}
		if (this.anInt2883 == -1) {
			this.aBoolean134 = true;
		}
	}
}
