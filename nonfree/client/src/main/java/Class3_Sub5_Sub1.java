import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!in", name = "H", descriptor = "S")
	private final short aShort42;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!in", name = "N", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!in", name = "K", descriptor = "Lclient!ba;")
	private Class2_Sub5_Sub1 aClass2_Sub5_Sub1_3;

	@OriginalMember(owner = "client!in", name = "O", descriptor = "Lclient!t;")
	public Class91 aClass91_3;

	static {
		new Class209("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ya;Lclient!jo;IIIIZIIZ)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static39.method622(arg7, arg8));
		super.anInt6510 = arg5;
		this.aShort42 = (short) arg1.anInt3648;
		this.aByte51 = (byte) arg7;
		this.aByte53 = (byte) arg2;
		this.aBoolean252 = arg6;
		super.anInt6512 = arg3;
		this.aBoolean253 = arg9;
		this.aByte52 = (byte) arg8;
		this.aBoolean254 = arg1.anInt3653 != 0 && !arg6;
		this.aBoolean255 = arg0.method4469() && arg1.aBoolean268 && !this.aBoolean252 && Static12.aClass79_Sub1_1.method3960(Static399.anInt6653) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean253) {
			local71 |= 0x10000;
		}
		@Pc(86) Class225 local86 = this.method2703(this.aBoolean255, arg0, local71);
		if (local86 != null) {
			this.aClass2_Sub5_Sub1_3 = local86.aClass2_Sub5_Sub1_6;
			this.aClass91_3 = local86.aClass91_6;
			if (this.aBoolean253) {
				this.aClass91_3 = this.aClass91_3.method3285((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5151(@OriginalArg(1) Class49 arg0) {
		@Pc(29) Class2_Sub5_Sub1 local29;
		if (this.aClass2_Sub5_Sub1_3 == null && this.aBoolean255) {
			@Pc(22) Class225 local22 = this.method2703(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass2_Sub5_Sub1_6;
		} else {
			local29 = this.aClass2_Sub5_Sub1_3;
			this.aClass2_Sub5_Sub1_3 = null;
		}
		if (local29 != null) {
			Static221.method3470(local29, this.aByte53, super.anInt6512, super.anInt6510, null);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass91_3 == null) {
			return null;
		}
		@Pc(17) Class35 local17 = arg0.method4445();
		local17.j(super.anInt6512, super.anInt6515, super.anInt6510);
		@Pc(27) Class8_Sub5 local27 = null;
		if (this.aBoolean254) {
			local27 = Static367.method4998(1);
		}
		this.aClass91_3.method3276(local17, local27 == null ? null : local27.aClass8_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	@Override
	public void method5150() {
		if (this.aClass91_3 != null) {
			this.aClass91_3.method3292();
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5156(@OriginalArg(1) Class49 arg0) {
		@Pc(20) Class2_Sub5_Sub1 local20;
		if (this.aClass2_Sub5_Sub1_3 == null && this.aBoolean255) {
			@Pc(31) Class225 local31 = this.method2703(true, arg0, 262144);
			local20 = local31 == null ? null : local31.aClass2_Sub5_Sub1_6;
		} else {
			local20 = this.aClass2_Sub5_Sub1_3;
			this.aClass2_Sub5_Sub1_3 = null;
		}
		if (local20 != null) {
			Static434.method5668(local20, this.aByte53, super.anInt6512, super.anInt6510, null);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	private Class91 method2701(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass91_3 != null && arg0.method4429(this.aClass91_3.P(), arg1) == 0) {
			return this.aClass91_3;
		} else {
			@Pc(26) Class225 local26 = this.method2703(false, arg0, arg1);
			return local26 == null ? null : local26.aClass91_6;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	@Override
	public Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		return this.method2701(arg0, arg1);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5152() {
		return this.aBoolean255;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)I")
	@Override
	public int method5153() {
		return this.aShort42 & 0xFFFF;
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return this.aBoolean253;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLclient!ya;I)Lclient!so;")
	private Class225 method2703(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class134 local13 = Static118.aClass165_2.method3799(this.aShort42 & 0xFFFF);
		@Pc(32) Class64 local32;
		@Pc(27) Class64 local27;
		if (this.aBoolean252) {
			local27 = Static263.aClass64Array2[0];
			local32 = Static440.aClass64Array3[this.aByte53];
		} else {
			if (this.aByte53 >= 3) {
				local27 = null;
			} else {
				local27 = Static263.aClass64Array2[this.aByte53 + 1];
			}
			local32 = Static263.aClass64Array2[this.aByte53];
		}
		return local13.method2984(arg1, local32, this.aByte52, super.anInt6512, arg0, local27, super.anInt6515, super.anInt6510, arg2, this.aByte51);
	}

	@OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		this.aBoolean253 = false;
		if (this.aClass91_3 != null) {
			this.aClass91_3.UA(this.aClass91_3.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.aByte51;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class3_Sub5_Sub1) {
			@Pc(32) Class3_Sub5_Sub1 local32 = (Class3_Sub5_Sub1) arg3;
			if (this.aClass91_3 != null && local32.aClass91_3 != null) {
				this.aClass91_3.method3289(local32.aClass91_3, arg1, arg5, arg4, arg2);
			}
		} else if (arg3 instanceof Class3_Sub2_Sub6) {
			@Pc(12) Class3_Sub2_Sub6 local12 = (Class3_Sub2_Sub6) arg3;
			if (this.aClass91_3 != null && local12.aClass91_5 != null) {
				this.aClass91_3.method3289(local12.aClass91_5, arg1, arg5, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I")
	@Override
	public int method5155() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class91 local14 = this.method2701(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class35 local19 = arg1.method4445();
			local19.j(super.anInt6512, super.anInt6515, super.anInt6510);
			return local14.method3288(arg2, arg0, local19, false);
		}
	}
}
