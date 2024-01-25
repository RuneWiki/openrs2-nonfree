import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class59 {

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "Lclient!waa;")
	private Class366 aClass366_1;

	@OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
	private volatile int anInt2238;

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "Lclient!tca;")
	private final Class325 aClass325_1 = new Class325();

	@OriginalMember(owner = "client!cia", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class59(@OriginalArg(0) String arg0) {
		this.aString15 = arg0;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!ga;Z)V")
	public void method2121(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.aBoolean705 = false;
		@Pc(9) Class325 local9 = this.aClass325_1;
		synchronized (this.aClass325_1) {
			this.aClass325_1.method8013(arg0);
			this.anInt2238++;
		}
		if (this.aClass366_1 != null) {
			@Pc(34) Class366 local34 = this.aClass366_1;
			synchronized (this.aClass366_1) {
				this.aClass366_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!waa;B)V")
	public void method2124(@OriginalArg(0) Class366 arg0) {
		this.aClass366_1 = arg0;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!vo;I)V")
	public void method2127(@OriginalArg(0) Class3_Sub10 arg0) {
		@Pc(9) Class325 local9 = this.aClass325_1;
		synchronized (this.aClass325_1) {
			this.aClass325_1.method8013(arg0);
			this.anInt2238++;
		}
		if (this.aClass366_1 != null) {
			@Pc(38) Class366 local38 = this.aClass366_1;
			synchronized (this.aClass366_1) {
				this.aClass366_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)Z")
	public boolean method2128() {
		return this.anInt2238 == 0;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILclient!ga;)V")
	public void method2129(@OriginalArg(1) Class3_Sub1 arg0) {
		arg0.aBoolean705 = true;
		@Pc(9) Class325 local9 = this.aClass325_1;
		synchronized (this.aClass325_1) {
			this.aClass325_1.method8013(arg0);
			this.anInt2238++;
		}
		if (this.aClass366_1 != null) {
			@Pc(40) Class366 local40 = this.aClass366_1;
			synchronized (this.aClass366_1) {
				this.aClass366_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)Lclient!cm;")
	public Class3 method2130() {
		@Pc(8) Class325 local8 = this.aClass325_1;
		synchronized (this.aClass325_1) {
			@Pc(22) Class3 local22 = this.aClass325_1.method8016();
			local22.method8909();
			this.anInt2238--;
			return local22;
		}
	}
}
