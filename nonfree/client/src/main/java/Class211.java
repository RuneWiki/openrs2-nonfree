import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class211 {

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "Lclient!au;")
	private final Class21 aClass21_45 = new Class21(128);

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "Lclient!mv;")
	private final Class229 aClass229_71;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class211(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_71 = arg2;
		this.aClass229_71.method4981(1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
	public void method4400() {
		@Pc(2) Class21 local2 = this.aClass21_45;
		synchronized (this.aClass21_45) {
			this.aClass21_45.method323(5);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public void method4401() {
		@Pc(2) Class21 local2 = this.aClass21_45;
		synchronized (this.aClass21_45) {
			this.aClass21_45.method313();
		}
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)Lclient!pt;")
	public Class274 method4404(@OriginalArg(1) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_45;
		@Pc(16) Class274 local16;
		synchronized (this.aClass21_45) {
			local16 = (Class274) this.aClass21_45.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass229_71) {
			local38 = this.aClass229_71.method4980(1, arg0);
		}
		local16 = new Class274();
		if (local38 != null) {
			local16.method5650(new Class2_Sub7(local38));
		}
		@Pc(68) Class21 local68 = this.aClass21_45;
		synchronized (this.aClass21_45) {
			this.aClass21_45.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
	public void method4405() {
		@Pc(6) Class21 local6 = this.aClass21_45;
		synchronized (this.aClass21_45) {
			this.aClass21_45.method314();
		}
	}
}
