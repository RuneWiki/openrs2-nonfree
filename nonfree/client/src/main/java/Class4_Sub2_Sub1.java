import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public int anInt1900;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	public int anInt1904;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public int anInt1903 = -1;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	public int anInt1905 = -1;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(6) Class66 local6 = arg0.method5195();
		local6.method5822(super.anInt1894, super.anInt1897, super.anInt1892);
		@Pc(18) Class32_Sub4 local18 = Static232.method4183(3);
		@Pc(38) Class112 local38;
		if (this.anInt1903 != -1) {
			local38 = Static322.method544(this.anInt1903).method3445(1024, this.anInt1902, 0, null, arg0, null, 0, -1);
			if (local38 != null) {
				local38.method4338(local6, local18.aClass32_Sub8Array1[2], 0);
			}
		}
		if (this.anInt1905 != -1) {
			local38 = Static322.method544(this.anInt1905).method3445(1024, this.anInt1906, 0, null, arg0, null, 0, -1);
			if (local38 != null) {
				local38.method4338(local6, local18.aClass32_Sub8Array1[1], 0);
			}
		}
		local38 = Static322.method544(this.anInt1900).method3445(1024, this.anInt1904, 0, null, arg0, null, 0, -1);
		if (local38 != null) {
			local38.method4338(local6, local18.aClass32_Sub8Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class66 local6 = arg1.method5195();
		local6.method5822(super.anInt1894, super.anInt1897, super.anInt1892);
		@Pc(36) Class112 local36 = Static322.method544(this.anInt1900).method3445(65536, this.anInt1904, 0, null, arg1, null, 0, -1);
		if (local36 != null && local36.method4340(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1905 != -1) {
			local36 = Static322.method544(this.anInt1905).method3445(65536, this.anInt1906, 0, null, arg1, null, 0, -1);
			if (local36 != null && local36.method4340(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1903 != -1) {
			local36 = Static322.method544(this.anInt1903).method3445(65536, this.anInt1902, 0, null, arg1, null, 0, -1);
			if (local36 != null && local36.method4340(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
