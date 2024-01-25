import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!es", name = "s", descriptor = "I")
	public int anInt1545;

	@OriginalMember(owner = "client!es", name = "B", descriptor = "I")
	public int anInt1553;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	public int anInt1554;

	@OriginalMember(owner = "client!es", name = "G", descriptor = "I")
	public int anInt1556;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "I")
	public int anInt1543 = -1;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	public int anInt1546 = -1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class44 local6 = arg0.method2024();
		local6.method3541(super.anInt1533, super.anInt1541, super.anInt1540);
		@Pc(31) Class66 local31 = Static15.aClass81_1.method2175(this.anInt1556).method3953(this.anInt1554, 0, 65536, arg0, -1, 0, null, null);
		if (local31 != null && local31.method5131(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt1546 != -1) {
			local31 = Static15.aClass81_1.method2175(this.anInt1546).method3953(this.anInt1553, 0, 65536, arg0, -1, 0, null, null);
			if (local31 != null && local31.method5131(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt1543 != -1) {
			local31 = Static15.aClass81_1.method2175(this.anInt1543).method3953(this.anInt1545, 0, 65536, arg0, -1, 0, null, null);
			if (local31 != null && local31.method5131(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(6) Class44 local6 = arg0.method2024();
		local6.method3541(super.anInt1533, super.anInt1541, super.anInt1540);
		@Pc(18) Class10_Sub3 local18 = Static299.method4461(3);
		@Pc(39) Class66 local39;
		if (this.anInt1543 != -1) {
			local39 = Static15.aClass81_1.method2175(this.anInt1543).method3953(this.anInt1545, 0, 1024, arg0, -1, 0, null, null);
			if (local39 != null) {
				local39.method5126(local6, local18.aClass10_Sub7Array1[2], 0);
			}
		}
		if (this.anInt1546 != -1) {
			local39 = Static15.aClass81_1.method2175(this.anInt1546).method3953(this.anInt1553, 0, 1024, arg0, -1, 0, null, null);
			if (local39 != null) {
				local39.method5126(local6, local18.aClass10_Sub7Array1[1], 0);
			}
		}
		local39 = Static15.aClass81_1.method2175(this.anInt1556).method3953(this.anInt1554, 0, 1024, arg0, -1, 0, null, null);
		if (local39 != null) {
			local39.method5126(local6, local18.aClass10_Sub7Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}
}
