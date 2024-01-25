import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class231 {

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	public int anInt7070;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Lclient!hp;")
	private final Class125 aClass125_44 = new Class125(64);

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "Lclient!hp;")
	public final Class125 aClass125_45 = new Class125(30);

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!kea;")
	private final Class161 aClass161_86;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Lclient!kea;")
	public final Class161 aClass161_85;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;)V")
	public Class231(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		this.aClass161_86 = arg2;
		this.aClass161_85 = arg3;
		@Pc(26) int local26 = this.aClass161_86.method4239() - 1;
		this.aClass161_86.method4266(local26);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	public void method5899() {
		@Pc(2) Class125 local2 = this.aClass125_44;
		synchronized (this.aClass125_44) {
			this.aClass125_44.method3516();
		}
		local2 = this.aClass125_45;
		synchronized (this.aClass125_45) {
			this.aClass125_45.method3516();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	public void method5900() {
		@Pc(2) Class125 local2 = this.aClass125_44;
		synchronized (this.aClass125_44) {
			this.aClass125_44.method3522(5);
		}
		local2 = this.aClass125_45;
		synchronized (this.aClass125_45) {
			this.aClass125_45.method3522(5);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
	public void method5902(@OriginalArg(1) int arg0) {
		this.anInt7070 = arg0;
		@Pc(9) Class125 local9 = this.aClass125_45;
		synchronized (this.aClass125_45) {
			this.aClass125_45.method3521();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	public void method5904() {
		@Pc(2) Class125 local2 = this.aClass125_44;
		synchronized (this.aClass125_44) {
			this.aClass125_44.method3521();
		}
		local2 = this.aClass125_45;
		synchronized (this.aClass125_45) {
			this.aClass125_45.method3521();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)Lclient!lw;")
	public Class186 method5905(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_44;
		@Pc(16) Class186 local16;
		synchronized (this.aClass125_44) {
			local16 = (Class186) this.aClass125_44.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_86;
		@Pc(42) byte[] local42;
		synchronized (this.aClass161_86) {
			local42 = this.aClass161_86.method4243(Static93.method1855(arg0), Static107.method2087(arg0));
		}
		local16 = new Class186();
		local16.anInt5834 = arg0;
		local16.aClass231_3 = this;
		if (local42 != null) {
			local16.method4864(new Class3_Sub27(local42));
		}
		@Pc(75) Class125 local75 = this.aClass125_44;
		synchronized (this.aClass125_44) {
			this.aClass125_44.method3519((long) arg0, local16);
			return local16;
		}
	}
}
