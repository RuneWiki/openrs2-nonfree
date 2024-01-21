import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "I")
	private int anInt1420;

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "Z")
	private volatile boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "I")
	private int anInt1427 = -1;

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "Lclient!d;")
	private final Class16 aClass16_3;

	@OriginalMember(owner = "client!ke", name = "Hb", descriptor = "I")
	private final int anInt1431;

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "Lclient!d;")
	private final Class16 aClass16_2;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!d;Lclient!d;IZZZ)V")
	public Class41_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass16_3 = arg1;
		this.anInt1431 = arg2;
		this.aClass16_2 = arg0;
		this.aBoolean82 = arg5;
		Static65.method1109(this, this.anInt1431);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	public int method1076() {
		if (this.aBoolean80) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(23) int local23 = Static27.method672(255, this.anInt1431);
			if (local23 >= 100) {
				local23 = 99;
			}
			return local23;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)I")
	private int method1077(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray5[arg0] ? 100 : Static27.method672(this.anInt1431, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V")
	public void method1079(@OriginalArg(1) int arg0) {
		this.anInt1420 = arg0;
		if (this.aClass16_3 == null) {
			Static106.method1740(this, this.anInt1431, this.anInt1420, 255, (byte) 0, true);
		} else {
			Static58.method974(this.aClass16_3, this.anInt1431, this);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	@Override
	protected void method1060(@OriginalArg(0) int arg0) {
		if (this.aClass16_2 == null || this.aBooleanArray5 == null || !this.aBooleanArray5[arg0]) {
			Static106.method1740(this, arg0, super.anIntArray217[arg0], this.anInt1431, (byte) 2, true);
		} else {
			Static58.method974(this.aClass16_2, arg0, this);
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	private void method1081() {
		this.aBooleanArray5 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray5.length; local13++) {
			this.aBooleanArray5[local13] = false;
		}
		if (this.aClass16_2 == null) {
			this.aBoolean80 = true;
			return;
		}
		this.anInt1427 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray5.length; local42++) {
			if (super.anIntArray218[local42] > 0) {
				Static50.method911(local42, this, this.aClass16_2);
				this.anInt1427 = local42;
			}
		}
		if (this.anInt1427 == -1) {
			this.aBoolean80 = true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[BLclient!d;Z)V")
	public void method1082(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(45) int local45;
		if (this.aClass16_3 != arg2) {
			if (!arg3 && this.anInt1427 == arg0) {
				this.aBoolean80 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray5[arg0] = false;
				if (this.aBoolean82 || arg3) {
					Static106.method1740(this, arg0, super.anIntArray217[arg0], this.anInt1431, (byte) 2, arg3);
				}
			} else {
				Static89.aCRC32_1.reset();
				Static89.aCRC32_1.update(arg1, 0, arg1.length - 2);
				local45 = (int) Static89.aCRC32_1.getValue();
				@Pc(149) int local149 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (local45 == super.anIntArray217[arg0] && local149 == super.anIntArray219[arg0]) {
					this.aBooleanArray5[arg0] = true;
					if (arg3) {
						super.anObjectArray2[arg0] = Static117.method2065(arg1);
					}
				} else {
					this.aBooleanArray5[arg0] = false;
					if (this.aBoolean82 || arg3) {
						Static106.method1740(this, arg0, super.anIntArray217[arg0], this.anInt1431, (byte) 2, arg3);
					}
				}
			}
		} else if (this.aBoolean80) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static106.method1740(this, this.anInt1431, this.anInt1420, 255, (byte) 0, true);
		} else {
			Static89.aCRC32_1.reset();
			Static89.aCRC32_1.update(arg1, 0, arg1.length);
			local45 = (int) Static89.aCRC32_1.getValue();
			if (local45 == this.anInt1420) {
				this.method1056(arg1);
				this.method1081();
			} else {
				Static106.method1740(this, this.anInt1431, this.anInt1420, 255, (byte) 0, true);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIB[BZ)V")
	public void method1084(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg2[arg2.length - 2] = (byte) (super.anIntArray219[arg1] >> 8);
			arg2[arg2.length - 1] = (byte) super.anIntArray219[arg1];
			if (this.aClass16_2 != null) {
				Static100.method1608(arg2, this.aClass16_2, arg1);
				this.aBooleanArray5[arg1] = true;
			}
			if (arg0) {
				super.anObjectArray2[arg1] = Static117.method2065(arg2);
			}
		} else if (this.aBoolean80) {
			throw new RuntimeException();
		} else {
			if (this.aClass16_3 != null) {
				Static100.method1608(arg2, this.aClass16_3, this.anInt1431);
			}
			this.method1056(arg2);
			this.method1081();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1052(@OriginalArg(0) int arg0) {
		Static95.method1565(this.anInt1431, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I")
	public int method1085() {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; super.anObjectArray2.length > local19; local19++) {
			if (super.anIntArray218[local19] > 0) {
				local15 += 100;
				local17 += this.method1077(local19);
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local17 * 100 / local15;
		}
	}
}
