import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class25 {

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "Lclient!tb;")
	private Class313 aClass313_5 = new Class313(128);

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "Lclient!tb;")
	public Class313 aClass313_6 = new Class313(64);

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!pl;")
	public final Class259 aClass259_17;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "Lclient!pl;")
	private final Class259 aClass259_18;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;)V")
	public Class25(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		this.aClass259_17 = arg3;
		this.aClass259_18 = arg2;
		this.aClass259_18.method5969(36);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lclient!ww;")
	public Class366 method435(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_5;
		@Pc(16) Class366 local16;
		synchronized (this.aClass313_5) {
			local16 = (Class366) this.aClass313_5.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class259 local37 = this.aClass259_18;
		@Pc(46) byte[] local46;
		synchronized (this.aClass259_18) {
			local46 = this.aClass259_18.method5985(arg0, 36);
		}
		local16 = new Class366();
		local16.anInt9645 = arg0;
		local16.aClass25_4 = this;
		if (local46 != null) {
			local16.method7998(new Class2_Sub15(local46));
		}
		local16.method7999();
		@Pc(77) Class313 local77 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
	public void method436() {
		@Pc(2) Class313 local2 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method6983();
		}
		local2 = this.aClass313_6;
		synchronized (this.aClass313_6) {
			this.aClass313_6.method6983();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)V")
	public void method439() {
		@Pc(2) Class313 local2 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method6982(5);
		}
		@Pc(30) Class313 local30 = this.aClass313_6;
		synchronized (this.aClass313_6) {
			this.aClass313_6.method6982(5);
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V")
	public void method440() {
		@Pc(2) Class313 local2 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method6977();
		}
		local2 = this.aClass313_6;
		synchronized (this.aClass313_6) {
			this.aClass313_6.method6977();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZI)V")
	public void method441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass313_5 = new Class313(arg1);
		this.aClass313_6 = new Class313(arg0);
	}
}
