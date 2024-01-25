import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class119 {

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
	private volatile int anInt3858;

	@OriginalMember(owner = "client!gda", name = "n", descriptor = "Lclient!rh;")
	private Class314 aClass314_1;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Lclient!cp;")
	private final Class60 aClass60_6 = new Class60();

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString41;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class119(@OriginalArg(0) String arg0) {
		this.aString41 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILclient!nfa;)V")
	public void method3564(@OriginalArg(1) Class15_Sub3 arg0) {
		arg0.aBoolean790 = false;
		@Pc(9) Class60 local9 = this.aClass60_6;
		synchronized (this.aClass60_6) {
			this.aClass60_6.method1551(arg0);
			this.anInt3858++;
		}
		if (this.aClass314_1 != null) {
			@Pc(34) Class314 local34 = this.aClass314_1;
			synchronized (this.aClass314_1) {
				this.aClass314_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLclient!nfa;)V")
	public void method3565(@OriginalArg(1) Class15_Sub3 arg0) {
		arg0.aBoolean790 = true;
		@Pc(9) Class60 local9 = this.aClass60_6;
		synchronized (this.aClass60_6) {
			this.aClass60_6.method1551(arg0);
			this.anInt3858++;
		}
		if (this.aClass314_1 != null) {
			@Pc(34) Class314 local34 = this.aClass314_1;
			synchronized (this.aClass314_1) {
				this.aClass314_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!ca;I)V")
	public void method3566(@OriginalArg(0) Class15_Sub4 arg0) {
		@Pc(2) Class60 local2 = this.aClass60_6;
		synchronized (this.aClass60_6) {
			this.aClass60_6.method1551(arg0);
			this.anInt3858++;
		}
		if (this.aClass314_1 != null) {
			@Pc(39) Class314 local39 = this.aClass314_1;
			synchronized (this.aClass314_1) {
				this.aClass314_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!rh;I)V")
	public void method3567(@OriginalArg(0) Class314 arg0) {
		this.aClass314_1 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Lclient!jda;")
	public Class15 method3571() {
		@Pc(13) Class60 local13 = this.aClass60_6;
		synchronized (this.aClass60_6) {
			@Pc(20) Class15 local20 = this.aClass60_6.method1547();
			local20.method9741();
			this.anInt3858--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)Z")
	public boolean method3572() {
		return this.anInt3858 == 0;
	}
}
