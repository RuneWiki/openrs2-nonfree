import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class339 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!bh;")
	private final Class32 aClass32_78 = new Class32(256);

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_124;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class339(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_124 = arg2;
		this.aClass380_124.method8631(26);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	public void method7579() {
		@Pc(12) Class32 local12 = this.aClass32_78;
		synchronized (this.aClass32_78) {
			this.aClass32_78.method634(5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lclient!o;")
	public Class2_Sub2_Sub18 method7580(@OriginalArg(1) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_78;
		@Pc(16) Class2_Sub2_Sub18 local16;
		synchronized (this.aClass32_78) {
			local16 = (Class2_Sub2_Sub18) this.aClass32_78.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_124;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_124) {
			local38 = this.aClass380_124.method8620(26, arg0);
		}
		local16 = new Class2_Sub2_Sub18();
		if (local38 != null) {
			local16.method5245(new Class2_Sub22(local38));
		}
		@Pc(60) Class32 local60 = this.aClass32_78;
		synchronized (this.aClass32_78) {
			this.aClass32_78.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method7581() {
		@Pc(6) Class32 local6 = this.aClass32_78;
		synchronized (this.aClass32_78) {
			this.aClass32_78.method632();
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public void method7582() {
		@Pc(10) Class32 local10 = this.aClass32_78;
		synchronized (this.aClass32_78) {
			this.aClass32_78.method640();
		}
	}
}
