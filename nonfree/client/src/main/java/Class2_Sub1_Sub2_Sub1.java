import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "Lclient!tja;")
	private Class338 aClass338_1;

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Z")
	private final boolean aBoolean17;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "Z")
	private final boolean aBoolean19;

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "S")
	private final short aShort7;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Z")
	private final boolean aBoolean18;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "Lclient!r;")
	private Class6_Sub4_Sub5 aClass6_Sub4_Sub5_1;

	@OriginalMember(owner = "client!ad", name = "tb", descriptor = "Lclient!ka;")
	public Class184 aClass184_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIIZ)V")
	public Class2_Sub1_Sub2_Sub1(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static126.method8988(arg8, arg9));
		this.lb = arg10;
		this.aBoolean17 = arg7;
		super.anInt10006 = arg4;
		this.aByte10 = (byte) arg8;
		this.aBoolean19 = arg1.anInt8580 != 0 && !arg7;
		this.aByte11 = (byte) arg9;
		super.anInt10001 = arg6;
		this.aShort7 = (short) arg1.anInt8569;
		this.aBoolean18 = arg0.method7480() && arg1.aBoolean592 && !this.aBoolean17 && Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() != 0;
		@Pc(66) int local66 = 2048;
		if (this.lb) {
			local66 |= 0x10000;
		}
		@Pc(81) Class345 local81 = this.method246(local66, arg0, this.aBoolean18);
		if (local81 != null) {
			this.aClass6_Sub4_Sub5_1 = local81.aClass6_Sub4_Sub5_4;
			this.aClass184_1 = local81.aClass184_5;
			if (this.lb) {
				this.aClass184_1 = this.aClass184_1.method8660((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass184_1 == null ? 0 : this.aClass184_1.fa();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		if (this.aClass338_1 == null) {
			this.aClass338_1 = Static607.method8310(super.anInt10006, super.anInt10004, this.method245(arg0, 0), super.anInt10001);
		}
		return this.aClass338_1;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
		if (this.aClass184_1 != null) {
			this.aClass184_1.method8663();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aBoolean18;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class184 local9 = this.method245(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class207 local14 = arg1.method7456();
			local14.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local9.method8653(arg0, arg2, local14, false, 0, Static472.anInt8136) : local9.method8656(arg0, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		if (this.aClass184_1 == null) {
			return true;
		} else {
			return !this.aClass184_1.r();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass184_1 == null) {
			return null;
		}
		@Pc(11) Class207 local11 = arg0.method7456();
		local11.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(25) Class2_Sub9 local25 = Static49.method971(1, this.aBoolean19);
		if (Static487.aBoolean565) {
			this.aClass184_1.method8658(local11, local25.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			this.aClass184_1.method8662(local11, local25.aClass2_Sub5Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		@Pc(33) Class6_Sub4_Sub5 local33;
		if (this.aClass6_Sub4_Sub5_1 == null && this.aBoolean18) {
			@Pc(26) Class345 local26 = this.method246(262144, arg0, true);
			local33 = local26 == null ? null : local26.aClass6_Sub4_Sub5_4;
		} else {
			local33 = this.aClass6_Sub4_Sub5_1;
			this.aClass6_Sub4_Sub5_1 = null;
		}
		if (local33 != null) {
			Static187.method2664(local33, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aByte11;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		this.lb = false;
		if (this.aClass184_1 != null) {
			this.aClass184_1.s(this.aClass184_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass184_1 == null ? 0 : this.aClass184_1.ma();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aClass184_1 == null ? false : this.aClass184_1.F();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		@Pc(21) Class6_Sub4_Sub5 local21;
		if (this.aClass6_Sub4_Sub5_1 == null && this.aBoolean18) {
			@Pc(32) Class345 local32 = this.method246(262144, arg0, true);
			local21 = local32 == null ? null : local32.aClass6_Sub4_Sub5_4;
		} else {
			local21 = this.aClass6_Sub4_Sub5_1;
			this.aClass6_Sub4_Sub5_1 = null;
		}
		if (local21 != null) {
			Static312.method7136(local21, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class184 method245(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass184_1 != null && arg0.method7509(this.aClass184_1.ua(), arg1) == 0) {
			return this.aClass184_1;
		} else {
			@Pc(38) Class345 local38 = this.method246(arg1, arg0, false);
			return local38 == null ? null : local38.aClass184_5;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aShort7 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!uaa;")
	private Class345 method246(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class308 local18 = Static411.aClass88_3.method2024(this.aShort7 & 0xFFFF);
		@Pc(26) Class12 local26;
		@Pc(39) Class12 local39;
		if (this.aBoolean17) {
			local39 = Static64.aClass12Array1[0];
			local26 = Static68.aClass12Array2[super.aByte141];
		} else {
			local26 = Static64.aClass12Array1[super.aByte141];
			if (super.aByte141 < 3) {
				local39 = Static64.aClass12Array1[super.aByte141 + 1];
			} else {
				local39 = null;
			}
		}
		return local18.method7306(arg1, this.aByte10, local39, super.anInt10001, arg2, super.anInt10006, super.anInt10004, this.aByte11, arg0, (Class18) null, local26);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class2_Sub1_Sub2_Sub1) {
			@Pc(5) Class2_Sub1_Sub2_Sub1 local5 = (Class2_Sub1_Sub2_Sub1) arg0;
			if (this.aClass184_1 != null && local5.aClass184_1 != null) {
				this.aClass184_1.method8651(local5.aClass184_1, arg1, arg3, arg5, arg2);
			}
		} else if (arg0 instanceof Class2_Sub1_Sub1_Sub5) {
			@Pc(28) Class2_Sub1_Sub1_Sub5 local28 = (Class2_Sub1_Sub1_Sub5) arg0;
			if (this.aClass184_1 != null && local28.aClass184_6 != null) {
				this.aClass184_1.method8651(local28.aClass184_6, arg1, arg3, arg5, arg2);
			}
		}
	}
}
