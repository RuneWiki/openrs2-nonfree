import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class39 {

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!au;")
	private final Class21 aClass21_11 = new Class21(16);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_10;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class39(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_10 = arg2;
		this.aClass229_10.method4981(30);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public void method800() {
		@Pc(2) Class21 local2 = this.aClass21_11;
		synchronized (this.aClass21_11) {
			this.aClass21_11.method314();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public void method801() {
		@Pc(6) Class21 local6 = this.aClass21_11;
		synchronized (this.aClass21_11) {
			this.aClass21_11.method313();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!bf;")
	public Class31 method804(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_11;
		@Pc(16) Class31 local16;
		synchronized (this.aClass21_11) {
			local16 = (Class31) this.aClass21_11.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class229 local35 = this.aClass229_10;
		@Pc(44) byte[] local44;
		synchronized (this.aClass229_10) {
			local44 = this.aClass229_10.method4980(30, arg0);
		}
		local16 = new Class31();
		if (local44 != null) {
			local16.method570(new Class2_Sub7(local44));
		}
		@Pc(68) Class21 local68 = this.aClass21_11;
		synchronized (this.aClass21_11) {
			this.aClass21_11.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public void method805() {
		@Pc(2) Class21 local2 = this.aClass21_11;
		synchronized (this.aClass21_11) {
			this.aClass21_11.method323(5);
		}
	}
}
