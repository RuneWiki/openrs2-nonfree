import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class11_Sub3_Sub2 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
	public static int anInt4220 = -1;

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Z")
	private final boolean aBoolean277;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Z")
	private final boolean aBoolean278;

	@OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
	private final boolean aBoolean279;

	@OriginalMember(owner = "client!ni", name = "T", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_5;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!gn;")
	private Class31 aClass31_6;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIZIIIII)V", line = 346)
	public Class11_Sub3_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static359.method6430(arg10, arg11));
		this.aByte42 = (byte) arg2;
		this.aShort60 = (short) arg1.anInt1349;
		this.aByte41 = (byte) arg11;
		super.anInt6330 = (short) arg5;
		super.anInt6332 = (short) arg3;
		this.aByte43 = (byte) arg10;
		this.aBoolean277 = arg6;
		this.aBoolean278 = arg1.anInt1334 != 0 && !arg6;
		this.aBoolean279 = arg0.method2880() && arg1.aBoolean110 && !this.aBoolean277 && Static203.aClass177_Sub1_2.anInt4876 != 0;
		@Pc(74) Class105 local74 = this.method4098(1024, this.aBoolean279, arg0);
		if (local74 != null) {
			this.aClass2_Sub2_Sub4_5 = local74.aClass2_Sub2_Sub4_3;
			this.aClass31_6 = local74.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;I)V", line = 6)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		@Pc(31) Class2_Sub2_Sub4 local31;
		if (this.aClass2_Sub2_Sub4_5 == null && this.aBoolean279) {
			@Pc(24) Class105 local24 = this.method4098(131072, true, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub2_Sub4_3;
		} else {
			local31 = this.aClass2_Sub2_Sub4_5;
			this.aClass2_Sub2_Sub4_5 = null;
		}
		if (local31 != null) {
			Static145.method2782(local31, this.aByte42, super.anInt6332, super.anInt6330, null);
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I", line = 36)
	@Override
	public int method6086() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;B)V", line = 49)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!wm;)V", line = 62)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class2_Sub2_Sub4 local14;
		if (this.aClass2_Sub2_Sub4_5 == null && this.aBoolean279) {
			@Pc(25) Class105 local25 = this.method4098(131072, true, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub4_3;
		} else {
			local14 = this.aClass2_Sub2_Sub4_5;
			this.aClass2_Sub2_Sub4_5 = null;
		}
		if (local14 != null) {
			Static53.method1621(local14, this.aByte42, super.anInt6332, super.anInt6330, null);
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)I", line = 90)
	@Override
	public int method6085() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)Z", line = 102)
	@Override
	public boolean method6087() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I", line = 196)
	@Override
	public int method6082() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)I", line = 208)
	@Override
	public int method5749() {
		return this.aClass31_6 == null ? 0 : this.aClass31_6.method3803();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wm;II)Lclient!gn;", line = 219)
	private Class31 method4097(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass31_6 != null && arg0.method2865(this.aClass31_6.method3828(), arg1) == 0) {
			return this.aClass31_6;
		} else {
			@Pc(28) Class105 local28 = this.method4098(arg1, false, arg0);
			return local28 == null ? null : local28.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 239)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(14) Class31 local14 = this.method4097(arg2, 65536);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class14 local19 = arg2.method2810();
			local19.method3923(super.anInt6332, super.anInt6336, super.anInt6330);
			return local14.method3821(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBZLclient!wm;)Lclient!ij;", line = 260)
	private Class105 method4098(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(13) Class41 local13 = Static334.aClass202_4.method5164(this.aShort60 & 0xFFFF);
		@Pc(21) Class6 local21;
		@Pc(27) Class6 local27;
		if (this.aBoolean277) {
			local27 = Static307.aClass6Array3[0];
			local21 = Static174.aClass6Array2[this.aByte42];
		} else {
			local21 = Static307.aClass6Array3[this.aByte42];
			if (this.aByte42 >= 3) {
				local27 = null;
			} else {
				local27 = Static307.aClass6Array3[this.aByte42 + 1];
			}
		}
		return local13.method1521(super.anInt6336, local21, this.aByte41, super.anInt6330, super.anInt6332, arg0, arg1, arg2, local27, this.aByte43);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 293)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.method4097(arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 305)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass31_6 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2810();
		local11.method3923(super.anInt6332 + super.anInt6335, super.anInt6336, super.anInt6338 + super.anInt6330);
		@Pc(35) Class12_Sub4 local35 = null;
		if (this.aBoolean278) {
			local35 = Static138.method2708(1);
		}
		this.aClass31_6.method3836(local11, local35 == null ? null : local35.aClass12_Sub2Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 332)
	@Override
	public void method6083() {
		if (this.aClass31_6 != null) {
			this.aClass31_6.method3811();
		}
	}
}
