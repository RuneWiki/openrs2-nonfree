import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class210 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!of;")
	private final Class188 aClass188_45 = new Class188(128);

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!mn;")
	private final Class171 aClass171_76;

	static {
		new Class231("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class210(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_76 = arg2;
		this.aClass171_76.method3662(1);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	public void method4900() {
		@Pc(6) Class188 local6 = this.aClass188_45;
		synchronized (this.aClass188_45) {
			this.aClass188_45.method4169(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!lk;")
	public Class161 method4903(@OriginalArg(1) int arg0) {
		@Pc(11) Class188 local11 = this.aClass188_45;
		@Pc(21) Class161 local21;
		synchronized (this.aClass188_45) {
			local21 = (Class161) this.aClass188_45.method4158((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class171 local34 = this.aClass171_76;
		@Pc(43) byte[] local43;
		synchronized (this.aClass171_76) {
			local43 = this.aClass171_76.method3658(1, arg0);
		}
		local21 = new Class161();
		if (local43 != null) {
			local21.method3223(new Class2_Sub17(local43));
		}
		@Pc(65) Class188 local65 = this.aClass188_45;
		synchronized (this.aClass188_45) {
			this.aClass188_45.method4155((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method4904() {
		@Pc(2) Class188 local2 = this.aClass188_45;
		synchronized (this.aClass188_45) {
			this.aClass188_45.method4154();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public void method4905() {
		@Pc(2) Class188 local2 = this.aClass188_45;
		synchronized (this.aClass188_45) {
			this.aClass188_45.method4156();
		}
	}
}
