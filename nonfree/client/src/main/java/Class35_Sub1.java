import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!pa", name = "sb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
	private int anInt2398 = -1;

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "Z")
	private volatile boolean aBoolean127 = false;

	@OriginalMember(owner = "client!pa", name = "Db", descriptor = "I")
	private final int anInt2408;

	@OriginalMember(owner = "client!pa", name = "qb", descriptor = "Lclient!ic;")
	private final Class33 aClass33_3;

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lclient!ic;")
	private final Class33 aClass33_2;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!ic;Lclient!ic;IZZZ)V")
	public Class35_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean128 = arg5;
		this.anInt2408 = arg2;
		this.aClass33_3 = arg1;
		this.aClass33_2 = arg0;
		Static58.method1028(this, this.anInt2408);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZI[BLclient!ic;)V")
	public void method1583(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class33 arg3) {
		@Pc(69) int local69;
		if (arg3 != this.aClass33_3) {
			if (!arg0 && arg1 == this.anInt2398) {
				this.aBoolean127 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray16[arg1] = false;
				if (this.aBoolean128 || arg0) {
					Static91.method1558(arg1, (byte) 2, super.anIntArray301[arg1], this.anInt2408, arg0, this);
				}
			} else {
				Static32.aCRC32_3.reset();
				Static32.aCRC32_3.update(arg2, 0, arg2.length - 2);
				local69 = (int) Static32.aCRC32_3.getValue();
				@Pc(89) int local89 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
				if (super.anIntArray301[arg1] == local69 && local89 == super.anIntArray304[arg1]) {
					this.aBooleanArray16[arg1] = true;
					if (arg0) {
						super.anObjectArray28[arg1] = Static85.method1459(arg2);
					}
				} else {
					this.aBooleanArray16[arg1] = false;
					if (this.aBoolean128 || arg0) {
						Static91.method1558(arg1, (byte) 2, super.anIntArray301[arg1], this.anInt2408, arg0, this);
					}
				}
			}
		} else if (this.aBoolean127) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static91.method1558(this.anInt2408, (byte) 0, this.anInt2395, 255, true, this);
		} else {
			Static32.aCRC32_3.reset();
			Static32.aCRC32_3.update(arg2, 0, arg2.length);
			local69 = (int) Static32.aCRC32_3.getValue();
			@Pc(183) Class1_Sub19 local183 = new Class1_Sub19(Static62.method1062(arg2));
			@Pc(187) int local187 = local183.method2072();
			if (local187 != 5 && local187 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local187);
			}
			@Pc(208) int local208 = 0;
			if (local187 >= 6) {
				local208 = local183.method2046();
			}
			if (this.anInt2395 == local69 && local208 == this.anInt2393) {
				this.method1578(arg2);
				this.method1587();
			} else {
				Static91.method1558(this.anInt2408, (byte) 0, this.anInt2395, 255, true, this);
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
	@Override
	protected void method1572(@OriginalArg(1) int arg0) {
		Static17.method391(this.anInt2408, arg0);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(IB)I")
	private int method1584(@OriginalArg(0) int arg0) {
		if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray16[arg0] ? 100 : Static10.method278(this.anInt2408, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public void method1585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2395 = arg0;
		this.anInt2393 = arg1;
		if (this.aClass33_3 == null) {
			Static91.method1558(this.anInt2408, (byte) 0, this.anInt2395, 255, true, this);
		} else {
			Static22.method454(this.aClass33_3, this.anInt2408, this);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)I")
	public int method1586() {
		if (this.aBoolean127) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(19) int local19 = Static10.method278(255, this.anInt2408);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	private void method1587() {
		this.aBooleanArray16 = new boolean[super.anObjectArray28.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray16.length; local13++) {
			this.aBooleanArray16[local13] = false;
		}
		if (this.aClass33_2 == null) {
			this.aBoolean127 = true;
			return;
		}
		this.anInt2398 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray16.length; local42++) {
			if (super.anIntArray302[local42] > 0) {
				Static60.method1047(this.aClass33_2, local42, this);
				this.anInt2398 = local42;
			}
		}
		if (this.anInt2398 == -1) {
			this.aBoolean127 = true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZBIZ[B)V")
	public void method1588(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean127) {
				throw new RuntimeException();
			}
			if (this.aClass33_3 != null) {
				Static58.method1029(arg3, this.aClass33_3, this.anInt2408);
			}
			this.method1578(arg3);
			this.method1587();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray304[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray304[arg1];
		if (this.aClass33_2 != null) {
			Static58.method1029(arg3, this.aClass33_2, arg1);
			this.aBooleanArray16[arg1] = true;
		}
		if (arg2) {
			super.anObjectArray28[arg1] = Static85.method1459(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
	public int method1590() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray28.length > local11; local11++) {
			if (super.anIntArray302[local11] > 0) {
				local7 += 100;
				local9 += this.method1584(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1559(@OriginalArg(1) int arg0) {
		if (this.aClass33_2 == null || this.aBooleanArray16 == null || !this.aBooleanArray16[arg0]) {
			Static91.method1558(arg0, (byte) 2, super.anIntArray301[arg0], this.anInt2408, true, this);
		} else {
			Static22.method454(this.aClass33_2, arg0, this);
		}
	}
}
