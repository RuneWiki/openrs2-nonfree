import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class49_Sub4_Sub1 extends Class49_Sub4 {

	@OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
	public int anInt5777;

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
	public int anInt5780;

	@OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
	public int anInt5783;

	@OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
	public int anInt5784;

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
	public int anInt5775 = -1;

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
	public int anInt5786 = -1;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(11) Class118 local11 = arg2.method7256();
		local11.oa(super.anInt5769, super.anInt5768, super.anInt5772);
		@Pc(36) Class145 local36 = Static342.aClass250_2.method5980(this.anInt5780).method3443(null, 131072, null, -1, 0, 0, arg2, this.anInt5777);
		if (local36 != null && local36.method6683(arg0, arg1, local11, true)) {
			return true;
		}
		if (this.anInt5786 != -1) {
			local36 = Static342.aClass250_2.method5980(this.anInt5786).method3443(null, 131072, null, -1, 0, 0, arg2, this.anInt5783);
			if (local36 != null && local36.method6683(arg0, arg1, local11, true)) {
				return true;
			}
		}
		if (this.anInt5775 != -1) {
			local36 = Static342.aClass250_2.method5980(this.anInt5775).method3443(null, 131072, null, -1, 0, 0, arg2, this.anInt5784);
			if (local36 != null && local36.method6683(arg0, arg1, local11, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(6) Class118 local6 = arg0.method7256();
		local6.oa(super.anInt5769, super.anInt5768 - 10, super.anInt5772);
		@Pc(20) Class72_Sub7 local20 = Static186.method2914(3);
		@Pc(41) Class145 local41;
		if (this.anInt5775 != -1) {
			local41 = Static342.aClass250_2.method5980(this.anInt5775).method3443(null, 2048, null, -1, 0, 0, arg0, this.anInt5784);
			if (local41 != null) {
				local41.method6686(local6, local20.aClass72_Sub2Array1[2], 0);
			}
		}
		if (this.anInt5786 != -1) {
			local41 = Static342.aClass250_2.method5980(this.anInt5786).method3443(null, 2048, null, -1, 0, 0, arg0, this.anInt5783);
			if (local41 != null) {
				local41.method6686(local6, local20.aClass72_Sub2Array1[1], 0);
			}
		}
		local41 = Static342.aClass250_2.method5980(this.anInt5780).method3443(null, 2048, null, -1, 0, 0, arg0, this.anInt5777);
		if (local41 != null) {
			local41.method6686(local6, local20.aClass72_Sub2Array1[0], 0);
		}
		return local20;
	}
}
