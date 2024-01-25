import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "S")
	private final short aShort62;

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Z")
	private final boolean aBoolean322;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "Lclient!t;")
	private Class91 aClass91_4;

	@OriginalMember(owner = "client!lq", name = "K", descriptor = "Lclient!ba;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_4;

	static {
		new Class209("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIZIZ)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean270, arg1.aBoolean267);
		this.aByte73 = (byte) arg2;
		super.anInt4393 = arg5;
		this.aShort62 = (short) arg1.anInt3648;
		this.aBoolean322 = arg6;
		this.aBoolean321 = arg1.anInt3653 != 0 && !arg6;
		this.aBoolean323 = arg8;
		this.aByte72 = (byte) arg7;
		super.anInt4392 = arg3;
		this.aBoolean320 = arg0.method4469() && arg1.aBoolean268 && !this.aBoolean322 && Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) != 0;
		@Pc(70) int local70 = 2048;
		if (this.aBoolean323) {
			local70 |= 0x10000;
		}
		@Pc(85) Class225 local85 = this.method3579(local70, arg0, this.aBoolean320);
		if (local85 != null) {
			this.aClass91_4 = local85.aClass91_6;
			this.aClass2_Sub5_Sub1_4 = local85.aClass2_Sub5_Sub1_6;
			if (this.aBoolean323) {
				this.aClass91_4 = this.aClass91_4.method3285((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.method3580(arg0, arg1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBLclient!ya;Z)Lclient!so;")
	private Class225 method3579(@OriginalArg(0) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class134 local13 = Static118.aClass165_2.method3799(this.aShort62 & 0xFFFF);
		@Pc(25) Class64 local25;
		@Pc(20) Class64 local20;
		if (this.aBoolean322) {
			local20 = Static263.aClass64Array2[0];
			local25 = Static440.aClass64Array3[this.aByte73];
		} else {
			if (this.aByte73 >= 3) {
				local20 = null;
			} else {
				local20 = Static263.aClass64Array2[this.aByte73 + 1];
			}
			local25 = Static263.aClass64Array2[this.aByte73];
		}
		return local13.method2984(arg1, local25, this.aByte72, super.anInt4392, arg2, local20, super.anInt4391, super.anInt4393, arg0, 22);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	private Class91 method3580(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass91_4 != null && arg0.method4429(this.aClass91_4.P(), arg1) == 0) {
			return this.aClass91_4;
		} else {
			@Pc(26) Class225 local26 = this.method3579(arg1, arg0, false);
			return local26 == null ? null : local26.aClass91_6;
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass91_4 == null) {
			return null;
		}
		@Pc(11) Class35 local11 = arg0.method4445();
		local11.j(super.anInt4392, super.anInt4391, super.anInt4393);
		@Pc(21) Class8_Sub5 local21 = null;
		if (this.aBoolean321) {
			local21 = Static367.method4998(1);
		}
		this.aClass91_4.method3276(local11, local21 == null ? null : local21.aClass8_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
		if (this.aClass91_4 != null) {
			this.aClass91_4.method3292();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return 22;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!(arg3 instanceof Class3_Sub1_Sub3)) {
			return;
		}
		@Pc(16) Class3_Sub1_Sub3 local16 = (Class3_Sub1_Sub3) arg3;
		if (this.aClass91_4 != null && local16.aClass91_4 != null) {
			this.aClass91_4.method3289(local16.aClass91_4, arg1, arg5, arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aShort62 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return this.aBoolean323;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aBoolean320;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		@Pc(25) Class2_Sub5_Sub1 local25;
		if (this.aClass2_Sub5_Sub1_4 == null && this.aBoolean320) {
			@Pc(18) Class225 local18 = this.method3579(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass2_Sub5_Sub1_6;
		} else {
			local25 = this.aClass2_Sub5_Sub1_4;
			this.aClass2_Sub5_Sub1_4 = null;
		}
		if (local25 != null) {
			Static434.method5668(local25, this.aByte73, super.anInt4392, super.anInt4393, null);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class91 local14 = this.method3580(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class35 local19 = arg1.method4445();
			local19.j(super.anInt4392, super.anInt4391, super.anInt4393);
			return local14.method3288(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		this.aBoolean323 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.UA(this.aClass91_4.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		@Pc(19) Class2_Sub5_Sub1 local19;
		if (this.aClass2_Sub5_Sub1_4 == null && this.aBoolean320) {
			@Pc(30) Class225 local30 = this.method3579(262144, arg0, true);
			local19 = local30 == null ? null : local30.aClass2_Sub5_Sub1_6;
		} else {
			local19 = this.aClass2_Sub5_Sub1_4;
			this.aClass2_Sub5_Sub1_4 = null;
		}
		if (local19 != null) {
			Static221.method3470(local19, this.aByte73, super.anInt4392, super.anInt4393, null);
		}
	}
}
