import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class234 {

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public int anInt6841;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!jp;")
	private final Class129 aClass129_62 = new Class129(64);

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "Lclient!jp;")
	public final Class129 aClass129_63 = new Class129(50);

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!jp;")
	public final Class129 aClass129_64 = new Class129(5);

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Z")
	public boolean aBoolean581;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!pc;")
	public final Class188 aClass188_110;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "Lclient!pc;")
	private final Class188 aClass188_111;

	static {
		new Class256("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!rb;IZLclient!pc;Lclient!pc;)V")
	public Class234(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class188 arg3, @OriginalArg(4) Class188 arg4) {
		this.aBoolean581 = arg2;
		this.aClass188_110 = arg4;
		this.aClass188_111 = arg3;
		if (this.aClass188_111 != null) {
			@Pc(38) int local38 = this.aClass188_111.method4299() - 1;
			this.aClass188_111.method4285(local38);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method5354() {
		@Pc(2) Class129 local2 = this.aClass129_63;
		synchronized (this.aClass129_63) {
			this.aClass129_63.method3025();
		}
		local2 = this.aClass129_64;
		synchronized (this.aClass129_64) {
			this.aClass129_64.method3025();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	public void method5355(@OriginalArg(0) int arg0) {
		this.anInt6841 = arg0;
		@Pc(13) Class129 local13 = this.aClass129_63;
		synchronized (this.aClass129_63) {
			this.aClass129_63.method3025();
		}
		local13 = this.aClass129_64;
		synchronized (this.aClass129_64) {
			this.aClass129_64.method3025();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)V")
	public void method5356(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean581) {
			this.aBoolean581 = arg0;
			this.method5361();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method5357() {
		@Pc(2) Class129 local2 = this.aClass129_62;
		synchronized (this.aClass129_62) {
			this.aClass129_62.method3026();
		}
		local2 = this.aClass129_63;
		synchronized (this.aClass129_63) {
			this.aClass129_63.method3026();
		}
		local2 = this.aClass129_64;
		synchronized (this.aClass129_64) {
			this.aClass129_64.method3026();
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
	public void method5358() {
		@Pc(10) Class129 local10 = this.aClass129_62;
		synchronized (this.aClass129_62) {
			this.aClass129_62.method3028(5);
		}
		local10 = this.aClass129_63;
		synchronized (this.aClass129_63) {
			this.aClass129_63.method3028(5);
		}
		local10 = this.aClass129_64;
		synchronized (this.aClass129_64) {
			this.aClass129_64.method3028(5);
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
	public void method5361() {
		@Pc(6) Class129 local6 = this.aClass129_62;
		synchronized (this.aClass129_62) {
			this.aClass129_62.method3025();
		}
		local6 = this.aClass129_63;
		synchronized (this.aClass129_63) {
			this.aClass129_63.method3025();
		}
		local6 = this.aClass129_64;
		synchronized (this.aClass129_64) {
			this.aClass129_64.method3025();
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)Lclient!rl;")
	public Class215 method5362(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_62;
		@Pc(16) Class215 local16;
		synchronized (this.aClass129_62) {
			local16 = (Class215) this.aClass129_62.method3023((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass188_111.method4283(Static411.method5574(arg0), Static408.method5526(arg0));
		local16 = new Class215();
		local16.anInt6011 = arg0;
		local16.aClass234_1 = this;
		if (local37 != null) {
			local16.method4796(new Class2_Sub20(local37));
		}
		local16.method4803();
		@Pc(68) Class129 local68 = this.aClass129_62;
		synchronized (this.aClass129_62) {
			this.aClass129_62.method3029(local16, (long) arg0);
			return local16;
		}
	}
}
