import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class204 {

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Lclient!jk;")
	private final Class137 aClass137_50 = new Class137(64);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!qn;")
	private final Class211 aClass211_75;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	public final int anInt5088;

	static {
		new Class15("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class204(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_75 = arg2;
		this.anInt5088 = this.aClass211_75.method4365(19);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)Lclient!fn;")
	public Class84 method4074(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_50;
		@Pc(16) Class84 local16;
		synchronized (this.aClass137_50) {
			local16 = (Class84) this.aClass137_50.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_75;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_75) {
			local38 = this.aClass211_75.method4377(19, arg0);
		}
		local16 = new Class84();
		if (local38 != null) {
			local16.method1684(new Class4_Sub9(local38));
		}
		@Pc(60) Class137 local60 = this.aClass137_50;
		synchronized (this.aClass137_50) {
			this.aClass137_50.method2732((long) arg0, local16);
			return local16;
		}
	}
}
