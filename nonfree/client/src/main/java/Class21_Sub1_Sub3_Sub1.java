import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class21_Sub1_Sub3_Sub1 extends Class21_Sub1_Sub3 implements Interface21 {

	@OriginalMember(owner = "client!gk", name = "M", descriptor = "Lclient!eh;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!gk", name = "S", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!gk", name = "I", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!gk", name = "U", descriptor = "S")
	private final short aShort38;

	@OriginalMember(owner = "client!gk", name = "N", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!gk", name = "ab", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!gk", name = "W", descriptor = "Lclient!da;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "Lclient!ha;")
	private Class4_Sub6_Sub7 aClass4_Sub6_Sub7_3;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIIII)V")
	public Class21_Sub1_Sub3_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean267 = arg1.anInt6681 != 0 && !arg7;
		this.aByte56 = (byte) arg11;
		this.aShort38 = (short) arg1.anInt6713;
		super.anInt10550 = arg6;
		this.aBoolean266 = arg7;
		super.anInt10551 = arg4;
		this.aByte57 = (byte) arg10;
		this.aBoolean265 = arg0.method7782() && arg1.aBoolean466 && !this.aBoolean266 && Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) != 0;
		@Pc(70) Class108 local70 = this.method2834(this.aBoolean265, arg0, 2048);
		if (local70 != null) {
			this.aClass65_3 = local70.aClass65_2;
			this.aClass4_Sub6_Sub7_3 = local70.aClass4_Sub6_Sub7_2;
		}
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aClass65_3 == null ? false : this.aClass65_3.LA();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aShort38 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		@Pc(14) Class4_Sub6_Sub7 local14;
		if (this.aClass4_Sub6_Sub7_3 == null && this.aBoolean265) {
			@Pc(25) Class108 local25 = this.method2834(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass4_Sub6_Sub7_2;
		} else {
			local14 = this.aClass4_Sub6_Sub7_3;
			this.aClass4_Sub6_Sub7_3 = null;
		}
		if (local14 != null) {
			Static4.method1519(local14, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class65 method2833(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass65_3 != null && arg0.method7793(this.aClass65_3.PA(), arg1) == 0) {
			return this.aClass65_3;
		} else {
			@Pc(31) Class108 local31 = this.method2834(false, arg0, arg1);
			return local31 == null ? null : local31.aClass65_2;
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
		if (this.aClass65_3 != null) {
			this.aClass65_3.method7676();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aByte57;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(9) Class65 local9 = this.method2833(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class81 local22 = arg2.method7812();
			local22.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local9.method7685(arg0, arg1, local22, false, Static18.anInt941) : local9.method7684(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass65_3 == null) {
			return null;
		}
		@Pc(16) Class81 local16 = arg0.method7812();
		local16.NA(super.anInt10551 + super.aShort115, super.anInt10554, super.anInt10550 + super.aShort114);
		@Pc(34) Class21_Sub4 local34 = null;
		if (this.aBoolean267) {
			local34 = Static227.method3708(1);
		}
		if (Static263.aBoolean371) {
			this.aClass65_3.method7686(local16, local34 == null ? null : local34.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			this.aClass65_3.method7679(local16, local34 == null ? null : local34.aClass21_Sub7Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		if (this.aClass93_1 == null) {
			this.aClass93_1 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, this.method2833(arg0, 0));
		}
		return this.aClass93_1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLclient!r;IZ)Lclient!fj;")
	private Class108 method2834(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		@Pc(19) Class233 local19 = Static103.aClass298_1.method6822(this.aShort38 & 0xFFFF);
		@Pc(42) Class115 local42;
		@Pc(33) Class115 local33;
		if (this.aBoolean266) {
			local33 = Static432.aClass115Array3[0];
			local42 = Static140.aClass115Array1[super.aByte128];
		} else {
			if (super.aByte128 < 3) {
				local33 = Static432.aClass115Array3[super.aByte128 + 1];
			} else {
				local33 = null;
			}
			local42 = Static432.aClass115Array3[super.aByte128];
		}
		return local19.method5286(local33, super.anInt10554, this.aByte56, arg1, this.aByte57, super.anInt10551, local42, arg2, arg0, super.anInt10550);
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass65_3 == null ? 0 : this.aClass65_3.J();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		@Pc(29) Class4_Sub6_Sub7 local29;
		if (this.aClass4_Sub6_Sub7_3 == null && this.aBoolean265) {
			@Pc(22) Class108 local22 = this.method2834(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass4_Sub6_Sub7_2;
		} else {
			local29 = this.aClass4_Sub6_Sub7_3;
			this.aClass4_Sub6_Sub7_3 = null;
		}
		if (local29 != null) {
			Static440.method6502(local29, super.aByte128, super.anInt10551, super.anInt10550, null);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 >= -102) {
			this.method7281();
		}
		return this.aClass65_3 == null ? 0 : this.aClass65_3.RA();
	}
}
