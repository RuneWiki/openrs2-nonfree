import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!ea", name = "ob", descriptor = "[Z")
	private volatile boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ea", name = "Bb", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!ea", name = "nb", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!ea", name = "ub", descriptor = "I")
	private int anInt749 = -1;

	@OriginalMember(owner = "client!ea", name = "sb", descriptor = "Z")
	private volatile boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lclient!u;")
	private final Class75 aClass75_2;

	@OriginalMember(owner = "client!ea", name = "rb", descriptor = "I")
	private final int anInt747;

	@OriginalMember(owner = "client!ea", name = "Ab", descriptor = "Lclient!u;")
	private final Class75 aClass75_3;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!u;Lclient!u;IZZZ)V")
	public Class20_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass75_2 = arg0;
		this.aBoolean32 = arg5;
		this.anInt747 = arg2;
		this.aClass75_3 = arg1;
		Static35.method593(this, this.anInt747);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!u;[BII)V")
	public void method492(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(61) int local61;
		if (arg1 == this.aClass75_3) {
			if (this.aBoolean33) {
				throw new RuntimeException();
			}
			if (arg2 == null) {
				Static74.method1215(this.anInt754, 255, this.anInt747, this, true, (byte) 0);
				return;
			}
			Static70.aCRC32_2.reset();
			Static70.aCRC32_2.update(arg2, 0, arg2.length);
			local61 = (int) Static70.aCRC32_2.getValue();
			if (this.anInt754 != local61 || super.anInt719 != this.anInt737) {
				Static74.method1215(this.anInt754, 255, this.anInt747, this, true, (byte) 0);
				return;
			}
			this.method488(arg2);
			this.method496();
			return;
		}
		if (!arg0 && arg3 == this.anInt749) {
			this.aBoolean33 = true;
		}
		if (arg2 == null || arg2.length <= 2) {
			this.aBooleanArray8[arg3] = false;
			if (this.aBoolean32 || arg0) {
				Static74.method1215(super.anIntArray76[arg3], this.anInt747, arg3, this, arg0, (byte) 2);
			}
			return;
		}
		Static70.aCRC32_2.reset();
		Static70.aCRC32_2.update(arg2, 0, arg2.length - 2);
		local61 = (int) Static70.aCRC32_2.getValue();
		@Pc(82) int local82 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
		if (super.anIntArray76[arg3] != local61 || super.anIntArray82[arg3] != local82) {
			this.aBooleanArray8[arg3] = false;
			if (this.aBoolean32 || arg0) {
				Static74.method1215(super.anIntArray76[arg3], this.anInt747, arg3, this, arg0, (byte) 2);
			}
			return;
		}
		this.aBooleanArray8[arg3] = true;
		if (arg0) {
			super.anObjectArray2[arg3] = Static71.method1198(arg2);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	@Override
	protected void method485(@OriginalArg(0) int arg0) {
		if (this.aClass75_2 == null || this.aBooleanArray8 == null || !this.aBooleanArray8[arg0]) {
			Static74.method1215(super.anIntArray76[arg0], this.anInt747, arg0, this, true, (byte) 2);
		} else {
			Static27.method503(arg0, this, this.aClass75_2);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I")
	public int method495() {
		if (this.aBoolean33) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(26) int local26 = Static58.method1045(this.anInt747, 255);
			if (local26 >= 100) {
				local26 = 99;
			}
			return local26;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	@Override
	protected void method470(@OriginalArg(0) int arg0) {
		Static30.method523(arg0, this.anInt747);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	private void method496() {
		this.aBooleanArray8 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray8.length; local13++) {
			this.aBooleanArray8[local13] = false;
		}
		if (this.aClass75_2 == null) {
			this.aBoolean33 = true;
			return;
		}
		this.anInt749 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray8.length; local42++) {
			if (super.anIntArray80[local42] > 0) {
				Static30.method527(this, local42, this.aClass75_2);
				this.anInt749 = local42;
			}
		}
		if (this.anInt749 == -1) {
			this.aBoolean33 = true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ[BZI)V")
	public void method498(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg0) {
			if (this.aBoolean33) {
				throw new RuntimeException();
			}
			if (this.aClass75_3 != null) {
				Static29.method509(arg1, this.aClass75_3, this.anInt747);
			}
			this.method488(arg1);
			this.method496();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray82[arg3] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray82[arg3];
		if (this.aClass75_2 != null) {
			Static29.method509(arg1, this.aClass75_2, arg3);
			this.aBooleanArray8[arg3] = true;
		}
		if (arg2) {
			super.anObjectArray2[arg3] = Static71.method1198(arg1);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)I")
	private int method499(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray8[arg0] ? 100 : Static58.method1045(arg0, this.anInt747);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)I")
	public int method500() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray2.length > local11; local11++) {
			if (super.anIntArray80[local11] > 0) {
				local9 += this.method499(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZII)V")
	public void method501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt754 = arg0;
		this.anInt737 = arg1;
		if (this.aClass75_3 == null) {
			Static74.method1215(this.anInt754, 255, this.anInt747, this, true, (byte) 0);
		} else {
			Static27.method503(this.anInt747, this, this.aClass75_3);
		}
	}
}
