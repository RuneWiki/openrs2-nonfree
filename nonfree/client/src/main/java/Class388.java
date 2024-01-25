import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class388 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "Lclient!ui;")
	private final Class359 aClass359_68 = new Class359(64);

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!lga;")
	private final Class223 aClass223_119;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
	public final int anInt10254;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class388(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_119 = arg2;
		this.anInt10254 = this.aClass223_119.method5264(19);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZI)Lclient!wq;")
	public Class398 method8843(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_68;
		@Pc(25) Class398 local25;
		synchronized (this.aClass359_68) {
			local25 = (Class398) this.aClass359_68.method8517((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class223 local39 = this.aClass223_119;
		@Pc(48) byte[] local48;
		synchronized (this.aClass223_119) {
			local48 = this.aClass223_119.method5267(arg0, 19);
		}
		local25 = new Class398();
		if (local48 != null) {
			local25.method8974(new Class6_Sub15(local48));
		}
		local6 = this.aClass359_68;
		synchronized (this.aClass359_68) {
			this.aClass359_68.method8515((long) arg0, local25);
			return local25;
		}
	}
}
