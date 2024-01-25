import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class245 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!of;")
	private final Class188 aClass188_55 = new Class188(64);

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!mn;")
	private final Class171 aClass171_93;

	static {
		new Class231("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class245(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_93 = arg2;
		this.aClass171_93.method3662(5);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lclient!lu;")
	public Class2_Sub1_Sub10 method5648(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_55;
		@Pc(16) Class2_Sub1_Sub10 local16;
		synchronized (this.aClass188_55) {
			local16 = (Class2_Sub1_Sub10) this.aClass188_55.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_93;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_93) {
			local38 = this.aClass171_93.method3658(5, arg0);
		}
		local16 = new Class2_Sub1_Sub10();
		if (local38 != null) {
			local16.method3410(new Class2_Sub17(local38));
		}
		@Pc(65) Class188 local65 = this.aClass188_55;
		synchronized (this.aClass188_55) {
			this.aClass188_55.method4155((long) arg0, local16);
			return local16;
		}
	}
}
