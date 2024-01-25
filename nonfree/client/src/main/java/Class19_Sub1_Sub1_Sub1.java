import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class19_Sub1_Sub1_Sub1 extends Class19_Sub1_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!dfa;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "B")
	private final byte aByte102;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "S")
	private final short aShort96;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "B")
	private final byte aByte103;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "Z")
	private final boolean aBoolean547;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub13 aClass3_Sub4_Sub13_4;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "Lclient!ka;")
	private Class157 aClass157_5;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIIIZIIII)V")
	public Class19_Sub1_Sub1_Sub1(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte102 = (byte) arg10;
		this.aBoolean546 = arg1.anInt4425 != 0 && !arg7;
		super.anInt11204 = arg4;
		this.aBoolean545 = arg7;
		super.anInt11211 = arg6;
		this.aShort96 = (short) arg1.anInt4397;
		this.aByte103 = (byte) arg11;
		this.aBoolean547 = arg0.method7658() && arg1.aBoolean379 && !this.aBoolean545 && Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() != 0;
		@Pc(75) Class179 local75 = this.method5836(this.aBoolean547, arg0, 2048);
		if (local75 != null) {
			this.aClass3_Sub4_Sub13_4 = local75.aClass3_Sub4_Sub13_3;
			this.aClass157_5 = local75.aClass157_4;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	@Override
	public int method9384() {
		return this.aShort96 & 0xFFFF;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.aClass157_5 == null ? 0 : this.aClass157_5.fa();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	@Override
	public void method9386() {
		if (this.aClass157_5 != null) {
			this.aClass157_5.method5225();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9380(@OriginalArg(1) Class67 arg0) {
		@Pc(16) Class3_Sub4_Sub13 local16;
		if (this.aClass3_Sub4_Sub13_4 == null && this.aBoolean547) {
			@Pc(27) Class179 local27 = this.method5836(true, arg0, 262144);
			local16 = local27 == null ? null : local27.aClass3_Sub4_Sub13_3;
		} else {
			local16 = this.aClass3_Sub4_Sub13_4;
			this.aClass3_Sub4_Sub13_4 = null;
		}
		if (local16 != null) {
			Static395.method5941(local16, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		if (this.aClass157_5 == null) {
			return true;
		} else {
			return !this.aClass157_5.r();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9382(@OriginalArg(1) Class67 arg0) {
		@Pc(16) Class3_Sub4_Sub13 local16;
		if (this.aClass3_Sub4_Sub13_4 == null && this.aBoolean547) {
			@Pc(27) Class179 local27 = this.method5836(true, arg0, 262144);
			local16 = local27 == null ? null : local27.aClass3_Sub4_Sub13_3;
		} else {
			local16 = this.aClass3_Sub4_Sub13_4;
			this.aClass3_Sub4_Sub13_4 = null;
		}
		if (local16 != null) {
			Static108.method1948(local16, super.aByte145, super.anInt11204, super.anInt11211, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)I")
	@Override
	public int method9381() {
		return this.aByte102;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		if (this.aClass68_1 == null) {
			this.aClass68_1 = Static227.method3546(super.anInt11211, super.anInt11204, super.anInt11208, this.method5837(0, arg0));
		}
		return this.aClass68_1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)I")
	@Override
	public int method9385() {
		return this.aByte103;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			this.method9380((Class67) null);
		}
		return this.aClass157_5 == null ? 0 : this.aClass157_5.ma();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!ha;II)Lclient!ir;")
	private Class179 method5836(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class144 local15 = Static70.aClass323_1.method7792(this.aShort96 & 0xFFFF);
		@Pc(40) Class313 local40;
		@Pc(31) Class313 local31;
		if (this.aBoolean545) {
			local40 = Static711.aClass313Array3[super.aByte145];
			local31 = Static167.aClass313Array1[0];
		} else {
			if (super.aByte145 < 3) {
				local31 = Static167.aClass313Array1[super.aByte145 + 1];
			} else {
				local31 = null;
			}
			local40 = Static167.aClass313Array1[super.aByte145];
		}
		return local15.method3634(super.anInt11204, arg1, arg0, arg2, super.anInt11208, this.aByte102, super.anInt11211, local31, this.aByte103, local40, (Class241) null);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9383() {
		return this.aBoolean547;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class157 local11 = this.method5837(131072, arg1);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class181 local16 = arg1.method7693();
			local16.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			return Static568.aBoolean784 ? local11.method5221(arg2, arg0, local16, false, 0, Static705.anInt11029) : local11.method5218(arg2, arg0, local16, false, 0);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aClass157_5 == null ? false : this.aClass157_5.F();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class157 method5837(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		if (this.aClass157_5 != null && arg1.method7660(this.aClass157_5.ua(), arg0) == 0) {
			return this.aClass157_5;
		} else {
			@Pc(38) Class179 local38 = this.method5836(false, arg1, arg0);
			return local38 == null ? null : local38.aClass157_4;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		if (this.aClass157_5 == null) {
			return null;
		}
		@Pc(12) Class181 local12 = arg0.method7693();
		local12.method6356(super.anInt11204 + super.aShort111, super.anInt11208, super.aShort110 + super.anInt11211);
		@Pc(38) Class19_Sub8 local38 = Static58.method727(1, this.aBoolean546);
		if (Static568.aBoolean784) {
			this.aClass157_5.method5227(local12, local38.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			this.aClass157_5.method5232(local12, local38.aClass19_Sub6Array1[0], 0);
		}
		return local38;
	}
}
