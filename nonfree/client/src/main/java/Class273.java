import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class273 {

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "Lclient!mf;")
	private Class222 aClass222_46 = new Class222(128);

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "Lclient!mf;")
	public Class222 aClass222_47 = new Class222(64);

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "Lclient!pu;")
	public final Class270 aClass270_89;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "Lclient!pu;")
	private final Class270 aClass270_90;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;)V")
	public Class273(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		this.aClass270_89 = arg3;
		this.aClass270_90 = arg2;
		this.aClass270_90.method5685(36);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public void method5836() {
		@Pc(2) Class222 local2 = this.aClass222_46;
		synchronized (this.aClass222_46) {
			this.aClass222_46.method4422();
		}
		local2 = this.aClass222_47;
		synchronized (this.aClass222_47) {
			this.aClass222_47.method4422();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V")
	public void method5839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass222_46 = new Class222(arg0);
		this.aClass222_47 = new Class222(arg1);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BI)Lclient!sp;")
	public Class310 method5840(@OriginalArg(1) int arg0) {
		@Pc(14) Class222 local14 = this.aClass222_46;
		@Pc(24) Class310 local24;
		synchronized (this.aClass222_46) {
			local24 = (Class310) this.aClass222_46.method4430((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class270 local37 = this.aClass270_90;
		@Pc(46) byte[] local46;
		synchronized (this.aClass270_90) {
			local46 = this.aClass270_90.method5704(36, arg0);
		}
		local24 = new Class310();
		local24.aClass273_4 = this;
		local24.anInt8106 = arg0;
		if (local46 != null) {
			local24.method6539(new Class1_Sub35(local46));
		}
		local24.method6540();
		@Pc(77) Class222 local77 = this.aClass222_46;
		synchronized (this.aClass222_46) {
			this.aClass222_46.method4434(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)V")
	public void method5841() {
		@Pc(2) Class222 local2 = this.aClass222_46;
		synchronized (this.aClass222_46) {
			this.aClass222_46.method4428();
		}
		local2 = this.aClass222_47;
		synchronized (this.aClass222_47) {
			this.aClass222_47.method4428();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZI)V")
	public void method5842() {
		@Pc(6) Class222 local6 = this.aClass222_46;
		synchronized (this.aClass222_46) {
			this.aClass222_46.method4433(5);
		}
		local6 = this.aClass222_47;
		synchronized (this.aClass222_47) {
			this.aClass222_47.method4433(5);
		}
	}
}
