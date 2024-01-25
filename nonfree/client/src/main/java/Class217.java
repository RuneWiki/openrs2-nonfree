import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class217 {

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!kh;")
	private Class134 aClass134_47 = new Class134(64);

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Lclient!kh;")
	public Class134 aClass134_48 = new Class134(64);

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!ul;")
	public final Class246 aClass246_191;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_190;

	static {
		new Class7("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;)V")
	public Class217(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_191 = arg3;
		this.aClass246_190 = arg2;
		this.aClass246_190.method5492(34);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V")
	public void method4895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass134_47 = new Class134(arg1);
		this.aClass134_48 = new Class134(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	public void method4898() {
		@Pc(2) Class134 local2 = this.aClass134_47;
		synchronized (this.aClass134_47) {
			this.aClass134_47.method3270(5);
		}
		local2 = this.aClass134_48;
		synchronized (this.aClass134_48) {
			this.aClass134_48.method3270(5);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public void method4900() {
		@Pc(2) Class134 local2 = this.aClass134_47;
		synchronized (this.aClass134_47) {
			this.aClass134_47.method3272();
		}
		local2 = this.aClass134_48;
		synchronized (this.aClass134_48) {
			this.aClass134_48.method3272();
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)Lclient!e;")
	public Class58 method4901(@OriginalArg(1) int arg0) {
		@Pc(11) Class134 local11 = this.aClass134_47;
		@Pc(21) Class58 local21;
		synchronized (this.aClass134_47) {
			local21 = (Class58) this.aClass134_47.method3266((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class246 local34 = this.aClass246_190;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_190) {
			local43 = this.aClass246_190.method5477(34, arg0);
		}
		local21 = new Class58();
		local21.aClass217_7 = this;
		if (local43 != null) {
			local21.method1605(new Class1_Sub5(local43));
		}
		@Pc(68) Class134 local68 = this.aClass134_47;
		synchronized (this.aClass134_47) {
			this.aClass134_47.method3263((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public void method4902() {
		@Pc(6) Class134 local6 = this.aClass134_47;
		synchronized (this.aClass134_47) {
			this.aClass134_47.method3267();
		}
		local6 = this.aClass134_48;
		synchronized (this.aClass134_48) {
			this.aClass134_48.method3267();
		}
	}
}
