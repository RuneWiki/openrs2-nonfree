import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "S")
	private final short aShort89;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
	private final boolean aBoolean443;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "Lclient!n;")
	private Class66 aClass66_7;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "Lclient!dh;")
	private Class2_Sub10_Sub3 aClass2_Sub10_Sub3_6;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIZIIIII)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static38.method690(arg10, arg11));
		this.aByte64 = (byte) arg11;
		this.aByte63 = (byte) arg2;
		this.aByte65 = (byte) arg10;
		this.aShort89 = (short) arg1.anInt4131;
		this.aBoolean443 = arg1.anInt4140 != 0 && !arg6;
		super.anInt6263 = (short) arg5;
		this.aBoolean444 = arg6;
		super.anInt6264 = (short) arg3;
		this.aBoolean442 = arg0.method2036() && arg1.aBoolean319 && !this.aBoolean444 && Static202.anInt3721 != 0;
		@Pc(73) Class37 local73 = this.method5453(arg0, 1024, this.aBoolean442);
		if (local73 != null) {
			this.aClass66_7 = local73.aClass66_2;
			this.aClass2_Sub10_Sub3_6 = local73.aClass2_Sub10_Sub3_2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aShort89 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		@Pc(14) Class2_Sub10_Sub3 local14;
		if (this.aClass2_Sub10_Sub3_6 == null && this.aBoolean442) {
			@Pc(25) Class37 local25 = this.method5453(arg0, 131072, true);
			local14 = local25 == null ? null : local25.aClass2_Sub10_Sub3_2;
		} else {
			local14 = this.aClass2_Sub10_Sub3_6;
			this.aClass2_Sub10_Sub3_6 = null;
		}
		if (local14 != null) {
			Static43.method733(local14, this.aByte63, super.anInt6264, super.anInt6263, null);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		@Pc(14) Class2_Sub10_Sub3 local14;
		if (this.aClass2_Sub10_Sub3_6 == null && this.aBoolean442) {
			@Pc(27) Class37 local27 = this.method5453(arg0, 131072, true);
			local14 = local27 == null ? null : local27.aClass2_Sub10_Sub3_2;
		} else {
			local14 = this.aClass2_Sub10_Sub3_6;
			this.aClass2_Sub10_Sub3_6 = null;
		}
		if (local14 != null) {
			Static258.method4008(local14, this.aByte63, super.anInt6264, super.anInt6263, null);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!vc;IIZ)Lclient!co;")
	private Class37 method5453(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class172 local13 = Static221.aClass118_6.method2858(this.aShort89 & 0xFFFF);
		@Pc(21) Class107 local21;
		@Pc(27) Class107 local27;
		if (this.aBoolean444) {
			local27 = Static90.aClass107Array1[0];
			local21 = Static94.aClass107Array2[this.aByte63];
		} else {
			local21 = Static90.aClass107Array1[this.aByte63];
			if (this.aByte63 >= 3) {
				local27 = null;
			} else {
				local27 = Static90.aClass107Array1[this.aByte63 + 1];
			}
		}
		return local13.method3787(super.anInt6263, local27, arg2, this.aByte64, arg1, arg0, super.anInt6264, this.aByte65, super.anInt6262, local21);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class66 local9 = this.method5454(65536, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class44 local14 = arg0.method2024();
			local14.method3541(super.anInt6264, super.anInt6262, super.anInt6263);
			return local9.method5131(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!vc;I)Lclient!n;")
	private Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		if (this.aClass66_7 != null && arg1.method2051(this.aClass66_7.method5127(), arg0) == 0) {
			return this.aClass66_7;
		} else {
			@Pc(26) Class37 local26 = this.method5453(arg1, arg0, false);
			return local26 == null ? null : local26.aClass66_2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aBoolean442;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.method5454(arg0, arg1);
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		if (this.aClass66_7 == null) {
			return null;
		}
		@Pc(17) Class44 local17 = arg0.method2024();
		local17.method3541(super.anInt6264 + super.anInt6258, super.anInt6262, super.anInt6263 + super.anInt6266);
		@Pc(34) Class10_Sub3 local34 = null;
		if (this.aBoolean443) {
			local34 = Static299.method4461(1);
		}
		this.aClass66_7.method5126(local17, local34 == null ? null : local34.aClass10_Sub7Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
	@Override
	public int method5442() {
		return this.aClass66_7 == null ? 0 : this.aClass66_7.method5140();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
		if (this.aClass66_7 != null) {
			this.aClass66_7.method5150();
		}
	}
}
