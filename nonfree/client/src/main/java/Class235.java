import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class235 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!of;")
	private final Class188 aClass188_53 = new Class188(64);

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!mn;")
	private final Class171 aClass171_91;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class235(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_91 = arg2;
		if (this.aClass171_91 != null) {
			this.aClass171_91.method3662(11);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
	public void method5379() {
		@Pc(2) Class188 local2 = this.aClass188_53;
		synchronized (this.aClass188_53) {
			this.aClass188_53.method4169(5);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public void method5380() {
		@Pc(6) Class188 local6 = this.aClass188_53;
		synchronized (this.aClass188_53) {
			this.aClass188_53.method4154();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lclient!pk;")
	public Class198 method5382(@OriginalArg(1) int arg0) {
		@Pc(11) Class188 local11 = this.aClass188_53;
		@Pc(21) Class198 local21;
		synchronized (this.aClass188_53) {
			local21 = (Class198) this.aClass188_53.method4158((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class171 local34 = this.aClass171_91;
		@Pc(43) byte[] local43;
		synchronized (this.aClass171_91) {
			local43 = this.aClass171_91.method3658(11, arg0);
		}
		local21 = new Class198();
		if (local43 != null) {
			local21.method4494(new Class2_Sub17(local43));
		}
		@Pc(65) Class188 local65 = this.aClass188_53;
		synchronized (this.aClass188_53) {
			this.aClass188_53.method4155((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method5384() {
		@Pc(2) Class188 local2 = this.aClass188_53;
		synchronized (this.aClass188_53) {
			this.aClass188_53.method4156();
		}
	}
}
