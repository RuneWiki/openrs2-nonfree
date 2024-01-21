import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!kd", name = "Qb", descriptor = "I")
	private int anInt1708;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
	private int anInt1701 = -1;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "Z")
	private volatile boolean aBoolean78 = false;

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "I")
	private final int anInt1707;

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Lclient!ve;")
	private final Class80 aClass80_2;

	@OriginalMember(owner = "client!kd", name = "Ub", descriptor = "Lclient!ve;")
	private final Class80 aClass80_3;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;IZZZ)V")
	public Class44_Sub1(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1707 = arg2;
		this.aClass80_2 = arg0;
		this.aClass80_3 = arg1;
		this.aBoolean80 = arg5;
		Static30.method629(this.anInt1707, this);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
	private void method1164() {
		this.aBooleanArray4 = new boolean[super.anObjectArray2.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray4.length; local9++) {
			this.aBooleanArray4[local9] = false;
		}
		if (this.aClass80_2 == null) {
			this.aBoolean78 = true;
			return;
		}
		this.anInt1701 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.aBooleanArray4.length; local47++) {
			if (super.anIntArray132[local47] > 0) {
				Static100.method1721(this, local47, this.aClass80_2);
				this.anInt1701 = local47;
			}
		}
		if (this.anInt1701 == -1) {
			this.aBoolean78 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1159(@OriginalArg(0) int arg0) {
		if (this.aClass80_2 == null || this.aBooleanArray4 == null || !this.aBooleanArray4[arg0]) {
			Static38.method697((byte) 2, this.anInt1707, arg0, super.anIntArray128[arg0], true, this);
		} else {
			Static62.method1206(this, this.aClass80_2, arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBZI[B)V")
	public void method1166(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean78) {
				throw new RuntimeException();
			}
			if (this.aClass80_3 != null) {
				Static114.method1875(this.aClass80_3, this.anInt1707, arg3);
			}
			this.method1138(arg3);
			this.method1164();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray130[arg2] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray130[arg2];
		if (this.aClass80_2 != null) {
			Static114.method1875(this.aClass80_2, arg2, arg3);
			this.aBooleanArray4[arg2] = true;
		}
		if (arg1) {
			super.anObjectArray2[arg2] = Static47.method880(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	public int method1167() {
		if (this.aBoolean78) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static5.method45(255, this.anInt1707);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)I")
	public int method1168() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; local16 < super.anObjectArray2.length; local16++) {
			if (super.anIntArray132[local16] > 0) {
				local9 += this.method1173(local16);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	@Override
	protected void method1150(@OriginalArg(0) int arg0) {
		Static105.method1752(arg0, this.anInt1707);
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V")
	public void method1170(@OriginalArg(1) int arg0) {
		this.anInt1708 = arg0;
		if (this.aClass80_3 == null) {
			Static38.method697((byte) 0, 255, this.anInt1707, this.anInt1708, true, this);
		} else {
			Static62.method1206(this, this.aClass80_3, this.anInt1707);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ve;[BIZZ)V")
	public void method1171(@OriginalArg(0) Class80 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(63) int local63;
		if (arg0 == this.aClass80_3) {
			if (this.aBoolean78) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Static38.method697((byte) 0, 255, this.anInt1707, this.anInt1708, true, this);
				return;
			}
			Static48.aCRC32_1.reset();
			Static48.aCRC32_1.update(arg1, 0, arg1.length);
			local63 = (int) Static48.aCRC32_1.getValue();
			if (local63 != this.anInt1708) {
				Static38.method697((byte) 0, 255, this.anInt1707, this.anInt1708, true, this);
				return;
			}
			this.method1138(arg1);
			this.method1164();
			return;
		}
		if (!arg3 && arg2 == this.anInt1701) {
			this.aBoolean78 = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.aBooleanArray4[arg2] = false;
			if (this.aBoolean80 || arg3) {
				Static38.method697((byte) 2, this.anInt1707, arg2, super.anIntArray128[arg2], arg3, this);
			}
			return;
		}
		Static48.aCRC32_1.reset();
		Static48.aCRC32_1.update(arg1, 0, arg1.length - 2);
		local63 = (int) Static48.aCRC32_1.getValue();
		@Pc(83) int local83 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
		if (super.anIntArray128[arg2] != local63 || super.anIntArray130[arg2] != local83) {
			this.aBooleanArray4[arg2] = false;
			if (this.aBoolean80 || arg3) {
				Static38.method697((byte) 2, this.anInt1707, arg2, super.anIntArray128[arg2], arg3, this);
			}
			return;
		}
		this.aBooleanArray4[arg2] = true;
		if (arg3) {
			super.anObjectArray2[arg2] = Static47.method880(arg1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)I")
	private int method1173(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray4[arg0] ? 100 : Static5.method45(this.anInt1707, arg0);
		} else {
			return 100;
		}
	}
}
