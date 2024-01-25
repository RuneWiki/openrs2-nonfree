import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class160 {

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	private volatile int anInt4261;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "Lclient!ht;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Lclient!li;")
	private final Class209 aClass209_1 = new Class209();

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class160(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!um;B)V")
	public void method3426(@OriginalArg(0) Class8_Sub10 arg0) {
		@Pc(6) Class209 local6 = this.aClass209_1;
		synchronized (this.aClass209_1) {
			this.aClass209_1.method4190(arg0);
			this.anInt4261++;
		}
		if (this.aClass144_1 != null) {
			@Pc(37) Class144 local37 = this.aClass144_1;
			synchronized (this.aClass144_1) {
				this.aClass144_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!rga;I)V")
	public void method3427(@OriginalArg(0) Class8_Sub3 arg0) {
		arg0.aBoolean730 = false;
		@Pc(16) Class209 local16 = this.aClass209_1;
		synchronized (this.aClass209_1) {
			this.aClass209_1.method4190(arg0);
			this.anInt4261++;
		}
		if (this.aClass144_1 != null) {
			@Pc(41) Class144 local41 = this.aClass144_1;
			synchronized (this.aClass144_1) {
				this.aClass144_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!ht;)V")
	public void method3428(@OriginalArg(1) Class144 arg0) {
		this.aClass144_1 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Lclient!qp;")
	public Class8 method3429() {
		@Pc(8) Class209 local8 = this.aClass209_1;
		synchronized (this.aClass209_1) {
			@Pc(15) Class8 local15 = this.aClass209_1.method4194();
			local15.method7615();
			this.anInt4261--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	public boolean method3432() {
		return this.anInt4261 == 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!rga;)V")
	public void method3433(@OriginalArg(1) Class8_Sub3 arg0) {
		arg0.aBoolean730 = true;
		@Pc(15) Class209 local15 = this.aClass209_1;
		synchronized (this.aClass209_1) {
			this.aClass209_1.method4190(arg0);
			this.anInt4261++;
		}
		if (this.aClass144_1 != null) {
			@Pc(40) Class144 local40 = this.aClass144_1;
			synchronized (this.aClass144_1) {
				this.aClass144_1.notify();
			}
		}
	}
}
