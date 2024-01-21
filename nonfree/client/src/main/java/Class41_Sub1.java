import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "[Z")
	private volatile boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!r", name = "yb", descriptor = "I")
	private int anInt2511;

	@OriginalMember(owner = "client!r", name = "pb", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!r", name = "vb", descriptor = "Z")
	private volatile boolean aBoolean100 = false;

	@OriginalMember(owner = "client!r", name = "Bb", descriptor = "I")
	private int anInt2513 = -1;

	@OriginalMember(owner = "client!r", name = "xb", descriptor = "Lclient!sa;")
	private final Class70 aClass70_2;

	@OriginalMember(owner = "client!r", name = "Cb", descriptor = "I")
	private final int anInt2514;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "Lclient!sa;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!sa;Lclient!sa;IZZZ)V")
	public Class41_Sub1(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean99 = arg5;
		this.aClass70_2 = arg1;
		this.anInt2514 = arg2;
		this.aClass70_1 = arg0;
		Static10.method281(this.anInt2514, this);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIZ[BI)V")
	public void method1728(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (!arg0) {
			arg2[arg2.length - 2] = (byte) (super.anIntArray383[arg3] >> 8);
			arg2[arg2.length - 1] = (byte) super.anIntArray383[arg3];
			if (this.aClass70_1 != null) {
				Static49.method866(arg2, this.aClass70_1, arg3);
				this.aBooleanArray23[arg3] = true;
			}
			if (arg1) {
				super.anObjectArray27[arg3] = Static84.method1493(arg2);
			}
		} else if (this.aBoolean100) {
			throw new RuntimeException();
		} else {
			if (this.aClass70_2 != null) {
				Static49.method866(arg2, this.aClass70_2, this.anInt2514);
			}
			this.method1714(arg2);
			this.method1729();
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(II)V")
	@Override
	protected void method1723(@OriginalArg(0) int arg0) {
		if (this.aClass70_1 == null || this.aBooleanArray23 == null || !this.aBooleanArray23[arg0]) {
			Static17.method420(arg0, true, (byte) 2, this.anInt2514, this, super.anIntArray384[arg0]);
		} else {
			Static32.method657(this.aClass70_1, arg0, this);
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	private void method1729() {
		this.aBooleanArray23 = new boolean[super.anObjectArray27.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray23.length; local13++) {
			this.aBooleanArray23[local13] = false;
		}
		if (this.aClass70_1 == null) {
			this.aBoolean100 = true;
			return;
		}
		this.anInt2513 = -1;
		for (@Pc(46) int local46 = 0; local46 < this.aBooleanArray23.length; local46++) {
			if (super.anIntArray382[local46] > 0) {
				Static19.method482(local46, this.aClass70_1, this);
				this.anInt2513 = local46;
			}
		}
		if (this.anInt2513 == -1) {
			this.aBoolean100 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(II)I")
	private int method1730(@OriginalArg(1) int arg0) {
		if (super.anObjectArray27[arg0] == null) {
			return this.aBooleanArray23[arg0] ? 100 : Static27.method586(this.anInt2514, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I")
	public int method1731() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray27.length; local11++) {
			if (super.anIntArray382[local11] > 0) {
				local5 += 100;
				local3 += this.method1730(local11);
			}
		}
		if (local5 == 0) {
			return 100;
		} else {
			return local3 * 100 / local5;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIZLclient!sa;B)V")
	public void method1732(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class70 arg3) {
		@Pc(47) int local47;
		if (this.aClass70_2 != arg3) {
			if (!arg2 && this.anInt2513 == arg1) {
				this.aBoolean100 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray23[arg1] = false;
				if (this.aBoolean99 || arg2) {
					Static17.method420(arg1, arg2, (byte) 2, this.anInt2514, this, super.anIntArray384[arg1]);
				}
			} else {
				Static32.aCRC32_2.reset();
				Static32.aCRC32_2.update(arg0, 0, arg0.length - 2);
				local47 = (int) Static32.aCRC32_2.getValue();
				@Pc(151) int local151 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
				if (super.anIntArray384[arg1] == local47 && local151 == super.anIntArray383[arg1]) {
					this.aBooleanArray23[arg1] = true;
					if (arg2) {
						super.anObjectArray27[arg1] = Static84.method1493(arg0);
					}
				} else {
					this.aBooleanArray23[arg1] = false;
					if (this.aBoolean99 || arg2) {
						Static17.method420(arg1, arg2, (byte) 2, this.anInt2514, this, super.anIntArray384[arg1]);
					}
				}
			}
		} else if (this.aBoolean100) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static17.method420(this.anInt2514, true, (byte) 0, 255, this, this.anInt2511);
		} else {
			Static32.aCRC32_2.reset();
			Static32.aCRC32_2.update(arg0, 0, arg0.length);
			local47 = (int) Static32.aCRC32_2.getValue();
			if (local47 == this.anInt2511 && super.anInt2497 == this.anInt2506) {
				this.method1714(arg0);
				this.method1729();
			} else {
				Static17.method420(this.anInt2514, true, (byte) 0, 255, this, this.anInt2511);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(II)V")
	@Override
	protected void method1713(@OriginalArg(1) int arg0) {
		Static39.method772(this.anInt2514, arg0);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I")
	public int method1735() {
		if (this.aBoolean100) {
			return 100;
		} else if (super.anObjectArray27 == null) {
			@Pc(27) int local27 = Static27.method586(255, this.anInt2514);
			if (local27 >= 100) {
				local27 = 99;
			}
			return local27;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)V")
	public void method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2506 = arg0;
		this.anInt2511 = arg1;
		if (this.aClass70_2 == null) {
			Static17.method420(this.anInt2514, true, (byte) 0, 255, this, this.anInt2511);
		} else {
			Static32.method657(this.aClass70_2, this.anInt2514, this);
		}
	}
}
