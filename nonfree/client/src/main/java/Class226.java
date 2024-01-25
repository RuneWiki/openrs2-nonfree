import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class226 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!wm;")
	private final Class267 aClass267_67 = new Class267(64);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!ph;")
	private final Class187 aClass187_113;

	static {
		new Class182("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class226(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_113 = arg2;
		this.aClass187_113.method4306(5);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!ja;")
	public Class10_Sub1_Sub8 method4989(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_67;
		@Pc(16) Class10_Sub1_Sub8 local16;
		synchronized (this.aClass267_67) {
			local16 = (Class10_Sub1_Sub8) this.aClass267_67.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_113;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_113) {
			local38 = this.aClass187_113.method4300(5, arg0);
		}
		local16 = new Class10_Sub1_Sub8();
		if (local38 != null) {
			local16.method3000(new Class10_Sub8(local38));
		}
		@Pc(60) Class267 local60 = this.aClass267_67;
		synchronized (this.aClass267_67) {
			this.aClass267_67.method6008(local16, (long) arg0);
			return local16;
		}
	}
}
