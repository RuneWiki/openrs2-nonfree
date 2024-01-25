import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class34 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "Lclient!of;")
	private final Class188 aClass188_3 = new Class188(64);

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!mn;")
	private final Class171 aClass171_6;

	static {
		new Class231("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class34(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_6 = arg2;
		if (this.aClass171_6 != null) {
			this.aClass171_6.method3662(35);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method625() {
		@Pc(10) Class188 local10 = this.aClass188_3;
		synchronized (this.aClass188_3) {
			this.aClass188_3.method4169(5);
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	public void method627() {
		@Pc(2) Class188 local2 = this.aClass188_3;
		synchronized (this.aClass188_3) {
			this.aClass188_3.method4154();
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	public void method628() {
		@Pc(2) Class188 local2 = this.aClass188_3;
		synchronized (this.aClass188_3) {
			this.aClass188_3.method4156();
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)Lclient!hh;")
	public Class110 method629(@OriginalArg(0) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_3;
		@Pc(16) Class110 local16;
		synchronized (this.aClass188_3) {
			local16 = (Class110) this.aClass188_3.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) Class171 local33 = this.aClass171_6;
		@Pc(42) byte[] local42;
		synchronized (this.aClass171_6) {
			local42 = this.aClass171_6.method3658(35, arg0);
		}
		local16 = new Class110();
		if (local42 != null) {
			local16.method2307(new Class2_Sub17(local42));
		}
		local16.method2304();
		@Pc(67) Class188 local67 = this.aClass188_3;
		synchronized (this.aClass188_3) {
			this.aClass188_3.method4155((long) arg0, local16);
			return local16;
		}
	}
}
