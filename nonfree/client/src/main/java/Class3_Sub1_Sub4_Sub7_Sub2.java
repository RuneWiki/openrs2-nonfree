import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub1_Sub4_Sub7_Sub2 extends Class3_Sub1_Sub4_Sub7 {

	@OriginalMember(owner = "client!ra", name = "Dc", descriptor = "Lclient!id;")
	public Class3_Sub1_Sub10 aClass3_Sub1_Sub10_1;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method2274() {
		return this.aClass3_Sub1_Sub10_1 != null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass3_Sub1_Sub10_1 == null) {
			return;
		}
		@Pc(21) Class3_Sub1_Sub8 local21 = super.anInt3184 != -1 && super.anInt3173 == 0 ? Static98.method1697(super.anInt3184) : null;
		@Pc(44) Class3_Sub1_Sub8 local44 = super.anInt3141 == -1 || super.anInt3154 == super.anInt3141 && local21 != null ? null : Static98.method1697(super.anInt3141);
		@Pc(55) Class3_Sub1_Sub4_Sub5 local55 = this.aClass3_Sub1_Sub10_1.method1205(local21, local44, super.anInt3172, super.anInt3174);
		if (local55 == null) {
			return;
		}
		@Pc(60) Class3_Sub1_Sub4_Sub5 local60 = null;
		if (super.anInt3149 != -1 && super.anInt3189 != -1) {
			local60 = Static12.method196(super.anInt3149).method1831(super.anInt3189);
			if (local60 != null) {
				local60.method1879(0, -super.anInt3157, 0);
			}
		}
		if (local60 != null) {
			local55 = ((Class3_Sub1_Sub4_Sub5_Sub1) local55).method1894(local60);
		}
		if (this.aClass3_Sub1_Sub10_1.anInt1556 == 1) {
			local55.aBoolean166 = true;
		}
		local55.method2260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		super.aShort32 = local55.aShort32;
	}
}
