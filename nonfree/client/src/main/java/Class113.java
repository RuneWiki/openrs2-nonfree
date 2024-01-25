import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class113 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!wb;")
	public Class263 aClass263_3;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public int anInt3415;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt3421;

	static {
		new Class189("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lclient!we;")
	public synchronized Class264 method2749() {
		@Pc(21) Class264 local21 = (Class264) this.aClass263_3.aClass126_63.method3141((long) this.anInt3413);
		if (local21 != null) {
			return local21;
		}
		local21 = Static464.method5847(this.aClass263_3.aClass32_90, this.anInt3413, 0);
		if (local21 != null) {
			this.aClass263_3.aClass126_63.method3132((long) this.anInt3413, local21);
		}
		return local21;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method2750(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3413 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt3415 = arg0.method2582();
			this.anInt3421 = arg0.method2582();
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!cu;)V")
	public void method2755(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method2750(arg0, local3);
		}
	}
}
