import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class242 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "Lclient!tq;")
	private final Class340 aClass340_40 = new Class340(64);

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!wm;")
	private final Class390 aClass390_81;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class242(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_81 = arg2;
		this.aClass390_81.method8913(5);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lclient!jv;")
	public Class5_Sub3_Sub10 method5736(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_40;
		@Pc(16) Class5_Sub3_Sub10 local16;
		synchronized (this.aClass340_40) {
			local16 = (Class5_Sub3_Sub10) this.aClass340_40.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_81;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_81) {
			local38 = this.aClass390_81.method8914(5, arg0);
		}
		local16 = new Class5_Sub3_Sub10();
		if (local38 != null) {
			local16.method4772(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_40;
		synchronized (this.aClass340_40) {
			this.aClass340_40.method7986((long) arg0, local16);
			return local16;
		}
	}
}
