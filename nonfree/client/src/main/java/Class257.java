import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class257 {

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!wg;")
	private Class313 aClass313_52 = new Class313(64);

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!wg;")
	public Class313 aClass313_53 = new Class313(64);

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!kr;")
	private final Class171 aClass171_129;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!kr;")
	public final Class171 aClass171_128;

	static {
		new Class306("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;Lclient!kr;)V")
	public Class257(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3) {
		this.aClass171_129 = arg2;
		this.aClass171_128 = arg3;
		this.aClass171_129.method4349(34);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	public void method6138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass313_52 = new Class313(arg1);
		this.aClass313_53 = new Class313(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method6139() {
		@Pc(6) Class313 local6 = this.aClass313_52;
		synchronized (this.aClass313_52) {
			this.aClass313_52.method7398();
		}
		local6 = this.aClass313_53;
		synchronized (this.aClass313_53) {
			this.aClass313_53.method7398();
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	public void method6140() {
		@Pc(11) Class313 local11 = this.aClass313_52;
		synchronized (this.aClass313_52) {
			this.aClass313_52.method7400();
		}
		local11 = this.aClass313_53;
		synchronized (this.aClass313_53) {
			this.aClass313_53.method7400();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lclient!aj;")
	public Class11 method6143(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_52;
		@Pc(16) Class11 local16;
		synchronized (this.aClass313_52) {
			local16 = (Class11) this.aClass313_52.method7406((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_129;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_129) {
			local44 = this.aClass171_129.method4339(34, arg0);
		}
		local16 = new Class11();
		local16.aClass257_1 = this;
		if (local44 != null) {
			local16.method432(new Class1_Sub6(local44));
		}
		@Pc(69) Class313 local69 = this.aClass313_52;
		synchronized (this.aClass313_52) {
			this.aClass313_52.method7399((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
	public void method6145() {
		@Pc(6) Class313 local6 = this.aClass313_52;
		synchronized (this.aClass313_52) {
			this.aClass313_52.method7403(5);
		}
		local6 = this.aClass313_53;
		synchronized (this.aClass313_53) {
			this.aClass313_53.method7403(5);
		}
	}
}
