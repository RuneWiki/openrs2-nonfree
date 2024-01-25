import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class26_Sub4_Sub1 extends Class26_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!f", name = "B", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "Z")
	private final boolean aBoolean117;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Z")
	private final boolean aBoolean118;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "S")
	private final short aShort26;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "Z")
	private final boolean aBoolean116;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Lclient!ba;")
	private Class7_Sub4_Sub2 aClass7_Sub4_Sub2_4;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!t;")
	private Class163 aClass163_4;

	static {
		new Class55("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIZIZ)V")
	public Class26_Sub4_Sub1(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt5107, arg1.aBoolean318, arg1.aBoolean324);
		super.anInt7415 = arg5;
		this.aByte18 = (byte) arg7;
		this.aBoolean117 = arg1.anInt5106 != 0 && !arg6;
		super.anInt7423 = arg3;
		this.aBoolean118 = arg6;
		this.aBoolean115 = arg8;
		this.aByte17 = (byte) arg2;
		this.aShort26 = (short) arg1.anInt5088;
		this.aBoolean116 = arg0.method5295() && arg1.aBoolean313 && !this.aBoolean118 && Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean115) {
			local72 |= 0x10000;
		}
		@Pc(87) Class221 local87 = this.method1817(this.aBoolean116, arg0, local72);
		if (local87 != null) {
			this.aClass7_Sub4_Sub2_4 = local87.aClass7_Sub4_Sub2_5;
			this.aClass163_4 = local87.aClass163_6;
			if (this.aBoolean115) {
				this.aClass163_4 = this.aClass163_4.method4654((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5726() {
		return this.aBoolean116;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return this.aBoolean115;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	@Override
	public Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		return this.method1818(arg0, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte18;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class26_Sub4_Sub1) {
			@Pc(9) Class26_Sub4_Sub1 local9 = (Class26_Sub4_Sub1) arg4;
			if (this.aClass163_4 != null && local9.aClass163_4 != null) {
				this.aClass163_4.method4658(local9.aClass163_4, arg2, arg1, arg3, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	@Override
	public int method5732() {
		return 22;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class163 local9 = this.method1818(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class33 local20 = arg1.method5285();
			local20.j(super.anInt7423, super.anInt7422, super.anInt7415);
			return local9.method4653(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		this.aBoolean115 = false;
		if (this.aClass163_4 != null) {
			this.aClass163_4.UA(this.aClass163_4.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ya;)V")
	@Override
	public void method5728(@OriginalArg(1) Class51 arg0) {
		@Pc(32) Class7_Sub4_Sub2 local32;
		if (this.aClass7_Sub4_Sub2_4 == null && this.aBoolean116) {
			@Pc(25) Class221 local25 = this.method1817(true, arg0, 262144);
			local32 = local25 == null ? null : local25.aClass7_Sub4_Sub2_5;
		} else {
			local32 = this.aClass7_Sub4_Sub2_4;
			this.aClass7_Sub4_Sub2_4 = null;
		}
		if (local32 != null) {
			Static294.method3886(local32, this.aByte17, super.anInt7423, super.anInt7415, null);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass163_4 == null) {
			return null;
		}
		@Pc(16) Class33 local16 = arg0.method5285();
		local16.j(super.anInt7423, super.anInt7422, super.anInt7415);
		@Pc(26) Class28_Sub4 local26 = null;
		if (this.aBoolean117) {
			local26 = Static329.method4328(1);
		}
		this.aClass163_4.method4667(local16, local26 == null ? null : local26.aClass28_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	@Override
	public void method5733() {
		if (this.aClass163_4 != null) {
			this.aClass163_4.method4671();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLclient!ya;I)Lclient!ro;")
	private Class221 method1817(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class189 local13 = Static411.aClass142_4.method3148(this.aShort26 & 0xFFFF);
		@Pc(42) Class165 local42;
		@Pc(28) Class165 local28;
		if (this.aBoolean118) {
			local42 = Static28.aClass165Array1[this.aByte17];
			local28 = Static149.aClass165Array7[0];
		} else {
			if (this.aByte17 >= 3) {
				local28 = null;
			} else {
				local28 = Static149.aClass165Array7[this.aByte17 + 1];
			}
			local42 = Static149.aClass165Array7[this.aByte17];
		}
		return local13.method4029(arg2, arg0, super.anInt7422, this.aByte18, super.anInt7423, arg1, local42, 22, local28, super.anInt7415);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BILclient!ya;)Lclient!t;")
	private Class163 method1818(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		if (this.aClass163_4 != null && arg1.method5352(this.aClass163_4.P(), arg0) == 0) {
			return this.aClass163_4;
		} else {
			@Pc(26) Class221 local26 = this.method1817(false, arg1, arg0);
			return local26 == null ? null : local26.aClass163_6;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I")
	@Override
	public int method5731() {
		return this.aShort26 & 0xFFFF;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ya;B)V")
	@Override
	public void method5730(@OriginalArg(0) Class51 arg0) {
		@Pc(14) Class7_Sub4_Sub2 local14;
		if (this.aClass7_Sub4_Sub2_4 == null && this.aBoolean116) {
			@Pc(25) Class221 local25 = this.method1817(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass7_Sub4_Sub2_5;
		} else {
			local14 = this.aClass7_Sub4_Sub2_4;
			this.aClass7_Sub4_Sub2_4 = null;
		}
		if (local14 != null) {
			Static133.method2104(local14, this.aByte17, super.anInt7423, super.anInt7415, null);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}
}
