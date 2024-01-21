import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
	private int anInt2406;

	@OriginalMember(owner = "client!me", name = "wb", descriptor = "I")
	private int anInt2416;

	@OriginalMember(owner = "client!me", name = "qb", descriptor = "Z")
	private volatile boolean aBoolean100 = false;

	@OriginalMember(owner = "client!me", name = "zb", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!me", name = "yb", descriptor = "I")
	private int anInt2418 = -1;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "Lclient!ge;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "Lclient!ge;")
	private final Class30 aClass30_2;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
	private final int anInt2412;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ge;Lclient!ge;IZZZ)V")
	public Class44_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass30_1 = arg1;
		this.aBoolean101 = arg5;
		this.aClass30_2 = arg0;
		this.anInt2412 = arg2;
		Static100.method1650(this.anInt2412, this);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(II)I")
	private int method1635(@OriginalArg(1) int arg0) {
		if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray13[arg0] ? 100 : Static46.method907(arg0, this.anInt2412);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1616(@OriginalArg(0) int arg0) {
		Static179.method2875(this.anInt2412, arg0);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(IB)V")
	@Override
	protected void method1630(@OriginalArg(0) int arg0) {
		if (this.aClass30_2 == null || this.aBooleanArray13 == null || !this.aBooleanArray13[arg0]) {
			Static90.method1502(arg0, true, this.anInt2412, (byte) 2, this, super.anIntArray243[arg0]);
		} else {
			Static62.method1140(this.aClass30_2, this, arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)I")
	public int method1637() {
		if (this.aBoolean100) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(23) int local23 = Static46.method907(this.anInt2412, 255);
			if (local23 >= 100) {
				local23 = 99;
			}
			return local23;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZ)V")
	public void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2406 = arg1;
		this.anInt2416 = arg0;
		if (this.aClass30_1 == null) {
			Static90.method1502(this.anInt2412, true, 255, (byte) 0, this, this.anInt2406);
		} else {
			Static62.method1140(this.aClass30_1, this, this.anInt2412);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[BBZI)V")
	public void method1640(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg0) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray239[arg3] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray239[arg3];
			if (this.aClass30_2 != null) {
				Static112.method1842(arg1, this.aClass30_2, arg3);
				this.aBooleanArray13[arg3] = true;
			}
			if (arg2) {
				super.anObjectArray29[arg3] = Static50.method995(arg1);
			}
		} else if (this.aBoolean100) {
			throw new RuntimeException();
		} else {
			if (this.aClass30_1 != null) {
				Static112.method1842(arg1, this.aClass30_1, this.anInt2412);
			}
			this.method1623(arg1);
			this.method1642();
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
	public int method1641() {
		@Pc(3) int local3 = 0;
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; super.anObjectArray29.length > local16; local16++) {
			if (super.anIntArray242[local16] > 0) {
				local14 += this.method1635(local16);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local14 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	private void method1642() {
		this.aBooleanArray13 = new boolean[super.anObjectArray29.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray13.length; local13++) {
			this.aBooleanArray13[local13] = false;
		}
		if (this.aClass30_2 == null) {
			this.aBoolean100 = true;
			return;
		}
		this.anInt2418 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.aBooleanArray13.length; local49++) {
			if (super.anIntArray242[local49] > 0) {
				Static54.method1018(this, this.aClass30_2, local49);
				this.anInt2418 = local49;
			}
		}
		if (this.anInt2418 == -1) {
			this.aBoolean100 = true;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ge;I[BIZ)V")
	public void method1645(@OriginalArg(0) Class30 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(39) int local39;
		if (arg0 != this.aClass30_1) {
			if (!arg3 && arg2 == this.anInt2418) {
				this.aBoolean100 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray13[arg2] = false;
				if (this.aBoolean101 || arg3) {
					Static90.method1502(arg2, arg3, this.anInt2412, (byte) 2, this, super.anIntArray243[arg2]);
				}
			} else {
				Static97.aCRC32_6.reset();
				Static97.aCRC32_6.update(arg1, 0, arg1.length - 2);
				local39 = (int) Static97.aCRC32_6.getValue();
				@Pc(186) int local186 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
				if (local39 == super.anIntArray243[arg2] && local186 == super.anIntArray239[arg2]) {
					this.aBooleanArray13[arg2] = true;
					if (arg3) {
						super.anObjectArray29[arg2] = Static50.method995(arg1);
					}
				} else {
					this.aBooleanArray13[arg2] = false;
					if (this.aBoolean101 || arg3) {
						Static90.method1502(arg2, arg3, this.anInt2412, (byte) 2, this, super.anIntArray243[arg2]);
					}
				}
			}
		} else if (this.aBoolean100) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static90.method1502(this.anInt2412, true, 255, (byte) 0, this, this.anInt2406);
		} else {
			Static97.aCRC32_6.reset();
			Static97.aCRC32_6.update(arg1, 0, arg1.length);
			local39 = (int) Static97.aCRC32_6.getValue();
			@Pc(46) Class3_Sub4 local46 = new Class3_Sub4(Static15.method318(arg1));
			@Pc(50) int local50 = local46.method191();
			if (local50 != 5 && local50 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local50);
			}
			@Pc(71) int local71 = 0;
			if (local50 >= 6) {
				local71 = local46.method213();
			}
			if (this.anInt2406 == local39 && this.anInt2416 == local71) {
				this.method1623(arg1);
				this.method1642();
			} else {
				Static90.method1502(this.anInt2412, true, 255, (byte) 0, this, this.anInt2406);
			}
		}
	}
}
