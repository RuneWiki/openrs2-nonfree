import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class304 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!au;")
	private final Class21 aClass21_74 = new Class21(64);

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!mv;")
	private final Class229 aClass229_113;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class304(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_113 = arg2;
		this.aClass229_113.method4981(31);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lclient!cn;")
	public Class60 method6145(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_74;
		@Pc(16) Class60 local16;
		synchronized (this.aClass21_74) {
			local16 = (Class60) this.aClass21_74.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class229 local35 = this.aClass229_113;
		@Pc(44) byte[] local44;
		synchronized (this.aClass229_113) {
			local44 = this.aClass229_113.method4980(31, arg0);
		}
		local16 = new Class60();
		if (local44 != null) {
			local16.method1193(new Class2_Sub7(local44));
		}
		@Pc(66) Class21 local66 = this.aClass21_74;
		synchronized (this.aClass21_74) {
			this.aClass21_74.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)V")
	public void method6146() {
		@Pc(2) Class21 local2 = this.aClass21_74;
		synchronized (this.aClass21_74) {
			this.aClass21_74.method323(5);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	public void method6147() {
		@Pc(7) Class21 local7 = this.aClass21_74;
		synchronized (this.aClass21_74) {
			this.aClass21_74.method313();
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
	public void method6148() {
		@Pc(10) Class21 local10 = this.aClass21_74;
		synchronized (this.aClass21_74) {
			this.aClass21_74.method314();
		}
	}
}
