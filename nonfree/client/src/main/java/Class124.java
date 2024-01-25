import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class124 {

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!gu;")
	private Class127 aClass127_1;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private volatile int anInt3481;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!hf;")
	private final Class136 aClass136_6 = new Class136();

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString29;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class124(@OriginalArg(0) String arg0) {
		this.aString29 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
	public boolean method3119() {
		return this.anInt3481 == 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method3120(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(2) Class136 local2 = this.aClass136_6;
		synchronized (this.aClass136_6) {
			this.aClass136_6.method3289(arg0);
			this.anInt3481++;
		}
		if (this.aClass127_1 != null) {
			@Pc(35) Class127 local35 = this.aClass127_1;
			synchronized (this.aClass127_1) {
				this.aClass127_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ub;B)V")
	public void method3121(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.aBoolean697 = true;
		@Pc(13) Class136 local13 = this.aClass136_6;
		synchronized (this.aClass136_6) {
			this.aClass136_6.method3289(arg0);
			this.anInt3481++;
		}
		if (this.aClass127_1 != null) {
			@Pc(38) Class127 local38 = this.aClass127_1;
			synchronized (this.aClass127_1) {
				this.aClass127_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLclient!ub;)V")
	public void method3123(@OriginalArg(1) Class1_Sub4 arg0) {
		arg0.aBoolean697 = false;
		@Pc(9) Class136 local9 = this.aClass136_6;
		synchronized (this.aClass136_6) {
			this.aClass136_6.method3289(arg0);
			this.anInt3481++;
		}
		if (this.aClass127_1 != null) {
			@Pc(34) Class127 local34 = this.aClass127_1;
			synchronized (this.aClass127_1) {
				this.aClass127_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!gu;Z)V")
	public void method3124(@OriginalArg(0) Class127 arg0) {
		this.aClass127_1 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Lclient!sj;")
	public Class1 method3125() {
		@Pc(16) Class136 local16 = this.aClass136_6;
		synchronized (this.aClass136_6) {
			@Pc(23) Class1 local23 = this.aClass136_6.method3288();
			local23.method8252();
			this.anInt3481--;
			return local23;
		}
	}
}
