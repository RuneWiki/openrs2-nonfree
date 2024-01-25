import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class212 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Lclient!au;")
	private Class21 aClass21_46 = new Class21(64);

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!au;")
	public Class21 aClass21_47 = new Class21(64);

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_73;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!mv;")
	public final Class229 aClass229_72;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;)V")
	public Class212(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass229_73 = arg2;
		this.aClass229_72 = arg3;
		this.aClass229_73.method4981(34);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)V")
	public void method4406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass21_46 = new Class21(arg0);
		this.aClass21_47 = new Class21(arg1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lclient!od;")
	public Class252 method4407(@OriginalArg(0) int arg0) {
		@Pc(11) Class21 local11 = this.aClass21_46;
		@Pc(21) Class252 local21;
		synchronized (this.aClass21_46) {
			local21 = (Class252) this.aClass21_46.method324((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class229 local34 = this.aClass229_73;
		@Pc(43) byte[] local43;
		synchronized (this.aClass229_73) {
			local43 = this.aClass229_73.method4980(34, arg0);
		}
		local21 = new Class252();
		local21.aClass212_3 = this;
		if (local43 != null) {
			local21.method5257(new Class2_Sub7(local43));
		}
		@Pc(68) Class21 local68 = this.aClass21_46;
		synchronized (this.aClass21_46) {
			this.aClass21_46.method317(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public void method4409() {
		@Pc(6) Class21 local6 = this.aClass21_46;
		synchronized (this.aClass21_46) {
			this.aClass21_46.method313();
		}
		local6 = this.aClass21_47;
		synchronized (this.aClass21_47) {
			this.aClass21_47.method313();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public void method4411() {
		@Pc(2) Class21 local2 = this.aClass21_46;
		synchronized (this.aClass21_46) {
			this.aClass21_46.method314();
		}
		local2 = this.aClass21_47;
		synchronized (this.aClass21_47) {
			this.aClass21_47.method314();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)V")
	public void method4412() {
		@Pc(6) Class21 local6 = this.aClass21_46;
		synchronized (this.aClass21_46) {
			this.aClass21_46.method323(5);
		}
		local6 = this.aClass21_47;
		synchronized (this.aClass21_47) {
			this.aClass21_47.method323(5);
		}
	}
}
