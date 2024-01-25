import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class23_Sub2_Sub2_Sub2 extends Class23_Sub2_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "Lclient!dg;")
	private Class77 aClass77_7;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!rj", name = "jb", descriptor = "Z")
	private final boolean aBoolean653;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "B")
	private final byte aByte121;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "S")
	private final short aShort115;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
	private final boolean aBoolean652;

	@OriginalMember(owner = "client!rj", name = "gb", descriptor = "Lclient!r;")
	private Class3_Sub6_Sub12 aClass3_Sub6_Sub12_5;

	@OriginalMember(owner = "client!rj", name = "hb", descriptor = "Lclient!ka;")
	private Class28 aClass28_6;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIIII)V")
	public Class23_Sub2_Sub2_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10109 = arg6;
		this.aByte120 = (byte) arg11;
		this.aBoolean653 = arg7;
		super.anInt10108 = arg4;
		this.aByte121 = (byte) arg10;
		this.aBoolean651 = arg1.anInt4743 != 0 && !arg7;
		this.aShort115 = (short) arg1.anInt4778;
		this.aBoolean652 = arg0.method8120() && arg1.aBoolean393 && !this.aBoolean653 && Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502() != 0;
		@Pc(73) Class50 local73 = this.method7333(2048, arg0, this.aBoolean652);
		if (local73 != null) {
			this.aClass3_Sub6_Sub12_5 = local73.aClass3_Sub6_Sub12_1;
			this.aClass28_6 = local73.aClass28_2;
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass28_6 == null) {
			return null;
		}
		@Pc(17) Class25 local17 = arg0.method8156();
		local17.method4303(super.anInt10108 + super.aShort114, super.anInt10114, super.aShort113 + super.anInt10109);
		@Pc(38) Class23_Sub6 local38 = Static564.method8406(1, this.aBoolean651);
		if (Static148.aBoolean221) {
			this.aClass28_6.method6894(local17, local38.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			this.aClass28_6.method6908(local17, local38.aClass23_Sub4Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		if (this.aClass28_6 == null) {
			return true;
		} else {
			return !this.aClass28_6.r();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!cb;")
	private Class50 method7333(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class178 local13 = Static349.aClass374_2.method8357(this.aShort115 & 0xFFFF);
		@Pc(25) Class104 local25;
		@Pc(20) Class104 local20;
		if (this.aBoolean653) {
			local20 = Static239.aClass104Array1[0];
			local25 = Static605.aClass104Array3[super.aByte143];
		} else {
			if (super.aByte143 >= 3) {
				local20 = null;
			} else {
				local20 = Static239.aClass104Array1[super.aByte143 + 1];
			}
			local25 = Static239.aClass104Array1[super.aByte143];
		}
		return local13.method4011(this.aByte121, super.anInt10109, arg0, arg2, arg1, super.anInt10114, this.aByte120, local20, local25, (Class81) null, super.anInt10108);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		@Pc(14) Class3_Sub6_Sub12 local14;
		if (this.aClass3_Sub6_Sub12_5 == null && this.aBoolean652) {
			@Pc(27) Class50 local27 = this.method7333(262144, arg0, true);
			local14 = local27 == null ? null : local27.aClass3_Sub6_Sub12_1;
		} else {
			local14 = this.aClass3_Sub6_Sub12_5;
			this.aClass3_Sub6_Sub12_5 = null;
		}
		if (local14 != null) {
			Static267.method4227(local14, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aByte120;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass77_7 = null;
		}
		return this.aClass28_6 == null ? 0 : this.aClass28_6.ma();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class28 method7336(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass28_6 != null && arg0.method8122(this.aClass28_6.ua(), arg1) == 0) {
			return this.aClass28_6;
		} else {
			@Pc(33) Class50 local33 = this.method7333(arg1, arg0, false);
			return local33 == null ? null : local33.aClass28_2;
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		if (this.aClass77_7 == null) {
			this.aClass77_7 = Static109.method2088(super.anInt10109, super.anInt10108, this.method7336(arg0, 0), super.anInt10114);
		}
		return this.aClass77_7;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		@Pc(25) Class3_Sub6_Sub12 local25;
		if (this.aClass3_Sub6_Sub12_5 == null && this.aBoolean652) {
			@Pc(18) Class50 local18 = this.method7333(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass3_Sub6_Sub12_1;
		} else {
			local25 = this.aClass3_Sub6_Sub12_5;
			this.aClass3_Sub6_Sub12_5 = null;
		}
		if (local25 != null) {
			Static517.method7339(local25, super.aByte143, super.anInt10108, super.anInt10109, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class28 local9 = this.method7336(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class25 local14 = arg0.method8156();
			local14.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local9.method6904(arg1, arg2, local14, false, 0, Static209.anInt10104) : local9.method6887(arg1, arg2, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aShort115 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass28_6 == null ? 0 : this.aClass28_6.fa();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aClass28_6 == null ? false : this.aClass28_6.F();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
		if (this.aClass28_6 != null) {
			this.aClass28_6.method6892();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aByte121;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
	}
}
