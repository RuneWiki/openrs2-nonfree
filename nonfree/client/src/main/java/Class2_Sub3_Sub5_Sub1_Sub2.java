import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub3_Sub5_Sub1_Sub2 extends Class2_Sub3_Sub5_Sub1 {

	@OriginalMember(owner = "client!ng", name = "ec", descriptor = "Lclient!ug;")
	public Class2_Sub3_Sub17 aClass2_Sub3_Sub17_1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1806() {
		return this.aClass2_Sub3_Sub17_1 != null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass2_Sub3_Sub17_1 == null) {
			return;
		}
		@Pc(21) Class2_Sub3_Sub8 local21 = super.anInt2658 != -1 && super.anInt2682 == 0 ? Static129.method2790(super.anInt2658) : null;
		@Pc(40) Class2_Sub3_Sub8 local40 = super.anInt2657 == -1 || super.anInt2668 == super.anInt2657 && local21 != null ? null : Static129.method2790(super.anInt2657);
		@Pc(51) Class2_Sub3_Sub5_Sub7 local51 = this.aClass2_Sub3_Sub17_1.method2650(local40, super.anInt2688, local21, super.anInt2665);
		if (local51 == null) {
			return;
		}
		local51.method2312();
		super.aShort25 = local51.aShort25;
		@Pc(62) Class2_Sub3_Sub5_Sub7 local62 = null;
		if (super.anInt2708 != -1 && super.anInt2663 != -1) {
			local62 = Static122.method1901(super.anInt2708).method2157(super.anInt2663);
			if (local62 != null) {
				local62.method2305(0, -super.anInt2673, 0);
			}
		}
		if (local62 != null) {
			local51 = ((Class2_Sub3_Sub5_Sub7_Sub1) local51).method2316(local62);
		}
		if (this.aClass2_Sub3_Sub17_1.anInt3906 == 1) {
			local51.aBoolean142 = true;
		}
		local51.method2297(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}
}
