import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class296 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!vg;")
	private Class342 aClass342_169 = new Class342(64);

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!vg;")
	public Class342 aClass342_170 = new Class342(64);

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!ri;")
	public final Class284 aClass284_139;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!ri;")
	private final Class284 aClass284_138;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;)V")
	public Class296(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3) {
		this.aClass284_139 = arg3;
		this.aClass284_138 = arg2;
		this.aClass284_138.method6354(34);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public void method6519() {
		@Pc(2) Class342 local2 = this.aClass342_169;
		synchronized (this.aClass342_169) {
			this.aClass342_169.method7693();
		}
		local2 = this.aClass342_170;
		synchronized (this.aClass342_170) {
			this.aClass342_170.method7693();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public void method6520() {
		@Pc(6) Class342 local6 = this.aClass342_169;
		synchronized (this.aClass342_169) {
			this.aClass342_169.method7697(5);
		}
		local6 = this.aClass342_170;
		synchronized (this.aClass342_170) {
			this.aClass342_170.method7697(5);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Lclient!bq;")
	public Class40 method6523(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_169;
		@Pc(16) Class40 local16;
		synchronized (this.aClass342_169) {
			local16 = (Class40) this.aClass342_169.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_138;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_138) {
			local38 = this.aClass284_138.method6331(34, arg0);
		}
		local16 = new Class40();
		local16.aClass296_1 = this;
		if (local38 != null) {
			local16.method1182(new Class3_Sub26(local38));
		}
		@Pc(63) Class342 local63 = this.aClass342_169;
		synchronized (this.aClass342_169) {
			this.aClass342_169.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public void method6525() {
		@Pc(14) Class342 local14 = this.aClass342_169;
		synchronized (this.aClass342_169) {
			this.aClass342_169.method7687();
		}
		local14 = this.aClass342_170;
		synchronized (this.aClass342_170) {
			this.aClass342_170.method7687();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V")
	public void method6526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass342_169 = new Class342(arg0);
		this.aClass342_170 = new Class342(arg1);
	}
}
