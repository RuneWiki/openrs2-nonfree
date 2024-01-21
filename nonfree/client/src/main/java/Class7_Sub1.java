import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
	private int anInt1214;

	@OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
	private int anInt1219;

	@OriginalMember(owner = "client!fd", name = "jb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
	private int anInt1218 = -1;

	@OriginalMember(owner = "client!fd", name = "fb", descriptor = "Z")
	private volatile boolean aBoolean63 = false;

	@OriginalMember(owner = "client!fd", name = "qb", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
	private final int anInt1217;

	@OriginalMember(owner = "client!fd", name = "tb", descriptor = "Lclient!gg;")
	private final Class34 aClass34_3;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lclient!gg;")
	private final Class34 aClass34_2;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!gg;Lclient!gg;IZZZ)V")
	public Class7_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1217 = arg2;
		this.aBoolean64 = arg5;
		this.aClass34_3 = arg0;
		this.aClass34_2 = arg1;
		Static59.method1342(this, this.anInt1217);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BZZI)V")
	public void method1035(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg2) {
			if (this.aBoolean63) {
				throw new RuntimeException();
			}
			if (this.aClass34_2 != null) {
				Static157.method2974(arg1, this.aClass34_2, this.anInt1217);
			}
			this.method1017(arg1);
			this.method1045();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray223[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray223[arg0];
		if (this.aClass34_3 != null) {
			Static157.method2974(arg1, this.aClass34_3, arg0);
			this.aBooleanArray7[arg0] = true;
		}
		if (arg3) {
			super.anObjectArray3[arg0] = Static47.method1123(arg1);
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)V")
	public void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1219 = arg0;
		this.anInt1214 = arg1;
		if (this.aClass34_2 == null) {
			Static62.method1459(true, this.anInt1217, this.anInt1219, this, 255, (byte) 0);
		} else {
			Static78.method1815(this.aClass34_2, this.anInt1217, this);
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I")
	public int method1040() {
		if (this.aBoolean63) {
			return 100;
		} else if (super.anObjectArray3 == null) {
			@Pc(19) int local19 = Static96.method3169(this.anInt1217, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!gg;BZ[B)V")
	public void method1043(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(43) int local43;
		if (arg1 != this.aClass34_2) {
			if (!arg2 && arg0 == this.anInt1218) {
				this.aBoolean63 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray7[arg0] = false;
				if (this.aBoolean64 || arg2) {
					Static62.method1459(arg2, arg0, super.anIntArray226[arg0], this, this.anInt1217, (byte) 2);
				}
			} else {
				Static81.aCRC32_1.reset();
				Static81.aCRC32_1.update(arg3, 0, arg3.length - 2);
				local43 = (int) Static81.aCRC32_1.getValue();
				@Pc(187) int local187 = (arg3[arg3.length - 1] & 0xFF) + ((arg3[arg3.length - 2] & 0xFF) << 8);
				if (super.anIntArray226[arg0] == local43 && super.anIntArray223[arg0] == local187) {
					this.aBooleanArray7[arg0] = true;
					if (arg2) {
						super.anObjectArray3[arg0] = Static47.method1123(arg3);
					}
				} else {
					this.aBooleanArray7[arg0] = false;
					if (this.aBoolean64 || arg2) {
						Static62.method1459(arg2, arg0, super.anIntArray226[arg0], this, this.anInt1217, (byte) 2);
					}
				}
			}
		} else if (this.aBoolean63) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static62.method1459(true, this.anInt1217, this.anInt1219, this, 255, (byte) 0);
		} else {
			Static81.aCRC32_1.reset();
			Static81.aCRC32_1.update(arg3, 0, arg3.length);
			local43 = (int) Static81.aCRC32_1.getValue();
			@Pc(50) Class3_Sub8 local50 = new Class3_Sub8(Static118.method2372(arg3));
			@Pc(54) int local54 = local50.method1545();
			if (local54 != 5 && local54 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local54);
			}
			@Pc(75) int local75 = 0;
			if (local54 >= 6) {
				local75 = local50.method1540();
			}
			if (local43 == this.anInt1219 && this.anInt1214 == local75) {
				this.method1017(arg3);
				this.method1045();
			} else {
				Static62.method1459(true, this.anInt1217, this.anInt1219, this, 255, (byte) 0);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
	public int method1044() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; super.anObjectArray3.length > local11; local11++) {
			if (super.anIntArray227[local11] > 0) {
				local9 += this.method1046(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
	private void method1045() {
		this.aBooleanArray7 = new boolean[super.anObjectArray3.length];
		for (@Pc(11) int local11 = 0; local11 < this.aBooleanArray7.length; local11++) {
			this.aBooleanArray7[local11] = false;
		}
		if (this.aClass34_3 == null) {
			this.aBoolean63 = true;
			return;
		}
		this.anInt1218 = -1;
		for (@Pc(35) int local35 = 0; local35 < this.aBooleanArray7.length; local35++) {
			if (super.anIntArray227[local35] > 0) {
				Static170.method3100(this.aClass34_3, local35, this);
				this.anInt1218 = local35;
			}
		}
		if (this.anInt1218 == -1) {
			this.aBoolean63 = true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1020(@OriginalArg(1) int arg0) {
		if (this.aClass34_3 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static62.method1459(true, arg0, super.anIntArray226[arg0], this, this.anInt1217, (byte) 2);
		} else {
			Static78.method1815(this.aClass34_3, arg0, this);
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)I")
	private int method1046(@OriginalArg(1) int arg0) {
		if (super.anObjectArray3[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static96.method3169(arg0, this.anInt1217);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
	@Override
	protected void method1024(@OriginalArg(1) int arg0) {
		Static155.method2952(arg0, this.anInt1217);
	}
}
