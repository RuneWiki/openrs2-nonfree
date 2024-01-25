import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "S")
	private final short aShort45;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Z")
	private final boolean aBoolean293;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!ts;")
	private Class112 aClass112_2;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!lb;")
	private Class5_Sub1_Sub10 aClass5_Sub1_Sub10_2;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIZIIIII)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static98.method1773(arg10, arg11));
		super.anInt3787 = (short) arg3;
		this.aBoolean294 = arg1.anInt4756 != 0 && !arg6;
		this.aByte21 = (byte) arg11;
		this.aByte23 = (byte) arg10;
		this.aShort45 = (short) arg1.lb;
		this.aBoolean295 = arg6;
		this.aByte22 = (byte) arg2;
		super.anInt3789 = (short) arg5;
		this.aBoolean293 = arg0.method5160() && arg1.aBoolean396 && !this.aBoolean295 && Static95.anInt1828 != 0;
		@Pc(76) Class191 local76 = this.method3436(this.aBoolean293, arg0, 1024);
		if (local76 != null) {
			this.aClass112_2 = local76.aClass112_6;
			this.aClass5_Sub1_Sub10_2 = local76.aClass5_Sub1_Sub10_6;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!ea;II)Lclient!to;")
	private Class191 method3436(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class156 local12 = Static111.method1967(this.aShort45 & 0xFFFF);
		@Pc(30) Class51 local30;
		@Pc(25) Class51 local25;
		if (this.aBoolean295) {
			local25 = Static56.aClass51Array2[0];
			local30 = Static219.aClass51Array3[this.aByte22];
		} else {
			if (this.aByte22 >= 3) {
				local25 = null;
			} else {
				local25 = Static56.aClass51Array2[this.aByte22 + 1];
			}
			local30 = Static56.aClass51Array2[this.aByte22];
		}
		return local12.method4221(local30, arg1, this.aByte21, arg0, this.aByte23, super.anInt3795, arg2, super.anInt3789, super.anInt3787, local25);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.method3440(arg1, arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		@Pc(20) Class5_Sub1_Sub10 local20;
		if (this.aClass5_Sub1_Sub10_2 == null && this.aBoolean293) {
			@Pc(31) Class191 local31 = this.method3436(true, arg0, 131072);
			local20 = local31 == null ? null : local31.aClass5_Sub1_Sub10_6;
		} else {
			local20 = this.aClass5_Sub1_Sub10_2;
			this.aClass5_Sub1_Sub10_2 = null;
		}
		if (local20 != null) {
			Static146.method2670(local20, this.aByte22, super.anInt3787, super.anInt3789, null);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class112 local14 = this.method3440(65536, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class66 local19 = arg1.method5195();
			local19.method5822(super.anInt3787, super.anInt3795, super.anInt3789);
			return local14.method4340(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass112_2 == null) {
			return null;
		}
		@Pc(11) Class66 local11 = arg0.method5195();
		local11.method5822(super.anInt3791 + super.anInt3787, super.anInt3795, super.anInt3794 + super.anInt3789);
		@Pc(27) Class32_Sub4 local27 = null;
		if (this.aBoolean294) {
			local27 = Static232.method4183(1);
		}
		this.aClass112_2.method4338(local11, local27 == null ? null : local27.aClass32_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
		if (this.aClass112_2 != null) {
			this.aClass112_2.method4343();
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aShort45 & 0xFFFF;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		@Pc(33) Class5_Sub1_Sub10 local33;
		if (this.aClass5_Sub1_Sub10_2 == null && this.aBoolean293) {
			@Pc(26) Class191 local26 = this.method3436(true, arg0, 131072);
			local33 = local26 == null ? null : local26.aClass5_Sub1_Sub10_6;
		} else {
			local33 = this.aClass5_Sub1_Sub10_2;
			this.aClass5_Sub1_Sub10_2 = null;
		}
		if (local33 != null) {
			Static231.method4152(local33, this.aByte22, super.anInt3787, super.anInt3789, null);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BILclient!ea;)Lclient!ts;")
	private Class112 method3440(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1) {
		if (this.aClass112_2 != null && arg1.method5181(this.aClass112_2.method4308(), arg0) == 0) {
			return this.aClass112_2;
		} else {
			@Pc(34) Class191 local34 = this.method3436(false, arg1, arg0);
			return local34 == null ? null : local34.aClass112_6;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aBoolean293;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
	@Override
	public int method3426() {
		return this.aClass112_2 == null ? 0 : this.aClass112_2.method4331();
	}
}
