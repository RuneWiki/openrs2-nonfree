import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	public int anInt871;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public int anInt876;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public int anInt873 = -1;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
	public int anInt870 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(11) Class21 local11 = arg0.method3284();
		local11.method2814(super.anInt865, super.anInt860, super.anInt863);
		@Pc(23) Class15_Sub3 local23 = Static186.method3613(3);
		@Pc(43) Class78 local43;
		if (this.anInt870 != -1) {
			local43 = Static241.method4285(this.anInt870).method1734(0, null, 1024, 0, arg0, null, -1, this.anInt874);
			if (local43 != null) {
				local43.method4379(local11, local23.aClass15_Sub2Array1[2], 0);
			}
		}
		if (this.anInt873 != -1) {
			local43 = Static241.method4285(this.anInt873).method1734(0, null, 1024, 0, arg0, null, -1, this.anInt875);
			if (local43 != null) {
				local43.method4379(local11, local23.aClass15_Sub2Array1[1], 0);
			}
		}
		local43 = Static241.method4285(this.anInt876).method1734(0, null, 1024, 0, arg0, null, -1, this.anInt871);
		if (local43 != null) {
			local43.method4379(local11, local23.aClass15_Sub2Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(6) Class21 local6 = arg2.method3284();
		local6.method2814(super.anInt865, super.anInt860, super.anInt863);
		@Pc(30) Class78 local30 = Static241.method4285(this.anInt876).method1734(0, null, 65536, 0, arg2, null, -1, this.anInt871);
		if (local30 != null && local30.method4381(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt873 != -1) {
			local30 = Static241.method4285(this.anInt873).method1734(0, null, 65536, 0, arg2, null, -1, this.anInt875);
			if (local30 != null && local30.method4381(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt870 != -1) {
			local30 = Static241.method4285(this.anInt870).method1734(0, null, 65536, 0, arg2, null, -1, this.anInt874);
			if (local30 != null && local30.method4381(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
