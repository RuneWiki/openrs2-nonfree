import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
	private int anInt1426;

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
	private int anInt1419 = -1;

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "Z")
	private volatile boolean aBoolean61 = false;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
	private final int anInt1414;

	@OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lclient!ug;")
	private final Class83 aClass83_3;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lclient!ug;")
	private final Class83 aClass83_2;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!ug;Lclient!ug;IZZZ)V")
	public Class29_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt1414 = arg2;
		this.aClass83_3 = arg0;
		this.aClass83_2 = arg1;
		this.aBoolean60 = arg5;
		Static164.method2486(this.anInt1414, this);
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(II)I")
	private int method1041(@OriginalArg(0) int arg0) {
		if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray7[arg0] ? 100 : Static144.method2256(arg0, this.anInt1414);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1024(@OriginalArg(1) int arg0) {
		if (this.aClass83_3 == null || this.aBooleanArray7 == null || !this.aBooleanArray7[arg0]) {
			Static143.method2252(arg0, (byte) 2, this.anInt1414, true, this, super.anIntArray162[arg0]);
		} else {
			Static145.method1880(arg0, this.aClass83_3, this);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(III)V")
	public void method1042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1426 = arg0;
		this.anInt1428 = arg1;
		if (this.aClass83_2 == null) {
			Static143.method2252(this.anInt1414, (byte) 0, 255, true, this, this.anInt1426);
		} else {
			Static145.method1880(this.anInt1414, this.aClass83_2, this);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZI[B)V")
	public void method1043(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean61) {
				throw new RuntimeException();
			}
			if (this.aClass83_2 != null) {
				Static41.method795(this.anInt1414, arg3, this.aClass83_2);
			}
			this.method1040(arg3);
			this.method1044();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray160[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray160[arg1];
		if (this.aClass83_3 != null) {
			Static41.method795(arg1, arg3, this.aClass83_3);
			this.aBooleanArray7[arg1] = true;
		}
		if (arg2) {
			super.anObjectArray28[arg1] = Static92.method1560(arg3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	private void method1044() {
		this.aBooleanArray7 = new boolean[super.anObjectArray28.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray7.length; local13++) {
			this.aBooleanArray7[local13] = false;
		}
		if (this.aClass83_3 == null) {
			this.aBoolean61 = true;
			return;
		}
		this.anInt1419 = -1;
		for (@Pc(40) int local40 = 0; local40 < this.aBooleanArray7.length; local40++) {
			if (super.anIntArray163[local40] > 0) {
				Static16.method261(this, local40, this.aClass83_3);
				this.anInt1419 = local40;
			}
		}
		if (this.anInt1419 == -1) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
	public int method1045() {
		if (this.aBoolean61) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(19) int local19 = Static144.method2256(this.anInt1414, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZILclient!ug;[B)V")
	public void method1046(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83 arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(39) int local39;
		if (this.aClass83_2 != arg2) {
			if (!arg0 && arg1 == this.anInt1419) {
				this.aBoolean61 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray7[arg1] = false;
				if (this.aBoolean60 || arg0) {
					Static143.method2252(arg1, (byte) 2, this.anInt1414, arg0, this, super.anIntArray162[arg1]);
				}
			} else {
				Static39.aCRC32_13.reset();
				Static39.aCRC32_13.update(arg3, 0, arg3.length - 2);
				local39 = (int) Static39.aCRC32_13.getValue();
				@Pc(188) int local188 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
				if (super.anIntArray162[arg1] == local39 && super.anIntArray160[arg1] == local188) {
					this.aBooleanArray7[arg1] = true;
					if (arg0) {
						super.anObjectArray28[arg1] = Static92.method1560(arg3);
					}
				} else {
					this.aBooleanArray7[arg1] = false;
					if (this.aBoolean60 || arg0) {
						Static143.method2252(arg1, (byte) 2, this.anInt1414, arg0, this, super.anIntArray162[arg1]);
					}
				}
			}
		} else if (this.aBoolean61) {
			throw new RuntimeException();
		} else if (arg3 == null) {
			Static143.method2252(this.anInt1414, (byte) 0, 255, true, this, this.anInt1426);
		} else {
			Static39.aCRC32_13.reset();
			Static39.aCRC32_13.update(arg3, 0, arg3.length);
			local39 = (int) Static39.aCRC32_13.getValue();
			@Pc(46) Class2_Sub11 local46 = new Class2_Sub11(Static116.method1884(arg3));
			@Pc(50) int local50 = local46.method1461();
			if (local50 != 5 && local50 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local50);
			}
			@Pc(69) int local69 = 0;
			if (local50 >= 6) {
				local69 = local46.method1449();
			}
			if (local39 == this.anInt1426 && local69 == this.anInt1428) {
				this.method1040(arg3);
				this.method1044();
			} else {
				Static143.method2252(this.anInt1414, (byte) 0, 255, true, this, this.anInt1426);
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method1018(@OriginalArg(0) int arg0) {
		Static60.method1094(arg0, this.anInt1414);
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)I")
	public int method1049() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; super.anObjectArray28.length > local16; local16++) {
			if (super.anIntArray163[local16] > 0) {
				local7 += 100;
				local9 += this.method1041(local16);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}
}
