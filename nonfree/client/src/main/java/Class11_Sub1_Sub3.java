import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class11_Sub1_Sub3 extends Class11_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Z")
	private final boolean aBoolean409;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!qh;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_4;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!bi;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIZIZ)V")
	public Class11_Sub1_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean164, arg1.aBoolean163);
		this.aBoolean410 = arg6;
		this.aShort73 = (short) arg1.anInt2365;
		super.anInt5302 = (short) arg3;
		this.aByte55 = (byte) arg7;
		this.aBoolean412 = arg8;
		super.anInt5299 = (short) arg5;
		this.aBoolean409 = arg1.anInt2377 != 0 && !arg6;
		this.aByte56 = (byte) arg2;
		this.aBoolean411 = arg0.method4583() && arg1.aBoolean165 && !this.aBoolean410 && Static218.anInt4352 != 0;
		@Pc(69) int local69 = 1024;
		if (this.aBoolean412) {
			local69 |= 0x8000;
		}
		@Pc(84) Class221 local84 = this.method4875(arg0, local69, this.aBoolean411);
		if (local84 != null) {
			this.aClass1_Sub4_Sub4_4 = local84.aClass1_Sub4_Sub4_6;
			this.aClass3_5 = local84.aClass3_7;
			if (this.aBoolean412) {
				this.aClass3_5 = this.aClass3_5.method1261((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!fp;IZ)Lclient!wk;")
	private Class221 method4875(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class71 local12 = Static219.method4081(this.aShort73 & 0xFFFF);
		@Pc(25) Class36 local25;
		@Pc(29) Class36 local29;
		if (this.aBoolean410) {
			local25 = Static200.aClass36Array4[this.aByte56];
			local29 = Static50.aClass36Array3[0];
		} else {
			local25 = Static50.aClass36Array3[this.aByte56];
			if (this.aByte56 >= 3) {
				local29 = null;
			} else {
				local29 = Static50.aClass36Array3[this.aByte56 + 1];
			}
		}
		return local12.method2280(local29, super.anInt5299, super.anInt5302, 22, arg2, super.anInt5301, arg0, arg1, local25, this.aByte55);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		@Pc(19) Class1_Sub4_Sub4 local19;
		if (this.aClass1_Sub4_Sub4_4 == null && this.aBoolean411) {
			@Pc(30) Class221 local30 = this.method4875(arg0, 131072, true);
			local19 = local30 == null ? null : local30.aClass1_Sub4_Sub4_6;
		} else {
			local19 = this.aClass1_Sub4_Sub4_4;
			this.aClass1_Sub4_Sub4_4 = null;
		}
		if (local19 != null) {
			Static150.method4953(local19, this.aByte56, super.anInt5302, super.anInt5299, null);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aBoolean411;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;IB)Lclient!bi;")
	private Class3 method4877(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_5 != null && arg0.method4574(this.aClass3_5.method1256(), arg1) == 0) {
			return this.aClass3_5;
		} else {
			@Pc(28) Class221 local28 = this.method4875(arg0, arg1, false);
			return local28 == null ? null : local28.aClass3_7;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		@Pc(29) Class1_Sub4_Sub4 local29;
		if (this.aClass1_Sub4_Sub4_4 == null && this.aBoolean411) {
			@Pc(22) Class221 local22 = this.method4875(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass1_Sub4_Sub4_6;
		} else {
			local29 = this.aClass1_Sub4_Sub4_4;
			this.aClass1_Sub4_Sub4_4 = null;
		}
		if (local29 != null) {
			Static38.method932(local29, this.aByte56, super.anInt5302, super.anInt5299, null);
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return 22;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
		if (this.aClass3_5 != null) {
			this.aClass3_5.method1243();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class11_Sub1_Sub3) {
			@Pc(5) Class11_Sub1_Sub3 local5 = (Class11_Sub1_Sub3) arg1;
			if (this.aClass3_5 != null && local5.aClass3_5 != null) {
				this.aClass3_5.method1258(local5.aClass3_5, arg4, arg3, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class3 local19 = this.method4877(arg0, 65536);
		if (local19 == null) {
			return false;
		} else {
			@Pc(24) Class129 local24 = arg0.method4634();
			local24.method5774(super.anInt5302, super.anInt5301, super.anInt5299);
			return local19.method1283(arg2, arg1, local24, false);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.method4877(arg0, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass3_5 == null) {
			return null;
		}
		@Pc(16) Class129 local16 = arg0.method4634();
		local16.method5774(super.anInt5302, super.anInt5301, super.anInt5299);
		@Pc(26) Class32_Sub7 local26 = null;
		if (this.aBoolean409) {
			local26 = Static67.method1550(1);
		}
		this.aClass3_5.method1242(local16, local26 == null ? null : local26.aClass32_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		this.aBoolean412 = false;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method1270(this.aClass3_5.method1256() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return this.aBoolean412;
	}
}
