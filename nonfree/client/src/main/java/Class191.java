import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class191 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!au;")
	private final Class21 aClass21_42 = new Class21(64);

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!mv;")
	private final Class229 aClass229_66;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class191(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_66 = arg2;
		if (this.aClass229_66 != null) {
			this.aClass229_66.method4981(11);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method3970() {
		@Pc(6) Class21 local6 = this.aClass21_42;
		synchronized (this.aClass21_42) {
			this.aClass21_42.method314();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Lclient!cj;")
	public Class57 method3971(@OriginalArg(1) int arg0) {
		@Pc(11) Class21 local11 = this.aClass21_42;
		@Pc(21) Class57 local21;
		synchronized (this.aClass21_42) {
			local21 = (Class57) this.aClass21_42.method324((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class229 local34 = this.aClass229_66;
		@Pc(43) byte[] local43;
		synchronized (this.aClass229_66) {
			local43 = this.aClass229_66.method4980(11, arg0);
		}
		local21 = new Class57();
		if (local43 != null) {
			local21.method1106(new Class2_Sub7(local43));
		}
		@Pc(65) Class21 local65 = this.aClass21_42;
		synchronized (this.aClass21_42) {
			this.aClass21_42.method317(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public void method3973() {
		@Pc(2) Class21 local2 = this.aClass21_42;
		synchronized (this.aClass21_42) {
			this.aClass21_42.method323(5);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public void method3975() {
		@Pc(2) Class21 local2 = this.aClass21_42;
		synchronized (this.aClass21_42) {
			this.aClass21_42.method313();
		}
	}
}
