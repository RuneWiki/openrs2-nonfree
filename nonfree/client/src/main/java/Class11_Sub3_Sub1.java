import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "Lclient!em;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!cw", name = "M", descriptor = "Z")
	private final boolean aBoolean103;

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "S")
	private final short aShort10;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!cw", name = "K", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!cw", name = "S", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!cw", name = "L", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!cw", name = "Q", descriptor = "Z")
	private final boolean aBoolean104;

	@OriginalMember(owner = "client!cw", name = "U", descriptor = "Lclient!ia;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_2;

	@OriginalMember(owner = "client!cw", name = "H", descriptor = "Lclient!ka;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!qa;Lclient!ku;IIIIZIIIII)V")
	public Class11_Sub3_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static392.method5522(arg11, arg10));
		this.aBoolean103 = arg1.anInt4358 != 0 && !arg6;
		this.aShort10 = (short) arg1.anInt4366;
		this.aBoolean102 = arg6;
		this.aByte6 = (byte) arg2;
		super.anInt6733 = arg5;
		this.aByte8 = (byte) arg11;
		this.aByte7 = (byte) arg10;
		super.anInt6734 = arg3;
		this.aBoolean104 = arg0.method2045() && arg1.aBoolean287 && !this.aBoolean102 && Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) != 0;
		@Pc(74) Class236 local74 = this.method1341(this.aBoolean104, arg0, 2048);
		if (local74 != null) {
			this.aClass4_Sub1_Sub6_2 = local74.aClass4_Sub1_Sub6_5;
			this.aClass57_2 = local74.aClass57_6;
		}
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return this.aBoolean104;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		if (this.aClass64_2 == null) {
			this.aClass64_2 = Static456.method6200(super.anInt6729, this.method1339(0, arg0), super.anInt6733, super.anInt6734);
		}
		return this.aClass64_2;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBLclient!qa;)Lclient!ka;")
	private Class57 method1339(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass57_2 != null && arg1.method2065(this.aClass57_2.ma(), arg0) == 0) {
			return this.aClass57_2;
		} else {
			@Pc(31) Class236 local31 = this.method1341(false, arg1, arg0);
			return local31 == null ? null : local31.aClass57_6;
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
		if (this.aClass57_2 != null) {
			this.aClass57_2.method6069();
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return this.aShort10 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass57_2 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2092();
		local11.C(super.anInt6734 + super.anInt6738, super.anInt6729, super.anInt6739 + super.anInt6733);
		@Pc(28) Class71_Sub3 local28 = null;
		if (this.aBoolean103) {
			local28 = Static127.method2399(1);
		}
		this.aClass57_2.method6073(local11, local28 == null ? null : local28.aClass71_Sub7Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return this.method1339(arg1, arg0);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(9) Class57 local9 = this.method1339(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class72 local14 = arg2.method2092();
			local14.C(super.anInt6734, super.anInt6729, super.anInt6733);
			return local9.method6070(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)I")
	@Override
	public int method5439() {
		return this.aClass57_2 == null ? 0 : this.aClass57_2.ja();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
		@Pc(33) Class4_Sub1_Sub6 local33;
		if (this.aClass4_Sub1_Sub6_2 == null && this.aBoolean104) {
			@Pc(26) Class236 local26 = this.method1341(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass4_Sub1_Sub6_5;
		} else {
			local33 = this.aClass4_Sub1_Sub6_2;
			this.aClass4_Sub1_Sub6_2 = null;
		}
		if (local33 != null) {
			Static175.method3073(local33, this.aByte6, super.anInt6734, super.anInt6733, null);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
		@Pc(21) Class4_Sub1_Sub6 local21;
		if (this.aClass4_Sub1_Sub6_2 == null && this.aBoolean104) {
			@Pc(32) Class236 local32 = this.method1341(true, arg0, 262144);
			local21 = local32 == null ? null : local32.aClass4_Sub1_Sub6_5;
		} else {
			local21 = this.aClass4_Sub1_Sub6_2;
			this.aClass4_Sub1_Sub6_2 = null;
		}
		if (local21 != null) {
			Static252.method4144(local21, this.aByte6, super.anInt6734, super.anInt6733, null);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLclient!qa;IB)Lclient!so;")
	private Class236 method1341(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class139 local13 = Static146.aClass228_1.method5203(this.aShort10 & 0xFFFF);
		@Pc(27) Class14 local27;
		@Pc(31) Class14 local31;
		if (this.aBoolean102) {
			local27 = Static77.aClass14Array1[this.aByte6];
			local31 = Static267.aClass14Array2[0];
		} else {
			if (this.aByte6 >= 3) {
				local31 = null;
			} else {
				local31 = Static267.aClass14Array2[this.aByte6 + 1];
			}
			local27 = Static267.aClass14Array2[this.aByte6];
		}
		return local13.method3763(local31, arg1, super.anInt6734, local27, this.aByte7, arg2, super.anInt6729, super.anInt6733, arg0, this.aByte8);
	}
}
