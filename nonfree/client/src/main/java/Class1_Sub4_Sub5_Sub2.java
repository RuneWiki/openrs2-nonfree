import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class1_Sub4_Sub5_Sub2 extends Class1_Sub4_Sub5 implements Interface19 {

	@OriginalMember(owner = "client!rca", name = "hb", descriptor = "Lclient!sr;")
	private Class308 aClass308_6;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "B")
	private final byte aByte99;

	@OriginalMember(owner = "client!rca", name = "Y", descriptor = "B")
	private final byte aByte100;

	@OriginalMember(owner = "client!rca", name = "T", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!rca", name = "Z", descriptor = "Z")
	private final boolean aBoolean585;

	@OriginalMember(owner = "client!rca", name = "Q", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!rca", name = "cb", descriptor = "Z")
	private final boolean aBoolean586;

	@OriginalMember(owner = "client!rca", name = "U", descriptor = "Z")
	private final boolean aBoolean584;

	@OriginalMember(owner = "client!rca", name = "ab", descriptor = "Lclient!da;")
	public Class57 aClass57_5;

	@OriginalMember(owner = "client!rca", name = "mb", descriptor = "Lclient!ha;")
	private Class4_Sub5_Sub6 aClass4_Sub5_Sub6_5;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIIIZIIZ)V")
	public Class1_Sub4_Sub5_Sub2(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static32.method444(arg8, arg9));
		this.aByte99 = (byte) arg9;
		this.aByte100 = (byte) arg8;
		super.anInt9935 = arg6;
		this.aBoolean583 = arg10;
		this.aBoolean585 = arg7;
		super.anInt9934 = arg4;
		this.aShort93 = (short) arg1.anInt2942;
		this.aBoolean586 = arg1.anInt2924 != 0 && !arg7;
		this.aBoolean584 = arg0.method4975() && arg1.aBoolean228 && !this.aBoolean585 && Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean583) {
			local69 |= 0x10000;
		}
		@Pc(84) Class99 local84 = this.method6889(local69, arg0, this.aBoolean584);
		if (local84 != null) {
			this.aClass57_5 = local84.aClass57_1;
			this.aClass4_Sub5_Sub6_5 = local84.aClass4_Sub5_Sub6_1;
			if (this.aBoolean583) {
				this.aClass57_5 = this.aClass57_5.method7912((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub4_Sub5_Sub2) {
			@Pc(16) Class1_Sub4_Sub5_Sub2 local16 = (Class1_Sub4_Sub5_Sub2) arg4;
			if (this.aClass57_5 != null && local16.aClass57_5 != null) {
				this.aClass57_5.method7922(local16.aClass57_5, arg5, arg1, arg0, arg2);
			}
		} else if (arg4 instanceof Class1_Sub4_Sub2_Sub3) {
			@Pc(38) Class1_Sub4_Sub2_Sub3 local38 = (Class1_Sub4_Sub2_Sub3) arg4;
			if (this.aClass57_5 != null && local38.aClass57_6 != null) {
				this.aClass57_5.method7922(local38.aClass57_6, arg5, arg1, arg0, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.aByte100;
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.method8117();
		}
		return this.aClass57_5 == null ? 0 : this.aClass57_5.RA();
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V")
	@Override
	public void method7828() {
		if (this.aClass57_5 != null) {
			this.aClass57_5.method7929();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		if (this.aClass57_5 == null) {
			return null;
		}
		@Pc(11) Class8 local11 = arg0.method5007();
		local11.NA(super.anInt9934, super.anInt9932, super.anInt9935);
		@Pc(21) Class1_Sub8 local21 = null;
		if (this.aBoolean586) {
			local21 = Static361.method5833(1);
		}
		if (Static361.aBoolean500) {
			this.aClass57_5.method7919(local11, local21 == null ? null : local21.aClass1_Sub9Array1[0], Static6.anInt161, 0);
		} else {
			this.aClass57_5.method7927(local11, local21 == null ? null : local21.aClass1_Sub9Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.aClass57_5 == null ? 0 : this.aClass57_5.J();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7830(@OriginalArg(1) Class44 arg0) {
		@Pc(14) Class4_Sub5_Sub6 local14;
		if (this.aClass4_Sub5_Sub6_5 == null && this.aBoolean584) {
			@Pc(25) Class99 local25 = this.method6889(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass4_Sub5_Sub6_1;
		} else {
			local14 = this.aClass4_Sub5_Sub6_5;
			this.aClass4_Sub5_Sub6_5 = null;
		}
		if (local14 != null) {
			Static456.method6974(local14, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aClass57_5 == null ? false : this.aClass57_5.LA();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		if (this.aClass308_6 == null) {
			this.aClass308_6 = Static66.method1078(super.anInt9932, super.anInt9935, super.anInt9934, this.method6887(0, arg0));
		}
		return this.aClass308_6;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class57 method6887(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		if (this.aClass57_5 != null && arg1.method5010(this.aClass57_5.PA(), arg0) == 0) {
			return this.aClass57_5;
		} else {
			@Pc(29) Class99 local29 = this.method6889(arg0, arg1, false);
			return local29 == null ? null : local29.aClass57_1;
		}
	}

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return true;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!r;ZB)Lclient!fe;")
	private Class99 method6889(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class101 local13 = Static204.aClass139_8.method3309(this.aShort93 & 0xFFFF);
		@Pc(26) Class83 local26;
		@Pc(30) Class83 local30;
		if (this.aBoolean585) {
			local26 = Static183.aClass83Array6[super.aByte127];
			local30 = Static444.aClass83Array7[0];
		} else {
			if (super.aByte127 < 3) {
				local30 = Static444.aClass83Array7[super.aByte127 + 1];
			} else {
				local30 = null;
			}
			local26 = Static444.aClass83Array7[super.aByte127];
		}
		return local13.method2715(super.anInt9935, arg1, this.aByte100, local30, arg0, arg2, super.anInt9934, super.anInt9932, this.aByte99, local26);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7826() {
		return this.aBoolean584;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLclient!r;)V")
	@Override
	public void method7824(@OriginalArg(1) Class44 arg0) {
		@Pc(25) Class4_Sub5_Sub6 local25;
		if (this.aClass4_Sub5_Sub6_5 == null && this.aBoolean584) {
			@Pc(18) Class99 local18 = this.method6889(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass4_Sub5_Sub6_1;
		} else {
			local25 = this.aClass4_Sub5_Sub6_5;
			this.aClass4_Sub5_Sub6_5 = null;
		}
		if (local25 != null) {
			Static144.method2749(local25, super.aByte127, super.anInt9934, super.anInt9935, null);
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class57 local9 = this.method6887(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class8 local14 = arg0.method5007();
			local14.NA(super.anInt9934, super.anInt9932, super.anInt9935);
			return Static361.aBoolean500 ? local9.method7924(arg1, arg2, local14, false, Static6.anInt161) : local9.method7933(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return this.aBoolean583;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)I")
	@Override
	public int method7829() {
		return this.aByte99;
	}

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		this.aBoolean583 = false;
		if (this.aClass57_5 != null) {
			this.aClass57_5.SA(this.aClass57_5.PA() & 0xFFFEFFFF);
		}
	}
}
