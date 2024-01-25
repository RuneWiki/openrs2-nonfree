import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class210 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!vg;")
	private final Class342 aClass342_125 = new Class342(64);

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Lclient!vg;")
	public final Class342 aClass342_126 = new Class342(2);

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!ri;")
	private final Class284 aClass284_101;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "Lclient!ri;")
	public final Class284 aClass284_102;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;)V")
	public Class210(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3) {
		this.aClass284_101 = arg2;
		this.aClass284_102 = arg3;
		this.aClass284_101.method6354(33);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method4923() {
		@Pc(6) Class342 local6 = this.aClass342_125;
		synchronized (this.aClass342_125) {
			this.aClass342_125.method7693();
		}
		local6 = this.aClass342_126;
		synchronized (this.aClass342_126) {
			this.aClass342_126.method7693();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lclient!ct;")
	public Class61 method4926(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_125;
		@Pc(26) Class61 local26;
		synchronized (this.aClass342_125) {
			local26 = (Class61) this.aClass342_125.method7684((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(39) Class284 local39 = this.aClass284_101;
		@Pc(48) byte[] local48;
		synchronized (this.aClass284_101) {
			local48 = this.aClass284_101.method6331(33, arg0);
		}
		local26 = new Class61();
		local26.aClass210_1 = this;
		if (local48 != null) {
			local26.method1829(new Class3_Sub26(local48));
		}
		@Pc(73) Class342 local73 = this.aClass342_125;
		synchronized (this.aClass342_125) {
			this.aClass342_125.method7683(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public void method4930() {
		@Pc(2) Class342 local2 = this.aClass342_125;
		synchronized (this.aClass342_125) {
			this.aClass342_125.method7687();
		}
		local2 = this.aClass342_126;
		synchronized (this.aClass342_126) {
			this.aClass342_126.method7687();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V")
	public void method4931() {
		@Pc(2) Class342 local2 = this.aClass342_125;
		synchronized (this.aClass342_125) {
			this.aClass342_125.method7697(5);
		}
		local2 = this.aClass342_126;
		synchronized (this.aClass342_126) {
			this.aClass342_126.method7697(5);
		}
	}
}
