import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class145 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!au;")
	private Class21 aClass21_33 = new Class21(64);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_47;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class145(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_47 = arg2;
		if (this.aClass229_47 != null) {
			@Pc(20) int local20 = this.aClass229_47.method4952() - 1;
			this.aClass229_47.method4981(local20);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method2542() {
		@Pc(6) Class21 local6 = this.aClass21_33;
		synchronized (this.aClass21_33) {
			this.aClass21_33.method314();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public void method2544(@OriginalArg(1) int arg0) {
		@Pc(2) Class21 local2 = this.aClass21_33;
		synchronized (this.aClass21_33) {
			this.aClass21_33.method313();
			this.aClass21_33 = new Class21(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
	public void method2546() {
		@Pc(2) Class21 local2 = this.aClass21_33;
		synchronized (this.aClass21_33) {
			this.aClass21_33.method323(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)Lclient!ju;")
	public Class184 method2547(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_33;
		@Pc(16) Class184 local16;
		synchronized (this.aClass21_33) {
			local16 = (Class184) this.aClass21_33.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_47;
		@Pc(42) byte[] local42;
		synchronized (this.aClass229_47) {
			local42 = this.aClass229_47.method4980(Static265.method3689(arg0), Static82.method1252(arg0));
		}
		local16 = new Class184();
		if (local42 != null) {
			local16.method3669(new Class2_Sub7(local42));
		}
		@Pc(71) Class21 local71 = this.aClass21_33;
		synchronized (this.aClass21_33) {
			this.aClass21_33.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method2548() {
		@Pc(6) Class21 local6 = this.aClass21_33;
		synchronized (this.aClass21_33) {
			this.aClass21_33.method313();
		}
	}
}
