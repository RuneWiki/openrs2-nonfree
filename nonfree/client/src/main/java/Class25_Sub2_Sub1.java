import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public int anInt858 = -1;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
	public int anInt864 = -1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class127 local6 = arg0.method5378();
		local6.method5265(super.anInt850, super.anInt848, super.anInt854);
		@Pc(39) Class22 local39 = Static263.aClass102_2.method2172(this.anInt863).method1654(0, this.anInt856, arg0, -1, 0, 65536, null, null);
		if (local39 != null && local39.method1584(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt858 != -1) {
			local39 = Static263.aClass102_2.method2172(this.anInt858).method1654(0, this.anInt869, arg0, -1, 0, 65536, null, null);
			if (local39 != null && local39.method1584(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt864 != -1) {
			local39 = Static263.aClass102_2.method2172(this.anInt864).method1654(0, this.anInt865, arg0, -1, 0, 65536, null, null);
			if (local39 != null && local39.method1584(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(6) Class127 local6 = arg0.method5378();
		local6.method5265(super.anInt850, super.anInt848, super.anInt854);
		@Pc(23) Class41_Sub1 local23 = Static277.method4255(3);
		@Pc(46) Class22 local46;
		if (this.anInt864 != -1) {
			local46 = Static263.aClass102_2.method2172(this.anInt864).method1654(0, this.anInt865, arg0, -1, 0, 1024, null, null);
			if (local46 != null) {
				local46.method1565(local6, local23.aClass41_Sub5Array1[2], 0);
			}
		}
		if (this.anInt858 != -1) {
			local46 = Static263.aClass102_2.method2172(this.anInt858).method1654(0, this.anInt869, arg0, -1, 0, 1024, null, null);
			if (local46 != null) {
				local46.method1565(local6, local23.aClass41_Sub5Array1[1], 0);
			}
		}
		local46 = Static263.aClass102_2.method2172(this.anInt863).method1654(0, this.anInt856, arg0, -1, 0, 1024, null, null);
		if (local46 != null) {
			local46.method1565(local6, local23.aClass41_Sub5Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}
}
