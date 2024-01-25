import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class12_Sub3_Sub1 extends Class12_Sub3 {

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public int anInt1415;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	public int anInt1417;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public int anInt1420;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public int anInt1422;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public int anInt1421 = -1;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
	public int anInt1423 = -1;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(6) Class54 local6 = arg0.method4556();
		local6.method4789(super.anInt1403, super.anInt1404, super.anInt1407);
		@Pc(18) Class22_Sub8 local18 = Static128.method2279(3);
		@Pc(40) Class3 local40;
		if (this.anInt1421 != -1) {
			local40 = Static106.aClass250_1.method5735(this.anInt1421).method2647(-1, 1024, this.anInt1422, arg0, null, 0, 0, null);
			if (local40 != null) {
				local40.method3443(local6, local18.aClass22_Sub1Array1[2], 0);
			}
		}
		if (this.anInt1423 != -1) {
			local40 = Static106.aClass250_1.method5735(this.anInt1423).method2647(-1, 1024, this.anInt1420, arg0, null, 0, 0, null);
			if (local40 != null) {
				local40.method3443(local6, local18.aClass22_Sub1Array1[1], 0);
			}
		}
		local40 = Static106.aClass250_1.method5735(this.anInt1415).method2647(-1, 1024, this.anInt1417, arg0, null, 0, 0, null);
		if (local40 != null) {
			local40.method3443(local6, local18.aClass22_Sub1Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class54 local6 = arg0.method4556();
		local6.method4789(super.anInt1403, super.anInt1404, super.anInt1407);
		@Pc(36) Class3 local36 = Static106.aClass250_1.method5735(this.anInt1415).method2647(-1, 65536, this.anInt1417, arg0, null, 0, 0, null);
		if (local36 != null && local36.method3444(arg2, arg1, local6, true)) {
			return true;
		}
		if (this.anInt1423 != -1) {
			local36 = Static106.aClass250_1.method5735(this.anInt1423).method2647(-1, 65536, this.anInt1420, arg0, null, 0, 0, null);
			if (local36 != null && local36.method3444(arg2, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt1421 != -1) {
			local36 = Static106.aClass250_1.method5735(this.anInt1421).method2647(-1, 65536, this.anInt1422, arg0, null, 0, 0, null);
			if (local36 != null && local36.method3444(arg2, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
