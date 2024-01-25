import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!ed;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "S")
	private final short aShort47;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
	private final boolean aBoolean149;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "B")
	private final byte aByte33;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Z")
	private final boolean aBoolean150;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
	private final boolean aBoolean151;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "Lclient!r;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Lclient!k;")
	private Class2_Sub13_Sub6 aClass2_Sub13_Sub6_2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIZIIIII)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static341.method5368(arg10, arg11));
		this.aByte35 = (byte) arg2;
		this.aShort47 = (short) arg1.anInt3646;
		super.anInt2743 = arg3;
		this.aBoolean149 = arg1.anInt3660 != 0 && !arg6;
		this.aByte33 = (byte) arg10;
		this.aByte36 = (byte) arg11;
		this.aBoolean150 = arg6;
		super.anInt2737 = arg5;
		this.aBoolean151 = arg0.method6065() && arg1.aBoolean291 && !this.aBoolean150 && Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) != 0;
		@Pc(77) Class252 local77 = this.method1965(arg0, 2048, this.aBoolean151);
		if (local77 != null) {
			this.aClass63_2 = local77.aClass63_5;
			this.aClass2_Sub13_Sub6_2 = local77.aClass2_Sub13_Sub6_5;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class63 local15 = this.method1963(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class181 local20 = arg1.method6022();
			local20.oa(super.anInt2743, super.anInt2738, super.anInt2737);
			return local15.method7697(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.method1963(arg1, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class63 method1963(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass63_2 != null && arg0.method6070(this.aClass63_2.ba(), arg1) == 0) {
			return this.aClass63_2;
		} else {
			@Pc(31) Class252 local31 = this.method1965(arg0, arg1, false);
			return local31 == null ? null : local31.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		if (this.aClass68_2 == null) {
			this.aClass68_2 = Static51.method920(super.anInt2738, super.anInt2743, super.anInt2737, this.method1963(arg0, 0));
		}
		return this.aClass68_2;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aByte33;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)I")
	@Override
	public int method2595() {
		return this.aClass63_2 == null ? 0 : this.aClass63_2.TA();
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aShort47 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
		if (this.aClass63_2 != null) {
			this.aClass63_2.method7696();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		@Pc(14) Class2_Sub13_Sub6 local14;
		if (this.aClass2_Sub13_Sub6_2 == null && this.aBoolean151) {
			@Pc(25) Class252 local25 = this.method1965(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass2_Sub13_Sub6_5;
		} else {
			local14 = this.aClass2_Sub13_Sub6_2;
			this.aClass2_Sub13_Sub6_2 = null;
		}
		if (local14 != null) {
			Static151.method2619(local14, this.aByte35, super.anInt2743, super.anInt2737, null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aByte36;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qa;IZZ)Lclient!rp;")
	private Class252 method1965(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class129 local13 = Static505.aClass206_4.method5326(this.aShort47 & 0xFFFF);
		@Pc(27) Class75 local27;
		@Pc(40) Class75 local40;
		if (this.aBoolean150) {
			local27 = Static427.aClass75Array2[this.aByte35];
			local40 = Static164.aClass75Array1[0];
		} else {
			local27 = Static164.aClass75Array1[this.aByte35];
			if (this.aByte35 < 3) {
				local40 = Static164.aClass75Array1[this.aByte35 + 1];
			} else {
				local40 = null;
			}
		}
		return local13.method3271(super.anInt2738, super.anInt2743, local27, super.anInt2737, this.aByte33, arg2, arg1, this.aByte36, local40, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass63_2 == null) {
			return null;
		}
		@Pc(11) Class181 local11 = arg0.method6022();
		local11.oa(super.anInt2744 + super.anInt2743, super.anInt2738, super.anInt2737 + super.anInt2733);
		@Pc(35) Class6_Sub5 local35 = null;
		if (this.aBoolean149) {
			local35 = Static356.method2696(1);
		}
		this.aClass63_2.method7700(local11, local35 == null ? null : local35.aClass6_Sub4Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aBoolean151;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		@Pc(31) Class2_Sub13_Sub6 local31;
		if (this.aClass2_Sub13_Sub6_2 == null && this.aBoolean151) {
			@Pc(24) Class252 local24 = this.method1965(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass2_Sub13_Sub6_5;
		} else {
			local31 = this.aClass2_Sub13_Sub6_2;
			this.aClass2_Sub13_Sub6_2 = null;
		}
		if (local31 != null) {
			Static297.method4693(local31, this.aByte35, super.anInt2743, super.anInt2737, null);
		}
	}
}
