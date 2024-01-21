import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!ae", name = "ub", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
	private int anInt190 = -1;

	@OriginalMember(owner = "client!ae", name = "Cb", descriptor = "Z")
	private volatile boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ae", name = "Db", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lclient!fa;")
	private final Class22 aClass22_3;

	@OriginalMember(owner = "client!ae", name = "Eb", descriptor = "I")
	private final int anInt199;

	@OriginalMember(owner = "client!ae", name = "zb", descriptor = "Lclient!fa;")
	private final Class22 aClass22_4;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!fa;Lclient!fa;IZZZ)V")
	public Class5_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass22_3 = arg1;
		this.aBoolean11 = arg5;
		this.anInt199 = arg2;
		this.aClass22_4 = arg0;
		Static42.method938(this.anInt199, this);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(III)V")
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt193 = arg0;
		this.anInt186 = arg1;
		if (this.aClass22_3 == null) {
			Static106.method1852((byte) 0, 255, this.anInt193, this, true, this.anInt199);
		} else {
			Static97.method1744(this, this.aClass22_3, this.anInt199);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	public int method135() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(20) int local20 = 0; local20 < super.anObjectArray2.length; local20++) {
			if (super.anIntArray29[local20] > 0) {
				local9 += this.method144(local20);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BLclient!fa;ZBI)V")
	public void method136(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(65) int local65;
		if (this.aClass22_3 != arg1) {
			if (!arg2 && this.anInt190 == arg3) {
				this.aBoolean10 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray1[arg3] = false;
				if (this.aBoolean11 || arg2) {
					Static106.method1852((byte) 2, this.anInt199, super.anIntArray26[arg3], this, arg2, arg3);
				}
			} else {
				Static71.aCRC32_1.reset();
				Static71.aCRC32_1.update(arg0, 0, arg0.length - 2);
				local65 = (int) Static71.aCRC32_1.getValue();
				@Pc(85) int local85 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (super.anIntArray26[arg3] == local65 && super.anIntArray27[arg3] == local85) {
					this.aBooleanArray1[arg3] = true;
					if (arg2) {
						super.anObjectArray2[arg3] = Static55.method1240(arg0);
					}
				} else {
					this.aBooleanArray1[arg3] = false;
					if (this.aBoolean11 || arg2) {
						Static106.method1852((byte) 2, this.anInt199, super.anIntArray26[arg3], this, arg2, arg3);
					}
				}
			}
		} else if (this.aBoolean10) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static106.method1852((byte) 0, 255, this.anInt193, this, true, this.anInt199);
		} else {
			Static71.aCRC32_1.reset();
			Static71.aCRC32_1.update(arg0, 0, arg0.length);
			local65 = (int) Static71.aCRC32_1.getValue();
			@Pc(180) Class1_Sub12 local180 = new Class1_Sub12(Static79.method1480(arg0));
			@Pc(184) int local184 = local180.method1190();
			if (local184 != 5 && local184 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local184);
			}
			@Pc(205) int local205 = 0;
			if (local184 >= 6) {
				local205 = local180.method1210();
			}
			if (this.anInt193 == local65 && this.anInt186 == local205) {
				this.method126(arg0);
				this.method143();
			} else {
				Static106.method1852((byte) 0, 255, this.anInt193, this, true, this.anInt199);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	@Override
	protected void method115(@OriginalArg(1) int arg0) {
		Static76.method1454(arg0, this.anInt199);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZ[BB)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) {
		if (arg1) {
			if (this.aBoolean10) {
				throw new RuntimeException();
			}
			if (this.aClass22_3 != null) {
				Static73.method1455(arg3, this.aClass22_3, this.anInt199);
			}
			this.method126(arg3);
			this.method143();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray27[arg0] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray27[arg0];
		if (this.aClass22_4 != null) {
			Static73.method1455(arg3, this.aClass22_4, arg0);
			this.aBooleanArray1[arg0] = true;
		}
		if (arg2) {
			super.anObjectArray2[arg0] = Static55.method1240(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
	public int method141() {
		if (this.aBoolean10) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static108.method111(255, this.anInt199);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	@Override
	protected void method121(@OriginalArg(0) int arg0) {
		if (this.aClass22_4 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static106.method1852((byte) 2, this.anInt199, super.anIntArray26[arg0], this, true, arg0);
		} else {
			Static97.method1744(this, this.aClass22_4, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
	private void method143() {
		this.aBooleanArray1 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray1.length; local13++) {
			this.aBooleanArray1[local13] = false;
		}
		if (this.aClass22_4 == null) {
			this.aBoolean10 = true;
			return;
		}
		this.anInt190 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.aBooleanArray1.length; local47++) {
			if (super.anIntArray29[local47] > 0) {
				Static105.method1845(this.aClass22_4, local47, this);
				this.anInt190 = local47;
			}
		}
		if (this.anInt190 == -1) {
			this.aBoolean10 = true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)I")
	private int method144(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static108.method111(this.anInt199, arg0);
		} else {
			return 100;
		}
	}
}
