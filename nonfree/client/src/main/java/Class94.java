import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class94 {

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!wg;")
	private final Class313 aClass313_13 = new Class313(64);

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!kr;")
	private final Class171 aClass171_48;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class94(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_48 = arg2;
		this.aClass171_48.method4349(5);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)Lclient!ia;")
	public Class1_Sub1_Sub7 method2260(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_13;
		@Pc(18) Class1_Sub1_Sub7 local18;
		synchronized (this.aClass313_13) {
			local18 = (Class1_Sub1_Sub7) this.aClass313_13.method7406((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class171 local31 = this.aClass171_48;
		@Pc(40) byte[] local40;
		synchronized (this.aClass171_48) {
			local40 = this.aClass171_48.method4339(5, arg0);
		}
		local18 = new Class1_Sub1_Sub7();
		if (local40 != null) {
			local18.method3427(new Class1_Sub6(local40));
		}
		@Pc(67) Class313 local67 = this.aClass313_13;
		synchronized (this.aClass313_13) {
			this.aClass313_13.method7399((long) arg0, local18);
			return local18;
		}
	}
}
