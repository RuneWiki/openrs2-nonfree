import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
	private int anInt2455;

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "Z")
	private volatile boolean aBoolean208 = false;

	@OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
	private int anInt2466 = -1;

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "I")
	private final int anInt2461;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "Lclient!r;")
	private final Class62 aClass62_3;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!r;")
	private final Class62 aClass62_4;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!r;Lclient!r;IZZZ)V")
	public Class64_Sub1(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean207 = arg5;
		this.anInt2461 = arg2;
		this.aClass62_3 = arg1;
		this.aClass62_4 = arg0;
		Static25.method495(this.anInt2461, this);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZII[B)V")
	public void method1642(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean208) {
				throw new RuntimeException();
			}
			if (this.aClass62_3 != null) {
				Static72.method1168(arg3, this.aClass62_3, this.anInt2461);
			}
			this.method1634(arg3);
			this.method1651();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray301[arg2] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray301[arg2];
		if (this.aClass62_4 != null) {
			Static72.method1168(arg3, this.aClass62_4, arg2);
			this.aBooleanArray15[arg2] = true;
		}
		if (arg1) {
			super.aByteArrayArray7[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
	public int method1643() {
		if (this.aBoolean208) {
			return 100;
		} else if (super.aByteArrayArray7 == null) {
			@Pc(19) int local19 = Static71.method1152(this.anInt2461, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)I")
	private int method1644(@OriginalArg(0) int arg0) {
		if (super.aByteArrayArray7[arg0] == null) {
			return this.aBooleanArray15[arg0] ? 100 : Static71.method1152(arg0, this.anInt2461);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)V")
	public void method1645(@OriginalArg(0) int arg0) {
		this.anInt2455 = arg0;
		if (this.aClass62_3 == null) {
			Static13.method219(this.anInt2455, this.anInt2461, 255, true, this, (byte) 0);
		} else {
			Static46.method1879(this.aClass62_3, this.anInt2461, this);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	@Override
	protected void method1630(@OriginalArg(1) int arg0) {
		Static89.method1399(this.anInt2461, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBZLclient!r;[B)V")
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(46) int local46;
		if (arg2 != this.aClass62_3) {
			if (!arg1 && arg0 == this.anInt2466) {
				this.aBoolean208 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray15[arg0] = false;
				if (this.aBoolean207 || arg1) {
					Static13.method219(super.anIntArray300[arg0], arg0, this.anInt2461, arg1, this, (byte) 2);
				}
			} else {
				Static25.aCRC32_2.reset();
				Static25.aCRC32_2.update(arg3, 0, arg3.length - 2);
				local46 = (int) Static25.aCRC32_2.getValue();
				@Pc(149) int local149 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
				if (super.anIntArray300[arg0] == local46 && super.anIntArray301[arg0] == local149) {
					this.aBooleanArray15[arg0] = true;
					if (arg1) {
						super.aByteArrayArray7[arg0] = arg3;
					}
				} else {
					this.aBooleanArray15[arg0] = false;
					if (this.aBoolean207 || arg1) {
						Static13.method219(super.anIntArray300[arg0], arg0, this.anInt2461, arg1, this, (byte) 2);
					}
				}
			}
		} else if (this.aBoolean208) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static13.method219(this.anInt2455, this.anInt2461, 255, true, this, (byte) 0);
		} else {
			Static25.aCRC32_2.reset();
			Static25.aCRC32_2.update(arg3, 0, arg3.length);
			local46 = (int) Static25.aCRC32_2.getValue();
			if (this.anInt2455 == local46) {
				this.method1634(arg3);
				this.method1651();
			} else {
				Static13.method219(this.anInt2455, this.anInt2461, 255, true, this, (byte) 0);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1629(@OriginalArg(0) int arg0) {
		if (this.aClass62_4 == null || this.aBooleanArray15 == null || !this.aBooleanArray15[arg0]) {
			Static13.method219(super.anIntArray300[arg0], arg0, this.anInt2461, true, this, (byte) 2);
		} else {
			Static46.method1879(this.aClass62_4, arg0, this);
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)I")
	public int method1649() {
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; super.aByteArrayArray7.length > local16; local16++) {
			if (super.anIntArray299[local16] > 0) {
				local14 += 100;
				local8 += this.method1644(local16);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local8 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	private void method1651() {
		this.aBooleanArray15 = new boolean[super.aByteArrayArray7.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray15.length; local13++) {
			this.aBooleanArray15[local13] = false;
		}
		if (this.aClass62_4 == null) {
			this.aBoolean208 = true;
			return;
		}
		this.anInt2466 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray15.length; local49++) {
			if (super.anIntArray299[local49] > 0) {
				Static44.method811(this.aClass62_4, local49, this);
				this.anInt2466 = local49;
			}
		}
		if (this.anInt2466 == -1) {
			this.aBoolean208 = true;
		}
	}
}
