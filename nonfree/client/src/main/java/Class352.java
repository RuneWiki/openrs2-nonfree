import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class352 {

	@OriginalMember(owner = "client!vba", name = "m", descriptor = "Lclient!tw;")
	private Class334 aClass334_1;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
	private volatile int anInt9923;

	@OriginalMember(owner = "client!vba", name = "j", descriptor = "Lclient!eia;")
	private final Class81 aClass81_9 = new Class81();

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString111;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class352(@OriginalArg(0) String arg0) {
		this.aString111 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!vs;B)V")
	public void method8364(@OriginalArg(0) Class20_Sub2 arg0) {
		arg0.aBoolean728 = false;
		@Pc(15) Class81 local15 = this.aClass81_9;
		synchronized (this.aClass81_9) {
			this.aClass81_9.method2119(arg0);
			this.anInt9923++;
		}
		if (this.aClass334_1 != null) {
			@Pc(40) Class334 local40 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Lclient!gda;")
	public Class20 method8365() {
		@Pc(13) Class81 local13 = this.aClass81_9;
		synchronized (this.aClass81_9) {
			@Pc(20) Class20 local20 = this.aClass81_9.method2118();
			local20.method9004();
			this.anInt9923--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLclient!qda;)V")
	public void method8367(@OriginalArg(1) Class20_Sub9 arg0) {
		@Pc(6) Class81 local6 = this.aClass81_9;
		synchronized (this.aClass81_9) {
			this.aClass81_9.method2119(arg0);
			this.anInt9923++;
		}
		if (this.aClass334_1 != null) {
			@Pc(38) Class334 local38 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!tw;I)V")
	public void method8368(@OriginalArg(0) Class334 arg0) {
		this.aClass334_1 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Z")
	public boolean method8370() {
		return this.anInt9923 == 0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(Lclient!vs;B)V")
	public void method8372(@OriginalArg(0) Class20_Sub2 arg0) {
		arg0.aBoolean728 = true;
		@Pc(17) Class81 local17 = this.aClass81_9;
		synchronized (this.aClass81_9) {
			this.aClass81_9.method2119(arg0);
			this.anInt9923++;
		}
		if (this.aClass334_1 != null) {
			@Pc(42) Class334 local42 = this.aClass334_1;
			synchronized (this.aClass334_1) {
				this.aClass334_1.notify();
			}
		}
	}
}
