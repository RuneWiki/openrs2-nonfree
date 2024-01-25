import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class175 {

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	private volatile int anInt4632;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "Lclient!ls;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!fa;")
	private final Class99 aClass99_5 = new Class99();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class175(@OriginalArg(0) String arg0) {
		this.aString48 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ov;I)V")
	public void method4187(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.aBoolean732 = false;
		@Pc(13) Class99 local13 = this.aClass99_5;
		synchronized (this.aClass99_5) {
			this.aClass99_5.method2039(arg0);
			this.anInt4632++;
		}
		if (this.aClass220_1 != null) {
			@Pc(38) Class220 local38 = this.aClass220_1;
			synchronized (this.aClass220_1) {
				this.aClass220_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!fu;")
	public Class4 method4189() {
		@Pc(8) Class99 local8 = this.aClass99_5;
		synchronized (this.aClass99_5) {
			@Pc(15) Class4 local15 = this.aClass99_5.method2045();
			local15.method8713();
			this.anInt4632--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!faa;B)V")
	public void method4190(@OriginalArg(0) Class4_Sub5 arg0) {
		@Pc(13) Class99 local13 = this.aClass99_5;
		synchronized (this.aClass99_5) {
			this.aClass99_5.method2039(arg0);
			this.anInt4632++;
		}
		if (this.aClass220_1 != null) {
			@Pc(38) Class220 local38 = this.aClass220_1;
			synchronized (this.aClass220_1) {
				this.aClass220_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lclient!ov;I)V")
	public void method4191(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.aBoolean732 = true;
		@Pc(9) Class99 local9 = this.aClass99_5;
		synchronized (this.aClass99_5) {
			this.aClass99_5.method2039(arg0);
			this.anInt4632++;
		}
		if (this.aClass220_1 != null) {
			@Pc(41) Class220 local41 = this.aClass220_1;
			synchronized (this.aClass220_1) {
				this.aClass220_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Z")
	public boolean method4192() {
		return this.anInt4632 == 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ls;B)V")
	public void method4193(@OriginalArg(0) Class220 arg0) {
		this.aClass220_1 = arg0;
	}
}
