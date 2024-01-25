import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class283 {

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	private volatile int anInt7396;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!qn;")
	private Class298 aClass298_1;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!saa;")
	private final Class317 aClass317_9 = new Class317();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString93;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class283(@OriginalArg(0) String arg0) {
		this.aString93 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lclient!via;")
	public Class34 method6198() {
		@Pc(8) Class317 local8 = this.aClass317_9;
		synchronized (this.aClass317_9) {
			@Pc(15) Class34 local15 = this.aClass317_9.method6891();
			local15.method8764();
			this.anInt7396--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!fq;I)V")
	public void method6199(@OriginalArg(0) Class34_Sub1 arg0) {
		arg0.aBoolean670 = false;
		@Pc(15) Class317 local15 = this.aClass317_9;
		synchronized (this.aClass317_9) {
			this.aClass317_9.method6890(arg0);
			this.anInt7396++;
		}
		if (this.aClass298_1 != null) {
			@Pc(40) Class298 local40 = this.aClass298_1;
			synchronized (this.aClass298_1) {
				this.aClass298_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method6200(@OriginalArg(0) Class34_Sub5 arg0) {
		@Pc(6) Class317 local6 = this.aClass317_9;
		synchronized (this.aClass317_9) {
			this.aClass317_9.method6890(arg0);
			this.anInt7396++;
		}
		if (this.aClass298_1 != null) {
			@Pc(37) Class298 local37 = this.aClass298_1;
			synchronized (this.aClass298_1) {
				this.aClass298_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Z")
	public boolean method6201() {
		return this.anInt7396 == 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!qn;)V")
	public void method6202(@OriginalArg(1) Class298 arg0) {
		this.aClass298_1 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!fq;B)V")
	public void method6203(@OriginalArg(0) Class34_Sub1 arg0) {
		arg0.aBoolean670 = true;
		@Pc(17) Class317 local17 = this.aClass317_9;
		synchronized (this.aClass317_9) {
			this.aClass317_9.method6890(arg0);
			this.anInt7396++;
		}
		if (this.aClass298_1 != null) {
			@Pc(42) Class298 local42 = this.aClass298_1;
			synchronized (this.aClass298_1) {
				this.aClass298_1.notify();
			}
		}
	}
}
