import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 {

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	public int anInt1049 = -1;

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public int anInt1053 = -1;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(6) Class8 local6 = arg0.method5417();
		local6.GA(super.anInt1043, super.anInt1044 - 10, super.anInt1039);
		@Pc(20) Class5_Sub5 local20 = Static342.method5386(3);
		@Pc(41) Class23 local41;
		if (this.anInt1049 != -1) {
			local41 = Static98.aClass203_1.method4899(this.anInt1049).method3855(0, this.anInt1054, 2048, null, arg0, null, -1, 0);
			if (local41 != null) {
				local41.method7077(local6, local20.aClass5_Sub4Array1[2], 0);
			}
		}
		if (this.anInt1053 != -1) {
			local41 = Static98.aClass203_1.method4899(this.anInt1053).method3855(0, this.anInt1050, 2048, null, arg0, null, -1, 0);
			if (local41 != null) {
				local41.method7077(local6, local20.aClass5_Sub4Array1[1], 0);
			}
		}
		local41 = Static98.aClass203_1.method4899(this.anInt1046).method3855(0, this.anInt1048, 2048, null, arg0, null, -1, 0);
		if (local41 != null) {
			local41.method7077(local6, local20.aClass5_Sub4Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class8 local6 = arg1.method5417();
		local6.GA(super.anInt1043, super.anInt1044, super.anInt1039);
		@Pc(31) Class23 local31 = Static98.aClass203_1.method4899(this.anInt1046).method3855(0, this.anInt1048, 131072, null, arg1, null, -1, 0);
		if (local31 != null && local31.method7073(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1053 != -1) {
			local31 = Static98.aClass203_1.method4899(this.anInt1053).method3855(0, this.anInt1050, 131072, null, arg1, null, -1, 0);
			if (local31 != null && local31.method7073(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1049 != -1) {
			local31 = Static98.aClass203_1.method4899(this.anInt1049).method3855(0, this.anInt1054, 131072, null, arg1, null, -1, 0);
			if (local31 != null && local31.method7073(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
