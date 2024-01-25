import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!ur", name = "vb", descriptor = "Lclient!tja;")
	private Class338 aClass338_8;

	@OriginalMember(owner = "client!ur", name = "cb", descriptor = "Z")
	private boolean aBoolean704;

	@OriginalMember(owner = "client!ur", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!ur", name = "Bb", descriptor = "B")
	private final byte aByte144;

	@OriginalMember(owner = "client!ur", name = "ob", descriptor = "B")
	private final byte aByte143;

	@OriginalMember(owner = "client!ur", name = "mb", descriptor = "Z")
	private final boolean aBoolean706;

	@OriginalMember(owner = "client!ur", name = "hb", descriptor = "S")
	private final short aShort122;

	@OriginalMember(owner = "client!ur", name = "ib", descriptor = "Z")
	private final boolean aBoolean705;

	@OriginalMember(owner = "client!ur", name = "Hb", descriptor = "Lclient!ka;")
	public Class184 aClass184_6;

	@OriginalMember(owner = "client!ur", name = "ab", descriptor = "Lclient!r;")
	private Class6_Sub4_Sub5 aClass6_Sub4_Sub5_5;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIIIIIIZ)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8586 == 1, Static587.method8142(arg12, arg13));
		this.aBoolean704 = arg14;
		this.lb = arg7;
		this.aByte144 = (byte) arg13;
		this.aByte143 = (byte) arg12;
		super.aByte141 = (byte) arg3;
		this.aBoolean706 = arg1.anInt8580 != 0 && !arg7;
		this.aShort122 = (short) arg1.anInt8569;
		this.aBoolean705 = arg0.method7480() && arg1.aBoolean592 && !this.lb && Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean704) {
			local78 |= 0x10000;
		}
		@Pc(93) Class345 local93 = this.method8481(this.aBoolean705, local78, arg0);
		if (local93 != null) {
			this.aClass184_6 = local93.aClass184_5;
			this.aClass6_Sub4_Sub5_5 = local93.aClass6_Sub4_Sub5_4;
			if (this.aBoolean704) {
				this.aClass184_6 = this.aClass184_6.method8660((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass184_6 == null ? 0 : this.aClass184_6.ma();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class184 local14 = this.method8479(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class207 local19 = arg1.method7456();
			local19.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local14.method8653(arg0, arg2, local19, false, 0, Static472.anInt8136) : local14.method8656(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass184_6 == null ? 0 : this.aClass184_6.fa();
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)I")
	public int method8476() {
		return this.aClass184_6 == null ? 15 : this.aClass184_6.na() / 4;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class2_Sub1_Sub2_Sub1) {
			@Pc(14) Class2_Sub1_Sub2_Sub1 local14 = (Class2_Sub1_Sub2_Sub1) arg0;
			if (this.aClass184_6 != null && local14.aClass184_1 != null) {
				this.aClass184_6.method8651(local14.aClass184_1, arg1, arg3, arg5, arg2);
			}
		} else if (arg0 instanceof Class2_Sub1_Sub1_Sub5) {
			@Pc(36) Class2_Sub1_Sub1_Sub5 local36 = (Class2_Sub1_Sub1_Sub5) arg0;
			if (this.aClass184_6 != null && local36.aClass184_6 != null) {
				this.aClass184_6.method8651(local36.aClass184_6, arg1, arg3, arg5, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aByte144;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return this.aBoolean704;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		if (this.aClass338_8 == null) {
			this.aClass338_8 = Static607.method8310(super.anInt10006, super.anInt10004, this.method8479(0, arg0), super.anInt10001);
		}
		return this.aClass338_8;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aShort122 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		if (this.aClass184_6 == null) {
			return true;
		} else {
			return !this.aClass184_6.r();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass184_6 == null) {
			return null;
		}
		@Pc(11) Class207 local11 = arg0.method7456();
		local11.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(25) Class2_Sub9 local25 = Static49.method971(1, this.aBoolean706);
		if (Static487.aBoolean565) {
			this.aClass184_6.method8658(local11, local25.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			this.aClass184_6.method8662(local11, local25.aClass2_Sub5Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class184 method8479(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		if (this.aClass184_6 != null && arg1.method7509(this.aClass184_6.ua(), arg0) == 0) {
			return this.aClass184_6;
		} else {
			@Pc(28) Class345 local28 = this.method8481(false, arg0, arg1);
			return local28 == null ? null : local28.aClass184_5;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		@Pc(29) Class6_Sub4_Sub5 local29;
		if (this.aClass6_Sub4_Sub5_5 == null && this.aBoolean705) {
			@Pc(22) Class345 local22 = this.method8481(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass6_Sub4_Sub5_4;
		} else {
			local29 = this.aClass6_Sub4_Sub5_5;
			this.aClass6_Sub4_Sub5_5 = null;
		}
		if (local29 != null) {
			Static312.method7136(local29, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		this.aBoolean704 = false;
		if (this.aClass184_6 != null) {
			this.aClass184_6.s(this.aClass184_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BZILclient!ha;)Lclient!uaa;")
	private Class345 method8481(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2) {
		@Pc(22) Class308 local22 = Static411.aClass88_3.method2024(this.aShort122 & 0xFFFF);
		@Pc(30) Class12 local30;
		@Pc(43) Class12 local43;
		if (this.lb) {
			local30 = Static68.aClass12Array2[super.aByte141];
			local43 = Static64.aClass12Array1[0];
		} else {
			local30 = Static64.aClass12Array1[super.aByte141];
			if (super.aByte141 < 3) {
				local43 = Static64.aClass12Array1[super.aByte141 + 1];
			} else {
				local43 = null;
			}
		}
		return local22.method7306(arg2, this.aByte143 == 11 ? 10 : this.aByte143, local43, super.anInt10001, arg0, super.anInt10006, super.anInt10004, this.aByte143 == 11 ? this.aByte144 + 4 : this.aByte144, arg1, (Class18) null, local30);
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aClass184_6 == null ? false : this.aClass184_6.F();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aBoolean705;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aByte143;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
		if (this.aClass184_6 != null) {
			this.aClass184_6.method8663();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		@Pc(14) Class6_Sub4_Sub5 local14;
		if (this.aClass6_Sub4_Sub5_5 == null && this.aBoolean705) {
			@Pc(25) Class345 local25 = this.method8481(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub4_Sub5_4;
		} else {
			local14 = this.aClass6_Sub4_Sub5_5;
			this.aClass6_Sub4_Sub5_5 = null;
		}
		if (local14 != null) {
			Static187.method2664(local14, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}
}
