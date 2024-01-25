import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class243 {

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "Lclient!gv;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	private volatile int anInt7794;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!gt;")
	private final Class123 aClass123_9 = new Class123();

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class243(@OriginalArg(0) String arg0) {
		this.aString77 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!rr;I)V")
	public void method6453(@OriginalArg(0) Class15_Sub1 arg0) {
		arg0.aBoolean742 = false;
		@Pc(9) Class123 local9 = this.aClass123_9;
		synchronized (this.aClass123_9) {
			this.aClass123_9.method3539(arg0);
			this.anInt7794++;
		}
		if (this.aClass124_1 != null) {
			@Pc(40) Class124 local40 = this.aClass124_1;
			synchronized (this.aClass124_1) {
				this.aClass124_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!gv;)V")
	public void method6454(@OriginalArg(1) Class124 arg0) {
		this.aClass124_1 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!eha;)V")
	public void method6455(@OriginalArg(1) Class15_Sub4 arg0) {
		@Pc(9) Class123 local9 = this.aClass123_9;
		synchronized (this.aClass123_9) {
			this.aClass123_9.method3539(arg0);
			this.anInt7794++;
		}
		if (this.aClass124_1 != null) {
			@Pc(38) Class124 local38 = this.aClass124_1;
			synchronized (this.aClass124_1) {
				this.aClass124_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Z")
	public boolean method6456() {
		return this.anInt7794 == 0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Lclient!tm;")
	public Class15 method6458() {
		@Pc(8) Class123 local8 = this.aClass123_9;
		synchronized (this.aClass123_9) {
			@Pc(15) Class15 local15 = this.aClass123_9.method3537();
			local15.method8314();
			this.anInt7794--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!rr;)V")
	public void method6459(@OriginalArg(1) Class15_Sub1 arg0) {
		arg0.aBoolean742 = true;
		@Pc(9) Class123 local9 = this.aClass123_9;
		synchronized (this.aClass123_9) {
			this.aClass123_9.method3539(arg0);
			this.anInt7794++;
		}
		if (this.aClass124_1 != null) {
			@Pc(38) Class124 local38 = this.aClass124_1;
			synchronized (this.aClass124_1) {
				this.aClass124_1.notify();
			}
		}
	}
}
