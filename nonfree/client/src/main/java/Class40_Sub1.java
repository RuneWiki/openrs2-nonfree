import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!md", name = "mb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
	private int anInt1820;

	@OriginalMember(owner = "client!md", name = "qb", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!md", name = "Ab", descriptor = "I")
	private int anInt1822 = -1;

	@OriginalMember(owner = "client!md", name = "jb", descriptor = "Z")
	private volatile boolean aBoolean84 = false;

	@OriginalMember(owner = "client!md", name = "zb", descriptor = "Lclient!jc;")
	private final Class32 aClass32_4;

	@OriginalMember(owner = "client!md", name = "Gb", descriptor = "I")
	private final int anInt1827;

	@OriginalMember(owner = "client!md", name = "ob", descriptor = "Lclient!jc;")
	private final Class32 aClass32_3;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!jc;Lclient!jc;IZZZ)V")
	public Class40_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass32_4 = arg0;
		this.anInt1827 = arg2;
		this.aClass32_3 = arg1;
		this.aBoolean85 = arg5;
		Static45.method993(this.anInt1827, this);
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I")
	public int method1248() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.aByteArrayArray4.length; local11++) {
			if (super.anIntArray178[local11] > 0) {
				local7 += 100;
				local9 += this.method1256(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
	@Override
	protected void method1226(@OriginalArg(1) int arg0) {
		if (this.aClass32_4 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static71.method1426(true, this, (byte) 2, arg0, super.anIntArray174[arg0], this.anInt1827);
		} else {
			Static14.method516(arg0, this.aClass32_4, this);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	public void method1249(@OriginalArg(0) int arg0) {
		this.anInt1820 = arg0;
		if (this.aClass32_3 == null) {
			Static71.method1426(true, this, (byte) 0, this.anInt1827, this.anInt1820, 255);
		} else {
			Static14.method516(this.anInt1827, this.aClass32_3, this);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)I")
	public int method1253() {
		if (this.aBoolean84) {
			return 100;
		} else if (super.aByteArrayArray4 == null) {
			@Pc(24) int local24 = Static109.method2034(255, this.anInt1827);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BZI[BZ)V")
	public void method1254(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean84) {
				throw new RuntimeException();
			}
			if (this.aClass32_3 != null) {
				Static7.method252(arg2, this.anInt1827, this.aClass32_3);
			}
			this.method1245(arg2);
			this.method1258();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray176[arg1] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray176[arg1];
		if (this.aClass32_4 != null) {
			Static7.method252(arg2, arg1, this.aClass32_4);
			this.aBooleanArray7[arg1] = true;
		}
		if (arg0) {
			super.aByteArrayArray4[arg1] = arg2;
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(II)I")
	private int method1256(@OriginalArg(1) int arg0) {
		if (super.aByteArrayArray4[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static109.method2034(this.anInt1827, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V")
	@Override
	protected void method1236(@OriginalArg(1) int arg0) {
		Static50.method2088(arg0, this.anInt1827);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!jc;ZI[B)V")
	public void method1257(@OriginalArg(1) Class32 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(39) int local39;
		if (arg0 == this.aClass32_3) {
			if (this.aBoolean84) {
				throw new RuntimeException();
			}
			if (arg3 == null) {
				Static71.method1426(true, this, (byte) 0, this.anInt1827, this.anInt1820, 255);
				return;
			}
			Static17.aCRC32_1.reset();
			Static17.aCRC32_1.update(arg3, 0, arg3.length);
			local39 = (int) Static17.aCRC32_1.getValue();
			if (local39 != this.anInt1820) {
				Static71.method1426(true, this, (byte) 0, this.anInt1827, this.anInt1820, 255);
				return;
			}
			this.method1245(arg3);
			this.method1258();
			return;
		}
		if (!arg1 && arg2 == this.anInt1822) {
			this.aBoolean84 = true;
		}
		if (arg3 == null || arg3.length <= 2) {
			this.aBooleanArray7[arg2] = false;
			if (this.aBoolean85 || arg1) {
				Static71.method1426(arg1, this, (byte) 2, arg2, super.anIntArray174[arg2], this.anInt1827);
			}
			return;
		}
		Static17.aCRC32_1.reset();
		Static17.aCRC32_1.update(arg3, 0, arg3.length - 2);
		local39 = (int) Static17.aCRC32_1.getValue();
		@Pc(143) int local143 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
		if (super.anIntArray174[arg2] != local39 || super.anIntArray176[arg2] != local143) {
			this.aBooleanArray7[arg2] = false;
			if (this.aBoolean85 || arg1) {
				Static71.method1426(arg1, this, (byte) 2, arg2, super.anIntArray174[arg2], this.anInt1827);
			}
			return;
		}
		this.aBooleanArray7[arg2] = true;
		if (arg1) {
			super.aByteArrayArray4[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	private void method1258() {
		this.aBooleanArray7 = new boolean[super.aByteArrayArray4.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray7.length; local9++) {
			this.aBooleanArray7[local9] = false;
		}
		if (this.aClass32_4 == null) {
			this.aBoolean84 = true;
			return;
		}
		this.anInt1822 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray7.length; local49++) {
			if (super.anIntArray178[local49] > 0) {
				Static94.method1793(this.aClass32_4, local49, this);
				this.anInt1822 = local49;
			}
		}
		if (this.anInt1822 == -1) {
			this.aBoolean84 = true;
		}
	}
}
