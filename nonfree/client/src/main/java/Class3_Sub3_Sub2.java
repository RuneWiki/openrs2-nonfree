import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!ku", name = "bb", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!ku", name = "Z", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!ku", name = "U", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!ku", name = "Q", descriptor = "S")
	private final short aShort30;

	@OriginalMember(owner = "client!ku", name = "O", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!ku", name = "T", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "Lclient!i;")
	private Class2_Sub5_Sub7 aClass2_Sub5_Sub7_3;

	@OriginalMember(owner = "client!ku", name = "L", descriptor = "Lclient!e;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIZIIIII)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static226.method2969(arg10, arg11));
		super.anInt6454 = arg3;
		this.aBoolean226 = arg6;
		this.aByte36 = (byte) arg10;
		super.anInt6458 = arg5;
		this.aByte35 = (byte) arg11;
		this.aShort30 = (short) arg1.anInt5325;
		this.aByte34 = (byte) arg2;
		this.aBoolean224 = arg1.anInt5357 != 0 && !arg6;
		this.aBoolean225 = arg0.method5544() && arg1.aBoolean392 && !this.aBoolean226 && Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) != 0;
		@Pc(77) Class247 local77 = this.method2938(this.aBoolean225, arg0, 2048);
		if (local77 != null) {
			this.aClass2_Sub5_Sub7_3 = local77.aClass2_Sub5_Sub7_5;
			this.aClass59_4 = local77.aClass59_6;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!za;BI)Lclient!e;")
	private Class59 method2937(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass59_4 != null && arg0.method5502(this.aClass59_4.RA(), arg1) == 0) {
			return this.aClass59_4;
		} else {
			@Pc(31) Class247 local31 = this.method2938(false, arg0, arg1);
			return local31 == null ? null : local31.aClass59_6;
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
		if (this.aClass59_4 != null) {
			this.aClass59_4.method5745();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass59_4 == null) {
			return null;
		}
		@Pc(11) Class31 local11 = arg0.method5539();
		local11.U(super.anInt6462 + super.anInt6454, super.anInt6459, super.anInt6456 + super.anInt6458);
		@Pc(32) Class21_Sub6 local32 = null;
		if (this.aBoolean224) {
			local32 = Static209.method2805(1);
		}
		this.aClass59_4.method5736(local11, local32 == null ? null : local32.aClass21_Sub7Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)I")
	@Override
	public int method5020() {
		return this.aClass59_4 == null ? 0 : this.aClass59_4.B();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		@Pc(14) Class2_Sub5_Sub7 local14;
		if (this.aClass2_Sub5_Sub7_3 == null && this.aBoolean225) {
			@Pc(25) Class247 local25 = this.method2938(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass2_Sub5_Sub7_5;
		} else {
			local14 = this.aClass2_Sub5_Sub7_3;
			this.aClass2_Sub5_Sub7_3 = null;
		}
		if (local14 != null) {
			Static357.method4497(local14, this.aByte34, super.anInt6454, super.anInt6458, null);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZILclient!za;I)Lclient!uo;")
	private Class247 method2938(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class192 local19 = Static50.aClass190_1.method4218(this.aShort30 & 0xFFFF);
		@Pc(31) Class162 local31;
		@Pc(26) Class162 local26;
		if (this.aBoolean226) {
			local26 = Static314.aClass162Array2[0];
			local31 = Static109.aClass162Array1[this.aByte34];
		} else {
			if (this.aByte34 >= 3) {
				local26 = null;
			} else {
				local26 = Static314.aClass162Array2[this.aByte34 + 1];
			}
			local31 = Static314.aClass162Array2[this.aByte34];
		}
		return local19.method4234(this.aByte36, arg2, super.anInt6454, super.anInt6459, local26, arg1, local31, super.anInt6458, this.aByte35, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		@Pc(25) Class2_Sub5_Sub7 local25;
		if (this.aClass2_Sub5_Sub7_3 == null && this.aBoolean225) {
			@Pc(18) Class247 local18 = this.method2938(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub5_Sub7_5;
		} else {
			local25 = this.aClass2_Sub5_Sub7_3;
			this.aClass2_Sub5_Sub7_3 = null;
		}
		if (local25 != null) {
			Static92.method1462(local25, this.aByte34, super.anInt6454, super.anInt6458, null);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.method2937(arg1, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aByte36;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aBoolean225;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(9) Class59 local9 = this.method2937(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class31 local14 = arg2.method5539();
			local14.U(super.anInt6454, super.anInt6459, super.anInt6458);
			return local9.method5748(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aShort30 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aByte35;
	}
}
