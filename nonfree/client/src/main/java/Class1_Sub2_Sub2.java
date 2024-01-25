import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Lclient!ed;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "S")
	private final short aShort97;

	@OriginalMember(owner = "client!le", name = "O", descriptor = "Z")
	private final boolean aBoolean370;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!le", name = "R", descriptor = "Z")
	private boolean aBoolean372;

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "Z")
	private final boolean aBoolean371;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!r;")
	public Class63 aClass63_3;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!k;")
	private Class2_Sub13_Sub6 aClass2_Sub13_Sub6_3;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIZIIZ)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static101.method7096(arg7, arg8));
		super.anInt6985 = arg3;
		this.aShort97 = (short) arg1.anInt3646;
		this.aBoolean370 = arg1.anInt3660 != 0 && !arg6;
		this.aBoolean369 = arg6;
		this.aByte64 = (byte) arg2;
		super.anInt6986 = arg5;
		this.aByte65 = (byte) arg7;
		this.aByte66 = (byte) arg8;
		this.aBoolean372 = arg9;
		this.aBoolean371 = arg0.method6065() && arg1.aBoolean291 && !this.aBoolean369 && Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean372) {
			local71 |= 0x10000;
		}
		@Pc(86) Class252 local86 = this.method4335(arg0, local71, this.aBoolean371);
		if (local86 != null) {
			this.aClass63_3 = local86.aClass63_5;
			this.aClass2_Sub13_Sub6_3 = local86.aClass2_Sub13_Sub6_5;
			if (this.aBoolean372) {
				this.aClass63_3 = this.aClass63_3.method7706((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aBoolean371;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return this.aBoolean372;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;IIZ)Lclient!rp;")
	private Class252 method4335(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(25) Class129 local25 = Static505.aClass206_4.method5326(this.aShort97 & 0xFFFF);
		@Pc(48) Class75 local48;
		@Pc(34) Class75 local34;
		if (this.aBoolean369) {
			local48 = Static427.aClass75Array2[this.aByte64];
			local34 = Static164.aClass75Array1[0];
		} else {
			if (this.aByte64 >= 3) {
				local34 = null;
			} else {
				local34 = Static164.aClass75Array1[this.aByte64 + 1];
			}
			local48 = Static164.aClass75Array1[this.aByte64];
		}
		return local25.method3271(super.anInt6992, super.anInt6985, local48, super.anInt6986, this.aByte65, arg2, arg1, this.aByte66, local34, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class63 local9 = this.method4337(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class181 local14 = arg1.method6022();
			local14.oa(super.anInt6985, super.anInt6992, super.anInt6986);
			return local9.method7697(arg0, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aByte66;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aShort97 & 0xFFFF;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class1_Sub2_Sub2) {
			@Pc(28) Class1_Sub2_Sub2 local28 = (Class1_Sub2_Sub2) arg4;
			if (this.aClass63_3 != null && local28.aClass63_3 != null) {
				this.aClass63_3.method7705(local28.aClass63_3, arg5, arg2, arg0, arg3);
			}
		} else if (arg4 instanceof Class1_Sub1_Sub5) {
			@Pc(8) Class1_Sub1_Sub5 local8 = (Class1_Sub1_Sub5) arg4;
			if (this.aClass63_3 != null && local8.aClass63_4 != null) {
				this.aClass63_3.method7705(local8.aClass63_4, arg5, arg2, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		@Pc(14) Class2_Sub13_Sub6 local14;
		if (this.aClass2_Sub13_Sub6_3 == null && this.aBoolean371) {
			@Pc(25) Class252 local25 = this.method4335(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass2_Sub13_Sub6_5;
		} else {
			local14 = this.aClass2_Sub13_Sub6_3;
			this.aClass2_Sub13_Sub6_3 = null;
		}
		if (local14 != null) {
			Static151.method2619(local14, this.aByte64, super.anInt6985, super.anInt6986, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		if (this.aClass68_5 == null) {
			this.aClass68_5 = Static51.method920(super.anInt6992, super.anInt6985, super.anInt6986, this.method4337(arg0, 0));
		}
		return this.aClass68_5;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		@Pc(32) Class2_Sub13_Sub6 local32;
		if (this.aClass2_Sub13_Sub6_3 == null && this.aBoolean371) {
			@Pc(25) Class252 local25 = this.method4335(arg0, 262144, true);
			local32 = local25 == null ? null : local25.aClass2_Sub13_Sub6_5;
		} else {
			local32 = this.aClass2_Sub13_Sub6_3;
			this.aClass2_Sub13_Sub6_3 = null;
		}
		if (local32 != null) {
			Static297.method4693(local32, this.aByte64, super.anInt6985, super.anInt6986, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;II)Lclient!r;")
	private Class63 method4337(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass63_3 != null && arg0.method6070(this.aClass63_3.ba(), arg1) == 0) {
			return this.aClass63_3;
		} else {
			@Pc(25) Class252 local25 = this.method4335(arg0, arg1, false);
			return local25 == null ? null : local25.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
		if (this.aClass63_3 != null) {
			this.aClass63_3.method7696();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		this.aBoolean372 = false;
		if (this.aClass63_3 != null) {
			this.aClass63_3.m(this.aClass63_3.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.method4337(arg1, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass63_3 == null) {
			return null;
		}
		@Pc(16) Class181 local16 = arg0.method6022();
		local16.oa(super.anInt6985, super.anInt6992, super.anInt6986);
		@Pc(26) Class6_Sub5 local26 = null;
		if (this.aBoolean370) {
			local26 = Static356.method2696(1);
		}
		this.aClass63_3.method7700(local16, local26 == null ? null : local26.aClass6_Sub4Array1[0], 0);
		return local26;
	}
}
