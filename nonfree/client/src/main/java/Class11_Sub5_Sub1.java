import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 {

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	public int anInt5787;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
	public int anInt5788;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	public int anInt5791;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
	public int anInt5796;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
	public int anInt5786 = -1;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
	public int anInt5789 = -1;

	static {
		new Class142("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class34 local11 = arg1.method5685();
		local11.U(super.anInt5778, super.anInt5777, super.anInt5783);
		@Pc(38) Class8 local38 = Static285.aClass226_2.method4788(this.anInt5796).method2991(-1, this.anInt5791, null, 0, arg1, null, 0, 131072);
		if (local38 != null && local38.method5985(arg0, arg2, local11, true)) {
			return true;
		}
		if (this.anInt5786 != -1) {
			local38 = Static285.aClass226_2.method4788(this.anInt5786).method2991(-1, this.anInt5788, null, 0, arg1, null, 0, 131072);
			if (local38 != null && local38.method5985(arg0, arg2, local11, true)) {
				return true;
			}
		}
		if (this.anInt5789 != -1) {
			local38 = Static285.aClass226_2.method4788(this.anInt5789).method2991(-1, this.anInt5787, null, 0, arg1, null, 0, 131072);
			if (local38 != null && local38.method5985(arg0, arg2, local11, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(6) Class34 local6 = arg0.method5685();
		local6.U(super.anInt5778, super.anInt5777, super.anInt5783);
		@Pc(18) Class111_Sub3 local18 = Static238.method3398(3);
		@Pc(40) Class8 local40;
		if (this.anInt5789 != -1) {
			local40 = Static285.aClass226_2.method4788(this.anInt5789).method2991(-1, this.anInt5787, null, 0, arg0, null, 0, 2048);
			if (local40 != null) {
				local40.method5987(local6, local18.aClass111_Sub8Array1[2], 0);
			}
		}
		if (this.anInt5786 != -1) {
			local40 = Static285.aClass226_2.method4788(this.anInt5786).method2991(-1, this.anInt5788, null, 0, arg0, null, 0, 2048);
			if (local40 != null) {
				local40.method5987(local6, local18.aClass111_Sub8Array1[1], 0);
			}
		}
		local40 = Static285.aClass226_2.method4788(this.anInt5796).method2991(-1, this.anInt5791, null, 0, arg0, null, 0, 2048);
		if (local40 != null) {
			local40.method5987(local6, local18.aClass111_Sub8Array1[0], 0);
		}
		return local18;
	}
}
