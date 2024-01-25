import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class47_Sub5_Sub2 extends Class47_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!rba", name = "Z", descriptor = "Lclient!pl;")
	private Class231 aClass231_5;

	@OriginalMember(owner = "client!rba", name = "R", descriptor = "Z")
	private final boolean aBoolean470;

	@OriginalMember(owner = "client!rba", name = "E", descriptor = "Z")
	private final boolean aBoolean469;

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!rba", name = "P", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!rba", name = "G", descriptor = "S")
	private final short aShort110;

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!rba", name = "D", descriptor = "Lclient!r;")
	private Class19 aClass19_4;

	@OriginalMember(owner = "client!rba", name = "S", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIZIIIII)V")
	public Class47_Sub5_Sub2(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static272.method4567(arg11, arg10));
		super.anInt8496 = arg5;
		this.aBoolean470 = arg6;
		this.aBoolean469 = arg1.anInt8338 != 0 && !arg6;
		this.aByte88 = (byte) arg10;
		this.aByte87 = (byte) arg2;
		this.aByte89 = (byte) arg11;
		this.aShort110 = (short) arg1.anInt8333;
		super.anInt8486 = arg3;
		this.aBoolean468 = arg0.method7611() && arg1.aBoolean576 && !this.aBoolean470 && Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) != 0;
		@Pc(77) Class139 local77 = this.method6110(2048, this.aBoolean468, arg0);
		if (local77 != null) {
			this.aClass19_4 = local77.aClass19_3;
			this.aClass1_Sub1_Sub4_4 = local77.aClass1_Sub1_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aShort110 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class19 local14 = this.method6107(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class22 local19 = arg1.method7642();
			local19.oa(super.anInt8486, super.anInt8489, super.anInt8496);
			return local14.method7257(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		@Pc(14) Class1_Sub1_Sub4 local14;
		if (this.aClass1_Sub1_Sub4_4 == null && this.aBoolean468) {
			@Pc(25) Class139 local25 = this.method6110(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub4_3;
		} else {
			local14 = this.aClass1_Sub1_Sub4_4;
			this.aClass1_Sub1_Sub4_4 = null;
		}
		if (local14 != null) {
			Static354.method5622(local14, this.aByte87, super.anInt8486, super.anInt8496, null);
		}
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.aClass19_4 != null) {
			this.aClass19_4.method7259();
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	private Class19 method6107(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass19_4 != null && arg0.method7607(this.aClass19_4.ba(), arg1) == 0) {
			return this.aClass19_4;
		} else {
			@Pc(26) Class139 local26 = this.method6110(arg1, false, arg0);
			return local26 == null ? null : local26.aClass19_3;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)I")
	@Override
	public int method7171() {
		return this.aClass19_4 == null ? 0 : this.aClass19_4.TA();
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		@Pc(25) Class1_Sub1_Sub4 local25;
		if (this.aClass1_Sub1_Sub4_4 == null && this.aBoolean468) {
			@Pc(18) Class139 local18 = this.method6110(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub4_3;
		} else {
			local25 = this.aClass1_Sub1_Sub4_4;
			this.aClass1_Sub1_Sub4_4 = null;
		}
		if (local25 != null) {
			Static11.method241(local25, this.aByte87, super.anInt8486, super.anInt8496, null);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZBLclient!qa;)Lclient!is;")
	private Class139 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(11) Class288 local11 = Static365.aClass194_6.method5084(this.aShort110 & 0xFFFF);
		@Pc(19) Class10 local19;
		@Pc(23) Class10 local23;
		if (this.aBoolean470) {
			local19 = Static106.aClass10Array5[this.aByte87];
			local23 = Static53.aClass10Array3[0];
		} else {
			if (this.aByte87 < 3) {
				local23 = Static53.aClass10Array3[this.aByte87 + 1];
			} else {
				local23 = null;
			}
			local19 = Static53.aClass10Array3[this.aByte87];
		}
		return local11.method7071(super.anInt8486, this.aByte88, arg1, arg0, super.anInt8496, local23, local19, this.aByte89, arg2, super.anInt8489);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method6107(arg1, arg0);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass19_4 == null) {
			return null;
		}
		@Pc(11) Class22 local11 = arg0.method7642();
		local11.oa(super.anInt8486 + super.anInt8488, super.anInt8489, super.anInt8487 + super.anInt8496);
		@Pc(32) Class2_Sub6 local32 = null;
		if (this.aBoolean469) {
			local32 = Static275.method4678(1);
		}
		this.aClass19_4.method7258(local11, local32 == null ? null : local32.aClass2_Sub7Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		if (this.aClass231_5 == null) {
			this.aClass231_5 = Static246.method4148(this.method6107(arg0, 0), super.anInt8486, super.anInt8496, super.anInt8489);
		}
		return this.aClass231_5;
	}
}
