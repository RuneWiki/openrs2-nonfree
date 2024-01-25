import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class81 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!er;")
	private final Class69 aClass69_29 = new Class69(64);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_90;

	static {
		new Class242("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class81(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_90 = arg2;
		this.aClass166_90.method3691(31);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public void method1845() {
		@Pc(6) Class69 local6 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1594(5);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public void method1848() {
		@Pc(2) Class69 local2 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1593();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public void method1849() {
		@Pc(2) Class69 local2 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1600();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)Lclient!oh;")
	public Class172 method1850(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_29;
		@Pc(16) Class172 local16;
		synchronized (this.aClass69_29) {
			local16 = (Class172) this.aClass69_29.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass166_90.method3696(arg0, 31);
		local16 = new Class172();
		if (local38 != null) {
			local16.method3976(new Class4_Sub30(local38));
		}
		@Pc(54) Class69 local54 = this.aClass69_29;
		synchronized (this.aClass69_29) {
			this.aClass69_29.method1590((long) arg0, local16);
			return local16;
		}
	}
}
