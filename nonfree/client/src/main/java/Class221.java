import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class221 {

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Lclient!au;")
	private final Class21 aClass21_49 = new Class21(64);

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_77;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class221(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_77 = arg2;
		this.aClass229_77.method4981(32);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public void method4663() {
		@Pc(10) Class21 local10 = this.aClass21_49;
		synchronized (this.aClass21_49) {
			this.aClass21_49.method314();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Lclient!co;")
	public Class61 method4666(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_49;
		@Pc(16) Class61 local16;
		synchronized (this.aClass21_49) {
			local16 = (Class61) this.aClass21_49.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_77;
		@Pc(38) byte[] local38;
		synchronized (this.aClass229_77) {
			local38 = this.aClass229_77.method4980(32, arg0);
		}
		local16 = new Class61();
		if (local38 != null) {
			local16.method1196(new Class2_Sub7(local38));
		}
		@Pc(65) Class21 local65 = this.aClass21_49;
		synchronized (this.aClass21_49) {
			this.aClass21_49.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
	public void method4667() {
		@Pc(11) Class21 local11 = this.aClass21_49;
		synchronized (this.aClass21_49) {
			this.aClass21_49.method313();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public void method4668() {
		@Pc(6) Class21 local6 = this.aClass21_49;
		synchronized (this.aClass21_49) {
			this.aClass21_49.method323(5);
		}
	}
}
