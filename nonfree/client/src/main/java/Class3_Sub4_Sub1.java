import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	public int anInt4311;

	@OriginalMember(owner = "client!li", name = "D", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public int anInt4304 = -1;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	public int anInt4307 = -1;

	static {
		new Class209("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class35 local6 = arg1.method4445();
		local6.j(super.anInt4301, super.anInt4296, super.anInt4300);
		@Pc(41) Class91 local41 = Static318.aClass144_6.method3265(this.anInt4312).method872(0, null, arg1, this.anInt4311, 131072, -1, null, 0);
		if (local41 != null && local41.method3288(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt4307 != -1) {
			local41 = Static318.aClass144_6.method3265(this.anInt4307).method872(0, null, arg1, this.anInt4308, 131072, -1, null, 0);
			if (local41 != null && local41.method3288(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt4304 != -1) {
			local41 = Static318.aClass144_6.method3265(this.anInt4304).method872(0, null, arg1, this.anInt4310, 131072, -1, null, 0);
			if (local41 != null && local41.method3288(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(6) Class35 local6 = arg0.method4445();
		local6.j(super.anInt4301, super.anInt4296, super.anInt4300);
		@Pc(25) Class8_Sub5 local25 = Static367.method4998(3);
		@Pc(47) Class91 local47;
		if (this.anInt4304 != -1) {
			local47 = Static318.aClass144_6.method3265(this.anInt4304).method872(0, null, arg0, this.anInt4310, 2048, -1, null, 0);
			if (local47 != null) {
				local47.method3276(local6, local25.aClass8_Sub4Array1[2], 0);
			}
		}
		if (this.anInt4307 != -1) {
			local47 = Static318.aClass144_6.method3265(this.anInt4307).method872(0, null, arg0, this.anInt4308, 2048, -1, null, 0);
			if (local47 != null) {
				local47.method3276(local6, local25.aClass8_Sub4Array1[1], 0);
			}
		}
		local47 = Static318.aClass144_6.method3265(this.anInt4312).method872(0, null, arg0, this.anInt4311, 2048, -1, null, 0);
		if (local47 != null) {
			local47.method3276(local6, local25.aClass8_Sub4Array1[0], 0);
		}
		return local25;
	}
}
