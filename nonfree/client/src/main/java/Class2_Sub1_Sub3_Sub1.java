import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lclient!tja;")
	private Class338 aClass338_2;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "S")
	private final short aShort13;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Z")
	private final boolean aBoolean41;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Z")
	private final boolean aBoolean38;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "Lclient!r;")
	private Class6_Sub4_Sub5 aClass6_Sub4_Sub5_2;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "Lclient!ka;")
	private Class184 aClass184_2;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIZ)V")
	public Class2_Sub1_Sub3_Sub1(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8566);
		this.aBoolean40 = arg9;
		super.anInt10001 = arg6;
		super.anInt10006 = arg4;
		this.aByte21 = (byte) arg8;
		this.aBoolean39 = arg7;
		this.aShort13 = (short) arg1.anInt8569;
		this.aBoolean41 = arg1.anInt8580 != 0 && !arg7;
		this.aBoolean38 = arg0.method7480() && arg1.aBoolean592 && !this.aBoolean39 && Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean40) {
			local66 |= 0x10000;
		}
		@Pc(81) Class345 local81 = this.method789(this.aBoolean38, local66, arg0);
		if (local81 != null) {
			this.aClass6_Sub4_Sub5_2 = local81.aClass6_Sub4_Sub5_4;
			this.aClass184_2 = local81.aClass184_5;
			if (this.aBoolean40) {
				this.aClass184_2 = this.aClass184_2.method8660((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aShort13 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		@Pc(22) Class6_Sub4_Sub5 local22;
		if (this.aClass6_Sub4_Sub5_2 == null && this.aBoolean38) {
			@Pc(33) Class345 local33 = this.method789(true, 262144, arg0);
			local22 = local33 == null ? null : local33.aClass6_Sub4_Sub5_4;
		} else {
			local22 = this.aClass6_Sub4_Sub5_2;
			this.aClass6_Sub4_Sub5_2 = null;
		}
		if (local22 != null) {
			Static187.method2664(local22, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		if (this.aClass184_2 == null) {
			return true;
		} else {
			return !this.aClass184_2.r();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		if (this.aClass184_2 == null) {
			return null;
		}
		@Pc(16) Class207 local16 = arg0.method7456();
		local16.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(30) Class2_Sub9 local30 = Static49.method971(1, this.aBoolean41);
		if (Static487.aBoolean565) {
			this.aClass184_2.method8658(local16, local30.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			this.aClass184_2.method8662(local16, local30.aClass2_Sub5Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		if (this.aClass338_2 == null) {
			this.aClass338_2 = Static607.method8310(super.anInt10006, super.anInt10004, this.method792(arg0, 0), super.anInt10001);
		}
		return this.aClass338_2;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZIILclient!ha;)Lclient!uaa;")
	private Class345 method789(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class132 arg2) {
		@Pc(19) Class308 local19 = Static411.aClass88_3.method2024(this.aShort13 & 0xFFFF);
		@Pc(27) Class12 local27;
		@Pc(33) Class12 local33;
		if (this.aBoolean39) {
			local33 = Static64.aClass12Array1[0];
			local27 = Static68.aClass12Array2[super.aByte141];
		} else {
			local27 = Static64.aClass12Array1[super.aByte141];
			if (super.aByte141 >= 3) {
				local33 = null;
			} else {
				local33 = Static64.aClass12Array1[super.aByte141 + 1];
			}
		}
		return local19.method7306(arg2, 22, local33, super.anInt10001, arg0, super.anInt10006, super.anInt10004, this.aByte21, arg1, (Class18) null, local27);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aBoolean38;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		@Pc(14) Class6_Sub4_Sub5 local14;
		if (this.aClass6_Sub4_Sub5_2 == null && this.aBoolean38) {
			@Pc(25) Class345 local25 = this.method789(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub4_Sub5_4;
		} else {
			local14 = this.aClass6_Sub4_Sub5_2;
			this.aClass6_Sub4_Sub5_2 = null;
		}
		if (local14 != null) {
			Static312.method7136(local14, super.aByte141, super.anInt10006, super.anInt10001, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass184_2 == null ? 0 : this.aClass184_2.fa();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return 22;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return this.aBoolean40;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class184 local14 = this.method792(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class207 local19 = arg1.method7456();
			local19.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local14.method8653(arg0, arg2, local19, false, 0, Static472.anInt8136) : local14.method8656(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass184_2 == null ? 0 : this.aClass184_2.ma();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		this.aBoolean40 = false;
		if (this.aClass184_2 != null) {
			this.aClass184_2.s(this.aClass184_2.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		if (arg0 instanceof Class2_Sub1_Sub3_Sub1) {
			@Pc(5) Class2_Sub1_Sub3_Sub1 local5 = (Class2_Sub1_Sub3_Sub1) arg0;
			if (this.aClass184_2 != null && local5.aClass184_2 != null) {
				this.aClass184_2.method8651(local5.aClass184_2, arg1, arg3, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class184 method792(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass184_2 != null && arg0.method7509(this.aClass184_2.ua(), arg1) == 0) {
			return this.aClass184_2;
		} else {
			@Pc(28) Class345 local28 = this.method789(false, arg1, arg0);
			return local28 == null ? null : local28.aClass184_5;
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aClass184_2 == null ? false : this.aClass184_2.F();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
		if (this.aClass184_2 != null) {
			this.aClass184_2.method8663();
		}
	}
}
