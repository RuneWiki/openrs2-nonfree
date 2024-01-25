import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class176 {

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!au;")
	private final Class21 aClass21_40 = new Class21(64);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!mv;")
	private final Class229 aClass229_59;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class176(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_59 = arg2;
		if (this.aClass229_59 != null) {
			this.aClass229_59.method4981(35);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method3608() {
		@Pc(2) Class21 local2 = this.aClass21_40;
		synchronized (this.aClass21_40) {
			this.aClass21_40.method314();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lclient!ck;")
	public Class58 method3609(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_40;
		@Pc(16) Class58 local16;
		synchronized (this.aClass21_40) {
			local16 = (Class58) this.aClass21_40.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_59;
		@Pc(38) byte[] local38;
		synchronized (this.aClass229_59) {
			local38 = this.aClass229_59.method4980(35, arg0);
		}
		local16 = new Class58();
		if (local38 != null) {
			local16.method1112(new Class2_Sub7(local38));
		}
		local16.method1111();
		@Pc(63) Class21 local63 = this.aClass21_40;
		synchronized (this.aClass21_40) {
			this.aClass21_40.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
	public void method3611() {
		@Pc(6) Class21 local6 = this.aClass21_40;
		synchronized (this.aClass21_40) {
			this.aClass21_40.method323(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public void method3613() {
		@Pc(14) Class21 local14 = this.aClass21_40;
		synchronized (this.aClass21_40) {
			this.aClass21_40.method313();
		}
	}
}
