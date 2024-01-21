import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub2_Sub1_Sub6_Sub2 extends Class2_Sub2_Sub1_Sub6 {

	@OriginalMember(owner = "client!vh", name = "Gc", descriptor = "Lclient!td;")
	public Class2_Sub2_Sub16 aClass2_Sub2_Sub16_1;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method2916() {
		return this.aClass2_Sub2_Sub16_1 != null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass2_Sub2_Sub16_1 == null) {
			return;
		}
		@Pc(22) Class2_Sub2_Sub15 local22 = super.anInt4399 != -1 && super.anInt4376 == 0 ? Static140.method2333(super.anInt4399) : null;
		@Pc(45) Class2_Sub2_Sub15 local45 = super.anInt4389 == -1 || super.anInt4389 == super.anInt4413 && local22 != null ? null : Static140.method2333(super.anInt4389);
		@Pc(56) Class2_Sub2_Sub1_Sub2 local56 = this.aClass2_Sub2_Sub16_1.method2612(local22, super.anInt4406, super.anInt4373, local45);
		if (local56 == null) {
			return;
		}
		@Pc(61) Class2_Sub2_Sub1_Sub2 local61 = null;
		if (super.anInt4404 != -1 && super.anInt4390 != -1) {
			local61 = Static41.method808(super.anInt4404).method1342(super.anInt4390);
			if (local61 != null) {
				local61.method585(0, -super.anInt4379, 0);
			}
		}
		if (local61 != null) {
			local56 = ((Class2_Sub2_Sub1_Sub2_Sub1) local56).method598(local61);
		}
		if (this.aClass2_Sub2_Sub16_1.anInt3766 == 1) {
			local56.aBoolean47 = true;
		}
		local56.method2907(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		super.aShort32 = local56.aShort32;
	}
}
