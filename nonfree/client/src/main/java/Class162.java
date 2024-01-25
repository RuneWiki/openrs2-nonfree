import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class162 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!of;")
	private final Class188 aClass188_37 = new Class188(128);

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Lclient!mn;")
	private final Class171 aClass171_55;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class162(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_55 = arg2;
		if (this.aClass171_55 != null) {
			@Pc(20) int local20 = this.aClass171_55.method3677() - 1;
			this.aClass171_55.method3662(local20);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!rv;")
	public Class221 method3228(@OriginalArg(0) int arg0) {
		@Pc(11) Class188 local11 = this.aClass188_37;
		@Pc(21) Class221 local21;
		synchronized (this.aClass188_37) {
			local21 = (Class221) this.aClass188_37.method4158((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass171_55.method3658(Static449.method6079(arg0), Static137.method2152(arg0));
		local21 = new Class221();
		if (local42 != null) {
			local21.method5112(new Class2_Sub17(local42));
		}
		@Pc(58) Class188 local58 = this.aClass188_37;
		synchronized (this.aClass188_37) {
			this.aClass188_37.method4155((long) arg0, local21);
			return local21;
		}
	}
}
