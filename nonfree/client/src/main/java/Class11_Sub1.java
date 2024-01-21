import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "I")
	private int anInt731;

	@OriginalMember(owner = "client!ce", name = "Sb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ce", name = "Ab", descriptor = "Z")
	private volatile boolean aBoolean50 = false;

	@OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
	private int anInt735 = -1;

	@OriginalMember(owner = "client!ce", name = "Hb", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ce", name = "Jb", descriptor = "Lclient!pb;")
	private final Class60 aClass60_2;

	@OriginalMember(owner = "client!ce", name = "nb", descriptor = "Lclient!pb;")
	private final Class60 aClass60_1;

	@OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
	private final int anInt734;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IZZZ)V")
	public Class11_Sub1(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean52 = arg5;
		this.aClass60_2 = arg1;
		this.aClass60_1 = arg0;
		this.anInt734 = arg2;
		Static121.method1963(this, this.anInt734);
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I")
	public int method399() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray2.length > local11; local11++) {
			if (super.anIntArray94[local11] > 0) {
				local7 += 100;
				local9 += this.method406(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
	@Override
	protected void method396(@OriginalArg(1) int arg0) {
		Static95.method1462(arg0, this.anInt734);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!pb;ZIB[B)V")
	public void method401(@OriginalArg(0) Class60 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(63) int local63;
		if (arg0 == this.aClass60_2) {
			if (this.aBoolean50) {
				throw new RuntimeException();
			}
			if (arg3 == null) {
				Static31.method574((byte) 0, this.anInt734, 255, this, this.anInt731, true);
				return;
			}
			Static16.aCRC32_1.reset();
			Static16.aCRC32_1.update(arg3, 0, arg3.length);
			local63 = (int) Static16.aCRC32_1.getValue();
			if (local63 != this.anInt731) {
				Static31.method574((byte) 0, this.anInt734, 255, this, this.anInt731, true);
				return;
			}
			this.method374(arg3);
			this.method409();
			return;
		}
		if (!arg1 && this.anInt735 == arg2) {
			this.aBoolean50 = true;
		}
		if (arg3 == null || arg3.length <= 2) {
			this.aBooleanArray7[arg2] = false;
			if (this.aBoolean52 || arg1) {
				Static31.method574((byte) 2, arg2, this.anInt734, this, super.anIntArray92[arg2], arg1);
			}
			return;
		}
		Static16.aCRC32_1.reset();
		Static16.aCRC32_1.update(arg3, 0, arg3.length - 2);
		local63 = (int) Static16.aCRC32_1.getValue();
		@Pc(84) int local84 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
		if (super.anIntArray92[arg2] != local63 || super.anIntArray91[arg2] != local84) {
			this.aBooleanArray7[arg2] = false;
			if (this.aBoolean52 || arg1) {
				Static31.method574((byte) 2, arg2, this.anInt734, this, super.anIntArray92[arg2], arg1);
			}
			return;
		}
		this.aBooleanArray7[arg2] = true;
		if (arg1) {
			super.anObjectArray2[arg2] = Static102.method1659(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(ZI)V")
	@Override
	protected void method397(@OriginalArg(1) int arg0) {
		if (this.aClass60_1 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static31.method574((byte) 2, arg0, this.anInt734, this, super.anIntArray92[arg0], true);
		} else {
			Static93.method1447(this, arg0, this.aClass60_1);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZI[BI)V")
	public void method403(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		if (!arg1) {
			arg3[arg3.length - 2] = (byte) (super.anIntArray91[arg2] >> 8);
			arg3[arg3.length - 1] = (byte) super.anIntArray91[arg2];
			if (this.aClass60_1 != null) {
				Static64.method1078(arg3, this.aClass60_1, arg2);
				this.aBooleanArray7[arg2] = true;
			}
			if (arg0) {
				super.anObjectArray2[arg2] = Static102.method1659(arg3);
			}
		} else if (this.aBoolean50) {
			throw new RuntimeException();
		} else {
			if (this.aClass60_2 != null) {
				Static64.method1078(arg3, this.aClass60_2, this.anInt734);
			}
			this.method374(arg3);
			this.method409();
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(ZI)V")
	public void method405(@OriginalArg(1) int arg0) {
		this.anInt731 = arg0;
		if (this.aClass60_2 == null) {
			Static31.method574((byte) 0, this.anInt734, 255, this, this.anInt731, true);
		} else {
			Static93.method1447(this, this.anInt734, this.aClass60_2);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(IB)I")
	private int method406(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static119.method1004(this.anInt734, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)I")
	public int method408() {
		if (this.aBoolean50) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static119.method1004(255, this.anInt734);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)V")
	private void method409() {
		this.aBooleanArray7 = new boolean[super.anObjectArray2.length];
		for (@Pc(19) int local19 = 0; local19 < this.aBooleanArray7.length; local19++) {
			this.aBooleanArray7[local19] = false;
		}
		if (this.aClass60_1 == null) {
			this.aBoolean50 = true;
			return;
		}
		this.anInt735 = -1;
		for (@Pc(44) int local44 = 0; local44 < this.aBooleanArray7.length; local44++) {
			if (super.anIntArray94[local44] > 0) {
				Static115.method1863(this.aClass60_1, local44, this);
				this.anInt735 = local44;
			}
		}
		if (this.anInt735 == -1) {
			this.aBoolean50 = true;
		}
	}
}
