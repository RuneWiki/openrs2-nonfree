import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class2_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub4 implements Interface18 {

	@OriginalMember(owner = "client!sm", name = "lb", descriptor = "[C")
	private static final char[] lb = new char[64];

	@OriginalMember(owner = "client!sm", name = "wb", descriptor = "Lclient!tja;")
	private Class338 aClass338_7;

	@OriginalMember(owner = "client!sm", name = "vb", descriptor = "S")
	private final short aShort113;

	@OriginalMember(owner = "client!sm", name = "sb", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!sm", name = "ob", descriptor = "B")
	private final byte aByte138;

	@OriginalMember(owner = "client!sm", name = "rb", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!sm", name = "db", descriptor = "B")
	private final byte aByte137;

	@OriginalMember(owner = "client!sm", name = "qb", descriptor = "Z")
	private final boolean aBoolean670;

	@OriginalMember(owner = "client!sm", name = "bb", descriptor = "Lclient!r;")
	private Class6_Sub4_Sub5 aClass6_Sub4_Sub5_3;

	@OriginalMember(owner = "client!sm", name = "nb", descriptor = "Lclient!ka;")
	private Class184 aClass184_4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			lb[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			lb[local20] = (char) (local20 + 71);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			lb[local34] = (char) (local34 + 48 - 52);
		}
		lb[62] = '+';
		lb[63] = '/';
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIIII)V")
	public Class2_Sub1_Sub4_Sub2(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort113 = (short) arg1.anInt8569;
		super.anInt10006 = arg4;
		super.anInt10001 = arg6;
		this.aBoolean672 = arg1.anInt8580 != 0 && !arg7;
		this.aByte138 = (byte) arg11;
		this.aBoolean671 = arg7;
		this.aByte137 = (byte) arg10;
		this.aBoolean670 = arg0.method7480() && arg1.aBoolean592 && !this.aBoolean671 && Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() != 0;
		@Pc(67) Class345 local67 = this.method7767(this.aBoolean670, arg0, 2048);
		if (local67 != null) {
			this.aClass6_Sub4_Sub5_3 = local67.aClass6_Sub4_Sub5_4;
			this.aClass184_4 = local67.aClass184_5;
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass184_4 == null ? 0 : this.aClass184_4.fa();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		@Pc(22) Class6_Sub4_Sub5 local22;
		if (this.aClass6_Sub4_Sub5_3 == null && this.aBoolean670) {
			@Pc(33) Class345 local33 = this.method7767(true, arg0, 262144);
			local22 = local33 == null ? null : local33.aClass6_Sub4_Sub5_4;
		} else {
			local22 = this.aClass6_Sub4_Sub5_3;
			this.aClass6_Sub4_Sub5_3 = null;
		}
		if (local22 != null) {
			Static187.method2664(local22, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
		if (this.aClass184_4 != null) {
			this.aClass184_4.method8663();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aBoolean670;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass184_4 == null) {
			return null;
		}
		@Pc(17) Class207 local17 = arg0.method7456();
		local17.method8212(super.anInt10006 + super.aShort112, super.anInt10004, super.aShort111 + super.anInt10001);
		@Pc(38) Class2_Sub9 local38 = Static49.method971(1, this.aBoolean672);
		if (Static487.aBoolean565) {
			this.aClass184_4.method8658(local17, local38.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			this.aClass184_4.method8662(local17, local38.aClass2_Sub5Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		@Pc(18) Class6_Sub4_Sub5 local18;
		if (this.aClass6_Sub4_Sub5_3 == null && this.aBoolean670) {
			@Pc(29) Class345 local29 = this.method7767(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass6_Sub4_Sub5_4;
		} else {
			local18 = this.aClass6_Sub4_Sub5_3;
			this.aClass6_Sub4_Sub5_3 = null;
		}
		if (local18 != null) {
			Static312.method7136(local18, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass184_4 == null ? 0 : this.aClass184_4.ma();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aByte138;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLclient!ha;I)Lclient!uaa;")
	private Class345 method7767(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class308 local18 = Static411.aClass88_3.method2024(this.aShort113 & 0xFFFF);
		@Pc(26) Class12 local26;
		@Pc(30) Class12 local30;
		if (this.aBoolean671) {
			local26 = Static68.aClass12Array2[super.aByte141];
			local30 = Static64.aClass12Array1[0];
		} else {
			local26 = Static64.aClass12Array1[super.aByte141];
			if (super.aByte141 >= 3) {
				local30 = null;
			} else {
				local30 = Static64.aClass12Array1[super.aByte141 + 1];
			}
		}
		return local18.method7306(arg1, this.aByte137, local30, super.anInt10001, arg0, super.anInt10006, super.anInt10004, this.aByte138, arg2, (Class18) null, local26);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class184 local9 = this.method7768(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class207 local14 = arg1.method7456();
			local14.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local9.method8653(arg0, arg2, local14, false, 0, Static472.anInt8136) : local9.method8656(arg0, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		if (this.aClass184_4 == null) {
			return true;
		} else {
			return !this.aClass184_4.r();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class184 method7768(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass184_4 != null && arg0.method7509(this.aClass184_4.ua(), arg1) == 0) {
			return this.aClass184_4;
		} else {
			@Pc(28) Class345 local28 = this.method7767(false, arg0, arg1);
			return local28 == null ? null : local28.aClass184_5;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aShort113 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aByte137;
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aClass184_4 == null ? false : this.aClass184_4.F();
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		if (this.aClass338_7 == null) {
			this.aClass338_7 = Static607.method8310(super.anInt10006, super.anInt10004, this.method7768(arg0, 0), super.anInt10001);
		}
		return this.aClass338_7;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
	}
}
