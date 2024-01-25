import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "S")
	private final short aShort15;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "Z")
	private final boolean aBoolean88;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "Z")
	private final boolean aBoolean86;

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "Lclient!ba;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lclient!t;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIZIIIII)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static327.method4552(arg11, arg10));
		this.aByte19 = (byte) arg11;
		super.anInt4202 = arg3;
		super.anInt4204 = arg5;
		this.aByte18 = (byte) arg2;
		this.aBoolean87 = arg6;
		this.aShort15 = (short) arg1.anInt3648;
		this.aByte17 = (byte) arg10;
		this.aBoolean88 = arg1.anInt3653 != 0 && !arg6;
		this.aBoolean86 = arg0.method4469() && arg1.aBoolean268 && !this.aBoolean87 && Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) != 0;
		@Pc(80) Class225 local80 = this.method1224(this.aBoolean86, 2048, arg0);
		if (local80 != null) {
			this.aClass2_Sub5_Sub1_1 = local80.aClass2_Sub5_Sub1_6;
			this.aClass91_1 = local80.aClass91_6;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aByte17;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
		if (this.aClass91_1 != null) {
			this.aClass91_1.method3292();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aShort15 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIILclient!ya;)Lclient!so;")
	private Class225 method1224(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class49 arg2) {
		@Pc(18) Class134 local18 = Static118.aClass165_2.method3799(this.aShort15 & 0xFFFF);
		@Pc(26) Class64 local26;
		@Pc(30) Class64 local30;
		if (this.aBoolean87) {
			local26 = Static440.aClass64Array3[this.aByte18];
			local30 = Static263.aClass64Array2[0];
		} else {
			local26 = Static263.aClass64Array2[this.aByte18];
			if (this.aByte18 < 3) {
				local30 = Static263.aClass64Array2[this.aByte18 + 1];
			} else {
				local30 = null;
			}
		}
		return local18.method2984(arg2, local26, this.aByte19, super.anInt4202, arg0, local30, super.anInt4212, super.anInt4204, arg1, this.aByte17);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aBoolean86;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass91_1 == null) {
			return null;
		}
		@Pc(18) Class35 local18 = arg0.method4445();
		local18.j(super.anInt4202 + super.anInt4206, super.anInt4212, super.anInt4204 + super.anInt4215);
		@Pc(35) Class8_Sub5 local35 = null;
		if (this.aBoolean88) {
			local35 = Static367.method4998(1);
		}
		this.aClass91_1.method3276(local18, local35 == null ? null : local35.aClass8_Sub4Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		@Pc(31) Class2_Sub5_Sub1 local31;
		if (this.aClass2_Sub5_Sub1_1 == null && this.aBoolean86) {
			@Pc(24) Class225 local24 = this.method1224(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub5_Sub1_6;
		} else {
			local31 = this.aClass2_Sub5_Sub1_1;
			this.aClass2_Sub5_Sub1_1 = null;
		}
		if (local31 != null) {
			Static434.method5668(local31, this.aByte18, super.anInt4202, super.anInt4204, null);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class91 method1225(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass91_1 != null && arg0.method4429(this.aClass91_1.P(), arg1) == 0) {
			return this.aClass91_1;
		} else {
			@Pc(26) Class225 local26 = this.method1224(false, arg1, arg0);
			return local26 == null ? null : local26.aClass91_6;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		@Pc(25) Class2_Sub5_Sub1 local25;
		if (this.aClass2_Sub5_Sub1_1 == null && this.aBoolean86) {
			@Pc(18) Class225 local18 = this.method1224(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub5_Sub1_6;
		} else {
			local25 = this.aClass2_Sub5_Sub1_1;
			this.aClass2_Sub5_Sub1_1 = null;
		}
		if (local25 != null) {
			Static221.method3470(local25, this.aByte18, super.anInt4202, super.anInt4204, null);
		}
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)I")
	@Override
	public int method3426() {
		return this.aClass91_1 == null ? 0 : this.aClass91_1.MA();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.method1225(arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class91 local14 = this.method1225(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class35 local19 = arg1.method4445();
			local19.j(super.anInt4202, super.anInt4212, super.anInt4204);
			return local14.method3288(arg2, arg0, local19, false);
		}
	}
}
