import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class26_Sub1_Sub1 extends Class26_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Z")
	private final boolean aBoolean15;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Z")
	private final boolean aBoolean16;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "Lclient!t;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "Lclient!ba;")
	private Class7_Sub4_Sub2 aClass7_Sub4_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIZIIIII)V")
	public Class26_Sub1_Sub1(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static394.method5011(arg11, arg10));
		this.aShort3 = (short) arg1.anInt5088;
		this.aBoolean15 = arg1.anInt5106 != 0 && !arg6;
		this.aByte2 = (byte) arg10;
		this.aBoolean16 = arg6;
		this.aByte3 = (byte) arg11;
		this.aByte1 = (byte) arg2;
		super.anInt7180 = arg3;
		super.anInt7181 = arg5;
		this.aBoolean14 = arg0.method5295() && arg1.aBoolean313 && !this.aBoolean16 && Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) != 0;
		@Pc(74) Class221 local74 = this.method377(this.aBoolean14, arg0, 2048);
		if (local74 != null) {
			this.aClass163_1 = local74.aClass163_6;
			this.aClass7_Sub4_Sub2_1 = local74.aClass7_Sub4_Sub2_5;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class163 local14 = this.method375(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class33 local19 = arg1.method5285();
			local19.j(super.anInt7180, super.anInt7176, super.anInt7181);
			return local14.method4653(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		@Pc(29) Class7_Sub4_Sub2 local29;
		if (this.aClass7_Sub4_Sub2_1 == null && this.aBoolean14) {
			@Pc(22) Class221 local22 = this.method377(true, arg0, 262144);
			local29 = local22 == null ? null : local22.aClass7_Sub4_Sub2_5;
		} else {
			local29 = this.aClass7_Sub4_Sub2_1;
			this.aClass7_Sub4_Sub2_1 = null;
		}
		if (local29 != null) {
			Static294.method3886(local29, this.aByte1, super.anInt7180, super.anInt7181, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	private Class163 method375(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		if (this.aClass163_1 != null && arg1.method5352(this.aClass163_1.P(), arg0) == 0) {
			return this.aClass163_1;
		} else {
			@Pc(34) Class221 local34 = this.method377(false, arg1, arg0);
			return local34 == null ? null : local34.aClass163_6;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		@Pc(14) Class7_Sub4_Sub2 local14;
		if (this.aClass7_Sub4_Sub2_1 == null && this.aBoolean14) {
			@Pc(25) Class221 local25 = this.method377(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass7_Sub4_Sub2_5;
		} else {
			local14 = this.aClass7_Sub4_Sub2_1;
			this.aClass7_Sub4_Sub2_1 = null;
		}
		if (local14 != null) {
			Static133.method2104(local14, this.aByte1, super.anInt7180, super.anInt7181, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return this.aByte2;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass163_1 == null) {
			return null;
		}
		@Pc(11) Class33 local11 = arg0.method5285();
		local11.j(super.anInt7180 + super.anInt7183, super.anInt7176, super.anInt7186 + super.anInt7181);
		@Pc(28) Class28_Sub4 local28 = null;
		if (this.aBoolean15) {
			local28 = Static329.method4328(1);
		}
		this.aClass163_1.method4667(local11, local28 == null ? null : local28.aClass28_Sub6Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I")
	@Override
	public int method5551() {
		return this.aClass163_1 == null ? 0 : this.aClass163_1.MA();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZBLclient!ya;I)Lclient!ro;")
	private Class221 method377(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class189 local19 = Static411.aClass142_4.method3148(this.aShort3 & 0xFFFF);
		@Pc(31) Class165 local31;
		@Pc(26) Class165 local26;
		if (this.aBoolean16) {
			local26 = Static149.aClass165Array7[0];
			local31 = Static28.aClass165Array1[this.aByte1];
		} else {
			local31 = Static149.aClass165Array7[this.aByte1];
			if (this.aByte1 < 3) {
				local26 = Static149.aClass165Array7[this.aByte1 + 1];
			} else {
				local26 = null;
			}
		}
		return local19.method4029(arg2, arg0, super.anInt7176, this.aByte3, super.anInt7180, arg1, local31, this.aByte2, local26, super.anInt7181);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aBoolean14;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aShort3 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.method375(arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
		if (this.aClass163_1 != null) {
			this.aClass163_1.method4671();
		}
	}
}
