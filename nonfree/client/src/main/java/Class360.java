import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class360 {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!au;")
	private Class21 aClass21_97 = new Class21(128);

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!au;")
	public Class21 aClass21_98 = new Class21(64);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!mv;")
	public final Class229 aClass229_129;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!mv;")
	private final Class229 aClass229_130;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;)V")
	public Class360(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass229_129 = arg3;
		this.aClass229_130 = arg2;
		this.aClass229_130.method4981(36);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method7570() {
		@Pc(6) Class21 local6 = this.aClass21_97;
		synchronized (this.aClass21_97) {
			this.aClass21_97.method314();
		}
		local6 = this.aClass21_98;
		synchronized (this.aClass21_98) {
			this.aClass21_98.method314();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public void method7571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass21_97 = new Class21(arg0);
		this.aClass21_98 = new Class21(arg1);
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public void method7574() {
		@Pc(2) Class21 local2 = this.aClass21_97;
		synchronized (this.aClass21_97) {
			this.aClass21_97.method313();
		}
		local2 = this.aClass21_98;
		synchronized (this.aClass21_98) {
			this.aClass21_98.method313();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Lclient!hh;")
	public Class142 method7576(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_97;
		@Pc(16) Class142 local16;
		synchronized (this.aClass21_97) {
			local16 = (Class142) this.aClass21_97.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_130;
		@Pc(38) byte[] local38;
		synchronized (this.aClass229_130) {
			local38 = this.aClass229_130.method4980(36, arg0);
		}
		local16 = new Class142();
		local16.anInt2933 = arg0;
		local16.aClass360_2 = this;
		if (local38 != null) {
			local16.method2516(new Class2_Sub7(local38));
		}
		local16.method2517();
		@Pc(74) Class21 local74 = this.aClass21_97;
		synchronized (this.aClass21_97) {
			this.aClass21_97.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method7577() {
		@Pc(7) Class21 local7 = this.aClass21_97;
		synchronized (this.aClass21_97) {
			this.aClass21_97.method323(5);
		}
		local7 = this.aClass21_98;
		synchronized (this.aClass21_98) {
			this.aClass21_98.method323(5);
		}
	}
}
