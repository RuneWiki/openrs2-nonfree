import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class233 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!ui;")
	private final Class359 aClass359_46 = new Class359(64);

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!lga;")
	private final Class223 aClass223_77;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class233(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_77 = arg2;
		this.aClass223_77.method5264(5);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lclient!pm;")
	public Class6_Sub2_Sub16 method5597(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_46;
		@Pc(18) Class6_Sub2_Sub16 local18;
		synchronized (this.aClass359_46) {
			local18 = (Class6_Sub2_Sub16) this.aClass359_46.method8517((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class223 local32 = this.aClass223_77;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_77) {
			local46 = this.aClass223_77.method5267(arg0, 5);
		}
		local18 = new Class6_Sub2_Sub16();
		if (local46 != null) {
			local18.method7049(new Class6_Sub15(local46));
		}
		@Pc(70) Class359 local70 = this.aClass359_46;
		synchronized (this.aClass359_46) {
			this.aClass359_46.method8515((long) arg0, local18);
			return local18;
		}
	}
}
