import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
	private int anInt1495;

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
	private int anInt1496;

	@OriginalMember(owner = "client!jf", name = "sb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
	private int anInt1493 = -1;

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!jf", name = "kb", descriptor = "Z")
	private volatile boolean aBoolean56 = false;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lclient!jc;")
	private final Class40 aClass40_3;

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
	private final int anInt1489;

	@OriginalMember(owner = "client!jf", name = "tb", descriptor = "Lclient!jc;")
	private final Class40 aClass40_4;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!jc;Lclient!jc;IZZZ)V")
	public Class26_Sub1(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass40_3 = arg0;
		this.anInt1489 = arg2;
		this.aBoolean55 = arg5;
		this.aClass40_4 = arg1;
		Static54.method988(this.anInt1489, this);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IB)I")
	private int method1047(@OriginalArg(0) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray9[arg0] ? 100 : Static87.method1547(this.anInt1489, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)V")
	public void method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1496 = arg1;
		this.anInt1495 = arg0;
		if (this.aClass40_4 == null) {
			Static25.method507(255, true, this.anInt1495, (byte) 0, this.anInt1489, this);
		} else {
			Static83.method1507(this.aClass40_4, this, this.anInt1489);
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)I")
	public int method1049() {
		if (this.aBoolean56) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static87.method1547(255, this.anInt1489);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BZ[BIZ)V")
	public void method1050(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0) {
			if (this.aBoolean56) {
				throw new RuntimeException();
			}
			if (this.aClass40_4 != null) {
				Static111.method1834(this.aClass40_4, this.anInt1489, arg1);
			}
			this.method1043(arg1);
			this.method1056();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray222[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray222[arg2];
		if (this.aClass40_3 != null) {
			Static111.method1834(this.aClass40_3, arg2, arg1);
			this.aBooleanArray9[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray2[arg2] = Static39.method733(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!jc;[BIZB)V")
	public void method1051(@OriginalArg(0) Class40 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(67) int local67;
		if (this.aClass40_4 != arg0) {
			if (!arg3 && this.anInt1493 == arg2) {
				this.aBoolean56 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray9[arg2] = false;
				if (this.aBoolean55 || arg3) {
					Static25.method507(this.anInt1489, arg3, super.anIntArray219[arg2], (byte) 2, arg2, this);
				}
			} else {
				Static59.aCRC32_2.reset();
				Static59.aCRC32_2.update(arg1, 0, arg1.length - 2);
				local67 = (int) Static59.aCRC32_2.getValue();
				@Pc(87) int local87 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (local67 == super.anIntArray219[arg2] && super.anIntArray222[arg2] == local87) {
					this.aBooleanArray9[arg2] = true;
					if (arg3) {
						super.anObjectArray2[arg2] = Static39.method733(arg1);
					}
				} else {
					this.aBooleanArray9[arg2] = false;
					if (this.aBoolean55 || arg3) {
						Static25.method507(this.anInt1489, arg3, super.anIntArray219[arg2], (byte) 2, arg2, this);
					}
				}
			}
		} else if (this.aBoolean56) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static25.method507(255, true, this.anInt1495, (byte) 0, this.anInt1489, this);
		} else {
			Static59.aCRC32_2.reset();
			Static59.aCRC32_2.update(arg1, 0, arg1.length);
			local67 = (int) Static59.aCRC32_2.getValue();
			@Pc(185) Class5_Sub14 local185 = new Class5_Sub14(Static36.method700(arg1));
			@Pc(189) int local189 = local185.method1471();
			if (local189 != 5 && local189 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local189);
			}
			@Pc(212) int local212 = 0;
			if (local189 >= 6) {
				local212 = local185.method1461();
			}
			if (this.anInt1495 == local67 && this.anInt1496 == local212) {
				this.method1043(arg1);
				this.method1056();
			} else {
				Static25.method507(255, true, this.anInt1495, (byte) 0, this.anInt1489, this);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	@Override
	protected void method1026(@OriginalArg(1) int arg0) {
		if (this.aClass40_3 == null || this.aBooleanArray9 == null || !this.aBooleanArray9[arg0]) {
			Static25.method507(this.anInt1489, true, super.anIntArray219[arg0], (byte) 2, arg0, this);
		} else {
			Static83.method1507(this.aClass40_3, this, arg0);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1036(@OriginalArg(0) int arg0) {
		Static83.method1500(arg0, this.anInt1489);
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
	public int method1052() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(19) int local19 = 0; super.anObjectArray2.length > local19; local19++) {
			if (super.anIntArray224[local19] > 0) {
				local7 += 100;
				local9 += this.method1047(local19);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
	private void method1056() {
		this.aBooleanArray9 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray9.length; local13++) {
			this.aBooleanArray9[local13] = false;
		}
		if (this.aClass40_3 == null) {
			this.aBoolean56 = true;
			return;
		}
		this.anInt1493 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray9.length; local42++) {
			if (super.anIntArray224[local42] > 0) {
				Static115.method1882(this, local42, this.aClass40_3);
				this.anInt1493 = local42;
			}
		}
		if (this.anInt1493 == -1) {
			this.aBoolean56 = true;
		}
	}
}
